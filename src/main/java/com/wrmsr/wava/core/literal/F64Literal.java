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
public final class F64Literal
        extends Literal<F64Literal, Double>
{
    public F64Literal(double value)
    {
        super(Double.doubleToRawLongBits(value));
    }

    public F64Literal(long bits)
    {
        super(bits);
    }

    @Override
    public <C, R> R accept(LiteralVisitor<C, R> visitor, C context)
    {
        return visitor.visitF64(this, context);
    }

    public static String render(double d)
    {
        if (d == 0 && Math.signum(d) < 0) {
            return "-0";
        }
        if (Double.isNaN(d)) {
            String text = (Math.signum(d) < 0 ? "-" : "") + "nan";
            long bits = Double.doubleToRawLongBits(d);
            long payload = ~0xfff0000000000000L & bits;
            if (payload != 0) {
                // FIXME neg?
                text += ":0x" + Long.toString(payload, 16);
            }
            return text;
        }
        if (!Double.isFinite(d)) {
            return Math.signum(d) < 0 ? "-infinity" : "infinity";
        }
        String text = Double.toString(d);
        // spec interpreter hates floats starting with '.'
        if (text.charAt(0) == '.') {
            text = "0" + text;
        }
        else if (text.charAt(0) == '-' && text.charAt(1) == '.') {
            text = "-0" + text;
        }
        return text;
    }

    public double get()
    {
        return Double.longBitsToDouble(bits);
    }

    @Override
    public String toString()
    {
        return "f64{" + get() + '}';
    }

    @Override
    public Type getType()
    {
        return Type.F64;
    }

    @Override
    public Double getValue()
    {
        return get();
    }

    @Override
    public void innerPrint(StringBuilder sb)
    {
        sb.append(render(get()));
    }

    @Override
    public I64Literal toI64()
    {
        return new I64Literal(bits);
    }

    @Override
    public double getF64()
    {
        return get();
    }

    @Override
    public double getFloat()
    {
        return get();
    }

    @Override
    public F32Literal truncateToF32()
    {
        return of((float) get());
    }

    @Override
    public F64Literal neg()
    {
        return new F64Literal(bits ^ 0x8000000000000000L);
    }

    @Override
    public F64Literal abs()
    {
        return new F64Literal(bits & 0x7fffffffffffffffL);
    }

    @Override
    public Literal ceil()
    {
        return of(Math.ceil(get()));
    }

    @Override
    public Literal floor()
    {
        return of(Math.floor(get()));
    }
}
