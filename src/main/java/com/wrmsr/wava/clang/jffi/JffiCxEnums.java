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

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.clang.api.CxCallingConv;
import com.wrmsr.wava.clang.api.CxChildVisitResult;
import com.wrmsr.wava.clang.api.CxCursorKind;
import com.wrmsr.wava.clang.api.CxCxxAccessSpecifier;
import com.wrmsr.wava.clang.api.CxError;
import com.wrmsr.wava.clang.api.CxEvalResultKind;
import com.wrmsr.wava.clang.api.CxLinkageKind;
import com.wrmsr.wava.clang.api.CxNameRefFlags;
import com.wrmsr.wava.clang.api.CxRefQualifierKind;
import com.wrmsr.wava.clang.api.CxStorageClass;
import com.wrmsr.wava.clang.api.CxTemplateArgumentKind;
import com.wrmsr.wava.clang.api.CxTokenKind;
import com.wrmsr.wava.clang.api.CxTranslationUnitFlags;
import com.wrmsr.wava.clang.api.CxTypeKind;
import com.wrmsr.wava.clang.api.CxTypeLayoutError;
import com.wrmsr.wava.clang.api.CxVisibilityKind;

import java.util.List;
import java.util.function.Function;

import static java.util.Objects.requireNonNull;

final class JffiCxEnums
{
    private JffiCxEnums()
    {
    }

    static final class Descriptor<T extends Enum<T>>
    {
        final Class<T> cls;
        final Function<T, Integer> toInt;
        final Function<Integer, T> fromInt;

        public Descriptor(Class<T> cls, Function<T, Integer> toInt, Function<Integer, T> fromInt)
        {
            this.cls = requireNonNull(cls);
            this.toInt = requireNonNull(toInt);
            this.fromInt = requireNonNull(fromInt);
        }
    }

    static final List<Descriptor<?>> DESCRIPTORS = ImmutableList.<Descriptor<?>>builder()
            .add(
                    new Descriptor<>(
                            CxCallingConv.class,
                            CxCallingConv::getAsInt,
                            CxCallingConv.BY_VALUE::get))
            .add(
                    new Descriptor<>(
                            CxChildVisitResult.class,
                            CxChildVisitResult::getAsInt,
                            CxChildVisitResult.BY_VALUE::get))
            .add(
                    new Descriptor<>(
                            CxCursorKind.class,
                            CxCursorKind::getAsInt,
                            CxCursorKind.BY_VALUE::get))
            .add(
                    new Descriptor<>(
                            CxCxxAccessSpecifier.class,
                            CxCxxAccessSpecifier::getAsInt,
                            CxCxxAccessSpecifier.BY_VALUE::get))
            .add(
                    new Descriptor<>(
                            CxError.class,
                            CxError::getAsInt,
                            CxError.BY_VALUE::get))
            .add(
                    new Descriptor<>(
                            CxEvalResultKind.class,
                            CxEvalResultKind::getAsInt,
                            CxEvalResultKind.BY_VALUE::get))
            .add(
                    new Descriptor<>(
                            CxLinkageKind.class,
                            CxLinkageKind::getAsInt,
                            CxLinkageKind.BY_VALUE::get))
            .add(
                    new Descriptor<>(
                            CxNameRefFlags.class,
                            CxNameRefFlags::getAsInt,
                            CxNameRefFlags.BY_VALUE::get))
            .add(
                    new Descriptor<>(
                            CxRefQualifierKind.class,
                            CxRefQualifierKind::getAsInt,
                            CxRefQualifierKind.BY_VALUE::get))
            .add(
                    new Descriptor<>(
                            CxStorageClass.class,
                            CxStorageClass::getAsInt,
                            CxStorageClass.BY_VALUE::get))
            .add(
                    new Descriptor<>(
                            CxTemplateArgumentKind.class,
                            CxTemplateArgumentKind::getAsInt,
                            CxTemplateArgumentKind.BY_VALUE::get))
            .add(
                    new Descriptor<>(
                            CxTokenKind.class,
                            CxTokenKind::getAsInt,
                            CxTokenKind.BY_VALUE::get))
            .add(
                    new Descriptor<>(
                            CxTranslationUnitFlags.class,
                            CxTranslationUnitFlags::getAsInt,
                            CxTranslationUnitFlags.BY_VALUE::get))
            .add(
                    new Descriptor<>(
                            CxTypeKind.class,
                            CxTypeKind::getAsInt,
                            CxTypeKind.BY_VALUE::get))
            .add(
                    new Descriptor<>(
                            CxTypeLayoutError.class,
                            CxTypeLayoutError::getAsInt,
                            CxTypeLayoutError.BY_VALUE::get))
            .add(
                    new Descriptor<>(
                            CxVisibilityKind.class,
                            CxVisibilityKind::getAsInt,
                            CxVisibilityKind.BY_VALUE::get))
            .build();
}
