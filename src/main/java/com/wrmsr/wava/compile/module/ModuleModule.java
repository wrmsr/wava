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
package com.wrmsr.wava.compile.module;

import com.google.inject.AbstractModule;
import com.wrmsr.wava.driver.ModuleScoped;

import static com.google.inject.multibindings.Multibinder.newSetBinder;
import static io.airlift.configuration.ConfigBinder.configBinder;

public final class ModuleModule
        extends AbstractModule
{
    @Override
    protected void configure()
    {
        newSetBinder(binder(), ModuleCompilationParticipant.class);

        bind(ImportsCompilerImpl.class).in(ModuleScoped.class);
        newSetBinder(binder(), ModuleCompilationParticipant.class).addBinding().to(ImportsCompilerImpl.class).in(ModuleScoped.class);

        bind(MultiModuleCompilerImpl.class).in(ModuleScoped.class);
        bind(ModuleCompiler.class).to(MultiModuleCompilerImpl.class);
        configBinder(binder()).bindConfig(ModuleCompilerConfig.class);
        configBinder(binder()).bindConfig(MultiModuleCompilerConfig.class);

        bind(TableCompilerImpl.class).in(ModuleScoped.class);
        newSetBinder(binder(), ModuleCompilationParticipant.class).addBinding().to(TableCompilerImpl.class).in(ModuleScoped.class);
    }
}
