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
import com.wrmsr.wava.compile.call.CallCompiler;
import com.wrmsr.wava.compile.call.CallIndirectCompiler;
import com.wrmsr.wava.compile.memory.LoadStoreCompiler;
import com.wrmsr.wava.core.node.Call;
import com.wrmsr.wava.core.node.CallIndirect;
import com.wrmsr.wava.core.node.Load;
import com.wrmsr.wava.core.node.Store;
import com.wrmsr.wava.core.op.HostOp;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Signature;
import com.wrmsr.wava.core.unit.Function;
import com.wrmsr.wava.core.unit.Import;
import com.wrmsr.wava.core.unit.Module;
import com.wrmsr.wava.core.unit.Segment;
import com.wrmsr.wava.java.lang.JAccess;
import com.wrmsr.wava.java.lang.JArg;
import com.wrmsr.wava.java.lang.JArray;
import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.JTypeSpecifier;
import com.wrmsr.wava.java.lang.op.JBinaryOp;
import com.wrmsr.wava.java.lang.tree.declaration.JAnnotatedDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JConstructor;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclarationBlock;
import com.wrmsr.wava.java.lang.tree.declaration.JField;
import com.wrmsr.wava.java.lang.tree.declaration.JInitializationBlock;
import com.wrmsr.wava.java.lang.tree.declaration.JMethod;
import com.wrmsr.wava.java.lang.tree.declaration.JType;
import com.wrmsr.wava.java.lang.tree.expression.JArrayAccess;
import com.wrmsr.wava.java.lang.tree.expression.JAssignment;
import com.wrmsr.wava.java.lang.tree.expression.JBinary;
import com.wrmsr.wava.java.lang.tree.expression.JExpression;
import com.wrmsr.wava.java.lang.tree.expression.JIdent;
import com.wrmsr.wava.java.lang.tree.expression.JLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JLongArrayLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JLongStringLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JMemberAccess;
import com.wrmsr.wava.java.lang.tree.expression.JMethodInvocation;
import com.wrmsr.wava.java.lang.tree.expression.JMethodReference;
import com.wrmsr.wava.java.lang.tree.expression.JNew;
import com.wrmsr.wava.java.lang.tree.expression.JNewArray;
import com.wrmsr.wava.java.lang.tree.statement.JBlock;
import com.wrmsr.wava.java.lang.tree.statement.JExpressionStatement;
import com.wrmsr.wava.java.lang.tree.statement.JForEach;
import com.wrmsr.wava.java.lang.tree.statement.JReturn;
import com.wrmsr.wava.java.lang.tree.statement.JStatement;
import com.wrmsr.wava.java.lang.tree.statement.JVariable;
import com.wrmsr.wava.java.lang.tree.statement.JWhileLoop;
import com.wrmsr.wava.util.NameMangler;
import org.apache.commons.lang3.StringUtils;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.collect.Sets.immutableEnumSet;
import static com.wrmsr.wava.util.Itertools.enumerate;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;

public final class CompilationUtils
{
    public static final CallIndirectCompiler CALL_INDIRECT_COMPILER = new CallIndirectCompiler()
    {
        @Override
        public JExpression compileCallIndirect(CallIndirect node, JExpression target, List<JExpression> operands)
        {
            return new JMethodInvocation(
                    new JMemberAccess(
                            new JArrayAccess(
                                    new JIdent(
                                            JQualifiedName.of("this", "_" + node.getSignature().getChars() + "Table")),
                                    new JArrayAccess(
                                            new JIdent(
                                                    JQualifiedName.of("this", "_tableIndices")),
                                            target)),
                            JName.of("invoke")),
                    ImmutableList.<JExpression>builder()
                            .addAll(operands)
                            .build());
        }
    };

    public static final CallCompiler CALL_COMPILER = new CallCompiler()
    {
        @Override
        public JExpression compileCall(Call node, List<JExpression> operands)
        {
            JQualifiedName name;
            if (node.getTarget() instanceof Call.DirectTarget) {
                name = JQualifiedName.of(((Call.DirectTarget) node.getTarget()).getName().get());
            }
            else if (node.getTarget() instanceof Call.ImportTarget) {
                name = JQualifiedName.of("this", ((Call.ImportTarget) node.getTarget()).getName().get(), "invoke");
            }
            else if (node.getTarget() instanceof Call.HostTarget) {
                HostOp op = ((Call.HostTarget) node.getTarget()).getOp();
                switch (op) {
                    case SpillPut:
                        checkArgument(operands.size() == 2);
                        return new JAssignment(
                                new JArrayAccess(
                                        new JIdent(
                                                JQualifiedName.of("this", "_spill")),
                                        operands.get(0)),
                                operands.get(1));
                    case SpillGet:
                        checkArgument(operands.size() == 1);
                        return new JArrayAccess(
                                new JIdent(
                                        JQualifiedName.of("this", "_spill")),
                                operands.get(0));
                    default:
                        throw new IllegalArgumentException();
                }
            }
            else {
                throw new IllegalStateException();
            }
            return JMethodInvocation.of(
                    name,
                    operands);
        }
    };

