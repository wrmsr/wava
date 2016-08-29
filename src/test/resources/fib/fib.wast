(module
  (memory 1
    (segment 16 "%d\n\00")
  )
  (export "memory" memory)
  (type $FUNCSIG$ii (func (param i32) (result i32)))
  (type $FUNCSIG$iii (func (param i32 i32) (result i32)))
  (import $printf "env" "printf" (param i32 i32) (result i32))
  (export "fib" $fib)
  (export "main" $main)
  (func $fib (param $0 i32) (result i32)
    (local $1 i32)
    (i32.store offset=12
      (set_local $1
        (i32.sub
          (i32.load offset=4
            (i32.const 0)
          )
          (i32.const 16)
        )
      )
      (get_local $0)
    )
    (i32.store offset=4
      (get_local $1)
      (i32.store offset=8
        (get_local $1)
        (i32.const 1)
      )
    )
    (loop $label$1 $label$0
      (br_if $label$1
        (i32.lt_s
          (i32.load offset=12
            (get_local $1)
          )
          (i32.const 2)
        )
      )
      (i32.store
        (get_local $1)
        (i32.add
          (i32.load offset=8
            (get_local $1)
          )
          (i32.load offset=4
            (get_local $1)
          )
        )
      )
      (i32.store offset=8
        (get_local $1)
        (i32.load offset=4
          (get_local $1)
        )
      )
      (i32.store offset=4
        (get_local $1)
        (i32.load
          (get_local $1)
        )
      )
      (i32.store offset=12
        (get_local $1)
        (i32.add
          (i32.load offset=12
            (get_local $1)
          )
          (i32.const -1)
        )
      )
      (br $label$0)
    )
    (i32.load offset=4
      (get_local $1)
    )
  )
  (func $main (param $0 i32) (param $1 i32) (result i32)
    (local $2 i32)
    (local $3 i32)
    (set_local $2
      (i32.store offset=12
        (set_local $3
          (i32.store offset=4
            (i32.const 0)
            (i32.sub
              (i32.load offset=4
                (i32.const 0)
              )
              (i32.const 16)
            )
          )
        )
        (i32.const 0)
      )
    )
    (i32.store offset=8
      (get_local $3)
      (get_local $0)
    )
    (i32.store offset=4
      (get_local $3)
      (get_local $1)
    )
    (i32.store
      (get_local $3)
      (call $fib
        (i32.const 10)
      )
    )
    (call_import $printf
      (i32.const 16)
      (get_local $3)
    )
    (i32.store offset=4
      (i32.const 0)
      (i32.add
        (get_local $3)
        (i32.const 16)
      )
    )
    (get_local $2)
  )
)
