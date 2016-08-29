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
package com.wrmsr.wava.yen.interpreter;

import com.google.common.base.MoreObjects;
import com.wrmsr.wava.core.type.Index;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.type.Type;
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
import com.wrmsr.wava.yen.expression.visitor.YVisitor;
import com.wrmsr.wava.yen.global.YExport;
import com.wrmsr.wava.yen.global.YFunction;
import com.wrmsr.wava.yen.global.YMemory;
import com.wrmsr.wava.yen.global.YModule;
import com.wrmsr.wava.core.literal.Literal;
import com.wrmsr.wava.core.op.BinaryOp;
import com.wrmsr.wava.core.op.UnaryOp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;
import static com.wrmsr.wava.core.type.Type.F32;
import static com.wrmsr.wava.core.type.Type.F64;
import static com.wrmsr.wava.core.type.Type.I32;
import static com.wrmsr.wava.core.type.Type.I64;
import static com.wrmsr.wava.core.type.Type.NONE;
import static java.util.Objects.requireNonNull;

/*
ND88O888DDDDNNDODNNNDNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNMMMD8D
MND88OOO88DDDND8DNNDNNDNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNMMND
MND88OOO88D8DD8DDDNDDNNNNNNMMMMMMNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNMMNNDNDM
MMDDOOOO88D88DDNNDDDNNDDNNNMMNNDMNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNMMMNNMMDNNNNN
NMMD88O8O88O88D8DDDNNDD8ND8N$NNN8ZDNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNMMMMNNMMNNMDNN
MMNNDD888D88888DNDDDDDD8~I++=?==?II$ZNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNONMMNMMMN
NNNNDDD8DDDD8DDDDNDD888D8?7$++?++???78NNMMMMMMNMMMMMMMMMMMMMMMMMMMMMMNMMMMNNNNMN
NMNDD8DDDDDDDDNDD88888OO++7I+?I7?$=I?I$NNNMMMMNNMMMMMMMMMMMMMMMMMMMMNMMOMDNNDNMN
MNNDDDDDD8DDD8DD88Z8DD8ZI+?=++?$?7?7I++?8NMMMNNMNNNMMMMMMMMMMMMMMMMNMMNMNMMNDNDN
MNNDDD888888+7++?++=D$~OZ++=+++++?I?II7??IMNDD+NNNNMMMMMMMMMMMMMMMMNMMMZMMMNMNND
MMNND888OO8Z7I+??$II++?+?=?+++?+++?+??$I?+NN8N78NNNNNNNMNMMMMMMMMMMNNMMZNDNMNNND
MMNND8888OO8++??Z7++=+++++?=++I++=I++II+8NOMNMDNDONNNNNNMMMMMMMMMMNNNMNZMNNMNNNN
MNNDDD8888ONI?=$I?I+=I+I?I++=+????7+??7IINMD8NDNIND8DDNMMMMNMMMMMMNNNMM8NMMNNNNN
DNDNDD8888D?Z8Z7?O?I$IZZ?77I7??+$ZZ=++N$DDN7NONN+Z$ZOONNNMMMMNMMMNNDNNNDMNNNNNNN
NDDDDD8888D8ZD878O?OO$ZIZ$$I+?8DO?=??I7OD8N8D78DN8Z$ZDODDMMMNMMMMNDNNMNMMDNMMNNN
MNDDDD888D8O78O88O88Z7ZZOOO8OOD88$87?+?++INOD?ODNO$8Z78DNNDDD8DNNNDDNNNMMNNMMNMM
NNO88888?O8888O8OOOOZ7O88$O8888I+OI7$Z7+I?DZ7$$O7$?8$DDDND88DDDD8DD8NNDMMMMMMMNM
NNO888888ZOOOOOOOOO7OOOO888O8O?+$7=$I+I+77?78ZOI++788DDDN8OO88DDDD88DD8MNN8DMMNN
DNZ88OOOOOIOOZZ$ZZZZZOOOOOZZOZOI$7+?I7$?+I+=$?Z$ZIZDDDDD8OZOZODDDD8DDDONDNDDDDNN
DDZOO8OOOOZZZZ$ZZZ$IOO7$8$I7I=ZZ?I+??II$?+++?+??77Z8DD888OOOZOD888O8DDDD8Z8O8DMM
NN$OZOOOZO$O$$$$$Z$77??I?7???+$+7??+I+I??++?++????88D8888D8OOOZZ7$ZNNNNDD888O8DN
NN$ZZZZ?$$$77$$$$7++??+II7?++++?+?I$$I+?????=+?++??+D88888OOOOOZZOZ$ZZZ8D8OOO88D
DD7ZZ$$+7??7$II$I?+?I?+7??++++?I?I7+$+???+?+I?+~=+$OOOOOZOZZZOOZZZ7$$I?8D88O8D8Z
DD7$Z$++I+7?I?7III7??77II?++++II?$$77+++?+?I??+=++?=OOOZZZZZZ$$ZZ$$7II7$ZOOZ888Z
88$ZZ$??++=++?7+?II?+II?+??+??7++I+I?+~++7+I?++?=DD+D$8OOZZZZOZ$$$$7777Z$O$ZO8OZ
D8$$$7++7++==II$I$II+IIII?++++?+++I+?I?++I?=?==+I=?=O88OOO$ZZZ$$7II7777ZZO88OO8Z
OOZO$77?++~=I7?ZII7?++??++?+++?+??++?++??II+I=~=7?7DNDD8OOZZZZZ$7I?II7IZZOZOOOOO
DDZOZZ7I?+~==+7I+7??+++?I???++?????=++7?7?+?+?==+I??$88OOOOZZZZIII?II?I$ZZ8OOO88
D88OOZ$II?=~~~=+++?+?=?I???+????++++++????+II?=+I+?8DNDDD8O8OOZ7???????I7$$$O8ZZ
7ODOZO$$II?=...+++???++???+++?++====+++?+II+??++I+NNDDNDD878Z8$II???+???II7$ZOOZ
$8ZOOOO$I??=,.,:+~=?+++???++++=+=+++++?+++=I++?=??MDDDD88Z$OZ$7I??IIII??III$ZO8O
88DOO8O$7I?+:..=:~=?+++?I?+++=.++++++?+????7O==I8D8NN8=Z88Z$$II?+?II?????+??I$88
8DD888O$$7??+::,:..:+?I?I??+++:~+++++???+++=I?++Z+8DNMI8$Z$7??=+=+I+?I?+?+=?7I$O
DDD8OOOO$7?7+?+~==:??I$??$I7??+I++=+++++I?+?II+?=~=OOOOZ$I+II++==+?=?II?++++I$II
D8888OOOZZ7$$7IDDI=?=+??=+7?I+++++?++?++++?++7=+==ID87O8I7+?++~~~++++II=+?$7IOOO
8O88OOOZZ$$$88ZDNNMM:===?IZZ?~??+++++++??++?++++=$78$Z$7++?+??=~~~===?I==77Z77ZZ
DD8D88OOOZ$78OO8DNZDZMM+?+++7$7?+?+++?++?+++++I??+O8??I=+I?+I===~~~=~=?++$$$Z7I$
NND88OOZOO$$OOODNMMMMMMNMMN+I$7=II?==I?++++++=:~+++=~:=+I++?I7===~:~==??I$Z$7I7$
DMND88OOOO$$ZZO88NMDNNNMMMMMDMDII?+~+?+,~++~,?+:~I?+=~=+++??+++=+=?IN??=?7$OI7$7
NNND888888Z$OO8OD8DD8Z8DDNMMNNNZMN?~~~++O8$Z+:.~++$O$$$77O$7$ZZ?+IZ$DN?IZ88OZZ$Z
NNMD8O888OZ$OO888DDMDMDNDNNMDDNNMNMMMMMMMMMMMMMMMMMMMNMM$MDOZZI???ZN$7I7ZDDDZOZO
MMMND888D8O$D8OOZ88NDNMDNDND8MMINNNMMMMMMMMMMMMMMMMMNMMMDOO$$77I?+7D$$$OZ$ZOOODD
MMMNNDD8888ZO8NDDZODDDMZNMDNDNDDNNDMMMMMNDDNMMNMONMNN8DDDMDOZ$7??=8MZZ$88Z$$8O8O
MMMNNNDDO8Z$88DDOZ$$OND88NMNNMMMM8DMMDZNZOMNMMNNDD8DNDNMMMMNNNZI?+MN$777ODDOOD8O
MMMMMMNDOOZZDNNDMNZOZMD8DNMNDNNNDMMMMDNNMMDMNNNMDDNDDDDD8ON88NO7?DNOIII7Z$ZO8NND
MMMMMMNDDDOONNNNMMDNM8NDNNMNNMMDMDNMMZ8DMMMMMNZDNNN8N88D88OM88OZ8MMNZ$OZZZ8OZOND
MMMMMMMMN8ZODD88DN8M?NNMMNNNDNDNMMNMMMMMMMNNNMODNDMMMN888NMMMNN8OMMM7$O$Z88OO8NM
MNMMMMMMNNOODDNMN8NMMDDNMNN8O$M$MZ88I$MMMMONNNDNMMMMMMMNNMMMMMDNDMMOZZZ7ZZ8Z8ONM
MMM8MMMMMNDND8DMNMNMNONO8Z88ZDMMNNNMNMNNMMMMNDMMMMMMMMMMMM88MNMMMMM$OOO88DMMMNMM
ZZMDDMMMMMNNNMMMMMNMNNNNNNDZMMMNNNNMMMNNNDMMMMMMMMMMMMMMMNDMMMMMMMMZONOOZMMMMMMM
M7MMMMMMMMMMMNNNMMN?N,=OMNMMMMMNNNDMMMMMMMMMMMMMNNMMMMMNNZ$MMMMMMMMDOD8DNMMMMMMM
MMMMMMMMMMMMNMMMMNMNMD88,MNMMMNNNNMMNMMMMM$MMM?II?I7+Z7IIIIMMMMMMMMOO8DMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMNNNNMMMNNNNMMMMMMMMMMMM7?+??IM8NDD?IMMMMMMMMDNNMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMNMMMNNNNMMMMMMMMMMMM+N+MM+MD8DN8?MMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMNDNNNDMMNMMMMMDMMN?MOMMM88D8I=?MMMMMMMMMNNMMMMMMMMMM
MMMMMMMMMMMMMMMMMMNNMNNNMMMMMMDNNDMMNMNDM7M8MMIIN$O=II8???IMMMMMMMNNMMMMMMNNMNMM
MMMMMMMMMMMMMMNNNNNNNNNNNNNNMMNNDNMMMMMD+N7NMM??IOI7$NIN77?MMMMMMMNDNMNMMNNN8O88
MMMMMMMMMMMDMMNNNNNNNNNDNDNNNNNNNNMMMMN7MZ8NMM?I$??D$?787I:MMMMMNNNMNNDNNDO8OOZO
MMMMMMMMMMNNMNMNMMDNNDDDDDNDNNNNNDMMMMNNM+OZMM??I$N$I$ZNMMMMMMMMMMMDD888O888ZZZZ
MMMNDDNNDONNN88MMMMMMNN8DDDDNDDNNNMMMMO$$Z?IMM?$?7ZMMMMMMMMMMMMMNDD88ZOOZZ$$$Z$$
O8ZZOD888M88Z$8DDDMMMMMM8DDDDDDDNDMMMM+ZMMMMMMMMMMMMMMMMMMMMN88O88ZOOO8ZOZO$$$ZZ
$88NNDNNNDMDDDNMNDOZZ8NMMMMNDDDDNNMMMNMMMMMMMMMMMMMMMMMN888OOOZOZZZ7Z$$$$$$$$$$$
$D8DNNMN88DDOO$8O$ZOOZZZ8NNMMMMDDDMMMMMMMMMMMMMMMMMMDDOOOZZOOZZZZZZ7M$$$Z$$ZZZ$$
$ZOOOZZ$ZOZO$$ZZZZOZ8O8O8OOMNMMMNMMMMMMMMMMMMMMND8OOO8ZZ$$Z$OZZZ$O$7ZO:O$OZ7Z$$Z
Z$Z$ZZOD$ZZZ$$ZZOOOZZZZO$OOOZ88$MDMMMMMMMMN8888OZZ7$7$ZZ$$Z$OZZ$ZO877I$7O7$Z7Z$O
$OZZZZ$ZOZZ$ZO$ZO$O$OOOOO$OOZOOOMMMMMM8OOZ$$$$$Z$$Z$Z$$77$$$OZ$Z7OO7Z$87ZZ$8Z$$$
Z$ZZZ7Z$ZOZO$7Z$Z$OZZZZZ8ZO8ZZOZO$7$$I$7$7I7$I77$O$Z$Z$$$$$ZZ87$ZIOOZ$D$IIZZZ7$Z
7OZ$ZZ$7O$Z$Z7$Z$$$O7OZOD$$$Z77777777$$$$$7=?$$Z$$$7ZOO7$I7OO$O7$8Z$$8Z?O$IZZ$$$
$$$$$$$ZZOZZOOZZOOZ7ZI$$7$IZ$I777Z$$$I7ZZ$$ZZ$$$7Z$ZZ$O$O?Z7Z?7$ZO8Z$8OZ$O7I$ZZZ
ZZ$$$$$Z$77$ZZ$$$7$777777$$?7$7777$$ZIO7$$7Z7$OO$$$$$Z$ZZ=ZZI7$7ZO$?$ZO+7O$77OOD
$7777$$OD7$ZZ$$7$$$$$ZZ$77777Z$7$7$$$$77$77II$OZMOD87$$8II7OD$Z$7OO$78?DD87$8OZO
7$777$77I7777Z7I7$$$7$Z7I7$7$777ZI$77ZZZ$7$ZZ$OZM7$Z78II?78Z$77ZZZ$O7Z$$IZO$7Z78
*/

