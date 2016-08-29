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
package com.wrmsr.wava.core.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;

import javax.annotation.concurrent.Immutable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

import static com.google.common.base.Preconditions.checkArgument;
import static com.wrmsr.wava.util.Itertools.collectString;
import static com.wrmsr.wava.util.Itertools.compareIterators;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static java.util.Objects.requireNonNull;

@Immutable
public final class Signature
        implements Iterable<Type>, Comparable<Signature>
{
    private final Type result;
    private final List<Type> arguments;

    public Signature(Type result, List<Type> arguments)
    {
        this.result = requireNonNull(result);
        this.arguments = ImmutableList.copyOf(arguments);
    }

    public static Signature of(Type result, Type... arguments)
    {
        return new Signature(result, Arrays.asList(arguments));
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
        Signature signature = (Signature) o;
        return result == signature.result &&
                Objects.equals(arguments, signature.arguments);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(result, arguments);
    }

    @Override
    public String toString()
    {
        return MoreObjects.toStringHelper(this)
                .add("result", result)
                .add("arguments", arguments)
                .toString();
    }

    @Override
    public int compareTo(Signature o)
    {
        return compareIterators(iterator(), o.iterator());
    }

    public Type getResult()
    {
        return result;
    }

    public List<Type> getArguments()
    {
        return arguments;
    }

    @Override
    public Iterator<Type> iterator()
    {
        return Iterators.concat(Iterators.singletonIterator(result), arguments.iterator());
    }

    @JsonValue
    public String getChars()
    {
        return StreamSupport.stream(spliterator(), false).map(Type::getChar).collect(collectString());
    }

    @JsonCreator
    public static Signature parseSignature(CharSequence cs)
    {
        checkArgument(cs.length() > 0);
        return new Signature(
                Type.of(cs.charAt(0)),
                IntStream.range(1, cs.length()).boxed().map(cs::charAt).map(Type::of).collect(toImmutableList()));
    }
}
