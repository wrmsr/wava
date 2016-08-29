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
package com.wrmsr.wava.driver;

import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableSet;
import com.wrmsr.wava.compile.binary.BinaryCompiler;
import com.wrmsr.wava.compile.binary.BinaryCompilerImpl;
import com.wrmsr.wava.compile.call.CallCompiler;
import com.wrmsr.wava.compile.call.CallCompilerImpl;
import com.wrmsr.wava.compile.call.CallIndirectCompilerImpl;
import com.wrmsr.wava.compile.const_.ConstCompilerImpl;
import com.wrmsr.wava.compile.function.FunctionAccess;
import com.wrmsr.wava.compile.function.FunctionCompiler;
import com.wrmsr.wava.compile.function.FunctionCompilerImpl;
import com.wrmsr.wava.compile.memory.LoadStoreCompiler;
import com.wrmsr.wava.compile.memory.LoadStoreCompilerImpl;
import com.wrmsr.wava.compile.memory.MemoryCompilerImpl;
import com.wrmsr.wava.compile.memory.StackCompilerImpl;
import com.wrmsr.wava.compile.module.ImportsCompilerImpl;
import com.wrmsr.wava.compile.module.ModuleCompilationParticipant;
import com.wrmsr.wava.compile.module.ModuleCompiler;
import com.wrmsr.wava.compile.module.ModuleCompilerConfig;
import com.wrmsr.wava.compile.module.MultiModuleCompilerConfig;
import com.wrmsr.wava.compile.module.MultiModuleCompilerImpl;
import com.wrmsr.wava.compile.module.SignatureCompilerImpl;
import com.wrmsr.wava.compile.module.TableCompilerImpl;
import com.wrmsr.wava.compile.unary.UnaryCompiler;
import com.wrmsr.wava.compile.unary.UnaryCompilerImpl;
import com.wrmsr.wava.core.type.Name;
import com.wrmsr.wava.core.unit.Function;
import com.wrmsr.wava.core.unit.Module;
import com.wrmsr.wava.java.lang.JAccess;
import com.wrmsr.wava.java.lang.JQualifiedName;
import com.wrmsr.wava.java.lang.JRenderer;
import com.wrmsr.wava.java.lang.compilationUnit.JCompilationUnit;
import com.wrmsr.wava.yen.global.YModule;
import com.wrmsr.wava.yen.parser.ModuleFactory;
import com.wrmsr.wava.yen.parser.Parser;
import com.wrmsr.wava.yen.parser.element.Element;
import com.wrmsr.wava.yen.parser.input.Input;
import com.wrmsr.wava.yen.translation.UnitTranslation;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

import static com.google.common.collect.Sets.immutableEnumSet;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableList;
import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableMap;
import static java.util.Objects.requireNonNull;
import static java.util.function.Function.identity;

public final class StandardDriver
{
    private final Optional<JQualifiedName> packageName;

    public StandardDriver(Optional<JQualifiedName> packageName)
    {
        this.packageName = requireNonNull(packageName);
    }

    @FunctionalInterface
    public interface Sink
    {
        void accept(JCompilationUnit jcompilationUnit, Consumer<Appendable> renderer)
                throws IOException;
    }

    public void compileWast(Name name, Input input, Sink sink)
    {
        Element root = new Parser(input).parse();
        YModule ymodule = new ModuleFactory(root).create();
        Module module = UnitTranslation.translateModule(name, ymodule);

        List<JCompilationUnit> sourceFiles = compileModule(module);
        sourceFiles.forEach(sourceFile -> {
            try {
                sink.accept(sourceFile, output -> JRenderer.renderWithIndent(r -> r.renderCompilationUnit(sourceFile), "    ", output));
            }
            catch (IOException e) {
                throw Throwables.propagate(e);
            }
        });
    }

    public List<JCompilationUnit> compileModule(Module module)
    {
        BinaryCompiler binaryCompiler = new BinaryCompilerImpl();
        CallCompiler callCompiler = new CallCompilerImpl();
        UnaryCompiler unaryCompiler = new UnaryCompilerImpl();
        LoadStoreCompiler loadStoreCompiler = new LoadStoreCompilerImpl();

        FunctionCompiler functionCompiler = new FunctionCompilerImpl(
                new FunctionAccess(immutableEnumSet(JAccess.PUBLIC, JAccess.FINAL)),
                binaryCompiler,
                callCompiler,
                new CallIndirectCompilerImpl(),
                new ConstCompilerImpl(),
                loadStoreCompiler,
                unaryCompiler);

        ModuleCompiler moduleCompiler = new MultiModuleCompilerImpl(
                ImmutableSet.of(
                        new ImportsCompilerImpl(module),
                        new SignatureCompilerImpl(module),
                        new TableCompilerImpl(module),
                        new MemoryCompilerImpl(module),
                        new StackCompilerImpl(),
                        (ModuleCompilationParticipant) loadStoreCompiler,
                        (ModuleCompilationParticipant) callCompiler,
                        (ModuleCompilationParticipant) binaryCompiler,
                        (ModuleCompilationParticipant) unaryCompiler,
                        (ModuleCompilationParticipant) functionCompiler),
                functionCompiler,
                new ModuleCompilerConfig().setPackageName(packageName.map(JQualifiedName::join).orElse(null)),
                new MultiModuleCompilerConfig().setNumFunctionsPerClass(100));

        FunctionProcessor functionProcessor = new StandardFunctionProcessor();
        List<Function> functions = module.getFunctions().entrySet().stream()
                .map(Map.Entry::getValue)
                .map(functionProcessor::processFunction)
                .collect(toImmutableList());

        module = new Module(
                module.getName(),
                module.getMemory(),
                module.getTable(),
                module.getDeclaredSignatures(),
                module.getImports(),
                module.getExports(),
                functions.stream().collect(toImmutableMap(Function::getName, identity())));

        return moduleCompiler.compileModule(module);
    }
}
