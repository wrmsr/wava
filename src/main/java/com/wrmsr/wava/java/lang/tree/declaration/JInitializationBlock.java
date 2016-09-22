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
package com.wrmsr.wava.java.lang.tree.declaration;

import com.wrmsr.wava.java.lang.tree.statement.JBlock;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

@Immutable
public final class JInitializationBlock
        extends JDeclaration
{
    private final JBlock block;

    public JInitializationBlock(JBlock block)
    {
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
        JInitializationBlock that = (JInitializationBlock) o;
        return Objects.equals(block, that.block);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(block);
    }

    public JBlock getBlock()
    {
        return block;
    }

    @Override
    public <C, R> R accept(JDeclarationVisitor<C, R> visitor, C context)
    {
        return visitor.visitJInitializationBlock(this, context);
    }
}
