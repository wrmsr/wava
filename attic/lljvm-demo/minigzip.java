import lljvm.lib.c;
import lljvm.runtime.IO;
import lljvm.runtime.Instruction;
import lljvm.runtime.Memory;
import lljvm.runtime.Instruction.Unreachable;

public final class minigzip {
   public static final int prog = Memory.allocateData(4);
   private static final int _str = Memory.allocateData(8);
   private static final int _str1 = Memory.allocateData(14);
   private static final int _str2 = Memory.allocateData(14);
   private static final int _str3 = Memory.allocateData(15);
   private static final int _str4 = Memory.allocateData(4);
   private static final int _str5 = Memory.allocateData(3);
   private static final int _str6 = Memory.allocateData(21);
   private static final int _str7 = Memory.allocateData(3);
   private static final int _str8 = Memory.allocateData(6);
   private static final int _str9 = Memory.allocateData(5);
   private static final int _str10 = Memory.allocateData(3);
   private static final int _str11 = Memory.allocateData(3);
   private static final int _str12 = Memory.allocateData(3);
   private static final int _str13 = Memory.allocateData(3);
   private static final int _str14 = Memory.allocateData(20);
   private static final int _str15 = Memory.allocateData(21);

   {
      Memory.zero(prog, 4);
      Memory.pack(_str, "%s: %s\n");
      Memory.pack(_str1, "failed fwrite");
      Memory.pack(_str2, "failed fclose");
      Memory.pack(_str3, "failed gzclose");
      Memory.pack(_str4, ".gz");
      Memory.pack(_str5, "rb");
      Memory.pack(_str6, "%s: can\'t gzopen %s\n");
      Memory.pack(_str7, "wb");
      Memory.pack(_str8, "fread");
      Memory.pack(_str9, "wb6 ");
      Memory.pack(_str10, "-d");
      Memory.pack(_str11, "-f");
      Memory.pack(_str12, "-h");
      Memory.pack(_str13, "-r");
      Memory.pack(_str14, "can\'t gzdopen stdin");
      Memory.pack(_str15, "can\'t gzdopen stdout");
   }

   public static void main(String[] var0) {
      c.exit(main(var0.length, Memory.storeStack(var0)));
   }

   public static void error(int var0) {
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      Memory.createStackFrame();
      int var6 = Memory.load_i32(prog);
      int var7 = c.__getreent();
      int var8 = var7 + 12;
      int var9 = Memory.load_i32(var8);
      int var10001 = _str;
      int var10002 = Memory.allocateStack(8);
      Memory.pack(Memory.pack(var10002, var6), var0);
      c.fprintf(var9, var10001, var10002);
      c.exit(1);
      throw Unreachable.instance;
   }

   public static void gz_uncompress(int var0, int var1) {
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
      Memory.createStackFrame();
      int var15 = Memory.allocateStack(4);
      int var16 = Memory.allocateStack(16384);
      int var17 = var16;

      while(true) {
         int var18 = libz.gzread(var0, var17, 16384);
         var6 = Instruction.icmp_slt(var18, 0) & true;
         if(var6) {
            int var19 = libz.gzerror(var0, var15);
            error(var19);
         }

         var8 = Instruction.icmp_eq(var18, 0) & true;
         if(var8) {
            int var21 = c.fclose(var1);
            var12 = Instruction.icmp_eq(var21, 0) & true;
            if(!var12) {
               error(_str2);
            }

            int var22 = libz.gzclose(var0);
            var14 = Instruction.icmp_eq(var22, 0) & true;
            if(!var14) {
               error(_str3);
               Memory.destroyStackFrame();
               return;
            }

            Memory.destroyStackFrame();
            return;
         }

         int var20 = c.fwrite(var17, 1, var18, var1);
         var10 = Instruction.icmp_eq(var20, var18) & true;
         if(!var10) {
            error(_str1);
         }
      }
   }

