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
import com.wrmsr.wava.core.type.Name;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "name",
        "body",
})
@Immutable
public final class Label
        extends Node
{
    private final Name name;
    private final Node body;

    @JsonCreator
    public Label(
            @JsonProperty("name") Name name,
            @JsonProperty("body") Node body)
    {
        this.name = requireNonNull(name);
        this.body = requireNonNull(body);
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
        Label label1 = (Label) o;
        return Objects.equals(name, label1.name) &&
                Objects.equals(body, label1.body);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, body);
    }

    @JsonProperty("name")
    public Name getName()
    {
        return name;
    }

    @JsonProperty("body")
    public Node getBody()
    {
        return body;
    }

    @Override
    public List<Node> getChildren()
    {
        return ImmutableList.of(body);
    }

    @Override
    public <C, R> R accept(Visitor<C, R> visitor, C context)
    {
        return visitor.visitLabel(this, context);
    }
}
