/*===-- clang-c/Index.h - Indexing Public C Interface -------------*- C -*-===*\
|*                                                                            *|
|*                     The LLVM Compiler Infrastructure                       *|
|*                                                                            *|
|* This file is distributed under the University of Illinois Open Source      *|
|* License. See LICENSE_LLVM for details.                                     *|
|*                                                                            *|
|*===----------------------------------------------------------------------===*|
|*                                                                            *|
|* This header provides a public interface to a Clang library for extracting  *|
|* high-level symbol information from source files without exposing the full  *|
|* Clang C++ API.                                                             *|
|*                                                                            *|
\*===----------------------------------------------------------------------===*/
package com.wrmsr.wava.clang.jffi;

import com.google.common.collect.ImmutableList;
import com.wrmsr.wava.clang.CxCallingConv;
import com.wrmsr.wava.clang.CxCursorKind;
import com.wrmsr.wava.clang.CxCxxAccessSpecifier;
import com.wrmsr.wava.clang.CxError;
import com.wrmsr.wava.clang.CxLinkageKind;
import com.wrmsr.wava.clang.CxStorageClass;
import com.wrmsr.wava.clang.CxTemplateArgumentKind;
import com.wrmsr.wava.clang.CxTranslationUnitFlags;
import com.wrmsr.wava.clang.CxTypeKind;
import com.wrmsr.wava.clang.CxTypeLayoutError;
import com.wrmsr.wava.clang.CxVisibilityKind;

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
                            CxLinkageKind.class,
                            CxLinkageKind::getAsInt,
                            CxLinkageKind.BY_VALUE::get))
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
