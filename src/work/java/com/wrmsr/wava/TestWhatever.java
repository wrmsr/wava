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
import com.google.common.collect.ImmutableSet;
import com.wrmsr.wava.analyze.Analyses;
import com.wrmsr.wava.analyze.ControlFlowGraph;
import com.wrmsr.wava.analyze.ValueTypeAnalysis;
import com.wrmsr.wava.core.node.Binary;
import com.wrmsr.wava.core.node.Block;
import com.wrmsr.wava.core.node.Break;
import com.wrmsr.wava.core.node.BreakTable;
import com.wrmsr.wava.core.node.If;
import com.wrmsr.wava.core.node.Label;
import com.wrmsr.wava.core.node.Loop;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Nop;
import com.wrmsr.wava.core.node.Unary;
import com.wrmsr.wava.core.op.BinaryOp;
import com.wrmsr.wava.core.op.UnaryOp;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.core.unit.Module;
import com.wrmsr.wava.driver.StandardFunctionProcessor;
import com.wrmsr.wava.basic.Basic;
import com.wrmsr.wava.basic.BasicDominatorInfo;
import com.wrmsr.wava.basic.BasicLoopInfo;
import com.wrmsr.wava.basic.BasicSet;
import com.wrmsr.wava.basic.Basics;
import com.wrmsr.wava.basic.match.BooleanMatching;
import com.wrmsr.wava.basic.match.LoopMatching;
import com.wrmsr.wava.basic.match.SimpleMatching;
import com.wrmsr.wava.yen.global.YModule;
import com.wrmsr.wava.yen.parser.ModuleFactory;
import com.wrmsr.wava.yen.parser.Parser;
import com.wrmsr.wava.yen.parser.element.Element;
import com.wrmsr.wava.yen.parser.input.Input;
import com.wrmsr.wava.yen.translation.UnitTranslation;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.junit.Test;

import javax.annotation.CheckReturnValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;

import static com.google.common.base.Preconditions.checkState;
import static com.google.common.collect.Iterables.getOnlyElement;
import static com.wrmsr.wava.TestGraphviz.showGraph;
import static com.wrmsr.wava.core.node.Nodes.nodify;
import static com.wrmsr.wava.basic.Basics.getUnconditionalTarget;
import static com.wrmsr.wava.basic.Basics.minBasicIndex;
import static com.wrmsr.wava.basic.Basics.transformBasics;
import static com.wrmsr.wava.basic.match.BooleanMatching.matchBoolean;
import static com.wrmsr.wava.util.collect.MoreCollectors.toIdentityMap;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableSet;
import static com.wrmsr.wava.util.collect.MoreMaps.indexIdentityMap;
import static com.wrmsr.wava.util.collect.MoreOptionals.optionalToList;
import static com.wrmsr.wava.util.collect.MoreOptionals.optionalToStream;
import static com.wrmsr.wava.util.function.Bind.bind;
import static java.util.Objects.requireNonNull;

public class TestWhatever
{
    @CheckReturnValue
    private static BasicSet shrinkSimpleLoop(BasicLoopInfo li, BasicSet basics, Basic basic)
    {
        if (basic.getAllTargets().size() != 2 || basic.getAllTargets().contains(Basics.UNREACHABLE_NAME) || basic.getAllTargets().contains(basic.getName())) {
            return basics;
        }
        Set<Name> backEdgeInputs = basics.getInputs(basic.getName()).stream()
                .filter(t -> li.getBackEdges().containsEntry(basic.getName(), t))
                .collect(toImmutableSet());
        if (backEdgeInputs.size() != 1) {
            return basics;
        }
        Name loopBodyName = getOnlyElement(backEdgeInputs);
        if (!basic.getAllTargets().contains(loopBodyName) || !ImmutableSet.copyOf(basics.getInputs().get(loopBodyName)).equals(ImmutableSet.of(basic.getName()))) {
            return basics;
        }

        Basic loopBody = requireNonNull(basics.get(loopBodyName));
        Name succName;
        Node condition;
        if (loopBodyName.equals(basic.getBreakTable().getDefaultTarget())) {
            succName = getOnlyElement(basic.getBreakTable().getTargets());
            // FIXME r u sure
            condition = new Unary(
                    UnaryOp.EqZ,
                    Type.I32,
                    basic.getBreakTable().getCondition());
        }
        else {
            succName = basic.getBreakTable().getDefaultTarget();
            condition = basic.getBreakTable().getCondition();
        }

        Node loop = new Loop(
                // FIXME check
                loopBodyName,
                nodify(ImmutableList.<Node>builder()
                        .addAll(loopBody.getBody())
                        .add(
                                new If(
                                        condition,
                                        new Break(
                                                loopBodyName,
                                                new Nop()),
                                        new Nop()))
                        .build()));

        Basic newBasic = new Basic(
                basic.getName(),
                ImmutableList.<Node>builder()
                        .addAll(basic.getBody())
                        .add(loop)
                        .build(),
                new BreakTable(
                        ImmutableList.of(),
                        succName,
                        new Nop()),
                minBasicIndex(basic, loopBody));

        basics = basics.replace(newBasic);
        basics = basics.remove(loopBodyName);

        return basics;
    }

//    public static final class MatchedIfOr
//    {
//        public final Node condition;
//    }

//    public static Stream<BasicSet> collapseIfAnd(BasicSet basics, Basic basic)
//    {
//
//    }

