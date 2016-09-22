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
import com.wrmsr.wava.yen.types.NamedFunctionType;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.yen.types.Sig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

public class ModuleBuilder
{
    private final List<NamedFunctionType> namedFunctionTypes = new ArrayList<>();
    private final List<YImport> imports = new ArrayList<>();
    private final List<YExport> exports = new ArrayList<>();
    private final List<YFunction> functions = new ArrayList<>();

    private YTable table = new YTable(ImmutableList.of());
    private YMemory memory = new YMemory(0, -1, ImmutableList.of(), Optional.empty());
    private Optional<Name> start = Optional.empty();

    private final Map<Name, NamedFunctionType> functionTypesMap = new HashMap<>();
    private final Map<Name, YImport> importsMap = new HashMap<>();
    private final Map<Name, YExport> exportsMap = new HashMap<>();
    private final Map<Name, YFunction> functionsMap = new HashMap<>();

    private int functionTypeIndex;
    private int importIndex;
    private int exportIndex;
    private int functionIndex;

    public ModuleBuilder()
    {
    }

    public YModule build()
    {
        return new YModule(
                namedFunctionTypes,
                imports,
                exports,
                functions,
                table,
                memory,
                start,
                functionTypesMap,
                importsMap,
                exportsMap,
                functionsMap);
    }

    public YTable getTable()
    {
        return table;
    }

    public void setTable(YTable table)
    {
        this.table = requireNonNull(table);
    }

    public YMemory getMemory()
    {
        return memory;
    }

    public void setMemory(YMemory memory)
    {
        this.memory = requireNonNull(memory);
    }

    public Optional<Name> getStart()
    {
        return start;
    }

    public void setStart(Optional<Name> start)
    {
        this.start = requireNonNull(start);
    }

    public int getFunctionTypeIndex()
    {
        return functionTypeIndex;
    }

    public void setFunctionTypeIndex(int functionTypeIndex)
    {
        this.functionTypeIndex = functionTypeIndex;
    }

    public int getImportIndex()
    {
        return importIndex;
    }

    public void setImportIndex(int importIndex)
    {
        this.importIndex = importIndex;
    }

    public int getExportIndex()
    {
        return exportIndex;
    }

    public void setExportIndex(int exportIndex)
    {
        this.exportIndex = exportIndex;
    }

    public int getFunctionIndex()
    {
        return functionIndex;
    }

    public void setFunctionIndex(int functionIndex)
    {
        this.functionIndex = functionIndex;
    }

    public NamedFunctionType getFunctionType(int i)
    {
        return namedFunctionTypes.get(i);
    }

    public YImport getImport(int i)
    {
        return imports.get(i);
    }

    public YExport getExport(int i)
    {
        return exports.get(i);
    }

    public YFunction getFunction(int i)
    {
        return functions.get(i);
    }

    public NamedFunctionType getFunctionType(Name name)
    {
        return functionTypesMap.get(name);
    }

    public YImport getImport(Name name)
    {
        return importsMap.get(name);
    }

    public YExport getExport(Name name)
    {
        return exportsMap.get(name);
    }

    public YFunction getFunction(Name name)
    {
        return functionsMap.get(name);
    }

    public Optional<NamedFunctionType> checkFunctionType(Name name)
    {
        if (!functionTypesMap.containsKey(name)) {
            return Optional.empty();
        }
        return Optional.of(functionTypesMap.get(name));
    }

    public Optional<YImport> checkImport(Name name)
    {
        if (!importsMap.containsKey(name)) {
            return Optional.empty();
        }
        return Optional.of(importsMap.get(name));
    }

    public Optional<YExport> checkExport(Name name)
    {
        if (!exportsMap.containsKey(name)) {
            return Optional.empty();
        }
        return Optional.of(exportsMap.get(name));
    }

    public Optional<YFunction> checkFunction(Name name)
    {
        if (!functionsMap.containsKey(name)) {
            return Optional.empty();
        }
        return Optional.of(functionsMap.get(name));
    }

    public NamedFunctionType addFunctionType(NamedFunctionType curr)
    {
        Name numericName = Name.of(functionTypeIndex);
        if (!curr.getName().isPresent()) {
            curr = curr.rename(numericName); // TODO: remove all these, assert on names already existing, do numeric stuff in wasm-s-parser etc.
        }
        namedFunctionTypes.add(curr);
        functionTypesMap.put(curr.getName().get(), curr);
        functionTypesMap.put(numericName, curr);
        functionTypeIndex++;
        return curr;
    }

    public void addImport(YImport curr)
    {
        Name numericName = Name.of(importIndex);
        if (!curr.getName().isPresent()) {
            curr = curr.rename(numericName);
        }
        imports.add(curr);
        importsMap.put(curr.getName().get(), curr);
        importsMap.put(numericName, curr);
        importIndex++;
    }

    public void addExport(YExport curr)
    {
        Name numericName = Name.of(exportIndex);
        if (!curr.getName().isPresent()) {
            curr = curr.rename(numericName);
        }
        exports.add(curr);
        exportsMap.put(curr.getName().get(), curr);
        exportsMap.put(numericName, curr);
        exportIndex++;
    }

    public void addFunction(YFunction curr)
    {
        Name numericName = Name.of(functionIndex);
        if (!curr.getName().isPresent()) {
            curr = curr.rename(numericName);
        }
        functions.add(curr);
        functionsMap.put(curr.getName().get(), curr);
        functionsMap.put(numericName, curr);
        functionIndex++;
    }

    public void addStart(Name s)
    {
        start = Optional.of(s);
    }

/*
  void removeImport(Name name) {
    for (size_t i = 0; i < imports.size(); i++) {
      if (imports[i]->name == name) {
        imports.erase(imports.begin() + i);
        break;
      }
    }
    importsMap.erase(name);
  }

private:
*/

    public NamedFunctionType ensureFunctionType(Sig sig)
    {
        Name name = Name.of("FUNCSIG$" + sig.get());
        if (checkFunctionType(name).isPresent()) {
            return getFunctionType(name);
        }
        // add new type
        NamedFunctionType ft = sig.toFunctionType().rename(name);
        addFunctionType(ft);
        return ft;
    }
}
