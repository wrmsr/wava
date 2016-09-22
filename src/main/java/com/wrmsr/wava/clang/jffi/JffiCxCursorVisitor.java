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

import com.wrmsr.wava.clang.api.CxChildVisitResult;

import static com.wrmsr.wava.clang.jffi.JffiUtils.Address;

@SuppressWarnings("WeakerAccess")
@FunctionalInterface
public interface JffiCxCursorVisitor
{
    CxChildVisitResult visit(JffiCxCursor cursor, JffiCxCursor parent, Address userData);
}
