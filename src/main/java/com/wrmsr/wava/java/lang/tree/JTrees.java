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
package com.wrmsr.wava.java.lang.tree;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.wrmsr.wava.java.lang.tree.expression.JLiteral;
import com.wrmsr.wava.java.lang.tree.statement.JBlock;
import com.wrmsr.wava.java.lang.tree.statement.JStatement;

import java.util.List;

import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;

public final class JTrees
{
    // FIXME: delete? will these carry metadata?
    public static final JLiteral JZERO = new JLiteral(0);
    public static final JLiteral JONE = new JLiteral(1);

    private JTrees()
    {
    }

    public static JBlock jblockify(JStatement statement)
    {
        if (statement instanceof JBlock) {
            return (JBlock) statement;
        }
        else {
            return new JBlock(
                    ImmutableList.of(statement));
        }
    }

    public static List<JStatement> jflatten(JStatement statement)
    {
        if (statement instanceof JBlock) {
            return ((JBlock) statement).getBody();
        }
        else {
            return ImmutableList.of(statement);
        }
    }

    public static JBlock jblockify(List<JStatement> statements)
    {
        if (statements.size() == 1) {
            return jblockify(Iterables.getOnlyElement(statements));
        }
        else {
            return new JBlock(statements.stream().map(JTrees::jflatten).flatMap(List::stream).collect(toImmutableList()));
        }
    }

    public static JBlock jblockify(JStatement... statements)
    {
        return jblockify(ImmutableList.copyOf(statements));
    }
}
