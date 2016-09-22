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
package com.wrmsr.wava.yen.global;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.yen.types.NamedFunctionType;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

@Immutable
public final class YModule
{
    // wasm contents (generally you shouldn't access these from outside, except maybe for iterating; use add*() and the get() functions)
    private final List<NamedFunctionType> namedFunctionTypes;
    private final List<YImport> imports;
    private final List<YExport> exports;
    private final List<YFunction> functions;

    private final YTable table;
    private final YMemory memory;
    private final Optional<Name> start;

    // TODO: add a build option where Names are just indices, and then these methods are not needed
    private final Map<Name, NamedFunctionType> functionTypesMap;
    private final Map<Name, YImport> importsMap;
    private final Map<Name, YExport> exportsMap;
    private final Map<Name, YFunction> functionsMap;

    public YModule(
            List<NamedFunctionType> namedFunctionTypes,
            List<YImport> imports,
            List<YExport> exports,
            List<YFunction> functions,
            YTable table,
            YMemory memory,
            Optional<Name> start,
            // FIXME wut
            Map<Name, NamedFunctionType> functionTypesMap,
            Map<Name, YImport> importsMap,
            Map<Name, YExport> exportsMap,
            Map<Name, YFunction> functionsMap)
    {
        this.namedFunctionTypes = ImmutableList.copyOf(namedFunctionTypes);
        this.imports = ImmutableList.copyOf(imports);
        this.exports = ImmutableList.copyOf(exports);
        this.functions = ImmutableList.copyOf(functions);
        this.table = requireNonNull(table);
        this.memory = requireNonNull(memory);
        this.start = requireNonNull(start);
        this.functionTypesMap = ImmutableMap.copyOf(functionTypesMap);
        this.importsMap = ImmutableMap.copyOf(importsMap);
        this.exportsMap = ImmutableMap.copyOf(exportsMap);
        this.functionsMap = ImmutableMap.copyOf(functionsMap);
    }

    public List<NamedFunctionType> getNamedFunctionTypes()
    {
        return namedFunctionTypes;
    }

    public List<YImport> getImports()
    {
        return imports;
    }

    public List<YExport> getExports()
    {
        return exports;
    }

    public List<YFunction> getFunctions()
    {
        return functions;
    }

    public YTable getTable()
    {
        return table;
    }

    public YMemory getMemory()
    {
        return memory;
    }

    public Optional<Name> getStart()
    {
        return start;
    }

    public Map<Name, NamedFunctionType> getFunctionTypesMap()
    {
        return functionTypesMap;
    }

    public Map<Name, YImport> getImportsMap()
    {
        return importsMap;
    }

    public Map<Name, YExport> getExportsMap()
    {
        return exportsMap;
    }

    public Map<Name, YFunction> getFunctionsMap()
    {
        return functionsMap;
    }
}
