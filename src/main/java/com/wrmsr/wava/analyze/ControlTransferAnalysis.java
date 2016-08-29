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
import com.wrmsr.wava.core.node.Break;
import com.wrmsr.wava.core.node.BreakTable;
import com.wrmsr.wava.core.node.If;
import com.wrmsr.wava.core.node.Label;
import com.wrmsr.wava.core.node.Loop;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Return;
import com.wrmsr.wava.core.node.Switch;
import com.wrmsr.wava.core.node.Unreachable;
import com.wrmsr.wava.core.node.visitor.Visitor;
import com.wrmsr.wava.core.type.Name;
import org.organicdesign.fp.collections.ImSet;
import org.organicdesign.fp.collections.PersistentHashSet;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;
import static com.google.common.collect.Maps.newIdentityHashMap;
import static com.wrmsr.wava.util.RecursiveConsumer.acceptRecursive;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableSet;
import static java.util.Collections.unmodifiableMap;
import static java.util.Objects.requireNonNull;

@Immutable
public final class ControlTransferAnalysis
{
    private static final ImSet<Target> EMPTY_TARGETS = PersistentHashSet.empty();

    private static final Entry INFINITE = new Entry(Execution.INFINITE, EMPTY_TARGETS, true);
    private static final Entry UNREACHABLE = new Entry(Execution.UNREACHABLE, EMPTY_TARGETS, false);

    public enum Execution
    {
        FALLTHROUGH,
        TERMINAL,
        INFINITE,
        UNREACHABLE;
    }

    public static abstract class Target
    {
        public static final ReturnTarget RETURN = new ReturnTarget();
        public static final NoreturnTarget NORETURN = new NoreturnTarget();

        public static NameTarget of(Name name)
        {
            return new NameTarget(name);
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
            return true;
        }

        @Override
        public String toString()
        {
            return MoreObjects.toStringHelper(this)
                    .toString();
        }
    }

    public static final class NameTarget
            extends Target
    {
        private final Name name;

        public NameTarget(Name name)
        {
            this.name = requireNonNull(name);
        }

        public Name getName()
        {
            return name;
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
            NameTarget that = (NameTarget) o;
            return Objects.equals(name, that.name);
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(name);
        }

        @Override
        public String toString()
        {
            return MoreObjects.toStringHelper(this)
                    .add("name", name)
                    .toString();
        }
    }

    public static final class ReturnTarget
            extends Target
    {
        private ReturnTarget()
        {
        }
    }

    public static final class NoreturnTarget
            extends Target
    {
        private NoreturnTarget()
        {
        }
    }

    public static final class Entry
    {
        private final Execution execution;
        private final ImSet<Target> targets;
        private final boolean isLoop;

        private Entry(Execution execution, ImSet<Target> targets, boolean isLoop)
        {
            this.execution = requireNonNull(execution);
            this.targets = requireNonNull(targets);
            this.isLoop = isLoop;
            if (execution == Execution.INFINITE || execution == Execution.UNREACHABLE) {
                checkArgument(targets.isEmpty());
            }
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
            Entry entry = (Entry) o;
            return isLoop == entry.isLoop &&
                    execution == entry.execution &&
                    Objects.equals(targets, entry.targets);
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(execution, targets, isLoop);
        }

        @Override
        public String toString()
        {
            return MoreObjects.toStringHelper(this)
                    .add("execution", execution)
                    .add("targets", targets)
                    .add("isLoop", isLoop)
                    .toString();
        }

        public Execution getExecution()
        {
            return execution;
        }

        public ImSet<Target> getTargets()
        {
            return targets;
        }

        public boolean isLoop()
        {
            return isLoop;
        }

        public Set<Name> getTargetNames()
        {
            return targets.stream()
                    .filter(target -> target instanceof ControlTransferAnalysis.NameTarget)
                    .map(ControlTransferAnalysis.NameTarget.class::cast)
                    .map(ControlTransferAnalysis.NameTarget::getName)
                    .collect(toImmutableSet());
        }
    }

    private final Map<Node, Entry> entries;

    private ControlTransferAnalysis(Map<Node, Entry> entries)
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

    public Set<Name> getTargetNames(Stream<Node> nodes)
    {
        return nodes
                .map(this::get)
                .map(Entry::getTargets)
                .flatMap(Set::stream)
                .filter(target -> target instanceof ControlTransferAnalysis.NameTarget)
                .map(ControlTransferAnalysis.NameTarget.class::cast)
                .map(ControlTransferAnalysis.NameTarget::getName)
                .collect(toImmutableSet());
    }

    private static Execution mergeExecutions(Execution left, Execution right)
    {
        if (left == Execution.FALLTHROUGH || right == Execution.FALLTHROUGH) {
            return Execution.FALLTHROUGH;
        }
        if (left == Execution.TERMINAL || right == Execution.TERMINAL) {
            return Execution.TERMINAL;
        }
        if (left == Execution.INFINITE || right == Execution.INFINITE) {
            return Execution.INFINITE;
        }
        return Execution.UNREACHABLE;
    }

