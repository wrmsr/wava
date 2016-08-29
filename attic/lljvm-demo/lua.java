import lljvm.lib.c;
import lljvm.runtime.Function;
import lljvm.runtime.Instruction;
import lljvm.runtime.Memory;

public final class lua {
   private static final int _str = Memory.allocateData(5);
   private static final int _str1 = Memory.allocateData(4);
   private static final int _str2 = Memory.allocateData(52);
   private static final int progname = Memory.allocateData(4);
   private static final int _str3 = Memory.allocateData(4);
   private static final int _str4 = Memory.allocateData(307);
   private static final int _str5 = Memory.allocateData(31);
   private static final int _str6 = Memory.allocateData(39);
   private static final int globalL = Memory.allocateData(4);
   private static final int _str7 = Memory.allocateData(13);
   private static final int _str8 = Memory.allocateData(8);
   private static final int _str9 = Memory.allocateData(9);
   private static final int _str10 = Memory.allocateData(3);
   private static final int _str11 = Memory.allocateData(4);
   private static final int _str12 = Memory.allocateData(6);
   private static final int _str13 = Memory.allocateData(10);
   private static final int _str14 = Memory.allocateData(9);
   private static final int _str15 = Memory.allocateData(10);
   private static final int _str16 = Memory.allocateData(8);
   private static final int _str17 = Memory.allocateData(16);
   private static final int _str18 = Memory.allocateData(29);
   private static final int _str19 = Memory.allocateData(4);
   private static final int _str20 = Memory.allocateData(2);
   private static final int _str21 = Memory.allocateData(3);
   private static final int _str22 = Memory.allocateData(8);
   private static final int _str23 = Memory.allocateData(10);
   private static final int _str24 = Memory.allocateData(7);
   private static final int _str25 = Memory.allocateData(2);
   private static final int _str26 = Memory.allocateData(6);
   private static final int _str27 = Memory.allocateData(27);

   {
      Memory.pack(_str, "%s: ");
      Memory.pack(_str1, "%s\n");
      Memory.pack(_str2, "Lua 5.1.4  Copyright (C) 1994-2008 Lua.org, PUC-Rio");
      Memory.pack(progname, _str3);
      Memory.pack(_str3, "lua");
      Memory.pack(_str4, "usage: %s [options] [script [args]].\nAvailable options are:\n  -e stat  execute string \'stat\'\n  -l name  require library \'name\'\n  -i       enter interactive mode after executing \'script\'\n  -v       show version information\n  --       stop handling options\n  -        execute stdin and stop handling options\n");
      Memory.pack(_str5, "(error object is not a string)");
      Memory.pack(_str6, "cannot create state: not enough memory");
      Memory.zero(globalL, 4);
      Memory.pack(_str7, "interrupted!");
      Memory.pack(_str8, "_PROMPT");
      Memory.pack(_str9, "_PROMPT2");
      Memory.pack(_str10, "> ");
      Memory.pack(_str11, ">> ");
      Memory.pack(_str12, "debug");
      Memory.pack(_str13, "traceback");
      Memory.pack(_str14, "LUA_INIT");
      Memory.pack(_str15, "=LUA_INIT");
      Memory.pack(_str16, "require");
      Memory.pack(_str17, "=(command line)");
      Memory.pack(_str18, "too many arguments to script");
      Memory.pack(_str19, "arg");
      Memory.pack(_str20, "-");
      Memory.pack(_str21, "--");
      Memory.pack(_str22, "\'<eof>\'");
      Memory.pack(_str23, "return %s");
      Memory.pack(_str24, "=stdin");
      Memory.pack(_str25, "\n");
      Memory.pack(_str26, "print");
      Memory.pack(_str27, "error calling \'print\' (%s)");
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
      Memory.createStackFrame();
      int var15 = Memory.allocateStack(12);
      int var16 = liblua.luaL_newstate();
      var4 = Instruction.icmp_eq(var16, 0) & true;
      if(!var4) {
         int var18 = var15 + 0;
         Memory.store(var18, var0);
         int var19 = var15 + 4;
         Memory.store(var19, var1);
         int var20 = liblua.lua_cpcall(var16, Function.getFunctionPointer("lua", "pmain(I)I"), var15);
         report(var16, var20);
         liblua.lua_close(var16);
         var10 = Instruction.icmp_eq(var20, 0) & true;
         if(!var10) {
            Memory.destroyStackFrame();
            return 1;
         } else {
            int var21 = var15 + 8;
            int var22 = Memory.load_i32(var21);
            var13 = Instruction.icmp_ne(var22, 0) & true;
            int var23 = Instruction.zext_i32(var13);
            Memory.destroyStackFrame();
            return var23;
         }
      } else {
         int var17 = Memory.load_i32(var1);
         l_message(var17, _str6);
         Memory.destroyStackFrame();
         return 1;
      }
   }

