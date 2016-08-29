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
package com.wrmsr.wava.analyze;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
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
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.organicdesign.fp.collections.ImMap;
import org.organicdesign.fp.collections.PersistentHashMap;

import javax.annotation.concurrent.Immutable;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;
import static com.google.common.collect.Maps.newIdentityHashMap;
import static com.google.common.collect.Sets.immutableEnumSet;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static com.wrmsr.wava.util.collect.MoreLists.listInit;
import static com.wrmsr.wava.util.collect.MoreLists.listLast;
import static java.util.Collections.unmodifiableMap;
import static java.util.Objects.requireNonNull;

/*
TODO:
 - Types.UNREACHABLE may appear anywhere, are considered any type, and may be used. :||||
*/

@Immutable
public final class ValueTypeAnalysis
{
    public static final ImMap<Name, Set<Type>> EMPTY_BREAK_VALUE_TYPES = PersistentHashMap.empty();

    public enum Initialization
    {
        INLINE, // value, no statements :: => 5
        SETUP,  // value, statements    :: { x = 4; } => 5
        VOID;   // no value, statements :: { break l; } =>
    }

    public enum Ownership
    {
        FREE,      // no temps      :: (const 5)
        TEMP,      // new temp      :: (label a (break a 5))
        INHERITED, // modified temp :: (+ (label a (break a 5)) 5)
        VOID;      // no value      :: (return)
    }

    public static final class Entry
    {
        private final Type type;
        private final Initialization initialization;
        private final Ownership ownership;
        private final ImMap<Name, Set<Type>> breakValueTypes;

        private final boolean isUsed;

        private Entry(
                Type type,
                Initialization initialization,
                Ownership ownership,
                ImMap<Name, Set<Type>> breakValueTypes,
                boolean isUsed)
        {
            this.type = requireNonNull(type);
            this.initialization = requireNonNull(initialization);
            this.ownership = requireNonNull(ownership);
            this.breakValueTypes = requireNonNull(breakValueTypes);
            this.isUsed = isUsed;
            // note that type=NONE with isUsed=true is legal (breaks/returns with nop values) so long as nothing attempts to.. um.. ~use~ the value
            // checkArgument((type == Type.NONE) == (initialization == Initialization.VOID));
            // checkArgument((type == Type.NONE) == (ownership == Ownership.VOID));
        }

        private Entry(
                Type type,
                Initialization initialization,
                Ownership ownership,
                ImMap<Name, Set<Type>> breakValueTypes,
                Context context)
        {
            this(
                    type,
                    initialization,
                    ownership,
                    breakValueTypes,
                    context.isUsed);
        }

        @Override
        public String toString()
        {
            return MoreObjects.toStringHelper(this)
                    .add("type", type)
                    .add("initialization", initialization)
                    .add("ownership", ownership)
                    .add("breakValueTypes", breakValueTypes)
                    .add("isUsed", isUsed)
                    .toString();
        }

        public Type getType()
        {
            return type;
        }

        public Initialization getInitialization()
        {
            return initialization;
        }

        public Ownership getOwnership()
        {
            return ownership;
        }

        public boolean isUsed()
        {
            return isUsed;
        }

        public ImMap<Name, Set<Type>> getBreakValueTypes()
        {
            return breakValueTypes;
        }
    }

    private final Map<Node, Entry> entries;

    private ValueTypeAnalysis(Map<Node, Entry> entries)
    {
        this.entries = unmodifiableMap(entries);
    }

    public Entry get(Node node)
    {
        return requireNonNull(entries.get(node));
    }

    public Map<Node, Entry> getEntries()
    {
        return entries;
    }

    private static final class Context
    {
        private final boolean isUsed;

        public Context(boolean isUsed)
        {
            this.isUsed = isUsed;
        }
    }

