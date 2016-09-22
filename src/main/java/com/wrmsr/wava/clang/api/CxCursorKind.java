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
package com.wrmsr.wava.clang.api;

import java.util.Map;
import java.util.function.IntSupplier;
import java.util.stream.Stream;

import static com.wrmsr.wava.util.collect.MoreCollectors.toImmutableMap;
import static java.util.function.Function.identity;

/**
 * \brief Describes the kind of entity that a cursor refers to.
 */
public enum CxCursorKind
        implements IntSupplier
{
    /* Declarations */
    /**
     * \brief A declaration whose specific kind is not exposed via this
     * interface.
     * <p>
     * Unexposed declarations have the same operations as any other kind
     * of declaration; one can extract their location information,
     * spelling, find their definitions, etc. However, the specific kind
     * of the declaration is not reported.
     */
    UnexposedDecl(1),
    /**
     * \brief A C or C++ struct.
     */
    StructDecl(2),
    /**
     * \brief A C or C++ union.
     */
    UnionDecl(3),
    /**
     * \brief A C++ class.
     */
    ClassDecl(4),
    /**
     * \brief An enumeration.
     */
    EnumDecl(5),
    /**
     * \brief A field (in C) or non-static data member (in C++) in a
     * struct, union, or C++ class.
     */
    FieldDecl(6),
    /**
     * \brief An enumerator constant.
     */
    EnumConstantDecl(7),
    /**
     * \brief A function.
     */
    FunctionDecl(8),
    /**
     * \brief A variable.
     */
    VarDecl(9),
    /**
     * \brief A function or method parameter.
     */
    ParmDecl(10),
    /**
     * \brief An Objective-C \@interface.
     */
    ObjCInterfaceDecl(11),
    /**
     * \brief An Objective-C \@interface for a category.
     */
    ObjCCategoryDecl(12),
    /**
     * \brief An Objective-C \@protocol declaration.
     */
    ObjCProtocolDecl(13),
    /**
     * \brief An Objective-C \@property declaration.
     */
    ObjCPropertyDecl(14),
    /**
     * \brief An Objective-C instance variable.
     */
    ObjCIvarDecl(15),
    /**
     * \brief An Objective-C instance method.
     */
    ObjCInstanceMethodDecl(16),
    /**
     * \brief An Objective-C class method.
     */
    ObjCClassMethodDecl(17),
    /**
     * \brief An Objective-C \@implementation.
     */
    ObjCImplementationDecl(18),
    /**
     * \brief An Objective-C \@implementation for a category.
     */
    ObjCCategoryImplDecl(19),
    /**
     * \brief A typedef.
     */
    TypedefDecl(20),
    /**
     * \brief A C++ class method.
     */
    CXXMethod(21),
    /**
     * \brief A C++ namespace.
     */
    Namespace(22),
    /**
     * \brief A linkage specification, e.g. 'extern "C"'.
     */
    LinkageSpec(23),
    /**
     * \brief A C++ constructor.
     */
    Constructor(24),
    /**
     * \brief A C++ destructor.
     */
    Destructor(25),
    /**
     * \brief A C++ conversion function.
     */
    ConversionFunction(26),
    /**
     * \brief A C++ template type parameter.
     */
    TemplateTypeParameter(27),
    /**
     * \brief A C++ non-type template parameter.
     */
    NonTypeTemplateParameter(28),
    /**
     * \brief A C++ template template parameter.
     */
    TemplateTemplateParameter(29),
    /**
     * \brief A C++ function template.
     */
    FunctionTemplate(30),
    /**
     * \brief A C++ class template.
     */
    ClassTemplate(31),
    /**
     * \brief A C++ class template partial specialization.
     */
    ClassTemplatePartialSpecialization(32),
    /**
     * \brief A C++ namespace alias declaration.
     */
    NamespaceAlias(33),
    /**
     * \brief A C++ using directive.
     */
    UsingDirective(34),
    /**
     * \brief A C++ using declaration.
     */
    UsingDeclaration(35),
    /**
     * \brief A C++ alias declaration
     */
    TypeAliasDecl(36),
    /**
     * \brief An Objective-C \@synthesize definition.
     */
    ObjCSynthesizeDecl(37),
    /**
     * \brief An Objective-C \@dynamic definition.
     */
    ObjCDynamicDecl(38),
    /**
     * \brief An access specifier.
     */
    CXXAccessSpecifier(39),

    // FirstDecl = CXCursor_UnexposedDecl,
    // LastDecl = CXCursor_CXXAccessSpecifier,

    /* References */
    FirstRef(40),

    /* Decl references */
    // ObjCSuperClassRef(40),
    // ObjCProtocolRef(41),
    // ObjCClassRef(42),

    /**
     * \brief A reference to a type declaration.
     * <p>
     * A type reference occurs anywhere where a type is named but not
     * declared. For example, given:
     * <p>
     * \code
     * typedef unsigned size_type;
     * size_type size;
     * \endcode
     * <p>
     * The typedef is a declaration of size_type (TypedefDecl),
     * while the type of the variable "size" is referenced. The cursor
     * referenced by the type of size is the typedef for size_type.
     */
    TypeRef(43),
    CXXBaseSpecifier(44),
    /**
     * \brief A reference to a class template, function template, template
     * template parameter, or class template partial specialization.
     */
    TemplateRef(45),
    /**
     * \brief A reference to a namespace or namespace alias.
     */
    NamespaceRef(46),
    /**
     * \brief A reference to a member of a struct, union, or class that occurs in
     * some non-expression context, e.g., a designated initializer.
     */
    MemberRef(47),
    /**
     * \brief A reference to a labeled statement.
     * <p>
     * This cursor kind is used to describe the jump to "start_over" in the
     * goto statement in the following example:
     * <p>
     * \code
     * start_over:
     * ++counter;
     * <p>
     * goto start_over;
     * \endcode
     * <p>
     * A label reference cursor refers to a label statement.
     */
    LabelRef(48),

    /**
     * \brief A reference to a set of overloaded functions or function templates
     * that has not yet been resolved to a specific function or function template.
     * <p>
     * An overloaded declaration reference cursor occurs in C++ templates where
     * a dependent name refers to a function. For example:
     * <p>
     * \code
     * template<typename T> void swap(T&, T&);
     * <p>
     * struct X { ... };
     * void swap(X&, X&);
     * <p>
     * template<typename T>
     * void reverse(T* first, T* last) {
     * while (first < last - 1) {
     * swap(*first, *--last);
     * ++first;
     * }
     * }
     * <p>
     * struct Y { };
     * void swap(Y&, Y&);
     * \endcode
     * <p>
     * Here, the identifier "swap" is associated with an overloaded declaration
     * reference. In the template definition, "swap" refers to either of the two
     * "swap" functions declared above, so both results will be available. At
     * instantiation time, "swap" may also refer to other functions found via
     * argument-dependent lookup (e.g., the "swap" function at the end of the
     * example).
     * <p>
     * The functions \c clang_getNumOverloadedDecls() and
     * \c clang_getOverloadedDecl() can be used to retrieve the definitions
     * referenced by this cursor.
     */
    OverloadedDeclRef(49),

    /**
     * \brief A reference to a variable that occurs in some non-expression
     * context, e.g., a C++ lambda capture list.
     */
    VariableRef(50),

    // LastRef = CXCursor_VariableRef,

    /* Error conditions */
    // FirstInvalid(70),
    InvalidFile(70),
    NoDeclFound(71),
    NotImplemented(72),
    InvalidCode(73),
    // LastInvalid = CXCursor_InvalidCode,

    /* Expressions */
    // FirstExpr(100),

    /**
     * \brief An expression whose specific kind is not exposed via this
     * interface.
     * <p>
     * Unexposed expressions have the same operations as any other kind
     * of expression; one can extract their location information,
     * spelling, children, etc. However, the specific kind of the
     * expression is not reported.
     */
    UnexposedExpr(100),

    /**
     * \brief An expression that refers to some value declaration, such
     * as a function, variable, or enumerator.
     */
    DeclRefExpr(101),

    /**
     * \brief An expression that refers to a member of a struct, union,
     * class, Objective-C class, etc.
     */
    MemberRefExpr(102),

    /**
     * \brief An expression that calls a function.
     */
    CallExpr(103),

    /**
     * \brief An expression that sends a message to an Objective-C
     * object or class.
     */
    ObjCMessageExpr(104),

    /**
     * \brief An expression that represents a block literal.
     */
    BlockExpr(105),

    /**
     * \brief An integer literal.
     */
    IntegerLiteral(106),

    /**
     * \brief A floating point number literal.
     */
    FloatingLiteral(107),

    /**
     * \brief An imaginary number literal.
     */
    ImaginaryLiteral(108),

    /**
     * \brief A string literal.
     */
    StringLiteral(109),

    /**
     * \brief A character literal.
     */
    CharacterLiteral(110),

    /**
     * \brief A parenthesized expression, e.g. "(1)".
     * <p>
     * This AST node is only formed if full location information is requested.
     */
    ParenExpr(111),

    /**
     * \brief This represents the unary-expression's (except sizeof and
     * alignof).
     */
    UnaryOperator(112),

    /**
     * \brief [C99 6.5.2.1] Array Subscripting.
     */
    ArraySubscriptExpr(113),

    /**
     * \brief A builtin binary operation expression such as "x + y" or
     * "x <= y".
     */
    BinaryOperator(114),

    /**
     * \brief Compound assignment such as "+=".
     */
    CompoundAssignOperator(115),

    /**
     * \brief The ?: ternary operator.
     */
    ConditionalOperator(116),

    /**
     * \brief An explicit cast in C (C99 6.5.4) or a C-style cast in C++
     * (C++ [expr.cast]), which uses the syntax (Type)expr.
     * <p>
     * For example: (int)f.
     */
    CStyleCastExpr(117),

    /**
     * \brief [C99 6.5.2.5]
     */
    CompoundLiteralExpr(118),

    /**
     * \brief Describes an C or C++ initializer list.
     */
    InitListExpr(119),

    /**
     * \brief The GNU address of label extension, representing &&label.
     */
    AddrLabelExpr(120),

    /**
     * \brief This is the GNU Statement Expression extension: ({int X=4; X;})
     */
    StmtExpr(121),

    /**
     * \brief Represents a C11 generic selection.
     */
    GenericSelectionExpr(122),

    /**
     * \brief Implements the GNU __null extension, which is a name for a null
     * pointer constant that has integral type (e.g., int or long) and is the same
     * size and alignment as a pointer.
     * <p>
     * The __null extension is typically only used by system headers, which define
     * NULL as __null in C++ rather than using 0 (which is an integer that may not
     * match the size of a pointer).
     */
    GNUNullExpr(123),

    /**
     * \brief C++'s static_cast<> expression.
     */
    CXXStaticCastExpr(124),

    /**
     * \brief C++'s dynamic_cast<> expression.
     */
    CXXDynamicCastExpr(125),

    /**
     * \brief C++'s reinterpret_cast<> expression.
     */
    CXXReinterpretCastExpr(126),

    /**
     * \brief C++'s const_cast<> expression.
     */
    CXXConstCastExpr(127),

    /**
     * \brief Represents an explicit C++ type conversion that uses "functional"
     * notion (C++ [expr.type.conv]).
     * <p>
     * Example:
     * \code
     * x = int(0.5);
     * \endcode
     */
    CXXFunctionalCastExpr(128),

    /**
     * \brief A C++ typeid expression (C++ [expr.typeid]).
     */
    CXXTypeidExpr(129),

    /**
     * \brief [C++ 2.13.5] C++ Boolean Literal.
     */
    CXXBoolLiteralExpr(130),

    /**
     * \brief [C++0x 2.14.7] C++ Pointer Literal.
     */
    CXXNullPtrLiteralExpr(131),

    /**
     * \brief Represents the "this" expression in C++
     */
    CXXThisExpr(132),

    /**
     * \brief [C++ 15] C++ Throw Expression.
     * <p>
     * This handles 'throw' and 'throw' assignment-expression. When
     * assignment-expression isn't present, Op will be null.
     */
    CXXThrowExpr(133),

    /**
     * \brief A new expression for memory allocation and constructor calls, e.g:
     * "new CXXNewExpr(foo)".
     */
    CXXNewExpr(134),

    /**
     * \brief A delete expression for memory deallocation and destructor calls,
     * e.g. "delete[] pArray".
     */
    CXXDeleteExpr(135),

    /**
     * \brief A unary expression. (noexcept, sizeof, or other traits)
     */
    UnaryExpr(136),

    /**
     * \brief An Objective-C string literal i.e. @"foo".
     */
    ObjCStringLiteral(137),

    /**
     * \brief An Objective-C \@encode expression.
     */
    ObjCEncodeExpr(138),

    /**
     * \brief An Objective-C \@selector expression.
     */
    ObjCSelectorExpr(139),

    /**
     * \brief An Objective-C \@protocol expression.
     */
    ObjCProtocolExpr(140),

    /**
     * \brief An Objective-C "bridged" cast expression, which casts between
     * Objective-C pointers and C pointers, transferring ownership in the process.
     * <p>
     * \code
     * NSString *str = (__bridge_transfer NSString *)CFCreateString();
     * \endcode
     */
    ObjCBridgedCastExpr(141),

    /**
     * \brief Represents a C++0x pack expansion that produces a sequence of
     * expressions.
     * <p>
     * A pack expansion expression contains a pattern (which itself is an
     * expression) followed by an ellipsis. For example:
     * <p>
     * \code
     * template<typename F, typename ...Types>
     * void forward(F f, Types &&...args) {
     * f(static_cast<Types&&>(args)...);
     * }
     * \endcode
     */
    PackExpansionExpr(142),

    /**
     * \brief Represents an expression that computes the length of a parameter
     * pack.
     * <p>
     * \code
     * template<typename ...Types>
     * struct count {
     * static const unsigned value = sizeof...(Types);
     * };
     * \endcode
     */
    SizeOfPackExpr(143),

    /* \brief Represents a C++ lambda expression that produces a local function
     * object.
     *
     * \code
     * void abssort(float *x, unsigned N) {
     *   std::sort(x, x + N,
     *             [](float a, float b) {
     *               return std::abs(a) < std::abs(b);
     *             });
     * }
     * \endcode
     */
    LambdaExpr(144),

    /**
     * \brief Objective-c Boolean Literal.
     */
    ObjCBoolLiteralExpr(145),

    /**
     * \brief Represents the "self" expression in an Objective-C method.
     */
    ObjCSelfExpr(146),

    /**
     * \brief OpenMP 4.0 [2.4, Array Section].
     */
    OMPArraySectionExpr(147),

    /**
     * \brief Represents an @available(...) check.
     */
    ObjCAvailabilityCheckExpr(148),

    // LastExpr = CXCursor_ObjCAvailabilityCheckExpr,

    /* Statements */
    // FirstStmt(200),
    /**
     * \brief A statement whose specific kind is not exposed via this
     * interface.
     * <p>
     * Unexposed statements have the same operations as any other kind of
     * statement; one can extract their location information, spelling,
     * children, etc. However, the specific kind of the statement is not
     * reported.
     */
    UnexposedStmt(200),

    /**
     * \brief A labelled statement in a function.
     * <p>
     * This cursor kind is used to describe the "start_over:" label statement in
     * the following example:
     * <p>
     * \code
     * start_over:
     * ++counter;
     * \endcode
     */
    LabelStmt(201),

    /**
     * \brief A group of statements like { stmt stmt }.
     * <p>
     * This cursor kind is used to describe compound statements, e.g. function
     * bodies.
     */
    CompoundStmt(202),

    /**
     * \brief A case statement.
     */
    CaseStmt(203),

    /**
     * \brief A default statement.
     */
    DefaultStmt(204),

    /**
     * \brief An if statement
     */
    IfStmt(205),

    /**
     * \brief A switch statement.
     */
    SwitchStmt(206),

    /**
     * \brief A while statement.
     */
    WhileStmt(207),

    /**
     * \brief A do statement.
     */
    DoStmt(208),

    /**
     * \brief A for statement.
     */
    ForStmt(209),

    /**
     * \brief A goto statement.
     */
    GotoStmt(210),

    /**
     * \brief An indirect goto statement.
     */
    IndirectGotoStmt(211),

    /**
     * \brief A continue statement.
     */
    ContinueStmt(212),

    /**
     * \brief A break statement.
     */
    BreakStmt(213),

    /**
     * \brief A return statement.
     */
    ReturnStmt(214),

    /**
     * \brief A GCC inline assembly statement extension.
     */
    GCCAsmStmt(215),
    // AsmStmt = CXCursor_GCCAsmStmt,

    /**
     * \brief Objective-C's overall \@try-\@catch-\@finally statement.
     */
    ObjCAtTryStmt(216),

    /**
     * \brief Objective-C's \@catch statement.
     */
    ObjCAtCatchStmt(217),

    /**
     * \brief Objective-C's \@finally statement.
     */
    ObjCAtFinallyStmt(218),

    /**
     * \brief Objective-C's \@throw statement.
     */
    ObjCAtThrowStmt(219),

    /**
     * \brief Objective-C's \@synchronized statement.
     */
    ObjCAtSynchronizedStmt(220),

    /**
     * \brief Objective-C's autorelease pool statement.
     */
    ObjCAutoreleasePoolStmt(221),

    /**
     * \brief Objective-C's collection statement.
     */
    ObjCForCollectionStmt(222),

    /**
     * \brief C++'s catch statement.
     */
    CXXCatchStmt(223),

    /**
     * \brief C++'s try statement.
     */
    CXXTryStmt(224),

    /**
     * \brief C++'s for (* : *) statement.
     */
    CXXForRangeStmt(225),

    /**
     * \brief Windows Structured Exception Handling's try statement.
     */
    SEHTryStmt(226),

    /**
     * \brief Windows Structured Exception Handling's except statement.
     */
    SEHExceptStmt(227),

    /**
     * \brief Windows Structured Exception Handling's finally statement.
     */
    SEHFinallyStmt(228),

    /**
     * \brief A MS inline assembly statement extension.
     */
    MSAsmStmt(229),

    /**
     * \brief The null statement ";": C99 6.8.3p3.
     * <p>
     * This cursor kind is used to describe the null statement.
     */
    NullStmt(230),

    /**
     * \brief Adaptor class for mixing declarations with statements and
     * expressions.
     */
    DeclStmt(231),

    /**
     * \brief OpenMP parallel directive.
     */
    OMPParallelDirective(232),

    /**
     * \brief OpenMP SIMD directive.
     */
    OMPSimdDirective(233),

    /**
     * \brief OpenMP for directive.
     */
    OMPForDirective(234),

    /**
     * \brief OpenMP sections directive.
     */
    OMPSectionsDirective(235),

    /**
     * \brief OpenMP section directive.
     */
    OMPSectionDirective(236),

    /**
     * \brief OpenMP single directive.
     */
    OMPSingleDirective(237),

    /**
     * \brief OpenMP parallel for directive.
     */
    OMPParallelForDirective(238),

    /**
     * \brief OpenMP parallel sections directive.
     */
    OMPParallelSectionsDirective(239),

    /**
     * \brief OpenMP task directive.
     */
    OMPTaskDirective(240),

    /**
     * \brief OpenMP master directive.
     */
    OMPMasterDirective(241),

    /**
     * \brief OpenMP critical directive.
     */
    OMPCriticalDirective(242),

    /**
     * \brief OpenMP taskyield directive.
     */
    OMPTaskyieldDirective(243),

    /**
     * \brief OpenMP barrier directive.
     */
    OMPBarrierDirective(244),

    /**
     * \brief OpenMP taskwait directive.
     */
    OMPTaskwaitDirective(245),

    /**
     * \brief OpenMP flush directive.
     */
    OMPFlushDirective(246),

    /**
     * \brief Windows Structured Exception Handling's leave statement.
     */
    SEHLeaveStmt(247),

    /**
     * \brief OpenMP ordered directive.
     */
    OMPOrderedDirective(248),

    /**
     * \brief OpenMP atomic directive.
     */
    OMPAtomicDirective(249),

    /**
     * \brief OpenMP for SIMD directive.
     */
    OMPForSimdDirective(250),

    /**
     * \brief OpenMP parallel for SIMD directive.
     */
    OMPParallelForSimdDirective(251),

    /**
     * \brief OpenMP target directive.
     */
    OMPTargetDirective(252),

    /**
     * \brief OpenMP teams directive.
     */
    OMPTeamsDirective(253),

    /**
     * \brief OpenMP taskgroup directive.
     */
    OMPTaskgroupDirective(254),

    /**
     * \brief OpenMP cancellation point directive.
     */
    OMPCancellationPointDirective(255),

    /**
     * \brief OpenMP cancel directive.
     */
    OMPCancelDirective(256),

    /**
     * \brief OpenMP target data directive.
     */
    OMPTargetDataDirective(257),

    /**
     * \brief OpenMP taskloop directive.
     */
    OMPTaskLoopDirective(258),

    /**
     * \brief OpenMP taskloop simd directive.
     */
    OMPTaskLoopSimdDirective(259),

    /**
     * \brief OpenMP distribute directive.
     */
    OMPDistributeDirective(260),

    /**
     * \brief OpenMP target enter data directive.
     */
    OMPTargetEnterDataDirective(261),

    /**
     * \brief OpenMP target exit data directive.
     */
    OMPTargetExitDataDirective(262),

    /**
     * \brief OpenMP target parallel directive.
     */
    OMPTargetParallelDirective(263),

    /**
     * \brief OpenMP target parallel for directive.
     */
    OMPTargetParallelForDirective(264),

    /**
     * \brief OpenMP target update directive.
     */
    OMPTargetUpdateDirective(265),

    /**
     * \brief OpenMP distribute parallel for directive.
     */
    OMPDistributeParallelForDirective(266),

    /**
     * \brief OpenMP distribute parallel for simd directive.
     */
    OMPDistributeParallelForSimdDirective(267),

    /**
     * \brief OpenMP distribute simd directive.
     */
    OMPDistributeSimdDirective(268),

    /**
     * \brief OpenMP target parallel for simd directive.
     */
    OMPTargetParallelForSimdDirective(269),

    /**
     * \brief OpenMP target simd directive.
     */
    OMPTargetSimdDirective(270),

    /**
     * \brief OpenMP teams distribute directive.
     */
    OMPTeamsDistributeDirective(271),

    // LastStmt = CXCursor_OMPTeamsDistributeDirective,

    /**
     * \brief Cursor that represents the translation unit itself.
     * <p>
     * The translation unit cursor exists primarily to act as the root
     * cursor for traversing the contents of a translation unit.
     */
    TranslationUnit(300),

    /* Attributes */
    // FirstAttr(400),
    /**
     * \brief An attribute whose specific kind is not exposed via this
     * interface.
     */
    UnexposedAttr(400),

    IBActionAttr(401),
    IBOutletAttr(402),
    IBOutletCollectionAttr(403),
    CXXFinalAttr(404),
    CXXOverrideAttr(405),
    AnnotateAttr(406),
    AsmLabelAttr(407),
    PackedAttr(408),
    PureAttr(409),
    ConstAttr(410),
    NoDuplicateAttr(411),
    CUDAConstantAttr(412),
    CUDADeviceAttr(413),
    CUDAGlobalAttr(414),
    CUDAHostAttr(415),
    CUDASharedAttr(416),
    VisibilityAttr(417),
    DLLExport(418),
    DLLImport(419),
    // LastAttr = CXCursor_DLLImport,

    /* Preprocessing */
    PreprocessingDirective(500),
    MacroDefinition(501),
    MacroExpansion(502),
    // MacroInstantiation = CXCursor_MacroExpansion,
    InclusionDirective(503),
    // FirstPreprocessing = CXCursor_PreprocessingDirective,
    // LastPreprocessing = CXCursor_InclusionDirective,

    /* Extra Declarations */
    /**
     * \brief A module import declaration.
     */
    ModuleImportDecl(600),
    TypeAliasTemplateDecl(601),
    /**
     * \brief A static_assert or _Static_assert node
     */
    StaticAssert(602),
    // FirstExtraDecl = CXCursor_ModuleImportDecl,
    // LastExtraDecl = CXCursor_StaticAssert,

    /**
     * \brief A code completion overload candidate.
     */
    OverloadCandidate(700);

    private final int value;

    CxCursorKind(int value)
    {
        this.value = value;
    }

    @Override
    public int getAsInt()
    {
        return value;
    }

    public static final Map<Integer, CxCursorKind> BY_VALUE = Stream.of(values()).collect(toImmutableMap(CxCursorKind::getAsInt, identity()));
}
