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

import com.google.common.base.Throwables;
import com.kenai.jffi.Function;
import com.kenai.jffi.HeapInvocationBuffer;
import com.kenai.jffi.Invoker;
import com.kenai.jffi.Library;
import com.kenai.jffi.MemoryIO;
import com.kenai.jffi.Type;
import com.wrmsr.wava.clang.CxIndex;
import com.wrmsr.wava.clang.CxRuntime;
import com.wrmsr.wava.clang.CxString;

import java.io.UnsupportedEncodingException;
import java.util.function.Consumer;

import static java.util.Objects.requireNonNull;

public final class JffiCxRuntime
        implements CxRuntime
{
    final Invoker invoker;
    final MemoryIO memoryIO;
    final Library library;

    final Function clang_getCString;
    final Function clang_disposeString;

    final Function clang_getClangVersion;

    final Function clang_createIndex;
    final Function clang_disposeIndex;

    final Function clang_disposeTranslationUnit;

    final Function clang_getCursorKind;

    private JffiCxRuntime(Invoker invoker, MemoryIO memoryIO, Library library)
    {
        this.invoker = requireNonNull(invoker);
        this.memoryIO = requireNonNull(memoryIO);
        this.library = requireNonNull(library);

        clang_getCString = new Function(library.getSymbolAddress("clang_getCString"), Type.POINTER, JffiCxString.STRUCT);
        clang_disposeString = new Function(library.getSymbolAddress("clang_disposeString"), Type.VOID, JffiCxString.STRUCT);

        clang_getClangVersion = new Function(library.getSymbolAddress("clang_getClangVersion"), JffiCxString.STRUCT);

        clang_createIndex = new Function(library.getSymbolAddress("clang_createIndex"), Type.POINTER, Type.SINT, Type.SINT);
        clang_disposeIndex = new Function(library.getSymbolAddress("clang_disposeIndex"), Type.VOID, Type.POINTER);

        clang_disposeTranslationUnit = new Function(library.getSymbolAddress("clang_disposeTranslationUnit"), Type.VOID, Type.POINTER);

        clang_getCursorKind = new Function(library.getSymbolAddress("clang_getCursorKind"), Type.UINT, JffiCxCursor.STRUCT);
    }

    public static CxRuntime create(String libraryPath)
    {
        Invoker invoker = Invoker.getInstance();
        MemoryIO memory = MemoryIO.getCheckedInstance();
        Library library = Libraries.openLibrary(libraryPath);
        return new JffiCxRuntime(invoker, memory, library);
    }

    @Override
    public void close()
            throws Exception
    {
    }

    @Override
    public CxString getClangVersion()
    {
        return new JffiCxString(this, invokeStruct(clang_getClangVersion, ib -> {
        }));
    }

    @Override
    public CxIndex createIndex(int excludeDeclarationsFromPCH, int displayDiagnostics)
    {
        return new JffiCxIndex(this, invokeAddress(clang_createIndex, ib -> {
            ib.putInt(excludeDeclarationsFromPCH);
            ib.putInt(displayDiagnostics);
        }));
    }

    long invokeAddress(Function function, Consumer<HeapInvocationBuffer> argPopulator)
    {
        HeapInvocationBuffer ib = new HeapInvocationBuffer(function);
        argPopulator.accept(ib);
        return invoker.invokeAddress(function, ib);
    }

    String invokeString(Function function, Consumer<HeapInvocationBuffer> argPopulator)
    {
        long address = invokeAddress(function, argPopulator);
        byte[] bytes = memoryIO.getZeroTerminatedByteArray(address);
        try {
            return new String(bytes, "UTF-8");
        }
        catch (UnsupportedEncodingException e) {
            throw Throwables.propagate(e);
        }
    }

    byte[] invokeStruct(Function function, Consumer<HeapInvocationBuffer> argPopulator)
    {
        HeapInvocationBuffer ib = new HeapInvocationBuffer(function);
        argPopulator.accept(ib);
        return invoker.invokeStruct(function, ib);
    }

    void invokeVoid(Function function, Consumer<HeapInvocationBuffer> argPopulator)
    {
        HeapInvocationBuffer ib = new HeapInvocationBuffer(function);
        argPopulator.accept(ib);
        invoker.invokeInt(function, ib);
    }
}
