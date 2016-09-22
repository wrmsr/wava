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
package com.wrmsr.wava.clang.jffi;

import com.kenai.jffi.Platform;

import java.util.function.BiFunction;

import static com.google.common.base.Preconditions.checkArgument;
import static java.util.Objects.requireNonNull;

abstract class JffiPointer
        implements AutoCloseable
{
    static final class Descriptor<T>
    {
        final Class<T> cls;
        final BiFunction<JffiCxRuntime, Long, T> constructor;

        public Descriptor(Class<T> cls, BiFunction<JffiCxRuntime, Long, T> constructor)
        {
            this.cls = requireNonNull(cls);
            this.constructor = requireNonNull(constructor);
        }
    }

    static final int SIZE = Platform.getPlatform().addressSize();
    static final long MASK = Platform.getPlatform().addressMask();

    final JffiCxRuntime runtime;
    final long address;

    JffiPointer(JffiCxRuntime runtime, long address)
    {
        this.runtime = requireNonNull(runtime);
        this.address = address & MASK;
        checkArgument(this.address != 0);
    }

    @Override
    public void close()
            throws Exception
    {
    }
}
