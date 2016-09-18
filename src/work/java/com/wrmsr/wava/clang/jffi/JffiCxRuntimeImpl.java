/*===-- clang-c/Index.h - Indexing Public C Interface -------------*- C -*-===*\
|*                                                                            *|
|*                     The LLVM Compiler Infrastructure                       *|
|*                                                                            *|
|* This file is distributed under the University of Illinois Open Source      *|
|* License. See LICENSE_LLVM for details.                                     *|
|*                                                                            *|
|*===----------------------------------------------------------------------===*|
|*                                                                            *|
|* This header provides a public interface to a Clang library for extracting  *|
|* high-level symbol information from source files without exposing the full  *|
|* Clang C++ API.                                                             *|
|*                                                                            *|
\*===----------------------------------------------------------------------===*/
package com.wrmsr.wava.clang.jffi;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.kenai.jffi.Function;
import com.kenai.jffi.HeapInvocationBuffer;
import com.kenai.jffi.InvocationBuffer;
import com.kenai.jffi.Invoker;
import com.kenai.jffi.Library;
import com.kenai.jffi.MemoryIO;
import com.kenai.jffi.Type;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
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
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static com.wrmsr.wava.util.function.Bind.bind;
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

        Object push(Object value, InvocationBuffer buffer, Supplier<Object> next);

        Object invoke(Function function, HeapInvocationBuffer buffer);

        final class Impl
                implements TypeAdapter
        {
            @FunctionalInterface
            interface Pusher
            {
                Object push(Object value, InvocationBuffer buffer, Supplier<Object> next);
            }

            private final Type type;
            private final boolean isPrimitivePush; // WTB TCO :|
            private final Pusher pusher;
            private final BiFunction<Function, HeapInvocationBuffer, Object> invoker;

            Impl(Type type, boolean isPrimitivePush, Pusher pusher, BiFunction<Function, HeapInvocationBuffer, Object> invoker)
            {
                this.type = requireNonNull(type);
                this.isPrimitivePush = isPrimitivePush;
                this.pusher = requireNonNull(pusher);
                this.invoker = requireNonNull(invoker);
            }

            Impl(Type type, BiConsumer<Object, InvocationBuffer> pusher, BiFunction<Function, HeapInvocationBuffer, Object> invoker)
            {
                this(
                        type,
                        true,
                        (value, buffer, next) -> {
                            pusher.accept(value, buffer);
                            return next.get();
                        },
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
            public Object push(Object value, InvocationBuffer buffer, Supplier<Object> next)
            {
                return pusher.push(value, buffer, next);
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
                                false,
                                (value, buffer, next) -> {
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
                                (function, buffer) -> Integer.valueOf(invoker.invokeInt(function, buffer)))));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        ImmutableSet.of(long.class, Long.class)::contains,
                        new TypeAdapter.Impl(
                                Type.SINT64,
                                (value, buffer) -> buffer.putLong(((Number) value).intValue()),
                                (function, buffer) -> Long.valueOf(invoker.invokeLong(function, buffer)))));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        ImmutableSet.of(float.class, Float.class)::contains,
                        new TypeAdapter.Impl(
                                Type.FLOAT,
                                (value, buffer) -> buffer.putFloat(((Number) value).floatValue()),
                                (function, buffer) -> Float.valueOf(invoker.invokeFloat(function, buffer)))));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        ImmutableSet.of(double.class, Double.class)::contains,
                        new TypeAdapter.Impl(
                                Type.DOUBLE,
                                (value, buffer) -> buffer.putDouble(((Number) value).doubleValue()),
                                (function, buffer) -> Double.valueOf(invoker.invokeDouble(function, buffer)))));

        builder.add(
                new TypeAdapter.Factory.Impl(
                        BigDecimal.class::isAssignableFrom,
                        new TypeAdapter.Impl(
                                Type.LONGDOUBLE,
                                (value, buffer) -> ((HeapInvocationBuffer) buffer).putLongDouble(BigDecimal.class.cast(value)),
                                invoker::invokeBigDecimal)));

        builder.add(
                cls -> {
                    if (cls.isArray()) {
                        TypeAdapter componentAdapter = getTypeAdapter(cls.getComponentType());
                        return Optional.of(
                                new TypeAdapter.Impl(
                                        Type.POINTER,
                                        false,
                                        (value, buffer, next) -> {
                                            return next.get();
                                        },
                                        (function, buffer) -> {
                                            throw new UnsupportedOperationException();
                                        }));
                    }
                    else {
                        return Optional.empty();
                    }
                });

        builder.add(buildStructTypeAdapterFactory(JffiCxCursor.DESCRIPTOR));
        builder.add(buildPointerTypeAdapterFactory(JffiCxIndex.DESCRIPTOR));
        builder.add(buildStructTypeAdapterFactory(JffiCxString.DESCRIPTOR));
        builder.add(buildPointerTypeAdapterFactory(JffiCxTranslationUnit.DESCRIPTOR));

        JffiCxEnums.DESCRIPTORS.forEach(d -> builder.add(buildEnumTypeAdapterFactory(d)));

        return builder.build();
    }

    private TypeAdapter.Factory buildStructTypeAdapterFactory(JffiStruct.Descriptor<?> descriptor)
    {
        return new TypeAdapter.Factory.Impl(
                descriptor.cls::equals,
                new TypeAdapter.Impl(
                        descriptor.struct,
                        (value, buffer) -> buffer.putStruct(((JffiStruct) value).struct, 0),
                        (function, buffer) -> {
                            byte[] struct = invoker.invokeStruct(function, buffer);
                            return descriptor.constructor.apply(JffiCxRuntimeImpl.this, struct);
                        }));
    }

    private TypeAdapter.Factory buildPointerTypeAdapterFactory(JffiPointer.Descriptor<?> descriptor)
    {
        return new TypeAdapter.Factory.Impl(
                descriptor.cls::equals,
                new TypeAdapter.Impl(
                        Type.POINTER,
                        (value, buffer) -> buffer.putAddress(((JffiPointer) value).address),
                        (function, buffer) -> {
                            long address = invoker.invokeAddress(function, buffer);
                            return descriptor.constructor.apply(JffiCxRuntimeImpl.this, address);
                        }));
    }

    @SuppressWarnings("unchecked")
    private static <T extends Enum<T>> T forceCastEnum(Object obj)
    {
        return (T) obj;
    }

    private TypeAdapter.Factory buildEnumTypeAdapterFactory(JffiCxEnums.Descriptor<?> descriptor)
    {
        return new TypeAdapter.Factory.Impl(
                descriptor.cls::equals,
                new TypeAdapter.Impl(
                        Type.SINT,
                        (value, buffer) -> buffer.putInt(descriptor.toInt.apply(forceCastEnum(value))),
                        (function, buffer) -> {
                            int value = invoker.invokeInt(function, buffer);
                            return requireNonNull(descriptor.fromInt.apply(value));
                        }));
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
                Supplier<Object> supplier = () -> returnType.invoke(function, buffer);
                for (int i = parameterTypes.size() - 1; i >= 0; --i) {
                    supplier = bind(parameterTypes.get(i)::push, args[i], buffer, supplier)::apply;
                }
                return supplier.get();
            };

            invokers.put(method, invoker);

            return invoker;
        }
    }
}
