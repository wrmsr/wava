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
package com.wrmsr.wava.clang.jffi;

import org.junit.Test;

public class TestJffiCx
{

//    public static boolean string_equals(Invoker invoker, String s1, String s2) {
//        Function function = getFunction("string_equals", Type.SINT, Type.POINTER, Type.POINTER);
//        CallContext ctx = getContext(Type.SINT, Type.POINTER, Type.POINTER);
//        ByteBuffer s1Buffer = Charset.defaultCharset().encode(CharBuffer.wrap(s1));
//        ByteBuffer s2Buffer  = Charset.defaultCharset().encode(CharBuffer.wrap(s2));
//
//        ObjectParameterStrategy s1strategy = new JffiUtils.HeapArrayStrategy(s1Buffer.arrayOffset(), s1Buffer.remaining());
//        ObjectParameterStrategy s2strategy = new JffiUtils.HeapArrayStrategy(s2Buffer.arrayOffset(), s2Buffer.remaining());
//        ObjectParameterInfo o1info = ObjectParameterInfo.create(0, ObjectParameterInfo.ARRAY,
//                ObjectParameterInfo.BYTE, ObjectParameterInfo.IN | ObjectParameterInfo.NULTERMINATE);
//        ObjectParameterInfo o2info = ObjectParameterInfo.create(1, ObjectParameterInfo.ARRAY,
//                ObjectParameterInfo.BYTE, ObjectParameterInfo.IN | ObjectParameterInfo.NULTERMINATE);
//
//        long ret = invoker.invokeN2(ctx, function.getFunctionAddress(), 0, 0, 2,
//                s1Buffer.array(), s1strategy, o1info, s2Buffer.array(), s2strategy, o2info);
//        return ret != 0;
//    }

    public interface libclang
    {
        void clang_toggleCrashRecovery(int isEnabled);

        JffiCxString clang_getClangVersion();
    }

    @Test
    public void testStuff()
            throws Exception
    {
        String libraryName = "/Users/spinlock/src/llvm/clang/build/lib/libclang.dylib";
        JffiCxRuntime runtime = (JffiCxRuntime) JffiCxRuntime.create(libraryName);
        libclang libclang = JffiUtils.loadLibrary(libraryName, libclang.class, JffiUtils.InvokerType.Default);
        libclang.clang_getClangVersion();
    }
}
