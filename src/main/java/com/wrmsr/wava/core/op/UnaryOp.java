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
package com.wrmsr.wava.core.op;

import com.google.common.collect.ImmutableMap;
import com.wrmsr.wava.core.type.Type;

import java.util.Map;
import java.util.Set;

import static com.google.common.collect.Sets.immutableEnumSet;
import static com.wrmsr.wava.core.type.Types.ANY_TO_ANY_MAP;
import static com.wrmsr.wava.core.type.Types.FLOAT_TO_FLOAT_MAP;
import static com.wrmsr.wava.core.type.Types.FLOAT_TO_INTS_MAP;
import static com.wrmsr.wava.core.type.Types.INT_TO_FLOATS_MAP;
import static com.wrmsr.wava.core.type.Types.INT_TO_I32_MAP;
import static com.wrmsr.wava.core.type.Types.INT_TO_INT_MAP;

public enum UnaryOp
{
    // int
    Clz(INT_TO_INT_MAP),
    Ctz(INT_TO_INT_MAP),
    Popcnt(INT_TO_INT_MAP),

    // int/float
    Neg(ANY_TO_ANY_MAP),
    Abs(ANY_TO_ANY_MAP),

    // float
    Ceil(FLOAT_TO_FLOAT_MAP),
    Floor(FLOAT_TO_FLOAT_MAP),
    Trunc(FLOAT_TO_FLOAT_MAP),
    Nearest(FLOAT_TO_FLOAT_MAP),
    Sqrt(FLOAT_TO_FLOAT_MAP),

    // relational
    EqZ(INT_TO_I32_MAP),

    // int conversions
    ExtendSInt32(ImmutableMap.of(Type.I32, immutableEnumSet(Type.I64))),
    ExtendUInt32(ImmutableMap.of(Type.I32, immutableEnumSet(Type.I64))),
    WrapInt64(ImmutableMap.of(Type.I64, immutableEnumSet(Type.I32))),

    TruncSFloat32(FLOAT_TO_INTS_MAP),
    TruncUFloat32(FLOAT_TO_INTS_MAP),
    TruncSFloat64(FLOAT_TO_INTS_MAP),
    TruncUFloat64(FLOAT_TO_INTS_MAP),

    ReinterpretFloat(ImmutableMap.of(Type.F32, immutableEnumSet(Type.I32), Type.F64, immutableEnumSet(Type.I64))),

    // float conversions
    ConvertSInt32(INT_TO_FLOATS_MAP),
    ConvertUInt32(INT_TO_FLOATS_MAP),
    ConvertSInt64(INT_TO_FLOATS_MAP),
    ConvertUInt64(INT_TO_FLOATS_MAP),

    PromoteFloat32(ImmutableMap.of(Type.F32, immutableEnumSet(Type.F64))),
    DemoteFloat64(ImmutableMap.of(Type.F64, immutableEnumSet(Type.F32))),

    ReinterpretInt(ImmutableMap.of(Type.I32, immutableEnumSet(Type.F32), Type.I64, immutableEnumSet(Type.F64))),;

    private final Map<Type, Set<Type>> typeMap;

    UnaryOp(Map<Type, Set<Type>> typeMap)
    {
        this.typeMap = ImmutableMap.copyOf(typeMap);
    }

    public Map<Type, Set<Type>> getTypeMap()
    {
        return typeMap;
    }
}
