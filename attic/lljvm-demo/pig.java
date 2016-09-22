import lljvm.lib.c;
import lljvm.runtime.Instruction;
import lljvm.runtime.Memory;
import lljvm.runtime.Instruction.Unreachable;

public final class pig {
   private static final int _str = Memory.allocateData(1);
   private static final int _str1 = Memory.allocateData(14);
   private static final int _str2 = Memory.allocateData(11);
   private static final int _str3 = Memory.allocateData(4);
   private static final int _str4 = Memory.allocateData(4);
   private static final int _str5 = Memory.allocateData(7);
   private static final int _str6 = Memory.allocateData(13);
   private static final int _str7 = Memory.allocateData(3);
   private static final int _str8 = Memory.allocateData(3);
   private static final int _str9 = Memory.allocateData(12);
   private static final int _str10 = Memory.allocateData(2);

   {
      Memory.zero(_str, 1);
      Memory.pack(_str1, "ate too much!");
      Memory.pack(_str2, "aeiouAEIOU");
      Memory.pack(_str3, "WAY");
      Memory.pack(_str4, "way");
      Memory.pack(_str5, "%.*s%s");
      Memory.pack(_str6, "aeiouyAEIOUY");
      Memory.pack(_str7, "AY");
      Memory.pack(_str8, "ay");
      Memory.pack(_str9, "usage: pig\n");
      Memory.pack(_str10, "\n");
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
      Memory.createStackFrame();
      int var50 = Memory.allocateStack(4);
      int var51 = Memory.allocateStack(4);
      int var52 = Memory.allocateStack(4);
      int var53 = Memory.allocateStack(1024);
      int var54 = Memory.allocateStack(4);
      int var55 = Memory.allocateStack(4);
      var8 = false;
      Memory.store(var50, var0);
      Memory.store(var51, var1);
      int var56 = Memory.load_i32(var50);
      int var57 = Memory.load_i32(var51);
      int var58 = c.getopt(var56, var57, _str);
      Memory.store(var54, var58);
      int var59 = Memory.load_i32(var54);
      var13 = Instruction.icmp_ne(var59, -1) & true;
      if(!var13) {
         int var60 = Memory.load_i32(c.optind);
         int var61 = Memory.load_i32(var50);
         int var62 = var61 - var60;
         Memory.store(var50, var62);
         int var63 = Memory.load_i32(c.optind);
         int var64 = Memory.load_i32(var51);
         int var65 = var64 + 4 * var63;
         Memory.store(var51, var65);
         Memory.store(var55, 0);

         while(true) {
            int var85 = c.__getreent();
            int var86 = var85 + 4;
            int var87 = Memory.load_i32(var86);
            int var88 = c.getc(var87);
            Memory.store(var54, var88);
            int var89 = Memory.load_i32(var54);
            var49 = Instruction.icmp_ne(var89, -1) & true;
            if(!var49) {
               c.exit(0);
               throw Unreachable.instance;
            }

            int var66 = Memory.load_i32(c.__ctype_ptr__);
            int var67 = Memory.load_i32(var54);
            int var68 = var67 + 1;
            int var69 = var66 + 1 * var68;
            byte var70 = (byte)Memory.load_i8(var69);
            byte var71 = (byte)var70;
            int var72 = var71 & 3;
            var27 = Instruction.icmp_ne(var72, 0) & true;
            int var73 = Memory.load_i32(var55);
            if(!var27) {
               var36 = Instruction.icmp_ne(var73, 0) & true;
               if(var36) {
                  int var80 = Memory.load_i32(var55);
                  pigout(var53, var80);
                  Memory.store(var55, 0);
               }

               int var81 = c.__getreent();
               int var82 = var81 + 8;
               int var83 = Memory.load_i32(var82);
               int var84 = Memory.load_i32(var54);
               c.putc(var84, var83);
            } else {
               var29 = Instruction.icmp_ugt(var73, 1023) & true;
               if(var29) {
                  errx(1, _str1, Memory.allocateStack(0));
                  throw Unreachable.instance;
               }

               int var74 = Memory.load_i32(var55);
               int var75 = Memory.load_i32(var54);
               byte var76 = (byte)((byte)var75);
               int var77 = var53 + 1 * var74;
               Memory.store(var77, var76);
               int var78 = Memory.load_i32(var55);
               int var79 = var78 + 1;
               Memory.store(var55, var79);
            }
         }
      } else {
         usage();
         throw Unreachable.instance;
      }
   }

