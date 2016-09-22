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

import com.google.common.base.MoreObjects;
import com.kenai.jffi.Closure;
import com.kenai.jffi.HeapInvocationBuffer;
import com.kenai.jffi.Library;
import com.kenai.jffi.MemoryIO;
import com.kenai.jffi.ObjectParameterStrategy;
import com.kenai.jffi.Platform;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Objects.requireNonNull;

final class JffiUtils
{
    private JffiUtils()
    {
    }

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

    static final int ADDRESS_SIZE = Platform.getPlatform().addressSize();
    static final long ADDRESS_MASK = Platform.getPlatform().addressMask();

    public static final class Address
            extends Number
    {
        public final long address;

        public Address(long address)
        {
            this.address = address & ADDRESS_MASK;
        }

        public Address(Closure.Handle closure)
        {
            this(closure.getAddress());
        }

        @Override
        public boolean equals(Object o)
        {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Address address1 = (Address) o;
            return address == address1.address;
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(address);
        }

        @Override
        public String toString()
        {
            return MoreObjects.toStringHelper(this)
                    .add("address", address)
                    .toString();
        }

        @Override
        public int intValue()
        {
            return (int) address;
        }

        @Override
        public long longValue()
        {
            return address;
        }

        @Override
        public float floatValue()
        {
            return (float) address;
        }

        @Override
        public double doubleValue()
        {
            return (double) address;
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
        void putByte(final byte value);

        void putShort(final short value);

        void putInt(final int value);

        void putLong(final long value);

        void putFloat(final float value);

        void putDouble(final double value);

        void putAddress(final long value);

        void putStruct(final byte[] struct);

        byte getByte();

        short getShort();

        int getInt();

        long getLong();

        float getFloat();

        double getDouble();

        long getAddress();

        byte[] getStruct(int length);
    }

    static abstract class AbstractParameterBuffer
            implements ParameterBuffer
    {
        @Override
        public void putByte(byte value)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public void putShort(short value)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public void putInt(int value)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public void putLong(long value)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public void putFloat(float value)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public void putDouble(double value)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public void putAddress(long value)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public void putStruct(byte[] struct)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public byte getByte()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public short getShort()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public int getInt()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public long getLong()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public float getFloat()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public double getDouble()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public long getAddress()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public byte[] getStruct(int length)
        {
            throw new UnsupportedOperationException();
        }
    }

    static final class ByteBufferParameterBuffer
            extends AbstractParameterBuffer
    {
        final ByteBuffer byteBuffer;

        public ByteBufferParameterBuffer(ByteBuffer byteBuffer)
        {
            this.byteBuffer = requireNonNull(byteBuffer);
        }

        @Override
        public void putByte(byte value)
        {
            byteBuffer.put(value);
        }

        @Override
        public void putShort(short value)
        {
            byteBuffer.putShort(value);
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
                case 32:
                    byteBuffer.putInt((int) value);
                    break;
                case 64:
                    byteBuffer.putLong(value);
                    break;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override
        public void putStruct(byte[] struct)
        {
            byteBuffer.get(struct, 0, struct.length);
        }

        @Override
        public byte getByte()
        {
            return byteBuffer.get();
        }

        @Override
        public short getShort()
        {
            return byteBuffer.getShort();
        }

        @Override
        public int getInt()
        {
            return byteBuffer.getInt();
        }

        @Override
        public long getLong()
        {
            return byteBuffer.getLong();
        }

        @Override
        public float getFloat()
        {
            return byteBuffer.getFloat();
        }

        @Override
        public double getDouble()
        {
            return byteBuffer.getDouble();
        }

        @Override
        public long getAddress()
        {
            switch (ADDRESS_SIZE) {
                case 32:
                    return byteBuffer.getInt();
                case 64:
                    return byteBuffer.getLong();
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override
        public byte[] getStruct(int length)
        {
            byte[] struct = new byte[length];
            byteBuffer.get(struct);
            return struct;
        }
    }

    static final class HeapInvocationBufferParameterBuffer
            extends AbstractParameterBuffer
    {
        final HeapInvocationBuffer heapInvocationBuffer;

        public HeapInvocationBufferParameterBuffer(HeapInvocationBuffer heapInvocationBuffer)
        {
            this.heapInvocationBuffer = requireNonNull(heapInvocationBuffer);
        }

        @Override
        public void putByte(byte value)
        {
            heapInvocationBuffer.putByte(value);
        }

        @Override
        public void putShort(short value)
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
        public void putStruct(byte[] struct)
        {
            heapInvocationBuffer.putStruct(struct, 0);
        }
    }

    static final class ClosureBufferParameterBuffer
            extends AbstractParameterBuffer
    {
        final MemoryIO memoryIO;
        final Closure.Buffer closureBuffer;

        private int position;

        public ClosureBufferParameterBuffer(MemoryIO memoryIO, Closure.Buffer closureBuffer)
        {
            this.memoryIO = requireNonNull(memoryIO);
            this.closureBuffer = requireNonNull(closureBuffer);
        }

        @Override
        public byte getByte()
        {
            return closureBuffer.getByte(position++);
        }

        @Override
        public short getShort()
        {
            return closureBuffer.getShort(position++);
        }

        @Override
        public int getInt()
        {
            return closureBuffer.getInt(position++);
        }

        @Override
        public long getLong()
        {
            return closureBuffer.getLong(position++);
        }

        @Override
        public float getFloat()
        {
            return closureBuffer.getFloat(position++);
        }

        @Override
        public double getDouble()
        {
            return closureBuffer.getDouble(position++);
        }

        @Override
        public long getAddress()
        {
            return closureBuffer.getAddress(position++);
        }

        @Override
        public byte[] getStruct(int length)
        {
            long address = closureBuffer.getStruct(position++);
            byte[] buf = new byte[length];
            memoryIO.getByteArray(address, buf, 0, buf.length);
            return buf;
        }

        @Override
        public void putByte(byte value)
        {
            closureBuffer.setByteReturn(value);
        }

        @Override
        public void putShort(short value)
        {
            closureBuffer.setShortReturn(value);
        }

        @Override
        public void putInt(int value)
        {
            closureBuffer.setIntReturn(value);
        }

        @Override
        public void putLong(long value)
        {
            closureBuffer.setLongReturn(value);
        }

        @Override
        public void putFloat(float value)
        {
            closureBuffer.setFloatReturn(value);
        }

        @Override
        public void putDouble(double value)
        {
            closureBuffer.setDoubleReturn(value);
        }

        @Override
        public void putAddress(long value)
        {
            closureBuffer.setAddressReturn(value);
        }

        @Override
        public void putStruct(byte[] struct)
        {
            closureBuffer.setStructReturn(struct, 0);
        }
    }
}
