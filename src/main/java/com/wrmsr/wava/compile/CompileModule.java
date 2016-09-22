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
package com.wrmsr.wava.compile;

import com.google.inject.AbstractModule;
import com.wrmsr.wava.compile.binary.BinaryModule;
import com.wrmsr.wava.compile.call.CallModule;
import com.wrmsr.wava.compile.const_.ConstModule;
import com.wrmsr.wava.compile.function.FunctionModule;
import com.wrmsr.wava.compile.memory.MemoryModule;
import com.wrmsr.wava.compile.module.ModuleModule;
import com.wrmsr.wava.compile.unary.UnaryModule;

public final class CompileModule
        extends AbstractModule
{
    @Override
    protected void configure()
    {
        install(new BinaryModule());
        install(new CallModule());
        install(new ConstModule());
        install(new FunctionModule());
        install(new MemoryModule());
        install(new ModuleModule());
        install(new UnaryModule());
    }
}
