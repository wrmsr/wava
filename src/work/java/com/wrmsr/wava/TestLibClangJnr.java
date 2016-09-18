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
import com.wrmsr.wava.clang.CxIndex;
import com.wrmsr.wava.clang.CxRuntime;
import com.wrmsr.wava.clang.CxString;
import com.wrmsr.wava.clang.CxTranslationUnit;
import com.wrmsr.wava.clang.jffi.JffiCxRuntime;

public class TestLibClangJnr
{
    // static void DoPrintMacros(Preprocessor &PP, raw_ostream *OS) {

    public static void main(String[] args)
            throws Throwable
    {
        CxRuntime cxRuntime = JffiCxRuntime.create("/Users/spinlock/src/llvm/clang/build/lib/libclang.dylib");
        try (CxString ver = cxRuntime.getClangVersion()) {
            System.out.println(ver.get());
        }
        try (CxIndex idx = cxRuntime.createIndex(0, 0)) {
            System.out.println(idx);
            try (CxTranslationUnit tu = idx.parseTranslationUnit("a.c", ImmutableList.of(), ImmutableSet.of())) {

            }
        }
    }
}