   public static void file_uncompress(int var0) {
      boolean var15;
      boolean var22;
      int var31;
      int var32;
      label24: {
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
         var15 = false;
         boolean var16 = false;
         boolean var17 = false;
         boolean var18 = false;
         boolean var19 = false;
         boolean var20 = false;
         boolean var21 = false;
         var22 = false;
         boolean var23 = false;
         Memory.createStackFrame();
         int var24 = Memory.allocateStack(1024);
         int var25 = c.strlen(var0);
         c.strcpy(var24, var0);
         var5 = Instruction.icmp_ugt(var25, 3) & true;
         if(var5) {
            int var26 = var25 + -3;
            int var27 = var0 + 1 * var26;
            int var28 = c.strcmp(var27, _str4);
            var9 = Instruction.icmp_eq(var28, 0) & true;
            if(var9) {
               int var29 = var24 + 1 * var26;
               Memory.store(var29, (byte)0);
               var31 = var24;
               var32 = var0;
               break label24;
            }
         }

         int var30 = c.strcat(var24, _str4);
         var31 = var0;
         var32 = var24;
      }

      int var33 = libz.gzopen(var32, _str5);
      var15 = Instruction.icmp_eq(var33, 0) & true;
      if(!var15) {
         int var38 = c.fopen(var31, _str7);
         var22 = Instruction.icmp_eq(var38, 0) & true;
         if(!var22) {
            gz_uncompress(var33, var38);
            int var39 = IO.unlink(var32);
            Memory.destroyStackFrame();
         } else {
            c.perror(var0);
            c.exit(1);
            throw Unreachable.instance;
         }
      } else {
         int var34 = Memory.load_i32(prog);
         int var35 = c.__getreent();
         int var36 = var35 + 12;
         int var37 = Memory.load_i32(var36);
         int var10001 = _str6;
         int var10002 = Memory.allocateStack(8);
         Memory.pack(Memory.pack(var10002, var34), var32);
         c.fprintf(var37, var10001, var10002);
         c.exit(1);
         throw Unreachable.instance;
      }
   }

   public static void gz_compress(int var0, int var1) {
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
      Memory.createStackFrame();
      int var18 = Memory.allocateStack(4);
      int var19 = Memory.allocateStack(16384);
      int var20 = var19;
      int var21 = var0 + 12;

      while(true) {
         int var22 = c.fread(var20, 1, 16384, var0);
         short var23 = (short)Memory.load_i16(var21);
         int var24 = Instruction.zext_i32(var23);
         int var25 = var24 & 64;
         var10 = Instruction.icmp_eq(var25, 0) & true;
         if(!var10) {
            c.perror(_str8);
            c.exit(1);
            throw Unreachable.instance;
         }

         var11 = Instruction.icmp_eq(var22, 0) & true;
         if(var11) {
            int var28 = c.fclose(var0);
            int var29 = libz.gzclose(var1);
            var17 = Instruction.icmp_eq(var29, 0) & true;
            if(!var17) {
               error(_str3);
               Memory.destroyStackFrame();
               return;
            }

            Memory.destroyStackFrame();
            return;
         }

         int var26 = libz.gzwrite(var1, var20, var22);
         var13 = Instruction.icmp_eq(var26, var22) & true;
         if(!var13) {
            int var27 = libz.gzerror(var1, var18);
            error(var27);
         }
      }
   }

