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
import com.wrmsr.wava.clang.CxChildVisitResult;
import com.wrmsr.wava.clang.CxCursor;
import com.wrmsr.wava.clang.CxIndex;
import com.wrmsr.wava.clang.CxRuntime;
import com.wrmsr.wava.clang.CxTranslationUnit;
import com.wrmsr.wava.clang.jffi.JffiCxRuntime;
import com.wrmsr.wava.util.POSIXUtils;

// https://github.com/jnr/jffi/blob/master/src/test/java/com/kenai/jffi/ClosureTest.java
// https://github.com/jnr/jffi/blob/master/src/test/java/com/kenai/jffi/NumberTest.java
// https://github.com/jnr/jffi/blob/master/src/test/java/com/kenai/jffi/InvokerTest.java
// process handle SIGPIPE SIGBUS SIGSEGV -n true -p true -s false
// https://github.com/llvm-mirror/clang/commits/master/include/clang-c

public class TestLibClangJnr
{
    // static void DoPrintMacros(Preprocessor &PP, raw_ostream *OS) {

    public static void main(String[] args)
            throws Throwable
    {
        int pid = POSIXUtils.getPOSIX().getpid();
        System.out.println(pid);

        String libraryPath = "/Users/spinlock/src/llvm/clang/build/lib/libclang.dylib";
        libraryPath = "/Users/spinlock/Library/Caches/CLion2016.2/cmake/generated/clang-4a32f2f0/4a32f2f0/Debug/lib/libclang.dylib";

        CxRuntime cxRuntime = JffiCxRuntime.create(libraryPath);
        System.out.println(cxRuntime.getClangVersion());
        try (CxIndex idx = cxRuntime.createIndex(0, 0)) {
            System.out.println(idx);
            try (CxTranslationUnit tu = idx.parseTranslationUnit(
                    "/Users/spinlock/a.c",
                    ImmutableList.of("-I/Users/spinlock/src/wrmsr/wava/tmp/wasm-install/sysroot/include", "--target=wasm32"),
                    ImmutableSet.of())) {
                System.out.println(tu);
                CxCursor cursor = tu.getCursor();
                System.out.println(cursor);
                System.out.println(cursor.getKind());

                cursor.visitChildren((cur, parent) -> {
                    System.out.println(cur.getKind());
                    System.out.println(cur.getSpelling());
                    System.out.println(cur.getType().getSpelling());
                    return CxChildVisitResult.Continue;
                });
            }
        }
    }
}
