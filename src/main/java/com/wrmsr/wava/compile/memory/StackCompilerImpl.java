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
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.op.JBinaryOp;
import com.wrmsr.wava.java.lang.tree.expression.JBinary;
import com.wrmsr.wava.java.lang.tree.expression.JLiteral;
import com.wrmsr.wava.java.lang.tree.expression.JMethodInvocation;
import com.wrmsr.wava.java.lang.tree.statement.JExpressionStatement;
import com.wrmsr.wava.java.lang.tree.statement.JStatement;

import javax.inject.Inject;

import java.util.List;

public final class StackCompilerImpl
        implements ModuleCompilationParticipant
{
    @Inject
    public StackCompilerImpl()
    {
    }

    @Override
    public List<JStatement> createCtorStatements()
    {
        // const char *ES = "__stack_pointer";
        return ImmutableList.of(
                new JExpressionStatement(
                        JMethodInvocation.of(
                                JQualifiedName.of("this", "_storeInt"),
                                ImmutableList.of(
                                        new JLiteral(4),
                                        new JBinary(
                                                JBinaryOp.Subtract,
                                                new JLiteral(1024 * 1024), // FIXME
                                                new JLiteral(4))))));
    }
}
