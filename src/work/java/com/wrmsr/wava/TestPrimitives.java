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

import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.yen.expression.YExpression;
import com.wrmsr.wava.yen.parser.ModuleFactory;
import org.testng.annotations.Test;

public class TestPrimitives
{
    private static int _truncSFloat3232(float val)
    {
        if (Float.isNaN(val)) {
            throw new IllegalStateException();
        }
        if (val > (float) Integer.MAX_VALUE || val < (float) Integer.MIN_VALUE) {
            throw new IllegalStateException();
        }
        return (int) val;
    }

    private static int _truncSFloat6432(double val)
    {
        if (Double.isNaN(val)) {
            throw new IllegalStateException();
        }
        if (val > (double) Integer.MAX_VALUE || val < (double) Integer.MIN_VALUE) {
            throw new IllegalStateException();
        }
        return (int) val;
    }

    private static long _truncSFloat3264(float val)
    {
        if (Float.isNaN(val)) {
            throw new IllegalStateException();
        }
        long converted = (long) val;
        if ((val >= 1 && converted <= 0) || val < (float) Long.MIN_VALUE) {
            throw new IllegalStateException();
        }
        return converted;
    }

    private static long _truncSFloat6464(double val)
    {
        if (Double.isNaN(val)) {
            throw new IllegalStateException();
        }
        long converted = (long) val;
        if ((val >= 1 && converted <= 0) || val < (double) Long.MIN_VALUE) {
            throw new IllegalStateException();
        }
        return converted;
    }

    private static int _truncUFloat3232(float val)
    {
        if (Float.isNaN(val)) {
            throw new IllegalStateException();
        }
        if (val > (float) 0xFFFFFFFFL || val <= (float) -1) {
            throw new IllegalStateException();
        }
        return (int) (long) val;
    }

    private static int _truncUFloat6432(double val)
    {
        if (Double.isNaN(val)) {
            throw new IllegalStateException();
        }
        if (val > (double) 0xFFFFFFFFL || val <= (double) -1) {
            throw new IllegalStateException();
        }
        return (int) (long) val;
    }

    @Test
    public void testTruncs()
    {
        _truncUFloat3232((float) (((long) Integer.MAX_VALUE) + 100));
    }

//    Literal truncUFloat(Unary* curr, Literal value) {
//        double val = value.getFloat();
//        if (std::isnan(val)) trap("truncUFloat of nan");
//        uint64_t converted = (uint64_t)val;
//        if (converted < val - 1 || val <= (double)-1) trap("i64.truncUFloat overflow");
//        return Literal(converted);
//    }

    @Test
    public void testNaaaaaans()
            throws Throwable
    {
        YExpression yexpr = ModuleFactory.parseConst("nan:0x8000000000000", Type.F64);
    }

    @Test
    public void testBlah()
            throws Throwable
    {
//        int x = -499;
//        long l = x & 4294967295L;
//        long l = (long) x;
//        System.out.println(l);
        long l = ~(1L << 40);
        int i = (int) l;
        System.out.println(i);
    }

    @Test
    public void testStrings()
            throws Throwable
    {
        new String(new byte[] {(byte) 0xFF, (byte) 0xFF});
    }
}
