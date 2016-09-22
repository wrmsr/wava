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

/**
 * \brief Represents the storage classes as declared in the source. CX_SC_Invalid
 * was added for the case that the passed cursor in not a declaration.
 */
public enum CxStorageClass
        implements IntSupplier
{
    Invalid(0),
    None(1),
    Extern(2),
    Static(3),
    PrivateExtern(4),
    OpenCLWorkGroupLocal(5),
    Auto(6),
    Register(7);

    private final int value;

    CxStorageClass(int value)
    {
        this.value = value;
    }

    @Override
    public int getAsInt()
    {
        return value;
    }

    public static final Map<Integer, CxStorageClass> BY_VALUE = Stream.of(values()).collect(toImmutableMap(CxStorageClass::getAsInt, identity()));
}
