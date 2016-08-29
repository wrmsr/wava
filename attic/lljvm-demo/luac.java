import lljvm.lib.c;
import lljvm.runtime.Function;
import lljvm.runtime.Instruction;
import lljvm.runtime.Memory;
import lljvm.runtime.Instruction.Unreachable;

public final class luac {
   private static final int progname = Memory.allocateData(4);
   private static final int _str = Memory.allocateData(5);
   private static final int _str1 = Memory.allocateData(30);
   private static final int _str2 = Memory.allocateData(8);
   private static final int _str3 = Memory.allocateData(275);
   private static final int Output = Memory.allocateData(9);
   private static final int _str4 = Memory.allocateData(3);
   private static final int _str5 = Memory.allocateData(2);
   private static final int _str6 = Memory.allocateData(3);
   private static final int listing = Memory.allocateData(4);
   private static final int _str7 = Memory.allocateData(3);
   private static final int output = Memory.allocateData(4);
   private static final int _str8 = Memory.allocateData(20);
   private static final int _str9 = Memory.allocateData(3);
   private static final int dumping_b = Memory.allocateData(1);
   private static final int _str10 = Memory.allocateData(3);
   private static final int stripping_b = Memory.allocateData(1);
   private static final int _str11 = Memory.allocateData(3);
   private static final int _str12 = Memory.allocateData(8);
   private static final int _str13 = Memory.allocateData(10);
   private static final int _str14 = Memory.allocateData(41);
   private static final int _str15 = Memory.allocateData(21);
   private static final int _str16 = Memory.allocateData(28);
   private static final int _str17 = Memory.allocateData(8);
   private static final int _str18 = Memory.allocateData(22);
   private static final int _str19 = Memory.allocateData(21);
   private static final int _str20 = Memory.allocateData(3);
   private static final int _str21 = Memory.allocateData(5);
   private static final int _str22 = Memory.allocateData(6);
   private static final int _str23 = Memory.allocateData(6);
   private static final int _str24 = Memory.allocateData(10);
   private static final int _str125 = Memory.allocateData(9);
   private static final int _str226 = Memory.allocateData(1);
   private static final int _str327 = Memory.allocateData(2);
   private static final int _str428 = Memory.allocateData(5);
   private static final int _str529 = Memory.allocateData(9);
   private static final int _str630 = Memory.allocateData(51);
   private static final int _str731 = Memory.allocateData(2);
   private static final int _str832 = Memory.allocateData(40);
   private static final int _str933 = Memory.allocateData(42);
   private static final int _str1034 = Memory.allocateData(21);
   private static final int _str1135 = Memory.allocateData(14);
   private static final int _str1236 = Memory.allocateData(23);
   private static final int _str1337 = Memory.allocateData(8);
   private static final int _str1438 = Memory.allocateData(3);
   private static final int _str1539 = Memory.allocateData(3);
   private static final int _str1640 = Memory.allocateData(3);
   private static final int _str1741 = Memory.allocateData(3);
   private static final int _str1842 = Memory.allocateData(3);
   private static final int _str1943 = Memory.allocateData(3);
   private static final int _str2044 = Memory.allocateData(3);
   private static final int _str2145 = Memory.allocateData(3);
   private static final int _str2246 = Memory.allocateData(3);
   private static final int _str2347 = Memory.allocateData(6);
   private static final int _str2448 = Memory.allocateData(4);
   private static final int _str25 = Memory.allocateData(5);
   private static final int _str26 = Memory.allocateData(6);
   private static final int _str27 = Memory.allocateData(6);
   private static final int _str28 = Memory.allocateData(10);
   private static final int _str29 = Memory.allocateData(5);
   private static final int _str30 = Memory.allocateData(6);
   private static final int _str31 = Memory.allocateData(5);
   private static final int _str32 = Memory.allocateData(6);
   private static final int _str33 = Memory.allocateData(3);
   private static final int _str34 = Memory.allocateData(4);
   private static final int _str35 = Memory.allocateData(6);
   private static final int _str36 = Memory.allocateData(4);
   private static final int _str37 = Memory.allocateData(2);
   private static final int _str38 = Memory.allocateData(6);
   private static final int _str39 = Memory.allocateData(2);
   private static final int _str40 = Memory.allocateData(9);
   private static final int _str41 = Memory.allocateData(6);
   private static final int _str42 = Memory.allocateData(6);
   private static final int _str43 = Memory.allocateData(2);
   private static final int _str44 = Memory.allocateData(24);

   {
      Memory.pack(progname, _str);
      Memory.pack(_str, "luac");
      Memory.pack(_str1, "%s: unrecognized option \'%s\'\n");
      Memory.pack(_str2, "%s: %s\n");
      Memory.pack(_str3, "usage: %s [options] [filenames].\nAvailable options are:\n  -        process stdin\n  -l       list\n  -o name  output to file \'name\' (default is \"%s\")\n  -p       parse only\n  -s       strip debug information\n  -v       show version information\n  --       stop handling options\n");
      Memory.pack(Output, "luac.out");
      Memory.pack(_str4, "--");
      Memory.pack(_str5, "-");
      Memory.pack(_str6, "-l");
      Memory.zero(listing, 4);
      Memory.pack(_str7, "-o");
      Memory.pack(output, Output);
      Memory.pack(_str8, "\'-o\' needs argument");
      Memory.pack(_str9, "-p");
      Memory.zero(dumping_b, 1);
      Memory.pack(_str10, "-s");
      Memory.zero(stripping_b, 1);
      Memory.pack(_str11, "-v");
      Memory.pack(_str12, "%s  %s\n");
      Memory.pack(_str13, "Lua 5.1.4");
      Memory.pack(_str14, "Copyright (C) 1994-2008 Lua.org, PUC-Rio");
      Memory.pack(_str15, "no input files given");
      Memory.pack(_str16, "not enough memory for state");
      Memory.pack(_str17, "=(luac)");
      Memory.pack(_str18, "%s: cannot %s %s: %s\n");
      Memory.pack(_str19, "too many input files");
      Memory.pack(_str20, "wb");
      Memory.pack(_str21, "open");
      Memory.pack(_str22, "write");
      Memory.pack(_str23, "close");
      Memory.pack(_str24, "(bstring)");
      Memory.pack(_str125, "(string)");
      Memory.zero(_str226, 1);
      Memory.pack(_str327, "s");
      Memory.pack(_str428, "main");
      Memory.pack(_str529, "function");
      Memory.pack(_str630, "\n%s <%s:%d,%d> (%d instruction%s, %d bytes at %p)\n");
      Memory.pack(_str731, "+");
      Memory.pack(_str832, "%d%s param%s, %d slot%s, %d upvalue%s, ");
      Memory.pack(_str933, "%d local%s, %d constant%s, %d function%s\n");
      Memory.pack(_str1034, "locals (%d) for %p:\n");
      Memory.pack(_str1135, "\t%d\t%s\t%d\t%d\n");
      Memory.pack(_str1236, "upvalues (%d) for %p:\n");
      Memory.pack(_str1337, "\t%d\t%s\n");
      Memory.pack(_str1438, "\\\"");
      Memory.pack(_str1539, "\\\\");
      Memory.pack(_str1640, "\\a");
      Memory.pack(_str1741, "\\b");
      Memory.pack(_str1842, "\\f");
      Memory.pack(_str1943, "\\n");
      Memory.pack(_str2044, "\\r");
      Memory.pack(_str2145, "\\t");
      Memory.pack(_str2246, "\\v");
      Memory.pack(_str2347, "\\%03u");
      Memory.pack(_str2448, "nil");
      Memory.pack(_str25, "true");
      Memory.pack(_str26, "false");
      Memory.pack(_str27, "%.14g");
      Memory.pack(_str28, "? type=%d");
      Memory.pack(_str29, "\t%d\t");
      Memory.pack(_str30, "[%d]\t");
      Memory.pack(_str31, "[-]\t");
      Memory.pack(_str32, "%-9s\t");
      Memory.pack(_str33, "%d");
      Memory.pack(_str34, " %d");
      Memory.pack(_str35, "%d %d");
      Memory.pack(_str36, "\t; ");
      Memory.pack(_str37, "-");
      Memory.pack(_str38, "\t; %s");
      Memory.pack(_str39, " ");
      Memory.pack(_str40, "\t; to %d");
      Memory.pack(_str41, "\t; %p");
      Memory.pack(_str42, "\t; %d");
      Memory.pack(_str43, "\n");
      Memory.pack(_str44, "constants (%d) for %p:\n");
   }

   public static void main(String[] var0) {
      c.exit(main(var0.length, Memory.storeStack(var0)));
   }

