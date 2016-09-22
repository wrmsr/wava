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
package com.wrmsr.wava.compile.function;

import com.google.inject.AbstractModule;
import com.wrmsr.wava.compile.module.ModuleCompilationParticipant;
import com.wrmsr.wava.driver.ModuleScoped;
import com.wrmsr.wava.java.lang.JAccess;

import static com.google.common.collect.Sets.immutableEnumSet;
import static com.google.inject.multibindings.Multibinder.newSetBinder;

public final class FunctionModule
        extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(FunctionAccess.class).toInstance(new FunctionAccess(immutableEnumSet(JAccess.PUBLIC, JAccess.FINAL)));

        bind(FunctionCompilerImpl.class).in(ModuleScoped.class);
        newSetBinder(binder(), ModuleCompilationParticipant.class).addBinding().to(FunctionCompilerImpl.class).in(ModuleScoped.class);
        bind(FunctionCompiler.class).to(FunctionCompilerImpl.class);
    }
}
