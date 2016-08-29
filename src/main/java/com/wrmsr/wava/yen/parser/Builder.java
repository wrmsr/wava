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
package com.wrmsr.wava.yen.parser;

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.yen.types.NamedFunctionType;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.yen.expression.YBinary;
import com.wrmsr.wava.yen.expression.YBlock;
import com.wrmsr.wava.yen.expression.YCallIndirect;
import com.wrmsr.wava.yen.expression.YConst;
import com.wrmsr.wava.yen.expression.YExpression;
import com.wrmsr.wava.yen.expression.YGetLocal;
import com.wrmsr.wava.yen.expression.YHost;
import com.wrmsr.wava.yen.expression.YIf;
import com.wrmsr.wava.yen.expression.YReturn;
import com.wrmsr.wava.yen.expression.YSetLocal;
import com.wrmsr.wava.yen.expression.YUnary;
import com.wrmsr.wava.yen.global.YFunction;
import com.wrmsr.wava.yen.global.ModuleBuilder;
import com.wrmsr.wava.core.literal.Literal;
import com.wrmsr.wava.core.op.BinaryOp;
import com.wrmsr.wava.core.op.HostOp;
import com.wrmsr.wava.core.op.UnaryOp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

public class Builder
{
    private final ModuleBuilder builder;

    public Builder(ModuleBuilder builder)
    {
        this.builder = requireNonNull(builder);
    }

    // make* functions, create nodes

    public YFunction makeFunction(Name name, List<NameType> params, Type resultType, List<NameType> vars)
    {
        return makeFunction(name, params, resultType, vars, null);
    }

    public YFunction makeFunction(Name name, List<NameType> params, Type result, List<NameType> vars, YExpression body)
    {
        List<Type> params_ = new ArrayList<>();
        List<Type> vars_ = new ArrayList<>();   // params plus vars
//        Name type; // if null, it is implicit in params and result
//        Expression body;
        List<Name> localNames = new ArrayList<>();
        Map<Name, Index> localIndices = new HashMap<>();

        for (NameType param : params) {
            params_.add(param.getType());
            localIndices.put(param.getName(), Index.of(localNames.size()));
            localNames.add(param.getName());
        }
        for (NameType var : vars) {
            vars_.add(var.getType());
            localIndices.put(var.getName(), Index.of(localNames.size()));
            localNames.add(var.getName());
        }

        return new YFunction(Optional.of(name), result, params_, vars_, Optional.empty(), Optional.ofNullable(body), localNames, localIndices);
    }

    // Nop TODO: add all the rest
    public YBlock makeBlock()
    {
        return new YBlock(Optional.empty(), ImmutableList.of());
    }

    public YBlock makeBlock(YExpression first)
    {
        return new YBlock(Optional.empty(), ImmutableList.of(first));
    }

    public YIf makeIf(YExpression condition, YExpression ifTrue)
    {
        return new YIf(condition, ifTrue, Optional.empty());
    }

    public YIf makeIf(YExpression condition, YExpression ifTrue, YExpression ifFalse)
    {
        return new YIf(condition, ifTrue, Optional.of(ifFalse));
    }

    // Loop
    // Break
    // Switch
    // CallBase
    // Call
    // CallImport
    // Also do a version which takes a sig?
    public YCallIndirect makeCallIndirect(NamedFunctionType type, YExpression target, List<YExpression> args)
    {
        return new YCallIndirect(type, target, args);
    }

    // FunctionType
    public YGetLocal makeGetLocal(Index index, Type type)
    {
        return new YGetLocal(index, type);
    }

    public YSetLocal makeSetLocal(Index index, YExpression value)
    {
        return new YSetLocal(index, value, value.getType());
    }

    // Load
//    public YStore makeStore(int bytes, int offset, int align, YExpression ptr, YExpression value)
//    {
//        return new YStore(bytes, offset, align, ptr, value);
//    }

    public YConst makeConst(Literal value)
    {
        return new YConst(value);
    }

    public YUnary makeUnary(UnaryOp op, YExpression value)
    {
        return makeUnary(op, value, Type.NONE);
    }

    public YUnary makeUnary(UnaryOp op, YExpression value, Type type)
    {
        if (type == Type.NONE) {
            switch (op) {
                case Clz:
                case Ctz:
                case Popcnt:
                case Neg:
                case Abs:
                case Ceil:
                case Floor:
                case Trunc:
                case Nearest:
                case Sqrt:
                    type = value.getType();
                    break;
                case EqZ:
                    type = Type.I32;
                    break;
                case ExtendSInt32:
                case ExtendUInt32:
                    type = Type.I64;
                    break;
                case WrapInt64:
                    type = Type.I32;
                    break;
                case PromoteFloat32:
                    type = Type.F64;
                    break;
                case DemoteFloat64:
                    type = Type.F32;
                    break;
                case TruncSFloat32:
                case TruncUFloat32:
                case TruncSFloat64:
                case TruncUFloat64:
                case ReinterpretFloat:
                case ConvertSInt32:
                case ConvertUInt32:
                case ConvertSInt64:
                case ConvertUInt64:
                case ReinterpretInt:
                    throw new IllegalStateException();
                default:
                    throw new IllegalStateException();
            }
        }
        return new YUnary(op, value, type);
    }

    public YBinary makeBinary(BinaryOp op, YExpression left, YExpression right)
    {
        return new YBinary(op, left, right);
    }

    // Select
    public YReturn makeReturn(YExpression value)
    {
        return new YReturn(Optional.of(value));
    }

    public YHost makeHost(HostOp op, Name nameOperand, List<YExpression> operands)
    {
        return new YHost(op, Optional.of(nameOperand), operands);
    }

    // Unreachable

    // Additional utility functions for building on top of nodes

//    static Index addParam(Function func, Name name, Type type) {
//        // only ok to add a param if no vars, otherwise indices are invalidated
//        assert(func->localIndices.size() == func->params.size());
//        func->params.push_back(type);
//        Index index = func->localNames.size();
//        func->localIndices[name] = index;
//        func->localNames.push_back(name);
//        return index;
//    }

//    static Index addVar(Function func, Name name, Type type) {
//        // always ok to add a var, it does not affect other indices
//        assert(func->localIndices.size() == func->params.size() + func->vars.size());
//        func->vars.emplace_back(type);
//        Index index = func->localNames.size();
//        func->localIndices[name] = index;
//        func->localNames.push_back(name);
//        return index;
//    }

//    static void clearLocals(Function func) {
//        func->params.clear();
//        func->vars.clear();
//        func->localNames.clear();
//        func->localIndices.clear();
//    }

    // ensure a node is a block, if it isn't already
    public YBlock blockify(YExpression any)
    {
        if (any instanceof YBlock) {
            return (YBlock) any;
        }
        return makeBlock(any);
    }
}
