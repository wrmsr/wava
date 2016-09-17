/*
 * Copyright 2013 John Leacox
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package com.wrmsr.wava.util.process;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This class wraps {@link ProcessBuilder} for creating operating system processes using the safer
 * {@link FinalizedProcess}.
 * <p>
 * <p>
 * Like {@code ProcessBuilder}, each {@code FinalizedProcessBuilder} instance manages a collection of process
 * attributes. The {@link #start()} method creates a new {@link FinalizedProcess} instance with these attributes. The
 * {@link #start()} method can be invoked multiple times from the same instance to create new subprocesses with
 * identical or related attributes.
 * <p>
 * <p>
 * Each process builder manages the following attributes, in addition to the attributes from {@link ProcessBuilder}:
 * <p>
 * <p>
 * <ul>
 * <p>
 * <li>a <i>keepProcess</i> indicator, a boolean indicator as to whether the process should be destroyed during cleanup
 * or not. By default the process will be destroyed during cleanup.</li>
 * <p>
 * </ul>
 * <p>
 * <p>
 * Starting a new process with the default attributes is just as easy as {@link ProcessBuilder}:
 * <p>
 * <pre>
 * {
 * 	&#064;code
 * 	FinalizedProcess process = new ProcessBuilder(&quot;myCommand&quot;, &quot;myArg&quot;).start();
 * }
 * </pre>
 * <p>
 * <p>
 * Here is an example that redirects standard error to standard output and does not destroy the process when the process
 * is closed:
 * <p>
 * <pre>
 * {
 * 	&#064;code
 * 	FinalizedProcessBuilder pb = new FinalizedProcessBuilder(&quot;myCommand&quot;, &quot;myArg&quot;);
 * 	pb.redirectErrorStream(true);
 * 	pb.keepProcess();
 * 	FinalizedProcess process = pb.start();
 * }
 * </pre>
 *
 * @author John Leacox
 * @see ProcessBuilder
 */
public class FinalizedProcessBuilder
{
    private final ProcessBuilder processBuilder;

    private boolean keepProcess = false;
    private boolean gobbleInput = false;
    private boolean gobbleInputLogging = false;
    private boolean gobbleError = false;
    private boolean gobbleErrorLogging = false;

    /**
     * Constructs a process builder with the specified operating system program and arguments. This constructor does
     * <i>not</i> make a copy of the {@code command} list. Subsequent updates to the list will be reflected in the state
     * of the process builder. It is not checked whether {@code command} corresponds to a valid operating system
     * command.
     *
     * @param command the list containing the program and its arguments (cannot be null)
     * @throws NullPointerException if command is null
     */
    public FinalizedProcessBuilder(List<String> command)
    {
        if (command == null) {
            throw new NullPointerException();
        }
        this.processBuilder = new ProcessBuilder(command);
    }

    /**
     * Constructs a process builder with the specified operating system program and arguments. This is a convenience
     * constructor that sets the process builder's command to a string list containing the same strings as the command
     * array, in the same order. It is not checked whether command corresponds to a valid operating system command.
     *
     * @param command a string array containing the program and its arguments
     */
    public FinalizedProcessBuilder(String... command)
    {
        this.processBuilder = new ProcessBuilder(command);
    }

    /**
     * Returns this process builder's operating system program and arguments. The returned list is <i>not</i> a copy.
     * Subsequent updates to the list will be reflected in the state of this process builder.
     *
     * @return this process builder's program and its arguments
     */
    public List<String> command()
    {
        return processBuilder.command();
    }

    /**
     * Sets this process builder's operating system program and arguments. This method does <i>not</i> make a copy of
     * the {@code command} list. Subsequent updates to the list will be reflected in the state of the process builder.
     * It is not checked whether {@code command} corresponds to a valid operating system command.
     *
     * @param command the list containing the program and its arguments (cannot be null)
     * @return this process builder
     * @throws NullPointerException if the command is null
     */
    public FinalizedProcessBuilder command(List<String> command)
    {
        if (command == null) {
            throw new NullPointerException();
        }
        processBuilder.command(command);
        return this;
    }

    /**
     * Sets this process builder's operating system program and arguments. This is a convenience method that sets the
     * command to a string list containing the same strings as the {@code command} array, in the same order. It is not
     * checked whether {@code command} corresponds to a valid operating system command.
     *
     * @param command a string array containing the program and its arguments
     * @return this process builder
     */
    public FinalizedProcessBuilder command(String... command)
    {
        processBuilder.command(command);
        return this;
    }

