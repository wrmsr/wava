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

import javax.annotation.concurrent.Immutable;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

@Immutable
public final class JConditional
    extends JExpression
{
    private final JExpression condition;
    private final JExpression ifTrue;
    private final JExpression ifFalse;

    public JConditional(JExpression condition, JExpression ifTrue, JExpression ifFalse)
    {
        this.condition = requireNonNull(condition);
        this.ifTrue = requireNonNull(ifTrue);
        this.ifFalse = requireNonNull(ifFalse);
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
        JConditional that = (JConditional) o;
        return Objects.equals(condition, that.condition) &&
                Objects.equals(ifTrue, that.ifTrue) &&
                Objects.equals(ifFalse, that.ifFalse);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(condition, ifTrue, ifFalse);
    }

    public JExpression getCondition()
    {
        return condition;
    }

    public JExpression getIfTrue()
    {
        return ifTrue;
    }

    public JExpression getIfFalse()
    {
        return ifFalse;
    }

    @Override
    public <C, R> R accept(JExpressionVisitor<C, R> visitor, C context)
    {
        return visitor.visitJConditional(this, context);
    }
}
