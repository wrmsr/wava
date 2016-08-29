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
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.yen.expression.visitor.YVisitor;
import com.wrmsr.wava.core.op.UnaryOp;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "op",
        "value",
        "type",
})
@Immutable
public final class YUnary
        extends YExpression
{
    private final UnaryOp op;
    private final YExpression value;
    private final Type type;

    @JsonCreator
    public YUnary(
            @JsonProperty("op") UnaryOp op,
            @JsonProperty("value") YExpression value,
            @JsonProperty("type") Type type)
    {
        this.op = requireNonNull(op);
        this.value = requireNonNull(value);
        this.type = requireNonNull(type);
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
        YUnary YUnary = (YUnary) o;
        return op == YUnary.op &&
                Objects.equals(value, YUnary.value) &&
                type == YUnary.type;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(op, value, type);
    }

    @JsonProperty("op")
    public UnaryOp getOp()
    {
        return op;
    }

    @JsonProperty("value")
    public YExpression getValue()
    {
        return value;
    }

    @Override
    @JsonProperty("type")
    public Type getType()
    {
        return type;
    }

    public boolean isRelational()
    {
        return op == UnaryOp.EqZ;
    }

    @Override
    public List<YExpression> getChildren()
    {
        return ImmutableList.of(value);
    }

    @Override
    public <C, R> R accept(YVisitor<C, R> visitor, C context)
    {
        return visitor.visitUnary(this, context);
    }
}
