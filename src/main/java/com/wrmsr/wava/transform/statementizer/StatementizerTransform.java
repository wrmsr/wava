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
package com.wrmsr.wava.transform.statementizer;

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.analyze.ControlTransferAnalysis;
import com.wrmsr.wava.analyze.ValueTypeAnalysis;
import com.wrmsr.wava.core.node.Binary;
import com.wrmsr.wava.core.node.Block;
import com.wrmsr.wava.core.node.Break;
import com.wrmsr.wava.core.node.BreakTable;
import com.wrmsr.wava.core.node.Call;
import com.wrmsr.wava.core.node.CallIndirect;
import com.wrmsr.wava.core.node.Const;
import com.wrmsr.wava.core.node.GetLocal;
import com.wrmsr.wava.core.node.If;
import com.wrmsr.wava.core.node.Label;
import com.wrmsr.wava.core.node.Load;
import com.wrmsr.wava.core.node.Loop;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Nop;
import com.wrmsr.wava.core.node.Return;
import com.wrmsr.wava.core.node.Select;
import com.wrmsr.wava.core.node.SetLocal;
import com.wrmsr.wava.core.node.Store;
import com.wrmsr.wava.core.node.Switch;
import com.wrmsr.wava.core.node.Unary;
import com.wrmsr.wava.core.node.Unreachable;
import com.wrmsr.wava.core.node.visitor.Visitor;
import com.wrmsr.wava.core.node.visitor.Visitors;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.transform.statementizer.fragment.Fragment;
import com.wrmsr.wava.transform.statementizer.fragment.FragmentVisitor;
import com.wrmsr.wava.transform.statementizer.fragment.PureFragment;
import com.wrmsr.wava.transform.statementizer.fragment.TempFragment;
import com.wrmsr.wava.transform.statementizer.fragment.VoidFragment;
import com.wrmsr.wava.util.collect.MoreLists;
import com.wrmsr.wava.util.temps.Temp;
import com.wrmsr.wava.util.temps.TempManager;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.google.common.base.Preconditions.checkState;
import static com.wrmsr.wava.core.node.Nodes.nodify;
import static com.wrmsr.wava.core.node.Nodes.reconstructNode;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static com.wrmsr.wava.util.collect.MoreLists.listHead;
import static com.wrmsr.wava.util.collect.MoreLists.listInit;
import static com.wrmsr.wava.util.collect.MoreLists.listLast;
import static com.wrmsr.wava.util.collect.MoreLists.listTail;
import static com.wrmsr.wava.util.collect.MoreLists.splitStream;
import static com.wrmsr.wava.util.collect.MoreOptionals.ifPresentOrElse;
import static java.util.Objects.requireNonNull;

/*
maybe ExpressionSimplifierTransform later
merge, mutate
no bodies can be moved. lol.
*/

public final class StatementizerTransform
{
    private final ControlTransferAnalysis controlFlowAnalyses;
    private final ValueTypeAnalysis valueTypeAnalyses;
    private final TempManager tempManager;

    private final Map<Name, Temp> labelTemps = new LinkedHashMap<>();

    public StatementizerTransform(
            ControlTransferAnalysis controlFlowAnalyses,
            ValueTypeAnalysis valueTypeAnalyses,
            TempManager tempManager)
    {
        this.controlFlowAnalyses = requireNonNull(controlFlowAnalyses);
        this.valueTypeAnalyses = requireNonNull(valueTypeAnalyses);
        this.tempManager = requireNonNull(tempManager);
    }

    public TempManager getTempManager()
    {
        return tempManager;
    }

    private <T> T tempGuard(Supplier<T> supp)
    {
        int tempGeneration = tempManager.getGeneration();
        T ret = supp.get();
        checkState(tempManager.getGeneration() == tempGeneration);
        return ret;
    }

    public Node transformFunctionBody(Node node)
    {
        return transform(node, Optional.empty()).accept(new FragmentVisitor<Void, Node>()
        {
            @Override
            public Node visitPureFragment(PureFragment fragment, Void context)
            {
                return new Block(
                        ImmutableList.<Node>builder()
                                .addAll(fragment.getBody())
                                .add(new Return(fragment.getValue()))
                                .build());
            }

            @Override
            public Node visitTempFragment(TempFragment fragment, Void context)
            {
                tempManager.freeTemp(fragment.getTemp());
                return new Block(
                        ImmutableList.<Node>builder()
                                .addAll(fragment.getBody())
                                .add(new GetLocal(fragment.getTemp().getIndex(), fragment.getTemp().getType()))
                                .build());
            }

            @Override
            public Node visitVoidFragment(VoidFragment fragment, Void context)
            {
                return new Block(
                        fragment.getBody());
            }
        }, null);
    }

