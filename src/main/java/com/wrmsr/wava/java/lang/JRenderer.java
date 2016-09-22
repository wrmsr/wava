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
package com.wrmsr.wava.java.lang;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.wrmsr.wava.java.lang.compilationUnit.JCompilationUnit;
import com.wrmsr.wava.java.lang.compilationUnit.JImportSpec;
import com.wrmsr.wava.java.lang.compilationUnit.JPackageSpec;
import com.wrmsr.wava.java.lang.tree.JInheritance;
import com.wrmsr.wava.java.lang.tree.declaration.JAnnotatedDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JConstructor;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclarationBlock;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclarationVisitor;
import com.wrmsr.wava.java.lang.tree.declaration.JField;
import com.wrmsr.wava.java.lang.tree.declaration.JInitializationBlock;
import com.wrmsr.wava.java.lang.tree.declaration.JMethod;
import com.wrmsr.wava.java.lang.tree.declaration.JType;
import com.wrmsr.wava.java.lang.tree.declaration.JVerbatimDeclaration;
import com.wrmsr.wava.java.lang.tree.expression.JArrayAccess;
import com.wrmsr.wava.java.lang.tree.expression.JAssignment;
import com.wrmsr.wava.java.lang.tree.expression.JBinary;
import com.wrmsr.wava.java.lang.tree.expression.JCast;
import com.wrmsr.wava.java.lang.tree.expression.JConditional;
import com.wrmsr.wava.java.lang.tree.expression.JExpression;
import com.wrmsr.wava.java.lang.tree.expression.JExpressionVisitor;
import com.wrmsr.wava.java.lang.tree.expression.JIdent;
import com.wrmsr.wava.java.lang.tree.expression.JLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JLongArrayLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JLongStringLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JMemberAccess;
import com.wrmsr.wava.java.lang.tree.expression.JMethodInvocation;
import com.wrmsr.wava.java.lang.tree.expression.JMethodReference;
import com.wrmsr.wava.java.lang.tree.expression.JNew;
import com.wrmsr.wava.java.lang.tree.expression.JNewArray;
import com.wrmsr.wava.java.lang.tree.expression.JUnary;
import com.wrmsr.wava.java.lang.tree.statement.JAnnotatedStatement;
import com.wrmsr.wava.java.lang.tree.statement.JBlank;
import com.wrmsr.wava.java.lang.tree.statement.JBlock;
import com.wrmsr.wava.java.lang.tree.statement.JBreak;
import com.wrmsr.wava.java.lang.tree.statement.JCase;
import com.wrmsr.wava.java.lang.tree.statement.JContinue;
import com.wrmsr.wava.java.lang.tree.statement.JDoWhileLoop;
import com.wrmsr.wava.java.lang.tree.statement.JEmpty;
import com.wrmsr.wava.java.lang.tree.statement.JExpressionStatement;
import com.wrmsr.wava.java.lang.tree.statement.JForEach;
import com.wrmsr.wava.java.lang.tree.statement.JIf;
import com.wrmsr.wava.java.lang.tree.statement.JLabeledStatement;
import com.wrmsr.wava.java.lang.tree.statement.JReturn;
import com.wrmsr.wava.java.lang.tree.statement.JStatement;
import com.wrmsr.wava.java.lang.tree.statement.JStatementVisitor;
import com.wrmsr.wava.java.lang.tree.statement.JSwitch;
import com.wrmsr.wava.java.lang.tree.statement.JThrow;
import com.wrmsr.wava.java.lang.tree.statement.JVariable;
import com.wrmsr.wava.java.lang.tree.statement.JWhileLoop;
import com.wrmsr.wava.java.poet.CodeBlock;
import com.wrmsr.wava.java.poet.CodeWriter;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

import static com.google.common.base.Preconditions.checkArgument;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static java.util.Objects.requireNonNull;

public final class JRenderer
{
    public static final List<Set<JQualifiedName>> DEFAULT_IMPORT_BLOCKS = ImmutableList.<Set<JQualifiedName>>builder()
            .add(ImmutableSet.of(JQualifiedName.of("javax")))
            .add(ImmutableSet.of(JQualifiedName.of("java")))
            .build();