    public static Stream<BasicSet> collapseIfOr(BasicSet basics, Basic basic)
    {
        return matchBoolean(basic)
                .flatMap(m1 -> {
                    Basic or = basics.get(m1.ifFalse);
                    if (!or.getBody().isEmpty() || !basics.getInputs(or).equals(ImmutableSet.of(basic.getName()))) {
                        return Stream.empty();
                    }
                    Basic then = basics.get(m1.ifTrue);
                    if (!basics.getInputs(then).equals(ImmutableSet.of(basic.getName(), or.getName()))) {
                        return Stream.empty();
                    }
                    Optional<Name> after = getUnconditionalTarget(then.getBreakTable());
                    if (!after.isPresent()) {
                        return Stream.empty();
                    }
                    return matchBoolean(or)
                            .flatMap(m2 -> {
                                if (!m2.ifTrue.equals(then.getName()) || !m2.ifFalse.equals(after.get())) {
                                    return Stream.empty();
                                }
                                Basic newBasic = new Basic(
                                        basic.getName(),
                                        ImmutableList.<Node>builder()
                                                .addAll(basic.getBody())
                                                .add(
                                                        new If(
                                                                new Binary(
                                                                        BinaryOp.CondOr,
                                                                        Type.I32,
                                                                        m1.condition,
                                                                        m2.condition),
                                                                nodify(then.getBody()),
                                                                new Nop()))
                                                .build(),
                                        new BreakTable(
                                                ImmutableList.of(),
                                                after.get(),
                                                new Nop()),
                                        minBasicIndex(basic, or, then));
                                return Stream.of(basics
                                        .replace(newBasic)
                                        .remove(or)
                                        .remove(then));
                            });
                });
    }

    // technical af
//    private static void shrinkLoopSandwiches(Map<Name, Basic> basics, Multimap<Name, Name> inputs, Set<Name> loops, Multimap<Name, Name> backEdges)
//    {
//        basics = new HashMap<>(basics);
//        inputs = HashMultimap.create(inputs);
//        for (Name name : ImmutableList.copyOf(basics.keySet())) {
//            if (!loops.contains(name)) {
//                continue;
//            }
//            Basic basic = basics.get(name);
//            if (basic == null) {
//                continue;
//            }
//
//            if (basic.getAllTargets().size() != 2 || basic.getAllTargets().contains(Basics.UNREACHABLE_NAME) || basic.getAllTargets().contains(name)) {
//                continue;
//            }
//            Set<Name> backEdgeInputs = inputs.get(name).stream()
//                    .filter(t -> backEdges.containsEntry(t, name))
//                    .collect(toImmutableSet());
//            if (backEdgeInputs.size() != 1) {
//                continue;
//            }
//            Name loopBodyName = getOnlyElement(backEdgeInputs);
//            if (!basic.getAllTargets().contains(loopBodyName) || !ImmutableSet.copyOf(inputs.get(loopBodyName)).equals(ImmutableSet.of(name))) {
//                continue;
//            }
//        }
//        return unmodifiableMap(basics);
//    }