   public static void file_compress(int var0, int var1) {
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
      Memory.createStackFrame();
      int var16 = Memory.allocateStack(1024);
      c.strcpy(var16, var0);
      int var17 = c.strcat(var16, _str4);
      int var18 = c.fopen(var0, _str5);
      var7 = Instruction.icmp_eq(var18, 0) & true;
      if(!var7) {
         int var19 = libz.gzopen(var16, var1);
         var9 = Instruction.icmp_eq(var19, 0) & true;
         if(!var9) {
            gz_compress(var18, var19);
            int var24 = IO.unlink(var0);
            Memory.destroyStackFrame();
         } else {
            int var20 = Memory.load_i32(prog);
            int var21 = c.__getreent();
            int var22 = var21 + 12;
            int var23 = Memory.load_i32(var22);
            int var10001 = _str6;
            int var10002 = Memory.allocateStack(8);
            Memory.pack(Memory.pack(var10002, var20), var16);
            c.fprintf(var23, var10001, var10002);
            c.exit(1);
            throw Unreachable.instance;
         }
      } else {
         c.perror(var0);
         c.exit(1);
         throw Unreachable.instance;
      }
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
      Memory.createStackFrame();
      int var68 = Memory.allocateStack(20);
      int var69 = var68;
      int var70 = c.strcpy(var68, _str9);
      int var71 = Memory.load_i32(var1);
      Memory.store(prog, var71);
      int var72 = var68 + 3;
      int var73 = var68 + 2;
      byte var74 = 0;
      int var75 = var1;
      int var76 = var0;

      int var77;
      int var96;
      int var98;
      int var99;
      label84:
      while(true) {
         var77 = var76 + -1;
         var96 = 0;

         while(true) {
            int var97 = var96 + 1;
            var98 = var75 + 4 * var97;
            var99 = var77 - var96;
            var40 = Instruction.icmp_sgt(var99, 0) & true;
            if(!var40) {
               break label84;
            }

            int var78 = Memory.load_i32(var98);
            int var79 = c.strcmp(var78, _str10);
            var14 = Instruction.icmp_eq(var79, 0) & true;
            if(var14) {
               var74 = 1;
               var75 = var98;
               var76 = var99;
               break;
            }

            int var80 = Memory.load_i32(var98);
            int var81 = c.strcmp(var80, _str11);
            var17 = Instruction.icmp_eq(var81, 0) & true;
            if(!var17) {
               int var82 = Memory.load_i32(var98);
               int var83 = c.strcmp(var82, _str12);
               var20 = Instruction.icmp_eq(var83, 0) & true;
               if(!var20) {
                  int var84 = Memory.load_i32(var98);
                  int var85 = c.strcmp(var84, _str13);
                  var23 = Instruction.icmp_eq(var85, 0) & true;
                  if(!var23) {
                     int var86 = Memory.load_i32(var98);
                     byte var87 = (byte)Memory.load_i8(var86);
                     var26 = Instruction.icmp_eq(var87, 45) & true;
                     if(!var26) {
                        break label84;
                     }

                     int var88 = var86 + 1;
                     byte var89 = (byte)Memory.load_i8(var88);
                     int var90 = Instruction.icmp_sgt(var89, 48) & 1;
                     int var91 = ~var90 & 1;
                     int var92 = Instruction.icmp_sgt(var89, 57) & 1;
                     int var93 = (var91 | var92) & 1;
                     if(var93 != 0) {
                        break label84;
                     }

                     int var94 = var86 + 2;
                     byte var95 = (byte)Memory.load_i8(var94);
                     var35 = Instruction.icmp_eq(var95, 0) & true;
                     if(!var35) {
                        break label84;
                     }

                     Memory.store(var73, var89);
                     var96 = var97;
                  } else {
                     Memory.store(var72, (byte)82);
                     var96 = var97;
                  }
               } else {
                  Memory.store(var72, (byte)104);
                  var96 = var97;
               }
            } else {
               Memory.store(var72, (byte)102);
               var96 = var97;
            }
         }
      }

      byte var100 = (byte)Memory.load_i8(var72);
      var42 = Instruction.icmp_eq(var100, 32) & true;
      if(var42) {
         Memory.store(var72, (byte)0);
      }

      var43 = Instruction.icmp_eq(var96, var77) & true;
      var44 = Instruction.icmp_eq(var74, 0) & true;
      if(!var43) {
         int var116 = var98;
         int var117 = var99;

         while(true) {
            int var118 = Memory.load_i32(var116);
            if(!var44) {
               file_uncompress(var118);
            } else {
               file_compress(var118, var69);
            }

            int var119 = var116 + 4;
            int var120 = var117 + -1;
            var67 = Instruction.icmp_eq(var117, 1) & true;
            if(var67) {
               Memory.destroyStackFrame();
               return 0;
            }

            var116 = var119;
            var117 = var120;
         }
      } else {
         int var101 = c.__getreent();
         if(!var44) {
            int var102 = var101 + 4;
            int var103 = Memory.load_i32(var102);
            int var104 = c.fileno(var103);
            int var105 = libz.gzdopen(var104, _str5);
            var50 = Instruction.icmp_eq(var105, 0) & true;
            if(var50) {
               error(_str14);
            }

            int var106 = c.__getreent();
            int var107 = var106 + 8;
            int var108 = Memory.load_i32(var107);
            gz_uncompress(var105, var108);
            Memory.destroyStackFrame();
            return 0;
         } else {
            int var109 = var101 + 8;
            int var110 = Memory.load_i32(var109);
            int var111 = c.fileno(var110);
            int var112 = libz.gzdopen(var111, var68);
            var58 = Instruction.icmp_eq(var112, 0) & true;
            if(var58) {
               error(_str15);
            }

            int var113 = c.__getreent();
            int var114 = var113 + 4;
            int var115 = Memory.load_i32(var114);
            gz_compress(var115, var112);
            Memory.destroyStackFrame();
            return 0;
         }
      }
   }
}
