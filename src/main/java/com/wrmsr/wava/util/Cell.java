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

import java.util.function.Consumer;
import java.util.function.Supplier;

public interface Cell<T>
{
    T get();

    void set(T value);

    default Supplier<T> toSupplier()
    {
        return this::get;
    }

    default Consumer<T> toConsumer()
    {
        return this::set;
    }

    static <T> Cell<T> of(T value)
    {
        return new Impl<>(value);
    }

    final class Impl<T>
            implements Cell<T>
    {
        private T value;

        public Impl(T value)
        {
            this.value = value;
        }

        @Override
        public final T get()
        {
            return value;
        }

        @Override
        public final void set(T value)
        {
            this.value = value;
        }

        @Override
        public final int hashCode()
        {
            return value != null ? value.hashCode() : 0;
        }

        @Override
        public String toString()
        {
            return getClass().getSimpleName() + "{value=" + value + '}';
        }
    }
}
