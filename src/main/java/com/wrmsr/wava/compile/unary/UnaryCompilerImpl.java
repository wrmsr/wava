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
package com.wrmsr.wava.compile.unary;

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.compile.module.ModuleCompilationParticipant;
import com.wrmsr.wava.core.node.Unary;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.JTypeSpecifier;
import com.wrmsr.wava.java.lang.op.JBinaryOp;
import com.wrmsr.wava.java.lang.op.JUnaryOp;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclaration;
import com.wrmsr.wava.java.lang.tree.expression.JBinary;
import com.wrmsr.wava.java.lang.tree.expression.JCast;
import com.wrmsr.wava.java.lang.tree.expression.JExpression;
import com.wrmsr.wava.java.lang.tree.expression.JLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JMethodInvocation;
import com.wrmsr.wava.java.lang.tree.expression.JUnary;

import javax.inject.Inject;

import java.util.List;

import static com.wrmsr.wava.compile.Compilation.newBooleanToInt;
import static com.wrmsr.wava.compile.Compilation.newDoubleToLong;
import static com.wrmsr.wava.compile.Compilation.newFloatToInt;
import static com.wrmsr.wava.compile.Compilation.newIntToFloat;
import static com.wrmsr.wava.compile.Compilation.newLongToDouble;
import static com.wrmsr.wava.compile.Compilation.translateAnticondition;

