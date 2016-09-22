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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.core.node.visitor.Visitor;
import com.wrmsr.wava.core.op.HostOp;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Signature;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "target",
        "signature",
        "operands",
})
@Immutable
public final class Call
        extends Node
{
    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.WRAPPER_OBJECT)
    @JsonSubTypes({
            @JsonSubTypes.Type(value = DirectTarget.class, name = "direct"),
            @JsonSubTypes.Type(value = HostTarget.class, name = "host"),
            @JsonSubTypes.Type(value = ImportTarget.class, name = "import"),
    })
    public static abstract class Target
    {
    }

    @JsonPropertyOrder({
            "name",
    })
    @Immutable
    public static final class DirectTarget
            extends Target
    {
        private final Name name;

        @JsonCreator
        public DirectTarget(
                @JsonProperty("name") Name name)
        {
            this.name = requireNonNull(name);
        }

        @JsonProperty("name")
        public Name getName()
        {
            return name;
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
            DirectTarget that = (DirectTarget) o;
            return Objects.equals(name, that.name);
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(name);
        }

        @Override
        public String toString()
        {
            return MoreObjects.toStringHelper(this)
                    .add("name", name)
                    .toString();
        }
    }

    @JsonPropertyOrder({
            "op",
            "name",
    })
    @Immutable
    public static final class HostTarget
            extends Target
    {
        private final HostOp op;
        private final Optional<Name> name;

        @JsonCreator
        public HostTarget(
                @JsonProperty("op") HostOp op,
                @JsonProperty("name") Optional<Name> name)
        {
            this.op = requireNonNull(op);
            this.name = requireNonNull(name);
        }

        @JsonProperty("op")
        public HostOp getOp()
        {
            return op;
        }

        @JsonProperty("name")
        public Optional<Name> getName()
        {
            return name;
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
            HostTarget that = (HostTarget) o;
            return op == that.op &&
                    Objects.equals(name, that.name);
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(op, name);
        }

        @Override
        public String toString()
        {
            return MoreObjects.toStringHelper(this)
                    .add("op", op)
                    .add("name", name)
                    .toString();
        }
    }

    @JsonPropertyOrder({
            "name",
    })
    @Immutable
    public static final class ImportTarget
            extends Target
    {
        private final Name name;

        @JsonCreator
        public ImportTarget(
                @JsonProperty("name") Name name)
        {
            this.name = requireNonNull(name);
        }

        @JsonProperty("name")
        public Name getName()
        {
            return name;
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
            ImportTarget that = (ImportTarget) o;
            return Objects.equals(name, that.name);
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(name);
        }

        @Override
        public String toString()
        {
            return MoreObjects.toStringHelper(this)
                    .add("name", name)
                    .toString();
        }
    }

    private final Target target;
    private final Signature signature;
    private final List<Node> operands;

    @JsonCreator
    public Call(
            @JsonProperty("target") Target target,
            @JsonProperty("signature") Signature signature,
            @JsonProperty("operands") List<Node> operands)
    {
        this.target = requireNonNull(target);
        this.signature = requireNonNull(signature);
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
        Call call = (Call) o;
        return Objects.equals(target, call.target) &&
                Objects.equals(signature, call.signature) &&
                Objects.equals(operands, call.operands);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(target, signature, operands);
    }

    @JsonProperty("target")
    public Target getTarget()
    {
        return target;
    }

    @JsonProperty("signature")
    public Signature getSignature()
    {
        return signature;
    }

    @JsonProperty("operands")
    public List<Node> getOperands()
    {
        return operands;
    }

    @Override
    public List<Node> getChildren()
    {
        return operands;
    }

    @Override
    public <C, R> R accept(Visitor<C, R> visitor, C context)
    {
        return visitor.visitCall(this, context);
    }
}
