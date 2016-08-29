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
package com.wrmsr.wava.yen.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

@Immutable
public final class NamedFunctionType
{
    private final Optional<Name> name;
    private final Type result;
    private final List<Type> params;

    public NamedFunctionType(
            @JsonProperty("name") Optional<Name> name,
            @JsonProperty("result") Type result,
            @JsonProperty("params") List<Type> params)
    {
        this.name = requireNonNull(name);
        this.result = requireNonNull(result);
        this.params = ImmutableList.copyOf(params);
    }

    @JsonProperty("name")
    public Optional<Name> getName()
    {
        return name;
    }

    @JsonProperty("result")
    public Type getResult()
    {
        return result;
    }

    @JsonProperty("params")
    public List<Type> getParams()
    {
        return params;
    }

    public NamedFunctionType rename(Name name)
    {
        return new NamedFunctionType(Optional.of(name), result, params);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NamedFunctionType that = (NamedFunctionType) o;
        return Objects.equals(name, that.name) &&
                result == that.result &&
                Objects.equals(params, that.params);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, result, params);
    }
}
