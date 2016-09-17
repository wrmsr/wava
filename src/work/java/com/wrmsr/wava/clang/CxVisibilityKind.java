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

public enum CxVisibilityKind
{
    /**
     * \brief This value indicates that no visibility information is available
     * for a provided CXCursor.
     */
    Invalid(0),

    /**
     * \brief Symbol not seen by the linker.
     */
    Hidden(1),
    /**
     * \brief Symbol seen by the linker but resolves to a symbol inside this object.
     */
    Protected(2),
    /**
     * \brief Symbol seen by the linker and acts like a normal symbol.
     */
    Default(3);

    private final int value;

    CxVisibilityKind(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public static final Map<Integer, CxVisibilityKind> BY_VALUE = Stream.of(values()).collect(toImmutableMap(CxVisibilityKind::getValue, identity()));
}
