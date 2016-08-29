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

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.core.type.Name;

import javax.annotation.concurrent.Immutable;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Immutable
public final class Table
    implements Iterable<Name>
{
    private final List<Name> names;

    public Table(List<Name> names)
    {
        this.names = ImmutableList.copyOf(names);
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
        Table table = (Table) o;
        return Objects.equals(names, table.names);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(names);
    }

    public List<Name> getNames()
    {
        return names;
    }

    @Override
    public Iterator<Name> iterator()
    {
        return names.iterator();
    }

    public int size()
    {
        return names.size();
    }

    public Name get(int i)
    {
        return names.get(i);
    }
}
