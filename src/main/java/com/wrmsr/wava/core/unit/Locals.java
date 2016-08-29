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
package com.wrmsr.wava.core.unit;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import org.apache.commons.lang3.tuple.Pair;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

import static com.google.common.base.Preconditions.checkArgument;
import static com.wrmsr.wava.util.Itertools.enumerate;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableMap;
import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "list",
})
@Immutable
public final class Locals
{
    private final List<Local> list;
    private final Map<Name, Local> localsByName;

    @JsonCreator
    public Locals(
            @JsonProperty("list") List<Local> list)
    {
        this.list = ImmutableList.copyOf(list);
        checkArgument(enumerate(this.list.stream()).allMatch(e -> e.getItem().getIndex().get() == e.getIndex()));
        this.localsByName = list.stream().collect(toImmutableMap(Local::getName, Function.identity()));
    }

    public static Locals of(List<Pair<Name, Type>> pairs)
    {
        return new Locals(
                enumerate(pairs.stream())
                        .map(e -> new Local(e.getItem().getLeft(), Index.of(e.getIndex()), e.getItem().getRight()))
                        .collect(toImmutableList()));
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Locals locals = (Locals) o;
        return Objects.equals(list, locals.list);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(list);
    }

    @JsonProperty("list")
    public List<Local> getList()
    {
        return list;
    }

    public Map<Name, Local> getLocalsByName()
    {
        return localsByName;
    }

    public Local getLocal(Index index)
    {
        return list.get(index.get());
    }

    public Local getLocal(Name name)
    {
        return requireNonNull(localsByName.get(name));
    }
}
