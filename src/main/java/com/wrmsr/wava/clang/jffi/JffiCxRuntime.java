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
import com.wrmsr.wava.clang.CxCursorKind;
import com.wrmsr.wava.clang.CxError;
import com.wrmsr.wava.clang.CxIndex;
import com.wrmsr.wava.clang.CxRuntime;
import com.wrmsr.wava.clang.CxString;
import com.wrmsr.wava.clang.CxTranslationUnit;

import java.math.BigInteger;

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

        JffiCxString clang_getCursorSpelling(JffiCxCursor cursor);

        JffiCxType clang_getCursorType(JffiCxCursor cursor);

        JffiCxString clang_getTypeSpelling(JffiCxType type);

        JffiCxType clang_getTypedefDeclUnderlyingType(JffiCxCursor cursor);

        JffiCxType clang_getEnumDeclIntegerType(JffiCxCursor cursor);

        BigInteger clang_getEnumConstantDeclValue(JffiCxCursor cursor);

        BigInteger clang_getEnumConstantDeclUnsignedValue(JffiCxCursor cursor);

        int clang_getFieldDeclBitWidth(JffiCxCursor cursor);

        int clang_Cursor_getNumArguments(JffiCxCursor cursor);

        JffiCxCursor clang_Cursor_getArgument(JffiCxCursor cursor, int i);
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