    /**
     * Returns this process builder's working directory.
     * <p>
     * Subprocesses subsequently started by this object's {@link #start()} method will use this as their working
     * directory. The returned value may be {@code null} -- this means to use the working directory of the current Java
     * process, usually the directory named by the system property {@code user.dir}, as the working directory of the
     * child process.
     *
     * @return this process builder's working directory
     */
    public File directory()
    {
        return processBuilder.directory();
    }

    /**
     * Sets this process builder's working directory.
     * <p>
     * Subprocesses subsequently started by this object's {@link #start()} method will use this as their working
     * directory. The argument may be {@code null} -- this means to use the working directory of the current Java
     * process, usually the directory named by the system property {@code user.dir}, as the working directory of the
     * child process.
     *
     * @param directory the new working directory
     * @return this process builder
     */
    public FinalizedProcessBuilder directory(File directory)
    {
        processBuilder.directory(directory);
        return this;
    }

    /**
     * Returns a string map view of this process builder's environment.
     * <p>
     * Whenever a process builder is created, the environment is initialized to a copy of the current process
     * environment (see {@link System#getenv()}). Subprocesses subsequently started by this object's {@link #start()}
     * method will use this map as their environment.
     * <p>
     * <p>
     * The returned object may be modified using ordinary {@link Map Map} operations. These modifications will
     * be visible to subprocesses started via the {@link #start()} method. Two {@code ProcessBuilder} instances always
     * contain independent process environments, so changes to the returned map will never be reflected in any other
     * {@code ProcessBuilder} instance or the values returned by {@link System#getenv System.getenv}.
     * <p>
     * <p>
     * If the system does not support environment variables, an empty map is returned.
     * <p>
     * <p>
     * The returned map does not permit null keys or values. Attempting to insert or query the presence of a null key or
     * value will throw a {@link NullPointerException}. Attempting to query the presence of a key or value which is not
     * of type {@link String} will throw a {@link ClassCastException}.
     * <p>
     * <p>
     * The behavior of the returned map is system-dependent. A system may not allow modifications to environment
     * variables or may forbid certain variable names or values. For this reason, attempts to modify the map may fail
     * with {@link UnsupportedOperationException} or {@link IllegalArgumentException} if the modification is not
     * permitted by the operating system.
     * <p>
     * <p>
     * Since the external format of environment variable names and values is system-dependent, there may not be a
     * one-to-one mapping between them and Java's Unicode strings. Nevertheless, the map is implemented in such a way
     * that environment variables which are not modified by Java code will have an unmodified native representation in
     * the subprocess.
     * <p>
     * <p>
     * The returned map and its collection views may not obey the general contract of the {@link Object#equals} and
     * {@link Object#hashCode} methods.
     * <p>
     * <p>
     * The returned map is typically case-sensitive on all platforms.
     * <p>
     * <p>
     * If a security manager exists, its {@link SecurityManager#checkPermission checkPermission} method is called with a
     * {@link RuntimePermission} {@code ("getenv.*")} permission. This may result in a {@link SecurityException} being
     * thrown.
     * <p>
     * <p>
     * When passing information to a Java subprocess, <a href=System.html#EnvironmentVSSystemProperties>system
     * properties</a> are generally preferred over environment variables.
     *
     * @return this process builder's environment
     * @throws SecurityException if a security manager exists and its {@link SecurityManager#checkPermission checkPermission} method
     * doesn't allow access to the process environment
     * @see Runtime#exec(String[], String[], File)
     * @see System#getenv()
     */
    public Map<String, String> environment()
    {
        return processBuilder.environment();
    }

    /**
     * Tells whether this process builder merges standard error and standard output.
     * <p>
     * <p>
     * If this property is {@code true}, then any error output generated by subprocesses subsequently started by this
     * object's {@link #start()} method will be merged with the standard output, so that both can be read using the
     * {@link Process#getInputStream()} method. This makes it easier to correlate error messages with the corresponding
     * output. The initial value is {@code false}.
     *
     * @return this process builder's {@code redirectErrorStream} property
     */
    public boolean redirectErrorStream()
    {
        return processBuilder.redirectErrorStream();
    }

