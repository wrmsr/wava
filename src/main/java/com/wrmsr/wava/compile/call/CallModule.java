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
package com.wrmsr.wava.compile.call;

import com.google.inject.AbstractModule;
import com.wrmsr.wava.compile.module.ModuleCompilationParticipant;
import com.wrmsr.wava.driver.ModuleScoped;

import static com.google.inject.multibindings.Multibinder.newSetBinder;

public final class CallModule
        extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(CallCompilerImpl.class).in(ModuleScoped.class);
        newSetBinder(binder(), ModuleCompilationParticipant.class).addBinding().to(CallCompilerImpl.class).in(ModuleScoped.class);
        bind(CallCompiler.class).to(CallCompilerImpl.class);

        bind(CallIndirectCompilerImpl.class).in(ModuleScoped.class);
        bind(CallIndirectCompiler.class).to(CallIndirectCompilerImpl.class);
    }
}
