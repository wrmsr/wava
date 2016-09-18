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
 * \brief Describes the kind of type
 */
public enum CxTypeKind
        implements IntSupplier
{
    /**
     * \brief Represents an invalid type (e.g., where no type is available).
     */
    Invalid(0),

    /**
     * \brief A type whose specific kind is not exposed via this
     * interface.
     */
    Unexposed(1),

    /* Builtin types */
    Void(2),
    Bool(3),
    Char_U(4),
    UChar(5),
    Char16(6),
    Char32(7),
    UShort(8),
    UInt(9),
    ULong(10),
    ULongLong(11),
    UInt128(12),
    Char_S(13),
    SChar(14),
    WChar(15),
    Short(16),
    Int(17),
    Long(18),
    LongLong(19),
    Int128(20),
    Float(21),
    Double(22),
    LongDouble(23),
    NullPtr(24),
    Overload(25),
    Dependent(26),
    ObjCId(27),
    ObjCClass(28),
    ObjCSel(29),
    Float128(30),
    // FirstBuiltin = CXType_Void,
    // LastBuiltin = CXType_ObjCSel,

    Complex(100),

    Pointer(101),
    BlockPointer(102),
    LValueReference(103),
    RValueReference(104),
    Record(105),
    Enum(106),
    Typedef(107),
    ObjCInterface(108),
    ObjCObjectPointer(109),
    FunctionNoProto(110),
    FunctionProto(111),
    ConstantArray(112),
    Vector(113),
    IncompleteArray(114),
    VariableArray(115),
    DependentSizedArray(116),
    MemberPointer(117),
    Auto(118),

    /**
     * \brief Represents a type that was referred to using an elaborated type keyword.
     * <p>
     * E.g., struct S, or via a qualified name, e.g., N::M::type, or both.
     */
    Elaborated(119);

    private final int value;

    CxTypeKind(int value)
    {
        this.value = value;
    }

    @Override
    public int getAsInt()
    {
        return value;
    }

    public static final Map<Integer, CxTypeKind> BY_VALUE = Stream.of(values()).collect(toImmutableMap(CxTypeKind::getAsInt, identity()));
}

