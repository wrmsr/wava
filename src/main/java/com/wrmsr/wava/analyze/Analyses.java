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
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.wrmsr.wava.core.node.Break;
import com.wrmsr.wava.core.node.BreakTable;
import com.wrmsr.wava.core.node.GetLocal;
import com.wrmsr.wava.core.node.Label;
import com.wrmsr.wava.core.node.Loop;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.SetLocal;
import com.wrmsr.wava.core.node.visitor.Visitor;
import com.wrmsr.wava.core.node.visitor.Visitors;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Stack;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

import static com.google.common.base.Preconditions.checkState;
import static com.google.common.collect.Maps.newIdentityHashMap;
import static com.google.common.collect.Sets.newIdentityHashSet;
import static com.wrmsr.wava.util.RecursiveConsumer.acceptRecursive;
import static com.wrmsr.wava.util.RecursiveFunction.applyRecursive;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static java.util.Collections.unmodifiableMap;
import static java.util.Collections.unmodifiableSet;

public final class Analyses
{
    private Analyses()
    {
    }

    public static <T> Map<Node, T> mapAnalyze(Node root, BiFunction<Node, List<T>, T> analyze)
    {
        Map<Node, T> analyses = newIdentityHashMap();
        Visitors.postWalk(root, new Visitor<Void, T>()
        {
            @Override
            protected T visitNode(Node node, Void context)
            {
                checkState(!analyses.containsKey(node));
                List<T> children = node.getChildren().stream().map(e -> e.accept(this, context)).collect(toImmutableList());
                T analysis = analyze.apply(node, children);
                analyses.put(node, analysis);
                return analysis;
            }
        }, null);
        return unmodifiableMap(analyses);
    }

    public static Set<Node> setAnalyze(Node root, BiPredicate<Node, List<Boolean>> analyze)
    {
        Set<Node> analyses = newIdentityHashSet();
        Visitors.postWalk(root, new Visitor<Void, Boolean>()
        {
            @Override
            protected Boolean visitNode(Node node, Void context)
            {
                checkState(!analyses.contains(node));
                List<Boolean> children = node.getChildren().stream().map(e -> e.accept(this, context)).collect(toImmutableList());
                if (analyze.test(node, children)) {
                    analyses.add(node);
                    return true;
                }
                else {
                    return false;
                }
            }
        }, null);
        return unmodifiableSet(analyses);
    }

    public static Map<Node, Optional<Node>> getParents(Node root)
    {
        Map<Node, Optional<Node>> parents = newIdentityHashMap();
        parents.put(root, Optional.empty());
        acceptRecursive((rec, e) -> {
            for (Node c : e.getChildren()) {
                checkState(!parents.containsKey(c));
                parents.put(c, Optional.of(e));
                rec.accept(c);
            }
        }, root);
        return unmodifiableMap(parents);
    }

    public static List<Node> getParentList(Node node, Map<Node, Optional<Node>> parents)
    {
        ImmutableList.Builder<Node> builder = ImmutableList.builder();
        while (true) {
            Optional<Node> cur = parents.get(node);
            if (!cur.isPresent()) {
                break;
            }
            node = cur.get();
            builder.add(node);
        }
        return builder.build();
    }

    public static <T extends Node> Set<T> findNodes(Node root, Class<? extends T> cls)
    {
        Set<T> hits = newIdentityHashSet();
        Visitors.preWalk(root, new Visitor<Void, Void>()
        {
            @Override
            @SuppressWarnings({"unchecked"})
            protected Void visitNode(Node expression, Void context)
            {
                if (cls.isInstance(expression)) {
                    hits.add((T) expression);
                }
                return null;
            }
        }, null);
        return unmodifiableSet(hits);
    }

    public static Map<Name, Node> getNamedNodes(Node root)
    {
        ImmutableMap.Builder<Name, Node> builder = ImmutableMap.builder();
        Visitors.preWalk(root, new Visitor<Void, Void>()
        {
            @Override
            public Void visitLoop(Loop node, Void context)
            {
                builder.put(node.getName(), node);
                return null;
            }

            @Override
            public Void visitLabel(Label node, Void context)
            {
                builder.put(node.getName(), node);
                return null;
            }
        }, null);
        return builder.build();
    }

    public static Set<Name> getReferencedNames(Node root)
    {
        ImmutableSet.Builder<Name> builder = ImmutableSet.builder();
        Visitors.preWalk(root, new Visitor<Void, Void>()
        {
            @Override
            public Void visitBreak(Break node, Void context)
            {
                builder.add(node.getTarget());
                return null;
            }

            @Override
            public Void visitBreakTable(BreakTable node, Void context)
            {
                builder.addAll(node.getTargets());
                builder.add(node.getDefaultTarget());
                return null;
            }
        }, null);
        return builder.build();
    }

    public static Set<Name> getNames(Node root)
    {
        Set<Name> set = new HashSet<>();
        Visitors.preWalk(root, new Visitor<Void, Void>()
        {
            @Override
            public Void visitLoop(Loop node, Void context)
            {
                set.add(node.getName());
                return null;
            }

            @Override
            public Void visitLabel(Label node, Void context)
            {
                set.add(node.getName());
                return null;
            }
        }, null);
        return ImmutableSet.copyOf(set);
    }

    public static void checkLocalTypes(Node root, Map<Index, Type> localTypes)
    {
        Visitors.preWalk(root, new Visitor<Void, Void>()
        {
            @Override
            public Void visitGetLocal(GetLocal node, Void context)
            {
                checkState(localTypes.get(node.getIndex()) == node.getType());
                return null;
            }

            @Override
            public Void visitSetLocal(SetLocal node, Void context)
            {
                checkState(localTypes.get(node.getIndex()) == node.getType());
                return null;
            }
        }, null);
    }

    public static Map<Node, Integer> getChildCounts(Node root)
    {
        Map<Node, Integer> map = new IdentityHashMap<>();
        applyRecursive((rec, node) -> {
            int count = node.getChildren().stream().mapToInt(child -> (int) rec.apply(child) + 1).sum();
            map.put(node, count);
            return count;
        }, root);
        return unmodifiableMap(map);
    }

    public static int getChildCount(Node node)
    {
        Stack<Node> stack = new Stack<>();
        node.getChildren().forEach(stack::push);
        int count = 0;
        while (!stack.isEmpty()) {
            ++count;
            stack.pop().getChildren().forEach(stack::push);
        }
        return count;
    }

    public static List<Node> linearize(Node root)
    {
        ImmutableList.Builder<Node> builder = ImmutableList.builder();
        Visitors.preWalk(root, new Visitor<Void, Void>()
        {
            @Override
            protected Void visitNode(Node node, Void context)
            {
                builder.add(node);
                return null;
            }
        }, null);
        return builder.build();
    }
}
