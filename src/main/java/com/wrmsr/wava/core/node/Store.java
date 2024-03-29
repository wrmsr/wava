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
package com.wrmsr.wava.core.node;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.core.node.visitor.Visitor;
import com.wrmsr.wava.core.type.Type;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;

import static com.google.common.base.Preconditions.checkArgument;
import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "type",
        "bytes",
        "offset",
        "align",
        "ptr",
        "value",
})
@Immutable
public final class Store
        extends Node
{
    private final Type type;
    private final int bytes;
    private final int offset;
    private final int align;
    private final Node ptr;
    private final Node value;

    @JsonCreator
    public Store(
            @JsonProperty("type") Type type,
            @JsonProperty("bytes") int bytes,
            @JsonProperty("offset") int offset,
            @JsonProperty("align") int align,
            @JsonProperty("ptr") Node ptr,
            @JsonProperty("value") Node value)
    {
        this.type = type;
        this.bytes = bytes;
        this.offset = offset;
        this.align = align;
        this.ptr = requireNonNull(ptr);
        this.value = requireNonNull(value);
        checkArgument(type.isConcrete());
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
        Store store = (Store) o;
        return bytes == store.bytes &&
                offset == store.offset &&
                align == store.align &&
                type == store.type &&
                Objects.equals(ptr, store.ptr) &&
                Objects.equals(value, store.value);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(type, bytes, offset, align, ptr, value);
    }

    @JsonProperty("type")
    public Type getType()
    {
        return type;
    }

    @JsonProperty("bytes")
    public int getBytes()
    {
        return bytes;
    }

    @JsonProperty("offset")
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
    public Node getPtr()
    {
        return ptr;
    }

    @JsonProperty("value")
    public Node getValue()
    {
        return value;
    }

    @Override
    public List<Node> getChildren()
    {
        return ImmutableList.of(ptr, value);
    }

    @Override
    public <C, R> R accept(Visitor<C, R> visitor, C context)
    {
        return visitor.visitStore(this, context);
    }
}
