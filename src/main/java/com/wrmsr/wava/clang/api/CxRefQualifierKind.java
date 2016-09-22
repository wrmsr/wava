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

import java.util.Map;
import java.util.function.IntSupplier;
import java.util.stream.Stream;

import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableMap;
import static java.util.function.Function.identity;

public enum CxRefQualifierKind
        implements IntSupplier
{
    /**
     * \brief No ref-qualifier was provided.
     */
    None(0),
    /**
     * \brief An lvalue ref-qualifier was provided (\c &).
     */
    LValue(1),
    /**
     * \brief An rvalue ref-qualifier was provided (\c &&).
     */
    RValue(2);

    private final int value;

    CxRefQualifierKind(int value)
    {
        this.value = value;
    }

    @Override
    public int getAsInt()
    {
        return value;
    }

    public static final Map<Integer, CxRefQualifierKind> BY_VALUE = Stream.of(values()).collect(toImmutableMap(CxRefQualifierKind::getAsInt, identity()));
}
