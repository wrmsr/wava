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

import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JTypeSpecifier;
import com.wrmsr.wava.java.lang.tree.expression.JExpression;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

@Immutable
public final class JForEach
        extends JStatement
{
    private final JTypeSpecifier type;
    private final JName item;
    private final JExpression iterable;
    private final JBlock body;

    public JForEach(JTypeSpecifier type, JName item, JExpression iterable, JBlock body)
    {
        this.type = requireNonNull(type);
        this.item = requireNonNull(item);
        this.iterable = requireNonNull(iterable);
        this.body = requireNonNull(body);
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
        JForEach jForEach = (JForEach) o;
        return Objects.equals(type, jForEach.type) &&
                Objects.equals(item, jForEach.item) &&
                Objects.equals(iterable, jForEach.iterable) &&
                Objects.equals(body, jForEach.body);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(type, item, iterable, body);
    }

    public JTypeSpecifier getType()
    {
        return type;
    }

    public JName getItem()
    {
        return item;
    }

    public JExpression getIterable()
    {
        return iterable;
    }

    public JBlock getBody()
    {
        return body;
    }

    @Override
    public <C, R> R accept(JStatementVisitor<C, R> visitor, C context)
    {
        return visitor.visitJForEach(this, context);
    }
}
