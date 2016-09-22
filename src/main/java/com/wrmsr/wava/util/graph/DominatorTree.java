/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

// https://svn.apache.org/repos/asf/flex/falcon/trunk/compiler/src/org/apache/flex/abc/graph/algorithms/DominatorTree.java
package com.wrmsr.wava.util.graph;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;
import org.jgrapht.DirectedGraph;
import org.jgrapht.Graphs;
import org.jgrapht.traverse.DepthFirstIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import static java.util.Objects.requireNonNull;

/**
 * An implementation of the O(n log n) Lengauer-Tarjan algorithm for building the
 * <a href="http://en.wikipedia.org/wiki/Dominator_%28graph_theory%29">dominator tree</a>
 * of a flowgraph.
 */
public class DominatorTree<V, E>
{
    private final DirectedGraph<V, E> graph;
    /**
     * Semidominator numbers by block.
     */
    private Map<V, Integer> semi = new HashMap<V, Integer>();
    /**
     * Parents by block.
     */
    private Map<V, V> parent = new HashMap<V, V>();
    /**
     * Predecessors by block.
     */
    private SetMultimap<V, V> pred = HashMultimap.create();
    /**
     * Blocks in DFS order; used to look up a block from its semidominator
     * numbering.
     */
    private ArrayList<V> vertex = new ArrayList<V>();
    /**
     * Blocks by semidominator block.
     */
    private SetMultimap<V, V> bucket = HashMultimap.create();
    /**
     * idominator map, built iteratively.
     */
    private Map<V, V> idom = new HashMap<V, V>();
    /**
     * Dominance frontiers of this dominator tree, built on demand.
     */
    private SetMultimap<V, V> dominanceFrontiers = null;
    /**
     * Dominator tree, built on demand from the idominator map.
     */
    private SetMultimap<V, V> dominatorTree = null;
    /**
     * Auxiliary data structure used by the O(m log n) eval/link implementation:
     * ancestor relationships in the forest (the processed tree as it's built
     * back up).
     */
    private Map<V, V> ancestor = new HashMap<V, V>();
    /**
     * Auxiliary data structure used by the O(m log n) eval/link implementation:
     * node with least semidominator seen during traversal of a path from node
     * to subtree root in the forest.
     */
    private Map<V, V> label = new HashMap<V, V>();
    /**
     * A topological traversal of the dominator tree, built on demand.
     */
    private LinkedList<V> topologicalTraversalImpl = null;

    public DominatorTree(DirectedGraph<V, E> graph, V root)
    {
        this.graph = requireNonNull(graph);
        this.dfs(root);
        this.computeDominators();
    }

    /**
     * Create and/or fetch the map of immediate dominators.
     *
     * @return the map from each block to its immediate dominator
     * (if it has one).
     */
    public Map<V, V> getIdoms()
    {
        return this.idom;
    }

    /**
     * Compute and/or fetch the dominator tree as a SetMultimap.
     *
     * @return the dominator tree.
     */
    public SetMultimap<V, V> getDominatorTree()
    {
        if (this.dominatorTree == null) {
            this.dominatorTree = HashMultimap.create();

            for (V node : this.idom.keySet()) {
                dominatorTree.get(this.idom.get(node)).add(node);
            }
        }

        return this.dominatorTree;
    }

    private List<V> getSuccessors(V v)
    {
        return Graphs.successorListOf(graph, v);
    }

    /**
     * Compute and/or fetch the dominance frontiers as a SetMultimap.
     *
     * @return a SetMultimap where the set of nodes mapped to each key
     * node is the set of nodes in the key node's dominance frontier.
     */
    public SetMultimap<V, V> getDominanceFrontiers()
    {
        if (this.dominanceFrontiers == null) {
            this.dominanceFrontiers = HashMultimap.create();

            getDominatorTree(); // touch the dominator tree

            for (V x : reverseTopologicalTraversal()) {
                Set<V> dfx = this.dominanceFrontiers.get(x);

                //  Compute DF(local)
                for (V y : getSuccessors(x)) {
                    if (idom.get(y) != x) {
                        dfx.add(y);
                    }
                }

                //  Compute DF(up)
                for (V z : this.dominatorTree.get(x)) {
                    for (V y : this.dominanceFrontiers.get(z)) {
                        if (idom.get(y) != x) {
                            dfx.add(y);
                        }
                    }
                }
            }
        }

        return this.dominanceFrontiers;
    }

    /**
     * Create and/or fetch a topological traversal of the dominator tree,
     * such that for every node, idom(node) appears before node.
     *
     * @return the topological traversal of the dominator tree,
     * as an immutable List.
     */
    public List<V> topologicalTraversal()
    {
        return Collections.unmodifiableList(getToplogicalTraversalImplementation());
    }

