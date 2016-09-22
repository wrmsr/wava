	.text
	.file	"/root/fib.bc"
	.hidden	fib
	.globl	fib
	.type	fib,@function
fib:
	.param  	i32
	.result 	i32
	.local  	i32
	i32.const	$push12=, 0
	i32.load	$push13=, __stack_pointer($pop12)
	i32.const	$push14=, 16
	i32.sub 	$push16=, $pop13, $pop14
	tee_local	$push15=, $1=, $pop16
	i32.store	$drop=, 12($pop15), $0
	i32.const	$push1=, 1
	i32.store	$push0=, 8($1), $pop1
	i32.store	$drop=, 4($1), $pop0
.LBB0_1:
	loop
	i32.load	$push2=, 12($1)
	i32.const	$push18=, 2
	i32.lt_s	$push3=, $pop2, $pop18
	br_if   	1, $pop3
	i32.load	$push6=, 8($1)
	i32.load	$push5=, 4($1)
	i32.add 	$push7=, $pop6, $pop5
	i32.store	$drop=, 0($1), $pop7
	i32.load	$push8=, 4($1)
	i32.store	$drop=, 8($1), $pop8
	i32.load	$push9=, 0($1)
	i32.store	$drop=, 4($1), $pop9
	i32.load	$push10=, 12($1)
	i32.const	$push17=, -1
	i32.add 	$push11=, $pop10, $pop17
	i32.store	$drop=, 12($1), $pop11
	br      	0
.LBB0_3:
	end_loop
	i32.load	$push4=, 4($1)
	.endfunc
.Lfunc_end0:
	.size	fib, .Lfunc_end0-fib

	.hidden	main
	.globl	main
	.type	main,@function
main:
	.param  	i32, i32
	.result 	i32
	.local  	i32, i32
	i32.const	$push7=, 0
	i32.const	$push4=, 0
	i32.load	$push5=, __stack_pointer($pop4)
	i32.const	$push6=, 16
	i32.sub 	$push11=, $pop5, $pop6
	i32.store	$push13=, __stack_pointer($pop7), $pop11
	tee_local	$push12=, $3=, $pop13
	i32.const	$push0=, 0
	i32.store	$2=, 12($pop12), $pop0
	i32.store	$drop=, 8($3), $0
	i32.store	$drop=, 4($3), $1
	i32.const	$push1=, 10
	i32.call	$push2=, fib@FUNCTION, $pop1
	i32.store	$drop=, 0($3), $pop2
	i32.const	$push3=, .L.str
	i32.call	$drop=, printf@FUNCTION, $pop3, $3
	i32.const	$push10=, 0
	i32.const	$push8=, 16
	i32.add 	$push9=, $3, $pop8
	i32.store	$drop=, __stack_pointer($pop10), $pop9
	copy_local	$push14=, $2
	.endfunc
.Lfunc_end1:
	.size	main, .Lfunc_end1-main

	.type	.L.str,@object
	.section	.rodata.str1.1,"aMS",@progbits,1
.L.str:
	.asciz	"%d\n"
	.size	.L.str, 4


	.ident	"clang version 4.0.0 "
	.functype	printf, i32, i32