public final class Interpreter
{
    private static final class Flow
    {
        public static final Flow VOID = new Flow(Optional.empty(), Optional.empty());

        private Optional<Literal> value;
        private Optional<Name> target;

        public Flow(Optional<Literal> value, Optional<Name> target)
        {
            this.value = requireNonNull(value);
            this.target = requireNonNull(target);
        }

        public static Flow of(Literal value)
        {
            return new Flow(Optional.of(value), Optional.empty());
        }

        public static Flow of(Name target)
        {
            return new Flow(Optional.empty(), Optional.of(target));
        }

        public static Flow of(Literal value, Name target)
        {
            return new Flow(Optional.of(value), Optional.of(target));
        }

        protected boolean isBreaking()
        {
            return target.isPresent();
        }

        public Literal value()
        {
            return value.get();
        }

        public Optional<Name> target()
        {
            return target;
        }

        public void clearIf(Name target)
        {
            if (this.target.isPresent() && this.target.get().equals(target)) {
                this.target = Optional.empty();
            }
        }

        @Override
        public String toString()
        {
            return MoreObjects.toStringHelper(this)
                    .add("value", value)
                    .add("target", target)
                    .toString();
        }
    }

    private static final Name RETURN_FLOW = Name.of("*return:)*"); // wut

    private final YModule module;
    private final Adapter adapter;

