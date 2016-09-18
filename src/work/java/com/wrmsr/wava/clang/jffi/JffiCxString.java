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
import com.wrmsr.wava.clang.CxString;

import static com.google.common.base.Preconditions.checkState;
import static com.kenai.jffi.Struct.newStruct;

@SuppressWarnings("WeakerAccess")
public final class JffiCxString
        extends JffiStruct
        implements CxString
{
    static final Descriptor<JffiCxString> DESCRIPTOR = new Descriptor<>(
            JffiCxString::new,
            newStruct(
                    Type.POINTER,
                    Type.UINT32));

    private boolean isDisposed = false;

    JffiCxString(JffiCxRuntime runtime, byte[] bytes)
    {
        super(runtime, bytes);
    }

    @Override
    public String get()
    {
        checkState(!isDisposed);
        return runtime.getLibClang().clang_getCString(this);
    }

    @Override
    public void close()
            throws Exception
    {
        if (!isDisposed) {
            runtime.getLibClang().clang_disposeString(this);
            isDisposed = true;
        }
    }
}
