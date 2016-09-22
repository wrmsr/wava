import lljvm.lib.c;
import lljvm.runtime.Instruction;
import lljvm.runtime.Memory;
import lljvm.runtime.Instruction.Unreachable;

public final class number {
   private static final int name1 = Memory.allocateData(80);
   private static final int _str = Memory.allocateData(1);
   private static final int _str1 = Memory.allocateData(4);
   private static final int _str2 = Memory.allocateData(4);
   private static final int _str3 = Memory.allocateData(6);
   private static final int _str4 = Memory.allocateData(5);
   private static final int _str5 = Memory.allocateData(5);
   private static final int _str6 = Memory.allocateData(4);
   private static final int _str7 = Memory.allocateData(6);
   private static final int _str8 = Memory.allocateData(6);
   private static final int _str9 = Memory.allocateData(5);
   private static final int _str10 = Memory.allocateData(4);
   private static final int _str11 = Memory.allocateData(7);
   private static final int _str12 = Memory.allocateData(7);
   private static final int _str13 = Memory.allocateData(9);
   private static final int _str14 = Memory.allocateData(9);
   private static final int _str15 = Memory.allocateData(8);
   private static final int _str16 = Memory.allocateData(8);
   private static final int _str17 = Memory.allocateData(10);
   private static final int _str18 = Memory.allocateData(9);
   private static final int _str19 = Memory.allocateData(9);
   private static final int name2 = Memory.allocateData(40);
   private static final int _str20 = Memory.allocateData(7);
   private static final int _str21 = Memory.allocateData(7);
   private static final int _str22 = Memory.allocateData(6);
   private static final int _str23 = Memory.allocateData(6);
   private static final int _str24 = Memory.allocateData(6);
   private static final int _str25 = Memory.allocateData(8);
   private static final int _str26 = Memory.allocateData(7);
   private static final int _str27 = Memory.allocateData(7);
   private static final int name3 = Memory.allocateData(88);
   private static final int _str28 = Memory.allocateData(8);
   private static final int _str29 = Memory.allocateData(9);
   private static final int _str30 = Memory.allocateData(8);
   private static final int _str31 = Memory.allocateData(8);
   private static final int _str32 = Memory.allocateData(9);
   private static final int _str33 = Memory.allocateData(12);
   private static final int _str34 = Memory.allocateData(12);
   private static final int _str35 = Memory.allocateData(11);
   private static final int _str36 = Memory.allocateData(11);
   private static final int _str37 = Memory.allocateData(10);
   private static final int _str38 = Memory.allocateData(10);
   private static final int _str39 = Memory.allocateData(10);
   private static final int _str40 = Memory.allocateData(12);
   private static final int _str41 = Memory.allocateData(13);
   private static final int _str42 = Memory.allocateData(13);
   private static final int _str43 = Memory.allocateData(18);
   private static final int _str44 = Memory.allocateData(14);
   private static final int _str45 = Memory.allocateData(13);
   private static final int _str46 = Memory.allocateData(16);
   private static final int _str47 = Memory.allocateData(14);
   private static final int _str48 = Memory.allocateData(15);
   private static final int _str49 = Memory.allocateData(13);
   public static final int lflag = Memory.allocateData(4);
   private static final int _str50 = Memory.allocateData(2);
   private static final int _str51 = Memory.allocateData(15);
   private static final int _str52 = Memory.allocateData(5);
   private static final int _str53 = Memory.allocateData(19);
   private static final int _str54 = Memory.allocateData(33);
   private static final int _str55 = Memory.allocateData(2);
   private static final int _str56 = Memory.allocateData(2);
   private static final int _str57 = Memory.allocateData(8);
   private static final int _str58 = Memory.allocateData(8);
   private static final int _str59 = Memory.allocateData(3);
   private static final int _str60 = Memory.allocateData(7);
   private static final int _str61 = Memory.allocateData(6);
   private static final int _str62 = Memory.allocateData(11);
   private static final int _str63 = Memory.allocateData(3);
   private static final int _str64 = Memory.allocateData(4);
   private static final int _str65 = Memory.allocateData(9);
   private static final int _str66 = Memory.allocateData(13);
   private static final int pref_2894 = Memory.allocateData(12);
   private static final int _str67 = Memory.allocateData(5);
   private static final int _str68 = Memory.allocateData(9);
   private static final int _str69 = Memory.allocateData(10);
   private static final int _str70 = Memory.allocateData(23);
   private static final int _str71 = Memory.allocateData(2);

