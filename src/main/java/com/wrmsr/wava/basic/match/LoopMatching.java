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
import com.wrmsr.wava.core.node.Block;
import com.wrmsr.wava.core.node.Break;
import com.wrmsr.wava.core.node.BreakTable;
import com.wrmsr.wava.core.node.If;
import com.wrmsr.wava.core.node.Loop;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Nop;
import com.wrmsr.wava.core.node.Unary;
import com.wrmsr.wava.core.op.UnaryOp;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.basic.Basic;
import com.wrmsr.wava.basic.BasicLoopInfo;
import com.wrmsr.wava.basic.BasicSet;

import java.util.stream.Stream;

import static com.google.common.collect.Iterables.getOnlyElement;
import static java.util.Objects.requireNonNull;

public final class LoopMatching
{
    private LoopMatching()
    {
    }

    public static final class SelfLoopMatch
    {
        public final Node condition;
        public final Name outer;

        public SelfLoopMatch(Node condition, Name outer)
        {
            this.condition = requireNonNull(condition);
            this.outer = requireNonNull(outer);
        }
    }

    // FIXME handle n-ary via (statementized?) temp, can't reeval condition expr... actually make that another xform, all effectively boolean conditions made so
    public static Stream<SelfLoopMatch> matchSelfLoop(BasicLoopInfo loopInfo, Basic basic)
    {
        if (!loopInfo.isLoop(basic.getName()) ||
                basic.getBreakTable().getTargets().size() != 1 ||
                basic.getAllTargets().size() != 2 ||
                !basic.getAllTargets().contains(basic.getName()) ||
                !loopInfo.getBackEdges(basic.getName()).equals(ImmutableSet.of(basic.getName()))) {
            return Stream.empty();
        }
        if (basic.getBreakTable().getDefaultTarget().equals(basic.getName())) {
            return Stream.of(
                    new SelfLoopMatch(
                            basic.getBreakTable().getCondition(),
                            getOnlyElement(basic.getBreakTable().getTargets())));
        }
        else {
            return Stream.of(
                    new SelfLoopMatch(
                            new Unary(
                                    UnaryOp.EqZ,
                                    Type.I32,
                                    basic.getBreakTable().getCondition()),
                            basic.getBreakTable().getDefaultTarget()));
        }
    }

    public static Stream<BasicSet> shrinkSelfLoops(BasicLoopInfo loopInfo, BasicSet basics, Basic basic)
    {
        return matchSelfLoop(loopInfo, basic)
                .map(m -> {
                    Node loop = new Loop(
                            basic.getName(),
                            new Block(
                                    ImmutableList.<Node>builder()
                                            .addAll(basic.getBody())
                                            .add(
                                                    new If(
                                                            m.condition,
                                                            new Break(
                                                                    basic.getName(),
                                                                    new Nop()),
                                                            new Nop()))
                                            .build()));
                    Basic newBasic = new Basic(
                            basic.getName(),
                            ImmutableList.of(loop),
                            new BreakTable(
                                    ImmutableList.of(),
                                    m.outer,
                                    new Nop()),
                            basic.getIndex());
                    return basics.replace(newBasic);
                });
    }
}
