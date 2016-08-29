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
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.yen.expression.visitor.YVisitor;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "ifTrue",
        "ifFalse",
        "condition",
})
@Immutable
public final class YSelect
        extends YExpression
{
    private final YExpression ifTrue;
    private final YExpression ifFalse;
    private final YExpression condition;

    @JsonCreator
    public YSelect(
            @JsonProperty("ifTrue") YExpression ifTrue,
            @JsonProperty("ifFalse") YExpression ifFalse,
            @JsonProperty("condition") YExpression condition)
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
        YSelect ySelect = (YSelect) o;
        return Objects.equals(ifTrue, ySelect.ifTrue) &&
                Objects.equals(ifFalse, ySelect.ifFalse) &&
                Objects.equals(condition, ySelect.condition);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(ifTrue, ifFalse, condition);
    }
    @JsonProperty("ifTrue")
    public YExpression getIfTrue()
    {
        return ifTrue;
    }

    @JsonProperty("ifFalse")
    public YExpression getIfFalse()
    {
        return ifFalse;
    }

    @JsonProperty("condition")
    public YExpression getCondition()
    {
        return condition;
    }

    @Override
    public Type getType()
    {
        return Type.getReachable(ifTrue.getType(), ifFalse.getType());
    }

    @Override
    public List<YExpression> getChildren()
    {
        return ImmutableList.of(condition, ifTrue, ifFalse);
    }

    @Override
    public <C, R> R accept(YVisitor<C, R> visitor, C context)
    {
        return visitor.visitSelect(this, context);
    }
}
