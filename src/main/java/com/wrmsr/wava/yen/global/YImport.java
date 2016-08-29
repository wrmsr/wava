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
import com.wrmsr.wava.yen.types.NamedFunctionType;

import javax.annotation.concurrent.Immutable;

import java.util.Optional;

import static java.util.Objects.requireNonNull;

@Immutable
public final class YImport
{
    private final Optional<Name> name;
    private final Name module;
    private final Name base; // name = module.base
    private final NamedFunctionType type;

    public YImport(Optional<Name> name, Name module, Name base, NamedFunctionType type)
    {
        this.name = requireNonNull(name);
        this.module = requireNonNull(module);
        this.base = requireNonNull(base);
        this.type = requireNonNull(type);
    }

    public YImport rename(Name name)
    {
        return new YImport(Optional.of(name), module, base, type);
    }

    public Optional<Name> getName()
    {
        return name;
    }

    public Name getModule()
    {
        return module;
    }

    public Name getBase()
    {
        return base;
    }

    public NamedFunctionType getType()
    {
        return type;
    }
}
