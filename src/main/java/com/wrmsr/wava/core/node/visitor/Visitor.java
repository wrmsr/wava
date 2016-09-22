/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * ou may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF AN KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wrmsr.wava.core.node.visitor;

import com.wrmsr.wava.core.node.Binary;
import com.wrmsr.wava.core.node.Block;
import com.wrmsr.wava.core.node.Break;
import com.wrmsr.wava.core.node.BreakTable;
import com.wrmsr.wava.core.node.Call;
import com.wrmsr.wava.core.node.CallIndirect;
import com.wrmsr.wava.core.node.Const;
import com.wrmsr.wava.core.node.GetLocal;
import com.wrmsr.wava.core.node.If;
import com.wrmsr.wava.core.node.Label;
import com.wrmsr.wava.core.node.Load;
import com.wrmsr.wava.core.node.Loop;
import com.wrmsr.wava.core.node.Node;
import com.wrmsr.wava.core.node.Nop;
import com.wrmsr.wava.core.node.Return;
import com.wrmsr.wava.core.node.Select;
import com.wrmsr.wava.core.node.SetLocal;
import com.wrmsr.wava.core.node.Store;
import com.wrmsr.wava.core.node.Switch;
import com.wrmsr.wava.core.node.Unary;
import com.wrmsr.wava.core.node.Unreachable;

public abstract class Visitor<C, R>
{
    protected R visitNode(Node node, C context)
    {
        return null;
    }

    public R visitBinary(Binary node, C context)
    {
        return visitNode(node, context);
    }

    public R visitBlock(Block node, C context)
    {
        return visitNode(node, context);
    }

    public R visitBreak(Break node, C context)
    {
        return visitNode(node, context);
    }

    public R visitBreakTable(BreakTable node, C context)
    {
        return visitNode(node, context);
    }

    public R visitCall(Call node, C context)
    {
        return visitNode(node, context);
    }

    public R visitCallIndirect(CallIndirect node, C context)
    {
        return visitNode(node, context);
    }

    public R visitConst(Const node, C context)
    {
        return visitNode(node, context);
    }

    public R visitGetLocal(GetLocal node, C context)
    {
        return visitNode(node, context);
    }

    public R visitIf(If node, C context)
    {
        return visitNode(node, context);
    }

    public R visitLabel(Label node, C context)
    {
        return visitNode(node, context);
    }

    public R visitLoad(Load node, C context)
    {
        return visitNode(node, context);
    }

    public R visitLoop(Loop node, C context)
    {
        return visitNode(node, context);
    }

    public R visitNop(Nop node, C context)
    {
        return visitNode(node, context);
    }

    public R visitReturn(Return node, C context)
    {
        return visitNode(node, context);
    }

    public R visitSelect(Select node, C context)
    {
        return visitNode(node, context);
    }

    public R visitSetLocal(SetLocal node, C context)
    {
        return visitNode(node, context);
    }

    public R visitStore(Store node, C context)
    {
        return visitNode(node, context);
    }

    public R visitSwitch(Switch node, C context)
    {
        return visitNode(node, context);
    }

    public R visitUnary(Unary node, C context)
    {
        return visitNode(node, context);
    }

    public R visitUnreachable(Unreachable node, C context)
    {
        return visitNode(node, context);
    }
}
