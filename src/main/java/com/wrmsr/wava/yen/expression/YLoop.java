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
package com.wrmsr.wava.yen.expression;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.yen.expression.visitor.YVisitor;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "out",
        "in",
        "body",
})
@Immutable
public final class YLoop
        extends YExpression
{
    private final Name out;
    private final Name in;
    private final YExpression body;

    @JsonCreator
    public YLoop(
            @JsonProperty("out") Name out,
            @JsonProperty("in") Name in,
            @JsonProperty("body") YExpression body)
    {
        this.out = requireNonNull(out);
        this.in = requireNonNull(in);
        this.body = requireNonNull(body);
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
        YLoop YLoop = (YLoop) o;
        return Objects.equals(out, YLoop.out) &&
                Objects.equals(in, YLoop.in) &&
                Objects.equals(body, YLoop.body);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(out, in, body);
    }

    @JsonProperty("out")
    public Name getOut()
    {
        return out;
    }

    @JsonProperty("in")
    public Name getIn()
    {
        return in;
    }

    @JsonProperty("body")
    public YExpression getBody()
    {
        return body;
    }

    @Override
    public Type getType()
    {
        return body.getType();
    }

    @Override
    public List<YExpression> getChildren()
    {
        return ImmutableList.of(body);
    }

    @Override
    public <C, R> R accept(YVisitor<C, R> visitor, C context)
    {
        return visitor.visitLoop(this, context);
    }
}
