// clear ; g++ -O3 a.cpp -lgmpxx -lgmp -lmpfr && ./a.out 0

#include <assert.h>
#include <stdio.h>
#include <unistd.h>

#include <CoreServices/CoreServices.h>
#include <mach/mach.h>
#include <mach/mach_time.h>

#include <gmp.h>


uint64_t nano_time(void) {
  static mach_timebase_info_data_t s_timebase_info;

  if (s_timebase_info.denom == 0) {
    (void) mach_timebase_info(&s_timebase_info);
  }

  return (mach_absolute_time() * s_timebase_info.numer) / s_timebase_info.denom;
}

typedef int (*fn_t)(int a, int b);

int f1(int a, int b) {
  return a + b;
}

int f2(int a, int b) {
  return a * b;
}

fn_t fns[] = {
  f1,
  f2,
};

int main(int argc, const char *const argv[]) {
  int i = atoi(argv[1]);
  int poll = 100000;
  uint64_t scale = 1000000000;

  int a = 0;
  int b = 1;
  int c = 0;
  uint64_t reps = 0;
  uint64_t last = nano_time();
  while (true) {
    for (int j = 0; j < poll; ++j) {
      c += fns[i](a++, b++);
    }
    reps += poll;
    uint64_t diff = nano_time() - last;
    if (diff >= scale) {
      mpz_t rps;
      mpz_init(rps);
      mpz_add_ui(rps, rps, reps);
      mpz_mul_ui(rps, rps, scale);
      mpz_div_ui(rps, rps, diff);
      mpz_out_str(stdout, 10, rps);
      printf("\n");
      reps = 0;
      last = nano_time();
    }
  }

  return 0;
}
