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

import com.google.common.base.Throwables;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public final class Buffers
{
    private Buffers()
    {
    }

    public static final boolean CLEAN_SUPPORTED;
    private static final Method directBufferCleaner;
    private static final Method directBufferCleanerClean;

    static {
        Method directBufferCleanerX = null;
        Method directBufferCleanerCleanX = null;
        boolean v;
        try {
            directBufferCleanerX = Class.forName("java.nio.DirectByteBuffer").getMethod("cleaner");
            directBufferCleanerX.setAccessible(true);
            directBufferCleanerCleanX = Class.forName("sun.misc.Cleaner").getMethod("clean");
            directBufferCleanerCleanX.setAccessible(true);
            v = true;
        }
        catch (Exception e) {
            v = false;
        }
        CLEAN_SUPPORTED = v;
        directBufferCleaner = directBufferCleanerX;
        directBufferCleanerClean = directBufferCleanerCleanX;
    }

    public static void cleanBuffer(ByteBuffer buffer)
    {
        if (CLEAN_SUPPORTED && buffer.isDirect()) {
            try {
                Object cleaner = directBufferCleaner.invoke(buffer);
                directBufferCleanerClean.invoke(cleaner);
            }
            catch (Exception e) {
                // silently ignore exception
            }
        }
    }

    private static final Field bufferAddress;

    static {
        Field bufferAddressX = null;
        try {
            bufferAddressX = Class.forName("java.nio.Buffer").getDeclaredField("address");
            bufferAddressX.setAccessible(true);
        }
        catch (ReflectiveOperationException e) {
        }
        bufferAddress = bufferAddressX;
    }

    public static long getBufferAddress(ByteBuffer buffer)
    {
        try {
            return (long) bufferAddress.get(buffer);
        }
        catch (ReflectiveOperationException e) {
            throw Throwables.propagate(e);
        }
    }
}