    /**
     * Sets this process builder's {@code redirectErrorStream} property.
     * <p>
     * <p>
     * If this property is {@code true}, then any error output generated by subprocesses subsequently started by this
     * object's {@link #start()} method will be merged with the standard output, so that both can be read using the
     * {@link Process#getInputStream()} method. This makes it easier to correlate error messages with the corresponding
     * output. The initial value is {@code false}.
     *
     * @param redirectErrorStream the new property value
     * @return this process builder
     */
    public FinalizedProcessBuilder redirectErrorStream(boolean redirectErrorStream)
    {
        processBuilder.redirectErrorStream(redirectErrorStream);
        return this;
    }

    /**
     * Tells whether this process builder destroys the subprocess when it is closed or not.
     * <p>
     * <p>
     * If this property is {@code true}, then when the subprocess is closed, the subprocess will also be destroyed via
     * {@code Process#destroy()}. This prevents the subprocess from continuing to run indefinitely, even after there are
     * no longer any references to it in the parent process.
     * <p>
     * <p>
     * If this property is {@code false}, then the subprocess will not be automatically destroyed when
     * {@code FinalizedProcess#close()} is called. This is useful if the subprocess should continue running
     * indefinitely.
     *
     * @return this process builder's {@code keepProcess} property
     */
    public boolean keepProcess()
    {
        return keepProcess;
    }

    /**
     * Sets this process builder's {@code keepProcess} property.
     * <p>
     * <p>
     * If this property is {@code true}, then when the subprocess is closed, the subprocess will also be destroyed via
     * {@code Process#destroy()}. This prevents the subprocess from continuing to run indefinitely, even after there are
     * no longer any references to it in the parent process.
     * <p>
     * <p>
     * If this property is {@code false}, then the subprocess will not be automatically destroyed when
     * {@code FinalizedProcess#close()} is called. This is useful if the subprocess should continue running
     * indefinitely.
     *
     * @param keepProcess the new property value
     * @return this process builder
     */
    public FinalizedProcessBuilder keepProcess(boolean keepProcess)
    {
        this.keepProcess = keepProcess;
        return this;
    }

    /**
     * Tells whether the created sub process will gobble the input stream or not.
     * <p>
     * <p>
     * If this property is {@code true}, then the sub process input stream will be automatically gobbled.
     * <p>
     * <p>
     * If this property is {@code false}, then the sub process input stream will not be gobbled.
     *
     * @return this process builder's {@code gobbleInput} property
     */
    public boolean gobbleInputStream()
    {
        return gobbleInput;
    }

    /**
     * Sets this process builder's {@code gobbleInput} property.
     * <p>
     * <p>
     * If this property is {@code true}, then the sub process input stream will be automatically gobbled.
     * <p>
     * <p>
     * If this property is {@code false}, then the sub process input stream will not be gobbled.
     *
     * @param gobbleInput the new property value
     * @return this process builder
     */
    public FinalizedProcessBuilder gobbleInputStream(boolean gobbleInput)
    {
        this.gobbleInput = gobbleInput;
        return this;
    }

    /**
     * Tells whether the created sub process will gobble the input stream and log the output or not.
     * <p>
     * <p>
     * If this property is {@code true}, then the sub process input stream will be automatically gobbled and logged.
     * <p>
     * <p>
     * If this property is {@code false}, then the sub process input stream will not be gobbled.
     *
     * @return this process builder's {@code gobbleInputLogging} property
     */
    public boolean gobbleInputStreamWithLogging()
    {
        return gobbleInput && gobbleInputLogging;
    }

    /**
     * Sets this process builder's {@code gobbleInputLogging} property.
     * <p>
     * <p>
     * If this property is {@code true}, then the sub process input stream will be automatically gobbled and logged.
     * <p>
     * <p>
     * If this property is {@code false}, then the sub process input stream will not be gobbled.
     *
     * @param gobbleInput the new property value
     * @return this process builder
     */
    public FinalizedProcessBuilder gobbleInputStreamWithLogging(boolean gobbleInput)
    {
        this.gobbleInput = gobbleInput;
        this.gobbleInputLogging = gobbleInput;
        return this;
    }

