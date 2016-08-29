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
package com.wrmsr.wava.yen.global;

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.core.type.Name;

import javax.annotation.concurrent.Immutable;

import java.util.List;

@Immutable
public final class YTable
{
    private final List<Name> names;

    public YTable(List<Name> names)
    {
        this.names = ImmutableList.copyOf(names);
    }

    public YTable with(Name name)
    {
        return new YTable(ImmutableList.<Name>builder().addAll(names).add(name).build());
    }

    public YTable with(Iterable<Name> names)
    {
        return new YTable(ImmutableList.<Name>builder().addAll(this.names).addAll(names).build());
    }

    public List<Name> getNames()
    {
        return names;
    }
}
