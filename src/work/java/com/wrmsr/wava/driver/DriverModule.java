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

import com.google.inject.PrivateModule;
import com.wrmsr.wava.compile.CompileModule;

public class DriverModule
        extends PrivateModule
{
    @Override
    protected void configure()
    {
        install(new CompileModule());

//        ModulePassScope modulePassScope = new ModulePassScope();
//        bindScope(ModulePassScoped.class, modulePassScope);
//        bind(ModulePassScope.class).toInstance(modulePassScope);
//        bind(new TypeLiteral<ScopeListeners<ModulePassScope>>() {}).asEagerSingleton();
//
//        FunctionContextScope functionContextScope = new FunctionContextScope();
//        bindScope(FunctionContextScoped.class, functionContextScope);
//        bind(FunctionContextScope.class).toInstance(functionContextScope);
//        bind(new TypeLiteral<ScopeListeners<FunctionContextScope>>() {}).asEagerSingleton();
    }
}
