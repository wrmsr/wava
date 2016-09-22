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
import com.wrmsr.wava.clang.api.CxSourceLocation;

import static com.kenai.jffi.Array.newArray;
import static com.kenai.jffi.Struct.newStruct;

final class JffiCxSourceLocation
        extends JffiStruct
        implements CxSourceLocation
{
    static final Descriptor<JffiCxSourceLocation> DESCRIPTOR = new Descriptor<>(
            JffiCxSourceLocation.class,
            JffiCxSourceLocation::new,
            newStruct(
                    newArray(Type.POINTER, 2),
                    Type.UINT32));

    JffiCxSourceLocation(JffiCxRuntime runtime, byte[] struct)
    {
        super(runtime, struct);
    }
}
