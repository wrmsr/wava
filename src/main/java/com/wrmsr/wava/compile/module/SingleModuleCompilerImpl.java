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
import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.compilationUnit.JCompilationUnit;
import com.wrmsr.wava.java.lang.compilationUnit.JPackageSpec;
import com.wrmsr.wava.java.lang.tree.declaration.JConstructor;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JType;
import com.wrmsr.wava.java.lang.tree.statement.JBlank;
import com.wrmsr.wava.java.lang.tree.statement.JBlock;
import com.wrmsr.wava.java.lang.tree.statement.JStatement;

import javax.inject.Inject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static com.google.common.collect.Sets.immutableEnumSet;
import static com.wrmsr.wava.util.Itertools.enumerate;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static java.util.Objects.requireNonNull;

public final class SingleModuleCompilerImpl
        implements ModuleCompiler
{
    private final Set<ModuleCompilationParticipant> compilationParticipants;
    private final FunctionCompiler functionCompiler;
    private final ModuleCompilerConfig moduleCompilerConfig;

    @Inject
    public SingleModuleCompilerImpl(
            Set<ModuleCompilationParticipant> compilationParticipants,
            FunctionCompiler functionCompiler,
            ModuleCompilerConfig moduleCompilerConfig)
    {
        this.compilationParticipants = ImmutableSet.copyOf(compilationParticipants);
        this.functionCompiler = requireNonNull(functionCompiler);
        this.moduleCompilerConfig = requireNonNull(moduleCompilerConfig);
    }

    @Override
    public List<JCompilationUnit> compileModule(Module module)
    {
        Optional<JQualifiedName> packageName = Optional.ofNullable(moduleCompilerConfig.getPackageName()).map(JQualifiedName::parse);

        List<JDeclaration> declarations = new ArrayList<>();

        declarations.addAll(compilationParticipants.stream()
                .map(ModuleCompilationParticipant::createInterfaceDeclarations)
                .flatMap(List::stream)
                .collect(toImmutableList()));

        compilationParticipants.forEach(cp -> declarations.addAll(cp.createPreCtorDeclarations()));

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

        declarations.add(
                new JConstructor(
                        immutableEnumSet(JAccess.PUBLIC),
                        JName.of(module.getName().get()),
                        compilationParticipants.stream()
                                .map(ModuleCompilationParticipant::createCtorArgs)
                                .flatMap(List::stream)
                                .collect(toImmutableList()),
                        new JBlock(ctor)));

        compilationParticipants.forEach(cp -> declarations.addAll(cp.createPostCtorDeclarations()));

        for (Function function : module.getFunctions().values()) {
            declarations.addAll(functionCompiler.compileFunction(function));
        }

        return ImmutableList.of(
                new JCompilationUnit(
                        packageName.map(JPackageSpec::new),
                        ImmutableSet.of(),
                        new JType(
                                immutableEnumSet(JAccess.ABSTRACT),
                                JType.Kind.CLASS,
                                JName.of(module.getName().get()),
                                ImmutableList.of(),
                                declarations)));
    }
}
