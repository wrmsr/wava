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

public enum CxTokenKind
        implements IntSupplier
{
    /**
     * \brief A token that contains some kind of punctuation.
     */
    Punctuation(0),

    /**
     * \brief A language keyword.
     */
    Keyword(1),

    /**
     * \brief An identifier (that is not a keyword).
     */
    Identifier(2),

    /**
     * \brief A numeric, string, or character literal.
     */
    Literal(3),

    /**
     * \brief A comment.
     */
    Comment(4);

    private final int value;

    CxTokenKind(int value)
    {
        this.value = value;
    }

    @Override
    public int getAsInt()
    {
        return value;
    }

    public static final Map<Integer, CxTokenKind> BY_VALUE = Stream.of(values()).collect(toImmutableMap(CxTokenKind::getAsInt, identity()));
}
