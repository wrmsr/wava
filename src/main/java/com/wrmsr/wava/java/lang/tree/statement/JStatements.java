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
package com.wrmsr.wava.java.lang.tree.statement;

import java.util.List;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

public final class JStatements
{
    private JStatements()
    {
    }

    public static JStatement toSingle(List<JStatement> statements)
    {
        requireNonNull(statements);
        if (statements.isEmpty()) {
            return new JEmpty();
        }
        else if (statements.size() == 1) {
            return statements.get(0);
        }
        else {
            return new JBlock(statements);
        }
    }

    public static Optional<JStatement> toOptional(List<JStatement> statements)
    {
        requireNonNull(statements);
        if (statements.isEmpty()) {
            return Optional.empty();
        }
        else if (statements.size() == 1) {
            return Optional.of(statements.get(0));
        }
        else {
            return Optional.of(new JBlock(statements));
        }
    }
}
