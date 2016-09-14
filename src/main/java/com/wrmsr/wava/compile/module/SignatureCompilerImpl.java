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
import com.wrmsr.wava.core.type.Signature;
import com.wrmsr.wava.core.unit.Function;
import com.wrmsr.wava.core.unit.Import;
import com.wrmsr.wava.core.unit.Module;
import com.wrmsr.wava.java.lang.JAccess;
import com.wrmsr.wava.java.lang.JArg;
import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.JTypeSpecifier;
import com.wrmsr.wava.java.lang.tree.declaration.JAnnotatedDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JMethod;
import com.wrmsr.wava.java.lang.tree.declaration.JType;

import javax.inject.Inject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.google.common.collect.Sets.immutableEnumSet;
import static com.wrmsr.wava.util.Itertools.enumerate;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static java.util.Objects.requireNonNull;

public final class SignatureCompilerImpl
        implements ModuleCompilationParticipant
{
    private final Module module;

    @Inject
    public SignatureCompilerImpl(Module module)
    {
        this.module = requireNonNull(module);
    }

    @Override
    public List<JDeclaration> createPreCtorDeclarations()
    {
        Set<Signature> signatureSet = Stream.<Signature>concat(
                module.getDeclaredSignatures().stream(),
                Stream.<Signature>concat(
                        module.getImports().values().stream().map(Import::getSignature),
                        module.getTable().getNames().stream().map(module.getFunctions()::get).map(Function::getSignature)))
                .collect(Collectors.toSet());
        List<Signature> signatures = new ArrayList<>(signatureSet);
        Collections.sort(signatures);

        ImmutableList.Builder<JDeclaration> declarations = ImmutableList.builder();
        for (Signature s : signatures) {
            declarations.add(
                    new JAnnotatedDeclaration(
                            JQualifiedName.of("java", "lang", "FunctionalInterface"),
                            Optional.empty(),
                            new JType(
                                    immutableEnumSet(JAccess.PUBLIC),
                                    JType.Kind.INTERFACE,
                                    JName.of(s.getChars().toUpperCase()),
                                    ImmutableList.of(),
                                    ImmutableList.of(
                                            new JMethod(
                                                    ImmutableSet.of(),
                                                    JTypeSpecifier.of(s.getResult().getPrimitive().getName()),
                                                    JName.of("invoke"),
                                                    enumerate(s.getArguments().stream()).map(i -> new JArg(
                                                            JTypeSpecifier.of(i.getItem().getPrimitive().getName()),
                                                            JName.of("arg" + i.getIndex()))
                                                    ).collect(toImmutableList()),
                                                    Optional.empty())))));
        }
        return declarations.build();
    }
}
