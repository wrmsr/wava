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
package com.wrmsr.wava.driver;

import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import com.wrmsr.wava.core.unit.Module;
import com.wrmsr.wava.util.guice.ScopeListeners;

import static com.wrmsr.wava.util.guice.SimpleScope.simpleScopeSeededProvider;

public final class DriverModule
        extends AbstractModule
{
    @Override
    protected void configure()
    {
        ModuleScope moduleScope = new ModuleScope();
        bindScope(ModuleScoped.class, moduleScope);
        bind(ModuleScope.class).toInstance(moduleScope);
        bind(new TypeLiteral<ScopeListeners<ModuleScope>>() {}).asEagerSingleton();

        bind(Module.class).toProvider(simpleScopeSeededProvider()).in(ModuleScoped.class);

        bind(StandardDriver.class).in(ModuleScoped.class);

        bind(StandardFunctionProcessor.class).in(ModuleScoped.class);
        bind(FunctionProcessor.class).to(StandardFunctionProcessor.class);
    }
}
