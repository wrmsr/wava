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
package com.wrmsr.wava.core.unit;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.base.MoreObjects;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "name",
        "index",
        "type",
})
@Immutable
public final class Local
{
    private final Name name;
    private final Index index;
    private final Type type;

    @JsonCreator
    public Local(
            @JsonProperty("name") Name name,
            @JsonProperty("index") Index index,
            @JsonProperty("type") Type type)
    {
        this.name = requireNonNull(name);
        this.index = requireNonNull(index);
        this.type = requireNonNull(type);
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
        Local local = (Local) o;
        return Objects.equals(name, local.name) &&
                Objects.equals(index, local.index) &&
                type == local.type;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, index, type);
    }

    @Override
    public String toString()
    {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("index", index)
                .add("type", type)
                .toString();
    }

    @JsonProperty("name")
    public Name getName()
    {
        return name;
    }

    @JsonProperty("index")
    public Index getIndex()
    {
        return index;
    }

    @JsonProperty("type")
    public Type getType()
    {
        return type;
    }
}
