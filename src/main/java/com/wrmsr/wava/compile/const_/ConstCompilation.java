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
package com.wrmsr.wava.compile.const_;

import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.tree.expression.JExpression;
import com.wrmsr.wava.java.lang.tree.expression.JIdent;
import com.wrmsr.wava.java.lang.tree.expression.JLiteral;
import com.wrmsr.wava.core.literal.Literal;
import com.wrmsr.wava.core.node.Const;

import static com.google.common.base.Preconditions.checkState;

public final class ConstCompilation
{
    private ConstCompilation()
    {
    }

    public static JExpression compileConst(Const node)
    {
        Literal literal = node.getLiteral();
        Object value = literal.getValue();
        switch (literal.getType()) {
            case I32: {
                checkState(value instanceof Integer);
                return new JLiteral(
                        node.getLiteral().getValue());
            }
            case I64: {
                checkState(value instanceof Long);
                return new JLiteral(
                        node.getLiteral().getValue());
            }
            case F32: {
                checkState(value instanceof Float);
                Float floatValue = (Float) value;
                if (Float.isInfinite(floatValue)) {
                    if (floatValue < 0) {
                        return new JIdent(
                                JQualifiedName.of("java", "lang", "Float", "NEGATIVE_INFINITY"));
                    }
                    else {
                        return new JIdent(
                                JQualifiedName.of("java", "lang", "Float", "POSITIVE_INFINITY"));
                    }
                }
                else if (Float.isNaN(floatValue)) {
                    return new JIdent(
                            JQualifiedName.of("java", "lang", "Float", "NaN"));
                }
                else {
                    return new JLiteral(
                            node.getLiteral().getValue());
                }
            }
            case F64: {
                checkState(value instanceof Double);
                Double doubleValue = (Double) value;
                if (Double.isInfinite(doubleValue)) {
                    if (doubleValue < 0) {
                        return new JIdent(
                                JQualifiedName.of("java", "lang", "Double", "NEGATIVE_INFINITY"));
                    }
                    else {
                        return new JIdent(
                                JQualifiedName.of("java", "lang", "Double", "POSITIVE_INFINITY"));
                    }
                }
                else if (Double.isNaN(doubleValue)) {
                    return new JIdent(
                            JQualifiedName.of("java", "lang", "Double", "NaN"));
                }
                else {
                    return new JLiteral(
                            node.getLiteral().getValue());
                }
            }
        }
        throw new IllegalStateException();
    }
}