   public static void pigout(int var0, int var1) {
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
      Memory.createStackFrame();
      int var176 = Memory.allocateStack(4);
      int var177 = Memory.allocateStack(4);
      int var178 = Memory.allocateStack(4);
      int var179 = Memory.allocateStack(4);
      int var180 = Memory.allocateStack(4);
      int var181 = Memory.allocateStack(4);
      int var182 = Memory.allocateStack(4);
      int var183 = Memory.allocateStack(4);
      int var184 = Memory.allocateStack(4);
      int var185 = Memory.allocateStack(4);
      int var186 = Memory.allocateStack(4);
      int var187 = Memory.allocateStack(4);
      int var188 = Memory.allocateStack(4);
      int var189 = Memory.allocateStack(4);
      int var190 = Memory.allocateStack(4);
      int var191 = Memory.allocateStack(4);
      int var192 = Memory.allocateStack(4);
      var19 = false;
      Memory.store(var176, var0);
      Memory.store(var177, var1);
      int var193 = Memory.load_i32(c.__ctype_ptr__);
      int var194 = Memory.load_i32(var176);
      byte var195 = (byte)Memory.load_i8(var194);
      int var196 = Instruction.zext_i32(var195);
      int var197 = var196 + 1;
      int var198 = var193 + 1 * var197;
      byte var199 = (byte)Memory.load_i8(var198);
      byte var200 = (byte)var199;
      int var201 = var200 & 1;
      Memory.store(var180, var201);
      int var202 = Memory.load_i32(var180);
      Memory.store(var181, var202);
      Memory.store(var183, 1);

      while(true) {
         int var222 = Memory.load_i32(var183);
         int var223 = Memory.load_i32(var177);
         var54 = Instruction.icmp_sge(var222, var223) & true;
         if(var54) {
            break;
         }

         int var224 = Memory.load_i32(var181);
         var56 = Instruction.icmp_ne(var224, 0) & true;
         if(!var56) {
            break;
         }

         label97: {
            int var203 = Memory.load_i32(var181);
            var32 = Instruction.icmp_eq(var203, 0) & true;
            if(!var32) {
               int var204 = Memory.load_i32(c.__ctype_ptr__);
               int var205 = Memory.load_i32(var176);
               int var206 = Memory.load_i32(var183);
               int var207 = var205 + 1 * var206;
               byte var208 = (byte)Memory.load_i8(var207);
               int var209 = Instruction.zext_i32(var208);
               int var210 = var209 + 1;
               int var211 = var204 + 1 * var210;
               byte var212 = (byte)Memory.load_i8(var211);
               byte var213 = (byte)var212;
               int var214 = var213 & 1;
               byte var215 = (byte)((byte)var214);
               int var216 = Instruction.icmp_ne(var215, 0) & 1;
               int var217 = ~var216 & 1;
               byte var218 = (byte)Instruction.zext_i32((boolean)var217);
               var48 = Instruction.icmp_ne(var218, 0) & true;
               if(!var48) {
                  Memory.store(var192, 1);
                  break label97;
               }
            }

            Memory.store(var192, 0);
         }

         int var219 = Memory.load_i32(var192);
         Memory.store(var181, var219);
         int var220 = Memory.load_i32(var183);
         int var221 = var220 + 1;
         Memory.store(var183, var221);
      }

      int var225 = Memory.load_i32(var176);
      byte var226 = (byte)Memory.load_i8(var225);
      byte var227 = (byte)var226;
      int var228 = c.strchr(_str2, var227);
      var62 = Instruction.icmp_ne(var228, 0) & true;
      int var229 = Memory.load_i32(var181);
      int var10000;
      int var10001;
      if(var62) {
         var64 = Instruction.icmp_ne(var229, 0) & true;
         if(!var64) {
            Memory.store(var191, _str4);
         } else {
            Memory.store(var191, _str3);
         }

         int var230 = Memory.load_i32(var177);
         int var231 = Memory.load_i32(var176);
         int var232 = Memory.load_i32(var191);
         var10000 = _str5;
         var10001 = Memory.allocateStack(12);
         Memory.pack(Memory.pack(Memory.pack(var10001, var230), var231), var232);
         int var233 = c.printf(var10000, var10001);
         Memory.destroyStackFrame();
      } else {
         var69 = Instruction.icmp_eq(var229, 0) & true;
         if(var69) {
            int var234 = Memory.load_i32(var176);
            byte var235 = (byte)Memory.load_i8(var234);
            int var236 = Instruction.zext_i32(var235);
            Memory.store(var179, var236);
            int var237 = Memory.load_i32(c.__ctype_ptr__);
            int var238 = Memory.load_i32(var179);
            int var239 = var238 + 1;
            int var240 = var237 + 1 * var239;
            byte var241 = (byte)Memory.load_i8(var240);
            byte var242 = (byte)var241;
            int var243 = var242 & 1;
            byte var244 = (byte)((byte)var243);
            var82 = Instruction.icmp_ne(var244, 0) & true;
            int var245 = Memory.load_i32(var179);
            if(!var82) {
               Memory.store(var189, var245);
            } else {
               int var246 = var245 + 32;
               Memory.store(var189, var246);
            }

            int var247 = Memory.load_i32(var189);
            Memory.store(var190, var247);
            int var248 = Memory.load_i32(var190);
            byte var249 = (byte)((byte)var248);
            int var250 = Memory.load_i32(var176);
            Memory.store(var250, var249);
         }

         Memory.store(var184, 0);
         int var251 = Memory.load_i32(var177);
         Memory.store(var182, var251);

         while(true) {
            int var291 = Memory.load_i32(var176);
            int var292 = Memory.load_i32(var184);
            int var293 = var291 + 1 * var292;
            byte var294 = (byte)Memory.load_i8(var293);
            byte var295 = (byte)var294;
            int var296 = c.strchr(_str6, var295);
            var141 = Instruction.icmp_ne(var296, 0) & true;
            if(var141) {
               break;
            }

            int var297 = Memory.load_i32(var184);
            int var298 = Memory.load_i32(var182);
            var144 = Instruction.icmp_slt(var297, var298) & true;
            if(!var144) {
               break;
            }

            int var252 = Memory.load_i32(var176);
            int var253 = Memory.load_i32(var184);
            int var254 = var252 + 1 * var253;
            byte var255 = (byte)Memory.load_i8(var254);
            int var256 = Memory.load_i32(var176);
            int var257 = Memory.load_i32(var177);
            int var258 = var256 + 1 * var257;
            Memory.store(var258, var255);
            int var259 = Memory.load_i32(var176);
            int var260 = Memory.load_i32(var177);
            int var261 = var259 + 1 * var260;
            byte var262 = (byte)Memory.load_i8(var261);
            byte var263 = (byte)var262;
            Memory.store(var185, var263);
            int var264 = Memory.load_i32(var177);
            int var265 = var264 + 1;
            Memory.store(var177, var265);
            int var266 = Memory.load_i32(var184);
            int var267 = var266 + 1;
            Memory.store(var184, var267);
            int var268 = Memory.load_i32(var185);
            var108 = Instruction.icmp_eq(var268, 113) & true;
            if(!var108) {
               int var269 = Memory.load_i32(var185);
               var110 = Instruction.icmp_eq(var269, 81) & true;
               if(!var110) {
                  continue;
               }
            }

            int var270 = Memory.load_i32(var184);
            int var271 = Memory.load_i32(var182);
            var113 = Instruction.icmp_slt(var270, var271) & true;
            if(var113) {
               int var272 = Memory.load_i32(var176);
               int var273 = Memory.load_i32(var184);
               int var274 = var272 + 1 * var273;
               byte var275 = (byte)Memory.load_i8(var274);
               var118 = Instruction.icmp_eq(var275, 117) & true;
               if(!var118) {
                  int var276 = Memory.load_i32(var176);
                  int var277 = Memory.load_i32(var184);
                  int var278 = var276 + 1 * var277;
                  byte var279 = (byte)Memory.load_i8(var278);
                  var123 = Instruction.icmp_eq(var279, 85) & true;
                  if(!var123) {
                     continue;
                  }
               }

               int var280 = Memory.load_i32(var176);
               int var281 = Memory.load_i32(var184);
               int var282 = var280 + 1 * var281;
               byte var283 = (byte)Memory.load_i8(var282);
               int var284 = Memory.load_i32(var176);
               int var285 = Memory.load_i32(var177);
               int var286 = var284 + 1 * var285;
               Memory.store(var286, var283);
               int var287 = Memory.load_i32(var177);
               int var288 = var287 + 1;
               Memory.store(var177, var288);
               int var289 = Memory.load_i32(var184);
               int var290 = var289 + 1;
               Memory.store(var184, var290);
            }
         }

         int var299 = Memory.load_i32(var180);
         var146 = Instruction.icmp_ne(var299, 0) & true;
         if(var146) {
            int var300 = Memory.load_i32(var176);
            int var301 = Memory.load_i32(var184);
            int var302 = var300 + 1 * var301;
            byte var303 = (byte)Memory.load_i8(var302);
            int var304 = Instruction.zext_i32(var303);
            Memory.store(var178, var304);
            int var305 = Memory.load_i32(c.__ctype_ptr__);
            int var306 = Memory.load_i32(var178);
            int var307 = var306 + 1;
            int var308 = var305 + 1 * var307;
            byte var309 = (byte)Memory.load_i8(var308);
            byte var310 = (byte)var309;
            int var311 = var310 & 2;
            var159 = Instruction.icmp_ne(var311, 0) & true;
            int var312 = Memory.load_i32(var178);
            if(!var159) {
               Memory.store(var187, var312);
            } else {
               int var313 = var312 - 32;
               Memory.store(var187, var313);
            }

            int var314 = Memory.load_i32(var187);
            Memory.store(var188, var314);
            int var315 = Memory.load_i32(var188);
            byte var316 = (byte)((byte)var315);
            int var317 = Memory.load_i32(var176);
            int var318 = Memory.load_i32(var184);
            int var319 = var317 + 1 * var318;
            Memory.store(var319, var316);
         }

         int var320 = Memory.load_i32(var181);
         var169 = Instruction.icmp_ne(var320, 0) & true;
         if(!var169) {
            Memory.store(var186, _str8);
         } else {
            Memory.store(var186, _str7);
         }

         int var321 = Memory.load_i32(var176);
         int var322 = Memory.load_i32(var184);
         int var323 = var321 + 1 * var322;
         int var324 = Memory.load_i32(var182);
         int var325 = Memory.load_i32(var186);
         var10000 = _str5;
         var10001 = Memory.allocateStack(12);
         Memory.pack(Memory.pack(Memory.pack(var10001, var324), var323), var325);
         int var326 = c.printf(var10000, var10001);
         Memory.destroyStackFrame();
      }
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
      int var7 = c.fprintf(var6, _str9, Memory.allocateStack(0));
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
      int var31 = c.fprintf(var30, _str10, Memory.allocateStack(0));
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
      int var27 = c.fprintf(var26, _str10, Memory.allocateStack(0));
      Memory.destroyStackFrame();
   }
}
