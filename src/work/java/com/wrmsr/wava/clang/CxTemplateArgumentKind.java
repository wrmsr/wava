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
 * \brief Describes the kind of a template argument.
 * <p>
 * See the definition of llvm::clang::TemplateArgument::ArgKind for full
 * element descriptions.
 */
public enum CxTemplateArgumentKind
        implements IntSupplier
{
    Null(0),
    Type(1),
    Declaration(2),
    NullPtr(3),
    Integral(4),
    Template(5),
    TemplateExpansion(6),
    Expression(7),
    Pack(8),
    /* Indicates an error case, preventing the kind from being deduced. */
    Invalid(9);

    private final int value;

    CxTemplateArgumentKind(int value)
    {
        this.value = value;
    }

    @Override
    public int getAsInt()
    {
        return value;
    }

    public static final Map<Integer, CxTemplateArgumentKind> BY_VALUE = Stream.of(values()).collect(toImmutableMap(CxTemplateArgumentKind::getAsInt, identity()));
}
