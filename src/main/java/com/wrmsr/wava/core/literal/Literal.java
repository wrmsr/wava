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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.collect.ImmutableMap;
import com.wrmsr.wava.core.type.Type;

import javax.annotation.concurrent.Immutable;

import java.util.Map;
import java.util.Objects;

import static com.google.common.base.Preconditions.checkArgument;
import static java.util.Objects.requireNonNull;

@Immutable
public abstract class Literal<Self, Value>
{
    // FIXME: human readability

    @JsonValue
    public final Object jsonValue()
    {
        return ImmutableMap.of(getType().getName(), "0x" + Long.toString(getBits(), 16));
    }

    @JsonCreator
    public static Literal jsonCreator(Map<String, String> object)
    {
        if (object == null) {
            return null;
        }
        checkArgument(object.size() == 1);
        Map.Entry<String, String> e = object.entrySet().iterator().next();
        String key = requireNonNull(e.getKey());
        String value = requireNonNull(e.getValue());
        Type type = Type.of(key);
        checkArgument(value.startsWith("0x") && value.length() > 2);
        long bits = Long.parseLong(value.substring(2), 16);
        return of(type, bits);
    }

    protected final long bits;

    public Literal(long bits)
    {
        this.bits = bits;
    }

    public abstract <C, R> R accept(LiteralVisitor<C, R> visitor, C context);

    public static Literal of(Type type, long bits)
    {
        switch (type) {
            case I32:
                return new I32Literal(bits);
            case I64:
                return new I64Literal(bits);
            case F32:
                return new F32Literal(bits);
            case F64:
                return new F64Literal(bits);
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static I32Literal of(boolean value)
    {
        return value ? new I32Literal(1) : new I32Literal(0);
    }

    public static I32Literal of(int value)
    {
        return new I32Literal(value);
    }

    public static I64Literal of(long value)
    {
        return new I64Literal(value);
    }

    public static F32Literal of(float value)
    {
        return new F32Literal(Float.floatToRawIntBits(value));
    }

    public static F64Literal of(double value)
    {
        return new F64Literal(Double.doubleToRawLongBits(value));
    }

    public static Literal of(Object value)
    {
        if (value instanceof Integer) {
            return new I32Literal((Integer) value);
        }
        else if (value instanceof Long) {
            return new I64Literal((Long) value);
        }
        else if (value instanceof Float) {
            return new F32Literal((Float) value);
        }
        else if (value instanceof Double) {
            return new F64Literal((Double) value);
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public final long getBits()
    {
        return bits;
    }

    @Override
    public final boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Literal<?, ?> literal = (Literal<?, ?>) o;
        return bits == literal.bits;
    }

    @Override
    public final int hashCode()
    {
        return Objects.hash(bits);
    }

    public abstract Type getType();

    public abstract Value getValue();

    protected abstract void innerPrint(StringBuilder sb);

    public F32Literal toF32()
    {
        throw new UnsupportedOperationException();
    }

    public F64Literal toF64()
    {
        throw new UnsupportedOperationException();
    }

    public I32Literal toI32()
    {
        throw new UnsupportedOperationException();
    }

    public I64Literal toI64()
    {
        throw new UnsupportedOperationException();
    }

    public int getI32()
    {
        throw new UnsupportedOperationException();
    }

    public long getI64()
    {
        throw new UnsupportedOperationException();
    }

    public float getF32()
    {
        throw new UnsupportedOperationException();
    }

    public double getF64()
    {
        throw new UnsupportedOperationException();
    }

    public long getInteger()
    {
        throw new UnsupportedOperationException();
    }

    public double getFloat()
    {
        throw new UnsupportedOperationException();
    }

    public I32Literal countLeadingZeroes()
    {
        throw new UnsupportedOperationException();
    }

    public I32Literal countTrailingZeroes()
    {
        throw new UnsupportedOperationException();
    }

    public I32Literal popCount()
    {
        throw new UnsupportedOperationException();
    }

    public I64Literal extendToSI64()
    {
        throw new UnsupportedOperationException();
    }

    public I64Literal extendToUI64()
    {
        throw new UnsupportedOperationException();
    }

    public F64Literal extendToF64()
    {
        throw new UnsupportedOperationException();
    }

    public I32Literal truncateToI32()
    {
        throw new UnsupportedOperationException();
    }

    public F32Literal truncateToF32()
    {
        throw new UnsupportedOperationException();
    }

    public F32Literal convertSToF32()
    {
        throw new UnsupportedOperationException();
    }

    public F32Literal convertUToF32()
    {
        throw new UnsupportedOperationException();
    }

    public F64Literal convertSToF64()
    {
        throw new UnsupportedOperationException();
    }

    public F64Literal convertUToF64()
    {
        throw new UnsupportedOperationException();
    }

    public Literal neg()
    {
        throw new UnsupportedOperationException();
    }

    public Literal abs()
    {
        throw new UnsupportedOperationException();
    }

    public Literal ceil()
    {
        throw new UnsupportedOperationException();
    }

    public Literal floor()
    {
        throw new UnsupportedOperationException();
    }

    public Literal trunc()
    {
        throw new UnsupportedOperationException();
    }

    public Literal nearbyint()
    {
        throw new UnsupportedOperationException();
    }

    public Literal sqrt()
    {
        throw new UnsupportedOperationException();
    }

    public Literal add(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal sub(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal mul(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal div(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal divS(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal divU(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal remS(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal remU(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal and_(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal or_(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal xor_(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal shl(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal shrS(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal shrU(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal rotL(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal rotR(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal eq(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal ne(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal ltS(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal ltU(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal lt(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal leS(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal leU(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal le(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal gtS(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal gtU(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal gt(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal geS(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal geU(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal ge(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal min(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal max(Literal other)
    {
        throw new UnsupportedOperationException();
    }

    public Literal copySign(Literal other)
    {
        throw new UnsupportedOperationException();
    }
}
