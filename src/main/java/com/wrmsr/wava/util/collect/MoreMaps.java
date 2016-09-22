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

import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static com.google.common.base.Preconditions.checkState;
import static java.util.Collections.unmodifiableMap;

public final class MoreMaps
{
    private MoreMaps()
    {
    }

    public static <T> Map<T, Integer> indexMap(Iterator<T> it)
    {
        int size = 0;
        ImmutableMap.Builder<T, Integer> builder = ImmutableMap.builder();
        while (it.hasNext()) {
            T item = it.next();
            builder.put(item, size++);
        }
        return builder.build();
    }

    public static <T> Map<T, Integer> indexMap(Iterable<T> it)
    {
        return indexMap(it.iterator());
    }

    public static <T> Map<T, Integer> indexIdentityMap(Iterator<T> it)
    {
        int size = 0;
        Map<T, Integer> map = new IdentityHashMap<>();
        while (it.hasNext()) {
            T item = it.next();
            checkState(!map.containsKey(item));
            map.put(item, size++);
        }
        return unmodifiableMap(map);
    }

    public static <T> Map<T, Integer> indexIdentityMap(Iterable<T> it)
    {
        return indexIdentityMap(it.iterator());
    }

    public static <K, V> Map<V, Set<K>> invertHashMapHashSet(Map<K, Set<V>> map)
    {
        Map<V, Set<K>> ret = new HashMap<>();
        map.forEach((k, set) -> set.forEach(v -> {
            Set<K> o = ret.get(v);
            if (o == null) {
                ret.put(v, o = new HashSet<>());
            }
            o.add(k);
        }));
        return ret;
    }
}
