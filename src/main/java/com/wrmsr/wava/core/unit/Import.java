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

import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Signature;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

@Immutable
public final class Import
{
    private final Name name;
    private final Name moduleName;
    private final Name exportName;
    private final Signature signature;

    public Import(Name name, Name moduleName, Name exportName, Signature signature)
    {
        this.name = requireNonNull(name);
        this.moduleName = requireNonNull(moduleName);
        this.exportName = requireNonNull(exportName);
        this.signature = requireNonNull(signature);
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
        Import anImport = (Import) o;
        return Objects.equals(name, anImport.name) &&
                Objects.equals(moduleName, anImport.moduleName) &&
                Objects.equals(exportName, anImport.exportName) &&
                Objects.equals(signature, anImport.signature);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, moduleName, exportName, signature);
    }

    public Name getName()
    {
        return name;
    }

    public Name getModuleName()
    {
        return moduleName;
    }

    public Name getExportName()
    {
        return exportName;
    }

    public Signature getSignature()
    {
        return signature;
    }
}
