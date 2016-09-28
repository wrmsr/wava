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
import com.wrmsr.wava.clang.api.CxCallingConv;
import com.wrmsr.wava.clang.api.CxCursor;
import com.wrmsr.wava.clang.api.CxRefQualifierKind;
import com.wrmsr.wava.clang.api.CxString;
import com.wrmsr.wava.clang.api.CxType;

import static com.kenai.jffi.Array.newArray;
import static com.kenai.jffi.Struct.newStruct;

final class JffiCxType
        extends JffiStruct
        implements CxType
{
    static final Descriptor<JffiCxType> DESCRIPTOR = new Descriptor<>(
            JffiCxType.class,
            JffiCxType::new,
            newStruct(
                    Type.UINT32,
                    newArray(Type.POINTER, 2)));

    JffiCxType(JffiCxRuntime runtime, byte[] struct)
    {
        super(runtime, struct);
    }

    @Override
    public String getSpelling()
    {
        return CxString.unwrap(runtime.getLibClang().clang_getTypeSpelling(this));
    }

    @Override
    public CxType getCanonicalType()
    {
        return runtime.getLibClang().clang_getCanonicalType(this);
    }

    @Override
    public boolean isConstQualifiedType()
    {
        return runtime.getLibClang().clang_isConstQualifiedType(this);
    }

    @Override
    public boolean isVolatileQualifiedType()
    {
        return runtime.getLibClang().clang_isVolatileQualifiedType(this);
    }

    @Override
    public boolean isRestrictQualifiedType()
    {
        return runtime.getLibClang().clang_isRestrictQualifiedType(this);
    }

    @Override
    public CxType getPointeeType()
    {
        return runtime.getLibClang().clang_getPointeeType(this);
    }

    @Override
    public CxCursor getTypeDeclaration()
    {
        return runtime.getLibClang().clang_getTypeDeclaration(this);
    }

    @Override
    public CxCallingConv getFunctionTypeCallingConv()
    {
        return runtime.getLibClang().clang_getFunctionTypeCallingConv(this);
    }

    @Override
    public CxType getResultType()
    {
        return runtime.getLibClang().clang_getResultType(this);
    }

    @Override
    public int getNumArgTypes()
    {
        return runtime.getLibClang().clang_getNumArgTypes(this);
    }

    @Override
    public CxType getArgType(int i)
    {
        return runtime.getLibClang().clang_getArgType(this, i);
    }

    @Override
    public boolean isFunctionTypeVariadic()
    {
        return runtime.getLibClang().clang_isFunctionTypeVariadic(this);
    }

    @Override
    public CxType getElementType()
    {
        return runtime.getLibClang().clang_getElementType(this);
    }

    @Override
    public long getNumElements()
    {
        return runtime.getLibClang().clang_getNumElements(this);
    }

    @Override
    public CxType getArrayElementType()
    {
        return runtime.getLibClang().clang_getArrayElementType(this);
    }

    @Override
    public long getArraySize()
    {
        return runtime.getLibClang().clang_getArraySize(this);
    }

    @Override
    public CxType getNamedType()
    {
        return runtime.getLibClang().clang_Type_getNamedType(this);
    }

    @Override
    public long getAlignOf()
    {
        return runtime.getLibClang().clang_Type_getAlignOf(this);
    }

    @Override
    public CxType getClassType()
    {
        return runtime.getLibClang().clang_Type_getClassType(this);
    }

    @Override
    public long getSizeOf()
    {
        return runtime.getLibClang().clang_Type_getSizeOf(this);
    }

    @Override
    public long getOffsetOf(String s)
    {
        return runtime.getLibClang().clang_Type_getOffsetOf(this, s);
    }

    @Override
    public int getNumTemplateArguments()
    {
        return runtime.getLibClang().clang_Type_getNumTemplateArguments(this);
    }

    @Override
    public CxType getTemplateArgumentAsType(int i)
    {
        return runtime.getLibClang().clang_Type_getTemplateArgumentAsType(this, i);
    }

    @Override
    public CxRefQualifierKind getCXXRefQualifier()
    {
        return runtime.getLibClang().clang_Type_getCXXRefQualifier(this);
    }
}
