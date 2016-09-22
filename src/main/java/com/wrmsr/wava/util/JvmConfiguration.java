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
/*
add hotspot specificness
add version awareness (even though j8 only)
add os awareness
add task awareness
gc configs
properties
heap size

networkaddress.cache.ttl=60
java.security.Security.setProperty("networkaddress.cache.ttl" , "60");

B.2.1 -Xcheck:jni Option
B.2.2 -verbose:class Option
B.2.3 -verbose:gc Option
B.2.4 -verbose:jni Option

http://www.oracle.com/technetwork/java/javase/tech/vmoptions-jsp-140102.html
http://www.oracle.com/technetwork/java/javase/tech/exactoptions-jsp-141536.html

ES_CLASSPATH=$ES_CLASSPATH:$ES_HOME/lib/elasticsearch-1.0.1.jar:$ES_HOME/lib/*:$ES_HOME/lib/sigar/*

# min and max heap sizes should be set to the same value to avoid
# stop-the-world GC pauses during resize, and so that we can lock the
# heap in memory on startup to prevent any of it from being swapped
# out.
-XX:+PrintClassHistogram
-XX:+PrintGCApplicationStoppedTime
-Xloggc:/var/log/elasticsearch/gc.log

# Force the JVM to use IPv4 stack
if [ "x$ES_USE_IPV4" != "x" ]; then
  JAVA_OPTS="$JAVA_OPTS -Djava.net.preferIPv4Stack=true"
fi

JAVA_OPTS="$JAVA_OPTS -XX:+UseParNewGC"
JAVA_OPTS="$JAVA_OPTS -XX:+UseConcMarkSweepGC"

JAVA_OPTS="$JAVA_OPTS -XX:CMSInitiatingOccupancyFraction=75"
JAVA_OPTS="$JAVA_OPTS -XX:+UseCMSInitiatingOccupancyOnly"

# GC logging options
if [ "x$ES_USE_GC_LOGGING" != "x" ]; then
fi

# The path to the heap dump location, note directory must exists and have enough
# space for a full heap dump.
#JAVA_OPTS="$JAVA_OPTS -XX:HeapDumpPath=$ES_HOME/logs/heapdump.hprof"bash-3.2$

    -Xmixed           mixed mode execution (default)
    -Xbootclasspath:<directories and zip/jar files separated by ;>
                      set search path for bootstrap classes and resources
    -Xbootclasspath/a:<directories and zip/jar files separated by ;>
                      append to end of bootstrap class path
    -Xbootclasspath/p:<directories and zip/jar files separated by ;>
                      prepend in front of bootstrap class path
    -XgetHeapnoclassgc       disable class garbage collection
    -Xincgc           enable incremental garbage collection
    -Xloggc:<file>    log GC status to a file with time stamps
    -Xbatch           disable background compilation
    -Xprof            output cpu profiling data
    -Xfuture          enable strictest checks, anticipating future default
    -Xcheck:jni       perform additional checks for JNI functions
    -Xshare:off	      do not attempt to use shared class data
    -Xshare:auto      use shared class data if possible (default)
    -Xshare:on	      require using shared class data, otherwise fail.

The -X options are non-standard and subject to change without notice.

java -help

#  -XX:+PrintGCCause \
  -Djava.security.egd=file:/dev/./urandom \
 -XX:+UseG1GC -XX:MaxGCPauseMillis=250 \

RuntimeMXBean runtimeMxBean = ManagementFactory.getRuntimeMXBean();
List<String> arguments = runtimeMxBean.getInputArguments();

http://hg.openjdk.java.net/jdk8/jdk8/hotspot/file/tip/src/share/vm/runtime/arguments.cpp
http://hg.openjdk.java.net/jdk8/jdk8/hotspot/file/tip/src/share/vm/runtime/arguments.hpp

ulimits

-XX:+UseConcMarkSweepGC
-XX:+ExplicitGCInvokesConcurrent

hotspot/src/share/vm/runtime/globals.hpp

-server
-XX:BCEATraceLevel=3
-XX:+PrintCompilation
-XX:+UnlockDiagnosticVMOptions
-XX:+PrintInlining
-verbose:gc
-XX:MaxInlineSize=256
-XX:FreqInlineSize=1024
-XX:MaxBCEAEstimateSize=1024
-XX:MaxInlineLevel=22
-XX:CompileThreshold=10
-Xmx4g
-Xms4g
*/

package com.wrmsr.wava.util;

import io.airlift.units.DataSize;

import java.lang.management.ManagementFactory;
import java.util.Optional;
import java.util.function.Supplier;

public final class JvmConfiguration
{
    public enum Prefix
    {
        NONE(""),
        DASH("-"),
        NONSTANDARD("-X"),
        UNSTABLE("-XX:"),
        PROPERTY("-D");

        private final String value;

