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
package com.wrmsr.wava.java.javac;

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.java.javac.option.JavacOption;

import javax.tools.Tool;
import javax.tools.ToolProvider;

import java.io.File;
import java.util.List;

public final class InProcJavaCompiler
{
    public void compileJava(List<JavacOption> options, List<File> sourceFiles)
    {
        List<String> args = ImmutableList.<String>builder()
                .addAll(options.stream().map(JavacOption::getArgs).flatMap(List::stream).iterator())
                .addAll(sourceFiles.stream().map(File::getPath).iterator())
                .build();
        Tool javac = ToolProvider.getSystemJavaCompiler();
        javac.run(null, null, null, args.toArray(new String[args.size()]));
    }
}