    public static final int DEFAULT_LONG_STRING_LITERAL_LENGTH = 120;
    public static final int DEFAULT_MULTILINE_ARG_CUTOFF = 6;

    private final CodeBlock.Builder code;
    private final List<Set<JQualifiedName>> importBlocks;
    private final int longStringLiteralLength;
    private final int multilineArgCutoff;

    public JRenderer(CodeBlock.Builder code, List<Set<JQualifiedName>> importBlocks, int longStringLiteralLength, int multilineArgCutoff)
    {
        checkArgument(longStringLiteralLength > 0);
        checkArgument(multilineArgCutoff > 0);
        this.code = requireNonNull(code);
        this.importBlocks = ImmutableList.copyOf(importBlocks);
        this.longStringLiteralLength = longStringLiteralLength;
        this.multilineArgCutoff = multilineArgCutoff;
    }

    public JRenderer(CodeBlock.Builder code)
    {
        this(code, DEFAULT_IMPORT_BLOCKS, DEFAULT_LONG_STRING_LITERAL_LENGTH, DEFAULT_MULTILINE_ARG_CUTOFF);
    }

    private void renderAccess(Set<JAccess> access)
    {
        code.add(Joiner.on("").join(Arrays.stream(JAccess.values()).filter(access::contains).map(a -> a.name().toLowerCase() + " ").collect(toImmutableList())));
    }

    public void renderCompilationUnit(JCompilationUnit compilationUnit)
    {
        compilationUnit.getPackageSpec().ifPresent(this::renderPackageSpec);
        code.add("\n");
        renderImportSpecs(compilationUnit.getImportSpecs().iterator());
        renderDeclaration(compilationUnit.getBody());
    }

    public void renderImportSpecs(Iterator<JImportSpec> importSpecs)
    {
        Set<JImportSpec> normals = new TreeSet<>();
        List<Set<JImportSpec>> blocks = importBlocks.stream().map(s -> new TreeSet<JImportSpec>()).collect(toImmutableList());
        Set<JImportSpec> statics = new TreeSet<>();
        outer:
        while (importSpecs.hasNext()) {
            JImportSpec importSpec = importSpecs.next();
            if (importSpec.isStatic()) {
                statics.add(importSpec);
                continue;
            }
            for (int i = 0; i < importBlocks.size(); ++i) {
                for (JQualifiedName n : importBlocks.get(i)) {
                    if (importSpec.getName().startsWith(n)) {
                        blocks.get(i).add(importSpec);
                        continue outer;
                    }
                }
            }
            normals.add(importSpec);
        }
        if (!normals.isEmpty()) {
            normals.forEach(this::renderImportSpec);
            code.add("\n");
        }
        for (Set<JImportSpec> block : blocks) {
            if (!block.isEmpty()) {
                block.forEach(this::renderImportSpec);
                code.add("\n");
            }
        }
        if (!statics.isEmpty()) {
            statics.forEach(this::renderImportSpec);
            code.add("\n");
        }
    }

    public void renderImportSpec(JImportSpec importSpec)
    {
        code.add("import ");
        if (importSpec.isStatic()) {
            code.add("static ");
        }
        renderQualifiedName(importSpec.getName());
        if (importSpec.isWildcard()) {
            code.add(".*");
        }
        code.add(";\n");
    }

    public void renderPackageSpec(JPackageSpec packageSpec)
    {
        code.add("package ");
        renderQualifiedName(packageSpec.getName());
        code.add(";\n");
    }

    private void renderArgs(List<JArg> args)
    {
        if (args.size() >= multilineArgCutoff) {
            code.add("(\n");
            code.indent().indent();
            boolean comma = false;
            for (JArg arg : args) {
                if (comma) {
                    code.add(",\n");
                }
                else {
                    comma = true;
                }
                renderTypeSpecifier(arg.getType());
                code.add(" $L", arg.getName().get());
            }
            code.add(")");
            code.unindent().unindent();
        }
        else {
            code.add("(");
            boolean comma = false;
            for (JArg arg : args) {
                if (comma) {
                    code.add(", ");
                }
                else {
                    comma = true;
                }
                renderTypeSpecifier(arg.getType());
                code.add(" $L", arg.getName().get());
            }
            code.add(")");
        }
    }

