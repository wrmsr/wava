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
In [4]: import clang.cindex

In [5]: clang.cindex
Out[5]: <module 'clang.cindex' from 'clang/cindex.py'>

In [6]: clang.cindex.Config
Out[6]: <class clang.cindex.Config at 0x10e65a6d0>

In [7]: clang.cindex.Config.set_library_path('/Users/spinlock/src/llvm/clang/build/lib/')

In [8]: clang.cindex.Index.create()
Out[8]: <clang.cindex.Index at 0x10e3fb210>

In [9]: index.parse('/Users/spinlock/src/llvm/clang/build/a.c', ['-I', '/Users/spinlock/src/wrmsr/wava/tmp/wasm-install/sysroot/include', '--target=wasm32'])
---------------------------------------------------------------------------
NameError                                 Traceback (most recent call last)
<ipython-input-9-76b1580c3a5c> in <module>()
----> 1 index.parse('/Users/spinlock/src/llvm/clang/build/a.c', ['-I', '/Users/spinlock/src/wrmsr/wava/tmp/wasm-install/sysroot/include', '--target=wasm32'])

NameError: name 'index' is not defined

In [10]: index = clang.cindex.Index.create()

In [11]: index.parse('/Users/spinlock/src/llvm/clang/build/a.c', ['-I', '/Users/spinlock/src/wrmsr/wava/tmp/wasm-install/sysroot/include', '--target=wasm32'])
Out[11]: <clang.cindex.TranslationUnit at 0x10ed30890>

In [12]: u = index.parse('/Users/spinlock/src/llvm/clang/build/a.c', ['-I', '/Users/spinlock/src/wrmsr/wava/tmp/wasm-install/sysroot/include', '--target=wasm32'])

In [13]: tu = u

In [14]: tu.cursor
Out[14]: <clang.cindex.Cursor at 0x10ebd0290>

In [15]: type(tu.cursor)
Out[15]: clang.cindex.Cursor

In [16]: list(tu.cursor)
---------------------------------------------------------------------------
TypeError                                 Traceback (most recent call last)
<ipython-input-16-67f282ecaef0> in <module>()
----> 1 list(tu.cursor)

TypeError: 'Cursor' object is not iterable

In [17]: tu.cursor.kind
Out[17]: CursorKind.TRANSLATION_UNIT


echo '#include <fcntl.h>' | bin/clang -I/Users/spinlock/src/wrmsr/wava/tmp/wasm-install/sysroot/include --target=wasm32 -dM -E -



functions
structs
enums
constants
defines
*/

import com.wrmsr.wava.util.process.FinalizedProcess;
import com.wrmsr.wava.util.process.FinalizedProcessBuilder;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class TestClangRecordParser
{
    @Test
    public void testClang()
            throws Exception
    {
        String[] argv = {
                "/Users/spinlock/src/llvm/clang/build/bin/clang",
                "-dM",
                "-E",
                "-"
        };

        FinalizedProcessBuilder processBuilder = new FinalizedProcessBuilder(argv);
        processBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);
        processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        try (FinalizedProcess process = processBuilder.start()) {
            process.getOutputStream().write("#include <fcntl.h>\n".getBytes("UTF-8"));
            process.getOutputStream().close();
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
