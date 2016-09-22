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
package com.wrmsr.wava.core.node;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.core.node.visitor.Visitor;
import com.wrmsr.wava.core.op.BinaryOp;
import com.wrmsr.wava.core.type.Type;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "op",
        "type",
        "left",
        "right",
})
@Immutable
public final class Binary
        extends Node
{
    private final BinaryOp op;
    private final Type type;
    private final Node left;
    private final Node right;

    @JsonCreator
    public Binary(
            @JsonProperty("op") BinaryOp op,
            @JsonProperty("type") Type type,
            @JsonProperty("left") Node left,
            @JsonProperty("right") Node right)
    {
        this.op = requireNonNull(op);
        this.type = requireNonNull(type);
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
        Binary binary = (Binary) o;
        return op == binary.op &&
                type == binary.type &&
                Objects.equals(left, binary.left) &&
                Objects.equals(right, binary.right);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(op, type, left, right);
    }

    @JsonProperty("op")
    public BinaryOp getOp()
    {
        return op;
    }

    @JsonProperty("type")
    public Type getType()
    {
        return type;
    }

    @JsonProperty("left")
    public Node getLeft()
    {
        return left;
    }

    @JsonProperty("right")
    public Node getRight()
    {
        return right;
    }

    @Override
    public List<Node> getChildren()
    {
        return ImmutableList.of(left, right);
    }

    @Override
    public <C, R> R accept(Visitor<C, R> visitor, C context)
    {
        return visitor.visitBinary(this, context);
    }
}
