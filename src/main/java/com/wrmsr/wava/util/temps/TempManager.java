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
package com.wrmsr.wava.util.temps;

import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.util.NameGenerator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.IntStream;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableMap;
import static java.util.Collections.unmodifiableMap;
import static java.util.Objects.requireNonNull;

public final class TempManager
{
    private final Map<Name, Temp> temps = new LinkedHashMap<>();
    private final Map<Index, Temp> tempsByIndex = new HashMap<>();
    private final Map<Type, SortedSet<Name>> freeTemps = Arrays.stream(Type.values()).filter(Type::isConcrete).collect(toImmutableMap(t -> t, t -> new TreeSet<Name>()));

    private final NameGenerator nameGenerator;
    private final Index baseTempIndex;
    private final boolean allowReuse;

    private int generation;

    public TempManager(
            NameGenerator nameGenerator,
            Index baseTempIndex,
            boolean allowReuse)
    {
        this.nameGenerator = requireNonNull(nameGenerator);
        this.baseTempIndex = requireNonNull(baseTempIndex);
        this.allowReuse = allowReuse;
    }

    public Map<Name, Temp> getTemps()
    {
        return unmodifiableMap(temps);
    }

    public Map<Index, Temp> getTempsByIndex()
    {
        return unmodifiableMap(tempsByIndex);
    }

    public int getGeneration()
    {
        return generation;
    }

    public Temp getTemp(Name name)
    {
        return temps.get(name);
    }

    public Temp allocTemp(Type type)
    {
        if (allowReuse) {
            return reuseTemp(type).orElseGet(() -> newTemp(type));
        }
        else {
            return newTemp(type);
        }
    }

    private Optional<Temp> reuseTemp(Type type)
    {
        checkArgument(freeTemps.containsKey(type));
        SortedSet<Name> set = freeTemps.get(type);
        if (!set.isEmpty()) {
            Name name = set.first();
            set.remove(name);
            generation++;
            return Optional.of(temps.get(name));
        }
        else {
            return Optional.empty();
        }
    }

    private Temp newTemp(Type type)
    {
        checkArgument(freeTemps.containsKey(type));
        Name name = nameGenerator.get();
        Index index = Index.of(baseTempIndex.get() + temps.size());
        Temp temp = new Temp(name, type, index);
        temps.put(name, temp);
        tempsByIndex.put(index, temp);
        generation++;
        return temp;
    }

    public Temp freeTemp(Name name)
    {
        return freeTemp(requireNonNull(temps.get(name)));
    }

    public Temp freeTemp(Temp temp)
    {
        Set<Name> set = requireNonNull(freeTemps.get(temp.getType()));
        checkState(!set.contains(temp.getName()));
        set.add(temp.getName());
        generation++;
        return temp;
    }

    public List<Temp> getTempList()
    {
        List<Temp> tempList = temps.values().stream().collect(toImmutableList());
        checkState(IntStream.range(0, tempList.size()).allMatch(i -> tempList.get(i).getIndex().get() == i + baseTempIndex.get()));
        return tempList;
    }
}
