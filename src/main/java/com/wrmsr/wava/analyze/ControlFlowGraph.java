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
package com.wrmsr.wava.analyze;

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.core.node.Block;
import com.wrmsr.wava.core.node.Break;
import com.wrmsr.wava.core.node.BreakTable;
import com.wrmsr.wava.core.node.If;
import com.wrmsr.wava.core.node.Label;
import com.wrmsr.wava.core.node.Loop;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Nop;
import com.wrmsr.wava.core.node.Return;
import com.wrmsr.wava.core.node.Switch;
import com.wrmsr.wava.core.node.Unreachable;
import com.wrmsr.wava.core.node.visitor.Visitor;
import com.wrmsr.wava.core.type.Name;
import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;
import static com.wrmsr.wava.util.collect.MoreCollectors.toIdentityMap;
import static java.util.Collections.unmodifiableMap;
import static java.util.Objects.requireNonNull;

@Immutable
public final class ControlFlowGraph
{
    public static final Node ENTRY = new Nop();

    private static final Node PLACEHOLDER = new Nop();

    @Immutable
    public static final class Edge
    {
        public enum Type
        {
            FLOW,
            CONDITIONAL,
            BREAK,
            CONTINUE
        }

        private final Type type;
        private final Node input;
        private final Node output;

        public Edge(Type type, Node input, Node output)
        {
            checkArgument(input != output);
            this.type = requireNonNull(type);
            this.input = requireNonNull(input);
            this.output = requireNonNull(output);
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
            Edge edge = (Edge) o;
            return type == edge.type &&
                    Objects.equals(input, edge.input) &&
                    Objects.equals(output, edge.output);
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(type, input, output);
        }

        public Type getType()
        {
            return type;
        }

        public Node getInput()
        {
            return input;
        }

        public Node getOutput()
        {
            return output;
        }
    }

    private final List<Edge> edges;
    private final Map<Node, List<Edge>> inputs;
    private final Map<Node, List<Edge>> outputs;

    public ControlFlowGraph(List<Edge> edges)
    {
        this.edges = ImmutableList.copyOf(edges);
        Map<Node, List<Edge>> inputs = new IdentityHashMap<>();
        Map<Node, List<Edge>> outputs = new IdentityHashMap<>();
        for (Edge edge : edges) {
            List<Edge> list = inputs.get(edge.getOutput());
            if (list == null) {
                inputs.put(edge.getOutput(), list = new ArrayList<>());
            }
            list.add(edge);
            list = outputs.get(edge.getInput());
            if (list == null) {
                outputs.put(edge.getInput(), list = new ArrayList<>());
            }
            list.add(edge);
        }
        this.inputs = unmodifiableMap(inputs.entrySet().stream().collect(toIdentityMap(e -> e.getKey(), e -> ImmutableList.copyOf(e.getValue()))));
        this.outputs = unmodifiableMap(outputs.entrySet().stream().collect(toIdentityMap(e -> e.getKey(), e -> ImmutableList.copyOf(e.getValue()))));
    }

    public List<Edge> getEdges()
    {
        return edges;
    }

    public Map<Node, List<Edge>> getInputs()
    {
        return inputs;
    }

    public Map<Node, List<Edge>> getOutputs()
    {
        return outputs;
    }

    public List<Edge> getInput(Node node)
    {
        return inputs.getOrDefault(node, ImmutableList.of());
    }

    public List<Edge> getOutput(Node node)
    {
        return outputs.getOrDefault(node, ImmutableList.of());
    }

    private static void putFlow(ImmutableList.Builder<Edge> edges, Node node, List<Edge> inputs)
    {
        checkArgument(inputs.stream().allMatch(e -> e.output == PLACEHOLDER));
        edges.addAll(inputs.stream().map(e -> new Edge(e.type, e.input, node)).iterator());
    }

