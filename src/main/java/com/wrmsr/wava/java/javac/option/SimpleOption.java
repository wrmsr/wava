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
package com.wrmsr.wava.java.javac.option;

import com.google.common.collect.ImmutableList;

import javax.annotation.concurrent.Immutable;

import java.util.List;
import java.util.Optional;

@Immutable
public abstract class SimpleOption
        implements JavacOption
{
    private final Optional<String> arg;

    public SimpleOption(String arg)
    {
        this.arg = Optional.of(arg);
    }

    public SimpleOption()
    {
        arg = Optional.empty();
    }

    public Optional<String> getArg()
    {
        return arg;
    }

    @Override
    public List<String> getArgs()
    {
        return arg.map(ImmutableList::of).orElse(ImmutableList.of());
    }
}
