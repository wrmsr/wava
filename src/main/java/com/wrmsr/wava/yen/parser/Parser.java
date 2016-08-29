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
package com.wrmsr.wava.yen.parser;

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.yen.parser.element.Element;
import com.wrmsr.wava.yen.parser.element.ListElement;
import com.wrmsr.wava.yen.parser.element.StringElement;
import com.wrmsr.wava.yen.parser.input.Input;

import javax.annotation.concurrent.Immutable;

import static java.util.Objects.requireNonNull;

@Immutable
public final class Parser
{
    private final Input input;

    public Parser(Input input)
    {
        this.input = requireNonNull(input);
    }

    public Element parse()
    {
        skipWhitespace();
        if (input.get(0) == 0) {
            // FIXME ?
            throw new IllegalStateException();
        }
        else if (input.get(0) == '(') {
            return parseList();
        }
        else {
            return parseString();
        }
    }

    private Element parseList()
    {
        if (input.get(0) != '(') {
            throw new IllegalStateException();
        }
        input.advance(1);
        ImmutableList.Builder<Element> builder = ImmutableList.builder();
        while (true) {
            skipWhitespace();
            if (input.get(0) == 0) {
                throw new IllegalStateException();
            }
            else if (input.get(0) == ')') {
                input.advance(1);
                break;
            }
            else {
                builder.add(parse());
            }
        }
        return new ListElement(builder.build());
    }

    private Element parseString()
    {
        boolean dollared = false;
        if (input.get(0) == '$') {
            input.advance(1);
            dollared = true;
        }
        if (input.get(0) == '"') {
            // parse escaping \", but leave code escaped - we'll handle escaping in memory segments specifically
            input.advance(1);
            StringBuilder sb = new StringBuilder();
            while (true) {
                if (input.get(0) == '"') {
                    break;
                }
                if (input.get(0) == '\\') {
                    sb.append(input.get(0));
                    sb.append(input.get(1));
                    input.advance(2);
                    continue;
                }
                sb.append(input.get(0));
                input.advance(1);
            }
            input.advance(1);
            return new StringElement(sb.toString(), dollared);
        }
        StringBuilder sb = new StringBuilder();
        while (input.get(0) != 0 && !Character.isWhitespace(input.get(0)) && input.get(0) != ')' && input.get(0) != '(') {
            sb.append(input.get(0));
            input.advance(1);
        }
        return new StringElement(sb.toString(), dollared);
    }

    void skipWhitespace()
    {
        while (true) {
            while (Character.isWhitespace(input.get(0))) {
                input.advance(1);
            }
            if (input.get(0) == ';' && input.get(1) == ';') {
                while (input.get(0) != 0 && input.get(0) != '\n') {
                    input.advance(1);
                }
            }
            else if (input.get(0) == '(' && input.get(1) == ';') {
                // Skip nested block comments.
                input.advance(2);
                int depth = 1;
                while (true) {
                    if (input.get(0) == 0) {
                        return;
                    }
                    if (input.get(0) == '(' && input.get(1) == ';') {
                        input.advance(2);
                        depth++;
                    }
                    else if (input.get(0) == ';' && input.get(1) == ')') {
                        input.advance(2);
                        --depth;
                        if (depth == 0) {
                            break;
                        }
                    }
                    else {
                        input.advance(1);
                    }
                }
            }
            else {
                return;
            }
        }
    }
}
