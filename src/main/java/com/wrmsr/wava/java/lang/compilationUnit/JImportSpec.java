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
public final class JImportSpec
        implements Comparable<JImportSpec>
{
    private final boolean isStatic;
    private final JQualifiedName name;
    private final boolean isWildcard;

    public JImportSpec(boolean isStatic, JQualifiedName name, boolean isWildcard)
    {
        this.isStatic = isStatic;
        this.name = requireNonNull(name);
        this.isWildcard = isWildcard;
    }

    @Override
    public int compareTo(JImportSpec o)
    {
        if (isStatic && !o.isStatic) {
            return 1;
        }
        else if (!isStatic && o.isStatic) {
            return -1;
        }
        int ret = name.compareTo(o.name);
        if (ret != 0) {
            return ret;
        }
        if (isWildcard && !o.isWildcard) {
            return 1;
        }
        else if (!isWildcard && o.isWildcard) {
            return -1;
        }
        return 0;
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
        JImportSpec jImportSpec = (JImportSpec) o;
        return isStatic == jImportSpec.isStatic &&
                isWildcard == jImportSpec.isWildcard &&
                Objects.equals(name, jImportSpec.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(isStatic, name, isWildcard);
    }

    public boolean isStatic()
    {
        return isStatic;
    }

    public JQualifiedName getName()
    {
        return name;
    }

    public boolean isWildcard()
    {
        return isWildcard;
    }
}