    public void renderDeclaration(JDeclaration curr)
    {
        curr.accept(new JDeclarationVisitor<Void, Void>()
        {
            @Override
            protected Void visitJDeclaration(JDeclaration jstatement, Void context)
            {
                throw new IllegalStateException();
            }

            @Override
            public Void visitJAnnotatedDeclaration(JAnnotatedDeclaration jdeclaration, Void context)
            {
                code.add("@");
                renderQualifiedName(jdeclaration.getAnnotation());
                jdeclaration.getOperands().ifPresent(operands -> {
                    code.add("(");
                    renderOperands(operands);
                    code.add(")");
                });
                code.add("\n");
                renderDeclaration(jdeclaration.getDeclaration());
                return null;
            }

            @Override
            public Void visitJConstructor(JConstructor jdeclaration, Void context)
            {
                renderAccess(jdeclaration.getAccess());
                code.add("$L", jdeclaration.getName().get());
                renderArgs(jdeclaration.getArgs());
                code.add("\n");
                renderStatement(jdeclaration.getBody());
                return null;
            }

            @Override
            public Void visitJDeclarationBlock(JDeclarationBlock jdeclaration, Void context)
            {
                jdeclaration.getBody().forEach(JRenderer.this::renderDeclaration);
                return null;
            }

            @Override
            public Void visitJField(JField jdeclaration, Void context)
            {
                renderAccess(jdeclaration.getAccess());
                renderTypeSpecifier(jdeclaration.getType());
                code.add(" $L", jdeclaration.getName().get());
                jdeclaration.getValue().ifPresent(v -> {
                    code.add(" = ");
                    renderExpression(v);
                });
                code.add(";\n");
                return null;
            }

            @Override
            public Void visitJInitializationBlock(JInitializationBlock jdeclaration, Void context)
            {
                renderStatement(jdeclaration.getBlock());
                return null;
            }

            @Override
            public Void visitJMethod(JMethod jdeclaration, Void context)
            {
                renderAccess(jdeclaration.getAccess());
                renderTypeSpecifier(jdeclaration.getType());
                code.add(" $L", jdeclaration.getName().get());
                renderArgs(jdeclaration.getArgs());
                if (jdeclaration.getBody().isPresent()) {
                    code.add("\n");
                    renderStatement(jdeclaration.getBody().get());
                }
                else {
                    code.add(";\n");
                }
                return null;
            }

            @Override
            public Void visitJType(JType jdeclaration, Void context)
            {
                renderAccess(jdeclaration.getAccess());
                code.add("$L $L\n", jdeclaration.getKind().toString().toLowerCase(), jdeclaration.getName().get());
                if (!jdeclaration.getInheritances().isEmpty()) {
                    code.indent().indent();
                    boolean newline = false;
                    for (JInheritance jinheritance : jdeclaration.getInheritances()) {
                        if (newline) {
                            code.add(",\n");
                        }
                        else {
                            newline = true;
                        }
                        code.add("$L ", jinheritance.getKind().toString().toLowerCase());
                        renderQualifiedName(jinheritance.getName());
                    }
                    code.add("\n");
                    code.unindent().unindent();
                }
                code.add("{\n");
                code.indent();
                boolean newline = false;
                for (JDeclaration d : jdeclaration.getBody()) {
                    if (newline) {
                        code.add("\n");
                    }
                    else {
                        newline = true;
                    }
                    renderDeclaration(d);
                }
                code.unindent();
                code.add("}\n");
                return null;
            }

            @Override
            public Void visitJVerbatimDeclaration(JVerbatimDeclaration jdeclaration, Void context)
            {
                code.add("$L", jdeclaration.getText());
                return null;
            }
        }, null);
    }