        Prefix(String value)
        {
            this.value = value;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }

    public enum Separator
    {
        NONE(""),
        COLON(":"),
        EQUALS("=");

        private final String value;

        Separator(String value)
        {
            this.value = value;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }

    public static abstract class Item<T>
    {
        private final Prefix prefix;
        private final String name;
        private final Separator separator;
        private final Supplier<Optional<T>> supplier;

        public Item(Prefix prefix, String name, Separator separator, Supplier<Optional<T>> supplier)
        {
            this.prefix = prefix;
            this.name = name;
            this.separator = separator;
            this.supplier = supplier;
        }

        public Prefix getPrefix()
        {
            return prefix;
        }

        public String getName()
        {
            return name;
        }

        public Separator getSeparator()
        {
            return separator;
        }

        public Supplier<Optional<T>> getSupplier()
        {
            return supplier;
        }

        public Optional<T> getValue()
        {
            Supplier<Optional<T>> supplier = getSupplier();
            if (supplier != null) {
                return supplier.get();
            }
            throw new UnsupportedOperationException();
        }

        public abstract class Value
                implements Supplier<T>
        {
            public abstract String toString();
        }

        public abstract Value valueOf(T value);
    }

    public static final class Presence
    {
        public static final Presence INSTANCE = new Presence();

        private Presence()
        {
        }
    }

    public static final Presence PRESENT = Presence.INSTANCE;

    public static class ValuelessItem
            extends Item<Presence>
    {
        public ValuelessItem(Prefix prefix, String name, Supplier<Optional<Presence>> supplier)
        {
            super(prefix, name, Separator.NONE, supplier);
        }

        public ValuelessItem(Prefix prefix, String name)
        {
            this(prefix, name, null);
        }

        public class Value
                extends Item.Value
        {
            @Override
            public String toString()
            {
                return getPrefix() + getName();
            }

            @Override
            public Presence get()
            {
                return null;
            }
        }

        public Value valueOf()
        {
            return valueOf(null);
        }

        @Override
        public Value valueOf(Presence value)
        {
            return new Value();
        }

        @Override
        public Optional<Presence> getValue()
        {
            Supplier<Optional<Presence>> supplier = getSupplier();
            if (supplier != null) {
                return supplier.get();
            }
            String str = getPrefix() + getName() + getSeparator();
            for (String arg : ManagementFactory.getRuntimeMXBean().getInputArguments()) {
                if (arg.equals(str)) {
                    return Optional.of(PRESENT);
                }
            }
            return Optional.empty();
        }
    }

    public static class StringItem
            extends Item<String>
    {
        public StringItem(Prefix prefix, String name, Separator separator, Supplier<Optional<String>> supplier)
        {
            super(prefix, name, separator, supplier);
        }

        public StringItem(Prefix prefix, String name, Separator separator)
        {
            this(prefix, name, separator, null);
        }

        public class Value
                extends Item.Value
        {
            private final String value;

            public Value(String value)
            {
                this.value = value;
            }

            @Override
            public String toString()
            {
                return getPrefix() + getName() + getSeparator() + value;
            }

            @Override
            public String get()
            {
                return value;
            }
        }

        @Override
        public Value valueOf(String value)
        {
            return new Value(value);
        }

        @Override
        public Optional<String> getValue()
        {
            Supplier<Optional<String>> supplier = getSupplier();
            if (supplier != null) {
                return supplier.get();
            }
            String prefix = getPrefix() + getName() + getSeparator();
            for (String arg : ManagementFactory.getRuntimeMXBean().getInputArguments()) {
                if (arg.startsWith(prefix)) {
                    return Optional.of(arg.substring(prefix.length()));
                }
            }
            return Optional.empty();
        }
    }

    public static class DataSizeItem
            extends Item<DataSize>
    {
        public DataSizeItem(Prefix prefix, String name, Separator separator, Supplier<Optional<DataSize>> supplier)
        {
            super(prefix, name, separator, supplier);
        }

        public DataSizeItem(Prefix prefix, String name, Separator separator)
        {
            this(prefix, name, separator, null);
        }

        public class Value
                extends Item.Value
        {
            private final DataSize value;

            public Value(DataSize value)
            {
                this.value = value;
            }

            @Override
            public String toString()
            {
                final String stringValue;
                if (Double.toString(value.getValue()).endsWith(".0")) {  // lol
                    long longValue = (long) value.getValue();
                    switch (value.getUnit()) {
                        case TERABYTE:
                            stringValue = Long.toString(longValue) + "T";
                            break;
                        case GIGABYTE:
                            stringValue = Long.toString(longValue) + "G";
                            break;
                        case MEGABYTE:
                            stringValue = Long.toString(longValue) + "M";
                            break;
                        case KILOBYTE:
                            stringValue = Long.toString(longValue) + "K";
                            break;
                        default:
                            stringValue = Long.toString(value.toBytes());
                    }
                }
                else {
                    stringValue = Long.toString(value.toBytes());
                }

                return getPrefix() + getName() + getSeparator() + stringValue;
            }

            @Override
            public DataSize get()
            {
                return value;
            }
        }

        @Override
        public Value valueOf(DataSize value)
        {
            return new Value(value);
        }

        @Override
        public Optional<DataSize> getValue()
        {
            String prefix = getPrefix() + getName() + getSeparator();
            for (String arg : ManagementFactory.getRuntimeMXBean().getInputArguments()) {
                if (arg.startsWith(prefix)) {
                    //return Optional.of(DataSize.succinctBytes(Long.valueOf(arg.substring(prefix.length())));
                }
            }
            return Optional.empty();
        }
    }

