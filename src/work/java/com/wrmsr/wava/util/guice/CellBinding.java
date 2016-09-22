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
package com.wrmsr.wava.util.guice;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Binder;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.Provider;
import com.google.inject.TypeLiteral;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.spi.Dependency;
import com.google.inject.spi.HasDependencies;
import com.google.inject.spi.Toolable;
import com.wrmsr.wava.util.Cell;

import java.util.Set;

import static com.google.common.base.Preconditions.checkState;
import static java.util.Objects.requireNonNull;

public final class CellBinding
{
    private CellBinding()
    {
    }

//    public static <T> LinkedBindingBuilder<T> bindCell(Binder binder, Key<T> key)
//    {
//        CellBinder<T> result = new CellBinder<T>(binder, key.getTypeLiteral());
//        binder.install(result);
//        return result;
//    }
//
//    private static final class CellBinder<T>
//            implements Module, Provider<Cell<T>>, HasDependencies
//    {
//        private final TypeLiteral<T> elementType;
//
//        private Binder binder;
//
//        private Set<Dependency<?>> dependencies;
//
//        public CellBinder(Binder binder, TypeLiteral<T> elementType)
//        {
//            this.binder = requireNonNull(binder);
//            this.elementType = requireNonNull(elementType);
//        }
//
//        @Override
//        public void configure(Binder binder)
//        {
//
//        }
//
//        private Key<T> getKeyForNewItem()
//        {
//            checkState(!isInitialized());
//            return Key.get(elementType, new RealElement(setName, MULTIBINDER, ""));
//        }
//
//        public LinkedBindingBuilder<T> addBinding()
//        {
//            return binder.bind(getKeyForNewItem());
//        }
//
//        @Toolable
//        @Inject
//        void initialize(Injector injector)
//        {
//            /*
//            List<Binding<T>> bindings = new ArrayList<>();
//            Set<Indexer.IndexedBinding> index = new HashSet<>();
//            Indexer indexer = new Indexer(injector);
//            List<Dependency<?>> dependencies = new ArrayList<>();
//            for (Binding<?> entry : injector.findBindingsByType(elementType)) {
//                if (keyMatches(entry.getKey())) {
//                    @SuppressWarnings("unchecked") // protected by findBindingsByType()
//                            Binding<T> binding = (Binding<T>) entry;
//                    if (index.add(binding.acceptTargetVisitor(indexer))) {
//                        bindings.add(binding);
//                        dependencies.add(Dependency.get(binding.getKey()));
//                    }
//                }
//            }
//            */
//
//            dependencies = ImmutableSet.of();
//
//            binder = null;
//        }
//
//        private boolean isInitialized()
//        {
//            return binder == null;
//        }
//
//        @Override
//        public Set<Dependency<?>> getDependencies()
//        {
//            if (!isInitialized()) {
//                return ImmutableSet.<Dependency<?>>of(Dependency.get(Key.get(Injector.class)));
//            }
//            else {
//                return dependencies;
//            }
//        }
//
//        @Override
//        public Cell<T> get()
//        {
//            return null;
//        }
//    }
}
