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
package com.wrmsr.wava.yen.parser;

import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

@Immutable
public final class NameType
{
    private final Name name;
    private final Type type;

    public NameType(Name name, Type type)
    {
        this.name = requireNonNull(name);
        this.type = requireNonNull(type);
    }

    public static NameType of(Name name, Type type)
    {
        return new NameType(name, type);
    }

    public Name getName()
    {
        return name;
    }

    public Type getType()
    {
        return type;
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
        NameType nameType = (NameType) o;
        return Objects.equals(name, nameType.name) &&
                type == nameType.type;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, type);
    }

    @Override
    public String toString()
    {
        return "NameType{" +
                "name=" + name +
                ", type=" + type +
                '}';
    }
}
