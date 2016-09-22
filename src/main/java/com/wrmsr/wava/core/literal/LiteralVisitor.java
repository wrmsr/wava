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
package com.wrmsr.wava.core.literal;

public class LiteralVisitor<C, R>
{
    protected R visitLiteral(Literal<?, ?> literal, C context)
    {
        return null;
    }

    public R visitI32(I32Literal literal, C context)
    {
        return visitLiteral(literal, context);
    }

    public R visitI64(I64Literal literal, C context)
    {
        return visitLiteral(literal, context);
    }

    public R visitF32(F32Literal literal, C context)
    {
        return visitLiteral(literal, context);
    }

    public R visitF64(F64Literal literal, C context)
    {
        return visitLiteral(literal, context);
    }
}
