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

public interface CxType
{
    String getSpelling();

    CxType getCanonicalType();

    boolean isConstQualifiedType();

    boolean isVolatileQualifiedType();

    boolean isRestrictQualifiedType();

    CxType getPointeeType();

    CxCursor getTypeDeclaration();

    CxCallingConv getFunctionTypeCallingConv();

    CxType getResultType();

    int getNumArgTypes();

    CxType getArgType(int i);

    boolean isFunctionTypeVariadic();

    CxType getElementType();

    long getNumElements();

    CxType getArrayElementType();

    long getArraySize();

    CxType getNamedType();

    long getAlignOf();

    CxType getClassType();

    long getSizeOf();

    long getOffsetOf(String s);

    int getNumTemplateArguments();

    CxType getTemplateArgumentAsType(int i);

    CxRefQualifierKind getCXXRefQualifier();
}
