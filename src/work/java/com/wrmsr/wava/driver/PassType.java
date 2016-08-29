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

import com.google.common.collect.ImmutableList;
import com.google.inject.Binder;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.PrivateBinder;
import com.google.inject.PrivateModule;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import com.google.inject.spi.Dependency;
import com.google.inject.spi.InjectionPoint;
import com.wrmsr.wava.util.MoreTypes;
import org.apache.commons.lang3.tuple.ImmutablePair;

import javax.annotation.concurrent.Immutable;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static com.google.common.base.Preconditions.checkState;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableMap;
import static com.wrmsr.wava.util.guice.SimpleScope.simpleScopeSeededProvider;
import static java.util.Objects.requireNonNull;

@Immutable
public final class PassType
{
    private final String name;
    private final Class<? extends Pass> cls;
//    private final Set<Class<? extends Pass>> requiredPasses;
//    private final Set<Class<? extends Analysis>> requiredAnalyses; // or just a fukn input ugh
    private final List<TypeLiteral<?>> inputs;
    private final List<TypeLiteral<?>> outputs;

    private final List<Key<?>> inputKeys;
    private final List<Key<?>> outputKeys;

    public PassType(String name, Class<? extends Pass> cls, List<TypeLiteral<?>> inputs, List<TypeLiteral<?>> outputs)
    {
        this.name = requireNonNull(name);
        this.cls = cls;
        this.inputs = ImmutableList.copyOf(inputs);
        this.outputs = ImmutableList.copyOf(outputs);
        inputKeys = inputs.stream().map(lit -> Key.get(lit, PassInput.class)).collect(toImmutableList());
        outputKeys = outputs.stream().map(lit -> Key.get(new MoreTypes.ParameterizedTypeImpl(null, Consumer.class, lit.getType()), PassOutput.class)).collect(toImmutableList());
    }

    public String getName()
    {
        return name;
    }

    public Class<? extends Pass> getCls()
    {
        return cls;
    }

    public List<TypeLiteral<?>> getInputs()
    {
        return inputs;
    }

    public List<TypeLiteral<?>> getOutputs()
    {
        return outputs;
    }

    List<Key<?>> getInputKeys()
    {
        return inputKeys;
    }

    List<Key<?>> getOutputKeys()
    {
        return outputKeys;
    }

    @SuppressWarnings({"unchecked"})
    public void bind(PrivateBinder binder)
    {
        binder.bind(PassType.class).annotatedWith(Names.named(name)).toInstance(this);
        binder.expose(PassType.class).annotatedWith(Names.named(name));
        binder.bind(Pass.class).annotatedWith(Names.named(name)).to(cls).in(PassScoped.class);
        binder.expose(Pass.class).annotatedWith(Names.named(name));
        for (Key<?> key : inputKeys) {
            binder.bind((Key) key).toProvider(simpleScopeSeededProvider()).in(PassScoped.class);
        }
        for (Key<?> key : outputKeys) {
            binder.bind((Key) key).toProvider(simpleScopeSeededProvider()).in(PassScoped.class);
        }
    }

    public void install(Binder binder)
    {
        binder.install(new PrivateModule()
        {
            @Override
            protected void configure()
            {
                PassType.this.bind(binder());
            }
        });
    }

    public static PassType newPassType(String name, Class<? extends Pass> cls)
    {
        ImmutableList.Builder<TypeLiteral<?>> inputs = ImmutableList.builder();
        ImmutableList.Builder<TypeLiteral<?>> outputs = ImmutableList.builder();
        InjectionPoint passCtor = InjectionPoint.forConstructorOf(cls);
        for (Dependency<?> dep : passCtor.getDependencies()) {
            Key key = dep.getKey();
            if (key.getAnnotation() instanceof PassInput) {
                inputs.add(key.getTypeLiteral());
            }
            else if (key.getAnnotation() instanceof PassOutput) {
                checkState(key.getTypeLiteral().getRawType() == Consumer.class);
                ParameterizedType parameterized = (ParameterizedType) key.getTypeLiteral().getType();
                java.lang.reflect.Type outputType = parameterized.getActualTypeArguments()[0];
                outputs.add(TypeLiteral.get(outputType));
            }
        }
        return new PassType(name, cls, inputs.build(), outputs.build());
    }

    public static Map<String, PassType> buildPassTypeMap(Injector injector)
    {
        return injector.getBindings().entrySet().stream()
                .filter(e -> e.getKey().getTypeLiteral().getRawType() == PassType.class)
                .map(e -> ImmutablePair.of(
                        e.getKey().getAnnotation() instanceof Named ?
                                ((Named) e.getKey().getAnnotation()).value() :
                                ((PassType) e.getValue().getProvider().get()).getName(),
                        (PassType) e.getValue().getProvider().get()))
                .collect(toImmutableMap());
    }
}
