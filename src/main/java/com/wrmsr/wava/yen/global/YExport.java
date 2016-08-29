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
package com.wrmsr.wava.yen.global;

import com.wrmsr.wava.core.type.Name;

import javax.annotation.concurrent.Immutable;

import java.util.Optional;

import static java.util.Objects.requireNonNull;

@Immutable
public final class YExport
{
    private final Optional<Name> name;
    private final Name value;

    public YExport(Optional<Name> name, Name value)
    {
        this.name = requireNonNull(name);
        this.value = requireNonNull(value);
    }

    public YExport rename(Name name)
    {
        return new YExport(Optional.of(name), value);
    }

    public Optional<Name> getName()
    {
        return name;
    }

    public Name getValue()
    {
        return value;
    }
}


