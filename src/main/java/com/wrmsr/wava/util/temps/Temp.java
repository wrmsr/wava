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
package com.wrmsr.wava.util.temps;

import com.google.common.base.MoreObjects;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;

import javax.annotation.concurrent.Immutable;

import static java.util.Objects.requireNonNull;

@Immutable
public final class Temp
{
    private final Name name;
    private final Type type;
    private final Index index;

    public Temp(Name name, Type type, Index index)
    {
        this.name = requireNonNull(name);
        this.type = requireNonNull(type);
        this.index = requireNonNull(index);
    }

    @Override
    public String toString()
    {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("type", type)
                .add("index", index)
                .toString();
    }

    public Name getName()
    {
        return name;
    }

    public Type getType()
    {
        return type;
    }

    public Index getIndex()
    {
        return index;
    }
}
