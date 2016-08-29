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
package com.wrmsr.wava.util;

import javax.annotation.concurrent.Immutable;

import java.lang.reflect.Type;

import static com.wrmsr.wava.util.MoreTypes.canonicalize;
import static java.util.Objects.requireNonNull;

@Immutable
public class TypeKey<T>
{
    private final Type type;
    private final int hashCode;

    @SuppressWarnings({"unchecked"})
    protected TypeKey()
    {
        this.type = MoreTypes.getSuperclassTypeParameter(getClass());
        this.hashCode = type.hashCode();
    }

    @SuppressWarnings("unchecked")
    protected TypeKey(Type type)
    {
        this.type = canonicalize(requireNonNull(type));
        this.hashCode = this.type.hashCode();
    }

    public static <T> TypeKey<T> of(Class<? extends T> cls)
    {
        return new TypeKey<>(cls);
    }

    @Override
    public int hashCode()
    {
        return hashCode;
    }

    @Override
    public boolean equals(Object o)
    {
        return this == o || (getClass().isInstance(o) && MoreTypes.equals(type, ((TypeKey) o).type));
    }
}
