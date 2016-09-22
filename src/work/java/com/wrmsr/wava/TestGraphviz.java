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

import com.wrmsr.wava.analyze.Analyses;
import com.wrmsr.wava.core.node.Break;
import com.wrmsr.wava.core.node.Const;
import com.wrmsr.wava.core.node.Label;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.visitor.Visitor;
import com.wrmsr.wava.core.node.visitor.Visitors;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.unit.Function;
import com.wrmsr.wava.util.Json;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.wrmsr.wava.util.collect.MoreMaps.indexIdentityMap;

public class TestGraphviz
{
    @Test
    public void testOutlining()
            throws Throwable
    {
        Function function = Json.OBJECT_MAPPER_SUPPLIER.get().readValue(Files.readAllBytes(Paths.get("tmp/post.json")), Function.class);
        graphNode(function.getBody());
    }

    public static void graphNode(Node body)
            throws Throwable
    {
        graphNode(body, body);
    }

    // http://www.graphviz.org/Documentation/dotguide.pdf
    public static void graphNode(Node root, Node body)
            throws Throwable
    {
        List<Node> nodes = Analyses.linearize(root);
        Map<Node, Integer> nodeIndices = indexIdentityMap(nodes);
        Map<Name, Node> namedNodes = Analyses.getNamedNodes(root);

        StringBuilder sb = new StringBuilder();
        sb.append("digraph G {\n");
        Visitors.preWalk(body, new Visitor<Void, Void>()
        {
            private String getName(Node node)
            {
                return "node" + nodeIndices.get(node);
            }

            private void graphNode(Node node, String label)
            {
                sb.append(String.format("%s [label=\"%s\"];\n", getName(node), label));
                for (Node child : node.getChildren()) {
                    sb.append(String.format("%s -> %s;\n", getName(node), getName(child)));
                }
            }

            @Override
            protected Void visitNode(Node node, Void context)
            {
                graphNode(node, node.getClass().getSimpleName());
                return null;
            }

            @Override
            public Void visitBreak(Break node, Void context)
            {
                graphNode(node, "Break");
                sb.append(String.format("%s -> %s [style=dotted];\n", getName(node), getName(namedNodes.get(node.getTarget()))));
                return null;
            }

            @Override
            public Void visitConst(Const node, Void context)
            {
                graphNode(node, String.format("Const: %s", node.getLiteral()));
                return null;
            }

            @Override
            public Void visitLabel(Label node, Void context)
            {
                graphNode(node, String.format("Label: %s", node.getName().get()));
                return null;
            }
        }, null);
        sb.append("}\n");

        showGraph(sb.toString());
    }

    public static void showGraph(String gv)
            throws Exception
    {
        Path tempDir = Files.createTempDirectory("wava");
        tempDir.toFile().deleteOnExit();
        Path outGv = tempDir.resolve("out.gv");
        Files.write(outGv, gv.getBytes());
        Path outPng = tempDir.resolve("out.pdf");

        Process p = new ProcessBuilder()
                .directory(tempDir.toFile())
                .command("dot", "-Tpdf", "out.gv")
                .redirectOutput(outPng.toFile())
                .start();
        if (!p.waitFor(3600, TimeUnit.SECONDS)) {
            p.destroyForcibly();
            throw new IllegalStateException();
        }

        new ProcessBuilder()
                .directory(tempDir.toFile())
                .command("open", "out.pdf")
                .start()
                .waitFor(30, TimeUnit.SECONDS);
        Thread.sleep(500);
    }
}
