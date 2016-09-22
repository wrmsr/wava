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
package com.wrmsr.wava.java.lang;

import com.wrmsr.wava.java.lang.tree.expression.JExpression;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;
import java.util.Optional;

@Immutable
public final class JArray
{
    public static final JArray EMPTY = new JArray();

    private final Optional<JExpression> size;

    public JArray(JExpression size)
    {
        this.size = Optional.of(size);
    }

    public JArray()
    {
        this.size = Optional.empty();
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
        JArray jArray = (JArray) o;
        return Objects.equals(size, jArray.size);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(size);
    }

    public Optional<JExpression> getSize()
    {
        return size;
    }
}
