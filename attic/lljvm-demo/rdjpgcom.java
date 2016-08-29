import lljvm.lib.c;
import lljvm.runtime.Instruction;
import lljvm.runtime.Memory;
import lljvm.runtime.Instruction.Unreachable;

public final class rdjpgcom {
   private static final int _str = Memory.allocateData(56);
   private static final int progname = Memory.allocateData(4);
   private static final int _str1 = Memory.allocateData(34);
   private static final int _str2 = Memory.allocateData(38);
   private static final int _str3 = Memory.allocateData(69);
   private static final int _str4 = Memory.allocateData(53);
   private static final int infile = Memory.allocateData(4);
   private static final int _str5 = Memory.allocateData(4);
   private static final int _str6 = Memory.allocateData(16);
   private static final int _str7 = Memory.allocateData(27);
   private static final int _str8 = Memory.allocateData(42);
   private static final int _str9 = Memory.allocateData(9);
   private static final int _str10 = Memory.allocateData(20);
   private static final int _str11 = Memory.allocateData(12);
   private static final int _str12 = Memory.allocateData(9);
   private static final int _str13 = Memory.allocateData(24);
   private static final int _str14 = Memory.allocateData(25);
   private static final int _str15 = Memory.allocateData(22);
   private static final int _str16 = Memory.allocateData(39);
   private static final int _str17 = Memory.allocateData(31);
   private static final int _str18 = Memory.allocateData(28);
   private static final int _str19 = Memory.allocateData(43);
   private static final int _str20 = Memory.allocateData(44);
   private static final int _str21 = Memory.allocateData(41);
   private static final int _str22 = Memory.allocateData(8);
   private static final int _str23 = Memory.allocateData(66);
   private static final int _str24 = Memory.allocateData(18);
   private static final int _str25 = Memory.allocateData(24);
   private static final int _str26 = Memory.allocateData(29);
   private static final int _str27 = Memory.allocateData(1);
   private static final int _str28 = Memory.allocateData(2);
   private static final int _str29 = Memory.allocateData(3);
   private static final int _str30 = Memory.allocateData(6);
   private static final int _str31 = Memory.allocateData(2);
   private static final int _str32 = Memory.allocateData(26);
   private static final int _str33 = Memory.allocateData(17);
   private static final int _str34 = Memory.allocateData(9);
   private static final int _str35 = Memory.allocateData(8);
   private static final int _str36 = Memory.allocateData(4);
   private static final int _str37 = Memory.allocateData(25);
   private static final int _str38 = Memory.allocateData(2);
   private static final int _str39 = Memory.allocateData(19);

   {
      Memory.pack(_str, "rdjpgcom displays any textual comments in a JPEG file.\n");
      Memory.zero(progname, 4);
      Memory.pack(_str1, "Usage: %s [switches] [inputfile]\n");
      Memory.pack(_str2, "Switches (names may be abbreviated):\n");
      Memory.pack(_str3, "  -raw        Display non-printable characters in comments (unsafe)\n");
      Memory.pack(_str4, "  -verbose    Also display dimensions of JPEG image\n");
      Memory.zero(infile, 4);
      Memory.pack(_str5, "%s\n");
      Memory.pack(_str6, "Not a JPEG file");
      Memory.pack(_str7, "Premature EOF in JPEG file");
      Memory.pack(_str8, "Warning: garbage data found in JPEG file\n");
      Memory.pack(_str9, "Baseline");
      Memory.pack(_str10, "Extended sequential");
      Memory.pack(_str11, "Progressive");
      Memory.pack(_str12, "Lossless");
      Memory.pack(_str13, "Differential sequential");
      Memory.pack(_str14, "Differential progressive");
      Memory.pack(_str15, "Differential lossless");
      Memory.pack(_str16, "Extended sequential, arithmetic coding");
      Memory.pack(_str17, "Progressive, arithmetic coding");
      Memory.pack(_str18, "Lossless, arithmetic coding");
      Memory.pack(_str19, "Differential sequential, arithmetic coding");
      Memory.pack(_str20, "Differential progressive, arithmetic coding");
      Memory.pack(_str21, "Differential lossless, arithmetic coding");
      Memory.pack(_str22, "Unknown");
      Memory.pack(_str23, "JPEG image is %uw * %uh, %d color components, %d bits per sample\n");
      Memory.pack(_str24, "JPEG process: %s\n");
      Memory.pack(_str25, "Bogus SOF marker length");
      Memory.pack(_str26, "Erroneous JPEG marker length");
      Memory.zero(_str27, 1);
      Memory.pack(_str28, "\n");
      Memory.pack(_str29, "\\\\");
      Memory.pack(_str30, "\\%03o");
      Memory.pack(_str31, "C");
      Memory.pack(_str32, "Expected SOI marker first");
      Memory.pack(_str33, "APP12 contains:\n");
      Memory.pack(_str34, "rdjpgcom");
      Memory.pack(_str35, "verbose");
      Memory.pack(_str36, "raw");
      Memory.pack(_str37, "%s: only one input file\n");
      Memory.pack(_str38, "r");
      Memory.pack(_str39, "%s: can\'t open %s\n");
   }

   public static void main(String[] var0) {
      c.exit(main(var0.length, Memory.storeStack(var0)));
   }