    public static class ToggleItem
            extends Item<Boolean>
    {
        public ToggleItem(Prefix prefix, String name, Supplier<Optional<Boolean>> supplier)
        {
            super(prefix, name, Separator.NONE, supplier);
        }

        public ToggleItem(Prefix prefix, String name)
        {
            this(prefix, name, null);
        }

        public class Value
                extends Item.Value
        {
            private final boolean value;

            public Value(boolean value)
            {
                this.value = value;
            }

            @Override
            public String toString()
            {
                return getPrefix() + (value ? "+" : "-") + getName();
            }

            @Override
            public Boolean get()
            {
                return value;
            }
        }

        @Override
        public Value valueOf(Boolean value)
        {
            return new Value(value);
        }

        @Override
        public Optional<Boolean> getValue()
        {
            String trueStr = getPrefix() + "+" + getName();
            String falseStr = getPrefix() + "-" + getName();
            for (String arg : ManagementFactory.getRuntimeMXBean().getInputArguments()) {
                if (trueStr.equals(arg)) {
                    return Optional.of(true);
                }
                else if (falseStr.equals(arg)) {
                    return Optional.of(false);
                }
            }
            return Optional.empty();
        }
    }

    public static class ValuelessPropertyItem
            extends ValuelessItem
    {
        public ValuelessPropertyItem(String name)
        {
            super(Prefix.PROPERTY, name, null);
        }

        @Override
        public Optional<Presence> getValue()
        {
            return System.getProperty(getName()) != null ? Optional.of(null) : Optional.empty();
        }
    }

    public static class PropertyItem
            extends StringItem
    {
        public PropertyItem(String name)
        {
            super(Prefix.PROPERTY, name, Separator.EQUALS, null);
        }

        @Override
        public Optional<String> getValue()
        {
            String value = System.getProperty(getName());
            return value != null ? Optional.of(value) : Optional.empty();
        }
    }

    public static final DataSizeItem MIN_HEAP_SIZE = new DataSizeItem(Prefix.NONSTANDARD, "ms", Separator.NONE);
    public static final DataSizeItem MAX_HEAP_SIZE = new DataSizeItem(Prefix.NONSTANDARD, "mx", Separator.NONE);
    public static final DataSizeItem YOUNG_GENERATION_SIZE = new DataSizeItem(Prefix.NONSTANDARD, "mn", Separator.NONE);
    public static final DataSizeItem THREAD_STACK_SIZE = new DataSizeItem(Prefix.NONSTANDARD, "ss", Separator.NONE);
    public static final DataSizeItem MAX_DIRECT_MEMORY_SIZE = new DataSizeItem(Prefix.UNSTABLE, "MaxDirectMemorySize", Separator.EQUALS);
    public static final ToggleItem PRINT_GC_DATE_STAMPS = new ToggleItem(Prefix.UNSTABLE, "PrintGCDateStamps");
    public static final ToggleItem PRINT_GC_DETAILS = new ToggleItem(Prefix.UNSTABLE, "PrintGCDetails");
    public static final ToggleItem PRINT_TENURING_DISTRIBUTION = new ToggleItem(Prefix.UNSTABLE, "PrintTenuringDistribution");
    public static final ToggleItem PRINT_JNI_GC_STALLS = new ToggleItem(Prefix.UNSTABLE, "PrintJNIGCStalls");
    public static final ToggleItem USE_NUMA = new ToggleItem(Prefix.UNSTABLE, "UseNUMA");
    public static final ToggleItem HEAP_DUMP_ON_OUT_OF_MEMORY_ERROR = new ToggleItem(Prefix.UNSTABLE, "HeapDumpOnOutOfMemoryError");
    public static final StringItem HEAP_DUMP_PATH = new StringItem(Prefix.UNSTABLE, "HeapDumpPath", Separator.EQUALS);
    public static final ValuelessItem SERVER = new ValuelessItem(Prefix.NONE, "server");
    public static final ValuelessItem INTERPRETED = new ValuelessItem(Prefix.NONSTANDARD, "int");
    public static final StringItem ON_OUT_OF_MEMORY_ERROR = new StringItem(Prefix.UNSTABLE, "OnOutOfMemoryError", Separator.EQUALS);
    public static final StringItem ON_ERROR = new StringItem(Prefix.UNSTABLE, "OnError", Separator.EQUALS);
    public static final ToggleItem PRINT_FLAGS_FINAL = new ToggleItem(Prefix.UNSTABLE, "PrintFlagsFinal");
    public static final ToggleItem UNLOCK_DIAGNOSTIC_VM_OPTIONS = new ToggleItem(Prefix.UNSTABLE, "UnlockDiagnosticVMOptions");
    public static final ToggleItem AGGRESSIVE_OPTS = new ToggleItem(Prefix.UNSTABLE, "AggressiveOpts");
    public static final ToggleItem ELIMINATE_LOCKS = new ToggleItem(Prefix.UNSTABLE, "EliminateLocks");
    public static final ToggleItem USE_LARGE_PAGES = new ToggleItem(Prefix.UNSTABLE, "UseLargePages");
    public static final ValuelessItem DEBUG = new ValuelessItem(Prefix.NONSTANDARD, "debug");
    public static final ToggleItem PRINT_INLINING = new ToggleItem(Prefix.UNSTABLE, "PrintInlining");
    public static final ToggleItem PRINT_COMPILATION = new ToggleItem(Prefix.UNSTABLE, "PrintCompilation");
    public static final ToggleItem USE_COMPRESSED_OOPS = new ToggleItem(Prefix.UNSTABLE, "UseCompressedOops");
    public static final StringItem OBJECT_ALIGNMENT_IN_BYTES = new StringItem(Prefix.UNSTABLE, "ObjectAlignmentInBytes", Separator.EQUALS);
    public static final ToggleItem ALWAYS_PRE_TOUCH = new ToggleItem(Prefix.UNSTABLE, "AlwaysPreTouch");

