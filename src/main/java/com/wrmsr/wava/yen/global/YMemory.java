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
import java.util.Optional;

import static java.util.Objects.requireNonNull;

@Immutable
public final class YMemory
{
    public static final int kPageSize = 64 * 1024;
    public static final int kPageMask = ~(kPageSize - 1);

    private final int initial;
    private final int max; // sizes are in pages
    private final List<Segment> segments;
    private final Optional<Name> exportName;

    public YMemory(int initial, int max, List<Segment> segments, Optional<Name> exportName)
    {
        this.initial = initial;
        this.max = max;
        this.segments = ImmutableList.copyOf(segments);
        this.exportName = requireNonNull(exportName);
    }

    public YMemory withExportName(Name exportName)
    {
        return new YMemory(initial, max, segments, Optional.of(exportName));
    }

    public YMemory withSegment(Segment segment)
    {
        return new YMemory(initial, max, ImmutableList.<Segment>builder().addAll(segments).add(segment).build(), exportName);
    }

    public static int getkPageSize()
    {
        return kPageSize;
    }

    public static int getkPageMask()
    {
        return kPageMask;
    }

    public int getInitial()
    {
        return initial;
    }

    public int getMax()
    {
        return max;
    }

    public List<Segment> getSegments()
    {
        return segments;
    }

    public Optional<Name> getExportName()
    {
        return exportName;
    }

    public static final class Segment
    {
        private final int offset;
        private final byte[] data;
        private final int size;

        public Segment(int offset, byte[] data, int size)
        {
            this.offset = offset;
            this.data = requireNonNull(data);
            this.size = size;
        }

        public int getOffset()
        {
            return offset;
        }

        public byte[] getData()
        {
            return data;
        }

        public int getSize()
        {
            return size;
        }
    }
}
