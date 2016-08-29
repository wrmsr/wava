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
package com.wrmsr.wava.core.op;

import com.wrmsr.wava.core.type.Signature;

import static com.wrmsr.wava.core.type.Signature.parseSignature;
import static java.util.Objects.requireNonNull;

public enum HostOp
{
    PageSize(parseSignature("i")),
    CurrentMemory(parseSignature("i")),
    GrowMemory(parseSignature("ii")),
    HasFeature(parseSignature("ii")),

    SpillPut(parseSignature("vil")),
    SpillGet(parseSignature("li"));

    private final Signature signature;

    HostOp(Signature signature)
    {
        this.signature = requireNonNull(signature);
    }

    public Signature getSignature()
    {
        return signature;
    }
}