    private static void showBasics(Name fname, BasicSet basics, boolean drawDoms)
            throws Exception
    {
        BasicDominatorInfo dt = BasicDominatorInfo.build(basics);
        BasicLoopInfo li = BasicLoopInfo.build(basics, dt);

        Function<Name, String> nameMangler = n -> n.get().replace('$', '_');
        StringBuilder sb = new StringBuilder();
        sb.append("digraph G {\n");
        sb.append("labelloc=\"t\";");
        sb.append(String.format("label=\"%s (%d)\";", fname.get(), basics.size()));
        List<Name> order = basics.basics().stream().sorted((l, r) -> Integer.compare(l.getIndex().getAsInt(), r.getIndex().getAsInt())).map(Basic::getName).collect(toImmutableList());
        for (Name name : order) {
            Basic basic = basics.get(name);
            Name idom = dt.getImmediateDominator(basic.getName());
            Set<Name> domFront = dt.getDominanceFrontiers().get(basic.getName());
            boolean isLoop = li.isLoop(basic.getName());
            boolean isIf = !isLoop && basic.getAllTargets().size() == 2; // FIXME WRONG 1035
            boolean isSingle = basics.getInputs(basic).size() == 1 && basic.getAllTargets().size() == 1;
            String nodeStyle = isLoop ? "fillcolor=blue,style=filled" : isIf ? "fillcolor=green,style=filled" : isSingle ? "fillcolor=orange,style=filled" : "";
            int totalSize = basic.getBody().stream().mapToInt(Analyses::getChildCount).sum();
            sb.append(String.format("%s [label=\"%s: %d, %d, %d\",%s];\n", nameMangler.apply(basic.getName()), basic.getName().get(), basic.getIndex().getAsInt(), basic.getBody().size(), totalSize, nodeStyle));
            if (drawDoms) {
                if (idom != null) {
                    sb.append(String.format("%s -> %s [color=red];\n", nameMangler.apply(idom), nameMangler.apply(basic.getName())));
                }
                domFront.forEach(df -> sb.append(String.format("%s -> %s [color=red,style=dotted];\n", nameMangler.apply(basic.getName()), nameMangler.apply(df))));
            }
            Name loopParent = li.getLoopParent(name);
            if (loopParent != null) {
                sb.append(String.format("%s -> %s [color=blue,style=dotted];\n", nameMangler.apply(loopParent), nameMangler.apply(basic.getName())));
            }
            basic.getAllTargets().forEach(output -> {
                String edgeStyle = li.getBackEdges().containsEntry(output, basic.getName()) ? "fillcolor=blue" : "";
                sb.append(String.format("%s -> %s [%s];\n", nameMangler.apply(basic.getName()), nameMangler.apply(output), edgeStyle));
            });
        }
        Basics.TERMINAL_NAMES.forEach(n -> sb.append(String.format("%s [label=\"%s\"];\n", nameMangler.apply(n), n.get())));
        sb.append("}\n");
        showGraph(sb.toString());
    }

    public static Node cfgStackify(Map<Name, Basic> basics)
    {
        checkState(basics.values().stream().allMatch(basic -> basic.getIndex().isPresent()));
        checkState(basics.values().stream().flatMap(basic -> optionalToStream(basic.getIndex()).boxed()).collect(toImmutableSet()).size() == basics.size());

        throw new IllegalStateException();
    }

    public static Node worst(Map<Name, Basic> basics, Set<Name> loops)
    {
        checkState(basics.values().stream().allMatch(basic -> basic.getIndex().isPresent()));
        checkState(basics.values().stream().flatMap(basic -> optionalToStream(basic.getIndex()).boxed()).collect(toImmutableSet()).size() == basics.size());
        List<Basic> basicList = new ArrayList<>(basics.values());
        Collections.sort(basicList, (left, right) -> Integer.compare(left.getIndex().getAsInt(), right.getIndex().getAsInt()));
        checkState(!basicList.isEmpty());

        Node ret = new Nop();
        for (Basic basic : basicList) {
            Block body = new Block(
                    ImmutableList.<Node>builder()
                            .add(ret)
                            .addAll(basic.getBody())
                            .addAll(optionalToList(Basics.simplifyBreakTable(basic.getBreakTable())))
                            .build());
            if (loops.contains(basic.getName())) {
                ret = new Loop(
                        basic.getName(),
                        body);
            }
            else {
                ret = new Label(
                        basic.getName(),
                        body);
            }
        }

        return ret;
    }

