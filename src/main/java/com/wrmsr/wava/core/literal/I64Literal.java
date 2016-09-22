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

import com.google.common.primitives.UnsignedLong;
import com.wrmsr.wava.core.type.Type;

import javax.annotation.concurrent.Immutable;

@Immutable
public final class I64Literal
        extends Literal<I64Literal, Long>
{
    public I64Literal(long value)
    {
        super(value);
    }

    @Override
    public <C, R> R accept(LiteralVisitor<C, R> visitor, C context)
    {
        return visitor.visitI64(this, context);
    }

    public long get()
    {
        return bits;
    }

    public UnsignedLong u()
    {
        return UnsignedLong.valueOf(bits);
    }

    @Override
    public String toString()
    {
        return "i64{" + get() + '}';
    }

    @Override
    public Type getType()
    {
        return Type.I64;
    }

    @Override
    public Long getValue()
    {
        return get();
    }

    @Override
    protected void innerPrint(StringBuilder sb)
    {
        sb.append(get());
    }

    @Override
    public F64Literal toF64()
    {
        return new F64Literal(bits);
    }

    @Override
    public long getI64()
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
        return of(Long.numberOfLeadingZeros(get()));
    }

    @Override
    public I32Literal countTrailingZeroes()
    {
        return of(Long.numberOfLeadingZeros(get()));
    }

    @Override
    public I32Literal popCount()
    {
        return of(Long.bitCount(get()));
    }

    @Override
    public I32Literal truncateToI32()
    {
        return of((int) get());
    }

    @Override
    public F32Literal convertSToF32()
    {
        return of((float) get());
    }

    @Override
    public F32Literal convertUToF32()
    {
        return of(u().floatValue());
    }

    @Override
    public F64Literal convertSToF64()
    {
        return of((double) get());
    }

    @Override
    public F64Literal convertUToF64()
    {
        return of(u().doubleValue());
    }

    @Override
    public I64Literal neg()
    {
        return new I64Literal(bits ^ 0x8000000000000000L);
    }

    @Override
    public Literal abs()
    {
        return new I64Literal(bits & 0x7fffffffffffffffL);
    }
}
