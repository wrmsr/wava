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
package com.wrmsr.wava.core.unit;

import javax.annotation.concurrent.Immutable;

@Immutable
public final class Segment
{
    private final int offset;
    private final byte[] data;

    public Segment(int offset, byte[] data)
    {
        this.offset = offset;
        this.data = data;
    }

    public int getOffset()
    {
        return offset;
    }

    public byte[] getData()
    {
        return data;
    }

    public int getLength()
    {
        return data.length;
    }
}