public final class UnaryCompilerImpl
        implements UnaryCompiler, ModuleCompilationParticipant
{
    @Inject
    public UnaryCompilerImpl()
    {
    }

    @Override
    public List<JDeclaration> createPostCtorDeclarations()
    {
        return Truncation.TRUNCATION_FUNCTIONS;
    }

    @Override
    public JExpression compileUnary(Unary node, JExpression value)
    {
        switch (node.getOp()) {
            case Clz: {
                switch (node.getType()) {
                    case I32: {
                        return JMethodInvocation.of(
                                JQualifiedName.parse("java.lang.Integer.numberOfLeadingZeros"),
                                ImmutableList.of(value));
                    }
                    case I64: {
                        return new JCast(
                                JTypeSpecifier.of("long"),
                                JMethodInvocation.of(
                                        JQualifiedName.parse("java.lang.Long.numberOfLeadingZeros"),
                                        ImmutableList.of(value)));
                    }
                }
            }
            case Ctz: {
                switch (node.getType()) {
                    case I32: {
                        return JMethodInvocation.of(
                                JQualifiedName.parse("java.lang.Integer.numberOfTrailingZeros"),
                                ImmutableList.of(value));
                    }
                    case I64: {
                        return new JCast(
                                JTypeSpecifier.of("long"),
                                JMethodInvocation.of(
                                        JQualifiedName.parse("java.lang.Long.numberOfTrailingZeros"),
                                        ImmutableList.of(value)));
                    }
                }
            }
            case Popcnt: {
                switch (node.getType()) {
                    case I32: {
                        return JMethodInvocation.of(
                                JQualifiedName.parse("java.lang.Integer.bitCount"),
                                ImmutableList.of(value));
                    }
                    case I64: {
                        return new JCast(
                                JTypeSpecifier.of("long"),
                                JMethodInvocation.of(
                                        JQualifiedName.parse("java.lang.Long.bitCount"),
                                        ImmutableList.of(value)));
                    }
                }
            }

            case Neg: {
                return new JUnary(
                        JUnaryOp.Minus,
                        value);
            }
            case Abs: {
                return JMethodInvocation.of(
                        JQualifiedName.parse("java.lang.Math.abs"),
                        ImmutableList.of(value));
            }

            case Ceil: {
                switch (node.getType()) {
                    case F32: {
                        return new JCast(
                                JTypeSpecifier.of("float"),
                                JMethodInvocation.of(
                                        JQualifiedName.parse("java.lang.Math.ceil"),
                                        ImmutableList.of(value)));
                    }
                    case F64: {
                        return JMethodInvocation.of(
                                JQualifiedName.parse("java.lang.Math.ceil"),
                                ImmutableList.of(value));
                    }
                }
            }
            case Floor: {
                switch (node.getType()) {
                    case F32: {
                        return new JCast(
                                JTypeSpecifier.of("float"),
                                JMethodInvocation.of(
                                        JQualifiedName.parse("java.lang.Math.floor"),
                                        ImmutableList.of(value)));
                    }
                    case F64: {
                        return JMethodInvocation.of(
                                JQualifiedName.parse("java.lang.Math.floor"),
                                ImmutableList.of(value));
                    }
                }
            }
            case Sqrt: {
                switch (node.getType()) {
                    case F32: {
                        return new JCast(
                                JTypeSpecifier.of("float"),
                                JMethodInvocation.of(
                                        JQualifiedName.parse("java.lang.Math.sqrt"),
                                        ImmutableList.of(value)));
                    }
                    case F64: {
                        return JMethodInvocation.of(
                                JQualifiedName.parse("java.lang.Math.sqrt"),
                                ImmutableList.of(value));
                    }
                }
            }
            case Nearest: {
                return JMethodInvocation.of(
                        JQualifiedName.parse("java.lang.Math.round"),
                        ImmutableList.of(value));
            }
            case Trunc: {
                switch (node.getType()) {
                    case F32: {
                        return new JCast(
                                JTypeSpecifier.of("int"),
                                value);
                    }
                    case F64: {
                        return new JCast(
                                JTypeSpecifier.of("long"),
                                value);
                    }
                }
            }

            case EqZ: {
                return newBooleanToInt(
                        translateAnticondition(value));
            }

            case ExtendSInt32: {
                return new JCast(
                        JTypeSpecifier.of("long"),
                        value);
            }
            case ExtendUInt32: {
                return new JBinary(
                        JBinaryOp.BitwiseAnd,
                        value,
                        new JLiteral(0xFFFFFFFFL));
            }
            case WrapInt64: {
                return new JCast(
                        JTypeSpecifier.of("int"),
                        value);
            }

            case TruncSFloat32: {
                switch (node.getType()) {
                    case I32: {
                        return JMethodInvocation.of(
                                JQualifiedName.of("_truncateFloatToSignedInteger"),
                                ImmutableList.of(
                                        value));
                    }
                    case I64: {
                        return JMethodInvocation.of(
                                JQualifiedName.of("_truncateFloatToSignedLong"),
                                ImmutableList.of(
                                        value));
                    }
                }
            }
            case TruncUFloat32: {
                switch (node.getType()) {
                    case I32: {
                        return JMethodInvocation.of(
                                JQualifiedName.of("_truncateFloatToUnsignedInteger"),
                                ImmutableList.of(
                                        value));
                    }
                    case I64: {
                        return JMethodInvocation.of(
                                JQualifiedName.of("_truncateFloatToUnsignedLong"),
                                ImmutableList.of(
                                        value));
                    }
                }
            }
            case TruncSFloat64: {
                switch (node.getType()) {
                    case I32: {
                        return JMethodInvocation.of(
                                JQualifiedName.of("_truncateDoubleToSignedInteger"),
                                ImmutableList.of(
                                        value));
                    }
                    case I64: {
                        return JMethodInvocation.of(
                                JQualifiedName.of("_truncateDoubleToSignedLong"),
                                ImmutableList.of(
                                        value));
                    }
                }
            }
            case TruncUFloat64: {
                switch (node.getType()) {
                    case I32: {
                        return JMethodInvocation.of(
                                JQualifiedName.of("_truncateDoubleToUnsignedInteger"),
                                ImmutableList.of(
                                        value));
                    }
                    case I64: {
                        return JMethodInvocation.of(
                                JQualifiedName.of("_truncateDoubleToUnsignedLong"),
                                ImmutableList.of(
                                        value));
                    }
                }
            }

            // FIXME mason dixon

            case ReinterpretFloat: {
                switch (node.getType()) {
                    case I32: {
                        return newFloatToInt(value);
                    }
                    case I64: {
                        return newDoubleToLong(value);
                    }
                }
            }

            case ConvertSInt32: {
                switch (node.getType()) {
                    case F32: {
                        return new JCast(
                                JTypeSpecifier.of("float"),
                                value);
                    }
                    case F64: {
                        return new JCast(
                                JTypeSpecifier.of("double"),
                                value);
                    }
                }
            }
            case ConvertUInt32: {
                switch (node.getType()) {
                    case F32: {
                        return new JCast(
                                JTypeSpecifier.of("float"),
                                new JBinary(
                                        JBinaryOp.BitwiseAnd,
                                        value,
                                        new JLiteral(
                                                0xFFFFFFFFL)));
                    }
                    case F64: {
                        return new JCast(
                                JTypeSpecifier.of("double"),
                                new JBinary(
                                        JBinaryOp.BitwiseAnd,
                                        value,
                                        new JLiteral(
                                                0xFFFFFFFFL)));
                    }
                }
            }
            case ConvertSInt64: {
                switch (node.getType()) {
                    case F32: {
                        return new JCast(
                                JTypeSpecifier.of("float"),
                                value);
                    }
                    case F64: {
                        return new JCast(
                                JTypeSpecifier.of("double"),
                                value);
                    }
                }
            }
            case ConvertUInt64: {
                // FIXME
                break;
            }

            case PromoteFloat32: {
                return new JCast(
                        JTypeSpecifier.of("double"),
                        value);
            }
            case DemoteFloat64: {
                // checkArgument type == F64
                return new JCast(
                        JTypeSpecifier.of("float"),
                        value);
            }
            case ReinterpretInt: {
                switch (node.getType()) {
                    case F32: {
                        return newIntToFloat(value);
                    }
                    case F64: {
                        return newLongToDouble(value);
                    }
                }
            }
        }

        throw new IllegalStateException();
    }
}
