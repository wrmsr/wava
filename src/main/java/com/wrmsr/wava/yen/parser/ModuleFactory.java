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
import com.google.common.collect.Iterables;
import com.google.common.primitives.UnsignedBytes;
import com.wrmsr.wava.core.literal.F32Literal;
import com.wrmsr.wava.core.literal.F64Literal;
import com.wrmsr.wava.core.literal.I32Literal;
import com.wrmsr.wava.core.literal.I64Literal;
import com.wrmsr.wava.core.literal.Literal;
import com.wrmsr.wava.core.op.BinaryOp;
import com.wrmsr.wava.core.op.HostOp;
import com.wrmsr.wava.core.op.UnaryOp;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
import com.wrmsr.wava.util.Cell;
import com.wrmsr.wava.yen.expression.YBinary;
import com.wrmsr.wava.yen.expression.YBlock;
import com.wrmsr.wava.yen.expression.YBreak;
import com.wrmsr.wava.yen.expression.YCallDirect;
import com.wrmsr.wava.yen.expression.YCallImport;
import com.wrmsr.wava.yen.expression.YCallIndirect;
import com.wrmsr.wava.yen.expression.YConst;
import com.wrmsr.wava.yen.expression.YExpression;
import com.wrmsr.wava.yen.expression.YGetLocal;
import com.wrmsr.wava.yen.expression.YHost;
import com.wrmsr.wava.yen.expression.YIf;
import com.wrmsr.wava.yen.expression.YLoad;
import com.wrmsr.wava.yen.expression.YLoop;
import com.wrmsr.wava.yen.expression.YNop;
import com.wrmsr.wava.yen.expression.YReturn;
import com.wrmsr.wava.yen.expression.YSelect;
import com.wrmsr.wava.yen.expression.YSetLocal;
import com.wrmsr.wava.yen.expression.YStore;
import com.wrmsr.wava.yen.expression.YSwitch;
import com.wrmsr.wava.yen.expression.YUnary;
import com.wrmsr.wava.yen.expression.YUnreachable;
import com.wrmsr.wava.yen.global.YExport;
import com.wrmsr.wava.yen.global.YFunction;
import com.wrmsr.wava.yen.global.YImport;
import com.wrmsr.wava.yen.global.YMemory;
import com.wrmsr.wava.yen.global.YModule;
import com.wrmsr.wava.yen.global.ModuleBuilder;
import com.wrmsr.wava.yen.parser.element.Element;
import com.wrmsr.wava.yen.parser.element.ListElement;
import com.wrmsr.wava.yen.parser.element.StringElement;
import com.wrmsr.wava.yen.types.NamedFunctionType;
import com.wrmsr.wava.yen.types.Sig;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;
import java.util.stream.IntStream;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static com.wrmsr.wava.yen.parser.Strings.BLOCK;
import static com.wrmsr.wava.yen.parser.Strings.BR_IF;
import static com.wrmsr.wava.yen.parser.Strings.CALL;
import static com.wrmsr.wava.yen.parser.Strings.CALL_IMPORT;
import static com.wrmsr.wava.yen.parser.Strings.CALL_INDIRECT;
import static com.wrmsr.wava.yen.parser.Strings.ELSE;
import static com.wrmsr.wava.yen.parser.Strings.EXPORT;
import static com.wrmsr.wava.yen.parser.Strings.FUNC;
import static com.wrmsr.wava.yen.parser.Strings.IMPORT;
import static com.wrmsr.wava.yen.parser.Strings.INFINITY_;
import static com.wrmsr.wava.yen.parser.Strings.LOCAL;
import static com.wrmsr.wava.yen.parser.Strings.MEMORY;
import static com.wrmsr.wava.yen.parser.Strings.NAN_;
import static com.wrmsr.wava.yen.parser.Strings.NEG_INFINITY;
import static com.wrmsr.wava.yen.parser.Strings.NEG_NAN;
import static com.wrmsr.wava.yen.parser.Strings.PARAM;
import static com.wrmsr.wava.yen.parser.Strings.RESULT;
import static com.wrmsr.wava.yen.parser.Strings.SEGMENT;
import static com.wrmsr.wava.yen.parser.Strings.START;
import static com.wrmsr.wava.yen.parser.Strings.TABLE;
import static com.wrmsr.wava.yen.parser.Strings.THEN;
import static com.wrmsr.wava.yen.parser.Strings.TYPE;
import static java.util.Objects.requireNonNull;

public class ModuleFactory
{
    private final ListElement root;

    private final ModuleBuilder builder;
    private final List<Name> functionNames;
    private int functionCounter;
    private int importCounter;
    private final Map<Name, Type> functionTypes; // we need to know function return types before we parse their contents

    public ModuleFactory(Element root)
    {
        checkArgument(root instanceof ListElement);
        this.root = requireNonNull((ListElement) root);
        builder = new ModuleBuilder();
        functionNames = new ArrayList<>();
        functionTypes = new HashMap<>();
    }

    public YModule create()
    {
        functionCounter = 0;
        for (Element e : Iterables.skip(root, 1)) {
            ListElement le = (ListElement) e;
            preParseFunctionType(le);
            preParseImports(le);
        }
        functionCounter = 0;
        for (Element e : Iterables.skip(root, 1)) {
            ListElement le = (ListElement) e;
            parseModuleElement(le);
        }
        return builder.build();
    }

    private void preParseFunctionType(ListElement s)
    {
        String id = s.get(0).string();
        if (id.equals(TYPE)) {
            parseFunctionType(s);
            return;
        }
        if (!id.equals(FUNC)) {
            return;
        }
        int i = 1;
        Name name;
        if (s.get(i) instanceof StringElement) {
            name = Name.of(s.get(i).string());
            i++;
        }
        else {
            // unnamed, use an index
            name = Name.of(functionCounter);
        }
        functionNames.add(name);
        functionCounter++;
        for (; i < s.size(); i++) {
            ListElement curr = (ListElement) s.get(i);
            String id_ = curr.get(0).string();
            if (id_.equals(RESULT)) {
                functionTypes.put(name, Type.of(curr.get(1).string()));
                return;
            }
            else if (id_.equals(TYPE)) {
                Name typeName = Name.of(curr.get(1).string());
                if (!builder.checkFunctionType(typeName).isPresent()) {
                    throw new IllegalStateException();
                }
                NamedFunctionType type = builder.getFunctionType(typeName);
                functionTypes.put(name, type.getResult());
                return;
            }
        }
        functionTypes.put(name, Type.NONE);
    }

