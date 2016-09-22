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
import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.yen.expression.visitor.YVisitor;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "index",
        "value",
        "type",
})
@Immutable
public final class YSetLocal
        extends YExpression
{
    private final Index index;
    private final YExpression value;
    private final Type type;

    @JsonCreator
    public YSetLocal(
            @JsonProperty("index") Index index,
            @JsonProperty("value") YExpression value,
            @JsonProperty("type") Type type)
    {
        this.index = requireNonNull(index);
        this.value = requireNonNull(value);
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
        YSetLocal YSetLocal = (YSetLocal) o;
        return Objects.equals(index, YSetLocal.index) &&
                Objects.equals(value, YSetLocal.value) &&
                type == YSetLocal.type;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(index, value, type);
    }

    @JsonProperty("index")
    public Index getIndex()
    {
        return index;
    }

    @JsonProperty("value")
    public YExpression getValue()
    {
        return value;
    }

    @Override
    @JsonProperty("type")
    public Type getType()
    {
        // return value.getType(); FIXME checkArgument?
        return type;
    }

    @Override
    public List<YExpression> getChildren()
    {
        return ImmutableList.of(value);
    }

    @Override
    public <C, R> R accept(YVisitor<C, R> visitor, C context)
    {
        return visitor.visitSetLocal(this, context);
    }
}