   public static int main(int var0, int var1) {
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      boolean var22 = false;
      boolean var23 = false;
      boolean var24 = false;
      boolean var25 = false;
      boolean var26 = false;
      boolean var27 = false;
      boolean var28 = false;
      boolean var29 = false;
      boolean var30 = false;
      boolean var31 = false;
      boolean var32 = false;
      boolean var33 = false;
      boolean var34 = false;
      boolean var35 = false;
      boolean var36 = false;
      boolean var37 = false;
      boolean var38 = false;
      boolean var39 = false;
      boolean var40 = false;
      boolean var41 = false;
      boolean var42 = false;
      boolean var43 = false;
      boolean var44 = false;
      boolean var45 = false;
      boolean var46 = false;
      boolean var47 = false;
      boolean var48 = false;
      boolean var49 = false;
      boolean var50 = false;
      boolean var51 = false;
      boolean var52 = false;
      boolean var53 = false;
      boolean var54 = false;
      boolean var55 = false;
      boolean var56 = false;
      boolean var57 = false;
      boolean var58 = false;
      boolean var59 = false;
      boolean var60 = false;
      boolean var61 = false;
      boolean var62 = false;
      boolean var63 = false;
      boolean var64 = false;
      boolean var65 = false;
      boolean var66 = false;
      boolean var67 = false;
      boolean var68 = false;
      boolean var69 = false;
      boolean var70 = false;
      boolean var71 = false;
      boolean var72 = false;
      boolean var73 = false;
      boolean var74 = false;
      boolean var75 = false;
      boolean var76 = false;
      boolean var77 = false;
      Memory.createStackFrame();
      int var78 = Memory.allocateStack(8);
      int var79 = Memory.load_i32(var1);
      var4 = Instruction.icmp_eq(var79, 0) & true;
      int var113;
      int var114;
      if(!var4) {
         byte var80 = (byte)Memory.load_i8(var79);
         var6 = Instruction.icmp_eq(var80, 0) & true;
         if(!var6) {
            Memory.store(progname, var79);
            var113 = 0;
            var114 = 1;
         } else {
            var113 = 0;
            var114 = 1;
         }
      } else {
         var113 = 0;
         var114 = 1;
      }

      int var115;
      int var116;
      while(true) {
         var53 = Instruction.icmp_slt(var114, var0) & true;
         if(!var53) {
            var115 = var113;
            var116 = var114;
            break;
         }

         int var81 = var1 + 4 * var114;
         int var82 = Memory.load_i32(var81);
         byte var83 = (byte)Memory.load_i8(var82);
         var10 = Instruction.icmp_eq(var83, 45) & true;
         if(!var10) {
            var115 = var113;
            var116 = var114;
            break;
         }

         int var84 = c.strcmp(var82, _str4);
         var12 = Instruction.icmp_eq(var84, 0) & true;
         if(var12) {
            int var85 = var114 + 1;
            var14 = Instruction.icmp_ne(var113, 0) & true;
            int var86 = Instruction.zext_i32(var14);
            int var87 = var86 + var113;
            var115 = var87;
            var116 = var85;
            break;
         }

         int var88 = Memory.load_i32(var81);
         int var89 = c.strcmp(var88, _str5);
         var19 = Instruction.icmp_eq(var89, 0) & true;
         if(var19) {
            var115 = var113;
            var116 = var114;
            break;
         }

         int var90 = Memory.load_i32(var81);
         int var91 = c.strcmp(var90, _str6);
         var22 = Instruction.icmp_eq(var91, 0) & true;
         int var110;
         int var111;
         if(!var22) {
            int var94 = Memory.load_i32(var81);
            int var95 = c.strcmp(var94, _str7);
            var27 = Instruction.icmp_eq(var95, 0) & true;
            if(!var27) {
               int var102 = Memory.load_i32(var81);
               int var103 = c.strcmp(var102, _str9);
               var39 = Instruction.icmp_eq(var103, 0) & true;
               if(!var39) {
                  int var104 = Memory.load_i32(var81);
                  int var105 = c.strcmp(var104, _str10);
                  var42 = Instruction.icmp_eq(var105, 0) & true;
                  if(!var42) {
                     int var106 = Memory.load_i32(var81);
                     int var107 = c.strcmp(var106, _str11);
                     var45 = Instruction.icmp_eq(var107, 0) & true;
                     if(!var45) {
                        int var109 = Memory.load_i32(var81);
                        usage(var109);
                        var110 = var113;
                        var111 = var114;
                     } else {
                        int var108 = var113 + 1;
                        var110 = var108;
                        var111 = var114;
                     }
                  } else {
                     Memory.store(stripping_b, true);
                     var110 = var113;
                     var111 = var114;
                  }
               } else {
                  Memory.store(dumping_b, true);
                  var110 = var113;
                  var111 = var114;
               }
            } else {
               int var96;
               int var97;
               label95: {
                  var96 = var114 + 1;
                  var97 = var1 + 4 * var96;
                  int var98 = Memory.load_i32(var97);
                  Memory.store(output, var98);
                  var31 = Instruction.icmp_eq(var98, 0) & true;
                  if(!var31) {
                     byte var99 = (byte)Memory.load_i8(var98);
                     var33 = Instruction.icmp_eq(var99, 0) & true;
                     if(!var33) {
                        break label95;
                     }
                  }

                  usage(_str8);
               }

               int var100 = Memory.load_i32(var97);
               int var101 = c.strcmp(var100, _str5);
               var36 = Instruction.icmp_eq(var101, 0) & true;
               if(!var36) {
                  var110 = var113;
                  var111 = var96;
               } else {
                  Memory.store(output, 0);
                  var110 = var113;
                  var111 = var96;
               }
            }
         } else {
            int var92 = Memory.load_i32(listing);
            int var93 = var92 + 1;
            Memory.store(listing, var93);
            var110 = var113;
            var111 = var114;
         }

         int var112 = var111 + 1;
         var113 = var110;
         var114 = var112;
      }

      var56 = Instruction.icmp_eq(var116, var0) & true;
      int var120;
      if(!var56) {
         var120 = var116;
      } else {
         label86: {
            int var117 = Memory.load_i32(listing);
            var58 = Instruction.icmp_eq(var117, 0) & true;
            if(var58) {
               var59 = Memory.load_i1(dumping_b) & true;
               if(!var59) {
                  var120 = var116;
                  break label86;
               }
            }

            Memory.store(dumping_b, true);
            int var118 = var116 + -1;
            int var119 = var1 + 4 * var118;
            Memory.store(var119, Output);
            var120 = var118;
         }
      }

      var63 = Instruction.icmp_eq(var115, 0) & true;
      if(!var63) {
         int var10000 = _str12;
         int var10001 = Memory.allocateStack(8);
         Memory.pack(Memory.pack(var10001, _str13), _str14);
         int var121 = c.printf(var10000, var10001);
         int var122 = var0 + -1;
         var66 = Instruction.icmp_eq(var122, var115) & true;
         if(var66) {
            c.exit(0);
            throw Unreachable.instance;
         }
      }

      int var123 = var0 - var120;
      int var124 = var1 + 4 * var120;
      var69 = Instruction.icmp_sgt(var123, 0) & true;
      if(!var69) {
         usage(_str15);
      }

      int var125 = liblua.luaL_newstate();
      var71 = Instruction.icmp_eq(var125, 0) & true;
      if(var71) {
         fatal(_str16);
      }

      int var126 = var78 + 0;
      Memory.store(var126, var123);
      int var127 = var78 + 4;
      Memory.store(var127, var124);
      int var128 = liblua.lua_cpcall(var125, Function.getFunctionPointer("luac", "pmain(I)I"), var78);
      var76 = Instruction.icmp_eq(var128, 0) & true;
      if(!var76) {
         int var129 = liblua.lua_tolstring(var125, -1, 0);
         fatal(var129);
      }

      liblua.lua_close(var125);
      Memory.destroyStackFrame();
      return 0;
   }

   private static void usage(int var0) {
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      Memory.createStackFrame();
      byte var14 = (byte)Memory.load_i8(var0);
      var2 = Instruction.icmp_eq(var14, 45) & true;
      int var15 = Memory.load_i32(progname);
      int var16 = c.__getreent();
      int var17 = var16 + 12;
      int var18 = Memory.load_i32(var17);
      int var10001;
      int var10002;
      if(!var2) {
         var10001 = _str2;
         var10002 = Memory.allocateStack(8);
         Memory.pack(Memory.pack(var10002, var15), var0);
         c.fprintf(var18, var10001, var10002);
      } else {
         var10001 = _str1;
         var10002 = Memory.allocateStack(8);
         Memory.pack(Memory.pack(var10002, var15), var0);
         c.fprintf(var18, var10001, var10002);
      }

      int var19 = Memory.load_i32(progname);
      int var20 = c.__getreent();
      int var21 = var20 + 12;
      int var22 = Memory.load_i32(var21);
      var10001 = _str3;
      var10002 = Memory.allocateStack(8);
      Memory.pack(Memory.pack(var10002, var19), Output);
      c.fprintf(var22, var10001, var10002);
      c.exit(1);
      throw Unreachable.instance;
   }

   private static void fatal(int var0) {
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      Memory.createStackFrame();
      int var6 = Memory.load_i32(progname);
      int var7 = c.__getreent();
      int var8 = var7 + 12;
      int var9 = Memory.load_i32(var8);
      int var10001 = _str2;
      int var10002 = Memory.allocateStack(8);
      Memory.pack(Memory.pack(var10002, var6), var0);
      c.fprintf(var9, var10001, var10002);
      c.exit(1);
      throw Unreachable.instance;
   }

