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

import com.google.common.collect.ImmutableSet;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.java.lang.JKeywords;

import java.util.Set;

import static com.google.common.base.Preconditions.checkArgument;
import static java.util.Objects.requireNonNull;

// FIXME: prob rez codec
public interface NameMangler
{
    NameMangler NOP = new NameMangler()
    {
        @Override
        public String mangleName(String name)
        {
            return name;
        }

        @Override
        public String demangleName(String name)
        {
            return name;
        }
    };

    NameMangler DEFAULT = new DefaultImpl(DefaultImpl.DEFAULT_ESCAPE, DefaultImpl.DEFAULT_LITERAL, DefaultImpl.DEFAULT_KEYWORDS);

    NameMangler INVERSE = new DefaultImpl(DefaultImpl.DEFAULT_LITERAL, DefaultImpl.DEFAULT_ESCAPE, DefaultImpl.DEFAULT_KEYWORDS);

    String mangleName(String name);

    default Name mangleName(Name name)
    {
        return Name.of(mangleName(name.get()));
    }

    String demangleName(String name);

    default Name demangleName(Name name)
    {
        return Name.of(demangleName(name.get()));
    }

    final class DefaultImpl
            implements NameMangler
    {
        public static final char DEFAULT_ESCAPE = '$';
        public static final char DEFAULT_LITERAL = '_';

        public static final Set<String> DEFAULT_KEYWORDS = ImmutableSet.<String>builder()
                .addAll(JKeywords.KEYWORDS)
                .add("java")
                .build();

        private final char escape;
        private final char literal;
        private final Set<String> keywords;

        public DefaultImpl(char escape, char literal, Set<String> keywords)
        {
            checkArgument(escape != literal);
            checkArgument(keywords.stream().allMatch(s -> s.indexOf(escape) < 0));
            checkArgument(Character.isJavaIdentifierStart(escape));
            checkArgument(Character.isJavaIdentifierPart(literal));
            this.escape = escape;
            this.literal = literal;
            this.keywords = ImmutableSet.copyOf(keywords);
        }

        public String mangleName(String name)
        {
            requireNonNull(name);
            StringBuilder sb = new StringBuilder(name.length() * 2);
            if (keywords.contains(name)) {
                return sb.append(escape).append(literal).append(name).append(escape).toString();
            }
            for (int i = 0; i < name.length(); ) {
                boolean first = i == 0;
                int c = Character.codePointAt(name, i);
                i += Character.charCount(c);
                if (c == escape) {
                    sb.append(escape).append(escape);
                    continue;
                }
                else if (first) {
                    if (Character.isJavaIdentifierStart(c)) {
                        sb.append(Character.toChars(c));
                        continue;
                    }
                }
                else {
                    if (Character.isJavaIdentifierPart(c)) {
                        sb.append(Character.toChars(c));
                        continue;
                    }
                }
                sb.append(escape).append(Integer.toHexString(c)).append(escape);
            }
            return sb.toString();
        }

        public String demangleName(String name)
        {
            StringBuilder sb = new StringBuilder(name.length());
            for (int i = 0; i < name.length(); ) {
                int c = Character.codePointAt(name, i);
                i += Character.charCount(c);
                if (c != escape) {
                    sb.append(Character.toChars(c));
                }
                else {
                    int end = name.indexOf(escape, i);
                    if (i == end) {
                        sb.append(escape);
                    }
                    else {
                        String g = name.substring(i, end);
                        if (g.charAt(0) == literal) {
                            sb.append(g.substring(1));
                        }
                        else {
                            sb.append(Character.toChars(Integer.parseInt(g, 16)));
                        }
                    }
                    i = end + 1;
                }
            }
            return sb.toString();
        }
    }
}
