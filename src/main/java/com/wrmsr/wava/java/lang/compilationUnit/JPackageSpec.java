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

import com.wrmsr.wava.java.lang.JQualifiedName;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

@Immutable
public final class JPackageSpec
{
    private final JQualifiedName name;

    public JPackageSpec(JQualifiedName name)
    {
        this.name = requireNonNull(name);
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
        JPackageSpec jPackageSpec = (JPackageSpec) o;
        return Objects.equals(name, jPackageSpec.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }

    public JQualifiedName getName()
    {
        return name;
    }
}
