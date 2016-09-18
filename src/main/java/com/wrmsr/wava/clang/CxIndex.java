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
package com.wrmsr.wava.clang;

import java.util.List;
import java.util.Set;

public interface CxIndex
        extends AutoCloseable
{
    CxTranslationUnit createTranslationUnit(String astFilename);

    CxTranslationUnit parseTranslationUnit(String sourceFilename, List<String> commandLineArgs, Set<CxTranslationUnitFlags> options)
            throws CxException;
}
