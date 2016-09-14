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
package com.wrmsr.wava.compile.module;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.wrmsr.wava.compile.function.FunctionCompiler;
import com.wrmsr.wava.core.unit.Function;
import com.wrmsr.wava.core.unit.Module;
import com.wrmsr.wava.java.lang.JAccess;
import com.wrmsr.wava.java.lang.JArg;
import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.compilationUnit.JCompilationUnit;
import com.wrmsr.wava.java.lang.compilationUnit.JPackageSpec;
import com.wrmsr.wava.java.lang.tree.JInheritance;
import com.wrmsr.wava.java.lang.tree.declaration.JAnnotatedDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JConstructor;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JMethod;
import com.wrmsr.wava.java.lang.tree.declaration.JType;
import com.wrmsr.wava.java.lang.tree.expression.JIdent;
import com.wrmsr.wava.java.lang.tree.expression.JMethodInvocation;
import com.wrmsr.wava.java.lang.tree.statement.JBlank;
import com.wrmsr.wava.java.lang.tree.statement.JBlock;
import com.wrmsr.wava.java.lang.tree.statement.JExpressionStatement;
import com.wrmsr.wava.java.lang.tree.statement.JStatement;
import com.wrmsr.wava.util.Itertools;

import javax.inject.Inject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static com.google.common.collect.Iterables.partition;
import static com.google.common.collect.Sets.immutableEnumSet;
import static com.wrmsr.wava.compile.Compilation.PRIMITIVE_TYPE_MAP;
import static com.wrmsr.wava.compile.Compilation.compileArgs;
import static com.wrmsr.wava.java.lang.tree.JTrees.jblockify;
import static com.wrmsr.wava.util.Itertools.enumerate;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static java.util.Objects.requireNonNull;

