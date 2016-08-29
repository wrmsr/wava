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
package com.wrmsr.wava.yen.expression;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.yen.expression.visitor.YVisitor;

import java.util.List;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.WRAPPER_OBJECT)
@JsonSubTypes({
        @JsonSubTypes.Type(value = YBinary.class, name = "binary"),
        @JsonSubTypes.Type(value = YBlock.class, name = "block"),
        @JsonSubTypes.Type(value = YBreak.class, name = "break"),
        @JsonSubTypes.Type(value = YCallDirect.class, name = "callDirect"),
        @JsonSubTypes.Type(value = YCallImport.class, name = "callImport"),
        @JsonSubTypes.Type(value = YCallIndirect.class, name = "callIndirect"),
        @JsonSubTypes.Type(value = YConst.class, name = "const"),
        @JsonSubTypes.Type(value = YGetLocal.class, name = "getLocal"),
        @JsonSubTypes.Type(value = YHost.class, name = "host"),
        @JsonSubTypes.Type(value = YIf.class, name = "if"),
        @JsonSubTypes.Type(value = YLoad.class, name = "load"),
        @JsonSubTypes.Type(value = YLoop.class, name = "loop"),
        @JsonSubTypes.Type(value = YNop.class, name = "nop"),
        @JsonSubTypes.Type(value = YReturn.class, name = "return"),
        @JsonSubTypes.Type(value = YSelect.class, name = "select"),
        @JsonSubTypes.Type(value = YSetLocal.class, name = "setLocal"),
        @JsonSubTypes.Type(value = YStore.class, name = "store"),
        @JsonSubTypes.Type(value = YSwitch.class, name = "switch"),
        @JsonSubTypes.Type(value = YUnary.class, name = "unary"),
        @JsonSubTypes.Type(value = YUnreachable.class, name = "unreachable"),
})
public abstract class YExpression
{
    public Type getType()
    {
        return Type.NONE;
    }

    public List<YExpression> getChildren()
    {
        return ImmutableList.of();
    }

    public abstract <C, R> R accept(YVisitor<C, R> visitor, C context);
}
