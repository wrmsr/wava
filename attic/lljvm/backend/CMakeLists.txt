add_executable(lljvm-backend
        backend.cpp
        block.cpp
        branch.cpp
        const.cpp
        function.cpp
        instruction.cpp
        loadstore.cpp
        main.cpp
        name.cpp
        printinst.cpp
        sections.cpp
        types.cpp
        backend.h
        )

target_include_directories(lljvm-backend PUBLIC ./)
target_link_libraries(lljvm-backend llvm LLVMCore LLVMSelectionDAG)