public final class MultiModuleCompilerImpl
        implements ModuleCompiler
{
    private final Set<ModuleCompilationParticipant> compilationParticipants;
    private final FunctionCompiler functionCompiler;
    private final ModuleCompilerConfig moduleCompilerConfig;
    private final MultiModuleCompilerConfig multiModuleCompilerConfig;

    @Inject
    public MultiModuleCompilerImpl(
            Set<ModuleCompilationParticipant> compilationParticipants,
            FunctionCompiler functionCompiler,
            ModuleCompilerConfig moduleCompilerConfig,
            MultiModuleCompilerConfig multiModuleCompilerConfig)
    {
        this.compilationParticipants = ImmutableSet.copyOf(compilationParticipants);
        this.functionCompiler = requireNonNull(functionCompiler);
        this.moduleCompilerConfig = requireNonNull(moduleCompilerConfig);
        this.multiModuleCompilerConfig = requireNonNull(multiModuleCompilerConfig);
    }

    @Override
    public List<JCompilationUnit> compileModule(Module module)
    {
        Optional<JQualifiedName> packageName = Optional.ofNullable(moduleCompilerConfig.getPackageName()).map(JQualifiedName::parse);
        int numFunctionsPerFile = multiModuleCompilerConfig.getNumFunctionsPerClass();

        List<JArg> ctorArgs = compilationParticipants.stream()
                .map(ModuleCompilationParticipant::createCtorArgs)
                .flatMap(List::stream)
                .collect(toImmutableList());

        ImmutableList.Builder<JCompilationUnit> compilationUnits = ImmutableList.builder();

        int depth = 0;
        for (Itertools.EnumeratedElement<List<Function>> chunk : enumerate(partition(module.getFunctions().values(), numFunctionsPerFile))) {
            JName chunkName = JName.of(module.getName().get() + "$" + (chunk.getIndex() + 1));
            ImmutableList.Builder<JDeclaration> functionDeclarations = ImmutableList.builder();

            functionDeclarations.add(
                    new JConstructor(
                            immutableEnumSet(JAccess.PROTECTED),
                            chunkName,
                            ctorArgs,
                            jblockify(
                                    new JExpressionStatement(
                                            JMethodInvocation.of(
                                                    JQualifiedName.of("super"),
                                                    ctorArgs.stream()
                                                            .map(a -> new JIdent(
                                                                    JQualifiedName.of(a.getName())))
                                                            .collect(toImmutableList()))))));

            for (Function function : chunk.getItem()) {
                functionDeclarations.addAll(
                        functionCompiler.compileFunction(function).stream()
                                .map(method -> new JAnnotatedDeclaration(
                                        JQualifiedName.parse("java.lang.Override"),
                                        Optional.empty(),
                                        method))
                                .collect(toImmutableList()));
            }

            compilationUnits.add(
                    new JCompilationUnit(
                            packageName.map(JPackageSpec::new),
                            ImmutableSet.of(),
                            new JType(
                                    immutableEnumSet(JAccess.ABSTRACT),
                                    JType.Kind.CLASS,
                                    chunkName,
                                    ImmutableList.of(
                                            new JInheritance(
                                                    JInheritance.Kind.EXTENDS,
                                                    JQualifiedName.of(module.getName().get() + "$" + (chunk.getIndex())))),
                                    functionDeclarations.build())));

            ++depth;
        }

        List<JDeclaration> rootDeclarations = new ArrayList<>();

        List<JDeclaration> interfaceDeclarations = compilationParticipants.stream()
                .map(ModuleCompilationParticipant::createInterfaceDeclarations)
                .flatMap(List::stream)
                .collect(toImmutableList());
        rootDeclarations.addAll(interfaceDeclarations);

        compilationParticipants.forEach(cp -> rootDeclarations.addAll(cp.createPreCtorDeclarations()));

        List<JStatement> ctor = new ArrayList<>();
        enumerate(compilationParticipants.stream()
                .map(ModuleCompilationParticipant::createCtorStatements)
                .filter(l -> !l.isEmpty())
        ).forEach(e -> {
            if (e.getIndex() > 0) {
                ctor.add(JBlank.INSTANCE);
            }
            ctor.addAll(e.getItem());
        });

        rootDeclarations.add(
                new JConstructor(
                        immutableEnumSet(JAccess.PUBLIC),
                        JName.of(module.getName().get() + "$0"),
                        ctorArgs,
                        new JBlock(ctor)));

        compilationParticipants.forEach(cp -> rootDeclarations.addAll(cp.createPostCtorDeclarations()));

        for (Function function : module.getFunctions().values()) {
            rootDeclarations.add(
                    new JMethod(
                            immutableEnumSet(JAccess.PUBLIC, JAccess.ABSTRACT),
                            PRIMITIVE_TYPE_MAP.get(function.getResult()),
                            JName.of(function.getName().get()),
                            compileArgs(function),
                            Optional.empty()));
        }

        compilationUnits.add(
                new JCompilationUnit(
                        packageName.map(JPackageSpec::new),
                        ImmutableSet.of(),
                        new JType(
                                immutableEnumSet(JAccess.ABSTRACT),
                                JType.Kind.CLASS,
                                JName.of(module.getName().get() + "$0"),
                                ImmutableList.of(),
                                rootDeclarations)));

        compilationUnits.add(
                new JCompilationUnit(
                        packageName.map(JPackageSpec::new),
                        ImmutableSet.of(),
                        new JType(
                                immutableEnumSet(JAccess.PUBLIC, JAccess.FINAL),
                                JType.Kind.CLASS,
                                JName.of(module.getName().get()),
                                ImmutableList.of(
                                        new JInheritance(
                                                JInheritance.Kind.EXTENDS,
                                                JQualifiedName.of(module.getName().get() + "$" + depth))),
                                ImmutableList.<JDeclaration>builder()
                                        .add(
                                                new JConstructor(
                                                        immutableEnumSet(JAccess.PUBLIC),
                                                        JName.of(module.getName().get()),
                                                        ctorArgs,
                                                        jblockify(
                                                                new JExpressionStatement(
                                                                        JMethodInvocation.of(
                                                                                JQualifiedName.of("super"),
                                                                                ctorArgs.stream()
                                                                                        .map(a -> new JIdent(
                                                                                                JQualifiedName.of(a.getName())))
                                                                                        .collect(toImmutableList()))))))
                                        .build())));

        return compilationUnits.build();
    }
}
