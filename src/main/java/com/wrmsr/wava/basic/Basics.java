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
package com.wrmsr.wava.basic;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.SetMultimap;
import com.wrmsr.wava.analyze.ControlFlowGraph;
import com.wrmsr.wava.analyze.ValueTypeAnalysis;
import com.wrmsr.wava.core.node.Block;
import com.wrmsr.wava.core.node.Break;
import com.wrmsr.wava.core.node.BreakTable;
import com.wrmsr.wava.core.node.If;
import com.wrmsr.wava.core.node.Label;
import com.wrmsr.wava.core.node.Loop;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Nop;
import com.wrmsr.wava.core.node.Return;
import com.wrmsr.wava.core.node.Switch;
import com.wrmsr.wava.core.node.Unreachable;
import com.wrmsr.wava.core.node.visitor.Visitor;
import com.wrmsr.wava.core.type.Name;
import org.apache.commons.lang3.tuple.ImmutablePair;

import javax.annotation.CheckReturnValue;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Stream;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;
import static com.google.common.collect.Iterables.getOnlyElement;
import static com.wrmsr.wava.util.RecursiveConsumer.acceptRecursive;
import static com.wrmsr.wava.util.collect.MoreCollectors.toHashMultimap;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static java.util.Collections.unmodifiableMap;
import static java.util.Objects.requireNonNull;

public final class Basics
{
    public static final Name ENTRY_NAME = Name.of("$ENTRY$");
    public static final Name UNREACHABLE_NAME = Name.of("$UNREACHABLE$");
    public static final Name EXIT_NAME = Name.of("$EXIT$");

    public static final Set<Name> TERMINAL_NAMES = ImmutableSet.of(UNREACHABLE_NAME, EXIT_NAME);

    private Basics()
    {
    }

    public static Map<Name, Basic> buildBasics(ControlFlowGraph cfg, ValueTypeAnalysis vta, Map<Node, Name> nodeNames, Map<Node, Integer> nodeIndices)
    {
        Map<Name, Basic> map = new LinkedHashMap<>();
        acceptRecursive((rec, node) -> {
            Name name;
            if (node == ControlFlowGraph.ENTRY) {
                name = ENTRY_NAME;
            }
            else {
                name = requireNonNull(nodeNames.get(node));
                checkState(!map.containsKey(name));
                checkState(!vta.get(node).isUsed());
            }
            map.put(name, node.accept(new Visitor<Void, Basic>()
            {
                private BreakTable newFlowBreakTable(Node node)
                {
                    return newBreakTable(nodeNames.get(getOnlyElement(cfg.getOutput(node)).getOutput()));
                }

                private BreakTable newBreakTable(Name target)
                {
                    return new BreakTable(ImmutableList.of(), target, new Nop());
                }

                private Basic newBasic(List<Node> body, BreakTable breakTable)
                {
                    return new Basic(name, body, breakTable, OptionalInt.of(nodeIndices.get(node)));
                }

                @Override
                protected Basic visitNode(Node node, Void context)
                {
                    return newBasic(ImmutableList.of(node), newFlowBreakTable(node));
                }

                @Override
                public Basic visitBlock(Block node, Void context)
                {
                    return newBasic(ImmutableList.of(), newFlowBreakTable(node));
                }

                @Override
                public Basic visitBreak(Break node, Void context)
                {
                    checkState(node.getValue() instanceof Nop);
                    return newBasic(ImmutableList.of(), newBreakTable(node.getTarget()));
                }

                @Override
                public Basic visitBreakTable(BreakTable node, Void context)
                {
                    return newBasic(ImmutableList.of(), node);
                }

                @Override
                public Basic visitIf(If node, Void context)
                {
                    return newBasic(ImmutableList.of(), new BreakTable(ImmutableList.of(nodeNames.get(node.getIfFalse())), nodeNames.get(node.getIfTrue()), node.getCondition()));
                }

                @Override
                public Basic visitLoop(Loop node, Void context)
                {
                    return new Basic(name, ImmutableList.of(), newFlowBreakTable(node), OptionalInt.of(nodeIndices.get(node)));
                }

                @Override
                public Basic visitNop(Nop node, Void context)
                {
                    if (node == ControlFlowGraph.ENTRY) {
                        return new Basic(ENTRY_NAME, ImmutableList.of(), newFlowBreakTable(node), OptionalInt.of(0));
                    }
                    else {
                        return visitNode(node, context);
                    }
                }

                @Override
                public Basic visitReturn(Return node, Void context)
                {
                    return newBasic(ImmutableList.of(node), newBreakTable(EXIT_NAME));
                }

                @Override
                public Basic visitSwitch(Switch node, Void context)
                {
                    throw new IllegalStateException();
                }

                @Override
                public Basic visitUnreachable(Unreachable node, Void context)
                {
                    return newBasic(ImmutableList.of(node), newBreakTable(UNREACHABLE_NAME));
                }
            }, null));
            cfg.getOutput(node).stream()
                    .map(ControlFlowGraph.Edge::getOutput)
                    .filter(n -> !map.containsKey(nodeNames.get(n)))
                    .forEach(rec);
        }, ControlFlowGraph.ENTRY);
        return unmodifiableMap(map);
    }

