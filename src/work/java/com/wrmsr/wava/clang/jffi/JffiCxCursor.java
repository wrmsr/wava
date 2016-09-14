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

import com.kenai.jffi.Struct;
import com.kenai.jffi.Type;
import com.wrmsr.wava.clang.CxCursor;
import com.wrmsr.wava.clang.CxCursorKind;

import static com.kenai.jffi.Array.newArray;
import static com.kenai.jffi.Struct.newStruct;

final class JffiCxCursor
        extends BaseStruct
        implements CxCursor
{
    static Struct STRUCT = newStruct(
            Type.UINT32,
            Type.UINT32,
            newArray(Type.POINTER, 3));

    JffiCxCursor(JffiCxRuntime runtime, byte[] bytes)
    {
        super(runtime, bytes);
    }

    @Override
    public CxCursorKind getKind()
    {
        return null;
    }
}