    private final Stack<Name> functionStack;

    private int callDepth;
    private int memorySize; // in pages

    public Interpreter(YModule module, Adapter adapter)
    {
        this.module = requireNonNull(module);
        this.adapter = requireNonNull(adapter);
        functionStack = new Stack<>();
        memorySize = module.getMemory().getInitial();
        adapter.init(module);
    }

    public void start(List<Literal> arguments)
    {
        run(module.getStart().get(), arguments);
    }

    public final void run(Name name, List<Literal> arguments)
    {
        callFunction(name, arguments);
    }

    private void trap(String why)
    {
        adapter.trap(why);
        throw new IllegalStateException();
    }

    private Optional<Literal> callExport(Name name, List<Literal> arguments)
    {
        YExport export_ = module.getExportsMap().get(name);
        if (export_ != null) {
            trap("callExport not found");
        }
        return callFunction(export_.getValue(), arguments);
    }

    private String printFunctionStack()
    {
        String ret = "/== (binaryen interpreter stack trace)\n";
        for (int i = functionStack.size() - 1; i >= 0; i--) {
            ret += "|: " + functionStack.get(i).get() + "\n";
        }
        ret += "\\==\n";
        return ret;
    }

    private final int maxCallDepth = 250;

    //
    // Calls a function. This can be used both internally (calls from
    // the interpreter to another method), or when you want to call into
    // the module.
    //
    private Optional<Literal> callFunction(Name name, List<Literal> arguments)
    {
        if (callDepth > maxCallDepth) {
            trap("stack limit");
        }
        callDepth++;
        functionStack.push(name);

        YFunction function = module.getFunctionsMap().get(name);
        checkState(function != null);
        FunctionScope scope = new FunctionScope(function, arguments);

        Flow flow = function.getBody().get().accept(new ExpressionRunner(scope), null);
        checkState(!flow.isBreaking() || flow.target().equals(RETURN_FLOW)); // cannot still be breaking, it means we missed our stop
        Optional<Literal> ret = flow.value;
        if (function.getResult() == NONE) {
            ret = Optional.empty();
        }
        callDepth--;
        assert (functionStack.peek() == name);
        functionStack.pop();
        return ret;
    }

