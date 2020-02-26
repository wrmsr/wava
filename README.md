**NOTE** This project is still very much stream-of-conscious/hackathon-style. Proper tests and UI will come when I am happy with the core capabilities. I do not ship code like this (see [here](https://github.com/prestodb/presto/pull/5712/files) for a sample of that), please do not dock me points for open development.

The main goal is compiling WebAssembly to Java. Began life as a straight Java port of binaryen (and largely remains so in the yen package). Immediate goal is sqlite.jar. Ultimate goals are [/were] llvm.jar and dpdk.jar.

Java source rather than bytecode was chosen for simplicity and debuggability (for the end-user - at this point emitting bytecode would be easier).

