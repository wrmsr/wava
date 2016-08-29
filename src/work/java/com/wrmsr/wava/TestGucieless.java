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
import com.wrmsr.wava.analyze.ControlTransferAnalysis;
import com.wrmsr.wava.analyze.ValueTypeAnalysis;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.unit.Function;
import com.wrmsr.wava.core.unit.Local;
import com.wrmsr.wava.core.unit.Locals;
import com.wrmsr.wava.transform.statementizer.StatementizerTransform;
import com.wrmsr.wava.util.NameGenerator;
import com.wrmsr.wava.util.TypeKey;
import com.wrmsr.wava.util.temps.TempManager;
import org.testng.annotations.Test;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableSet;
import static java.util.Objects.requireNonNull;

public class TestGucieless
{
    public static class ContextKey<T>
            extends TypeKey<T>
    {
        protected ContextKey()
        {
        }

        private ContextKey(Type type)
        {
            super(type);
        }

        public static <T> ContextKey<T> of(Class<? extends T> cls)
        {
            return new ContextKey<>(cls);
        }
    }

    public static final class Context<T>
    {
        private final T subject;
        private final Map<ContextKey<?>, Object> objects;

        public Context(T subject, Map<ContextKey<?>, Object> objects)
        {
            this.subject = requireNonNull(subject);
            this.objects = ImmutableMap.copyOf(objects);
        }

        public T getSubject()
        {
            return subject;
        }

        @SuppressWarnings({"unchecked"})
        public <O> O getObject(ContextKey<O> key)
        {
            return requireNonNull((O) objects.get(key));
        }

        public <O> O getObject(Class<? extends O> cls)
        {
            return getObject(ContextKey.of(cls));
        }
    }

    @FunctionalInterface
    public interface Pass<T>
            extends UnaryOperator<Context<T>>
    {
    }

    public interface PassType<T>
    {
        Pass<T> create();

        Set<ContextKey<?>> getInputKeys();

        Set<ContextKey<?>> getOutputKeys();
    }

    public static final class StatementizerPass
            implements Pass<Function>
    {
        @Override
        public Context<Function> apply(Context<Function> functionContext)
        {
            Function function = functionContext.getSubject();
            ControlTransferAnalysis cfa = functionContext.getObject(ControlTransferAnalysis.class);
            ValueTypeAnalysis vta = functionContext.getObject(ValueTypeAnalysis.class);
            TempManager tm = new TempManager(
                    new NameGenerator(
                            function.getLocals().getList().stream().map(Local::getName).collect(toImmutableSet()),
                            "__temp$"),
                    Index.of(function.getLocals().getList().size()),
                    false);
            Node body = new StatementizerTransform(cfa, vta, tm).transformFunctionBody(function.getBody());
            Locals locals = new Locals(Stream.concat(function.getLocals().getList().stream(), tm.getTempList().stream().map(t -> new Local(t.getName(), t.getIndex(), t.getType()))).collect(toImmutableList()));
            Function newFunction = new Function(
                    function.getName(),
                    function.getResult(),
                    function.getArgCount(),
                    locals,
                    body);
            return new Context<>(
                    newFunction,
                    ImmutableMap.<ContextKey<?>, Object>of());
        }
    }

    @Test
    public void testBlah()
            throws Throwable
    {
//        Module module = null;
//        Function function = null;
//
//        Context<Module> moduleContext = new Context<>(module, ImmutableMap.of());
//        Context<Function> functionContext = new Context<>(
//                function,
//                ImmutableMap.<ContextKey<?>, Object>of(
//                        new ContextKey<Context<Module>>() {}, moduleContext,
//                        ContextKey.of(Integer.class), 4));
//
//        assert functionContext.getObject(new ContextKey<Context<Module>>() {}) == moduleContext;
//        assert functionContext.getObject(Integer.class).equals(4);
    }

//    @Test
//    public void testThing()
//            throws Throwable
//    {
//        JVMCI.getRuntime();
//    }
}
