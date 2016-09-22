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
package com.wrmsr.wava.compile.module;

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.java.lang.JArg;
import com.wrmsr.wava.java.lang.tree.declaration.JDeclaration;
import com.wrmsr.wava.java.lang.tree.statement.JStatement;

import java.util.List;

public interface ModuleCompilationParticipant
{
    default List<JDeclaration> createInterfaceDeclarations()
    {
        return ImmutableList.of();
    }

    default List<JDeclaration> createPreCtorDeclarations()
    {
        return ImmutableList.of();
    }

    default List<JArg> createCtorArgs()
    {
        return ImmutableList.of();
    }

    default List<JStatement> createCtorStatements()
    {
        return ImmutableList.of();
    }

    default List<JDeclaration> createPostCtorDeclarations()
    {
        return ImmutableList.of();
    }
}
