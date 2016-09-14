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
package com.wrmsr.wava;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.wrmsr.wava.core.node.BreakTable;
import com.wrmsr.wava.core.node.If;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Nop;
import com.wrmsr.wava.core.node.Unary;
import com.wrmsr.wava.core.op.UnaryOp;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.basic.Basic;
import com.wrmsr.wava.basic.BasicSet;
import com.wrmsr.wava.basic.Basics;
import org.junit.Test;

import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Stream;

import static com.google.common.collect.Iterables.getOnlyElement;
import static com.wrmsr.wava.core.node.Nodes.nodify;
import static com.wrmsr.wava.basic.Basics.minBasicIndex;
import static com.wrmsr.wava.util.Itertools.lazyStream;
import static java.util.Objects.requireNonNull;
import static java.util.function.Function.identity;

public class TestMatching
{
    public static final Map<Name, Basic> DIAMOND_BASICS = ImmutableMap.<Name, Basic>builder()

            .put(Name.of("head"), new Basic(
                    Name.of("head"),
                    ImmutableList.of(),
                    new BreakTable(
                            ImmutableList.of(Name.of("left")),
                            Name.of("right"),
                            new Nop()),
                    OptionalInt.of(0)))

            .put(Name.of("left"), new Basic(
                    Name.of("left"),
                    ImmutableList.of(),
                    new BreakTable(
                            ImmutableList.of(),
                            Name.of("tail"),
                            new Nop()),
                    OptionalInt.of(0)))

            .put(Name.of("right"), new Basic(
                    Name.of("right"),
                    ImmutableList.of(),
                    new BreakTable(
                            ImmutableList.of(),
                            Name.of("tail"),
                            new Nop()),
                    OptionalInt.of(0)))

            .put(Name.of("tail"), new Basic(
                    Name.of("tail"),
                    ImmutableList.of(),
                    new BreakTable(
                            ImmutableList.of(),
                            Basics.UNREACHABLE_NAME,
                            new Nop()),
                    OptionalInt.of(0)))

            .build();

    @FunctionalInterface
    public interface IfBasicMatcher<T, R>
    {
        R apply(Name ifTrue, Name ifFalse, Node condition);
    }

    public static <T, R> Stream<R> matchIfBasic(Basic basic, IfBasicMatcher<T, R> consumer)
    {
        if (basic.getBreakTable().getTargets().size() != 1) {
            return Stream.empty();
        }
        Name ifTrue = basic.getBreakTable().getDefaultTarget();
        Name ifFalse = getOnlyElement(basic.getBreakTable().getTargets());
        if (ifTrue.equals(ifFalse)) {
            return Stream.empty();
        }
        return Stream.concat(
                lazyStream(() -> consumer.apply(ifTrue, ifFalse, basic.getBreakTable().getCondition())),
                lazyStream(() -> consumer.apply(ifFalse, ifTrue, new Unary(UnaryOp.EqZ, Type.I32, basic.getBreakTable().getCondition()))));
    }

    @Test
    public void testDiamondMatching()
            throws Throwable
    {
        matchIfBasic(DIAMOND_BASICS.get(Name.of("head")), (ifTrue, ifFalse, condition) -> {
            String str = String.format("%s, %s", ifTrue.get(), ifFalse.get());
            System.out.println(String.format("Calculated: %s", str));
            return Stream.of(str);
        }).flatMap(identity()).forEach(str -> {
            System.out.println(String.format("Received: %s", str));
        });
    }

    public static Stream<BasicSet> matchPoweredShrinkIf(BasicSet basics, Basic basic)
    {
        return matchIfBasic(basic, (ifTrueName, ifFalseName, condition) -> {
            Basic ifTrue = basics.get(ifTrueName);
            Node ifNode = new If(
                    condition,
                    nodify(ifTrue.getBody()),
                    new Nop());
            Basic newBasic = new Basic(
                    basic.getName(),
                    ImmutableList.<Node>builder()
                            .addAll(basic.getBody())
                            .add(ifNode)
                            .build(),
                    ifTrue.getBreakTable(),
                    minBasicIndex(basic, ifTrue));
            return basics
                    .replace(newBasic)
                    .remove(ifTrue.getName());
        });
    }
}
