# docker-machine create default -d virtualbox --virtualbox-cpu-count "4" --virtualbox-memory "2048" --virtualbox-disk-size "20000"
# eval $(docker-machine env default)
# docker run --privileged --security-opt seccomp:unconfined -itd wrmsr/wasm-compiler bash

# cd wasm-install
# bin/clang -I sysroot/include -emit-llvm --target=wasm32 -Oz -c bin/emscripten/tests/sqlite/sqlite3.c -o bin/emscripten/tests/sqlite/sqlite3.bc -DSQLITE_DISABLE_LFS -DLONGDOUBLE_TYPE=double -DSQLITE_THREADSAFE=0
# bin/llvm-dis bin/emscripten/tests/sqlite/sqlite3.bc
# bin/llc -asm-verbose=false bin/emscripten/tests/sqlite/sqlite3.bc -o bin/emscripten/tests/sqlite/sqlite3.s
# bin/s2wasm bin/emscripten/tests/sqlite/sqlite3.s > bin/emscripten/tests/sqlite/sqlite3.wast

# git clone https://github.com/WebAssembly/musl/
# cd musl
# git checkout wasm-prototype-1
# ./libc.py --clang_dir /root/wasm-install/bin --binaryen_dir /root/wasm-install/bin --sexpr_wasm /root/wasm-install/bin/sexpr-wasm --musl /root/musl
# x86_64-linux-gnu/asm/unistd_32.h

FROM ubuntu:xenial

RUN apt-get update && apt-get upgrade -yqq 
RUN apt-get install -yqq \
    autoconf \
    automake \
    autotools-dev \
    bzip2 \
    cmake \
    emacs \
    g++ \
    gdb \
    git \
    libaio-dev \
    libtool \
    man \
    mercurial \
    silversearcher-ag \
    sqlite3 \
    strace \
    vim
    wget \
    xz-utils \

CMD /bin/bash

# RUN groupadd -r wasm && useradd -r -g wasm wasm

# wget https://storage.googleapis.com/wasm-llvm/builds/git/wasm-binaries-9397.tbz2
# wget https://storage.googleapis.com/wasm-llvm/builds/git/wasm-binaries-10276.tbz2
# gzip -cd /proc/config.gz | grep CONFIG_HAVE_LIVEPATCH