   private static int pmain(int var0) {
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      boolean var22 = false;
      boolean var23 = false;
      boolean var24 = false;
      boolean var25 = false;
      boolean var26 = false;
      boolean var27 = false;
      boolean var28 = false;
      boolean var29 = false;
      boolean var30 = false;
      boolean var31 = false;
      boolean var32 = false;
      boolean var33 = false;
      boolean var34 = false;
      boolean var35 = false;
      boolean var36 = false;
      boolean var37 = false;
      boolean var38 = false;
      boolean var39 = false;
      boolean var40 = false;
      boolean var41 = false;
      boolean var42 = false;
      boolean var43 = false;
      boolean var44 = false;
      boolean var45 = false;
      boolean var46 = false;
      boolean var47 = false;
      boolean var48 = false;
      boolean var49 = false;
      boolean var50 = false;
      boolean var51 = false;
      boolean var52 = false;
      boolean var53 = false;
      boolean var54 = false;
      boolean var55 = false;
      boolean var56 = false;
      boolean var57 = false;
      boolean var58 = false;
      boolean var59 = false;
      boolean var60 = false;
      boolean var61 = false;
      boolean var62 = false;
      boolean var63 = false;
      boolean var64 = false;
      boolean var65 = false;
      boolean var66 = false;
      boolean var67 = false;
      boolean var68 = false;
      boolean var69 = false;
      boolean var70 = false;
      boolean var71 = false;
      boolean var72 = false;
      boolean var73 = false;
      boolean var74 = false;
      boolean var75 = false;
      boolean var76 = false;
      boolean var77 = false;
      boolean var78 = false;
      boolean var79 = false;
      boolean var80 = false;
      boolean var81 = false;
      boolean var82 = false;
      boolean var83 = false;
      boolean var84 = false;
      boolean var85 = false;
      boolean var86 = false;
      boolean var87 = false;
      boolean var88 = false;
      boolean var89 = false;
      boolean var90 = false;
      boolean var91 = false;
      boolean var92 = false;
      boolean var93 = false;
      boolean var94 = false;
      boolean var95 = false;
      boolean var96 = false;
      boolean var97 = false;
      boolean var98 = false;
      boolean var99 = false;
      boolean var100 = false;
      boolean var101 = false;
      boolean var102 = false;
      boolean var103 = false;
      boolean var104 = false;
      boolean var105 = false;
      boolean var106 = false;
      boolean var107 = false;
      boolean var108 = false;
      boolean var109 = false;
      boolean var110 = false;
      boolean var111 = false;
      boolean var112 = false;
      boolean var113 = false;
      boolean var114 = false;
      boolean var115 = false;
      boolean var116 = false;
      boolean var117 = false;
      boolean var118 = false;
      Memory.createStackFrame();
      int var119 = liblua.lua_touserdata(var0, 1);
      int var120 = Memory.load_i32(var119);
      int var121 = var119 + 4;
      int var122 = Memory.load_i32(var121);
      int var123 = liblua.lua_checkstack(var0, var120);
      var8 = Instruction.icmp_eq(var123, 0) & true;
      if(var8) {
         fatal(_str19);
      }

      var9 = Instruction.icmp_sgt(var120, 0) & true;
      if(var9) {
         int var124 = 0;

         while(true) {
            int var125 = var122 + 4 * var124;
            int var126 = Memory.load_i32(var125);
            int var127 = c.strcmp(var126, _str5);
            var14 = Instruction.icmp_eq(var127, 0) & true;
            int var129;
            if(!var14) {
               int var128 = Memory.load_i32(var125);
               var129 = var128;
            } else {
               var129 = 0;
            }

            int var130 = liblua.luaL_loadfile(var0, var129);
            var18 = Instruction.icmp_eq(var130, 0) & true;
            if(!var18) {
               int var131 = liblua.lua_tolstring(var0, -1, 0);
               fatal(var131);
            }

            int var132 = var124 + 1;
            var21 = Instruction.icmp_eq(var132, var120) & true;
            if(var21) {
               break;
            }

            var124 = var132;
         }
      }

      var22 = Instruction.icmp_eq(var120, 1) & true;
      int var190;
      if(!var22) {
         int var139 = liblua.luaF_newproto(var0);
         int var140 = var0 + 8;
         int var141 = Memory.load_i32(var140);
         Memory.store(var141, var139);
         int var142 = var141 + 8;
         Memory.store(var142, 9);
         int var143 = var0 + 28;
         int var144 = Memory.load_i32(var143);
         int var145 = Memory.load_i32(var140);
         int var146 = var144 - var145;
         var43 = Instruction.icmp_sgt(var146, 16) & true;
         int var148;
         if(!var43) {
            liblua.luaD_growstack(var0, 1);
            int var147 = Memory.load_i32(var140);
            var148 = var147;
         } else {
            var148 = var145;
         }

         int var149 = var148 + 16;
         Memory.store(var140, var149);
         int var150 = liblua.luaS_newlstr(var0, _str17, 7);
         int var151 = var139 + 32;
         Memory.store(var151, var150);
         int var152 = var139 + 75;
         Memory.store(var152, (byte)1);
         int var153 = var120 << 1;
         int var154 = var153 | 1;
         int var155 = var153 + 2;
         var53 = Instruction.icmp_ugt(var155, 1073741823) & true;
         int var159;
         if(!var53) {
            int var156 = var154 << 2;
            int var157 = liblua.luaM_realloc_(var0, 0, 0, var156);
            var159 = var157;
         } else {
            int var158 = liblua.luaM_toobig(var0);
            var159 = var158;
         }

         int var160 = var139 + 12;
         Memory.store(var160, var159);
         int var161 = var139 + 44;
         Memory.store(var161, var154);
         int var162 = var120 + 1;
         var62 = Instruction.icmp_ugt(var162, 1073741823) & true;
         int var166;
         if(!var62) {
            int var163 = var120 << 2;
            int var164 = liblua.luaM_realloc_(var0, 0, 0, var163);
            var166 = var164;
         } else {
            int var165 = liblua.luaM_toobig(var0);
            var166 = var165;
         }

         int var167 = var139 + 16;
         Memory.store(var167, var166);
         int var168 = var139 + 52;
         Memory.store(var168, var120);
         int var187;
         if(!var9) {
            var187 = 0;
         } else {
            int var169 = 0;

            while(true) {
               int var170 = var169 << 1;
               int var171 = var170 | 1;
               int var172 = var169 << 14;
               int var173 = var172 | 36;
               int var174 = var169 - var162;
               int var175 = Memory.load_i32(var167);
               int var176 = Memory.load_i32(var140);
               int var177 = var176 + 16 * var174;
               int var178 = Memory.load_i32(var177);
               int var179 = var178 + 0 + 16;
               int var180 = Memory.load_i32(var179);
               int var181 = var175 + 4 * var169;
               Memory.store(var181, var180);
               int var182 = Memory.load_i32(var160);
               int var183 = var182 + 4 * var170;
               Memory.store(var183, var173);
               int var184 = Memory.load_i32(var160);
               int var185 = var184 + 4 * var171;
               Memory.store(var185, 8405020);
               int var186 = var169 + 1;
               var90 = Instruction.icmp_eq(var186, var120) & true;
               if(var90) {
                  var187 = var153;
                  break;
               }

               var169 = var186;
            }
         }

         int var188 = Memory.load_i32(var160);
         int var189 = var188 + 4 * var187;
         Memory.store(var189, 8388638);
         var190 = var139;
      } else {
         int var133 = var0 + 8;
         int var134 = Memory.load_i32(var133);
         int var135 = var134 - 16;
         int var136 = Memory.load_i32(var135);
         int var137 = var136 + 0 + 16;
         int var138 = Memory.load_i32(var137);
         var190 = var138;
      }

      int var191 = Memory.load_i32(listing);
      var96 = Instruction.icmp_eq(var191, 0) & true;
      if(!var96) {
         var97 = Instruction.icmp_sgt(var191, 1) & true;
         int var192 = Instruction.zext_i32(var97);
         luaU_print(var190, var192);
      }

      var99 = Memory.load_i1(dumping_b) & true;
      if(!var99) {
         int var193 = Memory.load_i32(output);
         var101 = Instruction.icmp_eq(var193, 0) & true;
         int var198;
         if(!var101) {
            int var197 = c.fopen(var193, _str20);
            var198 = var197;
         } else {
            int var194 = c.__getreent();
            int var195 = var194 + 8;
            int var196 = Memory.load_i32(var195);
            var198 = var196;
         }

         var107 = Instruction.icmp_eq(var198, 0) & true;
         if(var107) {
            cannot(_str21);
         }

         var108 = Memory.load_i1(stripping_b) & true;
         int var199 = Instruction.zext_i32(var108);
         liblua.luaU_dump(var0, var190, Function.getFunctionPointer("luac", "writer(IIII)I"), var198, var199);
         int var200 = var198 + 12;
         short var201 = (short)Memory.load_i16(var200);
         int var202 = Instruction.zext_i32(var201);
         int var203 = var202 & 64;
         var116 = Instruction.icmp_eq(var203, 0) & true;
         if(!var116) {
            cannot(_str22);
         }

         int var204 = c.fclose(var198);
         var118 = Instruction.icmp_eq(var204, 0) & true;
         if(!var118) {
            cannot(_str23);
            Memory.destroyStackFrame();
            return 0;
         }
      }

      Memory.destroyStackFrame();
      return 0;
   }

   private static void cannot(int var0) {
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      Memory.createStackFrame();
      int var10 = c.__errno();
      int var11 = Memory.load_i32(var10);
      int var12 = c.strerror(var11);
      int var13 = Memory.load_i32(output);
      int var14 = Memory.load_i32(progname);
      int var15 = c.__getreent();
      int var16 = var15 + 12;
      int var17 = Memory.load_i32(var16);
      int var10001 = _str18;
      int var10002 = Memory.allocateStack(16);
      Memory.pack(Memory.pack(Memory.pack(Memory.pack(var10002, var14), var0), var13), var12);
      c.fprintf(var17, var10001, var10002);
      c.exit(1);
      throw Unreachable.instance;
   }

