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

import com.wrmsr.wava.java.lang.JQualifiedName;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

@Immutable
public final class JAssignment
        extends JExpression
{
    private final JExpression left;
    private final JExpression right;

    public JAssignment(JExpression left, JExpression right)
    {
        this.left = requireNonNull(left);
        this.right = requireNonNull(right);
    }

    public static JAssignment of(JQualifiedName left, JExpression right)
    {
        return new JAssignment(new JIdent(left), right);
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
        JAssignment that = (JAssignment) o;
        return Objects.equals(left, that.left) &&
                Objects.equals(right, that.right);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(left, right);
    }

    public JExpression getLeft()
    {
        return left;
    }

    public JExpression getRight()
    {
        return right;
    }

    @Override
    public <C, R> R accept(JExpressionVisitor<C, R> visitor, C context)
    {
        return visitor.visitJAssignment(this, context);
    }
}
