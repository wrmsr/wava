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
import com.wrmsr.wava.analyze.ControlTransferAnalysis;
import com.wrmsr.wava.analyze.ValueTypeAnalysis;
import com.wrmsr.wava.core.literal.Literal;
import com.wrmsr.wava.core.node.Binary;
import com.wrmsr.wava.core.node.Block;
import com.wrmsr.wava.core.node.Break;
import com.wrmsr.wava.core.node.Const;
import com.wrmsr.wava.core.node.If;
import com.wrmsr.wava.core.node.Label;
import com.wrmsr.wava.core.node.Loop;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Nop;
import com.wrmsr.wava.core.node.Return;
import com.wrmsr.wava.core.node.SetLocal;
import com.wrmsr.wava.core.node.Store;
import com.wrmsr.wava.core.op.BinaryOp;
import com.wrmsr.wava.transform.statementizer.StatementizerTransform;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.util.Json;
import com.wrmsr.wava.util.NameGenerator;
import com.wrmsr.wava.util.temps.TempManager;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static com.wrmsr.wava.util.Json.toPrettyJson;

public class TestStatementizer
{
    private static Node intConst(int value)
    {
        return new Const(
                Literal.of(value));
    }

    private static Node zero()
    {
        return intConst(0);
    }

    private static Node setLocal(int index, Node value)
    {
        return new SetLocal(
                Index.of(index),
                Type.I32,
                value
        );
    }

    private static Node block(Node... nodes)
    {
        return new Block(
                Arrays.asList(nodes));
    }

    private static Node storeInt(Node ptr, Node value)
    {
        return new Store(
                Type.I32,
                4,
                0,
                4,
                ptr,
                value);
    }

    private static Node storeZeroZero()
    {
        return storeInt(
                zero(),
                zero());
    }

    private static Node statementZero()
    {
        return block(
                storeZeroZero(),
                zero());
    }

    private static Node statementIf()
    {
        return new If(
                statementZero(),
                statementZero(),
                statementZero());
    }

    private static Node conditionalBreakZero(Name name)
    {
        return new Label(
                name,
                block(
                        new If(
                                zero(),
                                new Break(
                                        name,
                                        zero()),
                                new Nop()),
                        zero()));
    }

    public static final List<Node> NODES = ImmutableList.<Node>of(

            new Return(
                    new Nop()),

            new Return(
                    new Binary(
                            BinaryOp.Add,
                            Type.I32,
                            new Const(
                                    Literal.of(1)),
                            new Const(
                                    Literal.of(2)))),

            new Return(
                    new Block(
                            ImmutableList.of(
                                    new Store(
                                            Type.I32,
                                            4,
                                            0,
                                            5,
                                            new Const(
                                                    Literal.of(0)),
                                            new Const(
                                                    Literal.of(0))),
                                    new Binary(
                                            BinaryOp.Add,
                                            Type.I32,
                                            new Const(
                                                    Literal.of(1)),
                                            new Const(
                                                    Literal.of(2)))))),

            new Block(
                    ImmutableList.of(
                            new Const(
                                    Literal.of(1)),
                            new Return(
                                    new Block(
                                            ImmutableList.of(
                                                    new Store(
                                                            Type.I32,
                                                            4,
                                                            0,
                                                            5,
                                                            new Const(
                                                                    Literal.of(0)),
                                                            new Const(
                                                                    Literal.of(0))),
                                                    new Binary(
                                                            BinaryOp.Add,
                                                            Type.I32,
                                                            new Const(
                                                                    Literal.of(1)),
                                                            new Const(
                                                                    Literal.of(2)))))))),

            new Return(
                    new Label(
                            Name.of("a"),
                            new Break(
                                    Name.of("a"),
                                    new Const(
                                            Literal.of(1))))),

            new Return(
                    new Label(
                            Name.of("a"),
                            new Break(
                                    Name.of("a"),
                                    new Block(
                                            ImmutableList.of(
                                                    new Store(
                                                            Type.I32,
                                                            4,
                                                            0,
                                                            5,
                                                            new Const(
                                                                    Literal.of(0)),
                                                            new Const(
                                                                    Literal.of(0))),
                                                    new Const(
                                                            Literal.of(1))))))),

            new Return(
                    new Loop(
                            Name.of("a"),
                            new Const(
                                    Literal.of(1)))),

            new Return(
                    new Label(
                            Name.of("a"),
                            new Label(
                                    Name.of("b"),
                                    new Break(
                                            Name.of("b"),
                                            new Const(
                                                    Literal.of(1)))))),

            new Return(
                    new If(
                            new Const(
                                    Literal.of(1)),
                            new Block(
                                    ImmutableList.of(
                                            new SetLocal(
                                                    Index.of(0),
                                                    Type.I32,
                                                    new Const(
                                                            Literal.of(0))),
                                            new Const(
                                                    Literal.of(2)))),
                            new Const(
                                    Literal.of(3)))),

            new Return(
                    new Block(
                            ImmutableList.of(
                                    new If(
                                            new Const(
                                                    Literal.of(0)),
                                            new SetLocal(
                                                    Index.of(0),
                                                    Type.I32,
                                                    new Const(
                                                            Literal.of(1))),
                                            new Nop()),
                                    new Const(
                                            Literal.of(2))))),

            new Return(
                    conditionalBreakZero(Name.of("alsdf"))),

            new Nop()

    );

    public static Node run(Node root)
    {
        ControlTransferAnalysis cfa = ControlTransferAnalysis.analyze(root);
        ValueTypeAnalysis vta = ValueTypeAnalysis.analyze(root, false);
        NameGenerator ng = new NameGenerator();
        TempManager tm = new TempManager(
                ng,
                Index.of(100),
                true);
        StatementizerTransform t = new StatementizerTransform(
                cfa,
                vta,
                tm);
        return t.transformFunctionBody(root);
    }

    @Test
    public void testUgh()
            throws Throwable
    {
        Node node = run(NODES.get(10));
        toPrettyJson(node);
    }
}