    private void preParseImports(ListElement curr)
    {
        String id = curr.get(0).string();
        if (id.equals(IMPORT)) {
            parseImport(curr);
        }
    }

    private void parseImport(ListElement s)
    {
        Name name;
        Name module;
        Name base; // name = module.base
        int i = 1;
        if (s.size() > 3 && s.get(3) instanceof StringElement) {
            name = Name.of(s.get(i++).string());
        }
        else {
            name = Name.of(importCounter);
        }
        importCounter++;
        module = Name.of(s.get(i++).string());
        if (!(s.get(i) instanceof StringElement)) {
            throw new IllegalStateException();
        }
        base = Name.of(s.get(i++).string());

        /*
        FunctionType type;
        if (s.size() > i) {
          Element& params = *s[i];
          IString id = params[0]->str();
          if (id == PARAM) {
            for (size_t i = 1; i < params.size(); i++) {
              type.params.push_back(stringToWasmType(params[i]->str()));
            }
          } else if (id == RESULT) {
            type.result = stringToWasmType(params[1]->str());
          } else if (id == TYPE) {
            IString name = params[1]->str();
            if (!wasm.checkFunctionType(name)) onError();
            type = *wasm.getFunctionType(name);
          } else {
            onError();
          }
          if (s.size() > i+1) {
            Element& result = *s[i+1];
            assert(result[0]->str() == RESULT);
            type.result = stringToWasmType(result[1]->str());
          }
        }
        */

        // FIXME ew
        NamedFunctionType type = new NamedFunctionType(Optional.empty(), Type.NONE, ImmutableList.of());
        if (s.size() > i) {
            ListElement params = (ListElement) s.get(i);
            String id = params.get(0).string();
            if (id.equals(PARAM)) {
                ImmutableList.Builder<Type> b = ImmutableList.builder();
                b.addAll(type.getParams());
                for (int j = 1; j < params.size(); j++) {
                    b.add(Type.of(params.get(j).string()));
                }
                type = new NamedFunctionType(type.getName(), type.getResult(), b.build());
            }
            else if (id.equals(RESULT)) {
                type = new NamedFunctionType(type.getName(), Type.of(params.get(1).string()), type.getParams());
            }
            else if (id.equals(TYPE)) {
                Name name_ = Name.of(params.get(1).string());
                if (!builder.checkFunctionType(name_).isPresent()) {
                    throw new IllegalStateException();
                }
                type = builder.getFunctionType(name_);
            }
            else {
                throw new IllegalStateException();
            }
            if (s.size() > i + 1) {
                ListElement result = (ListElement) s.get(i + 1);
                checkState(result.get(0).string().equals(RESULT));
                type = new NamedFunctionType(type.getName(), Type.of(result.get(1).string()), type.getParams());
            }
        }

        type = builder.ensureFunctionType(Sig.of(type));
        YImport im = new YImport(Optional.of(name), module, base, type);
        builder.addImport(im);
    }

    private void parseFunctionType(ListElement s)
    {
        int i = 1;
        Optional<Name> name = Optional.empty();
        Element first = s.get(i);
        if (first instanceof StringElement) {
            name = Optional.of(Name.of(first.string()));
            i++;
        }
        Type result = Type.NONE;
        List<Type> params = new ArrayList<>();
        for (Element e : Iterables.skip(s.get(i).list(), 1)) {
            ListElement curr = (ListElement) e;
            String str = curr.get(0).string();
            if (str.equals(PARAM)) {
                for (int j = 1; j < curr.size(); j++) {
                    params.add(Type.of(curr.get(j).string()));
                }
            }
            else if (str.equals(RESULT)) {
                result = Type.of(curr.get(1).string());
            }
        }
        NamedFunctionType ft = new NamedFunctionType(name, result, params);
        builder.addFunctionType(ft);
    }

    private void parseModuleElement(ListElement curr)
    {
        String id = curr.get(0).string();
        switch (id) {
            case START:
                parseStart(curr);
                return;
            case FUNC:
                parseFunction(curr);
                return;
            case MEMORY:
                parseMemory(curr);
                return;
            case EXPORT:
                parseExport(curr);
                return;
            case IMPORT:
                return; // already done
            case TABLE:
                parseTable(curr);
                return;
            case TYPE:
                return; // already done
            default:
                throw new IllegalStateException(id);
        }
    }

    // function parsing state
    @Nullable
    private YFunction currFunction; // FIXME prob FunctionBuilder

    private Map<Name, Type> currLocalTypes = new HashMap<>();
    private int localIndex; // params and vars
    private int otherIndex;
    private Stack<Name> labelStack = new Stack<>();

    private Name getPrefixedName(String prefix)
    {
        return Name.of(prefix + Integer.toString(otherIndex++));
    }

    private Name getFunctionName(StringElement s)
    {
        if (s.isDollared()) {
            return Name.of(s.getString());
        }
        else {
            // index
            int offset = Integer.parseInt(s.getString());
            if (offset >= functionNames.size()) {
                throw new IllegalStateException();
            }
            return functionNames.get(offset);
        }
    }

    private void parseStart(ListElement s)
    {
        builder.addStart(getFunctionName((StringElement) s.get(1)));
    }