   public static int main(int _argc, int _argv) {
      boolean _9;
      boolean _12;
      boolean _15;
      boolean _22;
      boolean _24;
      boolean _33;
      boolean _47;
      boolean _61;
      boolean _71;
      boolean _72;
      boolean _73;
      boolean _78;
      boolean _79;
      boolean _85;
      boolean _phitmp_i_i;
      boolean _92;
      boolean _93;
      boolean _Pivot26;
      boolean _Pivot24;
      boolean _Pivot22;
      boolean _SwitchLeaf20;
      boolean _SwitchLeaf18;
      boolean _Pivot16;
      boolean _SwitchLeaf14;
      boolean _SwitchLeaf11;
      boolean _Pivot8;
      boolean _Pivot;
      boolean _SwitchLeaf6;
      boolean _SwitchLeaf3;
      boolean _SwitchLeaf;
      boolean _Pivot77;
      boolean _Pivot75;
      boolean _Pivot73;
      boolean _Pivot71;
      boolean _SwitchLeaf69;
      boolean _SwitchLeaf67;
      boolean _Pivot65;
      boolean _SwitchLeaf63;
      boolean _SwitchLeaf61;
      boolean _Pivot59;
      boolean _Pivot57;
      boolean _SwitchLeaf55;
      boolean _SwitchLeaf53;
      boolean _SwitchLeaf51;
      boolean _Pivot49;
      boolean _Pivot47;
      boolean _Pivot45;
      boolean _SwitchLeaf43;
      boolean _SwitchLeaf41;
      boolean _SwitchLeaf39;
      boolean _Pivot37;
      boolean _Pivot35;
      boolean _SwitchLeaf33;
      boolean _SwitchLeaf31;
      boolean _SwitchLeaf29;
      boolean _151;
      boolean _152;
      boolean _exitcond;
      int _indvar1;
      byte _raw_11;
      int _verbose_11;
      label275: {
         boolean _2 = false;
         boolean _3 = false;
         boolean _4 = false;
         boolean _5 = false;
         boolean _scevgep = false;
         boolean _7 = false;
         boolean _8 = false;
         _9 = false;
         boolean _10 = false;
         boolean _11 = false;
         _12 = false;
         boolean _13 = false;
         boolean _14 = false;
         _15 = false;
         boolean _raw_0 = false;
         boolean _verbose_0 = false;
         boolean _phitmp = false;
         boolean _indvar = false;
         boolean _raw_1 = false;
         boolean _verbose_1 = false;
         _22 = false;
         boolean _23 = false;
         _24 = false;
         boolean _25 = false;
         boolean _26 = false;
         boolean _27 = false;
         boolean _28 = false;
         boolean _29 = false;
         boolean _30 = false;
         boolean _31 = false;
         boolean _32 = false;
         _33 = false;
         boolean _34 = false;
         boolean _35 = false;
         boolean _36 = false;
         boolean _37 = false;
         boolean _38 = false;
         boolean _39 = false;
         boolean _40 = false;
         boolean _41 = false;
         boolean _42 = false;
         boolean _43 = false;
         boolean _44 = false;
         boolean _45 = false;
         boolean _46 = false;
         _47 = false;
         boolean _48 = false;
         boolean _49 = false;
         boolean _50 = false;
         boolean _51 = false;
         boolean _52 = false;
         boolean _53 = false;
         boolean _54 = false;
         boolean _55 = false;
         boolean _iftmp_14_0_i_i = false;
         boolean _57 = false;
         boolean _58 = false;
         boolean _59 = false;
         boolean _60 = false;
         _61 = false;
         boolean _62 = false;
         boolean _63 = false;
         boolean _64 = false;
         boolean _65 = false;
         boolean _66 = false;
         boolean _67 = false;
         boolean _68 = false;
         boolean _69 = false;
         boolean _iftmp_18_0_i_i = false;
         _71 = false;
         _72 = false;
         _73 = false;
         boolean _74 = false;
         boolean _75 = false;
         boolean _76 = false;
         boolean _77 = false;
         _78 = false;
         _79 = false;
         boolean _80 = false;
         boolean _81 = false;
         boolean _82 = false;
         boolean _83 = false;
         boolean _84 = false;
         _85 = false;
         boolean _discarded_bytes_07_i_i = false;
         boolean _tmp_i_i = false;
         boolean _88 = false;
         _phitmp_i_i = false;
         boolean _discarded_bytes_0_lcssa_i_i = false;
         boolean _91 = false;
         _92 = false;
         _93 = false;
         boolean _94 = false;
         boolean _95 = false;
         boolean _96 = false;
         boolean _97 = false;
         _Pivot26 = false;
         _Pivot24 = false;
         _Pivot22 = false;
         _SwitchLeaf20 = false;
         _SwitchLeaf18 = false;
         _Pivot16 = false;
         boolean __off13 = false;
         _SwitchLeaf14 = false;
         boolean __off10 = false;
         _SwitchLeaf11 = false;
         _Pivot8 = false;
         _Pivot = false;
         boolean __off5 = false;
         _SwitchLeaf6 = false;
         boolean __off2 = false;
         _SwitchLeaf3 = false;
         boolean __off = false;
         _SwitchLeaf = false;
         boolean _116 = false;
         boolean _117 = false;
         boolean _118 = false;
         boolean _119 = false;
         boolean _120 = false;
         _Pivot77 = false;
         _Pivot75 = false;
         _Pivot73 = false;
         _Pivot71 = false;
         _SwitchLeaf69 = false;
         _SwitchLeaf67 = false;
         _Pivot65 = false;
         _SwitchLeaf63 = false;
         _SwitchLeaf61 = false;
         _Pivot59 = false;
         _Pivot57 = false;
         _SwitchLeaf55 = false;
         _SwitchLeaf53 = false;
         _SwitchLeaf51 = false;
         _Pivot49 = false;
         _Pivot47 = false;
         _Pivot45 = false;
         _SwitchLeaf43 = false;
         _SwitchLeaf41 = false;
         _SwitchLeaf39 = false;
         _Pivot37 = false;
         _Pivot35 = false;
         _SwitchLeaf33 = false;
         _SwitchLeaf31 = false;
         _SwitchLeaf29 = false;
         boolean _process_0_i_i = false;
         boolean _147 = false;
         boolean _148 = false;
         boolean _149 = false;
         boolean _150 = false;
         _151 = false;
         _152 = false;
         boolean _153 = false;
         boolean _154 = false;
         boolean _155 = false;
         boolean _156 = false;
         boolean _ci_020_i_i = false;
         boolean _158 = false;
         boolean _159 = false;
         boolean _160 = false;
         boolean _161 = false;
         _exitcond = false;
         boolean _163 = false;
         Memory.createStackFrame();
         int _21 = Memory.load_i32(_argv);
         Memory.store(progname, _21);
         _3 = Instruction.icmp_eq(_21, 0) & true;
         if(!_3) {
            byte _41 = (byte)Memory.load_i8(_21);
            _5 = Instruction.icmp_eq(_41, 0) & true;
            if(!_5) {
               _indvar1 = 1;
               _raw_11 = 0;
               _verbose_11 = 0;
               break label275;
            }
         }

         Memory.store(progname, _str34);
         _indvar1 = 1;
         _raw_11 = 0;
         _verbose_11 = 0;
      }

      while(true) {
         _22 = Instruction.icmp_slt(_indvar1, _argc) & true;
         if(!_22) {
            break;
         }

         int _scevgep1 = _argv + 4 * _indvar1;
         int _71 = Memory.load_i32(_scevgep1);
         byte _81 = (byte)Memory.load_i8(_71);
         _9 = Instruction.icmp_eq(_81, 45) & true;
         if(!_9) {
            break;
         }

         int _101 = _71 + 1;
         int _111 = keymatch(_101, _str35);
         _12 = Instruction.icmp_eq(_111, 0) & true;
         byte _raw_01;
         int _verbose_01;
         if(!_12) {
            int _131 = _verbose_11 + 1;
            _raw_01 = _raw_11;
            _verbose_01 = _131;
         } else {
            int _141 = keymatch(_101, _str36);
            _15 = Instruction.icmp_eq(_141, 0) & true;
            if(!_15) {
               _raw_01 = 1;
               _verbose_01 = _verbose_11;
            } else {
               usage();
               _raw_01 = _raw_11;
               _verbose_01 = _verbose_11;
            }
         }

         int _phitmp1 = _indvar1 + 1;
         _indvar1 = _phitmp1;
         _raw_11 = _raw_01;
         _verbose_11 = _verbose_01;
      }

      int _231 = _argc + -1;
      _24 = Instruction.icmp_sgt(_231, _indvar1) & true;
      int var10001;
      int var10002;
      if(_24) {
         int _251 = Memory.load_i32(progname);
         int _261 = c.__getreent();
         int _271 = _261 + 12;
         int _281 = Memory.load_i32(_271);
         var10001 = _str37;
         var10002 = Memory.allocateStack(4);
         Memory.pack(var10002, _251);
         c.fprintf(_281, var10001, var10002);
         usage();
      }

      int _431;
      if(!_22) {
         int _401 = c.__getreent();
         int _411 = _401 + 4;
         int _421 = Memory.load_i32(_411);
         Memory.store(infile, _421);
         _431 = _421;
      } else {
         int _301 = _argv + 4 * _indvar1;
         int _311 = Memory.load_i32(_301);
         int _321 = c.fopen(_311, _str38);
         Memory.store(infile, _321);
         _33 = Instruction.icmp_eq(_321, 0) & true;
         if(_33) {
            int _341 = Memory.load_i32(_301);
            int _351 = Memory.load_i32(progname);
            int _361 = c.__getreent();
            int _371 = _361 + 12;
            int _381 = Memory.load_i32(_371);
            var10001 = _str39;
            var10002 = Memory.allocateStack(8);
            Memory.pack(Memory.pack(var10002, _351), _341);
            c.fprintf(_381, var10001, var10002);
            c.exit(1);
            throw Unreachable.instance;
         }

         _431 = _321;
      }

      int _441 = _431 + 4;
      int _451 = Memory.load_i32(_441);
      int _461 = _451 + -1;
      Memory.store(_441, _461);
      _47 = Instruction.icmp_slt(_461, 0) & true;
      int _481 = Memory.load_i32(infile);
      int _iftmp_14_0_i_i1;
      if(!_47) {
         int _511 = _481 + 0;
         int _521 = Memory.load_i32(_511);
         byte _531 = (byte)Memory.load_i8(_521);
         int _541 = Instruction.zext_i32(_531);
         int _551 = _521 + 1;
         Memory.store(_511, _551);
         _iftmp_14_0_i_i1 = _541;
      } else {
         int _491 = c.__getreent();
         int _501 = c.__srget_r(_491, _481);
         _iftmp_14_0_i_i1 = _501;
      }

      int _571 = Memory.load_i32(infile);
      int _581 = _571 + 4;
      int _591 = Memory.load_i32(_581);
      int _601 = _591 + -1;
      Memory.store(_581, _601);
      _61 = Instruction.icmp_slt(_601, 0) & true;
      int _621 = Memory.load_i32(infile);
      int _iftmp_18_0_i_i1;
      if(!_61) {
         int _651 = _621 + 0;
         int _661 = Memory.load_i32(_651);
         byte _671 = (byte)Memory.load_i8(_661);
         int _681 = Instruction.zext_i32(_671);
         int _691 = _661 + 1;
         Memory.store(_651, _691);
         _iftmp_18_0_i_i1 = _681;
      } else {
         int _631 = c.__getreent();
         int _641 = c.__srget_r(_631, _621);
         _iftmp_18_0_i_i1 = _641;
      }

      _71 = Instruction.icmp_ne(_iftmp_14_0_i_i1, 255) & true;
      _72 = Instruction.icmp_ne(_iftmp_18_0_i_i1, 216) & true;
      _73 = (_72 | _71) & true;
      if(_73) {
         int _741 = c.__getreent();
         int _751 = _741 + 12;
         int _761 = Memory.load_i32(_751);
         var10001 = _str5;
         var10002 = Memory.allocateStack(4);
         Memory.pack(var10002, _str6);
         c.fprintf(_761, var10001, var10002);
         c.exit(1);
         throw Unreachable.instance;
      } else {
         _78 = Instruction.icmp_eq(_iftmp_18_0_i_i1, 216) & true;
         if(!_78) {
            int _801 = c.__getreent();
            int _811 = _801 + 12;
            int _821 = Memory.load_i32(_811);
            var10001 = _str5;
            var10002 = Memory.allocateStack(4);
            Memory.pack(var10002, _str32);
            c.fprintf(_821, var10001, var10002);
            c.exit(1);
            throw Unreachable.instance;
         } else {
            _79 = Instruction.icmp_eq(_verbose_11, 0) & true;

            while(true) {
               label261:
               while(true) {
                  int _841 = read_1_byte();
                  _85 = Instruction.icmp_eq(_841, 255) & true;
                  int _discarded_bytes_0_lcssa_i_i1;
                  if(_85) {
                     _discarded_bytes_0_lcssa_i_i1 = 0;
                  } else {
                     int _discarded_bytes_07_i_i1 = 0;

                     while(true) {
                        int _tmp_i_i1 = _discarded_bytes_07_i_i1 + 1;
                        int _881 = read_1_byte();
                        _phitmp_i_i = Instruction.icmp_eq(_881, 255) & true;
                        if(_phitmp_i_i) {
                           _discarded_bytes_0_lcssa_i_i1 = _tmp_i_i1;
                           break;
                        }

                        _discarded_bytes_07_i_i1 = _tmp_i_i1;
                     }
                  }

                  int _911;
                  do {
                     _911 = read_1_byte();
                     _92 = Instruction.icmp_eq(_911, 255) & true;
                  } while(_92);

                  _93 = Instruction.icmp_eq(_discarded_bytes_0_lcssa_i_i1, 0) & true;
                  if(!_93) {
                     int _941 = c.__getreent();
                     int _951 = _941 + 12;
                     int _961 = Memory.load_i32(_951);
                     int _971 = c.fprintf(_961, _str8, Memory.allocateStack(0));
                  }

                  label281: {
                     _Pivot26 = Instruction.icmp_slt(_911, 205) & true;
                     if(!_Pivot26) {
                        _Pivot24 = Instruction.icmp_slt(_911, 236) & true;
                        if(!_Pivot24) {
                           _Pivot22 = Instruction.icmp_slt(_911, 254) & true;
                           if(!_Pivot22) {
                              _SwitchLeaf20 = Instruction.icmp_eq(_911, 254) & true;
                              if(_SwitchLeaf20) {
                                 process_COM(_raw_11);
                                 continue;
                              }
                           } else {
                              _SwitchLeaf18 = Instruction.icmp_eq(_911, 236) & true;
                              if(_SwitchLeaf18) {
                                 if(!_79) {
                                    int _1631 = c.printf(_str33, Memory.allocateStack(0));
                                    process_COM(_raw_11);
                                 } else {
                                    skip_variable();
                                 }
                                 continue;
                              }
                           }
                           break label281;
                        }

                        _Pivot16 = Instruction.icmp_slt(_911, 217) & true;
                        if(!_Pivot16) {
                           int __off131 = _911 + -217;
                           _SwitchLeaf14 = Instruction.icmp_ule(__off131, 1) & true;
                           if(_SwitchLeaf14) {
                              c.exit(0);
                              throw Unreachable.instance;
                           }
                           break label281;
                        }

                        int __off101 = _911 + -205;
                        _SwitchLeaf11 = Instruction.icmp_ule(__off101, 2) & true;
                        if(!_SwitchLeaf11) {
                           break label281;
                        }
                     } else {
                        _Pivot8 = Instruction.icmp_slt(_911, 197) & true;
                        if(!_Pivot8) {
                           _Pivot = Instruction.icmp_slt(_911, 201) & true;
                           if(!_Pivot) {
                              int __off51 = _911 + -201;
                              _SwitchLeaf6 = Instruction.icmp_ule(__off51, 2) & true;
                              if(!_SwitchLeaf6) {
                                 break label281;
                              }
                           } else {
                              int __off21 = _911 + -197;
                              _SwitchLeaf3 = Instruction.icmp_ule(__off21, 2) & true;
                              if(!_SwitchLeaf3) {
                                 break label281;
                              }
                           }
                        } else {
                           int __off1 = _911 + -192;
                           _SwitchLeaf = Instruction.icmp_ule(__off1, 3) & true;
                           if(!_SwitchLeaf) {
                              break label281;
                           }
                        }
                     }

                     if(_79) {
                        skip_variable();
                        continue;
                     }

                     int _1161;
                     int _1171;
                     int _1181;
                     int _1191;
                     int _1201;
                     int _process_0_i_i1;
                     label242: {
                        _1161 = read_2_bytes();
                        _1171 = read_1_byte();
                        _1181 = read_2_bytes();
                        _1191 = read_2_bytes();
                        _1201 = read_1_byte();
                        _Pivot77 = Instruction.icmp_slt(_911, 199) & true;
                        if(!_Pivot77) {
                           _Pivot75 = Instruction.icmp_slt(_911, 203) & true;
                           if(!_Pivot75) {
                              _Pivot73 = Instruction.icmp_slt(_911, 206) & true;
                              if(!_Pivot73) {
                                 _Pivot71 = Instruction.icmp_slt(_911, 207) & true;
                                 if(!_Pivot71) {
                                    _SwitchLeaf69 = Instruction.icmp_eq(_911, 207) & true;
                                    if(_SwitchLeaf69) {
                                       _process_0_i_i1 = _str21;
                                       break label242;
                                    }
                                 } else {
                                    _SwitchLeaf67 = Instruction.icmp_eq(_911, 206) & true;
                                    if(_SwitchLeaf67) {
                                       _process_0_i_i1 = _str20;
                                       break label242;
                                    }
                                 }
                              } else {
                                 _Pivot65 = Instruction.icmp_slt(_911, 205) & true;
                                 if(!_Pivot65) {
                                    _SwitchLeaf63 = Instruction.icmp_eq(_911, 205) & true;
                                    if(_SwitchLeaf63) {
                                       _process_0_i_i1 = _str19;
                                       break label242;
                                    }
                                 } else {
                                    _SwitchLeaf61 = Instruction.icmp_eq(_911, 203) & true;
                                    if(_SwitchLeaf61) {
                                       _process_0_i_i1 = _str18;
                                       break label242;
                                    }
                                 }
                              }
                           } else {
                              _Pivot59 = Instruction.icmp_slt(_911, 201) & true;
                              if(!_Pivot59) {
                                 _Pivot57 = Instruction.icmp_slt(_911, 202) & true;
                                 if(!_Pivot57) {
                                    _SwitchLeaf55 = Instruction.icmp_eq(_911, 202) & true;
                                    if(_SwitchLeaf55) {
                                       _process_0_i_i1 = _str17;
                                       break label242;
                                    }
                                 } else {
                                    _SwitchLeaf53 = Instruction.icmp_eq(_911, 201) & true;
                                    if(_SwitchLeaf53) {
                                       _process_0_i_i1 = _str16;
                                       break label242;
                                    }
                                 }
                              } else {
                                 _SwitchLeaf51 = Instruction.icmp_eq(_911, 199) & true;
                                 if(_SwitchLeaf51) {
                                    _process_0_i_i1 = _str15;
                                    break label242;
                                 }
                              }
                           }
                        } else {
                           _Pivot49 = Instruction.icmp_slt(_911, 195) & true;
                           if(!_Pivot49) {
                              _Pivot47 = Instruction.icmp_slt(_911, 197) & true;
                              if(!_Pivot47) {
                                 _Pivot45 = Instruction.icmp_slt(_911, 198) & true;
                                 if(!_Pivot45) {
                                    _SwitchLeaf43 = Instruction.icmp_eq(_911, 198) & true;
                                    if(_SwitchLeaf43) {
                                       _process_0_i_i1 = _str14;
                                       break label242;
                                    }
                                 } else {
                                    _SwitchLeaf41 = Instruction.icmp_eq(_911, 197) & true;
                                    if(_SwitchLeaf41) {
                                       _process_0_i_i1 = _str13;
                                       break label242;
                                    }
                                 }
                              } else {
                                 _SwitchLeaf39 = Instruction.icmp_eq(_911, 195) & true;
                                 if(_SwitchLeaf39) {
                                    _process_0_i_i1 = _str12;
                                    break label242;
                                 }
                              }
                           } else {
                              _Pivot37 = Instruction.icmp_slt(_911, 193) & true;
                              if(!_Pivot37) {
                                 _Pivot35 = Instruction.icmp_slt(_911, 194) & true;
                                 if(!_Pivot35) {
                                    _SwitchLeaf33 = Instruction.icmp_eq(_911, 194) & true;
                                    if(_SwitchLeaf33) {
                                       _process_0_i_i1 = _str11;
                                       break label242;
                                    }
                                 } else {
                                    _SwitchLeaf31 = Instruction.icmp_eq(_911, 193) & true;
                                    if(_SwitchLeaf31) {
                                       _process_0_i_i1 = _str10;
                                       break label242;
                                    }
                                 }
                              } else {
                                 _SwitchLeaf29 = Instruction.icmp_eq(_911, 192) & true;
                                 if(_SwitchLeaf29) {
                                    _process_0_i_i1 = _str9;
                                    break label242;
                                 }
                              }
                           }
                        }

                        _process_0_i_i1 = _str22;
                     }

                     int var10000 = _str23;
                     var10001 = Memory.allocateStack(16);
                     Memory.pack(Memory.pack(Memory.pack(Memory.pack(var10001, _1191), _1181), _1201), _1171);
                     int _1471 = c.printf(var10000, var10001);
                     var10000 = _str24;
                     var10001 = Memory.allocateStack(4);
                     Memory.pack(var10001, _process_0_i_i1);
                     int _1481 = c.printf(var10000, var10001);
                     int _1491 = _1201 * 3;
                     int _1501 = _1491 + 8;
                     _151 = Instruction.icmp_eq(_1501, _1161) & true;
                     if(!_151) {
                        int _1531 = c.__getreent();
                        int _1541 = _1531 + 12;
                        int _1551 = Memory.load_i32(_1541);
                        var10001 = _str5;
                        var10002 = Memory.allocateStack(4);
                        Memory.pack(var10002, _str25);
                        c.fprintf(_1551, var10001, var10002);
                        c.exit(1);
                        throw Unreachable.instance;
                     }

                     _152 = Instruction.icmp_sgt(_1201, 0) & true;
                     if(!_152) {
                        continue;
                     }

                     int _ci_020_i_i1 = 0;

                     while(true) {
                        int _1581 = read_1_byte();
                        int _1591 = read_1_byte();
                        int _1601 = read_1_byte();
                        int _1611 = _ci_020_i_i1 + 1;
                        _exitcond = Instruction.icmp_eq(_1611, _1201) & true;
                        if(_exitcond) {
                           continue label261;
                        }

                        _ci_020_i_i1 = _1611;
                     }
                  }

                  skip_variable();
               }
            }
         }
      }
   }

