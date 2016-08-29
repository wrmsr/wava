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
package com.wrmsr.wava.yen.translation;

import com.google.common.collect.ImmutableMap;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Signature;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.core.unit.Export;
import com.wrmsr.wava.core.unit.Function;
import com.wrmsr.wava.core.unit.Import;
import com.wrmsr.wava.core.unit.Locals;
import com.wrmsr.wava.core.unit.Memory;
import com.wrmsr.wava.core.unit.Module;
import com.wrmsr.wava.core.unit.Segment;
import com.wrmsr.wava.core.unit.Table;
import com.wrmsr.wava.yen.global.YFunction;
import com.wrmsr.wava.yen.global.YMemory;
import com.wrmsr.wava.yen.global.YModule;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

import static com.google.common.base.Preconditions.checkArgument;
import static com.wrmsr.wava.util.Itertools.enumerate;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableMap;
import static java.util.Objects.requireNonNull;

public final class UnitTranslation
{
    private UnitTranslation()
    {
    }

    public static Function translateFunction(YFunction function, Map<Name, Signature> functionSignatures)
    {
        requireNonNull(function);
        checkArgument(function.getName().isPresent());
        checkArgument(function.getResult() != Type.UNREACHABLE);
        checkArgument(function.getBody().isPresent());
        checkArgument(function.getLocalNames().size() == function.getNumLocals());
        checkArgument(function.getLocalIndices().size() == function.getNumLocals());
        List<Pair<Name, Index>> localList = function.getLocalIndices().entrySet().stream().map(e -> ImmutablePair.of(e.getKey(), e.getValue())).collect(Collectors.toList());
        localList.sort((l, r) -> l.getValue().compareTo(r.getValue()));
        checkArgument(enumerate(localList.stream().map(Pair::getRight)).allMatch(e -> e.getItem().get() == e.getIndex()));
        Locals locals = Locals.of(localList.stream().map(l -> ImmutablePair.of(l.getLeft(), function.getLocalType(l.getRight()))).collect(toImmutableList()));
        Node body = NodeTranslation.translateNode(function.getBody().get(), functionSignatures);
        return new Function(
                function.getName().get(),
                function.getResult(),
                function.getNumParams(),
                locals,
                body);
    }

    public static Module translateModule(Name name, YModule module)
    {
        YMemory ymemory = module.getMemory();
        Memory memory = new Memory(
                ymemory.getInitial(),
                ymemory.getMax() >= 0 ? OptionalInt.of(ymemory.getMax()) : OptionalInt.empty(),
                ymemory.getSegments().stream().map(s -> new Segment(s.getOffset(), s.getData().length == s.getSize() ? s.getData() : Arrays.copyOf(s.getData(), s.getSize()))).collect(toImmutableList()));
        Table table = new Table(
                module.getTable().getNames());
        Map<Name, Signature> functionSignatures = ImmutableMap.<Name, Signature>builder()
                .putAll(module.getFunctions().stream().map(f -> ImmutablePair.of(f.getName().get(), new Signature(f.getResult(), f.getParams()))).collect(toImmutableList()))
                .putAll(module.getImports().stream().map(i -> ImmutablePair.of(i.getName().get(), new Signature(i.getType().getResult(), i.getType().getParams()))).collect(toImmutableList()))
                .build();
        Map<Name, Import> imports = module.getImports().stream()
                .map(i -> ImmutablePair.of(i.getName().get(), new Import(i.getName().get(), i.getModule(), i.getBase(), new Signature(i.getType().getResult(), i.getType().getParams()))))
                .collect(toImmutableMap());
        Map<Name, Export> exports = module.getExports().stream()
                .map(e -> ImmutablePair.of(e.getName().get(), new Export(e.getName().get(), e.getValue())))
                .collect(toImmutableMap());
        Map<Name, Function> functions = module.getFunctions().stream()
                .parallel() // FIXME boo this man
                .map(f -> ImmutablePair.of(f.getName().get(), translateFunction(f, functionSignatures)))
                .sequential()
                .collect(toImmutableMap());
        Set<Signature> declaredSignatures = module.getNamedFunctionTypes().stream().map(i -> new Signature(i.getResult(), i.getParams())).collect(Collectors.toSet());
        return new Module(
                name,
                memory,
                table,
                declaredSignatures,
                imports,
                exports,
                functions);
    }
}
