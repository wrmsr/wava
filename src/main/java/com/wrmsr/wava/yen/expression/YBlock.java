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
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.yen.expression.visitor.YVisitor;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "label",
        "list"
})
@Immutable
public final class YBlock
        extends YExpression
{
    private final Optional<Name> label;
    private final List<YExpression> list;

    @JsonCreator
    public YBlock(
            @JsonProperty("label") Optional<Name> label,
            @JsonProperty("list") List<YExpression> list)
    {
        this.label = requireNonNull(label);
        this.list = ImmutableList.copyOf(list);
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
        YBlock YBlock = (YBlock) o;
        return Objects.equals(label, YBlock.label) &&
                Objects.equals(list, YBlock.list);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(label, list);
    }

    public YBlock relabel(Name label)
    {
        return new YBlock(Optional.of(label), list);
    }

    @JsonProperty("label")
    public Optional<Name> getLabel()
    {
        return label;
    }

    @JsonProperty("list")
    public List<YExpression> getList()
    {
        return list;
    }

    @Override
    public Type getType()
    {
        return list.get(list.size() - 1).getType();
    }

    @Override
    public List<YExpression> getChildren()
    {
        return list;
    }

    @Override
    public <C, R> R accept(YVisitor<C, R> visitor, C context)
    {
        return visitor.visitBlock(this, context);
    }
}
