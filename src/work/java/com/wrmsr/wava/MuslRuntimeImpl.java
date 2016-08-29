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

public class MuslRuntimeImpl
        implements MuslRuntime
{
    @Override
    public void _Exit(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void __addtf3(int arg0, long arg1, long arg2, long arg3, long arg4)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void __block_all_sigs(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void __divtf3(int arg0, long arg1, long arg2, long arg3, long arg4)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __dl_invalid_handle(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void __dl_seterr(int arg0, int arg1)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void __extenddftf2(int arg0, double arg1)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void __extendsftf2(int arg0, float arg1)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __fdopen(int arg0, int arg1)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public long __fixtfdi(long arg0, long arg1)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __fixtfsi(long arg0, long arg1)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void __floatscan(int arg0, int arg1, int arg2, int arg3)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void __floatsitf(int arg0, int arg1)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __lctrans(int arg0, int arg1)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __lctrans_cur(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void __lock(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __lockfile(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __lttf2(long arg0, long arg1, long arg2, long arg3)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __madvise(int arg0, int arg1, int arg2)
    {
        throw new UnsupportedOperationException();
    }

    private int curMmap = 2097152;

    @Override
    public int __mmap(int arg0, int arg1, int arg2, int arg3, int arg4, long arg5)
    {
        if (arg0 == 0) {
            int ret = curMmap;
            curMmap += arg1;
            return ret;
        }
        else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public int __mremap(int arg0, int arg1, int arg2, int arg3, int arg4)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void __multf3(int arg0, long arg1, long arg2, long arg3, long arg4)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __munmap(int arg0, int arg1)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __netf2(long arg0, long arg1, long arg2, long arg3)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __randname(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __rem_pio2_large(int arg0, int arg1, int arg2, int arg3, int arg4)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __set_thread_area(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void __synccall(int arg0, int arg1)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __syscall0(int arg0)
    {
        if (arg0 == 375) {
            // membarrier
            return 0;
        }
        else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public int __syscall1(int arg0, int arg1)
    {
        if (arg0 == 45) {
            // brk
            if (arg1 == 0) {
                // return current
                return 65536;
            }
            else {
                throw new UnsupportedOperationException();
            }
        }
        else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public int __syscall2(int arg0, int arg1, int arg2)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __syscall3(int arg0, int arg1, int arg2, int arg3)
    {
        if (arg0 == 240) {
            // futex
            return 0;
        }
        else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public int __syscall4(int arg0, int arg1, int arg2, int arg3, int arg4)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __syscall5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __syscall6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __syscall_cp(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public double __trunctfdf2(long arg0, long arg1)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public float __trunctfsf2(long arg0, long arg1)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void __unlock(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void __unlockfile(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void __wait(int arg0, int arg1, int arg2, int arg3)
    {
    }

    @Override
    public void abort()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int fcntl(int arg0, int arg1, int arg2)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int fdopen(int arg0, int arg1)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int feclearexcept(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int fegetround()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int feraiseexcept(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int fesetround(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int fetestexcept(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int fprintf(int arg0, int arg1, int arg2)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int iswctype(int arg0, int arg1)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int iswspace(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int mbtowc(int arg0, int arg1, int arg2)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int nanosleep(int arg0, int arg1)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int posix_spawn(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int posix_spawn_file_actions_adddup2(int arg0, int arg1, int arg2)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int posix_spawn_file_actions_destroy(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int posix_spawn_file_actions_init(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int pthread_self()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int setitimer(int arg0, int arg1, int arg2)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int snprintf(int arg0, int arg1, int arg2, int arg3)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int sprintf(int arg0, int arg1, int arg2)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int towlower(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int towupper(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int uname(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int vfprintf(int arg0, int arg1, int arg2)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int vfscanf(int arg0, int arg1, int arg2)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int vsnprintf(int arg0, int arg1, int arg2, int arg3)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int wctype(int arg0)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __stdio_write(int arg0, int arg1, int arg2)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int __stdout_write(int arg0, int arg1, int arg2)
    {
        throw new UnsupportedOperationException();
    }
}
