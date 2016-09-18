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
package com.wrmsr.wava.clang;

import java.util.Map;
import java.util.function.IntSupplier;
import java.util.stream.Stream;

import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableMap;
import static java.util.function.Function.identity;

/**
 * \brief Flags that control the creation of translation units.
 * <p>
 * The enumerators in this enumeration type are meant to be bitwise
 * ORed together to specify which options should be used when
 * constructing the translation unit.
 */
public enum CxTranslationUnitFlags
        implements IntSupplier
{
    /**
     * \brief Used to indicate that no special translation-unit options are
     * needed.
     */
    None(0x0),

    /**
     * \brief Used to indicate that the parser should construct a "detailed"
     * preprocessing record, including all macro definitions and instantiations.
     * <p>
     * Constructing a detailed preprocessing record requires more memory
     * and time to parse, since the information contained in the record
     * is usually not retained. However, it can be useful for
     * applications that require more detailed information about the
     * behavior of the preprocessor.
     */
    DetailedPreprocessingRecord(0x01),

    /**
     * \brief Used to indicate that the translation unit is incomplete.
     * <p>
     * When a translation unit is considered "incomplete", semantic
     * analysis that is typically performed at the end of the
     * translation unit will be suppressed. For example, this suppresses
     * the completion of tentative declarations in C and of
     * instantiation of implicitly-instantiation function templates in
     * C++. This option is typically used when parsing a header with the
     * intent of producing a precompiled header.
     */
    Incomplete(0x02),

    /**
     * \brief Used to indicate that the translation unit should be built with an
     * implicit precompiled header for the preamble.
     * <p>
     * An implicit precompiled header is used as an optimization when a
     * particular translation unit is likely to be reparsed many times
     * when the sources aren't changing that often. In this case, an
     * implicit precompiled header will be built containing all of the
     * initial includes at the top of the main file (what we refer to as
     * the "preamble" of the file). In subsequent parses, if the
     * preamble or the files in it have not changed, \c
     * clang_reparseTranslationUnit() will re-use the implicit
     * precompiled header to improve parsing performance.
     */
    PrecompiledPreamble(0x04),

    /**
     * \brief Used to indicate that the translation unit should cache some
     * code-completion results with each reparse of the source file.
     * <p>
     * Caching of code-completion results is a performance optimization that
     * introduces some overhead to reparsing but improves the performance of
     * code-completion operations.
     */
    CacheCompletionResults(0x08),

    /**
     * \brief Used to indicate that the translation unit will be serialized with
     * \c clang_saveTranslationUnit.
     * <p>
     * This option is typically used when parsing a header with the intent of
     * producing a precompiled header.
     */
    ForSerialization(0x10),

    /**
     * \brief DEPRECATED: Enabled chained precompiled preambles in C++.
     * <p>
     * Note: this is a *temporary* option that is available only while
     * we are testing C++ precompiled preamble support. It is deprecated.
     */
    CXXChainedPCH(0x20),

    /**
     * \brief Used to indicate that function/method bodies should be skipped while
     * parsing.
     * <p>
     * This option can be used to search for declarations/definitions while
     * ignoring the usages.
     */
    SkipFunctionBodies(0x40),

    /**
     * \brief Used to indicate that brief documentation comments should be
     * included into the set of code completions returned from this translation
     * unit.
     */
    IncludeBriefCommentsInCodeCompletion(0x80),

    /**
     * \brief Used to indicate that the precompiled preamble should be created on
     * the first parse. Otherwise it will be created on the first reparse. This
     * trades runtime on the first parse (serializing the preamble takes time) for
     * reduced runtime on the second parse (can now reuse the preamble).
     */
    CreatePreambleOnFirstParse(0x100),

    /**
     * \brief Do not stop processing when fatal errors are encountered.
     * <p>
     * When fatal errors are encountered while parsing a translation unit,
     * semantic analysis is typically stopped early when compiling code. A common
     * source for fatal errors are unresolvable include files. For the
     * purposes of an IDE, this is undesirable behavior and as much information
     * as possible should be reported. Use this flag to enable this behavior.
     */
    KeepGoing(0x200);

    private final int value;

    CxTranslationUnitFlags(int value)
    {
        this.value = value;
    }

    @Override
    public int getAsInt()
    {
        return value;
    }

    public static final Map<Integer, CxTranslationUnitFlags> BY_VALUE = Stream.of(values()).collect(toImmutableMap(CxTranslationUnitFlags::getAsInt, identity()));
}
