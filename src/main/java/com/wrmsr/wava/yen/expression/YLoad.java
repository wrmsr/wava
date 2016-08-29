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
package com.wrmsr.wava.yen.expression;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.yen.expression.visitor.YVisitor;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "type",
        "bytes",
        "signed",
        "offset",
        "align",
        "ptr",
})
@Immutable
public final class YLoad
        extends YExpression
{
    private final Type type;
    private final int bytes;
    private final boolean isSsigned;
    private final int offset;
    private final int align;
    private final YExpression ptr;

    @JsonCreator
    public YLoad(
            @JsonProperty("type") Type type,
            @JsonProperty("bytes") int bytes,
            @JsonProperty("signed") boolean isSsigned,
            @JsonProperty("offset") int offset,
            @JsonProperty("align") int align,
            @JsonProperty("ptr") YExpression ptr)
    {
        this.type = type;
        this.bytes = bytes;
        this.isSsigned = isSsigned;
        this.offset = offset;
        this.align = align;
        this.ptr = requireNonNull(ptr);
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
        YLoad yLoad = (YLoad) o;
        return bytes == yLoad.bytes &&
                isSsigned == yLoad.isSsigned &&
                offset == yLoad.offset &&
                align == yLoad.align &&
                type == yLoad.type &&
                Objects.equals(ptr, yLoad.ptr);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(type, bytes, isSsigned, offset, align, ptr);
    }

    @JsonProperty("type")
    @Override
    public Type getType()
    {
        return type;
    }

    @JsonProperty("bytes")
    public int getBytes()
    {
        return bytes;
    }

    @JsonProperty("isSigned")
    public boolean isSsigned()
    {
        return isSsigned;
    }

    @JsonProperty("signed")
    public int getOffset()
    {
        return offset;
    }

    @JsonProperty("align")
    public int getAlign()
    {
        return align;
    }

    @JsonProperty("ptr")
    public YExpression getPtr()
    {
        return ptr;
    }

    @Override
    public List<YExpression> getChildren()
    {
        return ImmutableList.of(ptr);
    }

    @Override
    public <C, R> R accept(YVisitor<C, R> visitor, C context)
    {
        return visitor.visitLoad(this, context);
    }
}
