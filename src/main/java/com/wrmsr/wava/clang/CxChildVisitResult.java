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
 * \brief Describes how the traversal of the children of a particular
 * cursor should proceed after visiting a particular child cursor.
 * <p>
 * A value of this enumeration type should be returned by each
 * \c CXCursorVisitor to indicate how clang_visitChildren() proceed.
 */
public enum CxChildVisitResult
        implements IntSupplier
{
    /**
     * \brief Terminates the cursor traversal.
     */
    Break(0),

    /**
     * \brief Continues the cursor traversal with the next sibling of
     * the cursor just visited, without visiting its children.
     */
    Continue(1),

    /**
     * \brief Recursively traverse the children of this cursor, using
     * the same visitor and client data.
     */
    Recurse(2);

    private final int value;

    CxChildVisitResult(int value)
    {
        this.value = value;
    }

    @Override
    public int getAsInt()
    {
        return value;
    }

    public static final Map<Integer, CxChildVisitResult> BY_VALUE = Stream.of(values()).collect(toImmutableMap(CxChildVisitResult::getAsInt, identity()));
}
