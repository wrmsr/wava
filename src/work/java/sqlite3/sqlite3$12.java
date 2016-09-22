package sqlite3;

abstract class sqlite3$12
        extends sqlite3$11
{
    protected sqlite3$12(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final int sqlite3_create_collation_v2(
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
        _35_ = this._storeInt((_36_ + 4), (createCollation((this._loadInt((_36_ + 28))), (this._loadInt((_36_ + 24))), (this._loadInt8u((_36_ + 20))), 0, (this._loadInt((_36_ + 16))), (this._loadInt((_36_ + 12))), _35_)));
        _35_ = this._storeInt((_36_ + 4), (sqlite3ApiExit((this._loadInt((_36_ + 28))), _35_)));
        this._storeInt((0 + 4), (_36_ + 32));
        return _35_;
    }

    @Override()
    public final int sqlite3_file_control(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_34_ + 40), _31_);
        this._storeInt((_34_ + 36), _32_);
        this._storeInt((_34_ + 32), _33_);
        _33_ = this._storeInt((_34_ + 28), 1);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_34_ + 40))) == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 24), 0);
                label$2:
                while (true) {
                    if ((this._loadInt((_34_ + 24))) >= (this._loadInt(((this._loadInt((_34_ + 44))) + 4)))) {
                        break label$0;
                    }
                    if ((strcmp((this._loadInt(((this._loadInt(((this._loadInt((_34_ + 44))) + 8))) + ((this._loadInt((_34_ + 24))) << 4)))), (this._loadInt((_34_ + 40))))) == 0) {
                        break label$0;
                    }
                    this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + _33_));
                    continue label$2;
                }
            }
            while (false);
            this._storeInt((_34_ + 24), 0);
        }
        while (false);
        label$4:
        do {
            if ((this._loadInt((_34_ + 24))) >= (this._loadInt(((this._loadInt((_34_ + 44))) + 4)))) {
                break label$4;
            }
            if ((this._storeInt((_34_ + 20), (this._loadInt((((this._loadInt(((this._loadInt((_34_ + 44))) + 8))) + ((this._loadInt((_34_ + 24))) << 4)) + 4))))) == 0) {
                break label$4;
            }
            sqlite3BtreeEnter((this._loadInt((_34_ + 20))));
            this._storeInt((_34_ + 12), (sqlite3PagerFile((this._storeInt((_34_ + 16), (sqlite3BtreePager((this._loadInt((_34_ + 20))))))))));
            label$5:
            do {
                if ((this._loadInt((_34_ + 36))) != 7) {
                    break label$5;
                }
                this._storeInt((this._loadInt((_34_ + 32))), (this._loadInt((_34_ + 12))));
                this._storeInt((_34_ + 28), 0);
                break label$4;
            }
            while (false);
            label$6:
            do {
                if ((this._loadInt((this._loadInt((_34_ + 12))))) == 0) {
                    break label$6;
                }
                this._storeInt((_34_ + 28), (sqlite3OsFileControl((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 32))))));
                break label$4;
            }
            while (false);
            this._storeInt((_34_ + 28), 12);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 28));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final long sqlite3_memory_highwater(int _30_)
    {
        long _31_ = 0L;
        int _32_ = 0;
        sqlite3_status(0, ((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), (_32_ + 20), (this._storeInt((_32_ + 28), _30_)));
        _31_ = this._storeLong((_32_ + 8), (this._loadLong32s((_32_ + 20))));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final long sqlite3_memory_used()
    {
        long _30_ = 0L;
        int _31_ = 0;
        sqlite3_status(0, ((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), (_31_ + 8), 0);
        _30_ = this._storeLong(_31_, (this._loadLong32s((_31_ + 12))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3_open_v2(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        _33_ = openDatabase((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))), _33_);
        this._storeInt((0 + 4), (_34_ + 16));
        return _33_;
    }

    @Override()
    public final int sqlite3_release_memory(int _30_)
    {
        this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_);
        return 0;
    }

    @Override()
    public final int sqlite3_sleep(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_31_ + 4), (sqlite3_vfs_find(0)))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 12), (this._storeInt(_31_, ((sqlite3OsSleep((this._loadInt((_31_ + 4))), ((this._loadInt((_31_ + 8))) * 1000))) / 1000))));
                break label$0;
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
    public final void sqlite3_soft_heap_limit(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) > -1) {
                break label$0;
            }
            this._storeInt((_31_ + 12), 0);
        }
        while (false);
        sqlite3_soft_heap_limit64((this._loadLong32s((_31_ + 12))));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3_vfs_unregister(int _30_)
    {
        int _31_ = 0;
        vfsUnlink((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return 0;
    }

    @Override()
    public final int sqlite3_threadsafe()
    {
        return 0;
    }

    @Override()
    public final void sqlite3_result_zeroblob(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        sqlite3VdbeMemSetZeroBlob(((this._loadInt((_32_ + 12))) + 8), _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3_result_error_code(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt(((_30_ = this._loadInt((_32_ + 12))) + 52), _31_);
        label$0:
        do {
            if (((this._loadInt16u((_30_ + 36))) & 1) == 0) {
                break label$0;
            }
            sqlite3VdbeMemSetStr(((this._loadInt((_32_ + 12))) + 8), (sqlite3ErrStr((this._loadInt((_32_ + 8))))), -1, 1, 0);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int sqlite3_test_control(int _30_, int _31_)
    {
        int _32_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 76), _30_);
        this._storeInt((_32_ + 72), 0);
        this._storeInt((_32_ + 68), _31_);
        label$0:
        do {
            if (((_30_ = (this._loadInt((_32_ + 76))) + -5) & 4294967295L) > (14 & 4294967295L)) {
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
                                                                    switch (_30_) {
                                                                        case 0: {
                                                                            break label$14;
                                                                        }
                                                                        case 1: {
                                                                            break label$13;
                                                                        }
                                                                        case 2: {
                                                                            break label$12;
                                                                        }
                                                                        case 3: {
                                                                            break label$11;
                                                                        }
                                                                        case 4: {
                                                                            break label$0;
                                                                        }
                                                                        case 5: {
                                                                            break label$10;
                                                                        }
                                                                        case 6: {
                                                                            break label$9;
                                                                        }
                                                                        case 7: {
                                                                            break label$8;
                                                                        }
                                                                        case 8: {
                                                                            break label$7;
                                                                        }
                                                                        case 9: {
                                                                            break label$6;
                                                                        }
                                                                        case 10: {
                                                                            break label$5;
                                                                        }
                                                                        case 11: {
                                                                            break label$4;
                                                                        }
                                                                        case 12: {
                                                                            break label$3;
                                                                        }
                                                                        case 13: {
                                                                            break label$2;
                                                                        }
                                                                        case 14: {
                                                                            break label$1;
                                                                        }
                                                                        default: {
                                                                            break label$14;
                                                                        }
                                                                    }
                                                                }
                                                                while (false);
                                                                sqlite3PrngSaveState();
                                                                break label$0;
                                                            }
                                                            while (false);
                                                            sqlite3PrngRestoreState();
                                                            break label$0;
                                                        }
                                                        while (false);
                                                        sqlite3PrngResetState();
                                                        break label$0;
                                                    }
                                                    while (false);
                                                    this._storeInt((_32_ + 68), ((_30_ = this._loadInt((_32_ + 68))) + 4));
                                                    this._storeInt((_32_ + 64), (this._loadInt(_30_)));
                                                    this._storeInt((_32_ + 68), ((_30_ = this._loadInt((_32_ + 68))) + 4));
                                                    _30_ = this._storeInt((_32_ + 60), (this._loadInt(_30_)));
                                                    this._storeInt((_32_ + 72), (sqlite3BitvecBuiltinTest((this._loadInt((_32_ + 64))), _30_)));
                                                    break label$0;
                                                }
                                                while (false);
                                                this._storeInt((_32_ + 68), ((_30_ = this._loadInt((_32_ + 68))) + 4));
                                                this._storeInt((_32_ + 56), (this._loadInt(_30_)));
                                                this._storeInt((_32_ + 68), ((_30_ = this._loadInt((_32_ + 68))) + 4));
                                                _30_ = this._storeInt((_32_ + 52), (this._loadInt(_30_)));
                                                sqlite3BenignMallocHooks((this._loadInt((_32_ + 56))), _30_);
                                                break label$0;
                                            }
                                            while (false);
                                            this._storeInt((_32_ + 72), (this._loadInt((0 + 22332))));
                                            this._storeInt((_32_ + 68), ((_30_ = this._loadInt((_32_ + 68))) + 4));
                                            if ((this._storeInt((_32_ + 48), (this._loadInt(_30_)))) == 0) {
                                                break label$0;
                                            }
                                            this._storeInt((0 + 22332), (this._loadInt((_32_ + 48))));
                                            break label$0;
                                        }
                                        while (false);
                                        this._storeInt((_32_ + 44), 0);
                                        this._storeInt((_32_ + 72), (this._loadInt((_32_ + 44))));
                                        break label$0;
                                    }
                                    while (false);
                                    this._storeInt((_32_ + 68), ((_30_ = this._loadInt((_32_ + 68))) + 4));
                                    this._storeInt((_32_ + 72), (this._storeInt((_32_ + 40), (this._loadInt(_30_)))));
                                    break label$0;
                                }
                                while (false);
                                this._storeInt((_32_ + 68), ((_30_ = this._loadInt((_32_ + 68))) + 4));
                                this._storeInt((_32_ + 36), (this._loadInt(_30_)));
                                this._storeInt((_32_ + 68), ((_30_ = this._loadInt((_32_ + 68))) + 4));
                                _30_ = this._storeInt((_32_ + 32), (this._loadInt(_30_)));
                                sqlite3BtreeSetPageSize((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 36))) + 8))) + 4))), 0, _30_, 0);
                                break label$0;
                            }
                            while (false);
                            this._storeInt((_32_ + 68), ((_30_ = this._loadInt((_32_ + 68))) + 4));
                            this._storeInt((_32_ + 28), (this._loadInt(_30_)));
                            this._storeInt((_32_ + 68), ((_30_ = this._loadInt((_32_ + 68))) + 4));
                            _30_ = this._storeInt((_32_ + 24), (this._loadInt(_30_)));
                            this._storeInt8(((this._loadInt((_32_ + 28))) + 12), _30_);
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_32_ + 68), ((_30_ = this._loadInt((_32_ + 68))) + 4));
                        _30_ = this._storeInt((_32_ + 16), (sqlite3Strlen30((this._storeInt((_32_ + 20), (this._loadInt(_30_)))))));
                        _temp$0 = 121;
                        _temp$1 = 0;
                        _temp$2 = ((sqlite3KeywordCode((this._loadInt((_32_ + 20))), _30_)) != 26) ? _temp$0 : _temp$1;
                        this._storeInt((_32_ + 72), _temp$2);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_32_ + 72), 36);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 68), ((_30_ = this._loadInt((_32_ + 68))) + 4));
                this._storeInt((_32_ + 4), (this._loadInt(_30_)));
                this._storeInt((_32_ + 68), ((_30_ = this._loadInt((_32_ + 68))) + 4));
                this._storeInt((_32_ + 8), (this._loadInt(_30_)));
                this._storeInt((_32_ + 68), ((_30_ = this._loadInt((_32_ + 68))) + 4));
                this._storeInt((_32_ + 12), (this._loadInt(_30_)));
                label$15:
                do {
                    if ((this._loadInt((_32_ + 4))) == 0) {
                        break label$15;
                    }
                    _30_ = sqlite3ScratchMalloc((this._loadInt((_32_ + 4))));
                    this._storeInt((this._loadInt((_32_ + 8))), _30_);
                }
                while (false);
                sqlite3ScratchFree((this._loadInt((_32_ + 12))));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 68), ((_30_ = this._loadInt((_32_ + 68))) + 4));
            this._storeInt((0 + 20464), (this._loadInt(_30_)));
        }
        while (false);
        _30_ = this._loadInt((_32_ + 72));
        this._storeInt((0 + 4), (_32_ + 80));
        return _30_;
    }

    @Override()
    public final int sqlite3_extended_result_codes(int _30_, int _31_)
    {
        int _32_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _temp$0 = -1;
        _temp$1 = 255;
        _temp$2 = (_31_ != 0) ? _temp$0 : _temp$1;
        this._storeInt(((this._loadInt((_32_ + 12))) + 24), _temp$2);
        return 0;
    }

    @Override()
    public final int sqlite3_limit(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_33_ + 20))) < 0) {
                    break label$1;
                }
                if ((this._loadInt((_33_ + 20))) < 11) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt((_33_ + 28), -1);
            return (this._loadInt((_33_ + 28)));
        }
        while (false);
        this._storeInt((_33_ + 12), (this._loadInt((((this._loadInt((_33_ + 24))) + ((this._loadInt((_33_ + 20))) << 2)) + 72))));
        label$2:
        do {
            if ((this._loadInt((_33_ + 16))) < 0) {
                break label$2;
            }
            label$3:
            do {
                if ((this._loadInt((_33_ + 16))) <= (this._loadInt((((this._loadInt((_33_ + 20))) << 2) + 29792)))) {
                    break label$3;
                }
                this._storeInt((_33_ + 16), (this._loadInt((((this._loadInt((_33_ + 20))) << 2) + 29792))));
            }
            while (false);
            this._storeInt((((this._loadInt((_33_ + 24))) + ((this._loadInt((_33_ + 20))) << 2)) + 72), (this._loadInt((_33_ + 16))));
        }
        while (false);
        this._storeInt((_33_ + 28), (this._loadInt((_33_ + 12))));
        return (this._loadInt((_33_ + 28)));
    }

    @Override()
    public final int sqlite3_next_stmt(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 8))) + 64))));
            return (this._loadInt((_32_ + 4)));
        }
        while (false);
        this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 12))) + 136))));
        return (this._loadInt((_32_ + 4)));
    }

    @Override()
    public final int sqlite3_sql(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeInt((_32_ + 12), _30_)))) == 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_32_ + 8))) + 105))) == 0) {
                break label$0;
            }
            _31_ = this._loadInt(((this._loadInt((_32_ + 8))) + 160));
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int sqlite3_backup_finish(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_)) == 0) {
                    break label$1;
                }
                sqlite3BtreeEnter((this._loadInt(((this._loadInt((_31_ + 24))) + 24))));
                this._storeInt((_31_ + 16), (this._loadInt(((this._loadInt(((this._loadInt((_31_ + 24))) + 20))) + 68))));
                label$2:
                do {
                    if ((this._loadInt((this._loadInt((_31_ + 24))))) == 0) {
                        break label$2;
                    }
                    this._storeInt(((_30_ = this._loadInt(((this._loadInt((_31_ + 24))) + 24))) + 16), ((this._loadInt((_30_ + 16))) + -1));
                }
                while (false);
                label$3:
                do {
                    if ((this._loadInt(((this._loadInt((_31_ + 24))) + 40))) == 0) {
                        break label$3;
                    }
                    this._storeInt((_31_ + 20), (sqlite3PagerBackupPtr((sqlite3BtreePager((this._loadInt(((this._loadInt((_31_ + 24))) + 24))))))));
                    label$5:
                    do {
                        label$4:
                        while (true) {
                            if ((this._loadInt((this._loadInt((_31_ + 20))))) == (this._loadInt((_31_ + 24)))) {
                                break label$5;
                            }
                            this._storeInt((_31_ + 20), ((this._loadInt((this._loadInt((_31_ + 20))))) + 44));
                            continue label$4;
                        }
                    }
                    while (false);
                    this._storeInt((this._loadInt((_31_ + 20))), (this._loadInt(((this._loadInt((_31_ + 24))) + 44))));
                }
                while (false);
                sqlite3BtreeRollback((this._loadInt(((this._loadInt((_31_ + 24))) + 4))));
                _30_ = 0;
                label$6:
                do {
                    if ((this._loadInt(((this._loadInt((_31_ + 24))) + 28))) == 101) {
                        break label$6;
                    }
                    _30_ = this._loadInt(((this._loadInt((_31_ + 24))) + 28));
                }
                while (false);
                this._storeInt((_31_ + 12), _30_);
                sqlite3Error((this._loadInt((this._loadInt((_31_ + 24))))), _30_, 0, 0);
                label$7:
                do {
                    if ((this._loadInt((this._loadInt((_31_ + 24))))) == 0) {
                        break label$7;
                    }
                    sqlite3_free((this._loadInt((_31_ + 24))));
                }
                while (false);
                this._storeInt((_31_ + 28), (this._loadInt((_31_ + 12))));
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 28), 0);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 28));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final int sqlite3_backup_init(int _30_, int _31_, int _32_, int _33_)
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
                if ((this._loadInt((_34_ + 20))) == (this._loadInt((_34_ + 28)))) {
                    break label$1;
                }
                if ((this._storeInt((_34_ + 12), (sqlite3_malloc(48)))) != 0) {
                    break label$0;
                }
                sqlite3Error((this._loadInt((_34_ + 28))), 7, 0, 0);
                break label$0;
            }
            while (false);
            sqlite3Error((this._loadInt((_34_ + 28))), 1, 29568, 0);
            this._storeInt((_34_ + 12), 0);
        }
        while (false);
        label$2:
        do {
            if ((this._loadInt((_34_ + 12))) == 0) {
                break label$2;
            }
            memset((this._loadInt((_34_ + 12))), 0, 48);
            _33_ = findBtree((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 16))));
            this._storeInt(((this._loadInt((_34_ + 12))) + 24), _33_);
            _33_ = findBtree((_33_ = this._loadInt((_34_ + 28))), _33_, (this._loadInt((_34_ + 24))));
            this._storeInt(((_32_ = this._loadInt((_34_ + 12))) + 4), _33_);
            this._storeInt(_32_, (this._loadInt((_34_ + 28))));
            this._storeInt(((this._loadInt((_34_ + 12))) + 20), (this._loadInt((_34_ + 20))));
            this._storeInt(((this._loadInt((_34_ + 12))) + 16), 1);
            _33_ = this._storeInt(((this._loadInt((_34_ + 12))) + 40), 0);
            label$3:
            do {
                if ((this._loadInt(((this._loadInt((_34_ + 12))) + 24))) == 0) {
                    break label$3;
                }
                if ((this._loadInt(((this._loadInt((_34_ + 12))) + 4))) == 0) {
                    break label$3;
                }
                if ((setDestPgsz((this._loadInt((_34_ + 12))))) != 7) {
                    break label$2;
                }
            }
            while (false);
            sqlite3_free((this._loadInt((_34_ + 12))));
            this._storeInt((_34_ + 12), _33_);
        }
        while (false);
        label$4:
        do {
            if ((this._loadInt((_34_ + 12))) == 0) {
                break label$4;
            }
            this._storeInt(((_33_ = this._loadInt(((this._loadInt((_34_ + 12))) + 24))) + 16), ((this._loadInt((_33_ + 16))) + 1));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 12));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final int sqlite3_backup_pagecount(int _30_)
    {
        return (this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 36)));
    }

    @Override()
    public final int sqlite3_backup_remaining(int _30_)
    {
        return (this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 32)));
    }

    @Override()
    public final int sqlite3_backup_step(int _30_, int _31_)
    {
        int _32_ = 0;
        long _33_ = 0L;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 112))) + 108), _30_);
        this._storeInt((_32_ + 104), _31_);
        _31_ = this._storeInt((_32_ + 88), (this._storeInt((_32_ + 92), 0)));
        sqlite3BtreeEnter((this._loadInt(((this._loadInt((_32_ + 108))) + 24))));
        label$0:
        do {
            if ((isFatalError((this._storeInt((_32_ + 100), (this._loadInt(((this._loadInt((_32_ + 108))) + 28))))))) != 0) {
                break label$0;
            }
            this._storeInt((_32_ + 84), (sqlite3BtreePager((this._loadInt(((this._loadInt((_32_ + 108))) + 24))))));
            this._storeInt((_32_ + 80), (sqlite3BtreePager((this._loadInt(((this._loadInt((_32_ + 108))) + 4))))));
            this._storeInt((_32_ + 72), -1);
            this._storeInt((_32_ + 68), _31_);
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((this._loadInt((_32_ + 108))))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt8u(((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 108))) + 24))) + 4))) + 23))) != 2) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 100), 5);
                    break label$1;
                }
                while (false);
                this._storeInt((_32_ + 100), 0);
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((_32_ + 100))) != 0) {
                    break label$3;
                }
                if ((this._loadInt(((this._loadInt((_32_ + 108))) + 12))) != 0) {
                    break label$3;
                }
                if ((this._storeInt((_32_ + 100), (sqlite3BtreeBeginTrans((this._loadInt(((this._loadInt((_32_ + 108))) + 4))), 2)))) != 0) {
                    break label$3;
                }
                _30_ = this._storeInt(((_31_ = this._loadInt((_32_ + 108))) + 12), 1);
                sqlite3BtreeGetMeta((this._loadInt((_31_ + 4))), _30_, (_31_ + 8));
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt((_32_ + 100))) != 0) {
                    break label$4;
                }
                if ((sqlite3BtreeIsInReadTrans((this._loadInt(((this._loadInt((_32_ + 108))) + 24))))) != 0) {
                    break label$4;
                }
                this._storeInt((_32_ + 100), (sqlite3BtreeBeginTrans((this._loadInt(((this._loadInt((_32_ + 108))) + 24))), 0)));
                this._storeInt((_32_ + 68), 1);
            }
            while (false);
            this._storeInt((_32_ + 92), (sqlite3BtreeGetPageSize((this._loadInt(((this._loadInt((_32_ + 108))) + 24))))));
            this._storeInt((_32_ + 88), (sqlite3BtreeGetPageSize((this._loadInt(((this._loadInt((_32_ + 108))) + 4))))));
            this._storeInt((_32_ + 96), (sqlite3PagerGetJournalMode((sqlite3BtreePager((this._loadInt(((this._loadInt((_32_ + 108))) + 4))))))));
            label$5:
            do {
                if ((this._loadInt((_32_ + 100))) != 0) {
                    break label$5;
                }
                if ((this._loadInt((_32_ + 96))) != 5) {
                    break label$5;
                }
                if ((this._loadInt((_32_ + 92))) == (this._loadInt((_32_ + 88)))) {
                    break label$5;
                }
                this._storeInt((_32_ + 100), 8);
            }
            while (false);
            this._storeInt((_32_ + 72), (sqlite3BtreeLastPage((this._loadInt(((this._loadInt((_32_ + 108))) + 24))))));
            _30_ = this._storeInt((_32_ + 76), 0);
            label$7:
            do {
                label$6:
                while (true) {
                    label$8:
                    do {
                        label$9:
                        do {
                            if ((this._loadInt((_32_ + 104))) < _30_) {
                                break label$9;
                            }
                            _31_ = 0;
                            if ((this._loadInt((_32_ + 76))) >= (this._loadInt((_32_ + 104)))) {
                                break label$8;
                            }
                        }
                        while (false);
                        _31_ = 0;
                        if (((this._loadInt(((this._loadInt((_32_ + 108))) + 16))) & 4294967295L) > ((this._loadInt((_32_ + 72))) & 4294967295L)) {
                            break label$8;
                        }
                        _31_ = ((this._loadInt((_32_ + 100))) == 0) ? 1 : 0;
                    }
                    while (false);
                    if (_31_ == 0) {
                        break label$7;
                    }
                    label$10:
                    do {
                        if ((this._storeInt((_32_ + 64), (this._loadInt(((this._loadInt((_32_ + 108))) + 16))))) == (((this._loadInt((_30_ + 22332))) / (this._loadInt(((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 108))) + 24))) + 4))) + 36)))) + 1)) {
                            break label$10;
                        }
                        if ((this._storeInt((_32_ + 100), (sqlite3PagerAcquire((this._loadInt((_32_ + 84))), (this._loadInt((_32_ + 64))), (_32_ + 60), _30_)))) != 0) {
                            break label$10;
                        }
                        this._storeInt((_32_ + 100), (backupOnePage((this._loadInt((_32_ + 108))), (this._loadInt((_32_ + 64))), (sqlite3PagerGetData((this._loadInt((_32_ + 60))))))));
                        sqlite3PagerUnref((this._loadInt((_32_ + 60))));
                    }
                    while (false);
                    this._storeInt(((_31_ = this._loadInt((_32_ + 108))) + 16), ((this._loadInt((_31_ + 16))) + 1));
                    this._storeInt((_32_ + 76), ((this._loadInt((_32_ + 76))) + 1));
                    continue label$6;
                }
            }
            while (false);
            label$11:
            do {
                if ((this._loadInt((_32_ + 100))) != 0) {
                    break label$11;
                }
                this._storeInt(((_31_ = this._loadInt((_32_ + 108))) + 32), (((this._storeInt((_31_ + 36), (this._loadInt((_32_ + 72))))) + 1) - (this._loadInt((_31_ + 16)))));
                label$12:
                do {
                    if (((this._loadInt(((this._loadInt((_32_ + 108))) + 16))) & 4294967295L) <= ((this._loadInt((_32_ + 72))) & 4294967295L)) {
                        break label$12;
                    }
                    this._storeInt((_32_ + 100), 101);
                    break label$11;
                }
                while (false);
                if ((this._loadInt(((this._loadInt((_32_ + 108))) + 40))) != 0) {
                    break label$11;
                }
                attachBackupObject((this._loadInt((_32_ + 108))));
            }
            while (false);
            label$13:
            do {
                if ((this._loadInt((_32_ + 100))) != 101) {
                    break label$13;
                }
                if ((this._storeInt((_32_ + 100), (sqlite3BtreeUpdateMeta((this._loadInt(((_31_ = this._loadInt((_32_ + 108))) + 4))), 1, ((this._loadInt((_31_ + 8))) + 1))))) != 0) {
                    break label$13;
                }
                label$14:
                do {
                    if ((this._loadInt((this._loadInt((_32_ + 108))))) == 0) {
                        break label$14;
                    }
                    sqlite3ResetInternalSchema((this._loadInt((this._loadInt((_32_ + 108))))), -1);
                }
                while (false);
                label$15:
                do {
                    label$16:
                    do {
                        if ((this._loadInt((_32_ + 92))) >= (this._loadInt((_32_ + 88)))) {
                            break label$16;
                        }
                        if ((this._storeInt((_32_ + 56), ((((_31_ = this._storeInt((_32_ + 52), ((this._loadInt((_32_ + 88))) / (this._loadInt((_32_ + 92)))))) + (this._loadInt((_32_ + 72)))) + -1) / _31_))) != (((this._loadInt((0 + 22332))) / (this._loadInt(((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 108))) + 4))) + 4))) + 36)))) + 1)) {
                            break label$15;
                        }
                        this._storeInt((_32_ + 56), ((this._loadInt((_32_ + 56))) + -1));
                        break label$15;
                    }
                    while (false);
                    this._storeInt((_32_ + 56), ((this._loadInt((_32_ + 72))) * ((this._loadInt((_32_ + 92))) / (this._loadInt((_32_ + 88))))));
                }
                while (false);
                sqlite3PagerTruncateImage((this._loadInt((_32_ + 80))), (this._loadInt((_32_ + 56))));
                label$17:
                do {
                    label$18:
                    do {
                        label$19:
                        do {
                            label$20:
                            do {
                                if ((this._loadInt((_32_ + 92))) >= (this._loadInt((_32_ + 88)))) {
                                    break label$20;
                                }
                                this._storeLong((_32_ + 40), ((this._loadLong32s((_32_ + 92))) * (this._loadLong32s((_32_ + 72)))));
                                this._storeInt((_32_ + 36), (sqlite3PagerFile((this._loadInt((_32_ + 80))))));
                                this._storeInt((_32_ + 100), (sqlite3PagerCommitPhaseOne((this._loadInt((_32_ + 80))), 0, 1)));
                                if (((long) ((this._loadInt((0 + 22332))) + (this._loadInt((_32_ + 88))))) >= (this._loadLong((_32_ + 40)))) {
                                    break label$19;
                                }
                                _33_ = (long) ((this._loadInt((0 + 22332))) + (this._loadInt((_32_ + 88))));
                                break label$18;
                            }
                            while (false);
                            this._storeInt((_32_ + 100), (sqlite3PagerCommitPhaseOne((this._loadInt((_32_ + 80))), 0, 0)));
                            break label$17;
                        }
                        while (false);
                        _33_ = this._loadLong((_32_ + 40));
                    }
                    while (false);
                    this._storeLong((_32_ + 16), _33_);
                    this._storeLong((_32_ + 24), ((long) ((this._loadInt((0 + 22332))) + (this._loadInt((_32_ + 92))))));
                    label$22:
                    do {
                        label$21:
                        while (true) {
                            _31_ = 0;
                            label$23:
                            do {
                                if ((this._loadInt((_32_ + 100))) != 0) {
                                    break label$23;
                                }
                                _31_ = ((this._loadLong((_32_ + 24))) < (this._loadLong((_32_ + 16)))) ? 1 : 0;
                            }
                            while (false);
                            if (_31_ == 0) {
                                break label$22;
                            }
                            _31_ = this._storeInt((_32_ + 12), 0);
                            _30_ = this._storeInt((_32_ + 8), ((int) (((this._loadLong((_32_ + 24))) / (this._loadLong32s((_32_ + 92)))) + 1L)));
                            label$24:
                            do {
                                if ((this._storeInt((_32_ + 100), (sqlite3PagerAcquire((this._loadInt((_32_ + 84))), _30_, (_32_ + 12), _31_)))) != 0) {
                                    break label$24;
                                }
                                _31_ = this._storeInt((_32_ + 4), (sqlite3PagerGetData((this._loadInt((_32_ + 12))))));
                                this._storeInt((_32_ + 100), (sqlite3OsWrite((this._loadInt((_32_ + 36))), _31_, (this._loadInt((_32_ + 92))), (this._loadLong((_32_ + 24))))));
                            }
                            while (false);
                            sqlite3PagerUnref((this._loadInt((_32_ + 12))));
                            this._storeLong((_32_ + 24), ((this._loadLong((_32_ + 24))) + (this._loadLong32s((_32_ + 92)))));
                            continue label$21;
                        }
                    }
                    while (false);
                    label$25:
                    do {
                        if ((this._loadInt((_32_ + 100))) != 0) {
                            break label$25;
                        }
                        this._storeInt((_32_ + 100), (backupTruncateFile((this._loadInt((_32_ + 36))), (this._loadLong((_32_ + 40))))));
                    }
                    while (false);
                    if ((this._loadInt((_32_ + 100))) != 0) {
                        break label$17;
                    }
                    this._storeInt((_32_ + 100), (sqlite3PagerSync((this._loadInt((_32_ + 80))))));
                }
                while (false);
                if ((this._loadInt((_32_ + 100))) != 0) {
                    break label$13;
                }
                if ((this._storeInt((_32_ + 100), (sqlite3BtreeCommitPhaseTwo((this._loadInt(((this._loadInt((_32_ + 108))) + 4))), 0)))) != 0) {
                    break label$13;
                }
                this._storeInt((_32_ + 100), 101);
            }
            while (false);
            label$26:
            do {
                if ((this._loadInt((_32_ + 68))) == 0) {
                    break label$26;
                }
                sqlite3BtreeCommitPhaseOne((this._loadInt(((this._loadInt((_32_ + 108))) + 24))), 0);
                sqlite3BtreeCommitPhaseTwo((this._loadInt(((this._loadInt((_32_ + 108))) + 24))), 0);
            }
            while (false);
            label$27:
            do {
                if ((this._loadInt((_32_ + 100))) != 3082) {
                    break label$27;
                }
                this._storeInt((_32_ + 100), 7);
            }
            while (false);
            this._storeInt(((this._loadInt((_32_ + 108))) + 28), (this._loadInt((_32_ + 100))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 100));
        this._storeInt((0 + 4), (_32_ + 112));
        return _31_;
    }

    @Override()
    public final int sqlite3_create_function_v2(
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
        this._storeInt((_39_ + 8), 1);
        this._storeInt((_39_ + 4), 0);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_39_ + 12))) == 0) {
                        break label$2;
                    }
                    if ((this._storeInt((_39_ + 4), (sqlite3DbMallocZero((this._loadInt((_39_ + 44))), 12)))) == 0) {
                        break label$1;
                    }
                    this._storeInt(((_38_ = this._loadInt((_39_ + 4))) + 8), (this._loadInt((_39_ + 28))));
                    this._storeInt((_38_ + 4), (this._loadInt((_39_ + 12))));
                }
                while (false);
                this._storeInt((_39_ + 8), (sqlite3CreateFunc((this._loadInt((_39_ + 44))), (this._loadInt((_39_ + 40))), (this._loadInt((_39_ + 36))), (this._loadInt((_39_ + 32))), (this._loadInt((_39_ + 28))), (this._loadInt((_39_ + 24))), (this._loadInt((_39_ + 20))), (this._loadInt((_39_ + 16))), (this._loadInt((_39_ + 4))))));
                if ((this._loadInt((_39_ + 4))) == 0) {
                    break label$0;
                }
                if ((this._loadInt((this._loadInt((_39_ + 4))))) != 0) {
                    break label$0;
                }
                this._viTable[this._tableIndices[this._loadInt((_39_ + 12))]].invoke((this._loadInt((_39_ + 28))));
                sqlite3DbFree((this._loadInt((_39_ + 44))), (this._loadInt((_39_ + 4))));
                break label$0;
            }
            while (false);
            this._viTable[this._tableIndices[this._loadInt((_39_ + 12))]].invoke((this._loadInt((_39_ + 28))));
        }
        while (false);
        _38_ = this._storeInt((_39_ + 8), (sqlite3ApiExit((this._loadInt((_39_ + 44))), (this._loadInt((_39_ + 8))))));
        this._storeInt((0 + 4), (_39_ + 48));
        return _38_;
    }

    @Override()
    public final int sqlite3_db_config(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_33_ + 40), _31_);
        this._storeInt((_33_ + 36), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_33_ + 40))) != 1001) {
                    break label$1;
                }
                this._storeInt((_33_ + 36), ((_31_ = this._loadInt((_33_ + 36))) + 4));
                this._storeInt((_33_ + 28), (this._loadInt(_31_)));
                this._storeInt((_33_ + 36), ((_31_ = this._loadInt((_33_ + 36))) + 4));
                this._storeInt((_33_ + 24), (this._loadInt(_31_)));
                this._storeInt((_33_ + 36), ((_31_ = this._loadInt((_33_ + 36))) + 4));
                _31_ = this._storeInt((_33_ + 20), (this._loadInt(_31_)));
                this._storeInt((_33_ + 32), (setupLookaside((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 24))), _31_)));
                break label$0;
            }
            while (false);
            _31_ = this._storeInt((_33_ + 32), 1);
            this._storeInt((_33_ + 16), 0);
            label$3:
            do {
                label$2:
                while (true) {
                    if (((this._loadInt((_33_ + 16))) & 4294967295L) > (_31_ & 4294967295L)) {
                        break label$0;
                    }
                    if ((this._loadInt((((this._loadInt((_33_ + 16))) << 3) + 29296))) == (this._loadInt((_33_ + 40)))) {
                        break label$3;
                    }
                    this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + _31_));
                    continue label$2;
                }
            }
            while (false);
            this._storeInt((_33_ + 36), ((_31_ = this._loadInt((_33_ + 36))) + 4));
            this._storeInt((_33_ + 12), (this._loadInt(_31_)));
            this._storeInt((_33_ + 36), ((_31_ = this._loadInt((_33_ + 36))) + 4));
            this._storeInt((_33_ + 8), (this._loadInt(_31_)));
            this._storeInt((_33_ + 4), (this._loadInt(((this._loadInt((_33_ + 44))) + 12))));
            label$4:
            do {
                label$5:
                do {
                    if ((this._loadInt((_33_ + 12))) < 1) {
                        break label$5;
                    }
                    this._storeInt(((_31_ = this._loadInt((_33_ + 44))) + 12), ((this._loadInt((_31_ + 12))) | (this._loadInt((((this._loadInt((_33_ + 16))) << 3) + 29300)))));
                    break label$4;
                }
                while (false);
                if ((this._loadInt((_33_ + 12))) != 0) {
                    break label$4;
                }
                this._storeInt(((_31_ = this._loadInt((_33_ + 44))) + 12), ((this._loadInt((_31_ + 12))) & ((this._loadInt((((this._loadInt((_33_ + 16))) << 3) + 29300))) ^ -1)));
            }
            while (false);
            label$6:
            do {
                if ((this._loadInt((_33_ + 4))) == (this._loadInt(((this._loadInt((_33_ + 44))) + 12)))) {
                    break label$6;
                }
                sqlite3ExpirePreparedStatements((this._loadInt((_33_ + 44))));
            }
            while (false);
            label$7:
            do {
                if ((this._loadInt((_33_ + 8))) == 0) {
                    break label$7;
                }
                this._storeInt((this._loadInt((_33_ + 8))), ((((this._loadInt(((this._loadInt((_33_ + 44))) + 12))) & (this._loadInt((((this._loadInt((_33_ + 16))) << 3) + 29300)))) != 0) ? 1 : 0));
            }
            while (false);
            this._storeInt((_33_ + 32), 0);
        }
        while (false);
        _31_ = this._loadInt((_33_ + 32));
        this._storeInt((0 + 4), (_33_ + 48));
        return _31_;
    }

    @Override()
    public final int sqlite3_db_mutex(int _30_)
    {
        return (this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 68)));
    }

    @Override()
    public final int sqlite3_db_status(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_35_ + 56), _31_);
        this._storeInt((_35_ + 52), _32_);
        this._storeInt((_35_ + 48), _33_);
        this._storeInt((_35_ + 44), _34_);
        this._storeInt((_35_ + 40), 0);
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
                                    if (((_34_ = this._loadInt((_35_ + 56))) & 4294967295L) > (6 & 4294967295L)) {
                                        break label$6;
                                    }
                                    label$7:
                                    do {
                                        switch (_34_) {
                                            case 0: {
                                                break label$5;
                                            }
                                            case 1: {
                                                break label$4;
                                            }
                                            case 2: {
                                                break label$3;
                                            }
                                            case 3: {
                                                break label$1;
                                            }
                                            case 4:
                                            case 5:
                                            case 6: {
                                                break label$7;
                                            }
                                            default: {
                                                break label$5;
                                            }
                                        }
                                    }
                                    while (false);
                                    _34_ = this._storeInt((this._loadInt((_35_ + 52))), 0);
                                    this._storeInt((this._loadInt((_35_ + 48))), (this._loadInt((((this._loadInt((_35_ + 60))) + ((this._loadInt((_35_ + 56))) << 2)) + 228))));
                                    if ((this._loadInt((_35_ + 44))) == 0) {
                                        break label$0;
                                    }
                                    this._storeInt((((this._loadInt((_35_ + 60))) + ((this._loadInt((_35_ + 56))) << 2)) + 228), _34_);
                                    break label$0;
                                }
                                while (false);
                                this._storeInt((_35_ + 40), 1);
                                break label$0;
                            }
                            while (false);
                            this._storeInt((this._loadInt((_35_ + 52))), (this._loadInt(((this._loadInt((_35_ + 60))) + 236))));
                            this._storeInt((this._loadInt((_35_ + 48))), (this._loadInt(((this._loadInt((_35_ + 60))) + 240))));
                            if ((this._loadInt((_35_ + 44))) == 0) {
                                break label$0;
                            }
                            this._storeInt(((_34_ = this._loadInt((_35_ + 60))) + 240), (this._loadInt((_34_ + 236))));
                            break label$0;
                        }
                        while (false);
                        _34_ = this._storeInt((_35_ + 36), 0);
                        sqlite3BtreeEnterAll((this._loadInt((_35_ + 60))));
                        this._storeInt((_35_ + 32), _34_);
                        label$8:
                        while (true) {
                            if ((this._loadInt((_35_ + 32))) >= (this._loadInt(((this._loadInt((_35_ + 60))) + 4)))) {
                                break label$2;
                            }
                            label$10:
                            do {
                                if ((this._storeInt((_35_ + 28), (this._loadInt((((this._loadInt(((this._loadInt((_35_ + 60))) + 8))) + ((this._loadInt((_35_ + 32))) << 4)) + 4))))) == 0) {
                                    break label$10;
                                }
                                this._storeInt((_35_ + 36), ((sqlite3PagerMemUsed((this._storeInt((_35_ + 24), (sqlite3BtreePager((this._loadInt((_35_ + 28))))))))) + (this._loadInt((_35_ + 36)))));
                            }
                            while (false);
                            this._storeInt((_35_ + 32), ((this._loadInt((_35_ + 32))) + 1));
                            continue label$8;
                        }
                    }
                    while (false);
                    _34_ = this._storeInt((_35_ + 16), 0);
                    sqlite3BtreeEnterAll((this._loadInt((_35_ + 60))));
                    this._storeInt(((this._loadInt((_35_ + 60))) + 504), (_35_ + 16));
                    _32_ = this._storeInt((_35_ + 20), _34_);
                    label$11:
                    while (true) {
                        label$13:
                        do {
                            label$14:
                            do {
                                if ((this._loadInt((_35_ + 20))) >= (this._loadInt(((this._loadInt((_35_ + 60))) + 4)))) {
                                    break label$14;
                                }
                                if ((this._storeInt((_35_ + 12), (this._loadInt((((this._loadInt(((this._loadInt((_35_ + 60))) + 8))) + ((this._loadInt((_35_ + 20))) << 4)) + 12))))) == 0) {
                                    break label$13;
                                }
                                _33_ = this._iiTable[this._tableIndices[this._loadInt((_32_ + 20284))]].invoke(20);
                                this._storeInt((_35_ + 16), ((this._loadInt((_35_ + 16))) + (_33_ * ((((this._loadInt(((_34_ = this._loadInt((_35_ + 12))) + 12))) + (this._loadInt((_34_ + 44)))) + (this._loadInt((_34_ + 28)))) + (this._loadInt((_34_ + 60)))))));
                                this._storeInt((_35_ + 16), ((sqlite3MallocSize((this._loadInt(((this._loadInt((_35_ + 12))) + 20))))) + (this._loadInt((_35_ + 16)))));
                                this._storeInt((_35_ + 16), ((sqlite3MallocSize((this._loadInt(((this._loadInt((_35_ + 12))) + 52))))) + (this._loadInt((_35_ + 16)))));
                                this._storeInt((_35_ + 16), ((sqlite3MallocSize((this._loadInt(((this._loadInt((_35_ + 12))) + 36))))) + (this._loadInt((_35_ + 16)))));
                                this._storeInt((_35_ + 16), ((sqlite3MallocSize((this._loadInt(((this._loadInt((_35_ + 12))) + 68))))) + (this._loadInt((_35_ + 16)))));
                                this._storeInt((_35_ + 8), (this._loadInt(((this._loadInt((_35_ + 12))) + 48))));
                                label$16:
                                do {
                                    label$15:
                                    while (true) {
                                        if ((this._loadInt((_35_ + 8))) == 0) {
                                            break label$16;
                                        }
                                        sqlite3DeleteTrigger((this._loadInt((_35_ + 60))), (this._loadInt(((this._loadInt((_35_ + 8))) + 8))));
                                        this._storeInt((_35_ + 8), (this._loadInt((this._loadInt((_35_ + 8))))));
                                        continue label$15;
                                    }
                                }
                                while (false);
                                this._storeInt((_35_ + 8), (this._loadInt(((this._loadInt((_35_ + 12))) + 16))));
                                label$17:
                                while (true) {
                                    if ((this._loadInt((_35_ + 8))) == 0) {
                                        break label$13;
                                    }
                                    sqlite3DeleteTable((this._loadInt((_35_ + 60))), (this._loadInt(((this._loadInt((_35_ + 8))) + 8))));
                                    this._storeInt((_35_ + 8), (this._loadInt((this._loadInt((_35_ + 8))))));
                                    continue label$17;
                                }
                            }
                            while (false);
                            _34_ = this._storeInt(((this._loadInt((_35_ + 60))) + 504), 0);
                            this._storeInt((this._loadInt((_35_ + 48))), _34_);
                            this._storeInt((this._loadInt((_35_ + 52))), (this._loadInt((_35_ + 16))));
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_35_ + 20), ((this._loadInt((_35_ + 20))) + 1));
                        continue label$11;
                    }
                }
                while (false);
                this._storeInt((this._loadInt((_35_ + 52))), (this._loadInt((_35_ + 36))));
                this._storeInt((this._loadInt((_35_ + 48))), 0);
                break label$0;
            }
            while (false);
            this._storeInt(_35_, 0);
            this._storeInt(((_34_ = this._storeInt(((_33_ = this._loadInt((_35_ + 60))) + 504), _35_)) + 4), (this._loadInt((_33_ + 136))));
            label$20:
            do {
                label$19:
                while (true) {
                    if ((this._loadInt((_34_ + 4))) == 0) {
                        break label$20;
                    }
                    sqlite3VdbeDeleteObject((this._loadInt((_34_ + 60))), (this._loadInt((_34_ + 4))));
                    this._storeInt((_34_ + 4), (this._loadInt(((this._loadInt((_34_ + 4))) + 64))));
                    continue label$19;
                }
            }
            while (false);
            _33_ = this._storeInt(((this._loadInt((_34_ + 60))) + 504), 0);
            this._storeInt((this._loadInt((_34_ + 48))), _33_);
            this._storeInt((this._loadInt((_34_ + 52))), (this._loadInt(_34_)));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 40));
        this._storeInt((0 + 4), (_35_ + 64));
        return _34_;
    }

    @Override()
    public final int sqlite3_extended_errcode(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)) == 0) {
                            break label$3;
                        }
                        if ((sqlite3SafetyCheckSickOrOk((this._loadInt((_31_ + 8))))) == 0) {
                            break label$2;
                        }
                    }
                    while (false);
                    label$4:
                    do {
                        if ((this._loadInt((_31_ + 8))) == 0) {
                            break label$4;
                        }
                        if ((this._loadInt8u(((this._loadInt((_31_ + 8))) + 30))) == 0) {
                            break label$1;
                        }
                    }
                    while (false);
                    this._storeInt((_31_ + 12), 7);
                    break label$0;
                }
                while (false);
                this._storeInt((_31_ + 12), (sqlite3MisuseError(109523)));
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 12), (this._loadInt(((this._loadInt((_31_ + 8))) + 20))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final long sqlite3_soft_heap_limit64(long _30_)
    {
        int _31_ = 0;
        this._storeLong(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 16), _30_);
        sqlite3_initialize();
        this._storeLong((_31_ + 8), (this._loadLong((0 + 20476))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadLong((_31_ + 16))) <= -1L) {
                            break label$3;
                        }
                        if ((this._loadLong((_31_ + 16))) < 1L) {
                            break label$2;
                        }
                        sqlite3MemoryAlarm(23, 0, (this._loadLong((_31_ + 16))));
                        break label$1;
                    }
                    while (false);
                    this._storeLong((_31_ + 24), (this._loadLong((_31_ + 8))));
                    break label$0;
                }
                while (false);
                sqlite3MemoryAlarm(0, 0, 0L);
            }
            while (false);
            label$4:
            do {
                if ((this._storeLong(_31_, ((sqlite3_memory_used()) - (this._loadLong((_31_ + 16)))))) < 1L) {
                    break label$4;
                }
                sqlite3_release_memory(((int) ((this._loadLong(_31_)) & 2147483647L)));
            }
            while (false);
            this._storeLong((_31_ + 24), (this._loadLong((_31_ + 8))));
        }
        while (false);
        _30_ = this._loadLong((_31_ + 24));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final int sqlite3_stmt_status(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 32) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 12), (this._loadInt((((this._storeInt((_33_ + 16), (this._loadInt((_33_ + 28))))) + ((this._loadInt((_33_ + 24))) << 2)) + 120))));
        label$0:
        do {
            if ((this._loadInt((_33_ + 20))) == 0) {
                break label$0;
            }
            this._storeInt((((this._loadInt((_33_ + 16))) + ((this._loadInt((_33_ + 24))) << 2)) + 120), 0);
        }
        while (false);
        return (this._loadInt((_33_ + 12)));
    }

    @Override()
    public final int sqlite3_wal_autocheckpoint(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 8), _31_)) < 1) {
                    break label$1;
                }
                sqlite3_wal_hook((this._loadInt((_32_ + 12))), 24, (this._loadInt((_32_ + 8))));
                break label$0;
            }
            while (false);
            sqlite3_wal_hook((this._loadInt((_32_ + 12))), 0, 0);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return 0;
    }

    @Override()
    public final int sqlite3_wal_checkpoint(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = sqlite3_wal_checkpoint_v2((this._loadInt((_32_ + 12))), _31_, 0, 0, 0);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3_wal_hook(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 12))) + 196))));
        this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 192), (this._loadInt((_33_ + 8))));
        this._storeInt((_32_ + 196), (this._loadInt((_33_ + 4))));
        return (this._loadInt(_33_));
    }

    @Override()
    public final int sqlite3_wal_checkpoint_v2(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_35_ + 36), _31_);
        this._storeInt((_35_ + 32), _32_);
        this._storeInt((_35_ + 28), _33_);
        this._storeInt((_35_ + 24), _34_);
        this._storeInt((_35_ + 16), 10);
        label$0:
        do {
            if ((this._loadInt((_35_ + 28))) == 0) {
                break label$0;
            }
            this._storeInt((this._loadInt((_35_ + 28))), -1);
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_35_ + 24))) == 0) {
                break label$1;
            }
            this._storeInt((this._loadInt((_35_ + 24))), -1);
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                label$4:
                do {
                    if ((this._loadInt((_35_ + 32))) < 0) {
                        break label$4;
                    }
                    if ((this._loadInt((_35_ + 32))) < 3) {
                        break label$3;
                    }
                }
                while (false);
                this._storeInt((_35_ + 44), 21);
                break label$2;
            }
            while (false);
            label$5:
            do {
                if ((this._loadInt((_35_ + 36))) == 0) {
                    break label$5;
                }
                if ((this._loadInt8s((this._loadInt((_35_ + 36))))) == 0) {
                    break label$5;
                }
                this._storeInt((_35_ + 16), (sqlite3FindDbName((this._loadInt((_35_ + 40))), (this._loadInt((_35_ + 36))))));
            }
            while (false);
            label$6:
            do {
                label$7:
                do {
                    if ((this._loadInt((_35_ + 16))) <= -1) {
                        break label$7;
                    }
                    _34_ = this._storeInt((_35_ + 20), (sqlite3Checkpoint((this._loadInt((_35_ + 40))), (this._loadInt((_35_ + 16))), (this._loadInt((_35_ + 32))), (this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 24))))));
                    sqlite3Error((this._loadInt((_35_ + 40))), _34_, 0, 0);
                    break label$6;
                }
                while (false);
                _34_ = this._storeInt((_35_ + 20), 1);
                _33_ = this._loadInt((_35_ + 40));
                this._storeInt(_35_, (this._loadInt((_35_ + 36))));
                sqlite3Error(_33_, _34_, 29104, _35_);
            }
            while (false);
            this._storeInt((_35_ + 44), (this._storeInt((_35_ + 20), (sqlite3ApiExit((this._loadInt((_35_ + 40))), (this._loadInt((_35_ + 20))))))));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 44));
        this._storeInt((0 + 4), (_35_ + 48));
        return _34_;
    }

    @Override()
    public final int sqlite3FindDbName(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        _31_ = this._storeInt((_32_ + 20), -1);
        label$0:
        do {
            if ((this._loadInt((_32_ + 24))) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 12), (sqlite3Strlen30((this._loadInt((_32_ + 24))))));
            _30_ = this._storeInt((_32_ + 20), ((this._loadInt(((this._loadInt((_32_ + 28))) + 4))) + _31_));
            this._storeInt((_32_ + 16), ((this._loadInt(((this._loadInt((_32_ + 28))) + 8))) + (_30_ << 4)));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 20))) < 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._loadInt((_32_ + 12))) != (sqlite3Strlen30((this._loadInt((this._loadInt((_32_ + 16)))))))) {
                            break label$3;
                        }
                        if ((sqlite3StrICmp((this._loadInt((this._loadInt((_32_ + 16))))), (this._loadInt((_32_ + 24))))) == 0) {
                            break label$2;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + _31_));
                    this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + -16));
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
    public final int sqlite3Checkpoint(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        _33_ = this._storeInt((_35_ + 4), (this._storeInt(_35_, (this._storeInt((_35_ + 8), 0)))));
        label$1:
        do {
            label$0:
            while (true) {
                _34_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_35_ + 4))) >= (this._loadInt(((this._loadInt((_35_ + 28))) + 4)))) {
                        break label$2;
                    }
                    _34_ = ((this._loadInt((_35_ + 8))) == 0) ? 1 : 0;
                }
                while (false);
                if (_34_ == 0) {
                    break label$1;
                }
                label$3:
                do {
                    label$4:
                    do {
                        if ((this._loadInt((_35_ + 4))) == (this._loadInt((_35_ + 24)))) {
                            break label$4;
                        }
                        if ((this._loadInt((_35_ + 24))) != 10) {
                            break label$3;
                        }
                    }
                    while (false);
                    this._storeInt((_35_ + 8), (sqlite3BtreeCheckpoint((this._loadInt((((this._loadInt(((this._loadInt((_35_ + 28))) + 8))) + ((this._loadInt((_35_ + 4))) << 4)) + 4))), (this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 16))), (this._loadInt((_35_ + 12))))));
                    _34_ = this._storeInt((_35_ + 12), (this._storeInt((_35_ + 16), _33_)));
                    if ((this._loadInt((_35_ + 8))) != 5) {
                        break label$3;
                    }
                    this._storeInt(_35_, 1);
                    this._storeInt((_35_ + 8), _34_);
                }
                while (false);
                this._storeInt((_35_ + 4), ((this._loadInt((_35_ + 4))) + 1));
                continue label$0;
            }
        }
        while (false);
        label$5:
        do {
            label$6:
            do {
                if ((this._loadInt((_35_ + 8))) != 0) {
                    break label$6;
                }
                _34_ = 5;
                if ((this._loadInt(_35_)) != 0) {
                    break label$5;
                }
            }
            while (false);
            _34_ = this._loadInt((_35_ + 8));
        }
        while (false);
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3BtreeCheckpoint(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        this._storeInt((_34_ + 12), 0);
        label$0:
        do {
            if ((this._loadInt((_34_ + 28))) == 0) {
                break label$0;
            }
            this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((_34_ + 28))) + 4))));
            sqlite3BtreeEnter((this._loadInt((_34_ + 28))));
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_34_ + 8))) + 23))) == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 12), 6);
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 12), (sqlite3PagerCheckpoint((this._loadInt((this._loadInt((_34_ + 8))))), (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 16))))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 12));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final void sqlite3BtreeEnter(int _30_)
    {
        this._storeInt(((this._loadInt(((_30_ = this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 4))) + 4), (this._loadInt(_30_)));
        return;
    }

    @Override()
    public final int sqlite3PagerCheckpoint(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        this._storeInt((_34_ + 12), 0);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_34_ + 28))) + 172))) == 0) {
                break label$0;
            }
            this._storeInt((_34_ + 12), (sqlite3WalCheckpoint((this._loadInt(((_33_ = this._loadInt((_34_ + 28))) + 172))), (this._loadInt((_34_ + 24))), (this._loadInt((_33_ + 152))), (this._loadInt((_33_ + 156))), (this._loadInt8u((_33_ + 10))), (this._loadInt((_33_ + 128))), (this._loadInt((_33_ + 164))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 16))))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 12));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final int sqlite3WalCheckpoint(
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
        this._storeInt(((_39_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_39_ + 52), _31_);
        this._storeInt((_39_ + 48), _32_);
        this._storeInt((_39_ + 44), _33_);
        this._storeInt((_39_ + 40), _34_);
        this._storeInt((_39_ + 36), _35_);
        this._storeInt((_39_ + 32), _36_);
        this._storeInt((_39_ + 28), _37_);
        this._storeInt((_39_ + 24), _38_);
        this._storeInt((_39_ + 16), 0);
        this._storeInt((_39_ + 12), (this._loadInt((_39_ + 52))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_39_ + 56))) + 41))) == 0) {
                    break label$1;
                }
                this._storeInt((_39_ + 60), 8);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._storeInt((_39_ + 20), (walLockExclusive((this._loadInt((_39_ + 56))), 1, 1)))) == 0) {
                    break label$2;
                }
                this._storeInt((_39_ + 60), (this._loadInt((_39_ + 20))));
                break label$0;
            }
            while (false);
            this._storeInt8(((this._loadInt((_39_ + 56))) + 40), 1);
            label$3:
            do {
                if ((this._loadInt((_39_ + 52))) == 0) {
                    break label$3;
                }
                label$4:
                do {
                    if ((this._storeInt((_39_ + 20), (walBusyLock((this._loadInt((_39_ + 56))), (this._loadInt((_39_ + 48))), (this._loadInt((_39_ + 44))), 0, 1)))) == 0) {
                        break label$4;
                    }
                    if ((this._loadInt((_39_ + 20))) != 5) {
                        break label$3;
                    }
                    this._storeInt((_39_ + 20), (this._storeInt((_39_ + 12), 0)));
                    break label$3;
                }
                while (false);
                this._storeInt8(((this._loadInt((_39_ + 56))) + 39), 1);
            }
            while (false);
            label$5:
            do {
                if ((this._loadInt((_39_ + 20))) != 0) {
                    break label$5;
                }
                this._storeInt((_39_ + 20), (walIndexReadHdr((this._loadInt((_39_ + 56))), (_39_ + 16))));
            }
            while (false);
            label$6:
            do {
                if ((this._loadInt((_39_ + 20))) != 0) {
                    break label$6;
                }
                label$7:
                do {
                    label$8:
                    do {
                        if ((this._loadInt(((this._loadInt((_39_ + 56))) + 60))) == 0) {
                            break label$8;
                        }
                        if ((walPagesize((this._loadInt((_39_ + 56))))) == (this._loadInt((_39_ + 36)))) {
                            break label$8;
                        }
                        this._storeInt((_39_ + 20), (sqlite3CorruptError(46459)));
                        break label$7;
                    }
                    while (false);
                    this._storeInt((_39_ + 20), (walCheckpoint((this._loadInt((_39_ + 56))), (this._loadInt((_39_ + 12))), (this._loadInt((_39_ + 48))), (this._loadInt((_39_ + 44))), (this._loadInt((_39_ + 40))), (this._loadInt((_39_ + 32))))));
                }
                while (false);
                label$9:
                do {
                    if ((this._loadInt((_39_ + 20))) == 0) {
                        break label$9;
                    }
                    if ((this._loadInt((_39_ + 20))) != 5) {
                        break label$6;
                    }
                }
                while (false);
                label$10:
                do {
                    if ((this._loadInt((_39_ + 28))) == 0) {
                        break label$10;
                    }
                    this._storeInt((this._loadInt((_39_ + 28))), (this._loadInt(((this._loadInt((_39_ + 56))) + 60))));
                }
                while (false);
                if ((this._loadInt((_39_ + 24))) == 0) {
                    break label$6;
                }
                _38_ = this._loadInt((walCkptInfo((this._loadInt((_39_ + 56))))));
                this._storeInt((this._loadInt((_39_ + 24))), _38_);
            }
            while (false);
            label$11:
            do {
                if ((this._loadInt((_39_ + 16))) == 0) {
                    break label$11;
                }
                memset(((this._loadInt((_39_ + 56))) + 44), 0, 48);
            }
            while (false);
            sqlite3WalEndWriteTransaction((this._loadInt((_39_ + 56))));
            walUnlockExclusive((this._loadInt((_39_ + 56))), 1, 1);
            this._storeInt8(((this._loadInt((_39_ + 56))) + 40), 0);
            label$12:
            do {
                label$13:
                do {
                    if ((this._loadInt((_39_ + 20))) != 0) {
                        break label$13;
                    }
                    _38_ = 5;
                    if ((this._loadInt((_39_ + 52))) != (this._loadInt((_39_ + 12)))) {
                        break label$12;
                    }
                }
                while (false);
                _38_ = this._loadInt((_39_ + 20));
            }
            while (false);
            this._storeInt((_39_ + 60), _38_);
        }
        while (false);
        _38_ = this._loadInt((_39_ + 60));
        this._storeInt((0 + 4), (_39_ + 64));
        return _38_;
    }

    @Override()
    public final int walLockExclusive(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 24))) + 38))) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 28), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 28), (this._storeInt((_33_ + 12), (sqlite3OsShmLock((this._loadInt(((this._loadInt((_33_ + 24))) + 4))), (this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))), 10)))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int walBusyLock(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        label$0$end:
        do {
            label$0:
            while (true) {
                this._storeInt((_35_ + 8), (walLockExclusive((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 16))), (this._loadInt((_35_ + 12))))));
                _34_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_35_ + 24))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt((_35_ + 8))) != 5) {
                        break label$2;
                    }
                    _34_ = ((this._iiTable[this._tableIndices[this._loadInt((_35_ + 24))]].invoke((this._loadInt((_35_ + 20))))) != 0) ? 1 : 0;
                }
                while (false);
                if (_34_ != 0) {
                    continue label$0;
                }
                break label$0$end;
            }
        }
        while (false);
        _34_ = this._loadInt((_35_ + 8));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int walIndexReadHdr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 16), (walIndexPage((this._loadInt((_32_ + 24))), 0, (_32_ + 8))))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
                break label$0;
            }
            while (false);
            _31_ = 1;
            label$2:
            do {
                if ((this._loadInt((_32_ + 8))) == 0) {
                    break label$2;
                }
                _31_ = walIndexTryHdr((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 20))));
            }
            while (false);
            label$3:
            do {
                if ((this._storeInt((_32_ + 12), _31_)) == 0) {
                    break label$3;
                }
                label$4:
                do {
                    if (((this._loadInt8u(((this._loadInt((_32_ + 24))) + 41))) & 2) == 0) {
                        break label$4;
                    }
                    if ((this._storeInt((_32_ + 16), (walLockShared((this._loadInt((_32_ + 24))), 0)))) != 0) {
                        break label$3;
                    }
                    walUnlockShared((this._loadInt((_32_ + 24))), 0);
                    this._storeInt((_32_ + 16), 264);
                    break label$3;
                }
                while (false);
                if ((this._storeInt((_32_ + 16), (walLockExclusive((this._loadInt((_32_ + 24))), 0, 1)))) != 0) {
                    break label$3;
                }
                this._storeInt8(((_31_ = this._loadInt((_32_ + 24))) + 39), 1);
                label$5:
                do {
                    if ((this._storeInt((_32_ + 16), (walIndexPage(_31_, 0, (_32_ + 8))))) != 0) {
                        break label$5;
                    }
                    if ((this._storeInt((_32_ + 12), (walIndexTryHdr((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 20))))))) == 0) {
                        break label$5;
                    }
                    this._storeInt((_32_ + 16), (walIndexRecover((this._loadInt((_32_ + 24))))));
                    this._storeInt((this._loadInt((_32_ + 20))), 1);
                }
                while (false);
                walUnlockExclusive((_31_ = this._loadInt((_32_ + 24))), (this._storeInt8((_31_ + 39), 0)), 1);
            }
            while (false);
            label$6:
            do {
                if ((this._loadInt((_32_ + 12))) != 0) {
                    break label$6;
                }
                if ((this._loadInt(((this._loadInt((_32_ + 24))) + 44))) == 3007000) {
                    break label$6;
                }
                this._storeInt((_32_ + 16), (sqlite3CantopenError(45583)));
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
    public final int walPagesize(int _30_)
    {
        return (((_30_ = this._loadInt16u(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 58))) & 65024) | ((_30_ & 1) << 16));
    }

    @Override()
    public final int sqlite3CorruptError(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        _32_ = sqlite3_sourceid();
        this._storeInt(_31_, _30_);
        this._storeInt((_31_ + 4), (_32_ + 20));
        sqlite3_log(11, 29136, _31_);
        this._storeInt((0 + 4), (_31_ + 16));
        return 11;
    }

    @Override()
    public final int walCheckpoint(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_)
    {
        long _36_ = 0L;
        int _37_ = 0;
        this._storeInt(((_37_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 112))) + 104), _30_);
        this._storeInt((_37_ + 100), _31_);
        this._storeInt((_37_ + 96), _32_);
        this._storeInt((_37_ + 92), _33_);
        this._storeInt((_37_ + 88), _34_);
        this._storeInt((_37_ + 84), _35_);
        _35_ = this._storeInt((_37_ + 44), (this._storeInt((_37_ + 64), (this._storeInt((_37_ + 68), (this._storeInt((_37_ + 72), 0)))))));
        this._storeInt((_37_ + 76), (walPagesize((this._loadInt((_37_ + 104))))));
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt((this._storeInt((_37_ + 48), (walCkptInfo((this._loadInt((_37_ + 104))))))))) & 4294967295L) < ((this._loadInt(((this._loadInt((_37_ + 104))) + 60))) & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((_37_ + 108), _35_);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._storeInt((_37_ + 80), (walIteratorInit((this._loadInt((_37_ + 104))), (_37_ + 72))))) == 0) {
                    break label$2;
                }
                this._storeInt((_37_ + 108), (this._loadInt((_37_ + 80))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((_37_ + 100))) == 0) {
                    break label$3;
                }
                this._storeInt((_37_ + 44), (this._loadInt((_37_ + 96))));
            }
            while (false);
            this._storeInt((_37_ + 60), (this._loadInt(((this._loadInt((_37_ + 104))) + 60))));
            this._storeInt((_37_ + 56), (this._loadInt(((this._loadInt((_37_ + 104))) + 64))));
            _34_ = this._storeInt((_37_ + 52), 1);
            label$4:
            do {
                label$6:
                do {
                    label$5:
                    while (true) {
                        if ((this._loadInt((_37_ + 52))) > 4) {
                            break label$6;
                        }
                        _35_ = this._storeInt((_37_ + 40), (this._loadInt((((this._loadInt((_37_ + 48))) + ((this._loadInt((_37_ + 52))) << 2)) + 4))));
                        label$7:
                        do {
                            if (((this._loadInt((_37_ + 60))) & 4294967295L) <= (_35_ & 4294967295L)) {
                                break label$7;
                            }
                            label$8:
                            do {
                                if ((this._storeInt((_37_ + 80), (walBusyLock((this._loadInt((_37_ + 104))), (this._loadInt((_37_ + 44))), (this._loadInt((_37_ + 92))), ((this._loadInt((_37_ + 52))) + 3), _34_)))) == 0) {
                                    break label$8;
                                }
                                if ((this._loadInt((_37_ + 80))) != 5) {
                                    break label$4;
                                }
                                this._storeInt((_37_ + 60), (this._loadInt((_37_ + 40))));
                                this._storeInt((_37_ + 44), 0);
                                break label$7;
                            }
                            while (false);
                            this._storeInt((((this._loadInt((_37_ + 48))) + ((_35_ = this._loadInt((_37_ + 52))) << 2)) + 4), -1);
                            walUnlockExclusive((this._loadInt((_37_ + 104))), (_35_ + 3), _34_);
                        }
                        while (false);
                        this._storeInt((_37_ + 52), ((this._loadInt((_37_ + 52))) + _34_));
                        continue label$5;
                    }
                }
                while (false);
                label$9:
                do {
                    if (((this._loadInt((this._loadInt((_37_ + 48))))) & 4294967295L) >= ((this._loadInt((_37_ + 60))) & 4294967295L)) {
                        break label$9;
                    }
                    if ((this._storeInt((_37_ + 80), (walBusyLock((this._loadInt((_37_ + 104))), (this._loadInt((_37_ + 44))), (this._loadInt((_37_ + 92))), 3, 1)))) != 0) {
                        break label$9;
                    }
                    this._storeInt((_37_ + 28), (this._loadInt((this._loadInt((_37_ + 48))))));
                    label$10:
                    do {
                        if ((this._loadInt((_37_ + 88))) == 0) {
                            break label$10;
                        }
                        this._storeInt((_37_ + 80), (sqlite3OsSync((this._loadInt(((this._loadInt((_37_ + 104))) + 8))), (this._loadInt((_37_ + 88))))));
                    }
                    while (false);
                    label$11:
                    do {
                        if ((this._loadInt((_37_ + 80))) != 0) {
                            break label$11;
                        }
                        this._storeLong((_37_ + 16), ((this._loadLong32u((_37_ + 56))) * (this._loadLong32s((_37_ + 76)))));
                        if ((this._storeInt((_37_ + 80), (sqlite3OsFileSize((this._loadInt(((this._loadInt((_37_ + 104))) + 4))), (_37_ + 32))))) != 0) {
                            break label$11;
                        }
                        if ((this._loadLong((_37_ + 32))) >= (this._loadLong((_37_ + 16)))) {
                            break label$11;
                        }
                        sqlite3OsFileControl((this._loadInt(((this._loadInt((_37_ + 104))) + 4))), 5, (_37_ + 16));
                    }
                    while (false);
                    label$13:
                    do {
                        label$12$end:
                        do {
                            label$12:
                            while (true) {
                                _35_ = 0;
                                label$14:
                                do {
                                    if ((this._loadInt((_37_ + 80))) != 0) {
                                        break label$14;
                                    }
                                    _35_ = ((walIteratorNext((this._loadInt((_37_ + 72))), (_37_ + 68), (_37_ + 64))) == 0) ? 1 : 0;
                                }
                                while (false);
                                if (_35_ == 0) {
                                    break label$13;
                                }
                                if (((this._loadInt((_37_ + 64))) & 4294967295L) <= ((this._loadInt((_37_ + 28))) & 4294967295L)) {
                                    continue label$12;
                                }
                                if (((this._loadInt((_37_ + 64))) & 4294967295L) > ((this._loadInt((_37_ + 60))) & 4294967295L)) {
                                    continue label$12;
                                }
                                if (((this._loadInt((_37_ + 68))) & 4294967295L) > ((this._loadInt((_37_ + 56))) & 4294967295L)) {
                                    continue label$12;
                                }
                                _36_ = this._storeLong((_37_ + 8), (((((this._loadInt((_37_ + 64))) + -1) & 4294967295L) * ((long) ((this._loadInt((_37_ + 76))) + 24))) + 56L));
                                if ((this._storeInt((_37_ + 80), (sqlite3OsRead((this._loadInt(((this._loadInt((_37_ + 104))) + 8))), (this._loadInt((_37_ + 84))), (this._loadInt((_37_ + 76))), _36_)))) != 0) {
                                    break label$13;
                                }
                                _36_ = this._storeLong((_37_ + 8), ((((this._loadInt((_37_ + 68))) + -1) & 4294967295L) * (this._loadLong32s((_37_ + 76)))));
                                if ((this._storeInt((_37_ + 80), (sqlite3OsWrite((this._loadInt(((this._loadInt((_37_ + 104))) + 4))), (this._loadInt((_37_ + 84))), (this._loadInt((_37_ + 76))), _36_)))) == 0) {
                                    continue label$12;
                                }
                                break label$12$end;
                            }
                        }
                        while (false);
                    }
                    while (false);
                    label$15:
                    do {
                        if ((this._loadInt((_37_ + 80))) != 0) {
                            break label$15;
                        }
                        label$16:
                        do {
                            if ((this._loadInt((_37_ + 60))) != (this._loadInt(((walIndexHdr((this._loadInt((_37_ + 104))))) + 16)))) {
                                break label$16;
                            }
                            _36_ = this._storeLong(_37_, ((this._loadLong32u(((this._loadInt((_37_ + 104))) + 64))) * (this._loadLong32s((_37_ + 76)))));
                            if ((this._storeInt((_37_ + 80), (sqlite3OsTruncate((this._loadInt(((this._loadInt((_37_ + 104))) + 4))), _36_)))) != 0) {
                                break label$16;
                            }
                            if ((this._loadInt((_37_ + 88))) == 0) {
                                break label$16;
                            }
                            this._storeInt((_37_ + 80), (sqlite3OsSync((this._loadInt(((this._loadInt((_37_ + 104))) + 4))), (this._loadInt((_37_ + 88))))));
                        }
                        while (false);
                        if ((this._loadInt((_37_ + 80))) != 0) {
                            break label$15;
                        }
                        this._storeInt((this._loadInt((_37_ + 48))), (this._loadInt((_37_ + 60))));
                    }
                    while (false);
                    walUnlockExclusive((this._loadInt((_37_ + 104))), 3, 1);
                }
                while (false);
                label$17:
                do {
                    if ((this._loadInt((_37_ + 80))) != 5) {
                        break label$17;
                    }
                    this._storeInt((_37_ + 80), 0);
                }
                while (false);
                if ((this._loadInt((_37_ + 80))) != 0) {
                    break label$4;
                }
                if ((this._loadInt((_37_ + 100))) == 0) {
                    break label$4;
                }
                label$18:
                do {
                    if (((this._loadInt((this._loadInt((_37_ + 48))))) & 4294967295L) >= ((this._loadInt(((this._loadInt((_37_ + 104))) + 60))) & 4294967295L)) {
                        break label$18;
                    }
                    this._storeInt((_37_ + 80), 5);
                    break label$4;
                }
                while (false);
                if ((this._loadInt((_37_ + 100))) != 2) {
                    break label$4;
                }
                if ((this._storeInt((_37_ + 80), (walBusyLock((this._loadInt((_37_ + 104))), (this._loadInt((_37_ + 44))), (this._loadInt((_37_ + 92))), 4, 4)))) != 0) {
                    break label$4;
                }
                walUnlockExclusive((this._loadInt((_37_ + 104))), 4, 4);
            }
            while (false);
            walIteratorFree((this._loadInt((_37_ + 72))));
            this._storeInt((_37_ + 108), (this._loadInt((_37_ + 80))));
        }
        while (false);
        _35_ = this._loadInt((_37_ + 108));
        this._storeInt((0 + 4), (_37_ + 112));
        return _35_;
    }

    @Override()
    public final int walCkptInfo(int _30_)
    {
        return ((this._loadInt((this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 28))))) + 96);
    }

    @Override()
    public final int sqlite3WalEndWriteTransaction(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 39))) == 0) {
                break label$0;
            }
            walUnlockExclusive((this._loadInt((_31_ + 12))), 0, 1);
            this._storeInt8(((this._loadInt((_31_ + 12))) + 39), 0);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return 0;
    }

    @Override()
    public final void walUnlockExclusive(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_33_ + 12))) + 38))) != 0) {
                break label$0;
            }
            sqlite3OsShmLock((this._loadInt(((this._loadInt((_33_ + 12))) + 4))), (this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 4))), 9);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int sqlite3OsShmLock(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        _33_ = this._iiiiiTable[this._tableIndices[this._loadInt(((this._loadInt((_32_ = this._loadInt((_34_ + 12))))) + 56))]].invoke(_32_, (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))), _33_);
        this._storeInt((0 + 4), (_34_ + 16));
        return _33_;
    }

    @Override()
    public final int walIteratorInit(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_32_ + 52), _31_);
        _31_ = this._storeInt((_32_ + 24), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 48), (sqlite3ScratchMalloc((this._storeInt((_32_ + 36), ((((this._storeInt((_32_ + 44), ((walFramePage((this._storeInt((_32_ + 40), (this._loadInt(((this._loadInt((_32_ + 56))) + 60))))))) + 1))) * 20) + ((this._loadInt((_32_ + 40))) << 1)) + 8))))))) == 0) {
                    break label$1;
                }
                memset((this._loadInt((_32_ + 48))), _31_, (this._loadInt((_32_ + 36))));
                this._storeInt(((this._loadInt((_32_ + 48))) + 4), (this._loadInt((_32_ + 44))));
                _31_ = 4096;
                label$2:
                do {
                    if (((this._loadInt((_32_ + 40))) & 4294967295L) > (4096 & 4294967295L)) {
                        break label$2;
                    }
                    _31_ = this._loadInt((_32_ + 40));
                }
                while (false);
                label$3:
                do {
                    if ((this._storeInt((_32_ + 28), (sqlite3ScratchMalloc((_31_ << 1))))) != 0) {
                        break label$3;
                    }
                    this._storeInt((_32_ + 24), 7);
                }
                while (false);
                _30_ = this._storeInt((_32_ + 32), 0);
                label$5:
                do {
                    label$4:
                    while (true) {
                        _31_ = 0;
                        label$6:
                        do {
                            if ((this._loadInt((_32_ + 24))) != 0) {
                                break label$6;
                            }
                            _31_ = ((this._loadInt((_32_ + 32))) < (this._loadInt((_32_ + 44)))) ? 1 : 0;
                        }
                        while (false);
                        if (_31_ == 0) {
                            break label$5;
                        }
                        label$7:
                        do {
                            if ((this._storeInt((_32_ + 24), (walHashGet((this._loadInt((_32_ + 56))), (this._loadInt((_32_ + 32))), (_32_ + 20), (_32_ + 12), (_32_ + 16))))) != 0) {
                                break label$7;
                            }
                            this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 4));
                            label$8:
                            do {
                                label$9:
                                do {
                                    if (((this._loadInt((_32_ + 32))) + 1) != (this._loadInt((_32_ + 44)))) {
                                        break label$9;
                                    }
                                    this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 40))) - (this._loadInt((_32_ + 16)))));
                                    break label$8;
                                }
                                while (false);
                                this._storeInt((_32_ + 4), (((this._loadInt((_32_ + 20))) - (this._loadInt((_32_ + 12)))) / 4));
                            }
                            while (false);
                            this._storeInt(_32_, ((((_31_ = this._loadInt((_32_ + 48))) + ((this._loadInt((_31_ + 4))) * 20)) + ((this._loadInt((_32_ + 16))) << 1)) + 8));
                            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                            this._storeInt((_32_ + 8), _30_);
                            label$11:
                            do {
                                label$10:
                                while (true) {
                                    if ((this._loadInt((_32_ + 8))) >= (this._loadInt((_32_ + 4)))) {
                                        break label$11;
                                    }
                                    this._storeInt((_32_ + 8), ((this._storeInt16(((this._loadInt(_32_)) + ((_31_ = this._loadInt((_32_ + 8))) << 1)), _31_)) + 1));
                                    continue label$10;
                                }
                            }
                            while (false);
                            walMergesort((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 28))), (this._loadInt(_32_)), (_32_ + 4));
                            this._storeInt(((_31_ = (this._loadInt((_32_ + 48))) + ((this._loadInt((_32_ + 32))) * 20)) + 20), (this._loadInt((_32_ + 4))));
                            this._storeInt((_31_ + 24), (this._loadInt((_32_ + 16))));
                            this._storeInt((((this._loadInt((_32_ + 48))) + ((this._loadInt((_32_ + 32))) * 20)) + 12), (this._loadInt(_32_)));
                            this._storeInt((((this._loadInt((_32_ + 48))) + ((this._loadInt((_32_ + 32))) * 20)) + 16), (this._loadInt((_32_ + 12))));
                        }
                        while (false);
                        this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) + 1));
                        continue label$4;
                    }
                }
                while (false);
                sqlite3ScratchFree((this._loadInt((_32_ + 28))));
                label$12:
                do {
                    if ((this._loadInt((_32_ + 24))) == 0) {
                        break label$12;
                    }
                    walIteratorFree((this._loadInt((_32_ + 48))));
                }
                while (false);
                this._storeInt((this._loadInt((_32_ + 52))), (this._loadInt((_32_ + 48))));
                this._storeInt((_32_ + 60), (this._loadInt((_32_ + 24))));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 60), 7);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 60));
        this._storeInt((0 + 4), (_32_ + 64));
        return _31_;
    }

    @Override()
    public final int sqlite3OsSync(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this._iiiTable[this._tableIndices[this._loadInt(((this._loadInt((_30_ = this._loadInt((_32_ + 12))))) + 20))]].invoke(_30_, _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3OsFileSize(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this._iiiTable[this._tableIndices[this._loadInt(((this._loadInt((_30_ = this._loadInt((_32_ + 12))))) + 24))]].invoke(_30_, _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3OsFileControl(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = this._iiiiTable[this._tableIndices[this._loadInt(((this._loadInt((_31_ = this._loadInt((_33_ + 12))))) + 40))]].invoke(_31_, (this._loadInt((_33_ + 8))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int walIteratorNext(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 32) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        _31_ = this._storeInt((_33_ + 12), -1);
        this._storeInt((_33_ + 16), (this._loadInt((this._loadInt((_33_ + 28))))));
        this._storeInt((_33_ + 8), (_31_ + (this._loadInt(((this._loadInt((_33_ + 28))) + 4)))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_33_ + 8))) < 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 4), (((this._loadInt((_33_ + 28))) + ((this._loadInt((_33_ + 8))) * 20)) + 8));
                label$2:
                do {
                    label$4:
                    do {
                        label$3:
                        while (true) {
                            if ((this._loadInt((_32_ = this._loadInt((_33_ + 4))))) >= (this._loadInt((_32_ + 12)))) {
                                break label$2;
                            }
                            if (((this._storeInt(_33_, (this._loadInt(((this._loadInt(((_32_ = this._loadInt((_33_ + 4))) + 8))) + ((this._loadInt16u(((this._loadInt((_32_ + 4))) + ((this._loadInt(_32_)) << 1)))) << 2)))))) & 4294967295L) > ((this._loadInt((_33_ + 16))) & 4294967295L)) {
                                break label$4;
                            }
                            this._storeInt((_32_ = this._loadInt((_33_ + 4))), ((this._loadInt(_32_)) + 1));
                            continue label$3;
                        }
                    }
                    while (false);
                    if (((this._loadInt(_33_)) & 4294967295L) >= ((this._loadInt((_33_ + 12))) & 4294967295L)) {
                        break label$2;
                    }
                    this._storeInt((_33_ + 12), (this._loadInt(_33_)));
                    this._storeInt((this._loadInt((_33_ + 20))), ((this._loadInt(((_32_ = this._loadInt((_33_ + 4))) + 16))) + (this._loadInt16u(((this._loadInt((_32_ + 4))) + ((this._loadInt(_32_)) << 1))))));
                }
                while (false);
                this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) + _31_));
                continue label$0;
            }
        }
        while (false);
        _32_ = this._storeInt((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 12))));
        return (((this._storeInt((this._loadInt((_33_ + 24))), _32_)) == -1) ? 1 : 0);
    }

    @Override()
    public final int sqlite3OsRead(int _30_, int _31_, int _32_, long _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeLong((_34_ + 8), _33_);
        _32_ = this._iiiilTable[this._tableIndices[this._loadInt(((this._loadInt((_32_ = this._loadInt((_34_ + 28))))) + 8))]].invoke(_32_, (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))), _33_);
        this._storeInt((0 + 4), (_34_ + 32));
        return _32_;
    }

    @Override()
    public final int sqlite3OsWrite(int _30_, int _31_, int _32_, long _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeLong((_34_ + 8), _33_);
        _32_ = this._iiiilTable[this._tableIndices[this._loadInt(((this._loadInt((_32_ = this._loadInt((_34_ + 28))))) + 12))]].invoke(_32_, (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))), _33_);
        this._storeInt((0 + 4), (_34_ + 32));
        return _32_;
    }

    @Override()
    public final int walIndexHdr(int _30_)
    {
        return (this._loadInt((this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 28)))));
    }

    @Override()
    public final int sqlite3OsTruncate(int _30_, long _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeLong(_32_, _31_);
        _30_ = this._iilTable[this._tableIndices[this._loadInt(((this._loadInt((_30_ = this._loadInt((_32_ + 12))))) + 16))]].invoke(_30_, _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _30_;
    }

    @Override()
    public final void walIteratorFree(int _30_)
    {
        int _31_ = 0;
        sqlite3ScratchFree((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3ScratchFree(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) == 0) {
                break label$0;
            }
            label$1:
            do {
                if (((this._loadInt((_31_ + 12))) & 4294967295L) < ((this._loadInt((0 + 20396))) & 4294967295L)) {
                    break label$1;
                }
                if (((this._loadInt((_31_ + 12))) & 4294967295L) >= ((this._loadInt((0 + 20492))) & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((_30_ = this._loadInt((_31_ + 12))), (this._loadInt((0 + 20496))));
                this._storeInt((0 + 20496), (this._storeInt((_31_ + 8), _30_)));
                this._storeInt((0 + 20500), ((this._loadInt((0 + 20500))) + 1));
                sqlite3StatusAdd(3, -1);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt((0 + 20240))) == 0) {
                    break label$2;
                }
                sqlite3StatusAdd(4, (0 - (this._storeInt((_31_ + 4), (sqlite3MallocSize((this._loadInt((_31_ + 12)))))))));
                sqlite3StatusAdd(0, (0 - (this._loadInt((_31_ + 4)))));
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
    public final int walFramePage(int _30_)
    {
        int _31_ = 0;
        return (this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (((this._storeInt((_31_ + 12), _30_)) + 33) >>> 12)));
    }

    @Override()
    public final int sqlite3ScratchMalloc(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((0 + 20500))) == 0) {
                    break label$1;
                }
                if ((this._loadInt((0 + 20400))) < (this._loadInt((_31_ + 12)))) {
                    break label$1;
                }
                this._storeInt((0 + 20496), (this._loadInt((this._storeInt((_31_ + 8), (this._loadInt((0 + 20496))))))));
                this._storeInt((0 + 20500), ((this._loadInt((0 + 20500))) + -1));
                sqlite3StatusAdd(3, 1);
                sqlite3StatusSet(8, (this._loadInt((_31_ + 12))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt((0 + 20240))) == 0) {
                    break label$2;
                }
                sqlite3StatusSet(8, (this._loadInt((_31_ + 12))));
                this._storeInt((_31_ + 12), (mallocWithAlarm((this._loadInt((_31_ + 12))), (_31_ + 8))));
                if ((this._loadInt((_31_ + 8))) == 0) {
                    break label$0;
                }
                sqlite3StatusAdd(4, (this._loadInt((_31_ + 12))));
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
    public final int walHashGet(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_35_ + 40), _31_);
        this._storeInt((_35_ + 36), _32_);
        this._storeInt((_35_ + 32), _33_);
        this._storeInt((_35_ + 28), _34_);
        label$0:
        do {
            if ((this._storeInt((_35_ + 24), (walIndexPage((this._loadInt((_35_ + 44))), (this._loadInt((_35_ + 40))), (_35_ + 20))))) != 0) {
                break label$0;
            }
            this._storeInt((_35_ + 12), ((this._loadInt((_35_ + 20))) + 16384));
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_35_ + 40))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_35_ + 16), ((((this._loadInt((_35_ + 40))) << 12) + -4096) | 4062));
                    break label$1;
                }
                while (false);
                this._storeInt((_35_ + 20), ((this._loadInt((_35_ + 20))) + 136));
                this._storeInt((_35_ + 16), 0);
            }
            while (false);
            this._storeInt((this._loadInt((_35_ + 32))), ((this._loadInt((_35_ + 20))) + -4));
            this._storeInt((this._loadInt((_35_ + 36))), (this._loadInt((_35_ + 12))));
            this._storeInt((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 16))));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 24));
        this._storeInt((0 + 4), (_35_ + 48));
        return _34_;
    }

    @Override()
    public final void walMergesort(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 160))) + 156), _30_);
        this._storeInt((_34_ + 152), _31_);
        this._storeInt((_34_ + 148), _32_);
        this._storeInt((_34_ + 140), (this._loadInt((this._storeInt((_34_ + 144), _33_)))));
        memset((_34_ + 16), (_33_ = this._storeInt((_34_ + 124), (this._storeInt((_34_ + 132), (this._storeInt((_34_ + 136), 0)))))), 104);
        _31_ = this._storeInt((_34_ + 128), _33_);
        label$0:
        while (true) {
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt((_34_ + 128))) >= (this._loadInt((_34_ + 140)))) {
                        break label$3;
                    }
                    _32_ = this._storeInt((_34_ + 136), 1);
                    this._storeInt((_34_ + 132), ((this._loadInt((_34_ + 148))) + ((this._loadInt((_34_ + 128))) << _32_)));
                    this._storeInt((_34_ + 124), _31_);
                    label$4:
                    while (true) {
                        if (((this._loadInt((_34_ + 128))) & (_32_ << (this._loadInt((_34_ + 124))))) == 0) {
                            break label$2;
                        }
                        _33_ = this._storeInt((_34_ + 12), ((_34_ + 16) + ((this._loadInt((_34_ + 124))) << 3)));
                        walMerge((this._loadInt((_34_ + 156))), (this._loadInt((_33_ + 4))), (this._loadInt(_33_)), (_34_ + 132), (_34_ + 136), (this._loadInt((_34_ + 152))));
                        this._storeInt((_34_ + 124), ((this._loadInt((_34_ + 124))) + _32_));
                        continue label$4;
                    }
                }
                while (false);
                this._storeInt((_34_ + 124), ((this._loadInt((_34_ + 124))) + 1));
                label$7:
                do {
                    label$6:
                    while (true) {
                        if ((this._loadInt((_34_ + 124))) > 12) {
                            break label$7;
                        }
                        label$8:
                        do {
                            if (((this._loadInt((_34_ + 140))) & (1 << (this._loadInt((_34_ + 124))))) == 0) {
                                break label$8;
                            }
                            _33_ = this._storeInt((_34_ + 8), ((_34_ + 16) + ((this._loadInt((_34_ + 124))) << 3)));
                            walMerge((this._loadInt((_34_ + 156))), (this._loadInt((_33_ + 4))), (this._loadInt(_33_)), (_34_ + 132), (_34_ + 136), (this._loadInt((_34_ + 152))));
                        }
                        while (false);
                        this._storeInt((_34_ + 124), ((this._loadInt((_34_ + 124))) + 1));
                        continue label$6;
                    }
                }
                while (false);
                this._storeInt((this._loadInt((_34_ + 144))), (this._loadInt((_34_ + 136))));
                this._storeInt((0 + 4), (_34_ + 160));
                return;
            }
            while (false);
            this._storeInt(((_33_ = (_34_ + 16) + ((this._loadInt((_34_ + 124))) << 3)) + 4), (this._loadInt((_34_ + 132))));
            this._storeInt(_33_, (this._loadInt((_34_ + 136))));
            this._storeInt((_34_ + 128), ((this._loadInt((_34_ + 128))) + _32_));
            continue label$0;
        }
    }

    @Override()
    public final void walMerge(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_)
    {
        int _36_ = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_36_ + 56), _31_);
        this._storeInt((_36_ + 52), _32_);
        this._storeInt((_36_ + 48), _33_);
        this._storeInt((_36_ + 44), _34_);
        this._storeInt((_36_ + 40), _35_);
        this._storeInt((_36_ + 28), (this._storeInt((_36_ + 32), (this._storeInt((_36_ + 36), 0)))));
        this._storeInt((_36_ + 24), (this._loadInt((this._loadInt((_36_ + 44))))));
        this._storeInt((_36_ + 20), (this._loadInt((this._loadInt((_36_ + 48))))));
        label$1:
        do {
            label$0:
            while (true) {
                _35_ = 1;
                label$2:
                do {
                    if ((this._loadInt((_36_ + 32))) < (this._loadInt((_36_ + 24)))) {
                        break label$2;
                    }
                    _35_ = ((this._loadInt((_36_ + 36))) < (this._loadInt((_36_ + 52)))) ? 1 : 0;
                }
                while (false);
                if (_35_ == 0) {
                    break label$1;
                }
                label$3:
                do {
                    label$4:
                    do {
                        if ((this._loadInt((_36_ + 36))) >= (this._loadInt((_36_ + 52)))) {
                            break label$4;
                        }
                        label$5:
                        do {
                            if ((this._loadInt((_36_ + 32))) >= (this._loadInt((_36_ + 24)))) {
                                break label$5;
                            }
                            if (((this._loadInt(((_35_ = this._loadInt((_36_ + 60))) + ((this._loadInt16u(((this._loadInt((_36_ + 56))) + ((this._loadInt((_36_ + 36))) << 1)))) << 2)))) & 4294967295L) >= ((this._loadInt((_35_ + ((this._loadInt16u(((this._loadInt((_36_ + 20))) + ((this._loadInt((_36_ + 32))) << 1)))) << 2)))) & 4294967295L)) {
                                break label$4;
                            }
                        }
                        while (false);
                        this._storeInt((_36_ + 36), ((_35_ = this._loadInt((_36_ + 36))) + 1));
                        this._storeInt16((_36_ + 18), (this._loadInt16u(((this._loadInt((_36_ + 56))) + (_35_ << 1)))));
                        break label$3;
                    }
                    while (false);
                    this._storeInt((_36_ + 32), ((_35_ = this._loadInt((_36_ + 32))) + 1));
                    this._storeInt16((_36_ + 18), (this._loadInt16u(((this._loadInt((_36_ + 20))) + (_35_ << 1)))));
                }
                while (false);
                this._storeInt((_36_ + 12), (this._loadInt(((this._loadInt((_36_ + 60))) + ((this._loadInt16u((_36_ + 18))) << 2)))));
                _35_ = this._loadInt16u((_36_ + 18));
                this._storeInt((_36_ + 28), ((_34_ = this._loadInt((_36_ + 28))) + 1));
                this._storeInt16(((this._loadInt((_36_ + 40))) + (_34_ << 1)), _35_);
                if ((this._loadInt((_36_ + 36))) >= (this._loadInt((_36_ + 52)))) {
                    continue label$0;
                }
                if ((this._loadInt(((this._loadInt((_36_ + 60))) + ((this._loadInt16u(((this._loadInt((_36_ + 56))) + ((this._loadInt((_36_ + 36))) << 1)))) << 2)))) != (this._loadInt((_36_ + 12)))) {
                    continue label$0;
                }
                this._storeInt((_36_ + 36), ((this._loadInt((_36_ + 36))) + 1));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((this._loadInt((_36_ + 48))), (this._loadInt((_36_ + 56))));
        this._storeInt((this._loadInt((_36_ + 44))), (this._loadInt((_36_ + 28))));
        memcpy((this._loadInt((_36_ + 56))), (this._loadInt((_36_ + 40))), ((this._loadInt((_36_ + 28))) << 1));
        this._storeInt((0 + 4), (_36_ + 64));
        return;
    }

    @Override()
    public final int walIndexPage(int _30_, int _31_, int _32_)
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
                    label$3:
                    do {
                        label$4:
                        do {
                            if ((this._loadInt(((this._loadInt((_33_ + 24))) + 24))) > (this._loadInt((_33_ + 20)))) {
                                break label$4;
                            }
                            _32_ = this._storeInt((_33_ + 8), (((this._loadInt((_33_ + 20))) << 2) + 4));
                            if ((this._storeInt((_33_ + 4), (sqlite3_realloc((this._loadInt(((this._loadInt((_33_ + 24))) + 28))), _32_)))) == 0) {
                                break label$3;
                            }
                            memset(((this._loadInt((_33_ + 4))) + ((_32_ = this._loadInt(((this._loadInt((_33_ + 24))) + 24))) << 2)), 0, ((((this._loadInt((_33_ + 20))) + 1) - _32_) << 2));
                            this._storeInt(((_32_ = this._loadInt((_33_ + 24))) + 28), (this._loadInt((_33_ + 4))));
                            this._storeInt((_32_ + 24), ((this._loadInt((_33_ + 20))) + 1));
                        }
                        while (false);
                        if ((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 24))) + 28))) + ((this._loadInt((_33_ + 20))) << 2)))) != 0) {
                            break label$1;
                        }
                        if ((this._loadInt8u(((this._loadInt((_33_ + 24))) + 38))) != 2) {
                            break label$2;
                        }
                        _32_ = sqlite3MallocZero(32768);
                        this._storeInt(((this._loadInt(((_31_ = this._loadInt((_33_ + 24))) + 28))) + (_30_ = (this._loadInt((_33_ + 20))) << 2)), _32_);
                        if ((this._loadInt(((this._loadInt((_31_ + 28))) + _30_))) != 0) {
                            break label$1;
                        }
                        this._storeInt((_33_ + 12), 7);
                        break label$1;
                    }
                    while (false);
                    this._storeInt((this._loadInt((_33_ + 16))), 0);
                    this._storeInt((_33_ + 28), 7);
                    break label$0;
                }
                while (false);
                if ((this._storeInt((_33_ + 12), (sqlite3OsShmMap((this._loadInt(((_32_ = this._loadInt((_33_ + 24))) + 4))), (_31_ = this._loadInt((_33_ + 20))), 32768, (this._loadInt8u((_32_ + 39))), ((this._loadInt((_32_ + 28))) + (_31_ << 2)))))) != 8) {
                    break label$1;
                }
                this._storeInt8(((_32_ = this._loadInt((_33_ + 24))) + 41), ((this._loadInt8u((_32_ + 41))) | 2));
                this._storeInt((_33_ + 12), 0);
            }
            while (false);
            this._storeInt((this._loadInt((_33_ + 16))), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 24))) + 28))) + ((this._loadInt((_33_ + 20))) << 2)))));
            this._storeInt((_33_ + 28), (this._loadInt((_33_ + 12))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int sqlite3MallocZero(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (sqlite3Malloc((this._storeInt((_31_ + 12), _30_)))))) == 0) {
                break label$0;
            }
            memset((this._loadInt((_31_ + 8))), 0, (this._loadInt((_31_ + 12))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3OsShmMap(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        _34_ = this._iiiiiiTable[this._tableIndices[this._loadInt(((this._loadInt((_33_ = this._loadInt((_35_ + 28))))) + 52))]].invoke(_33_, (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 16))), _34_);
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int walIndexTryHdr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 128))) + 120), _30_);
        this._storeInt((_32_ + 116), _31_);
        memcpy((_32_ + 56), (this._storeInt((_32_ + 4), (walIndexHdr((this._loadInt((_32_ + 120))))))), 48);
        walShmBarrier((this._loadInt((_32_ + 120))));
        memcpy((_32_ + 8), ((this._loadInt((_32_ + 4))) + 48), 48);
        label$0:
        do {
            label$1:
            do {
                if ((memcmp((_32_ + 56), (_32_ + 8), 48)) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 124), 1);
                break label$0;
            }
            while (false);
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt8u((_32_ + 68))) == 0) {
                        break label$3;
                    }
                    walChecksumBytes(1, (_32_ + 56), 40, 0, (_32_ + 108));
                    label$4:
                    do {
                        if ((this._loadInt((_32_ + 108))) != (this._loadInt((_32_ + 96)))) {
                            break label$4;
                        }
                        if ((this._loadInt((_32_ + 112))) == (this._loadInt(((_32_ + 56) + 44)))) {
                            break label$2;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 124), 1);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 124), 1);
                break label$0;
            }
            while (false);
            label$5:
            do {
                if ((memcmp(((this._loadInt((_32_ + 120))) + 44), (_32_ + 56), 48)) == 0) {
                    break label$5;
                }
                _31_ = this._storeInt((this._loadInt((_32_ + 116))), 1);
                memcpy(((this._loadInt((_32_ + 120))) + 44), (_32_ + 56), 48);
                this._storeInt(((_30_ = this._loadInt((_32_ + 120))) + 32), (((_30_ = this._loadInt16u((_30_ + 58))) & 65024) | ((_30_ & _31_) << 16)));
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
    public final int walLockShared(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 8))) + 38))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), (this._storeInt(_32_, (sqlite3OsShmLock((this._loadInt(((this._loadInt((_32_ + 8))) + 4))), (this._loadInt((_32_ + 4))), 1, 6)))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void walUnlockShared(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 38))) != 0) {
                break label$0;
            }
            sqlite3OsShmLock((this._loadInt(((this._loadInt((_32_ + 12))) + 4))), (this._loadInt((_32_ + 8))), 1, 5);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int walIndexRecover(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 144))) + 116), 0);
        this._storeInt((_32_ + 136), _30_);
        this._storeInt((_32_ + 112), _31_);
        this._storeInt((_32_ + 108), ((this._loadInt8u(((this._loadInt((_32_ + 136))) + 40))) + 1));
        _30_ = this._storeInt((_32_ + 104), (8 - (this._loadInt((_32_ + 108)))));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 132), (walLockExclusive((this._loadInt((_32_ + 136))), (this._loadInt((_32_ + 108))), _30_)))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 140), (this._loadInt((_32_ + 132))));
                break label$0;
            }
            while (false);
            memset(((this._loadInt((_32_ + 136))) + 44), _31_, 48);
            label$2:
            do {
                if ((this._storeInt((_32_ + 132), (sqlite3OsFileSize((this._loadInt(((this._loadInt((_32_ + 136))) + 8))), (_32_ + 120))))) != 0) {
                    break label$2;
                }
                label$3:
                do {
                    label$4:
                    do {
                        if ((this._loadLong((_32_ + 120))) < 33L) {
                            break label$4;
                        }
                        this._storeInt((_32_ + 60), 0);
                        if ((this._storeInt((_32_ + 132), (sqlite3OsRead((this._loadInt(((this._loadInt((_32_ + 136))) + 8))), (_32_ + 64), 32, 0L)))) != 0) {
                            break label$2;
                        }
                        this._storeInt((_32_ + 32), (sqlite3Get4byte((_32_ + 64))));
                        this._storeInt((_32_ + 36), (sqlite3Get4byte(((_32_ + 64) | 8))));
                        if (((this._loadInt((_32_ + 32))) & -2) != 931071618) {
                            break label$4;
                        }
                        if (((_30_ = this._loadInt((_32_ + 36))) & (_30_ + -1)) != 0) {
                            break label$4;
                        }
                        if ((this._loadInt((_32_ + 36))) > 65536) {
                            break label$4;
                        }
                        if ((this._loadInt((_32_ + 36))) < 512) {
                            break label$4;
                        }
                        this._storeInt(((_30_ = this._loadInt((_32_ + 136))) + 32), (this._loadInt((_32_ + 36))));
                        this._storeInt8((_30_ + 57), ((this._loadInt((_32_ + 32))) & 1));
                        _30_ = sqlite3Get4byte(((_32_ + 64) | 12));
                        this._storeInt(((_31_ = this._loadInt((_32_ + 136))) + 96), _30_);
                        memcpy((_31_ + 76), (_32_ + 80), 8);
                        walChecksumBytes((((this._loadInt8u(((_30_ = this._loadInt((_32_ + 136))) + 57))) == (((this._loadInt8s((0 + 29180))) == 0) ? 1 : 0)) ? 1 : 0), (_32_ + 64), 24, 0, (_30_ + 68));
                        if ((this._loadInt(((this._loadInt((_32_ + 136))) + 68))) != (sqlite3Get4byte(((_32_ + 64) + 24)))) {
                            break label$4;
                        }
                        if ((this._loadInt(((this._loadInt((_32_ + 136))) + 72))) != (sqlite3Get4byte((_32_ + 92)))) {
                            break label$4;
                        }
                        label$5:
                        do {
                            if ((this._storeInt((_32_ + 28), (sqlite3Get4byte(((_32_ + 64) | 4))))) == 3007000) {
                                break label$5;
                            }
                            this._storeInt((_32_ + 132), (sqlite3CantopenError(44759)));
                            break label$4;
                        }
                        while (false);
                        if ((this._storeInt((_32_ + 60), (sqlite3_malloc((this._storeInt((_32_ + 56), ((this._loadInt((_32_ + 36))) + 24))))))) == 0) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 52), ((this._loadInt((_32_ + 60))) + 24));
                        this._storeInt((_32_ + 48), 0);
                        this._storeLong((_32_ + 40), 32L);
                        label$7:
                        do {
                            label$6:
                            while (true) {
                                if (((this._loadLong((_32_ + 40))) + (this._loadLong32s((_32_ + 56)))) > (this._loadLong((_32_ + 120)))) {
                                    break label$7;
                                }
                                if ((this._storeInt((_32_ + 132), (sqlite3OsRead((this._loadInt(((this._loadInt((_32_ + 136))) + 8))), (this._loadInt((_32_ + 60))), (this._loadInt((_32_ + 56))), (this._loadLong((_32_ + 40))))))) != 0) {
                                    break label$7;
                                }
                                if ((this._storeInt((_32_ + 16), (walDecodeFrame((this._loadInt((_32_ + 136))), (_32_ + 24), (_32_ + 20), (this._loadInt((_32_ + 52))), (this._loadInt((_32_ + 60))))))) == 0) {
                                    break label$7;
                                }
                                if ((this._storeInt((_32_ + 132), (walIndexAppend((this._loadInt((_32_ + 136))), (this._storeInt((_32_ + 48), ((this._loadInt((_32_ + 48))) + 1))), (this._loadInt((_32_ + 24))))))) != 0) {
                                    break label$7;
                                }
                                label$8:
                                do {
                                    if ((this._loadInt((_32_ + 20))) == 0) {
                                        break label$8;
                                    }
                                    this._storeInt(((_30_ = this._loadInt((_32_ + 136))) + 64), (this._loadInt((_32_ + 20))));
                                    this._storeInt((_30_ + 60), (this._loadInt((_32_ + 48))));
                                    this._storeInt16(((this._loadInt((_32_ + 136))) + 58), (((_30_ = this._loadInt((_32_ + 36))) & 65280) | (_30_ >>> 16)));
                                    this._storeInt((_32_ + 112), (this._loadInt(((this._loadInt((_32_ + 136))) + 68))));
                                    this._storeInt((_32_ + 116), (this._loadInt(((this._loadInt((_32_ + 136))) + 72))));
                                }
                                while (false);
                                this._storeLong((_32_ + 40), ((this._loadLong((_32_ + 40))) + (this._loadLong32s((_32_ + 56)))));
                                continue label$6;
                            }
                        }
                        while (false);
                        sqlite3_free((this._loadInt((_32_ + 60))));
                    }
                    while (false);
                    if ((this._loadInt((_32_ + 132))) != 0) {
                        break label$2;
                    }
                    this._storeInt(((_30_ = this._loadInt((_32_ + 136))) + 72), (this._loadInt((_32_ + 116))));
                    this._storeInt((_30_ + 68), (this._loadInt((_32_ + 112))));
                    walIndexWriteHdr((this._loadInt((_32_ + 136))));
                    this._storeInt(((_30_ = walCkptInfo((this._loadInt((_32_ + 136))))) + 4), (this._storeInt(_30_, 0)));
                    this._storeInt((_32_ + 12), _30_);
                    _31_ = this._storeInt((_32_ + 8), 1);
                    label$10:
                    do {
                        label$9:
                        while (true) {
                            if ((this._loadInt((_32_ + 8))) > 4) {
                                break label$10;
                            }
                            this._storeInt((((this._loadInt((_32_ + 12))) + ((_30_ = this._loadInt((_32_ + 8))) << 2)) + 4), -1);
                            this._storeInt((_32_ + 8), (_30_ + _31_));
                            continue label$9;
                        }
                    }
                    while (false);
                    if ((this._loadInt(((this._loadInt((_32_ + 136))) + 64))) == 0) {
                        break label$2;
                    }
                    _31_ = this._loadInt(((_30_ = this._loadInt((_32_ + 136))) + 64));
                    this._storeInt((_32_ + 4), (this._loadInt((_30_ + 92))));
                    this._storeInt(_32_, _31_);
                    sqlite3_log(0, 29184, _32_);
                    break label$2;
                }
                while (false);
                this._storeInt((_32_ + 132), 7);
            }
            while (false);
            walUnlockExclusive((this._loadInt((_32_ + 136))), (this._loadInt((_32_ + 108))), (this._loadInt((_32_ + 104))));
            this._storeInt((_32_ + 140), (this._loadInt((_32_ + 132))));
        }
        while (false);
        _30_ = this._loadInt((_32_ + 140));
        this._storeInt((0 + 4), (_32_ + 144));
        return _30_;
    }

    @Override()
    public final int sqlite3Get4byte(int _30_)
    {
        return (((((this._loadInt8u((_30_ = this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)))) << 24) | ((this._loadInt8u((_30_ + 1))) << 16)) | ((this._loadInt8u((_30_ + 2))) << 8)) | (this._loadInt8u((_30_ + 3))));
    }

    @Override()
    public final void walChecksumBytes(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = (this._loadInt((0 + 4))) - 48) + 44), _30_);
        this._storeInt((_35_ + 40), _31_);
        this._storeInt((_35_ + 36), _32_);
        this._storeInt((_35_ + 32), _33_);
        this._storeInt((_35_ + 28), _34_);
        this._storeInt((_35_ + 16), (this._loadInt((_35_ + 40))));
        this._storeInt((_35_ + 12), ((this._loadInt((_35_ + 40))) + (this._loadInt((_35_ + 36)))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_35_ + 32))) == 0) {
                    break label$1;
                }
                this._storeInt((_35_ + 24), (this._loadInt((this._loadInt((_35_ + 32))))));
                this._storeInt((_35_ + 20), (this._loadInt(((this._loadInt((_35_ + 32))) + 4))));
                break label$0;
            }
            while (false);
            this._storeInt((_35_ + 24), (this._storeInt((_35_ + 20), 0)));
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                if ((this._loadInt((_35_ + 44))) == 0) {
                    break label$3;
                }
                label$4:
                while (true) {
                    this._storeInt((_35_ + 16), ((_34_ = this._loadInt((_35_ + 16))) + 4));
                    this._storeInt((_35_ + 24), ((this._loadInt((_35_ + 24))) + ((this._loadInt(_34_)) + (this._loadInt((_35_ + 20))))));
                    this._storeInt((_35_ + 16), ((_34_ = this._loadInt((_35_ + 16))) + 4));
                    this._storeInt((_35_ + 20), ((this._loadInt((_35_ + 20))) + ((this._loadInt(_34_)) + (this._loadInt((_35_ + 24))))));
                    if (((this._loadInt((_35_ + 16))) & 4294967295L) < ((this._loadInt((_35_ + 12))) & 4294967295L)) {
                        continue label$4;
                    }
                    break label$2;
                }
            }
            while (false);
            label$6$end:
            do {
                label$6:
                while (true) {
                    _33_ = this._storeInt((_35_ + 24), ((this._loadInt((_35_ + 24))) + ((((((_34_ = this._loadInt((this._loadInt((_35_ + 16))))) << 24) | ((_34_ & 65280) << 8)) | ((_34_ & 16711680) >>> 8)) | (_34_ >>> 24)) + (this._loadInt((_35_ + 20))))));
                    this._storeInt((_35_ + 20), ((this._loadInt((_35_ + 20))) + (_33_ + (((((_34_ = this._loadInt(((this._loadInt((_35_ + 16))) + 4))) << 24) | ((_34_ & 65280) << 8)) | ((_34_ & 16711680) >>> 8)) | (_34_ >>> 24)))));
                    if (((this._storeInt((_35_ + 16), ((this._loadInt((_35_ + 16))) + 8))) & 4294967295L) < ((this._loadInt((_35_ + 12))) & 4294967295L)) {
                        continue label$6;
                    }
                    break label$6$end;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt(((_34_ = this._loadInt((_35_ + 28))) + 4), (this._loadInt((_35_ + 20))));
        this._storeInt(_34_, (this._loadInt((_35_ + 24))));
        return;
    }

    @Override()
    public final int walDecodeFrame(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_35_ + 36), _31_);
        this._storeInt((_35_ + 32), _32_);
        this._storeInt((_35_ + 28), _33_);
        this._storeInt((_35_ + 24), _34_);
        this._storeInt((_35_ + 16), ((this._loadInt((_35_ + 40))) + 68));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadLong(((this._loadInt((_35_ + 40))) + 76))) == (this._loadLong(((this._loadInt((_35_ + 24))) + 8)))) {
                    break label$1;
                }
                this._storeInt((_35_ + 44), 0);
                break label$0;
            }
            while (false);
            label$2:
            do {
                label$3:
                do {
                    if ((this._storeInt((_35_ + 12), (sqlite3Get4byte((this._loadInt((_35_ + 24))))))) == 0) {
                        break label$3;
                    }
                    walChecksumBytes((this._storeInt((_35_ + 20), (((this._loadInt8u(((this._loadInt((_35_ + 40))) + 57))) == (((this._loadInt8s((0 + 29180))) == 0) ? 1 : 0)) ? 1 : 0))), (this._loadInt((_35_ + 24))), 8, (_34_ = this._loadInt((_35_ + 16))), _34_);
                    walChecksumBytes((this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 28))), (this._loadInt(((this._loadInt((_35_ + 40))) + 32))), (_34_ = this._loadInt((_35_ + 16))), _34_);
                    label$4:
                    do {
                        if ((this._loadInt((this._loadInt((_35_ + 16))))) != (sqlite3Get4byte(((this._loadInt((_35_ + 24))) + 16)))) {
                            break label$4;
                        }
                        if ((this._loadInt(((this._loadInt((_35_ + 16))) + 4))) == (sqlite3Get4byte(((this._loadInt((_35_ + 24))) + 20)))) {
                            break label$2;
                        }
                    }
                    while (false);
                    this._storeInt((_35_ + 44), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_35_ + 44), 0);
                break label$0;
            }
            while (false);
            this._storeInt((this._loadInt((_35_ + 36))), (this._loadInt((_35_ + 12))));
            _34_ = sqlite3Get4byte(((this._loadInt((_35_ + 24))) + 4));
            this._storeInt((this._loadInt((_35_ + 32))), _34_);
            this._storeInt((_35_ + 44), 1);
        }
        while (false);
        _34_ = this._loadInt((_35_ + 44));
        this._storeInt((0 + 4), (_35_ + 48));
        return _34_;
    }

    @Override()
    public final int walIndexAppend(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_33_ + 36), _31_);
        this._storeInt((_33_ + 32), _32_);
        this._storeInt((_33_ + 16), (this._storeInt((_33_ + 20), (this._storeInt((_33_ + 24), 0)))));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_33_ + 28), (walHashGet((this._loadInt((_33_ + 40))), (walFramePage((this._loadInt((_33_ + 36))))), (_33_ + 16), (_33_ + 20), (_33_ + 24))))) != 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 36))) - (this._loadInt((_33_ + 24)))))) != 1) {
                        break label$2;
                    }
                    _32_ = this._storeInt(_33_, (((this._loadInt((_33_ + 16))) + 16384) - ((this._loadInt((_33_ + 20))) + 4)));
                    memset(((this._loadInt((_33_ + 20))) + 4), 0, _32_);
                }
                while (false);
                label$3:
                do {
                    if ((this._loadInt(((this._loadInt((_33_ + 20))) + ((this._loadInt((_33_ + 8))) << 2)))) == 0) {
                        break label$3;
                    }
                    walCleanupHash((this._loadInt((_33_ + 40))));
                }
                while (false);
                this._storeInt((_33_ + 4), (this._loadInt((_33_ + 8))));
                this._storeInt((_33_ + 12), (walHash((this._loadInt((_33_ + 32))))));
                label$4:
                do {
                    label$6:
                    do {
                        label$5:
                        while (true) {
                            if ((this._loadInt16u(((this._loadInt((_33_ + 16))) + ((this._loadInt((_33_ + 12))) << 1)))) == 0) {
                                break label$4;
                            }
                            this._storeInt((_33_ + 4), ((_32_ = this._loadInt((_33_ + 4))) + -1));
                            if (_32_ == 0) {
                                break label$6;
                            }
                            this._storeInt((_33_ + 12), (walNextHash((this._loadInt((_33_ + 12))))));
                            continue label$5;
                        }
                    }
                    while (false);
                    this._storeInt((_33_ + 44), (sqlite3CorruptError(44629)));
                    break label$0;
                }
                while (false);
                this._storeInt(((this._loadInt((_33_ + 20))) + ((_32_ = this._loadInt((_33_ + 8))) << 2)), (this._loadInt((_33_ + 32))));
                this._storeInt16(((this._loadInt((_33_ + 16))) + ((this._loadInt((_33_ + 12))) << 1)), _32_);
            }
            while (false);
            this._storeInt((_33_ + 44), (this._loadInt((_33_ + 28))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 44));
        this._storeInt((0 + 4), (_33_ + 48));
        return _32_;
    }

    @Override()
    public final void walIndexWriteHdr(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (walIndexHdr((this._storeInt((_33_ + 12), _30_)))));
        _31_ = this._storeInt((_33_ + 4), 40);
        _32_ = this._storeInt8(((_30_ = this._loadInt((_33_ + 12))) + 56), 1);
        this._storeInt(((this._loadInt((_33_ + 12))) + 44), 3007000);
        walChecksumBytes(_32_, (_30_ + 44), _31_, 0, (_30_ + 84));
        memcpy(((this._loadInt((_33_ + 8))) + 48), ((this._loadInt((_33_ + 12))) + 44), 48);
        walShmBarrier((this._loadInt((_33_ + 12))));
        memcpy((this._loadInt((_33_ + 8))), ((this._loadInt((_33_ + 12))) + 44), 48);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void walShmBarrier(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 38))) == 2) {
                break label$0;
            }
            sqlite3OsShmBarrier((this._loadInt(((this._loadInt((_31_ + 12))) + 4))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3OsShmBarrier(int _30_)
    {
        int _31_ = 0;
        this._viTable[this._tableIndices[this._loadInt(((this._loadInt((_30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)))) + 60))]].invoke(_30_);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void walCleanupHash(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        _30_ = this._storeInt((_31_ + 12), (this._storeInt((_31_ + 16), (this._storeInt((_31_ + 20), (this._storeInt((_31_ + 24), 0)))))));
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_31_ + 28))) + 60))) == 0) {
                break label$0;
            }
            walHashGet((_32_ = this._loadInt((_31_ + 28))), (walFramePage((this._loadInt((_32_ + 60))))), (_31_ + 24), (_31_ + 20), (_31_ + 16));
            this._storeInt((_31_ + 12), ((this._loadInt(((this._loadInt((_31_ + 28))) + 60))) - (this._loadInt((_31_ + 16)))));
            this._storeInt((_31_ + 4), _30_);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_31_ + 4))) > 8191) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._loadInt16u(((this._loadInt((_31_ + 24))) + ((this._loadInt((_31_ + 4))) << 1)))) <= (this._loadInt((_31_ + 12)))) {
                            break label$3;
                        }
                        this._storeInt16(((this._loadInt((_31_ + 24))) + ((this._loadInt((_31_ + 4))) << 1)), _30_);
                    }
                    while (false);
                    this._storeInt((_31_ + 4), ((this._loadInt((_31_ + 4))) + 1));
                    continue label$1;
                }
            }
            while (false);
            _30_ = this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 24))) - (((this._loadInt((_31_ + 20))) + ((this._loadInt((_31_ + 12))) << 2)) + 4)));
            memset((((this._loadInt((_31_ + 20))) + ((this._loadInt((_31_ + 12))) << 2)) + 4), 0, _30_);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 32));
        return;
    }

    @Override()
    public final int walHash(int _30_)
    {
        return (((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) * 383) & 8191);
    }

    @Override()
    public final int walNextHash(int _30_)
    {
        return (((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 1) & 8191);
    }

    @Override()
    public final int sqlite3WalDefaultHook(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        label$0:
        do {
            if ((this._storeInt(_34_, _33_)) < (this._loadInt((_34_ + 12)))) {
                break label$0;
            }
            sqlite3BeginBenignMalloc();
            sqlite3_wal_checkpoint((this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))));
            sqlite3EndBenignMalloc();
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 16));
        return 0;
    }

    @Override()
    public final void softHeapLimitEnforcer(int _30_, long _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeLong((_33_ + 16), _31_);
        sqlite3_release_memory((this._storeInt((_33_ + 12), _32_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int sqlite3MemoryAlarm(int _30_, int _31_, long _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeLong((_33_ + 16), _32_);
        this._storeInt((0 + 20484), (this._loadInt((_33_ + 28))));
        this._storeInt((0 + 20488), (this._loadInt((_33_ + 24))));
        this._storeLong((0 + 20476), _32_);
        this._storeInt((_33_ + 12), (sqlite3StatusValue(0)));
        _31_ = 0;
        label$0:
        do {
            if ((this._loadLong((_33_ + 16))) < 1L) {
                break label$0;
            }
            _31_ = ((this._loadLong((_33_ + 16))) <= (this._loadLong32s((_33_ + 12)))) ? 1 : 0;
        }
        while (false);
        this._storeInt((0 + 20504), _31_);
        this._storeInt((0 + 4), (_33_ + 32));
        return 0;
    }

    @Override()
    public final int sqlite3SafetyCheckSickOrOk(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 4), (this._loadInt(((this._storeInt((_31_ + 8), _30_)) + 56))))) == 1266094736) {
                    break label$1;
                }
                if ((this._loadInt((_31_ + 4))) == -1607883113) {
                    break label$1;
                }
                if ((this._loadInt((_31_ + 4))) == -264537850) {
                    break label$1;
                }
                logBadConnection(29232);
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
    public final void logBadConnection(int _30_)
    {
        int _31_ = 0;
        this._storeInt((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))), (this._storeInt((_31_ + 12), _30_)));
        sqlite3_log(21, 29248, _31_);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3BtreeEnterAll(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_31_ + 8), 0);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 8))) >= (this._loadInt(((this._loadInt((_31_ + 12))) + 4)))) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._storeInt((_31_ + 4), (this._loadInt((((this._loadInt(((this._loadInt((_31_ + 12))) + 8))) + ((this._loadInt((_31_ + 8))) << 4)) + 4))))) == 0) {
                        break label$2;
                    }
                    this._storeInt(((this._loadInt(((_30_ = this._loadInt((_31_ + 4))) + 4))) + 4), (this._loadInt(_30_)));
                }
                while (false);
                this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) + 1));
                continue label$0;
            }
        }
        while (false);
        return;
    }

    @Override()
    public final int sqlite3BtreePager(int _30_)
    {
        return (this._loadInt((this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 4)))));
    }

    @Override()
    public final int sqlite3PagerMemUsed(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        int _33_ = 0;
        int _34_ = 0;
        _30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (((this._loadInt(((_30_ = this._storeInt((_31_ + 12), _30_)) + 128))) + (this._loadInt16u((_30_ + 116)))) + 56));
        _32_ = sqlite3PcachePagecount((this._loadInt(((this._loadInt((_31_ + 12))) + 168))));
        _33_ = sqlite3MallocSize((this._loadInt((_31_ + 12))));
        _34_ = this._loadInt(((this._loadInt((_31_ + 12))) + 128));
        this._storeInt((0 + 4), (_31_ + 16));
        return (_34_ + (_33_ + (_30_ * _32_)));
    }

    @Override()
    public final void sqlite3DeleteTrigger(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                break label$0;
            }
            sqlite3DeleteTriggerStep((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 28))));
            sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt((this._loadInt((_32_ + 8))))));
            sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 4))));
            sqlite3ExprDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 12))));
            sqlite3IdListDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 16))));
            sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3DeleteTable(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 24), _31_)) == 0) {
                break label$0;
            }
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_32_ + 28))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt(((this._loadInt((_32_ + 28))) + 504))) != 0) {
                        break label$1;
                    }
                }
                while (false);
                if (((this._storeInt16(((_31_ = this._loadInt((_32_ + 24))) + 32), ((this._loadInt16u((_31_ + 32))) + -1))) & 65535) > 0) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 24))) + 16))));
            label$4:
            do {
                label$3:
                while (true) {
                    if ((this._loadInt((_32_ + 20))) == 0) {
                        break label$4;
                    }
                    this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt((_32_ + 20))) + 32))));
                    label$5:
                    do {
                        label$6:
                        do {
                            if ((this._loadInt((_32_ + 28))) == 0) {
                                break label$6;
                            }
                            if ((this._loadInt(((this._loadInt((_32_ + 28))) + 504))) != 0) {
                                break label$5;
                            }
                        }
                        while (false);
                        _31_ = this._storeInt((_32_ + 12), (this._loadInt((this._loadInt((_32_ + 20))))));
                        sqlite3HashInsert(((this._loadInt(((this._loadInt((_32_ + 20))) + 36))) + 24), _31_, (sqlite3Strlen30(_31_)), 0);
                    }
                    while (false);
                    freeIndex((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 20))));
                    this._storeInt((_32_ + 20), (this._loadInt((_32_ + 16))));
                    continue label$3;
                }
            }
            while (false);
            sqlite3FkDelete((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 24))));
            sqliteDeleteColumnNames((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 24))));
            sqlite3DbFree((this._loadInt((_32_ + 28))), (this._loadInt((this._loadInt((_32_ + 24))))));
            sqlite3DbFree((this._loadInt((_32_ + 28))), (this._loadInt(((this._loadInt((_32_ + 24))) + 40))));
            sqlite3SelectDelete((this._loadInt((_32_ + 28))), (this._loadInt(((this._loadInt((_32_ + 24))) + 28))));
            sqlite3ExprDelete((this._loadInt((_32_ + 28))), (this._loadInt(((this._loadInt((_32_ + 24))) + 44))));
            sqlite3VtabClear((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 24))));
            sqlite3DbFree((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 24))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void sqlite3VdbeDeleteObject(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        releaseMemArray((this._loadInt(((_31_ = this._storeInt((_32_ + 24), _31_)) + 72))), (this._loadInt16s((_31_ + 80))));
        releaseMemArray((this._loadInt(((_31_ = this._loadInt((_32_ + 24))) + 16))), ((this._loadInt16u((_31_ + 48))) << 1));
        this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 24))) + 184))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 20))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt((_32_ + 20))) + 20))));
                vdbeFreeOpArray((this._loadInt((_32_ + 28))), (this._loadInt((_31_ = this._loadInt((_32_ + 20))))), (this._loadInt((_31_ + 4))));
                sqlite3DbFree((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 20))));
                this._storeInt((_32_ + 20), (this._loadInt((_32_ + 16))));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((_32_ + 12), ((this._loadInt16s(((this._loadInt((_32_ + 24))) + 82))) + -1));
        label$3:
        do {
            label$2:
            while (true) {
                if ((this._loadInt((_32_ + 12))) < 0) {
                    break label$3;
                }
                sqlite3DbFree((this._loadInt((_32_ + 28))), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 24))) + 76))) + ((this._loadInt((_32_ + 12))) << 2)))));
                this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + -1));
                continue label$2;
            }
        }
        while (false);
        vdbeFreeOpArray((this._loadInt((_32_ + 28))), (this._loadInt(((_31_ = this._loadInt((_32_ + 24))) + 4))), (this._loadInt((_31_ + 28))));
        sqlite3DbFree((this._loadInt((_32_ + 28))), (this._loadInt(((this._loadInt((_32_ + 24))) + 44))));
        sqlite3DbFree((this._loadInt((_32_ + 28))), (this._loadInt(((this._loadInt((_32_ + 24))) + 16))));
        sqlite3DbFree((this._loadInt((_32_ + 28))), (this._loadInt(((this._loadInt((_32_ + 24))) + 160))));
        sqlite3DbFree((this._loadInt((_32_ + 28))), (this._loadInt(((this._loadInt((_32_ + 24))) + 164))));
        sqlite3DbFree((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 24))));
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void releaseMemArray(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        label$0:
        do {
            if ((this._loadInt((_32_ + 28))) == 0) {
                break label$0;
            }
            if ((this._loadInt((_32_ + 24))) == 0) {
                break label$0;
            }
            this._storeInt8((_32_ + 15), (this._loadInt8u(((this._storeInt((_32_ + 16), (this._loadInt((this._loadInt((_32_ + 28))))))) + 30))));
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_32_ + 16))) + 504))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 28))) + ((this._loadInt((_32_ + 24))) * 40)));
                label$2:
                while (true) {
                    if (((this._loadInt((_32_ + 28))) & 4294967295L) >= ((this._loadInt((_32_ + 20))) & 4294967295L)) {
                        break label$0;
                    }
                    sqlite3DbFree((this._loadInt((_32_ + 16))), (this._loadInt(((this._loadInt((_32_ + 28))) + 36))));
                    this._storeInt((_32_ + 28), ((this._loadInt((_32_ + 28))) + 40));
                    continue label$2;
                }
            }
            while (false);
            this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 28))) + ((this._loadInt((_32_ + 24))) * 40)));
            label$5:
            do {
                label$4:
                while (true) {
                    if (((this._loadInt((_32_ + 28))) & 4294967295L) >= ((this._loadInt((_32_ + 20))) & 4294967295L)) {
                        break label$5;
                    }
                    label$6:
                    do {
                        label$7:
                        do {
                            if (((this._loadInt16u(((this._loadInt((_32_ + 28))) + 28))) & 9312) == 0) {
                                break label$7;
                            }
                            sqlite3VdbeMemRelease((this._loadInt((_32_ + 28))));
                            break label$6;
                        }
                        while (false);
                        if ((this._loadInt(((this._loadInt((_32_ + 28))) + 36))) == 0) {
                            break label$6;
                        }
                        sqlite3DbFree((this._loadInt((_32_ + 16))), (this._loadInt(((this._loadInt((_32_ + 28))) + 36))));
                        this._storeInt(((this._loadInt((_32_ + 28))) + 36), 0);
                    }
                    while (false);
                    this._storeInt16(((_31_ = this._loadInt((_32_ + 28))) + 28), 1);
                    this._storeInt((_32_ + 28), (_31_ + 40));
                    continue label$4;
                }
            }
            while (false);
            this._storeInt8(((this._loadInt((_32_ + 16))) + 30), (this._loadInt8u((_32_ + 15))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void vdbeFreeOpArray(int _30_, int _31_, int _32_)
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
            this._storeInt(_33_, (this._loadInt((_33_ + 8))));
            label$2:
            do {
                label$1:
                while (true) {
                    if (((this._loadInt(_33_)) & 4294967295L) >= (((this._loadInt((_33_ + 8))) + ((this._loadInt((_33_ + 4))) * 20)) & 4294967295L)) {
                        break label$2;
                    }
                    freeP4((this._loadInt((_33_ + 12))), (this._loadInt8s(((_32_ = this._loadInt(_33_)) + 1))), (this._loadInt((_32_ + 16))));
                    this._storeInt(_33_, ((this._loadInt(_33_)) + 20));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        sqlite3DbFree((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))));
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void freeP4(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        label$0:
        do {
            if ((this._storeInt((_33_ + 20), _32_)) == 0) {
                break label$0;
            }
            if (((_32_ = (this._loadInt((_33_ + 24))) + 16) & 4294967295L) > (15 & 4294967295L)) {
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
                                    label$7:
                                    do {
                                        switch (_32_) {
                                            case 0:
                                            case 1:
                                            case 3:
                                            case 4:
                                            case 10:
                                            case 15: {
                                                break label$7;
                                            }
                                            case 2:
                                            case 7:
                                            case 12:
                                            case 13:
                                            case 14: {
                                                break label$0;
                                            }
                                            case 5: {
                                                break label$6;
                                            }
                                            case 6: {
                                                break label$5;
                                            }
                                            case 8: {
                                                break label$4;
                                            }
                                            case 9: {
                                                break label$3;
                                            }
                                            case 11: {
                                                break label$2;
                                            }
                                            default: {
                                                break label$7;
                                            }
                                        }
                                    }
                                    while (false);
                                    sqlite3DbFree((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 20))));
                                    break label$0;
                                }
                                while (false);
                                if ((this._loadInt(((this._loadInt((_33_ + 28))) + 504))) != 0) {
                                    break label$0;
                                }
                                sqlite3_free((this._loadInt((_33_ + 20))));
                                break label$0;
                            }
                            while (false);
                            if ((this._loadInt(((this._loadInt((_33_ + 28))) + 504))) != 0) {
                                break label$0;
                            }
                            sqlite3VtabUnlock((this._loadInt((_33_ + 20))));
                            break label$0;
                        }
                        while (false);
                        if ((this._loadInt(((this._loadInt((_33_ + 28))) + 504))) == 0) {
                            break label$1;
                        }
                        _32_ = this._storeInt((_33_ + 12), (this._loadInt((_33_ + 20))));
                        sqlite3DbFree((this._loadInt((_33_ + 28))), (this._loadInt((_32_ + 36))));
                        sqlite3DbFree((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 12))));
                        break label$0;
                    }
                    while (false);
                    _32_ = this._storeInt((_33_ + 16), (this._loadInt((_33_ + 20))));
                    freeEphemeralFunction((this._loadInt((_33_ + 28))), (this._loadInt(_32_)));
                    label$8:
                    do {
                        if ((this._loadInt(((this._loadInt((_33_ + 28))) + 504))) != 0) {
                            break label$8;
                        }
                        sqlite3VdbeDeleteAuxData((this._loadInt((_33_ + 16))), 0);
                    }
                    while (false);
                    sqlite3DbFree((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 16))));
                    break label$0;
                }
                while (false);
                freeEphemeralFunction((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 20))));
                break label$0;
            }
            while (false);
            sqlite3ValueFree((this._loadInt((_33_ + 20))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void freeEphemeralFunction(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                break label$0;
            }
            if (((this._loadInt8u(((this._loadInt((_32_ + 8))) + 3))) & 4) == 0) {
                break label$0;
            }
            sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3VdbeDeleteAuxData(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _30_ = this._storeInt((_32_ + 4), 0);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 4))) >= (this._loadInt(((this._loadInt((_32_ + 12))) + 4)))) {
                    break label$1;
                }
                this._storeInt(_32_, (((this._loadInt((_32_ + 12))) + ((this._loadInt((_32_ + 4))) << 3)) + 8));
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_32_ + 4))) > 31) {
                            break label$3;
                        }
                        if (((this._loadInt((_32_ + 8))) & (1 << (this._loadInt((_32_ + 4))))) != 0) {
                            break label$2;
                        }
                    }
                    while (false);
                    if ((this._loadInt((this._loadInt(_32_)))) == 0) {
                        break label$2;
                    }
                    label$4:
                    do {
                        if ((this._loadInt(((this._loadInt(_32_)) + 4))) == 0) {
                            break label$4;
                        }
                        this._viTable[this._tableIndices[this._loadInt(((_31_ = this._loadInt(_32_)) + 4))]].invoke((this._loadInt(_31_)));
                    }
                    while (false);
                    this._storeInt((this._loadInt(_32_)), _30_);
                }
                while (false);
                this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3ValueFree(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) == 0) {
                break label$0;
            }
            sqlite3VdbeMemRelease((this._loadInt((_31_ + 12))));
            sqlite3DbFree((this._loadInt((_30_ = this._loadInt((_31_ + 12))))), _30_);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3VtabUnlock(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._loadInt((this._storeInt((_31_ + 12), _30_)))));
        this._storeInt(((_30_ = this._loadInt((_31_ + 12))) + 12), ((this._loadInt((_30_ + 12))) + -1));
        label$0:
        do {
            if ((this._loadInt((_30_ + 12))) != 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._storeInt((_31_ + 4), (this._loadInt(((this._loadInt((_31_ + 12))) + 8))))) == 0) {
                    break label$1;
                }
                this._iiTable[this._tableIndices[this._loadInt(((this._loadInt((_30_ = this._loadInt((_31_ + 4))))) + 16))]].invoke(_30_);
            }
            while (false);
            sqlite3DbFree((this._loadInt((_31_ + 8))), (this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }
}
