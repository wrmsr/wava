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
import com.google.common.collect.Sets;
import com.squareup.javapoet.CodeBlock;
import com.wrmsr.wava.analyze.Analyses;
import com.wrmsr.wava.analyze.ControlTransferAnalysis;
import com.wrmsr.wava.analyze.LocalAnalysis;
import com.wrmsr.wava.analyze.ValueTypeAnalysis;
import com.wrmsr.wava.compile.binary.BinaryCompilation;
import com.wrmsr.wava.compile.const_.ConstCompilation;
import com.wrmsr.wava.compile.function.FunctionAccess;
import com.wrmsr.wava.compile.function.FunctionCompilerImpl;
import com.wrmsr.wava.compile.unary.UnaryCompilation;
import com.wrmsr.wava.core.node.Block;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Nop;
import com.wrmsr.wava.core.node.Return;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.unit.Function;
import com.wrmsr.wava.core.unit.Local;
import com.wrmsr.wava.core.unit.Locals;
import com.wrmsr.wava.core.unit.Module;
import com.wrmsr.wava.java.lang.JAccess;
import com.wrmsr.wava.java.lang.JArg;
import com.wrmsr.wava.java.lang.JArray;
import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.JRenderer;
import com.wrmsr.wava.java.lang.JTypeSpecifier;
import com.wrmsr.wava.java.lang.compilationUnit.JCompilationUnit;
import com.wrmsr.wava.java.lang.compilationUnit.JPackageSpec;
import com.wrmsr.wava.java.lang.tree.JInheritance;
import com.wrmsr.wava.java.lang.tree.declaration.JConstructor;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JField;
import com.wrmsr.wava.java.lang.tree.declaration.JMethod;
import com.wrmsr.wava.java.lang.tree.declaration.JType;
import com.wrmsr.wava.java.lang.tree.expression.JLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JNewArray;
import com.wrmsr.wava.java.lang.tree.statement.JBlank;
import com.wrmsr.wava.java.lang.tree.statement.JBlock;
import com.wrmsr.wava.java.lang.tree.statement.JStatement;
import com.wrmsr.wava.transform.Transforms;
import com.wrmsr.wava.transform.statementizer.StatementizerTransform;
import com.wrmsr.wava.util.NameGenerator;
import com.wrmsr.wava.util.NameMangler;
import com.wrmsr.wava.util.temps.TempManager;
import com.wrmsr.wava.yen.global.YModule;
import com.wrmsr.wava.yen.parser.ModuleFactory;
import com.wrmsr.wava.yen.parser.Parser;
import com.wrmsr.wava.yen.parser.element.Element;
import com.wrmsr.wava.yen.parser.input.Input;
import com.wrmsr.wava.yen.translation.UnitTranslation;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static com.google.common.collect.Sets.immutableEnumSet;
import static com.wrmsr.wava.transform.Transforms.remapLocals;
import static com.wrmsr.wava.util.Itertools.enumerate;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableMap;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableSet;

