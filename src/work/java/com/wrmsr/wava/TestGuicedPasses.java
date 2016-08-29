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

//import com.wrmsr.wava.driver.PassScope;
//import com.wrmsr.wava.driver.PassScoped;

/*
PassFactory ?
Key.get(Pass.class, "PassName")
context.seed(PassClass.class, FooPass.class)
injector.getInstance(Pass.class) ?

destruction / clobbering?
 based on provision requirements?

@FunctionalInterface
public interface PassOutput<T>
 void set(T value)

@FunctionalInterface
public interface Pass
 void run()

public abstract class PassModule<T, P extends Pass<T>> extends PrivateModule
 public abstract Class<? extends P> getPassClass()
*/
public class TestGuicedPasses
{
//    private static final class FunctionCompilerPass
//            implements Pass
//    {
//        private final Function function;
//        private final Consumer<JMethod> jmethod;
//
//        @Inject
//        public FunctionCompilerPass(
//                @PassInput Function function,
//                @PassOutput Consumer<JMethod> jmethod)
//        {
//            this.function = requireNonNull(function);
//            this.jmethod = requireNonNull(jmethod);
//        }
//
//        @Override
//        public void run()
//        {
//            jmethod.accept(NOP_METHOD);
//        }
//    }
//
//    private static final class FunctionPrinterPass
//            implements Pass
//    {
//        private final Function function;
//
//        @Inject
//        public FunctionPrinterPass(
//                @PassInput Function function)
//        {
//            this.function = requireNonNull(function);
//        }
//
//        @Override
//        public void run()
//        {
//            System.out.println(function);
//        }
//    }
//
//    private static final class PassGroup
//    {
//
//    }
//
//    private static final Function NOP_FUNCTION = new Function(
//            Name.of("nop"),
//            Type.NONE,
//            0,
//            new Locals(
//                    ImmutableList.of()),
//            new Nop());
//
//    private static final JMethod NOP_METHOD = new JMethod(
//            ImmutableSet.of(),
//            JTypeSpecifier.of("void"),
//            JName.of("nop"),
//            ImmutableList.of(),
//            Optional.empty());
//
////    @Test
////    public void testStuff()
////            throws Throwable
////    {
////        Injector injector = Guice.createInjector(
////                new Module()
////                {
////                    @Override
////                    public void configure(Binder binder)
////                    {
////                        binder.disableCircularProxies();
////                        binder.requireExplicitBindings();
////
////                        bindScopeInstance(binder, new PassScope(), PassScoped.class);
////                        bindScopeListeners(binder, PassScope.class);
////
////                        newPassType("function_compiler", FunctionPrinterPass.class).install(binder);
////                        newPassType("function_printer", FunctionPrinterPass.class).install(binder);
////                    }
////                });
////
////        Map<String, PassType> passTypeMap = buildPassTypeMap(injector);
////
////        PassScope passScope = injector.getInstance(PassScope.class);
////
////        passScope.with(
////                ImmutableMap.of(
////                        Key.get(Function.class, PassInput.class), NOP_FUNCTION),
////                () -> {
////                    Pass pass = injector.getInstance(Key.get(Pass.class, Names.named("function_printer")));
////                    pass.run();
////                    return null;
////                }).get();
////
////        Cell<JMethod> jmethod = Cell.of(null);
////        passScope.with(
////                ImmutableMap.of(
////                        Key.get(Function.class, PassInput.class), NOP_FUNCTION,
////                        Key.get(new TypeLiteral<Consumer<JMethod>>() {}, PassOutput.class), once(jmethod::set)),
////                () -> {
////                    Pass pass = injector.getInstance(Key.get(Pass.class, Names.named("function_compiler")));
////                    pass.run();
////                    return null;
////                }).get();
////    }
}
