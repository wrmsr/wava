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

@Immutable
public enum TargetOption
        implements JavacOption
{
    _5(5),
    _6(6),
    _7(7),
    _8(8),
    _9(9);

    private final int version;

    TargetOption(int version)
    {
        this.version = version;
    }

    @Override
    public List<String> getArgs()
    {
        return ImmutableList.of("-target", String.format("1.%d", version));
    }
}

