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

import com.google.inject.Key;
import com.google.inject.OutOfScopeException;
import com.google.inject.Provider;
import com.google.inject.Scope;
import org.organicdesign.fp.collections.ImMap;
import org.organicdesign.fp.collections.PersistentHashMap;

import javax.annotation.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.Supplier;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;
import static java.util.Objects.requireNonNull;

/**
 * Original authors: Jesse Wilson, Fedor Karpelevitch
 */
public abstract class SimpleScope
        implements Scope
{
    public interface Storage
    {
        default Map<Key<?>, Object> getMap()
        {
            throw new UnsupportedOperationException();
        }

        Storage put(Key<?> key, Object value);

        boolean contains(Key<?> key);

        @Nullable
        Object get(Key<?> key);
    }

    private static final class LinkedStorage
            implements Storage
    {
        private final Storage[] targets;

        public LinkedStorage(Storage[] targets)
        {
            requireNonNull(targets);
            checkArgument(targets.length > 0);
            this.targets = targets;
        }

        @Override
        public Storage put(Key<?> key, Object value)
        {
            return targets[0] = targets[0].put(key, value);
        }

        @Override
        public boolean contains(Key<?> key)
        {
            for (int i = 0; i < targets.length; ++i) {
                if (targets[i].contains(key)) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        @Override
        public Object get(Key<?> key)
        {
            for (int i = 0; i < targets.length; ++i) {
                Object value = targets[i].get(key);
                if (value != null) {
                    return value;
                }
            }
            return null;
        }
    }

    private static final class MapStorage
            implements Storage
    {
        private final Map<Key<?>, Object> map;

        public MapStorage(Map<Key<?>, Object> map)
        {
            this.map = requireNonNull(map);
        }

        @Override
        public Map<Key<?>, Object> getMap()
        {
            return map;
        }

        @Override
        public Storage put(Key<?> key, Object value)
        {
            map.put(key, value);
            return this;
        }

        @Override
        public boolean contains(Key<?> key)
        {
            return map.containsKey(key);
        }

        @Nullable
        @Override
        public Object get(Key<?> key)
        {
            return map.get(key);
        }
    }

    public static Storage newMapStorage()
    {
        return new MapStorage(new HashMap<>());
    }

    private static final class ImMapStorage
            implements Storage
    {
        private final ImMap<Key<?>, Object> map;

        public ImMapStorage(ImMap<Key<?>, Object> map)
        {
            this.map = requireNonNull(map);
        }

        @Override
        public ImMap<Key<?>, Object> getMap()
        {
            return map;
        }

        @Override
        public Storage put(Key<?> key, Object value)
        {
            return new ImMapStorage(map.assoc(key, value));
        }

        @Override
        public boolean contains(Key<?> key)
        {
            return map.containsKey(key);
        }

        @Nullable
        @Override
        public Object get(Key<?> key)
        {
            return map.get(key);
        }
    }

    public static Storage newPersistentMapStorage()
    {
        return new ImMapStorage(PersistentHashMap.empty());
    }

    public interface StoragePolicy
    {
        void enter(Storage storage);

        boolean isActive();

        Storage getStorage();

        Storage exit();
    }

    private static final class UniqueStoragePolicy
            implements StoragePolicy
    {
        private Storage storage;

        @Override
        public void enter(Storage storage)
        {
            checkState(this.storage == null);
            this.storage = requireNonNull(storage);
        }

        @Override
        public boolean isActive()
        {
            return storage != null;
        }

        @Override
        public Storage getStorage()
        {
            return this.storage;
        }

        @Override
        public Storage exit()
        {
            checkState(storage != null);
            Storage ret = storage;
            storage = null;
            return storage;
        }
    }

    public static StoragePolicy newUniqueStoragePolicy()
    {
        return new UniqueStoragePolicy();
    }

    private static final class NestedStoragePolicy
            implements StoragePolicy
    {
        private final Stack<Storage> stack = new Stack<>();

        @Override
        public void enter(Storage storage)
        {
            stack.push(requireNonNull(storage));
        }

        @Override
        public boolean isActive()
        {
            return !stack.isEmpty();
        }

        @Override
        public Storage getStorage()
        {
            checkState(!stack.isEmpty());
            return stack.peek();
        }

        @Override
        public Storage exit()
        {
            checkState(!stack.isEmpty());
            return stack.pop();
        }
    }

    public static StoragePolicy newNestedStoragePolicy()
    {
        return new NestedStoragePolicy();
    }

    private static final class LinkedStoragePolicy
            implements StoragePolicy
    {
        private final Stack<Storage> stack = new Stack<>();

        @Override
        public void enter(Storage storage)
        {
            requireNonNull(storage);
            if (!stack.isEmpty()) {
                stack.push(new LinkedStorage(new Storage[] {storage, stack.peek()}));
            }
            else {
                stack.push(storage);
            }
        }

        @Override
        public boolean isActive()
        {
            return !stack.isEmpty();
        }

        @Override
        public Storage getStorage()
        {
            checkState(!stack.isEmpty());
            return stack.peek();
        }

        @Override
        public Storage exit()
        {
            checkState(!stack.isEmpty());
            return stack.pop();
        }
    }

    public static StoragePolicy newLinkedStoragePolicy()
    {
        return new LinkedStoragePolicy();
    }

    private static final Provider<Object> SEEDED_KEY_PROVIDER = new Provider<Object>()
    {
        @Override
        public Object get()
        {
            throw new IllegalStateException("If you got here then it means that your code asked for scoped object which should have been explicitly seeded in this scope by calling SimpleScope.seed(), but was not.");
        }
    };

    private final Supplier<Storage> storageSupplier;

    private final ThreadLocal<StoragePolicy> threadLocalStoragePolicy;

    public SimpleScope(Supplier<Storage> storageSupplier, Supplier<StoragePolicy> storagePolicySupplier)
    {
        this.storageSupplier = requireNonNull(storageSupplier);

        threadLocalStoragePolicy = ThreadLocal.withInitial(storagePolicySupplier);
    }

    public void enter()
    {
        enter(storageSupplier.get());
    }

    public void enter(Storage storage)
    {
        StoragePolicy storagePolicy = threadLocalStoragePolicy.get();
        storagePolicy.enter(storage);
    }

    public Storage exit()
    {
        StoragePolicy storagePolicy = threadLocalStoragePolicy.get();
        Storage ret = storagePolicy.exit();
        if (!storagePolicy.isActive()) {
            threadLocalStoragePolicy.remove();
        }
        return ret;
    }

    public <T> void seed(Key<T> key, T value)
    {
        Storage storage = threadLocalStoragePolicy.get().getStorage();
        checkState(!storage.contains(key), "A value for the key %s was already seeded in this scope. Old value: %s New value: %s", key, storage.get(key), value);
        storage.put(key, value);
    }

    public <T> void seed(Class<T> clazz, T value)
    {
        seed(Key.get(clazz), value);
    }

    @Override
    public <T> Provider<T> scope(final Key<T> key, final Provider<T> unscoped)
    {
        return new Provider<T>()
        {
            @Override
            public T get()
            {
                Storage storage = threadLocalStoragePolicy.get().getStorage();

                @SuppressWarnings("unchecked")
                T current = (T) storage.get(key);
                if (current == null && !storage.contains(key)) {
                    current = unscoped.get();
                    storage.put(key, current);
                }
                return current;
            }
        };
    }

    @SuppressWarnings({"unchecked"})
    public <T> T getScopedObject(Key<T> key)
    {
        Storage storage = threadLocalStoragePolicy.get().getStorage();
        if (storage == null) {
            throw new OutOfScopeException("Cannot access " + key + " outside of a scoping block");
        }
        return (T) requireNonNull(storage.get(key));
    }

    /**
     * Returns a provider that always throws exception complaining that the object
     * in question must be seeded before it can be injected.
     *
     * @return typed provider
     */
    @SuppressWarnings({"unchecked"})
    public static <T> Provider<T> simpleScopeSeededProvider()
    {
        return (Provider<T>) SEEDED_KEY_PROVIDER;
    }

    @SuppressWarnings({"unchecked"})
    public <T extends SimpleScope, R> Supplier<R> with(Map<Key<?>, Object> seedObjects, Supplier<R> body)
    {
        return () -> {
            enter();
            try {
                seedObjects.entrySet().forEach(e -> {
                    seed((Key) e.getKey(), e.getValue());
                });
                return body.get();
            }
            finally {
                exit();
            }
        };
    }
}
