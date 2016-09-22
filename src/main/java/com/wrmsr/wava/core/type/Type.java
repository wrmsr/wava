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
package com.wrmsr.wava.core.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;
import java.util.Map;

import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableMap;
import static java.util.function.Function.identity;

public enum Type
{
    NONE {
        @Override
        public String getName()
        {
            return "NONE";
        }

        @Override
        public char getChar()
        {
            return 'v';
        }

        @Override
        public int getSize()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean isFloat()
        {
            return false;
        }

        @Override
        public boolean isConcrete()
        {
            return false;
        }

        @Override
        public Class<?> getPrimitive()
        {
            return void.class;
        }

        @Override
        public Class<?> getBox()
        {
            return Void.class;
        }

        @Override
        public Object fromString(String str)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public Object zero()
        {
            return null;
        }
    },

    I32 {
        @Override
        public String getName()
        {
            return "I32";
        }

        @Override
        public char getChar()
        {
            return 'i';
        }

        @Override
        public int getSize()
        {
            return 4;
        }

        @Override
        public boolean isFloat()
        {
            return false;
        }

        @Override
        public boolean isConcrete()
        {
            return true;
        }

        @Override
        public Class<?> getPrimitive()
        {
            return int.class;
        }

        @Override
        public Class<?> getBox()
        {
            return Integer.class;
        }

        @Override
        public Object fromString(String str)
        {
            return Integer.parseInt(str);
        }

        @Override
        public Integer zero()
        {
            return 0;
        }
    },

    I64 {
        @Override
        public String getName()
        {
            return "I64";
        }

        @Override
        public char getChar()
        {
            return 'l';
        }

        @Override
        public int getSize()
        {
            return 8;
        }

        @Override
        public boolean isFloat()
        {
            return false;
        }

        @Override
        public boolean isConcrete()
        {
            return true;
        }

        @Override
        public Class<?> getPrimitive()
        {
            return long.class;
        }

        @Override
        public Class<?> getBox()
        {
            return Long.class;
        }

        @Override
        public Object fromString(String str)
        {
            return Long.parseLong(str);
        }

        @Override
        public Long zero()
        {
            return 0L;
        }
    },

    F32 {
        @Override
        public String getName()
        {
            return "F32";
        }

        @Override
        public char getChar()
        {
            return 'f';
        }

        @Override
        public int getSize()
        {
            return 4;
        }

        @Override
        public boolean isFloat()
        {
            return true;
        }

        @Override
        public boolean isConcrete()
        {
            return true;
        }

        @Override
        public Class<?> getPrimitive()
        {
            return float.class;
        }

        @Override
        public Class<?> getBox()
        {
            return Float.class;
        }

        @Override
        public Object fromString(String str)
        {
            return Float.parseFloat(str);
        }

        @Override
        public Float zero()
        {
            return 0.0f;
        }
    },

    F64 {
        @Override
        public String getName()
        {
            return "F64";
        }

        @Override
        public char getChar()
        {
            return 'd';
        }

        @Override
        public int getSize()
        {
            return 8;
        }

        @Override
        public boolean isFloat()
        {
            return true;
        }

        @Override
        public boolean isConcrete()
        {
            return true;
        }

        @Override
        public Class<?> getPrimitive()
        {
            return double.class;
        }

        @Override
        public Class<?> getBox()
        {
            return Double.class;
        }

        @Override
        public Object fromString(String str)
        {
            return Double.parseDouble(str);
        }

        @Override
        public Double zero()
        {
            return 0.0;
        }
    },

    // NONE means no type, e.g. a block can have no return type. but
    // UNREACHABLE is different, as it can be "ignored" when doing
    // type checking across branches
    UNREACHABLE {
        @Override
        public String getName()
        {
            return "UNREACHABLE";
        }

        @Override
        public char getChar()
        {
            return 'x';
        }

        @Override
        public int getSize()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean isFloat()
        {
            return false;
        }

        @Override
        public boolean isConcrete()
        {
            return false;
        }

        @Override
        public Class<?> getPrimitive()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public Class<?> getBox()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public Object fromString(String str)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public Object zero()
        {
            throw new UnsupportedOperationException();
        }
    };

    public static Type of(int size, boolean isFloat)
    {
        if (size < 4) {
            return Type.I32;
        }
        if (size == 4) {
            return isFloat ? Type.F32 : Type.I32;
        }
        if (size == 8) {
            return isFloat ? Type.F64 : Type.I64;
        }
        throw new IllegalArgumentException();
    }

    public static final Map<String, Type> NAME_MAP = Arrays.stream(Type.values()).collect(toImmutableMap(Type::getName, identity()));

    public static final Map<Character, Type> CHAR_MAP = Arrays.stream(Type.values()).collect(toImmutableMap(Type::getChar, identity()));

    public static Type of(char c)
    {
        return CHAR_MAP.get(c);
    }

    @JsonCreator
    public static Type of(String str)
    {
        return NAME_MAP.get(str.toUpperCase());
    }

    public static Type of(String str, boolean allowError)
    {
        return of(str, allowError, false);
    }

    public static Type of(String str, boolean allowError, boolean prefix)
    {
        if (str.charAt(0) == 'i' || str.charAt(0) == 'I') {
            if (str.charAt(1) == '3' && str.charAt(2) == '2' && (prefix || str.length() == 3)) {
                return Type.I32;
            }
            if (str.charAt(1) == '6' && str.charAt(2) == '4' && (prefix || str.length() == 3)) {
                return Type.I64;
            }
        }
        if (str.charAt(0) == 'f' || str.charAt(0) == 'F') {
            if (str.charAt(1) == '3' && str.charAt(2) == '2' && (prefix || str.length() == 3)) {
                return Type.F32;
            }
            if (str.charAt(1) == '6' && str.charAt(2) == '4' && (prefix || str.length() == 3)) {
                return Type.F64;
            }
        }
        if (allowError) {
            return Type.NONE;
        }
        throw new IllegalStateException();
    }

    @JsonValue
    @Override
    public String toString()
    {
        return getName();
    }

    public static Type getReachable(Type a, Type b)
    {
        return a != UNREACHABLE ? a : b;
    }

    public abstract String getName();

    public abstract char getChar();

    public abstract int getSize();

    public abstract boolean isFloat();

    public abstract boolean isConcrete();

    public abstract Class<?> getPrimitive();

    public abstract Class<?> getBox();

    public abstract Object fromString(String str);

    public abstract Object zero();
}
