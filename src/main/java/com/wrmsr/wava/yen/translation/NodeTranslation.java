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
package com.wrmsr.wava.yen.translation;

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
import com.wrmsr.wava.core.node.Unary;
import com.wrmsr.wava.core.node.Unreachable;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Signature;
import com.wrmsr.wava.yen.expression.YBinary;
import com.wrmsr.wava.yen.expression.YBlock;
import com.wrmsr.wava.yen.expression.YBreak;
import com.wrmsr.wava.yen.expression.YCallDirect;
import com.wrmsr.wava.yen.expression.YCallImport;
import com.wrmsr.wava.yen.expression.YCallIndirect;
import com.wrmsr.wava.yen.expression.YConst;
import com.wrmsr.wava.yen.expression.YExpression;
import com.wrmsr.wava.yen.expression.YGetLocal;
import com.wrmsr.wava.yen.expression.YHost;
import com.wrmsr.wava.yen.expression.YIf;
import com.wrmsr.wava.yen.expression.YLoad;
import com.wrmsr.wava.yen.expression.YLoop;
import com.wrmsr.wava.yen.expression.YNop;
import com.wrmsr.wava.yen.expression.YReturn;
import com.wrmsr.wava.yen.expression.YSelect;
import com.wrmsr.wava.yen.expression.YSetLocal;
import com.wrmsr.wava.yen.expression.YStore;
import com.wrmsr.wava.yen.expression.YSwitch;
import com.wrmsr.wava.yen.expression.YUnary;
import com.wrmsr.wava.yen.expression.YUnreachable;
import com.wrmsr.wava.yen.expression.visitor.YVisitor;

import java.util.Map;

import static com.google.common.base.Preconditions.checkArgument;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;

public final class NodeTranslation
{
    private NodeTranslation()
    {
    }

    public static Node translateNode(YExpression root, Map<Name, Signature> functionSignatures)
    {
        return root.accept(new YVisitor<Void, Node>()
        {
            @Override
            protected Node visitExpression(YExpression YExpression, Void context)
            {
                throw new IllegalStateException();
            }

            @Override
            public Node visitBinary(YBinary expression, Void context)
            {
                return new Binary(
                        expression.getOp(),
                        expression.getType(),
                        expression.getLeft().accept(this, context),
                        expression.getRight().accept(this, context));
            }

            @Override
            public Node visitBlock(YBlock expression, Void context)
            {
                Node ret;
                if (expression.getChildren().size() == 0) {
                    ret = new Nop();
                }
                else {
                    ret = new Block(
                            expression.getChildren().stream().map(c -> c.accept(this, context)).collect(toImmutableList()));
                }
                if (expression.getLabel().isPresent()) {
                    ret = new Label(
                            expression.getLabel().get(),
                            ret);
                }
                return ret;
            }

            @Override
            public Node visitBreak(YBreak expression, Void context)
            {
                Node ret = new Break(
                        expression.getTarget(),
                        expression.getValue().orElseGet(YNop::new).accept(this, context));
                if (expression.getCondition().isPresent()) {
                    ret = new If(
                            expression.getCondition().get().accept(this, context),
                            ret,
                            new Nop());
                }
                return ret;
            }

            @Override
            public Node visitCallDirect(YCallDirect expression, Void context)
            {
                return new Call(
                        new Call.DirectTarget(
                                expression.getTarget()),
                        functionSignatures.get(expression.getTarget()),
                        expression.getOperands().stream().map(o -> o.accept(this, context)).collect(toImmutableList()));
            }

            @Override
            public Node visitCallImport(YCallImport expression, Void context)
            {
                return new Call(
                        new Call.ImportTarget(
                                expression.getTarget()),
                        functionSignatures.get(expression.getTarget()),
                        expression.getOperands().stream().map(o -> o.accept(this, context)).collect(toImmutableList()));
            }

            @Override
            public Node visitCallIndirect(YCallIndirect expression, Void context)
            {
                return new CallIndirect(
                        new Signature(
                                expression.getFullType().getResult(),
                                expression.getFullType().getParams()),
                        expression.getTarget().accept(this, context),
                        expression.getOperands().stream().map(o -> o.accept(this, context)).collect(toImmutableList()));
            }

            @Override
            public Node visitConst(YConst expression, Void context)
            {
                return new Const(
                        expression.getValue());
            }

            @Override
            public Node visitHost(YHost expression, Void context)
            {
                // TODO: variadic? pluggable?
                checkArgument(expression.getOperands().size() == expression.getOp().getSignature().getArguments().size());
                return new Call(
                        new Call.HostTarget(
                                expression.getOp(),
                                expression.getNameOperand()),
                        expression.getOp().getSignature(),
                        expression.getOperands().stream().map(o -> o.accept(this, context)).collect(toImmutableList()));
            }

            @Override
            public Node visitGetLocal(YGetLocal expression, Void context)
            {
                return new GetLocal(
                        expression.getIndex(),
                        expression.getType());
            }

            @Override
            public Node visitIf(YIf expression, Void context)
            {
                return new If(
                        expression.getCondition().accept(this, context),
                        expression.getIfTrue().accept(this, context),
                        expression.getIfFalse().orElse(new YNop()).accept(this, context));
            }

            @Override
            public Node visitLoad(YLoad expression, Void context)
            {
                return new Load(
                        expression.getType(),
                        expression.getBytes(),
                        expression.isSsigned(),
                        expression.getOffset(),
                        expression.getAlign(),
                        expression.getPtr().accept(this, context));
            }

            @Override
            public Node visitLoop(YLoop expression, Void context)
            {
                return new Label(
                        expression.getOut(),
                        new Loop(
                                expression.getIn(),
                                expression.getBody().accept(this, context)));
            }

            @Override
            public Node visitNop(YNop expression, Void context)
            {
                return new Nop();
            }

            @Override
            public Node visitReturn(YReturn expression, Void context)
            {
                return new Return(
                        expression.getValue().orElse(new YNop()).accept(this, context));
            }

            @Override
            public Node visitSelect(YSelect expression, Void context)
            {
                return new Select(
                        expression.getIfTrue().accept(this, context),
                        expression.getIfFalse().accept(this, context),
                        expression.getCondition().accept(this, context));
            }

            @Override
            public Node visitSetLocal(YSetLocal expression, Void context)
            {
                return new SetLocal(
                        expression.getIndex(),
                        expression.getType(),
                        expression.getValue().accept(this, context));
            }

            @Override
            public Node visitStore(YStore expression, Void context)
            {
                return new Store(
                        expression.getType(),
                        expression.getBytes(),
                        expression.getOffset(),
                        expression.getAlign(),
                        expression.getPtr().accept(this, context),
                        expression.getValue().accept(this, context));
            }

            @Override
            public Node visitSwitch(YSwitch expression, Void context)
            {
                checkArgument(!expression.getValue().isPresent());
                return new BreakTable(
                        expression.getTargets(),
                        expression.getDefaultName(),
                        expression.getCondition().accept(this, context));
            }

            @Override
            public Node visitUnary(YUnary expression, Void context)
            {
                return new Unary(
                        expression.getOp(),
                        expression.getType(),
                        expression.getValue().accept(this, context));
            }

            @Override
            public Node visitUnreachable(YUnreachable expression, Void context)
            {
                return new Unreachable();
            }
        }, null);
    }
}
