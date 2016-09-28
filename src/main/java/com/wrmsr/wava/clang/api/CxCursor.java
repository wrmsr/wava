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

    int getNumTemplateArguments();

    CxTemplateArgumentKind getTemplateArgumentKind(int i);

    CxType getTemplateArgumentType(int i);

    long getTemplateArgumentValue(int i);

    long getTemplateArgumentUnsignedValue(int i);

    boolean isMacroFunctionLike();

    boolean isMacroBuiltin();

    boolean isFunctionInlined();

    String getDeclObjCTypeEncoding(CxCursor cursor);

    CxType getCursorResultType(CxCursor cursor);

    long getOffsetOfField(CxCursor cursor);

    boolean isAnonymous(CxCursor cursor);

    boolean isBitField(CxCursor cursor);

    boolean isVirtualBase(CxCursor cursor);

    CxCxxAccessSpecifier getCXXAccessSpecifier(CxCursor cursor);

    CxStorageClass getStorageClass(CxCursor cursor);

    int getNumOverloadedDecls(CxCursor cursor);

    CxCursor getOverloadedDecl(CxCursor cursor, int index);

    CxType getIBOutletCollectionType(CxCursor cursor);

    String getCursorUSR(CxCursor cursor);

    String getCursorSpelling(CxCursor cursor);

    CxSourceRange getSpellingNameRange(CxCursor cursor, int pieceIndex, int options);

    String getCursorDisplayName(CxCursor cursor);

    CxCursor getCursorReferenced(CxCursor cursor);

    CxCursor getCursorDefinition(CxCursor cursor);

    boolean isCursorDefinition(CxCursor cursor);

    CxCursor getCanonicalCursor(CxCursor cursor);

    int getObjCSelectorIndex(CxCursor cursor);

    boolean isDynamicCall(CxCursor cursor);

    CxType getReceiverType(CxCursor cursor);

    CxSourceRange getCommentRange(CxCursor cursor);

    String getRawCommentText(CxCursor cursor);

    String getBriefCommentText(CxCursor cursor);

    String getMangling(CxCursor cursor);

    CxModule getModule(CxCursor cursor);

    CxCursorKind getTemplateCursorKind(CxCursor cursor);

    CxCursor getSpecializedCursorTemplate(CxCursor cursor);

    CxSourceRange getCursorReferenceNameRange(CxCursor cursor, int nameFlags, int pieceIndex);

    CxEvalResult evaluate(CxCursor cursor);
}
