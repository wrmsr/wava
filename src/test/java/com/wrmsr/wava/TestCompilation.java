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

import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.unit.Module;
import com.wrmsr.wava.driver.StandardDriver;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.tree.declaration.JType;
import com.wrmsr.wava.yen.global.YModule;
import com.wrmsr.wava.yen.parser.ModuleFactory;
import com.wrmsr.wava.yen.parser.Parser;
import com.wrmsr.wava.yen.parser.element.Element;
import com.wrmsr.wava.yen.parser.input.Input;
import com.wrmsr.wava.yen.parser.input.StringInput;
import com.wrmsr.wava.yen.translation.UnitTranslation;
import org.junit.Test;

import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

public class TestCompilation
{
    public static final String CODE = "" +
            "(module (memory 1)\n" +
            "(func $sqlite3VdbeUsesBtree (param $0 i32) (param $1 i32)\n" +
            "    (local $2 i32)\n" +
            "    (i32.store offset=12\n" +
            "      (set_local $2\n" +
            "        (i32.sub\n" +
            "          (i32.load offset=4\n" +
            "            (i32.const 0)\n" +
            "          )\n" +
            "          (i32.const 16)\n" +
            "        )\n" +
            "      )\n" +
            "      (get_local $0)\n" +
            "    )\n" +
            "    (i32.store offset=8\n" +
            "      (get_local $2)\n" +
            "      (get_local $1)\n" +
            "    )\n" +
            "    (i32.store offset=112\n" +
            "      (set_local $2\n" +
            "        (i32.load offset=12\n" +
            "          (get_local $2)\n" +
            "        )\n" +
            "      )\n" +
            "      (i32.or\n" +
            "        (i32.load offset=112\n" +
            "          (get_local $2)\n" +
            "        )\n" +
            "        (i32.shl\n" +
            "          (i32.const 1)\n" +
            "          (get_local $1)\n" +
            "        )\n" +
            "      )\n" +
            "    )\n" +
            "    (i32.eq\n" +
            "      (get_local $1)\n" +
            "      (i32.const 1)\n" +
            "    )\n" +
            "  )" +
            ")";

    @Test
    public void testFreeStandingExpr()
            throws Exception
    {
        Element root = new Parser(new StringInput(CODE)).parse();
        YModule ymodule = new ModuleFactory(root).create();
        Module module = UnitTranslation.translateModule(Name.of("test"), ymodule);

        System.out.println(module);
    }

    @Test
    public void testCompile()
            throws Exception
    {
        String root;
        String name;

        root = "new";
        name = "sqlite3";
        // name = "sqlite3";

//        root = "fib/";
//        name = "fib";

        new StandardDriver(
                Optional.of(JQualifiedName.parse("com.wrmsr.wava"))
        ).compileWast(
                Name.of(name),
                Input.ofResource(String.format("%s/%s.wast", root, name)),
                (jcompilationUnit, renderer) -> {
                    JType jtype = (JType) jcompilationUnit.getBody();
                    StringWriter output = new StringWriter();
                    renderer.accept(output);
                    Files.write(Paths.get("tmp", jtype.getName().get() + ".java"), output.toString().getBytes());
                });
    }
}
