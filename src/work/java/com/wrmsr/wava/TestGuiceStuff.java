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

public class TestGuiceStuff
{
//    public static final class ThingKey
//            extends Box<String>
//    {
//        public ThingKey(String value)
//        {
//            super(value);
//        }
//    }
//
//    public interface Thing
//    {
//        String doStuff();
//    }
//
//    public static final class ThingA
//            implements Thing
//    {
//        private final ThingKey key;
//
//        @Inject
//        public ThingA(ThingKey key)
//        {
//            this.key = key;
//        }
//
//        @Override
//        public String doStuff()
//        {
//            return key.get() + "A";
//        }
//    }
//
//    public static final class ThingB
//            implements Thing
//    {
//        private final ThingKey key;
//
//        @Inject
//        public ThingB(ThingKey key)
//        {
//            this.key = key;
//        }
//
//        @Override
//        public String doStuff()
//        {
//            return key.get() + "B";
//        }
//    }
//
//    @Test
//    public void testScopedMulti()
//            throws Throwable
//    {
//        Module moduleA = new Module()
//        {
//            @Override
//            public void configure(Binder binder)
//            {
//                bindScopeInstance(binder, new PassScope(), PassScoped.class);
//                bindScopeListeners(binder, PassScope.class);
//
//                binder.bind(ThingKey.class).toProvider(simpleScopeSeededProvider()).in(PassScoped.class);
//
//                newSetBinder(binder, Thing.class);
//                newSetBinder(binder, Thing.class).addBinding().to(ThingA.class).in(PassScoped.class);
//                newSetBinder(binder, Thing.class).addBinding().to(ThingB.class).in(PassScoped.class);
//            }
//
//            @Provides
//            @PassScoped
//            public String stringProvider(ThingKey thingKey)
//            {
//                return thingKey.get();
//            }
//        };
//
//        Injector injector = Guice.createInjector(moduleA);
//
//        PassScope passScope = injector.getInstance(PassScope.class);
//        ScopeListeners<PassScope> moduleScopeListeners = injector.getInstance(new Key<ScopeListeners<PassScope>>() {});
//
//        passScope.with(
//                ImmutableMap.of(
//                        Key.get(ThingKey.class), new ThingKey("a")),
//                moduleScopeListeners.with(() -> {
//                    Set<Thing> things = injector.getInstance(new Key<Set<Thing>>() {});
//                    System.out.println(Joiner.on(" ").join(things.stream().map(Thing::doStuff).iterator()));
//                    return null;
//                })).get();
//
//        passScope.with(
//                ImmutableMap.of(
//                        Key.get(ThingKey.class), new ThingKey("b")),
//                moduleScopeListeners.with(() -> {
//                    Set<Thing> things = injector.getInstance(new Key<Set<Thing>>() {});
//                    System.out.println(Joiner.on(" ").join(things.stream().map(Thing::doStuff).iterator()));
//                    return null;
//                })).get();
//
//        passScope.with(
//                ImmutableMap.of(
//                        Key.get(ThingKey.class), new ThingKey("c")),
//                () -> {
//                    moduleScopeListeners.with(() -> {
//                        Set<Thing> things = injector.getInstance(new Key<Set<Thing>>() {});
//                        System.out.println(Joiner.on(" ").join(things.stream().map(Thing::doStuff).iterator()));
//                        return null;
//                    }).get();
//                    System.out.println(passScope.getScopedObject(Key.get(ThingKey.class)));
////                    System.out.println(modulePassScope.getScopedObject(Key.get(String.class)));
//                    return null;
//                }).get();
//
//        passScope.with(
//                ImmutableMap.of(
//                        Key.get(ThingKey.class), new ThingKey("d")),
//                () -> {
//                    moduleScopeListeners.with(() -> {
//                        Set<Thing> things = injector.getInstance(new Key<Set<Thing>>() {});
//                        System.out.println(Joiner.on(" ").join(things.stream().map(Thing::doStuff).iterator()));
//                        System.out.println(injector.getInstance(String.class));
//                        return null;
//                    }).get();
//                    System.out.println(passScope.getScopedObject(Key.get(ThingKey.class)));
//                    System.out.println(passScope.getScopedObject(Key.get(String.class)));
//                    return null;
//                }).get();
//
//        passScope.with(
//                ImmutableMap.of(
//                        Key.get(ThingKey.class), new ThingKey("e1")),
//                moduleScopeListeners.with(() -> {
//                    Set<Thing> things1 = injector.getInstance(new Key<Set<Thing>>() {});
//                    System.out.println(Joiner.on(" ").join(things1.stream().map(Thing::doStuff).iterator()));
//                    passScope.with(
//                            ImmutableMap.of(
//                                    Key.get(ThingKey.class), new ThingKey("e2")),
//                            moduleScopeListeners.with(() -> {
//                                Set<Thing> things2 = injector.getInstance(new Key<Set<Thing>>() {});
//                                System.out.println(Joiner.on(" ").join(things2.stream().map(Thing::doStuff).iterator()));
//                                return null;
//                            })).get();
//                    things1 = injector.getInstance(new Key<Set<Thing>>() {});
//                    System.out.println(Joiner.on(" ").join(things1.stream().map(Thing::doStuff).iterator()));
//                    return null;
//                })).get();
//
////        modulePassScope.with(
////                ImmutableMap.of(
////                        Key.get(ThingKey.class), new ThingKey("f")),
////                moduleScopeListeners.with(() -> {
////                    Set<Thing> things = injector.getInstance(Key.get(new TypeLiteral<Set<Thing>>() {}));
////                    Cell<ThingKey> thingCell = injector.getInstance(Key.get(new TypeLiteral<Cell<ThingKey>>() {}));
////                    System.out.println(Joiner.on(" ").join(things.stream().map(Thing::doStuff).iterator()));
////                    return null;
////                })).get();
//    }
//
//    @Test
//    public void testKeys()
//            throws Throwable
//    {
//        TypeLiteral tl = new TypeLiteral<Set<Integer>>() {};
//        Injector injector = Guice.createInjector();
//        Set<Integer> s = injector.getInstance(Key.get(new TypeLiteral<Set<Integer>>() {}));
//    }
//
//    @Test
//    public void testNesting()
//            throws Throwable
//    {
////        Injector injector = Guice.createInjector(
////                new PrivateModule() {
////                    @Override
////                    protected void configure()
////                    {
////
////                    }
////                }
////        );
////
////        System.out.println()
//    }
//
//    private static final class PassA
//            implements Pass
//    {
//        @Override
//        public void run()
//        {
//        }
//    }
//
//    private static final class PassB
//            implements Pass
//    {
//        @Override
//        public void run()
//        {
//        }
//    }
//
//    @Test
//    public void testPrivMaps()
//            throws Throwable
//    {
//        // https://groups.google.com/forum/#!topic/google-guice/h70a9pwD6_g waaaaaaaaaaa
//        Injector injector = Guice.createInjector(
//                new AbstractModule()
//                {
//                    @Override
//                    protected void configure()
//                    {
//                        newMapBinder(binder(), new TypeLiteral<String>() {}, new TypeLiteral<Class<? extends Pass>>() {});
//                    }
//                },
//                new PrivateModule()
//                {
//                    @Override
//                    protected void configure()
//                    {
//                        newMapBinder(binder(), new TypeLiteral<String>() {}, new TypeLiteral<Class<? extends Pass>>() {}).addBinding("a").toInstance(PassA.class);
////                        expose(newMapBinder(binder(), new TypeLiteral<String>() {}, new TypeLiteral<Class<? extends Pass>>() {}))
//                        bind(Integer.class).toInstance(1);
//                    }
//                },
//                new PrivateModule()
//                {
//                    @Override
//                    protected void configure()
//                    {
//                        newMapBinder(binder(), new TypeLiteral<String>() {}, new TypeLiteral<Class<? extends Pass>>() {}).addBinding("b").toInstance(PassB.class);
//                        bind(Integer.class).toInstance(2);
//                    }
//                });
//    }
}
