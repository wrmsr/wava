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
package com.wrmsr.wava.compile.memory;

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.compile.module.ModuleCompilationParticipant;
import com.wrmsr.wava.core.unit.Module;
import com.wrmsr.wava.core.unit.Segment;
import com.wrmsr.wava.java.lang.JAccess;
import com.wrmsr.wava.java.lang.JArray;
import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.JTypeSpecifier;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JField;
import com.wrmsr.wava.java.lang.tree.expression.JAssignment;
import com.wrmsr.wava.java.lang.tree.expression.JIdent;
import com.wrmsr.wava.java.lang.tree.expression.JLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JLongArrayLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JLongStringLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JMemberAccess;
import com.wrmsr.wava.java.lang.tree.expression.JMethodInvocation;
import com.wrmsr.wava.java.lang.tree.expression.JNew;
import com.wrmsr.wava.java.lang.tree.expression.JNewArray;
import com.wrmsr.wava.java.lang.tree.statement.JBlock;
import com.wrmsr.wava.java.lang.tree.statement.JExpressionStatement;
import com.wrmsr.wava.java.lang.tree.statement.JForEach;
import com.wrmsr.wava.java.lang.tree.statement.JStatement;
import com.wrmsr.wava.java.lang.tree.statement.JVariable;
import com.wrmsr.wava.java.lang.tree.statement.JWhileLoop;

import javax.inject.Inject;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.google.common.collect.Sets.immutableEnumSet;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static com.wrmsr.wava.util.function.Functions.memoize;
import static java.util.Objects.requireNonNull;

