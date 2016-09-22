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
package com.wrmsr.wava.util.function;

public final class Bind
{
    private Bind()
    {
    }

    // TODO: @MethodHandle.PolymorphicSignature

    public static <T0, R> Function0<R> bind(Function1<T0, R> fn, T0 t0)
    {
        return () -> fn.apply(t0);
    }

    public static <T0, T1, R> Function1<T1, R> bind(Function2<T0, T1, R> fn, T0 t0)
    {
        return (t1) -> fn.apply(t0, t1);
    }

    public static <T0, T1, R> Function0<R> bind(Function2<T0, T1, R> fn, T0 t0, T1 t1)
    {
        return () -> fn.apply(t0, t1);
    }

    public static <T0, T1, T2, R> Function2<T1, T2, R> bind(Function3<T0, T1, T2, R> fn, T0 t0)
    {
        return (t1, t2) -> fn.apply(t0, t1, t2);
    }

    public static <T0, T1, T2, R> Function1<T2, R> bind(Function3<T0, T1, T2, R> fn, T0 t0, T1 t1)
    {
        return (t2) -> fn.apply(t0, t1, t2);
    }

    public static <T0, T1, T2, R> Function0<R> bind(Function3<T0, T1, T2, R> fn, T0 t0, T1 t1, T2 t2)
    {
        return () -> fn.apply(t0, t1, t2);
    }

    public static <T0, T1, T2, T3, R> Function3<T1, T2, T3, R> bind(Function4<T0, T1, T2, T3, R> fn, T0 t0)
    {
        return (t1, t2, t3) -> fn.apply(t0, t1, t2, t3);
    }

    public static <T0, T1, T2, T3, R> Function2<T2, T3, R> bind(Function4<T0, T1, T2, T3, R> fn, T0 t0, T1 t1)
    {
        return (t2, t3) -> fn.apply(t0, t1, t2, t3);
    }

    public static <T0, T1, T2, T3, R> Function1<T3, R> bind(Function4<T0, T1, T2, T3, R> fn, T0 t0, T1 t1, T2 t2)
    {
        return (t3) -> fn.apply(t0, t1, t2, t3);
    }

    public static <T0, T1, T2, T3, R> Function0<R> bind(Function4<T0, T1, T2, T3, R> fn, T0 t0, T1 t1, T2 t2, T3 t3)
    {
        return () -> fn.apply(t0, t1, t2, t3);
    }

    public static <T0, T1, T2, T3, T4, R> Function4<T1, T2, T3, T4, R> bind(Function5<T0, T1, T2, T3, T4, R> fn, T0 t0)
    {
        return (t1, t2, t3, t4) -> fn.apply(t0, t1, t2, t3, t4);
    }

    public static <T0, T1, T2, T3, T4, R> Function3<T2, T3, T4, R> bind(Function5<T0, T1, T2, T3, T4, R> fn, T0 t0, T1 t1)
    {
        return (t2, t3, t4) -> fn.apply(t0, t1, t2, t3, t4);
    }

    public static <T0, T1, T2, T3, T4, R> Function2<T3, T4, R> bind(Function5<T0, T1, T2, T3, T4, R> fn, T0 t0, T1 t1, T2 t2)
    {
        return (t3, t4) -> fn.apply(t0, t1, t2, t3, t4);
    }

    public static <T0, T1, T2, T3, T4, R> Function1<T4, R> bind(Function5<T0, T1, T2, T3, T4, R> fn, T0 t0, T1 t1, T2 t2, T3 t3)
    {
        return (t4) -> fn.apply(t0, t1, t2, t3, t4);
    }

    public static <T0, T1, T2, T3, T4, R> Function0<R> bind(Function5<T0, T1, T2, T3, T4, R> fn, T0 t0, T1 t1, T2 t2, T3 t3, T4 t4)
    {
        return () -> fn.apply(t0, t1, t2, t3, t4);
    }

    public static <T0, T1, T2, T3, T4, T5, R> Function5<T1, T2, T3, T4, T5, R> bind(Function6<T0, T1, T2, T3, T4, T5, R> fn, T0 t0)
    {
        return (t1, t2, t3, t4, t5) -> fn.apply(t0, t1, t2, t3, t4, t5);
    }

    public static <T0, T1, T2, T3, T4, T5, R> Function4<T2, T3, T4, T5, R> bind(Function6<T0, T1, T2, T3, T4, T5, R> fn, T0 t0, T1 t1)
    {
        return (t2, t3, t4, t5) -> fn.apply(t0, t1, t2, t3, t4, t5);
    }

    public static <T0, T1, T2, T3, T4, T5, R> Function3<T3, T4, T5, R> bind(Function6<T0, T1, T2, T3, T4, T5, R> fn, T0 t0, T1 t1, T2 t2)
    {
        return (t3, t4, t5) -> fn.apply(t0, t1, t2, t3, t4, t5);
    }

    public static <T0, T1, T2, T3, T4, T5, R> Function2<T4, T5, R> bind(Function6<T0, T1, T2, T3, T4, T5, R> fn, T0 t0, T1 t1, T2 t2, T3 t3)
    {
        return (t4, t5) -> fn.apply(t0, t1, t2, t3, t4, t5);
    }

    public static <T0, T1, T2, T3, T4, T5, R> Function1<T5, R> bind(Function6<T0, T1, T2, T3, T4, T5, R> fn, T0 t0, T1 t1, T2 t2, T3 t3, T4 t4)
    {
        return (t5) -> fn.apply(t0, t1, t2, t3, t4, t5);
    }

    public static <T0, T1, T2, T3, T4, T5, R> Function0<R> bind(Function6<T0, T1, T2, T3, T4, T5, R> fn, T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5)
    {
        return () -> fn.apply(t0, t1, t2, t3, t4, t5);
    }
}