    private Fragment checkValue(Fragment fragment)
    {
        return fragment.accept(new FragmentVisitor<Void, Fragment>()
        {
            @Override
            public Fragment visitTempFragment(TempFragment fragment, Void context)
            {
                return fragment;
            }

            @Override
            public Fragment visitPureFragment(PureFragment fragment, Void context)
            {
                return fragment;
            }
        }, null);
    }

    private PureFragment checkPure(PureFragment fragment)
    {
        Set<Index> tempIndices = tempManager.getTempsByIndex().keySet();
        Visitors.preWalk(fragment.getValue(), new Visitor<Void, Void>()
        {
            @Override
            protected Void visitNode(Node node, Void context)
            {
                throw new IllegalStateException();
            }

            @Override
            public Void visitGetLocal(GetLocal node, Void context)
            {
                checkState(!tempIndices.contains(node.getIndex()));
                return null;
            }

            @Override
            public Void visitBinary(Binary node, Void context)
            {
                return null;
            }

            @Override
            public Void visitCall(Call node, Void context)
            {
                return null;
            }

            @Override
            public Void visitCallIndirect(CallIndirect node, Void context)
            {
                return null;
            }

            @Override
            public Void visitConst(Const node, Void context)
            {
                return null;
            }

            @Override
            public Void visitIf(If node, Void context)
            {
                return null;
            }

            @Override
            public Void visitLoad(Load node, Void context)
            {
                return null;
            }

            @Override
            public Void visitNop(Nop node, Void context)
            {
                return null;
            }

            @Override
            public Void visitSetLocal(SetLocal node, Void context)
            {
                return null;
            }

            @Override
            public Void visitUnary(Unary node, Void context)
            {
                return null;
            }

            @Override
            public Void visitStore(Store node, Void context)
            {
                return null;
            }

            @Override
            public Void visitUnreachable(Unreachable node, Void context)
            {
                return null;
            }
        }, null);
        return fragment;
    }

    private Fragment maybeCheckPure(Fragment fragment)
    {
        if (fragment instanceof PureFragment) {
            checkPure((PureFragment) fragment);
        }
        return fragment;
    }

    private Node getValue(Fragment fragment)
    {
        return fragment.accept(new FragmentVisitor<Void, Node>()
        {
            @Override
            public Node visitPureFragment(PureFragment fragment, Void context)
            {
                return fragment.getValue();
            }

            @Override
            public Node visitTempFragment(TempFragment fragment, Void context)
            {
                return new GetLocal(fragment.getTemp().getIndex(), fragment.getTemp().getType());
            }
        }, null);
    }

    private List<Node> getValues(List<Fragment> fragments)
    {
        return fragments.stream()
                .map(this::getValue)
                .collect(toImmutableList());
    }

    private Optional<Temp> commuteTempValue(Fragment possibleOwner, Optional<Temp> temp)
    {
        return temp.filter(t -> possibleOwner.accept(new FragmentVisitor<Void, Boolean>()
        {
            @Override
            public Boolean visitPureFragment(PureFragment fragment, Void context)
            {
                return true;
            }

            @Override
            public Boolean visitTempFragment(TempFragment fragment, Void context)
            {
                return !fragment.getTemp().getName().equals(t.getName());
            }
        }, null));
    }

    private VoidFragment discardValue(Fragment fragment)
    {
        return fragment.accept(new FragmentVisitor<Void, VoidFragment>()
        {
            @Override
            public VoidFragment visitPureFragment(PureFragment fragment, Void context)
            {
                return new VoidFragment(
                        ImmutableList.<Node>builder()
                                .addAll(fragment.getBody())
                                .add(fragment.getValue())
                                .build());
            }

            @Override
            public VoidFragment visitTempFragment(TempFragment fragment, Void context)
            {
                tempManager.freeTemp(fragment.getTemp());
                return new VoidFragment(fragment.getBody());
            }

            @Override
            public VoidFragment visitVoidFragment(VoidFragment fragment, Void context)
            {
                return fragment;
            }
        }, null);
    }

