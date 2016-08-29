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
import com.wrmsr.wava.yen.expression.visitor.YVisitor;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.wrmsr.wava.util.collect.MoreOptionals.optionalToList;
import static java.util.Objects.requireNonNull;

@JsonPropertyOrder({
        "value",
})
@Immutable
public final class YReturn
        extends YExpression
{
    private final Optional<YExpression> value;

    @JsonCreator
    public YReturn(
            @JsonProperty("value") Optional<YExpression> value)
    {
        this.value = requireNonNull(value);
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
        YReturn aYReturn = (YReturn) o;
        return Objects.equals(value, aYReturn.value);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(value);
    }

    @JsonProperty("value")
    public Optional<YExpression> getValue()
    {
        return value;
    }

    @Override
    public List<YExpression> getChildren()
    {
        return optionalToList(value);
    }

    @Override
    public <C, R> R accept(YVisitor<C, R> visitor, C context)
    {
        return visitor.visitReturn(this, context);
    }
}
