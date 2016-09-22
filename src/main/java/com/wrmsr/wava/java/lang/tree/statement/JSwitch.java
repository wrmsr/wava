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
import com.wrmsr.wava.java.lang.tree.expression.JExpression;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

@Immutable
public final class JSwitch
        extends JStatement
{
    private final JExpression selector;
    private final List<JCase> cases;

    public JSwitch(JExpression selector, List<JCase> cases)
    {
        this.selector = requireNonNull(selector);
        this.cases = ImmutableList.copyOf(cases);
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
        JSwitch jSwitch = (JSwitch) o;
        return Objects.equals(selector, jSwitch.selector) &&
                Objects.equals(cases, jSwitch.cases);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(selector, cases);
    }

    public JExpression getSelector()
    {
        return selector;
    }

    public List<JCase> getCases()
    {
        return cases;
    }

    @Override
    public <C, R> R accept(JStatementVisitor<C, R> visitor, C context)
    {
        return visitor.visitJSwitch(this, context);
    }
}