    private void parseFunction(ListElement s)
    {
        int i = 1;
        Name name;
        if (s.get(i) instanceof StringElement) {
            name = Name.of(s.get(i).string());
            i++;
        }
        else {
            // unnamed, use an index
            name = Name.of(functionCounter);
        }

        functionCounter++;
        YExpression body = null;
        localIndex = 0;
        otherIndex = 0;
        final List<NameType> typeParams = new ArrayList<>(); // we may have both params and a type. store the type info here
        final List<NameType> params = new ArrayList<>();
        final List<NameType> vars = new ArrayList<>();
        final Cell<Type> result = Cell.of(Type.NONE);
        Optional<Name> type = Optional.empty();
        YBlock autoYBlock = null; // we may need to add a block for the very top level

        Runnable makeFunction = () -> {
            currFunction = new Builder(builder).makeFunction(name, params, result.get(), vars);
            // result.set(Type.NONE); // FIXME ??
            params.clear();
            vars.clear();
        };

        for (; i < s.size(); i++) {
            ListElement curr = (ListElement) s.get(i);
            String id = curr.get(0).string();
            if (id.equals(PARAM) || id.equals(LOCAL)) {
                int j = 1;
                while (j < curr.size()) {
                    Name name_;
                    Type type_ = Type.NONE;
                    if (!((StringElement) curr.get(j)).isDollared()) { // dollared input symbols cannot be types
                        type_ = Type.of(curr.get(j).string(), true);
                    }
                    if (type_ != Type.NONE) {
                        // a type, so an unnamed parameter
                        name_ = Name.of(localIndex);
                    }
                    else {
                        name_ = Name.of(curr.get(j).string());
                        type_ = Type.of(curr.get(j + 1).string());
                        j++;
                    }
                    j++;
                    if (id.equals(PARAM)) {
                        params.add(new NameType(name_, type_));
                    }
                    else {
                        vars.add(new NameType(name_, type_));
                    }
                    localIndex++;
                    currLocalTypes.put(name_, type_);
                }
            }
            else if (id.equals(RESULT)) {
                result.set(Type.of(curr.get(1).string()));
            }
            else if (id.equals(TYPE)) {
                Name name_ = Name.of(curr.get(1).string());
                type = Optional.of(name_);
                if (!builder.checkFunctionType(name_).isPresent()) {
                    throw new IllegalStateException();
                }
                NamedFunctionType type_ = builder.getFunctionType(name_);
                result.set(type_.getResult());
                for (int j = 0; j < type_.getParams().size(); j++) {
                    Name name__ = Name.of(j);
                    Type currType = type_.getParams().get(j);
                    typeParams.add(new NameType(name__, currType));
                    currLocalTypes.put(name__, currType);
                }
            }
            else {
                // body
                if (typeParams.size() > 0 && params.size() == 0) {
                    params.clear();
                    params.addAll(typeParams);
                }
                if (currFunction == null) {
                    makeFunction.run();
                }
                YExpression ex = parseExpression(curr);
                if (body == null) {
                    body = ex;
                }
                else {
                    if (autoYBlock == null) {
                        autoYBlock = new YBlock(Optional.empty(), ImmutableList.of(body));
                    }
                    autoYBlock = new YBlock(autoYBlock.getLabel(), ImmutableList.<YExpression>builder().addAll(autoYBlock.getList()).add(ex).build()); // FIXME lol
                    body = autoYBlock;
                }
            }
        }
        if (currFunction == null) {
            makeFunction.run();
            body = new YNop();
        }
        checkState(currFunction.getResult().equals(result.get()));
        currFunction = new YFunction(
                currFunction.getName(),
                currFunction.getResult(),
                currFunction.getParams(),
                currFunction.getVars(),
                type,
                Optional.of(body),
                currFunction.getLocalNames(),
                currFunction.getLocalIndices());

        builder.addFunction(currFunction);
        currLocalTypes.clear();
        labelStack.clear();
        currFunction = null;
    }

    public static final class IllegalExpressionException
            extends RuntimeException
    {
        private final String op;

        public IllegalExpressionException(String op)
        {
            this.op = op;
        }

        public IllegalExpressionException(char[] op)
        {
            this.op = new String(op);
        }

        public String getOp()
        {
            return op;
        }
    }

    private static final String INSTR_PADDING = com.google.common.base.Strings.repeat("\0", 15);

