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

import com.kenai.jffi.Type;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.function.BiFunction;

import static java.util.Objects.requireNonNull;

abstract class JffiStruct
        implements AutoCloseable
{
    static final class Descriptor<T>
    {
        final Class<T> cls;
        final BiFunction<JffiCxRuntime, byte[], T> constructor;
        final Type struct;

        public Descriptor(Class<T> cls, BiFunction<JffiCxRuntime, byte[], T> constructor, Type struct)
        {
            this.cls = requireNonNull(cls);
            this.constructor = requireNonNull(constructor);
            this.struct = requireNonNull(struct);
        }
    }

    final JffiCxRuntime runtime;
    final byte[] struct;

    JffiStruct(JffiCxRuntime runtime, byte[] struct)
    {
        this.runtime = requireNonNull(runtime);
        this.struct = requireNonNull(struct);
    }

    public ByteBuffer getByteBuffer()
    {
        return ByteBuffer.wrap(struct).order(ByteOrder.nativeOrder());
    }

    @Override
    public void close()
            throws Exception
    {
    }
}