   private static int keymatch(int _arg, int _keyword) {
      boolean _2 = false;
      boolean _keyword_addr_0 = false;
      boolean _4 = false;
      boolean _5 = false;
      boolean _6 = false;
      boolean _7 = false;
      boolean _8 = false;
      boolean _9 = false;
      boolean _10 = false;
      boolean _11 = false;
      boolean _12 = false;
      boolean _toBool3 = false;
      boolean __ = false;
      boolean _ca_0 = false;
      boolean _16 = false;
      boolean _17 = false;
      boolean _18 = false;
      boolean _arg_addr_0 = false;
      boolean _20 = false;
      boolean _21 = false;
      boolean _22 = false;
      boolean _not_ = false;
      boolean _retval = false;
      Memory.createStackFrame();
      int _21 = Memory.load_i32(c.__ctype_ptr__);
      int _181 = 0;

      while(true) {
         int _arg_addr_01 = _arg + 1 * _181;
         byte _201 = (byte)Memory.load_i8(_arg_addr_01);
         byte _211 = (byte)_201;
         _22 = Instruction.icmp_eq(_201, 0) & true;
         if(_22) {
            _not_ = Instruction.icmp_sgt(_181, 0) & true;
            int _retval1 = Instruction.zext_i32(_not_);
            Memory.destroyStackFrame();
            return _retval1;
         }

         int _keyword_addr_01 = _keyword + 1 * _181;
         byte _41 = (byte)Memory.load_i8(_keyword_addr_01);
         byte _51 = (byte)_41;
         _6 = Instruction.icmp_eq(_41, 0) & true;
         if(_6) {
            break;
         }

         int _71 = _211 + 1;
         int _81 = _21 + 1 * _71;
         byte _91 = (byte)Memory.load_i8(_81);
         int _101 = Instruction.zext_i32(_91);
         int _111 = _101 & 1;
         int _121 = _211 + 32;
         _toBool3 = Instruction.icmp_eq(_111, 0) & true;
         int __1 = _toBool3?_211:_121;
         int _ca_01 = _toBool3?__1:__1;
         _16 = Instruction.icmp_eq(__1, _51) & true;
         if(!_16) {
            break;
         }

         int _171 = _181 + 1;
         _181 = _171;
      }

      Memory.destroyStackFrame();
      return 0;
   }