public class TestCompilation
{
    @Test
    public void testMusl()
            throws Exception
    {
        Module module;
        {
            Element root = (new Parser(Input.ofResource("new/sqlite3.wast"))).parse();
            YModule ymodule = new ModuleFactory(root).create();
            module = UnitTranslation.translateModule(Name.of("HelloWorld"), ymodule);
        }

        List<JDeclaration> declarations = new ArrayList<>();

        declarations.add(
                new JType(
                        immutableEnumSet(JAccess.PUBLIC, JAccess.STATIC, JAccess.FINAL),
                        JType.Kind.CLASS,
                        JName.of("UnreachableException"),
                        ImmutableList.of(
                                new JInheritance(
                                        JInheritance.Kind.EXTENDS,
                                        JQualifiedName.of("java", "lang", "RuntimeException"))),
                        ImmutableList.of()));

        declarations.addAll(CompilationUtils.createSignatureDeclarations(module));

        declarations.add(
                new JField(
                        immutableEnumSet(JAccess.PRIVATE, JAccess.FINAL),
                        new JTypeSpecifier(
                                JQualifiedName.of("long"),
                                ImmutableList.of(JArray.EMPTY)),
                        JName.of("_spill"),
                        Optional.of(
                                new JNewArray(
                                        new JTypeSpecifier(
                                                JQualifiedName.of("long"),
                                                ImmutableList.of(
                                                        new JArray(
                                                                new JLiteral(64)))),
                                        Optional.empty()))));

        CompilationUtils.ImportsCompiler importsCompiler = new CompilationUtils.ImportsCompiler(module);
        declarations.addAll(importsCompiler.createDeclarations());
        CompilationUtils.TableCompiler tableCompiler = new CompilationUtils.TableCompiler(module);
        declarations.addAll(tableCompiler.createDeclarations());

        CompilationUtils.MemoryCompiler memoryCompiler = new CompilationUtils.MemoryCompiler(module);
        declarations.addAll(memoryCompiler.createPreCtorDeclarations());

        List<JStatement> ctor = new ArrayList<>();
        ctor.addAll(importsCompiler.createCtor());
        ctor.add(JBlank.INSTANCE);
        ctor.addAll(memoryCompiler.createCtor());

        declarations.add(
                new JConstructor(
                        immutableEnumSet(JAccess.PUBLIC),
                        JName.of("HelloWorld"),
                        ImmutableList.of(
                                new JArg(
                                        JTypeSpecifier.of("Imports"),
                                        JName.of("imports"))),
                        new JBlock(ctor)));

        declarations.addAll(memoryCompiler.createPostCtorDeclarations());

        for (Function function : module.getFunctions().values()) {
            String onlyName = null;

            onlyName = "sqlite3VdbeExec";

            if (onlyName != null && !(function.getName().equals(Name.of(onlyName)))) {
                continue;
            }

            declarations.addAll(compileFunction(function));
        }

        Path outputFile = Paths.get("tmp/HelloWorld.java");
        Files.write(outputFile, new byte[0]);

        JType cls = new JType(
                immutableEnumSet(JAccess.PUBLIC, JAccess.FINAL),
                JType.Kind.CLASS,
                JName.of("HelloWorld"),
                ImmutableList.of(),
                declarations);

        JCompilationUnit sourceFile = new JCompilationUnit(
                new JPackageSpec(
                        JQualifiedName.of("com", "wrmsr", "wava")),
                ImmutableSet.of(),
                cls);

        CodeBlock.Builder code = CodeBlock.builder();
        new JRenderer(code).renderCompilationUnit(sourceFile);
        CodeBlock block = code.build();

        String str = JRenderer.renderWithIndent(block, "    ");

        Files.write(outputFile, str.getBytes(), StandardOpenOption.APPEND);
    }

    public static Function processFunction(Function function)
            throws Exception
    {
        return processFunction(function, NameMangler.DEFAULT, NameMangler.INVERSE, NameMangler.INVERSE);
    }