    public static ControlTransferAnalysis analyze(Node root)
    {
        Map<Node, Entry> analyses = newIdentityHashMap();
        Entry rootAnalysis = root.accept(new Visitor<Void, Entry>()
        {
            private Entry analyzeChild(Node node, Void context)
            {
                Entry analysis = node.accept(this, context);
                checkState(analysis.getExecution() != Execution.UNREACHABLE);
                analyses.put(node, analysis);
                return analysis;
            }

            private void putUnreachable(Node node)
            {
                acceptRecursive((rec, n) -> {
                    analyses.put(n, UNREACHABLE);
                    n.getChildren().forEach(rec);
                }, node);
            }

            @Override
            protected Entry visitNode(Node node, Void context)
            {
                Execution execution = Execution.FALLTHROUGH;
                ImSet<Target> targets = EMPTY_TARGETS;
                List<Node> children = node.getChildren();
                boolean isLoop = false;
                int i = 0;
                while (i < children.size()) {
                    Entry analysis = analyzeChild(children.get(i++), context);
                    targets = targets.union(analysis.getTargets());
                    if (analysis.getExecution() != Execution.FALLTHROUGH) {
                        execution = analysis.getExecution();
                        isLoop = analysis.isLoop();
                        break;
                    }
                }
                while (i < children.size()) {
                    putUnreachable(children.get(i++));
                }
                return new Entry(execution, targets, isLoop);
            }

            @Override
            public Entry visitBreak(Break node, Void context)
            {
                Entry value = analyzeChild(node.getValue(), context);
                if (value.getExecution() == Execution.FALLTHROUGH) {
                    return new Entry(Execution.TERMINAL, value.getTargets().union(ImmutableList.of(Target.of(node.getTarget()))), false);
                }
                else {
                    return value;
                }
            }

            @Override
            public Entry visitBreakTable(BreakTable node, Void context)
            {
                Entry condition = analyzeChild(node.getCondition(), context);
                if (condition.getExecution() == Execution.FALLTHROUGH) {
                    Set<Target> targets = Stream.concat(node.getTargets().stream(), Stream.of(node.getDefaultTarget())).map(Target::of).collect(Collectors.toSet());
                    return new Entry(Execution.TERMINAL, condition.getTargets().union(targets), false);
                }
                else {
                    return condition;
                }
            }

            @Override
            public Entry visitIf(If node, Void context)
            {
                Entry condition = analyzeChild(node.getCondition(), context);
                if (condition.getExecution() == Execution.FALLTHROUGH) {
                    Entry ifTrue = analyzeChild(node.getIfTrue(), context);
                    Entry ifFalse = analyzeChild(node.getIfFalse(), context);
                    Execution execution = mergeExecutions(ifTrue.getExecution(), ifFalse.getExecution());
                    checkState(execution != Execution.UNREACHABLE);
                    return new Entry(execution, ifTrue.getTargets().union(ifFalse.getTargets()), false);
                }
                else {
                    putUnreachable(node.getIfTrue());
                    putUnreachable(node.getIfFalse());
                    return condition;
                }
            }

            @Override
            public Entry visitLabel(Label node, Void context)
            {
                Entry body = analyzeChild(node.getBody(), context);
                Target target = Target.of(node.getName());
                if (body.getTargets().contains(target)) {
                    return new Entry(Execution.FALLTHROUGH, body.getTargets().without(target), false);
                }
                else {
                    return body;
                }
            }

            @Override
            public Entry visitLoop(Loop node, Void context)
            {
                Entry body = analyzeChild(node.getBody(), context);
                ImSet<Target> targets = body.getTargets().without(Target.of(node.getName()));
                if (body.getExecution() == Execution.TERMINAL && targets.isEmpty()) {
                    return INFINITE;
                }
                else {
                    return new Entry(body.getExecution(), targets, true);
                }
            }

            @Override
            public Entry visitReturn(Return node, Void context)
            {
                Entry value = analyzeChild(node.getValue(), context);
                if (value.getExecution() == Execution.FALLTHROUGH) {
                    return new Entry(Execution.TERMINAL, EMPTY_TARGETS.put(Target.RETURN), false);
                }
                else {
                    return value;
                }
            }

            @Override
            public Entry visitSwitch(Switch node, Void context)
            {
                Entry condition = analyzeChild(node.getCondition(), context);
                if (condition.getExecution() == Execution.FALLTHROUGH) {
                    Execution execution = Execution.UNREACHABLE;
                    ImSet<Target> targets = EMPTY_TARGETS;
                    for (Switch.Entry switchEntry : node.getEntries()) {
                        Entry caseEntry = analyzeChild(switchEntry.getBody(), context);
                        execution = mergeExecutions(execution, caseEntry.getExecution());
                        targets = targets.union(caseEntry.getTargets());
                    }
                    checkState(execution != Execution.UNREACHABLE);
                    return new Entry(execution, targets, false);
                }
                else {
                    node.getEntries().stream().map(Switch.Entry::getBody).forEach(this::putUnreachable);
                    return condition;
                }
            }

            @Override
            public Entry visitUnreachable(Unreachable node, Void context)
            {
                return new Entry(Execution.TERMINAL, EMPTY_TARGETS.put(Target.RETURN), false);
            }
        }, null);
        analyses.put(root, rootAnalysis);
        return new ControlTransferAnalysis(analyses);
    }
}