    private YExpression parseExpression(Element s)
    {
        String id = s.get(0).string();
        String str = id;
        int dot = str.indexOf('.');
        if (dot >= 0) {
            // type.operation (e.g. i32.add)k
            Type type = Type.of(str, false, true);
            // Local copy to index into op without bounds checking.
            char[] op = (str.substring(dot + 1) + INSTR_PADDING).toCharArray();
            switch (op[0]) {
                case 'a': {
                    if (op[1] == 'b') {
                        return makeUnary(s, UnaryOp.Abs, type);
                    }
                    if (op[1] == 'd') {
                        return makeBinary(s, BinaryOp.Add, type);
                    }
                    if (op[1] == 'n') {
                        return makeBinary(s, BinaryOp.And, type);
                    }
                    throw new IllegalExpressionException(op);
                }
                case 'c': {
                    if (op[1] == 'e') {
                        return makeUnary(s, UnaryOp.Ceil, type);
                    }
                    if (op[1] == 'l') {
                        return makeUnary(s, UnaryOp.Clz, type);
                    }
                    if (op[1] == 'o') {
                        if (op[2] == 'p') {
                            return makeBinary(s, BinaryOp.CopySign, type);
                        }
                        if (op[2] == 'n') {
                            if (op[3] == 'v') {
                                if (op[8] == 's') {
                                    return makeUnary(s, op[11] == '3' ? UnaryOp.ConvertSInt32 : UnaryOp.ConvertSInt64, type);
                                }
                                if (op[8] == 'u') {
                                    return makeUnary(s, op[11] == '3' ? UnaryOp.ConvertUInt32 : UnaryOp.ConvertUInt64, type);
                                }
                            }
                            if (op[3] == 's') {
                                return makeConst(s, type);
                            }
                        }
                    }
                    if (op[1] == 't') {
                        return makeUnary(s, UnaryOp.Ctz, type);
                    }
                    throw new IllegalExpressionException(op);
                }
                case 'd': {
                    if (op[1] == 'i') {
                        if (op[3] == '_') {
                            return makeBinary(s, op[4] == 'u' ? BinaryOp.DivU : BinaryOp.DivS, type);
                        }
                        if (op[3] == 0) {
                            return makeBinary(s, BinaryOp.Div, type);
                        }
                    }
                    if (op[1] == 'e') {
                        return makeUnary(s, UnaryOp.DemoteFloat64, type);
                    }
                    throw new IllegalExpressionException(op);
                }
                case 'e': {
                    if (op[1] == 'q') {
                        if (op[2] == 0) {
                            return makeBinary(s, BinaryOp.Eq, type);
                        }
                        if (op[2] == 'z') {
                            return makeUnary(s, UnaryOp.EqZ, Type.I32);
                        }
                    }
                    if (op[1] == 'x') {
                        return makeUnary(s, op[7] == 'u' ? UnaryOp.ExtendUInt32 : UnaryOp.ExtendSInt32, type);
                    }
                    throw new IllegalExpressionException(op);
                }
                case 'f': {
                    if (op[1] == 'l') {
                        return makeUnary(s, UnaryOp.Floor, type);
                    }
                    throw new IllegalExpressionException(op);
                }
                case 'g': {
                    if (op[1] == 't') {
                        if (op[2] == '_') {
                            return makeBinary(s, op[3] == 'u' ? BinaryOp.GtU : BinaryOp.GtS, type);
                        }
                        if (op[2] == 0) {
                            return makeBinary(s, BinaryOp.Gt, type);
                        }
                    }
                    if (op[1] == 'e') {
                        if (op[2] == '_') {
                            return makeBinary(s, op[3] == 'u' ? BinaryOp.GeU : BinaryOp.GeS, type);
                        }
                        if (op[2] == 0) {
                            return makeBinary(s, BinaryOp.Ge, type);
                        }
                    }
                    throw new IllegalExpressionException(op);
                }
                case 'l': {
                    if (op[1] == 't') {
                        if (op[2] == '_') {
                            return makeBinary(s, op[3] == 'u' ? BinaryOp.LtU : BinaryOp.LtS, type);
                        }
                        if (op[2] == 0) {
                            return makeBinary(s, BinaryOp.Lt, type);
                        }
                    }
                    if (op[1] == 'e') {
                        if (op[2] == '_') {
                            return makeBinary(s, op[3] == 'u' ? BinaryOp.LeU : BinaryOp.LeS, type);
                        }
                        if (op[2] == 0) {
                            return makeBinary(s, BinaryOp.Le, type);
                        }
                    }
                    if (op[1] == 'o') {
                        return makeLoad(s, type);
                    }
                    throw new IllegalExpressionException(op);
                }
                case 'm': {
                    if (op[1] == 'i') {
                        return makeBinary(s, BinaryOp.Min, type);
                    }
                    if (op[1] == 'a') {
                        return makeBinary(s, BinaryOp.Max, type);
                    }
                    if (op[1] == 'u') {
                        return makeBinary(s, BinaryOp.Mul, type);
                    }
                    throw new IllegalExpressionException(op);
                }
                case 'n': {
                    if (op[1] == 'e') {
                        if (op[2] == 0) {
                            return makeBinary(s, BinaryOp.Ne, type);
                        }
                        if (op[2] == 'a') {
                            return makeUnary(s, UnaryOp.Nearest, type);
                        }
                        if (op[2] == 'g') {
                            return makeUnary(s, UnaryOp.Neg, type);
                        }
                    }
                    throw new IllegalExpressionException(op);
                }
                case 'o': {
                    if (op[1] == 'r') {
                        return makeBinary(s, BinaryOp.Or, type);
                    }
                    throw new IllegalExpressionException(op);
                }
                case 'p': {
                    if (op[1] == 'r') {
                        return makeUnary(s, UnaryOp.PromoteFloat32, type);
                    }
                    if (op[1] == 'o') {
                        return makeUnary(s, UnaryOp.Popcnt, type);
                    }
                    throw new IllegalExpressionException(op);
                }
                case 'r': {
                    if (op[1] == 'e') {
                        if (op[2] == 'm') {
                            return makeBinary(s, op[4] == 'u' ? BinaryOp.RemU : BinaryOp.RemS, type);
                        }
                        if (op[2] == 'i') {
                            return makeUnary(s, type.isFloat() ? UnaryOp.ReinterpretInt : UnaryOp.ReinterpretFloat, type);
                        }
                    }
                    if (op[1] == 'o' && op[2] == 't') {
                        return makeBinary(s, op[3] == 'l' ? BinaryOp.RotL : BinaryOp.RotR, type);
                    }
                    throw new IllegalExpressionException(op);
                }
                case 's': {
                    if (op[1] == 'h') {
                        if (op[2] == 'l') {
                            return makeBinary(s, BinaryOp.Shl, type);
                        }
                        return makeBinary(s, op[4] == 'u' ? BinaryOp.ShrU : BinaryOp.ShrS, type);
                    }
                    if (op[1] == 'u') {
                        return makeBinary(s, BinaryOp.Sub, type);
                    }
                    if (op[1] == 'q') {
                        return makeUnary(s, UnaryOp.Sqrt, type);
                    }
                    if (op[1] == 't') {
                        return makeStore(s, type);
                    }
                    throw new IllegalExpressionException(op);
                }
                case 't': {
                    if (op[1] == 'r') {
                        if (op[6] == 's') {
                            return makeUnary(s, op[9] == '3' ? UnaryOp.TruncSFloat32 : UnaryOp.TruncSFloat64, type);
                        }
                        if (op[6] == 'u') {
                            return makeUnary(s, op[9] == '3' ? UnaryOp.TruncUFloat32 : UnaryOp.TruncUFloat64, type);
                        }
                        if (op[2] == 'u') {
                            return makeUnary(s, UnaryOp.Trunc, type);
                        }
                    }
                    throw new IllegalExpressionException(op);
                }
                case 'w': {
                    if (op[1] == 'r') {
                        return makeUnary(s, UnaryOp.WrapInt64, type);
                    }
                    throw new IllegalExpressionException(op);
                }
                case 'x': {
                    if (op[1] == 'o') {
                        return makeBinary(s, BinaryOp.Xor, type);
                    }
                    throw new IllegalExpressionException(op);
                }
                default:
                    throw new IllegalExpressionException(op);
            }
        }
        else {
            // other expression
            char[] str_ = (str + "\0").toCharArray();
            switch (str_[0]) {
                case 'b': {
                    if (str_[1] == 'l') {
                        return makeBlock(s);
                    }
                    if (str_[1] == 'r') {
                        if (str_[2] == '_' && str_[3] == 't') {
                            return makeBreakTable(s);
                        }
                        return makeBreak(s);
                    }
                    throw new IllegalExpressionException(str);
                }
                case 'c': {
                    if (str_[1] == 'a') {
                        if (id.equals(CALL)) {
                            return makeCall(s);
                        }
                        if (id.equals(CALL_IMPORT)) {
                            return makeCallImport(s);
                        }
                        if (id.equals(CALL_INDIRECT)) {
                            return makeCallIndirect(s);
                        }
                    }
                    else if (str_[1] == 'u') {
                        return makeHost(s, HostOp.CurrentMemory);
                    }
                    throw new IllegalExpressionException(str);
                }
                case 'e': {
                    if (str_[1] == 'l') {
                        return makeThenOrElse(s);
                    }
                    throw new IllegalExpressionException(str);
                }
                case 'g': {
                    if (str_[1] == 'e') {
                        return makeGetLocal(s);
                    }
                    if (str_[1] == 'r') {
                        return makeHost(s, HostOp.GrowMemory);
                    }
                    throw new IllegalExpressionException(str);
                }
                case 'h': {
                    if (str_[1] == 'a') {
                        return makeHost(s, HostOp.HasFeature);
                    }
                    throw new IllegalExpressionException(str);
                }
                case 'i': {
                    if (str_[1] == 'f') {
                        return makeIf(s);
                    }
                    throw new IllegalExpressionException(str);
                }
                case 'l': {
                    if (str_[1] == 'o') {
                        return makeLoop(s);
                    }
                    throw new IllegalExpressionException(str);
                }
                case 'n': {
                    if (str_[1] == 'o') {
                        return new YNop();
                    }
                    throw new IllegalExpressionException(str);
                }
                case 'p': {
                    if (str_[1] == 'a') {
                        return makeHost(s, HostOp.PageSize);
                    }
                    throw new IllegalExpressionException(str);
                }
                case 's': {
                    if (str_[1] == 'e' && str_[2] == 't') {
                        return makeSetLocal(s);
                    }
                    if (str_[1] == 'e' && str_[2] == 'l') {
                        return makeSelect(s);
                    }
                    throw new IllegalExpressionException(str);
                }
                case 'r': {
                    if (str_[1] == 'e') {
                        return makeReturn(s);
                    }
                    throw new IllegalExpressionException(str);
                }
                case 't': {
                    if (str_[1] == 'h') {
                        return makeThenOrElse(s);
                    }
                    throw new IllegalExpressionException(str);
                }
                case 'u': {
                    if (str_[1] == 'n') {
                        return new YUnreachable();
                    }
                    throw new IllegalExpressionException(str);
                }
                default:
                    throw new IllegalExpressionException(str);
            }
        }
    }

