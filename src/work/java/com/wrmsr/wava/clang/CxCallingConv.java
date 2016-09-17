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
 * \brief Describes the calling convention of a function type
 */
public enum CxCallingConv
{
    Default(0),
    C(1),
    X86StdCall(2),
    X86FastCall(3),
    X86ThisCall(4),
    X86Pascal(5),
    AAPCS(6),
    AAPCS_VFP(7),
    /* Value 8 was PnaclCall, but it was never used, so it could safely be re-used. */
    IntelOclBicc(9),
    X86_64Win64(10),
    X86_64SysV(11),
    X86VectorCall(12),
    Swift(13),
    PreserveMost(14),
    PreserveAll(15),

    Invalid(100),
    Unexposed(20);

    private final int value;

    CxCallingConv(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public static final Map<Integer, CxCallingConv> BY_VALUE = Stream.of(values()).collect(toImmutableMap(CxCallingConv::getValue, identity()));
}
