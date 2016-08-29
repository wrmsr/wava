/* * Licensed under the Apache License, Version 2.0 (the "License");
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
import org.apache.commons.lang3.tuple.Pair;

import java.util.Map;

import static com.google.common.base.Preconditions.checkArgument;
import static com.wrmsr.wava.core.type.Types.ANYS_TO_ANY_MAP;
import static com.wrmsr.wava.core.type.Types.ANYS_TO_I32_MAP;
import static com.wrmsr.wava.core.type.Types.FLOATS_TO_FLOAT_MAP;
import static com.wrmsr.wava.core.type.Types.FLOATS_TO_I32_MAP;
import static com.wrmsr.wava.core.type.Types.INTS_TO_I32_MAP;
import static com.wrmsr.wava.core.type.Types.INTS_TO_INT_MAP;

public enum BinaryOp
{
    // int or float
    Add(ANYS_TO_ANY_MAP),
    Sub(ANYS_TO_ANY_MAP),
    Mul(ANYS_TO_ANY_MAP),

    // int
    DivS(INTS_TO_INT_MAP),
    DivU(INTS_TO_INT_MAP),
    RemS(INTS_TO_INT_MAP),
    RemU(INTS_TO_INT_MAP),
    And(INTS_TO_INT_MAP),
    Or(INTS_TO_INT_MAP),
    Xor(INTS_TO_INT_MAP),
    Shl(INTS_TO_INT_MAP),
    ShrU(INTS_TO_INT_MAP),
    ShrS(INTS_TO_INT_MAP),
    RotL(INTS_TO_INT_MAP),
    RotR(INTS_TO_INT_MAP),

    // float
    Div(FLOATS_TO_FLOAT_MAP),
    CopySign(FLOATS_TO_FLOAT_MAP),
    Min(FLOATS_TO_FLOAT_MAP),
    Max(FLOATS_TO_FLOAT_MAP),

    // relational ops
    Eq(ANYS_TO_I32_MAP, true),
    Ne(ANYS_TO_I32_MAP, true),

    // int
    LtS(INTS_TO_I32_MAP, true),
    LtU(INTS_TO_I32_MAP, true),
    LeS(INTS_TO_I32_MAP, true),
    LeU(INTS_TO_I32_MAP, true),
    GtS(INTS_TO_I32_MAP, true),
    GtU(INTS_TO_I32_MAP, true),
    GeS(INTS_TO_I32_MAP, true),
    GeU(INTS_TO_I32_MAP, true),

    // float
    Lt(FLOATS_TO_I32_MAP, true),
    Le(FLOATS_TO_I32_MAP, true),
    Gt(FLOATS_TO_I32_MAP, true),
    Ge(FLOATS_TO_I32_MAP, true);

    private final Map<Pair<Type, Type>, Type> typeMap;
    private final boolean isBoolean;

    BinaryOp(Map<Pair<Type, Type>, Type> typeMap, boolean isBoolean)
    {
        this.typeMap = ImmutableMap.copyOf(typeMap);
        this.isBoolean = isBoolean;
        if (isBoolean) {
            checkArgument(typeMap.values().stream().allMatch(t -> t == Type.I32));
        }
    }

    BinaryOp(Map<Pair<Type, Type>, Type> typeMap)
    {
        this(typeMap, false);
    }

    public Map<Pair<Type, Type>, Type> getTypeMap()
    {
        return typeMap;
    }

    public boolean isBoolean()
    {
        return isBoolean;
    }
}