    private YExpression makeBinary(Element s, BinaryOp op, Type type)
    {
        return new YBinary(
                op,
                parseExpression(s.get(1)),
                parseExpression(s.get(2)));
    }

    private YExpression makeUnary(Element s, UnaryOp op, Type type)
    {
        return new YUnary(
                op,
                parseExpression(s.get(1)),
                type);
    }

    private YExpression makeSelect(Element s)
    {
        return new YSelect(
                parseExpression(s.get(1)),
                parseExpression(s.get(2)),
                parseExpression(s.get(3)));
    }

    private List<YExpression> parseCallOperands(Element s, int i)
    {
        return IntStream.range(i, s.size()).boxed().map(i_ -> parseExpression(s.get(i_))).collect(toImmutableList());
    }

    private YExpression makeHost(Element s, HostOp op)
    {
        if (op == HostOp.HasFeature) {
            return new YHost(op, Optional.of(Name.of(s.get(1).string())), ImmutableList.of());
        }
        else {
            return new YHost(op, Optional.empty(), parseCallOperands(s, 1));
        }
    }

    private Index getLocalIndex(Element s)
    {
        if (s.dollared()) {
            return currFunction.getLocalIndex(Name.of(s.string()));
        }
        // this is a numeric index
        return Index.of(Integer.parseInt(s.string()));
    }

    private YExpression makeGetLocal(Element s)
    {
        Index index = getLocalIndex(s.get(1));
        Type type = currFunction.getLocalType(index);
        return new YGetLocal(index, type);
    }

    private YExpression makeSetLocal(Element s)
    {
        Index index = getLocalIndex(s.get(1));
        YExpression value = parseExpression(s.get(2));
        Type type = currFunction.getLocalType(index);
        return new YSetLocal(index, value, type);
    }

    private static final class MakeBlockItem
    {
        private Element element;
        private YBlock YBlock;

        public MakeBlockItem(Element element, YBlock YBlock)
        {
            this.element = element;
            this.YBlock = YBlock;
        }
    }

    private YExpression makeBlock(Element s)
    {
        // special-case Block, because Block nesting (in their first element) can be incredibly deep
        YBlock curr = new YBlock(Optional.empty(), ImmutableList.of());
        Element sp = s;
        Stack<MakeBlockItem> stack = new Stack<>();
        while (true) {
            stack.push(new MakeBlockItem(sp, curr));
            Element s_ = sp;
            int i = 1;
            Name name;
            if (i < s_.size() && s_.get(i).isString()) {
                name = Name.of(s_.get(i).string());
                i++;
            }
            else {
                name = getPrefixedName("block");
            }
            stack.peek().YBlock = stack.peek().YBlock.relabel(name);
            labelStack.push(name);
            if (i >= s_.size()) {
                break; // labeled empty block
            }
            Element first = s_.get(i);
            if (first.get(0).string().equals(BLOCK)) {
                // recurse
                curr = new YBlock(Optional.empty(), ImmutableList.of());
                sp = first;
                continue;
            }
            break;
        }

        // we now have a stack of Blocks, with their labels, but no contents yet
        for (int t = stack.size() - 1; t >= 0; t--) {
            MakeBlockItem item = stack.get(t);
            Element sp_ = item.element;
            // Block curr = stack.get(t).block;
            Element s_ = sp_; // really yall
            int i = 1;
            if (i < s_.size()) {
                if (s_.get(i).isString()) {
                    i++;
                }
                if (t < stack.size() - 1) {
                    // first child is one of our recursions
                    item.YBlock = new YBlock(item.YBlock.getLabel(), ImmutableList.<YExpression>builder().addAll(item.YBlock.getList()).add(stack.get(t + 1).YBlock).build());
                    i++;
                }
                for (; i < s_.size(); i++) {
                    item.YBlock = new YBlock(item.YBlock.getLabel(), ImmutableList.<YExpression>builder().addAll(item.YBlock.getList()).add(parseExpression(s_.get(i))).build());
                }
            }
            checkState(labelStack.peek().equals(item.YBlock.getLabel().get()));
            labelStack.pop();
        }

        return stack.get(0).YBlock;
    }

    // Similar to block, but the label is handled by the enclosing if (since there might not be a then or else, ick)
    private YExpression makeThenOrElse(Element s)
    {
        int i = 1;
        if (s.get(1).isString()) {
            i++;
        }
        List<YExpression> list = new ArrayList<>();
        for (; i < s.size(); i++) {
            list.add(parseExpression(s.get(i)));
        }
        return new YBlock(Optional.empty(), list);
    }

    private YExpression makeConst(Element s, Type type)
    {
        YExpression ret = parseConst(s.get(1).string(), type);
        if (ret == null) {
            throw new IllegalStateException();
        }
        return ret;
    }

