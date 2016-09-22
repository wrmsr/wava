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
import com.wrmsr.wava.java.lang.JTypeSpecifier;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

@Immutable
public final class JNewArray
        extends JExpression
{
    private final JTypeSpecifier type;
    private final Optional<List<JExpression>> items;

    public JNewArray(JTypeSpecifier type, Optional<List<JExpression>> items)
    {
        this.type = requireNonNull(type);
        this.items = requireNonNull(items).map(ImmutableList::copyOf);
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
        JNewArray jNewArray = (JNewArray) o;
        return Objects.equals(type, jNewArray.type) &&
                Objects.equals(items, jNewArray.items);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(type, items);
    }

    public JTypeSpecifier getType()
    {
        return type;
    }

    public Optional<List<JExpression>> getItems()
    {
        return items;
    }

    @Override
    public <C, R> R accept(JExpressionVisitor<C, R> visitor, C context)
    {
        return visitor.visitJNewArray(this, context);
    }
}
