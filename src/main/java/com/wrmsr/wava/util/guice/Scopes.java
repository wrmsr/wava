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
package com.wrmsr.wava.util.guice;

import com.google.inject.Binder;
import com.google.inject.Scope;

import java.lang.annotation.Annotation;

import static java.util.Objects.requireNonNull;

public final class Scopes
{
    private Scopes()
    {
    }

    @SuppressWarnings({"unchecked"})
    public static void bindScopeInstance(Binder binder, Scope scope, Class<? extends Annotation> annotationType)
    {
        requireNonNull(scope);
        binder.bindScope(annotationType, scope);
        binder.bind((Class) scope.getClass()).toInstance(scope);
    }
}
