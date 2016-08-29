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

public interface MuslRuntime
{
    void _Exit(int arg0);

    void __addtf3(int arg0, long arg1, long arg2, long arg3, long arg4);

    void __block_all_sigs(int arg0);

    void __divtf3(int arg0, long arg1, long arg2, long arg3, long arg4);

    int __dl_invalid_handle(int arg0);

    void __dl_seterr(int arg0, int arg1);

    void __extenddftf2(int arg0, double arg1);

    void __extendsftf2(int arg0, float arg1);

    int __fdopen(int arg0, int arg1);

    long __fixtfdi(long arg0, long arg1);

    int __fixtfsi(long arg0, long arg1);

    void __floatscan(int arg0, int arg1, int arg2, int arg3);

    void __floatsitf(int arg0, int arg1);

    int __lctrans(int arg0, int arg1);

    int __lctrans_cur(int arg0);

    void __lock(int arg0);

    int __lockfile(int arg0);

    int __lttf2(long arg0, long arg1, long arg2, long arg3);

    int __madvise(int arg0, int arg1, int arg2);

    int __mmap(int arg0, int arg1, int arg2, int arg3, int arg4, long arg5);

    int __mremap(int arg0, int arg1, int arg2, int arg3, int arg4);

    void __multf3(int arg0, long arg1, long arg2, long arg3, long arg4);

    int __munmap(int arg0, int arg1);

    int __netf2(long arg0, long arg1, long arg2, long arg3);

    int __randname(int arg0);

    int __rem_pio2_large(int arg0, int arg1, int arg2, int arg3, int arg4);

    int __set_thread_area(int arg0);

    void __synccall(int arg0, int arg1);

    int __syscall0(int arg0);

    int __syscall1(int arg0, int arg1);

    int __syscall2(int arg0, int arg1, int arg2);

    int __syscall3(int arg0, int arg1, int arg2, int arg3);

    int __syscall4(int arg0, int arg1, int arg2, int arg3, int arg4);

    int __syscall5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    int __syscall6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    int __syscall_cp(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    double __trunctfdf2(long arg0, long arg1);

    float __trunctfsf2(long arg0, long arg1);

    void __unlock(int arg0);

    void __unlockfile(int arg0);

    void __wait(int arg0, int arg1, int arg2, int arg3);

    void abort();

    int fcntl(int arg0, int arg1, int arg2);

    int fdopen(int arg0, int arg1);

    int feclearexcept(int arg0);

    int fegetround();

    int feraiseexcept(int arg0);

    int fesetround(int arg0);

    int fetestexcept(int arg0);

    int fprintf(int arg0, int arg1, int arg2);

    int iswctype(int arg0, int arg1);

    int iswspace(int arg0);

    int mbtowc(int arg0, int arg1, int arg2);

    int nanosleep(int arg0, int arg1);

    int posix_spawn(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    int posix_spawn_file_actions_adddup2(int arg0, int arg1, int arg2);

    int posix_spawn_file_actions_destroy(int arg0);

    int posix_spawn_file_actions_init(int arg0);

    int pthread_self();

    int setitimer(int arg0, int arg1, int arg2);

    int snprintf(int arg0, int arg1, int arg2, int arg3);

    int sprintf(int arg0, int arg1, int arg2);

    int towlower(int arg0);

    int towupper(int arg0);

    int uname(int arg0);

    int vfprintf(int arg0, int arg1, int arg2);

    int vfscanf(int arg0, int arg1, int arg2);

    int vsnprintf(int arg0, int arg1, int arg2, int arg3);

    int wctype(int arg0);

    int __stdio_write(int arg0, int arg1, int arg2);

    int __stdout_write(int arg0, int arg1, int arg2);
}
