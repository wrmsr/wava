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
import java.util.Optional;

import static com.wrmsr.wava.util.collect.MoreOptionals.optionalToList;
import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "condition",
        "ifTrue",
        "ifFalse",
})
@Immutable
public final class YIf
        extends YExpression
{
    private final YExpression condition;
    private final YExpression ifTrue;
    private final Optional<YExpression> ifFalse;

    @JsonCreator
    public YIf(
            @JsonProperty("condition") YExpression condition,
            @JsonProperty("ifTrue") YExpression ifTrue,
            @JsonProperty("ifFalse") Optional<YExpression> ifFalse)
    {
        this.condition = requireNonNull(condition);
        this.ifTrue = requireNonNull(ifTrue);
        this.ifFalse = ifFalse;
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
        YIf anYIf = (YIf) o;
        return Objects.equals(condition, anYIf.condition) &&
                Objects.equals(ifTrue, anYIf.ifTrue) &&
                Objects.equals(ifFalse, anYIf.ifFalse);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(condition, ifTrue, ifFalse);
    }

    @JsonProperty("condition")
    public YExpression getCondition()
    {
        return condition;
    }

    @JsonProperty("ifTrue")
    public YExpression getIfTrue()
    {
        return ifTrue;
    }

    @JsonProperty("ifFalse")
    public Optional<YExpression> getIfFalse()
    {
        return ifFalse;
    }

    @Override
    public Type getType()
    {
        if (ifFalse.isPresent()) {
            return Type.getReachable(ifTrue.getType(), ifFalse.get().getType());
        }
        else {
            return Type.NONE;
        }
    }

    @Override
    public List<YExpression> getChildren()
    {
        return ImmutableList.<YExpression>builder()
                .add(ifTrue)
                .addAll(optionalToList(ifFalse))
                .build();
    }

    @Override
    public <C, R> R accept(YVisitor<C, R> visitor, C context)
    {
        return visitor.visitIf(this, context);
    }
}
