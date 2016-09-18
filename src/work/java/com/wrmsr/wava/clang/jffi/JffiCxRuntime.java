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

import com.kenai.jffi.Invoker;
import com.kenai.jffi.Library;
import com.kenai.jffi.MemoryIO;
import com.wrmsr.wava.clang.CxIndex;
import com.wrmsr.wava.clang.CxRuntime;
import com.wrmsr.wava.clang.CxString;

public abstract class JffiCxRuntime
        implements CxRuntime
{
    interface LibClang
    {
        void clang_toggleCrashRecovery(int isEnabled);

        String clang_getCString(JffiCxString string);

        void clang_disposeString(JffiCxString string);

        JffiCxString clang_getClangVersion();

        void clang_disposeIndex(JffiCxIndex index);

        void clang_disposeTranslationUnit(JffiCxTranslationUnit translationUnit);
    }

    abstract LibClang getLibClang();

    @Override
    public CxString getClangVersion()
    {
        return getLibClang().clang_getClangVersion();
    }

    @Override
    public CxIndex createIndex(int excludeDeclarationsFromPCH, int displayDiagnostics)
    {
        throw new UnsupportedOperationException();
    }

    public static JffiCxRuntime create(String libraryPath)
    {
        Invoker invoker = Invoker.getInstance();
        MemoryIO memory = MemoryIO.getCheckedInstance();
        Library library = JffiUtils.openLibrary(libraryPath);
        return new JffiCxRuntimeImpl(invoker, memory, library);
    }
}