   private static int writer(int var0, int var1, int var2, int var3) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      Memory.createStackFrame();
      int var11 = c.fwrite(var1, var2, 1, var3);
      var6 = Instruction.icmp_eq(var11, 1) & true;
      var7 = Instruction.icmp_eq(var2, 0) & true;
      var8 = (var6 | var7) & true;
      int var12 = Instruction.zext_i32(var8);
      int var13 = var12 ^ 1;
      Memory.destroyStackFrame();
      return var13;
   }

   public static void luaU_print(int var0, int var1) {
      boolean var19;
      boolean var25;
      boolean var30;
      boolean var35;
      boolean var40;
      boolean var44;
      boolean var49;
      boolean var53;
      boolean var57;
      boolean var63;
      boolean var80;
      boolean var87;
      boolean var97;
      boolean var98;
      boolean var99;
      boolean var100;
      boolean var101;
      boolean var107;
      boolean var109;
      boolean var119;
      boolean var121;
      boolean var129;
      boolean var133;
      boolean var136;
      boolean var137;
      boolean var138;
      boolean var139;
      boolean var140;
      boolean var141;
      boolean var142;
      boolean var144;
      boolean var146;
      boolean var147;
      boolean var148;
      boolean var149;
      boolean var150;
      boolean var151;
      boolean var153;
      boolean var154;
      boolean var155;
      boolean var156;
      boolean var157;
      boolean var158;
      boolean var159;
      boolean var160;
      boolean var161;
      boolean var162;
      boolean var163;
      boolean var164;
      boolean var165;
      boolean var166;
      boolean var167;
      boolean var170;
      boolean var185;
      boolean var189;
      boolean var191;
      boolean var198;
      boolean var208;
      boolean var217;
      boolean var218;
      boolean var221;
      boolean var226;
      boolean var229;
      boolean var244;
      boolean var250;
      boolean var251;
      boolean var252;
      boolean var260;
      boolean var261;
      boolean var268;
      int var269;
      int var270;
      int var276;
      label354: {
         int var273;
         label353: {
            boolean var2 = false;
            boolean var3 = false;
            boolean var4 = false;
            boolean var5 = false;
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            boolean var9 = false;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = false;
            var19 = false;
            boolean var20 = false;
            boolean var21 = false;
            boolean var22 = false;
            boolean var23 = false;
            boolean var24 = false;
            var25 = false;
            boolean var26 = false;
            boolean var27 = false;
            boolean var28 = false;
            boolean var29 = false;
            var30 = false;
            boolean var31 = false;
            boolean var32 = false;
            boolean var33 = false;
            boolean var34 = false;
            var35 = false;
            boolean var36 = false;
            boolean var37 = false;
            boolean var38 = false;
            boolean var39 = false;
            var40 = false;
            boolean var41 = false;
            boolean var42 = false;
            boolean var43 = false;
            var44 = false;
            boolean var45 = false;
            boolean var46 = false;
            boolean var47 = false;
            boolean var48 = false;
            var49 = false;
            boolean var50 = false;
            boolean var51 = false;
            boolean var52 = false;
            var53 = false;
            boolean var54 = false;
            boolean var55 = false;
            boolean var56 = false;
            var57 = false;
            boolean var58 = false;
            boolean var59 = false;
            boolean var60 = false;
            boolean var61 = false;
            boolean var62 = false;
            var63 = false;
            boolean var64 = false;
            boolean var65 = false;
            boolean var66 = false;
            boolean var67 = false;
            boolean var68 = false;
            boolean var69 = false;
            boolean var70 = false;
            boolean var71 = false;
            boolean var72 = false;
            boolean var73 = false;
            boolean var74 = false;
            boolean var75 = false;
            boolean var76 = false;
            boolean var77 = false;
            boolean var78 = false;
            boolean var79 = false;
            var80 = false;
            boolean var81 = false;
            boolean var82 = false;
            boolean var83 = false;
            boolean var84 = false;
            boolean var85 = false;
            boolean var86 = false;
            var87 = false;
            boolean var88 = false;
            boolean var89 = false;
            boolean var90 = false;
            boolean var91 = false;
            boolean var92 = false;
            boolean var93 = false;
            boolean var94 = false;
            boolean var95 = false;
            boolean var96 = false;
            var97 = false;
            var98 = false;
            var99 = false;
            var100 = false;
            var101 = false;
            boolean var102 = false;
            boolean var103 = false;
            boolean var104 = false;
            boolean var105 = false;
            boolean var106 = false;
            var107 = false;
            boolean var108 = false;
            var109 = false;
            boolean var110 = false;
            boolean var111 = false;
            boolean var112 = false;
            boolean var113 = false;
            boolean var114 = false;
            boolean var115 = false;
            boolean var116 = false;
            boolean var117 = false;
            boolean var118 = false;
            var119 = false;
            boolean var120 = false;
            var121 = false;
            boolean var122 = false;
            boolean var123 = false;
            boolean var124 = false;
            boolean var125 = false;
            boolean var126 = false;
            boolean var127 = false;
            boolean var128 = false;
            var129 = false;
            boolean var130 = false;
            boolean var131 = false;
            boolean var132 = false;
            var133 = false;
            boolean var134 = false;
            boolean var135 = false;
            var136 = false;
            var137 = false;
            var138 = false;
            var139 = false;
            var140 = false;
            var141 = false;
            var142 = false;
            boolean var143 = false;
            var144 = false;
            boolean var145 = false;
            var146 = false;
            var147 = false;
            var148 = false;
            var149 = false;
            var150 = false;
            var151 = false;
            boolean var152 = false;
            var153 = false;
            var154 = false;
            var155 = false;
            var156 = false;
            var157 = false;
            var158 = false;
            var159 = false;
            var160 = false;
            var161 = false;
            var162 = false;
            var163 = false;
            var164 = false;
            var165 = false;
            var166 = false;
            var167 = false;
            boolean var168 = false;
            boolean var169 = false;
            var170 = false;
            boolean var171 = false;
            boolean var172 = false;
            boolean var173 = false;
            boolean var174 = false;
            boolean var175 = false;
            boolean var176 = false;
            boolean var177 = false;
            boolean var178 = false;
            boolean var179 = false;
            boolean var180 = false;
            boolean var181 = false;
            boolean var182 = false;
            boolean var183 = false;
            boolean var184 = false;
            var185 = false;
            boolean var186 = false;
            boolean var187 = false;
            boolean var188 = false;
            var189 = false;
            boolean var190 = false;
            var191 = false;
            boolean var192 = false;
            boolean var193 = false;
            boolean var194 = false;
            boolean var195 = false;
            boolean var196 = false;
            boolean var197 = false;
            var198 = false;
            boolean var199 = false;
            boolean var200 = false;
            boolean var201 = false;
            boolean var202 = false;
            boolean var203 = false;
            boolean var204 = false;
            boolean var205 = false;
            boolean var206 = false;
            boolean var207 = false;
            var208 = false;
            boolean var209 = false;
            boolean var210 = false;
            boolean var211 = false;
            boolean var212 = false;
            boolean var213 = false;
            boolean var214 = false;
            boolean var215 = false;
            boolean var216 = false;
            var217 = false;
            var218 = false;
            boolean var219 = false;
            boolean var220 = false;
            var221 = false;
            boolean var222 = false;
            boolean var223 = false;
            boolean var224 = false;
            boolean var225 = false;
            var226 = false;
            boolean var227 = false;
            boolean var228 = false;
            var229 = false;
            boolean var230 = false;
            boolean var231 = false;
            boolean var232 = false;
            boolean var233 = false;
            boolean var234 = false;
            boolean var235 = false;
            boolean var236 = false;
            boolean var237 = false;
            boolean var238 = false;
            boolean var239 = false;
            boolean var240 = false;
            boolean var241 = false;
            boolean var242 = false;
            boolean var243 = false;
            var244 = false;
            boolean var245 = false;
            boolean var246 = false;
            boolean var247 = false;
            boolean var248 = false;
            boolean var249 = false;
            var250 = false;
            var251 = false;
            var252 = false;
            boolean var253 = false;
            boolean var254 = false;
            boolean var255 = false;
            boolean var256 = false;
            boolean var257 = false;
            boolean var258 = false;
            boolean var259 = false;
            var260 = false;
            var261 = false;
            boolean var262 = false;
            boolean var263 = false;
            boolean var264 = false;
            boolean var265 = false;
            boolean var266 = false;
            boolean var267 = false;
            var268 = false;
            Memory.createStackFrame();
            var269 = var0 + 52;
            var270 = Memory.load_i32(var269);
            int var271 = var0 + 32;
            int var272 = Memory.load_i32(var271);
            var273 = var272 + 16;
            byte var274 = (byte)Memory.load_i8(var273);
            var9 = Instruction.icmp_slt(var274, 61) & true;
            if(!var9) {
               var10 = Instruction.icmp_slt(var274, 64) & true;
               if(!var10) {
                  var11 = Instruction.icmp_eq(var274, 64) & true;
                  if(var11) {
                     break label353;
                  }
               } else {
                  var12 = Instruction.icmp_eq(var274, 61) & true;
                  if(var12) {
                     break label353;
                  }
               }
            } else {
               var13 = Instruction.icmp_eq(var274, 27) & true;
               if(var13) {
                  var276 = _str24;
                  break label354;
               }
            }

            var276 = _str125;
            break label354;
         }

         int var275 = var273 + 1;
         var276 = var275;
      }

      int var277 = var0 + 44;
      int var278 = Memory.load_i32(var277);
      int var279 = var278 << 2;
      var19 = Instruction.icmp_eq(var278, 1) & true;
      int var280 = var19?_str226:_str327;
      int var281 = var0 + 64;
      int var282 = Memory.load_i32(var281);
      int var283 = var0 + 60;
      int var284 = Memory.load_i32(var283);
      var25 = Instruction.icmp_eq(var284, 0) & true;
      int var285 = var25?_str428:_str529;
      int var10000 = _str630;
      int var10001 = Memory.allocateStack(32);
      Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(var10001, var285), var276), var284), var282), var278), var280), var279), var0);
      int var286 = c.printf(var10000, var10001);
      int var287 = var0 + 72;
      byte var288 = (byte)Memory.load_i8(var287);
      var30 = Instruction.icmp_eq(var288, 1) & true;
      int var289 = var30?_str226:_str327;
      int var290 = Instruction.zext_i32(var288);
      int var291 = var0 + 75;
      byte var292 = (byte)Memory.load_i8(var291);
      var35 = Instruction.icmp_eq(var292, 1) & true;
      int var293 = var35?_str226:_str327;
      int var294 = Instruction.zext_i32(var292);
      int var295 = var0 + 73;
      byte var296 = (byte)Memory.load_i8(var295);
      var40 = Instruction.icmp_eq(var296, 1) & true;
      int var297 = var40?_str226:_str327;
      int var298 = var0 + 74;
      byte var299 = (byte)Memory.load_i8(var298);
      var44 = Instruction.icmp_eq(var299, 0) & true;
      int var300 = var44?_str226:_str731;
      int var301 = Instruction.zext_i32(var296);
      var10000 = _str832;
      var10001 = Memory.allocateStack(28);
      Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(var10001, var301), var300), var297), var294), var293), var290), var289);
      int var302 = c.printf(var10000, var10001);
      int var303 = Memory.load_i32(var269);
      var49 = Instruction.icmp_eq(var303, 1) & true;
      int var304 = var49?_str226:_str327;
      int var305 = var0 + 40;
      int var306 = Memory.load_i32(var305);
      var53 = Instruction.icmp_eq(var306, 1) & true;
      int var307 = var53?_str226:_str327;
      int var308 = var0 + 56;
      int var309 = Memory.load_i32(var308);
      var57 = Instruction.icmp_eq(var309, 1) & true;
      int var310 = var57?_str226:_str327;
      var10000 = _str933;
      var10001 = Memory.allocateStack(24);
      Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(var10001, var309), var310), var306), var307), var303), var304);
      int var311 = c.printf(var10000, var10001);
      int var312 = var0 + 12;
      int var313 = Memory.load_i32(var312);
      int var314 = Memory.load_i32(var277);
      var63 = Instruction.icmp_sgt(var314, 0) & true;
      if(var63) {
         int var315 = var0 + 20;
         int var316 = var0 + 36;
         int var317 = var0 + 28;
         int var318 = var0 + 8;
         int var319 = var0 + 16;
         int var320 = 0;

         while(true) {
            int var323;
            int var325;
            int var326;
            int var327;
            int var328;
            int var329;
            label283: {
               int var321 = var313 + 4 * var320;
               int var322 = Memory.load_i32(var321);
               var323 = var322 & 63;
               int var324 = var322 >>> 6;
               var325 = var324 & 255;
               var326 = var322 >>> 23;
               var327 = var322 >>> 14;
               var328 = var327 & 511;
               var329 = var327 + -131071;
               int var330 = Memory.load_i32(var315);
               var80 = Instruction.icmp_eq(var330, 0) & true;
               if(!var80) {
                  int var333 = var330 + 4 * var320;
                  int var334 = Memory.load_i32(var333);
                  int var335 = var320 + 1;
                  var10000 = _str29;
                  var10001 = Memory.allocateStack(4);
                  Memory.pack(var10001, var335);
                  int var336 = c.printf(var10000, var10001);
                  var87 = Instruction.icmp_sgt(var334, 0) & true;
                  if(var87) {
                     var10000 = _str30;
                     var10001 = Memory.allocateStack(4);
                     Memory.pack(var10001, var334);
                     int var337 = c.printf(var10000, var10001);
                     break label283;
                  }
               } else {
                  int var331 = var320 + 1;
                  var10000 = _str29;
                  var10001 = Memory.allocateStack(4);
                  Memory.pack(var10001, var331);
                  int var332 = c.printf(var10000, var10001);
               }

               int var338 = c.printf(_str31, Memory.allocateStack(0));
            }

            int var339 = liblua.luaP_opnames + 4 * var323;
            int var340 = Memory.load_i32(var339);
            var10000 = _str32;
            var10001 = Memory.allocateStack(4);
            Memory.pack(var10001, var340);
            int var341 = c.printf(var10000, var10001);
            int var342 = liblua.luaP_opmodes + 1 * var323;
            byte var343 = (byte)Memory.load_i8(var342);
            int var344 = Instruction.zext_i32(var343);
            int var345 = var344 & 3;
            var97 = Instruction.icmp_slt(var345, 1) & true;
            if(!var97) {
               var98 = Instruction.icmp_slt(var345, 2) & true;
               if(!var98) {
                  var99 = Instruction.icmp_eq(var345, 2) & true;
                  if(var99) {
                     var133 = Instruction.icmp_eq(var323, 22) & true;
                     if(!var133) {
                        var10000 = _str35;
                        var10001 = Memory.allocateStack(8);
                        Memory.pack(Memory.pack(var10001, var325), var329);
                        int var373 = c.printf(var10000, var10001);
                     } else {
                        var10000 = _str33;
                        var10001 = Memory.allocateStack(4);
                        Memory.pack(var10001, var329);
                        int var372 = c.printf(var10000, var10001);
                     }
                  }
               } else {
                  var100 = Instruction.icmp_eq(var345, 1) & true;
                  if(var100) {
                     byte var366 = (byte)(var343 >>> 4);
                     int var367 = Instruction.zext_i32(var366);
                     int var368 = var367 & 3;
                     var129 = Instruction.icmp_eq(var368, 3) & true;
                     if(!var129) {
                        var10000 = _str35;
                        var10001 = Memory.allocateStack(8);
                        Memory.pack(Memory.pack(var10001, var325), var327);
                        int var371 = c.printf(var10000, var10001);
                     } else {
                        int var369 = ~var327;
                        var10000 = _str35;
                        var10001 = Memory.allocateStack(8);
                        Memory.pack(Memory.pack(var10001, var325), var369);
                        int var370 = c.printf(var10000, var10001);
                     }
                  }
               }
            } else {
               var101 = Instruction.icmp_eq(var345, 0) & true;
               if(var101) {
                  var10000 = _str33;
                  var10001 = Memory.allocateStack(4);
                  Memory.pack(var10001, var325);
                  int var346 = c.printf(var10000, var10001);
                  byte var347 = (byte)Memory.load_i8(var342);
                  byte var348 = (byte)(var347 >>> 4);
                  int var349 = Instruction.zext_i32(var348);
                  int var350 = var349 & 3;
                  var107 = Instruction.icmp_eq(var350, 0) & true;
                  byte var357;
                  if(!var107) {
                     int var351 = var326 & 256;
                     var109 = Instruction.icmp_eq(var351, 0) & true;
                     int var354;
                     if(!var109) {
                        int var352 = var326 | -256;
                        int var353 = var352 ^ 255;
                        var354 = var353;
                     } else {
                        var354 = var326;
                     }

                     var10000 = _str34;
                     var10001 = Memory.allocateStack(4);
                     Memory.pack(var10001, var354);
                     int var355 = c.printf(var10000, var10001);
                     byte var356 = (byte)Memory.load_i8(var342);
                     var357 = (byte)var356;
                  } else {
                     var357 = (byte)var347;
                  }

                  byte var358 = (byte)(var357 >>> 2);
                  int var359 = Instruction.zext_i32(var358);
                  int var360 = var359 & 3;
                  var119 = Instruction.icmp_eq(var360, 0) & true;
                  if(!var119) {
                     int var361 = var327 & 256;
                     var121 = Instruction.icmp_eq(var361, 0) & true;
                     int var364;
                     if(!var121) {
                        int var362 = var327 | -256;
                        int var363 = var362 ^ 255;
                        var364 = var363;
                     } else {
                        var364 = var328;
                     }

                     var10000 = _str34;
                     var10001 = Memory.allocateStack(4);
                     Memory.pack(var10001, var364);
                     int var365 = c.printf(var10000, var10001);
                  }
               }
            }

            int var415;
            label358: {
               label388: {
                  var136 = Instruction.icmp_slt(var323, 11) & true;
                  if(!var136) {
                     label322: {
                        var137 = Instruction.icmp_slt(var323, 23) & true;
                        if(!var137) {
                           var138 = Instruction.icmp_slt(var323, 34) & true;
                           if(!var138) {
                              var139 = Instruction.icmp_slt(var323, 36) & true;
                              if(!var139) {
                                 var140 = Instruction.icmp_eq(var323, 36) & true;
                                 if(!var140) {
                                    var415 = var320;
                                 } else {
                                    int var406 = Memory.load_i32(var319);
                                    int var407 = var406 + 4 * var327;
                                    int var408 = Memory.load_i32(var407);
                                    var10000 = _str41;
                                    var10001 = Memory.allocateStack(4);
                                    Memory.pack(var10001, var408);
                                    int var409 = c.printf(var10000, var10001);
                                    var415 = var320;
                                 }
                              } else {
                                 var141 = Instruction.icmp_eq(var323, 34) & true;
                                 if(!var141) {
                                    var415 = var320;
                                 } else {
                                    var208 = Instruction.icmp_eq(var328, 0) & true;
                                    if(!var208) {
                                       var10000 = _str42;
                                       var10001 = Memory.allocateStack(4);
                                       Memory.pack(var10001, var328);
                                       int var414 = c.printf(var10000, var10001);
                                       var415 = var320;
                                    } else {
                                       int var410 = var320 + 1;
                                       int var411 = var313 + 4 * var410;
                                       int var412 = Memory.load_i32(var411);
                                       var10000 = _str42;
                                       var10001 = Memory.allocateStack(4);
                                       Memory.pack(var10001, var412);
                                       int var413 = c.printf(var10000, var10001);
                                       var415 = var410;
                                    }
                                 }
                              }
                              break label358;
                           }

                           var142 = Instruction.icmp_slt(var323, 31) & true;
                           if(var142) {
                              int var375 = var323 + -23;
                              var146 = Instruction.icmp_ule(var375, 2) & true;
                              if(!var146) {
                                 var415 = var320;
                                 break label358;
                              }
                              break label388;
                           }

                           int var374 = var323 + -31;
                           var144 = Instruction.icmp_ule(var374, 1) & true;
                           if(!var144) {
                              var415 = var320;
                              break label358;
                           }
                        } else {
                           var147 = Instruction.icmp_slt(var323, 17) & true;
                           if(var147) {
                              var151 = Instruction.icmp_slt(var323, 12) & true;
                              if(!var151) {
                                 int var376 = var323 + -12;
                                 var153 = Instruction.icmp_ule(var376, 3) & true;
                                 if(!var153) {
                                    var415 = var320;
                                    break label358;
                                 }
                                 break label388;
                              }

                              var154 = Instruction.icmp_eq(var323, 11) & true;
                              if(!var154) {
                                 var415 = var320;
                                 break label358;
                              }
                              break label322;
                           }

                           var148 = Instruction.icmp_slt(var323, 22) & true;
                           if(var148) {
                              var150 = Instruction.icmp_eq(var323, 17) & true;
                              if(!var150) {
                                 var415 = var320;
                                 break label358;
                              }
                              break label388;
                           }

                           var149 = Instruction.icmp_eq(var323, 22) & true;
                           if(!var149) {
                              var415 = var320;
                              break label358;
                           }
                        }

                        int var403 = var320 + 2;
                        int var404 = var403 + var329;
                        var10000 = _str40;
                        var10001 = Memory.allocateStack(4);
                        Memory.pack(var10001, var404);
                        int var405 = c.printf(var10000, var10001);
                        var415 = var320;
                        break label358;
                     }
                  } else {
                     label385: {
                        label334: {
                           var155 = Instruction.icmp_slt(var323, 6) & true;
                           if(!var155) {
                              var156 = Instruction.icmp_slt(var323, 8) & true;
                              if(!var156) {
                                 var157 = Instruction.icmp_slt(var323, 9) & true;
                                 if(!var157) {
                                    var158 = Instruction.icmp_eq(var323, 9) & true;
                                    if(!var158) {
                                       var415 = var320;
                                       break label358;
                                    }
                                    break label388;
                                 }

                                 var159 = Instruction.icmp_eq(var323, 8) & true;
                                 if(!var159) {
                                    var415 = var320;
                                    break label358;
                                 }
                                 break label334;
                              }

                              var160 = Instruction.icmp_slt(var323, 7) & true;
                              if(var160) {
                                 var162 = Instruction.icmp_eq(var323, 6) & true;
                                 if(!var162) {
                                    var415 = var320;
                                    break label358;
                                 }
                                 break label385;
                              }

                              var161 = Instruction.icmp_eq(var323, 7) & true;
                              if(!var161) {
                                 var415 = var320;
                                 break label358;
                              }
                           } else {
                              var163 = Instruction.icmp_slt(var323, 4) & true;
                              if(var163) {
                                 var167 = Instruction.icmp_eq(var323, 1) & true;
                                 if(!var167) {
                                    var415 = var320;
                                 } else {
                                    int var377 = c.printf(_str36, Memory.allocateStack(0));
                                    PrintConstant(var0, var327);
                                    var415 = var320;
                                 }
                                 break label358;
                              }

                              var164 = Instruction.icmp_slt(var323, 5) & true;
                              if(var164) {
                                 var166 = Instruction.icmp_eq(var323, 4) & true;
                                 if(!var166) {
                                    var415 = var320;
                                    break label358;
                                 }
                                 break label334;
                              }

                              var165 = Instruction.icmp_eq(var323, 5) & true;
                              if(!var165) {
                                 var415 = var320;
                                 break label358;
                              }
                           }

                           int var385 = Memory.load_i32(var318);
                           int var386 = var385 + 16 * var327;
                           int var387 = Memory.load_i32(var386);
                           int var388 = var387 + 0 + 16;
                           var10000 = _str38;
                           var10001 = Memory.allocateStack(4);
                           Memory.pack(var10001, var388);
                           int var389 = c.printf(var10000, var10001);
                           var415 = var320;
                           break label358;
                        }

                        int var378 = Memory.load_i32(var316);
                        var170 = Instruction.icmp_sgt(var378, 0) & true;
                        int var383;
                        if(!var170) {
                           var383 = _str37;
                        } else {
                           int var379 = Memory.load_i32(var317);
                           int var380 = var379 + 4 * var326;
                           int var381 = Memory.load_i32(var380);
                           int var382 = var381 + 16;
                           var383 = var382;
                        }

                        var10000 = _str38;
                        var10001 = Memory.allocateStack(4);
                        Memory.pack(var10001, var383);
                        int var384 = c.printf(var10000, var10001);
                        var415 = var320;
                        break label358;
                     }
                  }

                  int var390 = var327 & 256;
                  var185 = Instruction.icmp_eq(var390, 0) & true;
                  if(!var185) {
                     int var391 = c.printf(_str36, Memory.allocateStack(0));
                     int var392 = var327 & 255;
                     PrintConstant(var0, var392);
                     var415 = var320;
                  } else {
                     var415 = var320;
                  }
                  break label358;
               }

               label305: {
                  int var393 = var326 & 256;
                  var189 = Instruction.icmp_eq(var393, 0) & true;
                  if(!var189) {
                     int var396 = c.printf(_str36, Memory.allocateStack(0));
                  } else {
                     int var394 = var327 & 256;
                     var191 = Instruction.icmp_eq(var394, 0) & true;
                     if(var191) {
                        var415 = var320;
                        break label358;
                     }

                     int var395 = c.printf(_str36, Memory.allocateStack(0));
                     if(var189) {
                        int var398 = c.printf(_str37, Memory.allocateStack(0));
                        break label305;
                     }
                  }

                  int var397 = var326 & 255;
                  PrintConstant(var0, var397);
               }

               int var399 = c.printf(_str39, Memory.allocateStack(0));
               int var400 = var327 & 256;
               var198 = Instruction.icmp_eq(var400, 0) & true;
               if(!var198) {
                  int var401 = var327 & 255;
                  PrintConstant(var0, var401);
                  var415 = var320;
               } else {
                  int var402 = c.printf(_str37, Memory.allocateStack(0));
                  var415 = var320;
               }
            }

            int var416 = c.printf(_str43, Memory.allocateStack(0));
            int var417 = var415 + 1;
            var217 = Instruction.icmp_slt(var417, var314) & true;
            if(!var217) {
               break;
            }

            var320 = var417;
         }
      }

      var218 = Instruction.icmp_eq(var1, 0) & true;
      if(!var218) {
         int var418 = Memory.load_i32(var305);
         var10000 = _str44;
         var10001 = Memory.allocateStack(8);
         Memory.pack(Memory.pack(var10001, var418), var0);
         int var419 = c.printf(var10000, var10001);
         var221 = Instruction.icmp_sgt(var418, 0) & true;
         if(var221) {
            int var420 = 0;

            while(true) {
               int var421 = var420 + 1;
               var10000 = _str29;
               var10001 = Memory.allocateStack(4);
               Memory.pack(var10001, var421);
               int var422 = c.printf(var10000, var10001);
               PrintConstant(var0, var420);
               int var423 = c.printf(_str43, Memory.allocateStack(0));
               var226 = Instruction.icmp_eq(var421, var418) & true;
               if(var226) {
                  break;
               }

               var420 = var421;
            }
         }

         int var424 = Memory.load_i32(var308);
         var10000 = _str1034;
         var10001 = Memory.allocateStack(8);
         Memory.pack(Memory.pack(var10001, var424), var0);
         int var425 = c.printf(var10000, var10001);
         var229 = Instruction.icmp_sgt(var424, 0) & true;
         if(var229) {
            int var426 = var0 + 24;
            int var427 = 0;

            while(true) {
               int var428 = Memory.load_i32(var426);
               int var429 = var428 + 12 * var427 + 8;
               int var430 = Memory.load_i32(var429);
               int var431 = var430 + 1;
               int var432 = var428 + 12 * var427 + 4;
               int var433 = Memory.load_i32(var432);
               int var434 = var433 + 1;
               int var435 = var428 + 12 * var427 + 0;
               int var436 = Memory.load_i32(var435);
               int var437 = var436 + 16;
               var10000 = _str1135;
               var10001 = Memory.allocateStack(16);
               Memory.pack(Memory.pack(Memory.pack(Memory.pack(var10001, var427), var437), var434), var431);
               int var438 = c.printf(var10000, var10001);
               int var439 = var427 + 1;
               var244 = Instruction.icmp_eq(var439, var424) & true;
               if(var244) {
                  break;
               }

               var427 = var439;
            }
         }

         int var440 = var0 + 36;
         int var441 = Memory.load_i32(var440);
         var10000 = _str1236;
         var10001 = Memory.allocateStack(8);
         Memory.pack(Memory.pack(var10001, var441), var0);
         int var442 = c.printf(var10000, var10001);
         int var443 = var0 + 28;
         int var444 = Memory.load_i32(var443);
         var250 = Instruction.icmp_ne(var444, 0) & true;
         var251 = Instruction.icmp_sgt(var441, 0) & true;
         var252 = var250 & var251 & true;
         if(var252) {
            int var445 = 0;

            while(true) {
               int var446 = Memory.load_i32(var443);
               int var447 = var446 + 4 * var445;
               int var448 = Memory.load_i32(var447);
               int var449 = var448 + 16;
               var10000 = _str1337;
               var10001 = Memory.allocateStack(8);
               Memory.pack(Memory.pack(var10001, var445), var449);
               int var450 = c.printf(var10000, var10001);
               int var451 = var445 + 1;
               var260 = Instruction.icmp_eq(var451, var441) & true;
               if(var260) {
                  break;
               }

               var445 = var451;
            }
         }
      }

      var261 = Instruction.icmp_sgt(var270, 0) & true;
      if(var261) {
         int var452 = var0 + 16;
         int var453 = 0;

         while(true) {
            int var454 = Memory.load_i32(var452);
            int var455 = var454 + 4 * var453;
            int var456 = Memory.load_i32(var455);
            luaU_print(var456, var1);
            int var457 = var453 + 1;
            var268 = Instruction.icmp_eq(var457, var270) & true;
            if(var268) {
               break;
            }

            var453 = var457;
         }
      }

      Memory.destroyStackFrame();
   }

   private static void PrintConstant(int var0, int var1) {
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      double var21 = 0.0D;
      boolean var23 = false;
      boolean var24 = false;
      boolean var25 = false;
      boolean var26 = false;
      boolean var27 = false;
      boolean var28 = false;
      boolean var29 = false;
      boolean var30 = false;
      boolean var31 = false;
      boolean var32 = false;
      boolean var33 = false;
      boolean var34 = false;
      boolean var35 = false;
      boolean var36 = false;
      boolean var37 = false;
      boolean var38 = false;
      boolean var39 = false;
      boolean var40 = false;
      boolean var41 = false;
      boolean var42 = false;
      boolean var43 = false;
      boolean var44 = false;
      boolean var45 = false;
      boolean var46 = false;
      boolean var47 = false;
      boolean var48 = false;
      boolean var49 = false;
      boolean var50 = false;
      boolean var51 = false;
      boolean var52 = false;
      boolean var53 = false;
      boolean var54 = false;
      boolean var55 = false;
      boolean var56 = false;
      boolean var57 = false;
      boolean var58 = false;
      boolean var59 = false;
      boolean var60 = false;
      boolean var61 = false;
      boolean var62 = false;
      boolean var63 = false;
      boolean var64 = false;
      boolean var65 = false;
      boolean var66 = false;
      boolean var67 = false;
      boolean var68 = false;
      boolean var69 = false;
      boolean var70 = false;
      boolean var71 = false;
      boolean var72 = false;
      boolean var73 = false;
      boolean var74 = false;
      boolean var75 = false;
      boolean var76 = false;
      boolean var77 = false;
      boolean var78 = false;
      boolean var79 = false;
      boolean var80 = false;
      boolean var81 = false;
      boolean var82 = false;
      boolean var83 = false;
      boolean var84 = false;
      boolean var85 = false;
      boolean var86 = false;
      boolean var87 = false;
      boolean var88 = false;
      boolean var89 = false;
      boolean var90 = false;
      boolean var91 = false;
      boolean var92 = false;
      boolean var93 = false;
      boolean var94 = false;
      boolean var95 = false;
      boolean var96 = false;
      boolean var97 = false;
      boolean var98 = false;
      boolean var99 = false;
      boolean var100 = false;
      boolean var101 = false;
      boolean var102 = false;
      boolean var103 = false;
      boolean var104 = false;
      boolean var105 = false;
      boolean var106 = false;
      boolean var107 = false;
      boolean var108 = false;
      boolean var109 = false;
      boolean var110 = false;
      boolean var111 = false;
      boolean var112 = false;
      boolean var113 = false;
      boolean var114 = false;
      boolean var115 = false;
      boolean var116 = false;
      boolean var117 = false;
      boolean var118 = false;
      boolean var119 = false;
      boolean var120 = false;
      boolean var121 = false;
      boolean var122 = false;
      boolean var123 = false;
      boolean var124 = false;
      boolean var125 = false;
      boolean var126 = false;
      boolean var127 = false;
      boolean var128 = false;
      boolean var129 = false;
      boolean var130 = false;
      boolean var131 = false;
      boolean var132 = false;
      boolean var133 = false;
      boolean var134 = false;
      boolean var135 = false;
      boolean var136 = false;
      boolean var137 = false;
      boolean var138 = false;
      boolean var139 = false;
      boolean var140 = false;
      boolean var141 = false;
      boolean var142 = false;
      boolean var143 = false;
      boolean var144 = false;
      boolean var145 = false;
      boolean var146 = false;
      boolean var147 = false;
      boolean var148 = false;
      boolean var149 = false;
      boolean var150 = false;
      boolean var151 = false;
      boolean var152 = false;
      boolean var153 = false;
      boolean var154 = false;
      boolean var155 = false;
      boolean var156 = false;
      boolean var157 = false;
      boolean var158 = false;
      boolean var159 = false;
      boolean var160 = false;
      boolean var161 = false;
      boolean var162 = false;
      boolean var163 = false;
      boolean var164 = false;
      boolean var165 = false;
      boolean var166 = false;
      boolean var167 = false;
      boolean var168 = false;
      boolean var169 = false;
      boolean var170 = false;
      boolean var171 = false;
      boolean var172 = false;
      boolean var173 = false;
      boolean var174 = false;
      boolean var175 = false;
      boolean var176 = false;
      boolean var177 = false;
      boolean var178 = false;
      boolean var179 = false;
      boolean var180 = false;
      boolean var181 = false;
      boolean var182 = false;
      boolean var183 = false;
      boolean var184 = false;
      boolean var185 = false;
      boolean var186 = false;
      boolean var187 = false;
      boolean var188 = false;
      boolean var189 = false;
      boolean var190 = false;
      boolean var191 = false;
      boolean var192 = false;
      boolean var193 = false;
      boolean var194 = false;
      boolean var195 = false;
      boolean var196 = false;
      boolean var197 = false;
      boolean var198 = false;
      boolean var199 = false;
      boolean var200 = false;
      boolean var201 = false;
      boolean var202 = false;
      boolean var203 = false;
      boolean var204 = false;
      boolean var205 = false;
      boolean var206 = false;
      boolean var207 = false;
      boolean var208 = false;
      boolean var209 = false;
      boolean var210 = false;
      boolean var211 = false;
      boolean var212 = false;
      boolean var213 = false;
      boolean var214 = false;
      boolean var215 = false;
      boolean var216 = false;
      boolean var217 = false;
      Memory.createStackFrame();
      int var218 = var0 + 8;
      int var219 = Memory.load_i32(var218);
      int var220 = var219 + 16 * var1;
      int var221 = var219 + 16 * var1 + 8;
      int var222 = Memory.load_i32(var221);
      var7 = Instruction.icmp_slt(var222, 3) & true;
      int var10000;
      int var10001;
      if(!var7) {
         var8 = Instruction.icmp_slt(var222, 4) & true;
         if(!var8) {
            var9 = Instruction.icmp_eq(var222, 4) & true;
            if(var9) {
               int var229 = Memory.load_i32(var220);
               int var230 = var229 + 0 + 12;
               int var231 = Memory.load_i32(var230);
               int var232 = c.__getreent();
               int var233 = var232 + 8;
               int var234 = Memory.load_i32(var233);
               int var235 = var234 + 8;
               int var236 = Memory.load_i32(var235);
               int var237 = var236 + -1;
               Memory.store(var235, var237);
               var35 = Instruction.icmp_slt(var237, 0) & true;
               int var238 = c.__getreent();
               int var239 = var238 + 8;
               int var240 = Memory.load_i32(var239);
               if(!var35) {
                  int var267 = var240 + 0;
                  int var268 = Memory.load_i32(var267);
                  Memory.store(var268, (byte)34);
                  int var269 = c.__getreent();
                  int var270 = var269 + 8;
                  int var271 = Memory.load_i32(var270);
                  int var272 = var271 + 0;
                  int var273 = Memory.load_i32(var272);
                  int var274 = var273 + 1;
                  Memory.store(var272, var274);
               } else {
                  int var241 = var240 + 8;
                  int var242 = Memory.load_i32(var241);
                  int var243 = c.__getreent();
                  int var244 = var243 + 8;
                  int var245 = Memory.load_i32(var244);
                  int var246 = var245 + 24;
                  int var247 = Memory.load_i32(var246);
                  var46 = Instruction.icmp_slt(var242, var247) & true;
                  int var248 = c.__getreent();
                  int var249 = var248 + 8;
                  int var250 = Memory.load_i32(var249);
                  if(!var46) {
                     int var251 = var250 + 0;
                     int var252 = Memory.load_i32(var251);
                     Memory.store(var252, (byte)34);
                     int var253 = c.__getreent();
                     int var254 = var253 + 8;
                     int var255 = Memory.load_i32(var254);
                     int var256 = var255 + 0;
                     int var257 = Memory.load_i32(var256);
                     byte var258 = (byte)Memory.load_i8(var257);
                     var58 = Instruction.icmp_eq(var258, 10) & true;
                     int var259 = c.__getreent();
                     int var260 = var259 + 8;
                     int var261 = Memory.load_i32(var260);
                     if(!var58) {
                        int var262 = var261 + 0;
                        int var263 = Memory.load_i32(var262);
                        int var264 = var263 + 1;
                        Memory.store(var262, var264);
                     } else {
                        int var265 = c.__getreent();
                        c.__swbuf_r(var265, 10, var261);
                     }
                  } else {
                     int var266 = c.__getreent();
                     c.__swbuf_r(var266, 34, var250);
                  }
               }

               var77 = Instruction.icmp_eq(var231, 0) & true;
               if(!var77) {
                  int var275 = 0;

                  while(true) {
                     label146: {
                        int var276 = var229 + 0 + 16;
                        int var277 = var276 + 1 * var275;
                        byte var278 = (byte)Memory.load_i8(var277);
                        byte var279 = (byte)var278;
                        var84 = Instruction.icmp_slt(var279, 11) & true;
                        if(!var84) {
                           var85 = Instruction.icmp_slt(var279, 13) & true;
                           if(!var85) {
                              var86 = Instruction.icmp_slt(var279, 34) & true;
                              if(!var86) {
                                 var87 = Instruction.icmp_slt(var279, 92) & true;
                                 if(!var87) {
                                    var88 = Instruction.icmp_eq(var279, 92) & true;
                                    if(var88) {
                                       int var281 = c.printf(_str1539, Memory.allocateStack(0));
                                       break label146;
                                    }
                                 } else {
                                    var89 = Instruction.icmp_eq(var279, 34) & true;
                                    if(var89) {
                                       int var280 = c.printf(_str1438, Memory.allocateStack(0));
                                       break label146;
                                    }
                                 }
                              } else {
                                 var90 = Instruction.icmp_eq(var279, 13) & true;
                                 if(var90) {
                                    int var286 = c.printf(_str2044, Memory.allocateStack(0));
                                    break label146;
                                 }
                              }
                           } else {
                              var91 = Instruction.icmp_slt(var279, 12) & true;
                              if(!var91) {
                                 var92 = Instruction.icmp_eq(var279, 12) & true;
                                 if(var92) {
                                    int var284 = c.printf(_str1842, Memory.allocateStack(0));
                                    break label146;
                                 }
                              } else {
                                 var93 = Instruction.icmp_eq(var279, 11) & true;
                                 if(var93) {
                                    int var288 = c.printf(_str2246, Memory.allocateStack(0));
                                    break label146;
                                 }
                              }
                           }
                        } else {
                           var94 = Instruction.icmp_slt(var279, 9) & true;
                           if(!var94) {
                              var95 = Instruction.icmp_slt(var279, 10) & true;
                              if(!var95) {
                                 var96 = Instruction.icmp_eq(var279, 10) & true;
                                 if(var96) {
                                    int var285 = c.printf(_str1943, Memory.allocateStack(0));
                                    break label146;
                                 }
                              } else {
                                 var97 = Instruction.icmp_eq(var279, 9) & true;
                                 if(var97) {
                                    int var287 = c.printf(_str2145, Memory.allocateStack(0));
                                    break label146;
                                 }
                              }
                           } else {
                              var98 = Instruction.icmp_slt(var279, 8) & true;
                              if(!var98) {
                                 var99 = Instruction.icmp_eq(var279, 8) & true;
                                 if(var99) {
                                    int var283 = c.printf(_str1741, Memory.allocateStack(0));
                                    break label146;
                                 }
                              } else {
                                 var100 = Instruction.icmp_eq(var279, 7) & true;
                                 if(var100) {
                                    int var282 = c.printf(_str1640, Memory.allocateStack(0));
                                    break label146;
                                 }
                              }
                           }
                        }

                        int var289 = Memory.load_i32(c.__ctype_ptr__);
                        int var290 = var279 & 255;
                        int var291 = var290 + 1;
                        int var292 = var289 + 1 * var291;
                        byte var293 = (byte)Memory.load_i8(var292);
                        int var294 = Instruction.zext_i32(var293);
                        int var295 = var294 & 151;
                        var117 = Instruction.icmp_eq(var295, 0) & true;
                        if(!var117) {
                           int var296 = c.__getreent();
                           int var297 = var296 + 8;
                           int var298 = Memory.load_i32(var297);
                           int var299 = var298 + 8;
                           int var300 = Memory.load_i32(var299);
                           int var301 = var300 + -1;
                           Memory.store(var299, var301);
                           var124 = Instruction.icmp_slt(var301, 0) & true;
                           int var302 = c.__getreent();
                           int var303 = var302 + 8;
                           int var304 = Memory.load_i32(var303);
                           if(!var124) {
                              int var331 = var304 + 0;
                              int var332 = Memory.load_i32(var331);
                              Memory.store(var332, var278);
                              int var333 = c.__getreent();
                              int var334 = var333 + 8;
                              int var335 = Memory.load_i32(var334);
                              int var336 = var335 + 0;
                              int var337 = Memory.load_i32(var336);
                              int var338 = var337 + 1;
                              Memory.store(var336, var338);
                           } else {
                              int var305 = var304 + 8;
                              int var306 = Memory.load_i32(var305);
                              int var307 = c.__getreent();
                              int var308 = var307 + 8;
                              int var309 = Memory.load_i32(var308);
                              int var310 = var309 + 24;
                              int var311 = Memory.load_i32(var310);
                              var135 = Instruction.icmp_slt(var306, var311) & true;
                              int var312 = c.__getreent();
                              int var313 = var312 + 8;
                              int var314 = Memory.load_i32(var313);
                              if(!var135) {
                                 int var315 = var314 + 0;
                                 int var316 = Memory.load_i32(var315);
                                 Memory.store(var316, var278);
                                 int var317 = c.__getreent();
                                 int var318 = var317 + 8;
                                 int var319 = Memory.load_i32(var318);
                                 int var320 = var319 + 0;
                                 int var321 = Memory.load_i32(var320);
                                 byte var322 = (byte)Memory.load_i8(var321);
                                 var147 = Instruction.icmp_eq(var322, 10) & true;
                                 int var323 = c.__getreent();
                                 int var324 = var323 + 8;
                                 int var325 = Memory.load_i32(var324);
                                 if(!var147) {
                                    int var326 = var325 + 0;
                                    int var327 = Memory.load_i32(var326);
                                    int var328 = var327 + 1;
                                    Memory.store(var326, var328);
                                 } else {
                                    int var329 = c.__getreent();
                                    c.__swbuf_r(var329, 10, var325);
                                 }
                              } else {
                                 int var330 = c.__getreent();
                                 c.__swbuf_r(var330, var279, var314);
                              }
                           }
                        } else {
                           var10000 = _str2347;
                           var10001 = Memory.allocateStack(4);
                           Memory.pack(var10001, var290);
                           int var339 = c.printf(var10000, var10001);
                        }
                     }

                     int var340 = var275 + 1;
                     var168 = Instruction.icmp_eq(var340, var231) & true;
                     if(var168) {
                        break;
                     }

                     var275 = var340;
                  }
               }

               int var341 = c.__getreent();
               int var342 = var341 + 8;
               int var343 = Memory.load_i32(var342);
               int var344 = var343 + 8;
               int var345 = Memory.load_i32(var344);
               int var346 = var345 + -1;
               Memory.store(var344, var346);
               var175 = Instruction.icmp_slt(var346, 0) & true;
               int var347 = c.__getreent();
               int var348 = var347 + 8;
               int var349 = Memory.load_i32(var348);
               if(!var175) {
                  int var376 = var349 + 0;
                  int var377 = Memory.load_i32(var376);
                  Memory.store(var377, (byte)34);
                  int var378 = c.__getreent();
                  int var379 = var378 + 8;
                  int var380 = Memory.load_i32(var379);
                  int var381 = var380 + 0;
                  int var382 = Memory.load_i32(var381);
                  int var383 = var382 + 1;
                  Memory.store(var381, var383);
                  Memory.destroyStackFrame();
                  return;
               }

               int var350 = var349 + 8;
               int var351 = Memory.load_i32(var350);
               int var352 = c.__getreent();
               int var353 = var352 + 8;
               int var354 = Memory.load_i32(var353);
               int var355 = var354 + 24;
               int var356 = Memory.load_i32(var355);
               var186 = Instruction.icmp_slt(var351, var356) & true;
               int var357 = c.__getreent();
               int var358 = var357 + 8;
               int var359 = Memory.load_i32(var358);
               if(!var186) {
                  int var360 = var359 + 0;
                  int var361 = Memory.load_i32(var360);
                  Memory.store(var361, (byte)34);
                  int var362 = c.__getreent();
                  int var363 = var362 + 8;
                  int var364 = Memory.load_i32(var363);
                  int var365 = var364 + 0;
                  int var366 = Memory.load_i32(var365);
                  byte var367 = (byte)Memory.load_i8(var366);
                  var198 = Instruction.icmp_eq(var367, 10) & true;
                  int var368 = c.__getreent();
                  int var369 = var368 + 8;
                  int var370 = Memory.load_i32(var369);
                  if(!var198) {
                     int var371 = var370 + 0;
                     int var372 = Memory.load_i32(var371);
                     int var373 = var372 + 1;
                     Memory.store(var371, var373);
                     Memory.destroyStackFrame();
                     return;
                  }

                  int var374 = c.__getreent();
                  c.__swbuf_r(var374, 10, var370);
                  Memory.destroyStackFrame();
                  return;
               }

               int var375 = c.__getreent();
               c.__swbuf_r(var375, 34, var359);
               Memory.destroyStackFrame();
               return;
            }
         } else {
            var10 = Instruction.icmp_eq(var222, 3) & true;
            if(var10) {
               int var227 = var219 + 16 * var1 + 0 + 0;
               var21 = Memory.load_f64(var227);
               var10000 = _str27;
               var10001 = Memory.allocateStack(8);
               Memory.pack(var10001, var21);
               int var228 = c.printf(var10000, var10001);
               Memory.destroyStackFrame();
               return;
            }
         }
      } else {
         var11 = Instruction.icmp_slt(var222, 1) & true;
         if(!var11) {
            var12 = Instruction.icmp_eq(var222, 1) & true;
            if(var12) {
               int var224 = Memory.load_i32(var220);
               var17 = Instruction.icmp_eq(var224, 0) & true;
               int var225 = var17?_str26:_str25;
               int var226 = c.printf(var225, Memory.allocateStack(0));
               Memory.destroyStackFrame();
               return;
            }
         } else {
            var13 = Instruction.icmp_eq(var222, 0) & true;
            if(var13) {
               int var223 = c.printf(_str2448, Memory.allocateStack(0));
               Memory.destroyStackFrame();
               return;
            }
         }
      }

      var10000 = _str28;
      var10001 = Memory.allocateStack(4);
      Memory.pack(var10001, var222);
      int var384 = c.printf(var10000, var10001);
      Memory.destroyStackFrame();
   }
}
