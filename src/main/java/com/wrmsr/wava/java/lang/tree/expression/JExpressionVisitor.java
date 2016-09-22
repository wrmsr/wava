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
package com.wrmsr.wava.java.lang.tree.expression;

public class JExpressionVisitor<C, R>
{
    protected R visitJExpression(JExpression jexpression, C context)
    {
        return null;
    }

    public R visitJArrayAccess(JArrayAccess jexpression, C context)
    {
        return visitJExpression(jexpression, context);
    }

    public R visitJAssignment(JAssignment jexpression, C context)
    {
        return visitJExpression(jexpression, context);
    }

    public R visitJCast(JCast jexpression, C context)
    {
        return visitJExpression(jexpression, context);
    }

    public R visitJBinary(JBinary jexpression, C context)
    {
        return visitJExpression(jexpression, context);
    }

    public R visitJConditional(JConditional jexpression, C context)
    {
        return visitJExpression(jexpression, context);
    }

    public R visitJIdent(JIdent jexpression, C context)
    {
        return visitJExpression(jexpression, context);
    }

    public R visitJLiteral(JLiteral jexpression, C context)
    {
        return visitJExpression(jexpression, context);
    }

    public R visitJLongArrayLiteral(JLongArrayLiteral jexpression, C context)
    {
        return visitJExpression(jexpression, context);
    }

    public R visitJLongStringLiteral(JLongStringLiteral jexpression, C context)
    {
        return visitJExpression(jexpression, context);
    }

    public R visitJMemberAccess(JMemberAccess jexpression, C context)
    {
        return visitJExpression(jexpression, context);
    }

    public R visitJMethodInvocation(JMethodInvocation jexpression, C context)
    {
        return visitJExpression(jexpression, context);
    }

    public R visitJMethodReference(JMethodReference jexpression, C context)
    {
        return visitJExpression(jexpression, context);
    }

    public R visitJNew(JNew jexpression, C context)
    {
        return visitJExpression(jexpression, context);
    }

    public R visitJNewArray(JNewArray jexpression, C context)
    {
        return visitJExpression(jexpression, context);
    }

    public R visitJUnary(JUnary jexpression, C context)
    {
        return visitJExpression(jexpression, context);
    }
}
