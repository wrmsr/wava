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
import com.wrmsr.wava.core.unit.Module;
import com.wrmsr.wava.java.lang.JAccess;
import com.wrmsr.wava.java.lang.JArg;
import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.JTypeSpecifier;
import com.wrmsr.wava.java.lang.tree.declaration.JConstructor;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclarationBlock;
import com.wrmsr.wava.java.lang.tree.declaration.JField;
import com.wrmsr.wava.java.lang.tree.declaration.JMethod;
import com.wrmsr.wava.java.lang.tree.declaration.JType;
import com.wrmsr.wava.java.lang.tree.expression.JAssignment;
import com.wrmsr.wava.java.lang.tree.expression.JIdent;
import com.wrmsr.wava.java.lang.tree.expression.JMethodInvocation;
import com.wrmsr.wava.java.lang.tree.expression.JMethodReference;
import com.wrmsr.wava.java.lang.tree.statement.JBlock;
import com.wrmsr.wava.java.lang.tree.statement.JExpressionStatement;
import com.wrmsr.wava.java.lang.tree.statement.JStatement;
import com.wrmsr.wava.util.NameMangler;

import javax.inject.Inject;

import java.util.List;
import java.util.Optional;

import static com.google.common.collect.Sets.immutableEnumSet;
import static com.wrmsr.wava.util.Itertools.enumerate;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;

public final class ImportsCompilerImpl
        implements ModuleCompilationParticipant
{
    private final Module module;

    @Inject
    public ImportsCompilerImpl(Module module)
    {
        this.module = module;
    }

    @Override
    public List<JDeclaration> createInterfaceDeclarations()
    {
        JType stubType = new JType(
                immutableEnumSet(JAccess.PUBLIC),
                JType.Kind.INTERFACE,
                JName.of("Stub"),
                ImmutableList.of(),
                module.getImports().values().stream().map(i -> new JMethod(
                        ImmutableSet.of(),
                        JTypeSpecifier.of(i.getSignature().getResult().getPrimitive().getSimpleName()),
                        JName.of(i.getName().get()),
                        enumerate(i.getSignature().getArguments().stream()).map(a -> new JArg(
                                JTypeSpecifier.of(a.getItem().getPrimitive().getName()),
                                JName.of("arg" + a.getIndex()))
                        ).collect(toImmutableList()),
                        Optional.empty())
                ).collect(toImmutableList()));

        return ImmutableList.of(
                new JType(
                        immutableEnumSet(JAccess.PUBLIC, JAccess.STATIC, JAccess.FINAL),
                        JType.Kind.CLASS,
                        JName.of("Imports"),
                        ImmutableList.of(),
                        ImmutableList.of(
                                stubType,
                                new JDeclarationBlock(
                                        module.getImports().values().stream().map(i ->
                                                new JField(
                                                        immutableEnumSet(JAccess.PUBLIC),
                                                        JTypeSpecifier.of(JQualifiedName.of(i.getSignature().getChars().toUpperCase())),
                                                        JName.of(NameMangler.DEFAULT.mangleName(i.getName().get())),
                                                        Optional.empty()
                                                )).collect(toImmutableList())),

                                new JConstructor(
                                        immutableEnumSet(JAccess.PUBLIC),
                                        JName.of("Imports"),
                                        ImmutableList.of(),
                                        new JBlock(
                                                ImmutableList.of())),

                                new JConstructor(
                                        immutableEnumSet(JAccess.PUBLIC),
                                        JName.of("Imports"),
                                        ImmutableList.of(
                                                new JArg(
                                                        JTypeSpecifier.of("Stub"),
                                                        JName.of("stub"))),
                                        new JBlock(
                                                module.getImports().values().stream().map(i -> new JExpressionStatement(
                                                        JAssignment.of(
                                                                JQualifiedName.of("this", NameMangler.DEFAULT.mangleName(i.getName().get())),
                                                                new JMethodReference(
                                                                        JQualifiedName.of("stub"),
                                                                        JName.of(NameMangler.DEFAULT.mangleName(i.getName().get())))))
                                                ).collect(toImmutableList()))),

                                new JConstructor(
                                        immutableEnumSet(JAccess.PUBLIC),
                                        JName.of("Imports"),
                                        module.getImports().values().stream().map(i -> new JArg(JTypeSpecifier.of(
                                                i.getSignature().getChars().toUpperCase()),
                                                JName.of(NameMangler.DEFAULT.mangleName(i.getName().get())))
                                        ).collect(toImmutableList()),
                                        new JBlock(
                                                module.getImports().values().stream().map(i -> new JExpressionStatement(
                                                        JAssignment.of(
                                                                JQualifiedName.of("this", NameMangler.DEFAULT.mangleName(i.getName().get())),
                                                                new JIdent(
                                                                        JQualifiedName.of(NameMangler.DEFAULT.mangleName(i.getName().get())))
                                                        )))
                                                        .collect(toImmutableList()))))),

                new JDeclarationBlock(
                        module.getImports().values().stream().map(i ->
                                new JField(
                                        immutableEnumSet(JAccess.PROTECTED, JAccess.FINAL),
                                        JTypeSpecifier.of(JQualifiedName.of(i.getSignature().getChars().toUpperCase())),
                                        JName.of(NameMangler.DEFAULT.mangleName(i.getName().get())),
                                        Optional.empty()
                                )).collect(toImmutableList())));
    }

    @Override
    public List<JArg> createCtorArgs()
    {
        return ImmutableList.of(
                new JArg(
                        JTypeSpecifier.of("Imports"),
                        JName.of("imports")));
    }

    @Override
    public List<JStatement> createCtorStatements()
    {
        return module.getImports().values().stream().map(i -> new JExpressionStatement(
                JAssignment.of(
                        JQualifiedName.of("this", NameMangler.DEFAULT.mangleName(i.getName().get())),
                        JMethodInvocation.of(
                                JQualifiedName.parse("java.util.Objects.requireNonNull"),
                                ImmutableList.of(
                                        new JIdent(
                                                JQualifiedName.of("imports", NameMangler.DEFAULT.mangleName(i.getName().get()))
                                        ))))))
                .collect(toImmutableList());
    }
}