    private YExpression makeLoad(Element s, Type type)
    {
        String str = s.get(0).string();
        int extra = str.indexOf('.') + 5; // after "type.load"
        int bytes = type.getSize();
        if (extra == str.length()) {
            // pass
        }
        else if (extra > str.length()) {
            throw new IllegalStateException();
        }
        else if (str.charAt(extra) == '8') {
            bytes = 1;
            extra++;
        }
        else if (str.charAt(extra) == '1') {
            checkState(str.charAt(extra + 1) == '6');
            bytes = 2;
            extra += 2;
        }
        else if (str.charAt(extra) == '3') {
            checkState(str.charAt(extra + 1) == '2');
            bytes = 4;
            extra += 2;
        }
        // signed_ = extra[0] && extra[1] == 's';
        boolean signed_ = extra < str.length() && str.charAt(extra + 1) == 's';
        int i = 1;
        int offset = 0;
        int align = bytes;
        while (!s.get(i).isList()) {
            String x = s.get(i).string();
            int str_ = 0;
            int eq = x.indexOf('=');
            checkState(eq >= 0);
            eq++;
            if (x.charAt(str_) == 'a') {
                align = Integer.parseInt(x.substring(eq));
            }
            else if (x.charAt(str_) == 'o') {
                long offsetL = Long.parseLong(x.substring(eq));
                // if (offset > std::numeric_limits < uint32_t >::max())
                //     onError();
                offset = (int) offsetL;
            }
            else {
                throw new IllegalStateException();
            }
            i++;
        }
        YExpression ptr = parseExpression(s.get(i));
        return new YLoad(type, bytes, signed_, offset, align, ptr);
    }

    private YExpression makeStore(Element s, Type type)
    {
        String str = s.get(0).string();
        int extra = str.indexOf('.') + 6; // after "type.store"
        int bytes = type.getSize();
        if (extra < str.length() && str.substring(extra).charAt(0) == '8') {
            bytes = 1;
            extra++;
        }
        else if (extra < str.length() && str.substring(extra).charAt(0) == '1') {
            assert (str.substring(extra).charAt(1) == '6');
            bytes = 2;
            extra += 2; // FIXME wtf
        }
        else if (extra < str.length() && str.substring(extra).charAt(0) == '3') {
            assert (str.substring(extra).charAt(1) == '2');
            bytes = 4;
            extra += 2;
        }
        int i = 1;
        int offset = 0;
        int align = bytes;
        while (!s.get(i).isList()) {
            String x = s.get(i).string();
            int eq = x.indexOf('=');
            assert (eq >= 0);
            eq++;
            if (x.charAt(0) == 'a') {
                align = Integer.parseInt(x.substring(eq));
            }
            else if (x.charAt(0) == 'o') {
                offset = (int) Long.parseLong(x.substring(eq));
            }
            else {
                throw new IllegalStateException();
            }
            i++;
        }
        YExpression ptr = parseExpression(s.get(i));
        YExpression value = parseExpression(s.get(i + 1));
        return new YStore(type, bytes, offset, align, ptr, value);
    }

    public static YExpression parseConst(String str, Type type)
    {
        Literal value;
        if (type.isFloat()) {
            if (str.equals(INFINITY_)) {
                switch (type) {
                    case F32:
                        value = Literal.of(Float.POSITIVE_INFINITY);
                        break;
                    case F64:
                        value = Literal.of(Double.POSITIVE_INFINITY);
                        break;
                    default:
                        return null;
                }
                //std::cerr << "make constant " << str << " ==> " << ret->value << '\n';
                return new YConst(value);
            }
            if (str.equals(NEG_INFINITY)) {
                switch (type) {
                    case F32:
                        value = Literal.of(Float.NEGATIVE_INFINITY);
                        break;
                    case F64:
                        value = Literal.of(Double.NEGATIVE_INFINITY);
                        break;
                    default:
                        return null;
                }
                //std::cerr << "make constant " << str << " ==> " << ret->value << '\n';
                return new YConst(value);
            }
            if (str.equals(NAN_)) {
                switch (type) {
                    case F32:
                        value = Literal.of(Float.NaN);
                        break;
                    case F64:
                        value = Literal.of(Double.NaN);
                        break;
                    default:
                        return null;
                }
                //std::cerr << "make constant " << str << " ==> " << ret->value << '\n';
                return new YConst(value);
            }
            boolean negative = str.charAt(0) == '-';
            int positive = negative ? 1 : 0;
            if (!negative) {
                if (str.charAt(positive) == '+') {
                    positive++;
                }
            }
            if (str.charAt(positive) == 'n' && str.charAt(positive + 1) == 'a' && str.charAt(positive + 2) == 'n') {
                int modifier = str.charAt(positive + 3) == ':' ? positive + 4 : -1;
                checkState(modifier != 0 ? str.charAt(positive + 4) == '0' && str.charAt(positive + 5) == 'x' : true);
                switch (type) {
                    case F32: {
                        int pattern;
                        if (modifier != 0) {
                            pattern = Integer.parseInt(str.substring(modifier + 2), 16);
                            pattern |= 0x7f800000;
                        }
                        else {
                            pattern = 0x7fc00000;
                        }
                        if (negative) {
                            pattern |= 0x80000000;
                        }
                        if (!Float.isNaN(Float.intBitsToFloat(pattern))) {
                            pattern |= 1;
                        }
                        value = new F32Literal(pattern);
                        break;
                    }
                    case F64: {
                        long pattern;
                        if (modifier > 0) {
                            pattern = Long.parseLong(str.substring(modifier + 2), 16);
                            pattern |= 0x7ff0000000000000L;
                        }
                        else {
                            pattern = 0x7ff8000000000000L;
                        }
                        if (negative) {
                            pattern |= 0x8000000000000000L;
                        }
                        if (!Double.isNaN(Double.longBitsToDouble(pattern))) {
                            pattern |= 1L;
                        }
                        value = new F64Literal(pattern);
                        break;
                    }
                    default:
                        return null;
                }
                //std::cerr << "make constant " << str << " ==> " << ret->value << '\n';
                return new YConst(value);
            }
            if (str.equals(NEG_NAN)) {
                switch (type) {
                    case F32:
                        value = new F32Literal(-Float.NaN); // std::nan (""))); // FIXME fuk
                        break;
                    case F64:
                        value = new F64Literal(-Double.NaN); // std::nan ("")));
                        break;
                    default:
                        return null;
                }
                //std::cerr << "make constant " << str << " ==> " << ret->value << '\n';
                return new YConst(value);
            }
        }
        switch (type) {
            case I32: {
                if ((str.length() > 3 && str.charAt(0) == '0' && str.charAt(1) == 'x') || (str.length() > 4 && str.charAt(0) == '-' && str.charAt(1) == '0' && str.charAt(2) == 'x')) {
                    boolean negative = str.charAt(0) == '-';
                    if (negative) {
                        str = str.substring(1);
                    }
                    int temp = Integer.parseInt(str, 16);
                    value = new I32Literal(negative ? -temp : temp);
                }
                else {
                    int temp = Integer.parseInt(str);
                    value = new I32Literal(temp);
                }
                break;
            }
            case I64: {
                if ((str.length() > 1 && str.charAt(0) == '0' && str.charAt(1) == 'x') || (str.charAt(0) == '-' && str.charAt(1) == '0' && str.charAt(2) == 'x')) {
                    boolean negative = str.charAt(0) == '-';
                    if (negative) {
                        str = str.substring(1);
                    }
                    long temp;
                    temp = Long.parseLong(str, 16);
                    value = new I64Literal(negative ? -temp : temp);
                }
                else {
                    long temp = Long.parseLong(str);
                    value = new I64Literal(temp);
                }
                break;
            }
            case F32: {
                value = new F32Literal(parseFloat(str));
                break;
            }
            case F64: {
                value = new F64Literal(parseDouble(str));
                break;
            }
            default:
                return null;
        }
        assert (value.getType() == type);
        //std::cerr << "make constant " << str << " ==> " << ret->value << '\n';
        return new YConst(value);
    }

