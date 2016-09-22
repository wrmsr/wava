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

import org.organicdesign.fp.collections.ImSet;
import org.organicdesign.fp.collections.PersistentHashSet;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

import static java.util.Objects.requireNonNull;

public final class PersistentSets
{
    private PersistentSets()
    {
    }

    @SafeVarargs
    public static <T> ImSet<T> mergeImSets(ImSet<T> left, ImSet<T>... rights)
    {
        for (ImSet<T> right : rights) {
            for (T entry : right) {
                left = left.put(entry);
            }
        }
        return left;
    }

    public static <T> ImSet<T> newPersistentHashSet(Stream<T> entries)
    {
        ImSet<T> ret = PersistentHashSet.empty();
        for (Iterator<T> it = entries.iterator(); it.hasNext(); ) {
            ret = ret.put(it.next());
        }
        return ret;
    }

    public static final class ImSetCollector<T>
            implements Collector<T, ImSetCollector.Context<T>, ImSet<T>>
    {
        protected static final class Context<T>
        {
            private ImSet<T> map;

            public Context(ImSet<T> map)
            {
                this.map = requireNonNull(map);
            }

            public ImSet<T> getSet()
            {
                return map;
            }

            public void setSet(ImSet<T> map)
            {
                this.map = map;
            }
        }

        private final ImSet<T> unit;

        public ImSetCollector(ImSet<T> unit)
        {
            this.unit = requireNonNull(unit);
        }

        @Override
        public Supplier<Context<T>> supplier()
        {
            return () -> new Context<>(unit);
        }

        @Override
        public BiConsumer<Context<T>, T> accumulator()
        {
            return (context, entry) -> context.setSet(context.getSet().put(entry));
        }

        @Override
        public BinaryOperator<Context<T>> combiner()
        {
            return (left, right) -> new Context<>(mergeImSets(left.getSet(), right.getSet()));
        }

        @Override
        public Function<Context<T>, ImSet<T>> finisher()
        {
            return context -> context.map;
        }

        @Override
        public Set<Characteristics> characteristics()
        {
            return EnumSet.of(Characteristics.UNORDERED);
        }
    }

    public static <T> ImSetCollector<T> toPersistentHashSet()
    {
        return new ImSetCollector<>(PersistentHashSet.empty());
    }
}
