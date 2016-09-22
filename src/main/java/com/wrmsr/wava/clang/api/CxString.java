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
package com.wrmsr.wava.clang.api;

import com.google.common.base.Throwables;

public interface CxString
        extends AutoCloseable
{
    String get();

    static String unwrap(CxString string)
    {
        if (string == null) {
            return null;
        }
        try {
            return string.get();
        }
        finally {
            try {
                string.close();
            }
            catch (Exception e) {
                throw Throwables.propagate(e);
            }
        }
    }
}
