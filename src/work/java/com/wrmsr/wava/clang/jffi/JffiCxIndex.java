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

import com.wrmsr.wava.clang.CxError;
import com.wrmsr.wava.clang.CxException;
import com.wrmsr.wava.clang.CxIndex;
import com.wrmsr.wava.clang.CxTranslationUnit;
import com.wrmsr.wava.clang.CxTranslationUnitFlags;
import com.wrmsr.wava.util.Cell;

import java.util.List;
import java.util.Set;

@SuppressWarnings("WeakerAccess")
public final class JffiCxIndex
        extends JffiPointer
        implements CxIndex
{
    static final Descriptor<JffiCxIndex> DESCRIPTOR = new Descriptor<>(JffiCxIndex::new);

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
            runtime.getLibClang().clang_disposeIndex(this);
            isDisposed = true;
        }
    }

    @Override
    public CxTranslationUnit parseTranslationUnit(String sourceFilename, List<String> commandLineArgs, Set<CxTranslationUnitFlags> options)
            throws CxException
    {
        Cell<JffiCxTranslationUnit> out = Cell.of(null);
        String[] commandLineArgsArray = commandLineArgs.stream().toArray(String[]::new);
        int optionsInt = options.stream().map(CxTranslationUnitFlags::getAsInt).reduce(0, (l, r) -> l | r);
        CxError error = runtime.getLibClang().clang_parseTranslationUnit2(this, sourceFilename, commandLineArgsArray, commandLineArgsArray.length, 0, 0, optionsInt, out);
        if (error != CxError.Success) {
            throw new CxException(error);
        }
        return out.get();
    }
}
