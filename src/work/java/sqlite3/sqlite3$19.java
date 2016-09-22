package sqlite3;

abstract class sqlite3$19
        extends sqlite3$18
{
    protected sqlite3$19(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final void sqlite3ExprCachePop(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt(((_30_ = this._loadInt((_32_ + 12))) + 84), ((this._loadInt((_30_ + 84))) - _31_));
        _31_ = this._storeInt((_32_ + 4), 0);
        this._storeInt(_32_, ((this._loadInt((_32_ + 12))) + 96));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 4))) > 9) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt(((this._loadInt(_32_)) + 16))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt(((this._loadInt(_32_)) + 12))) <= (this._loadInt(((this._loadInt((_32_ + 12))) + 84)))) {
                        break label$2;
                    }
                    cacheEntryClear((this._loadInt((_32_ + 12))), (this._loadInt(_32_)));
                    this._storeInt(((this._loadInt(_32_)) + 16), _31_);
                }
                while (false);
                this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                this._storeInt(_32_, ((this._loadInt(_32_)) + 24));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int sqlite3ExprCodeExprList(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_34_ + 40), _31_);
        this._storeInt((_34_ + 36), _32_);
        this._storeInt((_34_ + 32), _33_);
        this._storeInt((_34_ + 20), (this._loadInt((this._loadInt((_34_ + 40))))));
        this._storeInt((_34_ + 28), (this._loadInt(((this._loadInt((_34_ + 40))) + 12))));
        this._storeInt((_34_ + 24), 0);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_34_ + 24))) >= (this._loadInt((_34_ + 20)))) {
                    break label$1;
                }
                _33_ = this._storeInt((_34_ + 16), (this._loadInt((this._loadInt((_34_ + 28))))));
                label$2:
                do {
                    if ((this._storeInt((_34_ + 12), (sqlite3ExprCodeTarget((this._loadInt((_34_ + 44))), _33_, ((this._loadInt((_34_ + 36))) + (this._loadInt((_34_ + 24)))))))) == ((this._loadInt((_34_ + 36))) + (this._loadInt((_34_ + 24))))) {
                        break label$2;
                    }
                    _temp$0 = 14;
                    _temp$1 = 15;
                    _temp$2 = ((this._loadInt((_34_ + 32))) != 0) ? _temp$0 : _temp$1;
                    sqlite3VdbeAddOp2((this._loadInt(((this._loadInt((_34_ + 44))) + 12))), _temp$2, (this._loadInt((_34_ + 12))), ((this._loadInt((_34_ + 36))) + (this._loadInt((_34_ + 24)))));
                }
                while (false);
                this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + 1));
                this._storeInt((_34_ + 28), ((this._loadInt((_34_ + 28))) + 20));
                continue label$0;
            }
        }
        while (false);
        _33_ = this._loadInt((_34_ + 20));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int sqlite3VtabOverloadFunction(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_34_ + 52), _31_);
        this._storeInt((_34_ + 48), _32_);
        this._storeInt((_34_ + 44), _33_);
        this._storeInt((_34_ + 16), (this._storeInt((_34_ + 24), (this._storeInt((_34_ + 28), 0)))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_34_ + 44))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt8u((this._loadInt((_34_ + 44))))) == 152) {
                        break label$1;
                    }
                    this._storeInt((_34_ + 60), (this._loadInt((_34_ + 52))));
                    break label$0;
                }
                while (false);
                this._storeInt((_34_ + 60), (this._loadInt((_34_ + 52))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if ((this._storeInt((_34_ + 40), (this._loadInt(((this._loadInt((_34_ + 44))) + 40))))) == 0) {
                        break label$4;
                    }
                    if (((this._loadInt8u(((this._loadInt((_34_ + 40))) + 34))) & 16) != 0) {
                        break label$3;
                    }
                    this._storeInt((_34_ + 60), (this._loadInt((_34_ + 52))));
                    break label$0;
                }
                while (false);
                this._storeInt((_34_ + 60), (this._loadInt((_34_ + 52))));
                break label$0;
            }
            while (false);
            label$5:
            do {
                label$6:
                do {
                    label$7:
                    do {
                        if ((this._loadInt(((this._storeInt((_34_ + 32), (this._loadInt((this._storeInt((_34_ + 36), (this._loadInt(((sqlite3GetVTable((this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 40))))) + 8))))))))) + 72))) == 0) {
                            break label$7;
                        }
                        label$8:
                        do {
                            if ((this._storeInt((_34_ + 12), (sqlite3DbStrDup((this._loadInt((_34_ + 56))), (this._loadInt(((this._loadInt((_34_ + 52))) + 24))))))) == 0) {
                                break label$8;
                            }
                            this._storeInt((_34_ + 8), (this._loadInt((_34_ + 12))));
                            label$10:
                            do {
                                label$9:
                                while (true) {
                                    if ((this._loadInt8u((this._loadInt((_34_ + 8))))) == 0) {
                                        break label$10;
                                    }
                                    this._storeInt8((_33_ = this._loadInt((_34_ + 8))), (this._loadInt8u(((this._loadInt8u(_33_)) + 19872))));
                                    this._storeInt((_34_ + 8), (_33_ + 1));
                                    continue label$9;
                                }
                            }
                            while (false);
                            _33_ = this._loadInt((_34_ + 12));
                            _32_ = this._loadInt((_34_ + 48));
                            _31_ = this._loadInt((_34_ + 36));
                            _30_ = this._loadInt((_34_ + 32));
                            this._storeInt((_34_ + 4), (_34_ + 28));
                            this._storeInt((_34_ + 16), (this._iiiiiiTable[this._tableIndices[this._loadInt((_30_ + 72))]].invoke(_31_, _32_, _33_, (_34_ + 28), (_34_ + 24))));
                            sqlite3DbFree((this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 12))));
                        }
                        while (false);
                        if ((this._loadInt((_34_ + 16))) == 0) {
                            break label$6;
                        }
                        if ((this._storeInt((_34_ + 20), (sqlite3DbMallocZero((this._loadInt((_34_ + 56))), ((sqlite3Strlen30((this._loadInt(((this._loadInt((_34_ + 52))) + 24))))) + 37))))) == 0) {
                            break label$5;
                        }
                        memcpy((this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 52))), 36);
                        memcpy((this._storeInt(((_33_ = this._loadInt((_34_ + 20))) + 24), (_33_ + 36))), (_33_ = this._loadInt(((this._loadInt((_34_ + 52))) + 24))), ((sqlite3Strlen30(_33_)) + 1));
                        this._storeInt(((_33_ = this._loadInt((_34_ + 20))) + 4), (this._loadInt((_34_ + 24))));
                        this._storeInt((_33_ + 12), (this._loadInt((_34_ + 28))));
                        this._storeInt8(((_33_ = this._loadInt((_34_ + 20))) + 3), ((this._loadInt8u((_33_ + 3))) | 4));
                        this._storeInt((_34_ + 60), (this._loadInt((_34_ + 20))));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_34_ + 60), (this._loadInt((_34_ + 52))));
                    break label$0;
                }
                while (false);
                this._storeInt((_34_ + 60), (this._loadInt((_34_ + 52))));
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 60), (this._loadInt((_34_ + 52))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 60));
        this._storeInt((0 + 4), (_34_ + 64));
        return _33_;
    }

    @Override()
    public final int sqlite3ExprIsConstant(int _30_)
    {
        int _31_ = 0;
        _30_ = exprIsConst((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 1);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3CodeSubselect(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        int _temp$3 = 0;
        int _temp$4 = 0;
        int _temp$5 = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 160))) + 152), _30_);
        this._storeInt((_34_ + 148), _31_);
        this._storeInt((_34_ + 144), _32_);
        this._storeInt((_34_ + 140), _33_);
        _33_ = this._storeInt((_34_ + 132), (this._storeInt((_34_ + 136), 0)));
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
                                label$6:
                                do {
                                    label$7:
                                    do {
                                        label$8:
                                        do {
                                            label$9:
                                            do {
                                                if ((this._storeInt((_34_ + 128), (sqlite3GetVdbe((this._loadInt((_34_ + 152))))))) == 0) {
                                                    break label$9;
                                                }
                                                sqlite3ExprCachePush((this._loadInt((_34_ + 152))));
                                                label$10:
                                                do {
                                                    if (((this._loadInt16u(((this._loadInt((_34_ + 148))) + 2))) & 32) != 0) {
                                                        break label$10;
                                                    }
                                                    if ((this._loadInt(((this._loadInt((_34_ + 152))) + 428))) != 0) {
                                                        break label$10;
                                                    }
                                                    _33_ = this._storeInt((_34_ + 124), (this._storeInt(((_33_ = this._loadInt((_34_ + 152))) + 72), ((this._loadInt((_33_ + 72))) + 1))));
                                                    sqlite3VdbeAddOp1((this._loadInt((_34_ + 128))), 26, _33_);
                                                    this._storeInt((_34_ + 136), (sqlite3VdbeAddOp2((this._loadInt((_34_ + 128))), 7, 1, (this._loadInt((_34_ + 124))))));
                                                }
                                                while (false);
                                                label$11:
                                                do {
                                                    if ((this._loadInt8u(((this._loadInt((_34_ + 152))) + 484))) != 2) {
                                                        break label$11;
                                                    }
                                                    _32_ = this._loadInt((_33_ = this._loadInt((_34_ + 152))));
                                                    _31_ = this._loadInt8u((this._loadInt((_34_ + 148))));
                                                    this._storeInt((_34_ + 8), (this._loadInt((_33_ + 556))));
                                                    _temp$0 = 21392;
                                                    _temp$1 = 41872;
                                                    _temp$2 = ((this._loadInt((_34_ + 136))) != 0) ? _temp$0 : _temp$1;
                                                    this._storeInt(_34_, _temp$2);
                                                    _temp$3 = 41888;
                                                    _temp$4 = 41904;
                                                    _temp$5 = (_31_ == 72) ? _temp$3 : _temp$4;
                                                    this._storeInt((_34_ + 4), _temp$5);
                                                    _33_ = this._storeInt((_34_ + 120), (sqlite3MPrintf(_32_, 41920, _34_)));
                                                    sqlite3VdbeAddOp4((this._loadInt((_34_ + 128))), 138, (this._loadInt(((this._loadInt((_34_ + 152))) + 552))), 0, 0, _33_, -1);
                                                }
                                                while (false);
                                                if ((this._loadInt8u((this._loadInt((_34_ + 148))))) != 72) {
                                                    break label$8;
                                                }
                                                this._storeInt((_34_ + 88), (this._loadInt(((this._loadInt((_34_ + 148))) + 8))));
                                                label$12:
                                                do {
                                                    if ((this._loadInt((_34_ + 144))) == 0) {
                                                        break label$12;
                                                    }
                                                    sqlite3VdbeAddOp2((this._loadInt((_34_ + 128))), 10, 0, (this._loadInt((_34_ + 144))));
                                                }
                                                while (false);
                                                this._storeInt8((_34_ + 119), (sqlite3ExprAffinity((this._loadInt((_34_ + 88))))));
                                                this._storeInt(((_33_ = this._loadInt((_34_ + 152))) + 68), ((_33_ = this._loadInt((_33_ + 68))) + 1));
                                                this._storeInt(((_32_ = this._loadInt((_34_ + 148))) + 24), _33_);
                                                this._storeInt((_34_ + 92), (sqlite3VdbeAddOp2((this._loadInt((_34_ + 128))), 41, (this._loadInt((_32_ + 24))), (((this._loadInt((_34_ + 140))) == 0) ? 1 : 0))));
                                                label$13:
                                                do {
                                                    if ((this._loadInt((_34_ + 144))) != 0) {
                                                        break label$13;
                                                    }
                                                    sqlite3VdbeChangeP5((this._loadInt((_34_ + 128))), 16);
                                                }
                                                while (false);
                                                memset((_34_ + 96), 0, 16);
                                                this._storeInt16((_34_ + 102), 1);
                                                if (((this._loadInt16u(((this._loadInt((_34_ + 148))) + 2))) & 2048) == 0) {
                                                    break label$7;
                                                }
                                                sqlite3SelectDestInit((_34_ + 72), 7, (this._loadInt(((this._loadInt((_34_ + 148))) + 24))));
                                                this._storeInt(((this._loadInt(((_33_ = this._loadInt((_34_ + 148))) + 16))) + 48), 0);
                                                this._storeInt8((_34_ + 73), (this._loadInt8u((_34_ + 119))));
                                                if ((sqlite3Select((this._loadInt((_34_ + 152))), (this._loadInt((_33_ + 16))), (_34_ + 72))) == 0) {
                                                    break label$3;
                                                }
                                                this._storeInt((_34_ + 156), 0);
                                                break label$0;
                                            }
                                            while (false);
                                            this._storeInt((_34_ + 156), _33_);
                                            break label$0;
                                        }
                                        while (false);
                                        this._storeInt((_34_ + 32), (this._loadInt(((this._loadInt((_34_ + 148))) + 16))));
                                        sqlite3SelectDestInit((_34_ + 16), 0, (this._storeInt(((_33_ = this._loadInt((_34_ + 152))) + 72), ((this._loadInt((_33_ + 72))) + 1))));
                                        if ((this._loadInt8u((this._loadInt((_34_ + 148))))) != 116) {
                                            break label$6;
                                        }
                                        this._storeInt8((_34_ + 16), 6);
                                        sqlite3VdbeAddOp2((this._loadInt((_34_ + 128))), 10, 0, (this._loadInt((_34_ + 20))));
                                        break label$5;
                                    }
                                    while (false);
                                    if ((this._loadInt(((this._loadInt((_34_ + 148))) + 16))) == 0) {
                                        break label$2;
                                    }
                                    this._storeInt((_34_ + 60), (this._loadInt(((this._loadInt((_34_ + 148))) + 16))));
                                    label$14:
                                    do {
                                        if ((this._loadInt8u((_34_ + 119))) != 0) {
                                            break label$14;
                                        }
                                        this._storeInt8((_34_ + 119), 98);
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 108), (sqlite3ExprCollSeq((this._loadInt((_34_ + 152))), (this._loadInt(((this._loadInt((_34_ + 148))) + 8))))));
                                    this._storeInt((_34_ + 52), (sqlite3GetTempReg((this._loadInt((_34_ + 152))))));
                                    _33_ = this._storeInt((_34_ + 48), (sqlite3GetTempReg((this._loadInt((_34_ + 152))))));
                                    sqlite3VdbeAddOp2((this._loadInt((_34_ + 128))), 10, 0, _33_);
                                    this._storeInt((_34_ + 64), (this._loadInt((this._loadInt((_34_ + 60))))));
                                    this._storeInt((_34_ + 56), (this._loadInt(((this._loadInt((_34_ + 60))) + 12))));
                                    label$15:
                                    while (true) {
                                        if ((this._loadInt((_34_ + 64))) < 1) {
                                            break label$4;
                                        }
                                        this._storeInt((_34_ + 40), (this._loadInt((this._loadInt((_34_ + 56))))));
                                        label$17:
                                        do {
                                            if ((this._loadInt((_34_ + 136))) == 0) {
                                                break label$17;
                                            }
                                            if ((sqlite3ExprIsConstant((this._loadInt((_34_ + 40))))) != 0) {
                                                break label$17;
                                            }
                                            sqlite3VdbeChangeToNoop((this._loadInt((_34_ + 128))), ((this._loadInt((_34_ + 136))) + -1), 2);
                                            this._storeInt((_34_ + 136), 0);
                                        }
                                        while (false);
                                        label$18:
                                        do {
                                            label$19:
                                            do {
                                                if ((this._loadInt((_34_ + 140))) == 0) {
                                                    break label$19;
                                                }
                                                if ((sqlite3ExprIsInteger((this._loadInt((_34_ + 40))), (_34_ + 36))) == 0) {
                                                    break label$19;
                                                }
                                                sqlite3VdbeAddOp3((this._loadInt((_34_ + 128))), 56, (this._loadInt(((this._loadInt((_34_ + 148))) + 24))), (this._loadInt((_34_ + 48))), (this._loadInt((_34_ + 36))));
                                                break label$18;
                                            }
                                            while (false);
                                            this._storeInt((_34_ + 44), (sqlite3ExprCodeTarget((this._loadInt((_34_ + 152))), (this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 52))))));
                                            label$20:
                                            do {
                                                if ((this._loadInt((_34_ + 140))) == 0) {
                                                    break label$20;
                                                }
                                                sqlite3VdbeAddOp2((_33_ = this._loadInt((_34_ + 128))), 21, (this._loadInt((_34_ + 44))), ((sqlite3VdbeCurrentAddr(_33_)) + 2));
                                                sqlite3VdbeAddOp3((this._loadInt((_34_ + 128))), 55, (this._loadInt(((this._loadInt((_34_ + 148))) + 24))), (this._loadInt((_34_ + 48))), (this._loadInt((_34_ + 44))));
                                                break label$18;
                                            }
                                            while (false);
                                            sqlite3VdbeAddOp4((this._loadInt((_34_ + 128))), 30, (this._loadInt((_34_ + 44))), 1, (this._loadInt((_34_ + 48))), (_34_ + 119), 1);
                                            sqlite3ExprCacheAffinityChange((this._loadInt((_34_ + 152))), (this._loadInt((_34_ + 44))), 1);
                                            sqlite3VdbeAddOp2((this._loadInt((_34_ + 128))), 70, (this._loadInt(((this._loadInt((_34_ + 148))) + 24))), (this._loadInt((_34_ + 48))));
                                        }
                                        while (false);
                                        this._storeInt((_34_ + 64), ((this._loadInt((_34_ + 64))) + -1));
                                        this._storeInt((_34_ + 56), ((this._loadInt((_34_ + 56))) + 20));
                                        continue label$15;
                                    }
                                }
                                while (false);
                                this._storeInt8((_34_ + 16), 3);
                                sqlite3VdbeAddOp2((this._loadInt((_34_ + 128))), 7, 0, (this._loadInt((_34_ + 20))));
                            }
                            while (false);
                            sqlite3ExprDelete((this._loadInt((this._loadInt((_34_ + 152))))), (this._loadInt(((this._loadInt((_34_ + 32))) + 40))));
                            _32_ = sqlite3PExpr((this._loadInt((_34_ + 152))), 129, 0, 0, 33512);
                            _31_ = this._storeInt(((_33_ = this._loadInt((_34_ + 32))) + 48), 0);
                            this._storeInt((_33_ + 40), _32_);
                            label$21:
                            do {
                                if ((sqlite3Select((this._loadInt((_34_ + 152))), _33_, (_34_ + 16))) == 0) {
                                    break label$21;
                                }
                                this._storeInt((_34_ + 156), _31_);
                                break label$0;
                            }
                            while (false);
                            this._storeInt((_34_ + 132), (this._loadInt((_34_ + 20))));
                            break label$1;
                        }
                        while (false);
                        sqlite3ReleaseTempReg((this._loadInt((_34_ + 152))), (this._loadInt((_34_ + 52))));
                        sqlite3ReleaseTempReg((this._loadInt((_34_ + 152))), (this._loadInt((_34_ + 48))));
                        break label$2;
                    }
                    while (false);
                    if ((this._storeInt((_34_ + 68), (this._loadInt((this._loadInt(((this._loadInt((_34_ + 148))) + 16))))))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt((this._loadInt((_34_ + 68))))) < 1) {
                        break label$2;
                    }
                    this._storeInt((_34_ + 108), (sqlite3BinaryCompareCollSeq((this._loadInt((_34_ + 152))), (this._loadInt(((this._loadInt((_34_ + 148))) + 8))), (this._loadInt((this._loadInt(((this._loadInt((_34_ + 68))) + 12))))))));
                }
                while (false);
                if ((this._loadInt((_34_ + 140))) != 0) {
                    break label$1;
                }
                sqlite3VdbeChangeP4((this._loadInt((_34_ + 128))), (this._loadInt((_34_ + 92))), (_34_ + 96), -6);
            }
            while (false);
            label$22:
            do {
                if ((this._loadInt((_34_ + 136))) == 0) {
                    break label$22;
                }
                sqlite3VdbeJumpHere((this._loadInt((_34_ + 128))), ((this._loadInt((_34_ + 136))) + -1));
            }
            while (false);
            sqlite3ExprCachePop((this._loadInt((_34_ + 152))), 1);
            this._storeInt((_34_ + 156), (this._loadInt((_34_ + 132))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 156));
        this._storeInt((0 + 4), (_34_ + 160));
        return _33_;
    }

    @Override()
    public final void sqlite3ExprCodeIN(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_34_ + 56), _31_);
        this._storeInt((_34_ + 52), _32_);
        this._storeInt((_34_ + 48), _33_);
        _32_ = this._storeInt((_34_ + 44), 0);
        this._storeInt((_34_ + 28), (this._loadInt(((this._loadInt((_34_ + 60))) + 12))));
        this._storeInt((_34_ + 36), (sqlite3FindInIndex((this._loadInt((_34_ + 60))), (this._loadInt((_34_ + 56))), (_34_ + 44))));
        this._storeInt8((_34_ + 43), (comparisonAffinity((this._loadInt((_34_ + 56))))));
        sqlite3ExprCachePush((this._loadInt((_34_ + 60))));
        _33_ = this._storeInt((_34_ + 32), (sqlite3GetTempReg((this._loadInt((_34_ + 60))))));
        sqlite3ExprCode((this._loadInt((_34_ + 60))), (this._loadInt(((this._loadInt((_34_ + 56))) + 8))), _33_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_34_ + 48))) != (this._loadInt((_34_ + 52)))) {
                    break label$1;
                }
                sqlite3VdbeAddOp2((this._loadInt((_34_ + 28))), 73, (this._loadInt((_34_ + 32))), (this._loadInt((_34_ + 48))));
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 24), (sqlite3VdbeAddOp1((this._loadInt((_34_ + 28))), 74, (this._loadInt((_34_ + 32))))));
            sqlite3VdbeAddOp2((this._loadInt((_34_ + 28))), 65, (this._loadInt(((this._loadInt((_34_ + 56))) + 24))), (this._loadInt((_34_ + 52))));
            sqlite3VdbeAddOp2((this._loadInt((_34_ + 28))), 1, _32_, (this._loadInt((_34_ + 48))));
            sqlite3VdbeJumpHere((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 24))));
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                if ((this._loadInt((_34_ + 36))) != 1) {
                    break label$3;
                }
                sqlite3VdbeAddOp2((this._loadInt((_34_ + 28))), 21, (this._loadInt((_34_ + 32))), (this._loadInt((_34_ + 52))));
                sqlite3VdbeAddOp3((this._loadInt((_34_ + 28))), 52, (this._loadInt(((this._loadInt((_34_ + 56))) + 24))), (this._loadInt((_34_ + 52))), (this._loadInt((_34_ + 32))));
                break label$2;
            }
            while (false);
            sqlite3VdbeAddOp4((this._loadInt((_34_ + 28))), 29, (this._loadInt((_34_ + 32))), 1, 0, (_34_ + 43), 1);
            label$4:
            do {
                label$5:
                do {
                    if ((this._loadInt((_34_ + 44))) == 0) {
                        break label$5;
                    }
                    if ((this._loadInt((_34_ + 52))) != (this._loadInt((_34_ + 48)))) {
                        break label$4;
                    }
                }
                while (false);
                sqlite3VdbeAddOp4Int((this._loadInt((_34_ + 28))), 49, (this._loadInt(((this._loadInt((_34_ + 56))) + 24))), (this._loadInt((_34_ + 52))), (this._loadInt((_34_ + 32))), 1);
                break label$2;
            }
            while (false);
            this._storeInt((_34_ + 20), (sqlite3VdbeAddOp4Int((this._loadInt((_34_ + 28))), 50, (this._loadInt(((this._loadInt((_34_ + 56))) + 24))), 0, (this._loadInt((_34_ + 32))), 1)));
            this._storeInt((_34_ + 16), (sqlite3VdbeAddOp1((this._loadInt((_34_ + 28))), 74, (this._loadInt((_34_ + 44))))));
            this._storeInt((_34_ + 12), (sqlite3VdbeAddOp4Int((this._loadInt((_34_ + 28))), 50, (this._loadInt(((this._loadInt((_34_ + 56))) + 24))), 0, (this._loadInt((_34_ + 44))), 1)));
            sqlite3VdbeAddOp2((this._loadInt((_34_ + 28))), 7, -1, (this._loadInt((_34_ + 44))));
            sqlite3VdbeJumpHere((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 12))));
            sqlite3VdbeAddOp2((this._loadInt((_34_ + 28))), 20, (this._loadInt((_34_ + 44))), 1);
            sqlite3VdbeJumpHere((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 16))));
            sqlite3VdbeAddOp2((this._loadInt((_34_ + 28))), 26, (this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 48))));
            sqlite3VdbeAddOp2((this._loadInt((_34_ + 28))), 1, 0, (this._loadInt((_34_ + 52))));
            sqlite3VdbeJumpHere((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 20))));
        }
        while (false);
        sqlite3ReleaseTempReg((this._loadInt((_34_ + 60))), (this._loadInt((_34_ + 32))));
        sqlite3ExprCachePop((this._loadInt((_34_ + 60))), 1);
        this._storeInt((0 + 4), (_34_ + 64));
        return;
    }

    @Override()
    public final void sqlite3ExprIfFalse(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_34_ + 40), _31_);
        this._storeInt((_34_ + 36), _32_);
        this._storeInt((_34_ + 32), _33_);
        this._storeInt((_34_ + 28), (this._loadInt(((this._loadInt((_34_ + 44))) + 12))));
        this._storeInt((_34_ + 16), (this._storeInt((_34_ + 20), (this._storeInt((_34_ + 24), 0)))));
        label$0:
        do {
            if ((this._loadInt((_34_ + 28))) == 0) {
                break label$0;
            }
            if ((this._loadInt((_34_ + 40))) == 0) {
                break label$0;
            }
            this._storeInt((_34_ + 24), ((((this._loadInt8u((this._loadInt((_34_ + 40))))) + 1) ^ 1) + -1));
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
                                label$6:
                                do {
                                    if (((_33_ = (this._loadInt8u((this._loadInt((_34_ + 40))))) + -19) & 4294967295L) > (127 & 4294967295L)) {
                                        break label$6;
                                    }
                                    label$7:
                                    do {
                                        label$8:
                                        do {
                                            label$9:
                                            do {
                                                label$10:
                                                do {
                                                    switch (_33_) {
                                                        case 0: {
                                                            break label$7;
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
                                                        case 35:
                                                        case 36:
                                                        case 37:
                                                        case 38:
                                                        case 39:
                                                        case 40:
                                                        case 41:
                                                        case 42:
                                                        case 43:
                                                        case 44:
                                                        case 45:
                                                        case 46:
                                                        case 47:
                                                        case 48:
                                                        case 62:
                                                        case 63:
                                                        case 64:
                                                        case 65:
                                                        case 66:
                                                        case 67:
                                                        case 68:
                                                        case 69:
                                                        case 70:
                                                        case 71:
                                                        case 72:
                                                        case 73:
                                                        case 74:
                                                        case 75:
                                                        case 76:
                                                        case 77:
                                                        case 78:
                                                        case 79:
                                                        case 80:
                                                        case 81:
                                                        case 82:
                                                        case 83:
                                                        case 84:
                                                        case 85:
                                                        case 86:
                                                        case 87:
                                                        case 88:
                                                        case 89:
                                                        case 90:
                                                        case 91:
                                                        case 92:
                                                        case 93:
                                                        case 94:
                                                        case 95:
                                                        case 96:
                                                        case 97:
                                                        case 98:
                                                        case 99:
                                                        case 100:
                                                        case 101:
                                                        case 102:
                                                        case 103:
                                                        case 104:
                                                        case 105:
                                                        case 106:
                                                        case 107:
                                                        case 108:
                                                        case 109:
                                                        case 110:
                                                        case 111:
                                                        case 112:
                                                        case 113:
                                                        case 114:
                                                        case 115:
                                                        case 116:
                                                        case 117:
                                                        case 118:
                                                        case 119:
                                                        case 120:
                                                        case 121:
                                                        case 122:
                                                        case 123:
                                                        case 124:
                                                        case 125:
                                                        case 126: {
                                                            break label$6;
                                                        }
                                                        case 49: {
                                                            break label$5;
                                                        }
                                                        case 50: {
                                                            break label$4;
                                                        }
                                                        case 51:
                                                        case 127: {
                                                            break label$9;
                                                        }
                                                        case 52: {
                                                            break label$3;
                                                        }
                                                        case 53: {
                                                            break label$2;
                                                        }
                                                        case 54:
                                                        case 55: {
                                                            break label$8;
                                                        }
                                                        case 56:
                                                        case 57:
                                                        case 58:
                                                        case 59:
                                                        case 60:
                                                        case 61: {
                                                            break label$10;
                                                        }
                                                        default: {
                                                            break label$7;
                                                        }
                                                    }
                                                }
                                                while (false);
                                                this._storeInt((_34_ + 12), (sqlite3ExprCodeTemp((this._loadInt((_34_ + 44))), (this._loadInt(((this._loadInt((_34_ + 40))) + 8))), (_34_ + 20))));
                                                _33_ = this._storeInt((_34_ + 8), (sqlite3ExprCodeTemp((this._loadInt((_34_ + 44))), (this._loadInt(((this._loadInt((_34_ + 40))) + 12))), (_34_ + 16))));
                                                codeCompare((this._loadInt((_34_ + 44))), (this._loadInt(((_32_ = this._loadInt((_34_ + 40))) + 8))), (this._loadInt((_32_ + 12))), (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 12))), _33_, (this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 32))));
                                                break label$1;
                                            }
                                            while (false);
                                            this._storeInt((_34_ + 12), (sqlite3ExprCodeTemp((this._loadInt((_34_ + 44))), (this._loadInt(((this._loadInt((_34_ + 40))) + 8))), (_34_ + 20))));
                                            this._storeInt((_34_ + 8), (sqlite3ExprCodeTemp((this._loadInt((_34_ + 44))), (this._loadInt(((this._loadInt((_34_ + 40))) + 12))), (_34_ + 16))));
                                            _temp$0 = 75;
                                            _temp$1 = 76;
                                            _temp$2 = ((this._loadInt8u((this._loadInt((_34_ + 40))))) == 70) ? _temp$0 : _temp$1;
                                            _temp$2 = this._storeInt((_34_ + 24), _temp$2);
                                            _33_ = _temp$2;
                                            codeCompare((this._loadInt((_34_ + 44))), (this._loadInt(((_32_ = this._loadInt((_34_ + 40))) + 8))), (this._loadInt((_32_ + 12))), _33_, (this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 36))), 128);
                                            break label$1;
                                        }
                                        while (false);
                                        _33_ = this._storeInt((_34_ + 12), (sqlite3ExprCodeTemp((this._loadInt((_34_ + 44))), (this._loadInt(((this._loadInt((_34_ + 40))) + 8))), (_34_ + 20))));
                                        sqlite3VdbeAddOp2((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 24))), _33_, (this._loadInt((_34_ + 36))));
                                        break label$1;
                                    }
                                    while (false);
                                    sqlite3ExprIfTrue((this._loadInt((_34_ + 44))), (this._loadInt(((this._loadInt((_34_ + 40))) + 8))), (this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 32))));
                                    break label$1;
                                }
                                while (false);
                                _33_ = this._storeInt((_34_ + 12), (sqlite3ExprCodeTemp((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 40))), (_34_ + 20))));
                                sqlite3VdbeAddOp3((this._loadInt((_34_ + 28))), 27, _33_, (this._loadInt((_34_ + 36))), (((this._loadInt((_34_ + 32))) != 0) ? 1 : 0));
                                break label$1;
                            }
                            while (false);
                            this._storeInt((_34_ + 4), (sqlite3VdbeMakeLabel((this._loadInt((_34_ + 28))))));
                            sqlite3ExprCachePush((this._loadInt((_34_ + 44))));
                            sqlite3ExprIfTrue((this._loadInt((_34_ + 44))), (this._loadInt(((this._loadInt((_34_ + 40))) + 8))), (this._loadInt((_34_ + 4))), ((this._loadInt((_34_ + 32))) ^ 8));
                            sqlite3ExprIfFalse((this._loadInt((_34_ + 44))), (this._loadInt(((this._loadInt((_34_ + 40))) + 12))), (this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 32))));
                            sqlite3VdbeResolveLabel((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 4))));
                            sqlite3ExprCachePop((this._loadInt((_34_ + 44))), 1);
                            break label$1;
                        }
                        while (false);
                        sqlite3ExprIfFalse((this._loadInt((_34_ + 44))), (this._loadInt(((this._loadInt((_34_ + 40))) + 8))), (this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 32))));
                        sqlite3ExprIfFalse((this._loadInt((_34_ + 44))), (this._loadInt(((this._loadInt((_34_ + 40))) + 12))), (this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 32))));
                        break label$1;
                    }
                    while (false);
                    exprCodeBetween((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 36))), 0, (this._loadInt((_34_ + 32))));
                    break label$1;
                }
                while (false);
                label$11:
                do {
                    if ((this._loadInt((_34_ + 32))) == 0) {
                        break label$11;
                    }
                    sqlite3ExprCodeIN((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 40))), (_33_ = this._loadInt((_34_ + 36))), _33_);
                    break label$1;
                }
                while (false);
                _33_ = this._storeInt(_34_, (sqlite3VdbeMakeLabel((this._loadInt((_34_ + 28))))));
                sqlite3ExprCodeIN((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 36))), _33_);
                sqlite3VdbeResolveLabel((this._loadInt((_34_ + 28))), (this._loadInt(_34_)));
            }
            while (false);
            sqlite3ReleaseTempReg((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 20))));
            sqlite3ReleaseTempReg((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 16))));
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 48));
        return;
    }

    @Override()
    public final void sqlite3ExprIfTrue(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_34_ + 56), _31_);
        this._storeInt((_34_ + 52), _32_);
        this._storeInt((_34_ + 48), _33_);
        this._storeInt((_34_ + 44), (this._loadInt(((this._loadInt((_34_ + 60))) + 12))));
        this._storeInt((_34_ + 32), (this._storeInt((_34_ + 36), (this._storeInt((_34_ + 40), 0)))));
        label$0:
        do {
            if ((this._loadInt((_34_ + 44))) == 0) {
                break label$0;
            }
            if ((this._loadInt((_34_ + 56))) == 0) {
                break label$0;
            }
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
                                label$6:
                                do {
                                    if (((_33_ = (this._storeInt((_34_ + 40), (this._loadInt8u((this._loadInt((_34_ + 56))))))) + -19) & 4294967295L) > (127 & 4294967295L)) {
                                        break label$6;
                                    }
                                    label$7:
                                    do {
                                        label$8:
                                        do {
                                            label$9:
                                            do {
                                                label$10:
                                                do {
                                                    switch (_33_) {
                                                        case 0: {
                                                            break label$7;
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
                                                        case 35:
                                                        case 36:
                                                        case 37:
                                                        case 38:
                                                        case 39:
                                                        case 40:
                                                        case 41:
                                                        case 42:
                                                        case 43:
                                                        case 44:
                                                        case 45:
                                                        case 46:
                                                        case 47:
                                                        case 48:
                                                        case 62:
                                                        case 63:
                                                        case 64:
                                                        case 65:
                                                        case 66:
                                                        case 67:
                                                        case 68:
                                                        case 69:
                                                        case 70:
                                                        case 71:
                                                        case 72:
                                                        case 73:
                                                        case 74:
                                                        case 75:
                                                        case 76:
                                                        case 77:
                                                        case 78:
                                                        case 79:
                                                        case 80:
                                                        case 81:
                                                        case 82:
                                                        case 83:
                                                        case 84:
                                                        case 85:
                                                        case 86:
                                                        case 87:
                                                        case 88:
                                                        case 89:
                                                        case 90:
                                                        case 91:
                                                        case 92:
                                                        case 93:
                                                        case 94:
                                                        case 95:
                                                        case 96:
                                                        case 97:
                                                        case 98:
                                                        case 99:
                                                        case 100:
                                                        case 101:
                                                        case 102:
                                                        case 103:
                                                        case 104:
                                                        case 105:
                                                        case 106:
                                                        case 107:
                                                        case 108:
                                                        case 109:
                                                        case 110:
                                                        case 111:
                                                        case 112:
                                                        case 113:
                                                        case 114:
                                                        case 115:
                                                        case 116:
                                                        case 117:
                                                        case 118:
                                                        case 119:
                                                        case 120:
                                                        case 121:
                                                        case 122:
                                                        case 123:
                                                        case 124:
                                                        case 125:
                                                        case 126: {
                                                            break label$6;
                                                        }
                                                        case 49: {
                                                            break label$5;
                                                        }
                                                        case 50: {
                                                            break label$4;
                                                        }
                                                        case 51:
                                                        case 127: {
                                                            break label$9;
                                                        }
                                                        case 52: {
                                                            break label$3;
                                                        }
                                                        case 53: {
                                                            break label$2;
                                                        }
                                                        case 54:
                                                        case 55: {
                                                            break label$8;
                                                        }
                                                        case 56:
                                                        case 57:
                                                        case 58:
                                                        case 59:
                                                        case 60:
                                                        case 61: {
                                                            break label$10;
                                                        }
                                                        default: {
                                                            break label$7;
                                                        }
                                                    }
                                                }
                                                while (false);
                                                this._storeInt((_34_ + 28), (sqlite3ExprCodeTemp((this._loadInt((_34_ + 60))), (this._loadInt(((this._loadInt((_34_ + 56))) + 8))), (_34_ + 36))));
                                                _33_ = this._storeInt((_34_ + 24), (sqlite3ExprCodeTemp((this._loadInt((_34_ + 60))), (this._loadInt(((this._loadInt((_34_ + 56))) + 12))), (_34_ + 32))));
                                                codeCompare((this._loadInt((_34_ + 60))), (this._loadInt(((_32_ = this._loadInt((_34_ + 56))) + 8))), (this._loadInt((_32_ + 12))), (this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 28))), _33_, (this._loadInt((_34_ + 52))), (this._loadInt((_34_ + 48))));
                                                break label$1;
                                            }
                                            while (false);
                                            this._storeInt((_34_ + 28), (sqlite3ExprCodeTemp((this._loadInt((_34_ + 60))), (this._loadInt(((this._loadInt((_34_ + 56))) + 8))), (_34_ + 36))));
                                            this._storeInt((_34_ + 24), (sqlite3ExprCodeTemp((this._loadInt((_34_ + 60))), (this._loadInt(((this._loadInt((_34_ + 56))) + 12))), (_34_ + 32))));
                                            _temp$0 = 76;
                                            _temp$1 = 75;
                                            _temp$2 = ((this._loadInt((_34_ + 40))) == 70) ? _temp$0 : _temp$1;
                                            _temp$2 = this._storeInt((_34_ + 40), _temp$2);
                                            _33_ = _temp$2;
                                            codeCompare((this._loadInt((_34_ + 60))), (this._loadInt(((_32_ = this._loadInt((_34_ + 56))) + 8))), (this._loadInt((_32_ + 12))), _33_, (this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 52))), 128);
                                            break label$1;
                                        }
                                        while (false);
                                        _33_ = this._storeInt((_34_ + 28), (sqlite3ExprCodeTemp((this._loadInt((_34_ + 60))), (this._loadInt(((this._loadInt((_34_ + 56))) + 8))), (_34_ + 36))));
                                        sqlite3VdbeAddOp2((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 40))), _33_, (this._loadInt((_34_ + 52))));
                                        break label$1;
                                    }
                                    while (false);
                                    sqlite3ExprIfFalse((this._loadInt((_34_ + 60))), (this._loadInt(((this._loadInt((_34_ + 56))) + 8))), (this._loadInt((_34_ + 52))), (this._loadInt((_34_ + 48))));
                                    break label$1;
                                }
                                while (false);
                                _33_ = this._storeInt((_34_ + 28), (sqlite3ExprCodeTemp((this._loadInt((_34_ + 60))), (this._loadInt((_34_ + 56))), (_34_ + 36))));
                                sqlite3VdbeAddOp3((this._loadInt((_34_ + 44))), 26, _33_, (this._loadInt((_34_ + 52))), (((this._loadInt((_34_ + 48))) != 0) ? 1 : 0));
                                break label$1;
                            }
                            while (false);
                            sqlite3ExprIfTrue((this._loadInt((_34_ + 60))), (this._loadInt(((this._loadInt((_34_ + 56))) + 8))), (this._loadInt((_34_ + 52))), (this._loadInt((_34_ + 48))));
                            sqlite3ExprIfTrue((this._loadInt((_34_ + 60))), (this._loadInt(((this._loadInt((_34_ + 56))) + 12))), (this._loadInt((_34_ + 52))), (this._loadInt((_34_ + 48))));
                            break label$1;
                        }
                        while (false);
                        this._storeInt((_34_ + 20), (sqlite3VdbeMakeLabel((this._loadInt((_34_ + 44))))));
                        sqlite3ExprCachePush((this._loadInt((_34_ + 60))));
                        sqlite3ExprIfFalse((this._loadInt((_34_ + 60))), (this._loadInt(((this._loadInt((_34_ + 56))) + 8))), (this._loadInt((_34_ + 20))), ((this._loadInt((_34_ + 48))) ^ 8));
                        sqlite3ExprIfTrue((this._loadInt((_34_ + 60))), (this._loadInt(((this._loadInt((_34_ + 56))) + 12))), (this._loadInt((_34_ + 52))), (this._loadInt((_34_ + 48))));
                        sqlite3VdbeResolveLabel((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 20))));
                        sqlite3ExprCachePop((this._loadInt((_34_ + 60))), 1);
                        break label$1;
                    }
                    while (false);
                    exprCodeBetween((this._loadInt((_34_ + 60))), (this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 52))), 1, (this._loadInt((_34_ + 48))));
                    break label$1;
                }
                while (false);
                this._storeInt((_34_ + 16), (sqlite3VdbeMakeLabel((this._loadInt((_34_ + 44))))));
                label$11:
                do {
                    label$12:
                    do {
                        if ((this._loadInt((_34_ + 48))) == 0) {
                            break label$12;
                        }
                        _33_ = this._loadInt((_34_ + 52));
                        break label$11;
                    }
                    while (false);
                    _33_ = this._loadInt((_34_ + 16));
                }
                while (false);
                this._storeInt((_34_ + 12), _33_);
                sqlite3ExprCodeIN((this._loadInt((_34_ + 60))), (this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 16))), _33_);
                sqlite3VdbeAddOp2((this._loadInt((_34_ + 44))), 1, 0, (this._loadInt((_34_ + 52))));
                sqlite3VdbeResolveLabel((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 16))));
            }
            while (false);
            sqlite3ReleaseTempReg((this._loadInt((_34_ + 60))), (this._loadInt((_34_ + 36))));
            sqlite3ReleaseTempReg((this._loadInt((_34_ + 60))), (this._loadInt((_34_ + 32))));
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 64));
        return;
    }

    @Override()
    public final void exprCodeBetween(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 224))) + 220), _30_);
        this._storeInt((_35_ + 216), _31_);
        this._storeInt((_35_ + 212), _32_);
        this._storeInt((_35_ + 208), _33_);
        this._storeInt((_35_ + 204), _34_);
        this._storeInt((_35_ + 4), 0);
        memcpy((_35_ + 8), (this._loadInt(((this._loadInt((_35_ + 216))) + 8))), 48);
        this._storeInt8((_35_ + 152), 69);
        this._storeInt8((_35_ + 104), 80);
        this._storeInt((_35_ + 160), (_35_ + 104));
        this._storeInt((_35_ + 164), (_35_ + 56));
        this._storeInt((_35_ + 112), (_35_ + 8));
        _34_ = this._loadInt((this._loadInt(((this._loadInt(((this._loadInt((_35_ + 216))) + 16))) + 12))));
        this._storeInt8((_35_ + 56), 78);
        this._storeInt((_35_ + 116), _34_);
        this._storeInt((_35_ + 64), (_35_ + 8));
        this._storeInt((_35_ + 68), (this._loadInt(((this._loadInt(((this._loadInt(((this._loadInt((_35_ + 216))) + 16))) + 12))) + 20))));
        _34_ = sqlite3ExprCodeTemp((this._loadInt((_35_ + 220))), (_35_ + 8), (_35_ + 4));
        this._storeInt8((_35_ + 8), 132);
        this._storeInt((_35_ + 32), _34_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_35_ + 208))) == 0) {
                    break label$1;
                }
                sqlite3ExprIfTrue((this._loadInt((_35_ + 220))), (_35_ + 152), (this._loadInt((_35_ + 212))), (this._loadInt((_35_ + 204))));
                break label$0;
            }
            while (false);
            sqlite3ExprIfFalse((this._loadInt((_35_ + 220))), (_35_ + 152), (this._loadInt((_35_ + 212))), (this._loadInt((_35_ + 204))));
        }
        while (false);
        sqlite3ReleaseTempReg((this._loadInt((_35_ + 220))), (this._loadInt((_35_ + 4))));
        this._storeInt((0 + 4), (_35_ + 224));
        return;
    }

    @Override()
    public final int sqlite3FindInIndex(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 112))) + 108), _30_);
        this._storeInt((_33_ + 104), _31_);
        this._storeInt((_33_ + 100), _32_);
        _32_ = 0;
        this._storeInt((_33_ + 92), 0);
        this._storeInt(((_31_ = this._loadInt((_33_ + 108))) + 68), ((_31_ = this._loadInt((_31_ + 68))) + 1));
        this._storeInt((_33_ + 88), _31_);
        this._storeInt((_33_ + 84), (((this._loadInt((_33_ + 100))) == 0) ? 1 : 0));
        label$0:
        do {
            if (((this._loadInt16u(((this._loadInt((_33_ + 104))) + 2))) & 2048) == 0) {
                break label$0;
            }
            _32_ = this._loadInt(((this._loadInt((_33_ + 104))) + 16));
        }
        while (false);
        this._storeInt((_33_ + 96), _32_);
        label$1:
        do {
            if ((this._loadInt(((this._loadInt((_33_ + 108))) + 64))) != 0) {
                break label$1;
            }
            if ((isCandidateForInOpt((this._loadInt((_33_ + 96))))) == 0) {
                break label$1;
            }
            this._storeInt((_33_ + 80), (this._loadInt((this._loadInt((_33_ + 108))))));
            this._storeInt((_33_ + 76), (this._loadInt((this._loadInt(((this._loadInt((this._loadInt((_33_ + 96))))) + 12))))));
            this._storeInt((_33_ + 72), (this._loadInt16s(((this._loadInt((_33_ + 76))) + 28))));
            this._storeInt((_33_ + 68), (sqlite3GetVdbe((this._loadInt((_33_ + 108))))));
            _32_ = this._storeInt((_33_ + 64), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 96))) + 8))) + 20))));
            _32_ = this._storeInt((_33_ + 60), (sqlite3SchemaToIndex((this._loadInt((_33_ + 80))), (this._loadInt((_32_ + 68))))));
            sqlite3CodeVerifySchema((this._loadInt((_33_ + 108))), _32_);
            sqlite3TableLock((this._loadInt((_33_ + 108))), (this._loadInt((_33_ + 60))), (this._loadInt(((_32_ = this._loadInt((_33_ + 64))) + 20))), 0, (this._loadInt(_32_)));
            label$2:
            do {
                if ((this._loadInt((_33_ + 72))) <= -1) {
                    break label$2;
                }
                this._storeInt((_33_ + 44), (sqlite3BinaryCompareCollSeq((this._loadInt((_33_ + 108))), (this._loadInt(((this._loadInt((_33_ + 104))) + 8))), (this._loadInt((_33_ + 76))))));
                this._storeInt8((_33_ + 43), (comparisonAffinity((this._loadInt((_33_ + 104))))));
                _32_ = 1;
                label$3:
                do {
                    if ((this._loadInt8s((((this._loadInt(((this._loadInt((_33_ + 64))) + 12))) + ((this._loadInt((_33_ + 72))) * 24)) + 22))) == (this._loadInt8s((_33_ + 43)))) {
                        break label$3;
                    }
                    _32_ = ((this._loadInt8s((_33_ + 43))) == 98) ? 1 : 0;
                }
                while (false);
                this._storeInt((_33_ + 36), _32_);
                this._storeInt((_33_ + 48), (this._loadInt(((this._loadInt((_33_ + 64))) + 16))));
                label$4:
                while (true) {
                    _32_ = 0;
                    label$6:
                    do {
                        if ((this._loadInt((_33_ + 48))) == 0) {
                            break label$6;
                        }
                        _32_ = 0;
                        if ((this._loadInt((_33_ + 92))) != 0) {
                            break label$6;
                        }
                        _32_ = ((this._loadInt((_33_ + 36))) != 0) ? 1 : 0;
                    }
                    while (false);
                    if (_32_ == 0) {
                        break label$1;
                    }
                    label$7:
                    do {
                        if ((this._loadInt((this._loadInt(((this._loadInt((_33_ + 48))) + 8))))) != (this._loadInt((_33_ + 72)))) {
                            break label$7;
                        }
                        if ((sqlite3FindCollSeq((_32_ = this._loadInt((_33_ + 80))), (this._loadInt8u(((this._loadInt(((this._loadInt((_32_ + 8))) + 12))) + 77))), (this._loadInt((this._loadInt(((this._loadInt((_33_ + 48))) + 44))))), 0)) != (this._loadInt((_33_ + 44)))) {
                            break label$7;
                        }
                        label$8:
                        do {
                            if ((this._loadInt((_33_ + 84))) == 0) {
                                break label$8;
                            }
                            if ((this._loadInt(((this._loadInt((_33_ + 48))) + 4))) != 1) {
                                break label$7;
                            }
                            if ((this._loadInt8u(((this._loadInt((_33_ + 48))) + 24))) == 0) {
                                break label$7;
                            }
                        }
                        while (false);
                        this._storeInt((_33_ + 32), (this._storeInt(((_32_ = this._loadInt((_33_ + 108))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
                        this._storeInt((_33_ + 24), (sqlite3IndexKeyinfo((this._loadInt((_33_ + 108))), (this._loadInt((_33_ + 48))))));
                        this._storeInt((_33_ + 28), (sqlite3VdbeAddOp1((this._loadInt((_33_ + 68))), 26, (this._loadInt((_33_ + 32))))));
                        sqlite3VdbeAddOp2((this._loadInt((_33_ + 68))), 7, 1, (this._loadInt((_33_ + 32))));
                        sqlite3VdbeAddOp4((this._loadInt((_33_ + 68))), 38, (this._loadInt((_33_ + 88))), (this._loadInt(((this._loadInt((_33_ + 48))) + 20))), (this._loadInt((_33_ + 60))), (this._loadInt((_33_ + 24))), -16);
                        this._storeInt((_33_ + 92), 3);
                        sqlite3VdbeJumpHere((this._loadInt((_33_ + 68))), (this._loadInt((_33_ + 28))));
                        if ((this._loadInt((_33_ + 100))) == 0) {
                            break label$7;
                        }
                        if ((this._loadInt8u((((this._loadInt(((this._loadInt((_33_ + 64))) + 12))) + ((this._loadInt((_33_ + 72))) * 24)) + 20))) != 0) {
                            break label$7;
                        }
                        _32_ = this._storeInt(((_32_ = this._loadInt((_33_ + 108))) + 72), ((this._loadInt((_32_ + 72))) + 1));
                        this._storeInt((this._loadInt((_33_ + 100))), _32_);
                    }
                    while (false);
                    this._storeInt((_33_ + 48), (this._loadInt(((this._loadInt((_33_ + 48))) + 32))));
                    continue label$4;
                }
            }
            while (false);
            _32_ = this._storeInt((_33_ + 56), (this._storeInt(((_32_ = this._loadInt((_33_ + 108))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
            this._storeInt((_33_ + 52), (sqlite3VdbeAddOp1((this._loadInt((_33_ + 68))), 26, _32_)));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 68))), 7, 1, (this._loadInt((_33_ + 56))));
            sqlite3OpenTable((this._loadInt((_33_ + 108))), (this._loadInt((_33_ + 88))), (this._loadInt((_33_ + 60))), (this._loadInt((_33_ + 64))), 38);
            this._storeInt((_33_ + 92), 1);
            sqlite3VdbeJumpHere((this._loadInt((_33_ + 68))), (this._loadInt((_33_ + 52))));
        }
        while (false);
        label$9:
        do {
            label$10:
            do {
                if ((this._loadInt((_33_ + 92))) == 0) {
                    break label$10;
                }
                this._storeInt(((this._loadInt((_33_ + 104))) + 24), (this._loadInt((_33_ + 88))));
                break label$9;
            }
            while (false);
            this._storeDouble((_33_ + 16), (this._loadDouble(((this._loadInt((_33_ + 108))) + 448))));
            this._storeInt((_33_ + 12), 0);
            this._storeInt((_33_ + 92), 2);
            label$11:
            do {
                label$12:
                do {
                    if ((this._loadInt((_33_ + 100))) == 0) {
                        break label$12;
                    }
                    _32_ = this._storeInt((_33_ + 12), (this._storeInt(((_32_ = this._loadInt((_33_ + 108))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
                    this._storeInt((this._loadInt((_33_ + 100))), _32_);
                    break label$11;
                }
                while (false);
                this._storeLong(((this._loadInt((_33_ + 108))) + 448), 4607182418800017408L);
                if ((this._loadInt16s(((this._loadInt(((this._loadInt((_33_ + 104))) + 8))) + 28))) > -1) {
                    break label$11;
                }
                if (((this._loadInt16u(((this._loadInt((_33_ + 104))) + 2))) & 2048) != 0) {
                    break label$11;
                }
                this._storeInt((_33_ + 92), 1);
            }
            while (false);
            sqlite3CodeSubselect((this._loadInt((_33_ + 108))), (this._loadInt((_33_ + 104))), (this._loadInt((_33_ + 12))), (((this._loadInt((_33_ + 92))) == 1) ? 1 : 0));
            this._storeDouble(((this._loadInt((_33_ + 108))) + 448), (this._loadDouble((_33_ + 16))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 92));
        this._storeInt((0 + 4), (_33_ + 112));
        return _32_;
    }

    @Override()
    public final int comparisonAffinity(int _30_)
    {
        int _31_ = 0;
        this._storeInt8(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 11), (sqlite3ExprAffinity((this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 8))))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 12))) + 12))) == 0) {
                    break label$1;
                }
                this._storeInt8((_31_ + 11), (sqlite3CompareAffinity((this._loadInt(((this._loadInt((_31_ + 12))) + 12))), (this._loadInt8s((_31_ + 11))))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt16u(((this._loadInt((_31_ + 12))) + 2))) & 2048) == 0) {
                    break label$2;
                }
                this._storeInt8((_31_ + 11), (sqlite3CompareAffinity((this._loadInt((this._loadInt(((this._loadInt((this._loadInt(((this._loadInt((_31_ + 12))) + 16))))) + 12))))), (this._loadInt8s((_31_ + 11))))));
                break label$0;
            }
            while (false);
            if ((this._loadInt8u((_31_ + 11))) != 0) {
                break label$0;
            }
            this._storeInt8((_31_ + 11), 98);
        }
        while (false);
        _30_ = this._loadInt8s((_31_ + 11));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3VdbeAddOp4Int(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_)
    {
        int _36_ = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_36_ + 24), _31_);
        this._storeInt((_36_ + 20), _32_);
        this._storeInt((_36_ + 16), _33_);
        this._storeInt((_36_ + 12), _34_);
        this._storeInt((_36_ + 8), _35_);
        _35_ = this._storeInt((_36_ + 4), (sqlite3VdbeAddOp3((this._loadInt((_36_ + 28))), (this._loadInt((_36_ + 24))), (this._loadInt((_36_ + 20))), (this._loadInt((_36_ + 16))), (this._loadInt((_36_ + 12))))));
        sqlite3VdbeChangeP4((this._loadInt((_36_ + 28))), _35_, (this._loadInt((_36_ + 8))), -14);
        _35_ = this._loadInt((_36_ + 4));
        this._storeInt((0 + 4), (_36_ + 32));
        return _35_;
    }

    @Override()
    public final int sqlite3CompareAffinity(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt8((_32_ + 7), _31_);
        this._storeInt8((_32_ + 6), (sqlite3ExprAffinity((this._loadInt((_32_ + 8))))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt8s((_32_ + 6))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt8s((_32_ + 7))) == 0) {
                            break label$3;
                        }
                        label$4:
                        do {
                            if ((this._loadInt8s((_32_ + 6))) > 98) {
                                break label$4;
                            }
                            if ((this._loadInt8s((_32_ + 7))) < 99) {
                                break label$2;
                            }
                        }
                        while (false);
                        this._storeInt8((_32_ + 15), 99);
                        break label$0;
                    }
                    while (false);
                    label$5:
                    do {
                        if ((this._loadInt8u((_32_ + 6))) != 0) {
                            break label$5;
                        }
                        if ((this._loadInt8u((_32_ + 7))) == 0) {
                            break label$1;
                        }
                    }
                    while (false);
                    this._storeInt8((_32_ + 15), ((this._loadInt8u((_32_ + 6))) + (this._loadInt8s((_32_ + 7)))));
                    break label$0;
                }
                while (false);
                this._storeInt8((_32_ + 15), 98);
                break label$0;
            }
            while (false);
            this._storeInt8((_32_ + 15), 98);
        }
        while (false);
        _31_ = this._loadInt8s((_32_ + 15));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int isCandidateForInOpt(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 32) + 24), _30_)) == 0) {
                    break label$1;
                }
                if ((this._loadInt(((this._loadInt((_31_ + 24))) + 28))) == 0) {
                    break label$0;
                }
                this._storeInt((_31_ + 28), 0);
                return (this._loadInt((_31_ + 28)));
            }
            while (false);
            this._storeInt((_31_ + 28), 0);
            return (this._loadInt((_31_ + 28)));
        }
        while (false);
        label$2:
        do {
            if (((this._loadInt16u(((this._loadInt((_31_ + 24))) + 6))) & 5) == 0) {
                break label$2;
            }
            this._storeInt((_31_ + 28), 0);
            return (this._loadInt((_31_ + 28)));
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt(((this._loadInt((_31_ + 24))) + 40))) == 0) {
                break label$3;
            }
            this._storeInt((_31_ + 28), 0);
            return (this._loadInt((_31_ + 28)));
        }
        while (false);
        label$4:
        do {
            if ((this._loadInt(((this._loadInt((_31_ + 24))) + 12))) == 0) {
                break label$4;
            }
            this._storeInt((_31_ + 28), 0);
            return (this._loadInt((_31_ + 28)));
        }
        while (false);
        label$5:
        do {
            if ((this._loadInt16s((this._storeInt((_31_ + 20), (this._loadInt(((this._loadInt((_31_ + 24))) + 8))))))) == 1) {
                break label$5;
            }
            this._storeInt((_31_ + 28), 0);
            return (this._loadInt((_31_ + 28)));
        }
        while (false);
        label$6:
        do {
            if ((this._loadInt(((this._loadInt((_31_ + 20))) + 24))) == 0) {
                break label$6;
            }
            this._storeInt((_31_ + 28), 0);
            return (this._loadInt((_31_ + 28)));
        }
        while (false);
        label$7:
        do {
            label$8:
            do {
                if ((this._storeInt((_31_ + 12), (this._loadInt(((this._loadInt((_31_ + 20))) + 20))))) == 0) {
                    break label$8;
                }
                if (((this._loadInt8u(((this._loadInt((_31_ + 12))) + 34))) & 16) == 0) {
                    break label$7;
                }
                this._storeInt((_31_ + 28), 0);
                return (this._loadInt((_31_ + 28)));
            }
            while (false);
            this._storeInt((_31_ + 28), 0);
            return (this._loadInt((_31_ + 28)));
        }
        while (false);
        label$9:
        do {
            if ((this._loadInt((this._storeInt((_31_ + 16), (this._loadInt((this._loadInt((_31_ + 24))))))))) == 1) {
                break label$9;
            }
            this._storeInt((_31_ + 28), 0);
            return (this._loadInt((_31_ + 28)));
        }
        while (false);
        label$10:
        do {
            if ((this._loadInt8u((this._loadInt((this._loadInt(((this._loadInt((_31_ + 16))) + 12))))))) == 152) {
                break label$10;
            }
            this._storeInt((_31_ + 28), 0);
            return (this._loadInt((_31_ + 28)));
        }
        while (false);
        this._storeInt((_31_ + 28), 1);
        return (this._loadInt((_31_ + 28)));
    }

    @Override()
    public final int sqlite3BinaryCompareCollSeq(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt16u(((this._loadInt((_33_ + 8))) + 2))) & 256) == 0) {
                    break label$1;
                }
                this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 8))) + 20))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt((_33_ + 4))) == 0) {
                    break label$2;
                }
                if (((this._loadInt16u(((this._loadInt((_33_ + 4))) + 2))) & 256) == 0) {
                    break label$2;
                }
                this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 4))) + 20))));
                break label$0;
            }
            while (false);
            if ((this._storeInt(_33_, (sqlite3ExprCollSeq((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))))))) != 0) {
                break label$0;
            }
            this._storeInt(_33_, (sqlite3ExprCollSeq((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 4))))));
        }
        while (false);
        _32_ = this._loadInt(_33_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final void sqlite3SelectDestInit(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt8((_31_ = this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))));
        this._storeInt((_31_ + 4), _32_);
        _32_ = this._storeInt8(((this._loadInt((_33_ + 12))) + 1), 0);
        this._storeInt(((this._loadInt((_33_ + 12))) + 8), _32_);
        this._storeInt(((this._loadInt((_33_ + 12))) + 12), _32_);
        return;
    }

    @Override()
    public final int exprIsConst(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 8), 40);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 12), 41);
        sqlite3WalkExpr((_32_ + 8), (this._loadInt((_32_ + 28))));
        _31_ = this._loadInt((_32_ + 20));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int exprNodeIsConstant(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_32_ + 8))) + 12))) != 3) {
                break label$0;
            }
            if (((this._loadInt16u(((this._loadInt((_32_ + 4))) + 2))) & 1) == 0) {
                break label$0;
            }
            this._storeInt(((this._loadInt((_32_ + 8))) + 12), 0);
            this._storeInt((_32_ + 12), 2);
            return (this._loadInt((_32_ + 12)));
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                if ((((_31_ = this._loadInt8u((this._loadInt((_32_ + 4))))) + -152) & 4294967295L) < (3 & 4294967295L)) {
                    break label$2;
                }
                if (_31_ == 26) {
                    break label$2;
                }
                if (_31_ != 151) {
                    break label$1;
                }
                if ((this._loadInt(((this._loadInt((_32_ + 8))) + 12))) != 2) {
                    break label$2;
                }
                this._storeInt((_32_ + 12), 0);
                return (this._loadInt((_32_ + 12)));
            }
            while (false);
            this._storeInt(((this._loadInt((_32_ + 8))) + 12), 0);
            this._storeInt((_32_ + 12), 2);
            return (this._loadInt((_32_ + 12)));
        }
        while (false);
        this._storeInt((_32_ + 12), 0);
        return (this._loadInt((_32_ + 12)));
    }

    @Override()
    public final int selectNodeIsConstant(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt(((this._loadInt((_32_ + 12))) + 12), 0);
        return 2;
    }

    @Override()
    public final int binaryCompareP5(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt8((_33_ + 3), (sqlite3ExprAffinity((this._loadInt((_33_ + 8))))));
        this._storeInt8((_33_ + 3), ((sqlite3CompareAffinity((this._loadInt((_33_ + 12))), (this._loadInt8s((_33_ + 3))))) | (this._loadInt((_33_ + 4)))));
        _32_ = this._loadInt8u((_33_ + 3));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int dup8bytes(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 4), (sqlite3DbMallocRaw((sqlite3VdbeDb((this._loadInt((_32_ + 12))))), 8)))) == 0) {
                break label$0;
            }
            memcpy((this._loadInt((_32_ + 4))), (this._loadInt((_32_ + 8))), 8);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void sqlite3ExprCachePinRegister(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this._storeInt((_32_ + 4), 0);
        this._storeInt(_32_, ((this._loadInt((_32_ + 12))) + 96));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 4))) > 9) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt(((this._loadInt(_32_)) + 16))) != (this._loadInt((_32_ + 8)))) {
                        break label$2;
                    }
                    this._storeInt8(((this._loadInt(_32_)) + 8), _31_);
                }
                while (false);
                this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                this._storeInt(_32_, ((this._loadInt(_32_)) + 24));
                continue label$0;
            }
        }
        while (false);
        return;
    }

    @Override()
    public final void sqlite3ExprCodeGetColumnOfTable(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_35_ + 16))) < 0) {
                        break label$2;
                    }
                    if ((this._loadInt((_35_ + 16))) != (this._loadInt(((this._loadInt((_35_ + 24))) + 4)))) {
                        break label$1;
                    }
                }
                while (false);
                sqlite3VdbeAddOp2((this._loadInt((_35_ + 28))), 61, (this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 12))));
                break label$0;
            }
            while (false);
            _temp$0 = 129;
            _temp$1 = 28;
            _temp$2 = ((((this._loadInt8u(((this._loadInt((_35_ + 24))) + 34))) & 16) >>> 4) != 0) ? _temp$0 : _temp$1;
            _temp$2 = this._storeInt((_35_ + 8), _temp$2);
            _34_ = _temp$2;
            sqlite3VdbeAddOp3((this._loadInt((_35_ + 28))), _34_, (this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 16))), (this._loadInt((_35_ + 12))));
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt((_35_ + 16))) < 0) {
                break label$3;
            }
            sqlite3ColumnDefault((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 16))), (this._loadInt((_35_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_35_ + 32));
        return;
    }

    @Override()
    public final void sqlite3ExprCacheStore(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = (this._loadInt((0 + 4))) - 32) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        label$0:
        do {
            if (((this._loadInt8u(((this._loadInt((this._loadInt((_34_ + 28))))) + 12))) & 2) != 0) {
                break label$0;
            }
            this._storeInt((_34_ + 12), 0);
            this._storeInt(_34_, ((this._loadInt((_34_ + 28))) + 96));
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt((_34_ + 12))) > 9) {
                            break label$1;
                        }
                        if ((this._loadInt(((this._loadInt(_34_)) + 16))) == 0) {
                            break label$3;
                        }
                        this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 12))) + 1));
                        this._storeInt(_34_, ((this._loadInt(_34_)) + 24));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt(((_33_ = this._loadInt(_34_)) + 12), (this._loadInt(((this._loadInt((_34_ + 28))) + 84))));
                this._storeInt(_33_, (this._loadInt((_34_ + 24))));
                this._storeInt(((this._loadInt(_34_)) + 4), (this._loadInt((_34_ + 20))));
                this._storeInt(((this._loadInt(_34_)) + 16), (this._loadInt((_34_ + 16))));
                this._storeInt8(((this._loadInt(_34_)) + 8), 0);
                this._storeInt(((_33_ = this._loadInt((_34_ + 28))) + 88), ((_33_ = this._loadInt((_33_ + 88))) + 1));
                this._storeInt(((this._loadInt(_34_)) + 20), _33_);
                return;
            }
            while (false);
            this._storeInt((_34_ + 8), 2147483647);
            this._storeInt((_34_ + 4), -1);
            this._storeInt((_34_ + 12), 0);
            this._storeInt(_34_, ((this._loadInt((_34_ + 28))) + 96));
            label$5:
            do {
                label$4:
                while (true) {
                    if ((this._loadInt((_34_ + 12))) > 9) {
                        break label$5;
                    }
                    label$6:
                    do {
                        if ((this._loadInt(((this._loadInt(_34_)) + 20))) >= (this._loadInt((_34_ + 8)))) {
                            break label$6;
                        }
                        this._storeInt((_34_ + 4), (this._loadInt((_34_ + 12))));
                        this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt(_34_)) + 20))));
                    }
                    while (false);
                    this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 12))) + 1));
                    this._storeInt(_34_, ((this._loadInt(_34_)) + 24));
                    continue label$4;
                }
            }
            while (false);
            if ((this._loadInt((_34_ + 4))) < 0) {
                break label$0;
            }
            _32_ = this._storeInt(_34_, ((_33_ = (this._loadInt((_34_ + 28))) + ((this._loadInt((_34_ + 4))) * 24)) + 96));
            this._storeInt((_33_ + 108), (this._loadInt(((this._loadInt((_34_ + 28))) + 84))));
            this._storeInt(_32_, (this._loadInt((_34_ + 24))));
            this._storeInt(((this._loadInt(_34_)) + 4), (this._loadInt((_34_ + 20))));
            this._storeInt(((this._loadInt(_34_)) + 16), (this._loadInt((_34_ + 16))));
            this._storeInt8(((this._loadInt(_34_)) + 8), 0);
            this._storeInt(((_33_ = this._loadInt((_34_ + 28))) + 88), ((_33_ = this._loadInt((_33_ + 88))) + 1));
            this._storeInt(((this._loadInt(_34_)) + 20), _33_);
        }
        while (false);
        return;
    }

    @Override()
    public final void detachFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 208))) + 204), _30_);
        this._storeInt((_33_ + 200), _31_);
        this._storeInt((_33_ + 192), (sqlite3_value_text((this._loadInt((this._storeInt((_33_ + 196), _32_)))))));
        this._storeInt((_33_ + 188), (sqlite3_context_db_handle((this._loadInt((_33_ + 204))))));
        _32_ = this._storeInt((_33_ + 180), 0);
        label$0:
        do {
            if ((this._loadInt((_33_ + 192))) != 0) {
                break label$0;
            }
            this._storeInt((_33_ + 192), 21392);
        }
        while (false);
        this._storeInt((_33_ + 184), _32_);
        label$2:
        do {
            label$1:
            while (true) {
                if ((this._loadInt((_33_ + 184))) >= (this._loadInt(((this._loadInt((_33_ + 188))) + 4)))) {
                    break label$2;
                }
                label$3:
                do {
                    if ((this._loadInt(((this._storeInt((_33_ + 180), ((this._loadInt(((this._loadInt((_33_ + 188))) + 8))) + ((this._loadInt((_33_ + 184))) << 4)))) + 4))) == 0) {
                        break label$3;
                    }
                    if ((sqlite3StrICmp((this._loadInt((this._loadInt((_33_ + 180))))), (this._loadInt((_33_ + 192))))) == 0) {
                        break label$2;
                    }
                }
                while (false);
                this._storeInt((_33_ + 184), ((this._loadInt((_33_ + 184))) + 1));
                continue label$1;
            }
        }
        while (false);
        label$4:
        do {
            label$5:
            do {
                label$6:
                do {
                    label$7:
                    do {
                        if ((this._loadInt((_33_ + 184))) < (this._loadInt(((this._loadInt((_33_ + 188))) + 4)))) {
                            break label$7;
                        }
                        this._storeInt(_33_, (this._loadInt((_33_ + 192))));
                        sqlite3_snprintf(128, (_33_ + 48), 42000, _33_);
                        break label$6;
                    }
                    while (false);
                    label$8:
                    do {
                        if ((this._loadInt((_33_ + 184))) > 1) {
                            break label$8;
                        }
                        this._storeInt((_33_ + 16), (this._loadInt((_33_ + 192))));
                        sqlite3_snprintf(128, (_33_ + 48), 42032, (_33_ + 16));
                        break label$6;
                    }
                    while (false);
                    label$9:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_33_ + 188))) + 28))) == 0) {
                            break label$9;
                        }
                        label$10:
                        do {
                            if ((sqlite3BtreeIsInReadTrans((this._loadInt(((this._loadInt((_33_ + 180))) + 4))))) != 0) {
                                break label$10;
                            }
                            if ((sqlite3BtreeIsInBackup((this._loadInt(((this._loadInt((_33_ + 180))) + 4))))) == 0) {
                                break label$5;
                            }
                        }
                        while (false);
                        this._storeInt((_33_ + 32), (this._loadInt((_33_ + 192))));
                        sqlite3_snprintf(128, (_33_ + 48), 42112, (_33_ + 32));
                        break label$6;
                    }
                    while (false);
                    sqlite3_snprintf(128, (_33_ + 48), 42064, 0);
                }
                while (false);
                sqlite3_result_error((this._loadInt((_33_ + 204))), (_33_ + 48), -1);
                break label$4;
            }
            while (false);
            sqlite3BtreeClose((this._loadInt(((this._loadInt((_33_ + 180))) + 4))));
            this._storeInt(((_32_ = this._loadInt((_33_ + 180))) + 4), (this._storeInt((_32_ + 12), 0)));
            sqlite3ResetInternalSchema((this._loadInt((_33_ + 188))), -1);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 208));
        return;
    }

    @Override()
    public final int sqlite3BtreeIsInBackup(int _30_)
    {
        return (((this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 16))) != 0) ? 1 : 0);
    }

    @Override()
    public final void attachFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 112))) + 108), _30_);
        this._storeInt((_33_ + 104), _31_);
        this._storeInt((_33_ + 100), _32_);
        _32_ = this._storeInt((_33_ + 92), 0);
        this._storeInt((_33_ + 88), (sqlite3_context_db_handle((this._loadInt((_33_ + 108))))));
        this._storeInt((_33_ + 60), (this._storeInt((_33_ + 72), (this._storeInt((_33_ + 76), _32_)))));
        this._storeInt((_33_ + 80), (sqlite3_value_text((this._loadInt((this._loadInt((_33_ + 100))))))));
        this._storeInt((_33_ + 84), (sqlite3_value_text((this._loadInt(((this._loadInt((_33_ + 100))) + 4))))));
        label$0:
        do {
            if ((this._loadInt((_33_ + 80))) != 0) {
                break label$0;
            }
            this._storeInt((_33_ + 80), 21392);
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_33_ + 84))) != 0) {
                break label$1;
            }
            this._storeInt((_33_ + 84), 21392);
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                label$4:
                do {
                    if ((this._loadInt(((_32_ = this._loadInt((_33_ + 88))) + 4))) < ((this._loadInt((_32_ + 100))) + 2)) {
                        break label$4;
                    }
                    this._storeInt(_33_, (this._loadInt(((_32_ = this._loadInt((_33_ + 88))) + 100))));
                    this._storeInt((_33_ + 60), (sqlite3MPrintf(_32_, 42192, _33_)));
                    break label$3;
                }
                while (false);
                label$5:
                do {
                    label$6:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_33_ + 88))) + 28))) == 0) {
                            break label$6;
                        }
                        this._storeInt((_33_ + 96), 0);
                        label$8:
                        do {
                            label$7:
                            while (true) {
                                if ((this._loadInt((_33_ + 96))) >= (this._loadInt(((this._loadInt((_33_ + 88))) + 4)))) {
                                    break label$5;
                                }
                                if ((sqlite3StrICmp((this._storeInt((_33_ + 52), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 88))) + 8))) + ((this._loadInt((_33_ + 96))) << 4)))))), (this._loadInt((_33_ + 84))))) == 0) {
                                    break label$8;
                                }
                                this._storeInt((_33_ + 96), ((this._loadInt((_33_ + 96))) + 1));
                                continue label$7;
                            }
                        }
                        while (false);
                        _32_ = this._loadInt((_33_ + 88));
                        this._storeInt((_33_ + 16), (this._loadInt((_33_ + 84))));
                        this._storeInt((_33_ + 60), (sqlite3MPrintf(_32_, 42288, (_33_ + 16))));
                        break label$3;
                    }
                    while (false);
                    this._storeInt((_33_ + 60), (sqlite3MPrintf((this._loadInt((_33_ + 88))), 42240, 0)));
                    break label$3;
                }
                while (false);
                label$9:
                do {
                    label$10:
                    do {
                        if ((this._loadInt(((_32_ = this._loadInt((_33_ + 88))) + 8))) == (_32_ + 444)) {
                            break label$10;
                        }
                        if ((this._storeInt((_33_ + 64), (sqlite3DbRealloc((_32_ = this._loadInt((_33_ + 88))), (this._loadInt((_32_ + 8))), (((this._loadInt((_32_ + 4))) << 4) + 16))))) != 0) {
                            break label$9;
                        }
                        break label$2;
                    }
                    while (false);
                    if ((this._storeInt((_33_ + 64), (sqlite3DbMallocRaw((this._loadInt((_33_ + 88))), 48)))) == 0) {
                        break label$2;
                    }
                    memcpy((this._loadInt((_33_ + 64))), (this._loadInt(((this._loadInt((_33_ + 88))) + 8))), 32);
                }
                while (false);
                memset((this._storeInt((_33_ + 64), ((this._storeInt(((_32_ = this._loadInt((_33_ + 88))) + 8), (this._loadInt((_33_ + 64))))) + ((this._loadInt((_32_ + 4))) << 4)))), 0, 16);
                this._storeInt((_33_ + 68), (this._loadInt(((this._loadInt((_33_ + 88))) + 16))));
                label$11:
                do {
                    if ((this._storeInt((_33_ + 92), (sqlite3ParseUri((this._loadInt(((this._loadInt((this._loadInt((_33_ + 88))))) + 16))), (this._loadInt((_33_ + 80))), (_33_ + 68), (_33_ + 56), (_33_ + 76), (_33_ + 72))))) == 0) {
                        break label$11;
                    }
                    label$12:
                    do {
                        if ((this._loadInt((_33_ + 92))) != 7) {
                            break label$12;
                        }
                        this._storeInt8(((this._loadInt((_33_ + 88))) + 30), 1);
                    }
                    while (false);
                    sqlite3_result_error((this._loadInt((_33_ + 108))), (this._loadInt((_33_ + 72))), -1);
                    sqlite3_free((this._loadInt((_33_ + 72))));
                    break label$2;
                }
                while (false);
                _32_ = this._storeInt((_33_ + 68), ((this._loadInt((_33_ + 68))) | 256));
                this._storeInt((_33_ + 92), (sqlite3BtreeOpen((this._loadInt((_33_ + 56))), (this._loadInt((_33_ + 76))), (this._loadInt((_33_ + 88))), ((this._loadInt((_33_ + 64))) + 4), 0, _32_)));
                sqlite3_free((this._loadInt((_33_ + 76))));
                this._storeInt(((_32_ = this._loadInt((_33_ + 88))) + 4), ((this._loadInt((_32_ + 4))) + 1));
                label$13:
                do {
                    label$14:
                    do {
                        if ((this._loadInt((_33_ + 92))) != 19) {
                            break label$14;
                        }
                        this._storeInt((_33_ + 92), 1);
                        this._storeInt((_33_ + 60), (sqlite3MPrintf((this._loadInt((_33_ + 88))), 42320, 0)));
                        break label$13;
                    }
                    while (false);
                    if ((this._loadInt((_33_ + 92))) != 0) {
                        break label$13;
                    }
                    _32_ = sqlite3SchemaGet((this._loadInt((_33_ + 88))), (this._loadInt(((this._loadInt((_33_ + 64))) + 4))));
                    label$15:
                    do {
                        label$16:
                        do {
                            if ((this._storeInt(((this._loadInt((_33_ + 64))) + 12), _32_)) == 0) {
                                break label$16;
                            }
                            if ((this._loadInt8u(((this._loadInt(((this._loadInt((_33_ + 64))) + 12))) + 76))) == 0) {
                                break label$15;
                            }
                            if ((this._loadInt8u(((this._loadInt(((this._loadInt((_33_ + 64))) + 12))) + 77))) == (this._loadInt8u(((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 88))) + 8))) + 12))) + 77)))) {
                                break label$15;
                            }
                            this._storeInt((_33_ + 60), (sqlite3MPrintf((this._loadInt((_33_ + 88))), 32528, 0)));
                            this._storeInt((_33_ + 92), 1);
                            break label$15;
                        }
                        while (false);
                        this._storeInt((_33_ + 92), 7);
                    }
                    while (false);
                    sqlite3PagerLockingMode((this._storeInt((_33_ + 48), (sqlite3BtreePager((this._loadInt(((this._loadInt((_33_ + 64))) + 4))))))), (this._loadInt8u(((this._loadInt((_33_ + 88))) + 31))));
                    sqlite3BtreeSecureDelete((this._loadInt(((this._loadInt((_33_ + 64))) + 4))), (sqlite3BtreeSecureDelete((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 88))) + 8))) + 4))), -1)));
                }
                while (false);
                this._storeInt8(((this._loadInt((_33_ + 64))) + 9), 3);
                _32_ = sqlite3DbStrDup((this._loadInt((_33_ + 88))), (this._loadInt((_33_ + 84))));
                this._storeInt((this._loadInt((_33_ + 64))), _32_);
                label$17:
                do {
                    if ((this._loadInt((_33_ + 92))) != 0) {
                        break label$17;
                    }
                    if ((this._loadInt((this._loadInt((_33_ + 64))))) != 0) {
                        break label$17;
                    }
                    this._storeInt((_33_ + 92), 7);
                }
                while (false);
                label$18:
                do {
                    if ((this._loadInt((_33_ + 92))) != 0) {
                        break label$18;
                    }
                    sqlite3BtreeEnterAll((this._loadInt((_33_ + 88))));
                    this._storeInt((_33_ + 92), (sqlite3Init((this._loadInt((_33_ + 88))), (_33_ + 60))));
                }
                while (false);
                if ((this._loadInt((_33_ + 92))) == 0) {
                    break label$2;
                }
                _32_ = this._storeInt((_33_ + 44), ((this._loadInt(((this._loadInt((_33_ + 88))) + 4))) + -1));
                label$19:
                do {
                    if ((this._loadInt((((this._loadInt(((this._loadInt((_33_ + 88))) + 8))) + (_32_ << 4)) + 4))) == 0) {
                        break label$19;
                    }
                    sqlite3BtreeClose((this._loadInt((((this._loadInt(((this._loadInt((_33_ + 88))) + 8))) + ((this._loadInt((_33_ + 44))) << 4)) + 4))));
                    _30_ = this._storeInt((((this._loadInt(((_32_ = this._loadInt((_33_ + 88))) + 8))) + (_31_ = (this._loadInt((_33_ + 44))) << 4)) + 4), 0);
                    this._storeInt((((this._loadInt((_32_ + 8))) + _31_) + 12), _30_);
                }
                while (false);
                sqlite3ResetInternalSchema((this._loadInt((_33_ + 88))), -1);
                this._storeInt(((this._loadInt((_33_ + 88))) + 4), (this._loadInt((_33_ + 44))));
                label$20:
                do {
                    label$21:
                    do {
                        if ((this._loadInt((_33_ + 92))) == 7) {
                            break label$21;
                        }
                        if ((this._loadInt((_33_ + 92))) != 3082) {
                            break label$20;
                        }
                    }
                    while (false);
                    this._storeInt8(((_32_ = this._loadInt((_33_ + 88))) + 30), 1);
                    sqlite3DbFree(_32_, (this._loadInt((_33_ + 60))));
                    this._storeInt((_33_ + 60), (sqlite3MPrintf((this._loadInt((_33_ + 88))), 29616, 0)));
                    break label$3;
                }
                while (false);
                if ((this._loadInt((_33_ + 60))) != 0) {
                    break label$3;
                }
                _32_ = this._loadInt((_33_ + 88));
                this._storeInt((_33_ + 32), (this._loadInt((_33_ + 80))));
                this._storeInt((_33_ + 60), (sqlite3MPrintf(_32_, 42352, (_33_ + 32))));
            }
            while (false);
            label$22:
            do {
                if ((this._loadInt((_33_ + 60))) == 0) {
                    break label$22;
                }
                sqlite3_result_error((this._loadInt((_33_ + 108))), (this._loadInt((_33_ + 60))), -1);
                sqlite3DbFree((this._loadInt((_33_ + 88))), (this._loadInt((_33_ + 60))));
            }
            while (false);
            if ((this._loadInt((_33_ + 92))) == 0) {
                break label$2;
            }
            sqlite3_result_error_code((this._loadInt((_33_ + 108))), (this._loadInt((_33_ + 92))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 112));
        return;
    }

    @Override()
    public final int sqlite3PagerLockingMode(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), _31_)) < 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 12))) != 0) {
                break label$0;
            }
            if ((sqlite3WalHeapMemory((this._loadInt(((this._loadInt((_32_ + 12))) + 172))))) != 0) {
                break label$0;
            }
            this._storeInt8(((this._loadInt((_32_ + 12))) + 4), (this._loadInt((_32_ + 8))));
        }
        while (false);
        _31_ = this._loadInt8u(((this._loadInt((_32_ + 12))) + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3BtreeSecureDelete(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_32_ + 8))) == 0) {
                    break label$1;
                }
                sqlite3BtreeEnter((this._loadInt((_32_ + 8))));
                label$2:
                do {
                    if ((this._loadInt((_32_ + 4))) < 0) {
                        break label$2;
                    }
                    this._storeInt8(((this._loadInt(((this._loadInt((_32_ + 8))) + 4))) + 18), (((this._loadInt((_32_ + 4))) != 0) ? 1 : 0));
                }
                while (false);
                this._storeInt((_32_ + 12), (this._storeInt(_32_, (this._loadInt8u(((this._loadInt(((this._loadInt((_32_ + 8))) + 4))) + 18))))));
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
    public final int sqlite3WalHeapMemory(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) == 0) {
                break label$0;
            }
            _31_ = ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 38))) == 2) ? 1 : 0;
        }
        while (false);
        return _31_;
    }

    @Override()
    public final void sqlite3CodeVerifyNamedSchema(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 20), (this._loadInt((this._loadInt((_32_ + 28))))));
        this._storeInt((_32_ + 16), 0);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 16))) >= (this._loadInt(((this._loadInt((_32_ + 20))) + 4)))) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt(((this._storeInt((_32_ + 12), ((this._loadInt(((this._loadInt((_32_ + 20))) + 8))) + ((this._loadInt((_32_ + 16))) << 4)))) + 4))) == 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._loadInt((_32_ + 24))) == 0) {
                            break label$3;
                        }
                        if ((sqlite3StrICmp((this._loadInt((_32_ + 24))), (this._loadInt((this._loadInt((_32_ + 12))))))) != 0) {
                            break label$2;
                        }
                    }
                    while (false);
                    sqlite3CodeVerifySchema((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 16))));
                }
                while (false);
                this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void sqlite3DropTriggerPtr(int _30_, int _31_)
    {
        int _32_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_32_ + 40), _31_);
        this._storeInt((_32_ + 28), (this._loadInt((this._loadInt((_32_ + 44))))));
        this._storeInt((_32_ + 24), (sqlite3SchemaToIndex((this._loadInt((this._loadInt((_32_ + 44))))), (this._loadInt(((this._loadInt((_32_ + 40))) + 20))))));
        this._storeInt((_32_ + 36), (tableOfTrigger((this._loadInt((_32_ + 40))))));
        this._storeInt((_32_ + 20), 16);
        this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 28))) + 8))) + ((this._loadInt((_32_ + 24))) << 4)))));
        _temp$0 = 32464;
        _temp$1 = 32496;
        _temp$2 = ((this._loadInt((_32_ + 24))) == 1) ? _temp$0 : _temp$1;
        this._storeInt((_32_ + 12), _temp$2);
        label$0:
        do {
            if ((this._loadInt((_32_ + 24))) != 1) {
                break label$0;
            }
            this._storeInt((_32_ + 20), 14);
        }
        while (false);
        label$1:
        do {
            if ((sqlite3AuthCheck((this._loadInt((_32_ + 44))), (this._loadInt((_32_ + 20))), (this._loadInt((this._loadInt((_32_ + 40))))), (this._loadInt((this._loadInt((_32_ + 36))))), (this._loadInt((_32_ + 16))))) != 0) {
                break label$1;
            }
            if ((sqlite3AuthCheck((this._loadInt((_32_ + 44))), 9, (this._loadInt((_32_ + 12))), 0, (this._loadInt((_32_ + 16))))) != 0) {
                break label$1;
            }
            if ((this._storeInt((_32_ + 32), (sqlite3GetVdbe((this._loadInt((_32_ + 44))))))) == 0) {
                break label$1;
            }
            sqlite3BeginWriteOperation((this._loadInt((_32_ + 44))), 0, (this._loadInt((_32_ + 24))));
            sqlite3OpenMasterTable((this._loadInt((_32_ + 44))), (this._loadInt((_32_ + 24))));
            _31_ = this._storeInt((_32_ + 8), (sqlite3VdbeAddOpList((this._loadInt((_32_ + 32))), 9, 42416)));
            sqlite3VdbeChangeP4((this._loadInt((_32_ + 32))), (_31_ + 1), (this._loadInt((this._loadInt((_32_ + 40))))), 0);
            sqlite3VdbeChangeP4((this._loadInt((_32_ + 32))), ((this._loadInt((_32_ + 8))) + 4), 42464, -2);
            sqlite3ChangeCookie((this._loadInt((_32_ + 44))), (this._loadInt((_32_ + 24))));
            sqlite3VdbeAddOp2((this._loadInt((_32_ + 32))), 43, 0, 0);
            sqlite3VdbeAddOp4((this._loadInt((_32_ + 32))), 103, (this._loadInt((_32_ + 24))), 0, 0, (this._loadInt((this._loadInt((_32_ + 40))))), 0);
            if ((this._loadInt(((this._loadInt((_32_ + 44))) + 72))) > 2) {
                break label$1;
            }
            this._storeInt(((this._loadInt((_32_ + 44))) + 72), 3);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 48));
        return;
    }

    @Override()
    public final int tableOfTrigger(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (sqlite3Strlen30((this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 4))))));
        _30_ = sqlite3HashFind(((this._loadInt(((_32_ = this._loadInt((_31_ + 12))) + 24))) + 8), (this._loadInt((_32_ + 4))), _30_);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void sqlite3OpenMasterTable(int _30_, int _31_)
    {
        int _32_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), (sqlite3GetVdbe((this._loadInt((_32_ + 12))))));
        _temp$0 = 32464;
        _temp$1 = 32496;
        _temp$2 = (_31_ == 1) ? _temp$0 : _temp$1;
        sqlite3TableLock((this._loadInt((_32_ + 12))), (_31_ = this._loadInt((_32_ + 8))), 1, 1, _temp$2);
        sqlite3VdbeAddOp3((this._loadInt((_32_ + 4))), 39, 0, 1, (this._loadInt((_32_ + 8))));
        sqlite3VdbeChangeP4((this._loadInt((_32_ + 4))), -1, 5, -14);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_32_ + 12))) + 68))) != 0) {
                break label$0;
            }
            this._storeInt(((this._loadInt((_32_ + 12))) + 68), 1);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int triggerStepAllocate(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt8((_33_ + 27), _31_);
        this._storeInt((_33_ + 20), _32_);
        label$0:
        do {
            if ((this._storeInt((_33_ + 16), (sqlite3DbMallocZero((this._loadInt((_33_ + 28))), ((this._loadInt((_32_ + 4))) + 40))))) == 0) {
                break label$0;
            }
            memcpy((this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 16))) + 40))), (this._loadInt((_32_ = this._loadInt((_33_ + 20))))), (this._loadInt((_32_ + 4))));
            this._storeInt(((_32_ = this._loadInt((_33_ + 16))) + 12), (this._loadInt((_33_ + 12))));
            this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt((_33_ + 20))) + 4))));
            this._storeInt8((this._loadInt((_33_ + 16))), (this._loadInt8u((_33_ + 27))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 16));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int sqlite3SrcListLookup(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 4), ((_31_ = this._storeInt((_32_ + 8), _31_)) + 8));
        this._storeInt(_32_, (sqlite3LocateTable((this._loadInt((_32_ + 12))), 0, (this._loadInt((_31_ + 12))), (this._loadInt((_31_ + 8))))));
        sqlite3DeleteTable((this._loadInt((this._loadInt((_32_ + 12))))), (this._loadInt(((this._loadInt((_32_ + 4))) + 12))));
        label$0:
        do {
            if ((this._storeInt(((this._loadInt((_32_ + 4))) + 12), (this._loadInt(_32_)))) == 0) {
                break label$0;
            }
            this._storeInt16(((_31_ = this._loadInt(_32_)) + 32), ((this._loadInt16u((_31_ + 32))) + 1));
        }
        while (false);
        label$1:
        do {
            if ((sqlite3IndexedByLookup((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 4))))) == 0) {
                break label$1;
            }
            this._storeInt(_32_, 0);
        }
        while (false);
        _31_ = this._loadInt(_32_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3FixInit(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeInt((_35_ + 20), _31_);
        this._storeInt((_35_ + 16), _32_);
        this._storeInt((_35_ + 12), _33_);
        this._storeInt((_35_ + 8), _34_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_35_ + 16))) < 0) {
                    break label$1;
                }
                if ((this._loadInt((_35_ + 16))) != 1) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt((_35_ + 28), 0);
            return (this._loadInt((_35_ + 28)));
        }
        while (false);
        _34_ = this._storeInt((_35_ + 4), (this._loadInt((this._loadInt((_35_ + 20))))));
        this._storeInt((_33_ = this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))));
        this._storeInt((_33_ + 4), (this._loadInt(((this._loadInt((_34_ + 8))) + ((this._loadInt((_35_ + 16))) << 4)))));
        this._storeInt(((this._loadInt((_35_ + 24))) + 8), (this._loadInt((_35_ + 12))));
        this._storeInt(((this._loadInt((_35_ + 24))) + 12), (this._loadInt((_35_ + 8))));
        this._storeInt((_35_ + 28), 1);
        return (this._loadInt((_35_ + 28)));
    }

    @Override()
    public final int sqlite3FixSrcList(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
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
                            if ((this._storeInt((_32_ + 36), _31_)) == 0) {
                                break label$4;
                            }
                            this._storeInt((_32_ + 28), (this._loadInt(((this._loadInt((_32_ + 40))) + 4))));
                            this._storeInt((_32_ + 32), 0);
                            this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 36))) + 8));
                            label$6:
                            do {
                                label$5:
                                while (true) {
                                    if ((this._loadInt((_32_ + 32))) >= (this._loadInt16s((this._loadInt((_32_ + 36)))))) {
                                        break label$3;
                                    }
                                    label$7:
                                    do {
                                        label$8:
                                        do {
                                            if ((this._loadInt((this._loadInt((_32_ + 24))))) == 0) {
                                                break label$8;
                                            }
                                            if ((sqlite3StrICmp((this._loadInt((this._loadInt((_32_ + 24))))), (this._loadInt((_32_ + 28))))) == 0) {
                                                break label$7;
                                            }
                                            break label$1;
                                        }
                                        while (false);
                                        _31_ = sqlite3DbStrDup((this._loadInt((this._loadInt((this._loadInt((_32_ + 40))))))), (this._loadInt((_32_ + 28))));
                                        this._storeInt((this._loadInt((_32_ + 24))), _31_);
                                    }
                                    while (false);
                                    if ((sqlite3FixSelect((this._loadInt((_32_ + 40))), (this._loadInt(((this._loadInt((_32_ + 24))) + 16))))) != 0) {
                                        break label$2;
                                    }
                                    if ((sqlite3FixExpr((this._loadInt((_32_ + 40))), (this._loadInt(((this._loadInt((_32_ + 24))) + 28))))) != 0) {
                                        break label$6;
                                    }
                                    this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) + 1));
                                    this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 56));
                                    continue label$5;
                                }
                            }
                            while (false);
                            this._storeInt((_32_ + 44), 1);
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_32_ + 44), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_32_ + 44), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 44), 1);
                break label$0;
            }
            while (false);
            _30_ = this._loadInt((_31_ = this._loadInt((_32_ + 40))));
            _33_ = this._loadInt((_31_ + 8));
            _31_ = this._loadInt((_31_ + 12));
            this._storeInt((_32_ + 8), (this._loadInt((this._loadInt((_32_ + 24))))));
            this._storeInt((_32_ + 4), _31_);
            this._storeInt(_32_, _33_);
            sqlite3ErrorMsg(_30_, 42784, _32_);
            this._storeInt((_32_ + 44), 1);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 44));
        this._storeInt((0 + 4), (_32_ + 48));
        return _31_;
    }

    @Override()
    public final int sqlite3FixSelect(int _30_, int _31_)
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
                    label$3:
                    do {
                        label$4:
                        do {
                            label$6:
                            do {
                                label$5:
                                while (true) {
                                    if ((this._loadInt((_32_ + 4))) == 0) {
                                        break label$4;
                                    }
                                    if ((sqlite3FixExprList((this._loadInt((_32_ + 8))), (this._loadInt((this._loadInt((_32_ + 4))))))) != 0) {
                                        break label$3;
                                    }
                                    if ((sqlite3FixSrcList((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 8))))) != 0) {
                                        break label$2;
                                    }
                                    if ((sqlite3FixExpr((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 12))))) != 0) {
                                        break label$1;
                                    }
                                    if ((sqlite3FixExpr((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 20))))) != 0) {
                                        break label$6;
                                    }
                                    this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 4))) + 28))));
                                    continue label$5;
                                }
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
                    this._storeInt((_32_ + 12), 1);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 12), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), 1);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3FixExpr(int _30_, int _31_)
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
                    label$3:
                    do {
                        label$5:
                        do {
                            label$4:
                            while (true) {
                                if ((this._loadInt((_32_ + 4))) == 0) {
                                    break label$3;
                                }
                                if (((this._loadInt16u(((this._loadInt((_32_ + 4))) + 2))) & 8192) != 0) {
                                    break label$3;
                                }
                                label$6:
                                do {
                                    label$7:
                                    do {
                                        if (((this._loadInt16u(((this._loadInt((_32_ + 4))) + 2))) & 2048) == 0) {
                                            break label$7;
                                        }
                                        if ((sqlite3FixSelect((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 16))))) == 0) {
                                            break label$6;
                                        }
                                        break label$2;
                                    }
                                    while (false);
                                    if ((sqlite3FixExprList((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 16))))) != 0) {
                                        break label$1;
                                    }
                                }
                                while (false);
                                if ((sqlite3FixExpr((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 12))))) != 0) {
                                    break label$5;
                                }
                                this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 4))) + 8))));
                                continue label$4;
                            }
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
                this._storeInt((_32_ + 12), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), 1);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3FixExprList(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._storeInt((_32_ + 20), _31_)) == 0) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 16), 0);
                    this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 20))) + 12))));
                    label$4:
                    do {
                        label$3:
                        while (true) {
                            if ((this._loadInt((_32_ + 16))) >= (this._loadInt((this._loadInt((_32_ + 20)))))) {
                                break label$1;
                            }
                            if ((sqlite3FixExpr((this._loadInt((_32_ + 24))), (this._loadInt((this._loadInt((_32_ + 12))))))) != 0) {
                                break label$4;
                            }
                            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                            this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 20));
                            continue label$3;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 28), 1);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 28), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int sqlite3FixTriggerStep(int _30_, int _31_)
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
                    label$3:
                    do {
                        label$5:
                        do {
                            label$4:
                            while (true) {
                                if ((this._loadInt((_32_ + 4))) == 0) {
                                    break label$3;
                                }
                                if ((sqlite3FixSelect((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 8))))) != 0) {
                                    break label$2;
                                }
                                if ((sqlite3FixExpr((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 20))))) != 0) {
                                    break label$1;
                                }
                                if ((sqlite3FixExprList((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 24))))) != 0) {
                                    break label$5;
                                }
                                this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 4))) + 32))));
                                continue label$4;
                            }
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
                this._storeInt((_32_ + 12), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), 1);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void sqlite3VdbeRunOnlyOnce(int _30_)
    {
        int _31_ = 0;
        _31_ = this._loadInt((0 + 4));
        this._storeInt8((_30_ + 100), 1);
        this._storeInt(((_31_ - 16) + 12), _30_);
        return;
    }

    @Override()
    public final void returnSingleInt(int _30_, int _31_, long _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeLong((_33_ + 16), _32_);
        this._storeInt((_33_ + 12), (sqlite3GetVdbe((this._loadInt((_33_ + 28))))));
        this._storeInt((_33_ + 8), (this._storeInt(((_31_ = this._loadInt((_33_ + 28))) + 72), ((this._loadInt((_31_ + 72))) + 1))));
        label$0:
        do {
            if ((this._storeInt((_33_ + 4), (sqlite3DbMallocRaw((this._loadInt((this._loadInt((_33_ + 28))))), 8)))) == 0) {
                break label$0;
            }
            memcpy((this._loadInt((_33_ + 4))), (_33_ + 16), 8);
        }
        while (false);
        sqlite3VdbeAddOp4((this._loadInt((_33_ + 12))), 8, 0, (this._loadInt((_33_ + 8))), 0, (this._loadInt((_33_ + 4))), -13);
        sqlite3VdbeSetNumCols((this._loadInt((_33_ + 12))), 1);
        sqlite3VdbeSetColName((this._loadInt((_33_ + 12))), 0, 0, (this._loadInt((_33_ + 24))), 0);
        sqlite3VdbeAddOp2((this._loadInt((_33_ + 12))), 16, (this._loadInt((_33_ + 8))), 1);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int getLockingMode(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((sqlite3StrICmp((this._loadInt((_31_ + 8))), 43120)) != 0) {
                        break label$2;
                    }
                    this._storeInt((_31_ + 12), 1);
                    break label$0;
                }
                while (false);
                if ((sqlite3StrICmp((this._loadInt((_31_ + 8))), 43104)) != 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 12), -1);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3JournalModename(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), _30_)) != 6) {
                break label$0;
            }
            this._storeInt((_31_ + 12), 0);
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        this._storeInt((_31_ + 12), (this._loadInt((((this._loadInt((_31_ + 8))) << 2) + 45328))));
        return (this._loadInt((_31_ + 12)));
    }

    @Override()
    public final long sqlite3PagerJournalSizeLimit(int _30_, long _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._storeLong(_32_, _31_)) < -1L) {
                break label$0;
            }
            _31_ = this._storeLong(((_30_ = this._loadInt((_32_ + 12))) + 136), (this._loadLong(_32_)));
            sqlite3WalLimit((this._loadInt((_30_ + 172))), _31_);
        }
        while (false);
        _31_ = this._loadLong(((this._loadInt((_32_ + 12))) + 136));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3BtreeGetAutoVacuum(int _30_)
    {
        int _31_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        sqlite3BtreeEnter((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        _30_ = 0;
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt(((this._loadInt((_31_ + 12))) + 4))) + 21))) == 0) {
                break label$0;
            }
            _temp$0 = 2;
            _temp$1 = 1;
            _temp$2 = ((this._loadInt8u(((this._loadInt(((this._loadInt((_31_ + 12))) + 4))) + 22))) != 0) ? _temp$0 : _temp$1;
            _30_ = _temp$2;
        }
        while (false);
        this._storeInt((_31_ + 8), _30_);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int getAutoVacuum(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((sqlite3StrICmp((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)), 45296)) != 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 12), 0);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((sqlite3StrICmp((this._loadInt((_31_ + 8))), 44368)) != 0) {
                    break label$2;
                }
                this._storeInt((_31_ + 12), 1);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((sqlite3StrICmp((this._loadInt((_31_ + 8))), 45312)) != 0) {
                    break label$3;
                }
                this._storeInt((_31_ + 12), 2);
                break label$0;
            }
            while (false);
            _30_ = 0;
            label$4:
            do {
                if ((this._storeInt((_31_ + 4), (sqlite3Atoi((this._loadInt((_31_ + 8))))))) < 0) {
                    break label$4;
                }
                if ((this._loadInt((_31_ + 4))) > 2) {
                    break label$4;
                }
                _30_ = this._loadInt((_31_ + 4));
            }
            while (false);
            this._storeInt((_31_ + 12), (_30_ & 255));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3BtreeSetAutoVacuum(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 28))) + 4))));
        _31_ = this._storeInt((_32_ + 16), 0);
        this._storeInt8((_32_ + 15), (this._loadInt((_32_ + 24))));
        sqlite3BtreeEnter((this._loadInt((_32_ + 28))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 20))) + 17))) == 0) {
                    break label$1;
                }
                if ((((this._loadInt8u((_32_ + 15))) != _31_) ? 1 : 0) == (this._loadInt8u(((this._loadInt((_32_ + 20))) + 21)))) {
                    break label$1;
                }
                this._storeInt((_32_ + 16), 8);
                break label$0;
            }
            while (false);
            this._storeInt8(((_30_ = this._loadInt((_32_ + 20))) + 22), (((_33_ = this._loadInt8u((_32_ + 15))) == 2) ? 1 : 0));
            this._storeInt8((_30_ + 21), ((_33_ != _31_) ? 1 : 0));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 16));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int changeTempStorage(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 16), (getTempStore((this._storeInt((_32_ + 20), _31_)))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._storeInt((_32_ + 12), (this._loadInt((this._loadInt((_32_ + 24))))))) + 29))) != (this._loadInt((_32_ + 16)))) {
                    break label$1;
                }
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((invalidateTempStorage((this._loadInt((_32_ + 24))))) == 0) {
                    break label$2;
                }
                this._storeInt((_32_ + 28), 1);
                break label$0;
            }
            while (false);
            this._storeInt8(((this._loadInt((_32_ + 12))) + 29), (this._loadInt((_32_ + 16))));
            this._storeInt((_32_ + 28), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int invalidateTempStorage(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 4), (this._loadInt((this._storeInt((_31_ + 8), _30_)))))) + 8))) + 20))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_31_ + 4))) + 28))) == 0) {
                            break label$3;
                        }
                        if ((sqlite3BtreeIsInReadTrans((this._loadInt(((this._loadInt(((this._loadInt((_31_ + 4))) + 8))) + 20))))) == 0) {
                            break label$2;
                        }
                    }
                    while (false);
                    sqlite3ErrorMsg((this._loadInt((_31_ + 8))), 45216, 0);
                    this._storeInt((_31_ + 12), 1);
                    break label$0;
                }
                while (false);
                sqlite3BtreeClose((this._loadInt(((this._loadInt(((this._loadInt((_31_ + 4))) + 8))) + 20))));
                this._storeInt(((this._loadInt(((_30_ = this._loadInt((_31_ + 4))) + 8))) + 20), 0);
                sqlite3ResetInternalSchema(_30_, -1);
            }
            while (false);
            this._storeInt((_31_ + 12), 0);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int flagPragma(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_33_ + 36), _31_);
        this._storeInt((_33_ + 32), _32_);
        this._storeInt((_33_ + 28), 0);
        this._storeInt((_33_ + 24), 44704);
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
                                label$7:
                                do {
                                    label$6:
                                    while (true) {
                                        if ((this._loadInt((_33_ + 28))) > 14) {
                                            break label$5;
                                        }
                                        if ((sqlite3StrICmp((this._loadInt((_33_ + 36))), (this._loadInt((this._loadInt((_33_ + 24))))))) == 0) {
                                            break label$7;
                                        }
                                        this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) + 1));
                                        this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + 8));
                                        continue label$6;
                                    }
                                }
                                while (false);
                                this._storeInt((_33_ + 20), (this._loadInt((this._loadInt((_33_ + 40))))));
                                if ((this._storeInt((_33_ + 16), (sqlite3GetVdbe((this._loadInt((_33_ + 40))))))) == 0) {
                                    break label$1;
                                }
                                if ((this._loadInt((_33_ + 32))) == 0) {
                                    break label$4;
                                }
                                this._storeInt((_33_ + 12), (this._loadInt(((this._loadInt((_33_ + 24))) + 4))));
                                label$8:
                                do {
                                    if ((this._loadInt8u(((this._loadInt((_33_ + 20))) + 28))) != 0) {
                                        break label$8;
                                    }
                                    this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) & -67108865));
                                }
                                while (false);
                                if ((sqlite3GetBoolean((this._loadInt((_33_ + 32))))) == 0) {
                                    break label$3;
                                }
                                this._storeInt(((_32_ = this._loadInt((_33_ + 20))) + 12), ((this._loadInt((_32_ + 12))) | (this._loadInt((_33_ + 12)))));
                                break label$2;
                            }
                            while (false);
                            this._storeInt((_33_ + 44), 0);
                            break label$0;
                        }
                        while (false);
                        returnSingleInt((this._loadInt((_33_ + 40))), (this._loadInt((_32_ = this._loadInt((_33_ + 24))))), (((((this._loadInt(((this._loadInt((_33_ + 20))) + 12))) & (this._loadInt((_32_ + 4)))) != 0) ? 1 : 0) & 4294967295L));
                        break label$1;
                    }
                    while (false);
                    this._storeInt(((_32_ = this._loadInt((_33_ + 20))) + 12), ((this._loadInt((_32_ + 12))) & ((this._loadInt((_33_ + 12))) ^ -1)));
                }
                while (false);
                sqlite3VdbeAddOp2((this._loadInt((_33_ + 16))), 122, 0, 0);
            }
            while (false);
            this._storeInt((_33_ + 44), 1);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 44));
        this._storeInt((0 + 4), (_33_ + 48));
        return _32_;
    }

    @Override()
    public final int actionName(int _30_)
    {
        int _31_ = 0;
        this._storeInt8(((_31_ = (this._loadInt((0 + 4))) - 16) + 15), _30_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if (((_30_ = (this._loadInt8u((_31_ + 15))) + -6) & 4294967295L) > (3 & 4294967295L)) {
                            break label$3;
                        }
                        label$4:
                        do {
                            switch (_30_) {
                                case 0: {
                                    break label$4;
                                }
                                case 1: {
                                    break label$2;
                                }
                                case 2: {
                                    break label$1;
                                }
                                case 3: {
                                    break label$0;
                                }
                                default: {
                                    break label$4;
                                }
                            }
                        }
                        while (false);
                        this._storeInt((_31_ + 8), 44672);
                        return (this._loadInt((_31_ + 8)));
                    }
                    while (false);
                    this._storeInt((_31_ + 8), 44688);
                    return (this._loadInt((_31_ + 8)));
                }
                while (false);
                this._storeInt((_31_ + 8), 44624);
                return (this._loadInt((_31_ + 8)));
            }
            while (false);
            this._storeInt((_31_ + 8), 44640);
            return (this._loadInt((_31_ + 8)));
        }
        while (false);
        this._storeInt((_31_ + 8), 44656);
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final void sqlite3RegisterLikeFunctions(int _30_, int _31_)
    {
        int _32_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 4), 44608);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 4), 28016);
        }
        while (false);
        sqlite3CreateFunc((this._loadInt((_32_ + 12))), 28032, 2, 1, (this._loadInt((_32_ + 4))), 42, 0, 0, 0);
        sqlite3CreateFunc((this._loadInt((_32_ + 12))), 28032, 3, 1, (this._loadInt((_32_ + 4))), 42, 0, 0, 0);
        sqlite3CreateFunc((this._loadInt((_32_ + 12))), 28000, 2, 1, 27984, 42, 0, 0, 0);
        setLikeOptFlag((this._loadInt((_32_ + 12))), 28000, 3);
        _temp$0 = 3;
        _temp$1 = 1;
        _temp$2 = ((this._loadInt((_32_ + 8))) != 0) ? _temp$0 : _temp$1;
        setLikeOptFlag((this._loadInt((_32_ + 12))), 28032, _temp$2);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int sqlite3OpenTableAndIndices(int _30_, int _31_, int _32_, int _33_)
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
                if (((this._loadInt8u(((this._loadInt((_34_ + 36))) + 34))) & 16) == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 44), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 20), (sqlite3SchemaToIndex((this._loadInt((this._loadInt((_34_ + 40))))), (this._loadInt(((this._loadInt((_34_ + 36))) + 68))))));
            this._storeInt((_34_ + 12), (sqlite3GetVdbe((this._loadInt((_34_ + 40))))));
            sqlite3OpenTable((this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 32))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 28))));
            _32_ = this._storeInt((_34_ + 24), 1);
            this._storeInt((_34_ + 16), (this._loadInt(((this._loadInt((_34_ + 36))) + 16))));
            label$3:
            do {
                label$2:
                while (true) {
                    if ((this._loadInt((_34_ + 16))) == 0) {
                        break label$3;
                    }
                    _33_ = this._storeInt((_34_ + 8), (sqlite3IndexKeyinfo((this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 16))))));
                    sqlite3VdbeAddOp4((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 28))), ((this._loadInt((_34_ + 24))) + (this._loadInt((_34_ + 32)))), (this._loadInt(((this._loadInt((_34_ + 16))) + 20))), (this._loadInt((_34_ + 20))), _33_, -16);
                    this._storeInt((_34_ + 16), (this._loadInt(((this._loadInt((_34_ + 16))) + 32))));
                    this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + _32_));
                    continue label$2;
                }
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt(((this._loadInt((_34_ + 40))) + 68))) >= ((this._loadInt((_34_ + 32))) + (this._loadInt((_34_ + 24))))) {
                    break label$4;
                }
                this._storeInt(((this._loadInt((_34_ + 40))) + 68), ((this._loadInt((_34_ + 32))) + (this._loadInt((_34_ + 24)))));
            }
            while (false);
            this._storeInt((_34_ + 44), ((this._loadInt((_34_ + 24))) + -1));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int sqlite3BtreeSetSafetyLevel(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        this._storeInt((_34_ + 12), (this._loadInt(((this._loadInt((_34_ + 28))) + 4))));
        sqlite3BtreeEnter((this._loadInt((_34_ + 28))));
        sqlite3PagerSetSafetyLevel((this._loadInt((this._loadInt((_34_ + 12))))), (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 16))));
        this._storeInt((0 + 4), (_34_ + 32));
        return 0;
    }

    @Override()
    public final void sqlite3PagerSetSafetyLevel(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        int _temp$3 = 0;
        int _temp$4 = 0;
        int _temp$5 = 0;
        this._storeInt(((_34_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        _33_ = 1;
        label$0:
        do {
            if ((this._loadInt((_34_ + 8))) == 1) {
                break label$0;
            }
            _33_ = ((this._loadInt8u(((this._loadInt((_34_ + 12))) + 12))) != 0) ? 1 : 0;
        }
        while (false);
        _temp$0 = 1;
        _temp$1 = 0;
        _temp$2 = (_33_ != 0) ? _temp$0 : _temp$1;
        this._storeInt8(((this._loadInt((_34_ + 12))) + 8), _temp$2);
        _33_ = 0;
        label$1:
        do {
            if ((this._loadInt((_34_ + 8))) != 3) {
                break label$1;
            }
            _33_ = ((this._loadInt8u(((this._loadInt((_34_ + 12))) + 12))) == 0) ? 1 : 0;
        }
        while (false);
        _temp$3 = 1;
        _temp$4 = 0;
        _temp$5 = (_33_ != 0) ? _temp$3 : _temp$4;
        this._storeInt8(((_32_ = this._loadInt((_34_ + 12))) + 9), _temp$5);
        label$2:
        do {
            if ((this._loadInt8u((_32_ + 8))) == 0) {
                break label$2;
            }
            this._storeInt8(((_34_ = this._loadInt((_34_ + 12))) + 11), (this._storeInt8((_34_ + 10), 0)));
            return;
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt((_34_ + 4))) == 0) {
                break label$3;
            }
            this._storeInt8(((_34_ = this._loadInt((_34_ + 12))) + 11), (this._storeInt8((_34_ + 10), 3)));
            return;
        }
        while (false);
        label$4:
        do {
            if ((this._loadInt(_34_)) == 0) {
                break label$4;
            }
            this._storeInt8(((_34_ = this._loadInt((_34_ + 12))) + 10), 3);
            this._storeInt8((_34_ + 11), 2);
            return;
        }
        while (false);
        this._storeInt8(((_34_ = this._loadInt((_34_ + 12))) + 11), (this._storeInt8((_34_ + 10), 2)));
        return;
    }

    @Override()
    public final void setLikeOptFlag(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt8((_33_ + 7), _32_);
        label$0:
        do {
            if ((this._storeInt(_33_, (sqlite3FindFunction((this._loadInt((_33_ + 12))), (_32_ = this._loadInt((_33_ + 8))), (sqlite3Strlen30(_32_)), 2, 1, 0)))) == 0) {
                break label$0;
            }
            this._storeInt8(((this._loadInt(_33_)) + 3), (this._loadInt8u((_33_ + 7))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int getTempStore(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8s((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)))) < 48) {
                    break label$1;
                }
                if ((this._loadInt8s((this._loadInt((_31_ + 8))))) > 50) {
                    break label$1;
                }
                this._storeInt((_31_ + 12), ((this._loadInt8s((this._loadInt((_31_ + 8))))) + -48));
                break label$0;
            }
            while (false);
            label$2:
            do {
                label$3:
                do {
                    if ((sqlite3StrICmp((this._loadInt((_31_ + 8))), 43632)) == 0) {
                        break label$3;
                    }
                    if ((sqlite3StrICmp((this._loadInt((_31_ + 8))), 45280)) == 0) {
                        break label$2;
                    }
                    this._storeInt((_31_ + 12), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_31_ + 12), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 12), 2);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void sqlite3WalLimit(int _30_, long _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeLong(_32_, _31_);
        label$0:
        do {
            if ((this._loadInt((_32_ + 12))) == 0) {
                break label$0;
            }
            this._storeLong(((this._loadInt((_32_ + 12))) + 16), (this._loadLong(_32_)));
        }
        while (false);
        return;
    }

    @Override()
    public final void destroyRootPage(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_33_ + 40), _31_);
        this._storeInt((_33_ + 36), _32_);
        this._storeInt((_33_ + 32), (sqlite3GetVdbe((this._loadInt((_33_ + 44))))));
        _32_ = this._storeInt((_33_ + 28), (sqlite3GetTempReg((this._loadInt((_33_ + 44))))));
        sqlite3VdbeAddOp3((this._loadInt((_33_ + 32))), 95, (this._loadInt((_33_ + 40))), _32_, (this._loadInt((_33_ + 36))));
        sqlite3MayAbort((this._loadInt((_33_ + 44))));
        _30_ = this._loadInt(((this._loadInt(((this._loadInt((_32_ = this._loadInt((_33_ + 44))))) + 8))) + ((_31_ = this._loadInt((_33_ + 36))) << 4)));
        this._storeInt((_33_ + 12), (this._storeInt((_33_ + 16), (this._loadInt((_33_ + 28))))));
        this._storeInt((_33_ + 8), (this._loadInt((_33_ + 40))));
        _temp$0 = 32464;
        _temp$1 = 32496;
        _temp$2 = (_31_ == 1) ? _temp$0 : _temp$1;
        this._storeInt((_33_ + 4), _temp$2);
        this._storeInt(_33_, _30_);
        sqlite3NestedParse(_32_, 45664, _33_);
        sqlite3ReleaseTempReg((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 28))));
        this._storeInt((0 + 4), (_33_ + 48));
        return;
    }

    @Override()
    public final int sqlite3ExprSetColl(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if ((this._loadInt((_32_ + 12))) == 0) {
                break label$0;
            }
            if ((this._loadInt((_32_ + 8))) == 0) {
                break label$0;
            }
            this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 20), (this._loadInt((_32_ + 8))));
            this._storeInt16((_31_ + 2), ((this._loadInt16u((_31_ + 2))) | 256));
        }
        while (false);
        return (this._loadInt((_32_ + 12)));
    }

    @Override()
    public final int sqlite3ArrayAllocate(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_,
            int _36_)
    {
        int _37_ = 0;
        this._storeInt(((_37_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_37_ + 36), _31_);
        this._storeInt((_37_ + 32), _32_);
        this._storeInt((_37_ + 28), _33_);
        this._storeInt((_37_ + 24), _34_);
        this._storeInt((_37_ + 20), _35_);
        this._storeInt((_37_ + 16), _36_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((this._loadInt((_37_ + 24))))) < (this._loadInt((this._loadInt((_37_ + 20)))))) {
                        break label$2;
                    }
                    _36_ = this._storeInt((_37_ + 4), (((this._loadInt((this._loadInt((_37_ + 20))))) << 1) + (this._loadInt((_37_ + 28)))));
                    if ((this._storeInt((_37_ + 8), (sqlite3DbRealloc((this._loadInt((_37_ + 40))), (this._loadInt((_37_ + 36))), (_36_ * (this._loadInt((_37_ + 32)))))))) == 0) {
                        break label$1;
                    }
                    _36_ = sqlite3DbMallocSize((this._loadInt((_37_ + 40))), (this._loadInt((_37_ + 8))));
                    this._storeInt((this._loadInt((_37_ + 20))), (_36_ / (this._loadInt((_37_ + 32)))));
                    this._storeInt((_37_ + 36), (this._loadInt((_37_ + 8))));
                }
                while (false);
                memset(((this._storeInt((_37_ + 12), (this._loadInt((_37_ + 36))))) + ((this._loadInt((this._loadInt((_37_ + 24))))) * (_36_ = this._loadInt((_37_ + 32))))), 0, _36_);
                this._storeInt((this._loadInt((_37_ + 16))), (this._loadInt((_36_ = this._loadInt((_37_ + 24))))));
                this._storeInt(_36_, ((this._loadInt(_36_)) + 1));
                this._storeInt((_37_ + 44), (this._loadInt((_37_ + 36))));
                break label$0;
            }
            while (false);
            this._storeInt((this._loadInt((_37_ + 16))), -1);
            this._storeInt((_37_ + 44), (this._loadInt((_37_ + 36))));
        }
        while (false);
        _36_ = this._loadInt((_37_ + 44));
        this._storeInt((0 + 4), (_37_ + 48));
        return _36_;
    }

    @Override()
    public final int sqlite3TriggersExist(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        this._storeInt((_35_ + 4), (this._storeInt((_35_ + 8), 0)));
        label$0:
        do {
            if (((this._loadInt8u(((this._loadInt((this._loadInt((_35_ + 28))))) + 15))) & 64) == 0) {
                break label$0;
            }
            this._storeInt((_35_ + 4), (sqlite3TriggerList((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 24))))));
        }
        while (false);
        this._storeInt(_35_, (this._loadInt((_35_ + 4))));
        label$2:
        do {
            label$1:
            while (true) {
                if ((this._loadInt(_35_)) == 0) {
                    break label$2;
                }
                label$3:
                do {
                    if ((this._loadInt8u(((this._loadInt(_35_)) + 8))) != (this._loadInt((_35_ + 20)))) {
                        break label$3;
                    }
                    if ((checkColumnOverlap((this._loadInt(((this._loadInt(_35_)) + 16))), (this._loadInt((_35_ + 16))))) == 0) {
                        break label$3;
                    }
                    this._storeInt((_35_ + 8), ((this._loadInt((_35_ + 8))) | (this._loadInt8u(((this._loadInt(_35_)) + 9)))));
                }
                while (false);
                this._storeInt(_35_, (this._loadInt(((this._loadInt(_35_)) + 32))));
                continue label$1;
            }
        }
        while (false);
        label$4:
        do {
            if ((this._loadInt((_35_ + 12))) == 0) {
                break label$4;
            }
            this._storeInt((this._loadInt((_35_ + 12))), (this._loadInt((_35_ + 8))));
        }
        while (false);
        _34_ = 0;
        label$5:
        do {
            if ((this._loadInt((_35_ + 8))) == 0) {
                break label$5;
            }
            _34_ = this._loadInt((_35_ + 4));
        }
        while (false);
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3IsReadOnly(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_33_ + 36), _31_);
        this._storeInt((_33_ + 32), _32_);
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
                            if (((this._loadInt8u(((this._loadInt((_33_ + 36))) + 34))) & 16) == 0) {
                                break label$4;
                            }
                            if ((this._loadInt(((this._loadInt((this._loadInt(((sqlite3GetVTable((this._loadInt((this._loadInt((_33_ + 40))))), (this._loadInt((_33_ + 36))))) + 4))))) + 52))) == 0) {
                                break label$3;
                            }
                        }
                        while (false);
                        label$5:
                        do {
                            if (((this._loadInt8u(((this._loadInt((_33_ + 36))) + 34))) & 1) == 0) {
                                break label$5;
                            }
                            if (((this._loadInt8u(((this._loadInt((this._loadInt((_33_ + 40))))) + 14))) & 1) != 0) {
                                break label$5;
                            }
                            if ((this._loadInt8u(((this._loadInt((_33_ + 40))) + 19))) == 0) {
                                break label$3;
                            }
                        }
                        while (false);
                        if ((this._loadInt((_33_ + 32))) == 0) {
                            break label$2;
                        }
                        break label$1;
                    }
                    while (false);
                    _32_ = this._loadInt((_33_ + 40));
                    this._storeInt(_33_, (this._loadInt((this._loadInt((_33_ + 36))))));
                    sqlite3ErrorMsg(_32_, 46832, _33_);
                    this._storeInt((_33_ + 44), 1);
                    break label$0;
                }
                while (false);
                if ((this._loadInt(((this._loadInt((_33_ + 36))) + 28))) == 0) {
                    break label$1;
                }
                _32_ = this._loadInt((_33_ + 40));
                this._storeInt((_33_ + 16), (this._loadInt((this._loadInt((_33_ + 36))))));
                sqlite3ErrorMsg(_32_, 46864, (_33_ + 16));
                this._storeInt((_33_ + 44), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 44), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 44));
        this._storeInt((0 + 4), (_33_ + 48));
        return _32_;
    }

    @Override()
    public final void sqlite3VdbeCountChanges(int _30_)
    {
        int _31_ = 0;
        _31_ = this._loadInt((0 + 4));
        this._storeInt8((_30_ + 98), 1);
        this._storeInt(((_31_ - 16) + 12), _30_);
        return;
    }

    @Override()
    public final int xferOptimization(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 112))) + 104), _30_);
        this._storeInt((_35_ + 100), _31_);
        this._storeInt((_35_ + 96), _32_);
        this._storeInt((_35_ + 92), _33_);
        this._storeInt((_35_ + 88), _34_);
        _34_ = this._storeInt((_35_ + 20), 0);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_35_ + 96))) == 0) {
                        break label$2;
                    }
                    if ((sqlite3TriggerList((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 100))))) == 0) {
                        break label$1;
                    }
                    this._storeInt((_35_ + 108), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_35_ + 108), _34_);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt8u(((this._loadInt((_35_ + 100))) + 34))) & 16) == 0) {
                    break label$3;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt((_35_ + 92))) != 99) {
                    break label$4;
                }
                this._storeInt((_35_ + 92), 2);
            }
            while (false);
            label$5:
            do {
                if ((this._loadInt((_35_ + 92))) == 2) {
                    break label$5;
                }
                if ((this._loadInt((_35_ + 92))) == 1) {
                    break label$5;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$6:
            do {
                if ((this._loadInt16s((this._loadInt(((this._loadInt((_35_ + 96))) + 8))))) == 1) {
                    break label$6;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$7:
            do {
                if ((this._loadInt(((this._loadInt(((this._loadInt((_35_ + 96))) + 8))) + 24))) == 0) {
                    break label$7;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$8:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 96))) + 12))) == 0) {
                    break label$8;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$9:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 96))) + 24))) == 0) {
                    break label$9;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$10:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 96))) + 16))) == 0) {
                    break label$10;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$11:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 96))) + 40))) == 0) {
                    break label$11;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$12:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 96))) + 28))) == 0) {
                    break label$12;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$13:
            do {
                if (((this._loadInt16u(((this._loadInt((_35_ + 96))) + 6))) & 1) == 0) {
                    break label$13;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$14:
            do {
                if ((this._loadInt((this._storeInt((_35_ + 84), (this._loadInt((this._loadInt((_35_ + 96))))))))) == 1) {
                    break label$14;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$15:
            do {
                if ((this._loadInt8u((this._loadInt((this._loadInt(((this._loadInt((_35_ + 84))) + 12))))))) == 113) {
                    break label$15;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_35_ + 68), ((_34_ = this._loadInt(((this._loadInt((_35_ + 96))) + 8))) + 8));
            label$16:
            do {
                label$17:
                do {
                    label$18:
                    do {
                        if ((this._storeInt((_35_ + 80), (sqlite3LocateTable((this._loadInt((_35_ + 104))), 0, (this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 8))))))) == 0) {
                            break label$18;
                        }
                        if ((this._loadInt((_35_ + 80))) == (this._loadInt((_35_ + 100)))) {
                            break label$17;
                        }
                        if (((this._loadInt8u(((this._loadInt((_35_ + 80))) + 34))) & 16) == 0) {
                            break label$16;
                        }
                        this._storeInt((_35_ + 108), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_35_ + 108), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$19:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 80))) + 28))) == 0) {
                    break label$19;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$20:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 100))) + 8))) == (this._loadInt(((this._loadInt((_35_ + 80))) + 8)))) {
                    break label$20;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$21:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 100))) + 4))) == (this._loadInt(((this._loadInt((_35_ + 80))) + 4)))) {
                    break label$21;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_35_ + 64), 0);
            label$22:
            do {
                label$23:
                do {
                    label$24:
                    do {
                        label$25:
                        do {
                            label$27:
                            do {
                                label$26:
                                while (true) {
                                    if ((this._loadInt((_35_ + 64))) >= (this._loadInt(((this._loadInt((_35_ + 100))) + 8)))) {
                                        break label$25;
                                    }
                                    if ((this._loadInt8s((((this._loadInt(((this._loadInt((_35_ + 100))) + 12))) + (_34_ = (this._loadInt((_35_ + 64))) * 24)) + 22))) != (this._loadInt8s((((this._loadInt(((this._loadInt((_35_ + 80))) + 12))) + _34_) + 22)))) {
                                        break label$24;
                                    }
                                    if ((xferCompatibleCollation((this._loadInt((((this._loadInt(((this._loadInt((_35_ + 100))) + 12))) + (_34_ = (this._loadInt((_35_ + 64))) * 24)) + 16))), (this._loadInt((((this._loadInt(((this._loadInt((_35_ + 80))) + 12))) + _34_) + 16))))) == 0) {
                                        break label$23;
                                    }
                                    label$28:
                                    do {
                                        if ((this._loadInt8u((((this._loadInt(((this._loadInt((_35_ + 100))) + 12))) + ((this._loadInt((_35_ + 64))) * 24)) + 20))) == 0) {
                                            break label$28;
                                        }
                                        if ((this._loadInt8u((((this._loadInt(((this._loadInt((_35_ + 80))) + 12))) + ((this._loadInt((_35_ + 64))) * 24)) + 20))) == 0) {
                                            break label$27;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_35_ + 64), ((this._loadInt((_35_ + 64))) + 1));
                                    continue label$26;
                                }
                            }
                            while (false);
                            this._storeInt((_35_ + 108), 0);
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_35_ + 72), (this._loadInt(((this._loadInt((_35_ + 100))) + 16))));
                        label$30:
                        do {
                            label$29:
                            while (true) {
                                if ((this._loadInt((_35_ + 72))) == 0) {
                                    break label$22;
                                }
                                label$31:
                                do {
                                    if ((this._loadInt8u(((this._loadInt((_35_ + 72))) + 24))) == 0) {
                                        break label$31;
                                    }
                                    this._storeInt((_35_ + 20), 1);
                                }
                                while (false);
                                this._storeInt((_35_ + 76), (this._loadInt(((this._loadInt((_35_ + 80))) + 16))));
                                label$33:
                                do {
                                    label$32:
                                    while (true) {
                                        if ((this._loadInt((_35_ + 76))) == 0) {
                                            break label$33;
                                        }
                                        if ((xferCompatibleIndex((this._loadInt((_35_ + 72))), (this._loadInt((_35_ + 76))))) != 0) {
                                            break label$33;
                                        }
                                        this._storeInt((_35_ + 76), (this._loadInt(((this._loadInt((_35_ + 76))) + 32))));
                                        continue label$32;
                                    }
                                }
                                while (false);
                                if ((this._loadInt((_35_ + 76))) == 0) {
                                    break label$30;
                                }
                                this._storeInt((_35_ + 72), (this._loadInt(((this._loadInt((_35_ + 72))) + 32))));
                                continue label$29;
                            }
                        }
                        while (false);
                        this._storeInt((_35_ + 108), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_35_ + 108), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$34:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 100))) + 44))) == 0) {
                    break label$34;
                }
                if ((sqlite3ExprCompare((this._loadInt(((this._loadInt((_35_ + 80))) + 44))), (this._loadInt(((this._loadInt((_35_ + 100))) + 44))))) == 0) {
                    break label$34;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            label$35:
            do {
                if (((this._loadInt8u(((this._loadInt((this._loadInt((_35_ + 104))))) + 15))) & 4) == 0) {
                    break label$35;
                }
                if ((this._loadInt(((this._loadInt((_35_ + 100))) + 36))) == 0) {
                    break label$35;
                }
                this._storeInt((_35_ + 108), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_35_ + 60), (sqlite3SchemaToIndex((this._loadInt((this._loadInt((_35_ + 104))))), (this._loadInt(((this._loadInt((_35_ + 80))) + 68))))));
            this._storeInt((_35_ + 32), (sqlite3GetVdbe((this._loadInt((_35_ + 104))))));
            sqlite3CodeVerifySchema((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 60))));
            this._storeInt(((_34_ = this._loadInt((_35_ + 104))) + 68), ((_34_ = this._loadInt((_34_ + 68))) + 1));
            this._storeInt((_35_ + 56), _34_);
            this._storeInt(((_34_ = this._loadInt((_35_ + 104))) + 68), ((_34_ = this._loadInt((_34_ + 68))) + 1));
            this._storeInt((_35_ + 52), _34_);
            this._storeInt((_35_ + 24), (autoIncBegin((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 88))), (this._loadInt((_35_ + 100))))));
            sqlite3OpenTable((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 52))), (this._loadInt((_35_ + 88))), (this._loadInt((_35_ + 100))), 39);
            label$36:
            do {
                label$37:
                do {
                    label$38:
                    do {
                        if ((this._loadInt(((this._loadInt((_35_ + 100))) + 4))) > -1) {
                            break label$38;
                        }
                        if ((this._loadInt(((this._loadInt((_35_ + 100))) + 16))) != 0) {
                            break label$37;
                        }
                    }
                    while (false);
                    if ((this._loadInt((_35_ + 20))) != 0) {
                        break label$37;
                    }
                    this._storeInt((_35_ + 40), 0);
                    break label$36;
                }
                while (false);
                this._storeInt((_35_ + 48), (sqlite3VdbeAddOp2((this._loadInt((_35_ + 32))), 65, (this._loadInt((_35_ + 52))), 0)));
                this._storeInt((_35_ + 40), (sqlite3VdbeAddOp2((this._loadInt((_35_ + 32))), 1, 0, 0)));
                sqlite3VdbeJumpHere((this._loadInt((_35_ + 32))), (this._loadInt((_35_ + 48))));
            }
            while (false);
            sqlite3OpenTable((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 56))), (this._loadInt((_35_ + 60))), (this._loadInt((_35_ + 80))), 38);
            this._storeInt((_35_ + 36), (sqlite3VdbeAddOp2((this._loadInt((_35_ + 32))), 65, (this._loadInt((_35_ + 56))), 0)));
            this._storeInt((_35_ + 16), (sqlite3GetTempReg((this._loadInt((_35_ + 104))))));
            this._storeInt((_35_ + 12), (sqlite3GetTempReg((this._loadInt((_35_ + 104))))));
            label$39:
            do {
                label$40:
                do {
                    if ((this._loadInt(((this._loadInt((_35_ + 100))) + 4))) < 0) {
                        break label$40;
                    }
                    this._storeInt((_35_ + 48), (sqlite3VdbeAddOp2((this._loadInt((_35_ + 32))), 61, (this._loadInt((_35_ + 56))), (this._loadInt((_35_ + 12))))));
                    this._storeInt((_35_ + 44), (sqlite3VdbeAddOp3((this._loadInt((_35_ + 32))), 52, (this._loadInt((_35_ + 52))), 0, (this._loadInt((_35_ + 12))))));
                    sqlite3HaltConstraint((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 92))), 46656, -2);
                    sqlite3VdbeJumpHere((this._loadInt((_35_ + 32))), (this._loadInt((_35_ + 44))));
                    autoIncStep((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 12))));
                    break label$39;
                }
                while (false);
                label$41:
                do {
                    if ((this._loadInt(((this._loadInt((_35_ + 100))) + 16))) == 0) {
                        break label$41;
                    }
                    this._storeInt((_35_ + 48), (sqlite3VdbeAddOp2((this._loadInt((_35_ + 32))), 61, (this._loadInt((_35_ + 56))), (this._loadInt((_35_ + 12))))));
                    break label$39;
                }
                while (false);
                this._storeInt((_35_ + 48), (sqlite3VdbeAddOp2((this._loadInt((_35_ + 32))), 54, (this._loadInt((_35_ + 52))), (this._loadInt((_35_ + 12))))));
            }
            while (false);
            sqlite3VdbeAddOp2((this._loadInt((_35_ + 32))), 60, (this._loadInt((_35_ + 56))), (this._loadInt((_35_ + 16))));
            sqlite3VdbeAddOp3((this._loadInt((_35_ + 32))), 55, (this._loadInt((_35_ + 52))), (this._loadInt((_35_ + 16))), (this._loadInt((_35_ + 12))));
            sqlite3VdbeChangeP5((this._loadInt((_35_ + 32))), 11);
            sqlite3VdbeChangeP4((this._loadInt((_35_ + 32))), -1, (this._loadInt((this._loadInt((_35_ + 100))))), 0);
            sqlite3VdbeAddOp2((this._loadInt((_35_ + 32))), 67, (this._loadInt((_35_ + 56))), (this._loadInt((_35_ + 48))));
            this._storeInt((_35_ + 72), (this._loadInt(((this._loadInt((_35_ + 100))) + 16))));
            label$43:
            do {
                label$42:
                while (true) {
                    label$44:
                    do {
                        label$45:
                        do {
                            if ((this._loadInt((_35_ + 72))) == 0) {
                                break label$45;
                            }
                            this._storeInt((_35_ + 76), (this._loadInt(((this._loadInt((_35_ + 80))) + 16))));
                            label$46:
                            while (true) {
                                if ((this._loadInt((_35_ + 76))) == 0) {
                                    break label$44;
                                }
                                if ((xferCompatibleIndex((this._loadInt((_35_ + 72))), (this._loadInt((_35_ + 76))))) != 0) {
                                    break label$44;
                                }
                                this._storeInt((_35_ + 76), (this._loadInt(((this._loadInt((_35_ + 76))) + 32))));
                                continue label$46;
                            }
                        }
                        while (false);
                        sqlite3VdbeJumpHere((this._loadInt((_35_ + 32))), (this._loadInt((_35_ + 36))));
                        sqlite3ReleaseTempReg((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 12))));
                        sqlite3ReleaseTempReg((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 16))));
                        sqlite3VdbeAddOp2((this._loadInt((_35_ + 32))), 43, (this._loadInt((_35_ + 56))), 0);
                        sqlite3VdbeAddOp2((this._loadInt((_35_ + 32))), 43, (this._loadInt((_35_ + 52))), 0);
                        label$48:
                        do {
                            if ((this._loadInt((_35_ + 40))) == 0) {
                                break label$48;
                            }
                            sqlite3VdbeAddOp2((this._loadInt((_35_ + 32))), 6, 0, 0);
                            sqlite3VdbeJumpHere((this._loadInt((_35_ + 32))), (this._loadInt((_35_ + 40))));
                            sqlite3VdbeAddOp2((this._loadInt((_35_ + 32))), 43, (this._loadInt((_35_ + 52))), 0);
                            this._storeInt((_35_ + 108), 0);
                            break label$43;
                        }
                        while (false);
                        this._storeInt((_35_ + 108), 1);
                        break label$43;
                    }
                    while (false);
                    sqlite3VdbeAddOp2((this._loadInt((_35_ + 32))), 43, (this._loadInt((_35_ + 56))), 0);
                    sqlite3VdbeAddOp2((this._loadInt((_35_ + 32))), 43, (this._loadInt((_35_ + 52))), 0);
                    _34_ = this._storeInt((_35_ + 28), (sqlite3IndexKeyinfo((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 76))))));
                    sqlite3VdbeAddOp4((this._loadInt((_35_ + 32))), 38, (this._loadInt((_35_ + 56))), (this._loadInt(((this._loadInt((_35_ + 76))) + 20))), (this._loadInt((_35_ + 60))), _34_, -16);
                    _34_ = this._storeInt((_35_ + 28), (sqlite3IndexKeyinfo((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 72))))));
                    sqlite3VdbeAddOp4((this._loadInt((_35_ + 32))), 39, (this._loadInt((_35_ + 52))), (this._loadInt(((this._loadInt((_35_ + 72))) + 20))), (this._loadInt((_35_ + 88))), _34_, -16);
                    this._storeInt((_35_ + 48), (sqlite3VdbeAddOp2((this._loadInt((_35_ + 32))), 65, (this._loadInt((_35_ + 56))), 0)));
                    sqlite3VdbeAddOp2((this._loadInt((_35_ + 32))), 59, (this._loadInt((_35_ + 56))), (this._loadInt((_35_ + 16))));
                    sqlite3VdbeAddOp3((this._loadInt((_35_ + 32))), 70, (this._loadInt((_35_ + 52))), (this._loadInt((_35_ + 16))), 1);
                    sqlite3VdbeAddOp2((this._loadInt((_35_ + 32))), 67, (this._loadInt((_35_ + 56))), ((this._loadInt((_35_ + 48))) + 1));
                    sqlite3VdbeJumpHere((this._loadInt((_35_ + 32))), (this._loadInt((_35_ + 48))));
                    this._storeInt((_35_ + 72), (this._loadInt(((this._loadInt((_35_ + 72))) + 32))));
                    continue label$42;
                }
            }
            while (false);
        }
        while (false);
        _34_ = this._loadInt((_35_ + 108));
        this._storeInt((0 + 4), (_35_ + 112));
        return _34_;
    }

    @Override()
    public final int autoIncBegin(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        this._storeInt((_33_ + 12), 0);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadInt8u(((this._loadInt((_33_ + 16))) + 34))) & 8) == 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        label$4:
                        do {
                            if ((this._loadInt(((this._loadInt((_33_ + 24))) + 424))) == 0) {
                                break label$4;
                            }
                            _32_ = this._loadInt(((this._loadInt((_33_ + 24))) + 424));
                            break label$3;
                        }
                        while (false);
                        _32_ = this._loadInt((_33_ + 24));
                    }
                    while (false);
                    this._storeInt((_33_ + 4), (this._loadInt(((this._storeInt((_33_ + 8), _32_)) + 416))));
                    label$6:
                    do {
                        label$5:
                        while (true) {
                            _32_ = 0;
                            label$7:
                            do {
                                if ((this._loadInt((_33_ + 4))) == 0) {
                                    break label$7;
                                }
                                _32_ = ((this._loadInt(((this._loadInt((_33_ + 4))) + 4))) != (this._loadInt((_33_ + 16)))) ? 1 : 0;
                            }
                            while (false);
                            if (_32_ == 0) {
                                break label$6;
                            }
                            this._storeInt((_33_ + 4), (this._loadInt((this._loadInt((_33_ + 4))))));
                            continue label$5;
                        }
                    }
                    while (false);
                    label$8:
                    do {
                        if ((this._loadInt((_33_ + 4))) != 0) {
                            break label$8;
                        }
                        if ((this._storeInt((_33_ + 4), (sqlite3DbMallocRaw((this._loadInt((this._loadInt((_33_ + 24))))), 16)))) == 0) {
                            break label$1;
                        }
                        this._storeInt((_32_ = this._loadInt((_33_ + 4))), (this._loadInt(((_31_ = this._loadInt((_33_ + 8))) + 416))));
                        this._storeInt((_31_ + 416), _32_);
                        this._storeInt(((this._loadInt((_33_ + 4))) + 4), (this._loadInt((_33_ + 16))));
                        this._storeInt(((this._loadInt((_33_ + 4))) + 8), (this._loadInt((_33_ + 20))));
                        this._storeInt(((_32_ = this._loadInt((_33_ + 8))) + 72), ((this._loadInt((_32_ + 72))) + 1));
                        _32_ = this._storeInt(((_32_ = this._loadInt((_33_ + 8))) + 72), ((this._loadInt((_32_ + 72))) + 1));
                        this._storeInt(((this._loadInt((_33_ + 4))) + 12), _32_);
                        this._storeInt(((_32_ = this._loadInt((_33_ + 8))) + 72), ((this._loadInt((_32_ + 72))) + 1));
                    }
                    while (false);
                    this._storeInt((_33_ + 12), (this._loadInt(((this._loadInt((_33_ + 4))) + 12))));
                }
                while (false);
                this._storeInt((_33_ + 28), (this._loadInt((_33_ + 12))));
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
    public final int readsTable(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_34_ + 36), _31_);
        this._storeInt((_34_ + 32), _32_);
        this._storeInt((_34_ + 28), _33_);
        this._storeInt((_34_ + 16), (sqlite3VdbeCurrentAddr((this._storeInt((_34_ + 24), (sqlite3GetVdbe((this._loadInt((_34_ + 40))))))))));
        _33_ = 0;
        label$0:
        do {
            if (((this._loadInt8u(((this._loadInt((_34_ + 28))) + 34))) & 16) == 0) {
                break label$0;
            }
            _33_ = sqlite3GetVTable((this._loadInt((this._loadInt((_34_ + 40))))), (this._loadInt((_34_ + 28))));
        }
        while (false);
        this._storeInt((_34_ + 12), _33_);
        this._storeInt((_34_ + 20), (this._loadInt((_34_ + 36))));
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
                                if ((this._loadInt((_34_ + 20))) >= (this._loadInt((_34_ + 16)))) {
                                    break label$3;
                                }
                                label$7:
                                do {
                                    if ((this._loadInt8u((this._storeInt((_34_ + 8), (sqlite3VdbeGetOp((this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))))))))) != 38) {
                                        break label$7;
                                    }
                                    if ((this._loadInt(((this._loadInt((_34_ + 8))) + 12))) != (this._loadInt((_34_ + 32)))) {
                                        break label$7;
                                    }
                                    if ((this._storeInt(_34_, (this._loadInt(((this._loadInt((_34_ + 8))) + 8))))) == (this._loadInt(((this._loadInt((_34_ + 28))) + 20)))) {
                                        break label$2;
                                    }
                                    this._storeInt((_34_ + 4), (this._loadInt(((this._loadInt((_34_ + 28))) + 16))));
                                    label$9:
                                    do {
                                        label$8:
                                        while (true) {
                                            if ((this._loadInt((_34_ + 4))) == 0) {
                                                break label$9;
                                            }
                                            if ((this._loadInt(_34_)) == (this._loadInt(((this._loadInt((_34_ + 4))) + 20)))) {
                                                break label$4;
                                            }
                                            this._storeInt((_34_ + 4), (this._loadInt(((this._loadInt((_34_ + 4))) + 32))));
                                            continue label$8;
                                        }
                                    }
                                    while (false);
                                }
                                while (false);
                                label$10:
                                do {
                                    if ((this._loadInt8u((this._loadInt((_34_ + 8))))) != 127) {
                                        break label$10;
                                    }
                                    if ((this._loadInt(((this._loadInt((_34_ + 8))) + 16))) == (this._loadInt((_34_ + 12)))) {
                                        break label$6;
                                    }
                                }
                                while (false);
                                this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) + 1));
                                continue label$5;
                            }
                        }
                        while (false);
                        this._storeInt((_34_ + 44), 1);
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_34_ + 44), 1);
                    break label$1;
                }
                while (false);
                this._storeInt((_34_ + 44), 0);
                break label$1;
            }
            while (false);
            this._storeInt((_34_ + 44), 1);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int sqlite3ExprCodeAndCache(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 16), (this._loadInt(((this._loadInt((_33_ + 28))) + 12))));
        this._storeInt((_33_ + 12), (sqlite3ExprCode((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))))));
        label$0:
        do {
            if ((this._loadInt8u((this._loadInt((_33_ + 24))))) == 132) {
                break label$0;
            }
            _32_ = this._storeInt((_33_ + 8), (this._storeInt(((_32_ = this._loadInt((_33_ + 28))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 16))), 14, (this._loadInt((_33_ + 12))), _32_);
            this._storeInt(((_32_ = this._loadInt((_33_ + 24))) + 24), (this._loadInt((_33_ + 8))));
            this._storeInt8((_32_ + 35), (this._loadInt8u(_32_)));
            this._storeInt8((this._loadInt((_33_ + 24))), 132);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 12));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final void sqlite3TableAffinityStr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt(((this._storeInt((_32_ + 24), _31_)) + 40))) != 0) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 12), (sqlite3VdbeDb((this._loadInt((_32_ + 28))))));
                    if ((this._storeInt((_32_ + 20), (sqlite3DbMallocRaw(0, ((this._loadInt(((this._loadInt((_32_ + 24))) + 8))) + 1))))) == 0) {
                        break label$1;
                    }
                    this._storeInt((_32_ + 16), 0);
                    label$4:
                    do {
                        label$3:
                        while (true) {
                            if ((this._loadInt((_32_ + 16))) >= (this._loadInt(((this._loadInt((_32_ + 24))) + 8)))) {
                                break label$4;
                            }
                            this._storeInt8(((this._loadInt((_32_ + 20))) + (_31_ = this._loadInt((_32_ + 16)))), (this._loadInt8u((((this._loadInt(((this._loadInt((_32_ + 24))) + 12))) + (_31_ * 24)) + 22))));
                            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                            continue label$3;
                        }
                    }
                    while (false);
                    this._storeInt8(((_31_ = this._loadInt((_32_ + 20))) + (this._loadInt(((_30_ = this._loadInt((_32_ + 24))) + 8)))), 0);
                    this._storeInt((_30_ + 40), _31_);
                }
                while (false);
                sqlite3VdbeChangeP4((this._loadInt((_32_ + 28))), -1, (this._loadInt(((this._loadInt((_32_ + 24))) + 40))), 0);
                break label$0;
            }
            while (false);
            this._storeInt8(((this._loadInt((_32_ + 12))) + 30), 1);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void sqlite3CodeRowTrigger(
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
        this._storeInt(((_39_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_39_ + 40), _31_);
        this._storeInt((_39_ + 36), _32_);
        this._storeInt((_39_ + 32), _33_);
        this._storeInt((_39_ + 28), _34_);
        this._storeInt((_39_ + 24), _35_);
        this._storeInt((_39_ + 20), _36_);
        this._storeInt((_39_ + 16), _37_);
        this._storeInt((_39_ + 12), _38_);
        this._storeInt((_39_ + 8), (this._loadInt((_39_ + 40))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_39_ + 8))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt8u(((this._loadInt((_39_ + 8))) + 8))) != (this._loadInt((_39_ + 36)))) {
                        break label$2;
                    }
                    if ((this._loadInt8u(((this._loadInt((_39_ + 8))) + 9))) != (this._loadInt((_39_ + 28)))) {
                        break label$2;
                    }
                    if ((checkColumnOverlap((this._loadInt(((this._loadInt((_39_ + 8))) + 16))), (this._loadInt((_39_ + 32))))) == 0) {
                        break label$2;
                    }
                    sqlite3CodeRowTriggerDirect((this._loadInt((_39_ + 44))), (this._loadInt((_39_ + 8))), (this._loadInt((_39_ + 24))), (this._loadInt((_39_ + 20))), (this._loadInt((_39_ + 16))), (this._loadInt((_39_ + 12))));
                }
                while (false);
                this._storeInt((_39_ + 8), (this._loadInt(((this._loadInt((_39_ + 8))) + 32))));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_39_ + 48));
        return;
    }

    @Override()
    public final int sqlite3VdbeGetOp(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 8), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 4), _31_)) > -1) {
                break label$0;
            }
            this._storeInt((_32_ + 4), ((this._loadInt(((this._loadInt((_32_ + 8))) + 28))) + -1));
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt8u(((this._loadInt((this._loadInt((_32_ + 8))))) + 30))) == 0) {
                break label$1;
            }
            this._storeInt((_32_ + 12), 46804);
            return (this._loadInt((_32_ + 12)));
        }
        while (false);
        this._storeInt((_32_ + 12), ((this._loadInt(((this._loadInt((_32_ + 8))) + 4))) + ((this._loadInt((_32_ + 4))) * 20)));
        return (this._loadInt((_32_ + 12)));
    }

    @Override()
    public final void autoIncStep(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        label$0:
        do {
            if ((this._loadInt((_33_ + 8))) < 1) {
                break label$0;
            }
            sqlite3VdbeAddOp2((this._loadInt(((this._loadInt((_33_ + 12))) + 12))), 112, (this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 4))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void sqlite3VtabMakeWritable(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_32_ + 28))) + 424))) == 0) {
                    break label$1;
                }
                _31_ = this._loadInt(((this._loadInt((_32_ + 28))) + 424));
                break label$0;
            }
            while (false);
            _31_ = this._loadInt((_32_ + 28));
        }
        while (false);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 16), 0);
        label$2:
        do {
            label$4:
            do {
                label$3:
                while (true) {
                    if ((this._loadInt((_32_ + 16))) >= (this._loadInt(((this._loadInt((_32_ + 20))) + 532)))) {
                        break label$4;
                    }
                    if ((this._loadInt((_32_ + 24))) == (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 20))) + 536))) + ((this._loadInt((_32_ + 16))) << 2))))) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                    continue label$3;
                }
            }
            while (false);
            _31_ = this._storeInt((_32_ + 12), (((this._loadInt(((this._loadInt((_32_ + 20))) + 532))) << 2) + 4));
            label$5:
            do {
                if ((this._storeInt((_32_ + 8), (sqlite3_realloc((this._loadInt(((this._loadInt((_32_ + 20))) + 536))), _31_)))) == 0) {
                    break label$5;
                }
                this._storeInt(((_31_ = this._loadInt((_32_ + 20))) + 536), (this._loadInt((_32_ + 8))));
                this._storeInt((_31_ + 532), ((_30_ = this._loadInt((_31_ + 532))) + 1));
                this._storeInt(((this._loadInt(((this._loadInt((_32_ + 20))) + 536))) + (_30_ << 2)), (this._loadInt((_32_ + 24))));
                break label$2;
            }
            while (false);
            this._storeInt8(((this._loadInt((this._loadInt((_32_ + 20))))) + 30), 1);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void sqlite3GenerateConstraintChecks(
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
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        int _temp$3 = 0;
        int _temp$4 = 0;
        int _temp$5 = 0;
        this._storeInt(((_31_0 = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 176))) + 172), _30_);
        this._storeInt((_31_0 + 168), _31_);
        this._storeInt((_31_0 + 164), _32_);
        this._storeInt((_31_0 + 160), _33_);
        this._storeInt((_31_0 + 156), _34_);
        this._storeInt((_31_0 + 152), _35_);
        this._storeInt((_31_0 + 148), _36_);
        this._storeInt((_31_0 + 144), _37_);
        this._storeInt((_31_0 + 140), _38_);
        this._storeInt((_31_0 + 136), _39_);
        this._storeInt((_31_0 + 92), (this._storeInt((_31_0 + 112), 0)));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_31_0 + 152))) == 0) {
                    break label$1;
                }
                if ((this._loadInt((_31_0 + 148))) == 0) {
                    break label$1;
                }
                _39_ = this._loadInt((_31_0 + 152));
                break label$0;
            }
            while (false);
            _39_ = this._loadInt((_31_0 + 160));
        }
        while (false);
        this._storeInt((_31_0 + 88), _39_);
        this._storeInt((_31_0 + 128), (sqlite3GetVdbe((this._loadInt((_31_0 + 172))))));
        this._storeInt((_31_0 + 124), (this._loadInt(((this._loadInt((_31_0 + 168))) + 8))));
        this._storeInt((_31_0 + 104), ((this._loadInt((_31_0 + 160))) + 1));
        this._storeInt((_31_0 + 132), 0);
        label$3:
        do {
            label$2:
            while (true) {
                if ((this._loadInt((_31_0 + 132))) >= (this._loadInt((_31_0 + 124)))) {
                    break label$3;
                }
                label$4:
                do {
                    if ((this._loadInt((_31_0 + 132))) == (this._loadInt(((this._loadInt((_31_0 + 168))) + 4)))) {
                        break label$4;
                    }
                    if ((this._storeInt((_31_0 + 120), (this._loadInt8u((((this._loadInt(((this._loadInt((_31_0 + 168))) + 12))) + ((this._loadInt((_31_0 + 132))) * 24)) + 20))))) == 0) {
                        break label$4;
                    }
                    label$5:
                    do {
                        label$6:
                        do {
                            if ((this._loadInt((_31_0 + 144))) == 99) {
                                break label$6;
                            }
                            this._storeInt((_31_0 + 120), (this._loadInt((_31_0 + 144))));
                            break label$5;
                        }
                        while (false);
                        if ((this._loadInt((_31_0 + 120))) != 99) {
                            break label$5;
                        }
                        this._storeInt((_31_0 + 120), 2);
                    }
                    while (false);
                    label$7:
                    do {
                        if ((this._loadInt((_31_0 + 120))) != 5) {
                            break label$7;
                        }
                        if ((this._loadInt((((this._loadInt(((this._loadInt((_31_0 + 168))) + 12))) + ((this._loadInt((_31_0 + 132))) * 24)) + 4))) != 0) {
                            break label$7;
                        }
                        this._storeInt((_31_0 + 120), 2);
                    }
                    while (false);
                    label$8:
                    do {
                        label$9:
                        do {
                            if (((_39_ = (this._loadInt((_31_0 + 120))) + -1) & 4294967295L) > (3 & 4294967295L)) {
                                break label$9;
                            }
                            label$10:
                            do {
                                label$11:
                                do {
                                    switch (_39_) {
                                        case 0:
                                        case 2: {
                                            break label$10;
                                        }
                                        case 1: {
                                            break label$11;
                                        }
                                        case 3: {
                                            break label$8;
                                        }
                                        default: {
                                            break label$10;
                                        }
                                    }
                                }
                                while (false);
                                sqlite3MayAbort((this._loadInt((_31_0 + 172))));
                            }
                            while (false);
                            sqlite3VdbeAddOp3((this._loadInt((_31_0 + 128))), 5, 19, (this._loadInt((_31_0 + 120))), ((this._loadInt((_31_0 + 104))) + (this._loadInt((_31_0 + 132)))));
                            _39_ = this._loadInt((this._loadInt((_31_0 + 172))));
                            _37_ = this._loadInt((_38_ = this._loadInt((_31_0 + 168))));
                            this._storeInt((_31_0 + 4), (this._loadInt(((this._loadInt((_38_ + 12))) + ((this._loadInt((_31_0 + 132))) * 24)))));
                            this._storeInt(_31_0, _37_);
                            _39_ = this._storeInt((_31_0 + 84), (sqlite3MPrintf(_39_, 46624, _31_0)));
                            sqlite3VdbeChangeP4((this._loadInt((_31_0 + 128))), -1, _39_, -1);
                            break label$4;
                        }
                        while (false);
                        this._storeInt((_31_0 + 116), (sqlite3VdbeAddOp1((this._loadInt((_31_0 + 128))), 74, ((this._loadInt((_31_0 + 104))) + (this._loadInt((_31_0 + 132)))))));
                        sqlite3ExprCode((this._loadInt((_31_0 + 172))), (this._loadInt((((this._loadInt(((this._loadInt((_31_0 + 168))) + 12))) + ((_39_ = this._loadInt((_31_0 + 132))) * 24)) + 4))), ((this._loadInt((_31_0 + 104))) + _39_));
                        sqlite3VdbeJumpHere((this._loadInt((_31_0 + 128))), (this._loadInt((_31_0 + 116))));
                        break label$4;
                    }
                    while (false);
                    sqlite3VdbeAddOp2((this._loadInt((_31_0 + 128))), 73, ((this._loadInt((_31_0 + 104))) + (this._loadInt((_31_0 + 132)))), (this._loadInt((_31_0 + 140))));
                }
                while (false);
                this._storeInt((_31_0 + 132), ((this._loadInt((_31_0 + 132))) + 1));
                continue label$2;
            }
        }
        while (false);
        label$12:
        do {
            if ((this._loadInt(((this._loadInt((_31_0 + 168))) + 44))) == 0) {
                break label$12;
            }
            if (((this._loadInt8u(((this._loadInt((this._loadInt((_31_0 + 172))))) + 14))) & 4) != 0) {
                break label$12;
            }
            _39_ = this._storeInt((_31_0 + 80), (sqlite3VdbeMakeLabel((this._loadInt((_31_0 + 128))))));
            this._storeInt(((_38_ = this._loadInt((_31_0 + 172))) + 80), (this._loadInt((_31_0 + 104))));
            sqlite3ExprIfTrue(_38_, (this._loadInt(((this._loadInt((_31_0 + 168))) + 44))), _39_, 8);
            _39_ = 2;
            label$13:
            do {
                if ((this._loadInt((_31_0 + 144))) == 99) {
                    break label$13;
                }
                _39_ = this._loadInt((_31_0 + 144));
            }
            while (false);
            label$14:
            do {
                label$15:
                do {
                    if ((this._storeInt((_31_0 + 120), _39_)) != 4) {
                        break label$15;
                    }
                    sqlite3VdbeAddOp2((this._loadInt((_31_0 + 128))), 1, 0, (this._loadInt((_31_0 + 140))));
                    break label$14;
                }
                while (false);
                label$16:
                do {
                    if ((this._loadInt((_31_0 + 120))) != 5) {
                        break label$16;
                    }
                    this._storeInt((_31_0 + 120), 2);
                }
                while (false);
                sqlite3HaltConstraint((this._loadInt((_31_0 + 172))), (this._loadInt((_31_0 + 120))), 0, 0);
            }
            while (false);
            sqlite3VdbeResolveLabel((this._loadInt((_31_0 + 128))), (this._loadInt((_31_0 + 80))));
        }
        while (false);
        label$17:
        do {
            if ((this._loadInt((_31_0 + 152))) == 0) {
                break label$17;
            }
            this._storeInt((_31_0 + 120), (this._loadInt8u(((this._loadInt((_31_0 + 168))) + 35))));
            label$18:
            do {
                label$19:
                do {
                    if ((this._loadInt((_31_0 + 144))) == 99) {
                        break label$19;
                    }
                    this._storeInt((_31_0 + 120), (this._loadInt((_31_0 + 144))));
                    break label$18;
                }
                while (false);
                if ((this._loadInt((_31_0 + 120))) != 99) {
                    break label$18;
                }
                this._storeInt((_31_0 + 120), 2);
            }
            while (false);
            label$20:
            do {
                if ((this._loadInt((_31_0 + 148))) == 0) {
                    break label$20;
                }
                this._storeInt((_31_0 + 112), (sqlite3VdbeAddOp3((this._loadInt((_31_0 + 128))), 76, (this._loadInt((_31_0 + 160))), 0, (this._loadInt((_31_0 + 152))))));
            }
            while (false);
            this._storeInt((_31_0 + 108), (sqlite3VdbeAddOp3((this._loadInt((_31_0 + 128))), 52, (this._loadInt((_31_0 + 164))), 0, (this._loadInt((_31_0 + 160))))));
            label$21:
            do {
                label$22:
                do {
                    label$23:
                    do {
                        label$24:
                        do {
                            if ((((_39_ = this._loadInt((_31_0 + 120))) + -1) & 4294967295L) < (3 & 4294967295L)) {
                                break label$24;
                            }
                            label$25:
                            do {
                                label$26:
                                do {
                                    if (_39_ == 4) {
                                        break label$26;
                                    }
                                    if (_39_ != 5) {
                                        break label$25;
                                    }
                                    _39_ = this._storeInt((_31_0 + 76), 0);
                                    label$27:
                                    do {
                                        if (((this._loadInt8u(((this._loadInt((this._loadInt((_31_0 + 172))))) + 15))) & 2) == 0) {
                                            break label$27;
                                        }
                                        this._storeInt((_31_0 + 76), (sqlite3TriggersExist((this._loadInt((_31_0 + 172))), (this._loadInt((_31_0 + 168))), 106, _39_, _39_)));
                                    }
                                    while (false);
                                    label$28:
                                    do {
                                        if ((this._loadInt((_31_0 + 76))) != 0) {
                                            break label$28;
                                        }
                                        if ((sqlite3FkRequired((this._loadInt((_31_0 + 172))), (this._loadInt((_31_0 + 168))), 0, 0)) == 0) {
                                            break label$23;
                                        }
                                    }
                                    while (false);
                                    sqlite3MultiWrite((this._loadInt((_31_0 + 172))));
                                    sqlite3GenerateRowDelete((this._loadInt((_31_0 + 172))), (this._loadInt((_31_0 + 168))), (this._loadInt((_31_0 + 164))), (this._loadInt((_31_0 + 160))), 0, (this._loadInt((_31_0 + 76))), 5);
                                    break label$22;
                                }
                                while (false);
                                sqlite3VdbeAddOp2((this._loadInt((_31_0 + 128))), 1, 0, (this._loadInt((_31_0 + 140))));
                                break label$21;
                            }
                            while (false);
                            this._storeInt((_31_0 + 120), 2);
                        }
                        while (false);
                        sqlite3HaltConstraint((this._loadInt((_31_0 + 172))), (this._loadInt((_31_0 + 120))), 46656, -2);
                        break label$21;
                    }
                    while (false);
                    if ((this._loadInt(((this._loadInt((_31_0 + 168))) + 16))) == 0) {
                        break label$22;
                    }
                    sqlite3MultiWrite((this._loadInt((_31_0 + 172))));
                    sqlite3GenerateRowIndexDelete((this._loadInt((_31_0 + 172))), (this._loadInt((_31_0 + 168))), (this._loadInt((_31_0 + 164))), 0);
                }
                while (false);
                this._storeInt((_31_0 + 92), 1);
            }
            while (false);
            sqlite3VdbeJumpHere((this._loadInt((_31_0 + 128))), (this._loadInt((_31_0 + 108))));
            if ((this._loadInt((_31_0 + 148))) == 0) {
                break label$17;
            }
            sqlite3VdbeJumpHere((this._loadInt((_31_0 + 128))), (this._loadInt((_31_0 + 112))));
        }
        while (false);
        _37_ = this._storeInt((_31_0 + 100), 0);
        this._storeInt((_31_0 + 96), (this._loadInt(((this._loadInt((_31_0 + 168))) + 16))));
        label$30:
        do {
            label$29:
            while (true) {
                if ((this._loadInt((_31_0 + 96))) == 0) {
                    break label$30;
                }
                label$31:
                do {
                    if ((this._loadInt(((this._loadInt((_31_0 + 156))) + ((this._loadInt((_31_0 + 100))) << 2)))) == 0) {
                        break label$31;
                    }
                    this._storeInt((_31_0 + 72), (sqlite3GetTempRange((this._loadInt((_31_0 + 172))), ((this._loadInt(((this._loadInt((_31_0 + 96))) + 4))) + 1))));
                    _39_ = this._storeInt((_31_0 + 132), _37_);
                    label$33:
                    do {
                        label$32:
                        while (true) {
                            if ((this._loadInt((_31_0 + 132))) >= (this._loadInt(((this._loadInt((_31_0 + 96))) + 4)))) {
                                break label$33;
                            }
                            label$34:
                            do {
                                label$35:
                                do {
                                    if ((this._storeInt((_31_0 + 64), (this._loadInt(((this._loadInt(((this._loadInt((_31_0 + 96))) + 8))) + ((this._loadInt((_31_0 + 132))) << 2)))))) != (this._loadInt(((this._loadInt((_31_0 + 168))) + 4)))) {
                                        break label$35;
                                    }
                                    sqlite3VdbeAddOp2((this._loadInt((_31_0 + 128))), 15, (this._loadInt((_31_0 + 160))), ((this._loadInt((_31_0 + 72))) + (this._loadInt((_31_0 + 132)))));
                                    break label$34;
                                }
                                while (false);
                                sqlite3VdbeAddOp2((this._loadInt((_31_0 + 128))), 15, ((this._loadInt((_31_0 + 104))) + (this._loadInt((_31_0 + 64)))), ((this._loadInt((_31_0 + 72))) + (this._loadInt((_31_0 + 132)))));
                            }
                            while (false);
                            this._storeInt((_31_0 + 132), ((this._loadInt((_31_0 + 132))) + 1));
                            continue label$32;
                        }
                    }
                    while (false);
                    sqlite3VdbeAddOp2((this._loadInt((_31_0 + 128))), 15, (this._loadInt((_31_0 + 160))), ((this._loadInt((_31_0 + 72))) + (this._loadInt((_31_0 + 132)))));
                    sqlite3VdbeAddOp3((this._loadInt((_31_0 + 128))), 30, (this._loadInt((_31_0 + 72))), ((this._loadInt(((this._loadInt((_31_0 + 96))) + 4))) + 1), (this._loadInt(((this._loadInt((_31_0 + 156))) + ((this._loadInt((_31_0 + 100))) << 2)))));
                    sqlite3VdbeChangeP4((_38_ = this._loadInt((_31_0 + 128))), -1, (sqlite3IndexAffinityStr(_38_, (this._loadInt((_31_0 + 96))))), _39_);
                    sqlite3ExprCacheAffinityChange((this._loadInt((_31_0 + 172))), (this._loadInt((_31_0 + 72))), ((this._loadInt(((this._loadInt((_31_0 + 96))) + 4))) + 1));
                    label$36:
                    do {
                        label$37:
                        do {
                            label$38:
                            do {
                                if ((this._storeInt((_31_0 + 120), (this._loadInt8u(((this._loadInt((_31_0 + 96))) + 24))))) == 0) {
                                    break label$38;
                                }
                                if ((this._loadInt((_31_0 + 144))) == 99) {
                                    break label$37;
                                }
                                this._storeInt((_31_0 + 120), (this._loadInt((_31_0 + 144))));
                                break label$36;
                            }
                            while (false);
                            sqlite3ReleaseTempRange((this._loadInt((_31_0 + 172))), (this._loadInt((_31_0 + 72))), ((this._loadInt(((this._loadInt((_31_0 + 96))) + 4))) + 1));
                            break label$31;
                        }
                        while (false);
                        if ((this._loadInt((_31_0 + 120))) != 99) {
                            break label$36;
                        }
                        this._storeInt((_31_0 + 120), 2);
                    }
                    while (false);
                    label$39:
                    do {
                        if ((this._loadInt((_31_0 + 92))) == 0) {
                            break label$39;
                        }
                        label$40:
                        do {
                            if ((this._loadInt((_31_0 + 120))) != 4) {
                                break label$40;
                            }
                            this._storeInt((_31_0 + 120), 5);
                            break label$39;
                        }
                        while (false);
                        if ((this._loadInt((_31_0 + 120))) != 3) {
                            break label$39;
                        }
                        this._storeInt((_31_0 + 120), 2);
                    }
                    while (false);
                    _38_ = this._storeInt((_31_0 + 68), (sqlite3GetTempReg((this._loadInt((_31_0 + 172))))));
                    sqlite3VdbeAddOp2((this._loadInt((_31_0 + 128))), 15, (this._loadInt((_31_0 + 88))), _38_);
                    this._storeInt((_31_0 + 108), (sqlite3VdbeAddOp4((this._loadInt((_31_0 + 128))), 51, (((this._loadInt((_31_0 + 164))) + (this._loadInt((_31_0 + 100)))) + 1), _39_, (this._loadInt((_31_0 + 68))), (this._loadInt((_31_0 + 72))), -14)));
                    sqlite3ReleaseTempRange((this._loadInt((_31_0 + 172))), (this._loadInt((_31_0 + 72))), ((this._loadInt(((this._loadInt((_31_0 + 96))) + 4))) + 1));
                    label$41:
                    do {
                        label$42:
                        do {
                            if ((((_38_ = this._loadInt((_31_0 + 120))) + -1) & 4294967295L) >= (3 & 4294967295L)) {
                                break label$42;
                            }
                            sqlite3StrAccumInit((_31_0 + 32), _39_, _39_, 200);
                            this._storeInt((_31_0 + 32), (this._loadInt((this._loadInt((_31_0 + 172))))));
                            _temp$0 = 46688;
                            _temp$1 = 46704;
                            _temp$2 = ((this._loadInt(((this._loadInt((_31_0 + 96))) + 4))) > 1) ? _temp$0 : _temp$1;
                            this._storeInt((_31_0 + 28), _temp$2);
                            this._storeInt((_31_0 + 60), _39_);
                            label$44:
                            do {
                                label$43:
                                while (true) {
                                    if ((this._loadInt((_31_0 + 60))) >= (this._loadInt(((this._loadInt((_31_0 + 96))) + 4)))) {
                                        break label$44;
                                    }
                                    this._storeInt((_31_0 + 20), (this._loadInt(((this._loadInt(((this._loadInt((_31_0 + 168))) + 12))) + ((this._loadInt(((this._loadInt(((this._loadInt((_31_0 + 96))) + 8))) + ((this._loadInt((_31_0 + 60))) << 2)))) * 24)))));
                                    sqlite3StrAccumAppend((_31_0 + 32), (this._loadInt((_31_0 + 28))), -1);
                                    this._storeInt((_31_0 + 28), 46720);
                                    sqlite3StrAccumAppend((_31_0 + 32), (this._loadInt((_31_0 + 20))), -1);
                                    this._storeInt((_31_0 + 60), ((this._loadInt((_31_0 + 60))) + 1));
                                    continue label$43;
                                }
                            }
                            while (false);
                            _temp$3 = 46736;
                            _temp$4 = 46752;
                            _temp$5 = ((this._loadInt(((this._loadInt((_31_0 + 96))) + 4))) > 1) ? _temp$3 : _temp$4;
                            sqlite3StrAccumAppend((_31_0 + 32), _temp$5, -1);
                            _38_ = this._storeInt((_31_0 + 24), (sqlite3StrAccumFinish((_31_0 + 32))));
                            sqlite3HaltConstraint((this._loadInt((_31_0 + 172))), (this._loadInt((_31_0 + 120))), _38_, _39_);
                            sqlite3DbFree((this._loadInt((_31_0 + 32))), (this._loadInt((_31_0 + 24))));
                            break label$41;
                        }
                        while (false);
                        label$45:
                        do {
                            if (_38_ != 4) {
                                break label$45;
                            }
                            sqlite3VdbeAddOp2((this._loadInt((_31_0 + 128))), 1, _39_, (this._loadInt((_31_0 + 140))));
                            break label$41;
                        }
                        while (false);
                        this._storeInt((_31_0 + 16), _39_);
                        sqlite3MultiWrite((this._loadInt((_31_0 + 172))));
                        label$46:
                        do {
                            if (((this._loadInt8u(((this._loadInt((this._loadInt((_31_0 + 172))))) + 15))) & 2) == 0) {
                                break label$46;
                            }
                            this._storeInt((_31_0 + 16), (sqlite3TriggersExist((this._loadInt((_31_0 + 172))), (this._loadInt((_31_0 + 168))), 106, _39_, _39_)));
                        }
                        while (false);
                        sqlite3GenerateRowDelete((this._loadInt((_31_0 + 172))), (this._loadInt((_31_0 + 168))), (this._loadInt((_31_0 + 164))), (this._loadInt((_31_0 + 68))), _39_, (this._loadInt((_31_0 + 16))), 5);
                        this._storeInt((_31_0 + 92), 1);
                    }
                    while (false);
                    sqlite3VdbeJumpHere((this._loadInt((_31_0 + 128))), (this._loadInt((_31_0 + 108))));
                    sqlite3ReleaseTempReg((this._loadInt((_31_0 + 172))), (this._loadInt((_31_0 + 68))));
                }
                while (false);
                this._storeInt((_31_0 + 96), (this._loadInt(((this._loadInt((_31_0 + 96))) + 32))));
                this._storeInt((_31_0 + 100), ((this._loadInt((_31_0 + 100))) + 1));
                continue label$29;
            }
        }
        while (false);
        label$47:
        do {
            if ((this._loadInt((_31_0 + 136))) == 0) {
                break label$47;
            }
            this._storeInt((this._loadInt((_31_0 + 136))), (this._loadInt((_31_0 + 92))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_0 + 176));
        return;
    }

    @Override()
    public final void sqlite3FkCheck(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 92), _30_);
        this._storeInt((_34_ + 88), _31_);
        this._storeInt((_34_ + 84), _32_);
        this._storeInt((_34_ + 80), _33_);
        this._storeInt((_34_ + 76), (this._loadInt((this._loadInt((_34_ + 92))))));
        this._storeInt((_34_ + 60), (this._loadInt8u(((this._loadInt((_34_ + 92))) + 442))));
        label$0:
        do {
            if (((this._loadInt8u(((this._loadInt((_34_ + 76))) + 15))) & 4) == 0) {
                break label$0;
            }
            _33_ = this._storeInt((_34_ + 68), (sqlite3SchemaToIndex((this._loadInt((_34_ + 76))), (this._loadInt(((this._loadInt((_34_ + 88))) + 68))))));
            this._storeInt((_34_ + 64), (this._loadInt(((this._loadInt(((this._loadInt((_34_ + 76))) + 8))) + (_33_ << 4)))));
            this._storeInt((_34_ + 72), (this._loadInt(((this._loadInt((_34_ + 88))) + 36))));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_34_ + 72))) == 0) {
                        break label$2;
                    }
                    _33_ = this._storeInt((_34_ + 32), (this._storeInt((_34_ + 48), (this._storeInt((_34_ + 52), 0)))));
                    label$3:
                    do {
                        label$4:
                        do {
                            if ((this._loadInt8u(((this._loadInt((_34_ + 92))) + 442))) == 0) {
                                break label$4;
                            }
                            this._storeInt((_34_ + 56), (sqlite3FindTable((this._loadInt((_34_ + 76))), (this._loadInt(((this._loadInt((_34_ + 72))) + 8))), (this._loadInt((_34_ + 64))))));
                            break label$3;
                        }
                        while (false);
                        this._storeInt((_34_ + 56), (sqlite3LocateTable((this._loadInt((_34_ + 92))), _33_, (this._loadInt(((this._loadInt((_34_ + 72))) + 8))), (this._loadInt((_34_ + 64))))));
                    }
                    while (false);
                    label$5:
                    do {
                        label$6:
                        do {
                            label$7:
                            do {
                                if ((this._loadInt((_34_ + 56))) == 0) {
                                    break label$7;
                                }
                                if ((locateFkeyIndex((this._loadInt((_34_ + 92))), (this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 72))), (_34_ + 52), (_34_ + 48))) == 0) {
                                    break label$6;
                                }
                            }
                            while (false);
                            if ((this._loadInt((_34_ + 60))) == 0) {
                                break label$0;
                            }
                            if ((this._loadInt8u(((this._loadInt((_34_ + 76))) + 30))) == 0) {
                                break label$5;
                            }
                            break label$0;
                        }
                        while (false);
                        label$8:
                        do {
                            label$9:
                            do {
                                if ((this._loadInt((_34_ + 48))) == 0) {
                                    break label$9;
                                }
                                this._storeInt((_34_ + 44), (this._loadInt((_34_ + 48))));
                                break label$8;
                            }
                            while (false);
                            this._storeInt((_34_ + 40), (this._loadInt(((this._loadInt((_34_ + 72))) + 36))));
                            this._storeInt((_34_ + 44), (_34_ + 40));
                        }
                        while (false);
                        _32_ = this._storeInt((_34_ + 36), _33_);
                        label$11:
                        do {
                            label$10:
                            while (true) {
                                if ((this._loadInt((_34_ + 36))) >= (this._loadInt(((this._loadInt((_34_ + 72))) + 20)))) {
                                    break label$11;
                                }
                                label$12:
                                do {
                                    if ((this._loadInt(((this._loadInt((_34_ + 44))) + ((this._loadInt((_34_ + 36))) << 2)))) != (this._loadInt(((this._loadInt((_34_ + 88))) + 4)))) {
                                        break label$12;
                                    }
                                    this._storeInt(((this._loadInt((_34_ + 44))) + ((this._loadInt((_34_ + 36))) << 2)), -1);
                                }
                                while (false);
                                label$13:
                                do {
                                    if ((this._loadInt(((this._loadInt((_34_ + 76))) + 268))) == 0) {
                                        break label$13;
                                    }
                                    label$14:
                                    do {
                                        label$15:
                                        do {
                                            if ((this._loadInt((_34_ + 52))) == 0) {
                                                break label$15;
                                            }
                                            _33_ = this._loadInt(((this._loadInt(((this._loadInt((_34_ + 52))) + 8))) + ((this._loadInt((_34_ + 36))) << 2)));
                                            break label$14;
                                        }
                                        while (false);
                                        _33_ = this._loadInt(((this._loadInt((_34_ + 56))) + 4));
                                    }
                                    while (false);
                                    _33_ = this._storeInt((_34_ + 24), (this._loadInt(((this._loadInt(((this._loadInt((_34_ + 56))) + 12))) + (_33_ * 24)))));
                                    this._storeInt((_34_ + 32), (((this._storeInt((_34_ + 28), (sqlite3AuthReadCol((this._loadInt((_34_ + 92))), (this._loadInt((this._loadInt((_34_ + 56))))), _33_, (this._loadInt((_34_ + 68))))))) == 2) ? 1 : 0));
                                }
                                while (false);
                                this._storeInt((_34_ + 36), ((this._loadInt((_34_ + 36))) + 1));
                                continue label$10;
                            }
                        }
                        while (false);
                        sqlite3TableLock((this._loadInt((_34_ + 92))), (this._loadInt((_34_ + 68))), (this._loadInt(((_33_ = this._loadInt((_34_ + 56))) + 20))), _32_, (this._loadInt(_33_)));
                        this._storeInt(((_33_ = this._loadInt((_34_ + 92))) + 68), ((this._loadInt((_33_ + 68))) + 1));
                        label$16:
                        do {
                            if ((this._loadInt((_34_ + 84))) == 0) {
                                break label$16;
                            }
                            fkLookupParent((this._loadInt((_34_ + 92))), (this._loadInt((_34_ + 68))), (this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 52))), (this._loadInt((_34_ + 72))), (this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 84))), -1, (this._loadInt((_34_ + 32))));
                        }
                        while (false);
                        label$17:
                        do {
                            if ((this._loadInt((_34_ + 80))) == 0) {
                                break label$17;
                            }
                            fkLookupParent((this._loadInt((_34_ + 92))), (this._loadInt((_34_ + 68))), (this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 52))), (this._loadInt((_34_ + 72))), (this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 80))), 1, (this._loadInt((_34_ + 32))));
                        }
                        while (false);
                        sqlite3DbFree((this._loadInt((_34_ + 76))), (this._loadInt((_34_ + 48))));
                    }
                    while (false);
                    this._storeInt((_34_ + 72), (this._loadInt(((this._loadInt((_34_ + 72))) + 4))));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt((_34_ + 72), (sqlite3FkReferences((this._loadInt((_34_ + 88))))));
            label$19:
            do {
                label$18:
                while (true) {
                    if ((this._loadInt((_34_ + 72))) == 0) {
                        break label$19;
                    }
                    _33_ = this._storeInt((_34_ + 12), (this._storeInt((_34_ + 20), 0)));
                    label$20:
                    do {
                        label$21:
                        do {
                            if ((this._loadInt8u(((this._loadInt((_34_ + 72))) + 24))) != 0) {
                                break label$21;
                            }
                            if ((this._loadInt(((this._loadInt((_34_ + 92))) + 424))) != 0) {
                                break label$21;
                            }
                            if ((this._loadInt8u(((this._loadInt((_34_ + 92))) + 344))) == 0) {
                                break label$20;
                            }
                        }
                        while (false);
                        label$22:
                        do {
                            if ((locateFkeyIndex((this._loadInt((_34_ + 92))), (this._loadInt((_34_ + 88))), (this._loadInt((_34_ + 72))), (_34_ + 20), (_34_ + 12))) == 0) {
                                break label$22;
                            }
                            if ((this._loadInt((_34_ + 60))) == 0) {
                                break label$19;
                            }
                            if ((this._loadInt8u(((this._loadInt((_34_ + 76))) + 30))) == 0) {
                                break label$20;
                            }
                            break label$19;
                        }
                        while (false);
                        label$23:
                        do {
                            if ((this._storeInt((_34_ + 16), (sqlite3SrcListAppend((this._loadInt((_34_ + 76))), _33_, _33_, _33_)))) == 0) {
                                break label$23;
                            }
                            this._storeInt((_34_ + 8), ((_32_ = this._loadInt((_34_ + 16))) + 8));
                            this._storeInt((_32_ + 20), (this._loadInt((_31_ = this._loadInt((_34_ + 72))))));
                            this._storeInt((_32_ + 12), (this._loadInt((this._loadInt(_31_)))));
                            this._storeInt16(((_32_ = this._loadInt(((this._loadInt((_34_ + 8))) + 12))) + 32), ((this._loadInt16u((_32_ + 32))) + 1));
                            this._storeInt(((_32_ = this._loadInt((_34_ + 92))) + 68), ((_32_ = this._loadInt((_32_ + 68))) + 1));
                            this._storeInt(((this._loadInt((_34_ + 8))) + 24), _32_);
                            label$24:
                            do {
                                if ((this._loadInt((_34_ + 80))) == 0) {
                                    break label$24;
                                }
                                fkScanChildren((this._loadInt((_34_ + 92))), (this._loadInt((_34_ + 16))), (this._loadInt((_34_ + 88))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 72))), (this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 80))), -1);
                            }
                            while (false);
                            label$25:
                            do {
                                if ((this._loadInt((_34_ + 84))) == 0) {
                                    break label$25;
                                }
                                fkScanChildren((this._loadInt((_34_ + 92))), (this._loadInt((_34_ + 16))), (this._loadInt((_34_ + 88))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 72))), (this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 84))), 1);
                            }
                            while (false);
                            this._storeInt(((this._loadInt((_34_ + 8))) + 4), _33_);
                            sqlite3SrcListDelete((this._loadInt((_34_ + 76))), (this._loadInt((_34_ + 16))));
                        }
                        while (false);
                        sqlite3DbFree((this._loadInt((_34_ + 76))), (this._loadInt((_34_ + 12))));
                    }
                    while (false);
                    this._storeInt((_34_ + 72), (this._loadInt(((this._loadInt((_34_ + 72))) + 12))));
                    continue label$18;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 96));
        return;
    }

    @Override()
    public final void sqlite3CompleteInsertion(
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
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_38_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_38_ + 56), _31_);
        this._storeInt((_38_ + 52), _32_);
        this._storeInt((_38_ + 48), _33_);
        this._storeInt((_38_ + 44), _34_);
        this._storeInt((_38_ + 40), _35_);
        this._storeInt((_38_ + 36), _36_);
        this._storeInt((_38_ + 32), _37_);
        this._storeInt((_38_ + 24), (sqlite3GetVdbe((this._loadInt((_38_ + 60))))));
        this._storeInt((_38_ + 20), 0);
        this._storeInt((_38_ + 16), (this._loadInt(((this._loadInt((_38_ + 56))) + 16))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_38_ + 16))) == 0) {
                    break label$1;
                }
                this._storeInt((_38_ + 16), (this._loadInt(((this._loadInt((_38_ + 16))) + 32))));
                this._storeInt((_38_ + 20), ((this._loadInt((_38_ + 20))) + 1));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((_38_ + 28), ((this._loadInt((_38_ + 20))) + -1));
        label$3:
        do {
            label$2:
            while (true) {
                if ((this._loadInt((_38_ + 28))) < 0) {
                    break label$3;
                }
                label$4:
                do {
                    if ((this._loadInt(((this._loadInt((_38_ + 44))) + ((this._loadInt((_38_ + 28))) << 2)))) == 0) {
                        break label$4;
                    }
                    sqlite3VdbeAddOp2((this._loadInt((_38_ + 24))), 70, (((this._loadInt((_38_ + 52))) + (_37_ = this._loadInt((_38_ + 28)))) + 1), (this._loadInt(((this._loadInt((_38_ + 44))) + (_37_ << 2)))));
                    if ((this._loadInt((_38_ + 32))) == 0) {
                        break label$4;
                    }
                    sqlite3VdbeChangeP5((this._loadInt((_38_ + 24))), 16);
                }
                while (false);
                this._storeInt((_38_ + 28), ((this._loadInt((_38_ + 28))) + -1));
                continue label$2;
            }
        }
        while (false);
        this._storeInt((_38_ + 8), ((this._loadInt((_38_ + 48))) + 1));
        _37_ = this._storeInt((_38_ + 4), (sqlite3GetTempReg((this._loadInt((_38_ + 60))))));
        sqlite3VdbeAddOp3((this._loadInt((_38_ + 24))), 30, (this._loadInt((_38_ + 8))), (this._loadInt(((this._loadInt((_38_ + 56))) + 8))), _37_);
        sqlite3TableAffinityStr((this._loadInt((_38_ + 24))), (this._loadInt((_38_ + 56))));
        sqlite3ExprCacheAffinityChange((this._loadInt((_38_ + 60))), (this._loadInt((_38_ + 8))), (this._loadInt(((this._loadInt((_38_ + 56))) + 8))));
        label$5:
        do {
            label$6:
            do {
                if ((this._loadInt8u(((this._loadInt((_38_ + 60))) + 19))) == 0) {
                    break label$6;
                }
                this._storeInt8((_38_ + 15), 0);
                break label$5;
            }
            while (false);
            this._storeInt8((_38_ + 15), 1);
            _temp$0 = 4;
            _temp$1 = 2;
            _temp$2 = ((this._loadInt((_38_ + 40))) != 0) ? _temp$0 : _temp$1;
            _temp$2 = (this._loadInt8u((_38_ + 15))) | _temp$2;
            this._storeInt8((_38_ + 15), _temp$2);
        }
        while (false);
        label$7:
        do {
            if ((this._loadInt((_38_ + 36))) == 0) {
                break label$7;
            }
            this._storeInt8((_38_ + 15), ((this._loadInt8u((_38_ + 15))) | 8));
        }
        while (false);
        label$8:
        do {
            if ((this._loadInt((_38_ + 32))) == 0) {
                break label$8;
            }
            this._storeInt8((_38_ + 15), ((this._loadInt8u((_38_ + 15))) | 16));
        }
        while (false);
        sqlite3VdbeAddOp3((this._loadInt((_38_ + 24))), 55, (this._loadInt((_38_ + 52))), (this._loadInt((_38_ + 4))), (this._loadInt((_38_ + 48))));
        label$9:
        do {
            if ((this._loadInt8u(((this._loadInt((_38_ + 60))) + 19))) != 0) {
                break label$9;
            }
            sqlite3VdbeChangeP4((this._loadInt((_38_ + 24))), -1, (this._loadInt((this._loadInt((_38_ + 56))))), 0);
        }
        while (false);
        sqlite3VdbeChangeP5((this._loadInt((_38_ + 24))), (this._loadInt8u((_38_ + 15))));
        this._storeInt((0 + 4), (_38_ + 64));
        return;
    }

    @Override()
    public final void sqlite3AutoincrementEnd(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 36), (this._loadInt(((this._storeInt((_31_ + 44), _30_)) + 12))));
        this._storeInt((_31_ + 32), (this._loadInt((this._loadInt((_31_ + 44))))));
        this._storeInt((_31_ + 40), (this._loadInt(((this._loadInt((_31_ + 44))) + 416))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 40))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 28), ((this._loadInt(((this._loadInt((_31_ + 32))) + 8))) + ((this._loadInt(((this._loadInt((_31_ + 40))) + 8))) << 4)));
                this._storeInt(_31_, (this._loadInt(((this._loadInt((_31_ + 40))) + 12))));
                this._storeInt((_31_ + 4), (sqlite3GetTempReg((this._loadInt((_31_ + 44))))));
                sqlite3OpenTable((this._loadInt((_31_ + 44))), 0, (this._loadInt(((this._loadInt((_31_ + 40))) + 8))), (this._loadInt(((this._loadInt(((this._loadInt((_31_ + 28))) + 12))) + 72))), 39);
                this._storeInt((_31_ + 24), (sqlite3VdbeAddOp1((this._loadInt((_31_ + 36))), 74, ((this._loadInt(_31_)) + 1))));
                this._storeInt((_31_ + 20), (sqlite3VdbeAddOp0((this._loadInt((_31_ + 36))), 65)));
                this._storeInt((_31_ + 16), (sqlite3VdbeAddOp3((this._loadInt((_31_ + 36))), 28, 0, 0, (this._loadInt((_31_ + 4))))));
                this._storeInt((_31_ + 12), (sqlite3VdbeAddOp3((this._loadInt((_31_ + 36))), 76, ((this._loadInt(_31_)) + -1), 0, (this._loadInt((_31_ + 4))))));
                sqlite3VdbeAddOp2((this._loadInt((_31_ + 36))), 67, 0, (this._loadInt((_31_ + 16))));
                sqlite3VdbeJumpHere((this._loadInt((_31_ + 36))), (this._loadInt((_31_ + 20))));
                sqlite3VdbeAddOp2((this._loadInt((_31_ + 36))), 54, 0, ((this._loadInt(_31_)) + 1));
                this._storeInt((_31_ + 8), (sqlite3VdbeAddOp0((this._loadInt((_31_ + 36))), 1)));
                sqlite3VdbeJumpHere((this._loadInt((_31_ + 36))), (this._loadInt((_31_ + 12))));
                sqlite3VdbeAddOp2((this._loadInt((_31_ + 36))), 61, 0, ((this._loadInt(_31_)) + 1));
                sqlite3VdbeJumpHere((this._loadInt((_31_ + 36))), (this._loadInt((_31_ + 24))));
                sqlite3VdbeJumpHere((this._loadInt((_31_ + 36))), (this._loadInt((_31_ + 8))));
                sqlite3VdbeAddOp3((this._loadInt((_31_ + 36))), 30, ((this._loadInt(_31_)) + -1), 2, (this._loadInt((_31_ + 4))));
                sqlite3VdbeAddOp3((this._loadInt((_31_ + 36))), 55, 0, (this._loadInt((_31_ + 4))), ((this._loadInt(_31_)) + 1));
                sqlite3VdbeChangeP5((this._loadInt((_31_ + 36))), 8);
                sqlite3VdbeAddOp0((this._loadInt((_31_ + 36))), 43);
                sqlite3ReleaseTempReg((this._loadInt((_31_ + 44))), (this._loadInt((_31_ + 4))));
                this._storeInt((_31_ + 40), (this._loadInt((this._loadInt((_31_ + 40))))));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 48));
        return;
    }

    @Override()
    public final int locateFkeyIndex(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_35_ + 52), _31_);
        this._storeInt((_35_ + 48), _32_);
        this._storeInt((_35_ + 44), _33_);
        this._storeInt((_35_ + 40), _34_);
        _34_ = this._storeInt((_35_ + 32), (this._storeInt((_35_ + 36), 0)));
        this._storeInt((_35_ + 28), (this._loadInt(((this._loadInt((_35_ + 48))) + 20))));
        this._storeInt((_35_ + 24), (this._loadInt(((this._loadInt((_35_ + 48))) + 40))));
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
                            if ((this._loadInt((_35_ + 28))) != 1) {
                                break label$4;
                            }
                            if ((this._loadInt(((this._loadInt((_35_ + 52))) + 4))) < _34_) {
                                break label$3;
                            }
                            if ((this._loadInt((_35_ + 24))) == 0) {
                                break label$1;
                            }
                            if ((sqlite3StrICmp((this._loadInt(((this._loadInt(((_34_ = this._loadInt((_35_ + 52))) + 12))) + ((this._loadInt((_34_ + 4))) * 24)))), (this._loadInt((_35_ + 24))))) != 0) {
                                break label$3;
                            }
                            this._storeInt((_35_ + 60), 0);
                            break label$0;
                        }
                        while (false);
                        if ((this._loadInt((_35_ + 40))) == 0) {
                            break label$3;
                        }
                        if ((this._storeInt((_35_ + 32), (sqlite3DbMallocRaw((this._loadInt((this._loadInt((_35_ + 56))))), ((this._loadInt((_35_ + 28))) << 2))))) == 0) {
                            break label$2;
                        }
                        this._storeInt((this._loadInt((_35_ + 40))), (this._loadInt((_35_ + 32))));
                    }
                    while (false);
                    this._storeInt((_35_ + 36), (this._loadInt(((this._loadInt((_35_ + 52))) + 16))));
                    label$5:
                    do {
                        label$7:
                        do {
                            label$6:
                            while (true) {
                                if ((this._loadInt((_35_ + 36))) == 0) {
                                    break label$5;
                                }
                                label$8:
                                do {
                                    if ((this._loadInt(((this._loadInt((_35_ + 36))) + 4))) != (this._loadInt((_35_ + 28)))) {
                                        break label$8;
                                    }
                                    if ((this._loadInt8u(((this._loadInt((_35_ + 36))) + 24))) == 0) {
                                        break label$8;
                                    }
                                    label$9:
                                    do {
                                        if ((this._loadInt((_35_ + 24))) == 0) {
                                            break label$9;
                                        }
                                        _33_ = this._storeInt((_35_ + 16), 0);
                                        label$11:
                                        do {
                                            label$10:
                                            while (true) {
                                                if ((this._loadInt((_35_ + 16))) >= (this._loadInt((_35_ + 28)))) {
                                                    break label$11;
                                                }
                                                _34_ = this._storeInt((_35_ + 8), (this._loadInt(((this._loadInt(((this._loadInt((_35_ + 36))) + 8))) + ((this._loadInt((_35_ + 16))) << 2)))));
                                                label$12:
                                                do {
                                                    if ((this._storeInt((_35_ + 4), (this._loadInt((((this._loadInt(((this._loadInt((_35_ + 52))) + 12))) + (_34_ * 24)) + 16))))) != 0) {
                                                        break label$12;
                                                    }
                                                    this._storeInt((_35_ + 4), 31040);
                                                }
                                                while (false);
                                                if ((sqlite3StrICmp((this._loadInt(((this._loadInt(((this._loadInt((_35_ + 36))) + 44))) + ((this._loadInt((_35_ + 16))) << 2)))), (this._loadInt((_35_ + 4))))) != 0) {
                                                    break label$11;
                                                }
                                                this._storeInt(_35_, (this._loadInt(((this._loadInt(((this._loadInt((_35_ + 52))) + 12))) + ((this._loadInt((_35_ + 8))) * 24)))));
                                                this._storeInt((_35_ + 12), _33_);
                                                label$13:
                                                do {
                                                    label$15:
                                                    do {
                                                        label$14:
                                                        while (true) {
                                                            if ((this._loadInt((_35_ + 12))) >= (this._loadInt((_35_ + 28)))) {
                                                                break label$13;
                                                            }
                                                            if ((sqlite3StrICmp((this._loadInt((((this._loadInt((_35_ + 48))) + ((this._loadInt((_35_ + 12))) << 3)) + 40))), (this._loadInt(_35_)))) == 0) {
                                                                break label$15;
                                                            }
                                                            this._storeInt((_35_ + 12), ((this._loadInt((_35_ + 12))) + 1));
                                                            continue label$14;
                                                        }
                                                    }
                                                    while (false);
                                                    if ((this._loadInt((_35_ + 32))) == 0) {
                                                        break label$13;
                                                    }
                                                    this._storeInt(((this._loadInt((_35_ + 32))) + ((this._loadInt((_35_ + 16))) << 2)), (this._loadInt((((this._loadInt((_35_ + 48))) + ((this._loadInt((_35_ + 12))) << 3)) + 36))));
                                                }
                                                while (false);
                                                if ((this._loadInt((_35_ + 12))) == (this._loadInt((_35_ + 28)))) {
                                                    break label$11;
                                                }
                                                this._storeInt((_35_ + 16), ((this._loadInt((_35_ + 16))) + 1));
                                                continue label$10;
                                            }
                                        }
                                        while (false);
                                        if ((this._loadInt((_35_ + 16))) != (this._loadInt((_35_ + 28)))) {
                                            break label$8;
                                        }
                                        break label$5;
                                    }
                                    while (false);
                                    if ((this._loadInt8u(((this._loadInt((_35_ + 36))) + 25))) == 2) {
                                        break label$7;
                                    }
                                }
                                while (false);
                                this._storeInt((_35_ + 36), (this._loadInt(((this._loadInt((_35_ + 36))) + 32))));
                                continue label$6;
                            }
                        }
                        while (false);
                        if ((this._loadInt((_35_ + 32))) == 0) {
                            break label$5;
                        }
                        this._storeInt((_35_ + 20), 0);
                        label$17:
                        do {
                            label$16:
                            while (true) {
                                if ((this._loadInt((_35_ + 20))) >= (this._loadInt((_35_ + 28)))) {
                                    break label$17;
                                }
                                this._storeInt(((this._loadInt((_35_ + 32))) + ((_34_ = this._loadInt((_35_ + 20))) << 2)), (this._loadInt((((this._loadInt((_35_ + 48))) + (_34_ << 3)) + 36))));
                                this._storeInt((_35_ + 20), (_34_ + 1));
                                continue label$16;
                            }
                        }
                        while (false);
                    }
                    while (false);
                    label$18:
                    do {
                        if ((this._loadInt((_35_ + 36))) == 0) {
                            break label$18;
                        }
                        this._storeInt((this._loadInt((_35_ + 44))), (this._loadInt((_35_ + 36))));
                        this._storeInt((_35_ + 60), 0);
                        break label$0;
                    }
                    while (false);
                    label$19:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_35_ + 56))) + 442))) != 0) {
                            break label$19;
                        }
                        sqlite3ErrorMsg((this._loadInt((_35_ + 56))), 46592, 0);
                    }
                    while (false);
                    sqlite3DbFree((this._loadInt((this._loadInt((_35_ + 56))))), (this._loadInt((_35_ + 32))));
                    this._storeInt((_35_ + 60), 1);
                    break label$0;
                }
                while (false);
                this._storeInt((_35_ + 60), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_35_ + 60), 0);
        }
        while (false);
        _34_ = this._loadInt((_35_ + 60));
        this._storeInt((0 + 4), (_35_ + 64));
        return _34_;
    }

    @Override()
    public final void fkLookupParent(
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
        this._storeInt(((_39_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 92), _30_);
        this._storeInt((_39_ + 88), _31_);
        this._storeInt((_39_ + 84), _32_);
        this._storeInt((_39_ + 80), _33_);
        this._storeInt((_39_ + 76), _34_);
        this._storeInt((_39_ + 72), _35_);
        this._storeInt((_39_ + 68), _36_);
        this._storeInt((_39_ + 64), _37_);
        this._storeInt((_39_ + 60), _38_);
        this._storeInt((_39_ + 52), (sqlite3GetVdbe((this._loadInt((_39_ + 92))))));
        this._storeInt((_39_ + 48), ((this._loadInt(((this._loadInt((_39_ + 92))) + 68))) + -1));
        this._storeInt((_39_ + 44), (sqlite3VdbeMakeLabel((this._loadInt((_39_ + 52))))));
        label$0:
        do {
            if ((this._loadInt((_39_ + 64))) > -1) {
                break label$0;
            }
            sqlite3VdbeAddOp2((this._loadInt((_39_ + 52))), 111, (this._loadInt8u(((this._loadInt((_39_ + 76))) + 24))), (this._loadInt((_39_ + 44))));
        }
        while (false);
        this._storeInt((_39_ + 56), 0);
        label$2:
        do {
            label$1:
            while (true) {
                if ((this._loadInt((_39_ + 56))) >= (this._loadInt(((this._loadInt((_39_ + 76))) + 20)))) {
                    break label$2;
                }
                _38_ = this._storeInt((_39_ + 40), (((this._loadInt(((this._loadInt((_39_ + 72))) + ((this._loadInt((_39_ + 56))) << 2)))) + (this._loadInt((_39_ + 68)))) + 1));
                sqlite3VdbeAddOp2((this._loadInt((_39_ + 52))), 73, _38_, (this._loadInt((_39_ + 44))));
                this._storeInt((_39_ + 56), ((this._loadInt((_39_ + 56))) + 1));
                continue label$1;
            }
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt((_39_ + 60))) != 0) {
                break label$3;
            }
            label$4:
            do {
                label$5:
                do {
                    label$6:
                    do {
                        if ((this._loadInt((_39_ + 80))) == 0) {
                            break label$6;
                        }
                        _38_ = this._storeInt((_39_ + 28), (this._loadInt(((this._loadInt((_39_ + 76))) + 20))));
                        this._storeInt((_39_ + 24), (sqlite3GetTempRange((this._loadInt((_39_ + 92))), _38_)));
                        this._storeInt((_39_ + 20), (sqlite3GetTempReg((this._loadInt((_39_ + 92))))));
                        this._storeInt((_39_ + 16), (sqlite3IndexKeyinfo((this._loadInt((_39_ + 92))), (this._loadInt((_39_ + 80))))));
                        sqlite3VdbeAddOp3((this._loadInt((_39_ + 52))), 38, (this._loadInt((_39_ + 48))), (this._loadInt(((this._loadInt((_39_ + 80))) + 20))), (this._loadInt((_39_ + 88))));
                        sqlite3VdbeChangeP4((this._loadInt((_39_ + 52))), -1, (this._loadInt((_39_ + 16))), -16);
                        this._storeInt((_39_ + 56), 0);
                        label$8:
                        do {
                            label$7:
                            while (true) {
                                if ((this._loadInt((_39_ + 56))) >= (this._loadInt((_39_ + 28)))) {
                                    break label$8;
                                }
                                sqlite3VdbeAddOp2((this._loadInt((_39_ + 52))), 14, (((this._loadInt(((this._loadInt((_39_ + 72))) + ((_38_ = this._loadInt((_39_ + 56))) << 2)))) + (this._loadInt((_39_ + 68)))) + 1), ((this._loadInt((_39_ + 24))) + _38_));
                                this._storeInt((_39_ + 56), ((this._loadInt((_39_ + 56))) + 1));
                                continue label$7;
                            }
                        }
                        while (false);
                        if ((this._loadInt((_39_ + 84))) != (this._loadInt((this._loadInt((_39_ + 76)))))) {
                            break label$4;
                        }
                        if ((this._loadInt((_39_ + 64))) != 1) {
                            break label$4;
                        }
                        this._storeInt((_39_ + 12), (((sqlite3VdbeCurrentAddr((this._loadInt((_39_ + 52))))) + (this._loadInt((_39_ + 28)))) + 1));
                        this._storeInt((_39_ + 56), 0);
                        label$9:
                        while (true) {
                            if ((this._loadInt((_39_ + 56))) >= (this._loadInt((_39_ + 28)))) {
                                break label$5;
                            }
                            this._storeInt((_39_ + 8), (((this._loadInt(((this._loadInt((_39_ + 72))) + ((this._loadInt((_39_ + 56))) << 2)))) + (this._loadInt((_39_ + 68)))) + 1));
                            this._storeInt((_39_ + 4), (((this._loadInt(((this._loadInt(((this._loadInt((_39_ + 80))) + 8))) + ((this._loadInt((_39_ + 56))) << 2)))) + (this._loadInt((_39_ + 68)))) + 1));
                            label$11:
                            do {
                                if ((this._loadInt(((this._loadInt(((this._loadInt((_39_ + 80))) + 8))) + ((this._loadInt((_39_ + 56))) << 2)))) != (this._loadInt(((this._loadInt((_39_ + 84))) + 4)))) {
                                    break label$11;
                                }
                                this._storeInt((_39_ + 4), (this._loadInt((_39_ + 68))));
                            }
                            while (false);
                            sqlite3VdbeAddOp3((this._loadInt((_39_ + 52))), 75, (this._loadInt((_39_ + 8))), (this._loadInt((_39_ + 12))), (this._loadInt((_39_ + 4))));
                            sqlite3VdbeChangeP5((this._loadInt((_39_ + 52))), 8);
                            this._storeInt((_39_ + 56), ((this._loadInt((_39_ + 56))) + 1));
                            continue label$9;
                        }
                    }
                    while (false);
                    _38_ = this._storeInt((_39_ + 32), (sqlite3GetTempReg((this._loadInt((_39_ + 92))))));
                    sqlite3VdbeAddOp2((this._loadInt((_39_ + 52))), 15, (((this._loadInt((this._loadInt((_39_ + 72))))) + (this._loadInt((_39_ + 68)))) + 1), _38_);
                    this._storeInt((_39_ + 36), (sqlite3VdbeAddOp2((this._loadInt((_39_ + 52))), 21, (this._loadInt((_39_ + 32))), 0)));
                    label$12:
                    do {
                        if ((this._loadInt((_39_ + 84))) != (this._loadInt((this._loadInt((_39_ + 76)))))) {
                            break label$12;
                        }
                        if ((this._loadInt((_39_ + 64))) != 1) {
                            break label$12;
                        }
                        sqlite3VdbeAddOp3((this._loadInt((_39_ + 52))), 76, (this._loadInt((_39_ + 68))), (this._loadInt((_39_ + 44))), (this._loadInt((_39_ + 32))));
                    }
                    while (false);
                    sqlite3OpenTable((this._loadInt((_39_ + 92))), (this._loadInt((_39_ + 48))), (this._loadInt((_39_ + 88))), (this._loadInt((_39_ + 84))), 38);
                    sqlite3VdbeAddOp3((this._loadInt((_39_ + 52))), 52, (this._loadInt((_39_ + 48))), 0, (this._loadInt((_39_ + 32))));
                    sqlite3VdbeAddOp2((this._loadInt((_39_ + 52))), 1, 0, (this._loadInt((_39_ + 44))));
                    sqlite3VdbeJumpHere((_38_ = this._loadInt((_39_ + 52))), ((sqlite3VdbeCurrentAddr(_38_)) + -2));
                    sqlite3VdbeJumpHere((this._loadInt((_39_ + 52))), (this._loadInt((_39_ + 36))));
                    sqlite3ReleaseTempReg((this._loadInt((_39_ + 92))), (this._loadInt((_39_ + 32))));
                    break label$3;
                }
                while (false);
                sqlite3VdbeAddOp2((this._loadInt((_39_ + 52))), 1, 0, (this._loadInt((_39_ + 44))));
            }
            while (false);
            sqlite3VdbeAddOp3((this._loadInt((_39_ + 52))), 30, (this._loadInt((_39_ + 24))), (this._loadInt((_39_ + 28))), (this._loadInt((_39_ + 20))));
            sqlite3VdbeChangeP4((_38_ = this._loadInt((_39_ + 52))), -1, (sqlite3IndexAffinityStr(_38_, (this._loadInt((_39_ + 80))))), 0);
            sqlite3VdbeAddOp4Int((this._loadInt((_39_ + 52))), 50, (this._loadInt((_39_ + 48))), (this._loadInt((_39_ + 44))), (this._loadInt((_39_ + 20))), 0);
            sqlite3ReleaseTempReg((this._loadInt((_39_ + 92))), (this._loadInt((_39_ + 20))));
            sqlite3ReleaseTempRange((this._loadInt((_39_ + 92))), (this._loadInt((_39_ + 24))), (this._loadInt((_39_ + 28))));
        }
        while (false);
        label$13:
        do {
            label$14:
            do {
                label$15:
                do {
                    if ((this._loadInt8u(((this._loadInt((_39_ + 76))) + 24))) != 0) {
                        break label$15;
                    }
                    if ((this._loadInt(((this._loadInt((_39_ + 92))) + 424))) != 0) {
                        break label$15;
                    }
                    if ((this._loadInt8u(((this._loadInt((_39_ + 92))) + 344))) == 0) {
                        break label$14;
                    }
                }
                while (false);
                label$16:
                do {
                    if ((this._loadInt((_39_ + 64))) < 1) {
                        break label$16;
                    }
                    if ((this._loadInt8u(((this._loadInt((_39_ + 76))) + 24))) != 0) {
                        break label$16;
                    }
                    label$17:
                    do {
                        label$18:
                        do {
                            if ((this._loadInt(((this._loadInt((_39_ + 92))) + 424))) == 0) {
                                break label$18;
                            }
                            _38_ = this._loadInt(((this._loadInt((_39_ + 92))) + 424));
                            break label$17;
                        }
                        while (false);
                        _38_ = this._loadInt((_39_ + 92));
                    }
                    while (false);
                    this._storeInt8((_38_ + 345), 1);
                }
                while (false);
                sqlite3VdbeAddOp2((this._loadInt((_39_ + 52))), 110, (this._loadInt8u(((this._loadInt((_39_ + 76))) + 24))), (this._loadInt((_39_ + 64))));
                break label$13;
            }
            while (false);
            sqlite3HaltConstraint((this._loadInt((_39_ + 92))), 2, 31616, -2);
        }
        while (false);
        sqlite3VdbeResolveLabel((this._loadInt((_39_ + 52))), (this._loadInt((_39_ + 44))));
        sqlite3VdbeAddOp1((this._loadInt((_39_ + 52))), 43, (this._loadInt((_39_ + 48))));
        this._storeInt((0 + 4), (_39_ + 96));
        return;
    }

    @Override()
    public final void fkScanChildren(
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
        this._storeInt(((_38_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 128))) + 124), _30_);
        this._storeInt((_38_ + 120), _31_);
        this._storeInt((_38_ + 116), _32_);
        this._storeInt((_38_ + 112), _33_);
        this._storeInt((_38_ + 108), _34_);
        this._storeInt((_38_ + 104), _35_);
        this._storeInt((_38_ + 100), _36_);
        this._storeInt((_38_ + 96), _37_);
        this._storeInt((_38_ + 92), (this._loadInt((this._loadInt((_38_ + 124))))));
        _37_ = this._storeInt((_38_ + 40), (this._storeInt((_38_ + 84), 0)));
        this._storeInt((_38_ + 36), (sqlite3GetVdbe((this._loadInt((_38_ + 124))))));
        label$0:
        do {
            if ((this._loadInt((_38_ + 96))) > -1) {
                break label$0;
            }
            this._storeInt((_38_ + 40), (sqlite3VdbeAddOp2((this._loadInt((_38_ + 36))), 111, (this._loadInt8u(((this._loadInt((_38_ + 108))) + 24))), _37_)));
        }
        while (false);
        this._storeInt((_38_ + 88), _37_);
        label$2:
        do {
            label$1:
            while (true) {
                if ((this._loadInt((_38_ + 88))) >= (this._loadInt(((this._loadInt((_38_ + 108))) + 20)))) {
                    break label$2;
                }
                label$3:
                do {
                    if ((this._storeInt((_38_ + 32), (sqlite3Expr((this._loadInt((_38_ + 92))), 132, _37_)))) == 0) {
                        break label$3;
                    }
                    label$4:
                    do {
                        if ((this._loadInt((_38_ + 112))) == 0) {
                            break label$4;
                        }
                        _36_ = this._storeInt((_38_ + 20), (this._loadInt(((this._loadInt(((this._loadInt((_38_ + 112))) + 8))) + ((this._loadInt((_38_ + 88))) << 2)))));
                        this._storeInt((_38_ + 12), ((this._loadInt(((this._loadInt((_38_ + 116))) + 12))) + (_36_ * 24)));
                        label$5:
                        do {
                            if ((this._loadInt(((this._loadInt((_38_ + 116))) + 4))) != (this._loadInt((_38_ + 20)))) {
                                break label$5;
                            }
                            this._storeInt((_38_ + 20), -1);
                        }
                        while (false);
                        this._storeInt(((_36_ = this._loadInt((_38_ + 32))) + 24), (((this._loadInt((_38_ + 100))) + (this._loadInt((_38_ + 20)))) + 1));
                        this._storeInt8((_36_ + 1), (this._loadInt8u(((this._loadInt((_38_ + 12))) + 22))));
                        _36_ = sqlite3LocateCollSeq((this._loadInt((_38_ + 124))), (this._loadInt(((this._loadInt((_38_ + 12))) + 16))));
                        this._storeInt(((this._loadInt((_38_ + 32))) + 20), _36_);
                        break label$3;
                    }
                    while (false);
                    this._storeInt8(((_36_ = this._loadInt((_38_ + 32))) + 1), 100);
                    this._storeInt((_36_ + 24), (this._loadInt((_38_ + 100))));
                }
                while (false);
                label$6:
                do {
                    label$7:
                    do {
                        if ((this._loadInt((_38_ + 104))) == 0) {
                            break label$7;
                        }
                        _36_ = this._loadInt(((this._loadInt((_38_ + 104))) + ((this._loadInt((_38_ + 88))) << 2)));
                        break label$6;
                    }
                    while (false);
                    _36_ = this._loadInt(((this._loadInt((_38_ + 108))) + 36));
                }
                while (false);
                this._storeInt((_38_ + 20), _36_);
                _36_ = this._storeInt((_38_ + 16), (this._loadInt(((this._loadInt(((this._loadInt((this._loadInt((_38_ + 108))))) + 12))) + (_36_ * 24)))));
                _36_ = this._storeInt((_38_ + 28), (sqlite3Expr((this._loadInt((_38_ + 92))), 26, _36_)));
                _36_ = this._storeInt((_38_ + 24), (sqlite3PExpr((this._loadInt((_38_ + 124))), 76, (this._loadInt((_38_ + 32))), _36_, _37_)));
                this._storeInt((_38_ + 84), (sqlite3ExprAnd((this._loadInt((_38_ + 92))), (this._loadInt((_38_ + 84))), _36_)));
                this._storeInt((_38_ + 88), ((this._loadInt((_38_ + 88))) + 1));
                continue label$1;
            }
        }
        while (false);
        label$8:
        do {
            if ((this._loadInt((_38_ + 116))) != (this._loadInt((this._loadInt((_38_ + 108)))))) {
                break label$8;
            }
            if ((this._loadInt((_38_ + 96))) < 1) {
                break label$8;
            }
            this._storeInt((_38_ + 4), (sqlite3Expr((this._loadInt((_38_ + 92))), 132, 0)));
            this._storeInt(_38_, (sqlite3Expr((this._loadInt((_38_ + 92))), 152, 0)));
            label$9:
            do {
                if ((this._loadInt((_38_ + 4))) == 0) {
                    break label$9;
                }
                if ((this._loadInt(_38_)) == 0) {
                    break label$9;
                }
                this._storeInt8(((_37_ = this._loadInt((_38_ + 4))) + 1), 100);
                this._storeInt((_37_ + 24), (this._loadInt((_38_ + 100))));
                this._storeInt(((this._loadInt(_38_)) + 24), (this._loadInt(((this._loadInt((_38_ + 120))) + 32))));
                this._storeInt16(((this._loadInt(_38_)) + 28), 65535);
            }
            while (false);
            _37_ = this._storeInt((_38_ + 8), (sqlite3PExpr((this._loadInt((_38_ + 124))), 75, (this._loadInt((_38_ + 4))), (this._loadInt(_38_)), 0)));
            this._storeInt((_38_ + 84), (sqlite3ExprAnd((this._loadInt((_38_ + 92))), (this._loadInt((_38_ + 84))), _37_)));
        }
        while (false);
        memset((_38_ + 48), 0, 36);
        _37_ = this._loadInt((_38_ + 120));
        this._storeInt((_38_ + 48), (this._loadInt((_38_ + 124))));
        this._storeInt((_38_ + 52), _37_);
        sqlite3ResolveExprNames((_38_ + 48), (this._loadInt((_38_ + 84))));
        this._storeInt((_38_ + 44), (sqlite3WhereBegin((this._loadInt((_38_ + 124))), (this._loadInt((_38_ + 120))), (this._loadInt((_38_ + 84))), 0, 0)));
        label$10:
        do {
            if ((this._loadInt((_38_ + 96))) < 1) {
                break label$10;
            }
            if ((this._loadInt8u(((this._loadInt((_38_ + 108))) + 24))) != 0) {
                break label$10;
            }
            label$11:
            do {
                label$12:
                do {
                    if ((this._loadInt(((this._loadInt((_38_ + 124))) + 424))) == 0) {
                        break label$12;
                    }
                    _37_ = this._loadInt(((this._loadInt((_38_ + 124))) + 424));
                    break label$11;
                }
                while (false);
                _37_ = this._loadInt((_38_ + 124));
            }
            while (false);
            this._storeInt8((_37_ + 345), 1);
        }
        while (false);
        sqlite3VdbeAddOp2((this._loadInt((_38_ + 36))), 110, (this._loadInt8u(((this._loadInt((_38_ + 108))) + 24))), (this._loadInt((_38_ + 96))));
        label$13:
        do {
            if ((this._loadInt((_38_ + 44))) == 0) {
                break label$13;
            }
            sqlite3WhereEnd((this._loadInt((_38_ + 44))));
        }
        while (false);
        sqlite3ExprDelete((this._loadInt((_38_ + 92))), (this._loadInt((_38_ + 84))));
        label$14:
        do {
            if ((this._loadInt((_38_ + 40))) == 0) {
                break label$14;
            }
            sqlite3VdbeJumpHere((this._loadInt((_38_ + 36))), (this._loadInt((_38_ + 40))));
        }
        while (false);
        this._storeInt((0 + 4), (_38_ + 128));
        return;
    }

    @Override()
    public final int sqlite3WhereBegin(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        long _35_ = 0L;
        long _36_ = 0L;
        int _37_ = 0;
        double _38_ = 0.0;
        double _39_ = 0.0;
        long _31_0 = 0L;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_37_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 304))) + 296), _30_);
        this._storeInt((_37_ + 292), _31_);
        this._storeInt((_37_ + 288), _32_);
        this._storeInt((_37_ + 284), _33_);
        this._storeInt16((_37_ + 282), _34_);
        this._storeInt((_37_ + 260), (this._loadInt(((this._loadInt((_37_ + 296))) + 12))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt16s((this._loadInt((_37_ + 292))))) < 65) {
                    break label$1;
                }
                _34_ = this._loadInt((_37_ + 296));
                this._storeInt(_37_, 64);
                sqlite3ErrorMsg(_34_, 45968, _37_);
                this._storeInt((_37_ + 300), 0);
                break label$0;
            }
            while (false);
            _34_ = 1;
            label$2:
            do {
                if (((this._loadInt16u((_37_ + 282))) & 128) != 0) {
                    break label$2;
                }
                _34_ = this._loadInt16s((this._loadInt((_37_ + 292))));
            }
            while (false);
            this._storeInt((_37_ + 268), _34_);
            this._storeInt((_37_ + 220), (this._loadInt((this._loadInt((_37_ + 296))))));
            _34_ = this._storeInt((_37_ + 272), ((((this._loadInt((_37_ + 268))) * 80) + 55) & -8));
            this._storeInt((_37_ + 264), (sqlite3DbMallocZero((this._loadInt((_37_ + 220))), (_34_ + 612))));
            label$3:
            do {
                label$4:
                do {
                    if ((this._loadInt8u(((this._loadInt((_37_ + 220))) + 30))) == 0) {
                        break label$4;
                    }
                    sqlite3DbFree((this._loadInt((_37_ + 220))), (this._loadInt((_37_ + 264))));
                    this._storeInt((_37_ + 264), 0);
                    break label$3;
                }
                while (false);
                this._storeInt(((_34_ = this._loadInt((_37_ + 264))) + 24), (this._loadInt((_37_ + 268))));
                this._storeInt(_34_, (this._loadInt((_37_ + 296))));
                this._storeInt(((this._loadInt((_37_ + 264))) + 8), (this._loadInt((_37_ + 292))));
                _34_ = sqlite3VdbeMakeLabel((this._loadInt((_37_ + 260))));
                this._storeInt(((_33_ = this._loadInt((_37_ + 264))) + 20), _34_);
                _34_ = this._storeInt((_37_ + 240), (_33_ + (this._loadInt((_37_ + 272)))));
                this._storeInt(((_33_ = this._loadInt((_37_ + 264))) + 28), _34_);
                this._storeInt16((_33_ + 4), (this._loadInt16u((_37_ + 282))));
                this._storeDouble(((this._loadInt((_37_ + 264))) + 32), (this._loadDouble(((this._loadInt((_37_ + 296))) + 448))));
                memset((this._storeInt((_37_ + 244), ((this._loadInt((_37_ + 240))) + 352))), 0, 260);
                whereClauseInit((this._loadInt((_37_ + 240))), (this._loadInt((_37_ + 296))), (this._loadInt((_37_ + 244))));
                sqlite3ExprCodeConstants((this._loadInt((_37_ + 296))), (this._loadInt((_37_ + 288))));
                whereSplit((this._loadInt((_37_ + 240))), (this._loadInt((_37_ + 288))), 69);
                label$5:
                do {
                    if ((this._loadInt((_37_ + 288))) == 0) {
                        break label$5;
                    }
                    label$6:
                    do {
                        if ((this._loadInt((_37_ + 268))) == 0) {
                            break label$6;
                        }
                        if ((sqlite3ExprIsConstantNotJoin((this._loadInt((_37_ + 288))))) == 0) {
                            break label$5;
                        }
                    }
                    while (false);
                    sqlite3ExprIfFalse((this._loadInt((_37_ + 296))), (this._loadInt((_37_ + 288))), (this._loadInt(((this._loadInt((_37_ + 264))) + 20))), 8);
                    this._storeInt((_37_ + 288), 0);
                }
                while (false);
                this._storeInt((_37_ + 276), 0);
                label$8:
                do {
                    label$7:
                    while (true) {
                        if ((this._loadInt((_37_ + 276))) >= (this._loadInt16s((this._loadInt((_37_ + 292)))))) {
                            break label$8;
                        }
                        createMask((this._loadInt((_37_ + 244))), (this._loadInt((((this._loadInt((_37_ + 292))) + ((this._loadInt((_37_ + 276))) * 56)) + 32))));
                        label$9:
                        do {
                            if ((this._loadInt((((this._loadInt((_37_ + 292))) + ((this._loadInt((_37_ + 276))) * 56)) + 20))) == 0) {
                                break label$9;
                            }
                            if (((this._loadInt8u(((this._loadInt((((this._loadInt((_37_ + 292))) + ((this._loadInt((_37_ + 276))) * 56)) + 20))) + 34))) & 16) == 0) {
                                break label$9;
                            }
                            this._storeLong(((_34_ = this._loadInt((_37_ + 240))) + 8), ((this._loadLong((_34_ + 8))) | (1L << (this._loadLong32u((_37_ + 276))))));
                        }
                        while (false);
                        this._storeInt((_37_ + 276), ((this._loadInt((_37_ + 276))) + 1));
                        continue label$7;
                    }
                }
                while (false);
                exprAnalyzeAll((this._loadInt((_37_ + 292))), (this._loadInt((_37_ + 240))));
                if ((this._loadInt8u(((this._loadInt((_37_ + 220))) + 30))) != 0) {
                    break label$3;
                }
                _35_ = this._storeLong((_37_ + 248), -1L);
                _30_ = this._storeInt((_37_ + 224), -1);
                _31_ = this._storeInt((_37_ + 276), (this._storeInt((_37_ + 228), 0)));
                this._storeInt((_37_ + 232), ((this._loadInt((_37_ + 264))) + 48));
                label$11:
                do {
                    label$10:
                    while (true) {
                        if ((this._loadInt((_37_ + 276))) >= (this._loadInt((_37_ + 268)))) {
                            break label$11;
                        }
                        _32_ = this._storeInt((_37_ + 164), _30_);
                        memset((_37_ + 176), _31_, 40);
                        _34_ = this._storeInt((_37_ + 144), _31_);
                        _36_ = this._storeLong((_37_ + 136), 0L);
                        this._storeLong((_37_ + 200), 6088095589093318446L);
                        this._storeInt((_37_ + 148), (((this._loadInt((_37_ + 228))) < (_32_ + (this._loadInt((_37_ + 268))))) ? 1 : 0));
                        label$12:
                        while (true) {
                            _33_ = 0;
                            label$14:
                            do {
                                if ((this._loadInt((_37_ + 148))) < 0) {
                                    break label$14;
                                }
                                _33_ = (this._loadInt((_37_ + 164))) >>> 31;
                            }
                            while (false);
                            label$15:
                            do {
                                label$16:
                                do {
                                    if (_33_ == 0) {
                                        break label$16;
                                    }
                                    _33_ = this._storeInt((_37_ + 168), (this._loadInt((_37_ + 228))));
                                    this._storeInt((_37_ + 236), (((this._loadInt((_37_ + 292))) + (_33_ * 56)) + 8));
                                    label$17:
                                    while (true) {
                                        if ((this._loadInt((_37_ + 168))) >= (this._loadInt((_37_ + 268)))) {
                                            break label$15;
                                        }
                                        this._storeInt((_37_ + 124), ((((this._loadInt8u(((this._loadInt((_37_ + 236))) + 21))) & 10) != _34_) ? 1 : 0));
                                        label$19:
                                        do {
                                            if ((this._loadInt((_37_ + 168))) == (this._loadInt((_37_ + 228)))) {
                                                break label$19;
                                            }
                                            if ((this._loadInt((_37_ + 124))) != 0) {
                                                break label$15;
                                            }
                                        }
                                        while (false);
                                        label$20:
                                        do {
                                            label$21:
                                            do {
                                                label$22:
                                                do {
                                                    label$23:
                                                    do {
                                                        if (((this._storeLong((_37_ + 152), (getMask((this._loadInt((_37_ + 244))), (this._loadInt(((this._loadInt((_37_ + 236))) + 24))))))) & (this._loadLong((_37_ + 248)))) == _36_) {
                                                            break label$23;
                                                        }
                                                        if ((this._loadInt((_37_ + 148))) == 0) {
                                                            break label$22;
                                                        }
                                                        _31_0 = this._loadLong((_37_ + 152));
                                                        break label$21;
                                                    }
                                                    while (false);
                                                    if ((this._loadInt((_37_ + 168))) != (this._loadInt((_37_ + 228)))) {
                                                        break label$20;
                                                    }
                                                    this._storeInt((_37_ + 228), ((this._loadInt((_37_ + 228))) + 1));
                                                    break label$20;
                                                }
                                                while (false);
                                                _31_0 = this._loadLong((_37_ + 248));
                                            }
                                            while (false);
                                            this._storeLong((_37_ + 128), _31_0);
                                            _33_ = 0;
                                            label$24:
                                            do {
                                                if ((this._loadInt((_37_ + 276))) != 0) {
                                                    break label$24;
                                                }
                                                if ((this._loadInt((_37_ + 284))) == 0) {
                                                    break label$24;
                                                }
                                                _33_ = this._loadInt((this._loadInt((_37_ + 284))));
                                            }
                                            while (false);
                                            this._storeInt((_37_ + 76), _33_);
                                            label$25:
                                            do {
                                                if ((this._loadInt(((this._loadInt((_37_ + 236))) + 52))) != 0) {
                                                    break label$25;
                                                }
                                                this._storeInt((_37_ + 144), ((this._loadInt((_37_ + 144))) + 1));
                                            }
                                            while (false);
                                            label$26:
                                            do {
                                                label$27:
                                                do {
                                                    if (((this._loadInt8u(((this._loadInt(((this._loadInt((_37_ + 236))) + 12))) + 34))) & 16) == 0) {
                                                        break label$27;
                                                    }
                                                    _33_ = this._storeInt((_37_ + 72), (((this._loadInt((_37_ + 264))) + ((this._loadInt((_37_ + 168))) * 80)) + 120));
                                                    bestVirtualIndex((this._loadInt((_37_ + 296))), (this._loadInt((_37_ + 240))), (this._loadInt((_37_ + 236))), (this._loadLong((_37_ + 128))), (this._loadLong((_37_ + 248))), (this._loadInt((_37_ + 76))), (_37_ + 80), _33_);
                                                    break label$26;
                                                }
                                                while (false);
                                                bestBtreeIndex((this._loadInt((_37_ + 296))), (this._loadInt((_37_ + 240))), (this._loadInt((_37_ + 236))), (this._loadLong((_37_ + 128))), (this._loadLong((_37_ + 248))), (this._loadInt((_37_ + 76))), (_37_ + 80));
                                            }
                                            while (false);
                                            label$28:
                                            do {
                                                if ((this._loadInt((_37_ + 148))) == 0) {
                                                    break label$28;
                                                }
                                                if (((this._loadInt((_37_ + 80))) & 269430784) != 0) {
                                                    break label$28;
                                                }
                                                this._storeLong((_37_ + 136), ((this._loadLong((_37_ + 136))) | (this._loadLong((_37_ + 152)))));
                                            }
                                            while (false);
                                            label$29:
                                            do {
                                                if (((this._loadLong((_37_ + 112))) & (this._loadLong((_37_ + 248)))) != _36_) {
                                                    break label$29;
                                                }
                                                label$30:
                                                do {
                                                    if ((this._loadInt((_37_ + 164))) < _34_) {
                                                        break label$30;
                                                    }
                                                    if (((this._loadLong((_37_ + 136))) & (this._loadLong((_37_ + 152)))) != _36_) {
                                                        break label$30;
                                                    }
                                                    if (((this._loadInt((_37_ + 176))) & 269430784) == 0) {
                                                        break label$30;
                                                    }
                                                    if (((this._loadInt((_37_ + 80))) & 269430784) == 0) {
                                                        break label$29;
                                                    }
                                                }
                                                while (false);
                                                label$31:
                                                do {
                                                    if ((this._loadInt((_37_ + 144))) == 0) {
                                                        break label$31;
                                                    }
                                                    if ((this._loadInt(((this._loadInt((_37_ + 236))) + 52))) == 0) {
                                                        break label$31;
                                                    }
                                                    if (((this._loadInt((_37_ + 80))) & 269430784) == 0) {
                                                        break label$29;
                                                    }
                                                }
                                                while (false);
                                                label$32:
                                                do {
                                                    if ((this._loadInt((_37_ + 164))) < _34_) {
                                                        break label$32;
                                                    }
                                                    if ((this._loadDouble((_37_ + 104))) < (this._loadDouble((_37_ + 200)))) {
                                                        break label$32;
                                                    }
                                                    if (((((_39_ = this._loadDouble((_37_ + 104))) > (_38_ = this._loadDouble((_37_ + 200)))) ? 1 : 0) | (((_39_ != _39_) ? 1 : 0) | ((_38_ != _38_) ? 1 : 0))) != 0) {
                                                        break label$29;
                                                    }
                                                    if (((((_39_ = this._loadDouble((_37_ + 88))) >= (_38_ = this._loadDouble((_37_ + 184)))) ? 1 : 0) | (((_39_ != _39_) ? 1 : 0) | ((_38_ != _38_) ? 1 : 0))) != 0) {
                                                        break label$29;
                                                    }
                                                }
                                                while (false);
                                                memcpy((_37_ + 176), (_37_ + 80), 40);
                                                this._storeInt((_37_ + 164), (this._loadInt((_37_ + 168))));
                                            }
                                            while (false);
                                            if ((this._loadInt((_37_ + 124))) != 0) {
                                                break label$15;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_37_ + 168), ((this._loadInt((_37_ + 168))) + 1));
                                        this._storeInt((_37_ + 236), ((this._loadInt((_37_ + 236))) + 56));
                                        continue label$17;
                                    }
                                }
                                while (false);
                                label$33:
                                do {
                                    if (((this._loadInt8u((_37_ + 179))) & 1) == 0) {
                                        break label$33;
                                    }
                                    this._storeInt((this._loadInt((_37_ + 284))), _34_);
                                }
                                while (false);
                                this._storeInt((_37_ + 224), ((this._loadInt((_37_ + 224))) & (this._loadInt((_37_ + 176)))));
                                this._storeInt((_34_ = this._loadInt((_37_ + 232))), (this._loadInt((_37_ + 176))));
                                this._storeInt((_34_ + 20), (this._loadInt(((_37_ + 176) + 20))));
                                this._storeInt((_34_ + 16), (this._loadInt(((_37_ + 176) + 16))));
                                this._storeInt((_34_ + 12), (this._loadInt(((_37_ + 176) + 12))));
                                this._storeInt((_34_ + 8), (this._loadInt(((_37_ + 176) + 8))));
                                this._storeInt((_34_ + 4), (this._loadInt((_37_ + 180))));
                                label$34:
                                do {
                                    label$35:
                                    do {
                                        if (((this._loadInt16u((_37_ + 178))) & 8207) == 0) {
                                            break label$35;
                                        }
                                        this._storeInt(((_34_ = this._loadInt((_37_ + 296))) + 68), ((_34_ = this._loadInt((_34_ + 68))) + 1));
                                        this._storeInt(((this._loadInt((_37_ + 232))) + 32), _34_);
                                        break label$34;
                                    }
                                    while (false);
                                    this._storeInt(((this._loadInt((_37_ + 232))) + 32), _32_);
                                }
                                while (false);
                                _36_ = getMask((this._loadInt((_37_ + 244))), (this._loadInt((((this._loadInt((_37_ + 292))) + ((this._loadInt((_37_ + 164))) * 56)) + 32))));
                                this._storeLong((_37_ + 248), ((this._loadLong((_37_ + 248))) & (_36_ ^ _35_)));
                                this._storeInt8(((this._loadInt((_37_ + 232))) + 52), (this._loadInt((_37_ + 164))));
                                label$36:
                                do {
                                    if (((((_39_ = this._loadDouble((_37_ + 184))) < 1.0) ? 1 : 0) | ((_39_ != _39_) ? 1 : 0)) != 0) {
                                        break label$36;
                                    }
                                    this._storeDouble(((_34_ = this._loadInt((_37_ + 296))) + 448), ((this._loadDouble((_34_ + 448))) * (this._loadDouble((_37_ + 184)))));
                                }
                                while (false);
                                label$37:
                                do {
                                    label$38:
                                    do {
                                        if ((this._storeInt((_37_ + 172), (this._loadInt((((this._loadInt((_37_ + 292))) + ((this._loadInt((_37_ + 164))) * 56)) + 60))))) == 0) {
                                            break label$38;
                                        }
                                        if (((this._loadInt8u((_37_ + 178))) & 15) == 0) {
                                            break label$37;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_37_ + 276), ((this._loadInt((_37_ + 276))) + 1));
                                    this._storeInt((_37_ + 232), ((this._loadInt((_37_ + 232))) + 80));
                                    continue label$10;
                                }
                                while (false);
                                _34_ = this._loadInt((_37_ + 296));
                                this._storeInt((_37_ + 16), (this._loadInt((this._loadInt((_37_ + 172))))));
                                sqlite3ErrorMsg(_34_, 46000, (_37_ + 16));
                                break label$3;
                            }
                            while (false);
                            this._storeInt((_37_ + 148), ((this._loadInt((_37_ + 148))) + _32_));
                            continue label$12;
                        }
                    }
                }
                while (false);
                if ((this._loadInt(((this._loadInt((_37_ + 296))) + 64))) != 0) {
                    break label$3;
                }
                if ((this._loadInt8u(((this._loadInt((_37_ + 220))) + 30))) != 0) {
                    break label$3;
                }
                label$39:
                do {
                    if (((this._loadInt8u((_37_ + 227))) & 4) == 0) {
                        break label$39;
                    }
                    if ((this._loadInt((_37_ + 284))) == 0) {
                        break label$39;
                    }
                    this._storeInt((this._loadInt((_37_ + 284))), 0);
                }
                while (false);
                label$40:
                do {
                    if (((this._loadInt16u((_37_ + 282))) & 4) == 0) {
                        break label$40;
                    }
                    if (((this._loadInt8u((_37_ + 227))) & 4) == 0) {
                        break label$40;
                    }
                    this._storeInt8(((_34_ = this._loadInt((_37_ + 264))) + 6), 1);
                    this._storeInt((_34_ + 48), ((this._loadInt((_34_ + 48))) & -8388609));
                }
                while (false);
                sqlite3CodeVerifySchema((this._loadInt((_37_ + 296))), -1);
                _31_0 = this._storeLong((_37_ + 248), -1L);
                this._storeLong(((this._loadInt((_37_ + 264))) + 40), 4607182418800017408L);
                _32_ = this._storeInt((_37_ + 276), 0);
                this._storeInt((_37_ + 232), ((this._loadInt((_37_ + 264))) + 48));
                label$42:
                do {
                    label$41:
                    while (true) {
                        if ((this._loadInt((_37_ + 276))) >= (this._loadInt((_37_ + 268)))) {
                            break label$42;
                        }
                        this._storeInt((_37_ + 236), ((_34_ = (this._loadInt((_37_ + 292))) + ((this._loadInt8u(((this._loadInt((_37_ + 232))) + 52))) * 56)) + 8));
                        this._storeInt((_37_ + 68), (this._loadInt((_34_ + 20))));
                        this._storeInt(((_34_ = this._loadInt((_37_ + 232))) + 28), (this._loadInt(((this._loadInt((_37_ + 236))) + 24))));
                        this._storeDouble(((_33_ = this._loadInt((_37_ + 264))) + 40), ((this._loadDouble((_33_ + 40))) * (this._loadDouble((_34_ + 8)))));
                        this._storeInt((_37_ + 64), (sqlite3SchemaToIndex((this._loadInt((_37_ + 220))), (this._loadInt(((this._loadInt((_37_ + 68))) + 68))))));
                        label$43:
                        do {
                            if (((this._loadInt8u(((this._loadInt((_37_ + 68))) + 34))) & 2) != 0) {
                                break label$43;
                            }
                            if ((this._loadInt(((this._loadInt((_37_ + 68))) + 28))) != 0) {
                                break label$43;
                            }
                            label$44:
                            do {
                                if (((this._loadInt8u(((this._loadInt((_37_ + 232))) + 3))) & 8) == 0) {
                                    break label$44;
                                }
                                this._storeInt((_37_ + 60), (sqlite3GetVTable((this._loadInt((_37_ + 220))), (this._loadInt((_37_ + 68))))));
                                _34_ = this._storeInt((_37_ + 56), (this._loadInt(((this._loadInt((_37_ + 236))) + 24))));
                                sqlite3VdbeAddOp4((this._loadInt((_37_ + 260))), 127, _34_, _32_, _32_, (this._loadInt((_37_ + 60))), -10);
                                break label$43;
                            }
                            while (false);
                            label$45:
                            do {
                                if (((this._loadInt8u(((this._loadInt((_37_ + 232))) + 2))) >>> 7) != 0) {
                                    break label$45;
                                }
                                if (((this._loadInt16u((_37_ + 282))) & 16) != 0) {
                                    break label$45;
                                }
                                _temp$0 = 39;
                                _temp$1 = 38;
                                _temp$2 = ((this._loadInt8u(((this._loadInt((_37_ + 264))) + 6))) != 0) ? _temp$0 : _temp$1;
                                _temp$2 = this._storeInt((_37_ + 52), _temp$2);
                                _34_ = _temp$2;
                                sqlite3OpenTable((this._loadInt((_37_ + 296))), (this._loadInt(((this._loadInt((_37_ + 236))) + 24))), (this._loadInt((_37_ + 64))), (this._loadInt((_37_ + 68))), _34_);
                                if ((this._loadInt8u(((this._loadInt((_37_ + 264))) + 6))) != 0) {
                                    break label$43;
                                }
                                if ((this._loadInt(((this._loadInt((_37_ + 68))) + 8))) > 63) {
                                    break label$43;
                                }
                                this._storeLong((_37_ + 40), (this._loadLong(((this._loadInt((_37_ + 236))) + 40))));
                                this._storeInt((_37_ + 36), _32_);
                                label$47:
                                do {
                                    label$46:
                                    while (true) {
                                        if ((this._loadLong((_37_ + 40))) == 0) {
                                            break label$47;
                                        }
                                        this._storeLong((_37_ + 40), ((this._loadLong((_37_ + 40))) >>> 1L));
                                        this._storeInt((_37_ + 36), ((this._loadInt((_37_ + 36))) + 1));
                                        continue label$46;
                                    }
                                }
                                while (false);
                                sqlite3VdbeChangeP4((_34_ = this._loadInt((_37_ + 260))), ((sqlite3VdbeCurrentAddr(_34_)) + -1), (this._loadInt((_37_ + 36))), -14);
                                break label$43;
                            }
                            while (false);
                            sqlite3TableLock((this._loadInt((_37_ + 296))), (this._loadInt((_37_ + 64))), (this._loadInt(((_34_ = this._loadInt((_37_ + 68))) + 20))), _32_, (this._loadInt(_34_)));
                        }
                        while (false);
                        label$48:
                        do {
                            label$49:
                            do {
                                if (((this._loadInt8u(((this._loadInt((_37_ + 232))) + 3))) & 32) == 0) {
                                    break label$49;
                                }
                                constructAutomaticIndex((this._loadInt((_37_ + 296))), (this._loadInt((_37_ + 240))), (this._loadInt((_37_ + 236))), (this._loadLong((_37_ + 248))), (this._loadInt((_37_ + 232))));
                                break label$48;
                            }
                            while (false);
                            if (((this._loadInt8u(((this._loadInt((_37_ + 232))) + 2))) & 15) == 0) {
                                break label$48;
                            }
                            _34_ = this._storeInt((_37_ + 32), (this._loadInt(((this._loadInt((_37_ + 232))) + 16))));
                            this._storeInt((_37_ + 28), (sqlite3IndexKeyinfo((this._loadInt((_37_ + 296))), _34_)));
                            _34_ = this._storeInt((_37_ + 24), (this._loadInt(((this._loadInt((_37_ + 232))) + 32))));
                            sqlite3VdbeAddOp4((this._loadInt((_37_ + 260))), 38, _34_, (this._loadInt(((this._loadInt((_37_ + 32))) + 20))), (this._loadInt((_37_ + 64))), (this._loadInt((_37_ + 28))), -16);
                        }
                        while (false);
                        sqlite3CodeVerifySchema((this._loadInt((_37_ + 296))), (this._loadInt((_37_ + 64))));
                        _36_ = getMask((this._loadInt(((this._loadInt((_37_ + 240))) + 4))), (this._loadInt(((this._loadInt((_37_ + 236))) + 24))));
                        this._storeLong((_37_ + 248), ((this._loadLong((_37_ + 248))) & (_36_ ^ _31_0)));
                        this._storeInt((_37_ + 276), ((this._loadInt((_37_ + 276))) + 1));
                        this._storeInt((_37_ + 232), ((this._loadInt((_37_ + 232))) + 80));
                        continue label$41;
                    }
                }
                while (false);
                _34_ = sqlite3VdbeCurrentAddr((this._loadInt((_37_ + 260))));
                this._storeInt(((this._loadInt((_37_ + 264))) + 12), _34_);
                if ((this._loadInt8u(((this._loadInt((_37_ + 220))) + 30))) != 0) {
                    break label$3;
                }
                this._storeLong((_37_ + 248), -1L);
                this._storeInt((_37_ + 276), 0);
                label$51:
                do {
                    label$50:
                    while (true) {
                        if ((this._loadInt((_37_ + 276))) >= (this._loadInt((_37_ + 268)))) {
                            break label$51;
                        }
                        _33_ = this._storeInt((_37_ + 232), ((_34_ = (this._loadInt((_37_ + 264))) + ((this._loadInt((_37_ + 276))) * 80)) + 48));
                        explainOneScan((this._loadInt((_37_ + 296))), (this._loadInt((_37_ + 292))), _33_, (this._loadInt((_37_ + 276))), (this._loadInt8u((_34_ + 100))), (this._loadInt16u((_37_ + 282))));
                        this._storeLong((_37_ + 248), (codeOneLoopStart((this._loadInt((_37_ + 264))), (this._loadInt((_37_ + 276))), (this._loadInt16u((_37_ + 282))), (this._loadLong((_37_ + 248))))));
                        this._storeInt(((this._loadInt((_37_ + 264))) + 16), (this._loadInt(((this._loadInt((_37_ + 232))) + 44))));
                        this._storeInt((_37_ + 276), ((this._loadInt((_37_ + 276))) + 1));
                        continue label$50;
                    }
                }
                while (false);
                this._storeInt((_37_ + 300), (this._loadInt((_37_ + 264))));
                break label$0;
            }
            while (false);
            label$52:
            do {
                if ((this._loadInt((_37_ + 264))) == 0) {
                    break label$52;
                }
                this._storeDouble(((this._loadInt((_37_ + 296))) + 448), (this._loadDouble(((_34_ = this._loadInt((_37_ + 264))) + 32))));
                whereInfoFree((this._loadInt((_37_ + 220))), _34_);
            }
            while (false);
            this._storeInt((_37_ + 300), 0);
        }
        while (false);
        _34_ = this._loadInt((_37_ + 300));
        this._storeInt((0 + 4), (_37_ + 304));
        return _34_;
    }

    @Override()
    public final void sqlite3WhereEnd(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 68), (this._loadInt(((this._storeInt((_32_ + 72), (this._loadInt((this._storeInt((_32_ + 76), _30_)))))) + 12))));
        this._storeInt((_32_ + 56), (this._loadInt(((this._loadInt((_32_ + 76))) + 8))));
        this._storeInt((_32_ + 52), (this._loadInt((this._loadInt((_32_ + 72))))));
        sqlite3ExprCacheClear((this._loadInt((_32_ + 72))));
        this._storeInt((_32_ + 64), ((this._loadInt(((this._loadInt((_32_ + 76))) + 24))) + -1));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 64))) < 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 60), ((_30_ = (this._loadInt((_32_ + 76))) + ((this._loadInt((_32_ + 64))) * 80)) + 48));
                sqlite3VdbeResolveLabel((this._loadInt((_32_ + 68))), (this._loadInt((_30_ + 92))));
                label$2:
                do {
                    if ((this._loadInt8u(((this._loadInt((_32_ + 60))) + 53))) == 137) {
                        break label$2;
                    }
                    sqlite3VdbeAddOp2((this._loadInt((_32_ + 68))), (this._loadInt8u(((_30_ = this._loadInt((_32_ + 60))) + 53))), (this._loadInt((_30_ + 56))), (this._loadInt((_30_ + 60))));
                    sqlite3VdbeChangeP5((this._loadInt((_32_ + 68))), (this._loadInt8u(((this._loadInt((_32_ + 60))) + 54))));
                }
                while (false);
                label$3:
                do {
                    if (((this._loadInt((this._loadInt((_32_ + 60))))) & 987136) == 0) {
                        break label$3;
                    }
                    if ((this._loadInt(((this._loadInt((_32_ + 60))) + 64))) < 1) {
                        break label$3;
                    }
                    sqlite3VdbeResolveLabel((this._loadInt((_32_ + 68))), (this._loadInt(((this._loadInt((_32_ + 60))) + 40))));
                    _30_ = this._storeInt((_32_ + 44), (this._loadInt(((this._loadInt((_32_ + 60))) + 64))));
                    this._storeInt((_32_ + 48), (((this._loadInt(((this._loadInt((_32_ + 60))) + 68))) + (_30_ << 3)) + -8));
                    label$5:
                    do {
                        label$4:
                        while (true) {
                            if ((this._loadInt((_32_ + 44))) < 1) {
                                break label$5;
                            }
                            sqlite3VdbeJumpHere((this._loadInt((_32_ + 68))), ((this._loadInt(((this._loadInt((_32_ + 48))) + 4))) + 1));
                            sqlite3VdbeAddOp2((this._loadInt((_32_ + 68))), 67, (this._loadInt((_30_ = this._loadInt((_32_ + 48))))), (this._loadInt((_30_ + 4))));
                            sqlite3VdbeJumpHere((this._loadInt((_32_ + 68))), ((this._loadInt(((this._loadInt((_32_ + 48))) + 4))) + -1));
                            this._storeInt((_32_ + 44), ((this._loadInt((_32_ + 44))) + -1));
                            this._storeInt((_32_ + 48), ((this._loadInt((_32_ + 48))) + -8));
                            continue label$4;
                        }
                    }
                    while (false);
                    sqlite3DbFree((this._loadInt((_32_ + 52))), (this._loadInt(((this._loadInt((_32_ + 60))) + 68))));
                }
                while (false);
                sqlite3VdbeResolveLabel((this._loadInt((_32_ + 68))), (this._loadInt(((this._loadInt((_32_ + 60))) + 36))));
                label$6:
                do {
                    if ((this._loadInt(((this._loadInt((_32_ + 60))) + 24))) == 0) {
                        break label$6;
                    }
                    this._storeInt((_32_ + 40), (sqlite3VdbeAddOp1((this._loadInt((_32_ + 68))), 113, (this._loadInt(((this._loadInt((_32_ + 60))) + 24))))));
                    label$7:
                    do {
                        if (((this._loadInt8u(((this._loadInt((_32_ + 60))) + 2))) >>> 7) != 0) {
                            break label$7;
                        }
                        sqlite3VdbeAddOp1((this._loadInt((_32_ + 68))), 62, (this._loadInt((((this._loadInt((_32_ + 56))) + ((this._loadInt((_32_ + 64))) * 56)) + 32))));
                    }
                    while (false);
                    label$8:
                    do {
                        if ((this._loadInt(((this._loadInt((_32_ + 60))) + 32))) < 0) {
                            break label$8;
                        }
                        sqlite3VdbeAddOp1((this._loadInt((_32_ + 68))), 62, (this._loadInt(((this._loadInt((_32_ + 60))) + 32))));
                    }
                    while (false);
                    label$9:
                    do {
                        label$10:
                        do {
                            if ((this._loadInt8u(((this._loadInt((_32_ + 60))) + 53))) != 3) {
                                break label$10;
                            }
                            sqlite3VdbeAddOp2((this._loadInt((_32_ + 68))), 2, (this._loadInt(((_30_ = this._loadInt((_32_ + 60))) + 56))), (this._loadInt((_30_ + 48))));
                            break label$9;
                        }
                        while (false);
                        sqlite3VdbeAddOp2((this._loadInt((_32_ + 68))), 1, 0, (this._loadInt(((this._loadInt((_32_ + 60))) + 48))));
                    }
                    while (false);
                    sqlite3VdbeJumpHere((this._loadInt((_32_ + 68))), (this._loadInt((_32_ + 40))));
                }
                while (false);
                this._storeInt((_32_ + 64), ((this._loadInt((_32_ + 64))) + -1));
                continue label$0;
            }
        }
        while (false);
        sqlite3VdbeResolveLabel((this._loadInt((_32_ + 68))), (this._loadInt(((this._loadInt((_32_ + 76))) + 20))));
        _31_ = this._storeInt((_32_ + 64), 0);
        this._storeInt((_32_ + 60), ((this._loadInt((_32_ + 76))) + 48));
        label$11:
        while (true) {
            label$13:
            do {
                label$14:
                do {
                    if ((this._loadInt((_32_ + 64))) >= (this._loadInt(((this._loadInt((_32_ + 76))) + 24)))) {
                        break label$14;
                    }
                    this._storeInt((_32_ + 36), ((_30_ = (this._loadInt((_32_ + 56))) + ((this._loadInt8u(((this._loadInt((_32_ + 60))) + 52))) * 56)) + 8));
                    label$15:
                    do {
                        if (((this._loadInt8u(((this._storeInt((_32_ + 32), (this._loadInt((_30_ + 20))))) + 34))) & 2) != 0) {
                            break label$15;
                        }
                        if ((this._loadInt(((this._loadInt((_32_ + 32))) + 28))) != 0) {
                            break label$15;
                        }
                        if (((this._loadInt16u(((this._loadInt((_32_ + 76))) + 4))) & 32) != 0) {
                            break label$15;
                        }
                        this._storeInt((_32_ + 28), (this._loadInt((this._loadInt((_32_ + 60))))));
                        label$16:
                        do {
                            if ((this._loadInt8u(((this._loadInt((_32_ + 76))) + 6))) != 0) {
                                break label$16;
                            }
                            if (((this._loadInt8u((_32_ + 30))) >>> 7) != 0) {
                                break label$16;
                            }
                            sqlite3VdbeAddOp1((this._loadInt((_32_ + 68))), 43, (this._loadInt(((this._loadInt((_32_ + 36))) + 24))));
                        }
                        while (false);
                        if (((this._loadInt8u((_32_ + 30))) & 15) == 0) {
                            break label$15;
                        }
                        if (((this._loadInt8u((_32_ + 31))) & 32) != 0) {
                            break label$15;
                        }
                        sqlite3VdbeAddOp1((this._loadInt((_32_ + 68))), 43, (this._loadInt(((this._loadInt((_32_ + 60))) + 32))));
                    }
                    while (false);
                    if (((this._loadInt8u(((this._loadInt((_32_ + 60))) + 2))) & 15) == 0) {
                        break label$13;
                    }
                    if ((this._loadInt8u(((this._loadInt((_32_ + 52))) + 30))) != 0) {
                        break label$13;
                    }
                    this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((_32_ + 60))) + 16))));
                    this._storeInt((_32_ + 12), (sqlite3VdbeGetOp((this._loadInt((_32_ + 68))), (this._loadInt(((this._loadInt((_32_ + 76))) + 12))))));
                    this._storeInt((_32_ + 16), (sqlite3VdbeCurrentAddr((this._loadInt((_32_ + 68))))));
                    this._storeInt((_32_ + 24), (this._loadInt(((this._loadInt((_32_ + 76))) + 12))));
                    label$17:
                    while (true) {
                        if ((this._loadInt((_32_ + 24))) >= (this._loadInt((_32_ + 16)))) {
                            break label$13;
                        }
                        label$19:
                        do {
                            if ((this._loadInt(((this._loadInt((_32_ + 12))) + 4))) != (this._loadInt(((this._loadInt((_32_ + 60))) + 28)))) {
                                break label$19;
                            }
                            label$20:
                            do {
                                if ((this._loadInt8u((this._loadInt((_32_ + 12))))) != 28) {
                                    break label$20;
                                }
                                this._storeInt((_32_ + 20), _31_);
                                label$22:
                                do {
                                    label$21:
                                    while (true) {
                                        if ((this._loadInt((_32_ + 20))) >= (this._loadInt(((this._loadInt((_32_ + 8))) + 4)))) {
                                            break label$19;
                                        }
                                        if ((this._loadInt(((this._loadInt((_32_ + 12))) + 8))) == (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 8))) + 8))) + ((this._loadInt((_32_ + 20))) << 2))))) {
                                            break label$22;
                                        }
                                        this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1));
                                        continue label$21;
                                    }
                                }
                                while (false);
                                this._storeInt(((_30_ = this._loadInt((_32_ + 12))) + 8), (this._loadInt((_32_ + 20))));
                                this._storeInt((_30_ + 4), (this._loadInt(((this._loadInt((_32_ + 60))) + 32))));
                                break label$19;
                            }
                            while (false);
                            if ((this._loadInt8u((this._loadInt((_32_ + 12))))) != 61) {
                                break label$19;
                            }
                            this._storeInt(((_30_ = this._loadInt((_32_ + 12))) + 4), (this._loadInt(((this._loadInt((_32_ + 60))) + 32))));
                            this._storeInt8(_30_, 72);
                        }
                        while (false);
                        this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                        this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 20));
                        continue label$17;
                    }
                }
                while (false);
                this._storeDouble(((this._loadInt((_32_ + 72))) + 448), (this._loadDouble(((_30_ = this._loadInt((_32_ + 76))) + 32))));
                whereInfoFree((this._loadInt((_32_ + 52))), _30_);
                this._storeInt((0 + 4), (_32_ + 80));
                return;
            }
            while (false);
            this._storeInt((_32_ + 64), ((this._loadInt((_32_ + 64))) + 1));
            this._storeInt((_32_ + 60), ((this._loadInt((_32_ + 60))) + 80));
            continue label$11;
        }
    }

    @Override()
    public final void sqlite3ExprCacheClear(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        _30_ = this._storeInt((_31_ + 8), 0);
        this._storeInt((_31_ + 4), ((this._loadInt((_31_ + 12))) + 96));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 8))) > 9) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt(((this._loadInt((_31_ + 4))) + 16))) == 0) {
                        break label$2;
                    }
                    cacheEntryClear((this._loadInt((_31_ + 12))), (this._loadInt((_31_ + 4))));
                    this._storeInt(((this._loadInt((_31_ + 4))) + 16), _30_);
                }
                while (false);
                this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) + 1));
                this._storeInt((_31_ + 4), ((this._loadInt((_31_ + 4))) + 24));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void whereInfoFree(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 24), _31_)) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 20), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 20))) >= (this._loadInt(((this._loadInt((_32_ + 24))) + 24)))) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._storeInt((_32_ + 16), (this._loadInt((((this._loadInt((_32_ + 24))) + ((this._loadInt((_32_ + 20))) * 80)) + 120))))) == 0) {
                            break label$3;
                        }
                        label$4:
                        do {
                            if ((this._loadInt(((this._loadInt((_32_ + 16))) + 28))) == 0) {
                                break label$4;
                            }
                            sqlite3_free((this._loadInt(((this._loadInt((_32_ + 16))) + 24))));
                        }
                        while (false);
                        sqlite3DbFree((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 16))));
                    }
                    while (false);
                    label$5:
                    do {
                        if (((this._loadInt8u((((this._loadInt((_32_ + 24))) + ((this._loadInt((_32_ + 20))) * 80)) + 51))) & 32) == 0) {
                            break label$5;
                        }
                        if ((this._storeInt((_32_ + 12), (this._loadInt((((this._loadInt((_32_ + 24))) + ((this._loadInt((_32_ + 20))) * 80)) + 64))))) == 0) {
                            break label$5;
                        }
                        sqlite3DbFree((this._loadInt((_32_ + 28))), (this._loadInt(((this._loadInt((_32_ + 12))) + 28))));
                        sqlite3DbFree((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 12))));
                    }
                    while (false);
                    this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1));
                    continue label$1;
                }
            }
            while (false);
            whereClauseClear((this._loadInt(((this._loadInt((_32_ + 24))) + 28))));
            sqlite3DbFree((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 24))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void whereClauseClear(int _30_)
    {
        int _31_ = 0;
        this._storeInt((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))), (this._loadInt((this._loadInt((this._storeInt((_31_ + 12), _30_)))))));
        this._storeInt((_31_ + 8), ((this._loadInt(((this._loadInt((_31_ + 12))) + 20))) + -1));
        this._storeInt((_31_ + 4), (this._loadInt(((this._loadInt((_31_ + 12))) + 28))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 8))) < 0) {
                    break label$1;
                }
                label$2:
                do {
                    if (((this._loadInt8u(((this._loadInt((_31_ + 4))) + 18))) & 1) == 0) {
                        break label$2;
                    }
                    sqlite3ExprDelete((this._loadInt(_31_)), (this._loadInt((this._loadInt((_31_ + 4))))));
                }
                while (false);
                label$3:
                do {
                    label$4:
                    do {
                        if (((this._loadInt8u(((this._loadInt((_31_ + 4))) + 18))) & 16) == 0) {
                            break label$4;
                        }
                        whereOrInfoDelete((this._loadInt(_31_)), (this._loadInt(((this._loadInt((_31_ + 4))) + 12))));
                        break label$3;
                    }
                    while (false);
                    if (((this._loadInt8u(((this._loadInt((_31_ + 4))) + 18))) & 32) == 0) {
                        break label$3;
                    }
                    whereAndInfoDelete((this._loadInt(_31_)), (this._loadInt(((this._loadInt((_31_ + 4))) + 12))));
                }
                while (false);
                this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) + -1));
                this._storeInt((_31_ + 4), ((this._loadInt((_31_ + 4))) + 40));
                continue label$0;
            }
        }
        while (false);
        label$5:
        do {
            if ((this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 28))) == (_30_ + 32)) {
                break label$5;
            }
            sqlite3DbFree((this._loadInt(_31_)), (this._loadInt(((this._loadInt((_31_ + 12))) + 28))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void whereOrInfoDelete(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        whereClauseClear((this._storeInt((_32_ + 8), _31_)));
        sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))));
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void whereAndInfoDelete(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        whereClauseClear((this._storeInt((_32_ + 8), _31_)));
        sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))));
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void whereClauseInit(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt((_31_ = this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))));
        this._storeInt((_31_ + 4), _32_);
        this._storeInt(((this._loadInt((_33_ + 12))) + 20), 0);
        this._storeInt(((this._loadInt((_33_ + 12))) + 24), 8);
        this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 28), (_32_ + 32));
        this._storeLong(((this._loadInt((_33_ + 12))) + 8), 0L);
        return;
    }

    @Override()
    public final void sqlite3ExprCodeConstants(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_32_ + 28))) + 348))) != 0) {
                break label$0;
            }
            if (((this._loadInt8u(((this._loadInt((this._loadInt((_32_ + 28))))) + 12))) & 64) != 0) {
                break label$0;
            }
            this._storeInt((_32_ + 8), 43);
            this._storeInt((_32_ + 12), 0);
            this._storeInt((_32_ + 16), (this._loadInt((_32_ + 28))));
            sqlite3WalkExpr((_32_ + 8), (this._loadInt((_32_ + 24))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void whereSplit(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt8(((this._loadInt((_33_ + 12))) + 16), _32_);
        label$0:
        do {
            if ((this._loadInt((_33_ + 8))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt8u((this._loadInt((_33_ + 8))))) == (this._loadInt((_33_ + 4)))) {
                    break label$1;
                }
                whereClauseInsert((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), 0);
                break label$0;
            }
            while (false);
            whereSplit((this._loadInt((_33_ + 12))), (this._loadInt(((this._loadInt((_33_ + 8))) + 8))), (this._loadInt((_33_ + 4))));
            whereSplit((this._loadInt((_33_ + 12))), (this._loadInt(((this._loadInt((_33_ + 8))) + 12))), (this._loadInt((_33_ + 4))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int sqlite3ExprIsConstantNotJoin(int _30_)
    {
        int _31_ = 0;
        _30_ = exprIsConst((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 3);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void createMask(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ = this._loadInt((_32_ + 12))), ((_30_ = this._loadInt(_32_)) + 1));
        this._storeInt(((_32_ + (_30_ << 2)) + 4), _31_);
        return;
    }

    @Override()
    public final void exprAnalyzeAll(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 4), ((this._loadInt(((this._storeInt((_32_ + 8), _31_)) + 20))) + -1));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 4))) < 0) {
                    break label$1;
                }
                exprAnalyze((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))));
                this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + -1));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final long getMask(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 32) + 20), _30_);
        this._storeInt((_32_ + 16), _31_);
        this._storeInt((_32_ + 12), 0);
        label$0:
        do {
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 12))) >= (this._loadInt((this._loadInt((_32_ + 20)))))) {
                        break label$0;
                    }
                    if ((this._loadInt((((this._loadInt((_32_ + 20))) + ((this._loadInt((_32_ + 12))) << 2)) + 4))) == (this._loadInt((_32_ + 16)))) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 1));
                    continue label$1;
                }
            }
            while (false);
            this._storeLong((_32_ + 24), (1L << (this._loadLong32u((_32_ + 12)))));
            return (this._loadLong((_32_ + 24)));
        }
        while (false);
        this._storeLong((_32_ + 24), 0L);
        return (this._loadLong((_32_ + 24)));
    }

    @Override()
    public final void bestVirtualIndex(
            int _30_,
            int _31_,
            int _32_,
            long _33_,
            long _34_,
            int _35_,
            int _36_,
            int _37_)
    {
        int _38_ = 0;
        double _39_ = 0.0;
        double _31_0 = 0.0;
        this._storeInt(((_38_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 92), _30_);
        this._storeInt((_38_ + 88), _31_);
        this._storeInt((_38_ + 84), _32_);
        this._storeLong((_38_ + 72), _33_);
        this._storeLong((_38_ + 64), _34_);
        this._storeInt((_38_ + 60), _35_);
        this._storeInt((_38_ + 56), _36_);
        this._storeInt((_38_ + 52), _37_);
        this._storeInt((_38_ + 48), (this._loadInt(((this._loadInt((_38_ + 84))) + 12))));
        memset((this._loadInt((_38_ + 56))), 0, 40);
        this._storeInt((this._loadInt((_38_ + 56))), 134217728);
        label$0:
        do {
            if ((this._storeInt((_38_ + 44), (this._loadInt((this._loadInt((_38_ + 52))))))) != 0) {
                break label$0;
            }
            _37_ = this._storeInt((_38_ + 44), (allocateIndexInfo((this._loadInt((_38_ + 92))), (this._loadInt((_38_ + 88))), (this._loadInt((_38_ + 84))), (this._loadInt((_38_ + 60))))));
            this._storeInt((this._loadInt((_38_ + 52))), _37_);
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_38_ + 44))) == 0) {
                break label$1;
            }
            this._storeInt((_38_ + 40), (this._loadInt(((this._loadInt((_38_ + 44))) + 4))));
            this._storeInt((_38_ + 36), (this._loadInt(((this._loadInt((_38_ + 44))) + 16))));
            this._storeInt((_38_ + 28), 0);
            label$3:
            do {
                label$2:
                while (true) {
                    if ((this._loadInt((_38_ + 28))) >= (this._loadInt((this._loadInt((_38_ + 44)))))) {
                        break label$3;
                    }
                    _37_ = this._storeInt((_38_ + 24), (this._loadInt(((this._loadInt((_38_ + 40))) + 8))));
                    _37_ = this._storeInt((_38_ + 32), ((this._loadInt(((this._loadInt((_38_ + 88))) + 28))) + (_37_ * 40)));
                    this._storeInt8(((this._loadInt((_38_ + 40))) + 5), ((((this._loadLong((_37_ + 24))) & (this._loadLong((_38_ + 72)))) == 0) ? 1 : 0));
                    this._storeInt((_38_ + 28), ((this._loadInt((_38_ + 28))) + 1));
                    this._storeInt((_38_ + 40), ((this._loadInt((_38_ + 40))) + 12));
                    continue label$2;
                }
            }
            while (false);
            memset((this._loadInt((_38_ + 36))), 0, ((this._loadInt((this._loadInt((_38_ + 44))))) << 3));
            label$4:
            do {
                if ((this._loadInt(((this._loadInt((_38_ + 44))) + 28))) == 0) {
                    break label$4;
                }
                sqlite3_free((this._loadInt(((this._loadInt((_38_ + 44))) + 24))));
            }
            while (false);
            _36_ = this._storeInt(((_37_ = this._loadInt((_38_ + 44))) + 28), 0);
            this._storeLong((_37_ + 20), 0L);
            this._storeInt((_37_ + 32), _36_);
            this._storeLong((_37_ + 40), 6083591989465947950L);
            this._storeInt((_38_ + 20), (this._loadInt(((this._loadInt((_38_ + 44))) + 8))));
            label$5:
            do {
                if ((this._loadInt((_38_ + 60))) != 0) {
                    break label$5;
                }
                this._storeInt(((this._loadInt((_38_ + 44))) + 8), 0);
            }
            while (false);
            if ((vtabBestIndex((this._loadInt((_38_ + 92))), (this._loadInt((_38_ + 48))), (this._loadInt((_38_ + 44))))) != 0) {
                break label$1;
            }
            this._storeInt((_38_ + 40), (this._loadInt(((this._loadInt((_38_ + 44))) + 4))));
            this._storeInt((_38_ + 28), 0);
            label$7:
            do {
                label$6:
                while (true) {
                    if ((this._loadInt((_38_ + 28))) >= (this._loadInt((this._loadInt((_38_ + 44)))))) {
                        break label$7;
                    }
                    label$8:
                    do {
                        if ((this._loadInt(((this._loadInt((_38_ + 36))) + ((this._loadInt((_38_ + 28))) << 3)))) < 1) {
                            break label$8;
                        }
                        this._storeLong(((_37_ = this._loadInt((_38_ + 56))) + 32), ((this._loadLong((_37_ + 32))) | (this._loadLong((((this._loadInt(((this._loadInt((_38_ + 88))) + 28))) + ((this._loadInt((((this._loadInt((_38_ + 40))) + ((this._loadInt((_38_ + 28))) * 12)) + 8))) * 40)) + 24)))));
                    }
                    while (false);
                    this._storeInt((_38_ + 28), ((this._loadInt((_38_ + 28))) + 1));
                    continue label$6;
                }
            }
            while (false);
            this._storeDouble((_38_ + 8), (this._loadDouble(((this._loadInt((_38_ + 44))) + 40))));
            label$9:
            do {
                if ((this._loadInt((_38_ + 60))) == 0) {
                    break label$9;
                }
                if ((this._loadInt(((this._loadInt((_38_ + 44))) + 32))) != 0) {
                    break label$9;
                }
                _31_0 = estLog((this._loadDouble((_38_ + 8))));
                this._storeDouble((_38_ + 8), ((_39_ = this._loadDouble((_38_ + 8))) + (_31_0 * _39_)));
            }
            while (false);
            label$10:
            do {
                label$11:
                do {
                    if (((((_31_0 = this._loadDouble((_38_ + 8))) <= 5.0E98) ? 1 : 0) | ((_31_0 != _31_0) ? 1 : 0)) != 0) {
                        break label$11;
                    }
                    this._storeLong(((this._loadInt((_38_ + 56))) + 24), 6083591989465947950L);
                    break label$10;
                }
                while (false);
                this._storeDouble(((this._loadInt((_38_ + 56))) + 24), (this._loadDouble((_38_ + 8))));
            }
            while (false);
            label$12:
            do {
                if ((this._loadInt(((this._storeInt(((this._loadInt((_38_ + 56))) + 16), (this._loadInt((_38_ + 44))))) + 32))) == 0) {
                    break label$12;
                }
                this._storeInt((_37_ = this._loadInt((_38_ + 56))), ((this._loadInt(_37_)) | 16777216));
            }
            while (false);
            this._storeInt(((_37_ = this._loadInt((_38_ + 56))) + 4), 0);
            this._storeInt(((this._loadInt((_38_ + 44))) + 8), (this._loadInt((_38_ + 20))));
            bestOrClauseIndex((this._loadInt((_38_ + 92))), (this._loadInt((_38_ + 88))), (this._loadInt((_38_ + 84))), (this._loadLong((_38_ + 72))), (this._loadLong((_38_ + 64))), (this._loadInt((_38_ + 60))), _37_);
        }
        while (false);
        this._storeInt((0 + 4), (_38_ + 96));
        return;
    }

    @Override()
    public final void bestBtreeIndex(
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
        this._storeInt(((_37_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 272))) + 268), _30_);
        this._storeInt((_37_ + 264), _31_);
        this._storeInt((_37_ + 260), _32_);
        this._storeLong((_37_ + 248), _33_);
        this._storeLong((_37_ + 240), _34_);
        this._storeInt((_37_ + 236), _35_);
        this._storeInt((_37_ + 232), _36_);
        this._storeInt((_37_ + 228), (this._loadInt(((this._loadInt((_37_ + 260))) + 24))));
        this._storeInt((_37_ + 148), -1);
        memset((this._loadInt((_37_ + 232))), 0, 40);
        this._storeLong(((this._loadInt((_37_ + 232))) + 24), 6088095589093318446L);
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt8u(((this._loadInt((_37_ + 260))) + 21))) & 8) == 0) {
                    break label$1;
                }
                this._storeInt((_37_ + 212), 3);
                break label$0;
            }
            while (false);
            this._storeInt((_37_ + 212), 131);
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                if ((this._loadInt(((this._loadInt((_37_ + 260))) + 52))) == 0) {
                    break label$3;
                }
                this._storeInt((_37_ + 220), (this._storeInt((_37_ + 224), (this._loadInt(((this._loadInt((_37_ + 260))) + 52))))));
                this._storeInt((_37_ + 144), -12289);
                this._storeInt((_37_ + 216), (this._loadInt((_37_ + 212))));
                break label$2;
            }
            while (false);
            memset((_37_ + 160), 0, 52);
            this._storeInt8((_37_ + 184), 5);
            _36_ = this._storeInt((_37_ + 164), 1);
            this._storeInt((_37_ + 172), (_37_ + 152));
            this._storeInt((_37_ + 168), (_37_ + 148));
            this._storeInt((_37_ + 176), (this._loadInt(((this._loadInt((_37_ + 260))) + 12))));
            this._storeInt((_37_ + 152), (this._loadInt(((this._loadInt(((this._loadInt((_37_ + 260))) + 12))) + 24))));
            this._storeInt((_37_ + 140), (this._loadInt(((this._loadInt(((this._loadInt((_37_ + 260))) + 12))) + 16))));
            this._storeInt((_37_ + 156), _36_);
            label$4:
            do {
                if ((this._loadInt8u(((this._loadInt((_37_ + 260))) + 22))) != 0) {
                    break label$4;
                }
                this._storeInt((_37_ + 192), (this._loadInt((_37_ + 140))));
            }
            while (false);
            this._storeInt((_37_ + 224), (_37_ + 160));
            this._storeInt((_37_ + 144), -983041);
            this._storeInt((_37_ + 216), 3);
            this._storeInt((_37_ + 220), 0);
        }
        while (false);
        label$6:
        do {
            label$5:
            while (true) {
                if ((this._loadInt((_37_ + 224))) == 0) {
                    break label$6;
                }
                this._storeInt((_37_ + 136), (this._loadInt(((this._loadInt((_37_ + 224))) + 12))));
                _36_ = this._storeInt((_37_ + 104), 0);
                _34_ = this._storeLong((_37_ + 96), 0L);
                _35_ = this._storeInt((_37_ + 88), _36_);
                _36_ = this._storeInt((_37_ + 84), 1);
                this._storeInt((_37_ + 80), 100);
                _32_ = this._storeInt((_37_ + 92), (this._storeInt((_37_ + 68), (this._storeInt((_37_ + 72), (this._storeInt((_37_ + 76), _35_)))))));
                label$8:
                do {
                    label$7:
                    while (true) {
                        if ((this._loadInt((_37_ + 92))) >= (this._loadInt(((this._loadInt((_37_ + 224))) + 4)))) {
                            break label$8;
                        }
                        _35_ = this._storeInt((_37_ + 60), (this._loadInt(((this._loadInt(((this._loadInt((_37_ + 224))) + 8))) + ((this._loadInt((_37_ + 92))) << 2)))));
                        if ((this._storeInt((_37_ + 64), (findTerm((this._loadInt((_37_ + 264))), (this._loadInt((_37_ + 228))), _35_, (this._loadLong((_37_ + 248))), (this._loadInt((_37_ + 216))), (this._loadInt((_37_ + 220))))))) == 0) {
                            break label$8;
                        }
                        this._storeInt((_37_ + 104), ((this._loadInt((_37_ + 104))) | 69632));
                        label$9:
                        do {
                            label$10:
                            do {
                                label$11:
                                do {
                                    if (((this._loadInt16u(((this._loadInt((_37_ + 64))) + 16))) & _36_) == 0) {
                                        break label$11;
                                    }
                                    this._storeInt((_37_ + 56), (this._loadInt((this._loadInt((_37_ + 64))))));
                                    this._storeInt((_37_ + 104), ((this._loadInt((_37_ + 104))) | 262144));
                                    if (((this._loadInt16u(((this._loadInt((_37_ + 56))) + 2))) & 2048) == 0) {
                                        break label$10;
                                    }
                                    this._storeInt((_37_ + 84), ((this._loadInt((_37_ + 84))) * 25));
                                    this._storeInt((_37_ + 88), _36_);
                                    break label$9;
                                }
                                while (false);
                                if (((this._loadInt16u(((this._loadInt((_37_ + 64))) + 16))) & 128) == 0) {
                                    break label$9;
                                }
                                this._storeInt((_37_ + 104), ((this._loadInt((_37_ + 104))) | 524288));
                                break label$9;
                            }
                            while (false);
                            if ((this._loadInt(((this._loadInt((_37_ + 56))) + 16))) == 0) {
                                break label$9;
                            }
                            if ((this._loadInt((this._loadInt(((this._loadInt((_37_ + 56))) + 16))))) == 0) {
                                break label$9;
                            }
                            this._storeInt((_37_ + 84), ((this._loadInt((_37_ + 84))) * (this._loadInt((this._loadInt(((this._loadInt((_37_ + 56))) + 16)))))));
                        }
                        while (false);
                        this._storeLong((_37_ + 96), ((this._loadLong((_37_ + 96))) | (this._loadLong(((this._loadInt((_37_ + 64))) + 24)))));
                        this._storeInt((_37_ + 92), ((this._loadInt((_37_ + 92))) + _36_));
                        continue label$7;
                    }
                }
                while (false);
                label$12:
                do {
                    label$13:
                    do {
                        label$14:
                        do {
                            if ((this._loadInt((_37_ + 92))) >= (this._loadInt(((this._loadInt((_37_ + 224))) + 4)))) {
                                break label$14;
                            }
                            if ((this._loadInt8u(((this._loadInt((_37_ + 224))) + 26))) == 0) {
                                break label$13;
                            }
                        }
                        while (false);
                        if ((this._loadInt8u(((this._loadInt((_37_ + 224))) + 24))) == 0) {
                            break label$12;
                        }
                        if (((this._loadInt8u((_37_ + 106))) & 12) != 0) {
                            break label$12;
                        }
                        this._storeInt((_37_ + 104), ((this._loadInt((_37_ + 104))) | 67108864));
                        break label$12;
                    }
                    while (false);
                    _35_ = this._storeInt((_37_ + 52), (this._loadInt(((this._loadInt(((this._loadInt((_37_ + 224))) + 8))) + ((this._loadInt((_37_ + 92))) << 2)))));
                    if ((findTerm((this._loadInt((_37_ + 264))), (this._loadInt((_37_ + 228))), _35_, (this._loadLong((_37_ + 248))), 60, (this._loadInt((_37_ + 220))))) == 0) {
                        break label$12;
                    }
                    this._storeInt((_37_ + 48), (findTerm((this._loadInt((_37_ + 264))), (this._loadInt((_37_ + 228))), (this._loadInt((_37_ + 52))), (this._loadLong((_37_ + 248))), 24, (this._loadInt((_37_ + 220))))));
                    _35_ = this._storeInt((_37_ + 44), (findTerm((this._loadInt((_37_ + 264))), (this._loadInt((_37_ + 228))), (this._loadInt((_37_ + 52))), (this._loadLong((_37_ + 248))), 36, (this._loadInt((_37_ + 220))))));
                    whereRangeScanEst((this._loadInt((_37_ + 268))), (this._loadInt((_37_ + 224))), (this._loadInt((_37_ + 92))), _35_, (this._loadInt((_37_ + 48))), (_37_ + 80));
                    label$15:
                    do {
                        if ((this._loadInt((_37_ + 48))) == 0) {
                            break label$15;
                        }
                        this._storeInt((_37_ + 76), _36_);
                        this._storeInt((_37_ + 104), ((this._loadInt((_37_ + 104))) | 1048576));
                        this._storeLong((_37_ + 96), ((this._loadLong((_37_ + 96))) | (this._loadLong(((this._loadInt((_37_ + 48))) + 24)))));
                    }
                    while (false);
                    label$16:
                    do {
                        if ((this._loadInt((_37_ + 44))) == 0) {
                            break label$16;
                        }
                        this._storeInt((_37_ + 76), ((this._loadInt((_37_ + 76))) + _36_));
                        this._storeInt((_37_ + 104), ((this._loadInt((_37_ + 104))) | 2097152));
                        this._storeLong((_37_ + 96), ((this._loadLong((_37_ + 96))) | (this._loadLong(((this._loadInt((_37_ + 44))) + 24)))));
                    }
                    while (false);
                    this._storeInt((_37_ + 104), ((this._loadInt((_37_ + 104))) | 139264));
                }
                while (false);
                label$17:
                do {
                    if ((this._loadInt((_37_ + 236))) == 0) {
                        break label$17;
                    }
                    label$18:
                    do {
                        if (((this._loadInt8u((_37_ + 106))) & 4) != 0) {
                            break label$18;
                        }
                        if ((this._loadInt8u(((this._loadInt((_37_ + 224))) + 26))) != 0) {
                            break label$18;
                        }
                        if ((isSortingIndex((this._loadInt((_37_ + 268))), (this._loadInt(((this._loadInt((_37_ + 264))) + 4))), (this._loadInt((_37_ + 224))), (this._loadInt((_37_ + 228))), (this._loadInt((_37_ + 236))), (this._loadInt((_37_ + 92))), (this._loadInt((_37_ + 104))), (_37_ + 108))) == 0) {
                            break label$18;
                        }
                        this._storeInt((_37_ + 104), ((this._storeInt((_37_ + 104), ((this._loadInt((_37_ + 104))) | 16916480))) | ((((this._loadInt((_37_ + 108))) != _32_) ? 1 : 0) << 25)));
                        break label$17;
                    }
                    while (false);
                    this._storeInt((_37_ + 72), _36_);
                }
                while (false);
                label$19:
                do {
                    if ((this._loadInt((_37_ + 220))) == 0) {
                        break label$19;
                    }
                    if ((this._loadInt((_37_ + 104))) == 0) {
                        break label$19;
                    }
                    this._storeLong((_37_ + 32), (this._loadLong(((this._loadInt((_37_ + 260))) + 40))));
                    this._storeInt((_37_ + 28), _32_);
                    label$21:
                    do {
                        label$20:
                        while (true) {
                            if ((this._loadInt((_37_ + 28))) >= (this._loadInt(((this._loadInt((_37_ + 220))) + 4)))) {
                                break label$21;
                            }
                            label$22:
                            do {
                                if ((this._storeInt((_37_ + 24), (this._loadInt(((this._loadInt(((this._loadInt((_37_ + 220))) + 8))) + ((this._loadInt((_37_ + 28))) << 2)))))) > 62) {
                                    break label$22;
                                }
                                this._storeLong((_37_ + 32), ((this._loadLong((_37_ + 32))) & (Long.rotateLeft(-2L, ((int) (this._loadLong32u((_37_ + 24))))))));
                            }
                            while (false);
                            this._storeInt((_37_ + 28), ((this._loadInt((_37_ + 28))) + _36_));
                            continue label$20;
                        }
                    }
                    while (false);
                    label$23:
                    do {
                        if ((this._loadLong((_37_ + 32))) == _34_) {
                            break label$23;
                        }
                        this._storeInt((_37_ + 68), _36_);
                        break label$19;
                    }
                    while (false);
                    this._storeInt((_37_ + 104), ((this._loadInt((_37_ + 104))) | 8388608));
                }
                while (false);
                this._storeDouble((_37_ + 120), ((double) (((this._loadInt(((this._loadInt((_37_ + 136))) + ((this._loadInt((_37_ + 92))) << 2)))) * (this._loadInt((_37_ + 84)))) & 4294967295L)));
                label$24:
                do {
                    if ((this._loadInt((_37_ + 88))) == 0) {
                        break label$24;
                    }
                    if (((((_39_ = (_39_ = this._loadDouble((_37_ + 120))) + _39_) <= (_38_ = (double) ((this._loadInt((this._loadInt((_37_ + 136))))) & 4294967295L))) ? 1 : 0) | (((_39_ != _39_) ? 1 : 0) | ((_38_ != _38_) ? 1 : 0))) != 0) {
                        break label$24;
                    }
                    this._storeInt((_37_ + 84), (_truncateDoubleToSignedInteger(((this._storeDouble((_37_ + 120), ((double) (((this._loadInt((this._loadInt((_37_ + 136))))) >>> _36_) & 4294967295L)))) / ((double) ((this._loadInt(((this._loadInt((_37_ + 136))) + ((this._loadInt((_37_ + 92))) << 2)))) & 4294967295L))))));
                }
                while (false);
                label$25:
                do {
                    if (((((_39_ = this._storeDouble((_37_ + 120), (((this._loadDouble((_37_ + 120))) * ((double) (this._loadInt((_37_ + 80))))) / 100.0))) >= 1.0) ? 1 : 0) | ((_39_ != _39_) ? 1 : 0)) != 0) {
                        break label$25;
                    }
                    this._storeLong((_37_ + 120), 4607182418800017408L);
                }
                while (false);
                label$26:
                do {
                    label$27:
                    do {
                        label$28:
                        do {
                            label$29:
                            do {
                                if (((this._loadInt((_37_ + 104))) & 269430784) == 0) {
                                    break label$29;
                                }
                                this._storeDouble((_37_ + 112), (estLog(((double) ((this._loadInt((this._loadInt((_37_ + 136))))) & 4294967295L)))));
                                this._storeDouble((_37_ + 128), (this._loadDouble((_37_ + 120))));
                                if ((this._loadInt((_37_ + 220))) == 0) {
                                    break label$28;
                                }
                                if ((this._loadInt((_37_ + 68))) == 0) {
                                    break label$27;
                                }
                                this._storeDouble((_37_ + 128), ((this._loadDouble((_37_ + 128))) + ((((double) (this._loadInt((_37_ + 84)))) + (this._loadDouble((_37_ + 120)))) * (this._loadDouble((_37_ + 112))))));
                                break label$26;
                            }
                            while (false);
                            this._storeDouble((_37_ + 128), ((double) (((this._loadInt((this._loadInt((_37_ + 136))))) << 2) & 4294967295L)));
                            break label$26;
                        }
                        while (false);
                        this._storeDouble((_37_ + 128), ((this._loadDouble((_37_ + 128))) + (((double) (this._loadInt((_37_ + 84)))) * (this._loadDouble((_37_ + 112))))));
                        break label$26;
                    }
                    while (false);
                    this._storeDouble((_37_ + 128), ((this._loadDouble((_37_ + 128))) + (((double) (this._loadInt((_37_ + 84)))) * (this._loadDouble((_37_ + 112))))));
                }
                while (false);
                label$30:
                do {
                    if ((this._loadInt((_37_ + 72))) == 0) {
                        break label$30;
                    }
                    _38_ = estLog((_39_ = this._loadDouble((_37_ + 120))));
                    this._storeDouble((_37_ + 128), ((this._loadDouble((_37_ + 128))) + ((_39_ * _38_) * 3.0)));
                }
                while (false);
                label$31:
                do {
                    if (((((_39_ = this._loadDouble((_37_ + 120))) <= 2.0) ? 1 : 0) | ((_39_ != _39_) ? 1 : 0)) != 0) {
                        break label$31;
                    }
                    if (((((_39_ = this._loadDouble((_37_ + 128))) > (_38_ = this._loadDouble(((this._loadInt((_37_ + 232))) + 24)))) ? 1 : 0) | (((_39_ != _39_) ? 1 : 0) | ((_38_ != _38_) ? 1 : 0))) != 0) {
                        break label$31;
                    }
                    this._storeInt((_37_ + 16), (this._loadInt((_37_ + 92))));
                    this._storeInt((_37_ + 12), (this._loadInt((_37_ + 76))));
                    this._storeLong(_37_, (getMask((this._loadInt(((this._loadInt((_37_ + 264))) + 4))), (this._loadInt((_37_ + 228))))));
                    this._storeInt((_37_ + 64), (this._loadInt(((this._loadInt((_37_ + 264))) + 28))));
                    this._storeInt((_37_ + 20), (this._loadInt(((this._loadInt((_37_ + 264))) + 20))));
                    label$33:
                    do {
                        label$32:
                        while (true) {
                            _36_ = 0;
                            label$34:
                            do {
                                if (((((_39_ = this._loadDouble((_37_ + 120))) <= 2.0) ? 1 : 0) | ((_39_ != _39_) ? 1 : 0)) != 0) {
                                    break label$34;
                                }
                                _36_ = ((this._loadInt((_37_ + 20))) != _32_) ? 1 : 0;
                            }
                            while (false);
                            if (_36_ == 0) {
                                break label$33;
                            }
                            label$35:
                            do {
                                if (((this._loadInt8u(((this._loadInt((_37_ + 64))) + 18))) & 2) != 0) {
                                    break label$35;
                                }
                                if (((this._loadLong(((this._loadInt((_37_ + 64))) + 32))) & (this._loadLong((_37_ + 240)))) != (this._loadLong(_37_))) {
                                    break label$35;
                                }
                                label$36:
                                do {
                                    label$37:
                                    do {
                                        label$38:
                                        do {
                                            label$39:
                                            do {
                                                if (((this._loadInt16u(((this._loadInt((_37_ + 64))) + 16))) & 131) == 0) {
                                                    break label$39;
                                                }
                                                if ((this._loadInt((_37_ + 16))) == 0) {
                                                    break label$38;
                                                }
                                                this._storeInt((_37_ + 16), ((this._loadInt((_37_ + 16))) + -1));
                                                break label$35;
                                            }
                                            while (false);
                                            if (((this._loadInt16u(((this._loadInt((_37_ + 64))) + 16))) & 60) == 0) {
                                                break label$37;
                                            }
                                            if ((this._loadInt((_37_ + 12))) == 0) {
                                                break label$36;
                                            }
                                            this._storeInt((_37_ + 12), ((this._loadInt((_37_ + 12))) + -1));
                                            break label$35;
                                        }
                                        while (false);
                                        this._storeDouble((_37_ + 120), ((this._loadDouble((_37_ + 120))) / 10.0));
                                        break label$35;
                                    }
                                    while (false);
                                    if ((this._loadInt16u(((this._loadInt((_37_ + 64))) + 16))) == 2048) {
                                        break label$35;
                                    }
                                    this._storeDouble((_37_ + 120), ((this._loadDouble((_37_ + 120))) / 2.0));
                                    break label$35;
                                }
                                while (false);
                                this._storeDouble((_37_ + 120), ((this._loadDouble((_37_ + 120))) / 3.0));
                            }
                            while (false);
                            this._storeInt((_37_ + 20), ((this._loadInt((_37_ + 20))) + -1));
                            this._storeInt((_37_ + 64), ((this._loadInt((_37_ + 64))) + 40));
                            continue label$32;
                        }
                    }
                    while (false);
                    if (((((_39_ = this._loadDouble((_37_ + 120))) >= 2.0) ? 1 : 0) | ((_39_ != _39_) ? 1 : 0)) != 0) {
                        break label$31;
                    }
                    this._storeLong((_37_ + 120), 4611686018427387904L);
                }
                while (false);
                label$40:
                do {
                    label$41:
                    do {
                        if ((this._loadInt((_37_ + 220))) == 0) {
                            break label$41;
                        }
                        if ((this._loadInt((_37_ + 104))) == 0) {
                            break label$40;
                        }
                    }
                    while (false);
                    label$42:
                    do {
                        if ((this._loadDouble((_37_ + 128))) < (this._loadDouble(((this._loadInt((_37_ + 232))) + 24)))) {
                            break label$42;
                        }
                        if (((((_39_ = this._loadDouble((_37_ + 128))) > (_38_ = this._loadDouble(((this._loadInt((_37_ + 232))) + 24)))) ? 1 : 0) | (((_39_ != _39_) ? 1 : 0) | ((_38_ != _38_) ? 1 : 0))) != 0) {
                            break label$40;
                        }
                        if (((((_39_ = this._loadDouble((_37_ + 120))) >= (_38_ = this._loadDouble(((this._loadInt((_37_ + 232))) + 8)))) ? 1 : 0) | (((_39_ != _39_) ? 1 : 0) | ((_38_ != _38_) ? 1 : 0))) != 0) {
                            break label$40;
                        }
                    }
                    while (false);
                    this._storeLong(((_36_ = this._loadInt((_37_ + 232))) + 32), (this._loadLong((_37_ + 96))));
                    this._storeDouble((_36_ + 24), (this._loadDouble((_37_ + 128))));
                    this._storeDouble(((this._loadInt((_37_ + 232))) + 8), (this._loadDouble((_37_ + 120))));
                    this._storeInt((this._loadInt((_37_ + 232))), ((this._loadInt((_37_ + 104))) & (this._loadInt((_37_ + 144)))));
                    this._storeInt(((this._loadInt((_37_ + 232))) + 4), (this._loadInt((_37_ + 92))));
                    this._storeInt(((this._loadInt((_37_ + 232))) + 16), (this._loadInt((_37_ + 220))));
                }
                while (false);
                if ((this._loadInt(((this._loadInt((_37_ + 260))) + 52))) != 0) {
                    break label$6;
                }
                this._storeInt((_37_ + 144), -12289);
                this._storeInt((_37_ + 216), (this._loadInt((_37_ + 212))));
                this._storeInt((_37_ + 220), (this._storeInt((_37_ + 224), (this._loadInt(((this._loadInt((_37_ + 224))) + 32))))));
                continue label$5;
            }
        }
        while (false);
        label$43:
        do {
            if ((this._loadInt((_37_ + 236))) != 0) {
                break label$43;
            }
            if (((this._loadInt8u(((this._loadInt((this._loadInt((_37_ + 268))))) + 15))) & 1) == 0) {
                break label$43;
            }
            this._storeInt((_36_ = this._loadInt((_37_ + 232))), ((this._loadInt(_36_)) | 33554432));
        }
        while (false);
        bestOrClauseIndex((this._loadInt((_37_ + 268))), (this._loadInt((_37_ + 264))), (this._loadInt((_37_ + 260))), (this._loadLong((_37_ + 248))), (this._loadLong((_37_ + 240))), (this._loadInt((_37_ + 236))), (this._loadInt((_37_ + 232))));
        bestAutomaticIndex((this._loadInt((_37_ + 268))), (this._loadInt((_37_ + 264))), (this._loadInt((_37_ + 260))), (this._loadLong((_37_ + 248))), (this._loadInt((_37_ + 232))));
        this._storeInt((_36_ = this._loadInt((_37_ + 232))), ((this._loadInt(_36_)) | (this._loadInt((_37_ + 216)))));
        this._storeInt((0 + 4), (_37_ + 272));
        return;
    }

    @Override()
    public final void constructAutomaticIndex(int _30_, int _31_, int _32_, long _33_, int _34_)
    {
        long _35_ = 0L;
        int _36_ = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 160))) + 156), _30_);
        this._storeInt((_36_ + 152), _31_);
        this._storeInt((_36_ + 148), _32_);
        this._storeLong((_36_ + 136), _33_);
        this._storeInt((_36_ + 132), _34_);
        this._storeInt((_36_ + 108), (this._loadInt(((this._loadInt((_36_ + 156))) + 12))));
        _34_ = this._storeInt((_36_ + 104), (this._storeInt(((_34_ = this._loadInt((_36_ + 156))) + 72), ((this._loadInt((_34_ + 72))) + 1))));
        this._storeInt((_36_ + 100), (sqlite3VdbeAddOp1((this._loadInt((_36_ + 108))), 26, _34_)));
        sqlite3VdbeAddOp2((this._loadInt((_36_ + 108))), 7, 1, (this._loadInt((_36_ + 104))));
        this._storeInt((_36_ + 128), 0);
        this._storeInt((_36_ + 96), (this._loadInt(((this._loadInt((_36_ + 148))) + 12))));
        this._storeInt((_36_ + 120), ((this._loadInt(((_34_ = this._loadInt((_36_ + 152))) + 28))) + ((this._loadInt((_34_ + 20))) * 40)));
        _35_ = this._storeLong((_36_ + 56), 0L);
        this._storeInt((_36_ + 124), (this._loadInt(((this._loadInt((_36_ + 152))) + 28))));
        label$1:
        do {
            label$0:
            while (true) {
                if (((this._loadInt((_36_ + 124))) & 4294967295L) >= ((this._loadInt((_36_ + 120))) & 4294967295L)) {
                    break label$1;
                }
                label$2:
                do {
                    if ((termCanDriveIndex((this._loadInt((_36_ + 124))), (this._loadInt((_36_ + 148))), (this._loadLong((_36_ + 136))))) == 0) {
                        break label$2;
                    }
                    _33_ = -9223372036854775808L;
                    label$3:
                    do {
                        if ((this._storeInt((_36_ + 44), (this._loadInt(((this._loadInt((_36_ + 124))) + 12))))) > 63) {
                            break label$3;
                        }
                        _33_ = 1L << (this._loadLong32u((_36_ + 44)));
                    }
                    while (false);
                    if (((this._storeLong((_36_ + 32), _33_)) & (this._loadLong((_36_ + 56)))) != _35_) {
                        break label$2;
                    }
                    this._storeInt((_36_ + 128), ((this._loadInt((_36_ + 128))) + 1));
                    this._storeLong((_36_ + 56), ((this._loadLong((_36_ + 56))) | (this._loadLong((_36_ + 32)))));
                }
                while (false);
                this._storeInt((_36_ + 124), ((this._loadInt((_36_ + 124))) + 40));
                continue label$0;
            }
        }
        while (false);
        this._storeInt(((this._loadInt((_36_ + 132))) + 4), (this._loadInt((_36_ + 128))));
        this._storeLong((_36_ + 48), ((this._loadLong(((this._loadInt((_36_ + 148))) + 40))) & (((this._loadLong((_36_ + 56))) ^ -1L) | -9223372036854775808L)));
        _34_ = 63;
        label$4:
        do {
            if ((this._loadInt(((this._loadInt((_36_ + 96))) + 8))) > 62) {
                break label$4;
            }
            _34_ = this._loadInt(((this._loadInt((_36_ + 96))) + 8));
        }
        while (false);
        this._storeInt((_36_ + 72), _34_);
        this._storeInt((_36_ + 76), 0);
        label$6:
        do {
            label$5:
            while (true) {
                if ((this._loadInt((_36_ + 76))) >= (this._loadInt((_36_ + 72)))) {
                    break label$6;
                }
                label$7:
                do {
                    if (((this._loadLong((_36_ + 48))) & (1L << (this._loadLong32u((_36_ + 76))))) == 0) {
                        break label$7;
                    }
                    this._storeInt((_36_ + 128), ((this._loadInt((_36_ + 128))) + 1));
                }
                while (false);
                this._storeInt((_36_ + 76), ((this._loadInt((_36_ + 76))) + 1));
                continue label$5;
            }
        }
        while (false);
        label$8:
        do {
            if (((this._loadInt8u(((this._loadInt((_36_ + 148))) + 47))) & 128) == 0) {
                break label$8;
            }
            this._storeInt((_36_ + 128), (((this._loadInt((_36_ + 128))) + (this._loadInt(((this._loadInt((_36_ + 96))) + 8)))) + -63));
        }
        while (false);
        this._storeInt((_34_ = this._loadInt((_36_ + 132))), ((this._loadInt(_34_)) | 8454146));
        _34_ = this._storeInt((_36_ + 116), ((this._storeInt((_36_ + 116), ((this._storeInt((_36_ + 116), ((_32_ = this._storeInt((_36_ + 116), 52)) + ((this._loadInt((_36_ + 128))) << 2)))) + ((this._loadInt((_36_ + 128))) << 2)))) + (this._loadInt((_36_ + 128)))));
        label$9:
        do {
            if ((this._storeInt((_36_ + 112), (sqlite3DbMallocZero((this._loadInt((this._loadInt((_36_ + 156))))), _34_)))) == 0) {
                break label$9;
            }
            this._storeInt(((_34_ = this._storeInt(((this._loadInt((_36_ + 132))) + 16), (this._loadInt((_36_ + 112))))) + 44), (_34_ + _32_));
            this._storeInt((_34_ + 8), ((this._loadInt((_34_ + 44))) + ((this._loadInt((_36_ + 128))) << 2)));
            this._storeInt(((_34_ = this._loadInt((_36_ + 112))) + 40), ((this._loadInt((_34_ + 8))) + ((this._loadInt((_36_ + 128))) << 2)));
            this._storeInt((this._loadInt((_36_ + 112))), 46512);
            this._storeInt(((this._loadInt((_36_ + 112))) + 4), (this._loadInt((_36_ + 128))));
            this._storeInt(((this._loadInt((_36_ + 112))) + 16), (this._loadInt((_36_ + 96))));
            this._storeInt((_36_ + 80), 0);
            _35_ = this._storeLong((_36_ + 56), 0L);
            this._storeInt((_36_ + 124), (this._loadInt(((this._loadInt((_36_ + 152))) + 28))));
            label$11:
            do {
                label$10:
                while (true) {
                    if (((this._loadInt((_36_ + 124))) & 4294967295L) >= ((this._loadInt((_36_ + 120))) & 4294967295L)) {
                        break label$11;
                    }
                    label$12:
                    do {
                        if ((termCanDriveIndex((this._loadInt((_36_ + 124))), (this._loadInt((_36_ + 148))), (this._loadLong((_36_ + 136))))) == 0) {
                            break label$12;
                        }
                        _33_ = -9223372036854775808L;
                        label$13:
                        do {
                            if ((this._storeInt((_36_ + 28), (this._loadInt(((this._loadInt((_36_ + 124))) + 12))))) > 63) {
                                break label$13;
                            }
                            _33_ = 1L << (this._loadLong32u((_36_ + 28)));
                        }
                        while (false);
                        if (((this._storeLong((_36_ + 16), _33_)) & (this._loadLong((_36_ + 56)))) != _35_) {
                            break label$12;
                        }
                        this._storeInt((_36_ + 12), (this._loadInt((this._loadInt((_36_ + 124))))));
                        this._storeLong((_36_ + 56), ((this._loadLong((_36_ + 56))) | (this._loadLong((_36_ + 16)))));
                        this._storeInt(((this._loadInt(((this._loadInt((_36_ + 112))) + 8))) + ((this._loadInt((_36_ + 80))) << 2)), (this._loadInt(((this._loadInt((_36_ + 124))) + 12))));
                        _34_ = 31040;
                        label$14:
                        do {
                            if ((this._storeInt((_36_ + 68), (sqlite3BinaryCompareCollSeq((this._loadInt((_36_ + 156))), (this._loadInt(((_32_ = this._loadInt((_36_ + 12))) + 8))), (this._loadInt((_32_ + 12))))))) == 0) {
                                break label$14;
                            }
                            _34_ = this._loadInt((this._loadInt((_36_ + 68))));
                        }
                        while (false);
                        this._storeInt(((this._loadInt(((this._loadInt((_36_ + 112))) + 44))) + ((_32_ = this._loadInt((_36_ + 80))) << 2)), _34_);
                        this._storeInt((_36_ + 80), (_32_ + 1));
                    }
                    while (false);
                    this._storeInt((_36_ + 124), ((this._loadInt((_36_ + 124))) + 40));
                    continue label$10;
                }
            }
            while (false);
            this._storeInt((_36_ + 76), 0);
            label$16:
            do {
                label$15:
                while (true) {
                    if ((this._loadInt((_36_ + 76))) >= (this._loadInt((_36_ + 72)))) {
                        break label$16;
                    }
                    label$17:
                    do {
                        if (((this._loadLong((_36_ + 48))) & (1L << (this._loadLong32u((_36_ + 76))))) == 0) {
                            break label$17;
                        }
                        this._storeInt(((this._loadInt(((_34_ = this._loadInt((_36_ + 112))) + 8))) + (_32_ = (this._loadInt((_36_ + 80))) << 2)), (this._loadInt((_36_ + 76))));
                        this._storeInt(((this._loadInt((_34_ + 44))) + _32_), 31040);
                        this._storeInt((_36_ + 80), ((this._loadInt((_36_ + 80))) + 1));
                    }
                    while (false);
                    this._storeInt((_36_ + 76), ((this._loadInt((_36_ + 76))) + 1));
                    continue label$15;
                }
            }
            while (false);
            label$18:
            do {
                if (((this._loadInt8u(((this._loadInt((_36_ + 148))) + 47))) & 128) == 0) {
                    break label$18;
                }
                this._storeInt((_36_ + 76), 63);
                label$20:
                do {
                    label$19:
                    while (true) {
                        if ((this._loadInt((_36_ + 76))) >= (this._loadInt(((this._loadInt((_36_ + 96))) + 8)))) {
                            break label$20;
                        }
                        this._storeInt(((this._loadInt(((_34_ = this._loadInt((_36_ + 112))) + 8))) + (_32_ = (this._loadInt((_36_ + 80))) << 2)), (this._loadInt((_36_ + 76))));
                        this._storeInt(((this._loadInt((_34_ + 44))) + _32_), 31040);
                        this._storeInt((_36_ + 80), ((this._loadInt((_36_ + 80))) + 1));
                        this._storeInt((_36_ + 76), ((this._loadInt((_36_ + 76))) + 1));
                        continue label$19;
                    }
                }
                while (false);
            }
            while (false);
            _34_ = this._storeInt((_36_ + 92), (sqlite3IndexKeyinfo((this._loadInt((_36_ + 156))), (this._loadInt((_36_ + 112))))));
            sqlite3VdbeAddOp4((this._loadInt((_36_ + 108))), 40, (this._loadInt(((this._loadInt((_36_ + 132))) + 32))), ((this._loadInt((_36_ + 128))) + 1), 0, _34_, -16);
            this._storeInt((_36_ + 88), (sqlite3VdbeAddOp1((this._loadInt((_36_ + 108))), 65, (this._loadInt(((this._loadInt((_36_ + 132))) + 28))))));
            _34_ = this._storeInt((_36_ + 84), (sqlite3GetTempReg((this._loadInt((_36_ + 156))))));
            sqlite3GenerateIndexKey((this._loadInt((_36_ + 156))), (this._loadInt((_36_ + 112))), (this._loadInt(((this._loadInt((_36_ + 132))) + 28))), _34_, 1);
            sqlite3VdbeAddOp2((this._loadInt((_36_ + 108))), 70, (this._loadInt(((this._loadInt((_36_ + 132))) + 32))), (this._loadInt((_36_ + 84))));
            sqlite3VdbeChangeP5((this._loadInt((_36_ + 108))), 16);
            sqlite3VdbeAddOp2((this._loadInt((_36_ + 108))), 67, (this._loadInt(((this._loadInt((_36_ + 132))) + 28))), ((this._loadInt((_36_ + 88))) + 1));
            sqlite3VdbeChangeP5((this._loadInt((_36_ + 108))), 3);
            sqlite3VdbeJumpHere((this._loadInt((_36_ + 108))), (this._loadInt((_36_ + 88))));
            sqlite3ReleaseTempReg((this._loadInt((_36_ + 156))), (this._loadInt((_36_ + 84))));
            sqlite3VdbeJumpHere((this._loadInt((_36_ + 108))), (this._loadInt((_36_ + 100))));
        }
        while (false);
        this._storeInt((0 + 4), (_36_ + 160));
        return;
    }
}
