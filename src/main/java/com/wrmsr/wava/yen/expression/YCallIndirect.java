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
import com.wrmsr.wava.yen.types.NamedFunctionType;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.yen.expression.visitor.YVisitor;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "fullType",
        "target",
        "operands",
})
@Immutable
public final class YCallIndirect
        extends YExpression
{
    private final NamedFunctionType fullType;
    private final YExpression target;
    private final List<YExpression> operands;

    @JsonCreator
    public YCallIndirect(
            @JsonProperty("fullType") NamedFunctionType fullType,
            @JsonProperty("target") YExpression target,
            @JsonProperty("operands") List<YExpression> operands)
    {
        this.fullType = requireNonNull(fullType);
        this.target = requireNonNull(target);
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
        YCallIndirect that = (YCallIndirect) o;
        return Objects.equals(fullType, that.fullType) &&
                Objects.equals(target, that.target) &&
                Objects.equals(operands, that.operands);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(fullType, target, operands);
    }

    @JsonProperty("fullType")
    public NamedFunctionType getFullType()
    {
        return fullType;
    }

    @JsonProperty("target")
    public YExpression getTarget()
    {
        return target;
    }

    @Override
    public Type getType()
    {
        return fullType.getResult();
    }

    @JsonProperty("operands")
    public List<YExpression> getOperands()
    {
        return operands;
    }

    @Override
    public List<YExpression> getChildren()
    {
        return ImmutableList.<YExpression>builder()
                .add(target)
                .addAll(operands)
                .build();
    }

    @Override
    public <C, R> R accept(YVisitor<C, R> visitor, C context)
    {
        return visitor.visitCallIndirect(this, context);
    }
}
