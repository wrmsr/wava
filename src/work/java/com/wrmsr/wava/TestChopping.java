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

public class TestChopping
{
    private static abstract class sqlite3$0
    {
        public static final class Imports
        {

        }

        protected final Imports imports;

        public sqlite3$0(Imports imports)
        {
            this.imports = imports;
        }

        protected final int _memory = 0;

        public abstract int func0();

        public abstract int func1();

        public abstract int func2();
    }

    private static abstract class sqlite3$1
            extends sqlite3$0
    {
        public sqlite3$1(Imports imports)
        {
            super(imports);
        }

        @java.lang.Override
        public final int func0()
        {
            return 0;
        }
    }

    private static abstract class sqlite3$2
            extends sqlite3$1
    {
        public sqlite3$2(Imports imports)
        {
            super(imports);
        }

        @java.lang.Override
        public final int func1()
        {
            return 0;
        }
    }

    private static abstract class sqlite3$3
            extends sqlite3$2
    {
        public sqlite3$3(Imports imports)
        {
            super(imports);
        }

        @java.lang.Override
        public final int func2()
        {
            return 0;
        }
    }

    public static final class sqlite3
            extends sqlite3$3
    {
        public sqlite3(Imports imports)
        {
            super(imports);
        }
    }

    public void testLayers()
            throws Exception
    {
        sqlite3 sqlite3 = new sqlite3(null);
        sqlite3.func0();
        sqlite3.func1();
        sqlite3.func2();
    }
}