   {
      Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(name1, _str), _str1), _str2), _str3), _str4), _str5), _str6), _str7), _str8), _str9), _str10), _str11), _str12), _str13), _str14), _str15), _str16), _str17), _str18), _str19);
      Memory.zero(_str, 1);
      Memory.pack(_str1, "one");
      Memory.pack(_str2, "two");
      Memory.pack(_str3, "three");
      Memory.pack(_str4, "four");
      Memory.pack(_str5, "five");
      Memory.pack(_str6, "six");
      Memory.pack(_str7, "seven");
      Memory.pack(_str8, "eight");
      Memory.pack(_str9, "nine");
      Memory.pack(_str10, "ten");
      Memory.pack(_str11, "eleven");
      Memory.pack(_str12, "twelve");
      Memory.pack(_str13, "thirteen");
      Memory.pack(_str14, "fourteen");
      Memory.pack(_str15, "fifteen");
      Memory.pack(_str16, "sixteen");
      Memory.pack(_str17, "seventeen");
      Memory.pack(_str18, "eighteen");
      Memory.pack(_str19, "nineteen");
      Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(name2, _str), _str10), _str20), _str21), _str22), _str23), _str24), _str25), _str26), _str27);
      Memory.pack(_str20, "twenty");
      Memory.pack(_str21, "thirty");
      Memory.pack(_str22, "forty");
      Memory.pack(_str23, "fifty");
      Memory.pack(_str24, "sixty");
      Memory.pack(_str25, "seventy");
      Memory.pack(_str26, "eighty");
      Memory.pack(_str27, "ninety");
      Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(Memory.pack(name3, _str28), _str29), _str30), _str31), _str32), _str33), _str34), _str35), _str36), _str37), _str38), _str39), _str40), _str41), _str42), _str43), _str44), _str45), _str46), _str47), _str48), _str49);
      Memory.pack(_str28, "hundred");
      Memory.pack(_str29, "thousand");
      Memory.pack(_str30, "million");
      Memory.pack(_str31, "billion");
      Memory.pack(_str32, "trillion");
      Memory.pack(_str33, "quadrillion");
      Memory.pack(_str34, "quintillion");
      Memory.pack(_str35, "sextillion");
      Memory.pack(_str36, "septillion");
      Memory.pack(_str37, "octillion");
      Memory.pack(_str38, "nonillion");
      Memory.pack(_str39, "decillion");
      Memory.pack(_str40, "undecillion");
      Memory.pack(_str41, "duodecillion");
      Memory.pack(_str42, "tredecillion");
      Memory.pack(_str43, "quattuordecillion");
      Memory.pack(_str44, "quindecillion");
      Memory.pack(_str45, "sexdecillion");
      Memory.pack(_str46, "septendecillion");
      Memory.pack(_str47, "octodecillion");
      Memory.pack(_str48, "novemdecillion");
      Memory.pack(_str49, "vigintillion");
      Memory.zero(lflag, 4);
      Memory.pack(_str50, "l");
      Memory.pack(_str51, "line too long.");
      Memory.pack(_str52, "...\n");
      Memory.pack(_str53, "illegal number: %s");
      Memory.pack(_str54, "number too large, max %d digits.");
      Memory.pack(_str55, " ");
      Memory.pack(_str56, "\n");
      Memory.pack(_str57, "minus%s");
      Memory.pack(_str58, "%sand%s");
      Memory.pack(_str59, ".\n");
      Memory.pack(_str60, "zero%s");
      Memory.pack(_str61, " %s%s");
      Memory.pack(_str62, "%s hundred");
      Memory.pack(_str63, "%s");
      Memory.pack(_str64, "-%s");
      Memory.pack(_str65, "tenths.\n");
      Memory.pack(_str66, "hundredths.\n");
      Memory.pack(Memory.pack(Memory.pack(pref_2894, _str), _str67), _str68);
      Memory.pack(_str67, "ten-");
      Memory.pack(_str68, "hundred-");
      Memory.pack(_str69, "%s%sths.\n");
      Memory.pack(_str70, "usage: number [# ...]\n");
      Memory.pack(_str71, "\n");
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
      Memory.createStackFrame();
      int var48 = Memory.allocateStack(4);
      int var49 = Memory.allocateStack(4);
      int var50 = Memory.allocateStack(4);
      int var51 = Memory.allocateStack(256);
      int var52 = Memory.allocateStack(4);
      int var53 = Memory.allocateStack(4);
      var8 = false;
      Memory.store(var48, var0);
      Memory.store(var49, var1);
      Memory.store(lflag, 0);

      while(true) {
         int var55 = Memory.load_i32(var48);
         int var56 = Memory.load_i32(var49);
         int var57 = c.getopt(var55, var56, _str50);
         Memory.store(var53, var57);
         int var58 = Memory.load_i32(var53);
         var15 = Instruction.icmp_ne(var58, -1) & true;
         if(!var15) {
            int var59 = Memory.load_i32(c.optind);
            int var60 = Memory.load_i32(var48);
            int var61 = var60 - var59;
            Memory.store(var48, var61);
            int var62 = Memory.load_i32(c.optind);
            int var63 = Memory.load_i32(var49);
            int var64 = var63 + 4 * var62;
            Memory.store(var49, var64);
            int var65 = Memory.load_i32(var49);
            int var66 = Memory.load_i32(var65);
            var24 = Instruction.icmp_eq(var66, 0) & true;
            Memory.store(var52, 1);
            if(!var24) {
               while(true) {
                  int var80 = Memory.load_i32(var49);
                  int var81 = Memory.load_i32(var80);
                  var47 = Instruction.icmp_ne(var81, 0) & true;
                  if(!var47) {
                     break;
                  }

                  int var74 = Memory.load_i32(var52);
                  var39 = Instruction.icmp_eq(var74, 0) & true;
                  if(var39) {
                     int var75 = c.printf(_str52, Memory.allocateStack(0));
                  }

                  int var76 = Memory.load_i32(var49);
                  int var77 = Memory.load_i32(var76);
                  convert(var77);
                  Memory.store(var52, 0);
                  int var78 = Memory.load_i32(var49);
                  int var79 = var78 + 4;
                  Memory.store(var49, var79);
               }
            } else {
               while(true) {
                  int var70 = c.__getreent();
                  int var71 = var70 + 4;
                  int var72 = Memory.load_i32(var71);
                  int var73 = c.fgets(var51, 256, var72);
                  var37 = Instruction.icmp_ne(var73, 0) & true;
                  if(!var37) {
                     break;
                  }

                  int var67 = c.strchr(var51, 10);
                  var27 = Instruction.icmp_eq(var67, 0) & true;
                  if(var27) {
                     errx(1, _str51, Memory.allocateStack(0));
                     throw Unreachable.instance;
                  }

                  int var68 = Memory.load_i32(var52);
                  var29 = Instruction.icmp_eq(var68, 0) & true;
                  if(var29) {
                     int var69 = c.printf(_str52, Memory.allocateStack(0));
                  }

                  convert(var51);
                  Memory.store(var52, 0);
               }
            }

            c.exit(0);
            throw Unreachable.instance;
         }

         int var54 = Memory.load_i32(var53);
         var10 = Instruction.icmp_eq(var54, 108) & true;
         if(!var10) {
            usage();
            throw Unreachable.instance;
         }

         Memory.store(lflag, 1);
      }
   }

   public static void convert(int var0) {
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
      int var129 = Memory.allocateStack(4);
      int var130 = Memory.allocateStack(4);
      int var131 = Memory.allocateStack(4);
      int var132 = Memory.allocateStack(4);
      int var133 = Memory.allocateStack(4);
      int var134 = Memory.allocateStack(4);
      var12 = false;
      Memory.store(var124, var0);
      Memory.store(var129, 0);
      Memory.store(var125, 0);
      int var135 = Memory.load_i32(var124);
      Memory.store(var126, var135);

      while(true) {
         int var165 = Memory.load_i32(var126);
         byte var166 = (byte)Memory.load_i8(var165);
         var53 = Instruction.icmp_eq(var166, 0) & true;
         int var10001;
         int var10002;
         if(!var53) {
            int var167 = Memory.load_i32(var126);
            byte var168 = (byte)Memory.load_i8(var167);
            var56 = Instruction.icmp_ne(var168, 10) & true;
            if(var56) {
               label141: {
                  int var136 = Memory.load_i32(var126);
                  byte var137 = (byte)Memory.load_i8(var136);
                  byte var138 = (byte)var137;
                  int var139 = c.isblank(var138);
                  var18 = Instruction.icmp_ne(var139, 0) & true;
                  if(!var18) {
                     int var144 = Memory.load_i32(c.__ctype_ptr__);
                     int var145 = Memory.load_i32(var126);
                     byte var146 = (byte)Memory.load_i8(var145);
                     int var147 = Instruction.zext_i32(var146);
                     int var148 = var147 + 1;
                     int var149 = var144 + 1 * var148;
                     byte var150 = (byte)Memory.load_i8(var149);
                     byte var151 = (byte)var150;
                     int var152 = var151 & 4;
                     var33 = Instruction.icmp_ne(var152, 0) & true;
                     if(!var33) {
                        int var153 = Memory.load_i32(var126);
                        byte var154 = (byte)Memory.load_i8(var153);
                        byte var155 = (byte)var154;
                        var37 = Instruction.icmp_slt(var155, 46) & true;
                        if(!var37) {
                           var38 = Instruction.icmp_eq(var155, 46) & true;
                           if(!var38) {
                              break label141;
                           }

                           int var156 = Memory.load_i32(var125);
                           var41 = Instruction.icmp_ne(var156, 0) & true;
                           if(var41) {
                              break label141;
                           }

                           int var157 = Memory.load_i32(var126);
                           int var158 = var157 + 1;
                           Memory.store(var125, var158);
                           int var159 = Memory.load_i32(var126);
                           Memory.store(var159, (byte)0);
                        } else {
                           var39 = Instruction.icmp_eq(var155, 45) & true;
                           if(!var39) {
                              break label141;
                           }

                           int var160 = Memory.load_i32(var126);
                           int var161 = Memory.load_i32(var124);
                           var47 = Instruction.icmp_eq(var160, var161) & true;
                           if(!var47) {
                              break label141;
                           }
                        }
                     }
                  } else {
                     int var140 = Memory.load_i32(var126);
                     int var141 = Memory.load_i32(var124);
                     var21 = Instruction.icmp_eq(var140, var141) & true;
                     if(!var21) {
                        break label141;
                     }

                     int var142 = Memory.load_i32(var124);
                     int var143 = var142 + 1;
                     Memory.store(var124, var143);
                  }

                  int var163 = Memory.load_i32(var126);
                  int var164 = var163 + 1;
                  Memory.store(var126, var164);
                  continue;
               }

               int var162 = Memory.load_i32(var124);
               var10001 = _str53;
               var10002 = Memory.allocateStack(4);
               Memory.pack(var10002, var162);
               errx(1, var10001, var10002);
               throw Unreachable.instance;
            }
         }

         int var169 = Memory.load_i32(var126);
         Memory.store(var169, (byte)0);
         int var170 = Memory.load_i32(var124);
         int var171 = c.strlen(var170);
         Memory.store(var128, var171);
         int var172 = Memory.load_i32(var128);
         var61 = Instruction.icmp_sgt(var172, 65) & true;
         if(!var61) {
            label153: {
               int var173 = Memory.load_i32(var125);
               var63 = Instruction.icmp_eq(var173, 0) & true;
               if(!var63) {
                  int var174 = Memory.load_i32(var125);
                  int var175 = c.strlen(var174);
                  Memory.store(var129, var175);
                  int var176 = Memory.load_i32(var129);
                  var67 = Instruction.icmp_sgt(var176, 65) & true;
                  if(var67) {
                     break label153;
                  }
               }

               int var177 = Memory.load_i32(var124);
               byte var178 = (byte)Memory.load_i8(var177);
               var70 = Instruction.icmp_eq(var178, 45) & true;
               int var10000;
               if(var70) {
                  int var179 = Memory.load_i32(lflag);
                  var72 = Instruction.icmp_ne(var179, 0) & true;
                  if(!var72) {
                     Memory.store(var134, _str56);
                  } else {
                     Memory.store(var134, _str55);
                  }

                  int var180 = Memory.load_i32(var134);
                  var10000 = _str57;
                  var10001 = Memory.allocateStack(4);
                  Memory.pack(var10001, var180);
                  int var181 = c.printf(var10000, var10001);
                  int var182 = Memory.load_i32(var124);
                  int var183 = var182 + 1;
                  Memory.store(var124, var183);
                  int var184 = Memory.load_i32(var128);
                  int var185 = var184 - 1;
                  Memory.store(var128, var185);
               }

               int var186 = Memory.load_i32(var128);
               var80 = Instruction.icmp_sgt(var186, 0) & true;
               if(!var80) {
                  Memory.store(var133, 0);
               } else {
                  int var187 = Memory.load_i32(var128);
                  int var188 = Memory.load_i32(var124);
                  int var189 = unit(var187, var188);
                  Memory.store(var133, var189);
               }

               int var190 = Memory.load_i32(var133);
               Memory.store(var127, var190);
               int var191 = Memory.load_i32(var125);
               var86 = Instruction.icmp_ne(var191, 0) & true;
               if(var86) {
                  int var192 = Memory.load_i32(var129);
                  var88 = Instruction.icmp_ne(var192, 0) & true;
                  if(var88) {
                     int var193 = Memory.load_i32(var125);
                     Memory.store(var126, var193);

                     while(true) {
                        int var210 = Memory.load_i32(var126);
                        byte var211 = (byte)Memory.load_i8(var210);
                        var114 = Instruction.icmp_ne(var211, 0) & true;
                        if(!var114) {
                           break;
                        }

                        int var194 = Memory.load_i32(var126);
                        byte var195 = (byte)Memory.load_i8(var194);
                        var92 = Instruction.icmp_ne(var195, 48) & true;
                        if(var92) {
                           int var196 = Memory.load_i32(var127);
                           var94 = Instruction.icmp_ne(var196, 0) & true;
                           if(var94) {
                              int var197 = Memory.load_i32(lflag);
                              var96 = Instruction.icmp_ne(var197, 0) & true;
                              if(!var96) {
                                 Memory.store(var132, _str56);
                              } else {
                                 Memory.store(var132, _str55);
                              }

                              int var198 = Memory.load_i32(lflag);
                              var98 = Instruction.icmp_ne(var198, 0) & true;
                              if(!var98) {
                                 Memory.store(var131, _str);
                              } else {
                                 Memory.store(var131, _str55);
                              }

                              int var199 = Memory.load_i32(var131);
                              int var200 = Memory.load_i32(var132);
                              var10000 = _str58;
                              var10001 = Memory.allocateStack(8);
                              Memory.pack(Memory.pack(var10001, var199), var200);
                              int var201 = c.printf(var10000, var10001);
                           }

                           int var202 = Memory.load_i32(var129);
                           int var203 = Memory.load_i32(var125);
                           int var204 = unit(var202, var203);
                           var105 = Instruction.icmp_ne(var204, 0) & true;
                           if(var105) {
                              int var205 = Memory.load_i32(lflag);
                              var107 = Instruction.icmp_ne(var205, 0) & true;
                              if(var107) {
                                 int var206 = c.printf(_str55, Memory.allocateStack(0));
                              }

                              int var207 = Memory.load_i32(var129);
                              pfract(var207);
                              Memory.store(var127, 1);
                           }
                           break;
                        }

                        int var208 = Memory.load_i32(var126);
                        int var209 = var208 + 1;
                        Memory.store(var126, var209);
                     }
                  }
               }

               int var212 = Memory.load_i32(var127);
               var116 = Instruction.icmp_eq(var212, 0) & true;
               if(var116) {
                  int var213 = Memory.load_i32(lflag);
                  var118 = Instruction.icmp_ne(var213, 0) & true;
                  if(!var118) {
                     Memory.store(var130, _str59);
                  } else {
                     Memory.store(var130, _str);
                  }

                  int var214 = Memory.load_i32(var130);
                  var10000 = _str60;
                  var10001 = Memory.allocateStack(4);
                  Memory.pack(var10001, var214);
                  int var215 = c.printf(var10000, var10001);
               }

               int var216 = Memory.load_i32(lflag);
               var122 = Instruction.icmp_ne(var216, 0) & true;
               if(!var122) {
                  Memory.destroyStackFrame();
                  return;
               }

               int var217 = c.printf(_str56, Memory.allocateStack(0));
               Memory.destroyStackFrame();
               return;
            }
         }

         var10001 = _str54;
         var10002 = Memory.allocateStack(4);
         Memory.pack(var10002, 65);
         errx(1, var10001, var10002);
         throw Unreachable.instance;
      }
   }

   public static int unit(int var0, int var1) {
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
      Memory.createStackFrame();
      int var63 = Memory.allocateStack(4);
      int var64 = Memory.allocateStack(4);
      int var65 = Memory.allocateStack(4);
      int var66 = Memory.allocateStack(4);
      int var67 = Memory.allocateStack(4);
      int var68 = Memory.allocateStack(4);
      int var69 = Memory.allocateStack(4);
      int var70 = Memory.allocateStack(4);
      var10 = false;
      Memory.store(var63, var0);
      Memory.store(var64, var1);
      Memory.store(var66, 0);
      int var71 = Memory.load_i32(var63);
      var12 = Instruction.icmp_sgt(var71, 3) & true;
      if(var12) {
         int var72 = Memory.load_i32(var63);
         int var73 = var72 % 3;
         var15 = Instruction.icmp_ne(var73, 0) & true;
         int var10000;
         int var10001;
         if(var15) {
            int var74 = Memory.load_i32(var63);
            int var75 = var74 % 3;
            Memory.store(var67, var75);
            int var76 = Memory.load_i32(var63);
            int var77 = Memory.load_i32(var67);
            int var78 = var76 - var77;
            Memory.store(var63, var78);
            int var79 = Memory.load_i32(var64);
            int var80 = Memory.load_i32(var67);
            int var81 = number(var79, var80);
            var24 = Instruction.icmp_ne(var81, 0) & true;
            if(var24) {
               Memory.store(var66, 1);
               int var82 = Memory.load_i32(lflag);
               var26 = Instruction.icmp_ne(var82, 0) & true;
               if(!var26) {
                  Memory.store(var70, _str59);
               } else {
                  Memory.store(var70, _str55);
               }

               int var83 = Memory.load_i32(var63);
               int var84 = var83 / 3;
               int var85 = name3 + 4 * var84;
               int var86 = Memory.load_i32(var85);
               int var87 = Memory.load_i32(var70);
               var10000 = _str61;
               var10001 = Memory.allocateStack(8);
               Memory.pack(Memory.pack(var10001, var86), var87);
               int var88 = c.printf(var10000, var10001);
            }

            int var89 = Memory.load_i32(var64);
            int var90 = Memory.load_i32(var67);
            int var91 = var89 + 1 * var90;
            Memory.store(var64, var91);
         }

         while(true) {
            int var105 = Memory.load_i32(var63);
            var52 = Instruction.icmp_sgt(var105, 3) & true;
            if(!var52) {
               break;
            }

            int var92 = Memory.load_i32(var63);
            int var93 = var92 - 3;
            Memory.store(var63, var93);
            int var94 = Memory.load_i32(var64);
            int var95 = number(var94, 3);
            var40 = Instruction.icmp_ne(var95, 0) & true;
            if(var40) {
               Memory.store(var66, 1);
               int var96 = Memory.load_i32(lflag);
               var42 = Instruction.icmp_ne(var96, 0) & true;
               if(!var42) {
                  Memory.store(var69, _str59);
               } else {
                  Memory.store(var69, _str55);
               }

               int var97 = Memory.load_i32(var63);
               int var98 = var97 / 3;
               int var99 = name3 + 4 * var98;
               int var100 = Memory.load_i32(var99);
               int var101 = Memory.load_i32(var69);
               var10000 = _str61;
               var10001 = Memory.allocateStack(8);
               Memory.pack(Memory.pack(var10001, var100), var101);
               int var102 = c.printf(var10000, var10001);
            }

            int var103 = Memory.load_i32(var64);
            int var104 = var103 + 3;
            Memory.store(var64, var104);
         }
      }

      int var106 = Memory.load_i32(var64);
      int var107 = Memory.load_i32(var63);
      int var108 = number(var106, var107);
      var56 = Instruction.icmp_ne(var108, 0) & true;
      if(var56) {
         int var109 = Memory.load_i32(lflag);
         var58 = Instruction.icmp_eq(var109, 0) & true;
         if(var58) {
            int var110 = c.printf(_str59, Memory.allocateStack(0));
         }

         Memory.store(var66, 1);
      }

      int var111 = Memory.load_i32(var66);
      Memory.store(var68, var111);
      int var112 = Memory.load_i32(var68);
      Memory.store(var65, var112);
      int var113 = Memory.load_i32(var65);
      Memory.destroyStackFrame();
      return var113;
   }

   public static int number(int var0, int var1) {
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
      Memory.createStackFrame();
      int var75 = Memory.allocateStack(4);
      int var76 = Memory.allocateStack(4);
      int var77 = Memory.allocateStack(4);
      int var78 = Memory.allocateStack(4);
      int var79 = Memory.allocateStack(4);
      int var80 = Memory.allocateStack(4);
      var8 = false;
      Memory.store(var75, var0);
      Memory.store(var76, var1);
      Memory.store(var78, 0);
      int var81 = Memory.load_i32(var76);
      var10 = Instruction.icmp_slt(var81, 2) & true;
      int var10000;
      int var10001;
      if(!var10) {
         label49: {
            var11 = Instruction.icmp_slt(var81, 3) & true;
            if(!var11) {
               var12 = Instruction.icmp_eq(var81, 3) & true;
               if(!var12) {
                  break label49;
               }

               int var82 = Memory.load_i32(var75);
               byte var83 = (byte)Memory.load_i8(var82);
               var17 = Instruction.icmp_ne(var83, 48) & true;
               if(var17) {
                  Memory.store(var78, 1);
                  int var84 = Memory.load_i32(var75);
                  byte var85 = (byte)Memory.load_i8(var84);
                  byte var86 = (byte)var85;
                  int var87 = var86 - 48;
                  int var88 = name1 + 4 * var87;
                  int var89 = Memory.load_i32(var88);
                  var10000 = _str62;
                  var10001 = Memory.allocateStack(4);
                  Memory.pack(var10001, var89);
                  int var90 = c.printf(var10000, var10001);
               }

               int var91 = Memory.load_i32(var75);
               int var92 = var91 + 1;
               Memory.store(var75, var92);
            } else {
               var13 = Instruction.icmp_eq(var81, 2) & true;
               if(!var13) {
                  break label49;
               }
            }

            int var93 = Memory.load_i32(var75);
            int var94 = var93 + 1;
            byte var95 = (byte)Memory.load_i8(var94);
            byte var96 = (byte)var95;
            int var97 = var96 - 48;
            int var98 = Memory.load_i32(var75);
            byte var99 = (byte)Memory.load_i8(var98);
            byte var100 = (byte)var99;
            int var101 = var100 * 10;
            int var102 = var101 + -480;
            int var103 = var97 + var102;
            Memory.store(var79, var103);
            int var104 = Memory.load_i32(var79);
            var40 = Instruction.icmp_ne(var104, 0) & true;
            if(var40) {
               int var105 = Memory.load_i32(var78);
               var42 = Instruction.icmp_ne(var105, 0) & true;
               if(var42) {
                  int var106 = c.printf(_str55, Memory.allocateStack(0));
               }

               int var107 = Memory.load_i32(var79);
               var45 = Instruction.icmp_sle(var107, 19) & true;
               int var108 = Memory.load_i32(var79);
               if(!var45) {
                  int var112 = var108 / 10;
                  int var113 = name2 + 4 * var112;
                  int var114 = Memory.load_i32(var113);
                  var10000 = _str63;
                  var10001 = Memory.allocateStack(4);
                  Memory.pack(var10001, var114);
                  int var115 = c.printf(var10000, var10001);
                  int var116 = Memory.load_i32(var79);
                  int var117 = var116 % 10;
                  var56 = Instruction.icmp_ne(var117, 0) & true;
                  if(var56) {
                     int var118 = Memory.load_i32(var79);
                     int var119 = var118 % 10;
                     int var120 = name1 + 4 * var119;
                     int var121 = Memory.load_i32(var120);
                     var10000 = _str64;
                     var10001 = Memory.allocateStack(4);
                     Memory.pack(var10001, var121);
                     int var122 = c.printf(var10000, var10001);
                  }
               } else {
                  int var109 = name1 + 4 * var108;
                  int var110 = Memory.load_i32(var109);
                  var10000 = _str63;
                  var10001 = Memory.allocateStack(4);
                  Memory.pack(var10001, var110);
                  int var111 = c.printf(var10000, var10001);
               }

               Memory.store(var78, 1);
            }
         }
      } else {
         var14 = Instruction.icmp_eq(var81, 1) & true;
         if(var14) {
            int var123 = Memory.load_i32(var75);
            byte var124 = (byte)Memory.load_i8(var123);
            var64 = Instruction.icmp_ne(var124, 48) & true;
            if(var64) {
               Memory.store(var78, 1);
               int var125 = Memory.load_i32(var75);
               byte var126 = (byte)Memory.load_i8(var125);
               byte var127 = (byte)var126;
               int var128 = var127 - 48;
               int var129 = name1 + 4 * var128;
               int var130 = Memory.load_i32(var129);
               var10000 = _str63;
               var10001 = Memory.allocateStack(4);
               Memory.pack(var10001, var130);
               int var131 = c.printf(var10000, var10001);
            }
         }
      }

      int var132 = Memory.load_i32(var78);
      Memory.store(var80, var132);
      int var133 = Memory.load_i32(var80);
      Memory.store(var77, var133);
      int var134 = Memory.load_i32(var77);
      Memory.destroyStackFrame();
      return var134;
   }

   public static void pfract(int var0) {
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
      Memory.createStackFrame();
      int var18 = Memory.allocateStack(4);
      var2 = false;
      Memory.store(var18, var0);
      int var19 = Memory.load_i32(var18);
      var4 = Instruction.icmp_slt(var19, 2) & true;
      if(!var4) {
         var5 = Instruction.icmp_eq(var19, 2) & true;
         if(var5) {
            int var21 = c.printf(_str66, Memory.allocateStack(0));
            Memory.destroyStackFrame();
            return;
         }
      } else {
         var6 = Instruction.icmp_eq(var19, 1) & true;
         if(var6) {
            int var20 = c.printf(_str65, Memory.allocateStack(0));
            Memory.destroyStackFrame();
            return;
         }
      }

      int var22 = Memory.load_i32(var18);
      int var23 = var22 / 3;
      int var24 = name3 + 4 * var23;
      int var25 = Memory.load_i32(var24);
      int var26 = Memory.load_i32(var18);
      int var27 = var26 % 3;
      int var28 = pref_2894 + 4 * var27;
      int var29 = Memory.load_i32(var28);
      int var10000 = _str69;
      int var10001 = Memory.allocateStack(8);
      Memory.pack(Memory.pack(var10001, var29), var25);
      int var30 = c.printf(var10000, var10001);
      Memory.destroyStackFrame();
   }

   public static void usage() {
      boolean var0 = false;
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      Memory.createStackFrame();
      int var4 = c.__getreent();
      int var5 = var4 + 12;
      int var6 = Memory.load_i32(var5);
      int var7 = c.fprintf(var6, _str70, Memory.allocateStack(0));
      c.exit(1);
      throw Unreachable.instance;
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
      int var31 = c.fprintf(var30, _str71, Memory.allocateStack(0));
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
      int var27 = c.fprintf(var26, _str71, Memory.allocateStack(0));
      Memory.destroyStackFrame();
   }
}
