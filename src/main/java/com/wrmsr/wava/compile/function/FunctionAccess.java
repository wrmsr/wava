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
package com.wrmsr.wava.compile.function;

import com.wrmsr.wava.java.lang.JAccess;

import javax.annotation.concurrent.Immutable;

import java.util.Set;

import static com.google.common.collect.Sets.immutableEnumSet;

@Immutable
public final class FunctionAccess
{
    private final Set<JAccess> access;

    public FunctionAccess(Set<JAccess> access)
    {
        this.access = immutableEnumSet(access);
    }

    public Set<JAccess> getAccess()
    {
        return access;
    }
}
