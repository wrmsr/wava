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

// http://blog.glehmann.net/2014/12/29/Playing-with-libclang/
// http://eli.thegreenplace.net/2011/07/03/parsing-c-in-python-with-clang
// https://github.com/eliben/llvm-clang-samples/blob/master/tools/htmlize-ast-dump.py

// LayoutOverrideSource.cpp
// void ASTDumper::dumpDecl(const Decl *D) {
// bin/clang -w -Xclang -fdump-record-layouts -fno-color-diagnostics -I ~/src/wrmsr/wava/tmp/wasm-install/sysroot/include --target=wasm32 -emit-llvm -c a.c -o a.bc
// echo '#include <fcntl.h>' | bin/clang -dM -E -

/*
echo '#include <fcntl.h>' | bin/clang -I/Users/spinlock/src/wrmsr/wava/tmp/wasm-install/sysroot/include --target=wasm32 -dM -E -

functions
structs
enums
constants
defines

https://stackoverflow.com/questions/1562074/how-do-i-show-the-value-of-a-define-at-compile-time

0x200
(-100)
02000
1
(03|O_PATH)
                            <---- yes a blank line
unsigned short
4.9406564584124654e-324
2.2204460492503131e-16
1.7976931348623157e+308
2.2250738585072014e-308
1.40129846e-45F
1.19209290e-7F
3.40282347e+38F
\"hd\"
2147483647
long long int
signed char
9223372036854775807LL
6.47517511943802511092443895822764655e-4966L
4294967295U
18446744073709551615ULL
long long unsigned int
\"4.2.1 Compatible Clang 4.0.0 (https://github.com/llvm-mirror/clang b305e4d9e02974c2f92723caa4a2dda3a092f99f) (https://github.com/llvm-mirror/llvm 86a6238dca2b84e17b036e898281378e2a0f0139)\"
\"4.0.0 (https://github.com/llvm-mirror/clang b305e4d9e02974c2f92723caa4a2dda3a092f99f) (https://github.com/llvm-mirror/llvm 86a6238dca2b84e17b036e898281378e2a0f0139)\"

(5 | (1<<8))
(10 | (19<<8))
((sqlite3_destructor_type)-1)


va_arg(v,l) -> __builtin_va_arg(v,l)
va_copy(d,s) -> __builtin_va_copy(d,s)
va_end(v) -> __builtin_va_end(v)
va_start(v,l) -> __builtin_va_start(v,l)


https://github.com/antlr/grammars-v4/blob/master/cpp/CPP14.g4 ?
https://github.com/javaparser/javaparser/tree/master/javaparser-core/src/main/java/com/github/javaparser/ast
https://github.com/uklimaschewski/EvalEx
*/

import com.wrmsr.wava.util.process.FinalizedProcess;
import com.wrmsr.wava.util.process.FinalizedProcessBuilder;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import static com.google.common.base.Preconditions.checkState;

public class TestClangRecordParser
{
    @Test
    public void testClang()
            throws Exception
    {
        String[] argv = {
                "/Users/spinlock/src/llvm/clang/build/bin/clang",
                "-I/Users/spinlock/src/wrmsr/wava/tmp/wasm-install/sysroot/include",
                "--target=wasm32",
                "-dM",
                "-E",
                "-"
        };

        String src;
        src = "#include <fcntl.h>\n";
        src = new String(Files.readAllBytes(Paths.get("/Users/spinlock/src/llvm/clang/build/sqlite3.h")));

        StringBuilder sb = new StringBuilder();
        Map<String, String> dct = new LinkedHashMap<>();

        FinalizedProcessBuilder processBuilder = new FinalizedProcessBuilder(argv);
        processBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);
        try (FinalizedProcess process = processBuilder.start()) {
            process.getOutputStream().write(src.getBytes());
            process.getOutputStream().close();
            Scanner scanner = new Scanner(process.getInputStream());
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("#define ")) {
                    int ofs = line.indexOf(' ', 9);
                    checkState(ofs > 0);
                    String key = line.substring(8, ofs);
                    String value = line.substring(ofs + 1);

                    sb.append(line).append('\n');
                    dct.put(key, value);
                }
            }
            process.waitFor(10, TimeUnit.SECONDS);
        }

        String strMacro = "__" + UUID.randomUUID().toString().replace('-', '_');
        checkState(!dct.containsKey(strMacro));
        sb.append(String.format("#define %s_0(x) #x\n", strMacro));
        sb.append(String.format("#define %s_1(x) %s_0(x)\n", strMacro, strMacro));
        sb.append(String.format("#define %s(var) #var %s_1(var)\n", strMacro, strMacro));
        for (String key : dct.keySet()) {
//            sb.append(String.format("#pragma message(%s(%s))\n", strMacro, key));
            sb.append(String.format("%s(%s)\n", strMacro, key));
        }

        argv = new String[] {
                "/Users/spinlock/src/llvm/clang/build/bin/clang",
                "-I/Users/spinlock/src/wrmsr/wava/tmp/wasm-install/sysroot/include",
                "--target=wasm32",
                "-E",
                "-"
        };
        processBuilder = new FinalizedProcessBuilder(argv);
        processBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);
        try (FinalizedProcess process = processBuilder.start()) {
            process.getOutputStream().write(sb.toString().getBytes());
            process.getOutputStream().close();
            Scanner scanner = new Scanner(process.getInputStream());
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("\"")) {
                    int pos = line.indexOf('\"', 1);
                    checkState(pos > 0 && line.charAt(pos + 1) == ' ' && line.charAt(pos + 2) == '\"' && line.endsWith("\""));
                    String key = line.substring(1, pos);
                    String value = line.substring(pos + 3, line.length() - 1);
                    System.out.println(key);
                    System.out.println(value);
                }
            }
            process.waitFor(10, TimeUnit.SECONDS);
        }
    }

    @Test
    public void testParsing()
            throws Exception
    {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream("dump-record-layouts.txt")))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                if (line.equals("*** Dumping AST Record Layout")) {

                }
            }
        }
    }
}
