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

import com.google.common.collect.Multimap;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Sets;
import com.wrmsr.wava.core.type.Name;
import org.apache.commons.lang3.tuple.ImmutablePair;

import javax.annotation.concurrent.Immutable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

import static com.google.common.base.Preconditions.checkState;
import static com.google.common.collect.Iterables.getOnlyElement;
import static com.google.common.collect.Multimaps.unmodifiableSetMultimap;
import static com.wrmsr.wava.transform.basic.Basics.ENTRY_NAME;
import static com.wrmsr.wava.util.collect.MoreCollectors.toArrayList;
import static com.wrmsr.wava.util.collect.MoreCollectors.toHashMap;
import static com.wrmsr.wava.util.collect.MoreCollectors.toHashMultimap;
import static com.wrmsr.wava.util.collect.MoreCollectors.toHashSet;
import static java.util.Collections.unmodifiableMap;
import static java.util.Collections.unmodifiableSet;
import static java.util.function.Function.identity;

@Immutable
public final class BasicLoopInfo
{
    private final Set<Name> loops;
    private final SetMultimap<Name, Name> backEdges;
    private final SetMultimap<Name, Name> loopContents;
    private final Map<Name, Name> loopParents;

    public BasicLoopInfo(Set<Name> loops, SetMultimap<Name, Name> backEdges, SetMultimap<Name, Name> loopContents, Map<Name, Name> loopParents)
    {
        this.loops = unmodifiableSet(loops);
        this.backEdges = unmodifiableSetMultimap(backEdges);
        this.loopContents = unmodifiableSetMultimap(loopContents);
        this.loopParents = unmodifiableMap(loopParents);
    }

    public Set<Name> getLoops()
    {
        return loops;
    }

    public boolean isLoop(Name name)
    {
        return loops.contains(name);
    }

    public SetMultimap<Name, Name> getBackEdges()
    {
        return backEdges;
    }

    public Set<Name> getBackEdges(Name loop)
    {
        return unmodifiableSet(backEdges.get(loop));
    }

    public SetMultimap<Name, Name> getLoopContents()
    {
        return loopContents;
    }

    public Set<Name> getLoopContents(Name loop)
    {
        return unmodifiableSet(loopContents.get(loop));
    }

    public Map<Name, Name> getLoopParents()
    {
        return loopParents;
    }

    public Name getLoopParent(Name loop)
    {
        return loopParents.get(loop);
    }

    public static Set<Name> findBasicLoops(Iterable<Basic> basics, BasicDominatorInfo di)
    {
        return StreamSupport.stream(basics.spliterator(), false)
                .filter(b -> di.getDominanceFrontier(b.getName()).contains(b.getName())).map(Basic::getName)
                .collect(toHashSet());
    }

    // loop -> break
    public static SetMultimap<Name, Name> findBasicBackEdges(Iterable<Basic> basics, Set<Name> loops, BasicDominatorInfo di)
    {
        return StreamSupport.stream(basics.spliterator(), false)
                .flatMap(brk -> {
                    Set<Name> bdf = di.getDominanceFrontiers().get(brk.getName());
                    return brk.getAllTargets().stream()
                            .filter(loop -> loops.contains(loop) && bdf.contains(loop) && (loop.equals(brk.getName()) || di.getDominated(loop).contains(brk.getName())))
                            .map(loop -> ImmutablePair.of(loop, brk.getName()));
                })
                .collect(toHashMultimap());
    }

    // FIXME algorithmic catastrophe

    public static Set<Name> getLoopContents(Name loop, Multimap<Name, Name> inputs, Multimap<Name, Name> backEdges)
    {
        Set<Name> seen = new HashSet<>();
        seen.add(loop);
        Queue<Name> queue = new LinkedList<>();
        inputs.get(loop).stream().filter(n -> !n.equals(loop) && backEdges.containsEntry(loop, n)).forEach(queue::add);
        queue.forEach(seen::add);
        while (!queue.isEmpty()) {
            Name cur = queue.poll();
            inputs.get(cur).stream()
                    .filter(input -> !seen.contains(input))
                    .forEach(input -> {
                        seen.add(input);
                        queue.add(input);
                    });
        }
        return seen;
    }

    public static Map<Name, Name> getLoopParents(SetMultimap<Name, Name> loopContents)
    {
        Map<Name, Name> loopParents = new HashMap<>();
        Map<Name, Set<Name>> map = loopContents.keySet().stream().collect(toHashMap(identity(), loop -> new HashSet<>()));
        for (Name cur : loopContents.keySet()) {
            map.get(cur).add(ENTRY_NAME);
            Set<Name> children = loopContents.get(cur);
            for (Name child : children) {
                if (!cur.equals(child) && loopContents.containsKey(child)) {
                    map.get(child).add(cur);
                }
            }
        }
        Map<Name, Integer> loopDepths = map.entrySet().stream().collect(toHashMap(entry -> entry.getKey(), entry -> entry.getValue().size()));
        loopDepths.put(ENTRY_NAME, 0);
        int maxDepth = loopDepths.values().stream().mapToInt(Integer::intValue).max().orElse(0);
        List<List<Name>> depthLoopsLists = IntStream.range(0, maxDepth + 1).boxed().<List<Name>>map(i -> new ArrayList<>()).collect(toArrayList());
        loopDepths.forEach((loop, depth) -> depthLoopsLists.get(depth).add(loop));
        Set<Name> seen = new HashSet<>();
        for (int depth = 1; depth < depthLoopsLists.size(); ++depth) {
            for (Name loop : depthLoopsLists.get(depth)) {
                Name parent = getOnlyElement(Sets.difference(map.get(loop), seen));
                checkState(loopDepths.get(parent) == depth - 1);
                loopParents.put(loop, parent);
            }
            seen.addAll(depthLoopsLists.get(depth - 1));
        }
        checkState(loopContents.keySet().equals(loopParents.keySet()));
        return loopParents;
    }

    public static BasicLoopInfo build(Iterable<Basic> basics, Multimap<Name, Name> inputs, BasicDominatorInfo di)
    {
        Set<Name> loops = findBasicLoops(basics, di);
        SetMultimap<Name, Name> backEdges = findBasicBackEdges(basics, loops, di);
        SetMultimap<Name, Name> loopContents = loops.stream().flatMap(loop -> getLoopContents(loop, inputs, backEdges).stream().map(child -> ImmutablePair.of(loop, child))).collect(toHashMultimap());
        Map<Name, Name> loopParents = getLoopParents(loopContents);
        return new BasicLoopInfo(
                loops,
                backEdges,
                loopContents,
                loopParents);
    }

    public static BasicLoopInfo build(BasicSet basics, BasicDominatorInfo di)
    {
        return build(basics.basics(), basics.getInputsMultimap(), di);
    }
}
