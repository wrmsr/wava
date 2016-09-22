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
package com.wrmsr.wava.compile.function;

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.compile.Compilation;
import com.wrmsr.wava.compile.binary.BinaryCompiler;
import com.wrmsr.wava.compile.call.CallCompiler;
import com.wrmsr.wava.compile.call.CallIndirectCompiler;
import com.wrmsr.wava.compile.const_.ConstCompiler;
import com.wrmsr.wava.compile.memory.LoadStoreCompiler;
import com.wrmsr.wava.compile.module.ModuleCompilationParticipant;
import com.wrmsr.wava.compile.unary.UnaryCompiler;
import com.wrmsr.wava.core.node.Binary;
import com.wrmsr.wava.core.node.Block;
import com.wrmsr.wava.core.node.Break;
import com.wrmsr.wava.core.node.BreakTable;
import com.wrmsr.wava.core.node.Call;
import com.wrmsr.wava.core.node.CallIndirect;
import com.wrmsr.wava.core.node.Const;
import com.wrmsr.wava.core.node.GetLocal;
import com.wrmsr.wava.core.node.If;
import com.wrmsr.wava.core.node.Label;
import com.wrmsr.wava.core.node.Load;
import com.wrmsr.wava.core.node.Loop;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Nop;
import com.wrmsr.wava.core.node.Return;
import com.wrmsr.wava.core.node.Select;
import com.wrmsr.wava.core.node.SetLocal;
import com.wrmsr.wava.core.node.Store;
import com.wrmsr.wava.core.node.Switch;
import com.wrmsr.wava.core.node.Unary;
import com.wrmsr.wava.core.node.Unreachable;
import com.wrmsr.wava.core.node.visitor.Visitor;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.unit.Function;
import com.wrmsr.wava.java.lang.JAccess;
import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.JTypeSpecifier;
import com.wrmsr.wava.java.lang.tree.JInheritance;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JMethod;
import com.wrmsr.wava.java.lang.tree.declaration.JType;
import com.wrmsr.wava.java.lang.tree.expression.JAssignment;
import com.wrmsr.wava.java.lang.tree.expression.JConditional;
import com.wrmsr.wava.java.lang.tree.expression.JExpression;
import com.wrmsr.wava.java.lang.tree.expression.JIdent;
import com.wrmsr.wava.java.lang.tree.expression.JLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JNew;
import com.wrmsr.wava.java.lang.tree.statement.JBlock;
import com.wrmsr.wava.java.lang.tree.statement.JBreak;
import com.wrmsr.wava.java.lang.tree.statement.JCase;
import com.wrmsr.wava.java.lang.tree.statement.JContinue;
import com.wrmsr.wava.java.lang.tree.statement.JDoWhileLoop;
import com.wrmsr.wava.java.lang.tree.statement.JEmpty;
import com.wrmsr.wava.java.lang.tree.statement.JExpressionStatement;
import com.wrmsr.wava.java.lang.tree.statement.JIf;
import com.wrmsr.wava.java.lang.tree.statement.JLabeledStatement;
import com.wrmsr.wava.java.lang.tree.statement.JReturn;
import com.wrmsr.wava.java.lang.tree.statement.JStatement;
import com.wrmsr.wava.java.lang.tree.statement.JSwitch;
import com.wrmsr.wava.java.lang.tree.statement.JThrow;
import com.wrmsr.wava.java.lang.tree.statement.JWhileLoop;

import javax.inject.Inject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static com.google.common.base.Preconditions.checkState;
import static com.google.common.collect.Sets.immutableEnumSet;
import static com.wrmsr.wava.compile.Compilation.PRIMITIVE_TYPE_MAP;
import static com.wrmsr.wava.compile.Compilation.compileArgs;
import static com.wrmsr.wava.compile.Compilation.compileLocalDecls;
import static com.wrmsr.wava.compile.Compilation.translateCondition;
import static com.wrmsr.wava.core.node.Nodes.noptional;
import static com.wrmsr.wava.java.lang.tree.JTrees.jblockify;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static java.util.Objects.requireNonNull;