   private static void l_message(int var0, int var1) {
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
      var2 = Instruction.icmp_eq(var0, 0) & true;
      int var10001;
      int var10002;
      if(!var2) {
         int var15 = c.__getreent();
         int var16 = var15 + 12;
         int var17 = Memory.load_i32(var16);
         var10001 = _str;
         var10002 = Memory.allocateStack(4);
         Memory.pack(var10002, var0);
         c.fprintf(var17, var10001, var10002);
      }

      int var18 = c.__getreent();
      int var19 = var18 + 12;
      int var20 = Memory.load_i32(var19);
      var10001 = _str1;
      var10002 = Memory.allocateStack(4);
      Memory.pack(var10002, var1);
      c.fprintf(var20, var10001, var10002);
      int var21 = c.__getreent();
      int var22 = var21 + 12;
      int var23 = Memory.load_i32(var22);
      int var24 = c.fflush(var23);
      Memory.destroyStackFrame();
   }

   private static void report(int var0, int var1) {
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      Memory.createStackFrame();
      var2 = Instruction.icmp_eq(var1, 0) & true;
      if(!var2) {
         int var9 = liblua.lua_type(var0, -1);
         var4 = Instruction.icmp_eq(var9, 0) & true;
         if(!var4) {
            int var10 = liblua.lua_tolstring(var0, -1, 0);
            var6 = Instruction.icmp_eq(var10, 0) & true;
            int var11 = var6?_str5:var10;
            int var12 = Memory.load_i32(progname);
            l_message(var12, var11);
            liblua.lua_settop(var0, -2);
            Memory.destroyStackFrame();
            return;
         }
      }

      Memory.destroyStackFrame();
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
      Memory.createStackFrame();
      int var185 = liblua.lua_touserdata(var0, 1);
      int var186 = var185 + 4;
      int var187 = Memory.load_i32(var186);
      Memory.store(globalL, var0);
      int var188 = Memory.load_i32(var187);
      var6 = Instruction.icmp_eq(var188, 0) & true;
      if(!var6) {
         byte var189 = (byte)Memory.load_i8(var188);
         var8 = Instruction.icmp_eq(var189, 0) & true;
         if(!var8) {
            Memory.store(progname, var188);
         }
      }

      label273: {
         int var190 = liblua.lua_gc(var0, 0, 0);
         liblua.luaL_openlibs(var0);
         int var191 = liblua.lua_gc(var0, 1, 0);
         int var192 = c.getenv(_str14);
         var12 = Instruction.icmp_eq(var192, 0) & true;
         byte var228;
         byte var229;
         byte var230;
         int var231;
         if(!var12) {
            byte var193 = (byte)Memory.load_i8(var192);
            var14 = Instruction.icmp_eq(var193, 64) & true;
            int var200;
            if(!var14) {
               int var198 = dostring(var0, var192, _str15);
               var200 = var198;
            } else {
               int var194 = var192 + 1;
               int var195 = liblua.luaL_loadfile(var0, var194);
               var17 = Instruction.icmp_eq(var195, 0) & true;
               byte var197;
               if(!var17) {
                  var197 = 1;
               } else {
                  int var196 = docall(var0, 0, 1);
                  var19 = Instruction.icmp_eq(var196, 0) & true;
                  if(!var19) {
                     var197 = 1;
                  } else {
                     var197 = 0;
                  }
               }

               report(var0, var197);
               var200 = var197;
            }

            int var201 = var185 + 8;
            Memory.store(var201, var200);
            var27 = Instruction.icmp_eq(var200, 0) & true;
            if(!var27) {
               break label273;
            }

            var228 = 0;
            var229 = 0;
            var230 = 0;
            var231 = 1;
         } else {
            int var199 = var185 + 8;
            Memory.store(var199, 0);
            var228 = 0;
            var229 = 0;
            var230 = 0;
            var231 = 1;
         }

         label267: {
            byte var234;
            byte var235;
            int var236;
            while(true) {
               int var232 = var187 + 4 * var231;
               int var233 = Memory.load_i32(var232);
               var78 = Instruction.icmp_eq(var233, 0) & true;
               if(var78) {
                  var234 = var228;
                  var235 = var230;
                  var236 = 0;
                  break;
               }

               byte var202 = (byte)Memory.load_i8(var233);
               var29 = Instruction.icmp_eq(var202, 45) & true;
               if(!var29) {
                  var234 = var228;
                  var235 = var230;
                  var236 = var231;
                  break;
               }

               byte var223;
               byte var224;
               byte var225;
               int var226;
               label276: {
                  byte var214;
                  label260: {
                     int var203 = var233 + 1;
                     byte var204 = (byte)Memory.load_i8(var203);
                     byte var205 = (byte)var204;
                     var33 = Instruction.icmp_slt(var205, 105) & true;
                     byte var217;
                     if(!var33) {
                        var34 = Instruction.icmp_slt(var205, 108) & true;
                        if(var34) {
                           var38 = Instruction.icmp_eq(var205, 105) & true;
                           if(!var38) {
                              break label267;
                           }

                           int var212 = var233 + 2;
                           byte var213 = (byte)Memory.load_i8(var212);
                           var54 = Instruction.icmp_eq(var213, 0) & true;
                           if(!var54) {
                              var234 = var228;
                              var235 = var230;
                              var236 = -1;
                              break;
                           }

                           var214 = 1;
                           break label260;
                        }

                        var35 = Instruction.icmp_slt(var205, 118) & true;
                        if(!var35) {
                           var36 = Instruction.icmp_eq(var205, 118) & true;
                           if(!var36) {
                              break label267;
                           }

                           var214 = var228;
                           break label260;
                        }

                        var37 = Instruction.icmp_eq(var205, 108) & true;
                        if(!var37) {
                           break label267;
                        }

                        var217 = var230;
                     } else {
                        var39 = Instruction.icmp_slt(var205, 45) & true;
                        if(var39) {
                           var43 = Instruction.icmp_eq(var205, 0) & true;
                           if(!var43) {
                              break label267;
                           }

                           var234 = var228;
                           var235 = var230;
                           var236 = var231;
                           break;
                        }

                        var40 = Instruction.icmp_slt(var205, 101) & true;
                        if(var40) {
                           var42 = Instruction.icmp_eq(var205, 45) & true;
                           if(!var42) {
                              break label267;
                           }

                           int var206 = var233 + 2;
                           byte var207 = (byte)Memory.load_i8(var206);
                           var46 = Instruction.icmp_eq(var207, 0) & true;
                           if(!var46) {
                              var234 = var228;
                              var235 = var230;
                              var236 = -1;
                           } else {
                              int var208 = var231 + 1;
                              int var209 = var187 + 4 * var208;
                              int var210 = Memory.load_i32(var209);
                              var50 = Instruction.icmp_eq(var210, 0) & true;
                              int var211 = var50?0:var208;
                              var234 = var228;
                              var235 = var230;
                              var236 = var211;
                           }
                           break;
                        }

                        var41 = Instruction.icmp_eq(var205, 101) & true;
                        if(!var41) {
                           break label267;
                        }

                        var217 = 1;
                     }

                     int var218 = var233 + 2;
                     byte var219 = (byte)Memory.load_i8(var218);
                     var62 = Instruction.icmp_eq(var219, 0) & true;
                     if(!var62) {
                        var223 = var228;
                        var224 = var229;
                        var225 = var217;
                        var226 = var231;
                     } else {
                        int var220 = var231 + 1;
                        int var221 = var187 + 4 * var220;
                        int var222 = Memory.load_i32(var221);
                        var66 = Instruction.icmp_eq(var222, 0) & true;
                        if(var66) {
                           var234 = var228;
                           var235 = var217;
                           var236 = -1;
                           break;
                        }

                        var223 = var228;
                        var224 = var229;
                        var225 = var217;
                        var226 = var220;
                     }
                     break label276;
                  }

                  int var215 = var233 + 2;
                  byte var216 = (byte)Memory.load_i8(var215);
                  var58 = Instruction.icmp_eq(var216, 0) & true;
                  if(!var58) {
                     var234 = var214;
                     var235 = var230;
                     var236 = -1;
                     break;
                  }

                  var223 = var214;
                  var224 = 1;
                  var225 = var230;
                  var226 = var231;
               }

               int var227 = var226 + 1;
               var228 = var223;
               var229 = var224;
               var230 = var225;
               var231 = var227;
            }

            var82 = Instruction.icmp_slt(var236, 0) & true;
            if(!var82) {
               var94 = Instruction.icmp_eq(var229, 0) & true;
               if(!var94) {
                  l_message(0, _str2);
               }

               var95 = Instruction.icmp_sgt(var236, 0) & true;
               int var247;
               if(!var95) {
                  int var246 = Memory.load_i32(var185);
                  var247 = var246;
               } else {
                  var247 = var236;
               }

               int var271 = 1;

               while(true) {
                  var131 = Instruction.icmp_slt(var271, var247) & true;
                  if(!var131) {
                     int var273 = var185 + 8;
                     Memory.store(var273, 0);
                     var136 = Instruction.icmp_eq(var236, 0) & true;
                     int var307;
                     if(var136) {
                        var307 = 0;
                     } else {
                        int var274 = Memory.load_i32(var187);
                        var138 = Instruction.icmp_eq(var274, 0) & true;
                        int var279;
                        if(!var138) {
                           int var275 = 0;

                           while(true) {
                              int var276 = var275 + 1;
                              int var277 = var187 + 4 * var276;
                              int var278 = Memory.load_i32(var277);
                              var143 = Instruction.icmp_eq(var278, 0) & true;
                              if(var143) {
                                 var279 = var276;
                                 break;
                              }

                              var275 = var276;
                           }
                        } else {
                           var279 = 0;
                        }

                        int var280 = var236 + 1;
                        int var281 = var279 - var280;
                        int var282 = var281 + 3;
                        liblua.luaL_checkstack(var0, var282, _str18);
                        var148 = Instruction.icmp_slt(var280, var279) & true;
                        if(var148) {
                           int var283 = var279 - var236;
                           int var284 = var283 + -1;
                           int var285 = 0;

                           while(true) {
                              int var286 = var285 + var280;
                              int var287 = var187 + 4 * var286;
                              int var288 = Memory.load_i32(var287);
                              liblua.lua_pushstring(var0, var288);
                              int var289 = var285 + 1;
                              var156 = Instruction.icmp_eq(var289, var284) & true;
                              if(var156) {
                                 break;
                              }

                              var285 = var289;
                           }
                        }

                        liblua.lua_createtable(var0, var281, var280);
                        var157 = Instruction.icmp_sgt(var279, 0) & true;
                        if(var157) {
                           int var290 = 0;

                           while(true) {
                              int var291 = var290 - var236;
                              int var292 = var187 + 4 * var290;
                              int var293 = Memory.load_i32(var292);
                              liblua.lua_pushstring(var0, var293);
                              liblua.lua_rawseti(var0, -2, var291);
                              int var294 = var290 + 1;
                              var163 = Instruction.icmp_eq(var294, var279) & true;
                              if(var163) {
                                 break;
                              }

                              var290 = var294;
                           }
                        }

                        liblua.lua_setfield(var0, -10002, _str19);
                        int var295 = var187 + 4 * var236;
                        int var296 = Memory.load_i32(var295);
                        int var297 = c.strcmp(var296, _str20);
                        var167 = Instruction.icmp_eq(var297, 0) & true;
                        int var302;
                        if(!var167) {
                           var302 = var296;
                        } else {
                           int var298 = var236 + -1;
                           int var299 = var187 + 4 * var298;
                           int var300 = Memory.load_i32(var299);
                           int var301 = c.strcmp(var300, _str21);
                           var172 = Instruction.icmp_eq(var301, 0) & true;
                           if(!var172) {
                              var302 = 0;
                           } else {
                              var302 = var296;
                           }
                        }

                        int var303 = liblua.luaL_loadfile(var0, var302);
                        int var304 = ~var281;
                        liblua.lua_insert(var0, var304);
                        var176 = Instruction.icmp_eq(var303, 0) & true;
                        int var306;
                        if(!var176) {
                           liblua.lua_settop(var0, var304);
                           var306 = var303;
                        } else {
                           int var305 = docall(var0, var281, 0);
                           var306 = var305;
                        }

                        report(var0, var306);
                        Memory.store(var273, var306);
                        var307 = var306;
                     }

                     var180 = Instruction.icmp_eq(var307, 0) & true;
                     if(var180) {
                        var181 = Instruction.icmp_eq(var234, 0) & true;
                        if(!var181) {
                           dotty(var0);
                           Memory.destroyStackFrame();
                           return 0;
                        }

                        var182 = Instruction.icmp_eq(var235, 0) & true;
                        var183 = var182 & var94 & true;
                        var184 = var183 & var136 & true;
                        if(var184) {
                           l_message(0, _str2);
                           dotty(var0);
                           Memory.destroyStackFrame();
                           return 0;
                        }
                     }
                     break label273;
                  }

                  int var248 = var187 + 4 * var271;
                  int var249 = Memory.load_i32(var248);
                  var101 = Instruction.icmp_eq(var249, 0) & true;
                  int var269;
                  if(!var101) {
                     int var250 = var249 + 1;
                     byte var251 = (byte)Memory.load_i8(var250);
                     byte var252 = (byte)var251;
                     var105 = Instruction.icmp_slt(var252, 108) & true;
                     if(!var105) {
                        var106 = Instruction.icmp_eq(var252, 108) & true;
                        if(!var106) {
                           var269 = var271;
                        } else {
                           int var261 = var249 + 2;
                           byte var262 = (byte)Memory.load_i8(var261);
                           var120 = Instruction.icmp_eq(var262, 0) & true;
                           int var266;
                           int var267;
                           if(!var120) {
                              var266 = var261;
                              var267 = var271;
                           } else {
                              int var263 = var271 + 1;
                              int var264 = var187 + 4 * var263;
                              int var265 = Memory.load_i32(var264);
                              var266 = var265;
                              var267 = var263;
                           }

                           liblua.lua_getfield(var0, -10002, _str16);
                           liblua.lua_pushstring(var0, var266);
                           int var268 = docall(var0, 1, 1);
                           report(var0, var268);
                           var127 = Instruction.icmp_eq(var268, 0) & true;
                           if(!var127) {
                              break;
                           }

                           var269 = var267;
                        }
                     } else {
                        var107 = Instruction.icmp_eq(var252, 101) & true;
                        if(!var107) {
                           var269 = var271;
                        } else {
                           int var253 = var249 + 2;
                           byte var254 = (byte)Memory.load_i8(var253);
                           var110 = Instruction.icmp_eq(var254, 0) & true;
                           int var258;
                           int var259;
                           if(!var110) {
                              var258 = var253;
                              var259 = var271;
                           } else {
                              int var255 = var271 + 1;
                              int var256 = var187 + 4 * var255;
                              int var257 = Memory.load_i32(var256);
                              var258 = var257;
                              var259 = var255;
                           }

                           int var260 = dostring(var0, var258, _str17);
                           var117 = Instruction.icmp_eq(var260, 0) & true;
                           if(!var117) {
                              break;
                           }

                           var269 = var259;
                        }
                     }
                  } else {
                     var269 = var271;
                  }

                  int var270 = var269 + 1;
                  var271 = var270;
               }

               int var272 = var185 + 8;
               Memory.store(var272, 1);
               Memory.destroyStackFrame();
               return 0;
            }
         }

         int var237 = Memory.load_i32(progname);
         int var238 = c.__getreent();
         int var239 = var238 + 12;
         int var240 = Memory.load_i32(var239);
         int var10001 = _str4;
         int var10002 = Memory.allocateStack(4);
         Memory.pack(var10002, var237);
         c.fprintf(var240, var10001, var10002);
         int var241 = c.__getreent();
         int var242 = var241 + 12;
         int var243 = Memory.load_i32(var242);
         int var244 = c.fflush(var243);
         int var245 = var185 + 8;
         Memory.store(var245, 1);
         Memory.destroyStackFrame();
         return 0;
      }

      Memory.destroyStackFrame();
      return 0;
   }

