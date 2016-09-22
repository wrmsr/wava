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

import com.wrmsr.wava.core.node.GetLocal;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.SetLocal;
import com.wrmsr.wava.core.node.visitor.Visitor;
import com.wrmsr.wava.core.type.Index;
import org.organicdesign.fp.collections.ImSet;
import org.organicdesign.fp.collections.PersistentHashSet;

import javax.annotation.concurrent.Immutable;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import static com.google.common.base.Preconditions.checkState;
import static java.util.Collections.unmodifiableMap;
import static java.util.Objects.requireNonNull;

@Immutable
public final class LocalAnalysis
{
    public static final ImSet<Index> EMPTY_LOCALS = PersistentHashSet.empty();
    public static final Entry EMPTY = new Entry(EMPTY_LOCALS, EMPTY_LOCALS);

    @Immutable
    public static final class Entry
    {
        private final ImSet<Index> localGets;
        private final ImSet<Index> localPuts;

        public Entry(ImSet<Index> localGets, ImSet<Index> localPuts)
        {
            this.localGets = localGets;
            this.localPuts = localPuts;
        }

        public ImSet<Index> getLocalGets()
        {
            return localGets;
        }

        public ImSet<Index> getLocalPuts()
        {
            return localPuts;
        }

        public Entry merge(Entry other)
        {
            return new Entry(
                    localGets.union(other.localGets),
                    localPuts.union(other.localPuts));
        }
    }

    private final Map<Node, Entry> entries;

    public LocalAnalysis(Map<Node, Entry> entries)
    {
        this.entries = unmodifiableMap(entries);
    }

    public Entry get(Node node)
    {
        return requireNonNull(entries.get(node));
    }

    public static LocalAnalysis analyze(Node root)
    {
        Map<Node, Entry> analyses = new IdentityHashMap<>();
        root.accept(new Visitor<Void, Entry>()
        {
            private Entry process(Node node, Entry analysis)
            {
                analysis = analysis.merge(new Entry(EMPTY_LOCALS, EMPTY_LOCALS));
                for (Node child : node.getChildren()) {
                    analysis = analysis.merge(child.accept(this, null));
                }
                checkState(!analyses.containsKey(node));
                analyses.put(node, analysis);
                return analysis;
            }

            @Override
            protected Entry visitNode(Node node, Void context)
            {
                return process(node, EMPTY);
            }

            @Override
            public Entry visitGetLocal(GetLocal node, Void context)
            {
                return process(node, new Entry(EMPTY_LOCALS.put(node.getIndex()), EMPTY_LOCALS));
            }

            @Override
            public Entry visitSetLocal(SetLocal node, Void context)
            {
                return process(node, new Entry(EMPTY_LOCALS, EMPTY_LOCALS.put(node.getIndex())));
            }
        }, null);
        return new LocalAnalysis(analyses);
    }
}
