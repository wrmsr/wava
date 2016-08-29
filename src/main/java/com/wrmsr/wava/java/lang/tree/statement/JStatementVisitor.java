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
package com.wrmsr.wava.java.lang.tree.statement;

public class JStatementVisitor<C, R>
{
    protected R visitJStatement(JStatement jstatement, C context)
    {
        return null;
    }

    public R visitJAnnotatedStatement(JAnnotatedStatement jstatement, C context)
    {
        return visitJStatement(jstatement, context);
    }

    public R visitJBlank(JBlank jstatement, C context)
    {
        return visitJStatement(jstatement, context);
    }

    public R visitJBlock(JBlock jstatement, C context)
    {
        return visitJStatement(jstatement, context);
    }

    public R visitJBreak(JBreak jstatement, C context)
    {
        return visitJStatement(jstatement, context);
    }

    public R visitJCase(JCase jstatement, C context)
    {
        return visitJStatement(jstatement, context);
    }

    public R visitJContinue(JContinue jstatement, C context)
    {
        return visitJStatement(jstatement, context);
    }

    public R visitJDoWhileLoop(JDoWhileLoop jstatement, C context)
    {
        return visitJStatement(jstatement, context);
    }

    public R visitJEmpty(JEmpty jstatement, C context)
    {
        return visitJStatement(jstatement, context);
    }

    public R visitJExpressionStatement(JExpressionStatement jstatement, C context)
    {
        return visitJStatement(jstatement, context);
    }

    public R visitJForEach(JForEach jstatement, C context)
    {
        return visitJStatement(jstatement, context);
    }

    public R visitJIf(JIf jstatement, C context)
    {
        return visitJStatement(jstatement, context);
    }

    public R visitJLabeledStatement(JLabeledStatement jstatement, C context)
    {
        return visitJStatement(jstatement, context);
    }

    public R visitJReturn(JReturn jstatement, C context)
    {
        return visitJStatement(jstatement, context);
    }

    public R visitJSwitch(JSwitch jstatement, C context)
    {
        return visitJStatement(jstatement, context);
    }

    public R visitJThrow(JThrow jstatement, C context)
    {
        return visitJStatement(jstatement, context);
    }

    public R visitJVariable(JVariable jstatement, C context)
    {
        return visitJStatement(jstatement, context);
    }

    public R visitJWhileLoop(JWhileLoop jstatement, C context)
    {
        return visitJStatement(jstatement, context);
    }
}
