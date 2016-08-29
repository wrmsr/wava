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
package com.wrmsr.wava.core.unit;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Signature;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import static com.google.common.base.Preconditions.checkArgument;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableMap;
import static java.util.Objects.requireNonNull;
import static java.util.function.Function.identity;

@Immutable
public final class Module
{
    private final Name name;
    private final Memory memory;
    private final Table table;
    private final Set<Signature> declaredSignatures;
    private final Map<Name, Import> imports;
    private final Map<Name, Export> exports;
    private final Map<Name, Function> functions;

    public Module(
            Name name,
            Memory memory,
            Table table,
            Set<Signature> declaredSignatures,
            Map<Name, Import> imports,
            Map<Name, Export> exports,
            Map<Name, Function> functions)
    {
        this.name = requireNonNull(name);
        this.memory = requireNonNull(memory);
        this.table = table;
        this.declaredSignatures = ImmutableSet.copyOf(declaredSignatures);
        this.imports = ImmutableMap.copyOf(imports);
        this.exports = ImmutableMap.copyOf(exports);
        this.functions = ImmutableMap.copyOf(functions);
        checkArgument(Sets.intersection(imports.keySet(), functions.keySet()).isEmpty());
        checkArgument(imports.entrySet().stream().allMatch(e -> e.getKey().equals(e.getValue().getName())));
        checkArgument(exports.entrySet().stream().allMatch(e -> e.getKey().equals(e.getValue().getName())));
        checkArgument(functions.entrySet().stream().allMatch(e -> e.getKey().equals(e.getValue().getName())));
    }

    public Module(
            Name name,
            Memory memory,
            Table table,
            List<Signature> declaredSignatures,
            List<Import> imports,
            List<Export> exports,
            List<Function> functions)
    {
        this(
                name,
                memory,
                table,
                ImmutableSet.copyOf(declaredSignatures),
                imports.stream().collect(toImmutableMap(Import::getName, identity())),
                exports.stream().collect(toImmutableMap(Export::getName, identity())),
                functions.stream().collect(toImmutableMap(Function::getName, identity())));
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Module module = (Module) o;
        return Objects.equals(name, module.name) &&
                Objects.equals(memory, module.memory) &&
                Objects.equals(table, module.table) &&
                Objects.equals(declaredSignatures, module.declaredSignatures) &&
                Objects.equals(imports, module.imports) &&
                Objects.equals(exports, module.exports) &&
                Objects.equals(functions, module.functions);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, memory, table, declaredSignatures, imports, exports, functions);
    }

    public Name getName()
    {
        return name;
    }

    public Memory getMemory()
    {
        return memory;
    }

    public Set<Signature> getDeclaredSignatures()
    {
        return declaredSignatures;
    }

    public Map<Name, Import> getImports()
    {
        return imports;
    }

    public Map<Name, Export> getExports()
    {
        return exports;
    }

    public Map<Name, Function> getFunctions()
    {
        return functions;
    }

    public Table getTable()
    {
        return table;
    }

    public Map<Name, Signature> getTargetSignatures()
    {
        ImmutableMap.Builder<Name, Signature> builder = ImmutableMap.builder();
        for (Import i : imports.values()) {
            builder.put(i.getName(), i.getSignature());
        }
        for (Function f : functions.values()) {
            builder.put(f.getName(), f.getSignature());
        }
        return builder.build();
    }
}