   private static void usage() {
      boolean _0 = false;
      boolean _1 = false;
      boolean _2 = false;
      boolean _3 = false;
      boolean _4 = false;
      boolean _5 = false;
      boolean _6 = false;
      boolean _7 = false;
      boolean _8 = false;
      boolean _9 = false;
      boolean _10 = false;
      boolean _11 = false;
      boolean _12 = false;
      boolean _13 = false;
      boolean _14 = false;
      boolean _15 = false;
      boolean _16 = false;
      boolean _17 = false;
      boolean _18 = false;
      boolean _19 = false;
      boolean _20 = false;
      Memory.createStackFrame();
      int _01 = c.__getreent();
      int _11 = _01 + 12;
      int _21 = Memory.load_i32(_11);
      int _31 = c.fprintf(_21, _str, Memory.allocateStack(0));
      int _41 = Memory.load_i32(progname);
      int _51 = c.__getreent();
      int _61 = _51 + 12;
      int _71 = Memory.load_i32(_61);
      int var10001 = _str1;
      int var10002 = Memory.allocateStack(4);
      Memory.pack(var10002, _41);
      c.fprintf(_71, var10001, var10002);
      int _91 = c.__getreent();
      int _101 = _91 + 12;
      int _111 = Memory.load_i32(_101);
      int _121 = c.fprintf(_111, _str2, Memory.allocateStack(0));
      int _131 = c.__getreent();
      int _141 = _131 + 12;
      int _151 = Memory.load_i32(_141);
      int _161 = c.fprintf(_151, _str3, Memory.allocateStack(0));
      int _171 = c.__getreent();
      int _181 = _171 + 12;
      int _191 = Memory.load_i32(_181);
      int _201 = c.fprintf(_191, _str4, Memory.allocateStack(0));
      c.exit(1);
      throw Unreachable.instance;
   }

