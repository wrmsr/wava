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
        "target",
        "type",
        "operands"
})
@Immutable
public final class YCallDirect
        extends YExpression
{
    private final Name target;
    private final Type type;
    private final List<YExpression> operands;

    @JsonCreator
    public YCallDirect(
            @JsonProperty("target") Name target,
            @JsonProperty("type") Type type,
            @JsonProperty("operands") List<YExpression> operands)
    {
        this.target = requireNonNull(target);
        this.type = requireNonNull(type);
        this.operands = ImmutableList.copyOf(operands);
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
        YCallDirect YCallDirect = (YCallDirect) o;
        return Objects.equals(target, YCallDirect.target) &&
                type == YCallDirect.type &&
                Objects.equals(operands, YCallDirect.operands);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(target, type, operands);
    }

    @JsonProperty("target")
    public Name getTarget()
    {
        return target;
    }

    @Override
    @JsonProperty("type")
    public Type getType()
    {
        return type;
    }

    @JsonProperty("operands")
    public List<YExpression> getOperands()
    {
        return operands;
    }

    @Override
    public List<YExpression> getChildren()
    {
        return operands;
    }

    @Override
    public <C, R> R accept(YVisitor<C, R> visitor, C context)
    {
        return visitor.visitCallDirect(this, context);
    }
}
