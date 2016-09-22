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
package com.wrmsr.wava.yen.parser.input;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.google.common.io.ByteStreams.toByteArray;

public interface Input
{
    char get(int offset);

    String get(int start, int end);

    void advance(int offset);

    static Input of(String str)
    {
        return new StringInput(str);
    }

    static Input of(Path path)
            throws IOException
    {
        return of(new String(Files.readAllBytes(path)));
    }

    static Input ofResource(String name)
            throws IOException
    {
        try (InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(name);
                BufferedInputStream bis = new BufferedInputStream(is)) {
            return of(new String(toByteArray(bis)));
        }
    }
}