    public static BreakTable renameTarget(BreakTable breakTable, Name from, Name to)
    {
        return new BreakTable(
                breakTable.getTargets().stream().map(n -> n.equals(from) ? to : n).collect(toImmutableList()),
                breakTable.getDefaultTarget().equals(from) ? to : breakTable.getDefaultTarget(),
                breakTable.getCondition());
    }

    public static Basic renameTarget(Basic basic, Name from, Name to)
    {
        return new Basic(
                basic.getName(),
                basic.getBody(),
                renameTarget(basic.getBreakTable(), from, to),
                basic.getIndex());
    }

    public static Optional<Name> getUnconditionalTarget(BreakTable breakTable)
    {
        if (breakTable.getCondition() instanceof Nop) {
            checkState(breakTable.getTargets().isEmpty());
            return Optional.of(breakTable.getDefaultTarget());
        }
        else {
            checkState(!breakTable.getTargets().isEmpty());
            return Optional.empty();
        }
    }

    public static OptionalInt minBasicIndex(Basic... basics)
    {
        return Stream.of(basics)
                .map(Basic::getIndex)
                .filter(OptionalInt::isPresent)
                .mapToInt(OptionalInt::getAsInt)
                .min();
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public static Basic mergeBasics(Basic first, Basic second)
    {
        requireNonNull(first);
        requireNonNull(second);
        checkArgument(first != second);
        checkArgument(!first.getName().equals(second.getName()));
        checkArgument(getUnconditionalTarget(first.getBreakTable()).get().equals(second.getName()));
        return new Basic(
                first.getName(),
                ImmutableList.<Node>builder()
                        .addAll(first.getBody())
                        .addAll(second.getBody())
                        .build(),
                second.getBreakTable(),
                minBasicIndex(first, second));
    }

    public static SetMultimap<Name, Name> getBasicInputs(Stream<Basic> basics)
    {
        return basics
                .flatMap(b -> b.getAllTargets().stream().map(t -> ImmutablePair.of(t, b.getName())))
                .collect(toHashMultimap());
    }

    public static Basic cleanBasic(Basic basic)
    {
        return new Basic(
                basic.getName(),
                basic.getBody().stream()
                        .map(n -> n.accept(new Visitor<Void, Node>()
                        {
                            @Override
                            protected Node visitNode(Node node, Void context)
                            {
                                return node;
                            }

                            @Override
                            public Node visitBlock(Block node, Void context)
                            {
                                return null;
                            }

                            @Override
                            public Node visitBreak(Break node, Void context)
                            {
                                return null;
                            }

                            @Override
                            public Node visitBreakTable(BreakTable node, Void context)
                            {
                                return null;
                            }

                            @Override
                            public Node visitIf(If node, Void context)
                            {
                                return null;
                            }

                            @Override
                            public Node visitLabel(Label node, Void context)
                            {
                                return null;
                            }

                            @Override
                            public Node visitLoop(Loop node, Void context)
                            {
                                return null;
                            }

                            @Override
                            public Node visitNop(Nop node, Void context)
                            {
                                return null;
                            }

                            @Override
                            public Node visitSwitch(Switch node, Void context)
                            {
                                throw new IllegalStateException();
                            }

                            @Override
                            public Node visitUnreachable(Unreachable node, Void context)
                            {
                                return null;
                            }
                        }, null))
                        .filter(n -> n != null)
                        .collect(toImmutableList()),
                basic.getBreakTable(),
                basic.getIndex());
    }

    public static Optional<Node> simplifyBreakTable(BreakTable breakTable)
    {
        if (breakTable.getTargets().isEmpty()) {
            if (breakTable.getDefaultTarget().equals(UNREACHABLE_NAME)) {
                return Optional.empty();
            }
            else {
                return Optional.of(
                        new Break(
                                breakTable.getDefaultTarget(),
                                new Nop()));
            }
        }
        else {
            checkState(!breakTable.getDefaultTarget().equals(UNREACHABLE_NAME));
            checkState(!breakTable.getTargets().stream().anyMatch(UNREACHABLE_NAME::equals));
            return Optional.of(breakTable);
        }
    }

    @FunctionalInterface
    public interface BasicTransform
    {
        BasicSet apply(BasicSet basics, Basic basic);
    }

    @CheckReturnValue
    public static BasicSet transformBasics(BasicTransform op, BasicSet basics)
    {
        for (Name name : basics) {
            if (basics.contains(name)) {
                basics = requireNonNull(op.apply(basics, basics.get(name)));
            }
        }
        return basics;
    }

    @FunctionalInterface
    public interface StreamBasicTransform
    {
        Stream<BasicSet> apply(BasicSet basics, Basic basic);
    }

    @CheckReturnValue
    public static BasicSet transformBasics(StreamBasicTransform op, BasicSet basics)
    {
        for (Name name : basics) {
            if (basics.contains(name)) {
                basics = Stream.concat(op.apply(basics, basics.get(name)), Stream.of(basics)).findFirst().get();
            }
        }
        return basics;
    }
}
