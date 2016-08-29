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
package com.wrmsr.wava.yen.parser;

import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.yen.global.YModule;
import com.wrmsr.wava.yen.parser.element.Element;
import com.wrmsr.wava.yen.parser.input.Input;
import org.testng.annotations.Test;

import static com.wrmsr.wava.util.Json.toPrettyJson;

public class TestModuleFactory
{
    @Test
    public void test()
            throws Throwable
    {
        Element root = (new Parser(Input.ofResource("unit.wast"))).parse();
        YModule module = new ModuleFactory(root).create();
        toPrettyJson(module.getFunctionsMap().get(Name.of("conversions")).getBody().get());
    }
}
