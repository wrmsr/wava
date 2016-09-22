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

import java.util.Iterator;
import java.util.List;

public abstract class Element
        implements Iterable<Element>
{
    public boolean isList()
    {
        return false;
    }

    public boolean isString()
    {
        return false;
    }

    @Override
    public Iterator<Element> iterator()
    {
        throw new UnsupportedOperationException();
    }

    public List<Element> list()
    {
        throw new UnsupportedOperationException();
    }

    public Element get(int index)
    {
        throw new UnsupportedOperationException();
    }

    public int size()
    {
        throw new UnsupportedOperationException();
    }

    public String string()
    {
        throw new UnsupportedOperationException();
    }

    public boolean dollared()
    {
        throw new UnsupportedOperationException();
    }
}
