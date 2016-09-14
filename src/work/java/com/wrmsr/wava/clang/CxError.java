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

import java.util.Map;
import java.util.stream.Stream;

import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableMap;
import static java.util.function.Function.identity;

/**
 * \brief Error codes returned by libclang routines.
 * <p>
 * Zero (\c CXError_Success) is the only error code indicating success.  Other
 * error codes, including not yet assigned non-zero values, indicate errors.
 */
public enum CxError
{
    /**
     * \brief No error.
     */
    Success(0),

    /**
     * \brief A generic error code, no further details are available.
     * <p>
     * Errors of this kind can get their own specific error codes in future
     * libclang versions.
     */
    Failure(1),

    /**
     * \brief libclang crashed while performing the requested operation.
     */
    Crashed(2),

    /**
     * \brief The function detected that the arguments violate the function
     * contract.
     */
    InvalidArguments(3),

    /**
     * \brief An AST deserialization error has occurred.
     */
    ASTReadError(4);

    private final int value;

    CxError(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public static final Map<Integer, CxError> BY_VALUE = Stream.of(values()).collect(toImmutableMap(CxError::getValue, identity()));
}
