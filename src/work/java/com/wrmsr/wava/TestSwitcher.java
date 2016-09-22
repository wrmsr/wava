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
package com.wrmsr.wava;

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.analyze.ControlTransferAnalysis;
import com.wrmsr.wava.analyze.SwitchAnalysis;
import com.wrmsr.wava.core.literal.Literal;
import com.wrmsr.wava.core.node.Block;
import com.wrmsr.wava.core.node.BreakTable;
import com.wrmsr.wava.core.node.Const;
import com.wrmsr.wava.core.node.Label;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Return;
import com.wrmsr.wava.core.node.Switch;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.transform.Switchification;
import com.wrmsr.wava.util.Json;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.google.common.base.Preconditions.checkState;

public class TestSwitcher
{
    private static final Node TEST_NODE =
            new Block(
                    ImmutableList.of(
                            new Label(
                                    Name.of("switch0"),
                                    new Block(
                                            ImmutableList.of(
                                                    new Label(
                                                            Name.of("case0"),
                                                            new Block(
                                                                    ImmutableList.of(
                                                                            new Label(
                                                                                    Name.of("case1"),
                                                                                    new Block(
                                                                                            ImmutableList.of(
                                                                                                    new Label(
                                                                                                            Name.of("case2"),
                                                                                                            new Block(
                                                                                                                    ImmutableList.of(
                                                                                                                            new BreakTable(
                                                                                                                                    ImmutableList.of(
                                                                                                                                            Name.of("case0"),
                                                                                                                                            Name.of("case1")),
                                                                                                                                    Name.of("case2"),
                                                                                                                                    new Const(
                                                                                                                                            Literal.of(1)))))),
                                                                                                    new Return(
                                                                                                            new Const(
                                                                                                                    Literal.of(2)))))),
                                                                            new Return(
                                                                                    new Const(
                                                                                            Literal.of(1)))))),
                                                    new Return(
                                                            new Const(
                                                                    Literal.of(0)))))),
                            new Return(
                                    new Const(
                                            Literal.of(-1)))));

    @Test
    public void testSwitcher()
            throws Throwable
    {
        Path outputFile = Paths.get("tmp/HelloWorld.json");
        Node body = Json.OBJECT_MAPPER_SUPPLIER.get().readValue(Files.readAllBytes(outputFile), Node.class);
//        Node body = TEST_NODE;

        ControlTransferAnalysis cfa = ControlTransferAnalysis.analyze(body);
        SwitchAnalysis swa = SwitchAnalysis.analyze(body, cfa);
        System.out.println(swa.getEntries());

        Node transformed = Switchification.switchify(body, swa);
        String json = Json.toPrettyJson(transformed);
        System.out.println(json);
    }

    @Test
    public void testJson()
            throws Throwable
    {
        Node node =
                new Switch(
                        new Const(
                                Literal.of(1)),
                        ImmutableList.of(
                                new Switch.Entry(
                                        ImmutableList.of(
                                                new Switch.IntValue(0),
                                                new Switch.IntValue(1)),
                                        new Const(
                                                Literal.of(2))),
                                new Switch.Entry(
                                        ImmutableList.of(
                                                new Switch.IntValue(2),
                                                new Switch.DefaultValue()),
                                        new Const(
                                                Literal.of(3)))));
        String json = Json.toPrettyJson(node);
        System.out.println(json);
        node = Json.OBJECT_MAPPER_SUPPLIER.get().readValue(json, Node.class);
        json = Json.toPrettyJson(node);
        System.out.println(json);
    }
}