   private static int docall(int var0, int var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      Memory.createStackFrame();
      int var12 = liblua.lua_gettop(var0);
      int var13 = var12 - var1;
      liblua.lua_pushcclosure(var0, Function.getFunctionPointer("lua", "traceback(I)I"), 0);
      liblua.lua_insert(var0, var13);
      int var14 = c.signal(2, Function.getFunctionPointer("lua", "laction(I)V"));
      var6 = Instruction.icmp_eq(var2, 0) & true;
      int var15 = var6?-1:0;
      int var16 = liblua.lua_pcall(var0, var1, var15, var13);
      int var17 = c.signal(2, 0);
      liblua.lua_remove(var0, var13);
      var10 = Instruction.icmp_eq(var16, 0) & true;
      if(!var10) {
         int var18 = liblua.lua_gc(var0, 2, 0);
         Memory.destroyStackFrame();
         return var16;
      } else {
         Memory.destroyStackFrame();
         return var16;
      }
   }

   private static int traceback(int var0) {
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      Memory.createStackFrame();
      int var7 = liblua.lua_isstring(var0, 1);
      var2 = Instruction.icmp_eq(var7, 0) & true;
      if(!var2) {
         liblua.lua_getfield(var0, -10002, _str12);
         int var8 = liblua.lua_type(var0, -1);
         var4 = Instruction.icmp_eq(var8, 5) & true;
         if(!var4) {
            liblua.lua_settop(var0, -2);
            Memory.destroyStackFrame();
            return 1;
         } else {
            liblua.lua_getfield(var0, -1, _str13);
            int var9 = liblua.lua_type(var0, -1);
            var6 = Instruction.icmp_eq(var9, 6) & true;
            if(!var6) {
               liblua.lua_settop(var0, -3);
               Memory.destroyStackFrame();
               return 1;
            } else {
               liblua.lua_pushvalue(var0, 1);
               liblua.lua_pushinteger(var0, 2);
               liblua.lua_call(var0, 2, 1);
               Memory.destroyStackFrame();
               return 1;
            }
         }
      } else {
         Memory.destroyStackFrame();
         return 1;
      }
   }

