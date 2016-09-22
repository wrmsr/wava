import lljvm.lib.c;
import lljvm.runtime.Instruction;
import lljvm.runtime.Memory;
import lljvm.runtime.Instruction.Unreachable;

public final class morse {
   private static final int digit = Memory.allocateData(40);
   private static final int _str = Memory.allocateData(6);
   private static final int _str1 = Memory.allocateData(6);
   private static final int _str2 = Memory.allocateData(6);
   private static final int _str3 = Memory.allocateData(6);
   private static final int _str4 = Memory.allocateData(6);
   private static final int _str5 = Memory.allocateData(6);
   private static final int _str6 = Memory.allocateData(6);
   private static final int _str7 = Memory.allocateData(6);
   private static final int _str8 = Memory.allocateData(6);
   private static final int _str9 = Memory.allocateData(6);
   private static final int alph = Memory.allocateData(104);
   private static final int _str10 = Memory.allocateData(3);
   private static final int _str11 = Memory.allocateData(5);
   private static final int _str12 = Memory.allocateData(5);
   private static final int _str13 = Memory.allocateData(4);
   private static final int _str14 = Memory.allocateData(2);
   private static final int _str15 = Memory.allocateData(5);
   private static final int _str16 = Memory.allocateData(4);
   private static final int _str17 = Memory.allocateData(5);
   private static final int _str18 = Memory.allocateData(3);
   private static final int _str19 = Memory.allocateData(5);
   private static final int _str20 = Memory.allocateData(4);
   private static final int _str21 = Memory.allocateData(5);
   private static final int _str22 = Memory.allocateData(3);
   private static final int _str23 = Memory.allocateData(3);
   private static final int _str24 = Memory.allocateData(4);
   private static final int _str25 = Memory.allocateData(5);
   private static final int _str26 = Memory.allocateData(5);
   private static final int _str27 = Memory.allocateData(4);
   private static final int _str28 = Memory.allocateData(4);
   private static final int _str29 = Memory.allocateData(2);
   private static final int _str30 = Memory.allocateData(4);
   private static final int _str31 = Memory.allocateData(5);
   private static final int _str32 = Memory.allocateData(4);
   private static final int _str33 = Memory.allocateData(5);
   private static final int _str34 = Memory.allocateData(5);
   private static final int _str35 = Memory.allocateData(5);
   public static final int other = Memory.allocateData(104);
   private static final int _str36 = Memory.allocateData(7);
   private static final int _str37 = Memory.allocateData(7);
   private static final int _str38 = Memory.allocateData(7);
   private static final int _str39 = Memory.allocateData(7);
   private static final int _str40 = Memory.allocateData(7);
   private static final int _str41 = Memory.allocateData(7);
   private static final int _str42 = Memory.allocateData(6);
   private static final int _str43 = Memory.allocateData(6);
   private static final int _str44 = Memory.allocateData(7);
   private static final int _str45 = Memory.allocateData(7);
   private static final int _str46 = Memory.allocateData(6);
   private static final int _str47 = Memory.allocateData(6);
   private static final int dflag = Memory.allocateData(4);
   private static final int sflag = Memory.allocateData(4);
   private static final int _str48 = Memory.allocateData(33);
   private static final int _str49 = Memory.allocateData(3);
   private static final int _str50 = Memory.allocateData(1);
   private static final int _str51 = Memory.allocateData(7);
   private static final int _str52 = Memory.allocateData(4);
   private static final int _str53 = Memory.allocateData(4);
   private static final int _str54 = Memory.allocateData(4);
   private static final int _str55 = Memory.allocateData(2);
   private static final int _str56 = Memory.allocateData(2);

