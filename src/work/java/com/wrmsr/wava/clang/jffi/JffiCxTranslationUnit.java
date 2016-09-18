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

import com.wrmsr.wava.clang.CxTranslationUnit;

@SuppressWarnings("WeakerAccess")
public final class JffiCxTranslationUnit
        extends JffiPointer
        implements CxTranslationUnit
{
    static final Descriptor<JffiCxTranslationUnit> DESCRIPTOR = new Descriptor<>(
            JffiCxTranslationUnit.class,
            JffiCxTranslationUnit::new);

    private boolean isDisposed = false;

    JffiCxTranslationUnit(JffiCxRuntime runtime, long address)
    {
        super(runtime, address);
    }

    @Override
    public void close()
            throws Exception
    {
        if (!isDisposed) {
            runtime.getLibClang().clang_disposeTranslationUnit(this);
            isDisposed = true;
        }
    }
}
