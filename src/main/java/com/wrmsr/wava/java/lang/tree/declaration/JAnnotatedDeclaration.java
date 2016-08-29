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

import com.wrmsr.wava.java.lang.tree.expression.JMethodInvocation;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

@Immutable
public final class JAnnotatedDeclaration
        extends JDeclaration
{
    private final JMethodInvocation annotation;
    private final JDeclaration declaration;

    public JAnnotatedDeclaration(JMethodInvocation annotation, JDeclaration declarationt)
    {
        this.annotation = requireNonNull(annotation);
        this.declaration = requireNonNull(declarationt);
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
        JAnnotatedDeclaration that = (JAnnotatedDeclaration) o;
        return Objects.equals(annotation, that.annotation) &&
                Objects.equals(declaration, that.declaration);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(annotation, declaration);
    }

    public JMethodInvocation getAnnotation()
    {
        return annotation;
    }

    public JDeclaration getDeclaration()
    {
        return declaration;
    }

    @Override
    public <C, R> R accept(JDeclarationVisitor<C, R> visitor, C context)
    {
        return visitor.visitJAnnotatedDeclaration(this, context);
    }
}
