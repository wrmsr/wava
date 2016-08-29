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
package com.wrmsr.wava.util;

import com.google.common.base.MoreObjects;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static java.util.Objects.requireNonNull;
import static java.util.function.Function.identity;

// TODO: https://stackoverflow.com/questions/25408350/is-there-a-good-way-to-extract-chunks-of-data-from-a-java-8-stream
public final class Itertools
{
    private Itertools()
    {
    }

    public static IntStream count()
    {
        return count(0);
    }

    public static IntStream count(int first)
    {
        return count(first, 1);
    }

    public static IntStream count(int first, int step)
    {
        return IntStream.iterate(first, i -> i + step);
    }

    public static <L, R> Iterator<Pair<L, R>> zip(Iterator<L> left, Iterator<R> right)
    {
        return new Iterator<Pair<L, R>>()
        {
            @Override
            public boolean hasNext()
            {
                return left.hasNext() && right.hasNext();
            }

            @Override
            public Pair<L, R> next()
            {
                return ImmutablePair.of(left.next(), right.next());
            }
        };
    }

    public static <L, R> Spliterator<Pair<L, R>> zip(Spliterator<L> left, Spliterator<R> right)
    {
        return Spliterators.spliteratorUnknownSize(zip(Spliterators.iterator(left), Spliterators.iterator(right)), 0);
    }

    public static final class EnumeratedElement<T>
            implements Comparable<EnumeratedElement<T>>
    {
        private final int index;
        private final T item;

        public EnumeratedElement(int index, T item)
        {
            this.index = index;
            this.item = requireNonNull(item);
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
            EnumeratedElement<?> that = (EnumeratedElement<?>) o;
            return index == that.index &&
                    Objects.equals(item, that.item);
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(index, item);
        }

        @Override
        public String toString()
        {
            return MoreObjects.toStringHelper(this)
                    .add("index", index)
                    .add("item", item)
                    .toString();
        }

        public int getIndex()
        {
            return index;
        }

        public T getItem()
        {
            return item;
        }

        @Override
        @SuppressWarnings({"unchecked"})
        public int compareTo(EnumeratedElement<T> o)
        {
            int ret = Integer.compare(index, o.index);
            if (ret != 0) {
                return ret;
            }
            return ((Comparable) item).compareTo(o.item);
        }
    }

    public static <T> Iterator<EnumeratedElement<T>> enumerate(Iterator<T> iterator)
    {
        return new Iterator<EnumeratedElement<T>>()
        {
            private int index = 0;

            @Override
            public boolean hasNext()
            {
                return iterator.hasNext();
            }

            @Override
            public EnumeratedElement<T> next()
            {
                return new EnumeratedElement<>(index++, iterator.next());
            }
        };
    }

    public static <T> Iterable<EnumeratedElement<T>> enumerate(Iterable<T> iterable)
    {
        return new Iterable<EnumeratedElement<T>>()
        {
            @Override
            public Iterator<EnumeratedElement<T>> iterator()
            {
                return enumerate(iterable.iterator());
            }
        };
    }

    public static <T> Spliterator<EnumeratedElement<T>> enumerate(Spliterator<T> spliterator)
    {
        int characteristics = spliterator.characteristics() | Spliterator.NONNULL & ~Spliterator.CONCURRENT;
        return Spliterators.spliterator(enumerate(Spliterators.iterator(spliterator)), spliterator.estimateSize(), characteristics);
    }

    public static <T> Stream<EnumeratedElement<T>> enumerate(Stream<T> stream)
    {
        return StreamSupport.stream(enumerate(stream.spliterator()), false);
    }

    public static <T extends Comparable<S>, S> int compareIterators(Iterator<T> a, Iterator<S> b)
    {
        while (a.hasNext() && b.hasNext()) {
            int comparison = a.next().compareTo(b.next());
            if (comparison != 0) {
                return comparison;
            }
        }
        if (a.hasNext()) {
            return 1;
        }
        if (b.hasNext()) {
            return -1;
        }
        return 0;
    }

    public static Collector<Character, StringBuilder, String> collectString()
    {
        return Collector.<Character, StringBuilder, String>of(
                StringBuilder::new,
                StringBuilder::append,
                (left, right) -> {
                    left.append(right.toString());
                    return left;
                },
                StringBuilder::toString);
    }

    public static <T> Iterator<T> lazyIterator(Supplier<? extends T> supplier)
    {
        return new Iterator<T>()
        {
            private boolean done;

            @Override
            public boolean hasNext()
            {
                return !done;
            }

            @Override
            public T next()
            {
                if (done) {
                    throw new IllegalStateException();
                }
                done = true;
                return supplier.get();
            }
        };
    }

    public static <T> Stream<T> lazyStream(Supplier<? extends T> supplier)
    {
        return StreamSupport.stream(Spliterators.spliterator(lazyIterator(supplier), 1, Spliterator.SIZED), false);
    }

    public static <T> Stream<T> flatten(Stream<Stream<T>> stream)
    {
        return stream.flatMap(identity());
    }
}
