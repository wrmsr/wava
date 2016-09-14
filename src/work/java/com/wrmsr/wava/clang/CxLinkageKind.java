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
 * \brief Describe the linkage of the entity referred to by a cursor.
 */
public enum CxLinkageKind
{
    /**
     * \brief This value indicates that no linkage information is available
     * for a provided CXCursor.
     */
    Invalid(0),

    /**
     * \brief This is the linkage for variables, parameters, and so on that
     * have automatic storage.  This covers normal (non-extern) local variables.
     */
    NoLinkage(1),
    /**
     * \brief This is the linkage for static variables and static functions.
     */
    Internal(2),
    /**
     * \brief This is the linkage for entities with external linkage that live
     * in C++ anonymous namespaces.
     */
    UniqueExternal(3),
    /**
     * \brief This is the linkage for entities with true, external linkage.
     */
    External(4);

    private final int value;

    CxLinkageKind(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public static final Map<Integer, CxLinkageKind> BY_VALUE = Stream.of(values()).collect(toImmutableMap(CxLinkageKind::getValue, identity()));
}