    private VoidFragment makeTempSink(Fragment fragment, Temp temp)
    {
        return fragment.accept(new FragmentVisitor<Void, VoidFragment>()
        {
            @Override
            public VoidFragment visitPureFragment(PureFragment fragment, Void context)
            {
                return new VoidFragment(
                        ImmutableList.<Node>builder()
                                .addAll(fragment.getBody())
                                .add(
                                        new SetLocal(
                                                temp.getIndex(),
                                                temp.getType(),
                                                fragment.getValue()))
                                .build());
            }

            @Override
            public VoidFragment visitTempFragment(TempFragment fragment, Void context)
            {
                if (fragment.getTemp().getName().equals(temp.getName())) {
                    return new VoidFragment(fragment.getBody());
                }
                else {
                    tempManager.freeTemp(fragment.getTemp());
                    return new VoidFragment(
                            ImmutableList.<Node>builder()
                                    .addAll(fragment.getBody())
                                    .add(
                                            new SetLocal(
                                                    temp.getIndex(),
                                                    temp.getType(),
                                                    new GetLocal(
                                                            fragment.getTemp().getIndex(),
                                                            fragment.getTemp().getType())))
                                    .build());
                }
            }
        }, null);
    }

    private void freeTemps(List<? extends Fragment> fragments)
    {
        fragments.stream()
                .filter(TempFragment.class::isInstance)
                .map(TempFragment.class::cast)
                .map(TempFragment::getTemp)
                .forEach(tempManager::freeTemp);
    }

    private void freeTempsExcept(List<? extends Fragment> fragments, Name except)
    {
        fragments.stream()
                .filter(TempFragment.class::isInstance)
                .map(TempFragment.class::cast)
                .map(TempFragment::getTemp)
                .filter(t -> !t.getName().equals(except))
                .forEach(tempManager::freeTemp);
    }

    private void freeTempsExcept(List<? extends Fragment> fragments, Optional<Name> except)
    {
        ifPresentOrElse(
                except,
                t -> freeTempsExcept(fragments, t),
                () -> freeTemps(fragments));
    }

    private Optional<Temp> freeTempsAndSteal(List<? extends Fragment> fragments, Type type, Optional<Name> except)
    {
        Stream<Temp> temps = fragments.stream()
                .filter(TempFragment.class::isInstance)
                .map(TempFragment.class::cast)
                .map(TempFragment::getTemp);
        MoreLists.SplitStream<Temp> typeTemps = splitStream(temps, t -> t.getType() == type);
        typeTemps.getNonMatches()
                .stream()
                .map(Temp::getName)
                .filter(n -> !(except.isPresent() && except.get().equals(n)))
                .forEach(tempManager::freeTemp);
        List<Name> names = typeTemps.getMatches().stream()
                .map(Temp::getName)
                .collect(Collectors.toList());
        Collections.sort(names);
        if (names.isEmpty()) {
            return Optional.empty();
        }
        else {
            listTail(names).forEach(tempManager::freeTemp);
            return Optional.of(tempManager.getTemp(listHead(names)));
        }
    }

    private List<Node> mergeBodies(List<? extends Fragment> fragments)
    {
        return fragments.stream()
                .flatMap(f -> f.getBody().stream())
                .collect(toImmutableList());
    }

    private List<Node> mergeBodiesWith(List<? extends Fragment> fragments, Node node)
    {
        return Stream.concat(
                fragments.stream().flatMap(f -> f.getBody().stream()),
                Stream.of(node)
        ).collect(toImmutableList());
    }

    private VoidFragment mergeVoids(List<VoidFragment> voids)
    {
        return new VoidFragment(
                voids.stream()
                        .flatMap(f -> f.getBody().stream())
                        .collect(toImmutableList()));
    }

    @SuppressWarnings({"unchecked"})
    private <T extends Fragment> T mapBody(T fragment, UnaryOperator<List<Node>> op)
    {
        return (T) fragment.accept(new FragmentVisitor<Void, Fragment>()
        {
            @Override
            public Fragment visitPureFragment(PureFragment fragment, Void context)
            {
                return new PureFragment(
                        op.apply(fragment.getBody()),
                        fragment.getValue());
            }

            @Override
            public Fragment visitTempFragment(TempFragment fragment, Void context)
            {
                return new TempFragment(
                        op.apply(fragment.getBody()),
                        fragment.getTemp());
            }

            @Override
            public Fragment visitVoidFragment(VoidFragment fragment, Void context)
            {
                return new VoidFragment(
                        op.apply(fragment.getBody()));
            }
        }, null);
    }

