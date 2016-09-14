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
package com.wrmsr.wava.compile.call;

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.compile.module.ModuleCompilationParticipant;
import com.wrmsr.wava.core.node.Call;
import com.wrmsr.wava.core.op.HostOp;
import com.wrmsr.wava.java.lang.JAccess;
import com.wrmsr.wava.java.lang.JArray;
import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.JTypeSpecifier;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclaration;
import com.wrmsr.wava.java.lang.tree.declaration.JField;
import com.wrmsr.wava.java.lang.tree.expression.JArrayAccess;
import com.wrmsr.wava.java.lang.tree.expression.JAssignment;
import com.wrmsr.wava.java.lang.tree.expression.JExpression;
import com.wrmsr.wava.java.lang.tree.expression.JIdent;
import com.wrmsr.wava.java.lang.tree.expression.JLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JMethodInvocation;
import com.wrmsr.wava.java.lang.tree.expression.JNewArray;

import javax.inject.Inject;

import java.util.List;
import java.util.Optional;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.collect.Sets.immutableEnumSet;

public final class CallCompilerImpl
        implements CallCompiler, ModuleCompilationParticipant
{
    @Inject
    public CallCompilerImpl()
    {
    }

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

    @Override
    public List<JDeclaration> createPreCtorDeclarations()
    {
        return ImmutableList.of(
                new JField(
                        immutableEnumSet(JAccess.PROTECTED, JAccess.FINAL),
                        new JTypeSpecifier(
                                JQualifiedName.of("long"),
                                ImmutableList.of(JArray.EMPTY)),
                        JName.of("_spill"),
                        Optional.of(
                                new JNewArray(
                                        new JTypeSpecifier(
                                                JQualifiedName.of("long"),
                                                ImmutableList.of(
                                                        new JArray(
                                                                new JLiteral(64)))),
                                        Optional.empty()))));
    }
}
