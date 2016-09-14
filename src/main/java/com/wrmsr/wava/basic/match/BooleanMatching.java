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
package com.wrmsr.wava.basic.match;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.wrmsr.wava.core.node.If;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Nop;
import com.wrmsr.wava.core.node.Unary;
import com.wrmsr.wava.core.op.UnaryOp;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.basic.Basic;
import com.wrmsr.wava.basic.BasicSet;

import java.util.stream.Stream;

import static com.google.common.collect.Iterables.getOnlyElement;
import static com.wrmsr.wava.core.node.Nodes.nodify;
import static com.wrmsr.wava.basic.Basics.TERMINAL_NAMES;
import static com.wrmsr.wava.basic.Basics.minBasicIndex;
import static java.util.Objects.requireNonNull;

public final class BooleanMatching
{
    private BooleanMatching()
    {
    }

    public static final class MatchedBoolean
    {
        public final Name ifTrue;
        public final Name ifFalse;
        public final Node condition;

        public MatchedBoolean(Name ifTrue, Name ifFalse, Node condition)
        {
            this.ifTrue = requireNonNull(ifTrue);
            this.ifFalse = requireNonNull(ifFalse);
            this.condition = requireNonNull(condition);
        }
    }

    public static Stream<MatchedBoolean> matchBoolean(Basic basic)
    {
        if (basic.getBreakTable().getTargets().size() != 1) {
            return Stream.empty();
        }
        Name ifTrue = basic.getBreakTable().getDefaultTarget();
        Name ifFalse = getOnlyElement(basic.getBreakTable().getTargets());
        if (ifTrue.equals(ifFalse) || ifTrue.equals(basic.getName()) || ifFalse.equals(basic.getName())) {
            return Stream.empty();
        }
        return Stream.of(
                new MatchedBoolean(ifTrue, ifFalse, basic.getBreakTable().getCondition()),
                new MatchedBoolean(ifFalse, ifTrue, new Unary(UnaryOp.EqZ, Type.I32, basic.getBreakTable().getCondition())));
    }

    public static Stream<MatchedBoolean> matchIf(BasicSet basics, Basic basic)
    {
        return matchBoolean(basic)
                .filter(m -> !TERMINAL_NAMES.contains(m.ifTrue))
                .filter(m -> {
                    Basic ifTrue = requireNonNull(basics.get(m.ifTrue));
                    return basics.getInputs(ifTrue).equals(ImmutableSet.of(basic.getName())) &&
                            ifTrue.getAllTargets().equals(ImmutableSet.of(m.ifFalse));
                });
    }

    public static Stream<BasicSet> shrinkIf(BasicSet basics, Basic basic)
    {
        return matchIf(basics, basic)
                .map(m -> {
                    Basic ifTrue = requireNonNull(basics.get(m.ifTrue));
                    Node ifNode = new If(
                            m.condition,
                            nodify(ifTrue.getBody()),
                            new Nop());
                    Basic newBasic = new Basic(
                            basic.getName(),
                            ImmutableList.<Node>builder()
                                    .addAll(basic.getBody())
                                    .add(ifNode)
                                    .build(),
                            ifTrue.getBreakTable(),
                            minBasicIndex(basic, ifTrue));
                    return basics
                            .replace(newBasic)
                            .remove(ifTrue.getName());
                });
    }

    public static Stream<MatchedBoolean> matchIfElse(BasicSet basics, Basic basic)
    {
        return matchBoolean(basic)
                .filter(m -> !(TERMINAL_NAMES.contains(m.ifTrue) || TERMINAL_NAMES.contains(m.ifFalse)))
                .filter(m -> {
                    Basic ifTrue = requireNonNull(basics.get(m.ifTrue));
                    Basic ifFalse = requireNonNull(basics.get(m.ifFalse));
                    return basics.getInputs(ifTrue).equals(ImmutableSet.of(basic.getName())) &&
                            basics.getInputs(ifFalse).equals(ImmutableSet.of(basic.getName())) &&
                            ifTrue.getBreakTable().equals(ifFalse.getBreakTable());
                });
    }

    public static Stream<BasicSet> shrinkIfElse(BasicSet basics, Basic basic)
    {
        return matchIfElse(basics, basic)
                .map(m -> {
                    Basic ifTrue = requireNonNull(basics.get(m.ifTrue));
                    Basic ifFalse = requireNonNull(basics.get(m.ifFalse));
                    Node ifNode = new If(
                            m.condition,
                            nodify(ifTrue.getBody()),
                            nodify(ifFalse.getBody()));
                    Basic newBasic = new Basic(
                            basic.getName(),
                            ImmutableList.<Node>builder()
                                    .addAll(basic.getBody())
                                    .add(ifNode)
                                    .build(),
                            ifTrue.getBreakTable(),
                            minBasicIndex(basic, ifTrue, ifFalse));
                    return basics.replace(newBasic)
                            .remove(ifTrue)
                            .remove(ifFalse);
                });
    }
}
