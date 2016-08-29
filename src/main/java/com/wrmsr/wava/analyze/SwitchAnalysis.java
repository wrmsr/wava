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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.wrmsr.wava.core.node.Block;
import com.wrmsr.wava.core.node.BreakTable;
import com.wrmsr.wava.core.node.Label;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.visitor.Visitor;
import com.wrmsr.wava.core.type.Name;

import javax.annotation.concurrent.Immutable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static com.google.common.base.Preconditions.checkState;
import static com.wrmsr.wava.core.node.Nodes.nodify;
import static com.wrmsr.wava.util.collect.MoreLists.listHead;
import static com.wrmsr.wava.util.collect.MoreLists.listTail;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static java.util.Objects.requireNonNull;

@Immutable
public final class SwitchAnalysis
{
    @Immutable
    public static final class CaseEntry
    {
        private final Name name;
        private final List<Integer> values;
        private final List<Node> body;

        public CaseEntry(Name name, List<Integer> values, List<Node> body)
        {
            this.name = requireNonNull(name);
            this.values = ImmutableList.copyOf(values);
            this.body = ImmutableList.copyOf(body);
        }

        public Name getName()
        {
            return name;
        }

        public List<Integer> getValues()
        {
            return values;
        }

        public List<Node> getBody()
        {
            return body;
        }
    }

    @Immutable
    public static final class SwitchEntry
    {
        private final Label entryPoint;
        private final BreakTable core;
        private final List<CaseEntry> casesEntries;

        public SwitchEntry(Label entryPoint, BreakTable core, List<CaseEntry> casesEntries)
        {
            this.entryPoint = requireNonNull(entryPoint);
            this.core = requireNonNull(core);
            this.casesEntries = ImmutableList.copyOf(casesEntries);
        }

        public Label getEntryPoint()
        {
            return entryPoint;
        }

        public BreakTable getCore()
        {
            return core;
        }

        public List<CaseEntry> getCasesEntries()
        {
            return casesEntries;
        }
    }

    private final List<SwitchEntry> entries;

    public SwitchAnalysis(List<SwitchEntry> entries)
    {
        this.entries = ImmutableList.copyOf(entries);
    }

    public List<SwitchEntry> getEntries()
    {
        return entries;
    }

    public static SwitchAnalysis analyze(Node root, ControlTransferAnalysis cfa)
    {
        List<SwitchEntry> entries = new ArrayList<>();
        analyze(root, cfa, entries, Optional.empty());
        return new SwitchAnalysis(entries);
    }

    @Immutable
    private static final class Link
    {
        private final Label label;
        private final List<Node> body;
        private final Optional<Link> next;

        public Link(Label label, List<Node> body, Optional<Link> next)
        {
            this.label = requireNonNull(label);
            this.body = ImmutableList.copyOf(body);
            this.next = requireNonNull(next);
        }
    }

    private static void analyze(Node node, ControlTransferAnalysis cfa, List<SwitchEntry> entries, Optional<Link> link)
    {
        node.accept(new Visitor<Void, Void>()
        {
            @Override
            protected Void visitNode(Node node, Void context)
            {
                for (int i = 0; i < node.getChildren().size(); ++i) {
                    analyze(node.getChildren().get(i), cfa, entries, Optional.empty());
                }
                return null;
            }

            @Override
            public Void visitBreakTable(BreakTable node, Void context)
            {
                analyze(node.getCondition(), cfa, entries, Optional.empty());

                if (!link.isPresent() || !link.get().body.isEmpty()) {
                    return null;
                }
                Map<Name, List<Integer>> caseValues = new HashMap<>();
                caseValues.put(node.getDefaultTarget(), new ArrayList<>());
                for (int i = 0; i < node.getTargets().size(); ++i) {
                    Name target = node.getTargets().get(i);
                    List<Integer> values = caseValues.get(target);
                    if (values == null) {
                        values = new ArrayList<>();
                        caseValues.put(target, values);
                    }
                    values.add(i);
                }

                Set<Name> cases = new HashSet<>();
                cases.addAll(caseValues.keySet());
                cases.add(node.getDefaultTarget());

                Map<Name, CaseEntry> caseEntries = new LinkedHashMap<>();
                Set<Name> remaining = new HashSet<>(cases);
                Set<Name> outliers = new HashSet<>();
                Optional<Link> prev = Optional.empty();
                Optional<Link> cur = link;
                while (!remaining.isEmpty() && cur.isPresent()) {
                    Link curLink = cur.get();
                    Optional<Link> next = curLink.next;
                    Name curName = curLink.label.getName();
                    if (!remaining.contains(curName)) {
                        if (!prev.isPresent()) {
                            return null;
                        }
                        Name prevName = prev.get().label.getName();
                        Set<Name> prevTargets = cfa.getTargetNames(prev.get().body.stream());
                        if (prevTargets.contains(curName)) {
                            return null;
                        }
                        Set<Name> targets = cfa.getTargetNames(curLink.body.stream());
                        outliers.addAll(Sets.intersection(targets, remaining));
                        CaseEntry prevEntry = requireNonNull(caseEntries.get(prevName));
                        caseEntries.put(prevName, new CaseEntry(prevName, prevEntry.values, ImmutableList.<Node>builder().add(new Label(curName, nodify(prevEntry.body))).addAll(curLink.body).build()));
                    }
                    else {
                        remaining.remove(curName);
                        Set<Name> targets = cfa.getTargetNames(curLink.body.stream());
                        outliers.addAll(Sets.intersection(targets, remaining));
                        List<Integer> values = requireNonNull(caseValues.get(curLink.label.getName()), "all but default require int values");
                        checkState(!caseEntries.containsKey(curName));
                        caseEntries.put(curName, new CaseEntry(curLink.label.getName(), values, !remaining.isEmpty() ? next.map(l -> l.body).orElse(ImmutableList.of()) : ImmutableList.of()));
                    }
                    prev = Optional.of(curLink);
                    cur = next;
                }
                if (!prev.isPresent() || !remaining.isEmpty() || !outliers.isEmpty()) {
                    return null;
                }
                entries.add(new SwitchEntry(prev.get().label, node, ImmutableList.copyOf(caseEntries.values())));
                return null;
            }

            @Override
            public Void visitLabel(Label node, Void context)
            {
                Label label = node;
                node.getBody().accept(new Visitor<Void, Void>()
                {
                    @Override
                    protected Void visitNode(Node node, Void context)
                    {
                        analyze(node, cfa, entries, Optional.empty());
                        return null;
                    }

                    @Override
                    public Void visitBlock(Block node, Void context)
                    {
                        if (node.getChildren().isEmpty()) {
                            return null;
                        }
                        Node first = listHead(node.getChildren());
                        List<Node> tail = listTail(node.getChildren()).collect(toImmutableList());
                        analyze(first, cfa, entries, Optional.of(new Link(label, tail, link)));
                        for (Node child : tail) {
                            analyze(child, cfa, entries, Optional.empty());
                        }
                        return null;
                    }

                    @Override
                    public Void visitBreakTable(BreakTable node, Void context)
                    {
                        analyze(node, cfa, entries, Optional.of(new Link(label, ImmutableList.of(), link)));
                        return null;
                    }

                    @Override
                    public Void visitLabel(Label node, Void context)
                    {
                        analyze(node, cfa, entries, Optional.of(new Link(label, ImmutableList.of(), link)));
                        return null;
                    }
                }, null);
                return null;
            }
        }, null);
    }
}
