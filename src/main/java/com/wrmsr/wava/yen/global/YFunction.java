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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.yen.expression.YExpression;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

@Immutable
public final class YFunction
{
    private final Optional<Name> name;
    private final Type result;
    private final List<Type> params; // function locals are
    private final List<Type> vars;   // params plus vars
    private final Optional<Name> type; // if null, it is implicit in params and result
    private final Optional<YExpression> body;

    // local names. these are optional.
    private final List<Name> localNames;
    private final Map<Name, Index> localIndices;

    @JsonCreator
    public YFunction(
            Optional<Name> name,
            Type result,
            List<Type> params,
            List<Type> vars,
            Optional<Name> type,
            Optional<YExpression> body,
            List<Name> localNames,
            Map<Name, Index> localIndices)
    {
        this.name = requireNonNull(name);
        this.result = requireNonNull(result);
        this.params = ImmutableList.copyOf(params);
        this.vars = ImmutableList.copyOf(vars);
        this.type = requireNonNull(type);
        this.body = requireNonNull(body);
        this.localNames = ImmutableList.copyOf(localNames);
        this.localIndices = ImmutableMap.copyOf(localIndices);
    }

    public YFunction rename(Name name)
    {
        return new YFunction(
                Optional.of(name),
                result,
                params,
                vars,
                type,
                body,
                localNames,
                localIndices);
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
        YFunction function = (YFunction) o;
        return Objects.equals(name, function.name) &&
                result == function.result &&
                Objects.equals(params, function.params) &&
                Objects.equals(vars, function.vars) &&
                Objects.equals(type, function.type) &&
                Objects.equals(body, function.body) &&
                Objects.equals(localNames, function.localNames) &&
                Objects.equals(localIndices, function.localIndices);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, result, params, vars, type, body, localNames, localIndices);
    }

    public Optional<Name> getName()
    {
        return name;
    }

    public Type getResult()
    {
        return result;
    }

    public List<Type> getParams()
    {
        return params;
    }

    public List<Type> getVars()
    {
        return vars;
    }

    public Optional<Name> getType()
    {
        return type;
    }

    public Optional<YExpression> getBody()
    {
        return body;
    }

    public List<Name> getLocalNames()
    {
        return localNames;
    }

    public Map<Name, Index> getLocalIndices()
    {
        return localIndices;
    }

    public int getNumParams()
    {
        return params.size();
    }

    public int getNumVars()
    {
        return vars.size();
    }

    public int getNumLocals()
    {
        return params.size() + vars.size();
    }

    public boolean isParam(Index index)
    {
        requireNonNull(index);
        return index.get() < params.size();
    }

    public boolean isVar(Index index)
    {
        requireNonNull(index);
        return index.get() >= params.size();
    }

    public Name getLocalName(Index index)
    {
        requireNonNull(index);
        return requireNonNull(localNames.get(index.get()));
    }

    public Optional<Name> tryLocalName(Index index)
    {
        requireNonNull(index);
        if (index.get() < localNames.size() && localNames.contains(index.get())) {
            return Optional.of(localNames.get(index.get()));
        }
        // this is an unnamed local
        return Optional.empty();
    }

    public Index getLocalIndex(Name name)
    {
        requireNonNull(name);
        return localIndices.get(name);
    }

    public Index getVarIndexBase()
    {
        return Index.of(params.size());
    }

    public Type getLocalType(Index index)
    {
        requireNonNull(index);
        if (isParam(index)) {
            return params.get(index.get());
        }
        else if (isVar(index)) {
            return vars.get(index.get() - getVarIndexBase().get());
        }
        else {
            throw new UnsupportedOperationException();
        }
    }
}