    public static Function processFunction(Function function, NameMangler callMangler, NameMangler labelMangler, NameMangler localMangler)
            throws Exception
    {
        Node body = function.getBody();

        body = Transforms.mangleCallNames(body, callMangler::mangleName);
        body = Transforms.mangleLabelNames(body, labelMangler::mangleName);
        body = Transforms.squishBlocks(body);
        body = Transforms.uniquifyLabels(body, new NameGenerator(Analyses.getNames(body), "_dupe$"));

        Analyses.checkLocalTypes(body, function.getLocals().getList().stream().map(l -> ImmutablePair.of(l.getIndex(), l.getType())).collect(toImmutableMap()));

        ControlTransferAnalysis cfa = ControlTransferAnalysis.analyze(body);
        ValueTypeAnalysis vta = ValueTypeAnalysis.analyze(body, false);

        if (cfa.get(body).getExecution() == ControlTransferAnalysis.Execution.FALLTHROUGH) {
            if (function.getSignature().getResult().isConcrete()) {
                body = new Return(body);
            }
            else {
                body = new Block(
                        ImmutableList.of(
                                body,
                                new Return(
                                        new Nop())));
            }
            cfa = ControlTransferAnalysis.analyze(body);
            vta = ValueTypeAnalysis.analyze(body, false);
        }

        body = Transforms.eliminateUnreferencedLabels(body, Analyses.getReferencedNames(body));
        body = Transforms.squishBlocks(body);

        cfa = ControlTransferAnalysis.analyze(body);
        vta = ValueTypeAnalysis.analyze(body, false);

        TempManager tm = new TempManager(
                new NameGenerator(
                        function.getLocals().getList().stream().map(Local::getName).collect(toImmutableSet()),
                        "_temp$"),
                Index.of(function.getLocals().getList().size()),
                false);
        body = new StatementizerTransform(cfa, vta, tm).transformFunctionBody(body);

        body = Transforms.eliminateUnreferencedLabels(body, Analyses.getReferencedNames(body));
        body = Transforms.squishBlocks(body);

        body = Transforms.eliminateUnreachable(body, ControlTransferAnalysis.analyze(body));
        body = Transforms.squishBlocks(body);

        Locals locals = new Locals(
                Stream.concat(
                        function.getLocals().getList().stream()
                                .map(l -> new Local(localMangler.mangleName(l.getName()), l.getIndex(), l.getType())),
                        tm.getTempList().stream()
                                .map(t -> new Local(t.getName(), t.getIndex(), t.getType()))
                ).collect(toImmutableList()));

        function = new Function(
                callMangler.mangleName(function.getName()),
                function.getResult(),
                function.getArgCount(),
                locals,
                body);
        return function;
    }

    public static List<JDeclaration> jcompileFunction(Function function)
    {
        JMethod method = new FunctionCompilerImpl(
                new FunctionAccess(immutableEnumSet(JAccess.PUBLIC, JAccess.FINAL)),
                BinaryCompilation::compileBinary,
                CompilationUtils.CALL_COMPILER,
                CompilationUtils.CALL_INDIRECT_COMPILER,
                ConstCompilation::compileConst,
                CompilationUtils.LOAD_STORE_COMPILER,
                UnaryCompilation::compileUnary
        ).compileFunction(function);
        return ImmutableList.of(method);
    }

    public static Function eliminateUnreferencedLocals(Function function)
    {
        LocalAnalysis.Entry la = LocalAnalysis.analyze(function.getBody()).get(function.getBody());
        List<Index> indices = new ArrayList<>(Sets.union(la.getLocalGets(), la.getLocalPuts()));
        Collections.sort(indices);
        Locals locals = Locals.of(function.getLocals().getList().stream()
                .filter(l -> indices.contains(l.getIndex()))
                .map(l -> ImmutablePair.of(l.getName(), l.getType()))
                .collect(toImmutableList()));
        Map<Index, Index> indexMap = enumerate(indices.stream()).collect(toImmutableMap(i -> i.getItem(), i -> Index.of(i.getIndex())));
        return new Function(
                function.getName(),
                function.getResult(),
                function.getArgCount(),
                locals,
                remapLocals(function.getBody(), indexMap));
    }

    public static List<JDeclaration> compileFunction(Function function)
            throws Exception
    {
        ImmutableList.Builder<JDeclaration> decls = ImmutableList.builder();

        if (function.getName().equals(Name.of("_sqlite3VdbeExec"))) {
            function = processFunction(function);
            Pair<Function, Function> of = null;
            Function f;
            for (int i = 0; i < 50; i++) {
                of = TestOutlining.inlineThatOneSwitch(function, i);
                f = processFunction(of.getRight(), NameMangler.NOP, NameMangler.NOP, NameMangler.NOP);
                decls.addAll(jcompileFunction(f));
                function = of.getLeft();
            }

            f = eliminateUnreferencedLocals(processFunction(of.getLeft(), NameMangler.NOP, NameMangler.NOP, NameMangler.NOP));
            decls.addAll(jcompileFunction(f));
        }
        else {
            function = processFunction(function);
            decls.addAll(jcompileFunction(function));
        }

        return decls.build();
    }
}
