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

public enum CxNameRefFlags
        implements IntSupplier
{
    /**
     * \brief Include the nested-name-specifier, e.g. Foo:: in x.Foo::y, in the
     * range.
     */
    WantQualifier(0x1),

    /**
     * \brief Include the explicit template arguments, e.g. \<int> in x.f<int>,
     * in the range.
     */
    WantTemplateArgs(0x2),

    /**
     * \brief If the name is non-contiguous, return the full spanning range.
     * <p>
     * Non-contiguous names occur in Objective-C when a selector with two or more
     * parameters is used, or in C++ when using an operator:
     * \code
     * [object doSomething:here withValue:there]; // Objective-C
     * return some_vector[1]; // C++
     * \endcode
     */
    WantSinglePiece(0x4);

    private final int value;

    CxNameRefFlags(int value)
    {
        this.value = value;
    }

    @Override
    public int getAsInt()
    {
        return value;
    }

    public static final Map<Integer, CxNameRefFlags> BY_VALUE = Stream.of(values()).collect(toImmutableMap(CxNameRefFlags::getAsInt, identity()));
}
