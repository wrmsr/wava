import lljvm.lib.c;
import lljvm.runtime.Instruction;
import lljvm.runtime.Memory;
import lljvm.runtime.Instruction.Unreachable;

public final class wrjpgcom {
   private static final int _str = Memory.allocateData(52);
   private static final int _str1 = Memory.allocateData(52);
   private static final int progname = Memory.allocateData(4);
   private static final int _str2 = Memory.allocateData(22);
   private static final int _str3 = Memory.allocateData(13);
   private static final int _str4 = Memory.allocateData(38);
   private static final int _str5 = Memory.allocateData(49);
   private static final int _str6 = Memory.allocateData(51);
   private static final int _str7 = Memory.allocateData(49);
   private static final int _str8 = Memory.allocateData(57);
   private static final int _str9 = Memory.allocateData(24);
   private static final int _str10 = Memory.allocateData(67);
   private static final int _str11 = Memory.allocateData(52);
   private static final int _str12 = Memory.allocateData(54);
   private static final int _str13 = Memory.allocateData(57);
   private static final int _str14 = Memory.allocateData(35);
   private static final int infile = Memory.allocateData(4);
   private static final int _str15 = Memory.allocateData(4);
   private static final int _str16 = Memory.allocateData(16);
   private static final int _str17 = Memory.allocateData(27);
   private static final int _str18 = Memory.allocateData(42);
   private static final int _str19 = Memory.allocateData(29);
   private static final int outfile = Memory.allocateData(4);
   private static final int _str20 = Memory.allocateData(26);
   private static final int _str21 = Memory.allocateData(23);
   private static final int _str22 = Memory.allocateData(9);
   private static final int _str23 = Memory.allocateData(8);
   private static final int _str24 = Memory.allocateData(6);
   private static final int _str25 = Memory.allocateData(2);
   private static final int _str26 = Memory.allocateData(19);
   private static final int _str27 = Memory.allocateData(8);
   private static final int _str28 = Memory.allocateData(20);
   private static final int _str29 = Memory.allocateData(26);
   private static final int _str30 = Memory.allocateData(2);
   private static final int _str31 = Memory.allocateData(25);
   private static final int _str32 = Memory.allocateData(38);

   {
      Memory.pack(_str, "wrjpgcom inserts a textual comment in a JPEG file.\n");
      Memory.pack(_str1, "You can add to or replace any existing comment(s).\n");
      Memory.zero(progname, 4);
      Memory.pack(_str2, "Usage: %s [switches] ");
      Memory.pack(_str3, "[inputfile]\n");
      Memory.pack(_str4, "Switches (names may be abbreviated):\n");
      Memory.pack(_str5, "  -replace         Delete any existing comments\n");
      Memory.pack(_str6, "  -comment \"text\"  Insert comment with given text\n");
      Memory.pack(_str7, "  -cfile name      Read comment from named file\n");
      Memory.pack(_str8, "Notice that you must put quotes around the comment text\n");
      Memory.pack(_str9, "when you use -comment.\n");
      Memory.pack(_str10, "If you do not give either -comment or -cfile on the command line,\n");
      Memory.pack(_str11, "then the comment text is read from standard input.\n");
      Memory.pack(_str12, "It can be multiple lines, up to %u characters total.\n");
      Memory.pack(_str13, "You must specify an input JPEG file name when supplying\n");
      Memory.pack(_str14, "comment text from standard input.\n");
      Memory.zero(infile, 4);
      Memory.pack(_str15, "%s\n");
      Memory.pack(_str16, "Not a JPEG file");
      Memory.pack(_str17, "Premature EOF in JPEG file");
      Memory.pack(_str18, "Warning: garbage data found in JPEG file\n");
      Memory.pack(_str19, "Erroneous JPEG marker length");
      Memory.zero(outfile, 4);
      Memory.pack(_str20, "Expected SOI marker first");
      Memory.pack(_str21, "SOS without prior SOFn");
      Memory.pack(_str22, "wrjpgcom");
      Memory.pack(_str23, "replace");
      Memory.pack(_str24, "cfile");
      Memory.pack(_str25, "r");
      Memory.pack(_str26, "%s: can\'t open %s\n");
      Memory.pack(_str27, "comment");
      Memory.pack(_str28, "Insufficient memory");
      Memory.pack(_str29, "Missing ending quote mark");
      Memory.pack(_str30, " ");
      Memory.pack(_str31, "%s: only one input file\n");
      Memory.pack(_str32, "Comment text may not exceed %u bytes\n");
   }

   public static void main(String[] var0) {
      c.exit(main(var0.length, Memory.storeStack(var0)));
   }