    public static void doFunction(com.wrmsr.wava.core.unit.Function function_)
            throws Exception
    {
        System.out.println(function_.getName().get());
        com.wrmsr.wava.core.unit.Function function = new StandardFunctionProcessor().processFunction(function_);

        BasicSet basics;
        {
            Node root = function.getBody();
            Map<Name, Node> namedNodes = Analyses.getNamedNodes(root);
            Map<Node, Name> namedNodeNames = namedNodes.entrySet().stream().collect(toIdentityMap(e -> e.getValue(), e -> e.getKey()));
            List<Node> nodes = Analyses.linearize(root);
            Map<Node, Integer> nodeIndices = indexIdentityMap(nodes);
            Map<Node, Name> nodeNames = nodes.stream().map(node -> ImmutablePair.of(node, namedNodeNames.containsKey(node) ? namedNodeNames.get(node) : Name.of("node" + nodeIndices.get(node))))
                    .collect(toIdentityMap(Map.Entry::getKey, Map.Entry::getValue));

            ValueTypeAnalysis vta = ValueTypeAnalysis.analyze(root, false);
            ControlFlowGraph cfg = ControlFlowGraph.analyzeShallow(root, namedNodes, vta);

            basics = BasicSet.build(
                    Basics.buildBasics(cfg, vta, nodeNames, nodeIndices)
                            .values().stream()
                            .map(Basics::cleanBasic));
        }

//        showBasics(basics, true);
//        {
//            Node root = worst(basics, findBasicLoops(basics, generateBasicDominatorTree(basics)));
//            JDeclaration jdecl = jcompileFunction(new com.wrmsr.wava.core.unit.Function(function.getName(), function.getResult(), function.getArgCount(), function.getLocals(), root)).get(0);
//            CodeBlock.Builder code = CodeBlock.builder();
//            new JRenderer(code).renderDeclaration(jdecl);
//            System.out.println(JRenderer.renderWithIndent(code.build(), "    "));
//        }

        while (true) {
            int size = basics.size();
            System.out.println(size);

            basics = transformBasics(SimpleMatching::mergeUnconditionalBasic, basics);
            basics = transformBasics(SimpleMatching::mergeEmptyBasic, basics);
            basics = transformBasics(BooleanMatching::shrinkIf, basics);
            basics = transformBasics(BooleanMatching::shrinkIfElse, basics);
            basics = transformBasics(bind(LoopMatching::shrinkSelfLoops, BasicLoopInfo.build(basics, BasicDominatorInfo.build(basics)))::apply, basics);
            basics = transformBasics(bind(TestWhatever::shrinkSimpleLoop, BasicLoopInfo.build(basics, BasicDominatorInfo.build(basics)))::apply, basics);
            basics = transformBasics(TestWhatever::collapseIfOr, basics);

            if (basics.size() == size) {
                break;
            }
        }

        showBasics(function.getName(), basics, true);

        // getLoopContents(basics, Name.of("node155"));

//        Map<Name, Name> loopParents = new HashMap<>();
//        {
//            Stack<Name> rootStack = new Stack<>();
//            rootStack.push(null);
//            Set<Name> set = new HashSet<>(loops);
//            while (!rootStack.isEmpty()) {
//                Name parent = rootStack.pop();
//                if (parent != null) {
//                    set.remove(parent);
//                }
//                Set<Name> rootLoops = set.stream().filter(loop -> !set.stream().anyMatch(otherLoop -> !otherLoop.equals(loop) && loopContents.get(otherLoop).contains(loop))).collect(toImmutableSet());
//                for (Name rootLoop : rootLoops) {
//                    loopParents.put(rootLoop, parent);
//                    rootStack.push(rootLoop);
//                }
//            }
//            checkState(set.isEmpty());
//        }

//        if (basics.size() > 3 && basics.size() < 8) {
//        showBasics(function.getName(), basics, true);
//        }

//        cfgStackify(basics);

//        DirectedGraph<Integer, DefaultEdge> graph = new DefaultDirectedGraph<>(DefaultEdge.class);
//        nodeIndices.values().forEach(graph::addVertex);
//        cfg.getEdges().forEach(e -> graph.addEdge(nodeIndices.get(e.getInput()), nodeIndices.get(e.getOutput())));

//        DominatorTree<Integer, DefaultEdge> dt = new DominatorTree<>(graph, 0);
    }

    @Test
    public void testFoo()
            throws Throwable
    {
        String target;
        target = "sqlite3VdbeExec";
//        target = "yy_reduce";
        target = "sqlite3VXPrintf";
//        target = "sqlite3Error";
//        target = "sqlite3WalCheckpoint";
//        target = "sqlite3StatusAdd";
//        target = "sqlite3_compileoption_used";

        Module module;
        Element root = (new Parser(Input.ofResource("new/sqlite3.wast"))).parse();
        YModule ymodule = new ModuleFactory(root).create();
        module = UnitTranslation.translateModule(Name.of("HelloWorld"), ymodule);

        doFunction(module.getFunctions().get(Name.of(target)));
//        module.getFunctions().values().forEach(propagatingConsumer(TestWhatever::doFunction));
    }
}
