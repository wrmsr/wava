// clang++ -O0 -g3 -dynamiclib notclang.cpp -o notclang.dylib

#include <stdint.h>
#include <stdio.h>
#include <string.h>

#include <memory>
#include <string>

class CXIndexImpl {
  bool OnlyLocalDecls;
  bool DisplayDiagnostics;
  unsigned Options; // CXGlobalOptFlags.

  std::string ResourcesPath;
  std::shared_ptr<int> PCHContainerOps;

public:
  CXIndexImpl() {
  }
};

typedef void *CXIndex;

extern "C" {

  CXIndex clang_createIndex(int excludeDeclarationsFromPCH, int displayDiagnostics) {
    return new CXIndexImpl();
  }

  void clang_disposeIndex(CXIndex index) {
    if (index) {
      delete static_cast<CXIndexImpl*>(index);
    }
  }

}
