package com.wrmsr.wava;

abstract class sqlite3$8
        extends sqlite3$7
{
    protected sqlite3$8(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final long wcstoull(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _34_ = wcstox$2e$316((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_, -1L);
        this._storeInt((0 + 4), (_33_ + 16));
        return _34_;
    }

    @Override()
    public final long wcstox$2e$316(int _30_, int _31_, int _32_, long _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 256))) + 252), _30_);
        this._storeInt((_34_ + 248), _31_);
        this._storeInt((_34_ + 244), _32_);
        this._storeLong((_34_ + 232), _33_);
        this._storeInt((_34_ + 228), (this._loadInt((_34_ + 252))));
        memset((_34_ + 16), 0, 144);
        this._storeInt((_34_ + 24), 0);
        this._storeLong((_34_ + 16), 0L);
        this._storeInt((_34_ + 60), ((_34_ + 160) | 4));
        this._storeInt((_34_ + 64), 60);
        this._storeInt((_34_ + 92), -1);
        this._storeInt((_34_ + 48), 12);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this.iswspace.invoke((this._loadInt((this._loadInt((_34_ + 228))))))) == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 228), ((this._loadInt((_34_ + 228))) + 4));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((_34_ + 100), (this._loadInt((_34_ + 228))));
        __shlim((_34_ + 16), 0L);
        this._storeLong((_34_ + 8), (__intscan((_34_ + 16), (this._loadInt((_34_ + 244))), 1, (this._loadLong((_34_ + 232))))));
        label$2:
        do {
            if ((this._loadInt((_34_ + 248))) == 0) {
                break label$2;
            }
            label$3:
            do {
                label$4:
                do {
                    if ((this._storeInt((_34_ + 4), ((int) ((this._loadLong((_34_ + 136))) + (((this._loadInt((_34_ + 20))) - (this._loadInt((_34_ + 24)))) & 4294967295L))))) == 0) {
                        break label$4;
                    }
                    _32_ = (this._loadInt((_34_ + 228))) + ((this._loadInt((_34_ + 4))) << 2);
                    break label$3;
                }
                while (false);
                _32_ = this._loadInt((_34_ + 252));
            }
            while (false);
            this._storeInt((this._loadInt((_34_ + 248))), _32_);
        }
        while (false);
        _33_ = this._loadLong((_34_ + 8));
        this._storeInt((0 + 4), (_34_ + 256));
        return _33_;
    }

    @Override()
    public final int do_read$2e$317(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        label$0:
        do {
            if ((this._loadInt((this._storeInt((_33_ + 8), (this._loadInt(((this._loadInt((_33_ + 24))) + 84))))))) != 0) {
                break label$0;
            }
            this._storeInt((_33_ + 8), 19756);
        }
        while (false);
        _30_ = this._storeInt((_33_ + 12), 0);
        label$2:
        do {
            label$1:
            while (true) {
                _32_ = 0;
                label$3:
                do {
                    if (((this._loadInt((_33_ + 12))) & 4294967295L) >= ((this._loadInt(((this._loadInt((_33_ + 24))) + 48))) & 4294967295L)) {
                        break label$3;
                    }
                    _32_ = ((this._loadInt(((this._loadInt((_33_ + 8))) + ((this._loadInt((_33_ + 12))) << 2)))) != _30_) ? 1 : 0;
                }
                while (false);
                if (_32_ == 0) {
                    break label$2;
                }
                _32_ = 64;
                label$4:
                do {
                    if (((this._loadInt(((this._loadInt((_33_ + 8))) + ((this._loadInt((_33_ + 12))) << 2)))) & 4294967295L) > (127 & 4294967295L)) {
                        break label$4;
                    }
                    _32_ = this._loadInt(((this._loadInt((_33_ + 8))) + ((this._loadInt((_33_ + 12))) << 2)));
                }
                while (false);
                this._storeInt8(((this._loadInt(((this._loadInt((_33_ + 24))) + 44))) + (_31_ = this._loadInt((_33_ + 12)))), _32_);
                this._storeInt((_33_ + 12), (_31_ + 1));
                continue label$1;
            }
        }
        while (false);
        this._storeInt(((_32_ = this._loadInt((_33_ + 24))) + 8), ((this._storeInt((_32_ + 4), (this._loadInt((_32_ + 44))))) + (this._loadInt((_33_ + 12)))));
        this._storeInt(((this._loadInt((_33_ + 24))) + 84), ((this._loadInt((_33_ + 8))) + ((this._loadInt((_33_ + 12))) << 2)));
        label$5:
        do {
            if ((this._loadInt((_33_ + 12))) == 0) {
                break label$5;
            }
            if ((this._loadInt((_33_ + 16))) == 0) {
                break label$5;
            }
            _32_ = this._loadInt((_33_ + 20));
            this._storeInt(((_31_ = this._loadInt((_33_ + 24))) + 4), ((this._storeInt((_33_ + 28), 1)) + (_31_ = this._loadInt((_31_ + 4)))));
            this._storeInt8(_32_, (this._loadInt8u(_31_)));
            return (this._loadInt((_33_ + 28)));
        }
        while (false);
        this._storeInt((_33_ + 28), 0);
        return (this._loadInt((_33_ + 28)));
    }

    @Override()
    public final long wcstoll(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _34_ = wcstox$2e$316((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_, -9223372036854775808L);
        this._storeInt((0 + 4), (_33_ + 16));
        return _34_;
    }

    @Override()
    public final int wcstoul(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _34_ = wcstox$2e$316((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_, 4294967295L);
        this._storeInt((0 + 4), (_33_ + 16));
        return ((int) _34_);
    }

    @Override()
    public final int wcstol(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _34_ = wcstox$2e$316((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_, 2147483648L);
        this._storeInt((0 + 4), (_33_ + 16));
        return ((int) _34_);
    }

    @Override()
    public final long wcstoimax(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _34_ = wcstoll((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _34_;
    }

    @Override()
    public final long wcstoumax(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _34_ = wcstoull((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _34_;
    }

    @Override()
    public final int write(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = __syscall_ret((this.__syscall_cp.invoke(4, (this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_, 0, 0, 0)));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int writev(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = __syscall_ret((this.__syscall_cp.invoke(146, (this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_, 0, 0, 0)));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int sqlite3_compileoption_used(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((sqlite3_strnicmp((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)), 19792, 7)) != 0) {
                break label$0;
            }
            this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) + 7));
        }
        while (false);
        this._storeInt(_31_, (sqlite3Strlen30((this._loadInt((_31_ + 8))))));
        this._storeInt((_31_ + 4), 0);
        label$1:
        do {
            label$2:
            do {
                label$4:
                do {
                    label$3:
                    while (true) {
                        if ((this._loadInt((_31_ + 4))) > 2) {
                            break label$2;
                        }
                        label$5:
                        do {
                            if ((sqlite3_strnicmp((this._loadInt((_31_ + 8))), (this._loadInt((((this._loadInt((_31_ + 4))) << 2) + 19800))), (this._loadInt(_31_)))) != 0) {
                                break label$5;
                            }
                            if ((this._loadInt8s(((this._loadInt((((this._loadInt((_31_ + 4))) << 2) + 19800))) + (this._loadInt(_31_))))) == 0) {
                                break label$4;
                            }
                            if ((this._loadInt8s(((this._loadInt((((this._loadInt((_31_ + 4))) << 2) + 19800))) + (this._loadInt(_31_))))) == 61) {
                                break label$4;
                            }
                        }
                        while (false);
                        this._storeInt((_31_ + 4), ((this._loadInt((_31_ + 4))) + 1));
                        continue label$3;
                    }
                }
                while (false);
                this._storeInt((_31_ + 12), 1);
                break label$1;
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
    public final int sqlite3_strnicmp(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 32) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 16), (this._loadInt((_33_ + 28))));
        this._storeInt((_33_ + 12), (this._loadInt((_33_ + 24))));
        label$1:
        do {
            label$0:
            while (true) {
                this._storeInt((_33_ + 20), ((_31_ = this._loadInt((_33_ + 20))) + -1));
                _32_ = 0;
                label$2:
                do {
                    if (_31_ < 1) {
                        break label$2;
                    }
                    if ((this._loadInt8u((this._loadInt((_33_ + 16))))) == 0) {
                        break label$2;
                    }
                    _32_ = ((this._loadInt8u(((this._loadInt8u((this._loadInt((_33_ + 16))))) + 19872))) == (this._loadInt8u(((this._loadInt8u((this._loadInt((_33_ + 12))))) + 19872)))) ? 1 : 0;
                }
                while (false);
                if (_32_ == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + 1));
                this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 1));
                continue label$0;
            }
        }
        while (false);
        _32_ = 0;
        label$3:
        do {
            if ((this._loadInt((_33_ + 20))) < 0) {
                break label$3;
            }
            _32_ = (this._loadInt8u(((this._loadInt8u((this._loadInt((_33_ + 16))))) + 19872))) - (this._loadInt8u(((this._loadInt8u((this._loadInt((_33_ + 12))))) + 19872)));
        }
        while (false);
        return _32_;
    }

    @Override()
    public final int sqlite3Strlen30(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 4), (this._storeInt((_31_ + 8), _30_)));
        label$0:
        do {
            if ((this._loadInt((_31_ + 8))) == 0) {
                break label$0;
            }
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt8u((this._loadInt((_31_ + 4))))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_31_ + 4), ((this._loadInt((_31_ + 4))) + 1));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt((_31_ + 12), (((this._loadInt((_31_ + 4))) - (this._loadInt((_31_ + 8)))) & 1073741823));
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        this._storeInt((_31_ + 12), 0);
        return (this._loadInt((_31_ + 12)));
    }

    @Override()
    public final int sqlite3_compileoption_get(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), _30_)) < 0) {
                break label$0;
            }
            if ((this._loadInt((_31_ + 8))) > 2) {
                break label$0;
            }
            this._storeInt((_31_ + 12), (this._loadInt((((this._loadInt((_31_ + 8))) << 2) + 19800))));
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        this._storeInt((_31_ + 12), 0);
        return (this._loadInt((_31_ + 12)));
    }

    @Override()
    public final int sqlite3_status(int _30_, int _31_, int _32_, int _33_)
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
                    if ((this._loadInt((_34_ + 24))) < 0) {
                        break label$2;
                    }
                    if ((this._loadInt((_34_ + 24))) < 10) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((_34_ + 28), (sqlite3MisuseError(12979)));
                break label$0;
            }
            while (false);
            this._storeInt((this._loadInt((_34_ + 20))), (this._loadInt(((_33_ = (this._loadInt((_34_ + 24))) << 2) + 20128))));
            this._storeInt((this._loadInt((_34_ + 16))), (this._loadInt((_33_ + 20168))));
            label$3:
            do {
                if ((this._loadInt((_34_ + 12))) == 0) {
                    break label$3;
                }
                this._storeInt(((_33_ = (this._loadInt((_34_ + 24))) << 2) + 20168), (this._loadInt((_33_ + 20128))));
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
    public final int sqlite3MisuseError(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        _32_ = sqlite3_sourceid();
        this._storeInt(_31_, _30_);
        this._storeInt((_31_ + 4), (_32_ + 20));
        sqlite3_log(21, 20208, _31_);
        this._storeInt((0 + 4), (_31_ + 16));
        return 21;
    }

    @Override()
    public final int sqlite3_sourceid()
    {
        return 61056;
    }

    @Override()
    public final void sqlite3_log(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        label$0:
        do {
            if ((this._loadInt((0 + 20456))) == 0) {
                break label$0;
            }
            _31_ = this._storeInt((_33_ + 4), _32_);
            renderLogMsg((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _31_);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void renderLogMsg(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 1104))) + 1100), _30_);
        this._storeInt((_33_ + 1096), _31_);
        this._storeInt((_33_ + 1092), _32_);
        sqlite3StrAccumInit((_33_ + 1064), _33_, 1050, 0);
        sqlite3VXPrintf((_33_ + 1064), (_32_ = this._storeInt8((_33_ + 1089), 0)), (this._loadInt((_33_ + 1096))), (this._loadInt((_33_ + 1092))));
        this._viiiTable[this._tableIndices[this._loadInt((_32_ + 20456))]].invoke((this._loadInt((_32_ + 20460))), (this._loadInt((_33_ + 1100))), (sqlite3StrAccumFinish((_33_ + 1064))));
        this._storeInt((0 + 4), (_33_ + 1104));
        return;
    }

    @Override()
    public final void sqlite3StrAccumInit(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        this._storeInt(((_33_ = this._loadInt((_34_ + 12))) + 8), (this._storeInt((_33_ + 4), (this._loadInt((_34_ + 8))))));
        _33_ = this._storeInt(_33_, 0);
        this._storeInt(((this._loadInt((_34_ + 12))) + 12), _33_);
        this._storeInt(((this._loadInt((_34_ + 12))) + 16), (this._loadInt((_34_ + 4))));
        this._storeInt(((this._loadInt((_34_ + 12))) + 20), (this._loadInt(_34_)));
        this._storeInt8(((this._loadInt((_34_ + 12))) + 25), 1);
        this._storeInt8(((this._loadInt((_34_ + 12))) + 26), _33_);
        this._storeInt8(((this._loadInt((_34_ + 12))) + 24), _33_);
        return;
    }

    @Override()
    public final void sqlite3VXPrintf(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        double _35_ = 0.0;
        int _36_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        int _temp$3 = 0;
        int _temp$4 = 0;
        int _temp$5 = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 576))) + 572), _30_);
        this._storeInt((_34_ + 568), _31_);
        this._storeInt((_34_ + 564), _32_);
        this._storeInt((_34_ + 560), _33_);
        _30_ = this._storeInt((_34_ + 552), (this._storeInt((_34_ + 544), (this._storeInt8((_34_ + 142), 0)))));
        _36_ = _34_ + 493;
        label$0:
        while (true) {
            label$2:
            do {
                label$3:
                do {
                    label$4:
                    do {
                        label$5:
                        do {
                            if ((this._storeInt((_34_ + 556), (this._loadInt8s((this._loadInt((_34_ + 564))))))) == 0) {
                                break label$5;
                            }
                            label$6:
                            do {
                                if ((this._loadInt((_34_ + 556))) == 37) {
                                    break label$6;
                                }
                                this._storeInt((_34_ + 552), (this._loadInt((_34_ + 564))));
                                _31_ = this._storeInt((_34_ + 108), 1);
                                label$8:
                                do {
                                    label$7:
                                    while (true) {
                                        this._storeInt((_34_ + 564), ((_32_ = this._loadInt((_34_ + 564))) + _31_));
                                        _33_ = 0;
                                        label$9:
                                        do {
                                            if ((this._storeInt((_34_ + 556), (this._loadInt8s((_32_ + 1))))) == 37) {
                                                break label$9;
                                            }
                                            _33_ = ((this._loadInt((_34_ + 556))) != _30_) ? 1 : 0;
                                        }
                                        while (false);
                                        if (_33_ == 0) {
                                            break label$8;
                                        }
                                        this._storeInt((_34_ + 108), ((this._loadInt((_34_ + 108))) + _31_));
                                        continue label$7;
                                    }
                                }
                                while (false);
                                sqlite3StrAccumAppend((this._loadInt((_34_ + 572))), (this._loadInt((_34_ + 552))), (this._loadInt((_34_ + 108))));
                                if ((this._loadInt((_34_ + 556))) == 0) {
                                    break label$5;
                                }
                            }
                            while (false);
                            this._storeInt((_34_ + 564), ((_33_ = this._loadInt((_34_ + 564))) + 1));
                            label$10:
                            do {
                                label$11:
                                do {
                                    if ((this._storeInt((_34_ + 556), (this._loadInt8s((_33_ + 1))))) == 0) {
                                        break label$11;
                                    }
                                    _32_ = this._storeInt8((_34_ + 527), (this._storeInt8((_34_ + 535), (this._storeInt8((_34_ + 534), (this._storeInt8((_34_ + 533), (this._storeInt8((_34_ + 532), (this._storeInt8((_34_ + 531), (this._storeInt8((_34_ + 530), _30_)))))))))))));
                                    label$12$end:
                                    do {
                                        label$12:
                                        while (true) {
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
                                                                    if (((_33_ = (this._loadInt((_34_ + 556))) + -32) & 4294967295L) > (16 & 4294967295L)) {
                                                                        break label$19;
                                                                    }
                                                                    label$20:
                                                                    do {
                                                                        label$21:
                                                                        do {
                                                                            switch (_33_) {
                                                                                case 0: {
                                                                                    break label$21;
                                                                                }
                                                                                case 1: {
                                                                                    break label$20;
                                                                                }
                                                                                case 2:
                                                                                case 4:
                                                                                case 5:
                                                                                case 6:
                                                                                case 7:
                                                                                case 8:
                                                                                case 9:
                                                                                case 10:
                                                                                case 12:
                                                                                case 14:
                                                                                case 15: {
                                                                                    break label$19;
                                                                                }
                                                                                case 3: {
                                                                                    break label$18;
                                                                                }
                                                                                case 11: {
                                                                                    break label$17;
                                                                                }
                                                                                case 13: {
                                                                                    break label$16;
                                                                                }
                                                                                case 16: {
                                                                                    break label$15;
                                                                                }
                                                                                default: {
                                                                                    break label$21;
                                                                                }
                                                                            }
                                                                        }
                                                                        while (false);
                                                                        this._storeInt8((_34_ + 533), 1);
                                                                        break label$14;
                                                                    }
                                                                    while (false);
                                                                    this._storeInt8((_34_ + 531), 1);
                                                                    break label$14;
                                                                }
                                                                while (false);
                                                                this._storeInt8((_34_ + 527), 1);
                                                                break label$14;
                                                            }
                                                            while (false);
                                                            this._storeInt8((_34_ + 532), 1);
                                                            break label$14;
                                                        }
                                                        while (false);
                                                        this._storeInt8((_34_ + 534), 1);
                                                        break label$14;
                                                    }
                                                    while (false);
                                                    this._storeInt8((_34_ + 535), 1);
                                                    break label$14;
                                                }
                                                while (false);
                                                this._storeInt8((_34_ + 530), 1);
                                            }
                                            while (false);
                                            _33_ = 0;
                                            label$22:
                                            do {
                                                if ((this._loadInt8u((_34_ + 527))) != 0) {
                                                    break label$22;
                                                }
                                                this._storeInt((_34_ + 564), ((_33_ = this._loadInt((_34_ + 564))) + 1));
                                                _33_ = ((this._storeInt((_34_ + 556), (this._loadInt8s((_33_ + 1))))) != _32_) ? 1 : 0;
                                            }
                                            while (false);
                                            if (_33_ != 0) {
                                                continue label$12;
                                            }
                                            break label$12$end;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 536), _32_);
                                    label$23:
                                    do {
                                        label$24:
                                        do {
                                            if ((this._loadInt((_34_ + 556))) != 42) {
                                                break label$24;
                                            }
                                            this._storeInt((_34_ + 560), ((_33_ = this._loadInt((_34_ + 560))) + 4));
                                            label$25:
                                            do {
                                                if ((this._storeInt((_34_ + 536), (this._loadInt(_33_)))) > -1) {
                                                    break label$25;
                                                }
                                                this._storeInt8((_34_ + 535), 1);
                                                this._storeInt((_34_ + 536), (_32_ - (this._loadInt((_34_ + 536)))));
                                            }
                                            while (false);
                                            this._storeInt((_34_ + 564), ((_33_ = this._loadInt((_34_ + 564))) + 1));
                                            this._storeInt((_34_ + 556), (this._loadInt8s((_33_ + 1))));
                                            break label$23;
                                        }
                                        while (false);
                                        label$27:
                                        do {
                                            label$26:
                                            while (true) {
                                                _33_ = 0;
                                                label$28:
                                                do {
                                                    if ((this._loadInt((_34_ + 556))) < 48) {
                                                        break label$28;
                                                    }
                                                    _33_ = ((this._loadInt((_34_ + 556))) < 58) ? 1 : 0;
                                                }
                                                while (false);
                                                if (_33_ == 0) {
                                                    break label$27;
                                                }
                                                this._storeInt((_34_ + 536), ((((this._loadInt((_34_ + 536))) * 10) + (this._loadInt((_34_ + 556)))) + -48));
                                                this._storeInt((_34_ + 564), ((_33_ = this._loadInt((_34_ + 564))) + 1));
                                                this._storeInt((_34_ + 556), (this._loadInt8s((_33_ + 1))));
                                                continue label$26;
                                            }
                                        }
                                        while (false);
                                    }
                                    while (false);
                                    label$29:
                                    do {
                                        if ((this._loadInt((_34_ + 536))) < 341) {
                                            break label$29;
                                        }
                                        this._storeInt((_34_ + 536), 340);
                                    }
                                    while (false);
                                    label$30:
                                    do {
                                        label$31:
                                        do {
                                            if ((this._loadInt((_34_ + 556))) != 46) {
                                                break label$31;
                                            }
                                            _31_ = this._storeInt((_34_ + 548), _32_);
                                            this._storeInt((_34_ + 564), ((_33_ = this._loadInt((_34_ + 564))) + 1));
                                            label$32:
                                            do {
                                                if ((this._storeInt((_34_ + 556), (this._loadInt8s((_33_ + 1))))) != 42) {
                                                    break label$32;
                                                }
                                                this._storeInt((_34_ + 560), ((_33_ = this._loadInt((_34_ + 560))) + 4));
                                                label$33:
                                                do {
                                                    if ((this._storeInt((_34_ + 548), (this._loadInt(_33_)))) > -1) {
                                                        break label$33;
                                                    }
                                                    this._storeInt((_34_ + 548), (_31_ - (this._loadInt((_34_ + 548)))));
                                                }
                                                while (false);
                                                this._storeInt((_34_ + 564), ((_33_ = this._loadInt((_34_ + 564))) + 1));
                                                this._storeInt((_34_ + 556), (this._loadInt8s((_33_ + 1))));
                                                break label$30;
                                            }
                                            while (false);
                                            label$34:
                                            while (true) {
                                                _33_ = 0;
                                                label$36:
                                                do {
                                                    if ((this._loadInt((_34_ + 556))) < 48) {
                                                        break label$36;
                                                    }
                                                    _33_ = ((this._loadInt((_34_ + 556))) < 58) ? 1 : 0;
                                                }
                                                while (false);
                                                if (_33_ == 0) {
                                                    break label$30;
                                                }
                                                this._storeInt((_34_ + 548), ((((this._loadInt((_34_ + 548))) * 10) + (this._loadInt((_34_ + 556)))) + -48));
                                                this._storeInt((_34_ + 564), ((_33_ = this._loadInt((_34_ + 564))) + 1));
                                                this._storeInt((_34_ + 556), (this._loadInt8s((_33_ + 1))));
                                                continue label$34;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_34_ + 548), -1);
                                    }
                                    while (false);
                                    label$37:
                                    do {
                                        label$38:
                                        do {
                                            label$39:
                                            do {
                                                if ((this._loadInt((_34_ + 556))) != 108) {
                                                    break label$39;
                                                }
                                                this._storeInt((_34_ + 564), ((_31_ = this._storeInt8((_34_ + 529), 1)) + (_33_ = this._loadInt((_34_ + 564)))));
                                                if ((this._storeInt((_34_ + 556), (this._loadInt8s((_33_ + 1))))) != 108) {
                                                    break label$38;
                                                }
                                                this._storeInt((_34_ + 564), ((this._storeInt8((_34_ + 528), _31_)) + (_33_ = this._loadInt((_34_ + 564)))));
                                                this._storeInt((_34_ + 556), (this._loadInt8s((_33_ + 1))));
                                                break label$37;
                                            }
                                            while (false);
                                            this._storeInt8((_34_ + 529), (this._storeInt8((_34_ + 528), _32_)));
                                            break label$37;
                                        }
                                        while (false);
                                        this._storeInt8((_34_ + 528), _32_);
                                    }
                                    while (false);
                                    _31_ = this._storeInt((_34_ + 500), 60720);
                                    _33_ = this._storeInt((_34_ + 540), (this._storeInt8((_34_ + 142), _32_)));
                                    label$40:
                                    do {
                                        label$42:
                                        do {
                                            label$41:
                                            while (true) {
                                                if ((this._loadInt((_34_ + 540))) > 22) {
                                                    break label$40;
                                                }
                                                if ((this._loadInt((_34_ + 556))) == (this._loadInt8s((((this._loadInt((_34_ + 540))) * 6) + 60720)))) {
                                                    break label$42;
                                                }
                                                this._storeInt((_34_ + 540), ((this._loadInt((_34_ + 540))) + 1));
                                                continue label$41;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_34_ + 500), (((this._loadInt((_34_ + 540))) * 6) + _31_));
                                        label$43:
                                        do {
                                            if ((this._loadInt((_34_ + 568))) != 0) {
                                                break label$43;
                                            }
                                            if (((this._loadInt8u(((this._loadInt((_34_ + 500))) + 2))) & 2) != 0) {
                                                break label$5;
                                            }
                                        }
                                        while (false);
                                        this._storeInt8((_34_ + 142), (this._loadInt8u(((this._loadInt((_34_ + 500))) + 3))));
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 136), _33_);
                                    label$44:
                                    do {
                                        if ((this._loadInt((_34_ + 548))) < 311) {
                                            break label$44;
                                        }
                                        if (((this._loadInt8u(((this._loadInt((_34_ + 500))) + 2))) & 4) != 0) {
                                            break label$44;
                                        }
                                        this._storeInt((_34_ + 548), 310);
                                    }
                                    while (false);
                                    if (((_32_ = (this._loadInt8u((_34_ + 142))) + -1) & 4294967295L) > (15 & 4294967295L)) {
                                        break label$5;
                                    }
                                    label$45:
                                    do {
                                        label$46:
                                        do {
                                            label$47:
                                            do {
                                                label$48:
                                                do {
                                                    label$49:
                                                    do {
                                                        label$50:
                                                        do {
                                                            label$51:
                                                            do {
                                                                label$52:
                                                                do {
                                                                    label$53:
                                                                    do {
                                                                        label$54:
                                                                        do {
                                                                            label$55:
                                                                            do {
                                                                                label$56:
                                                                                do {
                                                                                    label$57:
                                                                                    do {
                                                                                        label$58:
                                                                                        do {
                                                                                            label$59:
                                                                                            do {
                                                                                                label$60:
                                                                                                do {
                                                                                                    label$61:
                                                                                                    do {
                                                                                                        label$62:
                                                                                                        do {
                                                                                                            label$63:
                                                                                                            do {
                                                                                                                label$64:
                                                                                                                do {
                                                                                                                    label$65:
                                                                                                                    do {
                                                                                                                        label$66:
                                                                                                                        do {
                                                                                                                            label$67:
                                                                                                                            do {
                                                                                                                                label$68:
                                                                                                                                do {
                                                                                                                                    label$69:
                                                                                                                                    do {
                                                                                                                                        label$70:
                                                                                                                                        do {
                                                                                                                                            label$71:
                                                                                                                                            do {
                                                                                                                                                label$72:
                                                                                                                                                do {
                                                                                                                                                    label$73:
                                                                                                                                                    do {
                                                                                                                                                        label$74:
                                                                                                                                                        do {
                                                                                                                                                            switch (_32_) {
                                                                                                                                                                case 0:
                                                                                                                                                                case 15: {
                                                                                                                                                                    break label$62;
                                                                                                                                                                }
                                                                                                                                                                case 1:
                                                                                                                                                                case 2:
                                                                                                                                                                case 3: {
                                                                                                                                                                    break label$74;
                                                                                                                                                                }
                                                                                                                                                                case 4: {
                                                                                                                                                                    break label$68;
                                                                                                                                                                }
                                                                                                                                                                case 5:
                                                                                                                                                                case 6: {
                                                                                                                                                                    break label$72;
                                                                                                                                                                }
                                                                                                                                                                case 7: {
                                                                                                                                                                    break label$67;
                                                                                                                                                                }
                                                                                                                                                                case 8: {
                                                                                                                                                                    break label$66;
                                                                                                                                                                }
                                                                                                                                                                case 9:
                                                                                                                                                                case 10:
                                                                                                                                                                case 14: {
                                                                                                                                                                    break label$73;
                                                                                                                                                                }
                                                                                                                                                                case 11: {
                                                                                                                                                                    break label$65;
                                                                                                                                                                }
                                                                                                                                                                case 12: {
                                                                                                                                                                    break label$64;
                                                                                                                                                                }
                                                                                                                                                                case 13: {
                                                                                                                                                                    break label$63;
                                                                                                                                                                }
                                                                                                                                                                default: {
                                                                                                                                                                    break label$62;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        while (false);
                                                                                                                                                        this._storeInt((_34_ + 560), ((_32_ = ((this._loadInt((_34_ + 560))) + 7) & -8) + 8));
                                                                                                                                                        this._storeDouble((_34_ + 504), (this._loadDouble(_32_)));
                                                                                                                                                        label$75:
                                                                                                                                                        do {
                                                                                                                                                            if ((this._loadInt((_34_ + 548))) > -1) {
                                                                                                                                                                break label$75;
                                                                                                                                                            }
                                                                                                                                                            this._storeInt((_34_ + 548), 6);
                                                                                                                                                        }
                                                                                                                                                        while (false);
                                                                                                                                                        label$76:
                                                                                                                                                        do {
                                                                                                                                                            if ((this._loadInt((_34_ + 548))) < 166) {
                                                                                                                                                                break label$76;
                                                                                                                                                            }
                                                                                                                                                            this._storeInt((_34_ + 548), 165);
                                                                                                                                                        }
                                                                                                                                                        while (false);
                                                                                                                                                        if (((((_35_ = this._loadDouble((_34_ + 504))) >= 0.0) ? 1 : 0) | ((_35_ != _35_) ? 1 : 0)) != 0) {
                                                                                                                                                            break label$71;
                                                                                                                                                        }
                                                                                                                                                        this._storeDouble((_34_ + 504), (-(this._loadDouble((_34_ + 504)))));
                                                                                                                                                        this._storeInt8((_34_ + 143), 45);
                                                                                                                                                        break label$54;
                                                                                                                                                    }
                                                                                                                                                    while (false);
                                                                                                                                                    _temp$0 = 34;
                                                                                                                                                    _temp$1 = 39;
                                                                                                                                                    _temp$2 = ((this._loadInt8u((_34_ + 142))) == 15) ? _temp$0 : _temp$1;
                                                                                                                                                    this._storeInt8((_34_ + 42), _temp$2);
                                                                                                                                                    this._storeInt((_34_ + 560), ((_32_ = this._loadInt((_34_ + 560))) + 4));
                                                                                                                                                    this._storeInt((_34_ + 48), (((_32_ = this._storeInt((_34_ + 36), (this._loadInt(_32_)))) == 0) ? 1 : 0));
                                                                                                                                                    label$77:
                                                                                                                                                    do {
                                                                                                                                                        if (_32_ != 0) {
                                                                                                                                                            break label$77;
                                                                                                                                                        }
                                                                                                                                                        _temp$3 = 53536;
                                                                                                                                                        _temp$4 = 61008;
                                                                                                                                                        _temp$5 = ((this._loadInt8u((_34_ + 142))) == 11) ? _temp$3 : _temp$4;
                                                                                                                                                        this._storeInt((_34_ + 36), _temp$5);
                                                                                                                                                    }
                                                                                                                                                    while (false);
                                                                                                                                                    this._storeInt((_34_ + 56), (this._loadInt((_34_ + 548))));
                                                                                                                                                    _32_ = this._storeInt((_34_ + 64), (this._storeInt((_34_ + 52), _33_)));
                                                                                                                                                    label$79:
                                                                                                                                                    do {
                                                                                                                                                        label$78:
                                                                                                                                                        while (true) {
                                                                                                                                                            _33_ = 0;
                                                                                                                                                            label$80:
                                                                                                                                                            do {
                                                                                                                                                                if ((this._loadInt((_34_ + 56))) == 0) {
                                                                                                                                                                    break label$80;
                                                                                                                                                                }
                                                                                                                                                                _33_ = ((this._storeInt8((_34_ + 43), (this._loadInt8u(((this._loadInt((_34_ + 36))) + (this._loadInt((_34_ + 64)))))))) != _32_) ? 1 : 0;
                                                                                                                                                            }
                                                                                                                                                            while (false);
                                                                                                                                                            if (_33_ == 0) {
                                                                                                                                                                break label$79;
                                                                                                                                                            }
                                                                                                                                                            label$81:
                                                                                                                                                            do {
                                                                                                                                                                if ((this._loadInt8s((_34_ + 43))) != (this._loadInt8s((_34_ + 42)))) {
                                                                                                                                                                    break label$81;
                                                                                                                                                                }
                                                                                                                                                                this._storeInt((_34_ + 52), ((this._loadInt((_34_ + 52))) + 1));
                                                                                                                                                            }
                                                                                                                                                            while (false);
                                                                                                                                                            this._storeInt((_34_ + 64), ((this._loadInt((_34_ + 64))) + 1));
                                                                                                                                                            this._storeInt((_34_ + 56), ((this._loadInt((_34_ + 56))) + -1));
                                                                                                                                                            continue label$78;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    while (false);
                                                                                                                                                    _33_ = 0;
                                                                                                                                                    label$82:
                                                                                                                                                    do {
                                                                                                                                                        if ((this._loadInt((_34_ + 48))) != 0) {
                                                                                                                                                            break label$82;
                                                                                                                                                        }
                                                                                                                                                        _33_ = ((this._loadInt8u((_34_ + 142))) == 11) ? 1 : 0;
                                                                                                                                                    }
                                                                                                                                                    while (false);
                                                                                                                                                    this._storeInt((_34_ + 44), _33_);
                                                                                                                                                    if ((this._storeInt((_34_ + 52), (((this._loadInt((_34_ + 52))) + ((this._loadInt((_34_ + 64))) + (_33_ << 1))) + 1))) < 351) {
                                                                                                                                                        break label$70;
                                                                                                                                                    }
                                                                                                                                                    if ((this._storeInt((_34_ + 552), (this._storeInt((_34_ + 136), (sqlite3Malloc((this._loadInt((_34_ + 52))))))))) != 0) {
                                                                                                                                                        break label$69;
                                                                                                                                                    }
                                                                                                                                                    break label$10;
                                                                                                                                                }
                                                                                                                                                while (false);
                                                                                                                                                this._storeInt((_34_ + 560), ((_32_ = this._loadInt((_34_ + 560))) + 4));
                                                                                                                                                if ((this._storeInt((_34_ + 552), (this._loadInt(_32_)))) == 0) {
                                                                                                                                                    break label$61;
                                                                                                                                                }
                                                                                                                                                if ((this._loadInt8u((_34_ + 142))) != 7) {
                                                                                                                                                    break label$60;
                                                                                                                                                }
                                                                                                                                                this._storeInt((_34_ + 136), (this._loadInt((_34_ + 552))));
                                                                                                                                                break label$60;
                                                                                                                                            }
                                                                                                                                            while (false);
                                                                                                                                            if ((this._loadInt8u((_34_ + 534))) == 0) {
                                                                                                                                                break label$59;
                                                                                                                                            }
                                                                                                                                            this._storeInt8((_34_ + 143), 43);
                                                                                                                                            break label$54;
                                                                                                                                        }
                                                                                                                                        while (false);
                                                                                                                                        this._storeInt((_34_ + 552), (_34_ + 144));
                                                                                                                                    }
                                                                                                                                    while (false);
                                                                                                                                    _33_ = this._storeInt((_34_ + 60), _32_);
                                                                                                                                    label$83:
                                                                                                                                    do {
                                                                                                                                        if ((this._loadInt((_34_ + 44))) == 0) {
                                                                                                                                            break label$83;
                                                                                                                                        }
                                                                                                                                        _32_ = this._loadInt8u((_34_ + 42));
                                                                                                                                        this._storeInt((_34_ + 60), ((_31_ = this._loadInt((_34_ + 60))) + 1));
                                                                                                                                        this._storeInt8((_31_ + (this._loadInt((_34_ + 552)))), _32_);
                                                                                                                                    }
                                                                                                                                    while (false);
                                                                                                                                    this._storeInt((_34_ + 56), (this._loadInt((_34_ + 64))));
                                                                                                                                    _31_ = this._storeInt((_34_ + 64), _33_);
                                                                                                                                    label$85:
                                                                                                                                    do {
                                                                                                                                        label$84:
                                                                                                                                        while (true) {
                                                                                                                                            if ((this._loadInt((_34_ + 64))) >= (this._loadInt((_34_ + 56)))) {
                                                                                                                                                break label$85;
                                                                                                                                            }
                                                                                                                                            _33_ = this._storeInt8((_34_ + 43), (this._loadInt8u(((this._loadInt((_34_ + 36))) + (this._loadInt((_34_ + 64)))))));
                                                                                                                                            this._storeInt((_34_ + 60), ((_32_ = this._loadInt((_34_ + 60))) + 1));
                                                                                                                                            this._storeInt8((_32_ + (this._loadInt((_34_ + 552)))), _33_);
                                                                                                                                            label$86:
                                                                                                                                            do {
                                                                                                                                                if ((this._loadInt8s((_34_ + 43))) != (this._loadInt8s((_34_ + 42)))) {
                                                                                                                                                    break label$86;
                                                                                                                                                }
                                                                                                                                                _33_ = this._loadInt8u((_34_ + 43));
                                                                                                                                                this._storeInt((_34_ + 60), ((_32_ = this._loadInt((_34_ + 60))) + 1));
                                                                                                                                                this._storeInt8((_32_ + (this._loadInt((_34_ + 552)))), _33_);
                                                                                                                                            }
                                                                                                                                            while (false);
                                                                                                                                            this._storeInt((_34_ + 64), ((this._loadInt((_34_ + 64))) + 1));
                                                                                                                                            continue label$84;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    while (false);
                                                                                                                                    label$87:
                                                                                                                                    do {
                                                                                                                                        if ((this._loadInt((_34_ + 44))) == 0) {
                                                                                                                                            break label$87;
                                                                                                                                        }
                                                                                                                                        _33_ = this._loadInt8u((_34_ + 42));
                                                                                                                                        this._storeInt((_34_ + 60), ((_32_ = this._loadInt((_34_ + 60))) + 1));
                                                                                                                                        this._storeInt8((_32_ + (this._loadInt((_34_ + 552)))), _33_);
                                                                                                                                    }
                                                                                                                                    while (false);
                                                                                                                                    this._storeInt8(((this._loadInt((_34_ + 552))) + (_33_ = this._loadInt((_34_ + 60)))), _31_);
                                                                                                                                    this._storeInt((_34_ + 544), _33_);
                                                                                                                                    break label$2;
                                                                                                                                }
                                                                                                                                while (false);
                                                                                                                                _32_ = this._loadInt((_34_ + 572));
                                                                                                                                this._storeInt((_34_ + 560), ((_31_ = this._loadInt((_34_ + 560))) + 4));
                                                                                                                                this._storeInt((this._loadInt(_31_)), (this._loadInt((_32_ + 12))));
                                                                                                                                this._storeInt((_34_ + 544), (this._storeInt((_34_ + 536), _33_)));
                                                                                                                                break label$2;
                                                                                                                            }
                                                                                                                            while (false);
                                                                                                                            this._storeInt8((_34_ + 144), 37);
                                                                                                                            this._storeInt((_34_ + 552), (_34_ + 144));
                                                                                                                            this._storeInt((_34_ + 544), 1);
                                                                                                                            break label$2;
                                                                                                                        }
                                                                                                                        while (false);
                                                                                                                        this._storeInt((_34_ + 560), ((_32_ = this._loadInt((_34_ + 560))) + 4));
                                                                                                                        this._storeInt8((_34_ + 144), (this._storeInt((_34_ + 556), (this._loadInt(_32_)))));
                                                                                                                        if ((this._loadInt((_34_ + 548))) < _33_) {
                                                                                                                            break label$56;
                                                                                                                        }
                                                                                                                        _32_ = this._storeInt((_34_ + 540), 1);
                                                                                                                        label$89:
                                                                                                                        do {
                                                                                                                            label$88:
                                                                                                                            while (true) {
                                                                                                                                if ((this._loadInt((_34_ + 540))) >= (this._loadInt((_34_ + 548)))) {
                                                                                                                                    break label$89;
                                                                                                                                }
                                                                                                                                this._storeInt8(((_34_ + 144) + (_33_ = this._loadInt((_34_ + 540)))), (this._loadInt((_34_ + 556))));
                                                                                                                                this._storeInt((_34_ + 540), (_33_ + _32_));
                                                                                                                                continue label$88;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        while (false);
                                                                                                                        this._storeInt((_34_ + 544), (this._loadInt((_34_ + 548))));
                                                                                                                        this._storeInt((_34_ + 552), (_34_ + 144));
                                                                                                                        break label$2;
                                                                                                                    }
                                                                                                                    while (false);
                                                                                                                    this._storeInt((_34_ + 560), ((_32_ = this._loadInt((_34_ + 560))) + 4));
                                                                                                                    label$90:
                                                                                                                    do {
                                                                                                                        if ((this._storeInt((_34_ + 32), (this._loadInt(_32_)))) == 0) {
                                                                                                                            break label$90;
                                                                                                                        }
                                                                                                                        sqlite3StrAccumAppend((this._loadInt((_34_ + 572))), (this._loadInt((_32_ = this._loadInt((_34_ + 32))))), (this._loadInt((_32_ + 4))));
                                                                                                                    }
                                                                                                                    while (false);
                                                                                                                    this._storeInt((_34_ + 544), (this._storeInt((_34_ + 536), _33_)));
                                                                                                                    break label$2;
                                                                                                                }
                                                                                                                while (false);
                                                                                                                this._storeInt((_34_ + 560), ((_32_ = this._loadInt((_34_ + 560))) + 4));
                                                                                                                this._storeInt((_34_ + 28), (this._loadInt(_32_)));
                                                                                                                this._storeInt((_34_ + 560), ((_32_ = this._loadInt((_34_ + 560))) + 4));
                                                                                                                _32_ = this._storeInt((_34_ + 24), (this._loadInt(_32_)));
                                                                                                                label$91:
                                                                                                                do {
                                                                                                                    if ((this._loadInt((this._storeInt((_34_ + 20), (((this._loadInt((_34_ + 28))) + (_32_ * 56)) + 8))))) == 0) {
                                                                                                                        break label$91;
                                                                                                                    }
                                                                                                                    sqlite3StrAccumAppend((this._loadInt((_34_ + 572))), (this._loadInt((this._loadInt((_34_ + 20))))), -1);
                                                                                                                    sqlite3StrAccumAppend((this._loadInt((_34_ + 572))), 22336, 1);
                                                                                                                }
                                                                                                                while (false);
                                                                                                                sqlite3StrAccumAppend((this._loadInt((_34_ + 572))), (this._loadInt(((this._loadInt((_34_ + 20))) + 4))), -1);
                                                                                                                this._storeInt((_34_ + 544), (this._storeInt((_34_ + 536), _33_)));
                                                                                                                break label$2;
                                                                                                            }
                                                                                                            while (false);
                                                                                                            this._storeInt8((_34_ + 528), _33_);
                                                                                                            this._storeInt8((_34_ + 529), 1);
                                                                                                        }
                                                                                                        while (false);
                                                                                                        label$92:
                                                                                                        do {
                                                                                                            if (((this._loadInt8u(((this._loadInt((_34_ + 500))) + 2))) & 1) == 0) {
                                                                                                                break label$92;
                                                                                                            }
                                                                                                            if ((this._loadInt8u((_34_ + 528))) == 0) {
                                                                                                                break label$58;
                                                                                                            }
                                                                                                            this._storeInt((_34_ + 560), ((_32_ = ((this._loadInt((_34_ + 560))) + 7) & -8) + 8));
                                                                                                            this._storeLong((_34_ + 96), (this._loadLong(_32_)));
                                                                                                            break label$52;
                                                                                                        }
                                                                                                        while (false);
                                                                                                        if ((this._loadInt8u((_34_ + 528))) == 0) {
                                                                                                            break label$57;
                                                                                                        }
                                                                                                        this._storeInt((_34_ + 560), ((_32_ = ((this._loadInt((_34_ + 560))) + 7) & -8) + 8));
                                                                                                        this._storeLong((_34_ + 512), (this._loadLong(_32_)));
                                                                                                        break label$50;
                                                                                                    }
                                                                                                    while (false);
                                                                                                    this._storeInt((_34_ + 552), 21392);
                                                                                                }
                                                                                                while (false);
                                                                                                label$93:
                                                                                                do {
                                                                                                    if ((this._loadInt((_34_ + 548))) < _33_) {
                                                                                                        break label$93;
                                                                                                    }
                                                                                                    _32_ = this._storeInt((_34_ + 544), _33_);
                                                                                                    label$94:
                                                                                                    while (true) {
                                                                                                        _33_ = 0;
                                                                                                        label$96:
                                                                                                        do {
                                                                                                            if ((this._loadInt((_34_ + 544))) >= (this._loadInt((_34_ + 548)))) {
                                                                                                                break label$96;
                                                                                                            }
                                                                                                            _33_ = ((this._loadInt8s(((this._loadInt((_34_ + 552))) + (this._loadInt((_34_ + 544)))))) != _32_) ? 1 : 0;
                                                                                                        }
                                                                                                        while (false);
                                                                                                        if (_33_ == 0) {
                                                                                                            break label$2;
                                                                                                        }
                                                                                                        this._storeInt((_34_ + 544), ((this._loadInt((_34_ + 544))) + 1));
                                                                                                        continue label$94;
                                                                                                    }
                                                                                                }
                                                                                                while (false);
                                                                                                this._storeInt((_34_ + 544), (sqlite3Strlen30((this._loadInt((_34_ + 552))))));
                                                                                                break label$2;
                                                                                            }
                                                                                            while (false);
                                                                                            if ((this._loadInt8u((_34_ + 533))) == 0) {
                                                                                                break label$55;
                                                                                            }
                                                                                            this._storeInt8((_34_ + 143), 32);
                                                                                            break label$54;
                                                                                        }
                                                                                        while (false);
                                                                                        if ((this._loadInt8u((_34_ + 529))) == 0) {
                                                                                            break label$53;
                                                                                        }
                                                                                        this._storeInt((_34_ + 560), ((_32_ = this._loadInt((_34_ + 560))) + 4));
                                                                                        this._storeLong((_34_ + 96), (this._loadLong32s(_32_)));
                                                                                        break label$52;
                                                                                    }
                                                                                    while (false);
                                                                                    if ((this._loadInt8u((_34_ + 529))) == 0) {
                                                                                        break label$51;
                                                                                    }
                                                                                    this._storeInt((_34_ + 560), ((_32_ = this._loadInt((_34_ + 560))) + 4));
                                                                                    this._storeLong((_34_ + 512), (this._loadLong32u(_32_)));
                                                                                    break label$50;
                                                                                }
                                                                                while (false);
                                                                                this._storeInt((_34_ + 544), 1);
                                                                                this._storeInt((_34_ + 552), (_34_ + 144));
                                                                                break label$2;
                                                                            }
                                                                            while (false);
                                                                            this._storeInt8((_34_ + 143), _33_);
                                                                        }
                                                                        while (false);
                                                                        label$97:
                                                                        do {
                                                                            if ((this._loadInt8u((_34_ + 142))) != 4) {
                                                                                break label$97;
                                                                            }
                                                                            if ((this._loadInt((_34_ + 548))) < 1) {
                                                                                break label$97;
                                                                            }
                                                                            this._storeInt((_34_ + 548), ((this._loadInt((_34_ + 548))) + -1));
                                                                        }
                                                                        while (false);
                                                                        this._storeInt((_34_ + 540), (this._loadInt((_34_ + 548))));
                                                                        this._storeLong((_34_ + 120), 4602678819172646912L);
                                                                        label$99:
                                                                        do {
                                                                            label$98:
                                                                            while (true) {
                                                                                if ((this._loadInt((_34_ + 540))) < 1) {
                                                                                    break label$99;
                                                                                }
                                                                                this._storeInt((_34_ + 540), ((this._loadInt((_34_ + 540))) + -1));
                                                                                this._storeDouble((_34_ + 120), ((this._loadDouble((_34_ + 120))) * 0.1));
                                                                                continue label$98;
                                                                            }
                                                                        }
                                                                        while (false);
                                                                        label$100:
                                                                        do {
                                                                            if ((this._loadInt8u((_34_ + 142))) != 2) {
                                                                                break label$100;
                                                                            }
                                                                            this._storeDouble((_34_ + 504), ((this._loadDouble((_34_ + 504))) + (this._loadDouble((_34_ + 120)))));
                                                                        }
                                                                        while (false);
                                                                        _32_ = this._storeInt((_34_ + 132), _33_);
                                                                        label$101:
                                                                        do {
                                                                            if ((sqlite3IsNaN((this._loadDouble((_34_ + 504))))) == 0) {
                                                                                break label$101;
                                                                            }
                                                                            this._storeInt((_34_ + 552), 60944);
                                                                            this._storeInt((_34_ + 544), 3);
                                                                            break label$2;
                                                                        }
                                                                        while (false);
                                                                        label$102:
                                                                        do {
                                                                            if (((((_35_ = this._loadDouble((_34_ + 504))) <= 0.0) ? 1 : 0) | ((_35_ != _35_) ? 1 : 0)) != 0) {
                                                                                break label$102;
                                                                            }
                                                                            label$104:
                                                                            do {
                                                                                label$103:
                                                                                while (true) {
                                                                                    _33_ = 0;
                                                                                    label$105:
                                                                                    do {
                                                                                        if (((((_35_ = this._loadDouble((_34_ + 504))) < 1.0E32) ? 1 : 0) | ((_35_ != _35_) ? 1 : 0)) != 0) {
                                                                                            break label$105;
                                                                                        }
                                                                                        _33_ = ((this._loadInt((_34_ + 132))) < 351) ? 1 : 0;
                                                                                    }
                                                                                    while (false);
                                                                                    if (_33_ == 0) {
                                                                                        break label$104;
                                                                                    }
                                                                                    this._storeDouble((_34_ + 504), ((this._loadDouble((_34_ + 504))) * 1.0E-32));
                                                                                    this._storeInt((_34_ + 132), ((this._loadInt((_34_ + 132))) + 32));
                                                                                    continue label$103;
                                                                                }
                                                                            }
                                                                            while (false);
                                                                            label$107:
                                                                            do {
                                                                                label$106:
                                                                                while (true) {
                                                                                    _33_ = 0;
                                                                                    label$108:
                                                                                    do {
                                                                                        if (((((_35_ = this._loadDouble((_34_ + 504))) < 1.0E8) ? 1 : 0) | ((_35_ != _35_) ? 1 : 0)) != 0) {
                                                                                            break label$108;
                                                                                        }
                                                                                        _33_ = ((this._loadInt((_34_ + 132))) < 351) ? 1 : 0;
                                                                                    }
                                                                                    while (false);
                                                                                    if (_33_ == 0) {
                                                                                        break label$107;
                                                                                    }
                                                                                    this._storeDouble((_34_ + 504), ((this._loadDouble((_34_ + 504))) * 1.0E-8));
                                                                                    this._storeInt((_34_ + 132), ((this._loadInt((_34_ + 132))) + 8));
                                                                                    continue label$106;
                                                                                }
                                                                            }
                                                                            while (false);
                                                                            label$110:
                                                                            do {
                                                                                label$109:
                                                                                while (true) {
                                                                                    _33_ = 0;
                                                                                    label$111:
                                                                                    do {
                                                                                        if (((((_35_ = this._loadDouble((_34_ + 504))) < 10.0) ? 1 : 0) | ((_35_ != _35_) ? 1 : 0)) != 0) {
                                                                                            break label$111;
                                                                                        }
                                                                                        _33_ = ((this._loadInt((_34_ + 132))) < 351) ? 1 : 0;
                                                                                    }
                                                                                    while (false);
                                                                                    if (_33_ == 0) {
                                                                                        break label$110;
                                                                                    }
                                                                                    this._storeDouble((_34_ + 504), ((this._loadDouble((_34_ + 504))) * 0.1));
                                                                                    this._storeInt((_34_ + 132), ((this._loadInt((_34_ + 132))) + 1));
                                                                                    continue label$109;
                                                                                }
                                                                            }
                                                                            while (false);
                                                                            label$113:
                                                                            do {
                                                                                label$112:
                                                                                while (true) {
                                                                                    if (((((_35_ = this._loadDouble((_34_ + 504))) >= 1.0E-8) ? 1 : 0) | ((_35_ != _35_) ? 1 : 0)) != 0) {
                                                                                        break label$113;
                                                                                    }
                                                                                    this._storeDouble((_34_ + 504), ((this._loadDouble((_34_ + 504))) * 1.0E8));
                                                                                    this._storeInt((_34_ + 132), ((this._loadInt((_34_ + 132))) + -8));
                                                                                    continue label$112;
                                                                                }
                                                                            }
                                                                            while (false);
                                                                            label$115:
                                                                            do {
                                                                                label$114:
                                                                                while (true) {
                                                                                    if (((((_35_ = this._loadDouble((_34_ + 504))) >= 1.0) ? 1 : 0) | ((_35_ != _35_) ? 1 : 0)) != 0) {
                                                                                        break label$115;
                                                                                    }
                                                                                    this._storeDouble((_34_ + 504), ((this._loadDouble((_34_ + 504))) * 10.0));
                                                                                    this._storeInt((_34_ + 132), ((this._loadInt((_34_ + 132))) + -1));
                                                                                    continue label$114;
                                                                                }
                                                                            }
                                                                            while (false);
                                                                            if ((this._loadInt((_34_ + 132))) < 351) {
                                                                                break label$102;
                                                                            }
                                                                            if ((this._loadInt8s((_34_ + 143))) != 45) {
                                                                                break label$49;
                                                                            }
                                                                            this._storeInt((_34_ + 552), 60960);
                                                                            break label$45;
                                                                        }
                                                                        while (false);
                                                                        this._storeInt((_34_ + 552), (_34_ + 144));
                                                                        this._storeInt8((_34_ + 117), (((this._loadInt8u((_34_ + 142))) == 3) ? 1 : 0));
                                                                        label$116:
                                                                        do {
                                                                            if ((this._loadInt8u((_34_ + 142))) == 2) {
                                                                                break label$116;
                                                                            }
                                                                            if (((((_35_ = this._storeDouble((_34_ + 504), ((this._loadDouble((_34_ + 504))) + (this._loadDouble((_34_ + 120)))))) < 10.0) ? 1 : 0) | ((_35_ != _35_) ? 1 : 0)) != 0) {
                                                                                break label$116;
                                                                            }
                                                                            this._storeDouble((_34_ + 504), ((this._loadDouble((_34_ + 504))) * 0.1));
                                                                            this._storeInt((_34_ + 132), ((this._loadInt((_34_ + 132))) + 1));
                                                                        }
                                                                        while (false);
                                                                        label$117:
                                                                        do {
                                                                            if ((this._loadInt8u((_34_ + 142))) != 4) {
                                                                                break label$117;
                                                                            }
                                                                            this._storeInt8((_34_ + 118), (((this._loadInt8u((_34_ + 532))) == 0) ? 1 : 0));
                                                                            label$118:
                                                                            do {
                                                                                if ((this._loadInt((_34_ + 132))) < -4) {
                                                                                    break label$118;
                                                                                }
                                                                                if ((this._loadInt((_34_ + 132))) <= (this._loadInt((_34_ + 548)))) {
                                                                                    break label$47;
                                                                                }
                                                                            }
                                                                            while (false);
                                                                            this._storeInt8((_34_ + 142), 3);
                                                                            break label$3;
                                                                        }
                                                                        while (false);
                                                                        this._storeInt8((_34_ + 118), _32_);
                                                                        break label$3;
                                                                    }
                                                                    while (false);
                                                                    this._storeInt((_34_ + 560), ((_32_ = this._loadInt((_34_ + 560))) + 4));
                                                                    this._storeLong((_34_ + 96), (this._loadLong32s(_32_)));
                                                                }
                                                                while (false);
                                                                label$119:
                                                                do {
                                                                    label$120:
                                                                    do {
                                                                        label$121:
                                                                        do {
                                                                            if ((this._loadLong((_34_ + 96))) <= -1L) {
                                                                                break label$121;
                                                                            }
                                                                            this._storeLong((_34_ + 512), (this._loadLong((_34_ + 96))));
                                                                            if ((this._loadInt8u((_34_ + 534))) == 0) {
                                                                                break label$120;
                                                                            }
                                                                            this._storeInt8((_34_ + 143), 43);
                                                                            break label$4;
                                                                        }
                                                                        while (false);
                                                                        if ((this._loadLong((_34_ + 96))) != -9223372036854775808L) {
                                                                            break label$119;
                                                                        }
                                                                        this._storeLong((_34_ + 512), -9223372036854775808L);
                                                                        this._storeInt8((_34_ + 143), 45);
                                                                        break label$4;
                                                                    }
                                                                    while (false);
                                                                    if ((this._loadInt8u((_34_ + 533))) == 0) {
                                                                        break label$48;
                                                                    }
                                                                    this._storeInt8((_34_ + 143), 32);
                                                                    break label$4;
                                                                }
                                                                while (false);
                                                                this._storeLong((_34_ + 512), (0L - (this._loadLong((_34_ + 96)))));
                                                                this._storeInt8((_34_ + 143), 45);
                                                                break label$4;
                                                            }
                                                            while (false);
                                                            this._storeInt((_34_ + 560), ((_32_ = this._loadInt((_34_ + 560))) + 4));
                                                            this._storeLong((_34_ + 512), (this._loadLong32u(_32_)));
                                                        }
                                                        while (false);
                                                        this._storeInt8((_34_ + 143), _33_);
                                                        break label$4;
                                                    }
                                                    while (false);
                                                    if ((this._loadInt8s((_34_ + 143))) != 43) {
                                                        break label$46;
                                                    }
                                                    this._storeInt((_34_ + 552), 60976);
                                                    break label$45;
                                                }
                                                while (false);
                                                this._storeInt8((_34_ + 143), _33_);
                                                break label$4;
                                            }
                                            while (false);
                                            this._storeInt((_34_ + 548), ((this._loadInt((_34_ + 548))) - (this._loadInt((_34_ + 132)))));
                                            this._storeInt8((_34_ + 142), 2);
                                            break label$3;
                                        }
                                        while (false);
                                        this._storeInt((_34_ + 552), 60992);
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 544), (sqlite3Strlen30((this._loadInt((_34_ + 552))))));
                                    break label$2;
                                }
                                while (false);
                                sqlite3StrAccumAppend((this._loadInt((_34_ + 572))), 60704, 1);
                                break label$5;
                            }
                            while (false);
                            this._storeInt8(((this._loadInt((_34_ + 572))) + 24), 1);
                        }
                        while (false);
                        this._storeInt((0 + 4), (_34_ + 576));
                        return;
                    }
                    while (false);
                    label$122:
                    do {
                        if ((this._loadLong((_34_ + 512))) != 0L) {
                            break label$122;
                        }
                        this._storeInt8((_34_ + 532), _33_);
                    }
                    while (false);
                    label$123:
                    do {
                        if ((this._loadInt8u((_34_ + 530))) == 0) {
                            break label$123;
                        }
                        if ((this._loadInt((_34_ + 548))) >= ((this._loadInt((_34_ + 536))) - (((this._loadInt8s((_34_ + 143))) != _33_) ? 1 : 0))) {
                            break label$123;
                        }
                        this._storeInt((_34_ + 548), ((this._loadInt((_34_ + 536))) - (((this._loadInt8s((_34_ + 143))) != _33_) ? 1 : 0)));
                    }
                    while (false);
                    _32_ = this._storeInt((_34_ + 552), _36_);
                    label$124:
                    do {
                        if ((this._loadInt8u((_34_ + 142))) != 16) {
                            break label$124;
                        }
                        label$125:
                        do {
                            label$126:
                            do {
                                if ((this._storeInt((_34_ + 92), ((int) ((this._loadLong((_34_ + 512))) % 10L)))) > 3) {
                                    break label$126;
                                }
                                if ((((this._loadLong((_34_ + 512))) / 10L) % 10L) != 1L) {
                                    break label$125;
                                }
                            }
                            while (false);
                            this._storeInt((_34_ + 92), _33_);
                        }
                        while (false);
                        _33_ = this._loadInt((_34_ + 92));
                        this._storeInt((_34_ + 552), ((this._loadInt((_34_ + 552))) + -2));
                        this._storeInt8((_34_ + 491), (this._loadInt8u(((_33_ = _33_ << 1) + 60864))));
                        this._storeInt8((_34_ + 492), (this._loadInt8u((_33_ + 60865))));
                    }
                    while (false);
                    this._storeInt((_34_ + 88), ((this._loadInt8u(((this._loadInt((_34_ + 500))) + 4))) + 60880));
                    this._storeInt((_34_ + 84), (this._loadInt8u(((this._loadInt((_34_ + 500))) + 1))));
                    label$127$end:
                    do {
                        label$127:
                        while (true) {
                            _33_ = this._loadInt8u(((this._loadInt((_34_ + 88))) + ((int) ((this._loadLong((_34_ + 512))) % (this._loadLong32s((_34_ + 84)))))));
                            this._storeInt8((this._storeInt((_34_ + 552), ((this._loadInt((_34_ + 552))) + -1))), _33_);
                            if ((this._storeLong((_34_ + 512), ((this._loadLong((_34_ + 512))) / (this._loadLong32s((_34_ + 84)))))) != 0L) {
                                continue label$127;
                            }
                            break label$127$end;
                        }
                    }
                    while (false);
                    _33_ = this._storeInt((_34_ + 544), (_32_ - (this._loadInt((_34_ + 552)))));
                    this._storeInt((_34_ + 540), ((this._loadInt((_34_ + 548))) - _33_));
                    label$130:
                    do {
                        label$129:
                        while (true) {
                            if ((this._loadInt((_34_ + 540))) < 1) {
                                break label$130;
                            }
                            this._storeInt8((this._storeInt((_34_ + 552), ((this._loadInt((_34_ + 552))) + -1))), 48);
                            this._storeInt((_34_ + 540), ((this._loadInt((_34_ + 540))) + -1));
                            continue label$129;
                        }
                    }
                    while (false);
                    label$131:
                    do {
                        if ((this._loadInt8u((_34_ + 143))) == 0) {
                            break label$131;
                        }
                        _33_ = this._loadInt8u((_34_ + 143));
                        this._storeInt8((this._storeInt((_34_ + 552), ((this._loadInt((_34_ + 552))) + -1))), _33_);
                    }
                    while (false);
                    label$132:
                    do {
                        if ((this._loadInt8u((_34_ + 532))) == 0) {
                            break label$132;
                        }
                        if ((this._loadInt8u(((this._loadInt((_34_ + 500))) + 5))) == 0) {
                            break label$132;
                        }
                        this._storeInt((_34_ + 80), ((this._loadInt8u(((this._loadInt((_34_ + 500))) + 5))) + 60928));
                        label$134:
                        do {
                            label$133:
                            while (true) {
                                if ((this._storeInt8((_34_ + 79), (this._loadInt8u((this._loadInt((_34_ + 80))))))) == 0) {
                                    break label$134;
                                }
                                _33_ = this._loadInt8u((_34_ + 79));
                                this._storeInt8((this._storeInt((_34_ + 552), ((this._loadInt((_34_ + 552))) + -1))), _33_);
                                this._storeInt((_34_ + 80), ((this._loadInt((_34_ + 80))) + 1));
                                continue label$133;
                            }
                        }
                        while (false);
                    }
                    while (false);
                    this._storeInt((_34_ + 544), (_32_ - (this._loadInt((_34_ + 552)))));
                    break label$2;
                }
                while (false);
                label$135:
                do {
                    label$136:
                    do {
                        if ((this._loadInt8u((_34_ + 142))) != 3) {
                            break label$136;
                        }
                        this._storeInt((_34_ + 128), _32_);
                        break label$135;
                    }
                    while (false);
                    this._storeInt((_34_ + 128), (this._loadInt((_34_ + 132))));
                }
                while (false);
                _31_ = this._storeInt((_34_ + 112), _32_);
                this._storeInt8((_34_ + 119), (((((this._loadInt((_34_ + 548))) > _31_) ? 1 : 0) | (this._loadInt8u((_34_ + 532)))) | (this._loadInt8u((_34_ + 531)))));
                label$137:
                do {
                    if ((this._loadInt8u((_34_ + 143))) == 0) {
                        break label$137;
                    }
                    _33_ = this._loadInt8u((_34_ + 143));
                    this._storeInt((_34_ + 552), ((_32_ = this._loadInt((_34_ + 552))) + 1));
                    this._storeInt8(_32_, _33_);
                }
                while (false);
                label$138:
                do {
                    label$139:
                    do {
                        if ((this._loadInt((_34_ + 128))) > -1) {
                            break label$139;
                        }
                        this._storeInt((_34_ + 552), ((_33_ = this._loadInt((_34_ + 552))) + 1));
                        this._storeInt8(_33_, 48);
                        break label$138;
                    }
                    while (false);
                    label$141:
                    do {
                        label$140:
                        while (true) {
                            if ((this._loadInt((_34_ + 128))) < _31_) {
                                break label$141;
                            }
                            _33_ = et_getdigit((_34_ + 504), (_34_ + 112));
                            this._storeInt((_34_ + 552), ((_32_ = this._loadInt((_34_ + 552))) + 1));
                            this._storeInt8(_32_, _33_);
                            this._storeInt((_34_ + 128), ((this._loadInt((_34_ + 128))) + -1));
                            continue label$140;
                        }
                    }
                    while (false);
                }
                while (false);
                label$142:
                do {
                    if ((this._loadInt8u((_34_ + 119))) == 0) {
                        break label$142;
                    }
                    this._storeInt((_34_ + 552), ((_33_ = this._loadInt((_34_ + 552))) + 1));
                    this._storeInt8(_33_, 46);
                }
                while (false);
                this._storeInt((_34_ + 128), ((this._loadInt((_34_ + 128))) + 1));
                label$144:
                do {
                    label$143:
                    while (true) {
                        if ((this._loadInt((_34_ + 128))) > -1) {
                            break label$144;
                        }
                        this._storeInt((_34_ + 552), ((_33_ = this._loadInt((_34_ + 552))) + 1));
                        this._storeInt8(_33_, 48);
                        this._storeInt((_34_ + 548), ((this._loadInt((_34_ + 548))) + -1));
                        this._storeInt((_34_ + 128), ((this._loadInt((_34_ + 128))) + 1));
                        continue label$143;
                    }
                }
                while (false);
                label$146:
                do {
                    label$145:
                    while (true) {
                        this._storeInt((_34_ + 548), ((_33_ = this._loadInt((_34_ + 548))) + -1));
                        if (_33_ < 1) {
                            break label$146;
                        }
                        _33_ = et_getdigit((_34_ + 504), (_34_ + 112));
                        this._storeInt((_34_ + 552), ((_32_ = this._loadInt((_34_ + 552))) + 1));
                        this._storeInt8(_32_, _33_);
                        continue label$145;
                    }
                }
                while (false);
                label$147:
                do {
                    if ((this._loadInt8u((_34_ + 118))) == 0) {
                        break label$147;
                    }
                    if ((this._loadInt8u((_34_ + 119))) == 0) {
                        break label$147;
                    }
                    label$149:
                    do {
                        label$148:
                        while (true) {
                            if ((this._loadInt8s(((this._loadInt((_34_ + 552))) + -1))) != 48) {
                                break label$149;
                            }
                            this._storeInt8((this._storeInt((_34_ + 552), ((this._loadInt((_34_ + 552))) + -1))), _31_);
                            continue label$148;
                        }
                    }
                    while (false);
                    if ((this._loadInt8s(((this._loadInt((_34_ + 552))) + -1))) != 46) {
                        break label$147;
                    }
                    label$150:
                    do {
                        if ((this._loadInt8u((_34_ + 531))) == 0) {
                            break label$150;
                        }
                        this._storeInt((_34_ + 552), ((_33_ = this._loadInt((_34_ + 552))) + 1));
                        this._storeInt8(_33_, 48);
                        break label$147;
                    }
                    while (false);
                    this._storeInt8((this._storeInt((_34_ + 552), ((this._loadInt((_34_ + 552))) + -1))), _31_);
                }
                while (false);
                label$151:
                do {
                    label$152:
                    do {
                        if ((this._loadInt8u((_34_ + 117))) != 0) {
                            break label$152;
                        }
                        if ((this._loadInt8u((_34_ + 142))) != 3) {
                            break label$151;
                        }
                    }
                    while (false);
                    _33_ = this._loadInt((_34_ + 500));
                    this._storeInt((_34_ + 552), ((_32_ = this._loadInt((_34_ + 552))) + 1));
                    this._storeInt8(_32_, (this._loadInt8u(((this._loadInt8u((_33_ + 4))) + 60880))));
                    label$153:
                    do {
                        label$154:
                        do {
                            if ((this._loadInt((_34_ + 132))) <= -1) {
                                break label$154;
                            }
                            this._storeInt((_34_ + 552), ((_33_ = this._loadInt((_34_ + 552))) + 1));
                            this._storeInt8(_33_, 43);
                            break label$153;
                        }
                        while (false);
                        this._storeInt((_34_ + 552), ((_33_ = this._loadInt((_34_ + 552))) + 1));
                        this._storeInt8(_33_, 45);
                        this._storeInt((_34_ + 132), (_31_ - (this._loadInt((_34_ + 132)))));
                    }
                    while (false);
                    label$155:
                    do {
                        if ((this._loadInt((_34_ + 132))) < 100) {
                            break label$155;
                        }
                        _33_ = this._loadInt((_34_ + 132));
                        this._storeInt((_34_ + 552), ((_32_ = this._loadInt((_34_ + 552))) + 1));
                        this._storeInt8(_32_, ((_33_ / 100) + 48));
                        this._storeInt((_34_ + 132), ((this._loadInt((_34_ + 132))) % 100));
                    }
                    while (false);
                    _33_ = this._loadInt((_34_ + 132));
                    this._storeInt((_34_ + 552), ((_32_ = this._loadInt((_34_ + 552))) + 1));
                    this._storeInt8(_32_, ((_33_ / 10) + 48));
                    _33_ = this._loadInt((_34_ + 132));
                    this._storeInt((_34_ + 552), ((_32_ = this._loadInt((_34_ + 552))) + 1));
                    this._storeInt8(_32_, ((_33_ % 10) + 48));
                }
                while (false);
                this._storeInt8((this._loadInt((_34_ + 552))), _31_);
                this._storeInt((_34_ + 544), ((this._loadInt((_34_ + 552))) - (_34_ + 144)));
                this._storeInt((_34_ + 552), (_34_ + 144));
                if ((this._loadInt8u((_34_ + 530))) == 0) {
                    break label$2;
                }
                if ((this._loadInt8u((_34_ + 535))) != 0) {
                    break label$2;
                }
                if ((this._loadInt((_34_ + 544))) >= (this._loadInt((_34_ + 536)))) {
                    break label$2;
                }
                this._storeInt((_34_ + 68), ((this._loadInt((_34_ + 536))) - (this._loadInt((_34_ + 544)))));
                this._storeInt((_34_ + 72), (this._loadInt((_34_ + 536))));
                label$157:
                do {
                    label$156:
                    while (true) {
                        if ((this._loadInt((_34_ + 72))) < (this._loadInt((_34_ + 68)))) {
                            break label$157;
                        }
                        this._storeInt8(((_33_ = this._loadInt((_34_ + 552))) + (_32_ = this._loadInt((_34_ + 72)))), (this._loadInt8u((_33_ + (_32_ - (this._loadInt((_34_ + 68))))))));
                        this._storeInt((_34_ + 72), ((this._loadInt((_34_ + 72))) + -1));
                        continue label$156;
                    }
                }
                while (false);
                this._storeInt((_34_ + 72), (((this._loadInt8s((_34_ + 143))) != _31_) ? 1 : 0));
                label$159:
                do {
                    label$158:
                    while (true) {
                        this._storeInt((_34_ + 68), ((_33_ = this._loadInt((_34_ + 68))) + -1));
                        if (_33_ == 0) {
                            break label$159;
                        }
                        this._storeInt((_34_ + 72), ((_33_ = this._loadInt((_34_ + 72))) + 1));
                        this._storeInt8((_33_ + (this._loadInt((_34_ + 552)))), 48);
                        continue label$158;
                    }
                }
                while (false);
                this._storeInt((_34_ + 544), (this._loadInt((_34_ + 536))));
            }
            while (false);
            label$160:
            do {
                if ((this._loadInt8u((_34_ + 535))) != 0) {
                    break label$160;
                }
                if ((this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 536))) - (this._loadInt((_34_ + 544)))))) < 1) {
                    break label$160;
                }
                appendSpace((this._loadInt((_34_ + 572))), (this._loadInt((_34_ + 16))));
            }
            while (false);
            label$161:
            do {
                if ((this._loadInt((_34_ + 544))) < 1) {
                    break label$161;
                }
                sqlite3StrAccumAppend((this._loadInt((_34_ + 572))), (this._loadInt((_34_ + 552))), (this._loadInt((_34_ + 544))));
            }
            while (false);
            label$162:
            do {
                if ((this._loadInt8u((_34_ + 535))) == 0) {
                    break label$162;
                }
                if ((this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 536))) - (this._loadInt((_34_ + 544)))))) < 1) {
                    break label$162;
                }
                appendSpace((this._loadInt((_34_ + 572))), (this._loadInt((_34_ + 12))));
            }
            while (false);
            label$163:
            do {
                if ((this._loadInt((_34_ + 136))) == 0) {
                    break label$163;
                }
                sqlite3_free((this._loadInt((_34_ + 136))));
            }
            while (false);
            this._storeInt((_34_ + 564), ((this._loadInt((_34_ + 564))) + 1));
            continue label$0;
        }
    }

    @Override()
    public final int sqlite3StrAccumFinish(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 8))) == 0) {
                break label$0;
            }
            this._storeInt8(((this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 8))) + (this._loadInt((_30_ + 12)))), 0);
            if ((this._loadInt8u((_30_ + 25))) == 0) {
                break label$0;
            }
            if ((this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 8))) != (this._loadInt((_30_ + 4)))) {
                break label$0;
            }
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt8u(((this._loadInt((_31_ + 12))) + 25))) != 1) {
                        break label$2;
                    }
                    _30_ = sqlite3DbMallocRaw((this._loadInt((_30_ = this._loadInt((_31_ + 12))))), ((this._loadInt((_30_ + 12))) + 1));
                    this._storeInt(((this._loadInt((_31_ + 12))) + 8), _30_);
                    break label$1;
                }
                while (false);
                _30_ = sqlite3_malloc(((this._loadInt(((this._loadInt((_31_ + 12))) + 12))) + 1));
                this._storeInt(((this._loadInt((_31_ + 12))) + 8), _30_);
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 12))) + 8))) == 0) {
                    break label$3;
                }
                memcpy((this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 8))), (this._loadInt((_30_ + 4))), ((this._loadInt((_30_ + 12))) + 1));
                break label$0;
            }
            while (false);
            this._storeInt8(((this._loadInt((_31_ + 12))) + 24), 1);
        }
        while (false);
        _30_ = this._loadInt(((this._loadInt((_31_ + 12))) + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3DbMallocRaw(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_32_ + 24))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 30))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 28), 0);
                    break label$0;
                }
                while (false);
                if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 234))) == 0) {
                    break label$1;
                }
                label$3:
                do {
                    if ((this._loadInt((_32_ + 20))) <= (this._loadInt16u(((this._loadInt((_32_ + 24))) + 232)))) {
                        break label$3;
                    }
                    this._storeInt((_31_ = (this._loadInt((_32_ + 24))) + 248), ((this._loadInt(_31_)) + 1));
                    break label$1;
                }
                while (false);
                label$4:
                do {
                    if ((this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 24))) + 256))))) == 0) {
                        break label$4;
                    }
                    this._storeInt(((_31_ = this._loadInt((_32_ + 24))) + 256), (this._loadInt((this._loadInt((_32_ + 12))))));
                    this._storeInt((_31_ = _31_ + 236), ((this._loadInt(_31_)) + 1));
                    this._storeInt((_31_ = (this._loadInt((_32_ + 24))) + 244), ((this._loadInt(_31_)) + 1));
                    label$5:
                    do {
                        if ((this._loadInt(((_31_ = this._loadInt((_32_ + 24))) + 236))) <= (this._loadInt((_31_ + 240)))) {
                            break label$5;
                        }
                        this._storeInt(((_31_ = this._loadInt((_32_ + 24))) + 240), (this._loadInt((_31_ + 236))));
                    }
                    while (false);
                    this._storeInt((_32_ + 28), (this._loadInt((_32_ + 12))));
                    break label$0;
                }
                while (false);
                this._storeInt((_31_ = (this._loadInt((_32_ + 24))) + 252), ((this._loadInt(_31_)) + 1));
            }
            while (false);
            label$6:
            do {
                if ((this._storeInt((_32_ + 16), (sqlite3Malloc((this._loadInt((_32_ + 20))))))) != 0) {
                    break label$6;
                }
                if ((this._loadInt((_32_ + 24))) == 0) {
                    break label$6;
                }
                this._storeInt8(((this._loadInt((_32_ + 24))) + 30), 1);
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
    public final int sqlite3_malloc(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((sqlite3_initialize()) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 12), (sqlite3Malloc((this._loadInt((_31_ + 8))))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3_initialize()
    {
        int _30_ = 0;
        int _31_ = 0;
        _30_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((0 + 20428))) == 0) {
                    break label$1;
                }
                this._storeInt((_30_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_30_ + 4), 0);
            label$2:
            do {
                if (1 != 0) {
                    break label$2;
                }
                this._storeInt((_30_ + 12), (this._loadInt((_30_ + 4))));
                break label$0;
            }
            while (false);
            this._storeInt((0 + 20436), 1);
            this._storeInt((_30_ + 8), 8);
            label$3:
            do {
                if ((this._loadInt((0 + 20440))) != 0) {
                    break label$3;
                }
                this._storeInt((_30_ + 4), (sqlite3MallocInit()));
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt((_30_ + 4))) != 0) {
                    break label$4;
                }
                this._storeInt((0 + 20440), 1);
                if ((this._loadInt((0 + 20448))) != 0) {
                    break label$4;
                }
                this._storeInt((0 + 20448), 8);
                if ((this._loadInt((0 + 20244))) == 0) {
                    break label$4;
                }
                if ((this._loadInt((0 + 20448))) != 0) {
                    break label$4;
                }
                this._storeInt((_30_ + 4), 7);
            }
            while (false);
            label$5:
            do {
                if ((this._loadInt((_30_ + 4))) != 0) {
                    break label$5;
                }
                this._storeInt((0 + 20452), ((this._loadInt((0 + 20452))) + 1));
            }
            while (false);
            label$6:
            do {
                if ((this._loadInt((_30_ + 4))) == 0) {
                    break label$6;
                }
                this._storeInt((_30_ + 12), (this._loadInt((_30_ + 4))));
                break label$0;
            }
            while (false);
            label$7:
            do {
                if ((this._loadInt((0 + 20428))) != 0) {
                    break label$7;
                }
                if ((this._loadInt((0 + 20432))) != 0) {
                    break label$7;
                }
                this._storeInt((0 + 20432), 1);
                memset((this._storeInt(_30_, 20508)), 0, 92);
                sqlite3RegisterGlobalFunctions();
                label$8:
                do {
                    if ((this._loadInt((0 + 20444))) != 0) {
                        break label$8;
                    }
                    this._storeInt((_30_ + 4), (sqlite3PcacheInitialize()));
                }
                while (false);
                label$9:
                do {
                    if ((this._loadInt((_30_ + 4))) != 0) {
                        break label$9;
                    }
                    this._storeInt((0 + 20444), 1);
                    this._storeInt((_30_ + 4), (sqlite3OsInit()));
                }
                while (false);
                label$10:
                do {
                    if ((this._loadInt((_30_ + 4))) != 0) {
                        break label$10;
                    }
                    sqlite3PCacheBufferSetup((this._loadInt((0 + 20408))), (this._loadInt((0 + 20412))), (this._loadInt((0 + 20416))));
                    this._storeInt((0 + 20428), 1);
                }
                while (false);
                this._storeInt((0 + 20432), 0);
            }
            while (false);
            label$11:
            do {
                if ((this._storeInt((0 + 20452), ((this._loadInt((0 + 20452))) + -1))) > 0) {
                    break label$11;
                }
                this._storeInt((0 + 20448), 0);
            }
            while (false);
            this._storeInt((_30_ + 12), (this._loadInt((_30_ + 4))));
        }
        while (false);
        _31_ = this._loadInt((_30_ + 12));
        this._storeInt((0 + 4), (_30_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3Malloc(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) < 1) {
                        break label$2;
                    }
                    if ((this._loadInt((_31_ + 12))) < 2147483392) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((_31_ + 8), 0);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((0 + 20240))) == 0) {
                    break label$3;
                }
                mallocWithAlarm((this._loadInt((_31_ + 12))), (_31_ + 8));
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 8), (this._iiTable[this._tableIndices[this._loadInt((0 + 20268))]].invoke((this._loadInt((_31_ + 12))))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int mallocWithAlarm(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 20), (this._iiTable[this._tableIndices[this._loadInt((0 + 20284))]].invoke((this._loadInt((_32_ + 28))))));
        sqlite3StatusSet(5, (this._loadInt((_32_ + 28))));
        label$0:
        do {
            if ((this._loadInt((0 + 20484))) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 12), (sqlite3StatusValue(0)));
            label$1:
            do {
                if ((this._loadLong32s((_32_ + 12))) < ((this._loadLong((0 + 20476))) - (this._loadLong32s((_32_ + 20))))) {
                    break label$1;
                }
                this._storeInt((0 + 20504), 1);
                sqlite3MallocAlarm((this._loadInt((_32_ + 20))));
                break label$0;
            }
            while (false);
            this._storeInt((0 + 20504), 0);
        }
        while (false);
        label$2:
        do {
            if ((this._storeInt((_32_ + 16), (this._iiTable[this._tableIndices[this._loadInt((0 + 20268))]].invoke((this._loadInt((_32_ + 20))))))) == 0) {
                break label$2;
            }
            sqlite3StatusAdd(0, (this._storeInt((_32_ + 20), (sqlite3MallocSize((this._loadInt((_32_ + 16))))))));
            sqlite3StatusAdd(9, 1);
        }
        while (false);
        this._storeInt((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 16))));
        _31_ = this._loadInt((_32_ + 20));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final void sqlite3StatusSet(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if ((this._storeInt(((_30_ = (this._loadInt((_32_ + 12))) << 2) + 20128), _31_)) <= (this._loadInt((_30_ + 20168)))) {
                break label$0;
            }
            this._storeInt(((_32_ = (this._loadInt((_32_ + 12))) << 2) + 20168), (this._loadInt((_32_ + 20128))));
        }
        while (false);
        return;
    }

    @Override()
    public final int sqlite3StatusValue(int _30_)
    {
        return (this._loadInt((((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) << 2) + 20128)));
    }

    @Override()
    public final void sqlite3MallocAlarm(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        label$0:
        do {
            if ((this._loadInt((0 + 20484))) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 24), (this._loadInt((0 + 20484))));
            this._storeLong((_32_ + 16), ((long) (sqlite3StatusValue(0))));
            _31_ = this._storeInt((_32_ + 12), (this._loadInt((0 + 20488))));
            _30_ = this._storeInt((0 + 20484), 0);
            this._viliTable[this._tableIndices[this._loadInt((_32_ + 24))]].invoke(_31_, (this._loadLong((_32_ + 16))), (this._loadInt((_32_ + 28))));
            this._storeInt((_30_ + 20484), (this._loadInt((_32_ + 24))));
            this._storeInt((_30_ + 20488), (this._loadInt((_32_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final int sqlite3MallocSize(int _30_)
    {
        int _31_ = 0;
        _31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16));
        _30_ = this._iiTable[this._tableIndices[this._loadInt((0 + 20280))]].invoke((this._storeInt((_31_ + 12), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void sqlite3StatusAdd(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        _30_ = this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if ((this._storeInt(((_31_ = (this._loadInt((_32_ + 12))) << 2) + 20128), (_30_ + (this._loadInt((_31_ + 20128)))))) <= (this._loadInt((_31_ + 20168)))) {
                break label$0;
            }
            this._storeInt(((_32_ = (this._loadInt((_32_ + 12))) << 2) + 20168), (this._loadInt((_32_ + 20128))));
        }
        while (false);
        return;
    }

    @Override()
    public final int sqlite3MallocInit()
    {
        int _30_ = 0;
        int _31_ = 0;
        _30_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16));
        label$0:
        do {
            if ((this._loadInt((0 + 20268))) != 0) {
                break label$0;
            }
            sqlite3MemSetDefault();
        }
        while (false);
        memset(20468, 0, 40);
        label$1:
        do {
            if ((this._loadInt((0 + 20244))) == 0) {
                break label$1;
            }
            this._storeInt((0 + 20468), 8);
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                if ((this._loadInt((0 + 20396))) == 0) {
                    break label$3;
                }
                if ((this._loadInt((0 + 20400))) < 100) {
                    break label$3;
                }
                if ((this._loadInt((0 + 20404))) < 1) {
                    break label$3;
                }
                this._storeInt((_30_ + 4), (this._storeInt((0 + 20400), ((this._loadInt((0 + 20400))) & -8))));
                this._storeInt(_30_, (this._loadInt((0 + 20396))));
                this._storeInt((_30_ + 8), (this._loadInt((0 + 20404))));
                this._storeInt((0 + 20496), (this._loadInt(_30_)));
                this._storeInt((0 + 20500), (this._loadInt((_30_ + 8))));
                this._storeInt((_30_ + 12), 0);
                label$5:
                do {
                    label$4:
                    while (true) {
                        if ((this._loadInt((_30_ + 12))) >= ((this._loadInt((_30_ + 8))) + -1)) {
                            break label$5;
                        }
                        this._storeInt(_30_, (this._storeInt((_31_ = this._loadInt(_30_)), (_31_ + (this._loadInt((_30_ + 4)))))));
                        this._storeInt((_30_ + 12), ((this._loadInt((_30_ + 12))) + 1));
                        continue label$4;
                    }
                }
                while (false);
                this._storeInt(((this._storeInt((_31_ = this._loadInt(_30_)), 0)) + 20492), (_31_ + 4));
                break label$2;
            }
            while (false);
            this._storeLong((0 + 20396), 0L);
            this._storeInt(((_31_ = this._storeInt((0 + 20492), 0)) + 20404), _31_);
        }
        while (false);
        label$6:
        do {
            label$7:
            do {
                if ((this._loadInt((0 + 20408))) == 0) {
                    break label$7;
                }
                if ((this._loadInt((0 + 20412))) < 512) {
                    break label$7;
                }
                if ((this._loadInt((0 + 20416))) > 0) {
                    break label$6;
                }
            }
            while (false);
            this._storeLong((0 + 20408), 0L);
            this._storeInt((0 + 20416), 0);
        }
        while (false);
        _31_ = this._iiTable[this._tableIndices[this._loadInt((0 + 20288))]].invoke((this._loadInt((0 + 20296))));
        this._storeInt((0 + 4), (_30_ + 16));
        return _31_;
    }

    @Override()
    public final void sqlite3RegisterGlobalFunctions()
    {
        int _30_ = 0;
        this._storeInt(((_30_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), 20508);
        this._storeInt((_30_ + 4), 22992);
        this._storeInt((_30_ + 12), 0);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_30_ + 12))) > 51) {
                    break label$1;
                }
                sqlite3FuncDefInsert((this._loadInt((_30_ + 8))), ((this._loadInt((_30_ + 4))) + ((this._loadInt((_30_ + 12))) * 36)));
                this._storeInt((_30_ + 12), ((this._loadInt((_30_ + 12))) + 1));
                continue label$0;
            }
        }
        while (false);
        sqlite3RegisterDateTimeFunctions();
        sqlite3AlterFunctions();
        this._storeInt((0 + 4), (_30_ + 16));
        return;
    }

    @Override()
    public final int sqlite3PcacheInitialize()
    {
        label$0:
        do {
            if ((this._loadInt((0 + 20340))) != 0) {
                break label$0;
            }
            sqlite3PCacheSetDefault();
        }
        while (false);
        return (this._iiTable[this._tableIndices[this._loadInt((0 + 20340))]].invoke((this._loadInt((0 + 20336)))));
    }

    @Override()
    public final int sqlite3OsInit()
    {
        int _30_ = 0;
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(((_30_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (sqlite3_malloc(10)))) == 0) {
                    break label$1;
                }
                sqlite3_free((this._loadInt((_30_ + 8))));
                this._storeInt((_30_ + 12), (sqlite3_os_init()));
                break label$0;
            }
            while (false);
            this._storeInt((_30_ + 12), 7);
        }
        while (false);
        _31_ = this._loadInt((_30_ + 12));
        this._storeInt((0 + 4), (_30_ + 16));
        return _31_;
    }

    @Override()
    public final void sqlite3PCacheBufferSetup(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        label$0:
        do {
            if ((this._loadInt((0 + 20628))) == 0) {
                break label$0;
            }
            this._storeInt((_33_ + 8), (this._storeInt((0 + 20632), ((this._loadInt((_33_ + 8))) & -8))));
            _32_ = 10;
            label$1:
            do {
                if ((this._storeInt((0 + 20636), (this._storeInt((0 + 20656), (this._loadInt((_33_ + 4))))))) > 90) {
                    break label$1;
                }
                _32_ = ((this._loadInt((_33_ + 4))) / 10) + 1;
            }
            while (false);
            this._storeInt((0 + 20640), _32_);
            this._storeInt((0 + 20644), (this._loadInt((_33_ + 12))));
            _31_ = this._storeInt(((_32_ = this._storeInt((0 + 20660), 0)) + 20664), _32_);
            label$3:
            do {
                label$2:
                while (true) {
                    this._storeInt((_33_ + 4), ((_32_ = this._loadInt((_33_ + 4))) + -1));
                    if (_32_ == 0) {
                        break label$3;
                    }
                    this._storeInt((_32_ = this._loadInt((_33_ + 12))), (this._loadInt((_31_ + 20660))));
                    this._storeInt((_31_ + 20660), (this._storeInt(_33_, _32_)));
                    this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + (this._loadInt((_33_ + 8)))));
                    continue label$2;
                }
            }
            while (false);
            this._storeInt((0 + 20648), (this._loadInt((_33_ + 12))));
        }
        while (false);
        return;
    }

    @Override()
    public final void sqlite3_free(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt((0 + 20240))) == 0) {
                    break label$1;
                }
                sqlite3StatusAdd(0, (0 - (sqlite3MallocSize((this._loadInt((_31_ + 12)))))));
                sqlite3StatusAdd(9, -1);
                this._viTable[this._tableIndices[this._loadInt((0 + 20272))]].invoke((this._loadInt((_31_ + 12))));
                break label$0;
            }
            while (false);
            this._viTable[this._tableIndices[this._loadInt((0 + 20272))]].invoke((this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3_os_init()
    {
        int _30_ = 0;
        int _31_ = 0;
        this._storeInt(((_30_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), 0);
        label$1:
        do {
            label$0:
            while (true) {
                if (((this._loadInt((_30_ + 12))) & 4294967295L) > (3 & 4294967295L)) {
                    break label$1;
                }
                sqlite3_vfs_register((((_31_ = this._loadInt((_30_ + 12))) * 88) + 20672), ((_31_ == 0) ? 1 : 0));
                this._storeInt((_30_ + 12), ((this._loadInt((_30_ + 12))) + 1));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_30_ + 16));
        return 0;
    }

    @Override()
    public final int sqlite3_vfs_register(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 16), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 12), (sqlite3_initialize()))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 28), (this._loadInt((_32_ + 12))));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 16), 8);
            vfsUnlink((this._loadInt((_32_ + 24))));
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt((_32_ + 20))) != 0) {
                        break label$3;
                    }
                    if ((this._loadInt((0 + 21024))) == 0) {
                        break label$3;
                    }
                    this._storeInt(((_31_ = this._loadInt((_32_ + 24))) + 12), (this._loadInt(((_30_ = this._loadInt((0 + 21024))) + 12))));
                    this._storeInt((_30_ + 12), _31_);
                    break label$2;
                }
                while (false);
                this._storeInt(((_31_ = this._loadInt((_32_ + 24))) + 12), (this._loadInt((0 + 21024))));
                this._storeInt((0 + 21024), _31_);
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
    public final void vfsUnlink(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) == 0) {
                    break label$1;
                }
                if ((this._loadInt((0 + 21024))) == (this._loadInt((_31_ + 12)))) {
                    break label$0;
                }
                if ((this._loadInt((0 + 21024))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 8), (this._loadInt((0 + 21024))));
                label$3:
                do {
                    label$2:
                    while (true) {
                        _30_ = 0;
                        label$4:
                        do {
                            if ((this._loadInt(((this._loadInt((_31_ + 8))) + 12))) == 0) {
                                break label$4;
                            }
                            _30_ = ((this._loadInt(((this._loadInt((_31_ + 8))) + 12))) != (this._loadInt((_31_ + 12)))) ? 1 : 0;
                        }
                        while (false);
                        if (_30_ == 0) {
                            break label$3;
                        }
                        this._storeInt((_31_ + 8), (this._loadInt(((this._loadInt((_31_ + 8))) + 12))));
                        continue label$2;
                    }
                }
                while (false);
                if ((this._loadInt(((this._loadInt((_31_ + 8))) + 12))) != (this._loadInt((_31_ + 12)))) {
                    break label$1;
                }
                this._storeInt(((this._loadInt((_31_ + 8))) + 12), (this._loadInt(((this._loadInt((_31_ + 12))) + 12))));
            }
            while (false);
            return;
        }
        while (false);
        this._storeInt((0 + 21024), (this._loadInt(((this._loadInt((_31_ + 12))) + 12))));
        return;
    }

    @Override()
    public final int unixOpen(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 624))) + 616), _30_);
        this._storeInt((_35_ + 612), _31_);
        this._storeInt((_35_ + 608), _32_);
        this._storeInt((_35_ + 604), _33_);
        this._storeInt((_35_ + 600), _34_);
        this._storeInt((_35_ + 596), (this._loadInt((_35_ + 608))));
        this._storeInt((_35_ + 588), (this._storeInt((_35_ + 592), -1)));
        _34_ = this._storeInt((_35_ + 584), 0);
        this._storeInt((_35_ + 580), ((this._loadInt((_35_ + 604))) & -256));
        _33_ = this._storeInt((_35_ + 572), _34_);
        this._storeInt((_35_ + 568), ((this._loadInt((_35_ + 604))) & 16));
        this._storeInt((_35_ + 564), ((this._loadInt((_35_ + 604))) & 8));
        this._storeInt((_35_ + 560), ((this._loadInt((_35_ + 604))) & 4));
        this._storeInt((_35_ + 556), ((this._loadInt((_35_ + 604))) & 1));
        this._storeInt((_35_ + 552), ((this._loadInt((_35_ + 604))) & 2));
        _34_ = 0;
        label$0:
        do {
            if ((this._loadInt((_35_ + 560))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt((_35_ + 580))) != 16384) {
                    break label$1;
                }
                _34_ = 1;
                break label$0;
            }
            while (false);
            _34_ = 1;
            if ((this._loadInt((_35_ + 580))) == 2048) {
                break label$0;
            }
            _34_ = ((this._loadInt((_35_ + 580))) == 524288) ? 1 : 0;
        }
        while (false);
        this._storeInt((_35_ + 548), _34_);
        this._storeInt((_35_ + 28), (this._loadInt((_35_ + 612))));
        memset((this._loadInt((_35_ + 596))), _33_, 44);
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
                                    if ((this._loadInt((_35_ + 580))) != 256) {
                                        break label$8;
                                    }
                                    if ((this._storeInt((_35_ + 24), (findReusableFd((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 604))))))) == 0) {
                                        break label$7;
                                    }
                                    this._storeInt((_35_ + 592), (this._loadInt((this._loadInt((_35_ + 24))))));
                                    break label$6;
                                }
                                while (false);
                                if ((this._loadInt((_35_ + 28))) != 0) {
                                    break label$3;
                                }
                                if ((this._storeInt((_35_ + 572), (unixGetTempname(513, (_35_ + 32))))) == 0) {
                                    break label$5;
                                }
                                this._storeInt((_35_ + 620), (this._loadInt((_35_ + 572))));
                                break label$2;
                            }
                            while (false);
                            if ((this._storeInt((_35_ + 24), (sqlite3_malloc(12)))) == 0) {
                                break label$4;
                            }
                        }
                        while (false);
                        this._storeInt(((this._loadInt((_35_ + 596))) + 28), (this._loadInt((_35_ + 24))));
                        break label$3;
                    }
                    while (false);
                    this._storeInt((_35_ + 28), (_35_ + 32));
                    break label$3;
                }
                while (false);
                this._storeInt((_35_ + 620), 7);
                break label$2;
            }
            while (false);
            this._loadInt((_35_ + 556));
            label$9:
            do {
                if ((this._loadInt((_35_ + 552))) == 0) {
                    break label$9;
                }
                this._storeInt((_35_ + 584), ((this._loadInt((_35_ + 584))) | 2));
            }
            while (false);
            label$10:
            do {
                if ((this._loadInt((_35_ + 560))) == 0) {
                    break label$10;
                }
                this._storeInt((_35_ + 584), ((this._loadInt((_35_ + 584))) | 64));
            }
            while (false);
            label$11:
            do {
                if ((this._loadInt((_35_ + 568))) == 0) {
                    break label$11;
                }
                this._storeInt((_35_ + 584), ((this._loadInt((_35_ + 584))) | 131200));
            }
            while (false);
            label$12:
            do {
                label$13:
                do {
                    if ((this._loadInt((_35_ + 592))) > -1) {
                        break label$13;
                    }
                    label$14:
                    do {
                        if ((this._storeInt((_35_ + 572), (findCreateFileMode((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 604))), (_35_ + 20))))) == 0) {
                            break label$14;
                        }
                        this._storeInt((_35_ + 620), (this._loadInt((_35_ + 572))));
                        break label$2;
                    }
                    while (false);
                    label$15:
                    do {
                        if ((this._storeInt((_35_ + 592), (robust_open((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 584))), (this._loadInt((_35_ + 20))))))) > -1) {
                            break label$15;
                        }
                        if ((this._loadInt((__errno_location()))) == 21) {
                            break label$15;
                        }
                        if ((this._loadInt((_35_ + 552))) == 0) {
                            break label$15;
                        }
                        if ((this._loadInt((_35_ + 568))) != 0) {
                            break label$15;
                        }
                        this._storeInt((_35_ + 604), ((this._loadInt((_35_ + 604))) & -7));
                        this._storeInt((_35_ + 584), ((this._loadInt((_35_ + 584))) & -67));
                        this._storeInt((_35_ + 604), ((this._loadInt((_35_ + 604))) | 1));
                        this._storeInt((_35_ + 556), 1);
                        this._storeInt((_35_ + 592), (robust_open((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 584))), (this._loadInt((_35_ + 20))))));
                    }
                    while (false);
                    if ((this._loadInt((_35_ + 592))) > -1) {
                        break label$13;
                    }
                    this._storeInt((_35_ + 572), (unixLogErrorAtLine((sqlite3CantopenError(29479)), 21440, (this._loadInt((_35_ + 28))), 29479)));
                    break label$12;
                }
                while (false);
                label$16:
                do {
                    if ((this._loadInt((_35_ + 600))) == 0) {
                        break label$16;
                    }
                    this._storeInt((this._loadInt((_35_ + 600))), (this._loadInt((_35_ + 604))));
                }
                while (false);
                label$17:
                do {
                    if ((this._loadInt(((this._loadInt((_35_ + 596))) + 28))) == 0) {
                        break label$17;
                    }
                    this._storeInt((this._loadInt(((_34_ = this._loadInt((_35_ + 596))) + 28))), (this._loadInt((_35_ + 592))));
                    this._storeInt(((this._loadInt((_34_ + 28))) + 4), (this._loadInt((_35_ + 604))));
                }
                while (false);
                label$18:
                do {
                    if ((this._loadInt((_35_ + 564))) == 0) {
                        break label$18;
                    }
                    unlink((this._loadInt((_35_ + 28))));
                }
                while (false);
                label$19:
                do {
                    if ((this._loadInt((_35_ + 548))) == 0) {
                        break label$19;
                    }
                    if ((this._storeInt((_35_ + 572), (openDirectory((this._loadInt((_35_ + 612))), (_35_ + 588))))) == 0) {
                        break label$19;
                    }
                    robust_close((this._loadInt((_35_ + 596))), (this._loadInt((_35_ + 592))), 29514);
                    break label$12;
                }
                while (false);
                _34_ = this._loadInt((_35_ + 592));
                this._storeInt(_35_, ((this._iiiiTable[this._tableIndices[_33_ = this._loadInt(((this._storeInt((_35_ + 16), 0)) + 21272))]].invoke(_34_, 1, (_35_ + 16))) | 1));
                this._iiiiTable[this._tableIndices[_33_]].invoke(_34_, 2, _35_);
                _34_ = this._storeInt((_35_ + 576), (((this._loadInt((_35_ + 580))) != 256) ? 1 : 0));
                this._storeInt((_35_ + 572), (fillInUnixFile((this._loadInt((_35_ + 616))), (this._loadInt((_35_ + 592))), (this._loadInt((_35_ + 588))), (this._loadInt((_35_ + 608))), (this._loadInt((_35_ + 612))), _34_, (this._loadInt((_35_ + 564))), (this._loadInt((_35_ + 556))))));
            }
            while (false);
            label$20:
            do {
                if ((this._loadInt((_35_ + 572))) == 0) {
                    break label$20;
                }
                sqlite3_free((this._loadInt(((this._loadInt((_35_ + 596))) + 28))));
            }
            while (false);
            this._storeInt((_35_ + 620), (this._loadInt((_35_ + 572))));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 620));
        this._storeInt((0 + 4), (_35_ + 624));
        return _34_;
    }

    @Override()
    public final int unixDelete(int _30_, int _31_, int _32_)
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
                if ((unlink((this._loadInt((_33_ + 20))))) != -1) {
                    break label$1;
                }
                if ((this._loadInt((__errno_location()))) == 2) {
                    break label$1;
                }
                this._storeInt((_33_ + 28), (unixLogErrorAtLine(2570, 22224, (this._loadInt((_33_ + 20))), 29613)));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt((_33_ + 16))) == 0) {
                    break label$2;
                }
                if ((this._storeInt((_33_ + 12), (openDirectory((this._loadInt((_33_ + 20))), (_33_ + 8))))) != 0) {
                    break label$2;
                }
                label$3:
                do {
                    if ((fsync((this._loadInt((_33_ + 8))))) == 0) {
                        break label$3;
                    }
                    this._storeInt((_33_ + 12), (unixLogErrorAtLine(1290, 22240, (this._loadInt((_33_ + 20))), 29626)));
                }
                while (false);
                robust_close(0, (this._loadInt((_33_ + 8))), 29628);
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
    public final int unixAccess(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 128))) + 124), _30_);
        this._storeInt((_34_ + 120), _31_);
        this._storeInt((_34_ + 116), _32_);
        this._storeInt((_34_ + 112), _33_);
        this._storeInt((_34_ + 108), 0);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((_33_ = this._loadInt((_34_ + 116))) == 2) {
                        break label$2;
                    }
                    if (_33_ == 1) {
                        break label$1;
                    }
                    if (_33_ != 0) {
                        break label$0;
                    }
                    this._storeInt((_34_ + 108), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_34_ + 108), 4);
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 108), 6);
        }
        while (false);
        _33_ = this._iiiTable[this._tableIndices[this._loadInt((0 + 21212))]].invoke((this._loadInt((_34_ + 120))), (this._loadInt((_34_ + 108))));
        this._storeInt((this._loadInt((_34_ + 112))), ((_33_ == 0) ? 1 : 0));
        label$3:
        do {
            if ((this._loadInt((_34_ + 116))) != 0) {
                break label$3;
            }
            if ((this._loadInt((this._loadInt((_34_ + 112))))) == 0) {
                break label$3;
            }
            if ((this.stat.invoke((this._loadInt((_34_ + 120))), _34_)) != 0) {
                break label$3;
            }
            if ((this._loadLong((_34_ + 48))) != 0L) {
                break label$3;
            }
            this._storeInt((this._loadInt((_34_ + 112))), 0);
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 128));
        return 0;
    }

    @Override()
    public final int unixFullPathname(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_34_ + 36), _31_);
        this._storeInt((_34_ + 32), _32_);
        _33_ = this._storeInt8((((this._storeInt((_34_ + 28), _33_)) + (this._loadInt((_34_ + 32)))) + -1), 0);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt8s((this._loadInt((_34_ + 36))))) != 47) {
                            break label$3;
                        }
                        _33_ = this._loadInt((_34_ + 28));
                        _32_ = this._loadInt((_34_ + 32));
                        this._storeInt(_34_, (this._loadInt((_34_ + 36))));
                        sqlite3_snprintf(_32_, _33_, 22192, _34_);
                        break label$2;
                    }
                    while (false);
                    if ((this._iiiTable[this._tableIndices[this._loadInt((_33_ + 21224))]].invoke((this._loadInt((_34_ + 28))), ((this._loadInt((_34_ + 32))) + -1))) == 0) {
                        break label$1;
                    }
                    _33_ = this._storeInt((_34_ + 24), (strlen((this._loadInt((_34_ + 28))))));
                    _32_ = this._loadInt((_34_ + 32));
                    _31_ = this._loadInt((_34_ + 28));
                    this._storeInt((_34_ + 16), (this._loadInt((_34_ + 36))));
                    sqlite3_snprintf((_32_ - _33_), (_31_ + _33_), 22208, (_34_ + 16));
                }
                while (false);
                this._storeInt((_34_ + 44), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 44), (unixLogErrorAtLine((sqlite3CantopenError(29711)), 21472, (this._loadInt((_34_ + 36))), 29711)));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int unixDlOpen(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        _31_ = stub_dlopen((this._storeInt((_32_ + 8), _31_)), 258);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void unixDlError(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        unixEnterMutex();
        label$0:
        do {
            if ((this._storeInt((_33_ + 16), (this.dlerror.invoke()))) == 0) {
                break label$0;
            }
            _32_ = this._loadInt((_33_ + 20));
            _31_ = this._loadInt((_33_ + 24));
            this._storeInt(_33_, (this._loadInt((_33_ + 16))));
            sqlite3_snprintf(_31_, _32_, 22192, _33_);
        }
        while (false);
        unixLeaveMutex();
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int unixDlSym(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(_33_, 13);
        _32_ = dlsym((this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 4))));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final void unixDlClose(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        dlclose((this._storeInt((_32_ + 8), _31_)));
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int unixRandomness(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        memset((this._storeInt((_33_ + 4), _32_)), 0, (this._loadInt((_33_ + 8))));
        _32_ = this._loadInt((_33_ + 8));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int unixSleep(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        sleep((this._storeInt((_32_ + 4), (((this._storeInt((_32_ + 8), _31_)) + 999999) / 1000000))));
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return (_31_ * 1000000);
    }

    @Override()
    public final int unixCurrentTime(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        unixCurrentTimeInt64(0, _32_);
        this._storeDouble((this._loadInt((_32_ + 8))), (((double) (this._loadLong(_32_))) / 8.64E7));
        this._storeInt((0 + 4), (_32_ + 16));
        return 0;
    }

    @Override()
    public final int unixGetLastError(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        return 0;
    }

    @Override()
    public final int unixCurrentTimeInt64(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this.gettimeofday.invoke(_32_, 0);
        this._storeLong((this._loadInt((_32_ + 8))), ((((this._loadLong32s(_32_)) * 1000L) + ((long) ((this._loadInt((_32_ + 4))) / 1000))) + 210866760000000L));
        this._storeInt((0 + 4), (_32_ + 16));
        return 0;
    }

    @Override()
    public final int unixSetSystemCall(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        _32_ = this._storeInt((_33_ + 12), 12);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_33_ + 24))) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 16), 0);
                label$3:
                do {
                    label$2:
                    while (true) {
                        if (((this._loadInt((_33_ + 16))) & 4294967295L) > (15 & 4294967295L)) {
                            break label$0;
                        }
                        if ((strcmp((this._loadInt((_33_ + 24))), (this._loadInt((((this._loadInt((_33_ + 16))) * _32_) + 21184))))) == 0) {
                            break label$3;
                        }
                        this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + 1));
                        continue label$2;
                    }
                }
                while (false);
                label$4:
                do {
                    if ((this._loadInt((((this._loadInt((_33_ + 16))) * 12) + 21192))) != 0) {
                        break label$4;
                    }
                    this._storeInt(((_32_ = (this._loadInt((_33_ + 16))) * 12) + 21192), (this._loadInt((_32_ + 21188))));
                }
                while (false);
                this._storeInt((_33_ + 12), 0);
                label$5:
                do {
                    if ((this._loadInt((_33_ + 20))) != 0) {
                        break label$5;
                    }
                    this._storeInt((_33_ + 20), (this._loadInt((((this._loadInt((_33_ + 16))) * 12) + 21192))));
                }
                while (false);
                this._storeInt((((this._loadInt((_33_ + 16))) * 12) + 21188), (this._loadInt((_33_ + 20))));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 16), (this._storeInt((_33_ + 12), 0)));
            label$7:
            do {
                label$6:
                while (true) {
                    if (((this._loadInt((_33_ + 16))) & 4294967295L) > (15 & 4294967295L)) {
                        break label$7;
                    }
                    label$8:
                    do {
                        if ((this._loadInt((((this._loadInt((_33_ + 16))) * _32_) + 21192))) == 0) {
                            break label$8;
                        }
                        this._storeInt(((_31_ = (this._loadInt((_33_ + 16))) * _32_) + 21188), (this._loadInt((_31_ + 21192))));
                    }
                    while (false);
                    this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + 1));
                    continue label$6;
                }
            }
            while (false);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 12));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int unixGetSystemCall(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        this._storeInt(_32_, 0);
        label$0:
        do {
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if (((this._loadInt(_32_)) & 4294967295L) > (15 & 4294967295L)) {
                            break label$1;
                        }
                        if ((strcmp((this._loadInt((_32_ + 4))), (this._loadInt((((this._loadInt(_32_)) * 12) + 21184))))) == 0) {
                            break label$3;
                        }
                        this._storeInt(_32_, ((this._loadInt(_32_)) + 1));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt((_32_ + 12), (this._loadInt((((this._loadInt(_32_)) * 12) + 21188))));
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
    public final int unixNextSystemCall(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        this._storeInt(_32_, -1);
        label$0:
        do {
            if ((this._loadInt((_32_ + 4))) == 0) {
                break label$0;
            }
            this._storeInt(_32_, 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt(_32_)) > 14) {
                        break label$2;
                    }
                    if ((strcmp((this._loadInt((_32_ + 4))), (this._loadInt((((this._loadInt(_32_)) * 12) + 21184))))) == 0) {
                        break label$2;
                    }
                    this._storeInt(_32_, ((this._loadInt(_32_)) + 1));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt(_32_, ((this._loadInt(_32_)) + 1));
        label$3:
        do {
            label$4:
            do {
                label$6:
                do {
                    label$5:
                    while (true) {
                        if ((this._loadInt(_32_)) > 15) {
                            break label$4;
                        }
                        if ((this._loadInt((((this._loadInt(_32_)) * 12) + 21188))) != 0) {
                            break label$6;
                        }
                        this._storeInt(_32_, ((this._loadInt(_32_)) + 1));
                        continue label$5;
                    }
                }
                while (false);
                this._storeInt((_32_ + 12), (this._loadInt((((this._loadInt(_32_)) * 12) + 21184))));
                break label$3;
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
    public final int dotlockIoFinderImpl(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        return 21116;
    }

    @Override()
    public final int dotlockClose(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) == 0) {
                break label$0;
            }
            this._storeInt((_31_ + 4), (this._loadInt((_31_ + 12))));
            dotlockUnlock((this._loadInt((_31_ + 12))), 0);
            sqlite3_free((this._loadInt(((this._loadInt((_31_ + 4))) + 24))));
        }
        while (false);
        _30_ = this._storeInt((_31_ + 8), (closeUnixFile((this._loadInt((_31_ + 12))))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int unixRead(int _30_, int _31_, int _32_, long _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_34_ + 20), _31_);
        this._storeInt((_34_ + 16), _32_);
        this._storeLong((_34_ + 8), _33_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(_34_, (seekAndRead((this._storeInt((_34_ + 4), (this._loadInt((_34_ + 24))))), (this._loadLong((_34_ + 8))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 16))))))) != (this._loadInt((_34_ + 16)))) {
                    break label$1;
                }
                this._storeInt((_34_ + 28), 0);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt(_34_)) <= -1) {
                    break label$2;
                }
                _32_ = this._storeInt(((this._loadInt((_34_ + 4))) + 20), 0);
                memset(((this._loadInt((_34_ + 20))) + (_31_ = this._loadInt(_34_))), _32_, ((this._loadInt((_34_ + 16))) - _31_));
                this._storeInt((_34_ + 28), 522);
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 28), 266);
        }
        while (false);
        _32_ = this._loadInt((_34_ + 28));
        this._storeInt((0 + 4), (_34_ + 32));
        return _32_;
    }

    @Override()
    public final int unixWrite(int _30_, int _31_, int _32_, long _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_34_ + 20), _31_);
        this._storeInt((_34_ + 16), _32_);
        this._storeLong((_34_ + 8), _33_);
        this._storeInt((_34_ + 4), (this._loadInt((_34_ + 24))));
        _31_ = this._storeInt(_34_, 0);
        label$1:
        do {
            label$0:
            while (true) {
                _32_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_34_ + 16))) < 1) {
                        break label$2;
                    }
                    _32_ = ((this._storeInt(_34_, (seekAndWrite((this._loadInt((_34_ + 4))), (this._loadLong((_34_ + 8))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 16))))))) > _31_) ? 1 : 0;
                }
                while (false);
                if (_32_ == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) - (this._loadInt(_34_))));
                this._storeLong((_34_ + 8), ((this._loadLong((_34_ + 8))) + (this._loadLong32s(_34_))));
                this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) + (this._loadInt(_34_))));
                continue label$0;
            }
        }
        while (false);
        label$3:
        do {
            label$4:
            do {
                if ((this._loadInt((_34_ + 16))) < 1) {
                    break label$4;
                }
                label$5:
                do {
                    if ((this._loadInt(_34_)) > -1) {
                        break label$5;
                    }
                    if ((this._loadInt(((this._loadInt((_34_ + 4))) + 20))) == 28) {
                        break label$5;
                    }
                    this._storeInt((_34_ + 28), 778);
                    break label$3;
                }
                while (false);
                this._storeInt(((this._loadInt((_34_ + 4))) + 20), 0);
                this._storeInt((_34_ + 28), 13);
                break label$3;
            }
            while (false);
            this._storeInt((_34_ + 28), 0);
        }
        while (false);
        _32_ = this._loadInt((_34_ + 28));
        this._storeInt((0 + 4), (_34_ + 32));
        return _32_;
    }

    @Override()
    public final int unixTruncate(int _30_, long _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeLong((_32_ + 16), _31_);
        label$0:
        do {
            if ((this._loadInt(((this._storeInt((_32_ + 12), (this._loadInt((_32_ + 24))))) + 40))) == 0) {
                break label$0;
            }
            this._storeLong((_32_ + 16), (((((this._loadLong((_32_ + 16))) + (_31_ = this._loadLong32s(((this._loadInt((_32_ + 12))) + 40)))) + -1L) / _31_) * _31_));
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                if ((this._storeInt((_32_ + 8), (robust_ftruncate((this._loadInt(((this._loadInt((_32_ + 12))) + 8))), (this._loadLong((_32_ + 16))))))) == 0) {
                    break label$2;
                }
                _30_ = __errno_location();
                this._storeInt(((_33_ = this._loadInt((_32_ + 12))) + 20), (this._loadInt(_30_)));
                this._storeInt((_32_ + 28), (unixLogErrorAtLine(1546, 21520, (this._loadInt((_33_ + 32))), 27799)));
                break label$1;
            }
            while (false);
            this._storeInt((_32_ + 28), 0);
        }
        while (false);
        _30_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _30_;
    }

    @Override()
    public final int unixSync(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 12), (this._loadInt((_32_ + 24))));
        this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 20))) & 16));
        _31_ = this._storeInt((_32_ + 4), ((((this._loadInt((_32_ + 20))) & 15) == 3) ? 1 : 0));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 16), (full_fsync((this._loadInt(((this._loadInt((_32_ + 12))) + 8))), _31_, (this._loadInt((_32_ + 8))))))) == 0) {
                    break label$1;
                }
                _31_ = __errno_location();
                this._storeInt(((_30_ = this._loadInt((_32_ + 12))) + 20), (this._loadInt(_31_)));
                this._storeInt((_32_ + 28), (unixLogErrorAtLine(1034, 22112, (this._loadInt((_30_ + 32))), 27750)));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt(((this._loadInt((_32_ + 12))) + 12))) < 0) {
                    break label$2;
                }
                full_fsync((this._loadInt(((this._loadInt((_32_ + 12))) + 12))), 0, 0);
                robust_close((_31_ = this._loadInt((_32_ + 12))), (this._loadInt((_31_ + 12))), 27772);
                this._storeInt(((this._loadInt((_32_ + 12))) + 12), -1);
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
    public final int unixFileSize(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 128))) + 120), _30_);
        this._storeInt((_32_ + 116), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 112), (this._iiiTable[this._tableIndices[this._loadInt((0 + 21248))]].invoke((this._loadInt(((this._loadInt((_32_ + 120))) + 8))), (_32_ + 8))))) == 0) {
                    break label$1;
                }
                _31_ = __errno_location();
                this._storeInt(((this._loadInt((_32_ + 120))) + 20), (this._loadInt(_31_)));
                this._storeInt((_32_ + 124), 1802);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._storeLong((this._loadInt((_32_ + 116))), (this._loadLong((_32_ + 56))))) != 1L) {
                    break label$2;
                }
                this._storeLong((this._loadInt((_32_ + 116))), 0L);
            }
            while (false);
            this._storeInt((_32_ + 124), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 124));
        this._storeInt((0 + 4), (_32_ + 128));
        return _31_;
    }

    @Override()
    public final int dotlockLock(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 8), (this._loadInt(((this._storeInt((_32_ + 16), (this._loadInt((_32_ + 24))))) + 24))));
        _31_ = this._storeInt((_32_ + 4), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 16))) + 16))) < 1) {
                    break label$1;
                }
                this._storeInt8(((this._loadInt((_32_ + 16))) + 16), (this._loadInt((_32_ + 20))));
                this.utimes.invoke((this._loadInt((_32_ + 8))), _31_);
                this._storeInt((_32_ + 28), _31_);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._storeInt((_32_ + 12), (robust_open((this._loadInt((_32_ + 8))), 192, 384)))) <= -1) {
                    break label$2;
                }
                robust_close((this._loadInt((_32_ + 16))), (this._loadInt((_32_ + 12))), 26436);
                this._storeInt8(((this._loadInt((_32_ + 16))) + 16), (this._loadInt((_32_ + 20))));
                this._storeInt((_32_ + 28), (this._loadInt((_32_ + 4))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if ((this._storeInt(_32_, (this._loadInt((__errno_location()))))) != 17) {
                        break label$4;
                    }
                    this._storeInt((_32_ + 4), 5);
                    break label$3;
                }
                while (false);
                if ((this._storeInt((_32_ + 4), (sqliteErrorFromPosixError((this._loadInt(_32_)), 3850)))) == 0) {
                    break label$3;
                }
                if ((this._loadInt((_32_ + 4))) == 5) {
                    break label$3;
                }
                this._storeInt(((this._loadInt((_32_ + 16))) + 20), (this._loadInt(_32_)));
            }
            while (false);
            this._storeInt((_32_ + 28), (this._loadInt((_32_ + 4))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int dotlockUnlock(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 12), (this._loadInt(((this._storeInt((_32_ + 16), (this._loadInt((_32_ + 24))))) + 24))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 16))) + 16))) != (this._loadInt((_32_ + 20)))) {
                    break label$1;
                }
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt((_32_ + 20))) != 1) {
                    break label$2;
                }
                this._storeInt8(((this._loadInt((_32_ + 16))) + 16), 1);
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((unlink((this._loadInt((_32_ + 12))))) == 0) {
                    break label$3;
                }
                this._storeInt((_32_ + 8), 0);
                label$4:
                do {
                    if ((this._storeInt((_32_ + 4), (this._loadInt((__errno_location()))))) == 2) {
                        break label$4;
                    }
                    this._storeInt((_32_ + 8), 2058);
                }
                while (false);
                label$5:
                do {
                    if ((this._loadInt((_32_ + 8))) == 0) {
                        break label$5;
                    }
                    if ((this._loadInt((_32_ + 8))) == 5) {
                        break label$5;
                    }
                    this._storeInt(((this._loadInt((_32_ + 16))) + 20), (this._loadInt((_32_ + 4))));
                }
                while (false);
                this._storeInt((_32_ + 28), (this._loadInt((_32_ + 8))));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 28), (this._storeInt8(((this._loadInt((_32_ + 16))) + 16), 0)));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int dotlockCheckReservedLock(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        _31_ = this._storeInt((_32_ + 16), (this._storeInt((_32_ + 20), 0)));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._storeInt((_32_ + 12), (this._loadInt((_32_ + 28))))) + 16))) < 2) {
                    break label$1;
                }
                this._storeInt((_32_ + 16), 1);
                break label$0;
            }
            while (false);
            _30_ = this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((_32_ + 12))) + 24))));
            this._storeInt((_32_ + 16), (((this._iiiTable[this._tableIndices[this._loadInt((_31_ + 21212))]].invoke(_30_, _31_)) == 0) ? 1 : 0));
        }
        while (false);
        this._storeInt((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 16))));
        _31_ = this._loadInt((_32_ + 20));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int unixFileControl(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_33_ + 4), _31_);
        this._storeInt(_33_, _32_);
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
                                if (((_32_ = (this._loadInt((_33_ + 4))) + -1) & 4294967295L) > (7 & 4294967295L)) {
                                    break label$5;
                                }
                                label$6:
                                do {
                                    switch (_32_) {
                                        case 0: {
                                            break label$6;
                                        }
                                        case 1:
                                        case 2:
                                        case 6: {
                                            break label$5;
                                        }
                                        case 3: {
                                            break label$4;
                                        }
                                        case 4: {
                                            break label$3;
                                        }
                                        case 5: {
                                            break label$2;
                                        }
                                        case 7: {
                                            break label$1;
                                        }
                                        default: {
                                            break label$6;
                                        }
                                    }
                                }
                                while (false);
                                this._storeInt((this._loadInt(_33_)), (this._loadInt8u(((this._loadInt((_33_ + 8))) + 16))));
                                this._storeInt((_33_ + 12), 0);
                                break label$0;
                            }
                            while (false);
                            this._storeInt((_33_ + 12), 12);
                            break label$0;
                        }
                        while (false);
                        this._storeInt((this._loadInt(_33_)), (this._loadInt(((this._loadInt((_33_ + 8))) + 20))));
                        this._storeInt((_33_ + 12), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_33_ + 12), (fcntlSizeHint((this._loadInt((_33_ + 8))), (this._loadLong((this._loadInt(_33_)))))));
                    break label$0;
                }
                while (false);
                this._storeInt(((this._loadInt((_33_ + 8))) + 40), (this._loadInt((this._loadInt(_33_)))));
                this._storeInt((_33_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 12), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 12));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int unixSectorSize(int _30_)
    {
        this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_);
        return 512;
    }

    @Override()
    public final int unixDeviceCharacteristics(int _30_)
    {
        this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_);
        return 0;
    }

    @Override()
    public final int unixShmMap(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 160))) + 152), _30_);
        this._storeInt((_35_ + 148), _31_);
        this._storeInt((_35_ + 144), _32_);
        this._storeInt((_35_ + 140), _33_);
        this._storeInt((_35_ + 136), _34_);
        this._storeInt((_35_ + 132), (this._loadInt((_35_ + 152))));
        this._storeInt((_35_ + 120), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 132))) + 36))) != 0) {
                    break label$1;
                }
                if ((this._storeInt((_35_ + 120), (unixOpenSharedMemory((this._loadInt((_35_ + 132))))))) == 0) {
                    break label$1;
                }
                this._storeInt((_35_ + 156), (this._loadInt((_35_ + 120))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt16u(((this._storeInt((_35_ + 124), (this._loadInt((this._storeInt((_35_ + 128), (this._loadInt(((this._loadInt((_35_ + 132))) + 36))))))))) + 20))) > (this._loadInt((_35_ + 148)))) {
                    break label$2;
                }
                this._storeInt((_35_ + 112), (((this._loadInt((_35_ + 148))) + 1) * (this._loadInt((_35_ + 144)))));
                this._storeInt(((_34_ = this._loadInt((_35_ + 124))) + 16), (this._loadInt((_35_ + 144))));
                label$3:
                do {
                    if ((this._loadInt((_34_ + 12))) < 0) {
                        break label$3;
                    }
                    label$4:
                    do {
                        if ((this._iiiTable[this._tableIndices[this._loadInt((0 + 21248))]].invoke((this._loadInt(((this._loadInt((_35_ + 124))) + 12))), (_35_ + 8))) == 0) {
                            break label$4;
                        }
                        this._storeInt((_35_ + 120), 4874);
                        break label$2;
                    }
                    while (false);
                    if ((this._loadLong((_35_ + 56))) >= (this._loadLong32s((_35_ + 112)))) {
                        break label$3;
                    }
                    if ((this._loadInt((_35_ + 140))) == 0) {
                        break label$2;
                    }
                    if ((robust_ftruncate((this._loadInt(((this._loadInt((_35_ + 124))) + 12))), (this._loadLong32s((_35_ + 112))))) == 0) {
                        break label$3;
                    }
                    this._storeInt((_35_ + 120), (unixLogErrorAtLine(4874, 21520, (this._loadInt(((this._loadInt((_35_ + 124))) + 8))), 28391)));
                    break label$2;
                }
                while (false);
                label$5:
                do {
                    label$6:
                    do {
                        label$7:
                        do {
                            if ((this._storeInt((_35_ + 116), (sqlite3_realloc((this._loadInt(((this._loadInt((_35_ + 124))) + 24))), (((this._loadInt((_35_ + 148))) << 2) + 4))))) == 0) {
                                break label$7;
                            }
                            this._storeInt(((this._loadInt((_35_ + 124))) + 24), (this._loadInt((_35_ + 116))));
                            label$8:
                            while (true) {
                                if ((this._loadInt16u(((this._loadInt((_35_ + 124))) + 20))) > (this._loadInt((_35_ + 148)))) {
                                    break label$2;
                                }
                                label$10:
                                do {
                                    label$11:
                                    do {
                                        if ((this._loadInt(((this._loadInt((_35_ + 124))) + 12))) < 0) {
                                            break label$11;
                                        }
                                        _temp$0 = 1;
                                        _temp$1 = 3;
                                        _temp$2 = ((this._loadInt8u(((_34_ = this._loadInt((_35_ + 124))) + 22))) != 0) ? _temp$0 : _temp$1;
                                        _temp$2 = this.mmap.invoke(0, (_33_ = this._loadInt((_35_ + 144))), _temp$2, 1, (this._loadInt((_34_ + 12))), ((long) (_33_ * (this._loadInt16u((_34_ + 20))))));
                                        _temp$2 = this._storeInt((_35_ + 4), _temp$2);
                                        _temp$2 = (_temp$2 != -1) ? 1 : 0;
                                        if (_temp$2 != 0) {
                                            break label$10;
                                        }
                                        break label$6;
                                    }
                                    while (false);
                                    if ((this._storeInt((_35_ + 4), (sqlite3_malloc((this._loadInt((_35_ + 144))))))) == 0) {
                                        break label$5;
                                    }
                                    memset((this._loadInt((_35_ + 4))), 0, (this._loadInt((_35_ + 144))));
                                }
                                while (false);
                                this._storeInt(((this._loadInt(((_34_ = this._loadInt((_35_ + 124))) + 24))) + ((this._loadInt16u((_34_ + 20))) << 2)), (this._loadInt((_35_ + 4))));
                                this._storeInt16(((_34_ = this._loadInt((_35_ + 124))) + 20), ((this._loadInt16u((_34_ + 20))) + 1));
                                continue label$8;
                            }
                        }
                        while (false);
                        this._storeInt((_35_ + 120), 3082);
                        break label$2;
                    }
                    while (false);
                    this._storeInt((_35_ + 120), (unixLogErrorAtLine(5386, 21680, (this._loadInt(((this._loadInt((_35_ + 124))) + 8))), 28414)));
                    break label$2;
                }
                while (false);
                this._storeInt((_35_ + 120), 7);
            }
            while (false);
            label$12:
            do {
                label$13:
                do {
                    if ((this._loadInt16u(((this._loadInt((_35_ + 124))) + 20))) <= (this._loadInt((_35_ + 148)))) {
                        break label$13;
                    }
                    this._storeInt((this._loadInt((_35_ + 136))), (this._loadInt(((this._loadInt(((this._loadInt((_35_ + 124))) + 24))) + ((this._loadInt((_35_ + 148))) << 2)))));
                    break label$12;
                }
                while (false);
                this._storeInt((this._loadInt((_35_ + 136))), 0);
            }
            while (false);
            label$14:
            do {
                if ((this._loadInt8u(((this._loadInt((_35_ + 124))) + 22))) == 0) {
                    break label$14;
                }
                if ((this._loadInt((_35_ + 120))) != 0) {
                    break label$14;
                }
                this._storeInt((_35_ + 120), 8);
            }
            while (false);
            this._storeInt((_35_ + 156), (this._loadInt((_35_ + 120))));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 156));
        this._storeInt((0 + 4), (_35_ + 160));
        return _34_;
    }

    @Override()
    public final int unixShmLock(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_34_ + 40), _31_);
        this._storeInt((_34_ + 36), _32_);
        this._storeInt((_34_ + 32), _33_);
        this._storeInt((_34_ + 16), (this._loadInt((this._storeInt((_34_ + 24), (this._loadInt(((this._storeInt((_34_ + 28), (this._loadInt((_34_ + 44))))) + 36))))))));
        _32_ = this._storeInt((_34_ + 12), 0);
        this._storeInt16((_34_ + 10), ((1 << ((_33_ = this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 36))))) - (1 << _33_)));
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
                                        if (((this._loadInt8u((_34_ + 32))) & 1) == 0) {
                                            break label$7;
                                        }
                                        this._storeInt16((_34_ + 8), _32_);
                                        this._storeInt((_34_ + 20), (this._loadInt(((this._loadInt((_34_ + 16))) + 32))));
                                        label$8:
                                        while (true) {
                                            if ((this._loadInt((_34_ + 20))) == 0) {
                                                break label$6;
                                            }
                                            label$10:
                                            do {
                                                if ((this._loadInt((_34_ + 20))) == (this._loadInt((_34_ + 24)))) {
                                                    break label$10;
                                                }
                                                this._storeInt16((_34_ + 8), ((this._loadInt16u((_34_ + 8))) | (this._loadInt16u(((this._loadInt((_34_ + 20))) + 10)))));
                                            }
                                            while (false);
                                            this._storeInt((_34_ + 20), (this._loadInt(((this._loadInt((_34_ + 20))) + 4))));
                                            continue label$8;
                                        }
                                    }
                                    while (false);
                                    if (((this._loadInt8u((_34_ + 32))) & 4) == 0) {
                                        break label$5;
                                    }
                                    this._storeInt16((_34_ + 6), 0);
                                    this._storeInt((_34_ + 20), (this._loadInt(((this._loadInt((_34_ + 16))) + 32))));
                                    label$11:
                                    do {
                                        label$13:
                                        do {
                                            label$12:
                                            while (true) {
                                                if ((this._loadInt((_34_ + 20))) == 0) {
                                                    break label$11;
                                                }
                                                if ((((this._loadInt16u(((this._loadInt((_34_ + 20))) + 12))) & (this._loadInt16u((_34_ + 10)))) & 65535) != 0) {
                                                    break label$13;
                                                }
                                                this._storeInt16((_34_ + 6), ((this._loadInt16u((_34_ + 6))) | (this._loadInt16u(((this._loadInt((_34_ + 20))) + 10)))));
                                                this._storeInt((_34_ + 20), (this._loadInt(((this._loadInt((_34_ + 20))) + 4))));
                                                continue label$12;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_34_ + 12), 5);
                                    }
                                    while (false);
                                    if ((this._loadInt((_34_ + 12))) != 0) {
                                        break label$1;
                                    }
                                    if ((((this._loadInt16u((_34_ + 6))) & (this._loadInt16u((_34_ + 10)))) & 65535) == 0) {
                                        break label$2;
                                    }
                                    this._storeInt((_34_ + 12), 0);
                                    break label$1;
                                }
                                while (false);
                                if ((((this._loadInt16u((_34_ + 10))) & (this._loadInt16u((_34_ + 8)))) & 65535) == 0) {
                                    break label$4;
                                }
                                this._storeInt((_34_ + 12), 0);
                                break label$3;
                            }
                            while (false);
                            this._storeInt((_34_ + 20), (this._loadInt(((this._loadInt((_34_ + 16))) + 32))));
                            label$14:
                            do {
                                label$16:
                                do {
                                    label$15:
                                    while (true) {
                                        if ((this._loadInt((_34_ + 20))) == 0) {
                                            break label$14;
                                        }
                                        if ((((this._loadInt16u(((this._loadInt((_34_ + 20))) + 12))) & (this._loadInt16u((_34_ + 10)))) & 65535) != 0) {
                                            break label$16;
                                        }
                                        if ((((this._loadInt16u(((this._loadInt((_34_ + 20))) + 10))) & (this._loadInt16u((_34_ + 10)))) & 65535) != 0) {
                                            break label$16;
                                        }
                                        this._storeInt((_34_ + 20), (this._loadInt(((this._loadInt((_34_ + 20))) + 4))));
                                        continue label$15;
                                    }
                                }
                                while (false);
                                this._storeInt((_34_ + 12), 5);
                            }
                            while (false);
                            if ((this._loadInt((_34_ + 12))) != 0) {
                                break label$0;
                            }
                            if ((this._storeInt((_34_ + 12), (unixShmSystemLock((this._loadInt((_34_ + 16))), 1, ((this._loadInt((_34_ + 40))) + 120), (this._loadInt((_34_ + 36))))))) != 0) {
                                break label$0;
                            }
                            this._storeInt16(((_33_ = this._loadInt((_34_ + 24))) + 12), ((this._loadInt16u((_33_ + 12))) | (this._loadInt16u((_34_ + 10)))));
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_34_ + 12), (unixShmSystemLock((this._loadInt((_34_ + 16))), 2, ((this._loadInt((_34_ + 40))) + 120), (this._loadInt((_34_ + 36))))));
                    }
                    while (false);
                    if ((this._loadInt((_34_ + 12))) != 0) {
                        break label$0;
                    }
                    this._storeInt16(((_33_ = this._loadInt((_34_ + 24))) + 12), ((this._loadInt16u((_33_ + 12))) & (_32_ = (this._loadInt16u((_34_ + 10))) ^ -1)));
                    this._storeInt16((_33_ + 10), ((this._loadInt16u((_33_ + 10))) & _32_));
                    break label$0;
                }
                while (false);
                this._storeInt((_34_ + 12), (unixShmSystemLock((this._loadInt((_34_ + 16))), 0, ((this._loadInt((_34_ + 40))) + 120), (this._loadInt((_34_ + 36))))));
            }
            while (false);
            if ((this._loadInt((_34_ + 12))) != 0) {
                break label$0;
            }
            this._storeInt16(((_33_ = this._loadInt((_34_ + 24))) + 10), ((this._loadInt16u((_33_ + 10))) | (this._loadInt16u((_34_ + 10)))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 12));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final void unixShmBarrier(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        unixEnterMutex();
        unixLeaveMutex();
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int unixShmUnmap(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 16), (this._loadInt(((this._storeInt((_32_ + 4), (this._loadInt((_32_ + 24))))) + 36))))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 8), ((this._storeInt((_32_ + 12), (this._loadInt((this._loadInt((_32_ + 16))))))) + 32));
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt((this._loadInt((_32_ + 8))))) == (this._loadInt((_32_ + 16)))) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 8), ((this._loadInt((this._loadInt((_32_ + 8))))) + 4));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt((this._loadInt((_32_ + 8))), (this._loadInt(((_31_ = this._loadInt((_32_ + 16))) + 4))));
                sqlite3_free(_31_);
                _30_ = this._storeInt(((this._loadInt((_32_ + 4))) + 36), 0);
                unixEnterMutex();
                this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 28), ((this._loadInt((_31_ + 28))) + -1));
                label$4:
                do {
                    if ((this._loadInt((_31_ + 28))) != 0) {
                        break label$4;
                    }
                    label$5:
                    do {
                        if ((this._loadInt((_32_ + 20))) == 0) {
                            break label$5;
                        }
                        if ((this._loadInt(((this._loadInt((_32_ + 12))) + 12))) < 0) {
                            break label$5;
                        }
                        unlink((this._loadInt(((this._loadInt((_32_ + 12))) + 8))));
                    }
                    while (false);
                    unixShmPurge((this._loadInt((_32_ + 4))));
                }
                while (false);
                unixLeaveMutex();
                this._storeInt((_32_ + 28), _30_);
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
    public final void unixEnterMutex()
    {
        return;
    }

    @Override()
    public final void unixShmPurge(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._loadInt(((this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 4))) + 28))))) == 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_31_ + 8))) + 28))) != 0) {
                break label$0;
            }
            _30_ = this._storeInt((_31_ + 4), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_31_ + 4))) >= (this._loadInt16u(((this._loadInt((_31_ + 8))) + 20)))) {
                        break label$2;
                    }
                    label$3:
                    do {
                        label$4:
                        do {
                            if ((this._loadInt(((this._loadInt((_31_ + 8))) + 12))) < _30_) {
                                break label$4;
                            }
                            this.munmap.invoke((this._loadInt(((this._loadInt(((_32_ = this._loadInt((_31_ + 8))) + 24))) + ((this._loadInt((_31_ + 4))) << 2)))), (this._loadInt((_32_ + 16))));
                            break label$3;
                        }
                        while (false);
                        sqlite3_free((this._loadInt(((this._loadInt(((this._loadInt((_31_ + 8))) + 24))) + ((this._loadInt((_31_ + 4))) << 2)))));
                    }
                    while (false);
                    this._storeInt((_31_ + 4), ((this._loadInt((_31_ + 4))) + 1));
                    continue label$1;
                }
            }
            while (false);
            sqlite3_free((this._loadInt(((this._loadInt((_31_ + 8))) + 24))));
            label$5:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 8))) + 12))) < 0) {
                    break label$5;
                }
                robust_close((this._loadInt((_31_ + 12))), (this._loadInt(((this._loadInt((_31_ + 8))) + 12))), 28151);
                this._storeInt(((this._loadInt((_31_ + 8))) + 12), -1);
            }
            while (false);
            this._storeInt(((this._loadInt((_30_ = this._loadInt((_31_ + 8))))) + 28), 0);
            sqlite3_free(_30_);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void unixLeaveMutex()
    {
        return;
    }

    @Override()
    public final void robust_close(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = 0;
        label$0:
        do {
            if ((this._iiTable[this._tableIndices[this._loadInt((0 + 21200))]].invoke((this._loadInt((_33_ + 8))))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt((_33_ + 12))) == 0) {
                    break label$1;
                }
                _32_ = this._loadInt(((this._loadInt((_33_ + 12))) + 32));
            }
            while (false);
            unixLogErrorAtLine(4106, 21376, _32_, (this._loadInt((_33_ + 4))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int unixLogErrorAtLine(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        int _35_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_34_ + 40), _31_);
        this._storeInt((_34_ + 36), _32_);
        this._storeInt((_34_ + 32), _33_);
        this._storeInt((_34_ + 28), (strerror((this._storeInt((_34_ + 24), (this._loadInt((__errno_location()))))))));
        label$0:
        do {
            if ((this._loadInt((_34_ + 36))) != 0) {
                break label$0;
            }
            this._storeInt((_34_ + 36), 21392);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        _32_ = this._loadInt((_34_ + 32));
        _31_ = this._loadInt((_34_ + 24));
        _30_ = this._loadInt((_34_ + 40));
        _35_ = this._loadInt((_34_ + 36));
        this._storeInt((_34_ + 16), (this._loadInt((_34_ + 28))));
        this._storeInt((_34_ + 12), _35_);
        this._storeInt((_34_ + 8), _30_);
        this._storeInt((_34_ + 4), _31_);
        this._storeInt(_34_, _32_);
        sqlite3_log(_33_, 21408, _34_);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int posixOpen(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _31_ = this._loadInt((_33_ + 8));
        _30_ = this._loadInt((_33_ + 12));
        this._storeInt(_33_, _32_);
        _32_ = this.open.invoke(_30_, _31_, _33_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int unixShmSystemLock(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_34_ + 56), _31_);
        this._storeInt((_34_ + 52), _32_);
        this._storeInt((_34_ + 48), _33_);
        _33_ = this._storeInt((_34_ + 12), 0);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_34_ + 60))) + 12))) < _33_) {
                break label$0;
            }
            memset((_34_ + 16), _33_, 32);
            this._storeInt16((_34_ + 16), (this._loadInt((_34_ + 56))));
            this._storeInt16((_34_ + 18), _33_);
            this._storeLong((_34_ + 24), (this._loadLong32s((_34_ + 52))));
            this._storeLong((_34_ + 32), (this._loadLong32s((_34_ + 48))));
            _32_ = this._loadInt(((this._loadInt((_34_ + 60))) + 12));
            this._storeInt(_34_, (_34_ + 16));
            _temp$0 = _33_;
            _temp$1 = 5;
            _temp$2 = ((this._storeInt((_34_ + 12), (this._iiiiTable[this._tableIndices[this._loadInt((_33_ + 21272))]].invoke(_32_, 13, _34_)))) != -1) ? _temp$0 : _temp$1;
            this._storeInt((_34_ + 12), _temp$2);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 12));
        this._storeInt((0 + 4), (_34_ + 64));
        return _33_;
    }

    @Override()
    public final int unixOpenSharedMemory(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 144))) + 136), _30_);
        _30_ = this._storeInt((_31_ + 132), 0);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeInt((_31_ + 132), (sqlite3_malloc(16)))) == 0) {
                            break label$3;
                        }
                        memset((this._loadInt((_31_ + 132))), _30_, 16);
                        unixEnterMutex();
                        this._storeInt((_31_ + 120), (this._loadInt(((this._loadInt((_31_ + 136))) + 4))));
                        if ((this._storeInt((_31_ + 128), (this._loadInt(((this._loadInt((_31_ + 120))) + 28))))) == 0) {
                            break label$2;
                        }
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_31_ + 140), 7);
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
                                    if ((this._iiiTable[this._tableIndices[this._loadInt((0 + 21248))]].invoke((this._loadInt(((this._loadInt((_31_ + 136))) + 8))), (_31_ + 8))) == 0) {
                                        break label$8;
                                    }
                                    if ((this._loadInt8u(((this._loadInt((_31_ + 120))) + 21))) == 0) {
                                        break label$7;
                                    }
                                }
                                while (false);
                                this._storeInt((_31_ + 112), ((_30_ = strlen((this._loadInt(((this._loadInt((_31_ + 136))) + 32))))) + 5));
                                label$9:
                                do {
                                    if ((this._storeInt((_31_ + 128), (sqlite3_malloc((_30_ + 41))))) == 0) {
                                        break label$9;
                                    }
                                    memset((this._loadInt((_31_ + 128))), 0, 36);
                                    _30_ = this._storeInt((_31_ + 116), (this._storeInt(((_30_ = this._loadInt((_31_ + 128))) + 8), (_30_ + 36))));
                                    _32_ = this._loadInt((_31_ + 112));
                                    this._storeInt(_31_, (this._loadInt(((this._loadInt((_31_ + 136))) + 32))));
                                    sqlite3_snprintf(_32_, _30_, 21696, _31_);
                                    this._storeInt(((_30_ = this._loadInt((_31_ + 128))) + 12), -1);
                                    this._storeInt(((this._loadInt(((this._loadInt((_31_ + 136))) + 4))) + 28), _30_);
                                    this._storeInt((this._loadInt((_31_ + 128))), (this._loadInt(((this._loadInt((_31_ + 136))) + 4))));
                                    this._storeInt(((_30_ = this._loadInt((_31_ + 128))) + 4), 8);
                                    if ((this._loadInt((_30_ + 4))) == 0) {
                                        break label$6;
                                    }
                                    if ((this._loadInt8u(((this._loadInt((_31_ + 120))) + 21))) != 0) {
                                        break label$1;
                                    }
                                    _30_ = robust_open((this._loadInt((_31_ + 116))), 66, ((this._loadInt((_31_ + 24))) & 511));
                                    label$10:
                                    do {
                                        if ((this._storeInt(((this._loadInt((_31_ + 128))) + 12), _30_)) > -1) {
                                            break label$10;
                                        }
                                        label$11:
                                        do {
                                            if ((this._storeInt((_31_ + 4), (sqlite3_uri_parameter((this._loadInt(((this._loadInt((_31_ + 136))) + 32))), 21712)))) == 0) {
                                                break label$11;
                                            }
                                            if ((sqlite3GetBoolean((this._loadInt((_31_ + 4))))) == 0) {
                                                break label$11;
                                            }
                                            _30_ = robust_open((this._loadInt((_31_ + 116))), 0, ((this._loadInt((_31_ + 24))) & 511));
                                            this._storeInt8(((_32_ = this._loadInt((_31_ + 128))) + 22), 1);
                                            this._storeInt((_32_ + 12), _30_);
                                        }
                                        while (false);
                                        if ((this._loadInt(((this._loadInt((_31_ + 128))) + 12))) <= -1) {
                                            break label$5;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_31_ + 124), 0);
                                    label$12:
                                    do {
                                        if ((unixShmSystemLock((this._loadInt((_31_ + 128))), 1, 128, 1)) != 0) {
                                            break label$12;
                                        }
                                        if ((robust_ftruncate((this._loadInt(((this._loadInt((_31_ + 128))) + 12))), 0L)) == 0) {
                                            break label$12;
                                        }
                                        this._storeInt((_31_ + 124), (unixLogErrorAtLine(4618, 21520, (this._loadInt((_31_ + 116))), 28279)));
                                    }
                                    while (false);
                                    label$13:
                                    do {
                                        if ((this._loadInt((_31_ + 124))) != 0) {
                                            break label$13;
                                        }
                                        this._storeInt((_31_ + 124), (unixShmSystemLock((this._loadInt((_31_ + 128))), 0, 128, 1)));
                                    }
                                    while (false);
                                    if ((this._loadInt((_31_ + 124))) != 0) {
                                        break label$4;
                                    }
                                    break label$1;
                                }
                                while (false);
                                this._storeInt((_31_ + 124), 7);
                                break label$4;
                            }
                            while (false);
                            this._storeInt((_31_ + 124), 1802);
                            break label$4;
                        }
                        while (false);
                        this._storeInt((_31_ + 124), 7);
                        break label$4;
                    }
                    while (false);
                    this._storeInt((_31_ + 124), (unixLogErrorAtLine((sqlite3CantopenError(28268)), 21440, (this._loadInt((_31_ + 116))), 28268)));
                }
                while (false);
                unixShmPurge((this._loadInt((_31_ + 136))));
                sqlite3_free((this._loadInt((_31_ + 132))));
                unixLeaveMutex();
                this._storeInt((_31_ + 140), (this._loadInt((_31_ + 124))));
                break label$0;
            }
            while (false);
            this._storeInt((this._loadInt((_31_ + 132))), (this._loadInt((_31_ + 128))));
            this._storeInt(((_30_ = this._loadInt((_31_ + 128))) + 28), ((this._loadInt((_30_ + 28))) + 1));
            this._storeInt(((this._loadInt((_31_ + 136))) + 36), (this._loadInt((_31_ + 132))));
            unixLeaveMutex();
            this._storeInt(((_30_ = this._loadInt((_31_ + 132))) + 4), (this._loadInt(((_32_ = this._loadInt((_31_ + 128))) + 32))));
            this._storeInt((_32_ + 32), _30_);
            this._storeInt((_31_ + 140), 0);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 140));
        this._storeInt((0 + 4), (_31_ + 144));
        return _30_;
    }

    @Override()
    public final int robust_ftruncate(int _30_, long _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeLong((_32_ + 16), _31_);
        label$0$end:
        do {
            label$0:
            while (true) {
                this._storeInt((_32_ + 12), (this._iilTable[this._tableIndices[this._loadInt((0 + 21260))]].invoke((this._loadInt((_32_ + 28))), (this._loadLong((_32_ + 16))))));
                _30_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_32_ + 12))) > -1) {
                        break label$2;
                    }
                    _30_ = ((this._loadInt((__errno_location()))) == 4) ? 1 : 0;
                }
                while (false);
                if (_30_ != 0) {
                    continue label$0;
                }
                break label$0$end;
            }
        }
        while (false);
        _30_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 32));
        return _30_;
    }

    @Override()
    public final int sqlite3_realloc(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((sqlite3_initialize()) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), (sqlite3Realloc((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3Realloc(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_32_ + 24))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt((_32_ + 20))) > 0) {
                        break label$1;
                    }
                    sqlite3_free((this._loadInt((_32_ + 24))));
                    this._storeInt((_32_ + 28), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 28), (sqlite3Malloc((this._loadInt((_32_ + 20))))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((_32_ + 20))) < 2147483392) {
                    break label$3;
                }
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 16), (sqlite3MallocSize((this._loadInt((_32_ + 24))))));
            label$4:
            do {
                label$5:
                do {
                    if ((this._storeInt((_32_ + 12), (this._iiTable[this._tableIndices[this._loadInt((0 + 20284))]].invoke((this._loadInt((_32_ + 20))))))) != (this._loadInt((_32_ + 16)))) {
                        break label$5;
                    }
                    this._storeInt((_32_ + 4), (this._loadInt((_32_ + 24))));
                    break label$4;
                }
                while (false);
                label$6:
                do {
                    if ((this._loadInt((0 + 20240))) == 0) {
                        break label$6;
                    }
                    sqlite3StatusSet(5, (this._loadInt((_32_ + 20))));
                    this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 12))) - (this._loadInt((_32_ + 16)))));
                    label$7:
                    do {
                        if (((long) (sqlite3StatusValue(0))) < ((this._loadLong((0 + 20476))) - (this._loadLong32s((_32_ + 8))))) {
                            break label$7;
                        }
                        sqlite3MallocAlarm((this._loadInt((_32_ + 8))));
                    }
                    while (false);
                    label$8:
                    do {
                        if ((this._storeInt((_32_ + 4), (this._iiiTable[this._tableIndices[this._loadInt((0 + 20276))]].invoke((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 12))))))) != 0) {
                            break label$8;
                        }
                        if ((this._loadInt((0 + 20484))) == 0) {
                            break label$8;
                        }
                        sqlite3MallocAlarm((this._loadInt((_32_ + 20))));
                        this._storeInt((_32_ + 4), (this._iiiTable[this._tableIndices[this._loadInt((0 + 20276))]].invoke((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 12))))));
                    }
                    while (false);
                    if ((this._loadInt((_32_ + 4))) == 0) {
                        break label$4;
                    }
                    sqlite3StatusAdd(0, ((this._storeInt((_32_ + 12), (sqlite3MallocSize((this._loadInt((_32_ + 4))))))) - (this._loadInt((_32_ + 16)))));
                    break label$4;
                }
                while (false);
                this._storeInt((_32_ + 4), (this._iiiTable[this._tableIndices[this._loadInt((0 + 20276))]].invoke((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 12))))));
            }
            while (false);
            this._storeInt((_32_ + 28), (this._loadInt((_32_ + 4))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int sqlite3_snprintf(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        _32_ = this._storeInt((_34_ + 12), _33_);
        _32_ = this._storeInt((_34_ + 16), (sqlite3_vsnprintf((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))), _32_)));
        this._storeInt((0 + 4), (_34_ + 32));
        return _32_;
    }

    @Override()
    public final int robust_open(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        label$0$end:
        do {
            label$0:
            while (true) {
                this._storeInt(_33_, (this._iiiiTable[this._tableIndices[this._loadInt((0 + 21188))]].invoke((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 4))))));
                _32_ = 0;
                label$2:
                do {
                    if ((this._loadInt(_33_)) > -1) {
                        break label$2;
                    }
                    _32_ = ((this._loadInt((__errno_location()))) == 4) ? 1 : 0;
                }
                while (false);
                if (_32_ != 0) {
                    continue label$0;
                }
                break label$0$end;
            }
        }
        while (false);
        _32_ = this._loadInt(_33_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int sqlite3_uri_parameter(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        this._storeInt((_32_ + 8), (((sqlite3Strlen30((this._loadInt((_32_ + 8))))) + (this._loadInt((_32_ + 8)))) + 1));
        label$0:
        do {
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt8u((this._loadInt((_32_ + 8))))) == 0) {
                            break label$1;
                        }
                        this._storeInt(_32_, (strcmp((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))))));
                        this._storeInt((_32_ + 8), (((sqlite3Strlen30((this._loadInt((_32_ + 8))))) + (this._loadInt((_32_ + 8)))) + 1));
                        if ((this._loadInt(_32_)) == 0) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 8), (((sqlite3Strlen30((this._loadInt((_32_ + 8))))) + (this._loadInt((_32_ + 8)))) + 1));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt((_32_ + 12), (this._loadInt((_32_ + 8))));
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
    public final int sqlite3GetBoolean(int _30_)
    {
        int _31_ = 0;
        _30_ = getSafetyLevel((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return (_30_ & 1);
    }

    @Override()
    public final int sqlite3CantopenError(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        _32_ = sqlite3_sourceid();
        this._storeInt(_31_, _30_);
        this._storeInt((_31_ + 4), (_32_ + 20));
        sqlite3_log(14, 21728, _31_);
        this._storeInt((0 + 4), (_31_ + 16));
        return 14;
    }

    @Override()
    public final int getSafetyLevel(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt8u(((this._loadInt8u((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)))) + 21776))) & 4) == 0) {
                    break label$1;
                }
                this._storeInt8((_31_ + 15), (sqlite3Atoi((this._loadInt((_31_ + 8))))));
                break label$0;
            }
            while (false);
            this._storeInt(_31_, (sqlite3Strlen30((this._loadInt((_31_ + 8))))));
            this._storeInt((_31_ + 4), 0);
            label$2:
            do {
                label$4:
                do {
                    label$3:
                    while (true) {
                        if ((this._loadInt((_31_ + 4))) > 6) {
                            break label$2;
                        }
                        label$5:
                        do {
                            if ((this._loadInt8u(((this._loadInt((_31_ + 4))) + 22032))) != (this._loadInt(_31_))) {
                                break label$5;
                            }
                            if ((sqlite3_strnicmp(((this._loadInt8u(((this._loadInt((_31_ + 4))) + 22048))) + 22064), (this._loadInt((_31_ + 8))), (this._loadInt(_31_)))) == 0) {
                                break label$4;
                            }
                        }
                        while (false);
                        this._storeInt((_31_ + 4), ((this._loadInt((_31_ + 4))) + 1));
                        continue label$3;
                    }
                }
                while (false);
                this._storeInt8((_31_ + 15), (this._loadInt8u(((this._loadInt((_31_ + 4))) + 22096))));
                break label$0;
            }
            while (false);
            this._storeInt8((_31_ + 15), 1);
        }
        while (false);
        _30_ = this._loadInt8u((_31_ + 15));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3Atoi(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_31_ + 8), 0);
        label$0:
        do {
            if ((this._loadInt((_31_ + 12))) == 0) {
                break label$0;
            }
            sqlite3GetInt32((this._loadInt((_31_ + 12))), (_31_ + 8));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3GetInt32(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 48) + 40), _30_);
        this._storeInt((_32_ + 36), _31_);
        this._storeLong((_32_ + 24), 0L);
        this._storeInt((_32_ + 12), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8s((this._loadInt((_32_ + 40))))) != 45) {
                    break label$1;
                }
                this._storeInt((_32_ + 40), ((this._storeInt((_32_ + 12), 1)) + (this._loadInt((_32_ + 40)))));
                break label$0;
            }
            while (false);
            if ((this._loadInt8s((this._loadInt((_32_ + 40))))) != 43) {
                break label$0;
            }
            this._storeInt((_32_ + 40), ((this._loadInt((_32_ + 40))) + 1));
        }
        while (false);
        label$3:
        do {
            label$2:
            while (true) {
                if ((this._loadInt8s((this._loadInt((_32_ + 40))))) != 48) {
                    break label$3;
                }
                this._storeInt((_32_ + 40), ((this._loadInt((_32_ + 40))) + 1));
                continue label$2;
            }
        }
        while (false);
        this._storeInt((_32_ + 20), 0);
        label$5:
        do {
            label$4:
            while (true) {
                _31_ = 0;
                label$6:
                do {
                    if ((this._loadInt((_32_ + 20))) > 10) {
                        break label$6;
                    }
                    _31_ = 0;
                    if ((this._storeInt((_32_ + 16), ((this._loadInt8s(((this._loadInt((_32_ + 40))) + (this._loadInt((_32_ + 20)))))) + -48))) < 0) {
                        break label$6;
                    }
                    _31_ = ((this._loadInt((_32_ + 16))) < 10) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$5;
                }
                this._storeLong((_32_ + 24), (((this._loadLong((_32_ + 24))) * 10L) + (this._loadLong32s((_32_ + 16)))));
                this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1));
                continue label$4;
            }
        }
        while (false);
        label$7:
        do {
            if ((this._loadInt((_32_ + 20))) < 11) {
                break label$7;
            }
            this._storeInt((_32_ + 44), 0);
            return (this._loadInt((_32_ + 44)));
        }
        while (false);
        label$8:
        do {
            if (((this._loadLong((_32_ + 24))) - (this._loadLong32s((_32_ + 12)))) < 2147483648L) {
                break label$8;
            }
            this._storeInt((_32_ + 44), 0);
            return (this._loadInt((_32_ + 44)));
        }
        while (false);
        label$9:
        do {
            if ((this._loadInt((_32_ + 12))) == 0) {
                break label$9;
            }
            this._storeLong((_32_ + 24), (0L - (this._loadLong((_32_ + 24)))));
        }
        while (false);
        this._storeLong32((this._loadInt((_32_ + 36))), (this._loadLong((_32_ + 24))));
        this._storeInt((_32_ + 44), 1);
        return (this._loadInt((_32_ + 44)));
    }

    @Override()
    public final int sqlite3_vsnprintf(int _30_, int _31_, int _32_, int _33_)
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
                if ((this._loadInt((_34_ + 40))) > 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 44), (this._loadInt((_34_ + 36))));
                break label$0;
            }
            while (false);
            sqlite3StrAccumInit(_34_, (this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 40))), 0);
            sqlite3VXPrintf(_34_, (this._storeInt8((_34_ + 25), 0)), (this._loadInt((_34_ + 32))), (this._loadInt((_34_ + 28))));
            this._storeInt((_34_ + 44), (sqlite3StrAccumFinish(_34_)));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int fcntlSizeHint(int _30_, long _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 160))) + 152), _30_);
        this._storeLong((_32_ + 144), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_32_ + 152))) + 40))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._iiiTable[this._tableIndices[this._loadInt((0 + 21248))]].invoke((this._loadInt(((this._loadInt((_32_ + 152))) + 8))), (_32_ + 32))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 156), 1802);
                    break label$0;
                }
                while (false);
                if ((this._storeLong((_32_ + 136), (((((this._loadLong((_32_ + 144))) + (_31_ = this._loadLong32s(((this._loadInt((_32_ + 152))) + 40)))) + -1L) / _31_) * _31_))) <= (this._loadLong((_32_ + 80)))) {
                    break label$1;
                }
                this._storeInt((_32_ + 28), (this._loadInt((_32_ + 88))));
                label$3:
                do {
                    if ((robust_ftruncate((this._loadInt(((this._loadInt((_32_ + 152))) + 8))), (this._loadLong((_32_ + 136))))) == 0) {
                        break label$3;
                    }
                    _30_ = __errno_location();
                    this._storeInt(((_33_ = this._loadInt((_32_ + 152))) + 20), (this._loadInt(_30_)));
                    this._storeInt((_32_ + 156), (unixLogErrorAtLine(1546, 21520, (this._loadInt((_33_ + 32))), 27892)));
                    break label$0;
                }
                while (false);
                this._storeLong((_32_ + 16), ((((((this._loadLong((_32_ + 80))) + ((long) ((_30_ = this._loadInt((_32_ + 28))) << 1))) + -1L) / (_31_ = (long) _30_)) * _31_) + -1L));
                label$5:
                do {
                    label$4:
                    while (true) {
                        if ((this._loadLong((_32_ + 16))) >= (this._loadLong((_32_ + 136)))) {
                            break label$1;
                        }
                        if ((this._storeInt((_32_ + 12), (seekAndWrite((this._loadInt((_32_ + 152))), (this._loadLong((_32_ + 16))), 21392, 1)))) != 1) {
                            break label$5;
                        }
                        this._storeLong((_32_ + 16), ((this._loadLong((_32_ + 16))) + (this._loadLong32s((_32_ + 28)))));
                        continue label$4;
                    }
                }
                while (false);
                this._storeInt((_32_ + 156), 778);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 156), 0);
        }
        while (false);
        _30_ = this._loadInt((_32_ + 156));
        this._storeInt((0 + 4), (_32_ + 160));
        return _30_;
    }

    @Override()
    public final int seekAndWrite(int _30_, long _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeLong((_34_ + 32), _31_);
        this._storeInt((_34_ + 28), _32_);
        this._storeInt((_34_ + 24), _33_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeLong((_34_ + 8), (lseek((this._loadInt(((this._loadInt((_34_ + 40))) + 8))), (this._loadLong((_34_ + 32))), 0)))) == (this._loadLong((_34_ + 32)))) {
                            break label$3;
                        }
                        if ((this._loadLong((_34_ + 8))) == -1L) {
                            break label$2;
                        }
                        this._storeInt(((this._loadInt((_34_ + 40))) + 20), 0);
                        break label$1;
                    }
                    while (false);
                    label$4$end:
                    do {
                        label$4:
                        while (true) {
                            this._storeInt((_34_ + 20), (this._iiiiTable[this._tableIndices[this._loadInt((0 + 21320))]].invoke((this._loadInt(((this._loadInt((_34_ + 40))) + 8))), (this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 24))))));
                            _33_ = 0;
                            label$6:
                            do {
                                if ((this._loadInt((_34_ + 20))) > -1) {
                                    break label$6;
                                }
                                _33_ = ((this._loadInt((__errno_location()))) == 4) ? 1 : 0;
                            }
                            while (false);
                            if (_33_ != 0) {
                                continue label$4;
                            }
                            break label$4$end;
                        }
                    }
                    while (false);
                    label$7:
                    do {
                        if ((this._loadInt((_34_ + 20))) > -1) {
                            break label$7;
                        }
                        _33_ = __errno_location();
                        this._storeInt(((this._loadInt((_34_ + 40))) + 20), (this._loadInt(_33_)));
                    }
                    while (false);
                    this._storeInt((_34_ + 44), (this._loadInt((_34_ + 20))));
                    break label$0;
                }
                while (false);
                _33_ = __errno_location();
                this._storeInt(((this._loadInt((_34_ + 40))) + 20), (this._loadInt(_33_)));
            }
            while (false);
            this._storeInt((_34_ + 44), -1);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int sqliteErrorFromPosixError(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 8), _30_);
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
                            if (((_31_ = (_30_ = this._loadInt((_32_ + 8))) + -1) & 4294967295L) > (36 & 4294967295L)) {
                                break label$4;
                            }
                            switch (_31_) {
                                case 0: {
                                    break label$1;
                                }
                                case 1:
                                case 2:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 11:
                                case 13:
                                case 14:
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
                                case 35: {
                                    break label$3;
                                }
                                case 3:
                                case 10:
                                case 15:
                                case 36: {
                                    break label$0;
                                }
                                case 12: {
                                    break label$2;
                                }
                                default: {
                                    break label$1;
                                }
                            }
                        }
                        while (false);
                        if (_30_ == 110) {
                            break label$0;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 12), (this._loadInt((_32_ + 4))));
                    return (this._loadInt((_32_ + 12)));
                }
                while (false);
                label$5:
                do {
                    if ((this._loadInt((_32_ + 4))) == 3850) {
                        break label$5;
                    }
                    if ((this._loadInt((_32_ + 4))) == 2058) {
                        break label$5;
                    }
                    if ((this._loadInt((_32_ + 4))) == 2314) {
                        break label$5;
                    }
                    if ((this._loadInt((_32_ + 4))) != 3594) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((_32_ + 12), 5);
                return (this._loadInt((_32_ + 12)));
            }
            while (false);
            this._storeInt((_32_ + 12), 3);
            return (this._loadInt((_32_ + 12)));
        }
        while (false);
        this._storeInt((_32_ + 12), 5);
        return (this._loadInt((_32_ + 12)));
    }

    @Override()
    public final int full_fsync(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = this._storeInt(_33_, (fsync((this._loadInt((_33_ + 12))))));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int seekAndRead(int _30_, long _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeLong((_34_ + 32), _31_);
        this._storeInt((_34_ + 28), _32_);
        this._storeInt((_34_ + 24), _33_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeLong((_34_ + 8), (lseek((this._loadInt(((this._loadInt((_34_ + 40))) + 8))), (this._loadLong((_34_ + 32))), 0)))) == (this._loadLong((_34_ + 32)))) {
                            break label$3;
                        }
                        if ((this._loadLong((_34_ + 8))) == -1L) {
                            break label$2;
                        }
                        this._storeInt(((this._loadInt((_34_ + 40))) + 20), 0);
                        break label$1;
                    }
                    while (false);
                    label$4$end:
                    do {
                        label$4:
                        while (true) {
                            this._storeInt((_34_ + 20), (this._iiiiTable[this._tableIndices[this._loadInt((0 + 21284))]].invoke((this._loadInt(((this._loadInt((_34_ + 40))) + 8))), (this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 24))))));
                            _33_ = 0;
                            label$6:
                            do {
                                if ((this._loadInt((_34_ + 20))) > -1) {
                                    break label$6;
                                }
                                _33_ = ((this._loadInt((__errno_location()))) == 4) ? 1 : 0;
                            }
                            while (false);
                            if (_33_ != 0) {
                                continue label$4;
                            }
                            break label$4$end;
                        }
                    }
                    while (false);
                    label$7:
                    do {
                        if ((this._loadInt((_34_ + 20))) > -1) {
                            break label$7;
                        }
                        _33_ = __errno_location();
                        this._storeInt(((this._loadInt((_34_ + 40))) + 20), (this._loadInt(_33_)));
                    }
                    while (false);
                    this._storeInt((_34_ + 44), (this._loadInt((_34_ + 20))));
                    break label$0;
                }
                while (false);
                _33_ = __errno_location();
                this._storeInt(((this._loadInt((_34_ + 40))) + 20), (this._loadInt(_33_)));
            }
            while (false);
            this._storeInt((_34_ + 44), -1);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int closeUnixFile(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._storeInt((_31_ + 12), _30_)))) + 12))) < 0) {
                break label$0;
            }
            robust_close((_30_ = this._loadInt((_31_ + 8))), (this._loadInt((_30_ + 12))), 26217);
            this._storeInt(((this._loadInt((_31_ + 8))) + 12), -1);
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt(((this._loadInt((_31_ + 8))) + 8))) < 0) {
                break label$1;
            }
            robust_close((_30_ = this._loadInt((_31_ + 8))), (this._loadInt((_30_ + 8))), 26221);
            this._storeInt(((this._loadInt((_31_ + 8))) + 8), -1);
        }
        while (false);
        sqlite3_free((this._loadInt(((this._loadInt((_31_ + 8))) + 28))));
        memset((this._loadInt((_31_ + 8))), 0, 44);
        this._storeInt((0 + 4), (_31_ + 16));
        return 0;
    }
}
