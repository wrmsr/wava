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

import org.junit.Test;

public class TestMusl
{
    @Test
    public void testMusl()
            throws Exception
    {
        MuslRuntime muslRuntime = new MuslRuntimeImpl();
        musl.Imports muslImports = new musl.Imports(
                muslRuntime::_Exit,
                muslRuntime::__addtf3,
                muslRuntime::__block_all_sigs,
                muslRuntime::__divtf3,
                muslRuntime::__dl_invalid_handle,
                muslRuntime::__dl_seterr,
                muslRuntime::__extenddftf2,
                muslRuntime::__extendsftf2,
                muslRuntime::__fdopen,
                muslRuntime::__fixtfdi,
                muslRuntime::__fixtfsi,
                muslRuntime::__floatscan,
                muslRuntime::__floatsitf,
                muslRuntime::__lctrans,
                muslRuntime::__lctrans_cur,
                muslRuntime::__lock,
                muslRuntime::__lockfile,
                muslRuntime::__lttf2,
                muslRuntime::__madvise,
                muslRuntime::__mmap,
                muslRuntime::__mremap,
                muslRuntime::__multf3,
                muslRuntime::__munmap,
                muslRuntime::__netf2,
                muslRuntime::__randname,
                muslRuntime::__rem_pio2_large,
                muslRuntime::__set_thread_area,
                muslRuntime::__synccall,
                muslRuntime::__syscall0,
                muslRuntime::__syscall1,
                muslRuntime::__syscall2,
                muslRuntime::__syscall3,
                muslRuntime::__syscall4,
                muslRuntime::__syscall5,
                muslRuntime::__syscall6,
                muslRuntime::__syscall_cp,
                muslRuntime::__trunctfdf2,
                muslRuntime::__trunctfsf2,
                muslRuntime::__unlock,
                muslRuntime::__unlockfile,
                muslRuntime::__wait,
                muslRuntime::abort,
                muslRuntime::fcntl,
                muslRuntime::fdopen,
                muslRuntime::feclearexcept,
                muslRuntime::fegetround,
                muslRuntime::feraiseexcept,
                muslRuntime::fesetround,
                muslRuntime::fetestexcept,
                muslRuntime::fprintf,
                muslRuntime::iswctype,
                muslRuntime::iswspace,
                muslRuntime::mbtowc,
                muslRuntime::nanosleep,
                muslRuntime::posix_spawn,
                muslRuntime::posix_spawn_file_actions_adddup2,
                muslRuntime::posix_spawn_file_actions_destroy,
                muslRuntime::posix_spawn_file_actions_init,
                muslRuntime::pthread_self,
                muslRuntime::setitimer,
                muslRuntime::snprintf,
                muslRuntime::sprintf,
                muslRuntime::towlower,
                muslRuntime::towupper,
                muslRuntime::uname,
                muslRuntime::vfprintf,
                muslRuntime::vfscanf,
                muslRuntime::vsnprintf,
                muslRuntime::wctype,
                muslRuntime::__stdio_write,
                muslRuntime::__stdout_write);
        musl musl = new musl(muslImports);

        /*
        this._memory = java.nio.ByteBuffer.allocateDirect(2097152 * 8);
        this._storeInt(4, 2097152 - 4);
        */

        int a = musl.malloc(10);
        System.out.println(a);

        int b = musl.malloc(20);
        System.out.println(b);

        musl.free(a);
//        musl.free(a);
        a = musl.malloc(10);
        System.out.println(a);
    }
}
