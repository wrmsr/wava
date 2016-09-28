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

import com.google.common.collect.ImmutableList;

import java.util.List;

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

    String getDeclObjCTypeEncoding();

    CxType getCursorResultType();

    long getOffsetOfField();

    boolean isAnonymous();

    boolean isBitField();

    boolean isVirtualBase();

    CxCxxAccessSpecifier getCXXAccessSpecifier();

    CxStorageClass getStorageClass();

    int getNumOverloadedDecls();

    CxCursor getOverloadedDecl(int index);

    CxType getIBOutletCollectionType();

    String getCursorUSR();

    String getCursorSpelling();

    CxSourceRange getSpellingNameRange(int pieceIndex, int options);

    String getCursorDisplayName();

    CxCursor getCursorReferenced();

    CxCursor getCursorDefinition();

    boolean isCursorDefinition();

    CxCursor getCanonicalCursor();

    int getObjCSelectorIndex();

    boolean isDynamicCall();

    CxType getReceiverType();

    CxSourceRange getCommentRange();

    String getRawCommentText();

    String getBriefCommentText();

    String getMangling();

    CxModule getModule();

    CxCursorKind getTemplateCursorKind();

    CxCursor getSpecializedCursorTemplate();

    CxSourceRange getCursorReferenceNameRange(int nameFlags, int pieceIndex);

    CxEvalResult evaluate();

    default List<CxCursor> getChildren()
    {
        ImmutableList.Builder<CxCursor> builder = ImmutableList.builder();
        visitChildren((child, parent) -> {
            builder.add(child);
            return CxChildVisitResult.Continue;
        });
        return builder.build();
    }
}
