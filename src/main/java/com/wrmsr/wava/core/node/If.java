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
public final class If
        extends Node
{
    private final Node condition;
    private final Node ifTrue;
    private final Node ifFalse;

    @JsonCreator
    public If(
            @JsonProperty("condition") Node condition,
            @JsonProperty("ifTrue") Node ifTrue,
            @JsonProperty("ifFalse") Node ifFalse)
    {
        this.condition = requireNonNull(condition);
        this.ifTrue = requireNonNull(ifTrue);
        this.ifFalse = requireNonNull(ifFalse);
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
        If anIf = (If) o;
        return Objects.equals(condition, anIf.condition) &&
                Objects.equals(ifTrue, anIf.ifTrue) &&
                Objects.equals(ifFalse, anIf.ifFalse);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(condition, ifTrue, ifFalse);
    }

    @JsonProperty("condition")
    public Node getCondition()
    {
        return condition;
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

    @Override
    public List<Node> getChildren()
    {
        return ImmutableList.of(condition, ifTrue, ifFalse);
    }

    @Override
    public <C, R> R accept(Visitor<C, R> visitor, C context)
    {
        return visitor.visitIf(this, context);
    }
}
