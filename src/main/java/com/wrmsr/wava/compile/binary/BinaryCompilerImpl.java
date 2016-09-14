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
package com.wrmsr.wava.compile.binary;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.wrmsr.wava.compile.module.ModuleCompilationParticipant;
import com.wrmsr.wava.core.node.Binary;
import com.wrmsr.wava.core.op.BinaryOp;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.JTypeSpecifier;
import com.wrmsr.wava.java.lang.op.JBinaryOp;
import com.wrmsr.wava.java.lang.tree.expression.JBinary;
import com.wrmsr.wava.java.lang.tree.expression.JCast;
import com.wrmsr.wava.java.lang.tree.expression.JExpression;
import com.wrmsr.wava.java.lang.tree.expression.JLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JMethodInvocation;

import javax.inject.Inject;

import java.util.Map;

import static com.wrmsr.wava.compile.Compilation.newBooleanToInt;
import static com.wrmsr.wava.compile.Compilation.newCastUnsignedIntToLong;
import static com.wrmsr.wava.compile.Compilation.newDoubleToLong;
import static com.wrmsr.wava.compile.Compilation.newFlipLong;
import static com.wrmsr.wava.compile.Compilation.newFloatToInt;
import static com.wrmsr.wava.compile.Compilation.newIntToFloat;
import static com.wrmsr.wava.compile.Compilation.newLongToDouble;
import static java.util.Objects.requireNonNull;