   public static int main(int _argc, int _argv) {
      boolean _9;
      boolean _12;
      boolean _14;
      boolean _16;
      boolean _20;
      boolean _28;
      boolean _30;
      boolean _34;
      boolean _37;
      boolean _50;
      boolean _54;
      boolean _55;
      boolean _78;
      boolean _79;
      boolean _80;
      boolean _81;
      boolean _86;
      boolean _87;
      boolean _88;
      boolean _92;
      boolean _103;
      boolean _112;
      boolean _115;
      boolean _120;
      boolean _127;
      boolean _138;
      boolean _146;
      boolean _154;
      boolean _168;
      boolean _178;
      boolean _179;
      boolean _180;
      boolean _185;
      boolean _190;
      boolean _192;
      boolean _phitmp_i_i;
      boolean _199;
      boolean _200;
      boolean _Pivot25;
      boolean _Pivot23;
      boolean _Pivot21;
      boolean _SwitchLeaf19;
      boolean _SwitchLeaf17;
      boolean _Pivot15;
      boolean _SwitchLeaf13;
      boolean _SwitchLeaf11;
      boolean _Pivot8;
      boolean _Pivot;
      boolean _SwitchLeaf6;
      boolean _SwitchLeaf3;
      boolean _SwitchLeaf;
      boolean _227;
      boolean _232;
      boolean _exitcond110;
      boolean _238;
      boolean _exitcond;
      boolean _250;
      boolean _256;
      boolean _264;
      boolean _281;
      boolean _291;
      int _comment_file_11;
      int _comment_length_11;
      int _comment_arg_11;
      byte _keep_COM_11;
      int _argn_11;
      label311: {
         boolean _2 = false;
         boolean _3 = false;
         boolean _4 = false;
         boolean _5 = false;
         boolean _6 = false;
         boolean _7 = false;
         boolean _8 = false;
         _9 = false;
         boolean _10 = false;
         boolean _11 = false;
         _12 = false;
         boolean _13 = false;
         _14 = false;
         boolean _15 = false;
         _16 = false;
         boolean _17 = false;
         boolean _18 = false;
         boolean _19 = false;
         _20 = false;
         boolean _21 = false;
         boolean _22 = false;
         boolean _23 = false;
         boolean _24 = false;
         boolean _25 = false;
         boolean _26 = false;
         boolean _27 = false;
         _28 = false;
         boolean _29 = false;
         _30 = false;
         boolean _31 = false;
         boolean _32 = false;
         boolean _33 = false;
         _34 = false;
         boolean _35 = false;
         boolean __sub = false;
         _37 = false;
         boolean _38 = false;
         boolean _39 = false;
         boolean _40 = false;
         boolean _41 = false;
         boolean _42 = false;
         boolean _43 = false;
         boolean _tmp120 = false;
         boolean _indvar117 = false;
         boolean _argn_2 = false;
         boolean _tmp121 = false;
         boolean _scevgep122 = false;
         boolean _49 = false;
         _50 = false;
         boolean _51 = false;
         boolean _52 = false;
         boolean _53 = false;
         _54 = false;
         _55 = false;
         boolean _56 = false;
         boolean _57 = false;
         boolean _58 = false;
         boolean _59 = false;
         boolean _60 = false;
         boolean _61 = false;
         boolean _62 = false;
         boolean _indvar_next118 = false;
         boolean _comment_arg_2 = false;
         boolean _argn_3 = false;
         boolean _66 = false;
         boolean _comment_file_0 = false;
         boolean _comment_length_0 = false;
         boolean _comment_arg_0 = false;
         boolean _keep_COM_0 = false;
         boolean _argn_0 = false;
         boolean _72 = false;
         boolean _comment_file_1 = false;
         boolean _comment_length_1 = false;
         boolean _comment_arg_1 = false;
         boolean _keep_COM_1 = false;
         boolean _argn_1 = false;
         _78 = false;
         _79 = false;
         _80 = false;
         _81 = false;
         boolean _82 = false;
         boolean _83 = false;
         boolean _84 = false;
         boolean _85 = false;
         _86 = false;
         _87 = false;
         _88 = false;
         boolean _89 = false;
         boolean _90 = false;
         boolean _91 = false;
         _92 = false;
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
         _103 = false;
         boolean _104 = false;
         boolean _105 = false;
         boolean _106 = false;
         boolean _107 = false;
         boolean _108 = false;
         boolean _109 = false;
         boolean _110 = false;
         boolean _111 = false;
         _112 = false;
         boolean _113 = false;
         boolean __sub65 = false;
         _115 = false;
         boolean _116 = false;
         boolean _117 = false;
         boolean _118 = false;
         boolean _119 = false;
         _120 = false;
         boolean _121 = false;
         boolean _122 = false;
         boolean _123 = false;
         boolean _iftmp_116_0 = false;
         boolean _125 = false;
         boolean _126 = false;
         _127 = false;
         boolean _128 = false;
         boolean _129 = false;
         boolean _130 = false;
         boolean _131 = false;
         boolean _132 = false;
         boolean _133 = false;
         boolean _134 = false;
         boolean _scevgep = false;
         boolean _136 = false;
         boolean _137 = false;
         _138 = false;
         boolean _139 = false;
         boolean _140 = false;
         boolean _141 = false;
         boolean _142 = false;
         boolean _143 = false;
         boolean _144 = false;
         boolean _iftmp_117_0 = false;
         _146 = false;
         boolean _147 = false;
         boolean _comment_length_2 = false;
         boolean _comment_arg_3 = false;
         boolean _150 = false;
         boolean _151 = false;
         boolean _152 = false;
         boolean _153 = false;
         _154 = false;
         boolean _155 = false;
         boolean _156 = false;
         boolean _157 = false;
         boolean _158 = false;
         boolean _159 = false;
         boolean _160 = false;
         boolean _161 = false;
         boolean _162 = false;
         boolean _iftmp_97_0_i_i = false;
         boolean _164 = false;
         boolean _165 = false;
         boolean _166 = false;
         boolean _167 = false;
         _168 = false;
         boolean _169 = false;
         boolean _170 = false;
         boolean _171 = false;
         boolean _172 = false;
         boolean _173 = false;
         boolean _174 = false;
         boolean _175 = false;
         boolean _176 = false;
         boolean _iftmp_101_0_i_i = false;
         _178 = false;
         _179 = false;
         _180 = false;
         boolean _181 = false;
         boolean _182 = false;
         boolean _183 = false;
         boolean _184 = false;
         _185 = false;
         boolean _186 = false;
         boolean _187 = false;
         boolean _188 = false;
         boolean _189 = false;
         _190 = false;
         boolean _191 = false;
         _192 = false;
         boolean _discarded_bytes_07_i_i = false;
         boolean _tmp_i_i = false;
         boolean _195 = false;
         _phitmp_i_i = false;
         boolean _discarded_bytes_0_lcssa_i_i = false;
         boolean _198 = false;
         _199 = false;
         _200 = false;
         boolean _201 = false;
         boolean _202 = false;
         boolean _203 = false;
         boolean _204 = false;
         _Pivot25 = false;
         _Pivot23 = false;
         _Pivot21 = false;
         _SwitchLeaf19 = false;
         _SwitchLeaf17 = false;
         _Pivot15 = false;
         _SwitchLeaf13 = false;
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
         boolean _222 = false;
         boolean _223 = false;
         boolean _224 = false;
         boolean _225 = false;
         boolean _226 = false;
         _227 = false;
         boolean _228 = false;
         boolean _229 = false;
         boolean _230 = false;
         boolean _231 = false;
         _232 = false;
         boolean _tmp_i19_i = false;
         boolean _indvar_i_i = false;
         boolean _235 = false;
         boolean _indvar_next_i_i = false;
         _exitcond110 = false;
         _238 = false;
         boolean _239 = false;
         boolean _indvar = false;
         boolean _comment_arg_487 = false;
         boolean _242 = false;
         boolean _243 = false;
         boolean _indvar_next = false;
         _exitcond = false;
         boolean _246 = false;
         boolean _247 = false;
         boolean _248 = false;
         boolean _249 = false;
         _250 = false;
         boolean _251 = false;
         boolean _252 = false;
         boolean _253 = false;
         boolean _254 = false;
         boolean _255 = false;
         _256 = false;
         boolean _257 = false;
         boolean _258 = false;
         boolean _259 = false;
         boolean _260 = false;
         boolean _261 = false;
         boolean _262 = false;
         boolean _263 = false;
         _264 = false;
         boolean _265 = false;
         boolean _266 = false;
         boolean _267 = false;
         boolean _268 = false;
         boolean _269 = false;
         boolean _270 = false;
         boolean _271 = false;
         boolean _272 = false;
         boolean _273 = false;
         boolean _274 = false;
         boolean _275 = false;
         boolean _276 = false;
         boolean _277 = false;
         boolean _278 = false;
         boolean _279 = false;
         boolean _280 = false;
         _281 = false;
         boolean _282 = false;
         boolean _283 = false;
         boolean _284 = false;
         boolean _285 = false;
         boolean _286 = false;
         boolean _287 = false;
         boolean _288 = false;
         boolean _289 = false;
         boolean _iftmp_93_0_i = false;
         _291 = false;
         Memory.createStackFrame();
         int _21 = Memory.load_i32(_argv);
         Memory.store(progname, _21);
         _3 = Instruction.icmp_eq(_21, 0) & true;
         if(!_3) {
            byte _41 = (byte)Memory.load_i8(_21);
            _5 = Instruction.icmp_eq(_41, 0) & true;
            if(!_5) {
               _comment_file_11 = 0;
               _comment_length_11 = 0;
               _comment_arg_11 = 0;
               _keep_COM_11 = 1;
               _argn_11 = 1;
               break label311;
            }
         }

         Memory.store(progname, _str22);
         _comment_file_11 = 0;
         _comment_length_11 = 0;
         _comment_arg_11 = 0;
         _keep_COM_11 = 1;
         _argn_11 = 1;
      }

      int var10001;
      int var10002;
      while(true) {
         _78 = Instruction.icmp_slt(_argn_11, _argc) & true;
         if(!_78) {
            break;
         }

         int _61 = _argv + 4 * _argn_11;
         int _71 = Memory.load_i32(_61);
         byte _81 = (byte)Memory.load_i8(_71);
         _9 = Instruction.icmp_eq(_81, 45) & true;
         if(!_9) {
            break;
         }

         int _101 = _71 + 1;
         int _111 = keymatch(_101, _str23, 1);
         _12 = Instruction.icmp_eq(_111, 0) & true;
         int _comment_file_01;
         int _comment_length_01;
         int _comment_arg_01;
         byte _keep_COM_01;
         int _argn_01;
         if(!_12) {
            _comment_file_01 = _comment_file_11;
            _comment_length_01 = _comment_length_11;
            _comment_arg_01 = _comment_arg_11;
            _keep_COM_01 = 0;
            _argn_01 = _argn_11;
         } else {
            int _131 = keymatch(_101, _str24, 2);
            _14 = Instruction.icmp_eq(_131, 0) & true;
            if(!_14) {
               int _151 = _argn_11 + 1;
               _16 = Instruction.icmp_slt(_151, _argc) & true;
               if(!_16) {
                  usage();
               }

               int _171 = _argv + 4 * _151;
               int _181 = Memory.load_i32(_171);
               int _191 = c.fopen(_181, _str25);
               _20 = Instruction.icmp_eq(_191, 0) & true;
               if(_20) {
                  int _211 = Memory.load_i32(_171);
                  int _221 = Memory.load_i32(progname);
                  int _231 = c.__getreent();
                  int _241 = _231 + 12;
                  int _251 = Memory.load_i32(_241);
                  var10001 = _str26;
                  var10002 = Memory.allocateStack(8);
                  Memory.pack(Memory.pack(var10002, _221), _211);
                  c.fprintf(_251, var10001, var10002);
                  c.exit(1);
                  throw Unreachable.instance;
               }

               _comment_file_01 = _191;
               _comment_length_01 = _comment_length_11;
               _comment_arg_01 = _comment_arg_11;
               _keep_COM_01 = _keep_COM_11;
               _argn_01 = _151;
            } else {
               int _271 = keymatch(_101, _str27, 1);
               _28 = Instruction.icmp_eq(_271, 0) & true;
               if(!_28) {
                  int _291 = _argn_11 + 1;
                  _30 = Instruction.icmp_slt(_291, _argc) & true;
                  if(!_30) {
                     usage();
                  }

                  int _311 = _argv + 4 * _291;
                  int _321 = Memory.load_i32(_311);
                  byte _331 = (byte)Memory.load_i8(_321);
                  _34 = Instruction.icmp_eq(_331, 34) & true;
                  int _comment_arg_21;
                  int _argn_31;
                  if(!_34) {
                     _comment_arg_21 = _321;
                     _argn_31 = _291;
                  } else {
                     int _351 = c.malloc('\ufde8' * 1);
                     int __sub1 = _351;
                     _37 = Instruction.icmp_eq(_351, 0) & true;
                     if(_37) {
                        int _381 = c.__getreent();
                        int _391 = _381 + 12;
                        int _401 = Memory.load_i32(_391);
                        var10001 = _str15;
                        var10002 = Memory.allocateStack(4);
                        Memory.pack(var10002, _str28);
                        c.fprintf(_401, var10001, var10002);
                        c.exit(1);
                        throw Unreachable.instance;
                     }

                     int _421 = _321 + 1;
                     int _431 = c.strcpy(_351, _421);
                     int _tmp1201 = _argn_11 + 2;
                     int _indvar1171 = 0;

                     while(true) {
                        int _argn_21 = _indvar1171 + _291;
                        int _tmp1211 = _indvar1171 + _tmp1201;
                        int _scevgep1221 = _argv + 4 * _tmp1211;
                        int _491 = c.strlen(__sub1);
                        _50 = Instruction.icmp_eq(_491, 0) & true;
                        if(!_50) {
                           int _511 = _491 + -1;
                           int _521 = _351 + 1 * _511;
                           byte _531 = (byte)Memory.load_i8(_521);
                           _54 = Instruction.icmp_eq(_531, 34) & true;
                           if(_54) {
                              Memory.store(_521, (byte)0);
                              _comment_arg_21 = __sub1;
                              _argn_31 = _argn_21;
                              break;
                           }
                        }

                        _55 = Instruction.icmp_slt(_tmp1211, _argc) & true;
                        if(!_55) {
                           int _561 = c.__getreent();
                           int _571 = _561 + 12;
                           int _581 = Memory.load_i32(_571);
                           var10001 = _str15;
                           var10002 = Memory.allocateStack(4);
                           Memory.pack(var10002, _str29);
                           c.fprintf(_581, var10001, var10002);
                           c.exit(1);
                           throw Unreachable.instance;
                        }

                        int _601 = c.strcat(__sub1, _str30);
                        int _611 = Memory.load_i32(_scevgep1221);
                        c.strcat(__sub1, _611);
                        int _indvar_next1181 = _indvar1171 + 1;
                        _indvar1171 = _indvar_next1181;
                     }
                  }

                  int _661 = c.strlen(_comment_arg_21);
                  _comment_file_01 = _comment_file_11;
                  _comment_length_01 = _661;
                  _comment_arg_01 = _comment_arg_21;
                  _keep_COM_01 = _keep_COM_11;
                  _argn_01 = _argn_31;
               } else {
                  usage();
                  _comment_file_01 = _comment_file_11;
                  _comment_length_01 = _comment_length_11;
                  _comment_arg_01 = _comment_arg_11;
                  _keep_COM_01 = _keep_COM_11;
                  _argn_01 = _argn_11;
               }
            }
         }

         int _721 = _argn_01 + 1;
         _comment_file_11 = _comment_file_01;
         _comment_length_11 = _comment_length_01;
         _comment_arg_11 = _comment_arg_01;
         _keep_COM_11 = _keep_COM_01;
         _argn_11 = _721;
      }

      _79 = Instruction.icmp_ne(_comment_arg_11, 0) & true;
      _80 = Instruction.icmp_ne(_comment_file_11, 0) & true;
      _81 = _79 & _80 & true;
      if(_81) {
         usage();
      }

      int _841 = _comment_arg_11 | _comment_file_11;
      _86 = Instruction.icmp_eq(_841, 0) & true;
      _87 = Instruction.icmp_sge(_argn_11, _argc) & true;
      _88 = _86 & _87 & true;
      if(_88) {
         usage();
      }

      if(!_78) {
         int _991 = c.__getreent();
         int _1001 = _991 + 4;
         int _1011 = Memory.load_i32(_1001);
         Memory.store(infile, _1011);
      } else {
         int _891 = _argv + 4 * _argn_11;
         int _901 = Memory.load_i32(_891);
         int _911 = c.fopen(_901, _str25);
         Memory.store(infile, _911);
         _92 = Instruction.icmp_eq(_911, 0) & true;
         if(_92) {
            int _931 = Memory.load_i32(_891);
            int _941 = Memory.load_i32(progname);
            int _951 = c.__getreent();
            int _961 = _951 + 12;
            int _971 = Memory.load_i32(_961);
            var10001 = _str26;
            var10002 = Memory.allocateStack(8);
            Memory.pack(Memory.pack(var10002, _941), _931);
            c.fprintf(_971, var10001, var10002);
            c.exit(1);
            throw Unreachable.instance;
         }
      }

      int _1021 = _argc + -1;
      _103 = Instruction.icmp_sgt(_1021, _argn_11) & true;
      if(_103) {
         int _1041 = Memory.load_i32(progname);
         int _1051 = c.__getreent();
         int _1061 = _1051 + 12;
         int _1071 = Memory.load_i32(_1061);
         var10001 = _str31;
         var10002 = Memory.allocateStack(4);
         Memory.pack(var10002, _1041);
         c.fprintf(_1071, var10001, var10002);
         usage();
      }

      int _1091 = c.__getreent();
      int _1101 = _1091 + 8;
      int _1111 = Memory.load_i32(_1101);
      Memory.store(outfile, _1111);
      _112 = Instruction.icmp_eq(_comment_arg_11, 0) & true;
      int _comment_length_21;
      int _comment_arg_31;
      if(!_112) {
         _comment_length_21 = _comment_length_11;
         _comment_arg_31 = _comment_arg_11;
      } else {
         int _1131 = c.malloc('\ufde8' * 1);
         _115 = Instruction.icmp_eq(_1131, 0) & true;
         if(_115) {
            int _1161 = c.__getreent();
            int _1171 = _1161 + 12;
            int _1181 = Memory.load_i32(_1171);
            var10001 = _str15;
            var10002 = Memory.allocateStack(4);
            Memory.pack(var10002, _str28);
            c.fprintf(_1181, var10001, var10002);
            c.exit(1);
            throw Unreachable.instance;
         }

         _120 = Instruction.icmp_eq(_comment_file_11, 0) & true;
         int _iftmp_116_01;
         if(!_120) {
            _iftmp_116_01 = _comment_file_11;
         } else {
            int _1211 = c.__getreent();
            int _1221 = _1211 + 4;
            int _1231 = Memory.load_i32(_1221);
            _iftmp_116_01 = _1231;
         }

         int _1251 = _iftmp_116_01 + 4;
         int _1261 = _iftmp_116_01 + 0;
         int _1341 = 0;

         while(true) {
            int _scevgep1 = _1131 + 1 * _1341;
            int _1361 = Memory.load_i32(_1251);
            int _1371 = _1361 + -1;
            Memory.store(_1251, _1371);
            _138 = Instruction.icmp_slt(_1371, 0) & true;
            int _iftmp_117_01;
            if(!_138) {
               int _1411 = Memory.load_i32(_1261);
               byte _1421 = (byte)Memory.load_i8(_1411);
               int _1431 = Instruction.zext_i32(_1421);
               int _1441 = _1411 + 1;
               Memory.store(_1261, _1441);
               _iftmp_117_01 = _1431;
            } else {
               int _1391 = c.__getreent();
               int _1401 = c.__srget_r(_1391, _iftmp_116_01);
               _iftmp_117_01 = _1401;
            }

            _146 = Instruction.icmp_eq(_iftmp_117_01, -1) & true;
            if(_146) {
               if(!_120) {
                  int _1471 = c.fclose(_comment_file_11);
                  _comment_length_21 = _1341;
                  _comment_arg_31 = _1131;
               } else {
                  _comment_length_21 = _1341;
                  _comment_arg_31 = _1131;
               }
               break;
            }

            _127 = Instruction.icmp_ugt(_1341, '\ufde7') & true;
            if(_127) {
               int _1281 = c.__getreent();
               int _1291 = _1281 + 12;
               int _1301 = Memory.load_i32(_1291);
               var10001 = _str32;
               var10002 = Memory.allocateStack(4);
               Memory.pack(var10002, '\ufde8');
               c.fprintf(_1301, var10001, var10002);
               c.exit(1);
               throw Unreachable.instance;
            }

            byte _1321 = (byte)((byte)_iftmp_117_01);
            Memory.store(_scevgep1, _1321);
            int _1331 = _1341 + 1;
            _1341 = _1331;
         }
      }

      int _1501 = Memory.load_i32(infile);
      int _1511 = _1501 + 4;
      int _1521 = Memory.load_i32(_1511);
      int _1531 = _1521 + -1;
      Memory.store(_1511, _1531);
      _154 = Instruction.icmp_slt(_1531, 0) & true;
      int _1551 = Memory.load_i32(infile);
      int _iftmp_97_0_i_i1;
      if(!_154) {
         int _1581 = _1551 + 0;
         int _1591 = Memory.load_i32(_1581);
         byte _1601 = (byte)Memory.load_i8(_1591);
         int _1611 = Instruction.zext_i32(_1601);
         int _1621 = _1591 + 1;
         Memory.store(_1581, _1621);
         _iftmp_97_0_i_i1 = _1611;
      } else {
         int _1561 = c.__getreent();
         int _1571 = c.__srget_r(_1561, _1551);
         _iftmp_97_0_i_i1 = _1571;
      }

      int _1641 = Memory.load_i32(infile);
      int _1651 = _1641 + 4;
      int _1661 = Memory.load_i32(_1651);
      int _1671 = _1661 + -1;
      Memory.store(_1651, _1671);
      _168 = Instruction.icmp_slt(_1671, 0) & true;
      int _1691 = Memory.load_i32(infile);
      int _iftmp_101_0_i_i1;
      if(!_168) {
         int _1721 = _1691 + 0;
         int _1731 = Memory.load_i32(_1721);
         byte _1741 = (byte)Memory.load_i8(_1731);
         int _1751 = Instruction.zext_i32(_1741);
         int _1761 = _1731 + 1;
         Memory.store(_1721, _1761);
         _iftmp_101_0_i_i1 = _1751;
      } else {
         int _1701 = c.__getreent();
         int _1711 = c.__srget_r(_1701, _1691);
         _iftmp_101_0_i_i1 = _1711;
      }

      _178 = Instruction.icmp_ne(_iftmp_97_0_i_i1, 255) & true;
      _179 = Instruction.icmp_ne(_iftmp_101_0_i_i1, 216) & true;
      _180 = (_179 | _178) & true;
      if(_180) {
         int _1811 = c.__getreent();
         int _1821 = _1811 + 12;
         int _1831 = Memory.load_i32(_1821);
         var10001 = _str15;
         var10002 = Memory.allocateStack(4);
         Memory.pack(var10002, _str16);
         c.fprintf(_1831, var10001, var10002);
         c.exit(1);
         throw Unreachable.instance;
      } else {
         _185 = Instruction.icmp_eq(_iftmp_101_0_i_i1, 216) & true;
         if(!_185) {
            int _1861 = c.__getreent();
            int _1871 = _1861 + 12;
            int _1881 = Memory.load_i32(_1871);
            var10001 = _str15;
            var10002 = Memory.allocateStack(4);
            Memory.pack(var10002, _str20);
            c.fprintf(_1881, var10001, var10002);
            c.exit(1);
            throw Unreachable.instance;
         } else {
            write_marker(216);
            _190 = Instruction.icmp_eq(_keep_COM_11, 0) & true;

            int _1981;
            label269:
            while(true) {
               int _1911 = read_1_byte();
               _192 = Instruction.icmp_eq(_1911, 255) & true;
               int _discarded_bytes_0_lcssa_i_i1;
               if(_192) {
                  _discarded_bytes_0_lcssa_i_i1 = 0;
               } else {
                  int _discarded_bytes_07_i_i1 = 0;

                  while(true) {
                     int _tmp_i_i1 = _discarded_bytes_07_i_i1 + 1;
                     int _1951 = read_1_byte();
                     _phitmp_i_i = Instruction.icmp_eq(_1951, 255) & true;
                     if(_phitmp_i_i) {
                        _discarded_bytes_0_lcssa_i_i1 = _tmp_i_i1;
                        break;
                     }

                     _discarded_bytes_07_i_i1 = _tmp_i_i1;
                  }
               }

               do {
                  _1981 = read_1_byte();
                  _199 = Instruction.icmp_eq(_1981, 255) & true;
               } while(_199);

               _200 = Instruction.icmp_eq(_discarded_bytes_0_lcssa_i_i1, 0) & true;
               if(!_200) {
                  int _2011 = c.__getreent();
                  int _2021 = _2011 + 12;
                  int _2031 = Memory.load_i32(_2021);
                  int _2041 = c.fprintf(_2031, _str18, Memory.allocateStack(0));
               }

               _Pivot25 = Instruction.icmp_slt(_1981, 205) & true;
               if(!_Pivot25) {
                  _Pivot23 = Instruction.icmp_slt(_1981, 218) & true;
                  if(!_Pivot23) {
                     _Pivot21 = Instruction.icmp_slt(_1981, 254) & true;
                     if(!_Pivot21) {
                        _SwitchLeaf19 = Instruction.icmp_eq(_1981, 254) & true;
                        if(_SwitchLeaf19) {
                           if(!_190) {
                              write_marker(_1981);
                              copy_variable();
                              continue;
                           }

                           int _2261 = read_2_bytes();
                           _227 = Instruction.icmp_ugt(_2261, 1) & true;
                           if(!_227) {
                              int _2281 = c.__getreent();
                              int _2291 = _2281 + 12;
                              int _2301 = Memory.load_i32(_2291);
                              var10001 = _str15;
                              var10002 = Memory.allocateStack(4);
                              Memory.pack(var10002, _str19);
                              c.fprintf(_2301, var10001, var10002);
                              c.exit(1);
                              throw Unreachable.instance;
                           }

                           _232 = Instruction.icmp_eq(_2261, 2) & true;
                           if(_232) {
                              continue;
                           }

                           int _tmp_i19_i1 = _2261 + -2;
                           int _indvar_i_i1 = 0;

                           while(true) {
                              int _2351 = read_1_byte();
                              int _indvar_next_i_i1 = _indvar_i_i1 + 1;
                              _exitcond110 = Instruction.icmp_eq(_indvar_next_i_i1, _tmp_i19_i1) & true;
                              if(_exitcond110) {
                                 continue label269;
                              }

                              _indvar_i_i1 = _indvar_next_i_i1;
                           }
                        }
                     } else {
                        _SwitchLeaf17 = Instruction.icmp_eq(_1981, 218) & true;
                        if(_SwitchLeaf17) {
                           int _2221 = c.__getreent();
                           int _2231 = _2221 + 12;
                           int _2241 = Memory.load_i32(_2231);
                           var10001 = _str15;
                           var10002 = Memory.allocateStack(4);
                           Memory.pack(var10002, _str21);
                           c.fprintf(_2241, var10001, var10002);
                           c.exit(1);
                           throw Unreachable.instance;
                        }
                     }
                  } else {
                     _Pivot15 = Instruction.icmp_slt(_1981, 217) & true;
                     if(!_Pivot15) {
                        _SwitchLeaf13 = Instruction.icmp_eq(_1981, 217) & true;
                        if(_SwitchLeaf13) {
                           break;
                        }
                     } else {
                        int __off101 = _1981 + -205;
                        _SwitchLeaf11 = Instruction.icmp_ule(__off101, 2) & true;
                        if(_SwitchLeaf11) {
                           break;
                        }
                     }
                  }
               } else {
                  _Pivot8 = Instruction.icmp_slt(_1981, 197) & true;
                  if(!_Pivot8) {
                     _Pivot = Instruction.icmp_slt(_1981, 201) & true;
                     if(!_Pivot) {
                        int __off51 = _1981 + -201;
                        _SwitchLeaf6 = Instruction.icmp_ule(__off51, 2) & true;
                        if(_SwitchLeaf6) {
                           break;
                        }
                     } else {
                        int __off21 = _1981 + -197;
                        _SwitchLeaf3 = Instruction.icmp_ule(__off21, 2) & true;
                        if(_SwitchLeaf3) {
                           break;
                        }
                     }
                  } else {
                     int __off1 = _1981 + -192;
                     _SwitchLeaf = Instruction.icmp_ule(__off1, 3) & true;
                     if(_SwitchLeaf) {
                        break;
                     }
                  }
               }

               write_marker(_1981);
               copy_variable();
            }

            _238 = Instruction.icmp_eq(_comment_length_21, 0) & true;
            if(!_238) {
               write_marker(254);
               int _2391 = _comment_length_21 + 2;
               write_2_bytes(_2391);
               int _indvar1 = 0;

               while(true) {
                  int _comment_arg_4871 = _comment_arg_31 + 1 * _indvar1;
                  byte _2421 = (byte)Memory.load_i8(_comment_arg_4871);
                  byte _2431 = (byte)_2421;
                  write_1_byte(_2431);
                  int _indvar_next1 = _indvar1 + 1;
                  _exitcond = Instruction.icmp_eq(_indvar_next1, _comment_length_21) & true;
                  if(_exitcond) {
                     break;
                  }

                  _indvar1 = _indvar_next1;
               }
            }

            write_marker(_1981);

            while(true) {
               int _2771 = Memory.load_i32(infile);
               int _2781 = _2771 + 4;
               int _2791 = Memory.load_i32(_2781);
               int _2801 = _2791 + -1;
               Memory.store(_2781, _2801);
               _281 = Instruction.icmp_slt(_2801, 0) & true;
               int _2821 = Memory.load_i32(infile);
               int _iftmp_93_0_i1;
               if(!_281) {
                  int _2851 = _2821 + 0;
                  int _2861 = Memory.load_i32(_2851);
                  byte _2871 = (byte)Memory.load_i8(_2861);
                  int _2881 = Instruction.zext_i32(_2871);
                  int _2891 = _2861 + 1;
                  Memory.store(_2851, _2891);
                  _iftmp_93_0_i1 = _2881;
               } else {
                  int _2831 = c.__getreent();
                  int _2841 = c.__srget_r(_2831, _2821);
                  _iftmp_93_0_i1 = _2841;
               }

               _291 = Instruction.icmp_eq(_iftmp_93_0_i1, -1) & true;
               if(_291) {
                  c.exit(0);
                  throw Unreachable.instance;
               }

               int _2461 = Memory.load_i32(outfile);
               int _2471 = _2461 + 8;
               int _2481 = Memory.load_i32(_2471);
               int _2491 = _2481 + -1;
               Memory.store(_2471, _2491);
               _250 = Instruction.icmp_slt(_2491, 0) & true;
               int _2511 = Memory.load_i32(outfile);
               if(!_250) {
                  int _2701 = _2511 + 0;
                  int _2711 = Memory.load_i32(_2701);
                  byte _2721 = (byte)((byte)_iftmp_93_0_i1);
                  Memory.store(_2711, _2721);
                  int _2731 = Memory.load_i32(outfile);
                  int _2741 = _2731 + 0;
                  int _2751 = Memory.load_i32(_2741);
                  int _2761 = _2751 + 1;
                  Memory.store(_2741, _2761);
               } else {
                  int _2521 = _2511 + 8;
                  int _2531 = Memory.load_i32(_2521);
                  int _2541 = _2511 + 24;
                  int _2551 = Memory.load_i32(_2541);
                  _256 = Instruction.icmp_slt(_2531, _2551) & true;
                  if(!_256) {
                     int _2571 = _2511 + 0;
                     int _2581 = Memory.load_i32(_2571);
                     byte _2591 = (byte)((byte)_iftmp_93_0_i1);
                     Memory.store(_2581, _2591);
                     int _2601 = Memory.load_i32(outfile);
                     int _2611 = _2601 + 0;
                     int _2621 = Memory.load_i32(_2611);
                     byte _2631 = (byte)Memory.load_i8(_2621);
                     _264 = Instruction.icmp_eq(_2631, 10) & true;
                     if(!_264) {
                        int _2651 = _2621 + 1;
                        Memory.store(_2611, _2651);
                     } else {
                        int _2661 = c.__getreent();
                        c.__swbuf_r(_2661, 10, _2601);
                     }
                  } else {
                     int _2681 = c.__getreent();
                     c.__swbuf_r(_2681, _iftmp_93_0_i1, _2511);
                  }
               }
            }
         }
      }
   }