    public void renderStatement(JStatement curr)
    {
        curr.accept(new JStatementVisitor<Void, Void>()
        {
            @Override
            protected Void visitJStatement(JStatement jstatement, Void context)
            {
                throw new IllegalStateException();
            }

            @Override
            public Void visitJAnnotatedStatement(JAnnotatedStatement jstatement, Void context)
            {
                code.add("@");
                renderQualifiedName(jstatement.getAnnotation());
                jstatement.getOperands().ifPresent(operands -> {
                    code.add("(");
                    renderOperands(operands);
                    code.add(")");
                });
                code.add("\n");
                renderStatement(jstatement.getStatement());
                return null;
            }

            @Override
            public Void visitJBlank(JBlank jstatement, Void context)
            {
                code.add("\n");
                return null;
            }

            @Override
            public Void visitJBlock(JBlock jstatement, Void context)
            {
                code.add("{\n");
                code.indent();
                for (JStatement child : jstatement.getBody()) {
                    renderStatement(child);
                }
                code.unindent();
                code.add("}\n");
                return null;
            }

            @Override
            public Void visitJBreak(JBreak jstatement, Void context)
            {
                if (jstatement.getLabel().isPresent()) {
                    code.addStatement("break $L", jstatement.getLabel().get().get());
                }
                else {
                    code.addStatement("break");
                }
                return null;
            }

            @Override
            public Void visitJCase(JCase jstatement, Void context)
            {
                boolean newline = false;
                for (Object value : jstatement.getValues()) {
                    if (newline) {
                        code.add("\n");
                    }
                    else {
                        newline = true;
                    }
                    code.add("case ");
                    renderLiteralValue(value);
                    code.add(":");
                }
                if (jstatement.isDefault()) {
                    if (newline) {
                        code.add("\n");
                    }
                    code.add("default:");
                }
                code.add(" ");
                renderStatement(jstatement.getBlock());
                return null;
            }

            @Override
            public Void visitJContinue(JContinue jstatement, Void context)
            {
                if (jstatement.getLabel().isPresent()) {
                    code.addStatement("continue $L", jstatement.getLabel().get().get());
                }
                else {
                    code.addStatement("continue");
                }
                return null;
            }

            @Override
            public Void visitJDoWhileLoop(JDoWhileLoop jstatement, Void context)
            {
                code.add("do ");
                renderStatement(jstatement.getBody());
                code.add("while (");
                renderExpression(jstatement.getCondition());
                code.add(");\n");
                return null;
            }

            @Override
            public Void visitJEmpty(JEmpty jstatement, Void context)
            {
                return null;
            }

            @Override
            public Void visitJExpressionStatement(JExpressionStatement jstatement, Void context)
            {
                renderExpression(jstatement.getExpression());
                code.add(";\n");
                return null;
            }

            @Override
            public Void visitJForEach(JForEach jstatement, Void context)
            {
                code.add("for (");
                renderTypeSpecifier(jstatement.getType());
                code.add(" $L : ", jstatement.getItem().get());
                renderExpression(jstatement.getIterable());
                code.add(") ");
                renderStatement(jstatement.getBody());
                return null;
            }

            @Override
            public Void visitJIf(JIf jstatement, Void context)
            {
                code.add("if (");
                renderExpression(jstatement.getCondition());
                code.add(") ");
                renderStatement(jstatement.getIfTrue());
                if (jstatement.getIfFalse().isPresent()) {
                    code.add("else ");
                    renderStatement(jstatement.getIfFalse().get());
                }
                return null;
            }

            @Override
            public Void visitJLabeledStatement(JLabeledStatement jstatement, Void context)
            {
                code.add("$L", jstatement.getLabel().get());
                code.add(":\n");
                renderStatement(jstatement.getStatement());
                return null;
            }

            @Override
            public Void visitJReturn(JReturn jstatement, Void context)
            {
                if (jstatement.getValue().isPresent()) {
                    code.add("return ");
                    renderParamExpression(jstatement.getValue().get());
                    code.add(";\n");
                }
                else {
                    code.addStatement("return");
                }
                return null;
            }

            @Override
            public Void visitJSwitch(JSwitch jstatement, Void context)
            {
                code.add("switch (");
                renderExpression(jstatement.getSelector());
                code.add(") ");
                renderStatement(new JBlock(ImmutableList.copyOf(jstatement.getCases())));
                return null;
            }

            @Override
            public Void visitJThrow(JThrow jstatement, Void context)
            {
                code.add("throw ");
                renderParamExpression(jstatement.getException());
                code.add(";\n");
                return null;
            }

            @Override
            public Void visitJVariable(JVariable jstatement, Void context)
            {
                renderTypeSpecifier(jstatement.getType());
                code.add(" $L", jstatement.getName().get());
                jstatement.getValue().ifPresent(v -> {
                    code.add(" = ");
                    renderExpression(v);
                });
                code.add(";\n");
                return null;
            }

            @Override
            public Void visitJWhileLoop(JWhileLoop jstatement, Void context)
            {
                code.add("while (");
                renderExpression(jstatement.getCondition());
                code.add(") ");
                renderStatement(jstatement.getBody());
                return null;
            }
        }, null);
    }

