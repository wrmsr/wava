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
import com.wrmsr.wava.java.lang.JAccess;
import com.wrmsr.wava.java.lang.JArg;
import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.JTypeSpecifier;
import com.wrmsr.wava.java.lang.op.JBinaryOp;
import com.wrmsr.wava.java.lang.op.JUnaryOp;
import com.wrmsr.wava.java.lang.tree.declaration.JAnnotatedDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JMethod;
import com.wrmsr.wava.java.lang.tree.expression.JBinary;
import com.wrmsr.wava.java.lang.tree.expression.JCast;
import com.wrmsr.wava.java.lang.tree.expression.JExpression;
import com.wrmsr.wava.java.lang.tree.expression.JIdent;
import com.wrmsr.wava.java.lang.tree.expression.JLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JMethodInvocation;
import com.wrmsr.wava.java.lang.tree.expression.JNew;
import com.wrmsr.wava.java.lang.tree.expression.JUnary;
import com.wrmsr.wava.java.lang.tree.statement.JBlock;
import com.wrmsr.wava.java.lang.tree.statement.JIf;
import com.wrmsr.wava.java.lang.tree.statement.JReturn;
import com.wrmsr.wava.java.lang.tree.statement.JStatement;
import com.wrmsr.wava.java.lang.tree.statement.JThrow;
import com.wrmsr.wava.java.lang.tree.statement.JVariable;

import java.util.List;
import java.util.Optional;

import static com.google.common.collect.Sets.immutableEnumSet;

public final class Truncation
{
    private static final JQualifiedName FLOAT_BOX = JQualifiedName.parse("java.lang.Float");
    private static final JQualifiedName DOUBLE_BOX = JQualifiedName.parse("java.lang.Double");
    private static final JQualifiedName INTEGER_BOX = JQualifiedName.parse("java.lang.Integer");
    private static final JQualifiedName LONG_BOX = JQualifiedName.parse("java.lang.Long");

    private static final JQualifiedName FLOAT_PRIM = JQualifiedName.of("float");
    private static final JQualifiedName DOUBLE_PRIM = JQualifiedName.of("double");
    private static final JQualifiedName INTEGER_PRIM = JQualifiedName.of("int");
    private static final JQualifiedName LONG_PRIM = JQualifiedName.of("long");

    private static final JExpression LONG_MIN = new JIdent(JQualifiedName.parse("java.lang.Long.MIN_VALUE"));

    private Truncation()
    {
    }

    private static JBlock newBlock(JStatement... body)
    {
        return new JBlock(
                ImmutableList.copyOf(body));
    }

    private static JStatement newIfThrow(JExpression condition)
    {
        return new JIf(
                condition,
                newBlock(
                        new JThrow(
                                new JNew(
                                        JTypeSpecifier.of("java", "lang", "IllegalStateException"),
                                        ImmutableList.of()))),
                Optional.empty());
    }

    private static JExpression newRef(String name)
    {
        return new JIdent(JQualifiedName.of(name));
    }

    private static JStatement newIfNanThrow(JQualifiedName box)
    {
        return newIfThrow(
                new JMethodInvocation(
                        new JIdent(JQualifiedName.of(box, "isNaN")),
                        ImmutableList.of(newRef("val"))));
    }

    private static JStatement newReturn(JQualifiedName... casts)
    {
        JExpression value = newRef("val");
        for (int i = casts.length - 1; i >= 0; --i) {
            value = new JCast(JTypeSpecifier.of(casts[i]), value);
        }
        return new JReturn(Optional.of(value));
    }

    private static JStatement newReturnUnsignedLong(JQualifiedName prim)
    {
        return new JIf(
                new JBinary(
                        JBinaryOp.GreaterThanOrEqual,
                        newRef("val"),
                        new JUnary(
                                JUnaryOp.Minus,
                                new JCast(JTypeSpecifier.of(prim), LONG_MIN))),
                newBlock(
                        new JReturn(
                                Optional.of(
                                        new JBinary(
                                                JBinaryOp.BitwiseXor,
                                                new JCast(
                                                        JTypeSpecifier.of(LONG_PRIM),
                                                        new JBinary(
                                                                JBinaryOp.Add,
                                                                newRef("val"),
                                                                new JCast(JTypeSpecifier.of(prim), LONG_MIN))),

                                                LONG_MIN)))),
                Optional.of(
                        newBlock(
                                new JReturn(
                                        Optional.of(
                                                new JCast(JTypeSpecifier.of(LONG_PRIM), newRef("val")))))));
    }