   private static void laction(int var0) {
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      Memory.createStackFrame();
      int var4 = c.signal(var0, 0);
      int var5 = Memory.load_i32(globalL);
      int var6 = liblua.lua_sethook(var5, Function.getFunctionPointer("lua", "lstop(II)V"), 11, 1);
      Memory.destroyStackFrame();
   }

   private static void lstop(int var0, int var1) {
      boolean var2 = false;
      boolean var3 = false;
      Memory.createStackFrame();
      int var4 = liblua.lua_sethook(var0, 0, 0, 0);
      int var5 = liblua.luaL_error(var0, _str7, Memory.allocateStack(0));
      Memory.destroyStackFrame();
   }

   private static int dostring(int var0, int var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      Memory.createStackFrame();
      int var9 = c.strlen(var1);
      int var10 = liblua.luaL_loadbuffer(var0, var1, var9, var2);
      var5 = Instruction.icmp_eq(var10, 0) & true;
      byte var12;
      if(!var5) {
         var12 = 1;
      } else {
         int var11 = docall(var0, 0, 1);
         var7 = Instruction.icmp_eq(var11, 0) & true;
         if(!var7) {
            var12 = 1;
         } else {
            var12 = 0;
         }
      }

      report(var0, var12);
      Memory.destroyStackFrame();
      return var12;
   }

