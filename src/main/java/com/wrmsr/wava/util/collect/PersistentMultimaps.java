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

import com.google.common.collect.Multimap;
import org.organicdesign.fp.collections.ImMap;
import org.organicdesign.fp.collections.ImSet;
import org.organicdesign.fp.collections.PersistentHashMap;
import org.organicdesign.fp.collections.PersistentHashSet;

import java.util.Map;

public final class PersistentMultimaps
{
    private PersistentMultimaps()
    {
    }

    public static <K, V> ImMap<K, ImSet<V>> newPersistentHashMultimap(Multimap<K, V> multimap)
    {
        ImMap<K, ImSet<V>> ret = PersistentHashMap.empty();
        for (Map.Entry<K, V> entry : multimap.entries()) {
            ret = ret.assoc(entry.getKey(), ret.getOrElse(entry.getKey(), PersistentHashSet.empty()).put(entry.getValue()));
        }
        return ret;
    }
}
