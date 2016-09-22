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
package com.wrmsr.wava.driver;

import com.wrmsr.wava.analyze.Analyses;
import com.wrmsr.wava.analyze.ControlTransferAnalysis;
import com.wrmsr.wava.analyze.ValueTypeAnalysis;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.unit.Function;
import com.wrmsr.wava.core.unit.Local;
import com.wrmsr.wava.core.unit.Locals;
import com.wrmsr.wava.transform.Transforms;
import com.wrmsr.wava.transform.statementizer.StatementizerTransform;
import com.wrmsr.wava.util.NameGenerator;
import com.wrmsr.wava.util.NameMangler;
import com.wrmsr.wava.util.temps.TempManager;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.stream.Stream;

import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableMap;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableSet;
import static java.util.Objects.requireNonNull;

public final class StandardFunctionProcessor
        implements FunctionProcessor
{
    private final NameMangler callMangler;
    private final NameMangler labelMangler;
    private final NameMangler localMangler;

    public StandardFunctionProcessor(NameMangler callMangler, NameMangler labelMangler, NameMangler localMangler)
    {
        this.callMangler = requireNonNull(callMangler);
        this.labelMangler = requireNonNull(labelMangler);
        this.localMangler = requireNonNull(localMangler);
    }

    public StandardFunctionProcessor()
    {
        this(NameMangler.DEFAULT, NameMangler.INVERSE, NameMangler.INVERSE);
    }

    @Override
    public Function processFunction(Function function)
    {
        Node body = function.getBody();

        body = Transforms.mangleCallNames(body, callMangler::mangleName);
        body = Transforms.mangleLabelNames(body, labelMangler::mangleName);
        body = Transforms.squishBlocks(body);
        body = Transforms.uniquifyLabels(body, new NameGenerator(Analyses.getNames(body), "_dupe$"));

        Analyses.checkLocalTypes(body, function.getLocals().getList().stream().map(l -> ImmutablePair.of(l.getIndex(), l.getType())).collect(toImmutableMap()));

        body = Transforms.ensureTerminal(body, function.getSignature().getResult());
        body = Transforms.eliminateUnreferencedLabels(body, Analyses.getReferencedNames(body));
        body = Transforms.squishBlocks(body);

        TempManager tm = new TempManager(
                new NameGenerator(
                        function.getLocals().getList().stream().map(Local::getName).collect(toImmutableSet()),
                        "_temp$"),
                Index.of(function.getLocals().getList().size()),
                false);
        body = new StatementizerTransform(
                ControlTransferAnalysis.analyze(body),
                ValueTypeAnalysis.analyze(body, false),
                tm
        ).transformFunctionBody(body);

        body = Transforms.insertExplicitLoopBreaks(body, ControlTransferAnalysis.analyze(body));
        body = Transforms.eliminateUnreferencedLabels(body, Analyses.getReferencedNames(body));
        body = Transforms.squishBlocks(body);

        body = Transforms.eliminateUnreachable(body, ControlTransferAnalysis.analyze(body), true);
        body = Transforms.squishBlocks(body);

        Locals locals = new Locals(
                Stream.concat(
                        function.getLocals().getList().stream()
                                .map(l -> new Local(localMangler.mangleName(l.getName()), l.getIndex(), l.getType())),
                        tm.getTempList().stream()
                                .map(t -> new Local(t.getName(), t.getIndex(), t.getType()))
                ).collect(toImmutableList()));

        return new Function(
                callMangler.mangleName(function.getName()),
                function.getResult(),
                function.getArgCount(),
                locals,
                body);
    }
}
