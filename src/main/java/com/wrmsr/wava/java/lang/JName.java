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

import com.wrmsr.wava.util.Box;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.stream.IntStream;

import static com.google.common.base.Preconditions.checkState;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;

@Immutable
public final class JName
        extends Box<String>
        implements Comparable<JName>
{
    public JName(String value)
    {
        super(value);
        checkValid(value);
    }

    public static JName of(String value)
    {
        return new JName(value);
    }

    @Override
    public int compareTo(JName o)
    {
        return value.compareTo(o.value);
    }

    public static void checkValid(String value)
    {
        List<Integer> codePoints = value.codePoints().boxed().collect(toImmutableList());
        checkState(!codePoints.isEmpty());
        checkState(Character.isJavaIdentifierStart(codePoints.get(0)));
        checkState(IntStream.range(1, codePoints.size()).allMatch(i -> Character.isJavaIdentifierPart(codePoints.get(i))));
    }
}