    private static ImMap<Name, Set<Type>> updateBreakValueTypes(ImMap<Name, Set<Type>> map, List<Name> targets, Type type)
    {
        for (Name target : targets) {
            map = map.assoc(target, immutableEnumSet(Sets.union(map.getOrElse(target, ImmutableSet.of()), ImmutableSet.of(type))));
        }
        return map;
    }

    private static ImMap<Name, Set<Type>> mergeBreakValueTypes(Iterator<ImMap<Name, Set<Type>>> it)
    {
        ImMap<Name, Set<Type>> ret = EMPTY_BREAK_VALUE_TYPES;
        while (it.hasNext()) {
            ImMap<Name, Set<Type>> cur = it.next();
            for (Map.Entry<Name, Set<Type>> entry : cur.entrySet()) {
                ret = ret.assoc(entry.getKey(), immutableEnumSet(Sets.union(cur.getOrElse(entry.getKey(), ImmutableSet.of()), entry.getValue())));
            }
        }
        return ret;
    }

    private static ImMap<Name, Set<Type>> mergeBreakValueTypes(Iterable<ImMap<Name, Set<Type>>> items)
    {
        return mergeBreakValueTypes(items.iterator());
    }

    private static ImMap<Name, Set<Type>> mergeBreakValueTypes(ImMap<Name, Set<Type>> left, ImMap<Name, Set<Type>> right)
    {
        for (Map.Entry<Name, Set<Type>> entry : right.entrySet()) {
            left = left.assoc(entry.getKey(), immutableEnumSet(Sets.union(right.getOrElse(entry.getKey(), ImmutableSet.of()), entry.getValue())));
        }
        return left;
    }

    private static Initialization mergeValueInitializations(Initialization... is)
    {
        for (Initialization i : is) {
            checkArgument(i != Initialization.VOID);
            if (i != Initialization.INLINE) {
                checkState(i == Initialization.SETUP);
                return i;
            }
        }
        return Initialization.INLINE;
    }

    private static Ownership mergeValueOwnerships(Ownership... os)
    {
        for (Ownership o : os) {
            checkArgument(o != Ownership.VOID);
            if (o == Ownership.TEMP || o == Ownership.INHERITED) {
                return Ownership.INHERITED;
            }
            checkArgument(o == Ownership.FREE);
        }
        return Ownership.FREE;
    }

