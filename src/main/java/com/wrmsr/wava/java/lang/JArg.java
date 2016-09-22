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

import com.google.common.base.MoreObjects;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;

@Immutable
public final class JArg
{
    private final JTypeSpecifier type;
    private final JName name;

    public JArg(JTypeSpecifier type, JName name)
    {
        this.type = type;
        this.name = name;
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
        JArg arg = (JArg) o;
        return Objects.equals(type, arg.type) &&
                Objects.equals(name, arg.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(type, name);
    }

    @Override
    public String toString()
    {
        return MoreObjects.toStringHelper(this)
                .add("type", type)
                .add("name", name)
                .toString();
    }

    public JTypeSpecifier getType()
    {
        return type;
    }

    public JName getName()
    {
        return name;
    }
}
