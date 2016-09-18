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

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.clang.CxCallingConv;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntSupplier;

import static java.util.Objects.requireNonNull;

final class JffiCxEnums
{
    private JffiCxEnums()
    {
    }

    static final class Descriptor<T extends Enum<T>>
    {
        final Class<T> cls;
        final Function<Integer, T> lookup;

        public Descriptor(Class<T> cls, Function<Integer, T> lookup)
        {
            this.cls = requireNonNull(cls);
            this.lookup = requireNonNull(lookup);
        }
    }

    static final List<Descriptor<?>> DESCRIPTORS = ImmutableList.builder()
            .add(
                    new Descriptor<CxCallingConv>(CxCallingConv.class, CxCallingConv.BY_VALUE::new)
            )
}