   private static int read_1_byte() {
      boolean _0 = false;
      boolean _1 = false;
      boolean _2 = false;
      boolean _3 = false;
      boolean _4 = false;
      boolean _5 = false;
      boolean _6 = false;
      boolean _7 = false;
      boolean _8 = false;
      boolean _9 = false;
      boolean _10 = false;
      boolean _11 = false;
      boolean _12 = false;
      boolean _iftmp_0_0 = false;
      boolean _14 = false;
      boolean _15 = false;
      boolean _16 = false;
      boolean _17 = false;
      boolean _18 = false;
      Memory.createStackFrame();
      int _01 = Memory.load_i32(infile);
      int _11 = _01 + 4;
      int _21 = Memory.load_i32(_11);
      int _31 = _21 + -1;
      Memory.store(_11, _31);
      _4 = Instruction.icmp_slt(_31, 0) & true;
      int _51 = Memory.load_i32(infile);
      int _iftmp_0_01;
      if(!_4) {
         int _81 = _51 + 0;
         int _91 = Memory.load_i32(_81);
         byte _101 = (byte)Memory.load_i8(_91);
         int _111 = Instruction.zext_i32(_101);
         int _121 = _91 + 1;
         Memory.store(_81, _121);
         _iftmp_0_01 = _111;
      } else {
         int _61 = c.__getreent();
         int _71 = c.__srget_r(_61, _51);
         _iftmp_0_01 = _71;
      }

      _14 = Instruction.icmp_eq(_iftmp_0_01, -1) & true;
      if(!_14) {
         Memory.destroyStackFrame();
         return _iftmp_0_01;
      } else {
         int _151 = c.__getreent();
         int _161 = _151 + 12;
         int _171 = Memory.load_i32(_161);
         int var10001 = _str5;
         int var10002 = Memory.allocateStack(4);
         Memory.pack(var10002, _str7);
         c.fprintf(_171, var10001, var10002);
         c.exit(1);
         throw Unreachable.instance;
      }
   }

