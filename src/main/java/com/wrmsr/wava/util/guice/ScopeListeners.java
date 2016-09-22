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

import com.google.common.base.Throwables;
import com.google.inject.Binder;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Scope;
import com.google.inject.TypeLiteral;
import com.google.inject.util.Types;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Supplier;

public class ScopeListeners<T extends Scope>
{
    public interface Listener
    {
        void onEnter(Class<? extends Scope> scopeClass);

        void onExit(Class<? extends Scope> scopeClass);
    }

    public static abstract class AbstractListener
            implements Listener
    {
        @Override
        public void onEnter(Class<? extends Scope> scopeClass)
        {
        }

        @Override
        public void onExit(Class<? extends Scope> scopeClass)
        {
        }
    }

    public static class Registrar<S extends Scope, L extends Listener>
    {
        protected final ScopeListeners<S> listeners;
        protected final Key<L> listenerKey;

        @Inject
        public Registrar(ScopeListeners<S> listeners, TypeLiteral<L> listenerKey)
        {
            this.listeners = listeners;
            this.listenerKey = Key.get(listenerKey);
        }

        @PostConstruct
        public void postConstruct()
        {
            listeners.add(listenerKey);
        }
    }

    public static class EagerInstantiator<T>
            extends AbstractListener
    {
        protected final Key<T> key;
        protected final Injector injector;

        @Inject
        public EagerInstantiator(TypeLiteral<T> typeLiteral, Injector injector)
        {
            this.key = Key.get(typeLiteral);
            this.injector = injector;
        }

        @Override
        public void onEnter(Class<? extends Scope> scopeClass)
        {
            injector.getInstance(key);
        }
    }

    protected final Class<T> scopeClass;
    protected final Injector injector;

    protected final CopyOnWriteArrayList<Key<? extends Listener>> listenerKeys = new CopyOnWriteArrayList<>();

    @Inject
    @SuppressWarnings("unchecked")
    public ScopeListeners(TypeLiteral<T> scopeClass, Injector injector)
    {
        this((Class<T>) scopeClass.getRawType(), injector);
    }

    public ScopeListeners(Class<T> scopeClass, Injector injector)
    {
        this.scopeClass = scopeClass;
        this.injector = injector;
    }

    public void add(Key<? extends Listener> key)
    {
        listenerKeys.add(key);
    }

    public void add(TypeLiteral<? extends Listener> listenerType)
    {
        add(Key.get(listenerType));
    }

    public void add(Class<? extends Listener> listenerType)
    {
        add(TypeLiteral.get(listenerType));
    }

    public void enter()
    {
        for (Key<? extends Listener> listenerKey : listenerKeys) {
            Listener listener = injector.getInstance(listenerKey);
            try {
                listener.onEnter(scopeClass);
            }
            catch (Exception e) {
                throw Throwables.propagate(e);
            }
        }
    }

    public void exit()
    {
        for (Key<? extends Listener> listenerKey : listenerKeys) {
            Listener listener = injector.getInstance(listenerKey);
            try {
                listener.onExit(scopeClass);
            }
            catch (Exception e) {
                throw Throwables.propagate(e);
            }
        }
    }

    public <T> Supplier<T> with(Supplier<T> body)
    {
        return () -> {
            enter();
            try {
                return body.get();
            }
            finally {
                exit();
            }
        };
    }

    public static void bindScopeListeners(Binder binder, Class<? extends Scope> scopeCls)
    {
        binder.bind(Key.get(Types.newParameterizedType(ScopeListeners.class, scopeCls))).asEagerSingleton();
    }
}
