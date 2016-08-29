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
package com.wrmsr.wava.yen.expression.visitor;

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

import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static java.util.Objects.requireNonNull;

public final class YRewriter<C>
        extends YVisitor<C, YExpression>
{
    private final YVisitor<C, YExpression> target;

    public YRewriter(YVisitor<C, YExpression> target)
    {
        this.target = requireNonNull(target);
    }

    @Override
    protected YExpression visitExpression(YExpression YExpression, C context)
    {
        throw new IllegalStateException();
    }

    @Override
    public YExpression visitBinary(YBinary expression, C context)
    {
        return new YBinary(
                expression.getOp(),
                expression.getLeft().accept(this, context),
                expression.getRight().accept(this, context)
        ).accept(target, context);
    }

    @Override
    public YExpression visitBlock(YBlock expression, C context)
    {
        return new YBlock(
                expression.getLabel(),
                expression.getList().stream().map(e -> e.accept(this, context)).collect(toImmutableList())
        ).accept(target, context);
    }

    @Override
    public YExpression visitBreak(YBreak expression, C context)
    {
        return new YBreak(
                expression.getTarget(),
                expression.getValue().map(e -> e.accept(this, context)),
                expression.getCondition().map(e -> e.accept(this, context))
        ).accept(target, context);
    }

    @Override
    public YExpression visitCallDirect(YCallDirect expression, C context)
    {
        return new YCallDirect(
                expression.getTarget(),
                expression.getType(),
                expression.getOperands().stream().map(e -> e.accept(this, context)).collect(toImmutableList())
        ).accept(target, context);
    }

    @Override
    public YExpression visitCallImport(YCallImport expression, C context)
    {
        return new YCallImport(
                expression.getTarget(),
                expression.getType(),
                expression.getOperands().stream().map(e -> e.accept(this, context)).collect(toImmutableList())
        ).accept(target, context);
    }

    @Override
    public YExpression visitCallIndirect(YCallIndirect expression, C context)
    {
        return new YCallIndirect(
                expression.getFullType(),
                expression.getTarget(),
                expression.getOperands().stream().map(e -> e.accept(this, context)).collect(toImmutableList())
        ).accept(target, context);
    }

    @Override
    public YExpression visitConst(YConst expression, C context)
    {
        return expression.accept(target, context);
    }

    @Override
    public YExpression visitHost(YHost expression, C context)
    {
        return new YHost(
                expression.getOp(),
                expression.getNameOperand(),
                expression.getOperands().stream().map(e -> e.accept(this, context)).collect(toImmutableList())
        ).accept(target, context);
    }

    @Override
    public YExpression visitGetLocal(YGetLocal expression, C context)
    {
        return expression.accept(target, context);
    }

    @Override
    public YExpression visitIf(YIf expression, C context)
    {
        return new YIf(
                expression.getCondition().accept(this, context),
                expression.getIfTrue().accept(this, context),
                expression.getIfFalse().map(e -> e.accept(this, context))
        ).accept(target, context);
    }

    @Override
    public YExpression visitLoad(YLoad expression, C context)
    {
        return new YLoad(
                expression.getType(),
                expression.getBytes(),
                expression.isSigned(),
                expression.getOffset(),
                expression.getAlign(),
                expression.getPtr().accept(this, context)
        ).accept(target, context);
    }

    @Override
    public YExpression visitLoop(YLoop expression, C context)
    {
        return new YLoop(
                expression.getOut(),
                expression.getIn(),
                expression.getBody().accept(this, context)
        ).accept(target, context);
    }

    @Override
    public YExpression visitNop(YNop expression, C context)
    {
        return expression.accept(target, context);
    }

    @Override
    public YExpression visitReturn(YReturn expression, C context)
    {
        return new YReturn(
                expression.getValue().map(e -> e.accept(this, context))
        ).accept(target, context);
    }

    @Override
    public YExpression visitSelect(YSelect expression, C context)
    {
        return new YSelect(
                expression.getIfTrue().accept(this, context),
                expression.getIfFalse().accept(this, context),
                expression.getCondition().accept(this, context)
        ).accept(target, context);
    }

    @Override
    public YExpression visitSetLocal(YSetLocal expression, C context)
    {
        return new YSetLocal(
                expression.getIndex(),
                expression.getValue().accept(this, context),
                expression.getType()
        ).accept(target, context);
    }

    @Override
    public YExpression visitStore(YStore expression, C context)
    {
        return new YStore(
                expression.getType(),
                expression.getBytes(),
                expression.getOffset(),
                expression.getAlign(),
                expression.getPtr().accept(this, context),
                expression.getValue().accept(this, context)
        ).accept(target, context);
    }

    @Override
    public YExpression visitSwitch(YSwitch expression, C context)
    {
        return new YSwitch(
                expression.getTargets(),
                expression.getDefaultName(),
                expression.getCondition().accept(this, context),
                expression.getValue().map(e -> e.accept(this, context))
        ).accept(target, context);
    }

    @Override
    public YExpression visitUnary(YUnary expression, C context)
    {
        return new YUnary(
                expression.getOp(),
                expression.getValue().accept(this, context),
                expression.getType()
        ).accept(target, context);
    }

    @Override
    public YExpression visitUnreachable(YUnreachable expression, C context)
    {
        return expression.accept(target, context);
    }

    public static <C> YExpression rewrite(YExpression root, YVisitor<C, YExpression> visitor, C context)
    {
        return root.accept(new YRewriter<>(visitor), context);
    }
}
