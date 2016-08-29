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
package com.wrmsr.wava.transform.basic;

import com.google.common.collect.Multimap;
import com.wrmsr.wava.core.type.Name;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.organicdesign.fp.collections.ImMap;
import org.organicdesign.fp.collections.ImSet;
import org.organicdesign.fp.collections.PersistentHashSet;

import javax.annotation.CheckReturnValue;
import javax.annotation.concurrent.Immutable;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;
import static com.wrmsr.wava.transform.basic.Basics.TERMINAL_NAMES;
import static com.wrmsr.wava.transform.basic.Basics.getBasicInputs;
import static com.wrmsr.wava.util.collect.MoreMultimaps.unmodifiableMultimapView;
import static com.wrmsr.wava.util.collect.PersistentMaps.toPersistentHashMap;
import static com.wrmsr.wava.util.collect.PersistentMultimaps.newPersistentHashMultimap;
import static java.util.Objects.requireNonNull;

@Immutable
public final class BasicSet
        implements Iterable<Name>
{
    private final ImMap<Name, Basic> basics;
    private final ImMap<Name, ImSet<Name>> inputs;

    private BasicSet(ImMap<Name, Basic> basics, ImMap<Name, ImSet<Name>> inputs)
    {
        this.basics = requireNonNull(basics);
        this.inputs = requireNonNull(inputs);
    }

    private BasicSet(ImMap<Name, Basic> basics)
    {
        this(basics, newPersistentHashMultimap(getBasicInputs(StreamSupport.stream(basics.spliterator(), false).map(entry -> entry.getValue()))));
    }

    public static BasicSet build(Stream<Basic> basics)
    {
        return new BasicSet(basics.map(basic -> {
            checkArgument(!Basics.TERMINAL_NAMES.contains(basic.getName()));
            return ImmutablePair.of(basic.getName(), basic);
        }).collect(toPersistentHashMap()));
    }

    public static BasicSet build(Map<Name, Basic> basics)
    {
        return build(basics.values().stream());
    }

    public ImMap<Name, Basic> getBasics()
    {
        return basics;
    }

    public ImMap<Name, ImSet<Name>> getInputs()
    {
        return inputs;
    }

    @SuppressWarnings({"unchecked"})
    public Multimap<Name, Name> getInputsMultimap()
    {
        Map<Name, Collection<Name>> inputs = (Map<Name, Collection<Name>>) (Object) this.inputs;
        return unmodifiableMultimapView(inputs);
    }

    public ImSet<Name> getInputs(Name name)
    {
        checkArgument(basics.containsKey(name));
        return inputs.getOrElse(name, PersistentHashSet.empty());
    }

    public ImSet<Name> getInputs(Basic basic)
    {
        return getInputs(basic.getName());
    }

    public ImSet<Name> getNames()
    {
        return basics.keySet();
    }

    public Basic get(Name name)
    {
        return requireNonNull(basics.get(name));
    }

    public boolean contains(Name name)
    {
        return basics.containsKey(name);
    }

    public int size()
    {
        return basics.size();
    }

    public boolean isEmpty()
    {
        return basics.isEmpty();
    }

    @Override
    public Iterator<Name> iterator()
    {
        return stream().iterator();
    }

    public Stream<Name> stream()
    {
        return StreamSupport.stream(basics.spliterator(), false)
                .map(Map.Entry::getKey);
    }

    public final class BasicAccessor
            implements Iterable<Basic>
    {
        @Override
        public Iterator<Basic> iterator()
        {
            return stream().iterator();
        }

        public Stream<Basic> stream()
        {
            return StreamSupport.stream(basics.spliterator(), false)
                    .map(Map.Entry::getValue);
        }
    }

    public BasicAccessor basics()
    {
        return new BasicAccessor();
    }

    @CheckReturnValue
    public BasicSet replace(Basic newBasic)
    {
        Name name = newBasic.getName();
        checkArgument(!Basics.UNREACHABLE_NAME.equals(name));
        newBasic.getAllTargets().forEach(target -> checkArgument(basics.containsKey(target) || TERMINAL_NAMES.contains(target)));

        Basic oldBasic = requireNonNull(basics.get(name));
        checkState(oldBasic.getName().equals(name));
        oldBasic.getAllTargets().forEach(target -> checkArgument(basics.containsKey(target) || TERMINAL_NAMES.contains(target)));

        ImMap<Name, Basic> newBasics = basics;
        ImMap<Name, ImSet<Name>> newInputs = inputs;
        for (Name target : oldBasic.getAllTargets()) {
            newInputs = newInputs.assoc(target, newInputs.get(target).without(name));
        }
        newBasics = newBasics.assoc(name, newBasic);
        for (Name target : newBasic.getAllTargets()) {
            newInputs = newInputs.assoc(target, newInputs.get(target).put(name));
        }
        return new BasicSet(newBasics, newInputs);
    }

    @CheckReturnValue
    public BasicSet remove(Name name)
    {
        Basic basic = requireNonNull(basics.get(name));
        basic.getAllTargets().forEach(target -> checkArgument(inputs.get(target).contains(name)));
        inputs.get(name).forEach(input -> {
            Basic inputBasic = basics.get(input);
            if (inputBasic != null) {
                checkArgument(!inputBasic.getAllTargets().contains(name));
            }
        });

        ImMap<Name, Basic> newBasics = basics;
        ImMap<Name, ImSet<Name>> newInputs = inputs;
        newBasics = newBasics.without(name);
        newInputs = newInputs.without(name);
        for (Name target : basic.getAllTargets()) {
            newInputs = newInputs.assoc(target, newInputs.get(target).without(name));
        }
        return new BasicSet(newBasics, newInputs);
    }

    @CheckReturnValue
    public BasicSet remove(Basic basic)
    {
        return remove(basic.getName());
    }
}