    public static ValueTypeAnalysis analyze(Node root, boolean isRootUsed)
    {
        Map<Node, Entry> analyses = newIdentityHashMap();
        Entry rootAnalysis = root.accept(new Visitor<Context, Entry>()
        {
            private Entry analyzeChild(Node child, Context context)
            {
                Entry analysis = child.accept(this, context);
                analyses.put(child, analysis);
                return analysis;
            }

            @Override
            protected Entry visitNode(Node node, Context context)
            {
                throw new IllegalStateException();
            }

            @Override
            public Entry visitBinary(Binary node, Context context)
            {
                Entry left = analyzeChild(node.getLeft(), new Context(true));
                Entry right = analyzeChild(node.getRight(), new Context(true));
                checkState(left.getType() == right.getType());
                checkState(left.getType().isConcrete());
                Type resultType = requireNonNull(node.getOp().getTypeMap().get(ImmutablePair.of(left.getType(), right.getType())));
                checkState(node.getType() == resultType);
                return new Entry(
                        node.getType(),
                        mergeValueInitializations(left.getInitialization(), right.getInitialization()),
                        mergeValueOwnerships(left.getOwnership(), right.getOwnership()),
                        mergeBreakValueTypes(left.getBreakValueTypes(), right.getBreakValueTypes()),
                        context);
            }

            @Override
            public Entry visitBlock(Block node, Context context)
            {
                List<Node> children = node.getChildren();
                List<Entry> init = listInit(children).map(c -> analyzeChild(c, new Context(false))).collect(toImmutableList());
                Entry last = analyzeChild(listLast(children), new Context(context.isUsed));
                ImMap<Name, Set<Type>> breakValueTypes = Stream.concat(init.stream(), Stream.of(last))
                        .map(Entry::getBreakValueTypes)
                        .reduce(EMPTY_BREAK_VALUE_TYPES, ValueTypeAnalysis::mergeBreakValueTypes);
                return new Entry(
                        last.getType(),
                        init.isEmpty() && last.getInitialization() == Initialization.INLINE ? Initialization.INLINE :
                                !last.getType().isConcrete() ? Initialization.VOID : Initialization.SETUP,
                        last.getOwnership(),
                        breakValueTypes,
                        context);
            }

            @Override
            public Entry visitBreak(Break node, Context context)
            {
                // checkState(!context.isUsed);
                Entry value = analyzeChild(node.getValue(), new Context(true));
                return new Entry(
                        Type.NONE,
                        Initialization.VOID,
                        Ownership.VOID,
                        updateBreakValueTypes(
                                value.getBreakValueTypes(),
                                ImmutableList.of(node.getTarget()),
                                value.getType()),
                        context);
            }

            @Override
            public Entry visitBreakTable(BreakTable node, Context context)
            {
                // checkState(!context.isUsed);
                Entry condition = analyzeChild(node.getCondition(), new Context(true));
                return new Entry(
                        Type.NONE,
                        Initialization.VOID,
                        Ownership.VOID,
                        updateBreakValueTypes(
                                condition.getBreakValueTypes(),
                                ImmutableList.<Name>builder()
                                        .addAll(node.getTargets())
                                        .add(node.getDefaultTarget())
                                        .build(),
                                Type.NONE),
                        context);
            }

            @Override
            public Entry visitCall(Call node, Context context)
            {
                // TODO: check operands?
                Call.Target target = node.getTarget();
                Type type = node.getSignature().getResult();
                requireNonNull(type);
                List<Entry> operands = node.getOperands().stream().map(o -> analyzeChild(o, new Context(true))).collect(toImmutableList());
                checkState(operands.stream().allMatch(o -> o.getType().isConcrete()));
                return new Entry(
                        type,
                        mergeValueInitializations(
                                operands.stream()
                                        .map(Entry::getInitialization)
                                        .collect(toImmutableList())
                                        .toArray(new Initialization[] {})),
                        Ownership.FREE,
                        operands.stream()
                                .map(Entry::getBreakValueTypes)
                                .reduce(EMPTY_BREAK_VALUE_TYPES, ValueTypeAnalysis::mergeBreakValueTypes),
                        context);
            }

            @Override
            public Entry visitCallIndirect(CallIndirect node, Context context)
            {
                Entry target = analyzeChild(node.getTarget(), new Context(true));
                checkState(target.getType().isConcrete());
                List<Entry> operands = node.getOperands().stream().map(o -> analyzeChild(o, new Context(true))).collect(toImmutableList());
                checkState(operands.stream().allMatch(o -> o.getType().isConcrete()));
                return new Entry(
                        node.getSignature().getResult(),
                        mergeValueInitializations(
                                Stream.concat(Stream.of(target), operands.stream())
                                        .map(Entry::getInitialization)
                                        .collect(toImmutableList()).toArray(new Initialization[] {})),
                        Ownership.FREE,
                        Stream.concat(Stream.of(target), operands.stream())
                                .map(Entry::getBreakValueTypes)
                                .reduce(EMPTY_BREAK_VALUE_TYPES, ValueTypeAnalysis::mergeBreakValueTypes),
                        context);
            }

            @Override
            public Entry visitConst(Const node, Context context)
            {
                return new Entry(
                        node.getLiteral().getType(),
                        Initialization.INLINE,
                        Ownership.FREE,
                        EMPTY_BREAK_VALUE_TYPES,
                        context);
            }

            @Override
            public Entry visitGetLocal(GetLocal node, Context context)
            {
                return new Entry(
                        node.getType(),
                        Initialization.INLINE,
                        Ownership.FREE,
                        EMPTY_BREAK_VALUE_TYPES,
                        context);
            }

            @Override
            public Entry visitIf(If node, Context context)
            {
                Entry condition = analyzeChild(node.getCondition(), new Context(true));
                Entry ifTrue = analyzeChild(node.getIfTrue(), new Context(context.isUsed));
                Entry ifFalse = analyzeChild(node.getIfFalse(), new Context(context.isUsed));
                checkState(condition.getType().isConcrete());
                ImMap<Name, Set<Type>> breakValueTypes = Stream.of(condition, ifTrue, ifFalse)
                        .map(Entry::getBreakValueTypes)
                        .reduce(EMPTY_BREAK_VALUE_TYPES, ValueTypeAnalysis::mergeBreakValueTypes);
                if (context.isUsed) {
                    checkState(ifTrue.getType() == ifFalse.getType());
                    checkState(ifTrue.getType().isConcrete());
                    return new Entry(
                            ifTrue.getType(),
                            mergeValueInitializations(condition.getInitialization(), ifTrue.getInitialization(), ifFalse.getInitialization()),
                            mergeValueOwnerships(ifTrue.getOwnership(), ifFalse.getOwnership()),
                            breakValueTypes,
                            context);
                }
                else {
                    return new Entry(
                            Type.NONE,
                            Initialization.VOID,
                            Ownership.VOID,
                            breakValueTypes,
                            context);
                }
            }

            @Override
            public Entry visitLabel(Label node, Context context)
            {
                // FIXME CFA -> ignore unreachable tails? or expect removed?
                Entry body = analyzeChild(node.getBody(), new Context(context.isUsed));
                ImMap<Name, Set<Type>> breakValueTypes = body.getBreakValueTypes();
                Type type = body.getType();
                Initialization initialization = body.getInitialization();
                Ownership ownership = body.getOwnership();
                if (breakValueTypes.containsKey(node.getName())) {
                    Type breakType = Iterables.getOnlyElement(breakValueTypes.get(node.getName()));
                    if (breakType.isConcrete()) {
                        checkState(type == breakType || type == Type.NONE);
                        type = breakType;
                        initialization = Initialization.SETUP;
                        ownership = Ownership.TEMP;
                    }
                    else {
                        if (context.isUsed) {
                            checkState(type == Type.NONE);
                        }
                        else {
                            type = Type.NONE;
                            initialization = Initialization.VOID;
                            ownership = Ownership.VOID;
                        }
                    }
                    breakValueTypes = breakValueTypes.without(node.getName());
                }
                return new Entry(
                        type,
                        initialization,
                        ownership,
                        breakValueTypes,
                        context);
            }

            @Override
            public Entry visitLoad(Load node, Context context)
            {
                Entry ptr = analyzeChild(node.getPtr(), new Context(true));
                checkState(ptr.getType() == Type.I32);
                return new Entry(
                        node.getType(),
                        ptr.getInitialization(),
                        Ownership.FREE,
                        ptr.getBreakValueTypes(),
                        context);
            }

            @Override
            public Entry visitLoop(Loop node, Context context)
            {
                Entry body = analyzeChild(node.getBody(), new Context(context.isUsed));
                ImMap<Name, Set<Type>> breakValueTypes = body.getBreakValueTypes();
                if (breakValueTypes.containsKey(node.getName())) {
                    checkState(breakValueTypes.get(node.getName()).equals(EnumSet.of(Type.NONE)));
                    breakValueTypes = breakValueTypes.without(node.getName());
                }
                return new Entry(
                        body.getType(),
                        body.getInitialization(),
                        body.getOwnership(),
                        breakValueTypes,
                        context);
            }

            @Override
            public Entry visitNop(Nop node, Context context)
            {
                return new Entry(
                        Type.NONE,
                        Initialization.VOID,
                        Ownership.VOID,
                        EMPTY_BREAK_VALUE_TYPES,
                        context);
            }

            @Override
            public Entry visitReturn(Return node, Context context)
            {
                checkState(!context.isUsed);
                Entry value = analyzeChild(node.getValue(), new Context(true));
                return new Entry(
                        Type.NONE,
                        Initialization.VOID,
                        Ownership.VOID,
                        value.getBreakValueTypes(),
                        context);
            }

            @Override
            public Entry visitSelect(Select node, Context context)
            {
                Entry ifTrue = analyzeChild(node.getIfTrue(), new Context(true));
                Entry ifFalse = analyzeChild(node.getIfFalse(), new Context(true));
                Entry condition = analyzeChild(node.getCondition(), new Context(true));
                checkState(ifTrue.getType() == ifFalse.getType());
                checkState(ifTrue.getType().isConcrete());
                checkState(condition.getType() == Type.I32);
                return new Entry(
                        ifTrue.getType(),
                        Initialization.SETUP, // FIXME? used check?
                        Ownership.TEMP,
                        mergeBreakValueTypes(ImmutableList.of(ifTrue.getBreakValueTypes(), ifFalse.getBreakValueTypes(), condition.getBreakValueTypes())),
                        context);
            }

            @Override
            public Entry visitSetLocal(SetLocal node, Context context)
            {
                Entry value = analyzeChild(node.getValue(), new Context(true));
                checkState(value.getType().isConcrete());
                checkState(value.getType() == node.getType());
                return new Entry(
                        value.getType(),
                        value.getInitialization(),
                        value.getOwnership(),
                        value.getBreakValueTypes(),
                        context);
            }

            @Override
            public Entry visitStore(Store node, Context context)
            {
                Entry ptr = analyzeChild(node.getPtr(), new Context(true));
                Entry value = analyzeChild(node.getValue(), new Context(true));
                checkState(ptr.getType() == Type.I32);
                checkState(value.getType() == node.getType());
                return new Entry(
                        node.getType(),
                        mergeValueInitializations(ptr.getInitialization(), value.getInitialization()),
                        value.getOwnership(),
                        mergeBreakValueTypes(ptr.getBreakValueTypes(), value.getBreakValueTypes()),
                        context);
            }

            @Override
            public Entry visitSwitch(Switch node, Context context)
            {
                List<Entry> cases = node.getEntries().stream().map(Switch.Entry::getBody).map(child -> analyzeChild(child, new Context(false))).collect(toImmutableList());
                Entry condition = analyzeChild(node.getCondition(), new Context(true));
                checkState(condition.getType().isConcrete() && !condition.getType().isFloat());
                return new Entry(
                        Type.NONE,
                        Initialization.VOID,
                        Ownership.VOID,
                        mergeBreakValueTypes(
                                Stream.concat(
                                        Stream.of(condition.getBreakValueTypes()),
                                        cases.stream().map(Entry::getBreakValueTypes))
                                        .iterator()),
                        context);
            }

            @Override
            public Entry visitUnary(Unary node, Context context)
            {
                Entry value = analyzeChild(node.getValue(), new Context(true));
                checkState(value.getType().isConcrete());
                Set<Type> resultTypes = requireNonNull(node.getOp().getTypeMap().get(value.getType()));
                checkState(resultTypes.contains(node.getType()));
                return new Entry(
                        node.getType(),
                        value.getInitialization(),
                        value.getOwnership(),
                        value.getBreakValueTypes(),
                        context);
            }

            @Override
            public Entry visitUnreachable(Unreachable node, Context context)
            {
                return new Entry(
                        Type.UNREACHABLE,
                        Initialization.VOID,
                        Ownership.VOID,
                        EMPTY_BREAK_VALUE_TYPES,
                        context);
            }
        }, new Context(isRootUsed));
        checkState(rootAnalysis.getBreakValueTypes().isEmpty());
        analyses.put(root, rootAnalysis);
        return new ValueTypeAnalysis(analyses);
    }
}