public final class BinaryCompilerImpl
        implements BinaryCompiler, ModuleCompilationParticipant
{
    @Inject
    public BinaryCompilerImpl()
    {
    }

    private static final Map<BinaryOp, JBinaryOp> BINARY_OP_MAP = ImmutableMap.<BinaryOp, JBinaryOp>builder()
            .put(BinaryOp.Add, JBinaryOp.Add)
            .put(BinaryOp.Sub, JBinaryOp.Subtract)
            .put(BinaryOp.Mul, JBinaryOp.Multiply)

            .put(BinaryOp.DivS, JBinaryOp.Divide)
            .put(BinaryOp.DivU, JBinaryOp.Divide) // FIXME
            .put(BinaryOp.RemS, JBinaryOp.Remainder)
            .put(BinaryOp.RemU, JBinaryOp.Remainder) // FIXME
            .put(BinaryOp.And, JBinaryOp.BitwiseAnd)
            .put(BinaryOp.Or, JBinaryOp.BitwiseOr)
            .put(BinaryOp.Xor, JBinaryOp.BitwiseXor)
            .put(BinaryOp.Shl, JBinaryOp.LeftShift)
            .put(BinaryOp.ShrU, JBinaryOp.RightShiftUnsigned) // FIXME min(c & 0x1F) ?
            .put(BinaryOp.ShrS, JBinaryOp.RightShiftSigned)
            .put(BinaryOp.Div, JBinaryOp.Divide)

            .put(BinaryOp.Eq, JBinaryOp.Equals)
            .put(BinaryOp.Ne, JBinaryOp.NotEquals)
            .put(BinaryOp.LtS, JBinaryOp.LessThan)
            .put(BinaryOp.LeS, JBinaryOp.LessThanOrEqual)
            .put(BinaryOp.GtS, JBinaryOp.GreaterThan)
            .put(BinaryOp.GeS, JBinaryOp.GreaterThanOrEqual)

            .put(BinaryOp.Lt, JBinaryOp.LessThan)
            .put(BinaryOp.Le, JBinaryOp.LessThanOrEqual)
            .put(BinaryOp.Gt, JBinaryOp.GreaterThan)
            .put(BinaryOp.Ge, JBinaryOp.GreaterThanOrEqual)

            .put(BinaryOp.CondAnd, JBinaryOp.ConditionalAnd)
            .put(BinaryOp.CondOr, JBinaryOp.ConditionalOr)

            .build();

    @Override
    public JExpression compileBinary(Binary node, JExpression left, JExpression right)
    {
        switch (node.getOp()) {
            case RotL: {
                switch (node.getType()) {
                    case I32: {
                        return JMethodInvocation.of(
                                JQualifiedName.of("java", "lang", "Integer", "rotateLeft"),
                                ImmutableList.of(
                                        left,
                                        new JCast(
                                                JTypeSpecifier.of("int"),
                                                right)));
                    }
                    case I64: {
                        return JMethodInvocation.of(
                                JQualifiedName.of("java", "lang", "Long", "rotateLeft"),
                                ImmutableList.of(
                                        left,
                                        new JCast(
                                                JTypeSpecifier.of("int"),
                                                right)));
                    }
                }
            }
            case RotR: {
                switch (node.getType()) {
                    case I32: {
                        return JMethodInvocation.of(
                                JQualifiedName.of("java", "lang", "Integer", "rotateRight"),
                                ImmutableList.of(
                                        left,
                                        new JCast(
                                                JTypeSpecifier.of("int"),
                                                right)));
                    }
                    case I64: {
                        return JMethodInvocation.of(
                                JQualifiedName.of("java", "lang", "Long", "rotateRight"),
                                ImmutableList.of(
                                        left,
                                        new JCast(
                                                JTypeSpecifier.of("int"),
                                                right)));
                    }
                }
            }

            case CopySign: {
                // operate on bits directly, to avoid signalling bit being set on a float
                switch (node.getType()) {
                    case F32: {
                        // case WasmType::f32: return Literal((i32 & 0x7fffffff) | (other.i32 & 0x80000000)).castToF32(); break;
                        return newIntToFloat(
                                new JBinary(
                                        JBinaryOp.BitwiseOr,
                                        new JBinary(
                                                JBinaryOp.BitwiseAnd,
                                                newFloatToInt(left),
                                                new JLiteral(
                                                        0x7fffffff)),
                                        new JBinary(
                                                JBinaryOp.BitwiseAnd,
                                                newFloatToInt(right),
                                                new JLiteral(
                                                        0x80000000))));
                    }
                    case F64: {
                        // case WasmType::f64: return Literal((i64 & 0x7fffffffffffffffUL) | (other.i64 & 0x8000000000000000UL)).castToF64(); break;
                        return newLongToDouble(
                                new JBinary(
                                        JBinaryOp.BitwiseOr,
                                        new JBinary(
                                                JBinaryOp.BitwiseAnd,
                                                newDoubleToLong(left),
                                                new JLiteral(
                                                        0x7fffffffffffffffL)),
                                        new JBinary(
                                                JBinaryOp.BitwiseAnd,
                                                newDoubleToLong(right),
                                                new JLiteral(
                                                        0x8000000000000000L))));
                    }
                }
            }
            case Min: {
                // FIXME: nans?
                switch (node.getType()) {
                    case F32: {
                        return JMethodInvocation.of(
                                JQualifiedName.of("java", "lang", "Float", "min"),
                                ImmutableList.of(left, right));
                    }
                    case F64: {
                        return JMethodInvocation.of(
                                JQualifiedName.of("java", "lang", "Double", "min"),
                                ImmutableList.of(left, right));
                    }
                }
            }
            case Max: {
                // FIXME: nans?
                switch (node.getType()) {
                    case F32: {
                        return JMethodInvocation.of(
                                JQualifiedName.of("java", "lang", "Float", "max"),
                                ImmutableList.of(left, right));
                    }
                    case F64: {
                        return JMethodInvocation.of(
                                JQualifiedName.of("java", "lang", "Double", "max"),
                                ImmutableList.of(left, right));
                    }
                }
            }
            case LtU: {
                switch (node.getType()) {
                    case I32: {
                        return newBooleanToInt(
                                new JBinary(
                                        JBinaryOp.LessThan,
                                        newCastUnsignedIntToLong(left),
                                        newCastUnsignedIntToLong(right)));
                    }
                    case I64: {
                        return newBooleanToInt(
                                new JBinary(
                                        JBinaryOp.LessThan,
                                        newFlipLong(left),
                                        newFlipLong(right)));
                    }
                }
            }
            case LeU: {
                switch (node.getType()) {
                    case I32: {
                        return newBooleanToInt(
                                new JBinary(
                                        JBinaryOp.LessThanOrEqual,
                                        newCastUnsignedIntToLong(left),
                                        newCastUnsignedIntToLong(right)));
                    }
                    case I64: {
                        return newBooleanToInt(
                                new JBinary(
                                        JBinaryOp.LessThanOrEqual,
                                        newFlipLong(left),
                                        newFlipLong(right)));
                    }
                }
            }
            case GtU: {
                switch (node.getType()) {
                    case I32: {
                        return newBooleanToInt(
                                new JBinary(
                                        JBinaryOp.GreaterThan,
                                        newCastUnsignedIntToLong(left),
                                        newCastUnsignedIntToLong(right)));
                    }
                    case I64: {
                        return newBooleanToInt(
                                new JBinary(
                                        JBinaryOp.GreaterThan,
                                        newFlipLong(left),
                                        newFlipLong(right)));
                    }
                }
            }
            case GeU: {
                switch (node.getType()) {
                    case I32: {
                        return newBooleanToInt(
                                new JBinary(
                                        JBinaryOp.GreaterThanOrEqual,
                                        newCastUnsignedIntToLong(left),
                                        newCastUnsignedIntToLong(right)));
                    }
                    case I64: {
                        return newBooleanToInt(
                                new JBinary(
                                        JBinaryOp.GreaterThanOrEqual,
                                        newFlipLong(left),
                                        newFlipLong(right)));
                    }
                }
            }
        }

        JBinaryOp jop = requireNonNull(BINARY_OP_MAP.get(node.getOp()));
        JExpression jexpression = new JBinary(
                jop,
                left,
                right);
        if (node.getOp().isBoolean()) {
            jexpression = newBooleanToInt(jexpression);
        }
        return jexpression;
    }
}