    public void renderExpression(JExpression curr)
    {
        curr.accept(new JExpressionVisitor<Void, Void>()
        {
            @Override
            protected Void visitJExpression(JExpression jexpression, Void context)
            {
                throw new IllegalStateException();
            }

            @Override
            public Void visitJArrayAccess(JArrayAccess jexpression, Void context)
            {
                renderExpression(jexpression.getArray());
                code.add("[");
                renderExpression(jexpression.getIndex());
                code.add("]");
                return null;
            }

            @Override
            public Void visitJAssignment(JAssignment jexpression, Void context)
            {
                renderExpression(jexpression.getLeft());
                code.add(" = ");
                renderExpression(jexpression.getRight());
                return null;
            }

            @Override
            public Void visitJBinary(JBinary jexpression, Void context)
            {
                renderParamExpression(jexpression.getLeft());
                code.add(" ");
                code.add(jexpression.getOp().getString());
                code.add(" ");
                renderParamExpression(jexpression.getRight());
                return null;
            }

            @Override
            public Void visitJCast(JCast jexpression, Void context)
            {
                code.add("(");
                renderTypeSpecifier(jexpression.getType());
                code.add(") ");
                renderParamExpression(jexpression.getValue());
                return null;
            }

            @Override
            public Void visitJConditional(JConditional jexpression, Void context)
            {
                renderParamExpression(jexpression.getCondition());
                code.add(" ? ");
                renderParamExpression(jexpression.getIfTrue());
                code.add(" : ");
                renderParamExpression(jexpression.getIfFalse());
                return null;
            }

            @Override
            public Void visitJIdent(JIdent jexpression, Void context)
            {
                renderQualifiedName(jexpression.getName());
                return null;
            }

            @Override
            public Void visitJLiteral(JLiteral jexpression, Void context)
            {
                renderLiteralValue(jexpression.getValue());
                return null;
            }

            @Override
            public Void visitJLongArrayLiteral(JLongArrayLiteral jexpression, Void context)
            {
                if (jexpression.getItems().isEmpty()) {
                    code.add("{}");
                }
                else {
                    code.add("{\n");
                    code.indent().indent();
                    boolean comma = false;
                    for (JExpression item : jexpression.getItems()) {
                        if (comma) {
                            code.add(",\n");
                        }
                        else {
                            comma = true;
                        }
                        renderExpression(item);
                    }
                    // code.add("\n");
                    code.unindent().unindent();
                    code.add("\n}");
                }
                return null;
            }

            @Override
            public Void visitJLongStringLiteral(JLongStringLiteral jexpression, Void context)
            {
                String str = jexpression.getValue();
                code.add("\"\" + \n");
                code.indent().indent();
                for (int i = 0; i < str.length(); i += longStringLiteralLength) {
                    if (i > 0) {
                        code.add(" +\n");
                    }
                    code.add("$S", str.substring(i, Math.min(i + longStringLiteralLength, str.length())));
                }
                code.unindent().unindent();
                return null;
            }

            @Override
            public Void visitJMemberAccess(JMemberAccess jexpression, Void context)
            {
                renderExpression(jexpression.getInstance());
                code.add(".$L", jexpression.getMember().get());
                return null;
            }

            @Override
            public Void visitJMethodInvocation(JMethodInvocation jexpression, Void context)
            {
                renderExpression(jexpression.getMethod());
                code.add("(");
                renderOperands(jexpression.getOperands());
                code.add(")");
                return null;
            }

            @Override
            public Void visitJMethodReference(JMethodReference jexpression, Void context)
            {
                renderQualifiedName(jexpression.getClassName());
                code.add("::$L", jexpression.getMethodName().get());
                return null;
            }

            @Override
            public Void visitJNew(JNew jexpression, Void context)
            {
                code.add("new ");
                renderTypeSpecifier(jexpression.getType());
                code.add("(");
                renderOperands(jexpression.getOperands());
                code.add(")");
                return null;
            }

            @Override
            public Void visitJNewArray(JNewArray jexpression, Void context)
            {
                code.add("new ");
                renderTypeSpecifier(jexpression.getType());
                jexpression.getItems().ifPresent(i -> {
                    code.add(" {");
                    renderOperands(i);
                    code.add("}");
                });
                return null;
            }

            @Override
            public Void visitJUnary(JUnary jexpression, Void context)
            {
                code.add(jexpression.getOp().getPrefix());
                renderOperands(ImmutableList.of(jexpression.getValue()));
                code.add(jexpression.getOp().getSuffix());
                return null;
            }
        }, null);
    }

