package com.wrmsr.wava;

abstract class sqlite3$9
        extends sqlite3$8
{
    protected sqlite3$9(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final int nolockIoFinderImpl(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        return 22124;
    }

    @Override()
    public final int nolockClose(int _30_)
    {
        int _31_ = 0;
        _30_ = closeUnixFile((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int nolockLock(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        return 0;
    }

    @Override()
    public final int nolockUnlock(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        return 0;
    }

    @Override()
    public final int nolockCheckReservedLock(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        _33_ = this._loadInt((0 + 4));
        _32_ = this._storeInt(_31_, 0);
        this._storeInt(((_33_ = _33_ - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        return _32_;
    }

    @Override()
    public final int openDirectory(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 592))) + 588), _30_);
        this._storeInt((_32_ + 584), _31_);
        _30_ = this._storeInt((_32_ + 576), -1);
        this._storeInt((_32_ + 32), (this._loadInt((_32_ + 588))));
        sqlite3_snprintf(512, (_32_ + 48), 22192, (_32_ + 32));
        this._storeInt((_32_ + 580), (strlen((_32_ + 48))));
        label$1:
        do {
            label$0:
            while (true) {
                _31_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_32_ + 580))) < 2) {
                        break label$2;
                    }
                    _31_ = ((this._loadInt8s(((_32_ + 48) + (this._loadInt((_32_ + 580)))))) != 47) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 580), ((this._loadInt((_32_ + 580))) + _30_));
                continue label$0;
            }
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt((_32_ + 580))) < 1) {
                break label$3;
            }
            if ((this._storeInt((_32_ + 576), (robust_open((_32_ + 48), (_31_ = this._storeInt8(((_32_ + 48) + (this._loadInt((_32_ + 580)))), 0)), _31_)))) < _31_) {
                break label$3;
            }
            _30_ = this._loadInt((_32_ + 576));
            this._storeInt(_32_, ((this._iiiiTable[this._tableIndices[_31_ = this._loadInt(((this._storeInt((_32_ + 16), _31_)) + 21272))]].invoke(_30_, 1, (_32_ + 16))) | 1));
            this._iiiiTable[this._tableIndices[_31_]].invoke(_30_, 2, _32_);
        }
        while (false);
        _31_ = 0;
        label$4:
        do {
            if ((this._storeInt((this._loadInt((_32_ + 584))), (this._loadInt((_32_ + 576))))) > -1) {
                break label$4;
            }
            _31_ = unixLogErrorAtLine((sqlite3CantopenError(29133)), 21440, (_32_ + 48), 29133);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 592));
        return _31_;
    }

    @Override()
    public final int findReusableFd(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 128))) + 124), _30_);
        this._storeInt((_32_ + 120), _31_);
        _31_ = this._storeInt((_32_ + 116), 0);
        label$0:
        do {
            if ((this.stat.invoke((this._loadInt((_32_ + 124))), (_32_ + 8))) != 0) {
                break label$0;
            }
            unixEnterMutex();
            this._storeInt((_32_ + 4), (this._loadInt((_31_ + 22328))));
            label$2:
            do {
                label$1:
                while (true) {
                    _31_ = 0;
                    label$3:
                    do {
                        if ((this._loadInt((_32_ + 4))) == 0) {
                            break label$3;
                        }
                        _31_ = 1;
                        if ((this._loadLong((this._loadInt((_32_ + 4))))) != (this._loadLong((_32_ + 8)))) {
                            break label$3;
                        }
                        _31_ = ((this._loadLong(((this._loadInt((_32_ + 4))) + 8))) != (this._loadLong((_32_ + 104)))) ? 1 : 0;
                    }
                    while (false);
                    if (_31_ == 0) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 4))) + 40))));
                    continue label$1;
                }
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt((_32_ + 4))) == 0) {
                    break label$4;
                }
                this._storeInt(_32_, ((this._loadInt((_32_ + 4))) + 36));
                label$6:
                do {
                    label$5:
                    while (true) {
                        _31_ = 0;
                        label$7:
                        do {
                            if ((this._loadInt((this._loadInt(_32_)))) == 0) {
                                break label$7;
                            }
                            _31_ = ((this._loadInt(((this._loadInt((this._loadInt(_32_)))) + 4))) != (this._loadInt((_32_ + 120)))) ? 1 : 0;
                        }
                        while (false);
                        if (_31_ == 0) {
                            break label$6;
                        }
                        this._storeInt(_32_, ((this._loadInt((this._loadInt(_32_)))) + 8));
                        continue label$5;
                    }
                }
                while (false);
                if ((this._storeInt((_32_ + 116), (this._loadInt((this._loadInt(_32_)))))) == 0) {
                    break label$4;
                }
                this._storeInt((this._loadInt(_32_)), (this._loadInt(((this._loadInt((_32_ + 116))) + 8))));
            }
            while (false);
            unixLeaveMutex();
        }
        while (false);
        _31_ = this._loadInt((_32_ + 116));
        this._storeInt((0 + 4), (_32_ + 128));
        return _31_;
    }

    @Override()
    public final int unixGetTempname(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), (unixTempFileDir()))) != 0) {
                break label$0;
            }
            this._storeInt((_32_ + 8), 22336);
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                if (((((strlen((this._loadInt((_32_ + 8))))) + (strlen(22352))) + 17) & 4294967295L) < ((this._loadInt((_32_ + 24))) & 4294967295L)) {
                    break label$2;
                }
                this._storeInt((_32_ + 28), 1);
                break label$1;
            }
            while (false);
            label$3$end:
            do {
                label$3:
                while (true) {
                    _31_ = this._loadInt((_32_ + 20));
                    _30_ = this._loadInt((_32_ + 24));
                    this._storeInt(_32_, (this._loadInt((_32_ + 8))));
                    sqlite3_snprintf((_30_ + -17), _31_, 22368, _32_);
                    sqlite3_randomness(15, ((this._storeInt((_32_ + 12), (strlen((this._loadInt((_32_ + 20))))))) + (this._loadInt((_32_ + 20)))));
                    _30_ = this._storeInt((_32_ + 16), 0);
                    label$6:
                    do {
                        label$5:
                        while (true) {
                            if (((this._loadInt((_32_ + 16))) & 4294967295L) > (14 & 4294967295L)) {
                                break label$6;
                            }
                            this._storeInt8((_31_ = (this._loadInt((_32_ + 20))) + (this._loadInt((_32_ + 12)))), (this._loadInt8u((((this._loadInt8u(_31_)) % 62) + 22384))));
                            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                            this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 1));
                            continue label$5;
                        }
                    }
                    while (false);
                    if ((this._iiiTable[this._tableIndices[this._loadInt(((_31_ = this._storeInt8(((this._loadInt((_32_ + 20))) + (this._loadInt((_32_ + 12)))), _30_)) + 21212))]].invoke((this._loadInt((_32_ + 20))), _31_)) == 0) {
                        continue label$3;
                    }
                    break label$3$end;
                }
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
    public final int findCreateFileMode(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 656))) + 648), _30_);
        this._storeInt((_33_ + 644), _31_);
        this._storeInt((_33_ + 640), _32_);
        this._storeInt((_33_ + 636), 0);
        this._storeInt((this._loadInt((_33_ + 640))), 420);
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
                            if (((this._loadInt((_33_ + 644))) & 526336) == 0) {
                                break label$4;
                            }
                            this._storeInt((_33_ + 108), ((sqlite3Strlen30((this._loadInt((_33_ + 648))))) + -1));
                            label$6:
                            do {
                                label$5:
                                while (true) {
                                    _32_ = 0;
                                    label$7:
                                    do {
                                        if ((this._loadInt((_33_ + 108))) < 1) {
                                            break label$7;
                                        }
                                        _32_ = ((this._loadInt8s(((this._loadInt((_33_ + 648))) + (this._loadInt((_33_ + 108)))))) != 45) ? 1 : 0;
                                    }
                                    while (false);
                                    if (_32_ == 0) {
                                        break label$6;
                                    }
                                    this._storeInt((_33_ + 108), ((this._loadInt((_33_ + 108))) + -1));
                                    continue label$5;
                                }
                            }
                            while (false);
                            if ((this._loadInt((_33_ + 108))) == 0) {
                                break label$3;
                            }
                            memcpy((_33_ + 112), (this._loadInt((_33_ + 648))), (this._loadInt((_33_ + 108))));
                            this._storeInt8(((_33_ + 112) + (this._loadInt((_33_ + 108)))), 0);
                            if ((this.stat.invoke((_33_ + 112), _33_)) != 0) {
                                break label$2;
                            }
                            this._storeInt((this._loadInt((_33_ + 640))), ((this._loadInt((_33_ + 16))) & 511));
                            break label$1;
                        }
                        while (false);
                        if (((this._loadInt8u((_33_ + 644))) & 8) == 0) {
                            break label$1;
                        }
                        this._storeInt((this._loadInt((_33_ + 640))), 384);
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_33_ + 652), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_33_ + 636), 1802);
            }
            while (false);
            this._storeInt((_33_ + 652), (this._loadInt((_33_ + 636))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 652));
        this._storeInt((0 + 4), (_33_ + 656));
        return _32_;
    }

    @Override()
    public final int fillInUnixFile(
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
        this._storeInt(((_38_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_38_ + 56), _31_);
        this._storeInt((_38_ + 52), _32_);
        this._storeInt((_38_ + 48), _33_);
        this._storeInt((_38_ + 44), _34_);
        this._storeInt((_38_ + 40), _35_);
        this._storeInt((_38_ + 36), _36_);
        this._storeInt((_38_ + 32), _37_);
        this._storeInt((_38_ + 24), (this._loadInt((_38_ + 48))));
        _36_ = this._storeInt((_38_ + 20), 0);
        this._storeInt(((_37_ = this._loadInt((_38_ + 24))) + 8), (this._loadInt((_38_ + 56))));
        this._storeInt((_37_ + 12), (this._loadInt((_38_ + 52))));
        this._storeInt(((this._loadInt((_38_ + 24))) + 32), (this._loadInt((_38_ + 44))));
        label$0:
        do {
            label$1:
            do {
                if ((memcmp((this._loadInt(((this._loadInt((_38_ + 60))) + 16))), 21104, 10)) == 0) {
                    break label$1;
                }
                this._storeInt8(((this._loadInt((_38_ + 24))) + 17), _36_);
                break label$0;
            }
            while (false);
            this._storeInt8(((this._loadInt((_38_ + 24))) + 17), 1);
        }
        while (false);
        label$2:
        do {
            if ((this._loadInt((_38_ + 32))) == 0) {
                break label$2;
            }
            this._storeInt8(((_37_ = this._loadInt((_38_ + 24))) + 17), ((this._loadInt8u((_37_ + 17))) | 2));
        }
        while (false);
        label$3:
        do {
            label$4:
            do {
                if ((this._loadInt((_38_ + 40))) == 0) {
                    break label$4;
                }
                this._storeInt((_38_ + 28), 22124);
                break label$3;
            }
            while (false);
            this._storeInt((_38_ + 28), (this._iiiTable[this._tableIndices[this._loadInt((this._loadInt(((this._loadInt((_38_ + 60))) + 20))))]].invoke((this._loadInt((_38_ + 44))), (this._loadInt((_38_ + 24))))));
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
                        if ((this._loadInt((_38_ + 28))) == 22248) {
                            break label$8;
                        }
                        if ((this._loadInt((_38_ + 28))) != 21116) {
                            break label$5;
                        }
                        if ((this._storeInt((_38_ + 16), (sqlite3_malloc((this._storeInt((_38_ + 12), ((strlen((this._loadInt((_38_ + 44))))) + 6))))))) == 0) {
                            break label$7;
                        }
                        _37_ = this._loadInt((_38_ + 16));
                        _36_ = this._loadInt((_38_ + 12));
                        this._storeInt(_38_, (this._loadInt((_38_ + 44))));
                        sqlite3_snprintf(_36_, _37_, 22320, _38_);
                        break label$6;
                    }
                    while (false);
                    unixEnterMutex();
                    label$9:
                    do {
                        if ((this._storeInt((_38_ + 20), (findInodeInfo((_37_ = this._loadInt((_38_ + 24))), (_37_ + 4))))) == 0) {
                            break label$9;
                        }
                        robust_close((this._loadInt((_38_ + 24))), (this._loadInt((_38_ + 56))), 29011);
                        this._storeInt((_38_ + 56), -1);
                    }
                    while (false);
                    unixLeaveMutex();
                    break label$5;
                }
                while (false);
                this._storeInt((_38_ + 20), 7);
            }
            while (false);
            this._storeInt(((this._loadInt((_38_ + 24))) + 24), (this._loadInt((_38_ + 16))));
        }
        while (false);
        _37_ = this._storeInt(((this._loadInt((_38_ + 24))) + 20), 0);
        label$10:
        do {
            label$11:
            do {
                if ((this._loadInt((_38_ + 20))) == 0) {
                    break label$11;
                }
                label$12:
                do {
                    if ((this._loadInt((_38_ + 52))) < _37_) {
                        break label$12;
                    }
                    robust_close((this._loadInt((_38_ + 24))), (this._loadInt((_38_ + 52))), 29096);
                }
                while (false);
                if ((this._loadInt((_38_ + 56))) < 0) {
                    break label$10;
                }
                robust_close((this._loadInt((_38_ + 24))), (this._loadInt((_38_ + 56))), 29097);
                break label$10;
            }
            while (false);
            this._storeInt((this._loadInt((_38_ + 24))), (this._loadInt((_38_ + 28))));
        }
        while (false);
        _37_ = this._loadInt((_38_ + 20));
        this._storeInt((0 + 4), (_38_ + 64));
        return _37_;
    }

    @Override()
    public final int findInodeInfo(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 160))) + 152), _30_);
        this._storeInt((_32_ + 148), _31_);
        _30_ = this._storeInt((_32_ + 12), 0);
        _31_ = this._storeInt((_32_ + 140), (this._loadInt(((this._loadInt((_32_ + 152))) + 8))));
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
                                if ((this._storeInt((_32_ + 144), (this._iiiTable[this._tableIndices[this._loadInt((_30_ + 21248))]].invoke(_31_, (_32_ + 16))))) == 0) {
                                    break label$5;
                                }
                                _31_ = __errno_location();
                                this._storeInt(((_30_ = this._loadInt((_32_ + 152))) + 20), (this._loadInt(_31_)));
                                if ((this._loadInt((_30_ + 20))) != 75) {
                                    break label$4;
                                }
                                this._storeInt((_32_ + 156), 22);
                                break label$0;
                            }
                            while (false);
                            memset((_32_ + 120), _30_, 16);
                            this._storeLong((_32_ + 120), (this._loadLong((_32_ + 16))));
                            this._storeLong((_32_ + 128), (this._loadLong((_32_ + 112))));
                            this._storeInt((_32_ + 12), (this._loadInt((_30_ + 22328))));
                            label$7:
                            do {
                                label$6:
                                while (true) {
                                    _31_ = 0;
                                    label$8:
                                    do {
                                        if ((this._loadInt((_32_ + 12))) == 0) {
                                            break label$8;
                                        }
                                        _31_ = ((memcmp((_32_ + 120), (this._loadInt((_32_ + 12))), 16)) != _30_) ? 1 : 0;
                                    }
                                    while (false);
                                    if (_31_ == 0) {
                                        break label$7;
                                    }
                                    this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 12))) + 40))));
                                    continue label$6;
                                }
                            }
                            while (false);
                            if ((this._loadInt((_32_ + 12))) == 0) {
                                break label$3;
                            }
                            this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 24), ((this._loadInt((_31_ + 24))) + 1));
                            break label$2;
                        }
                        while (false);
                        this._storeInt((_32_ + 156), 10);
                        break label$0;
                    }
                    while (false);
                    if ((this._storeInt((_32_ + 12), (sqlite3_malloc(48)))) == 0) {
                        break label$1;
                    }
                    memset((this._loadInt((_32_ + 12))), 0, 48);
                    memcpy((this._loadInt((_32_ + 12))), (_32_ + 120), 16);
                    this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 24), 1);
                    this._storeInt((_31_ + 40), (this._loadInt((0 + 22328))));
                    label$9:
                    do {
                        if ((this._loadInt(((_31_ = this._storeInt(((this._loadInt((_32_ + 12))) + 44), 0)) + 22328))) == 0) {
                            break label$9;
                        }
                        this._storeInt(((this._loadInt((_31_ + 22328))) + 44), (this._loadInt((_32_ + 12))));
                    }
                    while (false);
                    this._storeInt((_31_ + 22328), (this._loadInt((_32_ + 12))));
                }
                while (false);
                this._storeInt((this._loadInt((_32_ + 148))), (this._loadInt((_32_ + 12))));
                this._storeInt((_32_ + 156), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 156), 7);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 156));
        this._storeInt((0 + 4), (_32_ + 160));
        return _31_;
    }

    @Override()
    public final int unixClose(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        _30_ = this._storeInt((_31_ + 8), 0);
        this._storeInt((_31_ + 4), (this._loadInt((_31_ + 12))));
        unixUnlock((this._loadInt((_31_ + 12))), _30_);
        unixEnterMutex();
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_31_ + 4))) + 4))) == 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt(((this._loadInt((_31_ + 4))) + 4))) + 32))) == 0) {
                break label$0;
            }
            setPendingFd((this._loadInt((_31_ + 4))));
        }
        while (false);
        releaseInodeInfo((this._loadInt((_31_ + 4))));
        this._storeInt((_31_ + 8), (closeUnixFile((this._loadInt((_31_ + 12))))));
        unixLeaveMutex();
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int unixLock(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_32_ + 52), _31_);
        _31_ = this._storeInt((_32_ + 48), 0);
        this._storeInt((_32_ + 40), (this._loadInt(((this._storeInt((_32_ + 44), (this._loadInt((_32_ + 56))))) + 4))));
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 44))) + 16))) < (this._loadInt((_32_ + 52)))) {
                    break label$1;
                }
                this._storeInt((_32_ + 60), _31_);
                break label$0;
            }
            while (false);
            unixEnterMutex();
            _31_ = this._storeInt((_32_ + 40), (this._loadInt(((this._loadInt((_32_ + 44))) + 4))));
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt8u(((this._loadInt((_32_ + 44))) + 16))) == (this._loadInt8u((_31_ + 20)))) {
                        break label$3;
                    }
                    label$4:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_32_ + 40))) + 20))) > 2) {
                            break label$4;
                        }
                        if ((this._loadInt((_32_ + 52))) < 2) {
                            break label$3;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 48), 5);
                    break label$2;
                }
                while (false);
                label$5:
                do {
                    if ((this._loadInt((_32_ + 52))) != 1) {
                        break label$5;
                    }
                    label$6:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_32_ + 40))) + 20))) == 1) {
                            break label$6;
                        }
                        if ((this._loadInt8u(((this._loadInt((_32_ + 40))) + 20))) != 2) {
                            break label$5;
                        }
                    }
                    while (false);
                    _31_ = this._storeInt8(((this._loadInt((_32_ + 44))) + 16), 1);
                    this._storeInt(((_30_ = this._loadInt((_32_ + 40))) + 16), (_31_ + (this._loadInt((_30_ + 16)))));
                    this._storeInt(((_30_ = this._loadInt((_32_ + 40))) + 32), (_31_ + (this._loadInt((_30_ + 32)))));
                    break label$2;
                }
                while (false);
                _31_ = this._storeInt16((_32_ + 10), 0);
                this._storeLong((_32_ + 24), 1L);
                label$7:
                do {
                    label$8:
                    do {
                        if ((this._loadInt((_32_ + 52))) == 1) {
                            break label$8;
                        }
                        if ((this._loadInt((_32_ + 52))) != 4) {
                            break label$7;
                        }
                        if ((this._loadInt8u(((this._loadInt((_32_ + 44))) + 16))) > 2) {
                            break label$7;
                        }
                    }
                    while (false);
                    this._storeInt16((_32_ + 8), (((this._loadInt((_32_ + 52))) != 1) ? 1 : 0));
                    this._storeLong((_32_ + 16), (this._loadLong32s((_31_ + 22332))));
                    if ((unixFileLock((this._loadInt((_32_ + 44))), (_32_ + 8))) == 0) {
                        break label$7;
                    }
                    if ((this._storeInt((_32_ + 48), (sqliteErrorFromPosixError((this._storeInt((_32_ + 4), (this._loadInt((__errno_location()))))), 3850)))) == 5) {
                        break label$2;
                    }
                    this._storeInt(((this._loadInt((_32_ + 44))) + 20), (this._loadInt((_32_ + 4))));
                    break label$2;
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
                                    if ((this._loadInt((_32_ + 52))) != 1) {
                                        break label$13;
                                    }
                                    this._storeLong((_32_ + 24), 510L);
                                    this._storeLong((_32_ + 16), ((long) ((this._loadInt((0 + 22332))) + 2)));
                                    label$14:
                                    do {
                                        if ((unixFileLock((this._loadInt((_32_ + 44))), (_32_ + 8))) == 0) {
                                            break label$14;
                                        }
                                        this._storeInt((_32_ + 48), (sqliteErrorFromPosixError((this._storeInt((_32_ + 4), (this._loadInt((__errno_location()))))), 3850)));
                                    }
                                    while (false);
                                    this._storeInt16((_32_ + 8), 2);
                                    this._storeLong((_32_ + 24), 1L);
                                    this._storeLong((_32_ + 16), (this._loadLong32s((0 + 22332))));
                                    label$15:
                                    do {
                                        if ((unixFileLock((this._loadInt((_32_ + 44))), (_32_ + 8))) == 0) {
                                            break label$15;
                                        }
                                        if ((this._loadInt((_32_ + 48))) != 0) {
                                            break label$15;
                                        }
                                        this._storeInt((_32_ + 4), (this._loadInt((__errno_location()))));
                                        this._storeInt((_32_ + 48), 2058);
                                    }
                                    while (false);
                                    if ((this._loadInt((_32_ + 48))) == 0) {
                                        break label$12;
                                    }
                                    if ((this._loadInt((_32_ + 48))) == 5) {
                                        break label$2;
                                    }
                                    this._storeInt(((this._loadInt((_32_ + 44))) + 20), (this._loadInt((_32_ + 4))));
                                    break label$2;
                                }
                                while (false);
                                label$16:
                                do {
                                    if ((this._loadInt((_32_ + 52))) != 4) {
                                        break label$16;
                                    }
                                    if ((this._loadInt(((this._loadInt((_32_ + 40))) + 16))) < 2) {
                                        break label$16;
                                    }
                                    this._storeInt((_32_ + 48), 5);
                                    break label$9;
                                }
                                while (false);
                                _31_ = this._storeInt16((_32_ + 8), 1);
                                if ((this._loadInt((_32_ + 52))) != 2) {
                                    break label$11;
                                }
                                this._storeLong((_32_ + 24), 1L);
                                this._storeLong((_32_ + 16), ((long) ((this._loadInt((0 + 22332))) + _31_)));
                                break label$10;
                            }
                            while (false);
                            _31_ = this._storeInt8(((this._loadInt((_32_ + 44))) + 16), 1);
                            this._storeInt(((_30_ = this._loadInt((_32_ + 40))) + 32), (_31_ + (this._loadInt((_30_ + 32)))));
                            this._storeInt(((this._loadInt((_32_ + 40))) + 16), _31_);
                            break label$9;
                        }
                        while (false);
                        this._storeLong((_32_ + 24), 510L);
                        this._storeLong((_32_ + 16), ((long) ((this._loadInt((0 + 22332))) + 2)));
                    }
                    while (false);
                    if ((unixFileLock((this._loadInt((_32_ + 44))), (_32_ + 8))) == 0) {
                        break label$9;
                    }
                    if ((this._storeInt((_32_ + 48), (sqliteErrorFromPosixError((this._storeInt((_32_ + 4), (this._loadInt((__errno_location()))))), 3850)))) == 5) {
                        break label$9;
                    }
                    this._storeInt(((this._loadInt((_32_ + 44))) + 20), (this._loadInt((_32_ + 4))));
                }
                while (false);
                label$17:
                do {
                    if ((this._loadInt((_32_ + 48))) == 0) {
                        break label$17;
                    }
                    if ((this._loadInt((_32_ + 52))) != 4) {
                        break label$2;
                    }
                    _31_ = this._storeInt8(((this._loadInt((_32_ + 44))) + 16), 3);
                    this._storeInt8(((this._loadInt((_32_ + 40))) + 20), _31_);
                    break label$2;
                }
                while (false);
                _31_ = this._storeInt8(((this._loadInt((_32_ + 44))) + 16), (this._loadInt((_32_ + 52))));
                this._storeInt8(((this._loadInt((_32_ + 40))) + 20), _31_);
            }
            while (false);
            unixLeaveMutex();
            this._storeInt((_32_ + 60), (this._loadInt((_32_ + 48))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 60));
        this._storeInt((0 + 4), (_32_ + 64));
        return _31_;
    }

    @Override()
    public final int unixUnlock(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = posixUnlock((this._loadInt((_32_ + 12))), _31_, 0);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int unixCheckReservedLock(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_32_ + 56), _31_);
        this._storeInt((_32_ + 48), (this._storeInt((_32_ + 52), 0)));
        this._storeInt((_32_ + 44), (this._loadInt((_32_ + 60))));
        unixEnterMutex();
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt(((this._loadInt((_32_ + 44))) + 4))) + 20))) < 2) {
                break label$0;
            }
            this._storeInt((_32_ + 48), 1);
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_32_ + 48))) != 0) {
                break label$1;
            }
            if ((this._loadInt8u(((this._loadInt(((this._loadInt((_32_ + 44))) + 4))) + 21))) != 0) {
                break label$1;
            }
            this._storeLong((_32_ + 24), 1L);
            this._storeLong((_32_ + 16), ((long) ((this._storeInt((_32_ + 8), 1)) + (this._loadInt((0 + 22332))))));
            _31_ = this._loadInt(((this._loadInt((_32_ + 44))) + 8));
            this._storeInt(_32_, (_32_ + 8));
            label$2:
            do {
                if ((this._iiiiTable[this._tableIndices[this._loadInt((0 + 21272))]].invoke(_31_, 12, _32_)) == 0) {
                    break label$2;
                }
                this._storeInt((_32_ + 52), 3594);
                _31_ = __errno_location();
                this._storeInt(((this._loadInt((_32_ + 44))) + 20), (this._loadInt(_31_)));
                break label$1;
            }
            while (false);
            if ((this._loadInt16s((_32_ + 8))) == 2) {
                break label$1;
            }
            this._storeInt((_32_ + 48), 1);
        }
        while (false);
        unixLeaveMutex();
        this._storeInt((this._loadInt((_32_ + 56))), (this._loadInt((_32_ + 48))));
        _31_ = this._loadInt((_32_ + 52));
        this._storeInt((0 + 4), (_32_ + 64));
        return _31_;
    }

    @Override()
    public final int posixUnlock(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_33_ + 52), _31_);
        this._storeInt((_33_ + 48), _32_);
        this._storeInt((_33_ + 44), (this._loadInt((_33_ + 56))));
        _32_ = this._storeInt((_33_ + 4), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 44))) + 16))) > (this._loadInt((_33_ + 52)))) {
                    break label$1;
                }
                this._storeInt((_33_ + 60), _32_);
                break label$0;
            }
            while (false);
            unixEnterMutex();
            this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 44))) + 8))));
            this._storeInt((_33_ + 40), (this._loadInt(((this._loadInt((_33_ + 44))) + 4))));
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt8u(((this._loadInt((_33_ + 44))) + 16))) < 2) {
                        break label$3;
                    }
                    label$4:
                    do {
                        if ((this._loadInt((_33_ + 52))) != 1) {
                            break label$4;
                        }
                        this._storeLong((_33_ + 24), 510L);
                        this._storeLong((_33_ + 16), ((long) ((this._loadInt(((this._storeInt((_33_ + 8), 0)) + 22332))) + 2)));
                        if ((unixFileLock((this._loadInt((_33_ + 44))), (_33_ + 8))) == 0) {
                            break label$4;
                        }
                        this._storeInt((_33_ + 4), 2314);
                        _32_ = __errno_location();
                        this._storeInt(((this._loadInt((_33_ + 44))) + 20), (this._loadInt(_32_)));
                        break label$2;
                    }
                    while (false);
                    this._storeInt((_33_ + 8), 2);
                    this._storeLong((_33_ + 24), 2L);
                    this._storeLong((_33_ + 16), (this._loadLong32s((0 + 22332))));
                    label$5:
                    do {
                        if ((unixFileLock((this._loadInt((_33_ + 44))), (_33_ + 8))) == 0) {
                            break label$5;
                        }
                        this._storeInt((_33_ + 4), 2058);
                        _32_ = __errno_location();
                        this._storeInt(((this._loadInt((_33_ + 44))) + 20), (this._loadInt(_32_)));
                        break label$2;
                    }
                    while (false);
                    this._storeInt8(((this._loadInt((_33_ + 40))) + 20), 1);
                }
                while (false);
                if ((this._loadInt((_33_ + 52))) != 0) {
                    break label$2;
                }
                label$6:
                do {
                    if ((this._storeInt(((_32_ = this._loadInt((_33_ + 40))) + 16), ((this._loadInt((_32_ + 16))) + -1))) != 0) {
                        break label$6;
                    }
                    this._storeInt((_33_ + 8), 2);
                    this._storeLong((_33_ + 16), (this._storeLong((_33_ + 24), 0L)));
                    label$7:
                    do {
                        if ((unixFileLock((this._loadInt((_33_ + 44))), (_33_ + 8))) == 0) {
                            break label$7;
                        }
                        this._storeInt((_33_ + 4), 2058);
                        _32_ = __errno_location();
                        this._storeInt(((this._loadInt((_33_ + 44))) + 20), (this._loadInt(_32_)));
                        _32_ = this._storeInt8(((this._loadInt((_33_ + 40))) + 20), 0);
                        this._storeInt8(((this._loadInt((_33_ + 44))) + 16), _32_);
                        break label$6;
                    }
                    while (false);
                    this._storeInt8(((this._loadInt((_33_ + 40))) + 20), 0);
                }
                while (false);
                if ((this._storeInt(((_32_ = this._loadInt((_33_ + 40))) + 32), ((this._loadInt((_32_ + 32))) + -1))) != 0) {
                    break label$2;
                }
                closePendingFds((this._loadInt((_33_ + 44))));
            }
            while (false);
            unixLeaveMutex();
            label$8:
            do {
                if ((this._loadInt((_33_ + 4))) != 0) {
                    break label$8;
                }
                this._storeInt8(((this._loadInt((_33_ + 44))) + 16), (this._loadInt((_33_ + 52))));
            }
            while (false);
            this._storeInt((_33_ + 60), (this._loadInt((_33_ + 4))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 60));
        this._storeInt((0 + 4), (_33_ + 64));
        return _32_;
    }

    @Override()
    public final int unixFileLock(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 72), _30_);
        this._storeInt((_32_ + 68), _31_);
        this._storeInt((_32_ + 60), (this._loadInt(((this._loadInt((_32_ + 72))) + 4))));
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
                            if (((this._loadInt8u(((this._loadInt((_32_ + 72))) + 17))) & 1) != 0) {
                                break label$4;
                            }
                            if ((this._loadInt8u(((this._loadInt((_32_ + 60))) + 21))) == 0) {
                                break label$3;
                            }
                        }
                        while (false);
                        if (((this._loadInt8u(((this._loadInt((_32_ + 72))) + 17))) & 2) != 0) {
                            break label$3;
                        }
                        if ((this._loadInt8u(((this._loadInt((_32_ + 60))) + 21))) == 0) {
                            break label$2;
                        }
                        this._storeInt((_32_ + 64), 0);
                        break label$1;
                    }
                    while (false);
                    _31_ = this._loadInt(((this._loadInt((_32_ + 72))) + 8));
                    this._storeInt((_32_ + 16), (this._loadInt((_32_ + 68))));
                    this._storeInt((_32_ + 64), (this._iiiiTable[this._tableIndices[this._loadInt((0 + 21272))]].invoke(_31_, 13, (_32_ + 16))));
                    break label$1;
                }
                while (false);
                _30_ = this._storeInt((_32_ + 24), 1);
                this._storeLong((_32_ + 40), 510L);
                this._storeLong((_32_ + 32), ((long) ((this._loadInt((0 + 22332))) + 2)));
                _31_ = this._loadInt(((this._loadInt((_32_ + 72))) + 8));
                this._storeInt(_32_, (_32_ + 24));
                label$5:
                do {
                    if ((this._storeInt((_32_ + 64), (this._iiiiTable[this._tableIndices[this._loadInt((0 + 21272))]].invoke(_31_, 13, _32_)))) <= -1) {
                        break label$5;
                    }
                    this._storeInt(((_31_ = this._loadInt((_32_ + 60))) + 32), ((this._storeInt8((_31_ + 21), _30_)) + (this._loadInt((_31_ + 32)))));
                    break label$1;
                }
                while (false);
                this._storeInt((_32_ + 76), (this._loadInt((_32_ + 64))));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 76), (this._loadInt((_32_ + 64))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 76));
        this._storeInt((0 + 4), (_32_ + 80));
        return _31_;
    }

    @Override()
    public final void closePendingFds(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 4), (this._loadInt(((this._storeInt((_31_ + 8), (this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 4))))) + 36))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 4))) == 0) {
                    break label$1;
                }
                this._storeInt(_31_, (this._loadInt(((this._loadInt((_31_ + 4))) + 8))));
                robust_close((this._loadInt((_31_ + 12))), (this._loadInt((this._loadInt((_31_ + 4))))), 25531);
                sqlite3_free((this._loadInt((_31_ + 4))));
                this._storeInt((_31_ + 4), (this._loadInt(_31_)));
                continue label$0;
            }
        }
        while (false);
        this._storeInt(((this._loadInt((_31_ + 8))) + 36), 0);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void setPendingFd(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 8), (this._loadInt(((this._storeInt((_32_ + 12), _30_)) + 4))));
        this._storeInt(((_30_ = this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 12))) + 28))))) + 8), (this._loadInt(((_31_ = this._loadInt((_32_ + 8))) + 36))));
        this._storeInt((_31_ + 36), _30_);
        this._storeInt(((this._loadInt((_32_ + 12))) + 8), -1);
        this._storeInt(((this._loadInt((_32_ + 12))) + 28), 0);
        return;
    }

    @Override()
    public final void releaseInodeInfo(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 4))))) == 0) {
                break label$0;
            }
            if ((this._storeInt(((_30_ = this._loadInt((_31_ + 8))) + 24), ((this._loadInt((_30_ + 24))) + -1))) != 0) {
                break label$0;
            }
            closePendingFds((this._loadInt((_31_ + 12))));
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt(((this._loadInt((_31_ + 8))) + 44))) == 0) {
                        break label$2;
                    }
                    this._storeInt(((this._loadInt(((_30_ = this._loadInt((_31_ + 8))) + 44))) + 40), (this._loadInt((_30_ + 40))));
                    break label$1;
                }
                while (false);
                this._storeInt((0 + 22328), (this._loadInt(((this._loadInt((_31_ + 8))) + 40))));
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 8))) + 40))) == 0) {
                    break label$3;
                }
                this._storeInt(((this._loadInt(((_30_ = this._loadInt((_31_ + 8))) + 40))) + 44), (this._loadInt((_30_ + 44))));
            }
            while (false);
            sqlite3_free((this._loadInt((_31_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int unixTempFileDir()
    {
        int _30_ = 0;
        int _31_ = 0;
        int _32_ = 0;
        _31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 128));
        this._storeInt((0 + 22720), (this._loadInt((0 + 19784))));
        label$0:
        do {
            if ((this._loadInt(((_32_ = this._storeInt((_31_ + 12), 0)) + 22724))) != 0) {
                break label$0;
            }
            this._storeInt((_32_ + 22724), (getenv(22752)));
        }
        while (false);
        _30_ = this._storeInt((_31_ + 124), _32_);
        label$2:
        do {
            label$1:
            while (true) {
                if (((this._loadInt((_31_ + 124))) & 4294967295L) > (5 & 4294967295L)) {
                    break label$2;
                }
                label$3:
                do {
                    if ((this._loadInt((_31_ + 12))) == 0) {
                        break label$3;
                    }
                    if ((this._iiiTable[this._tableIndices[this._loadInt((_30_ + 21236))]].invoke((this._loadInt((_31_ + 12))), (_31_ + 16))) != 0) {
                        break label$3;
                    }
                    if (((this._loadInt((_31_ + 32))) & 61440) != 16384) {
                        break label$3;
                    }
                    if ((this._iiiTable[this._tableIndices[this._loadInt((_30_ + 21212))]].invoke((this._loadInt((_31_ + 12))), 7)) == 0) {
                        break label$2;
                    }
                }
                while (false);
                this._storeInt((_31_ + 124), ((_32_ = this._loadInt((_31_ + 124))) + 1));
                this._storeInt((_31_ + 12), (this._loadInt(((_32_ << 2) + 22720))));
                continue label$1;
            }
        }
        while (false);
        _32_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 128));
        return _32_;
    }

    @Override()
    public final void sqlite3_randomness(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 4), (this._storeInt((_32_ + 8), _31_)));
        label$1:
        do {
            label$0:
            while (true) {
                this._storeInt((_32_ + 12), ((_31_ = this._loadInt((_32_ + 12))) + -1));
                if (_31_ == 0) {
                    break label$1;
                }
                _31_ = randomByte();
                this._storeInt8((_30_ = this._loadInt((_32_ + 4))), _31_);
                this._storeInt((_32_ + 4), (_30_ + 1));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int randomByte()
    {
        int _30_ = 0;
        int _31_ = 0;
        int _32_ = 0;
        int _33_ = 0;
        int _34_ = 0;
        _32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 272));
        label$0:
        do {
            if ((this._loadInt8u((0 + 22447))) != 0) {
                break label$0;
            }
            sqlite3OsRandomness((sqlite3_vfs_find((_30_ = this._storeInt16((0 + 22448), 0)))), 256, _32_);
            this._storeInt((_32_ + 264), _30_);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 264))) > 255) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 264), ((this._storeInt8(((_30_ = this._loadInt((_32_ + 264))) + 22450), _30_)) + 1));
                    continue label$1;
                }
            }
            while (false);
            _30_ = this._storeInt((_32_ + 264), 0);
            label$4:
            do {
                label$3:
                while (true) {
                    if ((this._loadInt((_32_ + 264))) > 255) {
                        break label$4;
                    }
                    this._storeInt8((_30_ + 22449), ((this._loadInt8u((_30_ + 22449))) + ((this._loadInt8u(((_33_ = this._loadInt((_32_ + 264))) + 22450))) + (this._loadInt8s((_32_ + _33_))))));
                    _31_ = this._storeInt8((_32_ + 271), (this._loadInt8u(((_33_ = this._loadInt8u((_30_ + 22449))) + 22450))));
                    this._storeInt8((_33_ + 22450), (this._loadInt8u(((_34_ = this._loadInt((_32_ + 264))) + 22450))));
                    this._storeInt8((_34_ + 22450), _31_);
                    this._storeInt((_32_ + 264), ((this._loadInt((_32_ + 264))) + 1));
                    continue label$3;
                }
            }
            while (false);
            this._storeInt8((0 + 22447), 1);
        }
        while (false);
        this._storeInt8((0 + 22448), ((this._loadInt8u((0 + 22448))) + 1));
        this._storeInt8((_32_ + 271), (this._loadInt8u(((this._loadInt8u((0 + 22448))) + 22450))));
        this._storeInt8((0 + 22449), ((this._loadInt8u((0 + 22449))) + (this._loadInt8u((_32_ + 271)))));
        this._storeInt8(((this._loadInt8u((0 + 22448))) + 22450), (this._loadInt8u(((_30_ = this._loadInt8u((0 + 22449))) + 22450))));
        this._storeInt8((_30_ + 22450), (this._loadInt8u((_32_ + 271))));
        this._storeInt8((_32_ + 271), ((this._loadInt8u((_32_ + 271))) + (this._loadInt8u(((this._loadInt8u((0 + 22448))) + 22450)))));
        _30_ = this._loadInt8u(((this._loadInt8u((_32_ + 271))) + 22450));
        this._storeInt((0 + 4), (_32_ + 272));
        return _30_;
    }

    @Override()
    public final int sqlite3_vfs_find(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        _30_ = this._storeInt((_31_ + 4), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(_31_, (sqlite3_initialize()))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 12), _30_);
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 4), (this._loadInt((_30_ + 21024))));
            label$3:
            do {
                label$2:
                while (true) {
                    if ((this._loadInt((_31_ + 4))) == 0) {
                        break label$3;
                    }
                    if ((this._loadInt((_31_ + 8))) == 0) {
                        break label$3;
                    }
                    if ((strcmp((this._loadInt((_31_ + 8))), (this._loadInt(((this._loadInt((_31_ + 4))) + 16))))) == 0) {
                        break label$3;
                    }
                    this._storeInt((_31_ + 4), (this._loadInt(((this._loadInt((_31_ + 4))) + 12))));
                    continue label$2;
                }
            }
            while (false);
            this._storeInt((_31_ + 12), (this._loadInt((_31_ + 4))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3OsRandomness(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = this._iiiiTable[this._tableIndices[this._loadInt(((_31_ = this._loadInt((_33_ + 12))) + 56))]].invoke(_31_, (this._loadInt((_33_ + 8))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int posixIoFinderImpl(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        return 22248;
    }

    @Override()
    public final void sqlite3PCacheSetDefault()
    {
        int _30_ = 0;
        this._storeInt((_30_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))), 22808);
        sqlite3_config(14, _30_);
        this._storeInt((0 + 4), (_30_ + 16));
        return;
    }

    @Override()
    public final int sqlite3_config(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._storeInt(_32_, 0)) + 20428))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 12), (sqlite3MisuseError(108203)));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 4), _31_);
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
                                            if (((_30_ = (this._loadInt((_32_ + 8))) + -4) & 4294967295L) > (13 & 4294967295L)) {
                                                break label$9;
                                            }
                                            label$10:
                                            do {
                                                label$11:
                                                do {
                                                    label$12:
                                                    do {
                                                        label$13:
                                                        do {
                                                            switch (_30_) {
                                                                case 0: {
                                                                    break label$13;
                                                                }
                                                                case 1: {
                                                                    break label$12;
                                                                }
                                                                case 2: {
                                                                    break label$11;
                                                                }
                                                                case 3: {
                                                                    break label$10;
                                                                }
                                                                case 4:
                                                                case 6:
                                                                case 7:
                                                                case 8: {
                                                                    break label$9;
                                                                }
                                                                case 5: {
                                                                    break label$8;
                                                                }
                                                                case 9: {
                                                                    break label$7;
                                                                }
                                                                case 10: {
                                                                    break label$6;
                                                                }
                                                                case 11: {
                                                                    break label$5;
                                                                }
                                                                case 12: {
                                                                    break label$4;
                                                                }
                                                                case 13: {
                                                                    break label$3;
                                                                }
                                                                default: {
                                                                    break label$13;
                                                                }
                                                            }
                                                        }
                                                        while (false);
                                                        this._storeInt((_32_ + 4), ((_30_ = this._loadInt((_32_ + 4))) + 4));
                                                        this._storeLong((0 + 20268), (this._loadLong((_30_ = this._loadInt(_30_)))));
                                                        this._storeLong((0 + 20292), (this._loadLong((_30_ + 24))));
                                                        this._storeLong((0 + 20284), (this._loadLong((_30_ + 16))));
                                                        this._storeLong((0 + 20276), (this._loadLong((_30_ + 8))));
                                                        break label$2;
                                                    }
                                                    while (false);
                                                    label$14:
                                                    do {
                                                        if ((this._loadInt((0 + 20268))) != 0) {
                                                            break label$14;
                                                        }
                                                        sqlite3MemSetDefault();
                                                    }
                                                    while (false);
                                                    this._storeInt((_32_ + 4), ((_30_ = this._loadInt((_32_ + 4))) + 4));
                                                    this._storeLong((_30_ = this._loadInt(_30_)), (this._loadLong((0 + 20268))));
                                                    this._storeLong((_30_ + 24), (this._loadLong((0 + 20292))));
                                                    this._storeLong((_30_ + 16), (this._loadLong((0 + 20284))));
                                                    this._storeLong((_30_ + 8), (this._loadLong((0 + 20276))));
                                                    break label$2;
                                                }
                                                while (false);
                                                this._storeInt((_32_ + 4), ((_30_ = this._loadInt((_32_ + 4))) + 4));
                                                this._storeInt((0 + 20396), (this._loadInt(_30_)));
                                                _31_ = this._storeInt((_32_ + 4), (_30_ + 8));
                                                this._storeInt((0 + 20400), (this._loadInt((_30_ + 4))));
                                                this._storeInt((_32_ + 4), (_30_ + 12));
                                                this._storeInt((0 + 20404), (this._loadInt(_31_)));
                                                break label$2;
                                            }
                                            while (false);
                                            this._storeInt((_32_ + 4), ((_30_ = this._loadInt((_32_ + 4))) + 4));
                                            this._storeInt((0 + 20408), (this._loadInt(_30_)));
                                            _31_ = this._storeInt((_32_ + 4), (_30_ + 8));
                                            this._storeInt((0 + 20412), (this._loadInt((_30_ + 4))));
                                            this._storeInt((_32_ + 4), (_30_ + 12));
                                            this._storeInt((0 + 20416), (this._loadInt(_31_)));
                                            break label$2;
                                        }
                                        while (false);
                                        this._storeInt(_32_, 1);
                                        break label$2;
                                    }
                                    while (false);
                                    this._storeInt((_32_ + 4), ((_30_ = this._loadInt((_32_ + 4))) + 4));
                                    this._storeInt((0 + 20240), (this._loadInt(_30_)));
                                    break label$2;
                                }
                                while (false);
                                this._storeInt((_32_ + 4), ((_30_ = this._loadInt((_32_ + 4))) + 4));
                                this._storeInt((0 + 20260), (this._loadInt(_30_)));
                                this._storeInt((_32_ + 4), (_30_ + 8));
                                this._storeInt((0 + 20264), (this._loadInt((_30_ + 4))));
                                break label$2;
                            }
                            while (false);
                            this._storeInt((_32_ + 4), ((_30_ = this._loadInt((_32_ + 4))) + 4));
                            memcpy(20336, (this._loadInt(_30_)), 44);
                            break label$2;
                        }
                        while (false);
                        label$15:
                        do {
                            if ((this._loadInt((0 + 20340))) != 0) {
                                break label$15;
                            }
                            sqlite3PCacheSetDefault();
                        }
                        while (false);
                        this._storeInt((_32_ + 4), ((_30_ = this._loadInt((_32_ + 4))) + 4));
                        memcpy((this._loadInt(_30_)), 20336, 44);
                        break label$2;
                    }
                    while (false);
                    this._storeInt((_32_ + 4), ((_30_ = this._loadInt((_32_ + 4))) + 4));
                    this._storeInt((0 + 20456), (this._loadInt(_30_)));
                    this._storeInt((_32_ + 4), (_30_ + 8));
                    this._storeInt((0 + 20460), (this._loadInt((_30_ + 4))));
                    break label$2;
                }
                while (false);
                this._storeInt((_32_ + 4), ((_30_ = this._loadInt((_32_ + 4))) + 4));
                this._storeInt((0 + 20252), (this._loadInt(_30_)));
            }
            while (false);
            this._storeInt((_32_ + 12), (this._loadInt(_32_)));
        }
        while (false);
        _30_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _30_;
    }

    @Override()
    public final void sqlite3MemSetDefault()
    {
        int _30_ = 0;
        this._storeInt((_30_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))), 22852);
        sqlite3_config(4, _30_);
        this._storeInt((0 + 4), (_30_ + 16));
        return;
    }

    @Override()
    public final int sqlite3MemMalloc(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (malloc(((this._storeInt((_31_ + 12), (((this._storeInt((_31_ + 12), _30_)) + 7) & -8))) + 8))))) == 0) {
                    break label$1;
                }
                this._storeLong((_30_ = this._loadInt((_31_ + 8))), (this._loadLong32s((_31_ + 12))));
                this._storeInt((_31_ + 8), (_30_ + 8));
                break label$0;
            }
            while (false);
            this._storeInt(_31_, (this._loadInt((_31_ + 12))));
            sqlite3_log(7, 22944, _31_);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void sqlite3MemFree(int _30_)
    {
        int _31_ = 0;
        free((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), ((this._storeInt((_31_ + 8), (this._storeInt((_31_ + 12), _30_)))) + -8))));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3MemRealloc(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 20), (realloc((this._storeInt((_32_ + 20), ((this._storeInt((_32_ + 20), (this._loadInt((_32_ + 28))))) + -8))), ((this._loadInt((_32_ + 24))) + 8))))) == 0) {
                    break label$1;
                }
                this._storeLong((_31_ = this._loadInt((_32_ + 20))), (this._loadLong32s((_32_ + 24))));
                this._storeInt((_32_ + 20), (_31_ + 8));
                break label$0;
            }
            while (false);
            _31_ = sqlite3MemSize((this._loadInt((_32_ + 28))));
            this._storeInt((_32_ + 4), (this._loadInt((_32_ + 24))));
            this._storeInt(_32_, _31_);
            sqlite3_log(7, 22896, _32_);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 20));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int sqlite3MemSize(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), _30_)) == 0) {
                break label$0;
            }
            this._storeLong32((_31_ + 12), (this._loadLong((this._storeInt((_31_ + 4), ((this._storeInt((_31_ + 4), (this._loadInt((_31_ + 8))))) + -8))))));
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        this._storeInt((_31_ + 12), 0);
        return (this._loadInt((_31_ + 12)));
    }

    @Override()
    public final int sqlite3MemRoundup(int _30_)
    {
        return (((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 7) & -8);
    }

    @Override()
    public final int sqlite3MemInit(int _30_)
    {
        this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_);
        return 0;
    }

    @Override()
    public final void sqlite3MemShutdown(int _30_)
    {
        this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_);
        return;
    }

    @Override()
    public final int pcache1Init(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        memset(20600, 0, 68);
        label$0:
        do {
            if ((this._loadInt((0 + 20244))) == 0) {
                break label$0;
            }
            this._storeInt((0 + 20600), (this._storeInt((0 + 20652), 8)));
        }
        while (false);
        this._storeInt((0 + 20628), 1);
        this._storeInt((0 + 20612), 10);
        this._storeInt((0 + 4), (_31_ + 16));
        return 0;
    }

    @Override()
    public final void pcache1Shutdown(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        memset(20600, 0, 68);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int pcache1Create(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        _31_ = this._storeInt((_32_ + 8), 0);
        label$0:
        do {
            if ((this._storeInt((_32_ + 20), (sqlite3_malloc((this._storeInt((_32_ + 12), 44)))))) == 0) {
                break label$0;
            }
            memset((this._loadInt((_32_ + 20))), _31_, (this._loadInt((_32_ + 12))));
            _30_ = this._storeInt((_32_ + 16), 20600);
            this._storeInt(((_33_ = this._loadInt((_32_ + 20))) + 4), (this._loadInt((_32_ + 28))));
            this._storeInt(_33_, _30_);
            this._storeInt(((this._loadInt((_32_ + 20))) + 8), (((this._loadInt((_32_ + 24))) != _31_) ? 1 : 0));
            if ((this._loadInt((_32_ + 24))) == 0) {
                break label$0;
            }
            _31_ = this._storeInt(((this._loadInt((_32_ + 20))) + 12), 10);
            this._storeInt(((_30_ = this._loadInt((_32_ + 16))) + 8), (_31_ + (this._loadInt((_30_ + 8)))));
            this._storeInt(((_30_ = this._loadInt((_32_ + 16))) + 12), ((_31_ + (this._loadInt((_30_ + 4)))) - (this._loadInt((_30_ + 8)))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 20));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final void pcache1Cachesize(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if ((this._loadInt(((this._storeInt((_32_ + 4), (this._loadInt((_32_ + 12))))) + 8))) == 0) {
                break label$0;
            }
            this._storeInt(((_31_ = this._storeInt(_32_, (this._loadInt((this._loadInt((_32_ + 4))))))) + 4), ((this._loadInt((_31_ + 4))) + ((this._loadInt((_32_ + 8))) - (this._loadInt(((this._loadInt((_32_ + 4))) + 16))))));
            this._storeInt(((_31_ = this._loadInt(_32_)) + 12), (((this._loadInt((_31_ + 4))) + 10) - (this._loadInt((_31_ + 8)))));
            this._storeInt(((this._loadInt((_32_ + 4))) + 16), (this._loadInt((_32_ + 8))));
            this._storeInt(((_31_ = this._loadInt((_32_ + 4))) + 20), (((this._loadInt((_31_ + 16))) * 9) / 10));
            pcache1EnforceMaxPage((this._loadInt(_32_)));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int pcache1Pagecount(int _30_)
    {
        int _31_ = 0;
        return (this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._loadInt(((this._storeInt((_31_ + 4), (this._storeInt((_31_ + 12), _30_)))) + 28)))));
    }

    @Override()
    public final int pcache1Fetch(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_33_ + 40), _31_);
        this._storeInt((_33_ + 36), _32_);
        this._storeInt((_33_ + 28), (this._loadInt((_33_ + 44))));
        this._storeInt((_33_ + 20), 0);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_33_ + 28))) + 32))) == 0) {
                break label$0;
            }
            _32_ = this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 40))) % (this._loadInt(((this._loadInt((_33_ + 28))) + 32)))));
            this._storeInt((_33_ + 20), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 28))) + 36))) + (_32_ << 2)))));
            label$2:
            do {
                label$1:
                while (true) {
                    _32_ = 0;
                    label$3:
                    do {
                        if ((this._loadInt((_33_ + 20))) == 0) {
                            break label$3;
                        }
                        _32_ = ((this._loadInt((this._loadInt((_33_ + 20))))) != (this._loadInt((_33_ + 40)))) ? 1 : 0;
                    }
                    while (false);
                    if (_32_ == 0) {
                        break label$2;
                    }
                    this._storeInt((_33_ + 20), (this._loadInt(((this._loadInt((_33_ + 20))) + 4))));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        label$4:
        do {
            label$5:
            do {
                if ((this._loadInt((_33_ + 20))) != 0) {
                    break label$5;
                }
                if ((this._loadInt((_33_ + 36))) == 0) {
                    break label$5;
                }
                this._storeInt((_33_ + 24), (this._loadInt((this._loadInt((_33_ + 28))))));
                this._storeInt((_33_ + 32), ((this._loadInt(((_32_ = this._loadInt((_33_ + 28))) + 28))) - (this._loadInt((_32_ + 24)))));
                label$6:
                do {
                    if ((this._loadInt((_33_ + 36))) != 1) {
                        break label$6;
                    }
                    if ((this._loadInt((_33_ + 32))) >= (this._loadInt(((this._loadInt((_33_ + 24))) + 12)))) {
                        break label$4;
                    }
                    if ((this._loadInt((_33_ + 32))) >= (this._loadInt(((this._loadInt((_33_ + 28))) + 20)))) {
                        break label$4;
                    }
                    if ((pcache1UnderMemoryPressure((this._loadInt((_33_ + 28))))) != 0) {
                        break label$4;
                    }
                }
                while (false);
                label$7:
                do {
                    if (((this._loadInt(((_32_ = this._loadInt((_33_ + 28))) + 28))) & 4294967295L) < ((this._loadInt((_32_ + 32))) & 4294967295L)) {
                        break label$7;
                    }
                    if ((pcache1ResizeHash((this._loadInt((_33_ + 28))))) != 0) {
                        break label$4;
                    }
                }
                while (false);
                label$8:
                do {
                    if ((this._loadInt(((this._loadInt((_33_ + 28))) + 8))) == 0) {
                        break label$8;
                    }
                    if ((this._loadInt(((this._loadInt((_33_ + 24))) + 24))) == 0) {
                        break label$8;
                    }
                    label$9:
                    do {
                        if ((((this._loadInt(((_32_ = this._loadInt((_33_ + 28))) + 28))) + 1) & 4294967295L) >= ((this._loadInt((_32_ + 16))) & 4294967295L)) {
                            break label$9;
                        }
                        if ((this._loadInt(((_32_ = this._loadInt((_33_ + 24))) + 16))) >= (this._loadInt((_32_ + 4)))) {
                            break label$9;
                        }
                        if ((pcache1UnderMemoryPressure((this._loadInt((_33_ + 28))))) == 0) {
                            break label$8;
                        }
                    }
                    while (false);
                    pcache1RemoveFromHash((this._storeInt((_33_ + 20), (this._loadInt(((this._loadInt((_33_ + 24))) + 24))))));
                    pcache1PinPage((this._loadInt((_33_ + 20))));
                    label$10:
                    do {
                        if ((this._loadInt(((this._storeInt((_33_ + 12), (this._loadInt(((this._loadInt((_33_ + 20))) + 8))))) + 4))) == (this._loadInt(((this._loadInt((_33_ + 28))) + 4)))) {
                            break label$10;
                        }
                        pcache1FreePage((this._loadInt((_33_ + 20))));
                        this._storeInt((_33_ + 20), 0);
                        break label$8;
                    }
                    while (false);
                    this._storeInt(((_32_ = this._loadInt((_33_ + 24))) + 16), ((this._loadInt((_32_ + 16))) - ((this._loadInt(((this._loadInt((_33_ + 12))) + 8))) - (this._loadInt(((this._loadInt((_33_ + 28))) + 8))))));
                }
                while (false);
                label$11:
                do {
                    if ((this._loadInt((_33_ + 20))) != 0) {
                        break label$11;
                    }
                    label$12:
                    do {
                        if ((this._loadInt((_33_ + 36))) != 1) {
                            break label$12;
                        }
                        sqlite3BeginBenignMalloc();
                    }
                    while (false);
                    this._storeInt((_33_ + 20), (pcache1AllocPage((this._loadInt((_33_ + 28))))));
                    if ((this._loadInt((_33_ + 36))) != 1) {
                        break label$11;
                    }
                    sqlite3EndBenignMalloc();
                }
                while (false);
                if ((this._loadInt((_33_ + 20))) == 0) {
                    break label$4;
                }
                this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 40))) % (this._loadInt(((this._loadInt((_33_ + 28))) + 32)))));
                this._storeInt(((_32_ = this._loadInt((_33_ + 28))) + 28), ((this._loadInt((_32_ + 28))) + 1));
                this._storeInt((this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 40))));
                this._storeInt(((this._loadInt((_33_ + 20))) + 4), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 28))) + 36))) + ((this._loadInt((_33_ + 8))) << 2)))));
                this._storeInt(((this._loadInt((_33_ + 20))) + 8), (this._loadInt((_33_ + 28))));
                _32_ = this._storeInt(((this._loadInt((_33_ + 20))) + 16), 0);
                this._storeInt(((this._loadInt((_33_ + 20))) + 12), _32_);
                this._storeInt(((_31_ = this._loadInt((_33_ + 20))) - (this._loadInt(((this._loadInt((_31_ + 8))) + 4)))), _32_);
                this._storeInt(((this._loadInt(((this._loadInt((_33_ + 28))) + 36))) + ((this._loadInt((_33_ + 8))) << 2)), (this._loadInt((_33_ + 20))));
                break label$4;
            }
            while (false);
            pcache1PinPage((this._loadInt((_33_ + 20))));
        }
        while (false);
        label$13:
        do {
            if ((this._loadInt((_33_ + 20))) == 0) {
                break label$13;
            }
            if (((this._loadInt((_33_ + 40))) & 4294967295L) <= ((this._loadInt(((this._loadInt((_33_ + 28))) + 40))) & 4294967295L)) {
                break label$13;
            }
            this._storeInt(((this._loadInt((_33_ + 28))) + 40), (this._loadInt((_33_ + 40))));
        }
        while (false);
        _32_ = 0;
        label$14:
        do {
            if ((this._loadInt((_33_ + 20))) == 0) {
                break label$14;
            }
            _32_ = (_32_ = this._loadInt((_33_ + 20))) - (this._loadInt(((this._loadInt((_32_ + 8))) + 4)));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 48));
        return _32_;
    }

    @Override()
    public final void pcache1Unpin(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        _32_ = this._storeInt((_33_ + 16), (this._loadInt((_33_ + 28))));
        this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 24))) + (this._loadInt((_32_ + 4)))));
        this._storeInt((_33_ + 8), (this._loadInt((this._loadInt((_33_ + 16))))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_33_ + 20))) != 0) {
                        break label$2;
                    }
                    if ((this._loadInt(((_32_ = this._loadInt((_33_ + 8))) + 16))) <= (this._loadInt((_32_ + 4)))) {
                        break label$1;
                    }
                }
                while (false);
                pcache1RemoveFromHash((this._loadInt((_33_ + 12))));
                pcache1FreePage((this._loadInt((_33_ + 12))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if ((this._loadInt(((this._loadInt((_33_ + 8))) + 20))) == 0) {
                        break label$4;
                    }
                    this._storeInt(((this._storeInt(((this._loadInt(((_32_ = this._loadInt((_33_ + 8))) + 20))) + 16), (this._loadInt((_33_ + 12))))) + 12), (this._loadInt((_32_ + 20))));
                    this._storeInt(((this._loadInt((_33_ + 8))) + 20), (this._loadInt((_33_ + 12))));
                    break label$3;
                }
                while (false);
                this._storeInt(((_32_ = this._loadInt((_33_ + 8))) + 24), (this._storeInt((_32_ + 20), (this._loadInt((_33_ + 12))))));
            }
            while (false);
            this._storeInt(((_32_ = this._loadInt((_33_ + 16))) + 24), ((this._loadInt((_32_ + 24))) + 1));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void pcache1Rekey(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = (this._loadInt((0 + 4))) - 32) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        _33_ = this._storeInt((_34_ + 12), (this._loadInt((_34_ + 28))));
        this._storeInt((_34_ + 8), ((this._loadInt((_34_ + 24))) + (this._loadInt((_33_ + 4)))));
        _33_ = this._storeInt(_34_, ((this._loadInt((_34_ + 20))) % (this._loadInt(((this._loadInt((_34_ + 12))) + 32)))));
        this._storeInt((_34_ + 4), ((this._loadInt(((this._loadInt((_34_ + 12))) + 36))) + (_33_ << 2)));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((this._loadInt((_34_ + 4))))) == (this._loadInt((_34_ + 8)))) {
                    break label$1;
                }
                this._storeInt((_34_ + 4), ((this._loadInt((this._loadInt((_34_ + 4))))) + 4));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((this._loadInt((_34_ + 4))), (this._loadInt(((this._loadInt((_34_ + 8))) + 4))));
        _33_ = this._storeInt(_34_, ((this._loadInt((_34_ + 16))) % (this._loadInt(((this._loadInt((_34_ + 12))) + 32)))));
        this._storeInt((_32_ = this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 16))));
        this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt(((this._loadInt((_34_ + 12))) + 36))) + (_33_ << 2)))));
        this._storeInt(((this._loadInt(((this._loadInt((_34_ + 12))) + 36))) + ((this._loadInt(_34_)) << 2)), (this._loadInt((_34_ + 8))));
        label$2:
        do {
            if (((this._loadInt((_34_ + 16))) & 4294967295L) <= ((this._loadInt(((this._loadInt((_34_ + 12))) + 40))) & 4294967295L)) {
                break label$2;
            }
            this._storeInt(((this._loadInt((_34_ + 12))) + 40), (this._loadInt((_34_ + 16))));
        }
        while (false);
        return;
    }

    @Override()
    public final void pcache1Truncate(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this._storeInt((_32_ + 4), (this._loadInt((_32_ + 12))));
        label$0:
        do {
            if (((this._loadInt((_32_ + 8))) & 4294967295L) > ((this._loadInt((_31_ + 40))) & 4294967295L)) {
                break label$0;
            }
            pcache1TruncateUnsafe((this._loadInt((_32_ + 4))), (this._loadInt((_32_ + 8))));
            this._storeInt(((this._loadInt((_32_ + 4))) + 40), ((this._loadInt((_32_ + 8))) + -1));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void pcache1Destroy(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 4), (this._loadInt((this._storeInt((_31_ + 8), (this._storeInt((_31_ + 12), _30_)))))));
        pcache1TruncateUnsafe((this._loadInt((_31_ + 8))), 0);
        this._storeInt(((_30_ = this._loadInt((_31_ + 4))) + 4), ((this._loadInt((_30_ + 4))) - (this._loadInt(((_32_ = this._loadInt((_31_ + 8))) + 16)))));
        this._storeInt((_30_ + 8), ((this._loadInt((_30_ + 8))) - (this._loadInt((_32_ + 12)))));
        this._storeInt(((_30_ = this._loadInt((_31_ + 4))) + 12), (((this._loadInt((_30_ + 4))) + 10) - (this._loadInt((_30_ + 8)))));
        pcache1EnforceMaxPage((this._loadInt((_31_ + 4))));
        sqlite3_free((this._loadInt(((this._loadInt((_31_ + 8))) + 36))));
        sqlite3_free((this._loadInt((_31_ + 8))));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void pcache1TruncateUnsafe(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 20), 0);
        label$0:
        while (true) {
            label$2:
            do {
                label$3:
                do {
                    if (((this._loadInt((_32_ + 20))) & 4294967295L) >= ((this._loadInt(((this._loadInt((_32_ + 28))) + 32))) & 4294967295L)) {
                        break label$3;
                    }
                    this._storeInt((_32_ + 16), ((this._loadInt(((this._loadInt((_32_ + 28))) + 36))) + ((this._loadInt((_32_ + 20))) << 2)));
                    label$4:
                    while (true) {
                        if ((this._storeInt((_32_ + 12), (this._loadInt((this._loadInt((_32_ + 16))))))) == 0) {
                            break label$2;
                        }
                        label$6:
                        do {
                            if (((this._loadInt((this._loadInt((_32_ + 12))))) & 4294967295L) >= ((this._loadInt((_32_ + 24))) & 4294967295L)) {
                                break label$6;
                            }
                            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 12))) + 4));
                            continue label$4;
                        }
                        while (false);
                        this._storeInt(((_31_ = this._loadInt((_32_ + 28))) + 28), ((this._loadInt((_31_ + 28))) + -1));
                        this._storeInt((this._loadInt((_32_ + 16))), (this._loadInt(((this._loadInt((_32_ + 12))) + 4))));
                        pcache1PinPage((this._loadInt((_32_ + 12))));
                        pcache1FreePage((this._loadInt((_32_ + 12))));
                        continue label$4;
                    }
                }
                while (false);
                this._storeInt((0 + 4), (_32_ + 32));
                return;
            }
            while (false);
            this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1));
            continue label$0;
        }
    }

    @Override()
    public final void pcache1EnforceMaxPage(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$1:
        do {
            label$0:
            while (true) {
                _30_ = 0;
                label$2:
                do {
                    if ((this._loadInt(((_32_ = this._loadInt((_31_ + 12))) + 16))) <= (this._loadInt((_32_ + 4)))) {
                        break label$2;
                    }
                    _30_ = ((this._loadInt(((this._loadInt((_31_ + 12))) + 24))) != 0) ? 1 : 0;
                }
                while (false);
                if (_30_ == 0) {
                    break label$1;
                }
                pcache1PinPage((this._storeInt((_31_ + 8), (this._loadInt(((this._loadInt((_31_ + 12))) + 24))))));
                pcache1RemoveFromHash((this._loadInt((_31_ + 8))));
                pcache1FreePage((this._loadInt((_31_ + 8))));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void pcache1PinPage(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) == 0) {
                break label$0;
            }
            this._storeInt((_31_ + 4), (this._loadInt((this._storeInt((_31_ + 8), (this._loadInt(((this._loadInt((_31_ + 12))) + 8))))))));
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 12))) + 12))) != 0) {
                    break label$1;
                }
                if ((this._loadInt((_31_ + 12))) != (this._loadInt(((this._loadInt((_31_ + 4))) + 24)))) {
                    break label$0;
                }
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 12))) + 16))) == 0) {
                    break label$2;
                }
                this._storeInt(((this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 16))) + 12), (this._loadInt((_30_ + 12))));
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 12))) + 12))) == 0) {
                    break label$3;
                }
                this._storeInt(((this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 12))) + 16), (this._loadInt((_30_ + 16))));
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 4))) + 20))) != (this._loadInt((_31_ + 12)))) {
                    break label$4;
                }
                this._storeInt(((this._loadInt((_31_ + 4))) + 20), (this._loadInt(((this._loadInt((_31_ + 12))) + 12))));
            }
            while (false);
            label$5:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 4))) + 24))) != (this._loadInt((_31_ + 12)))) {
                    break label$5;
                }
                this._storeInt(((this._loadInt((_31_ + 4))) + 24), (this._loadInt(((this._loadInt((_31_ + 12))) + 16))));
            }
            while (false);
            this._storeLong(((_31_ = this._loadInt((_31_ + 12))) + 12), 0L);
            this._storeInt(((_31_ = this._loadInt((_31_ + 8))) + 24), ((this._loadInt((_31_ + 24))) + -1));
        }
        while (false);
        return;
    }

    @Override()
    public final void pcache1RemoveFromHash(int _30_)
    {
        int _31_ = 0;
        _30_ = this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 4), (this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 8))));
        _30_ = this._storeInt((_31_ + 8), ((this._loadInt((this._loadInt((_31_ + 12))))) % (this._loadInt((_30_ + 32)))));
        this._storeInt(_31_, ((this._loadInt(((this._loadInt((_31_ + 4))) + 36))) + (_30_ << 2)));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((this._loadInt(_31_)))) == (this._loadInt((_31_ + 12)))) {
                    break label$1;
                }
                this._storeInt(_31_, ((this._loadInt((this._loadInt(_31_)))) + 4));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((_30_ = this._loadInt(_31_)), (this._loadInt(((this._loadInt(_30_)) + 4))));
        this._storeInt(((_31_ = this._loadInt((_31_ + 4))) + 28), ((this._loadInt((_31_ + 28))) + -1));
        return;
    }

    @Override()
    public final void pcache1FreePage(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt(((this._storeInt((_31_ + 8), (this._loadInt(((this._loadInt((_31_ + 12))) + 8))))) + 8))) == 0) {
                    break label$1;
                }
                this._storeInt(((_30_ = this._loadInt((this._loadInt((_31_ + 8))))) + 16), ((this._loadInt((_30_ + 16))) + -1));
            }
            while (false);
            pcache1Free(((_30_ = this._loadInt((_31_ + 12))) - (this._loadInt(((this._loadInt((_30_ + 8))) + 4)))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void pcache1Free(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) == 0) {
                break label$0;
            }
            label$1:
            do {
                if (((this._loadInt((_31_ + 12))) & 4294967295L) < ((this._loadInt((0 + 20644))) & 4294967295L)) {
                    break label$1;
                }
                if (((this._loadInt((_31_ + 12))) & 4294967295L) >= ((this._loadInt((0 + 20648))) & 4294967295L)) {
                    break label$1;
                }
                sqlite3StatusAdd(1, -1);
                this._storeInt((_30_ = this._loadInt((_31_ + 12))), (this._loadInt((0 + 20660))));
                this._storeInt((_31_ + 8), _30_);
                this._storeInt((0 + 20660), (this._loadInt((_31_ + 8))));
                this._storeInt((0 + 20664), (((this._storeInt((0 + 20656), ((this._loadInt((0 + 20656))) + 1))) < (this._loadInt((0 + 20640)))) ? 1 : 0));
                break label$0;
            }
            while (false);
            sqlite3StatusAdd(2, (0 - (this._storeInt((_31_ + 4), (sqlite3MallocSize((this._loadInt((_31_ + 12)))))))));
            sqlite3_free((this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int pcache1UnderMemoryPressure(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((0 + 20636))) == 0) {
                    break label$1;
                }
                if ((this._loadInt(((this._loadInt((_31_ + 8))) + 4))) > (this._loadInt((0 + 20632)))) {
                    break label$1;
                }
                this._storeInt((_31_ + 12), (this._loadInt((0 + 20664))));
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 12), (sqlite3HeapNearlyFull()));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int pcache1ResizeHash(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        label$0:
        do {
            if (((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 20), ((this._loadInt(((this._storeInt((_31_ + 28), _30_)) + 32))) << 1))) & 4294967295L) > (255 & 4294967295L)) {
                break label$0;
            }
            this._storeInt((_31_ + 20), 256);
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt(((this._loadInt((_31_ + 28))) + 32))) == 0) {
                break label$1;
            }
            sqlite3BeginBenignMalloc();
        }
        while (false);
        this._storeInt((_31_ + 24), (sqlite3_malloc(((this._loadInt((_31_ + 20))) << 2))));
        label$2:
        do {
            if ((this._loadInt(((this._loadInt((_31_ + 28))) + 32))) == 0) {
                break label$2;
            }
            sqlite3EndBenignMalloc();
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt((_31_ + 24))) == 0) {
                break label$3;
            }
            memset((this._loadInt((_31_ + 24))), 0, ((this._loadInt((_31_ + 20))) << 2));
            this._storeInt((_31_ + 16), 0);
            label$5:
            do {
                label$4:
                while (true) {
                    label$6:
                    do {
                        label$7:
                        do {
                            if (((this._loadInt((_31_ + 16))) & 4294967295L) >= ((this._loadInt(((this._loadInt((_31_ + 28))) + 32))) & 4294967295L)) {
                                break label$7;
                            }
                            this._storeInt((_31_ + 8), (this._loadInt(((this._loadInt(((this._loadInt((_31_ + 28))) + 36))) + ((this._loadInt((_31_ + 16))) << 2)))));
                            label$8:
                            while (true) {
                                if ((this._storeInt((_31_ + 12), (this._loadInt((_31_ + 8))))) == 0) {
                                    break label$6;
                                }
                                this._storeInt((_31_ + 4), ((this._loadInt((this._loadInt((_31_ + 12))))) % (this._loadInt((_31_ + 20)))));
                                this._storeInt((_31_ + 8), (this._loadInt(((this._loadInt((_31_ + 12))) + 4))));
                                this._storeInt(((_30_ = this._loadInt((_31_ + 12))) + 4), (this._loadInt((_32_ = (this._loadInt((_31_ + 24))) + ((this._loadInt((_31_ + 4))) << 2)))));
                                this._storeInt(_32_, _30_);
                                continue label$8;
                            }
                        }
                        while (false);
                        sqlite3_free((this._loadInt(((this._loadInt((_31_ + 28))) + 36))));
                        this._storeInt(((_30_ = this._loadInt((_31_ + 28))) + 32), (this._loadInt((_31_ + 20))));
                        this._storeInt((_30_ + 36), (this._loadInt((_31_ + 24))));
                        break label$5;
                    }
                    while (false);
                    this._storeInt((_31_ + 16), ((this._loadInt((_31_ + 16))) + 1));
                    continue label$4;
                }
            }
            while (false);
        }
        while (false);
        _30_ = this._loadInt(((this._loadInt((_31_ + 28))) + 36));
        this._storeInt((0 + 4), (_31_ + 32));
        _temp$0 = 0;
        _temp$1 = 7;
        _temp$2 = (_30_ != 0) ? _temp$0 : _temp$1;
        return _temp$2;
    }

    @Override()
    public final void sqlite3BeginBenignMalloc()
    {
        label$0:
        do {
            if ((this._loadInt((0 + 22982))) == 0) {
                break label$0;
            }
            this._vTable[this._tableIndices[this._loadInt((0 + 22982))]].invoke();
        }
        while (false);
        return;
    }

    @Override()
    public final int pcache1AllocPage(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 4), (pcache1Alloc((this._storeInt((_31_ + 8), ((this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 4))) + 20))))))) == 0) {
                    break label$1;
                }
                this._storeInt(_31_, ((this._loadInt((_31_ + 4))) + (this._loadInt(((this._loadInt((_31_ + 12))) + 4)))));
                if ((this._loadInt(((this._loadInt((_31_ + 12))) + 8))) == 0) {
                    break label$0;
                }
                this._storeInt(((_30_ = this._loadInt((this._loadInt((_31_ + 12))))) + 16), ((this._loadInt((_30_ + 16))) + 1));
                break label$0;
            }
            while (false);
            this._storeInt(_31_, 0);
        }
        while (false);
        _30_ = this._loadInt(_31_);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void sqlite3EndBenignMalloc()
    {
        label$0:
        do {
            if ((this._loadInt((0 + 22986))) == 0) {
                break label$0;
            }
            this._vTable[this._tableIndices[this._loadInt((0 + 22986))]].invoke();
        }
        while (false);
        return;
    }

    @Override()
    public final int pcache1Alloc(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        _30_ = this._storeInt((_31_ + 8), 0);
        sqlite3StatusSet(7, (this._loadInt((_31_ + 12))));
        label$0:
        do {
            if ((this._loadInt((_31_ + 12))) > (this._loadInt((_30_ + 20632)))) {
                break label$0;
            }
            if ((this._storeInt((_31_ + 8), (this._loadInt((_30_ + 20660))))) == 0) {
                break label$0;
            }
            this._storeInt((0 + 20660), (this._loadInt((this._loadInt((0 + 20660))))));
            this._storeInt((0 + 20664), (((this._storeInt((0 + 20656), ((this._loadInt((0 + 20656))) + -1))) < (this._loadInt((0 + 20640)))) ? 1 : 0));
            sqlite3StatusAdd(1, 1);
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_31_ + 8))) != 0) {
                break label$1;
            }
            if ((this._storeInt((_31_ + 8), (sqlite3Malloc((this._loadInt((_31_ + 12))))))) == 0) {
                break label$1;
            }
            sqlite3StatusAdd(2, (this._storeInt((_31_ + 4), (sqlite3MallocSize((this._loadInt((_31_ + 8))))))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3HeapNearlyFull()
    {
        return (this._loadInt((0 + 20504)));
    }

    @Override()
    public final void sqlite3FuncDefInsert(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 16), (sqlite3Strlen30((this._loadInt(((this._storeInt((_32_ + 24), _31_)) + 24))))));
        this._storeInt8((_32_ + 15), (this._loadInt8u((this._loadInt(((this._loadInt((_32_ + 24))) + 24))))));
        _31_ = this._storeInt((_32_ + 8), (((this._loadInt8u(((this._loadInt8u((_32_ + 15))) + 19872))) + (this._loadInt((_32_ + 16)))) % 23));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 20), (functionSearch((this._loadInt((_32_ + 28))), _31_, (this._loadInt(((this._loadInt((_32_ + 24))) + 24))), (this._loadInt((_32_ + 16))))))) == 0) {
                    break label$1;
                }
                this._storeInt(((_31_ = this._loadInt((_32_ + 24))) + 8), (this._loadInt(((_30_ = this._loadInt((_32_ + 20))) + 8))));
                this._storeInt((_30_ + 8), _31_);
                break label$0;
            }
            while (false);
            this._storeInt(((_31_ = this._loadInt((_32_ + 24))) + 8), 0);
            this._storeInt((_31_ + 28), (this._loadInt(((this._loadInt((_32_ + 28))) + ((this._loadInt((_32_ + 8))) << 2)))));
            this._storeInt(((this._loadInt((_32_ + 28))) + ((this._loadInt((_32_ + 8))) << 2)), (this._loadInt((_32_ + 24))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void sqlite3RegisterDateTimeFunctions()
    {
        int _30_ = 0;
        this._storeInt(((_30_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), 20508);
        this._storeInt((_30_ + 4), 26560);
        this._storeInt((_30_ + 12), 0);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_30_ + 12))) > 7) {
                    break label$1;
                }
                sqlite3FuncDefInsert((this._loadInt((_30_ + 8))), ((this._loadInt((_30_ + 4))) + ((this._loadInt((_30_ + 12))) * 36)));
                this._storeInt((_30_ + 12), ((this._loadInt((_30_ + 12))) + 1));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_30_ + 16));
        return;
    }

    @Override()
    public final void sqlite3AlterFunctions()
    {
        int _30_ = 0;
        this._storeInt(((_30_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), 20508);
        this._storeInt((_30_ + 4), 24864);
        this._storeInt((_30_ + 12), 0);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_30_ + 12))) > 2) {
                    break label$1;
                }
                sqlite3FuncDefInsert((this._loadInt((_30_ + 8))), ((this._loadInt((_30_ + 4))) + ((this._loadInt((_30_ + 12))) * 36)));
                this._storeInt((_30_ + 12), ((this._loadInt((_30_ + 12))) + 1));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_30_ + 16));
        return;
    }

    @Override()
    public final void renameTableFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_33_ + 56), _31_);
        this._storeInt((_33_ + 48), (sqlite3_value_text((this._loadInt((this._storeInt((_33_ + 52), _32_)))))));
        this._storeInt((_33_ + 44), (sqlite3_value_text((this._loadInt(((this._loadInt((_33_ + 52))) + 4))))));
        this._storeInt((_33_ + 28), (this._loadInt((_33_ + 48))));
        this._storeInt((_33_ + 24), 0);
        this._storeInt((_33_ + 16), (sqlite3_context_db_handle((this._loadInt((_33_ + 60))))));
        label$0:
        do {
            if ((this._loadInt((_33_ + 48))) == 0) {
                break label$0;
            }
            label$1$end:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt8u((this._loadInt((_33_ + 28))))) == 0) {
                        break label$0;
                    }
                    this._storeInt((_33_ + 32), (this._loadInt((_33_ + 28))));
                    this._storeInt((_33_ + 36), (this._loadInt((_33_ + 24))));
                    label$3$end:
                    do {
                        label$3:
                        while (true) {
                            this._storeInt((_33_ + 24), (sqlite3GetToken((this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 24)))))), (_33_ + 40))));
                            if ((this._loadInt((_33_ + 40))) == 149) {
                                continue label$3;
                            }
                            break label$3$end;
                        }
                    }
                    while (false);
                    _32_ = 0;
                    label$5:
                    do {
                        if ((this._loadInt((_33_ + 40))) == 22) {
                            break label$5;
                        }
                        _32_ = ((this._loadInt((_33_ + 40))) != 121) ? 1 : 0;
                    }
                    while (false);
                    if (_32_ != 0) {
                        continue label$1;
                    }
                    break label$1$end;
                }
            }
            while (false);
            this._storeInt((_33_ + 8), (this._loadInt((_33_ + 44))));
            _32_ = this._loadInt((_33_ + 36));
            _31_ = this._storeInt((_33_ + 4), (this._loadInt((_33_ + 48))));
            this._storeInt((_33_ + 12), (_32_ + (_30_ = this._loadInt((_33_ + 32)))));
            _32_ = this._loadInt((_33_ + 16));
            this._storeInt(_33_, (_30_ - _31_));
            _32_ = this._storeInt((_33_ + 20), (sqlite3MPrintf(_32_, 26544, _33_)));
            sqlite3_result_text((this._loadInt((_33_ + 60))), _32_, -1, 14);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 64));
        return;
    }

    @Override()
    public final void renameTriggerFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 76), _30_);
        this._storeInt((_33_ + 72), _31_);
        this._storeInt((_33_ + 64), (sqlite3_value_text((this._loadInt((this._storeInt((_33_ + 68), _32_)))))));
        this._storeInt((_33_ + 60), (sqlite3_value_text((this._loadInt(((this._loadInt((_33_ + 68))) + 4))))));
        this._storeInt((_33_ + 44), 3);
        this._storeInt((_33_ + 40), (this._loadInt((_33_ + 64))));
        _31_ = this._storeInt((_33_ + 36), 0);
        this._storeInt((_33_ + 28), (sqlite3_context_db_handle((this._loadInt((_33_ + 76))))));
        label$0:
        do {
            if ((this._loadInt((_33_ + 64))) == 0) {
                break label$0;
            }
            label$1$end:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt8u((this._loadInt((_33_ + 40))))) == 0) {
                        break label$0;
                    }
                    this._storeInt((_33_ + 48), (this._loadInt((_33_ + 40))));
                    this._storeInt((_33_ + 52), (this._loadInt((_33_ + 36))));
                    label$3$end:
                    do {
                        label$3:
                        while (true) {
                            this._storeInt((_33_ + 36), (sqlite3GetToken((this._storeInt((_33_ + 40), ((this._loadInt((_33_ + 40))) + (this._loadInt((_33_ + 36)))))), (_33_ + 56))));
                            if ((this._loadInt((_33_ + 56))) == 149) {
                                continue label$3;
                            }
                            break label$3$end;
                        }
                    }
                    while (false);
                    this._storeInt((_33_ + 44), ((this._loadInt((_33_ + 44))) + 1));
                    label$5:
                    do {
                        label$6:
                        do {
                            if ((this._loadInt((_33_ + 56))) == 118) {
                                break label$6;
                            }
                            if ((this._loadInt((_33_ + 56))) != 104) {
                                break label$5;
                            }
                        }
                        while (false);
                        this._storeInt((_33_ + 44), _31_);
                    }
                    while (false);
                    _32_ = 1;
                    label$7:
                    do {
                        if ((this._loadInt((_33_ + 44))) != 2) {
                            break label$7;
                        }
                        _32_ = 0;
                        if ((this._loadInt((_33_ + 56))) == 135) {
                            break label$7;
                        }
                        if ((this._loadInt((_33_ + 56))) == 45) {
                            break label$7;
                        }
                        _32_ = ((this._loadInt((_33_ + 56))) != 5) ? 1 : 0;
                    }
                    while (false);
                    if (_32_ != 0) {
                        continue label$1;
                    }
                    break label$1$end;
                }
            }
            while (false);
            this._storeInt((_33_ + 8), (this._loadInt((_33_ + 60))));
            _32_ = this._loadInt((_33_ + 52));
            _31_ = this._storeInt((_33_ + 4), (this._loadInt((_33_ + 64))));
            this._storeInt((_33_ + 12), (_32_ + (_30_ = this._loadInt((_33_ + 48)))));
            _32_ = this._loadInt((_33_ + 28));
            this._storeInt(_33_, (_30_ - _31_));
            _32_ = this._storeInt((_33_ + 32), (sqlite3MPrintf(_32_, 26544, _33_)));
            sqlite3_result_text((this._loadInt((_33_ + 76))), _32_, -1, 14);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 80));
        return;
    }

    @Override()
    public final void renameParentFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _34_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 92), _30_);
        this._storeInt((_33_ + 88), _31_);
        this._storeInt((_33_ + 84), _32_);
        this._storeInt((_33_ + 80), (sqlite3_context_db_handle((this._loadInt((_33_ + 92))))));
        this._storeInt((_33_ + 76), 0);
        this._storeInt((_33_ + 68), (sqlite3_value_text((this._loadInt((this._loadInt((_33_ + 84))))))));
        this._storeInt((_33_ + 64), (sqlite3_value_text((this._loadInt(((this._loadInt((_33_ + 84))) + 4))))));
        this._storeInt((_33_ + 60), (sqlite3_value_text((this._loadInt(((this._loadInt((_33_ + 84))) + 8))))));
        this._storeInt((_33_ + 56), (this._loadInt((_33_ + 68))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt8u((this._loadInt((_33_ + 56))))) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 52), (sqlite3GetToken((this._loadInt((_33_ + 56))), (_33_ + 48))));
                label$2:
                do {
                    if ((this._loadInt((_33_ + 48))) != 102) {
                        break label$2;
                    }
                    label$3$end:
                    do {
                        label$3:
                        while (true) {
                            this._storeInt((_33_ + 52), (sqlite3GetToken((this._storeInt((_33_ + 56), ((this._loadInt((_33_ + 56))) + (this._loadInt((_33_ + 52)))))), (_33_ + 48))));
                            if ((this._loadInt((_33_ + 48))) == 149) {
                                continue label$3;
                            }
                            break label$3$end;
                        }
                    }
                    while (false);
                    if ((this._storeInt((_33_ + 44), (sqlite3DbStrNDup((this._loadInt((_33_ + 80))), (this._loadInt((_33_ + 56))), (this._loadInt((_33_ + 52))))))) == 0) {
                        break label$1;
                    }
                    sqlite3Dequote((this._loadInt((_33_ + 44))));
                    label$5:
                    do {
                        if ((sqlite3StrICmp((this._loadInt((_33_ + 64))), (this._loadInt((_33_ + 44))))) != 0) {
                            break label$5;
                        }
                        _32_ = 21392;
                        _31_ = this._loadInt((_33_ + 80));
                        label$6:
                        do {
                            if ((this._loadInt((_33_ + 76))) == 0) {
                                break label$6;
                            }
                            _32_ = this._loadInt((_33_ + 76));
                        }
                        while (false);
                        this._storeInt((_33_ + 28), (this._loadInt((_33_ + 60))));
                        _30_ = this._storeInt((_33_ + 24), (this._loadInt((_33_ + 68))));
                        _34_ = this._loadInt((_33_ + 56));
                        this._storeInt((_33_ + 16), _32_);
                        this._storeInt((_33_ + 20), (_34_ - _30_));
                        this._storeInt((_33_ + 40), (sqlite3MPrintf(_31_, 25072, (_33_ + 16))));
                        sqlite3DbFree((this._loadInt((_33_ + 80))), (this._loadInt((_33_ + 76))));
                        this._storeInt((_33_ + 76), (this._loadInt((_33_ + 40))));
                        this._storeInt((_33_ + 68), ((this._loadInt((_33_ + 56))) + (this._loadInt((_33_ + 52)))));
                    }
                    while (false);
                    sqlite3DbFree((this._loadInt((_33_ + 80))), (this._loadInt((_33_ + 44))));
                }
                while (false);
                this._storeInt((_33_ + 56), ((this._loadInt((_33_ + 56))) + (this._loadInt((_33_ + 52)))));
                continue label$0;
            }
        }
        while (false);
        _32_ = 21392;
        _31_ = this._loadInt((_33_ + 80));
        label$7:
        do {
            if ((this._loadInt((_33_ + 76))) == 0) {
                break label$7;
            }
            _32_ = this._loadInt((_33_ + 76));
        }
        while (false);
        this._storeInt((_33_ + 4), (this._loadInt((_33_ + 68))));
        this._storeInt(_33_, _32_);
        _32_ = this._storeInt((_33_ + 72), (sqlite3MPrintf(_31_, 25088, _33_)));
        sqlite3_result_text((this._loadInt((_33_ + 92))), _32_, -1, 14);
        sqlite3DbFree((this._loadInt((_33_ + 80))), (this._loadInt((_33_ + 76))));
        this._storeInt((0 + 4), (_33_ + 96));
        return;
    }

    @Override()
    public final int sqlite3_context_db_handle(int _30_)
    {
        return (this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 8)));
    }

    @Override()
    public final int sqlite3_value_text(int _30_)
    {
        int _31_ = 0;
        _30_ = sqlite3ValueText((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 1);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3GetToken(int _30_, int _31_)
    {
        int _32_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
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
                                                                                                                                                                    if (((_31_ = (this._loadInt8u((this._loadInt((_32_ + 24))))) + -9) & 4294967295L) > (117 & 4294967295L)) {
                                                                                                                                                                        break label$38;
                                                                                                                                                                    }
                                                                                                                                                                    label$39:
                                                                                                                                                                    do {
                                                                                                                                                                        label$40:
                                                                                                                                                                        do {
                                                                                                                                                                            label$41:
                                                                                                                                                                            do {
                                                                                                                                                                                switch (_31_) {
                                                                                                                                                                                    case 0:
                                                                                                                                                                                    case 1:
                                                                                                                                                                                    case 3:
                                                                                                                                                                                    case 4:
                                                                                                                                                                                    case 23: {
                                                                                                                                                                                        break label$41;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 2:
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
                                                                                                                                                                                    case 56:
                                                                                                                                                                                    case 57:
                                                                                                                                                                                    case 58:
                                                                                                                                                                                    case 59:
                                                                                                                                                                                    case 60:
                                                                                                                                                                                    case 61:
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
                                                                                                                                                                                    case 80:
                                                                                                                                                                                    case 81:
                                                                                                                                                                                    case 83:
                                                                                                                                                                                    case 84:
                                                                                                                                                                                    case 85:
                                                                                                                                                                                    case 86:
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
                                                                                                                                                                                    case 112:
                                                                                                                                                                                    case 113:
                                                                                                                                                                                    case 114:
                                                                                                                                                                                    case 116: {
                                                                                                                                                                                        break label$38;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 24: {
                                                                                                                                                                                        break label$36;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 25:
                                                                                                                                                                                    case 30:
                                                                                                                                                                                    case 87: {
                                                                                                                                                                                        break label$40;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 26: {
                                                                                                                                                                                        break label$35;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 27:
                                                                                                                                                                                    case 49:
                                                                                                                                                                                    case 55: {
                                                                                                                                                                                        break label$34;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 28: {
                                                                                                                                                                                        break label$33;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 29: {
                                                                                                                                                                                        break label$32;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 31: {
                                                                                                                                                                                        break label$31;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 32: {
                                                                                                                                                                                        break label$20;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 33: {
                                                                                                                                                                                        break label$30;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 34: {
                                                                                                                                                                                        break label$29;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 35: {
                                                                                                                                                                                        break label$28;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 36: {
                                                                                                                                                                                        break label$19;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 37: {
                                                                                                                                                                                        break label$27;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 38: {
                                                                                                                                                                                        break label$26;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 39:
                                                                                                                                                                                    case 40:
                                                                                                                                                                                    case 41:
                                                                                                                                                                                    case 42:
                                                                                                                                                                                    case 43:
                                                                                                                                                                                    case 44:
                                                                                                                                                                                    case 45:
                                                                                                                                                                                    case 46:
                                                                                                                                                                                    case 47:
                                                                                                                                                                                    case 48: {
                                                                                                                                                                                        break label$1;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 50: {
                                                                                                                                                                                        break label$25;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 51: {
                                                                                                                                                                                        break label$18;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 52: {
                                                                                                                                                                                        break label$17;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 53: {
                                                                                                                                                                                        break label$24;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 54: {
                                                                                                                                                                                        break label$23;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 79:
                                                                                                                                                                                    case 111: {
                                                                                                                                                                                        break label$39;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 82: {
                                                                                                                                                                                        break label$22;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 115: {
                                                                                                                                                                                        break label$21;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 117: {
                                                                                                                                                                                        break label$16;
                                                                                                                                                                                    }
                                                                                                                                                                                    default: {
                                                                                                                                                                                        break label$41;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            while (false);
                                                                                                                                                                            _31_ = this._storeInt((_32_ + 16), 1);
                                                                                                                                                                            label$43:
                                                                                                                                                                            do {
                                                                                                                                                                                label$42:
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    if (((this._loadInt8u(((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))) + 21776))) & _31_) == 0) {
                                                                                                                                                                                        break label$43;
                                                                                                                                                                                    }
                                                                                                                                                                                    this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + _31_));
                                                                                                                                                                                    continue label$42;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            while (false);
                                                                                                                                                                            this._storeInt((this._loadInt((_32_ + 20))), 149);
                                                                                                                                                                            this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
                                                                                                                                                                            break label$0;
                                                                                                                                                                        }
                                                                                                                                                                        while (false);
                                                                                                                                                                        this._storeInt((_32_ + 8), (this._loadInt8u((this._loadInt((_32_ + 24))))));
                                                                                                                                                                        _31_ = this._storeInt((_32_ + 16), 1);
                                                                                                                                                                        label$45:
                                                                                                                                                                        do {
                                                                                                                                                                            label$44:
                                                                                                                                                                            while (true) {
                                                                                                                                                                                if ((this._storeInt((_32_ + 12), (this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))))) == 0) {
                                                                                                                                                                                    break label$45;
                                                                                                                                                                                }
                                                                                                                                                                                label$46:
                                                                                                                                                                                do {
                                                                                                                                                                                    if ((this._loadInt((_32_ + 12))) != (this._loadInt((_32_ + 8)))) {
                                                                                                                                                                                        break label$46;
                                                                                                                                                                                    }
                                                                                                                                                                                    if ((this._loadInt8u((((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))) + _31_))) != (this._loadInt((_32_ + 8)))) {
                                                                                                                                                                                        break label$45;
                                                                                                                                                                                    }
                                                                                                                                                                                    this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + _31_));
                                                                                                                                                                                }
                                                                                                                                                                                while (false);
                                                                                                                                                                                this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + _31_));
                                                                                                                                                                                continue label$44;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        while (false);
                                                                                                                                                                        if ((this._loadInt((_32_ + 12))) != 39) {
                                                                                                                                                                            break label$37;
                                                                                                                                                                        }
                                                                                                                                                                        this._storeInt((this._loadInt((_32_ + 20))), 94);
                                                                                                                                                                        this._storeInt((_32_ + 28), ((this._loadInt((_32_ + 16))) + 1));
                                                                                                                                                                        break label$0;
                                                                                                                                                                    }
                                                                                                                                                                    while (false);
                                                                                                                                                                    if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 1))) != 39) {
                                                                                                                                                                        break label$38;
                                                                                                                                                                    }
                                                                                                                                                                    this._storeInt((this._loadInt((_32_ + 20))), 131);
                                                                                                                                                                    this._storeInt((_32_ + 16), 2);
                                                                                                                                                                    label$48:
                                                                                                                                                                    do {
                                                                                                                                                                        label$47:
                                                                                                                                                                        while (true) {
                                                                                                                                                                            if (((this._loadInt8u(((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))) + 21776))) & 8) == 0) {
                                                                                                                                                                                break label$48;
                                                                                                                                                                            }
                                                                                                                                                                            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                                                                                                                                                                            continue label$47;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    while (false);
                                                                                                                                                                    label$49:
                                                                                                                                                                    do {
                                                                                                                                                                        label$50:
                                                                                                                                                                        do {
                                                                                                                                                                            if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))) != 39) {
                                                                                                                                                                                break label$50;
                                                                                                                                                                            }
                                                                                                                                                                            if (((this._loadInt((_32_ + 16))) % 2) == 0) {
                                                                                                                                                                                break label$49;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        while (false);
                                                                                                                                                                        this._storeInt((this._loadInt((_32_ + 20))), 148);
                                                                                                                                                                        label$52:
                                                                                                                                                                        do {
                                                                                                                                                                            label$51:
                                                                                                                                                                            while (true) {
                                                                                                                                                                                _31_ = 0;
                                                                                                                                                                                label$53:
                                                                                                                                                                                do {
                                                                                                                                                                                    if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))) == 0) {
                                                                                                                                                                                        break label$53;
                                                                                                                                                                                    }
                                                                                                                                                                                    _31_ = ((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))) != 39) ? 1 : 0;
                                                                                                                                                                                }
                                                                                                                                                                                while (false);
                                                                                                                                                                                if (_31_ == 0) {
                                                                                                                                                                                    break label$52;
                                                                                                                                                                                }
                                                                                                                                                                                this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                                                                                                                                                                                continue label$51;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        while (false);
                                                                                                                                                                    }
                                                                                                                                                                    while (false);
                                                                                                                                                                    label$54:
                                                                                                                                                                    do {
                                                                                                                                                                        if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))) == 0) {
                                                                                                                                                                            break label$54;
                                                                                                                                                                        }
                                                                                                                                                                        this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                                                                                                                                                                    }
                                                                                                                                                                    while (false);
                                                                                                                                                                    this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
                                                                                                                                                                    break label$0;
                                                                                                                                                                }
                                                                                                                                                                while (false);
                                                                                                                                                                if (((this._loadInt8u(((this._loadInt8u((this._loadInt((_32_ + 24))))) + 21776))) & 70) == 0) {
                                                                                                                                                                    break label$15;
                                                                                                                                                                }
                                                                                                                                                                _31_ = this._storeInt((_32_ + 16), 1);
                                                                                                                                                                label$56:
                                                                                                                                                                do {
                                                                                                                                                                    label$55:
                                                                                                                                                                    while (true) {
                                                                                                                                                                        if (((this._loadInt8u(((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))) + 21776))) & 70) == 0) {
                                                                                                                                                                            break label$56;
                                                                                                                                                                        }
                                                                                                                                                                        this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + _31_));
                                                                                                                                                                        continue label$55;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                while (false);
                                                                                                                                                                _31_ = keywordCode((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 16))));
                                                                                                                                                                this._storeInt((this._loadInt((_32_ + 20))), _31_);
                                                                                                                                                                this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
                                                                                                                                                                break label$0;
                                                                                                                                                            }
                                                                                                                                                            while (false);
                                                                                                                                                            if ((this._loadInt((_32_ + 12))) == 0) {
                                                                                                                                                                break label$13;
                                                                                                                                                            }
                                                                                                                                                            this._storeInt((this._loadInt((_32_ + 20))), 26);
                                                                                                                                                            this._storeInt((_32_ + 28), ((this._loadInt((_32_ + 16))) + 1));
                                                                                                                                                            break label$0;
                                                                                                                                                        }
                                                                                                                                                        while (false);
                                                                                                                                                        if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 1))) == 61) {
                                                                                                                                                            break label$12;
                                                                                                                                                        }
                                                                                                                                                        this._storeInt((this._loadInt((_32_ + 20))), 148);
                                                                                                                                                        this._storeInt((_32_ + 28), 2);
                                                                                                                                                        break label$0;
                                                                                                                                                    }
                                                                                                                                                    while (false);
                                                                                                                                                    _31_ = this._storeInt((_32_ + 16), 1);
                                                                                                                                                    label$58:
                                                                                                                                                    do {
                                                                                                                                                        label$57:
                                                                                                                                                        while (true) {
                                                                                                                                                            if (((this._loadInt8u(((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))) + 21776))) & 4) == 0) {
                                                                                                                                                                break label$58;
                                                                                                                                                            }
                                                                                                                                                            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + _31_));
                                                                                                                                                            continue label$57;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    while (false);
                                                                                                                                                    if ((this._loadInt((_32_ + 16))) < 2) {
                                                                                                                                                        break label$34;
                                                                                                                                                    }
                                                                                                                                                    this._storeInt((this._loadInt((_32_ + 20))), 132);
                                                                                                                                                    this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
                                                                                                                                                    break label$0;
                                                                                                                                                }
                                                                                                                                                while (false);
                                                                                                                                                this._storeInt((_32_ + 4), 0);
                                                                                                                                                this._storeInt((this._loadInt((_32_ + 20))), 133);
                                                                                                                                                _31_ = this._storeInt((_32_ + 16), 1);
                                                                                                                                                label$59:
                                                                                                                                                while (true) {
                                                                                                                                                    if ((this._storeInt((_32_ + 12), (this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))))) == 0) {
                                                                                                                                                        break label$3;
                                                                                                                                                    }
                                                                                                                                                    label$61:
                                                                                                                                                    do {
                                                                                                                                                        label$62:
                                                                                                                                                        do {
                                                                                                                                                            if (((this._loadInt8u(((this._loadInt8u((_32_ + 12))) + 21776))) & 70) == 0) {
                                                                                                                                                                break label$62;
                                                                                                                                                            }
                                                                                                                                                            this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + _31_));
                                                                                                                                                            break label$61;
                                                                                                                                                        }
                                                                                                                                                        while (false);
                                                                                                                                                        label$63:
                                                                                                                                                        do {
                                                                                                                                                            if ((this._loadInt((_32_ + 12))) != 40) {
                                                                                                                                                                break label$63;
                                                                                                                                                            }
                                                                                                                                                            if ((this._loadInt((_32_ + 4))) >= _31_) {
                                                                                                                                                                break label$7;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        while (false);
                                                                                                                                                        if ((this._loadInt((_32_ + 12))) != 58) {
                                                                                                                                                            break label$3;
                                                                                                                                                        }
                                                                                                                                                        if ((this._loadInt8u((((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))) + _31_))) != 58) {
                                                                                                                                                            break label$3;
                                                                                                                                                        }
                                                                                                                                                        this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + _31_));
                                                                                                                                                    }
                                                                                                                                                    while (false);
                                                                                                                                                    this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + _31_));
                                                                                                                                                    continue label$59;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            while (false);
                                                                                                                                            this._storeInt((this._loadInt((_32_ + 20))), 90);
                                                                                                                                            this._storeInt((_32_ + 28), 1);
                                                                                                                                            break label$0;
                                                                                                                                        }
                                                                                                                                        while (false);
                                                                                                                                        this._storeInt((this._loadInt((_32_ + 20))), 82);
                                                                                                                                        this._storeInt((_32_ + 28), 1);
                                                                                                                                        break label$0;
                                                                                                                                    }
                                                                                                                                    while (false);
                                                                                                                                    this._storeInt((this._loadInt((_32_ + 20))), 22);
                                                                                                                                    this._storeInt((_32_ + 28), 1);
                                                                                                                                    break label$0;
                                                                                                                                }
                                                                                                                                while (false);
                                                                                                                                this._storeInt((this._loadInt((_32_ + 20))), 88);
                                                                                                                                this._storeInt((_32_ + 28), 1);
                                                                                                                                break label$0;
                                                                                                                            }
                                                                                                                            while (false);
                                                                                                                            this._storeInt((this._loadInt((_32_ + 20))), 86);
                                                                                                                            this._storeInt((_32_ + 28), 1);
                                                                                                                            break label$0;
                                                                                                                        }
                                                                                                                        while (false);
                                                                                                                        this._storeInt((this._loadInt((_32_ + 20))), 25);
                                                                                                                        this._storeInt((_32_ + 28), 1);
                                                                                                                        break label$0;
                                                                                                                    }
                                                                                                                    while (false);
                                                                                                                    if (((this._loadInt8u(((this._loadInt8u(((this._loadInt((_32_ + 24))) + 1))) + 21776))) & 4) != 0) {
                                                                                                                        break label$1;
                                                                                                                    }
                                                                                                                    this._storeInt((this._loadInt((_32_ + 20))), 118);
                                                                                                                    this._storeInt((_32_ + 28), 1);
                                                                                                                    break label$0;
                                                                                                                }
                                                                                                                while (false);
                                                                                                                if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 1))) != 42) {
                                                                                                                    break label$14;
                                                                                                                }
                                                                                                                if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 2))) == 0) {
                                                                                                                    break label$14;
                                                                                                                }
                                                                                                                this._storeInt((_32_ + 16), 3);
                                                                                                                this._storeInt((_32_ + 12), (this._loadInt8u(((this._loadInt((_32_ + 24))) + 2))));
                                                                                                                label$65:
                                                                                                                do {
                                                                                                                    label$64:
                                                                                                                    while (true) {
                                                                                                                        label$66:
                                                                                                                        do {
                                                                                                                            label$67:
                                                                                                                            do {
                                                                                                                                if ((this._loadInt((_32_ + 12))) != 42) {
                                                                                                                                    break label$67;
                                                                                                                                }
                                                                                                                                _31_ = 0;
                                                                                                                                if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))) == 47) {
                                                                                                                                    break label$66;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            while (false);
                                                                                                                            _31_ = ((this._storeInt((_32_ + 12), (this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))))) != 0) ? 1 : 0;
                                                                                                                        }
                                                                                                                        while (false);
                                                                                                                        if (_31_ == 0) {
                                                                                                                            break label$65;
                                                                                                                        }
                                                                                                                        this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                                                                                                                        continue label$64;
                                                                                                                    }
                                                                                                                }
                                                                                                                while (false);
                                                                                                                label$68:
                                                                                                                do {
                                                                                                                    if ((this._loadInt((_32_ + 12))) == 0) {
                                                                                                                        break label$68;
                                                                                                                    }
                                                                                                                    this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                                                                                                                }
                                                                                                                while (false);
                                                                                                                this._storeInt((this._loadInt((_32_ + 20))), 149);
                                                                                                                this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
                                                                                                                break label$0;
                                                                                                            }
                                                                                                            while (false);
                                                                                                            this._storeInt((_32_ + 28), (this._storeInt((this._loadInt((_32_ + 20))), 1)));
                                                                                                            break label$0;
                                                                                                        }
                                                                                                        while (false);
                                                                                                        if ((this._storeInt((_32_ + 12), (this._loadInt8u(((this._loadInt((_32_ + 24))) + 1))))) != 61) {
                                                                                                            break label$11;
                                                                                                        }
                                                                                                        this._storeInt((this._loadInt((_32_ + 20))), 80);
                                                                                                        this._storeInt((_32_ + 28), 2);
                                                                                                        break label$0;
                                                                                                    }
                                                                                                    while (false);
                                                                                                    this._storeInt((this._loadInt((_32_ + 20))), 133);
                                                                                                    _31_ = this._storeInt((_32_ + 16), 1);
                                                                                                    label$70:
                                                                                                    do {
                                                                                                        label$69:
                                                                                                        while (true) {
                                                                                                            if (((this._loadInt8u(((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))) + 21776))) & 4) == 0) {
                                                                                                                break label$70;
                                                                                                            }
                                                                                                            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + _31_));
                                                                                                            continue label$69;
                                                                                                        }
                                                                                                    }
                                                                                                    while (false);
                                                                                                    this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
                                                                                                    break label$0;
                                                                                                }
                                                                                                while (false);
                                                                                                _30_ = this._storeInt((_32_ + 16), 1);
                                                                                                this._storeInt((_32_ + 12), (this._loadInt8u((this._loadInt((_32_ + 24))))));
                                                                                                label$72:
                                                                                                do {
                                                                                                    label$71:
                                                                                                    while (true) {
                                                                                                        _31_ = 0;
                                                                                                        label$73:
                                                                                                        do {
                                                                                                            if ((this._loadInt((_32_ + 12))) == 93) {
                                                                                                                break label$73;
                                                                                                            }
                                                                                                            _31_ = ((this._storeInt((_32_ + 12), (this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))))) != 0) ? 1 : 0;
                                                                                                        }
                                                                                                        while (false);
                                                                                                        if (_31_ == 0) {
                                                                                                            break label$72;
                                                                                                        }
                                                                                                        this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + _30_));
                                                                                                        continue label$71;
                                                                                                    }
                                                                                                }
                                                                                                while (false);
                                                                                                _temp$0 = 26;
                                                                                                _temp$1 = 148;
                                                                                                _temp$2 = ((this._loadInt((_32_ + 12))) == 93) ? _temp$0 : _temp$1;
                                                                                                this._storeInt((this._loadInt((_32_ + 20))), _temp$2);
                                                                                                this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
                                                                                                break label$0;
                                                                                            }
                                                                                            while (false);
                                                                                            if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 1))) == 124) {
                                                                                                break label$10;
                                                                                            }
                                                                                            this._storeInt((this._loadInt((_32_ + 20))), 83);
                                                                                            this._storeInt((_32_ + 28), 1);
                                                                                            break label$0;
                                                                                        }
                                                                                        while (false);
                                                                                        this._storeInt((this._loadInt((_32_ + 20))), 23);
                                                                                        this._storeInt((_32_ + 28), 1);
                                                                                        break label$0;
                                                                                    }
                                                                                    while (false);
                                                                                    if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 1))) != 45) {
                                                                                        break label$9;
                                                                                    }
                                                                                    this._storeInt((_32_ + 16), 2);
                                                                                    label$75:
                                                                                    do {
                                                                                        label$74:
                                                                                        while (true) {
                                                                                            _31_ = 0;
                                                                                            label$76:
                                                                                            do {
                                                                                                if ((this._storeInt((_32_ + 12), (this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))))) == 0) {
                                                                                                    break label$76;
                                                                                                }
                                                                                                _31_ = ((this._loadInt((_32_ + 12))) != 10) ? 1 : 0;
                                                                                            }
                                                                                            while (false);
                                                                                            if (_31_ == 0) {
                                                                                                break label$75;
                                                                                            }
                                                                                            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                                                                                            continue label$74;
                                                                                        }
                                                                                    }
                                                                                    while (false);
                                                                                    this._storeInt((this._loadInt((_32_ + 20))), 149);
                                                                                    this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
                                                                                    break label$0;
                                                                                }
                                                                                while (false);
                                                                                if ((this._storeInt((_32_ + 12), (this._loadInt8u(((this._loadInt((_32_ + 24))) + 1))))) != 61) {
                                                                                    break label$8;
                                                                                }
                                                                                this._storeInt((this._loadInt((_32_ + 20))), 78);
                                                                                this._storeInt((_32_ + 28), 2);
                                                                                break label$0;
                                                                            }
                                                                            while (false);
                                                                            this._storeInt((this._loadInt((_32_ + 20))), 76);
                                                                            this._storeInt((_32_ + 28), ((((this._loadInt8u(((this._loadInt((_32_ + 24))) + 1))) == 61) ? 1 : 0) + 1));
                                                                            break label$0;
                                                                        }
                                                                        while (false);
                                                                        this._storeInt((this._loadInt((_32_ + 20))), 93);
                                                                        this._storeInt((_32_ + 28), 1);
                                                                        break label$0;
                                                                    }
                                                                    while (false);
                                                                    this._storeInt((this._loadInt((_32_ + 20))), 148);
                                                                    this._storeInt((_32_ + 28), 1);
                                                                    break label$0;
                                                                }
                                                                while (false);
                                                                this._storeInt((this._loadInt((_32_ + 20))), 89);
                                                                this._storeInt((_32_ + 28), 1);
                                                                break label$0;
                                                            }
                                                            while (false);
                                                            this._storeInt((this._loadInt((_32_ + 20))), 148);
                                                            this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
                                                            break label$0;
                                                        }
                                                        while (false);
                                                        this._storeInt((this._loadInt((_32_ + 20))), 75);
                                                        this._storeInt((_32_ + 28), 2);
                                                        break label$0;
                                                    }
                                                    while (false);
                                                    if ((this._loadInt((_32_ + 12))) != 62) {
                                                        break label$6;
                                                    }
                                                    this._storeInt((this._loadInt((_32_ + 20))), 85);
                                                    this._storeInt((_32_ + 28), 2);
                                                    break label$0;
                                                }
                                                while (false);
                                                this._storeInt((this._loadInt((_32_ + 20))), 91);
                                                this._storeInt((_32_ + 28), 2);
                                                break label$0;
                                            }
                                            while (false);
                                            this._storeInt((this._loadInt((_32_ + 20))), 87);
                                            this._storeInt((_32_ + 28), 1);
                                            break label$0;
                                        }
                                        while (false);
                                        if ((this._loadInt((_32_ + 12))) != 62) {
                                            break label$5;
                                        }
                                        this._storeInt((this._loadInt((_32_ + 20))), 75);
                                        this._storeInt((_32_ + 28), 2);
                                        break label$0;
                                    }
                                    while (false);
                                    label$77$end:
                                    do {
                                        label$77:
                                        while (true) {
                                            _31_ = 0;
                                            label$79:
                                            do {
                                                if ((this._storeInt((_32_ + 12), (this._loadInt8u(((this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1))) + (this._loadInt((_32_ + 24)))))))) == 0) {
                                                    break label$79;
                                                }
                                                if (((this._loadInt8u(((this._loadInt8u((_32_ + 12))) + 21776))) & 1) != 0) {
                                                    break label$79;
                                                }
                                                _31_ = ((this._loadInt((_32_ + 12))) != 41) ? 1 : 0;
                                            }
                                            while (false);
                                            if (_31_ != 0) {
                                                continue label$77;
                                            }
                                            break label$77$end;
                                        }
                                    }
                                    while (false);
                                    if ((this._loadInt((_32_ + 12))) != 41) {
                                        break label$4;
                                    }
                                    this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                                    break label$3;
                                }
                                while (false);
                                this._storeInt((this._loadInt((_32_ + 20))), 77);
                                this._storeInt((_32_ + 28), 1);
                                break label$0;
                            }
                            while (false);
                            if ((this._loadInt((_32_ + 12))) != 60) {
                                break label$2;
                            }
                            this._storeInt((this._loadInt((_32_ + 20))), 84);
                            this._storeInt((_32_ + 28), 2);
                            break label$0;
                        }
                        while (false);
                        this._storeInt((this._loadInt((_32_ + 20))), 148);
                    }
                    while (false);
                    label$80:
                    do {
                        if ((this._loadInt((_32_ + 4))) != 0) {
                            break label$80;
                        }
                        this._storeInt((this._loadInt((_32_ + 20))), 148);
                    }
                    while (false);
                    this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
                    break label$0;
                }
                while (false);
                this._storeInt((this._loadInt((_32_ + 20))), 79);
                this._storeInt((_32_ + 28), 1);
                break label$0;
            }
            while (false);
            this._storeInt((this._loadInt((_32_ + 20))), 129);
            this._storeInt((_32_ + 16), 0);
            label$82:
            do {
                label$81:
                while (true) {
                    if (((this._loadInt8u(((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))) + 21776))) & 4) == 0) {
                        break label$82;
                    }
                    this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                    continue label$81;
                }
            }
            while (false);
            label$83:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))) != 46) {
                    break label$83;
                }
                this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                label$85:
                do {
                    label$84:
                    while (true) {
                        if (((this._loadInt8u(((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))) + 21776))) & 4) == 0) {
                            break label$85;
                        }
                        this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                        continue label$84;
                    }
                }
                while (false);
                this._storeInt((this._loadInt((_32_ + 20))), 130);
            }
            while (false);
            label$86:
            do {
                label$87:
                do {
                    if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))) == 101) {
                        break label$87;
                    }
                    if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))) != 69) {
                        break label$86;
                    }
                }
                while (false);
                label$88:
                do {
                    if (((this._loadInt8u(((this._loadInt8u((((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))) + 1))) + 21776))) & 4) != 0) {
                        break label$88;
                    }
                    label$89:
                    do {
                        if ((this._loadInt8u((((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))) + 1))) == 43) {
                            break label$89;
                        }
                        if ((this._loadInt8u((((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))) + 1))) != 45) {
                            break label$86;
                        }
                    }
                    while (false);
                    if (((this._loadInt8u(((this._loadInt8u((((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))) + 2))) + 21776))) & 4) == 0) {
                        break label$86;
                    }
                }
                while (false);
                this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 2));
                label$91:
                do {
                    label$90:
                    while (true) {
                        if (((this._loadInt8u(((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))) + 21776))) & 4) == 0) {
                            break label$91;
                        }
                        this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                        continue label$90;
                    }
                }
                while (false);
                this._storeInt((this._loadInt((_32_ + 20))), 130);
            }
            while (false);
            label$93:
            do {
                label$92:
                while (true) {
                    if (((this._loadInt8u(((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 16)))))) + 21776))) & 70) == 0) {
                        break label$93;
                    }
                    this._storeInt((this._loadInt((_32_ + 20))), 148);
                    this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                    continue label$92;
                }
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
    public final int sqlite3DbStrNDup(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_33_ + 20))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._storeInt((_33_ + 12), (sqlite3DbMallocRaw((this._loadInt((_33_ + 24))), ((this._loadInt((_33_ + 16))) + 1))))) == 0) {
                        break label$2;
                    }
                    memcpy((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))));
                    this._storeInt8(((this._loadInt((_33_ + 12))) + (this._loadInt((_33_ + 16)))), 0);
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
    public final int sqlite3Dequote(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        int _33_ = 0;
        int _34_ = 0;
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeInt(((_34_ = (this._loadInt((0 + 4))) - 32) + 24), _30_)) == 0) {
                            break label$3;
                        }
                        this._storeInt8((_34_ + 23), (this._loadInt8u((this._loadInt((_34_ + 24))))));
                        if ((_30_ = this._loadInt8s((_34_ + 23))) > 90) {
                            break label$2;
                        }
                        if (_30_ == 34) {
                            break label$1;
                        }
                        if (_30_ == 39) {
                            break label$1;
                        }
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_34_ + 28), -1);
                    return (this._loadInt((_34_ + 28)));
                }
                while (false);
                if (_30_ == 96) {
                    break label$1;
                }
                if (_30_ != 91) {
                    break label$0;
                }
                this._storeInt8((_34_ + 23), 93);
            }
            while (false);
            _30_ = this._storeInt((_34_ + 16), 1);
            this._storeInt((_34_ + 12), 0);
            label$5:
            do {
                label$4:
                while (true) {
                    if ((this._loadInt8u(((this._loadInt((_34_ + 24))) + (this._loadInt((_34_ + 16)))))) == 0) {
                        break label$5;
                    }
                    label$6:
                    do {
                        label$7:
                        do {
                            if ((this._loadInt8s(((this._loadInt((_34_ + 24))) + (this._loadInt((_34_ + 16)))))) != (this._loadInt8s((_34_ + 23)))) {
                                break label$7;
                            }
                            if ((this._loadInt8s((((this._loadInt((_34_ + 24))) + (this._loadInt((_34_ + 16)))) + _30_))) != (this._loadInt8s((_34_ + 23)))) {
                                break label$5;
                            }
                            _32_ = this._loadInt8u((_34_ + 23));
                            this._storeInt((_34_ + 12), ((_33_ = this._loadInt((_34_ + 12))) + _30_));
                            this._storeInt8((_33_ + (this._loadInt((_34_ + 24)))), _32_);
                            this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) + _30_));
                            break label$6;
                        }
                        while (false);
                        _32_ = this._loadInt((_34_ + 24));
                        _33_ = this._loadInt((_34_ + 16));
                        this._storeInt((_34_ + 12), ((_31_ = this._loadInt((_34_ + 12))) + _30_));
                        this._storeInt8((_31_ + (this._loadInt((_34_ + 24)))), (this._loadInt8u((_32_ + _33_))));
                    }
                    while (false);
                    this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) + _30_));
                    continue label$4;
                }
            }
            while (false);
            this._storeInt8(((this._loadInt((_34_ + 24))) + (_30_ = this._loadInt((_34_ + 12)))), 0);
            this._storeInt((_34_ + 28), _30_);
            return (this._loadInt((_34_ + 28)));
        }
        while (false);
        this._storeInt((_34_ + 28), -1);
        return (this._loadInt((_34_ + 28)));
    }

    @Override()
    public final int sqlite3StrICmp(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), (this._loadInt((_32_ + 12))));
        this._storeInt(_32_, (this._loadInt((_32_ + 8))));
        label$1:
        do {
            label$0:
            while (true) {
                _31_ = 0;
                label$2:
                do {
                    if ((this._loadInt8u((this._loadInt((_32_ + 4))))) == 0) {
                        break label$2;
                    }
                    _31_ = ((this._loadInt8u(((this._loadInt8u((this._loadInt((_32_ + 4))))) + 19872))) == (this._loadInt8u(((this._loadInt8u((this._loadInt(_32_)))) + 19872)))) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                this._storeInt(_32_, ((this._loadInt(_32_)) + 1));
                continue label$0;
            }
        }
        while (false);
        return ((this._loadInt8u(((this._loadInt8u((this._loadInt((_32_ + 4))))) + 19872))) - (this._loadInt8u(((this._loadInt8u((this._loadInt(_32_)))) + 19872))));
    }

    @Override()
    public final int sqlite3MPrintf(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        _31_ = this._storeInt((_33_ + 4), _32_);
        _31_ = this._storeInt(_33_, (sqlite3VMPrintf((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _31_)));
        this._storeInt((0 + 4), (_33_ + 16));
        return _31_;
    }

    @Override()
    public final void sqlite3DbFree(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_32_ + 12))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt(((this._loadInt((_32_ + 12))) + 504))) == 0) {
                        break label$2;
                    }
                    _31_ = sqlite3DbMallocSize((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))));
                    this._storeInt((_30_ = this._loadInt(((this._loadInt((_32_ + 12))) + 504))), (_31_ + (this._loadInt(_30_))));
                    break label$0;
                }
                while (false);
                if ((isLookaside((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ = this._storeInt((_32_ + 4), (this._loadInt((_32_ + 8))))), (this._loadInt((_30_ = (this._loadInt((_32_ + 12))) + 256))));
                this._storeInt(_30_, _31_);
                this._storeInt((_31_ = (this._loadInt((_32_ + 12))) + 236), ((this._loadInt(_31_)) + -1));
                break label$0;
            }
            while (false);
            sqlite3_free((this._loadInt((_32_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3_result_text(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        setResultStrOrError((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))), 1, _33_);
        this._storeInt((0 + 4), (_34_ + 16));
        return;
    }

    @Override()
    public final void setResultStrOrError(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt8((_35_ + 19), _33_);
        this._storeInt((_35_ + 12), _34_);
        label$0:
        do {
            if ((sqlite3VdbeMemSetStr(((this._loadInt((_35_ + 28))) + 8), (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), (this._loadInt8u((_35_ + 19))), _34_)) != 18) {
                break label$0;
            }
            sqlite3_result_error_toobig((this._loadInt((_35_ + 28))));
        }
        while (false);
        this._storeInt((0 + 4), (_35_ + 32));
        return;
    }

    @Override()
    public final int sqlite3VdbeMemSetStr(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
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
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_35_ + 36), _31_);
        this._storeInt((_35_ + 32), _32_);
        this._storeInt8((_35_ + 31), _33_);
        this._storeInt((_35_ + 24), _34_);
        this._storeInt((_35_ + 20), (this._loadInt((_35_ + 32))));
        _34_ = this._storeInt16((_35_ + 14), 0);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_35_ + 36))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt((this._loadInt((_35_ + 40))))) == 0) {
                            break label$2;
                        }
                        this._storeInt((_35_ + 16), (this._loadInt(((this._loadInt((this._loadInt((_35_ + 40))))) + 72))));
                        break label$1;
                    }
                    while (false);
                    sqlite3VdbeMemSetNull((this._loadInt((_35_ + 40))));
                    this._storeInt((_35_ + 44), _34_);
                    break label$0;
                }
                while (false);
                this._storeInt((_35_ + 16), 1000000000);
            }
            while (false);
            _temp$0 = 2;
            _temp$1 = 16;
            _temp$2 = ((this._loadInt8u((_35_ + 31))) != 0) ? _temp$0 : _temp$1;
            this._storeInt16((_35_ + 14), _temp$2);
            label$4:
            do {
                if ((this._loadInt((_35_ + 20))) > -1) {
                    break label$4;
                }
                label$5:
                do {
                    label$6:
                    do {
                        if ((this._loadInt8u((_35_ + 31))) != 1) {
                            break label$6;
                        }
                        _33_ = this._storeInt((_35_ + 20), 0);
                        label$7:
                        while (true) {
                            _34_ = 0;
                            label$9:
                            do {
                                if ((this._loadInt((_35_ + 20))) > (this._loadInt((_35_ + 16)))) {
                                    break label$9;
                                }
                                _34_ = ((this._loadInt8s(((this._loadInt((_35_ + 36))) + (this._loadInt((_35_ + 20)))))) != _33_) ? 1 : 0;
                            }
                            while (false);
                            if (_34_ == 0) {
                                break label$5;
                            }
                            this._storeInt((_35_ + 20), ((this._loadInt((_35_ + 20))) + 1));
                            continue label$7;
                        }
                    }
                    while (false);
                    _33_ = this._storeInt((_35_ + 20), 0);
                    label$11:
                    do {
                        label$10:
                        while (true) {
                            _34_ = 0;
                            label$12:
                            do {
                                if ((this._loadInt((_35_ + 20))) > (this._loadInt((_35_ + 16)))) {
                                    break label$12;
                                }
                                _34_ = ((((this._loadInt8u((_34_ = (this._loadInt((_35_ + 36))) + (this._loadInt((_35_ + 20)))))) | (this._loadInt8u((_34_ + 1)))) & 255) != _33_) ? 1 : 0;
                            }
                            while (false);
                            if (_34_ == 0) {
                                break label$11;
                            }
                            this._storeInt((_35_ + 20), ((this._loadInt((_35_ + 20))) + 2));
                            continue label$10;
                        }
                    }
                    while (false);
                }
                while (false);
                this._storeInt16((_35_ + 14), ((this._loadInt16u((_35_ + 14))) | 512));
            }
            while (false);
            label$13:
            do {
                label$14:
                do {
                    label$15:
                    do {
                        label$16:
                        do {
                            if ((this._loadInt((_35_ + 24))) == -1) {
                                break label$16;
                            }
                            if ((this._loadInt((_35_ + 24))) == 14) {
                                break label$15;
                            }
                            sqlite3VdbeMemRelease((this._loadInt((_35_ + 40))));
                            _33_ = this._storeInt(((_34_ = this._loadInt((_35_ + 40))) + 32), (this._loadInt((_35_ + 24))));
                            this._storeInt((_34_ + 4), (this._loadInt((_35_ + 36))));
                            _temp$3 = 1024;
                            _temp$4 = 2048;
                            _temp$5 = (_33_ != 0) ? _temp$3 : _temp$4;
                            _temp$5 = (this._loadInt16u((_35_ + 14))) | _temp$5;
                            this._storeInt16((_35_ + 14), _temp$5);
                            break label$13;
                        }
                        while (false);
                        this._storeInt((_35_ + 8), (this._loadInt((_35_ + 20))));
                        label$17:
                        do {
                            if (((this._loadInt16u((_35_ + 14))) & 512) == 0) {
                                break label$17;
                            }
                            _temp$6 = 1;
                            _temp$7 = 2;
                            _temp$8 = ((this._loadInt8u((_35_ + 31))) == 1) ? _temp$6 : _temp$7;
                            _temp$8 = (this._loadInt((_35_ + 8))) + _temp$8;
                            this._storeInt((_35_ + 8), _temp$8);
                        }
                        while (false);
                        if ((this._loadInt((_35_ + 20))) <= (this._loadInt((_35_ + 16)))) {
                            break label$14;
                        }
                        this._storeInt((_35_ + 44), 18);
                        break label$0;
                    }
                    while (false);
                    sqlite3VdbeMemRelease((this._loadInt((_35_ + 40))));
                    this._storeInt(((_34_ = this._loadInt((_35_ + 40))) + 4), (this._storeInt((_34_ + 36), (this._loadInt((_35_ + 36))))));
                    this._storeInt((_34_ + 32), 0);
                    break label$13;
                }
                while (false);
                label$18:
                do {
                    if ((sqlite3VdbeMemGrow((this._loadInt((_35_ + 40))), (this._loadInt((_35_ + 8))), 0)) == 0) {
                        break label$18;
                    }
                    this._storeInt((_35_ + 44), 7);
                    break label$0;
                }
                while (false);
                memcpy((this._loadInt(((this._loadInt((_35_ + 40))) + 4))), (this._loadInt((_35_ + 36))), (this._loadInt((_35_ + 8))));
            }
            while (false);
            this._storeInt16(((_34_ = this._loadInt((_35_ + 40))) + 28), (this._loadInt16u((_35_ + 14))));
            this._storeInt((_34_ + 24), (this._loadInt((_35_ + 20))));
            _33_ = 1;
            label$19:
            do {
                if ((this._loadInt8u((_35_ + 31))) == 0) {
                    break label$19;
                }
                _33_ = this._loadInt8u((_35_ + 31));
            }
            while (false);
            this._storeInt8(((_34_ = this._loadInt((_35_ + 40))) + 31), _33_);
            _temp$9 = 3;
            _temp$10 = 4;
            _temp$11 = ((this._loadInt8u((_35_ + 31))) != 0) ? _temp$9 : _temp$10;
            this._storeInt8((_34_ + 30), _temp$11);
            label$20:
            do {
                if ((this._loadInt8u((_34_ + 31))) == 1) {
                    break label$20;
                }
                if ((sqlite3VdbeMemHandleBom((this._loadInt((_35_ + 40))))) == 0) {
                    break label$20;
                }
                this._storeInt((_35_ + 44), 7);
                break label$0;
            }
            while (false);
            label$21:
            do {
                if ((this._loadInt((_35_ + 20))) <= (this._loadInt((_35_ + 16)))) {
                    break label$21;
                }
                this._storeInt((_35_ + 44), 18);
                break label$0;
            }
            while (false);
            this._storeInt((_35_ + 44), 0);
        }
        while (false);
        _34_ = this._loadInt((_35_ + 44));
        this._storeInt((0 + 4), (_35_ + 48));
        return _34_;
    }

    @Override()
    public final void sqlite3_result_error_toobig(int _30_)
    {
        int _31_ = 0;
        _31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16));
        this._storeInt((_30_ + 52), 18);
        sqlite3VdbeMemSetStr(((this._storeInt((_31_ + 12), _30_)) + 8), 25104, -1, 1, 0);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3VdbeMemSetNull(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if (((this._loadInt16u(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 28))) & 64) == 0) {
                break label$0;
            }
            this._storeInt(((_30_ = this._loadInt(((this._loadInt((_31_ + 12))) + 16))) + 60), (this._loadInt(((this._loadInt(_30_)) + 172))));
            this._storeInt((_31_ + 8), _30_);
            this._storeInt(((this._loadInt((_30_ = this._loadInt((_31_ + 8))))) + 172), _30_);
        }
        while (false);
        label$1:
        do {
            if (((this._loadInt16u(((this._loadInt((_31_ + 12))) + 28))) & 32) == 0) {
                break label$1;
            }
            sqlite3RowSetClear((this._loadInt(((this._loadInt((_31_ + 12))) + 16))));
        }
        while (false);
        this._storeInt8(((_30_ = this._loadInt((_31_ + 12))) + 30), 5);
        this._storeInt16((_30_ + 28), (((this._loadInt16u((_30_ + 28))) & 48896) | 1));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3VdbeMemGrow(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        label$0:
        do {
            if ((this._loadInt((_33_ + 8))) > 31) {
                break label$0;
            }
            this._storeInt((_33_ + 8), 32);
        }
        while (false);
        label$1:
        do {
            if ((sqlite3DbMallocSize((this._loadInt((_32_ = this._loadInt((_33_ + 12))))), (this._loadInt((_32_ + 36))))) >= (this._loadInt((_33_ + 8)))) {
                break label$1;
            }
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt((_33_ + 4))) == 0) {
                        break label$3;
                    }
                    if ((this._loadInt(((_32_ = this._loadInt((_33_ + 12))) + 4))) == (this._loadInt((_32_ + 36)))) {
                        break label$2;
                    }
                }
                while (false);
                sqlite3DbFree((this._loadInt((_32_ = this._loadInt((_33_ + 12))))), (this._loadInt((_32_ + 36))));
                _32_ = sqlite3DbMallocRaw((this._loadInt((this._loadInt((_33_ + 12))))), (this._loadInt((_33_ + 8))));
                this._storeInt(((this._loadInt((_33_ + 12))) + 36), _32_);
                break label$1;
            }
            while (false);
            _32_ = sqlite3DbReallocOrFree((this._loadInt((_32_ = this._loadInt((_33_ + 12))))), (this._loadInt((_32_ + 4))), (this._loadInt((_33_ + 8))));
            this._storeInt(((_31_ = this._loadInt((_33_ + 12))) + 36), (this._storeInt((_31_ + 4), _32_)));
            this._storeInt((_33_ + 4), 0);
        }
        while (false);
        label$4:
        do {
            if ((this._loadInt(((this._loadInt((_33_ + 12))) + 4))) == 0) {
                break label$4;
            }
            if ((this._loadInt((_33_ + 4))) == 0) {
                break label$4;
            }
            if ((this._loadInt(((this._loadInt((_33_ + 12))) + 36))) == 0) {
                break label$4;
            }
            if ((this._loadInt(((_32_ = this._loadInt((_33_ + 12))) + 4))) == (this._loadInt((_32_ + 36)))) {
                break label$4;
            }
            memcpy((this._loadInt(((_32_ = this._loadInt((_33_ + 12))) + 36))), (this._loadInt((_32_ + 4))), (this._loadInt((_32_ + 24))));
        }
        while (false);
        label$5:
        do {
            if (((this._loadInt16u(((this._loadInt((_33_ + 12))) + 28))) & 1024) == 0) {
                break label$5;
            }
            if ((this._loadInt(((this._loadInt((_33_ + 12))) + 32))) == 0) {
                break label$5;
            }
            this._viTable[this._tableIndices[this._loadInt(((_32_ = this._loadInt((_33_ + 12))) + 32))]].invoke((this._loadInt((_32_ + 4))));
        }
        while (false);
        label$6:
        do {
            label$7:
            do {
                if ((this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 4), (this._loadInt((_32_ + 36))))) == 0) {
                    break label$7;
                }
                this._storeInt16(((_32_ = this._loadInt((_33_ + 12))) + 28), ((this._loadInt16u((_32_ + 28))) & 59391));
                break label$6;
            }
            while (false);
            this._storeInt16(((this._loadInt((_33_ + 12))) + 28), 1);
        }
        while (false);
        _31_ = this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 32), 0);
        _32_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_33_ + 16));
        _temp$0 = _31_;
        _temp$1 = 7;
        _temp$2 = (_32_ != 0) ? _temp$0 : _temp$1;
        return _temp$2;
    }

    @Override()
    public final void sqlite3VdbeMemRelease(int _30_)
    {
        int _31_ = 0;
        sqlite3VdbeMemReleaseExternal((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        sqlite3DbFree((this._loadInt((_30_ = this._loadInt((_31_ + 12))))), (this._loadInt((_30_ + 36))));
        this._storeInt(((_30_ = this._loadInt((_31_ + 12))) + 32), (this._storeInt((_30_ + 36), (this._storeInt((_30_ + 4), 0)))));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3VdbeMemHandleBom(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt8((_32_ + 7), (this._storeInt((_32_ + 8), 0)));
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_32_ + 12))) + 24))) < 2) {
                break label$0;
            }
            this._storeInt8((_32_ + 6), (this._loadInt8u((this._loadInt(((this._loadInt((_32_ + 12))) + 4))))));
            this._storeInt8((_32_ + 5), (this._loadInt8u(((this._loadInt(((this._loadInt((_32_ + 12))) + 4))) + 1))));
            label$1:
            do {
                if ((this._loadInt8u((_32_ + 6))) != 254) {
                    break label$1;
                }
                if ((this._loadInt8u((_32_ + 5))) != 255) {
                    break label$1;
                }
                this._storeInt8((_32_ + 7), 3);
            }
            while (false);
            if ((this._loadInt8u((_32_ + 6))) != 255) {
                break label$0;
            }
            if ((this._loadInt8u((_32_ + 5))) != 254) {
                break label$0;
            }
            this._storeInt8((_32_ + 7), 2);
        }
        while (false);
        label$2:
        do {
            if ((this._loadInt8u((_32_ + 7))) == 0) {
                break label$2;
            }
            if ((this._storeInt((_32_ + 8), (sqlite3VdbeMemMakeWriteable((this._loadInt((_32_ + 12))))))) != 0) {
                break label$2;
            }
            _31_ = this._storeInt(((_30_ = this._loadInt((_32_ + 12))) + 24), ((this._loadInt((_30_ + 24))) + -2));
            memmove((_30_ = this._loadInt((_30_ + 4))), (_30_ + 2), _31_);
            _31_ = this._storeInt8(((this._loadInt(((_30_ = this._loadInt((_32_ + 12))) + 4))) + (this._loadInt((_30_ + 24)))), 0);
            this._storeInt8((((this._loadInt((_30_ + 4))) + (this._loadInt((_30_ + 24)))) + 1), _31_);
            this._storeInt16(((_30_ = this._loadInt((_32_ + 12))) + 28), ((this._loadInt16u((_30_ + 28))) | 512));
            this._storeInt8(((this._loadInt((_32_ + 12))) + 31), (this._loadInt8u((_32_ + 7))));
        }
        while (false);
        _30_ = this._loadInt((_32_ + 8));
        this._storeInt((0 + 4), (_32_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3VdbeMemMakeWriteable(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        label$0:
        do {
            if (((this._loadInt16u(((this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)) + 28))) & 16384) == 0) {
                break label$0;
            }
            sqlite3VdbeMemExpandBlob((this._loadInt((_32_ + 8))));
        }
        while (false);
        this._storeInt((_32_ + 4), (this._loadInt16u(((this._loadInt((_32_ + 8))) + 28))));
        label$1:
        do {
            label$2:
            do {
                if (((this._loadInt8u((_32_ + 4))) & 18) == 0) {
                    break label$2;
                }
                if ((this._loadInt(((_30_ = this._loadInt((_32_ + 8))) + 4))) == (this._loadInt((_30_ + 36)))) {
                    break label$2;
                }
                label$3:
                do {
                    if ((sqlite3VdbeMemGrow((_30_ = this._loadInt((_32_ + 8))), ((this._loadInt((_30_ + 24))) + 2), 1)) == 0) {
                        break label$3;
                    }
                    this._storeInt((_32_ + 12), 7);
                    break label$1;
                }
                while (false);
                _31_ = this._storeInt8(((this._loadInt(((_30_ = this._loadInt((_32_ + 8))) + 4))) + (this._loadInt((_30_ + 24)))), 0);
                this._storeInt8((((this._loadInt((_30_ + 4))) + (this._loadInt((_30_ + 24)))) + 1), _31_);
                this._storeInt16(((_30_ = this._loadInt((_32_ + 8))) + 28), ((this._loadInt16u((_30_ + 28))) | 512));
            }
            while (false);
            this._storeInt((_32_ + 12), 0);
        }
        while (false);
        _30_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3VdbeMemExpandBlob(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt16u(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)) + 28))) & 16384) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._storeInt((_31_ + 4), ((this._loadInt(((_30_ = this._loadInt((_31_ + 8))) + 24))) + (this._loadInt((_30_ + 16)))))) > 0) {
                        break label$2;
                    }
                    this._storeInt((_31_ + 4), 1);
                }
                while (false);
                label$3:
                do {
                    if ((sqlite3VdbeMemGrow((this._loadInt((_31_ + 8))), (this._loadInt((_31_ + 4))), 1)) == 0) {
                        break label$3;
                    }
                    this._storeInt((_31_ + 12), 7);
                    break label$0;
                }
                while (false);
                memset(((this._loadInt(((_30_ = this._loadInt((_31_ + 8))) + 4))) + (this._loadInt((_30_ + 24)))), 0, (this._loadInt((_30_ + 16))));
                this._storeInt(((_30_ = this._loadInt((_31_ + 8))) + 24), ((this._loadInt((_30_ + 24))) + (this._loadInt((_30_ + 16)))));
                this._storeInt16((_30_ + 28), ((this._loadInt16u((_30_ + 28))) & 48639));
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
    public final void sqlite3VdbeMemReleaseExternal(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if (((this._loadInt16u(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 28))) & 9312) == 0) {
                break label$0;
            }
            label$1:
            do {
                if (((this._loadInt16u(((this._loadInt((_31_ + 12))) + 28))) & 8192) == 0) {
                    break label$1;
                }
                sqlite3VdbeMemFinalize((_30_ = this._loadInt((_31_ + 12))), (this._loadInt((_30_ + 16))));
                sqlite3VdbeMemRelease((this._loadInt((_31_ + 12))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt16u(((this._loadInt((_31_ + 12))) + 28))) & 1024) == 0) {
                    break label$2;
                }
                if ((this._loadInt(((this._loadInt((_31_ + 12))) + 32))) == 0) {
                    break label$2;
                }
                this._viTable[this._tableIndices[this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 32))]].invoke((this._loadInt((_30_ + 4))));
                this._storeInt(((this._loadInt((_31_ + 12))) + 32), 0);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt16u(((this._loadInt((_31_ + 12))) + 28))) & 32) == 0) {
                    break label$3;
                }
                sqlite3RowSetClear((this._loadInt(((this._loadInt((_31_ + 12))) + 16))));
                break label$0;
            }
            while (false);
            if (((this._loadInt16u(((this._loadInt((_31_ + 12))) + 28))) & 64) == 0) {
                break label$0;
            }
            sqlite3VdbeMemSetNull((this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3VdbeMemFinalize(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 76), _30_);
        this._storeInt((_32_ + 72), _31_);
        this._storeInt((_32_ + 68), 0);
        label$0:
        do {
            if ((this._loadInt((_32_ + 72))) == 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_32_ + 72))) + 20))) == 0) {
                break label$0;
            }
            memset(_32_, 0, 64);
            this._storeInt16((_32_ + 36), 1);
            this._storeInt((_32_ + 8), (this._loadInt((_31_ = this._loadInt((_32_ + 76))))));
            this._storeInt((_32_ + 48), _31_);
            this._storeInt(_32_, (this._loadInt((_32_ + 72))));
            this._viTable[this._tableIndices[this._loadInt(((this._loadInt((_32_ + 72))) + 20))]].invoke(_32_);
            sqlite3DbFree((this._loadInt((_31_ = this._loadInt((_32_ + 76))))), (this._loadInt((_31_ + 36))));
            memcpy((this._loadInt((_32_ + 76))), (_32_ + 8), 40);
            this._storeInt((_32_ + 68), (this._loadInt((_32_ + 52))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 68));
        this._storeInt((0 + 4), (_32_ + 80));
        return _31_;
    }

    @Override()
    public final void sqlite3RowSetClear(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._loadInt((this._storeInt((_31_ + 12), _30_)))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 8))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 4), (this._loadInt((this._loadInt((_31_ + 8))))));
                sqlite3DbFree((this._loadInt(((this._loadInt((_31_ + 12))) + 4))), (this._loadInt((_31_ + 8))));
                this._storeInt((_31_ + 8), (this._loadInt((_31_ + 4))));
                continue label$0;
            }
        }
        while (false);
        _30_ = this._storeInt(((_30_ = this._loadInt((_31_ + 12))) + 12), (this._storeInt16((_30_ + 24), (this._storeInt(_30_, (this._storeInt((_30_ + 8), 0)))))));
        this._storeInt(((this._loadInt((_31_ + 12))) + 20), _30_);
        this._storeInt8(((this._loadInt((_31_ + 12))) + 26), 1);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3DbMallocSize(int _30_, int _31_)
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
                if ((isLookaside((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 12), (this._loadInt16u(((this._loadInt((_32_ + 8))) + 232))));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), (this._iiTable[this._tableIndices[this._loadInt((0 + 20280))]].invoke((this._loadInt((_32_ + 4))))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3DbReallocOrFree(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        label$0:
        do {
            if ((this._storeInt(_33_, (sqlite3DbRealloc((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_)))) != 0) {
                break label$0;
            }
            sqlite3DbFree((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))));
        }
        while (false);
        _32_ = this._loadInt(_33_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int sqlite3DbRealloc(int _30_, int _31_, int _32_)
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
                if ((this._loadInt8u(((this._loadInt((_33_ + 24))) + 30))) != 0) {
                    break label$1;
                }
                label$2:
                do {
                    label$3:
                    do {
                        label$4:
                        do {
                            if ((this._loadInt((_33_ + 20))) == 0) {
                                break label$4;
                            }
                            if ((isLookaside((this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))))) == 0) {
                                break label$3;
                            }
                            if ((this._loadInt((_33_ + 16))) > (this._loadInt16u(((this._loadInt((_33_ + 24))) + 232)))) {
                                break label$2;
                            }
                            this._storeInt((_33_ + 28), (this._loadInt((_33_ + 20))));
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_33_ + 28), (sqlite3DbMallocRaw((this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 16))))));
                        break label$0;
                    }
                    while (false);
                    if ((this._storeInt((_33_ + 12), (sqlite3_realloc((this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))))))) != 0) {
                        break label$1;
                    }
                    this._storeInt8(((this._loadInt((_33_ + 24))) + 30), 1);
                    break label$1;
                }
                while (false);
                if ((this._storeInt((_33_ + 12), (sqlite3DbMallocRaw((this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 16))))))) == 0) {
                    break label$1;
                }
                memcpy((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 20))), (this._loadInt16u(((this._loadInt((_33_ + 24))) + 232))));
                sqlite3DbFree((this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))));
            }
            while (false);
            this._storeInt((_33_ + 28), (this._loadInt((_33_ + 12))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int isLookaside(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        _30_ = 0;
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                break label$0;
            }
            if (((this._loadInt((_32_ + 8))) & 4294967295L) < ((this._loadInt(((this._loadInt((_32_ + 12))) + 260))) & 4294967295L)) {
                break label$0;
            }
            _30_ = (((this._loadInt((_32_ + 8))) & 4294967295L) < ((this._loadInt(((this._loadInt((_32_ + 12))) + 264))) & 4294967295L)) ? 1 : 0;
        }
        while (false);
        return _30_;
    }

    @Override()
    public final int sqlite3VMPrintf(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 400))) + 396), _30_);
        this._storeInt((_33_ + 392), _31_);
        this._storeInt((_33_ + 388), _32_);
        sqlite3StrAccumInit(_33_, (_33_ + 32), 350, (this._loadInt(((this._loadInt((_33_ + 396))) + 72))));
        this._storeInt(_33_, (this._loadInt((_33_ + 396))));
        sqlite3VXPrintf(_33_, 1, (this._loadInt((_33_ + 392))), (this._loadInt((_33_ + 388))));
        this._storeInt((_33_ + 384), (sqlite3StrAccumFinish(_33_)));
        label$0:
        do {
            if ((this._loadInt8u((_33_ + 24))) == 0) {
                break label$0;
            }
            this._storeInt8(((this._loadInt((_33_ + 396))) + 30), 1);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 384));
        this._storeInt((0 + 4), (_33_ + 400));
        return _32_;
    }

    @Override()
    public final int keywordCode(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 20), _31_)) > 1) {
                    break label$1;
                }
                this._storeInt((_32_ + 28), 26);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), ((this._loadInt8u(((this._storeInt((_32_ + 16), (((((this._loadInt8u(((this._loadInt8u((_31_ = this._loadInt((_32_ + 24))))) + 19872))) << 2) ^ ((this._loadInt8u(((this._loadInt8u(((_31_ + (_30_ = this._loadInt((_32_ + 20)))) + -1))) + 19872))) * 3)) ^ _30_) % 127))) + 25136))) + -1));
            label$2:
            do {
                label$4:
                do {
                    label$3:
                    while (true) {
                        if ((this._loadInt((_32_ + 12))) < 0) {
                            break label$2;
                        }
                        label$5:
                        do {
                            if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 25264))) != (this._loadInt((_32_ + 20)))) {
                                break label$5;
                            }
                            if ((sqlite3_strnicmp(((this._loadInt16u((((this._loadInt((_32_ + 12))) << 1) + 25392))) + 25648), (this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 20))))) == 0) {
                                break label$4;
                            }
                        }
                        while (false);
                        this._storeInt((_32_ + 12), ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 26320))) + -1));
                        continue label$3;
                    }
                }
                while (false);
                this._storeInt((_32_ + 28), (this._loadInt8u(((this._loadInt((_32_ + 12))) + 26192))));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 28), 26);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int sqlite3ValueText(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt8((_32_ + 7), _31_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_32_ + 8))) == 0) {
                        break label$2;
                    }
                    if (((this._loadInt16u(((this._loadInt((_32_ + 8))) + 28))) & 1) == 0) {
                        break label$1;
                    }
                    this._storeInt((_32_ + 12), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt16(((_31_ = this._loadInt((_32_ + 8))) + 28), ((_30_ = this._loadInt16u((_31_ + 28))) | ((_30_ & 16) >>> 3)));
            label$3:
            do {
                if (((this._loadInt16u((_31_ + 28))) & 16384) == 0) {
                    break label$3;
                }
                sqlite3VdbeMemExpandBlob((this._loadInt((_32_ + 8))));
            }
            while (false);
            label$4:
            do {
                label$5:
                do {
                    label$6:
                    do {
                        if (((this._loadInt16u(((this._loadInt((_32_ + 8))) + 28))) & 2) == 0) {
                            break label$6;
                        }
                        sqlite3VdbeChangeEncoding((this._loadInt((_32_ + 8))), ((this._loadInt8u((_32_ + 7))) & 247));
                        if (((this._loadInt8u((_32_ + 7))) & 8) == 0) {
                            break label$5;
                        }
                        if (((this._loadInt(((this._loadInt((_32_ + 8))) + 4))) & 1) == 0) {
                            break label$5;
                        }
                        if ((sqlite3VdbeMemMakeWriteable((this._loadInt((_32_ + 8))))) == 0) {
                            break label$5;
                        }
                        this._storeInt((_32_ + 12), 0);
                        break label$0;
                    }
                    while (false);
                    sqlite3VdbeMemStringify((this._loadInt((_32_ + 8))), (this._loadInt8u((_32_ + 7))));
                    break label$4;
                }
                while (false);
                sqlite3VdbeMemNulTerminate((this._loadInt((_32_ + 8))));
            }
            while (false);
            label$7:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 8))) + 31))) != ((this._loadInt8u((_32_ + 7))) & 247)) {
                    break label$7;
                }
                this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 8))) + 4))));
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
    public final int sqlite3VdbeChangeEncoding(int _30_, int _31_)
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
                    if (((this._loadInt16u(((this._loadInt((_32_ + 8))) + 28))) & 2) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt8u(((this._loadInt((_32_ + 8))) + 31))) != (this._loadInt((_32_ + 4)))) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((_32_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), (this._storeInt(_32_, (sqlite3VdbeMemTranslate((this._loadInt((_32_ + 8))), (this._loadInt8u((_32_ + 4))))))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3VdbeMemNulTerminate(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadInt16u(((this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)) + 28))) & 512) != 0) {
                        break label$2;
                    }
                    if (((this._loadInt16u(((this._loadInt((_32_ + 8))) + 28))) & 2) != 0) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((_32_ + 12), 0);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((sqlite3VdbeMemGrow((_30_ = this._loadInt((_32_ + 8))), ((this._loadInt((_30_ + 24))) + 2), 1)) == 0) {
                    break label$3;
                }
                this._storeInt((_32_ + 12), 7);
                break label$0;
            }
            while (false);
            _31_ = this._storeInt8(((this._loadInt(((_30_ = this._loadInt((_32_ + 8))) + 4))) + (this._loadInt((_30_ + 24)))), 0);
            _30_ = this._storeInt8((((this._loadInt((_30_ + 4))) + (this._loadInt((_30_ + 24)))) + 1), _31_);
            this._storeInt16(((_31_ = this._loadInt((_32_ + 8))) + 28), ((this._loadInt16u((_31_ + 28))) | 512));
            this._storeInt((_32_ + 12), _30_);
        }
        while (false);
        _30_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3VdbeMemStringify(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_32_ + 36), _31_);
        _31_ = this._storeInt((_32_ + 32), 0);
        this._storeInt((_32_ + 28), (this._loadInt16u(((this._loadInt((_32_ + 40))) + 28))));
        _30_ = this._storeInt((_32_ + 24), 32);
        label$0:
        do {
            label$1:
            do {
                if ((sqlite3VdbeMemGrow((this._loadInt((_32_ + 40))), _30_, _31_)) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 44), 7);
                break label$0;
            }
            while (false);
            label$2:
            do {
                label$3:
                do {
                    if (((this._loadInt8u((_32_ + 28))) & 4) == 0) {
                        break label$3;
                    }
                    _30_ = this._loadInt(((_31_ = this._loadInt((_32_ + 40))) + 4));
                    this._storeLong(_32_, (this._loadLong((_31_ + 16))));
                    sqlite3_snprintf(32, _30_, 26448, _32_);
                    break label$2;
                }
                while (false);
                _30_ = this._loadInt(((_31_ = this._loadInt((_32_ + 40))) + 4));
                this._storeDouble((_32_ + 16), (this._loadDouble((_31_ + 8))));
                sqlite3_snprintf(32, _30_, 26464, (_32_ + 16));
            }
            while (false);
            _30_ = sqlite3Strlen30((this._loadInt(((this._loadInt((_32_ + 40))) + 4))));
            this._storeInt(((_31_ = this._loadInt((_32_ + 40))) + 24), _30_);
            this._storeInt8((_31_ + 31), 1);
            this._storeInt16((_31_ + 28), ((this._loadInt16u((_31_ + 28))) | 514));
            sqlite3VdbeChangeEncoding((this._loadInt((_32_ + 40))), (this._loadInt((_32_ + 36))));
            this._storeInt((_32_ + 44), (this._loadInt((_32_ + 32))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 44));
        this._storeInt((0 + 4), (_32_ + 48));
        return _31_;
    }

    @Override()
    public final int sqlite3VdbeMemTranslate(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt8((_32_ + 55), _31_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_32_ + 56))) + 31))) == 1) {
                            break label$3;
                        }
                        if ((this._loadInt8u((_32_ + 55))) == 1) {
                            break label$3;
                        }
                        if ((this._storeInt((_32_ + 20), (sqlite3VdbeMemMakeWriteable((this._loadInt((_32_ + 56))))))) == 0) {
                            break label$2;
                        }
                        this._storeInt((_32_ + 60), 7);
                        break label$0;
                    }
                    while (false);
                    label$4:
                    do {
                        label$5:
                        do {
                            if ((this._loadInt8u((_32_ + 55))) != 1) {
                                break label$5;
                            }
                            this._storeInt((_32_ + 48), (((this._storeInt(((_31_ = this._loadInt((_32_ + 56))) + 24), ((this._loadInt((_31_ + 24))) & -2))) << 1) | 1));
                            break label$4;
                        }
                        while (false);
                        this._storeInt((_32_ + 48), (((this._loadInt(((this._loadInt((_32_ + 56))) + 24))) << 1) + 2));
                    }
                    while (false);
                    this._storeInt((_32_ + 36), ((this._storeInt((_32_ + 40), (this._loadInt(((this._loadInt((_32_ + 56))) + 4))))) + (this._loadInt(((this._loadInt((_32_ + 56))) + 24)))));
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
                                                if ((this._storeInt((_32_ + 44), (sqlite3DbMallocRaw((this._loadInt((this._loadInt((_32_ + 56))))), (this._loadInt((_32_ + 48))))))) == 0) {
                                                    break label$12;
                                                }
                                                this._storeInt((_32_ + 32), (this._loadInt((_32_ + 44))));
                                                if ((this._loadInt8u(((this._loadInt((_32_ + 56))) + 31))) != 1) {
                                                    break label$11;
                                                }
                                                if ((this._loadInt8u((_32_ + 55))) != 2) {
                                                    break label$10;
                                                }
                                                label$13:
                                                while (true) {
                                                    if (((this._loadInt((_32_ + 40))) & 4294967295L) >= ((this._loadInt((_32_ + 36))) & 4294967295L)) {
                                                        break label$9;
                                                    }
                                                    this._storeInt((_32_ + 40), ((_31_ = this._loadInt((_32_ + 40))) + 1));
                                                    label$15:
                                                    do {
                                                        if (((this._storeInt((_32_ + 28), (this._loadInt8u(_31_)))) & 4294967295L) < (192 & 4294967295L)) {
                                                            break label$15;
                                                        }
                                                        this._storeInt((_32_ + 28), (this._loadInt8u(((this._loadInt((_32_ + 28))) + 26288))));
                                                        label$17:
                                                        do {
                                                            label$16:
                                                            while (true) {
                                                                _31_ = 0;
                                                                label$18:
                                                                do {
                                                                    if ((this._loadInt((_32_ + 40))) == (this._loadInt((_32_ + 36)))) {
                                                                        break label$18;
                                                                    }
                                                                    _31_ = (((this._loadInt8u((this._loadInt((_32_ + 40))))) & 192) == 128) ? 1 : 0;
                                                                }
                                                                while (false);
                                                                if (_31_ == 0) {
                                                                    break label$17;
                                                                }
                                                                _31_ = this._loadInt((_32_ + 28));
                                                                this._storeInt((_32_ + 40), ((_30_ = this._loadInt((_32_ + 40))) + 1));
                                                                this._storeInt((_32_ + 28), ((_31_ << 6) | ((this._loadInt8u(_30_)) & 63)));
                                                                continue label$16;
                                                            }
                                                        }
                                                        while (false);
                                                        label$19:
                                                        do {
                                                            if (((this._loadInt((_32_ + 28))) & 4294967295L) < (128 & 4294967295L)) {
                                                                break label$19;
                                                            }
                                                            if (((this._loadInt((_32_ + 28))) & -2048) == 55296) {
                                                                break label$19;
                                                            }
                                                            if (((this._loadInt((_32_ + 28))) & -2) != 65534) {
                                                                break label$15;
                                                            }
                                                        }
                                                        while (false);
                                                        this._storeInt((_32_ + 28), 65533);
                                                    }
                                                    while (false);
                                                    label$20:
                                                    do {
                                                        if (((this._loadInt((_32_ + 28))) & 4294967295L) <= (65535 & 4294967295L)) {
                                                            break label$20;
                                                        }
                                                        _31_ = this._loadInt((_32_ + 28));
                                                        this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                                        this._storeInt8(_30_, (((_31_ >>> 10) & 63) | (((_31_ + -65536) >>> 10) & 192)));
                                                        _31_ = this._loadInt((_32_ + 28));
                                                        this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                                        this._storeInt8(_30_, ((((_31_ + -65536) >>> 18) & 3) | 216));
                                                        _31_ = this._loadInt((_32_ + 28));
                                                        this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                                        this._storeInt8(_30_, _31_);
                                                        _31_ = this._loadInt((_32_ + 28));
                                                        this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                                        this._storeInt8(_30_, (((_31_ >>> 8) & 3) | 220));
                                                        continue label$13;
                                                    }
                                                    while (false);
                                                    _31_ = this._loadInt((_32_ + 28));
                                                    this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                                    this._storeInt8(_30_, _31_);
                                                    _31_ = this._loadInt((_32_ + 28));
                                                    this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                                    this._storeInt8(_30_, (_31_ >>> 8));
                                                    continue label$13;
                                                }
                                            }
                                            while (false);
                                            this._storeInt((_32_ + 60), 7);
                                            break label$0;
                                        }
                                        while (false);
                                        if ((this._loadInt8u(((this._loadInt((_32_ + 56))) + 31))) != 2) {
                                            break label$8;
                                        }
                                        label$21:
                                        while (true) {
                                            if (((this._loadInt((_32_ + 40))) & 4294967295L) >= ((this._loadInt((_32_ + 36))) & 4294967295L)) {
                                                break label$7;
                                            }
                                            this._storeInt((_32_ + 40), ((_31_ = this._loadInt((_32_ + 40))) + 1));
                                            this._storeInt((_32_ + 28), (this._loadInt8u(_31_)));
                                            this._storeInt((_32_ + 40), ((_31_ = this._loadInt((_32_ + 40))) + 1));
                                            label$23:
                                            do {
                                                if (((this._storeInt((_32_ + 28), ((this._loadInt((_32_ + 28))) + ((this._loadInt8u(_31_)) << 8)))) & 4294967295L) < (55296 & 4294967295L)) {
                                                    break label$23;
                                                }
                                                if (((this._loadInt((_32_ + 28))) & 4294967295L) > (57343 & 4294967295L)) {
                                                    break label$23;
                                                }
                                                if (((this._loadInt((_32_ + 40))) & 4294967295L) >= ((this._loadInt((_32_ + 36))) & 4294967295L)) {
                                                    break label$23;
                                                }
                                                this._storeInt((_32_ + 40), ((_31_ = this._loadInt((_32_ + 40))) + 1));
                                                this._storeInt((_32_ + 16), (this._loadInt8u(_31_)));
                                                this._storeInt((_32_ + 40), ((_31_ = this._loadInt((_32_ + 40))) + 1));
                                                this._storeInt((_32_ + 28), (((((this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + ((this._loadInt8u(_31_)) << 8)))) & 1023) | (((_31_ = this._loadInt((_32_ + 28))) & 63) << 10)) | ((_31_ & 960) << 10)) + 65536));
                                            }
                                            while (false);
                                            label$24:
                                            do {
                                                if (((this._loadInt((_32_ + 28))) & 4294967295L) > (127 & 4294967295L)) {
                                                    break label$24;
                                                }
                                                _31_ = this._loadInt((_32_ + 28));
                                                this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                                this._storeInt8(_30_, _31_);
                                                continue label$21;
                                            }
                                            while (false);
                                            label$25:
                                            do {
                                                if (((this._loadInt((_32_ + 28))) & 4294967295L) > (2047 & 4294967295L)) {
                                                    break label$25;
                                                }
                                                _31_ = this._loadInt((_32_ + 28));
                                                this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                                this._storeInt8(_30_, (((_31_ >>> 6) & 31) | 192));
                                                _31_ = this._loadInt((_32_ + 28));
                                                this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                                this._storeInt8(_30_, ((_31_ & 63) | 128));
                                                continue label$21;
                                            }
                                            while (false);
                                            label$26:
                                            do {
                                                if (((this._loadInt((_32_ + 28))) & 4294967295L) > (65535 & 4294967295L)) {
                                                    break label$26;
                                                }
                                                _31_ = this._loadInt((_32_ + 28));
                                                this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                                this._storeInt8(_30_, (((_31_ >>> 12) & 15) | 224));
                                                _31_ = this._loadInt((_32_ + 28));
                                                this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                                this._storeInt8(_30_, (((_31_ >>> 6) & 63) | 128));
                                                _31_ = this._loadInt((_32_ + 28));
                                                this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                                this._storeInt8(_30_, ((_31_ & 63) | 128));
                                                continue label$21;
                                            }
                                            while (false);
                                            _31_ = this._loadInt((_32_ + 28));
                                            this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                            this._storeInt8(_30_, (((_31_ >>> 18) & 7) | 240));
                                            _31_ = this._loadInt((_32_ + 28));
                                            this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                            this._storeInt8(_30_, (((_31_ >>> 12) & 63) | 128));
                                            _31_ = this._loadInt((_32_ + 28));
                                            this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                            this._storeInt8(_30_, (((_31_ >>> 6) & 63) | 128));
                                            _31_ = this._loadInt((_32_ + 28));
                                            this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                            this._storeInt8(_30_, ((_31_ & 63) | 128));
                                            continue label$21;
                                        }
                                    }
                                    while (false);
                                    label$28:
                                    do {
                                        label$27:
                                        while (true) {
                                            if (((this._loadInt((_32_ + 40))) & 4294967295L) >= ((this._loadInt((_32_ + 36))) & 4294967295L)) {
                                                break label$28;
                                            }
                                            this._storeInt((_32_ + 40), ((_31_ = this._loadInt((_32_ + 40))) + 1));
                                            label$29:
                                            do {
                                                if (((this._storeInt((_32_ + 28), (this._loadInt8u(_31_)))) & 4294967295L) < (192 & 4294967295L)) {
                                                    break label$29;
                                                }
                                                this._storeInt((_32_ + 28), (this._loadInt8u(((this._loadInt((_32_ + 28))) + 26288))));
                                                label$31:
                                                do {
                                                    label$30:
                                                    while (true) {
                                                        _31_ = 0;
                                                        label$32:
                                                        do {
                                                            if ((this._loadInt((_32_ + 40))) == (this._loadInt((_32_ + 36)))) {
                                                                break label$32;
                                                            }
                                                            _31_ = (((this._loadInt8u((this._loadInt((_32_ + 40))))) & 192) == 128) ? 1 : 0;
                                                        }
                                                        while (false);
                                                        if (_31_ == 0) {
                                                            break label$31;
                                                        }
                                                        _31_ = this._loadInt((_32_ + 28));
                                                        this._storeInt((_32_ + 40), ((_30_ = this._loadInt((_32_ + 40))) + 1));
                                                        this._storeInt((_32_ + 28), ((_31_ << 6) | ((this._loadInt8u(_30_)) & 63)));
                                                        continue label$30;
                                                    }
                                                }
                                                while (false);
                                                label$33:
                                                do {
                                                    if (((this._loadInt((_32_ + 28))) & 4294967295L) < (128 & 4294967295L)) {
                                                        break label$33;
                                                    }
                                                    if (((this._loadInt((_32_ + 28))) & -2048) == 55296) {
                                                        break label$33;
                                                    }
                                                    if (((this._loadInt((_32_ + 28))) & -2) != 65534) {
                                                        break label$29;
                                                    }
                                                }
                                                while (false);
                                                this._storeInt((_32_ + 28), 65533);
                                            }
                                            while (false);
                                            label$34:
                                            do {
                                                if (((this._loadInt((_32_ + 28))) & 4294967295L) <= (65535 & 4294967295L)) {
                                                    break label$34;
                                                }
                                                _31_ = this._loadInt((_32_ + 28));
                                                this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                                this._storeInt8(_30_, ((((_31_ + -65536) >>> 18) & 3) | 216));
                                                _31_ = this._loadInt((_32_ + 28));
                                                this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                                this._storeInt8(_30_, (((_31_ >>> 10) & 63) | (((_31_ + -65536) >>> 10) & 192)));
                                                _31_ = this._loadInt((_32_ + 28));
                                                this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                                this._storeInt8(_30_, (((_31_ >>> 8) & 3) | 220));
                                                _31_ = this._loadInt((_32_ + 28));
                                                this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                                this._storeInt8(_30_, _31_);
                                                continue label$27;
                                            }
                                            while (false);
                                            _31_ = this._loadInt((_32_ + 28));
                                            this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                            this._storeInt8(_30_, (_31_ >>> 8));
                                            _31_ = this._loadInt((_32_ + 28));
                                            this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                            this._storeInt8(_30_, _31_);
                                            continue label$27;
                                        }
                                    }
                                    while (false);
                                }
                                while (false);
                                this._storeInt(((this._loadInt((_32_ + 56))) + 24), ((_31_ = this._loadInt((_32_ + 32))) - (this._loadInt((_32_ + 44)))));
                                this._storeInt((_32_ + 32), (_31_ + 1));
                                this._storeInt8(_31_, 0);
                                break label$6;
                            }
                            while (false);
                            label$36:
                            do {
                                label$35:
                                while (true) {
                                    if (((this._loadInt((_32_ + 40))) & 4294967295L) >= ((this._loadInt((_32_ + 36))) & 4294967295L)) {
                                        break label$36;
                                    }
                                    this._storeInt((_32_ + 40), ((_31_ = this._loadInt((_32_ + 40))) + 1));
                                    this._storeInt((_32_ + 28), ((this._loadInt8u(_31_)) << 8));
                                    this._storeInt((_32_ + 40), ((_31_ = this._loadInt((_32_ + 40))) + 1));
                                    label$37:
                                    do {
                                        if (((this._storeInt((_32_ + 28), ((this._loadInt((_32_ + 28))) + (this._loadInt8u(_31_))))) & 4294967295L) < (55296 & 4294967295L)) {
                                            break label$37;
                                        }
                                        if (((this._loadInt((_32_ + 28))) & 4294967295L) > (57343 & 4294967295L)) {
                                            break label$37;
                                        }
                                        if (((this._loadInt((_32_ + 40))) & 4294967295L) >= ((this._loadInt((_32_ + 36))) & 4294967295L)) {
                                            break label$37;
                                        }
                                        this._storeInt((_32_ + 40), ((_31_ = this._loadInt((_32_ + 40))) + 1));
                                        this._storeInt((_32_ + 12), ((this._loadInt8u(_31_)) << 8));
                                        this._storeInt((_32_ + 40), ((_31_ = this._loadInt((_32_ + 40))) + 1));
                                        this._storeInt((_32_ + 28), (((((this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + (this._loadInt8u(_31_))))) & 1023) | (((_31_ = this._loadInt((_32_ + 28))) & 63) << 10)) | ((_31_ & 960) << 10)) + 65536));
                                    }
                                    while (false);
                                    label$38:
                                    do {
                                        if (((this._loadInt((_32_ + 28))) & 4294967295L) > (127 & 4294967295L)) {
                                            break label$38;
                                        }
                                        _31_ = this._loadInt((_32_ + 28));
                                        this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                        this._storeInt8(_30_, _31_);
                                        continue label$35;
                                    }
                                    while (false);
                                    label$39:
                                    do {
                                        if (((this._loadInt((_32_ + 28))) & 4294967295L) > (2047 & 4294967295L)) {
                                            break label$39;
                                        }
                                        _31_ = this._loadInt((_32_ + 28));
                                        this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                        this._storeInt8(_30_, (((_31_ >>> 6) & 31) | 192));
                                        _31_ = this._loadInt((_32_ + 28));
                                        this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                        this._storeInt8(_30_, ((_31_ & 63) | 128));
                                        continue label$35;
                                    }
                                    while (false);
                                    label$40:
                                    do {
                                        if (((this._loadInt((_32_ + 28))) & 4294967295L) > (65535 & 4294967295L)) {
                                            break label$40;
                                        }
                                        _31_ = this._loadInt((_32_ + 28));
                                        this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                        this._storeInt8(_30_, (((_31_ >>> 12) & 15) | 224));
                                        _31_ = this._loadInt((_32_ + 28));
                                        this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                        this._storeInt8(_30_, (((_31_ >>> 6) & 63) | 128));
                                        _31_ = this._loadInt((_32_ + 28));
                                        this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                        this._storeInt8(_30_, ((_31_ & 63) | 128));
                                        continue label$35;
                                    }
                                    while (false);
                                    _31_ = this._loadInt((_32_ + 28));
                                    this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                    this._storeInt8(_30_, (((_31_ >>> 18) & 7) | 240));
                                    _31_ = this._loadInt((_32_ + 28));
                                    this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                    this._storeInt8(_30_, (((_31_ >>> 12) & 63) | 128));
                                    _31_ = this._loadInt((_32_ + 28));
                                    this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                    this._storeInt8(_30_, (((_31_ >>> 6) & 63) | 128));
                                    _31_ = this._loadInt((_32_ + 28));
                                    this._storeInt((_32_ + 32), ((_30_ = this._loadInt((_32_ + 32))) + 1));
                                    this._storeInt8(_30_, ((_31_ & 63) | 128));
                                    continue label$35;
                                }
                            }
                            while (false);
                        }
                        while (false);
                        this._storeInt(((this._loadInt((_32_ + 56))) + 24), ((this._loadInt((_32_ + 32))) - (this._loadInt((_32_ + 44)))));
                    }
                    while (false);
                    this._storeInt8((this._loadInt((_32_ + 32))), 0);
                    sqlite3VdbeMemRelease((this._loadInt((_32_ + 56))));
                    this._storeInt8(((_31_ = this._loadInt((_32_ + 56))) + 31), (this._loadInt8u((_32_ + 55))));
                    this._storeInt16((_31_ + 28), ((this._loadInt16u((_31_ + 28))) & 58367));
                    this._storeInt16((_31_ + 28), ((this._loadInt16u((_31_ + 28))) | 1536));
                    this._storeInt(((this._loadInt((_32_ + 56))) + 4), (this._loadInt((_32_ + 44))));
                    this._storeInt(((_31_ = this._loadInt((_32_ + 56))) + 36), (this._loadInt((_31_ + 4))));
                    break label$1;
                }
                while (false);
                this._storeInt((_32_ + 36), ((this._storeInt((_32_ + 40), (this._loadInt(((this._loadInt((_32_ + 56))) + 4))))) + ((this._loadInt(((this._loadInt((_32_ + 56))) + 24))) & -2)));
                label$42:
                do {
                    label$41:
                    while (true) {
                        if (((this._loadInt((_32_ + 40))) & 4294967295L) >= ((this._loadInt((_32_ + 36))) & 4294967295L)) {
                            break label$42;
                        }
                        this._storeInt8((_32_ + 27), (this._loadInt8u((this._loadInt((_32_ + 40))))));
                        this._storeInt8((_31_ = this._loadInt((_32_ + 40))), (this._loadInt8u((_31_ + 1))));
                        this._storeInt((_32_ + 40), ((_31_ = this._loadInt((_32_ + 40))) + 1));
                        _30_ = this._loadInt8u((_32_ + 27));
                        this._storeInt((_32_ + 40), (_31_ + 2));
                        this._storeInt8((_31_ + 1), _30_);
                        continue label$41;
                    }
                }
                while (false);
                this._storeInt8(((this._loadInt((_32_ + 56))) + 31), (this._loadInt8u((_32_ + 55))));
            }
            while (false);
            this._storeInt((_32_ + 60), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 60));
        this._storeInt((0 + 4), (_32_ + 64));
        return _31_;
    }

    @Override()
    public final void juliandayFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_33_ + 56), _31_);
        this._storeInt((_33_ + 52), _32_);
        label$0:
        do {
            if ((isDate((this._loadInt((_33_ + 60))), (this._loadInt((_33_ + 56))), _32_, _33_)) != 0) {
                break label$0;
            }
            computeJD(_33_);
            sqlite3_result_double((this._loadInt((_33_ + 60))), (((double) (this._loadLong(_33_))) / 8.64E7));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 64));
        return;
    }

    @Override()
    public final void dateFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 192))) + 188), _30_);
        this._storeInt((_33_ + 184), _31_);
        this._storeInt((_33_ + 180), _32_);
        label$0:
        do {
            if ((isDate((this._loadInt((_33_ + 188))), (this._loadInt((_33_ + 184))), _32_, (_33_ + 128))) != 0) {
                break label$0;
            }
            computeYMD((_33_ + 128));
            _32_ = this._loadInt((_33_ + 136));
            this._storeInt((_33_ + 8), (this._loadInt((_33_ + 144))));
            this._storeInt((_33_ + 4), (this._loadInt((_33_ + 140))));
            this._storeInt(_33_, _32_);
            sqlite3_snprintf(100, (_33_ + 16), 27344, _33_);
            sqlite3_result_text((this._loadInt((_33_ + 188))), (_33_ + 16), -1, -1);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 192));
        return;
    }

    @Override()
    public final void timeFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 192))) + 188), _30_);
        this._storeInt((_33_ + 184), _31_);
        this._storeInt((_33_ + 180), _32_);
        label$0:
        do {
            if ((isDate((this._loadInt((_33_ + 188))), (this._loadInt((_33_ + 184))), _32_, (_33_ + 128))) != 0) {
                break label$0;
            }
            computeHMS((_33_ + 128));
            this._storeInt((_33_ + 4), (this._loadInt((_33_ + 152))));
            this._storeInt(_33_, (this._loadInt((_33_ + 148))));
            this._storeInt((_33_ + 8), (_truncateDoubleToSignedInteger((this._loadDouble((_33_ + 160))))));
            sqlite3_snprintf(100, (_33_ + 16), 27328, _33_);
            sqlite3_result_text((this._loadInt((_33_ + 188))), (_33_ + 16), -1, -1);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 192));
        return;
    }
}
