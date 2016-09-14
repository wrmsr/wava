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
package com.wrmsr.wava;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.unit.Module;
import com.wrmsr.wava.driver.ModuleScope;
import com.wrmsr.wava.driver.StandardDriver;
import com.wrmsr.wava.yen.global.YModule;
import com.wrmsr.wava.yen.parser.ModuleFactory;
import com.wrmsr.wava.yen.parser.Parser;
import com.wrmsr.wava.yen.parser.element.Element;
import com.wrmsr.wava.yen.parser.input.Input;
import com.wrmsr.wava.yen.translation.UnitTranslation;
import io.airlift.bootstrap.Bootstrap;
import org.junit.Test;

public class TestGuiceMain
{
    @Test
    public void testGuiceMain()
            throws Exception
    {
        Bootstrap app = new Bootstrap(new MainModule());
        Injector injector = app.strictConfig().initialize();

        Element root = new Parser(Input.ofResource("new/sqlite3.wast")).parse();
        YModule ymodule = new ModuleFactory(root).create();
        Module module = UnitTranslation.translateModule(Name.of("sqlite3"), ymodule);

        ModuleScope modulecope = injector.getInstance(ModuleScope.class);
        modulecope.with(
                ImmutableMap.of(
                        Key.get(Module.class), module),
                () -> {
                    StandardDriver standardDriver = injector.getInstance(StandardDriver.class);
                    return null;
                }).get();
    }
}
