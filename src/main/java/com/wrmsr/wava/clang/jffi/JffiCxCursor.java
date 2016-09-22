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
import com.wrmsr.wava.clang.CxCursor;
import com.wrmsr.wava.clang.CxCursorKind;
import com.wrmsr.wava.clang.CxCursorVisitor;
import com.wrmsr.wava.clang.CxString;
import com.wrmsr.wava.clang.CxType;

import java.math.BigInteger;

import static com.kenai.jffi.Array.newArray;
import static com.kenai.jffi.Struct.newStruct;
import static com.wrmsr.wava.clang.jffi.JffiUtils.Address;

@SuppressWarnings("WeakerAccess")
public final class JffiCxCursor
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
        return CxString.unwrap(runtime.getLibClang().clang_getCursorSpelling(this));
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
    public BigInteger getEnumConstantDeclValue()
    {
        return runtime.getLibClang().clang_getEnumConstantDeclValue(this);
    }

    @Override
    public BigInteger getEnumConstantDeclUnsignedValue()
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
}