    private static void putBreak(ImmutableList.Builder<Edge> edges, Map<Name, Node> nodesByName, Name output, Node inputNode)
    {
        Node outputNode = requireNonNull(nodesByName.get(output));
        outputNode.accept(new Visitor<Void, Void>()
        {
            @Override
            protected Void visitNode(Node node, Void context)
            {
                throw new IllegalStateException();
            }

            @Override
            public Void visitLabel(Label node, Void context)
            {
                edges.add(new Edge(Edge.Type.BREAK, inputNode, outputNode));
                return null;
            }

            @Override
            public Void visitLoop(Loop node, Void context)
            {
                edges.add(new Edge(Edge.Type.CONTINUE, inputNode, outputNode));
                return null;
            }
        }, null);
    }

    @SuppressWarnings("Duplicates")
    public static ControlFlowGraph analyzeDeep(Node root, Map<Name, Node> nodesByName)
    {
        ImmutableList.Builder<Edge> edges = ImmutableList.builder();
        edges.add(new Edge(Edge.Type.FLOW, ENTRY, root));

        root.accept(new Visitor<List<Edge>, List<Edge>>()
        {
            @Override
            protected List<Edge> visitNode(Node node, List<Edge> inputs)
            {
                putFlow(edges, node, inputs);
                return ImmutableList.of(new Edge(Edge.Type.FLOW, node, PLACEHOLDER));
            }

            @Override
            public List<Edge> visitBlock(Block node, List<Edge> inputs)
            {
                putFlow(edges, node, inputs);
                inputs = ImmutableList.of(new Edge(Edge.Type.FLOW, node, PLACEHOLDER));
                for (Node child : node.getChildren()) {
                    inputs = child.accept(this, inputs);
                }
                return inputs;
            }

            @Override
            public List<Edge> visitIf(If node, List<Edge> inputs)
            {
                inputs = node.getCondition().accept(this, inputs);
                putFlow(edges, node, inputs);
                List<Edge> childInputs = ImmutableList.of(new Edge(Edge.Type.CONDITIONAL, node, PLACEHOLDER));
                List<Edge> leftInputs = node.getIfTrue().accept(this, childInputs);
                List<Edge> rightInputs = node.getIfFalse().accept(this, childInputs);
                return ImmutableList.<Edge>builder().addAll(leftInputs).addAll(rightInputs).build();
            }

            @Override
            public List<Edge> visitBreak(Break node, List<Edge> inputs)
            {
                inputs = node.getValue().accept(this, inputs);
                putFlow(edges, node, inputs);
                putBreak(edges, nodesByName, node.getTarget(), node);
                return ImmutableList.of();
            }

            @Override
            public List<Edge> visitBreakTable(BreakTable node, List<Edge> inputs)
            {
                inputs = node.getCondition().accept(this, inputs);
                putFlow(edges, node, inputs);
                Set<Name> seen = new HashSet<>();
                for (Name target : node.getTargets()) {
                    if (!seen.contains(target)) {
                        seen.add(target);
                        putBreak(edges, nodesByName, target, node);
                    }
                }
                putBreak(edges, nodesByName, node.getDefaultTarget(), node);
                return ImmutableList.of();
            }

            @Override
            public List<Edge> visitLabel(Label node, List<Edge> inputs)
            {
                for (Node child : node.getChildren()) {
                    inputs = child.accept(this, inputs);
                }
                putFlow(edges, node, inputs);
                return ImmutableList.of(new Edge(Edge.Type.FLOW, node, PLACEHOLDER));
            }

            @Override
            public List<Edge> visitLoop(Loop node, List<Edge> inputs)
            {
                putFlow(edges, node, inputs);
                inputs = ImmutableList.of(new Edge(Edge.Type.FLOW, node, PLACEHOLDER));
                for (Node child : node.getChildren()) {
                    inputs = child.accept(this, inputs);
                }
                return inputs;
            }

            @Override
            public List<Edge> visitReturn(Return node, List<Edge> inputs)
            {
                inputs = node.getValue().accept(this, inputs);
                putFlow(edges, node, inputs);
                return ImmutableList.of();
            }

            @Override
            public List<Edge> visitSwitch(Switch node, List<Edge> context)
            {
                throw new UnsupportedOperationException();
            }

            @Override
            public List<Edge> visitUnreachable(Unreachable node, List<Edge> inputs)
            {
                putFlow(edges, node, inputs);
                return ImmutableList.of();
            }
        }, ImmutableList.of());

        return new ControlFlowGraph(edges.build());
    }

