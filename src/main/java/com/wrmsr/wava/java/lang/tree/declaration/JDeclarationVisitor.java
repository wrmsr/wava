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

public class JDeclarationVisitor<C, R>
{
    protected R visitJDeclaration(JDeclaration jstatement, C context)
    {
        return null;
    }

    public R visitJAnnotatedDeclaration(JAnnotatedDeclaration jdeclaration, C context)
    {
        return visitJDeclaration(jdeclaration, context);
    }

    public R visitJConstructor(JConstructor jdeclaration, C context)
    {
        return visitJDeclaration(jdeclaration, context);
    }

    public R visitJDeclarationBlock(JDeclarationBlock jdeclaration, C context)
    {
        return visitJDeclaration(jdeclaration, context);
    }

    public R visitJField(JField jdeclaration, C context)
    {
        return visitJDeclaration(jdeclaration, context);
    }

    public R visitJInitializationBlock(JInitializationBlock jdeclaration, C context)
    {
        return visitJDeclaration(jdeclaration, context);
    }

    public R visitJMethod(JMethod jdeclaration, C context)
    {
        return visitJDeclaration(jdeclaration, context);
    }

    public R visitJType(JType jdeclaration, C context)
    {
        return visitJDeclaration(jdeclaration, context);
    }

    public R visitJVerbatimDeclaration(JVerbatimDeclaration jdeclaration, C context)
    {
        return visitJDeclaration(jdeclaration, context);
    }
}
