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
import com.wrmsr.wava.core.node.CallIndirect;
import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.tree.expression.JArrayAccess;
import com.wrmsr.wava.java.lang.tree.expression.JExpression;
import com.wrmsr.wava.java.lang.tree.expression.JIdent;
import com.wrmsr.wava.java.lang.tree.expression.JMemberAccess;
import com.wrmsr.wava.java.lang.tree.expression.JMethodInvocation;

import javax.inject.Inject;

import java.util.List;

public final class CallIndirectCompilerImpl
        implements CallIndirectCompiler
{
    @Inject
    public CallIndirectCompilerImpl()
    {
    }

    @Override
    public JExpression compileCallIndirect(CallIndirect node, JExpression target, List<JExpression> operands)
    {
        return new JMethodInvocation(
                new JMemberAccess(
                        new JArrayAccess(
                                new JIdent(
                                        JQualifiedName.of("this", "_" + node.getSignature().getChars() + "Table")),
                                new JArrayAccess(
                                        new JIdent(
                                                JQualifiedName.of("this", "_tableIndices")),
                                        target)),
                        JName.of("invoke")),
                ImmutableList.<JExpression>builder()
                        .addAll(operands)
                        .build());
    }
}
