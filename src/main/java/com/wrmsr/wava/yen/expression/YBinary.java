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
import com.wrmsr.wava.core.op.BinaryOp;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.yen.expression.visitor.YVisitor;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "op",
        "left",
        "right",
})
@Immutable
public final class YBinary
        extends YExpression
{
    private final BinaryOp op;
    private final YExpression left;
    private final YExpression right;

    @JsonCreator
    public YBinary(
            @JsonProperty("op") BinaryOp op,
            @JsonProperty("left") YExpression left,
            @JsonProperty("right") YExpression right)
    {
        this.op = requireNonNull(op);
        this.left = requireNonNull(left);
        this.right = requireNonNull(right);
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
        YBinary binary = (YBinary) o;
        return op == binary.op &&
                Objects.equals(left, binary.left) &&
                Objects.equals(right, binary.right);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(op, left, right);
    }

    @JsonProperty("op")
    public BinaryOp getOp()
    {
        return op;
    }

    @JsonProperty("left")
    public YExpression getLeft()
    {
        return left;
    }

    @JsonProperty("right")
    public YExpression getRight()
    {
        return right;
    }

    public boolean isRelational()
    {
        return op.isBoolean();
    }

    @Override
    public Type getType()
    {
        if (isRelational()) {
            return Type.I32;
        }
        else {
            // assert(left->type != unreachable && right->type != unreachable ? left->type == right->type : true);
            return Type.getReachable(left.getType(), right.getType());
        }
    }

    @Override
    public List<YExpression> getChildren()
    {
        return ImmutableList.of(left, right);
    }

    @Override
    public <C, R> R accept(YVisitor<C, R> visitor, C context)
    {
        return visitor.visitBinary(this, context);
    }
}
