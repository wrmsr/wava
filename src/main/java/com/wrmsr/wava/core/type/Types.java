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

import com.google.common.collect.ImmutableMap;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Map;
import java.util.Set;

import static com.google.common.collect.Sets.immutableEnumSet;

public final class Types
{
    private Types()
    {
    }

    public static final Map<Type, Set<Type>> INT_TO_INT_MAP = ImmutableMap.of(
            Type.I32, immutableEnumSet(Type.I32),
            Type.I64, immutableEnumSet(Type.I64));

    public static final Map<Type, Set<Type>> INT_TO_I32_MAP = ImmutableMap.of(
            Type.I32, immutableEnumSet(Type.I32),
            Type.I64, immutableEnumSet(Type.I32));

    public static final Map<Type, Set<Type>> FLOAT_TO_INTS_MAP = ImmutableMap.of(
            Type.F32, immutableEnumSet(Type.I32, Type.I64),
            Type.F64, immutableEnumSet(Type.I32, Type.I64));

    public static final Map<Type, Set<Type>> FLOAT_TO_FLOAT_MAP = ImmutableMap.of(
            Type.F32, immutableEnumSet(Type.F32),
            Type.F64, immutableEnumSet(Type.F64));

    public static final Map<Type, Set<Type>> INT_TO_FLOATS_MAP = ImmutableMap.of(
            Type.I32, immutableEnumSet(Type.F32, Type.F64),
            Type.I64, immutableEnumSet(Type.F32, Type.F64));

    public static final Map<Type, Set<Type>> ANY_TO_ANY_MAP = ImmutableMap.of(
            Type.F32, immutableEnumSet(Type.F32),
            Type.F64, immutableEnumSet(Type.F64),
            Type.I32, immutableEnumSet(Type.I32),
            Type.I64, immutableEnumSet(Type.I64));

    public static final Map<Pair<Type, Type>, Type> INTS_TO_INT_MAP = ImmutableMap.of(
            ImmutablePair.of(Type.I32, Type.I32), Type.I32,
            ImmutablePair.of(Type.I64, Type.I64), Type.I64);

    public static final Map<Pair<Type, Type>, Type> INTS_TO_I32_MAP = ImmutableMap.of(
            ImmutablePair.of(Type.I32, Type.I32), Type.I32,
            ImmutablePair.of(Type.I64, Type.I64), Type.I32);

    public static final Map<Pair<Type, Type>, Type> FLOATS_TO_FLOAT_MAP = ImmutableMap.of(
            ImmutablePair.of(Type.F32, Type.F32), Type.F32,
            ImmutablePair.of(Type.F64, Type.F64), Type.F64);

    public static final Map<Pair<Type, Type>, Type> FLOATS_TO_I32_MAP = ImmutableMap.of(
            ImmutablePair.of(Type.F32, Type.F32), Type.I32,
            ImmutablePair.of(Type.F64, Type.F64), Type.I32);

    public static final Map<Pair<Type, Type>, Type> ANYS_TO_ANY_MAP = ImmutableMap.of(
            ImmutablePair.of(Type.F32, Type.F32), Type.F32,
            ImmutablePair.of(Type.F64, Type.F64), Type.F64,
            ImmutablePair.of(Type.I32, Type.I32), Type.I32,
            ImmutablePair.of(Type.I64, Type.I64), Type.I64);

    public static final Map<Pair<Type, Type>, Type> ANYS_TO_I32_MAP = ImmutableMap.of(
            ImmutablePair.of(Type.F32, Type.F32), Type.I32,
            ImmutablePair.of(Type.F64, Type.F64), Type.I32,
            ImmutablePair.of(Type.I32, Type.I32), Type.I32,
            ImmutablePair.of(Type.I64, Type.I64), Type.I32);
}