   private static int keymatch(int _arg, int _keyword, int _minchars) {
      boolean _3 = false;
      boolean _keyword_addr_0 = false;
      boolean _5 = false;
      boolean _6 = false;
      boolean _7 = false;
      boolean _8 = false;
      boolean _9 = false;
      boolean _10 = false;
      boolean _11 = false;
      boolean _12 = false;
      boolean _13 = false;
      boolean _toBool3 = false;
      boolean __ = false;
      boolean _ca_0 = false;
      boolean _17 = false;
      boolean _18 = false;
      boolean _19 = false;
      boolean _arg_addr_0 = false;
      boolean _21 = false;
      boolean _22 = false;
      boolean _23 = false;
      boolean _not_ = false;
      boolean _retval = false;
      Memory.createStackFrame();
      int _31 = Memory.load_i32(c.__ctype_ptr__);
      int _191 = 0;

      while(true) {
         int _arg_addr_01 = _arg + 1 * _191;
         byte _211 = (byte)Memory.load_i8(_arg_addr_01);
         byte _221 = (byte)_211;
         _23 = Instruction.icmp_eq(_211, 0) & true;
         if(_23) {
            _not_ = Instruction.icmp_sge(_191, _minchars) & true;
            int _retval1 = Instruction.zext_i32(_not_);
            Memory.destroyStackFrame();
            return _retval1;
         }

         int _keyword_addr_01 = _keyword + 1 * _191;
         byte _51 = (byte)Memory.load_i8(_keyword_addr_01);
         byte _61 = (byte)_51;
         _7 = Instruction.icmp_eq(_51, 0) & true;
         if(_7) {
            break;
         }

         int _81 = _221 + 1;
         int _91 = _31 + 1 * _81;
         byte _101 = (byte)Memory.load_i8(_91);
         int _111 = Instruction.zext_i32(_101);
         int _121 = _111 & 1;
         int _131 = _221 + 32;
         _toBool3 = Instruction.icmp_eq(_121, 0) & true;
         int __1 = _toBool3?_221:_131;
         int _ca_01 = _toBool3?__1:__1;
         _17 = Instruction.icmp_eq(__1, _61) & true;
         if(!_17) {
            break;
         }

         int _181 = _191 + 1;
         _191 = _181;
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
      Memory.createStackFrame();
      int _01 = c.__getreent();
      int _11 = _01 + 12;
      int _21 = Memory.load_i32(_11);
      int _31 = c.fprintf(_21, _str, Memory.allocateStack(0));
      int _41 = c.__getreent();
      int _51 = _41 + 12;
      int _61 = Memory.load_i32(_51);
      int _71 = c.fprintf(_61, _str1, Memory.allocateStack(0));
      int _81 = Memory.load_i32(progname);
      int _91 = c.__getreent();
      int _101 = _91 + 12;
      int _111 = Memory.load_i32(_101);
      int var10001 = _str2;
      int var10002 = Memory.allocateStack(4);
      Memory.pack(var10002, _81);
      c.fprintf(_111, var10001, var10002);
      int _131 = c.__getreent();
      int _141 = _131 + 12;
      int _151 = Memory.load_i32(_141);
      int _161 = c.fprintf(_151, _str3, Memory.allocateStack(0));
      int _171 = c.__getreent();
      int _181 = _171 + 12;
      int _191 = Memory.load_i32(_181);
      int _201 = c.fprintf(_191, _str4, Memory.allocateStack(0));
      int _211 = c.__getreent();
      int _221 = _211 + 12;
      int _231 = Memory.load_i32(_221);
      int _241 = c.fprintf(_231, _str5, Memory.allocateStack(0));
      int _251 = c.__getreent();
      int _261 = _251 + 12;
      int _271 = Memory.load_i32(_261);
      int _281 = c.fprintf(_271, _str6, Memory.allocateStack(0));
      int _291 = c.__getreent();
      int _301 = _291 + 12;
      int _311 = Memory.load_i32(_301);
      int _321 = c.fprintf(_311, _str7, Memory.allocateStack(0));
      int _331 = c.__getreent();
      int _341 = _331 + 12;
      int _351 = Memory.load_i32(_341);
      int _361 = c.fprintf(_351, _str8, Memory.allocateStack(0));
      int _371 = c.__getreent();
      int _381 = _371 + 12;
      int _391 = Memory.load_i32(_381);
      int _401 = c.fprintf(_391, _str9, Memory.allocateStack(0));
      int _411 = c.__getreent();
      int _421 = _411 + 12;
      int _431 = Memory.load_i32(_421);
      int _441 = c.fprintf(_431, _str10, Memory.allocateStack(0));
      int _451 = c.__getreent();
      int _461 = _451 + 12;
      int _471 = Memory.load_i32(_461);
      int _481 = c.fprintf(_471, _str11, Memory.allocateStack(0));
      int _491 = c.__getreent();
      int _501 = _491 + 12;
      int _511 = Memory.load_i32(_501);
      var10001 = _str12;
      var10002 = Memory.allocateStack(4);
      Memory.pack(var10002, '\ufde8');
      c.fprintf(_511, var10001, var10002);
      int _531 = c.__getreent();
      int _541 = _531 + 12;
      int _551 = Memory.load_i32(_541);
      int _561 = c.fprintf(_551, _str13, Memory.allocateStack(0));
      int _571 = c.__getreent();
      int _581 = _571 + 12;
      int _591 = Memory.load_i32(_581);
      int _601 = c.fprintf(_591, _str14, Memory.allocateStack(0));
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
         int var10001 = _str15;
         int var10002 = Memory.allocateStack(4);
         Memory.pack(var10002, _str17);
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
            var10001 = _str15;
            var10002 = Memory.allocateStack(4);
            Memory.pack(var10002, _str17);
            c.fprintf(_361, var10001, var10002);
            c.exit(1);
            throw Unreachable.instance;
         }
      } else {
         int _151 = c.__getreent();
         int _161 = _151 + 12;
         int _171 = Memory.load_i32(_161);
         var10001 = _str15;
         var10002 = Memory.allocateStack(4);
         Memory.pack(var10002, _str17);
         c.fprintf(_171, var10001, var10002);
         c.exit(1);
         throw Unreachable.instance;
      }
   }

   private static void write_2_bytes(int _val) {
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
      boolean _64 = false;
      boolean _65 = false;
      boolean _66 = false;
      boolean _67 = false;
      Memory.createStackFrame();
      int _11 = Memory.load_i32(outfile);
      int _21 = _11 + 8;
      int _31 = Memory.load_i32(_21);
      int _41 = _31 + -1;
      Memory.store(_21, _41);
      _5 = Instruction.icmp_slt(_41, 0) & true;
      int _61 = Memory.load_i32(outfile);
      if(!_5) {
         int _281 = _61 + 0;
         int _291 = Memory.load_i32(_281);
         int _301 = _val >>> 8;
         byte _311 = (byte)((byte)_301);
         Memory.store(_291, _311);
         int _321 = Memory.load_i32(outfile);
         int _331 = _321 + 0;
         int _341 = Memory.load_i32(_331);
         int _351 = _341 + 1;
         Memory.store(_331, _351);
      } else {
         int _71 = _61 + 8;
         int _81 = Memory.load_i32(_71);
         int _91 = _61 + 24;
         int _101 = Memory.load_i32(_91);
         _11 = Instruction.icmp_slt(_81, _101) & true;
         if(!_11) {
            int _121 = _61 + 0;
            int _131 = Memory.load_i32(_121);
            int _141 = _val >>> 8;
            byte _151 = (byte)((byte)_141);
            Memory.store(_131, _151);
            int _161 = Memory.load_i32(outfile);
            int _171 = _161 + 0;
            int _181 = Memory.load_i32(_171);
            byte _191 = (byte)Memory.load_i8(_181);
            _20 = Instruction.icmp_eq(_191, 10) & true;
            if(!_20) {
               int _211 = _181 + 1;
               Memory.store(_171, _211);
            } else {
               int _221 = c.__getreent();
               c.__swbuf_r(_221, 10, _161);
            }
         } else {
            int _241 = _val >>> 8;
            int _251 = _241 & 255;
            int _261 = c.__getreent();
            c.__swbuf_r(_261, _251, _61);
         }
      }

      int _361 = Memory.load_i32(outfile);
      int _371 = _361 + 8;
      int _381 = Memory.load_i32(_371);
      int _391 = _381 + -1;
      Memory.store(_371, _391);
      _40 = Instruction.icmp_slt(_391, 0) & true;
      int _411 = Memory.load_i32(outfile);
      if(!_40) {
         int _611 = _411 + 0;
         int _621 = Memory.load_i32(_611);
         byte _631 = (byte)((byte)_val);
         Memory.store(_621, _631);
         int _641 = Memory.load_i32(outfile);
         int _651 = _641 + 0;
         int _661 = Memory.load_i32(_651);
         int _671 = _661 + 1;
         Memory.store(_651, _671);
         Memory.destroyStackFrame();
      } else {
         int _421 = _411 + 8;
         int _431 = Memory.load_i32(_421);
         int _441 = _411 + 24;
         int _451 = Memory.load_i32(_441);
         _46 = Instruction.icmp_slt(_431, _451) & true;
         if(!_46) {
            int _471 = _411 + 0;
            int _481 = Memory.load_i32(_471);
            byte _491 = (byte)((byte)_val);
            Memory.store(_481, _491);
            int _501 = Memory.load_i32(outfile);
            int _511 = _501 + 0;
            int _521 = Memory.load_i32(_511);
            byte _531 = (byte)Memory.load_i8(_521);
            _54 = Instruction.icmp_eq(_531, 10) & true;
            if(!_54) {
               int _551 = _521 + 1;
               Memory.store(_511, _551);
               Memory.destroyStackFrame();
            } else {
               int _561 = c.__getreent();
               c.__swbuf_r(_561, 10, _501);
               Memory.destroyStackFrame();
            }
         } else {
            int _581 = _val & 255;
            int _591 = c.__getreent();
            c.__swbuf_r(_591, _581, _411);
            Memory.destroyStackFrame();
         }
      }
   }

   private static void write_1_byte(int _c) {
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
      Memory.createStackFrame();
      int _11 = Memory.load_i32(outfile);
      int _21 = _11 + 8;
      int _31 = Memory.load_i32(_21);
      int _41 = _31 + -1;
      Memory.store(_21, _41);
      _5 = Instruction.icmp_slt(_41, 0) & true;
      int _61 = Memory.load_i32(outfile);
      if(!_5) {
         int _251 = _61 + 0;
         int _261 = Memory.load_i32(_251);
         byte _271 = (byte)((byte)_c);
         Memory.store(_261, _271);
         int _281 = Memory.load_i32(outfile);
         int _291 = _281 + 0;
         int _301 = Memory.load_i32(_291);
         int _311 = _301 + 1;
         Memory.store(_291, _311);
         Memory.destroyStackFrame();
      } else {
         int _71 = _61 + 8;
         int _81 = Memory.load_i32(_71);
         int _91 = _61 + 24;
         int _101 = Memory.load_i32(_91);
         _11 = Instruction.icmp_slt(_81, _101) & true;
         if(!_11) {
            int _121 = _61 + 0;
            int _131 = Memory.load_i32(_121);
            byte _141 = (byte)((byte)_c);
            Memory.store(_131, _141);
            int _151 = Memory.load_i32(outfile);
            int _161 = _151 + 0;
            int _171 = Memory.load_i32(_161);
            byte _181 = (byte)Memory.load_i8(_171);
            _19 = Instruction.icmp_eq(_181, 10) & true;
            if(!_19) {
               int _201 = _171 + 1;
               Memory.store(_161, _201);
               Memory.destroyStackFrame();
            } else {
               int _211 = c.__getreent();
               c.__swbuf_r(_211, 10, _151);
               Memory.destroyStackFrame();
            }
         } else {
            int _231 = c.__getreent();
            c.__swbuf_r(_231, _c, _61);
            Memory.destroyStackFrame();
         }
      }
   }

   private static void copy_variable() {
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
      write_2_bytes(_01);
      _1 = Instruction.icmp_ugt(_01, 1) & true;
      if(!_1) {
         int _21 = c.__getreent();
         int _31 = _21 + 12;
         int _41 = Memory.load_i32(_31);
         int var10001 = _str15;
         int var10002 = Memory.allocateStack(4);
         Memory.pack(var10002, _str19);
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
               write_1_byte(_91);
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

   private static void write_marker(int _marker) {
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
      Memory.createStackFrame();
      int _11 = Memory.load_i32(outfile);
      int _21 = _11 + 8;
      int _31 = Memory.load_i32(_21);
      int _41 = _31 + -1;
      Memory.store(_21, _41);
      _5 = Instruction.icmp_slt(_41, 0) & true;
      int _61 = Memory.load_i32(outfile);
      if(!_5) {
         int _241 = _61 + 0;
         int _251 = Memory.load_i32(_241);
         Memory.store(_251, (byte)-1);
         int _261 = Memory.load_i32(outfile);
         int _271 = _261 + 0;
         int _281 = Memory.load_i32(_271);
         int _291 = _281 + 1;
         Memory.store(_271, _291);
      } else {
         int _71 = _61 + 8;
         int _81 = Memory.load_i32(_71);
         int _91 = _61 + 24;
         int _101 = Memory.load_i32(_91);
         _11 = Instruction.icmp_slt(_81, _101) & true;
         if(!_11) {
            int _121 = _61 + 0;
            int _131 = Memory.load_i32(_121);
            Memory.store(_131, (byte)-1);
            int _141 = Memory.load_i32(outfile);
            int _151 = _141 + 0;
            int _161 = Memory.load_i32(_151);
            byte _171 = (byte)Memory.load_i8(_161);
            _18 = Instruction.icmp_eq(_171, 10) & true;
            if(!_18) {
               int _191 = _161 + 1;
               Memory.store(_151, _191);
            } else {
               int _201 = c.__getreent();
               c.__swbuf_r(_201, 10, _141);
            }
         } else {
            int _221 = c.__getreent();
            c.__swbuf_r(_221, 255, _61);
         }
      }

      int _301 = Memory.load_i32(outfile);
      int _311 = _301 + 8;
      int _321 = Memory.load_i32(_311);
      int _331 = _321 + -1;
      Memory.store(_311, _331);
      _34 = Instruction.icmp_slt(_331, 0) & true;
      int _351 = Memory.load_i32(outfile);
      if(!_34) {
         int _541 = _351 + 0;
         int _551 = Memory.load_i32(_541);
         byte _561 = (byte)((byte)_marker);
         Memory.store(_551, _561);
         int _571 = Memory.load_i32(outfile);
         int _581 = _571 + 0;
         int _591 = Memory.load_i32(_581);
         int _601 = _591 + 1;
         Memory.store(_581, _601);
         Memory.destroyStackFrame();
      } else {
         int _361 = _351 + 8;
         int _371 = Memory.load_i32(_361);
         int _381 = _351 + 24;
         int _391 = Memory.load_i32(_381);
         _40 = Instruction.icmp_slt(_371, _391) & true;
         if(!_40) {
            int _411 = _351 + 0;
            int _421 = Memory.load_i32(_411);
            byte _431 = (byte)((byte)_marker);
            Memory.store(_421, _431);
            int _441 = Memory.load_i32(outfile);
            int _451 = _441 + 0;
            int _461 = Memory.load_i32(_451);
            byte _471 = (byte)Memory.load_i8(_461);
            _48 = Instruction.icmp_eq(_471, 10) & true;
            if(!_48) {
               int _491 = _461 + 1;
               Memory.store(_451, _491);
               Memory.destroyStackFrame();
            } else {
               int _501 = c.__getreent();
               c.__swbuf_r(_501, 10, _441);
               Memory.destroyStackFrame();
            }
         } else {
            int _521 = c.__getreent();
            c.__swbuf_r(_521, _marker, _351);
            Memory.destroyStackFrame();
         }
      }
   }
}
