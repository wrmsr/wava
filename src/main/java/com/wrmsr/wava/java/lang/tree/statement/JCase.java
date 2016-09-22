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

import com.google.common.collect.ImmutableList;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

@Immutable
public final class JCase
        extends JStatement
{
    private final List<Object> values;
    private final boolean isDefault;
    private final JBlock block;

    public JCase(List<Object> values, boolean isDefault, JBlock block)
    {
        this.values = ImmutableList.copyOf(values);
        this.isDefault = isDefault;
        this.block = requireNonNull(block);
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
        JCase jCase = (JCase) o;
        return isDefault == jCase.isDefault &&
                Objects.equals(values, jCase.values) &&
                Objects.equals(block, jCase.block);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(values, isDefault, block);
    }

    public List<Object> getValues()
    {
        return values;
    }

    public boolean isDefault()
    {
        return isDefault;
    }

    public JBlock getBlock()
    {
        return block;
    }

    @Override
    public <C, R> R accept(JStatementVisitor<C, R> visitor, C context)
    {
        return visitor.visitJCase(this, context);
    }
}