    // FIXME bytes
    public static final LoadStoreCompiler LOAD_STORE_COMPILER = new LoadStoreCompiler()
    {
        @Override
        public JExpression compileLoad(Load node, JExpression ptr)
        {
            switch (node.getType()) {
                case I32: {
                    return JMethodInvocation.of(
                            JQualifiedName.of("this", "_loadInt"),
                            ImmutableList.of(
                                    maybeAdd(ptr, node.getOffset())));
                }
                case I64: {
                    return JMethodInvocation.of(
                            JQualifiedName.of("this", "_loadLong"),
                            ImmutableList.of(
                                    maybeAdd(ptr, node.getOffset())));
                }
                case F32: {
                    return JMethodInvocation.of(
                            JQualifiedName.of("this", "_loadFloat"),
                            ImmutableList.of(
                                    maybeAdd(ptr, node.getOffset())));
                }
                case F64: {
                    return JMethodInvocation.of(
                            JQualifiedName.of("this", "_loadDouble"),
                            ImmutableList.of(
                                    maybeAdd(ptr, node.getOffset())));
                }
            }
            throw new IllegalStateException();
        }

        @Override
        public JExpression compileStore(Store node, JExpression ptr, JExpression value)
        {
            switch (node.getType()) {
                case I32: {
                    return JMethodInvocation.of(
                            JQualifiedName.of("this", "_storeInt"),
                            ImmutableList.of(
                                    maybeAdd(ptr, node.getOffset()),
                                    value));
                }
                case I64: {
                    return JMethodInvocation.of(
                            JQualifiedName.of("this", "_storeLong"),
                            ImmutableList.of(
                                    maybeAdd(ptr, node.getOffset()),
                                    value));
                }
                case F32: {
                    return JMethodInvocation.of(
                            JQualifiedName.of("this", "_storeFloat"),
                            ImmutableList.of(
                                    maybeAdd(ptr, node.getOffset()),
                                    value));
                }
                case F64: {
                    return JMethodInvocation.of(
                            JQualifiedName.of("this", "_storeDouble"),
                            ImmutableList.of(
                                    maybeAdd(ptr, node.getOffset()),
                                    value));
                }
            }
            throw new IllegalStateException();
        }
    };

    private CompilationUtils()
    {
    }

