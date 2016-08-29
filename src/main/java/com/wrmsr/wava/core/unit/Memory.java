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

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;
import java.util.OptionalInt;

import static com.google.common.base.Preconditions.checkArgument;

@Immutable
public final class Memory
{
    public static final int PAGE_SIZE = 64 * 1024 * 1024;

    private final int initialPages;
    private final OptionalInt maxPages;
    private final List<Segment> segments;

    public Memory(
            int initialPages,
            OptionalInt maxPages,
            List<Segment> segments)
    {
        this.initialPages = initialPages;
        this.maxPages = maxPages;
        this.segments = ImmutableList.copyOf(segments);
        checkArgument(initialPages >= 0);
        maxPages.ifPresent(mp -> checkArgument(mp >= initialPages));
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
        Memory memory = (Memory) o;
        return initialPages == memory.initialPages &&
                maxPages == memory.maxPages &&
                Objects.equals(segments, memory.segments);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(initialPages, maxPages, segments);
    }

    public int getInitialPages()
    {
        return initialPages;
    }

    public OptionalInt getMaxPages()
    {
        return maxPages;
    }

    public List<Segment> getSegments()
    {
        return segments;
    }
}
