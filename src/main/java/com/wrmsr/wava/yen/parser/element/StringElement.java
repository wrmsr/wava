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
package com.wrmsr.wava.yen.parser.element;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

@Immutable
public final class StringElement
        extends Element
{
    private final String string;
    private final boolean isDollared;

    public StringElement(String string, boolean isDollared)
    {
        this.string = requireNonNull(string);
        this.isDollared = isDollared;
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
        StringElement that = (StringElement) o;
        return isDollared == that.isDollared &&
                Objects.equals(string, that.string);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(string, isDollared);
    }

    @Override
    public String toString()
    {
        return "StringElement{" +
                "string='" + string + '\'' +
                ", isDollared=" + isDollared +
                '}';
    }

    public String getString()
    {
        return string;
    }

    public boolean isDollared()
    {
        return isDollared;
    }

    @Override
    public boolean isString()
    {
        return true;
    }

    @Override
    public String string()
    {
        return string;
    }

    @Override
    public boolean dollared()
    {
        return isDollared;
    }
}
