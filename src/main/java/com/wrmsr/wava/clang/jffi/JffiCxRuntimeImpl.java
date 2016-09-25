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
import com.kenai.jffi.CallingConvention;
import com.kenai.jffi.Closure;
import com.kenai.jffi.ClosureManager;
import com.kenai.jffi.Function;
import com.kenai.jffi.HeapInvocationBuffer;
import com.kenai.jffi.Invoker;
import com.kenai.jffi.Library;
import com.kenai.jffi.MemoryIO;
import com.kenai.jffi.Type;
import com.wrmsr.wava.util.Buffers;
import jnr.posix.POSIX;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static com.google.common.base.Preconditions.checkState;
import static com.wrmsr.wava.clang.jffi.JffiUtils.Address;
import static com.wrmsr.wava.clang.jffi.JffiUtils.ByteBufferParameterBuffer;
import static com.wrmsr.wava.clang.jffi.JffiUtils.HeapInvocationBufferParameterBuffer;
import static com.wrmsr.wava.clang.jffi.JffiUtils.ParameterBuffer;
import static com.wrmsr.wava.util.Buffers.cleanBuffer;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static com.wrmsr.wava.util.function.Bind.bind;
import static java.util.Objects.requireNonNull;

final class JffiCxRuntimeImpl
        extends JffiCxRuntime
{
    static final String DISABLE_CRASH_HANDLER_ENVVAR = "LIBCLANG_DISABLE_CRASH_RECOVERY";

    final POSIX posix;
    final Invoker invoker;
    final MemoryIO memoryIO;
    final ClosureManager closureManager;
    final Library library;

    final LibClang libClang;

    private final List<TypeAdapter.Factory> typeAdapterFactories = new ArrayList<>();

    JffiCxRuntimeImpl(POSIX posix, Invoker invoker, MemoryIO memoryIO, ClosureManager closureManager, Library library)
    {
        this.posix = requireNonNull(posix);
        this.invoker = requireNonNull(invoker);
        this.memoryIO = requireNonNull(memoryIO);
        this.closureManager = requireNonNull(closureManager);
        this.library = requireNonNull(library);

        typeAdapterFactories.addAll(buildDefaultTypeAdapterFactories());

        libClang = LibClang.class.cast(
                Proxy.newProxyInstance(
                        LibClang.class.getClassLoader(),
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

    @Override
    void disableCrashHandler()
    {
        // https://reviews.llvm.org/D23662 :(
        posix.setenv(DISABLE_CRASH_HANDLER_ENVVAR, "1", 1);
    }

    private interface TypeAdapter
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

                Impl(Predicate<Class> classPredicate, TypeAdapter typeAdapter)
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

        boolean isPrimitivePush();

        Object push(Object value, ParameterBuffer buffer, Supplier<Object> next);

        Object unpush(ParameterBuffer buffer);

        Object invoke(Function function, HeapInvocationBuffer buffer);

        final class Impl
                implements TypeAdapter
        {
            @FunctionalInterface
            interface Pusher
            {
                Object push(Object value, ParameterBuffer buffer, Supplier<Object> next);
            }

            @FunctionalInterface
            interface Unpusher
            {
                Object unpush(ParameterBuffer buffer);
            }

            private final Type type;
            private final boolean isPrimitivePush; // WTB TCO :|
            private final Pusher pusher;
            private final Unpusher unpusher;
            private final BiFunction<Function, HeapInvocationBuffer, Object> invoker;

            Impl(Type type, boolean isPrimitivePush, Pusher pusher, Unpusher unpusher, BiFunction<Function, HeapInvocationBuffer, Object> invoker)
            {
                this.type = requireNonNull(type);
                this.isPrimitivePush = isPrimitivePush;
                this.pusher = requireNonNull(pusher);
                this.unpusher = requireNonNull(unpusher);
                this.invoker = requireNonNull(invoker);
            }

            Impl(Type type, BiConsumer<Object, ParameterBuffer> pusher, Unpusher unpusher, BiFunction<Function, HeapInvocationBuffer, Object> invoker)
            {
                this(
                        type,
                        true,
                        (value, buffer, next) -> {
                            pusher.accept(value, buffer);
                            return next.get();
                        },
                        unpusher,
                        invoker);
            }

            @Override
            public Type getType()
            {
                return type;
            }

            @Override
            public boolean isPrimitivePush()
            {
                return isPrimitivePush;
            }

            @Override
            public Object push(Object value, ParameterBuffer buffer, Supplier<Object> next)
            {
                return pusher.push(value, buffer, next);
            }

            @Override
            public Object unpush(ParameterBuffer buffer)
            {
                return unpusher.unpush(buffer);
            }

            @Override
            public Object invoke(Function function, HeapInvocationBuffer buffer)
            {
                return invoker.apply(function, buffer);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Enum<T>> T forceCastEnum(Object obj)
    {
        return (T) obj;
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
                                buffer -> {
                                    throw new UnsupportedOperationException();
                                },
                                invoker::invokeInt)));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        String.class::equals,
                        new TypeAdapter.Impl(
                                Type.POINTER,
                                false,
                                (value, buffer, next) -> {
                                    if (value == null) {
                                        buffer.putAddress(0);
                                        return next.get();
                                    }
                                    else {
                                        byte[] bytes = ((String) value).getBytes();
                                        long address = memoryIO.allocateMemory(bytes.length + 1, false);
                                        checkState(address != 0, "allocation failed");
                                        try {
                                            memoryIO.putByteArray(address, bytes, 0, bytes.length);
                                            memoryIO.putByte(address + bytes.length, (byte) 0);
                                            buffer.putAddress(address);
                                            return next.get();
                                        }
                                        finally {
                                            memoryIO.freeMemory(address);
                                        }
                                    }
                                },
                                buffer -> {
                                    long address = buffer.getAddress();
                                    if (address == 0) {
                                        return null;
                                    }
                                    else {
                                        byte[] bytes = memoryIO.getZeroTerminatedByteArray(address);
                                        return new String(bytes);
                                    }
                                },
                                (function, buffer) -> {
                                    long address = invoker.invokeAddress(function, buffer);
                                    byte[] bytes = memoryIO.getZeroTerminatedByteArray(address);
                                    return new String(bytes);
                                })));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        ImmutableSet.of(boolean.class, Boolean.class)::contains,
                        new TypeAdapter.Impl(
                                Type.SINT32,
                                (value, buffer) -> buffer.putInt(((Boolean) value).booleanValue() ? 1 : 0),
                                buffer -> buffer.getInt() != 0,
                                (function, buffer) -> invoker.invokeInt(function, buffer) != 0)));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        ImmutableSet.of(byte.class, Byte.class)::contains,
                        new TypeAdapter.Impl(
                                Type.SINT8,
                                (value, buffer) -> buffer.putByte(((Number) value).byteValue()),
                                ParameterBuffer::getByte,
                                (function, buffer) -> Byte.valueOf((byte) invoker.invokeInt(function, buffer)))));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        ImmutableSet.of(short.class, Short.class)::contains,
                        new TypeAdapter.Impl(
                                Type.SINT16,
                                (value, buffer) -> buffer.putShort(((Number) value).shortValue()),
                                ParameterBuffer::getShort,
                                (function, buffer) -> Short.valueOf((short) invoker.invokeInt(function, buffer)))));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        ImmutableSet.of(int.class, Integer.class)::contains,
                        new TypeAdapter.Impl(
                                Type.SINT32,
                                (value, buffer) -> buffer.putInt(((Number) value).intValue()),
                                ParameterBuffer::getInt,
                                (function, buffer) -> Integer.valueOf(invoker.invokeInt(function, buffer)))));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        ImmutableSet.of(long.class, Long.class)::contains,
                        new TypeAdapter.Impl(
                                Type.SINT64,
                                (value, buffer) -> buffer.putLong(((Number) value).intValue()),
                                ParameterBuffer::getLong,
                                (function, buffer) -> Long.valueOf(invoker.invokeLong(function, buffer)))));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        ImmutableSet.of(float.class, Float.class)::contains,
                        new TypeAdapter.Impl(
                                Type.FLOAT,
                                (value, buffer) -> buffer.putFloat(((Number) value).floatValue()),
                                ParameterBuffer::getFloat,
                                (function, buffer) -> Float.valueOf(invoker.invokeFloat(function, buffer)))));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        ImmutableSet.of(double.class, Double.class)::contains,
                        new TypeAdapter.Impl(
                                Type.DOUBLE,
                                (value, buffer) -> buffer.putDouble(((Number) value).doubleValue()),
                                ParameterBuffer::getDouble,
                                (function, buffer) -> Double.valueOf(invoker.invokeDouble(function, buffer)))));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        BigDecimal.class::isAssignableFrom,
                        new TypeAdapter.Impl(
                                Type.LONGDOUBLE,
                                (value, buffer) -> ((HeapInvocationBufferParameterBuffer) buffer).heapInvocationBuffer.putLongDouble(BigDecimal.class.cast(value)),
                                buffer -> {
                                    throw new UnsupportedOperationException();
                                },
                                invoker::invokeBigDecimal)));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        Address.class::equals,
                        new TypeAdapter.Impl(
                                Type.POINTER,
                                (value, buffer) -> buffer.putAddress(((Address) value).longValue()),
                                buffer -> new Address(buffer.getLong()),
                                invoker::invokeAddress)));

        builder.add(
                cls -> {
                    if (cls.isArray()) {
                        TypeAdapter componentAdapter = getTypeAdapter(cls.getComponentType());
                        return Optional.of(
                                new TypeAdapter.Impl(
                                        Type.POINTER,
                                        false,
                                        (value, buffer, next) -> {
                                            if (value == null) {
                                                buffer.putAddress(0);
                                                return next.get();
                                            }
                                            else {
                                                int length = Array.getLength(value);
                                                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(componentAdapter.getType().size() * length);
                                                byteBuffer.order(ByteOrder.nativeOrder());
                                                try {
                                                    ByteBufferParameterBuffer parameterBuffer = new ByteBufferParameterBuffer(byteBuffer);
                                                    next = bind(
                                                            inner -> {
                                                                Object result = inner.get();
                                                                // FIXME lmao struct disposal, move ctor?
                                                                parameterBuffer.byteBuffer.flip();
                                                                for (int i = 0; i < length; ++i) {
                                                                    Array.set(value, i, componentAdapter.unpush(parameterBuffer));
                                                                }
                                                                return result;
                                                            },
                                                            next
                                                    )::apply;
                                                    for (int i = 0; i < length; ++i) {
                                                        next = bind(componentAdapter::push, Array.get(value, i), parameterBuffer, next)::apply;
                                                    }
                                                    buffer.putAddress(Buffers.getBufferAddress(byteBuffer));
                                                    return next.get();
                                                }
                                                finally {
                                                    cleanBuffer(byteBuffer);
                                                }
                                            }
                                        },
                                        buffer -> {
                                            throw new UnsupportedOperationException();
                                        },
                                        (function, buffer) -> {
                                            throw new UnsupportedOperationException();
                                        }));
                    }
                    else {
                        return Optional.empty();
                    }
                });

        JffiCxEnums.DESCRIPTORS.forEach(
                descriptor -> builder.add(
                        new TypeAdapter.Factory.Impl(
                                descriptor.cls::equals,
                                new TypeAdapter.Impl(
                                        Type.SINT,
                                        (value, buffer) -> buffer.putInt(descriptor.toInt.apply(forceCastEnum(value))),
                                        buffer -> requireNonNull(descriptor.fromInt.apply(buffer.getInt())),
                                        (function, buffer) -> {
                                            int value = invoker.invokeInt(function, buffer);
                                            return requireNonNull(descriptor.fromInt.apply(value));
                                        }))));

        JffiCxPointers.DESCRIPTORS.forEach(
                descriptor -> builder.add(
                        new TypeAdapter.Factory.Impl(
                                descriptor.cls::equals,
                                new TypeAdapter.Impl(
                                        Type.POINTER,
                                        (value, buffer) -> {
                                            if (value == null) {
                                                buffer.putAddress(0);
                                            }
                                            else {
                                                buffer.putAddress(((JffiPointer) value).address);
                                            }
                                        },
                                        buffer -> {
                                            long address = buffer.getAddress();
                                            if (address == 0) {
                                                return null;
                                            }
                                            else {
                                                return descriptor.constructor.apply(this, address);
                                            }
                                        },
                                        (function, buffer) -> {
                                            long address = invoker.invokeAddress(function, buffer);
                                            if (address == 0) {
                                                return null;
                                            }
                                            else {
                                                return descriptor.constructor.apply(this, address);
                                            }
                                        }))));

        JffiCxStructs.DESCRIPTORS.forEach(
                descriptor -> builder.add(
                        new TypeAdapter.Factory.Impl(
                                descriptor.cls::equals,
                                new TypeAdapter.Impl(
                                        descriptor.struct,
                                        (value, buffer) -> buffer.putStruct(((JffiStruct) value).struct),
                                        buffer -> {
                                            byte[] struct = buffer.getStruct(descriptor.struct.size());
                                            return descriptor.constructor.apply(this, struct);
                                        },
                                        (function, buffer) -> {
                                            byte[] struct = invoker.invokeStruct(function, buffer);
                                            return descriptor.constructor.apply(this, struct);
                                        }))));

        builder.add(
                cls -> {
                    if (cls.isInterface() && cls.getDeclaredMethods().length == 1) {
                        Method method = cls.getDeclaredMethods()[0];
                        List<TypeAdapter> parameterTypes = Stream.of(method.getParameterTypes())
                                .map(JffiCxRuntimeImpl.this::getTypeAdapter)
                                .collect(toImmutableList());
                        TypeAdapter returnType = getTypeAdapter(method.getReturnType());
                        Type[] parameterTypeArray = parameterTypes.stream()
                                .map(TypeAdapter::getType)
                                .toArray(Type[]::new);
                        return Optional.of(
                                new TypeAdapter.Impl(
                                        Type.POINTER,
                                        false,
                                        (value, buffer, next) -> {
                                            Closure.Handle handle = closureManager.newClosure(
                                                    closureBuffer -> {
                                                        ParameterBuffer parameterBuffer = new JffiUtils.ClosureBufferParameterBuffer(memoryIO, closureBuffer);
                                                        Object[] args = parameterTypes.stream()
                                                                .map(pt -> pt.unpush(parameterBuffer))
                                                                .toArray(Object[]::new);
                                                        try {
                                                            Object result = method.invoke(value, args);
                                                            returnType.push(result, parameterBuffer, () -> null);
                                                        }
                                                        catch (ReflectiveOperationException e) {
                                                            throw Throwables.propagate(e);
                                                        }
                                                    },
                                                    returnType.getType(),
                                                    parameterTypeArray,
                                                    CallingConvention.DEFAULT);
                                            try {
                                                buffer.putAddress(handle.getAddress());
                                                return next.get();
                                            }
                                            finally {
                                                handle.dispose();
                                            }
                                        },
                                        buffer -> {
                                            throw new UnsupportedOperationException();
                                        },
                                        (function, buffer) -> {
                                            throw new UnsupportedOperationException();
                                        }));
                    }
                    return Optional.empty();
                });

        return builder.build();
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
                ParameterBuffer parameterBuffer = new HeapInvocationBufferParameterBuffer(buffer);

                Supplier supplier = () -> returnType.invoke(function, buffer);
                checkState((parameterTypes.size() == 0 && args == null) || (parameterTypes.size() == args.length));
                for (int i = parameterTypes.size() - 1; i >= 0; --i) {
                    TypeAdapter parameterType = parameterTypes.get(i);
                    supplier = bind(parameterType::push, args[i], parameterBuffer, supplier)::apply;
                }

                return supplier.get();
            };

            invokers.put(method, invoker);

            return invoker;
        }
    }
}
