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
package com.wrmsr.wava.transform.basic;

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.core.node.BreakTable;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.type.Name;
import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Stream;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;
import static com.google.common.collect.Iterables.getOnlyElement;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableSet;
import static java.util.Objects.requireNonNull;

@Immutable
public final class Basic
{
    private final Name name;
    private final List<Node> body;
    private final BreakTable breakTable;
    private OptionalInt index;

    public Basic(Name name, List<Node> body, BreakTable breakTable, OptionalInt index)
    {
        this.name = requireNonNull(name);
        this.body = ImmutableList.copyOf(body);
        this.breakTable = requireNonNull(breakTable);
        this.index = requireNonNull(index);
    }

    public Name getName()
    {
        return name;
    }

    public List<Node> getBody()
    {
        return body;
    }

    public BreakTable getBreakTable()
    {
        return breakTable;
    }

    public OptionalInt getIndex()
    {
        return index;
    }

    public Set<Name> getAllTargets()
    {
        return Stream.concat(breakTable.getTargets().stream(), Stream.of(breakTable.getDefaultTarget())).distinct().collect(toImmutableSet());
    }

    public boolean isBoolean()
    {
        if (breakTable.getTargets().size() != 1) {
            return false;
        }
        Name ifFalseTarget = getOnlyElement(breakTable.getTargets());
        if (ifFalseTarget.equals(breakTable.getDefaultTarget())) {
            return false;
        }
        return true;
    }

    public Name getIfTrueTarget()
    {
        checkState(isBoolean());
        return breakTable.getDefaultTarget();
    }

    public Name getIfFalseTarget()
    {
        checkState(isBoolean());
        return getOnlyElement(breakTable.getTargets());
    }
}
