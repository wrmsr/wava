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
package com.wrmsr.wava.compile;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.core.unit.Function;
import com.wrmsr.wava.java.lang.JArg;
import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.JTypeSpecifier;
import com.wrmsr.wava.java.lang.op.JBinaryOp;
import com.wrmsr.wava.java.lang.tree.expression.JBinary;
import com.wrmsr.wava.java.lang.tree.expression.JConditional;
import com.wrmsr.wava.java.lang.tree.expression.JExpression;
import com.wrmsr.wava.java.lang.tree.expression.JLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JMethodInvocation;
import com.wrmsr.wava.java.lang.tree.statement.JBlock;
import com.wrmsr.wava.java.lang.tree.statement.JStatement;
import com.wrmsr.wava.java.lang.tree.statement.JVariable;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.wrmsr.wava.java.lang.tree.JTrees.JONE;
import static com.wrmsr.wava.java.lang.tree.JTrees.JZERO;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;

public final class Compilation
{
    private Compilation()
    {
    }

    public static final Map<Type, JTypeSpecifier> PRIMITIVE_TYPE_MAP = ImmutableMap.<Type, JTypeSpecifier>builder()
            .put(Type.NONE, JTypeSpecifier.of("void"))
            .put(Type.I32, JTypeSpecifier.of("int"))
            .put(Type.I64, JTypeSpecifier.of("long"))
            .put(Type.F32, JTypeSpecifier.of("float"))
            .put(Type.F64, JTypeSpecifier.of("double"))
            .build();

    public static final Map<Type, JTypeSpecifier> BOXED_TYPE_MAP = ImmutableMap.<Type, JTypeSpecifier>builder()
            .put(Type.NONE, JTypeSpecifier.of("java", "lang", "Void"))
            .put(Type.I32, JTypeSpecifier.of("java", "lang", "Integer"))
            .put(Type.I64, JTypeSpecifier.of("java", "lang", "Long"))
            .put(Type.F32, JTypeSpecifier.of("java", "lang", "Float"))
            .put(Type.F64, JTypeSpecifier.of("java", "lang", "Double"))
            .build();

    public static JExpression newIntToFloat(JExpression value)
    {
        return JMethodInvocation.of(
                JQualifiedName.of("java", "lang", "Float", "intBitsToFloat"),
                ImmutableList.of(value));
    }

    public static JExpression newFloatToInt(JExpression value)
    {
        return JMethodInvocation.of(
                JQualifiedName.of("java", "lang", "Float", "floatToRawIntBits"),
                ImmutableList.of(value));
    }

    public static JExpression newLongToDouble(JExpression value)
    {
        return JMethodInvocation.of(
                JQualifiedName.of("java", "lang", "Double", "longBitsToDouble"),
                ImmutableList.of(value));
    }

    public static JExpression newDoubleToLong(JExpression value)
    {
        return JMethodInvocation.of(
                JQualifiedName.of("java", "lang", "Double", "doubleToRawLongBits"),
                ImmutableList.of(value));
    }

    public static JExpression newFlipLong(JExpression value)
    {
        return new JBinary(
                JBinaryOp.BitwiseXor,
                value,
                new JLiteral(
                        Long.MIN_VALUE));
    }

    public static JExpression newCastUnsignedIntToLong(JExpression value)
    {
        return new JBinary(
                JBinaryOp.BitwiseAnd,
                value,
                new JLiteral(0xFFFFFFFFL));
    }

    public static JExpression newBooleanToInt(JExpression value)
    {
        return new JConditional(
                value,
                JONE,
                JZERO);
    }

    public static JExpression translateCondition(JExpression jcondition)
    {
        if (jcondition instanceof JConditional) {
            JConditional jconditional = (JConditional) jcondition;
            if (jconditional.getIfTrue().equals(JONE) && jconditional.getIfFalse().equals(JZERO)) {
                return jconditional.getCondition();
            }
        }
        return new JBinary(
                JBinaryOp.NotEquals,
                jcondition,
                JZERO);
    }

    public static JExpression translateAnticondition(JExpression jcondition)
    {
        if (jcondition instanceof JConditional) {
            JConditional jconditional = (JConditional) jcondition;
            if (jconditional.getIfTrue().equals(JZERO) && jconditional.getIfFalse().equals(JONE)) {
                return jconditional.getCondition();
            }
        }
        return new JBinary(
                JBinaryOp.Equals,
                jcondition,
                JZERO);
    }

    public static List<JArg> compileArgs(Function function)
    {
        return function.getArgLocals().stream()
                .map(l -> new JArg(
                        PRIMITIVE_TYPE_MAP.get(l.getType()),
                        JName.of(l.getName().get())))
                .collect(toImmutableList());
    }

    public static JStatement compileLocalDecls(Function function)
    {
        return new JBlock(
                function.getNonArgLocals().stream()
                        .map(l -> new JVariable(
                                PRIMITIVE_TYPE_MAP.get(l.getType()),
                                getLocalName(function, l.getIndex()),
                                Optional.of(new JLiteral(
                                        l.getType().zero()))))
                        .collect(toImmutableList()));
    }

    public static JName getLocalName(Function function, Index index)
    {
        Name name = function.getLocals().getLocal(index).getName();
        return JName.of(name.get());
    }
}