   private static int read_2_bytes() {
      boolean _0 = false;
      boolean _1 = false;
      boolean _2 = false;
      boolean _3 = false;
      boolean _4 = false;
      boolean _5 = false;
      boolean _6 = false;
      boolean _7 = false;
      boolean _8 = false;
      boolean _9 = false;
      boolean _10 = false;
      boolean _11 = false;
      boolean _12 = false;
      boolean _iftmp_4_0 = false;
      boolean _14 = false;
      boolean _15 = false;
      boolean _16 = false;
      boolean _17 = false;
      boolean _18 = false;
      boolean _19 = false;
      boolean _20 = false;
      boolean _21 = false;
      boolean _22 = false;
      boolean _23 = false;
      boolean _24 = false;
      boolean _25 = false;
      boolean _26 = false;
      boolean _27 = false;
      boolean _28 = false;
      boolean _29 = false;
      boolean _30 = false;
      boolean _31 = false;
      boolean _iftmp_8_0 = false;
      boolean _33 = false;
      boolean _34 = false;
      boolean _35 = false;
      boolean _36 = false;
      boolean _37 = false;
      boolean _38 = false;
      boolean _39 = false;
      Memory.createStackFrame();
      int _01 = Memory.load_i32(infile);
      int _11 = _01 + 4;
      int _21 = Memory.load_i32(_11);
      int _31 = _21 + -1;
      Memory.store(_11, _31);
      _4 = Instruction.icmp_slt(_31, 0) & true;
      int _51 = Memory.load_i32(infile);
      int _iftmp_4_01;
      if(!_4) {
         int _81 = _51 + 0;
         int _91 = Memory.load_i32(_81);
         byte _101 = (byte)Memory.load_i8(_91);
         int _111 = Instruction.zext_i32(_101);
         int _121 = _91 + 1;
         Memory.store(_81, _121);
         _iftmp_4_01 = _111;
      } else {
         int _61 = c.__getreent();
         int _71 = c.__srget_r(_61, _51);
         _iftmp_4_01 = _71;
      }

      _14 = Instruction.icmp_eq(_iftmp_4_01, -1) & true;
      int var10001;
      int var10002;
      if(!_14) {
         int _191 = Memory.load_i32(infile);
         int _201 = _191 + 4;
         int _211 = Memory.load_i32(_201);
         int _221 = _211 + -1;
         Memory.store(_201, _221);
         _23 = Instruction.icmp_slt(_221, 0) & true;
         int _241 = Memory.load_i32(infile);
         int _iftmp_8_01;
         if(!_23) {
            int _271 = _241 + 0;
            int _281 = Memory.load_i32(_271);
            byte _291 = (byte)Memory.load_i8(_281);
            int _301 = Instruction.zext_i32(_291);
            int _311 = _281 + 1;
            Memory.store(_271, _311);
            _iftmp_8_01 = _301;
         } else {
            int _251 = c.__getreent();
            int _261 = c.__srget_r(_251, _241);
            _iftmp_8_01 = _261;
         }

         _33 = Instruction.icmp_eq(_iftmp_8_01, -1) & true;
         if(!_33) {
            int _381 = _iftmp_4_01 << 8;
            int _391 = _iftmp_8_01 + _381;
            Memory.destroyStackFrame();
            return _391;
         } else {
            int _341 = c.__getreent();
            int _351 = _341 + 12;
            int _361 = Memory.load_i32(_351);
            var10001 = _str5;
            var10002 = Memory.allocateStack(4);
            Memory.pack(var10002, _str7);
            c.fprintf(_361, var10001, var10002);
            c.exit(1);
            throw Unreachable.instance;
         }
      } else {
         int _151 = c.__getreent();
         int _161 = _151 + 12;
         int _171 = Memory.load_i32(_161);
         var10001 = _str5;
         var10002 = Memory.allocateStack(4);
         Memory.pack(var10002, _str7);
         c.fprintf(_171, var10001, var10002);
         c.exit(1);
         throw Unreachable.instance;
      }
   }

