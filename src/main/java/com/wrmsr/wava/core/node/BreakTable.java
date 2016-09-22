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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.core.node.visitor.Visitor;
import com.wrmsr.wava.core.type.Name;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "targets",
        "defaultTarget",
        "condition",
})
@Immutable
public final class BreakTable
        extends Node
{
    private final List<Name> targets;
    private final Name defaultTarget;
    private final Node condition;

    public BreakTable(
            @JsonProperty("targets") List<Name> targets,
            @JsonProperty("defaultTarget") Name defaultTarget,
            @JsonProperty("condition") Node condition)
    {
        this.targets = ImmutableList.copyOf(targets);
        this.defaultTarget = requireNonNull(defaultTarget);
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
        BreakTable aBreakTable = (BreakTable) o;
        return Objects.equals(targets, aBreakTable.targets) &&
                Objects.equals(defaultTarget, aBreakTable.defaultTarget) &&
                Objects.equals(condition, aBreakTable.condition);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(targets, defaultTarget, condition);
    }

    @JsonProperty("targets")
    public List<Name> getTargets()
    {
        return targets;
    }

    @JsonProperty("defaultTarget")
    public Name getDefaultTarget()
    {
        return defaultTarget;
    }

    @JsonProperty("condition")
    public Node getCondition()
    {
        return condition;
    }

    @Override
    public List<Node> getChildren()
    {
        return ImmutableList.of(condition);
    }

    @Override
    public <C, R> R accept(Visitor<C, R> visitor, C context)
    {
        return visitor.visitBreakTable(this, context);
    }
}
