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

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static com.google.common.base.Preconditions.checkArgument;

public final class MoreLists
{
    private MoreLists()
    {
    }

    // https://hackage.haskell.org/package/base-4.9.0.0/docs/Data-List.html :|

    public static <T> Stream<T> listInit(List<T> list)
    {
        return list.stream().limit(list.size() - 1);
    }

    public static <T> T listLast(List<T> list)
    {
        checkArgument(!list.isEmpty());
        return list.get(list.size() - 1);
    }

    public static <T> T listHead(List<T> list)
    {
        checkArgument(!list.isEmpty());
        return list.get(0);
    }

    public static <T> Stream<T> listTail(List<T> list)
    {
        return list.stream().skip(1);
    }

    public static final class SplitStream<T>
    {
        private final List<T> matches;
        private final List<T> nonMatches;

        public SplitStream(List<T> matches, List<T> nonMatches)
        {
            this.matches = ImmutableList.copyOf(matches);
            this.nonMatches = ImmutableList.copyOf(nonMatches);
        }

        public List<T> getMatches()
        {
            return matches;
        }

        public List<T> getNonMatches()
        {
            return nonMatches;
        }
    }

    public static <T> SplitStream<T> splitStream(Stream<T> stream, Predicate<T> predicate)
    {
        ImmutableList.Builder<T> matches = ImmutableList.builder();
        ImmutableList.Builder<T> nonMatches = ImmutableList.builder();
        stream.forEach(e -> {
            if (predicate.test(e)) {
                matches.add(e);
            }
            else {
                nonMatches.add(e);
            }
        });
        return new SplitStream<>(matches.build(), nonMatches.build());
    }
}
