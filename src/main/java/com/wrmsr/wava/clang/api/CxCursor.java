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

public interface CxCursor
{
    boolean cursorEqual(CxCursor other);

    boolean cursorIsNull();

    int cursorHash();

    CxCursorKind getKind();

    boolean visitChildren(CxCursorVisitor visitor);

    String getSpelling();

    CxType getType();

    CxType getTypedefDeclUnderlyingType();

    CxType getEnumDeclIntegerType();

    long getEnumConstantDeclValue();

    long getEnumConstantDeclUnsignedValue();

    int getFieldDeclBitWidth();

    int getNumArguments();

    CxCursor getArgument(int i);
}
