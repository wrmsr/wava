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

import com.kenai.jffi.Type;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.function.BiFunction;

import static java.util.Objects.requireNonNull;

abstract class JffiStruct
        implements AutoCloseable
{
    static final class Descriptor<T>
    {
        final Class<T> cls;
        final BiFunction<JffiCxRuntime, byte[], T> constructor;
        final Type struct;

        public Descriptor(Class<T> cls, BiFunction<JffiCxRuntime, byte[], T> constructor, Type struct)
        {
            this.cls = requireNonNull(cls);
            this.constructor = requireNonNull(constructor);
            this.struct = requireNonNull(struct);
        }
    }

    final JffiCxRuntime runtime;
    final byte[] struct;

    JffiStruct(JffiCxRuntime runtime, byte[] struct)
    {
        this.runtime = requireNonNull(runtime);
        this.struct = requireNonNull(struct);
    }

    public ByteBuffer getByteBuffer()
    {
        return ByteBuffer.wrap(struct).order(ByteOrder.nativeOrder());
    }

    @Override
    public void close()
            throws Exception
    {
    }
}