public final class FunctionCompilerImpl
        implements FunctionCompiler, ModuleCompilationParticipant
{
    private final FunctionAccess functionAccess;
    private final BinaryCompiler binaryCompiler;
    private final CallCompiler callCompiler;
    private final CallIndirectCompiler callIndirectCompiler;
    private final ConstCompiler constCompiler;
    private final LoadStoreCompiler loadStoreCompiler;
    private final UnaryCompiler unaryCompiler;

    @Inject
    public FunctionCompilerImpl(
            FunctionAccess functionAccess,
            BinaryCompiler binaryCompiler,
            CallCompiler callCompiler,
            CallIndirectCompiler callIndirectCompiler,
            ConstCompiler constCompiler,
            LoadStoreCompiler loadStoreCompiler,
            UnaryCompiler unaryCompiler)
    {
        this.functionAccess = requireNonNull(functionAccess);
        this.binaryCompiler = requireNonNull(binaryCompiler);
        this.callCompiler = requireNonNull(callCompiler);
        this.callIndirectCompiler = requireNonNull(callIndirectCompiler);
        this.constCompiler = requireNonNull(constCompiler);
        this.loadStoreCompiler = requireNonNull(loadStoreCompiler);
        this.unaryCompiler = requireNonNull(unaryCompiler);
    }

    @Override
    public List<JDeclaration> createPreCtorDeclarations()
    {
        return ImmutableList.of(
                new JType(
                        immutableEnumSet(JAccess.PUBLIC, JAccess.STATIC, JAccess.FINAL),
                        JType.Kind.CLASS,
                        JName.of("UnreachableException"),
                        ImmutableList.of(
                                new JInheritance(
                                        JInheritance.Kind.EXTENDS,
                                        JQualifiedName.of("java", "lang", "RuntimeException"))),
                        ImmutableList.of()));
    }

    @Override
    public List<JMethod> compileFunction(Function function)
    {
        return ImmutableList.of(new Instance(function).compile());
    }

    private final class Instance
    {
        private final Function function;
        private final Set<Name> continueLabels = new HashSet<>();

        private Instance(Function function)
        {
            this.function = requireNonNull(function);
        }

        private JMethod compile()
        {
            return new JMethod(
                    functionAccess.getAccess(),
                    PRIMITIVE_TYPE_MAP.get(function.getResult()),
                    JName.of(function.getName().get()),
                    compileArgs(function),
                    Optional.of(
                            jblockify(
                                    ImmutableList.of(
                                            compileLocalDecls(function),
                                            compileStatement(function.getBody())))));
        }

        private JExpression compileCondition(Node condition)
        {
            return translateCondition(compileExpression(condition));
        }

        private JStatement compileStatement(Node curr)
        {
            return curr.accept(new Visitor<Object, JStatement>()
            {
                @Override
                protected JStatement visitNode(Node node, Object context)
                {
                    return new JExpressionStatement(
                            compileExpression(curr));
                }

                @Override
                public JStatement visitBlock(Block node, Object context)
                {
                    return new JBlock(
                            node.getChildren().stream().map(FunctionCompilerImpl.Instance.this::compileStatement).collect(toImmutableList()));
                }

                @Override
                public JStatement visitBreak(Break node, Object context)
                {
                    if (continueLabels.contains(node.getTarget())) {
                        return new JContinue(
                                Optional.of(JName.of(node.getTarget().get())));
                    }
                    else {
                        return new JBreak(
                                Optional.of(JName.of(node.getTarget().get())));
                    }
                }

                @Override
                public JStatement visitBreakTable(BreakTable node, Object context)
                {
                    Map<Name, List<Object>> map = new LinkedHashMap<>();
                    for (int i = 0; i < node.getTargets().size(); ++i) {
                        Name target = node.getTargets().get(i);
                        List<Object> list = map.get(target);
                        if (list == null) {
                            map.put(target, list = new ArrayList<>());
                        }
                        list.add(i);
                    }
                    return new JSwitch(
                            compileExpression(node.getCondition()),
                            ImmutableList.<JCase>builder()
                                    .addAll(map.entrySet().stream()
                                            .map(e -> new JCase(
                                                    e.getValue(),
                                                    false,
                                                    new JBlock(
                                                            ImmutableList.of(
                                                                    new JBreak(
                                                                            Optional.of(JName.of(e.getKey().get())))))))
                                            .collect(toImmutableList()))
                                    .add(new JCase(
                                            ImmutableList.of(),
                                            true,
                                            new JBlock(
                                                    ImmutableList.of(
                                                            new JBreak(
                                                                    Optional.of(JName.of(node.getDefaultTarget().get())))))))
                                    .build());
                }

                @Override
                public JStatement visitIf(If node, Object context)
                {
                    JBlock ifTrue = jblockify(compileStatement(node.getIfTrue()));
                    Optional<JBlock> ifFalse = noptional(node.getIfFalse()).map(n -> jblockify(compileStatement(n)));
                    return new JIf(
                            compileCondition(node.getCondition()),
                            ifTrue,
                            ifFalse);
                }

                @Override
                public JStatement visitLabel(Label node, Object context)
                {
                    return new JLabeledStatement(
                            JName.of(node.getName().get()),
                            new JDoWhileLoop(
                                    jblockify(compileStatement(node.getBody())),
                                    new JLiteral(false)));
                }

                @Override
                public JStatement visitLoop(Loop node, Object context)
                {
                    checkState(!continueLabels.contains(node.getName()));
                    continueLabels.add(node.getName());
                    return new JLabeledStatement(
                            JName.of(node.getName().get()),
                            new JWhileLoop(
                                    new JLiteral(true),
                                    jblockify(compileStatement(node.getBody()))));
                }

                @Override
                public JStatement visitNop(Nop node, Object context)
                {
                    return new JEmpty();
                }

                @Override
                public JStatement visitReturn(Return node, Object context)
                {
                    return new JReturn(
                            noptional(node.getValue()).map(FunctionCompilerImpl.Instance.this::compileExpression));
                }

                @Override
                public JStatement visitSwitch(Switch node, Object context)
                {
                    return new JSwitch(
                            compileExpression(node.getCondition()),
                            node.getEntries().stream()
                                    .map(e -> new JCase(
                                            e.getValues().stream()
                                                    .filter(Switch.IntValue.class::isInstance)
                                                    .map(Switch.IntValue.class::cast)
                                                    .map(Switch.IntValue::getValue)
                                                    .collect(toImmutableList()),
                                            e.getValues().stream().anyMatch(Switch.DefaultValue.class::isInstance),
                                            jblockify(compileStatement(e.getBody()))))
                                    .collect(toImmutableList()));
                }

                @Override
                public JStatement visitUnreachable(Unreachable node, Object context)
                {
                    return new JThrow(
                            new JNew(
                                    JTypeSpecifier.of("UnreachableException"),
                                    ImmutableList.of()));
                }
            }, null);
        }

        private JExpression compileExpression(Node curr)
        {
            return curr.accept(new Visitor<Void, JExpression>()
            {
                @Override
                protected JExpression visitNode(Node node, Void context)
                {
                    throw new IllegalStateException();
                }

                @Override
                public JExpression visitBinary(Binary expression, Void context)
                {
                    return binaryCompiler.compileBinary(
                            expression,
                            compileExpression(expression.getLeft()),
                            compileExpression(expression.getRight()));
                }

                @Override
                public JExpression visitCall(Call node, Void context)
                {
                    List<JExpression> operands = node.getOperands().stream()
                            .map(FunctionCompilerImpl.Instance.this::compileExpression)
                            .collect(toImmutableList());
                    return callCompiler.compileCall(node, operands);
                }

                @Override
                public JExpression visitCallIndirect(CallIndirect node, Void context)
                {
                    return callIndirectCompiler.compileCallIndirect(
                            node,
                            compileExpression(node.getTarget()),
                            node.getOperands().stream()
                                    .map(FunctionCompilerImpl.Instance.this::compileExpression)
                                    .collect(toImmutableList()));
                }

                @Override
                public JExpression visitConst(Const node, Void context)
                {
                    return constCompiler.compileConst(node);
                }

                @Override
                public JExpression visitGetLocal(GetLocal expression, Void context)
                {
                    return JIdent.of(Compilation.getLocalName(function, expression.getIndex()));
                }

                @Override
                public JExpression visitIf(If node, Void context)
                {
                    return new JConditional(
                            compileCondition(node.getCondition()),
                            compileExpression(node.getIfTrue()),
                            compileExpression(node.getIfFalse()));
                }

                @Override
                public JExpression visitLoad(Load node, Void context)
                {
                    return loadStoreCompiler.compileLoad(
                            node,
                            compileExpression(node.getPtr()));
                }

                @Override
                public JExpression visitSelect(Select node, Void context)
                {
                    return new JConditional(
                            compileCondition(node.getCondition()),
                            compileExpression(node.getIfTrue()),
                            compileExpression(node.getIfFalse()));
                }

                @Override
                public JExpression visitSetLocal(SetLocal node, Void context)
                {
                    return JAssignment.of(
                            JQualifiedName.of(Compilation.getLocalName(function, node.getIndex())),
                            compileExpression(node.getValue()));
                }

                @Override
                public JExpression visitStore(Store node, Void context)
                {
                    return loadStoreCompiler.compileStore(
                            node,
                            compileExpression(node.getPtr()),
                            compileExpression(node.getValue()));
                }

                @Override
                public JExpression visitUnary(Unary node, Void context)
                {
                    return unaryCompiler.compileUnary(
                            node,
                            compileExpression(node.getValue()));
                }
            }, null);
        }
    }
}
