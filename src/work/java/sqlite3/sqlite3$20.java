package sqlite3;

abstract class sqlite3$20
        extends sqlite3$19
{
    protected sqlite3$20(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final void explainOneScan(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_)
    {
        int _36_ = 0;
        int _37_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        int _temp$3 = 0;
        int _temp$4 = 0;
        int _temp$5 = 0;
        int _temp$6 = 0;
        int _temp$7 = 0;
        int _temp$8 = 0;
        int _temp$9 = 0;
        int _temp$10 = 0;
        int _temp$11 = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 272))) + 268), _30_);
        this._storeInt((_36_ + 264), _31_);
        this._storeInt((_36_ + 260), _32_);
        this._storeInt((_36_ + 256), _33_);
        this._storeInt((_36_ + 252), _34_);
        this._storeInt16((_36_ + 250), _35_);
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_36_ + 268))) + 484))) != 2) {
                break label$0;
            }
            this._storeInt((_36_ + 244), (this._loadInt((this._loadInt((_36_ + 260))))));
            this._storeInt((_36_ + 240), (((this._loadInt((_36_ + 264))) + ((this._loadInt8u(((this._loadInt((_36_ + 260))) + 52))) * 56)) + 8));
            this._storeInt((_36_ + 236), (this._loadInt(((this._loadInt((_36_ + 268))) + 12))));
            this._storeInt((_36_ + 232), (this._loadInt((this._loadInt((_36_ + 268))))));
            this._storeInt((_36_ + 212), (this._loadInt(((this._loadInt((_36_ + 268))) + 552))));
            if (((this._loadInt8u((_36_ + 247))) & 16) != 0) {
                break label$0;
            }
            if (((this._loadInt16u((_36_ + 250))) & 128) != 0) {
                break label$0;
            }
            _35_ = 1;
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_36_ + 260))) + 4))) != 0) {
                    break label$1;
                }
                if (((this._loadInt8u((_36_ + 246))) & 48) != 0) {
                    break label$1;
                }
                _35_ = (((this._loadInt16u((_36_ + 250))) & 3) != 0) ? 1 : 0;
            }
            while (false);
            this._storeInt((_36_ + 208), _35_);
            _34_ = this._loadInt((_36_ + 232));
            _temp$0 = 46112;
            _temp$1 = 46128;
            _temp$2 = (_35_ != 0) ? _temp$0 : _temp$1;
            this._storeInt((_36_ + 192), _temp$2);
            this._storeInt((_36_ + 228), (sqlite3MPrintf(_34_, 22192, (_36_ + 192))));
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt(((this._loadInt((_36_ + 240))) + 16))) == 0) {
                        break label$3;
                    }
                    this._storeInt((_36_ + 164), (this._loadInt8u(((this._loadInt((_36_ + 240))) + 23))));
                    this._storeInt((_36_ + 228), (sqlite3MAppendf((this._loadInt((_36_ + 232))), (this._storeInt((_36_ + 160), (this._loadInt((_36_ + 228))))), 46144, (_36_ + 160))));
                    break label$2;
                }
                while (false);
                this._storeInt((_36_ + 180), (this._loadInt(((this._loadInt((_36_ + 240))) + 4))));
                this._storeInt((_36_ + 228), (sqlite3MAppendf((this._loadInt((_36_ + 232))), (this._storeInt((_36_ + 176), (this._loadInt((_36_ + 228))))), 46160, (_36_ + 176))));
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt(((this._loadInt((_36_ + 240))) + 8))) == 0) {
                    break label$4;
                }
                this._storeInt((_36_ + 148), (this._loadInt(((this._loadInt((_36_ + 240))) + 8))));
                this._storeInt((_36_ + 228), (sqlite3MAppendf((this._loadInt((_36_ + 232))), (this._storeInt((_36_ + 144), (this._loadInt((_36_ + 228))))), 46176, (_36_ + 144))));
            }
            while (false);
            label$5:
            do {
                label$6:
                do {
                    if (((this._loadInt8u((_36_ + 246))) & 15) == 0) {
                        break label$6;
                    }
                    this._storeInt((_36_ + 204), (explainIndexRange((this._loadInt((_36_ + 232))), (this._loadInt((_36_ + 260))), (this._loadInt(((this._loadInt((_36_ + 240))) + 12))))));
                    _34_ = 21392;
                    _temp$3 = 21392;
                    _temp$4 = 41504;
                    _temp$5 = ((_35_ = ((_33_ = this._loadInt((_36_ + 244))) & 536870912) >>> 29) != 0) ? _temp$3 : _temp$4;
                    _32_ = _temp$5;
                    _temp$6 = 46208;
                    _temp$7 = 21392;
                    _temp$8 = (((_33_ & 8388608) >>> 23) != 0) ? _temp$6 : _temp$7;
                    _33_ = _temp$8;
                    _temp$9 = 46192;
                    _temp$10 = 21392;
                    _temp$11 = (_35_ != 0) ? _temp$9 : _temp$10;
                    _31_ = _temp$11;
                    _30_ = this._loadInt((_36_ + 228));
                    _37_ = this._loadInt((_36_ + 232));
                    label$7:
                    do {
                        if (_35_ != 0) {
                            break label$7;
                        }
                        _34_ = this._loadInt((this._loadInt(((this._loadInt((_36_ + 260))) + 16))));
                    }
                    while (false);
                    this._storeInt((_36_ + 36), (this._loadInt((_36_ + 204))));
                    this._storeInt((_36_ + 32), _34_);
                    this._storeInt((_36_ + 28), _32_);
                    this._storeInt((_36_ + 24), _33_);
                    this._storeInt((_36_ + 20), _31_);
                    this._storeInt((_36_ + 228), (sqlite3MAppendf(_37_, (this._storeInt((_36_ + 16), _30_)), 46224, (_36_ + 16))));
                    sqlite3DbFree((this._loadInt((_36_ + 232))), (this._loadInt((_36_ + 204))));
                    break label$5;
                }
                while (false);
                label$8:
                do {
                    label$9:
                    do {
                        if (((this._loadInt8u((_36_ + 245))) & 48) == 0) {
                            break label$9;
                        }
                        this._storeInt((_36_ + 228), (sqlite3MAppendf((this._loadInt((_36_ + 232))), (this._storeInt((_36_ + 112), (this._loadInt((_36_ + 228))))), 46256, (_36_ + 112))));
                        if (((this._loadInt8u((_36_ + 245))) & 16) == 0) {
                            break label$8;
                        }
                        this._storeInt((_36_ + 228), (sqlite3MAppendf((this._loadInt((_36_ + 232))), (this._storeInt((_36_ + 48), (this._loadInt((_36_ + 228))))), 46288, (_36_ + 48))));
                        break label$5;
                    }
                    while (false);
                    if (((this._loadInt8u((_36_ + 247))) & 8) == 0) {
                        break label$5;
                    }
                    _34_ = this._loadInt(((_35_ = this._storeInt((_36_ + 200), (this._loadInt(((this._loadInt((_36_ + 260))) + 16))))) + 20));
                    _33_ = this._loadInt((_36_ + 232));
                    _32_ = this._loadInt((_36_ + 228));
                    this._storeInt((_36_ + 136), (this._loadInt((_35_ + 24))));
                    this._storeInt((_36_ + 132), _34_);
                    this._storeInt((_36_ + 228), (sqlite3MAppendf(_33_, (this._storeInt((_36_ + 128), _32_)), 46368, (_36_ + 128))));
                    break label$5;
                }
                while (false);
                label$10:
                do {
                    if (((this._loadInt((_36_ + 244))) & 3145728) != 3145728) {
                        break label$10;
                    }
                    this._storeInt((_36_ + 228), (sqlite3MAppendf((this._loadInt((_36_ + 232))), (this._storeInt((_36_ + 64), (this._loadInt((_36_ + 228))))), 46304, (_36_ + 64))));
                    break label$5;
                }
                while (false);
                label$11:
                do {
                    if (((this._loadInt8u((_36_ + 246))) & 32) == 0) {
                        break label$11;
                    }
                    this._storeInt((_36_ + 228), (sqlite3MAppendf((this._loadInt((_36_ + 232))), (this._storeInt((_36_ + 80), (this._loadInt((_36_ + 228))))), 46336, (_36_ + 80))));
                    break label$5;
                }
                while (false);
                if (((this._loadInt8u((_36_ + 246))) & 16) == 0) {
                    break label$5;
                }
                this._storeInt((_36_ + 228), (sqlite3MAppendf((this._loadInt((_36_ + 232))), (this._storeInt((_36_ + 96), (this._loadInt((_36_ + 228))))), 46352, (_36_ + 96))));
            }
            while (false);
            label$12:
            do {
                label$13:
                do {
                    if (((this._loadInt16u((_36_ + 250))) & 3) == 0) {
                        break label$13;
                    }
                    this._storeLong((_36_ + 216), 1L);
                    break label$12;
                }
                while (false);
                this._storeLong((_36_ + 216), (_truncateDoubleToSignedLong((this._loadDouble(((this._loadInt((_36_ + 260))) + 8))))));
            }
            while (false);
            this._storeLong((_36_ + 8), (this._loadLong((_36_ + 216))));
            _35_ = this._storeInt((_36_ + 228), (sqlite3MAppendf((this._loadInt((_36_ + 232))), (this._storeInt(_36_, (this._loadInt((_36_ + 228))))), 46400, _36_)));
            sqlite3VdbeAddOp4((this._loadInt((_36_ + 236))), 138, (this._loadInt((_36_ + 212))), (this._loadInt((_36_ + 256))), (this._loadInt((_36_ + 252))), _35_, -1);
        }
        while (false);
        this._storeInt((0 + 4), (_36_ + 272));
        return;
    }

    @Override()
    public final long codeOneLoopStart(int _30_, int _31_, int _32_, long _33_)
    {
        int _34_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        int _temp$3 = 0;
        int _temp$4 = 0;
        int _temp$5 = 0;
        int _temp$6 = 0;
        int _temp$7 = 0;
        int _temp$8 = 0;
        int _temp$9 = 0;
        int _temp$10 = 0;
        int _temp$11 = 0;
        int _temp$12 = 0;
        int _temp$13 = 0;
        int _temp$14 = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 304))) + 292), _30_);
        this._storeInt((_34_ + 288), _31_);
        this._storeInt16((_34_ + 286), _32_);
        this._storeLong((_34_ + 272), _33_);
        _32_ = 0;
        this._storeInt((_34_ + 208), (this._storeInt((_34_ + 212), 0)));
        this._storeInt((_34_ + 228), (this._loadInt(((this._storeInt((_34_ + 232), (this._loadInt((this._loadInt((_34_ + 292))))))) + 12))));
        this._storeInt((_34_ + 240), (this._loadInt(((this._loadInt((_34_ + 292))) + 28))));
        this._storeInt((_34_ + 244), ((_31_ = (this._loadInt((_34_ + 292))) + ((this._loadInt((_34_ + 288))) * 80)) + 48));
        this._storeInt((_34_ + 224), (((this._loadInt(((this._loadInt((_34_ + 292))) + 8))) + ((this._loadInt8u((_31_ + 100))) * 56)) + 8));
        this._storeInt((_34_ + 260), (this._loadInt(((this._loadInt((_34_ + 224))) + 24))));
        this._storeInt((_34_ + 248), (((this._loadInt((this._loadInt((_34_ + 244))))) & 33554432) >>> 25));
        label$0:
        do {
            if (((this._loadInt8u(((this._loadInt((_34_ + 244))) + 2))) & 128) == 0) {
                break label$0;
            }
            _32_ = (((this._loadInt16u((_34_ + 286))) & 64) == 0) ? 1 : 0;
        }
        while (false);
        this._storeInt((_34_ + 252), _32_);
        _32_ = sqlite3VdbeMakeLabel((this._loadInt((_34_ + 228))));
        this._storeInt((_34_ + 220), (this._storeInt(((_31_ = this._loadInt((_34_ + 244))) + 40), (this._storeInt((_31_ + 36), _32_)))));
        _32_ = sqlite3VdbeMakeLabel((this._loadInt((_34_ + 228))));
        this._storeInt((_34_ + 216), (this._storeInt(((this._loadInt((_34_ + 244))) + 44), _32_)));
        label$1:
        do {
            if ((this._loadInt8u(((this._loadInt((_34_ + 244))) + 52))) < 1) {
                break label$1;
            }
            if (((this._loadInt8u(((this._loadInt((_34_ + 224))) + 21))) & 8) == 0) {
                break label$1;
            }
            _32_ = this._storeInt(((_32_ = this._loadInt((_34_ + 232))) + 72), ((this._loadInt((_32_ + 72))) + 1));
            this._storeInt(((this._loadInt((_34_ + 244))) + 24), _32_);
            sqlite3VdbeAddOp2((this._loadInt((_34_ + 228))), 7, 0, _32_);
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                label$4:
                do {
                    label$5:
                    do {
                        label$6:
                        do {
                            if (((this._loadInt8u(((this._loadInt((_34_ + 244))) + 3))) & 8) == 0) {
                                break label$6;
                            }
                            this._storeInt((_34_ + 196), (this._loadInt((this._storeInt((_34_ + 200), (this._loadInt(((this._loadInt((_34_ + 244))) + 16))))))));
                            this._storeInt((_34_ + 192), (this._loadInt(((this._loadInt((_34_ + 200))) + 16))));
                            this._storeInt((_34_ + 188), (this._loadInt(((this._loadInt((_34_ + 200))) + 4))));
                            sqlite3ExprCachePush((this._loadInt((_34_ + 232))));
                            this._storeInt((_34_ + 204), (sqlite3GetTempRange((this._loadInt((_34_ + 232))), ((this._loadInt((_34_ + 196))) + 2))));
                            _32_ = this._storeInt((_34_ + 268), 1);
                            label$8:
                            do {
                                label$7:
                                while (true) {
                                    if ((this._loadInt((_34_ + 268))) > (this._loadInt((_34_ + 196)))) {
                                        break label$8;
                                    }
                                    this._storeInt((_34_ + 264), 0);
                                    label$9:
                                    do {
                                        label$11:
                                        do {
                                            label$10:
                                            while (true) {
                                                if ((this._loadInt((_34_ + 264))) >= (this._loadInt((_34_ + 196)))) {
                                                    break label$9;
                                                }
                                                if ((this._loadInt(((this._loadInt((_34_ + 192))) + ((this._loadInt((_34_ + 264))) << 3)))) == (this._loadInt((_34_ + 268)))) {
                                                    break label$11;
                                                }
                                                this._storeInt((_34_ + 264), ((this._loadInt((_34_ + 264))) + _32_));
                                                continue label$10;
                                            }
                                        }
                                        while (false);
                                        _31_ = this._storeInt((_34_ + 184), (this._loadInt((((this._loadInt((_34_ + 188))) + ((this._loadInt((_34_ + 264))) * 12)) + 8))));
                                        sqlite3ExprCode((this._loadInt((_34_ + 232))), (this._loadInt(((this._loadInt(((this._loadInt(((this._loadInt((_34_ + 240))) + 28))) + (_31_ * 40)))) + 12))), (((this._loadInt((_34_ + 204))) + (this._loadInt((_34_ + 268)))) + _32_));
                                    }
                                    while (false);
                                    if ((this._loadInt((_34_ + 264))) == (this._loadInt((_34_ + 196)))) {
                                        break label$8;
                                    }
                                    this._storeInt((_34_ + 268), ((this._loadInt((_34_ + 268))) + _32_));
                                    continue label$7;
                                }
                            }
                            while (false);
                            sqlite3VdbeAddOp2((this._loadInt((_34_ + 228))), 7, (this._loadInt(((this._loadInt((_34_ + 200))) + 20))), (this._loadInt((_34_ + 204))));
                            sqlite3VdbeAddOp2((this._loadInt((_34_ + 228))), 7, ((this._loadInt((_34_ + 268))) + -1), ((this._loadInt((_34_ + 204))) + 1));
                            _temp$0 = -11;
                            _temp$1 = -2;
                            _temp$2 = ((this._loadInt((_32_ + 28))) != 0) ? _temp$0 : _temp$1;
                            sqlite3VdbeAddOp4((this._loadInt((_34_ + 228))), 128, (this._loadInt((_34_ + 260))), (this._loadInt((_34_ + 220))), (this._loadInt((_34_ + 204))), (this._loadInt(((_32_ = this._loadInt((_34_ + 200))) + 24))), _temp$2);
                            this._storeInt((_34_ + 268), (this._storeInt(((this._loadInt((_34_ + 200))) + 28), 0)));
                            label$12:
                            while (true) {
                                if ((this._loadInt((_34_ + 268))) >= (this._loadInt((_34_ + 196)))) {
                                    break label$5;
                                }
                                label$14:
                                do {
                                    if ((this._loadInt8u((((this._loadInt((_34_ + 192))) + ((this._loadInt((_34_ + 268))) << 3)) + 4))) == 0) {
                                        break label$14;
                                    }
                                    _32_ = this._storeInt((_34_ + 180), (this._loadInt((((this._loadInt((_34_ + 188))) + ((this._loadInt((_34_ + 268))) * 12)) + 8))));
                                    disableTerm((this._loadInt((_34_ + 244))), ((this._loadInt(((this._loadInt((_34_ + 240))) + 28))) + (_32_ * 40)));
                                }
                                while (false);
                                this._storeInt((_34_ + 268), ((this._loadInt((_34_ + 268))) + 1));
                                continue label$12;
                            }
                        }
                        while (false);
                        if (((this._loadInt8u(((this._loadInt((_34_ + 244))) + 1))) & 16) == 0) {
                            break label$4;
                        }
                        this._storeInt((_34_ + 208), (sqlite3GetTempReg((this._loadInt((_34_ + 232))))));
                        _32_ = this._storeInt((_34_ + 236), (findTerm((this._loadInt((_34_ + 240))), (this._loadInt((_34_ + 260))), -1, (this._loadLong((_34_ + 272))), 3, 0)));
                        this._storeInt((_34_ + 212), (codeEqualityTerm((this._loadInt((_34_ + 232))), _32_, (this._loadInt((_34_ + 244))), (this._loadInt((_34_ + 208))))));
                        _32_ = this._storeInt((_34_ + 256), (this._loadInt(((this._loadInt((_34_ + 244))) + 40))));
                        sqlite3VdbeAddOp2((this._loadInt((_34_ + 228))), 21, (this._loadInt((_34_ + 212))), _32_);
                        sqlite3VdbeAddOp3((this._loadInt((_34_ + 228))), 52, (this._loadInt((_34_ + 260))), (this._loadInt((_34_ + 256))), (this._loadInt((_34_ + 212))));
                        sqlite3ExprCacheStore((this._loadInt((_34_ + 232))), (this._loadInt((_34_ + 260))), -1, (this._loadInt((_34_ + 212))));
                        this._storeInt8(((this._loadInt((_34_ + 244))) + 53), 137);
                        break label$3;
                    }
                    while (false);
                    this._storeInt8(((_32_ = this._loadInt((_34_ + 244))) + 53), 131);
                    this._storeInt((_32_ + 56), (this._loadInt((_34_ + 260))));
                    _32_ = sqlite3VdbeCurrentAddr((this._loadInt((_34_ + 228))));
                    this._storeInt(((this._loadInt((_34_ + 244))) + 60), _32_);
                    sqlite3ReleaseTempRange((this._loadInt((_34_ + 232))), (this._loadInt((_34_ + 204))), ((this._loadInt((_34_ + 196))) + 2));
                    sqlite3ExprCachePop((this._loadInt((_34_ + 232))), 1);
                    break label$3;
                }
                while (false);
                label$15:
                do {
                    label$16:
                    do {
                        label$17:
                        do {
                            label$18:
                            do {
                                label$19:
                                do {
                                    label$20:
                                    do {
                                        label$21:
                                        do {
                                            label$22:
                                            do {
                                                label$23:
                                                do {
                                                    label$24:
                                                    do {
                                                        label$25:
                                                        do {
                                                            label$26:
                                                            do {
                                                                label$27:
                                                                do {
                                                                    label$28:
                                                                    do {
                                                                        label$29:
                                                                        do {
                                                                            if (((this._loadInt8u(((this._loadInt((_34_ + 244))) + 1))) & 32) == 0) {
                                                                                break label$29;
                                                                            }
                                                                            this._storeInt((_34_ + 176), 137);
                                                                            _32_ = this._storeInt((_34_ + 168), 0);
                                                                            this._storeInt((_34_ + 164), (findTerm((this._loadInt((_34_ + 240))), (this._loadInt((_34_ + 260))), -1, (this._loadLong((_34_ + 272))), 36, _32_)));
                                                                            this._storeInt((_34_ + 160), (findTerm((this._loadInt((_34_ + 240))), (this._loadInt((_34_ + 260))), -1, (this._loadLong((_34_ + 272))), 24, _32_)));
                                                                            label$30:
                                                                            do {
                                                                                if ((this._loadInt((_34_ + 248))) == 0) {
                                                                                    break label$30;
                                                                                }
                                                                                this._storeInt((_34_ + 236), (this._loadInt((_34_ + 164))));
                                                                                this._storeInt((_34_ + 164), (this._loadInt((_34_ + 160))));
                                                                                this._storeInt((_34_ + 160), (this._loadInt((_34_ + 236))));
                                                                            }
                                                                            while (false);
                                                                            if ((this._loadInt((_34_ + 164))) == 0) {
                                                                                break label$28;
                                                                            }
                                                                            _32_ = this._storeInt((_34_ + 156), (this._loadInt((this._loadInt((_34_ + 164))))));
                                                                            _32_ = this._storeInt((_34_ + 152), (sqlite3ExprCodeTemp((this._loadInt((_34_ + 232))), (this._loadInt((_32_ + 12))), (_34_ + 148))));
                                                                            sqlite3VdbeAddOp3((this._loadInt((_34_ + 228))), (this._loadInt8u(((this._loadInt8u((this._loadInt((_34_ + 156))))) + 45955))), (this._loadInt((_34_ + 260))), (this._loadInt((_34_ + 220))), _32_);
                                                                            sqlite3ExprCacheAffinityChange((this._loadInt((_34_ + 232))), (this._loadInt((_34_ + 152))), 1);
                                                                            sqlite3ReleaseTempReg((this._loadInt((_34_ + 232))), (this._loadInt((_34_ + 148))));
                                                                            disableTerm((this._loadInt((_34_ + 244))), (this._loadInt((_34_ + 164))));
                                                                            break label$27;
                                                                        }
                                                                        while (false);
                                                                        if (((this._loadInt8u(((this._loadInt((_34_ + 244))) + 2))) & 3) == 0) {
                                                                            break label$26;
                                                                        }
                                                                        this._storeInt((_34_ + 140), (this._loadInt(((this._loadInt((_34_ + 244))) + 4))));
                                                                        this._storeInt((_34_ + 92), (this._storeInt((_34_ + 120), (this._storeInt((_34_ + 124), (this._storeInt((_34_ + 136), 0)))))));
                                                                        this._storeInt((_34_ + 100), (this._loadInt(((this._loadInt((_34_ + 244))) + 16))));
                                                                        this._storeInt((_34_ + 96), (this._loadInt(((this._loadInt((_34_ + 244))) + 32))));
                                                                        this._storeInt((_34_ + 264), (this._loadInt(((this._loadInt(((this._loadInt((_34_ + 100))) + 8))) + ((this._loadInt((_34_ + 140))) << 2)))));
                                                                        label$31:
                                                                        do {
                                                                            if (((this._loadInt16u((_34_ + 286))) & 1) == 0) {
                                                                                break label$31;
                                                                            }
                                                                            if (((this._loadInt8u(((this._loadInt((_34_ + 244))) + 3))) & 1) == 0) {
                                                                                break label$31;
                                                                            }
                                                                            if ((this._loadInt(((this._loadInt((_34_ + 100))) + 4))) <= (this._loadInt((_34_ + 140)))) {
                                                                                break label$31;
                                                                            }
                                                                            this._storeInt((_34_ + 92), (this._storeInt((_34_ + 136), 1)));
                                                                        }
                                                                        while (false);
                                                                        label$32:
                                                                        do {
                                                                            if (((this._loadInt8u(((this._loadInt((_34_ + 244))) + 2))) & 16) == 0) {
                                                                                break label$32;
                                                                            }
                                                                            this._storeInt((_34_ + 120), (findTerm((this._loadInt((_34_ + 240))), (this._loadInt((_34_ + 260))), (this._loadInt((_34_ + 264))), (this._loadLong((_34_ + 272))), 24, (this._loadInt((_34_ + 100))))));
                                                                            this._storeInt((_34_ + 92), 1);
                                                                        }
                                                                        while (false);
                                                                        label$33:
                                                                        do {
                                                                            if (((this._loadInt8u(((this._loadInt((_34_ + 244))) + 2))) & 32) == 0) {
                                                                                break label$33;
                                                                            }
                                                                            this._storeInt((_34_ + 124), (findTerm((this._loadInt((_34_ + 240))), (this._loadInt((_34_ + 260))), (this._loadInt((_34_ + 264))), (this._loadLong((_34_ + 272))), 36, (this._loadInt((_34_ + 100))))));
                                                                            this._storeInt((_34_ + 92), 1);
                                                                        }
                                                                        while (false);
                                                                        this._storeInt((_34_ + 132), (codeAllEqualityTerms((this._loadInt((_34_ + 232))), (this._loadInt((_34_ + 244))), (this._loadInt((_34_ + 240))), (this._loadLong((_34_ + 272))), (this._loadInt((_34_ + 92))), (_34_ + 84))));
                                                                        this._storeInt((_34_ + 80), (sqlite3DbStrDup((this._loadInt((this._loadInt((_34_ + 232))))), (this._loadInt((_34_ + 84))))));
                                                                        this._storeInt((_34_ + 256), (this._loadInt(((this._loadInt((_34_ + 244))) + 40))));
                                                                        label$34:
                                                                        do {
                                                                            if ((this._loadInt((_34_ + 140))) >= (this._loadInt(((this._loadInt((_34_ + 100))) + 4)))) {
                                                                                break label$34;
                                                                            }
                                                                            if ((this._loadInt((_34_ + 248))) != (((this._loadInt8u(((this._loadInt(((this._loadInt((_34_ + 100))) + 40))) + (this._loadInt((_34_ + 140)))))) == 0) ? 1 : 0)) {
                                                                                break label$34;
                                                                            }
                                                                            this._storeInt((_34_ + 76), (this._loadInt((_34_ + 120))));
                                                                            this._storeInt((_34_ + 120), (this._loadInt((_34_ + 124))));
                                                                            this._storeInt((_34_ + 124), (this._loadInt((_34_ + 76))));
                                                                        }
                                                                        while (false);
                                                                        _32_ = 1;
                                                                        _31_ = 1;
                                                                        label$35:
                                                                        do {
                                                                            if ((this._loadInt((_34_ + 124))) == 0) {
                                                                                break label$35;
                                                                            }
                                                                            _31_ = (((this._loadInt16u(((this._loadInt((_34_ + 124))) + 16))) & 40) != 0) ? 1 : 0;
                                                                        }
                                                                        while (false);
                                                                        this._storeInt((_34_ + 116), _31_);
                                                                        label$36:
                                                                        do {
                                                                            if ((this._loadInt((_34_ + 120))) == 0) {
                                                                                break label$36;
                                                                            }
                                                                            _32_ = (((this._loadInt16u(((this._loadInt((_34_ + 120))) + 16))) & 40) != 0) ? 1 : 0;
                                                                        }
                                                                        while (false);
                                                                        this._storeInt((_34_ + 112), _32_);
                                                                        _32_ = 1;
                                                                        label$37:
                                                                        do {
                                                                            if ((this._loadInt((_34_ + 124))) != 0) {
                                                                                break label$37;
                                                                            }
                                                                            _32_ = ((this._loadInt((_34_ + 140))) > 0) ? 1 : 0;
                                                                        }
                                                                        while (false);
                                                                        this._storeInt((_34_ + 108), _32_);
                                                                        this._storeInt((_34_ + 104), (this._loadInt((_34_ + 140))));
                                                                        if ((this._loadInt((_34_ + 124))) == 0) {
                                                                            break label$25;
                                                                        }
                                                                        _32_ = this._storeInt((_34_ + 72), (this._loadInt(((this._loadInt((this._loadInt((_34_ + 124))))) + 12))));
                                                                        sqlite3ExprCode((this._loadInt((_34_ + 232))), _32_, ((this._loadInt((_34_ + 132))) + (this._loadInt((_34_ + 140)))));
                                                                        label$38:
                                                                        do {
                                                                            if (0 != 0) {
                                                                                break label$38;
                                                                            }
                                                                            sqlite3ExprCodeIsNullJump((this._loadInt((_34_ + 228))), (this._loadInt((_34_ + 72))), ((this._loadInt((_34_ + 132))) + (this._loadInt((_34_ + 140)))), (this._loadInt((_34_ + 256))));
                                                                        }
                                                                        while (false);
                                                                        label$39:
                                                                        do {
                                                                            if ((this._loadInt((_34_ + 84))) == 0) {
                                                                                break label$39;
                                                                            }
                                                                            label$40:
                                                                            do {
                                                                                if ((sqlite3CompareAffinity((this._loadInt((_34_ + 72))), (this._loadInt8s(((this._loadInt((_34_ + 84))) + (this._loadInt((_34_ + 140)))))))) != 98) {
                                                                                    break label$40;
                                                                                }
                                                                                this._storeInt8(((this._loadInt((_34_ + 84))) + (this._loadInt((_34_ + 140)))), 98);
                                                                            }
                                                                            while (false);
                                                                            if ((sqlite3ExprNeedsNoAffinityChange((this._loadInt((_34_ + 72))), (this._loadInt8s(((this._loadInt((_34_ + 84))) + (this._loadInt((_34_ + 140)))))))) == 0) {
                                                                                break label$39;
                                                                            }
                                                                            this._storeInt8(((this._loadInt((_34_ + 84))) + (this._loadInt((_34_ + 140)))), 98);
                                                                        }
                                                                        while (false);
                                                                        this._storeInt((_34_ + 104), ((this._loadInt((_34_ + 104))) + 1));
                                                                        break label$24;
                                                                    }
                                                                    while (false);
                                                                    _temp$3 = 63;
                                                                    _temp$4 = 65;
                                                                    _temp$5 = ((this._loadInt((_34_ + 248))) != 0) ? _temp$3 : _temp$4;
                                                                    sqlite3VdbeAddOp2((this._loadInt((_34_ + 228))), _temp$5, (this._loadInt((_34_ + 260))), (this._loadInt((_34_ + 220))));
                                                                }
                                                                while (false);
                                                                if ((this._loadInt((_34_ + 160))) == 0) {
                                                                    break label$20;
                                                                }
                                                                this._storeInt((_34_ + 144), (this._loadInt((this._loadInt((_34_ + 160))))));
                                                                _32_ = this._storeInt((_34_ + 168), (this._storeInt(((_32_ = this._loadInt((_34_ + 232))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
                                                                sqlite3ExprCode((this._loadInt((_34_ + 232))), (this._loadInt(((this._loadInt((_34_ + 144))) + 12))), _32_);
                                                                label$41:
                                                                do {
                                                                    if ((this._loadInt8u((this._loadInt((_34_ + 144))))) == 79) {
                                                                        break label$41;
                                                                    }
                                                                    if ((this._loadInt8u((this._loadInt((_34_ + 144))))) != 77) {
                                                                        break label$22;
                                                                    }
                                                                }
                                                                while (false);
                                                                _temp$6 = 78;
                                                                _temp$7 = 80;
                                                                _temp$8 = ((this._loadInt((_34_ + 248))) != 0) ? _temp$6 : _temp$7;
                                                                this._storeInt((_34_ + 176), _temp$8);
                                                                break label$21;
                                                            }
                                                            while (false);
                                                            if (((this._loadInt8u(((this._loadInt((_34_ + 244))) + 3))) & 16) == 0) {
                                                                break label$23;
                                                            }
                                                            this._storeInt((_34_ + 56), (this._storeInt(((_32_ = this._loadInt((_34_ + 232))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
                                                            _32_ = this._storeInt((_34_ + 48), (this._storeInt((_34_ + 52), 0)));
                                                            this._storeInt((_34_ + 44), (sqlite3VdbeMakeLabel((this._loadInt((_34_ + 228))))));
                                                            this._storeInt((_34_ + 36), _32_);
                                                            this._storeInt((_34_ + 236), (this._loadInt(((this._loadInt((_34_ + 244))) + 16))));
                                                            this._storeInt((_34_ + 64), (this._loadInt(((this._loadInt((_34_ + 236))) + 12))));
                                                            this._storeInt8(((_32_ = this._loadInt((_34_ + 244))) + 53), 3);
                                                            this._storeInt((_32_ + 56), (this._loadInt((_34_ + 56))));
                                                            if ((this._loadInt(((this._loadInt((_34_ + 292))) + 24))) < 2) {
                                                                break label$17;
                                                            }
                                                            _32_ = this._storeInt((_34_ + 28), (((this._loadInt(((this._loadInt((_34_ + 292))) + 24))) - (this._loadInt((_34_ + 288)))) + -1));
                                                            if ((this._storeInt((_34_ + 60), (sqlite3DbMallocRaw((this._loadInt((this._loadInt((_34_ + 232))))), ((_32_ * 56) + 64))))) == 0) {
                                                                break label$15;
                                                            }
                                                            this._storeInt16(((_32_ = this._loadInt((_34_ + 60))) + 2), ((this._loadInt((_34_ + 28))) + 1));
                                                            this._storeInt16(_32_, (this._loadInt16u((_32_ + 2))));
                                                            memcpy((_32_ + 8), (this._loadInt((_34_ + 224))), 56);
                                                            this._storeInt((_34_ + 24), ((this._loadInt(((this._loadInt((_34_ + 292))) + 8))) + 8));
                                                            _31_ = this._storeInt((_34_ + 264), 1);
                                                            label$42:
                                                            while (true) {
                                                                if ((this._loadInt((_34_ + 264))) > (this._loadInt((_34_ + 28)))) {
                                                                    break label$16;
                                                                }
                                                                memcpy((((this._loadInt((_34_ + 60))) + ((_32_ = this._loadInt((_34_ + 264))) * 56)) + 8), ((this._loadInt((_34_ + 24))) + ((this._loadInt8u((((this._loadInt((_34_ + 244))) + (_32_ * 80)) + 52))) * 56)), 56);
                                                                this._storeInt((_34_ + 264), ((this._loadInt((_34_ + 264))) + _31_));
                                                                continue label$42;
                                                            }
                                                        }
                                                        while (false);
                                                        if ((this._loadInt((_34_ + 136))) == 0) {
                                                            break label$24;
                                                        }
                                                        sqlite3VdbeAddOp2((this._loadInt((_34_ + 228))), 10, 0, ((this._loadInt((_34_ + 132))) + (this._loadInt((_34_ + 140)))));
                                                        this._storeInt((_34_ + 104), ((this._loadInt((_34_ + 104))) + 1));
                                                        this._storeInt((_34_ + 116), 0);
                                                        this._storeInt((_34_ + 108), 1);
                                                    }
                                                    while (false);
                                                    codeApplyAffinity((this._loadInt((_34_ + 232))), (this._loadInt((_34_ + 132))), (this._loadInt((_34_ + 104))), (this._loadInt((_34_ + 84))));
                                                    _32_ = 1;
                                                    _31_ = this._storeInt((_34_ + 88), (this._loadInt8u((((((this._loadInt((_34_ + 108))) << 2) + ((this._loadInt((_34_ + 116))) << 1)) + (this._loadInt((_34_ + 248)))) + 46048))));
                                                    sqlite3VdbeAddOp4Int((this._loadInt((_34_ + 228))), _31_, (this._loadInt((_34_ + 96))), (this._loadInt((_34_ + 256))), (this._loadInt((_34_ + 132))), (this._loadInt((_34_ + 104))));
                                                    this._storeInt((_34_ + 104), (this._loadInt((_34_ + 140))));
                                                    label$44:
                                                    do {
                                                        if ((this._loadInt((_34_ + 120))) == 0) {
                                                            break label$44;
                                                        }
                                                        this._storeInt((_34_ + 68), (this._loadInt(((this._loadInt((this._loadInt((_34_ + 120))))) + 12))));
                                                        sqlite3ExprCacheRemove((this._loadInt((_34_ + 232))), ((this._loadInt((_34_ + 132))) + (this._loadInt((_34_ + 140)))), 1);
                                                        sqlite3ExprCode((this._loadInt((_34_ + 232))), (this._loadInt((_34_ + 68))), ((this._loadInt((_34_ + 132))) + (this._loadInt((_34_ + 140)))));
                                                        label$45:
                                                        do {
                                                            if (0 != 0) {
                                                                break label$45;
                                                            }
                                                            sqlite3ExprCodeIsNullJump((this._loadInt((_34_ + 228))), (this._loadInt((_34_ + 68))), ((this._loadInt((_34_ + 132))) + (this._loadInt((_34_ + 140)))), (this._loadInt((_34_ + 256))));
                                                        }
                                                        while (false);
                                                        label$46:
                                                        do {
                                                            if ((this._loadInt((_34_ + 80))) == 0) {
                                                                break label$46;
                                                            }
                                                            label$47:
                                                            do {
                                                                if ((sqlite3CompareAffinity((this._loadInt((_34_ + 68))), (this._loadInt8s(((this._loadInt((_34_ + 80))) + (this._loadInt((_34_ + 140)))))))) != 98) {
                                                                    break label$47;
                                                                }
                                                                this._storeInt8(((this._loadInt((_34_ + 80))) + (this._loadInt((_34_ + 140)))), 98);
                                                            }
                                                            while (false);
                                                            if ((sqlite3ExprNeedsNoAffinityChange((this._loadInt((_34_ + 68))), (this._loadInt8s(((this._loadInt((_34_ + 80))) + (this._loadInt((_34_ + 140)))))))) == 0) {
                                                                break label$46;
                                                            }
                                                            this._storeInt8(((this._loadInt((_34_ + 80))) + (this._loadInt((_34_ + 140)))), 98);
                                                        }
                                                        while (false);
                                                        codeApplyAffinity((this._loadInt((_34_ + 232))), (this._loadInt((_34_ + 132))), ((this._loadInt((_34_ + 140))) + 1), (this._loadInt((_34_ + 80))));
                                                        this._storeInt((_34_ + 104), ((this._loadInt((_34_ + 104))) + 1));
                                                    }
                                                    while (false);
                                                    sqlite3DbFree((this._loadInt((this._loadInt((_34_ + 232))))), (this._loadInt((_34_ + 84))));
                                                    sqlite3DbFree((this._loadInt((this._loadInt((_34_ + 232))))), (this._loadInt((_34_ + 80))));
                                                    _31_ = sqlite3VdbeCurrentAddr((this._loadInt((_34_ + 228))));
                                                    this._storeInt(((this._loadInt((_34_ + 244))) + 60), _31_);
                                                    label$48:
                                                    do {
                                                        if ((this._loadInt((_34_ + 120))) != 0) {
                                                            break label$48;
                                                        }
                                                        _32_ = ((this._loadInt((_34_ + 140))) != 0) ? 1 : 0;
                                                    }
                                                    while (false);
                                                    label$49:
                                                    do {
                                                        if ((this._storeInt((_34_ + 88), (this._loadInt8u(((_32_ * ((this._loadInt((_34_ + 248))) + 1)) + 46064))))) == 137) {
                                                            break label$49;
                                                        }
                                                        sqlite3VdbeAddOp4Int((this._loadInt((_34_ + 228))), (this._loadInt((_34_ + 88))), (this._loadInt((_34_ + 96))), (this._loadInt((_34_ + 256))), (this._loadInt((_34_ + 132))), (this._loadInt((_34_ + 104))));
                                                        sqlite3VdbeChangeP5((this._loadInt((_34_ + 228))), (((this._loadInt((_34_ + 112))) != (this._loadInt((_34_ + 248)))) ? 1 : 0));
                                                    }
                                                    while (false);
                                                    this._storeInt((_34_ + 128), (sqlite3GetTempReg((this._loadInt((_34_ + 232))))));
                                                    label$50:
                                                    do {
                                                        if (((this._loadInt8u(((this._loadInt((_34_ + 244))) + 2))) & 48) == 0) {
                                                            break label$50;
                                                        }
                                                        sqlite3VdbeAddOp3((this._loadInt((_34_ + 228))), 28, (this._loadInt((_34_ + 96))), (this._loadInt((_34_ + 140))), (this._loadInt((_34_ + 128))));
                                                        sqlite3VdbeAddOp2((this._loadInt((_34_ + 228))), 73, (this._loadInt((_34_ + 128))), (this._loadInt((_34_ + 216))));
                                                    }
                                                    while (false);
                                                    sqlite3ReleaseTempReg((this._loadInt((_34_ + 232))), (this._loadInt((_34_ + 128))));
                                                    disableTerm((this._loadInt((_34_ + 244))), (this._loadInt((_34_ + 124))));
                                                    disableTerm((this._loadInt((_34_ + 244))), (this._loadInt((_34_ + 120))));
                                                    label$51:
                                                    do {
                                                        if ((this._loadInt((_34_ + 252))) != 0) {
                                                            break label$51;
                                                        }
                                                        _32_ = this._storeInt((_34_ + 212), (this._storeInt((_34_ + 208), (sqlite3GetTempReg((this._loadInt((_34_ + 232))))))));
                                                        sqlite3VdbeAddOp2((this._loadInt((_34_ + 228))), 72, (this._loadInt((_34_ + 96))), _32_);
                                                        sqlite3ExprCacheStore((this._loadInt((_34_ + 232))), (this._loadInt((_34_ + 260))), -1, (this._loadInt((_34_ + 212))));
                                                        sqlite3VdbeAddOp2((this._loadInt((_34_ + 228))), 48, (this._loadInt((_34_ + 260))), (this._loadInt((_34_ + 212))));
                                                    }
                                                    while (false);
                                                    label$52:
                                                    do {
                                                        if (((this._loadInt8u(((this._loadInt((_34_ + 244))) + 3))) & 4) == 0) {
                                                            break label$52;
                                                        }
                                                        this._storeInt8(((this._loadInt((_34_ + 244))) + 53), 137);
                                                        break label$18;
                                                    }
                                                    while (false);
                                                    if ((this._loadInt((_34_ + 248))) == 0) {
                                                        break label$19;
                                                    }
                                                    this._storeInt8(((this._loadInt((_34_ + 244))) + 53), 66);
                                                    break label$18;
                                                }
                                                while (false);
                                                _31_ = this._storeInt(((_32_ = this._loadInt((_34_ + 244))) + 56), (this._loadInt((_34_ + 260))));
                                                this._storeInt8((_32_ + 53), (this._loadInt8u(((_30_ = this._loadInt((_34_ + 248))) + 46080))));
                                                _32_ = sqlite3VdbeAddOp2((this._loadInt((_34_ + 228))), (this._loadInt8u((_30_ + 46096))), _31_, (this._loadInt((_34_ + 220))));
                                                this._storeInt(((_31_ = this._loadInt((_34_ + 244))) + 60), (_32_ + (this._storeInt8((_31_ + 54), 1))));
                                                break label$3;
                                            }
                                            while (false);
                                            _temp$9 = 79;
                                            _temp$10 = 77;
                                            _temp$11 = ((this._loadInt((_34_ + 248))) != 0) ? _temp$9 : _temp$10;
                                            this._storeInt((_34_ + 176), _temp$11);
                                        }
                                        while (false);
                                        disableTerm((this._loadInt((_34_ + 244))), (this._loadInt((_34_ + 160))));
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 172), (sqlite3VdbeCurrentAddr((this._loadInt((_34_ + 228))))));
                                    _temp$12 = 66;
                                    _temp$13 = 67;
                                    _temp$14 = ((this._loadInt((_34_ + 248))) != 0) ? _temp$12 : _temp$13;
                                    this._storeInt8(((_32_ = this._loadInt((_34_ + 244))) + 53), _temp$14);
                                    this._storeInt((_32_ + 56), (this._loadInt((_34_ + 260))));
                                    this._storeInt(((this._loadInt((_34_ + 244))) + 60), (this._loadInt((_34_ + 172))));
                                    label$53:
                                    do {
                                        if ((this._loadInt((_34_ + 164))) != 0) {
                                            break label$53;
                                        }
                                        if ((this._loadInt((_34_ + 160))) != 0) {
                                            break label$53;
                                        }
                                        this._storeInt8(((this._loadInt((_34_ + 244))) + 54), 1);
                                    }
                                    while (false);
                                    if ((this._loadInt((_34_ + 176))) == 137) {
                                        break label$3;
                                    }
                                    _32_ = this._storeInt((_34_ + 212), (this._storeInt((_34_ + 208), (sqlite3GetTempReg((this._loadInt((_34_ + 232))))))));
                                    sqlite3VdbeAddOp2((this._loadInt((_34_ + 228))), 61, (this._loadInt((_34_ + 260))), _32_);
                                    sqlite3ExprCacheStore((this._loadInt((_34_ + 232))), (this._loadInt((_34_ + 260))), -1, (this._loadInt((_34_ + 212))));
                                    sqlite3VdbeAddOp3((this._loadInt((_34_ + 228))), (this._loadInt((_34_ + 176))), (this._loadInt((_34_ + 168))), (this._loadInt((_34_ + 220))), (this._loadInt((_34_ + 212))));
                                    sqlite3VdbeChangeP5((this._loadInt((_34_ + 228))), 107);
                                    break label$3;
                                }
                                while (false);
                                this._storeInt8(((this._loadInt((_34_ + 244))) + 53), 67);
                            }
                            while (false);
                            this._storeInt(((this._loadInt((_34_ + 244))) + 56), (this._loadInt((_34_ + 96))));
                            break label$3;
                        }
                        while (false);
                        this._storeInt((_34_ + 60), (this._loadInt(((this._loadInt((_34_ + 292))) + 8))));
                    }
                    while (false);
                    label$54:
                    do {
                        if (((this._loadInt16u((_34_ + 286))) & 8) != 0) {
                            break label$54;
                        }
                        this._storeInt((_34_ + 52), (this._storeInt(((_32_ = this._loadInt((_34_ + 232))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
                        this._storeInt((_34_ + 48), (this._storeInt(((_32_ = this._loadInt((_34_ + 232))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
                        sqlite3VdbeAddOp2((this._loadInt((_34_ + 228))), 10, 0, (this._loadInt((_34_ + 52))));
                    }
                    while (false);
                    this._storeInt((_34_ + 40), (sqlite3VdbeAddOp2((this._loadInt((_34_ + 228))), 7, 0, (this._loadInt((_34_ + 56))))));
                    _32_ = this._storeInt((_34_ + 32), 0);
                    label$56:
                    do {
                        label$55:
                        while (true) {
                            if ((this._loadInt((_34_ + 32))) >= (this._loadInt(((this._loadInt((_34_ + 64))) + 20)))) {
                                break label$56;
                            }
                            label$57:
                            do {
                                label$58:
                                do {
                                    if ((this._loadInt(((this._storeInt((_34_ + 20), ((this._loadInt(((this._loadInt((_34_ + 64))) + 28))) + ((this._loadInt((_34_ + 32))) * 40)))) + 8))) == (this._loadInt((_34_ + 260)))) {
                                        break label$58;
                                    }
                                    if ((this._loadInt16u(((this._loadInt((_34_ + 20))) + 16))) != 512) {
                                        break label$57;
                                    }
                                }
                                while (false);
                                if ((this._storeInt((_34_ + 16), (sqlite3WhereBegin((this._loadInt((_34_ + 232))), (this._loadInt((_34_ + 60))), (this._loadInt((this._loadInt((_34_ + 20))))), _32_, 240)))) == 0) {
                                    break label$57;
                                }
                                explainOneScan((this._loadInt((_34_ + 232))), (this._loadInt((_34_ + 60))), ((this._loadInt((_34_ + 16))) + 48), (this._loadInt((_34_ + 288))), (this._loadInt8u(((this._loadInt((_34_ + 244))) + 52))), _32_);
                                label$59:
                                do {
                                    if (((this._loadInt16u((_34_ + 286))) & 8) != 0) {
                                        break label$59;
                                    }
                                    _31_ = -1;
                                    label$60:
                                    do {
                                        if ((this._loadInt((_34_ + 32))) == ((this._loadInt(((this._loadInt((_34_ + 64))) + 20))) + -1)) {
                                            break label$60;
                                        }
                                        _31_ = this._loadInt((_34_ + 32));
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 12), _31_);
                                    this._storeInt((_34_ + 8), (sqlite3ExprCodeGetColumn((this._loadInt((_34_ + 232))), (this._loadInt(((this._loadInt((_34_ + 224))) + 12))), -1, (this._loadInt((_34_ + 260))), (this._loadInt((_34_ + 48))))));
                                    sqlite3VdbeAddOp4Int((_31_ = this._loadInt((_34_ + 228))), 107, (this._loadInt((_34_ + 52))), ((sqlite3VdbeCurrentAddr(_31_)) + 2), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 12))));
                                }
                                while (false);
                                sqlite3VdbeAddOp2((this._loadInt((_34_ + 228))), 2, (this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 44))));
                                label$61:
                                do {
                                    if ((this._loadInt8u(((this._loadInt((_34_ + 16))) + 7))) == 0) {
                                        break label$61;
                                    }
                                    this._storeInt((_34_ + 36), 1);
                                }
                                while (false);
                                sqlite3WhereEnd((this._loadInt((_34_ + 16))));
                            }
                            while (false);
                            this._storeInt((_34_ + 32), ((this._loadInt((_34_ + 32))) + 1));
                            continue label$55;
                        }
                    }
                    while (false);
                    sqlite3VdbeChangeP1((_32_ = this._loadInt((_34_ + 228))), (this._loadInt((_34_ + 40))), (sqlite3VdbeCurrentAddr(_32_)));
                    sqlite3VdbeAddOp2((this._loadInt((_34_ + 228))), 1, 0, (this._loadInt(((this._loadInt((_34_ + 244))) + 36))));
                    sqlite3VdbeResolveLabel((this._loadInt((_34_ + 228))), (this._loadInt((_34_ + 44))));
                    label$62:
                    do {
                        if ((this._loadInt(((this._loadInt((_34_ + 292))) + 24))) < 2) {
                            break label$62;
                        }
                        sqlite3DbFree((this._loadInt((this._loadInt((_34_ + 232))))), (this._loadInt((_34_ + 60))));
                    }
                    while (false);
                    if ((this._loadInt((_34_ + 36))) != 0) {
                        break label$3;
                    }
                    disableTerm((this._loadInt((_34_ + 244))), (this._loadInt((_34_ + 236))));
                    break label$3;
                }
                while (false);
                this._storeLong((_34_ + 296), (this._loadLong((_34_ + 272))));
                break label$2;
            }
            while (false);
            _33_ = getMask((this._loadInt(((this._loadInt((_34_ + 240))) + 4))), (this._loadInt((_34_ + 260))));
            this._storeLong((_34_ + 272), ((this._loadLong((_34_ + 272))) & (_33_ ^ -1L)));
            this._storeInt((_34_ + 236), (this._loadInt(((this._loadInt((_34_ + 240))) + 28))));
            this._storeInt((_34_ + 268), (this._loadInt(((this._loadInt((_34_ + 240))) + 20))));
            label$64:
            do {
                label$63:
                while (true) {
                    if ((this._loadInt((_34_ + 268))) < 1) {
                        break label$64;
                    }
                    label$65:
                    do {
                        if (((this._loadInt8u(((this._loadInt((_34_ + 236))) + 18))) & 6) != 0) {
                            break label$65;
                        }
                        label$66:
                        do {
                            if (((this._loadLong(((this._loadInt((_34_ + 236))) + 32))) & (this._loadLong((_34_ + 272)))) == 0) {
                                break label$66;
                            }
                            this._storeInt8(((this._loadInt((_34_ + 292))) + 7), 1);
                            break label$65;
                        }
                        while (false);
                        this._storeInt((_34_ + 4), (this._loadInt((this._loadInt((_34_ + 236))))));
                        label$67:
                        do {
                            if ((this._loadInt(((this._loadInt((_34_ + 244))) + 24))) == 0) {
                                break label$67;
                            }
                            if (((this._loadInt16u(((this._loadInt((_34_ + 4))) + 2))) & 1) == 0) {
                                break label$65;
                            }
                        }
                        while (false);
                        sqlite3ExprIfFalse((this._loadInt((_34_ + 232))), (this._loadInt((_34_ + 4))), (this._loadInt((_34_ + 216))), 8);
                        this._storeInt8(((_32_ = this._loadInt((_34_ + 236))) + 18), ((this._loadInt8u((_32_ + 18))) | 4));
                    }
                    while (false);
                    this._storeInt((_34_ + 268), ((this._loadInt((_34_ + 268))) + -1));
                    this._storeInt((_34_ + 236), ((this._loadInt((_34_ + 236))) + 40));
                    continue label$63;
                }
            }
            while (false);
            label$68:
            do {
                if ((this._loadInt(((this._loadInt((_34_ + 244))) + 24))) == 0) {
                    break label$68;
                }
                _32_ = sqlite3VdbeCurrentAddr((this._loadInt((_34_ + 228))));
                this._storeInt(((_31_ = this._loadInt((_34_ + 244))) + 48), _32_);
                sqlite3VdbeAddOp2((this._loadInt((_34_ + 228))), 7, 1, (this._loadInt((_31_ + 24))));
                sqlite3ExprCacheClear((this._loadInt((_34_ + 232))));
                this._storeInt((_34_ + 236), (this._loadInt(((this._loadInt((_34_ + 240))) + 28))));
                this._storeInt((_34_ + 268), 0);
                label$70:
                do {
                    label$69:
                    while (true) {
                        if ((this._loadInt((_34_ + 268))) >= (this._loadInt(((this._loadInt((_34_ + 240))) + 20)))) {
                            break label$70;
                        }
                        label$71:
                        do {
                            if (((this._loadInt8u(((this._loadInt((_34_ + 236))) + 18))) & 6) != 0) {
                                break label$71;
                            }
                            if (((this._loadLong(((this._loadInt((_34_ + 236))) + 32))) & (this._loadLong((_34_ + 272)))) != 0L) {
                                break label$71;
                            }
                            sqlite3ExprIfFalse((this._loadInt((_34_ + 232))), (this._loadInt((this._loadInt((_34_ + 236))))), (this._loadInt((_34_ + 216))), 8);
                            this._storeInt8(((_32_ = this._loadInt((_34_ + 236))) + 18), ((this._loadInt8u((_32_ + 18))) | 4));
                        }
                        while (false);
                        this._storeInt((_34_ + 268), ((this._loadInt((_34_ + 268))) + 1));
                        this._storeInt((_34_ + 236), ((this._loadInt((_34_ + 236))) + 40));
                        continue label$69;
                    }
                }
                while (false);
            }
            while (false);
            sqlite3ReleaseTempReg((this._loadInt((_34_ + 232))), (this._loadInt((_34_ + 208))));
            this._storeLong((_34_ + 296), (this._loadLong((_34_ + 272))));
        }
        while (false);
        _33_ = this._loadLong((_34_ + 296));
        this._storeInt((0 + 4), (_34_ + 304));
        return _33_;
    }

    @Override()
    public final void disableTerm(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                break label$0;
            }
            if (((this._loadInt8u(((this._loadInt((_32_ + 8))) + 18))) & 4) != 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_32_ + 12))) + 24))) == 0) {
                    break label$1;
                }
                if (((this._loadInt16u(((this._loadInt((this._loadInt((_32_ + 8))))) + 2))) & 1) == 0) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt8(((_31_ = this._loadInt((_32_ + 8))) + 18), ((this._loadInt8u((_31_ + 18))) | 4));
            if ((this._loadInt((_31_ + 4))) < 0) {
                break label$0;
            }
            _30_ = this._storeInt8(((_31_ = (this._loadInt(((this._loadInt(((_31_ = this._loadInt((_32_ + 8))) + 20))) + 28))) + ((this._loadInt((_31_ + 4))) * 40)) + 19), ((this._loadInt8u((_31_ + 19))) + -1));
            this._storeInt((_32_ + 4), _31_);
            if ((_30_ & 255) != 0) {
                break label$0;
            }
            disableTerm((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 4))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int findTerm(
            int _30_,
            int _31_,
            int _32_,
            long _33_,
            int _34_,
            int _35_)
    {
        int _36_ = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_36_ + 52), _31_);
        this._storeInt((_36_ + 48), _32_);
        this._storeLong((_36_ + 40), _33_);
        this._storeInt((_36_ + 36), _34_);
        this._storeInt((_36_ + 32), _35_);
        this._storeInt((_36_ + 36), ((this._loadInt((_36_ + 36))) & 4095));
        this._storeInt((_36_ + 28), (this._loadInt(((this._loadInt((_36_ + 56))) + 28))));
        this._storeInt((_36_ + 24), (this._loadInt(((this._loadInt((_36_ + 56))) + 20))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$4:
                    do {
                        label$3:
                        while (true) {
                            if ((this._loadInt((_36_ + 24))) == 0) {
                                break label$2;
                            }
                            label$5:
                            do {
                                if ((this._loadInt(((this._loadInt((_36_ + 28))) + 8))) != (this._loadInt((_36_ + 52)))) {
                                    break label$5;
                                }
                                if (((this._loadLong(((this._loadInt((_36_ + 28))) + 24))) & (this._loadLong((_36_ + 40)))) != 0L) {
                                    break label$5;
                                }
                                if ((this._loadInt(((this._loadInt((_36_ + 28))) + 12))) != (this._loadInt((_36_ + 48)))) {
                                    break label$5;
                                }
                                if (((this._loadInt16u(((this._loadInt((_36_ + 28))) + 16))) & (this._loadInt((_36_ + 36)))) == 0) {
                                    break label$5;
                                }
                                if ((this._loadInt((_36_ + 32))) == 0) {
                                    break label$4;
                                }
                                if ((this._loadInt16u(((this._loadInt((_36_ + 28))) + 16))) == 128) {
                                    break label$4;
                                }
                                this._storeInt((_36_ + 20), (this._loadInt((this._loadInt((_36_ + 28))))));
                                this._storeInt((_36_ + 4), (this._loadInt((this._loadInt((_36_ + 56))))));
                                this._storeInt8((_36_ + 15), (this._loadInt8u((((this._loadInt(((this._loadInt(((this._loadInt((_36_ + 32))) + 16))) + 12))) + ((this._loadInt((_36_ + 48))) * 24)) + 22))));
                                if ((sqlite3IndexAffinityOk((this._loadInt((_36_ + 20))), (this._loadInt8s((_36_ + 15))))) == 0) {
                                    break label$5;
                                }
                                this._storeInt((_36_ + 16), (sqlite3BinaryCompareCollSeq((this._loadInt((_36_ + 4))), (this._loadInt(((_35_ = this._loadInt((_36_ + 20))) + 8))), (this._loadInt((_35_ + 12))))));
                                this._storeInt((_36_ + 8), 0);
                                label$7:
                                do {
                                    label$6:
                                    while (true) {
                                        if ((this._loadInt(((this._loadInt(((this._loadInt((_36_ + 32))) + 8))) + ((this._loadInt((_36_ + 8))) << 2)))) == (this._loadInt((_36_ + 48)))) {
                                            break label$7;
                                        }
                                        if ((this._loadInt((_36_ + 8))) >= (this._loadInt(((this._loadInt((_36_ + 32))) + 4)))) {
                                            break label$1;
                                        }
                                        this._storeInt((_36_ + 8), ((this._loadInt((_36_ + 8))) + 1));
                                        continue label$6;
                                    }
                                }
                                while (false);
                                if ((this._loadInt((_36_ + 16))) == 0) {
                                    break label$4;
                                }
                                if ((sqlite3StrICmp((this._loadInt((this._loadInt((_36_ + 16))))), (this._loadInt(((this._loadInt(((this._loadInt((_36_ + 32))) + 44))) + ((this._loadInt((_36_ + 8))) << 2)))))) == 0) {
                                    break label$4;
                                }
                            }
                            while (false);
                            this._storeInt((_36_ + 24), ((this._loadInt((_36_ + 24))) + -1));
                            this._storeInt((_36_ + 28), ((this._loadInt((_36_ + 28))) + 40));
                            continue label$3;
                        }
                    }
                    while (false);
                    this._storeInt((_36_ + 60), (this._loadInt((_36_ + 28))));
                    break label$0;
                }
                while (false);
                this._storeInt((_36_ + 60), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_36_ + 60), 0);
        }
        while (false);
        _35_ = this._loadInt((_36_ + 60));
        this._storeInt((0 + 4), (_36_ + 64));
        return _35_;
    }

    @Override()
    public final int codeEqualityTerm(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_34_ + 40), _31_);
        this._storeInt((_34_ + 36), _32_);
        this._storeInt((_34_ + 32), _33_);
        this._storeInt((_34_ + 28), (this._loadInt((this._loadInt((_34_ + 40))))));
        this._storeInt((_34_ + 24), (this._loadInt(((this._loadInt((_34_ + 44))) + 12))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u((this._loadInt((_34_ + 28))))) != 76) {
                    break label$1;
                }
                this._storeInt((_34_ + 20), (sqlite3ExprCodeTarget((this._loadInt((_34_ + 44))), (this._loadInt(((this._loadInt((_34_ + 28))) + 12))), (this._loadInt((_34_ + 32))))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt8u((this._loadInt((_34_ + 28))))) != 73) {
                    break label$2;
                }
                _33_ = this._storeInt((_34_ + 20), (this._loadInt((_34_ + 32))));
                sqlite3VdbeAddOp2((this._loadInt((_34_ + 24))), 10, 0, _33_);
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 20), (this._loadInt((_34_ + 32))));
            this._storeInt((_34_ + 16), (sqlite3FindInIndex((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 28))), 0)));
            _33_ = this._storeInt((_34_ + 12), (this._loadInt(((this._loadInt((_34_ + 28))) + 24))));
            sqlite3VdbeAddOp2((this._loadInt((_34_ + 24))), 65, _33_, 0);
            label$3:
            do {
                if ((this._loadInt(((this._loadInt((_34_ + 36))) + 64))) != 0) {
                    break label$3;
                }
                _33_ = sqlite3VdbeMakeLabel((this._loadInt((_34_ + 24))));
                this._storeInt(((this._loadInt((_34_ + 36))) + 40), _33_);
            }
            while (false);
            _32_ = this._storeInt(((_33_ = this._loadInt((_34_ + 36))) + 64), ((this._loadInt((_33_ + 64))) + 1));
            _33_ = sqlite3DbReallocOrFree((this._loadInt((this._loadInt((_34_ + 44))))), (this._loadInt((_33_ + 68))), (_32_ << 3));
            label$4:
            do {
                label$5:
                do {
                    label$6:
                    do {
                        if ((this._storeInt((_34_ + 8), (this._storeInt(((this._loadInt((_34_ + 36))) + 68), _33_)))) == 0) {
                            break label$6;
                        }
                        this._storeInt((this._storeInt((_34_ + 8), (((this._loadInt((_34_ + 8))) + ((this._loadInt(((this._loadInt((_34_ + 36))) + 64))) << 3)) + -8))), (this._loadInt((_34_ + 12))));
                        if ((this._loadInt((_34_ + 16))) != 1) {
                            break label$5;
                        }
                        _33_ = sqlite3VdbeAddOp2((this._loadInt((_34_ + 24))), 61, (this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 20))));
                        this._storeInt(((this._loadInt((_34_ + 8))) + 4), _33_);
                        break label$4;
                    }
                    while (false);
                    this._storeInt(((this._loadInt((_34_ + 36))) + 64), 0);
                    break label$0;
                }
                while (false);
                _33_ = sqlite3VdbeAddOp3((this._loadInt((_34_ + 24))), 28, (this._loadInt((_34_ + 12))), 0, (this._loadInt((_34_ + 20))));
                this._storeInt(((this._loadInt((_34_ + 8))) + 4), _33_);
            }
            while (false);
            sqlite3VdbeAddOp1((this._loadInt((_34_ + 24))), 73, (this._loadInt((_34_ + 20))));
        }
        while (false);
        disableTerm((this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 40))));
        _33_ = this._loadInt((_34_ + 20));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int codeAllEqualityTerms(
            int _30_,
            int _31_,
            int _32_,
            long _33_,
            int _34_,
            int _35_)
    {
        int _36_ = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 76), _30_);
        this._storeInt((_36_ + 72), _31_);
        this._storeInt((_36_ + 68), _32_);
        this._storeLong((_36_ + 56), _33_);
        this._storeInt((_36_ + 52), _34_);
        this._storeInt((_36_ + 48), _35_);
        this._storeInt((_36_ + 44), (this._loadInt(((this._loadInt((_36_ + 72))) + 4))));
        this._storeInt((_36_ + 40), (this._loadInt(((this._loadInt((_36_ + 76))) + 12))));
        this._storeInt((_36_ + 32), (this._loadInt(((this._loadInt((_36_ + 72))) + 28))));
        this._storeInt((_36_ + 36), (this._loadInt(((this._loadInt((_36_ + 72))) + 16))));
        this._storeInt((_36_ + 20), ((this._loadInt(((this._loadInt((_36_ + 76))) + 72))) + 1));
        _34_ = this._storeInt((_36_ + 16), ((this._loadInt(((this._loadInt((_36_ + 72))) + 4))) + (this._loadInt((_36_ + 52)))));
        this._storeInt(((_35_ = this._loadInt((_36_ + 76))) + 72), (_34_ + (this._loadInt((_35_ + 72)))));
        label$0:
        do {
            if ((this._storeInt((_36_ + 12), (sqlite3DbStrDup((this._loadInt(_35_)), (sqlite3IndexAffinityStr((this._loadInt((_36_ + 40))), (this._loadInt((_36_ + 36))))))))) != 0) {
                break label$0;
            }
            this._storeInt8(((this._loadInt((this._loadInt((_36_ + 76))))) + 30), 1);
        }
        while (false);
        this._storeInt((_36_ + 24), 0);
        label$2:
        do {
            label$1:
            while (true) {
                if ((this._loadInt((_36_ + 24))) >= (this._loadInt((_36_ + 44)))) {
                    break label$2;
                }
                _35_ = this._storeInt((_36_ + 4), (this._loadInt(((this._loadInt(((this._loadInt((_36_ + 36))) + 8))) + ((this._loadInt((_36_ + 24))) << 2)))));
                if ((this._storeInt((_36_ + 28), (findTerm((this._loadInt((_36_ + 68))), (this._loadInt((_36_ + 32))), _35_, (this._loadLong((_36_ + 56))), (this._loadInt((this._loadInt((_36_ + 72))))), (this._loadInt((_36_ + 36))))))) == 0) {
                    break label$2;
                }
                label$3:
                do {
                    if ((this._storeInt((_36_ + 8), (codeEqualityTerm((this._loadInt((_36_ + 76))), (this._loadInt((_36_ + 28))), (this._loadInt((_36_ + 72))), ((this._loadInt((_36_ + 20))) + (this._loadInt((_36_ + 24)))))))) == ((this._loadInt((_36_ + 20))) + (this._loadInt((_36_ + 24))))) {
                        break label$3;
                    }
                    label$4:
                    do {
                        if ((this._loadInt((_36_ + 16))) != 1) {
                            break label$4;
                        }
                        sqlite3ReleaseTempReg((this._loadInt((_36_ + 76))), (this._loadInt((_36_ + 20))));
                        this._storeInt((_36_ + 20), (this._loadInt((_36_ + 8))));
                        break label$3;
                    }
                    while (false);
                    sqlite3VdbeAddOp2((this._loadInt((_36_ + 40))), 15, (this._loadInt((_36_ + 8))), ((this._loadInt((_36_ + 20))) + (this._loadInt((_36_ + 24)))));
                }
                while (false);
                label$5:
                do {
                    if (((this._loadInt16u(((this._loadInt((_36_ + 28))) + 16))) & 129) != 0) {
                        break label$5;
                    }
                    _35_ = this._storeInt(_36_, (this._loadInt(((this._loadInt((this._loadInt((_36_ + 28))))) + 12))));
                    sqlite3ExprCodeIsNullJump((this._loadInt((_36_ + 40))), _35_, ((this._loadInt((_36_ + 20))) + (this._loadInt((_36_ + 24)))), (this._loadInt(((this._loadInt((_36_ + 72))) + 36))));
                    if ((this._loadInt((_36_ + 12))) == 0) {
                        break label$5;
                    }
                    label$6:
                    do {
                        if ((sqlite3CompareAffinity((this._loadInt(_36_)), (this._loadInt8s(((this._loadInt((_36_ + 12))) + (this._loadInt((_36_ + 24)))))))) != 98) {
                            break label$6;
                        }
                        this._storeInt8(((this._loadInt((_36_ + 12))) + (this._loadInt((_36_ + 24)))), 98);
                    }
                    while (false);
                    if ((sqlite3ExprNeedsNoAffinityChange((this._loadInt(_36_)), (this._loadInt8s(((this._loadInt((_36_ + 12))) + (this._loadInt((_36_ + 24)))))))) == 0) {
                        break label$5;
                    }
                    this._storeInt8(((this._loadInt((_36_ + 12))) + (this._loadInt((_36_ + 24)))), 98);
                }
                while (false);
                this._storeInt((_36_ + 24), ((this._loadInt((_36_ + 24))) + 1));
                continue label$1;
            }
        }
        while (false);
        this._storeInt((this._loadInt((_36_ + 48))), (this._loadInt((_36_ + 12))));
        _35_ = this._loadInt((_36_ + 20));
        this._storeInt((0 + 4), (_36_ + 80));
        return _35_;
    }

    @Override()
    public final void sqlite3ExprCodeIsNullJump(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        label$0:
        do {
            if ((sqlite3ExprCanBeNull((this._loadInt((_34_ + 8))))) == 0) {
                break label$0;
            }
            sqlite3VdbeAddOp2((this._loadInt((_34_ + 12))), 73, (this._loadInt((_34_ + 4))), (this._loadInt(_34_)));
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 16));
        return;
    }

    @Override()
    public final int sqlite3ExprNeedsNoAffinityChange(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 8), _30_);
        this._storeInt8((_32_ + 7), _31_);
        label$0:
        do {
            if ((this._loadInt8s((_32_ + 7))) != 98) {
                break label$0;
            }
            this._storeInt((_32_ + 12), 1);
            return (this._loadInt((_32_ + 12)));
        }
        while (false);
        label$2:
        do {
            label$1:
            while (true) {
                _31_ = 1;
                label$3:
                do {
                    if ((this._loadInt8u((this._loadInt((_32_ + 8))))) == 157) {
                        break label$3;
                    }
                    _31_ = ((this._loadInt8u((this._loadInt((_32_ + 8))))) == 156) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$2;
                }
                this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((_32_ + 8))) + 8))));
                continue label$1;
            }
        }
        while (false);
        label$4:
        do {
            if ((this._storeInt8((_32_ + 6), (this._loadInt8u((this._loadInt((_32_ + 8))))))) != 132) {
                break label$4;
            }
            this._storeInt8((_32_ + 6), (this._loadInt8u(((this._loadInt((_32_ + 8))) + 35))));
        }
        while (false);
        label$5:
        do {
            label$6:
            do {
                label$7:
                do {
                    label$8:
                    do {
                        label$9:
                        do {
                            if (((_31_ = (_30_ = this._loadInt8u((_32_ + 6))) + -129) & 4294967295L) > (23 & 4294967295L)) {
                                break label$9;
                            }
                            label$10:
                            do {
                                switch (_31_) {
                                    case 0: {
                                        break label$10;
                                    }
                                    case 1: {
                                        break label$7;
                                    }
                                    case 2: {
                                        break label$6;
                                    }
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22: {
                                        break label$8;
                                    }
                                    case 23: {
                                        break label$5;
                                    }
                                    default: {
                                        break label$10;
                                    }
                                }
                            }
                            while (false);
                            _31_ = 1;
                            label$11:
                            do {
                                if ((this._loadInt8s((_32_ + 7))) == 100) {
                                    break label$11;
                                }
                                _31_ = ((this._loadInt8s((_32_ + 7))) == 99) ? 1 : 0;
                            }
                            while (false);
                            this._storeInt((_32_ + 12), _31_);
                            return (this._loadInt((_32_ + 12)));
                        }
                        while (false);
                        if (_30_ != 94) {
                            break label$8;
                        }
                        this._storeInt((_32_ + 12), (((this._loadInt8s((_32_ + 7))) == 97) ? 1 : 0));
                        return (this._loadInt((_32_ + 12)));
                    }
                    while (false);
                    this._storeInt((_32_ + 12), 0);
                    return (this._loadInt((_32_ + 12)));
                }
                while (false);
                _31_ = 1;
                label$12:
                do {
                    if ((this._loadInt8s((_32_ + 7))) == 101) {
                        break label$12;
                    }
                    _31_ = ((this._loadInt8s((_32_ + 7))) == 99) ? 1 : 0;
                }
                while (false);
                this._storeInt((_32_ + 12), _31_);
                return (this._loadInt((_32_ + 12)));
            }
            while (false);
            this._storeInt((_32_ + 12), 1);
            return (this._loadInt((_32_ + 12)));
        }
        while (false);
        _31_ = 0;
        label$13:
        do {
            if ((this._loadInt16s(((this._loadInt((_32_ + 8))) + 28))) > -1) {
                break label$13;
            }
            _31_ = 1;
            if ((this._loadInt8s((_32_ + 7))) == 100) {
                break label$13;
            }
            _31_ = ((this._loadInt8s((_32_ + 7))) == 99) ? 1 : 0;
        }
        while (false);
        this._storeInt((_32_ + 12), _31_);
        return (this._loadInt((_32_ + 12)));
    }

    @Override()
    public final void codeApplyAffinity(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        this._storeInt((_34_ + 12), (this._loadInt(((this._loadInt((_34_ + 28))) + 12))));
        label$0:
        do {
            if ((this._loadInt((_34_ + 16))) == 0) {
                break label$0;
            }
            label$2:
            do {
                label$1:
                while (true) {
                    _33_ = 0;
                    label$3:
                    do {
                        if ((this._loadInt((_34_ + 20))) < 1) {
                            break label$3;
                        }
                        _33_ = ((this._loadInt8s((this._loadInt((_34_ + 16))))) == 98) ? 1 : 0;
                    }
                    while (false);
                    if (_33_ == 0) {
                        break label$2;
                    }
                    this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) + -1));
                    this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + 1));
                    this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) + 1));
                    continue label$1;
                }
            }
            while (false);
            label$5:
            do {
                label$4:
                while (true) {
                    _33_ = 0;
                    label$6:
                    do {
                        if ((this._loadInt((_34_ + 20))) < 2) {
                            break label$6;
                        }
                        _33_ = ((this._loadInt8s((((this._loadInt((_34_ + 16))) + (this._loadInt((_34_ + 20)))) + -1))) == 98) ? 1 : 0;
                    }
                    while (false);
                    if (_33_ == 0) {
                        break label$5;
                    }
                    this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) + -1));
                    continue label$4;
                }
            }
            while (false);
            if ((this._loadInt((_34_ + 20))) < 1) {
                break label$0;
            }
            sqlite3VdbeAddOp2((this._loadInt((_34_ + 12))), 29, (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))));
            sqlite3VdbeChangeP4((this._loadInt((_34_ + 12))), -1, (this._loadInt((_34_ + 16))), (this._loadInt((_34_ + 20))));
            sqlite3ExprCacheAffinityChange((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))));
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final int sqlite3ExprCanBeNull(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), _30_);
        label$1:
        do {
            label$0:
            while (true) {
                _30_ = 1;
                label$2:
                do {
                    if ((this._loadInt8u((this._loadInt((_31_ + 8))))) == 157) {
                        break label$2;
                    }
                    _30_ = ((this._loadInt8u((this._loadInt((_31_ + 8))))) == 156) ? 1 : 0;
                }
                while (false);
                if (_30_ == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 8), (this._loadInt(((this._loadInt((_31_ + 8))) + 8))));
                continue label$0;
            }
        }
        while (false);
        label$3:
        do {
            if ((this._storeInt8((_31_ + 7), (this._loadInt8u((this._loadInt((_31_ + 8))))))) != 132) {
                break label$3;
            }
            this._storeInt8((_31_ + 7), (this._loadInt8u(((this._loadInt((_31_ + 8))) + 35))));
        }
        while (false);
        label$4:
        do {
            label$5:
            do {
                if ((((_30_ = this._loadInt8u((_31_ + 7))) + -129) & 4294967295L) < (3 & 4294967295L)) {
                    break label$5;
                }
                if (_30_ != 94) {
                    break label$4;
                }
            }
            while (false);
            this._storeInt((_31_ + 12), 0);
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        this._storeInt((_31_ + 12), 1);
        return (this._loadInt((_31_ + 12)));
    }

    @Override()
    public final int sqlite3IndexAffinityOk(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt8((_32_ + 7), _31_);
        this._storeInt8((_32_ + 6), (comparisonAffinity((this._loadInt((_32_ + 8))))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((_31_ = this._loadInt8s((_32_ + 6))) == 97) {
                        break label$2;
                    }
                    if (_31_ != 98) {
                        break label$1;
                    }
                    this._storeInt((_32_ + 12), 1);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 12), (((this._loadInt8s((_32_ + 7))) == 97) ? 1 : 0));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), (((this._loadInt8s((_32_ + 7))) > 98) ? 1 : 0));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int explainIndexRange(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 72), _30_);
        this._storeInt((_33_ + 68), _31_);
        this._storeInt((_33_ + 64), _32_);
        this._storeInt((_33_ + 56), (this._loadInt(((this._storeInt((_33_ + 60), (this._loadInt((_33_ + 68))))) + 16))));
        this._storeInt((_33_ + 52), (this._loadInt(((this._loadInt((_33_ + 60))) + 4))));
        this._storeInt((_33_ + 40), (this._loadInt(((this._loadInt((_33_ + 64))) + 12))));
        this._storeInt((_33_ + 36), (this._loadInt(((this._loadInt((_33_ + 56))) + 8))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_33_ + 52))) != 0) {
                        break label$2;
                    }
                    if (((this._loadInt8u(((this._loadInt((_33_ + 60))) + 2))) & 48) == 0) {
                        break label$1;
                    }
                }
                while (false);
                sqlite3StrAccumInit((_33_ + 8), 0, 0, 1000000000);
                this._storeInt((_33_ + 8), (this._loadInt((_33_ + 72))));
                sqlite3StrAccumAppend((_33_ + 8), 46416, 2);
                this._storeInt((_33_ + 48), 0);
                label$4:
                do {
                    label$3:
                    while (true) {
                        if ((this._loadInt((_33_ + 48))) >= (this._loadInt((_33_ + 52)))) {
                            break label$4;
                        }
                        explainAppendTerm((_33_ + 8), (_32_ = this._loadInt((_33_ + 48))), (this._loadInt(((this._loadInt((_33_ + 40))) + ((this._loadInt(((this._loadInt((_33_ + 36))) + (_32_ << 2)))) * 24)))), 46432);
                        this._storeInt((_33_ + 48), ((this._loadInt((_33_ + 48))) + 1));
                        continue label$3;
                    }
                }
                while (false);
                this._storeInt((_33_ + 44), (this._loadInt((_33_ + 48))));
                label$5:
                do {
                    if (((this._loadInt8u(((this._loadInt((_33_ + 60))) + 2))) & 32) == 0) {
                        break label$5;
                    }
                    this._storeInt((_33_ + 48), ((_32_ = this._loadInt((_33_ + 48))) + 1));
                    explainAppendTerm((_33_ + 8), _32_, (this._loadInt(((this._loadInt((_33_ + 40))) + ((this._loadInt(((this._loadInt((_33_ + 36))) + ((this._loadInt((_33_ + 44))) << 2)))) * 24)))), 46448);
                }
                while (false);
                label$6:
                do {
                    if (((this._loadInt8u(((this._loadInt((_33_ + 60))) + 2))) & 16) == 0) {
                        break label$6;
                    }
                    explainAppendTerm((_33_ + 8), (this._loadInt((_33_ + 48))), (this._loadInt(((this._loadInt((_33_ + 40))) + ((this._loadInt(((this._loadInt((_33_ + 36))) + ((this._loadInt((_33_ + 44))) << 2)))) * 24)))), 46464);
                }
                while (false);
                sqlite3StrAccumAppend((_33_ + 8), 46480, 1);
                this._storeInt((_33_ + 76), (sqlite3StrAccumFinish((_33_ + 8))));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 76), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 76));
        this._storeInt((0 + 4), (_33_ + 80));
        return _32_;
    }

    @Override()
    public final void explainAppendTerm(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        label$0:
        do {
            if ((this._loadInt((_34_ + 8))) == 0) {
                break label$0;
            }
            sqlite3StrAccumAppend((this._loadInt((_34_ + 12))), 46496, 5);
        }
        while (false);
        sqlite3StrAccumAppend((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 4))), -1);
        sqlite3StrAccumAppend((this._loadInt((_34_ + 12))), (this._loadInt(_34_)), 1);
        sqlite3StrAccumAppend((this._loadInt((_34_ + 12))), 32816, 1);
        this._storeInt((0 + 4), (_34_ + 16));
        return;
    }

    @Override()
    public final int termCanDriveIndex(int _30_, int _31_, long _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeLong((_33_ + 8), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_33_ + 24))) + 8))) == (this._loadInt(((this._loadInt((_33_ + 20))) + 24)))) {
                    break label$1;
                }
                this._storeInt((_33_ + 28), 0);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt16u(((this._loadInt((_33_ + 24))) + 16))) == 2) {
                    break label$2;
                }
                this._storeInt((_33_ + 28), 0);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadLong(((this._loadInt((_33_ + 24))) + 24))) & (this._loadLong((_33_ + 8)))) == 0) {
                    break label$3;
                }
                this._storeInt((_33_ + 28), 0);
                break label$0;
            }
            while (false);
            this._storeInt8((_33_ + 7), (this._loadInt8u((((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 20))) + 12))) + 12))) + ((this._loadInt(((this._loadInt((_33_ + 24))) + 12))) * 24)) + 22))));
            label$4:
            do {
                if ((sqlite3IndexAffinityOk((this._loadInt((this._loadInt((_33_ + 24))))), (this._loadInt8s((_33_ + 7))))) == 0) {
                    break label$4;
                }
                this._storeInt((_33_ + 28), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 28), 0);
        }
        while (false);
        _31_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _31_;
    }

    @Override()
    public final int whereRangeScanEst(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_)
    {
        int _36_ = 0;
        this._storeInt(((_36_ = (this._loadInt((0 + 4))) - 32) + 28), _30_);
        this._storeInt((_36_ + 24), _31_);
        this._storeInt((_36_ + 20), _32_);
        this._storeInt((_36_ + 16), _33_);
        this._storeInt((_36_ + 12), _34_);
        this._storeInt((_36_ + 8), _35_);
        _35_ = this._storeInt((_36_ + 4), 0);
        this._storeInt((this._loadInt((_36_ + 8))), 100);
        label$0:
        do {
            if ((this._loadInt((_36_ + 16))) == 0) {
                break label$0;
            }
            if (_35_ != 0) {
                break label$0;
            }
            this._storeInt((_35_ = this._loadInt((_36_ + 8))), ((this._loadInt(_35_)) / 4));
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_36_ + 12))) == 0) {
                break label$1;
            }
            this._storeInt((_35_ = this._loadInt((_36_ + 8))), ((this._loadInt(_35_)) / 4));
        }
        while (false);
        return (this._loadInt((_36_ + 4)));
    }

    @Override()
    public final int isSortingIndex(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_,
            int _36_,
            int _37_)
    {
        int _38_ = 0;
        this._storeInt(((_38_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 88), _30_);
        this._storeInt((_38_ + 84), _31_);
        this._storeInt((_38_ + 80), _32_);
        this._storeInt((_38_ + 76), _33_);
        this._storeInt((_38_ + 72), _34_);
        this._storeInt((_38_ + 68), _35_);
        this._storeInt((_38_ + 64), _36_);
        this._storeInt((_38_ + 60), _37_);
        _37_ = this._storeInt((_38_ + 48), 0);
        this._storeInt((_38_ + 36), (this._loadInt((this._loadInt((_38_ + 88))))));
        this._storeInt((_38_ + 44), (this._loadInt((this._loadInt((_38_ + 72))))));
        _36_ = this._storeInt((_38_ + 56), (this._storeInt((_38_ + 52), _37_)));
        this._storeInt((_38_ + 40), (this._loadInt(((this._loadInt((_38_ + 72))) + 12))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        label$4:
                        do {
                            label$6:
                            do {
                                label$5:
                                while (true) {
                                    _37_ = 0;
                                    label$7:
                                    do {
                                        if ((this._loadInt((_38_ + 52))) >= (this._loadInt((_38_ + 44)))) {
                                            break label$7;
                                        }
                                        _37_ = ((this._loadInt((_38_ + 56))) <= (this._loadInt(((this._loadInt((_38_ + 80))) + 4)))) ? 1 : 0;
                                    }
                                    while (false);
                                    if (_37_ == 0) {
                                        break label$4;
                                    }
                                    if ((this._loadInt8u((this._storeInt((_38_ + 32), (this._loadInt((this._loadInt((_38_ + 40))))))))) != 152) {
                                        break label$4;
                                    }
                                    if ((this._loadInt(((this._loadInt((_38_ + 32))) + 24))) != (this._loadInt((_38_ + 76)))) {
                                        break label$4;
                                    }
                                    label$8:
                                    do {
                                        if ((this._storeInt((_38_ + 28), (sqlite3ExprCollSeq((this._loadInt((_38_ + 88))), (this._loadInt((_38_ + 32))))))) != 0) {
                                            break label$8;
                                        }
                                        this._storeInt((_38_ + 28), (this._loadInt(((this._loadInt((_38_ + 36))) + 44))));
                                    }
                                    while (false);
                                    label$9:
                                    do {
                                        label$10:
                                        do {
                                            if ((this._loadInt((this._loadInt((_38_ + 80))))) == 0) {
                                                break label$10;
                                            }
                                            if ((this._loadInt((_38_ + 56))) >= (this._loadInt(((this._loadInt((_38_ + 80))) + 4)))) {
                                                break label$10;
                                            }
                                            label$11:
                                            do {
                                                if ((this._storeInt((_38_ + 20), (this._loadInt(((this._loadInt(((this._loadInt((_38_ + 80))) + 8))) + ((this._loadInt((_38_ + 56))) << 2)))))) != (this._loadInt(((this._loadInt(((this._loadInt((_38_ + 80))) + 16))) + 4)))) {
                                                    break label$11;
                                                }
                                                this._storeInt((_38_ + 20), -1);
                                            }
                                            while (false);
                                            this._storeInt((_38_ + 16), (this._loadInt8u(((this._loadInt(((this._loadInt((_38_ + 80))) + 40))) + (this._loadInt((_38_ + 56)))))));
                                            this._storeInt((_38_ + 12), (this._loadInt(((this._loadInt(((this._loadInt((_38_ + 80))) + 44))) + ((this._loadInt((_38_ + 56))) << 2)))));
                                            break label$9;
                                        }
                                        while (false);
                                        this._storeInt((_38_ + 20), -1);
                                        this._storeInt((_38_ + 16), _36_);
                                        this._storeInt((_38_ + 12), (this._loadInt((this._loadInt((_38_ + 28))))));
                                    }
                                    while (false);
                                    label$12:
                                    do {
                                        label$13:
                                        do {
                                            label$14:
                                            do {
                                                if ((this._loadInt16s(((this._loadInt((_38_ + 32))) + 28))) != (this._loadInt((_38_ + 20)))) {
                                                    break label$14;
                                                }
                                                if ((sqlite3StrICmp((this._loadInt((this._loadInt((_38_ + 28))))), (this._loadInt((_38_ + 12))))) == 0) {
                                                    break label$13;
                                                }
                                            }
                                            while (false);
                                            if ((this._loadInt((_38_ + 56))) < (this._loadInt((_38_ + 68)))) {
                                                break label$12;
                                            }
                                            break label$6;
                                        }
                                        while (false);
                                        this._storeInt((_38_ + 24), ((this._loadInt((_38_ + 16))) ^ (this._loadInt8u(((this._loadInt((_38_ + 40))) + 12)))));
                                        label$15:
                                        do {
                                            label$16:
                                            do {
                                                if ((this._loadInt((_38_ + 56))) <= (this._loadInt((_38_ + 68)))) {
                                                    break label$16;
                                                }
                                                if ((this._loadInt((_38_ + 24))) == (this._loadInt((_38_ + 48)))) {
                                                    break label$15;
                                                }
                                                break label$1;
                                            }
                                            while (false);
                                            this._storeInt((_38_ + 48), (this._loadInt((_38_ + 24))));
                                        }
                                        while (false);
                                        this._storeInt((_38_ + 52), ((this._loadInt((_38_ + 52))) + 1));
                                        this._storeInt((_38_ + 40), ((this._loadInt((_38_ + 40))) + 20));
                                        if ((this._loadInt((_38_ + 20))) > -1) {
                                            break label$12;
                                        }
                                        if ((referencesOtherTables((this._loadInt((_38_ + 72))), (this._loadInt((_38_ + 84))), (this._loadInt((_38_ + 52))), (this._loadInt((_38_ + 76))))) != 0) {
                                            break label$12;
                                        }
                                        this._storeInt((_38_ + 52), (this._loadInt((_38_ + 44))));
                                    }
                                    while (false);
                                    this._storeInt((_38_ + 56), ((this._loadInt((_38_ + 56))) + 1));
                                    continue label$5;
                                }
                            }
                            while (false);
                            if ((this._loadInt((_38_ + 56))) != (this._loadInt(((this._loadInt((_38_ + 80))) + 4)))) {
                                break label$3;
                            }
                        }
                        while (false);
                        this._storeInt((this._loadInt((_38_ + 60))), (((this._loadInt((_38_ + 48))) != 0) ? 1 : 0));
                        label$17:
                        do {
                            if ((this._loadInt((_38_ + 52))) < (this._loadInt((_38_ + 44)))) {
                                break label$17;
                            }
                            this._storeInt((_38_ + 92), 1);
                            break label$0;
                        }
                        while (false);
                        label$18:
                        do {
                            if ((this._loadInt8u(((this._loadInt((_38_ + 80))) + 24))) == 0) {
                                break label$18;
                            }
                            if ((this._loadInt((_38_ + 56))) != (this._loadInt(((this._loadInt((_38_ + 80))) + 4)))) {
                                break label$18;
                            }
                            if (((this._loadInt8u((_38_ + 66))) & 8) != 0) {
                                break label$18;
                            }
                            if ((referencesOtherTables((this._loadInt((_38_ + 72))), (this._loadInt((_38_ + 84))), (this._loadInt((_38_ + 52))), (this._loadInt((_38_ + 76))))) == 0) {
                                break label$2;
                            }
                        }
                        while (false);
                        this._storeInt((_38_ + 92), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_38_ + 92), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_38_ + 92), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_38_ + 92), 0);
        }
        while (false);
        _37_ = this._loadInt((_38_ + 92));
        this._storeInt((0 + 4), (_38_ + 96));
        return _37_;
    }

    @Override()
    public final double estLog(double _30_)
    {
        double _31_ = 0.0;
        int _32_ = 0;
        this._storeDouble(((_32_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeLong((_32_ + 16), 4607182418800017408L);
        this._storeLong((_32_ + 8), 4621819117588971520L);
        label$1:
        do {
            label$0:
            while (true) {
                if (((((_30_ = this._loadDouble((_32_ + 24))) <= (_31_ = this._loadDouble((_32_ + 8)))) ? 1 : 0) | (((_30_ != _30_) ? 1 : 0) | ((_31_ != _31_) ? 1 : 0))) != 0) {
                    break label$1;
                }
                this._storeDouble((_32_ + 16), ((this._loadDouble((_32_ + 16))) + 1.0));
                this._storeDouble((_32_ + 8), ((this._loadDouble((_32_ + 8))) * 10.0));
                continue label$0;
            }
        }
        while (false);
        return (this._loadDouble((_32_ + 16)));
    }

    @Override()
    public final void bestOrClauseIndex(
            int _30_,
            int _31_,
            int _32_,
            long _33_,
            long _34_,
            int _35_,
            int _36_)
    {
        int _37_ = 0;
        double _38_ = 0.0;
        double _39_ = 0.0;
        this._storeInt(((_37_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 512))) + 508), _30_);
        this._storeInt((_37_ + 504), _31_);
        this._storeInt((_37_ + 500), _32_);
        this._storeLong((_37_ + 488), _33_);
        this._storeLong((_37_ + 480), _34_);
        this._storeInt((_37_ + 476), _35_);
        this._storeInt((_37_ + 472), _36_);
        _36_ = this._storeInt((_37_ + 468), (this._loadInt(((this._loadInt((_37_ + 500))) + 24))));
        this._storeLong((_37_ + 456), (getMask((this._loadInt(((this._loadInt((_37_ + 504))) + 4))), _36_)));
        this._storeInt((_37_ + 452), ((this._loadInt(((_36_ = this._loadInt((_37_ + 504))) + 28))) + ((this._loadInt((_36_ + 20))) * 40)));
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_37_ + 500))) + 22))) != 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_37_ + 500))) + 52))) != 0) {
                break label$0;
            }
            this._storeInt((_37_ + 448), (this._loadInt(((this._loadInt((_37_ + 504))) + 28))));
            label$2:
            do {
                label$1:
                while (true) {
                    if (((this._loadInt((_37_ + 448))) & 4294967295L) >= ((this._loadInt((_37_ + 452))) & 4294967295L)) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._loadInt16u(((this._loadInt((_37_ + 448))) + 16))) != 256) {
                            break label$3;
                        }
                        if ((((this._loadLong(((this._loadInt((_37_ + 448))) + 32))) & ((this._loadLong((_37_ + 456))) ^ -1L)) & (this._loadLong((_37_ + 488)))) != 0L) {
                            break label$3;
                        }
                        if (((this._loadLong(((this._loadInt(((this._loadInt((_37_ + 448))) + 12))) + 352))) & (this._loadLong((_37_ + 456)))) == 0) {
                            break label$3;
                        }
                        this._storeInt((_37_ + 440), ((this._loadInt(((_36_ = this._storeInt((_37_ + 444), (this._loadInt(((this._loadInt((_37_ + 448))) + 12))))) + 28))) + ((this._loadInt((_36_ + 20))) * 40)));
                        this._storeInt((_37_ + 432), 268435456);
                        this._storeLong((_37_ + 408), (this._storeLong((_37_ + 416), (this._storeLong((_37_ + 424), 0L)))));
                        this._storeInt((_37_ + 436), (this._loadInt(((this._loadInt((_37_ + 444))) + 28))));
                        label$5:
                        do {
                            label$4:
                            while (true) {
                                if (((this._loadInt((_37_ + 436))) & 4294967295L) >= ((this._loadInt((_37_ + 440))) & 4294967295L)) {
                                    break label$5;
                                }
                                label$6:
                                do {
                                    label$7:
                                    do {
                                        label$8:
                                        do {
                                            if ((this._loadInt16u(((this._loadInt((_37_ + 436))) + 16))) != 512) {
                                                break label$8;
                                            }
                                            _36_ = this._storeInt((_37_ + 364), (this._loadInt(((this._loadInt((_37_ + 436))) + 12))));
                                            bestIndex((this._loadInt((_37_ + 508))), _36_, (this._loadInt((_37_ + 500))), (this._loadLong((_37_ + 488))), (this._loadLong((_37_ + 480))), 0, (_37_ + 368));
                                            break label$7;
                                        }
                                        while (false);
                                        if ((this._loadInt(((this._loadInt((_37_ + 436))) + 8))) != (this._loadInt((_37_ + 468)))) {
                                            break label$6;
                                        }
                                        this._storeInt((_37_ + 8), (this._loadInt((this._loadInt((_37_ + 504))))));
                                        this._storeInt((_37_ + 12), (this._loadInt(((this._loadInt((_37_ + 504))) + 4))));
                                        this._storeInt8((_37_ + 24), 69);
                                        this._storeInt((_37_ + 36), (this._loadInt((_37_ + 436))));
                                        this._storeInt((_37_ + 28), 1);
                                        bestIndex((this._loadInt((_37_ + 508))), (_37_ + 8), (this._loadInt((_37_ + 500))), (this._loadLong((_37_ + 488))), (this._loadLong((_37_ + 480))), 0, (_37_ + 368));
                                    }
                                    while (false);
                                    this._storeDouble((_37_ + 424), ((this._loadDouble((_37_ + 424))) + (this._loadDouble((_37_ + 392)))));
                                    this._storeDouble((_37_ + 416), ((this._loadDouble((_37_ + 416))) + (this._loadDouble((_37_ + 376)))));
                                    this._storeLong((_37_ + 408), ((this._loadLong((_37_ + 408))) | (this._loadLong((_37_ + 400)))));
                                    if ((this._loadDouble((_37_ + 424))) >= (this._loadDouble(((this._loadInt((_37_ + 472))) + 24)))) {
                                        break label$5;
                                    }
                                }
                                while (false);
                                this._storeInt((_37_ + 436), ((this._loadInt((_37_ + 436))) + 40));
                                continue label$4;
                            }
                        }
                        while (false);
                        label$9:
                        do {
                            if ((this._loadInt((_37_ + 476))) == 0) {
                                break label$9;
                            }
                            _38_ = estLog((_39_ = this._loadDouble((_37_ + 416))));
                            this._storeDouble((_37_ + 424), ((this._loadDouble((_37_ + 424))) + (_39_ * _38_)));
                        }
                        while (false);
                        if (((((_39_ = this._loadDouble((_37_ + 424))) >= (_38_ = this._loadDouble(((this._loadInt((_37_ + 472))) + 24)))) ? 1 : 0) | (((_39_ != _39_) ? 1 : 0) | ((_38_ != _38_) ? 1 : 0))) != 0) {
                            break label$3;
                        }
                        this._storeLong(((_36_ = this._loadInt((_37_ + 472))) + 32), (this._loadLong((_37_ + 408))));
                        this._storeDouble((_36_ + 24), (this._loadDouble((_37_ + 424))));
                        this._storeDouble(((this._loadInt((_37_ + 472))) + 8), (this._loadDouble((_37_ + 416))));
                        this._storeInt((this._loadInt((_37_ + 472))), (this._loadInt((_37_ + 432))));
                        this._storeInt(((this._loadInt((_37_ + 472))) + 16), (this._loadInt((_37_ + 448))));
                    }
                    while (false);
                    this._storeInt((_37_ + 448), ((this._loadInt((_37_ + 448))) + 40));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt((0 + 4), (_37_ + 512));
        return;
    }

    @Override()
    public final void bestAutomaticIndex(int _30_, int _31_, int _32_, long _33_, int _34_)
    {
        double _35_ = 0.0;
        int _36_ = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 76), _30_);
        this._storeInt((_36_ + 72), _31_);
        this._storeInt((_36_ + 68), _32_);
        this._storeLong((_36_ + 56), _33_);
        this._storeInt((_36_ + 52), _34_);
        label$0:
        do {
            if (((this._loadInt8u(((this._loadInt((this._loadInt((_36_ + 76))))) + 15))) & 8) == 0) {
                break label$0;
            }
            if (((this._loadInt((this._loadInt((_36_ + 52))))) & 269430784) != 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_36_ + 68))) + 22))) != 0) {
                break label$0;
            }
            if ((this._storeDouble((_36_ + 24), (((_35_ = this._storeDouble((_36_ + 32), (estLog((this._storeDouble((_36_ + 40), ((double) ((this._loadInt(((this._storeInt((_36_ + 12), (this._loadInt(((this._loadInt((_36_ + 68))) + 12))))) + 24))) & 4294967295L)))))))) + _35_) * (((this._loadDouble((_36_ + 40))) / (this._loadDouble(((this._loadInt((_36_ + 76))) + 448)))) + 1.0)))) >= (this._loadDouble(((this._loadInt((_36_ + 52))) + 24)))) {
                break label$0;
            }
            this._storeInt((_36_ + 16), ((this._loadInt(((_34_ = this._loadInt((_36_ + 72))) + 28))) + ((this._loadInt((_34_ + 20))) * 40)));
            this._storeInt((_36_ + 20), (this._loadInt(((this._loadInt((_36_ + 72))) + 28))));
            label$2:
            do {
                label$1:
                while (true) {
                    if (((this._loadInt((_36_ + 20))) & 4294967295L) >= ((this._loadInt((_36_ + 16))) & 4294967295L)) {
                        break label$0;
                    }
                    if ((termCanDriveIndex((this._loadInt((_36_ + 20))), (this._loadInt((_36_ + 68))), (this._loadLong((_36_ + 56))))) != 0) {
                        break label$2;
                    }
                    this._storeInt((_36_ + 20), ((this._loadInt((_36_ + 20))) + 40));
                    continue label$1;
                }
            }
            while (false);
            this._storeDouble(((_34_ = this._loadInt((_36_ + 52))) + 24), (this._loadDouble((_36_ + 24))));
            this._storeDouble((_34_ + 8), ((this._loadDouble((_36_ + 32))) + 1.0));
            this._storeInt((this._loadInt((_36_ + 52))), 536870912);
            this._storeLong(((this._loadInt((_36_ + 52))) + 32), (this._loadLong(((this._loadInt((_36_ + 20))) + 24))));
        }
        while (false);
        this._storeInt((0 + 4), (_36_ + 80));
        return;
    }

    @Override()
    public final void bestIndex(
            int _30_,
            int _31_,
            int _32_,
            long _33_,
            long _34_,
            int _35_,
            int _36_)
    {
        int _37_ = 0;
        this._storeInt(((_37_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_37_ + 40), _31_);
        this._storeInt((_37_ + 36), _32_);
        this._storeLong((_37_ + 24), _33_);
        this._storeLong((_37_ + 16), _34_);
        this._storeInt((_37_ + 12), _35_);
        this._storeInt((_37_ + 8), _36_);
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt8u(((this._loadInt(((this._loadInt((_37_ + 36))) + 12))) + 34))) & 16) == 0) {
                    break label$1;
                }
                this._storeInt((_37_ + 4), 0);
                bestVirtualIndex((this._loadInt((_37_ + 44))), (this._loadInt((_37_ + 40))), (this._loadInt((_37_ + 36))), (this._loadLong((_37_ + 24))), (this._loadLong((_37_ + 16))), (this._loadInt((_37_ + 12))), (this._loadInt((_37_ + 8))), (_37_ + 4));
                label$2:
                do {
                    if ((this._loadInt(((this._loadInt((_37_ + 4))) + 28))) == 0) {
                        break label$2;
                    }
                    sqlite3_free((this._loadInt(((this._loadInt((_37_ + 4))) + 24))));
                }
                while (false);
                sqlite3DbFree((this._loadInt((this._loadInt((_37_ + 44))))), (this._loadInt((_37_ + 4))));
                break label$0;
            }
            while (false);
            bestBtreeIndex((this._loadInt((_37_ + 44))), (this._loadInt((_37_ + 40))), (this._loadInt((_37_ + 36))), (this._loadLong((_37_ + 24))), (this._loadLong((_37_ + 16))), (this._loadInt((_37_ + 12))), (this._loadInt((_37_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_37_ + 48));
        return;
    }

    @Override()
    public final int referencesOtherTables(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_34_ + 20), _31_);
        this._storeInt((_34_ + 16), _32_);
        this._storeInt((_34_ + 12), _33_);
        this._storeLong(_34_, ((getMask((this._loadInt((_34_ + 20))), _33_)) ^ -1L));
        label$0:
        do {
            label$1:
            do {
                label$2$end:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt((_34_ + 16))) >= (this._loadInt((this._loadInt((_34_ + 24)))))) {
                            break label$1;
                        }
                        _33_ = this._loadInt((_34_ + 20));
                        this._storeInt((_34_ + 16), ((_32_ = this._loadInt((_34_ + 16))) + 1));
                        if (((exprTableUsage(_33_, (this._loadInt(((this._loadInt(((this._loadInt((_34_ + 24))) + 12))) + (_32_ * 20)))))) & (this._loadLong(_34_))) == 0) {
                            continue label$2;
                        }
                        break label$2$end;
                    }
                }
                while (false);
                this._storeInt((_34_ + 28), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 28), 0);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 28));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final long exprTableUsage(int _30_, int _31_)
    {
        int _32_ = 0;
        long _33_ = 0L;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 20), _30_);
        this._storeInt((_32_ + 16), _31_);
        _33_ = this._storeLong((_32_ + 8), 0L);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_32_ + 16))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt8u((this._loadInt((_32_ + 16))))) != 152) {
                        break label$1;
                    }
                    this._storeLong((_32_ + 24), (this._storeLong((_32_ + 8), (getMask((this._loadInt((_32_ + 20))), (this._loadInt(((this._loadInt((_32_ + 16))) + 24))))))));
                    break label$0;
                }
                while (false);
                this._storeLong((_32_ + 24), _33_);
                break label$0;
            }
            while (false);
            this._storeLong((_32_ + 8), (exprTableUsage((this._loadInt((_32_ + 20))), (this._loadInt(((this._loadInt((_32_ + 16))) + 12))))));
            this._storeLong((_32_ + 8), ((exprTableUsage((this._loadInt((_32_ + 20))), (this._loadInt(((this._loadInt((_32_ + 16))) + 8))))) | (this._loadLong((_32_ + 8)))));
            label$3:
            do {
                label$4:
                do {
                    if (((this._loadInt16u(((this._loadInt((_32_ + 16))) + 2))) & 2048) == 0) {
                        break label$4;
                    }
                    this._storeLong((_32_ + 8), ((exprSelectTableUsage((this._loadInt((_32_ + 20))), (this._loadInt(((this._loadInt((_32_ + 16))) + 16))))) | (this._loadLong((_32_ + 8)))));
                    break label$3;
                }
                while (false);
                this._storeLong((_32_ + 8), ((exprListTableUsage((this._loadInt((_32_ + 20))), (this._loadInt(((this._loadInt((_32_ + 16))) + 16))))) | (this._loadLong((_32_ + 8)))));
            }
            while (false);
            this._storeLong((_32_ + 24), (this._loadLong((_32_ + 8))));
        }
        while (false);
        _33_ = this._loadLong((_32_ + 24));
        this._storeInt((0 + 4), (_32_ + 32));
        return _33_;
    }

    @Override()
    public final long exprSelectTableUsage(int _30_, int _31_)
    {
        int _32_ = 0;
        long _33_ = 0L;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeLong(_32_, 0L);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 8))) == 0) {
                    break label$1;
                }
                this._storeLong(_32_, ((exprListTableUsage((this._loadInt((_32_ + 12))), (this._loadInt((this._loadInt((_32_ + 8))))))) | (this._loadLong(_32_))));
                this._storeLong(_32_, ((exprListTableUsage((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 16))))) | (this._loadLong(_32_))));
                this._storeLong(_32_, ((exprListTableUsage((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 24))))) | (this._loadLong(_32_))));
                this._storeLong(_32_, ((exprTableUsage((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 12))))) | (this._loadLong(_32_))));
                this._storeLong(_32_, ((exprTableUsage((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 20))))) | (this._loadLong(_32_))));
                this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((_32_ + 8))) + 28))));
                continue label$0;
            }
        }
        while (false);
        _33_ = this._loadLong(_32_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _33_;
    }

    @Override()
    public final long exprListTableUsage(int _30_, int _31_)
    {
        int _32_ = 0;
        long _33_ = 0L;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeLong((_32_ + 8), 0L);
        label$0:
        do {
            if ((this._loadInt((_32_ + 24))) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 20), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 20))) >= (this._loadInt((this._loadInt((_32_ + 24)))))) {
                        break label$2;
                    }
                    this._storeLong((_32_ + 8), ((exprTableUsage((this._loadInt((_32_ + 28))), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 24))) + 12))) + ((this._loadInt((_32_ + 20))) * 20)))))) | (this._loadLong((_32_ + 8)))));
                    this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        _33_ = this._loadLong((_32_ + 8));
        this._storeInt((0 + 4), (_32_ + 32));
        return _33_;
    }

    @Override()
    public final int allocateIndexInfo(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_34_ + 52), _31_);
        this._storeInt((_34_ + 48), _32_);
        this._storeInt((_34_ + 44), _33_);
        this._storeInt((_34_ + 40), (this._storeInt((_34_ + 32), 0)));
        this._storeInt((_34_ + 16), (this._loadInt(((this._loadInt((_34_ + 52))) + 28))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_34_ + 40))) >= (this._loadInt(((this._loadInt((_34_ + 52))) + 20)))) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt(((this._loadInt((_34_ + 16))) + 8))) != (this._loadInt(((this._loadInt((_34_ + 48))) + 24)))) {
                        break label$2;
                    }
                    if (((this._loadInt16u(((this._loadInt((_34_ + 16))) + 16))) & 129) != 0) {
                        break label$2;
                    }
                    this._storeInt((_34_ + 32), ((this._loadInt((_34_ + 32))) + 1));
                }
                while (false);
                this._storeInt((_34_ + 40), ((this._loadInt((_34_ + 40))) + 1));
                this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) + 40));
                continue label$0;
            }
        }
        while (false);
        _33_ = this._storeInt((_34_ + 12), 0);
        label$3:
        do {
            if ((this._loadInt((_34_ + 44))) == 0) {
                break label$3;
            }
            this._storeInt((_34_ + 40), _33_);
            label$5:
            do {
                label$4:
                while (true) {
                    if ((this._loadInt((_34_ + 40))) >= (this._loadInt((this._loadInt((_34_ + 44)))))) {
                        break label$5;
                    }
                    if ((this._loadInt8u((this._storeInt((_34_ + 4), (this._loadInt(((this._loadInt(((this._loadInt((_34_ + 44))) + 12))) + ((this._loadInt((_34_ + 40))) * 20)))))))) != 152) {
                        break label$5;
                    }
                    if ((this._loadInt(((this._loadInt((_34_ + 4))) + 24))) != (this._loadInt(((this._loadInt((_34_ + 48))) + 24)))) {
                        break label$5;
                    }
                    this._storeInt((_34_ + 40), ((this._loadInt((_34_ + 40))) + 1));
                    continue label$4;
                }
            }
            while (false);
            if ((this._loadInt((_34_ + 40))) != (this._loadInt((this._loadInt((_34_ + 44)))))) {
                break label$3;
            }
            this._storeInt((_34_ + 12), (this._loadInt((this._loadInt((_34_ + 44))))));
        }
        while (false);
        label$6:
        do {
            label$7:
            do {
                if ((this._storeInt((_34_ + 8), (sqlite3DbMallocZero((this._loadInt((this._loadInt((_34_ + 56))))), ((((this._loadInt((_34_ + 32))) * 20) + ((this._loadInt((_34_ + 12))) << 3)) + 48))))) == 0) {
                    break label$7;
                }
                this._storeInt((_34_ + 20), ((this._storeInt((_34_ + 24), ((this._storeInt((_34_ + 28), ((this._loadInt((_34_ + 8))) + 48))) + ((this._loadInt((_34_ + 32))) * 12)))) + ((this._loadInt((_34_ + 12))) << 3)));
                this._storeInt((_33_ = this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 32))));
                this._storeInt((_33_ + 8), (this._loadInt((_34_ + 12))));
                this._storeInt(((this._loadInt((_34_ + 8))) + 4), (this._loadInt((_34_ + 28))));
                this._storeInt(((this._loadInt((_34_ + 8))) + 12), (this._loadInt((_34_ + 24))));
                this._storeInt(((this._loadInt((_34_ + 8))) + 16), (this._loadInt((_34_ + 20))));
                this._storeInt((_34_ + 40), (this._storeInt((_34_ + 36), 0)));
                this._storeInt((_34_ + 16), (this._loadInt(((this._loadInt((_34_ + 52))) + 28))));
                label$9:
                do {
                    label$8:
                    while (true) {
                        if ((this._loadInt((_34_ + 40))) >= (this._loadInt(((this._loadInt((_34_ + 52))) + 20)))) {
                            break label$9;
                        }
                        label$10:
                        do {
                            if ((this._loadInt(((this._loadInt((_34_ + 16))) + 8))) != (this._loadInt(((this._loadInt((_34_ + 48))) + 24)))) {
                                break label$10;
                            }
                            if (((this._loadInt16u(((this._loadInt((_34_ + 16))) + 16))) & 129) != 0) {
                                break label$10;
                            }
                            this._storeInt((_33_ = (this._loadInt((_34_ + 28))) + ((this._loadInt((_34_ + 36))) * 12)), (this._loadInt(((this._loadInt((_34_ + 16))) + 12))));
                            this._storeInt((_33_ + 8), (this._loadInt((_34_ + 40))));
                            this._storeInt8((((this._loadInt((_34_ + 28))) + ((this._loadInt((_34_ + 36))) * 12)) + 4), (this._loadInt8u(((this._loadInt((_34_ + 16))) + 16))));
                            this._storeInt((_34_ + 36), ((this._loadInt((_34_ + 36))) + 1));
                        }
                        while (false);
                        this._storeInt((_34_ + 40), ((this._loadInt((_34_ + 40))) + 1));
                        this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) + 40));
                        continue label$8;
                    }
                }
                while (false);
                this._storeInt((_34_ + 40), 0);
                label$12:
                do {
                    label$11:
                    while (true) {
                        if ((this._loadInt((_34_ + 40))) >= (this._loadInt((_34_ + 12)))) {
                            break label$12;
                        }
                        _33_ = this._storeInt(_34_, (this._loadInt(((this._loadInt(((this._loadInt((_34_ + 44))) + 12))) + ((this._loadInt((_34_ + 40))) * 20)))));
                        this._storeInt(((_32_ = this._loadInt((_34_ + 24))) + ((this._loadInt((_34_ + 40))) << 3)), (this._loadInt16s((_33_ + 28))));
                        this._storeInt8(((_32_ + ((_33_ = this._loadInt((_34_ + 40))) << 3)) + 4), (this._loadInt8u((((this._loadInt(((this._loadInt((_34_ + 44))) + 12))) + (_33_ * 20)) + 12))));
                        this._storeInt((_34_ + 40), ((this._loadInt((_34_ + 40))) + 1));
                        continue label$11;
                    }
                }
                while (false);
                this._storeInt((_34_ + 60), (this._loadInt((_34_ + 8))));
                break label$6;
            }
            while (false);
            sqlite3ErrorMsg((this._loadInt((_34_ + 56))), 29616, 0);
            this._storeInt((_34_ + 60), 0);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 60));
        this._storeInt((0 + 4), (_34_ + 64));
        return _33_;
    }

    @Override()
    public final int vtabBestIndex(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_33_ + 56), _31_);
        this._storeInt((_33_ + 52), _32_);
        label$0:
        do {
            if ((this._storeInt((_33_ + 40), (this._iiiTable[this._tableIndices[this._loadInt(((this._loadInt((_32_ = this._storeInt((_33_ + 48), (this._loadInt(((sqlite3GetVTable((this._loadInt((this._loadInt((_33_ + 60))))), (this._loadInt((_33_ + 56))))) + 8))))))) + 12))]].invoke(_32_, (this._loadInt((_33_ + 52))))))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt((_33_ + 40))) != 7) {
                    break label$1;
                }
                this._storeInt8(((this._loadInt((this._loadInt((_33_ + 60))))) + 30), 1);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt(((this._loadInt((_33_ + 48))) + 8))) == 0) {
                    break label$2;
                }
                _32_ = this._loadInt((_33_ + 60));
                this._storeInt((_33_ + 16), (this._loadInt(((this._loadInt((_33_ + 48))) + 8))));
                sqlite3ErrorMsg(_32_, 22192, (_33_ + 16));
                break label$0;
            }
            while (false);
            _32_ = this._loadInt((_33_ + 60));
            this._storeInt((_33_ + 32), (sqlite3ErrStr((this._loadInt((_33_ + 40))))));
            sqlite3ErrorMsg(_32_, 22192, (_33_ + 32));
        }
        while (false);
        sqlite3_free((this._loadInt(((this._loadInt((_33_ + 48))) + 8))));
        this._storeInt((_33_ + 44), (this._storeInt(((this._loadInt((_33_ + 48))) + 8), 0)));
        label$4:
        do {
            label$3:
            while (true) {
                if ((this._loadInt((_33_ + 44))) >= (this._loadInt((this._loadInt((_33_ + 52)))))) {
                    break label$4;
                }
                label$5:
                do {
                    if ((this._loadInt8u((((this._loadInt(((this._loadInt((_33_ + 52))) + 4))) + ((this._loadInt((_33_ + 44))) * 12)) + 5))) != 0) {
                        break label$5;
                    }
                    if ((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 52))) + 16))) + ((this._loadInt((_33_ + 44))) << 3)))) < 1) {
                        break label$5;
                    }
                    _32_ = this._loadInt((_33_ + 60));
                    this._storeInt(_33_, (this._loadInt((this._loadInt((_33_ + 56))))));
                    sqlite3ErrorMsg(_32_, 46528, _33_);
                }
                while (false);
                this._storeInt((_33_ + 44), ((this._loadInt((_33_ + 44))) + 1));
                continue label$3;
            }
        }
        while (false);
        _32_ = this._loadInt(((this._loadInt((_33_ + 60))) + 64));
        this._storeInt((0 + 4), (_33_ + 64));
        return _32_;
    }

    @Override()
    public final void exprAnalyze(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 192))) + 188), _30_);
        this._storeInt((_33_ + 184), _31_);
        this._storeInt((_33_ + 180), _32_);
        this._storeLong((_33_ + 144), 0L);
        this._storeInt((_33_ + 132), (this._storeInt((_33_ + 136), (this._storeInt((_33_ + 140), 0)))));
        this._storeInt((_33_ + 124), (this._loadInt((this._loadInt((_33_ + 184))))));
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt((_33_ + 120), (this._loadInt((this._loadInt((_33_ + 124))))))) + 30))) != 0) {
                break label$0;
            }
            this._storeInt((_33_ + 176), ((this._loadInt(((this._loadInt((_33_ + 184))) + 28))) + ((this._loadInt((_33_ + 180))) * 40)));
            this._storeInt((_33_ + 172), (this._loadInt(((this._loadInt((_33_ + 184))) + 4))));
            _32_ = this._storeInt((_33_ + 168), (this._loadInt((this._loadInt((_33_ + 176))))));
            this._storeLong((_33_ + 160), (exprTableUsage((this._loadInt((_33_ + 172))), (this._loadInt((_32_ + 8))))));
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        label$4:
                        do {
                            if ((this._storeInt((_33_ + 128), (this._loadInt8u((this._loadInt((_33_ + 168))))))) != 72) {
                                break label$4;
                            }
                            if (((this._loadInt16u(((this._loadInt((_33_ + 168))) + 2))) & 2048) == 0) {
                                break label$3;
                            }
                            _34_ = exprSelectTableUsage((this._loadInt((_33_ + 172))), (this._loadInt(((this._loadInt((_33_ + 168))) + 16))));
                            this._storeLong(((this._loadInt((_33_ + 176))) + 24), _34_);
                            break label$1;
                        }
                        while (false);
                        if ((this._loadInt((_33_ + 128))) != 73) {
                            break label$2;
                        }
                        this._storeLong(((this._loadInt((_33_ + 176))) + 24), 0L);
                        break label$1;
                    }
                    while (false);
                    _34_ = exprListTableUsage((this._loadInt((_33_ + 172))), (this._loadInt(((this._loadInt((_33_ + 168))) + 16))));
                    this._storeLong(((this._loadInt((_33_ + 176))) + 24), _34_);
                    break label$1;
                }
                while (false);
                _34_ = exprTableUsage((this._loadInt((_33_ + 172))), (this._loadInt(((this._loadInt((_33_ + 168))) + 12))));
                this._storeLong(((this._loadInt((_33_ + 176))) + 24), _34_);
            }
            while (false);
            this._storeLong((_33_ + 152), (exprTableUsage((this._loadInt((_33_ + 172))), (this._loadInt((_33_ + 168))))));
            label$5:
            do {
                if (((this._loadInt16u(((this._loadInt((_33_ + 168))) + 2))) & 1) == 0) {
                    break label$5;
                }
                this._storeLong((_33_ + 152), ((this._storeLong((_33_ + 112), (getMask((this._loadInt((_33_ + 172))), (this._loadInt16s(((this._loadInt((_33_ + 168))) + 32))))))) | (this._loadLong((_33_ + 152)))));
                this._storeLong((_33_ + 144), ((this._loadLong((_33_ + 112))) + -1L));
            }
            while (false);
            _31_ = this._storeInt(((_32_ = this._loadInt((_33_ + 176))) + 8), -1);
            this._storeLong((_32_ + 32), (this._loadLong((_33_ + 152))));
            this._storeInt((_32_ + 4), _31_);
            this._storeInt16(((this._loadInt((_33_ + 176))) + 16), 0);
            label$6:
            do {
                label$7:
                do {
                    label$8:
                    do {
                        if ((allowedOp((this._loadInt((_33_ + 128))))) == 0) {
                            break label$8;
                        }
                        if (((this._loadLong(((this._loadInt((_33_ + 176))) + 24))) & (this._loadLong((_33_ + 160)))) == 0L) {
                            break label$7;
                        }
                    }
                    while (false);
                    label$9:
                    do {
                        if ((this._loadInt8u((this._loadInt((_33_ + 168))))) != 71) {
                            break label$9;
                        }
                        if ((this._loadInt8u(((this._loadInt((_33_ + 184))) + 16))) != 69) {
                            break label$9;
                        }
                        this._storeInt((_33_ + 88), (this._loadInt(((this._loadInt((_33_ + 168))) + 16))));
                        _32_ = this._storeInt((_33_ + 84), 0);
                        label$11:
                        do {
                            label$10:
                            while (true) {
                                if ((this._loadInt((_33_ + 84))) > 1) {
                                    break label$11;
                                }
                                _31_ = this._storeInt((_33_ + 80), (sqlite3PExpr((this._loadInt((_33_ + 124))), (this._loadInt8u(((this._loadInt((_33_ + 84))) + 46576))), (sqlite3ExprDup((this._loadInt((_33_ + 120))), (this._loadInt(((this._loadInt((_33_ + 168))) + 8))), _32_)), (sqlite3ExprDup((this._loadInt((_33_ + 120))), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 88))) + 12))) + ((this._loadInt((_33_ + 84))) * 20)))), _32_)), _32_)));
                                _31_ = this._storeInt((_33_ + 76), (whereClauseInsert((this._loadInt((_33_ + 184))), _31_, 3)));
                                exprAnalyze((this._loadInt((_33_ + 188))), (this._loadInt((_33_ + 184))), _31_);
                                this._storeInt((_33_ + 176), ((this._loadInt(((this._loadInt((_33_ + 184))) + 28))) + ((this._loadInt((_33_ + 180))) * 40)));
                                this._storeInt((((this._loadInt(((this._loadInt((_33_ + 184))) + 28))) + ((this._loadInt((_33_ + 76))) * 40)) + 4), (this._loadInt((_33_ + 180))));
                                this._storeInt((_33_ + 84), ((this._loadInt((_33_ + 84))) + 1));
                                continue label$10;
                            }
                        }
                        while (false);
                        this._storeInt8(((this._loadInt((_33_ + 176))) + 19), 2);
                        break label$6;
                    }
                    while (false);
                    if ((this._loadInt8u((this._loadInt((_33_ + 168))))) != 68) {
                        break label$6;
                    }
                    exprAnalyzeOrTerm((this._loadInt((_33_ + 188))), (this._loadInt((_33_ + 184))), (this._loadInt((_33_ + 180))));
                    this._storeInt((_33_ + 176), ((this._loadInt(((this._loadInt((_33_ + 184))) + 28))) + ((this._loadInt((_33_ + 180))) * 40)));
                    break label$6;
                }
                while (false);
                this._storeInt((_33_ + 108), (this._loadInt(((this._loadInt((_33_ + 168))) + 8))));
                this._storeInt((_33_ + 104), (this._loadInt(((this._loadInt((_33_ + 168))) + 12))));
                label$12:
                do {
                    if ((this._loadInt8u((this._loadInt((_33_ + 108))))) != 152) {
                        break label$12;
                    }
                    this._storeInt(((_32_ = this._loadInt((_33_ + 176))) + 8), (this._loadInt(((_31_ = this._loadInt((_33_ + 108))) + 24))));
                    this._storeInt((_32_ + 12), (this._loadInt16s((_31_ + 28))));
                    _32_ = operatorMask((this._loadInt((_33_ + 128))));
                    this._storeInt16(((this._loadInt((_33_ + 176))) + 16), _32_);
                }
                while (false);
                if ((this._loadInt((_33_ + 104))) == 0) {
                    break label$6;
                }
                if ((this._loadInt8u((this._loadInt((_33_ + 104))))) != 152) {
                    break label$6;
                }
                label$13:
                do {
                    label$14:
                    do {
                        label$15:
                        do {
                            if ((this._loadInt(((this._loadInt((_33_ + 176))) + 8))) < 0) {
                                break label$15;
                            }
                            this._storeInt((_33_ + 96), (sqlite3ExprDup((this._loadInt((_33_ + 120))), (this._loadInt((_33_ + 168))), 0)));
                            if ((this._loadInt8u(((this._loadInt((_33_ + 120))) + 30))) == 0) {
                                break label$14;
                            }
                            sqlite3ExprDelete((this._loadInt((_33_ + 120))), (this._loadInt((_33_ + 96))));
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_33_ + 96), (this._loadInt((_33_ + 168))));
                        this._storeInt((_33_ + 100), (this._loadInt((_33_ + 176))));
                        break label$13;
                    }
                    while (false);
                    if ((this._storeInt((_33_ + 92), (whereClauseInsert((this._loadInt((_33_ + 184))), (this._loadInt((_33_ + 96))), 3)))) == 0) {
                        break label$0;
                    }
                    _32_ = this._storeInt(((this._storeInt((_33_ + 100), ((this._loadInt(((this._loadInt((_33_ + 184))) + 28))) + ((this._loadInt((_33_ + 92))) * 40)))) + 4), (this._loadInt((_33_ + 180))));
                    this._storeInt8(((_32_ = (this._loadInt(((this._loadInt((_33_ + 184))) + 28))) + (_32_ * 40)) + 19), 1);
                    this._storeInt((_33_ + 176), _32_);
                    this._storeInt8(((_32_ = this._loadInt((_33_ + 176))) + 18), ((this._loadInt8u((_32_ + 18))) | 8));
                }
                while (false);
                exprCommute((this._loadInt((_33_ + 124))), (this._loadInt((_33_ + 96))));
                _32_ = this._storeInt((_33_ + 108), (this._loadInt(((this._loadInt((_33_ + 96))) + 8))));
                this._storeInt(((this._loadInt((_33_ + 100))) + 8), (this._loadInt((_32_ + 24))));
                this._storeInt(((this._loadInt((_33_ + 100))) + 12), (this._loadInt16s(((this._loadInt((_33_ + 108))) + 28))));
                this._storeLong(((this._loadInt((_33_ + 100))) + 24), ((this._loadLong((_33_ + 160))) | (this._loadLong((_33_ + 144)))));
                this._storeLong(((this._loadInt((_33_ + 100))) + 32), (this._loadLong((_33_ + 152))));
                _32_ = operatorMask((this._loadInt8u((this._loadInt((_33_ + 96))))));
                this._storeInt16(((this._loadInt((_33_ + 100))) + 16), _32_);
            }
            while (false);
            label$16:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 184))) + 16))) != 69) {
                    break label$16;
                }
                if ((isLikeOrGlob((this._loadInt((_33_ + 124))), (this._loadInt((_33_ + 168))), (_33_ + 140), (_33_ + 136), (_33_ + 132))) == 0) {
                    break label$16;
                }
                this._storeInt((_33_ + 72), (this._loadInt(((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 168))) + 16))) + 12))) + 20))));
                this._storeInt((_33_ + 68), (sqlite3ExprDup((this._loadInt((_33_ + 120))), (this._loadInt((_33_ + 140))), 0)));
                label$17:
                do {
                    if ((this._loadInt8u(((this._loadInt((_33_ + 120))) + 30))) != 0) {
                        break label$17;
                    }
                    this._storeInt((_33_ + 40), (((sqlite3Strlen30((this._loadInt(((this._loadInt((_33_ + 68))) + 4))))) + (this._loadInt(((this._loadInt((_33_ + 68))) + 4)))) + -1));
                    this._storeInt8((_33_ + 47), (this._loadInt8u((this._loadInt((_33_ + 40))))));
                    label$18:
                    do {
                        if ((this._loadInt((_33_ + 132))) == 0) {
                            break label$18;
                        }
                        label$19:
                        do {
                            if ((this._loadInt8u((_33_ + 47))) != 64) {
                                break label$19;
                            }
                            this._storeInt((_33_ + 136), 0);
                        }
                        while (false);
                        this._storeInt8((_33_ + 47), (this._loadInt8u(((this._loadInt8u((_33_ + 47))) + 19872))));
                    }
                    while (false);
                    this._storeInt8((this._loadInt((_33_ + 40))), ((this._loadInt8u((_33_ + 47))) + 1));
                }
                while (false);
                _temp$0 = 31072;
                _temp$1 = 31040;
                _temp$2 = ((this._loadInt((_33_ + 132))) != 0) ? _temp$0 : _temp$1;
                _temp$2 = sqlite3FindCollSeq((this._loadInt((_33_ + 120))), 1, _temp$2, 0);
                this._storeInt((_33_ + 48), _temp$2);
                _32_ = this._storeInt((_33_ + 64), (sqlite3PExpr((this._loadInt((_33_ + 124))), 80, (sqlite3ExprSetColl((sqlite3ExprDup((this._loadInt((_33_ + 120))), (this._loadInt((_33_ + 72))), 0)), (this._loadInt((_33_ + 48))))), (this._loadInt((_33_ + 140))), 0)));
                _32_ = this._storeInt((_33_ + 56), (whereClauseInsert((this._loadInt((_33_ + 184))), _32_, 3)));
                exprAnalyze((this._loadInt((_33_ + 188))), (this._loadInt((_33_ + 184))), _32_);
                _32_ = this._storeInt((_33_ + 60), (sqlite3PExpr((this._loadInt((_33_ + 124))), 79, (sqlite3ExprSetColl((sqlite3ExprDup((this._loadInt((_33_ + 120))), (this._loadInt((_33_ + 72))), 0)), (this._loadInt((_33_ + 48))))), (this._loadInt((_33_ + 68))), 0)));
                _32_ = this._storeInt((_33_ + 52), (whereClauseInsert((this._loadInt((_33_ + 184))), _32_, 3)));
                exprAnalyze((this._loadInt((_33_ + 188))), (this._loadInt((_33_ + 184))), _32_);
                this._storeInt((_33_ + 176), ((this._loadInt(((this._loadInt((_33_ + 184))) + 28))) + ((this._loadInt((_33_ + 180))) * 40)));
                if ((this._loadInt((_33_ + 136))) == 0) {
                    break label$16;
                }
                _31_ = this._storeInt((((this._loadInt(((_32_ = this._loadInt((_33_ + 184))) + 28))) + ((this._loadInt((_33_ + 56))) * 40)) + 4), (this._loadInt((_33_ + 180))));
                this._storeInt((((this._loadInt((_32_ + 28))) + ((this._loadInt((_33_ + 52))) * 40)) + 4), _31_);
                this._storeInt8(((this._loadInt((_33_ + 176))) + 19), 2);
            }
            while (false);
            label$20:
            do {
                if ((isMatchOfColumn((this._loadInt((_33_ + 168))))) == 0) {
                    break label$20;
                }
                this._storeInt((_33_ + 32), (this._loadInt((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 168))) + 16))) + 12))))));
                this._storeInt((_33_ + 28), (this._loadInt(((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 168))) + 16))) + 12))) + 20))));
                this._storeLong((_33_ + 8), (exprTableUsage((this._loadInt((_33_ + 172))), (this._loadInt((_33_ + 32))))));
                if (((this._storeLong((_33_ + 16), (exprTableUsage((this._loadInt((_33_ + 172))), (this._loadInt((_33_ + 28))))))) & (this._loadLong((_33_ + 8)))) != 0L) {
                    break label$20;
                }
                _32_ = this._storeInt((_33_ + 4), (sqlite3PExpr((this._loadInt((_33_ + 124))), 50, 0, (sqlite3ExprDup((this._loadInt((_33_ + 120))), (this._loadInt((_33_ + 32))), 0)), 0)));
                _32_ = this._storeInt((_33_ + 36), (whereClauseInsert((this._loadInt((_33_ + 184))), _32_, 3)));
                this._storeLong(((_32_ = this._storeInt((_33_ + 24), ((this._loadInt(((this._loadInt((_33_ + 184))) + 28))) + (_32_ * 40)))) + 24), (this._loadLong((_33_ + 8))));
                this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((_33_ + 28))) + 24))));
                this._storeInt(((this._loadInt((_33_ + 24))) + 12), (this._loadInt16s(((this._loadInt((_33_ + 28))) + 28))));
                this._storeInt16(((this._loadInt((_33_ + 24))) + 16), 64);
                this._storeInt(((this._loadInt((_33_ + 24))) + 4), (this._loadInt((_33_ + 180))));
                this._storeInt8(((_32_ = (this._loadInt(((this._loadInt((_33_ + 184))) + 28))) + ((this._loadInt((_33_ + 180))) * 40)) + 19), 1);
                this._storeInt((_33_ + 176), _32_);
                this._storeInt8(((_32_ = this._loadInt((_33_ + 176))) + 18), ((this._loadInt8u((_32_ + 18))) | 8));
                this._storeLong(((this._loadInt((_33_ + 24))) + 32), (this._loadLong(((this._loadInt((_33_ + 176))) + 32))));
            }
            while (false);
            this._storeLong(((_32_ = this._loadInt((_33_ + 176))) + 24), ((this._loadLong((_32_ + 24))) | (this._loadLong((_33_ + 144)))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 192));
        return;
    }

    @Override()
    public final int allowedOp(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 1;
        label$0:
        do {
            if ((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) == 72) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt((_32_ + 12))) < 76) {
                    break label$1;
                }
                if ((this._loadInt((_32_ + 12))) < 81) {
                    break label$0;
                }
            }
            while (false);
            _31_ = ((this._loadInt((_32_ + 12))) == 73) ? 1 : 0;
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int operatorMask(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) != 72) {
                break label$0;
            }
            this._storeInt16((_31_ + 10), 1);
            return (this._loadInt16u((_31_ + 10)));
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_31_ + 12))) != 73) {
                break label$1;
            }
            this._storeInt16((_31_ + 10), 128);
            return (this._loadInt16u((_31_ + 10)));
        }
        while (false);
        this._storeInt16((_31_ + 10), (2 << ((this._loadInt((_31_ + 12))) + -76)));
        return (this._loadInt16u((_31_ + 10)));
    }

    @Override()
    public final int whereClauseInsert(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt8((_33_ + 19), _32_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt(((_32_ = this._loadInt((_33_ + 24))) + 20))) < (this._loadInt((_32_ + 24)))) {
                        break label$2;
                    }
                    this._storeInt((_33_ + 4), (this._loadInt(((this._loadInt((_33_ + 24))) + 28))));
                    _32_ = sqlite3DbMallocRaw((this._storeInt(_33_, (this._loadInt((this._loadInt((this._loadInt((_33_ + 24))))))))), ((this._loadInt(((this._loadInt((_33_ + 24))) + 24))) * 80));
                    if ((this._storeInt(((this._loadInt((_33_ + 24))) + 28), _32_)) == 0) {
                        break label$1;
                    }
                    memcpy((this._loadInt(((_32_ = this._loadInt((_33_ + 24))) + 28))), (this._loadInt((_33_ + 4))), ((this._loadInt((_32_ + 20))) * 40));
                    label$3:
                    do {
                        if ((this._loadInt((_33_ + 4))) == ((this._loadInt((_33_ + 24))) + 32)) {
                            break label$3;
                        }
                        sqlite3DbFree((this._loadInt(_33_)), (this._loadInt((_33_ + 4))));
                    }
                    while (false);
                    _32_ = sqlite3DbMallocSize((this._loadInt(_33_)), (this._loadInt(((this._loadInt((_33_ + 24))) + 28))));
                    this._storeInt(((this._loadInt((_33_ + 24))) + 24), (_32_ / 40));
                }
                while (false);
                this._storeInt(((_32_ = this._loadInt((_33_ + 24))) + 20), ((_32_ = this._loadInt((_32_ + 20))) + 1));
                this._storeInt((_33_ + 8), _32_);
                this._storeInt((_32_ = this._storeInt((_33_ + 12), ((this._loadInt(((this._loadInt((_33_ + 24))) + 28))) + (_32_ * 40)))), (this._loadInt((_33_ + 20))));
                this._storeInt8((_32_ + 18), (this._loadInt8u((_33_ + 19))));
                this._storeInt(((this._loadInt((_33_ + 12))) + 20), (this._loadInt((_33_ + 24))));
                this._storeInt(((this._loadInt((_33_ + 12))) + 4), -1);
                this._storeInt((_33_ + 28), (this._loadInt((_33_ + 8))));
                break label$0;
            }
            while (false);
            label$4:
            do {
                if (((this._loadInt8u((_33_ + 19))) & 1) == 0) {
                    break label$4;
                }
                sqlite3ExprDelete((this._loadInt(_33_)), (this._loadInt((_33_ + 20))));
            }
            while (false);
            this._storeInt(((this._loadInt((_33_ + 24))) + 28), (this._loadInt((_33_ + 4))));
            this._storeInt((_33_ + 28), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final void exprCommute(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt16((_32_ + 22), ((this._loadInt16u(((this._loadInt(((this._storeInt((_32_ + 24), _31_)) + 12))) + 2))) & 256));
        this._storeInt16((_32_ + 20), ((this._loadInt16u(((this._loadInt(((this._loadInt((_32_ + 24))) + 8))) + 2))) & 256));
        _31_ = sqlite3ExprCollSeq((this._loadInt((_32_ + 28))), (this._loadInt(((this._loadInt((_32_ + 24))) + 12))));
        this._storeInt(((this._loadInt(((_30_ = this._loadInt((_32_ + 24))) + 12))) + 20), _31_);
        _31_ = sqlite3ExprCollSeq((this._loadInt((_32_ + 28))), (this._loadInt((_30_ + 8))));
        this._storeInt(((this._loadInt(((_30_ = this._loadInt((_32_ + 24))) + 8))) + 20), _31_);
        this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt((_30_ + 12))) + 20))));
        this._storeInt(((this._loadInt(((_31_ = this._loadInt((_32_ + 24))) + 12))) + 20), (this._loadInt(((this._loadInt((_31_ + 8))) + 20))));
        this._storeInt(((this._loadInt(((this._loadInt((_32_ + 24))) + 8))) + 20), (this._loadInt((_32_ + 16))));
        this._storeInt16(((_31_ = this._loadInt(((this._loadInt((_32_ + 24))) + 12))) + 2), (((this._loadInt16u((_31_ + 2))) & 65279) | (this._loadInt16u((_32_ + 20)))));
        this._storeInt16(((_31_ = this._loadInt(((this._loadInt((_32_ + 24))) + 8))) + 2), (((this._loadInt16u((_31_ + 2))) & 65279) | (this._loadInt16u((_32_ + 22)))));
        this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 24))) + 12))));
        this._storeInt(((_31_ = this._loadInt((_32_ + 24))) + 12), (this._loadInt((_31_ + 8))));
        this._storeInt(((this._loadInt((_32_ + 24))) + 8), (this._loadInt((_32_ + 12))));
        label$0:
        do {
            if ((this._loadInt8u((this._loadInt((_32_ + 24))))) < 77) {
                break label$0;
            }
            this._storeInt8((_31_ = this._loadInt((_32_ + 24))), ((((this._loadInt8u(_31_)) + -77) ^ 2) + 77));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void exprAnalyzeOrTerm(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        int _35_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 144))) + 140), _30_);
        this._storeInt((_35_ + 136), _31_);
        this._storeInt((_35_ + 132), _32_);
        this._storeInt((_35_ + 128), (this._loadInt((this._loadInt((_35_ + 136))))));
        this._storeInt((_35_ + 124), (this._loadInt((this._loadInt((_35_ + 128))))));
        this._storeInt((_35_ + 120), ((this._loadInt(((this._loadInt((_35_ + 136))) + 28))) + ((this._loadInt((_35_ + 132))) * 40)));
        this._storeInt((_35_ + 116), (this._loadInt((this._loadInt((_35_ + 120))))));
        this._storeInt((_35_ + 112), (this._loadInt(((this._loadInt((_35_ + 136))) + 4))));
        _32_ = this._storeInt((_35_ + 96), (sqlite3DbMallocZero((this._loadInt((_35_ + 124))), 360)));
        label$0:
        do {
            if ((this._storeInt(((this._loadInt((_35_ + 120))) + 12), _32_)) == 0) {
                break label$0;
            }
            this._storeInt8(((_32_ = this._loadInt((_35_ + 120))) + 18), ((this._loadInt8u((_32_ + 18))) | 16));
            whereClauseInit((this._storeInt((_35_ + 104), (this._loadInt((_35_ + 96))))), (this._loadInt((this._loadInt((_35_ + 136))))), (this._loadInt((_35_ + 112))));
            whereSplit((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 116))), 68);
            exprAnalyzeAll((this._loadInt((_35_ + 140))), (this._loadInt((_35_ + 104))));
            if ((this._loadInt8u(((this._loadInt((_35_ + 124))) + 30))) != 0) {
                break label$0;
            }
            this._storeLong((_35_ + 88), ((this._storeLong((_35_ + 80), -1L)) ^ (this._loadLong(((this._loadInt((_35_ + 136))) + 8)))));
            this._storeInt((_35_ + 108), ((this._loadInt(((this._loadInt((_35_ + 104))) + 20))) + -1));
            this._storeInt((_35_ + 100), (this._loadInt(((this._loadInt((_35_ + 104))) + 28))));
            label$2:
            do {
                label$1:
                while (true) {
                    _32_ = 0;
                    label$3:
                    do {
                        if ((this._loadInt((_35_ + 108))) < 0) {
                            break label$3;
                        }
                        _32_ = ((this._loadLong((_35_ + 80))) != 0L) ? 1 : 0;
                    }
                    while (false);
                    if (_32_ == 0) {
                        break label$2;
                    }
                    label$4:
                    do {
                        label$5:
                        do {
                            label$6:
                            do {
                                if ((this._loadInt8u(((this._loadInt((_35_ + 100))) + 16))) == 0) {
                                    break label$6;
                                }
                                if (((this._loadInt8u(((this._loadInt((_35_ + 100))) + 18))) & 8) != 0) {
                                    break label$4;
                                }
                                this._storeLong((_35_ + 48), (getMask((this._loadInt((_35_ + 112))), (this._loadInt(((this._loadInt((_35_ + 100))) + 8))))));
                                label$7:
                                do {
                                    if (((this._loadInt8u(((this._loadInt((_35_ + 100))) + 18))) & 2) == 0) {
                                        break label$7;
                                    }
                                    _32_ = this._storeInt((_35_ + 44), ((this._loadInt(((this._loadInt((_35_ + 104))) + 28))) + ((this._loadInt(((this._loadInt((_35_ + 100))) + 4))) * 40)));
                                    this._storeLong((_35_ + 48), ((getMask((this._loadInt((_35_ + 112))), (this._loadInt((_32_ + 8))))) | (this._loadLong((_35_ + 48)))));
                                }
                                while (false);
                                this._storeLong((_35_ + 80), ((this._loadLong((_35_ + 80))) & (this._loadLong((_35_ + 48)))));
                                if ((this._loadInt16u(((this._loadInt((_35_ + 100))) + 16))) == 2) {
                                    break label$5;
                                }
                                this._storeLong((_35_ + 88), 0L);
                                break label$4;
                            }
                            while (false);
                            _34_ = this._storeLong((_35_ + 88), 0L);
                            if ((this._storeInt((_35_ + 76), (sqlite3DbMallocRaw((this._loadInt((_35_ + 124))), 352)))) == 0) {
                                break label$4;
                            }
                            this._storeLong((_35_ + 56), _34_);
                            this._storeInt(((_32_ = this._loadInt((_35_ + 100))) + 12), (this._loadInt((_35_ + 76))));
                            this._storeInt8((_32_ + 18), ((this._loadInt8u((_32_ + 18))) | 32));
                            this._storeInt16(((this._loadInt((_35_ + 100))) + 16), 512);
                            whereClauseInit((this._storeInt((_35_ + 72), (this._loadInt((_35_ + 76))))), (this._loadInt((this._loadInt((_35_ + 136))))), (this._loadInt((_35_ + 112))));
                            whereSplit((this._loadInt((_35_ + 72))), (this._loadInt((this._loadInt((_35_ + 100))))), 69);
                            exprAnalyzeAll((this._loadInt((_35_ + 140))), (this._loadInt((_35_ + 72))));
                            label$8:
                            do {
                                if ((this._loadInt8u(((this._loadInt((_35_ + 124))) + 30))) != 0) {
                                    break label$8;
                                }
                                this._storeInt((_35_ + 64), 0);
                                this._storeInt((_35_ + 68), (this._loadInt(((this._loadInt((_35_ + 72))) + 28))));
                                label$10:
                                do {
                                    label$9:
                                    while (true) {
                                        if ((this._loadInt((_35_ + 64))) >= (this._loadInt(((this._loadInt((_35_ + 72))) + 20)))) {
                                            break label$10;
                                        }
                                        label$11:
                                        do {
                                            if ((allowedOp((this._loadInt8u((this._loadInt((this._loadInt((_35_ + 68))))))))) == 0) {
                                                break label$11;
                                            }
                                            this._storeLong((_35_ + 56), ((getMask((this._loadInt((_35_ + 112))), (this._loadInt(((this._loadInt((_35_ + 68))) + 8))))) | (this._loadLong((_35_ + 56)))));
                                        }
                                        while (false);
                                        this._storeInt((_35_ + 64), ((this._loadInt((_35_ + 64))) + 1));
                                        this._storeInt((_35_ + 68), ((this._loadInt((_35_ + 68))) + 40));
                                        continue label$9;
                                    }
                                }
                                while (false);
                            }
                            while (false);
                            this._storeLong((_35_ + 80), ((this._loadLong((_35_ + 80))) & (this._loadLong((_35_ + 56)))));
                            break label$4;
                        }
                        while (false);
                        this._storeLong((_35_ + 88), ((this._loadLong((_35_ + 88))) & (this._loadLong((_35_ + 48)))));
                    }
                    while (false);
                    this._storeInt((_35_ + 108), ((this._loadInt((_35_ + 108))) + -1));
                    this._storeInt((_35_ + 100), ((this._loadInt((_35_ + 100))) + 40));
                    continue label$1;
                }
            }
            while (false);
            _34_ = this._storeLong(((this._loadInt((_35_ + 96))) + 352), (this._loadLong((_35_ + 80))));
            _temp$0 = 0;
            _temp$1 = 256;
            _temp$2 = (_34_ == 0) ? _temp$0 : _temp$1;
            this._storeInt16(((this._loadInt((_35_ + 120))) + 16), _temp$2);
            if ((this._loadLong((_35_ + 88))) == 0) {
                break label$0;
            }
            _32_ = this._storeInt((_35_ + 40), 0);
            _31_ = this._storeInt((_35_ + 32), (this._storeInt((_35_ + 36), -1)));
            _30_ = this._storeInt((_35_ + 28), _32_);
            label$13:
            do {
                label$12:
                while (true) {
                    _32_ = 0;
                    label$14:
                    do {
                        if ((this._loadInt((_35_ + 28))) > 1) {
                            break label$14;
                        }
                        _32_ = ((this._loadInt((_35_ + 40))) == 0) ? 1 : 0;
                    }
                    while (false);
                    label$15:
                    do {
                        label$16:
                        do {
                            if (_32_ == 0) {
                                break label$16;
                            }
                            this._storeInt((_35_ + 100), (this._loadInt(((this._loadInt((_35_ + 104))) + 28))));
                            this._storeInt((_35_ + 108), ((this._loadInt(((this._loadInt((_35_ + 104))) + 20))) + _31_));
                            label$17:
                            do {
                                label$19:
                                do {
                                    label$18:
                                    while (true) {
                                        if ((this._loadInt((_35_ + 108))) < _30_) {
                                            break label$17;
                                        }
                                        this._storeInt8(((_32_ = this._loadInt((_35_ + 100))) + 18), ((this._loadInt8u((_32_ + 18))) & 191));
                                        label$20:
                                        do {
                                            if ((this._loadInt((_32_ + 8))) == (this._loadInt((_35_ + 32)))) {
                                                break label$20;
                                            }
                                            if (((((this._loadLong((_35_ + 88))) & (getMask((this._loadInt((_35_ + 112))), (this._loadInt(((this._loadInt((_35_ + 100))) + 8)))))) == 0) ? 1 : 0) == 0) {
                                                break label$19;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_35_ + 108), ((this._loadInt((_35_ + 108))) + _31_));
                                        this._storeInt((_35_ + 100), ((this._loadInt((_35_ + 100))) + 40));
                                        continue label$18;
                                    }
                                }
                                while (false);
                                this._storeInt((_35_ + 36), (this._loadInt(((this._loadInt((_35_ + 100))) + 12))));
                                this._storeInt((_35_ + 32), (this._loadInt(((this._loadInt((_35_ + 100))) + 8))));
                            }
                            while (false);
                            if ((this._loadInt((_35_ + 108))) < _30_) {
                                break label$16;
                            }
                            _33_ = this._storeInt((_35_ + 40), 1);
                            label$21:
                            while (true) {
                                _32_ = 0;
                                label$23:
                                do {
                                    if ((this._loadInt((_35_ + 108))) < 0) {
                                        break label$23;
                                    }
                                    _32_ = ((this._loadInt((_35_ + 40))) != _30_) ? 1 : 0;
                                }
                                while (false);
                                if (_32_ == 0) {
                                    break label$15;
                                }
                                label$24:
                                do {
                                    label$25:
                                    do {
                                        if ((this._loadInt(((this._loadInt((_35_ + 100))) + 8))) == (this._loadInt((_35_ + 32)))) {
                                            break label$25;
                                        }
                                        this._storeInt8(((_32_ = this._loadInt((_35_ + 100))) + 18), ((this._loadInt8u((_32_ + 18))) & 191));
                                        break label$24;
                                    }
                                    while (false);
                                    label$26:
                                    do {
                                        if ((this._loadInt(((this._loadInt((_35_ + 100))) + 12))) == (this._loadInt((_35_ + 36)))) {
                                            break label$26;
                                        }
                                        this._storeInt((_35_ + 40), _30_);
                                        break label$24;
                                    }
                                    while (false);
                                    this._storeInt((_35_ + 20), (sqlite3ExprAffinity((this._loadInt(((this._loadInt((this._loadInt((_35_ + 100))))) + 12))))));
                                    this._storeInt((_35_ + 24), (sqlite3ExprAffinity((this._loadInt(((this._loadInt((this._loadInt((_35_ + 100))))) + 8))))));
                                    label$27:
                                    do {
                                        if ((this._loadInt((_35_ + 20))) == 0) {
                                            break label$27;
                                        }
                                        if ((this._loadInt((_35_ + 20))) == (this._loadInt((_35_ + 24)))) {
                                            break label$27;
                                        }
                                        this._storeInt((_35_ + 40), _30_);
                                        break label$24;
                                    }
                                    while (false);
                                    this._storeInt8(((_32_ = this._loadInt((_35_ + 100))) + 18), ((this._loadInt8u((_32_ + 18))) | 64));
                                }
                                while (false);
                                this._storeInt((_35_ + 108), ((this._loadInt((_35_ + 108))) + _31_));
                                this._storeInt((_35_ + 100), ((this._loadInt((_35_ + 100))) + 40));
                                continue label$21;
                            }
                        }
                        while (false);
                        if ((this._loadInt((_35_ + 40))) == 0) {
                            break label$13;
                        }
                        _32_ = this._storeInt((_35_ + 8), (this._storeInt((_35_ + 12), 0)));
                        this._storeInt((_35_ + 108), ((this._loadInt(((this._loadInt((_35_ + 104))) + 20))) + -1));
                        this._storeInt((_35_ + 100), (this._loadInt(((this._loadInt((_35_ + 104))) + 28))));
                        label$29:
                        do {
                            label$28:
                            while (true) {
                                if ((this._loadInt((_35_ + 108))) < _32_) {
                                    break label$29;
                                }
                                label$30:
                                do {
                                    if (((this._loadInt8u(((this._loadInt((_35_ + 100))) + 18))) & 64) == 0) {
                                        break label$30;
                                    }
                                    _31_ = this._storeInt((_35_ + 16), (sqlite3ExprDup((this._loadInt((_35_ + 124))), (this._loadInt(((this._loadInt((this._loadInt((_35_ + 100))))) + 12))), _32_)));
                                    this._storeInt((_35_ + 12), (sqlite3ExprListAppend((this._loadInt((this._loadInt((_35_ + 136))))), (this._loadInt((_35_ + 12))), _31_)));
                                    this._storeInt((_35_ + 8), (this._loadInt(((this._loadInt((this._loadInt((_35_ + 100))))) + 8))));
                                }
                                while (false);
                                this._storeInt((_35_ + 108), ((this._loadInt((_35_ + 108))) + -1));
                                this._storeInt((_35_ + 100), ((this._loadInt((_35_ + 100))) + 40));
                                continue label$28;
                            }
                        }
                        while (false);
                        _32_ = this._storeInt((_35_ + 16), (sqlite3ExprDup((this._loadInt((_35_ + 124))), (this._loadInt((_35_ + 8))), 0)));
                        label$31:
                        do {
                            label$32:
                            do {
                                if ((this._storeInt((_35_ + 4), (sqlite3PExpr((this._loadInt((_35_ + 128))), 72, _32_, 0, 0)))) == 0) {
                                    break label$32;
                                }
                                transferJoinMarkings((this._loadInt((_35_ + 4))), (this._loadInt((_35_ + 116))));
                                this._storeInt(((_32_ = this._loadInt((_35_ + 4))) + 16), (this._loadInt((_35_ + 12))));
                                _32_ = this._storeInt(_35_, (whereClauseInsert((this._loadInt((_35_ + 136))), _32_, 3)));
                                exprAnalyze((this._loadInt((_35_ + 140))), (this._loadInt((_35_ + 136))), _32_);
                                _32_ = this._storeInt((_35_ + 120), ((this._loadInt(((this._loadInt((_35_ + 136))) + 28))) + ((this._loadInt((_35_ + 132))) * 40)));
                                this._storeInt((((this._loadInt(((this._loadInt((_35_ + 136))) + 28))) + ((this._loadInt(_35_)) * 40)) + 4), (this._loadInt((_35_ + 132))));
                                this._storeInt8((_32_ + 19), 1);
                                break label$31;
                            }
                            while (false);
                            sqlite3ExprListDelete((this._loadInt((_35_ + 124))), (this._loadInt((_35_ + 12))));
                        }
                        while (false);
                        this._storeInt16(((this._loadInt((_35_ + 120))) + 16), 2048);
                        break label$13;
                    }
                    while (false);
                    this._storeInt((_35_ + 28), ((this._loadInt((_35_ + 28))) + _33_));
                    continue label$12;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt((0 + 4), (_35_ + 144));
        return;
    }

    @Override()
    public final int isLikeOrGlob(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 88), _30_);
        this._storeInt((_35_ + 84), _31_);
        this._storeInt((_35_ + 80), _32_);
        this._storeInt((_35_ + 76), _33_);
        this._storeInt((_35_ + 72), _34_);
        _34_ = this._storeInt((_35_ + 68), 0);
        this._storeInt((_35_ + 40), (this._loadInt((this._loadInt((_35_ + 88))))));
        this._storeInt((_35_ + 36), _34_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((sqlite3IsLikeFunction((this._loadInt((_35_ + 40))), (this._loadInt((_35_ + 84))), (this._loadInt((_35_ + 72))), (_35_ + 45))) == 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._loadInt8u((this._storeInt((_35_ + 60), (this._loadInt(((this._loadInt(((this._storeInt((_35_ + 56), (this._loadInt(((this._loadInt((_35_ + 84))) + 16))))) + 12))) + 20))))))) != 152) {
                            break label$3;
                        }
                        if ((sqlite3ExprAffinity((this._loadInt((_35_ + 60))))) == 97) {
                            break label$1;
                        }
                    }
                    while (false);
                    this._storeInt((_35_ + 92), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_35_ + 92), _34_);
                break label$0;
            }
            while (false);
            label$4:
            do {
                if ((this._storeInt((_35_ + 32), (this._loadInt8u((this._storeInt((_35_ + 64), (this._loadInt((this._loadInt(((this._loadInt((_35_ + 56))) + 12))))))))))) != 132) {
                    break label$4;
                }
                this._storeInt((_35_ + 32), (this._loadInt8u(((this._loadInt((_35_ + 64))) + 35))));
            }
            while (false);
            label$5:
            do {
                label$6:
                do {
                    if ((this._loadInt((_35_ + 32))) != 133) {
                        break label$6;
                    }
                    this._storeInt((_35_ + 28), (this._loadInt(((this._loadInt((_35_ + 88))) + 468))));
                    _34_ = this._storeInt((_35_ + 24), (this._loadInt16s(((this._loadInt((_35_ + 64))) + 28))));
                    label$7:
                    do {
                        if ((this._storeInt((_35_ + 36), (sqlite3VdbeGetValue((this._loadInt((_35_ + 28))), _34_, 98)))) == 0) {
                            break label$7;
                        }
                        if ((sqlite3_value_type((this._loadInt((_35_ + 36))))) != 3) {
                            break label$7;
                        }
                        this._storeInt((_35_ + 68), (sqlite3_value_text((this._loadInt((_35_ + 36))))));
                    }
                    while (false);
                    sqlite3VdbeSetVarmask((this._loadInt(((this._loadInt((_35_ + 88))) + 12))), (this._loadInt((_35_ + 24))));
                    break label$5;
                }
                while (false);
                if ((this._loadInt((_35_ + 32))) != 94) {
                    break label$5;
                }
                this._storeInt((_35_ + 68), (this._loadInt(((this._loadInt((_35_ + 64))) + 4))));
            }
            while (false);
            label$8:
            do {
                if ((this._loadInt((_35_ + 68))) == 0) {
                    break label$8;
                }
                this._storeInt((_35_ + 48), 0);
                label$10:
                do {
                    label$9:
                    while (true) {
                        _34_ = 0;
                        label$11:
                        do {
                            if ((this._storeInt((_35_ + 52), (this._loadInt8s(((this._loadInt((_35_ + 68))) + (this._loadInt((_35_ + 48)))))))) == 0) {
                                break label$11;
                            }
                            _34_ = 0;
                            if ((this._loadInt((_35_ + 52))) == (this._loadInt8s((_35_ + 45)))) {
                                break label$11;
                            }
                            _34_ = 0;
                            if ((this._loadInt((_35_ + 52))) == (this._loadInt8s((_35_ + 46)))) {
                                break label$11;
                            }
                            _34_ = ((this._loadInt((_35_ + 52))) != (this._loadInt8s((_35_ + 47)))) ? 1 : 0;
                        }
                        while (false);
                        if (_34_ == 0) {
                            break label$10;
                        }
                        this._storeInt((_35_ + 48), ((this._loadInt((_35_ + 48))) + 1));
                        continue label$9;
                    }
                }
                while (false);
                label$12:
                do {
                    if ((this._loadInt((_35_ + 48))) == 0) {
                        break label$12;
                    }
                    if ((this._loadInt8u((((this._loadInt((_35_ + 68))) + (this._loadInt((_35_ + 48)))) + -1))) == 255) {
                        break label$12;
                    }
                    _34_ = 0;
                    label$13:
                    do {
                        if ((this._loadInt((_35_ + 52))) != (this._loadInt8s((_35_ + 45)))) {
                            break label$13;
                        }
                        _34_ = ((this._loadInt8s((((this._loadInt((_35_ + 68))) + (this._loadInt((_35_ + 48)))) + 1))) == 0) ? 1 : 0;
                    }
                    while (false);
                    this._storeInt((this._loadInt((_35_ + 76))), _34_);
                    label$14:
                    do {
                        if ((this._storeInt((_35_ + 20), (sqlite3Expr((this._loadInt((_35_ + 40))), 94, (this._loadInt((_35_ + 68))))))) == 0) {
                            break label$14;
                        }
                        this._storeInt8(((this._loadInt(((this._loadInt((_35_ + 20))) + 4))) + (this._loadInt((_35_ + 48)))), 0);
                    }
                    while (false);
                    this._storeInt((this._loadInt((_35_ + 80))), (this._loadInt((_35_ + 20))));
                    if ((this._loadInt((_35_ + 32))) != 133) {
                        break label$8;
                    }
                    sqlite3VdbeSetVarmask((this._storeInt((_35_ + 16), (this._loadInt(((this._loadInt((_35_ + 88))) + 12))))), (this._loadInt16s(((this._loadInt((_35_ + 64))) + 28))));
                    if ((this._loadInt((this._loadInt((_35_ + 76))))) == 0) {
                        break label$8;
                    }
                    if ((this._loadInt8s(((this._loadInt(((this._loadInt((_35_ + 64))) + 4))) + 1))) == 0) {
                        break label$8;
                    }
                    _34_ = this._storeInt((_35_ + 12), (sqlite3GetTempReg((this._loadInt((_35_ + 88))))));
                    sqlite3ExprCodeTarget((this._loadInt((_35_ + 88))), (this._loadInt((_35_ + 64))), _34_);
                    sqlite3VdbeChangeP3((_34_ = this._loadInt((_35_ + 16))), ((sqlite3VdbeCurrentAddr(_34_)) + -1), 0);
                    sqlite3ReleaseTempReg((this._loadInt((_35_ + 88))), (this._loadInt((_35_ + 12))));
                    break label$8;
                }
                while (false);
                this._storeInt((_35_ + 68), 0);
            }
            while (false);
            sqlite3ValueFree((this._loadInt((_35_ + 36))));
            this._storeInt((_35_ + 92), (((this._loadInt((_35_ + 68))) != 0) ? 1 : 0));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 92));
        this._storeInt((0 + 4), (_35_ + 96));
        return _34_;
    }

    @Override()
    public final int isMatchOfColumn(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)))) == 151) {
                    break label$1;
                }
                this._storeInt((_31_ + 12), 0);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((sqlite3StrICmp((this._loadInt(((this._loadInt((_31_ + 8))) + 4))), 43776)) == 0) {
                    break label$2;
                }
                this._storeInt((_31_ + 12), 0);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((this._storeInt((_31_ + 4), (this._loadInt(((this._loadInt((_31_ + 8))) + 16))))))) == 2) {
                    break label$3;
                }
                this._storeInt((_31_ + 12), 0);
                break label$0;
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt8u((this._loadInt(((this._loadInt(((this._loadInt((_31_ + 4))) + 12))) + 20))))) == 152) {
                    break label$4;
                }
                this._storeInt((_31_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 12), 1);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3IsLikeFunction(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_34_ + 20), _31_);
        this._storeInt((_34_ + 16), _32_);
        this._storeInt((_34_ + 12), _33_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt8u((this._loadInt((_34_ + 20))))) != 151) {
                        break label$2;
                    }
                    if ((this._loadInt(((this._loadInt((_34_ + 20))) + 16))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt((this._loadInt(((this._loadInt((_34_ + 20))) + 16))))) == 2) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((_34_ + 28), 0);
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if ((this._storeInt((_34_ + 8), (sqlite3FindFunction((this._loadInt((_34_ + 24))), (_33_ = this._loadInt(((this._loadInt((_34_ + 20))) + 4))), (sqlite3Strlen30(_33_)), 2, 1, 0)))) == 0) {
                        break label$4;
                    }
                    if (((this._loadInt8u(((this._loadInt((_34_ + 8))) + 3))) & 1) != 0) {
                        break label$3;
                    }
                }
                while (false);
                this._storeInt((_34_ + 28), 0);
                break label$0;
            }
            while (false);
            memcpy((this._loadInt((_34_ + 12))), (this._loadInt(((this._loadInt((_34_ + 8))) + 4))), 3);
            this._storeInt((this._loadInt((_34_ + 16))), ((((this._loadInt8u(((this._loadInt((_34_ + 8))) + 3))) & 2) == 0) ? 1 : 0));
            this._storeInt((_34_ + 28), 1);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 28));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final int sqlite3VdbeGetValue(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt8((_33_ + 19), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_33_ + 24))) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 12), ((_32_ = (this._loadInt(((this._loadInt((_33_ + 24))) + 72))) + ((this._loadInt((_33_ + 20))) * 40)) + -40));
                if (((this._loadInt16u((_32_ + -12))) & 1) != 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._storeInt((_33_ + 8), (sqlite3ValueNew((this._loadInt((this._loadInt((_33_ + 24))))))))) == 0) {
                        break label$2;
                    }
                    sqlite3VdbeMemCopy((this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 12))));
                    sqlite3ValueApplyAffinity((this._loadInt((_33_ + 8))), (this._loadInt8u((_33_ + 19))), 1);
                    sqlite3VdbeMemStoreType((this._loadInt((_33_ + 8))));
                }
                while (false);
                this._storeInt((_33_ + 28), (this._loadInt((_33_ + 8))));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 28), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final void sqlite3VdbeSetVarmask(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), _31_)) < 33) {
                break label$0;
            }
            this._storeInt(((this._loadInt((_32_ + 12))) + 180), -1);
            return;
        }
        while (false);
        this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 180), ((this._loadInt((_31_ + 180))) | (1 << ((this._loadInt((_32_ + 8))) + -1))));
        return;
    }

    @Override()
    public final int sqlite3VdbeMemCopy(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), 0);
        sqlite3VdbeMemReleaseExternal((this._loadInt((_32_ + 12))));
        memcpy((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))), 36);
        this._storeInt16(((_31_ = this._loadInt((_32_ + 12))) + 28), ((this._loadInt16u((_31_ + 28))) & 64511));
        label$0:
        do {
            if (((this._loadInt16u((_31_ + 28))) & 18) == 0) {
                break label$0;
            }
            if (((this._loadInt16u(((this._loadInt((_32_ + 8))) + 28))) & 2048) != 0) {
                break label$0;
            }
            this._storeInt16(((_31_ = this._loadInt((_32_ + 12))) + 28), ((this._loadInt16u((_31_ + 28))) | 4096));
            this._storeInt((_32_ + 4), (sqlite3VdbeMemMakeWriteable(_31_)));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void transferJoinMarkings(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt16(((_32_ = this._loadInt((_32_ + 12))) + 2), ((this._loadInt16u((_32_ + 2))) | ((this._loadInt16u((_31_ + 2))) & 1)));
        this._storeInt16((_32_ + 32), (this._loadInt16u((_31_ + 32))));
        return;
    }

    @Override()
    public final int evalConstExpr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_32_ + 36), _31_);
        this._storeInt((_32_ + 32), (this._loadInt(((this._loadInt((_32_ + 40))) + 8))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if (((_31_ = (_30_ = this._loadInt8u((this._loadInt((_32_ + 36))))) + -132) & 4294967295L) > (23 & 4294967295L)) {
                            break label$3;
                        }
                        label$4:
                        do {
                            switch (_31_) {
                                case 0: {
                                    break label$2;
                                }
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 20:
                                case 22: {
                                    break label$1;
                                }
                                case 19:
                                case 21:
                                case 23: {
                                    break label$4;
                                }
                                default: {
                                    break label$2;
                                }
                            }
                        }
                        while (false);
                        if ((this._storeInt((_32_ + 28), (this._loadInt(((this._loadInt((_32_ + 36))) + 16))))) == 0) {
                            break label$1;
                        }
                        this._storeInt((_32_ + 24), (this._loadInt((this._loadInt((_32_ + 28))))));
                        this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 28))) + 12))));
                        label$5:
                        while (true) {
                            if ((this._loadInt((_32_ + 24))) < 1) {
                                break label$1;
                            }
                            label$7:
                            do {
                                if ((this._loadInt((this._loadInt((_32_ + 20))))) == 0) {
                                    break label$7;
                                }
                                this._storeInt16(((_31_ = this._loadInt((this._loadInt((_32_ + 20))))) + 2), ((this._loadInt16u((_31_ + 2))) | 512));
                            }
                            while (false);
                            this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + -1));
                            this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 20));
                            continue label$5;
                        }
                    }
                    while (false);
                    if (_30_ != 72) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((_32_ + 44), 1);
                break label$0;
            }
            while (false);
            label$8:
            do {
                if ((isAppropriateForFactoring((this._loadInt((_32_ + 36))))) == 0) {
                    break label$8;
                }
                _31_ = this._storeInt((_32_ + 16), (this._storeInt(((_31_ = this._loadInt((_32_ + 32))) + 72), ((this._loadInt((_31_ + 72))) + 1))));
                label$9:
                do {
                    if ((this._storeInt((_32_ + 12), (sqlite3ExprCodeTarget((this._loadInt((_32_ + 32))), (this._loadInt((_32_ + 36))), _31_)))) == (this._loadInt((_32_ + 16)))) {
                        break label$9;
                    }
                    sqlite3ReleaseTempReg((this._loadInt((_32_ + 32))), (this._loadInt((_32_ + 16))));
                }
                while (false);
                this._storeInt8(((_31_ = this._loadInt((_32_ + 36))) + 35), (this._loadInt8u(_31_)));
                this._storeInt8(_31_, 132);
                this._storeInt((_31_ + 24), (this._loadInt((_32_ + 12))));
                this._storeInt((_32_ + 44), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 44), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 44));
        this._storeInt((0 + 4), (_32_ + 48));
        return _31_;
    }

    @Override()
    public final int isAppropriateForFactoring(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((sqlite3ExprIsConstantNotJoin((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)))) == 0) {
                        break label$2;
                    }
                    if (((this._loadInt16u(((this._loadInt((_31_ + 8))) + 2))) & 512) != 0) {
                        break label$1;
                    }
                    this._storeInt((_31_ + 12), 1);
                    break label$0;
                }
                while (false);
                this._storeInt((_31_ + 12), 0);
                break label$0;
            }
            while (false);
            label$4:
            do {
                label$3:
                while (true) {
                    if ((this._loadInt8u((this._loadInt((_31_ + 8))))) != 157) {
                        break label$4;
                    }
                    this._storeInt((_31_ + 8), (this._loadInt(((this._loadInt((_31_ + 8))) + 8))));
                    continue label$3;
                }
            }
            while (false);
            label$5:
            do {
                if (((_30_ = (this._loadInt8u((this._loadInt((_31_ + 8))))) + -94) & 4294967295L) > (62 & 4294967295L)) {
                    break label$5;
                }
                label$6:
                do {
                    label$7:
                    do {
                        switch (_30_) {
                            case 0:
                            case 4:
                            case 35:
                            case 36:
                            case 37:
                            case 39: {
                                break label$7;
                            }
                            case 1:
                            case 2:
                            case 3:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 38:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                            case 61: {
                                break label$5;
                            }
                            case 62: {
                                break label$6;
                            }
                            default: {
                                break label$7;
                            }
                        }
                    }
                    while (false);
                    this._storeInt((_31_ + 12), 0);
                    break label$0;
                }
                while (false);
                label$8:
                do {
                    if ((this._loadInt8u((this._loadInt(((this._loadInt((_31_ + 8))) + 8))))) == 130) {
                        break label$8;
                    }
                    if ((this._loadInt8u((this._loadInt(((this._loadInt((_31_ + 8))) + 8))))) != 129) {
                        break label$5;
                    }
                }
                while (false);
                this._storeInt((_31_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 12), 1);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3FkRequired(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_34_ + 36), _31_);
        this._storeInt((_34_ + 32), _32_);
        this._storeInt((_34_ + 28), _33_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadInt8u(((this._loadInt((this._loadInt((_34_ + 40))))) + 15))) & 4) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt((_34_ + 32))) == 0) {
                        break label$1;
                    }
                    this._storeInt((_34_ + 20), (this._loadInt(((this._loadInt((_34_ + 36))) + 36))));
                    label$4:
                    do {
                        label$3:
                        while (true) {
                            label$5:
                            do {
                                label$6:
                                do {
                                    if ((this._loadInt((_34_ + 20))) == 0) {
                                        break label$6;
                                    }
                                    _32_ = this._storeInt((_34_ + 24), 0);
                                    label$7:
                                    do {
                                        label$9:
                                        do {
                                            label$8:
                                            while (true) {
                                                if ((this._loadInt((_34_ + 24))) >= (this._loadInt(((this._loadInt((_34_ + 20))) + 20)))) {
                                                    break label$5;
                                                }
                                                _33_ = this._storeInt((_34_ + 16), (this._loadInt((((this._loadInt((_34_ + 20))) + ((this._loadInt((_34_ + 24))) << 3)) + 36))));
                                                if ((this._loadInt(((this._loadInt((_34_ + 32))) + (_33_ << 2)))) >= _32_) {
                                                    break label$7;
                                                }
                                                label$10:
                                                do {
                                                    if ((this._loadInt((_34_ + 16))) != (this._loadInt(((this._loadInt((_34_ + 36))) + 4)))) {
                                                        break label$10;
                                                    }
                                                    if ((this._loadInt((_34_ + 28))) != 0) {
                                                        break label$9;
                                                    }
                                                }
                                                while (false);
                                                this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + 1));
                                                continue label$8;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_34_ + 44), 1);
                                        break label$0;
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 44), 1);
                                    break label$0;
                                }
                                while (false);
                                this._storeInt((_34_ + 20), (sqlite3FkReferences((this._loadInt((_34_ + 36))))));
                                label$11:
                                while (true) {
                                    if ((this._loadInt((_34_ + 20))) == 0) {
                                        break label$4;
                                    }
                                    _32_ = this._storeInt((_34_ + 24), 0);
                                    label$14:
                                    do {
                                        label$13:
                                        while (true) {
                                            if ((this._loadInt((_34_ + 24))) >= (this._loadInt(((this._loadInt((_34_ + 20))) + 20)))) {
                                                break label$14;
                                            }
                                            this._storeInt((_34_ + 12), (this._loadInt((((this._loadInt((_34_ + 20))) + ((this._loadInt((_34_ + 24))) << 3)) + 40))));
                                            _33_ = this._storeInt((_34_ + 8), _32_);
                                            label$15:
                                            do {
                                                label$16:
                                                do {
                                                    label$18:
                                                    do {
                                                        label$17:
                                                        while (true) {
                                                            if ((this._loadInt((_34_ + 8))) >= (this._loadInt(((this._loadInt((_34_ + 36))) + 8)))) {
                                                                break label$15;
                                                            }
                                                            this._storeInt((_34_ + 4), ((this._loadInt(((this._loadInt((_34_ + 36))) + 12))) + ((this._loadInt((_34_ + 8))) * 24)));
                                                            label$19:
                                                            do {
                                                                label$20:
                                                                do {
                                                                    label$21:
                                                                    do {
                                                                        if ((this._loadInt((_34_ + 12))) == 0) {
                                                                            break label$21;
                                                                        }
                                                                        if ((sqlite3StrICmp((this._loadInt((this._loadInt((_34_ + 4))))), (this._loadInt((_34_ + 12))))) != 0) {
                                                                            break label$19;
                                                                        }
                                                                        break label$20;
                                                                    }
                                                                    while (false);
                                                                    if ((this._loadInt8u(((this._loadInt((_34_ + 4))) + 21))) == 0) {
                                                                        break label$19;
                                                                    }
                                                                }
                                                                while (false);
                                                                if ((this._loadInt(((this._loadInt((_34_ + 32))) + ((this._loadInt((_34_ + 8))) << 2)))) >= _33_) {
                                                                    break label$16;
                                                                }
                                                                if ((this._loadInt((_34_ + 8))) != (this._loadInt(((this._loadInt((_34_ + 36))) + 4)))) {
                                                                    break label$19;
                                                                }
                                                                if ((this._loadInt((_34_ + 28))) != 0) {
                                                                    break label$18;
                                                                }
                                                            }
                                                            while (false);
                                                            this._storeInt((_34_ + 8), ((this._loadInt((_34_ + 8))) + 1));
                                                            continue label$17;
                                                        }
                                                    }
                                                    while (false);
                                                    this._storeInt((_34_ + 44), 1);
                                                    break label$0;
                                                }
                                                while (false);
                                                this._storeInt((_34_ + 44), 1);
                                                break label$0;
                                            }
                                            while (false);
                                            this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + 1));
                                            continue label$13;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 20), (this._loadInt(((this._loadInt((_34_ + 20))) + 12))));
                                    continue label$11;
                                }
                            }
                            while (false);
                            this._storeInt((_34_ + 20), (this._loadInt(((this._loadInt((_34_ + 20))) + 4))));
                            continue label$3;
                        }
                    }
                    while (false);
                }
                while (false);
                this._storeInt((_34_ + 44), 0);
                break label$0;
            }
            while (false);
            _33_ = 1;
            label$22:
            do {
                if ((sqlite3FkReferences((this._loadInt((_34_ + 36))))) != 0) {
                    break label$22;
                }
                _33_ = ((this._loadInt(((this._loadInt((_34_ + 36))) + 36))) != 0) ? 1 : 0;
            }
            while (false);
            this._storeInt((_34_ + 44), _33_);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final void sqlite3MultiWrite(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) + 424))) == 0) {
                    break label$1;
                }
                _30_ = this._loadInt(((this._loadInt((_31_ + 12))) + 424));
                break label$0;
            }
            while (false);
            _30_ = this._loadInt((_31_ + 12));
        }
        while (false);
        this._storeInt8((_30_ + 344), 1);
        this._storeInt((_31_ + 8), _30_);
        return;
    }

    @Override()
    public final void sqlite3GenerateRowDelete(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_,
            int _36_)
    {
        int _37_ = 0;
        this._storeInt(((_37_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_37_ + 40), _31_);
        this._storeInt((_37_ + 36), _32_);
        this._storeInt((_37_ + 32), _33_);
        this._storeInt((_37_ + 28), _34_);
        this._storeInt((_37_ + 24), _35_);
        this._storeInt((_37_ + 20), _36_);
        this._storeInt((_37_ + 16), (this._loadInt(((this._loadInt((_37_ + 44))) + 12))));
        _36_ = this._storeInt((_37_ + 12), 0);
        _35_ = this._storeInt((_37_ + 8), (sqlite3VdbeMakeLabel((this._loadInt((_37_ + 16))))));
        sqlite3VdbeAddOp3((this._loadInt((_37_ + 16))), 52, (this._loadInt((_37_ + 36))), _35_, (this._loadInt((_37_ + 32))));
        label$0:
        do {
            label$1:
            do {
                if ((sqlite3FkRequired((this._loadInt((_37_ + 44))), (this._loadInt((_37_ + 40))), _36_, _36_)) != 0) {
                    break label$1;
                }
                if ((this._loadInt((_37_ + 24))) == 0) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt((_37_ + 4), (sqlite3TriggerColmask((this._loadInt((_37_ + 44))), (this._loadInt((_37_ + 24))), _36_, _36_, 3, (this._loadInt((_37_ + 40))), (this._loadInt((_37_ + 20))))));
            this._storeInt((_37_ + 4), ((sqlite3FkOldmask((this._loadInt((_37_ + 44))), (this._loadInt((_37_ + 40))))) | (this._loadInt((_37_ + 4)))));
            _35_ = this._storeInt((_37_ + 12), ((this._loadInt(((this._loadInt((_37_ + 44))) + 72))) + 1));
            this._storeInt(((_34_ = this._loadInt((_37_ + 44))) + 72), (((this._loadInt((_34_ + 72))) + (this._loadInt(((this._loadInt((_37_ + 40))) + 8)))) + 1));
            sqlite3VdbeAddOp2((this._loadInt((_37_ + 16))), 14, (this._loadInt((_37_ + 32))), _35_);
            this._storeInt(_37_, _36_);
            label$3:
            do {
                label$2:
                while (true) {
                    if ((this._loadInt(_37_)) >= (this._loadInt(((this._loadInt((_37_ + 40))) + 8)))) {
                        break label$3;
                    }
                    label$4:
                    do {
                        label$5:
                        do {
                            if ((this._loadInt((_37_ + 4))) == -1) {
                                break label$5;
                            }
                            if (((this._loadInt((_37_ + 4))) & (1 << (this._loadInt(_37_)))) == 0) {
                                break label$4;
                            }
                        }
                        while (false);
                        sqlite3ExprCodeGetColumnOfTable((this._loadInt((_37_ + 16))), (this._loadInt((_37_ + 40))), (this._loadInt((_37_ + 36))), (_36_ = this._loadInt(_37_)), ((_36_ + (this._loadInt((_37_ + 12)))) + 1));
                    }
                    while (false);
                    this._storeInt(_37_, ((this._loadInt(_37_)) + 1));
                    continue label$2;
                }
            }
            while (false);
            sqlite3CodeRowTrigger((this._loadInt((_37_ + 44))), (this._loadInt((_37_ + 24))), 106, 0, 1, (this._loadInt((_37_ + 40))), (this._loadInt((_37_ + 12))), (this._loadInt((_37_ + 20))), (this._loadInt((_37_ + 8))));
            sqlite3VdbeAddOp3((this._loadInt((_37_ + 16))), 52, (this._loadInt((_37_ + 36))), (this._loadInt((_37_ + 8))), (this._loadInt((_37_ + 32))));
            sqlite3FkCheck((this._loadInt((_37_ + 44))), (this._loadInt((_37_ + 40))), (this._loadInt((_37_ + 12))), 0);
        }
        while (false);
        label$6:
        do {
            if ((this._loadInt(((this._loadInt((_37_ + 40))) + 28))) != 0) {
                break label$6;
            }
            sqlite3GenerateRowIndexDelete((this._loadInt((_37_ + 44))), (this._loadInt((_37_ + 40))), (this._loadInt((_37_ + 36))), 0);
            sqlite3VdbeAddOp2((this._loadInt((_37_ + 16))), 57, (this._loadInt((_37_ + 36))), (((this._loadInt((_37_ + 28))) != 0) ? 1 : 0));
            if ((this._loadInt((_37_ + 28))) == 0) {
                break label$6;
            }
            sqlite3VdbeChangeP4((this._loadInt((_37_ + 16))), -1, (this._loadInt((this._loadInt((_37_ + 40))))), 0);
        }
        while (false);
        sqlite3FkActions((this._loadInt((_37_ + 44))), (this._loadInt((_37_ + 40))), 0, (this._loadInt((_37_ + 12))));
        sqlite3CodeRowTrigger((this._loadInt((_37_ + 44))), (this._loadInt((_37_ + 24))), 106, 0, 2, (this._loadInt((_37_ + 40))), (this._loadInt((_37_ + 12))), (this._loadInt((_37_ + 20))), (this._loadInt((_37_ + 8))));
        sqlite3VdbeResolveLabel((this._loadInt((_37_ + 16))), (this._loadInt((_37_ + 8))));
        this._storeInt((0 + 4), (_37_ + 48));
        return;
    }

    @Override()
    public final void sqlite3GenerateRowIndexDelete(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        _33_ = this._storeInt((_34_ + 12), 1);
        this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((_34_ + 24))) + 16))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_34_ + 8))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_34_ + 16))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt((((this._loadInt((_34_ + 16))) + ((this._loadInt((_34_ + 12))) << 2)) + -4))) == 0) {
                            break label$2;
                        }
                    }
                    while (false);
                    _32_ = this._storeInt((_34_ + 4), (sqlite3GenerateIndexKey((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 20))), 0, 0)));
                    sqlite3VdbeAddOp3((this._loadInt(((this._loadInt((_34_ + 28))) + 12))), 71, ((this._loadInt((_34_ + 20))) + (this._loadInt((_34_ + 12)))), _32_, ((this._loadInt(((this._loadInt((_34_ + 8))) + 4))) + _33_));
                }
                while (false);
                this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 12))) + _33_));
                this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((_34_ + 8))) + 32))));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final int sqlite3TriggerColmask(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_,
            int _36_)
    {
        int _37_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_37_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_37_ + 40), _31_);
        this._storeInt((_37_ + 36), _32_);
        this._storeInt((_37_ + 32), _33_);
        this._storeInt((_37_ + 28), _34_);
        this._storeInt((_37_ + 24), _35_);
        this._storeInt((_37_ + 20), _36_);
        _temp$0 = 107;
        _temp$1 = 106;
        _temp$2 = ((this._loadInt((_37_ + 36))) != 0) ? _temp$0 : _temp$1;
        this._storeInt((_37_ + 16), _temp$2);
        this._storeInt((_37_ + 12), 0);
        this._storeInt((_37_ + 8), (this._loadInt((_37_ + 40))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_37_ + 8))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt8u(((this._loadInt((_37_ + 8))) + 8))) != (this._loadInt((_37_ + 16)))) {
                        break label$2;
                    }
                    if (((this._loadInt((_37_ + 28))) & (this._loadInt8u(((this._loadInt((_37_ + 8))) + 9)))) == 0) {
                        break label$2;
                    }
                    if ((checkColumnOverlap((this._loadInt(((this._loadInt((_37_ + 8))) + 16))), (this._loadInt((_37_ + 36))))) == 0) {
                        break label$2;
                    }
                    if ((this._storeInt((_37_ + 4), (getRowTrigger((this._loadInt((_37_ + 44))), (this._loadInt((_37_ + 8))), (this._loadInt((_37_ + 24))), (this._loadInt((_37_ + 20))))))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_37_ + 12), ((this._loadInt((_37_ + 12))) | (this._loadInt((((this._loadInt((_37_ + 4))) + ((this._loadInt((_37_ + 32))) << 2)) + 12)))));
                }
                while (false);
                this._storeInt((_37_ + 8), (this._loadInt(((this._loadInt((_37_ + 8))) + 32))));
                continue label$0;
            }
        }
        while (false);
        _36_ = this._loadInt((_37_ + 12));
        this._storeInt((0 + 4), (_37_ + 48));
        return _36_;
    }

    @Override()
    public final int sqlite3FkOldmask(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        _30_ = this._storeInt((_32_ + 20), 0);
        label$0:
        do {
            if (((this._loadInt8u(((this._loadInt((this._loadInt((_32_ + 28))))) + 15))) & 4) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt((_32_ + 24))) + 36))));
            label$2:
            do {
                label$1:
                while (true) {
                    label$3:
                    do {
                        label$4:
                        do {
                            if ((this._loadInt((_32_ + 16))) == 0) {
                                break label$4;
                            }
                            this._storeInt((_32_ + 12), _30_);
                            label$5:
                            while (true) {
                                if ((this._loadInt((_32_ + 12))) >= (this._loadInt(((this._loadInt((_32_ + 16))) + 20)))) {
                                    break label$3;
                                }
                                _31_ = -1;
                                label$7:
                                do {
                                    if ((this._loadInt((((this._loadInt((_32_ + 16))) + ((this._loadInt((_32_ + 12))) << 3)) + 36))) > 31) {
                                        break label$7;
                                    }
                                    _31_ = 1 << (this._loadInt((((this._loadInt((_32_ + 16))) + ((this._loadInt((_32_ + 12))) << 3)) + 36)));
                                }
                                while (false);
                                this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) | _31_));
                                this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 1));
                                continue label$5;
                            }
                        }
                        while (false);
                        this._storeInt((_32_ + 16), (sqlite3FkReferences((this._loadInt((_32_ + 24))))));
                        label$8:
                        while (true) {
                            if ((this._loadInt((_32_ + 16))) == 0) {
                                break label$2;
                            }
                            _31_ = this._storeInt((_32_ + 8), 0);
                            locateFkeyIndex((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 16))), (_32_ + 8), _31_);
                            label$10:
                            do {
                                if ((this._loadInt((_32_ + 8))) == 0) {
                                    break label$10;
                                }
                                this._storeInt((_32_ + 12), _31_);
                                label$12:
                                do {
                                    label$11:
                                    while (true) {
                                        if ((this._loadInt((_32_ + 12))) >= (this._loadInt(((this._loadInt((_32_ + 8))) + 4)))) {
                                            break label$12;
                                        }
                                        _31_ = -1;
                                        label$13:
                                        do {
                                            if ((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 8))) + 8))) + ((this._loadInt((_32_ + 12))) << 2)))) > 31) {
                                                break label$13;
                                            }
                                            _31_ = 1 << (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 8))) + 8))) + ((this._loadInt((_32_ + 12))) << 2))));
                                        }
                                        while (false);
                                        this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) | _31_));
                                        this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 1));
                                        continue label$11;
                                    }
                                }
                                while (false);
                            }
                            while (false);
                            this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt((_32_ + 16))) + 12))));
                            continue label$8;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt((_32_ + 16))) + 4))));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 20));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final void sqlite3FkActions(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        label$0:
        do {
            if (((this._loadInt8u(((this._loadInt((this._loadInt((_34_ + 28))))) + 15))) & 4) == 0) {
                break label$0;
            }
            this._storeInt((_34_ + 12), (sqlite3FkReferences((this._loadInt((_34_ + 24))))));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_34_ + 12))) == 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._storeInt((_34_ + 8), (fkActionTrigger((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 20))))))) == 0) {
                            break label$3;
                        }
                        sqlite3CodeRowTriggerDirect((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 16))), 2, 0);
                    }
                    while (false);
                    this._storeInt((_34_ + 12), (this._loadInt(((this._loadInt((_34_ + 12))) + 12))));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final int fkActionTrigger(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 144))) + 136), _30_);
        this._storeInt((_34_ + 132), _31_);
        this._storeInt((_34_ + 128), _32_);
        this._storeInt((_34_ + 124), _33_);
        this._storeInt((_34_ + 120), (this._loadInt((this._loadInt((_34_ + 136))))));
        this._storeInt((_34_ + 116), (this._loadInt8u((((this._storeInt((_34_ + 108), (((this._loadInt((_34_ + 124))) != 0) ? 1 : 0))) + (this._loadInt((_34_ + 128)))) + 25))));
        this._storeInt((_34_ + 112), (this._loadInt((((this._loadInt((_34_ + 128))) + ((this._loadInt((_34_ + 108))) << 2)) + 28))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_34_ + 116))) == 0) {
                    break label$1;
                }
                if ((this._loadInt((_34_ + 112))) != 0) {
                    break label$1;
                }
                _33_ = this._storeInt((_34_ + 64), (this._storeInt((_34_ + 72), (this._storeInt((_34_ + 76), (this._storeInt((_34_ + 80), (this._storeInt((_34_ + 84), (this._storeInt((_34_ + 88), (this._storeInt((_34_ + 92), 0)))))))))))));
                label$2:
                do {
                    if ((locateFkeyIndex((this._loadInt((_34_ + 136))), (this._loadInt((_34_ + 132))), (this._loadInt((_34_ + 128))), (_34_ + 92), (_34_ + 88))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_34_ + 140), _33_);
                    break label$0;
                }
                while (false);
                this._storeInt((_34_ + 68), _33_);
                label$4:
                do {
                    label$3:
                    while (true) {
                        if ((this._loadInt((_34_ + 68))) >= (this._loadInt(((this._loadInt((_34_ + 128))) + 20)))) {
                            break label$4;
                        }
                        this._storeLong((_34_ + 56), (this._loadLong((_33_ + 46784))));
                        this._storeInt((_34_ + 48), (this._loadInt((_33_ + 46792))));
                        this._storeInt((_34_ + 52), (this._loadInt((_33_ + 46796))));
                        label$5:
                        do {
                            label$6:
                            do {
                                if ((this._loadInt((_34_ + 88))) == 0) {
                                    break label$6;
                                }
                                _32_ = this._loadInt(((this._loadInt((_34_ + 88))) + ((this._loadInt((_34_ + 68))) << 2)));
                                break label$5;
                            }
                            while (false);
                            _32_ = this._loadInt(((this._loadInt((_34_ + 128))) + 36));
                        }
                        while (false);
                        this._storeInt((_34_ + 28), _32_);
                        _32_ = 46800;
                        label$7:
                        do {
                            if ((this._loadInt((_34_ + 92))) == 0) {
                                break label$7;
                            }
                            _32_ = this._loadInt(((this._loadInt(((this._loadInt((_34_ + 132))) + 12))) + ((this._loadInt(((this._loadInt(((this._loadInt((_34_ + 92))) + 8))) + ((this._loadInt((_34_ + 68))) << 2)))) * 24)));
                        }
                        while (false);
                        this._storeInt((_34_ + 32), _32_);
                        this._storeInt((_34_ + 40), (this._loadInt(((this._loadInt(((this._loadInt((this._loadInt((_34_ + 128))))) + 12))) + ((this._loadInt((_34_ + 28))) * 24)))));
                        this._storeInt((_34_ + 36), (sqlite3Strlen30((this._loadInt((_34_ + 32))))));
                        this._storeInt((_34_ + 44), (sqlite3Strlen30((this._loadInt((_34_ + 40))))));
                        _32_ = this._storeInt((_34_ + 24), (sqlite3PExpr((_32_ = this._loadInt((_34_ + 136))), 76, (sqlite3PExpr(_32_, 118, (sqlite3PExpr(_32_, 26, _33_, _33_, (_34_ + 56))), (sqlite3PExpr((this._loadInt((_34_ + 136))), 26, _33_, _33_, (_34_ + 32))), _33_)), (sqlite3PExpr((this._loadInt((_34_ + 136))), 26, _33_, _33_, (_34_ + 40))), _33_)));
                        this._storeInt((_34_ + 80), (sqlite3ExprAnd((this._loadInt((_34_ + 120))), (this._loadInt((_34_ + 80))), _32_)));
                        label$8:
                        do {
                            if ((this._loadInt((_34_ + 124))) == 0) {
                                break label$8;
                            }
                            _32_ = this._storeInt((_34_ + 24), (sqlite3PExpr((_32_ = this._loadInt((_34_ + 136))), 70, (sqlite3PExpr(_32_, 118, (sqlite3PExpr(_32_, 26, _33_, _33_, (_34_ + 56))), (sqlite3PExpr((this._loadInt((_34_ + 136))), 26, _33_, _33_, (_34_ + 32))), _33_)), (sqlite3PExpr((_32_ = this._loadInt((_34_ + 136))), 118, (sqlite3PExpr(_32_, 26, _33_, _33_, (_34_ + 48))), (sqlite3PExpr((this._loadInt((_34_ + 136))), 26, _33_, _33_, (_34_ + 32))), _33_)), _33_)));
                            this._storeInt((_34_ + 64), (sqlite3ExprAnd((this._loadInt((_34_ + 120))), (this._loadInt((_34_ + 64))), _32_)));
                        }
                        while (false);
                        label$9:
                        do {
                            if ((this._loadInt((_34_ + 116))) == 6) {
                                break label$9;
                            }
                            label$10:
                            do {
                                if ((this._loadInt((_34_ + 116))) != 9) {
                                    break label$10;
                                }
                                if ((this._loadInt((_34_ + 124))) == 0) {
                                    break label$9;
                                }
                            }
                            while (false);
                            label$11:
                            do {
                                label$12:
                                do {
                                    if ((this._loadInt((_34_ + 116))) != 9) {
                                        break label$12;
                                    }
                                    this._storeInt((_34_ + 20), (sqlite3PExpr((_32_ = this._loadInt((_34_ + 136))), 118, (sqlite3PExpr(_32_, 26, _33_, _33_, (_34_ + 48))), (sqlite3PExpr((this._loadInt((_34_ + 136))), 26, _33_, _33_, (_34_ + 32))), _33_)));
                                    break label$11;
                                }
                                while (false);
                                label$13:
                                do {
                                    label$14:
                                    do {
                                        if ((this._loadInt((_34_ + 116))) != 8) {
                                            break label$14;
                                        }
                                        if ((this._storeInt((_34_ + 16), (this._loadInt((((this._loadInt(((this._loadInt((this._loadInt((_34_ + 128))))) + 12))) + ((this._loadInt((_34_ + 28))) * 24)) + 4))))) == 0) {
                                            break label$13;
                                        }
                                        this._storeInt((_34_ + 20), (sqlite3ExprDup((this._loadInt((_34_ + 120))), (this._loadInt((_34_ + 16))), _33_)));
                                        break label$11;
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 20), (sqlite3PExpr((this._loadInt((_34_ + 136))), 98, _33_, _33_, _33_)));
                                    break label$11;
                                }
                                while (false);
                                this._storeInt((_34_ + 20), (sqlite3PExpr((this._loadInt((_34_ + 136))), 98, _33_, _33_, _33_)));
                            }
                            while (false);
                            _32_ = this._storeInt((_34_ + 76), (sqlite3ExprListAppend((this._loadInt((_34_ + 136))), (this._loadInt((_34_ + 76))), (this._loadInt((_34_ + 20))))));
                            sqlite3ExprListSetName((this._loadInt((_34_ + 136))), _32_, (_34_ + 40), _33_);
                        }
                        while (false);
                        this._storeInt((_34_ + 68), ((this._loadInt((_34_ + 68))) + 1));
                        continue label$3;
                    }
                }
                while (false);
                sqlite3DbFree((this._loadInt((_34_ + 120))), (this._loadInt((_34_ + 88))));
                this._storeInt((_34_ + 96), (sqlite3Strlen30((this._storeInt((_34_ + 100), (this._loadInt((this._loadInt((this._loadInt((_34_ + 128))))))))))));
                label$15:
                do {
                    if ((this._loadInt((_34_ + 116))) != 6) {
                        break label$15;
                    }
                    this._storeInt((_34_ + 8), (this._loadInt((_34_ + 100))));
                    this._storeInt((_34_ + 12), (this._loadInt((_34_ + 96))));
                    label$16:
                    do {
                        if ((this._storeInt((_34_ + 4), (sqlite3Expr((this._loadInt((_34_ + 120))), 56, 31616)))) == 0) {
                            break label$16;
                        }
                        this._storeInt8(((this._loadInt((_34_ + 4))) + 1), 2);
                    }
                    while (false);
                    this._storeInt((_34_ + 72), (sqlite3SelectNew((_33_ = this._loadInt((_34_ + 136))), (sqlite3ExprListAppend(_33_, 0, (this._loadInt((_34_ + 4))))), (sqlite3SrcListAppend((this._loadInt((_34_ + 120))), 0, (_34_ + 8), 0)), (this._loadInt((_34_ + 80))), 0, 0, 0, 0, 0, 0)));
                    this._storeInt((_34_ + 80), 0);
                }
                while (false);
                this._storeInt8((_34_ + 107), (this._loadInt8u(((this._loadInt((_34_ + 120))) + 234))));
                this._storeInt8(((_33_ = this._loadInt((_34_ + 120))) + 234), 0);
                label$17:
                do {
                    if ((this._storeInt((_34_ + 112), (sqlite3DbMallocZero(_33_, ((this._loadInt((_34_ + 96))) + 77))))) == 0) {
                        break label$17;
                    }
                    this._storeInt((_32_ = (_33_ = this._loadInt((_34_ + 112))) + 48), (_33_ + 76));
                    this._storeInt((_34_ + 84), (this._storeInt((_33_ + 28), (_33_ + 36))));
                    _33_ = this._storeInt((_33_ + 52), (this._loadInt((_34_ + 96))));
                    memcpy((this._loadInt(_32_)), (this._loadInt((_34_ + 100))), _33_);
                    _33_ = sqlite3ExprDup((this._loadInt((_34_ + 120))), (this._loadInt((_34_ + 80))), 1);
                    this._storeInt(((this._loadInt((_34_ + 84))) + 20), _33_);
                    _33_ = sqlite3ExprListDup((this._loadInt((_34_ + 120))), (this._loadInt((_34_ + 76))), 1);
                    this._storeInt(((this._loadInt((_34_ + 84))) + 24), _33_);
                    _33_ = sqlite3SelectDup((this._loadInt((_34_ + 120))), (this._loadInt((_34_ + 72))), 1);
                    this._storeInt(((this._loadInt((_34_ + 84))) + 8), _33_);
                    if ((this._loadInt((_34_ + 64))) == 0) {
                        break label$17;
                    }
                    _33_ = this._storeInt((_34_ + 64), (sqlite3PExpr((this._loadInt((_34_ + 136))), 19, (this._loadInt((_34_ + 64))), 0, 0)));
                    _33_ = sqlite3ExprDup((this._loadInt((_34_ + 120))), _33_, 1);
                    this._storeInt(((this._loadInt((_34_ + 112))) + 12), _33_);
                }
                while (false);
                this._storeInt8(((_33_ = this._loadInt((_34_ + 120))) + 234), (this._loadInt8u((_34_ + 107))));
                sqlite3ExprDelete(_33_, (this._loadInt((_34_ + 80))));
                sqlite3ExprDelete((this._loadInt((_34_ + 120))), (this._loadInt((_34_ + 64))));
                sqlite3ExprListDelete((this._loadInt((_34_ + 120))), (this._loadInt((_34_ + 76))));
                sqlite3SelectDelete((this._loadInt((_34_ + 120))), (this._loadInt((_34_ + 72))));
                label$18:
                do {
                    if ((this._loadInt8u(((this._loadInt((_34_ + 120))) + 30))) != 1) {
                        break label$18;
                    }
                    fkTriggerDelete((this._loadInt((_34_ + 120))), (this._loadInt((_34_ + 112))));
                    this._storeInt((_34_ + 140), 0);
                    break label$0;
                }
                while (false);
                label$19:
                do {
                    label$20:
                    do {
                        label$21:
                        do {
                            label$22:
                            do {
                                if ((_33_ = this._loadInt((_34_ + 116))) == 9) {
                                    break label$22;
                                }
                                if (_33_ != 6) {
                                    break label$21;
                                }
                                this._storeInt8((this._loadInt((_34_ + 84))), 116);
                                break label$19;
                            }
                            while (false);
                            if ((this._loadInt((_34_ + 124))) == 0) {
                                break label$20;
                            }
                        }
                        while (false);
                        this._storeInt8((this._loadInt((_34_ + 84))), 107);
                        break label$19;
                    }
                    while (false);
                    this._storeInt8((this._loadInt((_34_ + 84))), 106);
                }
                while (false);
                this._storeInt(((this._storeInt(((this._loadInt((_34_ + 84))) + 4), (this._loadInt((_34_ + 112))))) + 20), (this._loadInt(((this._loadInt((_34_ + 132))) + 68))));
                this._storeInt(((this._loadInt((_34_ + 112))) + 24), (this._loadInt(((this._loadInt((_34_ + 132))) + 68))));
                this._storeInt((((this._loadInt((_34_ + 128))) + ((this._loadInt((_34_ + 108))) << 2)) + 28), (this._loadInt((_34_ + 112))));
                _temp$0 = 107;
                _temp$1 = 106;
                _temp$2 = ((this._loadInt((_34_ + 124))) != 0) ? _temp$0 : _temp$1;
                this._storeInt8(((this._loadInt((_34_ + 112))) + 8), _temp$2);
            }
            while (false);
            this._storeInt((_34_ + 140), (this._loadInt((_34_ + 112))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 140));
        this._storeInt((0 + 4), (_34_ + 144));
        return _33_;
    }

    @Override()
    public final void sqlite3CodeRowTriggerDirect(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_)
    {
        int _36_ = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_36_ + 40), _31_);
        this._storeInt((_36_ + 36), _32_);
        this._storeInt((_36_ + 32), _33_);
        this._storeInt((_36_ + 28), _34_);
        this._storeInt((_36_ + 24), _35_);
        this._storeInt((_36_ + 20), (sqlite3GetVdbe((this._loadInt((_36_ + 44))))));
        label$0:
        do {
            if ((this._storeInt((_36_ + 16), (getRowTrigger((this._loadInt((_36_ + 44))), (this._loadInt((_36_ + 40))), (this._loadInt((_36_ + 36))), (this._loadInt((_36_ + 28))))))) == 0) {
                break label$0;
            }
            _35_ = 0;
            label$1:
            do {
                if ((this._loadInt((this._loadInt((_36_ + 40))))) == 0) {
                    break label$1;
                }
                _35_ = (((this._loadInt8u(((this._loadInt((this._loadInt((_36_ + 44))))) + 15))) & 2) == 0) ? 1 : 0;
            }
            while (false);
            this._storeInt((_36_ + 12), _35_);
            _35_ = this._storeInt(((_35_ = this._loadInt((_36_ + 44))) + 72), ((this._loadInt((_35_ + 72))) + 1));
            sqlite3VdbeAddOp3((this._loadInt((_36_ + 20))), 108, (this._loadInt((_36_ + 32))), (this._loadInt((_36_ + 24))), _35_);
            sqlite3VdbeChangeP4((this._loadInt((_36_ + 20))), -1, (this._loadInt(((this._loadInt((_36_ + 16))) + 8))), -18);
            sqlite3VdbeChangeP5((this._loadInt((_36_ + 20))), (this._loadInt8u((_36_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_36_ + 48));
        return;
    }

    @Override()
    public final int getRowTrigger(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_34_ + 28))) + 424))) == 0) {
                    break label$1;
                }
                _33_ = this._loadInt(((this._loadInt((_34_ + 28))) + 424));
                break label$0;
            }
            while (false);
            _33_ = this._loadInt((_34_ + 28));
        }
        while (false);
        this._storeInt((_34_ + 8), (this._loadInt(((this._storeInt((_34_ + 12), _33_)) + 548))));
        label$3:
        do {
            label$2:
            while (true) {
                _33_ = 0;
                label$4:
                do {
                    if ((this._loadInt((_34_ + 8))) == 0) {
                        break label$4;
                    }
                    _33_ = 1;
                    if ((this._loadInt((this._loadInt((_34_ + 8))))) != (this._loadInt((_34_ + 24)))) {
                        break label$4;
                    }
                    _33_ = ((this._loadInt(((this._loadInt((_34_ + 8))) + 4))) != (this._loadInt((_34_ + 16)))) ? 1 : 0;
                }
                while (false);
                if (_33_ == 0) {
                    break label$3;
                }
                this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((_34_ + 8))) + 20))));
                continue label$2;
            }
        }
        while (false);
        label$5:
        do {
            if ((this._loadInt((_34_ + 8))) != 0) {
                break label$5;
            }
            this._storeInt((_34_ + 8), (codeRowTrigger((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 16))))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 8));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final int codeRowTrigger(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 88), _30_);
        this._storeInt((_34_ + 84), _31_);
        this._storeInt((_34_ + 80), _32_);
        this._storeInt((_34_ + 76), _33_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_34_ + 88))) + 424))) == 0) {
                    break label$1;
                }
                _33_ = this._loadInt(((this._loadInt((_34_ + 88))) + 424));
                break label$0;
            }
            while (false);
            _33_ = this._loadInt((_34_ + 88));
        }
        while (false);
        this._storeInt((_34_ + 72), _33_);
        this._storeInt((_34_ + 68), (this._loadInt((this._loadInt((_34_ + 88))))));
        _33_ = this._storeInt((_34_ + 4), (this._storeInt((_34_ + 12), (this._storeInt((_34_ + 60), 0)))));
        label$2:
        do {
            label$3:
            do {
                label$4:
                do {
                    label$5:
                    do {
                        if ((this._storeInt((_34_ + 64), (sqlite3DbMallocZero((this._loadInt((_34_ + 68))), 24)))) == 0) {
                            break label$5;
                        }
                        this._storeInt(((_33_ = this._loadInt((_34_ + 64))) + 20), (this._loadInt(((_32_ = this._loadInt((_34_ + 72))) + 548))));
                        this._storeInt((_32_ + 548), _33_);
                        _33_ = this._storeInt((_34_ + 12), (sqlite3DbMallocZero((this._loadInt((_34_ + 68))), 24)));
                        if ((this._storeInt(((this._loadInt((_34_ + 64))) + 8), _33_)) == 0) {
                            break label$4;
                        }
                        sqlite3VdbeLinkSubProgram((this._loadInt(((this._loadInt((_34_ + 72))) + 12))), (this._loadInt((_34_ + 12))));
                        this._storeInt((_33_ = this._loadInt((_34_ + 64))), (this._loadInt((_34_ + 84))));
                        this._storeInt((_33_ + 4), (this._loadInt((_34_ + 76))));
                        _33_ = this._storeInt(((this._loadInt((_34_ + 64))) + 12), -1);
                        this._storeInt(((this._loadInt((_34_ + 64))) + 16), _33_);
                        if ((this._storeInt((_34_ + 8), (sqlite3DbMallocZero((this._loadInt((_34_ + 68))), 560)))) == 0) {
                            break label$3;
                        }
                        memset((_34_ + 16), 0, 36);
                        this._storeInt((_34_ + 16), (this._loadInt((_34_ + 8))));
                        this._storeInt((_33_ = this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 68))));
                        this._storeInt((_33_ + 428), (this._loadInt((_34_ + 80))));
                        this._storeInt(((this._loadInt((_34_ + 8))) + 424), (this._loadInt((_34_ + 72))));
                        this._storeInt(((this._loadInt((_34_ + 8))) + 516), (this._loadInt((this._loadInt((_34_ + 84))))));
                        this._storeInt8(((this._loadInt((_34_ + 8))) + 440), (this._loadInt8u(((this._loadInt((_34_ + 84))) + 8))));
                        this._storeDouble(((this._loadInt((_34_ + 8))) + 448), (this._loadDouble(((this._loadInt((_34_ + 88))) + 448))));
                        label$6:
                        do {
                            if ((this._storeInt((_34_ + 56), (sqlite3GetVdbe((this._loadInt((_34_ + 8))))))) == 0) {
                                break label$6;
                            }
                            _33_ = this._loadInt((_34_ + 56));
                            _32_ = this._loadInt((_34_ + 68));
                            this._storeInt(_34_, (this._loadInt((this._loadInt((_34_ + 84))))));
                            sqlite3VdbeChangeP4(_33_, -1, (sqlite3MPrintf(_32_, 46768, _34_)), -1);
                            label$7:
                            do {
                                if ((this._loadInt(((this._loadInt((_34_ + 84))) + 12))) == 0) {
                                    break label$7;
                                }
                                label$8:
                                do {
                                    if ((sqlite3ResolveExprNames((_34_ + 16), (this._storeInt((_34_ + 60), (sqlite3ExprDup((this._loadInt((_34_ + 68))), (this._loadInt(((this._loadInt((_34_ + 84))) + 12))), 0)))))) != 0) {
                                        break label$8;
                                    }
                                    if ((this._loadInt8u(((this._loadInt((_34_ + 68))) + 30))) != 0) {
                                        break label$8;
                                    }
                                    _33_ = this._storeInt((_34_ + 4), (sqlite3VdbeMakeLabel((this._loadInt((_34_ + 56))))));
                                    sqlite3ExprIfFalse((this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 60))), _33_, 8);
                                }
                                while (false);
                                sqlite3ExprDelete((this._loadInt((_34_ + 68))), (this._loadInt((_34_ + 60))));
                            }
                            while (false);
                            codeTriggerProgram((this._loadInt((_34_ + 8))), (this._loadInt(((this._loadInt((_34_ + 84))) + 28))), (this._loadInt((_34_ + 76))));
                            label$9:
                            do {
                                if ((this._loadInt((_34_ + 4))) == 0) {
                                    break label$9;
                                }
                                sqlite3VdbeResolveLabel((this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 4))));
                            }
                            while (false);
                            sqlite3VdbeAddOp0((this._loadInt((_34_ + 56))), 6);
                            transferParseError((this._loadInt((_34_ + 88))), (this._loadInt((_34_ + 8))));
                            label$10:
                            do {
                                if ((this._loadInt8u(((this._loadInt((_34_ + 68))) + 30))) != 0) {
                                    break label$10;
                                }
                                _33_ = sqlite3VdbeTakeOpArray((this._loadInt((_34_ + 56))), ((this._loadInt((_34_ + 12))) + 4), ((this._loadInt((_34_ + 72))) + 420));
                                this._storeInt((this._loadInt((_34_ + 12))), _33_);
                            }
                            while (false);
                            this._storeInt(((_33_ = this._loadInt((_34_ + 12))) + 8), (this._loadInt(((_32_ = this._loadInt((_34_ + 8))) + 72))));
                            this._storeInt((_33_ + 12), (this._loadInt((_32_ + 68))));
                            this._storeInt(((this._loadInt((_34_ + 12))) + 16), (this._loadInt((_34_ + 84))));
                            this._storeInt(((this._loadInt((_34_ + 64))) + 12), (this._loadInt(((this._loadInt((_34_ + 8))) + 432))));
                            this._storeInt(((this._loadInt((_34_ + 64))) + 16), (this._loadInt(((this._loadInt((_34_ + 8))) + 436))));
                            sqlite3VdbeDelete((this._loadInt((_34_ + 56))));
                        }
                        while (false);
                        sqlite3DbFree((this._loadInt((_34_ + 68))), (this._loadInt((_34_ + 8))));
                        this._storeInt((_34_ + 92), (this._loadInt((_34_ + 64))));
                        break label$2;
                    }
                    while (false);
                    this._storeInt((_34_ + 92), _33_);
                    break label$2;
                }
                while (false);
                this._storeInt((_34_ + 92), 0);
                break label$2;
            }
            while (false);
            this._storeInt((_34_ + 92), 0);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 92));
        this._storeInt((0 + 4), (_34_ + 96));
        return _33_;
    }

    @Override()
    public final void sqlite3VdbeLinkSubProgram(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt(((_31_ = this._storeInt((_32_ + 8), _31_)) + 20), (this._loadInt(((_32_ = this._loadInt((_32_ + 12))) + 184))));
        this._storeInt((_32_ + 184), _31_);
        return;
    }

    @Override()
    public final int codeTriggerProgram(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_33_ + 40), _31_);
        this._storeInt((_33_ + 36), _32_);
        this._storeInt((_33_ + 28), (this._loadInt(((this._loadInt((_33_ + 44))) + 12))));
        this._storeInt((_33_ + 24), (this._loadInt((this._loadInt((_33_ + 44))))));
        this._storeInt((_33_ + 32), (this._loadInt((_33_ + 40))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_33_ + 32))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_33_ + 36))) != 99) {
                            break label$3;
                        }
                        _32_ = this._loadInt8u(((this._loadInt((_33_ + 32))) + 1));
                        break label$2;
                    }
                    while (false);
                    _32_ = this._loadInt8u((_33_ + 36));
                }
                while (false);
                this._storeInt8(((this._loadInt((_33_ + 44))) + 441), _32_);
                label$4:
                do {
                    label$5:
                    do {
                        label$6:
                        do {
                            label$7:
                            do {
                                if ((_32_ = this._loadInt8u((this._loadInt((_33_ + 32))))) == 105) {
                                    break label$7;
                                }
                                if (_32_ == 106) {
                                    break label$6;
                                }
                                if (_32_ != 107) {
                                    break label$5;
                                }
                                sqlite3Update((_32_ = this._loadInt((_33_ + 44))), (targetSrcList(_32_, (this._loadInt((_33_ + 32))))), (sqlite3ExprListDup((this._loadInt((_33_ + 24))), (this._loadInt(((this._loadInt((_33_ + 32))) + 24))), 0)), (sqlite3ExprDup((this._loadInt((_33_ + 24))), (this._loadInt(((this._loadInt((_33_ + 32))) + 20))), 0)), (this._loadInt8u(((this._loadInt((_33_ + 44))) + 441))));
                                break label$4;
                            }
                            while (false);
                            sqlite3Insert((_32_ = this._loadInt((_33_ + 44))), (targetSrcList(_32_, (this._loadInt((_33_ + 32))))), (sqlite3ExprListDup((this._loadInt((_33_ + 24))), (this._loadInt(((this._loadInt((_33_ + 32))) + 24))), 0)), (sqlite3SelectDup((this._loadInt((_33_ + 24))), (this._loadInt(((this._loadInt((_33_ + 32))) + 8))), 0)), (sqlite3IdListDup((this._loadInt((_33_ + 24))), (this._loadInt(((this._loadInt((_33_ + 32))) + 28))))), (this._loadInt8u(((this._loadInt((_33_ + 44))) + 441))));
                            break label$4;
                        }
                        while (false);
                        sqlite3DeleteFrom((_32_ = this._loadInt((_33_ + 44))), (targetSrcList(_32_, (this._loadInt((_33_ + 32))))), (sqlite3ExprDup((this._loadInt((_33_ + 24))), (this._loadInt(((this._loadInt((_33_ + 32))) + 20))), 0)));
                        break label$4;
                    }
                    while (false);
                    this._storeInt((_33_ + 4), (sqlite3SelectDup((this._loadInt((_33_ + 24))), (this._loadInt(((this._loadInt((_33_ + 32))) + 8))), 0)));
                    sqlite3SelectDestInit((_33_ + 8), 4, 0);
                    sqlite3Select((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 4))), (_33_ + 8));
                    sqlite3SelectDelete((this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 4))));
                }
                while (false);
                label$8:
                do {
                    if ((this._loadInt8u((this._loadInt((_33_ + 32))))) == 116) {
                        break label$8;
                    }
                    sqlite3VdbeAddOp0((this._loadInt((_33_ + 28))), 58);
                }
                while (false);
                this._storeInt((_33_ + 32), (this._loadInt(((this._loadInt((_33_ + 32))) + 32))));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 48));
        return 0;
    }

    @Override()
    public final void transferParseError(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_32_ + 12))) + 64))) == 0) {
                    break label$1;
                }
                sqlite3DbFree((this._loadInt((_31_ = this._loadInt((_32_ + 8))))), (this._loadInt((_31_ + 8))));
                break label$0;
            }
            while (false);
            this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 8), (this._loadInt(((_30_ = this._loadInt((_32_ + 8))) + 8))));
            this._storeInt((_31_ + 64), (this._loadInt((_30_ + 64))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int sqlite3VdbeTakeOpArray(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 12))) + 4))));
        resolveP2Values((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 4))));
        this._storeInt((this._loadInt((_33_ + 8))), (this._loadInt(((_32_ = this._loadInt((_33_ + 12))) + 28))));
        this._storeInt((_32_ + 4), 0);
        _32_ = this._loadInt(_33_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int targetSrcList(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 16), (sqlite3SrcListAppend((this._loadInt((this._loadInt((_32_ + 28))))), 0, (_31_ + 12), 0)))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._storeInt((_32_ + 20), (sqlite3SchemaToIndex((this._loadInt((this._loadInt((_32_ + 28))))), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 24))) + 4))) + 20))))))) == 0) {
                    break label$1;
                }
                if ((this._loadInt((_32_ + 20))) < 2) {
                    break label$0;
                }
            }
            while (false);
            _31_ = sqlite3DbStrDup((_31_ = this._storeInt((_32_ + 12), (this._loadInt((this._loadInt((_32_ + 28))))))), (this._loadInt(((this._loadInt((_31_ + 8))) + ((this._loadInt((_32_ + 20))) << 4)))));
            this._storeInt((((_30_ = this._loadInt((_32_ + 16))) + ((this._loadInt16s(_30_)) * 56)) + -48), _31_);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 16));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int checkColumnOverlap(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_32_ + 8))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt((_32_ + 4))) == 0) {
                        break label$2;
                    }
                    _31_ = this._storeInt(_32_, 0);
                    label$4:
                    do {
                        label$3:
                        while (true) {
                            if ((this._loadInt(_32_)) >= (this._loadInt((this._loadInt((_32_ + 4)))))) {
                                break label$1;
                            }
                            if ((sqlite3IdListIndex((this._loadInt((_32_ + 8))), (this._loadInt((((this._loadInt(((this._loadInt((_32_ + 4))) + 12))) + ((this._loadInt(_32_)) * 20)) + 4))))) >= _31_) {
                                break label$4;
                            }
                            this._storeInt(_32_, ((this._loadInt(_32_)) + 1));
                            continue label$3;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 12), 1);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 12), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int xferCompatibleCollation(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_32_ + 8))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt((_32_ + 4))) == 0) {
                        break label$1;
                    }
                    this._storeInt((_32_ + 12), (((sqlite3StrICmp((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))))) == 0) ? 1 : 0));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 12), (((this._loadInt((_32_ + 4))) == 0) ? 1 : 0));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int xferCompatibleIndex(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_32_ + 8))) + 4))) == (this._loadInt((_31_ + 4)))) {
                    break label$1;
                }
                this._storeInt((_32_ + 12), 0);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 8))) + 24))) == (this._loadInt8u(((this._loadInt((_32_ + 4))) + 24)))) {
                    break label$2;
                }
                this._storeInt((_32_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt(_32_, 0);
            label$3:
            do {
                label$4:
                do {
                    label$5:
                    do {
                        label$7:
                        do {
                            label$6:
                            while (true) {
                                if ((this._loadInt(_32_)) >= (this._loadInt(((this._loadInt((_32_ + 4))) + 4)))) {
                                    break label$5;
                                }
                                if ((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 4))) + 8))) + (_31_ = (this._loadInt(_32_)) << 2)))) != (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 8))) + 8))) + _31_)))) {
                                    break label$4;
                                }
                                if ((this._loadInt8u(((this._loadInt(((this._loadInt((_32_ + 4))) + 40))) + (_31_ = this._loadInt(_32_))))) != (this._loadInt8u(((this._loadInt(((this._loadInt((_32_ + 8))) + 40))) + _31_)))) {
                                    break label$3;
                                }
                                if ((xferCompatibleCollation((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 4))) + 44))) + (_31_ = (this._loadInt(_32_)) << 2)))), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 8))) + 44))) + _31_))))) == 0) {
                                    break label$7;
                                }
                                this._storeInt(_32_, ((this._loadInt(_32_)) + 1));
                                continue label$6;
                            }
                        }
                        while (false);
                        this._storeInt((_32_ + 12), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_32_ + 12), 1);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void updateVirtualTable(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_,
            int _36_,
            int _37_)
    {
        int _38_ = 0;
        this._storeInt(((_38_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 92), _30_);
        this._storeInt((_38_ + 88), _31_);
        this._storeInt((_38_ + 84), _32_);
        this._storeInt((_38_ + 80), _33_);
        this._storeInt((_38_ + 76), _34_);
        this._storeInt((_38_ + 72), _35_);
        this._storeInt((_38_ + 68), _36_);
        this._storeInt((_38_ + 64), _37_);
        this._storeInt((_38_ + 60), (this._loadInt(((this._loadInt((_38_ + 92))) + 12))));
        _37_ = this._storeInt((_38_ + 52), (this._storeInt((_38_ + 56), 0)));
        this._storeInt((_38_ + 24), (sqlite3GetVTable((this._storeInt((_38_ + 28), (this._loadInt((this._loadInt((_38_ + 92))))))), (this._loadInt((_38_ + 84))))));
        this._storeInt((_38_ + 56), (sqlite3ExprListAppend((this._loadInt((_38_ + 92))), _37_, (sqlite3Expr((this._loadInt((_38_ + 28))), 26, 46960)))));
        label$0:
        do {
            if ((this._loadInt((_38_ + 76))) == 0) {
                break label$0;
            }
            this._storeInt((_38_ + 56), (sqlite3ExprListAppend((this._loadInt((_38_ + 92))), (this._loadInt((_38_ + 56))), (sqlite3ExprDup((this._loadInt((_38_ + 28))), (this._loadInt((_38_ + 76))), _37_)))));
        }
        while (false);
        this._storeInt((_38_ + 40), _37_);
        label$2:
        do {
            label$1:
            while (true) {
                if ((this._loadInt((_38_ + 40))) >= (this._loadInt(((this._loadInt((_38_ + 84))) + 8)))) {
                    break label$2;
                }
                label$3:
                do {
                    label$4:
                    do {
                        if ((this._loadInt(((this._loadInt((_38_ + 72))) + ((this._loadInt((_38_ + 40))) << 2)))) < _37_) {
                            break label$4;
                        }
                        this._storeInt((_38_ + 48), (sqlite3ExprDup((this._loadInt((_38_ + 28))), (this._loadInt(((this._loadInt(((this._loadInt((_38_ + 80))) + 12))) + ((this._loadInt(((this._loadInt((_38_ + 72))) + ((this._loadInt((_38_ + 40))) << 2)))) * 20)))), _37_)));
                        break label$3;
                    }
                    while (false);
                    this._storeInt((_38_ + 48), (sqlite3Expr((this._loadInt((_38_ + 28))), 26, (this._loadInt(((this._loadInt(((this._loadInt((_38_ + 84))) + 12))) + ((this._loadInt((_38_ + 40))) * 24)))))));
                }
                while (false);
                this._storeInt((_38_ + 56), (sqlite3ExprListAppend((this._loadInt((_38_ + 92))), (this._loadInt((_38_ + 56))), (this._loadInt((_38_ + 48))))));
                this._storeInt((_38_ + 40), ((this._loadInt((_38_ + 40))) + 1));
                continue label$1;
            }
        }
        while (false);
        this._storeInt((_38_ + 52), (sqlite3SelectNew((this._loadInt((_38_ + 92))), (this._loadInt((_38_ + 56))), (this._loadInt((_38_ + 88))), (this._loadInt((_38_ + 68))), 0, 0, 0, 0, 0, 0)));
        this._storeInt(((_37_ = this._loadInt((_38_ + 92))) + 68), ((_37_ = this._loadInt((_37_ + 68))) + 1));
        this._storeInt((_38_ + 44), _37_);
        sqlite3VdbeAddOp2((this._loadInt((_38_ + 60))), 41, _37_, (((this._loadInt(((this._loadInt((_38_ + 84))) + 8))) + (((this._loadInt((_38_ + 76))) != 0) ? 1 : 0)) + 1));
        sqlite3VdbeChangeP5((this._loadInt((_38_ + 60))), 16);
        sqlite3SelectDestInit((_38_ + 8), 8, (this._loadInt((_38_ + 44))));
        sqlite3Select((this._loadInt((_38_ + 92))), (this._loadInt((_38_ + 52))), (_38_ + 8));
        this._storeInt((_38_ + 32), (this._storeInt(((_37_ = this._loadInt((_38_ + 92))) + 72), ((this._loadInt((_37_ + 72))) + 1))));
        this._storeInt(((_37_ = this._loadInt((_38_ + 92))) + 72), (((this._loadInt((_37_ + 72))) + (this._loadInt(((this._loadInt((_38_ + 84))) + 8)))) + 1));
        this._storeInt((_38_ + 36), (sqlite3VdbeAddOp2((this._loadInt((_38_ + 60))), 65, (this._loadInt((_38_ + 44))), 0)));
        sqlite3VdbeAddOp3((this._loadInt((_38_ + 60))), 28, (this._loadInt((_38_ + 44))), 0, (this._loadInt((_38_ + 32))));
        sqlite3VdbeAddOp3((this._loadInt((_38_ + 60))), 28, (this._loadInt((_38_ + 44))), (((this._loadInt((_38_ + 76))) != 0) ? 1 : 0), ((this._loadInt((_38_ + 32))) + 1));
        _36_ = this._storeInt((_38_ + 40), 0);
        label$6:
        do {
            label$5:
            while (true) {
                if ((this._loadInt((_38_ + 40))) >= (this._loadInt(((this._loadInt((_38_ + 84))) + 8)))) {
                    break label$6;
                }
                sqlite3VdbeAddOp3((this._loadInt((_38_ + 60))), 28, (this._loadInt((_38_ + 44))), (((_37_ = this._loadInt((_38_ + 40))) + (((this._loadInt((_38_ + 76))) != _36_) ? 1 : 0)) + 1), (((this._loadInt((_38_ + 32))) + _37_) + 2));
                this._storeInt((_38_ + 40), ((this._loadInt((_38_ + 40))) + 1));
                continue label$5;
            }
        }
        while (false);
        sqlite3VtabMakeWritable((this._loadInt((_38_ + 92))), (this._loadInt((_38_ + 84))));
        _37_ = 2;
        sqlite3VdbeAddOp4((this._loadInt((_38_ + 60))), 133, 0, ((this._loadInt(((this._loadInt((_38_ + 84))) + 8))) + 2), (this._loadInt((_38_ + 32))), (this._loadInt((_38_ + 24))), -10);
        _36_ = this._loadInt((_38_ + 60));
        label$7:
        do {
            if ((this._loadInt((_38_ + 64))) == 99) {
                break label$7;
            }
            _37_ = this._loadInt((_38_ + 64));
        }
        while (false);
        sqlite3VdbeChangeP5(_36_, (_37_ & 255));
        sqlite3MayAbort((this._loadInt((_38_ + 92))));
        sqlite3VdbeAddOp2((this._loadInt((_38_ + 60))), 67, (this._loadInt((_38_ + 44))), ((this._loadInt((_38_ + 36))) + 1));
        sqlite3VdbeJumpHere((this._loadInt((_38_ + 60))), (this._loadInt((_38_ + 36))));
        sqlite3VdbeAddOp2((this._loadInt((_38_ + 60))), 43, (this._loadInt((_38_ + 44))), 0);
        sqlite3SelectDelete((this._loadInt((_38_ + 28))), (this._loadInt((_38_ + 52))));
        this._storeInt((0 + 4), (_38_ + 96));
        return;
    }

    @Override()
    public final void sqlite3AuthContextPush(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt((_32_ = this._loadInt((_33_ + 8))), (this._loadInt(((this._storeInt((_32_ + 4), (this._loadInt((_33_ + 12))))) + 516))));
        this._storeInt(((this._loadInt((_33_ + 12))) + 516), (this._loadInt((_33_ + 4))));
        return;
    }

    @Override()
    public final void sqlite3MaterializeView(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_34_ + 40), _31_);
        this._storeInt((_34_ + 36), _32_);
        this._storeInt((_34_ + 32), _33_);
        this._storeInt((_34_ + 12), (sqlite3SelectDup((this._storeInt((_34_ + 8), (this._loadInt((this._loadInt((_34_ + 44))))))), (this._loadInt(((this._loadInt((_34_ + 40))) + 28))), 0)));
        label$0:
        do {
            if ((this._loadInt((_34_ + 36))) == 0) {
                break label$0;
            }
            this._storeInt((_34_ + 36), (sqlite3ExprDup((this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 36))), 0)));
            label$1:
            do {
                label$2:
                do {
                    if ((this._storeInt((_34_ + 4), (sqlite3SrcListAppend((this._loadInt((_34_ + 8))), 0, 0, 0)))) == 0) {
                        break label$2;
                    }
                    _33_ = sqlite3DbStrDup((this._loadInt((_34_ + 8))), (this._loadInt((this._loadInt((_34_ + 40))))));
                    this._storeInt(((_32_ = this._loadInt((_34_ + 4))) + 24), (this._loadInt((_34_ + 12))));
                    this._storeInt((_32_ + 16), _33_);
                    break label$1;
                }
                while (false);
                sqlite3SelectDelete((this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 12))));
            }
            while (false);
            this._storeInt((_34_ + 12), (sqlite3SelectNew((this._loadInt((_34_ + 44))), 0, (this._loadInt((_34_ + 4))), (this._loadInt((_34_ + 36))), 0, 0, 0, 0, 0, 0)));
        }
        while (false);
        sqlite3SelectDestInit((_34_ + 16), 9, (this._loadInt((_34_ + 32))));
        sqlite3Select((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 12))), (_34_ + 16));
        sqlite3SelectDelete((this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 12))));
        this._storeInt((0 + 4), (_34_ + 48));
        return;
    }

    @Override()
    public final void sqlite3AuthContextPop(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) + 4))) == 0) {
                break label$0;
            }
            this._storeInt(((this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 4))) + 516), (this._loadInt(_30_)));
            this._storeInt((_30_ + 4), 0);
        }
        while (false);
        return;
    }

    @Override()
    public final int sqlite3SrcListEnlarge(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_34_ + 36), _31_);
        this._storeInt((_34_ + 32), _32_);
        this._storeInt((_34_ + 28), _33_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadInt16s((_33_ = this._loadInt((_34_ + 36))))) + (this._loadInt((_34_ + 32)))) <= (this._loadInt16s((_33_ + 2)))) {
                        break label$2;
                    }
                    _33_ = this._storeInt((_34_ + 16), ((this._loadInt16s((this._loadInt((_34_ + 36))))) + (this._loadInt((_34_ + 32)))));
                    if ((this._storeInt((_34_ + 20), (sqlite3DbRealloc((this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 36))), ((_33_ * 56) + 8))))) == 0) {
                        break label$1;
                    }
                    this._storeInt((_34_ + 36), (this._loadInt((_34_ + 20))));
                    _33_ = this._storeInt((_34_ + 12), ((((sqlite3DbMallocSize((this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 20))))) + -64) / 56) + 1));
                    this._storeInt16(((this._loadInt((_34_ + 36))) + 2), _33_);
                }
                while (false);
                this._storeInt((_34_ + 24), ((this._loadInt16s((this._loadInt((_34_ + 36))))) + -1));
                label$4:
                do {
                    label$3:
                    while (true) {
                        if ((this._loadInt((_34_ + 24))) < (this._loadInt((_34_ + 28)))) {
                            break label$4;
                        }
                        memcpy(((_33_ = (this._loadInt((_34_ + 36))) + 8) + (((_32_ = this._loadInt((_34_ + 24))) + (this._loadInt((_34_ + 32)))) * 56)), (_33_ + (_32_ * 56)), 56);
                        this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + -1));
                        continue label$3;
                    }
                }
                while (false);
                this._storeInt16((_33_ = this._loadInt((_34_ + 36))), ((this._loadInt16u(_33_)) + (_32_ = this._loadInt((_34_ + 32)))));
                memset(((_33_ + ((this._loadInt((_34_ + 28))) * 56)) + 8), 0, (_32_ * 56));
                this._storeInt((_34_ + 24), (this._loadInt((_34_ + 28))));
                label$6:
                do {
                    label$5:
                    while (true) {
                        if ((this._loadInt((_34_ + 24))) >= ((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 32))))) {
                            break label$6;
                        }
                        this._storeInt((((this._loadInt((_34_ + 36))) + ((_33_ = this._loadInt((_34_ + 24))) * 56)) + 32), -1);
                        this._storeInt((_34_ + 24), (_33_ + 1));
                        continue label$5;
                    }
                }
                while (false);
                this._storeInt((_34_ + 44), (this._loadInt((_34_ + 36))));
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 44), (this._loadInt((_34_ + 36))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int checkForMultiColumnSelectError(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        this._storeInt((_33_ + 12), (this._loadInt8u((this._loadInt((_33_ + 20))))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_33_ + 16))) < 2) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt((_33_ + 12))) == 6) {
                        break label$2;
                    }
                    if ((this._loadInt((_33_ + 12))) != 7) {
                        break label$1;
                    }
                }
                while (false);
                sqlite3ErrorMsg((this._loadInt((_33_ + 24))), 47888, 0);
                this._storeInt((_33_ + 28), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 28), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int sqlite3SelectExprHeight(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_31_ + 8), 0);
        heightOfSelect((this._loadInt((_31_ + 12))), (_31_ + 8));
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int flattenSubquery(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 112))) + 104), _30_);
        this._storeInt((_35_ + 100), _31_);
        this._storeInt((_35_ + 96), _32_);
        this._storeInt((_35_ + 92), _33_);
        this._storeInt((_35_ + 88), _34_);
        this._storeInt((_35_ + 84), (this._loadInt(((this._loadInt((_35_ + 104))) + 516))));
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt8u(((this._storeInt((_35_ + 40), (this._loadInt((this._loadInt((_35_ + 104))))))) + 12))) & 1) == 0) {
                    break label$1;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_35_ + 44), ((_34_ = (this._storeInt((_35_ + 68), (this._loadInt(((this._loadInt((_35_ + 100))) + 8))))) + ((this._loadInt((_35_ + 96))) * 56)) + 8));
            this._storeInt((_35_ + 56), (this._loadInt((_34_ + 32))));
            this._storeInt((_35_ + 76), (this._loadInt(((this._loadInt((_35_ + 44))) + 16))));
            label$2:
            do {
                if ((this._loadInt((_35_ + 92))) == 0) {
                    break label$2;
                }
                if ((this._loadInt((_35_ + 88))) == 0) {
                    break label$2;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((_35_ + 88))) == 0) {
                    break label$3;
                }
                if ((this._loadInt16s((this._loadInt((_35_ + 68))))) < 2) {
                    break label$3;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_35_ + 64), (this._loadInt(((this._loadInt((_35_ + 76))) + 8))));
            label$4:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 76))) + 40))) == 0) {
                    break label$4;
                }
                if ((this._loadInt(((this._loadInt((_35_ + 100))) + 40))) == 0) {
                    break label$4;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$5:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 76))) + 44))) == 0) {
                    break label$5;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$6:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 100))) + 36))) == 0) {
                    break label$6;
                }
                if ((this._loadInt(((this._loadInt((_35_ + 76))) + 40))) == 0) {
                    break label$6;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$7:
            do {
                label$8:
                do {
                    if ((this._loadInt16s((this._loadInt((_35_ + 64))))) == 0) {
                        break label$8;
                    }
                    if (((this._loadInt16u(((this._loadInt((_35_ + 76))) + 6))) & 1) == 0) {
                        break label$7;
                    }
                    this._storeInt((_35_ + 108), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$9:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 76))) + 40))) == 0) {
                    break label$9;
                }
                label$10:
                do {
                    if ((this._loadInt16s((this._loadInt((_35_ + 68))))) > 1) {
                        break label$10;
                    }
                    if ((this._loadInt((_35_ + 92))) == 0) {
                        break label$9;
                    }
                }
                while (false);
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$11:
            do {
                if (((this._loadInt16u(((this._loadInt((_35_ + 100))) + 6))) & 1) == 0) {
                    break label$11;
                }
                if ((this._loadInt((_35_ + 88))) == 0) {
                    break label$11;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$12:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 100))) + 24))) == 0) {
                    break label$12;
                }
                if ((this._loadInt(((this._loadInt((_35_ + 76))) + 24))) == 0) {
                    break label$12;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$13:
            do {
                if ((this._loadInt((_35_ + 92))) == 0) {
                    break label$13;
                }
                if ((this._loadInt(((this._loadInt((_35_ + 76))) + 24))) == 0) {
                    break label$13;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$14:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 76))) + 40))) == 0) {
                    break label$14;
                }
                if ((this._loadInt(((this._loadInt((_35_ + 100))) + 12))) == 0) {
                    break label$14;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$15:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 76))) + 40))) == 0) {
                    break label$15;
                }
                if (((this._loadInt16u(((this._loadInt((_35_ + 100))) + 6))) & 1) == 0) {
                    break label$15;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$16:
            do {
                if (((this._loadInt8u(((this._loadInt((_35_ + 44))) + 21))) & 32) == 0) {
                    break label$16;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$17:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 76))) + 28))) == 0) {
                    break label$17;
                }
                label$18:
                do {
                    if ((this._loadInt(((this._loadInt((_35_ + 76))) + 24))) == 0) {
                        break label$18;
                    }
                    this._storeInt((_35_ + 108), 0);
                    break label$0;
                }
                while (false);
                label$19:
                do {
                    label$20:
                    do {
                        if ((this._loadInt((_35_ + 92))) != 0) {
                            break label$20;
                        }
                        if (((this._loadInt16u(((this._loadInt((_35_ + 100))) + 6))) & 1) != 0) {
                            break label$20;
                        }
                        if ((this._loadInt16s((this._loadInt((_35_ + 68))))) == 1) {
                            break label$19;
                        }
                    }
                    while (false);
                    this._storeInt((_35_ + 108), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_35_ + 72), (this._loadInt((_35_ + 76))));
                label$21:
                do {
                    label$23:
                    do {
                        label$22:
                        while (true) {
                            if ((this._loadInt((_35_ + 72))) == 0) {
                                break label$21;
                            }
                            if (((this._loadInt16u(((this._loadInt((_35_ + 72))) + 6))) & 5) != 0) {
                                break label$23;
                            }
                            label$24:
                            do {
                                if ((this._loadInt(((this._loadInt((_35_ + 72))) + 28))) == 0) {
                                    break label$24;
                                }
                                if ((this._loadInt8u(((this._loadInt((_35_ + 72))) + 4))) != 113) {
                                    break label$23;
                                }
                            }
                            while (false);
                            if ((this._loadInt(((this._loadInt((_35_ + 72))) + 8))) == 0) {
                                break label$23;
                            }
                            if ((this._loadInt16s((this._loadInt(((this._loadInt((_35_ + 72))) + 8))))) != 1) {
                                break label$23;
                            }
                            this._storeInt((_35_ + 72), (this._loadInt(((this._loadInt((_35_ + 72))) + 28))));
                            continue label$22;
                        }
                    }
                    while (false);
                    this._storeInt((_35_ + 108), 0);
                    break label$0;
                }
                while (false);
                if ((this._loadInt(((this._loadInt((_35_ + 100))) + 24))) == 0) {
                    break label$17;
                }
                this._storeInt((_35_ + 36), 0);
                label$26:
                do {
                    label$25:
                    while (true) {
                        if ((this._loadInt((_35_ + 36))) >= (this._loadInt((this._loadInt(((this._loadInt((_35_ + 100))) + 24)))))) {
                            break label$17;
                        }
                        if ((this._loadInt16u((((this._loadInt(((this._loadInt(((this._loadInt((_35_ + 100))) + 24))) + 12))) + ((this._loadInt((_35_ + 36))) * 20)) + 14))) == 0) {
                            break label$26;
                        }
                        this._storeInt((_35_ + 36), ((this._loadInt((_35_ + 36))) + 1));
                        continue label$25;
                    }
                }
                while (false);
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            this._storeInt(((_34_ = this._loadInt((_35_ + 104))) + 516), (this._loadInt(((this._loadInt((_35_ + 44))) + 4))));
            sqlite3AuthCheck(_34_, 21, 0, 0, 0);
            this._storeInt(((this._loadInt((_35_ + 104))) + 516), (this._loadInt((_35_ + 84))));
            this._storeInt((_35_ + 76), (this._loadInt(((this._loadInt((_35_ + 76))) + 28))));
            label$27:
            do {
                label$29:
                do {
                    label$28:
                    while (true) {
                        if ((this._loadInt((_35_ + 76))) == 0) {
                            break label$27;
                        }
                        this._storeInt((_35_ + 28), (this._loadInt(((this._loadInt((_35_ + 100))) + 24))));
                        this._storeInt((_35_ + 24), (this._loadInt(((this._loadInt((_35_ + 100))) + 40))));
                        this._storeInt((_35_ + 20), (this._loadInt(((this._loadInt((_35_ + 100))) + 28))));
                        _34_ = this._storeInt(((_34_ = this._loadInt((_35_ + 100))) + 28), (this._storeInt((_34_ + 8), (this._storeInt((_34_ + 24), 0)))));
                        this._storeInt(((this._loadInt((_35_ + 100))) + 40), _34_);
                        this._storeInt((_35_ + 32), (sqlite3SelectDup((this._loadInt((_35_ + 40))), (this._loadInt((_35_ + 100))), _34_)));
                        this._storeInt(((_33_ = this._loadInt((_35_ + 100))) + 40), (this._loadInt((_35_ + 24))));
                        this._storeInt((_33_ + 24), (this._loadInt((_35_ + 28))));
                        this._storeInt(((this._loadInt((_35_ + 100))) + 8), (this._loadInt((_35_ + 68))));
                        this._storeInt8(((this._loadInt((_35_ + 100))) + 4), 113);
                        this._storeInt(((this._loadInt((_35_ + 100))) + 36), _34_);
                        label$30:
                        do {
                            label$31:
                            do {
                                if ((this._loadInt((_35_ + 32))) == 0) {
                                    break label$31;
                                }
                                this._storeInt(((_33_ = this._loadInt((_35_ + 32))) + 36), _34_);
                                this._storeInt((_33_ + 28), (this._loadInt((_35_ + 20))));
                                break label$30;
                            }
                            while (false);
                            this._storeInt((_35_ + 32), (this._loadInt((_35_ + 20))));
                        }
                        while (false);
                        this._storeInt(((this._loadInt((_35_ + 100))) + 28), (this._loadInt((_35_ + 32))));
                        if ((this._loadInt8u(((this._loadInt((_35_ + 40))) + 30))) != 0) {
                            break label$29;
                        }
                        this._storeInt((_35_ + 76), (this._loadInt(((this._loadInt((_35_ + 76))) + 28))));
                        continue label$28;
                    }
                }
                while (false);
                this._storeInt((_35_ + 108), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_35_ + 76), (this._storeInt((_35_ + 72), (this._loadInt(((this._loadInt((_35_ + 44))) + 16))))));
            sqlite3DbFree((this._loadInt((_35_ + 40))), (this._loadInt((this._loadInt((_35_ + 44))))));
            sqlite3DbFree((this._loadInt((_35_ + 40))), (this._loadInt(((this._loadInt((_35_ + 44))) + 4))));
            sqlite3DbFree((this._loadInt((_35_ + 40))), (this._loadInt(((this._loadInt((_35_ + 44))) + 8))));
            this._storeLong((_34_ = this._loadInt((_35_ + 44))), 0L);
            _31_ = this._storeInt((_34_ + 16), (this._storeInt((_34_ + 8), 0)));
            label$32:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 44))) + 12))) == 0) {
                    break label$32;
                }
                label$33:
                do {
                    label$34:
                    do {
                        label$35:
                        do {
                            label$36:
                            do {
                                if ((this._loadInt16u(((this._storeInt((_35_ + 16), (this._loadInt(((this._loadInt((_35_ + 44))) + 12))))) + 32))) != 1) {
                                    break label$36;
                                }
                                if ((this._loadInt(((this._loadInt((_35_ + 104))) + 424))) == 0) {
                                    break label$35;
                                }
                                _34_ = this._loadInt(((this._loadInt((_35_ + 104))) + 424));
                                break label$34;
                            }
                            while (false);
                            this._storeInt16(((_34_ = this._loadInt((_35_ + 16))) + 32), ((this._loadInt16u((_34_ + 32))) + -1));
                            break label$33;
                        }
                        while (false);
                        _34_ = this._loadInt((_35_ + 104));
                    }
                    while (false);
                    this._storeInt((_35_ + 12), _34_);
                    this._storeInt(((_33_ = this._loadInt((_35_ + 16))) + 72), (this._loadInt((_34_ + 544))));
                    this._storeInt((_34_ + 544), _33_);
                }
                while (false);
                this._storeInt(((this._loadInt((_35_ + 44))) + 12), 0);
            }
            while (false);
            this._storeInt((_35_ + 80), (this._loadInt((_35_ + 100))));
            label$38:
            do {
                label$37:
                while (true) {
                    if ((this._loadInt((_35_ + 80))) == 0) {
                        break label$38;
                    }
                    _34_ = this._storeInt8((_35_ + 7), _31_);
                    this._storeInt((_35_ + 64), (this._loadInt(((this._loadInt((_35_ + 76))) + 8))));
                    this._storeInt((_35_ + 8), (this._loadInt16s((this._loadInt((_35_ + 64))))));
                    label$39:
                    do {
                        label$40:
                        do {
                            if ((this._storeInt((_35_ + 68), (this._loadInt(((this._loadInt((_35_ + 80))) + 8))))) == 0) {
                                break label$40;
                            }
                            this._storeInt8((_35_ + 7), (this._loadInt8u(((this._loadInt((_35_ + 44))) + 21))));
                            break label$39;
                        }
                        while (false);
                        _33_ = sqlite3SrcListAppend((this._loadInt((_35_ + 40))), _34_, _34_, _34_);
                        if ((this._storeInt((_35_ + 68), (this._storeInt(((this._loadInt((_35_ + 80))) + 8), _33_)))) == 0) {
                            break label$38;
                        }
                    }
                    while (false);
                    label$41:
                    do {
                        if ((this._loadInt((_35_ + 8))) < 2) {
                            break label$41;
                        }
                        _33_ = this._storeInt((_35_ + 68), (sqlite3SrcListEnlarge((this._loadInt((_35_ + 40))), (this._loadInt((_35_ + 68))), ((this._loadInt((_35_ + 8))) + -1), ((this._loadInt((_35_ + 96))) + 1))));
                        this._storeInt(((this._loadInt((_35_ + 80))) + 8), _33_);
                        if ((this._loadInt8u(((this._loadInt((_35_ + 40))) + 30))) != 0) {
                            break label$38;
                        }
                    }
                    while (false);
                    _33_ = this._storeInt((_35_ + 52), _34_);
                    label$43:
                    do {
                        label$42:
                        while (true) {
                            if ((this._loadInt((_35_ + 52))) >= (this._loadInt((_35_ + 8)))) {
                                break label$43;
                            }
                            sqlite3IdListDelete((this._loadInt((_35_ + 40))), (this._loadInt((((this._loadInt((_35_ + 68))) + (((this._loadInt((_35_ + 52))) + (this._loadInt((_35_ + 96)))) * 56)) + 40))));
                            memcpy((((this._loadInt((_35_ + 68))) + (((_34_ = this._loadInt((_35_ + 52))) + (this._loadInt((_35_ + 96)))) * 56)) + 8), (((this._loadInt((_35_ + 64))) + (_34_ * 56)) + 8), 56);
                            memset((((this._loadInt((_35_ + 64))) + ((this._loadInt((_35_ + 52))) * 56)) + 8), _33_, 56);
                            this._storeInt((_35_ + 52), ((this._loadInt((_35_ + 52))) + 1));
                            continue label$42;
                        }
                    }
                    while (false);
                    this._storeInt8((((this._loadInt((_35_ + 68))) + ((this._loadInt((_35_ + 96))) * 56)) + 29), (this._loadInt8u((_35_ + 7))));
                    this._storeInt((_35_ + 60), (this._loadInt((this._loadInt((_35_ + 80))))));
                    this._storeInt((_35_ + 52), _33_);
                    label$45:
                    do {
                        label$44:
                        while (true) {
                            if ((this._loadInt((_35_ + 52))) >= (this._loadInt((this._loadInt((_35_ + 60)))))) {
                                break label$45;
                            }
                            label$46:
                            do {
                                if ((this._loadInt((((this._loadInt(((this._loadInt((_35_ + 60))) + 12))) + ((this._loadInt((_35_ + 52))) * 20)) + 4))) != 0) {
                                    break label$46;
                                }
                                if ((this._storeInt(_35_, (this._loadInt((((this._loadInt(((this._loadInt((_35_ + 60))) + 12))) + ((this._loadInt((_35_ + 52))) * 20)) + 8))))) == 0) {
                                    break label$46;
                                }
                                _34_ = sqlite3DbStrDup((this._loadInt((_35_ + 40))), (this._loadInt(_35_)));
                                this._storeInt((((this._loadInt(((this._loadInt((_35_ + 60))) + 12))) + ((this._loadInt((_35_ + 52))) * 20)) + 4), _34_);
                            }
                            while (false);
                            this._storeInt((_35_ + 52), ((this._loadInt((_35_ + 52))) + 1));
                            continue label$44;
                        }
                    }
                    while (false);
                    substExprList((this._loadInt((_35_ + 40))), (this._loadInt((this._loadInt((_35_ + 80))))), (this._loadInt((_35_ + 56))), (this._loadInt((this._loadInt((_35_ + 76))))));
                    label$47:
                    do {
                        if ((this._loadInt((_35_ + 92))) == 0) {
                            break label$47;
                        }
                        substExprList((this._loadInt((_35_ + 40))), (this._loadInt(((this._loadInt((_35_ + 80))) + 16))), (this._loadInt((_35_ + 56))), (this._loadInt((this._loadInt((_35_ + 76))))));
                        _34_ = substExpr((this._loadInt((_35_ + 40))), (this._loadInt(((this._loadInt((_35_ + 80))) + 20))), (this._loadInt((_35_ + 56))), (this._loadInt((this._loadInt((_35_ + 76))))));
                        this._storeInt(((this._loadInt((_35_ + 80))) + 20), _34_);
                    }
                    while (false);
                    label$48:
                    do {
                        label$49:
                        do {
                            if ((this._loadInt(((this._loadInt((_35_ + 76))) + 24))) == 0) {
                                break label$49;
                            }
                            this._storeInt(((this._loadInt((_35_ + 80))) + 24), (this._loadInt(((_34_ = this._loadInt((_35_ + 76))) + 24))));
                            this._storeInt((_34_ + 24), _33_);
                            break label$48;
                        }
                        while (false);
                        if ((this._loadInt(((this._loadInt((_35_ + 80))) + 24))) == 0) {
                            break label$48;
                        }
                        substExprList((this._loadInt((_35_ + 40))), (this._loadInt(((this._loadInt((_35_ + 80))) + 24))), (this._loadInt((_35_ + 56))), (this._loadInt((this._loadInt((_35_ + 76))))));
                    }
                    while (false);
                    label$50:
                    do {
                        label$51:
                        do {
                            if ((this._loadInt(((this._loadInt((_35_ + 76))) + 12))) == 0) {
                                break label$51;
                            }
                            this._storeInt((_35_ + 48), (sqlite3ExprDup((this._loadInt((_35_ + 40))), (this._loadInt(((this._loadInt((_35_ + 76))) + 12))), _33_)));
                            break label$50;
                        }
                        while (false);
                        this._storeInt((_35_ + 48), _33_);
                    }
                    while (false);
                    label$52:
                    do {
                        label$53:
                        do {
                            if ((this._loadInt((_35_ + 88))) == 0) {
                                break label$53;
                            }
                            this._storeInt(((_34_ = this._loadInt((_35_ + 80))) + 20), (this._loadInt((_34_ + 12))));
                            this._storeInt((_34_ + 12), (this._loadInt((_35_ + 48))));
                            _34_ = substExpr((this._loadInt((_35_ + 40))), (this._loadInt(((this._loadInt((_35_ + 80))) + 20))), (this._loadInt((_35_ + 56))), (this._loadInt((this._loadInt((_35_ + 76))))));
                            this._storeInt(((this._loadInt((_35_ + 80))) + 20), _34_);
                            _34_ = sqlite3ExprAnd((_32_ = this._loadInt((_35_ + 40))), _34_, (sqlite3ExprDup(_32_, (this._loadInt(((this._loadInt((_35_ + 76))) + 20))), _33_)));
                            this._storeInt(((this._loadInt((_35_ + 80))) + 20), _34_);
                            _34_ = sqlite3ExprListDup((this._loadInt((_35_ + 40))), (this._loadInt(((this._loadInt((_35_ + 76))) + 16))), _33_);
                            this._storeInt(((this._loadInt((_35_ + 80))) + 16), _34_);
                            break label$52;
                        }
                        while (false);
                        _34_ = substExpr((this._loadInt((_35_ + 40))), (this._loadInt(((this._loadInt((_35_ + 80))) + 12))), (this._loadInt((_35_ + 56))), (this._loadInt((this._loadInt((_35_ + 76))))));
                        this._storeInt(((this._loadInt((_35_ + 80))) + 12), _34_);
                        _34_ = sqlite3ExprAnd((this._loadInt((_35_ + 40))), _34_, (this._loadInt((_35_ + 48))));
                        this._storeInt(((this._loadInt((_35_ + 80))) + 12), _34_);
                    }
                    while (false);
                    this._storeInt16(((_34_ = this._loadInt((_35_ + 80))) + 6), ((this._loadInt16u((_34_ + 6))) | ((this._loadInt16u(((_34_ = this._loadInt((_35_ + 76))) + 6))) & 1)));
                    label$54:
                    do {
                        if ((this._loadInt((_34_ + 40))) == 0) {
                            break label$54;
                        }
                        this._storeInt(((this._loadInt((_35_ + 80))) + 40), (this._loadInt(((_34_ = this._loadInt((_35_ + 76))) + 40))));
                        this._storeInt((_34_ + 40), _33_);
                    }
                    while (false);
                    this._storeInt((_35_ + 80), (this._loadInt(((this._loadInt((_35_ + 80))) + 28))));
                    this._storeInt((_35_ + 76), (this._loadInt(((this._loadInt((_35_ + 76))) + 28))));
                    continue label$37;
                }
            }
            while (false);
            sqlite3SelectDelete((this._loadInt((_35_ + 40))), (this._loadInt((_35_ + 72))));
            this._storeInt((_35_ + 108), 1);
        }
        while (false);
        _34_ = this._loadInt((_35_ + 108));
        this._storeInt((0 + 4), (_35_ + 112));
        return _34_;
    }

    @Override()
    public final int multiSelect(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        double _34_ = 0.0;
        double _35_ = 0.0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 256))) + 248), _30_);
        this._storeInt((_33_ + 244), _31_);
        this._storeInt((_33_ + 240), _32_);
        this._storeInt((_33_ + 204), (this._storeInt((_33_ + 236), 0)));
        this._storeInt((_33_ + 200), (this._loadInt((this._loadInt((_33_ + 248))))));
        this._storeInt((_33_ + 232), (this._loadInt(((this._loadInt((_33_ + 244))) + 28))));
        this._storeLong(((_33_ + 208) + 8), (this._loadLong(((_32_ = this._loadInt((_33_ + 240))) + 8))));
        this._storeLong((_33_ + 208), (this._loadLong(_32_)));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt(((this._loadInt((_33_ + 232))) + 24))) == 0) {
                        break label$2;
                    }
                    _32_ = this._loadInt((_33_ + 248));
                    this._storeInt(_33_, (selectOpName((this._loadInt8u(((this._loadInt((_33_ + 244))) + 4))))));
                    sqlite3ErrorMsg(_32_, 47552, _33_);
                    this._storeInt((_33_ + 236), 1);
                    break label$1;
                }
                while (false);
                label$3:
                do {
                    if ((this._loadInt(((this._loadInt((_33_ + 232))) + 40))) == 0) {
                        break label$3;
                    }
                    _32_ = this._loadInt((_33_ + 248));
                    this._storeInt((_33_ + 16), (selectOpName((this._loadInt8u(((this._loadInt((_33_ + 244))) + 4))))));
                    sqlite3ErrorMsg(_32_, 47600, (_33_ + 16));
                    this._storeInt((_33_ + 236), 1);
                    break label$1;
                }
                while (false);
                this._storeInt((_33_ + 228), (sqlite3GetVdbe((this._loadInt((_33_ + 248))))));
                label$4:
                do {
                    if ((this._loadInt8u((_33_ + 208))) != 9) {
                        break label$4;
                    }
                    sqlite3VdbeAddOp2((this._loadInt((_33_ + 228))), 41, (this._loadInt((_33_ + 212))), (this._loadInt((this._loadInt((this._loadInt((_33_ + 244))))))));
                    sqlite3VdbeChangeP5((this._loadInt((_33_ + 228))), 16);
                    this._storeInt8((_33_ + 208), 8);
                }
                while (false);
                label$5:
                do {
                    if ((this._loadInt((this._loadInt((this._loadInt((_33_ + 244))))))) == (this._loadInt((this._loadInt((this._loadInt((_33_ + 232)))))))) {
                        break label$5;
                    }
                    _32_ = this._loadInt((_33_ + 248));
                    this._storeInt((_33_ + 32), (selectOpName((this._loadInt8u(((this._loadInt((_33_ + 244))) + 4))))));
                    sqlite3ErrorMsg(_32_, 47648, (_33_ + 32));
                    this._storeInt((_33_ + 236), 1);
                    break label$1;
                }
                while (false);
                label$6:
                do {
                    if ((this._loadInt(((this._loadInt((_33_ + 244))) + 24))) == 0) {
                        break label$6;
                    }
                    this._storeInt((_33_ + 252), (multiSelectOrderBy((this._loadInt((_33_ + 248))), (this._loadInt((_33_ + 244))), (this._loadInt((_33_ + 240))))));
                    break label$0;
                }
                while (false);
                label$7:
                do {
                    label$8:
                    do {
                        label$9:
                        do {
                            label$10:
                            do {
                                label$11:
                                do {
                                    if ((_32_ = this._loadInt8u(((this._loadInt((_33_ + 244))) + 4))) == 112) {
                                        break label$11;
                                    }
                                    if (_32_ == 114) {
                                        break label$11;
                                    }
                                    if (_32_ != 113) {
                                        break label$10;
                                    }
                                    _32_ = this._storeInt((_33_ + 188), 0);
                                    this._storeInt(((_31_ = this._loadInt((_33_ + 232))) + 40), (this._loadInt(((_30_ = this._loadInt((_33_ + 244))) + 40))));
                                    this._storeInt((_31_ + 44), (this._loadInt((_30_ + 44))));
                                    this._storeInt((_33_ + 196), (this._loadInt(((this._loadInt((_33_ + 248))) + 556))));
                                    _31_ = this._storeInt((_33_ + 236), (sqlite3Select((this._loadInt((_33_ + 248))), (this._loadInt((_33_ + 232))), (_33_ + 208))));
                                    _32_ = this._storeInt(((_30_ = this._loadInt((_33_ + 244))) + 40), (this._storeInt((_30_ + 44), _32_)));
                                    if (_31_ != 0) {
                                        break label$1;
                                    }
                                    this._storeInt(((_31_ = this._loadInt((_33_ + 244))) + 28), _32_);
                                    this._storeInt((_31_ + 48), (this._loadInt(((this._loadInt((_33_ + 232))) + 48))));
                                    this._storeInt(((this._loadInt((_33_ + 244))) + 52), (this._loadInt(((this._loadInt((_33_ + 232))) + 52))));
                                    label$12:
                                    do {
                                        if ((this._loadInt(((this._loadInt((_33_ + 244))) + 48))) == 0) {
                                            break label$12;
                                        }
                                        this._storeInt((_33_ + 188), (sqlite3VdbeAddOp1((this._loadInt((_33_ + 228))), 115, (this._loadInt(((this._loadInt((_33_ + 244))) + 48))))));
                                    }
                                    while (false);
                                    this._storeInt((_33_ + 192), (this._loadInt(((this._loadInt((_33_ + 248))) + 556))));
                                    this._storeInt((_33_ + 236), (sqlite3Select((this._loadInt((_33_ + 248))), (this._loadInt((_33_ + 244))), (_33_ + 208))));
                                    this._storeInt((_33_ + 204), (this._loadInt(((this._loadInt((_33_ + 244))) + 28))));
                                    _31_ = this._storeInt(((_32_ = this._loadInt((_33_ + 244))) + 28), (this._loadInt((_33_ + 232))));
                                    this._storeDouble((_32_ + 72), ((this._loadDouble((_32_ + 72))) + (this._loadDouble((_31_ + 72)))));
                                    label$13:
                                    do {
                                        if ((this._loadInt(((this._loadInt((_33_ + 232))) + 40))) == 0) {
                                            break label$13;
                                        }
                                        if ((sqlite3ExprIsInteger((this._loadInt(((this._loadInt((_33_ + 232))) + 40))), (_33_ + 184))) == 0) {
                                            break label$13;
                                        }
                                        if (((((_35_ = this._loadDouble(((this._loadInt((_33_ + 244))) + 72))) <= (_34_ = (double) (this._loadInt((_33_ + 184))))) ? 1 : 0) | (((_35_ != _35_) ? 1 : 0) | ((_34_ != _34_) ? 1 : 0))) != 0) {
                                            break label$13;
                                        }
                                        this._storeDouble(((this._loadInt((_33_ + 244))) + 72), ((double) (this._loadInt((_33_ + 184)))));
                                    }
                                    while (false);
                                    if ((this._loadInt((_33_ + 188))) == 0) {
                                        break label$7;
                                    }
                                    sqlite3VdbeJumpHere((this._loadInt((_33_ + 228))), (this._loadInt((_33_ + 188))));
                                    break label$7;
                                }
                                while (false);
                                _32_ = this._storeInt8((_33_ + 179), 0);
                                label$14:
                                do {
                                    if ((_31_ = this._storeInt((_33_ + 172), 1)) != (this._loadInt8u((_33_ + 208)))) {
                                        break label$14;
                                    }
                                    if ((this._loadInt(((this._loadInt((_33_ + 244))) + 40))) != 0) {
                                        break label$14;
                                    }
                                    if ((this._loadInt(((this._loadInt((_33_ + 244))) + 44))) == 0) {
                                        break label$9;
                                    }
                                }
                                while (false);
                                this._storeInt(((_30_ = this._loadInt((_33_ + 248))) + 68), ((_30_ = this._loadInt((_30_ + 68))) + _31_));
                                _31_ = this._storeInt((_33_ + 180), _30_);
                                _32_ = this._storeInt((_33_ + 160), (sqlite3VdbeAddOp2((this._loadInt((_33_ + 228))), 41, _31_, _32_)));
                                this._storeInt(((_31_ = this._loadInt((_33_ + 244))) + 56), _32_);
                                this._storeInt16(((_32_ = this._loadInt((_31_ + 36))) + 6), ((this._loadInt16u((_32_ + 6))) | 8));
                                break label$8;
                            }
                            while (false);
                            this._storeInt(((_32_ = this._loadInt((_33_ + 248))) + 68), ((_32_ = this._loadInt((_32_ + 68))) + 1));
                            this._storeInt((_33_ + 124), _32_);
                            this._storeInt(((_32_ = this._loadInt((_33_ + 248))) + 68), ((_32_ = this._loadInt((_32_ + 68))) + 1));
                            this._storeInt((_33_ + 120), _32_);
                            _32_ = this._storeInt((_33_ + 96), (sqlite3VdbeAddOp2((this._loadInt((_33_ + 228))), 41, (this._loadInt((_33_ + 124))), 0)));
                            this._storeInt(((_31_ = this._loadInt((_33_ + 244))) + 56), _32_);
                            this._storeInt16(((_32_ = this._loadInt((_31_ + 36))) + 6), ((this._loadInt16u((_32_ + 6))) | 8));
                            sqlite3SelectDestInit((_33_ + 80), 1, (this._loadInt((_33_ + 124))));
                            this._storeInt((_33_ + 196), (this._loadInt(((this._loadInt((_33_ + 248))) + 556))));
                            if ((this._storeInt((_33_ + 236), (sqlite3Select((this._loadInt((_33_ + 248))), (this._loadInt((_33_ + 232))), (_33_ + 80))))) != 0) {
                                break label$1;
                            }
                            _31_ = this._storeInt((_33_ + 96), (sqlite3VdbeAddOp2((this._loadInt((_33_ + 228))), 41, (this._loadInt((_33_ + 120))), 0)));
                            _30_ = this._storeInt(((_32_ = this._loadInt((_33_ + 244))) + 28), 0);
                            this._storeInt((_32_ + 60), _31_);
                            this._storeInt((_33_ + 104), (this._loadInt((_32_ + 40))));
                            _32_ = this._storeInt(((this._loadInt((_33_ + 244))) + 40), _30_);
                            this._storeInt((_33_ + 100), (this._loadInt(((this._loadInt((_33_ + 244))) + 44))));
                            this._storeInt(((this._loadInt((_33_ + 244))) + 44), _32_);
                            _32_ = this._loadInt((_33_ + 120));
                            this._storeInt((_33_ + 192), (this._loadInt(((this._loadInt((_33_ + 248))) + 556))));
                            this._storeInt((_33_ + 84), _32_);
                            this._storeInt((_33_ + 236), (sqlite3Select((this._loadInt((_33_ + 248))), (this._loadInt((_33_ + 244))), (_33_ + 80))));
                            this._storeInt((_33_ + 204), (this._loadInt(((this._loadInt((_33_ + 244))) + 28))));
                            _31_ = this._storeInt(((_32_ = this._loadInt((_33_ + 244))) + 28), (this._loadInt((_33_ + 232))));
                            label$15:
                            do {
                                if (((((_35_ = this._loadDouble((_32_ + 72))) <= (_34_ = this._loadDouble((_31_ + 72)))) ? 1 : 0) | (((_35_ != _35_) ? 1 : 0) | ((_34_ != _34_) ? 1 : 0))) != 0) {
                                    break label$15;
                                }
                                this._storeDouble(((this._loadInt((_33_ + 244))) + 72), (this._loadDouble(((this._loadInt((_33_ + 232))) + 72))));
                            }
                            while (false);
                            sqlite3ExprDelete((this._loadInt((_33_ + 200))), (this._loadInt(((this._loadInt((_33_ + 244))) + 40))));
                            this._storeInt(((_32_ = this._loadInt((_33_ + 244))) + 44), (this._loadInt((_33_ + 100))));
                            this._storeInt((_32_ + 40), (this._loadInt((_33_ + 104))));
                            label$16:
                            do {
                                if ((this._loadInt8u((_33_ + 208))) != 5) {
                                    break label$16;
                                }
                                this._storeInt((_33_ + 72), (this._loadInt((_33_ + 244))));
                                label$18:
                                do {
                                    label$17:
                                    while (true) {
                                        if ((this._loadInt(((this._loadInt((_33_ + 72))) + 28))) == 0) {
                                            break label$18;
                                        }
                                        this._storeInt((_33_ + 72), (this._loadInt(((this._loadInt((_33_ + 72))) + 28))));
                                        continue label$17;
                                    }
                                }
                                while (false);
                                generateColumnNames((this._loadInt((_33_ + 248))), 0, (this._loadInt((this._loadInt((_33_ + 72))))));
                            }
                            while (false);
                            this._storeInt((_33_ + 112), (sqlite3VdbeMakeLabel((this._loadInt((_33_ + 228))))));
                            this._storeInt((_33_ + 116), (sqlite3VdbeMakeLabel((this._loadInt((_33_ + 228))))));
                            computeLimitRegisters((this._loadInt((_33_ + 248))), (this._loadInt((_33_ + 244))), (this._loadInt((_33_ + 112))));
                            sqlite3VdbeAddOp2((this._loadInt((_33_ + 228))), 65, (this._loadInt((_33_ + 124))), (this._loadInt((_33_ + 112))));
                            _32_ = this._storeInt((_33_ + 76), (sqlite3GetTempReg((this._loadInt((_33_ + 248))))));
                            this._storeInt((_33_ + 108), (sqlite3VdbeAddOp2((this._loadInt((_33_ + 228))), 59, (this._loadInt((_33_ + 124))), _32_)));
                            sqlite3VdbeAddOp4Int((this._loadInt((_33_ + 228))), 49, (this._loadInt((_33_ + 120))), (this._loadInt((_33_ + 116))), (this._loadInt((_33_ + 76))), 0);
                            sqlite3ReleaseTempReg((this._loadInt((_33_ + 248))), (this._loadInt((_33_ + 76))));
                            selectInnerLoop((this._loadInt((_33_ + 248))), (_32_ = this._loadInt((_33_ + 244))), (_32_ = this._loadInt(_32_)), (this._loadInt((_33_ + 124))), (this._loadInt(_32_)), 0, -1, (_33_ + 208), (this._loadInt((_33_ + 116))), (this._loadInt((_33_ + 112))));
                            sqlite3VdbeResolveLabel((this._loadInt((_33_ + 228))), (this._loadInt((_33_ + 116))));
                            sqlite3VdbeAddOp2((this._loadInt((_33_ + 228))), 67, (this._loadInt((_33_ + 124))), (this._loadInt((_33_ + 108))));
                            sqlite3VdbeResolveLabel((this._loadInt((_33_ + 228))), (this._loadInt((_33_ + 112))));
                            sqlite3VdbeAddOp2((this._loadInt((_33_ + 228))), 43, (this._loadInt((_33_ + 120))), 0);
                            sqlite3VdbeAddOp2((this._loadInt((_33_ + 228))), 43, (this._loadInt((_33_ + 124))), 0);
                            break label$7;
                        }
                        while (false);
                        this._storeInt((_33_ + 180), (this._loadInt((_33_ + 212))));
                    }
                    while (false);
                    sqlite3SelectDestInit((_33_ + 144), (this._loadInt((_33_ + 172))), (this._loadInt((_33_ + 180))));
                    this._storeInt((_33_ + 196), (this._loadInt(((this._loadInt((_33_ + 248))) + 556))));
                    if ((this._storeInt((_33_ + 236), (sqlite3Select((this._loadInt((_33_ + 248))), (this._loadInt((_33_ + 232))), (_33_ + 144))))) != 0) {
                        break label$1;
                    }
                    label$19:
                    do {
                        label$20:
                        do {
                            if ((this._loadInt8u(((this._loadInt((_33_ + 244))) + 4))) != 114) {
                                break label$20;
                            }
                            this._storeInt8((_33_ + 179), 2);
                            break label$19;
                        }
                        while (false);
                        this._storeInt8((_33_ + 179), 1);
                    }
                    while (false);
                    _31_ = this._storeInt(((_32_ = this._loadInt((_33_ + 244))) + 28), 0);
                    this._storeInt((_33_ + 168), (this._loadInt((_32_ + 40))));
                    _32_ = this._storeInt(((this._loadInt((_33_ + 244))) + 40), _31_);
                    this._storeInt((_33_ + 164), (this._loadInt(((this._loadInt((_33_ + 244))) + 44))));
                    this._storeInt(((this._loadInt((_33_ + 244))) + 44), _32_);
                    this._storeInt8((_33_ + 144), (this._loadInt8u((_33_ + 179))));
                    this._storeInt((_33_ + 192), (this._loadInt(((this._loadInt((_33_ + 248))) + 556))));
                    this._storeInt((_33_ + 236), (sqlite3Select((this._loadInt((_33_ + 248))), (this._loadInt((_33_ + 244))), (_33_ + 144))));
                    sqlite3ExprListDelete((this._loadInt((_33_ + 200))), (this._loadInt(((this._loadInt((_33_ + 244))) + 24))));
                    this._storeInt((_33_ + 204), (this._loadInt(((this._loadInt((_33_ + 244))) + 28))));
                    this._storeInt(((_31_ = this._loadInt((_33_ + 244))) + 28), (this._loadInt((_33_ + 232))));
                    this._storeInt(((this._loadInt((_33_ + 244))) + 24), _32_);
                    label$21:
                    do {
                        if ((this._loadInt8u((_31_ + 4))) != 112) {
                            break label$21;
                        }
                        this._storeDouble(((_31_ = this._loadInt((_33_ + 244))) + 72), ((this._loadDouble((_31_ + 72))) + (this._loadDouble(((this._loadInt((_33_ + 232))) + 72)))));
                    }
                    while (false);
                    sqlite3ExprDelete((this._loadInt((_33_ + 200))), (this._loadInt(((this._loadInt((_33_ + 244))) + 40))));
                    this._storeInt(((_31_ = this._loadInt((_33_ + 244))) + 40), (this._loadInt((_33_ + 168))));
                    this._storeInt((_31_ + 44), (this._loadInt((_33_ + 164))));
                    this._storeInt(((this._loadInt((_33_ + 244))) + 48), _32_);
                    this._storeInt(((this._loadInt((_33_ + 244))) + 52), _32_);
                    if ((this._loadInt8u((_33_ + 208))) == (this._loadInt((_33_ + 172)))) {
                        break label$7;
                    }
                    label$22:
                    do {
                        if ((this._loadInt8u((_33_ + 208))) != 5) {
                            break label$22;
                        }
                        this._storeInt((_33_ + 128), (this._loadInt((_33_ + 244))));
                        label$24:
                        do {
                            label$23:
                            while (true) {
                                if ((this._loadInt(((this._loadInt((_33_ + 128))) + 28))) == 0) {
                                    break label$24;
                                }
                                this._storeInt((_33_ + 128), (this._loadInt(((this._loadInt((_33_ + 128))) + 28))));
                                continue label$23;
                            }
                        }
                        while (false);
                        generateColumnNames((this._loadInt((_33_ + 248))), 0, (this._loadInt((this._loadInt((_33_ + 128))))));
                    }
                    while (false);
                    this._storeInt((_33_ + 136), (sqlite3VdbeMakeLabel((this._loadInt((_33_ + 228))))));
                    this._storeInt((_33_ + 140), (sqlite3VdbeMakeLabel((this._loadInt((_33_ + 228))))));
                    computeLimitRegisters((this._loadInt((_33_ + 248))), (this._loadInt((_33_ + 244))), (this._loadInt((_33_ + 136))));
                    sqlite3VdbeAddOp2((this._loadInt((_33_ + 228))), 65, (this._loadInt((_33_ + 180))), (this._loadInt((_33_ + 136))));
                    this._storeInt((_33_ + 132), (sqlite3VdbeCurrentAddr((this._loadInt((_33_ + 228))))));
                    selectInnerLoop((this._loadInt((_33_ + 248))), (_32_ = this._loadInt((_33_ + 244))), (_32_ = this._loadInt(_32_)), (this._loadInt((_33_ + 180))), (this._loadInt(_32_)), 0, -1, (_33_ + 208), (this._loadInt((_33_ + 140))), (this._loadInt((_33_ + 136))));
                    sqlite3VdbeResolveLabel((this._loadInt((_33_ + 228))), (this._loadInt((_33_ + 140))));
                    sqlite3VdbeAddOp2((this._loadInt((_33_ + 228))), 67, (this._loadInt((_33_ + 180))), (this._loadInt((_33_ + 132))));
                    sqlite3VdbeResolveLabel((this._loadInt((_33_ + 228))), (this._loadInt((_33_ + 136))));
                    sqlite3VdbeAddOp2((this._loadInt((_33_ + 228))), 43, (this._loadInt((_33_ + 180))), 0);
                }
                while (false);
                explainComposite((this._loadInt((_33_ + 248))), (_32_ = this._loadInt8u(((this._loadInt((_33_ + 244))) + 4))), (this._loadInt((_33_ + 196))), (this._loadInt((_33_ + 192))), ((_32_ != 113) ? 1 : 0));
                if (((this._loadInt16u(((this._loadInt((_33_ + 244))) + 6))) & 8) == 0) {
                    break label$1;
                }
                _32_ = this._storeInt((_33_ + 52), (this._loadInt((this._loadInt((this._loadInt((_33_ + 244))))))));
                label$25:
                do {
                    if ((this._storeInt((_33_ + 64), (sqlite3DbMallocZero((this._loadInt((_33_ + 200))), ((_32_ * 5) + 16))))) == 0) {
                        break label$25;
                    }
                    this._storeInt8(((this._loadInt((_33_ + 64))) + 4), (this._loadInt8u(((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 200))) + 8))) + 12))) + 77))));
                    this._storeInt16(((this._loadInt((_33_ + 64))) + 6), (this._loadInt((_33_ + 52))));
                    this._storeInt((_33_ + 68), 0);
                    this._storeInt((_33_ + 56), ((this._loadInt((_33_ + 64))) + 12));
                    label$27:
                    do {
                        label$26:
                        while (true) {
                            if ((this._loadInt((_33_ + 68))) >= (this._loadInt((_33_ + 52)))) {
                                break label$27;
                            }
                            _32_ = multiSelectCollSeq((this._loadInt((_33_ + 248))), (this._loadInt((_33_ + 244))), (this._loadInt((_33_ + 68))));
                            label$28:
                            do {
                                if ((this._storeInt((this._loadInt((_33_ + 56))), _32_)) != 0) {
                                    break label$28;
                                }
                                this._storeInt((this._loadInt((_33_ + 56))), (this._loadInt(((this._loadInt((_33_ + 200))) + 44))));
                            }
                            while (false);
                            this._storeInt((_33_ + 68), ((this._loadInt((_33_ + 68))) + 1));
                            this._storeInt((_33_ + 56), ((this._loadInt((_33_ + 56))) + 4));
                            continue label$26;
                        }
                    }
                    while (false);
                    this._storeInt((_33_ + 60), (this._loadInt((_33_ + 244))));
                    label$29:
                    while (true) {
                        label$31:
                        do {
                            label$32:
                            do {
                                if ((this._loadInt((_33_ + 60))) == 0) {
                                    break label$32;
                                }
                                _31_ = this._storeInt((_33_ + 68), 0);
                                label$33:
                                while (true) {
                                    if ((this._loadInt((_33_ + 68))) > 1) {
                                        break label$31;
                                    }
                                    if ((this._storeInt((_33_ + 48), (this._loadInt((((this._loadInt((_33_ + 60))) + ((this._loadInt((_33_ + 68))) << 2)) + 56))))) < _31_) {
                                        break label$31;
                                    }
                                    sqlite3VdbeChangeP2((this._loadInt((_33_ + 228))), (this._loadInt((_33_ + 48))), (this._loadInt((_33_ + 52))));
                                    sqlite3VdbeChangeP4((this._loadInt((_33_ + 228))), (this._loadInt((_33_ + 48))), (this._loadInt((_33_ + 64))), -6);
                                    this._storeInt((((this._loadInt((_33_ + 60))) + ((_32_ = this._loadInt((_33_ + 68))) << 2)) + 56), -1);
                                    this._storeInt((_33_ + 68), (_32_ + 1));
                                    continue label$33;
                                }
                            }
                            while (false);
                            sqlite3DbFree((this._loadInt((_33_ + 200))), (this._loadInt((_33_ + 64))));
                            break label$1;
                        }
                        while (false);
                        this._storeInt((_33_ + 60), (this._loadInt(((this._loadInt((_33_ + 60))) + 28))));
                        continue label$29;
                    }
                }
                while (false);
                this._storeInt((_33_ + 236), 7);
            }
            while (false);
            this._storeInt(((_32_ = this._loadInt((_33_ + 240))) + 8), (this._loadInt((_33_ + 216))));
            this._storeInt((_32_ + 12), (this._loadInt((_33_ + 220))));
            sqlite3SelectDelete((this._loadInt((_33_ + 200))), (this._loadInt((_33_ + 204))));
            this._storeInt((_33_ + 252), (this._loadInt((_33_ + 236))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 252));
        this._storeInt((0 + 4), (_33_ + 256));
        return _32_;
    }

    @Override()
    public final int keyInfoFromExprList(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 20), (this._loadInt((this._loadInt((_32_ + 28))))));
        _31_ = this._storeInt((_32_ + 16), (this._loadInt((this._loadInt((_32_ + 24))))));
        label$0:
        do {
            if ((this._storeInt((_32_ + 12), (sqlite3DbMallocZero((this._loadInt((_32_ + 20))), ((_31_ * 5) + 16))))) == 0) {
                break label$0;
            }
            this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 8), ((_31_ + ((this._storeInt16((_31_ + 6), (this._loadInt((_32_ + 16))))) << 2)) + 12));
            this._storeInt8(((this._loadInt((_32_ + 12))) + 4), (this._loadInt8u(((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 20))) + 8))) + 12))) + 77))));
            this._storeInt((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 20))));
            this._storeInt((_32_ + 4), 0);
            this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((_32_ + 24))) + 12))));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 4))) >= (this._loadInt((_32_ + 16)))) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._storeInt(_32_, (sqlite3ExprCollSeq((this._loadInt((_32_ + 28))), (this._loadInt((this._loadInt((_32_ + 8))))))))) != 0) {
                            break label$3;
                        }
                        this._storeInt(_32_, (this._loadInt(((this._loadInt((_32_ + 20))) + 44))));
                    }
                    while (false);
                    this._storeInt((((_31_ = this._loadInt((_32_ + 12))) + ((_30_ = this._loadInt((_32_ + 4))) << 2)) + 12), (this._loadInt(_32_)));
                    this._storeInt8((_30_ + (this._loadInt((_31_ + 8)))), (this._loadInt8u(((this._loadInt((_32_ + 8))) + 12))));
                    this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                    this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) + 20));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final void computeLimitRegisters(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        double _34_ = 0.0;
        double _35_ = 0.0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 12), (this._storeInt((_33_ + 16), 0)));
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_33_ + 24))) + 48))) != 0) {
                break label$0;
            }
            sqlite3ExprCacheClear((this._loadInt((_33_ + 28))));
            if ((this._loadInt(((this._loadInt((_33_ + 24))) + 40))) == 0) {
                break label$0;
            }
            _32_ = this._storeInt((_33_ + 12), (this._storeInt(((_32_ = this._loadInt((_33_ + 28))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
            this._storeInt(((this._loadInt((_33_ + 24))) + 48), _32_);
            if ((this._storeInt((_33_ + 16), (sqlite3GetVdbe((this._loadInt((_33_ + 28))))))) == 0) {
                break label$0;
            }
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((sqlite3ExprIsInteger((this._loadInt(((this._loadInt((_33_ + 24))) + 40))), _33_)) == 0) {
                            break label$3;
                        }
                        sqlite3VdbeAddOp2((this._loadInt((_33_ + 16))), 7, (this._loadInt(_33_)), (this._loadInt((_33_ + 12))));
                        if ((this._loadInt(_33_)) == 0) {
                            break label$2;
                        }
                        if (((((_35_ = this._loadDouble(((this._loadInt((_33_ + 24))) + 72))) <= (_34_ = (double) (this._loadInt(_33_)))) ? 1 : 0) | (((_35_ != _35_) ? 1 : 0) | ((_34_ != _34_) ? 1 : 0))) != 0) {
                            break label$1;
                        }
                        this._storeDouble(((this._loadInt((_33_ + 24))) + 72), ((double) (this._loadInt(_33_))));
                        break label$1;
                    }
                    while (false);
                    sqlite3ExprCode((this._loadInt((_33_ + 28))), (this._loadInt(((this._loadInt((_33_ + 24))) + 40))), (this._loadInt((_33_ + 12))));
                    sqlite3VdbeAddOp1((this._loadInt((_33_ + 16))), 21, (this._loadInt((_33_ + 12))));
                    sqlite3VdbeAddOp2((this._loadInt((_33_ + 16))), 115, (this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 20))));
                    break label$1;
                }
                while (false);
                sqlite3VdbeAddOp2((this._loadInt((_33_ + 16))), 1, 0, (this._loadInt((_33_ + 20))));
            }
            while (false);
            if ((this._loadInt(((this._loadInt((_33_ + 24))) + 44))) == 0) {
                break label$0;
            }
            _32_ = this._storeInt((_33_ + 8), (this._storeInt(((_32_ = this._loadInt((_33_ + 28))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
            this._storeInt(((_31_ = this._loadInt((_33_ + 24))) + 52), _32_);
            this._storeInt(((_30_ = this._loadInt((_33_ + 28))) + 72), ((this._loadInt((_30_ + 72))) + 1));
            sqlite3ExprCode((this._loadInt((_33_ + 28))), (this._loadInt((_31_ + 44))), _32_);
            sqlite3VdbeAddOp1((this._loadInt((_33_ + 16))), 21, (this._loadInt((_33_ + 8))));
            this._storeInt((_33_ + 4), (sqlite3VdbeAddOp1((this._loadInt((_33_ + 16))), 113, (this._loadInt((_33_ + 8))))));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 16))), 7, 0, (this._loadInt((_33_ + 8))));
            sqlite3VdbeJumpHere((this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 4))));
            sqlite3VdbeAddOp3((this._loadInt((_33_ + 16))), 86, (this._loadInt((_33_ + 12))), (_32_ = this._loadInt((_33_ + 8))), (_32_ + 1));
            this._storeInt((_33_ + 4), (sqlite3VdbeAddOp1((this._loadInt((_33_ + 16))), 113, (this._loadInt((_33_ + 12))))));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 16))), 7, -1, ((this._loadInt((_33_ + 8))) + 1));
            sqlite3VdbeJumpHere((this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 4))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void selectInnerLoop(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_,
            int _36_,
            int _37_,
            int _38_,
            int _39_)
    {
        int _31_0 = 0;
        this._storeInt(((_31_0 = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 92), _30_);
        this._storeInt((_31_0 + 88), _31_);
        this._storeInt((_31_0 + 84), _32_);
        this._storeInt((_31_0 + 80), _33_);
        this._storeInt((_31_0 + 76), _34_);
        this._storeInt((_31_0 + 72), _35_);
        this._storeInt((_31_0 + 68), _36_);
        this._storeInt((_31_0 + 64), _37_);
        this._storeInt((_31_0 + 60), _38_);
        this._storeInt((_31_0 + 56), _39_);
        this._storeInt((_31_0 + 52), (this._loadInt(((this._loadInt((_31_0 + 92))) + 12))));
        this._storeInt((_31_0 + 36), (this._loadInt8u((this._loadInt((_31_0 + 64))))));
        this._storeInt((_31_0 + 32), (this._loadInt(((this._loadInt((_31_0 + 64))) + 4))));
        label$0:
        do {
            if ((this._loadInt((_31_0 + 52))) == 0) {
                break label$0;
            }
            this._storeInt((_31_0 + 44), (((this._loadInt((_31_0 + 68))) > -1) ? 1 : 0));
            label$1:
            do {
                if ((this._loadInt((_31_0 + 72))) != 0) {
                    break label$1;
                }
                if ((this._loadInt((_31_0 + 44))) != 0) {
                    break label$1;
                }
                codeOffset((this._loadInt((_31_0 + 52))), (this._loadInt((_31_0 + 88))), (this._loadInt((_31_0 + 60))));
            }
            while (false);
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt((_31_0 + 76))) < 1) {
                        break label$3;
                    }
                    this._storeInt((_31_0 + 28), (this._loadInt((_31_0 + 76))));
                    break label$2;
                }
                while (false);
                this._storeInt((_31_0 + 28), (this._loadInt((this._loadInt((_31_0 + 84))))));
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt(((this._loadInt((_31_0 + 64))) + 8))) != 0) {
                    break label$4;
                }
                _39_ = this._loadInt(((this._loadInt((_31_0 + 92))) + 72));
                this._storeInt(((_38_ = this._loadInt((_31_0 + 64))) + 12), (this._loadInt((_31_0 + 28))));
                this._storeInt((_38_ + 8), (_39_ + 1));
                this._storeInt(((_39_ = this._loadInt((_31_0 + 92))) + 72), ((this._loadInt((_39_ + 72))) + (this._loadInt((_31_0 + 28)))));
            }
            while (false);
            this._storeInt((_31_0 + 40), (this._loadInt(((this._loadInt((_31_0 + 64))) + 8))));
            label$5:
            do {
                label$6:
                do {
                    if ((this._loadInt((_31_0 + 76))) < 1) {
                        break label$6;
                    }
                    this._storeInt((_31_0 + 48), 0);
                    label$7:
                    while (true) {
                        if ((this._loadInt((_31_0 + 48))) >= (this._loadInt((_31_0 + 76)))) {
                            break label$5;
                        }
                        sqlite3VdbeAddOp3((this._loadInt((_31_0 + 52))), 28, (this._loadInt((_31_0 + 80))), (_39_ = this._loadInt((_31_0 + 48))), (_39_ + (this._loadInt((_31_0 + 40)))));
                        this._storeInt((_31_0 + 48), ((this._loadInt((_31_0 + 48))) + 1));
                        continue label$7;
                    }
                }
                while (false);
                if ((this._loadInt((_31_0 + 36))) == 3) {
                    break label$5;
                }
                sqlite3ExprCacheClear((this._loadInt((_31_0 + 92))));
                sqlite3ExprCodeExprList((this._loadInt((_31_0 + 92))), (this._loadInt((_31_0 + 84))), (this._loadInt((_31_0 + 40))), (((this._loadInt((_31_0 + 36))) == 5) ? 1 : 0));
            }
            while (false);
            this._storeInt((_31_0 + 76), (this._loadInt((_31_0 + 28))));
            label$9:
            do {
                if ((this._loadInt((_31_0 + 44))) == 0) {
                    break label$9;
                }
                codeDistinct((this._loadInt((_31_0 + 92))), (this._loadInt((_31_0 + 68))), (this._loadInt((_31_0 + 60))), (this._loadInt((_31_0 + 76))), (this._loadInt((_31_0 + 40))));
                if ((this._loadInt((_31_0 + 72))) != 0) {
                    break label$9;
                }
                codeOffset((this._loadInt((_31_0 + 52))), (this._loadInt((_31_0 + 88))), (this._loadInt((_31_0 + 60))));
            }
            while (false);
            label$10:
            do {
                if (((_39_ = (this._loadInt((_31_0 + 36))) + -1) & 4294967295L) > (9 & 4294967295L)) {
                    break label$10;
                }
                label$11:
                do {
                    label$12:
                    do {
                        label$13:
                        do {
                            label$14:
                            do {
                                label$15:
                                do {
                                    label$16:
                                    do {
                                        label$17:
                                        do {
                                            label$18:
                                            do {
                                                label$19:
                                                do {
                                                    label$20:
                                                    do {
                                                        label$21:
                                                        do {
                                                            label$22:
                                                            do {
                                                                label$23:
                                                                do {
                                                                    switch (_39_) {
                                                                        case 0: {
                                                                            break label$21;
                                                                        }
                                                                        case 1: {
                                                                            break label$20;
                                                                        }
                                                                        case 2: {
                                                                            break label$19;
                                                                        }
                                                                        case 3: {
                                                                            break label$10;
                                                                        }
                                                                        case 4:
                                                                        case 9: {
                                                                            break label$23;
                                                                        }
                                                                        case 5: {
                                                                            break label$18;
                                                                        }
                                                                        case 6: {
                                                                            break label$17;
                                                                        }
                                                                        case 7:
                                                                        case 8: {
                                                                            break label$22;
                                                                        }
                                                                        default: {
                                                                            break label$21;
                                                                        }
                                                                    }
                                                                }
                                                                while (false);
                                                                if ((this._loadInt((_31_0 + 72))) == 0) {
                                                                    break label$16;
                                                                }
                                                                _39_ = this._storeInt((_31_0 + 8), (sqlite3GetTempReg((this._loadInt((_31_0 + 92))))));
                                                                sqlite3VdbeAddOp3((this._loadInt((_31_0 + 52))), 30, (this._loadInt((_31_0 + 40))), (this._loadInt((_31_0 + 76))), _39_);
                                                                pushOntoSorter((this._loadInt((_31_0 + 92))), (this._loadInt((_31_0 + 72))), (this._loadInt((_31_0 + 88))), (this._loadInt((_31_0 + 8))));
                                                                sqlite3ReleaseTempReg((this._loadInt((_31_0 + 92))), (this._loadInt((_31_0 + 8))));
                                                                break label$10;
                                                            }
                                                            while (false);
                                                            _39_ = this._storeInt((_31_0 + 20), (sqlite3GetTempReg((this._loadInt((_31_0 + 92))))));
                                                            sqlite3VdbeAddOp3((this._loadInt((_31_0 + 52))), 30, (this._loadInt((_31_0 + 40))), (this._loadInt((_31_0 + 76))), _39_);
                                                            if ((this._loadInt((_31_0 + 72))) == 0) {
                                                                break label$15;
                                                            }
                                                            pushOntoSorter((this._loadInt((_31_0 + 92))), (this._loadInt((_31_0 + 72))), (this._loadInt((_31_0 + 88))), (this._loadInt((_31_0 + 20))));
                                                            break label$14;
                                                        }
                                                        while (false);
                                                        _39_ = this._storeInt((_31_0 + 24), (sqlite3GetTempReg((this._loadInt((_31_0 + 92))))));
                                                        sqlite3VdbeAddOp3((this._loadInt((_31_0 + 52))), 30, (this._loadInt((_31_0 + 40))), (this._loadInt((_31_0 + 76))), _39_);
                                                        sqlite3VdbeAddOp2((this._loadInt((_31_0 + 52))), 70, (this._loadInt((_31_0 + 32))), (this._loadInt((_31_0 + 24))));
                                                        sqlite3ReleaseTempReg((this._loadInt((_31_0 + 92))), (this._loadInt((_31_0 + 24))));
                                                        break label$10;
                                                    }
                                                    while (false);
                                                    sqlite3VdbeAddOp3((this._loadInt((_31_0 + 52))), 71, (this._loadInt((_31_0 + 32))), (this._loadInt((_31_0 + 40))), (this._loadInt((_31_0 + 76))));
                                                    break label$10;
                                                }
                                                while (false);
                                                sqlite3VdbeAddOp2((this._loadInt((_31_0 + 52))), 7, 1, (this._loadInt((_31_0 + 32))));
                                                break label$10;
                                            }
                                            while (false);
                                            if ((this._loadInt((_31_0 + 72))) == 0) {
                                                break label$13;
                                            }
                                            pushOntoSorter((this._loadInt((_31_0 + 92))), (this._loadInt((_31_0 + 72))), (this._loadInt((_31_0 + 88))), (this._loadInt((_31_0 + 40))));
                                            break label$10;
                                        }
                                        while (false);
                                        _39_ = sqlite3CompareAffinity((this._loadInt((this._loadInt(((this._loadInt((_31_0 + 84))) + 12))))), (this._loadInt8s(((this._loadInt((_31_0 + 64))) + 1))));
                                        this._storeInt8(((this._loadInt((_31_0 + 88))) + 5), _39_);
                                        if ((this._loadInt((_31_0 + 72))) == 0) {
                                            break label$12;
                                        }
                                        pushOntoSorter((this._loadInt((_31_0 + 92))), (this._loadInt((_31_0 + 72))), (this._loadInt((_31_0 + 88))), (this._loadInt((_31_0 + 40))));
                                        break label$10;
                                    }
                                    while (false);
                                    if ((this._loadInt((_31_0 + 36))) != 10) {
                                        break label$11;
                                    }
                                    sqlite3VdbeAddOp1((this._loadInt((_31_0 + 52))), 4, (this._loadInt(((this._loadInt((_31_0 + 64))) + 4))));
                                    break label$10;
                                }
                                while (false);
                                _39_ = this._storeInt((_31_0 + 16), (sqlite3GetTempReg((this._loadInt((_31_0 + 92))))));
                                sqlite3VdbeAddOp2((this._loadInt((_31_0 + 52))), 54, (this._loadInt((_31_0 + 32))), _39_);
                                sqlite3VdbeAddOp3((this._loadInt((_31_0 + 52))), 55, (this._loadInt((_31_0 + 32))), (this._loadInt((_31_0 + 20))), (this._loadInt((_31_0 + 16))));
                                sqlite3VdbeChangeP5((this._loadInt((_31_0 + 52))), 8);
                                sqlite3ReleaseTempReg((this._loadInt((_31_0 + 92))), (this._loadInt((_31_0 + 16))));
                            }
                            while (false);
                            sqlite3ReleaseTempReg((this._loadInt((_31_0 + 92))), (this._loadInt((_31_0 + 20))));
                            break label$10;
                        }
                        while (false);
                        sqlite3ExprCodeMove((this._loadInt((_31_0 + 92))), (this._loadInt((_31_0 + 40))), (this._loadInt((_31_0 + 32))), 1);
                        break label$10;
                    }
                    while (false);
                    _39_ = this._storeInt((_31_0 + 12), (sqlite3GetTempReg((this._loadInt((_31_0 + 92))))));
                    sqlite3VdbeAddOp4((this._loadInt((_31_0 + 52))), 30, (this._loadInt((_31_0 + 40))), 1, _39_, ((this._loadInt((_31_0 + 88))) + 5), 1);
                    sqlite3ExprCacheAffinityChange((this._loadInt((_31_0 + 92))), (this._loadInt((_31_0 + 40))), 1);
                    sqlite3VdbeAddOp2((this._loadInt((_31_0 + 52))), 70, (this._loadInt((_31_0 + 32))), (this._loadInt((_31_0 + 12))));
                    sqlite3ReleaseTempReg((this._loadInt((_31_0 + 92))), (this._loadInt((_31_0 + 12))));
                    break label$10;
                }
                while (false);
                sqlite3VdbeAddOp2((this._loadInt((_31_0 + 52))), 16, (this._loadInt((_31_0 + 40))), (this._loadInt((_31_0 + 76))));
                sqlite3ExprCacheAffinityChange((this._loadInt((_31_0 + 92))), (this._loadInt((_31_0 + 40))), (this._loadInt((_31_0 + 76))));
            }
            while (false);
            if ((this._loadInt((_31_0 + 72))) != 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_31_0 + 88))) + 48))) == 0) {
                break label$0;
            }
            sqlite3VdbeAddOp3((this._loadInt((_31_0 + 52))), 115, (this._loadInt(((this._loadInt((_31_0 + 88))) + 48))), (this._loadInt((_31_0 + 56))), -1);
        }
        while (false);
        this._storeInt((0 + 4), (_31_0 + 96));
        return;
    }

    @Override()
    public final void sqlite3ExprAnalyzeAggList(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 8))) + 12))));
            this._storeInt(_32_, 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt(_32_)) >= (this._loadInt((this._loadInt((_32_ + 8)))))) {
                        break label$2;
                    }
                    sqlite3ExprAnalyzeAggregates((this._loadInt((_32_ + 12))), (this._loadInt((this._loadInt((_32_ + 4))))));
                    this._storeInt(_32_, ((this._loadInt(_32_)) + 1));
                    this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 20));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3ExprAnalyzeAggregates(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 8), 44);
        this._storeInt((_32_ + 12), 45);
        this._storeInt((_32_ + 20), (this._loadInt((_32_ + 28))));
        sqlite3WalkExpr((_32_ + 8), (this._loadInt((_32_ + 24))));
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void explainTempTable(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_32_ + 28))) + 484))) != 2) {
                break label$0;
            }
            this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 28))) + 12))));
            _31_ = this._loadInt((this._loadInt((_32_ + 28))));
            this._storeInt(_32_, (this._loadInt((_32_ + 24))));
            _31_ = this._storeInt((_32_ + 16), (sqlite3MPrintf(_31_, 47520, _32_)));
            sqlite3VdbeAddOp4((this._loadInt((_32_ + 20))), 138, (this._loadInt(((this._loadInt((_32_ + 28))) + 552))), 0, 0, _31_, -1);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void sqlite3ExprCodeMove(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        label$0:
        do {
            if ((this._loadInt((_34_ + 24))) == (this._loadInt((_34_ + 20)))) {
                break label$0;
            }
            sqlite3VdbeAddOp3((this._loadInt(((this._loadInt((_34_ + 28))) + 12))), 13, (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 16))));
            this._storeInt((_34_ + 12), 0);
            this._storeInt((_34_ + 8), ((this._loadInt((_34_ + 28))) + 96));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_34_ + 12))) > 9) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._storeInt((_34_ + 4), (this._loadInt(((this._loadInt((_34_ + 8))) + 16))))) < (this._loadInt((_34_ + 24)))) {
                            break label$3;
                        }
                        if ((this._loadInt((_34_ + 4))) >= ((this._loadInt((_34_ + 24))) + (this._loadInt((_34_ + 16))))) {
                            break label$3;
                        }
                        this._storeInt(((_33_ = this._loadInt((_34_ + 8))) + 16), ((this._loadInt((_33_ + 16))) + ((this._loadInt((_34_ + 20))) - (this._loadInt((_34_ + 24))))));
                    }
                    while (false);
                    this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 12))) + 1));
                    this._storeInt((_34_ + 8), ((this._loadInt((_34_ + 8))) + 24));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final void updateAccumulator(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        int _34_ = 0;
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_35_ + 56), _31_);
        this._storeInt((_35_ + 52), (this._loadInt(((this._loadInt((_35_ + 60))) + 12))));
        _30_ = this._storeInt8((this._loadInt((_35_ + 56))), 1);
        sqlite3ExprCacheClear((this._loadInt((_35_ + 60))));
        _32_ = this._storeInt((_35_ + 48), 0);
        this._storeInt((_35_ + 44), (this._loadInt(((this._loadInt((_35_ + 56))) + 32))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_35_ + 48))) >= (this._loadInt(((this._loadInt((_35_ + 56))) + 36)))) {
                    break label$1;
                }
                _33_ = this._storeInt((_35_ + 32), _32_);
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeInt((_35_ + 24), (this._loadInt(((this._loadInt((this._loadInt((_35_ + 44))))) + 16))))) == 0) {
                            break label$3;
                        }
                        _31_ = this._storeInt((_35_ + 36), (this._loadInt((this._loadInt((_35_ + 24))))));
                        _31_ = this._storeInt((_35_ + 28), (sqlite3GetTempRange((this._loadInt((_35_ + 60))), _31_)));
                        sqlite3ExprCodeExprList((this._loadInt((_35_ + 60))), (this._loadInt((_35_ + 24))), _31_, _30_);
                        break label$2;
                    }
                    while (false);
                    this._storeInt((_35_ + 28), (this._storeInt((_35_ + 36), _33_)));
                }
                while (false);
                label$4:
                do {
                    if ((this._loadInt(((this._loadInt((_35_ + 44))) + 12))) < _33_) {
                        break label$4;
                    }
                    _31_ = this._storeInt((_35_ + 32), (sqlite3VdbeMakeLabel((this._loadInt((_35_ + 52))))));
                    codeDistinct((this._loadInt((_35_ + 60))), (this._loadInt(((this._loadInt((_35_ + 44))) + 12))), _31_, _30_, (this._loadInt((_35_ + 28))));
                }
                while (false);
                label$5:
                do {
                    if (((this._loadInt8u(((this._loadInt(((this._loadInt((_35_ + 44))) + 4))) + 3))) & 8) == 0) {
                        break label$5;
                    }
                    _34_ = this._storeInt((_35_ + 12), (this._storeInt((_35_ + 20), _33_)));
                    this._storeInt((_35_ + 16), (this._loadInt(((this._loadInt((_35_ + 24))) + 12))));
                    label$7:
                    do {
                        label$6:
                        while (true) {
                            _31_ = 0;
                            label$8:
                            do {
                                if ((this._loadInt((_35_ + 20))) != 0) {
                                    break label$8;
                                }
                                _31_ = ((this._loadInt((_35_ + 12))) < (this._loadInt((_35_ + 36)))) ? 1 : 0;
                            }
                            while (false);
                            if (_31_ == 0) {
                                break label$7;
                            }
                            this._storeInt((_35_ + 20), (sqlite3ExprCollSeq((this._loadInt((_35_ + 60))), (this._loadInt((this._loadInt((_35_ + 16))))))));
                            this._storeInt((_35_ + 12), ((this._loadInt((_35_ + 12))) + _30_));
                            this._storeInt((_35_ + 16), ((this._loadInt((_35_ + 16))) + 20));
                            continue label$6;
                        }
                    }
                    while (false);
                    label$9:
                    do {
                        if ((this._loadInt((_35_ + 20))) != 0) {
                            break label$9;
                        }
                        this._storeInt((_35_ + 20), (this._loadInt(((this._loadInt((this._loadInt((_35_ + 60))))) + 44))));
                    }
                    while (false);
                    sqlite3VdbeAddOp4((this._loadInt((_35_ + 52))), 17, _34_, _34_, _34_, (this._loadInt((_35_ + 20))), -4);
                }
                while (false);
                sqlite3VdbeAddOp4((this._loadInt((_35_ + 52))), 116, _33_, (this._loadInt((_35_ + 28))), (this._loadInt(((_31_ = this._loadInt((_35_ + 44))) + 8))), (this._loadInt((_31_ + 4))), -5);
                sqlite3VdbeChangeP5((this._loadInt((_35_ + 52))), (this._loadInt8u((_35_ + 36))));
                sqlite3ExprCacheAffinityChange((this._loadInt((_35_ + 60))), (this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 36))));
                sqlite3ReleaseTempRange((this._loadInt((_35_ + 60))), (this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 36))));
                label$10:
                do {
                    if ((this._loadInt((_35_ + 32))) == 0) {
                        break label$10;
                    }
                    sqlite3VdbeResolveLabel((this._loadInt((_35_ + 52))), (this._loadInt((_35_ + 32))));
                    sqlite3ExprCacheClear((this._loadInt((_35_ + 60))));
                }
                while (false);
                this._storeInt((_35_ + 48), ((this._loadInt((_35_ + 48))) + _30_));
                this._storeInt((_35_ + 44), ((this._loadInt((_35_ + 44))) + 16));
                continue label$0;
            }
        }
        while (false);
        sqlite3ExprCacheClear((this._loadInt((_35_ + 60))));
        this._storeInt((_35_ + 48), 0);
        this._storeInt((_35_ + 40), (this._loadInt(((this._loadInt((_35_ + 56))) + 16))));
        label$12:
        do {
            label$11:
            while (true) {
                if ((this._loadInt((_35_ + 48))) >= (this._loadInt(((this._loadInt((_35_ + 56))) + 28)))) {
                    break label$12;
                }
                sqlite3ExprCode((this._loadInt((_35_ + 60))), (this._loadInt(((_31_ = this._loadInt((_35_ + 40))) + 20))), (this._loadInt((_31_ + 16))));
                this._storeInt((_35_ + 48), ((this._loadInt((_35_ + 48))) + 1));
                this._storeInt((_35_ + 40), ((this._loadInt((_35_ + 40))) + 24));
                continue label$11;
            }
        }
        while (false);
        this._storeInt8((this._loadInt((_35_ + 56))), 0);
        sqlite3ExprCacheClear((this._loadInt((_35_ + 60))));
        this._storeInt((0 + 4), (_35_ + 64));
        return;
    }

    @Override()
    public final void finalizeAggFunctions(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        int _34_ = 0;
        int _35_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), (this._loadInt(((this._loadInt((_34_ + 28))) + 12))));
        _32_ = this._storeInt((_34_ + 16), 0);
        this._storeInt((_34_ + 12), (this._loadInt(((this._loadInt((_34_ + 24))) + 32))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_34_ + 16))) >= (this._loadInt(((this._loadInt((_34_ + 24))) + 36)))) {
                    break label$1;
                }
                _33_ = this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((this._loadInt((_34_ + 12))))) + 16))));
                _35_ = this._loadInt(((this._loadInt((_34_ + 12))) + 8));
                _31_ = 0;
                _30_ = this._loadInt((_34_ + 20));
                label$2:
                do {
                    if (_33_ == 0) {
                        break label$2;
                    }
                    _31_ = this._loadInt((this._loadInt((_34_ + 8))));
                }
                while (false);
                sqlite3VdbeAddOp4(_30_, 117, _35_, _31_, _32_, (this._loadInt(((this._loadInt((_34_ + 12))) + 4))), -5);
                this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) + 1));
                this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 12))) + 16));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final void resetAccumulator(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 28))) + 12))));
        label$0:
        do {
            if (((this._loadInt(((_31_ = this._loadInt((_32_ + 24))) + 36))) + (this._loadInt((_31_ + 20)))) == 0) {
                break label$0;
            }
            _31_ = this._storeInt((_32_ + 16), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 16))) >= (this._loadInt(((this._loadInt((_32_ + 24))) + 20)))) {
                        break label$2;
                    }
                    sqlite3VdbeAddOp2((this._loadInt((_32_ + 20))), 10, _31_, (this._loadInt((((this._loadInt(((this._loadInt((_32_ + 24))) + 16))) + ((this._loadInt((_32_ + 16))) * 24)) + 16))));
                    this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 24))) + 32))));
            _31_ = this._storeInt((_32_ + 16), 0);
            label$4:
            do {
                label$3:
                while (true) {
                    if ((this._loadInt((_32_ + 16))) >= (this._loadInt(((this._loadInt((_32_ + 24))) + 36)))) {
                        break label$4;
                    }
                    sqlite3VdbeAddOp2((this._loadInt((_32_ + 20))), 10, _31_, (this._loadInt(((this._loadInt((_32_ + 12))) + 8))));
                    label$5:
                    do {
                        if ((this._loadInt(((this._loadInt((_32_ + 12))) + 12))) < _31_) {
                            break label$5;
                        }
                        label$6:
                        do {
                            label$7:
                            do {
                                if ((this._loadInt(((this._storeInt((_32_ + 8), (this._loadInt((this._loadInt((_32_ + 12))))))) + 16))) == 0) {
                                    break label$7;
                                }
                                if ((this._loadInt((this._loadInt(((this._loadInt((_32_ + 8))) + 16))))) == 1) {
                                    break label$6;
                                }
                            }
                            while (false);
                            sqlite3ErrorMsg((this._loadInt((_32_ + 28))), 47456, _31_);
                            this._storeInt(((this._loadInt((_32_ + 12))) + 12), -1);
                            break label$5;
                        }
                        while (false);
                        _30_ = this._storeInt((_32_ + 4), (keyInfoFromExprList((this._loadInt((_32_ + 28))), (this._loadInt(((this._loadInt((_32_ + 8))) + 16))))));
                        sqlite3VdbeAddOp4((this._loadInt((_32_ + 20))), 41, (this._loadInt(((this._loadInt((_32_ + 12))) + 12))), _31_, _31_, _30_, -16);
                    }
                    while (false);
                    this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                    this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 16));
                    continue label$3;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final int isSimpleCount(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_32_ + 24))) + 12))) != 0) {
                    break label$1;
                }
                if ((this._loadInt((this._loadInt((this._loadInt((_32_ + 24))))))) != 1) {
                    break label$1;
                }
                if ((this._loadInt16s((this._loadInt(((this._loadInt((_32_ + 24))) + 8))))) != 1) {
                    break label$1;
                }
                if ((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 24))) + 8))) + 24))) == 0) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt((_32_ + 28), 0);
            return (this._loadInt((_32_ + 28)));
        }
        while (false);
        this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 24))) + 8))) + 20))));
        this._storeInt((_32_ + 12), (this._loadInt((this._loadInt(((this._loadInt((this._loadInt((_32_ + 24))))) + 12))))));
        label$2:
        do {
            if (((this._loadInt8u(((this._loadInt((_32_ + 16))) + 34))) & 16) == 0) {
                break label$2;
            }
            this._storeInt((_32_ + 28), 0);
            return (this._loadInt((_32_ + 28)));
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt8u((this._loadInt((_32_ + 12))))) == 153) {
                break label$3;
            }
            this._storeInt((_32_ + 28), 0);
            return (this._loadInt((_32_ + 28)));
        }
        while (false);
        label$4:
        do {
            if (((this._loadInt8u(((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 20))) + 32))) + 4))) + 3))) & 32) != 0) {
                break label$4;
            }
            this._storeInt((_32_ + 28), 0);
            return (this._loadInt((_32_ + 28)));
        }
        while (false);
        label$5:
        do {
            if (((this._loadInt16u(((this._loadInt((_32_ + 12))) + 2))) & 16) == 0) {
                break label$5;
            }
            this._storeInt((_32_ + 28), 0);
            return (this._loadInt((_32_ + 28)));
        }
        while (false);
        this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
        return (this._loadInt((_32_ + 28)));
    }

    @Override()
    public final void explainSimpleCount(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _34_ = 0;
        int _35_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_33_ + 28))) + 484))) != 2) {
                break label$0;
            }
            _32_ = 21392;
            _temp$0 = 47392;
            _temp$1 = 21392;
            _temp$2 = ((_31_ = this._loadInt((_33_ + 20))) != 0) ? _temp$0 : _temp$1;
            _30_ = _temp$2;
            _35_ = this._loadInt((this._loadInt((_33_ + 24))));
            _34_ = this._loadInt((this._loadInt((_33_ + 28))));
            label$1:
            do {
                if (_31_ == 0) {
                    break label$1;
                }
                _32_ = this._loadInt((this._loadInt((_33_ + 20))));
            }
            while (false);
            this._storeInt((_33_ + 12), (this._loadInt(((this._loadInt((_33_ + 24))) + 24))));
            this._storeInt((_33_ + 8), _32_);
            this._storeInt((_33_ + 4), _30_);
            this._storeInt(_33_, _35_);
            _32_ = this._storeInt((_33_ + 16), (sqlite3MPrintf(_34_, 47424, _33_)));
            sqlite3VdbeAddOp4((this._loadInt(((_31_ = this._loadInt((_33_ + 28))) + 12))), 138, (this._loadInt((_31_ + 552))), 0, 0, _32_, -1);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int minMaxQuery(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((this._storeInt((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))), (this._loadInt((this._storeInt((_31_ + 8), _30_)))))))) == 1) {
                    break label$1;
                }
                this._storeInt8((_31_ + 15), 0);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt8u((this._storeInt((_31_ + 4), (this._loadInt((this._loadInt(((this._loadInt(_31_)) + 12))))))))) == 153) {
                    break label$2;
                }
                this._storeInt8((_31_ + 15), 0);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt16u(((this._loadInt((_31_ + 4))) + 2))) & 2048) == 0) {
                    break label$3;
                }
                this._storeInt8((_31_ + 15), 0);
                break label$0;
            }
            while (false);
            label$4:
            do {
                label$5:
                do {
                    if ((this._storeInt(_31_, (this._loadInt(((this._loadInt((_31_ + 4))) + 16))))) == 0) {
                        break label$5;
                    }
                    if ((this._loadInt((this._loadInt(_31_)))) == 1) {
                        break label$4;
                    }
                }
                while (false);
                this._storeInt8((_31_ + 15), 0);
                break label$0;
            }
            while (false);
            label$6:
            do {
                if ((this._loadInt8u((this._loadInt((this._loadInt(((this._loadInt(_31_)) + 12))))))) == 154) {
                    break label$6;
                }
                this._storeInt8((_31_ + 15), 0);
                break label$0;
            }
            while (false);
            label$7:
            do {
                label$8:
                do {
                    if ((sqlite3StrICmp((this._loadInt(((this._loadInt((_31_ + 4))) + 4))), 27408)) == 0) {
                        break label$8;
                    }
                    if ((sqlite3StrICmp((this._loadInt(((this._loadInt((_31_ + 4))) + 4))), 27424)) == 0) {
                        break label$7;
                    }
                    this._storeInt8((_31_ + 15), 0);
                    break label$0;
                }
                while (false);
                this._storeInt8((_31_ + 15), 1);
                break label$0;
            }
            while (false);
            this._storeInt8((_31_ + 15), 2);
        }
        while (false);
        _30_ = this._loadInt8u((_31_ + 15));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void generateSortTail(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_35_ + 56), _31_);
        this._storeInt((_35_ + 52), _32_);
        this._storeInt((_35_ + 48), _33_);
        this._storeInt((_35_ + 44), _34_);
        this._storeInt((_35_ + 40), (sqlite3VdbeMakeLabel((this._loadInt((_35_ + 52))))));
        this._storeInt((_35_ + 36), (sqlite3VdbeMakeLabel((this._loadInt((_35_ + 52))))));
        _34_ = this._storeInt((_35_ + 24), 0);
        this._storeInt((_35_ + 20), (this._loadInt(((this._loadInt((_35_ + 56))) + 24))));
        this._storeInt((_35_ + 16), (this._loadInt8u((this._loadInt((_35_ + 44))))));
        this._storeInt((_35_ + 12), (this._loadInt(((this._loadInt((_35_ + 44))) + 4))));
        this._storeInt((_35_ + 28), (this._loadInt(((this._loadInt((_35_ + 20))) + 8))));
        this._storeInt((_35_ + 8), (sqlite3GetTempReg((this._loadInt((_35_ + 60))))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_35_ + 16))) == 5) {
                        break label$2;
                    }
                    if ((this._loadInt((_35_ + 16))) != 10) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt(((_33_ = this._loadInt((_35_ + 60))) + 68), ((_33_ = this._loadInt((_33_ + 68))) + 1));
                this._storeInt((_35_ + 24), _33_);
                sqlite3VdbeAddOp3((this._loadInt((_35_ + 52))), 42, _33_, (this._loadInt((_35_ + 8))), (this._loadInt((_35_ + 48))));
                this._storeInt((_35_ + 4), _34_);
                break label$0;
            }
            while (false);
            this._storeInt((_35_ + 4), (sqlite3GetTempReg((this._loadInt((_35_ + 60))))));
        }
        while (false);
        this._storeInt((_35_ + 32), ((sqlite3VdbeAddOp2((this._loadInt((_35_ + 52))), 64, (this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 40))))) + 1));
        codeOffset((this._loadInt((_35_ + 52))), (this._loadInt((_35_ + 56))), (this._loadInt((_35_ + 36))));
        sqlite3VdbeAddOp3((this._loadInt((_35_ + 52))), 28, (this._loadInt((_35_ + 28))), ((this._loadInt((this._loadInt((_35_ + 20))))) + 1), (this._loadInt((_35_ + 8))));
        label$3:
        do {
            label$4:
            do {
                label$5:
                do {
                    label$6:
                    do {
                        if ((((_34_ = this._loadInt((_35_ + 16))) + -8) & 4294967295L) < (2 & 4294967295L)) {
                            break label$6;
                        }
                        if (_34_ == 6) {
                            break label$5;
                        }
                        if (_34_ != 7) {
                            break label$4;
                        }
                        sqlite3VdbeAddOp4((this._loadInt((_35_ + 52))), 30, (this._loadInt((_35_ + 8))), 1, (this._loadInt((_35_ + 4))), ((this._loadInt((_35_ + 56))) + 5), 1);
                        sqlite3ExprCacheAffinityChange((this._loadInt((_35_ + 60))), (this._loadInt((_35_ + 8))), 1);
                        sqlite3VdbeAddOp2((this._loadInt((_35_ + 52))), 70, (this._loadInt((_35_ + 12))), (this._loadInt((_35_ + 4))));
                        break label$3;
                    }
                    while (false);
                    sqlite3VdbeAddOp2((this._loadInt((_35_ + 52))), 54, (this._loadInt((_35_ + 12))), (this._loadInt((_35_ + 4))));
                    sqlite3VdbeAddOp3((this._loadInt((_35_ + 52))), 55, (this._loadInt((_35_ + 12))), (this._loadInt((_35_ + 8))), (this._loadInt((_35_ + 4))));
                    sqlite3VdbeChangeP5((this._loadInt((_35_ + 52))), 8);
                    break label$3;
                }
                while (false);
                sqlite3ExprCodeMove((this._loadInt((_35_ + 60))), (this._loadInt((_35_ + 8))), (this._loadInt((_35_ + 12))), 1);
                break label$3;
            }
            while (false);
            this._storeInt(_35_, 0);
            label$8:
            do {
                label$7:
                while (true) {
                    if ((this._loadInt(_35_)) >= (this._loadInt((_35_ + 48)))) {
                        break label$8;
                    }
                    sqlite3VdbeAddOp3((this._loadInt((_35_ + 52))), 28, (this._loadInt((_35_ + 24))), (_34_ = this._loadInt(_35_)), (_34_ + (this._loadInt(((this._loadInt((_35_ + 44))) + 8)))));
                    label$9:
                    do {
                        if ((this._loadInt(_35_)) != 0) {
                            break label$9;
                        }
                        sqlite3VdbeChangeP5((this._loadInt((_35_ + 52))), 32);
                    }
                    while (false);
                    this._storeInt(_35_, ((this._loadInt(_35_)) + 1));
                    continue label$7;
                }
            }
            while (false);
            label$10:
            do {
                if ((this._loadInt((_35_ + 16))) != 5) {
                    break label$10;
                }
                sqlite3VdbeAddOp2((this._loadInt((_35_ + 52))), 16, (this._loadInt(((this._loadInt((_35_ + 44))) + 8))), (this._loadInt((_35_ + 48))));
                sqlite3ExprCacheAffinityChange((this._loadInt((_35_ + 60))), (this._loadInt(((this._loadInt((_35_ + 44))) + 8))), (this._loadInt((_35_ + 48))));
                break label$3;
            }
            while (false);
            sqlite3VdbeAddOp1((this._loadInt((_35_ + 52))), 4, (this._loadInt(((this._loadInt((_35_ + 44))) + 4))));
        }
        while (false);
        sqlite3ReleaseTempReg((this._loadInt((_35_ + 60))), (this._loadInt((_35_ + 8))));
        sqlite3ReleaseTempReg((this._loadInt((_35_ + 60))), (this._loadInt((_35_ + 4))));
        sqlite3VdbeResolveLabel((this._loadInt((_35_ + 52))), (this._loadInt((_35_ + 36))));
        sqlite3VdbeAddOp2((this._loadInt((_35_ + 52))), 67, (this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 32))));
        sqlite3VdbeResolveLabel((this._loadInt((_35_ + 52))), (this._loadInt((_35_ + 40))));
        label$11:
        do {
            label$12:
            do {
                if ((this._loadInt((_35_ + 16))) == 5) {
                    break label$12;
                }
                if ((this._loadInt((_35_ + 16))) != 10) {
                    break label$11;
                }
            }
            while (false);
            sqlite3VdbeAddOp2((this._loadInt((_35_ + 52))), 43, (this._loadInt((_35_ + 24))), 0);
        }
        while (false);
        this._storeInt((0 + 4), (_35_ + 64));
        return;
    }

    @Override()
    public final void generateColumnNames(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _34_ = 0;
        int _35_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 76), _30_);
        this._storeInt((_33_ + 72), _31_);
        this._storeInt((_33_ + 68), _32_);
        this._storeInt((_33_ + 64), (this._loadInt(((this._loadInt((_33_ + 76))) + 12))));
        this._storeInt((_33_ + 52), (this._loadInt((this._loadInt((_33_ + 76))))));
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_33_ + 76))) + 484))) != 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_33_ + 76))) + 16))) != 0) {
                break label$0;
            }
            if ((this._loadInt((_33_ + 64))) == 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_33_ + 52))) + 30))) != 0) {
                break label$0;
            }
            _32_ = this._storeInt8(((this._loadInt((_33_ + 76))) + 16), 1);
            this._storeInt((_33_ + 48), (((this._loadInt(((this._loadInt((_33_ + 52))) + 12))) & 1024) >>> 10));
            this._storeInt((_33_ + 44), (((this._loadInt(((this._loadInt((_33_ + 52))) + 12))) & 2048) >>> 11));
            sqlite3VdbeSetNumCols((this._loadInt((_33_ + 64))), (this._loadInt((this._loadInt((_33_ + 68))))));
            _30_ = this._storeInt((_33_ + 60), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_33_ + 60))) >= (this._loadInt((this._loadInt((_33_ + 68)))))) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._storeInt((_33_ + 40), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 68))) + 12))) + ((this._loadInt((_33_ + 60))) * 20)))))) == 0) {
                            break label$3;
                        }
                        label$4:
                        do {
                            if ((this._loadInt((((this._loadInt(((this._loadInt((_33_ + 68))) + 12))) + ((this._loadInt((_33_ + 60))) * 20)) + 4))) == 0) {
                                break label$4;
                            }
                            _31_ = this._storeInt((_33_ + 36), (this._loadInt((((this._loadInt(((this._loadInt((_33_ + 68))) + 12))) + ((this._loadInt((_33_ + 60))) * 20)) + 4))));
                            sqlite3VdbeSetColName((this._loadInt((_33_ + 64))), (this._loadInt((_33_ + 60))), _30_, _31_, -1);
                            break label$3;
                        }
                        while (false);
                        label$5:
                        do {
                            label$6:
                            do {
                                label$7:
                                do {
                                    label$8:
                                    do {
                                        if ((this._loadInt8u((this._loadInt((_33_ + 40))))) == 152) {
                                            break label$8;
                                        }
                                        if ((this._loadInt8u((this._loadInt((_33_ + 40))))) != 154) {
                                            break label$7;
                                        }
                                    }
                                    while (false);
                                    if ((this._loadInt((_33_ + 72))) == 0) {
                                        break label$7;
                                    }
                                    this._storeInt((_33_ + 24), (this._loadInt16s(((this._loadInt((_33_ + 40))) + 28))));
                                    _31_ = this._storeInt((_33_ + 56), _30_);
                                    label$10:
                                    do {
                                        label$9:
                                        while (true) {
                                            if ((this._loadInt((_33_ + 56))) >= (this._loadInt16s((this._loadInt((_33_ + 72)))))) {
                                                break label$10;
                                            }
                                            if ((this._loadInt((((this._loadInt((_33_ + 72))) + ((this._loadInt((_33_ + 56))) * 56)) + 32))) == (this._loadInt(((this._loadInt((_33_ + 40))) + 24)))) {
                                                break label$10;
                                            }
                                            this._storeInt((_33_ + 56), ((this._loadInt((_33_ + 56))) + _32_));
                                            continue label$9;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_33_ + 32), (this._loadInt((((this._loadInt((_33_ + 72))) + ((this._loadInt((_33_ + 56))) * 56)) + 20))));
                                    label$11:
                                    do {
                                        if ((this._loadInt((_33_ + 24))) > -1) {
                                            break label$11;
                                        }
                                        this._storeInt((_33_ + 24), (this._loadInt(((this._loadInt((_33_ + 32))) + 4))));
                                    }
                                    while (false);
                                    if ((this._loadInt((_33_ + 24))) <= -1) {
                                        break label$6;
                                    }
                                    this._storeInt((_33_ + 28), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 32))) + 12))) + ((this._loadInt((_33_ + 24))) * 24)))));
                                    break label$5;
                                }
                                while (false);
                                sqlite3VdbeSetColName((this._loadInt((_33_ + 64))), (_31_ = this._loadInt((_33_ + 60))), _30_, (sqlite3DbStrDup((this._loadInt((_33_ + 52))), (this._loadInt((((this._loadInt(((this._loadInt((_33_ + 68))) + 12))) + (_31_ * 20)) + 8))))), 14);
                                break label$3;
                            }
                            while (false);
                            this._storeInt((_33_ + 28), 39888);
                        }
                        while (false);
                        label$12:
                        do {
                            label$13:
                            do {
                                if ((this._loadInt((_33_ + 44))) != 0) {
                                    break label$13;
                                }
                                if ((this._loadInt((_33_ + 48))) == 0) {
                                    break label$12;
                                }
                            }
                            while (false);
                            label$14:
                            do {
                                if ((this._loadInt((_33_ + 48))) == 0) {
                                    break label$14;
                                }
                                this._storeInt((_33_ + 20), _31_);
                                _34_ = this._loadInt((_33_ + 52));
                                _35_ = this._loadInt((_33_ + 28));
                                this._storeInt(_33_, (this._loadInt((this._loadInt((_33_ + 32))))));
                                this._storeInt((_33_ + 4), _35_);
                                _34_ = this._storeInt((_33_ + 20), (sqlite3MPrintf(_34_, 40880, _33_)));
                                sqlite3VdbeSetColName((this._loadInt((_33_ + 64))), (this._loadInt((_33_ + 60))), _31_, _34_, 14);
                                break label$3;
                            }
                            while (false);
                            sqlite3VdbeSetColName((this._loadInt((_33_ + 64))), (this._loadInt((_33_ + 60))), _31_, (this._loadInt((_33_ + 28))), -1);
                            break label$3;
                        }
                        while (false);
                        sqlite3VdbeSetColName((this._loadInt((_33_ + 64))), (_34_ = this._loadInt((_33_ + 60))), _31_, (sqlite3DbStrDup((this._loadInt((_33_ + 52))), (this._loadInt((((this._loadInt(((this._loadInt((_33_ + 68))) + 12))) + (_34_ * 20)) + 8))))), 14);
                    }
                    while (false);
                    this._storeInt((_33_ + 60), ((this._loadInt((_33_ + 60))) + _32_));
                    continue label$1;
                }
            }
            while (false);
            generateColumnTypes((this._loadInt((_33_ + 76))), (this._loadInt((_33_ + 72))), (this._loadInt((_33_ + 68))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 80));
        return;
    }

    @Override()
    public final void generateColumnTypes(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_33_ + 56), _31_);
        this._storeInt((_33_ + 52), _32_);
        this._storeInt((_33_ + 48), (this._loadInt(((this._loadInt((_33_ + 60))) + 12))));
        _32_ = this._loadInt((_33_ + 56));
        this._storeInt((_33_ + 8), (this._loadInt((_33_ + 60))));
        this._storeInt((_33_ + 12), _32_);
        _32_ = this._storeInt((_33_ + 44), 0);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_33_ + 44))) >= (this._loadInt((this._loadInt((_33_ + 52)))))) {
                    break label$1;
                }
                _31_ = this._storeInt(_33_, (columnType((_33_ + 8), (this._storeInt((_33_ + 4), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 52))) + 12))) + ((this._loadInt((_33_ + 44))) * 20)))))), _32_, _32_, _32_)));
                sqlite3VdbeSetColName((this._loadInt((_33_ + 48))), (this._loadInt((_33_ + 44))), 1, _31_, -1);
                this._storeInt((_33_ + 44), ((this._loadInt((_33_ + 44))) + 1));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 64));
        return;
    }

    @Override()
    public final void codeOffset(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_33_ + 8))) + 52))) == 0) {
                break label$0;
            }
            if ((this._loadInt((_33_ + 4))) == 0) {
                break label$0;
            }
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 12))), 20, (this._loadInt(((this._loadInt((_33_ + 8))) + 52))), -1);
            this._storeInt(_33_, (sqlite3VdbeAddOp1((this._loadInt((_33_ + 12))), 114, (this._loadInt(((this._loadInt((_33_ + 8))) + 52))))));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 12))), 1, 0, (this._loadInt((_33_ + 4))));
            sqlite3VdbeJumpHere((this._loadInt((_33_ + 12))), (this._loadInt(_33_)));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void codeDistinct(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        this._storeInt((_35_ + 8), (this._loadInt(((this._loadInt((_35_ + 28))) + 12))));
        this._storeInt((_35_ + 4), (sqlite3GetTempReg((this._loadInt((_35_ + 28))))));
        sqlite3VdbeAddOp4Int((this._loadInt((_35_ + 8))), 50, (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 12))), (this._loadInt((_35_ + 16))));
        sqlite3VdbeAddOp3((this._loadInt((_35_ + 8))), 30, (this._loadInt((_35_ + 12))), (this._loadInt((_35_ + 16))), (this._loadInt((_35_ + 4))));
        sqlite3VdbeAddOp2((this._loadInt((_35_ + 8))), 70, (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 4))));
        sqlite3ReleaseTempReg((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 4))));
        this._storeInt((0 + 4), (_35_ + 32));
        return;
    }

    @Override()
    public final int analyzeAggregate(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        int _34_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 72), _30_);
        this._storeInt((_32_ + 68), _31_);
        this._storeInt((_32_ + 60), (this._loadInt(((this._loadInt((_32_ + 72))) + 12))));
        this._storeInt((_32_ + 56), (this._loadInt((this._loadInt((_32_ + 60))))));
        this._storeInt((_32_ + 52), (this._loadInt(((this._loadInt((_32_ + 60))) + 4))));
        this._storeInt((_32_ + 48), (this._loadInt(((this._loadInt((_32_ + 60))) + 28))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        label$4:
                        do {
                            if ((_31_ = this._loadInt8u((this._loadInt((_32_ + 68))))) == 154) {
                                break label$4;
                            }
                            if (_31_ == 153) {
                                break label$3;
                            }
                            if (_31_ != 152) {
                                break label$2;
                            }
                        }
                        while (false);
                        label$5:
                        do {
                            if ((this._loadInt((_32_ + 52))) == 0) {
                                break label$5;
                            }
                            this._storeInt((_32_ + 44), ((this._loadInt((_32_ + 52))) + 8));
                            this._storeInt((_32_ + 64), 0);
                            label$7:
                            do {
                                label$6:
                                while (true) {
                                    if ((this._loadInt((_32_ + 64))) >= (this._loadInt16s((this._loadInt((_32_ + 52)))))) {
                                        break label$5;
                                    }
                                    if ((this._loadInt(((this._loadInt((_32_ + 68))) + 24))) == (this._loadInt(((this._loadInt((_32_ + 44))) + 24)))) {
                                        break label$7;
                                    }
                                    this._storeInt((_32_ + 64), ((this._loadInt((_32_ + 64))) + 1));
                                    this._storeInt((_32_ + 44), ((this._loadInt((_32_ + 44))) + 56));
                                    continue label$6;
                                }
                            }
                            while (false);
                            this._storeInt((_32_ + 40), (this._loadInt(((this._loadInt((_32_ + 48))) + 16))));
                            this._storeInt((_32_ + 36), 0);
                            label$9:
                            do {
                                label$8:
                                while (true) {
                                    if ((this._loadInt((_32_ + 36))) >= (this._loadInt(((this._loadInt((_32_ + 48))) + 20)))) {
                                        break label$9;
                                    }
                                    label$10:
                                    do {
                                        if ((this._loadInt(((this._loadInt((_32_ + 40))) + 4))) != (this._loadInt(((this._loadInt((_32_ + 68))) + 24)))) {
                                            break label$10;
                                        }
                                        if ((this._loadInt(((this._loadInt((_32_ + 40))) + 8))) == (this._loadInt16s(((this._loadInt((_32_ + 68))) + 28)))) {
                                            break label$9;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_32_ + 36), ((this._loadInt((_32_ + 36))) + 1));
                                    this._storeInt((_32_ + 40), ((this._loadInt((_32_ + 40))) + 24));
                                    continue label$8;
                                }
                            }
                            while (false);
                            label$11:
                            do {
                                if ((this._loadInt((_32_ + 36))) < (this._loadInt(((this._loadInt((_32_ + 48))) + 20)))) {
                                    break label$11;
                                }
                                if ((this._storeInt((_32_ + 36), (addAggInfoColumn((this._loadInt((this._loadInt((_32_ + 56))))), (this._loadInt((_32_ + 48))))))) < 0) {
                                    break label$11;
                                }
                                this._storeInt((this._storeInt((_32_ + 40), ((this._loadInt(((this._loadInt((_32_ + 48))) + 16))) + ((this._loadInt((_32_ + 36))) * 24)))), (this._loadInt(((this._loadInt((_32_ + 68))) + 40))));
                                this._storeInt(((this._loadInt((_32_ + 40))) + 4), (this._loadInt(((this._loadInt((_32_ + 68))) + 24))));
                                this._storeInt(((this._loadInt((_32_ + 40))) + 8), (this._loadInt16s(((this._loadInt((_32_ + 68))) + 28))));
                                _31_ = this._storeInt(((_31_ = this._loadInt((_32_ + 56))) + 72), ((this._loadInt((_31_ + 72))) + 1));
                                this._storeInt(((this._loadInt((_32_ + 40))) + 16), _31_);
                                _31_ = this._storeInt(((this._loadInt((_32_ + 40))) + 12), -1);
                                this._storeInt(((this._loadInt((_32_ + 40))) + 20), (this._loadInt((_32_ + 68))));
                                label$12:
                                do {
                                    if ((this._loadInt(((this._loadInt((_32_ + 48))) + 8))) == 0) {
                                        break label$12;
                                    }
                                    this._storeInt((_32_ + 20), (this._loadInt(((this._storeInt((_32_ + 24), (this._loadInt(((this._loadInt((_32_ + 48))) + 8))))) + 12))));
                                    this._storeInt((_32_ + 28), (this._loadInt((this._loadInt((_32_ + 24))))));
                                    this._storeInt((_32_ + 32), 0);
                                    label$14:
                                    do {
                                        label$13:
                                        while (true) {
                                            if ((this._loadInt((_32_ + 32))) >= (this._loadInt((_32_ + 28)))) {
                                                break label$12;
                                            }
                                            label$15:
                                            do {
                                                if ((this._loadInt8u((this._storeInt((_32_ + 16), (this._loadInt((this._loadInt((_32_ + 20))))))))) != 152) {
                                                    break label$15;
                                                }
                                                if ((this._loadInt(((this._loadInt((_32_ + 16))) + 24))) != (this._loadInt(((this._loadInt((_32_ + 68))) + 24)))) {
                                                    break label$15;
                                                }
                                                if ((this._loadInt16s(((this._loadInt((_32_ + 16))) + 28))) == (this._loadInt16s(((this._loadInt((_32_ + 68))) + 28)))) {
                                                    break label$14;
                                                }
                                            }
                                            while (false);
                                            this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) + 1));
                                            this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 20));
                                            continue label$13;
                                        }
                                    }
                                    while (false);
                                    this._storeInt(((this._loadInt((_32_ + 40))) + 12), (this._loadInt((_32_ + 32))));
                                }
                                while (false);
                                if ((this._loadInt(((this._loadInt((_32_ + 40))) + 12))) > _31_) {
                                    break label$11;
                                }
                                this._storeInt(((_31_ = this._loadInt((_32_ + 48))) + 12), ((_31_ = this._loadInt((_31_ + 12))) + 1));
                                this._storeInt(((this._loadInt((_32_ + 40))) + 12), _31_);
                            }
                            while (false);
                            this._storeInt8((_31_ = this._loadInt((_32_ + 68))), 154);
                            this._storeInt((_31_ + 36), (this._loadInt((_32_ + 48))));
                            this._storeInt16(((this._loadInt((_32_ + 68))) + 30), (this._loadInt((_32_ + 36))));
                        }
                        while (false);
                        this._storeInt((_32_ + 76), 1);
                        break label$0;
                    }
                    while (false);
                    if ((this._loadInt(((this._loadInt((_32_ + 60))) + 24))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((_32_ + 76), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 48))) + 32))));
            this._storeInt((_32_ + 64), 0);
            label$17:
            do {
                label$16:
                while (true) {
                    if ((this._loadInt((_32_ + 64))) >= (this._loadInt(((this._loadInt((_32_ + 48))) + 36)))) {
                        break label$17;
                    }
                    if ((sqlite3ExprCompare((this._loadInt((this._loadInt((_32_ + 12))))), (this._loadInt((_32_ + 68))))) == 0) {
                        break label$17;
                    }
                    this._storeInt((_32_ + 64), ((this._loadInt((_32_ + 64))) + 1));
                    this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 16));
                    continue label$16;
                }
            }
            while (false);
            label$18:
            do {
                if ((this._loadInt((_32_ + 64))) < (this._loadInt(((this._loadInt((_32_ + 48))) + 36)))) {
                    break label$18;
                }
                this._storeInt8((_32_ + 11), (this._loadInt8u(((this._loadInt(((this._loadInt(((this._loadInt((this._loadInt((_32_ + 56))))) + 8))) + 12))) + 77))));
                _31_ = 0;
                if ((this._storeInt((_32_ + 64), (addAggInfoFunc((this._loadInt((this._loadInt((_32_ + 56))))), (this._loadInt((_32_ + 48))))))) < 0) {
                    break label$18;
                }
                this._storeInt((this._storeInt((_32_ + 12), ((this._loadInt(((this._loadInt((_32_ + 48))) + 32))) + ((this._loadInt((_32_ + 64))) << 4)))), (this._loadInt((_32_ + 68))));
                _30_ = this._storeInt(((_30_ = this._loadInt((_32_ + 56))) + 72), ((this._loadInt((_30_ + 72))) + 1));
                this._storeInt(((this._loadInt((_32_ + 12))) + 8), _30_);
                _30_ = this._loadInt((this._loadInt((_32_ + 56))));
                _34_ = sqlite3Strlen30((_33_ = this._loadInt(((this._loadInt((_32_ + 68))) + 4))));
                label$19:
                do {
                    if ((this._loadInt(((this._loadInt((_32_ + 68))) + 16))) == 0) {
                        break label$19;
                    }
                    _31_ = this._loadInt((this._loadInt(((this._loadInt((_32_ + 68))) + 16))));
                }
                while (false);
                _31_ = sqlite3FindFunction(_30_, _33_, _34_, _31_, (this._loadInt8u((_32_ + 11))), 0);
                this._storeInt(((this._loadInt((_32_ + 12))) + 4), _31_);
                label$20:
                do {
                    if (((this._loadInt16u(((this._loadInt((_32_ + 68))) + 2))) & 16) == 0) {
                        break label$20;
                    }
                    this._storeInt(((_31_ = this._loadInt((_32_ + 56))) + 68), ((_31_ = this._loadInt((_31_ + 68))) + 1));
                    this._storeInt(((this._loadInt((_32_ + 12))) + 12), _31_);
                    break label$18;
                }
                while (false);
                this._storeInt(((this._loadInt((_32_ + 12))) + 12), -1);
            }
            while (false);
            this._storeInt16(((_31_ = this._loadInt((_32_ + 68))) + 30), (this._loadInt((_32_ + 64))));
            this._storeInt((_31_ + 36), (this._loadInt((_32_ + 48))));
            this._storeInt((_32_ + 76), 1);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 76));
        this._storeInt((0 + 4), (_32_ + 80));
        return _31_;
    }

    @Override()
    public final int analyzeAggregatesInSelect(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._storeInt(_32_, (this._loadInt(((this._loadInt((_32_ + 8))) + 12))))) + 24))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt(((_31_ = this._loadInt(_32_)) + 24), ((this._loadInt((_31_ + 24))) + 1));
            sqlite3WalkSelect((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))));
            this._storeInt(((_31_ = this._loadInt(_32_)) + 24), ((this._loadInt((_31_ + 24))) + -1));
            this._storeInt((_32_ + 12), 1);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int addAggInfoColumn(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = sqlite3ArrayAllocate((this._loadInt((_32_ + 12))), (this._loadInt((_31_ + 16))), 24, 3, (_31_ + 20), (_31_ + 24), (_32_ + 4));
        this._storeInt(((this._loadInt((_32_ + 8))) + 16), _31_);
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int addAggInfoFunc(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = sqlite3ArrayAllocate((this._loadInt((_32_ + 12))), (this._loadInt((_31_ + 32))), 16, 3, (_31_ + 36), (_31_ + 40), (_32_ + 4));
        this._storeInt(((this._loadInt((_32_ + 8))) + 32), _31_);
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void pushOntoSorter(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_34_ + 40), _31_);
        this._storeInt((_34_ + 36), _32_);
        this._storeInt((_34_ + 32), _33_);
        this._storeInt((_34_ + 28), (this._loadInt(((this._loadInt((_34_ + 44))) + 12))));
        _33_ = this._storeInt((_34_ + 24), (this._loadInt((this._loadInt((_34_ + 40))))));
        this._storeInt((_34_ + 20), (sqlite3GetTempRange((this._loadInt((_34_ + 44))), (_33_ + 2))));
        this._storeInt((_34_ + 16), (sqlite3GetTempReg((this._loadInt((_34_ + 44))))));
        sqlite3ExprCacheClear((this._loadInt((_34_ + 44))));
        sqlite3ExprCodeExprList((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 20))), 0);
        sqlite3VdbeAddOp2((this._loadInt((_34_ + 28))), 53, (this._loadInt(((this._loadInt((_34_ + 40))) + 8))), ((this._loadInt((_34_ + 20))) + (this._loadInt((_34_ + 24)))));
        sqlite3ExprCodeMove((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 32))), (((this._loadInt((_34_ + 20))) + (this._loadInt((_34_ + 24)))) + 1), 1);
        sqlite3VdbeAddOp3((this._loadInt((_34_ + 28))), 30, (this._loadInt((_34_ + 20))), ((this._loadInt((_34_ + 24))) + 2), (this._loadInt((_34_ + 16))));
        sqlite3VdbeAddOp2((this._loadInt((_34_ + 28))), 70, (this._loadInt(((this._loadInt((_34_ + 40))) + 8))), (this._loadInt((_34_ + 16))));
        sqlite3ReleaseTempReg((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 16))));
        sqlite3ReleaseTempRange((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 20))), ((this._loadInt((_34_ + 24))) + 2));
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_34_ + 36))) + 48))) == 0) {
                break label$0;
            }
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt(((this._loadInt((_34_ + 36))) + 52))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_34_ + 4), ((this._loadInt(((this._loadInt((_34_ + 36))) + 52))) + 1));
                    break label$1;
                }
                while (false);
                this._storeInt((_34_ + 4), (this._loadInt(((this._loadInt((_34_ + 36))) + 48))));
            }
            while (false);
            this._storeInt((_34_ + 12), (sqlite3VdbeAddOp1((this._loadInt((_34_ + 28))), 115, (this._loadInt((_34_ + 4))))));
            sqlite3VdbeAddOp2((this._loadInt((_34_ + 28))), 20, (this._loadInt((_34_ + 4))), -1);
            this._storeInt((_34_ + 8), (sqlite3VdbeAddOp0((this._loadInt((_34_ + 28))), 1)));
            sqlite3VdbeJumpHere((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 12))));
            sqlite3VdbeAddOp1((this._loadInt((_34_ + 28))), 63, (this._loadInt(((this._loadInt((_34_ + 40))) + 8))));
            sqlite3VdbeAddOp1((this._loadInt((_34_ + 28))), 57, (this._loadInt(((this._loadInt((_34_ + 40))) + 8))));
            sqlite3VdbeJumpHere((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 48));
        return;
    }

    @Override()
    public final int selectOpName(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((_30_ = this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) == 115) {
                        break label$2;
                    }
                    if (_30_ == 114) {
                        break label$1;
                    }
                    if (_30_ != 113) {
                        break label$0;
                    }
                    this._storeInt((_31_ + 8), 47824);
                    return (this._loadInt((_31_ + 8)));
                }
                while (false);
                this._storeInt((_31_ + 8), 47840);
                return (this._loadInt((_31_ + 8)));
            }
            while (false);
            this._storeInt((_31_ + 8), 47856);
            return (this._loadInt((_31_ + 8)));
        }
        while (false);
        this._storeInt((_31_ + 8), 47872);
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final int multiSelectOrderBy(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        double _34_ = 0.0;
        double _35_ = 0.0;
        int _36_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 224))) + 216), _30_);
        this._storeInt((_33_ + 212), _31_);
        this._storeInt((_33_ + 208), _32_);
        _30_ = this._storeInt((_33_ + 60), (this._storeInt((_33_ + 120), 0)));
        this._storeInt((_33_ + 52), (this._loadInt((this._loadInt((_33_ + 216))))));
        this._storeInt((_33_ + 72), (sqlite3VdbeMakeLabel((this._storeInt((_33_ + 192), (this._loadInt(((this._loadInt((_33_ + 216))) + 12))))))));
        this._storeInt((_33_ + 76), (sqlite3VdbeMakeLabel((this._loadInt((_33_ + 192))))));
        this._storeInt((_33_ + 64), (this._loadInt8u(((this._loadInt((_33_ + 212))) + 4))));
        this._storeInt((_33_ + 196), (this._loadInt(((this._loadInt((_33_ + 212))) + 28))));
        this._storeInt((_33_ + 48), (this._loadInt(((this._loadInt((_33_ + 212))) + 24))));
        this._storeInt((_33_ + 44), (this._loadInt((this._loadInt((_33_ + 48))))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        label$4:
                        do {
                            label$5:
                            do {
                                if ((this._loadInt((_33_ + 64))) == 113) {
                                    break label$5;
                                }
                                _32_ = this._storeInt((_33_ + 204), 1);
                                label$7:
                                do {
                                    label$6:
                                    while (true) {
                                        _31_ = 0;
                                        label$8:
                                        do {
                                            if ((this._loadInt8u(((this._loadInt((_33_ + 52))) + 30))) != 0) {
                                                break label$8;
                                            }
                                            _31_ = ((this._loadInt((_33_ + 204))) <= (this._loadInt((this._loadInt((this._loadInt((_33_ + 212)))))))) ? 1 : 0;
                                        }
                                        while (false);
                                        if (_31_ == 0) {
                                            break label$7;
                                        }
                                        _31_ = this._storeInt((_33_ + 200), _30_);
                                        this._storeInt((_33_ + 28), (this._loadInt(((this._loadInt((_33_ + 48))) + 12))));
                                        label$10:
                                        do {
                                            label$9:
                                            while (true) {
                                                if ((this._loadInt((_33_ + 200))) >= (this._loadInt((_33_ + 44)))) {
                                                    break label$10;
                                                }
                                                if ((this._loadInt16u(((this._loadInt((_33_ + 28))) + 14))) == (this._loadInt((_33_ + 204)))) {
                                                    break label$10;
                                                }
                                                this._storeInt((_33_ + 200), ((this._loadInt((_33_ + 200))) + _32_));
                                                this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) + 20));
                                                continue label$9;
                                            }
                                        }
                                        while (false);
                                        label$11:
                                        do {
                                            if ((this._loadInt((_33_ + 200))) != (this._loadInt((_33_ + 44)))) {
                                                break label$11;
                                            }
                                            if ((this._storeInt((_33_ + 24), (sqlite3Expr((this._loadInt((_33_ + 52))), 129, _31_)))) == 0) {
                                                break label$4;
                                            }
                                            this._storeInt16(((_31_ = this._loadInt((_33_ + 24))) + 2), ((this._loadInt16u((_31_ + 2))) | 1024));
                                            this._storeInt((_31_ + 4), (this._loadInt((_33_ + 204))));
                                            this._storeInt((_33_ + 48), (sqlite3ExprListAppend((this._loadInt((_33_ + 216))), (this._loadInt((_33_ + 48))), (this._loadInt((_33_ + 24))))));
                                            _31_ = this._loadInt((_33_ + 204));
                                            this._storeInt((_33_ + 44), ((_36_ = this._loadInt((_33_ + 44))) + _32_));
                                            this._storeInt16((((this._loadInt(((this._loadInt((_33_ + 48))) + 12))) + (_36_ * 20)) + 14), _31_);
                                        }
                                        while (false);
                                        this._storeInt((_33_ + 204), ((this._loadInt((_33_ + 204))) + _32_));
                                        continue label$6;
                                    }
                                }
                                while (false);
                            }
                            while (false);
                            label$12:
                            do {
                                label$13:
                                do {
                                    if ((this._storeInt((_33_ + 40), (sqlite3DbMallocRaw((this._loadInt((_33_ + 52))), ((this._loadInt((_33_ + 44))) << 2))))) == 0) {
                                        break label$13;
                                    }
                                    this._storeInt((_33_ + 204), 0);
                                    this._storeInt((_33_ + 20), (this._loadInt(((this._loadInt((_33_ + 48))) + 12))));
                                    label$15:
                                    do {
                                        label$14:
                                        while (true) {
                                            if ((this._loadInt((_33_ + 204))) >= (this._loadInt((_33_ + 44)))) {
                                                break label$15;
                                            }
                                            this._storeInt(((this._loadInt((_33_ + 40))) + ((this._loadInt((_33_ + 204))) << 2)), ((this._loadInt16u(((this._loadInt((_33_ + 20))) + 14))) + -1));
                                            this._storeInt((_33_ + 204), ((this._loadInt((_33_ + 204))) + 1));
                                            this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + 20));
                                            continue label$14;
                                        }
                                    }
                                    while (false);
                                    if ((this._storeInt((_33_ + 56), (sqlite3DbMallocRaw((this._loadInt((_33_ + 52))), (((this._loadInt((_33_ + 44))) * 5) + 16))))) == 0) {
                                        break label$12;
                                    }
                                    this._storeInt(((_32_ = this._loadInt((_33_ + 56))) + 8), ((_32_ + ((this._storeInt16((_32_ + 6), (this._loadInt((_33_ + 44))))) << 2)) + 12));
                                    this._storeInt8(((this._loadInt((_33_ + 56))) + 4), (this._loadInt8u(((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 52))) + 8))) + 12))) + 77))));
                                    this._storeInt((_33_ + 204), 0);
                                    label$16:
                                    while (true) {
                                        if ((this._loadInt((_33_ + 204))) >= (this._loadInt((_33_ + 44)))) {
                                            break label$12;
                                        }
                                        label$18:
                                        do {
                                            label$19:
                                            do {
                                                if (((this._loadInt16u(((this._storeInt((_33_ + 12), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 48))) + 12))) + ((this._loadInt((_33_ + 204))) * 20)))))) + 2))) & 256) == 0) {
                                                    break label$19;
                                                }
                                                this._storeInt((_33_ + 16), (this._loadInt(((this._loadInt((_33_ + 12))) + 20))));
                                                break label$18;
                                            }
                                            while (false);
                                            _31_ = this._storeInt((_33_ + 16), (multiSelectCollSeq((this._loadInt((_33_ + 216))), (this._loadInt((_33_ + 212))), (this._loadInt(((this._loadInt((_33_ + 40))) + ((this._loadInt((_33_ + 204))) << 2)))))));
                                            this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 20), _31_);
                                            this._storeInt16((_32_ + 2), ((this._loadInt16u((_32_ + 2))) | 256));
                                        }
                                        while (false);
                                        this._storeInt((((_31_ = this._loadInt((_33_ + 56))) + ((_32_ = this._loadInt((_33_ + 204))) << 2)) + 12), (this._loadInt((_33_ + 16))));
                                        this._storeInt8((_32_ + (this._loadInt((_31_ + 8)))), (this._loadInt8u((((this._loadInt(((this._loadInt((_33_ + 48))) + 12))) + (_32_ * 20)) + 12))));
                                        this._storeInt((_33_ + 204), ((this._loadInt((_33_ + 204))) + 1));
                                        continue label$16;
                                    }
                                }
                                while (false);
                                this._storeInt((_33_ + 56), 0);
                            }
                            while (false);
                            _32_ = this._storeInt(((this._loadInt((_33_ + 212))) + 24), (this._loadInt((_33_ + 48))));
                            _32_ = sqlite3ExprListDup((this._loadInt((this._loadInt((_33_ + 216))))), _32_, 0);
                            this._storeInt(((this._loadInt((_33_ + 196))) + 24), _32_);
                            label$20:
                            do {
                                label$21:
                                do {
                                    if ((this._loadInt((_33_ + 64))) != 113) {
                                        break label$21;
                                    }
                                    this._storeInt((_33_ + 88), 0);
                                    break label$20;
                                }
                                while (false);
                                _32_ = this._storeInt((_33_ + 8), (this._loadInt((this._loadInt((this._loadInt((_33_ + 212))))))));
                                _32_ = this._storeInt((_33_ + 88), (sqlite3GetTempRange((this._loadInt((_33_ + 216))), (_32_ + 1))));
                                sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 7, 0, _32_);
                                if ((this._storeInt((_33_ + 60), (sqlite3DbMallocZero((this._loadInt((_33_ + 52))), (((this._loadInt((_33_ + 8))) * 5) + 16))))) == 0) {
                                    break label$20;
                                }
                                this._storeInt(((_32_ = this._loadInt((_33_ + 60))) + 8), ((_32_ + ((this._storeInt16((_32_ + 6), (this._loadInt((_33_ + 8))))) << 2)) + 12));
                                this._storeInt8(((this._loadInt((_33_ + 60))) + 4), (this._loadInt8u(((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 52))) + 8))) + 12))) + 77))));
                                _36_ = this._storeInt((_33_ + 204), 0);
                                label$23:
                                do {
                                    label$22:
                                    while (true) {
                                        if ((this._loadInt((_33_ + 204))) >= (this._loadInt((_33_ + 8)))) {
                                            break label$23;
                                        }
                                        _32_ = multiSelectCollSeq((this._loadInt((_33_ + 216))), (this._loadInt((_33_ + 212))), (this._loadInt((_33_ + 204))));
                                        this._storeInt((((_31_ = this._loadInt((_33_ + 60))) + ((_30_ = this._loadInt((_33_ + 204))) << 2)) + 12), _32_);
                                        this._storeInt8((_30_ + (this._loadInt((_31_ + 8)))), _36_);
                                        this._storeInt((_33_ + 204), ((this._loadInt((_33_ + 204))) + 1));
                                        continue label$22;
                                    }
                                }
                                while (false);
                            }
                            while (false);
                            this._storeInt(((_32_ = this._loadInt((_33_ + 212))) + 28), 0);
                            sqlite3ResolveOrderGroupBy((this._loadInt((_33_ + 216))), _32_, (this._loadInt((_32_ + 24))), 39968);
                            label$24:
                            do {
                                if ((this._loadInt(((this._loadInt((_33_ + 196))) + 28))) != 0) {
                                    break label$24;
                                }
                                sqlite3ResolveOrderGroupBy((this._loadInt((_33_ + 216))), (_32_ = this._loadInt((_33_ + 196))), (this._loadInt((_32_ + 24))), 39968);
                            }
                            while (false);
                            computeLimitRegisters((this._loadInt((_33_ + 216))), (this._loadInt((_33_ + 212))), (this._loadInt((_33_ + 72))));
                            label$25:
                            do {
                                if ((this._loadInt(((this._loadInt((_33_ + 212))) + 48))) == 0) {
                                    break label$25;
                                }
                                if ((this._loadInt((_33_ + 64))) != 113) {
                                    break label$25;
                                }
                                this._storeInt((_33_ + 96), (this._storeInt(((_32_ = this._loadInt((_33_ + 216))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
                                this._storeInt((_33_ + 92), (this._storeInt(((_32_ = this._loadInt((_33_ + 216))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
                                _32_ = this._loadInt((_33_ + 192));
                                if ((this._loadInt(((this._loadInt((_33_ + 212))) + 52))) == 0) {
                                    break label$3;
                                }
                                _31_ = (this._loadInt(((this._loadInt((_33_ + 212))) + 52))) + 1;
                                break label$2;
                            }
                            while (false);
                            this._storeInt((_33_ + 96), (this._storeInt((_33_ + 92), 0)));
                            break label$1;
                        }
                        while (false);
                        this._storeInt((_33_ + 220), 7);
                        break label$0;
                    }
                    while (false);
                    _31_ = this._loadInt(((this._loadInt((_33_ + 212))) + 48));
                }
                while (false);
                sqlite3VdbeAddOp2(_32_, 14, _31_, (this._loadInt((_33_ + 96))));
                sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 14, (this._loadInt((_33_ + 96))), (this._loadInt((_33_ + 92))));
            }
            while (false);
            sqlite3ExprDelete((this._loadInt((_33_ + 52))), (this._loadInt(((this._loadInt((_33_ + 212))) + 40))));
            _31_ = this._storeInt(((_32_ = this._loadInt((_33_ + 212))) + 40), 0);
            sqlite3ExprDelete((this._loadInt((_33_ + 52))), (this._loadInt((_32_ + 44))));
            _32_ = this._storeInt(((this._loadInt((_33_ + 212))) + 44), _31_);
            this._storeInt((_33_ + 156), (this._storeInt(((_31_ = this._loadInt((_33_ + 216))) + 72), ((this._loadInt((_31_ + 72))) + 1))));
            this._storeInt((_33_ + 152), (this._storeInt(((_31_ = this._loadInt((_33_ + 216))) + 72), ((this._loadInt((_31_ + 72))) + 1))));
            this._storeInt((_33_ + 148), (this._storeInt(((_31_ = this._loadInt((_33_ + 216))) + 72), ((this._loadInt((_31_ + 72))) + 1))));
            this._storeInt((_33_ + 144), (this._storeInt(((_31_ = this._loadInt((_33_ + 216))) + 72), ((this._loadInt((_31_ + 72))) + 1))));
            this._storeInt((_33_ + 132), (this._storeInt(((_31_ = this._loadInt((_33_ + 216))) + 72), ((this._loadInt((_31_ + 72))) + 1))));
            this._storeInt((_33_ + 128), (this._storeInt(((_31_ = this._loadInt((_33_ + 216))) + 72), ((this._loadInt((_31_ + 72))) + 1))));
            sqlite3SelectDestInit((_33_ + 176), 10, (this._loadInt((_33_ + 156))));
            sqlite3SelectDestInit((_33_ + 160), 10, (this._loadInt((_33_ + 148))));
            this._storeInt((_33_ + 68), (sqlite3VdbeAddOp0((this._loadInt((_33_ + 192))), 1)));
            this._storeInt((_33_ + 140), (sqlite3VdbeCurrentAddr((this._loadInt((_33_ + 192))))));
            this._storeInt(((this._loadInt((_33_ + 196))) + 48), (this._loadInt((_33_ + 96))));
            this._storeInt((_33_ + 36), (this._loadInt(((this._loadInt((_33_ + 216))) + 556))));
            sqlite3Select((this._loadInt((_33_ + 216))), (this._loadInt((_33_ + 196))), (_33_ + 176));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 7, 1, (this._loadInt((_33_ + 152))));
            sqlite3VdbeAddOp1((this._loadInt((_33_ + 192))), 4, (this._loadInt((_33_ + 156))));
            this._storeInt((_33_ + 136), (sqlite3VdbeCurrentAddr((this._loadInt((_33_ + 192))))));
            this._storeInt((_33_ + 84), (this._loadInt(((this._loadInt((_33_ + 212))) + 48))));
            this._storeInt((_33_ + 80), (this._loadInt(((this._loadInt((_33_ + 212))) + 52))));
            this._storeInt(((_31_ = this._loadInt((_33_ + 212))) + 48), (this._loadInt((_33_ + 92))));
            this._storeInt((_31_ + 52), _32_);
            this._storeInt((_33_ + 32), (this._loadInt(((this._loadInt((_33_ + 216))) + 556))));
            sqlite3Select((this._loadInt((_33_ + 216))), (this._loadInt((_33_ + 212))), (_33_ + 160));
            this._storeInt(((_32_ = this._loadInt((_33_ + 212))) + 52), (this._loadInt((_33_ + 80))));
            this._storeInt((_32_ + 48), (this._loadInt((_33_ + 84))));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 7, 1, (this._loadInt((_33_ + 144))));
            sqlite3VdbeAddOp1((this._loadInt((_33_ + 192))), 4, (this._loadInt((_33_ + 148))));
            this._storeInt((_33_ + 124), (generateOutputSubroutine((this._loadInt((_33_ + 216))), (this._loadInt((_33_ + 212))), (_33_ + 176), (this._loadInt((_33_ + 208))), (this._loadInt((_33_ + 132))), (this._loadInt((_33_ + 88))), (this._loadInt((_33_ + 60))), -16, (this._loadInt((_33_ + 72))))));
            label$26:
            do {
                label$27:
                do {
                    if ((this._loadInt((_33_ + 64))) == 113) {
                        break label$27;
                    }
                    if ((this._loadInt((_33_ + 64))) != 112) {
                        break label$26;
                    }
                }
                while (false);
                this._storeInt((_33_ + 120), (generateOutputSubroutine((this._loadInt((_33_ + 216))), (this._loadInt((_33_ + 212))), (_33_ + 160), (this._loadInt((_33_ + 208))), (this._loadInt((_33_ + 128))), (this._loadInt((_33_ + 88))), (this._loadInt((_33_ + 60))), -17, (this._loadInt((_33_ + 72))))));
            }
            while (false);
            label$28:
            do {
                label$29:
                do {
                    label$30:
                    do {
                        if ((this._loadInt((_33_ + 64))) == 114) {
                            break label$30;
                        }
                        if ((this._loadInt((_33_ + 64))) != 115) {
                            break label$29;
                        }
                    }
                    while (false);
                    this._storeInt((_33_ + 116), (sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 1, 0, (this._loadInt((_33_ + 72))))));
                    break label$28;
                }
                while (false);
                this._storeInt((_33_ + 116), (sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 26, (this._loadInt((_33_ + 144))), (this._loadInt((_33_ + 72))))));
                sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 2, (this._loadInt((_33_ + 128))), (this._loadInt((_33_ + 120))));
                sqlite3VdbeAddOp1((this._loadInt((_33_ + 192))), 4, (this._loadInt((_33_ + 148))));
                sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 1, 0, (this._loadInt((_33_ + 116))));
                this._storeDouble(((_32_ = this._loadInt((_33_ + 212))) + 72), ((this._loadDouble((_32_ + 72))) + (this._loadDouble(((this._loadInt((_33_ + 196))) + 72)))));
            }
            while (false);
            label$31:
            do {
                label$32:
                do {
                    if ((this._loadInt((_33_ + 64))) != 115) {
                        break label$32;
                    }
                    this._storeInt((_33_ + 112), (this._loadInt((_33_ + 116))));
                    if (((((_35_ = this._loadDouble(((this._loadInt((_33_ + 212))) + 72))) <= (_34_ = this._loadDouble(((this._loadInt((_33_ + 196))) + 72)))) ? 1 : 0) | (((_35_ != _35_) ? 1 : 0) | ((_34_ != _34_) ? 1 : 0))) != 0) {
                        break label$31;
                    }
                    this._storeDouble(((this._loadInt((_33_ + 212))) + 72), (this._loadDouble(((this._loadInt((_33_ + 196))) + 72))));
                    break label$31;
                }
                while (false);
                this._storeInt((_33_ + 112), (sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 26, (this._loadInt((_33_ + 152))), (this._loadInt((_33_ + 72))))));
                sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 2, (this._loadInt((_33_ + 132))), (this._loadInt((_33_ + 124))));
                sqlite3VdbeAddOp1((this._loadInt((_33_ + 192))), 4, (this._loadInt((_33_ + 156))));
                sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 1, 0, (this._loadInt((_33_ + 112))));
            }
            while (false);
            this._storeInt((_33_ + 108), (sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 2, (this._loadInt((_33_ + 132))), (this._loadInt((_33_ + 124))))));
            sqlite3VdbeAddOp1((this._loadInt((_33_ + 192))), 4, (this._loadInt((_33_ + 156))));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 26, (this._loadInt((_33_ + 152))), (this._loadInt((_33_ + 116))));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 1, 0, (this._loadInt((_33_ + 76))));
            label$33:
            do {
                label$34:
                do {
                    if ((this._loadInt((_33_ + 64))) != 113) {
                        break label$34;
                    }
                    this._storeInt((_33_ + 104), (this._loadInt((_33_ + 108))));
                    break label$33;
                }
                while (false);
                label$35:
                do {
                    if ((this._loadInt((_33_ + 64))) != 115) {
                        break label$35;
                    }
                    this._storeInt((_33_ + 104), (this._loadInt((_33_ + 108))));
                    this._storeInt((_33_ + 108), ((this._loadInt((_33_ + 108))) + 1));
                    break label$33;
                }
                while (false);
                this._storeInt((_33_ + 104), (sqlite3VdbeAddOp1((this._loadInt((_33_ + 192))), 4, (this._loadInt((_33_ + 156))))));
                sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 26, (this._loadInt((_33_ + 152))), (this._loadInt((_33_ + 116))));
                sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 1, 0, (this._loadInt((_33_ + 76))));
            }
            while (false);
            this._storeInt((_33_ + 100), (sqlite3VdbeCurrentAddr((this._loadInt((_33_ + 192))))));
            label$36:
            do {
                label$37:
                do {
                    if ((this._loadInt((_33_ + 64))) == 113) {
                        break label$37;
                    }
                    if ((this._loadInt((_33_ + 64))) != 112) {
                        break label$36;
                    }
                }
                while (false);
                sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 2, (this._loadInt((_33_ + 128))), (this._loadInt((_33_ + 120))));
            }
            while (false);
            sqlite3VdbeAddOp1((this._loadInt((_33_ + 192))), 4, (this._loadInt((_33_ + 148))));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 26, (this._loadInt((_33_ + 144))), (this._loadInt((_33_ + 112))));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 1, 0, (this._loadInt((_33_ + 76))));
            sqlite3VdbeJumpHere((this._loadInt((_33_ + 192))), (this._loadInt((_33_ + 68))));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 7, 0, (this._loadInt((_33_ + 152))));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 7, 0, (this._loadInt((_33_ + 144))));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 2, (this._loadInt((_33_ + 156))), (this._loadInt((_33_ + 140))));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 2, (this._loadInt((_33_ + 148))), (this._loadInt((_33_ + 136))));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 26, (this._loadInt((_33_ + 152))), (this._loadInt((_33_ + 116))));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 192))), 26, (this._loadInt((_33_ + 144))), (this._loadInt((_33_ + 112))));
            sqlite3VdbeResolveLabel((this._loadInt((_33_ + 192))), (this._loadInt((_33_ + 76))));
            sqlite3VdbeAddOp4((this._loadInt((_33_ + 192))), 23, 0, 0, 0, (this._loadInt((_33_ + 40))), -15);
            sqlite3VdbeAddOp4((this._loadInt((_33_ + 192))), 24, (this._loadInt((_33_ + 184))), (this._loadInt((_33_ + 168))), (this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 56))), -16);
            sqlite3VdbeAddOp3((this._loadInt((_33_ + 192))), 25, (this._loadInt((_33_ + 108))), (this._loadInt((_33_ + 104))), (this._loadInt((_33_ + 100))));
            label$38:
            do {
                if ((this._loadInt((_33_ + 88))) == 0) {
                    break label$38;
                }
                sqlite3ReleaseTempRange((this._loadInt((_33_ + 216))), (this._loadInt((_33_ + 88))), ((this._loadInt((_33_ + 44))) + 1));
            }
            while (false);
            sqlite3VdbeResolveLabel((this._loadInt((_33_ + 192))), (this._loadInt((_33_ + 72))));
            label$39:
            do {
                if ((this._loadInt8u((this._loadInt((_33_ + 208))))) != 5) {
                    break label$39;
                }
                this._storeInt((_33_ + 4), (this._loadInt((_33_ + 196))));
                label$41:
                do {
                    label$40:
                    while (true) {
                        if ((this._loadInt(((this._loadInt((_33_ + 4))) + 28))) == 0) {
                            break label$41;
                        }
                        this._storeInt((_33_ + 4), (this._loadInt(((this._loadInt((_33_ + 4))) + 28))));
                        continue label$40;
                    }
                }
                while (false);
                generateColumnNames((this._loadInt((_33_ + 216))), 0, (this._loadInt((this._loadInt((_33_ + 4))))));
            }
            while (false);
            label$42:
            do {
                if ((this._loadInt(((this._loadInt((_33_ + 212))) + 28))) == 0) {
                    break label$42;
                }
                sqlite3SelectDelete((this._loadInt((_33_ + 52))), (this._loadInt(((this._loadInt((_33_ + 212))) + 28))));
            }
            while (false);
            this._storeInt(((_32_ = this._loadInt((_33_ + 212))) + 28), (this._loadInt((_33_ + 196))));
            explainComposite((this._loadInt((_33_ + 216))), (this._loadInt8u((_32_ + 4))), (this._loadInt((_33_ + 36))), (this._loadInt((_33_ + 32))), 0);
            this._storeInt((_33_ + 220), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 220));
        this._storeInt((0 + 4), (_33_ + 224));
        return _32_;
    }

    @Override()
    public final void explainComposite(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_35_ + 40), _31_);
        this._storeInt((_35_ + 36), _32_);
        this._storeInt((_35_ + 32), _33_);
        this._storeInt((_35_ + 28), _34_);
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_35_ + 44))) + 484))) != 2) {
                break label$0;
            }
            this._storeInt((_35_ + 24), (this._loadInt(((this._loadInt((_35_ + 44))) + 12))));
            _34_ = this._loadInt((this._loadInt((_35_ + 44))));
            _33_ = this._loadInt((_35_ + 36));
            _32_ = this._loadInt((_35_ + 32));
            _31_ = this._loadInt((_35_ + 28));
            this._storeInt((_35_ + 12), (selectOpName((this._loadInt((_35_ + 40))))));
            _temp$0 = 47744;
            _temp$1 = 21392;
            _temp$2 = (_31_ != 0) ? _temp$0 : _temp$1;
            this._storeInt((_35_ + 8), _temp$2);
            this._storeInt((_35_ + 4), _32_);
            this._storeInt(_35_, _33_);
            _34_ = this._storeInt((_35_ + 20), (sqlite3MPrintf(_34_, 47776, _35_)));
            sqlite3VdbeAddOp4((this._loadInt((_35_ + 24))), 138, (this._loadInt(((this._loadInt((_35_ + 44))) + 552))), 0, 0, _34_, -1);
        }
        while (false);
        this._storeInt((0 + 4), (_35_ + 48));
        return;
    }

    @Override()
    public final int multiSelectCollSeq(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_33_ + 8))) + 28))) == 0) {
                    break label$1;
                }
                this._storeInt(_33_, (multiSelectCollSeq((this._loadInt((_33_ + 12))), (this._loadInt(((this._loadInt((_33_ + 8))) + 28))), (this._loadInt((_33_ + 4))))));
                break label$0;
            }
            while (false);
            this._storeInt(_33_, 0);
        }
        while (false);
        label$2:
        do {
            if ((this._loadInt(_33_)) != 0) {
                break label$2;
            }
            if ((this._loadInt((_33_ + 4))) >= (this._loadInt((this._loadInt((this._loadInt((_33_ + 8)))))))) {
                break label$2;
            }
            this._storeInt(_33_, (sqlite3ExprCollSeq((this._loadInt((_33_ + 12))), (this._loadInt(((this._loadInt(((this._loadInt((this._loadInt((_33_ + 8))))) + 12))) + ((this._loadInt((_33_ + 4))) * 20)))))));
        }
        while (false);
        _32_ = this._loadInt(_33_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int generateOutputSubroutine(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_,
            int _36_,
            int _37_,
            int _38_)
    {
        int _39_ = 0;
        this._storeInt(((_39_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 72), _30_);
        this._storeInt((_39_ + 68), _31_);
        this._storeInt((_39_ + 64), _32_);
        this._storeInt((_39_ + 60), _33_);
        this._storeInt((_39_ + 56), _34_);
        this._storeInt((_39_ + 52), _35_);
        this._storeInt((_39_ + 48), _36_);
        this._storeInt((_39_ + 44), _37_);
        this._storeInt((_39_ + 40), _38_);
        this._storeInt((_39_ + 28), (sqlite3VdbeCurrentAddr((this._storeInt((_39_ + 36), (this._loadInt(((this._loadInt((_39_ + 72))) + 12))))))));
        this._storeInt((_39_ + 32), (sqlite3VdbeMakeLabel((this._loadInt((_39_ + 36))))));
        label$0:
        do {
            if ((this._loadInt((_39_ + 52))) == 0) {
                break label$0;
            }
            this._storeInt((_39_ + 24), (sqlite3VdbeAddOp1((this._loadInt((_39_ + 36))), 27, (this._loadInt((_39_ + 52))))));
            _38_ = this._storeInt((_39_ + 20), (sqlite3VdbeAddOp4((this._loadInt((_39_ + 36))), 24, (this._loadInt(((_38_ = this._loadInt((_39_ + 64))) + 8))), ((this._loadInt((_39_ + 52))) + 1), (this._loadInt((_38_ + 12))), (this._loadInt((_39_ + 48))), (this._loadInt((_39_ + 44))))));
            sqlite3VdbeAddOp3((this._loadInt((_39_ + 36))), 25, (_38_ = _38_ + 2), (this._loadInt((_39_ + 32))), _38_);
            sqlite3VdbeJumpHere((this._loadInt((_39_ + 36))), (this._loadInt((_39_ + 24))));
            sqlite3ExprCodeCopy((this._loadInt((_39_ + 72))), (this._loadInt(((_38_ = this._loadInt((_39_ + 64))) + 8))), ((this._loadInt((_39_ + 52))) + 1), (this._loadInt((_38_ + 12))));
            sqlite3VdbeAddOp2((this._loadInt((_39_ + 36))), 7, 1, (this._loadInt((_39_ + 52))));
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((this._loadInt((_39_ + 72))))) + 30))) == 0) {
                    break label$2;
                }
                this._storeInt((_39_ + 76), 0);
                break label$1;
            }
            while (false);
            codeOffset((this._loadInt((_39_ + 36))), (this._loadInt((_39_ + 68))), (this._loadInt((_39_ + 32))));
            label$3:
            do {
                label$4:
                do {
                    label$5:
                    do {
                        label$6:
                        do {
                            label$7:
                            do {
                                if (((_38_ = (this._loadInt8u((this._loadInt((_39_ + 60))))) + -6) & 4294967295L) > (4 & 4294967295L)) {
                                    break label$7;
                                }
                                label$8:
                                do {
                                    switch (_38_) {
                                        case 0: {
                                            break label$6;
                                        }
                                        case 1: {
                                            break label$5;
                                        }
                                        case 2:
                                        case 3: {
                                            break label$8;
                                        }
                                        case 4: {
                                            break label$4;
                                        }
                                        default: {
                                            break label$6;
                                        }
                                    }
                                }
                                while (false);
                                this._storeInt((_39_ + 16), (sqlite3GetTempReg((this._loadInt((_39_ + 72))))));
                                this._storeInt((_39_ + 12), (sqlite3GetTempReg((this._loadInt((_39_ + 72))))));
                                sqlite3VdbeAddOp3((this._loadInt((_39_ + 36))), 30, (this._loadInt(((_38_ = this._loadInt((_39_ + 64))) + 8))), (this._loadInt((_38_ + 12))), (this._loadInt((_39_ + 16))));
                                sqlite3VdbeAddOp2((this._loadInt((_39_ + 36))), 54, (this._loadInt(((this._loadInt((_39_ + 60))) + 4))), (this._loadInt((_39_ + 12))));
                                sqlite3VdbeAddOp3((this._loadInt((_39_ + 36))), 55, (this._loadInt(((this._loadInt((_39_ + 60))) + 4))), (this._loadInt((_39_ + 16))), (this._loadInt((_39_ + 12))));
                                sqlite3VdbeChangeP5((this._loadInt((_39_ + 36))), 8);
                                sqlite3ReleaseTempReg((this._loadInt((_39_ + 72))), (this._loadInt((_39_ + 12))));
                                sqlite3ReleaseTempReg((this._loadInt((_39_ + 72))), (this._loadInt((_39_ + 16))));
                                break label$3;
                            }
                            while (false);
                            sqlite3VdbeAddOp2((this._loadInt((_39_ + 36))), 16, (this._loadInt(((_38_ = this._loadInt((_39_ + 64))) + 8))), (this._loadInt((_38_ + 12))));
                            sqlite3ExprCacheAffinityChange((this._loadInt((_39_ + 72))), (this._loadInt(((_38_ = this._loadInt((_39_ + 64))) + 8))), (this._loadInt((_38_ + 12))));
                            break label$3;
                        }
                        while (false);
                        sqlite3ExprCodeMove((this._loadInt((_39_ + 72))), (this._loadInt(((this._loadInt((_39_ + 64))) + 8))), (this._loadInt(((this._loadInt((_39_ + 60))) + 4))), 1);
                        break label$3;
                    }
                    while (false);
                    _38_ = sqlite3CompareAffinity((this._loadInt((this._loadInt(((this._loadInt((this._loadInt((_39_ + 68))))) + 12))))), (this._loadInt8s(((this._loadInt((_39_ + 60))) + 1))));
                    this._storeInt8(((this._loadInt((_39_ + 68))) + 5), _38_);
                    _38_ = this._storeInt((_39_ + 8), (sqlite3GetTempReg((this._loadInt((_39_ + 72))))));
                    sqlite3VdbeAddOp4((this._loadInt((_39_ + 36))), 30, (this._loadInt(((this._loadInt((_39_ + 64))) + 8))), 1, _38_, ((this._loadInt((_39_ + 68))) + 5), 1);
                    sqlite3ExprCacheAffinityChange((this._loadInt((_39_ + 72))), (this._loadInt(((this._loadInt((_39_ + 64))) + 8))), 1);
                    sqlite3VdbeAddOp2((this._loadInt((_39_ + 36))), 70, (this._loadInt(((this._loadInt((_39_ + 60))) + 4))), (this._loadInt((_39_ + 8))));
                    sqlite3ReleaseTempReg((this._loadInt((_39_ + 72))), (this._loadInt((_39_ + 8))));
                    break label$3;
                }
                while (false);
                label$9:
                do {
                    if ((this._loadInt(((this._loadInt((_39_ + 60))) + 8))) != 0) {
                        break label$9;
                    }
                    _38_ = sqlite3GetTempRange((this._loadInt((_39_ + 72))), (this._loadInt(((this._loadInt((_39_ + 64))) + 12))));
                    this._storeInt(((_37_ = this._loadInt((_39_ + 60))) + 8), _38_);
                    this._storeInt((_37_ + 12), (this._loadInt(((this._loadInt((_39_ + 64))) + 12))));
                }
                while (false);
                sqlite3ExprCodeMove((this._loadInt((_39_ + 72))), (this._loadInt(((this._loadInt((_39_ + 64))) + 8))), (this._loadInt(((_38_ = this._loadInt((_39_ + 60))) + 8))), (this._loadInt((_38_ + 12))));
                sqlite3VdbeAddOp1((this._loadInt((_39_ + 36))), 4, (this._loadInt(((this._loadInt((_39_ + 60))) + 4))));
            }
            while (false);
            label$10:
            do {
                if ((this._loadInt(((this._loadInt((_39_ + 68))) + 48))) == 0) {
                    break label$10;
                }
                sqlite3VdbeAddOp3((this._loadInt((_39_ + 36))), 115, (this._loadInt(((this._loadInt((_39_ + 68))) + 48))), (this._loadInt((_39_ + 40))), -1);
            }
            while (false);
            sqlite3VdbeResolveLabel((this._loadInt((_39_ + 36))), (this._loadInt((_39_ + 32))));
            sqlite3VdbeAddOp1((this._loadInt((_39_ + 36))), 3, (this._loadInt((_39_ + 56))));
            this._storeInt((_39_ + 76), (this._loadInt((_39_ + 28))));
        }
        while (false);
        _38_ = this._loadInt((_39_ + 76));
        this._storeInt((0 + 4), (_39_ + 80));
        return _38_;
    }

    @Override()
    public final void sqlite3ExprCodeCopy(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        label$0:
        do {
            if ((this._loadInt((_34_ + 24))) == (this._loadInt((_34_ + 20)))) {
                break label$0;
            }
            this._storeInt((_34_ + 12), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_34_ + 12))) >= (this._loadInt((_34_ + 16)))) {
                        break label$2;
                    }
                    sqlite3VdbeAddOp2((this._loadInt(((this._loadInt((_34_ + 28))) + 12))), 14, ((this._loadInt((_34_ + 24))) + (_33_ = this._loadInt((_34_ + 12)))), ((this._loadInt((_34_ + 20))) + _33_));
                    this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 12))) + 1));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final void substExprList(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        label$0:
        do {
            if ((this._loadInt((_34_ + 24))) == 0) {
                break label$0;
            }
            this._storeInt((_34_ + 12), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_34_ + 12))) >= (this._loadInt((this._loadInt((_34_ + 24)))))) {
                        break label$2;
                    }
                    _33_ = substExpr((this._loadInt((_34_ + 28))), (this._loadInt(((this._loadInt(((this._loadInt((_34_ + 24))) + 12))) + ((this._loadInt((_34_ + 12))) * 20)))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 16))));
                    this._storeInt(((this._loadInt(((this._loadInt((_34_ + 24))) + 12))) + ((_32_ = this._loadInt((_34_ + 12))) * 20)), _33_);
                    this._storeInt((_34_ + 12), (_32_ + 1));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final int substExpr(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_34_ + 20), _31_);
        this._storeInt((_34_ + 16), _32_);
        this._storeInt((_34_ + 12), _33_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        label$4:
                        do {
                            if ((this._loadInt((_34_ + 20))) == 0) {
                                break label$4;
                            }
                            label$5:
                            do {
                                if ((this._loadInt8u((this._loadInt((_34_ + 20))))) != 152) {
                                    break label$5;
                                }
                                if ((this._loadInt(((this._loadInt((_34_ + 20))) + 24))) != (this._loadInt((_34_ + 16)))) {
                                    break label$5;
                                }
                                if ((this._loadInt16s(((this._loadInt((_34_ + 20))) + 28))) <= -1) {
                                    break label$2;
                                }
                                label$6:
                                do {
                                    if ((this._storeInt((_34_ + 8), (sqlite3ExprDup((this._loadInt((_34_ + 24))), (this._loadInt(((this._loadInt(((this._loadInt((_34_ + 12))) + 12))) + ((this._loadInt16s(((this._loadInt((_34_ + 20))) + 28))) * 20)))), 0)))) == 0) {
                                        break label$6;
                                    }
                                    if ((this._loadInt(((this._loadInt((_34_ + 20))) + 20))) == 0) {
                                        break label$6;
                                    }
                                    this._storeInt(((this._loadInt((_34_ + 8))) + 20), (this._loadInt(((this._loadInt((_34_ + 20))) + 20))));
                                }
                                while (false);
                                sqlite3ExprDelete((this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))));
                                this._storeInt((_34_ + 20), (this._loadInt((_34_ + 8))));
                                break label$1;
                            }
                            while (false);
                            _33_ = substExpr((this._loadInt((_34_ + 24))), (this._loadInt(((this._loadInt((_34_ + 20))) + 8))), (this._loadInt((_34_ + 16))), (this._loadInt((_34_ + 12))));
                            this._storeInt(((_32_ = this._loadInt((_34_ + 20))) + 8), _33_);
                            _33_ = substExpr((this._loadInt((_34_ + 24))), (this._loadInt((_32_ + 12))), (this._loadInt((_34_ + 16))), (this._loadInt((_34_ + 12))));
                            this._storeInt(((_32_ = this._loadInt((_34_ + 20))) + 12), _33_);
                            if (((this._loadInt16u((_32_ + 2))) & 2048) == 0) {
                                break label$3;
                            }
                            substSelect((this._loadInt((_34_ + 24))), (this._loadInt(((this._loadInt((_34_ + 20))) + 16))), (this._loadInt((_34_ + 16))), (this._loadInt((_34_ + 12))));
                            break label$1;
                        }
                        while (false);
                        this._storeInt((_34_ + 28), 0);
                        break label$0;
                    }
                    while (false);
                    substExprList((this._loadInt((_34_ + 24))), (this._loadInt(((this._loadInt((_34_ + 20))) + 16))), (this._loadInt((_34_ + 16))), (this._loadInt((_34_ + 12))));
                    break label$1;
                }
                while (false);
                this._storeInt8((this._loadInt((_34_ + 20))), 98);
            }
            while (false);
            this._storeInt((_34_ + 28), (this._loadInt((_34_ + 20))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 28));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }
}
