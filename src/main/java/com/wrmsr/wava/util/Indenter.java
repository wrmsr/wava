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
package com.wrmsr.wava.util;

import com.google.common.base.Throwables;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

import static com.google.common.base.Preconditions.checkArgument;
import static java.util.Objects.requireNonNull;

public final class Indenter
        implements AutoCloseable
{
    @FunctionalInterface
    public interface Target
    {
        void write(String string)
                throws IOException;
    }

    private final Target target;
    private final String indent;

    private boolean indented;
    private int level;
    private String prefix = "";

    public Indenter(Target target, String indent)
    {
        this.target = requireNonNull(target);
        this.indent = requireNonNull(indent);
    }

    public Indenter(Target target)
    {
        this(target, "    ");
    }

    public Indenter indent(int levels)
    {
        checkArgument(level + levels >= 0);
        level += levels;
        prefix = StringUtils.repeat(indent, level);
        return this;
    }

    public Indenter indent()
    {
        return indent(1);
    }

    public Indenter dedent(int levels)
    {
        return indent(-levels);
    }

    public Indenter dedent()
    {
        return indent(-1);
    }

    public Indenter write(String str)
            throws IOException
    {
        int start = 0;
        while (start < str.length()) {
            int end = str.indexOf('\n', start);
            if (end < 0) {
                end = str.length();
            }
            if (!indented) {
                target.write(prefix);
                indented = true;
            }
            String part = str.substring(start, end);
            target.write(part);
            if (end < str.length()) {
                target.write("\n");
                indented = false;
            }
            start = end + 1;
        }
        return this;
    }

    public Indenter writePropagating(String str)
    {
        try {
            return write(str);
        }
        catch (IOException e) {
            throw Throwables.propagate(e);
        }
    }

    @Override
    public void close()
    {
    }
}