    /**
     * Create and/or fetch a reverse topological traversal of the dominator tree,
     * such that for every node, node appears before idom(node).
     *
     * @return a reverse topological traversal of the dominator tree,
     * as an immutable List.
     */
    public Iterable<V> reverseTopologicalTraversal()
    {
        return new Iterable<V>()
        {
            @Override
            public Iterator<V> iterator()
            {
                return getToplogicalTraversalImplementation().descendingIterator();
            }
        };
    }

    private void dfs(V root)
    {
        Iterator<V> it = new DepthFirstIterator<>(graph, root);

        while (it.hasNext()) {
            V node = it.next();

            if (!semi.containsKey(node)) {
                vertex.add(node);

                //  Initial assumption: the node's semidominator is itself.
                semi.put(node, semi.size());
                label.put(node, node);

                for (V child : getSuccessors(node)) {
                    pred.get(child).add(node);
                    if (!semi.containsKey(child)) {
                        parent.put(child, node);
                    }
                }
            }
        }
    }

    /**
     * Steps 2, 3, and 4 of Lengauer-Tarjan.
     */
    private void computeDominators()
    {
        int lastSemiNumber = semi.size() - 1;

        for (int i = lastSemiNumber; i > 0; i--) {
            V w = vertex.get(i);
            V p = this.parent.get(w);

            //  step 2: compute semidominators
            //  for each v in pred(w)...
            int semidominator = semi.get(w);
            for (V v : pred.get(w)) {
                semidominator = Math.min(semidominator, semi.get(eval(v)));
            }

            semi.put(w, semidominator);
            bucket.get(vertex.get(semidominator)).add(w);

            //  Link w into the forest via its parent, p
            link(p, w);

            //  step 3: implicitly compute idominators
            //  for each v in bucket(parent(w)) ...
            for (V v : bucket.get(p)) {
                V u = eval(v);

                if (semi.get(u) < semi.get(v)) {
                    idom.put(v, u);
                }
                else {
                    idom.put(v, p);
                }
            }

            bucket.get(p).clear();
        }

        // step 4: explicitly compute idominators
        for (int i = 1; i <= lastSemiNumber; i++) {
            V w = vertex.get(i);

            if (idom.get(w) != vertex.get((semi.get(w)))) {
                idom.put(w, idom.get(idom.get(w)));
            }
        }
    }

    /**
     * Extract the node with the least-numbered semidominator in the (processed)
     * ancestors of the given node.
     *
     * @param v - the node of interest.
     * @return "If v is the root of a tree in the forest, return v. Otherwise,
     * let r be the root of the tree which contains v. Return any vertex u != r
     * of miniumum semi(u) on the path r-*v."
     */
    private V eval(V v)
    {
        //  This version of Lengauer-Tarjan implements
        //  eval(v) as a path-compression procedure.
        compress(v);
        return label.get(v);
    }

    /**
     * Traverse ancestor pointers back to a subtree root, then propagate the
     * least semidominator seen along this path through the "label" map.
     */
    private void compress(V v)
    {
        Stack<V> worklist = new Stack<V>();
        worklist.add(v);

        V a = this.ancestor.get(v);

        //  Traverse back to the subtree root.
        while (this.ancestor.containsKey(a)) {
            worklist.push(a);
            a = this.ancestor.get(a);
        }

        //  Propagate semidominator information forward.
        V ancestor = worklist.pop();
        int leastSemi = semi.get(label.get(ancestor));

        while (!worklist.empty()) {
            V descendent = worklist.pop();
            int currentSemi = semi.get(label.get(descendent));

            if (currentSemi > leastSemi) {
                label.put(descendent, label.get(ancestor));
            }
            else {
                leastSemi = currentSemi;
            }

            //  Prepare to process the next iteration.
            ancestor = descendent;
        }
    }

    /**
     * Simple version of link(parent,child) simply links the child into the
     * parent's forest, with no attempt to balance the subtrees or otherwise
     * optimize searching.
     */
    private void link(V parent, V child)
    {
        this.ancestor.put(child, parent);
    }

    /**
     * Create/fetch the topological traversal of the dominator tree.
     *
     * @return {@link this.topologicalTraversal}, the traversal of
     * the dominator tree such that for any node n with a dominator,
     * n appears before idom(n).
     */
    private LinkedList<V> getToplogicalTraversalImplementation()
    {
        if (this.topologicalTraversalImpl == null) {
            this.topologicalTraversalImpl = new LinkedList<V>();

            for (V node : this.vertex) {
                int idx = this.topologicalTraversalImpl.indexOf(this.idom.get(node));

                if (idx != -1) {
                    this.topologicalTraversalImpl.add(idx + 1, node);
                }
                else {
                    this.topologicalTraversalImpl.add(node);
                }
            }
        }

        return this.topologicalTraversalImpl;
    }
}
