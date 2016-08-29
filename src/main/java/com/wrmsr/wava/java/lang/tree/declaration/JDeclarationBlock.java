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

import com.google.common.collect.ImmutableList;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;

@Immutable
public final class JDeclarationBlock
        extends JDeclaration
{
    private final List<JDeclaration> body;

    public JDeclarationBlock(List<JDeclaration> body)
    {
        this.body = ImmutableList.copyOf(body);
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
        JDeclarationBlock that = (JDeclarationBlock) o;
        return Objects.equals(body, that.body);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(body);
    }

    public List<JDeclaration> getBody()
    {
        return body;
    }

    @Override
    public <C, R> R accept(JDeclarationVisitor<C, R> visitor, C context)
    {
        return visitor.visitJDeclarationBlock(this, context);
    }
}
