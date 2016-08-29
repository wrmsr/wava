(module
 (memory 1 1
  (segment 12 "\10\01\00\00"))
 (export "add" $add)
 (func $add (param $x i32) (param $y i32) (result i32)
  (block
   (i32.add
    (get_local $x)
    (get_local $y)))))
