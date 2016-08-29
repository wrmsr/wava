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
import com.wrmsr.wava.core.literal.Literal;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.yen.expression.visitor.YVisitor;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "value",
})
@Immutable
public final class YConst
        extends YExpression
{
    private final Literal value;

    @JsonCreator
    public YConst(
            @JsonProperty("value") Literal value)
    {
        this.value = requireNonNull(value);
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
        YConst aYConst = (YConst) o;
        return Objects.equals(value, aYConst.value);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(value);
    }

    @JsonProperty("value")
    public Literal getValue()
    {
        return value;
    }

    @Override
    public Type getType()
    {
        return value.getType();
    }

    @Override
    public <C, R> R accept(YVisitor<C, R> visitor, C context)
    {
        return visitor.visitConst(this, context);
    }
}