    private <T extends Fragment> T prependWithVoids(List<VoidFragment> voids, T fragment)
    {
        List<Node> mergedBodies = Stream.concat(
                voids.stream().flatMap(f -> f.getBody().stream()),
                fragment.getBody().stream()
        ).collect(toImmutableList());
        return mapBody(fragment, l -> mergedBodies);
    }

    private TempFragment makeTemp(List<? extends Fragment> setup, Node value, Temp temp)
    {
        return new TempFragment(
                mergeBodiesWith(
                        setup,
                        new SetLocal(
                                temp.getIndex(),
                                temp.getType(),
                                value)),
                temp);
    }

    private List<Fragment> transformValues(List<Node> nodes, final Optional<Temp> temp)
    {
        Optional<Temp> nextTemp = temp;
        ImmutableList.Builder<Fragment> fragmentsBuilder = ImmutableList.builder();
        for (Node node : nodes) {
            Fragment fragment = transform(node, nextTemp);
            checkValue(fragment);
            fragmentsBuilder.add(fragment);
            nextTemp = commuteTempValue(fragment, nextTemp);
        }
        return fragmentsBuilder.build();
    }

    private Fragment reconstructMutatedValues(Node node, Optional<Temp> temp)
    {
        ValueTypeAnalysis.Entry vta = requireNonNull(valueTypeAnalyses.get(node));
        if (!vta.isUsed()) {
            return reconstructConsumedValues(node);
        }
        List<Fragment> operandFragments = transformValues(node.getChildren(), temp);
        List<Node> operandValues = getValues(operandFragments);
        Node valueNode = tempGuard(() -> reconstructNode(node, operandValues.iterator()));
        Type type = vta.getType();
        if (temp.isPresent()) {
            Temp out = temp.get();
            if (out.getType() == type) {
                freeTempsExcept(operandFragments, out.getName());
                return makeTemp(operandFragments, valueNode, out);
            }
        }
        if (operandFragments.stream().anyMatch(TempFragment.class::isInstance)) {
            Temp out = freeTempsAndSteal(operandFragments, type, temp.map(Temp::getName))
                    .orElseGet(() -> tempManager.allocTemp(type));
            return makeTemp(operandFragments, valueNode, out);
        }
        else {
            return new PureFragment(
                    mergeBodies(operandFragments),
                    valueNode);
        }
    }

    private Fragment reconstructConsumedValues(Node node)
    {
        Function<List<Node>, Node> consumer = l -> reconstructNode(node, l.iterator());
        List<Fragment> operandFragments = transformValues(node.getChildren(), Optional.empty());
        List<Node> operandValues = getValues(operandFragments);
        Node consumedNode = tempGuard(() -> consumer.apply(operandValues));
        freeTemps(operandFragments);
        return new VoidFragment(
                mergeBodiesWith(operandFragments, consumedNode));
    }

    private Fragment transform(Node node)
    {
        return transform(node, Optional.empty());
    }

