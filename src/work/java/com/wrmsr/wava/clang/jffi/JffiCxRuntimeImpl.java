/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wrmsr.wava.clang.jffi;

import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.kenai.jffi.Function;
import com.kenai.jffi.HeapInvocationBuffer;
import com.kenai.jffi.Invoker;
import com.kenai.jffi.Library;
import com.kenai.jffi.MemoryIO;
import com.kenai.jffi.Type;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static com.google.common.base.Preconditions.checkState;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static java.util.Objects.requireNonNull;

final class JffiCxRuntimeImpl
        extends JffiCxRuntime
{
    final Invoker invoker;
    final MemoryIO memoryIO;
    final Library library;
    final LibClang libClang;

    private final List<TypeAdapter.Factory> typeAdapterFactories = new ArrayList<>();

    JffiCxRuntimeImpl(Invoker invoker, MemoryIO memoryIO, Library library)
    {
        this.invoker = requireNonNull(invoker);
        this.memoryIO = requireNonNull(memoryIO);
        this.library = requireNonNull(library);

        typeAdapterFactories.addAll(buildDefaultTypeAdapterFactories());

        libClang = LibClang.class.cast(
                Proxy.newProxyInstance(LibClang.class.getClassLoader(),
                        new Class[] {LibClang.class},
                        new NativeInvocationHandler()));
    }

    @Override
    public LibClang getLibClang()
    {
        return libClang;
    }

    @Override
    public void close()
            throws Exception
    {
    }

    interface TypeAdapter
    {
        @FunctionalInterface
        interface Factory
        {
            Optional<TypeAdapter> create(Class cls);

            final class Impl
                    implements TypeAdapter.Factory
            {
                private final Predicate<Class> classPredicate;
                private final TypeAdapter typeAdapter;

                public Impl(Predicate<Class> classPredicate, TypeAdapter typeAdapter)
                {
                    this.classPredicate = classPredicate;
                    this.typeAdapter = typeAdapter;
                }

                @Override
                public Optional<TypeAdapter> create(Class cls)
                {
                    if (classPredicate.test(cls)) {
                        return Optional.of(typeAdapter);
                    }
                    else {
                        return Optional.empty();
                    }
                }
            }
        }

        Type getType();

        void push(Object value, HeapInvocationBuffer buffer);

        Object invoke(Function function, HeapInvocationBuffer buffer);

        final class Impl
                implements TypeAdapter
        {
            private final Type type;
            private final BiConsumer<Object, HeapInvocationBuffer> pusher;
            private final BiFunction<Function, HeapInvocationBuffer, Object> invoker;

            private Impl(Type type, BiConsumer<Object, HeapInvocationBuffer> pusher, BiFunction<Function, HeapInvocationBuffer, Object> invoker)
            {
                this.type = requireNonNull(type);
                this.pusher = requireNonNull(pusher);
                this.invoker = requireNonNull(invoker);
            }

            @Override
            public Type getType()
            {
                return type;
            }

            @Override
            public void push(Object value, HeapInvocationBuffer buffer)
            {
                pusher.accept(value, buffer);
            }

            @Override
            public Object invoke(Function function, HeapInvocationBuffer buffer)
            {
                return invoker.apply(function, buffer);
            }
        }
    }

    @SuppressWarnings("UnnecessaryBoxing")
    private List<TypeAdapter.Factory> buildDefaultTypeAdapterFactories()
    {
        ImmutableList.Builder<TypeAdapter.Factory> builder = ImmutableList.builder();

        builder.add(
                new TypeAdapter.Factory.Impl(
                        ImmutableSet.of(void.class, Void.class)::contains,
                        new TypeAdapter.Impl(
                                Type.VOID,
                                (value, buffer) -> {
                                    throw new UnsupportedOperationException();
                                },
                                invoker::invokeInt)));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        String.class::equals,
                        new TypeAdapter.Impl(
                                Type.POINTER,
                                (value, buffer) -> {
                                    throw new UnsupportedOperationException();
                                },
                                (function, buffer) -> {
                                    long address = invoker.invokeAddress(function, buffer);
                                    byte[] bytes = memoryIO.getZeroTerminatedByteArray(address);
                                    return new String(bytes);
                                })));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        ImmutableSet.of(byte.class, Byte.class)::contains,
                        new TypeAdapter.Impl(
                                Type.SINT8,
                                (value, buffer) -> buffer.putByte(((Number) value).intValue()),
                                (function, buffer) -> Byte.valueOf((byte) invoker.invokeInt(function, buffer)))));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        ImmutableSet.of(short.class, Short.class)::contains,
                        new TypeAdapter.Impl(
                                Type.SINT16,
                                (value, buffer) -> buffer.putShort(((Number) value).intValue()),
                                (function, buffer) -> Short.valueOf((short) invoker.invokeInt(function, buffer)))));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        ImmutableSet.of(int.class, Integer.class)::contains,
                        new TypeAdapter.Impl(
                                Type.SINT32,
                                (value, buffer) -> buffer.putInt(((Number) value).intValue()),
                                (function, buffer) -> Integer.valueOf((int) invoker.invokeInt(function, buffer)))));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        ImmutableSet.of(long.class, Long.class)::contains,
                        new TypeAdapter.Impl(
                                Type.SINT64,
                                (value, buffer) -> buffer.putLong(((Number) value).intValue()),
                                (function, buffer) -> Long.valueOf((long) invoker.invokeLong(function, buffer)))));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        ImmutableSet.of(float.class, Float.class)::contains,
                        new TypeAdapter.Impl(
                                Type.FLOAT,
                                (value, buffer) -> buffer.putFloat(((Number) value).floatValue()),
                                (function, buffer) -> Float.valueOf((byte) invoker.invokeFloat(function, buffer)))));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        ImmutableSet.of(double.class, Double.class)::contains,
                        new TypeAdapter.Impl(
                                Type.DOUBLE,
                                (value, buffer) -> buffer.putDouble(((Number) value).doubleValue()),
                                (function, buffer) -> Double.valueOf((byte) invoker.invokeDouble(function, buffer)))));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        BigDecimal.class::isAssignableFrom,
                        new TypeAdapter.Impl(
                                Type.LONGDOUBLE,
                                (value, buffer) -> buffer.putLongDouble(BigDecimal.class.cast(value)),
                                invoker::invokeBigDecimal)));

        builder.add(buildStructTypeAdapterFactory(JffiCxCursor.DESCRIPTOR));
        builder.add(buildPointerTypeAdapterFactory(JffiCxIndex.DESCRIPTOR));
        builder.add(buildStructTypeAdapterFactory(JffiCxString.DESCRIPTOR));
        builder.add(buildPointerTypeAdapterFactory(JffiCxTranslationUnit.DESCRIPTOR));

        builder.add(cls -> {
            if (Enum.class.isAssignableFrom(cls) && IntSupplier.class.isAssignableFrom(cls)) {
                Map byValue;
                try {
                    byValue = (Map) cls.getDeclaredField("BY_VALUE").get(null);
                }
                catch (ReflectiveOperationException e) {
                    throw Throwables.propagate(e);
                }
                TypeAdapter typeAdapter = new TypeAdapter.Impl(
                        Type.SINT,
                        (value, buffer) -> buffer.putInt(((IntSupplier) value).getAsInt()),
                        (function, buffer) -> {
                            int value = invoker.invokeInt(function, buffer);
                            return requireNonNull(byValue.get(value));
                        });
                return Optional.of(typeAdapter);
            }
            else {
                return Optional.empty();
            }
        });

        return builder.build();
    }

    private TypeAdapter.Factory buildStructTypeAdapterFactory(JffiStruct.Descriptor<?> descriptor)
    {
        return cls -> {
            if (cls == descriptor.cls) {
                TypeAdapter typeAdapter = new TypeAdapter.Impl(
                        descriptor.struct,
                        (value, buffer) -> buffer.putStruct(((JffiStruct) value).struct, 0),
                        (function, buffer) -> {
                            byte[] struct = invoker.invokeStruct(function, buffer);
                            return descriptor.constructor.apply(JffiCxRuntimeImpl.this, struct);
                        });
                return Optional.of(typeAdapter);
            }
            else {
                return Optional.empty();
            }
        };
    }

    private TypeAdapter.Factory buildPointerTypeAdapterFactory(JffiPointer.Descriptor<?> descriptor)
    {
        return cls -> {
            if (cls == descriptor.cls) {
                TypeAdapter typeAdapter = new TypeAdapter.Impl(
                        Type.POINTER,
                        (value, buffer) -> buffer.putAddress(((JffiPointer) value).address),
                        (function, buffer) -> {
                            long address = invoker.invokeAddress(function, buffer);
                            return descriptor.constructor.apply(JffiCxRuntimeImpl.this, address);
                        });
                return Optional.of(typeAdapter);
            }
            else {
                return Optional.empty();
            }
        };
    }

    private TypeAdapter getTypeAdapter(Class cls)
    {
        for (TypeAdapter.Factory typeAdapterFactory : typeAdapterFactories) {
            Optional<TypeAdapter> typeAdapter = typeAdapterFactory.create(cls);
            if (typeAdapter.isPresent()) {
                return typeAdapter.get();
            }
        }
        throw new UnsupportedOperationException();
    }

    @FunctionalInterface
    private interface MethodInvoker
    {
        Object invoke(Object[] args);
    }

    private final class NativeInvocationHandler
            implements InvocationHandler
    {
        private final ConcurrentMap<Method, MethodInvoker> invokers = new ConcurrentHashMap<>();

        @Override
        public Object invoke(Object self, Method method, Object[] argArray)
                throws Throwable
        {
            return getMethodInvoker(method).invoke(argArray);
        }

        private MethodInvoker getMethodInvoker(Method method)
        {
            MethodInvoker invoker = invokers.get(method);
            if (invoker != null) {
                return invoker;
            }

            TypeAdapter returnType = getTypeAdapter(method.getReturnType());
            List<TypeAdapter> parameterTypes = Stream.of(method.getParameterTypes())
                    .map(JffiCxRuntimeImpl.this::getTypeAdapter)
                    .collect(toImmutableList());

            final long address = library.getSymbolAddress(method.getName());
            if (address == 0) {
                throw new UnsatisfiedLinkError(String.format("Could not locate '%s': %s", method.getName(), Library.getLastError()));
            }

            Function function = new Function(
                    address,
                    returnType.getType(),
                    parameterTypes.stream()
                            .map(TypeAdapter::getType)
                            .toArray(Type[]::new));

            invoker = args -> {
                HeapInvocationBuffer buffer = new HeapInvocationBuffer(function);
                checkState((parameterTypes.size() == 0 && args == null) || (parameterTypes.size() == args.length));
                for (int i = 0; i < parameterTypes.size(); ++i) {
                    parameterTypes.get(i).push(args[i], buffer);
                }
                return returnType.invoke(function, buffer);
            };

            invokers.put(method, invoker);

            return invoker;
        }
    }
}
