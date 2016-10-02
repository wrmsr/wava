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

import com.wrmsr.wava.clang.api.CxEvalResult;
import com.wrmsr.wava.clang.api.CxEvalResultKind;

final class JffiCxEvalResult
        extends JffiPointer
        implements CxEvalResult
{
    static final Descriptor<JffiCxEvalResult> DESCRIPTOR = new Descriptor<>(
            JffiCxEvalResult.class,
            JffiCxEvalResult::new);

    private boolean isDisposed = false;

    JffiCxEvalResult(JffiCxRuntime runtime, long address)
    {
        super(runtime, address);
    }

    @Override
    public void close()
            throws Exception
    {
        if (!isDisposed) {
            runtime.getLibClang().clang_EvalResult_dispose(this);
            isDisposed = true;
        }
    }

    @Override
    public CxEvalResultKind getKind()
    {
        return runtime.getLibClang().clang_EvalResult_getKind(this);
    }

    @Override
    public long getAsInt()
    {
        return runtime.getLibClang().clang_EvalResult_getAsInt(this);
    }

    @Override
    public double getAsDouble()
    {
        return runtime.getLibClang().clang_EvalResult_getAsDouble(this);
    }

    @Override
    public String getAsStr()
    {
        return runtime.getLibClang().clang_EvalResult_getAsStr(this);
    }
}
