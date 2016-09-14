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
package com.wrmsr.wava.java.lang;

import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;

import javax.annotation.concurrent.Immutable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static com.google.common.base.Preconditions.checkArgument;
import static com.wrmsr.wava.util.Itertools.compareIterators;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static java.util.Objects.requireNonNull;

@Immutable
public final class JQualifiedName
        implements Iterable<JName>, Comparable<JQualifiedName>
{
    private final List<JName> parts;

    public JQualifiedName(List<JName> parts)
    {
        requireNonNull(parts);
        checkArgument(!parts.isEmpty());
        this.parts = ImmutableList.copyOf(parts);
    }

    public static JQualifiedName of(String name)
    {
        return new JQualifiedName(ImmutableList.of(JName.of(name)));
    }

    public static JQualifiedName of(Object... parts)
    {
        return new JQualifiedName(Arrays.stream(parts).flatMap(o -> {
            if (o instanceof JQualifiedName) {
                return ((JQualifiedName) o).getParts().stream();
            }
            else if (o instanceof JName) {
                return Stream.of((JName) o);
            }
            else if (o instanceof String) {
                return Stream.of(JName.of((String) o));
            }
            else {
                throw new IllegalArgumentException();
            }
        }).collect(toImmutableList()));
    }

    public static JQualifiedName parse(String str)
    {
        return new JQualifiedName(Splitter.on('.').splitToList(str).stream().map(JName::of).collect(toImmutableList()));
    }

    public List<JName> getParts()
    {
        return parts;
    }

    @Override
    public Iterator<JName> iterator()
    {
        return parts.iterator();
    }

    public int size()
    {
        return parts.size();
    }

    public JName get(int index)
    {
        return parts.get(index);
    }

    @Override
    public int compareTo(JQualifiedName o)
    {
        return compareIterators(parts.iterator(), o.getParts().iterator());
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
        JQualifiedName that = (JQualifiedName) o;
        return Objects.equals(parts, that.parts);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(parts);
    }

    @Override
    public String toString()
    {
        return MoreObjects.toStringHelper(this)
                .add("parts", parts)
                .toString();
    }

    public String join()
    {
        return Joiner.on('.').join(parts.stream().map(JName::get).collect(toImmutableList()));
    }

    public boolean startsWith(JQualifiedName prefix)
    {
        if (size() < prefix.size()) {
            return false;
        }
        for (int i = 0; i < prefix.size(); ++i) {
            if (!parts.get(i).equals(prefix.get(i))) {
                return false;
            }
        }
        return true;
    }
}
