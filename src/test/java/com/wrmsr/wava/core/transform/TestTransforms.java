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
package com.wrmsr.wava.core.transform;

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.core.literal.Literal;
import com.wrmsr.wava.core.node.Block;
import com.wrmsr.wava.core.node.Const;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Nop;
import com.wrmsr.wava.transform.Transforms;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTransforms
{
    @Test
    public void testSquishBlocks()
            throws Throwable
    {
        Node in = new Block(
                ImmutableList.of(
                        new Block(
                                ImmutableList.of(
                                        new Block(
                                                ImmutableList.of(
                                                        new Block(
                                                                ImmutableList.of(
                                                                        new Nop(),
                                                                        new Const(
                                                                                Literal.of(1)))))),
                                        new Const(
                                                Literal.of(2))))));
        Node out = Transforms.squishBlocks(in);
        assertEquals(
                out,
                new Block(
                        ImmutableList.of(
                                new Const(
                                        Literal.of(1)),
                                new Const(
                                        Literal.of(2)))));
    }
}
