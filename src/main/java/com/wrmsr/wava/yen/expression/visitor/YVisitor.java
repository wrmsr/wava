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

public abstract class YVisitor<C, R>
{
    protected R visitExpression(YExpression YExpression, C context)
    {
        return null;
    }

    public R visitBinary(YBinary expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitBlock(YBlock expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitBreak(YBreak expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitCallDirect(YCallDirect expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitCallImport(YCallImport expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitCallIndirect(YCallIndirect expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitConst(YConst expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitHost(YHost expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitGetLocal(YGetLocal expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitIf(YIf expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitLoad(YLoad expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitLoop(YLoop expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitNop(YNop expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitReturn(YReturn expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitSelect(YSelect expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitSetLocal(YSetLocal expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitStore(YStore expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitSwitch(YSwitch expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitUnary(YUnary expression, C context)
    {
        return visitExpression(expression, context);
    }

    public R visitUnreachable(YUnreachable expression, C context)
    {
        return visitExpression(expression, context);
    }
}