    private Fragment transform(Node node, final Optional<Temp> temp)
    {
        ControlTransferAnalysis.Entry cfa = requireNonNull(controlFlowAnalyses.get(node));
        ValueTypeAnalysis.Entry vta = requireNonNull(valueTypeAnalyses.get(node));
        temp.ifPresent(t -> checkState(vta.getType().isConcrete() && vta.isUsed()));
        return node.accept(new Visitor<Void, Fragment>()
        {
            @Override
            protected Fragment visitNode(Node node, Void context)
            {
                throw new IllegalStateException();
            }

            @Override
            public Fragment visitBinary(Binary node, Void context)
            {
                return reconstructMutatedValues(node, temp);
            }

            @Override
            public Fragment visitBlock(Block node, Void context)
            {
                if (vta.isUsed()) {
                    List<VoidFragment> init = listInit(node.getChildren())
                            .map(StatementizerTransform.this::transform)
                            .map(StatementizerTransform.this::discardValue)
                            .collect(toImmutableList());
                    Fragment last = transform(listLast(node.getChildren()), temp);
                    // TODO UH
                    // checkValue(last);
                    return prependWithVoids(init, last);
                }
                else {
                    List<VoidFragment> children = node.getChildren().stream()
                            .map(StatementizerTransform.this::transform)
                            .map(StatementizerTransform.this::discardValue)
                            .collect(toImmutableList());
                    return mergeVoids(children);
                }
            }

            @Override
            public Fragment visitBreak(Break node, Void context)
            {
                Optional<Temp> targetTemp = Optional.ofNullable(labelTemps.get(node.getTarget()));
                VoidFragment nopBreak =
                        new VoidFragment(
                                ImmutableList.of(
                                        new Break(
                                                node.getTarget(),
                                                new Nop())));
                return ifPresentOrElse(
                        targetTemp,
                        out -> {
                            Fragment valueFragment = transform(node.getValue(), Optional.of(out));
                            checkValue(valueFragment);
                            return prependWithVoids(
                                    ImmutableList.of(
                                            makeTempSink(valueFragment, out)),
                                    nopBreak);
                        },
                        () -> {
                            Fragment valueFragment = transform(node.getValue(), Optional.empty());
                            return prependWithVoids(
                                    ImmutableList.of(
                                            discardValue(valueFragment)),
                                    nopBreak);
                        });
            }

            @Override
            public Fragment visitBreakTable(BreakTable node, Void context)
            {
                return reconstructConsumedValues(node);
            }

            @Override
            public Fragment visitCall(Call node, Void context)
            {
                return reconstructMutatedValues(node, temp);
            }

            @Override
            public Fragment visitCallIndirect(CallIndirect node, Void context)
            {
                return reconstructMutatedValues(node, temp);
            }

            @Override
            public Fragment visitConst(Const node, Void context)
            {
                return new PureFragment(
                        ImmutableList.of(),
                        node);
            }

            @Override
            public Fragment visitGetLocal(GetLocal node, Void context)
            {
                return new PureFragment(
                        ImmutableList.of(),
                        node);
            }

            @Override
            public Fragment visitIf(If node, Void context)
            {
                if (vta.getInitialization() == ValueTypeAnalysis.Initialization.INLINE && vta.getOwnership() == ValueTypeAnalysis.Ownership.FREE) {
                    PureFragment ret = (PureFragment) reconstructMutatedValues(node, Optional.empty());
                    checkPure(ret);
                    return ret;
                }
                // FIXME delete cuz select
                else if (vta.getType().isConcrete() && vta.isUsed()) {
                    Fragment condition = transform(node.getCondition(), temp);
                    checkValue(condition);
                    Temp out = temp.orElseGet(() -> tempManager.allocTemp(vta.getType()));
                    VoidFragment ifTrue = makeTempSink(transform(node.getIfTrue(), commuteTempValue(condition, temp)), out);
                    VoidFragment ifFalse = makeTempSink(transform(node.getIfFalse(), commuteTempValue(condition, temp)), out);
                    // FIXME free temps
                    return new TempFragment(
                            ImmutableList.<Node>builder()
                                    .addAll(condition.getBody())
                                    .add(
                                            new If(
                                                    getValue(condition),
                                                    nodify(ifTrue.getBody()),
                                                    nodify(ifFalse.getBody())))
                                    .build(),
                            out);
                }
                else {
                    Fragment condition = transform(node.getCondition(), temp);
                    checkValue(condition);
                    VoidFragment ifTrue = discardValue(transform(node.getIfTrue(), commuteTempValue(condition, temp)));
                    VoidFragment ifFalse = discardValue(transform(node.getIfFalse(), commuteTempValue(condition, temp)));
                    return new VoidFragment(
                            ImmutableList.<Node>builder()
                                    .addAll(condition.getBody())
                                    .add(
                                            new If(
                                                    getValue(condition),
                                                    nodify(ifTrue.getBody()),
                                                    nodify(ifFalse.getBody())))
                                    .build());
                }
            }

            @Override
            public Fragment visitLabel(Label node, Void context)
            {
                if (vta.isUsed() && vta.getType() != Type.NONE) {
                    ControlTransferAnalysis.Entry bodyCfa = requireNonNull(controlFlowAnalyses.get(node.getBody()));
                    Temp out = temp.orElseGet(() -> tempManager.allocTemp(vta.getType()));
                    checkState(!labelTemps.containsKey(node.getName()));
                    labelTemps.put(node.getName(), out);
                    Fragment transformedBody = transform(listLast(node.getChildren()), temp);
                    List<Node> retBody;
                    if (bodyCfa.getExecution() == ControlTransferAnalysis.Execution.FALLTHROUGH) {
                        checkValue(transformedBody);
                        retBody = makeTempSink(transformedBody, out).getBody();
                    }
                    else {
                        retBody = discardValue(transformedBody).getBody();
                    }
                    checkState(labelTemps.get(node.getName()).getName().equals(out.getName()));
                    labelTemps.remove(node.getName());
                    labelTemps.put(node.getName(), out);
                    return new TempFragment(
                            ImmutableList.of(
                                    new Label(
                                            node.getName(),
                                            nodify(retBody))),

                            out);
                }
                else {
                    VoidFragment body = discardValue(transform(node.getBody()));
                    return new VoidFragment(
                            ImmutableList.of(
                                    new Label(
                                            node.getName(),
                                            nodify(body.getBody()))));
                }
            }

            @Override
            public Fragment visitLoad(Load node, Void context)
            {
                return reconstructMutatedValues(node, temp);
            }

            @Override
            public Fragment visitLoop(Loop node, Void context)
            {
                Fragment body = transform(node.getBody(), temp);
                return mapBody(body, l -> ImmutableList.of(
                        new Loop(
                                node.getName(),
                                nodify(l))));
            }

            @Override
            public Fragment visitNop(Nop node, Void context)
            {
                return new PureFragment(
                        ImmutableList.of(),
                        node);
            }

            @Override
            public Fragment visitReturn(Return node, Void context)
            {
                return reconstructConsumedValues(node);
            }

            @Override
            public Fragment visitSelect(Select node, Void context)
            {
                Temp ifTrueTemp = tempManager.allocTemp(vta.getType());
                Temp ifFalseTemp = tempManager.allocTemp(vta.getType());
                VoidFragment ifTrue = makeTempSink(transform(node.getIfTrue(), Optional.of(ifTrueTemp)), ifTrueTemp);
                VoidFragment ifFalse = makeTempSink(transform(node.getIfFalse(), Optional.of(ifFalseTemp)), ifFalseTemp);
                Fragment condition = transform(node.getCondition());
                tempManager.freeTemp(ifTrueTemp);
                tempManager.freeTemp(ifFalseTemp);
                Temp result = temp.orElseGet(() -> tempManager.allocTemp(vta.getType()));
                VoidFragment sink = makeTempSink(
                        new PureFragment(
                                ImmutableList.of(),
                                new Select(
                                        new GetLocal(
                                                ifTrueTemp.getIndex(),
                                                vta.getType()),
                                        new GetLocal(
                                                ifFalseTemp.getIndex(),
                                                vta.getType()),
                                        getValue(condition))),
                        result);
                return new TempFragment(
                        mergeVoids(ImmutableList.of(ifTrue, ifFalse, sink)).getBody(),
                        result);
            }

            @Override
            public Fragment visitSetLocal(SetLocal node, Void context)
            {
                return reconstructMutatedValues(node, temp);
            }

            @Override
            public Fragment visitStore(Store node, Void context)
            {
                return reconstructMutatedValues(node, temp);
            }

            @Override
            public Fragment visitSwitch(Switch node, Void context)
            {
                Fragment condition = transform(node.getCondition(), temp);
                checkValue(condition);
                ImmutableList.Builder<Switch.Entry> entries = ImmutableList.builder();
                for (Switch.Entry e : node.getEntries()) {
                    VoidFragment f = discardValue(transform(e.getBody(), commuteTempValue(condition, temp)));
                    entries.add(
                            new Switch.Entry(
                                    e.getValues(),
                                    nodify(f.getBody())));
                }
                return new VoidFragment(
                        ImmutableList.<Node>builder()
                                .addAll(condition.getBody())
                                .add(
                                        new Switch(
                                                getValue(condition),
                                                entries.build()))
                                .build());
            }

            @Override
            public Fragment visitUnary(Unary node, Void context)
            {
                return reconstructMutatedValues(node, temp);
            }

            @Override
            public Fragment visitUnreachable(Unreachable node, Void context)
            {
                return new VoidFragment(
                        ImmutableList.of(node));
            }
        }, null);
    }
}
