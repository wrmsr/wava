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
package com.wrmsr.wava.java.lang;

import com.google.common.collect.ImmutableList;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

@Immutable
public final class JTypeSpecifier
{
    private final JQualifiedName name;
    private final List<JArray> arrays;

    public JTypeSpecifier(JQualifiedName name, List<JArray> arrays)
    {
        this.name = requireNonNull(name);
        this.arrays = ImmutableList.copyOf(arrays);
    }

    public static JTypeSpecifier of(JQualifiedName name)
    {
        return new JTypeSpecifier(name, ImmutableList.of());
    }

    public static JTypeSpecifier of(String... parts)
    {
        return new JTypeSpecifier(JQualifiedName.of((Object[]) parts), ImmutableList.of());
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JTypeSpecifier that = (JTypeSpecifier) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(arrays, that.arrays);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, arrays);
    }

    public JQualifiedName getName()
    {
        return name;
    }

    public List<JArray> getArrays()
    {
        return arrays;
    }
}