   private static int pushline(int var0, int var1) {
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
      Memory.createStackFrame();
      int var33 = Memory.allocateStack(512);
      var4 = Instruction.icmp_eq(var1, 0) & true;
      int var34 = var4?_str9:_str8;
      liblua.lua_getfield(var0, -10002, var34);
      int var35 = liblua.lua_tolstring(var0, -1, 0);
      var7 = Instruction.icmp_eq(var35, 0) & true;
      int var37;
      if(!var7) {
         var37 = var35;
      } else {
         int var36 = var4?_str11:_str10;
         var37 = var36;
      }

      liblua.lua_settop(var0, -2);
      int var38 = c.__getreent();
      int var39 = var38 + 8;
      int var40 = Memory.load_i32(var39);
      c.fputs(var37, var40);
      int var41 = c.__getreent();
      int var42 = var41 + 8;
      int var43 = Memory.load_i32(var42);
      int var44 = c.fflush(var43);
      int var45 = c.__getreent();
      int var46 = var45 + 4;
      int var47 = Memory.load_i32(var46);
      int var48 = c.fgets(var33, 512, var47);
      var22 = Instruction.icmp_eq(var48, 0) & true;
      if(!var22) {
         int var49 = c.strlen(var33);
         var24 = Instruction.icmp_eq(var49, 0) & true;
         if(!var24) {
            int var50 = var49 + -1;
            int var51 = var33 + 1 * var50;
            byte var52 = (byte)Memory.load_i8(var51);
            var28 = Instruction.icmp_eq(var52, 10) & true;
            if(var28) {
               Memory.store(var51, (byte)0);
            }
         }

         if(!var4) {
            byte var53 = (byte)Memory.load_i8(var33);
            var30 = Instruction.icmp_eq(var53, 61) & true;
            if(var30) {
               int var54 = var33 + 1;
               int var10001 = _str23;
               int var10002 = Memory.allocateStack(4);
               Memory.pack(var10002, var54);
               liblua.lua_pushfstring(var0, var10001, var10002);
               Memory.destroyStackFrame();
               return 1;
            }
         }

         liblua.lua_pushstring(var0, var33);
         Memory.destroyStackFrame();
         return 1;
      } else {
         Memory.destroyStackFrame();
         return 0;
      }
   }

