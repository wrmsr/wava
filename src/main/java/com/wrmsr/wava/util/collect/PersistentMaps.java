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
package com.wrmsr.wava.util.collect;

import org.organicdesign.fp.collections.ImMap;
import org.organicdesign.fp.collections.ImSet;
import org.organicdesign.fp.collections.PersistentHashMap;
import org.organicdesign.fp.collections.PersistentHashSet;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

import static com.google.common.base.Preconditions.checkState;
import static com.wrmsr.wava.util.RecursiveFunction.applyRecursive;
import static java.util.Collections.unmodifiableMap;
import static java.util.Objects.requireNonNull;

public final class PersistentMaps
{
    private PersistentMaps()
    {
    }

    public static <T> Map<T, Set<T>> invertTree(Function<T, Iterable<T>> tree, T root)
    {
        Set<T> seen = new HashSet<>();
        Map<T, Set<T>> ret = new HashMap<>();
        ret.put(root, applyRecursive((rec, node) -> {
            checkState(!seen.contains(node));
            seen.add(node);
            ImSet<T> set = PersistentHashSet.empty();
            for (T child : tree.apply(node)) {
                set = set.union(rec.apply(child));
            }
            for (T child : tree.apply(node)) {
                set = set.put(child);
            }
            ret.put(node, set);
            return set;
        }, root));
        return unmodifiableMap(ret);
    }

    @SafeVarargs
    public static <K, V> ImMap<K, V> mergeImMaps(ImMap<K, V> left, ImMap<K, V>... rights)
    {
        for (ImMap<K, V> right : rights) {
            for (Map.Entry<K, V> entry : right.entrySet()) {
                left = left.assoc(entry);
            }
        }
        return left;
    }

    public static <K, V> ImMap<K, V> newPersistentHashMap(Stream<Map.Entry<K, V>> entries)
    {
        ImMap<K, V> ret = PersistentHashMap.empty();
        for (Iterator<Map.Entry<K, V>> it = entries.iterator(); it.hasNext(); ) {
            ret = ret.assoc(it.next());
        }
        return ret;
    }

    public static final class ImMapCollector<K, V>
            implements Collector<Map.Entry<K, V>, ImMapCollector.Context<K, V>, ImMap<K, V>>
    {
        protected static final class Context<K, V>
        {
            private ImMap<K, V> map;

            public Context(ImMap<K, V> map)
            {
                this.map = requireNonNull(map);
            }

            public ImMap<K, V> getMap()
            {
                return map;
            }

            public void setMap(ImMap<K, V> map)
            {
                this.map = map;
            }
        }

        private final ImMap<K, V> unit;

        public ImMapCollector(ImMap<K, V> unit)
        {
            this.unit = requireNonNull(unit);
        }

        @Override
        public Supplier<Context<K, V>> supplier()
        {
            return () -> new Context<>(unit);
        }

        @Override
        public BiConsumer<Context<K, V>, Map.Entry<K, V>> accumulator()
        {
            return (context, entry) -> context.setMap(context.getMap().assoc(entry));
        }

        @Override
        public BinaryOperator<Context<K, V>> combiner()
        {
            return (left, right) -> new Context<>(mergeImMaps(left.getMap(), right.getMap()));
        }

        @Override
        public Function<Context<K, V>, ImMap<K, V>> finisher()
        {
            return context -> context.map;
        }

        @Override
        public Set<Characteristics> characteristics()
        {
            return EnumSet.of(Characteristics.UNORDERED);
        }
    }

    public static <K, V> ImMapCollector<K, V> toPersistentHashMap()
    {
        return new ImMapCollector<>(PersistentHashMap.empty());
    }
}
