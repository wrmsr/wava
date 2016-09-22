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
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Signature;
import com.wrmsr.wava.core.type.Type;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.stream.IntStream;

import static com.google.common.base.Preconditions.checkArgument;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "name",
        "result",
        "argCount",
        "locals",
        "body",
})
@Immutable
public final class Function
{
    private final Name name;
    private final Type result;
    private final int argCount;
    private final Locals locals;
    private final Node body;

    @JsonCreator
    public Function(
            @JsonProperty("name") Name name,
            @JsonProperty("result") Type result,
            @JsonProperty("argCount") int argCount,
            @JsonProperty("locals") Locals locals,
            @JsonProperty("body") Node body)
    {
        checkArgument(argCount >= 0);
        checkArgument(argCount <= locals.getList().size());
        this.name = requireNonNull(name);
        this.result = requireNonNull(result);
        this.argCount = argCount;
        this.locals = requireNonNull(locals);
        this.body = requireNonNull(body);
    }

    @JsonProperty("name")
    public Name getName()
    {
        return name;
    }

    @JsonProperty("result")
    public Type getResult()
    {
        return result;
    }

    @JsonProperty("argCount")
    public int getArgCount()
    {
        return argCount;
    }

    @JsonProperty("locals")
    public Locals getLocals()
    {
        return locals;
    }

    @JsonProperty("body")
    public Node getBody()
    {
        return body;
    }

    public List<Local> getArgLocals()
    {
        return IntStream.range(0, argCount).boxed().map(i -> getLocals().getList().get(i)).collect(toImmutableList());
    }

    public List<Local> getNonArgLocals()
    {
        return IntStream.range(argCount, getLocals().getList().size()).boxed().map(i -> getLocals().getList().get(i)).collect(toImmutableList());
    }

    public Signature getSignature()
    {
        return new Signature(result, getArgLocals().stream().map(Local::getType).collect(toImmutableList()));
    }
}
