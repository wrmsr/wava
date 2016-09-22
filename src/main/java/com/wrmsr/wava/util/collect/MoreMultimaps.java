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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import org.apache.commons.lang3.tuple.ImmutablePair;

import javax.annotation.Nullable;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;

import static com.google.common.base.Preconditions.checkState;

public final class MoreMultimaps
{
    private MoreMultimaps()
    {
    }

    public static <K, V> Multimap<K, V> unmodifiableMultimapView(Map<K, Collection<V>> collectionMap)
    {
        // checkArgument(collectionMap.values().stream().allMatch(coll -> !coll.isEmpty()));
        return new Multimap<K, V>()
        {
            private OptionalInt size = OptionalInt.empty();

            private int cachedSize()
            {
                if (!size.isPresent()) {
                    size = OptionalInt.of(collectionMap.values().stream().mapToInt(coll -> {
                        checkState(!coll.isEmpty());
                        return coll.size();
                    }).sum());
                }
                return size.getAsInt();
            }

            @Override
            public int size()
            {
                return cachedSize();
            }

            @Override
            public boolean isEmpty()
            {
                return !collectionMap.isEmpty();
            }

            @Override
            public boolean containsKey(@Nullable Object key)
            {
                return collectionMap.containsKey(key);
            }

            @Override
            public boolean containsValue(@Nullable Object value)
            {
                return collectionMap.values().stream().anyMatch(coll -> coll.contains(value));
            }

            @Override
            public boolean containsEntry(@Nullable Object key, @Nullable Object value)
            {
                return collectionMap.getOrDefault(key, ImmutableList.of()).contains(value);
            }

            @Override
            public boolean put(@Nullable K key, @Nullable V value)
            {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean remove(@Nullable Object key, @Nullable Object value)
            {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean putAll(@Nullable K key, Iterable<? extends V> values)
            {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean putAll(Multimap<? extends K, ? extends V> multimap)
            {
                throw new UnsupportedOperationException();
            }

            @Override
            public Collection<V> replaceValues(@Nullable K key, Iterable<? extends V> values)
            {
                throw new UnsupportedOperationException();
            }

            @Override
            public Collection<V> removeAll(@Nullable Object key)
            {
                throw new UnsupportedOperationException();
            }

            @Override
            public void clear()
            {
                throw new UnsupportedOperationException();
            }

            @Override
            public Collection<V> get(@Nullable K key)
            {
                return collectionMap.getOrDefault(key, ImmutableList.of());
            }

            @Override
            public Set<K> keySet()
            {
                return collectionMap.keySet();
            }

            @Override
            public Multiset<K> keys()
            {
                // FIXME
                throw new UnsupportedOperationException();
            }

            @Override
            public Collection<V> values()
            {
                return new AbstractCollection<V>()
                {
                    @Override
                    public Iterator<V> iterator()
                    {
                        return Iterators.concat(collectionMap.values().stream().map(Iterable::iterator).iterator());
                    }

                    @Override
                    public int size()
                    {
                        return cachedSize();
                    }
                };
            }

            @Override
            public Collection<Map.Entry<K, V>> entries()
            {
                return new AbstractCollection<Map.Entry<K, V>>()
                {
                    @Override
                    public Iterator<Map.Entry<K, V>> iterator()
                    {
                        return Iterators.concat(collectionMap.entrySet().stream().map(entry -> entry.getValue().stream().map(value -> ImmutablePair.of(entry.getKey(), value)).iterator()).iterator());
                    }

                    @Override
                    public int size()
                    {
                        return cachedSize();
                    }
                };
            }

            @Override
            public Map<K, Collection<V>> asMap()
            {
                return collectionMap;
            }
        };
    }
}
