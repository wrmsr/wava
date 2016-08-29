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
package com.wrmsr.wava.util;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNameMangling
{
    @Test
    public void testMangling()
            throws Throwable
    {
        String[] ns = new String[] {
                "double",
                "_double",
                "$_double",
                "$double",
                "$double$",
                "$$_double",
                "$wcstox.239\uD835\uDD0A_☃$$$$$$!lol$",
                "wcstox.239\\ud83d\ude12_☃__!lol",
                "wcstox.239\uD835\uDD0A_☃__!lol",
                "_wcstox.239\uD835\uDD0A_☃__!lol",
                "_wcstox.239\uD835\uDD0A_☃__!lol_",
                "4",
                "$4"
        };
        for (String n : ns) {
            String s = NameMangler.DEFAULT.mangleName(n);
            String d = NameMangler.DEFAULT.demangleName(s);
            assertEquals(n, d);
        }
    }
}
