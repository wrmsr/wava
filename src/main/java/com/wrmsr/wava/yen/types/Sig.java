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
package com.wrmsr.wava.yen.types;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.util.Box;

import java.util.Arrays;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public final class Sig
        extends Box<String>
{
    public Sig(String value)
    {
        super(value);
    }

    public static Sig of(String value)
    {
        return new Sig(value);
    }

    public static Sig of(Sig... sigs)
    {
        return of(Joiner.on("").join(Arrays.stream(sigs).map(Sig::get).collect(toList())));
    }

    public static Sig of(Type type)
    {
        switch (type) {
            case I32:
                return of("i");
            case I64:
                return of("j");
            case F32:
                return of("f");
            case F64:
                return of("d");
            case NONE:
                return of("v");
            default:
                throw new IllegalArgumentException();
        }
    }

    public Type toType()
    {
        switch (value) {
            case "i":
                return Type.I32;
            case "j":
                return Type.I64;
            case "f":
                return Type.F32;
            case "d":
                return Type.F64;
            case "v":
                return Type.NONE;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static Sig of(NamedFunctionType namedFunctionType)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(of(namedFunctionType.getResult()).get());
        for (Type param : namedFunctionType.getParams()) {
            sb.append(of(param).get());
        }
        return of(sb.toString());
    }

    public NamedFunctionType toFunctionType()
    {
        Type result = of(value.substring(0, 1)).toType();
        ImmutableList.Builder<Type> builder = ImmutableList.builder();
        for (int i = 1; i < value.length(); ++i) {
            builder.add(of(value.substring(i, i + 1)).toType());
        }
        return new NamedFunctionType(Optional.empty(), result, builder.build());
    }
}