    /**
     * Tells whether the created sub process will gobble the error stream or not.
     * <p>
     * <p>
     * If this property is {@code true}, then the sub process error stream will be automatically gobbled.
     * <p>
     * <p>
     * If this property is {@code false}, then the sub process error stream will not be gobbled.
     *
     * @return this process builder's {@code gobbleError} property
     */
    public boolean gobbleErrorStream()
    {
        return gobbleError;
    }

    /**
     * Sets this process builder's {@code gobbleError} property.
     * <p>
     * <p>
     * If this property is {@code true}, then the sub process error stream will be automatically gobbled.
     * <p>
     * <p>
     * If this property is {@code false}, then the sub process error stream will not be gobbled.
     *
     * @param gobbleError the new property value
     * @return this process builder
     */
    public FinalizedProcessBuilder gobbleErrorStream(boolean gobbleError)
    {
        this.gobbleError = gobbleError;
        return this;
    }

    /**
     * Tells whether the created sub process will gobble the error stream and log the output or not.
     * <p>
     * <p>
     * If this property is {@code true}, then the sub process error stream will be automatically gobbled and logged.
     * <p>
     * <p>
     * If this property is {@code false}, then the sub process error stream will not be gobbled.
     *
     * @return this process builder's {@code gobbleErrorLogging} property
     */
    public boolean gobbleErrorStreamWithLogging()
    {
        return gobbleError && gobbleErrorLogging;
    }

    /**
     * Sets this process builder's {@code gobbleErrorLogging} property.
     * <p>
     * <p>
     * If this property is {@code true}, then the sub process error stream will be automatically gobbled and logged.
     * <p>
     * <p>
     * If this property is {@code false}, then the sub process error stream will not be gobbled.
     *
     * @param gobbleError the new property value
     * @return this process builder
     */
    public FinalizedProcessBuilder gobbleErrorStreamWithLogging(boolean gobbleError)
    {
        this.gobbleError = gobbleError;
        this.gobbleErrorLogging = gobbleError;
        return this;
    }

    /**
     * Tells whether the created sub process will gobble the input and error streams.
     * <p>
     * <p>
     * If this property is {@code true}, then the sub process input and error streams will be automatically gobbled.
     * <p>
     * <p>
     * If this property is {@code false}, then the sub process input and error streams will not be gobbled.
     *
     * @return true if both this process builder's {@code gobbleInput} and {@code gobbleError} properties are true;
     * false otherwise
     */
    public boolean gobbleStreams()
    {
        return gobbleInputStream() && gobbleErrorStream();
    }

    /**
     * Sets this process builder's {@code gobbleInput} and {@code gobbleError} properties.
     * <p>
     * <p>
     * If this property is {@code true}, then the sub process input and error streams will be automatically gobbled.
     * <p>
     * <p>
     * If this property is {@code false}, then the sub process input and error streams will not be gobbled.
     *
     * @param gobbleStreams the new property value
     * @return this process builder
     */
    public FinalizedProcessBuilder gobbleStreams(boolean gobbleStreams)
    {
        gobbleInputStream(gobbleStreams);
        gobbleErrorStream(gobbleStreams);
        return this;
    }

    /**
     * Tells whether the created sub process will gobble the input and error streams and log the output or not.
     * <p>
     * <p>
     * If this property is {@code true}, then the sub process input and error streams will be automatically gobbled and
     * logged.
     * <p>
     * <p>
     * If this property is {@code false}, then the sub process input and error streams will not be gobbled.
     *
     * @return true if both this process builder's {@code gobbleInputLogging} and {@code gobbleErrorLogging} properties
     * are true; false otherwise
     */
    public boolean gobbleStreamsWithLogging()
    {
        return gobbleInputStreamWithLogging() && gobbleErrorStreamWithLogging();
    }

    /**
     * Sets this process builder's {@code gobbleInputLogging} and {@code gobbleErrorLogging} properties.
     * <p>
     * <p>
     * If this property is {@code true}, then the sub process input and error streams will be automatically gobbled and
     * logged.
     * <p>
     * <p>
     * If this property is {@code false}, then the sub process input and error streams will not be gobbled.
     *
     * @param gobbleStreams the new property value
     * @return this process builder
     */
    public FinalizedProcessBuilder gobbleStreamsWithLogging(boolean gobbleStreams)
    {
        gobbleInputStreamWithLogging(gobbleStreams);
        gobbleErrorStreamWithLogging(gobbleStreams);
        return this;
    }

