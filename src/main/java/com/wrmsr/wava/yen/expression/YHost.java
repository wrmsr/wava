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
import com.wrmsr.wava.core.op.HostOp;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.yen.expression.visitor.YVisitor;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "op",
        "nameOperand",
        "operands",
})
@Immutable
public final class YHost
        extends YExpression
{
    private final HostOp op;
    private final Optional<Name> nameOperand;
    private final List<YExpression> operands;

    @JsonCreator
    public YHost(
            @JsonProperty("op") HostOp op,
            @JsonProperty("nameOperand") Optional<Name> nameOperand,
            @JsonProperty("operands") List<YExpression> operands)
    {
        this.op = requireNonNull(op);
        this.nameOperand = requireNonNull(nameOperand);
        this.operands = requireNonNull(operands);
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
        YHost YHost = (YHost) o;
        return op == YHost.op &&
                Objects.equals(nameOperand, YHost.nameOperand) &&
                Objects.equals(operands, YHost.operands);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(op, nameOperand, operands);
    }

    @JsonProperty("op")
    public HostOp getOp()
    {
        return op;
    }

    @JsonProperty("nameOperand")
    public Optional<Name> getNameOperand()
    {
        return nameOperand;
    }

    @JsonProperty("operands")
    public List<YExpression> getOperands()
    {
        return operands;
    }

    @Override
    public Type getType()
    {
        switch (op) {
            case PageSize:
            case CurrentMemory:
            case HasFeature:
            case GrowMemory:
                return Type.I32;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public List<YExpression> getChildren()
    {
        return operands;
    }

    @Override
    public <C, R> R accept(YVisitor<C, R> visitor, C context)
    {
        return visitor.visitHost(this, context);
    }
}
