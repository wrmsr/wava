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
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.wrmsr.wava.core.node.visitor.Visitor;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;

import static com.google.common.base.Preconditions.checkArgument;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "condition",
        "entries",
})
@Immutable
public final class Switch
        extends Node
{
    public static abstract class Value
    {
        public static final DefaultValue DEFAULT = new DefaultValue();

        private Value()
        {
        }

        public static Value of(int value)
        {
            return new IntValue(value);
        }

        @JsonCreator
        public static Value jsonCreator(Object object)
        {
            if (object == null) {
                return null;
            }
            else if (object instanceof String) {
                String str = (String) object;
                checkArgument("default".equals(str.toLowerCase()));
                return DEFAULT;
            }
            else if (object instanceof Integer) {
                return new IntValue((Integer) object);
            }
            else {
                throw new IllegalArgumentException(Objects.toString(object));
            }
        }
    }

    @Immutable
    public static final class DefaultValue
            extends Value
    {
        public DefaultValue()
        {
        }

        @JsonValue
        public String toString()
        {
            return "default";
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
            return true;
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(DefaultValue.class);
        }
    }

    @Immutable
    public static final class IntValue
            extends Value
    {
        private final int value;

        public IntValue(int value)
        {
            checkArgument(value >= 0);
            this.value = value;
        }

        @JsonValue
        public int getValue()
        {
            return value;
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
            IntValue intValue = (IntValue) o;
            return value == intValue.value;
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(value);
        }

        @Override
        public String toString()
        {
            return Integer.toString(getValue());
        }
    }

    @JsonPropertyOrder({
            "values",
            "body",
    })
    @Immutable
    public static final class Entry
    {
        private final List<Value> values;
        private final Node body;

        @JsonCreator
        public Entry(
                @JsonProperty("values") List<Value> values,
                @JsonProperty("body") Node body)
        {
            this.values = ImmutableList.copyOf(values);
            this.body = requireNonNull(body);
            checkArgument(!this.values.isEmpty());
        }

        @JsonProperty("values")
        public List<Value> getValues()
        {
            return values;
        }

        @JsonProperty("body")
        public Node getBody()
        {
            return body;
        }
    }

    private final Node condition;
    private final List<Entry> entries;

    @JsonCreator
    public Switch(
            @JsonProperty("condition") Node condition,
            @JsonProperty("entries") List<Entry> entries)
    {
        this.condition = requireNonNull(condition);
        this.entries = ImmutableList.copyOf(entries);
        List<Value> values = entries.stream().map(Entry::getValues).flatMap(List::stream).collect(toImmutableList());
        Set<Value> valueSet = ImmutableSet.copyOf(values);
        checkArgument(values.size() == valueSet.size());
        checkArgument(valueSet.contains(Value.DEFAULT));
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
        Switch aSwitch = (Switch) o;
        return Objects.equals(condition, aSwitch.condition) &&
                Objects.equals(entries, aSwitch.entries);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(condition, entries);
    }

    @JsonProperty("condition")
    public Node getCondition()
    {
        return condition;
    }

    @JsonProperty("entries")
    public List<Entry> getEntries()
    {
        return entries;
    }

    @Override
    public List<Node> getChildren()
    {
        return Stream.concat(
                Stream.of(condition),
                entries.stream().map(Entry::getBody))
                .collect(toImmutableList());
    }

    @Override
    public <C, R> R accept(Visitor<C, R> visitor, C context)
    {
        return visitor.visitSwitch(this, context);
    }
}