    /**
     * Starts a new process using the attributes of this process builder.
     * <p>
     * <p>
     * The new process will invoke the command and arguments given by {@link #command()}, in a working directory as
     * given by {@link #directory()}, with a process environment as given by {@link #environment()}.
     * <p>
     * <p>
     * This method checks that the command is a valid operating system command. Which commands are valid is
     * system-dependent, but at the very least the command must be a non-empty list of non-null strings.
     * <p>
     * <p>
     * A minimal set of system dependent environment variables may be required to start a process on some operating
     * systems. As a result, the subprocess may inherit additional environment variable settings beyond those in the
     * process builder's {@link #environment()}.
     * <p>
     * <p>
     * If there is a security manager, its {@link SecurityManager#checkExec checkExec} method is called with the first
     * component of this object's {@code command} array as its argument. This may result in a {@link SecurityException}
     * being thrown.
     * <p>
     * <p>
     * Starting an operating system process is highly system-dependent. Among the many things that can go wrong are:
     * <ul>
     * <li>The operating system program file was not found.
     * <li>Access to the program file was denied.
     * <li>The working directory does not exist.
     * </ul>
     * <p>
     * <p>
     * In such cases an exception will be thrown. The exact nature of the exception is system-dependent, but it will
     * always be a subclass of {@link IOException}.
     * <p>
     * <p>
     * Subsequent modifications to this process builder will not affect the returned {@link FinalizedProcess}.
     *
     * @return a new {@link FinalizedProcess} object for managing the subprocess
     * @throws NullPointerException if an element of the command list is null
     * @throws IndexOutOfBoundsException if the command is an empty list (has size {@code 0})
     * @throws SecurityException if a security manager exists and
     * <ul>
     * <p>
     * <li>its {@link SecurityManager#checkExec checkExec} method doesn't allow creation of the subprocess,
     * or
     * <p>
     * <li>the standard input to the subprocess was {@linkplain #redirectInput redirected from a file} and
     * the security manager's {@link SecurityManager#checkRead checkRead} method denies read access to the
     * file, or
     * <p>
     * <li>the standard output or standard error of the subprocess was {@linkplain #redirectOutput
     * redirected to a file} and the security manager's {@link SecurityManager#checkWrite checkWrite} method
     * denies write access to the file
     * <p>
     * </ul>
     * @throws IOException if an I/O error occurs
     */
    public FinalizedProcess start()
            throws IOException
    {
        Process process = processBuilder.start();

        Set<StreamGobbler> gobblers = new HashSet<StreamGobbler>(2);
        if (gobbleInput) {
            StreamGobbler inputGobbler = new StreamGobbler.LineImpl(process.getInputStream(), gobbleInputLogging);
            inputGobbler.gobble();
            gobblers.add(inputGobbler);
        }
        if (gobbleError) {
            StreamGobbler errorGobbler = new StreamGobbler.LineImpl(process.getErrorStream(), gobbleErrorLogging);
            errorGobbler.gobble();
            gobblers.add(errorGobbler);
        }

        return new FinalizedProcess(process, keepProcess, gobblers);
    }

    public ProcessBuilder redirectInput(ProcessBuilder.Redirect source)
    {
        return processBuilder.redirectInput(source);
    }

    public ProcessBuilder redirectOutput(ProcessBuilder.Redirect destination)
    {
        return processBuilder.redirectOutput(destination);
    }

    public ProcessBuilder redirectError(ProcessBuilder.Redirect destination)
    {
        return processBuilder.redirectError(destination);
    }

    public ProcessBuilder redirectInput(File file)
    {
        return processBuilder.redirectInput(file);
    }

    public ProcessBuilder redirectOutput(File file)
    {
        return processBuilder.redirectOutput(file);
    }

    public ProcessBuilder redirectError(File file)
    {
        return processBuilder.redirectError(file);
    }

    public ProcessBuilder.Redirect redirectInput()
    {
        return processBuilder.redirectInput();
    }

    public ProcessBuilder.Redirect redirectOutput()
    {
        return processBuilder.redirectOutput();
    }

    public ProcessBuilder.Redirect redirectError()
    {
        return processBuilder.redirectError();
    }

    public ProcessBuilder inheritIO()
    {
        return processBuilder.inheritIO();
    }
}
