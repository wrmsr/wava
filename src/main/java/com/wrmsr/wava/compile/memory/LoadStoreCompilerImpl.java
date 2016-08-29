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
import com.wrmsr.wava.core.node.Load;
import com.wrmsr.wava.core.node.Store;
import com.wrmsr.wava.java.lang.JAccess;
import com.wrmsr.wava.java.lang.JArg;
import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.JTypeSpecifier;
import com.wrmsr.wava.java.lang.op.JBinaryOp;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JMethod;
import com.wrmsr.wava.java.lang.tree.expression.JBinary;
import com.wrmsr.wava.java.lang.tree.expression.JCast;
import com.wrmsr.wava.java.lang.tree.expression.JExpression;
import com.wrmsr.wava.java.lang.tree.expression.JIdent;
import com.wrmsr.wava.java.lang.tree.expression.JLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JMethodInvocation;
import com.wrmsr.wava.java.lang.tree.statement.JBlock;
import com.wrmsr.wava.java.lang.tree.statement.JExpressionStatement;
import com.wrmsr.wava.java.lang.tree.statement.JReturn;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;

import java.util.List;
import java.util.Optional;

import static com.google.common.collect.Sets.immutableEnumSet;

public final class LoadStoreCompilerImpl
        implements LoadStoreCompiler, ModuleCompilationParticipant
{
    @Inject
    public LoadStoreCompilerImpl()
    {
    }

    @Override
    public JExpression compileLoad(Load node, JExpression ptr)
    {
        switch (node.getType()) {
            case I32: {
                return JMethodInvocation.of(
                        JQualifiedName.of("this", "_loadInt" + (node.getBytes() != 4 ? (node.getBytes() * 8) + (node.isSigned() ? "s" : "u") : "")),
                        ImmutableList.of(
                                maybeAdd(ptr, node.getOffset())));
            }
            case I64: {
                return JMethodInvocation.of(
                        JQualifiedName.of("this", "_loadLong" + (node.getBytes() != 8 ? (node.getBytes() * 8) + (node.isSigned() ? "s" : "u") : "")),
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
                        JQualifiedName.of("this", "_storeInt" + (node.getBytes() != 4 ? node.getBytes() * 8 : "")),
                        ImmutableList.of(
                                maybeAdd(ptr, node.getOffset()),
                                value));
            }
            case I64: {
                return JMethodInvocation.of(
                        JQualifiedName.of("this", "_storeLong" + (node.getBytes() != 8 ? node.getBytes() * 8 : "")),
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

    @Override
    public List<JDeclaration> createPostCtorDeclarations()
    {
        ImmutableList.Builder<JDeclaration> declarations = ImmutableList.builder();

        for (Class p : new Class[] {int.class, long.class, float.class, double.class}) {
            declarations.add(
                    new JMethod(
                            immutableEnumSet(JAccess.PROTECTED, JAccess.FINAL),
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
                            immutableEnumSet(JAccess.PROTECTED, JAccess.FINAL),
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

        declarations.add(createLengthUnsignedLoad(int.class, byte.class, 8, 0xFF));
        declarations.add(createLengthUnsignedLoad(int.class, short.class, 16, 0xFFFF));
        declarations.add(createLengthUnsignedLoad(long.class, byte.class, 8, 0xFFL));
        declarations.add(createLengthUnsignedLoad(long.class, short.class, 16, 0xFFFFL));
        declarations.add(createLengthUnsignedLoad(long.class, int.class, 32, 0xFFFFFFFFL));

        declarations.add(createLengthSignedLoad(int.class, byte.class, 8));
        declarations.add(createLengthSignedLoad(int.class, short.class, 16));
        declarations.add(createLengthSignedLoad(long.class, byte.class, 8));
        declarations.add(createLengthSignedLoad(long.class, short.class, 16));
        declarations.add(createLengthSignedLoad(long.class, int.class, 32));

        declarations.add(createLengthStore(int.class, byte.class, 8));
        declarations.add(createLengthStore(int.class, short.class, 16));
        declarations.add(createLengthStore(long.class, byte.class, 8));
        declarations.add(createLengthStore(long.class, short.class, 16));
        declarations.add(createLengthStore(long.class, int.class, 32));

        return declarations.build();
    }

    private JMethod createLengthSignedLoad(Class<?> p, Class<?> t, int len)
    {
        return new JMethod(
                immutableEnumSet(JAccess.PROTECTED, JAccess.FINAL),
                JTypeSpecifier.of(p.getName()),
                JName.of("_load" + StringUtils.capitalize(p.getName()) + len + "s"),
                ImmutableList.of(
                        new JArg(
                                JTypeSpecifier.of("int"),
                                JName.of("ptr"))),
                Optional.of(
                        new JBlock(
                                ImmutableList.of(
                                        new JReturn(
                                                Optional.of(
                                                        new JCast(
                                                                JTypeSpecifier.of(p.getName()),
                                                                JMethodInvocation.of(
                                                                        JQualifiedName.of("this", "_memory", "get" + (t == byte.class ? "" : StringUtils.capitalize(t.getName()))),
                                                                        ImmutableList.of(
                                                                                new JIdent(
                                                                                        JQualifiedName.of("ptr")))))))))));
    }

    private JMethod createLengthUnsignedLoad(Class<?> p, Class<?> t, int len, Object mask)
    {
        return new JMethod(
                immutableEnumSet(JAccess.PROTECTED, JAccess.FINAL),
                JTypeSpecifier.of(p.getName()),
                JName.of("_load" + StringUtils.capitalize(p.getName()) + len + "u"),
                ImmutableList.of(
                        new JArg(
                                JTypeSpecifier.of("int"),
                                JName.of("ptr"))),
                Optional.of(
                        new JBlock(
                                ImmutableList.of(
                                        new JReturn(
                                                Optional.of(
                                                        new JBinary(
                                                                JBinaryOp.BitwiseAnd,
                                                                JMethodInvocation.of(
                                                                        JQualifiedName.of("this", "_memory", "get" + (t == byte.class ? "" : StringUtils.capitalize(t.getName()))),
                                                                        ImmutableList.of(
                                                                                new JIdent(
                                                                                        JQualifiedName.of("ptr")))),
                                                                new JLiteral(
                                                                        mask))))))));
    }

    private JMethod createLengthStore(Class<?> p, Class<?> t, int len)
    {
        return new JMethod(
                immutableEnumSet(JAccess.PROTECTED, JAccess.FINAL),
                JTypeSpecifier.of(p.getName()),
                JName.of("_store" + StringUtils.capitalize(p.getName()) + len),
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
                                                        JQualifiedName.of("this", "_memory", "put" + (t == byte.class ? "" : StringUtils.capitalize(t.getSimpleName()))),
                                                        ImmutableList.of(
                                                                new JIdent(
                                                                        JQualifiedName.of("ptr")),
                                                                new JCast(
                                                                        JTypeSpecifier.of(t.getName()),
                                                                        new JIdent(
                                                                                JQualifiedName.of("value")))))),
                                        new JReturn(
                                                Optional.of(
                                                        new JIdent(
                                                                JQualifiedName.of("value"))))))));
    }
}
