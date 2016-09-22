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

import com.kenai.jffi.ClosureManager;
import com.kenai.jffi.Invoker;
import com.kenai.jffi.Library;
import com.kenai.jffi.MemoryIO;
import com.wrmsr.wava.clang.CxCallingConv;
import com.wrmsr.wava.clang.CxCursorKind;
import com.wrmsr.wava.clang.CxCxxAccessSpecifier;
import com.wrmsr.wava.clang.CxError;
import com.wrmsr.wava.clang.CxEvalResultKind;
import com.wrmsr.wava.clang.CxIndex;
import com.wrmsr.wava.clang.CxRefQualifierKind;
import com.wrmsr.wava.clang.CxRuntime;
import com.wrmsr.wava.clang.CxStorageClass;
import com.wrmsr.wava.clang.CxString;
import com.wrmsr.wava.clang.CxTemplateArgumentKind;
import com.wrmsr.wava.clang.CxTokenKind;
import com.wrmsr.wava.clang.CxTranslationUnit;
import com.wrmsr.wava.clang.CxTypeKind;

import static com.wrmsr.wava.clang.jffi.JffiUtils.Address;

public abstract class JffiCxRuntime
        implements CxRuntime
{
    interface LibClang
    {
        void clang_toggleCrashRecovery(int isEnabled);

        String clang_getCString(JffiCxString string);

        void clang_disposeString(JffiCxString string);

        JffiCxString clang_getClangVersion();

        JffiCxIndex clang_createIndex(int excludeDeclarationsFromPCH, int displayDiagnostics);

        void clang_disposeIndex(JffiCxIndex index);

        CxTranslationUnit clang_createTranslationUnit(CxIndex index, String astFilename);

        CxError clang_parseTranslationUnit2(JffiCxIndex index, String sourceFilename, String[] commandLineArgs, int numCommandLineArgs, long unsavedFiles, int numUnsavedFiles, int options, JffiCxTranslationUnit[] out);

        JffiCxCursor clang_getTranslationUnitCursor(JffiCxTranslationUnit translationUnit);

        void clang_disposeTranslationUnit(JffiCxTranslationUnit translationUnit);

        boolean clang_equalCursors(JffiCxCursor cursor, JffiCxCursor other);

        boolean clang_Cursor_isNull(JffiCxCursor cursor);

        int clang_hashCursor(JffiCxCursor cursor);

        CxCursorKind clang_getCursorKind(JffiCxCursor cursor);

        boolean clang_visitChildren(JffiCxCursor parent, JffiCxCursorVisitor visitor, Address clientData);

        JffiCxType clang_getCursorType(JffiCxCursor cursor);

        JffiCxString clang_getTypeSpelling(JffiCxType type);

        JffiCxType clang_getTypedefDeclUnderlyingType(JffiCxCursor cursor);

        JffiCxType clang_getEnumDeclIntegerType(JffiCxCursor cursor);

        long clang_getEnumConstantDeclValue(JffiCxCursor cursor);

        long clang_getEnumConstantDeclUnsignedValue(JffiCxCursor cursor);

        int clang_getFieldDeclBitWidth(JffiCxCursor cursor);

        int clang_Cursor_getNumArguments(JffiCxCursor cursor);

        JffiCxCursor clang_Cursor_getArgument(JffiCxCursor cursor, int i);

        int clang_Cursor_getNumTemplateArguments(JffiCxCursor cursor);

        CxTemplateArgumentKind clang_Cursor_getTemplateArgumentKind(JffiCxCursor cursor, int i);

        JffiCxType clang_Cursor_getTemplateArgumentType(JffiCxCursor cursor, int i);

        long clang_Cursor_getTemplateArgumentValue(JffiCxCursor cursor, int i);

        long clang_Cursor_getTemplateArgumentUnsignedValue(JffiCxCursor cursor, int i);

        boolean clang_equalTypes(JffiCxType a, JffiCxType b);

        JffiCxType clang_getCanonicalType(JffiCxType type);

        boolean clang_isConstQualifiedType(JffiCxType type);

        boolean clang_Cursor_isMacroFunctionLike(JffiCxCursor cursor);

        boolean clang_Cursor_isMacroBuiltin(JffiCxCursor cursor);

        boolean clang_Cursor_isFunctionInlined(JffiCxCursor cursor);

        boolean clang_isVolatileQualifiedType(JffiCxType type);

        boolean clang_isRestrictQualifiedType(JffiCxType type);

        JffiCxType clang_getPointeeType(JffiCxType type);

        JffiCxCursor clang_getTypeDeclaration(JffiCxType type);

        JffiCxString clang_getDeclObjCTypeEncoding(JffiCxCursor cursor);

        JffiCxString clang_Type_getObjCEncoding(JffiCxType typeype);

        JffiCxString clang_getTypeKindSpelling(CxTypeKind K);

        CxCallingConv clang_getFunctionTypeCallingConv(JffiCxType type);

        JffiCxType clang_getResultType(JffiCxType type);

        int clang_getNumArgTypes(JffiCxType type);

        JffiCxType clang_getArgType(JffiCxType type, int i);

        boolean clang_isFunctionTypeVariadic(JffiCxType type);

        JffiCxType clang_getCursorResultType(JffiCxCursor cursor);

        boolean clang_isPODType(JffiCxType type);

        JffiCxType clang_getElementType(JffiCxType type);

        long clang_getNumElements(JffiCxType type);

        JffiCxType clang_getArrayElementType(JffiCxType type);

        long clang_getArraySize(JffiCxType type);

        JffiCxType clang_Type_getNamedType(JffiCxType type);

        long clang_Type_getAlignOf(JffiCxType type);

        JffiCxType clang_Type_getClassType(JffiCxType type);

        long clang_Type_getSizeOf(JffiCxType type);

        long clang_Type_getOffsetOf(JffiCxType type, String s);

        long clang_Cursor_getOffsetOfField(JffiCxCursor cursor);

        boolean clang_Cursor_isAnonymous(JffiCxCursor cursor);

        int clang_Type_getNumTemplateArguments(JffiCxType type);

        JffiCxType clang_Type_getTemplateArgumentAsType(JffiCxType type, int i);

        CxRefQualifierKind clang_Type_getCXXRefQualifier(JffiCxType type);

        boolean clang_Cursor_isBitField(JffiCxCursor cursor);

        boolean clang_isVirtualBase(JffiCxCursor cursor);

        CxCxxAccessSpecifier clang_getCXXAccessSpecifier(JffiCxCursor cursor);

        CxStorageClass clang_Cursor_getStorageClass(JffiCxCursor cursor);

        int clang_getNumOverloadedDecls(JffiCxCursor cursor);

        JffiCxCursor clang_getOverloadedDecl(JffiCxCursor cursor, int index);

        JffiCxType clang_getIBOutletCollectionType(JffiCxCursor cursor);

        JffiCxString clang_getCursorUSR(JffiCxCursor cursor);

        JffiCxString clang_constructUSR_ObjCClass(String className);

        JffiCxString clang_constructUSR_ObjCCategory(String className, String categoryName);

        JffiCxString clang_constructUSR_ObjCProtocol(String protocolName);

        JffiCxString clang_constructUSR_ObjCIvar(String name, JffiCxString classUSR);

        JffiCxString clang_constructUSR_ObjCMethod(String name, boolean isInstanceMethod, JffiCxString classUSR);

        JffiCxString clang_constructUSR_ObjCProperty(String property, JffiCxString classUSR);

        JffiCxString clang_getCursorSpelling(JffiCxCursor cursor);

        JffiCxSourceRange clang_Cursor_getSpellingNameRange(JffiCxCursor cursor, int pieceIndex, int options);

        JffiCxString clang_getCursorDisplayName(JffiCxCursor cursor);

        JffiCxCursor clang_getCursorReferenced(JffiCxCursor cursor);

        JffiCxCursor clang_getCursorDefinition(JffiCxCursor cursor);

        boolean clang_isCursorDefinition(JffiCxCursor cursor);

        JffiCxCursor clang_getCanonicalCursor(JffiCxCursor cursor);

        int clang_Cursor_getObjCSelectorIndex(JffiCxCursor cursor);

        boolean clang_Cursor_isDynamicCall(JffiCxCursor cursor);

        JffiCxType clang_Cursor_getReceiverType(JffiCxCursor cursor);

        JffiCxSourceRange clang_Cursor_getCommentRange(JffiCxCursor cursor);

        JffiCxString clang_Cursor_getRawCommentText(JffiCxCursor cursor);

        JffiCxString clang_Cursor_getBriefCommentText(JffiCxCursor cursor);

        JffiCxString clang_Cursor_getMangling(JffiCxCursor cursor);

        // JffiCxStringSet *clang_Cursor_getCXXManglings(JffiCxCursor);

        JffiCxModule clang_Cursor_getModule(JffiCxCursor cursor);

        // JffiCxModule clang_getModuleForFile(JffiCxTranslationUnit, CXFile);

        // CXFile clang_Module_getASTFile(JffiCxModule Module);

        JffiCxModule clang_Module_getParent(JffiCxModule module);

        JffiCxString clang_Module_getName(JffiCxModule module);

        JffiCxString clang_Module_getFullName(JffiCxModule module);

        boolean clang_Module_isSystem(JffiCxModule Module);

        int clang_Module_getNumTopLevelHeaders(JffiCxTranslationUnit translationUnit, JffiCxModule module);

        // CXFile clang_Module_getTopLevelHeader(JffiCxTranslationUnit, JffiCxModule Module, int Index);

        boolean clang_CXXConstructor_isConvertingConstructor(JffiCxCursor cursor);

        boolean clang_CXXConstructor_isCopyConstructor(JffiCxCursor cursor);

        boolean clang_CXXConstructor_isDefaultConstructor(JffiCxCursor cursor);

        boolean clang_CXXConstructor_isMoveConstructor(JffiCxCursor cursor);

        boolean clang_CXXField_isMutable(JffiCxCursor cursor);

        boolean clang_CXXMethod_isDefaulted(JffiCxCursor cursor);

        boolean clang_CXXMethod_isPureVirtual(JffiCxCursor cursor);

        boolean clang_CXXMethod_isStatic(JffiCxCursor cursor);

        boolean clang_CXXMethod_isVirtual(JffiCxCursor cursor);

        boolean clang_CXXMethod_isConst(JffiCxCursor cursor);

        CxCursorKind clang_getTemplateCursorKind(JffiCxCursor cursor);

        JffiCxCursor clang_getSpecializedCursorTemplate(JffiCxCursor cursor);

        JffiCxSourceRange clang_getCursorReferenceNameRange(JffiCxCursor cursor, int nameFlags, int pieceIndex);

        CxTokenKind clang_getTokenKind(JffiCxToken token);

        JffiCxString clang_getTokenSpelling(JffiCxTranslationUnit translationUnit, JffiCxToken token);

        JffiCxSourceLocation clang_getTokenLocation(JffiCxTranslationUnit translationUnit, JffiCxToken token);

        JffiCxSourceRange clang_getTokenExtent(JffiCxTranslationUnit translationUnit, JffiCxToken token);

        // void clang_tokenize(JffiCxTranslationUnit TU, JffiCxSourceRange Range, JffiCxToken **Tokens, int *NumTokens);
        // void clang_annotateTokens(JffiCxTranslationUnit TU, JffiCxToken *Tokens, int NumTokens, JffiCxCursor *Cursors);
        // void clang_disposeTokens(JffiCxTranslationUnit TU, JffiCxToken *Tokens, int NumTokens);

        JffiCxEvalResult clang_Cursor_Evaluate(JffiCxCursor cursor);

        CxEvalResultKind clang_EvalResult_getKind(JffiCxEvalResult evalResult);

        int clang_EvalResult_getAsInt(JffiCxEvalResult evalResult);

        double clang_EvalResult_getAsDouble(JffiCxEvalResult evalResult);

        String clang_EvalResult_getAsStr(JffiCxEvalResult evalResult);

        void clang_EvalResult_dispose(JffiCxEvalResult evalResult);
    }

    abstract LibClang getLibClang();

    @Override
    public String getClangVersion()
    {
        return CxString.unwrap(getLibClang().clang_getClangVersion());
    }

    @Override
    public CxIndex createIndex(int excludeDeclarationsFromPCH, int displayDiagnostics)
    {
        return getLibClang().clang_createIndex(excludeDeclarationsFromPCH, displayDiagnostics);
    }

    public static CxRuntime create(String libraryPath)
    {
        Invoker invoker = Invoker.getInstance();
        MemoryIO memory = MemoryIO.getCheckedInstance();
        ClosureManager closureManager = ClosureManager.getInstance();
        Library library = JffiUtils.openLibrary(libraryPath);
        return new JffiCxRuntimeImpl(invoker, memory, closureManager, library);
    }
}