   {
      Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(digit, _str), _str1), _str2), _str3), _str4), _str5), _str6), _str7), _str8), _str9);
      Memory.pack(_str, "-----");
      Memory.pack(_str1, ".----");
      Memory.pack(_str2, "..---");
      Memory.pack(_str3, "...--");
      Memory.pack(_str4, "....-");
      Memory.pack(_str5, ".....");
      Memory.pack(_str6, "-....");
      Memory.pack(_str7, "--...");
      Memory.pack(_str8, "---..");
      Memory.pack(_str9, "----.");
      Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(alph, _str10), _str11), _str12), _str13), _str14), _str15), _str16), _str17), _str18), _str19), _str20), _str21), _str22), _str23), _str24), _str25), _str26), _str27), _str28), _str29), _str30), _str31), _str32), _str33), _str34), _str35);
      Memory.pack(_str10, ".-");
      Memory.pack(_str11, "-...");
      Memory.pack(_str12, "-.-.");
      Memory.pack(_str13, "-..");
      Memory.pack(_str14, ".");
      Memory.pack(_str15, "..-.");
      Memory.pack(_str16, "--.");
      Memory.pack(_str17, "....");
      Memory.pack(_str18, "..");
      Memory.pack(_str19, ".---");
      Memory.pack(_str20, "-.-");
      Memory.pack(_str21, ".-..");
      Memory.pack(_str22, "--");
      Memory.pack(_str23, "-.");
      Memory.pack(_str24, "---");
      Memory.pack(_str25, ".--.");
      Memory.pack(_str26, "--.-");
      Memory.pack(_str27, ".-.");
      Memory.pack(_str28, "...");
      Memory.pack(_str29, "-");
      Memory.pack(_str30, "..-");
      Memory.pack(_str31, "...-");
      Memory.pack(_str32, ".--");
      Memory.pack(_str33, "-..-");
      Memory.pack(_str34, "-.--");
      Memory.pack(_str35, "--..");
      Memory.zero(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(other, (byte)46), _str36), (byte)44), _str37), (byte)58), _str38), (byte)63), _str39), (byte)39), _str40), (byte)45), _str41), (byte)47), _str42), (byte)40), _str43), (byte)41), _str44), (byte)34), _str45), (byte)61), _str46), (byte)43), _str47), 8);
      Memory.pack(_str36, ".-.-.-");
      Memory.pack(_str37, "--..--");
      Memory.pack(_str38, "---...");
      Memory.pack(_str39, "..--..");
      Memory.pack(_str40, ".----.");
      Memory.pack(_str41, "-....-");
      Memory.pack(_str42, "-..-.");
      Memory.pack(_str43, "-.--.");
      Memory.pack(_str44, "-.--.-");
      Memory.pack(_str45, ".-..-.");
      Memory.pack(_str46, "-...-");
      Memory.pack(_str47, ".-.-.");
      Memory.zero(dflag, 4);
      Memory.zero(sflag, 4);
      Memory.pack(_str48, "usage: morse [-ds] [string ...]\n");
      Memory.pack(_str49, "ds");
      Memory.zero(_str50, 1);
      Memory.pack(_str51, "...-.-");
      Memory.pack(_str52, " %s");
      Memory.pack(_str53, "dit");
      Memory.pack(_str54, "daw");
      Memory.pack(_str55, "\n");
      Memory.pack(_str56, "\n");
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
      Memory.createStackFrame();
      int var124 = Memory.allocateStack(4);
      int var125 = Memory.allocateStack(4);
      int var126 = Memory.allocateStack(4);
      int var127 = Memory.allocateStack(4);
      int var128 = Memory.allocateStack(4);
      int var129 = Memory.allocateStack(10);
      int var130 = Memory.allocateStack(4);
      int var131 = Memory.allocateStack(4);
      int var132 = Memory.allocateStack(4);
      var11 = false;
      Memory.store(var124, var0);
      Memory.store(var125, var1);

      while(true) {
         int var140 = Memory.load_i32(var124);
         int var141 = Memory.load_i32(var125);
         int var142 = c.getopt(var140, var141, _str49);
         Memory.store(var131, var142);
         int var143 = Memory.load_i32(var131);
         var26 = Instruction.icmp_ne(var143, -1) & true;
         if(!var26) {
            int var144 = Memory.load_i32(c.optind);
            int var145 = Memory.load_i32(var124);
            int var146 = var145 - var144;
            Memory.store(var124, var146);
            int var147 = Memory.load_i32(c.optind);
            int var148 = Memory.load_i32(var125);
            int var149 = var148 + 4 * var147;
            Memory.store(var125, var149);
            int var150 = Memory.load_i32(dflag);
            var34 = Instruction.icmp_ne(var150, 0) & true;
            int var151 = Memory.load_i32(var125);
            int var152 = Memory.load_i32(var151);
            var37 = Instruction.icmp_ne(var152, 0) & true;
            if(!var34) {
               if(!var37) {
                  while(true) {
                     int var217 = c.__getreent();
                     int var218 = var217 + 4;
                     int var219 = Memory.load_i32(var218);
                     int var220 = c.getc(var219);
                     Memory.store(var131, var220);
                     int var221 = Memory.load_i32(var131);
                     var121 = Instruction.icmp_ne(var221, -1) & true;
                     if(!var121) {
                        break;
                     }

                     int var216 = Memory.load_i32(var131);
                     morse(var216);
                  }
               } else {
                  do {
                     int var203 = Memory.load_i32(var125);
                     int var204 = Memory.load_i32(var203);
                     Memory.store(var130, var204);

                     while(true) {
                        int var210 = Memory.load_i32(var130);
                        byte var211 = (byte)Memory.load_i8(var210);
                        var109 = Instruction.icmp_ne(var211, 0) & true;
                        if(!var109) {
                           show(_str50);
                           int var212 = Memory.load_i32(var125);
                           int var213 = var212 + 4;
                           Memory.store(var125, var213);
                           int var214 = Memory.load_i32(var125);
                           int var215 = Memory.load_i32(var214);
                           var114 = Instruction.icmp_ne(var215, 0) & true;
                           break;
                        }

                        int var205 = Memory.load_i32(var130);
                        byte var206 = (byte)Memory.load_i8(var205);
                        byte var207 = (byte)var206;
                        morse(var207);
                        int var208 = Memory.load_i32(var130);
                        int var209 = var208 + 1;
                        Memory.store(var130, var209);
                     }
                  } while(var114);
               }

               show(_str51);
            } else {
               if(var37) {
                  do {
                     int var153 = Memory.load_i32(var125);
                     int var154 = Memory.load_i32(var153);
                     decode(var154);
                     int var155 = Memory.load_i32(var125);
                     int var156 = var155 + 4;
                     Memory.store(var125, var156);
                     int var157 = Memory.load_i32(var125);
                     int var158 = Memory.load_i32(var157);
                     var44 = Instruction.icmp_ne(var158, 0) & true;
                  } while(var44);
               } else {
                  Memory.store(var127, 0);
                  Memory.store(var128, 0);

                  label111:
                  while(true) {
                     while(true) {
                        int var194 = c.__getreent();
                        int var195 = var194 + 4;
                        int var196 = Memory.load_i32(var195);
                        int var197 = c.getc(var196);
                        Memory.store(var131, var197);
                        int var198 = Memory.load_i32(var131);
                        var95 = Instruction.icmp_ne(var198, -1) & true;
                        if(!var95) {
                           break label111;
                        }

                        int var159 = Memory.load_i32(var131);
                        var46 = Instruction.icmp_eq(var159, 45) & true;
                        if(!var46) {
                           int var160 = Memory.load_i32(var131);
                           var48 = Instruction.icmp_eq(var160, 46) & true;
                           if(!var48) {
                              int var179 = Memory.load_i32(var127);
                              var72 = Instruction.icmp_ne(var179, 0) & true;
                              if(!var72) {
                                 int var182 = Memory.load_i32(c.__ctype_ptr__);
                                 int var183 = Memory.load_i32(var131);
                                 int var184 = var183 + 1;
                                 int var185 = var182 + 1 * var184;
                                 byte var186 = (byte)Memory.load_i8(var185);
                                 byte var187 = (byte)var186;
                                 int var188 = var187 & 8;
                                 var83 = Instruction.icmp_ne(var188, 0) & true;
                                 if(var83) {
                                    int var189 = Memory.load_i32(var128);
                                    var85 = Instruction.icmp_ne(var189, 0) & true;
                                    if(!var85) {
                                       Memory.store(var128, 1);
                                    } else {
                                       int var190 = c.__getreent();
                                       int var191 = var190 + 8;
                                       int var192 = Memory.load_i32(var191);
                                       int var193 = c.putc(32, var192);
                                       Memory.store(var128, 0);
                                    }
                                 }
                              } else {
                                 int var180 = Memory.load_i32(var127);
                                 int var181 = var129 + 1 * var180;
                                 Memory.store(var181, (byte)0);
                                 decode(var129);
                                 Memory.store(var127, 0);
                                 Memory.store(var128, 0);
                              }
                              continue;
                           }
                        }

                        int var161 = Memory.load_i32(var127);
                        int var162 = Memory.load_i32(var131);
                        byte var163 = (byte)((byte)var162);
                        int var164 = var129 + 1 * var161;
                        Memory.store(var164, var163);
                        int var165 = Memory.load_i32(var127);
                        int var166 = var165 + 1;
                        Memory.store(var127, var166);
                        int var167 = Memory.load_i32(var127);
                        var56 = Instruction.icmp_eq(var167, 10) & true;
                        if(var56) {
                           Memory.store(var127, 0);
                           int var168 = c.__getreent();
                           int var169 = var168 + 8;
                           int var170 = Memory.load_i32(var169);
                           int var171 = c.putc(120, var170);

                           while(true) {
                              int var172 = c.__getreent();
                              int var173 = var172 + 4;
                              int var174 = Memory.load_i32(var173);
                              int var175 = c.getc(var174);
                              Memory.store(var131, var175);
                              int var176 = Memory.load_i32(var131);
                              var66 = Instruction.icmp_eq(var176, -1) & true;
                              if(var66) {
                                 break;
                              }

                              int var177 = Memory.load_i32(var131);
                              var68 = Instruction.icmp_eq(var177, 46) & true;
                              if(!var68) {
                                 int var178 = Memory.load_i32(var131);
                                 var70 = Instruction.icmp_eq(var178, 45) & true;
                                 if(!var70) {
                                    break;
                                 }
                              }
                           }

                           Memory.store(var128, 1);
                        }
                     }
                  }
               }

               int var199 = c.__getreent();
               int var200 = var199 + 8;
               int var201 = Memory.load_i32(var200);
               int var202 = c.putc(10, var201);
            }

            Memory.store(var132, 0);
            int var222 = Memory.load_i32(var132);
            Memory.store(var126, var222);
            int var223 = Memory.load_i32(var126);
            Memory.destroyStackFrame();
            return var223;
         }

         int var133 = Memory.load_i32(var131);
         byte var134 = (byte)((byte)var133);
         byte var135 = (byte)var134;
         var15 = Instruction.icmp_slt(var135, 115) & true;
         if(!var15) {
            var16 = Instruction.icmp_eq(var135, 115) & true;
            if(!var16) {
               break;
            }

            Memory.store(sflag, 1);
         } else {
            var17 = Instruction.icmp_eq(var135, 100) & true;
            if(!var17) {
               break;
            }

            Memory.store(dflag, 1);
         }
      }

      int var136 = c.__getreent();
      int var137 = var136 + 12;
      int var138 = Memory.load_i32(var137);
      int var139 = c.fprintf(var138, _str48, Memory.allocateStack(0));
      c.exit(1);
      throw Unreachable.instance;
   }

   public static void decode(int var0) {
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
      Memory.createStackFrame();
      int var66 = Memory.allocateStack(4);
      int var67 = Memory.allocateStack(4);
      var3 = false;
      Memory.store(var66, var0);
      Memory.store(var67, 0);

      while(true) {
         int var80 = Memory.load_i32(var67);
         var19 = Instruction.icmp_sle(var80, 9) & true;
         if(!var19) {
            Memory.store(var67, 0);

            while(true) {
               int var93 = Memory.load_i32(var67);
               var35 = Instruction.icmp_sle(var93, 25) & true;
               if(!var35) {
                  Memory.store(var67, 0);

                  while(true) {
                     int var110 = Memory.load_i32(var67);
                     int var111 = other + 8 * var110;
                     int var112 = var111 + 0;
                     byte var113 = (byte)Memory.load_i8(var112);
                     var58 = Instruction.icmp_ne(var113, 0) & true;
                     if(!var58) {
                        int var114 = Memory.load_i32(var66);
                        int var115 = c.strcmp(_str51, var114);
                        var61 = Instruction.icmp_eq(var115, 0) & true;
                        if(!var61) {
                           int var116 = c.__getreent();
                           int var117 = var116 + 8;
                           int var118 = Memory.load_i32(var117);
                           int var119 = c.putc(120, var118);
                           Memory.destroyStackFrame();
                           return;
                        } else {
                           Memory.destroyStackFrame();
                           return;
                        }
                     }

                     int var94 = Memory.load_i32(var67);
                     int var95 = other + 8 * var94;
                     int var96 = var95 + 4;
                     int var97 = Memory.load_i32(var96);
                     int var98 = Memory.load_i32(var66);
                     int var99 = c.strcmp(var97, var98);
                     var42 = Instruction.icmp_eq(var99, 0) & true;
                     if(var42) {
                        int var100 = c.__getreent();
                        int var101 = var100 + 8;
                        int var102 = Memory.load_i32(var101);
                        int var103 = Memory.load_i32(var67);
                        int var104 = other + 8 * var103;
                        int var105 = var104 + 0;
                        byte var106 = (byte)Memory.load_i8(var105);
                        byte var107 = (byte)var106;
                        c.putc(var107, var102);
                        Memory.destroyStackFrame();
                        return;
                     }

                     int var108 = Memory.load_i32(var67);
                     int var109 = var108 + 1;
                     Memory.store(var67, var109);
                  }
               }

               int var81 = Memory.load_i32(var67);
               int var82 = alph + 4 * var81;
               int var83 = Memory.load_i32(var82);
               int var84 = Memory.load_i32(var66);
               int var85 = c.strcmp(var83, var84);
               var25 = Instruction.icmp_eq(var85, 0) & true;
               if(var25) {
                  int var86 = c.__getreent();
                  int var87 = var86 + 8;
                  int var88 = Memory.load_i32(var87);
                  int var89 = Memory.load_i32(var67);
                  int var90 = var89 + 65;
                  c.putc(var90, var88);
                  Memory.destroyStackFrame();
                  return;
               }

               int var91 = Memory.load_i32(var67);
               int var92 = var91 + 1;
               Memory.store(var67, var92);
            }
         }

         int var68 = Memory.load_i32(var67);
         int var69 = digit + 4 * var68;
         int var70 = Memory.load_i32(var69);
         int var71 = Memory.load_i32(var66);
         int var72 = c.strcmp(var70, var71);
         var9 = Instruction.icmp_eq(var72, 0) & true;
         if(var9) {
            int var73 = c.__getreent();
            int var74 = var73 + 8;
            int var75 = Memory.load_i32(var74);
            int var76 = Memory.load_i32(var67);
            int var77 = var76 + 48;
            c.putc(var77, var75);
            Memory.destroyStackFrame();
            return;
         }

         int var78 = Memory.load_i32(var67);
         int var79 = var78 + 1;
         Memory.store(var67, var79);
      }
   }

   public static void morse(int var0) {
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
      Memory.createStackFrame();
      int var58 = Memory.allocateStack(4);
      int var59 = Memory.allocateStack(4);
      int var60 = Memory.allocateStack(4);
      var4 = false;
      Memory.store(var58, var0);
      int var61 = Memory.load_i32(c.__ctype_ptr__);
      int var62 = Memory.load_i32(var58);
      int var63 = var62 + 1;
      int var64 = var61 + 1 * var63;
      byte var65 = (byte)Memory.load_i8(var64);
      byte var66 = (byte)var65;
      int var67 = var66 & 3;
      var12 = Instruction.icmp_ne(var67, 0) & true;
      int var68 = Memory.load_i32(c.__ctype_ptr__);
      int var69 = Memory.load_i32(var58);
      int var70 = var69 + 1;
      int var71 = var68 + 1 * var70;
      byte var72 = (byte)Memory.load_i8(var71);
      byte var73 = (byte)var72;
      if(var12) {
         int var74 = var73 & 1;
         byte var75 = (byte)((byte)var74);
         var21 = Instruction.icmp_ne(var75, 0) & true;
         if(!var21) {
            Memory.store(var60, 97);
         } else {
            Memory.store(var60, 65);
         }

         int var76 = Memory.load_i32(var58);
         int var77 = Memory.load_i32(var60);
         int var78 = var76 - var77;
         int var79 = alph + 4 * var78;
         int var80 = Memory.load_i32(var79);
         show(var80);
         Memory.destroyStackFrame();
      } else {
         int var81 = var73 & 4;
         var28 = Instruction.icmp_ne(var81, 0) & true;
         if(var28) {
            int var82 = Memory.load_i32(var58);
            int var83 = var82 - 48;
            int var84 = digit + 4 * var83;
            int var85 = Memory.load_i32(var84);
            show(var85);
            Memory.destroyStackFrame();
         } else {
            int var86 = Memory.load_i32(c.__ctype_ptr__);
            int var87 = Memory.load_i32(var58);
            int var88 = var87 + 1;
            int var89 = var86 + 1 * var88;
            byte var90 = (byte)Memory.load_i8(var89);
            byte var91 = (byte)var90;
            int var92 = var91 & 8;
            var40 = Instruction.icmp_ne(var92, 0) & true;
            if(var40) {
               show(_str50);
               Memory.destroyStackFrame();
            } else {
               Memory.store(var59, 0);

               while(true) {
                  int var104 = Memory.load_i32(var59);
                  int var105 = other + 8 * var104;
                  int var106 = var105 + 0;
                  byte var107 = (byte)Memory.load_i8(var106);
                  var57 = Instruction.icmp_ne(var107, 0) & true;
                  if(!var57) {
                     Memory.destroyStackFrame();
                     return;
                  }

                  int var93 = Memory.load_i32(var59);
                  int var94 = other + 8 * var93;
                  int var95 = var94 + 0;
                  byte var96 = (byte)Memory.load_i8(var95);
                  byte var97 = (byte)var96;
                  int var98 = Memory.load_i32(var58);
                  var47 = Instruction.icmp_eq(var97, var98) & true;
                  int var99 = Memory.load_i32(var59);
                  if(var47) {
                     int var100 = other + 8 * var99;
                     int var101 = var100 + 4;
                     int var102 = Memory.load_i32(var101);
                     show(var102);
                     Memory.destroyStackFrame();
                     return;
                  }

                  int var103 = var99 + 1;
                  Memory.store(var59, var103);
               }
            }
         }
      }
   }

   public static void show(int var0) {
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
      Memory.createStackFrame();
      int var19 = Memory.allocateStack(4);
      int var20 = Memory.allocateStack(4);
      var3 = false;
      Memory.store(var19, var0);
      int var21 = Memory.load_i32(sflag);
      var5 = Instruction.icmp_ne(var21, 0) & true;
      int var10000;
      int var10001;
      if(!var5) {
         while(true) {
            int var30 = Memory.load_i32(var19);
            byte var31 = (byte)Memory.load_i8(var30);
            var17 = Instruction.icmp_ne(var31, 0) & true;
            if(!var17) {
               break;
            }

            int var24 = Memory.load_i32(var19);
            byte var25 = (byte)Memory.load_i8(var24);
            var10 = Instruction.icmp_eq(var25, 46) & true;
            if(!var10) {
               Memory.store(var20, _str54);
            } else {
               Memory.store(var20, _str53);
            }

            int var26 = Memory.load_i32(var20);
            var10000 = _str52;
            var10001 = Memory.allocateStack(4);
            Memory.pack(var10001, var26);
            int var27 = c.printf(var10000, var10001);
            int var28 = Memory.load_i32(var19);
            int var29 = var28 + 1;
            Memory.store(var19, var29);
         }
      } else {
         int var22 = Memory.load_i32(var19);
         var10000 = _str52;
         var10001 = Memory.allocateStack(4);
         Memory.pack(var10001, var22);
         int var23 = c.printf(var10000, var10001);
      }

      int var32 = c.printf(_str55, Memory.allocateStack(0));
      Memory.destroyStackFrame();
   }

   public static void errx(int var0, int var1, int var2) {
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
      Memory.createStackFrame();
      int var20 = Memory.allocateStack(4);
      int var21 = Memory.allocateStack(4);
      int var22 = Memory.allocateStack(4);
      var6 = false;
      Memory.store(var20, var0);
      Memory.store(var21, var1);
      Memory.store(var22, var2);
      int var23 = Memory.load_i32(var22);
      int var24 = c.__getreent();
      int var25 = var24 + 12;
      int var26 = Memory.load_i32(var25);
      int var27 = Memory.load_i32(var21);
      c.vfprintf(var26, var27, var23);
      int var28 = c.__getreent();
      int var29 = var28 + 12;
      int var30 = Memory.load_i32(var29);
      int var31 = c.fprintf(var30, _str56, Memory.allocateStack(0));
      int var32 = Memory.load_i32(var20);
      c.exit(var32);
      throw Unreachable.instance;
   }

   public static void warnx(int var0, int var1) {
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
      Memory.createStackFrame();
      int var17 = Memory.allocateStack(4);
      int var18 = Memory.allocateStack(4);
      var4 = false;
      Memory.store(var17, var0);
      Memory.store(var18, var1);
      int var19 = Memory.load_i32(var18);
      int var20 = c.__getreent();
      int var21 = var20 + 12;
      int var22 = Memory.load_i32(var21);
      int var23 = Memory.load_i32(var17);
      c.vfprintf(var22, var23, var19);
      int var24 = c.__getreent();
      int var25 = var24 + 12;
      int var26 = Memory.load_i32(var25);
      int var27 = c.fprintf(var26, _str56, Memory.allocateStack(0));
      Memory.destroyStackFrame();
   }
}