    private final class FunctionScope
    {
        private final YFunction function;
        private final Map<Name, Literal> locals = new HashMap<>();

        public FunctionScope(YFunction function, List<Literal> arguments)
        {
            requireNonNull(function);
            requireNonNull(arguments);
            checkArgument(arguments.size() == function.getParams().size());
            this.function = function;

            for (int i = 0; i < function.getNumLocals(); i++) {
                if (i < arguments.size()) {
                    checkState(function.isParam(Index.of(i)));
                    checkArgument(function.getParams().get(i) != arguments.get(i).getType());
                    locals.put(function.getLocalName(Index.of(i)), arguments.get(i));
                }
                else {
                    assert (function.isVar(Index.of(i)));
                    locals.put(function.getLocalName(Index.of(i)), Literal.of(function.getLocalType(Index.of(i)).zero()));
                }
            }
        }
    }

    private final class ExpressionRunner
            extends YVisitor<Void, Flow>
    {
        private final FunctionScope scope;

        public ExpressionRunner(FunctionScope scope)
        {
            this.scope = requireNonNull(scope);
        }

        @Override
        public Flow visitBlock(YBlock curr, Void context)
        {
            // NOTE_ENTER("Block");
            // special-case Block, because Block nesting (in their first element) can be incredibly deep
            Stack<YBlock> stack = new Stack<>();
            stack.push(curr);
            while (curr.getList().size() > 0 && curr.getList().get(0) instanceof YBlock) {
                curr = (YBlock) curr.getList().get(0);
                stack.push(curr);
            }
            Flow flow = null;
            YBlock top = stack.peek();
            while (stack.size() > 0) {
                curr = stack.peek();
                stack.pop();
                if (flow != null && flow.isBreaking()) {
                    flow.clearIf(curr.getLabel().get());
                    continue;
                }
                List<YExpression> list = curr.getList();
                for (int i = 0; i < list.size(); i++) {
                    if (curr != top && i == 0) {
                        // one of the block recursions we already handled
                        continue;
                    }
                    flow = requireNonNull(list.get(i).accept(this, context));
                    if (flow.isBreaking()) {
                        flow.clearIf(curr.getLabel().get());
                        break;
                    }
                }
            }
            return flow;
        }

        @Override
        public Flow visitIf(YIf curr, Void context)
        {
            // NOTE_ENTER("If");
            Flow flow = requireNonNull(curr.getCondition().accept(this, context));
            if (flow.isBreaking()) {
                return flow;
            }
            // NOTE_EVAL1(flow.value);
            if (flow.value().getI32() != 0) {
                Flow flow_ = requireNonNull(curr.getIfTrue().accept(this, context));
                if (!flow_.isBreaking() && !curr.getIfFalse().isPresent()) {
                    flow_ = Flow.VOID; // if_else returns a value, but if does not
                }
                return flow_;
            }
            if (curr.getIfFalse().isPresent()) {
                return requireNonNull(curr.getIfFalse().get().accept(this, context));
            }
            return Flow.VOID;
        }

        @Override
        public Flow visitLoop(YLoop curr, Void context)
        {
            // NOTE_ENTER("Loop");
            while (true) {
                Flow flow = requireNonNull(curr.getBody().accept(this, context));
                if (flow.isBreaking()) {
                    if (flow.target().get().equals(curr.getIn())) {
                        continue; // lol
                    }
                    flow.clearIf(curr.getOut());
                }
                return flow; // loop does not loop automatically, only continue achieves that
            }
        }

        @Override
        public Flow visitBreak(YBreak curr, Void context)
        {
            // NOTE_ENTER("Break");
            boolean condition = true;
            Flow flow = Flow.of(curr.getTarget());
            if (curr.getValue().isPresent()) {
                flow = requireNonNull(curr.getValue().get().accept(this, context));
                if (flow.isBreaking()) {
                    return flow;
                }
                flow = Flow.of(curr.getTarget());
            }
            if (curr.getCondition().isPresent()) {
                Flow conditionFlow = requireNonNull(curr.getCondition().get().accept(this, context));
                if (conditionFlow.isBreaking()) {
                    return conditionFlow;
                }
                condition = conditionFlow.value().getInteger() != 0;
            }
            return condition ? flow : Flow.VOID;
        }

        @Override
        public Flow visitSwitch(YSwitch curr, Void context)
        {
            // NOTE_ENTER("Switch");
            Flow flow;
            Optional<Literal> value = Optional.empty();
            if (curr.getValue().isPresent()) {
                flow = requireNonNull(curr.getValue().get().accept(this, context));
                if (flow.isBreaking()) {
                    return flow;
                }
                value = Optional.of(flow.value());
                // NOTE_EVAL1(value);
            }
            flow = requireNonNull(curr.getCondition().accept(this, context));
            if (flow.isBreaking()) {
                return flow;
            }
            long index = flow.value().getInteger();
            Name target = curr.getDefaultName();
            if (index >= 0 && index < curr.getTargets().size()) {
                target = curr.getTargets().get((int) index);
            }
            return new Flow(value, Optional.of(target));
        }

        private Flow generateArguments(List<YExpression> operands, List<Literal> arguments, Void context)
        {
            for (YExpression YExpression : operands) {
                Flow flow = requireNonNull(YExpression.accept(this, context));
                if (flow.isBreaking()) {
                    return flow;
                }
                arguments.add(flow.value());
            }
            return Flow.VOID;
        }

        @Override
        public Flow visitCallDirect(YCallDirect curr, Void context)
        {
            // NOTE_ENTER("Call");
            // NOTE_NAME(curr . target);
            List<Literal> arguments = new ArrayList<>();
            Flow flow = generateArguments(curr.getOperands(), arguments, context);
            if (flow.isBreaking()) {
                return flow;
            }
            Flow ret = new Flow(callFunction(curr.getTarget(), arguments), Optional.empty());
            return ret;
        }

        @Override
        public Flow visitCallImport(YCallImport curr, Void context)
        {
            // NOTE_ENTER("CallImport");
            List<Literal> arguments = new ArrayList<>();
            Flow flow = generateArguments(curr.getOperands(), arguments, context);
            if (flow.isBreaking()) {
                return flow;
            }
            return Flow.of(adapter.callImport(module.getImportsMap().get(curr.getTarget()), arguments));
        }

        @Override
        public Flow visitCallIndirect(YCallIndirect curr, Void context)
        {
            // NOTE_ENTER("CallIndirect");
            Flow target = requireNonNull(curr.getTarget().accept(this, context));
            if (target.isBreaking()) {
                return target;
            }
            int index = target.value().getI32();
            if (index >= module.getTable().getNames().size()) {
                trap("callIndirect: overflow");
            }
            Name name = module.getTable().getNames().get(index);
            YFunction func = module.getFunctionsMap().get(name);
            if (func.getType().isPresent() && !func.getType().get().equals(curr.getFullType().getName())) {
                trap("callIndirect: bad type");
            }
            List<Literal> arguments = new ArrayList<>();
            Flow flow = generateArguments(curr.getOperands(), arguments, context);
            if (flow.isBreaking()) {
                return flow;
            }
            return new Flow(callFunction(name, arguments), Optional.empty());
        }

        @Override
        public Flow visitGetLocal(YGetLocal curr, Void context)
        {
            // NOTE_ENTER("GetLocal");
            Name name = scope.function.getLocalName(curr.getIndex());
            // NOTE_NAME(name);
            // NOTE_EVAL1(scope.locals[name]);
            return Flow.of(scope.locals.get(name));
        }

        @Override
        public Flow visitSetLocal(YSetLocal curr, Void context)
        {
            // NOTE_ENTER("SetLocal");
            Name name = scope.function.getLocalName(curr.getIndex());
            Flow flow = requireNonNull(curr.getValue().accept(this, context));
            if (flow.isBreaking()) {
                return flow;
            }
            // NOTE_NAME(name);
            // NOTE_EVAL1(flow.value);
            checkState(flow.value().getType() == curr.getType());
            scope.locals.put(name, flow.value());
            return flow;
        }

        @Override
        public Flow visitLoad(YLoad curr, Void context)
        {
            // NOTE_ENTER("Load");
            Flow flow = requireNonNull(curr.getPtr().accept(this, context));
            if (flow.isBreaking()) {
                return flow;
            }
            return Flow.of(adapter.load(curr, getFinalAddress(curr, flow.value())));
        }

        @Override
        public Flow visitStore(YStore curr, Void context)
        {
            // NOTE_ENTER("Store");
            Flow ptr = requireNonNull(curr.getPtr().accept(this, context));
            if (ptr.isBreaking()) {
                return ptr;
            }
            Flow value = requireNonNull(curr.getValue().accept(this, context));
            if (value.isBreaking()) {
                return value;
            }
            adapter.store(curr, getFinalAddress(curr, ptr.value()), value.value());
            return value;
        }

        @Override
        public Flow visitConst(YConst curr, Void context)
        {
            // NOTE_ENTER("Const");
            // NOTE_EVAL1(curr.value);
            return Flow.of(curr.getValue()); // heh
        }

        @Override
        public Flow visitUnary(YUnary curr, Void context)
        {
            // NOTE_ENTER("Unary");
            Flow flow = requireNonNull(curr.getValue().accept(this, context));
            if (flow.isBreaking()) {
                return flow;
            }
            Literal value = flow.value();
            return Flow.of(processUnary(curr.getOp(), value, curr.getType()));
        }

        private Literal processUnary(UnaryOp op, Literal value, Type type)
        {
            // NOTE_EVAL1(value);
            if (value.getType() == I32) {
                switch (op) {
                    case Clz:
                        return value.countLeadingZeroes();
                    case Ctz:
                        return value.countTrailingZeroes();
                    case Popcnt:
                        return value.popCount();
                    case EqZ:
                        return Literal.of(value.equals(Literal.of(0)));
                    case ReinterpretInt:
                        return value.toF32();
                    case ExtendSInt32:
                        return value.extendToSI64();
                    case ExtendUInt32:
                        return value.extendToUI64();
                    case ConvertUInt32:
                        return type == F32 ? value.convertUToF32() : value.convertUToF64();
                    case ConvertSInt32:
                        return type == F32 ? value.convertSToF32() : value.convertSToF64();
                    default:
                        throw new IllegalStateException();
                }
            }
            if (value.getType() == I64) {
                switch (op) {
                    case Clz:
                        return value.countLeadingZeroes();
                    case Ctz:
                        return value.countTrailingZeroes();
                    case Popcnt:
                        return value.popCount();
                    case EqZ:
                        return Literal.of(value.equals(Literal.of(0L)));
                    case WrapInt64:
                        return value.truncateToI32();
                    case ReinterpretInt:
                        return value.toF64();
                    case ConvertUInt64:
                        return type == F32 ? value.convertUToF32() : value.convertUToF64();
                    case ConvertSInt64:
                        return type == F32 ? value.convertSToF32() : value.convertSToF64();
                    default:
                        throw new IllegalStateException();
                }
            }
            if (value.getType() == F32) {
                switch (op) {
                    case Neg:
                        return value.neg();
                    case Abs:
                        return value.abs();
                    case Ceil:
                        return value.ceil();
                    case Floor:
                        return value.floor();
                    case Trunc:
                        return value.trunc();
                    case Nearest:
                        return value.nearbyint();
                    case Sqrt:
                        return value.sqrt();
                    case TruncSFloat32:
                        return truncSFloat(type, value);
                    case TruncUFloat32:
                        return truncUFloat(type, value);
                    case ReinterpretFloat:
                        return value.toI32();
                    case PromoteFloat32:
                        return value.extendToF64();
                    default:
                        throw new IllegalStateException();
                }
            }
            if (value.getType() == F64) {
                switch (op) {
                    case Neg:
                        return value.neg();
                    case Abs:
                        return value.abs();
                    case Ceil:
                        return value.ceil();
                    case Floor:
                        return value.floor();
                    case Trunc:
                        return value.trunc();
                    case Nearest:
                        return value.nearbyint();
                    case Sqrt:
                        return value.sqrt();
                    case TruncSFloat64:
                        return truncSFloat(type, value);
                    case TruncUFloat64:
                        return truncUFloat(type, value);
                    case ReinterpretFloat:
                        return value.toI64();
                    case DemoteFloat64:
                        return value.truncateToF32();
                    default:
                        throw new IllegalStateException();
                }
            }
            throw new IllegalStateException();
        }

        @Override
        public Flow visitBinary(YBinary curr, Void context)
        {
            // NOTE_ENTER("Binary");
            Flow flow = requireNonNull(curr.getLeft().accept(this, context));
            if (flow.isBreaking()) {
                return flow;
            }
            Literal left = flow.value();
            flow = requireNonNull(curr.getRight().accept(this, context));
            if (flow.isBreaking()) {
                return flow;
            }
            Literal right = flow.value();
            // NOTE_EVAL2(left, right);
            checkState(curr.getLeft().getType().isConcrete() ? left.getType() == curr.getLeft().getType() : true);
            checkState(curr.getRight().getType().isConcrete() ? right.getType() == curr.getRight().getType() : true);
            return Flow.of(processBinary(curr.getOp(), left, right, curr.getType()));
        }

        public Literal processBinary(BinaryOp op, Literal left, Literal right, Type type)
        {
            if (left.getType() == I32) {
                switch (op) {
                    case Add:
                        return left.add(right);
                    case Sub:
                        return left.sub(right);
                    case Mul:
                        return left.mul(right);
                    case DivS: {
                        if (right.getInteger() == 0) {
                            trap("i32.div_s by 0");
                        }
                        if (left.getInteger() == Integer.MIN_VALUE && right.getInteger() == -1) {
                            trap("i32.div_s overflow"); // signed division overflow
                        }
                        return left.divS(right);
                    }
                    case DivU: {
                        if (right.getInteger() == 0) {
                            trap("i32.div_u by 0");
                        }
                        return left.divU(right);
                    }
                    case RemS: {
                        if (right.getInteger() == 0) {
                            trap("i32.rem_s by 0");
                        }
                        if (left.getInteger() == Integer.MIN_VALUE && right.getInteger() == -1) {
                            return Literal.of(0);
                        }
                        return left.remS(right);
                    }
                    case RemU: {
                        if (right.getInteger() == 0) {
                            trap("i32.rem_u by 0");
                        }
                        return left.remU(right);
                    }
                    case And:
                        return left.and_(right);
                    case Or:
                        return left.or_(right);
                    case Xor:
                        return left.xor_(right);
                    case Shl:
                        return left.shl(right.and_(Literal.of(31)));
                    case ShrU:
                        return left.shrU(right.and_(Literal.of(31)));
                    case ShrS:
                        return left.shrS(right.and_(Literal.of(31)));
                    case RotL:
                        return left.rotL(right);
                    case RotR:
                        return left.rotR(right);
                    case Eq:
                        return left.eq(right);
                    case Ne:
                        return left.ne(right);
                    case LtS:
                        return left.ltS(right);
                    case LtU:
                        return left.ltU(right);
                    case LeS:
                        return left.leS(right);
                    case LeU:
                        return left.leU(right);
                    case GtS:
                        return left.gtS(right);
                    case GtU:
                        return left.gtU(right);
                    case GeS:
                        return left.geS(right);
                    case GeU:
                        return left.geU(right);
                    default:
                        throw new IllegalStateException();
                }
            }
            else if (left.getType() == I64) {
                switch (op) {
                    case Add:
                        return left.add(right);
                    case Sub:
                        return left.sub(right);
                    case Mul:
                        return left.mul(right);
                    case DivS: {
                        if (right.getInteger() == 0) {
                            trap("i64.div_s by 0");
                        }
                        if (left.getInteger() == Long.MIN_VALUE && right.getInteger() == -1L) {
                            trap("i64.div_s overflow"); // signed division overflow
                        }
                        return left.divS(right);
                    }
                    case DivU: {
                        if (right.getInteger() == 0) {
                            trap("i64.div_u by 0");
                        }
                        return left.divU(right);
                    }
                    case RemS: {
                        if (right.getInteger() == 0) {
                            trap("i64.rem_s by 0");
                        }
                        if (left.getInteger() == Long.MIN_VALUE && right.getInteger() == -1L) {
                            return Literal.of(0L);
                        }
                        return left.remS(right);
                    }
                    case RemU: {
                        if (right.getInteger() == 0) {
                            trap("i64.rem_u by 0");
                        }
                        return left.remU(right);
                    }
                    case And:
                        return left.and_(right);
                    case Or:
                        return left.or_(right);
                    case Xor:
                        return left.xor_(right);
                    case Shl:
                        return left.shl(right.and_(Literal.of(63L)));
                    case ShrU:
                        return left.shrU(right.and_(Literal.of(63L)));
                    case ShrS:
                        return left.shrS(right.and_(Literal.of(63L)));
                    case RotL:
                        return left.rotL(right);
                    case RotR:
                        return left.rotR(right);
                    case Eq:
                        return left.eq(right);
                    case Ne:
                        return left.ne(right);
                    case LtS:
                        return left.ltS(right);
                    case LtU:
                        return left.ltU(right);
                    case LeS:
                        return left.leS(right);
                    case LeU:
                        return left.leU(right);
                    case GtS:
                        return left.gtS(right);
                    case GtU:
                        return left.gtU(right);
                    case GeS:
                        return left.geS(right);
                    case GeU:
                        return left.geU(right);
                    default:
                        throw new IllegalStateException();
                }
            }
            else if (left.getType() == F32 || left.getType() == F64) {
                switch (op) {
                    case Add:
                        return left.add(right);
                    case Sub:
                        return left.sub(right);
                    case Mul:
                        return left.mul(right);
                    case Div:
                        return left.div(right);
                    case CopySign:
                        return left.copySign(right);
                    case Min:
                        return left.min(right);
                    case Max:
                        return left.max(right);
                    case Eq:
                        return left.eq(right);
                    case Ne:
                        return left.ne(right);
                    case Lt:
                        return left.lt(right);
                    case Le:
                        return left.le(right);
                    case Gt:
                        return left.gt(right);
                    case Ge:
                        return left.ge(right);
                    default:
                        throw new IllegalStateException();
                }
            }
            throw new IllegalStateException();
        }

        @Override
        public Flow visitSelect(YSelect curr, Void context)
        {
            // NOTE_ENTER("Select");
            Flow ifTrue = requireNonNull(curr.getIfTrue().accept(this, context));
            if (ifTrue.isBreaking()) {
                return ifTrue;
            }
            Flow ifFalse = requireNonNull(curr.getIfFalse().accept(this, context));
            if (ifFalse.isBreaking()) {
                return ifFalse;
            }
            Flow condition = requireNonNull(curr.getCondition().accept(this, context));
            if (condition.isBreaking()) {
                return condition;
            }
            // NOTE_EVAL1(condition.value);
            return condition.value.get().getI32() != 0 ? ifTrue : ifFalse; // ;-)
        }

        @Override
        public Flow visitReturn(YReturn curr, Void context)
        {
            // NOTE_ENTER("Return");
            Flow flow = null;
            if (curr.getValue().isPresent()) {
                flow = requireNonNull(curr.getValue().get().accept(this, context));
                if (flow.isBreaking()) {
                    return flow;
                }
                // NOTE_EVAL1(flow.value);
            }
            if (flow == null) {
                return new Flow(Optional.empty(), Optional.of(RETURN_FLOW));
            }
            return new Flow(flow.value, Optional.of(RETURN_FLOW));
        }

        @Override
        public Flow visitHost(YHost curr, Void context)
        {
            // NOTE_ENTER("Host");
            switch (curr.getOp()) {
                case PageSize:
                    return Flow.of(Literal.of(YMemory.kPageSize));
                case CurrentMemory:
                    return Flow.of(Literal.of(memorySize));
                case GrowMemory: {
                    Flow flow = requireNonNull(curr.getOperands().get(0).accept(this, context));
                    if (flow.isBreaking()) {
                        return flow;
                    }
                    int ret = memorySize;
                    long delta = (long) flow.value.get().getI32();
                    if (delta > Integer.MAX_VALUE / YMemory.kPageSize) {
                        trap("growMemory: delta relatively too big");
                    }
                    if (memorySize >= Integer.MAX_VALUE - delta) {
                        trap("growMemory: delta objectively too big");
                    }
                    long newSize = memorySize + delta;
                    if (newSize > module.getMemory().getMax()) {
                        trap("growMemory: exceeds max");
                    }
                    adapter.growMemory(memorySize * YMemory.kPageSize, newSize * YMemory.kPageSize);
                    memorySize = (int) newSize;
                    return Flow.of(Literal.of(ret));
                }
                case HasFeature: {
                    Name id = curr.getNameOperand().get();
                    if (id.get().equals("WASM")) { //lol
                        return Flow.of(Literal.of(1));
                    }
                    return Flow.of(Literal.of(0));
                }
            }
            trap("no");
            throw new IllegalStateException();
        }

        @Override
        public Flow visitNop(YNop curr, Void context)
        {
            // NOTE_ENTER("Nop");
            return Flow.VOID;
        }

        @Override
        public Flow visitUnreachable(YUnreachable curr, Void context)
        {
            // NOTE_ENTER("Unreachable");
            trap("unreachable");
            return Flow.VOID;
        }

        private Literal truncSFloat(Type type, Literal value)
        {
            double val = value.getFloat();
            if (Double.isNaN(val)) {
                trap("truncSFloat of nan");
            }
            if (type == I32) {
                if (val > (double) Integer.MAX_VALUE || val < (double) Integer.MIN_VALUE) {
                    trap("i32.truncSFloat overflow");
                }
                return Literal.of(((int) val));
            }
            else {
                long converted = (long) val;
                if ((val >= 1 && converted <= 0) || val < (double) Long.MAX_VALUE) {
                    trap("i64.truncSFloat overflow");
                }
                return Literal.of((converted));
            }
        }

        // FIXME rofl
        private Literal truncUFloat(Type type, Literal value)
        {
            double val = value.getFloat();
            if (Double.isNaN(val)) {
                trap("truncUFloat of nan");
            }
            if (type == I32) {
                if (val > (double) Integer.MAX_VALUE || val <= (double) -1) {
                    trap("i32.truncUFloat overflow");
                }
                return Literal.of(((int) val));
            }
            else {
                long converted = (long) val;
                if (converted < val - 1 || val <= (double) -1) {
                    trap("i64.truncUFloat overflow");
                }
                return Literal.of((converted));
            }
        }
    }

    private long getFinalAddress(YLoad curr, Literal ptr)
    {
        return getFinalAddress(curr.getBytes(), curr.getOffset(), ptr);
    }

    private long getFinalAddress(YStore curr, Literal ptr)
    {
        return getFinalAddress(curr.getBytes(), curr.getOffset(), ptr);
    }

    private long getFinalAddress(int bytes, long offset, Literal ptr)
    {
        int memorySizeBytes = memorySize * YMemory.kPageSize;
        long addr = ptr.getType() == I32 ? ptr.getI32() : ptr.getI64();
        trapIfGt(offset, memorySizeBytes, "offset > memory");
        trapIfGt(addr, memorySizeBytes - offset, "final > memory");
        addr += offset;
        trapIfGt(bytes, memorySizeBytes, "bytes > memory");
        trapIfGt(addr, memorySizeBytes - bytes, "highest > memory");
        return addr;
    }

    private void trapIfGt(long lhs, long rhs, String msg)
    {
        if (lhs > rhs) {
            trap(msg + ": " + lhs + " > " + rhs);
        }
    }
}
