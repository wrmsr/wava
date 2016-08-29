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
package com.wrmsr.wava.compile;

import org.apache.maven.project.MavenProject;
import org.testng.annotations.Test;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

import static com.google.common.collect.Lists.newArrayList;

/*
return (switch (x) { case 1: return 1; default: return 0; }) + (
*/
public class TestCompiler
{
    @Test
    public void testJavac()
            throws Throwable
    {
        MavenProject prj;

        // Save source in .java file.
        File sourceRoot = new File("src/main/java");

        // Compile source file.
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        List<File> sourceFiles =
                Files.walk(sourceRoot.toPath())
                        .filter(Files::isRegularFile)
                        .filter(f -> f.toAbsolutePath().toString().endsWith(".java"))
                        .map(f -> f.toFile())
                        .collect(Collectors.toList());

        List<String> args = newArrayList(
                "-Xlint:-options",
                "-source", "1.5"
        );
        args.addAll(sourceFiles.stream().map(f -> f.getPath()).collect(Collectors.toList()));
        compiler.run(null, null, null, args.toArray(new String[args.size()]));

        // Load and instantiate compiled class.
        URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] {sourceRoot.toURI().toURL()});
        Class<?> cls = Class.forName("test.Test", true, classLoader); // Should print "hello".
        Object instance = cls.newInstance(); // Should print "world".
        System.out.println(instance); // Should print "test.Test@hashcode".
    }
}