    private static JExpression newCompareUnsignedLong(JBinaryOp op, JExpression left, JExpression right)
    {
        return new JBinary(
                op,
                new JBinary(JBinaryOp.Add, left, LONG_MIN),
                new JBinary(JBinaryOp.Add, right, LONG_MIN));
    }

    // // 3 32222222 222...00
    // // 1 09876543 210...10
    // // -------------------
    // // 0 00000000 000...00 => 0x00000000 => 0
    // // 0 10011101 111...11 => 0x4effffff => 2147483520                  (~INT32_MAX)
    // // 0 10011110 000...00 => 0x4f000000 => 2147483648
    // // 0 10011110 111...11 => 0x4f7fffff => 4294967040                 (~UINT32_MAX)
    // // 0 10111110 111...11 => 0x5effffff => 9223371487098961920         (~INT64_MAX)
    // // 0 10111110 000...00 => 0x5f000000 => 9223372036854775808
    // // 0 10111111 111...11 => 0x5f7fffff => 18446742974197923840       (~UINT64_MAX)
    // // 0 10111111 000...00 => 0x5f800000 => 18446744073709551616
    // // 0 11111111 000...00 => 0x7f800000 => inf
    // // 0 11111111 000...01 => 0x7f800001 => nan(0x1)
    // // 0 11111111 111...11 => 0x7fffffff => nan(0x7fffff)
    // // 1 00000000 000...00 => 0x80000000 => -0
    // // 1 01111110 111...11 => 0xbf7fffff => -1 + ulp      (~UINT32_MIN, ~UINT64_MIN)
    // // 1 01111111 000...00 => 0xbf800000 => -1
    // // 1 10011110 000...00 => 0xcf000000 => -2147483648                  (INT32_MIN)
    // // 1 10111110 000...00 => 0xdf000000 => -9223372036854775808         (INT64_MIN)
    // // 1 11111111 000...00 => 0xff800000 => -inf
    // // 1 11111111 000...01 => 0xff800001 => -nan(0x1)
    // // 1 11111111 111...11 => 0xffffffff => -nan(0x7fffff)

    // bool wasm::isInRangeI32TruncS(int32_t i) {
    //     uint32_t u = i;
    //     return (u < 0x4f000000U) || (u >= 0x80000000U && u <= 0xcf000000U);
    // }

    // bool wasm::isInRangeI64TruncS(int32_t i) {
    //     uint32_t u = i;
    //     return (u < 0x5f000000U) || (u >= 0x80000000U && u <= 0xdf000000U);
    // }

    // bool wasm::isInRangeI32TruncU(int32_t i) {
    //     uint32_t u = i;
    //     return (u < 0x4f800000U) || (u >= 0x80000000U && u < 0xbf800000U);
    // }

    // bool wasm::isInRangeI64TruncU(int32_t i) {
    //     uint32_t u = i;
    //     return (u < 0x5f800000U) || (u >= 0x80000000U && u < 0xbf800000U);
    // }

    // // 6 66655555555 5544...222221...000
    // // 3 21098765432 1098...432109...210
    // // ---------------------------------
    // // 0 00000000000 0000...000000...000 0x0000000000000000 => 0
    // // 0 10000011101 1111...111000...000 0x41dfffffffc00000 => 2147483647               (INT32_MAX)
    // // 0 10000011110 1111...111100...000 0x41efffffffe00000 => 4294967295              (UINT32_MAX)
    // // 0 10000111101 1111...111111...111 0x43dfffffffffffff => 9223372036854774784     (~INT64_MAX)
    // // 0 10000111110 0000...000000...000 0x43e0000000000000 => 9223372036854775808
    // // 0 10000111110 1111...111111...111 0x43efffffffffffff => 18446744073709549568   (~UINT64_MAX)
    // // 0 10000111111 0000...000000...000 0x43f0000000000000 => 18446744073709551616
    // // 0 11111111111 0000...000000...000 0x7ff0000000000000 => inf
    // // 0 11111111111 0000...000000...001 0x7ff0000000000001 => nan(0x1)
    // // 0 11111111111 1111...111111...111 0x7fffffffffffffff => nan(0xfff...)
    // // 1 00000000000 0000...000000...000 0x8000000000000000 => -0
    // // 1 01111111110 1111...111111...111 0xbfefffffffffffff => -1 + ulp  (~UINT32_MIN, ~UINT64_MIN)
    // // 1 01111111111 0000...000000...000 0xbff0000000000000 => -1
    // // 1 10000011110 0000...000000...000 0xc1e0000000000000 => -2147483648              (INT32_MIN)
    // // 1 10000111110 0000...000000...000 0xc3e0000000000000 => -9223372036854775808     (INT64_MIN)
    // // 1 11111111111 0000...000000...000 0xfff0000000000000 => -inf
    // // 1 11111111111 0000...000000...001 0xfff0000000000001 => -nan(0x1)
    // // 1 11111111111 1111...111111...111 0xffffffffffffffff => -nan(0xfff...)

