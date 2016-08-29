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

import com.google.common.collect.SetMultimap;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.util.graph.DominatorTree;
import org.jgraph.graph.DefaultEdge;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;

import javax.annotation.concurrent.Immutable;

import java.util.Map;
import java.util.Set;

import static com.google.common.collect.Multimaps.unmodifiableSetMultimap;
import static com.wrmsr.wava.util.collect.PersistentMaps.invertTree;
import static java.util.Collections.unmodifiableMap;
import static java.util.Collections.unmodifiableSet;
import static java.util.Objects.requireNonNull;

@Immutable
public final class BasicDominatorInfo
{
    private final DominatorTree<Name, DefaultEdge> impl;
    private final Map<Name, Set<Name>> dominatedTree;

    private BasicDominatorInfo(DominatorTree<Name, DefaultEdge> impl, Map<Name, Set<Name>> dominatedTree)
    {
        this.impl = requireNonNull(impl);
        this.dominatedTree = requireNonNull(dominatedTree);
    }

    public SetMultimap<Name, Name> getDominatorTree()
    {
        return unmodifiableSetMultimap(impl.getDominatorTree());
    }

    public Set<Name> getDominators(Name name)
    {
        return getDominatorTree().get(name);
    }

    public SetMultimap<Name, Name> getDominanceFrontiers()
    {
        return unmodifiableSetMultimap(impl.getDominanceFrontiers());
    }

    public Set<Name> getDominanceFrontier(Name name)
    {
        return getDominanceFrontiers().get(name);
    }

    public Map<Name, Set<Name>> getDominatedTree()
    {
        return unmodifiableMap(dominatedTree);
    }

    public Set<Name> getDominated(Name name)
    {
        return unmodifiableSet(getDominatedTree().get(name));
    }

    public Map<Name, Name> getImmediateDominators()
    {
        return unmodifiableMap(impl.getIdoms());
    }

    public Name getImmediateDominator(Name name)
    {
        return getImmediateDominators().get(name);
    }

    public static BasicDominatorInfo build(Iterable<Basic> basics)
    {
        DirectedGraph<Name, DefaultEdge> graph;
        graph = new DefaultDirectedGraph<>(DefaultEdge.class);
        basics.forEach(basic -> graph.addVertex(basic.getName()));
        basics.forEach(s ->
                s.getAllTargets().forEach(d -> {
                    if (!Basics.TERMINAL_NAMES.contains(d)) {
                        graph.addEdge(s.getName(), d);
                    }
                }));
        DominatorTree<Name, DefaultEdge> impl = new DominatorTree<>(graph, Basics.ENTRY_NAME);
        Map<Name, Set<Name>> dominatedTree = invertTree(impl.getDominatorTree()::get, Basics.ENTRY_NAME);
        return new BasicDominatorInfo(impl, dominatedTree);
    }

    public static BasicDominatorInfo build(BasicSet basics)
    {
        return build(basics.basics());
    }
}
