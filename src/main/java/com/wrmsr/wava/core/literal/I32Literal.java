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
package com.wrmsr.wava.core.literal;

import com.google.common.primitives.UnsignedInteger;
import com.wrmsr.wava.core.type.Type;

import javax.annotation.concurrent.Immutable;

import static com.google.common.base.Preconditions.checkState;

@Immutable
public final class I32Literal
        extends Literal<I32Literal, Integer>
{
    public I32Literal(int value)
    {
        super(value);
    }

    public I32Literal(long bits)
    {
        super(bits & 0xffffffffL);
    }

    @Override
    public <C, R> R accept(LiteralVisitor<C, R> visitor, C context)
    {
        return visitor.visitI32(this, context);
    }

    public int get()
    {
        return (int) bits;
    }

    public long getU()
    {
        checkState((bits & 0xffffffff00000000L) == 0);
        return bits;
    }

    public UnsignedInteger u()
    {
        return UnsignedInteger.valueOf(bits);
    }

    @Override
    public String toString()
    {
        return "i32{" + get() + '}';
    }

    @Override
    public Type getType()
    {
        return Type.I32;
    }

    @Override
    public Integer getValue()
    {
        return get();
    }

    @Override
    public void innerPrint(StringBuilder sb)
    {
        sb.append(get());
    }

    @Override
    public F32Literal truncateToF32()
    {
        return new F32Literal(bits);
    }

    @Override
    public int getI32()
    {
        return get();
    }

    @Override
    public long getInteger()
    {
        return get();
    }

    @Override
    public I32Literal countLeadingZeroes()
    {
        return new I32Literal(Integer.numberOfLeadingZeros(get()));
    }

    @Override
    public I32Literal countTrailingZeroes()
    {
        return new I32Literal(Integer.numberOfLeadingZeros(get()));
    }

    @Override
    public I32Literal popCount()
    {
        return of(Integer.bitCount(get()));
    }

    @Override
    public I64Literal extendToSI64()
    {
        return of((long) get());
    }

    @Override
    public I64Literal extendToUI64()
    {
        return of(getU());
    }

    @Override
    public F32Literal convertSToF32()
    {
        return of((float) get());
    }

    @Override
    public F32Literal convertUToF32()
    {
        return of((float) getU());
    }

    @Override
    public F64Literal convertSToF64()
    {
        return of((double) get());
    }

    @Override
    public F64Literal convertUToF64()
    {
        return of((double) getU());
    }

    @Override
    public I32Literal neg()
    {
        return new I32Literal(bits ^ 0x80000000);
    }

    @Override
    public I32Literal abs()
    {
        return new I32Literal(bits & 0x7fffffff);
    }
}
