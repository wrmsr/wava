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

import static com.wrmsr.wava.util.collect.MoreOptionals.optionalToList;
import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "target",
        "value",
        "condition"
})
@Immutable
public final class YBreak
        extends YExpression
{
    private final Name target;
    private final Optional<YExpression> value;
    private final Optional<YExpression> condition;

    @JsonCreator
    public YBreak(
            @JsonProperty("target") Name target,
            @JsonProperty("value") Optional<YExpression> value,
            @JsonProperty("condition") Optional<YExpression> condition)
    {
        this.target = requireNonNull(target);
        this.value = requireNonNull(value);
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
        YBreak aYBreak = (YBreak) o;
        return Objects.equals(target, aYBreak.target) &&
                Objects.equals(value, aYBreak.value) &&
                Objects.equals(condition, aYBreak.condition);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(target, value, condition);
    }

    @JsonProperty("name")
    public Name getTarget()
    {
        return target;
    }

    @JsonProperty("value")
    public Optional<YExpression> getValue()
    {
        return value;
    }

    @JsonProperty("condition")
    public Optional<YExpression> getCondition()
    {
        return condition;
    }

    @Override
    public Type getType()
    {
        return Type.UNREACHABLE;
    }

    @Override
    public List<YExpression> getChildren()
    {
        return ImmutableList.<YExpression>builder()
                .addAll(optionalToList(condition))
                .addAll(optionalToList(value))
                .build();
    }

    @Override
    public <C, R> R accept(YVisitor<C, R> visitor, C context)
    {
        return visitor.visitBreak(this, context);
    }
}
