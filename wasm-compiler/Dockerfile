# docker-machine create default -d virtualbox --virtualbox-cpu-count "4" --virtualbox-memory "2048" --virtualbox-disk-size "20000"
# eval $(docker-machine env default)
# docker run --privileged -i -t ubuntu /bin/bash

# cd wasm-install
# bin/clang -I sysroot/include -emit-llvm --target=wasm32 -Oz -c bin/emscripten/tests/sqlite/sqlite3.c -o bin/emscripten/tests/sqlite/sqlite3.bc -DSQLITE_DISABLE_LFS -DLONGDOUBLE_TYPE=double -DSQLITE_THREADSAFE=0
# bin/llvm-dis bin/emscripten/tests/sqlite/sqlite3.bc
# bin/llc -asm-verbose=false bin/emscripten/tests/sqlite/sqlite3.bc -o bin/emscripten/tests/sqlite/sqlite3.s
# bin/s2wasm bin/emscripten/tests/sqlite/sqlite3.s > bin/emscripten/tests/sqlite/sqlite3.wast

FROM ubuntu:xenial

RUN apt-get update && apt-get upgrade -yqq 
RUN apt-get install -yqq git mercurial cmake autoconf wget xz-utils bzip2 gdb autotools-dev libaio-dev wget automake libtool g++ vim

CMD /bin/bash

# RUN groupadd -r wasm && useradd -r -g wasm wasm

# wget https://storage.googleapis.com/wasm-llvm/builds/git/wasm-binaries-9397.tbz2
# wget https://storage.googleapis.com/wasm-llvm/builds/git/wasm-binaries-10276.tbz2
# gzip -cd /proc/config.gz | grep CONFIG_HAVE_LIVEPATCH

