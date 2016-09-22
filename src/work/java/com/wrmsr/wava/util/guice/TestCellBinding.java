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
package com.wrmsr.wava.util.guice;

import org.junit.Test;

public class TestCellBinding
{
//    public static <T> LinkedBindingBuilder<T> bindCellReadOnly(Binder binder, Key<T> key)
//    {
//        throw new IllegalStateException();
//    }
//    public static <T> LinkedBindingBuilder<T> bindCellReadOnly(Binder binder, Key<T> key)
//    {
//        throw new IllegalStateException();
//    }

    @FunctionalInterface
    public interface PassIn<T>
    {
        T get();
    }

    @FunctionalInterface
    public interface PassOut<T>
    {
        void set(T value);
    }

    public interface PassInOut<T>
            extends PassIn<T>, PassOut<T>
    {
    }

    @Test
    public void testCellBinding()
            throws Throwable
    {

    }
}
