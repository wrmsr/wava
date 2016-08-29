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
public final class JArrayAccess
        extends JExpression
{
    private final JExpression array;
    private final JExpression index;

    public JArrayAccess(JExpression array, JExpression index)
    {
        this.array = requireNonNull(array);
        this.index = requireNonNull(index);
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
        JArrayAccess that = (JArrayAccess) o;
        return Objects.equals(array, that.array) &&
                Objects.equals(index, that.index);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(array, index);
    }

    public JExpression getArray()
    {
        return array;
    }

    public JExpression getIndex()
    {
        return index;
    }

    @Override
    public <C, R> R accept(JExpressionVisitor<C, R> visitor, C context)
    {
        return visitor.visitJArrayAccess(this, context);
    }
}
