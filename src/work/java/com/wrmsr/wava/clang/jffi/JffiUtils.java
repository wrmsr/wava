/*
 * Copyright (C) 2008-2010 Wayne Meissner
 *
 * This file is part of the JNR project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wrmsr.wava.clang.jffi;

import com.kenai.jffi.HeapInvocationBuffer;
import com.kenai.jffi.Library;
import com.kenai.jffi.ObjectParameterStrategy;
import com.kenai.jffi.Platform;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Objects.requireNonNull;

final class JffiUtils
{
    private JffiUtils()
    {
    }

    static final int ADDRESS_SIZE = Platform.getPlatform().addressSize();
    static final long ADDRESS_MASK = Platform.getPlatform().addressMask();

    private static final Pattern BAD_ELF = Pattern.compile("(.*): (invalid ELF header|file too short|invalid file format)");
    private static final Pattern ELF_GROUP = Pattern.compile("GROUP\\s*\\(\\s*(\\S*).*\\)");

    static Library openLibrary(String path)
    {
        Library lib;

        lib = Library.getCachedInstance(path, Library.LAZY | Library.GLOBAL);
        if (lib != null) {
            return lib;
        }

        // If dlopen() fails with 'invalid ELF header', then it is likely to be a ld script - parse it for the real library path
        Matcher badElf = BAD_ELF.matcher(Library.getLastError());
        if (badElf.lookingAt()) {
            File f = new File(badElf.group(1));
            if (f.isFile() && f.length() < (4 * 1024)) {
                Matcher sharedObject = ELF_GROUP.matcher(readAll(f));
                if (sharedObject.find()) {
                    return Library.getCachedInstance(sharedObject.group(1), Library.LAZY | Library.GLOBAL);
                }
            }
        }

        return null;
    }

    private static String readAll(File f)
    {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (br != null) {
                try {
                    br.close();
                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static final class HeapArrayStrategy
            extends ObjectParameterStrategy
    {
        private int offset, length;

        HeapArrayStrategy(int offset, int length)
        {
            super(HEAP);
            this.offset = offset;
            this.length = length;
        }

        @Override
        public long address(Object parameter)
        {
            return 0L;
        }

        @Override
        public Object object(Object parameter)
        {
            return parameter;
        }

        @Override
        public int offset(Object parameter)
        {
            return offset;
        }

        @Override
        public int length(Object parameter)
        {
            return length;
        }
    }

    static final class DirectStrategy
            extends ObjectParameterStrategy
    {
        DirectStrategy()
        {
            super(DIRECT);
        }

        @Override
        public long address(Object parameter)
        {
            return ((JffiPointer) parameter).address;
        }

        @Override
        public Object object(Object parameter)
        {
            throw new IllegalStateException("not a heap object");
        }

        @Override
        public int offset(Object parameter)
        {
            throw new IllegalStateException("not a heap object");
        }

        @Override
        public int length(Object parameter)
        {
            throw new IllegalStateException("not a heap object");
        }
    }

    interface ParameterBuffer
    {
        void putByte(final int value);

        void putShort(final int value);

        void putInt(final int value);

        void putLong(final long value);

        void putFloat(final float value);

        void putDouble(final double value);

        void putAddress(final long value);

        void putStruct(final byte[] struct, int offset);
    }

    static final class ByteBufferParameterBuffer
            implements ParameterBuffer
    {
        final ByteBuffer byteBuffer;

        public ByteBufferParameterBuffer(ByteBuffer byteBuffer)
        {
            this.byteBuffer = requireNonNull(byteBuffer);
        }

        @Override
        public void putByte(int value)
        {
            byteBuffer.put((byte) value);
        }

        @Override
        public void putShort(int value)
        {
            byteBuffer.putShort((short) value);
        }

        @Override
        public void putInt(int value)
        {
            byteBuffer.putInt(value);
        }

        @Override
        public void putLong(long value)
        {
            byteBuffer.putLong(value);
        }

        @Override
        public void putFloat(float value)
        {
            byteBuffer.putFloat(value);
        }

        @Override
        public void putDouble(double value)
        {
            byteBuffer.putDouble(value);
        }

        @Override
        public void putAddress(long value)
        {
            switch (ADDRESS_SIZE) {
                case 4:
                    byteBuffer.putInt((int) value);
                    break;
                case 8:
                    byteBuffer.putLong(value);
                    break;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override
        public void putStruct(byte[] struct, int offset)
        {
            byteBuffer.put(struct, 0, struct.length - offset);
        }
    }

    static final class HeapInvocationBufferParameterBuffer implements ParameterBuffer
    {
        final HeapInvocationBuffer heapInvocationBuffer;

        public HeapInvocationBufferParameterBuffer(HeapInvocationBuffer heapInvocationBuffer)
        {
            this.heapInvocationBuffer = requireNonNull(heapInvocationBuffer);
        }

        @Override
        public void putByte(int value)
        {
            heapInvocationBuffer.putByte(value);
        }

        @Override
        public void putShort(int value)
        {
            heapInvocationBuffer.putShort(value);
        }

        @Override
        public void putInt(int value)
        {
            heapInvocationBuffer.putInt(value);
        }

        @Override
        public void putLong(long value)
        {
            heapInvocationBuffer.putLong(value);
        }

        @Override
        public void putFloat(float value)
        {
            heapInvocationBuffer.putFloat(value);
        }

        @Override
        public void putDouble(double value)
        {
            heapInvocationBuffer.putDouble(value);
        }

        @Override
        public void putAddress(long value)
        {
            heapInvocationBuffer.putAddress(value);
        }

        @Override
        public void putStruct(byte[] struct, int offset)
        {
            heapInvocationBuffer.putStruct(struct, offset);
        }
    }
}
