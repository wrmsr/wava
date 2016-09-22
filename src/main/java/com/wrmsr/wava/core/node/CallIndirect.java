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
import com.wrmsr.wava.core.type.Signature;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "signature",
        "target",
        "operands",
})
@Immutable
public final class CallIndirect
        extends Node
{
    private final Signature signature;
    private final Node target;
    private final List<Node> operands;

    @JsonCreator
    public CallIndirect(
            @JsonProperty("signature") Signature signature,
            @JsonProperty("target") Node target,
            @JsonProperty("operands") List<Node> operands)
    {
        this.signature = requireNonNull(signature);
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
        CallIndirect that = (CallIndirect) o;
        return Objects.equals(signature, that.signature) &&
                Objects.equals(target, that.target) &&
                Objects.equals(operands, that.operands);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(signature, target, operands);
    }

    @JsonProperty("signature")
    public Signature getSignature()
    {
        return signature;
    }

    @JsonProperty("target")
    public Node getTarget()
    {
        return target;
    }

    @JsonProperty("operands")
    public List<Node> getOperands()
    {
        return operands;
    }

    @Override
    public List<Node> getChildren()
    {
        return ImmutableList.<Node>builder()
                .add(target)
                .addAll(operands)
                .build();
    }

    @Override
    public <C, R> R accept(Visitor<C, R> visitor, C context)
    {
        return visitor.visitCallIndirect(this, context);
    }
}
