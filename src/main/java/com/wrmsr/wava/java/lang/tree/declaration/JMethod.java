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
package com.wrmsr.wava.java.lang.tree.declaration;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.wrmsr.wava.java.lang.JAccess;
import com.wrmsr.wava.java.lang.JArg;
import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JTypeSpecifier;
import com.wrmsr.wava.java.lang.tree.statement.JBlock;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import static java.util.Objects.requireNonNull;

@Immutable
public final class JMethod
        extends JDeclaration
{
    private final Set<JAccess> access;
    private final JTypeSpecifier type;
    private final JName name;
    private final List<JArg> args;
    private final Optional<JBlock> body;

    public JMethod(Set<JAccess> access, JTypeSpecifier type, JName name, List<JArg> args, Optional<JBlock> body)
    {
        this.access = ImmutableSet.copyOf(access);
        this.type = requireNonNull(type);
        this.name = requireNonNull(name);
        this.args = ImmutableList.copyOf(args);
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
        JMethod jMethod = (JMethod) o;
        return Objects.equals(access, jMethod.access) &&
                Objects.equals(type, jMethod.type) &&
                Objects.equals(name, jMethod.name) &&
                Objects.equals(args, jMethod.args) &&
                Objects.equals(body, jMethod.body);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(access, type, name, args, body);
    }

    public Set<JAccess> getAccess()
    {
        return access;
    }

    public JTypeSpecifier getType()
    {
        return type;
    }

    public JName getName()
    {
        return name;
    }

    public List<JArg> getArgs()
    {
        return args;
    }

    public Optional<JBlock> getBody()
    {
        return body;
    }

    @Override
    public <C, R> R accept(JDeclarationVisitor<C, R> visitor, C context)
    {
        return visitor.visitJMethod(this, context);
    }
}