    @SuppressWarnings("Duplicates")
    public static ControlFlowGraph analyzeShallow(Node root, Map<Name, Node> nodesByName, ValueTypeAnalysis vta)
    {
        ImmutableList.Builder<Edge> edges = ImmutableList.builder();
        edges.add(new Edge(Edge.Type.FLOW, ENTRY, root));

        root.accept(new Visitor<List<Edge>, List<Edge>>()
        {
            @Override
            protected List<Edge> visitNode(Node node, List<Edge> inputs)
            {
                checkState(!vta.get(node).isUsed());
                putFlow(edges, node, inputs);
                return ImmutableList.of(new Edge(Edge.Type.FLOW, node, PLACEHOLDER));
            }

            @Override
            public List<Edge> visitBlock(Block node, List<Edge> inputs)
            {
                checkState(!vta.get(node).isUsed());
                putFlow(edges, node, inputs);
                inputs = ImmutableList.of(new Edge(Edge.Type.FLOW, node, PLACEHOLDER));
                for (Node child : node.getChildren()) {
                    inputs = child.accept(this, inputs);
                }
                return inputs;
            }

            @Override
            public List<Edge> visitIf(If node, List<Edge> inputs)
            {
                checkState(!vta.get(node).isUsed());
                putFlow(edges, node, inputs);
                List<Edge> childInputs = ImmutableList.of(new Edge(Edge.Type.CONDITIONAL, node, PLACEHOLDER));
                List<Edge> leftInputs = node.getIfTrue().accept(this, childInputs);
                List<Edge> rightInputs = node.getIfFalse().accept(this, childInputs);
                return ImmutableList.<Edge>builder().addAll(leftInputs).addAll(rightInputs).build();
            }

            @Override
            public List<Edge> visitBreak(Break node, List<Edge> inputs)
            {
                checkState(!vta.get(node).isUsed());
                putFlow(edges, node, inputs);
                putBreak(edges, nodesByName, node.getTarget(), node);
                return ImmutableList.of();
            }

            @Override
            public List<Edge> visitBreakTable(BreakTable node, List<Edge> inputs)
            {
                checkState(!vta.get(node).isUsed());
                putFlow(edges, node, inputs);
                Set<Name> seen = new HashSet<>();
                for (Name target : node.getTargets()) {
                    if (!seen.contains(target)) {
                        seen.add(target);
                        putBreak(edges, nodesByName, target, node);
                    }
                }
                putBreak(edges, nodesByName, node.getDefaultTarget(), node);
                return ImmutableList.of();
            }

            @Override
            public List<Edge> visitLabel(Label node, List<Edge> inputs)
            {
                checkState(!vta.get(node).isUsed());
                for (Node child : node.getChildren()) {
                    inputs = child.accept(this, inputs);
                }
                putFlow(edges, node, inputs);
                return ImmutableList.of(new Edge(Edge.Type.FLOW, node, PLACEHOLDER));
            }

            @Override
            public List<Edge> visitLoop(Loop node, List<Edge> inputs)
            {
                checkState(!vta.get(node).isUsed());
                putFlow(edges, node, inputs);
                inputs = ImmutableList.of(new Edge(Edge.Type.FLOW, node, PLACEHOLDER));
                for (Node child : node.getChildren()) {
                    inputs = child.accept(this, inputs);
                }
                return inputs;
            }

            @Override
            public List<Edge> visitReturn(Return node, List<Edge> inputs)
            {
                checkState(!vta.get(node).isUsed());
                putFlow(edges, node, inputs);
                return ImmutableList.of();
            }

            @Override
            public List<Edge> visitSwitch(Switch node, List<Edge> context)
            {
                throw new UnsupportedOperationException();
            }

            @Override
            public List<Edge> visitUnreachable(Unreachable node, List<Edge> inputs)
            {
                checkState(!vta.get(node).isUsed());
                putFlow(edges, node, inputs);
                return ImmutableList.of();
            }
        }, ImmutableList.of());

        return new ControlFlowGraph(edges.build());
    }
}
