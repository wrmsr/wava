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
package com.wrmsr.wava.java.lang.compilationUnit;

import com.google.common.collect.ImmutableSet;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclaration;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import static java.util.Objects.requireNonNull;

@Immutable
public final class JCompilationUnit
{
    private final Optional<JPackageSpec> packageSpec;
    private final Set<JImportSpec> importSpecs;
    private final JDeclaration body;

    public JCompilationUnit(Optional<JPackageSpec> packageSpec, Set<JImportSpec> importSpecs, JDeclaration body)
    {
        this.packageSpec = requireNonNull(packageSpec);
        this.importSpecs = ImmutableSet.copyOf(importSpecs);
        this.body = requireNonNull(body);
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
        JCompilationUnit that = (JCompilationUnit) o;
        return Objects.equals(packageSpec, that.packageSpec) &&
                Objects.equals(importSpecs, that.importSpecs) &&
                Objects.equals(body, that.body);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(packageSpec, importSpecs, body);
    }

    public Optional<JPackageSpec> getPackageSpec()
    {
        return packageSpec;
    }

    public Set<JImportSpec> getImportSpecs()
    {
        return importSpecs;
    }

    public JDeclaration getBody()
    {
        return body;
    }
}