    private YExpression makeIf(Element s)
    {
        YExpression condition = parseExpression(s.get(1));

        // ifTrue and ifFalse may get implicit blocks
        YExpression ifTrue = makeIfHandler("if-true", s.get(2));
        Optional<YExpression> ifFalse = Optional.empty();
        if (s.size() == 4) {
            ifFalse = Optional.of(makeIfHandler("if-else", s.get(3)));
        }
        return new YIf(condition, ifTrue, ifFalse);
    }

    private YExpression makeIfHandler(String title, Element s)
    {
        Name name = getPrefixedName(title);
        boolean explicitThenElse = false;
        if (s.get(0).string().equals(THEN) || s.get(0).string().equals(ELSE)) {
            explicitThenElse = true;
            if (s.get(1).dollared()) {
                name = Name.of(s.get(1).string());
            }
        }
        labelStack.push(name);
        YExpression ret = parseExpression(s); // ?
        labelStack.pop();
        if (explicitThenElse) {
            ret = ((YBlock) ret).relabel(name);
        }
        else {
            // add a block if we must
            if (BreakSeeker.has(ret, name)) {
                ret = new YBlock(Optional.of(name), ImmutableList.of(ret));
            }
        }
        return ret;
    }

    private YExpression makeMaybeBlock(Element s, int i)
    {
        return makeMaybeBlock(s, i, -1);
    }

    private YExpression makeMaybeBlock(Element s, int i, int stopAt)
    {
        if (s.size() == i + 1) {
            return parseExpression(s.get(i));
        }
        List<YExpression> list = new ArrayList<>();
        for (; i < s.size() && (stopAt < 0 || i < stopAt); i++) {
            list.add(parseExpression(s.get(i)));
        }
        // Note that we do not name these implicit/synthetic blocks. They
        // are the effects of syntactic sugar, and nothing can branch to
        // them anyhow.
        return new YBlock(Optional.empty(), list);
    }

    private YExpression makeLoop(Element s)
    {
        int i = 1;
        Name out;
        Name in;
        YExpression body;
        if (s.get(i).isString() && s.get(i + 1).isString()) { // out can only be named if both are
            out = Name.of(s.get(i).string());
            i++;
        }
        else {
            out = getPrefixedName("loop-out");
        }
        if (s.get(i).isString()) {
            in = Name.of(s.get(i).string());
            i++;
        }
        else {
            in = getPrefixedName("loop-in");
        }
        labelStack.push(out);
        labelStack.push(in);
        body = makeMaybeBlock(s, i);
        labelStack.pop();
        labelStack.pop();
        return new YLoop(out, in, body);
    }

    private YExpression makeCall(Element s)
    {
        Name target = Name.of(s.get(1).string());
        Type type = functionTypes.get(target);
        List<YExpression> operands = parseCallOperands(s, 2);
        return new YCallDirect(target, type, operands);
    }

    private YExpression makeCallImport(Element s)
    {
        Name target = Name.of(s.get(1).string());
        YImport import_ = builder.getImport(target);
        Type type = import_.getType().getResult();
        List<YExpression> operands = parseCallOperands(s, 2);
        return new YCallImport(target, type, operands);
    }

    private YExpression makeCallIndirect(Element s)
    {
        String type = s.get(1).string();
        NamedFunctionType fullType = builder.getFunctionType(Name.of(type));
        checkState(fullType != null);
        YExpression target = parseExpression(s.get(2));
        List<YExpression> operands = parseCallOperands(s, 3);
        return new YCallIndirect(fullType, target, operands);
    }

    private Name getLabel(Element s)
    {
        if (s.dollared()) {
            return Name.of(s.string());
        }
        else {
            int offset = Integer.parseInt(s.string());
            if (offset >= labelStack.size()) {
                return getPrefixedName("invalid");
            }
            // offset, break to nth outside label
            return labelStack.get(labelStack.size() - 1 - offset);
        }
    }

    private YExpression makeBreak(Element s)
    {
        int i = 1;
        Name name = getLabel(s.get(i));
        i++;
        if (i == s.size()) {
            return new YBreak(name, Optional.empty(), Optional.empty());
        }
        Optional<YExpression> value = Optional.empty();
        Optional<YExpression> condition = Optional.empty();
        if (s.get(0).string().equals(BR_IF)) {
            if (i + 1 < s.size()) {
                value = Optional.of(parseExpression(s.get(i)));
                i++;
            }
            condition = Optional.of(parseExpression(s.get(i)));
        }
        else {
            value = Optional.of(parseExpression(s.get(i)));
        }
        return new YBreak(name, value, condition);
    }

    private YExpression makeBreakTable(Element s)
    {
        int i = 1;
        List<Name> targets = new ArrayList<>();
        while (!s.get(i).isList()) {
            targets.add(getLabel(s.get(i++)));
        }
        Name default_ = targets.get(targets.size() - 1);
        targets.remove(targets.size() - 1);
        YExpression condition = parseExpression(s.get(i++));
        Optional<YExpression> value = Optional.empty();
        if (i < s.size()) {
            value = Optional.of(condition);
            condition = parseExpression(s.get(i++));
        }
        return new YSwitch(targets, default_, condition, value);
    }