   private static void skip_variable() {
      boolean _0 = false;
      boolean _1 = false;
      boolean _2 = false;
      boolean _3 = false;
      boolean _4 = false;
      boolean _5 = false;
      boolean _6 = false;
      boolean _tmp = false;
      boolean _indvar = false;
      boolean _9 = false;
      boolean _indvar_next = false;
      boolean _exitcond = false;
      Memory.createStackFrame();
      int _01 = read_2_bytes();
      _1 = Instruction.icmp_ugt(_01, 1) & true;
      if(!_1) {
         int _21 = c.__getreent();
         int _31 = _21 + 12;
         int _41 = Memory.load_i32(_31);
         int var10001 = _str5;
         int var10002 = Memory.allocateStack(4);
         Memory.pack(var10002, _str26);
         c.fprintf(_41, var10001, var10002);
         c.exit(1);
         throw Unreachable.instance;
      } else {
         _6 = Instruction.icmp_eq(_01, 2) & true;
         if(!_6) {
            int _tmp1 = _01 + -2;
            int _indvar1 = 0;

            while(true) {
               int _91 = read_1_byte();
               int _indvar_next1 = _indvar1 + 1;
               _exitcond = Instruction.icmp_eq(_indvar_next1, _tmp1) & true;
               if(_exitcond) {
                  break;
               }

               _indvar1 = _indvar_next1;
            }
         }

         Memory.destroyStackFrame();
      }
   }

