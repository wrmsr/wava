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
package com.wrmsr.wava.yen.interpreter;

import com.wrmsr.wava.yen.expression.YLoad;
import com.wrmsr.wava.yen.expression.YStore;
import com.wrmsr.wava.yen.global.YImport;
import com.wrmsr.wava.yen.global.YModule;
import com.wrmsr.wava.core.literal.Literal;

import java.util.List;

public interface Adapter
{
    default void init(YModule wasm)
    {

    }

    Literal callImport(YImport import_, List<Literal> arguments);

    Literal load(YLoad YLoad, long addr);

    void store(YStore YStore, long addr, Literal value);

    void growMemory(long oldSize, long newSize);

    void trap(String why);
}
