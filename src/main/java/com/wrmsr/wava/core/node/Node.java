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
package com.wrmsr.wava.core.node;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.wrmsr.wava.core.node.visitor.Visitor;

import java.util.List;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.WRAPPER_OBJECT)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Binary.class, name = "binary"),
        @JsonSubTypes.Type(value = Block.class, name = "block"),
        @JsonSubTypes.Type(value = Break.class, name = "break"),
        @JsonSubTypes.Type(value = BreakTable.class, name = "breakTable"),
        @JsonSubTypes.Type(value = Call.class, name = "call"),
        @JsonSubTypes.Type(value = CallIndirect.class, name = "callIndirect"),
        @JsonSubTypes.Type(value = Const.class, name = "const"),
        @JsonSubTypes.Type(value = GetLocal.class, name = "getLocal"),
        @JsonSubTypes.Type(value = If.class, name = "if"),
        @JsonSubTypes.Type(value = Label.class, name = "label"),
        @JsonSubTypes.Type(value = Load.class, name = "load"),
        @JsonSubTypes.Type(value = Loop.class, name = "loop"),
        @JsonSubTypes.Type(value = Nop.class, name = "nop"),
        @JsonSubTypes.Type(value = Return.class, name = "return"),
        @JsonSubTypes.Type(value = Select.class, name = "select"),
        @JsonSubTypes.Type(value = SetLocal.class, name = "setLocal"),
        @JsonSubTypes.Type(value = Store.class, name = "store"),
        @JsonSubTypes.Type(value = Switch.class, name = "switch"),
        @JsonSubTypes.Type(value = Unary.class, name = "unary"),
        @JsonSubTypes.Type(value = Unreachable.class, name = "unreachable"),
})
public abstract class Node
{
    public abstract List<Node> getChildren();

    public abstract <C, R> R accept(Visitor<C, R> visitor, C context);
}
