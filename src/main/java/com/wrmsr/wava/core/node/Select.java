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
package com.wrmsr.wava.core.node;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.core.node.visitor.Visitor;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "condition",
        "ifTrue",
        "ifFalse",
})
@Immutable
public final class Select
        extends Node
{
    private final Node ifTrue;
    private final Node ifFalse;
    private final Node condition;

    @JsonCreator
    public Select(
            @JsonProperty("ifTrue") Node ifTrue,
            @JsonProperty("ifFalse") Node ifFalse,
            @JsonProperty("condition") Node condition)
    {
        this.ifTrue = requireNonNull(ifTrue);
        this.ifFalse = requireNonNull(ifFalse);
        this.condition = requireNonNull(condition);
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
        Select select = (Select) o;
        return Objects.equals(ifTrue, select.ifTrue) &&
                Objects.equals(ifFalse, select.ifFalse) &&
                Objects.equals(condition, select.condition);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(ifTrue, ifFalse, condition);
    }

    @JsonProperty("ifTrue")
    public Node getIfTrue()
    {
        return ifTrue;
    }

    @JsonProperty("ifFalse")
    public Node getIfFalse()
    {
        return ifFalse;
    }

    @JsonProperty("condition")
    public Node getCondition()
    {
        return condition;
    }

    @Override
    public List<Node> getChildren()
    {
        return ImmutableList.of(ifTrue, ifFalse, condition);
    }

    @Override
    public <C, R> R accept(Visitor<C, R> visitor, C context)
    {
        return visitor.visitSelect(this, context);
    }
}
