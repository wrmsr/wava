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
package com.wrmsr.wava.transform.statementizer.fragment;

import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.util.temps.Temp;

import javax.annotation.concurrent.Immutable;

import java.util.List;

import static java.util.Objects.requireNonNull;

@Immutable
public final class TempFragment
        extends Fragment
{
    private final Temp temp;

    public TempFragment(List<Node> body, Temp temp)
    {
        super(body);
        this.temp = requireNonNull(temp);
    }

    public Temp getTemp()
    {
        return temp;
    }

    @Override
    public <C, R> R accept(FragmentVisitor<C, R> visitor, C context)
    {
        return visitor.visitTempFragment(this, context);
    }
}
