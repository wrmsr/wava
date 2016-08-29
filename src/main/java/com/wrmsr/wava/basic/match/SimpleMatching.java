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
package com.wrmsr.wava.basic.match;

import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.basic.Basic;
import com.wrmsr.wava.basic.BasicSet;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import static com.google.common.base.Preconditions.checkState;
import static com.google.common.collect.Iterables.getOnlyElement;
import static com.wrmsr.wava.basic.Basics.getUnconditionalTarget;
import static com.wrmsr.wava.basic.Basics.mergeBasics;
import static com.wrmsr.wava.basic.Basics.renameTarget;
import static java.util.Objects.requireNonNull;

public final class SimpleMatching
{
    private SimpleMatching()
    {
    }

    public static Stream<BasicSet> mergeUnconditionalBasic(BasicSet basics, Basic basic)
    {
        Set<Name> inputNames = basics.getInputs(basic);
        if (inputNames.size() == 1) {
            final Name inputName = getOnlyElement(inputNames);
            Basic inputBasic = requireNonNull(basics.get(inputName));
            checkState(inputBasic.getName().equals(inputName));
            if (getUnconditionalTarget(inputBasic.getBreakTable()).isPresent()) {
                inputBasic = mergeBasics(inputBasic, basic);
                return Stream.of(basics.replace(inputBasic).remove(basic));
            }
        }
        return Stream.empty();
    }

    public static Stream<BasicSet> mergeEmptyBasic(BasicSet basics, Basic basic)
    {
        Set<Name> inputNames = basics.getInputs(basic);
        if (!inputNames.isEmpty() && basic.getBody().isEmpty()) {
            Optional<Name> unconditionalTarget = getUnconditionalTarget(basic.getBreakTable());
            if (unconditionalTarget.isPresent()) {
                for (final Name inputName : inputNames) {
                    Basic inputBasic = requireNonNull(basics.get(inputName));
                    checkState(inputBasic.getName().equals(inputName));
                    inputBasic = renameTarget(inputBasic, basic.getName(), unconditionalTarget.get());
                    basics = basics.replace(inputBasic);
                }
                return Stream.of(basics.remove(basic));
            }
        }
        return Stream.empty();
    }
}
