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
import com.wrmsr.wava.clang.api.CxString;
import com.wrmsr.wava.clang.api.CxType;

import static com.kenai.jffi.Array.newArray;
import static com.kenai.jffi.Struct.newStruct;

final class JffiCxType
        extends JffiStruct
        implements CxType
{
    static final Descriptor<JffiCxType> DESCRIPTOR = new Descriptor<>(
            JffiCxType.class,
            JffiCxType::new,
            newStruct(
                    Type.UINT32,
                    newArray(Type.POINTER, 2)));

    JffiCxType(JffiCxRuntime runtime, byte[] struct)
    {
        super(runtime, struct);
    }

    @Override
    public String getSpelling()
    {
        return CxString.unwrap(runtime.getLibClang().clang_getTypeSpelling(this));
    }
}
