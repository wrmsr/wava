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
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Signature;
import com.wrmsr.wava.core.unit.Function;
import com.wrmsr.wava.core.unit.Module;
import com.wrmsr.wava.java.lang.JAccess;
import com.wrmsr.wava.java.lang.JArray;
import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.JTypeSpecifier;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclarationBlock;
import com.wrmsr.wava.java.lang.tree.declaration.JField;
import com.wrmsr.wava.java.lang.tree.declaration.JInitializationBlock;
import com.wrmsr.wava.java.lang.tree.declaration.JMethod;
import com.wrmsr.wava.java.lang.tree.expression.JArrayAccess;
import com.wrmsr.wava.java.lang.tree.expression.JAssignment;
import com.wrmsr.wava.java.lang.tree.expression.JIdent;
import com.wrmsr.wava.java.lang.tree.expression.JLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JLongArrayLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JMethodInvocation;
import com.wrmsr.wava.java.lang.tree.expression.JMethodReference;
import com.wrmsr.wava.java.lang.tree.expression.JNewArray;
import com.wrmsr.wava.java.lang.tree.statement.JBlock;
import com.wrmsr.wava.java.lang.tree.statement.JExpressionStatement;
import com.wrmsr.wava.util.NameMangler;

import javax.inject.Inject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

import static com.google.common.collect.Sets.immutableEnumSet;
import static com.wrmsr.wava.util.Itertools.enumerate;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;

public final class TableCompilerImpl
        implements ModuleCompilationParticipant
{
    private final Module module;

    @Inject
    public TableCompilerImpl(Module module)
    {
        this.module = module;
    }

    @Override
    public List<JDeclaration> createPreCtorDeclarations()
    {
        Map<Signature, List<Function>> tables = module.getTable().getNames().stream().map(module.getFunctions()::get).collect(Collectors.groupingBy(Function::getSignature));
        List<Signature> tableSigs = new ArrayList<>(module.getDeclaredSignatures());
        Collections.sort(tableSigs);

        Map<Name, Integer> indices = new HashMap<>();
        for (Signature s : tables.keySet()) {
            StreamSupport.stream(Spliterators.spliteratorUnknownSize(enumerate(tables.get(s).iterator()), 0), false)
                    .forEach(i -> indices.put(i.getItem().getName(), i.getIndex()));
        }
        List<Integer> tableIndices = module.getTable().getNames().stream().map(indices::get).map(Objects::requireNonNull).collect(toImmutableList());

        ImmutableList.Builder<JDeclaration> declarations = ImmutableList.builder();

        for (Signature s : tableSigs) {
            List<Function> lst = tables.getOrDefault(s, new ArrayList<>());

            JDeclaration fdec = new JField(
                    immutableEnumSet(JAccess.PROTECTED, JAccess.FINAL),
                    new JTypeSpecifier(
                            JQualifiedName.of(s.getChars().toUpperCase()),
                            ImmutableList.of(JArray.EMPTY)),
                    JName.of("_" + s.getChars() + "Table"),
                    Optional.of(
                            new JNewArray(
                                    new JTypeSpecifier(
                                            JQualifiedName.of(s.getChars().toUpperCase()),
                                            ImmutableList.of(
                                                    new JArray(
                                                            new JLiteral(lst.size())))),
                                    Optional.empty())));

            declarations.add(
                    new JDeclarationBlock(
                            ImmutableList.of(fdec)));

            final int step = 1024;
            for (int i = 0; i < lst.size(); i += step) {
                declarations.add(
                        new JMethod(
                                immutableEnumSet(JAccess.PROTECTED, JAccess.FINAL),
                                JTypeSpecifier.of("void"),
                                JName.of("_" + s.getChars() + "Table_init_" + i),
                                ImmutableList.of(),
                                Optional.of(
                                        new JBlock(
                                                IntStream.range(i, Math.min(lst.size(), i + step)).boxed()
                                                        .map(j ->
                                                                new JExpressionStatement(
                                                                        new JAssignment(
                                                                                new JArrayAccess(
                                                                                        new JIdent(
                                                                                                JQualifiedName.of("this", "_" + s.getChars() + "Table")),
                                                                                        new JLiteral(j)),
                                                                                new JMethodReference(
                                                                                        JQualifiedName.of("this"),
                                                                                        JName.of(NameMangler.DEFAULT.mangleName(lst.get(j).getName().get()))))))
                                                        .collect(toImmutableList())))));
                declarations.add(
                        new JInitializationBlock(
                                new JBlock(
                                        ImmutableList.of(
                                                new JExpressionStatement(
                                                        new JMethodInvocation(
                                                                new JIdent(
                                                                        JQualifiedName.of("_" + s.getChars() + "Table_init_" + i)),
                                                                ImmutableList.of()))))));
            }
        }

        declarations.add(
                new JField(
                        immutableEnumSet(JAccess.PROTECTED, JAccess.FINAL),
                        new JTypeSpecifier(
                                JQualifiedName.of("int"),
                                ImmutableList.of(
                                        JArray.EMPTY)),
                        JName.of("_tableIndices"),
                        Optional.of(
                                new JLongArrayLiteral(
                                        tableIndices.stream().map(JLiteral::new).collect(toImmutableList())))));

        return declarations.build();
    }
}
