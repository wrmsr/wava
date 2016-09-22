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

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JQualifiedName;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

@Immutable
public final class JIdent
        extends JExpression
{
    private final JQualifiedName name;

    public JIdent(JQualifiedName name)
    {
        this.name = requireNonNull(name);
    }

    public static JIdent of(JName name)
    {
        return new JIdent(new JQualifiedName(ImmutableList.of(name)));
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
        JIdent jIdent = (JIdent) o;
        return Objects.equals(name, jIdent.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }

    public JQualifiedName getName()
    {
        return name;
    }

    @Override
    public <C, R> R accept(JExpressionVisitor<C, R> visitor, C context)
    {
        return visitor.visitJIdent(this, context);
    }
}