    public static List<JDeclaration> createSignatureDeclarations(Module module)
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
                            JMethodInvocation.of(
                                    JQualifiedName.of("java", "lang", "FunctionalInterface"),
                                    ImmutableList.of()),
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
                                                    enumerate(s.getArguments().stream()).map(i -> new JArg(JTypeSpecifier.of(i.getItem().getPrimitive().getName()), JName.of("arg" + i.getIndex()))).collect(toImmutableList()),
                                                    Optional.empty())))));
        }
        return declarations.build();
    }

    private static JExpression maybeAdd(JExpression value, int offset)
    {
        if (offset == 0) {
            return value;
        }
        else if (offset < 0) {
            return new JBinary(
                    JBinaryOp.Subtract,
                    value,
                    new JLiteral(
                            -offset));
        }
        else {
            return new JBinary(
                    JBinaryOp.Add,
                    value,
                    new JLiteral(
                            offset));
        }
    }

    public static final class MemoryCompiler
    {
        private final Module module;

        private final String encoded;
        private final List<String> initialMemoryChunks;

        public MemoryCompiler(Module module)
        {
            this.module = module;

            List<Segment> segments = module.getMemory().getSegments();
            ByteBuffer buf = ByteBuffer.allocate((segments.size() * 8) + segments.stream().mapToInt(Segment::getLength).sum());
            for (Segment segment : module.getMemory().getSegments()) {
                buf.putInt(segment.getOffset());
                buf.putInt(segment.getLength());
                buf.put(segment.getData());
            }
            encoded = new String(java.util.Base64.getEncoder().encode(buf.array()));

            initialMemoryChunks = new ArrayList<>();
            for (int i = 0; i < encoded.length(); i += 65536) {
                initialMemoryChunks.add(encoded.substring(i, Math.min(i + 65536, encoded.length())));
            }
        }

        public List<JDeclaration> createPreCtorDeclarations()
        {
            return ImmutableList.of(
                    new JField(
                            immutableEnumSet(JAccess.PRIVATE, JAccess.FINAL),
                            JTypeSpecifier.of("java", "nio", "ByteBuffer"),
                            JName.of("_memory"),
                            Optional.empty()),

                    new JField(
                            immutableEnumSet(JAccess.PRIVATE, JAccess.FINAL),
                            new JTypeSpecifier(
                                    JQualifiedName.of("java", "lang", "String"),
                                    ImmutableList.of(
                                            JArray.EMPTY)),
                            JName.of("_memorySegments"),
                            Optional.of(
                                    new JLongArrayLiteral(
                                            initialMemoryChunks.stream().map(JLongStringLiteral::new).collect(toImmutableList())))));
        }

        public List<JStatement> createCtor()
        {
            ImmutableList.Builder<JStatement> ctor = ImmutableList.builder();

            ctor.add(
                    new JExpressionStatement(
                            JAssignment.of(
                                    JQualifiedName.of("this", "_memory"),
                                    JMethodInvocation.of(
                                            JQualifiedName.of("java", "nio", "ByteBuffer", "allocateDirect"),
                                            ImmutableList.of(
                                                    new JLiteral(
                                                            65536*32))))));

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

            return ctor.build();
        }

        public List<JDeclaration> createPostCtorDeclarations()
        {
            ImmutableList.Builder<JDeclaration> declarations = ImmutableList.builder();

            for (Class p : new Class[] {byte.class, short.class, int.class, long.class, float.class, double.class}) {
                declarations.add(
                        new JMethod(
                                immutableEnumSet(JAccess.PRIVATE, JAccess.FINAL),
                                JTypeSpecifier.of(p.getName()),
                                JName.of("_load" + StringUtils.capitalize(p.getName())),
                                ImmutableList.of(
                                        new JArg(
                                                JTypeSpecifier.of("int"),
                                                JName.of("ptr"))),
                                Optional.of(
                                        new JBlock(
                                                ImmutableList.of(
                                                        new JReturn(
                                                                Optional.of(
                                                                        JMethodInvocation.of(
                                                                                JQualifiedName.of("this", "_memory", "get" + (p == byte.class ? "" : StringUtils.capitalize(p.getName()))),
                                                                                ImmutableList.of(
                                                                                        new JIdent(
                                                                                                JQualifiedName.of("ptr")))))))))));

                declarations.add(
                        new JMethod(
                                immutableEnumSet(JAccess.PRIVATE, JAccess.FINAL),
                                JTypeSpecifier.of(p.getName()),
                                JName.of("_store" + StringUtils.capitalize(p.getName())),
                                ImmutableList.of(
                                        new JArg(
                                                JTypeSpecifier.of("int"),
                                                JName.of("ptr")),
                                        new JArg(
                                                JTypeSpecifier.of(p.getName()),
                                                JName.of("value"))),
                                Optional.of(
                                        new JBlock(
                                                ImmutableList.of(
                                                        new JExpressionStatement(
                                                                JMethodInvocation.of(
                                                                        JQualifiedName.of("this", "_memory", "put" + (p == byte.class ? "" : StringUtils.capitalize(p.getName()))),
                                                                        ImmutableList.of(
                                                                                new JIdent(
                                                                                        JQualifiedName.of("ptr")),
                                                                                new JIdent(
                                                                                        JQualifiedName.of("value"))))),
                                                        new JReturn(
                                                                Optional.of(
                                                                        new JIdent(
                                                                                JQualifiedName.of("value")))))))));
            }

            return declarations.build();
        }
    }

    public static final class ImportsCompiler
    {
        private final Module module;

        public ImportsCompiler(Module module)
        {
            this.module = module;
        }

        public List<JDeclaration> createDeclarations()
        {
            return ImmutableList.of(
                    new JType(
                            immutableEnumSet(JAccess.PUBLIC, JAccess.STATIC, JAccess.FINAL),
                            JType.Kind.CLASS,
                            JName.of("Imports"),
                            ImmutableList.of(),
                            ImmutableList.of(
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
                                            module.getImports().values().stream().map(i -> new JArg(JTypeSpecifier.of(i.getSignature().getChars().toUpperCase()), JName.of(NameMangler.DEFAULT.mangleName(i.getName().get())))).collect(toImmutableList()),
                                            new JBlock(
                                                    module.getImports().values().stream().map(i -> new JExpressionStatement(
                                                            JAssignment.of(
                                                                    JQualifiedName.of("this", NameMangler.DEFAULT.mangleName(i.getName().get())),
                                                                    new JIdent(
                                                                            JQualifiedName.of(NameMangler.DEFAULT.mangleName(i.getName().get()))
                                                                    )
                                                            )))
                                                            .collect(toImmutableList()))))),

                    new JDeclarationBlock(
                            module.getImports().values().stream().map(i ->
                                    new JField(
                                            immutableEnumSet(JAccess.PRIVATE, JAccess.FINAL),
                                            JTypeSpecifier.of(JQualifiedName.of(i.getSignature().getChars().toUpperCase())),
                                            JName.of(NameMangler.DEFAULT.mangleName(i.getName().get())),
                                            Optional.empty()
                                    )).collect(toImmutableList())));
        }

        public List<JStatement> createCtor()
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

    public static final class TableCompiler
    {
        private final Module module;

        public TableCompiler(Module module)
        {
            this.module = module;
        }

        public List<JDeclaration> createDeclarations()
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
                        immutableEnumSet(JAccess.PRIVATE, JAccess.FINAL),
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
                                    immutableEnumSet(JAccess.PRIVATE, JAccess.FINAL),
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
                            immutableEnumSet(JAccess.PRIVATE, JAccess.FINAL),
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
}
