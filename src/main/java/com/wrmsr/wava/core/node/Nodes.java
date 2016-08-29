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

import com.wrmsr.wava.core.node.visitor.Rewriter;
import com.wrmsr.wava.core.node.visitor.Visitor;
import com.wrmsr.wava.core.op.UnaryOp;
import com.wrmsr.wava.core.type.Type;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import static com.google.common.base.Preconditions.checkState;
import static java.util.Objects.requireNonNull;

public final class Nodes
{
    private Nodes()
    {
    }

    public static <C> Node rewriteNode(Node node, Visitor<C, Node> visitor, C context)
    {
        return node.accept(new Rewriter<>(visitor), context);
    }

    public static <C> Node rewriteNode(Node node, Visitor<C, Node> visitor, Visitor<C, Node> childVisitor, C context)
    {
        return node.accept(new Rewriter<>(visitor, childVisitor), context);
    }

    @SuppressWarnings({"unchecked"})
    public static <T extends Node> T reconstructNode(Node node, Iterator<Node> children)
    {
        T ret = (T) rewriteNode(
                node,
                new Visitor<Void, Node>()
                {
                    @Override
                    protected Node visitNode(Node node, Void context)
                    {
                        return node;
                    }
                },
                new Visitor<Void, Node>()
                {
                    @Override
                    protected Node visitNode(Node node, Void context)
                    {
                        return children.next();
                    }
                },
                null);
        checkState(!children.hasNext());
        return ret;
    }

    public static Node nodify(List<Node> contents)
    {
        if (contents.isEmpty()) {
            return new Nop();
        }
        else if (contents.size() == 1) {
            return contents.get(0);
        }
        else {
            return new Block(contents);
        }
    }

    public static Optional<Node> noptional(Node node)
    {
        requireNonNull(node);
        if (node instanceof Nop) {
            return Optional.empty();
        }
        else {
            return Optional.of(node);
        }
    }

    public static Node packI64(Node value, Type type)
    {
        switch (type) {
            case I64:
                return value;
            case I32:
                return new Unary(
                        UnaryOp.ExtendUInt32,
                        Type.I64,
                        value);
            case F32:
                return new Unary(
                        UnaryOp.ExtendUInt32,
                        Type.I64,
                        new Unary(
                                UnaryOp.ReinterpretFloat,
                                Type.I32,
                                value));
            case F64:
                return new Unary(
                        UnaryOp.ReinterpretFloat,
                        Type.I64,
                        value);
            default:
                throw new IllegalArgumentException();
        }
    }

    public static Node unpackI64(Node value, Type type)
    {
        switch (type) {
            case I64:
                return value;
            case I32:
                return new Unary(
                        UnaryOp.WrapInt64,
                        Type.I32,
                        value);
            case F32:
                return new Unary(
                        UnaryOp.ReinterpretInt,
                        Type.F32,
                        new Unary(
                                UnaryOp.WrapInt64,
                                Type.I32,
                                value));
            case F64:
                return new Unary(
                        UnaryOp.ReinterpretInt,
                        Type.F64,
                        value);
            default:
                throw new IllegalArgumentException();
        }
    }
}
