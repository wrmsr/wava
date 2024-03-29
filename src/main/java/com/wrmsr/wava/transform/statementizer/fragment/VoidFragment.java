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

import javax.annotation.concurrent.Immutable;

import java.util.List;

@Immutable
public final class VoidFragment
    extends Fragment
{
    public VoidFragment(List<Node> body)
    {
        super(body);
    }

    @Override
    public <C, R> R accept(FragmentVisitor<C, R> visitor, C context)
    {
        return visitor.visitVoidFragment(this, context);
    }
}
