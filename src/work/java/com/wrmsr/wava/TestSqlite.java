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

import com.wrmsr.wava.util.POSIXUtils;
import jnr.posix.FileStat;
import jnr.posix.MacOSFileStat;
import jnr.posix.POSIX;
import org.junit.Test;

import static com.google.common.base.Preconditions.checkState;

public class TestSqlite
{
    private sqlite3 sqlite3;
    private POSIX posix;

    public final class StubImpl
            implements sqlite3.Imports.Stub
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
            if (arg0 == 33) {
                // access
//                return posix.access(readString(arg1), arg2);
                return 0;
            }
            else {
                throw new UnsupportedOperationException();
            }
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
            if (arg0 == 140) {
                sqlite3._memory.putInt(arg4, posix.lseek(arg1, arg2, arg3));
                return 0;
            }
            else {
                throw new UnsupportedOperationException();
            }
        }

        @Override
        public int __syscall6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public int __syscall_cp(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
        {
            if (arg0 == 6) {
                return posix.close(arg1);
            }
            else if (arg0 == 3) {
                byte[] buf = new byte[arg3];
                int ret = posix.read(arg1, buf, buf.length);
                if (ret < 0) {
                    return ret;
                }
                sqlite3._memory.position(arg2);
                sqlite3._memory.put(buf, 0, ret);
                return ret;
            }
            else {
                throw new UnsupportedOperationException();
            }
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
        public int dlerror()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public int fcntl(int arg0, int arg1, int arg2)
        {
//            throw new UnsupportedOperationException();
            return 0;
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
        public int gettimeofday(int arg0, int arg1)
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
        public int localtime(int arg0)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public int mbtowc(int arg0, int arg1, int arg2)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public int mmap(int arg0, int arg1, int arg2, int arg3, int arg4, long arg5)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public int munmap(int arg0, int arg1)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public int nanosleep(int arg0, int arg1)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public int open(int arg0, int arg1, int arg2)
        {
            String f = readString(arg0);
            int m = 0;
            if ((arg1 & jnr.constants.platform.linux.OpenFlags.O_RDWR.intValue()) != 0) {
                m |= jnr.constants.platform.darwin.OpenFlags.O_RDWR.intValue();
            }
            if ((arg1 & jnr.constants.platform.linux.OpenFlags.O_WRONLY.intValue()) != 0) {
                m |= jnr.constants.platform.darwin.OpenFlags.O_WRONLY.intValue();
            }
            if ((arg1 & jnr.constants.platform.linux.OpenFlags.O_APPEND.intValue()) != 0) {
                m |= jnr.constants.platform.darwin.OpenFlags.O_APPEND.intValue();
            }
            if ((arg1 & jnr.constants.platform.linux.OpenFlags.O_SYNC.intValue()) != 0) {
                m |= jnr.constants.platform.darwin.OpenFlags.O_SYNC.intValue();
            }
            if ((arg1 & jnr.constants.platform.linux.OpenFlags.O_ASYNC.intValue()) != 0) {
                m |= jnr.constants.platform.darwin.OpenFlags.O_ASYNC.intValue();
            }
            if ((arg1 & jnr.constants.platform.linux.OpenFlags.O_FSYNC.intValue()) != 0) {
                m |= jnr.constants.platform.darwin.OpenFlags.O_FSYNC.intValue();
            }
            if ((arg1 & jnr.constants.platform.linux.OpenFlags.O_CREAT.intValue()) != 0) {
                m |= jnr.constants.platform.darwin.OpenFlags.O_CREAT.intValue();
            }
            if ((arg1 & jnr.constants.platform.linux.OpenFlags.O_TRUNC.intValue()) != 0) {
                m |= jnr.constants.platform.darwin.OpenFlags.O_TRUNC.intValue();
            }

            return posix.open(f,
                    m,
//                    arg1,
                    0600);
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
        public int stat(int arg0, int arg1)
        {
//            throw new UnsupportedOperationException();

            FileStat stat = posix.allocateStat();
            int ret = posix.stat(readString(arg0), stat);
            sqlite3._memory.putLong(arg1, stat.dev());
            sqlite3._memory.putLong(arg1 + 112, stat.ino());
            return ret;
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
        public int utimes(int arg0, int arg1)
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

        @Override
        public int getcwd(int arg0, int arg1)
        {
            writeString(arg0, System.getProperty("user.dir"));
            return arg0;
        }

        @Override
        public int fstat(int arg0, int arg1)
        {
            FileStat stat = posix.fstat(arg0);
            sqlite3._memory.putLong(arg1, stat.dev());
            sqlite3._memory.putLong(arg1 + 112, stat.ino());
//            sqlite3._memory.putLong(arg1 + 40, stat.st_size());
            return 0;
        }
    }

    private String readString(int p)
    {
        StringBuilder sb = new StringBuilder();
        for (int c = 0; (c = sqlite3._memory.get(p++)) != 0; ) {
            sb.append((char) c);
        }
        return sb.toString();
    }

    private void writeString(int p, String str)
    {
        for (int i = 0; i < str.length(); ++i) {
            sqlite3._memory.put(p + i, (byte) str.charAt(i));
        }
        sqlite3._memory.put(p + str.length(), (byte) 0);
    }

    public static final int SQLITE_ROW = 100;  /* sqlite3_step() has another row ready */
    public static final int SQLITE_DONE = 101;  /* sqlite3_step() has finished executing */

    @Test
    public void testSqlite()
            throws Exception
    {
        posix = POSIXUtils.getPOSIX();

        sqlite3 = new sqlite3(new sqlite3.Imports(new StubImpl()));

        sqlite3.sqlite3_initialize();

        int filename = 1048576 - 1024;
        int ppDb = filename - 1024;
        writeString(filename, "a.db");
        sqlite3._memory.putInt(ppDb, 0);

        int rc = sqlite3.sqlite3_open(filename, ppDb);
        int db = sqlite3._memory.getInt(ppDb);

        int error = ppDb - 1024;
        int sql = error - 1024;
        writeString(sql, "select 1 'hi', 2 'bye', 1 + 2 'what', 1 'ugh', 'why' 'sql', (123.456 + 30.0001) 'f', ('hi' || 'there') 'asdf';");
//        writeString(sql, "select * from ints;");
//        writeString(sql, "SELECT name, sql FROM sqlite_master WHERE type='table' ORDER BY name;");
//        ret = sqlite3.sqlite3_exec(db, sql, 0, 0, error);
//        System.out.println(ret);

        int pstmt = sql - 1024;
        checkState((rc = sqlite3.sqlite3_prepare_v2(db, sql, -1, pstmt, 0)) == 0);
        int stmt = sqlite3._memory.getInt(pstmt);

        while (true) {
            rc = sqlite3.sqlite3_step(stmt);
            checkState(rc == SQLITE_DONE || rc == SQLITE_ROW);
            if (rc == SQLITE_DONE) {
                break;
            }

            int numCols = sqlite3.sqlite3_column_count(stmt);
            for (int i = 0; i < numCols; ++i) {
                int col = sqlite3.sqlite3_column_name(stmt, i);
                System.out.println(readString(col));
                int type = sqlite3.sqlite3_column_type(stmt, i);
                System.out.println(type);

                if (type == 1) {
                    System.out.println(sqlite3.sqlite3_value_int(sqlite3.sqlite3_column_value(stmt, i)));
                }
                else if (type == 2) {
                    System.out.println(sqlite3.sqlite3_value_double(sqlite3.sqlite3_column_value(stmt, i)));
                }
                else {
                    int val = sqlite3.sqlite3_column_text(stmt, i);
                    System.out.println(readString(val));
                }
            }

            System.out.println();
        }

        if (stmt != 0) {
            sqlite3.sqlite3_finalize(stmt);
        }
    }
}
