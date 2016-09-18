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

import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableSet;
import com.kenai.jffi.Function;
import com.kenai.jffi.HeapInvocationBuffer;
import com.kenai.jffi.Invoker;
import com.kenai.jffi.Library;
import com.kenai.jffi.MemoryIO;
import com.kenai.jffi.Type;
import com.wrmsr.wava.clang.CxRuntime;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import static com.google.common.base.Preconditions.checkState;
import static java.util.Objects.requireNonNull;

public final class JffiCxRuntime
        implements CxRuntime
{
    final Invoker invoker;
    final MemoryIO memoryIO;
    final Library library;
    final LibraryInterface libclang;

    private final List<TypeAdapter> typeAdapters = new ArrayList<>();

    private interface LibraryInterface
    {
        void clang_toggleCrashRecovery(int isEnabled);

        JffiCxString clang_getClangVersion();
    }

    @SuppressWarnings("UnnecessaryBoxing")
    private JffiCxRuntime(Invoker invoker, MemoryIO memoryIO, Library library)
    {
        this.invoker = requireNonNull(invoker);
        this.memoryIO = requireNonNull(memoryIO);
        this.library = requireNonNull(library);

        typeAdapters.add(
                new TypeAdapter.Impl(
                        ImmutableSet.of(byte.class, Byte.class)::contains,
                        Type.VOID,
                        (value, buffer) -> {
                            throw new UnsupportedOperationException();
                        },
                        invoker::invokeInt));

        typeAdapters.add(
                new TypeAdapter.Impl(
                        ImmutableSet.<Class>of(String.class)::contains,
                        Type.POINTER,
                        (value, buffer) -> {
                            throw new UnsupportedOperationException();
                        },
                        (function, buffer) -> {
                            long address = invoker.invokeAddress(function, buffer);
                            byte[] bytes = memoryIO.getZeroTerminatedByteArray(address);
                            return new String(bytes);
                        }));

        typeAdapters.add(
                new TypeAdapter.Impl(
                        ImmutableSet.of(byte.class, Byte.class)::contains,
                        Type.SINT8,
                        (value, buffer) -> buffer.putByte(((Number) value).intValue()),
                        (function, buffer) -> Byte.valueOf((byte) invoker.invokeInt(function, buffer))));

        typeAdapters.add(
                new TypeAdapter.Impl(
                        ImmutableSet.of(short.class, Short.class)::contains,
                        Type.SINT16,
                        (value, buffer) -> buffer.putShort(((Number) value).intValue()),
                        (function, buffer) -> Short.valueOf((short) invoker.invokeInt(function, buffer))));

        typeAdapters.add(
                new TypeAdapter.Impl(
                        ImmutableSet.of(int.class, Integer.class)::contains,
                        Type.SINT32,
                        (value, buffer) -> buffer.putInt(((Number) value).intValue()),
                        (function, buffer) -> Integer.valueOf((int) invoker.invokeInt(function, buffer))));

        typeAdapters.add(
                new TypeAdapter.Impl(
                        ImmutableSet.of(long.class, Long.class)::contains,
                        Type.SINT64,
                        (value, buffer) -> buffer.putLong(((Number) value).intValue()),
                        (function, buffer) -> Long.valueOf((long) invoker.invokeLong(function, buffer))));

        typeAdapters.add(
                new TypeAdapter.Impl(
                        ImmutableSet.of(float.class, Float.class)::contains,
                        Type.FLOAT,
                        (value, buffer) -> buffer.putFloat(((Number) value).floatValue()),
                        (function, buffer) -> Float.valueOf((byte) invoker.invokeFloat(function, buffer))));

        typeAdapters.add(
                new TypeAdapter.Impl(
                        ImmutableSet.of(double.class, Double.class)::contains,
                        Type.DOUBLE,
                        (value, buffer) -> buffer.putDouble(((Number) value).doubleValue()),
                        (function, buffer) -> Double.valueOf((byte) invoker.invokeDouble(function, buffer))));

        libclang = LibraryInterface.class.cast(
                Proxy.newProxyInstance(LibraryInterface.class.getClassLoader(),
                        new Class[] {LibraryInterface.class},
                        new NativeInvocationHandler()));
    }

    public static CxRuntime create(String libraryPath)
    {
        Invoker invoker = Invoker.getInstance();
        MemoryIO memory = MemoryIO.getCheckedInstance();
        Library library = JffiUtils.openLibrary(libraryPath);
        return new JffiCxRuntime(invoker, memory, library);
    }

    @Override
    public void close()
            throws Exception
    {
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
            Class returnType = method.getReturnType();
            Class[] parameterTypes = method.getParameterTypes();
            Type ffiReturnType = convertClassToFFI(returnType);
            Type[] ffiParameterTypes = new Type[parameterTypes.length];
            for (int i = 0; i < ffiParameterTypes.length; ++i) {
                ffiParameterTypes[i] = convertClassToFFI(parameterTypes[i]);
            }
            final long address = library.getSymbolAddress(method.getName());
            if (address == 0) {
                throw new UnsatisfiedLinkError(String.format("Could not locate '%s': %s", method.getName(), Library.getLastError()));
            }
            Function function = new Function(address, ffiReturnType, ffiParameterTypes);
            invoker = new DefaultMethodInvoker(function, returnType, parameterTypes);
            invokers.put(method, invoker);
            return invoker;
        }
    }

    interface TypeAdapter
    {
        boolean matchesClass(Class cls);

        Type getType();

        void push(Object value, HeapInvocationBuffer buffer);

        Object invoke(Function function, HeapInvocationBuffer buffer);

        final class Impl
                implements TypeAdapter
        {
            private final Predicate<Class> classMatcher;
            private final Type type;
            private final BiConsumer<Object, HeapInvocationBuffer> pusher;
            private final BiFunction<Function, HeapInvocationBuffer, Object> invoker;

            private Impl(Predicate<Class> classMatcher, Type type, BiConsumer<Object, HeapInvocationBuffer> pusher, BiFunction<Function, HeapInvocationBuffer, Object> invoker)
            {
                this.classMatcher = requireNonNull(classMatcher);
                this.type = requireNonNull(type);
                this.pusher = requireNonNull(pusher);
                this.invoker = requireNonNull(invoker);
            }

            @Override
            public boolean matchesClass(Class cls)
            {
                return classMatcher.test(cls);
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

    private Type convertClassToFFI(Class type)
    {
        if (type == void.class || type == Void.class) {
            // ...
        }
        else if (BigDecimal.class.isAssignableFrom(type)) {
            return Type.LONGDOUBLE;
        }
        else if (JffiUtils.Address.class.isAssignableFrom(type)) {
            return Type.POINTER;
        }
        else if (JffiStruct.class.isAssignableFrom(type)) {
            try {
                return (Type) type.getDeclaredField("STRUCT").get(null);
            }
            catch (ReflectiveOperationException e) {
                throw Throwables.propagate(e);
            }
        }
        else {
            throw new IllegalArgumentException("Unknown type: " + type);
        }
    }

    private interface MethodInvoker
    {
        Object invoke(Object[] args);
    }

    private final class DefaultMethodInvoker
            implements MethodInvoker
    {
        private final Function function;
        private final Class returnType;
        private final Class[] parameterTypes;

        DefaultMethodInvoker(Function function, Class returnType, Class[] parameterTypes)
        {
            this.function = function;
            this.returnType = returnType;
            this.parameterTypes = parameterTypes;
        }

        @Override
        public Object invoke(Object[] args)
        {
            HeapInvocationBuffer buffer = new HeapInvocationBuffer(function);
            checkState((parameterTypes.length == 0 && args == null) || (parameterTypes.length == args.length));
            for (int i = 0; i < parameterTypes.length; ++i) {
                if (parameterTypes[i] == byte.class || parameterTypes[i] == Byte.class) {
                    // ...
                }
                else if (BigDecimal.class.isAssignableFrom(parameterTypes[i])) {
                    buffer.putLongDouble(BigDecimal.class.cast(args[i]));
                }
                else if (JffiUtils.Address.class.isAssignableFrom(parameterTypes[i])) {
                    buffer.putAddress(((JffiUtils.Address) args[i]).address);
                }
                else {
                    throw new RuntimeException("Unknown parameter type: " + parameterTypes[i]);
                }
            }
            Invoker invoker = Invoker.getInstance();
            if (returnType == void.class || returnType == Void.class) {
                invoker.invokeInt(function, buffer);
                return null;
            }
            else if (returnType == byte.class || returnType == Byte.class) {
                // ...
            }
            else if (BigDecimal.class.isAssignableFrom(returnType)) {
                return invoker.invokeBigDecimal(function, buffer);
            }
            else if (JffiUtils.Address.class.isAssignableFrom(returnType)) {
                return new JffiUtils.Address(invoker.invokeAddress(function, buffer));
            }
            else if (JffiStruct.class.isAssignableFrom(returnType)) {
                return invoker.invokeStruct(function, buffer);
            }
            throw new RuntimeException("Unknown return type: " + returnType);
        }
    }
}
