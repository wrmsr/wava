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
package com.wrmsr.wava.yen.expression;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.yen.expression.visitor.YVisitor;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "index",
        "type",
})
@Immutable
public final class YGetLocal
        extends YExpression
{
    private final Index index;
    private final Type type;

    @JsonCreator
    public YGetLocal(
            @JsonProperty("index") Index index,
            @JsonProperty("type") Type type)
    {
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
        YGetLocal YGetLocal = (YGetLocal) o;
        return Objects.equals(index, YGetLocal.index) &&
                type == YGetLocal.type;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(index, type);
    }

    @JsonProperty("index")
    public Index getIndex()
    {
        return index;
    }

    @Override
    @JsonProperty("type")
    public Type getType()
    {
        return type;
    }

    @Override
    public <C, R> R accept(YVisitor<C, R> visitor, C context)
    {
        return visitor.visitGetLocal(this, context);
    }
}