public final class MemoryCompilerImpl
        implements ModuleCompilationParticipant
{
    private final Module module;

    private final Runnable initializer = memoize(this::initialize);
    private String encoded;
    private List<String> initialMemoryChunks;

    private static final int CHUNK_SIZE = 16 * 1024;

    @Inject
    public MemoryCompilerImpl(Module module)
    {
        this.module = requireNonNull(module);
    }

    private void initialize()
    {
        List<Segment> segments = module.getMemory().getSegments();
        ByteBuffer buf = ByteBuffer.allocate((segments.size() * 8) + segments.stream().mapToInt(Segment::getLength).sum());
        for (Segment segment : module.getMemory().getSegments()) {
            buf.putInt(segment.getOffset());
            buf.putInt(segment.getLength());
            buf.put(segment.getData());
        }
        encoded = new String(java.util.Base64.getEncoder().encode(buf.array()));

        initialMemoryChunks = new ArrayList<>();
        for (int i = 0; i < encoded.length(); i += CHUNK_SIZE) {
            initialMemoryChunks.add(encoded.substring(i, Math.min(i + CHUNK_SIZE, encoded.length())));
        }
    }

    @Override
    public List<JDeclaration> createPreCtorDeclarations()
    {
        initializer.run();

        return ImmutableList.of(
                new JField(
                        immutableEnumSet(JAccess.PROTECTED, JAccess.FINAL),
                        JTypeSpecifier.of("java", "nio", "ByteBuffer"),
                        JName.of("_memory"),
                        Optional.empty()),

                new JField(
                        immutableEnumSet(JAccess.PROTECTED, JAccess.FINAL),
                        new JTypeSpecifier(
                                JQualifiedName.of("java", "lang", "String"),
                                ImmutableList.of(
                                        JArray.EMPTY)),
                        JName.of("_memorySegments"),
                        Optional.of(
                                new JLongArrayLiteral(
                                        initialMemoryChunks.stream().map(JLongStringLiteral::new).collect(toImmutableList())))));
    }

    @Override
    public List<JStatement> createCtorStatements()
    {
        initializer.run();

        ImmutableList.Builder<JStatement> ctor = ImmutableList.builder();

        ctor.add(
                new JExpressionStatement(
                        JAssignment.of(
                                JQualifiedName.of("this", "_memory"),
                                JMethodInvocation.of(
                                        JQualifiedName.of("java", "nio", "ByteBuffer", "allocateDirect"),
                                        ImmutableList.of(
                                                new JLiteral(
                                                        65536 * 128)))))); // FIXME

        ctor.add(
                new JVariable(
                        JTypeSpecifier.of("java", "lang", "StringBuilder"),
                        JName.of("sb"),
                        Optional.of(
                                new JNew(
                                        JTypeSpecifier.of("java", "lang", "StringBuilder"),
                                        ImmutableList.of(
                                                new JLiteral(
                                                        encoded.length()))))));

        ctor.add(
                new JForEach(
                        JTypeSpecifier.of("java", "lang", "String"),
                        JName.of("s"),
                        JIdent.of(JName.of("_memorySegments")),
                        new JBlock(
                                ImmutableList.of(
                                        new JExpressionStatement(
                                                JMethodInvocation.of(
                                                        JQualifiedName.of("sb", "append"),
                                                        ImmutableList.of(
                                                                JIdent.of(JName.of("s")))))))));

        ctor.add(
                new JVariable(
                        JTypeSpecifier.of("java", "nio", "ByteBuffer"),
                        JName.of("buf"),
                        Optional.of(
                                JMethodInvocation.of(
                                        JQualifiedName.of("java", "nio", "ByteBuffer", "wrap"),
                                        ImmutableList.of(
                                                new JMethodInvocation(
                                                        new JMemberAccess(
                                                                JMethodInvocation.of(
                                                                        JQualifiedName.of("java", "util", "Base64", "getDecoder"),
                                                                        ImmutableList.of()),
                                                                JName.of("decode")),
                                                        ImmutableList.of(
                                                                JMethodInvocation.of(
                                                                        JQualifiedName.of("sb", "toString"),
                                                                        ImmutableList.of()))))))));

        ctor.add(
                new JExpressionStatement(
                        JAssignment.of(
                                JQualifiedName.of("sb"),
                                new JLiteral(
                                        null))));

        ctor.add(
                new JWhileLoop(
                        JMethodInvocation.of(
                                JQualifiedName.of("buf", "hasRemaining"),
                                ImmutableList.of()),
                        new JBlock(
                                ImmutableList.of(
                                        new JExpressionStatement(
                                                JMethodInvocation.of(
                                                        JQualifiedName.of("_memory", "position"),
                                                        ImmutableList.of(
                                                                JMethodInvocation.of(
                                                                        JQualifiedName.of("buf", "getInt"),
                                                                        ImmutableList.of())))),

                                        new JVariable(
                                                new JTypeSpecifier(
                                                        JQualifiedName.of("byte"),
                                                        ImmutableList.of(
                                                                JArray.EMPTY)),
                                                JName.of("seg"),
                                                Optional.of(
                                                        new JNewArray(
                                                                new JTypeSpecifier(
                                                                        JQualifiedName.of("byte"),
                                                                        ImmutableList.of(
                                                                                new JArray(
                                                                                        JMethodInvocation.of(
                                                                                                JQualifiedName.of("buf", "getInt"),
                                                                                                ImmutableList.of())))),
                                                                Optional.empty()))),

                                        new JExpressionStatement(
                                                JMethodInvocation.of(
                                                        JQualifiedName.of("buf", "get"),
                                                        ImmutableList.of(
                                                                new JIdent(
                                                                        JQualifiedName.of("seg"))))),

                                        new JExpressionStatement(
                                                JMethodInvocation.of(
                                                        JQualifiedName.of("_memory", "put"),
                                                        ImmutableList.of(
                                                                new JIdent(
                                                                        JQualifiedName.of("seg")))))))));

        ctor.add(
                new JExpressionStatement(
                        JMethodInvocation.of(
                                JQualifiedName.of("_memory", "clear"),
                                ImmutableList.of())));

        ctor.add(
                new JExpressionStatement(
                        JMethodInvocation.of(
                                JQualifiedName.parse("_memory.order"),
                                ImmutableList.of(
                                        new JIdent(
                                                JQualifiedName.parse("java.nio.ByteOrder.LITTLE_ENDIAN"))))));

        return ctor.build();
    }
}
