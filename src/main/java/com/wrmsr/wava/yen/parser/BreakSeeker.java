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
package com.wrmsr.wava.yen.parser;

import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.yen.expression.YBreak;
import com.wrmsr.wava.yen.expression.YExpression;
import com.wrmsr.wava.yen.expression.visitor.YVisitor;
import com.wrmsr.wava.yen.expression.visitor.YVisitors;

import static java.util.Objects.requireNonNull;

public final class BreakSeeker
        extends YVisitor<Void, Void>
{
    private static final class Found
            extends RuntimeException
    {
    }

    private final Name target; // look for this one

    public BreakSeeker(Name target)
    {
        this.target = requireNonNull(target);
    }

    @Override
    public Void visitBreak(YBreak curr, Void context)
    {
        if (target.equals(curr.getTarget())) {
            throw new Found();
        }
        return null;
    }

    public static boolean has(YExpression tree, Name target)
    {
        try {
            YVisitors.postWalk(tree, new BreakSeeker(target), null);
        }
        catch (Found e) {
            return true;
        }
        return false;
    }
}
