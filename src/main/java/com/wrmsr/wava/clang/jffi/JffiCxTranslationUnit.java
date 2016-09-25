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

import com.wrmsr.wava.clang.api.CxCursor;
import com.wrmsr.wava.clang.api.CxTranslationUnit;

final class JffiCxTranslationUnit
        extends JffiPointer
        implements CxTranslationUnit
{
    static final Descriptor<JffiCxTranslationUnit> DESCRIPTOR = new Descriptor<>(
            JffiCxTranslationUnit.class,
            JffiCxTranslationUnit::new);

    private boolean isDisposed = false;

    JffiCxTranslationUnit(JffiCxRuntime runtime, long address)
    {
        super(runtime, address);
    }

    @Override
    public synchronized void close()
            throws Exception
    {
        if (!isDisposed) {
            runtime.getLibClang().clang_disposeTranslationUnit(this);
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
    public CxCursor getCursor()
    {
        return runtime.getLibClang().clang_getTranslationUnitCursor(this);
    }
}