    // bool wasm::isInRangeI32TruncS(int64_t i) {
    //     uint64_t u = i;
    //     return (u <= 0x41dfffffffc00000ULL) || (u >= 0x8000000000000000ULL && u <= 0xc1e0000000000000ULL);
    // }

    // bool wasm::isInRangeI32TruncU(int64_t i) {
    //     uint64_t u = i;
    //     return (u <= 0x41efffffffe00000ULL) || (u >= 0x8000000000000000ULL && u <= 0xbfefffffffffffffULL);
    // }

    // bool wasm::isInRangeI64TruncS(int64_t i) {
    //     uint64_t u = i;
    //     return (u < 0x43e0000000000000ULL) || (u >= 0x8000000000000000ULL && u <= 0xc3e0000000000000ULL);
    // }

    // bool wasm::isInRangeI64TruncU(int64_t i) {
    //     uint64_t u = i;
    //     return (u < 0x43f0000000000000ULL) || (u >= 0x8000000000000000ULL && u <= 0xbfefffffffffffffULL);
    // }

    private static JStatement newFloatTruncationBoundsCheck(long max, long min)
    {
        return newBlock(
                new JVariable(
                        JTypeSpecifier.of(LONG_PRIM),
                        JName.of("bits"),
                        Optional.of(
                                new JMethodInvocation(
                                        new JIdent(JQualifiedName.parse("java.lang.Float.floatToRawIntBits")),
                                        ImmutableList.of(newRef("val"))))),
                newIfThrow(
                        new JUnary(
                                JUnaryOp.LogicalComplement,
                                new JBinary(
                                        JBinaryOp.ConditionalOr,
                                        new JBinary(JBinaryOp.LessThan, newRef("bits"), new JLiteral(max)),
                                        new JBinary(
                                                JBinaryOp.ConditionalAnd,
                                                new JBinary(JBinaryOp.GreaterThanOrEqual, newRef("bits"), new JLiteral(0x80000000L)),
                                                new JBinary(JBinaryOp.LessThan, newRef("bits"), new JLiteral(min)))))));
    }

    private static JStatement newDoubleTruncationBoundsCheck(long max, long min)
    {
        return newBlock(
                new JVariable(
                        JTypeSpecifier.of(LONG_PRIM),
                        JName.of("bits"),
                        Optional.of(
                                new JMethodInvocation(
                                        new JIdent(JQualifiedName.parse("java.lang.Double.doubleToRawLongBits")),
                                        ImmutableList.of(newRef("val"))))),
                newIfThrow(
                        new JUnary(
                                JUnaryOp.LogicalComplement,
                                new JBinary(
                                        JBinaryOp.ConditionalOr,
                                        newCompareUnsignedLong(JBinaryOp.LessThan, newRef("bits"), new JLiteral(max)),
                                        new JBinary(
                                                JBinaryOp.ConditionalAnd,
                                                newCompareUnsignedLong(JBinaryOp.GreaterThanOrEqual, newRef("bits"), new JLiteral(0x8000000000000000L)),
                                                newCompareUnsignedLong(JBinaryOp.LessThan, newRef("bits"), new JLiteral(min)))))));
    }

    private static JDeclaration newConvertFunction(String name, JQualifiedName fromPrim, JQualifiedName toPrim, JStatement... body)
    {
        return new JAnnotatedDeclaration(
                JQualifiedName.parse("java.lang.SuppressWarnings"),
                Optional.of(
                        ImmutableList.of(
                                new JLiteral("NumericOverflow"))),
                new JMethod(
                        immutableEnumSet(JAccess.PROTECTED, JAccess.STATIC),
                        JTypeSpecifier.of(toPrim),
                        JName.of(name),
                        ImmutableList.of(new JArg(JTypeSpecifier.of(fromPrim), JName.of("val"))),
                        Optional.of(new JBlock(ImmutableList.copyOf(body)))));
    }

