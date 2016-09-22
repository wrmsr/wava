#include <stdio.h>

int fib(int n) {
  int a = 1;
  int b = 1;
  int c;
  while (n >= 2) {
    c = a + b;
    a = b;
    b = c;
    --n;
  }
  return b;
}

int main(int argc, const char * const argv[]) {
  printf("%d\n", fib(10));
  return 0;
}
