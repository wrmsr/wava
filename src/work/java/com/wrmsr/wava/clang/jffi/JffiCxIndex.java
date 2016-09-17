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

import com.wrmsr.wava.clang.CxException;
import com.wrmsr.wava.clang.CxIndex;
import com.wrmsr.wava.clang.CxTranslationUnit;
import com.wrmsr.wava.clang.CxTranslationUnitFlags;

import java.util.Set;

final class JffiCxIndex
        extends BasePointer
        implements CxIndex
{
    private boolean isDisposed = false;

    JffiCxIndex(JffiCxRuntime runtime, long address)
    {
        super(runtime, address);
    }

    @Override
    public void close()
            throws Exception
    {
        if (!isDisposed) {
            runtime.invokeVoid(runtime.clang_disposeIndex, ib -> ib.putAddress(address));
            isDisposed = true;
        }
    }

    @Override
    public CxTranslationUnit parseTranslationUnit(String sourceFilename, String commandLineArgs, Set<CxTranslationUnitFlags> options)
            throws CxException
    {
        return null;
    }
}