   private static void dotty(int var0) {
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
      Memory.createStackFrame();
      int var40 = Memory.allocateStack(4);
      int var41 = Memory.load_i32(progname);
      Memory.store(progname, 0);

      label51:
      while(true) {
         liblua.lua_settop(var0, 0);
         int var51 = pushline(var0, 1);
         var16 = Instruction.icmp_eq(var51, 0) & true;
         if(var16) {
            break;
         }

         int var54;
         while(true) {
            int var52 = liblua.lua_objlen(var0, 1);
            int var53 = liblua.lua_tolstring(var0, 1, 0);
            var54 = liblua.luaL_loadbuffer(var0, var53, var52, _str24);
            var20 = Instruction.icmp_eq(var54, 3) & true;
            if(!var20) {
               break;
            }

            int var55 = liblua.lua_tolstring(var0, -1, var40);
            int var56 = Memory.load_i32(var40);
            int var57 = var56 + -7;
            int var58 = var55 + 1 * var57;
            int var59 = c.strstr(var55, _str22);
            var26 = Instruction.icmp_eq(var59, var58) & true;
            if(!var26) {
               break;
            }

            liblua.lua_settop(var0, -2);
            int var60 = pushline(var0, 0);
            var28 = Instruction.icmp_eq(var60, 0) & true;
            if(var28) {
               break label51;
            }

            liblua.lua_pushlstring(var0, _str25, 1);
            liblua.lua_insert(var0, -2);
            liblua.lua_concat(var0, 3);
         }

         liblua.lua_remove(var0, 1);
         var29 = Instruction.icmp_slt(var54, 0) & true;
         int var43;
         if(!var29) {
            var30 = Instruction.icmp_eq(var54, 0) & true;
            if(!var30) {
               var43 = var54;
            } else {
               int var42 = docall(var0, 0, 0);
               var43 = var42;
            }
         } else {
            var31 = Instruction.icmp_eq(var54, -1) & true;
            if(var31) {
               break;
            }

            var43 = var54;
         }

         report(var0, var43);
         var5 = Instruction.icmp_eq(var43, 0) & true;
         if(var5) {
            int var44 = liblua.lua_gettop(var0);
            var7 = Instruction.icmp_sgt(var44, 0) & true;
            if(var7) {
               liblua.lua_getfield(var0, -10002, _str26);
               liblua.lua_insert(var0, 1);
               int var45 = liblua.lua_gettop(var0);
               int var46 = var45 + -1;
               int var47 = liblua.lua_pcall(var0, var46, 0, 0);
               var11 = Instruction.icmp_eq(var47, 0) & true;
               if(!var11) {
                  int var48 = liblua.lua_tolstring(var0, -1, 0);
                  int var10001 = _str27;
                  int var10002 = Memory.allocateStack(4);
                  Memory.pack(var10002, var48);
                  int var49 = liblua.lua_pushfstring(var0, var10001, var10002);
                  int var50 = Memory.load_i32(progname);
                  l_message(var50, var49);
               }
            }
         }
      }

      liblua.lua_settop(var0, 0);
      int var61 = c.__getreent();
      int var62 = var61 + 8;
      int var63 = Memory.load_i32(var62);
      int var64 = c.fputs(_str25, var63);
      int var65 = c.__getreent();
      int var66 = var65 + 8;
      int var67 = Memory.load_i32(var66);
      int var68 = c.fflush(var67);
      Memory.store(progname, var41);
      Memory.destroyStackFrame();
   }
}