    public static final List<JDeclaration> TRUNCATION_FUNCTIONS = ImmutableList.<JDeclaration>builder()

            //     return (u < 0x4f000000U) || (u >= 0x80000000U && u <= 0xcf000000U);
            //     return (u < 0x5f000000U) || (u >= 0x80000000U && u <= 0xdf000000U);
            //     return (u < 0x4f800000U) || (u >= 0x80000000U && u < 0xbf800000U);
            //     return (u < 0x5f800000U) || (u >= 0x80000000U && u < 0xbf800000U);

            .add(newConvertFunction(
                    "_truncateFloatToSignedInteger",
                    FLOAT_PRIM,
                    INTEGER_PRIM,
                    newIfNanThrow(FLOAT_BOX),
                    newFloatTruncationBoundsCheck(0x4f000000L, 0xcf000000L + 1),
                    newReturn(INTEGER_PRIM)))

            .add(newConvertFunction(
                    "_truncateFloatToSignedLong",
                    FLOAT_PRIM,
                    LONG_PRIM,
                    newIfNanThrow(FLOAT_BOX),
                    newFloatTruncationBoundsCheck(0x5f000000L, 0xdf000000L + 1),
                    newReturn(LONG_PRIM)))

            .add(newConvertFunction(
                    "_truncateFloatToUnsignedInteger",
                    FLOAT_PRIM,
                    INTEGER_PRIM,
                    newIfNanThrow(FLOAT_BOX),
                    newFloatTruncationBoundsCheck(0x4f800000L, 0xbf800000L),
                    newReturn(INTEGER_PRIM, LONG_PRIM)))

            .add(newConvertFunction(
                    "_truncateFloatToUnsignedLong",
                    FLOAT_PRIM,
                    LONG_PRIM,
                    newIfNanThrow(FLOAT_BOX),
                    newFloatTruncationBoundsCheck(0x5f800000L, 0xbf800000L),
                    newReturnUnsignedLong(FLOAT_PRIM)))

            //     return (u <= 0x41dfffffffc00000ULL) || (u >= 0x8000000000000000ULL && u <= 0xc1e0000000000000ULL);
            //     return (u <= 0x41efffffffe00000ULL) || (u >= 0x8000000000000000ULL && u <= 0xbfefffffffffffffULL);
            //     return (u < 0x43e0000000000000ULL) || (u >= 0x8000000000000000ULL && u <= 0xc3e0000000000000ULL);
            //     return (u < 0x43f0000000000000ULL) || (u >= 0x8000000000000000ULL && u <= 0xbfefffffffffffffULL);

            .add(newConvertFunction(
                    "_truncateDoubleToSignedInteger",
                    DOUBLE_PRIM,
                    INTEGER_PRIM,
                    newIfNanThrow(DOUBLE_BOX),
                    newDoubleTruncationBoundsCheck(0x41dfffffffc00000L + 1, 0xc1e0000000000000L + 1),
                    newReturn(INTEGER_PRIM)))

            .add(newConvertFunction(
                    "_truncateDoubleToSignedLong",
                    DOUBLE_PRIM,
                    LONG_PRIM,
                    newIfNanThrow(DOUBLE_BOX),
                    newDoubleTruncationBoundsCheck(0x41efffffffe00000L + 1, 0xbfefffffffffffffL + 1),
                    newReturn(LONG_PRIM)))

            .add(newConvertFunction(
                    "_truncateDoubleToUnsignedInteger",
                    DOUBLE_PRIM,
                    INTEGER_PRIM,
                    newIfNanThrow(DOUBLE_BOX),
                    newDoubleTruncationBoundsCheck(0x43e0000000000000L, 0xc3e0000000000000L + 1),
                    newReturn(INTEGER_PRIM, LONG_PRIM)))

            .add(newConvertFunction(
                    "_truncateDoubleToUnsignedLong",
                    DOUBLE_PRIM,
                    LONG_PRIM,
                    newIfNanThrow(DOUBLE_BOX),
                    newDoubleTruncationBoundsCheck(0x43f0000000000000L, 0xbfefffffffffffffL + 1),
                    newReturnUnsignedLong(DOUBLE_PRIM)))

            .build();
}

