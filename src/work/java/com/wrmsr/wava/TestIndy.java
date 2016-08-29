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

// java -XX:+PrintCompilation -XX:+UnlockDiagnosticVMOptions -XX:+PrintInlining -cp ./classes:./test-classes com.wrmsr.wava.TestIndy 0

import java.math.BigInteger;
import java.text.DecimalFormat;

public class TestIndy
{
    @FunctionalInterface
    public interface Fn
    {
        int f(int a, int b);
    }

    public int f1(int a, int b)
    {
        return a + b;
    }

    public int f2(int a, int b)
    {
        return a * b;
    }

    public final Fn[] fns = {
            this::f1,
            this::f2
    };

    public static void main(String[] args)
            throws Exception
    {
        int i = Integer.parseInt(args[0]);
        long poll = 10000;
        long scale = 1_000_000_000;
        TestIndy instance = new TestIndy();
        final DecimalFormat df = new DecimalFormat("#,###");

        int a = 0;
        int b = 1;
        int c = 0;
        long reps = 0;
        long last = System.nanoTime();
        while (true) {
            for (int j = 0; j < poll; ++j) {
                c += instance.fns[i].f(a++, b++);
            }
            reps += poll;
            long diff = System.nanoTime() - last;
            if (diff >= scale) {
                BigInteger rps = BigInteger.valueOf(reps).multiply(BigInteger.valueOf(scale)).divide(BigInteger.valueOf(diff));
                System.out.println(String.format("%s %s %s", df.format(reps), df.format(diff), df.format(rps)));
                reps = 0;
                last = System.nanoTime();
            }
        }
    }
}
