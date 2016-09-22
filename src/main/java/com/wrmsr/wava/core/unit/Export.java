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
package com.wrmsr.wava.core.unit;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.wrmsr.wava.core.type.Name;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "name",
        "functionName",
})
@Immutable
public final class Export
{
    private final Name name;
    private final Name functionName;

    @JsonCreator
    public Export(
            @JsonProperty("name") Name name,
            @JsonProperty("functionName") Name functionName)
    {
        this.name = requireNonNull(name);
        this.functionName = requireNonNull(functionName);
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
        Export export = (Export) o;
        return Objects.equals(name, export.name) &&
                Objects.equals(functionName, export.functionName);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, functionName);
    }

    @JsonProperty("name")
    public Name getName()
    {
        return name;
    }

    @JsonProperty("functionName")
    public Name getFunctionName()
    {
        return functionName;
    }
}
