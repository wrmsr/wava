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
package com.wrmsr.wava.transform;

import com.wrmsr.wava.analyze.SwitchAnalysis;
import com.wrmsr.wava.core.node.Label;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Switch;
import com.wrmsr.wava.core.node.visitor.Visitor;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static com.google.common.base.Preconditions.checkState;
import static com.wrmsr.wava.core.node.Nodes.nodify;
import static com.wrmsr.wava.core.node.Nodes.reconstructNode;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;

public final class Switchification
{
    private Switchification()
    {
    }

    public static Node switchify(Node root, SwitchAnalysis swa)
    {
        Map<Label, SwitchAnalysis.SwitchEntry> map = new IdentityHashMap<>();
        for (SwitchAnalysis.SwitchEntry e : swa.getEntries()) {
            checkState(!map.containsKey(e.getEntryPoint()));
            map.put(e.getEntryPoint(), e);
        }

        return root.accept(new Visitor<Void, Node>()
        {
            @Override
            protected Node visitNode(Node node, Void context)
            {
                return reconstructNode(node, node.getChildren().stream().map(c -> c.accept(this, context)).iterator());
            }

            @Override
            public Node visitLabel(Label node, Void context)
            {
                if (!map.containsKey(node)) {
                    return visitNode(node, context);
                }

                SwitchAnalysis.SwitchEntry entry = map.get(node);
                Node condition = entry.getCore().getCondition().accept(this, context);
                List<Switch.Entry> switchEntries = entry.getCasesEntries().stream()
                        .map(ce -> new Switch.Entry(
                                Stream.concat(
                                        ce.getValues().stream().map(Switch.Value::of),
                                        entry.getCore().getDefaultTarget().equals(ce.getName()) ? Stream.of(Switch.Value.DEFAULT) : Stream.empty())
                                        .collect(toImmutableList()),
                                nodify(ce.getBody().stream().map(b -> b.accept(this, context)).collect(toImmutableList()))))
                        .collect(toImmutableList());

                return new Switch(
                        condition,
                        switchEntries);
            }
        }, null);
    }
}