    private YExpression makeReturn(Element s)
    {
        Optional<YExpression> value = Optional.empty();
        if (s.size() >= 2) {
            value = Optional.of(parseExpression(s.get(1)));
        }
        return new YReturn(value);
    }

    boolean hasMemory = false;

    private void parseMemory(Element s)
    {
        hasMemory = true;

        int max = -1;
        int initial = Integer.parseInt(s.get(1).string());
        if (s.size() == 2) {
            return;
        }
        int i = 2;
        if (s.get(i).isString()) {
            max = Integer.parseInt(s.get(i).string());
            i++;
        }
        YMemory origMemory = builder.getMemory();
        builder.setMemory(new YMemory(initial, max, origMemory.getSegments(), origMemory.getExportName()));

        while (i < s.size()) {
            Element curr = s.get(i);
            checkState(curr.get(0).string().equals(SEGMENT));

            byte[] input = curr.get(2).string().getBytes();
            int pos = 0;
            byte[] data = new byte[input.length]; // over-allocated, since escaping collapses, but whatever // lol not really cuz unicode
            int write = 0;
            while (true) {
                if (pos > input.length) {
                    throw new IllegalStateException();
                }
                if (pos == input.length) {
                    break;
                }
                if (input[pos + 0] == 0) {
                    // break;
                    throw new IllegalStateException();
                }
                if (input[pos + 0] == '\\') {
                    if (input[pos + 1] == '"') {
                        data[write++] = '"';
                        pos += 2;
                        continue;
                    }
                    else if (input[pos + 1] == '\'') {
                        data[write++] = '\'';
                        pos += 2;
                        continue;
                    }
                    else if (input[pos + 1] == '\\') {
                        data[write++] = '\\';
                        pos += 2;
                        continue;
                    }
                    else if (input[pos + 1] == 'n') {
                        data[write++] = '\n';
                        pos += 2;
                        continue;
                    }
                    else if (input[pos + 1] == 't') {
                        data[write++] = '\t';
                        pos += 2;
                        continue;
                    }
                    else {
                        data[write++] = UnsignedBytes.parseUnsignedByte(new String(new byte[] {input[pos + 1], input[pos + 2]}), 16);
                        pos += 3;
                        continue;
                    }
                }
                data[write++] = input[pos + 0];
                pos++;
            }

            byte[] compacted = new byte[write];
            System.arraycopy(data, 0, compacted, 0, write);
            YMemory.Segment segment = new YMemory.Segment(Integer.parseInt(curr.get(1).string()), compacted, write);
            builder.setMemory(builder.getMemory().withSegment(segment));
            i++;
        }
    }

    private void parseExport(Element s)
    {
        if (!s.get(2).dollared() && !Character.isDigit(s.get(2).string().charAt(0))) {
            checkState(s.get(2).string().equals(MEMORY));
            if (!hasMemory) {
                throw new IllegalStateException();
            }
            builder.setMemory(builder.getMemory().withExportName(Name.of(s.get(1).string())));
            return;
        }
        Name name = Name.of(s.get(1).string());
        Name value = Name.of(s.get(2).string());
        builder.addExport(new YExport(Optional.of(name), value));
    }

    private void parseImport(Element s)
    {
        Name name;
        Name module;
        Name base;
        NamedFunctionType type = new NamedFunctionType(Optional.empty(), Type.NONE, ImmutableList.of());
        int i = 1;
        if (s.size() > 3 && s.get(3).isString()) {
            name = Name.of(s.get(i++).string());
        }
        else {
            name = Name.of(importCounter);
        }
        importCounter++;
        module = Name.of(s.get(i++).string());
        if (!s.get(i).isString()) {
            throw new IllegalStateException();
        }
        base = Name.of(s.get(i++).string());
        if (s.size() > i) {
            Element params = s.get(i);
            String id = params.get(0).string();
            if (id.equals(PARAM)) {
                List<Type> paramTypes = new ArrayList<>();
                for (int i_ = 1; i_ < params.size(); i_++) {
                    paramTypes.add(Type.of(params.get(i_).string()));
                }
                type = new NamedFunctionType(type.getName(), type.getResult(), paramTypes);
            }
            else if (id == RESULT) {
                type = new NamedFunctionType(type.getName(), Type.of(params.get(1).string()), type.getParams());
            }
            else if (id == TYPE) {
                Name name_ = Name.of(params.get(1).string());
                if (!builder.checkFunctionType(name_).isPresent()) {
                    throw new IllegalStateException();
                }
                type = builder.getFunctionType(name_);
            }
            else {
                throw new IllegalStateException();
            }
            if (s.size() > i + 1) {
                Element result_ = s.get(i + 1);
                checkState(result_.get(0).string().equals(RESULT));
                type = new NamedFunctionType(type.getName(), Type.of(result_.get(1).string()), type.getParams());
            }
        }
        type = builder.ensureFunctionType(Sig.of(type));
        builder.addImport(new YImport(Optional.of(name), module, base, type));
    }

    private void parseTable(Element s)
    {
        for (int i = 1; i < s.size(); i++) {
            // FIXME lol
            builder.setTable(builder.getTable().with(getFunctionName((StringElement) s.get(i))));
        }
    }

    private void parseType(Element s)
    {
        int i = 1;
        Optional<Name> name = Optional.empty();
        if (s.get(i).isString()) {
            name = Optional.of(Name.of(s.get(i).string()));
            i++;
        }
        Element func = s.get(i);
        checkState(func.isList());
        List<Type> params = new ArrayList<>();
        Type result = Type.NONE;
        for (int i_ = 1; i_ < func.size(); i_++) {
            Element curr = func.get(i_);
            if (curr.get(0).string().equals(PARAM)) {
                for (int j = 1; j < curr.size(); j++) {
                    params.add(Type.of(curr.get(j).string()));
                }
            }
            else if (curr.get(0).string().equals(RESULT)) {
                result = Type.of(curr.get(1).string());
            }
        }
        builder.addFunctionType(new NamedFunctionType(name, result, params));
    }

    private static float parseFloat(String str)
    {
        switch (str.toLowerCase()) {
            case "infinity":
                return Float.POSITIVE_INFINITY;
            case "-infinity":
                return Float.NEGATIVE_INFINITY;
            default:
                return Float.parseFloat(str);
        }
    }

    private static double parseDouble(String str)
    {
        switch (str.toLowerCase()) {
            case "infinity":
                return Double.POSITIVE_INFINITY;
            case "-infinity":
                return Double.NEGATIVE_INFINITY;
            default:
                return Double.parseDouble(str);
        }
    }
}
