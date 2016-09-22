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

import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.tree.expression.JExpression;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

@Immutable
public final class JAnnotatedStatement
        extends JStatement
{
    private final JQualifiedName annotation;
    private final Optional<List<JExpression>> operands;
    private final JStatement statement;

    public JAnnotatedStatement(JQualifiedName annotation, Optional<List<JExpression>> operands, JStatement statement)
    {
        this.annotation = requireNonNull(annotation);
        this.operands = requireNonNull(operands);
        this.statement = requireNonNull(statement);
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
        JAnnotatedStatement that = (JAnnotatedStatement) o;
        return Objects.equals(annotation, that.annotation) &&
                Objects.equals(operands, that.operands) &&
                Objects.equals(statement, that.statement);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(annotation, operands, statement);
    }

    public JQualifiedName getAnnotation()
    {
        return annotation;
    }

    public Optional<List<JExpression>> getOperands()
    {
        return operands;
    }

    public JStatement getStatement()
    {
        return statement;
    }

    @Override
    public <C, R> R accept(JStatementVisitor<C, R> visitor, C context)
    {
        return visitor.visitJAnnotatedStatement(this, context);
    }
}
