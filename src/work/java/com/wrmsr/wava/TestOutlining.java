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

import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.analyze.Analyses;
import com.wrmsr.wava.analyze.ControlTransferAnalysis;
import com.wrmsr.wava.analyze.LocalAnalysis;
import com.wrmsr.wava.analyze.ValueTypeAnalysis;
import com.wrmsr.wava.compile.binary.BinaryCompilerImpl;
import com.wrmsr.wava.compile.call.CallCompilerImpl;
import com.wrmsr.wava.compile.call.CallIndirectCompilerImpl;
import com.wrmsr.wava.compile.const_.ConstCompilerImpl;
import com.wrmsr.wava.compile.function.FunctionAccess;
import com.wrmsr.wava.compile.function.FunctionCompilerImpl;
import com.wrmsr.wava.compile.memory.LoadStoreCompilerImpl;
import com.wrmsr.wava.compile.unary.UnaryCompilerImpl;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Switch;
import com.wrmsr.wava.core.node.visitor.Visitor;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.core.unit.Function;
import com.wrmsr.wava.core.unit.Local;
import com.wrmsr.wava.core.unit.Locals;
import com.wrmsr.wava.driver.StandardFunctionProcessor;
import com.wrmsr.wava.java.lang.JAccess;
import com.wrmsr.wava.java.lang.JRenderer;
import com.wrmsr.wava.java.lang.tree.declaration.JMethod;
import com.wrmsr.wava.java.poet.CodeBlock;
import com.wrmsr.wava.transform.Outlining;
import com.wrmsr.wava.transform.Transforms;
import com.wrmsr.wava.util.Json;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.google.common.collect.Iterables.getOnlyElement;
import static com.google.common.collect.Sets.immutableEnumSet;

public class TestOutlining
{
    @Test
    public void testOutlining()
            throws Throwable
    {
        Path outputFile = Paths.get("tmp/post.json");
        Function function = Json.OBJECT_MAPPER_SUPPLIER.get().readValue(Files.readAllBytes(outputFile), Function.class);
        Node body = function.getBody();

        LocalAnalysis loa = LocalAnalysis.analyze(body);
        ControlTransferAnalysis cfa = ControlTransferAnalysis.analyze(body);
        ValueTypeAnalysis vta = ValueTypeAnalysis.analyze(body, false);

        Map<Node, Optional<Node>> parentsByNode = Analyses.getParents(body);
        Map<Node, Integer> totalChildrenByNode = Analyses.getChildCounts(body);
        Map<Name, Node> nodesByName = Analyses.getNamedNodes(body);

        Node maxNode = body;
        int maxDiff = 0;

        Node cur = body;
        while (true) {
            System.out.println(String.format("%s -> %d (%d)", cur, totalChildrenByNode.get(cur), cur.getChildren().size()));
            Optional<Node> maxChild = cur.getChildren().stream().max((l, r) -> Integer.compare(totalChildrenByNode.get(l), totalChildrenByNode.get(r)));
            if (!maxChild.isPresent()) {
                break;
            }
            int diff = totalChildrenByNode.get(cur) - totalChildrenByNode.get(maxChild.get());
            if (diff > maxDiff) {
                maxNode = cur;
                maxDiff = diff;
            }
            cur = maxChild.get();
        }

        System.out.println();
        System.out.println(maxNode);

        System.out.println();
        List<Node> alsdfj = new ArrayList<>(maxNode.getChildren());
        Collections.sort(alsdfj, (l, r) -> -Integer.compare(totalChildrenByNode.get(l), totalChildrenByNode.get(r)));
        for (Node child : alsdfj) {
            System.out.println(String.format("%s -> %d", child, totalChildrenByNode.get(child)));
        }
        System.out.println();

        Index externalRetControl = Index.of(function.getLocals().getList().size());
        Index externalRetValue = Index.of(function.getLocals().getList().size() + 1);
        List<Local> localList = ImmutableList.<Local>builder()
                .addAll(function.getLocals().getList())
                .add(
                        new Local(
                                Name.of("_external$control"),
                                externalRetControl,
                                Type.I32))
                .add(
                        new Local(
                                Name.of("_external$value"),
                                externalRetValue,
                                Type.I64))
                .build();

        maxNode.accept(new Visitor<Void, Void>()
        {
            @Override
            protected Void visitNode(Node node, Void context)
            {
                Outlining.OutlinedFunction of = Outlining.outlineFunction(
                        function,
                        node,
                        Name.of("outlined"),
                        externalRetControl,
                        externalRetValue,
                        loa,
                        cfa,
                        vta,
                        parentsByNode,
                        nodesByName);

                try {
                    compileFunction(of.getFunction());
                }
                catch (Throwable e) {
                    throw Throwables.propagate(e);
                }

                return null;
            }

            @Override
            public Void visitSwitch(Switch node, Void context)
            {
                Optional<Switch.Entry> maxEntry = node.getEntries().stream().max((l, r) -> Integer.compare(totalChildrenByNode.get(l.getBody()), totalChildrenByNode.get(r.getBody())));
                Node maxNode = maxEntry.get().getBody();

                Outlining.OutlinedFunction of = Outlining.outlineFunction(
                        function,
                        maxNode,
                        Name.of("outlined"),
                        externalRetControl,
                        externalRetValue,
                        loa,
                        cfa,
                        vta,
                        parentsByNode,
                        nodesByName);

                try {
                    compileFunction(of.getFunction());
                }
                catch (Throwable e) {
                    throw Throwables.propagate(e);
                }

                Function newFunc = new Function(
                        function.getName(),
                        function.getResult(),
                        function.getArgCount(),
                        new Locals(localList),
                        Transforms.replaceNode(function.getBody(), maxNode, of.getCallsite(), true));

                System.out.println();
                try {
                    compileFunction(newFunc);
                }
                catch (Throwable e) {
                    throw Throwables.propagate(e);
                }

//                Map<Index, Index> localTranslation

//                new Function(
//                        Name.of("laksdjflkad"),
//                        Type.I32,
//
//                        )

                /*
                TODO:
                 - FALLTHROUGH analysis
                 - local index translation
                 - spills in/out
                 - breaks as return codes (!! with break values), and returns as return codes
                  - I64 retval cell

                NEXT:
                 - vta for non switch-cases, with inline value returns if no breaks
                 - pre-alloc cells? would need to kid-glove return temp loading
                 - sp based retvals (setjmp/exceptions gon fuck my day up?)
                  - oh fuck. shadowstack? :/
                   - NO, no this is doable. pushed ONLY immediately before ret, popped ALWAYS immediately after ret, stack remains same during execution
                */

//                TempManager tm = new TempManager(
//                        new NameGenerator(
//                                function.getLocals().getLocals().stream().map(Local::getName).collect(toImmutableSet()),
//                                "_temp$"),
//                        Index.of(function.getLocals().getLocals().size()),
//                        false);
//
//                Locals locals = new Locals(Stream.concat(function.getLocals().getLocals().stream(), tm.getTempList().stream().map(t -> new Local(t.getName(), t.getIndex(), t.getType()))).collect(toImmutableList()));
//                function = new Function(
//                        NameMangler.DEFAULT.mangleName(function.getName()),
//                        function.getResult(),
//                        function.getArgCount(),
//                        locals,
//                        body);

                return null;
            }
        }, null);
    }

