/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wrmsr.wava.clang.jffi;

import com.kenai.jffi.Type;
import com.wrmsr.wava.clang.api.CxCursor;
import com.wrmsr.wava.clang.api.CxCursorKind;
import com.wrmsr.wava.clang.api.CxCursorVisitor;
import com.wrmsr.wava.clang.api.CxCxxAccessSpecifier;
import com.wrmsr.wava.clang.api.CxEvalResult;
import com.wrmsr.wava.clang.api.CxEvalValue;
import com.wrmsr.wava.clang.api.CxModule;
import com.wrmsr.wava.clang.api.CxSourceRange;
import com.wrmsr.wava.clang.api.CxStorageClass;
import com.wrmsr.wava.clang.api.CxString;
import com.wrmsr.wava.clang.api.CxTemplateArgumentKind;
import com.wrmsr.wava.clang.api.CxType;

import static com.kenai.jffi.Array.newArray;
import static com.kenai.jffi.Struct.newStruct;
import static com.wrmsr.wava.clang.jffi.JffiUtils.Address;

final class JffiCxCursor
        extends JffiStruct
        implements CxCursor
{
    static final Descriptor<JffiCxCursor> DESCRIPTOR = new Descriptor<>(
            JffiCxCursor.class,
            JffiCxCursor::new,
            newStruct(
                    Type.UINT32,
                    Type.UINT32,
                    newArray(Type.POINTER, 3)));

    JffiCxCursor(JffiCxRuntime runtime, byte[] bytes)
    {
        super(runtime, bytes);
    }

    @Override
    public boolean cursorEqual(CxCursor other)
    {
        return runtime.getLibClang().clang_equalCursors(this, (JffiCxCursor) other);
    }

    @Override
    public boolean cursorIsNull()
    {
        return runtime.getLibClang().clang_Cursor_isNull(this);
    }

    @Override
    public int cursorHash()
    {
        return runtime.getLibClang().clang_hashCursor(this);
    }

    @Override
    public CxCursorKind getKind()
    {
        return runtime.getLibClang().clang_getCursorKind(this);
    }

    @Override
    public boolean visitChildren(CxCursorVisitor visitor)
    {
        return runtime.getLibClang().clang_visitChildren(this, (cursor, parent, userData) -> visitor.visit(cursor, parent), new Address(0));
    }

    @Override
    public String getSpelling()
    {
        return CxString.unwrapAndClose(runtime.getLibClang().clang_getCursorSpelling(this));
    }

    @Override
    public CxType getType()
    {
        return runtime.getLibClang().clang_getCursorType(this);
    }

    @Override
    public CxType getTypedefDeclUnderlyingType()
    {
        return runtime.getLibClang().clang_getTypedefDeclUnderlyingType(this);
    }

    @Override
    public CxType getEnumDeclIntegerType()
    {
        return runtime.getLibClang().clang_getEnumDeclIntegerType(this);
    }

    @Override
    public long getEnumConstantDeclValue()
    {
        return runtime.getLibClang().clang_getEnumConstantDeclValue(this);
    }

    @Override
    public long getEnumConstantDeclUnsignedValue()
    {
        return runtime.getLibClang().clang_getEnumConstantDeclUnsignedValue(this);
    }

    @Override
    public int getFieldDeclBitWidth()
    {
        return runtime.getLibClang().clang_getFieldDeclBitWidth(this);
    }

    @Override
    public int getNumArguments()
    {
        return runtime.getLibClang().clang_Cursor_getNumArguments(this);
    }

    @Override
    public CxCursor getArgument(int i)
    {
        return runtime.getLibClang().clang_Cursor_getArgument(this, i);
    }

    @Override
    public int getNumTemplateArguments()
    {
        return runtime.getLibClang().clang_Cursor_getNumTemplateArguments(this);
    }

    @Override
    public CxTemplateArgumentKind getTemplateArgumentKind(int i)
    {
        return runtime.getLibClang().clang_Cursor_getTemplateArgumentKind(this, i);
    }

    @Override
    public CxType getTemplateArgumentType(int i)
    {
        return runtime.getLibClang().clang_Cursor_getTemplateArgumentType(this, i);
    }

    @Override
    public long getTemplateArgumentValue(int i)
    {
        return runtime.getLibClang().clang_Cursor_getTemplateArgumentValue(this, i);
    }

    @Override
    public long getTemplateArgumentUnsignedValue(int i)
    {
        return runtime.getLibClang().clang_Cursor_getTemplateArgumentUnsignedValue(this, i);
    }

    @Override
    public boolean isMacroFunctionLike()
    {
        return runtime.getLibClang().clang_Cursor_isMacroFunctionLike(this);
    }

    @Override
    public boolean isMacroBuiltin()
    {
        return runtime.getLibClang().clang_Cursor_isMacroBuiltin(this);
    }

    @Override
    public boolean isFunctionInlined()
    {
        return runtime.getLibClang().clang_Cursor_isFunctionInlined(this);
    }

    @Override
    public String getDeclObjCTypeEncoding()
    {
        return CxString.unwrapAndClose(runtime.getLibClang().clang_getDeclObjCTypeEncoding(this));
    }

    @Override
    public CxType getCursorResultType()
    {
        return runtime.getLibClang().clang_getCursorResultType(this);
    }

    @Override
    public long getOffsetOfField()
    {
        return runtime.getLibClang().clang_Cursor_getOffsetOfField(this);
    }

    @Override
    public boolean isAnonymous()
    {
        return runtime.getLibClang().clang_Cursor_isAnonymous(this);
    }

    @Override
    public boolean isBitField()
    {
        return runtime.getLibClang().clang_Cursor_isBitField(this);
    }

    @Override
    public boolean isVirtualBase()
    {
        return runtime.getLibClang().clang_isVirtualBase(this);
    }

    @Override
    public CxCxxAccessSpecifier getCXXAccessSpecifier()
    {
        return runtime.getLibClang().clang_getCXXAccessSpecifier(this);
    }

    @Override
    public CxStorageClass getStorageClass()
    {
        return runtime.getLibClang().clang_Cursor_getStorageClass(this);
    }

    @Override
    public int getNumOverloadedDecls()
    {
        return runtime.getLibClang().clang_getNumOverloadedDecls(this);
    }

    @Override
    public CxCursor getOverloadedDecl(int index)
    {
        return runtime.getLibClang().clang_getOverloadedDecl(this, index);
    }

    @Override
    public CxType getIBOutletCollectionType()
    {
        return runtime.getLibClang().clang_getIBOutletCollectionType(this);
    }

    @Override
    public String getCursorUSR()
    {
        return CxString.unwrapAndClose(runtime.getLibClang().clang_getCursorUSR(this));
    }

    @Override
    public String getCursorSpelling()
    {
        return CxString.unwrapAndClose(runtime.getLibClang().clang_getCursorSpelling(this));
    }

    @Override
    public CxSourceRange getSpellingNameRange(int pieceIndex, int options)
    {
        return runtime.getLibClang().clang_Cursor_getSpellingNameRange(this, pieceIndex, options);
    }

    @Override
    public String getCursorDisplayName()
    {
        return CxString.unwrapAndClose(runtime.getLibClang().clang_getCursorDisplayName(this));
    }

    @Override
    public CxCursor getCursorReferenced()
    {
        return runtime.getLibClang().clang_getCursorReferenced(this);
    }

    @Override
    public CxCursor getCursorDefinition()
    {
        return runtime.getLibClang().clang_getCursorDefinition(this);
    }

    @Override
    public boolean isCursorDefinition()
    {
        return runtime.getLibClang().clang_isCursorDefinition(this);
    }

    @Override
    public CxCursor getCanonicalCursor()
    {
        return runtime.getLibClang().clang_getCanonicalCursor(this);
    }

    @Override
    public int getObjCSelectorIndex()
    {
        return runtime.getLibClang().clang_Cursor_getObjCSelectorIndex(this);
    }

    @Override
    public boolean isDynamicCall()
    {
        return runtime.getLibClang().clang_Cursor_isDynamicCall(this);
    }

    @Override
    public CxType getReceiverType()
    {
        return runtime.getLibClang().clang_Cursor_getReceiverType(this);
    }

    @Override
    public CxSourceRange getCommentRange()
    {
        return runtime.getLibClang().clang_Cursor_getCommentRange(this);
    }

    @Override
    public String getRawCommentText()
    {
        return CxString.unwrapAndClose(runtime.getLibClang().clang_Cursor_getRawCommentText(this));
    }

    @Override
    public String getBriefCommentText()
    {
        return CxString.unwrapAndClose(runtime.getLibClang().clang_Cursor_getBriefCommentText(this));
    }

    @Override
    public String getMangling()
    {
        return CxString.unwrapAndClose(runtime.getLibClang().clang_Cursor_getMangling(this));
    }

    @Override
    public CxModule getModule()
    {
        return runtime.getLibClang().clang_Cursor_getModule(this);
    }

    @Override
    public CxCursorKind getTemplateCursorKind()
    {
        return runtime.getLibClang().clang_getTemplateCursorKind(this);
    }

    @Override
    public CxCursor getSpecializedCursorTemplate()
    {
        return runtime.getLibClang().clang_getSpecializedCursorTemplate(this);
    }

    @Override
    public CxSourceRange getCursorReferenceNameRange(int nameFlags, int pieceIndex)
    {
        return runtime.getLibClang().clang_getCursorReferenceNameRange(this, nameFlags, pieceIndex);
    }

    @Override
    public CxEvalValue evaluate()
    {
        return CxEvalResult.unwrapAndClose(runtime.getLibClang().clang_Cursor_Evaluate(this));
    }
}
