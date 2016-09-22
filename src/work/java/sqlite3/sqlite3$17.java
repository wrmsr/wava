package sqlite3;

abstract class sqlite3$17
        extends sqlite3$16
{
    protected sqlite3$17(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final int sqlite3CreateIndex(
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
        int _temp$6 = 0;
        int _temp$7 = 0;
        int _temp$8 = 0;
        this._storeInt(((_31_0 = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 368))) + 364), _30_);
        this._storeInt((_31_0 + 360), _31_);
        this._storeInt((_31_0 + 356), _32_);
        this._storeInt((_31_0 + 352), _33_);
        this._storeInt((_31_0 + 348), _34_);
        this._storeInt((_31_0 + 344), _35_);
        this._storeInt((_31_0 + 340), _36_);
        this._storeInt((_31_0 + 336), _37_);
        this._storeInt((_31_0 + 332), _38_);
        this._storeInt((_31_0 + 328), _39_);
        _39_ = this._storeInt((_31_0 + 312), (this._storeInt((_31_0 + 316), (this._storeInt((_31_0 + 320), (this._storeInt((_31_0 + 324), 0)))))));
        this._storeInt((_31_0 + 264), (this._loadInt((this._loadInt((_31_0 + 364))))));
        this._storeInt((_31_0 + 240), (this._storeInt((_31_0 + 252), _39_)));
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_31_0 + 264))) + 30))) != 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_31_0 + 364))) + 528))) != 0) {
                break label$0;
            }
            if ((sqlite3ReadSchema((this._loadInt((_31_0 + 364))))) != 0) {
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
                            if ((this._loadInt((_31_0 + 352))) == 0) {
                                break label$4;
                            }
                            if ((this._storeInt((_31_0 + 256), (sqlite3TwoPartName((this._loadInt((_31_0 + 364))), (this._loadInt((_31_0 + 360))), (this._loadInt((_31_0 + 356))), (_31_0 + 252))))) < 0) {
                                break label$0;
                            }
                            if ((this._loadInt8u(((this._loadInt((_31_0 + 264))) + 124))) != 0) {
                                break label$2;
                            }
                            this._storeInt((_31_0 + 320), (sqlite3SrcListLookup((this._loadInt((_31_0 + 364))), (this._loadInt((_31_0 + 352))))));
                            if ((this._loadInt(((this._loadInt((_31_0 + 356))) + 4))) == 0) {
                                break label$3;
                            }
                            break label$2;
                        }
                        while (false);
                        if ((this._storeInt((_31_0 + 320), (this._loadInt(((this._loadInt((_31_0 + 364))) + 508))))) == 0) {
                            break label$0;
                        }
                        this._storeInt((_31_0 + 256), (sqlite3SchemaToIndex((this._loadInt((_31_0 + 264))), (this._loadInt(((this._loadInt((_31_0 + 320))) + 68))))));
                        break label$1;
                    }
                    while (false);
                    if ((this._loadInt((_31_0 + 320))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt(((this._loadInt((_31_0 + 320))) + 68))) != (this._loadInt(((this._loadInt(((this._loadInt((_31_0 + 264))) + 8))) + 28)))) {
                        break label$2;
                    }
                    this._storeInt((_31_0 + 256), 1);
                }
                while (false);
                label$5:
                do {
                    if ((sqlite3FixInit((_31_0 + 272), (this._loadInt((_31_0 + 364))), (this._loadInt((_31_0 + 256))), 33520, (this._loadInt((_31_0 + 252))))) == 0) {
                        break label$5;
                    }
                    sqlite3FixSrcList((_31_0 + 272), (this._loadInt((_31_0 + 352))));
                }
                while (false);
                if ((this._storeInt((_31_0 + 320), (sqlite3LocateTable((this._loadInt((_31_0 + 364))), 0, (this._loadInt(((_39_ = this._loadInt((_31_0 + 352))) + 12))), (this._loadInt((_39_ + 8))))))) == 0) {
                    break label$0;
                }
                if ((this._loadInt8u(((this._loadInt((_31_0 + 264))) + 30))) != 0) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt((_31_0 + 260), ((this._loadInt(((this._loadInt((_31_0 + 264))) + 8))) + ((this._loadInt((_31_0 + 256))) << 4)));
            label$6:
            do {
                if ((sqlite3_strnicmp((this._loadInt((this._loadInt((_31_0 + 320))))), 38560, 7)) != 0) {
                    break label$6;
                }
                if ((memcmp(((this._loadInt((this._loadInt((_31_0 + 320))))) + 7), 48512, 9)) == 0) {
                    break label$6;
                }
                _39_ = this._loadInt((_31_0 + 364));
                this._storeInt(_31_0, (this._loadInt((this._loadInt((_31_0 + 320))))));
                sqlite3ErrorMsg(_39_, 48528, _31_0);
                break label$0;
            }
            while (false);
            label$7:
            do {
                if ((this._loadInt(((this._loadInt((_31_0 + 320))) + 28))) == 0) {
                    break label$7;
                }
                sqlite3ErrorMsg((this._loadInt((_31_0 + 364))), 48560, 0);
                break label$0;
            }
            while (false);
            label$8:
            do {
                if (((this._loadInt8u(((this._loadInt((_31_0 + 320))) + 34))) & 16) == 0) {
                    break label$8;
                }
                sqlite3ErrorMsg((this._loadInt((_31_0 + 364))), 48592, 0);
                break label$0;
            }
            while (false);
            label$9:
            do {
                label$10:
                do {
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
                                        if ((this._loadInt((_31_0 + 252))) == 0) {
                                            break label$15;
                                        }
                                        if ((this._storeInt((_31_0 + 312), (sqlite3NameFromToken((this._loadInt((_31_0 + 264))), (this._loadInt((_31_0 + 252))))))) == 0) {
                                            break label$0;
                                        }
                                        if ((sqlite3CheckObjectName((this._loadInt((_31_0 + 364))), (this._loadInt((_31_0 + 312))))) != 0) {
                                            break label$0;
                                        }
                                        if ((this._loadInt8u(((this._loadInt((_31_0 + 264))) + 124))) == 0) {
                                            break label$14;
                                        }
                                        break label$13;
                                    }
                                    while (false);
                                    this._storeInt((_31_0 + 228), (this._loadInt(((this._loadInt((_31_0 + 320))) + 16))));
                                    _39_ = this._storeInt((_31_0 + 232), 1);
                                    label$17:
                                    do {
                                        label$16:
                                        while (true) {
                                            if ((this._loadInt((_31_0 + 228))) == 0) {
                                                break label$17;
                                            }
                                            this._storeInt((_31_0 + 228), (this._loadInt(((this._loadInt((_31_0 + 228))) + 32))));
                                            this._storeInt((_31_0 + 232), ((this._loadInt((_31_0 + 232))) + _39_));
                                            continue label$16;
                                        }
                                    }
                                    while (false);
                                    _39_ = this._loadInt((this._loadInt((_31_0 + 320))));
                                    this._storeInt((_31_0 + 148), (this._loadInt((_31_0 + 232))));
                                    _38_ = this._loadInt((_31_0 + 264));
                                    this._storeInt((_31_0 + 144), _39_);
                                    if ((this._storeInt((_31_0 + 312), (sqlite3MPrintf(_38_, 48720, (_31_0 + 144))))) == 0) {
                                        break label$0;
                                    }
                                    break label$12;
                                }
                                while (false);
                                if ((sqlite3FindTable((this._loadInt((_31_0 + 264))), (this._loadInt((_31_0 + 312))), 0)) == 0) {
                                    break label$13;
                                }
                                _39_ = this._loadInt((_31_0 + 364));
                                this._storeInt((_31_0 + 128), (this._loadInt((_31_0 + 312))));
                                sqlite3ErrorMsg(_39_, 48640, (_31_0 + 128));
                                break label$0;
                            }
                            while (false);
                            if ((sqlite3FindIndex((this._loadInt((_31_0 + 264))), (this._loadInt((_31_0 + 312))), (this._loadInt((this._loadInt((_31_0 + 260))))))) == 0) {
                                break label$12;
                            }
                            if ((this._loadInt((_31_0 + 328))) == 0) {
                                break label$11;
                            }
                            sqlite3CodeVerifySchema((this._loadInt((_31_0 + 364))), (this._loadInt((_31_0 + 256))));
                            break label$0;
                        }
                        while (false);
                        _39_ = this._storeInt((_31_0 + 224), (this._loadInt((this._loadInt((_31_0 + 260))))));
                        _temp$0 = 32464;
                        _temp$1 = 32496;
                        _temp$2 = ((this._loadInt((_31_0 + 256))) == 1) ? _temp$0 : _temp$1;
                        _temp$2 = sqlite3AuthCheck((this._loadInt((_31_0 + 364))), 18, _temp$2, 0, _39_);
                        if (_temp$2 != 0) {
                            break label$0;
                        }
                        label$18:
                        do {
                            if ((this._storeInt((_31_0 + 304), 1)) != (this._loadInt((_31_0 + 256)))) {
                                break label$18;
                            }
                            this._storeInt((_31_0 + 304), 3);
                        }
                        while (false);
                        if ((sqlite3AuthCheck((this._loadInt((_31_0 + 364))), (this._loadInt((_31_0 + 304))), (this._loadInt((_31_0 + 312))), (this._loadInt((this._loadInt((_31_0 + 320))))), (this._loadInt((_31_0 + 224))))) != 0) {
                            break label$0;
                        }
                        label$19:
                        do {
                            if ((this._loadInt((_31_0 + 348))) != 0) {
                                break label$19;
                            }
                            this._storeInt((_31_0 + 292), (sqlite3Strlen30((this._storeInt((_31_0 + 288), (this._loadInt((((this._loadInt(((_39_ = this._loadInt((_31_0 + 320))) + 12))) + ((this._loadInt((_39_ + 8))) * 24)) + -24))))))));
                            if ((this._storeInt((_31_0 + 348), (sqlite3ExprListAppend((this._loadInt((_31_0 + 364))), 0, 0)))) == 0) {
                                break label$0;
                            }
                            sqlite3ExprListSetName((this._loadInt((_31_0 + 364))), (this._loadInt((_31_0 + 348))), (_31_0 + 288), 0);
                            this._storeInt8(((this._loadInt(((this._loadInt((_31_0 + 348))) + 12))) + 12), (this._loadInt((_31_0 + 332))));
                        }
                        while (false);
                        this._storeInt((_31_0 + 304), 0);
                        label$21:
                        do {
                            label$20:
                            while (true) {
                                if ((this._loadInt((_31_0 + 304))) >= (this._loadInt((this._loadInt((_31_0 + 348)))))) {
                                    break label$21;
                                }
                                label$22:
                                do {
                                    if ((this._storeInt((_31_0 + 220), (this._loadInt(((this._loadInt(((this._loadInt((_31_0 + 348))) + 12))) + ((this._loadInt((_31_0 + 304))) * 20)))))) == 0) {
                                        break label$22;
                                    }
                                    if ((this._storeInt((_31_0 + 216), (this._loadInt(((this._loadInt((_31_0 + 220))) + 20))))) == 0) {
                                        break label$22;
                                    }
                                    this._storeInt((_31_0 + 240), (((sqlite3Strlen30((this._loadInt((this._loadInt((_31_0 + 216))))))) + (this._loadInt((_31_0 + 240)))) + 1));
                                }
                                while (false);
                                this._storeInt((_31_0 + 304), ((this._loadInt((_31_0 + 304))) + 1));
                                continue label$20;
                            }
                        }
                        while (false);
                        this._storeInt((_31_0 + 308), (sqlite3Strlen30((this._loadInt((_31_0 + 312))))));
                        _39_ = this._storeInt((_31_0 + 244), (this._loadInt((this._loadInt((_31_0 + 348))))));
                        this._storeInt((_31_0 + 316), (sqlite3DbMallocZero((this._loadInt((_31_0 + 264))), ((((_39_ + (((_38_ = _39_ << 2) + _38_) + _38_)) + (this._loadInt((_31_0 + 308)))) + (this._loadInt((_31_0 + 240)))) + 57))));
                        if ((this._loadInt8u(((this._loadInt((_31_0 + 264))) + 30))) != 0) {
                            break label$0;
                        }
                        this._storeInt(((_39_ = this._loadInt((_31_0 + 316))) + 8), ((this._storeInt((_39_ + 44), (_39_ + 52))) + ((this._loadInt((_31_0 + 244))) << 2)));
                        this._storeInt(((_39_ = this._loadInt((_31_0 + 316))) + 12), ((this._loadInt((_39_ + 8))) + ((this._loadInt((_31_0 + 244))) << 2)));
                        this._storeInt(((_39_ = this._loadInt((_31_0 + 316))) + 40), (((this._loadInt((_39_ + 12))) + ((this._loadInt((_31_0 + 244))) << 2)) + 4));
                        this._storeInt((_39_ = this._loadInt((_31_0 + 316))), ((this._loadInt((_39_ + 40))) + (this._loadInt((_31_0 + 244)))));
                        this._storeInt((_31_0 + 236), (((this._loadInt((this._loadInt((_31_0 + 316))))) + (this._loadInt((_31_0 + 308)))) + 1));
                        memcpy((this._loadInt((this._loadInt((_31_0 + 316))))), (this._loadInt((_31_0 + 312))), ((this._loadInt((_31_0 + 308))) + 1));
                        this._storeInt(((_39_ = this._loadInt((_31_0 + 316))) + 16), (this._loadInt((_31_0 + 320))));
                        this._storeInt((_39_ + 4), (this._loadInt((this._loadInt((_31_0 + 348))))));
                        this._storeInt8(((this._loadInt((_31_0 + 316))) + 24), (this._loadInt((_31_0 + 344))));
                        this._storeInt8(((this._loadInt((_31_0 + 316))) + 25), (((this._loadInt((_31_0 + 252))) == 0) ? 1 : 0));
                        this._storeInt(((this._loadInt((_31_0 + 316))) + 36), (this._loadInt((((this._loadInt(((this._loadInt((_31_0 + 264))) + 8))) + ((this._loadInt((_31_0 + 256))) << 4)) + 12))));
                        if ((this._loadInt8u(((this._loadInt(((this._loadInt((_31_0 + 260))) + 12))) + 76))) < 4) {
                            break label$10;
                        }
                        this._storeInt((_31_0 + 268), -1);
                        break label$9;
                    }
                    while (false);
                    _39_ = this._loadInt((_31_0 + 364));
                    this._storeInt((_31_0 + 16), (this._loadInt((_31_0 + 312))));
                    sqlite3ErrorMsg(_39_, 48688, (_31_0 + 16));
                    break label$0;
                }
                while (false);
                this._storeInt((_31_0 + 268), 0);
            }
            while (false);
            _37_ = this._storeInt((_31_0 + 304), 0);
            this._storeInt((_31_0 + 248), (this._loadInt(((this._loadInt((_31_0 + 348))) + 12))));
            label$23:
            do {
                label$24:
                do {
                    label$26:
                    do {
                        label$25:
                        while (true) {
                            if ((this._loadInt((_31_0 + 304))) >= (this._loadInt((this._loadInt((_31_0 + 348)))))) {
                                break label$26;
                            }
                            this._storeInt((_31_0 + 212), (this._loadInt(((this._loadInt((_31_0 + 248))) + 4))));
                            this._storeInt((_31_0 + 300), _37_);
                            this._storeInt((_31_0 + 208), (this._loadInt(((this._loadInt((_31_0 + 320))) + 12))));
                            label$28:
                            do {
                                label$27:
                                while (true) {
                                    if ((this._loadInt((_31_0 + 300))) >= (this._loadInt(((this._loadInt((_31_0 + 320))) + 8)))) {
                                        break label$28;
                                    }
                                    if ((sqlite3StrICmp((this._loadInt((_31_0 + 212))), (this._loadInt((this._loadInt((_31_0 + 208))))))) == 0) {
                                        break label$28;
                                    }
                                    this._storeInt((_31_0 + 300), ((this._loadInt((_31_0 + 300))) + 1));
                                    this._storeInt((_31_0 + 208), ((this._loadInt((_31_0 + 208))) + 24));
                                    continue label$27;
                                }
                            }
                            while (false);
                            if ((this._loadInt((_31_0 + 300))) >= (this._loadInt(((this._loadInt((_31_0 + 320))) + 8)))) {
                                break label$24;
                            }
                            this._storeInt(((this._loadInt(((this._loadInt((_31_0 + 316))) + 8))) + ((this._loadInt((_31_0 + 304))) << 2)), (this._loadInt((_31_0 + 300))));
                            label$29:
                            do {
                                label$30:
                                do {
                                    if ((this._loadInt((this._loadInt((_31_0 + 248))))) == 0) {
                                        break label$30;
                                    }
                                    if ((this._loadInt(((this._loadInt((this._loadInt((_31_0 + 248))))) + 20))) == 0) {
                                        break label$30;
                                    }
                                    _39_ = this._storeInt((_31_0 + 196), ((sqlite3Strlen30((this._storeInt((_31_0 + 200), (this._loadInt((this._loadInt(((this._loadInt((this._loadInt((_31_0 + 248))))) + 20))))))))) + 1));
                                    memcpy((this._loadInt((_31_0 + 236))), (this._loadInt((_31_0 + 200))), _39_);
                                    this._storeInt((_31_0 + 200), (this._loadInt((_31_0 + 236))));
                                    this._storeInt((_31_0 + 236), ((this._loadInt((_31_0 + 236))) + (this._loadInt((_31_0 + 196)))));
                                    this._storeInt((_31_0 + 240), ((this._loadInt((_31_0 + 240))) - (this._loadInt((_31_0 + 196)))));
                                    break label$29;
                                }
                                while (false);
                                if ((this._storeInt((_31_0 + 200), (this._loadInt((((this._loadInt(((this._loadInt((_31_0 + 320))) + 12))) + ((this._loadInt((_31_0 + 300))) * 24)) + 16))))) != 0) {
                                    break label$29;
                                }
                                this._storeInt((_31_0 + 200), (this._loadInt((this._loadInt(((this._loadInt((_31_0 + 264))) + 44))))));
                            }
                            while (false);
                            label$31:
                            do {
                                if ((this._loadInt8u(((this._loadInt((_31_0 + 264))) + 124))) != 0) {
                                    break label$31;
                                }
                                if ((sqlite3LocateCollSeq((this._loadInt((_31_0 + 364))), (this._loadInt((_31_0 + 200))))) == 0) {
                                    break label$0;
                                }
                            }
                            while (false);
                            this._storeInt(((this._loadInt(((this._loadInt((_31_0 + 316))) + 44))) + ((this._loadInt((_31_0 + 304))) << 2)), (this._loadInt((_31_0 + 200))));
                            _39_ = this._storeInt((_31_0 + 204), ((this._loadInt8u(((this._loadInt((_31_0 + 248))) + 12))) & (this._loadInt((_31_0 + 268)))));
                            this._storeInt8(((this._loadInt(((this._loadInt((_31_0 + 316))) + 40))) + (_38_ = this._loadInt((_31_0 + 304)))), _39_);
                            this._storeInt((_31_0 + 304), (_38_ + 1));
                            this._storeInt((_31_0 + 248), ((this._loadInt((_31_0 + 248))) + 20));
                            continue label$25;
                        }
                    }
                    while (false);
                    sqlite3DefaultRowEst((this._loadInt((_31_0 + 316))));
                    if ((this._loadInt((_31_0 + 320))) != (this._loadInt(((this._loadInt((_31_0 + 364))) + 508)))) {
                        break label$23;
                    }
                    this._storeInt((_31_0 + 192), (this._loadInt(((this._loadInt((_31_0 + 320))) + 16))));
                    label$33:
                    do {
                        label$32:
                        while (true) {
                            if ((this._loadInt((_31_0 + 192))) == 0) {
                                break label$23;
                            }
                            label$34:
                            do {
                                if ((this._loadInt(((this._loadInt((_31_0 + 192))) + 4))) != (this._loadInt(((this._loadInt((_31_0 + 316))) + 4)))) {
                                    break label$34;
                                }
                                this._storeInt((_31_0 + 188), 0);
                                label$36:
                                do {
                                    label$35:
                                    while (true) {
                                        if ((this._loadInt((_31_0 + 188))) >= (this._loadInt(((this._loadInt((_31_0 + 192))) + 4)))) {
                                            break label$36;
                                        }
                                        if ((this._loadInt(((this._loadInt(((this._loadInt((_31_0 + 192))) + 8))) + (_39_ = (this._loadInt((_31_0 + 188))) << 2)))) != (this._loadInt(((this._loadInt(((this._loadInt((_31_0 + 316))) + 8))) + _39_)))) {
                                            break label$36;
                                        }
                                        this._storeInt((_31_0 + 184), (this._loadInt(((this._loadInt(((this._loadInt((_31_0 + 192))) + 44))) + ((this._loadInt((_31_0 + 188))) << 2)))));
                                        label$37:
                                        do {
                                            if ((this._storeInt((_31_0 + 180), (this._loadInt(((this._loadInt(((this._loadInt((_31_0 + 316))) + 44))) + ((this._loadInt((_31_0 + 188))) << 2)))))) == (this._loadInt((_31_0 + 184)))) {
                                                break label$37;
                                            }
                                            if ((sqlite3StrICmp((this._loadInt((_31_0 + 184))), (this._loadInt((_31_0 + 180))))) != 0) {
                                                break label$36;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_31_0 + 188), ((this._loadInt((_31_0 + 188))) + 1));
                                        continue label$35;
                                    }
                                }
                                while (false);
                                if ((this._loadInt((_31_0 + 188))) == (this._loadInt(((this._loadInt((_31_0 + 192))) + 4)))) {
                                    break label$33;
                                }
                            }
                            while (false);
                            this._storeInt((_31_0 + 192), (this._loadInt(((this._loadInt((_31_0 + 192))) + 32))));
                            continue label$32;
                        }
                    }
                    while (false);
                    if ((this._loadInt8u(((this._loadInt((_31_0 + 192))) + 24))) == (this._loadInt8u(((this._loadInt((_31_0 + 316))) + 24)))) {
                        break label$0;
                    }
                    label$38:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_31_0 + 192))) + 24))) == 99) {
                            break label$38;
                        }
                        if ((this._loadInt8u(((this._loadInt((_31_0 + 316))) + 24))) == 99) {
                            break label$38;
                        }
                        _39_ = this._loadInt((_31_0 + 364));
                        this._storeInt((_31_0 + 48), 0);
                        sqlite3ErrorMsg(_39_, 48784, (_31_0 + 48));
                    }
                    while (false);
                    if ((this._loadInt8u(((this._loadInt((_31_0 + 192))) + 24))) != 99) {
                        break label$0;
                    }
                    this._storeInt8(((this._loadInt((_31_0 + 192))) + 24), (this._loadInt8u(((this._loadInt((_31_0 + 316))) + 24))));
                    break label$0;
                }
                while (false);
                _39_ = this._loadInt((this._loadInt((_31_0 + 320))));
                this._storeInt((_31_0 + 36), (this._loadInt((_31_0 + 212))));
                _38_ = this._loadInt((_31_0 + 364));
                this._storeInt((_31_0 + 32), _39_);
                sqlite3ErrorMsg(_38_, 48752, (_31_0 + 32));
                this._storeInt8(((this._loadInt((_31_0 + 364))) + 18), 1);
                break label$0;
            }
            while (false);
            label$39:
            do {
                label$40:
                do {
                    label$41:
                    do {
                        label$42:
                        do {
                            label$43:
                            do {
                                if ((this._loadInt8u(((this._loadInt((_31_0 + 264))) + 124))) == 0) {
                                    break label$43;
                                }
                                if ((this._storeInt((_31_0 + 176), (sqlite3HashInsert(((this._loadInt(((_39_ = this._loadInt((_31_0 + 316))) + 36))) + 24), (_39_ = this._loadInt(_39_)), (sqlite3Strlen30(_39_)), (this._loadInt((_31_0 + 316))))))) == 0) {
                                    break label$42;
                                }
                                this._storeInt8(((this._loadInt((_31_0 + 264))) + 30), 1);
                                break label$0;
                            }
                            while (false);
                            this._storeInt((_31_0 + 164), (this._storeInt(((_39_ = this._loadInt((_31_0 + 364))) + 72), ((this._loadInt((_39_ + 72))) + 1))));
                            if ((this._storeInt((_31_0 + 172), (sqlite3GetVdbe((this._loadInt((_31_0 + 364))))))) == 0) {
                                break label$0;
                            }
                            sqlite3BeginWriteOperation((this._loadInt((_31_0 + 364))), 1, (this._loadInt((_31_0 + 256))));
                            sqlite3VdbeAddOp2((this._loadInt((_31_0 + 172))), 97, (this._loadInt((_31_0 + 256))), (this._loadInt((_31_0 + 164))));
                            if ((this._loadInt((_31_0 + 340))) == 0) {
                                break label$41;
                            }
                            _39_ = this._loadInt((this._loadInt((_31_0 + 336))));
                            _38_ = this._storeInt((_31_0 + 120), (this._loadInt((this._loadInt((_31_0 + 252))))));
                            _37_ = this._loadInt((_31_0 + 264));
                            _temp$3 = 48832;
                            _temp$4 = 21392;
                            _temp$5 = ((this._loadInt((_31_0 + 344))) != 0) ? _temp$3 : _temp$4;
                            this._storeInt((_31_0 + 112), _temp$5);
                            this._storeInt((_31_0 + 116), ((_39_ - _38_) + 1));
                            this._storeInt((_31_0 + 168), (sqlite3MPrintf(_37_, 48848, (_31_0 + 112))));
                            break label$40;
                        }
                        while (false);
                        this._storeInt(((_39_ = this._loadInt((_31_0 + 264))) + 12), ((this._loadInt((_39_ + 12))) | 512));
                        if ((this._loadInt((_31_0 + 352))) == 0) {
                            break label$39;
                        }
                        this._storeInt(((this._loadInt((_31_0 + 316))) + 20), (this._loadInt(((this._loadInt((_31_0 + 264))) + 120))));
                        break label$39;
                    }
                    while (false);
                    this._storeInt((_31_0 + 168), 0);
                }
                while (false);
                _38_ = this._loadInt(((this._loadInt(((this._loadInt((_31_0 + 264))) + 8))) + ((_39_ = this._loadInt((_31_0 + 256))) << 4)));
                _37_ = this._loadInt((this._loadInt((_31_0 + 316))));
                _36_ = this._loadInt((this._loadInt((_31_0 + 320))));
                _35_ = this._loadInt((_31_0 + 364));
                _34_ = this._loadInt((_31_0 + 164));
                this._storeInt((_31_0 + 100), (this._loadInt((_31_0 + 168))));
                this._storeInt((_31_0 + 96), _34_);
                this._storeInt((_31_0 + 92), _36_);
                this._storeInt((_31_0 + 88), _37_);
                _temp$6 = 32464;
                _temp$7 = 32496;
                _temp$8 = (_39_ == 1) ? _temp$6 : _temp$7;
                this._storeInt((_31_0 + 84), _temp$8);
                this._storeInt((_31_0 + 80), _38_);
                sqlite3NestedParse(_35_, 48880, (_31_0 + 80));
                sqlite3DbFree((this._loadInt((_31_0 + 264))), (this._loadInt((_31_0 + 168))));
                if ((this._loadInt((_31_0 + 352))) == 0) {
                    break label$39;
                }
                sqlite3RefillIndex((this._loadInt((_31_0 + 364))), (this._loadInt((_31_0 + 316))), (this._loadInt((_31_0 + 164))));
                sqlite3ChangeCookie((this._loadInt((_31_0 + 364))), (this._loadInt((_31_0 + 256))));
                _39_ = this._loadInt((_31_0 + 256));
                _38_ = this._loadInt((_31_0 + 172));
                _37_ = this._loadInt((_31_0 + 264));
                this._storeInt((_31_0 + 64), (this._loadInt((this._loadInt((_31_0 + 316))))));
                sqlite3VdbeAddParseSchemaOp(_38_, _39_, (sqlite3MPrintf(_37_, 48928, (_31_0 + 64))));
                sqlite3VdbeAddOp1((this._loadInt((_31_0 + 172))), 122, 0);
            }
            while (false);
            label$44:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_0 + 264))) + 124))) != 0) {
                    break label$44;
                }
                if ((this._loadInt((_31_0 + 352))) != 0) {
                    break label$0;
                }
            }
            while (false);
            label$45:
            do {
                label$46:
                do {
                    label$47:
                    do {
                        if ((this._loadInt((_31_0 + 344))) != 5) {
                            break label$47;
                        }
                        if ((this._loadInt(((this._loadInt((_31_0 + 320))) + 16))) == 0) {
                            break label$47;
                        }
                        if ((this._loadInt8u(((this._loadInt(((this._loadInt((_31_0 + 320))) + 16))) + 24))) != 5) {
                            break label$46;
                        }
                    }
                    while (false);
                    this._storeInt(((_39_ = this._loadInt((_31_0 + 316))) + 32), (this._loadInt(((_38_ = this._loadInt((_31_0 + 320))) + 16))));
                    this._storeInt((_38_ + 16), _39_);
                    break label$45;
                }
                while (false);
                this._storeInt((_31_0 + 160), (this._loadInt(((this._loadInt((_31_0 + 320))) + 16))));
                label$49:
                do {
                    label$48:
                    while (true) {
                        _39_ = 0;
                        label$50:
                        do {
                            if ((this._loadInt(((this._loadInt((_31_0 + 160))) + 32))) == 0) {
                                break label$50;
                            }
                            _39_ = ((this._loadInt8u(((this._loadInt(((this._loadInt((_31_0 + 160))) + 32))) + 24))) != 5) ? 1 : 0;
                        }
                        while (false);
                        if (_39_ == 0) {
                            break label$49;
                        }
                        this._storeInt((_31_0 + 160), (this._loadInt(((this._loadInt((_31_0 + 160))) + 32))));
                        continue label$48;
                    }
                }
                while (false);
                this._storeInt(((_39_ = this._loadInt((_31_0 + 316))) + 32), (this._loadInt(((_38_ = this._loadInt((_31_0 + 160))) + 32))));
                this._storeInt((_38_ + 32), _39_);
            }
            while (false);
            this._storeInt((_31_0 + 324), (this._loadInt((_31_0 + 316))));
            this._storeInt((_31_0 + 316), 0);
        }
        while (false);
        label$51:
        do {
            if ((this._loadInt((_31_0 + 316))) == 0) {
                break label$51;
            }
            sqlite3DbFree((this._loadInt((_31_0 + 264))), (this._loadInt(((this._loadInt((_31_0 + 316))) + 28))));
            sqlite3DbFree((this._loadInt((_31_0 + 264))), (this._loadInt((_31_0 + 316))));
        }
        while (false);
        sqlite3ExprListDelete((this._loadInt((_31_0 + 264))), (this._loadInt((_31_0 + 348))));
        sqlite3SrcListDelete((this._loadInt((_31_0 + 264))), (this._loadInt((_31_0 + 352))));
        sqlite3DbFree((this._loadInt((_31_0 + 264))), (this._loadInt((_31_0 + 312))));
        _39_ = this._loadInt((_31_0 + 324));
        this._storeInt((0 + 4), (_31_0 + 368));
        return _39_;
    }

    @Override()
    public final void sqlite3AddCheckConstraint(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), (this._loadInt((this._loadInt((_32_ + 12))))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._storeInt(_32_, (this._loadInt(((this._loadInt((_32_ + 12))) + 508))))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 528))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                sqlite3ExprDelete((this._loadInt((_32_ + 4))), (this._loadInt((_32_ + 8))));
                break label$0;
            }
            while (false);
            _31_ = sqlite3ExprAnd((this._loadInt((_32_ + 4))), (this._loadInt(((this._loadInt(_32_)) + 44))), (this._loadInt((_32_ + 8))));
            this._storeInt(((this._loadInt(_32_)) + 44), _31_);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3CreateForeignKey(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 92), _30_);
        this._storeInt((_35_ + 88), _31_);
        this._storeInt((_35_ + 84), _32_);
        this._storeInt((_35_ + 80), _33_);
        this._storeInt((_35_ + 76), _34_);
        this._storeInt((_35_ + 72), (this._loadInt((this._loadInt((_35_ + 92))))));
        this._storeInt((_35_ + 68), 0);
        label$0:
        do {
            if ((this._storeInt((_35_ + 60), (this._loadInt(((this._loadInt((_35_ + 92))) + 508))))) == 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_35_ + 92))) + 528))) != 0) {
                break label$0;
            }
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_35_ + 88))) == 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._loadInt((_35_ + 80))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt((this._loadInt((_35_ + 80))))) == (this._loadInt((this._loadInt((_35_ + 88)))))) {
                            break label$3;
                        }
                        sqlite3ErrorMsg((this._loadInt((_35_ + 92))), 48368, 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_35_ + 48), (this._loadInt((this._loadInt((_35_ + 88))))));
                    break label$1;
                }
                while (false);
                if ((this._storeInt((_35_ + 40), ((this._loadInt(((this._loadInt((_35_ + 60))) + 8))) + -1))) < 0) {
                    break label$0;
                }
                label$4:
                do {
                    if ((this._loadInt((_35_ + 80))) == 0) {
                        break label$4;
                    }
                    if ((this._loadInt((this._loadInt((_35_ + 80))))) == 1) {
                        break label$4;
                    }
                    _34_ = this._loadInt(((this._loadInt(((this._loadInt((_35_ + 60))) + 12))) + ((this._loadInt((_35_ + 40))) * 24)));
                    this._storeInt((_35_ + 4), (this._loadInt((_35_ + 84))));
                    _33_ = this._loadInt((_35_ + 92));
                    this._storeInt(_35_, _34_);
                    sqlite3ErrorMsg(_33_, 48304, _35_);
                    break label$0;
                }
                while (false);
                this._storeInt((_35_ + 48), 1);
            }
            while (false);
            this._storeInt((_35_ + 56), ((((this._loadInt((_35_ + 48))) << 3) + (this._loadInt(((this._loadInt((_35_ + 84))) + 4)))) + 37));
            label$5:
            do {
                if ((this._loadInt((_35_ + 80))) == 0) {
                    break label$5;
                }
                this._storeInt((_35_ + 52), 0);
                label$7:
                do {
                    label$6:
                    while (true) {
                        if ((this._loadInt((_35_ + 52))) >= (this._loadInt((this._loadInt((_35_ + 80)))))) {
                            break label$7;
                        }
                        this._storeInt((_35_ + 56), (((sqlite3Strlen30((this._loadInt((((this._loadInt(((this._loadInt((_35_ + 80))) + 12))) + ((this._loadInt((_35_ + 52))) * 20)) + 4))))) + (this._loadInt((_35_ + 56)))) + 1));
                        this._storeInt((_35_ + 52), ((this._loadInt((_35_ + 52))) + 1));
                        continue label$6;
                    }
                }
                while (false);
            }
            while (false);
            if ((this._storeInt((_35_ + 68), (sqlite3DbMallocZero((this._loadInt((_35_ + 72))), (this._loadInt((_35_ + 56))))))) == 0) {
                break label$0;
            }
            _34_ = this._storeInt((this._loadInt((_35_ + 68))), (this._loadInt((_35_ + 60))));
            this._storeInt(((this._loadInt((_35_ + 68))) + 4), (this._loadInt((_34_ + 36))));
            _34_ = this._storeInt((_35_ + 44), (((this._loadInt((_35_ + 68))) + ((this._loadInt((_35_ + 48))) << 3)) + 36));
            memcpy((this._storeInt(((this._loadInt((_35_ + 68))) + 8), _34_)), (this._loadInt((_34_ = this._loadInt((_35_ + 84))))), (this._loadInt((_34_ + 4))));
            _33_ = this._storeInt8(((_34_ = this._loadInt((_35_ + 44))) + (this._loadInt(((this._loadInt((_35_ + 84))) + 4)))), 0);
            sqlite3Dequote(_34_);
            this._storeInt((_35_ + 44), (((this._loadInt((_35_ + 44))) + (this._loadInt(((this._loadInt((_35_ + 84))) + 4)))) + 1));
            this._storeInt(((this._loadInt((_35_ + 68))) + 20), (this._loadInt((_35_ + 48))));
            label$8:
            do {
                label$9:
                do {
                    if ((this._loadInt((_35_ + 88))) == 0) {
                        break label$9;
                    }
                    _34_ = this._storeInt((_35_ + 52), _33_);
                    label$11:
                    do {
                        label$10:
                        while (true) {
                            if ((this._loadInt((_35_ + 52))) >= (this._loadInt((_35_ + 48)))) {
                                break label$8;
                            }
                            this._storeInt((_35_ + 36), _34_);
                            label$12:
                            do {
                                label$14:
                                do {
                                    label$13:
                                    while (true) {
                                        if ((this._loadInt((_35_ + 36))) >= (this._loadInt(((this._loadInt((_35_ + 60))) + 8)))) {
                                            break label$12;
                                        }
                                        if ((sqlite3StrICmp((this._loadInt(((this._loadInt(((this._loadInt((_35_ + 60))) + 12))) + ((this._loadInt((_35_ + 36))) * 24)))), (this._loadInt((((this._loadInt(((this._loadInt((_35_ + 88))) + 12))) + ((this._loadInt((_35_ + 52))) * 20)) + 4))))) == 0) {
                                            break label$14;
                                        }
                                        this._storeInt((_35_ + 36), ((this._loadInt((_35_ + 36))) + 1));
                                        continue label$13;
                                    }
                                }
                                while (false);
                                this._storeInt((((this._loadInt((_35_ + 68))) + ((this._loadInt((_35_ + 52))) << 3)) + 36), (this._loadInt((_35_ + 36))));
                            }
                            while (false);
                            if ((this._loadInt((_35_ + 36))) >= (this._loadInt(((this._loadInt((_35_ + 60))) + 8)))) {
                                break label$11;
                            }
                            this._storeInt((_35_ + 52), ((this._loadInt((_35_ + 52))) + 1));
                            continue label$10;
                        }
                    }
                    while (false);
                    _34_ = this._loadInt((_35_ + 92));
                    this._storeInt((_35_ + 16), (this._loadInt((((this._loadInt(((this._loadInt((_35_ + 88))) + 12))) + ((this._loadInt((_35_ + 52))) * 20)) + 4))));
                    sqlite3ErrorMsg(_34_, 48464, (_35_ + 16));
                    break label$0;
                }
                while (false);
                this._storeInt(((this._loadInt((_35_ + 68))) + 36), ((this._loadInt(((this._loadInt((_35_ + 60))) + 8))) + -1));
            }
            while (false);
            label$15:
            do {
                if ((this._loadInt((_35_ + 80))) == 0) {
                    break label$15;
                }
                _32_ = this._storeInt((_35_ + 52), 0);
                label$17:
                do {
                    label$16:
                    while (true) {
                        if ((this._loadInt((_35_ + 52))) >= (this._loadInt((_35_ + 48)))) {
                            break label$17;
                        }
                        _34_ = this._storeInt((_35_ + 32), (sqlite3Strlen30((this._loadInt((((this._loadInt(((this._loadInt((_35_ + 80))) + 12))) + ((this._loadInt((_35_ + 52))) * 20)) + 4))))));
                        memcpy((this._storeInt((((this._loadInt((_35_ + 68))) + ((_33_ = this._loadInt((_35_ + 52))) << 3)) + 40), (this._loadInt((_35_ + 44))))), (this._loadInt((((this._loadInt(((this._loadInt((_35_ + 80))) + 12))) + (_33_ * 20)) + 4))), _34_);
                        this._storeInt8((_34_ = (this._loadInt((_35_ + 44))) + (this._loadInt((_35_ + 32)))), _32_);
                        this._storeInt((_35_ + 44), (_34_ + 1));
                        this._storeInt((_35_ + 52), ((this._loadInt((_35_ + 52))) + 1));
                        continue label$16;
                    }
                }
                while (false);
            }
            while (false);
            this._storeInt8(((_34_ = this._loadInt((_35_ + 68))) + 25), (this._loadInt((_35_ + 76))));
            this._storeInt8((_34_ + 24), 0);
            this._storeInt8(((this._loadInt((_35_ + 68))) + 26), ((this._loadInt((_35_ + 76))) >>> 8));
            label$18:
            do {
                if ((this._storeInt((_35_ + 64), (sqlite3HashInsert(((this._loadInt(((this._loadInt((_35_ + 60))) + 68))) + 56), (_34_ = this._loadInt(((this._loadInt((_35_ + 68))) + 8))), (sqlite3Strlen30(_34_)), (this._loadInt((_35_ + 68))))))) == (this._loadInt((_35_ + 68)))) {
                    break label$18;
                }
                label$19:
                do {
                    if ((this._loadInt((_35_ + 64))) == 0) {
                        break label$19;
                    }
                    this._storeInt(((this._storeInt(((_34_ = this._loadInt((_35_ + 68))) + 12), (this._loadInt((_35_ + 64))))) + 16), _34_);
                }
                while (false);
                this._storeInt(((this._loadInt((_35_ + 60))) + 36), (this._loadInt((_35_ + 68))));
                this._storeInt((_35_ + 68), 0);
                break label$0;
            }
            while (false);
            this._storeInt8(((this._loadInt((_35_ + 72))) + 30), 1);
        }
        while (false);
        sqlite3DbFree((this._loadInt((_35_ + 72))), (this._loadInt((_35_ + 68))));
        sqlite3ExprListDelete((this._loadInt((_35_ + 72))), (this._loadInt((_35_ + 88))));
        sqlite3ExprListDelete((this._loadInt((_35_ + 72))), (this._loadInt((_35_ + 80))));
        this._storeInt((0 + 4), (_35_ + 96));
        return;
    }

    @Override()
    public final void sqlite3DeferForeignKey(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 12))) + 508))))) == 0) {
                break label$0;
            }
            if ((this._storeInt(_32_, (this._loadInt(((this._loadInt((_32_ + 4))) + 36))))) == 0) {
                break label$0;
            }
            this._storeInt8(((this._loadInt(_32_)) + 24), (this._loadInt((_32_ + 8))));
        }
        while (false);
        return;
    }

    @Override()
    public final void sqlite3AddCollateType(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 28))) + 508))))) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 16), ((this._loadInt(((this._loadInt((_32_ + 20))) + 8))) + -1));
            if ((this._storeInt((_32_ + 12), (sqlite3NameFromToken((this._storeInt((_32_ + 8), (this._loadInt((this._loadInt((_32_ + 28))))))), (this._loadInt((_32_ + 24))))))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((sqlite3LocateCollSeq((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 12))))) == 0) {
                    break label$1;
                }
                this._storeInt((((this._loadInt(((_31_ = this._loadInt((_32_ + 20))) + 12))) + ((this._loadInt((_32_ + 16))) * 24)) + 16), (this._loadInt((_32_ + 12))));
                this._storeInt((_32_ + 4), (this._loadInt((_31_ + 16))));
                label$2:
                while (true) {
                    if ((this._loadInt((_32_ + 4))) == 0) {
                        break label$0;
                    }
                    label$4:
                    do {
                        if ((this._loadInt((this._loadInt(((this._loadInt((_32_ + 4))) + 8))))) != (this._loadInt((_32_ + 16)))) {
                            break label$4;
                        }
                        this._storeInt((this._loadInt(((this._loadInt((_32_ + 4))) + 44))), (this._loadInt((((this._loadInt(((this._loadInt((_32_ + 20))) + 12))) + ((this._loadInt((_32_ + 16))) * 24)) + 16))));
                    }
                    while (false);
                    this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 4))) + 32))));
                    continue label$2;
                }
            }
            while (false);
            sqlite3DbFree((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void sqlite3DropTable(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        int _temp$3 = 0;
        int _temp$4 = 0;
        int _temp$5 = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 144))) + 140), _30_);
        this._storeInt((_34_ + 136), _31_);
        this._storeInt((_34_ + 132), _32_);
        this._storeInt((_34_ + 128), _33_);
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt((_34_ + 116), (this._loadInt((this._loadInt((_34_ + 140))))))) + 30))) != 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt((_34_ + 128))) == 0) {
                    break label$1;
                }
                this._storeInt8(((_33_ = this._loadInt((_34_ + 116))) + 33), ((this._loadInt8u((_33_ + 33))) + 1));
            }
            while (false);
            this._storeInt((_34_ + 124), (sqlite3LocateTable((this._loadInt((_34_ + 140))), (this._loadInt((_34_ + 132))), (this._loadInt(((_33_ = this._loadInt((_34_ + 136))) + 12))), (this._loadInt((_33_ + 8))))));
            label$2:
            do {
                if ((this._loadInt((_34_ + 128))) == 0) {
                    break label$2;
                }
                this._storeInt8(((_33_ = this._loadInt((_34_ + 116))) + 33), ((this._loadInt8u((_33_ + 33))) + -1));
            }
            while (false);
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
                                if ((this._loadInt((_34_ + 124))) == 0) {
                                    break label$7;
                                }
                                this._storeInt((_34_ + 112), (sqlite3SchemaToIndex((this._loadInt((_34_ + 116))), (this._loadInt(((this._loadInt((_34_ + 124))) + 68))))));
                                label$8:
                                do {
                                    if (((this._loadInt8u(((this._loadInt((_34_ + 124))) + 34))) & 16) == 0) {
                                        break label$8;
                                    }
                                    if ((sqlite3ViewGetColumnNames((this._loadInt((_34_ + 140))), (this._loadInt((_34_ + 124))))) != 0) {
                                        break label$0;
                                    }
                                }
                                while (false);
                                _temp$0 = 32464;
                                _temp$1 = 32496;
                                _temp$2 = ((this._loadInt((_34_ + 112))) == 1) ? _temp$0 : _temp$1;
                                this._storeInt((_34_ + 104), _temp$2);
                                this._storeInt((_34_ + 100), (this._loadInt(((this._loadInt(((this._loadInt((_34_ + 116))) + 8))) + ((this._loadInt((_34_ + 112))) << 4)))));
                                _33_ = this._storeInt((_34_ + 96), 0);
                                if ((sqlite3AuthCheck((this._loadInt((_34_ + 140))), 9, (this._loadInt((_34_ + 104))), _33_, (this._loadInt((_34_ + 100))))) != 0) {
                                    break label$0;
                                }
                                if ((this._loadInt((_34_ + 132))) == 0) {
                                    break label$6;
                                }
                                if ((this._loadInt((_34_ + 112))) != 1) {
                                    break label$5;
                                }
                                this._storeInt((_34_ + 108), 15);
                                break label$3;
                            }
                            while (false);
                            if ((this._loadInt((_34_ + 128))) == 0) {
                                break label$0;
                            }
                            sqlite3CodeVerifyNamedSchema((this._loadInt((_34_ + 140))), (this._loadInt(((this._loadInt((_34_ + 136))) + 8))));
                            break label$0;
                        }
                        while (false);
                        if (((this._loadInt8u(((this._loadInt((_34_ + 124))) + 34))) & 16) == 0) {
                            break label$4;
                        }
                        this._storeInt((_34_ + 108), 30);
                        this._storeInt((_34_ + 96), (this._loadInt(((this._loadInt(((sqlite3GetVTable((this._loadInt((_34_ + 116))), (this._loadInt((_34_ + 124))))) + 4))) + 4))));
                        break label$3;
                    }
                    while (false);
                    this._storeInt((_34_ + 108), 17);
                    break label$3;
                }
                while (false);
                label$9:
                do {
                    if ((this._loadInt((_34_ + 112))) != 1) {
                        break label$9;
                    }
                    this._storeInt((_34_ + 108), 13);
                    break label$3;
                }
                while (false);
                this._storeInt((_34_ + 108), 11);
            }
            while (false);
            if ((sqlite3AuthCheck((this._loadInt((_34_ + 140))), (this._loadInt((_34_ + 108))), (this._loadInt((this._loadInt((_34_ + 124))))), (this._loadInt((_34_ + 96))), (this._loadInt((_34_ + 100))))) != 0) {
                break label$0;
            }
            if ((sqlite3AuthCheck((this._loadInt((_34_ + 140))), 9, (this._loadInt((this._loadInt((_34_ + 124))))), 0, (this._loadInt((_34_ + 100))))) != 0) {
                break label$0;
            }
            label$10:
            do {
                label$11:
                do {
                    label$12:
                    do {
                        label$13:
                        do {
                            if ((sqlite3_strnicmp((this._loadInt((this._loadInt((_34_ + 124))))), 38560, 7)) == 0) {
                                break label$13;
                            }
                            label$14:
                            do {
                                if ((this._loadInt((_34_ + 132))) == 0) {
                                    break label$14;
                                }
                                if ((this._loadInt(((this._loadInt((_34_ + 124))) + 28))) == 0) {
                                    break label$11;
                                }
                            }
                            while (false);
                            if ((this._loadInt((_34_ + 132))) == 0) {
                                break label$12;
                            }
                            break label$10;
                        }
                        while (false);
                        _33_ = this._loadInt((_34_ + 140));
                        this._storeInt(_34_, (this._loadInt((this._loadInt((_34_ + 124))))));
                        sqlite3ErrorMsg(_33_, 48032, _34_);
                        break label$0;
                    }
                    while (false);
                    if ((this._loadInt(((this._loadInt((_34_ + 124))) + 28))) == 0) {
                        break label$10;
                    }
                    _33_ = this._loadInt((_34_ + 140));
                    this._storeInt((_34_ + 80), (this._loadInt((this._loadInt((_34_ + 124))))));
                    sqlite3ErrorMsg(_33_, 48112, (_34_ + 80));
                    break label$0;
                }
                while (false);
                _33_ = this._loadInt((_34_ + 140));
                this._storeInt((_34_ + 16), (this._loadInt((this._loadInt((_34_ + 124))))));
                sqlite3ErrorMsg(_33_, 48064, (_34_ + 16));
                break label$0;
            }
            while (false);
            label$15:
            do {
                if ((this._storeInt((_34_ + 120), (sqlite3GetVdbe((this._loadInt((_34_ + 140))))))) == 0) {
                    break label$15;
                }
                this._storeInt((_34_ + 88), ((this._loadInt(((this._loadInt((_34_ + 116))) + 8))) + ((this._loadInt((_34_ + 112))) << 4)));
                sqlite3BeginWriteOperation((this._loadInt((_34_ + 140))), 1, (this._loadInt((_34_ + 112))));
                label$16:
                do {
                    if (((this._loadInt8u(((this._loadInt((_34_ + 124))) + 34))) & 16) == 0) {
                        break label$16;
                    }
                    sqlite3VdbeAddOp0((this._loadInt((_34_ + 120))), 124);
                }
                while (false);
                sqlite3FkDropTable((this._loadInt((_34_ + 140))), (this._loadInt((_34_ + 136))), (this._loadInt((_34_ + 124))));
                this._storeInt((_34_ + 92), (sqlite3TriggerList((this._loadInt((_34_ + 140))), (this._loadInt((_34_ + 124))))));
                label$18:
                do {
                    label$17:
                    while (true) {
                        if ((this._loadInt((_34_ + 92))) == 0) {
                            break label$18;
                        }
                        sqlite3DropTriggerPtr((this._loadInt((_34_ + 140))), (this._loadInt((_34_ + 92))));
                        this._storeInt((_34_ + 92), (this._loadInt(((this._loadInt((_34_ + 92))) + 32))));
                        continue label$17;
                    }
                }
                while (false);
                label$19:
                do {
                    if (((this._loadInt8u(((this._loadInt((_34_ + 124))) + 34))) & 8) == 0) {
                        break label$19;
                    }
                    _33_ = this._loadInt((this._loadInt((_34_ + 88))));
                    this._storeInt((_34_ + 68), (this._loadInt((this._loadInt((_34_ + 124))))));
                    _32_ = this._loadInt((_34_ + 140));
                    this._storeInt((_34_ + 64), _33_);
                    sqlite3NestedParse(_32_, 48144, (_34_ + 64));
                }
                while (false);
                _33_ = this._loadInt((this._loadInt((_34_ + 88))));
                this._storeInt((_34_ + 56), (this._loadInt((this._loadInt((_34_ + 124))))));
                _32_ = this._loadInt((_34_ + 140));
                _31_ = this._loadInt((_34_ + 112));
                this._storeInt((_34_ + 48), _33_);
                _temp$3 = 32464;
                _temp$4 = 32496;
                _temp$5 = (_31_ == 1) ? _temp$3 : _temp$4;
                this._storeInt((_34_ + 52), _temp$5);
                sqlite3NestedParse(_32_, 48192, (_34_ + 48));
                label$20:
                do {
                    if ((sqlite3FindTable((_33_ = this._loadInt((_34_ + 116))), 32704, (this._loadInt(((this._loadInt((_33_ + 8))) + ((this._loadInt((_34_ + 112))) << 4)))))) == 0) {
                        break label$20;
                    }
                    _33_ = this._loadInt((this._loadInt((_34_ + 88))));
                    this._storeInt((_34_ + 36), (this._loadInt((this._loadInt((_34_ + 124))))));
                    _32_ = this._loadInt((_34_ + 140));
                    this._storeInt((_34_ + 32), _33_);
                    sqlite3NestedParse(_32_, 48256, (_34_ + 32));
                }
                while (false);
                label$21:
                do {
                    if ((this._loadInt((_34_ + 132))) != 0) {
                        break label$21;
                    }
                    if (((this._loadInt8u(((this._loadInt((_34_ + 124))) + 34))) & 16) != 0) {
                        break label$21;
                    }
                    destroyTable((this._loadInt((_34_ + 140))), (this._loadInt((_34_ + 124))));
                }
                while (false);
                label$22:
                do {
                    if (((this._loadInt8u(((this._loadInt((_34_ + 124))) + 34))) & 16) == 0) {
                        break label$22;
                    }
                    sqlite3VdbeAddOp4((this._loadInt((_34_ + 120))), 126, (this._loadInt((_34_ + 112))), 0, 0, (this._loadInt((this._loadInt((_34_ + 124))))), 0);
                }
                while (false);
                sqlite3VdbeAddOp4((this._loadInt((_34_ + 120))), 101, (this._loadInt((_34_ + 112))), 0, 0, (this._loadInt((this._loadInt((_34_ + 124))))), 0);
                sqlite3ChangeCookie((this._loadInt((_34_ + 140))), (this._loadInt((_34_ + 112))));
            }
            while (false);
            sqliteViewResetAll((this._loadInt((_34_ + 116))), (this._loadInt((_34_ + 112))));
        }
        while (false);
        sqlite3SrcListDelete((this._loadInt((_34_ + 116))), (this._loadInt((_34_ + 136))));
        this._storeInt((0 + 4), (_34_ + 144));
        return;
    }

    @Override()
    public final void sqlite3CreateView(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_,
            int _36_)
    {
        int _37_ = 0;
        this._storeInt(((_37_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 76), _30_);
        this._storeInt((_37_ + 72), _31_);
        this._storeInt((_37_ + 68), _32_);
        this._storeInt((_37_ + 64), _33_);
        this._storeInt((_37_ + 60), _34_);
        this._storeInt((_37_ + 56), _35_);
        this._storeInt((_37_ + 52), _36_);
        this._storeInt((_37_ + 4), (this._loadInt((this._loadInt((_37_ + 76))))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_37_ + 76))) + 456))) < 1) {
                    break label$1;
                }
                sqlite3ErrorMsg((this._loadInt((_37_ + 76))), 47968, 0);
                sqlite3SelectDelete((this._loadInt((_37_ + 4))), (this._loadInt((_37_ + 60))));
                break label$0;
            }
            while (false);
            sqlite3StartTable((this._loadInt((_37_ + 76))), (this._loadInt((_37_ + 68))), (this._loadInt((_37_ + 64))), (this._loadInt((_37_ + 56))), 1, 0, (this._loadInt((_37_ + 52))));
            label$2:
            do {
                label$3:
                do {
                    if ((this._storeInt((_37_ + 48), (this._loadInt(((this._loadInt((_37_ + 76))) + 508))))) == 0) {
                        break label$3;
                    }
                    if ((this._loadInt(((this._loadInt((_37_ + 76))) + 64))) == 0) {
                        break label$2;
                    }
                }
                while (false);
                sqlite3SelectDelete((this._loadInt((_37_ + 4))), (this._loadInt((_37_ + 60))));
                break label$0;
            }
            while (false);
            sqlite3TwoPartName((this._loadInt((_37_ + 76))), (this._loadInt((_37_ + 68))), (this._loadInt((_37_ + 64))), (_37_ + 12));
            _36_ = this._storeInt((_37_ + 8), (sqlite3SchemaToIndex((this._loadInt((_37_ + 4))), (this._loadInt(((this._loadInt((_37_ + 48))) + 68))))));
            label$4:
            do {
                if ((sqlite3FixInit((_37_ + 16), (this._loadInt((_37_ + 76))), _36_, 48016, (this._loadInt((_37_ + 12))))) == 0) {
                    break label$4;
                }
                if ((sqlite3FixSelect((_37_ + 16), (this._loadInt((_37_ + 60))))) == 0) {
                    break label$4;
                }
                sqlite3SelectDelete((this._loadInt((_37_ + 4))), (this._loadInt((_37_ + 60))));
                break label$0;
            }
            while (false);
            _36_ = sqlite3SelectDup((this._loadInt((_37_ + 4))), (this._loadInt((_37_ + 60))), 1);
            this._storeInt(((this._loadInt((_37_ + 48))) + 28), _36_);
            sqlite3SelectDelete((this._loadInt((_37_ + 4))), (this._loadInt((_37_ + 60))));
            if ((this._loadInt8u(((this._loadInt((_37_ + 4))) + 30))) != 0) {
                break label$0;
            }
            label$5:
            do {
                if ((this._loadInt8u(((this._loadInt((_37_ + 4))) + 124))) != 0) {
                    break label$5;
                }
                sqlite3ViewGetColumnNames((this._loadInt((_37_ + 76))), (this._loadInt((_37_ + 48))));
            }
            while (false);
            _35_ = this._storeInt((_37_ + 32), (this._loadInt(((_36_ = this._loadInt((_37_ + 76))) + 496))));
            this._storeInt((_37_ + 36), (this._loadInt((_36_ + 500))));
            label$6:
            do {
                if ((this._loadInt8s(_35_)) == 0) {
                    break label$6;
                }
                if ((this._loadInt8s((this._loadInt((_37_ + 32))))) == 59) {
                    break label$6;
                }
                this._storeInt((_37_ + 32), ((this._loadInt((_37_ + 32))) + (this._loadInt((_37_ + 36)))));
            }
            while (false);
            this._storeInt((_37_ + 36), 0);
            this._storeInt((_37_ + 44), ((this._loadInt((_37_ + 32))) - (this._loadInt((this._loadInt((_37_ + 72)))))));
            this._storeInt((_37_ + 40), (this._loadInt((this._loadInt((_37_ + 72))))));
            label$8:
            do {
                label$7:
                while (true) {
                    _36_ = 0;
                    label$9:
                    do {
                        if ((this._loadInt((_37_ + 44))) < 1) {
                            break label$9;
                        }
                        _36_ = (this._loadInt8u(((this._loadInt8u((((this._loadInt((_37_ + 40))) + (this._loadInt((_37_ + 44)))) + -1))) + 21776))) & 1;
                    }
                    while (false);
                    if (_36_ == 0) {
                        break label$8;
                    }
                    this._storeInt((_37_ + 44), ((this._loadInt((_37_ + 44))) + -1));
                    continue label$7;
                }
            }
            while (false);
            this._storeInt((_37_ + 32), (((this._loadInt((_37_ + 40))) + (this._loadInt((_37_ + 44)))) + -1));
            this._storeInt((_37_ + 36), 1);
            sqlite3EndTable((this._loadInt((_37_ + 76))), 0, (_37_ + 32), 0);
        }
        while (false);
        this._storeInt((0 + 4), (_37_ + 80));
        return;
    }

    @Override()
    public final int sqlite3Select(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        double _34_ = 0.0;
        double _35_ = 0.0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 368))) + 360), _30_);
        this._storeInt((_33_ + 356), _31_);
        this._storeInt((_33_ + 352), _32_);
        _31_ = this._storeInt((_33_ + 296), 1);
        this._storeInt((_33_ + 236), (this._loadInt(((this._loadInt((_33_ + 360))) + 552))));
        this._storeInt(((_32_ = this._loadInt((_33_ + 360))) + 556), (_31_ + (_30_ = this._loadInt((_32_ + 556)))));
        this._storeInt((_32_ + 552), _30_);
        this._storeInt((_33_ + 240), (this._loadInt(_32_)));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_33_ + 356))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt8u(((this._loadInt((_33_ + 240))) + 30))) != 0) {
                        break label$2;
                    }
                    if ((this._loadInt(((this._loadInt((_33_ + 360))) + 64))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((_33_ + 364), _31_);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((sqlite3AuthCheck((this._loadInt((_33_ + 360))), 21, 0, 0, 0)) == 0) {
                    break label$3;
                }
                this._storeInt((_33_ + 364), 1);
                break label$0;
            }
            while (false);
            memset((_33_ + 248), 0, 44);
            label$4:
            do {
                if ((this._loadInt8u((this._loadInt((_33_ + 352))))) > 4) {
                    break label$4;
                }
                sqlite3ExprListDelete((this._loadInt((_33_ + 240))), (this._loadInt(((this._loadInt((_33_ + 356))) + 24))));
                this._storeInt(((_32_ = this._loadInt((_33_ + 356))) + 24), 0);
                this._storeInt16((_32_ + 6), ((this._loadInt16u((_32_ + 6))) & 65534));
            }
            while (false);
            sqlite3SelectPrep((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 356))), 0);
            this._storeInt((_33_ + 316), (this._loadInt(((this._loadInt((_33_ + 356))) + 24))));
            this._storeInt((_33_ + 324), (this._loadInt(((this._loadInt((_33_ + 356))) + 8))));
            this._storeInt((_33_ + 328), (this._loadInt((this._loadInt((_33_ + 356))))));
            label$5:
            do {
                if ((this._loadInt(((this._loadInt((_33_ + 360))) + 64))) != 0) {
                    break label$5;
                }
                if ((this._loadInt8u(((this._loadInt((_33_ + 240))) + 30))) != 0) {
                    break label$5;
                }
                this._storeInt((_33_ + 332), (((this._loadInt16u(((this._loadInt((_33_ + 356))) + 6))) & 4) >>> 2));
                if ((this._storeInt((_33_ + 336), (sqlite3GetVdbe((this._loadInt((_33_ + 360))))))) == 0) {
                    break label$5;
                }
                if ((checkForMultiColumnSelectError((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 352))), (this._loadInt((this._loadInt((_33_ + 328))))))) != 0) {
                    break label$5;
                }
                this._storeInt((_33_ + 348), 0);
                label$7:
                do {
                    label$6:
                    while (true) {
                        _32_ = 0;
                        label$8:
                        do {
                            if ((this._loadInt(((this._loadInt((_33_ + 356))) + 28))) != 0) {
                                break label$8;
                            }
                            _32_ = ((this._loadInt((_33_ + 348))) < (this._loadInt16s((this._loadInt((_33_ + 324)))))) ? 1 : 0;
                        }
                        while (false);
                        if (_32_ == 0) {
                            break label$7;
                        }
                        this._storeInt((_33_ + 232), ((_32_ = (this._loadInt((_33_ + 324))) + ((this._loadInt((_33_ + 348))) * 56)) + 8));
                        label$9:
                        do {
                            if ((this._storeInt((_33_ + 212), (this._loadInt((_32_ + 24))))) == 0) {
                                break label$9;
                            }
                            if ((this._loadInt8u(((this._loadInt((_33_ + 232))) + 20))) != 0) {
                                break label$9;
                            }
                            _32_ = sqlite3SelectExprHeight((this._loadInt((_33_ + 356))));
                            this._storeInt(((_31_ = this._loadInt((_33_ + 360))) + 540), (_32_ + (this._loadInt((_31_ + 540)))));
                            _32_ = this._storeInt((_33_ + 208), (((this._loadInt16u(((this._loadInt((_33_ + 212))) + 6))) & 4) >>> 2));
                            label$10:
                            do {
                                label$11:
                                do {
                                    if ((flattenSubquery((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 356))), (this._loadInt((_33_ + 348))), (this._loadInt((_33_ + 332))), _32_)) == 0) {
                                        break label$11;
                                    }
                                    label$12:
                                    do {
                                        if ((this._loadInt((_33_ + 208))) == 0) {
                                            break label$12;
                                        }
                                        this._storeInt((_33_ + 332), 1);
                                        this._storeInt16(((_32_ = this._loadInt((_33_ + 356))) + 6), ((this._loadInt16u((_32_ + 6))) | 4));
                                    }
                                    while (false);
                                    this._storeInt((_33_ + 348), -1);
                                    break label$10;
                                }
                                while (false);
                                sqlite3SelectDestInit((_33_ + 216), 9, (this._loadInt(((this._loadInt((_33_ + 232))) + 24))));
                                this._storeInt8(((this._loadInt((_33_ + 232))) + 23), (this._loadInt(((_32_ = this._loadInt((_33_ + 360))) + 556))));
                                sqlite3Select(_32_, (this._loadInt((_33_ + 212))), (_33_ + 216));
                                this._storeInt8(((_32_ = this._loadInt((_33_ + 232))) + 20), 1);
                                this._storeInt(((this._loadInt((_32_ + 12))) + 24), (_truncateDoubleToUnsignedInteger((this._loadDouble(((this._loadInt((_33_ + 212))) + 72))))));
                            }
                            while (false);
                            if ((this._loadInt8u(((this._loadInt((_33_ + 240))) + 30))) != 0) {
                                break label$5;
                            }
                            _32_ = sqlite3SelectExprHeight((this._loadInt((_33_ + 356))));
                            this._storeInt(((_31_ = this._loadInt((_33_ + 360))) + 540), ((this._loadInt((_31_ + 540))) - _32_));
                            this._storeInt((_33_ + 324), (this._loadInt(((this._loadInt((_33_ + 356))) + 8))));
                            if ((this._loadInt8u((this._loadInt((_33_ + 352))))) < 5) {
                                break label$9;
                            }
                            this._storeInt((_33_ + 316), (this._loadInt(((this._loadInt((_33_ + 356))) + 24))));
                        }
                        while (false);
                        this._storeInt((_33_ + 348), ((this._loadInt((_33_ + 348))) + 1));
                        continue label$6;
                    }
                }
                while (false);
                this._storeInt((_33_ + 328), (this._loadInt((this._loadInt((_33_ + 356))))));
                this._storeInt((_33_ + 320), (this._loadInt(((this._loadInt((_33_ + 356))) + 12))));
                this._storeInt((_33_ + 312), (this._loadInt(((this._loadInt((_33_ + 356))) + 16))));
                this._storeInt((_33_ + 308), (this._loadInt(((this._loadInt((_33_ + 356))) + 20))));
                this._storeInt((_33_ + 304), ((this._loadInt16u(((this._loadInt((_33_ + 356))) + 6))) & 1));
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
                                    if ((this._loadInt(((this._loadInt((_33_ + 356))) + 28))) == 0) {
                                        break label$17;
                                    }
                                    if ((this._loadInt(((this._loadInt((_33_ + 356))) + 36))) == 0) {
                                        break label$16;
                                    }
                                    break label$13;
                                }
                                while (false);
                                label$18:
                                do {
                                    if (((this._loadInt16u(((this._loadInt((_33_ + 356))) + 6))) & 5) != 1) {
                                        break label$18;
                                    }
                                    _32_ = sqlite3ExprListDup((this._loadInt((_33_ + 240))), (this._loadInt((this._loadInt((_33_ + 356))))), 0);
                                    this._storeInt((_33_ + 312), (this._storeInt(((this._loadInt((_33_ + 356))) + 16), _32_)));
                                    this._storeInt16(((_32_ = this._loadInt((_33_ + 356))) + 6), ((this._loadInt16u((_32_ + 6))) & 65534));
                                }
                                while (false);
                                label$19:
                                do {
                                    if ((sqlite3ExprListCompare((this._loadInt(((this._loadInt((_33_ + 356))) + 16))), (this._loadInt((_33_ + 316))))) != 0) {
                                        break label$19;
                                    }
                                    if (((this._loadInt8u(((this._loadInt((_33_ + 240))) + 12))) & 32) != 0) {
                                        break label$19;
                                    }
                                    this._storeInt((_33_ + 316), 0);
                                }
                                while (false);
                                if ((this._loadInt((_33_ + 316))) == 0) {
                                    break label$15;
                                }
                                _31_ = this._storeInt((_33_ + 188), (keyInfoFromExprList((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 316))))));
                                this._storeInt(((_32_ = this._loadInt((_33_ + 360))) + 68), ((_30_ = this._loadInt((_32_ + 68))) + 1));
                                this._storeInt(((_32_ = this._loadInt((_33_ + 316))) + 8), _30_);
                                _32_ = this._storeInt((_33_ + 292), (sqlite3VdbeAddOp4((this._loadInt((_33_ + 336))), 41, (this._loadInt((_32_ + 8))), ((this._loadInt(_32_)) + 2), 0, _31_, -16)));
                                this._storeInt(((this._loadInt((_33_ + 356))) + 64), _32_);
                                break label$14;
                            }
                            while (false);
                            this._storeInt((_33_ + 196), (this._storeInt((_33_ + 200), 0)));
                            this._storeInt((_33_ + 204), (this._loadInt((_33_ + 356))));
                            label$21:
                            do {
                                label$20:
                                while (true) {
                                    if ((this._loadInt((_33_ + 204))) == 0) {
                                        break label$21;
                                    }
                                    this._storeInt(((_32_ = this._loadInt((_33_ + 204))) + 32), (this._loadInt((_33_ + 200))));
                                    this._storeInt((_32_ + 36), (this._loadInt((_33_ + 356))));
                                    this._storeInt((_33_ + 200), (this._loadInt((_33_ + 204))));
                                    this._storeInt((_33_ + 204), (this._loadInt(((this._loadInt((_33_ + 204))) + 28))));
                                    this._storeInt((_33_ + 196), ((this._loadInt((_33_ + 196))) + 1));
                                    continue label$20;
                                }
                            }
                            while (false);
                            if ((this._storeInt((_33_ + 192), (this._loadInt(((this._loadInt((_33_ + 240))) + 88))))) == 0) {
                                break label$13;
                            }
                            if ((this._loadInt((_33_ + 196))) <= (this._loadInt((_33_ + 192)))) {
                                break label$13;
                            }
                            sqlite3ErrorMsg((this._loadInt((_33_ + 360))), 47296, 0);
                            break label$5;
                        }
                        while (false);
                        this._storeInt((_33_ + 292), -1);
                    }
                    while (false);
                    label$22:
                    do {
                        if ((this._loadInt8u((this._loadInt((_33_ + 352))))) != 9) {
                            break label$22;
                        }
                        sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 41, (this._loadInt(((this._loadInt((_33_ + 352))) + 4))), (this._loadInt((this._loadInt((_33_ + 328))))));
                    }
                    while (false);
                    _32_ = this._storeInt((_33_ + 244), (sqlite3VdbeMakeLabel((this._loadInt((_33_ + 336))))));
                    this._storeLong(((_31_ = this._loadInt((_33_ + 356))) + 72), 4890909195324358656L);
                    computeLimitRegisters((this._loadInt((_33_ + 360))), _31_, _32_);
                    label$23:
                    do {
                        label$24:
                        do {
                            if (((this._loadInt16u(((this._loadInt((_33_ + 356))) + 6))) & 1) == 0) {
                                break label$24;
                            }
                            this._storeInt(((_32_ = this._loadInt((_33_ + 360))) + 68), ((_32_ = this._loadInt((_32_ + 68))) + 1));
                            this._storeInt((_33_ + 300), _32_);
                            _32_ = this._storeInt((_33_ + 184), (keyInfoFromExprList((this._loadInt((_33_ + 360))), (this._loadInt((this._loadInt((_33_ + 356))))))));
                            sqlite3VdbeAddOp4((this._loadInt((_33_ + 336))), 41, (this._loadInt((_33_ + 300))), 0, 0, _32_, -16);
                            sqlite3VdbeChangeP5((this._loadInt((_33_ + 336))), 16);
                            break label$23;
                        }
                        while (false);
                        this._storeInt((_33_ + 300), -1);
                    }
                    while (false);
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
                                        label$30:
                                        do {
                                            label$31:
                                            do {
                                                label$32:
                                                do {
                                                    label$33:
                                                    do {
                                                        label$34:
                                                        do {
                                                            label$35:
                                                            do {
                                                                label$36:
                                                                do {
                                                                    if ((this._loadInt((_33_ + 332))) != 0) {
                                                                        break label$36;
                                                                    }
                                                                    if ((this._loadInt((_33_ + 312))) == 0) {
                                                                        break label$35;
                                                                    }
                                                                }
                                                                while (false);
                                                                label$37:
                                                                do {
                                                                    label$38:
                                                                    do {
                                                                        if ((this._loadInt((_33_ + 312))) == 0) {
                                                                            break label$38;
                                                                        }
                                                                        this._storeInt((_33_ + 116), (this._loadInt((this._loadInt((this._loadInt((_33_ + 356))))))));
                                                                        this._storeInt((_33_ + 112), (this._loadInt(((this._loadInt((this._loadInt((_33_ + 356))))) + 12))));
                                                                        label$40:
                                                                        do {
                                                                            label$39:
                                                                            while (true) {
                                                                                if ((this._loadInt((_33_ + 116))) < 1) {
                                                                                    break label$40;
                                                                                }
                                                                                this._storeInt16(((this._loadInt((_33_ + 112))) + 16), 0);
                                                                                this._storeInt((_33_ + 116), ((this._loadInt((_33_ + 116))) + -1));
                                                                                this._storeInt((_33_ + 112), ((this._loadInt((_33_ + 112))) + 20));
                                                                                continue label$39;
                                                                            }
                                                                        }
                                                                        while (false);
                                                                        this._storeInt((_33_ + 116), (this._loadInt((this._loadInt((_33_ + 312))))));
                                                                        this._storeInt((_33_ + 112), (this._loadInt(((this._loadInt((_33_ + 312))) + 12))));
                                                                        label$42:
                                                                        do {
                                                                            label$41:
                                                                            while (true) {
                                                                                if ((this._loadInt((_33_ + 116))) < 1) {
                                                                                    break label$42;
                                                                                }
                                                                                this._storeInt16(((this._loadInt((_33_ + 112))) + 16), 0);
                                                                                this._storeInt((_33_ + 116), ((this._loadInt((_33_ + 116))) + -1));
                                                                                this._storeInt((_33_ + 112), ((this._loadInt((_33_ + 112))) + 20));
                                                                                continue label$41;
                                                                            }
                                                                        }
                                                                        while (false);
                                                                        if (((((_35_ = this._loadDouble(((this._loadInt((_33_ + 356))) + 72))) <= 100.0) ? 1 : 0) | ((_35_ != _35_) ? 1 : 0)) != 0) {
                                                                            break label$37;
                                                                        }
                                                                        this._storeLong(((this._loadInt((_33_ + 356))) + 72), 4636737291354636288L);
                                                                        break label$37;
                                                                    }
                                                                    while (false);
                                                                    this._storeLong(((this._loadInt((_33_ + 356))) + 72), 4607182418800017408L);
                                                                }
                                                                while (false);
                                                                this._storeInt((_33_ + 120), (sqlite3VdbeMakeLabel((this._loadInt((_33_ + 336))))));
                                                                _32_ = 0;
                                                                memset((_33_ + 144), 0, 36);
                                                                this._storeInt((_33_ + 144), (this._loadInt((_33_ + 360))));
                                                                this._storeInt((_33_ + 148), (this._loadInt((_33_ + 324))));
                                                                this._storeInt((_33_ + 172), (_33_ + 248));
                                                                label$43:
                                                                do {
                                                                    if ((this._loadInt((_33_ + 312))) == 0) {
                                                                        break label$43;
                                                                    }
                                                                    _32_ = (this._loadInt((this._loadInt((_33_ + 312))))) + 1;
                                                                }
                                                                while (false);
                                                                this._storeInt((_33_ + 260), _32_);
                                                                this._storeInt((_33_ + 256), (this._loadInt((_33_ + 312))));
                                                                sqlite3ExprAnalyzeAggList((_33_ + 144), (this._loadInt((_33_ + 328))));
                                                                sqlite3ExprAnalyzeAggList((_33_ + 144), (this._loadInt((_33_ + 316))));
                                                                label$44:
                                                                do {
                                                                    if ((this._loadInt((_33_ + 308))) == 0) {
                                                                        break label$44;
                                                                    }
                                                                    sqlite3ExprAnalyzeAggregates((_33_ + 144), (this._loadInt((_33_ + 308))));
                                                                }
                                                                while (false);
                                                                this._storeInt((_33_ + 276), (this._loadInt((_33_ + 268))));
                                                                this._storeInt((_33_ + 348), 0);
                                                                label$46:
                                                                do {
                                                                    label$45:
                                                                    while (true) {
                                                                        if ((this._loadInt((_33_ + 348))) >= (this._loadInt((_33_ + 284)))) {
                                                                            break label$46;
                                                                        }
                                                                        sqlite3ExprAnalyzeAggList((_33_ + 144), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 280))) + ((this._loadInt((_33_ + 348))) << 4)))) + 16))));
                                                                        this._storeInt((_33_ + 348), ((this._loadInt((_33_ + 348))) + 1));
                                                                        continue label$45;
                                                                    }
                                                                }
                                                                while (false);
                                                                if ((this._loadInt8u(((this._loadInt((_33_ + 240))) + 30))) != 0) {
                                                                    break label$5;
                                                                }
                                                                if ((this._loadInt((_33_ + 312))) == 0) {
                                                                    break label$34;
                                                                }
                                                                this._storeInt(((_32_ = this._loadInt((_33_ + 360))) + 68), ((_31_ = this._loadInt((_32_ + 68))) + 1));
                                                                this._storeInt((_33_ + 252), _31_);
                                                                _32_ = this._storeInt((_33_ + 108), (keyInfoFromExprList(_32_, (this._loadInt((_33_ + 312))))));
                                                                this._storeInt((_33_ + 84), (sqlite3VdbeAddOp4((this._loadInt((_33_ + 336))), 41, (this._loadInt((_33_ + 252))), (this._loadInt((_33_ + 260))), 0, _32_, -16)));
                                                                this._storeInt((_33_ + 132), (this._storeInt(((_32_ = this._loadInt((_33_ + 360))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
                                                                this._storeInt((_33_ + 128), (this._storeInt(((_32_ = this._loadInt((_33_ + 360))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
                                                                this._storeInt((_33_ + 96), (this._storeInt(((_32_ = this._loadInt((_33_ + 360))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
                                                                this._storeInt((_33_ + 100), (sqlite3VdbeMakeLabel((this._loadInt((_33_ + 336))))));
                                                                this._storeInt((_33_ + 76), (this._storeInt(((_32_ = this._loadInt((_33_ + 360))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
                                                                this._storeInt((_33_ + 80), (sqlite3VdbeMakeLabel((this._loadInt((_33_ + 336))))));
                                                                this._storeInt((_33_ + 140), ((this._loadInt(((this._loadInt((_33_ + 360))) + 72))) + 1));
                                                                this._storeInt((_33_ + 136), ((this._storeInt(((_32_ = this._loadInt((_33_ + 360))) + 72), ((this._loadInt((_32_ + 72))) + (this._loadInt((this._loadInt((_33_ + 312)))))))) + 1));
                                                                this._storeInt(((_32_ = this._loadInt((_33_ + 360))) + 72), ((this._loadInt((_32_ + 72))) + (this._loadInt((this._loadInt((_33_ + 312)))))));
                                                                sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 7, 0, (this._loadInt((_33_ + 128))));
                                                                sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 7, 0, (this._loadInt((_33_ + 132))));
                                                                sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 2, (this._loadInt((_33_ + 76))), (this._loadInt((_33_ + 80))));
                                                                if ((this._storeInt((_33_ + 340), (sqlite3WhereBegin((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 324))), (this._loadInt((_33_ + 320))), (_33_ + 312), 0)))) == 0) {
                                                                    break label$5;
                                                                }
                                                                if ((this._loadInt((_33_ + 312))) == 0) {
                                                                    break label$31;
                                                                }
                                                                _31_ = this._loadInt((_33_ + 360));
                                                                _32_ = 0;
                                                                label$47:
                                                                do {
                                                                    if ((this._loadInt((_33_ + 304))) == 0) {
                                                                        break label$47;
                                                                    }
                                                                    _32_ = (((this._loadInt16u(((this._loadInt((_33_ + 356))) + 6))) & 1) == 0) ? 1 : 0;
                                                                }
                                                                while (false);
                                                                _temp$0 = 47344;
                                                                _temp$1 = 47360;
                                                                _temp$2 = (_32_ != 0) ? _temp$0 : _temp$1;
                                                                explainTempTable(_31_, _temp$2);
                                                                _32_ = this._storeInt((_33_ + 124), 1);
                                                                this._storeInt((_33_ + 60), (this._loadInt((this._loadInt((_33_ + 312))))));
                                                                this._storeInt((_33_ + 64), (_32_ + (this._loadInt((_33_ + 60)))));
                                                                this._storeInt((_33_ + 344), (_32_ + (this._loadInt((_33_ + 60)))));
                                                                this._storeInt((_33_ + 348), 0);
                                                                label$48:
                                                                while (true) {
                                                                    if ((this._loadInt((_33_ + 348))) >= (this._loadInt((_33_ + 268)))) {
                                                                        break label$33;
                                                                    }
                                                                    label$50:
                                                                    do {
                                                                        if ((this._loadInt((((this._loadInt((_33_ + 264))) + ((this._loadInt((_33_ + 348))) * 24)) + 12))) < (this._loadInt((_33_ + 344)))) {
                                                                            break label$50;
                                                                        }
                                                                        this._storeInt((_33_ + 64), ((this._loadInt((_33_ + 64))) + _32_));
                                                                        this._storeInt((_33_ + 344), ((this._loadInt((_33_ + 344))) + _32_));
                                                                    }
                                                                    while (false);
                                                                    this._storeInt((_33_ + 348), ((this._loadInt((_33_ + 348))) + _32_));
                                                                    continue label$48;
                                                                }
                                                            }
                                                            while (false);
                                                            if ((this._storeInt((_33_ + 340), (sqlite3WhereBegin((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 324))), (this._loadInt((_33_ + 320))), (_33_ + 316), 0)))) == 0) {
                                                                break label$5;
                                                            }
                                                            label$51:
                                                            do {
                                                                if (((((_35_ = this._loadDouble(((this._loadInt((_33_ + 340))) + 40))) >= (_34_ = this._loadDouble(((this._loadInt((_33_ + 356))) + 72)))) ? 1 : 0) | (((_35_ != _35_) ? 1 : 0) | ((_34_ != _34_) ? 1 : 0))) != 0) {
                                                                    break label$51;
                                                                }
                                                                this._storeDouble(((this._loadInt((_33_ + 356))) + 72), (this._loadDouble(((this._loadInt((_33_ + 340))) + 40))));
                                                            }
                                                            while (false);
                                                            label$52:
                                                            do {
                                                                if ((this._loadInt((_33_ + 292))) < 0) {
                                                                    break label$52;
                                                                }
                                                                if ((this._loadInt((_33_ + 316))) != 0) {
                                                                    break label$52;
                                                                }
                                                                sqlite3VdbeChangeToNoop((this._loadInt((_33_ + 336))), (this._loadInt((_33_ + 292))), 1);
                                                                this._storeInt(((this._loadInt((_33_ + 356))) + 64), -1);
                                                            }
                                                            while (false);
                                                            selectInnerLoop((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 356))), (this._loadInt((_33_ + 328))), 0, 0, (this._loadInt((_33_ + 316))), -1, (this._loadInt((_33_ + 352))), (this._loadInt(((_32_ = this._loadInt((_33_ + 340))) + 16))), (this._loadInt((_32_ + 20))));
                                                            sqlite3WhereEnd((this._loadInt((_33_ + 340))));
                                                            break label$26;
                                                        }
                                                        while (false);
                                                        _32_ = this._storeInt((_33_ + 44), 0);
                                                        if ((this._storeInt((_33_ + 40), (isSimpleCount((this._loadInt((_33_ + 356))), (_33_ + 248))))) == 0) {
                                                            break label$29;
                                                        }
                                                        this._storeInt((_33_ + 36), (sqlite3SchemaToIndex((this._loadInt((this._loadInt((_33_ + 360))))), (this._loadInt(((this._loadInt((_33_ + 40))) + 68))))));
                                                        this._storeInt(((_31_ = this._loadInt((_33_ + 360))) + 68), ((_31_ = this._loadInt((_31_ + 68))) + 1));
                                                        this._storeInt((_33_ + 32), _31_);
                                                        _32_ = this._storeInt((_33_ + 20), (this._storeInt((_33_ + 24), _32_)));
                                                        this._storeInt((_33_ + 16), (this._loadInt(((this._loadInt((_33_ + 40))) + 20))));
                                                        sqlite3CodeVerifySchema((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 36))));
                                                        sqlite3TableLock((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 36))), (this._loadInt(((_31_ = this._loadInt((_33_ + 40))) + 20))), _32_, (this._loadInt(_31_)));
                                                        this._storeInt((_33_ + 28), (this._loadInt(((this._loadInt((_33_ + 40))) + 16))));
                                                        label$53:
                                                        while (true) {
                                                            if ((this._loadInt((_33_ + 28))) == 0) {
                                                                break label$32;
                                                            }
                                                            label$55:
                                                            do {
                                                                if ((this._loadInt8u(((this._loadInt((_33_ + 28))) + 26))) != 0) {
                                                                    break label$55;
                                                                }
                                                                label$56:
                                                                do {
                                                                    if ((this._loadInt((_33_ + 20))) == 0) {
                                                                        break label$56;
                                                                    }
                                                                    if ((this._loadInt(((this._loadInt((_33_ + 28))) + 4))) >= (this._loadInt(((this._loadInt((_33_ + 20))) + 4)))) {
                                                                        break label$55;
                                                                    }
                                                                }
                                                                while (false);
                                                                this._storeInt((_33_ + 20), (this._loadInt((_33_ + 28))));
                                                            }
                                                            while (false);
                                                            this._storeInt((_33_ + 28), (this._loadInt(((this._loadInt((_33_ + 28))) + 32))));
                                                            continue label$53;
                                                        }
                                                    }
                                                    while (false);
                                                    this._storeInt((_33_ + 72), (sqlite3GetTempRange((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 64))))));
                                                    sqlite3ExprCacheClear((this._loadInt((_33_ + 360))));
                                                    sqlite3ExprCodeExprList((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 72))), 0);
                                                    sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 53, (this._loadInt((_33_ + 252))), ((this._loadInt((_33_ + 72))) + (this._loadInt((_33_ + 60)))));
                                                    this._storeInt((_33_ + 344), ((this._loadInt((_33_ + 60))) + 1));
                                                    this._storeInt((_33_ + 348), 0);
                                                    label$58:
                                                    do {
                                                        label$57:
                                                        while (true) {
                                                            if ((this._loadInt((_33_ + 348))) >= (this._loadInt((_33_ + 268)))) {
                                                                break label$58;
                                                            }
                                                            label$59:
                                                            do {
                                                                if ((this._loadInt(((this._storeInt((_33_ + 56), ((this._loadInt((_33_ + 264))) + ((this._loadInt((_33_ + 348))) * 24)))) + 12))) < (this._loadInt((_33_ + 344)))) {
                                                                    break label$59;
                                                                }
                                                                _31_ = this._storeInt((_33_ + 52), ((this._loadInt((_33_ + 344))) + (this._loadInt((_33_ + 72)))));
                                                                label$60:
                                                                do {
                                                                    if ((this._storeInt((_33_ + 48), (sqlite3ExprCodeGetColumn((this._loadInt((_33_ + 360))), (this._loadInt((_32_ = this._loadInt((_33_ + 56))))), (this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))), _31_)))) == (this._loadInt((_33_ + 52)))) {
                                                                        break label$60;
                                                                    }
                                                                    sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 15, (this._loadInt((_33_ + 48))), (this._loadInt((_33_ + 52))));
                                                                }
                                                                while (false);
                                                                this._storeInt((_33_ + 344), ((this._loadInt((_33_ + 344))) + 1));
                                                            }
                                                            while (false);
                                                            this._storeInt((_33_ + 348), ((this._loadInt((_33_ + 348))) + 1));
                                                            continue label$57;
                                                        }
                                                    }
                                                    while (false);
                                                    _32_ = this._storeInt((_33_ + 68), (sqlite3GetTempReg((this._loadInt((_33_ + 360))))));
                                                    sqlite3VdbeAddOp3((this._loadInt((_33_ + 336))), 30, (this._loadInt((_33_ + 72))), (this._loadInt((_33_ + 64))), _32_);
                                                    sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 70, (this._loadInt((_33_ + 252))), (this._loadInt((_33_ + 68))));
                                                    sqlite3ReleaseTempReg((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 68))));
                                                    sqlite3ReleaseTempRange((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 72))), (this._loadInt((_33_ + 64))));
                                                    sqlite3WhereEnd((this._loadInt((_33_ + 340))));
                                                    sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 64, (this._loadInt((_33_ + 252))), (this._loadInt((_33_ + 120))));
                                                    this._storeInt8((_33_ + 249), 1);
                                                    sqlite3ExprCacheClear((this._loadInt((_33_ + 360))));
                                                    break label$30;
                                                }
                                                while (false);
                                                label$61:
                                                do {
                                                    if ((this._loadInt((_33_ + 20))) == 0) {
                                                        break label$61;
                                                    }
                                                    if ((this._loadInt(((this._loadInt((_33_ + 20))) + 4))) >= (this._loadInt(((this._loadInt((_33_ + 40))) + 8)))) {
                                                        break label$61;
                                                    }
                                                    this._storeInt((_33_ + 16), (this._loadInt(((this._loadInt((_33_ + 20))) + 20))));
                                                    this._storeInt((_33_ + 24), (sqlite3IndexKeyinfo((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 20))))));
                                                }
                                                while (false);
                                                sqlite3VdbeAddOp3((this._loadInt((_33_ + 336))), 38, (this._loadInt((_33_ + 32))), (this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 36))));
                                                label$62:
                                                do {
                                                    if ((this._loadInt((_33_ + 24))) == 0) {
                                                        break label$62;
                                                    }
                                                    sqlite3VdbeChangeP4((this._loadInt((_33_ + 336))), -1, (this._loadInt((_33_ + 24))), -16);
                                                }
                                                while (false);
                                                sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 31, (this._loadInt((_33_ + 32))), (this._loadInt(((this._loadInt((_33_ + 280))) + 8))));
                                                sqlite3VdbeAddOp1((this._loadInt((_33_ + 336))), 43, (this._loadInt((_33_ + 32))));
                                                explainSimpleCount((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 40))), (this._loadInt((_33_ + 20))));
                                                break label$28;
                                            }
                                            while (false);
                                            this._storeInt((_33_ + 312), (this._loadInt(((this._loadInt((_33_ + 356))) + 16))));
                                            this._storeInt((_33_ + 124), 0);
                                        }
                                        while (false);
                                        this._storeInt((_33_ + 88), (sqlite3VdbeCurrentAddr((this._loadInt((_33_ + 336))))));
                                        sqlite3ExprCacheClear((this._loadInt((_33_ + 360))));
                                        this._storeInt((_33_ + 344), 0);
                                        label$64:
                                        do {
                                            label$63:
                                            while (true) {
                                                if ((this._loadInt((_33_ + 344))) >= (this._loadInt((this._loadInt((_33_ + 312)))))) {
                                                    break label$64;
                                                }
                                                label$65:
                                                do {
                                                    label$66:
                                                    do {
                                                        if ((this._loadInt((_33_ + 124))) == 0) {
                                                            break label$66;
                                                        }
                                                        sqlite3VdbeAddOp3((this._loadInt((_33_ + 336))), 28, (this._loadInt((_33_ + 252))), (_32_ = this._loadInt((_33_ + 344))), (_32_ + (this._loadInt((_33_ + 136)))));
                                                        break label$65;
                                                    }
                                                    while (false);
                                                    this._storeInt8((_33_ + 248), 1);
                                                    sqlite3ExprCode((this._loadInt((_33_ + 360))), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 312))) + 12))) + ((_32_ = this._loadInt((_33_ + 344))) * 20)))), ((this._loadInt((_33_ + 136))) + _32_));
                                                }
                                                while (false);
                                                this._storeInt((_33_ + 344), ((this._loadInt((_33_ + 344))) + 1));
                                                continue label$63;
                                            }
                                        }
                                        while (false);
                                        sqlite3VdbeAddOp4((this._loadInt((_33_ + 336))), 24, (this._loadInt((_33_ + 140))), (this._loadInt((_33_ + 136))), (this._loadInt((this._loadInt((_33_ + 312))))), (this._loadInt((_33_ + 108))), -6);
                                        _32_ = this._storeInt((_33_ + 104), (sqlite3VdbeCurrentAddr((this._loadInt((_33_ + 336))))));
                                        sqlite3VdbeAddOp3((this._loadInt((_33_ + 336))), 25, (_32_ = _32_ + 1), 0, _32_);
                                        sqlite3ExprCodeMove((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 136))), (this._loadInt((_33_ + 140))), (this._loadInt((this._loadInt((_33_ + 312))))));
                                        sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 2, (this._loadInt((_33_ + 96))), (this._loadInt((_33_ + 100))));
                                        sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 113, (this._loadInt((_33_ + 128))), (this._loadInt((_33_ + 120))));
                                        sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 2, (this._loadInt((_33_ + 76))), (this._loadInt((_33_ + 80))));
                                        sqlite3VdbeJumpHere((this._loadInt((_33_ + 336))), (this._loadInt((_33_ + 104))));
                                        updateAccumulator((this._loadInt((_33_ + 360))), (_33_ + 248));
                                        sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 7, 1, (this._loadInt((_33_ + 132))));
                                        label$67:
                                        do {
                                            label$68:
                                            do {
                                                if ((this._loadInt((_33_ + 124))) == 0) {
                                                    break label$68;
                                                }
                                                sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 67, (this._loadInt((_33_ + 252))), (this._loadInt((_33_ + 88))));
                                                break label$67;
                                            }
                                            while (false);
                                            sqlite3WhereEnd((this._loadInt((_33_ + 340))));
                                            sqlite3VdbeChangeToNoop((this._loadInt((_33_ + 336))), (this._loadInt((_33_ + 84))), 1);
                                        }
                                        while (false);
                                        sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 2, (this._loadInt((_33_ + 96))), (this._loadInt((_33_ + 100))));
                                        sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 1, 0, (this._loadInt((_33_ + 120))));
                                        this._storeInt((_33_ + 92), (sqlite3VdbeCurrentAddr((this._loadInt((_33_ + 336))))));
                                        sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 7, 1, (this._loadInt((_33_ + 128))));
                                        sqlite3VdbeAddOp1((this._loadInt((_33_ + 336))), 3, (this._loadInt((_33_ + 96))));
                                        sqlite3VdbeResolveLabel((this._loadInt((_33_ + 336))), (this._loadInt((_33_ + 100))));
                                        _32_ = this._storeInt((_33_ + 100), (sqlite3VdbeCurrentAddr((this._loadInt((_33_ + 336))))));
                                        sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 113, (this._loadInt((_33_ + 132))), (_32_ + 2));
                                        sqlite3VdbeAddOp1((this._loadInt((_33_ + 336))), 3, (this._loadInt((_33_ + 96))));
                                        finalizeAggFunctions((this._loadInt((_33_ + 360))), (_33_ + 248));
                                        sqlite3ExprIfFalse((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 308))), ((this._loadInt((_33_ + 100))) + 1), 8);
                                        selectInnerLoop((this._loadInt((_33_ + 360))), (_32_ = this._loadInt((_33_ + 356))), (this._loadInt(_32_)), 0, 0, (this._loadInt((_33_ + 316))), (this._loadInt((_33_ + 300))), (this._loadInt((_33_ + 352))), ((this._loadInt((_33_ + 100))) + 1), (this._loadInt((_33_ + 92))));
                                        sqlite3VdbeAddOp1((this._loadInt((_33_ + 336))), 3, (this._loadInt((_33_ + 96))));
                                        sqlite3VdbeResolveLabel((this._loadInt((_33_ + 336))), (this._loadInt((_33_ + 80))));
                                        resetAccumulator((this._loadInt((_33_ + 360))), (_33_ + 248));
                                        sqlite3VdbeAddOp1((this._loadInt((_33_ + 336))), 3, (this._loadInt((_33_ + 76))));
                                        break label$27;
                                    }
                                    while (false);
                                    this._storeInt((_33_ + 12), _32_);
                                    label$69:
                                    do {
                                        if ((this._storeInt8((_33_ + 11), (minMaxQuery((this._loadInt((_33_ + 356))))))) == 0) {
                                            break label$69;
                                        }
                                        this._storeInt((_33_ + 44), (this._storeInt((_33_ + 12), (sqlite3ExprListDup((this._loadInt((_33_ + 240))), (this._loadInt(((this._loadInt((this._loadInt(((this._loadInt((this._loadInt((_33_ + 356))))) + 12))))) + 16))), 0)))));
                                        if ((this._loadInt((_33_ + 12))) == 0) {
                                            break label$69;
                                        }
                                        if ((this._loadInt8u(((this._loadInt((_33_ + 240))) + 30))) != 0) {
                                            break label$69;
                                        }
                                        this._storeInt8(((this._loadInt(((_32_ = this._loadInt((_33_ + 12))) + 12))) + 12), (((this._loadInt8u((_33_ + 11))) != 1) ? 1 : 0));
                                        this._storeInt8((this._loadInt((this._loadInt((_32_ + 12))))), 152);
                                    }
                                    while (false);
                                    resetAccumulator((this._loadInt((_33_ + 360))), (_33_ + 248));
                                    if ((this._storeInt((_33_ + 340), (sqlite3WhereBegin((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 324))), (this._loadInt((_33_ + 320))), (_33_ + 12), (this._loadInt8u((_33_ + 11))))))) == 0) {
                                        break label$25;
                                    }
                                    updateAccumulator((this._loadInt((_33_ + 360))), (_33_ + 248));
                                    label$70:
                                    do {
                                        if ((this._loadInt((_33_ + 12))) != 0) {
                                            break label$70;
                                        }
                                        if ((this._loadInt8u((_33_ + 11))) == 0) {
                                            break label$70;
                                        }
                                        sqlite3VdbeAddOp2((this._loadInt((_33_ + 336))), 1, 0, (this._loadInt(((this._loadInt((_33_ + 340))) + 20))));
                                    }
                                    while (false);
                                    sqlite3WhereEnd((this._loadInt((_33_ + 340))));
                                    finalizeAggFunctions((this._loadInt((_33_ + 360))), (_33_ + 248));
                                }
                                while (false);
                                _32_ = this._storeInt((_33_ + 316), 0);
                                sqlite3ExprIfFalse((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 308))), (this._loadInt((_33_ + 120))), 8);
                                selectInnerLoop((this._loadInt((_33_ + 360))), (_31_ = this._loadInt((_33_ + 356))), (this._loadInt(_31_)), _32_, _32_, _32_, -1, (this._loadInt((_33_ + 352))), (_31_ = this._loadInt((_33_ + 120))), _31_);
                                sqlite3ExprListDelete((this._loadInt((_33_ + 240))), (this._loadInt((_33_ + 44))));
                            }
                            while (false);
                            sqlite3VdbeResolveLabel((this._loadInt((_33_ + 336))), (this._loadInt((_33_ + 120))));
                        }
                        while (false);
                        label$71:
                        do {
                            if ((this._loadInt((_33_ + 300))) < 0) {
                                break label$71;
                            }
                            explainTempTable((this._loadInt((_33_ + 360))), 47344);
                        }
                        while (false);
                        label$72:
                        do {
                            if ((this._loadInt((_33_ + 316))) == 0) {
                                break label$72;
                            }
                            explainTempTable((this._loadInt((_33_ + 360))), 47376);
                            generateSortTail((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 356))), (this._loadInt((_33_ + 336))), (this._loadInt((this._loadInt((_33_ + 328))))), (this._loadInt((_33_ + 352))));
                        }
                        while (false);
                        sqlite3VdbeResolveLabel((this._loadInt((_33_ + 336))), (this._loadInt((_33_ + 244))));
                        this._storeInt((_33_ + 296), 0);
                        break label$5;
                    }
                    while (false);
                    sqlite3ExprListDelete((this._loadInt((_33_ + 240))), (this._loadInt((_33_ + 44))));
                    break label$5;
                }
                while (false);
                _32_ = this._storeInt((_33_ + 296), (multiSelect((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 356))), (this._loadInt((_33_ + 352))))));
                this._storeInt(((this._loadInt((_33_ + 360))) + 552), (this._loadInt((_33_ + 236))));
                this._storeInt((_33_ + 364), _32_);
                break label$0;
            }
            while (false);
            this._storeInt(((this._loadInt((_33_ + 360))) + 552), (this._loadInt((_33_ + 236))));
            label$73:
            do {
                if ((this._loadInt((_33_ + 296))) != 0) {
                    break label$73;
                }
                if ((this._loadInt8u((this._loadInt((_33_ + 352))))) != 5) {
                    break label$73;
                }
                generateColumnNames((this._loadInt((_33_ + 360))), (this._loadInt((_33_ + 324))), (this._loadInt((_33_ + 328))));
            }
            while (false);
            sqlite3DbFree((this._loadInt((_33_ + 240))), (this._loadInt((_33_ + 264))));
            sqlite3DbFree((this._loadInt((_33_ + 240))), (this._loadInt((_33_ + 280))));
            this._storeInt((_33_ + 364), (this._loadInt((_33_ + 296))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 364));
        this._storeInt((0 + 4), (_33_ + 368));
        return _32_;
    }

    @Override()
    public final int sqlite3SelectNew(
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
        this._storeInt(((_31_0 = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 144))) + 140), _30_);
        this._storeInt((_31_0 + 136), _31_);
        this._storeInt((_31_0 + 132), _32_);
        this._storeInt((_31_0 + 128), _33_);
        this._storeInt((_31_0 + 124), _34_);
        this._storeInt((_31_0 + 120), _35_);
        this._storeInt((_31_0 + 116), _36_);
        this._storeInt((_31_0 + 112), _37_);
        this._storeInt((_31_0 + 108), _38_);
        this._storeInt((_31_0 + 104), _39_);
        label$0:
        do {
            if ((this._storeInt((_31_0 + 100), (sqlite3DbMallocZero((this._storeInt((_31_0 + 12), (this._loadInt((this._loadInt((_31_0 + 140))))))), 80)))) != 0) {
                break label$0;
            }
            this._storeInt((_31_0 + 100), (_31_0 + 16));
            memset((_31_0 + 16), 0, 80);
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_31_0 + 136))) != 0) {
                break label$1;
            }
            this._storeInt((_31_0 + 136), (sqlite3ExprListAppend((this._loadInt((_31_0 + 140))), 0, (sqlite3Expr((this._loadInt((_31_0 + 12))), 113, 0)))));
        }
        while (false);
        this._storeInt((this._loadInt((_31_0 + 100))), (this._loadInt((_31_0 + 136))));
        this._storeInt(((this._loadInt((_31_0 + 100))) + 8), (this._loadInt((_31_0 + 132))));
        this._storeInt(((this._loadInt((_31_0 + 100))) + 12), (this._loadInt((_31_0 + 128))));
        this._storeInt(((this._loadInt((_31_0 + 100))) + 16), (this._loadInt((_31_0 + 124))));
        this._storeInt(((this._loadInt((_31_0 + 100))) + 20), (this._loadInt((_31_0 + 120))));
        this._storeInt(((this._loadInt((_31_0 + 100))) + 24), (this._loadInt((_31_0 + 116))));
        this._storeInt16(((this._loadInt((_31_0 + 100))) + 6), (((this._loadInt((_31_0 + 112))) != 0) ? 1 : 0));
        this._storeInt8(((this._loadInt((_31_0 + 100))) + 4), 116);
        this._storeInt(((this._loadInt((_31_0 + 100))) + 40), (this._loadInt((_31_0 + 108))));
        this._storeInt(((this._loadInt((_31_0 + 100))) + 44), (this._loadInt((_31_0 + 104))));
        _39_ = this._storeInt(((this._loadInt((_31_0 + 100))) + 56), -1);
        this._storeInt(((this._loadInt((_31_0 + 100))) + 60), _39_);
        this._storeInt(((this._loadInt((_31_0 + 100))) + 64), _39_);
        label$2:
        do {
            if ((this._loadInt8u(((this._loadInt((_31_0 + 12))) + 30))) == 0) {
                break label$2;
            }
            clearSelect((this._loadInt((_31_0 + 12))), (this._loadInt((_31_0 + 100))));
            label$3:
            do {
                if ((this._loadInt((_31_0 + 100))) == (_31_0 + 16)) {
                    break label$3;
                }
                sqlite3DbFree((this._loadInt((_31_0 + 12))), (this._loadInt((_31_0 + 100))));
            }
            while (false);
            this._storeInt((_31_0 + 100), 0);
        }
        while (false);
        _39_ = this._loadInt((_31_0 + 100));
        this._storeInt((0 + 4), (_31_0 + 144));
        return _39_;
    }

    @Override()
    public final int sqlite3ExprListAppend(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        this._storeInt((_33_ + 12), (this._loadInt((this._loadInt((_33_ + 24))))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_33_ + 20))) != 0) {
                        break label$2;
                    }
                    if ((this._storeInt((_33_ + 20), (sqlite3DbMallocZero((this._loadInt((_33_ + 12))), 16)))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                label$3:
                do {
                    if ((this._loadInt(((_32_ = this._loadInt((_33_ + 20))) + 4))) > (this._loadInt(_32_))) {
                        break label$3;
                    }
                    _32_ = this._storeInt((_33_ + 4), (((this._loadInt(((this._loadInt((_33_ + 20))) + 4))) << 1) + 4));
                    if ((this._storeInt((_33_ + 8), (sqlite3DbRealloc((this._loadInt((_33_ + 12))), (this._loadInt(((this._loadInt((_33_ + 20))) + 12))), (_32_ * 20))))) == 0) {
                        break label$1;
                    }
                    _32_ = this._storeInt(((this._loadInt((_33_ + 20))) + 12), (this._loadInt((_33_ + 8))));
                    _32_ = sqlite3DbMallocSize((this._loadInt((_33_ + 12))), _32_);
                    this._storeInt(((this._loadInt((_33_ + 20))) + 4), (_32_ / 20));
                }
                while (false);
                this._storeInt((_32_ = this._loadInt((_33_ + 20))), ((_31_ = this._loadInt(_32_)) + 1));
                memset((this._storeInt(_33_, ((this._loadInt((_32_ + 12))) + (_31_ * 20)))), 0, 20);
                this._storeInt((this._loadInt(_33_)), (this._loadInt((_33_ + 16))));
                this._storeInt((_33_ + 28), (this._loadInt((_33_ + 20))));
                break label$0;
            }
            while (false);
            sqlite3ExprDelete((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 16))));
            sqlite3ExprListDelete((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 20))));
            this._storeInt((_33_ + 28), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final void sqlite3ExprListSetName(int _30_, int _31_, int _32_, int _33_)
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
            this._storeInt((_34_ + 12), (((this._loadInt(((_33_ = this._loadInt((_34_ + 24))) + 12))) + ((this._loadInt(_33_)) * 20)) + -20));
            _33_ = sqlite3DbStrNDup((this._loadInt((this._loadInt((_34_ + 28))))), (this._loadInt((_33_ = this._loadInt((_34_ + 20))))), (this._loadInt((_33_ + 4))));
            this._storeInt(((this._loadInt((_34_ + 12))) + 4), _33_);
            if ((this._loadInt((_34_ + 16))) == 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_34_ + 12))) + 4))) == 0) {
                break label$0;
            }
            sqlite3Dequote((this._loadInt(((this._loadInt((_34_ + 12))) + 4))));
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final void sqlite3ExprListSetSpan(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 16), (this._loadInt((this._loadInt((_33_ + 28))))));
        label$0:
        do {
            if ((this._loadInt((_33_ + 24))) == 0) {
                break label$0;
            }
            this._storeInt((_33_ + 12), ((_32_ = (this._loadInt(((_32_ = this._loadInt((_33_ + 24))) + 12))) + ((this._loadInt(_32_)) * 20)) + -20));
            sqlite3DbFree((this._loadInt((_33_ + 16))), (this._loadInt((_32_ + -12))));
            _32_ = sqlite3DbStrNDup((this._loadInt((_33_ + 16))), (_31_ = this._loadInt(((_32_ = this._loadInt((_33_ + 20))) + 4))), ((this._loadInt((_32_ + 8))) - _31_));
            this._storeInt(((this._loadInt((_33_ + 12))) + 8), _32_);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int sqlite3Expr(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 8), (this._storeInt((_33_ + 20), _32_)));
        _32_ = 0;
        label$0:
        do {
            if ((this._loadInt((_33_ + 20))) == 0) {
                break label$0;
            }
            _32_ = sqlite3Strlen30((this._loadInt((_33_ + 20))));
        }
        while (false);
        this._storeInt((_33_ + 12), _32_);
        _32_ = sqlite3ExprAlloc((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 24))), (_33_ + 8), 0);
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final void sqlite3SrcListShiftJoinType(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) == 0) {
                break label$0;
            }
            if ((this._loadInt((_32_ + 12))) == -8) {
                break label$0;
            }
            this._storeInt((_32_ + 8), ((this._loadInt16s((this._loadInt((_32_ + 12))))) + -1));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 8))) < 1) {
                        break label$2;
                    }
                    this._storeInt8(((_31_ = (this._loadInt((_32_ + 12))) + ((_30_ = this._loadInt((_32_ + 8))) * 56)) + 29), (this._loadInt8u((_31_ + -27))));
                    this._storeInt((_32_ + 8), (_30_ + -1));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt8(((this._loadInt((_32_ + 12))) + 29), 0);
        }
        while (false);
        return;
    }

    @Override()
    public final int sqlite3SrcListAppendFromTerm(
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
        this._storeInt(((_38_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_38_ + 36), _31_);
        this._storeInt((_38_ + 32), _32_);
        this._storeInt((_38_ + 28), _33_);
        this._storeInt((_38_ + 24), _34_);
        this._storeInt((_38_ + 20), _35_);
        this._storeInt((_38_ + 16), _36_);
        this._storeInt((_38_ + 12), _37_);
        this._storeInt((_38_ + 4), (this._loadInt((this._loadInt((_38_ + 40))))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_38_ + 36))) != 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._loadInt((_38_ + 16))) != 0) {
                            break label$3;
                        }
                        if ((this._loadInt((_38_ + 12))) == 0) {
                            break label$2;
                        }
                    }
                    while (false);
                    _37_ = this._loadInt((_38_ + 40));
                    _temp$0 = 47216;
                    _temp$1 = 47232;
                    _temp$2 = ((this._loadInt((_38_ + 16))) != 0) ? _temp$0 : _temp$1;
                    this._storeInt(_38_, _temp$2);
                    sqlite3ErrorMsg(_37_, 47248, _38_);
                    break label$1;
                }
                while (false);
                if ((this._storeInt((_38_ + 36), (sqlite3SrcListAppend((this._loadInt((_38_ + 4))), (this._loadInt((_38_ + 36))), (this._loadInt((_38_ + 32))), (this._loadInt((_38_ + 28))))))) == 0) {
                    break label$1;
                }
                if ((this._loadInt16s((this._loadInt((_38_ + 36))))) == 0) {
                    break label$1;
                }
                this._storeInt((_38_ + 8), (((_37_ = this._loadInt((_38_ + 36))) + ((this._loadInt16s(_37_)) * 56)) + -48));
                label$4:
                do {
                    if ((this._loadInt(((this._loadInt((_38_ + 24))) + 4))) == 0) {
                        break label$4;
                    }
                    _37_ = sqlite3NameFromToken((this._loadInt((_38_ + 4))), (this._loadInt((_38_ + 24))));
                    this._storeInt(((this._loadInt((_38_ + 8))) + 8), _37_);
                }
                while (false);
                this._storeInt(((_37_ = this._loadInt((_38_ + 8))) + 28), (this._loadInt((_38_ + 16))));
                this._storeInt((_37_ + 16), (this._loadInt((_38_ + 20))));
                this._storeInt(((this._loadInt((_38_ + 8))) + 32), (this._loadInt((_38_ + 12))));
                this._storeInt((_38_ + 44), (this._loadInt((_38_ + 36))));
                break label$0;
            }
            while (false);
            sqlite3ExprDelete((this._loadInt((_38_ + 4))), (this._loadInt((_38_ + 16))));
            sqlite3IdListDelete((this._loadInt((_38_ + 4))), (this._loadInt((_38_ + 12))));
            sqlite3SelectDelete((this._loadInt((_38_ + 4))), (this._loadInt((_38_ + 20))));
            this._storeInt((_38_ + 44), 0);
        }
        while (false);
        _37_ = this._loadInt((_38_ + 44));
        this._storeInt((0 + 4), (_38_ + 48));
        return _37_;
    }

    @Override()
    public final void sqlite3SrcListIndexedBy(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        label$0:
        do {
            if ((this._loadInt((_33_ + 8))) == 0) {
                break label$0;
            }
            if ((this._loadInt16s((this._loadInt((_33_ + 8))))) < 1) {
                break label$0;
            }
            this._storeInt(_33_, (((_32_ = this._loadInt((_33_ + 8))) + ((this._loadInt16s(_32_)) * 56)) + -48));
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt(((this._loadInt((_33_ + 4))) + 4))) != 1) {
                        break label$2;
                    }
                    if ((this._loadInt((this._loadInt((_33_ + 4))))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                _32_ = sqlite3NameFromToken((this._loadInt((this._loadInt((_33_ + 12))))), (this._loadInt((_33_ + 4))));
                this._storeInt(((this._loadInt(_33_)) + 48), _32_);
                break label$0;
            }
            while (false);
            this._storeInt8(((this._loadInt(_33_)) + 22), 1);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int sqlite3SrcListAppend(int _30_, int _31_, int _32_, int _33_)
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
                    if ((this._loadInt((_34_ + 20))) != 0) {
                        break label$2;
                    }
                    if ((this._storeInt((_34_ + 20), (sqlite3DbMallocZero((this._loadInt((_34_ + 24))), 64)))) == 0) {
                        break label$1;
                    }
                    this._storeInt16(((this._loadInt((_34_ + 20))) + 2), 1);
                }
                while (false);
                this._storeInt((_34_ + 20), (sqlite3SrcListEnlarge((this._loadInt((_34_ + 24))), (_33_ = this._loadInt((_34_ + 20))), 1, (this._loadInt16s(_33_)))));
                label$3:
                do {
                    if ((this._loadInt8u(((this._loadInt((_34_ + 24))) + 30))) == 0) {
                        break label$3;
                    }
                    sqlite3SrcListDelete((this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))));
                    this._storeInt((_34_ + 28), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_34_ + 8), (((_33_ = this._loadInt((_34_ + 20))) + ((this._loadInt16s(_33_)) * 56)) + -48));
                label$4:
                do {
                    if ((this._loadInt((_34_ + 12))) == 0) {
                        break label$4;
                    }
                    if ((this._loadInt((this._loadInt((_34_ + 12))))) != 0) {
                        break label$4;
                    }
                    this._storeInt((_34_ + 12), 0);
                }
                while (false);
                label$5:
                do {
                    if ((this._loadInt((_34_ + 12))) == 0) {
                        break label$5;
                    }
                    this._storeInt((_34_ + 4), (this._loadInt((_34_ + 12))));
                    this._storeInt((_34_ + 12), (this._loadInt((_34_ + 16))));
                    this._storeInt((_34_ + 16), (this._loadInt((_34_ + 4))));
                }
                while (false);
                _33_ = sqlite3NameFromToken((this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 16))));
                this._storeInt(((this._loadInt((_34_ + 8))) + 4), _33_);
                _33_ = sqlite3NameFromToken((this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 12))));
                this._storeInt((this._loadInt((_34_ + 8))), _33_);
                this._storeInt((_34_ + 28), (this._loadInt((_34_ + 20))));
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
    public final int sqlite3JoinType(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_34_ + 56), _31_);
        this._storeInt((_34_ + 52), _32_);
        this._storeInt((_34_ + 48), _33_);
        _33_ = this._storeInt((_34_ + 44), 0);
        this._storeInt((_34_ + 32), (this._loadInt((_34_ + 56))));
        this._storeInt((_34_ + 36), (this._loadInt((_34_ + 52))));
        _31_ = this._loadInt((_34_ + 48));
        _32_ = this._storeInt((_34_ + 24), _33_);
        this._storeInt((_34_ + 40), _31_);
        label$0:
        do {
            label$2:
            do {
                label$1:
                while (true) {
                    _33_ = 0;
                    label$3:
                    do {
                        if ((this._loadInt((_34_ + 24))) > 2) {
                            break label$3;
                        }
                        _33_ = ((this._loadInt(((_34_ + 32) + ((this._loadInt((_34_ + 24))) << 2)))) != _32_) ? 1 : 0;
                    }
                    while (false);
                    if (_33_ == 0) {
                        break label$0;
                    }
                    this._storeInt((_34_ + 28), (this._loadInt(((_34_ + 32) + ((this._loadInt((_34_ + 24))) << 2)))));
                    this._storeInt((_34_ + 20), _32_);
                    label$4:
                    do {
                        label$6:
                        do {
                            label$5:
                            while (true) {
                                if ((this._loadInt((_34_ + 20))) > 6) {
                                    break label$4;
                                }
                                label$7:
                                do {
                                    if ((this._loadInt(((this._loadInt((_34_ + 28))) + 4))) != (this._loadInt8u((((this._loadInt((_34_ + 20))) * 3) + 47025)))) {
                                        break label$7;
                                    }
                                    if ((sqlite3_strnicmp((this._loadInt((_33_ = this._loadInt((_34_ + 28))))), ((this._loadInt8u((((this._loadInt((_34_ + 20))) * 3) + 47024))) + 47056), (this._loadInt((_33_ + 4))))) == 0) {
                                        break label$6;
                                    }
                                }
                                while (false);
                                this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) + 1));
                                continue label$5;
                            }
                        }
                        while (false);
                        this._storeInt((_34_ + 44), ((this._loadInt((_34_ + 44))) | (this._loadInt8u((((this._loadInt((_34_ + 20))) * 3) + 47026)))));
                    }
                    while (false);
                    if ((this._loadInt((_34_ + 20))) >= 7) {
                        break label$2;
                    }
                    this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + 1));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt((_34_ + 44), ((this._loadInt((_34_ + 44))) | 64));
        }
        while (false);
        label$8:
        do {
            label$9:
            do {
                label$10:
                do {
                    if (((this._loadInt((_34_ + 44))) & 33) == 33) {
                        break label$10;
                    }
                    if (((this._loadInt8u((_34_ + 44))) & 64) == 0) {
                        break label$9;
                    }
                }
                while (false);
                this._storeInt((_34_ + 16), 41504);
                label$11:
                do {
                    if ((this._loadInt((_34_ + 48))) != 0) {
                        break label$11;
                    }
                    this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) + 1));
                }
                while (false);
                this._storeInt((_34_ + 12), (this._loadInt((_34_ + 48))));
                this._storeInt((_34_ + 8), (this._loadInt((_34_ + 16))));
                this._storeInt((_34_ + 4), (this._loadInt((_34_ + 52))));
                _33_ = this._loadInt((_34_ + 60));
                this._storeInt(_34_, (this._loadInt((_34_ + 56))));
                sqlite3ErrorMsg(_33_, 47104, _34_);
                this._storeInt((_34_ + 44), 1);
                break label$8;
            }
            while (false);
            if (((this._loadInt8u((_34_ + 44))) & 32) == 0) {
                break label$8;
            }
            if (((this._loadInt((_34_ + 44))) & 24) == 8) {
                break label$8;
            }
            sqlite3ErrorMsg((this._loadInt((_34_ + 60))), 47152, 0);
            this._storeInt((_34_ + 44), 1);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 64));
        return _33_;
    }

    @Override()
    public final void sqlite3DeleteFrom(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 144))) + 140), _30_);
        this._storeInt((_33_ + 136), _31_);
        this._storeInt((_33_ + 132), _32_);
        _32_ = this._storeInt((_33_ + 112), 0);
        this._storeInt((_33_ + 32), -1);
        memset((_33_ + 80), _32_, 8);
        this._storeInt((_33_ + 92), (this._loadInt((this._loadInt((_33_ + 140))))));
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_33_ + 140))) + 64))) != 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_33_ + 92))) + 30))) != 0) {
                break label$0;
            }
            if ((this._storeInt((_33_ + 124), (sqlite3SrcListLookup((this._loadInt((_33_ + 140))), (this._loadInt((_33_ + 136))))))) == 0) {
                break label$0;
            }
            this._storeInt((_33_ + 20), (sqlite3TriggersExist((this._loadInt((_33_ + 140))), (this._loadInt((_33_ + 124))), 106, 0, 0)));
            this._storeInt((_33_ + 24), (((this._loadInt(((this._loadInt((_33_ + 124))) + 28))) != 0) ? 1 : 0));
            if ((sqlite3ViewGetColumnNames((this._loadInt((_33_ + 140))), (this._loadInt((_33_ + 124))))) != 0) {
                break label$0;
            }
            if ((sqlite3IsReadOnly((this._loadInt((_33_ + 140))), (this._loadInt((_33_ + 124))), (((this._loadInt((_33_ + 20))) != 0) ? 1 : 0))) != 0) {
                break label$0;
            }
            _32_ = this._storeInt((_33_ + 36), (sqlite3SchemaToIndex((this._loadInt((_33_ + 92))), (this._loadInt(((this._loadInt((_33_ + 124))) + 68))))));
            _32_ = this._storeInt((_33_ + 120), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 92))) + 8))) + (_32_ << 4)))));
            if ((this._storeInt((_33_ + 28), (sqlite3AuthCheck((this._loadInt((_33_ + 140))), 9, (this._loadInt((this._loadInt((_33_ + 124))))), 0, _32_)))) == 1) {
                break label$0;
            }
            this._storeInt(((_32_ = this._loadInt((_33_ + 140))) + 68), ((_32_ = this._loadInt((_32_ + 68))) + 1));
            this._storeInt((_33_ + 96), (this._storeInt(((this._loadInt((_33_ + 136))) + 32), _32_)));
            this._storeInt((_33_ + 100), (this._loadInt(((this._loadInt((_33_ + 124))) + 16))));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_33_ + 100))) == 0) {
                        break label$2;
                    }
                    this._storeInt(((_32_ = this._loadInt((_33_ + 140))) + 68), ((this._loadInt((_32_ + 68))) + 1));
                    this._storeInt((_33_ + 100), (this._loadInt(((this._loadInt((_33_ + 100))) + 32))));
                    continue label$1;
                }
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((_33_ + 24))) == 0) {
                    break label$3;
                }
                sqlite3AuthContextPush((this._loadInt((_33_ + 140))), (_33_ + 80), (this._loadInt((this._loadInt((_33_ + 124))))));
            }
            while (false);
            if ((this._storeInt((_33_ + 128), (sqlite3GetVdbe((this._loadInt((_33_ + 140))))))) == 0) {
                break label$0;
            }
            label$4:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 140))) + 19))) != 0) {
                    break label$4;
                }
                sqlite3VdbeCountChanges((this._loadInt((_33_ + 128))));
            }
            while (false);
            sqlite3BeginWriteOperation((this._loadInt((_33_ + 140))), 1, (this._loadInt((_33_ + 36))));
            label$5:
            do {
                if ((this._loadInt((_33_ + 24))) == 0) {
                    break label$5;
                }
                sqlite3MaterializeView((this._loadInt((_33_ + 140))), (this._loadInt((_33_ + 124))), (this._loadInt((_33_ + 132))), (this._loadInt((_33_ + 96))));
            }
            while (false);
            memset((_33_ + 40), 0, 36);
            this._storeInt((_33_ + 40), (this._loadInt((_33_ + 140))));
            this._storeInt((_33_ + 44), (this._loadInt((_33_ + 136))));
            if ((sqlite3ResolveExprNames((_33_ + 40), (this._loadInt((_33_ + 132))))) != 0) {
                break label$0;
            }
            label$6:
            do {
                if (((this._loadInt8u(((this._loadInt((_33_ + 92))) + 13))) & 16) == 0) {
                    break label$6;
                }
                _32_ = this._storeInt((_33_ + 32), (this._storeInt(((_32_ = this._loadInt((_33_ + 140))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
                sqlite3VdbeAddOp2((this._loadInt((_33_ + 128))), 7, 0, _32_);
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
                                if ((this._loadInt((_33_ + 28))) != 0) {
                                    break label$11;
                                }
                                if ((this._loadInt((_33_ + 132))) != 0) {
                                    break label$11;
                                }
                                if ((this._loadInt((_33_ + 20))) != 0) {
                                    break label$11;
                                }
                                if (((this._loadInt8u(((this._loadInt((_33_ + 124))) + 34))) & 16) != 0) {
                                    break label$11;
                                }
                                if ((sqlite3FkRequired((this._loadInt((_33_ + 140))), (this._loadInt((_33_ + 124))), 0, 0)) != 0) {
                                    break label$11;
                                }
                                sqlite3VdbeAddOp4((this._loadInt((_33_ + 128))), 96, (this._loadInt(((_32_ = this._loadInt((_33_ + 124))) + 20))), (this._loadInt((_33_ + 36))), (this._loadInt((_33_ + 32))), (this._loadInt(_32_)), -2);
                                this._storeInt((_33_ + 100), (this._loadInt(((this._loadInt((_33_ + 124))) + 16))));
                                break label$10;
                            }
                            while (false);
                            this._storeInt((_33_ + 16), (this._storeInt(((_32_ = this._loadInt((_33_ + 140))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
                            this._storeInt((_33_ + 12), (this._storeInt(((_32_ = this._loadInt((_33_ + 140))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
                            sqlite3VdbeAddOp2((this._loadInt((_33_ + 128))), 10, 0, (this._loadInt((_33_ + 16))));
                            if ((this._storeInt((_33_ + 104), (sqlite3WhereBegin((this._loadInt((_33_ + 140))), (this._loadInt((_33_ + 136))), (this._loadInt((_33_ + 132))), 0, 8)))) == 0) {
                                break label$0;
                            }
                            _32_ = this._storeInt((_33_ + 8), (sqlite3ExprCodeGetColumn((this._loadInt((_33_ + 140))), (this._loadInt((_33_ + 124))), -1, (this._loadInt((_33_ + 96))), (this._loadInt((_33_ + 12))))));
                            sqlite3VdbeAddOp2((this._loadInt((_33_ + 128))), 105, (this._loadInt((_33_ + 16))), _32_);
                            label$12:
                            do {
                                if (((this._loadInt8u(((this._loadInt((_33_ + 92))) + 13))) & 16) == 0) {
                                    break label$12;
                                }
                                sqlite3VdbeAddOp2((this._loadInt((_33_ + 128))), 20, (this._loadInt((_33_ + 32))), 1);
                            }
                            while (false);
                            sqlite3WhereEnd((this._loadInt((_33_ + 104))));
                            this._storeInt((_33_ + 116), (sqlite3VdbeMakeLabel((this._loadInt((_33_ + 128))))));
                            label$13:
                            do {
                                if ((this._loadInt((_33_ + 24))) != 0) {
                                    break label$13;
                                }
                                sqlite3OpenTableAndIndices((this._loadInt((_33_ + 140))), (this._loadInt((_33_ + 124))), (this._loadInt((_33_ + 96))), 39);
                            }
                            while (false);
                            this._storeInt((_33_ + 112), (sqlite3VdbeAddOp3((this._loadInt((_33_ + 128))), 106, (this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 116))), (this._loadInt((_33_ + 12))))));
                            if (((this._loadInt8u(((this._loadInt((_33_ + 124))) + 34))) & 16) == 0) {
                                break label$9;
                            }
                            this._storeInt((_33_ + 4), (sqlite3GetVTable((this._loadInt((_33_ + 92))), (this._loadInt((_33_ + 124))))));
                            sqlite3VtabMakeWritable((this._loadInt((_33_ + 140))), (this._loadInt((_33_ + 124))));
                            sqlite3VdbeAddOp4((this._loadInt((_33_ + 128))), 133, 0, 1, (this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 4))), -10);
                            sqlite3VdbeChangeP5((this._loadInt((_33_ + 128))), 2);
                            sqlite3MayAbort((this._loadInt((_33_ + 140))));
                            break label$8;
                        }
                        while (false);
                        label$14:
                        while (true) {
                            if ((this._loadInt((_33_ + 100))) == 0) {
                                break label$7;
                            }
                            sqlite3VdbeAddOp2((this._loadInt((_33_ + 128))), 96, (this._loadInt(((this._loadInt((_33_ + 100))) + 20))), (this._loadInt((_33_ + 36))));
                            this._storeInt((_33_ + 100), (this._loadInt(((this._loadInt((_33_ + 100))) + 32))));
                            continue label$14;
                        }
                    }
                    while (false);
                    _32_ = this._storeInt(_33_, (((this._loadInt8u(((this._loadInt((_33_ + 140))) + 19))) == 0) ? 1 : 0));
                    sqlite3GenerateRowDelete((this._loadInt((_33_ + 140))), (this._loadInt((_33_ + 124))), (this._loadInt((_33_ + 96))), (this._loadInt((_33_ + 12))), _32_, (this._loadInt((_33_ + 20))), 99);
                }
                while (false);
                sqlite3VdbeAddOp2((this._loadInt((_33_ + 128))), 1, 0, (this._loadInt((_33_ + 112))));
                sqlite3VdbeResolveLabel((this._loadInt((_33_ + 128))), (this._loadInt((_33_ + 116))));
                if ((this._loadInt((_33_ + 24))) != 0) {
                    break label$7;
                }
                if (((this._loadInt8u(((this._loadInt((_33_ + 124))) + 34))) & 16) != 0) {
                    break label$7;
                }
                _32_ = this._storeInt((_33_ + 108), 1);
                this._storeInt((_33_ + 100), (this._loadInt(((this._loadInt((_33_ + 124))) + 16))));
                label$17:
                do {
                    label$16:
                    while (true) {
                        if ((this._loadInt((_33_ + 100))) == 0) {
                            break label$17;
                        }
                        sqlite3VdbeAddOp2((this._loadInt((_33_ + 128))), 43, ((this._loadInt((_33_ + 96))) + (this._loadInt((_33_ + 108)))), (this._loadInt(((this._loadInt((_33_ + 100))) + 20))));
                        this._storeInt((_33_ + 108), ((this._loadInt((_33_ + 108))) + _32_));
                        this._storeInt((_33_ + 100), (this._loadInt(((this._loadInt((_33_ + 100))) + 32))));
                        continue label$16;
                    }
                }
                while (false);
                sqlite3VdbeAddOp1((this._loadInt((_33_ + 128))), 43, (this._loadInt((_33_ + 96))));
            }
            while (false);
            label$18:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 140))) + 19))) != 0) {
                    break label$18;
                }
                if ((this._loadInt(((this._loadInt((_33_ + 140))) + 428))) != 0) {
                    break label$18;
                }
                sqlite3AutoincrementEnd((this._loadInt((_33_ + 140))));
            }
            while (false);
            if (((this._loadInt8u(((this._loadInt((_33_ + 92))) + 13))) & 16) == 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_33_ + 140))) + 19))) != 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_33_ + 140))) + 428))) != 0) {
                break label$0;
            }
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 128))), 16, (this._loadInt((_33_ + 32))), 1);
            sqlite3VdbeSetNumCols((this._loadInt((_33_ + 128))), 1);
            sqlite3VdbeSetColName((this._loadInt((_33_ + 128))), 0, 0, 47008, 0);
        }
        while (false);
        sqlite3AuthContextPop((_33_ + 80));
        sqlite3SrcListDelete((this._loadInt((_33_ + 92))), (this._loadInt((_33_ + 136))));
        sqlite3ExprDelete((this._loadInt((_33_ + 92))), (this._loadInt((_33_ + 132))));
        this._storeInt((0 + 4), (_33_ + 144));
        return;
    }

    @Override()
    public final void sqlite3ExprListCheckLength(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 16), (this._loadInt(((this._loadInt((this._loadInt((_33_ + 28))))) + 80))));
        label$0:
        do {
            if ((this._loadInt((_33_ + 24))) == 0) {
                break label$0;
            }
            if ((this._loadInt((this._loadInt((_33_ + 24))))) <= (this._loadInt((_33_ + 16)))) {
                break label$0;
            }
            _32_ = this._loadInt((_33_ + 28));
            this._storeInt(_33_, (this._loadInt((_33_ + 20))));
            sqlite3ErrorMsg(_32_, 46976, _33_);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void sqlite3Update(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        int _36_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 208))) + 204), _30_);
        this._storeInt((_35_ + 200), _31_);
        this._storeInt((_35_ + 196), _32_);
        this._storeInt((_35_ + 192), _33_);
        this._storeInt((_35_ + 188), _34_);
        memset((_35_ + 120), (this._storeInt((_35_ + 28), (this._storeInt((_35_ + 32), (this._storeInt((_35_ + 48), (this._storeInt((_35_ + 128), (this._storeInt((_35_ + 132), (this._storeInt((_35_ + 140), (this._storeInt((_35_ + 144), (this._storeInt((_35_ + 172), 0)))))))))))))))), 8);
        this._storeInt((_35_ + 148), (this._loadInt((this._loadInt((_35_ + 204))))));
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_35_ + 204))) + 64))) != 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_35_ + 148))) + 30))) != 0) {
                break label$0;
            }
            if ((this._storeInt((_35_ + 176), (sqlite3SrcListLookup((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 200))))))) == 0) {
                break label$0;
            }
            this._storeInt((_35_ + 76), (sqlite3SchemaToIndex((this._loadInt((this._loadInt((_35_ + 204))))), (this._loadInt(((this._loadInt((_35_ + 176))) + 68))))));
            this._storeInt((_35_ + 60), (sqlite3TriggersExist((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 176))), 107, (this._loadInt((_35_ + 196))), (_35_ + 56))));
            this._storeInt((_35_ + 64), (((this._loadInt(((this._loadInt((_35_ + 176))) + 28))) != 0) ? 1 : 0));
            if ((sqlite3ViewGetColumnNames((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 176))))) != 0) {
                break label$0;
            }
            if ((sqlite3IsReadOnly((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 176))), (this._loadInt((_35_ + 56))))) != 0) {
                break label$0;
            }
            if ((this._storeInt((_35_ + 140), (sqlite3DbMallocRaw((this._loadInt((_35_ + 148))), ((this._loadInt(((this._loadInt((_35_ + 176))) + 8))) << 2))))) == 0) {
                break label$0;
            }
            this._storeInt((_35_ + 184), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_35_ + 184))) >= (this._loadInt(((this._loadInt((_35_ + 176))) + 8)))) {
                        break label$2;
                    }
                    this._storeInt(((this._loadInt((_35_ + 140))) + ((this._loadInt((_35_ + 184))) << 2)), -1);
                    this._storeInt((_35_ + 184), ((this._loadInt((_35_ + 184))) + 1));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt(((_34_ = this._loadInt((_35_ + 204))) + 68), ((_34_ = this._loadInt((_34_ + 68))) + 1));
            this._storeInt((_35_ + 152), _34_);
            this._storeInt(((this._loadInt((_35_ + 200))) + 32), _34_);
            this._storeInt((_35_ + 160), (this._loadInt(((this._loadInt((_35_ + 176))) + 16))));
            label$4:
            do {
                label$3:
                while (true) {
                    if ((this._loadInt((_35_ + 160))) == 0) {
                        break label$4;
                    }
                    this._storeInt(((_34_ = this._loadInt((_35_ + 204))) + 68), ((this._loadInt((_34_ + 68))) + 1));
                    this._storeInt((_35_ + 160), (this._loadInt(((this._loadInt((_35_ + 160))) + 32))));
                    continue label$3;
                }
            }
            while (false);
            memset((_35_ + 80), 0, 36);
            this._storeInt((_35_ + 80), (this._loadInt((_35_ + 204))));
            _34_ = this._loadInt((_35_ + 200));
            _33_ = this._storeInt((_35_ + 136), 0);
            this._storeInt((_35_ + 84), _34_);
            this._storeInt((_35_ + 184), _33_);
            label$5:
            do {
                label$6:
                do {
                    label$8:
                    do {
                        label$7:
                        while (true) {
                            if ((this._loadInt((_35_ + 184))) >= (this._loadInt((this._loadInt((_35_ + 196)))))) {
                                break label$8;
                            }
                            if ((sqlite3ResolveExprNames((_35_ + 80), (this._loadInt(((this._loadInt(((this._loadInt((_35_ + 196))) + 12))) + ((this._loadInt((_35_ + 184))) * 20)))))) != 0) {
                                break label$0;
                            }
                            this._storeInt((_35_ + 180), _33_);
                            label$9:
                            do {
                                label$11:
                                do {
                                    label$10:
                                    while (true) {
                                        if ((this._loadInt((_35_ + 180))) >= (this._loadInt(((this._loadInt((_35_ + 176))) + 8)))) {
                                            break label$9;
                                        }
                                        if ((sqlite3StrICmp((this._loadInt(((this._loadInt(((this._loadInt((_35_ + 176))) + 12))) + ((this._loadInt((_35_ + 180))) * 24)))), (this._loadInt((((this._loadInt(((this._loadInt((_35_ + 196))) + 12))) + ((this._loadInt((_35_ + 184))) * 20)) + 4))))) == 0) {
                                            break label$11;
                                        }
                                        this._storeInt((_35_ + 180), ((this._loadInt((_35_ + 180))) + 1));
                                        continue label$10;
                                    }
                                }
                                while (false);
                                label$12:
                                do {
                                    if ((this._loadInt((_35_ + 180))) != (this._loadInt(((this._loadInt((_35_ + 176))) + 4)))) {
                                        break label$12;
                                    }
                                    this._storeInt((_35_ + 136), 1);
                                    this._storeInt((_35_ + 132), (this._loadInt(((this._loadInt(((this._loadInt((_35_ + 196))) + 12))) + ((this._loadInt((_35_ + 184))) * 20)))));
                                }
                                while (false);
                                this._storeInt(((this._loadInt((_35_ + 140))) + ((this._loadInt((_35_ + 180))) << 2)), (this._loadInt((_35_ + 184))));
                            }
                            while (false);
                            label$13:
                            do {
                                if ((this._loadInt((_35_ + 180))) < (this._loadInt(((this._loadInt((_35_ + 176))) + 8)))) {
                                    break label$13;
                                }
                                if ((sqlite3IsRowid((this._loadInt((((this._loadInt(((this._loadInt((_35_ + 196))) + 12))) + ((this._loadInt((_35_ + 184))) * 20)) + 4))))) == 0) {
                                    break label$6;
                                }
                                this._storeInt((_35_ + 136), 1);
                                this._storeInt((_35_ + 132), (this._loadInt(((this._loadInt(((this._loadInt((_35_ + 196))) + 12))) + ((this._loadInt((_35_ + 184))) * 20)))));
                            }
                            while (false);
                            if ((this._storeInt((_35_ + 24), (sqlite3AuthCheck((this._loadInt((_35_ + 204))), 23, (this._loadInt((_34_ = this._loadInt((_35_ + 176))))), (this._loadInt(((this._loadInt((_34_ + 12))) + ((this._loadInt((_35_ + 180))) * 24)))), (this._loadInt(((this._loadInt(((this._loadInt((_35_ + 148))) + 8))) + ((this._loadInt((_35_ + 76))) << 4)))))))) == 1) {
                                break label$0;
                            }
                            label$14:
                            do {
                                if ((this._loadInt((_35_ + 24))) != 2) {
                                    break label$14;
                                }
                                this._storeInt(((this._loadInt((_35_ + 140))) + ((this._loadInt((_35_ + 180))) << 2)), -1);
                            }
                            while (false);
                            this._storeInt((_35_ + 184), ((this._loadInt((_35_ + 184))) + 1));
                            continue label$7;
                        }
                    }
                    while (false);
                    this._storeInt((_35_ + 68), (sqlite3FkRequired((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 176))), (this._loadInt((_35_ + 140))), (this._loadInt((_35_ + 136))))));
                    this._storeInt((_35_ + 156), 0);
                    this._storeInt((_35_ + 160), (this._loadInt(((this._loadInt((_35_ + 176))) + 16))));
                    label$16:
                    do {
                        label$15:
                        while (true) {
                            if ((this._loadInt((_35_ + 160))) == 0) {
                                break label$16;
                            }
                            this._storeInt((_35_ + 160), (this._loadInt(((this._loadInt((_35_ + 160))) + 32))));
                            this._storeInt((_35_ + 156), ((this._loadInt((_35_ + 156))) + 1));
                            continue label$15;
                        }
                    }
                    while (false);
                    label$17:
                    do {
                        if ((this._loadInt((_35_ + 156))) < 1) {
                            break label$17;
                        }
                        if ((this._storeInt((_35_ + 144), (sqlite3DbMallocRaw((this._loadInt((_35_ + 148))), ((this._loadInt((_35_ + 156))) << 2))))) == 0) {
                            break label$0;
                        }
                    }
                    while (false);
                    _33_ = this._storeInt((_35_ + 180), 0);
                    this._storeInt((_35_ + 160), (this._loadInt(((this._loadInt((_35_ + 176))) + 16))));
                    label$19:
                    do {
                        label$18:
                        while (true) {
                            if ((this._loadInt((_35_ + 160))) == 0) {
                                break label$19;
                            }
                            label$20:
                            do {
                                label$21:
                                do {
                                    label$22:
                                    do {
                                        if ((this._loadInt((_35_ + 68))) != 0) {
                                            break label$22;
                                        }
                                        if ((this._loadInt((_35_ + 136))) == 0) {
                                            break label$21;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_35_ + 20), (this._storeInt(((_34_ = this._loadInt((_35_ + 204))) + 72), ((this._loadInt((_34_ + 72))) + 1))));
                                    break label$20;
                                }
                                while (false);
                                _34_ = this._storeInt((_35_ + 184), (this._storeInt((_35_ + 20), _33_)));
                                label$24:
                                do {
                                    label$23:
                                    while (true) {
                                        if ((this._loadInt((_35_ + 184))) >= (this._loadInt(((this._loadInt((_35_ + 160))) + 4)))) {
                                            break label$20;
                                        }
                                        if ((this._loadInt(((this._loadInt((_35_ + 140))) + ((this._loadInt(((this._loadInt(((this._loadInt((_35_ + 160))) + 8))) + ((this._loadInt((_35_ + 184))) << 2)))) << 2)))) >= _34_) {
                                            break label$24;
                                        }
                                        this._storeInt((_35_ + 184), ((this._loadInt((_35_ + 184))) + 1));
                                        continue label$23;
                                    }
                                }
                                while (false);
                                this._storeInt((_35_ + 20), (this._storeInt(((_34_ = this._loadInt((_35_ + 204))) + 72), ((this._loadInt((_34_ + 72))) + 1))));
                            }
                            while (false);
                            this._storeInt(((this._loadInt((_35_ + 144))) + ((this._loadInt((_35_ + 180))) << 2)), (this._loadInt((_35_ + 20))));
                            this._storeInt((_35_ + 160), (this._loadInt(((this._loadInt((_35_ + 160))) + 32))));
                            this._storeInt((_35_ + 180), ((this._loadInt((_35_ + 180))) + 1));
                            continue label$18;
                        }
                    }
                    while (false);
                    if ((this._storeInt((_35_ + 164), (sqlite3GetVdbe((this._loadInt((_35_ + 204))))))) == 0) {
                        break label$0;
                    }
                    label$25:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_35_ + 204))) + 19))) != 0) {
                            break label$25;
                        }
                        sqlite3VdbeCountChanges((this._loadInt((_35_ + 164))));
                    }
                    while (false);
                    sqlite3BeginWriteOperation((this._loadInt((_35_ + 204))), 1, (this._loadInt((_35_ + 76))));
                    if (((this._loadInt8u(((this._loadInt((_35_ + 176))) + 34))) & 16) == 0) {
                        break label$5;
                    }
                    updateVirtualTable((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 200))), (this._loadInt((_35_ + 176))), (this._loadInt((_35_ + 196))), (this._loadInt((_35_ + 132))), (this._loadInt((_35_ + 140))), (this._loadInt((_35_ + 192))), (this._loadInt((_35_ + 188))));
                    this._storeInt((_35_ + 200), (this._storeInt((_35_ + 192), 0)));
                    break label$0;
                }
                while (false);
                _34_ = this._loadInt((_35_ + 204));
                this._storeInt(_35_, (this._loadInt((((this._loadInt(((this._loadInt((_35_ + 196))) + 12))) + ((this._loadInt((_35_ + 184))) * 20)) + 4))));
                sqlite3ErrorMsg(_34_, 46912, _35_);
                this._storeInt8(((this._loadInt((_35_ + 204))) + 18), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_35_ + 44), (this._storeInt((_35_ + 40), (this._storeInt(((_34_ = this._loadInt((_35_ + 204))) + 72), ((this._loadInt((_34_ + 72))) + 1))))));
            label$26:
            do {
                label$27:
                do {
                    if ((this._loadInt((_35_ + 60))) != 0) {
                        break label$27;
                    }
                    if ((this._loadInt((_35_ + 68))) == 0) {
                        break label$26;
                    }
                }
                while (false);
                this._storeInt((_35_ + 32), ((this._loadInt(((this._loadInt((_35_ + 204))) + 72))) + 1));
                this._storeInt(((_34_ = this._loadInt((_35_ + 204))) + 72), ((this._loadInt((_34_ + 72))) + (this._loadInt(((this._loadInt((_35_ + 176))) + 8)))));
            }
            while (false);
            label$28:
            do {
                label$29:
                do {
                    if ((this._loadInt((_35_ + 136))) != 0) {
                        break label$29;
                    }
                    if ((this._loadInt((_35_ + 60))) != 0) {
                        break label$29;
                    }
                    if ((this._loadInt((_35_ + 68))) == 0) {
                        break label$28;
                    }
                }
                while (false);
                this._storeInt((_35_ + 40), (this._storeInt(((_34_ = this._loadInt((_35_ + 204))) + 72), ((this._loadInt((_34_ + 72))) + 1))));
            }
            while (false);
            this._storeInt((_35_ + 36), ((this._loadInt(((this._loadInt((_35_ + 204))) + 72))) + 1));
            this._storeInt(((_34_ = this._loadInt((_35_ + 204))) + 72), ((this._loadInt((_34_ + 72))) + (this._loadInt(((this._loadInt((_35_ + 176))) + 8)))));
            label$30:
            do {
                if ((this._loadInt((_35_ + 64))) == 0) {
                    break label$30;
                }
                sqlite3AuthContextPush((this._loadInt((_35_ + 204))), (_35_ + 120), (this._loadInt((this._loadInt((_35_ + 176))))));
            }
            while (false);
            label$31:
            do {
                if ((this._loadInt((_35_ + 64))) == 0) {
                    break label$31;
                }
                sqlite3MaterializeView((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 176))), (this._loadInt((_35_ + 192))), (this._loadInt((_35_ + 152))));
            }
            while (false);
            if ((sqlite3ResolveExprNames((_35_ + 80), (this._loadInt((_35_ + 192))))) != 0) {
                break label$0;
            }
            sqlite3VdbeAddOp2((this._loadInt((_35_ + 164))), 10, 0, (this._loadInt((_35_ + 44))));
            if ((this._storeInt((_35_ + 168), (sqlite3WhereBegin((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 200))), (this._loadInt((_35_ + 192))), 0, 4)))) == 0) {
                break label$0;
            }
            this._storeInt((_35_ + 72), (this._loadInt8u(((this._loadInt((_35_ + 168))) + 6))));
            sqlite3VdbeAddOp2((this._loadInt((_35_ + 164))), 61, (this._loadInt((_35_ + 152))), (this._loadInt((_35_ + 44))));
            label$32:
            do {
                if ((this._loadInt((_35_ + 72))) != 0) {
                    break label$32;
                }
                _34_ = this._storeInt((_35_ + 28), (this._storeInt(((_34_ = this._loadInt((_35_ + 204))) + 72), ((this._loadInt((_34_ + 72))) + 1))));
                sqlite3VdbeAddOp2((this._loadInt((_35_ + 164))), 105, _34_, (this._loadInt((_35_ + 44))));
            }
            while (false);
            sqlite3WhereEnd((this._loadInt((_35_ + 168))));
            label$33:
            do {
                if (((this._loadInt8u(((this._loadInt((_35_ + 148))) + 13))) & 16) == 0) {
                    break label$33;
                }
                if ((this._loadInt(((this._loadInt((_35_ + 204))) + 428))) != 0) {
                    break label$33;
                }
                _34_ = this._storeInt((_35_ + 48), (this._storeInt(((_34_ = this._loadInt((_35_ + 204))) + 72), ((this._loadInt((_34_ + 72))) + 1))));
                sqlite3VdbeAddOp2((this._loadInt((_35_ + 164))), 7, 0, _34_);
            }
            while (false);
            label$34:
            do {
                if ((this._loadInt((_35_ + 64))) != 0) {
                    break label$34;
                }
                label$35:
                do {
                    if ((this._loadInt((_35_ + 72))) != 0) {
                        break label$35;
                    }
                    sqlite3OpenTable((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 152))), (this._loadInt((_35_ + 76))), (this._loadInt((_35_ + 176))), 39);
                }
                while (false);
                label$36:
                do {
                    label$37:
                    do {
                        if ((this._loadInt((_35_ + 188))) != 5) {
                            break label$37;
                        }
                        this._storeInt((_35_ + 128), 1);
                        break label$36;
                    }
                    while (false);
                    this._storeInt((_35_ + 128), 0);
                    this._storeInt((_35_ + 160), (this._loadInt(((this._loadInt((_35_ + 176))) + 16))));
                    label$39:
                    do {
                        label$38:
                        while (true) {
                            if ((this._loadInt((_35_ + 160))) == 0) {
                                break label$36;
                            }
                            if ((this._loadInt8u(((this._loadInt((_35_ + 160))) + 24))) == 5) {
                                break label$39;
                            }
                            this._storeInt((_35_ + 160), (this._loadInt(((this._loadInt((_35_ + 160))) + 32))));
                            continue label$38;
                        }
                    }
                    while (false);
                    this._storeInt((_35_ + 128), 1);
                }
                while (false);
                this._storeInt((_35_ + 184), 0);
                this._storeInt((_35_ + 160), (this._loadInt(((this._loadInt((_35_ + 176))) + 16))));
                label$41:
                do {
                    label$40:
                    while (true) {
                        if ((this._loadInt((_35_ + 160))) == 0) {
                            break label$41;
                        }
                        label$42:
                        do {
                            label$43:
                            do {
                                if ((this._loadInt((_35_ + 128))) != 0) {
                                    break label$43;
                                }
                                if ((this._loadInt(((this._loadInt((_35_ + 144))) + ((this._loadInt((_35_ + 184))) << 2)))) < 1) {
                                    break label$42;
                                }
                            }
                            while (false);
                            _34_ = this._storeInt((_35_ + 16), (sqlite3IndexKeyinfo((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 160))))));
                            sqlite3VdbeAddOp4((this._loadInt((_35_ + 164))), 39, (((this._loadInt((_35_ + 152))) + (this._loadInt((_35_ + 184)))) + 1), (this._loadInt(((this._loadInt((_35_ + 160))) + 20))), (this._loadInt((_35_ + 76))), _34_, -16);
                        }
                        while (false);
                        this._storeInt((_35_ + 160), (this._loadInt(((this._loadInt((_35_ + 160))) + 32))));
                        this._storeInt((_35_ + 184), ((this._loadInt((_35_ + 184))) + 1));
                        continue label$40;
                    }
                }
                while (false);
            }
            while (false);
            label$44:
            do {
                label$45:
                do {
                    if ((this._loadInt((_35_ + 72))) == 0) {
                        break label$45;
                    }
                    this._storeInt((_35_ + 12), (sqlite3VdbeAddOp1((this._loadInt((_35_ + 164))), 74, (this._loadInt((_35_ + 44))))));
                    this._storeInt((_35_ + 172), (sqlite3VdbeAddOp0((this._loadInt((_35_ + 164))), 1)));
                    sqlite3VdbeJumpHere((this._loadInt((_35_ + 164))), (this._loadInt((_35_ + 12))));
                    break label$44;
                }
                while (false);
                this._storeInt((_35_ + 172), (sqlite3VdbeAddOp3((this._loadInt((_35_ + 164))), 106, (this._loadInt((_35_ + 28))), 0, (this._loadInt((_35_ + 44))))));
            }
            while (false);
            sqlite3VdbeAddOp3((this._loadInt((_35_ + 164))), 52, (this._loadInt((_35_ + 152))), (this._loadInt((_35_ + 172))), (this._loadInt((_35_ + 44))));
            label$46:
            do {
                if ((this._loadInt((_35_ + 136))) == 0) {
                    break label$46;
                }
                sqlite3ExprCode((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 132))), (this._loadInt((_35_ + 40))));
                sqlite3VdbeAddOp1((this._loadInt((_35_ + 164))), 21, (this._loadInt((_35_ + 40))));
            }
            while (false);
            label$47:
            do {
                label$48:
                do {
                    if ((this._loadInt((_35_ + 68))) != 0) {
                        break label$48;
                    }
                    if ((this._loadInt((_35_ + 60))) == 0) {
                        break label$47;
                    }
                }
                while (false);
                _34_ = 0;
                label$49:
                do {
                    if ((this._loadInt((_35_ + 68))) == 0) {
                        break label$49;
                    }
                    _34_ = sqlite3FkOldmask((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 176))));
                }
                while (false);
                this._storeInt((_35_ + 8), _34_);
                this._storeInt((_35_ + 8), ((sqlite3TriggerColmask((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 60))), (this._loadInt((_35_ + 196))), 0, 3, (this._loadInt((_35_ + 176))), (this._loadInt((_35_ + 188))))) | (this._loadInt((_35_ + 8)))));
                _33_ = this._storeInt((_35_ + 184), 0);
                label$51:
                do {
                    label$50:
                    while (true) {
                        if ((this._loadInt((_35_ + 184))) >= (this._loadInt(((this._loadInt((_35_ + 176))) + 8)))) {
                            break label$51;
                        }
                        label$52:
                        do {
                            label$53:
                            do {
                                label$54:
                                do {
                                    if ((this._loadInt(((this._loadInt((_35_ + 140))) + ((this._loadInt((_35_ + 184))) << 2)))) < _33_) {
                                        break label$54;
                                    }
                                    if ((this._loadInt((_35_ + 8))) == -1) {
                                        break label$54;
                                    }
                                    if ((this._loadInt((_35_ + 184))) > 31) {
                                        break label$53;
                                    }
                                    if (((this._loadInt((_35_ + 8))) & (1 << (this._loadInt((_35_ + 184))))) == 0) {
                                        break label$53;
                                    }
                                }
                                while (false);
                                sqlite3ExprCodeGetColumnOfTable((this._loadInt((_35_ + 164))), (this._loadInt((_35_ + 176))), (this._loadInt((_35_ + 152))), (_34_ = this._loadInt((_35_ + 184))), (_34_ + (this._loadInt((_35_ + 32)))));
                                break label$52;
                            }
                            while (false);
                            sqlite3VdbeAddOp2((this._loadInt((_35_ + 164))), 10, _33_, ((this._loadInt((_35_ + 32))) + (this._loadInt((_35_ + 184)))));
                        }
                        while (false);
                        this._storeInt((_35_ + 184), ((this._loadInt((_35_ + 184))) + 1));
                        continue label$50;
                    }
                }
                while (false);
                if ((this._loadInt((_35_ + 136))) != 0) {
                    break label$47;
                }
                sqlite3VdbeAddOp2((this._loadInt((_35_ + 164))), 14, (this._loadInt((_35_ + 44))), (this._loadInt((_35_ + 40))));
            }
            while (false);
            this._storeInt((_35_ + 52), (sqlite3TriggerColmask((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 60))), (this._loadInt((_35_ + 196))), 1, 1, (this._loadInt((_35_ + 176))), (this._loadInt((_35_ + 188))))));
            _34_ = this._storeInt((_35_ + 184), 0);
            label$56:
            do {
                label$55:
                while (true) {
                    if ((this._loadInt((_35_ + 184))) >= (this._loadInt(((this._loadInt((_35_ + 176))) + 8)))) {
                        break label$56;
                    }
                    label$57:
                    do {
                        label$58:
                        do {
                            if ((this._loadInt((_35_ + 184))) != (this._loadInt(((this._loadInt((_35_ + 176))) + 4)))) {
                                break label$58;
                            }
                            sqlite3VdbeAddOp2((this._loadInt((_35_ + 164))), 10, _34_, ((this._loadInt((_35_ + 36))) + (this._loadInt((_35_ + 184)))));
                            break label$57;
                        }
                        while (false);
                        label$59:
                        do {
                            if ((this._storeInt((_35_ + 180), (this._loadInt(((this._loadInt((_35_ + 140))) + ((this._loadInt((_35_ + 184))) << 2)))))) < _34_) {
                                break label$59;
                            }
                            sqlite3ExprCode((this._loadInt((_35_ + 204))), (this._loadInt(((this._loadInt(((this._loadInt((_35_ + 196))) + 12))) + ((this._loadInt((_35_ + 180))) * 20)))), ((this._loadInt((_35_ + 36))) + (this._loadInt((_35_ + 184)))));
                            break label$57;
                        }
                        while (false);
                        label$60:
                        do {
                            if (((this._loadInt8u((_35_ + 56))) & 1) == 0) {
                                break label$60;
                            }
                            if ((this._loadInt((_35_ + 184))) > 31) {
                                break label$60;
                            }
                            if (((this._loadInt((_35_ + 52))) & (1 << (this._loadInt((_35_ + 184))))) == 0) {
                                break label$57;
                            }
                        }
                        while (false);
                        sqlite3VdbeAddOp3((this._loadInt((_35_ + 164))), 28, (this._loadInt((_35_ + 152))), (_33_ = this._loadInt((_35_ + 184))), (_33_ + (this._loadInt((_35_ + 36)))));
                        sqlite3ColumnDefault((this._loadInt((_35_ + 164))), (this._loadInt((_35_ + 176))), (_33_ = this._loadInt((_35_ + 184))), (_33_ + (this._loadInt((_35_ + 36)))));
                    }
                    while (false);
                    this._storeInt((_35_ + 184), ((this._loadInt((_35_ + 184))) + 1));
                    continue label$55;
                }
            }
            while (false);
            label$61:
            do {
                if (((this._loadInt8u((_35_ + 56))) & 1) == 0) {
                    break label$61;
                }
                sqlite3VdbeAddOp2((this._loadInt((_35_ + 164))), 29, (this._loadInt((_35_ + 36))), (this._loadInt(((this._loadInt((_35_ + 176))) + 8))));
                sqlite3TableAffinityStr((this._loadInt((_35_ + 164))), (this._loadInt((_35_ + 176))));
                sqlite3CodeRowTrigger((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 60))), 107, (this._loadInt((_35_ + 196))), 1, (this._loadInt((_35_ + 176))), (this._loadInt((_35_ + 44))), (this._loadInt((_35_ + 188))), (this._loadInt((_35_ + 172))));
                sqlite3VdbeAddOp3((this._loadInt((_35_ + 164))), 52, (this._loadInt((_35_ + 152))), (this._loadInt((_35_ + 172))), (this._loadInt((_35_ + 44))));
                this._storeInt((_35_ + 184), 0);
                label$63:
                do {
                    label$62:
                    while (true) {
                        if ((this._loadInt((_35_ + 184))) >= (this._loadInt(((this._loadInt((_35_ + 176))) + 8)))) {
                            break label$63;
                        }
                        label$64:
                        do {
                            if ((this._loadInt(((this._loadInt((_35_ + 140))) + ((this._loadInt((_35_ + 184))) << 2)))) > -1) {
                                break label$64;
                            }
                            if ((this._loadInt((_35_ + 184))) == (this._loadInt(((this._loadInt((_35_ + 176))) + 4)))) {
                                break label$64;
                            }
                            sqlite3VdbeAddOp3((this._loadInt((_35_ + 164))), 28, (this._loadInt((_35_ + 152))), (_34_ = this._loadInt((_35_ + 184))), (_34_ + (this._loadInt((_35_ + 36)))));
                            sqlite3ColumnDefault((this._loadInt((_35_ + 164))), (this._loadInt((_35_ + 176))), (_34_ = this._loadInt((_35_ + 184))), (_34_ + (this._loadInt((_35_ + 36)))));
                        }
                        while (false);
                        this._storeInt((_35_ + 184), ((this._loadInt((_35_ + 184))) + 1));
                        continue label$62;
                    }
                }
                while (false);
            }
            while (false);
            label$65:
            do {
                if ((this._loadInt((_35_ + 64))) != 0) {
                    break label$65;
                }
                _33_ = this._loadInt((_35_ + 144));
                _32_ = this._loadInt((_35_ + 40));
                _31_ = this._loadInt((_35_ + 152));
                _30_ = this._loadInt((_35_ + 176));
                _36_ = this._loadInt((_35_ + 204));
                _34_ = 0;
                label$66:
                do {
                    if ((this._loadInt((_35_ + 136))) == 0) {
                        break label$66;
                    }
                    _34_ = this._loadInt((_35_ + 44));
                }
                while (false);
                sqlite3GenerateConstraintChecks(_36_, _30_, _31_, _32_, _33_, _34_, 1, (this._loadInt((_35_ + 188))), (this._loadInt((_35_ + 172))), 0);
                label$67:
                do {
                    if ((this._loadInt((_35_ + 68))) == 0) {
                        break label$67;
                    }
                    sqlite3FkCheck((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 176))), (this._loadInt((_35_ + 44))), 0);
                }
                while (false);
                this._storeInt((_35_ + 4), (sqlite3VdbeAddOp3((this._loadInt((_35_ + 164))), 52, (this._loadInt((_35_ + 152))), 0, (this._loadInt((_35_ + 44))))));
                sqlite3GenerateRowIndexDelete((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 176))), (this._loadInt((_35_ + 152))), (this._loadInt((_35_ + 144))));
                label$68:
                do {
                    label$69:
                    do {
                        if ((this._loadInt((_35_ + 68))) != 0) {
                            break label$69;
                        }
                        if ((this._loadInt((_35_ + 136))) == 0) {
                            break label$68;
                        }
                    }
                    while (false);
                    sqlite3VdbeAddOp2((this._loadInt((_35_ + 164))), 57, (this._loadInt((_35_ + 152))), 0);
                }
                while (false);
                sqlite3VdbeJumpHere((this._loadInt((_35_ + 164))), (this._loadInt((_35_ + 4))));
                label$70:
                do {
                    if ((this._loadInt((_35_ + 68))) == 0) {
                        break label$70;
                    }
                    sqlite3FkCheck((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 176))), 0, (this._loadInt((_35_ + 40))));
                }
                while (false);
                sqlite3CompleteInsertion((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 176))), (this._loadInt((_35_ + 152))), (this._loadInt((_35_ + 40))), (this._loadInt((_35_ + 144))), 1, 0, 0);
                if ((this._loadInt((_35_ + 68))) == 0) {
                    break label$65;
                }
                sqlite3FkActions((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 176))), (this._loadInt((_35_ + 196))), (this._loadInt((_35_ + 44))));
            }
            while (false);
            label$71:
            do {
                if (((this._loadInt8u(((this._loadInt((_35_ + 148))) + 13))) & 16) == 0) {
                    break label$71;
                }
                if ((this._loadInt(((this._loadInt((_35_ + 204))) + 428))) != 0) {
                    break label$71;
                }
                sqlite3VdbeAddOp2((this._loadInt((_35_ + 164))), 20, (this._loadInt((_35_ + 48))), 1);
            }
            while (false);
            sqlite3CodeRowTrigger((this._loadInt((_35_ + 204))), (this._loadInt((_35_ + 60))), 107, (this._loadInt((_35_ + 196))), 2, (this._loadInt((_35_ + 176))), (this._loadInt((_35_ + 44))), (this._loadInt((_35_ + 188))), (this._loadInt((_35_ + 172))));
            sqlite3VdbeAddOp2((this._loadInt((_35_ + 164))), 1, 0, (this._loadInt((_35_ + 172))));
            sqlite3VdbeJumpHere((this._loadInt((_35_ + 164))), (this._loadInt((_35_ + 172))));
            _34_ = this._storeInt((_35_ + 184), 0);
            this._storeInt((_35_ + 160), (this._loadInt(((this._loadInt((_35_ + 176))) + 16))));
            label$73:
            do {
                label$72:
                while (true) {
                    if ((this._loadInt((_35_ + 160))) == 0) {
                        break label$73;
                    }
                    label$74:
                    do {
                        label$75:
                        do {
                            if ((this._loadInt((_35_ + 128))) != 0) {
                                break label$75;
                            }
                            if ((this._loadInt(((this._loadInt((_35_ + 144))) + ((this._loadInt((_35_ + 184))) << 2)))) < 1) {
                                break label$74;
                            }
                        }
                        while (false);
                        sqlite3VdbeAddOp2((this._loadInt((_35_ + 164))), 43, (((this._loadInt((_35_ + 152))) + (this._loadInt((_35_ + 184)))) + 1), _34_);
                    }
                    while (false);
                    this._storeInt((_35_ + 160), (this._loadInt(((this._loadInt((_35_ + 160))) + 32))));
                    this._storeInt((_35_ + 184), ((this._loadInt((_35_ + 184))) + 1));
                    continue label$72;
                }
            }
            while (false);
            sqlite3VdbeAddOp2((this._loadInt((_35_ + 164))), 43, (this._loadInt((_35_ + 152))), 0);
            label$76:
            do {
                if ((this._loadInt8u(((this._loadInt((_35_ + 204))) + 19))) != 0) {
                    break label$76;
                }
                if ((this._loadInt(((this._loadInt((_35_ + 204))) + 428))) != 0) {
                    break label$76;
                }
                sqlite3AutoincrementEnd((this._loadInt((_35_ + 204))));
            }
            while (false);
            if (((this._loadInt8u(((this._loadInt((_35_ + 148))) + 13))) & 16) == 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_35_ + 204))) + 428))) != 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_35_ + 204))) + 19))) != 0) {
                break label$0;
            }
            sqlite3VdbeAddOp2((this._loadInt((_35_ + 164))), 16, (this._loadInt((_35_ + 48))), 1);
            sqlite3VdbeSetNumCols((this._loadInt((_35_ + 164))), 1);
            sqlite3VdbeSetColName((this._loadInt((_35_ + 164))), 0, 0, 46944, 0);
        }
        while (false);
        sqlite3AuthContextPop((_35_ + 120));
        sqlite3DbFree((this._loadInt((_35_ + 148))), (this._loadInt((_35_ + 144))));
        sqlite3DbFree((this._loadInt((_35_ + 148))), (this._loadInt((_35_ + 140))));
        sqlite3SrcListDelete((this._loadInt((_35_ + 148))), (this._loadInt((_35_ + 200))));
        sqlite3ExprListDelete((this._loadInt((_35_ + 148))), (this._loadInt((_35_ + 196))));
        sqlite3ExprDelete((this._loadInt((_35_ + 148))), (this._loadInt((_35_ + 192))));
        this._storeInt((0 + 4), (_35_ + 208));
        return;
    }

    @Override()
    public final void sqlite3Insert(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_)
    {
        int _36_ = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 320))) + 316), _30_);
        this._storeInt((_36_ + 312), _31_);
        this._storeInt((_36_ + 308), _32_);
        this._storeInt((_36_ + 304), _33_);
        this._storeInt((_36_ + 300), _34_);
        this._storeInt((_36_ + 296), _35_);
        _35_ = this._storeInt((_36_ + 248), (this._storeInt((_36_ + 252), 0)));
        this._storeInt((_36_ + 244), -1);
        _35_ = this._storeInt((_36_ + 156), (this._storeInt((_36_ + 160), (this._storeInt((_36_ + 176), (this._storeInt((_36_ + 180), (this._storeInt((_36_ + 184), (this._storeInt((_36_ + 188), (this._storeInt((_36_ + 220), (this._storeInt((_36_ + 224), (this._storeInt((_36_ + 228), (this._storeInt((_36_ + 232), (this._storeInt((_36_ + 236), _35_)))))))))))))))))))));
        this._storeInt((_36_ + 292), (this._loadInt((this._loadInt((_36_ + 316))))));
        memset((_36_ + 200), _35_, 16);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_36_ + 316))) + 64))) != 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_36_ + 292))) + 30))) != 0) {
                break label$0;
            }
            if ((this._storeInt((_36_ + 284), (this._loadInt(((this._loadInt((_36_ + 312))) + 12))))) == 0) {
                break label$0;
            }
            if ((this._storeInt((_36_ + 288), (sqlite3SrcListLookup((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 312))))))) == 0) {
                break label$0;
            }
            _35_ = this._storeInt((_36_ + 196), (sqlite3SchemaToIndex((this._loadInt((_36_ + 292))), (this._loadInt(((this._loadInt((_36_ + 288))) + 68))))));
            this._storeInt((_36_ + 192), ((this._loadInt(((this._loadInt((_36_ + 292))) + 8))) + (_35_ << 4)));
            _35_ = this._storeInt((_36_ + 280), (this._loadInt((this._loadInt((_36_ + 192))))));
            if ((sqlite3AuthCheck((this._loadInt((_36_ + 316))), 18, (this._loadInt((this._loadInt((_36_ + 288))))), 0, _35_)) != 0) {
                break label$0;
            }
            this._storeInt((_36_ + 148), (sqlite3TriggersExist((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 288))), 105, 0, (_36_ + 144))));
            this._storeInt((_36_ + 152), (((this._loadInt(((this._loadInt((_36_ + 288))) + 28))) != 0) ? 1 : 0));
            if ((sqlite3ViewGetColumnNames((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 288))))) != 0) {
                break label$0;
            }
            if ((sqlite3IsReadOnly((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 288))), (this._loadInt((_36_ + 144))))) != 0) {
                break label$0;
            }
            if ((this._storeInt((_36_ + 264), (sqlite3GetVdbe((this._loadInt((_36_ + 316))))))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_36_ + 316))) + 19))) != 0) {
                    break label$1;
                }
                sqlite3VdbeCountChanges((this._loadInt((_36_ + 264))));
            }
            while (false);
            _35_ = 1;
            _34_ = this._loadInt((_36_ + 316));
            label$2:
            do {
                if ((this._loadInt((_36_ + 304))) != 0) {
                    break label$2;
                }
                _35_ = ((this._loadInt((_36_ + 148))) != 0) ? 1 : 0;
            }
            while (false);
            sqlite3BeginWriteOperation(_34_, _35_, (this._loadInt((_36_ + 196))));
            label$3:
            do {
                label$4:
                do {
                    if ((this._loadInt((_36_ + 300))) != 0) {
                        break label$4;
                    }
                    if ((xferOptimization((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 288))), (this._loadInt((_36_ + 304))), (this._loadInt((_36_ + 296))), (this._loadInt((_36_ + 196))))) != 0) {
                        break label$3;
                    }
                }
                while (false);
                this._storeInt((_36_ + 180), (autoIncBegin((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 196))), (this._loadInt((_36_ + 288))))));
                label$5:
                do {
                    label$6:
                    do {
                        if ((this._loadInt((_36_ + 304))) == 0) {
                            break label$6;
                        }
                        _35_ = this._storeInt((_36_ + 160), (this._storeInt(((_35_ = this._loadInt((_36_ + 316))) + 72), ((this._loadInt((_35_ + 72))) + 1))));
                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 7, 0, _35_);
                        sqlite3SelectDestInit((_36_ + 200), 10, (this._storeInt(((_35_ = this._loadInt((_36_ + 316))) + 72), ((this._loadInt((_35_ + 72))) + 1))));
                        this._storeInt((_36_ + 220), ((_35_ = sqlite3VdbeCurrentAddr((this._loadInt((_36_ + 264))))) + 2));
                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 7, (_35_ + 1), (this._loadInt((_36_ + 204))));
                        this._storeInt((_36_ + 136), (sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 1, 0, 0)));
                        if ((this._storeInt((_36_ + 140), (sqlite3Select((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 304))), (_36_ + 200))))) != 0) {
                            break label$0;
                        }
                        if ((this._loadInt(((this._loadInt((_36_ + 316))) + 64))) != 0) {
                            break label$0;
                        }
                        if ((this._loadInt8u(((this._loadInt((_36_ + 292))) + 30))) != 0) {
                            break label$0;
                        }
                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 7, 1, (this._loadInt((_36_ + 160))));
                        sqlite3VdbeAddOp1((this._loadInt((_36_ + 264))), 4, (this._loadInt((_36_ + 204))));
                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 6, 2, 2);
                        sqlite3VdbeJumpHere((this._loadInt((_36_ + 264))), (this._loadInt((_36_ + 136))));
                        this._storeInt((_36_ + 184), (this._loadInt((_36_ + 208))));
                        this._storeInt((_36_ + 256), (this._loadInt((this._loadInt((this._loadInt((_36_ + 304))))))));
                        label$7:
                        do {
                            label$8:
                            do {
                                if ((this._loadInt((_36_ + 148))) != 0) {
                                    break label$8;
                                }
                                if ((readsTable((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 220))), (this._loadInt((_36_ + 196))), (this._loadInt((_36_ + 288))))) == 0) {
                                    break label$7;
                                }
                            }
                            while (false);
                            this._storeInt((_36_ + 236), 1);
                        }
                        while (false);
                        if ((this._loadInt((_36_ + 236))) == 0) {
                            break label$5;
                        }
                        this._storeInt(((_35_ = this._loadInt((_36_ + 316))) + 68), ((_35_ = this._loadInt((_35_ + 68))) + 1));
                        this._storeInt((_36_ + 232), _35_);
                        this._storeInt((_36_ + 132), (sqlite3GetTempReg((this._loadInt((_36_ + 316))))));
                        this._storeInt((_36_ + 128), (sqlite3GetTempReg((this._loadInt((_36_ + 316))))));
                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 41, (this._loadInt((_36_ + 232))), (this._loadInt((_36_ + 256))));
                        this._storeInt((_36_ + 124), (sqlite3VdbeAddOp1((this._loadInt((_36_ + 264))), 4, (this._loadInt((_36_ + 204))))));
                        this._storeInt((_36_ + 120), (sqlite3VdbeAddOp1((this._loadInt((_36_ + 264))), 26, (this._loadInt((_36_ + 160))))));
                        sqlite3VdbeAddOp3((this._loadInt((_36_ + 264))), 30, (this._loadInt((_36_ + 184))), (this._loadInt((_36_ + 256))), (this._loadInt((_36_ + 132))));
                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 54, (this._loadInt((_36_ + 232))), (this._loadInt((_36_ + 128))));
                        sqlite3VdbeAddOp3((this._loadInt((_36_ + 264))), 55, (this._loadInt((_36_ + 232))), (this._loadInt((_36_ + 132))), (this._loadInt((_36_ + 128))));
                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 1, 0, (this._loadInt((_36_ + 124))));
                        sqlite3VdbeJumpHere((this._loadInt((_36_ + 264))), (this._loadInt((_36_ + 120))));
                        sqlite3ReleaseTempReg((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 132))));
                        sqlite3ReleaseTempReg((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 128))));
                        break label$5;
                    }
                    while (false);
                    memset((_36_ + 80), 0, 36);
                    this._storeInt((_36_ + 80), (this._loadInt((_36_ + 316))));
                    this._storeInt((_36_ + 232), -1);
                    _35_ = 0;
                    label$9:
                    do {
                        if ((this._loadInt((_36_ + 308))) == 0) {
                            break label$9;
                        }
                        _35_ = this._loadInt((this._loadInt((_36_ + 308))));
                    }
                    while (false);
                    this._storeInt((_36_ + 256), _35_);
                    this._storeInt((_36_ + 276), 0);
                    label$11:
                    do {
                        label$10:
                        while (true) {
                            if ((this._loadInt((_36_ + 276))) >= (this._loadInt((_36_ + 256)))) {
                                break label$11;
                            }
                            if ((sqlite3ResolveExprNames((_36_ + 80), (this._loadInt(((this._loadInt(((this._loadInt((_36_ + 308))) + 12))) + ((this._loadInt((_36_ + 276))) * 20)))))) != 0) {
                                break label$0;
                            }
                            this._storeInt((_36_ + 276), ((this._loadInt((_36_ + 276))) + 1));
                            continue label$10;
                        }
                    }
                    while (false);
                }
                while (false);
                label$12:
                do {
                    if (((this._loadInt8u(((this._loadInt((_36_ + 288))) + 34))) & 16) == 0) {
                        break label$12;
                    }
                    _35_ = this._storeInt((_36_ + 276), 0);
                    label$14:
                    do {
                        label$13:
                        while (true) {
                            if ((this._loadInt((_36_ + 276))) >= (this._loadInt(((this._loadInt((_36_ + 288))) + 8)))) {
                                break label$14;
                            }
                            this._storeInt((_36_ + 252), ((this._loadInt((_36_ + 252))) + (((this._loadInt8u((((this._loadInt(((this._loadInt((_36_ + 288))) + 12))) + ((this._loadInt((_36_ + 276))) * 24)) + 23))) != _35_) ? 1 : 0)));
                            this._storeInt((_36_ + 276), ((this._loadInt((_36_ + 276))) + 1));
                            continue label$13;
                        }
                    }
                    while (false);
                }
                while (false);
                label$15:
                do {
                    if ((this._loadInt((_36_ + 300))) != 0) {
                        break label$15;
                    }
                    if ((this._loadInt((_36_ + 256))) == 0) {
                        break label$15;
                    }
                    if ((this._loadInt((_36_ + 256))) == ((this._loadInt(((this._loadInt((_36_ + 288))) + 8))) - (this._loadInt((_36_ + 252))))) {
                        break label$15;
                    }
                    _35_ = this._loadInt(((this._loadInt((_36_ + 288))) + 8));
                    this._storeInt((_36_ + 12), (this._loadInt((_36_ + 256))));
                    this._storeInt((_36_ + 4), 0);
                    _34_ = this._loadInt((_36_ + 316));
                    _33_ = this._loadInt((_36_ + 252));
                    this._storeInt(_36_, (this._loadInt((_36_ + 312))));
                    this._storeInt((_36_ + 8), (_35_ - _33_));
                    sqlite3ErrorMsg(_34_, 45824, _36_);
                    break label$0;
                }
                while (false);
                label$16:
                do {
                    if ((this._loadInt((_36_ + 300))) == 0) {
                        break label$16;
                    }
                    if ((this._loadInt((_36_ + 256))) == (this._loadInt(((this._loadInt((_36_ + 300))) + 4)))) {
                        break label$16;
                    }
                    this._storeInt((_36_ + 20), (this._loadInt(((this._loadInt((_36_ + 300))) + 4))));
                    _35_ = this._loadInt((_36_ + 316));
                    this._storeInt((_36_ + 16), (this._loadInt((_36_ + 256))));
                    sqlite3ErrorMsg(_35_, 45888, (_36_ + 16));
                    break label$0;
                }
                while (false);
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
                                            if ((this._loadInt((_36_ + 300))) == 0) {
                                                break label$23;
                                            }
                                            this._storeInt((_36_ + 276), 0);
                                            label$25:
                                            do {
                                                label$24:
                                                while (true) {
                                                    if ((this._loadInt((_36_ + 276))) >= (this._loadInt(((this._loadInt((_36_ + 300))) + 4)))) {
                                                        break label$25;
                                                    }
                                                    this._storeInt((((this._loadInt((this._loadInt((_36_ + 300))))) + ((_35_ = this._loadInt((_36_ + 276))) << 3)) + 4), -1);
                                                    this._storeInt((_36_ + 276), (_35_ + 1));
                                                    continue label$24;
                                                }
                                            }
                                            while (false);
                                            _35_ = this._storeInt((_36_ + 276), 0);
                                            label$27:
                                            do {
                                                label$26:
                                                while (true) {
                                                    if ((this._loadInt((_36_ + 276))) >= (this._loadInt(((this._loadInt((_36_ + 300))) + 4)))) {
                                                        break label$27;
                                                    }
                                                    this._storeInt((_36_ + 272), _35_);
                                                    label$28:
                                                    do {
                                                        label$30:
                                                        do {
                                                            label$29:
                                                            while (true) {
                                                                if ((this._loadInt((_36_ + 272))) >= (this._loadInt(((this._loadInt((_36_ + 288))) + 8)))) {
                                                                    break label$28;
                                                                }
                                                                if ((sqlite3StrICmp((this._loadInt(((this._loadInt((this._loadInt((_36_ + 300))))) + ((this._loadInt((_36_ + 276))) << 3)))), (this._loadInt(((this._loadInt(((this._loadInt((_36_ + 288))) + 12))) + ((this._loadInt((_36_ + 272))) * 24)))))) == 0) {
                                                                    break label$30;
                                                                }
                                                                this._storeInt((_36_ + 272), ((this._loadInt((_36_ + 272))) + 1));
                                                                continue label$29;
                                                            }
                                                        }
                                                        while (false);
                                                        if ((this._storeInt((((this._loadInt((this._loadInt((_36_ + 300))))) + ((this._loadInt((_36_ + 276))) << 3)) + 4), (this._loadInt((_36_ + 272))))) != (this._loadInt(((this._loadInt((_36_ + 288))) + 4)))) {
                                                            break label$28;
                                                        }
                                                        this._storeInt((_36_ + 244), (this._loadInt((_36_ + 276))));
                                                    }
                                                    while (false);
                                                    label$31:
                                                    do {
                                                        if ((this._loadInt((_36_ + 272))) < (this._loadInt(((this._loadInt((_36_ + 288))) + 8)))) {
                                                            break label$31;
                                                        }
                                                        if ((sqlite3IsRowid((this._loadInt(((this._loadInt((this._loadInt((_36_ + 300))))) + ((this._loadInt((_36_ + 276))) << 3)))))) == 0) {
                                                            break label$22;
                                                        }
                                                        this._storeInt((_36_ + 244), (this._loadInt((_36_ + 276))));
                                                    }
                                                    while (false);
                                                    this._storeInt((_36_ + 276), ((this._loadInt((_36_ + 276))) + 1));
                                                    continue label$26;
                                                }
                                            }
                                            while (false);
                                        }
                                        while (false);
                                        label$32:
                                        do {
                                            if ((this._loadInt((_36_ + 300))) != 0) {
                                                break label$32;
                                            }
                                            if ((this._loadInt((_36_ + 256))) < 1) {
                                                break label$32;
                                            }
                                            this._storeInt((_36_ + 244), (this._loadInt(((this._loadInt((_36_ + 288))) + 4))));
                                        }
                                        while (false);
                                        label$33:
                                        do {
                                            if (((this._loadInt8u(((this._loadInt((_36_ + 292))) + 13))) & 16) == 0) {
                                                break label$33;
                                            }
                                            _35_ = this._storeInt((_36_ + 176), (this._storeInt(((_35_ = this._loadInt((_36_ + 316))) + 72), ((this._loadInt((_35_ + 72))) + 1))));
                                            sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 7, 0, _35_);
                                        }
                                        while (false);
                                        label$34:
                                        do {
                                            if ((this._loadInt((_36_ + 152))) != 0) {
                                                break label$34;
                                            }
                                            _35_ = this._storeInt((_36_ + 248), (this._loadInt(((this._loadInt((_36_ + 316))) + 68))));
                                            _35_ = this._storeInt((_36_ + 76), (sqlite3OpenTableAndIndices((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 288))), _35_, 39)));
                                            if ((this._storeInt((_36_ + 156), (sqlite3DbMallocRaw((this._loadInt((_36_ + 292))), ((_35_ << 2) + 4))))) == 0) {
                                                break label$0;
                                            }
                                            this._storeInt((_36_ + 276), 0);
                                            label$36:
                                            do {
                                                label$35:
                                                while (true) {
                                                    if ((this._loadInt((_36_ + 276))) >= (this._loadInt((_36_ + 76)))) {
                                                        break label$36;
                                                    }
                                                    _35_ = this._storeInt(((_35_ = this._loadInt((_36_ + 316))) + 72), ((this._loadInt((_35_ + 72))) + 1));
                                                    this._storeInt(((this._loadInt((_36_ + 156))) + ((this._loadInt((_36_ + 276))) << 2)), _35_);
                                                    this._storeInt((_36_ + 276), ((this._loadInt((_36_ + 276))) + 1));
                                                    continue label$35;
                                                }
                                            }
                                            while (false);
                                        }
                                        while (false);
                                        label$37:
                                        do {
                                            label$38:
                                            do {
                                                if ((this._loadInt((_36_ + 236))) == 0) {
                                                    break label$38;
                                                }
                                                this._storeInt((_36_ + 228), (sqlite3VdbeAddOp1((this._loadInt((_36_ + 264))), 65, (this._loadInt((_36_ + 232))))));
                                                this._storeInt((_36_ + 224), (sqlite3VdbeCurrentAddr((this._loadInt((_36_ + 264))))));
                                                break label$37;
                                            }
                                            while (false);
                                            if ((this._loadInt((_36_ + 304))) == 0) {
                                                break label$37;
                                            }
                                            this._storeInt((_36_ + 224), (sqlite3VdbeAddOp1((this._loadInt((_36_ + 264))), 4, (this._loadInt((_36_ + 204))))));
                                            this._storeInt((_36_ + 228), (sqlite3VdbeAddOp1((this._loadInt((_36_ + 264))), 26, (this._loadInt((_36_ + 160))))));
                                        }
                                        while (false);
                                        this._storeInt((_36_ + 168), (this._storeInt((_36_ + 172), ((this._loadInt(((this._loadInt((_36_ + 316))) + 72))) + 1))));
                                        this._storeInt(((_35_ = this._loadInt((_36_ + 316))) + 72), (((this._loadInt((_35_ + 72))) + (this._loadInt(((_35_ = this._loadInt((_36_ + 288))) + 8)))) + 1));
                                        label$39:
                                        do {
                                            if (((this._loadInt8u((_35_ + 34))) & 16) == 0) {
                                                break label$39;
                                            }
                                            this._storeInt((_36_ + 168), ((this._loadInt((_36_ + 168))) + 1));
                                            this._storeInt(((_35_ = this._loadInt((_36_ + 316))) + 72), ((this._loadInt((_35_ + 72))) + 1));
                                        }
                                        while (false);
                                        this._storeInt((_36_ + 164), ((this._loadInt((_36_ + 168))) + 1));
                                        this._storeInt((_36_ + 240), (sqlite3VdbeMakeLabel((this._loadInt((_36_ + 264))))));
                                        if (((this._loadInt8u((_36_ + 144))) & 1) == 0) {
                                            break label$17;
                                        }
                                        this._storeInt((_36_ + 72), (sqlite3GetTempRange((this._loadInt((_36_ + 316))), ((this._loadInt(((this._loadInt((_36_ + 288))) + 8))) + 1))));
                                        if ((this._loadInt((_36_ + 244))) <= -1) {
                                            break label$21;
                                        }
                                        if ((this._loadInt((_36_ + 236))) == 0) {
                                            break label$20;
                                        }
                                        sqlite3VdbeAddOp3((this._loadInt((_36_ + 264))), 28, (this._loadInt((_36_ + 232))), (this._loadInt((_36_ + 244))), (this._loadInt((_36_ + 72))));
                                        break label$19;
                                    }
                                    while (false);
                                    this._storeInt((_36_ + 40), (this._loadInt(((this._loadInt((this._loadInt((_36_ + 300))))) + ((this._loadInt((_36_ + 276))) << 3)))));
                                    this._storeInt((_36_ + 36), 0);
                                    _35_ = this._loadInt((_36_ + 316));
                                    this._storeInt((_36_ + 32), (this._loadInt((_36_ + 312))));
                                    sqlite3ErrorMsg(_35_, 45920, (_36_ + 32));
                                    this._storeInt8(((this._loadInt((_36_ + 316))) + 18), 1);
                                    break label$0;
                                }
                                while (false);
                                sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 7, -1, (this._loadInt((_36_ + 72))));
                                break label$18;
                            }
                            while (false);
                            sqlite3ExprCode((this._loadInt((_36_ + 316))), (this._loadInt(((this._loadInt(((this._loadInt((_36_ + 308))) + 12))) + ((this._loadInt((_36_ + 244))) * 20)))), (this._loadInt((_36_ + 72))));
                        }
                        while (false);
                        this._storeInt((_36_ + 68), (sqlite3VdbeAddOp1((this._loadInt((_36_ + 264))), 74, (this._loadInt((_36_ + 72))))));
                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 7, -1, (this._loadInt((_36_ + 72))));
                        sqlite3VdbeJumpHere((this._loadInt((_36_ + 264))), (this._loadInt((_36_ + 68))));
                        sqlite3VdbeAddOp1((this._loadInt((_36_ + 264))), 21, (this._loadInt((_36_ + 72))));
                    }
                    while (false);
                    _34_ = this._storeInt((_36_ + 276), 0);
                    label$41:
                    do {
                        label$40:
                        while (true) {
                            if ((this._loadInt((_36_ + 276))) >= (this._loadInt(((this._loadInt((_36_ + 288))) + 8)))) {
                                break label$41;
                            }
                            label$42:
                            do {
                                label$43:
                                do {
                                    if ((this._loadInt((_36_ + 300))) == 0) {
                                        break label$43;
                                    }
                                    this._storeInt((_36_ + 272), _34_);
                                    label$44:
                                    while (true) {
                                        if ((this._loadInt((_36_ + 272))) >= (this._loadInt(((this._loadInt((_36_ + 300))) + 4)))) {
                                            break label$42;
                                        }
                                        if ((this._loadInt((((this._loadInt((this._loadInt((_36_ + 300))))) + ((this._loadInt((_36_ + 272))) << 3)) + 4))) == (this._loadInt((_36_ + 276)))) {
                                            break label$42;
                                        }
                                        this._storeInt((_36_ + 272), ((this._loadInt((_36_ + 272))) + 1));
                                        continue label$44;
                                    }
                                }
                                while (false);
                                this._storeInt((_36_ + 272), (this._loadInt((_36_ + 276))));
                            }
                            while (false);
                            label$46:
                            do {
                                label$47:
                                do {
                                    label$48:
                                    do {
                                        label$49:
                                        do {
                                            if ((this._loadInt((_36_ + 236))) != 0) {
                                                break label$49;
                                            }
                                            if ((this._loadInt((_36_ + 308))) == 0) {
                                                break label$48;
                                            }
                                        }
                                        while (false);
                                        if ((this._loadInt((_36_ + 300))) == 0) {
                                            break label$47;
                                        }
                                        if ((this._loadInt((_36_ + 272))) < (this._loadInt(((this._loadInt((_36_ + 300))) + 4)))) {
                                            break label$47;
                                        }
                                    }
                                    while (false);
                                    sqlite3ExprCode((this._loadInt((_36_ + 316))), (this._loadInt((((this._loadInt(((this._loadInt((_36_ + 288))) + 12))) + ((_35_ = this._loadInt((_36_ + 276))) * 24)) + 4))), (((this._loadInt((_36_ + 72))) + _35_) + 1));
                                    break label$46;
                                }
                                while (false);
                                label$50:
                                do {
                                    if ((this._loadInt((_36_ + 236))) == 0) {
                                        break label$50;
                                    }
                                    sqlite3VdbeAddOp3((this._loadInt((_36_ + 264))), 28, (this._loadInt((_36_ + 232))), (this._loadInt((_36_ + 272))), (((this._loadInt((_36_ + 72))) + (this._loadInt((_36_ + 276)))) + 1));
                                    break label$46;
                                }
                                while (false);
                                sqlite3ExprCodeAndCache((this._loadInt((_36_ + 316))), (this._loadInt(((this._loadInt(((this._loadInt((_36_ + 308))) + 12))) + ((this._loadInt((_36_ + 272))) * 20)))), (((this._loadInt((_36_ + 72))) + (this._loadInt((_36_ + 276)))) + 1));
                            }
                            while (false);
                            this._storeInt((_36_ + 276), ((this._loadInt((_36_ + 276))) + 1));
                            continue label$40;
                        }
                    }
                    while (false);
                    label$51:
                    do {
                        if ((this._loadInt((_36_ + 152))) != 0) {
                            break label$51;
                        }
                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 29, ((this._loadInt((_36_ + 72))) + 1), (this._loadInt(((this._loadInt((_36_ + 288))) + 8))));
                        sqlite3TableAffinityStr((this._loadInt((_36_ + 264))), (this._loadInt((_36_ + 288))));
                    }
                    while (false);
                    sqlite3CodeRowTrigger((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 148))), 105, 0, 1, (_35_ = this._loadInt((_36_ + 288))), (((this._loadInt((_36_ + 72))) - (this._loadInt((_35_ + 8)))) + -1), (this._loadInt((_36_ + 296))), (this._loadInt((_36_ + 240))));
                    sqlite3ReleaseTempRange((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 72))), ((this._loadInt(((this._loadInt((_36_ + 288))) + 8))) + 1));
                }
                while (false);
                label$52:
                do {
                    if ((this._loadInt((_36_ + 152))) != 0) {
                        break label$52;
                    }
                    label$53:
                    do {
                        if (((this._loadInt8u(((this._loadInt((_36_ + 288))) + 34))) & 16) == 0) {
                            break label$53;
                        }
                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 10, 0, (this._loadInt((_36_ + 172))));
                    }
                    while (false);
                    label$54:
                    do {
                        label$55:
                        do {
                            label$56:
                            do {
                                label$57:
                                do {
                                    if ((this._loadInt((_36_ + 244))) < 0) {
                                        break label$57;
                                    }
                                    if ((this._loadInt((_36_ + 236))) == 0) {
                                        break label$56;
                                    }
                                    sqlite3VdbeAddOp3((this._loadInt((_36_ + 264))), 28, (this._loadInt((_36_ + 232))), (this._loadInt((_36_ + 244))), (this._loadInt((_36_ + 168))));
                                    break label$55;
                                }
                                while (false);
                                label$58:
                                do {
                                    if (((this._loadInt8u(((this._loadInt((_36_ + 288))) + 34))) & 16) == 0) {
                                        break label$58;
                                    }
                                    sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 10, 0, (this._loadInt((_36_ + 168))));
                                    break label$54;
                                }
                                while (false);
                                sqlite3VdbeAddOp3((this._loadInt((_36_ + 264))), 54, (this._loadInt((_36_ + 248))), (this._loadInt((_36_ + 168))), (this._loadInt((_36_ + 180))));
                                this._storeInt((_36_ + 188), 1);
                                break label$54;
                            }
                            while (false);
                            label$59:
                            do {
                                if ((this._loadInt((_36_ + 304))) == 0) {
                                    break label$59;
                                }
                                sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 15, ((this._loadInt((_36_ + 184))) + (this._loadInt((_36_ + 244)))), (this._loadInt((_36_ + 168))));
                                break label$55;
                            }
                            while (false);
                            sqlite3ExprCode((this._loadInt((_36_ + 316))), (this._loadInt(((this._loadInt(((this._loadInt((_36_ + 308))) + 12))) + ((this._loadInt((_36_ + 244))) * 20)))), (this._loadInt((_36_ + 168))));
                            if ((this._storeInt((_36_ + 64), (sqlite3VdbeGetOp((this._loadInt((_36_ + 264))), -1)))) == 0) {
                                break label$55;
                            }
                            if ((this._loadInt8u((this._loadInt((_36_ + 64))))) != 10) {
                                break label$55;
                            }
                            if (((this._loadInt8u(((this._loadInt((_36_ + 288))) + 34))) & 16) != 0) {
                                break label$55;
                            }
                            this._storeInt((_36_ + 188), 1);
                            this._storeInt8((_35_ = this._loadInt((_36_ + 64))), 54);
                            this._storeInt((_35_ + 4), (this._loadInt((_36_ + 248))));
                            this._storeInt(((this._loadInt((_36_ + 64))) + 8), (this._loadInt((_36_ + 168))));
                            this._storeInt(((this._loadInt((_36_ + 64))) + 12), (this._loadInt((_36_ + 180))));
                        }
                        while (false);
                        if ((this._loadInt((_36_ + 188))) != 0) {
                            break label$54;
                        }
                        label$60:
                        do {
                            label$61:
                            do {
                                if (((this._loadInt8u(((this._loadInt((_36_ + 288))) + 34))) & 16) == 0) {
                                    break label$61;
                                }
                                _35_ = this._storeInt((_36_ + 60), (sqlite3VdbeCurrentAddr((this._loadInt((_36_ + 264))))));
                                sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 73, (this._loadInt((_36_ + 168))), (_35_ + 2));
                                break label$60;
                            }
                            while (false);
                            this._storeInt((_36_ + 60), (sqlite3VdbeAddOp1((this._loadInt((_36_ + 264))), 74, (this._loadInt((_36_ + 168))))));
                            sqlite3VdbeAddOp3((this._loadInt((_36_ + 264))), 54, (this._loadInt((_36_ + 248))), (this._loadInt((_36_ + 168))), (this._loadInt((_36_ + 180))));
                            sqlite3VdbeJumpHere((this._loadInt((_36_ + 264))), (this._loadInt((_36_ + 60))));
                        }
                        while (false);
                        sqlite3VdbeAddOp1((this._loadInt((_36_ + 264))), 21, (this._loadInt((_36_ + 168))));
                    }
                    while (false);
                    autoIncStep((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 180))), (this._loadInt((_36_ + 168))));
                    _35_ = this._storeInt((_36_ + 276), (this._storeInt((_36_ + 252), 0)));
                    label$63:
                    do {
                        label$62:
                        while (true) {
                            if ((this._loadInt((_36_ + 276))) >= (this._loadInt(((this._loadInt((_36_ + 288))) + 8)))) {
                                break label$63;
                            }
                            this._storeInt((_36_ + 56), (((this._loadInt((_36_ + 168))) + (this._loadInt((_36_ + 276)))) + 1));
                            label$64:
                            do {
                                label$65:
                                do {
                                    if ((this._loadInt((_36_ + 276))) != (this._loadInt(((this._loadInt((_36_ + 288))) + 4)))) {
                                        break label$65;
                                    }
                                    sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 10, _35_, (this._loadInt((_36_ + 56))));
                                    break label$64;
                                }
                                while (false);
                                label$66:
                                do {
                                    label$67:
                                    do {
                                        if ((this._loadInt((_36_ + 300))) == 0) {
                                            break label$67;
                                        }
                                        this._storeInt((_36_ + 272), _35_);
                                        label$68:
                                        while (true) {
                                            if ((this._loadInt((_36_ + 272))) >= (this._loadInt(((this._loadInt((_36_ + 300))) + 4)))) {
                                                break label$66;
                                            }
                                            if ((this._loadInt((((this._loadInt((this._loadInt((_36_ + 300))))) + ((this._loadInt((_36_ + 272))) << 3)) + 4))) == (this._loadInt((_36_ + 276)))) {
                                                break label$66;
                                            }
                                            this._storeInt((_36_ + 272), ((this._loadInt((_36_ + 272))) + 1));
                                            continue label$68;
                                        }
                                    }
                                    while (false);
                                    label$70:
                                    do {
                                        if ((this._loadInt8u((((this._loadInt(((this._loadInt((_36_ + 288))) + 12))) + ((this._loadInt((_36_ + 276))) * 24)) + 23))) == 0) {
                                            break label$70;
                                        }
                                        this._storeInt((_36_ + 272), -1);
                                        this._storeInt((_36_ + 252), ((this._loadInt((_36_ + 252))) + 1));
                                        break label$66;
                                    }
                                    while (false);
                                    this._storeInt((_36_ + 272), ((this._loadInt((_36_ + 276))) - (this._loadInt((_36_ + 252)))));
                                }
                                while (false);
                                label$71:
                                do {
                                    label$72:
                                    do {
                                        if ((this._loadInt((_36_ + 272))) < _35_) {
                                            break label$72;
                                        }
                                        if ((this._loadInt((_36_ + 256))) == 0) {
                                            break label$72;
                                        }
                                        if ((this._loadInt((_36_ + 300))) == 0) {
                                            break label$71;
                                        }
                                        if ((this._loadInt((_36_ + 272))) < (this._loadInt(((this._loadInt((_36_ + 300))) + 4)))) {
                                            break label$71;
                                        }
                                    }
                                    while (false);
                                    sqlite3ExprCode((this._loadInt((_36_ + 316))), (this._loadInt((((this._loadInt(((this._loadInt((_36_ + 288))) + 12))) + ((this._loadInt((_36_ + 276))) * 24)) + 4))), (this._loadInt((_36_ + 56))));
                                    break label$64;
                                }
                                while (false);
                                label$73:
                                do {
                                    if ((this._loadInt((_36_ + 236))) == 0) {
                                        break label$73;
                                    }
                                    sqlite3VdbeAddOp3((this._loadInt((_36_ + 264))), 28, (this._loadInt((_36_ + 232))), (this._loadInt((_36_ + 272))), (this._loadInt((_36_ + 56))));
                                    break label$64;
                                }
                                while (false);
                                label$74:
                                do {
                                    if ((this._loadInt((_36_ + 304))) == 0) {
                                        break label$74;
                                    }
                                    sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 15, ((this._loadInt((_36_ + 184))) + (this._loadInt((_36_ + 272)))), (this._loadInt((_36_ + 56))));
                                    break label$64;
                                }
                                while (false);
                                sqlite3ExprCode((this._loadInt((_36_ + 316))), (this._loadInt(((this._loadInt(((this._loadInt((_36_ + 308))) + 12))) + ((this._loadInt((_36_ + 272))) * 20)))), (this._loadInt((_36_ + 56))));
                            }
                            while (false);
                            this._storeInt((_36_ + 276), ((this._loadInt((_36_ + 276))) + 1));
                            continue label$62;
                        }
                    }
                    while (false);
                    label$75:
                    do {
                        if (((this._loadInt8u(((this._loadInt((_36_ + 288))) + 34))) & 16) == 0) {
                            break label$75;
                        }
                        this._storeInt((_36_ + 52), (sqlite3GetVTable((this._loadInt((_36_ + 292))), (this._loadInt((_36_ + 288))))));
                        sqlite3VtabMakeWritable((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 288))));
                        _35_ = 2;
                        sqlite3VdbeAddOp4((this._loadInt((_36_ + 264))), 133, 1, ((this._loadInt(((this._loadInt((_36_ + 288))) + 8))) + 2), (this._loadInt((_36_ + 172))), (this._loadInt((_36_ + 52))), -10);
                        _34_ = this._loadInt((_36_ + 264));
                        label$76:
                        do {
                            if ((this._loadInt((_36_ + 296))) == 99) {
                                break label$76;
                            }
                            _35_ = this._loadInt((_36_ + 296));
                        }
                        while (false);
                        sqlite3VdbeChangeP5(_34_, (_35_ & 255));
                        sqlite3MayAbort((this._loadInt((_36_ + 316))));
                        break label$52;
                    }
                    while (false);
                    sqlite3GenerateConstraintChecks((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 288))), (this._loadInt((_36_ + 248))), (this._loadInt((_36_ + 172))), (this._loadInt((_36_ + 156))), (((this._loadInt((_36_ + 244))) > -1) ? 1 : 0), 0, (this._loadInt((_36_ + 296))), (this._loadInt((_36_ + 240))), (_36_ + 48));
                    sqlite3FkCheck((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 288))), 0, (this._loadInt((_36_ + 172))));
                    sqlite3CompleteInsertion((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 288))), (this._loadInt((_36_ + 248))), (this._loadInt((_36_ + 172))), (this._loadInt((_36_ + 156))), 0, (this._loadInt((_36_ + 188))), (((this._loadInt((_36_ + 48))) == 0) ? 1 : 0));
                }
                while (false);
                label$77:
                do {
                    if (((this._loadInt8u(((this._loadInt((_36_ + 292))) + 13))) & 16) == 0) {
                        break label$77;
                    }
                    sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 20, (this._loadInt((_36_ + 176))), 1);
                }
                while (false);
                label$78:
                do {
                    if ((this._loadInt((_36_ + 148))) == 0) {
                        break label$78;
                    }
                    sqlite3CodeRowTrigger((this._loadInt((_36_ + 316))), (this._loadInt((_36_ + 148))), 105, 0, 2, (_35_ = this._loadInt((_36_ + 288))), (((this._loadInt((_36_ + 164))) + -2) - (this._loadInt((_35_ + 8)))), (this._loadInt((_36_ + 296))), (this._loadInt((_36_ + 240))));
                }
                while (false);
                sqlite3VdbeResolveLabel((this._loadInt((_36_ + 264))), (this._loadInt((_36_ + 240))));
                label$79:
                do {
                    label$80:
                    do {
                        if ((this._loadInt((_36_ + 236))) == 0) {
                            break label$80;
                        }
                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 67, (this._loadInt((_36_ + 232))), (this._loadInt((_36_ + 224))));
                        sqlite3VdbeJumpHere((this._loadInt((_36_ + 264))), (this._loadInt((_36_ + 228))));
                        sqlite3VdbeAddOp1((this._loadInt((_36_ + 264))), 43, (this._loadInt((_36_ + 232))));
                        break label$79;
                    }
                    while (false);
                    if ((this._loadInt((_36_ + 304))) == 0) {
                        break label$79;
                    }
                    sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 1, 0, (this._loadInt((_36_ + 224))));
                    sqlite3VdbeJumpHere((this._loadInt((_36_ + 264))), (this._loadInt((_36_ + 228))));
                }
                while (false);
                if (((this._loadInt8u(((this._loadInt((_36_ + 288))) + 34))) & 16) != 0) {
                    break label$3;
                }
                if ((this._loadInt((_36_ + 152))) != 0) {
                    break label$3;
                }
                sqlite3VdbeAddOp1((this._loadInt((_36_ + 264))), 43, (this._loadInt((_36_ + 248))));
                _35_ = this._storeInt((_36_ + 268), 1);
                this._storeInt((_36_ + 260), (this._loadInt(((this._loadInt((_36_ + 288))) + 16))));
                label$82:
                do {
                    label$81:
                    while (true) {
                        if ((this._loadInt((_36_ + 260))) == 0) {
                            break label$82;
                        }
                        sqlite3VdbeAddOp1((this._loadInt((_36_ + 264))), 43, ((this._loadInt((_36_ + 268))) + (this._loadInt((_36_ + 248)))));
                        this._storeInt((_36_ + 260), (this._loadInt(((this._loadInt((_36_ + 260))) + 32))));
                        this._storeInt((_36_ + 268), ((this._loadInt((_36_ + 268))) + _35_));
                        continue label$81;
                    }
                }
                while (false);
            }
            while (false);
            label$83:
            do {
                if ((this._loadInt8u(((this._loadInt((_36_ + 316))) + 19))) != 0) {
                    break label$83;
                }
                if ((this._loadInt(((this._loadInt((_36_ + 316))) + 428))) != 0) {
                    break label$83;
                }
                sqlite3AutoincrementEnd((this._loadInt((_36_ + 316))));
            }
            while (false);
            if (((this._loadInt8u(((this._loadInt((_36_ + 292))) + 13))) & 16) == 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_36_ + 316))) + 19))) != 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_36_ + 316))) + 428))) != 0) {
                break label$0;
            }
            sqlite3VdbeAddOp2((this._loadInt((_36_ + 264))), 16, (this._loadInt((_36_ + 176))), 1);
            sqlite3VdbeSetNumCols((this._loadInt((_36_ + 264))), 1);
            sqlite3VdbeSetColName((this._loadInt((_36_ + 264))), 0, 0, 45952, 0);
        }
        while (false);
        sqlite3SrcListDelete((this._loadInt((_36_ + 292))), (this._loadInt((_36_ + 312))));
        sqlite3ExprListDelete((this._loadInt((_36_ + 292))), (this._loadInt((_36_ + 308))));
        sqlite3SelectDelete((this._loadInt((_36_ + 292))), (this._loadInt((_36_ + 304))));
        sqlite3IdListDelete((this._loadInt((_36_ + 292))), (this._loadInt((_36_ + 300))));
        sqlite3DbFree((this._loadInt((_36_ + 292))), (this._loadInt((_36_ + 156))));
        this._storeInt((0 + 4), (_36_ + 320));
        return;
    }

    @Override()
    public final int sqlite3IdListAppend(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_33_ + 20))) != 0) {
                        break label$2;
                    }
                    if ((this._storeInt((_33_ + 20), (sqlite3DbMallocZero((this._loadInt((_33_ + 24))), 12)))) == 0) {
                        break label$1;
                    }
                    this._storeInt(((this._loadInt((_33_ + 20))) + 8), 0);
                }
                while (false);
                _32_ = sqlite3ArrayAllocate((this._loadInt((_33_ + 24))), (this._loadInt((_32_ = this._loadInt((_33_ + 20))))), 8, 5, (_32_ + 4), (_32_ + 8), (_33_ + 12));
                this._storeInt((this._loadInt((_33_ + 20))), _32_);
                label$3:
                do {
                    if ((this._loadInt((_33_ + 12))) <= -1) {
                        break label$3;
                    }
                    _32_ = sqlite3NameFromToken((this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 16))));
                    this._storeInt(((this._loadInt((_31_ = this._loadInt((_33_ + 20))))) + ((this._loadInt((_33_ + 12))) << 3)), _32_);
                    this._storeInt((_33_ + 28), _31_);
                    break label$0;
                }
                while (false);
                sqlite3IdListDelete((this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))));
                this._storeInt((_33_ + 28), 0);
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
    public final void spanSet(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(((_31_ = this._loadInt((_33_ + 12))) + 4), (this._loadInt((this._loadInt((_33_ + 8))))));
        this._storeInt((_31_ + 8), ((this._loadInt(_32_)) + (this._loadInt((_32_ + 4)))));
        return;
    }

    @Override()
    public final void sqlite3ExprAssignVarNumber(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_32_ + 40), _31_);
        this._storeInt((_32_ + 36), (this._loadInt((this._loadInt((_32_ + 44))))));
        label$0:
        do {
            if ((this._loadInt((_32_ + 40))) == 0) {
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
                            if ((this._loadInt8s(((this._storeInt((_32_ + 32), (this._loadInt(((this._loadInt((_32_ + 40))) + 4))))) + 1))) == 0) {
                                break label$4;
                            }
                            _31_ = this._storeInt16((_32_ + 30), 0);
                            this._storeInt((_32_ + 24), (sqlite3Strlen30((this._loadInt((_32_ + 32))))));
                            if ((this._loadInt8s((this._loadInt((_32_ + 32))))) != 63) {
                                break label$3;
                            }
                            this._storeInt((_32_ + 12), (((sqlite3Atoi64(((this._loadInt((_32_ + 32))) + 1), (_32_ + 16), ((this._loadInt((_32_ + 24))) + -1), 1)) == 0) ? 1 : 0));
                            _31_ = this._storeInt16((_32_ + 30), (this._loadInt16u((_32_ + 16))));
                            this._storeInt16(((this._loadInt((_32_ + 40))) + 28), _31_);
                            label$5:
                            do {
                                label$6:
                                do {
                                    if ((this._loadInt((_32_ + 12))) == 0) {
                                        break label$6;
                                    }
                                    if ((this._loadLong((_32_ + 16))) < 1L) {
                                        break label$6;
                                    }
                                    if ((this._loadLong((_32_ + 16))) <= (this._loadLong32s(((this._loadInt((_32_ + 36))) + 108)))) {
                                        break label$5;
                                    }
                                }
                                while (false);
                                _31_ = this._loadInt((_32_ + 44));
                                this._storeInt(_32_, (this._loadInt(((this._loadInt((_32_ + 36))) + 108))));
                                sqlite3ErrorMsg(_31_, 45744, _32_);
                                this._storeInt16((_32_ + 30), 0);
                            }
                            while (false);
                            if ((this._loadLong((_32_ + 16))) <= (this._loadLong32s(((this._loadInt((_32_ + 44))) + 456)))) {
                                break label$2;
                            }
                            this._storeLong32(((this._loadInt((_32_ + 44))) + 456), (this._loadLong((_32_ + 16))));
                            break label$2;
                        }
                        while (false);
                        _31_ = this._storeInt(((_31_ = this._loadInt((_32_ + 44))) + 456), ((this._loadInt((_31_ + 456))) + 1));
                        this._storeInt16(((this._loadInt((_32_ + 40))) + 28), _31_);
                        break label$1;
                    }
                    while (false);
                    this._storeInt16((_32_ + 10), _31_);
                    label$7:
                    do {
                        label$9:
                        do {
                            label$8:
                            while (true) {
                                if ((this._loadInt16s((_32_ + 10))) >= (this._loadInt(((this._loadInt((_32_ + 44))) + 460)))) {
                                    break label$7;
                                }
                                label$10:
                                do {
                                    if ((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 44))) + 464))) + ((this._loadInt16s((_32_ + 10))) << 2)))) == 0) {
                                        break label$10;
                                    }
                                    if ((memcmp((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 44))) + 464))) + ((this._loadInt16s((_32_ + 10))) << 2)))), (this._loadInt((_32_ + 32))), ((this._loadInt((_32_ + 24))) + 1))) == 0) {
                                        break label$9;
                                    }
                                }
                                while (false);
                                this._storeInt16((_32_ + 10), ((this._loadInt16u((_32_ + 10))) + 1));
                                continue label$8;
                            }
                        }
                        while (false);
                        _31_ = this._storeInt16((_32_ + 30), ((this._loadInt16u((_32_ + 10))) + 1));
                        this._storeInt16(((this._loadInt((_32_ + 40))) + 28), _31_);
                    }
                    while (false);
                    if ((this._loadInt16s((_32_ + 30))) != 0) {
                        break label$2;
                    }
                    _31_ = this._storeInt(((_31_ = this._loadInt((_32_ + 44))) + 456), ((this._loadInt((_31_ + 456))) + 1));
                    this._storeInt16((_32_ + 30), (this._storeInt16(((this._loadInt((_32_ + 40))) + 28), _31_)));
                }
                while (false);
                if ((this._loadInt16s((_32_ + 30))) < 1) {
                    break label$1;
                }
                label$11:
                do {
                    if ((this._loadInt16s((_32_ + 30))) <= (this._loadInt(((this._loadInt((_32_ + 44))) + 460)))) {
                        break label$11;
                    }
                    if ((this._storeInt((_32_ + 4), (sqlite3DbRealloc((this._loadInt((_32_ + 36))), (this._loadInt(((this._loadInt((_32_ + 44))) + 464))), ((this._loadInt16s((_32_ + 30))) << 2))))) == 0) {
                        break label$0;
                    }
                    memset(((this._storeInt(((_31_ = this._loadInt((_32_ + 44))) + 464), (this._loadInt((_32_ + 4))))) + ((_31_ = this._loadInt((_31_ + 460))) << 2)), 0, (((this._loadInt16s((_32_ + 30))) - _31_) << 2));
                    this._storeInt(((this._loadInt((_32_ + 44))) + 460), (this._loadInt16s((_32_ + 30))));
                }
                while (false);
                label$12:
                do {
                    if ((this._loadInt8s((this._loadInt((_32_ + 32))))) != 63) {
                        break label$12;
                    }
                    if ((this._loadInt((((this._loadInt(((this._loadInt((_32_ + 44))) + 464))) + ((this._loadInt16s((_32_ + 30))) << 2)) + -4))) != 0) {
                        break label$1;
                    }
                }
                while (false);
                sqlite3DbFree((this._loadInt((_32_ + 36))), (this._loadInt((((this._loadInt(((this._loadInt((_32_ + 44))) + 464))) + ((this._loadInt16s((_32_ + 30))) << 2)) + -4))));
                _31_ = sqlite3DbStrNDup((this._loadInt((_32_ + 36))), (this._loadInt((_32_ + 32))), (this._loadInt((_32_ + 24))));
                this._storeInt((((this._loadInt(((this._loadInt((_32_ + 44))) + 464))) + ((this._loadInt16s((_32_ + 30))) << 2)) + -4), _31_);
            }
            while (false);
            if ((this._loadInt(((this._loadInt((_32_ + 44))) + 64))) != 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_32_ + 44))) + 456))) <= (this._loadInt(((this._loadInt((_32_ + 36))) + 108)))) {
                break label$0;
            }
            sqlite3ErrorMsg((this._loadInt((_32_ + 44))), 45792, 0);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 48));
        return;
    }

    @Override()
    public final int sqlite3ExprSetCollByToken(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 16), 0);
        _32_ = this._storeInt((_33_ + 16), (sqlite3NameFromToken((this._storeInt((_33_ + 8), (this._loadInt((this._loadInt((_33_ + 28))))))), (this._loadInt((_33_ + 20))))));
        _32_ = this._storeInt((_33_ + 12), (sqlite3LocateCollSeq((this._loadInt((_33_ + 28))), _32_)));
        sqlite3ExprSetColl((this._loadInt((_33_ + 24))), _32_);
        sqlite3DbFree((this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 16))));
        _32_ = this._loadInt((_33_ + 24));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int sqlite3ExprFunction(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_33_ + 12), (sqlite3ExprAlloc((this._storeInt((_33_ + 8), (this._loadInt((this._loadInt((_33_ + 24))))))), 151, (this._loadInt((_33_ + 16))), 1)))) == 0) {
                    break label$1;
                }
                this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 16), (this._loadInt((_33_ + 20))));
                sqlite3ExprSetHeight((this._loadInt((_33_ + 24))), _32_);
                this._storeInt((_33_ + 28), (this._loadInt((_33_ + 12))));
                break label$0;
            }
            while (false);
            sqlite3ExprListDelete((this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 20))));
            this._storeInt((_33_ + 28), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final void spanBinaryExpr(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        _34_ = sqlite3PExpr((this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), (this._loadInt((this._loadInt((_35_ + 16))))), (this._loadInt(_34_)), 0);
        this._storeInt((_33_ = this._loadInt((_35_ + 28))), _34_);
        this._storeInt((_33_ + 4), (this._loadInt(((this._loadInt((_35_ + 16))) + 4))));
        this._storeInt(((this._loadInt((_35_ + 28))) + 8), (this._loadInt(((this._loadInt((_35_ + 12))) + 8))));
        this._storeInt((0 + 4), (_35_ + 32));
        return;
    }

    @Override()
    public final void spanUnaryPostfix(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        _34_ = sqlite3PExpr((this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), (this._loadInt((this._loadInt((_35_ + 16))))), 0, 0);
        this._storeInt((_33_ = this._loadInt((_35_ + 28))), _34_);
        this._storeInt((_33_ + 4), (this._loadInt(((this._loadInt((_35_ + 16))) + 4))));
        this._storeInt(((this._loadInt((_35_ + 28))) + 8), ((this._loadInt((_34_ = this._loadInt((_35_ + 12))))) + (this._loadInt((_34_ + 4)))));
        this._storeInt((0 + 4), (_35_ + 32));
        return;
    }

    @Override()
    public final void binaryToUnaryIfNull(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt((_34_ + 12), (this._loadInt((this._loadInt((_34_ + 28))))))) + 30))) != 0) {
                break label$0;
            }
            if ((this._loadInt8u((this._loadInt((_34_ + 24))))) != 98) {
                break label$0;
            }
            this._storeInt8((_33_ = this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 16))));
            sqlite3ExprDelete((this._loadInt((_34_ + 12))), (this._loadInt((_33_ + 12))));
            this._storeInt(((this._loadInt((_34_ + 20))) + 12), 0);
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final void spanUnaryPrefix(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        _34_ = sqlite3PExpr((this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), (this._loadInt((this._loadInt((_35_ + 16))))), 0, 0);
        this._storeInt((_33_ = this._loadInt((_35_ + 28))), _34_);
        this._storeInt((_33_ + 4), (this._loadInt((this._loadInt((_35_ + 12))))));
        this._storeInt(((this._loadInt((_35_ + 28))) + 8), (this._loadInt(((this._loadInt((_35_ + 16))) + 8))));
        this._storeInt((0 + 4), (_35_ + 32));
        return;
    }

    @Override()
    public final void sqlite3ExprSetHeight(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        exprSetHeight((this._storeInt((_32_ + 8), _31_)));
        sqlite3ExprCheckHeight((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 44))));
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3DropIndex(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        int _temp$3 = 0;
        int _temp$4 = 0;
        int _temp$5 = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 112))) + 108), _30_);
        this._storeInt((_33_ + 104), _31_);
        this._storeInt((_33_ + 100), _32_);
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt((_33_ + 88), (this._loadInt((this._loadInt((_33_ + 108))))))) + 30))) != 0) {
                break label$0;
            }
            if ((sqlite3ReadSchema((this._loadInt((_33_ + 108))))) != 0) {
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
                            if ((this._storeInt((_33_ + 96), (sqlite3FindIndex((this._loadInt((_33_ + 88))), (this._loadInt(((_32_ = this._loadInt((_33_ + 104))) + 12))), (this._loadInt((_32_ + 8))))))) == 0) {
                                break label$4;
                            }
                            if ((this._loadInt8u(((this._loadInt((_33_ + 96))) + 25))) == 0) {
                                break label$3;
                            }
                            _32_ = this._loadInt((_33_ + 108));
                            this._storeInt((_33_ + 16), 0);
                            sqlite3ErrorMsg(_32_, 45472, (_33_ + 16));
                            break label$0;
                        }
                        while (false);
                        if ((this._loadInt((_33_ + 100))) == 0) {
                            break label$2;
                        }
                        sqlite3CodeVerifyNamedSchema((this._loadInt((_33_ + 108))), (this._loadInt(((this._loadInt((_33_ + 104))) + 8))));
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_33_ + 84), (sqlite3SchemaToIndex((this._loadInt((_33_ + 88))), (this._loadInt(((this._loadInt((_33_ + 96))) + 36))))));
                    this._storeInt((_33_ + 80), 10);
                    this._storeInt((_33_ + 76), (this._loadInt(((this._loadInt((_33_ + 96))) + 16))));
                    this._storeInt((_33_ + 72), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 88))) + 8))) + ((this._loadInt((_33_ + 84))) << 4)))));
                    _temp$0 = 32464;
                    _temp$1 = 32496;
                    _temp$2 = ((this._loadInt((_33_ + 84))) == 1) ? _temp$0 : _temp$1;
                    _temp$2 = this._storeInt((_33_ + 68), _temp$2);
                    _32_ = _temp$2;
                    if ((sqlite3AuthCheck((this._loadInt((_33_ + 108))), 9, _32_, 0, (this._loadInt((_33_ + 72))))) != 0) {
                        break label$0;
                    }
                    label$5:
                    do {
                        if ((this._loadInt((_33_ + 84))) == 0) {
                            break label$5;
                        }
                        this._storeInt((_33_ + 80), 12);
                    }
                    while (false);
                    if ((sqlite3AuthCheck((this._loadInt((_33_ + 108))), (this._loadInt((_33_ + 80))), (this._loadInt((this._loadInt((_33_ + 96))))), (this._loadInt((this._loadInt((_33_ + 76))))), (this._loadInt((_33_ + 72))))) != 0) {
                        break label$0;
                    }
                    if ((this._storeInt((_33_ + 92), (sqlite3GetVdbe((this._loadInt((_33_ + 108))))))) == 0) {
                        break label$0;
                    }
                    sqlite3BeginWriteOperation((this._loadInt((_33_ + 108))), 1, (this._loadInt((_33_ + 84))));
                    _31_ = this._loadInt(((this._loadInt(((this._loadInt((_33_ + 88))) + 8))) + ((_32_ = this._loadInt((_33_ + 84))) << 4)));
                    this._storeInt((_33_ + 56), (this._loadInt((this._loadInt((_33_ + 96))))));
                    _temp$3 = 32464;
                    _temp$4 = 32496;
                    _temp$5 = (_32_ == 1) ? _temp$3 : _temp$4;
                    this._storeInt((_33_ + 52), _temp$5);
                    _32_ = this._loadInt((_33_ + 108));
                    this._storeInt((_33_ + 48), _31_);
                    sqlite3NestedParse(_32_, 45552, (_33_ + 48));
                    label$6:
                    do {
                        if ((sqlite3FindTable((_32_ = this._loadInt((_33_ + 88))), 32704, (this._loadInt(((this._loadInt((_32_ + 8))) + ((this._loadInt((_33_ + 84))) << 4)))))) == 0) {
                            break label$6;
                        }
                        _32_ = this._loadInt(((this._loadInt(((this._loadInt((_33_ + 88))) + 8))) + ((this._loadInt((_33_ + 84))) << 4)));
                        this._storeInt((_33_ + 36), (this._loadInt((this._loadInt((_33_ + 96))))));
                        _31_ = this._loadInt((_33_ + 108));
                        this._storeInt((_33_ + 32), _32_);
                        sqlite3NestedParse(_31_, 45616, (_33_ + 32));
                    }
                    while (false);
                    sqlite3ChangeCookie((this._loadInt((_33_ + 108))), (this._loadInt((_33_ + 84))));
                    destroyRootPage((this._loadInt((_33_ + 108))), (this._loadInt(((this._loadInt((_33_ + 96))) + 20))), (this._loadInt((_33_ + 84))));
                    sqlite3VdbeAddOp4((this._loadInt((_33_ + 92))), 102, (this._loadInt((_33_ + 84))), 0, 0, (this._loadInt((this._loadInt((_33_ + 96))))), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_33_ + 4), 0);
                _32_ = this._loadInt((_33_ + 108));
                this._storeInt(_33_, (this._loadInt((_33_ + 104))));
                sqlite3ErrorMsg(_32_, 45440, _33_);
            }
            while (false);
            this._storeInt8(((this._loadInt((_33_ + 108))) + 18), 1);
        }
        while (false);
        sqlite3SrcListDelete((this._loadInt((_33_ + 88))), (this._loadInt((_33_ + 104))));
        this._storeInt((0 + 4), (_33_ + 112));
        return;
    }

    @Override()
    public final void sqlite3Vacuum(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (sqlite3GetVdbe((this._storeInt((_31_ + 12), _30_)))))) == 0) {
                break label$0;
            }
            sqlite3VdbeAddOp2((this._loadInt((_31_ + 8))), 120, 0, 0);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3Pragma(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        long _35_ = 0L;
        int _36_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        int _temp$3 = 0;
        int _temp$4 = 0;
        int _temp$5 = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 400))) + 396), _30_);
        this._storeInt((_36_ + 392), _31_);
        this._storeInt((_36_ + 388), _32_);
        this._storeInt((_36_ + 384), _33_);
        this._storeInt((_36_ + 380), _34_);
        _33_ = this._storeInt((_36_ + 368), (this._storeInt((_36_ + 372), (this._storeInt((_36_ + 376), 0)))));
        _34_ = sqlite3VdbeCreate((this._storeInt((_36_ + 356), (this._loadInt((this._loadInt((_36_ + 396))))))));
        label$0:
        do {
            if ((this._storeInt((_36_ + 348), (this._storeInt(((this._loadInt((_36_ + 396))) + 12), _34_)))) == 0) {
                break label$0;
            }
            sqlite3VdbeRunOnlyOnce((this._loadInt((_36_ + 348))));
            this._storeInt(((_34_ = this._loadInt((_36_ + 396))) + 72), 2);
            if ((this._storeInt((_36_ + 360), (sqlite3TwoPartName(_34_, (this._loadInt((_36_ + 392))), (this._loadInt((_36_ + 388))), (_36_ + 364))))) < _33_) {
                break label$0;
            }
            this._storeInt((_36_ + 352), ((this._loadInt(((this._loadInt((_36_ + 356))) + 8))) + ((this._loadInt((_36_ + 360))) << 4)));
            label$1:
            do {
                if ((this._loadInt((_36_ + 360))) != 1) {
                    break label$1;
                }
                if ((sqlite3OpenTempDatabase((this._loadInt((_36_ + 396))))) != 0) {
                    break label$0;
                }
            }
            while (false);
            if ((this._storeInt((_36_ + 376), (sqlite3NameFromToken((this._loadInt((_36_ + 356))), (this._loadInt((_36_ + 364))))))) == 0) {
                break label$0;
            }
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt((_36_ + 380))) == 0) {
                        break label$3;
                    }
                    _34_ = this._loadInt((_36_ + 356));
                    this._storeInt((_36_ + 48), (this._loadInt((_36_ + 384))));
                    this._storeInt((_36_ + 372), (sqlite3MPrintf(_34_, 42928, (_36_ + 48))));
                    break label$2;
                }
                while (false);
                this._storeInt((_36_ + 372), (sqlite3NameFromToken((this._loadInt((_36_ + 356))), (this._loadInt((_36_ + 384))))));
            }
            while (false);
            _34_ = 0;
            label$4:
            do {
                if ((this._loadInt(((this._loadInt((_36_ + 388))) + 4))) == 0) {
                    break label$4;
                }
                _34_ = this._loadInt((this._loadInt((_36_ + 352))));
            }
            while (false);
            this._storeInt((_36_ + 368), _34_);
            label$5:
            do {
                if ((sqlite3AuthCheck((this._loadInt((_36_ + 396))), 19, (this._loadInt((_36_ + 376))), (this._loadInt((_36_ + 372))), _34_)) != 0) {
                    break label$5;
                }
                label$6:
                do {
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
                                                                                                                label$30:
                                                                                                                do {
                                                                                                                    label$31:
                                                                                                                    do {
                                                                                                                        label$32:
                                                                                                                        do {
                                                                                                                            label$33:
                                                                                                                            do {
                                                                                                                                label$34:
                                                                                                                                do {
                                                                                                                                    label$35:
                                                                                                                                    do {
                                                                                                                                        label$36:
                                                                                                                                        do {
                                                                                                                                            label$37:
                                                                                                                                            do {
                                                                                                                                                label$38:
                                                                                                                                                do {
                                                                                                                                                    label$39:
                                                                                                                                                    do {
                                                                                                                                                        label$40:
                                                                                                                                                        do {
                                                                                                                                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 42944)) == 0) {
                                                                                                                                                                break label$40;
                                                                                                                                                            }
                                                                                                                                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43024)) == 0) {
                                                                                                                                                                break label$39;
                                                                                                                                                            }
                                                                                                                                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43040)) == 0) {
                                                                                                                                                                break label$37;
                                                                                                                                                            }
                                                                                                                                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43056)) == 0) {
                                                                                                                                                                break label$38;
                                                                                                                                                            }
                                                                                                                                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43072)) == 0) {
                                                                                                                                                                break label$38;
                                                                                                                                                            }
                                                                                                                                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43088)) == 0) {
                                                                                                                                                                break label$34;
                                                                                                                                                            }
                                                                                                                                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43136)) == 0) {
                                                                                                                                                                break label$31;
                                                                                                                                                            }
                                                                                                                                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43152)) == 0) {
                                                                                                                                                                break label$30;
                                                                                                                                                            }
                                                                                                                                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43184)) == 0) {
                                                                                                                                                                break label$29;
                                                                                                                                                            }
                                                                                                                                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43232)) == 0) {
                                                                                                                                                                break label$28;
                                                                                                                                                            }
                                                                                                                                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 42976)) == 0) {
                                                                                                                                                                break label$26;
                                                                                                                                                            }
                                                                                                                                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43264)) == 0) {
                                                                                                                                                                break label$23;
                                                                                                                                                            }
                                                                                                                                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43280)) == 0) {
                                                                                                                                                                break label$22;
                                                                                                                                                            }
                                                                                                                                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43344)) == 0) {
                                                                                                                                                                break label$20;
                                                                                                                                                            }
                                                                                                                                                            if ((flagPragma((this._loadInt((_36_ + 396))), (this._loadInt((_36_ + 376))), (this._loadInt((_36_ + 372))))) != 0) {
                                                                                                                                                                break label$6;
                                                                                                                                                            }
                                                                                                                                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43424)) == 0) {
                                                                                                                                                                break label$14;
                                                                                                                                                            }
                                                                                                                                                            break label$7;
                                                                                                                                                        }
                                                                                                                                                        while (false);
                                                                                                                                                        if ((sqlite3ReadSchema((this._loadInt((_36_ + 396))))) != 0) {
                                                                                                                                                            break label$5;
                                                                                                                                                        }
                                                                                                                                                        sqlite3VdbeUsesBtree((this._loadInt((_36_ + 348))), (this._loadInt((_36_ + 360))));
                                                                                                                                                        if ((this._loadInt((_36_ + 372))) == 0) {
                                                                                                                                                            break label$35;
                                                                                                                                                        }
                                                                                                                                                        this._storeInt((_36_ + 340), (sqlite3AbsInt32((sqlite3Atoi((this._loadInt((_36_ + 372))))))));
                                                                                                                                                        sqlite3BeginWriteOperation((this._loadInt((_36_ + 396))), 0, (this._loadInt((_36_ + 360))));
                                                                                                                                                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 7, (this._loadInt((_36_ + 340))), 1);
                                                                                                                                                        sqlite3VdbeAddOp3((this._loadInt((_36_ + 348))), 36, (this._loadInt((_36_ + 360))), 3, 1);
                                                                                                                                                        this._storeInt(((this._loadInt(((_34_ = this._loadInt((_36_ + 352))) + 12))) + 80), (this._loadInt((_36_ + 340))));
                                                                                                                                                        sqlite3BtreeSetCacheSize((this._loadInt((_34_ + 4))), (this._loadInt(((this._loadInt((_34_ + 12))) + 80))));
                                                                                                                                                        break label$6;
                                                                                                                                                    }
                                                                                                                                                    while (false);
                                                                                                                                                    this._storeInt((_36_ + 336), (this._loadInt(((this._loadInt((_36_ + 352))) + 4))));
                                                                                                                                                    if ((this._loadInt((_36_ + 372))) == 0) {
                                                                                                                                                        break label$36;
                                                                                                                                                    }
                                                                                                                                                    _34_ = sqlite3Atoi((this._loadInt((_36_ + 372))));
                                                                                                                                                    this._storeInt(((this._loadInt((_36_ + 356))) + 36), _34_);
                                                                                                                                                    if ((sqlite3BtreeSetPageSize((this._loadInt((_36_ + 336))), _34_, -1, 0)) != 7) {
                                                                                                                                                        break label$6;
                                                                                                                                                    }
                                                                                                                                                    this._storeInt8(((this._loadInt((_36_ + 356))) + 30), 1);
                                                                                                                                                    break label$6;
                                                                                                                                                }
                                                                                                                                                while (false);
                                                                                                                                                if ((sqlite3ReadSchema((this._loadInt((_36_ + 396))))) != 0) {
                                                                                                                                                    break label$5;
                                                                                                                                                }
                                                                                                                                                sqlite3CodeVerifySchema((this._loadInt((_36_ + 396))), (this._loadInt((_36_ + 360))));
                                                                                                                                                this._storeInt((_36_ + 316), (this._storeInt(((_34_ = this._loadInt((_36_ + 396))) + 72), ((this._loadInt((_34_ + 72))) + 1))));
                                                                                                                                                if ((this._loadInt8s((this._loadInt((_36_ + 376))))) != 112) {
                                                                                                                                                    break label$33;
                                                                                                                                                }
                                                                                                                                                sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 134, (this._loadInt((_36_ + 360))), (this._loadInt((_36_ + 316))));
                                                                                                                                                break label$32;
                                                                                                                                            }
                                                                                                                                            while (false);
                                                                                                                                            this._storeInt((_36_ + 328), (this._loadInt(((this._loadInt((_36_ + 352))) + 4))));
                                                                                                                                            this._storeInt((_36_ + 324), -1);
                                                                                                                                            label$41:
                                                                                                                                            do {
                                                                                                                                                if ((this._loadInt((_36_ + 372))) == 0) {
                                                                                                                                                    break label$41;
                                                                                                                                                }
                                                                                                                                                this._storeInt((_36_ + 324), (sqlite3GetBoolean((this._loadInt((_36_ + 372))))));
                                                                                                                                            }
                                                                                                                                            while (false);
                                                                                                                                            label$42:
                                                                                                                                            do {
                                                                                                                                                if ((this._loadInt(((this._loadInt((_36_ + 388))) + 4))) != 0) {
                                                                                                                                                    break label$42;
                                                                                                                                                }
                                                                                                                                                if ((this._loadInt((_36_ + 324))) < 0) {
                                                                                                                                                    break label$42;
                                                                                                                                                }
                                                                                                                                                this._storeInt((_36_ + 320), 0);
                                                                                                                                                label$44:
                                                                                                                                                do {
                                                                                                                                                    label$43:
                                                                                                                                                    while (true) {
                                                                                                                                                        if ((this._loadInt((_36_ + 320))) >= (this._loadInt(((this._loadInt((_36_ + 356))) + 4)))) {
                                                                                                                                                            break label$44;
                                                                                                                                                        }
                                                                                                                                                        sqlite3BtreeSecureDelete((this._loadInt((((this._loadInt(((this._loadInt((_36_ + 356))) + 8))) + ((this._loadInt((_36_ + 320))) << 4)) + 4))), (this._loadInt((_36_ + 324))));
                                                                                                                                                        this._storeInt((_36_ + 320), ((this._loadInt((_36_ + 320))) + 1));
                                                                                                                                                        continue label$43;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                while (false);
                                                                                                                                            }
                                                                                                                                            while (false);
                                                                                                                                            this._storeInt((_36_ + 324), (sqlite3BtreeSecureDelete((this._loadInt((_36_ + 328))), (this._loadInt((_36_ + 324))))));
                                                                                                                                            returnSingleInt((this._loadInt((_36_ + 396))), 43040, (this._loadLong32s((_36_ + 324))));
                                                                                                                                            break label$6;
                                                                                                                                        }
                                                                                                                                        while (false);
                                                                                                                                        _34_ = 0;
                                                                                                                                        label$45:
                                                                                                                                        do {
                                                                                                                                            if ((this._loadInt((_36_ + 336))) == 0) {
                                                                                                                                                break label$45;
                                                                                                                                            }
                                                                                                                                            _34_ = sqlite3BtreeGetPageSize((this._loadInt((_36_ + 336))));
                                                                                                                                        }
                                                                                                                                        while (false);
                                                                                                                                        this._storeInt((_36_ + 332), _34_);
                                                                                                                                        returnSingleInt((this._loadInt((_36_ + 396))), 43024, (this._loadLong32s((_36_ + 332))));
                                                                                                                                        break label$6;
                                                                                                                                    }
                                                                                                                                    while (false);
                                                                                                                                    sqlite3VdbeSetNumCols((this._loadInt((_36_ + 348))), 1);
                                                                                                                                    sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 0, 0, 42976, 0);
                                                                                                                                    this._storeInt(((_34_ = this._loadInt((_36_ + 396))) + 72), ((this._loadInt((_34_ + 72))) + 2));
                                                                                                                                    _34_ = this._storeInt((_36_ + 344), (sqlite3VdbeAddOpList((this._loadInt((_36_ + 348))), 8, 42992)));
                                                                                                                                    sqlite3VdbeChangeP1((this._loadInt((_36_ + 348))), _34_, (this._loadInt((_36_ + 360))));
                                                                                                                                    sqlite3VdbeChangeP1((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 344))) + 1), (this._loadInt((_36_ + 360))));
                                                                                                                                    sqlite3VdbeChangeP1((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 344))) + 6), 2000);
                                                                                                                                    break label$6;
                                                                                                                                }
                                                                                                                                while (false);
                                                                                                                                this._storeInt((_36_ + 312), 43104);
                                                                                                                                this._storeInt((_36_ + 308), (getLockingMode((this._loadInt((_36_ + 372))))));
                                                                                                                                label$46:
                                                                                                                                do {
                                                                                                                                    if ((this._loadInt(((this._loadInt((_36_ + 388))) + 4))) != 0) {
                                                                                                                                        break label$46;
                                                                                                                                    }
                                                                                                                                    if ((this._loadInt((_36_ + 308))) == -1) {
                                                                                                                                        break label$27;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                while (false);
                                                                                                                                label$47:
                                                                                                                                do {
                                                                                                                                    if ((this._loadInt(((this._loadInt((_36_ + 388))) + 4))) != 0) {
                                                                                                                                        break label$47;
                                                                                                                                    }
                                                                                                                                    this._storeInt((_36_ + 300), 2);
                                                                                                                                    label$49:
                                                                                                                                    do {
                                                                                                                                        label$48:
                                                                                                                                        while (true) {
                                                                                                                                            if ((this._loadInt((_36_ + 300))) >= (this._loadInt(((this._loadInt((_36_ + 356))) + 4)))) {
                                                                                                                                                break label$49;
                                                                                                                                            }
                                                                                                                                            sqlite3PagerLockingMode((this._storeInt((_36_ + 304), (sqlite3BtreePager((this._loadInt((((this._loadInt(((this._loadInt((_36_ + 356))) + 8))) + ((this._loadInt((_36_ + 300))) << 4)) + 4))))))), (this._loadInt((_36_ + 308))));
                                                                                                                                            this._storeInt((_36_ + 300), ((this._loadInt((_36_ + 300))) + 1));
                                                                                                                                            continue label$48;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    while (false);
                                                                                                                                    this._storeInt8(((this._loadInt((_36_ + 356))) + 31), (this._loadInt((_36_ + 308))));
                                                                                                                                }
                                                                                                                                while (false);
                                                                                                                                this._storeInt((_36_ + 308), (sqlite3PagerLockingMode((this._storeInt((_36_ + 304), (sqlite3BtreePager((this._loadInt(((this._loadInt((_36_ + 352))) + 4))))))), (this._loadInt((_36_ + 308))))));
                                                                                                                                break label$8;
                                                                                                                            }
                                                                                                                            while (false);
                                                                                                                            sqlite3VdbeAddOp3((this._loadInt((_36_ + 348))), 135, (this._loadInt((_36_ + 360))), (this._loadInt((_36_ + 316))), (sqlite3Atoi((this._loadInt((_36_ + 372))))));
                                                                                                                        }
                                                                                                                        while (false);
                                                                                                                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 16, (this._loadInt((_36_ + 316))), 1);
                                                                                                                        sqlite3VdbeSetNumCols((this._loadInt((_36_ + 348))), 1);
                                                                                                                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 0, 0, (this._loadInt((_36_ + 376))), -1);
                                                                                                                        break label$6;
                                                                                                                    }
                                                                                                                    while (false);
                                                                                                                    if ((sqlite3ReadSchema((this._loadInt((_36_ + 396))))) != 0) {
                                                                                                                        break label$5;
                                                                                                                    }
                                                                                                                    sqlite3VdbeSetNumCols((this._loadInt((_36_ + 348))), 1);
                                                                                                                    sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 0, 0, 43136, 0);
                                                                                                                    if ((this._loadInt((_36_ + 372))) == 0) {
                                                                                                                        break label$25;
                                                                                                                    }
                                                                                                                    this._storeInt((_36_ + 284), (sqlite3Strlen30((this._loadInt((_36_ + 372))))));
                                                                                                                    this._storeInt((_36_ + 296), 0);
                                                                                                                    label$51:
                                                                                                                    do {
                                                                                                                        label$50:
                                                                                                                        while (true) {
                                                                                                                            if ((this._storeInt((_36_ + 288), (sqlite3JournalModename((this._loadInt((_36_ + 296))))))) == 0) {
                                                                                                                                break label$51;
                                                                                                                            }
                                                                                                                            if ((sqlite3_strnicmp((this._loadInt((_36_ + 372))), (this._loadInt((_36_ + 288))), (this._loadInt((_36_ + 284))))) == 0) {
                                                                                                                                break label$51;
                                                                                                                            }
                                                                                                                            this._storeInt((_36_ + 296), ((this._loadInt((_36_ + 296))) + 1));
                                                                                                                            continue label$50;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    while (false);
                                                                                                                    if ((this._loadInt((_36_ + 288))) != 0) {
                                                                                                                        break label$24;
                                                                                                                    }
                                                                                                                    this._storeInt((_36_ + 296), -1);
                                                                                                                    break label$24;
                                                                                                                }
                                                                                                                while (false);
                                                                                                                this._storeInt((_36_ + 280), (sqlite3BtreePager((this._loadInt(((this._loadInt((_36_ + 352))) + 4))))));
                                                                                                                _35_ = this._storeLong((_36_ + 272), -2L);
                                                                                                                label$52:
                                                                                                                do {
                                                                                                                    if ((this._loadInt((_36_ + 372))) == 0) {
                                                                                                                        break label$52;
                                                                                                                    }
                                                                                                                    sqlite3Atoi64((this._loadInt((_36_ + 372))), (_36_ + 272), 1000000, 1);
                                                                                                                    if ((this._loadLong((_36_ + 272))) > _35_) {
                                                                                                                        break label$52;
                                                                                                                    }
                                                                                                                    this._storeLong((_36_ + 272), -1L);
                                                                                                                }
                                                                                                                while (false);
                                                                                                                _35_ = this._storeLong((_36_ + 272), (sqlite3PagerJournalSizeLimit((this._loadInt((_36_ + 280))), (this._loadLong((_36_ + 272))))));
                                                                                                                returnSingleInt((this._loadInt((_36_ + 396))), 43152, _35_);
                                                                                                                break label$6;
                                                                                                            }
                                                                                                            while (false);
                                                                                                            this._storeInt((_36_ + 268), (this._loadInt(((this._loadInt((_36_ + 352))) + 4))));
                                                                                                            if ((sqlite3ReadSchema((this._loadInt((_36_ + 396))))) != 0) {
                                                                                                                break label$5;
                                                                                                            }
                                                                                                            if ((this._loadInt((_36_ + 372))) == 0) {
                                                                                                                break label$21;
                                                                                                            }
                                                                                                            _34_ = this._storeInt((_36_ + 260), (getAutoVacuum((this._loadInt((_36_ + 372))))));
                                                                                                            if ((this._storeInt8(((this._loadInt((_36_ + 356))) + 32), _34_)) < 0) {
                                                                                                                break label$6;
                                                                                                            }
                                                                                                            if ((this._storeInt((_36_ + 256), (sqlite3BtreeSetAutoVacuum((this._loadInt((_36_ + 268))), (this._loadInt((_36_ + 260))))))) != 0) {
                                                                                                                break label$6;
                                                                                                            }
                                                                                                            label$53:
                                                                                                            do {
                                                                                                                if ((this._loadInt((_36_ + 260))) == 1) {
                                                                                                                    break label$53;
                                                                                                                }
                                                                                                                if ((this._loadInt((_36_ + 260))) != 2) {
                                                                                                                    break label$6;
                                                                                                                }
                                                                                                            }
                                                                                                            while (false);
                                                                                                            _34_ = this._storeInt((_36_ + 252), (sqlite3VdbeAddOpList((this._loadInt((_36_ + 348))), 6, 43200)));
                                                                                                            sqlite3VdbeChangeP1((this._loadInt((_36_ + 348))), _34_, (this._loadInt((_36_ + 360))));
                                                                                                            sqlite3VdbeChangeP1((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 252))) + 1), (this._loadInt((_36_ + 360))));
                                                                                                            sqlite3VdbeChangeP2((this._loadInt((_36_ + 348))), ((_34_ = this._loadInt((_36_ + 252))) + 2), (_34_ + 4));
                                                                                                            sqlite3VdbeChangeP1((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 252))) + 4), ((this._loadInt((_36_ + 260))) + -1));
                                                                                                            sqlite3VdbeChangeP1((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 252))) + 5), (this._loadInt((_36_ + 360))));
                                                                                                            sqlite3VdbeUsesBtree((this._loadInt((_36_ + 348))), (this._loadInt((_36_ + 360))));
                                                                                                            break label$6;
                                                                                                        }
                                                                                                        while (false);
                                                                                                        if ((sqlite3ReadSchema((this._loadInt((_36_ + 396))))) != 0) {
                                                                                                            break label$5;
                                                                                                        }
                                                                                                        label$54:
                                                                                                        do {
                                                                                                            label$55:
                                                                                                            do {
                                                                                                                if ((this._loadInt((_36_ + 372))) == 0) {
                                                                                                                    break label$55;
                                                                                                                }
                                                                                                                if ((sqlite3GetInt32((this._loadInt((_36_ + 372))), (_36_ + 248))) == 0) {
                                                                                                                    break label$55;
                                                                                                                }
                                                                                                                if ((this._loadInt((_36_ + 248))) > 0) {
                                                                                                                    break label$54;
                                                                                                                }
                                                                                                            }
                                                                                                            while (false);
                                                                                                            this._storeInt((_36_ + 248), 2147483647);
                                                                                                        }
                                                                                                        while (false);
                                                                                                        sqlite3BeginWriteOperation((this._loadInt((_36_ + 396))), 0, (this._loadInt((_36_ + 360))));
                                                                                                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 7, (this._loadInt((_36_ + 248))), 1);
                                                                                                        this._storeInt((_36_ + 244), (sqlite3VdbeAddOp1((this._loadInt((_36_ + 348))), 121, (this._loadInt((_36_ + 360))))));
                                                                                                        sqlite3VdbeAddOp1((this._loadInt((_36_ + 348))), 16, 1);
                                                                                                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 20, 1, -1);
                                                                                                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 113, 1, (this._loadInt((_36_ + 244))));
                                                                                                        sqlite3VdbeJumpHere((this._loadInt((_36_ + 348))), (this._loadInt((_36_ + 244))));
                                                                                                        break label$6;
                                                                                                    }
                                                                                                    while (false);
                                                                                                    this._storeInt((_36_ + 308), (this._loadInt8u(((this._loadInt((_36_ + 356))) + 31))));
                                                                                                    break label$8;
                                                                                                }
                                                                                                while (false);
                                                                                                if ((sqlite3ReadSchema((this._loadInt((_36_ + 396))))) != 0) {
                                                                                                    break label$5;
                                                                                                }
                                                                                                if ((this._loadInt((_36_ + 372))) == 0) {
                                                                                                    break label$17;
                                                                                                }
                                                                                                _33_ = this._storeInt((_36_ + 240), (sqlite3AbsInt32((sqlite3Atoi((this._loadInt((_36_ + 372))))))));
                                                                                                this._storeInt(((this._loadInt(((_34_ = this._loadInt((_36_ + 352))) + 12))) + 80), _33_);
                                                                                                sqlite3BtreeSetCacheSize((this._loadInt((_34_ + 4))), (this._loadInt(((this._loadInt((_34_ + 12))) + 80))));
                                                                                                break label$6;
                                                                                            }
                                                                                            while (false);
                                                                                            this._storeInt((_36_ + 296), -1);
                                                                                        }
                                                                                        while (false);
                                                                                        label$56:
                                                                                        do {
                                                                                            if ((this._loadInt((_36_ + 296))) != -1) {
                                                                                                break label$56;
                                                                                            }
                                                                                            if ((this._loadInt(((this._loadInt((_36_ + 388))) + 4))) != 0) {
                                                                                                break label$56;
                                                                                            }
                                                                                            this._storeInt((_36_ + 360), 0);
                                                                                            this._storeInt(((this._loadInt((_36_ + 388))) + 4), 1);
                                                                                        }
                                                                                        while (false);
                                                                                        this._storeInt((_36_ + 292), ((this._loadInt(((this._loadInt((_36_ + 356))) + 4))) + -1));
                                                                                        label$58:
                                                                                        do {
                                                                                            label$57:
                                                                                            while (true) {
                                                                                                if ((this._loadInt((_36_ + 292))) < 0) {
                                                                                                    break label$58;
                                                                                                }
                                                                                                label$59:
                                                                                                do {
                                                                                                    if ((this._loadInt((((this._loadInt(((this._loadInt((_36_ + 356))) + 8))) + ((this._loadInt((_36_ + 292))) << 4)) + 4))) == 0) {
                                                                                                        break label$59;
                                                                                                    }
                                                                                                    label$60:
                                                                                                    do {
                                                                                                        if ((this._loadInt((_36_ + 292))) == (this._loadInt((_36_ + 360)))) {
                                                                                                            break label$60;
                                                                                                        }
                                                                                                        if ((this._loadInt(((this._loadInt((_36_ + 388))) + 4))) != 0) {
                                                                                                            break label$59;
                                                                                                        }
                                                                                                    }
                                                                                                    while (false);
                                                                                                    sqlite3VdbeUsesBtree((this._loadInt((_36_ + 348))), (this._loadInt((_36_ + 292))));
                                                                                                    sqlite3VdbeAddOp3((this._loadInt((_36_ + 348))), 119, (this._loadInt((_36_ + 292))), 1, (this._loadInt((_36_ + 296))));
                                                                                                }
                                                                                                while (false);
                                                                                                this._storeInt((_36_ + 292), ((this._loadInt((_36_ + 292))) + -1));
                                                                                                continue label$57;
                                                                                            }
                                                                                        }
                                                                                        while (false);
                                                                                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 16, 1, 1);
                                                                                        break label$6;
                                                                                    }
                                                                                    while (false);
                                                                                    if ((this._loadInt((_36_ + 372))) == 0) {
                                                                                        break label$19;
                                                                                    }
                                                                                    changeTempStorage((this._loadInt((_36_ + 396))), (this._loadInt((_36_ + 372))));
                                                                                    break label$6;
                                                                                }
                                                                                while (false);
                                                                                if ((this._loadInt((_36_ + 372))) == 0) {
                                                                                    break label$18;
                                                                                }
                                                                                if ((this._loadInt8u((this._loadInt((_36_ + 372))))) == 0) {
                                                                                    break label$12;
                                                                                }
                                                                                if ((this._storeInt((_36_ + 236), (sqlite3OsAccess((this._loadInt((this._loadInt((_36_ + 356))))), (this._loadInt((_36_ + 372))), 1, (_36_ + 232))))) == 0) {
                                                                                    break label$13;
                                                                                }
                                                                                break label$9;
                                                                            }
                                                                            while (false);
                                                                            if ((this._loadInt((_36_ + 268))) == 0) {
                                                                                break label$16;
                                                                            }
                                                                            this._storeInt((_36_ + 264), (sqlite3BtreeGetAutoVacuum((this._loadInt((_36_ + 268))))));
                                                                            break label$15;
                                                                        }
                                                                        while (false);
                                                                        if ((sqlite3ReadSchema((this._loadInt((_36_ + 396))))) != 0) {
                                                                            break label$5;
                                                                        }
                                                                        if ((this._loadInt((_36_ + 372))) == 0) {
                                                                            break label$11;
                                                                        }
                                                                        if ((this._loadInt8u(((this._loadInt((_36_ + 356))) + 28))) == 0) {
                                                                            break label$10;
                                                                        }
                                                                        _34_ = getSafetyLevel((this._loadInt((_36_ + 372))));
                                                                        this._storeInt8(((this._loadInt((_36_ + 352))) + 9), (_34_ + 1));
                                                                        break label$6;
                                                                    }
                                                                    while (false);
                                                                    returnSingleInt((this._loadInt((_36_ + 396))), 43264, (this._loadLong8u(((this._loadInt((_36_ + 356))) + 29))));
                                                                    break label$6;
                                                                }
                                                                while (false);
                                                                if ((this._loadInt((0 + 19784))) == 0) {
                                                                    break label$6;
                                                                }
                                                                sqlite3VdbeSetNumCols((this._loadInt((_36_ + 348))), 1);
                                                                sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 0, 0, 43280, 0);
                                                                sqlite3VdbeAddOp4((this._loadInt((_36_ + 348))), 94, 0, 1, 0, (this._loadInt((0 + 19784))), 0);
                                                                sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 16, 1, 1);
                                                                break label$6;
                                                            }
                                                            while (false);
                                                            returnSingleInt((this._loadInt((_36_ + 396))), 42976, (this._loadLong32s(((this._loadInt(((this._loadInt((_36_ + 352))) + 12))) + 80))));
                                                            break label$6;
                                                        }
                                                        while (false);
                                                        this._storeInt((_36_ + 264), 0);
                                                    }
                                                    while (false);
                                                    returnSingleInt((this._loadInt((_36_ + 396))), 43184, (this._loadLong32s((_36_ + 264))));
                                                    break label$6;
                                                }
                                                while (false);
                                                if ((this._loadInt((_36_ + 372))) == 0) {
                                                    break label$7;
                                                }
                                                if ((sqlite3ReadSchema((this._loadInt((_36_ + 396))))) != 0) {
                                                    break label$5;
                                                }
                                                if ((this._storeInt((_36_ + 228), (sqlite3FindTable((this._loadInt((_36_ + 356))), (this._loadInt((_36_ + 372))), (this._loadInt((_36_ + 368))))))) == 0) {
                                                    break label$6;
                                                }
                                                _34_ = this._storeInt((_36_ + 220), 0);
                                                sqlite3VdbeSetNumCols((this._loadInt((_36_ + 348))), 6);
                                                _32_ = this._storeInt(((this._loadInt((_36_ + 396))) + 72), 6);
                                                sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), _34_, _34_, 43440, _34_);
                                                sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 1, _34_, 43456, _34_);
                                                sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 2, _34_, 43472, _34_);
                                                sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 3, _34_, 43488, _34_);
                                                sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 4, _34_, 43504, _34_);
                                                sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 5, _34_, 43520, _34_);
                                                sqlite3ViewGetColumnNames((this._loadInt((_36_ + 396))), (this._loadInt((_36_ + 228))));
                                                this._storeInt((_36_ + 224), _34_);
                                                this._storeInt((_36_ + 216), (this._loadInt(((this._loadInt((_36_ + 228))) + 12))));
                                                label$61:
                                                while (true) {
                                                    if ((this._loadInt((_36_ + 224))) >= (this._loadInt(((this._loadInt((_36_ + 228))) + 8)))) {
                                                        break label$6;
                                                    }
                                                    label$63:
                                                    do {
                                                        label$64:
                                                        do {
                                                            if ((this._loadInt8u(((this._loadInt((_36_ + 216))) + 23))) == 0) {
                                                                break label$64;
                                                            }
                                                            this._storeInt((_36_ + 220), ((this._loadInt((_36_ + 220))) + 1));
                                                            break label$63;
                                                        }
                                                        while (false);
                                                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 7, ((this._loadInt((_36_ + 224))) - (this._loadInt((_36_ + 220)))), 1);
                                                        sqlite3VdbeAddOp4((this._loadInt((_36_ + 348))), 94, _34_, 2, _34_, (this._loadInt((this._loadInt((_36_ + 216))))), _34_);
                                                        _33_ = 21392;
                                                        _31_ = this._loadInt((_36_ + 348));
                                                        label$65:
                                                        do {
                                                            if ((this._loadInt(((this._loadInt((_36_ + 216))) + 12))) == 0) {
                                                                break label$65;
                                                            }
                                                            _33_ = this._loadInt(((this._loadInt((_36_ + 216))) + 12));
                                                        }
                                                        while (false);
                                                        sqlite3VdbeAddOp4(_31_, 94, _34_, 3, _34_, _33_, _34_);
                                                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 7, (((this._loadInt8u(((this._loadInt((_36_ + 216))) + 20))) != _34_) ? 1 : 0), 4);
                                                        label$66:
                                                        do {
                                                            label$67:
                                                            do {
                                                                if ((this._loadInt(((this._loadInt((_36_ + 216))) + 8))) == 0) {
                                                                    break label$67;
                                                                }
                                                                sqlite3VdbeAddOp4((this._loadInt((_36_ + 348))), 94, _34_, 5, _34_, (this._loadInt(((this._loadInt((_36_ + 216))) + 8))), _34_);
                                                                break label$66;
                                                            }
                                                            while (false);
                                                            sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 10, _34_, 5);
                                                        }
                                                        while (false);
                                                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 7, (this._loadInt8u(((this._loadInt((_36_ + 216))) + 21))), _32_);
                                                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 16, 1, _32_);
                                                    }
                                                    while (false);
                                                    this._storeInt((_36_ + 224), ((this._loadInt((_36_ + 224))) + 1));
                                                    this._storeInt((_36_ + 216), ((this._loadInt((_36_ + 216))) + 24));
                                                    continue label$61;
                                                }
                                            }
                                            while (false);
                                            if ((this._loadInt((_36_ + 232))) == 0) {
                                                break label$9;
                                            }
                                        }
                                        while (false);
                                        label$68:
                                        do {
                                            if ((this._loadInt8u(((this._loadInt((_36_ + 356))) + 29))) > 1) {
                                                break label$68;
                                            }
                                            invalidateTempStorage((this._loadInt((_36_ + 396))));
                                        }
                                        while (false);
                                        sqlite3_free((this._loadInt((0 + 19784))));
                                        label$69:
                                        do {
                                            if ((this._loadInt8u((this._loadInt((_36_ + 372))))) == 0) {
                                                break label$69;
                                            }
                                            this._storeInt(_36_, (this._loadInt((_36_ + 372))));
                                            this._storeInt((0 + 19784), (sqlite3_mprintf(22192, _36_)));
                                            break label$6;
                                        }
                                        while (false);
                                        this._storeInt((0 + 19784), 0);
                                        break label$6;
                                    }
                                    while (false);
                                    returnSingleInt((this._loadInt((_36_ + 396))), 43344, ((long) ((this._loadInt8u(((this._loadInt((_36_ + 352))) + 9))) + -1)));
                                    break label$6;
                                }
                                while (false);
                                sqlite3ErrorMsg((this._loadInt((_36_ + 396))), 43360, 0);
                                break label$6;
                            }
                            while (false);
                            sqlite3ErrorMsg((this._loadInt((_36_ + 396))), 43312, 0);
                            break label$5;
                        }
                        while (false);
                        label$70:
                        do {
                            if ((this._loadInt((_36_ + 308))) != 1) {
                                break label$70;
                            }
                            this._storeInt((_36_ + 312), 43120);
                        }
                        while (false);
                        sqlite3VdbeSetNumCols((this._loadInt((_36_ + 348))), 1);
                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 0, 0, 43088, 0);
                        sqlite3VdbeAddOp4((this._loadInt((_36_ + 348))), 94, 0, 1, 0, (this._loadInt((_36_ + 312))), 0);
                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 16, 1, 1);
                        break label$6;
                    }
                    while (false);
                    label$71:
                    do {
                        if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43536)) != 0) {
                            break label$71;
                        }
                        if ((this._loadInt((_36_ + 372))) == 0) {
                            break label$71;
                        }
                        if ((sqlite3ReadSchema((this._loadInt((_36_ + 396))))) != 0) {
                            break label$5;
                        }
                        if ((this._storeInt((_36_ + 212), (sqlite3FindIndex((this._loadInt((_36_ + 356))), (this._loadInt((_36_ + 372))), (this._loadInt((_36_ + 368))))))) == 0) {
                            break label$6;
                        }
                        this._storeInt((_36_ + 208), (this._loadInt(((this._loadInt((_36_ + 212))) + 16))));
                        sqlite3VdbeSetNumCols((this._loadInt((_36_ + 348))), 3);
                        _33_ = this._storeInt(((this._loadInt((_36_ + 396))) + 72), 3);
                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 0, 0, 43552, 0);
                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 1, 0, 43440, 0);
                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 2, 0, 43456, 0);
                        _34_ = this._storeInt((_36_ + 204), 0);
                        label$72:
                        while (true) {
                            if ((this._loadInt((_36_ + 204))) >= (this._loadInt(((this._loadInt((_36_ + 212))) + 4)))) {
                                break label$6;
                            }
                            this._storeInt((_36_ + 200), (this._loadInt(((this._loadInt(((this._loadInt((_36_ + 212))) + 8))) + ((this._loadInt((_36_ + 204))) << 2)))));
                            sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 7, (this._loadInt((_36_ + 204))), 1);
                            sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 7, (this._loadInt((_36_ + 200))), 2);
                            sqlite3VdbeAddOp4((this._loadInt((_36_ + 348))), 94, _34_, _33_, _34_, (this._loadInt(((this._loadInt(((this._loadInt((_36_ + 208))) + 12))) + ((this._loadInt((_36_ + 200))) * 24)))), _34_);
                            sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 16, 1, _33_);
                            this._storeInt((_36_ + 204), ((this._loadInt((_36_ + 204))) + 1));
                            continue label$72;
                        }
                    }
                    while (false);
                    label$74:
                    do {
                        if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43568)) != 0) {
                            break label$74;
                        }
                        if ((this._loadInt((_36_ + 372))) == 0) {
                            break label$74;
                        }
                        if ((sqlite3ReadSchema((this._loadInt((_36_ + 396))))) != 0) {
                            break label$5;
                        }
                        if ((this._storeInt((_36_ + 192), (sqlite3FindTable((this._loadInt((_36_ + 356))), (this._loadInt((_36_ + 372))), (this._loadInt((_36_ + 368))))))) == 0) {
                            break label$6;
                        }
                        this._storeInt((_36_ + 348), (sqlite3GetVdbe((this._loadInt((_36_ + 396))))));
                        if ((this._storeInt((_36_ + 196), (this._loadInt(((this._loadInt((_36_ + 192))) + 16))))) == 0) {
                            break label$6;
                        }
                        _34_ = this._storeInt((_36_ + 188), 0);
                        sqlite3VdbeSetNumCols((this._loadInt((_36_ + 348))), 3);
                        _33_ = this._storeInt(((this._loadInt((_36_ + 396))) + 72), 3);
                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), _34_, _34_, 43584, _34_);
                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 1, _34_, 43456, _34_);
                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 2, _34_, 43600, _34_);
                        label$75:
                        while (true) {
                            if ((this._loadInt((_36_ + 196))) == 0) {
                                break label$6;
                            }
                            sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 7, (this._loadInt((_36_ + 188))), 1);
                            sqlite3VdbeAddOp4((this._loadInt((_36_ + 348))), 94, _34_, 2, _34_, (this._loadInt((this._loadInt((_36_ + 196))))), _34_);
                            sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 7, (((this._loadInt8u(((this._loadInt((_36_ + 196))) + 24))) != _34_) ? 1 : 0), _33_);
                            sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 16, 1, _33_);
                            this._storeInt((_36_ + 188), ((this._loadInt((_36_ + 188))) + 1));
                            this._storeInt((_36_ + 196), (this._loadInt(((this._loadInt((_36_ + 196))) + 32))));
                            continue label$75;
                        }
                    }
                    while (false);
                    label$77:
                    do {
                        label$78:
                        do {
                            label$79:
                            do {
                                label$80:
                                do {
                                    if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43616)) == 0) {
                                        break label$80;
                                    }
                                    if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43648)) == 0) {
                                        break label$79;
                                    }
                                    if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43664)) == 0) {
                                        break label$78;
                                    }
                                    break label$77;
                                }
                                while (false);
                                if ((sqlite3ReadSchema((this._loadInt((_36_ + 396))))) != 0) {
                                    break label$5;
                                }
                                sqlite3VdbeSetNumCols((this._loadInt((_36_ + 348))), 3);
                                _33_ = this._storeInt(((this._loadInt((_36_ + 396))) + 72), 3);
                                sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 0, 0, 43584, 0);
                                sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 1, 0, 43456, 0);
                                sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 2, 0, 43632, 0);
                                _34_ = this._storeInt((_36_ + 184), 0);
                                label$81:
                                while (true) {
                                    if ((this._loadInt((_36_ + 184))) >= (this._loadInt(((this._loadInt((_36_ + 356))) + 4)))) {
                                        break label$6;
                                    }
                                    label$83:
                                    do {
                                        if ((this._loadInt((((this._loadInt(((this._loadInt((_36_ + 356))) + 8))) + ((this._loadInt((_36_ + 184))) << 4)) + 4))) == 0) {
                                            break label$83;
                                        }
                                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 7, (this._loadInt((_36_ + 184))), 1);
                                        sqlite3VdbeAddOp4((this._loadInt((_36_ + 348))), 94, _34_, 2, _34_, (this._loadInt(((this._loadInt(((this._loadInt((_36_ + 356))) + 8))) + ((this._loadInt((_36_ + 184))) << 4)))), _34_);
                                        sqlite3VdbeAddOp4((this._loadInt((_36_ + 348))), 94, _34_, _33_, _34_, (sqlite3BtreeGetFilename((this._loadInt((((this._loadInt(((this._loadInt((_36_ + 356))) + 8))) + ((this._loadInt((_36_ + 184))) << 4)) + 4))))), _34_);
                                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 16, 1, _33_);
                                    }
                                    while (false);
                                    this._storeInt((_36_ + 184), ((this._loadInt((_36_ + 184))) + 1));
                                    continue label$81;
                                }
                            }
                            while (false);
                            _34_ = this._storeInt((_36_ + 180), 0);
                            sqlite3VdbeSetNumCols((this._loadInt((_36_ + 348))), 2);
                            _33_ = this._storeInt(((this._loadInt((_36_ + 396))) + 72), 2);
                            sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), _34_, _34_, 43584, _34_);
                            sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 1, _34_, 43456, _34_);
                            this._storeInt((_36_ + 176), (this._loadInt(((this._loadInt((_36_ + 356))) + 420))));
                            label$84:
                            while (true) {
                                if ((this._loadInt((_36_ + 176))) == 0) {
                                    break label$6;
                                }
                                this._storeInt((_36_ + 172), (this._loadInt(((this._loadInt((_36_ + 176))) + 8))));
                                _32_ = this._loadInt((_36_ + 348));
                                this._storeInt((_36_ + 180), ((_31_ = this._loadInt((_36_ + 180))) + 1));
                                sqlite3VdbeAddOp2(_32_, 7, _31_, 1);
                                sqlite3VdbeAddOp4((this._loadInt((_36_ + 348))), 94, _34_, _33_, _34_, (this._loadInt((this._loadInt((_36_ + 172))))), _34_);
                                sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 16, 1, _33_);
                                this._storeInt((_36_ + 176), (this._loadInt((this._loadInt((_36_ + 176))))));
                                continue label$84;
                            }
                        }
                        while (false);
                        if ((this._loadInt((_36_ + 372))) == 0) {
                            break label$77;
                        }
                        if ((sqlite3ReadSchema((this._loadInt((_36_ + 396))))) != 0) {
                            break label$5;
                        }
                        if ((this._storeInt((_36_ + 164), (sqlite3FindTable((this._loadInt((_36_ + 356))), (this._loadInt((_36_ + 372))), (this._loadInt((_36_ + 368))))))) == 0) {
                            break label$6;
                        }
                        this._storeInt((_36_ + 348), (sqlite3GetVdbe((this._loadInt((_36_ + 396))))));
                        if ((this._storeInt((_36_ + 168), (this._loadInt(((this._loadInt((_36_ + 164))) + 36))))) == 0) {
                            break label$6;
                        }
                        _31_ = this._storeInt((_36_ + 160), 0);
                        sqlite3VdbeSetNumCols((this._loadInt((_36_ + 348))), 8);
                        _33_ = this._storeInt(((this._loadInt((_36_ + 396))) + 72), 8);
                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), _31_, _31_, 43696, _31_);
                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 1, _31_, 43584, _31_);
                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 2, _31_, 43712, _31_);
                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 3, _31_, 33296, _31_);
                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 4, _31_, 43728, _31_);
                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 5, _31_, 43744, _31_);
                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 6, _31_, 43760, _31_);
                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 7, _31_, 43776, _31_);
                        label$86:
                        while (true) {
                            if ((this._loadInt((_36_ + 168))) == 0) {
                                break label$6;
                            }
                            _34_ = this._storeInt((_36_ + 156), _31_);
                            label$89:
                            do {
                                label$88:
                                while (true) {
                                    if ((this._loadInt((_36_ + 156))) >= (this._loadInt(((this._loadInt((_36_ + 168))) + 20)))) {
                                        break label$89;
                                    }
                                    this._storeInt((_36_ + 152), (this._loadInt((((this._loadInt((_36_ + 168))) + ((this._loadInt((_36_ + 156))) << 3)) + 40))));
                                    this._storeInt((_36_ + 148), (actionName((this._loadInt8u(((this._loadInt((_36_ + 168))) + 25))))));
                                    this._storeInt((_36_ + 144), (actionName((this._loadInt8u(((this._loadInt((_36_ + 168))) + 26))))));
                                    sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 7, (this._loadInt((_36_ + 160))), 1);
                                    sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 7, (this._loadInt((_36_ + 156))), 2);
                                    sqlite3VdbeAddOp4((this._loadInt((_36_ + 348))), 94, _34_, 3, _34_, (this._loadInt(((this._loadInt((_36_ + 168))) + 8))), _34_);
                                    sqlite3VdbeAddOp4((this._loadInt((_36_ + 348))), 94, _34_, 4, _34_, (this._loadInt(((this._loadInt(((this._loadInt((_36_ + 164))) + 12))) + ((this._loadInt((((this._loadInt((_36_ + 168))) + ((this._loadInt((_36_ + 156))) << 3)) + 36))) * 24)))), _34_);
                                    _temp$0 = 94;
                                    _temp$1 = 10;
                                    _temp$2 = ((_32_ = this._loadInt((_36_ + 152))) != 0) ? _temp$0 : _temp$1;
                                    sqlite3VdbeAddOp4((this._loadInt((_36_ + 348))), _temp$2, _34_, 5, _34_, _32_, _34_);
                                    sqlite3VdbeAddOp4((this._loadInt((_36_ + 348))), 94, _34_, 6, _34_, (this._loadInt((_36_ + 144))), _34_);
                                    sqlite3VdbeAddOp4((this._loadInt((_36_ + 348))), 94, _34_, 7, _34_, (this._loadInt((_36_ + 148))), _34_);
                                    sqlite3VdbeAddOp4((this._loadInt((_36_ + 348))), 94, _34_, _33_, _34_, 43792, _34_);
                                    sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 16, 1, _33_);
                                    this._storeInt((_36_ + 156), ((this._loadInt((_36_ + 156))) + 1));
                                    continue label$88;
                                }
                            }
                            while (false);
                            this._storeInt((_36_ + 160), ((this._loadInt((_36_ + 160))) + 1));
                            this._storeInt((_36_ + 168), (this._loadInt(((this._loadInt((_36_ + 168))) + 4))));
                            continue label$86;
                        }
                    }
                    while (false);
                    label$90:
                    do {
                        if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43808)) == 0) {
                            break label$90;
                        }
                        label$91:
                        do {
                            label$92:
                            do {
                                label$93:
                                do {
                                    label$94:
                                    do {
                                        label$95:
                                        do {
                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43840)) == 0) {
                                                break label$95;
                                            }
                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 43856)) == 0) {
                                                break label$95;
                                            }
                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 44112)) == 0) {
                                                break label$92;
                                            }
                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 44240)) == 0) {
                                                break label$91;
                                            }
                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 44256)) == 0) {
                                                break label$91;
                                            }
                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 44272)) == 0) {
                                                break label$91;
                                            }
                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 44320)) == 0) {
                                                break label$93;
                                            }
                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 44352)) == 0) {
                                                break label$94;
                                            }
                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 376))), 44448)) != 0) {
                                                break label$6;
                                            }
                                            label$96:
                                            do {
                                                if ((this._loadInt((_36_ + 372))) == 0) {
                                                    break label$96;
                                                }
                                                sqlite3_wal_autocheckpoint((this._loadInt((_36_ + 356))), (sqlite3Atoi((this._loadInt((_36_ + 372))))));
                                            }
                                            while (false);
                                            _34_ = 0;
                                            _33_ = this._loadInt((_36_ + 396));
                                            label$97:
                                            do {
                                                if ((this._loadInt(((this._loadInt((_36_ + 356))) + 192))) != 24) {
                                                    break label$97;
                                                }
                                                _34_ = this._loadInt(((this._loadInt((_36_ + 356))) + 196));
                                            }
                                            while (false);
                                            returnSingleInt(_33_, 44448, ((long) _34_));
                                            break label$6;
                                        }
                                        while (false);
                                        this._storeInt((_36_ + 124), (((this._loadInt8s((this._loadInt((_36_ + 376))))) == 113) ? 1 : 0));
                                        if ((sqlite3ReadSchema((this._loadInt((_36_ + 396))))) != 0) {
                                            break label$5;
                                        }
                                        _33_ = this._storeInt(((this._loadInt((_36_ + 396))) + 72), 6);
                                        sqlite3VdbeSetNumCols((this._loadInt((_36_ + 348))), 1);
                                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 0, 0, 43840, 0);
                                        this._storeInt((_36_ + 128), 100);
                                        label$98:
                                        do {
                                            if ((this._loadInt((_36_ + 372))) == 0) {
                                                break label$98;
                                            }
                                            sqlite3GetInt32((this._loadInt((_36_ + 372))), (_36_ + 128));
                                            if ((this._loadInt((_36_ + 128))) > 0) {
                                                break label$98;
                                            }
                                            this._storeInt((_36_ + 128), 100);
                                        }
                                        while (false);
                                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 7, (this._loadInt((_36_ + 128))), 1);
                                        _30_ = this._storeInt((_36_ + 140), 0);
                                        label$99:
                                        while (true) {
                                            label$101:
                                            do {
                                                label$102:
                                                do {
                                                    if ((this._loadInt((_36_ + 140))) >= (this._loadInt(((this._loadInt((_36_ + 356))) + 4)))) {
                                                        break label$102;
                                                    }
                                                    _31_ = this._storeInt((_36_ + 112), _30_);
                                                    sqlite3CodeVerifySchema((this._loadInt((_36_ + 396))), (this._loadInt((_36_ + 140))));
                                                    this._storeInt((_36_ + 132), (sqlite3VdbeAddOp1((this._loadInt((_36_ + 348))), 113, 1)));
                                                    sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), _33_, _31_, _31_);
                                                    sqlite3VdbeJumpHere((this._loadInt((_36_ + 348))), (this._loadInt((_36_ + 132))));
                                                    this._storeInt((_36_ + 116), ((this._loadInt((((this._loadInt(((this._loadInt((_36_ + 356))) + 8))) + ((this._loadInt((_36_ + 140))) << 4)) + 12))) + 8));
                                                    this._storeInt((_36_ + 120), (this._loadInt(((this._loadInt((_36_ + 116))) + 8))));
                                                    label$103:
                                                    while (true) {
                                                        label$105:
                                                        do {
                                                            label$106:
                                                            do {
                                                                if ((this._loadInt((_36_ + 120))) == 0) {
                                                                    break label$106;
                                                                }
                                                                _34_ = this._storeInt((_36_ + 108), (this._loadInt(((this._loadInt((_36_ + 120))) + 8))));
                                                                sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 7, (this._loadInt((_34_ + 20))), ((this._loadInt((_36_ + 112))) + 2));
                                                                this._storeInt((_36_ + 112), ((this._loadInt((_36_ + 112))) + 1));
                                                                this._storeInt((_36_ + 104), (this._loadInt(((this._loadInt((_36_ + 108))) + 16))));
                                                                label$107:
                                                                while (true) {
                                                                    if ((this._loadInt((_36_ + 104))) == 0) {
                                                                        break label$105;
                                                                    }
                                                                    sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 7, (this._loadInt(((this._loadInt((_36_ + 104))) + 20))), ((this._loadInt((_36_ + 112))) + 2));
                                                                    this._storeInt((_36_ + 112), ((this._loadInt((_36_ + 112))) + 1));
                                                                    this._storeInt((_36_ + 104), (this._loadInt(((this._loadInt((_36_ + 104))) + 32))));
                                                                    continue label$107;
                                                                }
                                                            }
                                                            while (false);
                                                            label$109:
                                                            do {
                                                                if ((this._loadInt(((this._loadInt((_36_ + 396))) + 72))) >= ((this._loadInt((_36_ + 112))) + 4)) {
                                                                    break label$109;
                                                                }
                                                                this._storeInt(((this._loadInt((_36_ + 396))) + 72), ((this._loadInt((_36_ + 112))) + 4));
                                                            }
                                                            while (false);
                                                            sqlite3VdbeAddOp3((this._loadInt((_36_ + 348))), 104, 2, (this._loadInt((_36_ + 112))), 1);
                                                            sqlite3VdbeChangeP5((this._loadInt((_36_ + 348))), (this._loadInt8u((_36_ + 140))));
                                                            this._storeInt((_36_ + 132), (sqlite3VdbeAddOp1((this._loadInt((_36_ + 348))), 73, 2)));
                                                            _34_ = this._loadInt((_36_ + 348));
                                                            this._storeInt((_36_ + 16), (this._loadInt(((this._loadInt(((_32_ = this._loadInt((_36_ + 356))) + 8))) + ((this._loadInt((_36_ + 140))) << 4)))));
                                                            sqlite3VdbeAddOp4(_34_, 94, _31_, 3, _31_, (sqlite3MPrintf(_32_, 43872, (_36_ + 16))), -1);
                                                            sqlite3VdbeAddOp3((this._loadInt((_36_ + 348))), 13, 2, 4, 1);
                                                            sqlite3VdbeAddOp3((this._loadInt((_36_ + 348))), 91, 4, 3, 2);
                                                            sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 16, 2, 1);
                                                            sqlite3VdbeJumpHere((this._loadInt((_36_ + 348))), (this._loadInt((_36_ + 132))));
                                                            this._storeInt((_36_ + 120), (this._loadInt(((this._loadInt((_36_ + 116))) + 8))));
                                                            label$110:
                                                            while (true) {
                                                                _34_ = 0;
                                                                label$112:
                                                                do {
                                                                    if ((this._loadInt((_36_ + 120))) == 0) {
                                                                        break label$112;
                                                                    }
                                                                    _34_ = ((this._loadInt((_36_ + 124))) == 0) ? 1 : 0;
                                                                }
                                                                while (false);
                                                                if (_34_ == 0) {
                                                                    break label$101;
                                                                }
                                                                label$113:
                                                                do {
                                                                    if ((this._loadInt(((this._storeInt((_36_ + 100), (this._loadInt(((this._loadInt((_36_ + 120))) + 8))))) + 16))) == 0) {
                                                                        break label$113;
                                                                    }
                                                                    this._storeInt((_36_ + 132), (sqlite3VdbeAddOp1((this._loadInt((_36_ + 348))), 113, 1)));
                                                                    sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), _33_, _31_, _31_);
                                                                    sqlite3VdbeJumpHere((this._loadInt((_36_ + 348))), (this._loadInt((_36_ + 132))));
                                                                    sqlite3OpenTableAndIndices((this._loadInt((_36_ + 396))), (this._loadInt((_36_ + 100))), 1, 38);
                                                                    sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 7, _31_, 2);
                                                                    this._storeInt((_36_ + 92), (sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 65, 1, _31_)));
                                                                    sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 20, 2, 1);
                                                                    _34_ = this._storeInt((_36_ + 136), _31_);
                                                                    this._storeInt((_36_ + 96), (this._loadInt(((this._loadInt((_36_ + 100))) + 16))));
                                                                    label$115:
                                                                    do {
                                                                        label$114:
                                                                        while (true) {
                                                                            if ((this._loadInt((_36_ + 96))) == 0) {
                                                                                break label$115;
                                                                            }
                                                                            _32_ = this._storeInt((_36_ + 84), (sqlite3GenerateIndexKey((this._loadInt((_36_ + 396))), (this._loadInt((_36_ + 96))), 1, 3, _34_)));
                                                                            this._storeInt((_36_ + 88), (sqlite3VdbeAddOp4Int((this._loadInt((_36_ + 348))), 50, ((this._loadInt((_36_ + 136))) + 2), _34_, _32_, ((this._loadInt(((this._loadInt((_36_ + 96))) + 4))) + 1))));
                                                                            _32_ = this._storeInt((_36_ + 132), (sqlite3VdbeAddOpList((this._loadInt((_36_ + 348))), 11, 43904)));
                                                                            sqlite3VdbeChangeP4((this._loadInt((_36_ + 348))), (_32_ + 1), 43952, -2);
                                                                            sqlite3VdbeChangeP4((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 132))) + 3), 43968, -2);
                                                                            sqlite3VdbeChangeP4((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 132))) + 4), (this._loadInt((this._loadInt((_36_ + 96))))), _34_);
                                                                            sqlite3VdbeJumpHere((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 132))) + 9));
                                                                            sqlite3VdbeJumpHere((this._loadInt((_36_ + 348))), (this._loadInt((_36_ + 88))));
                                                                            this._storeInt((_36_ + 96), (this._loadInt(((this._loadInt((_36_ + 96))) + 32))));
                                                                            this._storeInt((_36_ + 136), ((this._loadInt((_36_ + 136))) + 1));
                                                                            continue label$114;
                                                                        }
                                                                    }
                                                                    while (false);
                                                                    sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 67, 1, ((this._loadInt((_36_ + 92))) + 1));
                                                                    sqlite3VdbeJumpHere((this._loadInt((_36_ + 348))), (this._loadInt((_36_ + 92))));
                                                                    this._storeInt((_36_ + 136), _34_);
                                                                    this._storeInt((_36_ + 96), (this._loadInt(((this._loadInt((_36_ + 100))) + 16))));
                                                                    label$117:
                                                                    do {
                                                                        label$116:
                                                                        while (true) {
                                                                            if ((this._loadInt((_36_ + 96))) == 0) {
                                                                                break label$117;
                                                                            }
                                                                            this._storeInt((_36_ + 132), (sqlite3VdbeAddOp1((this._loadInt((_36_ + 348))), 113, 1)));
                                                                            sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), _33_, _34_, _34_);
                                                                            sqlite3VdbeJumpHere((this._loadInt((_36_ + 348))), (this._loadInt((_36_ + 132))));
                                                                            _32_ = this._storeInt((_36_ + 132), (sqlite3VdbeAddOpList((this._loadInt((_36_ + 348))), 10, 44000)));
                                                                            sqlite3VdbeChangeP1((this._loadInt((_36_ + 348))), (_32_ + 1), ((this._loadInt((_36_ + 136))) + 2));
                                                                            sqlite3VdbeChangeP2((this._loadInt((_36_ + 348))), ((_32_ = this._loadInt((_36_ + 132))) + 1), (_32_ + 4));
                                                                            sqlite3VdbeChangeP1((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 132))) + 3), ((this._loadInt((_36_ + 136))) + 2));
                                                                            sqlite3VdbeChangeP2((this._loadInt((_36_ + 348))), ((_32_ = this._loadInt((_36_ + 132))) + 3), (_32_ + 2));
                                                                            sqlite3VdbeJumpHere((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 132))) + 4));
                                                                            sqlite3VdbeChangeP4((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 132))) + _33_), 44048, -2);
                                                                            sqlite3VdbeChangeP4((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 132))) + 7), (this._loadInt((this._loadInt((_36_ + 96))))), _34_);
                                                                            this._storeInt((_36_ + 96), (this._loadInt(((this._loadInt((_36_ + 96))) + 32))));
                                                                            this._storeInt((_36_ + 136), ((this._loadInt((_36_ + 136))) + 1));
                                                                            continue label$116;
                                                                        }
                                                                    }
                                                                    while (false);
                                                                }
                                                                while (false);
                                                                this._storeInt((_36_ + 120), (this._loadInt((this._loadInt((_36_ + 120))))));
                                                                continue label$110;
                                                            }
                                                        }
                                                        while (false);
                                                        this._storeInt((_36_ + 120), (this._loadInt((this._loadInt((_36_ + 120))))));
                                                        continue label$103;
                                                    }
                                                }
                                                while (false);
                                                _34_ = this._storeInt((_36_ + 132), (sqlite3VdbeAddOpList((this._loadInt((_36_ + 348))), 4, 44080)));
                                                sqlite3VdbeChangeP2((this._loadInt((_36_ + 348))), _34_, (0 - (this._loadInt((_36_ + 128)))));
                                                sqlite3VdbeJumpHere((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 132))) + 1));
                                                sqlite3VdbeChangeP4((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 132))) + 2), 44096, -2);
                                                break label$6;
                                            }
                                            while (false);
                                            this._storeInt((_36_ + 140), ((this._loadInt((_36_ + 140))) + 1));
                                            continue label$99;
                                        }
                                    }
                                    while (false);
                                    _34_ = 10;
                                    label$118:
                                    do {
                                        if ((this._loadInt((this._loadInt((_36_ + 388))))) == 0) {
                                            break label$118;
                                        }
                                        _34_ = this._loadInt((_36_ + 360));
                                    }
                                    while (false);
                                    this._storeInt((_36_ + 56), _34_);
                                    this._storeInt((_36_ + 52), 0);
                                    label$119:
                                    do {
                                        if ((this._loadInt((_36_ + 372))) == 0) {
                                            break label$119;
                                        }
                                        label$120:
                                        do {
                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 372))), 44368)) == 0) {
                                                break label$120;
                                            }
                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 372))), 44384)) != 0) {
                                                break label$119;
                                            }
                                            this._storeInt((_36_ + 52), 2);
                                            break label$119;
                                        }
                                        while (false);
                                        this._storeInt((_36_ + 52), 1);
                                    }
                                    while (false);
                                    if ((sqlite3ReadSchema((this._loadInt((_36_ + 396))))) != 0) {
                                        break label$5;
                                    }
                                    sqlite3VdbeSetNumCols((this._loadInt((_36_ + 348))), 3);
                                    _34_ = this._storeInt(((this._loadInt((_36_ + 396))) + 72), 3);
                                    sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 0, 0, 44400, 0);
                                    sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 1, 0, 44416, 0);
                                    sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 2, 0, 44432, 0);
                                    sqlite3VdbeAddOp3((this._loadInt((_36_ + 348))), 118, (this._loadInt((_36_ + 56))), (this._loadInt((_36_ + 52))), 1);
                                    sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 16, 1, _34_);
                                    break label$6;
                                }
                                while (false);
                                _33_ = this._storeInt((_36_ + 64), 0);
                                sqlite3VdbeSetNumCols((this._loadInt((_36_ + 348))), 1);
                                _34_ = this._storeInt(((this._loadInt((_36_ + 396))) + 72), 1);
                                sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), _33_, _33_, 44336, _33_);
                                label$121:
                                while (true) {
                                    this._storeInt((_36_ + 64), ((_32_ = this._loadInt((_36_ + 64))) + _34_));
                                    if ((this._storeInt((_36_ + 60), (sqlite3_compileoption_get(_32_)))) == 0) {
                                        break label$6;
                                    }
                                    sqlite3VdbeAddOp4((this._loadInt((_36_ + 348))), 94, _33_, _34_, _33_, (this._loadInt((_36_ + 60))), _33_);
                                    sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 16, _34_, _34_);
                                    continue label$121;
                                }
                            }
                            while (false);
                            label$123:
                            do {
                                label$124:
                                do {
                                    label$125:
                                    do {
                                        label$126:
                                        do {
                                            if ((this._loadInt((_36_ + 372))) == 0) {
                                                break label$126;
                                            }
                                            label$127:
                                            do {
                                                if (((this._loadInt16u(((this._loadInt(((this._loadInt(((this._loadInt((_36_ + 356))) + 8))) + 12))) + 78))) & 1) == 0) {
                                                    break label$127;
                                                }
                                                if (((this._loadInt16u(((this._loadInt(((this._loadInt(((this._loadInt((_36_ + 356))) + 8))) + 12))) + 78))) & 4) == 0) {
                                                    break label$6;
                                                }
                                            }
                                            while (false);
                                            this._storeInt((_36_ + 80), 44128);
                                            label$129:
                                            do {
                                                label$128:
                                                while (true) {
                                                    if ((this._loadInt((this._loadInt((_36_ + 80))))) == 0) {
                                                        break label$123;
                                                    }
                                                    if ((sqlite3StrICmp((this._loadInt((_36_ + 372))), (this._loadInt((this._loadInt((_36_ + 80))))))) == 0) {
                                                        break label$129;
                                                    }
                                                    this._storeInt((_36_ + 80), ((this._loadInt((_36_ + 80))) + 8));
                                                    continue label$128;
                                                }
                                            }
                                            while (false);
                                            if ((this._loadInt8u(((this._loadInt((_36_ + 80))) + 4))) == 0) {
                                                break label$125;
                                            }
                                            _34_ = this._loadInt8u(((this._loadInt((_36_ + 80))) + 4));
                                            break label$124;
                                        }
                                        while (false);
                                        if ((sqlite3ReadSchema((this._loadInt((_36_ + 396))))) != 0) {
                                            break label$5;
                                        }
                                        sqlite3VdbeSetNumCols((this._loadInt((_36_ + 348))), 1);
                                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 0, 0, 44112, 0);
                                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 94, 0, 1);
                                        sqlite3VdbeChangeP4((this._loadInt((_36_ + 348))), -1, (this._loadInt((((this._loadInt8u(((this._loadInt(((this._loadInt(((this._loadInt((this._loadInt((_36_ + 396))))) + 8))) + 12))) + 77))) << 3) + 44128))), -2);
                                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 348))), 16, 1, 1);
                                        break label$6;
                                    }
                                    while (false);
                                    _temp$3 = 2;
                                    _temp$4 = 3;
                                    _temp$5 = ((this._loadInt8s((0 + 29180))) != 0) ? _temp$3 : _temp$4;
                                    _34_ = _temp$5;
                                }
                                while (false);
                                this._storeInt8(((this._loadInt(((this._loadInt(((this._loadInt((this._loadInt((_36_ + 396))))) + 8))) + 12))) + 77), _34_);
                            }
                            while (false);
                            if ((this._loadInt((this._loadInt((_36_ + 80))))) != 0) {
                                break label$6;
                            }
                            _34_ = this._loadInt((_36_ + 396));
                            this._storeInt((_36_ + 32), (this._loadInt((_36_ + 372))));
                            sqlite3ErrorMsg(_34_, 44208, (_36_ + 32));
                            break label$6;
                        }
                        while (false);
                        sqlite3VdbeUsesBtree((this._loadInt((_36_ + 348))), (this._loadInt((_36_ + 360))));
                        label$130:
                        do {
                            label$131:
                            do {
                                label$132:
                                do {
                                    label$133:
                                    do {
                                        label$134:
                                        do {
                                            if ((_34_ = this._loadInt8s((this._loadInt((_36_ + 376))))) > 101) {
                                                break label$134;
                                            }
                                            if (_34_ == 70) {
                                                break label$133;
                                            }
                                            if (_34_ == 83) {
                                                break label$132;
                                            }
                                            break label$131;
                                        }
                                        while (false);
                                        if (_34_ == 115) {
                                            break label$132;
                                        }
                                        if (_34_ != 102) {
                                            break label$131;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_36_ + 76), 0);
                                    break label$130;
                                }
                                while (false);
                                this._storeInt((_36_ + 76), 1);
                                break label$130;
                            }
                            while (false);
                            this._storeInt((_36_ + 76), 6);
                        }
                        while (false);
                        label$135:
                        do {
                            if ((this._loadInt((_36_ + 372))) == 0) {
                                break label$135;
                            }
                            if ((this._loadInt((_36_ + 76))) == 0) {
                                break label$135;
                            }
                            _34_ = this._storeInt((_36_ + 72), (sqlite3VdbeAddOpList((this._loadInt((_36_ + 348))), 3, 44288)));
                            sqlite3VdbeChangeP1((this._loadInt((_36_ + 348))), _34_, (this._loadInt((_36_ + 360))));
                            sqlite3VdbeChangeP1((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 72))) + 1), (sqlite3Atoi((this._loadInt((_36_ + 372))))));
                            sqlite3VdbeChangeP1((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 72))) + 2), (this._loadInt((_36_ + 360))));
                            sqlite3VdbeChangeP2((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 72))) + 2), (this._loadInt((_36_ + 76))));
                            break label$6;
                        }
                        while (false);
                        _34_ = this._storeInt((_36_ + 68), (sqlite3VdbeAddOpList((this._loadInt((_36_ + 348))), 3, 44304)));
                        sqlite3VdbeChangeP1((this._loadInt((_36_ + 348))), _34_, (this._loadInt((_36_ + 360))));
                        sqlite3VdbeChangeP1((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 68))) + 1), (this._loadInt((_36_ + 360))));
                        sqlite3VdbeChangeP3((this._loadInt((_36_ + 348))), ((this._loadInt((_36_ + 68))) + 1), (this._loadInt((_36_ + 76))));
                        sqlite3VdbeSetNumCols((this._loadInt((_36_ + 348))), 1);
                        sqlite3VdbeSetColName((this._loadInt((_36_ + 348))), 0, 0, (this._loadInt((_36_ + 376))), -1);
                        break label$6;
                    }
                    while (false);
                    if ((this._loadInt((_36_ + 372))) == 0) {
                        break label$6;
                    }
                    sqlite3RegisterLikeFunctions((this._loadInt((_36_ + 356))), (sqlite3GetBoolean((this._loadInt((_36_ + 372))))));
                }
                while (false);
                if ((this._loadInt8u(((this._loadInt((_36_ + 356))) + 28))) == 0) {
                    break label$5;
                }
                sqlite3BtreeSetSafetyLevel((this._loadInt(((_34_ = this._loadInt((_36_ + 352))) + 4))), (this._loadInt8u((_34_ + 9))), (((_34_ = this._loadInt(((this._loadInt((_36_ + 356))) + 12))) & 2097152) >>> 21), ((_34_ & 4194304) >>> 22));
            }
            while (false);
            sqlite3DbFree((this._loadInt((_36_ + 356))), (this._loadInt((_36_ + 376))));
            sqlite3DbFree((this._loadInt((_36_ + 356))), (this._loadInt((_36_ + 372))));
        }
        while (false);
        this._storeInt((0 + 4), (_36_ + 400));
        return;
    }

    @Override()
    public final void sqlite3FinishTrigger(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _34_ = 0;
        int _35_ = 0;
        int _36_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 128))) + 124), _30_);
        this._storeInt((_33_ + 120), _31_);
        this._storeInt((_33_ + 116), _32_);
        this._storeInt((_33_ + 112), (this._loadInt(((this._loadInt((_33_ + 124))) + 512))));
        this._storeInt((_33_ + 104), (this._loadInt((this._loadInt((_33_ + 124))))));
        this._storeInt(((_32_ = this._loadInt((_33_ + 124))) + 512), 0);
        label$0:
        do {
            if ((this._loadInt((_32_ + 64))) != 0) {
                break label$0;
            }
            if ((this._loadInt((_33_ + 112))) == 0) {
                break label$0;
            }
            this._storeInt((_33_ + 108), (this._loadInt((this._loadInt((_33_ + 112))))));
            this._storeInt((_33_ + 84), (sqlite3SchemaToIndex((this._loadInt((this._loadInt((_33_ + 124))))), (this._loadInt(((this._loadInt((_33_ + 112))) + 20))))));
            this._storeInt(((this._loadInt((_33_ + 112))) + 28), (this._loadInt((_33_ + 120))));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_33_ + 120))) == 0) {
                        break label$2;
                    }
                    this._storeInt(((_32_ = this._loadInt((_33_ + 120))) + 4), (this._loadInt((_33_ + 112))));
                    this._storeInt((_33_ + 120), (this._loadInt((_32_ + 32))));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt((_33_ + 76), (sqlite3Strlen30((this._storeInt((_33_ + 72), (this._loadInt((this._loadInt((_33_ + 112))))))))));
            label$3:
            do {
                if ((sqlite3FixInit((_33_ + 88), (this._loadInt((_33_ + 124))), (this._loadInt((_33_ + 84))), 42464, (_33_ + 72))) == 0) {
                    break label$3;
                }
                if ((sqlite3FixTriggerStep((_33_ + 88), (this._loadInt(((this._loadInt((_33_ + 112))) + 28))))) != 0) {
                    break label$0;
                }
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 104))) + 124))) != 0) {
                    break label$4;
                }
                if ((this._storeInt((_33_ + 68), (sqlite3GetVdbe((this._loadInt((_33_ + 124))))))) == 0) {
                    break label$0;
                }
                sqlite3BeginWriteOperation((this._loadInt((_33_ + 124))), 0, (this._loadInt((_33_ + 84))));
                _32_ = this._storeInt((_33_ + 64), (sqlite3DbStrNDup((this._loadInt((_33_ + 104))), (this._loadInt((_32_ = this._loadInt((_33_ + 116))))), (this._loadInt((_32_ + 4))))));
                _30_ = this._loadInt(((this._loadInt(((this._loadInt((_33_ + 104))) + 8))) + ((_31_ = this._loadInt((_33_ + 84))) << 4)));
                _34_ = this._loadInt(((this._loadInt((_33_ + 112))) + 4));
                _35_ = this._loadInt((_33_ + 124));
                _36_ = this._loadInt((_33_ + 108));
                this._storeInt((_33_ + 32), _32_);
                this._storeInt((_33_ + 28), _34_);
                this._storeInt((_33_ + 24), _36_);
                _temp$0 = 32464;
                _temp$1 = 32496;
                _temp$2 = (_31_ == 1) ? _temp$0 : _temp$1;
                this._storeInt((_33_ + 20), _temp$2);
                this._storeInt((_33_ + 16), _30_);
                sqlite3NestedParse(_35_, 42832, (_33_ + 16));
                sqlite3DbFree((this._loadInt((_33_ + 104))), (this._loadInt((_33_ + 64))));
                sqlite3ChangeCookie((this._loadInt((_33_ + 124))), (this._loadInt((_33_ + 84))));
                _32_ = this._loadInt((_33_ + 84));
                _31_ = this._loadInt((_33_ + 68));
                _30_ = this._loadInt((_33_ + 104));
                this._storeInt(_33_, (this._loadInt((_33_ + 108))));
                sqlite3VdbeAddParseSchemaOp(_31_, _32_, (sqlite3MPrintf(_30_, 42896, _33_)));
            }
            while (false);
            if ((this._loadInt8u(((this._loadInt((_33_ + 104))) + 124))) == 0) {
                break label$0;
            }
            this._storeInt((_33_ + 60), (this._loadInt((_33_ + 112))));
            label$5:
            do {
                if ((this._storeInt((_33_ + 112), (sqlite3HashInsert((this._storeInt((_33_ + 56), ((this._loadInt((((this._loadInt(((this._loadInt((_33_ + 104))) + 8))) + ((this._loadInt((_33_ + 84))) << 4)) + 12))) + 40))), (_32_ = this._loadInt((_33_ + 108))), (sqlite3Strlen30(_32_)), (this._loadInt((_33_ + 112))))))) == 0) {
                    break label$5;
                }
                this._storeInt8(((this._loadInt((_33_ + 104))) + 30), 1);
                break label$0;
            }
            while (false);
            if ((this._loadInt(((_32_ = this._loadInt((_33_ + 60))) + 20))) != (this._loadInt((_32_ + 24)))) {
                break label$0;
            }
            _32_ = this._storeInt((_33_ + 48), (sqlite3Strlen30((this._loadInt(((this._loadInt((_33_ + 60))) + 4))))));
            _32_ = this._storeInt((_33_ + 52), (sqlite3HashFind(((this._loadInt(((_31_ = this._loadInt((_33_ + 60))) + 24))) + 8), (this._loadInt((_31_ + 4))), _32_)));
            this._storeInt(((_31_ = this._loadInt((_33_ + 60))) + 32), (this._loadInt((_32_ + 64))));
            this._storeInt((_32_ + 64), _31_);
        }
        while (false);
        sqlite3DeleteTrigger((this._loadInt((_33_ + 104))), (this._loadInt((_33_ + 112))));
        sqlite3DeleteTriggerStep((this._loadInt((_33_ + 104))), (this._loadInt((_33_ + 120))));
        this._storeInt((0 + 4), (_33_ + 128));
        return;
    }

    @Override()
    public final void sqlite3BeginTrigger(
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
        int _temp$6 = 0;
        int _temp$7 = 0;
        int _temp$8 = 0;
        this._storeInt(((_31_0 = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 144))) + 140), _30_);
        this._storeInt((_31_0 + 136), _31_);
        this._storeInt((_31_0 + 132), _32_);
        this._storeInt((_31_0 + 128), _33_);
        this._storeInt((_31_0 + 124), _34_);
        this._storeInt((_31_0 + 120), _35_);
        this._storeInt((_31_0 + 116), _36_);
        this._storeInt((_31_0 + 112), _37_);
        this._storeInt((_31_0 + 108), _38_);
        this._storeInt((_31_0 + 104), _39_);
        _39_ = this._storeInt((_31_0 + 92), (this._storeInt((_31_0 + 100), 0)));
        this._storeInt((_31_0 + 88), (this._loadInt((this._loadInt((_31_0 + 140))))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_31_0 + 108))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt(((this._loadInt((_31_0 + 132))) + 4))) == 0) {
                            break label$2;
                        }
                        sqlite3ErrorMsg((this._loadInt((_31_0 + 140))), 42480, 0);
                        break label$0;
                    }
                    while (false);
                    if ((this._storeInt((_31_0 + 84), (sqlite3TwoPartName((this._loadInt((_31_0 + 140))), (this._loadInt((_31_0 + 136))), (this._loadInt((_31_0 + 132))), (_31_0 + 80))))) >= _39_) {
                        break label$1;
                    }
                    break label$0;
                }
                while (false);
                this._storeInt((_31_0 + 84), 1);
                this._storeInt((_31_0 + 80), (this._loadInt((_31_0 + 136))));
            }
            while (false);
            if ((this._loadInt((_31_0 + 116))) == 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_31_0 + 88))) + 30))) != 0) {
                break label$0;
            }
            this._storeInt((_31_0 + 96), (sqlite3SrcListLookup((this._loadInt((_31_0 + 140))), (this._loadInt((_31_0 + 116))))));
            label$4:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_0 + 88))) + 124))) != 0) {
                    break label$4;
                }
                if ((this._loadInt(((this._loadInt((_31_0 + 132))) + 4))) != 0) {
                    break label$4;
                }
                if ((this._loadInt((_31_0 + 96))) == 0) {
                    break label$4;
                }
                if ((this._loadInt(((this._loadInt((_31_0 + 96))) + 68))) != (this._loadInt(((this._loadInt(((this._loadInt((_31_0 + 88))) + 8))) + 28)))) {
                    break label$4;
                }
                this._storeInt((_31_0 + 84), 1);
            }
            while (false);
            if ((this._loadInt8u(((this._loadInt((_31_0 + 88))) + 30))) != 0) {
                break label$0;
            }
            label$5:
            do {
                if ((sqlite3FixInit((_31_0 + 64), (this._loadInt((_31_0 + 140))), (this._loadInt((_31_0 + 84))), 42464, (this._loadInt((_31_0 + 80))))) == 0) {
                    break label$5;
                }
                if ((sqlite3FixSrcList((_31_0 + 64), (this._loadInt((_31_0 + 116))))) != 0) {
                    break label$0;
                }
            }
            while (false);
            label$6:
            do {
                label$7:
                do {
                    if ((this._storeInt((_31_0 + 96), (sqlite3SrcListLookup((this._loadInt((_31_0 + 140))), (this._loadInt((_31_0 + 116))))))) == 0) {
                        break label$7;
                    }
                    if (((this._loadInt8u(((this._loadInt((_31_0 + 96))) + 34))) & 16) == 0) {
                        break label$6;
                    }
                    sqlite3ErrorMsg((this._loadInt((_31_0 + 140))), 42528, 0);
                    break label$0;
                }
                while (false);
                if ((this._loadInt(((this._loadInt((_31_0 + 88))) + 116))) != 1) {
                    break label$0;
                }
                this._storeInt8(((this._loadInt((_31_0 + 88))) + 125), 1);
                break label$0;
            }
            while (false);
            if ((this._storeInt((_31_0 + 92), (sqlite3NameFromToken((this._loadInt((_31_0 + 88))), (this._loadInt((_31_0 + 80))))))) == 0) {
                break label$0;
            }
            if ((sqlite3CheckObjectName((this._loadInt((_31_0 + 140))), (this._loadInt((_31_0 + 92))))) != 0) {
                break label$0;
            }
            label$8:
            do {
                label$9:
                do {
                    label$10:
                    do {
                        label$11:
                        do {
                            label$12:
                            do {
                                if ((sqlite3HashFind(((this._loadInt((((this._loadInt(((this._loadInt((_31_0 + 88))) + 8))) + ((this._loadInt((_31_0 + 84))) << 4)) + 12))) + 40), (_39_ = this._loadInt((_31_0 + 92))), (sqlite3Strlen30(_39_)))) == 0) {
                                    break label$12;
                                }
                                if ((this._loadInt((_31_0 + 104))) == 0) {
                                    break label$11;
                                }
                                sqlite3CodeVerifySchema((this._loadInt((_31_0 + 140))), (this._loadInt((_31_0 + 84))));
                                break label$0;
                            }
                            while (false);
                            if ((sqlite3_strnicmp((this._loadInt((this._loadInt((_31_0 + 96))))), 38560, 7)) == 0) {
                                break label$9;
                            }
                            if ((this._loadInt(((this._loadInt((_31_0 + 96))) + 28))) == 0) {
                                break label$10;
                            }
                            if ((this._loadInt((_31_0 + 128))) == 48) {
                                break label$10;
                            }
                            this._storeInt((_31_0 + 24), 0);
                            this._storeInt((_31_0 + 20), (this._loadInt((_31_0 + 116))));
                            _39_ = this._loadInt((_31_0 + 140));
                            _temp$0 = 42656;
                            _temp$1 = 42672;
                            _temp$2 = ((this._loadInt((_31_0 + 128))) == 34) ? _temp$0 : _temp$1;
                            this._storeInt((_31_0 + 16), _temp$2);
                            sqlite3ErrorMsg(_39_, 42688, (_31_0 + 16));
                            break label$0;
                        }
                        while (false);
                        _39_ = this._loadInt((_31_0 + 140));
                        this._storeInt(_31_0, (this._loadInt((_31_0 + 80))));
                        sqlite3ErrorMsg(_39_, 42576, _31_0);
                        break label$0;
                    }
                    while (false);
                    if ((this._loadInt(((this._loadInt((_31_0 + 96))) + 28))) != 0) {
                        break label$8;
                    }
                    if ((this._loadInt((_31_0 + 128))) != 48) {
                        break label$8;
                    }
                    this._storeInt((_31_0 + 36), 0);
                    _39_ = this._loadInt((_31_0 + 140));
                    this._storeInt((_31_0 + 32), (this._loadInt((_31_0 + 116))));
                    sqlite3ErrorMsg(_39_, 42736, (_31_0 + 32));
                    break label$0;
                }
                while (false);
                sqlite3ErrorMsg((this._loadInt((_31_0 + 140))), 42608, 0);
                this._storeInt(((_39_ = this._loadInt((_31_0 + 140))) + 64), ((this._loadInt((_39_ + 64))) + 1));
                break label$0;
            }
            while (false);
            this._storeInt((_31_0 + 60), (sqlite3SchemaToIndex((this._loadInt((_31_0 + 88))), (this._loadInt(((this._loadInt((_31_0 + 96))) + 68))))));
            this._storeInt((_31_0 + 56), 7);
            this._storeInt((_31_0 + 52), (this._loadInt(((this._loadInt(((this._loadInt((_31_0 + 88))) + 8))) + ((this._loadInt((_31_0 + 60))) << 4)))));
            label$13:
            do {
                label$14:
                do {
                    if ((this._loadInt((_31_0 + 108))) == 0) {
                        break label$14;
                    }
                    _39_ = this._loadInt(((this._loadInt(((this._loadInt((_31_0 + 88))) + 8))) + 16));
                    break label$13;
                }
                while (false);
                _39_ = this._loadInt((_31_0 + 52));
            }
            while (false);
            this._storeInt((_31_0 + 48), _39_);
            label$15:
            do {
                label$16:
                do {
                    if ((this._loadInt((_31_0 + 60))) == 1) {
                        break label$16;
                    }
                    if ((this._loadInt((_31_0 + 108))) == 0) {
                        break label$15;
                    }
                }
                while (false);
                this._storeInt((_31_0 + 56), 5);
            }
            while (false);
            if ((sqlite3AuthCheck((this._loadInt((_31_0 + 140))), (this._loadInt((_31_0 + 56))), (this._loadInt((_31_0 + 92))), (this._loadInt((this._loadInt((_31_0 + 96))))), (this._loadInt((_31_0 + 48))))) != 0) {
                break label$0;
            }
            _temp$3 = 32464;
            _temp$4 = 32496;
            _temp$5 = ((this._loadInt((_31_0 + 60))) == 1) ? _temp$3 : _temp$4;
            _temp$5 = sqlite3AuthCheck((this._loadInt((_31_0 + 140))), 18, _temp$5, 0, (this._loadInt((_31_0 + 52))));
            if (_temp$5 != 0) {
                break label$0;
            }
            label$17:
            do {
                if ((this._loadInt((_31_0 + 128))) != 48) {
                    break label$17;
                }
                this._storeInt((_31_0 + 128), 34);
            }
            while (false);
            if ((this._storeInt((_31_0 + 100), (sqlite3DbMallocZero((this._loadInt((_31_0 + 88))), 36)))) == 0) {
                break label$0;
            }
            this._storeInt((this._loadInt((_31_0 + 100))), (this._loadInt((_31_0 + 92))));
            this._storeInt((_31_0 + 92), 0);
            _39_ = sqlite3DbStrDup((this._loadInt((_31_0 + 88))), (this._loadInt(((this._loadInt((_31_0 + 116))) + 12))));
            this._storeInt(((_38_ = this._loadInt((_31_0 + 100))) + 4), _39_);
            this._storeInt((_38_ + 20), (this._loadInt((((this._loadInt(((this._loadInt((_31_0 + 88))) + 8))) + ((this._loadInt((_31_0 + 84))) << 4)) + 12))));
            this._storeInt(((this._loadInt((_31_0 + 100))) + 24), (this._loadInt(((this._loadInt((_31_0 + 96))) + 68))));
            this._storeInt8(((this._loadInt((_31_0 + 100))) + 8), (this._loadInt((_31_0 + 124))));
            _temp$6 = 1;
            _temp$7 = 2;
            _temp$8 = ((this._loadInt((_31_0 + 128))) == 34) ? _temp$6 : _temp$7;
            this._storeInt8(((this._loadInt((_31_0 + 100))) + 9), _temp$8);
            _39_ = sqlite3ExprDup((this._loadInt((_31_0 + 88))), (this._loadInt((_31_0 + 112))), 1);
            this._storeInt(((this._loadInt((_31_0 + 100))) + 12), _39_);
            _39_ = sqlite3IdListDup((this._loadInt((_31_0 + 88))), (this._loadInt((_31_0 + 120))));
            this._storeInt(((_38_ = this._loadInt((_31_0 + 100))) + 16), _39_);
            this._storeInt(((this._loadInt((_31_0 + 140))) + 512), _38_);
        }
        while (false);
        sqlite3DbFree((this._loadInt((_31_0 + 88))), (this._loadInt((_31_0 + 92))));
        sqlite3SrcListDelete((this._loadInt((_31_0 + 88))), (this._loadInt((_31_0 + 116))));
        sqlite3IdListDelete((this._loadInt((_31_0 + 88))), (this._loadInt((_31_0 + 120))));
        sqlite3ExprDelete((this._loadInt((_31_0 + 88))), (this._loadInt((_31_0 + 112))));
        label$18:
        do {
            if ((this._loadInt(((this._loadInt((_31_0 + 140))) + 512))) != 0) {
                break label$18;
            }
            sqlite3DeleteTrigger((this._loadInt((_31_0 + 88))), (this._loadInt((_31_0 + 100))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_0 + 144));
        return;
    }

    @Override()
    public final int sqlite3TriggerUpdateStep(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt8((_35_ + 15), _34_);
        label$0:
        do {
            if ((this._storeInt((_35_ + 8), (triggerStepAllocate((this._loadInt((_35_ + 28))), 107, (this._loadInt((_35_ + 24))))))) == 0) {
                break label$0;
            }
            _34_ = sqlite3ExprListDup((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 20))), 1);
            this._storeInt(((this._loadInt((_35_ + 8))) + 24), _34_);
            _34_ = sqlite3ExprDup((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 16))), 1);
            this._storeInt(((_33_ = this._loadInt((_35_ + 8))) + 20), _34_);
            this._storeInt8((_33_ + 1), (this._loadInt8u((_35_ + 15))));
        }
        while (false);
        sqlite3ExprListDelete((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 20))));
        sqlite3ExprDelete((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 16))));
        _34_ = this._loadInt((_35_ + 8));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3TriggerInsertStep(
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
        this._storeInt8((_36_ + 11), _35_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_36_ + 4), (triggerStepAllocate((this._loadInt((_36_ + 28))), 105, (this._loadInt((_36_ + 24))))))) == 0) {
                    break label$1;
                }
                _35_ = sqlite3SelectDup((this._loadInt((_36_ + 28))), (this._loadInt((_36_ + 12))), 1);
                this._storeInt(((_34_ = this._loadInt((_36_ + 4))) + 8), _35_);
                this._storeInt((_34_ + 28), (this._loadInt((_36_ + 20))));
                _35_ = sqlite3ExprListDup((this._loadInt((_36_ + 28))), (this._loadInt((_36_ + 16))), 1);
                this._storeInt(((_34_ = this._loadInt((_36_ + 4))) + 24), _35_);
                this._storeInt8((_34_ + 1), (this._loadInt8u((_36_ + 11))));
                break label$0;
            }
            while (false);
            sqlite3IdListDelete((this._loadInt((_36_ + 28))), (this._loadInt((_36_ + 20))));
        }
        while (false);
        sqlite3ExprListDelete((this._loadInt((_36_ + 28))), (this._loadInt((_36_ + 16))));
        sqlite3SelectDelete((this._loadInt((_36_ + 28))), (this._loadInt((_36_ + 12))));
        _35_ = this._loadInt((_36_ + 4));
        this._storeInt((0 + 4), (_36_ + 32));
        return _35_;
    }

    @Override()
    public final int sqlite3TriggerDeleteStep(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        label$0:
        do {
            if ((this._storeInt(_33_, (triggerStepAllocate((this._loadInt((_33_ + 12))), 106, (this._loadInt((_33_ + 8))))))) == 0) {
                break label$0;
            }
            _32_ = sqlite3ExprDup((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 4))), 1);
            this._storeInt8(((_31_ = this._loadInt(_33_)) + 1), 99);
            this._storeInt((_31_ + 20), _32_);
        }
        while (false);
        sqlite3ExprDelete((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 4))));
        _32_ = this._loadInt(_33_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int sqlite3TriggerSelectStep(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(_32_, (sqlite3DbMallocZero((this._loadInt((_32_ + 8))), 40)))) == 0) {
                    break label$1;
                }
                this._storeInt8((_31_ = this._loadInt(_32_)), 116);
                this._storeInt((_31_ + 8), (this._loadInt((_32_ + 4))));
                this._storeInt8(((this._loadInt(_32_)) + 1), 99);
                this._storeInt((_32_ + 12), (this._loadInt(_32_)));
                break label$0;
            }
            while (false);
            sqlite3SelectDelete((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))));
            this._storeInt((_32_ + 12), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void sqlite3DropTrigger(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_33_ + 40), _31_);
        this._storeInt((_33_ + 36), _32_);
        this._storeInt((_33_ + 32), 0);
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt((_33_ + 12), (this._loadInt((this._loadInt((_33_ + 44))))))) + 30))) != 0) {
                break label$0;
            }
            if ((sqlite3ReadSchema((this._loadInt((_33_ + 44))))) != 0) {
                break label$0;
            }
            this._storeInt((_33_ + 24), (this._loadInt(((this._loadInt((_33_ + 40))) + 8))));
            this._storeInt((_33_ + 16), (sqlite3Strlen30((this._storeInt((_33_ + 20), (this._loadInt(((this._loadInt((_33_ + 40))) + 12))))))));
            this._storeInt((_33_ + 28), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_33_ + 28))) >= (this._loadInt(((this._loadInt((_33_ + 12))) + 4)))) {
                        break label$2;
                    }
                    label$3:
                    do {
                        label$4:
                        do {
                            if ((this._loadInt((_33_ + 28))) > 1) {
                                break label$4;
                            }
                            _32_ = (this._loadInt((_33_ + 28))) ^ 1;
                            break label$3;
                        }
                        while (false);
                        _32_ = this._loadInt((_33_ + 28));
                    }
                    while (false);
                    this._storeInt((_33_ + 8), _32_);
                    label$5:
                    do {
                        label$6:
                        do {
                            if ((this._loadInt((_33_ + 24))) == 0) {
                                break label$6;
                            }
                            if ((sqlite3StrICmp((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 12))) + 8))) + ((this._loadInt((_33_ + 8))) << 4)))), (this._loadInt((_33_ + 24))))) != 0) {
                                break label$5;
                            }
                        }
                        while (false);
                        if ((this._storeInt((_33_ + 32), (sqlite3HashFind(((this._loadInt((((this._loadInt(((this._loadInt((_33_ + 12))) + 8))) + ((this._loadInt((_33_ + 8))) << 4)) + 12))) + 40), (this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))))))) != 0) {
                            break label$2;
                        }
                    }
                    while (false);
                    this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) + 1));
                    continue label$1;
                }
            }
            while (false);
            label$7:
            do {
                if ((this._loadInt((_33_ + 32))) == 0) {
                    break label$7;
                }
                sqlite3DropTriggerPtr((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 32))));
                break label$0;
            }
            while (false);
            label$8:
            do {
                label$9:
                do {
                    if ((this._loadInt((_33_ + 36))) == 0) {
                        break label$9;
                    }
                    sqlite3CodeVerifyNamedSchema((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 24))));
                    break label$8;
                }
                while (false);
                this._storeInt((_33_ + 4), 0);
                _32_ = this._loadInt((_33_ + 44));
                this._storeInt(_33_, (this._loadInt((_33_ + 40))));
                sqlite3ErrorMsg(_32_, 42384, _33_);
            }
            while (false);
            this._storeInt8(((this._loadInt((_33_ + 44))) + 18), 1);
        }
        while (false);
        sqlite3SrcListDelete((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 40))));
        this._storeInt((0 + 4), (_33_ + 48));
        return;
    }

    @Override()
    public final void sqlite3Attach(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        codeAttach((this._loadInt((_34_ + 12))), 24, 42136, (_32_ = this._loadInt((_34_ + 8))), _32_, (this._loadInt((_34_ + 4))), _33_);
        this._storeInt((0 + 4), (_34_ + 16));
        return;
    }

    @Override()
    public final void sqlite3Detach(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        codeAttach((this._loadInt((_32_ + 12))), 25, 41696, _31_, 0, 0, _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3Reindex(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_33_ + 40), _31_);
        this._storeInt((_33_ + 36), _32_);
        this._storeInt((_33_ + 8), (this._loadInt((this._loadInt((_33_ + 44))))));
        label$0:
        do {
            if ((sqlite3ReadSchema((this._loadInt((_33_ + 44))))) != 0) {
                break label$0;
            }
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_33_ + 40))) == 0) {
                            break label$3;
                        }
                        label$4:
                        do {
                            if ((this._loadInt((_33_ + 36))) == 0) {
                                break label$4;
                            }
                            if ((this._loadInt((this._loadInt((_33_ + 36))))) != 0) {
                                break label$1;
                            }
                        }
                        while (false);
                        if ((this._storeInt(_33_, (sqlite3NameFromToken((this._loadInt((this._loadInt((_33_ + 44))))), (this._loadInt((_33_ + 40))))))) == 0) {
                            break label$0;
                        }
                        if ((this._storeInt((_33_ + 32), (sqlite3FindCollSeq((_32_ = this._loadInt((_33_ + 8))), (this._loadInt8u(((this._loadInt(((this._loadInt((_32_ + 8))) + 12))) + 77))), (this._loadInt(_33_)), 0)))) == 0) {
                            break label$2;
                        }
                        reindexDatabases((this._loadInt((_33_ + 44))), (this._loadInt(_33_)));
                        sqlite3DbFree((this._loadInt((_33_ + 8))), (this._loadInt(_33_)));
                        break label$0;
                    }
                    while (false);
                    reindexDatabases((this._loadInt((_33_ + 44))), 0);
                    break label$0;
                }
                while (false);
                sqlite3DbFree((this._loadInt((_33_ + 8))), (this._loadInt(_33_)));
            }
            while (false);
            if ((this._storeInt((_33_ + 12), (sqlite3TwoPartName((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 40))), (this._loadInt((_33_ + 36))), (_33_ + 4))))) < 0) {
                break label$0;
            }
            if ((this._storeInt((_33_ + 28), (sqlite3NameFromToken((this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 4))))))) == 0) {
                break label$0;
            }
            _32_ = this._storeInt((_33_ + 24), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 8))) + 8))) + ((this._loadInt((_33_ + 12))) << 4)))));
            label$5:
            do {
                if ((this._storeInt((_33_ + 20), (sqlite3FindTable((this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 28))), _32_)))) == 0) {
                    break label$5;
                }
                reindexTable((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 20))), 0);
                sqlite3DbFree((this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 28))));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 16), (sqlite3FindIndex((this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 24))))));
            sqlite3DbFree((this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 28))));
            label$6:
            do {
                if ((this._loadInt((_33_ + 16))) == 0) {
                    break label$6;
                }
                sqlite3BeginWriteOperation((this._loadInt((_33_ + 44))), 0, (this._loadInt((_33_ + 12))));
                sqlite3RefillIndex((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 16))), -1);
                break label$0;
            }
            while (false);
            sqlite3ErrorMsg((this._loadInt((_33_ + 44))), 41616, 0);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 48));
        return;
    }

    @Override()
    public final void sqlite3Analyze(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_33_ + 40), _31_);
        this._storeInt((_33_ + 36), _32_);
        this._storeInt((_33_ + 32), (this._loadInt((this._loadInt((_33_ + 44))))));
        label$0:
        do {
            if ((sqlite3ReadSchema((this._loadInt((_33_ + 44))))) != 0) {
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
                                    if ((this._loadInt((_33_ + 40))) == 0) {
                                        break label$6;
                                    }
                                    if ((this._loadInt(((this._loadInt((_33_ + 36))) + 4))) == 0) {
                                        break label$5;
                                    }
                                    if ((this._storeInt((_33_ + 28), (sqlite3TwoPartName((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 40))), (this._loadInt((_33_ + 36))), (_33_ + 4))))) < 0) {
                                        break label$0;
                                    }
                                    this._storeInt((_33_ + 16), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 32))) + 8))) + ((this._loadInt((_33_ + 28))) << 4)))));
                                    if ((this._storeInt((_33_ + 20), (sqlite3NameFromToken((this._loadInt((_33_ + 32))), (this._loadInt((_33_ + 4))))))) == 0) {
                                        break label$0;
                                    }
                                    if ((this._storeInt((_33_ + 8), (sqlite3FindIndex((this._loadInt((_33_ + 32))), (this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))))))) == 0) {
                                        break label$4;
                                    }
                                    analyzeTable((this._loadInt((_33_ + 44))), (this._loadInt(((_32_ = this._loadInt((_33_ + 8))) + 16))), _32_);
                                    break label$3;
                                }
                                while (false);
                                this._storeInt((_33_ + 24), 0);
                                label$7:
                                while (true) {
                                    if ((this._loadInt((_33_ + 24))) >= (this._loadInt(((this._loadInt((_33_ + 32))) + 4)))) {
                                        break label$0;
                                    }
                                    label$9:
                                    do {
                                        if ((this._loadInt((_33_ + 24))) == 1) {
                                            break label$9;
                                        }
                                        analyzeDatabase((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 24))));
                                    }
                                    while (false);
                                    this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + 1));
                                    continue label$7;
                                }
                            }
                            while (false);
                            label$10:
                            do {
                                if ((this._storeInt((_33_ + 28), (sqlite3FindDb((this._loadInt((_33_ + 32))), (this._loadInt((_33_ + 40))))))) < 0) {
                                    break label$10;
                                }
                                analyzeDatabase((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 28))));
                                break label$0;
                            }
                            while (false);
                            if ((this._storeInt((_33_ + 20), (sqlite3NameFromToken((this._loadInt((_33_ + 32))), (this._loadInt((_33_ + 40))))))) == 0) {
                                break label$0;
                            }
                            if ((this._storeInt((_33_ + 8), (sqlite3FindIndex((this._loadInt((_33_ + 32))), (this._loadInt((_33_ + 20))), 0)))) == 0) {
                                break label$2;
                            }
                            analyzeTable((this._loadInt((_33_ + 44))), (this._loadInt(((_32_ = this._loadInt((_33_ + 8))) + 16))), _32_);
                            break label$1;
                        }
                        while (false);
                        if ((this._storeInt((_33_ + 12), (sqlite3LocateTable((this._loadInt((_33_ + 44))), 0, (this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))))))) == 0) {
                            break label$3;
                        }
                        analyzeTable((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 12))), 0);
                    }
                    while (false);
                    sqlite3DbFree((this._loadInt((_33_ + 32))), (this._loadInt((_33_ + 20))));
                    break label$0;
                }
                while (false);
                if ((this._storeInt((_33_ + 12), (sqlite3LocateTable((this._loadInt((_33_ + 44))), 0, (this._loadInt((_33_ + 20))), 0)))) == 0) {
                    break label$1;
                }
                analyzeTable((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 12))), 0);
            }
            while (false);
            sqlite3DbFree((this._loadInt((_33_ + 32))), (this._loadInt((_33_ + 20))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 48));
        return;
    }

    @Override()
    public final void sqlite3AlterRenameTable(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _34_ = 0;
        int _35_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        int _temp$3 = 0;
        int _temp$4 = 0;
        int _temp$5 = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 208))) + 204), _30_);
        this._storeInt((_33_ + 200), _31_);
        this._storeInt((_33_ + 196), _32_);
        _32_ = this._storeInt((_33_ + 180), 0);
        this._storeInt((_33_ + 176), (this._loadInt((this._loadInt((_33_ + 204))))));
        _32_ = this._storeInt((_33_ + 156), (this._storeInt((_33_ + 160), _32_)));
        this._storeInt((_33_ + 152), (this._loadInt(((this._loadInt((_33_ + 176))) + 12))));
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_33_ + 176))) + 30))) != 0) {
                break label$0;
            }
            if ((this._storeInt((_33_ + 184), (sqlite3LocateTable((this._loadInt((_33_ + 204))), _32_, (this._loadInt(((_31_ = this._loadInt((_33_ + 200))) + 12))), (this._loadInt((_31_ + 8))))))) == 0) {
                break label$0;
            }
            _32_ = this._storeInt((_33_ + 192), (sqlite3SchemaToIndex((this._loadInt((this._loadInt((_33_ + 204))))), (this._loadInt(((this._loadInt((_33_ + 184))) + 68))))));
            this._storeInt((_33_ + 188), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 176))) + 8))) + (_32_ << 4)))));
            this._storeInt(((_32_ = this._loadInt((_33_ + 176))) + 12), ((this._loadInt((_32_ + 12))) | 268435456));
            if ((this._storeInt((_33_ + 180), (sqlite3NameFromToken(_32_, (this._loadInt((_33_ + 196))))))) == 0) {
                break label$0;
            }
            label$1:
            do {
                label$2:
                do {
                    if ((sqlite3FindTable((this._loadInt((_33_ + 176))), (this._loadInt((_33_ + 180))), (this._loadInt((_33_ + 188))))) != 0) {
                        break label$2;
                    }
                    if ((sqlite3FindIndex((this._loadInt((_33_ + 176))), (this._loadInt((_33_ + 180))), (this._loadInt((_33_ + 188))))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                _32_ = this._loadInt((_33_ + 204));
                this._storeInt(_33_, (this._loadInt((_33_ + 180))));
                sqlite3ErrorMsg(_32_, 39056, _33_);
                break label$0;
            }
            while (false);
            if ((isSystemTable((this._loadInt((_33_ + 204))), (this._loadInt((this._loadInt((_33_ + 184))))))) != 0) {
                break label$0;
            }
            if ((sqlite3CheckObjectName((this._loadInt((_33_ + 204))), (this._loadInt((_33_ + 180))))) != 0) {
                break label$0;
            }
            label$3:
            do {
                if ((this._loadInt(((this._loadInt((_33_ + 184))) + 28))) == 0) {
                    break label$3;
                }
                _32_ = this._loadInt((_33_ + 204));
                this._storeInt((_33_ + 16), (this._loadInt((this._loadInt((_33_ + 184))))));
                sqlite3ErrorMsg(_32_, 39120, (_33_ + 16));
                break label$0;
            }
            while (false);
            if ((sqlite3AuthCheck((this._loadInt((_33_ + 204))), 26, (this._loadInt((_33_ + 188))), (this._loadInt((this._loadInt((_33_ + 184))))), 0)) != 0) {
                break label$0;
            }
            if ((sqlite3ViewGetColumnNames((this._loadInt((_33_ + 204))), (this._loadInt((_33_ + 184))))) != 0) {
                break label$0;
            }
            label$4:
            do {
                if (((this._loadInt8u(((this._loadInt((_33_ + 184))) + 34))) & 16) == 0) {
                    break label$4;
                }
                if ((this._loadInt(((this._loadInt((this._loadInt(((this._storeInt((_33_ + 156), (sqlite3GetVTable((this._loadInt((_33_ + 176))), (this._loadInt((_33_ + 184))))))) + 8))))) + 76))) != 0) {
                    break label$4;
                }
                this._storeInt((_33_ + 156), 0);
            }
            while (false);
            if ((this._storeInt((_33_ + 164), (sqlite3GetVdbe((this._loadInt((_33_ + 204))))))) == 0) {
                break label$0;
            }
            sqlite3BeginWriteOperation((this._loadInt((_33_ + 204))), (((this._loadInt((_33_ + 156))) != 0) ? 1 : 0), (this._loadInt((_33_ + 192))));
            sqlite3ChangeCookie((this._loadInt((_33_ + 204))), (this._loadInt((_33_ + 192))));
            label$5:
            do {
                if ((this._loadInt((_33_ + 156))) == 0) {
                    break label$5;
                }
                _32_ = this._storeInt((_33_ + 148), (this._storeInt(((_32_ = this._loadInt((_33_ + 204))) + 72), ((this._loadInt((_32_ + 72))) + 1))));
                sqlite3VdbeAddOp4((this._loadInt((_33_ + 164))), 94, 0, _32_, 0, (this._loadInt((_33_ + 180))), 0);
                sqlite3VdbeAddOp4((this._loadInt((_33_ + 164))), 132, (this._loadInt((_33_ + 148))), 0, 0, (this._loadInt((_33_ + 156))), -10);
                sqlite3MayAbort((this._loadInt((_33_ + 204))));
            }
            while (false);
            this._storeInt((_33_ + 172), (sqlite3Utf8CharLen((this._storeInt((_33_ + 168), (this._loadInt((this._loadInt((_33_ + 184))))))), -1)));
            label$6:
            do {
                if (((this._loadInt8u(((this._loadInt((_33_ + 176))) + 15))) & 4) == 0) {
                    break label$6;
                }
                if ((this._storeInt((_33_ + 160), (whereForeignKeys((this._loadInt((_33_ + 204))), (this._loadInt((_33_ + 184))))))) == 0) {
                    break label$6;
                }
                _32_ = this._loadInt((_33_ + 204));
                _31_ = this._loadInt((_33_ + 192));
                _30_ = this._loadInt((_33_ + 188));
                _34_ = this._loadInt((_33_ + 168));
                _35_ = this._loadInt((_33_ + 180));
                this._storeInt((_33_ + 128), (this._loadInt((_33_ + 160))));
                this._storeInt((_33_ + 124), _35_);
                this._storeInt((_33_ + 120), _34_);
                this._storeInt((_33_ + 112), _30_);
                _temp$0 = 32464;
                _temp$1 = 32496;
                _temp$2 = (_31_ == 1) ? _temp$0 : _temp$1;
                this._storeInt((_33_ + 116), _temp$2);
                sqlite3NestedParse(_32_, 39152, (_33_ + 112));
                sqlite3DbFree((this._loadInt((_33_ + 176))), (this._loadInt((_33_ + 160))));
            }
            while (false);
            _32_ = this._loadInt((_33_ + 204));
            _31_ = this._loadInt((_33_ + 192));
            _30_ = this._loadInt((_33_ + 188));
            _34_ = this._loadInt((_33_ + 180));
            _35_ = this._loadInt((_33_ + 172));
            this._storeInt((_33_ + 96), (this._loadInt((_33_ + 168))));
            this._storeInt((_33_ + 92), _35_);
            this._storeInt((_33_ + 72), (this._storeInt((_33_ + 76), (this._storeInt((_33_ + 80), (this._storeInt((_33_ + 84), (this._storeInt((_33_ + 88), _34_)))))))));
            this._storeInt((_33_ + 64), _30_);
            _temp$3 = 32464;
            _temp$4 = 32496;
            _temp$5 = (_31_ == 1) ? _temp$3 : _temp$4;
            this._storeInt((_33_ + 68), _temp$5);
            sqlite3NestedParse(_32_, 39232, (_33_ + 64));
            label$7:
            do {
                if ((sqlite3FindTable((this._loadInt((_33_ + 176))), 39616, (this._loadInt((_33_ + 188))))) == 0) {
                    break label$7;
                }
                this._storeInt((_33_ + 56), (this._loadInt((this._loadInt((_33_ + 184))))));
                this._storeInt((_33_ + 52), (this._loadInt((_33_ + 180))));
                _32_ = this._loadInt((_33_ + 204));
                this._storeInt((_33_ + 48), (this._loadInt((_33_ + 188))));
                sqlite3NestedParse(_32_, 39632, (_33_ + 48));
            }
            while (false);
            label$8:
            do {
                if ((this._storeInt((_33_ + 160), (whereTempTriggers((this._loadInt((_33_ + 204))), (this._loadInt((_33_ + 184))))))) == 0) {
                    break label$8;
                }
                this._storeInt((_33_ + 40), (this._loadInt((_33_ + 160))));
                _32_ = this._storeInt((_33_ + 36), (this._loadInt((_33_ + 180))));
                _31_ = this._loadInt((_33_ + 204));
                this._storeInt((_33_ + 32), _32_);
                sqlite3NestedParse(_31_, 39696, (_33_ + 32));
                sqlite3DbFree((this._loadInt((_33_ + 176))), (this._loadInt((_33_ + 160))));
            }
            while (false);
            label$9:
            do {
                if (((this._loadInt8u(((this._loadInt((_33_ + 176))) + 15))) & 4) == 0) {
                    break label$9;
                }
                this._storeInt((_33_ + 144), (sqlite3FkReferences((this._loadInt((_33_ + 184))))));
                label$11:
                do {
                    label$10:
                    while (true) {
                        if ((this._loadInt((_33_ + 144))) == 0) {
                            break label$11;
                        }
                        label$12:
                        do {
                            if ((this._storeInt((_33_ + 140), (this._loadInt((this._loadInt((_33_ + 144))))))) == (this._loadInt((_33_ + 184)))) {
                                break label$12;
                            }
                            reloadTableSchema((this._loadInt((_33_ + 204))), (this._loadInt((this._loadInt((_33_ + 144))))), (this._loadInt((this._loadInt((_33_ + 140))))));
                        }
                        while (false);
                        this._storeInt((_33_ + 144), (this._loadInt(((this._loadInt((_33_ + 144))) + 12))));
                        continue label$10;
                    }
                }
                while (false);
            }
            while (false);
            reloadTableSchema((this._loadInt((_33_ + 204))), (this._loadInt((_33_ + 184))), (this._loadInt((_33_ + 180))));
        }
        while (false);
        sqlite3SrcListDelete((this._loadInt((_33_ + 176))), (this._loadInt((_33_ + 200))));
        sqlite3DbFree((this._loadInt((_33_ + 176))), (this._loadInt((_33_ + 180))));
        this._storeInt(((this._loadInt((_33_ + 176))) + 12), (this._loadInt((_33_ + 152))));
        this._storeInt((0 + 4), (_33_ + 208));
        return;
    }

    @Override()
    public final void sqlite3AlterFinishAddColumn(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        int _34_ = 0;
        int _35_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        int _temp$3 = 0;
        int _temp$4 = 0;
        int _temp$5 = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 76), _30_);
        this._storeInt((_32_ + 72), _31_);
        this._storeInt((_32_ + 36), (this._loadInt((this._loadInt((_32_ + 76))))));
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_32_ + 76))) + 64))) != 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_32_ + 36))) + 30))) != 0) {
                break label$0;
            }
            _31_ = this._storeInt((_32_ + 68), (this._loadInt(((this._loadInt((_32_ + 76))) + 508))));
            _31_ = this._storeInt((_32_ + 60), (sqlite3SchemaToIndex((this._loadInt((_32_ + 36))), (this._loadInt((_31_ + 68))))));
            this._storeInt((_32_ + 56), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 36))) + 8))) + (_31_ << 4)))));
            this._storeInt((_32_ + 52), ((this._loadInt((this._loadInt((_32_ + 68))))) + 16));
            this._storeInt((_32_ + 44), (((this._loadInt(((_31_ = this._loadInt((_32_ + 68))) + 12))) + ((this._loadInt((_31_ + 8))) * 24)) + -24));
            this._storeInt((_32_ + 40), (this._loadInt(((this._loadInt((_32_ + 44))) + 4))));
            _31_ = this._storeInt((_32_ + 64), (sqlite3FindTable((this._loadInt((_32_ + 36))), (this._loadInt((_32_ + 52))), (this._loadInt((_32_ + 56))))));
            if ((sqlite3AuthCheck((this._loadInt((_32_ + 76))), 26, (this._loadInt((_32_ + 56))), (this._loadInt(_31_)), 0)) != 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt((_32_ + 40))) == 0) {
                    break label$1;
                }
                if ((this._loadInt8u((this._loadInt((_32_ + 40))))) != 98) {
                    break label$1;
                }
                this._storeInt((_32_ + 40), 0);
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 44))) + 21))) == 0) {
                    break label$2;
                }
                sqlite3ErrorMsg((this._loadInt((_32_ + 76))), 38608, 0);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt(((this._loadInt((_32_ + 68))) + 16))) == 0) {
                    break label$3;
                }
                sqlite3ErrorMsg((this._loadInt((_32_ + 76))), 38640, 0);
                break label$0;
            }
            while (false);
            label$4:
            do {
                if (((this._loadInt8u(((this._loadInt((_32_ + 36))) + 15))) & 4) == 0) {
                    break label$4;
                }
                if ((this._loadInt(((this._loadInt((_32_ + 68))) + 36))) == 0) {
                    break label$4;
                }
                if ((this._loadInt((_32_ + 40))) == 0) {
                    break label$4;
                }
                sqlite3ErrorMsg((this._loadInt((_32_ + 76))), 38672, 0);
                break label$0;
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
                                if ((this._loadInt8u(((this._loadInt((_32_ + 44))) + 20))) == 0) {
                                    break label$9;
                                }
                                if ((this._loadInt((_32_ + 40))) == 0) {
                                    break label$8;
                                }
                            }
                            while (false);
                            if ((this._loadInt((_32_ + 40))) == 0) {
                                break label$6;
                            }
                            if ((sqlite3ValueFromExpr((this._loadInt((_32_ + 36))), (this._loadInt((_32_ + 40))), 1, 98, (_32_ + 32))) == 0) {
                                break label$7;
                            }
                            this._storeInt8(((this._loadInt((_32_ + 36))) + 30), 1);
                            break label$0;
                        }
                        while (false);
                        sqlite3ErrorMsg((this._loadInt((_32_ + 76))), 38736, 0);
                        break label$0;
                    }
                    while (false);
                    if ((this._loadInt((_32_ + 32))) == 0) {
                        break label$5;
                    }
                    sqlite3ValueFree((this._loadInt((_32_ + 32))));
                }
                while (false);
                label$10:
                do {
                    if ((this._storeInt((_32_ + 48), (sqlite3DbStrNDup((this._loadInt((_32_ + 36))), (this._loadInt((_31_ = this._loadInt((_32_ + 72))))), (this._loadInt((_31_ + 4))))))) == 0) {
                        break label$10;
                    }
                    this._storeInt((_32_ + 28), (((this._loadInt((_32_ + 48))) + (this._loadInt(((this._loadInt((_32_ + 72))) + 4)))) + -1));
                    this._storeInt((_32_ + 24), (this._loadInt(((this._loadInt((_32_ + 36))) + 12))));
                    label$12:
                    do {
                        label$11:
                        while (true) {
                            _31_ = 0;
                            label$13:
                            do {
                                if (((this._loadInt((_32_ + 28))) & 4294967295L) <= ((this._loadInt((_32_ + 48))) & 4294967295L)) {
                                    break label$13;
                                }
                                _31_ = 1;
                                if ((this._loadInt8s((this._loadInt((_32_ + 28))))) == 59) {
                                    break label$13;
                                }
                                _31_ = (this._loadInt8u(((this._loadInt8u((this._loadInt((_32_ + 28))))) + 21776))) & 1;
                            }
                            while (false);
                            if (_31_ == 0) {
                                break label$12;
                            }
                            this._storeInt8((_31_ = this._loadInt((_32_ + 28))), 0);
                            this._storeInt((_32_ + 28), (_31_ + -1));
                            continue label$11;
                        }
                    }
                    while (false);
                    this._storeInt(((_31_ = this._loadInt((_32_ + 36))) + 12), ((this._loadInt((_31_ + 12))) | 268435456));
                    _31_ = this._loadInt(((this._loadInt((_32_ + 68))) + 48));
                    _30_ = this._loadInt((_32_ + 76));
                    _33_ = this._loadInt((_32_ + 56));
                    _34_ = this._loadInt((_32_ + 60));
                    _35_ = this._loadInt((_32_ + 48));
                    this._storeInt((_32_ + 20), (this._loadInt((_32_ + 52))));
                    this._storeInt((_32_ + 16), (_31_ + 1));
                    this._storeInt((_32_ + 12), _35_);
                    this._storeInt((_32_ + 8), _31_);
                    _temp$0 = 32464;
                    _temp$1 = 32496;
                    _temp$2 = (_34_ == 1) ? _temp$0 : _temp$1;
                    this._storeInt((_32_ + 4), _temp$2);
                    this._storeInt(_32_, _33_);
                    sqlite3NestedParse(_30_, 38848, _32_);
                    sqlite3DbFree((this._loadInt((_32_ + 36))), (this._loadInt((_32_ + 48))));
                    this._storeInt(((this._loadInt((_32_ + 36))) + 12), (this._loadInt((_32_ + 24))));
                }
                while (false);
                _temp$3 = 3;
                _temp$4 = 2;
                _temp$5 = ((this._loadInt((_32_ + 40))) != 0) ? _temp$3 : _temp$4;
                sqlite3MinimumFileFormat((this._loadInt((_32_ + 76))), (this._loadInt((_32_ + 60))), _temp$5);
                reloadTableSchema((this._loadInt((_32_ + 76))), (_31_ = this._loadInt((_32_ + 64))), (this._loadInt(_31_)));
                break label$0;
            }
            while (false);
            sqlite3ErrorMsg((this._loadInt((_32_ + 76))), 38800, 0);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 80));
        return;
    }

    @Override()
    public final void sqlite3AlterBeginAddColumn(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_34_ + 40), _31_);
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt((_34_ + 12), (this._loadInt((this._loadInt((_34_ + 44))))))) + 30))) != 0) {
                break label$0;
            }
            if ((this._storeInt((_34_ + 32), (sqlite3LocateTable((this._loadInt((_34_ + 44))), 0, (this._loadInt(((_31_ = this._loadInt((_34_ + 40))) + 12))), (this._loadInt((_31_ + 8))))))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if (((this._loadInt8u(((this._loadInt((_34_ + 32))) + 34))) & 16) == 0) {
                    break label$1;
                }
                sqlite3ErrorMsg((this._loadInt((_34_ + 44))), 38448, 0);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt(((this._loadInt((_34_ + 32))) + 28))) == 0) {
                    break label$2;
                }
                sqlite3ErrorMsg((this._loadInt((_34_ + 44))), 38496, 0);
                break label$0;
            }
            while (false);
            if ((isSystemTable((this._loadInt((_34_ + 44))), (this._loadInt((this._loadInt((_34_ + 32))))))) != 0) {
                break label$0;
            }
            this._storeInt((_34_ + 24), (sqlite3SchemaToIndex((this._loadInt((_34_ + 12))), (this._loadInt(((this._loadInt((_34_ + 32))) + 68))))));
            if ((this._storeInt((_34_ + 36), (sqlite3DbMallocZero((this._loadInt((_34_ + 12))), 76)))) == 0) {
                break label$0;
            }
            _33_ = this._storeInt16(((this._storeInt(((this._loadInt((_34_ + 44))) + 508), (this._loadInt((_34_ + 36))))) + 32), 1);
            this._storeInt(((this._loadInt((_34_ + 36))) + 8), (this._loadInt(((this._loadInt((_34_ + 32))) + 8))));
            _31_ = this._storeInt((_34_ + 16), (((((this._loadInt(((this._loadInt((_34_ + 36))) + 8))) + -1) / 8) << 3) + 8));
            _31_ = sqlite3DbMallocZero((this._loadInt((_34_ + 12))), (_31_ * 24));
            this._storeInt(((this._loadInt((_34_ + 36))) + 12), _31_);
            _31_ = this._loadInt((_34_ + 12));
            this._storeInt(_34_, (this._loadInt((this._loadInt((_34_ + 32))))));
            _31_ = sqlite3MPrintf(_31_, 38528, _34_);
            this._storeInt((_30_ = this._loadInt((_34_ + 36))), _31_);
            label$3:
            do {
                if ((this._loadInt((_30_ + 12))) == 0) {
                    break label$3;
                }
                if ((this._loadInt((this._loadInt((_34_ + 36))))) == 0) {
                    break label$3;
                }
                memcpy((this._loadInt(((_31_ = this._loadInt((_34_ + 36))) + 12))), (this._loadInt(((this._loadInt((_34_ + 32))) + 12))), ((this._loadInt((_31_ + 8))) * 24));
                _32_ = this._storeInt((_34_ + 20), 0);
                label$5:
                do {
                    label$4:
                    while (true) {
                        if ((this._loadInt((_34_ + 20))) >= (this._loadInt(((this._loadInt((_34_ + 36))) + 8)))) {
                            break label$5;
                        }
                        _31_ = this._storeInt((_34_ + 8), ((this._loadInt(((this._loadInt((_34_ + 36))) + 12))) + ((this._loadInt((_34_ + 20))) * 24)));
                        _30_ = sqlite3DbStrDup((this._loadInt((_34_ + 12))), (this._loadInt(_31_)));
                        _33_ = this._storeInt(((_31_ = this._loadInt((_34_ + 8))) + 12), _32_);
                        this._storeInt(_31_, _30_);
                        _31_ = this._storeInt((_31_ + 4), (this._storeInt((_31_ + 16), _33_)));
                        this._storeInt(((this._loadInt((_34_ + 8))) + 8), _31_);
                        this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) + 1));
                        continue label$4;
                    }
                }
                while (false);
                this._storeInt(((this._loadInt((_34_ + 36))) + 68), (this._loadInt((((this._loadInt(((this._loadInt((_34_ + 12))) + 8))) + ((this._loadInt((_34_ + 24))) << 4)) + 12))));
                this._storeInt(((this._loadInt((_34_ + 36))) + 48), (this._loadInt(((this._loadInt((_34_ + 32))) + 48))));
                this._storeInt16(((this._loadInt((_34_ + 36))) + 32), 1);
                sqlite3BeginWriteOperation((this._loadInt((_34_ + 44))), 0, (this._loadInt((_34_ + 24))));
                if ((this._storeInt((_34_ + 28), (sqlite3GetVdbe((this._loadInt((_34_ + 44))))))) == 0) {
                    break label$0;
                }
                sqlite3ChangeCookie((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 24))));
                break label$0;
            }
            while (false);
            this._storeInt8(((this._loadInt((_34_ + 12))) + 30), _33_);
        }
        while (false);
        sqlite3SrcListDelete((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 40))));
        this._storeInt((0 + 4), (_34_ + 48));
        return;
    }

    @Override()
    public final void sqlite3VtabFinishParse(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        int _34_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 112))) + 108), _30_);
        this._storeInt((_32_ + 104), _31_);
        this._storeInt((_32_ + 100), (this._loadInt(((this._loadInt((_32_ + 108))) + 508))));
        this._storeInt((_32_ + 96), (this._loadInt((this._loadInt((_32_ + 108))))));
        label$0:
        do {
            if ((this._loadInt((_32_ + 100))) == 0) {
                break label$0;
            }
            addArgumentToVtab((this._loadInt((_32_ + 108))));
            this._storeInt(((this._loadInt((_32_ + 108))) + 520), 0);
            if ((this._loadInt(((this._loadInt((_32_ + 100))) + 56))) < 1) {
                break label$0;
            }
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt8u(((this._loadInt((_32_ + 96))) + 124))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 72), (this._loadInt(((this._loadInt((_32_ + 100))) + 68))));
                    _31_ = this._storeInt((_32_ + 64), (sqlite3Strlen30((this._storeInt((_32_ + 68), (this._loadInt((this._loadInt((_32_ + 100))))))))));
                    if ((this._storeInt((_32_ + 76), (sqlite3HashInsert(((this._loadInt((_32_ + 72))) + 8), (this._loadInt((_32_ + 68))), _31_, (this._loadInt((_32_ + 100))))))) == 0) {
                        break label$1;
                    }
                    this._storeInt8(((this._loadInt((_32_ + 96))) + 30), 1);
                    break label$0;
                }
                while (false);
                label$3:
                do {
                    if ((this._loadInt((_32_ + 104))) == 0) {
                        break label$3;
                    }
                    this._storeInt(((_31_ = this._loadInt((_32_ + 108))) + 492), (((this._loadInt((_30_ = this._loadInt((_32_ + 104))))) - (this._loadInt((_31_ + 488)))) + (this._loadInt((_30_ + 4)))));
                }
                while (false);
                _31_ = this._loadInt((_32_ + 96));
                this._storeInt((_32_ + 48), ((this._loadInt((_32_ + 108))) + 488));
                this._storeInt((_32_ + 92), (sqlite3MPrintf(_31_, 38288, (_32_ + 48))));
                _31_ = this._storeInt((_32_ + 84), (sqlite3SchemaToIndex((this._loadInt((_32_ + 96))), (this._loadInt(((this._loadInt((_32_ + 100))) + 68))))));
                _30_ = this._loadInt(((this._loadInt(((this._loadInt((_32_ + 96))) + 8))) + (_31_ << 4)));
                _33_ = this._loadInt((this._loadInt((_32_ + 100))));
                this._storeInt((_32_ + 36), (this._loadInt(((_34_ = this._loadInt((_32_ + 108))) + 408))));
                this._storeInt((_32_ + 32), (this._loadInt((_32_ + 92))));
                this._storeInt((_32_ + 24), (this._storeInt((_32_ + 28), _33_)));
                _temp$0 = 32464;
                _temp$1 = 32496;
                _temp$2 = (_31_ == 1) ? _temp$0 : _temp$1;
                this._storeInt((_32_ + 20), _temp$2);
                this._storeInt((_32_ + 16), _30_);
                sqlite3NestedParse(_34_, 38320, (_32_ + 16));
                sqlite3DbFree((this._loadInt((_32_ + 96))), (this._loadInt((_32_ + 92))));
                this._storeInt((_32_ + 80), (sqlite3GetVdbe((this._loadInt((_32_ + 108))))));
                sqlite3ChangeCookie((this._loadInt((_32_ + 108))), (this._loadInt((_32_ + 84))));
                sqlite3VdbeAddOp2((this._loadInt((_32_ + 80))), 122, 0, 0);
                _31_ = this._loadInt((_32_ + 96));
                this._storeInt(_32_, (this._loadInt((this._loadInt((_32_ + 100))))));
                _31_ = this._storeInt((_32_ + 88), (sqlite3MPrintf(_31_, 38416, _32_)));
                sqlite3VdbeAddParseSchemaOp((this._loadInt((_32_ + 80))), (this._loadInt((_32_ + 84))), _31_);
                sqlite3VdbeAddOp4((this._loadInt((_32_ + 80))), 125, (this._loadInt((_32_ + 84))), 0, 0, (_31_ = this._loadInt((this._loadInt((_32_ + 100))))), ((sqlite3Strlen30(_31_)) + 1));
                break label$0;
            }
            while (false);
            this._storeInt(((this._loadInt((_32_ + 108))) + 508), 0);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 112));
        return;
    }

    @Override()
    public final void sqlite3VtabBeginParse(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        sqlite3StartTable((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))), 0, 0, 1, 0);
        label$0:
        do {
            if ((this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((_34_ + 28))) + 508))))) == 0) {
                break label$0;
            }
            this._storeInt((_34_ + 12), (sqlite3SchemaToIndex((this._storeInt((_34_ + 4), (this._loadInt((this._loadInt((_34_ + 28))))))), (this._loadInt(((this._loadInt((_34_ + 8))) + 68))))));
            this._storeInt(((_33_ = this._loadInt((_34_ + 8))) + 56), 0);
            this._storeInt8((_33_ + 34), ((this._loadInt8u((_33_ + 34))) | 16));
            addModuleArgument((_32_ = this._loadInt((_34_ + 4))), _33_, (sqlite3NameFromToken(_32_, (this._loadInt((_34_ + 16))))));
            addModuleArgument((_33_ = this._loadInt((_34_ + 4))), (this._loadInt((_34_ + 8))), (sqlite3DbStrDup(_33_, (this._loadInt(((this._loadInt((_33_ + 8))) + ((this._loadInt((_34_ + 12))) << 4)))))));
            addModuleArgument((_33_ = this._loadInt((_34_ + 4))), (_32_ = this._loadInt((_34_ + 8))), (sqlite3DbStrDup(_33_, (this._loadInt(_32_)))));
            this._storeInt(((this._loadInt((_34_ + 28))) + 492), (((this._loadInt((_33_ = this._loadInt((_34_ + 16))))) + (this._loadInt((_33_ + 4)))) - (this._loadInt((this._loadInt((_34_ + 24)))))));
            if ((this._loadInt(((this._loadInt((_34_ + 8))) + 60))) == 0) {
                break label$0;
            }
            sqlite3AuthCheck((_33_ = this._loadInt((_34_ + 28))), 29, (this._loadInt((_32_ = this._loadInt((_34_ + 8))))), (this._loadInt((this._loadInt((_32_ + 60))))), (this._loadInt(((this._loadInt(((this._loadInt(_33_)) + 8))) + ((this._loadInt((_34_ + 12))) << 4)))));
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final void sqlite3VtabArgInit(int _30_)
    {
        int _31_ = 0;
        addArgumentToVtab((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        this._storeInt(((_30_ = this._loadInt((_31_ + 12))) + 524), (this._storeInt((_30_ + 520), 0)));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3VtabArgExtend(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), ((_31_ = this._loadInt((_32_ + 12))) + 520));
        label$0:
        do {
            if ((this._loadInt((_31_ + 520))) == 0) {
                break label$0;
            }
            this._storeInt(((_31_ = this._loadInt((_32_ + 4))) + 4), (((this._loadInt((_32_ = this._loadInt((_32_ + 8))))) + (this._loadInt((_32_ + 4)))) - (this._loadInt(_31_))));
            return;
        }
        while (false);
        this._storeInt((_31_ = this._loadInt((_32_ + 4))), (this._loadInt((_32_ = this._loadInt((_32_ + 8))))));
        this._storeInt((_31_ + 4), (this._loadInt((_32_ + 4))));
        return;
    }

    @Override()
    public final int yy_find_reduce_action(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt8((_32_ + 11), _31_);
        return (this._loadInt16u((((this._storeInt((_32_ + 4), ((this._storeInt((_32_ + 4), (this._loadInt16s((((this._loadInt((_32_ + 12))) << 1) + 34496))))) + (this._loadInt8u((_32_ + 11)))))) << 1) + 35136)));
    }

    @Override()
    public final void yy_accept(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 8))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((this._loadInt((_31_ + 12))))) < 0) {
                    break label$1;
                }
                yy_pop_parser_stack((this._loadInt((_31_ + 12))));
                continue label$0;
            }
        }
        while (false);
        this._storeInt(((this._loadInt((_31_ + 12))) + 8), (this._loadInt((_31_ + 8))));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void addArgumentToVtab(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 520))) == 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_31_ + 12))) + 508))) == 0) {
                break label$0;
            }
            this._storeInt((_31_ + 8), (this._loadInt(((this._loadInt((_31_ + 12))) + 520))));
            this._storeInt((_31_ + 4), (this._loadInt(((this._loadInt((_31_ + 12))) + 524))));
            addModuleArgument((_30_ = this._storeInt(_31_, (this._loadInt((this._loadInt((_31_ + 12))))))), (this._loadInt(((this._loadInt((_31_ + 12))) + 508))), (sqlite3DbStrNDup(_30_, (this._loadInt((_31_ + 8))), (this._loadInt((_31_ + 4))))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void addModuleArgument(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt(((_32_ = this._loadInt((_33_ + 24))) + 56), ((_32_ = this._loadInt((_32_ + 56))) + 1));
        this._storeInt((_33_ + 16), _32_);
        _32_ = this._storeInt((_33_ + 12), (((this._loadInt(((this._loadInt((_33_ + 24))) + 56))) << 2) + 4));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_33_ + 8), (sqlite3DbRealloc((this._loadInt((_33_ + 28))), (this._loadInt(((this._loadInt((_33_ + 24))) + 60))), _32_)))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ = (this._loadInt((_33_ + 8))) + ((this._loadInt((_33_ + 16))) << 2)), (this._loadInt((_33_ + 20))));
                this._storeInt((_32_ + 4), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 4), 0);
            label$3:
            do {
                label$2:
                while (true) {
                    if ((this._loadInt((_33_ + 4))) >= (this._loadInt((_33_ + 16)))) {
                        break label$3;
                    }
                    sqlite3DbFree((this._loadInt((_33_ + 28))), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 24))) + 60))) + ((this._loadInt((_33_ + 4))) << 2)))));
                    this._storeInt((_33_ + 4), ((this._loadInt((_33_ + 4))) + 1));
                    continue label$2;
                }
            }
            while (false);
            sqlite3DbFree((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 20))));
            sqlite3DbFree((this._loadInt((_33_ + 28))), (this._loadInt(((this._loadInt((_33_ + 24))) + 60))));
            this._storeInt(((this._loadInt((_33_ + 24))) + 56), 0);
        }
        while (false);
        this._storeInt(((this._loadInt((_33_ + 24))) + 60), (this._loadInt((_33_ + 8))));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int sqlite3NameFromToken(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                    break label$1;
                }
                sqlite3Dequote((this._storeInt((_32_ + 4), (sqlite3DbStrNDup((this._loadInt((_32_ + 12))), (this._loadInt((_31_ = this._loadInt((_32_ + 8))))), (this._loadInt((_31_ + 4))))))));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 4), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3AuthCheck(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_35_ + 20), _31_);
        this._storeInt((_35_ + 16), _32_);
        this._storeInt((_35_ + 12), _33_);
        this._storeInt((_35_ + 8), _34_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt8u(((this._storeInt((_35_ + 4), (this._loadInt((this._loadInt((_35_ + 24))))))) + 124))) != 0) {
                        break label$2;
                    }
                    if ((this._loadInt8u(((this._loadInt((_35_ + 24))) + 528))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((_35_ + 28), 0);
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    label$5:
                    do {
                        if ((this._loadInt(((this._loadInt((_35_ + 4))) + 268))) == 0) {
                            break label$5;
                        }
                        if ((this._storeInt(_35_, (this._iiiiiiiTable[this._tableIndices[this._loadInt(((_34_ = this._loadInt((_35_ + 4))) + 268))]].invoke((this._loadInt((_34_ + 272))), (this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 16))), (this._loadInt((_35_ + 12))), (this._loadInt((_35_ + 8))), (this._loadInt(((this._loadInt((_35_ + 24))) + 516))))))) != 1) {
                            break label$4;
                        }
                        sqlite3ErrorMsg((this._loadInt((_35_ + 24))), 28224, 0);
                        this._storeInt(((this._loadInt((_35_ + 24))) + 4), 23);
                        break label$3;
                    }
                    while (false);
                    this._storeInt((_35_ + 28), 0);
                    break label$0;
                }
                while (false);
                if ((this._loadInt(_35_)) == 0) {
                    break label$3;
                }
                if ((this._loadInt(_35_)) == 2) {
                    break label$3;
                }
                this._storeInt(_35_, 1);
                sqliteAuthBadReturnCode((this._loadInt((_35_ + 24))));
            }
            while (false);
            this._storeInt((_35_ + 28), (this._loadInt(_35_)));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 28));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final void sqliteAuthBadReturnCode(int _30_)
    {
        int _31_ = 0;
        sqlite3ErrorMsg((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 38256, 0);
        this._storeInt(((this._loadInt((_31_ + 12))) + 4), 1);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3NestedParse(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 128))) + 124), _30_);
        this._storeInt((_33_ + 120), _31_);
        this._storeInt((_33_ + 108), 0);
        this._storeInt((_33_ + 104), (this._loadInt((this._loadInt((_33_ + 124))))));
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_33_ + 124))) + 64))) != 0) {
                break label$0;
            }
            _31_ = this._storeInt((_33_ + 116), _32_);
            if ((this._storeInt((_33_ + 112), (sqlite3VMPrintf((this._loadInt((_33_ + 104))), (this._loadInt((_33_ + 120))), _31_)))) == 0) {
                break label$0;
            }
            this._storeInt8(((_31_ = this._loadInt((_33_ + 124))) + 19), ((this._loadInt8u((_31_ + 19))) + 1));
            memcpy(_33_, (_31_ + 456), 104);
            memset(((this._loadInt((_33_ + 124))) + 456), 0, 104);
            sqlite3RunParser((this._loadInt((_33_ + 124))), (this._loadInt((_33_ + 112))), (_33_ + 108));
            sqlite3DbFree((this._loadInt((_33_ + 104))), (this._loadInt((_33_ + 108))));
            sqlite3DbFree((this._loadInt((_33_ + 104))), (this._loadInt((_33_ + 112))));
            memcpy(((this._loadInt((_33_ + 124))) + 456), _33_, 104);
            this._storeInt8(((_31_ = this._loadInt((_33_ + 124))) + 19), ((this._loadInt8u((_31_ + 19))) + -1));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 128));
        return;
    }

    @Override()
    public final int sqlite3GetVdbe(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 12))))) != 0) {
                break label$0;
            }
            _30_ = sqlite3VdbeCreate((this._loadInt((this._loadInt((_31_ + 12))))));
            if ((this._storeInt((_31_ + 8), (this._storeInt(((this._loadInt((_31_ + 12))) + 12), _30_)))) == 0) {
                break label$0;
            }
            sqlite3VdbeAddOp0((this._loadInt((_31_ + 8))), 136);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void sqlite3ChangeCookie(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 20), (sqlite3GetTempReg((this._loadInt((_32_ + 28))))));
        this._storeInt((_32_ + 16), (this._loadInt((this._loadInt((_32_ + 28))))));
        sqlite3VdbeAddOp2((this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 28))) + 12))))), 7, ((this._loadInt((this._loadInt((((this._loadInt(((this._loadInt((_32_ + 16))) + 8))) + ((this._loadInt((_32_ + 24))) << 4)) + 12))))) + 1), (this._loadInt((_32_ + 20))));
        sqlite3VdbeAddOp3((this._loadInt((_32_ + 12))), 36, (this._loadInt((_32_ + 24))), 1, (this._loadInt((_32_ + 20))));
        sqlite3ReleaseTempReg((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 20))));
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final int sqlite3VdbeAddOp2(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        _33_ = sqlite3VdbeAddOp3((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))), _33_, 0);
        this._storeInt((0 + 4), (_34_ + 16));
        return _33_;
    }

    @Override()
    public final void sqlite3VdbeAddParseSchemaOp(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        _32_ = this._storeInt((_33_ + 12), (sqlite3VdbeAddOp3((this._loadInt((_33_ + 28))), 99, (this._loadInt((_33_ + 24))), 0, 0)));
        sqlite3VdbeChangeP4((this._loadInt((_33_ + 28))), _32_, (this._loadInt((_33_ + 20))), -1);
        this._storeInt((_33_ + 16), 0);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_33_ + 16))) >= (this._loadInt(((this._loadInt((this._loadInt((_33_ + 28))))) + 4)))) {
                    break label$1;
                }
                sqlite3VdbeUsesBtree((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 16))));
                this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + 1));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int sqlite3VdbeAddOp4(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_,
            int _36_)
    {
        int _37_ = 0;
        this._storeInt(((_37_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_37_ + 24), _31_);
        this._storeInt((_37_ + 20), _32_);
        this._storeInt((_37_ + 16), _33_);
        this._storeInt((_37_ + 12), _34_);
        this._storeInt((_37_ + 8), _35_);
        this._storeInt((_37_ + 4), _36_);
        _36_ = this._storeInt(_37_, (sqlite3VdbeAddOp3((this._loadInt((_37_ + 28))), (this._loadInt((_37_ + 24))), (this._loadInt((_37_ + 20))), (this._loadInt((_37_ + 16))), (this._loadInt((_37_ + 12))))));
        sqlite3VdbeChangeP4((this._loadInt((_37_ + 28))), _36_, (this._loadInt((_37_ + 8))), (this._loadInt((_37_ + 4))));
        _36_ = this._loadInt(_37_);
        this._storeInt((0 + 4), (_37_ + 32));
        return _36_;
    }

    @Override()
    public final int sqlite3VdbeAddOp3(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_35_ + 20), _31_);
        this._storeInt((_35_ + 16), _32_);
        this._storeInt((_35_ + 12), _33_);
        this._storeInt((_35_ + 8), _34_);
        _34_ = this._storeInt((_35_ + 4), (this._loadInt(((this._loadInt((_35_ + 24))) + 28))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 24))) + 32))) > _34_) {
                    break label$1;
                }
                if ((growOpArray((this._loadInt((_35_ + 24))))) == 0) {
                    break label$1;
                }
                this._storeInt((_35_ + 28), 1);
                break label$0;
            }
            while (false);
            this._storeInt(((_34_ = this._loadInt((_35_ + 24))) + 28), ((this._loadInt((_34_ + 28))) + 1));
            this._storeInt8((_34_ = this._storeInt(_35_, ((this._loadInt((_34_ + 4))) + ((this._loadInt((_35_ + 4))) * 20)))), (this._loadInt((_35_ + 20))));
            _34_ = this._storeInt8((_34_ + 3), 0);
            this._storeInt(((this._loadInt(_35_)) + 4), (this._loadInt((_35_ + 16))));
            this._storeInt(((this._loadInt(_35_)) + 8), (this._loadInt((_35_ + 12))));
            this._storeInt(((this._loadInt(_35_)) + 12), (this._loadInt((_35_ + 8))));
            this._storeInt(((this._loadInt(_35_)) + 16), _34_);
            this._storeInt8(((this._loadInt(_35_)) + 1), _34_);
            this._storeInt((_35_ + 28), (this._loadInt((_35_ + 4))));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 28));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3GetTempReg(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), _30_)) + 21))) == 0) {
                break label$0;
            }
            this._storeInt((_31_ + 12), (this._loadInt((((_30_ = this._loadInt((_31_ + 8))) + (((this._storeInt8((_30_ + 21), ((this._loadInt8u((_30_ + 21))) + -1))) & 255) << 2)) + 24))));
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        this._storeInt((_31_ + 12), (this._storeInt(((_30_ = this._loadInt((_31_ + 8))) + 72), ((this._loadInt((_30_ + 72))) + 1))));
        return (this._loadInt((_31_ + 12)));
    }

    @Override()
    public final void sqlite3ReleaseTempReg(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 21))) > 7) {
                break label$0;
            }
            this._storeInt((_32_ + 4), 0);
            this._storeInt(_32_, ((this._loadInt((_32_ + 12))) + 96));
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt((_32_ + 4))) > 9) {
                            break label$1;
                        }
                        if ((this._loadInt(((this._loadInt(_32_)) + 16))) == (this._loadInt((_32_ + 8)))) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                        this._storeInt(_32_, ((this._loadInt(_32_)) + 24));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt8(((this._loadInt(_32_)) + 8), 1);
                return;
            }
            while (false);
            this._storeInt8(((_31_ = this._loadInt((_32_ + 12))) + 21), ((_30_ = this._loadInt8u((_31_ + 21))) + 1));
            this._storeInt(((_31_ + (_30_ << 2)) + 24), (this._loadInt((_32_ + 8))));
        }
        while (false);
        return;
    }

    @Override()
    public final int sqlite3VdbeAddOp0(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = sqlite3VdbeAddOp3((this._loadInt((_32_ + 12))), _31_, 0, 0, 0);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int isSystemTable(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((sqlite3Strlen30((this._storeInt((_32_ + 4), _31_)))) < 7) {
                    break label$1;
                }
                if ((sqlite3_strnicmp((this._loadInt((_32_ + 4))), 38560, 7)) != 0) {
                    break label$1;
                }
                _31_ = this._loadInt((_32_ + 8));
                this._storeInt(_32_, (this._loadInt((_32_ + 4))));
                sqlite3ErrorMsg(_31_, 38576, _32_);
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
    public final void sqlite3BeginWriteOperation(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_33_ + 12))) + 424))) == 0) {
                    break label$1;
                }
                _32_ = this._loadInt(((this._loadInt((_33_ + 12))) + 424));
                break label$0;
            }
            while (false);
            _32_ = this._loadInt((_33_ + 12));
        }
        while (false);
        this._storeInt(_33_, _32_);
        sqlite3CodeVerifySchema((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 4))));
        this._storeInt(((_32_ = this._loadInt(_33_)) + 336), ((this._loadInt((_32_ + 336))) | (1 << (this._loadInt((_33_ + 4))))));
        this._storeInt8((_32_ + 344), ((this._loadInt8u((_32_ + 344))) | (this._loadInt((_33_ + 8)))));
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void sqlite3CodeVerifySchema(int _30_, int _31_)
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
        label$2:
        do {
            label$3:
            do {
                if ((this._loadInt(((this._storeInt((_32_ + 20), _31_)) + 348))) != 0) {
                    break label$3;
                }
                if ((this._storeInt((_32_ + 16), (sqlite3GetVdbe((this._loadInt((_32_ + 20))))))) == 0) {
                    break label$2;
                }
                _31_ = sqlite3VdbeAddOp2((this._loadInt((_32_ + 16))), 1, 0, 0);
                this._storeInt(((this._loadInt((_32_ + 20))) + 348), (_31_ + 1));
            }
            while (false);
            if ((this._loadInt((_32_ + 24))) < 0) {
                break label$2;
            }
            this._storeInt((_32_ + 12), (this._loadInt((this._loadInt((_32_ + 20))))));
            if (((this._storeInt((_32_ + 8), (1 << (this._loadInt((_32_ + 24)))))) & (this._loadInt(((this._loadInt((_32_ + 20))) + 340)))) != 0) {
                break label$2;
            }
            this._storeInt(((_31_ = this._loadInt((_32_ + 20))) + 340), ((this._loadInt((_31_ + 340))) | (this._loadInt((_32_ + 8)))));
            this._storeInt(((_31_ + ((_30_ = this._loadInt((_32_ + 24))) << 2)) + 352), (this._loadInt((this._loadInt((((this._loadInt(((this._loadInt((_32_ + 12))) + 8))) + (_30_ << 4)) + 12))))));
            if ((this._loadInt((_32_ + 24))) != 1) {
                break label$2;
            }
            sqlite3OpenTempDatabase((this._loadInt((_32_ + 20))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final int sqlite3ValueFromExpr(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_35_ + 52), _31_);
        this._storeInt8((_35_ + 51), _32_);
        this._storeInt8((_35_ + 50), _33_);
        this._storeInt((_35_ + 44), _34_);
        _34_ = this._storeInt((_35_ + 32), (this._storeInt((_35_ + 36), 0)));
        this._storeInt((_35_ + 28), 1);
        this._storeInt((_35_ + 24), 21392);
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
                                            if ((this._loadInt((_35_ + 52))) == 0) {
                                                break label$8;
                                            }
                                            label$9:
                                            do {
                                                if ((this._storeInt((_35_ + 40), (this._loadInt8u((this._loadInt((_35_ + 52))))))) != 132) {
                                                    break label$9;
                                                }
                                                this._storeInt((_35_ + 40), (this._loadInt8u(((this._loadInt((_35_ + 52))) + 35))));
                                            }
                                            while (false);
                                            label$10:
                                            do {
                                                if ((this._loadInt((_35_ + 40))) != 156) {
                                                    break label$10;
                                                }
                                                label$11:
                                                do {
                                                    if ((this._loadInt8u((this._loadInt(((this._loadInt((_35_ + 52))) + 8))))) == 129) {
                                                        break label$11;
                                                    }
                                                    if ((this._loadInt8u((this._loadInt(((this._loadInt((_35_ + 52))) + 8))))) != 130) {
                                                        break label$10;
                                                    }
                                                }
                                                while (false);
                                                this._storeInt((_35_ + 40), (this._loadInt8u((this._storeInt((_35_ + 52), (this._loadInt(((this._loadInt((_35_ + 52))) + 8))))))));
                                                this._storeInt((_35_ + 28), -1);
                                                this._storeInt((_35_ + 24), 39040);
                                            }
                                            while (false);
                                            label$12:
                                            do {
                                                if ((this._loadInt((_35_ + 40))) == 94) {
                                                    break label$12;
                                                }
                                                if ((this._loadInt((_35_ + 40))) == 130) {
                                                    break label$12;
                                                }
                                                if ((this._loadInt((_35_ + 40))) != 129) {
                                                    break label$5;
                                                }
                                            }
                                            while (false);
                                            if ((this._storeInt((_35_ + 32), (sqlite3ValueNew((this._loadInt((_35_ + 56))))))) == 0) {
                                                break label$4;
                                            }
                                            if (((this._loadInt16u(((this._loadInt((_35_ + 52))) + 2))) & 1024) == 0) {
                                                break label$7;
                                            }
                                            sqlite3VdbeMemSetInt64((this._loadInt((_35_ + 32))), ((this._loadLong32s(((this._loadInt((_35_ + 52))) + 4))) * (this._loadLong32s((_35_ + 28)))));
                                            break label$6;
                                        }
                                        while (false);
                                        this._storeInt((_35_ + 60), (this._storeInt((this._loadInt((_35_ + 44))), _34_)));
                                        break label$0;
                                    }
                                    while (false);
                                    this._storeInt((_35_ + 4), (this._loadInt(((this._loadInt((_35_ + 52))) + 4))));
                                    _34_ = this._loadInt((_35_ + 56));
                                    this._storeInt(_35_, (this._loadInt((_35_ + 24))));
                                    if ((this._storeInt((_35_ + 36), (sqlite3MPrintf(_34_, 25088, _35_)))) == 0) {
                                        break label$4;
                                    }
                                    sqlite3ValueSetStr((this._loadInt((_35_ + 32))), -1, (this._loadInt((_35_ + 36))), 1, 14);
                                    if ((this._loadInt((_35_ + 40))) != 130) {
                                        break label$6;
                                    }
                                    this._storeInt8(((this._loadInt((_35_ + 32))) + 30), 2);
                                }
                                while (false);
                                label$13:
                                do {
                                    label$14:
                                    do {
                                        label$15:
                                        do {
                                            if ((this._loadInt((_35_ + 40))) == 129) {
                                                break label$15;
                                            }
                                            if ((this._loadInt((_35_ + 40))) != 130) {
                                                break label$14;
                                            }
                                        }
                                        while (false);
                                        if ((this._loadInt8u((_35_ + 50))) != 98) {
                                            break label$14;
                                        }
                                        sqlite3ValueApplyAffinity((this._loadInt((_35_ + 32))), 99, 1);
                                        break label$13;
                                    }
                                    while (false);
                                    sqlite3ValueApplyAffinity((this._loadInt((_35_ + 32))), (this._loadInt8u((_35_ + 50))), 1);
                                }
                                while (false);
                                label$16:
                                do {
                                    if (((this._loadInt16u(((this._loadInt((_35_ + 32))) + 28))) & 12) == 0) {
                                        break label$16;
                                    }
                                    this._storeInt16(((_34_ = this._loadInt((_35_ + 32))) + 28), ((this._loadInt16u((_34_ + 28))) & 65533));
                                }
                                while (false);
                                if ((this._loadInt8u((_35_ + 51))) == 1) {
                                    break label$1;
                                }
                                sqlite3VdbeChangeEncoding((this._loadInt((_35_ + 32))), (this._loadInt8u((_35_ + 51))));
                                break label$1;
                            }
                            while (false);
                            label$17:
                            do {
                                if ((this._loadInt((_35_ + 40))) != 156) {
                                    break label$17;
                                }
                                if ((sqlite3ValueFromExpr((this._loadInt((_35_ + 56))), (this._loadInt(((this._loadInt((_35_ + 52))) + 8))), (this._loadInt8u((_35_ + 51))), (this._loadInt8u((_35_ + 50))), (_35_ + 32))) != 0) {
                                    break label$1;
                                }
                                sqlite3VdbeMemNumerify((this._loadInt((_35_ + 32))));
                                if ((this._loadLong(((this._loadInt((_35_ + 32))) + 16))) != -9223372036854775808L) {
                                    break label$3;
                                }
                                this._storeInt16(((_34_ = this._loadInt((_35_ + 32))) + 28), ((this._loadInt16u((_34_ + 28))) & 4));
                                this._storeInt16((_34_ + 28), ((this._loadInt16u((_34_ + 28))) | 8));
                                this._storeLong(((this._loadInt((_35_ + 32))) + 8), 4890909195324358656L);
                                break label$2;
                            }
                            while (false);
                            label$18:
                            do {
                                if ((this._loadInt((_35_ + 40))) != 98) {
                                    break label$18;
                                }
                                if ((this._storeInt((_35_ + 32), (sqlite3ValueNew((this._loadInt((_35_ + 56))))))) != 0) {
                                    break label$1;
                                }
                                break label$4;
                            }
                            while (false);
                            if ((this._loadInt((_35_ + 40))) != 131) {
                                break label$1;
                            }
                            if ((this._storeInt((_35_ + 32), (sqlite3ValueNew((this._loadInt((_35_ + 56))))))) == 0) {
                                break label$4;
                            }
                            _34_ = this._storeInt((_35_ + 20), ((sqlite3Strlen30((this._storeInt((_35_ + 36), ((this._loadInt(((this._loadInt((_35_ + 52))) + 4))) + 2))))) + -1));
                            sqlite3VdbeMemSetStr((this._loadInt((_35_ + 32))), (sqlite3HexToBlob((this._loadInt((_35_ + 56))), (this._loadInt((_35_ + 36))), _34_)), ((this._loadInt((_35_ + 20))) / 2), 0, 14);
                            break label$1;
                        }
                        while (false);
                        this._storeInt8(((_34_ = this._loadInt((_35_ + 56))) + 30), 1);
                        sqlite3DbFree(_34_, (this._loadInt((_35_ + 36))));
                        sqlite3ValueFree((this._loadInt((_35_ + 32))));
                        this._storeInt((this._loadInt((_35_ + 44))), 0);
                        this._storeInt((_35_ + 60), 7);
                        break label$0;
                    }
                    while (false);
                    this._storeLong(((_34_ = this._loadInt((_35_ + 32))) + 16), (0L - (this._loadLong((_34_ + 16)))));
                }
                while (false);
                this._storeDouble(((_34_ = this._loadInt((_35_ + 32))) + 8), (-(this._loadDouble((_34_ + 8)))));
                sqlite3ValueApplyAffinity(_34_, (this._loadInt8u((_35_ + 50))), (this._loadInt8u((_35_ + 51))));
            }
            while (false);
            label$19:
            do {
                if ((this._loadInt((_35_ + 32))) == 0) {
                    break label$19;
                }
                sqlite3VdbeMemStoreType((this._loadInt((_35_ + 32))));
            }
            while (false);
            this._storeInt((this._loadInt((_35_ + 44))), (this._loadInt((_35_ + 32))));
            this._storeInt((_35_ + 60), 0);
        }
        while (false);
        _34_ = this._loadInt((_35_ + 60));
        this._storeInt((0 + 4), (_35_ + 64));
        return _34_;
    }

    @Override()
    public final void sqlite3MinimumFileFormat(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        label$0:
        do {
            if ((this._storeInt((_33_ + 16), (sqlite3GetVdbe((this._loadInt((_33_ + 28))))))) == 0) {
                break label$0;
            }
            this._storeInt((_33_ + 12), (sqlite3GetTempReg((this._loadInt((_33_ + 28))))));
            this._storeInt((_33_ + 8), (sqlite3GetTempReg((this._loadInt((_33_ + 28))))));
            sqlite3VdbeAddOp3((this._loadInt((_33_ + 16))), 35, (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 12))), 2);
            sqlite3VdbeUsesBtree((this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 24))));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 16))), 7, (this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 8))));
            this._storeInt((_33_ + 4), (sqlite3VdbeAddOp3((this._loadInt((_33_ + 16))), 80, (this._loadInt((_33_ + 8))), 0, (this._loadInt((_33_ + 12))))));
            sqlite3VdbeAddOp3((this._loadInt((_33_ + 16))), 36, (this._loadInt((_33_ + 24))), 2, (this._loadInt((_33_ + 8))));
            sqlite3VdbeJumpHere((this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 4))));
            sqlite3ReleaseTempReg((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 12))));
            sqlite3ReleaseTempReg((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void reloadTableSchema(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_33_ + 40), _31_);
        this._storeInt((_33_ + 36), _32_);
        label$0:
        do {
            if ((this._storeInt((_33_ + 32), (sqlite3GetVdbe((this._loadInt((_33_ + 44))))))) == 0) {
                break label$0;
            }
            this._storeInt((_33_ + 24), (sqlite3SchemaToIndex((this._loadInt((this._loadInt((_33_ + 44))))), (this._loadInt(((this._loadInt((_33_ + 40))) + 68))))));
            this._storeInt((_33_ + 20), (sqlite3TriggerList((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 40))))));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_33_ + 20))) == 0) {
                        break label$2;
                    }
                    _32_ = this._storeInt((_33_ + 16), (sqlite3SchemaToIndex((this._loadInt((this._loadInt((_33_ + 44))))), (this._loadInt(((this._loadInt((_33_ + 20))) + 20))))));
                    sqlite3VdbeAddOp4((this._loadInt((_33_ + 32))), 103, _32_, 0, 0, (this._loadInt((this._loadInt((_33_ + 20))))), 0);
                    this._storeInt((_33_ + 20), (this._loadInt(((this._loadInt((_33_ + 20))) + 32))));
                    continue label$1;
                }
            }
            while (false);
            sqlite3VdbeAddOp4((this._loadInt((_33_ + 32))), 101, (this._loadInt((_33_ + 24))), 0, 0, (this._loadInt((this._loadInt((_33_ + 40))))), 0);
            _32_ = this._loadInt((this._loadInt((_33_ + 44))));
            this._storeInt(_33_, (this._loadInt((_33_ + 36))));
            if ((this._storeInt((_33_ + 28), (sqlite3MPrintf(_32_, 38960, _33_)))) == 0) {
                break label$0;
            }
            sqlite3VdbeAddParseSchemaOp((this._loadInt((_33_ + 32))), (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 28))));
            if ((this._storeInt((_33_ + 28), (whereTempTriggers((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 40))))))) == 0) {
                break label$0;
            }
            sqlite3VdbeAddParseSchemaOp((this._loadInt((_33_ + 32))), 1, (this._loadInt((_33_ + 28))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 48));
        return;
    }

    @Override()
    public final int sqlite3TriggerList(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt(((this._loadInt((this._loadInt((_32_ + 24))))) + 8))) + 28))));
        _31_ = this._storeInt((_32_ + 12), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 442))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 28), _31_);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt((_32_ + 16))) == (this._loadInt(((this._loadInt((_32_ + 20))) + 68)))) {
                    break label$2;
                }
                this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((_32_ + 16))) + 48))));
                label$4:
                do {
                    label$3:
                    while (true) {
                        if ((this._loadInt((_32_ + 8))) == 0) {
                            break label$4;
                        }
                        label$5:
                        do {
                            if ((this._loadInt(((this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 8))) + 8))))) + 24))) != (this._loadInt(((this._loadInt((_32_ + 20))) + 68)))) {
                                break label$5;
                            }
                            if ((sqlite3StrICmp((this._loadInt(((this._loadInt((_32_ + 4))) + 4))), (this._loadInt((this._loadInt((_32_ + 20))))))) != 0) {
                                break label$5;
                            }
                            label$6:
                            do {
                                label$7:
                                do {
                                    if ((this._loadInt((_32_ + 12))) == 0) {
                                        break label$7;
                                    }
                                    _31_ = this._loadInt((_32_ + 12));
                                    break label$6;
                                }
                                while (false);
                                _31_ = this._loadInt(((this._loadInt((_32_ + 20))) + 64));
                            }
                            while (false);
                            this._storeInt(((_30_ = this._loadInt((_32_ + 4))) + 32), _31_);
                            this._storeInt((_32_ + 12), _30_);
                        }
                        while (false);
                        this._storeInt((_32_ + 8), (this._loadInt((this._loadInt((_32_ + 8))))));
                        continue label$3;
                    }
                }
                while (false);
            }
            while (false);
            label$8:
            do {
                label$9:
                do {
                    if ((this._loadInt((_32_ + 12))) == 0) {
                        break label$9;
                    }
                    _31_ = this._loadInt((_32_ + 12));
                    break label$8;
                }
                while (false);
                _31_ = this._loadInt(((this._loadInt((_32_ + 20))) + 64));
            }
            while (false);
            this._storeInt((_32_ + 28), _31_);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int whereTempTriggers(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 16), 0);
        label$0:
        do {
            if ((this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt(((this._loadInt((this._loadInt((_32_ + 28))))) + 8))) + 28))))) == (this._loadInt(((this._loadInt((_32_ + 24))) + 68)))) {
                break label$0;
            }
            this._storeInt((_32_ + 8), (this._loadInt((this._loadInt((_32_ + 28))))));
            this._storeInt((_32_ + 20), (sqlite3TriggerList((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 24))))));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 20))) == 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._loadInt(((this._loadInt((_32_ + 20))) + 20))) != (this._loadInt((_32_ + 12)))) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 16), (whereOrName((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 16))), (this._loadInt((this._loadInt((_32_ + 20))))))));
                    }
                    while (false);
                    this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 20))) + 32))));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        label$4:
        do {
            if ((this._loadInt((_32_ + 16))) == 0) {
                break label$4;
            }
            _31_ = this._loadInt((this._loadInt((_32_ + 28))));
            this._storeInt(_32_, (this._loadInt((_32_ + 16))));
            this._storeInt((_32_ + 4), (sqlite3MPrintf(_31_, 38976, _32_)));
            sqlite3DbFree((this._loadInt((this._loadInt((_32_ + 28))))), (this._loadInt((_32_ + 16))));
            this._storeInt((_32_ + 16), (this._loadInt((_32_ + 4))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 16));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int whereOrName(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_33_ + 40), _31_);
        this._storeInt((_33_ + 36), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_33_ + 40))) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 4), (this._loadInt((_33_ + 36))));
                _32_ = this._loadInt((_33_ + 44));
                this._storeInt(_33_, (this._loadInt((_33_ + 40))));
                this._storeInt((_33_ + 32), (sqlite3MPrintf(_32_, 39024, _33_)));
                sqlite3DbFree((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 40))));
                break label$0;
            }
            while (false);
            _32_ = this._loadInt((_33_ + 44));
            this._storeInt((_33_ + 16), (this._loadInt((_33_ + 36))));
            this._storeInt((_33_ + 32), (sqlite3MPrintf(_32_, 39008, (_33_ + 16))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 32));
        this._storeInt((0 + 4), (_33_ + 48));
        return _32_;
    }

    @Override()
    public final void sqlite3VdbeJumpHere(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        sqlite3VdbeChangeP2((_30_ = this._loadInt((_32_ + 12))), _31_, (this._loadInt((_30_ + 28))));
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3ValueApplyAffinity(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt8((_33_ + 11), _31_);
        this._storeInt8((_33_ + 10), _32_);
        applyAffinity((this._loadInt((_33_ + 12))), (this._loadInt8s((_33_ + 11))), (this._loadInt8u((_33_ + 10))));
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int sqlite3VdbeMemNumerify(int _30_)
    {
        int _31_ = 0;
        double _32_ = 0.0;
        label$0:
        do {
            if (((this._loadInt16u(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 28))) & 13) != 0) {
                break label$0;
            }
            label$1:
            do {
                if ((sqlite3Atoi64((this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 4))), (_30_ + 16), (this._loadInt((_30_ + 24))), (this._loadInt8u((_30_ + 31))))) != 0) {
                    break label$1;
                }
                this._storeInt16(((_30_ = this._loadInt((_31_ + 12))) + 28), (((this._loadInt16u((_30_ + 28))) & 48896) | 4));
                break label$0;
            }
            while (false);
            _32_ = sqlite3VdbeRealValue((this._loadInt((_31_ + 12))));
            this._storeDouble(((_30_ = this._loadInt((_31_ + 12))) + 8), _32_);
            this._storeInt16((_30_ + 28), (((this._loadInt16u((_30_ + 28))) & 48896) | 8));
            sqlite3VdbeIntegerAffinity(_30_);
        }
        while (false);
        this._storeInt16(((_30_ = this._loadInt((_31_ + 12))) + 28), ((this._loadInt16u((_30_ + 28))) & 65517));
        this._storeInt((0 + 4), (_31_ + 16));
        return 0;
    }

    @Override()
    public final int sqlite3HexToBlob(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 16), (sqlite3DbMallocRaw((this._loadInt((_33_ + 28))), ((_32_ / 2) + 1))));
        this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -1));
        label$0:
        do {
            if ((this._loadInt((_33_ + 16))) == 0) {
                break label$0;
            }
            this._storeInt((_33_ + 12), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_33_ + 12))) >= (this._loadInt((_33_ + 20)))) {
                        break label$2;
                    }
                    _32_ = sqlite3HexToInt((this._loadInt8s(((this._loadInt((_33_ + 24))) + (this._loadInt((_33_ + 12)))))));
                    _31_ = sqlite3HexToInt((this._loadInt8s((((this._loadInt((_33_ + 24))) + (this._loadInt((_33_ + 12)))) + 1))));
                    this._storeInt8(((this._loadInt((_33_ + 16))) + ((this._loadInt((_33_ + 12))) / 2)), (_31_ | (_32_ << 4)));
                    this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 2));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt8(((this._loadInt((_33_ + 16))) + ((this._loadInt((_33_ + 12))) / 2)), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 16));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final void sqlite3VdbeIntegerAffinity(int _30_)
    {
        int _31_ = 0;
        long _32_ = 0L;
        _32_ = doubleToInt64((this._loadDouble(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 8))));
        this._storeLong(((_30_ = this._loadInt((_31_ + 12))) + 16), _32_);
        label$0:
        do {
            if ((this._loadDouble((_30_ + 8))) != ((double) _32_)) {
                break label$0;
            }
            if ((this._loadLong(((this._loadInt((_31_ + 12))) + 16))) == -9223372036854775808L) {
                break label$0;
            }
            if ((this._loadLong(((this._loadInt((_31_ + 12))) + 16))) == 9223372036854775807L) {
                break label$0;
            }
            this._storeInt16(((_30_ = this._loadInt((_31_ + 12))) + 28), ((this._loadInt16u((_30_ + 28))) | 4));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void applyAffinity(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt8((_33_ + 11), _31_);
        this._storeInt8((_33_ + 10), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8s((_33_ + 11))) != 97) {
                    break label$1;
                }
                label$2:
                do {
                    if (((this._loadInt16u(((this._loadInt((_33_ + 12))) + 28))) & 2) != 0) {
                        break label$2;
                    }
                    if (((this._loadInt16u(((this._loadInt((_33_ + 12))) + 28))) & 12) == 0) {
                        break label$2;
                    }
                    sqlite3VdbeMemStringify((this._loadInt((_33_ + 12))), (this._loadInt8u((_33_ + 10))));
                }
                while (false);
                this._storeInt16(((_32_ = this._loadInt((_33_ + 12))) + 28), ((this._loadInt16u((_32_ + 28))) & 65523));
                break label$0;
            }
            while (false);
            if ((this._loadInt8s((_33_ + 11))) == 98) {
                break label$0;
            }
            applyNumericAffinity((this._loadInt((_33_ + 12))));
            if (((this._loadInt16u(((this._loadInt((_33_ + 12))) + 28))) & 8) == 0) {
                break label$0;
            }
            sqlite3VdbeIntegerAffinity((this._loadInt((_33_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int sqlite3CheckObjectName(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((this._loadInt((_32_ + 8))))) + 124))) != 0) {
                    break label$1;
                }
                if ((this._loadInt8u(((this._loadInt((_32_ + 8))) + 19))) != 0) {
                    break label$1;
                }
                if (((this._loadInt8u(((this._loadInt((this._loadInt((_32_ + 8))))) + 14))) & 1) != 0) {
                    break label$1;
                }
                if ((sqlite3_strnicmp((this._loadInt((_32_ + 4))), 38560, 7)) != 0) {
                    break label$1;
                }
                _31_ = this._loadInt((_32_ + 8));
                this._storeInt(_32_, (this._loadInt((_32_ + 4))));
                sqlite3ErrorMsg(_31_, 41360, _32_);
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
    public final int sqlite3ViewGetColumnNames(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_32_ + 36), _31_);
        this._storeInt((_32_ + 24), 0);
        this._storeInt((_32_ + 16), (this._loadInt((this._loadInt((_32_ + 40))))));
        label$0:
        do {
            label$1:
            do {
                if ((sqlite3VtabCallConnect((this._loadInt((_32_ + 40))), (this._loadInt((_32_ + 36))))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 44), 1);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt8u(((this._loadInt((_32_ + 36))) + 34))) & 16) == 0) {
                    break label$2;
                }
                this._storeInt((_32_ + 44), 0);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt(((this._loadInt((_32_ + 36))) + 8))) < 1) {
                    break label$3;
                }
                this._storeInt((_32_ + 44), 0);
                break label$0;
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
                            label$8:
                            do {
                                if ((this._loadInt(((this._loadInt((_32_ + 36))) + 8))) <= -1) {
                                    break label$8;
                                }
                                if ((this._storeInt((_32_ + 28), (sqlite3SelectDup((this._loadInt((_32_ + 16))), (this._loadInt(((this._loadInt((_32_ + 36))) + 28))), 0)))) == 0) {
                                    break label$7;
                                }
                                this._storeInt8((_32_ + 11), (this._loadInt8u(((this._loadInt((_32_ + 16))) + 234))));
                                this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 40))) + 68))));
                                sqlite3SrcListAssignCursors((this._loadInt((_32_ + 40))), (this._loadInt(((this._loadInt((_32_ + 28))) + 8))));
                                this._storeInt(((this._loadInt((_32_ + 36))) + 8), -1);
                                _30_ = this._storeInt8(((_31_ = this._loadInt((_32_ + 16))) + 234), 0);
                                this._storeInt((_32_ + 12), (this._loadInt((_31_ + 268))));
                                this._storeInt(((this._loadInt((_32_ + 16))) + 268), _30_);
                                this._storeInt((_32_ + 32), (sqlite3ResultSetOfSelect((this._loadInt((_32_ + 40))), (this._loadInt((_32_ + 28))))));
                                this._storeInt(((_31_ = this._loadInt((_32_ + 16))) + 268), (this._loadInt((_32_ + 12))));
                                this._storeInt8((_31_ + 234), (this._loadInt8u((_32_ + 11))));
                                this._storeInt(((this._loadInt((_32_ + 40))) + 68), (this._loadInt((_32_ + 20))));
                                if ((this._loadInt((_32_ + 32))) == 0) {
                                    break label$6;
                                }
                                this._storeInt(((_31_ = this._loadInt((_32_ + 36))) + 8), (this._loadInt(((_30_ = this._loadInt((_32_ + 32))) + 8))));
                                this._storeInt((_31_ + 12), (this._loadInt((_30_ + 12))));
                                _31_ = this._storeInt(((this._loadInt((_32_ + 32))) + 8), 0);
                                this._storeInt(((this._loadInt((_32_ + 32))) + 12), _31_);
                                sqlite3DeleteTable((this._loadInt((_32_ + 16))), (this._loadInt((_32_ + 32))));
                                this._storeInt16(((_31_ = this._loadInt(((this._loadInt((_32_ + 36))) + 68))) + 78), ((this._loadInt16u((_31_ + 78))) | 2));
                                break label$5;
                            }
                            while (false);
                            _31_ = this._loadInt((_32_ + 40));
                            this._storeInt(_32_, (this._loadInt((this._loadInt((_32_ + 36))))));
                            sqlite3ErrorMsg(_31_, 39792, _32_);
                            this._storeInt((_32_ + 44), 1);
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                        break label$4;
                    }
                    while (false);
                    this._storeInt(((this._loadInt((_32_ + 36))) + 8), 0);
                    this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                }
                while (false);
                sqlite3SelectDelete((this._loadInt((_32_ + 16))), (this._loadInt((_32_ + 28))));
            }
            while (false);
            this._storeInt((_32_ + 44), (this._loadInt((_32_ + 24))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 44));
        this._storeInt((0 + 4), (_32_ + 48));
        return _31_;
    }

    @Override()
    public final int sqlite3GetVTable(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 4), (this._loadInt(((this._storeInt((_32_ + 8), _31_)) + 52))));
        label$1:
        do {
            label$0:
            while (true) {
                _31_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_32_ + 4))) == 0) {
                        break label$2;
                    }
                    _31_ = ((this._loadInt((this._loadInt((_32_ + 4))))) != (this._loadInt((_32_ + 12)))) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 4))) + 24))));
                continue label$0;
            }
        }
        while (false);
        return (this._loadInt((_32_ + 4)));
    }

    @Override()
    public final void sqlite3MayAbort(int _30_)
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
        this._storeInt8((_30_ + 345), 1);
        this._storeInt((_31_ + 8), _30_);
        return;
    }

    @Override()
    public final int whereForeignKeys(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt(_32_, 0);
        this._storeInt((_32_ + 4), (sqlite3FkReferences((this._loadInt((_32_ + 8))))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 4))) == 0) {
                    break label$1;
                }
                this._storeInt(_32_, (whereOrName((this._loadInt((this._loadInt((_32_ + 12))))), (this._loadInt(_32_)), (this._loadInt((this._loadInt((this._loadInt((_32_ + 4))))))))));
                this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 4))) + 12))));
                continue label$0;
            }
        }
        while (false);
        _31_ = this._loadInt(_32_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3FkReferences(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (sqlite3Strlen30((this._loadInt((this._storeInt((_31_ + 12), _30_)))))));
        _30_ = sqlite3HashFind(((this._loadInt(((_32_ = this._loadInt((_31_ + 12))) + 68))) + 56), (this._loadInt(_32_)), _30_);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3VtabCallConnect(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_32_ + 52), _31_);
        this._storeInt((_32_ + 48), (this._loadInt((this._loadInt((_32_ + 56))))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadInt8u(((this._loadInt((_32_ + 52))) + 34))) & 16) == 0) {
                        break label$2;
                    }
                    if ((sqlite3GetVTable((this._loadInt((_32_ + 48))), (this._loadInt((_32_ + 52))))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((_32_ + 60), 0);
                break label$0;
            }
            while (false);
            _31_ = this._storeInt((_32_ + 44), (this._loadInt((this._loadInt(((this._loadInt((_32_ + 52))) + 60))))));
            label$3:
            do {
                label$4:
                do {
                    if ((this._storeInt((_32_ + 40), (sqlite3HashFind(((this._loadInt((_32_ + 48))) + 288), _31_, (sqlite3Strlen30(_31_)))))) == 0) {
                        break label$4;
                    }
                    this._storeInt((_32_ + 28), 0);
                    label$5:
                    do {
                        if ((this._storeInt((_32_ + 36), (vtabCallConstructor((this._loadInt((_32_ + 48))), (this._loadInt((_32_ + 52))), (_31_ = this._loadInt((_32_ + 40))), (this._loadInt(((this._loadInt(_31_)) + 8))), (_32_ + 28))))) == 0) {
                            break label$5;
                        }
                        _31_ = this._loadInt((_32_ + 56));
                        this._storeInt(_32_, (this._loadInt((_32_ + 28))));
                        sqlite3ErrorMsg(_31_, 22192, _32_);
                    }
                    while (false);
                    sqlite3DbFree((this._loadInt((_32_ + 48))), (this._loadInt((_32_ + 28))));
                    break label$3;
                }
                while (false);
                _31_ = this._storeInt((_32_ + 32), (this._loadInt((this._loadInt(((this._loadInt((_32_ + 52))) + 60))))));
                _30_ = this._loadInt((_32_ + 56));
                this._storeInt((_32_ + 16), _31_);
                sqlite3ErrorMsg(_30_, 41216, (_32_ + 16));
                this._storeInt((_32_ + 36), 1);
            }
            while (false);
            this._storeInt((_32_ + 60), (this._loadInt((_32_ + 36))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 60));
        this._storeInt((0 + 4), (_32_ + 64));
        return _31_;
    }

    @Override()
    public final int sqlite3SelectDup(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_33_ + 20))) == 0) {
                        break label$2;
                    }
                    if ((this._storeInt((_33_ + 12), (sqlite3DbMallocRaw((this._loadInt((_33_ + 24))), 80)))) == 0) {
                        break label$1;
                    }
                    _32_ = sqlite3ExprListDup((this._loadInt((_33_ + 24))), (this._loadInt((this._loadInt((_33_ + 20))))), (this._loadInt((_33_ + 16))));
                    this._storeInt((this._loadInt((_33_ + 12))), _32_);
                    _32_ = sqlite3SrcListDup((this._loadInt((_33_ + 24))), (this._loadInt(((this._loadInt((_33_ + 20))) + 8))), (this._loadInt((_33_ + 16))));
                    this._storeInt(((this._loadInt((_33_ + 12))) + 8), _32_);
                    _32_ = sqlite3ExprDup((this._loadInt((_33_ + 24))), (this._loadInt(((this._loadInt((_33_ + 20))) + 12))), (this._loadInt((_33_ + 16))));
                    this._storeInt(((this._loadInt((_33_ + 12))) + 12), _32_);
                    _32_ = sqlite3ExprListDup((this._loadInt((_33_ + 24))), (this._loadInt(((this._loadInt((_33_ + 20))) + 16))), (this._loadInt((_33_ + 16))));
                    this._storeInt(((this._loadInt((_33_ + 12))) + 16), _32_);
                    _32_ = sqlite3ExprDup((this._loadInt((_33_ + 24))), (this._loadInt(((this._loadInt((_33_ + 20))) + 20))), (this._loadInt((_33_ + 16))));
                    this._storeInt(((this._loadInt((_33_ + 12))) + 20), _32_);
                    _32_ = sqlite3ExprListDup((this._loadInt((_33_ + 24))), (this._loadInt(((this._loadInt((_33_ + 20))) + 24))), (this._loadInt((_33_ + 16))));
                    this._storeInt(((_31_ = this._loadInt((_33_ + 12))) + 24), _32_);
                    this._storeInt8((_31_ + 4), (this._loadInt8u(((this._loadInt((_33_ + 20))) + 4))));
                    _32_ = sqlite3SelectDup((this._loadInt((_33_ + 24))), (this._loadInt(((this._loadInt((_33_ + 20))) + 28))), (this._loadInt((_33_ + 16))));
                    this._storeInt(((this._loadInt((_33_ + 12))) + 28), _32_);
                    _32_ = sqlite3ExprDup((this._loadInt((_33_ + 24))), (this._loadInt(((this._loadInt((_33_ + 20))) + 40))), (this._loadInt((_33_ + 16))));
                    this._storeInt(((this._loadInt((_33_ + 12))) + 40), _32_);
                    _31_ = sqlite3ExprDup((this._loadInt((_33_ + 24))), (this._loadInt(((this._loadInt((_33_ + 20))) + 44))), (this._loadInt((_33_ + 16))));
                    this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 44), _31_);
                    _32_ = this._storeInt((_32_ + 52), (this._storeInt((_32_ + 48), 0)));
                    this._storeInt16(((this._loadInt((_33_ + 12))) + 6), ((this._loadInt16u(((this._loadInt((_33_ + 20))) + 6))) & 65527));
                    this._storeInt(((this._loadInt((_33_ + 12))) + 36), _32_);
                    _32_ = this._storeInt(((this._loadInt((_33_ + 12))) + 56), -1);
                    this._storeInt(((this._loadInt((_33_ + 12))) + 60), _32_);
                    this._storeInt(((this._loadInt((_33_ + 12))) + 64), _32_);
                    this._storeInt((_33_ + 28), (this._loadInt((_33_ + 12))));
                    break label$0;
                }
                while (false);
                this._storeInt((_33_ + 28), 0);
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
    public final void sqlite3SrcListAssignCursors(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 4), 0);
            this._storeInt(_32_, ((this._loadInt((_32_ + 8))) + 8));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 4))) >= (this._loadInt16s((this._loadInt((_32_ + 8)))))) {
                        break label$2;
                    }
                    if ((this._loadInt(((this._loadInt(_32_)) + 24))) > -1) {
                        break label$2;
                    }
                    this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 68), ((_31_ = this._loadInt((_31_ + 68))) + 1));
                    this._storeInt(((_30_ = this._loadInt(_32_)) + 24), _31_);
                    label$3:
                    do {
                        if ((this._loadInt((_30_ + 16))) == 0) {
                            break label$3;
                        }
                        sqlite3SrcListAssignCursors((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt(((this._loadInt(_32_)) + 16))) + 8))));
                    }
                    while (false);
                    this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                    this._storeInt(_32_, ((this._loadInt(_32_)) + 56));
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
    public final int sqlite3ResultSetOfSelect(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 12), (this._loadInt((this._loadInt((_32_ + 24))))));
        this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((_32_ + 12))) + 12))));
        this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 12), ((this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 12))) & -1025))) | 2048));
        sqlite3SelectPrep((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 20))), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_32_ + 24))) + 64))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$2:
                while (true) {
                    if ((this._loadInt(((this._loadInt((_32_ + 20))) + 28))) == 0) {
                        break label$3;
                    }
                    this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 20))) + 28))));
                    continue label$2;
                }
            }
            while (false);
            this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 12), (this._loadInt((_32_ + 8))));
            label$4:
            do {
                label$5:
                do {
                    if ((this._storeInt((_32_ + 16), (sqlite3DbMallocZero(_31_, 76)))) == 0) {
                        break label$5;
                    }
                    _30_ = this._storeInt((_31_ = this._loadInt((_32_ + 16))), 0);
                    this._storeInt16((_31_ + 32), 1);
                    this._storeInt((_31_ + 24), 1000000);
                    selectColumnsFromExprList((this._loadInt((_32_ + 24))), (this._loadInt((this._loadInt((_32_ + 20))))), (_31_ + 8), (_31_ + 12));
                    selectAddColumnTypeAndCollation((this._loadInt((_32_ + 24))), (this._loadInt(((_31_ = this._loadInt((_32_ + 16))) + 8))), (this._loadInt((_31_ + 12))), (this._loadInt((_32_ + 20))));
                    this._storeInt(((this._loadInt((_32_ + 16))) + 4), -1);
                    if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 30))) == 0) {
                        break label$4;
                    }
                    sqlite3DeleteTable((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 16))));
                    this._storeInt((_32_ + 28), _30_);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final void sqlite3SelectPrep(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        label$0:
        do {
            if ((this._loadInt((_33_ + 8))) == 0) {
                break label$0;
            }
            this._storeInt(_33_, (this._loadInt((this._loadInt((_33_ + 12))))));
            if (((this._loadInt16u(((this._loadInt((_33_ + 8))) + 6))) & 32) != 0) {
                break label$0;
            }
            sqlite3SelectExpand((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))));
            if ((this._loadInt(((this._loadInt((_33_ + 12))) + 64))) != 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt(_33_)) + 30))) != 0) {
                break label$0;
            }
            sqlite3ResolveSelectNames((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 4))));
            if ((this._loadInt(((this._loadInt((_33_ + 12))) + 64))) != 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt(_33_)) + 30))) != 0) {
                break label$0;
            }
            sqlite3SelectAddTypeInfo((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int selectColumnsFromExprList(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 128))) + 120), _30_);
        this._storeInt((_35_ + 116), _31_);
        this._storeInt((_35_ + 112), _32_);
        this._storeInt((_35_ + 108), _33_);
        this._storeInt((_35_ + 104), (this._loadInt((this._loadInt((_35_ + 120))))));
        _33_ = this._storeInt((_35_ + 80), (this._loadInt((this._loadInt((_35_ + 116))))));
        this._storeInt((this._loadInt((_35_ + 112))), _33_);
        _33_ = sqlite3DbMallocZero((this._loadInt((_35_ + 104))), (_33_ * 24));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_35_ + 88), (this._storeInt((this._loadInt((_35_ + 108))), _33_)))) == 0) {
                    break label$1;
                }
                _34_ = this._storeInt((_35_ + 100), 0);
                this._storeInt((_35_ + 84), (this._loadInt((_35_ + 88))));
                label$2:
                while (true) {
                    label$4:
                    do {
                        label$5:
                        do {
                            if ((this._loadInt((_35_ + 100))) >= (this._loadInt((_35_ + 80)))) {
                                break label$5;
                            }
                            this._storeInt((_35_ + 76), (this._loadInt(((this._loadInt(((this._loadInt((_35_ + 116))) + 12))) + ((this._loadInt((_35_ + 100))) * 20)))));
                            label$6:
                            do {
                                label$7:
                                do {
                                    if ((this._storeInt((_35_ + 72), (this._loadInt((((this._loadInt(((this._loadInt((_35_ + 116))) + 12))) + ((this._loadInt((_35_ + 100))) * 20)) + 4))))) == 0) {
                                        break label$7;
                                    }
                                    this._storeInt((_35_ + 72), (sqlite3DbStrDup((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 72))))));
                                    break label$6;
                                }
                                while (false);
                                this._storeInt((_35_ + 64), (this._loadInt((_35_ + 76))));
                                label$9:
                                do {
                                    label$8:
                                    while (true) {
                                        if ((this._loadInt8u((this._loadInt((_35_ + 64))))) != 118) {
                                            break label$9;
                                        }
                                        this._storeInt((_35_ + 64), (this._loadInt(((this._loadInt((_35_ + 64))) + 12))));
                                        continue label$8;
                                    }
                                }
                                while (false);
                                label$10:
                                do {
                                    if ((this._loadInt8u((this._loadInt((_35_ + 64))))) != 152) {
                                        break label$10;
                                    }
                                    if ((this._loadInt(((this._loadInt((_35_ + 64))) + 40))) == 0) {
                                        break label$10;
                                    }
                                    this._storeInt((_35_ + 56), (this._loadInt16s(((this._loadInt((_35_ + 64))) + 28))));
                                    this._storeInt((_35_ + 60), (this._loadInt(((this._loadInt((_35_ + 64))) + 40))));
                                    label$11:
                                    do {
                                        if ((this._loadInt((_35_ + 56))) > -1) {
                                            break label$11;
                                        }
                                        this._storeInt((_35_ + 56), (this._loadInt(((this._loadInt((_35_ + 60))) + 4))));
                                    }
                                    while (false);
                                    _33_ = 39888;
                                    _32_ = this._loadInt((_35_ + 104));
                                    label$12:
                                    do {
                                        if ((this._loadInt((_35_ + 56))) < _34_) {
                                            break label$12;
                                        }
                                        _33_ = this._loadInt(((this._loadInt(((this._loadInt((_35_ + 60))) + 12))) + ((this._loadInt((_35_ + 56))) * 24)));
                                    }
                                    while (false);
                                    this._storeInt((_35_ + 16), _33_);
                                    this._storeInt((_35_ + 72), (sqlite3MPrintf(_32_, 22192, (_35_ + 16))));
                                    break label$6;
                                }
                                while (false);
                                label$13:
                                do {
                                    if ((this._loadInt8u((this._loadInt((_35_ + 64))))) != 26) {
                                        break label$13;
                                    }
                                    _33_ = this._loadInt((_35_ + 104));
                                    this._storeInt((_35_ + 32), (this._loadInt(((this._loadInt((_35_ + 64))) + 4))));
                                    this._storeInt((_35_ + 72), (sqlite3MPrintf(_33_, 22192, (_35_ + 32))));
                                    break label$6;
                                }
                                while (false);
                                _33_ = this._loadInt((_35_ + 104));
                                this._storeInt((_35_ + 48), (this._loadInt((((this._loadInt(((this._loadInt((_35_ + 116))) + 12))) + ((this._loadInt((_35_ + 100))) * 20)) + 8))));
                                this._storeInt((_35_ + 72), (sqlite3MPrintf(_33_, 22192, (_35_ + 48))));
                            }
                            while (false);
                            label$14:
                            do {
                                if ((this._loadInt8u(((this._loadInt((_35_ + 104))) + 30))) != 0) {
                                    break label$14;
                                }
                                this._storeInt((_35_ + 68), (sqlite3Strlen30((this._loadInt((_35_ + 72))))));
                                _30_ = this._storeInt((_35_ + 96), (this._storeInt((_35_ + 92), _34_)));
                                label$15:
                                while (true) {
                                    if ((this._loadInt((_35_ + 96))) >= (this._loadInt((_35_ + 100)))) {
                                        break label$4;
                                    }
                                    label$17:
                                    do {
                                        if ((sqlite3StrICmp((this._loadInt(((this._loadInt((_35_ + 88))) + ((this._loadInt((_35_ + 96))) * 24)))), (this._loadInt((_35_ + 72))))) != 0) {
                                            break label$17;
                                        }
                                        this._storeInt8(((_33_ = this._loadInt((_35_ + 72))) + (this._loadInt((_35_ + 68)))), _30_);
                                        _32_ = this._loadInt((_35_ + 104));
                                        _31_ = this._storeInt((_35_ + 92), ((this._loadInt((_35_ + 92))) + 1));
                                        this._storeInt(_35_, _33_);
                                        this._storeInt((_35_ + 4), _31_);
                                        this._storeInt((_35_ + 52), (sqlite3MPrintf(_32_, 39904, _35_)));
                                        sqlite3DbFree((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 72))));
                                        this._storeInt((_35_ + 72), (this._loadInt((_35_ + 52))));
                                        this._storeInt((_35_ + 96), -1);
                                        if ((this._loadInt((_35_ + 72))) == 0) {
                                            break label$4;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_35_ + 96), ((this._loadInt((_35_ + 96))) + 1));
                                    continue label$15;
                                }
                            }
                            while (false);
                            sqlite3DbFree((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 72))));
                        }
                        while (false);
                        label$18:
                        do {
                            if ((this._loadInt8u(((this._loadInt((_35_ + 104))) + 30))) == 0) {
                                break label$18;
                            }
                            this._storeInt((_35_ + 96), 0);
                            label$20:
                            do {
                                label$19:
                                while (true) {
                                    if ((this._loadInt((_35_ + 96))) >= (this._loadInt((_35_ + 100)))) {
                                        break label$20;
                                    }
                                    sqlite3DbFree((this._loadInt((_35_ + 104))), (this._loadInt(((this._loadInt((_35_ + 88))) + ((this._loadInt((_35_ + 96))) * 24)))));
                                    this._storeInt((_35_ + 96), ((this._loadInt((_35_ + 96))) + 1));
                                    continue label$19;
                                }
                            }
                            while (false);
                            sqlite3DbFree((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 88))));
                            _33_ = this._storeInt((this._loadInt((_35_ + 108))), 0);
                            this._storeInt((this._loadInt((_35_ + 112))), _33_);
                            this._storeInt((_35_ + 124), 7);
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_35_ + 124), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((this._loadInt((_35_ + 84))), (this._loadInt((_35_ + 72))));
                    this._storeInt((_35_ + 100), ((this._loadInt((_35_ + 100))) + 1));
                    this._storeInt((_35_ + 84), ((this._loadInt((_35_ + 84))) + 24));
                    continue label$2;
                }
            }
            while (false);
            this._storeInt((_35_ + 124), 7);
        }
        while (false);
        _33_ = this._loadInt((_35_ + 124));
        this._storeInt((0 + 4), (_35_ + 128));
        return _33_;
    }

    @Override()
    public final void selectAddColumnTypeAndCollation(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 76), _30_);
        this._storeInt((_34_ + 72), _31_);
        this._storeInt((_34_ + 68), _32_);
        this._storeInt((_34_ + 64), _33_);
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt((_34_ + 60), (this._loadInt((this._loadInt((_34_ + 76))))))) + 30))) != 0) {
                break label$0;
            }
            memset((_34_ + 24), 0, 36);
            this._storeInt((_34_ + 28), (this._loadInt(((_33_ = this._loadInt((_34_ + 64))) + 8))));
            this._storeInt((_34_ + 4), (this._loadInt(((this._loadInt(_33_)) + 12))));
            _33_ = this._storeInt((_34_ + 12), 0);
            this._storeInt((_34_ + 20), (this._loadInt((_34_ + 68))));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_34_ + 12))) >= (this._loadInt((_34_ + 72)))) {
                        break label$2;
                    }
                    _32_ = this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((_34_ + 4))) + ((this._loadInt((_34_ + 12))) * 20)))));
                    _32_ = sqlite3DbStrDup((this._loadInt((_34_ + 60))), (columnType((_34_ + 24), _32_, _33_, _33_, _33_)));
                    this._storeInt(((this._loadInt((_34_ + 20))) + 12), _32_);
                    _32_ = sqlite3ExprAffinity((this._loadInt((_34_ + 8))));
                    this._storeInt8(((_31_ = this._loadInt((_34_ + 20))) + 22), _32_);
                    label$3:
                    do {
                        if ((this._loadInt8s((_31_ + 22))) != 0) {
                            break label$3;
                        }
                        this._storeInt8(((this._loadInt((_34_ + 20))) + 22), 98);
                    }
                    while (false);
                    label$4:
                    do {
                        if ((this._storeInt((_34_ + 16), (sqlite3ExprCollSeq((this._loadInt((_34_ + 76))), (this._loadInt((_34_ + 8))))))) == 0) {
                            break label$4;
                        }
                        _32_ = sqlite3DbStrDup((this._loadInt((_34_ + 60))), (this._loadInt((this._loadInt((_34_ + 16))))));
                        this._storeInt(((this._loadInt((_34_ + 20))) + 16), _32_);
                    }
                    while (false);
                    this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 12))) + 1));
                    this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) + 24));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 80));
        return;
    }

    @Override()
    public final int columnType(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 160))) + 152), _30_);
        this._storeInt((_35_ + 148), _31_);
        this._storeInt((_35_ + 144), _32_);
        this._storeInt((_35_ + 140), _33_);
        this._storeInt((_35_ + 136), _34_);
        _34_ = this._storeInt((_35_ + 120), (this._storeInt((_35_ + 124), (this._storeInt((_35_ + 128), (this._storeInt((_35_ + 132), 0)))))));
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
                                if ((this._loadInt((_35_ + 148))) == 0) {
                                    break label$5;
                                }
                                if ((this._loadInt(((this._loadInt((_35_ + 152))) + 4))) == 0) {
                                    break label$5;
                                }
                                if ((_34_ = this._loadInt8u((this._loadInt((_35_ + 148))))) == 116) {
                                    break label$3;
                                }
                                label$6:
                                do {
                                    if (_34_ == 154) {
                                        break label$6;
                                    }
                                    if (_34_ != 152) {
                                        break label$1;
                                    }
                                }
                                while (false);
                                _33_ = this._storeInt((_35_ + 108), (this._storeInt((_35_ + 112), 0)));
                                this._storeInt((_35_ + 104), (this._loadInt16s(((this._loadInt((_35_ + 148))) + 28))));
                                label$7:
                                while (true) {
                                    _34_ = 0;
                                    label$9:
                                    do {
                                        if ((this._loadInt((_35_ + 152))) == 0) {
                                            break label$9;
                                        }
                                        _34_ = ((this._loadInt((_35_ + 112))) == 0) ? 1 : 0;
                                    }
                                    while (false);
                                    if (_34_ == 0) {
                                        break label$4;
                                    }
                                    this._storeInt((_35_ + 100), (this._loadInt(((this._loadInt((_35_ + 152))) + 4))));
                                    this._storeInt((_35_ + 116), _33_);
                                    label$11:
                                    do {
                                        label$10:
                                        while (true) {
                                            _34_ = 0;
                                            label$12:
                                            do {
                                                if ((this._loadInt((_35_ + 116))) >= (this._loadInt16s((this._loadInt((_35_ + 100)))))) {
                                                    break label$12;
                                                }
                                                _34_ = ((this._loadInt((((this._loadInt((_35_ + 100))) + ((this._loadInt((_35_ + 116))) * 56)) + 32))) != (this._loadInt(((this._loadInt((_35_ + 148))) + 24)))) ? 1 : 0;
                                            }
                                            while (false);
                                            if (_34_ == 0) {
                                                break label$11;
                                            }
                                            this._storeInt((_35_ + 116), ((this._loadInt((_35_ + 116))) + 1));
                                            continue label$10;
                                        }
                                    }
                                    while (false);
                                    label$13:
                                    do {
                                        if ((this._loadInt((_35_ + 116))) < (this._loadInt16s((this._loadInt((_35_ + 100)))))) {
                                            break label$13;
                                        }
                                        this._storeInt((_35_ + 152), (this._loadInt(((this._loadInt((_35_ + 152))) + 32))));
                                        continue label$7;
                                    }
                                    while (false);
                                    this._storeInt((_35_ + 112), (this._loadInt((((this._loadInt((_35_ + 100))) + ((this._loadInt((_35_ + 116))) * 56)) + 20))));
                                    this._storeInt((_35_ + 108), (this._loadInt((((this._loadInt((_35_ + 100))) + ((this._loadInt((_35_ + 116))) * 56)) + 24))));
                                    continue label$7;
                                }
                            }
                            while (false);
                            this._storeInt((_35_ + 156), _34_);
                            break label$0;
                        }
                        while (false);
                        if ((this._loadInt((_35_ + 112))) == 0) {
                            break label$1;
                        }
                        if ((this._loadInt((_35_ + 108))) == 0) {
                            break label$2;
                        }
                        if ((this._loadInt((_35_ + 104))) < 0) {
                            break label$1;
                        }
                        if ((this._loadInt((_35_ + 104))) >= (this._loadInt((this._loadInt((this._loadInt((_35_ + 108)))))))) {
                            break label$1;
                        }
                        this._storeInt((_35_ + 60), (this._loadInt(((this._loadInt(((this._loadInt((this._loadInt((_35_ + 108))))) + 12))) + ((this._loadInt((_35_ + 104))) * 20)))));
                        this._storeInt((_35_ + 68), (this._loadInt(((this._loadInt((_35_ + 108))) + 8))));
                        this._storeInt((_35_ + 64), (this._loadInt((this._storeInt((_35_ + 96), (this._loadInt((_35_ + 152))))))));
                        this._storeInt((_35_ + 132), (columnType((_35_ + 64), (this._loadInt((_35_ + 60))), (_35_ + 128), (_35_ + 124), (_35_ + 120))));
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_35_ + 8), (this._loadInt((this._loadInt(((this._loadInt((this._storeInt((_35_ + 12), (this._loadInt(((this._loadInt((_35_ + 148))) + 16))))))) + 12))))));
                    this._storeInt((_35_ + 20), (this._loadInt(((this._loadInt((_35_ + 12))) + 8))));
                    this._storeInt((_35_ + 16), (this._loadInt((this._storeInt((_35_ + 48), (this._loadInt((_35_ + 152))))))));
                    this._storeInt((_35_ + 132), (columnType((_35_ + 16), (this._loadInt((_35_ + 8))), (_35_ + 128), (_35_ + 124), (_35_ + 120))));
                    break label$1;
                }
                while (false);
                if ((this._loadInt(((this._loadInt((_35_ + 112))) + 68))) == 0) {
                    break label$1;
                }
                label$14:
                do {
                    if ((this._loadInt((_35_ + 104))) > -1) {
                        break label$14;
                    }
                    this._storeInt((_35_ + 104), (this._loadInt(((this._loadInt((_35_ + 112))) + 4))));
                }
                while (false);
                label$15:
                do {
                    label$16:
                    do {
                        if ((this._loadInt((_35_ + 104))) <= -1) {
                            break label$16;
                        }
                        this._storeInt((_35_ + 132), (this._loadInt((((this._loadInt(((this._loadInt((_35_ + 112))) + 12))) + ((this._loadInt((_35_ + 104))) * 24)) + 12))));
                        this._storeInt((_35_ + 120), (this._loadInt(((this._loadInt(((this._loadInt((_35_ + 112))) + 12))) + ((this._loadInt((_35_ + 104))) * 24)))));
                        break label$15;
                    }
                    while (false);
                    this._storeInt((_35_ + 132), 39872);
                    this._storeInt((_35_ + 120), 39888);
                }
                while (false);
                this._storeInt((_35_ + 124), (this._loadInt((this._loadInt((_35_ + 112))))));
                if ((this._loadInt((this._loadInt((_35_ + 152))))) == 0) {
                    break label$1;
                }
                _34_ = this._storeInt((_35_ + 56), (sqlite3SchemaToIndex((this._loadInt((this._loadInt((this._loadInt((_35_ + 152))))))), (this._loadInt(((this._loadInt((_35_ + 112))) + 68))))));
                this._storeInt((_35_ + 128), (this._loadInt(((this._loadInt(((this._loadInt((this._loadInt((this._loadInt((_35_ + 152))))))) + 8))) + (_34_ << 4)))));
            }
            while (false);
            label$17:
            do {
                if ((this._loadInt((_35_ + 144))) == 0) {
                    break label$17;
                }
                this._storeInt((this._loadInt((_35_ + 144))), (this._loadInt((_35_ + 128))));
                this._storeInt((this._loadInt((_35_ + 140))), (this._loadInt((_35_ + 124))));
                this._storeInt((this._loadInt((_35_ + 136))), (this._loadInt((_35_ + 120))));
            }
            while (false);
            this._storeInt((_35_ + 156), (this._loadInt((_35_ + 132))));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 156));
        this._storeInt((0 + 4), (_35_ + 160));
        return _34_;
    }

    @Override()
    public final int sqlite3ExprAffinity(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 4), (this._loadInt8u((this._storeInt((_31_ + 8), _30_)))))) != 116) {
                    break label$1;
                }
                this._storeInt8((_31_ + 15), (sqlite3ExprAffinity((this._loadInt((this._loadInt(((this._loadInt((this._loadInt(((this._loadInt((_31_ + 8))) + 16))))) + 12))))))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt((_31_ + 4))) != 37) {
                    break label$2;
                }
                this._storeInt8((_31_ + 15), (sqlite3AffinityType((this._loadInt(((this._loadInt((_31_ + 8))) + 4))))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    label$5:
                    do {
                        if ((this._loadInt((_31_ + 4))) == 154) {
                            break label$5;
                        }
                        if ((this._loadInt((_31_ + 4))) == 152) {
                            break label$5;
                        }
                        if ((this._loadInt((_31_ + 4))) != 132) {
                            break label$4;
                        }
                    }
                    while (false);
                    if ((this._loadInt(((this._loadInt((_31_ + 8))) + 40))) == 0) {
                        break label$4;
                    }
                    if ((this._storeInt(_31_, (this._loadInt16s(((this._loadInt((_31_ + 8))) + 28))))) <= -1) {
                        break label$3;
                    }
                    this._storeInt8((_31_ + 15), (this._loadInt8u((((this._loadInt(((this._loadInt(((this._loadInt((_31_ + 8))) + 40))) + 12))) + ((this._loadInt(_31_)) * 24)) + 22))));
                    break label$0;
                }
                while (false);
                this._storeInt8((_31_ + 15), (this._loadInt8u(((this._loadInt((_31_ + 8))) + 1))));
                break label$0;
            }
            while (false);
            this._storeInt8((_31_ + 15), 100);
        }
        while (false);
        _30_ = this._loadInt8s((_31_ + 15));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }
}