    private static void compileFunction(Function function)
            throws Throwable
    {
        function = new StandardFunctionProcessor().processFunction(function);
        JMethod method = getOnlyElement(new FunctionCompilerImpl(
                new FunctionAccess(immutableEnumSet(JAccess.PUBLIC, JAccess.FINAL)),
                new BinaryCompilerImpl(),
                new CallCompilerImpl(),
                new CallIndirectCompilerImpl(),
                new ConstCompilerImpl(),
                new LoadStoreCompilerImpl(),
                new UnaryCompilerImpl()
        ).compileFunction(function));

        CodeBlock.Builder code = CodeBlock.builder();
        new JRenderer(code).renderDeclaration(method);
        CodeBlock block = code.build();

        String str = JRenderer.renderWithIndent(block, "    ");
        System.out.println(str);
    }

    public static Pair<Function, Function> inlineThatOneSwitch(Function function, int num)
    {
        Node body = function.getBody();

        LocalAnalysis loa = LocalAnalysis.analyze(body);
        ControlTransferAnalysis cfa = ControlTransferAnalysis.analyze(body);
        ValueTypeAnalysis vta = ValueTypeAnalysis.analyze(body, false);

        Map<Node, Optional<Node>> parentsByNode = Analyses.getParents(body);
        Map<Node, Integer> totalChildrenByNode = Analyses.getChildCounts(body);
        Map<Name, Node> nodesByName = Analyses.getNamedNodes(body);

        Node maxNode = body;
        int maxDiff = 0;

        Node cur = body;
        while (true) {
            Optional<Node> maxChild = cur.getChildren().stream().max((l, r) -> Integer.compare(totalChildrenByNode.get(l), totalChildrenByNode.get(r)));
            if (!maxChild.isPresent()) {
                break;
            }
            int diff = totalChildrenByNode.get(cur) - totalChildrenByNode.get(maxChild.get());
            if (diff > maxDiff) {
                maxNode = cur;
                maxDiff = diff;
            }
            cur = maxChild.get();
        }

        List<Node> alsdfj = new ArrayList<>(maxNode.getChildren());
        Collections.sort(alsdfj, (l, r) -> -Integer.compare(totalChildrenByNode.get(l), totalChildrenByNode.get(r)));

        Index externalRetControl;
        Index externalRetValue;
        List<Local> localList;

        if (function.getLocals().getLocalsByName().containsKey(Name.of("_external$control"))) {
            externalRetControl = function.getLocals().getLocal(Name.of("_external$control")).getIndex();
            externalRetValue = function.getLocals().getLocal(Name.of("_external$value")).getIndex();
            localList = function.getLocals().getList();
        }
        else {
            externalRetControl = Index.of(function.getLocals().getList().size());
            externalRetValue = Index.of(function.getLocals().getList().size() + 1);
            localList = ImmutableList.<Local>builder()
                    .addAll(function.getLocals().getList())
                    .add(
                            new Local(
                                    Name.of("_external$control"),
                                    externalRetControl,
                                    Type.I32))
                    .add(
                            new Local(
                                    Name.of("_external$value"),
                                    externalRetValue,
                                    Type.I64))
                    .build();
        }

        Node node = maxNode;
        if (maxNode instanceof Switch) {
            Switch switchNode = (Switch) node;
            Optional<Switch.Entry> maxEntry = switchNode.getEntries().stream().max((l, r) -> Integer.compare(totalChildrenByNode.get(l.getBody()), totalChildrenByNode.get(r.getBody())));
            node = maxEntry.get().getBody();
        }

        Outlining.OutlinedFunction of = Outlining.outlineFunction(
                function,
                node,
                Name.of(function.getName().get() + "$outlined$" + num),
                externalRetControl,
                externalRetValue,
                loa,
                cfa,
                vta,
                parentsByNode,
                nodesByName);

        Function newFunc = new Function(
                function.getName(),
                function.getResult(),
                function.getArgCount(),
                new Locals(localList),
                Transforms.replaceNode(function.getBody(), node, of.getCallsite(), true));

        return ImmutablePair.of(newFunc, of.getFunction());
    }
}
