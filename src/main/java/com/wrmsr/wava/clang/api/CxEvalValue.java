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
package com.wrmsr.wava.clang.api;

import com.google.common.base.MoreObjects;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

@Immutable
public final class CxEvalValue
{
    private final CxEvalResultKind kind;
    private final Optional<Object> value;

    public CxEvalValue(CxEvalResultKind kind, Optional<Object> value)
    {
        this.kind = kind;
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
        CxEvalValue that = (CxEvalValue) o;
        return kind == that.kind &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(kind, value);
    }

    @Override
    public String toString()
    {
        return MoreObjects.toStringHelper(this)
                .add("kind", kind)
                .add("value", value)
                .toString();
    }

    public CxEvalResultKind getKind()
    {
        return kind;
    }

    public Optional<Object> getValue()
    {
        return value;
    }
}