    public void renderParamExpression(JExpression curr)
    {
        curr.accept(new JExpressionVisitor<Void, Void>()
        {
            @Override
            protected Void visitJExpression(JExpression jexpression, Void context)
            {
                code.add("(");
                renderExpression(jexpression);
                code.add(")");
                return null;
            }

            @Override
            public Void visitJIdent(JIdent jexpression, Void context)
            {
                renderExpression(jexpression);
                return null;
            }

            @Override
            public Void visitJLiteral(JLiteral jexpression, Void context)
            {
                renderExpression(jexpression);
                return null;
            }
        }, null);
    }

    public void renderTypeSpecifier(JTypeSpecifier type)
    {
        renderQualifiedName(type.getName());
        for (JArray a : type.getArrays()) {
            code.add("[");
            a.getSize().ifPresent(this::renderExpression);
            code.add("]");
        }
    }

    public void renderQualifiedName(JQualifiedName name)
    {
        code.add("$L", Joiner.on('.').join(name.getParts().stream().map(JName::get).collect(toImmutableList())));
    }

    public void renderLiteralValue(Object value)
    {
        if (value instanceof String) {
            code.add("$S", value);
        }
        else {
            code.add(Objects.toString(value)); // FIXME lol
            if (value instanceof Float) {
                code.add("f");
            }
            else if (value instanceof Long) {
                code.add("L");
            }
        }
    }

    public void renderOperands(List<JExpression> operands)
    {
        boolean comma = false;
        for (JExpression operand : operands) {
            if (comma) {
                code.add(", ");
            }
            else {
                comma = true;
            }
            renderParamExpression(operand);
        }
    }

    public static void renderWithIndent(CodeBlock block, String indent, Appendable appendable)
    {
        try {
            CodeWriter.builder(appendable).indent(indent).build().emit(block);
        }
        catch (IOException e) {
            throw Throwables.propagate(e);
        }
    }

    public static String renderWithIndent(CodeBlock block, String indent)
    {
        StringWriter out = new StringWriter();
        renderWithIndent(block, indent, out);
        return out.toString();
    }

    public static void renderWithIndent(Consumer<JRenderer> renderer, String indent, Appendable appendable)
    {
        CodeBlock.Builder code = CodeBlock.builder();
        renderer.accept(new JRenderer(code));
        CodeBlock block = code.build();

        renderWithIndent(block, indent, appendable);
    }

    @VisibleForTesting
    public static String renderWithIndent(JCompilationUnit jcompilationUnit, String indent)
    {
        StringWriter out = new StringWriter();
        renderWithIndent(r -> r.renderCompilationUnit(jcompilationUnit), indent, out);
        return out.toString();
    }

    @VisibleForTesting
    public static String renderWithIndent(JDeclaration jdeclaration, String indent)
    {
        StringWriter out = new StringWriter();
        renderWithIndent(r -> r.renderDeclaration(jdeclaration), indent, out);
        return out.toString();
    }
}
