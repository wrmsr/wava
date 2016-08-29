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

import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.unit.Module;
import com.wrmsr.wava.core.unit.Segment;
import com.wrmsr.wava.yen.global.YModule;
import com.wrmsr.wava.yen.parser.ModuleFactory;
import com.wrmsr.wava.yen.parser.Parser;
import com.wrmsr.wava.yen.parser.element.Element;
import com.wrmsr.wava.yen.parser.input.Input;
import com.wrmsr.wava.yen.translation.UnitTranslation;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;

public class TestMemory
{
    // private static int _truncSFloat3232(float val) { return 0; }
    // private static long _truncSFloat3264(float val) { return 0; }
    // private static int _truncUFloat3232(float val) { return 0; }
    // private static long _truncUFloat3264(float val) { return 0; }
    // private static int _truncSFloat6432(double val) { return 0; }
    // private static long _truncSFloat6464(double val) { return 0; }
    // private static int _truncUFloat6432(double val) { return 0; }
    // private static long _truncUFloat6464(double val) { return 0; }

    /**
     * DirectByteBuffers are garbage collected by using a phantom reference and a
     * reference queue. Every once a while, the JVM checks the reference queue and
     * cleans the DirectByteBuffers. However, as this doesn't happen
     * immediately after discarding all references to a DirectByteBuffer, it's
     * easy to OutOfMemoryError yourself using DirectByteBuffers. This function
     * explicitly calls the Cleaner method of a DirectByteBuffer.
     *
     * @param toBeDestroyed The DirectByteBuffer that will be "cleaned". Utilizes reflection.
     */
    public static void destroyDirectByteBuffer(ByteBuffer toBeDestroyed)
            throws ReflectiveOperationException
    {
        checkArgument(toBeDestroyed.isDirect(), "toBeDestroyed isn't direct!");
        Method cleanerMethod = toBeDestroyed.getClass().getMethod("cleaner");
        cleanerMethod.setAccessible(true);
        Object cleaner = cleanerMethod.invoke(toBeDestroyed);
        Method cleanMethod = cleaner.getClass().getMethod("clean");
        cleanMethod.setAccessible(true);
        cleanMethod.invoke(cleaner);
    }

    @Test
    public void testMem()
            throws Throwable
    {
        ByteBuffer buf = ByteBuffer.allocateDirect(4096);
        buf.putDouble(4087, 1.0);
        System.out.println(buf.getDouble(4087));
        destroyDirectByteBuffer(buf);

        Element root = (new Parser(Input.ofResource("musl.wast"))).parse();
        YModule ymodule = new ModuleFactory(root).create();
        Module module = UnitTranslation.translateModule(Name.of("Thing"), ymodule);

        List<Segment> segments = module.getMemory().getSegments();
        buf = ByteBuffer.allocate((segments.size() * 8) + segments.stream().mapToInt(Segment::getLength).sum());
        for (Segment segment : module.getMemory().getSegments()) {
            buf.putInt(segment.getOffset());
            buf.putInt(segment.getLength());
            buf.put(segment.getData());
        }
        String encoded = new String(java.util.Base64.getEncoder().encode(buf.array()));
    }
}
