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

import com.wrmsr.wava.core.type.Type;

import javax.annotation.concurrent.Immutable;

@Immutable
public final class F32Literal
        extends Literal<F32Literal, Float>
{
    public F32Literal(float value)
    {
        super(Float.floatToRawIntBits(value) & 0xffffffffL);
    }

    public F32Literal(long bits)
    {
        super(bits & 0xffffffffL);
    }

    @Override
    public <C, R> R accept(LiteralVisitor<C, R> visitor, C context)
    {
        return visitor.visitF32(this, context);
    }

    public static String render(float f)
    {
        if (Float.isNaN(f)) {
            String text = (Math.signum(f) < 0 ? "-" : "") + "nan";
            int bits = Float.floatToRawIntBits(f);
            int payload = ~0xff800000 & bits;
            if (payload != 0) {
                // FIXME neg?
                text += ":0x" + Integer.toString(payload, 16);
            }
            return text;
        }
        return F64Literal.render(f);
    }

    public float get()
    {
        return Float.intBitsToFloat((int) bits);
    }

    @Override
    public String toString()
    {
        return "f32{" + get() + '}';
    }

    @Override
    public Type getType()
    {
        return Type.F32;
    }

    @Override
    public Float getValue()
    {
        return get();
    }

    @Override
    public void innerPrint(StringBuilder sb)
    {
        sb.append(render(get()));
    }

    @Override
    public I32Literal toI32()
    {
        return new I32Literal(bits);
    }

    @Override
    public I32Literal truncateToI32()
    {
        return new I32Literal(bits);
    }

    @Override
    public float getF32()
    {
        return get();
    }

    @Override
    public double getFloat()
    {
        return get();
    }

    @Override
    public F64Literal extendToF64()
    {
        return of((double) get());
    }

    @Override
    public F32Literal neg()
    {
        return new F32Literal(bits ^ 0x80000000);
    }

    @Override
    public F32Literal abs()
    {
        return new F32Literal(bits & 0x7fffffff);
    }

    @Override
    public F32Literal ceil()
    {
        return of((float) Math.ceil(get()));
    }

    @Override
    public F32Literal floor()
    {
        return of((float) Math.floor(get()));
    }
}
