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
        "targets",
        "default",
        "condition",
        "value",
})
@Immutable
public final class YSwitch
        extends YExpression
{
    private final List<Name> targets;
    private final Name defaultName;
    private final YExpression condition;
    private final Optional<YExpression> value;

    @JsonCreator
    public YSwitch(
            @JsonProperty("targets") List<Name> targets,
            @JsonProperty("default") Name defaultName,
            @JsonProperty("condition") YExpression condition,
            @JsonProperty("value") Optional<YExpression> value)
    {
        this.targets = ImmutableList.copyOf(targets);
        this.defaultName = requireNonNull(defaultName);
        this.condition = requireNonNull(condition);
        this.value = requireNonNull(value);
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
        YSwitch aYSwitch = (YSwitch) o;
        return Objects.equals(targets, aYSwitch.targets) &&
                Objects.equals(defaultName, aYSwitch.defaultName) &&
                Objects.equals(condition, aYSwitch.condition) &&
                Objects.equals(value, aYSwitch.value);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(targets, defaultName, condition, value);
    }

    @JsonProperty("targets")
    public List<Name> getTargets()
    {
        return targets;
    }

    @JsonProperty("default")
    public Name getDefaultName()
    {
        return defaultName;
    }

    @JsonProperty("condition")
    public YExpression getCondition()
    {
        return condition;
    }

    @JsonProperty("value")
    public Optional<YExpression> getValue()
    {
        return value;
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
                .add(condition)
                .addAll(optionalToList(value))
                .build();
    }

    @Override
    public <C, R> R accept(YVisitor<C, R> visitor, C context)
    {
        return visitor.visitSwitch(this, context);
    }
}
