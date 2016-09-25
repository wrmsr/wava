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
package com.wrmsr.wava.clang.jffi;

import com.wrmsr.wava.clang.api.CxError;
import com.wrmsr.wava.clang.api.CxException;
import com.wrmsr.wava.clang.api.CxIndex;
import com.wrmsr.wava.clang.api.CxTranslationUnit;
import com.wrmsr.wava.clang.api.CxTranslationUnitFlags;

import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

import static com.google.common.base.Preconditions.checkState;
import static java.util.Collections.newSetFromMap;

final class JffiCxIndex
        extends JffiPointer
        implements CxIndex
{
    static final Descriptor<JffiCxIndex> DESCRIPTOR = new Descriptor<>(
            JffiCxIndex.class,
            JffiCxIndex::new);

    private boolean isDisposed = false;

    private final Set<CxTranslationUnit> translationUnits = newSetFromMap(new WeakHashMap<>());

    JffiCxIndex(JffiCxRuntime runtime, long address)
    {
        super(runtime, address);
    }

    @Override
    public synchronized void close()
            throws Exception
    {
        if (!isDisposed) {
            for (CxTranslationUnit tu : translationUnits) {
                tu.close();
            }
            translationUnits.clear();
            runtime.getLibClang().clang_disposeIndex(this);
            isDisposed = true;
        }
    }

    @Override
    protected void finalize()
            throws Throwable
    {
        try {
            close();
        }
        finally {
            super.finalize();
        }
    }

    @Override
    public synchronized CxTranslationUnit createTranslationUnit(String astFilename)
    {
        checkState(!isDisposed);
        CxTranslationUnit tu = runtime.getLibClang().clang_createTranslationUnit(this, astFilename);
        if (tu != null) {
            translationUnits.add(tu);
        }
        return tu;
    }

    @Override
    public synchronized CxTranslationUnit parseTranslationUnit(String sourceFilename, List<String> commandLineArgs, Set<CxTranslationUnitFlags> options)
            throws CxException
    {
        checkState(!isDisposed);
        JffiCxTranslationUnit[] out = new JffiCxTranslationUnit[1];
        String[] commandLineArgsArray = commandLineArgs.stream().toArray(String[]::new);
        int optionsInt = options.stream().map(CxTranslationUnitFlags::getAsInt).reduce(0, (l, r) -> l | r);
        CxError error = runtime.getLibClang().clang_parseTranslationUnit2(this, sourceFilename, commandLineArgsArray, commandLineArgsArray.length, 0, 0, optionsInt, out);
        if (error != CxError.Success) {
            throw new CxException(error);
        }
        CxTranslationUnit tu = out[0];
        if (tu != null) {
            translationUnits.add(tu);
        }
        return tu;
    }
}
