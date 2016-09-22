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

import com.google.common.base.Throwables;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public final class Exceptions
{
    private Exceptions()
    {
    }

    public static <T> T fail(RuntimeException exception)
    {
        throw exception;
    }

    public static <T> T fail(Exception exception)
    {
        throw Throwables.propagate(exception);
    }

    public static <T> T illegalState()
    {
        throw new IllegalStateException();
    }

    @FunctionalInterface
    public interface ThrowingConsumer<T>
    {
        void accept(T t)
                throws Exception;
    }

    public static <T> Consumer<T> propagatingConsumer(ThrowingConsumer<T> target)
    {
        return t -> {
            try {
                target.accept(t);
            }
            catch (Exception e) {
                throw Throwables.propagate(e);
            }
        };
    }

    @FunctionalInterface
    public interface ThrowingRunnable
    {
        void run()
                throws Exception;
    }

    public static Runnable propagatingRunnable(ThrowingRunnable target)
    {
        return () -> {
            try {
                target.run();
            }
            catch (Exception e) {
                throw Throwables.propagate(e);
            }
        };
    }

    @FunctionalInterface
    public interface ThrowingSupplier<T>
    {
        T get()
                throws Exception;
    }

    public static <T> Supplier<T> propagatingSupplier(ThrowingSupplier<T> target)
    {
        return () -> {
            try {
                return target.get();
            }
            catch (Exception e) {
                throw Throwables.propagate(e);
            }
        };
    }

    @FunctionalInterface
    public interface ThrowingFunction<T, R>
    {
        R apply(T t)
                throws Exception;
    }

    public static <T, R> Function<T, R> propagatingFunction(ThrowingFunction<T, R> target)
    {
        return t -> {
            try {
                return target.apply(t);
            }
            catch (Exception e) {
                throw Throwables.propagate(e);
            }
        };
    }

    @FunctionalInterface
    public interface ThrowingBiFunction<T, U, R>
    {
        R apply(T t, U u)
                throws Exception;
    }

    public static <T, U, R> BiFunction<T, U, R> propagatingBiFunction(ThrowingBiFunction<T, U, R> target)
    {
        return (t, u) -> {
            try {
                return target.apply(t, u);
            }
            catch (Exception e) {
                throw Throwables.propagate(e);
            }
        };
    }
}
