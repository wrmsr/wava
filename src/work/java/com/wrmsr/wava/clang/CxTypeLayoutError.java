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
import java.util.function.IntSupplier;
import java.util.stream.Stream;

import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableMap;
import static java.util.function.Function.identity;

/**
 * \brief List the possible error codes for \c clang_Type_getSizeOf,
 * \c clang_Type_getAlignOf, \c clang_Type_getOffsetOf and
 * \c clang_Cursor_getOffsetOf.
 * <p>
 * A value of this enumeration type can be returned if the target type is not
 * a valid argument to sizeof, alignof or offsetof.
 */
public enum CxTypeLayoutError
        implements IntSupplier
{
    /**
     * \brief Type is of kind CXType_Invalid.
     */
    Invalid(-1),
    /**
     * \brief The type is an incomplete Type.
     */
    Incomplete(-2),
    /**
     * \brief The type is a dependent Type.
     */
    Dependent(-3),
    /**
     * \brief The type is not a constant size type.
     */
    NotConstantSize(-4),
    /**
     * \brief The Field name is not valid for this record.
     */
    InvalidFieldName(-5);

    private final int value;

    CxTypeLayoutError(int value)
    {
        this.value = value;
    }

    @Override
    public int getAsInt()
    {
        return value;
    }

    public static final Map<Integer, CxTypeLayoutError> BY_VALUE = Stream.of(values()).collect(toImmutableMap(CxTypeLayoutError::getAsInt, identity()));
}
