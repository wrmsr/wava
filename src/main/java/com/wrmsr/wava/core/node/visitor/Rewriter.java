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
package com.wrmsr.wava.core.node.visitor;

import com.wrmsr.wava.core.node.Binary;
import com.wrmsr.wava.core.node.Block;
import com.wrmsr.wava.core.node.Break;
import com.wrmsr.wava.core.node.BreakTable;
import com.wrmsr.wava.core.node.Call;
import com.wrmsr.wava.core.node.CallIndirect;
import com.wrmsr.wava.core.node.Const;
import com.wrmsr.wava.core.node.GetLocal;
import com.wrmsr.wava.core.node.If;
import com.wrmsr.wava.core.node.Label;
import com.wrmsr.wava.core.node.Load;
import com.wrmsr.wava.core.node.Loop;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Nop;
import com.wrmsr.wava.core.node.Return;
import com.wrmsr.wava.core.node.Select;
import com.wrmsr.wava.core.node.SetLocal;
import com.wrmsr.wava.core.node.Store;
import com.wrmsr.wava.core.node.Switch;
import com.wrmsr.wava.core.node.Unary;
import com.wrmsr.wava.core.node.Unreachable;

import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static java.util.Objects.requireNonNull;

public final class Rewriter<C>
        extends Visitor<C, Node>
{
    private final Visitor<C, Node> visitor;
    private final Visitor<C, Node> childVisitor;

    public Rewriter(
            Visitor<C, Node> visitor,
            Visitor<C, Node> childVisitor)
    {
        this.visitor = requireNonNull(visitor);
        this.childVisitor = requireNonNull(childVisitor);
    }

    public Rewriter(Visitor<C, Node> visitor)
    {
        this.visitor = requireNonNull(visitor);
        this.childVisitor = this;
    }

    @Override
    protected Node visitNode(Node node, C context)
    {
        throw new IllegalStateException();
    }

    @Override
    public Node visitBinary(Binary node, C context)
    {
        return new Binary(
                node.getOp(),
                node.getType(),
                node.getLeft().accept(childVisitor, context),
                node.getRight().accept(childVisitor, context)
        ).accept(visitor, context);
    }

    @Override
    public Node visitBlock(Block node, C context)
    {
        return new Block(
                node.getChildren().stream().map(c -> c.accept(childVisitor, context)).collect(toImmutableList())
        ).accept(visitor, context);
    }

    @Override
    public Node visitBreak(Break node, C context)
    {
        return new Break(
                node.getTarget(),
                node.getValue().accept(childVisitor, context)
        ).accept(visitor, context);
    }

    @Override
    public Node visitBreakTable(BreakTable node, C context)
    {
        return new BreakTable(
                node.getTargets(),
                node.getDefaultTarget(),
                node.getCondition().accept(childVisitor, context)
        ).accept(visitor, context);
    }

    @Override
    public Node visitCall(Call node, C context)
    {
        return new Call(
                node.getTarget(),
                node.getSignature(),
                node.getOperands().stream().map(c -> c.accept(childVisitor, context)).collect(toImmutableList())
        ).accept(visitor, context);
    }

    @Override
    public Node visitCallIndirect(CallIndirect node, C context)
    {
        return new CallIndirect(
                node.getSignature(),
                node.getTarget().accept(childVisitor, context),
                node.getOperands().stream().map(c -> c.accept(childVisitor, context)).collect(toImmutableList())
        ).accept(visitor, context);
    }

    @Override
    public Node visitConst(Const node, C context)
    {
        return node.accept(visitor, context);
    }

    @Override
    public Node visitGetLocal(GetLocal node, C context)
    {
        return node.accept(visitor, context);
    }

    @Override
    public Node visitIf(If node, C context)
    {
        return new If(
                node.getCondition().accept(childVisitor, context),
                node.getIfTrue().accept(childVisitor, context),
                node.getIfFalse().accept(childVisitor, context)
        ).accept(visitor, context);
    }

    @Override
    public Node visitLabel(Label node, C context)
    {
        return new Label(
                node.getName(),
                node.getBody().accept(childVisitor, context)
        ).accept(visitor, context);
    }

    @Override
    public Node visitLoad(Load node, C context)
    {
        return new Load(
                node.getType(),
                node.getBytes(),
                node.isSigned(),
                node.getOffset(),
                node.getAlign(),
                node.getPtr().accept(childVisitor, context)
        ).accept(visitor, context);
    }

    @Override
    public Node visitLoop(Loop node, C context)
    {
        return new Loop(
                node.getName(),
                node.getBody().accept(childVisitor, context)
        ).accept(visitor, context);
    }

    @Override
    public Node visitNop(Nop node, C context)
    {
        return node.accept(visitor, context);
    }

    @Override
    public Node visitReturn(Return node, C context)
    {
        return new Return(
                node.getValue().accept(childVisitor, context)
        ).accept(visitor, context);
    }

    @Override
    public Node visitSelect(Select node, C context)
    {
        return new Select(
                node.getIfTrue().accept(childVisitor, context),
                node.getIfFalse().accept(childVisitor, context),
                node.getCondition().accept(childVisitor, context)
        ).accept(visitor, context);
    }

    @Override
    public Node visitSetLocal(SetLocal node, C context)
    {
        return new SetLocal(
                node.getIndex(),
                node.getType(),
                node.getValue().accept(childVisitor, context)
        ).accept(visitor, context);
    }

    @Override
    public Node visitStore(Store node, C context)
    {
        return new Store(
                node.getType(),
                node.getBytes(),
                node.getOffset(),
                node.getAlign(),
                node.getPtr().accept(childVisitor, context),
                node.getValue().accept(childVisitor, context)
        ).accept(visitor, context);
    }

    @Override
    public Node visitSwitch(Switch node, C context)
    {
        return new Switch(
                node.getCondition().accept(childVisitor, context),
                node.getEntries().stream().map(entry -> new Switch.Entry(entry.getValues(), entry.getBody().accept(childVisitor, context))).collect(toImmutableList())
        ).accept(visitor, context);
    }

    @Override
    public Node visitUnary(Unary node, C context)
    {
        return new Unary(
                node.getOp(),
                node.getType(),
                node.getValue().accept(childVisitor, context)
        ).accept(visitor, context);
    }

    @Override
    public Node visitUnreachable(Unreachable node, C context)
    {
        return node.accept(visitor, context);
    }
}
