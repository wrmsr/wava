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

public class TestFib
{
    public int printf(int arg0, int arg1)
    {
        return 0;
    }

    @Test
    public void testFib()
    {
        label:
        do {
            System.out.println("hi");
            continue label;
        }
        while (false);

        fib module = new fib(new fib.Imports(this::printf));
        module.main(0, 0);
        module.fib(100);
    }
}
