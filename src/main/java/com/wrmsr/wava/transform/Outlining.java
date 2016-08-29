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
package com.wrmsr.wava.transform;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.wrmsr.wava.analyze.ControlTransferAnalysis;
import com.wrmsr.wava.analyze.LocalAnalysis;
import com.wrmsr.wava.analyze.ValueTypeAnalysis;
import com.wrmsr.wava.core.literal.Literal;
import com.wrmsr.wava.core.node.Block;
import com.wrmsr.wava.core.node.Break;
import com.wrmsr.wava.core.node.BreakTable;
import com.wrmsr.wava.core.node.Call;
import com.wrmsr.wava.core.node.Const;
import com.wrmsr.wava.core.node.GetLocal;
import com.wrmsr.wava.core.node.Label;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Nop;
import com.wrmsr.wava.core.node.Return;
import com.wrmsr.wava.core.node.SetLocal;
import com.wrmsr.wava.core.node.Switch;
import com.wrmsr.wava.core.node.Unreachable;
import com.wrmsr.wava.core.node.visitor.Visitor;
import com.wrmsr.wava.core.op.HostOp;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.core.unit.Function;
import com.wrmsr.wava.core.unit.Local;
import com.wrmsr.wava.core.unit.Locals;
import org.organicdesign.fp.collections.ImSet;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import static com.google.common.base.Preconditions.checkState;
import static com.wrmsr.wava.core.node.Nodes.packI64;
import static com.wrmsr.wava.core.node.Nodes.reconstructNode;
import static com.wrmsr.wava.core.node.Nodes.unpackI64;
import static com.wrmsr.wava.util.Itertools.enumerate;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableMap;
import static java.util.Objects.requireNonNull;

public final class Outlining
{
    private Outlining()
    {
    }

    @Immutable
    public static final class OutlinedFunction
    {
        private final Node callsite;
        private final Function function;

        public OutlinedFunction(Node callsite, Function function)
        {
            this.callsite = requireNonNull(callsite);
            this.function = requireNonNull(function);
        }

        public Node getCallsite()
        {
            return callsite;
        }

        public Function getFunction()
        {
            return function;
        }
    }

