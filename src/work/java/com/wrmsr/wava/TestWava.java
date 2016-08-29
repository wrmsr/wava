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
package com.wrmsr.wava;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.squareup.javapoet.CodeBlock;
import com.wrmsr.wava.java.lang.JName;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.JRenderer;
import com.wrmsr.wava.java.lang.compilationUnit.JCompilationUnit;
import com.wrmsr.wava.java.lang.compilationUnit.JImportSpec;
import com.wrmsr.wava.java.lang.compilationUnit.JPackageSpec;
import com.wrmsr.wava.java.lang.tree.declaration.JType;
import org.testng.annotations.Test;

public class TestWava
{
    public static final JCompilationUnit FILE = new JCompilationUnit(
            new JPackageSpec(JQualifiedName.parse("com.wrmsr.foo")),
            ImmutableSet.of(
                    new JImportSpec(false, JQualifiedName.parse("javax.util.Thing"), false),
                    new JImportSpec(false, JQualifiedName.parse("java.util.Thing"), false),
                    new JImportSpec(false, JQualifiedName.parse("com.wrmsr.blah.Thing"), false),
                    new JImportSpec(false, JQualifiedName.parse("com.wrmsr.Blah"), false),
                    new JImportSpec(true, JQualifiedName.parse("java.a.Asdf"), true),
                    new JImportSpec(false, JQualifiedName.parse("java.a.Asdf"), true),
                    new JImportSpec(true, JQualifiedName.parse("java.a.Asdf"), true),
                    new JImportSpec(true, JQualifiedName.parse("java.util.blah"), true)),
            new JType(
                    ImmutableSet.of(),
                    JType.Kind.CLASS,
                    JName.of("Foo"),
                    ImmutableList.of(),
                    ImmutableList.of()));

    @Test
    public void test()
            throws Throwable
    {
        CodeBlock.Builder code = CodeBlock.builder();
        new JRenderer(code).renderCompilationUnit(FILE);
        CodeBlock block = code.build();
        System.out.println(block);
    }

    private double dllStub(long arg0, long arg1)
    {
        throw new IllegalStateException();
    }

    private float fllStub(long arg0, long arg1)
    {
        throw new IllegalStateException();
    }

    private int iStub()
    {
        throw new IllegalStateException();
    }

    private int iiStub(int arg0)
    {
        throw new IllegalStateException();
    }

    private int iiiStub(int arg0, int arg1)
    {
        throw new IllegalStateException();
    }

    private int iiiiStub(int arg0, int arg1, int arg2)
    {
        throw new IllegalStateException();
    }

    private int iiiiiStub(int arg0, int arg1, int arg2, int arg3)
    {
        throw new IllegalStateException();
    }

    private int iiiiiiStub(int arg0, int arg1, int arg2, int arg3, int arg4)
    {
        throw new IllegalStateException();
    }

    private int iiiiiiiStub(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
    {
        throw new IllegalStateException();
    }

    private int iiiiiiiiStub(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
    {
        throw new IllegalStateException();
    }

    private int iiiiiilStub(int arg0, int arg1, int arg2, int arg3, int arg4, long arg5)
    {
        throw new IllegalStateException();
    }

    private int illStub(long arg0, long arg1)
    {
        throw new IllegalStateException();
    }

    private int illllStub(long arg0, long arg1, long arg2, long arg3)
    {
        throw new IllegalStateException();
    }

    private long lllStub(long arg0, long arg1)
    {
        throw new IllegalStateException();
    }

    private void vStub()
    {
        throw new IllegalStateException();
    }

    private void viStub(int arg0)
    {
        throw new IllegalStateException();
    }

    private void vidStub(int arg0, double arg1)
    {
        throw new IllegalStateException();
    }

    private void vifStub(int arg0, float arg1)
    {
        throw new IllegalStateException();
    }

    private void viiStub(int arg0, int arg1)
    {
        throw new IllegalStateException();
    }

    private void viiiStub(int arg0, int arg1, int arg2)
    {
        throw new IllegalStateException();
    }

    private void viiiiStub(int arg0, int arg1, int arg2, int arg3)
    {
        throw new IllegalStateException();
    }

    private void villllStub(int arg0, long arg1, long arg2, long arg3, long arg4)
    {
        throw new IllegalStateException();
    }

    private void viiiiiStub(int arg0, int arg1, int arg2, int arg3, int arg4)
    {
        throw new IllegalStateException();
    }

    private double dddStub(double arg0, double arg1)
    {
        throw new IllegalStateException();
    }

    private void viiiiiiiStub(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
    {
        throw new IllegalStateException();
    }

    private int idStub(double arg0)
    {
        throw new IllegalStateException();
    }

//    private final HelloWorld.Imports stubImports = new HelloWorld.Imports(
//            this::dddStub,
//            this::dddStub,
//            this::vStub,
//            this::viStub,
//            this::viStub,
//            this::viStub,
//            this::viStub,
//            this::viStub,
//            this::viStub,
//            this::viStub,
//            this::viStub,
//            this::viStub,
//            this::viStub,
//            this::viStub,
//            this::viStub,
//            this::viStub,
//            this::viStub,
//            this::iiiiiStub,
//            this::iiStub,
//            this::viiStub,
//            this::viiiStub,
//            this::iiiiiiiiStub,
//            this::iiiStub,
//            this::viiiiStub,
//            this::viStub,
//            this::iiiiiiStub,
//            this::viiiiiiiStub,
//            this::iiiiStub,
//            this::iiiiiiiStub,
//            this::viiiiiStub,
//            this::viStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::viStub,
//            this::iiiStub,
//            this::viiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::viiiiStub,
//            this::iiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::iiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::iiiiStub,
//            this::iiiStub,
//            this::iiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::viStub,
//            this::vStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::iiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::iiiStub,
//            this::iiStub,
//            this::iiiStub,
//            this::idStub
//    );

    @Test
    public void testHelloWorld()
            throws Throwable
    {
//        HelloWorld module = new HelloWorld(stubImports);
//        // module._sqlite3_initialize();
//        module._sqlite3_open(0, 0);
    }
}
