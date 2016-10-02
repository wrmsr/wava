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

import java.util.Optional;

public interface CxEvalResult
        extends AutoCloseable
{
    CxEvalResultKind getKind();

    long getAsInt();

    double getAsDouble();

    String getAsStr();

    static CxEvalValue unwrap(CxEvalResult evalResult)
    {
        if (evalResult == null) {
            return null;
        }
        Optional<Object> value = Optional.empty();
        switch (evalResult.getKind()) {
            case Int:
                value = Optional.of(evalResult.getAsInt());
                break;
            case Float:
                value = Optional.of(evalResult.getAsDouble());
                break;
            case ObjCStrLiteral:
            case StrLiteral:
            case CFStr:
                value = Optional.of(evalResult.getAsStr());
                break;
        }
        return new CxEvalValue(evalResult.getKind(), value);
    }

    static CxEvalValue unwrapAndClose(CxEvalResult evalResult)
    {
        if (evalResult == null) {
            return null;
        }
        try {
            return unwrap(evalResult);
        }
        finally {
            try {
                evalResult.close();
            }
            catch (Exception e) {
                throw Throwables.propagate(e);
            }
        }
    }
}
