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
package com.wrmsr.wava.core.node.visitor;

import com.wrmsr.wava.core.node.Node;

public final class Visitors
{
    private Visitors()
    {
    }

    public static <C, R> void preWalk(Node Node, Visitor<C, R> visitor, C context)
    {
        Node.accept(visitor, context);
        for (Node child : Node.getChildren()) {
            preWalk(child, visitor, context);
        }
    }

    public static <C, R> void postWalk(Node Node, Visitor<C, R> visitor, C context)
    {
        for (Node child : Node.getChildren()) {
            postWalk(child, visitor, context);
        }
        Node.accept(visitor, context);
    }
}
