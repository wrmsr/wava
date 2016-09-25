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

import com.kenai.jffi.ClosureManager;
import com.kenai.jffi.Invoker;
import com.kenai.jffi.Library;
import com.kenai.jffi.MemoryIO;
import com.wrmsr.wava.clang.api.CxRuntime;
import com.wrmsr.wava.util.POSIXUtils;
import jnr.posix.POSIX;

public final class JffiClangApi
{
    private JffiClangApi()
    {
    }

    public static CxRuntime create(String libraryPath)
    {
        POSIX posix = POSIXUtils.getPOSIX();
        Invoker invoker = Invoker.getInstance();
        MemoryIO memory = MemoryIO.getCheckedInstance();
        ClosureManager closureManager = ClosureManager.getInstance();
        Library library = JffiUtils.openLibrary(libraryPath);
        return new JffiCxRuntimeImpl(posix, invoker, memory, closureManager, library);
    }
}