   private static void process_COM(int _raw) {
      boolean _1 = false;
      boolean _2 = false;
      boolean _3 = false;
      boolean _4 = false;
      boolean _5 = false;
      boolean _6 = false;
      boolean _7 = false;
      boolean _8 = false;
      boolean _9 = false;
      boolean _tmp = false;
      boolean _indvar = false;
      boolean _lastch_034 = false;
      boolean _13 = false;
      boolean _14 = false;
      boolean _15 = false;
      boolean _16 = false;
      boolean _17 = false;
      boolean _18 = false;
      boolean _19 = false;
      boolean _20 = false;
      boolean _21 = false;
      boolean _22 = false;
      boolean _23 = false;
      boolean _24 = false;
      boolean _25 = false;
      boolean _26 = false;
      boolean _27 = false;
      boolean _28 = false;
      boolean _29 = false;
      boolean _30 = false;
      boolean _31 = false;
      boolean _32 = false;
      boolean _33 = false;
      boolean _34 = false;
      boolean _35 = false;
      boolean _36 = false;
      boolean _37 = false;
      boolean _38 = false;
      boolean _39 = false;
      boolean _40 = false;
      boolean _41 = false;
      boolean _42 = false;
      boolean _43 = false;
      boolean _44 = false;
      boolean _45 = false;
      boolean _46 = false;
      boolean _47 = false;
      boolean _48 = false;
      boolean _49 = false;
      boolean _50 = false;
      boolean _51 = false;
      boolean _52 = false;
      boolean _53 = false;
      boolean _54 = false;
      boolean _55 = false;
      boolean _56 = false;
      boolean _57 = false;
      boolean _58 = false;
      boolean _59 = false;
      boolean _60 = false;
      boolean _61 = false;
      boolean _62 = false;
      boolean _63 = false;
      boolean _Pivot6 = false;
      boolean _Pivot = false;
      boolean _SwitchLeaf4 = false;
      boolean _SwitchLeaf2 = false;
      boolean _SwitchLeaf = false;
      boolean _69 = false;
      boolean _70 = false;
      boolean _71 = false;
      boolean _72 = false;
      boolean _73 = false;
      boolean _74 = false;
      boolean _75 = false;
      boolean _76 = false;
      boolean _77 = false;
      boolean _78 = false;
      boolean _79 = false;
      boolean _80 = false;
      boolean _81 = false;
      boolean _82 = false;
      boolean _83 = false;
      boolean _84 = false;
      boolean _85 = false;
      boolean _86 = false;
      boolean _87 = false;
      boolean _88 = false;
      boolean _89 = false;
      boolean _90 = false;
      boolean _91 = false;
      boolean _92 = false;
      boolean _93 = false;
      boolean _94 = false;
      boolean _95 = false;
      boolean _96 = false;
      boolean _97 = false;
      boolean _98 = false;
      boolean _99 = false;
      boolean _100 = false;
      boolean _101 = false;
      boolean _102 = false;
      boolean _103 = false;
      boolean _104 = false;
      boolean _105 = false;
      boolean _106 = false;
      boolean _107 = false;
      boolean _108 = false;
      boolean _109 = false;
      boolean _110 = false;
      boolean _111 = false;
      boolean _112 = false;
      boolean _113 = false;
      boolean _114 = false;
      boolean _115 = false;
      boolean _116 = false;
      boolean _117 = false;
      boolean _118 = false;
      boolean _119 = false;
      boolean _120 = false;
      boolean _121 = false;
      boolean _122 = false;
      boolean _123 = false;
      boolean _124 = false;
      boolean _125 = false;
      boolean _126 = false;
      boolean _127 = false;
      boolean _128 = false;
      boolean _129 = false;
      boolean _130 = false;
      boolean _indvar_next = false;
      boolean _exitcond = false;
      boolean _133 = false;
      boolean _134 = false;
      Memory.createStackFrame();
      int _11 = c.setlocale(2, _str27);
      int _21 = read_2_bytes();
      _3 = Instruction.icmp_ugt(_21, 1) & true;
      int var10001;
      if(!_3) {
         int _41 = c.__getreent();
         int _51 = _41 + 12;
         int _61 = Memory.load_i32(_51);
         var10001 = _str5;
         int var10002 = Memory.allocateStack(4);
         Memory.pack(var10002, _str26);
         c.fprintf(_61, var10001, var10002);
         c.exit(1);
         throw Unreachable.instance;
      } else {
         _8 = Instruction.icmp_eq(_21, 2) & true;
         if(!_8) {
            _9 = Instruction.icmp_eq(_raw, 0) & true;
            int _tmp1 = _21 + -2;
            int _indvar1 = 0;
            int _lastch_0341 = 0;

            while(true) {
               int _131 = read_1_byte();
               if(!_9) {
                  int _141 = c.__getreent();
                  int _151 = _141 + 8;
                  int _161 = Memory.load_i32(_151);
                  int _171 = _161 + 8;
                  int _181 = Memory.load_i32(_171);
                  int _191 = _181 + -1;
                  Memory.store(_171, _191);
                  _20 = Instruction.icmp_slt(_191, 0) & true;
                  int _211 = c.__getreent();
                  int _221 = _211 + 8;
                  int _231 = Memory.load_i32(_221);
                  if(!_20) {
                     int _551 = _231 + 0;
                     int _561 = Memory.load_i32(_551);
                     byte _571 = (byte)((byte)_131);
                     Memory.store(_561, _571);
                     int _581 = c.__getreent();
                     int _591 = _581 + 8;
                     int _601 = Memory.load_i32(_591);
                     int _611 = _601 + 0;
                     int _621 = Memory.load_i32(_611);
                     int _631 = _621 + 1;
                     Memory.store(_611, _631);
                  } else {
                     int _241 = _231 + 8;
                     int _251 = Memory.load_i32(_241);
                     int _261 = c.__getreent();
                     int _271 = _261 + 8;
                     int _281 = Memory.load_i32(_271);
                     int _291 = _281 + 24;
                     int _301 = Memory.load_i32(_291);
                     _31 = Instruction.icmp_slt(_251, _301) & true;
                     int _321 = c.__getreent();
                     int _331 = _321 + 8;
                     int _341 = Memory.load_i32(_331);
                     if(!_31) {
                        int _351 = _341 + 0;
                        int _361 = Memory.load_i32(_351);
                        byte _371 = (byte)((byte)_131);
                        Memory.store(_361, _371);
                        int _381 = c.__getreent();
                        int _391 = _381 + 8;
                        int _401 = Memory.load_i32(_391);
                        int _411 = _401 + 0;
                        int _421 = Memory.load_i32(_411);
                        byte _431 = (byte)Memory.load_i8(_421);
                        _44 = Instruction.icmp_eq(_431, 10) & true;
                        int _451 = c.__getreent();
                        int _461 = _451 + 8;
                        int _471 = Memory.load_i32(_461);
                        if(!_44) {
                           int _481 = _471 + 0;
                           int _491 = Memory.load_i32(_481);
                           int _501 = _491 + 1;
                           Memory.store(_481, _501);
                        } else {
                           int _511 = c.__getreent();
                           c.__swbuf_r(_511, 10, _471);
                        }
                     } else {
                        int _531 = c.__getreent();
                        c.__swbuf_r(_531, _131, _341);
                     }
                  }
               } else {
                  label85: {
                     _Pivot6 = Instruction.icmp_slt(_131, 13) & true;
                     if(!_Pivot6) {
                        _Pivot = Instruction.icmp_slt(_131, 92) & true;
                        if(!_Pivot) {
                           _SwitchLeaf4 = Instruction.icmp_eq(_131, 92) & true;
                           if(_SwitchLeaf4) {
                              int _721 = c.printf(_str29, Memory.allocateStack(0));
                              break label85;
                           }
                        } else {
                           _SwitchLeaf2 = Instruction.icmp_eq(_131, 13) & true;
                           if(_SwitchLeaf2) {
                              int _691 = c.printf(_str28, Memory.allocateStack(0));
                              break label85;
                           }
                        }
                     } else {
                        _SwitchLeaf = Instruction.icmp_eq(_131, 10) & true;
                        if(_SwitchLeaf) {
                           _70 = Instruction.icmp_eq(_lastch_0341, 13) & true;
                           if(!_70) {
                              int _711 = c.printf(_str28, Memory.allocateStack(0));
                           }
                           break label85;
                        }
                     }

                     int _731 = Memory.load_i32(c.__ctype_ptr__);
                     int _741 = _131 + 1;
                     int _751 = _731 + 1 * _741;
                     byte _761 = (byte)Memory.load_i8(_751);
                     int _771 = Instruction.zext_i32(_761);
                     int _781 = _771 & 151;
                     _79 = Instruction.icmp_eq(_781, 0) & true;
                     if(!_79) {
                        int _801 = c.__getreent();
                        int _811 = _801 + 8;
                        int _821 = Memory.load_i32(_811);
                        int _831 = _821 + 8;
                        int _841 = Memory.load_i32(_831);
                        int _851 = _841 + -1;
                        Memory.store(_831, _851);
                        _86 = Instruction.icmp_slt(_851, 0) & true;
                        int _871 = c.__getreent();
                        int _881 = _871 + 8;
                        int _891 = Memory.load_i32(_881);
                        if(!_86) {
                           int _1211 = _891 + 0;
                           int _1221 = Memory.load_i32(_1211);
                           byte _1231 = (byte)((byte)_131);
                           Memory.store(_1221, _1231);
                           int _1241 = c.__getreent();
                           int _1251 = _1241 + 8;
                           int _1261 = Memory.load_i32(_1251);
                           int _1271 = _1261 + 0;
                           int _1281 = Memory.load_i32(_1271);
                           int _1291 = _1281 + 1;
                           Memory.store(_1271, _1291);
                        } else {
                           int _901 = _891 + 8;
                           int _911 = Memory.load_i32(_901);
                           int _921 = c.__getreent();
                           int _931 = _921 + 8;
                           int _941 = Memory.load_i32(_931);
                           int _951 = _941 + 24;
                           int _961 = Memory.load_i32(_951);
                           _97 = Instruction.icmp_slt(_911, _961) & true;
                           int _981 = c.__getreent();
                           int _991 = _981 + 8;
                           int _1001 = Memory.load_i32(_991);
                           if(!_97) {
                              int _1011 = _1001 + 0;
                              int _1021 = Memory.load_i32(_1011);
                              byte _1031 = (byte)((byte)_131);
                              Memory.store(_1021, _1031);
                              int _1041 = c.__getreent();
                              int _1051 = _1041 + 8;
                              int _1061 = Memory.load_i32(_1051);
                              int _1071 = _1061 + 0;
                              int _1081 = Memory.load_i32(_1071);
                              byte _1091 = (byte)Memory.load_i8(_1081);
                              _110 = Instruction.icmp_eq(_1091, 10) & true;
                              int _1111 = c.__getreent();
                              int _1121 = _1111 + 8;
                              int _1131 = Memory.load_i32(_1121);
                              if(!_110) {
                                 int _1141 = _1131 + 0;
                                 int _1151 = Memory.load_i32(_1141);
                                 int _1161 = _1151 + 1;
                                 Memory.store(_1141, _1161);
                              } else {
                                 int _1171 = c.__getreent();
                                 c.__swbuf_r(_1171, 10, _1131);
                              }
                           } else {
                              int _1191 = c.__getreent();
                              c.__swbuf_r(_1191, _131, _1001);
                           }
                        }
                     } else {
                        int var10000 = _str30;
                        var10001 = Memory.allocateStack(4);
                        Memory.pack(var10001, _131);
                        int _1301 = c.printf(var10000, var10001);
                     }
                  }
               }

               int _indvar_next1 = _indvar1 + 1;
               _exitcond = Instruction.icmp_eq(_indvar_next1, _tmp1) & true;
               if(_exitcond) {
                  break;
               }

               _indvar1 = _indvar_next1;
               _lastch_0341 = _131;
            }
         }

         int _1331 = c.printf(_str28, Memory.allocateStack(0));
         int _1341 = c.setlocale(2, _str31);
         Memory.destroyStackFrame();
      }
   }
}
