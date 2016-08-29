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

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.wrmsr.wava.util.Cell;
import org.junit.Test;

import java.util.Set;

import static com.google.inject.multibindings.Multibinder.newSetBinder;

public class TestGuiceSets
{
    @Test
    public void testGuiceSets()
            throws Throwable
    {
        Injector injector = Guice.createInjector(new Module()
        {
            @Override
            public void configure(Binder binder)
            {
                newSetBinder(binder, Integer.class).addBinding().toInstance(1);
                newSetBinder(binder, Integer.class).addBinding().toInstance(2);
            }
        });

        System.out.println(injector.getInstance(new Key<Set<Integer>>() {}));
    }

    @Test
    public void testGuiceCells()
            throws Throwable
    {
        Injector injector = Guice.createInjector(new Module()
        {
            @Override
            public void configure(Binder binder)
            {
                binder.disableCircularProxies();
                binder.requireExplicitBindings();

                binder.bind(Integer.class).toInstance(1);
            }

            @Provides
            public String provideString(Cell<Integer> intCell)
            {
                return intCell.toString();
            }
        });

        System.out.println(injector.getInstance(new Key<Set<Integer>>() {}));
    }
}
