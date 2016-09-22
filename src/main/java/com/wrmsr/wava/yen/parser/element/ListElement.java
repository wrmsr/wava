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

import com.google.common.collect.ImmutableList;

import javax.annotation.concurrent.Immutable;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Immutable
public final class ListElement
        extends Element
{
    private final List<Element> list;

    public ListElement(List<Element> list)
    {
        this.list = ImmutableList.copyOf(list);
    }

    public List<Element> getList()
    {
        return list;
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
        ListElement elements = (ListElement) o;
        return Objects.equals(list, elements.list);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(list);
    }

    @Override
    public String toString()
    {
        return "ListElement{" +
                "list=" + list +
                '}';
    }

    @Override
    public boolean isList()
    {
        return true;
    }

    @Override
    public Iterator<Element> iterator()
    {
        return list.iterator();
    }

    @Override
    public List<Element> list()
    {
        return list;
    }

    @Override
    public Element get(int i)
    {
        return list.get(i);
    }

    @Override
    public int size()
    {
        return list.size();
    }
}
