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

import com.google.common.base.MoreObjects;

import java.util.Optional;

public class CxException
        extends Exception
{
    private final Optional<CxError> error;

    public CxException(CxError error, String message, Throwable cause)
    {
        super(message, cause);
        this.error = Optional.of(error);
    }

    public CxException(String message, Throwable cause)
    {
        super(message, cause);
        this.error = Optional.empty();
    }

    public CxException(CxError error, String message)
    {
        super(message, null);
        this.error = Optional.of(error);
    }

    public CxException(CxError error)
    {
        super(null, null);
        this.error = Optional.of(error);
    }

    public CxException()
    {
        super(null, null);
        this.error = Optional.empty();
    }

    public Optional<CxError> getError()
    {
        return error;
    }

    @Override
    public String toString()
    {
        return MoreObjects.toStringHelper(this)
                .add("message", getMessage())
                .add("cause", getCause())
                .add("error", error)
                .toString();
    }
}