    public static final class RemoteDebugItem
            extends StringItem
    {
        public RemoteDebugItem()
        {
            super(Prefix.NONSTANDARD, "runjdwp", Separator.COLON);
        }

        public Value valueOf(int port, boolean suspend)
        {
            return valueOf(String.format("transport=dt_socket,address=%d,server=y,suspend=%s", port, suspend ? "y" : "n"));
        }
    }

    public static final RemoteDebugItem REMOTE_DEBUG = new RemoteDebugItem();

    public static final PropertyItem HEADLESS = new PropertyItem("java.awt.headless");
    public static final ValuelessPropertyItem JMX_REMOTE = new ValuelessPropertyItem("com.sun.management.jmxremote");
    public static final PropertyItem JMX_REMOTE_PORT = new PropertyItem("com.sun.management.jmxremote.port");
    public static final PropertyItem JMX_REMOTE_LOCAL_ONLY = new PropertyItem("com.sun.management.jmxremote.local.only");
    public static final PropertyItem JMX_REMOTE_AUTHENTICATE = new PropertyItem("com.sun.management.jmxremote.authenticate");
    public static final PropertyItem JMX_REMOTE_SSL = new PropertyItem("com.sun.management.jmxremote.ssl");

    /*
    NUMAStats
    PrintAssembly
    RelaxAccessControlCheck
    UseAdaptiveGCBoundary
    UseGCTaskAffinity
    UseSSE42Intrinsics
    wizardmode
    BiasedLockingStartupDelay
    FenceInstruction
    EmitSync

    public static abstract class Group implements Iterable<Item>
    {
    }

    public static abstract class GC extends Group
    {
    }

    public static abstract class CMSConfiguration extends GC
    {
    }
    */

//    public static void main(String[] args)
//            throws Throwable
//    {
//        /*
//        RuntimeMXBean runtimeMxBean = ManagementFactory.getRuntimeMXBean();
//        List<String> arguments = runtimeMxBean.getInputArguments();
//        System.out.println(new MaxHeapSize(DataSize.valueOf("100MB")));
//        System.out.println(new RemoteDebug(41414, false));
//        System.out.println(new AggressiveOpts(true));
//        java = System.getProperties().getProperty("java.home") + File.separator + "bin" + File.separator + "java";
//        new File(MyClass.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
//        */
//        //System.out.println(SERVER.getValue().get());
//        System.out.println(AGGRESSIVE_OPTS.getValue().get());
//        System.out.println(MAX_HEAP_SIZE.valueOf(DataSize.valueOf("100MB")));
//        System.out.println(PRINT_GC_DATE_STAMPS.valueOf(true));
//        System.out.println(MAX_HEAP_SIZE.getValue().get());
//        System.out.println(MAX_HEAP_SIZE.valueOf(MAX_HEAP_SIZE.getValue().get()));
//    }
}