    public static OutlinedFunction outlineFunction(
            Function function,
            Node node,
            Name outlinedName,
            Index externalRetControl,
            Index externalRetValue,
            LocalAnalysis loa,
            ControlTransferAnalysis cfa,
            ValueTypeAnalysis vta,
            Map<Node, Optional<Node>> parentsByNode,
            Map<Name, Node> nodesByName)
    {
        final List<Index> allLocals;
        final List<Index> spilledOutLocalPuts;
        final List<Index> spilledInLocalGets;
        {
            ImSet<Index> entryLocalGets = loa.get(node).getLocalGets();
            ImSet<Index> entryLocalPuts = loa.get(node).getLocalPuts();

            ImSet<Index> nonEntryLocalGets = LocalAnalysis.EMPTY_LOCALS;
            ImSet<Index> nonEntryLocalPuts = LocalAnalysis.EMPTY_LOCALS;
            Optional<Node> cur = Optional.of(node);
            while (true) {
                Optional<Node> next = requireNonNull(parentsByNode.get(cur.get()));
                if (!next.isPresent()) {
                    break;
                }
                for (Node sibling : next.get().getChildren()) {
                    if (sibling == cur.get()) {
                        continue;
                    }
                    nonEntryLocalGets = nonEntryLocalGets.union(loa.get(sibling).getLocalGets());
                    nonEntryLocalPuts = nonEntryLocalPuts.union(loa.get(sibling).getLocalPuts());
                }
                cur = next;
            }

            Set<Index> entryLocals = Sets.union(entryLocalGets, entryLocalPuts);
            Set<Index> nonEntryLocals = Sets.union(nonEntryLocalGets, nonEntryLocalPuts);
            Set<Index> entryOnlyLocals = Sets.difference(entryLocals, nonEntryLocals);

            Set<Index> spilledOutLocalPutsSet = Sets.intersection(entryLocalPuts, nonEntryLocalGets);
            spilledOutLocalPuts = spilledOutLocalPutsSet.stream().sorted().collect(toImmutableList());
            spilledInLocalGets = Sets.intersection(nonEntryLocalPuts, entryLocalGets).stream().filter(i -> !spilledOutLocalPutsSet.contains(i)).sorted().collect(toImmutableList());

            List<Index> entryOnlyLocalList = entryOnlyLocals.stream().sorted().collect(toImmutableList());
            checkState(Sets.intersection(ImmutableSet.copyOf(spilledInLocalGets), ImmutableSet.copyOf(entryOnlyLocals)).isEmpty());

            allLocals = ImmutableList.<Index>builder()
                    .addAll(spilledOutLocalPuts)
                    .addAll(spilledInLocalGets)
                    .addAll(entryOnlyLocalList)
                    .build();
        }

        Map<Index, Index> localTranslationMap = enumerate(allLocals.stream()).collect(toImmutableMap(i -> i.getItem(), i -> Index.of(i.getIndex())));

        ControlTransferAnalysis.Entry maxCfa = cfa.get(node);
        List<ControlTransferAnalysis.Target> targets = ImmutableList.copyOf(maxCfa.getTargets());
        Map<ControlTransferAnalysis.Target, Name> targetNameMap = enumerate(targets.stream()).collect(toImmutableMap(i -> i.getItem(), i -> Name.of("_epilog$" + i.getIndex())));

        ImmutableMap.Builder<ControlTransferAnalysis.Target, Type> targetTypesBuilder = ImmutableMap.builder();
        for (ControlTransferAnalysis.Target target : targets) {
            if (target.equals(ControlTransferAnalysis.Target.RETURN)) {
                targetTypesBuilder.put(ControlTransferAnalysis.Target.RETURN, function.getResult());
            }
            else if (target instanceof ControlTransferAnalysis.NameTarget) {
                Name name = ((ControlTransferAnalysis.NameTarget) target).getName();
                Type type = vta.get(nodesByName.get(name)).getType();
                targetTypesBuilder.put(target, type);
            }
            else {
                throw new IllegalStateException();
            }
        }
        Map<ControlTransferAnalysis.Target, Type> targetTypes = targetTypesBuilder.build();

        Node outlinedBody = node.accept(new Visitor<Void, Node>()
        {
            @Override
            protected Node visitNode(Node node, Void context)
            {
                return reconstructNode(node, node.getChildren().stream().map(child -> child.accept(this, context)).iterator());
            }

            @Override
            public Node visitBreak(Break node, Void context)
            {
                ControlTransferAnalysis.Target target = ControlTransferAnalysis.Target.of(node.getTarget());
                if (targetNameMap.containsKey(target)) {
                    return new Break(
                            targetNameMap.get(ControlTransferAnalysis.Target.of(node.getTarget())),
                            node.getValue().accept(this, context));
                }
                else {
                    return super.visitBreak(node, context);
                }
            }

            @Override
            public Node visitBreakTable(BreakTable node, Void context)
            {
                return super.visitBreakTable(node, context);
            }

            @Override
            public Node visitGetLocal(GetLocal node, Void context)
            {
                return new GetLocal(
                        localTranslationMap.get(node.getIndex()),
                        node.getType());
            }

            @Override
            public Node visitReturn(Return node, Void context)
            {
                return new Break(
                        targetNameMap.get(ControlTransferAnalysis.Target.RETURN),
                        node.getValue().accept(this, context));
            }

            @Override
            public Node visitSetLocal(SetLocal node, Void context)
            {
                return new SetLocal(
                        localTranslationMap.get(node.getIndex()),
                        node.getType(),
                        node.getValue().accept(this, context));
            }
        }, null);

        Index internalRetControl = Index.of(allLocals.size());
        Index internalRetValue = Index.of(allLocals.size() + 1);

        ValueTypeAnalysis.Entry maxVta = vta.get(node);
        if (maxCfa.getExecution() == ControlTransferAnalysis.Execution.FALLTHROUGH) {
            if (maxVta.getType() != Type.NONE) {
                outlinedBody = new Block(
                        ImmutableList.of(
                                new SetLocal(
                                        internalRetValue,
                                        Type.I64,
                                        packI64(outlinedBody, maxVta.getType())),
                                new Break(
                                        Name.of("_epilog$"),
                                        new Nop())));
            }
            else {
                outlinedBody = new Block(
                        ImmutableList.of(
                                outlinedBody,
                                new Break(
                                        Name.of("_epilog$"),
                                        new Nop())));
            }
        }

        for (int i = 0; i < targets.size(); ++i) {
            ControlTransferAnalysis.Target target = targets.get(i);
            Name name = targetNameMap.get(target);
            Type type = targetTypes.get(target);

            outlinedBody = new Label(
                    name,
                    outlinedBody);

            switch (type) {
                case NONE:
                    break;
                case I32:
                case I64:
                case F32:
                case F64:
                    outlinedBody = new SetLocal(
                            internalRetValue,
                            Type.I64,
                            packI64(outlinedBody, type));
                    break;
                default:
                    throw new IllegalStateException();
            }

            outlinedBody = new Block(
                    ImmutableList.of(
                            new Block(
                                    ImmutableList.of(
                                            outlinedBody,
                                            new SetLocal(
                                                    internalRetControl,
                                                    Type.I32,
                                                    new Const(
                                                            Literal.of(i))),
                                            new Break(
                                                    Name.of("_epilog$"),
                                                    new Nop())))));
        }

        Node returnValueSpiller =
                new Call(
                        new Call.HostTarget(HostOp.SpillPut, Optional.empty()),
                        HostOp.SpillPut.getSignature(),
                        ImmutableList.of(
                                new Const(
                                        Literal.of(0)),
                                new GetLocal(
                                        internalRetValue,
                                        Type.I64)));

        List<Node> localSpillers = enumerate(spilledOutLocalPuts.stream())
                .map(i -> {
                    Type type = function.getLocals().getLocal(i.getItem()).getType();
                    return new Call(
                            new Call.HostTarget(HostOp.SpillPut, Optional.empty()),
                            HostOp.SpillPut.getSignature(),
                            ImmutableList.of(
                                    new Const(
                                            Literal.of(i.getIndex() + 1)),
                                    packI64(
                                            new GetLocal(
                                                    localTranslationMap.get(i.getItem()),
                                                    type),
                                            type)));
                }).collect(toImmutableList());

        outlinedBody = new Block(
                ImmutableList.of(
                        new Label(
                                Name.of("_epilog$"),
                                outlinedBody),
                        new Block(
                                Stream.concat(
                                        Stream.of(returnValueSpiller),
                                        localSpillers.stream()
                                ).collect(toImmutableList())),
                        new Return(
                                new GetLocal(
                                        internalRetControl,
                                        Type.I32))));

        List<Local> localList = ImmutableList.<Local>builder()
                .addAll(
                        allLocals.stream().map(l -> {
                            Local o = function.getLocals().getLocal(l);
                            return new Local(
                                    o.getName(),
                                    localTranslationMap.get(l),
                                    o.getType());
                        }).iterator())
                .add(
                        new Local(
                                Name.of("_internal$control"),
                                internalRetControl,
                                Type.I32))
                .add(
                        new Local(
                                Name.of("_internal$value"),
                                internalRetValue,
                                Type.I64))
                .build();

        int argCount = spilledOutLocalPuts.size() + spilledInLocalGets.size();

        Function outlinedFunction = new Function(
                outlinedName,
                Type.I32,
                argCount,
                new Locals(localList),
                outlinedBody);

        Node outlinedCall =
                new SetLocal(
                        externalRetControl,
                        Type.I32,
                        new Call(
                                new Call.DirectTarget(outlinedName),
                                outlinedFunction.getSignature(),
                                Stream.concat(spilledOutLocalPuts.stream(), spilledInLocalGets.stream())
                                        .map(i -> new GetLocal(
                                                i,
                                                function.getLocals().getLocal(i).getType()))
                                        .collect(toImmutableList())));

        Node returnValueUnspiller =
                new SetLocal(
                        externalRetValue,
                        Type.I64,
                        new Call(
                                new Call.HostTarget(HostOp.SpillGet, Optional.empty()),
                                HostOp.SpillGet.getSignature(),
                                ImmutableList.of(
                                        new Const(
                                                Literal.of(0)))));

        List<Node> localUnspillers = enumerate(spilledOutLocalPuts.stream())
                .map(i -> {
                    Type type = function.getLocals().getLocal(i.getItem()).getType();
                    return new SetLocal(
                            i.getItem(),
                            type,
                            unpackI64(
                                    new Call(
                                            new Call.HostTarget(HostOp.SpillGet, Optional.empty()),
                                            HostOp.SpillGet.getSignature(),
                                            ImmutableList.of(
                                                    new Const(
                                                            Literal.of(i.getIndex() + 1)))),
                                    type));
                }).collect(toImmutableList());

        Node controlSwitch =
                new Switch(
                        new GetLocal(
                                externalRetControl,
                                Type.I32),
                        Stream.concat(
                                enumerate(targets.stream()).map(i -> {
                                    if (i.getItem().equals(ControlTransferAnalysis.Target.RETURN)) {
                                        return new Switch.Entry(
                                                ImmutableList.of(Switch.Value.of(i.getIndex() + 1)),
                                                new Return(
                                                        unpackI64(
                                                                new GetLocal(
                                                                        externalRetValue,
                                                                        Type.I64),
                                                                function.getResult())));
                                    }
                                    else if (i.getItem() instanceof ControlTransferAnalysis.NameTarget) {
                                        Name name = ((ControlTransferAnalysis.NameTarget) i.getItem()).getName();
                                        Type type = vta.get(nodesByName.get(name)).getType();
                                        Node value = type != Type.NONE ?
                                                unpackI64(
                                                        new GetLocal(
                                                                externalRetValue,
                                                                Type.I64),
                                                        function.getResult())
                                                : new Nop();
                                        return new Switch.Entry(
                                                ImmutableList.of(Switch.Value.of(i.getIndex() + 1)),
                                                new Break(
                                                        name,
                                                        value));
                                    }
                                    else {
                                        throw new IllegalStateException();
                                    }
                                }),
                                Stream.concat(
                                        Stream.of(new Switch.Entry(
                                                ImmutableList.of(Switch.Value.DEFAULT),
                                                new Unreachable()
                                        )),
                                        maxCfa.getExecution() == ControlTransferAnalysis.Execution.FALLTHROUGH ?
                                                Stream.of(new Switch.Entry(
                                                        ImmutableList.of(Switch.Value.of(0)),
                                                        new Nop())) :
                                                Stream.empty())
                        ).collect(toImmutableList()));

        Node callsite = new Block(
                ImmutableList.<Node>builder()
                        .add(outlinedCall)
                        .add(returnValueUnspiller)
                        .addAll(localUnspillers)
                        .add(controlSwitch)
                        .add(maxCfa.getExecution() == ControlTransferAnalysis.Execution.FALLTHROUGH ?
                                unpackI64(
                                        new GetLocal(
                                                externalRetControl,
                                                Type.I64),
                                        maxVta.getType()) :
                                new Nop())
                        .build());

        return new OutlinedFunction(callsite, outlinedFunction);
    }
}
