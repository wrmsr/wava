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
package com.wrmsr.wava.core.transform;

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.analyze.ValueTypeAnalysis;
import com.wrmsr.wava.core.literal.Literal;
import com.wrmsr.wava.core.node.Binary;
import com.wrmsr.wava.core.node.Block;
import com.wrmsr.wava.core.node.Break;
import com.wrmsr.wava.core.node.Const;
import com.wrmsr.wava.core.node.If;
import com.wrmsr.wava.core.node.Label;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Nop;
import com.wrmsr.wava.core.op.BinaryOp;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.util.Indenter;
import com.wrmsr.wava.yen.expression.YBlock;
import com.wrmsr.wava.yen.expression.YBreak;
import com.wrmsr.wava.yen.expression.YConst;
import com.wrmsr.wava.yen.expression.YExpression;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static com.wrmsr.wava.util.RecursiveConsumer.acceptRecursive;

public class TestValueType
{
    public static final YExpression E1 = new YBlock(
            Optional.of(
                    Name.of("a")),
            ImmutableList.of(
                    new YBreak(
                            Name.of("a"),
                            Optional.of(
                                    new YConst(
                                            Literal.of(1))),
                            Optional.empty())));

    // FIXME should die, a is void and value
    public static final YExpression E2 = new YBlock(
            Optional.of(
                    Name.of("a")),
            ImmutableList.of(
                    new YBreak(
                            Name.of("a"),
                            Optional.of(
                                    new YConst(
                                            Literal.of(1))),
                            Optional.of(
                                    new YConst(
                                            Literal.of(0))))));

    // FIXME should die, b is void and value
    public static final YExpression E3 = new YBlock(
            Optional.of(
                    Name.of("b")),
            ImmutableList.of(
                    new YBlock(
                            Optional.of(
                                    Name.of("a")),
                            ImmutableList.of(
                                    new YBreak(
                                            Name.of("b"),
                                            Optional.of(
                                                    new YConst(
                                                            Literal.of(1))),
                                            Optional.empty())))));

    public static final YExpression E4 = new YBlock(
            Optional.of(
                    Name.of("a")),
            ImmutableList.of(
                    new YBreak(
                            Name.of("a"),
                            Optional.empty(),
                            Optional.empty())));

    public static final List<YExpression> Y_EXPRESSIONs = ImmutableList.of(E1, E2, E3, E4);

    public static final Node R1 =
            new Label(
                    Name.of("a"),
                    new Block(
                            ImmutableList.of(
                                    new Break(
                                            Name.of("a"),
                                            new Nop()),
                                    new Const(
                                            Literal.of(1)))));

    public static final Node R2 =
            new Label(
                    Name.of("a"),
                    new Block(
                            ImmutableList.of(
                                    new Break(
                                            Name.of("a"),
                                            new Const(
                                                    Literal.of(1))),
                                    new Const(
                                            Literal.of(1)))));

    public static final Node R3 =
            new Label(
                    Name.of("a"),
                    new Block(
                            ImmutableList.of(
                                    new If(
                                            new Const(
                                                    Literal.of(0)),
                                            new Break(
                                                    Name.of("a"),
                                                    new Const(
                                                            Literal.of(1))),
                                            new Nop()),
                                    new Const(
                                            Literal.of(1)))));

    public static final Node R4 =
            new Label(
                    Name.of("a"),
                    new Block(
                            ImmutableList.of(
                                    new If(
                                            new Const(
                                                    Literal.of(0)),
                                            new Break(
                                                    Name.of("a"),
                                                    new Const(
                                                            Literal.of(1))),
                                            new Break(
                                                    Name.of("a"),
                                                    new Const(
                                                            Literal.of(1)))),
                                    new Const(
                                            Literal.of(1)))));

    private void printVTAs(Node root, ValueTypeAnalysis vtas)
    {
        Indenter indenter = new Indenter(System.out::print);
        acceptRecursive((rec, e) -> {
            indenter.writePropagating(String.format("%s : %s\n", e.getClass().getSimpleName(), vtas.get(e)));
            indenter.indent();
            e.getChildren().forEach(rec);
            indenter.dedent();
        }, root);
        System.out.print("\n\n");
    }

    public static final Node R5 =
            new Label(
                    Name.of("a"),
                    new Break(
                            Name.of("a"),
                            new Binary(
                                    BinaryOp.Add,
                                    Type.I32,
                                    new Const(
                                            Literal.of(1)),
                                    new Const(
                                            Literal.of(2)))));

    @Test
    public void testDatBoi()
            throws Throwable
    {
        for (Node node : ImmutableList.of(R1, R2, R3, R4, R5)) {
            ValueTypeAnalysis vtas = ValueTypeAnalysis.analyze(node, false);

            printVTAs(node, vtas);
        }
    }
}
