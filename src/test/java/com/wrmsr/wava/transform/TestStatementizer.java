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
package com.wrmsr.wava.transform;

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.analyze.ControlTransferAnalysis;
import com.wrmsr.wava.analyze.ValueTypeAnalysis;
import com.wrmsr.wava.core.literal.Literal;
import com.wrmsr.wava.core.node.Block;
import com.wrmsr.wava.core.node.Break;
import com.wrmsr.wava.core.node.Const;
import com.wrmsr.wava.core.node.GetLocal;
import com.wrmsr.wava.core.node.Label;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Nop;
import com.wrmsr.wava.core.node.Return;
import com.wrmsr.wava.core.node.SetLocal;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.core.unit.Local;
import com.wrmsr.wava.core.unit.Locals;
import com.wrmsr.wava.transform.statementizer.StatementizerTransform;
import com.wrmsr.wava.util.NameGenerator;
import com.wrmsr.wava.util.temps.TempManager;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.junit.Test;

import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static org.junit.Assert.assertEquals;

public class TestStatementizer
{
    @Test
    public void testStatementizer()
            throws Throwable
    {
        Node pre = new Return(
                new Label(
                        Name.of("label$0"),
                        new Label(
                                Name.of("label$1"),
                                new Break(
                                        Name.of("label$0"),
                                        new Const(
                                                Literal.of(1))))));

        StatementizerTransform st = new StatementizerTransform(
                ControlTransferAnalysis.analyze(pre),
                ValueTypeAnalysis.analyze(pre, false),
                new TempManager(
                        new NameGenerator(),
                        Index.of(0),
                        false));

        Node post = st.transformFunctionBody(pre);

        assertEquals(
                post,
                new Block(
                        ImmutableList.of(
                                new Label(
                                        Name.of("label$0"),
                                        new Label(
                                                Name.of("label$1"),
                                                new Block(
                                                        ImmutableList.of(
                                                                new SetLocal(
                                                                        Index.of(0),
                                                                        Type.I32,
                                                                        new Const(
                                                                                Literal.of(1))),
                                                                new Break(
                                                                        Name.of("label$0"),
                                                                        new Nop()))))),
                                new Return(
                                        new GetLocal(
                                                Index.of(0),
                                                Type.I32)))));

        Locals locals = new Locals(st.getTempManager().getTempList().stream().map(t -> new Local(t.getName(), t.getIndex(), t.getType())).collect(toImmutableList()));
        assertEquals(
                locals,
                Locals.of(
                        ImmutableList.of(
                                ImmutablePair.of(Name.of("__anon$0"), Type.I32))));
    }
}
