package com.wrmsr.wava;

abstract class sqlite3$14
        extends sqlite3$13
{
    protected sqlite3$14(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final void sqlite3BitvecDestroy(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 12))) + 8))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 8), 0);
                label$3:
                do {
                    label$2:
                    while (true) {
                        if (((this._loadInt((_31_ + 8))) & 4294967295L) > (124 & 4294967295L)) {
                            break label$3;
                        }
                        sqlite3BitvecDestroy((this._loadInt((((this._loadInt((_31_ + 12))) + ((this._loadInt((_31_ + 8))) << 2)) + 12))));
                        this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) + 1));
                        continue label$2;
                    }
                }
                while (false);
            }
            while (false);
            sqlite3_free((this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3PcacheCleanAll(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._storeInt((_31_ + 8), (this._loadInt((this._loadInt((_31_ + 12))))))) == 0) {
                    break label$1;
                }
                sqlite3PcacheMakeClean((this._loadInt((_31_ + 8))));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3WalExclusiveMode(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt((_32_ + 8))) < 1) {
                            break label$2;
                        }
                        walUnlockShared((_31_ = this._loadInt((_32_ + 12))), ((this._loadInt16s((_31_ + 36))) + 3));
                        this._storeInt((_32_ + 4), (this._storeInt8(((this._loadInt((_32_ + 12))) + 38), 1)));
                        break label$0;
                    }
                    while (false);
                    if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 38))) == 0) {
                        break label$1;
                    }
                    this._storeInt8(((_31_ = this._loadInt((_32_ + 12))) + 38), 0);
                    label$4:
                    do {
                        if ((walLockShared(_31_, ((this._loadInt16s((_31_ + 36))) + 3))) == 0) {
                            break label$4;
                        }
                        this._storeInt8(((this._loadInt((_32_ + 12))) + 38), 1);
                    }
                    while (false);
                    this._storeInt((_32_ + 4), (((this._loadInt8u(((this._loadInt((_32_ + 12))) + 38))) == 0) ? 1 : 0));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 4), (((this._loadInt8u(((this._loadInt((_32_ + 12))) + 38))) == 0) ? 1 : 0));
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
    public final int pagerUnlockDb(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), 0);
        label$0:
        do {
            if ((this._loadInt((this._loadInt(((this._loadInt((_32_ + 12))) + 60))))) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 4), (sqlite3OsUnlock((this._loadInt(((this._loadInt((_32_ + 12))) + 60))), (this._loadInt((_32_ + 8))))));
            if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 16))) == 5) {
                break label$0;
            }
            this._storeInt8(((this._loadInt((_32_ + 12))) + 16), (this._loadInt((_32_ + 8))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3OsUnlock(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this._iiiTable[this._tableIndices[this._loadInt(((this._loadInt((_30_ = this._loadInt((_32_ + 12))))) + 32))]].invoke(_30_, _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int memjrnlClose(int _30_)
    {
        int _31_ = 0;
        memjrnlTruncate((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 0L);
        this._storeInt((0 + 4), (_31_ + 16));
        return 0;
    }

    @Override()
    public final int memjrnlRead(int _30_, int _31_, int _32_, long _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_34_ + 56), _31_);
        this._storeInt((_34_ + 52), _32_);
        this._storeLong((_34_ + 40), _33_);
        this._storeInt((_34_ + 36), (this._loadInt((_34_ + 60))));
        this._storeInt((_34_ + 32), (this._loadInt((_34_ + 56))));
        this._storeInt((_34_ + 28), (this._loadInt((_34_ + 52))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadLong(((this._loadInt((_34_ + 36))) + 24))) != (this._loadLong((_34_ + 40)))) {
                    break label$1;
                }
                if ((this._loadLong((_34_ + 40))) == 0L) {
                    break label$1;
                }
                this._storeInt((_34_ + 20), (this._loadInt(((this._loadInt((_34_ + 36))) + 32))));
                break label$0;
            }
            while (false);
            this._storeLong((_34_ + 8), 0L);
            this._storeInt((_34_ + 20), (this._loadInt(((this._loadInt((_34_ + 36))) + 4))));
            label$3:
            do {
                label$2:
                while (true) {
                    _32_ = 0;
                    label$4:
                    do {
                        if ((this._loadInt((_34_ + 20))) == 0) {
                            break label$4;
                        }
                        _32_ = (((this._loadLong((_34_ + 8))) + 1020L) <= (this._loadLong((_34_ + 40)))) ? 1 : 0;
                    }
                    while (false);
                    if (_32_ == 0) {
                        break label$3;
                    }
                    this._storeLong((_34_ + 8), ((this._loadLong((_34_ + 8))) + 1020L));
                    this._storeInt((_34_ + 20), (this._loadInt((this._loadInt((_34_ + 20))))));
                    continue label$2;
                }
            }
            while (false);
        }
        while (false);
        this._storeLong32((_34_ + 24), ((this._loadLong((_34_ + 40))) % 1020L));
        label$5$end:
        do {
            label$5:
            while (true) {
                this._storeInt((_34_ + 4), (1020 - (this._loadInt((_34_ + 24)))));
                label$7:
                do {
                    label$8:
                    do {
                        if ((this._loadInt((_34_ + 28))) >= (1020 - (this._loadInt((_34_ + 24))))) {
                            break label$8;
                        }
                        _32_ = this._loadInt((_34_ + 28));
                        break label$7;
                    }
                    while (false);
                    _32_ = 1020 - (this._loadInt((_34_ + 24)));
                }
                while (false);
                this._storeInt(_34_, _32_);
                memcpy((this._loadInt((_34_ + 32))), (((this._loadInt((_34_ + 20))) + (this._loadInt((_34_ + 24)))) + 4), _32_);
                this._storeInt((_34_ + 32), ((this._loadInt((_34_ + 32))) + (this._loadInt(_34_))));
                this._storeInt((_34_ + 28), ((this._loadInt((_34_ + 28))) - (this._loadInt((_34_ + 4)))));
                _32_ = 0;
                _31_ = this._storeInt((_34_ + 24), 0);
                label$9:
                do {
                    if ((this._loadInt((_34_ + 28))) < _31_) {
                        break label$9;
                    }
                    if ((this._storeInt((_34_ + 20), (this._loadInt((this._loadInt((_34_ + 20))))))) == 0) {
                        break label$9;
                    }
                    _32_ = ((this._loadInt((_34_ + 28))) > 0) ? 1 : 0;
                }
                while (false);
                if (_32_ != 0) {
                    continue label$5;
                }
                break label$5$end;
            }
        }
        while (false);
        this._storeInt(((_32_ = this._loadInt((_34_ + 36))) + 32), (this._loadInt((_34_ + 20))));
        this._storeLong((_32_ + 24), ((this._loadLong((_34_ + 40))) + (this._loadLong32s((_34_ + 52)))));
        this._storeInt((0 + 4), (_34_ + 64));
        return 0;
    }

    @Override()
    public final int memjrnlWrite(int _30_, int _31_, int _32_, long _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_34_ + 52), _31_);
        this._storeInt((_34_ + 48), _32_);
        this._storeLong((_34_ + 40), _33_);
        this._storeInt((_34_ + 36), (this._loadInt((_34_ + 56))));
        this._storeInt((_34_ + 32), (this._loadInt((_34_ + 48))));
        this._storeInt((_34_ + 28), (this._loadInt((_34_ + 52))));
        label$0:
        do {
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt((_34_ + 32))) < 1) {
                            break label$3;
                        }
                        this._storeInt((_34_ + 24), (this._loadInt(((this._loadInt((_34_ + 36))) + 16))));
                        _32_ = this._storeInt((_34_ + 20), ((int) ((this._loadLong(((this._loadInt((_34_ + 36))) + 8))) % 1020L)));
                        label$4:
                        do {
                            label$5:
                            do {
                                if ((this._loadInt((_34_ + 32))) >= (1020 - _32_)) {
                                    break label$5;
                                }
                                _32_ = this._loadInt((_34_ + 32));
                                break label$4;
                            }
                            while (false);
                            _32_ = 1020 - (this._loadInt((_34_ + 20)));
                        }
                        while (false);
                        this._storeInt((_34_ + 16), _32_);
                        label$6:
                        do {
                            if ((this._loadInt((_34_ + 20))) != 0) {
                                break label$6;
                            }
                            if ((this._storeInt((_34_ + 12), (sqlite3_malloc(1024)))) == 0) {
                                break label$1;
                            }
                            this._storeInt((this._loadInt((_34_ + 12))), 0);
                            label$7:
                            do {
                                label$8:
                                do {
                                    if ((this._loadInt((_34_ + 24))) == 0) {
                                        break label$8;
                                    }
                                    this._storeInt((this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 12))));
                                    break label$7;
                                }
                                while (false);
                                this._storeInt(((this._loadInt((_34_ + 36))) + 4), (this._loadInt((_34_ + 12))));
                            }
                            while (false);
                            this._storeInt(((this._loadInt((_34_ + 36))) + 16), (this._loadInt((_34_ + 12))));
                        }
                        while (false);
                        memcpy((((this._loadInt(((this._loadInt((_34_ + 36))) + 16))) + (this._loadInt((_34_ + 20)))) + 4), (this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 16))));
                        this._storeInt((_34_ + 28), ((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 16)))));
                        this._storeInt((_34_ + 32), ((this._loadInt((_34_ + 32))) - (this._loadInt((_34_ + 16)))));
                        this._storeLong(((_32_ = this._loadInt((_34_ + 36))) + 8), ((this._loadLong((_32_ + 8))) + (this._loadLong32s((_34_ + 16)))));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt((_34_ + 60), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 60), 3082);
        }
        while (false);
        _32_ = this._loadInt((_34_ + 60));
        this._storeInt((0 + 4), (_34_ + 64));
        return _32_;
    }

    @Override()
    public final int memjrnlTruncate(int _30_, long _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeLong((_32_ + 16), _31_);
        this._storeInt((_32_ + 8), (this._loadInt(((this._storeInt((_32_ + 12), (this._loadInt((_32_ + 28))))) + 4))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 8))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 4), (this._loadInt((_32_ + 8))));
                this._storeInt((_32_ + 8), (this._loadInt((this._loadInt((_32_ + 8))))));
                sqlite3_free((this._loadInt((_32_ + 4))));
                continue label$0;
            }
        }
        while (false);
        sqlite3MemJournalOpen((this._loadInt((_32_ + 28))));
        this._storeInt((0 + 4), (_32_ + 32));
        return 0;
    }

    @Override()
    public final int memjrnlSync(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        return 0;
    }

    @Override()
    public final int memjrnlFileSize(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this._storeInt((_32_ + 4), (this._loadInt((_32_ + 12))));
        this._storeLong((this._loadInt((_32_ + 8))), (this._loadLong((_31_ + 8))));
        return 0;
    }

    @Override()
    public final void sqlite3MemJournalOpen(int _30_)
    {
        int _31_ = 0;
        memset((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._storeInt((_31_ + 12), _30_)))), 0, (sqlite3MemJournalSize()));
        this._storeInt((this._loadInt((_31_ + 8))), 29420);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3MemJournalSize()
    {
        return 40;
    }

    @Override()
    public final int pagerPlaybackSavepoint(int _30_, int _31_)
    {
        int _32_ = 0;
        long _33_ = 0L;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_32_ + 52), _31_);
        this._storeInt((_32_ + 24), (this._storeInt((_32_ + 28), 0)));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_32_ + 52))) == 0) {
                            break label$3;
                        }
                        if ((this._storeInt((_32_ + 24), (sqlite3BitvecCreate((this._loadInt(((this._loadInt((_32_ + 52))) + 20))))))) == 0) {
                            break label$2;
                        }
                    }
                    while (false);
                    label$4:
                    do {
                        label$5:
                        do {
                            if ((this._loadInt((_32_ + 52))) == 0) {
                                break label$5;
                            }
                            _30_ = this._loadInt(((this._loadInt((_32_ + 52))) + 20));
                            break label$4;
                        }
                        while (false);
                        _30_ = this._loadInt(((this._loadInt((_32_ + 56))) + 28));
                    }
                    while (false);
                    this._storeInt(((_31_ = this._loadInt((_32_ + 56))) + 24), _30_);
                    this._storeInt8((_31_ + 17), (this._loadInt8u((_31_ + 12))));
                    if ((this._loadInt((_32_ + 52))) != 0) {
                        break label$1;
                    }
                    if ((pagerUseWal((this._loadInt((_32_ + 56))))) == 0) {
                        break label$1;
                    }
                    this._storeInt((_32_ + 60), (pagerRollbackWal((this._loadInt((_32_ + 56))))));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 60), 7);
                break label$0;
            }
            while (false);
            this._storeLong((_32_ + 40), (this._loadLong(((this._loadInt((_32_ + 56))) + 72))));
            label$6:
            do {
                label$7:
                do {
                    label$8:
                    do {
                        if ((this._loadInt((_32_ + 52))) == 0) {
                            break label$8;
                        }
                        if ((pagerUseWal((this._loadInt((_32_ + 56))))) == 0) {
                            break label$7;
                        }
                    }
                    while (false);
                    this._storeLong(((this._loadInt((_32_ + 56))) + 72), 0L);
                    break label$6;
                }
                while (false);
                label$9:
                do {
                    label$10:
                    do {
                        if ((this._loadLong(((this._loadInt((_32_ + 52))) + 8))) == 0) {
                            break label$10;
                        }
                        _33_ = this._loadLong(((this._loadInt((_32_ + 52))) + 8));
                        break label$9;
                    }
                    while (false);
                    _33_ = this._loadLong((_32_ + 40));
                }
                while (false);
                this._storeLong((_32_ + 32), _33_);
                this._storeLong(((this._loadInt((_32_ + 56))) + 72), (this._loadLong((this._loadInt((_32_ + 52))))));
                label$12:
                do {
                    label$11:
                    while (true) {
                        _31_ = 0;
                        label$13:
                        do {
                            if ((this._loadInt((_32_ + 28))) != 0) {
                                break label$13;
                            }
                            _31_ = ((this._loadLong(((this._loadInt((_32_ + 56))) + 72))) < (this._loadLong((_32_ + 32)))) ? 1 : 0;
                        }
                        while (false);
                        if (_31_ == 0) {
                            break label$12;
                        }
                        this._storeInt((_32_ + 28), (pager_playback_one_page((_31_ = this._loadInt((_32_ + 56))), (_31_ + 72), (this._loadInt((_32_ + 24))), 1, 1)));
                        continue label$11;
                    }
                }
                while (false);
            }
            while (false);
            label$15:
            do {
                label$14:
                while (true) {
                    _31_ = 0;
                    label$16:
                    do {
                        if ((this._loadInt((_32_ + 28))) != 0) {
                            break label$16;
                        }
                        _31_ = ((this._loadLong(((this._loadInt((_32_ + 56))) + 72))) < (this._loadLong((_32_ + 40)))) ? 1 : 0;
                    }
                    while (false);
                    if (_31_ == 0) {
                        break label$15;
                    }
                    _31_ = this._storeInt((_32_ + 16), 0);
                    this._storeInt((_32_ + 28), (readJournalHdr((this._loadInt((_32_ + 56))), _31_, (this._loadLong((_32_ + 40))), (_32_ + 16), (_32_ + 12))));
                    label$17:
                    do {
                        if ((this._loadInt((_32_ + 16))) != 0) {
                            break label$17;
                        }
                        if (((this._loadLong(((_30_ = this._loadInt((_32_ + 56))) + 80))) + (this._loadLong32u((_30_ + 124)))) != (this._loadLong((_30_ + 72)))) {
                            break label$17;
                        }
                        this._storeLong32((_32_ + 16), (((this._loadLong((_32_ + 40))) - (this._loadLong(((_30_ = this._loadInt((_32_ + 56))) + 72)))) / ((long) ((this._loadInt((_30_ + 128))) + 8))));
                    }
                    while (false);
                    this._storeInt((_32_ + 20), _31_);
                    label$18:
                    while (true) {
                        _31_ = 0;
                        label$20:
                        do {
                            if ((this._loadInt((_32_ + 28))) != 0) {
                                break label$20;
                            }
                            if (((this._loadInt((_32_ + 20))) & 4294967295L) >= ((this._loadInt((_32_ + 16))) & 4294967295L)) {
                                break label$20;
                            }
                            _31_ = ((this._loadLong(((this._loadInt((_32_ + 56))) + 72))) < (this._loadLong((_32_ + 40)))) ? 1 : 0;
                        }
                        while (false);
                        if (_31_ == 0) {
                            continue label$14;
                        }
                        this._storeInt((_32_ + 28), (pager_playback_one_page((_31_ = this._loadInt((_32_ + 56))), (_31_ + 72), (this._loadInt((_32_ + 24))), 1, 1)));
                        this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1));
                        continue label$18;
                    }
                }
            }
            while (false);
            label$21:
            do {
                if ((this._loadInt((_32_ + 52))) == 0) {
                    break label$21;
                }
                this._storeLong(_32_, (((this._loadInt(((this._loadInt((_32_ + 52))) + 24))) * ((this._loadInt(((this._loadInt((_32_ + 56))) + 128))) + 4)) & 4294967295L));
                label$22:
                do {
                    if ((pagerUseWal((this._loadInt((_32_ + 56))))) == 0) {
                        break label$22;
                    }
                    this._storeInt((_32_ + 28), (sqlite3WalSavepointUndo((this._loadInt(((this._loadInt((_32_ + 56))) + 172))), ((this._loadInt((_32_ + 52))) + 28))));
                }
                while (false);
                this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((_32_ + 52))) + 24))));
                label$24:
                do {
                    label$23:
                    while (true) {
                        _31_ = 0;
                        label$25:
                        do {
                            if ((this._loadInt((_32_ + 28))) != 0) {
                                break label$25;
                            }
                            _31_ = (((this._loadInt((_32_ + 8))) & 4294967295L) < ((this._loadInt(((this._loadInt((_32_ + 56))) + 52))) & 4294967295L)) ? 1 : 0;
                        }
                        while (false);
                        if (_31_ == 0) {
                            break label$24;
                        }
                        this._storeInt((_32_ + 28), (pager_playback_one_page((this._loadInt((_32_ + 56))), _32_, (this._loadInt((_32_ + 24))), 0, 1)));
                        this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) + 1));
                        continue label$23;
                    }
                }
                while (false);
            }
            while (false);
            sqlite3BitvecDestroy((this._loadInt((_32_ + 24))));
            label$26:
            do {
                if ((this._loadInt((_32_ + 28))) != 0) {
                    break label$26;
                }
                this._storeLong(((this._loadInt((_32_ + 56))) + 72), (this._loadLong((_32_ + 40))));
            }
            while (false);
            this._storeInt((_32_ + 60), (this._loadInt((_32_ + 28))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 60));
        this._storeInt((0 + 4), (_32_ + 64));
        return _31_;
    }

    @Override()
    public final int pagerRollbackWal(int _30_)
    {
        int _31_ = 0;
        _31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16));
        this._storeInt((_30_ + 24), (this._loadInt((_30_ + 28))));
        this._storeInt((_31_ + 8), (sqlite3WalUndo((this._loadInt(((_30_ = this._storeInt((_31_ + 12), _30_)) + 172))), 25, _30_)));
        this._storeInt((_31_ + 4), (sqlite3PcacheDirtyList((this._loadInt(((this._loadInt((_31_ + 12))) + 168))))));
        label$1:
        do {
            label$0:
            while (true) {
                _30_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_31_ + 4))) == 0) {
                        break label$2;
                    }
                    _30_ = ((this._loadInt((_31_ + 8))) == 0) ? 1 : 0;
                }
                while (false);
                if (_30_ == 0) {
                    break label$1;
                }
                this._storeInt(_31_, (this._loadInt(((this._loadInt((_31_ + 4))) + 8))));
                this._storeInt((_31_ + 8), (pagerUndoCallback((this._loadInt((_31_ + 12))), (this._loadInt(((this._loadInt((_31_ + 4))) + 12))))));
                this._storeInt((_31_ + 4), (this._loadInt(_31_)));
                continue label$0;
            }
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3WalSavepointUndo(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this._storeInt((_32_ + 4), 0);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_32_ + 8))) + 12))) == (this._loadInt(((this._loadInt((_32_ + 12))) + 96)))) {
                break label$0;
            }
            this._storeInt((_30_ = this._loadInt((_32_ + 8))), _31_);
            this._storeInt((_30_ + 12), (this._loadInt(((this._loadInt((_32_ + 12))) + 96))));
        }
        while (false);
        label$1:
        do {
            if (((this._loadInt((this._loadInt((_32_ + 8))))) & 4294967295L) >= ((this._loadInt(((this._loadInt((_32_ + 12))) + 60))) & 4294967295L)) {
                break label$1;
            }
            this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 60), (this._loadInt((_30_ = this._loadInt((_32_ + 8))))));
            this._storeInt((_31_ + 68), (this._loadInt((_30_ + 4))));
            this._storeInt(((this._loadInt((_32_ + 12))) + 72), (this._loadInt(((this._loadInt((_32_ + 8))) + 8))));
            walCleanupHash((this._loadInt((_32_ + 12))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int pagerUndoCallback(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 20), 0);
        label$0:
        do {
            if ((this._storeInt((_32_ + 12), (sqlite3PagerLookup((this._storeInt((_32_ + 16), (this._loadInt((_32_ + 28))))), (this._loadInt((_32_ + 24))))))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((sqlite3PcachePageRefcount((this._loadInt((_32_ + 12))))) != 1) {
                    break label$1;
                }
                sqlite3PcacheDrop((this._loadInt((_32_ + 12))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._storeInt((_32_ + 20), (readDbPage((this._loadInt((_32_ + 12))))))) != 0) {
                    break label$2;
                }
                this._viTable[this._tableIndices[this._loadInt(((this._loadInt((_32_ + 16))) + 160))]].invoke((this._loadInt((_32_ + 12))));
            }
            while (false);
            sqlite3PagerUnref((this._loadInt((_32_ + 12))));
        }
        while (false);
        sqlite3BackupRestart((this._loadInt(((this._loadInt((_32_ + 16))) + 88))));
        _31_ = this._loadInt((_32_ + 20));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int sqlite3WalUndo(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 16), 0);
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_33_ + 28))) + 39))) == 0) {
                break label$0;
            }
            this._storeInt((_33_ + 12), (this._loadInt(((this._loadInt((_33_ + 28))) + 60))));
            memcpy(((_32_ = this._loadInt((_33_ + 28))) + 44), (walIndexHdr(_32_)), 48);
            this._storeInt((_33_ + 8), ((this._loadInt(((this._loadInt((_33_ + 28))) + 60))) + 1));
            label$2:
            do {
                label$1:
                while (true) {
                    _32_ = 0;
                    label$3:
                    do {
                        if ((this._loadInt((_33_ + 16))) != 0) {
                            break label$3;
                        }
                        _32_ = (((this._loadInt((_33_ + 8))) & 4294967295L) <= ((this._loadInt((_33_ + 12))) & 4294967295L)) ? 1 : 0;
                    }
                    while (false);
                    if (_32_ == 0) {
                        break label$2;
                    }
                    this._storeInt((_33_ + 16), (this._iiiTable[this._tableIndices[this._loadInt((_33_ + 24))]].invoke((this._loadInt((_33_ + 20))), (walFramePgno((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 8))))))));
                    this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) + 1));
                    continue label$1;
                }
            }
            while (false);
            walCleanupHash((this._loadInt((_33_ + 28))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 16));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int sqlite3PcacheDirtyList(int _30_)
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
                this._storeInt((_31_ + 8), (this._storeInt(((_30_ = this._loadInt((_31_ + 8))) + 8), (this._loadInt((_30_ + 28))))));
                continue label$0;
            }
        }
        while (false);
        _30_ = pcacheSortDirtyList((this._loadInt((this._loadInt((_31_ + 12))))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int pcacheSortDirtyList(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 160))) + 156), _30_);
        memset((_32_ + 16), 0, 128);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 156))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 156), (this._loadInt(((this._storeInt((_32_ + 12), (this._loadInt((_32_ + 156))))) + 8))));
                _31_ = this._storeInt((_32_ + 8), (this._storeInt(((this._loadInt((_32_ + 12))) + 8), 0)));
                label$2:
                do {
                    label$4:
                    do {
                        label$3:
                        while (true) {
                            if ((this._loadInt((_32_ + 8))) > 30) {
                                break label$2;
                            }
                            if ((this._loadInt(((_32_ + 16) + ((this._loadInt((_32_ + 8))) << 2)))) == 0) {
                                break label$4;
                            }
                            this._storeInt((_32_ + 12), (pcacheMergeDirtyList((this._loadInt(((_32_ + 16) + ((this._loadInt((_32_ + 8))) << 2)))), (this._loadInt((_32_ + 12))))));
                            this._storeInt(((_32_ + 16) + ((_30_ = this._loadInt((_32_ + 8))) << 2)), _31_);
                            this._storeInt((_32_ + 8), (_30_ + 1));
                            continue label$3;
                        }
                    }
                    while (false);
                    this._storeInt(((_32_ + 16) + ((this._loadInt((_32_ + 8))) << 2)), (this._loadInt((_32_ + 12))));
                }
                while (false);
                if ((this._loadInt((_32_ + 8))) != 31) {
                    continue label$0;
                }
                _30_ = pcacheMergeDirtyList((this._loadInt(((_32_ + 16) + ((this._loadInt((_32_ + 8))) << 2)))), (this._loadInt((_32_ + 12))));
                this._storeInt(((_32_ + 16) + ((this._loadInt((_32_ + 8))) << 2)), _30_);
                continue label$0;
            }
        }
        while (false);
        this._storeInt((_32_ + 12), (this._loadInt((_32_ + 16))));
        _30_ = this._storeInt((_32_ + 8), 1);
        label$6:
        do {
            label$5:
            while (true) {
                if ((this._loadInt((_32_ + 8))) > 31) {
                    break label$6;
                }
                this._storeInt((_32_ + 12), (pcacheMergeDirtyList((this._loadInt((_32_ + 12))), (this._loadInt(((_32_ + 16) + ((this._loadInt((_32_ + 8))) << 2)))))));
                this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) + _30_));
                continue label$5;
            }
        }
        while (false);
        _30_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 160));
        return _30_;
    }

    @Override()
    public final int pcacheMergeDirtyList(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 64) + 60), _30_);
        this._storeInt((_32_ + 56), _31_);
        this._storeInt((_32_ + 12), (_32_ + 16));
        label$1:
        do {
            label$0:
            while (true) {
                _31_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_32_ + 60))) == 0) {
                        break label$2;
                    }
                    _31_ = ((this._loadInt((_32_ + 56))) != 0) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$1;
                }
                label$3:
                do {
                    if (((this._loadInt(((this._loadInt((_32_ + 60))) + 12))) & 4294967295L) < ((this._loadInt(((this._loadInt((_32_ + 56))) + 12))) & 4294967295L)) {
                        break label$3;
                    }
                    this._storeInt((_32_ + 12), (this._storeInt(((this._loadInt((_32_ + 12))) + 8), (this._loadInt((_32_ + 56))))));
                    this._storeInt((_32_ + 56), (this._loadInt(((this._loadInt((_32_ + 56))) + 8))));
                    continue label$0;
                }
                while (false);
                this._storeInt((_32_ + 12), (this._storeInt(((this._loadInt((_32_ + 12))) + 8), (this._loadInt((_32_ + 60))))));
                this._storeInt((_32_ + 60), (this._loadInt(((this._loadInt((_32_ + 60))) + 8))));
                continue label$0;
            }
        }
        while (false);
        label$4:
        do {
            if ((this._loadInt((_32_ + 60))) == 0) {
                break label$4;
            }
            this._storeInt(((this._loadInt((_32_ + 12))) + 8), (this._loadInt((_32_ + 60))));
            return (this._loadInt((_32_ + 24)));
        }
        while (false);
        label$5:
        do {
            if ((this._loadInt((_32_ + 56))) == 0) {
                break label$5;
            }
            this._storeInt(((this._loadInt((_32_ + 12))) + 8), (this._loadInt((_32_ + 56))));
            return (this._loadInt((_32_ + 24)));
        }
        while (false);
        this._storeInt(((this._loadInt((_32_ + 12))) + 8), 0);
        return (this._loadInt((_32_ + 24)));
    }

    @Override()
    public final int walFramePgno(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(_32_, (walFramePage((this._storeInt((_32_ + 4), _31_)))))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 8))) + 28))) + ((this._loadInt(_32_)) << 2)))) + ((((this._loadInt((_32_ + 4))) + -4063) & 4095) << 2)))));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), (this._loadInt((((this._loadInt((this._loadInt(((this._loadInt((_32_ + 8))) + 28))))) + ((this._loadInt((_32_ + 4))) << 2)) + 132))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3PagerLookup(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this._storeInt((_32_ + 4), 0);
        sqlite3PcacheFetch((this._loadInt(((this._loadInt((_32_ + 12))) + 168))), (this._loadInt((_32_ + 8))), _31_, (_32_ + 4));
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3PcachePageRefcount(int _30_)
    {
        return (this._loadInt16s(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 22)));
    }

    @Override()
    public final void sqlite3PcacheDrop(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if (((this._loadInt16u(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 20))) & 2) == 0) {
                break label$0;
            }
            pcacheRemoveFromDirtyList((this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt(((_30_ = this._loadInt(((this._loadInt((_31_ + 12))) + 24))) + 12), ((this._loadInt((_30_ + 12))) + -1));
        this._storeInt((_31_ + 8), _30_);
        label$1:
        do {
            if ((this._loadInt(((this._loadInt((_31_ + 12))) + 12))) != 1) {
                break label$1;
            }
            this._storeInt(((this._loadInt((_31_ + 8))) + 44), 0);
        }
        while (false);
        this._viiiTable[this._tableIndices[this._loadInt((0 + 20364))]].invoke((this._loadInt(((this._loadInt((_31_ + 8))) + 40))), (this._loadInt((_31_ + 12))), 1);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int readDbPage(int _30_)
    {
        long _31_ = 0L;
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 36), (this._loadInt(((this._storeInt((_32_ + 40), _30_)) + 16))));
        this._storeInt((_32_ + 32), (this._loadInt(((this._loadInt((_32_ + 40))) + 12))));
        _30_ = this._storeInt((_32_ + 24), (this._storeInt((_32_ + 28), 0)));
        this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 36))) + 128))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((this._loadInt(((this._loadInt((_32_ + 36))) + 60))))) == 0) {
                            break label$3;
                        }
                        label$4:
                        do {
                            if ((pagerUseWal((this._loadInt((_32_ + 36))))) == 0) {
                                break label$4;
                            }
                            this._storeInt((_32_ + 28), (sqlite3WalRead((this._loadInt(((this._loadInt((_32_ + 36))) + 172))), (this._loadInt((_32_ + 32))), (_32_ + 24), (this._loadInt((_32_ + 20))), (this._loadInt((this._loadInt((_32_ + 40))))))));
                        }
                        while (false);
                        label$5:
                        do {
                            if ((this._loadInt((_32_ + 28))) != 0) {
                                break label$5;
                            }
                            if ((this._loadInt((_32_ + 24))) != 0) {
                                break label$5;
                            }
                            _31_ = this._storeLong((_32_ + 8), ((((this._loadInt((_32_ + 32))) + -1) & 4294967295L) * (this._loadLong32s(((this._loadInt((_32_ + 36))) + 128)))));
                            if ((this._storeInt((_32_ + 28), (sqlite3OsRead((this._loadInt(((this._loadInt((_32_ + 36))) + 60))), (this._loadInt((this._loadInt((_32_ + 40))))), (this._loadInt((_32_ + 20))), _31_)))) != 522) {
                                break label$5;
                            }
                            this._storeInt((_32_ + 28), 0);
                        }
                        while (false);
                        if ((this._loadInt((_32_ + 32))) != 1) {
                            break label$1;
                        }
                        if ((this._loadInt((_32_ + 28))) == 0) {
                            break label$2;
                        }
                        memset(((this._loadInt((_32_ + 36))) + 100), 255, 16);
                        break label$1;
                    }
                    while (false);
                    memset((this._loadInt((this._loadInt((_32_ + 40))))), _30_, (this._loadInt(((this._loadInt((_32_ + 36))) + 128))));
                    this._storeInt((_32_ + 44), _30_);
                    break label$0;
                }
                while (false);
                _30_ = this._storeInt((_32_ + 4), ((this._loadInt((this._loadInt((_32_ + 40))))) + 24));
                memcpy(((this._loadInt((_32_ + 36))) + 100), _30_, 16);
            }
            while (false);
            this._storeInt((_32_ + 44), (this._loadInt((_32_ + 28))));
        }
        while (false);
        _30_ = this._loadInt((_32_ + 44));
        this._storeInt((0 + 4), (_32_ + 48));
        return _30_;
    }

    @Override()
    public final int sqlite3WalRead(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        long _35_ = 0L;
        int _36_ = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 72), _30_);
        this._storeInt((_36_ + 68), _31_);
        this._storeInt((_36_ + 64), _32_);
        this._storeInt((_36_ + 60), _33_);
        this._storeInt((_36_ + 56), _34_);
        _34_ = this._storeInt((_36_ + 52), 0);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._storeInt((_36_ + 48), (this._loadInt(((this._loadInt((_36_ + 72))) + 60))))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt16s(((this._loadInt((_36_ + 72))) + 36))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_36_ + 44), (walFramePage((this._loadInt((_36_ + 48))))));
                    break label$1;
                }
                while (false);
                this._storeInt((_36_ + 76), (this._storeInt((this._loadInt((_36_ + 64))), _34_)));
                break label$0;
            }
            while (false);
            label$4:
            do {
                label$3:
                while (true) {
                    _34_ = 0;
                    label$5:
                    do {
                        if ((this._loadInt((_36_ + 44))) < 0) {
                            break label$5;
                        }
                        _34_ = ((this._loadInt((_36_ + 52))) == 0) ? 1 : 0;
                    }
                    while (false);
                    label$6:
                    do {
                        label$7:
                        do {
                            label$8:
                            do {
                                label$9:
                                do {
                                    if (_34_ == 0) {
                                        break label$9;
                                    }
                                    if ((this._storeInt((_36_ + 20), (walHashGet((this._loadInt((_36_ + 72))), (this._loadInt((_36_ + 44))), (_36_ + 40), (_36_ + 36), (_36_ + 32))))) != 0) {
                                        break label$8;
                                    }
                                    this._storeInt((_36_ + 24), 8192);
                                    this._storeInt((_36_ + 28), (walHash((this._loadInt((_36_ + 68))))));
                                    label$11:
                                    do {
                                        label$10:
                                        while (true) {
                                            if ((this._loadInt16u(((this._loadInt((_36_ + 40))) + ((this._loadInt((_36_ + 28))) << 1)))) == 0) {
                                                break label$6;
                                            }
                                            label$12:
                                            do {
                                                if (((this._storeInt((_36_ + 16), ((this._loadInt16u(((this._loadInt((_36_ + 40))) + ((this._loadInt((_36_ + 28))) << 1)))) + (this._loadInt((_36_ + 32)))))) & 4294967295L) > ((this._loadInt((_36_ + 48))) & 4294967295L)) {
                                                    break label$12;
                                                }
                                                _34_ = this._loadInt16u(((this._loadInt((_36_ + 40))) + ((this._loadInt((_36_ + 28))) << 1)));
                                                if ((this._loadInt(((this._loadInt((_36_ + 36))) + (_34_ << 2)))) != (this._loadInt((_36_ + 68)))) {
                                                    break label$12;
                                                }
                                                this._storeInt((_36_ + 52), (this._loadInt((_36_ + 16))));
                                            }
                                            while (false);
                                            this._storeInt((_36_ + 24), ((_34_ = this._loadInt((_36_ + 24))) + -1));
                                            if (_34_ == 0) {
                                                break label$11;
                                            }
                                            this._storeInt((_36_ + 28), (walNextHash((this._loadInt((_36_ + 28))))));
                                            continue label$10;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_36_ + 76), (sqlite3CorruptError(45938)));
                                    break label$4;
                                }
                                while (false);
                                if ((this._loadInt((_36_ + 52))) == 0) {
                                    break label$7;
                                }
                                this._storeInt((_36_ + 12), (this._loadInt16u(((this._loadInt((_36_ + 72))) + 58))));
                                _34_ = this._storeInt((_36_ + 12), (((_34_ = this._loadInt16u(((this._loadInt((_36_ + 72))) + 58))) & 65024) | ((_34_ & 1) << 16)));
                                _35_ = this._storeLong(_36_, (((((this._loadInt((_36_ + 52))) + -1) & 4294967295L) * ((_34_ | 24) & 4294967295L)) + 56L));
                                this._storeInt((this._loadInt((_36_ + 64))), 1);
                                this._storeInt((_36_ + 76), (sqlite3OsRead((this._loadInt(((this._loadInt((_36_ + 72))) + 8))), (this._loadInt((_36_ + 56))), (this._loadInt((_36_ + 60))), _35_)));
                                break label$4;
                            }
                            while (false);
                            this._storeInt((_36_ + 76), (this._loadInt((_36_ + 20))));
                            break label$4;
                        }
                        while (false);
                        this._storeInt((_36_ + 76), (this._storeInt((this._loadInt((_36_ + 64))), 0)));
                        break label$4;
                    }
                    while (false);
                    this._storeInt((_36_ + 44), ((this._loadInt((_36_ + 44))) + -1));
                    continue label$3;
                }
            }
            while (false);
        }
        while (false);
        _34_ = this._loadInt((_36_ + 76));
        this._storeInt((0 + 4), (_36_ + 80));
        return _34_;
    }

    @Override()
    public final int pager_write(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 36), (this._loadInt((this._storeInt((_31_ + 40), _30_)))));
        this._storeInt((_31_ + 32), (this._loadInt(((this._loadInt((_31_ + 40))) + 16))));
        this._storeInt((_31_ + 28), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 32))) + 40))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 44), (this._loadInt(((this._loadInt((_31_ + 32))) + 40))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 32))) + 13))) == 0) {
                    break label$2;
                }
                this._storeInt((_31_ + 44), 3);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 32))) + 15))) != 2) {
                    break label$3;
                }
                if ((this._storeInt((_31_ + 28), (pager_open_journal((this._loadInt((_31_ + 32))))))) == 0) {
                    break label$3;
                }
                this._storeInt((_31_ + 44), (this._loadInt((_31_ + 28))));
                break label$0;
            }
            while (false);
            sqlite3PcacheMakeDirty((this._loadInt((_31_ + 40))));
            label$4:
            do {
                label$5:
                do {
                    if ((pageInJournal((this._loadInt((_31_ + 40))))) == 0) {
                        break label$5;
                    }
                    if ((subjRequiresPage((this._loadInt((_31_ + 40))))) == 0) {
                        break label$4;
                    }
                }
                while (false);
                label$6:
                do {
                    if ((pageInJournal((this._loadInt((_31_ + 40))))) != 0) {
                        break label$6;
                    }
                    if ((pagerUseWal((this._loadInt((_31_ + 32))))) != 0) {
                        break label$6;
                    }
                    label$7:
                    do {
                        label$8:
                        do {
                            if (((this._loadInt(((this._loadInt((_31_ + 40))) + 12))) & 4294967295L) > ((this._loadInt(((this._loadInt((_31_ + 32))) + 28))) & 4294967295L)) {
                                break label$8;
                            }
                            if ((this._loadInt((this._loadInt(((this._loadInt((_31_ + 32))) + 64))))) == 0) {
                                break label$8;
                            }
                            this._storeLong((_31_ + 8), (this._loadLong(((this._loadInt((_31_ + 32))) + 72))));
                            _30_ = this._storeInt((_31_ + 20), (this._loadInt((_31_ + 36))));
                            this._storeInt((_31_ + 24), (pager_cksum((this._loadInt((_31_ + 32))), _30_)));
                            this._storeInt16(((_30_ = this._loadInt((_31_ + 40))) + 20), ((this._loadInt16u((_30_ + 20))) | 4));
                            if ((this._storeInt((_31_ + 28), (write32bits((this._loadInt(((this._loadInt((_31_ + 32))) + 64))), (this._loadLong((_31_ + 8))), (this._loadInt((_30_ + 12))))))) == 0) {
                                break label$7;
                            }
                            this._storeInt((_31_ + 44), (this._loadInt((_31_ + 28))));
                            break label$0;
                        }
                        while (false);
                        if ((this._loadInt8u(((this._loadInt((_31_ + 32))) + 15))) == 4) {
                            break label$6;
                        }
                        this._storeInt16(((_30_ = this._loadInt((_31_ + 40))) + 20), ((this._loadInt16u((_30_ + 20))) | 4));
                        break label$6;
                    }
                    while (false);
                    label$9:
                    do {
                        if ((this._storeInt((_31_ + 28), (sqlite3OsWrite((this._loadInt(((_30_ = this._loadInt((_31_ + 32))) + 64))), (this._loadInt((_31_ + 20))), (this._loadInt((_30_ + 128))), ((this._loadLong((_31_ + 8))) + 4L))))) == 0) {
                            break label$9;
                        }
                        this._storeInt((_31_ + 44), (this._loadInt((_31_ + 28))));
                        break label$0;
                    }
                    while (false);
                    label$10:
                    do {
                        if ((this._storeInt((_31_ + 28), (write32bits((this._loadInt(((_30_ = this._loadInt((_31_ + 32))) + 64))), (((this._loadLong((_31_ + 8))) + (this._loadLong32s((_30_ + 128)))) + 4L), (this._loadInt((_31_ + 24))))))) == 0) {
                            break label$10;
                        }
                        this._storeInt((_31_ + 44), (this._loadInt((_31_ + 28))));
                        break label$0;
                    }
                    while (false);
                    this._storeLong(((_30_ = this._loadInt((_31_ + 32))) + 72), ((this._loadLong((_30_ + 72))) + ((long) ((this._loadInt((_30_ + 128))) + 8))));
                    this._storeInt((_30_ + 44), ((this._loadInt((_30_ + 44))) + 1));
                    this._storeInt((_31_ + 28), (sqlite3BitvecSet((this._loadInt(((this._loadInt((_31_ + 32))) + 56))), (this._loadInt(((this._loadInt((_31_ + 40))) + 12))))));
                    if ((this._storeInt((_31_ + 28), ((addToSavepointBitvecs((this._loadInt((_31_ + 32))), (this._loadInt(((this._loadInt((_31_ + 40))) + 12))))) | (this._loadInt((_31_ + 28)))))) == 0) {
                        break label$6;
                    }
                    this._storeInt((_31_ + 44), (this._loadInt((_31_ + 28))));
                    break label$0;
                }
                while (false);
                if ((subjRequiresPage((this._loadInt((_31_ + 40))))) == 0) {
                    break label$4;
                }
                this._storeInt((_31_ + 28), (subjournalPage((this._loadInt((_31_ + 40))))));
            }
            while (false);
            label$11:
            do {
                if (((this._loadInt(((this._loadInt((_31_ + 32))) + 24))) & 4294967295L) >= ((this._loadInt(((this._loadInt((_31_ + 40))) + 12))) & 4294967295L)) {
                    break label$11;
                }
                this._storeInt(((this._loadInt((_31_ + 32))) + 24), (this._loadInt(((this._loadInt((_31_ + 40))) + 12))));
            }
            while (false);
            this._storeInt((_31_ + 44), (this._loadInt((_31_ + 28))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 44));
        this._storeInt((0 + 4), (_31_ + 48));
        return _30_;
    }

    @Override()
    public final int pager_open_journal(int _30_)
    {
        int _31_ = 0;
        long _32_ = 0L;
        int _33_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), 0);
        this._storeInt((_33_ + 16), (this._loadInt((this._loadInt((_33_ + 24))))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_33_ + 24))) + 40))) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 28), (this._loadInt(((this._loadInt((_33_ + 24))) + 40))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((pagerUseWal((this._loadInt((_33_ + 24))))) != 0) {
                    break label$2;
                }
                if ((this._loadInt8u(((this._loadInt((_33_ + 24))) + 5))) == 2) {
                    break label$2;
                }
                _30_ = sqlite3BitvecCreate((this._loadInt(((this._loadInt((_33_ + 24))) + 24))));
                label$3:
                do {
                    label$4:
                    do {
                        label$5:
                        do {
                            if ((this._storeInt(((this._loadInt((_33_ + 24))) + 56), _30_)) == 0) {
                                break label$5;
                            }
                            if ((this._loadInt((this._loadInt(((this._loadInt((_33_ + 24))) + 64))))) != 0) {
                                break label$3;
                            }
                            if ((this._loadInt8u(((this._loadInt((_33_ + 24))) + 5))) != 4) {
                                break label$4;
                            }
                            sqlite3MemJournalOpen((this._loadInt(((this._loadInt((_33_ + 24))) + 64))));
                            break label$3;
                        }
                        while (false);
                        this._storeInt((_33_ + 28), 7);
                        break label$0;
                    }
                    while (false);
                    _temp$0 = 4104;
                    _temp$1 = 2048;
                    _temp$2 = ((this._loadInt8u(((this._loadInt((_33_ + 24))) + 12))) != 0) ? _temp$0 : _temp$1;
                    _temp$2 = _temp$2 | 6;
                    _temp$2 = this._storeInt((_33_ + 12), _temp$2);
                    _30_ = _temp$2;
                    this._storeInt((_33_ + 20), (sqlite3OsOpen((this._loadInt((_33_ + 16))), (this._loadInt(((_31_ = this._loadInt((_33_ + 24))) + 148))), (this._loadInt((_31_ + 64))), _30_, 0)));
                }
                while (false);
                if ((this._loadInt((_33_ + 20))) != 0) {
                    break label$2;
                }
                _31_ = this._storeInt(((_30_ = this._loadInt((_33_ + 24))) + 44), 0);
                _32_ = this._storeLong((_30_ + 72), 0L);
                this._storeInt8((_30_ + 18), _31_);
                this._storeLong(((this._loadInt((_33_ + 24))) + 80), _32_);
                this._storeInt((_33_ + 20), (writeJournalHdr((this._loadInt((_33_ + 24))))));
            }
            while (false);
            label$6:
            do {
                label$7:
                do {
                    if ((this._loadInt((_33_ + 20))) == 0) {
                        break label$7;
                    }
                    sqlite3BitvecDestroy((this._loadInt(((this._loadInt((_33_ + 24))) + 56))));
                    this._storeInt(((this._loadInt((_33_ + 24))) + 56), 0);
                    break label$6;
                }
                while (false);
                this._storeInt8(((this._loadInt((_33_ + 24))) + 15), 3);
            }
            while (false);
            this._storeInt((_33_ + 28), (this._loadInt((_33_ + 20))));
        }
        while (false);
        _30_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _30_;
    }

    @Override()
    public final int pageInJournal(int _30_)
    {
        int _31_ = 0;
        _30_ = sqlite3BitvecTest((this._loadInt(((this._loadInt(((_30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 16))) + 56))), (this._loadInt((_30_ + 12))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int subjRequiresPage(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 20), (this._loadInt(((this._storeInt((_31_ + 24), _30_)) + 12))));
        this._storeInt((_31_ + 16), (this._loadInt(((this._loadInt((_31_ + 24))) + 16))));
        this._storeInt((_31_ + 12), 0);
        label$0:
        do {
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt((_31_ + 12))) >= (this._loadInt(((this._loadInt((_31_ + 16))) + 96)))) {
                            break label$1;
                        }
                        label$4:
                        do {
                            if (((this._loadInt(((this._storeInt((_31_ + 8), ((this._loadInt(((this._loadInt((_31_ + 16))) + 92))) + ((this._loadInt((_31_ + 12))) * 48)))) + 20))) & 4294967295L) < ((this._loadInt((_31_ + 20))) & 4294967295L)) {
                                break label$4;
                            }
                            if ((sqlite3BitvecTest((this._loadInt(((this._loadInt((_31_ + 8))) + 16))), (this._loadInt((_31_ + 20))))) == 0) {
                                break label$3;
                            }
                        }
                        while (false);
                        this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 12))) + 1));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt((_31_ + 28), 1);
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
    public final int write32bits(int _30_, long _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeLong((_33_ + 16), _31_);
        sqlite3Put4byte((_33_ + 8), (this._storeInt((_33_ + 12), _32_)));
        _32_ = sqlite3OsWrite((this._loadInt((_33_ + 28))), (_33_ + 8), 4, (this._loadLong((_33_ + 16))));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int addToSavepointBitvecs(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 20), (this._storeInt((_32_ + 16), 0)));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 20))) >= (this._loadInt(((this._loadInt((_32_ + 28))) + 96)))) {
                    break label$1;
                }
                _31_ = this._storeInt((_32_ + 12), ((this._loadInt(((this._loadInt((_32_ + 28))) + 92))) + ((this._loadInt((_32_ + 20))) * 48)));
                label$2:
                do {
                    if (((this._loadInt((_32_ + 24))) & 4294967295L) > ((this._loadInt((_31_ + 20))) & 4294967295L)) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 16), ((sqlite3BitvecSet((this._loadInt(((this._loadInt((_32_ + 12))) + 16))), (this._loadInt((_32_ + 24))))) | (this._loadInt((_32_ + 16)))));
                }
                while (false);
                this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1));
                continue label$0;
            }
        }
        while (false);
        _31_ = this._loadInt((_32_ + 16));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int subjournalPage(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_31_ + 24), 0);
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt((_31_ + 20), (this._loadInt(((this._loadInt((_31_ + 28))) + 16))))) + 5))) == 2) {
                break label$0;
            }
            if ((this._storeInt((_31_ + 24), (openSubJournal((this._loadInt((_31_ + 20))))))) != 0) {
                break label$0;
            }
            this._storeInt((_31_ + 16), (this._loadInt((this._loadInt((_31_ + 28))))));
            this._storeLong((_31_ + 8), (((this._loadInt(((_30_ = this._loadInt((_31_ + 20))) + 52))) * ((this._loadInt((_30_ + 128))) + 4)) & 4294967295L));
            this._storeInt((_31_ + 4), (this._loadInt((_31_ + 16))));
            if ((this._storeInt((_31_ + 24), (write32bits((this._loadInt(((this._loadInt((_31_ + 20))) + 68))), (this._loadLong((_31_ + 8))), (this._loadInt(((this._loadInt((_31_ + 28))) + 12))))))) != 0) {
                break label$0;
            }
            this._storeInt((_31_ + 24), (sqlite3OsWrite((this._loadInt(((_30_ = this._loadInt((_31_ + 20))) + 68))), (this._loadInt((_31_ + 4))), (this._loadInt((_30_ + 128))), ((this._loadLong((_31_ + 8))) + 4L))));
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_31_ + 24))) != 0) {
                break label$1;
            }
            this._storeInt(((_30_ = this._loadInt((_31_ + 20))) + 52), ((this._loadInt((_30_ + 52))) + 1));
            this._storeInt((_31_ + 24), (addToSavepointBitvecs(_30_, (this._loadInt(((this._loadInt((_31_ + 28))) + 12))))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 24));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final int openSubJournal(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_31_ + 8), 0);
        label$0:
        do {
            if ((this._loadInt((this._loadInt(((this._loadInt((_31_ + 12))) + 68))))) != 0) {
                break label$0;
            }
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt8u(((this._loadInt((_31_ + 12))) + 5))) == 4) {
                        break label$2;
                    }
                    if ((this._loadInt8u(((this._loadInt((_31_ + 12))) + 21))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                sqlite3MemJournalOpen((this._loadInt(((this._loadInt((_31_ + 12))) + 68))));
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 8), (pagerOpentemp((_30_ = this._loadInt((_31_ + 12))), (this._loadInt((_30_ + 68))), 8192)));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int pagerOpentemp(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        _32_ = this._storeInt((_33_ + 4), ((this._storeInt((_33_ + 4), _32_)) | 30));
        _32_ = this._storeInt(_33_, (sqlite3OsOpen((this._loadInt((this._loadInt((_33_ + 12))))), 0, (this._loadInt((_33_ + 8))), _32_, 0)));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int writeJournalHdr(int _30_)
    {
        int _31_ = 0;
        long _32_ = 0L;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        _30_ = this._storeInt((_31_ + 24), 0);
        this._storeInt((_31_ + 20), (this._loadInt(((this._loadInt((_31_ + 28))) + 164))));
        label$0:
        do {
            if (((this._storeInt((_31_ + 16), (this._loadInt(((this._loadInt((_31_ + 28))) + 128))))) & 4294967295L) <= ((this._loadInt(((this._loadInt((_31_ + 28))) + 124))) & 4294967295L)) {
                break label$0;
            }
            this._storeInt((_31_ + 16), (this._loadInt(((this._loadInt((_31_ + 28))) + 124))));
        }
        while (false);
        this._storeInt((_31_ + 8), _30_);
        label$2:
        do {
            label$1:
            while (true) {
                if ((this._loadInt((_31_ + 8))) >= (this._loadInt(((this._loadInt((_31_ + 28))) + 96)))) {
                    break label$2;
                }
                label$3:
                do {
                    if ((this._loadLong((((this._loadInt(((this._loadInt((_31_ + 28))) + 92))) + ((this._loadInt((_31_ + 8))) * 48)) + 8))) != 0L) {
                        break label$3;
                    }
                    this._storeLong((((this._loadInt(((_30_ = this._loadInt((_31_ + 28))) + 92))) + ((this._loadInt((_31_ + 8))) * 48)) + 8), (this._loadLong((_30_ + 72))));
                }
                while (false);
                this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) + 1));
                continue label$1;
            }
        }
        while (false);
        _32_ = journalHdrOffset((this._loadInt((_31_ + 28))));
        this._storeLong(((_30_ = this._loadInt((_31_ + 28))) + 72), (this._storeLong((_30_ + 80), _32_)));
        label$4:
        do {
            label$5:
            do {
                label$6:
                do {
                    if ((this._loadInt8u((_30_ + 8))) != 0) {
                        break label$6;
                    }
                    if ((this._loadInt8u(((this._loadInt((_31_ + 28))) + 5))) == 4) {
                        break label$6;
                    }
                    if (((sqlite3OsDeviceCharacteristics((this._loadInt(((this._loadInt((_31_ + 28))) + 60))))) & 512) == 0) {
                        break label$5;
                    }
                }
                while (false);
                memcpy((this._loadInt((_31_ + 20))), 29376, 8);
                sqlite3Put4byte(((this._loadInt((_31_ + 20))) + 8), -1);
                break label$4;
            }
            while (false);
            memset((this._loadInt((_31_ + 20))), 0, 12);
        }
        while (false);
        sqlite3_randomness(4, ((this._loadInt((_31_ + 28))) + 48));
        sqlite3Put4byte(((this._loadInt((_31_ + 20))) + 12), (this._loadInt(((this._loadInt((_31_ + 28))) + 48))));
        sqlite3Put4byte(((this._loadInt((_31_ + 20))) + 16), (this._loadInt(((this._loadInt((_31_ + 28))) + 28))));
        sqlite3Put4byte(((this._loadInt((_31_ + 20))) + 20), (this._loadInt(((this._loadInt((_31_ + 28))) + 124))));
        sqlite3Put4byte(((this._loadInt((_31_ + 20))) + 24), (this._loadInt(((this._loadInt((_31_ + 28))) + 128))));
        memset(((this._loadInt((_31_ + 20))) + 28), 0, ((this._loadInt((_31_ + 16))) + -28));
        this._storeInt((_31_ + 12), 0);
        label$8:
        do {
            label$7:
            while (true) {
                _30_ = 0;
                label$9:
                do {
                    if ((this._loadInt((_31_ + 24))) != 0) {
                        break label$9;
                    }
                    _30_ = (((this._loadInt((_31_ + 12))) & 4294967295L) < ((this._loadInt(((this._loadInt((_31_ + 28))) + 124))) & 4294967295L)) ? 1 : 0;
                }
                while (false);
                if (_30_ == 0) {
                    break label$8;
                }
                this._storeInt((_31_ + 24), (sqlite3OsWrite((this._loadInt(((_30_ = this._loadInt((_31_ + 28))) + 64))), (this._loadInt((_31_ + 20))), (this._loadInt((_31_ + 16))), (this._loadLong((_30_ + 72))))));
                this._storeLong(((_30_ = this._loadInt((_31_ + 28))) + 72), ((this._loadLong((_30_ + 72))) + ((_30_ = this._loadInt((_31_ + 16))) & 4294967295L)));
                this._storeInt((_31_ + 12), (_30_ + (this._loadInt((_31_ + 12)))));
                continue label$7;
            }
        }
        while (false);
        _30_ = this._loadInt((_31_ + 24));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final int sqlite3OsDeviceCharacteristics(int _30_)
    {
        int _31_ = 0;
        _30_ = this._iiTable[this._tableIndices[this._loadInt(((this._loadInt((_30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)))) + 48))]].invoke(_30_);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int ptrmapGet(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_34_ + 36), _31_);
        this._storeInt((_34_ + 32), _32_);
        this._storeInt((_34_ + 28), _33_);
        _33_ = this._storeInt((_34_ + 20), (ptrmapPageno((this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 36))))));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_34_ + 8), (sqlite3PagerAcquire((this._loadInt((this._loadInt((_34_ + 40))))), _33_, (_34_ + 24), 0)))) == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 44), (this._loadInt((_34_ + 8))));
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 16), (sqlite3PagerGetData((this._loadInt((_34_ + 24))))));
            label$2:
            do {
                label$3:
                do {
                    if ((this._storeInt((_34_ + 12), ((((this._loadInt((_34_ + 36))) - (this._loadInt((_34_ + 20)))) * 5) + -5))) <= -1) {
                        break label$3;
                    }
                    this._storeInt8((this._loadInt((_34_ + 32))), (this._loadInt8u(((this._loadInt((_34_ + 16))) + (this._loadInt((_34_ + 12)))))));
                    label$4:
                    do {
                        if ((this._loadInt((_34_ + 28))) == 0) {
                            break label$4;
                        }
                        _33_ = sqlite3Get4byte((((this._loadInt((_34_ + 16))) + (this._loadInt((_34_ + 12)))) + 1));
                        this._storeInt((this._loadInt((_34_ + 28))), _33_);
                    }
                    while (false);
                    sqlite3PagerUnref((this._loadInt((_34_ + 24))));
                    label$5:
                    do {
                        if ((this._loadInt8u((this._loadInt((_34_ + 32))))) < 1) {
                            break label$5;
                        }
                        if ((this._loadInt8u((this._loadInt((_34_ + 32))))) < 6) {
                            break label$2;
                        }
                    }
                    while (false);
                    this._storeInt((_34_ + 44), (sqlite3CorruptError(48352)));
                    break label$0;
                }
                while (false);
                sqlite3PagerUnref((this._loadInt((_34_ + 24))));
                this._storeInt((_34_ + 44), (sqlite3CorruptError(48344)));
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 44), 0);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int allocateBtreePage(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 112))) + 104), _30_);
        this._storeInt((_35_ + 100), _31_);
        this._storeInt((_35_ + 96), _32_);
        this._storeInt((_35_ + 92), _33_);
        this._storeInt8((_35_ + 91), _34_);
        this._storeInt((_35_ + 64), (this._storeInt((_35_ + 68), 0)));
        this._storeInt((_35_ + 84), (this._loadInt(((this._loadInt((_35_ + 104))) + 12))));
        this._storeInt((_35_ + 60), (btreePagecount((this._loadInt((_35_ + 104))))));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_35_ + 76), (sqlite3Get4byte(((this._loadInt(((this._loadInt((_35_ + 84))) + 64))) + 36))))) & 4294967295L) < ((this._loadInt((_35_ + 60))) & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((_35_ + 108), (sqlite3CorruptError(52287)));
                break label$0;
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
                                label$7:
                                do {
                                    label$8:
                                    do {
                                        label$9:
                                        do {
                                            label$10:
                                            do {
                                                if ((this._loadInt((_35_ + 76))) == 0) {
                                                    break label$10;
                                                }
                                                this._storeInt8((_35_ + 55), 0);
                                                if ((this._loadInt8u((_35_ + 91))) == 0) {
                                                    break label$8;
                                                }
                                                if (((this._loadInt((_35_ + 92))) & 4294967295L) > ((this._loadInt((_35_ + 60))) & 4294967295L)) {
                                                    break label$8;
                                                }
                                                if ((this._storeInt((_35_ + 80), (ptrmapGet((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 92))), (_35_ + 54), 0)))) == 0) {
                                                    break label$9;
                                                }
                                                this._storeInt((_35_ + 108), (this._loadInt((_35_ + 80))));
                                                break label$0;
                                            }
                                            while (false);
                                            label$11:
                                            do {
                                                if ((this._storeInt((_35_ + 80), (sqlite3PagerWrite((this._loadInt(((this._loadInt(((this._loadInt((_35_ + 104))) + 12))) + 68))))))) == 0) {
                                                    break label$11;
                                                }
                                                this._storeInt((_35_ + 108), (this._loadInt((_35_ + 80))));
                                                break label$0;
                                            }
                                            while (false);
                                            this._storeInt(((_34_ = this._loadInt((_35_ + 104))) + 48), ((_33_ = this._loadInt((_34_ + 48))) + 1));
                                            label$12:
                                            do {
                                                if (_33_ != ((this._loadInt((0 + 22332))) / (this._loadInt((_34_ + 36))))) {
                                                    break label$12;
                                                }
                                                this._storeInt(((_34_ = this._loadInt((_35_ + 104))) + 48), ((this._loadInt((_34_ + 48))) + 1));
                                            }
                                            while (false);
                                            if ((this._loadInt8u(((this._loadInt((_35_ + 104))) + 21))) == 0) {
                                                break label$6;
                                            }
                                            if ((ptrmapPageno((_34_ = this._loadInt((_35_ + 104))), (this._loadInt((_34_ + 48))))) != (this._loadInt(((this._loadInt((_35_ + 104))) + 48)))) {
                                                break label$6;
                                            }
                                            this._storeInt((_35_ + 12), 0);
                                            label$13:
                                            do {
                                                if ((this._storeInt((_35_ + 80), (btreeGetPage((_34_ = this._loadInt((_35_ + 104))), (this._loadInt((_34_ + 48))), (_35_ + 12), 1)))) != 0) {
                                                    break label$13;
                                                }
                                                this._storeInt((_35_ + 80), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_35_ + 12))) + 68))))));
                                                releasePage((this._loadInt((_35_ + 12))));
                                            }
                                            while (false);
                                            if ((this._loadInt((_35_ + 80))) == 0) {
                                                break label$7;
                                            }
                                            this._storeInt((_35_ + 108), (this._loadInt((_35_ + 80))));
                                            break label$0;
                                        }
                                        while (false);
                                        label$14:
                                        do {
                                            if ((this._loadInt8u((_35_ + 54))) != 2) {
                                                break label$14;
                                            }
                                            this._storeInt8((_35_ + 55), 1);
                                        }
                                        while (false);
                                        this._storeInt((this._loadInt((_35_ + 96))), (this._loadInt((_35_ + 92))));
                                    }
                                    while (false);
                                    label$15:
                                    do {
                                        if ((this._storeInt((_35_ + 80), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_35_ + 84))) + 68))))))) == 0) {
                                            break label$15;
                                        }
                                        this._storeInt((_35_ + 108), (this._loadInt((_35_ + 80))));
                                        break label$0;
                                    }
                                    while (false);
                                    sqlite3Put4byte(((this._loadInt(((this._loadInt((_35_ + 84))) + 64))) + 36), ((this._loadInt((_35_ + 76))) + -1));
                                    label$16:
                                    do {
                                        label$18:
                                        do {
                                            label$17:
                                            while (true) {
                                                label$19:
                                                do {
                                                    label$20:
                                                    do {
                                                        if ((this._storeInt((_35_ + 64), (this._loadInt((_35_ + 68))))) == 0) {
                                                            break label$20;
                                                        }
                                                        this._storeInt((_35_ + 56), (sqlite3Get4byte((this._loadInt(((this._loadInt((_35_ + 64))) + 64))))));
                                                        break label$19;
                                                    }
                                                    while (false);
                                                    this._storeInt((_35_ + 56), (sqlite3Get4byte(((this._loadInt(((this._loadInt((_35_ + 84))) + 64))) + 32))));
                                                }
                                                while (false);
                                                label$21:
                                                do {
                                                    label$22:
                                                    do {
                                                        if (((this._loadInt((_35_ + 56))) & 4294967295L) <= ((this._loadInt((_35_ + 60))) & 4294967295L)) {
                                                            break label$22;
                                                        }
                                                        this._storeInt((_35_ + 80), (sqlite3CorruptError(52332)));
                                                        break label$21;
                                                    }
                                                    while (false);
                                                    this._storeInt((_35_ + 80), (btreeGetPage((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 56))), (_35_ + 68), 0)));
                                                }
                                                while (false);
                                                if ((this._loadInt((_35_ + 80))) != 0) {
                                                    break label$18;
                                                }
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
                                                                            if ((this._storeInt((_35_ + 72), (sqlite3Get4byte(((this._loadInt(((this._loadInt((_35_ + 68))) + 64))) + 4))))) != 0) {
                                                                                break label$29;
                                                                            }
                                                                            if ((this._loadInt8u((_35_ + 55))) == 0) {
                                                                                break label$28;
                                                                            }
                                                                        }
                                                                        while (false);
                                                                        if (((this._loadInt((_35_ + 72))) & 4294967295L) > ((((this._loadInt(((this._loadInt((_35_ + 104))) + 40))) >>> 2) + -2) & 4294967295L)) {
                                                                            break label$16;
                                                                        }
                                                                        label$30:
                                                                        do {
                                                                            if ((this._loadInt8u((_35_ + 55))) == 0) {
                                                                                break label$30;
                                                                            }
                                                                            if ((this._loadInt((_35_ + 92))) != (this._loadInt((_35_ + 56)))) {
                                                                                break label$30;
                                                                            }
                                                                            this._storeInt((this._loadInt((_35_ + 100))), (this._loadInt((_35_ + 68))));
                                                                            _34_ = this._storeInt8((_35_ + 55), 0);
                                                                            if ((this._storeInt((_35_ + 80), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_35_ + 68))) + 68))))))) != 0) {
                                                                                break label$2;
                                                                            }
                                                                            if ((this._loadInt((_35_ + 72))) == 0) {
                                                                                break label$27;
                                                                            }
                                                                            if (((this._storeInt((_35_ + 44), (sqlite3Get4byte(((this._loadInt(((this._loadInt((_35_ + 68))) + 64))) + 8))))) & 4294967295L) > ((this._loadInt((_35_ + 60))) & 4294967295L)) {
                                                                                break label$4;
                                                                            }
                                                                            if ((this._storeInt((_35_ + 80), (btreeGetPage((this._loadInt((_35_ + 104))), (this._loadInt((_35_ + 44))), (_35_ + 48), _34_)))) != 0) {
                                                                                break label$2;
                                                                            }
                                                                            if ((this._storeInt((_35_ + 80), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_35_ + 48))) + 68))))))) != 0) {
                                                                                break label$3;
                                                                            }
                                                                            memcpy((this._loadInt(((this._loadInt((_35_ + 48))) + 64))), (this._loadInt(((this._loadInt((_35_ + 68))) + 64))), 4);
                                                                            sqlite3Put4byte(((this._loadInt(((this._loadInt((_35_ + 48))) + 64))) + 4), ((this._loadInt((_35_ + 72))) + -1));
                                                                            memcpy(((this._loadInt(((this._loadInt((_35_ + 48))) + 64))) + 8), ((this._loadInt(((this._loadInt((_35_ + 68))) + 64))) + 12), (((this._loadInt((_35_ + 72))) << 2) + -4));
                                                                            releasePage((this._loadInt((_35_ + 48))));
                                                                            if ((this._loadInt((_35_ + 64))) == 0) {
                                                                                break label$26;
                                                                            }
                                                                            if ((this._storeInt((_35_ + 80), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_35_ + 64))) + 68))))))) != 0) {
                                                                                break label$2;
                                                                            }
                                                                            sqlite3Put4byte((this._loadInt(((this._loadInt((_35_ + 64))) + 64))), (this._loadInt((_35_ + 44))));
                                                                            break label$24;
                                                                        }
                                                                        while (false);
                                                                        if ((this._loadInt((_35_ + 72))) == 0) {
                                                                            break label$23;
                                                                        }
                                                                        this._storeInt((_35_ + 32), (this._loadInt(((this._loadInt((_35_ + 68))) + 64))));
                                                                        label$31:
                                                                        do {
                                                                            label$32:
                                                                            do {
                                                                                if ((this._loadInt((_35_ + 92))) == 0) {
                                                                                    break label$32;
                                                                                }
                                                                                this._storeInt((_35_ + 40), 0);
                                                                                this._storeInt((_35_ + 24), (sqlite3AbsInt32(((sqlite3Get4byte(((this._loadInt((_35_ + 32))) + 8))) - (this._loadInt((_35_ + 92)))))));
                                                                                _34_ = this._storeInt((_35_ + 28), 1);
                                                                                label$33:
                                                                                while (true) {
                                                                                    if (((this._loadInt((_35_ + 28))) & 4294967295L) >= ((this._loadInt((_35_ + 72))) & 4294967295L)) {
                                                                                        break label$31;
                                                                                    }
                                                                                    label$35:
                                                                                    do {
                                                                                        if ((this._storeInt((_35_ + 20), (sqlite3AbsInt32(((sqlite3Get4byte((((this._loadInt((_35_ + 32))) + ((this._loadInt((_35_ + 28))) << 2)) + 8))) - (this._loadInt((_35_ + 92)))))))) >= (this._loadInt((_35_ + 24)))) {
                                                                                            break label$35;
                                                                                        }
                                                                                        this._storeInt((_35_ + 40), (this._loadInt((_35_ + 28))));
                                                                                        this._storeInt((_35_ + 24), (this._loadInt((_35_ + 20))));
                                                                                    }
                                                                                    while (false);
                                                                                    this._storeInt((_35_ + 28), ((this._loadInt((_35_ + 28))) + _34_));
                                                                                    continue label$33;
                                                                                }
                                                                            }
                                                                            while (false);
                                                                            this._storeInt((_35_ + 40), 0);
                                                                        }
                                                                        while (false);
                                                                        if (((this._storeInt((_35_ + 36), (sqlite3Get4byte((((this._loadInt((_35_ + 32))) + ((this._loadInt((_35_ + 40))) << 2)) + 8))))) & 4294967295L) > ((this._loadInt((_35_ + 60))) & 4294967295L)) {
                                                                            break label$5;
                                                                        }
                                                                        label$36:
                                                                        do {
                                                                            if ((this._loadInt8u((_35_ + 55))) == 0) {
                                                                                break label$36;
                                                                            }
                                                                            if ((this._loadInt((_35_ + 36))) != (this._loadInt((_35_ + 92)))) {
                                                                                break label$23;
                                                                            }
                                                                        }
                                                                        while (false);
                                                                        this._storeInt((this._loadInt((_35_ + 96))), (this._loadInt((_35_ + 36))));
                                                                        if ((this._storeInt((_35_ + 80), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_35_ + 68))) + 68))))))) != 0) {
                                                                            break label$2;
                                                                        }
                                                                        label$37:
                                                                        do {
                                                                            if (((this._loadInt((_35_ + 40))) & 4294967295L) >= (((this._loadInt((_35_ + 72))) + -1) & 4294967295L)) {
                                                                                break label$37;
                                                                            }
                                                                            memcpy((((_34_ = this._loadInt((_35_ + 32))) + ((this._loadInt((_35_ + 40))) << 2)) + 8), ((_34_ + ((this._loadInt((_35_ + 72))) << 2)) + 4), 4);
                                                                        }
                                                                        while (false);
                                                                        sqlite3Put4byte(((this._loadInt((_35_ + 32))) + 4), ((this._loadInt((_35_ + 72))) + -1));
                                                                        _34_ = this._storeInt((_35_ + 16), (((btreeGetHasContent((this._loadInt((_35_ + 104))), (this._loadInt((this._loadInt((_35_ + 96))))))) == 0) ? 1 : 0));
                                                                        label$38:
                                                                        do {
                                                                            if ((this._storeInt((_35_ + 80), (btreeGetPage((this._loadInt((_35_ + 104))), (this._loadInt((this._loadInt((_35_ + 96))))), (this._loadInt((_35_ + 100))), _34_)))) != 0) {
                                                                                break label$38;
                                                                            }
                                                                            if ((this._storeInt((_35_ + 80), (sqlite3PagerWrite((this._loadInt(((this._loadInt((this._loadInt((_35_ + 100))))) + 68))))))) == 0) {
                                                                                break label$38;
                                                                            }
                                                                            releasePage((this._loadInt((this._loadInt((_35_ + 100))))));
                                                                        }
                                                                        while (false);
                                                                        this._storeInt8((_35_ + 55), 0);
                                                                        break label$23;
                                                                    }
                                                                    while (false);
                                                                    if ((this._storeInt((_35_ + 80), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_35_ + 68))) + 68))))))) != 0) {
                                                                        break label$2;
                                                                    }
                                                                    this._storeInt((this._loadInt((_35_ + 96))), (this._loadInt((_35_ + 56))));
                                                                    memcpy(((this._loadInt(((this._loadInt((_35_ + 84))) + 64))) + 32), (this._loadInt(((this._loadInt((_35_ + 68))) + 64))), 4);
                                                                    this._storeInt((this._loadInt((_35_ + 100))), (this._loadInt((_35_ + 68))));
                                                                    this._storeInt((_35_ + 68), 0);
                                                                    break label$23;
                                                                }
                                                                while (false);
                                                                if ((this._loadInt((_35_ + 64))) == 0) {
                                                                    break label$25;
                                                                }
                                                                if ((this._storeInt((_35_ + 80), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_35_ + 64))) + 68))))))) != 0) {
                                                                    break label$2;
                                                                }
                                                                memcpy((this._loadInt(((this._loadInt((_35_ + 64))) + 64))), (this._loadInt(((this._loadInt((_35_ + 68))) + 64))), 4);
                                                                break label$24;
                                                            }
                                                            while (false);
                                                            sqlite3Put4byte(((this._loadInt(((this._loadInt((_35_ + 84))) + 64))) + 32), (this._loadInt((_35_ + 44))));
                                                            break label$24;
                                                        }
                                                        while (false);
                                                        memcpy(((this._loadInt(((this._loadInt((_35_ + 84))) + 64))) + 32), (this._loadInt(((this._loadInt((_35_ + 68))) + 64))), 4);
                                                    }
                                                    while (false);
                                                    this._storeInt((_35_ + 68), _34_);
                                                }
                                                while (false);
                                                releasePage((this._loadInt((_35_ + 64))));
                                                this._storeInt((_35_ + 64), 0);
                                                if ((this._loadInt8u((_35_ + 55))) != 0) {
                                                    continue label$17;
                                                }
                                                break label$2;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_35_ + 68), 0);
                                        break label$2;
                                    }
                                    while (false);
                                    this._storeInt((_35_ + 80), (sqlite3CorruptError(52358)));
                                    break label$2;
                                }
                                while (false);
                                this._storeInt(((_34_ = this._loadInt((_35_ + 104))) + 48), ((_33_ = this._loadInt((_34_ + 48))) + 1));
                                if (_33_ != ((this._loadInt((0 + 22332))) / (this._loadInt((_34_ + 36))))) {
                                    break label$6;
                                }
                                this._storeInt(((_34_ = this._loadInt((_35_ + 104))) + 48), ((this._loadInt((_34_ + 48))) + 1));
                            }
                            while (false);
                            sqlite3Put4byte(((this._loadInt(((this._loadInt(((_34_ = this._loadInt((_35_ + 104))) + 12))) + 64))) + 28), (this._loadInt((_34_ + 48))));
                            this._storeInt((_34_ = this._loadInt((_35_ + 96))), (this._loadInt(((this._loadInt((_35_ + 104))) + 48))));
                            label$39:
                            do {
                                if ((this._storeInt((_35_ + 80), (btreeGetPage((this._loadInt((_35_ + 104))), (this._loadInt(_34_)), (this._loadInt((_35_ + 100))), 1)))) == 0) {
                                    break label$39;
                                }
                                this._storeInt((_35_ + 108), (this._loadInt((_35_ + 80))));
                                break label$0;
                            }
                            while (false);
                            if ((this._storeInt((_35_ + 80), (sqlite3PagerWrite((this._loadInt(((this._loadInt((this._loadInt((_35_ + 100))))) + 68))))))) == 0) {
                                break label$2;
                            }
                            releasePage((this._loadInt((this._loadInt((_35_ + 100))))));
                            break label$2;
                        }
                        while (false);
                        this._storeInt((_35_ + 80), (sqlite3CorruptError(52445)));
                        break label$2;
                    }
                    while (false);
                    this._storeInt((_35_ + 80), (sqlite3CorruptError(52390)));
                    break label$2;
                }
                while (false);
                releasePage((this._loadInt((_35_ + 48))));
            }
            while (false);
            releasePage((this._loadInt((_35_ + 68))));
            releasePage((this._loadInt((_35_ + 64))));
            label$40:
            do {
                label$41:
                do {
                    if ((this._loadInt((_35_ + 80))) == 0) {
                        break label$41;
                    }
                    this._storeInt((this._loadInt((_35_ + 100))), 0);
                    break label$40;
                }
                while (false);
                label$42:
                do {
                    if ((sqlite3PagerPageRefcount((this._loadInt(((this._loadInt((this._loadInt((_35_ + 100))))) + 68))))) < 2) {
                        break label$42;
                    }
                    releasePage((this._loadInt((this._loadInt((_35_ + 100))))));
                    this._storeInt((_35_ + 108), (sqlite3CorruptError(52523)));
                    break label$0;
                }
                while (false);
                this._storeInt8((this._loadInt((this._loadInt((_35_ + 100))))), 0);
            }
            while (false);
            this._storeInt((_35_ + 108), (this._loadInt((_35_ + 80))));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 108));
        this._storeInt((0 + 4), (_35_ + 112));
        return _34_;
    }

    @Override()
    public final void releasePage(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) == 0) {
                break label$0;
            }
            sqlite3PagerUnref((this._loadInt(((this._loadInt((_31_ + 12))) + 68))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int btreeGetPage(int _30_, int _31_, int _32_, int _33_)
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
                if ((this._storeInt((_34_ + 8), (sqlite3PagerAcquire((this._loadInt((this._loadInt((_34_ + 24))))), (this._loadInt((_34_ + 20))), (_34_ + 4), _33_)))) == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 28), (this._loadInt((_34_ + 8))));
                break label$0;
            }
            while (false);
            _33_ = btreePageFromDbPage((this._loadInt((_34_ + 4))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 24))));
            this._storeInt((this._loadInt((_34_ + 16))), _33_);
            this._storeInt((_34_ + 28), 0);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 28));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final int relocatePage(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_)
    {
        int _36_ = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_36_ + 36), _31_);
        this._storeInt8((_36_ + 35), _32_);
        this._storeInt((_36_ + 28), _33_);
        this._storeInt((_36_ + 24), _34_);
        this._storeInt((_36_ + 20), _35_);
        this._storeInt((_36_ + 12), (this._loadInt(((this._loadInt((_36_ + 36))) + 72))));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_36_ + 4), (sqlite3PagerMovepage((this._storeInt((_36_ + 8), (this._loadInt((this._loadInt((_36_ + 40))))))), (this._loadInt(((this._loadInt((_36_ + 36))) + 68))), (this._loadInt((_36_ + 24))), (this._loadInt((_36_ + 20))))))) == 0) {
                    break label$1;
                }
                this._storeInt((_36_ + 44), (this._loadInt((_36_ + 4))));
                break label$0;
            }
            while (false);
            this._storeInt(((this._loadInt((_36_ + 36))) + 72), (this._loadInt((_36_ + 24))));
            label$2:
            do {
                label$3:
                do {
                    label$4:
                    do {
                        if ((this._loadInt8u((_36_ + 35))) == 5) {
                            break label$4;
                        }
                        if ((this._loadInt8u((_36_ + 35))) != 1) {
                            break label$3;
                        }
                    }
                    while (false);
                    if ((this._storeInt((_36_ + 4), (setChildPtrmaps((this._loadInt((_36_ + 36))))))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_36_ + 44), (this._loadInt((_36_ + 4))));
                    break label$0;
                }
                while (false);
                if ((this._storeInt(_36_, (sqlite3Get4byte((this._loadInt(((this._loadInt((_36_ + 36))) + 64))))))) == 0) {
                    break label$2;
                }
                ptrmapPut((this._loadInt((_36_ + 40))), (this._loadInt(_36_)), 4, (this._loadInt((_36_ + 24))), (_36_ + 4));
                if ((this._loadInt((_36_ + 4))) == 0) {
                    break label$2;
                }
                this._storeInt((_36_ + 44), (this._loadInt((_36_ + 4))));
                break label$0;
            }
            while (false);
            label$5:
            do {
                if ((this._loadInt8u((_36_ + 35))) == 1) {
                    break label$5;
                }
                label$6:
                do {
                    if ((this._storeInt((_36_ + 4), (btreeGetPage((this._loadInt((_36_ + 40))), (this._loadInt((_36_ + 28))), (_36_ + 16), 0)))) == 0) {
                        break label$6;
                    }
                    this._storeInt((_36_ + 44), (this._loadInt((_36_ + 4))));
                    break label$0;
                }
                while (false);
                label$7:
                do {
                    if ((this._storeInt((_36_ + 4), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_36_ + 16))) + 68))))))) == 0) {
                        break label$7;
                    }
                    releasePage((this._loadInt((_36_ + 16))));
                    this._storeInt((_36_ + 44), (this._loadInt((_36_ + 4))));
                    break label$0;
                }
                while (false);
                this._storeInt((_36_ + 4), (modifyPagePointer((this._loadInt((_36_ + 16))), (this._loadInt((_36_ + 12))), (this._loadInt((_36_ + 24))), (this._loadInt8u((_36_ + 35))))));
                releasePage((this._loadInt((_36_ + 16))));
                if ((this._loadInt((_36_ + 4))) != 0) {
                    break label$5;
                }
                ptrmapPut((this._loadInt((_36_ + 40))), (this._loadInt((_36_ + 24))), (this._loadInt8u((_36_ + 35))), (this._loadInt((_36_ + 28))), (_36_ + 4));
            }
            while (false);
            this._storeInt((_36_ + 44), (this._loadInt((_36_ + 4))));
        }
        while (false);
        _35_ = this._loadInt((_36_ + 44));
        this._storeInt((0 + 4), (_36_ + 48));
        return _35_;
    }

    @Override()
    public final int sqlite3PagerMovepage(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_34_ + 36), _31_);
        this._storeInt((_34_ + 32), _32_);
        this._storeInt((_34_ + 28), _33_);
        this._storeInt((_34_ + 20), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_34_ + 40))) + 14))) == 0) {
                    break label$1;
                }
                if ((this._storeInt((_34_ + 16), (sqlite3PagerWrite((this._loadInt((_34_ + 36))))))) == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 44), (this._loadInt((_34_ + 16))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt16u(((this._loadInt((_34_ + 36))) + 20))) & 2) == 0) {
                    break label$2;
                }
                if ((subjRequiresPage((this._loadInt((_34_ + 36))))) == 0) {
                    break label$2;
                }
                if ((this._storeInt((_34_ + 16), (subjournalPage((this._loadInt((_34_ + 36))))))) == 0) {
                    break label$2;
                }
                this._storeInt((_34_ + 44), (this._loadInt((_34_ + 16))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt16u(((this._loadInt((_34_ + 36))) + 20))) & 4) == 0) {
                    break label$3;
                }
                if ((this._loadInt((_34_ + 28))) != 0) {
                    break label$3;
                }
                this._storeInt((_34_ + 20), (this._loadInt(((this._loadInt((_34_ + 36))) + 12))));
            }
            while (false);
            this._storeInt16(((_33_ = this._loadInt((_34_ + 36))) + 20), ((this._loadInt16u((_33_ + 20))) & 65531));
            label$4:
            do {
                if ((this._storeInt((_34_ + 24), (pager_lookup((this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 32))))))) == 0) {
                    break label$4;
                }
                this._storeInt16(((_33_ = this._loadInt((_34_ + 36))) + 20), ((this._loadInt16u((_33_ + 20))) | ((this._loadInt16u(((this._loadInt((_34_ + 24))) + 20))) & 4)));
                label$5:
                do {
                    if ((this._loadInt8u(((this._loadInt((_34_ + 40))) + 14))) == 0) {
                        break label$5;
                    }
                    sqlite3PcacheMove((this._loadInt((_34_ + 24))), ((this._loadInt(((this._loadInt((_34_ + 40))) + 24))) + 1));
                    break label$4;
                }
                while (false);
                sqlite3PcacheDrop((this._loadInt((_34_ + 24))));
            }
            while (false);
            this._storeInt((_34_ + 12), (this._loadInt(((this._loadInt((_34_ + 36))) + 12))));
            sqlite3PcacheMove((this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 32))));
            sqlite3PcacheMakeDirty((this._loadInt((_34_ + 36))));
            label$6:
            do {
                if ((this._loadInt8u(((this._loadInt((_34_ + 40))) + 14))) == 0) {
                    break label$6;
                }
                sqlite3PcacheMove((this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 12))));
                sqlite3PagerUnref((this._loadInt((_34_ + 24))));
            }
            while (false);
            label$7:
            do {
                if ((this._loadInt((_34_ + 20))) == 0) {
                    break label$7;
                }
                label$8:
                do {
                    if ((this._storeInt((_34_ + 16), (sqlite3PagerAcquire((this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 20))), (_34_ + 8), 0)))) == 0) {
                        break label$8;
                    }
                    label$9:
                    do {
                        if (((this._loadInt((_34_ + 20))) & 4294967295L) > ((this._loadInt(((this._loadInt((_34_ + 40))) + 28))) & 4294967295L)) {
                            break label$9;
                        }
                        sqlite3BitvecClear((this._loadInt(((_33_ = this._loadInt((_34_ + 40))) + 56))), (this._loadInt((_34_ + 20))), (this._loadInt((_33_ + 164))));
                    }
                    while (false);
                    this._storeInt((_34_ + 44), (this._loadInt((_34_ + 16))));
                    break label$0;
                }
                while (false);
                this._storeInt16(((_33_ = this._loadInt((_34_ + 8))) + 20), ((this._loadInt16u((_33_ + 20))) | 4));
                sqlite3PcacheMakeDirty(_33_);
                sqlite3PagerUnref((this._loadInt((_34_ + 8))));
            }
            while (false);
            this._storeInt((_34_ + 44), 0);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int setChildPtrmaps(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 28), (this._loadInt(((this._storeInt((_31_ + 44), _30_)) + 60))));
        this._storeInt8((_31_ + 27), (this._loadInt8u((this._loadInt((_31_ + 44))))));
        this._storeInt((_31_ + 20), (this._loadInt(((this._loadInt((_31_ + 44))) + 72))));
        label$0:
        do {
            if ((this._storeInt((_31_ + 32), (btreeInitPage((this._loadInt((_31_ + 44))))))) != 0) {
                break label$0;
            }
            this._storeInt((_31_ + 36), (this._loadInt16u(((this._loadInt((_31_ + 44))) + 16))));
            this._storeInt((_31_ + 40), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_31_ + 40))) >= (this._loadInt((_31_ + 36)))) {
                        break label$2;
                    }
                    _30_ = this._storeInt((_31_ + 16), ((_32_ = this._loadInt(((_30_ = this._loadInt((_31_ + 44))) + 64))) + ((this._loadInt16u((_30_ + 18))) & (((this._loadInt8u((_30_ = _32_ + ((this._loadInt16u((_30_ + 12))) + ((this._loadInt((_31_ + 40))) << 1))))) << 8) | (this._loadInt8u((_30_ + 1)))))));
                    ptrmapPutOvflPtr((this._loadInt((_31_ + 44))), _30_, (_31_ + 32));
                    label$3:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_31_ + 44))) + 3))) != 0) {
                            break label$3;
                        }
                        _30_ = this._storeInt((_31_ + 12), (sqlite3Get4byte((this._loadInt((_31_ + 16))))));
                        ptrmapPut((this._loadInt((_31_ + 28))), _30_, 5, (this._loadInt((_31_ + 20))), (_31_ + 32));
                    }
                    while (false);
                    this._storeInt((_31_ + 40), ((this._loadInt((_31_ + 40))) + 1));
                    continue label$1;
                }
            }
            while (false);
            if ((this._loadInt8u(((this._loadInt((_31_ + 44))) + 3))) != 0) {
                break label$0;
            }
            _30_ = this._storeInt((_31_ + 8), (sqlite3Get4byte((((this._loadInt(((_30_ = this._loadInt((_31_ + 44))) + 64))) + (this._loadInt8u((_30_ + 5)))) + 8))));
            ptrmapPut((this._loadInt((_31_ + 28))), _30_, 5, (this._loadInt((_31_ + 20))), (_31_ + 32));
        }
        while (false);
        this._storeInt8((this._loadInt((_31_ + 44))), (this._loadInt8u((_31_ + 27))));
        _30_ = this._loadInt((_31_ + 32));
        this._storeInt((0 + 4), (_31_ + 48));
        return _30_;
    }

    @Override()
    public final void ptrmapPut(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_35_ + 40), _31_);
        this._storeInt8((_35_ + 39), _32_);
        this._storeInt((_35_ + 32), _33_);
        label$0:
        do {
            if ((this._loadInt((this._storeInt((_35_ + 28), _34_)))) != 0) {
                break label$0;
            }
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_35_ + 40))) == 0) {
                        break label$2;
                    }
                    _34_ = this._storeInt((_35_ + 16), (ptrmapPageno((this._loadInt((_35_ + 44))), (this._loadInt((_35_ + 40))))));
                    if ((this._storeInt((_35_ + 8), (sqlite3PagerAcquire((this._loadInt((this._loadInt((_35_ + 44))))), _34_, (_35_ + 24), 0)))) == 0) {
                        break label$1;
                    }
                    this._storeInt((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 8))));
                    break label$0;
                }
                while (false);
                _34_ = sqlite3CorruptError(48288);
                this._storeInt((this._loadInt((_35_ + 28))), _34_);
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if ((this._storeInt((_35_ + 12), ((((this._loadInt((_35_ + 40))) - (this._loadInt((_35_ + 16)))) * 5) + -5))) <= -1) {
                        break label$4;
                    }
                    _34_ = this._storeInt((_35_ + 20), (sqlite3PagerGetData((this._loadInt((_35_ + 24))))));
                    label$5:
                    do {
                        if ((this._loadInt8u((_35_ + 39))) != (this._loadInt8u((_34_ + (this._loadInt((_35_ + 12))))))) {
                            break label$5;
                        }
                        if ((sqlite3Get4byte((((this._loadInt((_35_ + 20))) + (this._loadInt((_35_ + 12)))) + 1))) == (this._loadInt((_35_ + 32)))) {
                            break label$3;
                        }
                    }
                    while (false);
                    _34_ = this._storeInt((_35_ + 8), (sqlite3PagerWrite((this._loadInt((_35_ + 24))))));
                    if ((this._storeInt((this._loadInt((_35_ + 28))), _34_)) != 0) {
                        break label$3;
                    }
                    this._storeInt8((_34_ = (this._loadInt((_35_ + 20))) + (this._loadInt((_35_ + 12)))), (this._loadInt8u((_35_ + 39))));
                    sqlite3Put4byte((_34_ + 1), (this._loadInt((_35_ + 32))));
                    break label$3;
                }
                while (false);
                _34_ = sqlite3CorruptError(48299);
                this._storeInt((this._loadInt((_35_ + 28))), _34_);
            }
            while (false);
            sqlite3PagerUnref((this._loadInt((_35_ + 24))));
        }
        while (false);
        this._storeInt((0 + 4), (_35_ + 48));
        return;
    }

    @Override()
    public final int modifyPagePointer(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_34_ + 52), _31_);
        this._storeInt((_34_ + 48), _32_);
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
                                if ((this._storeInt8((_34_ + 47), _33_)) != 4) {
                                    break label$5;
                                }
                                if ((sqlite3Get4byte((this._loadInt(((this._loadInt((_34_ + 56))) + 64))))) == (this._loadInt((_34_ + 52)))) {
                                    break label$4;
                                }
                                this._storeInt((_34_ + 60), (sqlite3CorruptError(50241)));
                                break label$0;
                            }
                            while (false);
                            this._storeInt8((_34_ + 46), (this._loadInt8u((this._loadInt((_34_ + 56))))));
                            btreeInitPage((this._loadInt((_34_ + 56))));
                            this._storeInt((_34_ + 36), (this._loadInt16u(((this._loadInt((_34_ + 56))) + 16))));
                            this._storeInt((_34_ + 40), 0);
                            label$7:
                            do {
                                label$6:
                                while (true) {
                                    if ((this._loadInt((_34_ + 40))) >= (this._loadInt((_34_ + 36)))) {
                                        break label$2;
                                    }
                                    this._storeInt((_34_ + 32), ((_32_ = this._loadInt(((_33_ = this._loadInt((_34_ + 56))) + 64))) + ((this._loadInt16u((_33_ + 18))) & (((this._loadInt8u((_33_ = _32_ + ((this._loadInt16u((_33_ + 12))) + ((this._loadInt((_34_ + 40))) << 1))))) << 8) | (this._loadInt8u((_33_ + 1)))))));
                                    label$8:
                                    do {
                                        label$9:
                                        do {
                                            if ((this._loadInt8u((_34_ + 47))) != 3) {
                                                break label$9;
                                            }
                                            btreeParseCellPtr((this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 32))), _34_);
                                            if ((this._loadInt16u((_34_ + 24))) == 0) {
                                                break label$8;
                                            }
                                            if ((this._loadInt((_34_ + 52))) != (sqlite3Get4byte(((this._loadInt((_34_ + 32))) + (this._loadInt16u((_34_ + 24))))))) {
                                                break label$8;
                                            }
                                            break label$3;
                                        }
                                        while (false);
                                        if ((sqlite3Get4byte((this._loadInt((_34_ + 32))))) == (this._loadInt((_34_ + 52)))) {
                                            break label$7;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 40), ((this._loadInt((_34_ + 40))) + 1));
                                    continue label$6;
                                }
                            }
                            while (false);
                            sqlite3Put4byte((this._loadInt((_34_ + 32))), (this._loadInt((_34_ + 48))));
                            break label$2;
                        }
                        while (false);
                        sqlite3Put4byte((this._loadInt(((this._loadInt((_34_ + 56))) + 64))), (this._loadInt((_34_ + 48))));
                        break label$1;
                    }
                    while (false);
                    sqlite3Put4byte(((this._loadInt((_34_ + 32))) + (this._loadInt16u((_34_ + 24)))), (this._loadInt((_34_ + 48))));
                }
                while (false);
                label$10:
                do {
                    if ((this._loadInt((_34_ + 40))) != (this._loadInt((_34_ + 36)))) {
                        break label$10;
                    }
                    label$11:
                    do {
                        label$12:
                        do {
                            if ((this._loadInt8u((_34_ + 47))) != 5) {
                                break label$12;
                            }
                            if ((sqlite3Get4byte((((this._loadInt(((_33_ = this._loadInt((_34_ + 56))) + 64))) + (this._loadInt8u((_33_ + 5)))) + 8))) == (this._loadInt((_34_ + 52)))) {
                                break label$11;
                            }
                        }
                        while (false);
                        this._storeInt((_34_ + 60), (sqlite3CorruptError(50274)));
                        break label$0;
                    }
                    while (false);
                    sqlite3Put4byte((((this._loadInt(((_33_ = this._loadInt((_34_ + 56))) + 64))) + (this._loadInt8u((_33_ + 5)))) + 8), (this._loadInt((_34_ + 48))));
                }
                while (false);
                this._storeInt8((this._loadInt((_34_ + 56))), (this._loadInt8u((_34_ + 46))));
            }
            while (false);
            this._storeInt((_34_ + 60), 0);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 60));
        this._storeInt((0 + 4), (_34_ + 64));
        return _33_;
    }

    @Override()
    public final int btreeInitPage(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_)))) != 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 28), (this._loadInt(((this._loadInt((_31_ + 40))) + 60))));
                this._storeInt8((_31_ + 37), (this._loadInt8u(((this._loadInt((_31_ + 40))) + 5))));
                _30_ = this._storeInt((_31_ + 32), (this._loadInt(((this._loadInt((_31_ + 40))) + 64))));
                label$2:
                do {
                    if ((decodeFlags((this._loadInt((_31_ + 40))), (this._loadInt8u((_30_ + (this._loadInt8u((_31_ + 37)))))))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_31_ + 44), (sqlite3CorruptError(48914)));
                    break label$0;
                }
                while (false);
                this._storeInt16(((_30_ = this._loadInt((_31_ + 40))) + 18), ((this._loadInt(((this._loadInt((_31_ + 28))) + 36))) + -1));
                this._storeInt8((_30_ + 1), 0);
                this._storeInt((_31_ + 24), (this._loadInt(((this._loadInt((_31_ + 28))) + 40))));
                _30_ = this._storeInt16((_31_ + 22), (((this._loadInt8u((_31_ + 37))) + 12) - ((this._loadInt8u(((this._loadInt((_31_ + 40))) + 3))) << 2)));
                this._storeInt16(((this._loadInt((_31_ + 40))) + 12), _30_);
                this._storeInt((_31_ + 12), ((((((this._loadInt8u(((_30_ = (this._loadInt((_31_ + 32))) + (this._loadInt8u((_31_ + 37)))) + 5))) << 8) | (this._loadInt8u((_30_ + 6)))) + -1) & 65535) + 1));
                this._storeInt16(((this._loadInt((_31_ + 40))) + 16), (((this._loadInt8u(((_30_ = (this._loadInt((_31_ + 32))) + (this._loadInt8u((_31_ + 37)))) + 3))) << 8) | (this._loadInt8u((_30_ + 4)))));
                label$3:
                do {
                    if (((this._loadInt16u(((this._loadInt((_31_ + 40))) + 16))) & 4294967295L) <= ((((this._loadInt(((this._loadInt((_31_ + 28))) + 36))) + -8) / 6) & 4294967295L)) {
                        break label$3;
                    }
                    this._storeInt((_31_ + 44), (sqlite3CorruptError(48924)));
                    break label$0;
                }
                while (false);
                this._storeInt((_31_ + 8), ((this._loadInt16u((_31_ + 22))) + ((this._loadInt16u(((this._loadInt((_31_ + 40))) + 16))) << 1)));
                this._storeInt((_31_ + 4), ((this._loadInt((_31_ + 24))) + -4));
                this._storeInt16((_31_ + 38), (((this._loadInt8u(((_30_ = (this._loadInt((_31_ + 32))) + (this._loadInt8u((_31_ + 37)))) + 1))) << 8) | (this._loadInt8u((_30_ + 2)))));
                this._storeInt((_31_ + 16), ((this._loadInt8u((((this._loadInt((_31_ + 32))) + (this._loadInt8u((_31_ + 37)))) + 7))) + (this._loadInt((_31_ + 12)))));
                label$4:
                do {
                    label$5:
                    do {
                        label$7:
                        do {
                            label$6:
                            while (true) {
                                if ((this._loadInt16u((_31_ + 38))) < 1) {
                                    break label$4;
                                }
                                if ((this._loadInt16u((_31_ + 38))) < (this._loadInt((_31_ + 8)))) {
                                    break label$5;
                                }
                                if ((this._loadInt16u((_31_ + 38))) > (this._loadInt((_31_ + 4)))) {
                                    break label$5;
                                }
                                this._storeInt16((_31_ + 2), (((this._loadInt8u((_30_ = (this._loadInt((_31_ + 32))) + (this._loadInt16u((_31_ + 38)))))) << 8) | (this._loadInt8u((_30_ + 1)))));
                                this._storeInt16(_31_, (((this._loadInt8u(((_30_ = (this._loadInt((_31_ + 32))) + (this._loadInt16u((_31_ + 38)))) + 2))) << 8) | (this._loadInt8u((_30_ + 3)))));
                                label$8:
                                do {
                                    if ((this._loadInt16u((_31_ + 2))) < 1) {
                                        break label$8;
                                    }
                                    if ((this._loadInt16u((_31_ + 2))) <= (((this._loadInt16u((_31_ + 38))) + (this._loadInt16u(_31_))) + 3)) {
                                        break label$7;
                                    }
                                }
                                while (false);
                                if (((this._loadInt16u((_31_ + 38))) + (this._loadInt16u(_31_))) > (this._loadInt((_31_ + 24)))) {
                                    break label$7;
                                }
                                this._storeInt((_31_ + 16), ((this._loadInt((_31_ + 16))) + (this._loadInt16u(_31_))));
                                this._storeInt16((_31_ + 38), (this._loadInt16u((_31_ + 2))));
                                continue label$6;
                            }
                        }
                        while (false);
                        this._storeInt((_31_ + 44), (sqlite3CorruptError(48974)));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_31_ + 44), (sqlite3CorruptError(48967)));
                    break label$0;
                }
                while (false);
                label$9:
                do {
                    if ((this._loadInt((_31_ + 16))) <= (this._loadInt((_31_ + 24)))) {
                        break label$9;
                    }
                    this._storeInt((_31_ + 44), (sqlite3CorruptError(48988)));
                    break label$0;
                }
                while (false);
                this._storeInt8((_30_ = this._loadInt((_31_ + 40))), 1);
                this._storeInt16((_30_ + 14), ((this._loadInt((_31_ + 16))) - (this._loadInt((_31_ + 8)))));
            }
            while (false);
            this._storeInt((_31_ + 44), 0);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 44));
        this._storeInt((0 + 4), (_31_ + 48));
        return _30_;
    }

    @Override()
    public final void btreeParseCellPtr(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt(((this._storeInt((_33_ + 20), _32_)) + 8), (this._loadInt((_33_ + 24))));
        this._storeInt16((_33_ + 18), (this._loadInt8u(((this._loadInt((_33_ + 28))) + 6))));
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
                                        if ((this._loadInt8u(((this._loadInt((_33_ + 28))) + 2))) == 0) {
                                            break label$7;
                                        }
                                        if ((this._loadInt8u(((this._loadInt((_33_ + 28))) + 4))) == 0) {
                                            break label$6;
                                        }
                                        if ((this._loadInt8u(((this._loadInt((_33_ + 24))) + (this._loadInt16u((_33_ + 18)))))) > 127) {
                                            break label$5;
                                        }
                                        this._storeInt((_33_ + 12), (this._loadInt8u(((this._loadInt((_33_ + 24))) + (this._loadInt16u((_33_ + 18)))))));
                                        _32_ = 1;
                                        break label$4;
                                    }
                                    while (false);
                                    this._storeInt(((this._loadInt((_33_ + 20))) + 12), 0);
                                    if ((this._loadInt8u(((this._loadInt((_33_ + 24))) + (this._loadInt16u((_33_ + 18)))))) > 127) {
                                        break label$2;
                                    }
                                    this._storeInt((_33_ + 12), (this._loadInt8u(((this._loadInt((_33_ + 24))) + (this._loadInt16u((_33_ + 18)))))));
                                    _32_ = 1;
                                    break label$1;
                                }
                                while (false);
                                this._storeInt((_33_ + 12), 0);
                                break label$3;
                            }
                            while (false);
                            _32_ = sqlite3GetVarint32(((this._loadInt((_33_ + 24))) + (this._loadInt16u((_33_ + 18)))), (_33_ + 12));
                        }
                        while (false);
                        this._storeInt16((_33_ + 18), ((this._loadInt16u((_33_ + 18))) + _32_));
                    }
                    while (false);
                    this._storeInt16((_33_ + 18), ((sqlite3GetVarint(((this._loadInt((_33_ + 24))) + (this._loadInt16u((_33_ + 18)))), (this._loadInt((_33_ + 20))))) + (this._loadInt16u((_33_ + 18)))));
                    this._storeInt(((this._loadInt((_33_ + 20))) + 12), (this._loadInt((_33_ + 12))));
                    break label$0;
                }
                while (false);
                _32_ = sqlite3GetVarint32(((this._loadInt((_33_ + 24))) + (this._loadInt16u((_33_ + 18)))), (_33_ + 12));
            }
            while (false);
            this._storeInt16((_33_ + 18), ((this._loadInt16u((_33_ + 18))) + _32_));
            this._storeLong((this._loadInt((_33_ + 20))), (this._loadLong32u((_33_ + 12))));
        }
        while (false);
        this._storeInt16(((_32_ = this._loadInt((_33_ + 20))) + 20), (this._loadInt16u((_33_ + 18))));
        label$8:
        do {
            label$9:
            do {
                if (((this._storeInt((_32_ + 16), (this._loadInt((_33_ + 12))))) & 4294967295L) > ((this._loadInt16u(((this._loadInt((_33_ + 28))) + 8))) & 4294967295L)) {
                    break label$9;
                }
                label$10:
                do {
                    if (((this._storeInt16(((this._loadInt((_33_ + 20))) + 26), ((this._loadInt16u((_33_ + 18))) + (this._loadInt((_33_ + 12)))))) & 65535) > 3) {
                        break label$10;
                    }
                    this._storeInt16(((this._loadInt((_33_ + 20))) + 26), 4);
                }
                while (false);
                this._storeInt16(((_32_ = this._loadInt((_33_ + 20))) + 24), 0);
                this._storeInt16((_32_ + 22), (this._loadInt((_33_ + 12))));
                break label$8;
            }
            while (false);
            this._storeInt((_33_ + 8), (this._loadInt16u(((this._loadInt((_33_ + 28))) + 10))));
            this._storeInt((_33_ + 4), (this._loadInt16u(((this._loadInt((_33_ + 28))) + 8))));
            label$11:
            do {
                label$12:
                do {
                    if ((this._storeInt(_33_, ((_32_ = this._loadInt((_33_ + 8))) + (((this._loadInt((_33_ + 12))) - _32_) % ((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 28))) + 60))) + 40))) + -4))))) > (this._loadInt((_33_ + 4)))) {
                        break label$12;
                    }
                    this._storeInt16(((this._loadInt((_33_ + 20))) + 22), (this._loadInt(_33_)));
                    break label$11;
                }
                while (false);
                this._storeInt16(((this._loadInt((_33_ + 20))) + 22), (this._loadInt((_33_ + 8))));
            }
            while (false);
            this._storeInt16(((_32_ = this._loadInt((_33_ + 20))) + 24), ((this._loadInt16u((_32_ + 22))) + (this._loadInt16u((_33_ + 18)))));
            this._storeInt16((_32_ + 26), ((this._loadInt16u((_32_ + 24))) + 4));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int sqlite3GetVarint32(int _30_, int _31_)
    {
        int _32_ = 0;
        long _33_ = 0L;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_32_ + 36), _31_);
        this._storeInt((_32_ + 32), (this._loadInt8u((this._loadInt((_32_ + 40))))));
        this._storeInt((_32_ + 40), ((_31_ = this._loadInt((_32_ + 40))) + 1));
        this._storeInt((_32_ + 28), (this._loadInt8u((_31_ + 1))));
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
                            if (((this._loadInt8u((_32_ + 28))) >>> 7) == 0) {
                                break label$4;
                            }
                            this._storeInt((_32_ + 40), ((this._loadInt((_32_ + 40))) + 1));
                            this._storeInt((_32_ + 32), ((this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) << 14))) | (this._loadInt8u((this._loadInt((_32_ + 40)))))));
                            if (((this._loadInt8u((_32_ + 32))) >>> 7) == 0) {
                                break label$3;
                            }
                            this._storeInt8((_32_ + 15), (sqlite3GetVarint((this._storeInt((_32_ + 40), ((this._loadInt((_32_ + 40))) + -2))), (_32_ + 16))));
                            if (((_33_ = this._loadLong((_32_ + 16))) & 4294967295L) == _33_) {
                                break label$2;
                            }
                            this._storeInt((this._loadInt((_32_ + 36))), -1);
                            break label$1;
                        }
                        while (false);
                        _31_ = this._storeInt((_32_ + 32), ((this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) & 127))) << 7));
                        this._storeInt((this._loadInt((_32_ + 36))), (_31_ | (this._loadInt((_32_ + 28)))));
                        this._storeInt8((_32_ + 47), 2);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) & 2080895));
                    _31_ = this._storeInt((_32_ + 28), ((this._storeInt((_32_ + 28), ((this._loadInt((_32_ + 28))) & 127))) << 7));
                    this._storeInt((this._loadInt((_32_ + 36))), (_31_ | (this._loadInt((_32_ + 32)))));
                    this._storeInt8((_32_ + 47), 3);
                    break label$0;
                }
                while (false);
                this._storeLong32((this._loadInt((_32_ + 36))), (this._loadLong((_32_ + 16))));
            }
            while (false);
            this._storeInt8((_32_ + 47), (this._loadInt8u((_32_ + 15))));
        }
        while (false);
        _31_ = this._loadInt8u((_32_ + 47));
        this._storeInt((0 + 4), (_32_ + 48));
        return _31_;
    }

    @Override()
    public final int sqlite3GetVarint(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 16), (this._loadInt8u((this._loadInt((_32_ + 24))))));
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
                                        if (((this._loadInt8u((_32_ + 16))) >>> 7) == 0) {
                                            break label$7;
                                        }
                                        this._storeInt((_32_ + 24), ((_31_ = this._loadInt((_32_ + 24))) + 1));
                                        this._storeInt((_32_ + 12), (this._loadInt8u((_31_ + 1))));
                                        if (((this._loadInt8u((_32_ + 12))) >>> 7) == 0) {
                                            break label$6;
                                        }
                                        this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                                        this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) << 14))) | (this._loadInt8u((this._loadInt((_32_ + 24)))))));
                                        if (((this._loadInt8u((_32_ + 16))) >>> 7) == 0) {
                                            break label$5;
                                        }
                                        this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) & 2080895));
                                        this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                                        this._storeInt((_32_ + 12), ((this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) << 14))) | (this._loadInt8u((this._loadInt((_32_ + 24)))))));
                                        if (((this._loadInt8u((_32_ + 12))) >>> 7) == 0) {
                                            break label$4;
                                        }
                                        this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) & 2080895));
                                        this._storeInt((_32_ + 8), (this._loadInt((_32_ + 16))));
                                        this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                                        this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) << 14))) | (this._loadInt8u((this._loadInt((_32_ + 24)))))));
                                        if (((this._loadInt8u((_32_ + 16))) >>> 7) == 0) {
                                            break label$3;
                                        }
                                        this._storeInt((_32_ + 8), ((this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) << 7))) | (this._loadInt((_32_ + 12)))));
                                        this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                                        this._storeInt((_32_ + 12), ((this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) << 14))) | (this._loadInt8u((this._loadInt((_32_ + 24)))))));
                                        if (((this._loadInt8u((_32_ + 12))) >>> 7) == 0) {
                                            break label$2;
                                        }
                                        this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                                        this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) << 14))) | (this._loadInt8u((this._loadInt((_32_ + 24)))))));
                                        if (((this._loadInt8u((_32_ + 16))) >>> 7) == 0) {
                                            break label$1;
                                        }
                                        this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) & 2080895));
                                        this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                                        this._storeInt((_32_ + 12), ((this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) << 14))) | (this._loadInt8u((this._loadInt((_32_ + 24)))))));
                                        if (((this._loadInt8u((_32_ + 12))) >>> 7) == 0) {
                                            break label$0;
                                        }
                                        this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                                        this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) << 15))) | (this._loadInt8u((this._loadInt((_32_ + 24)))))));
                                        this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 12), ((this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) & 2080895))) << 8))) | (this._loadInt((_32_ + 16)))));
                                        this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) << 4));
                                        this._storeInt((_32_ + 8), ((this._storeInt((_32_ + 12), ((this._storeInt((_32_ + 12), ((this._storeInt((_32_ + 12), (this._loadInt8u(((this._loadInt((_32_ + 24))) + -4))))) & 127))) >>> 3))) | (this._loadInt((_32_ + 8)))));
                                        this._storeLong((this._loadInt((_32_ + 20))), (((this._loadLong32u((_32_ + 8))) << 32L) | (this._loadLong32u((_32_ + 16)))));
                                        this._storeInt8((_32_ + 31), 9);
                                        return (this._loadInt8u((_32_ + 31)));
                                    }
                                    while (false);
                                    this._storeLong((this._loadInt((_32_ + 20))), (this._loadLong32u((_32_ + 16))));
                                    this._storeInt8((_32_ + 31), 1);
                                    return (this._loadInt8u((_32_ + 31)));
                                }
                                while (false);
                                this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) & 127))) << 7))) | (this._loadInt((_32_ + 12)))));
                                this._storeLong((this._loadInt((_32_ + 20))), (this._loadLong32u((_32_ + 16))));
                                this._storeInt8((_32_ + 31), 2);
                                return (this._loadInt8u((_32_ + 31)));
                            }
                            while (false);
                            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) & 2080895));
                            this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 12), ((this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) & 127))) << 7))) | (this._loadInt((_32_ + 16)))));
                            this._storeLong((this._loadInt((_32_ + 20))), (this._loadLong32u((_32_ + 16))));
                            this._storeInt8((_32_ + 31), 3);
                            return (this._loadInt8u((_32_ + 31)));
                        }
                        while (false);
                        this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) & 2080895));
                        this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) << 7))) | (this._loadInt((_32_ + 12)))));
                        this._storeLong((this._loadInt((_32_ + 20))), (this._loadLong32u((_32_ + 16))));
                        this._storeInt8((_32_ + 31), 4);
                        return (this._loadInt8u((_32_ + 31)));
                    }
                    while (false);
                    this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) << 7))) | (this._loadInt((_32_ + 16)))));
                    this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) >>> 18));
                    this._storeLong((this._loadInt((_32_ + 20))), (((this._loadLong32u((_32_ + 8))) << 32L) | (this._loadLong32u((_32_ + 16)))));
                    this._storeInt8((_32_ + 31), 5);
                    return (this._loadInt8u((_32_ + 31)));
                }
                while (false);
                this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) & 2080895))) << 7))) | (this._loadInt((_32_ + 12)))));
                this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) >>> 18));
                this._storeLong((this._loadInt((_32_ + 20))), (((this._loadLong32u((_32_ + 8))) << 32L) | (this._loadLong32u((_32_ + 16)))));
                this._storeInt8((_32_ + 31), 6);
                return (this._loadInt8u((_32_ + 31)));
            }
            while (false);
            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) & -266354561));
            this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 12), ((this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) & 2080895))) << 7))) | (this._loadInt((_32_ + 16)))));
            this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) >>> 11));
            this._storeLong((this._loadInt((_32_ + 20))), (((this._loadLong32u((_32_ + 8))) << 32L) | (this._loadLong32u((_32_ + 16)))));
            this._storeInt8((_32_ + 31), 7);
            return (this._loadInt8u((_32_ + 31)));
        }
        while (false);
        this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) & -266354561));
        this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) << 7))) | (this._loadInt((_32_ + 12)))));
        this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) >>> 4));
        this._storeLong((this._loadInt((_32_ + 20))), (((this._loadLong32u((_32_ + 8))) << 32L) | (this._loadLong32u((_32_ + 16)))));
        this._storeInt8((_32_ + 31), 8);
        return (this._loadInt8u((_32_ + 31)));
    }

    @Override()
    public final int decodeFlags(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        this._storeInt8(((this._loadInt((_32_ + 8))) + 3), (_31_ >>> 3));
        this._storeInt((_32_ + 4), (_31_ & -9));
        this._storeInt8(((_31_ = this._loadInt((_32_ + 8))) + 6), (4 - ((this._loadInt8u((_31_ + 3))) << 2)));
        this._storeInt(_32_, (this._loadInt((_31_ + 60))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_32_ + 4))) != 5) {
                            break label$3;
                        }
                        this._storeInt8(((_31_ = this._loadInt((_32_ + 8))) + 2), 1);
                        this._storeInt8((_31_ + 4), (this._loadInt8u((_31_ + 3))));
                        this._storeInt16(((this._loadInt((_32_ + 8))) + 8), (this._loadInt16u(((this._loadInt(_32_)) + 30))));
                        this._storeInt16(((this._loadInt((_32_ + 8))) + 10), (this._loadInt16u(((this._loadInt(_32_)) + 32))));
                        break label$2;
                    }
                    while (false);
                    if ((this._loadInt((_32_ + 4))) != 2) {
                        break label$1;
                    }
                    this._storeInt8(((_31_ = this._loadInt((_32_ + 8))) + 2), (this._storeInt8((_31_ + 4), 0)));
                    this._storeInt16((_31_ + 8), (this._loadInt16u(((this._loadInt(_32_)) + 26))));
                    this._storeInt16(((this._loadInt((_32_ + 8))) + 10), (this._loadInt16u(((this._loadInt(_32_)) + 28))));
                }
                while (false);
                this._storeInt((_32_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), (sqlite3CorruptError(48876)));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void ptrmapPutOvflPtr(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_33_ + 56), _31_);
        label$0:
        do {
            if ((this._loadInt((this._storeInt((_33_ + 52), _32_)))) != 0) {
                break label$0;
            }
            btreeParseCellPtr((this._loadInt((_33_ + 60))), (this._loadInt((_33_ + 56))), (_33_ + 16));
            if ((this._loadInt16u((_33_ + 40))) == 0) {
                break label$0;
            }
            _32_ = this._storeInt((_33_ + 12), (sqlite3Get4byte(((this._loadInt((_33_ + 56))) + (this._loadInt16u((_33_ + 40)))))));
            ptrmapPut((this._loadInt(((_31_ = this._loadInt((_33_ + 60))) + 60))), _32_, 3, (this._loadInt((_31_ + 72))), (this._loadInt((_33_ + 52))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 64));
        return;
    }

    @Override()
    public final void sqlite3PcacheMove(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 12))) + 24))));
        this._viiiiTable[this._tableIndices[this._loadInt((0 + 20368))]].invoke((this._loadInt((_31_ + 40))), (_31_ = this._loadInt((_32_ + 12))), (this._loadInt((_31_ + 12))), (this._loadInt((_32_ + 8))));
        this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 12), (this._loadInt((_32_ + 8))));
        label$0:
        do {
            if (((this._loadInt16u((_31_ + 20))) & 2) == 0) {
                break label$0;
            }
            if (((this._loadInt16u(((this._loadInt((_32_ + 12))) + 20))) & 4) == 0) {
                break label$0;
            }
            pcacheRemoveFromDirtyList((this._loadInt((_32_ + 12))));
            pcacheAddToDirtyList((this._loadInt((_32_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3BitvecClear(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        label$0:
        do {
            if ((this._loadInt((_33_ + 28))) == 0) {
                break label$0;
            }
            this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + -1));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt(((this._loadInt((_33_ + 28))) + 8))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 24))) / (this._loadInt(((this._loadInt((_33_ + 28))) + 8)))));
                    this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) % (this._loadInt(((this._loadInt((_33_ + 28))) + 8)))));
                    if ((this._storeInt((_33_ + 28), (this._loadInt((((this._loadInt((_33_ + 28))) + ((this._loadInt((_33_ + 16))) << 2)) + 12))))) != 0) {
                        continue label$1;
                    }
                    break label$0;
                }
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((this._loadInt((_33_ + 28))))) & 4294967295L) > (4000 & 4294967295L)) {
                    break label$3;
                }
                this._storeInt8((_31_ = ((this._loadInt((_33_ + 28))) + ((_32_ = this._loadInt((_33_ + 24))) >>> 3)) + 12), ((this._loadInt8u(_31_)) & (Integer.rotateLeft(-2, ((int) (_32_ & 7))))));
                break label$0;
            }
            while (false);
            memcpy((this._storeInt((_33_ + 8), (this._loadInt((_33_ + 20))))), ((this._loadInt((_33_ + 28))) + 12), 500);
            memset(((this._loadInt((_33_ + 28))) + 12), 0, 500);
            _32_ = this._storeInt((_33_ + 12), (this._storeInt(((this._loadInt((_33_ + 28))) + 4), 0)));
            label$5:
            do {
                label$4:
                while (true) {
                    if (((this._loadInt((_33_ + 12))) & 4294967295L) > (124 & 4294967295L)) {
                        break label$5;
                    }
                    label$6:
                    do {
                        if ((this._loadInt(((this._loadInt((_33_ + 8))) + ((this._loadInt((_33_ + 12))) << 2)))) == 0) {
                            break label$6;
                        }
                        if ((this._loadInt(((this._loadInt((_33_ + 8))) + ((this._loadInt((_33_ + 12))) << 2)))) == ((this._loadInt((_33_ + 24))) + 1)) {
                            break label$6;
                        }
                        this._storeInt((_33_ + 4), (((this._loadInt(((this._loadInt((_33_ + 8))) + ((this._loadInt((_33_ + 12))) << 2)))) + -1) % 125));
                        this._storeInt(((_31_ = this._loadInt((_33_ + 28))) + 4), ((this._loadInt((_31_ + 4))) + 1));
                        label$8:
                        do {
                            label$7:
                            while (true) {
                                if ((this._loadInt((((this._loadInt((_33_ + 28))) + ((this._loadInt((_33_ + 4))) << 2)) + 12))) == 0) {
                                    break label$8;
                                }
                                if (((this._storeInt((_33_ + 4), ((this._loadInt((_33_ + 4))) + 1))) & 4294967295L) < (125 & 4294967295L)) {
                                    continue label$7;
                                }
                                this._storeInt((_33_ + 4), _32_);
                                continue label$7;
                            }
                        }
                        while (false);
                        this._storeInt((((this._loadInt((_33_ + 28))) + ((this._loadInt((_33_ + 4))) << 2)) + 12), (this._loadInt(((this._loadInt((_33_ + 8))) + ((this._loadInt((_33_ + 12))) << 2)))));
                    }
                    while (false);
                    this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 1));
                    continue label$4;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int btreePageFromDbPage(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(_33_, (sqlite3PagerGetExtra((this._loadInt((_33_ + 12))))));
        _32_ = sqlite3PagerGetData((this._loadInt((_33_ + 12))));
        this._storeInt(((_31_ = this._loadInt(_33_)) + 64), _32_);
        this._storeInt((_31_ + 68), (this._loadInt((_33_ + 12))));
        this._storeInt(((this._loadInt(_33_)) + 60), (this._loadInt((_33_ + 4))));
        this._storeInt(((this._loadInt(_33_)) + 72), (this._loadInt((_33_ + 8))));
        _temp$0 = 100;
        _temp$1 = 0;
        _temp$2 = ((this._loadInt((_32_ + 72))) == 1) ? _temp$0 : _temp$1;
        this._storeInt8(((_32_ = this._loadInt(_33_)) + 5), _temp$2);
        _32_ = this._loadInt(_33_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int sqlite3PagerGetExtra(int _30_)
    {
        return (this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 4)));
    }

    @Override()
    public final int sqlite3AbsInt32(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), _30_)) < 0) {
                break label$0;
            }
            this._storeInt((_31_ + 12), (this._loadInt((_31_ + 8))));
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_31_ + 8))) != -2147483648) {
                break label$1;
            }
            this._storeInt((_31_ + 12), 2147483647);
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        this._storeInt((_31_ + 12), (0 - (this._loadInt((_31_ + 8)))));
        return (this._loadInt((_31_ + 12)));
    }

    @Override()
    public final int btreeGetHasContent(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = 0;
        label$0:
        do {
            if ((this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 12))) + 64))))) == 0) {
                break label$0;
            }
            _31_ = 1;
            if (((this._loadInt((_32_ + 8))) & 4294967295L) > ((sqlite3BitvecSize((this._loadInt((_32_ + 4))))) & 4294967295L)) {
                break label$0;
            }
            _31_ = ((sqlite3BitvecTest((this._loadInt((_32_ + 4))), (this._loadInt((_32_ + 8))))) != 0) ? 1 : 0;
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3PagerPageRefcount(int _30_)
    {
        int _31_ = 0;
        _30_ = sqlite3PcachePageRefcount((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3BitvecSize(int _30_)
    {
        return (this._loadInt((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_))));
    }

    @Override()
    public final void invalidateOverflowCache(int _30_)
    {
        int _31_ = 0;
        sqlite3_free((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 84))));
        this._storeInt(((this._loadInt((_31_ + 12))) + 84), 0);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3PagerCommitPhaseTwo(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_31_ + 4), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 8))) + 40))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 12), (this._loadInt(((this._loadInt((_31_ + 8))) + 40))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 8))) + 15))) != 2) {
                    break label$2;
                }
                if ((this._loadInt8u(((this._loadInt((_31_ + 8))) + 4))) == 0) {
                    break label$2;
                }
                if ((this._loadInt8u(((this._loadInt((_31_ + 8))) + 5))) != 1) {
                    break label$2;
                }
                this._storeInt8(((this._loadInt((_31_ + 8))) + 15), 1);
                this._storeInt((_31_ + 12), 0);
                break label$0;
            }
            while (false);
            _30_ = this._storeInt((_31_ + 4), (pager_end_transaction((_30_ = this._loadInt((_31_ + 8))), (this._loadInt8u((_30_ + 18))))));
            this._storeInt((_31_ + 12), (pager_error((this._loadInt((_31_ + 8))), _30_)));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void btreeEndTransaction(int _30_)
    {
        int _31_ = 0;
        btreeClearHasContent((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 4))))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 12))) + 8))) < 1) {
                    break label$1;
                }
                if ((this._loadInt(((this._loadInt((this._loadInt((_31_ + 12))))) + 140))) < 2) {
                    break label$1;
                }
                downgradeAllSharedCacheTableLocks((this._loadInt((_31_ + 12))));
                this._storeInt8(((this._loadInt((_31_ + 12))) + 8), 1);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 12))) + 8))) == 0) {
                    break label$2;
                }
                clearAllSharedCacheTableLocks((this._loadInt((_31_ + 12))));
                this._storeInt(((_30_ = this._loadInt((_31_ + 8))) + 44), ((this._loadInt((_30_ + 44))) + -1));
                if ((this._loadInt((_30_ + 44))) != 0) {
                    break label$2;
                }
                this._storeInt8(((this._loadInt((_31_ + 8))) + 23), 0);
            }
            while (false);
            this._storeInt8(((this._loadInt((_31_ + 12))) + 8), 0);
            unlockBtreeIfUnused((this._loadInt((_31_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void btreeClearHasContent(int _30_)
    {
        int _31_ = 0;
        sqlite3BitvecDestroy((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 64))));
        this._storeInt(((this._loadInt((_31_ + 12))) + 64), 0);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void downgradeAllSharedCacheTableLocks(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 4))))) + 80))) != (this._loadInt((_31_ + 12)))) {
                break label$0;
            }
            this._storeInt8(((_30_ = this._loadInt((_31_ + 8))) + 85), (this._storeInt8((_30_ + 84), (this._storeInt((_30_ + 80), 0)))));
            this._storeInt((_31_ + 4), (this._loadInt((_30_ + 76))));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_31_ + 4))) == 0) {
                        break label$2;
                    }
                    this._storeInt8(((_30_ = this._loadInt((_31_ + 4))) + 8), 1);
                    this._storeInt((_31_ + 4), (this._loadInt((_30_ + 12))));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        return;
    }

    @Override()
    public final void clearAllSharedCacheTableLocks(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 4), ((this._storeInt((_31_ + 8), (this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 4))))) + 76));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((this._loadInt((_31_ + 4))))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt((this._storeInt(_31_, (this._loadInt((this._loadInt((_31_ + 4))))))))) == (this._loadInt((_31_ + 12)))) {
                        break label$2;
                    }
                    this._storeInt((_31_ + 4), ((this._loadInt(_31_)) + 12));
                    continue label$0;
                }
                while (false);
                this._storeInt((this._loadInt((_31_ + 4))), (this._loadInt(((_30_ = this._loadInt(_31_)) + 12))));
                if ((this._loadInt((_30_ + 4))) == 1) {
                    continue label$0;
                }
                sqlite3_free((this._loadInt(_31_)));
                continue label$0;
            }
        }
        while (false);
        label$3:
        do {
            label$4:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 8))) + 80))) == (this._loadInt((_31_ + 12)))) {
                    break label$4;
                }
                if ((this._loadInt(((this._loadInt((_31_ + 8))) + 44))) != 2) {
                    break label$3;
                }
                this._storeInt8(((this._loadInt((_31_ + 8))) + 85), 0);
                break label$3;
            }
            while (false);
            this._storeInt8(((_30_ = this._loadInt((_31_ + 8))) + 85), (this._storeInt((_30_ + 80), (this._storeInt8((_30_ + 84), 0)))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void unlockBtreeIfUnused(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 23))) != 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_31_ + 12))) + 12))) == 0) {
                break label$0;
            }
            releasePage((this._loadInt(((this._loadInt((_31_ + 12))) + 12))));
            this._storeInt(((this._loadInt((_31_ + 12))) + 12), 0);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int pagerWalFrames(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_35_ + 40), _31_);
        this._storeInt((_35_ + 36), _32_);
        this._storeInt((_35_ + 32), _33_);
        this._storeInt((_35_ + 28), _34_);
        label$0:
        do {
            if ((this._loadInt((_35_ + 32))) == 0) {
                break label$0;
            }
            this._storeInt((_35_ + 16), (_35_ + 40));
            this._storeInt((_35_ + 20), (this._loadInt((_35_ + 40))));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._storeInt((this._loadInt((_35_ + 16))), (this._loadInt((_35_ + 20))))) == 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if (((this._loadInt(((this._loadInt((_35_ + 20))) + 12))) & 4294967295L) > ((this._loadInt((_35_ + 36))) & 4294967295L)) {
                            break label$3;
                        }
                        this._storeInt((_35_ + 16), ((this._loadInt((_35_ + 20))) + 8));
                    }
                    while (false);
                    this._storeInt((_35_ + 20), (this._loadInt(((this._loadInt((_35_ + 20))) + 8))));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        label$4:
        do {
            if ((this._loadInt(((this._loadInt((_35_ + 40))) + 12))) != 1) {
                break label$4;
            }
            pager_write_changecounter((this._loadInt((_35_ + 40))));
        }
        while (false);
        label$5:
        do {
            if ((this._storeInt((_35_ + 24), (sqlite3WalFrames((this._loadInt(((_34_ = this._loadInt((_35_ + 44))) + 172))), (this._loadInt((_34_ + 128))), (this._loadInt((_35_ + 40))), (this._loadInt((_35_ + 36))), (this._loadInt((_35_ + 32))), (this._loadInt((_35_ + 28))))))) != 0) {
                break label$5;
            }
            if ((this._loadInt(((this._loadInt((_35_ + 44))) + 88))) == 0) {
                break label$5;
            }
            this._storeInt((_35_ + 12), (this._loadInt((_35_ + 40))));
            label$7:
            do {
                label$6:
                while (true) {
                    if ((this._loadInt((_35_ + 12))) == 0) {
                        break label$7;
                    }
                    sqlite3BackupUpdate((this._loadInt(((this._loadInt((_35_ + 44))) + 88))), (this._loadInt(((_34_ = this._loadInt((_35_ + 12))) + 12))), (this._loadInt(_34_)));
                    this._storeInt((_35_ + 12), (this._loadInt(((this._loadInt((_35_ + 12))) + 8))));
                    continue label$6;
                }
            }
            while (false);
        }
        while (false);
        _34_ = this._loadInt((_35_ + 24));
        this._storeInt((0 + 4), (_35_ + 48));
        return _34_;
    }

    @Override()
    public final int pager_incr_changecounter(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), 0);
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 17))) != 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_32_ + 12))) + 24))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._storeInt((_32_ + 4), (sqlite3PagerAcquire((this._loadInt((_32_ + 12))), 1, _32_, 0)))) != 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 4), (sqlite3PagerWrite((this._loadInt(_32_)))));
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt((_32_ + 4))) != 0) {
                    break label$2;
                }
                pager_write_changecounter((this._loadInt(_32_)));
                this._storeInt8(((this._loadInt((_32_ + 12))) + 17), 1);
            }
            while (false);
            sqlite3PagerUnref((this._loadInt(_32_)));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int writeMasterJournal(int _30_, int _31_)
    {
        long _32_ = 0L;
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_33_ + 36), _31_);
        _31_ = this._storeInt((_33_ + 4), 0);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_33_ + 36))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt8u(((this._loadInt((_33_ + 40))) + 5))) == 4) {
                        break label$2;
                    }
                    if ((this._loadInt8u(((this._loadInt((_33_ + 40))) + 5))) != 2) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((_33_ + 44), _31_);
                break label$0;
            }
            while (false);
            _31_ = this._storeInt8(((this._loadInt((_33_ + 40))) + 18), 1);
            this._storeInt((_33_ + 28), 0);
            label$4:
            do {
                label$3:
                while (true) {
                    if ((this._loadInt8u(((this._loadInt((_33_ + 36))) + (this._loadInt((_33_ + 28)))))) == 0) {
                        break label$4;
                    }
                    this._storeInt((_33_ + 4), ((this._loadInt((_33_ + 4))) + (this._loadInt8s(((this._loadInt((_33_ + 36))) + (this._loadInt((_33_ + 28))))))));
                    this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) + _31_));
                    continue label$3;
                }
            }
            while (false);
            label$5:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 40))) + 9))) == 0) {
                    break label$5;
                }
                _32_ = journalHdrOffset((this._loadInt((_33_ + 40))));
                this._storeLong(((this._loadInt((_33_ + 40))) + 72), _32_);
            }
            while (false);
            _32_ = this._storeLong((_33_ + 16), (this._loadLong(((this._loadInt((_33_ + 40))) + 72))));
            label$6:
            do {
                label$7:
                do {
                    if ((this._storeInt((_33_ + 32), (write32bits((this._loadInt(((_31_ = this._loadInt((_33_ + 40))) + 64))), _32_, (((this._loadInt((0 + 22332))) / (this._loadInt((_31_ + 128)))) + 1))))) != 0) {
                        break label$7;
                    }
                    if ((this._storeInt((_33_ + 32), (sqlite3OsWrite((this._loadInt(((this._loadInt((_33_ + 40))) + 64))), (this._loadInt((_33_ + 36))), (this._loadInt((_33_ + 28))), ((this._loadLong((_33_ + 16))) + 4L))))) != 0) {
                        break label$7;
                    }
                    if ((this._storeInt((_33_ + 32), (write32bits((this._loadInt(((this._loadInt((_33_ + 40))) + 64))), (((this._loadLong((_33_ + 16))) + ((long) (_31_ = this._loadInt((_33_ + 28))))) + 4L), _31_)))) != 0) {
                        break label$7;
                    }
                    if ((this._storeInt((_33_ + 32), (write32bits((this._loadInt(((this._loadInt((_33_ + 40))) + 64))), (((this._loadLong((_33_ + 16))) + (this._loadLong32s((_33_ + 28)))) + 8L), (this._loadInt((_33_ + 4))))))) != 0) {
                        break label$7;
                    }
                    if ((this._storeInt((_33_ + 32), (sqlite3OsWrite((this._loadInt(((this._loadInt((_33_ + 40))) + 64))), 29376, 8, (((this._loadLong((_33_ + 16))) + (this._loadLong32s((_33_ + 28)))) + 12L))))) == 0) {
                        break label$6;
                    }
                }
                while (false);
                this._storeInt((_33_ + 44), (this._loadInt((_33_ + 32))));
                break label$0;
            }
            while (false);
            this._storeLong(((_31_ = this._loadInt((_33_ + 40))) + 72), ((this._loadLong((_31_ + 72))) + ((long) ((this._loadInt((_33_ + 28))) + 20))));
            label$8:
            do {
                if ((this._storeInt((_33_ + 32), (sqlite3OsFileSize((this._loadInt((_31_ + 64))), (_33_ + 8))))) != 0) {
                    break label$8;
                }
                if ((this._loadLong((_33_ + 8))) <= (this._loadLong(((this._loadInt((_33_ + 40))) + 72)))) {
                    break label$8;
                }
                this._storeInt((_33_ + 32), (sqlite3OsTruncate((this._loadInt(((_31_ = this._loadInt((_33_ + 40))) + 64))), (this._loadLong((_31_ + 72))))));
            }
            while (false);
            this._storeInt((_33_ + 44), (this._loadInt((_33_ + 32))));
        }
        while (false);
        _31_ = this._loadInt((_33_ + 44));
        this._storeInt((0 + 4), (_33_ + 48));
        return _31_;
    }

    @Override()
    public final int syncJournal(int _30_, int _31_)
    {
        long _32_ = 0L;
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_33_ + 52), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_33_ + 48), (sqlite3PagerExclusiveLock((this._loadInt((_33_ + 56))))))) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 60), (this._loadInt((_33_ + 48))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 56))) + 8))) != 0) {
                    break label$2;
                }
                label$3:
                do {
                    label$4:
                    do {
                        label$5:
                        do {
                            if ((this._loadInt((this._loadInt(((this._loadInt((_33_ + 56))) + 64))))) == 0) {
                                break label$5;
                            }
                            if ((this._loadInt8u(((this._loadInt((_33_ + 56))) + 5))) == 4) {
                                break label$5;
                            }
                            this._storeInt((_33_ + 44), (sqlite3OsDeviceCharacteristics((this._loadInt(((this._loadInt((_33_ + 56))) + 60))))));
                            if (((this._loadInt8u((_33_ + 45))) & 2) != 0) {
                                break label$3;
                            }
                            memcpy((_33_ + 12), 29376, 8);
                            sqlite3Put4byte(((_33_ + 12) + 8), (this._loadInt(((this._loadInt((_33_ + 56))) + 44))));
                            _32_ = this._storeLong((_33_ + 32), (journalHdrOffset((this._loadInt((_33_ + 56))))));
                            label$6:
                            do {
                                if ((this._storeInt((_33_ + 48), (sqlite3OsRead((this._loadInt(((this._loadInt((_33_ + 56))) + 64))), (_33_ + 24), 8, _32_)))) != 0) {
                                    break label$6;
                                }
                                if ((memcmp((_33_ + 24), 29376, 8)) != 0) {
                                    break label$6;
                                }
                                this._storeInt((_33_ + 48), (sqlite3OsWrite((this._loadInt(((this._loadInt((_33_ + 56))) + 64))), 29488, 1, (this._loadLong((_33_ + 32))))));
                            }
                            while (false);
                            if ((this._loadInt((_33_ + 48))) == 0) {
                                break label$4;
                            }
                            if ((this._loadInt((_33_ + 48))) == 522) {
                                break label$4;
                            }
                            this._storeInt((_33_ + 60), (this._loadInt((_33_ + 48))));
                            break label$0;
                        }
                        while (false);
                        this._storeLong(((_31_ = this._loadInt((_33_ + 56))) + 80), (this._loadLong((_31_ + 72))));
                        break label$2;
                    }
                    while (false);
                    label$7:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_33_ + 56))) + 9))) == 0) {
                            break label$7;
                        }
                        if (((this._loadInt8u((_33_ + 45))) & 4) != 0) {
                            break label$7;
                        }
                        if ((this._storeInt((_33_ + 48), (sqlite3OsSync((this._loadInt(((_31_ = this._loadInt((_33_ + 56))) + 64))), (this._loadInt8u((_31_ + 11))))))) == 0) {
                            break label$7;
                        }
                        this._storeInt((_33_ + 60), (this._loadInt((_33_ + 48))));
                        break label$0;
                    }
                    while (false);
                    if ((this._storeInt((_33_ + 48), (sqlite3OsWrite((this._loadInt(((_31_ = this._loadInt((_33_ + 56))) + 64))), (_33_ + 12), 12, (this._loadLong((_31_ + 80))))))) == 0) {
                        break label$3;
                    }
                    this._storeInt((_33_ + 60), (this._loadInt((_33_ + 48))));
                    break label$0;
                }
                while (false);
                label$8:
                do {
                    if (((this._loadInt8u((_33_ + 45))) & 4) != 0) {
                        break label$8;
                    }
                    if ((this._storeInt((_33_ + 48), (sqlite3OsSync((this._loadInt(((_31_ = this._loadInt((_33_ + 56))) + 64))), ((_31_ = this._loadInt8u((_31_ + 11))) | (((_31_ == 3) ? 1 : 0) << 4)))))) == 0) {
                        break label$8;
                    }
                    this._storeInt((_33_ + 60), (this._loadInt((_33_ + 48))));
                    break label$0;
                }
                while (false);
                this._storeLong(((_31_ = this._loadInt((_33_ + 56))) + 80), (this._loadLong((_31_ + 72))));
                if ((this._loadInt((_33_ + 52))) == 0) {
                    break label$2;
                }
                if (((this._loadInt8u((_33_ + 45))) & 2) != 0) {
                    break label$2;
                }
                this._storeInt(((_31_ = this._loadInt((_33_ + 56))) + 44), 0);
                if ((this._storeInt((_33_ + 48), (writeJournalHdr(_31_)))) == 0) {
                    break label$2;
                }
                this._storeInt((_33_ + 60), (this._loadInt((_33_ + 48))));
                break label$0;
            }
            while (false);
            sqlite3PcacheClearSyncFlags((this._loadInt(((this._loadInt((_33_ + 56))) + 168))));
            this._storeInt8(((this._loadInt((_33_ + 56))) + 15), 4);
            this._storeInt((_33_ + 60), 0);
        }
        while (false);
        _31_ = this._loadInt((_33_ + 60));
        this._storeInt((0 + 4), (_33_ + 64));
        return _31_;
    }

    @Override()
    public final int pager_write_pagelist(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_32_ + 40), _31_);
        this._storeInt((_32_ + 36), 0);
        label$0:
        do {
            if ((this._loadInt((this._loadInt(((this._loadInt((_32_ + 44))) + 60))))) != 0) {
                break label$0;
            }
            this._storeInt((_32_ + 36), (pagerOpentemp((_31_ = this._loadInt((_32_ + 44))), (this._loadInt((_31_ + 60))), (this._loadInt((_31_ + 120))))));
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_32_ + 36))) != 0) {
                break label$1;
            }
            if (((this._loadInt(((_31_ = this._loadInt((_32_ + 44))) + 24))) & 4294967295L) <= ((this._loadInt((_31_ + 36))) & 4294967295L)) {
                break label$1;
            }
            this._storeLong((_32_ + 24), ((this._loadLong32s(((_31_ = this._loadInt((_32_ + 44))) + 128))) * (this._loadLong32u((_31_ + 24)))));
            sqlite3OsFileControl((this._loadInt(((this._loadInt((_32_ + 44))) + 60))), 5, (_32_ + 24));
            this._storeInt(((_31_ = this._loadInt((_32_ + 44))) + 36), (this._loadInt((_31_ + 24))));
        }
        while (false);
        label$3:
        do {
            label$2:
            while (true) {
                _31_ = 0;
                label$4:
                do {
                    if ((this._loadInt((_32_ + 36))) != 0) {
                        break label$4;
                    }
                    _31_ = ((this._loadInt((_32_ + 40))) != 0) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$3;
                }
                label$5:
                do {
                    if (((this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 40))) + 12))))) & 4294967295L) > ((this._loadInt(((this._loadInt((_32_ + 44))) + 24))) & 4294967295L)) {
                        break label$5;
                    }
                    if (((this._loadInt16u(((this._loadInt((_32_ + 40))) + 20))) & 32) != 0) {
                        break label$5;
                    }
                    this._storeLong((_32_ + 8), ((((this._loadInt((_32_ + 20))) + -1) & 4294967295L) * (this._loadLong32s(((this._loadInt((_32_ + 44))) + 128)))));
                    label$6:
                    do {
                        if ((this._loadInt(((this._loadInt((_32_ + 40))) + 12))) != 1) {
                            break label$6;
                        }
                        pager_write_changecounter((this._loadInt((_32_ + 40))));
                    }
                    while (false);
                    _31_ = this._storeInt((_32_ + 4), (this._loadInt((this._loadInt((_32_ + 40))))));
                    this._storeInt((_32_ + 36), (sqlite3OsWrite((this._loadInt(((_30_ = this._loadInt((_32_ + 44))) + 60))), _31_, (this._loadInt((_30_ + 128))), (this._loadLong((_32_ + 8))))));
                    label$7:
                    do {
                        if ((this._loadInt((_32_ + 20))) != 1) {
                            break label$7;
                        }
                        memcpy(((this._loadInt((_32_ + 44))) + 100), ((this._loadInt((_32_ + 4))) + 24), 16);
                    }
                    while (false);
                    label$8:
                    do {
                        if (((this._loadInt((_32_ + 20))) & 4294967295L) <= ((this._loadInt(((this._loadInt((_32_ + 44))) + 32))) & 4294967295L)) {
                            break label$8;
                        }
                        this._storeInt(((this._loadInt((_32_ + 44))) + 32), (this._loadInt((_32_ + 20))));
                    }
                    while (false);
                    sqlite3BackupUpdate((this._loadInt(((this._loadInt((_32_ + 44))) + 88))), (this._loadInt((_32_ + 20))), (this._loadInt((this._loadInt((_32_ + 40))))));
                }
                while (false);
                this._storeInt((_32_ + 40), (this._loadInt(((this._loadInt((_32_ + 40))) + 8))));
                continue label$2;
            }
        }
        while (false);
        _31_ = this._loadInt((_32_ + 36));
        this._storeInt((0 + 4), (_32_ + 48));
        return _31_;
    }

    @Override()
    public final void pager_write_changecounter(int _30_)
    {
        int _31_ = 0;
        _30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), ((sqlite3Get4byte(((this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 16))) + 100))) + 1));
        sqlite3Put4byte(((this._loadInt((this._loadInt((_31_ + 12))))) + 24), _30_);
        sqlite3Put4byte(((this._loadInt((this._loadInt((_31_ + 12))))) + 92), (this._loadInt((_31_ + 8))));
        sqlite3Put4byte(((this._loadInt((this._loadInt((_31_ + 12))))) + 96), 3007007);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3PagerExclusiveLock(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_31_ + 8), 0);
        label$0:
        do {
            if ((pagerUseWal((this._loadInt((_31_ + 12))))) != 0) {
                break label$0;
            }
            this._storeInt((_31_ + 8), (pager_wait_on_lock((this._loadInt((_31_ + 12))), 4)));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void sqlite3PcacheClearSyncFlags(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._loadInt((this._storeInt((_31_ + 12), _30_)))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 8))) == 0) {
                    break label$1;
                }
                this._storeInt16(((_30_ = this._loadInt((_31_ + 8))) + 20), ((this._loadInt16u((_30_ + 20))) & 65531));
                this._storeInt((_31_ + 8), (this._loadInt((_30_ + 28))));
                continue label$0;
            }
        }
        while (false);
        this._storeInt(((_31_ = this._loadInt((_31_ + 12))) + 8), (this._loadInt((_31_ + 4))));
        return;
    }

    @Override()
    public final int pager_wait_on_lock(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0$end:
        do {
            label$0:
            while (true) {
                this._storeInt((_32_ + 4), (pagerLockDb((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))))));
                _31_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_32_ + 4))) != 5) {
                        break label$2;
                    }
                    _31_ = ((this._iiTable[this._tableIndices[this._loadInt(((_31_ = this._loadInt((_32_ + 12))) + 152))]].invoke((this._loadInt((_31_ + 156))))) != 0) ? 1 : 0;
                }
                while (false);
                if (_31_ != 0) {
                    continue label$0;
                }
                break label$0$end;
            }
        }
        while (false);
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int pagerLockDb(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 16))) < (this._loadInt((_32_ + 8)))) {
                    break label$1;
                }
                if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 16))) != 5) {
                    break label$0;
                }
            }
            while (false);
            if ((this._storeInt((_32_ + 4), (sqlite3OsLock((this._loadInt(((this._loadInt((_32_ + 12))) + 60))), (this._loadInt((_32_ + 8))))))) != 0) {
                break label$0;
            }
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 16))) != 5) {
                    break label$2;
                }
                if ((this._loadInt((_32_ + 8))) != 4) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt8(((this._loadInt((_32_ + 12))) + 16), (this._loadInt((_32_ + 8))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3OsLock(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this._iiiTable[this._tableIndices[this._loadInt(((this._loadInt((_30_ = this._loadInt((_32_ + 12))))) + 28))]].invoke(_30_, _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3WalFrames(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_)
    {
        long _36_ = 0L;
        int _37_ = 0;
        this._storeInt(((_37_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 176))) + 168), _30_);
        this._storeInt((_37_ + 164), _31_);
        this._storeInt((_37_ + 160), _32_);
        this._storeInt((_37_ + 156), _33_);
        this._storeInt((_37_ + 152), _34_);
        this._storeInt((_37_ + 148), _35_);
        this._storeInt((_37_ + 100), (this._storeInt((_37_ + 104), 0)));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_37_ + 144), (walRestartLog((this._loadInt((_37_ + 168))))))) == 0) {
                    break label$1;
                }
                this._storeInt((_37_ + 172), (this._loadInt((_37_ + 144))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._storeInt((_37_ + 140), (this._loadInt(((this._loadInt((_37_ + 168))) + 60))))) != 0) {
                    break label$2;
                }
                sqlite3Put4byte((_37_ + 64), ((_34_ = ((this._loadInt8s((0 + 29180))) == 0) ? 1 : 0) | 931071618));
                sqlite3Put4byte(((_37_ + 64) | 4), 3007000);
                sqlite3Put4byte(((_37_ + 64) | 8), (this._loadInt((_37_ + 164))));
                sqlite3Put4byte(((_37_ + 64) | 12), (this._loadInt(((this._loadInt((_37_ + 168))) + 96))));
                sqlite3_randomness(8, ((this._loadInt((_37_ + 168))) + 76));
                memcpy((_37_ + 80), ((this._loadInt((_37_ + 168))) + 76), 8);
                walChecksumBytes(1, (_37_ + 64), 24, 0, (_37_ + 56));
                sqlite3Put4byte(((_37_ + 64) + 24), (this._loadInt((_37_ + 56))));
                sqlite3Put4byte((_37_ + 92), (this._loadInt((_37_ + 60))));
                this._storeInt(((_35_ = this._loadInt((_37_ + 168))) + 32), (this._loadInt((_37_ + 164))));
                this._storeInt8((_35_ + 57), _34_);
                this._storeInt((_35_ + 68), (this._loadInt((_37_ + 56))));
                this._storeInt(((this._loadInt((_37_ + 168))) + 72), (this._loadInt((_37_ + 60))));
                if ((this._storeInt((_37_ + 144), (sqlite3OsWrite((this._loadInt(((this._loadInt((_37_ + 168))) + 8))), (_37_ + 64), 32, 0L)))) == 0) {
                    break label$2;
                }
                this._storeInt((_37_ + 172), (this._loadInt((_37_ + 144))));
                break label$0;
            }
            while (false);
            this._storeInt((_37_ + 108), (this._loadInt((_37_ + 160))));
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
                                label$9:
                                do {
                                    label$8:
                                    while (true) {
                                        if ((this._loadInt((_37_ + 108))) == 0) {
                                            break label$7;
                                        }
                                        this._storeInt((_37_ + 140), ((_35_ = this._loadInt((_37_ + 140))) + 1));
                                        this._storeLong((_37_ + 40), (((_35_ & 4294967295L) * ((long) ((this._loadInt((_37_ + 164))) + 24))) + 32L));
                                        _35_ = 0;
                                        label$10:
                                        do {
                                            if ((this._loadInt((_37_ + 152))) == 0) {
                                                break label$10;
                                            }
                                            if ((this._loadInt(((this._loadInt((_37_ + 108))) + 8))) != 0) {
                                                break label$10;
                                            }
                                            _35_ = this._loadInt((_37_ + 156));
                                        }
                                        while (false);
                                        this._storeInt((_37_ + 52), _35_);
                                        _35_ = this._storeInt((_37_ + 36), (this._loadInt((this._loadInt((_37_ + 108))))));
                                        walEncodeFrame((this._loadInt((_37_ + 168))), (this._loadInt(((this._loadInt((_37_ + 108))) + 12))), (this._loadInt((_37_ + 52))), _35_, (_37_ + 112));
                                        if ((this._storeInt((_37_ + 144), (sqlite3OsWrite((this._loadInt(((this._loadInt((_37_ + 168))) + 8))), (_37_ + 112), 24, (this._loadLong((_37_ + 40))))))) != 0) {
                                            break label$6;
                                        }
                                        if ((this._storeInt((_37_ + 144), (sqlite3OsWrite((this._loadInt(((this._loadInt((_37_ + 168))) + 8))), (this._loadInt((_37_ + 36))), (this._loadInt((_37_ + 164))), ((this._loadLong((_37_ + 40))) + 24L))))) != 0) {
                                            break label$9;
                                        }
                                        this._storeInt((_37_ + 104), (this._loadInt((_37_ + 108))));
                                        this._storeInt((_37_ + 108), (this._loadInt(((this._loadInt((_37_ + 108))) + 8))));
                                        continue label$8;
                                    }
                                }
                                while (false);
                                this._storeInt((_37_ + 172), (this._loadInt((_37_ + 144))));
                                break label$0;
                            }
                            while (false);
                            if ((this._loadInt((_37_ + 148))) == 0) {
                                break label$4;
                            }
                            this._storeLong((_37_ + 24), ((long) (sqlite3OsSectorSize((this._loadInt(((this._loadInt((_37_ + 168))) + 8)))))));
                            this._storeLong((_37_ + 24), (((((this._storeLong((_37_ + 16), (((this._loadLong32u((_37_ + 140))) * ((long) ((this._loadInt((_37_ + 164))) + 24))) + 32L))) + (_36_ = this._loadLong((_37_ + 24)))) + -1L) / _36_) * _36_));
                            label$12:
                            do {
                                label$11:
                                while (true) {
                                    if ((this._loadLong((_37_ + 16))) >= (this._loadLong((_37_ + 24)))) {
                                        break label$5;
                                    }
                                    _35_ = this._storeInt((_37_ + 12), (this._loadInt((this._loadInt((_37_ + 104))))));
                                    walEncodeFrame((this._loadInt((_37_ + 168))), (this._loadInt(((this._loadInt((_37_ + 104))) + 12))), (this._loadInt((_37_ + 156))), _35_, (_37_ + 112));
                                    if ((this._storeInt((_37_ + 144), (sqlite3OsWrite((this._loadInt(((this._loadInt((_37_ + 168))) + 8))), (_37_ + 112), 24, (this._loadLong((_37_ + 16))))))) != 0) {
                                        break label$3;
                                    }
                                    _36_ = this._storeLong((_37_ + 16), ((this._loadLong((_37_ + 16))) + 24L));
                                    if ((this._storeInt((_37_ + 144), (sqlite3OsWrite((this._loadInt(((this._loadInt((_37_ + 168))) + 8))), (this._loadInt((_37_ + 12))), (this._loadInt((_37_ + 164))), _36_)))) != 0) {
                                        break label$12;
                                    }
                                    this._storeInt((_37_ + 100), ((this._loadInt((_37_ + 100))) + 1));
                                    this._storeLong((_37_ + 16), ((this._loadLong((_37_ + 16))) + (this._loadLong32s((_37_ + 164)))));
                                    continue label$11;
                                }
                            }
                            while (false);
                            this._storeInt((_37_ + 172), (this._loadInt((_37_ + 144))));
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_37_ + 172), (this._loadInt((_37_ + 144))));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_37_ + 144), (sqlite3OsSync((this._loadInt(((this._loadInt((_37_ + 168))) + 8))), (this._loadInt((_37_ + 148))))));
                }
                while (false);
                this._storeInt((_37_ + 140), (this._loadInt(((this._loadInt((_37_ + 168))) + 60))));
                this._storeInt((_37_ + 108), (this._loadInt((_37_ + 160))));
                label$14:
                do {
                    label$13:
                    while (true) {
                        _35_ = 0;
                        label$15:
                        do {
                            if ((this._loadInt((_37_ + 108))) == 0) {
                                break label$15;
                            }
                            _35_ = ((this._loadInt((_37_ + 144))) == 0) ? 1 : 0;
                        }
                        while (false);
                        if (_35_ == 0) {
                            break label$14;
                        }
                        _35_ = this._storeInt((_37_ + 140), ((this._loadInt((_37_ + 140))) + 1));
                        this._storeInt((_37_ + 144), (walIndexAppend((this._loadInt((_37_ + 168))), _35_, (this._loadInt(((this._loadInt((_37_ + 108))) + 12))))));
                        this._storeInt((_37_ + 108), (this._loadInt(((this._loadInt((_37_ + 108))) + 8))));
                        continue label$13;
                    }
                }
                while (false);
                label$17:
                do {
                    label$16:
                    while (true) {
                        _35_ = 0;
                        label$18:
                        do {
                            if ((this._loadInt((_37_ + 100))) < 1) {
                                break label$18;
                            }
                            _35_ = ((this._loadInt((_37_ + 144))) == 0) ? 1 : 0;
                        }
                        while (false);
                        if (_35_ == 0) {
                            break label$17;
                        }
                        this._storeInt((_37_ + 140), ((this._loadInt((_37_ + 140))) + 1));
                        this._storeInt((_37_ + 100), ((this._loadInt((_37_ + 100))) + -1));
                        this._storeInt((_37_ + 144), (walIndexAppend((this._loadInt((_37_ + 168))), (this._loadInt((_37_ + 140))), (this._loadInt(((this._loadInt((_37_ + 104))) + 12))))));
                        continue label$16;
                    }
                }
                while (false);
                label$19:
                do {
                    if ((this._loadInt((_37_ + 144))) != 0) {
                        break label$19;
                    }
                    this._storeInt(((_35_ = this._loadInt((_37_ + 168))) + 60), (this._loadInt((_37_ + 140))));
                    this._storeInt16((_35_ + 58), (((_35_ = this._loadInt((_37_ + 164))) & 65280) | (_35_ >>> 16)));
                    label$20:
                    do {
                        if ((this._loadInt((_37_ + 152))) == 0) {
                            break label$20;
                        }
                        this._storeInt(((_35_ = this._loadInt((_37_ + 168))) + 64), (this._loadInt((_37_ + 156))));
                        this._storeInt((_35_ = _35_ + 52), ((this._loadInt(_35_)) + 1));
                    }
                    while (false);
                    if ((this._loadInt((_37_ + 152))) == 0) {
                        break label$19;
                    }
                    walIndexWriteHdr((this._loadInt((_37_ + 168))));
                    this._storeInt(((this._loadInt((_37_ + 168))) + 12), (this._loadInt((_37_ + 140))));
                }
                while (false);
                this._storeInt((_37_ + 172), (this._loadInt((_37_ + 144))));
                break label$0;
            }
            while (false);
            this._storeInt((_37_ + 172), (this._loadInt((_37_ + 144))));
        }
        while (false);
        _35_ = this._loadInt((_37_ + 172));
        this._storeInt((0 + 4), (_37_ + 176));
        return _35_;
    }

    @Override()
    public final int walRestartLog(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_32_ + 52), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt16s(((this._loadInt((_32_ + 56))) + 36))) != 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt((this._storeInt((_32_ + 44), (walCkptInfo((this._loadInt((_32_ + 56))))))))) == 0) {
                        break label$2;
                    }
                    sqlite3_randomness(4, (_32_ + 40));
                    label$3:
                    do {
                        if ((this._storeInt((_32_ + 52), (walLockExclusive((this._loadInt((_32_ + 56))), 4, 4)))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt((_32_ + 52))) == 5) {
                            break label$2;
                        }
                        this._storeInt((_32_ + 60), (this._loadInt((_32_ + 52))));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 56))) + 76));
                    label$4:
                    do {
                        if ((this._loadLong(((this._loadInt((_32_ + 56))) + 16))) < 0L) {
                            break label$4;
                        }
                        sqlite3BeginBenignMalloc();
                        label$5:
                        do {
                            if ((this._storeInt((_32_ + 20), (sqlite3OsFileSize((this._loadInt(((this._loadInt((_32_ + 56))) + 8))), (_32_ + 24))))) != 0) {
                                break label$5;
                            }
                            if ((this._loadLong((_32_ + 24))) <= (this._loadLong(((this._loadInt((_32_ + 56))) + 16)))) {
                                break label$5;
                            }
                            this._storeInt((_32_ + 20), (sqlite3OsTruncate((this._loadInt(((_30_ = this._loadInt((_32_ + 56))) + 8))), (this._loadLong((_30_ + 16))))));
                        }
                        while (false);
                        sqlite3EndBenignMalloc();
                        if ((this._loadInt((_32_ + 20))) == 0) {
                            break label$4;
                        }
                        _30_ = this._loadInt((_32_ + 20));
                        this._storeInt(_32_, (this._loadInt(((this._loadInt((_32_ + 56))) + 92))));
                        sqlite3_log(_30_, 29504, _32_);
                    }
                    while (false);
                    _31_ = this._storeInt(((_30_ = this._loadInt((_32_ + 56))) + 60), 0);
                    this._storeInt((_30_ + 96), ((this._loadInt((_30_ + 96))) + 1));
                    sqlite3Put4byte((_30_ = this._loadInt((_32_ + 32))), ((sqlite3Get4byte(_30_)) + 1));
                    this._storeInt(((this._loadInt((_32_ + 32))) + 4), (this._loadInt((_32_ + 40))));
                    walIndexWriteHdr((this._loadInt((_32_ + 56))));
                    this._storeInt((this._loadInt((_32_ + 44))), _31_);
                    _31_ = this._storeInt((_32_ + 36), 1);
                    label$7:
                    do {
                        label$6:
                        while (true) {
                            if ((this._loadInt((_32_ + 36))) > 4) {
                                break label$7;
                            }
                            this._storeInt((((this._loadInt((_32_ + 44))) + ((_30_ = this._loadInt((_32_ + 36))) << 2)) + 4), -1);
                            this._storeInt((_32_ + 36), (_30_ + _31_));
                            continue label$6;
                        }
                    }
                    while (false);
                    walUnlockExclusive((this._loadInt((_32_ + 56))), 4, 4);
                }
                while (false);
                walUnlockShared((this._loadInt((_32_ + 56))), 3);
                this._storeInt16(((this._loadInt((_32_ + 56))) + 36), 65535);
                this._storeInt((_32_ + 48), 0);
                label$8$end:
                do {
                    label$8:
                    while (true) {
                        if ((this._storeInt((_32_ + 52), (walTryBeginRead((this._loadInt((_32_ + 56))), (_32_ + 16), 1, (this._storeInt((_32_ + 48), ((this._loadInt((_32_ + 48))) + 1))))))) == -1) {
                            continue label$8;
                        }
                        break label$8$end;
                    }
                }
                while (false);
            }
            while (false);
            this._storeInt((_32_ + 60), (this._loadInt((_32_ + 52))));
        }
        while (false);
        _30_ = this._loadInt((_32_ + 60));
        this._storeInt((0 + 4), (_32_ + 64));
        return _30_;
    }

    @Override()
    public final void walEncodeFrame(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        this._storeInt((_35_ + 4), ((this._loadInt((_35_ + 28))) + 68));
        sqlite3Put4byte((this._loadInt((_35_ + 12))), (this._loadInt((_35_ + 24))));
        sqlite3Put4byte(((this._loadInt((_35_ + 12))) + 4), (this._loadInt((_35_ + 20))));
        memcpy(((this._loadInt((_35_ + 12))) + 8), ((this._loadInt((_35_ + 28))) + 76), 8);
        walChecksumBytes((this._storeInt((_35_ + 8), (((this._loadInt8u(((this._loadInt((_35_ + 28))) + 57))) == (((this._loadInt8s((0 + 29180))) == 0) ? 1 : 0)) ? 1 : 0))), (this._loadInt((_35_ + 12))), 8, (_34_ = this._loadInt((_35_ + 4))), _34_);
        walChecksumBytes((this._loadInt((_35_ + 8))), (this._loadInt((_35_ + 16))), (this._loadInt(((this._loadInt((_35_ + 28))) + 32))), (_34_ = this._loadInt((_35_ + 4))), _34_);
        sqlite3Put4byte(((this._loadInt((_35_ + 12))) + 16), (this._loadInt((this._loadInt((_35_ + 4))))));
        sqlite3Put4byte(((this._loadInt((_35_ + 12))) + 20), (this._loadInt(((this._loadInt((_35_ + 4))) + 4))));
        this._storeInt((0 + 4), (_35_ + 32));
        return;
    }

    @Override()
    public final int walTryBeginRead(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_34_ + 36), _31_);
        this._storeInt((_34_ + 32), _32_);
        this._storeInt((_34_ + 28), _33_);
        this._storeInt((_34_ + 8), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_34_ + 28))) < 6) {
                    break label$1;
                }
                this._storeInt((_34_ + 4), 1);
                label$2:
                do {
                    if ((this._loadInt((_34_ + 28))) < 101) {
                        break label$2;
                    }
                    this._storeInt((_34_ + 44), 15);
                    break label$0;
                }
                while (false);
                label$3:
                do {
                    if ((this._loadInt((_34_ + 28))) < 10) {
                        break label$3;
                    }
                    this._storeInt((_34_ + 4), (((this._loadInt((_34_ + 28))) * 238) + -2142));
                }
                while (false);
                sqlite3OsSleep((this._loadInt((this._loadInt((_34_ + 40))))), (this._loadInt((_34_ + 4))));
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt((_34_ + 32))) != 0) {
                    break label$4;
                }
                label$5:
                do {
                    if ((this._storeInt((_34_ + 8), (walIndexReadHdr((this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 36))))))) != 5) {
                        break label$5;
                    }
                    label$6:
                    do {
                        label$7:
                        do {
                            if ((this._loadInt((this._loadInt(((this._loadInt((_34_ + 40))) + 28))))) == 0) {
                                break label$7;
                            }
                            if ((this._storeInt((_34_ + 8), (walLockShared((this._loadInt((_34_ + 40))), 2)))) != 0) {
                                break label$6;
                            }
                            walUnlockShared((this._loadInt((_34_ + 40))), 2);
                            this._storeInt((_34_ + 8), -1);
                            break label$5;
                        }
                        while (false);
                        this._storeInt((_34_ + 8), -1);
                        break label$5;
                    }
                    while (false);
                    if ((this._loadInt((_34_ + 8))) != 5) {
                        break label$5;
                    }
                    this._storeInt((_34_ + 8), 261);
                }
                while (false);
                if ((this._loadInt((_34_ + 8))) == 0) {
                    break label$4;
                }
                this._storeInt((_34_ + 44), (this._loadInt((_34_ + 8))));
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 24), (walCkptInfo((this._loadInt((_34_ + 40))))));
            label$8:
            do {
                label$9:
                do {
                    label$10:
                    do {
                        label$11:
                        do {
                            if ((this._loadInt((_34_ + 32))) != 0) {
                                break label$11;
                            }
                            if ((this._loadInt((this._loadInt((_34_ + 24))))) != (this._loadInt(((this._loadInt((_34_ + 40))) + 60)))) {
                                break label$11;
                            }
                            this._storeInt((_34_ + 8), (walLockShared((this._loadInt((_34_ + 40))), 3)));
                            walShmBarrier((this._loadInt((_34_ + 40))));
                            if ((this._loadInt((_34_ + 8))) == 0) {
                                break label$10;
                            }
                            if ((this._loadInt((_34_ + 8))) == 5) {
                                break label$11;
                            }
                            this._storeInt((_34_ + 44), (this._loadInt((_34_ + 8))));
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_34_ + 16), (this._storeInt((_34_ + 20), 0)));
                        _32_ = this._storeInt((_34_ + 12), 1);
                        label$13:
                        do {
                            label$12:
                            while (true) {
                                if ((this._loadInt((_34_ + 12))) > 4) {
                                    break label$13;
                                }
                                _33_ = this._storeInt(_34_, (this._loadInt((((this._loadInt((_34_ + 24))) + ((this._loadInt((_34_ + 12))) << 2)) + 4))));
                                label$14:
                                do {
                                    if (((this._loadInt((_34_ + 20))) & 4294967295L) > (_33_ & 4294967295L)) {
                                        break label$14;
                                    }
                                    if (((this._loadInt(_34_)) & 4294967295L) > ((this._loadInt(((this._loadInt((_34_ + 40))) + 60))) & 4294967295L)) {
                                        break label$14;
                                    }
                                    this._storeInt((_34_ + 20), (this._loadInt(_34_)));
                                    this._storeInt((_34_ + 16), (this._loadInt((_34_ + 12))));
                                }
                                while (false);
                                this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 12))) + _32_));
                                continue label$12;
                            }
                        }
                        while (false);
                        label$15:
                        do {
                            if (((this._loadInt8u(((this._loadInt((_34_ + 40))) + 41))) & 2) != 0) {
                                break label$15;
                            }
                            label$16:
                            do {
                                if (((this._loadInt((_34_ + 20))) & 4294967295L) < ((this._loadInt(((this._loadInt((_34_ + 40))) + 60))) & 4294967295L)) {
                                    break label$16;
                                }
                                if ((this._loadInt((_34_ + 16))) != 0) {
                                    break label$15;
                                }
                            }
                            while (false);
                            _33_ = this._storeInt((_34_ + 12), 1);
                            label$17:
                            do {
                                label$19:
                                do {
                                    label$18:
                                    while (true) {
                                        if ((this._loadInt((_34_ + 12))) > 4) {
                                            break label$15;
                                        }
                                        if ((this._storeInt((_34_ + 8), (walLockExclusive((this._loadInt((_34_ + 40))), ((this._loadInt((_34_ + 12))) + 3), _33_)))) == 0) {
                                            break label$17;
                                        }
                                        if ((this._loadInt((_34_ + 8))) != 5) {
                                            break label$19;
                                        }
                                        this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 12))) + _33_));
                                        continue label$18;
                                    }
                                }
                                while (false);
                                this._storeInt((_34_ + 44), (this._loadInt((_34_ + 8))));
                                break label$0;
                            }
                            while (false);
                            this._storeInt((_34_ + 20), (this._storeInt((((this._loadInt((_34_ + 24))) + ((this._loadInt((_34_ + 12))) << 2)) + 4), (this._loadInt(((this._loadInt((_34_ + 40))) + 60))))));
                            this._storeInt((_34_ + 16), (this._loadInt((_34_ + 12))));
                            walUnlockExclusive((this._loadInt((_34_ + 40))), ((this._loadInt((_34_ + 12))) + 3), 1);
                        }
                        while (false);
                        label$20:
                        do {
                            label$21:
                            do {
                                if ((this._loadInt((_34_ + 16))) == 0) {
                                    break label$21;
                                }
                                if ((this._storeInt((_34_ + 8), (walLockShared((this._loadInt((_34_ + 40))), ((this._loadInt((_34_ + 16))) + 3))))) == 0) {
                                    break label$20;
                                }
                                _33_ = -1;
                                label$22:
                                do {
                                    if ((this._loadInt((_34_ + 8))) == 5) {
                                        break label$22;
                                    }
                                    _33_ = this._loadInt((_34_ + 8));
                                }
                                while (false);
                                this._storeInt((_34_ + 44), _33_);
                                break label$0;
                            }
                            while (false);
                            _temp$0 = -1;
                            _temp$1 = 520;
                            _temp$2 = ((this._loadInt((_34_ + 8))) == 5) ? _temp$0 : _temp$1;
                            this._storeInt((_34_ + 44), _temp$2);
                            break label$0;
                        }
                        while (false);
                        walShmBarrier((this._loadInt((_34_ + 40))));
                        label$23:
                        do {
                            if ((this._loadInt((((this._loadInt((_34_ + 24))) + ((this._loadInt((_34_ + 16))) << 2)) + 4))) != (this._loadInt((_34_ + 20)))) {
                                break label$23;
                            }
                            if ((memcmp((walIndexHdr((this._loadInt((_34_ + 40))))), ((this._loadInt((_34_ + 40))) + 44), 48)) == 0) {
                                break label$9;
                            }
                        }
                        while (false);
                        walUnlockShared((this._loadInt((_34_ + 40))), ((this._loadInt((_34_ + 16))) + 3));
                        this._storeInt((_34_ + 44), -1);
                        break label$0;
                    }
                    while (false);
                    if ((memcmp((walIndexHdr((this._loadInt((_34_ + 40))))), ((this._loadInt((_34_ + 40))) + 44), 48)) == 0) {
                        break label$8;
                    }
                    walUnlockShared((this._loadInt((_34_ + 40))), 3);
                    this._storeInt((_34_ + 44), -1);
                    break label$0;
                }
                while (false);
                this._storeInt16(((this._loadInt((_34_ + 40))) + 36), (this._loadInt((_34_ + 16))));
                this._storeInt((_34_ + 44), (this._loadInt((_34_ + 8))));
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 44), (this._storeInt16(((this._loadInt((_34_ + 40))) + 36), 0)));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int sqlite3OsSleep(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this._iiiTable[this._tableIndices[this._loadInt(((_30_ = this._loadInt((_32_ + 12))) + 60))]].invoke(_30_, _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void sqlite3SchemaClear(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt((((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 40) + 12), (this._loadInt((_30_ + 20))));
        this._storeInt(((_31_ + 40) + 8), (this._loadInt((_30_ + 16))));
        this._storeInt((_31_ + 44), (this._loadInt(((_30_ = this._storeInt((_31_ + 16), (this._storeInt((_31_ + 60), _30_)))) + 12))));
        this._storeInt((_31_ + 40), (this._loadInt((_30_ + 8))));
        this._storeInt(((_31_ + 24) + 12), (this._loadInt(((_30_ = this._loadInt((_31_ + 16))) + 52))));
        this._storeInt((_32_ = (_31_ + 24) + 8), (this._loadInt((_30_ + 48))));
        this._storeInt((_31_ + 24), (this._loadInt((_30_ + 40))));
        this._storeInt((_31_ + 28), (this._loadInt((_30_ + 44))));
        sqlite3HashInit(((this._loadInt((_31_ + 16))) + 40));
        sqlite3HashClear(((this._loadInt((_31_ + 16))) + 24));
        this._storeInt((_31_ + 20), (this._loadInt(_32_)));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 20))) == 0) {
                    break label$1;
                }
                sqlite3DeleteTrigger(0, (this._loadInt(((this._loadInt((_31_ + 20))) + 8))));
                this._storeInt((_31_ + 20), (this._loadInt((this._loadInt((_31_ + 20))))));
                continue label$0;
            }
        }
        while (false);
        sqlite3HashClear((_31_ + 24));
        sqlite3HashInit(((this._loadInt((_31_ + 16))) + 8));
        this._storeInt((_31_ + 20), (this._loadInt((_31_ + 48))));
        label$3:
        do {
            label$2:
            while (true) {
                if ((this._loadInt((_31_ + 20))) == 0) {
                    break label$3;
                }
                sqlite3DeleteTable(0, (this._storeInt((_31_ + 12), (this._loadInt(((this._loadInt((_31_ + 20))) + 8))))));
                this._storeInt((_31_ + 20), (this._loadInt((this._loadInt((_31_ + 20))))));
                continue label$2;
            }
        }
        while (false);
        sqlite3HashClear((_31_ + 40));
        sqlite3HashClear(((this._loadInt((_31_ + 16))) + 56));
        this._storeInt(((_30_ = this._loadInt((_31_ + 16))) + 72), 0);
        label$4:
        do {
            if (((this._loadInt16u((_30_ + 78))) & 1) == 0) {
                break label$4;
            }
            this._storeInt(((_30_ = this._loadInt((_31_ + 16))) + 4), ((this._loadInt((_30_ + 4))) + 1));
            this._storeInt16((_30_ + 78), ((this._loadInt16u((_30_ + 78))) & 65534));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 64));
        return;
    }

    @Override()
    public final void sqlite3VtabUnlockList(int _30_)
    {
        int _31_ = 0;
        _30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 316))));
        this._storeInt(((this._loadInt((_31_ + 12))) + 316), 0);
        label$0:
        do {
            if (_30_ == 0) {
                break label$0;
            }
            sqlite3ExpirePreparedStatements((this._loadInt((_31_ + 12))));
            label$1$end:
            do {
                label$1:
                while (true) {
                    this._storeInt((_31_ + 4), (this._loadInt(((this._loadInt((_31_ + 8))) + 24))));
                    sqlite3VtabUnlock((this._loadInt((_31_ + 8))));
                    if ((this._storeInt((_31_ + 8), (this._loadInt((_31_ + 4))))) != 0) {
                        continue label$1;
                    }
                    break label$1$end;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3HashInit(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _32_ = this._loadInt((0 + 4));
        _31_ = this._storeInt(_30_, 0);
        this._storeLong((_30_ + 4), 0L);
        this._storeInt((_30_ + 12), _31_);
        this._storeInt(((_32_ - 16) + 12), _30_);
        return;
    }

    @Override()
    public final int sqlite3PagerBackupPtr(int _30_)
    {
        return ((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 88);
    }

    @Override()
    public final void pagerUnlockIfUnused(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((sqlite3PcacheRefCount((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 168))))) != 0) {
                break label$0;
            }
            pagerUnlockAndRollback((this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void pagerUnlockAndRollback(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 15))) == 6) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_31_ + 12))) + 15))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 12))) + 15))) < 2) {
                    break label$1;
                }
                sqlite3BeginBenignMalloc();
                sqlite3PagerRollback((this._loadInt((_31_ + 12))));
                sqlite3EndBenignMalloc();
                break label$0;
            }
            while (false);
            if ((this._loadInt8u(((this._loadInt((_31_ + 12))) + 4))) != 0) {
                break label$0;
            }
            pager_end_transaction((this._loadInt((_31_ + 12))), 0);
        }
        while (false);
        pager_unlock((this._loadInt((_31_ + 12))));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void pager_unlock(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        sqlite3BitvecDestroy((this._loadInt(((this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 56))));
        _31_ = this._storeInt(((_30_ = this._loadInt((_32_ + 12))) + 56), 0);
        releaseAllSavepoints(_30_);
        label$0:
        do {
            label$1:
            do {
                if ((pagerUseWal((this._loadInt((_32_ + 12))))) == 0) {
                    break label$1;
                }
                sqlite3WalEndReadTransaction((this._loadInt(((this._loadInt((_32_ + 12))) + 172))));
                this._storeInt8(((this._loadInt((_32_ + 12))) + 15), _31_);
                break label$0;
            }
            while (false);
            if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 4))) != 0) {
                break label$0;
            }
            _30_ = 0;
            label$2:
            do {
                if ((this._loadInt((this._loadInt(((this._loadInt((_32_ + 12))) + 60))))) == 0) {
                    break label$2;
                }
                _30_ = sqlite3OsDeviceCharacteristics((this._loadInt(((this._loadInt((_32_ + 12))) + 60))));
            }
            while (false);
            this._storeInt((_32_ + 4), _30_);
            label$3:
            do {
                label$4:
                do {
                    if (((this._loadInt8u((_32_ + 5))) & 8) == 0) {
                        break label$4;
                    }
                    if (((this._loadInt8u(((this._loadInt((_32_ + 12))) + 5))) & 5) == 1) {
                        break label$3;
                    }
                }
                while (false);
                sqlite3OsClose((this._loadInt(((this._loadInt((_32_ + 12))) + 64))));
            }
            while (false);
            label$5:
            do {
                if ((this._storeInt((_32_ + 8), (pagerUnlockDb((this._loadInt((_32_ + 12))), 0)))) == 0) {
                    break label$5;
                }
                if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 15))) != 6) {
                    break label$5;
                }
                this._storeInt8(((this._loadInt((_32_ + 12))) + 16), 5);
            }
            while (false);
            this._storeInt8(((_30_ = this._loadInt((_32_ + 12))) + 17), (this._storeInt8((_30_ + 15), 0)));
        }
        while (false);
        label$6:
        do {
            if ((this._loadInt(((this._loadInt((_32_ + 12))) + 40))) == 0) {
                break label$6;
            }
            pager_reset((this._loadInt((_32_ + 12))));
            this._storeInt8(((_30_ = this._loadInt((_32_ + 12))) + 15), (this._storeInt((_30_ + 40), 0)));
            this._storeInt8((_30_ + 17), (this._loadInt8u((_30_ + 12))));
        }
        while (false);
        this._storeLong(((_30_ = this._loadInt((_32_ + 12))) + 72), (this._storeLong((_30_ + 80), 0L)));
        this._storeInt8((_30_ + 18), 0);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3WalEndReadTransaction(int _30_)
    {
        int _31_ = 0;
        sqlite3WalEndWriteTransaction((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        label$0:
        do {
            if ((this._loadInt16s(((this._loadInt((_31_ + 12))) + 36))) < 0) {
                break label$0;
            }
            walUnlockShared((_30_ = this._loadInt((_31_ + 12))), ((this._loadInt16s((_30_ + 36))) + 3));
            this._storeInt16(((this._loadInt((_31_ + 12))) + 36), 65535);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3PagerIsMemdb(int _30_)
    {
        return (this._loadInt8u(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 14)));
    }

    @Override()
    public final int querySharedCacheTableLock(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt8((_33_ + 19), _32_);
        this._storeInt((_33_ + 12), (this._loadInt(((this._loadInt((_33_ + 24))) + 4))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 24))) + 9))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt(((this._loadInt((_33_ + 12))) + 80))) == (this._loadInt((_33_ + 24)))) {
                        break label$2;
                    }
                    if ((this._loadInt8u(((this._loadInt((_33_ + 12))) + 84))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_33_ + 28), 262);
                    return (this._loadInt((_33_ + 28)));
                }
                while (false);
                this._storeInt((_33_ + 8), (this._loadInt(((this._loadInt((_33_ + 12))) + 76))));
                label$4:
                do {
                    label$3:
                    while (true) {
                        if ((this._loadInt((_33_ + 8))) == 0) {
                            break label$0;
                        }
                        label$5:
                        do {
                            if ((this._loadInt((this._loadInt((_33_ + 8))))) == (this._loadInt((_33_ + 24)))) {
                                break label$5;
                            }
                            if ((this._loadInt(((this._loadInt((_33_ + 8))) + 4))) != (this._loadInt((_33_ + 20)))) {
                                break label$5;
                            }
                            if ((this._loadInt8u(((this._loadInt((_33_ + 8))) + 8))) != (this._loadInt8u((_33_ + 19)))) {
                                break label$4;
                            }
                        }
                        while (false);
                        this._storeInt((_33_ + 8), (this._loadInt(((this._loadInt((_33_ + 8))) + 12))));
                        continue label$3;
                    }
                }
                while (false);
                label$6:
                do {
                    if ((this._loadInt8u((_33_ + 19))) != 2) {
                        break label$6;
                    }
                    this._storeInt8(((this._loadInt((_33_ + 12))) + 85), 1);
                }
                while (false);
                this._storeInt((_33_ + 28), 262);
                return (this._loadInt((_33_ + 28)));
            }
            while (false);
            this._storeInt((_33_ + 28), 0);
            return (this._loadInt((_33_ + 28)));
        }
        while (false);
        this._storeInt((_33_ + 28), 0);
        return (this._loadInt((_33_ + 28)));
    }

    @Override()
    public final int lockBtree(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        _30_ = this._storeInt((_31_ + 24), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_31_ + 36), (sqlite3PagerSharedLock((this._loadInt((this._loadInt((_31_ + 40))))))))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 44), (this._loadInt((_31_ + 36))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._storeInt((_31_ + 36), (btreeGetPage((this._loadInt((_31_ + 40))), 1, (_31_ + 32), _30_)))) == 0) {
                    break label$2;
                }
                this._storeInt((_31_ + 44), (this._loadInt((_31_ + 36))));
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 28), (this._storeInt((_31_ + 20), (sqlite3Get4byte(((this._loadInt(((this._loadInt((_31_ + 32))) + 64))) + 28))))));
            sqlite3PagerPagecount((this._loadInt((this._loadInt((_31_ + 40))))), (_31_ + 24));
            label$3:
            do {
                label$4:
                do {
                    if ((this._loadInt((_31_ + 28))) == 0) {
                        break label$4;
                    }
                    if ((this._loadInt(((_30_ = this._loadInt(((this._loadInt((_31_ + 32))) + 64))) + 24))) == (this._loadInt((_30_ + 92)))) {
                        break label$3;
                    }
                }
                while (false);
                this._storeInt((_31_ + 28), (this._loadInt((_31_ + 24))));
            }
            while (false);
            label$5:
            do {
                label$6:
                do {
                    if ((this._loadInt((_31_ + 28))) < 1) {
                        break label$6;
                    }
                    this._storeInt((_31_ + 8), (this._loadInt(((this._loadInt((_31_ + 32))) + 64))));
                    this._storeInt((_31_ + 36), 26);
                    if ((memcmp((this._loadInt((_31_ + 8))), 29536, 16)) != 0) {
                        break label$5;
                    }
                    label$7:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_31_ + 8))) + 18))) < 3) {
                            break label$7;
                        }
                        this._storeInt8(((this._loadInt((_31_ + 40))) + 16), 1);
                    }
                    while (false);
                    if ((this._loadInt8u(((this._loadInt((_31_ + 8))) + 19))) > 2) {
                        break label$5;
                    }
                    label$8:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_31_ + 8))) + 19))) != 2) {
                            break label$8;
                        }
                        if ((this._loadInt8u(((this._loadInt((_31_ + 40))) + 24))) != 0) {
                            break label$8;
                        }
                        this._storeInt((_31_ + 4), 0);
                        if ((this._storeInt((_31_ + 36), (sqlite3PagerOpenWal((this._loadInt((this._loadInt((_31_ + 40))))), (_31_ + 4))))) != 0) {
                            break label$5;
                        }
                        label$9:
                        do {
                            if ((this._loadInt((_31_ + 4))) == 0) {
                                break label$9;
                            }
                            this._storeInt((_31_ + 36), 26);
                            break label$8;
                        }
                        while (false);
                        releasePage((this._loadInt((_31_ + 32))));
                        this._storeInt((_31_ + 44), 0);
                        break label$0;
                    }
                    while (false);
                    if ((memcmp(((this._loadInt((_31_ + 8))) + 21), 29552, 3)) != 0) {
                        break label$5;
                    }
                    if ((((_30_ = this._storeInt((_31_ + 16), (((this._loadInt8u(((_30_ = this._loadInt((_31_ + 8))) + 16))) << 8) | ((this._loadInt8u((_30_ + 17))) << 16)))) + -1) & _30_) != 0) {
                        break label$5;
                    }
                    if (((this._loadInt((_31_ + 16))) & 4294967295L) > (65536 & 4294967295L)) {
                        break label$5;
                    }
                    if (((this._loadInt((_31_ + 16))) & 4294967295L) < (257 & 4294967295L)) {
                        break label$5;
                    }
                    this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 16))) - (this._loadInt8u(((this._loadInt((_31_ + 8))) + 20)))));
                    label$10:
                    do {
                        if ((this._loadInt((_31_ + 16))) == (this._loadInt(((this._loadInt((_31_ + 40))) + 36)))) {
                            break label$10;
                        }
                        releasePage((this._loadInt((_31_ + 32))));
                        this._storeInt(((_30_ = this._loadInt((_31_ + 40))) + 36), (this._loadInt((_31_ + 16))));
                        this._storeInt((_30_ + 40), (this._loadInt((_31_ + 12))));
                        freeTempSpace((this._loadInt((_31_ + 40))));
                        this._storeInt((_31_ + 44), (this._storeInt((_31_ + 36), (sqlite3PagerSetPagesize((this._loadInt((_30_ = this._loadInt((_31_ + 40))))), (_30_ + 36), ((this._loadInt((_31_ + 16))) - (this._loadInt((_31_ + 12)))))))));
                        break label$0;
                    }
                    while (false);
                    label$11:
                    do {
                        if (((this._loadInt8u(((this._loadInt(((this._loadInt((_31_ + 40))) + 4))) + 14))) >>> 7) != 0) {
                            break label$11;
                        }
                        if ((this._loadInt((_31_ + 28))) <= (this._loadInt((_31_ + 24)))) {
                            break label$11;
                        }
                        this._storeInt((_31_ + 36), (sqlite3CorruptError(49904)));
                        break label$5;
                    }
                    while (false);
                    if (((this._loadInt((_31_ + 12))) & 4294967295L) < (480 & 4294967295L)) {
                        break label$5;
                    }
                    this._storeInt(((_30_ = this._loadInt((_31_ + 40))) + 40), (this._loadInt((_31_ + 12))));
                    this._storeInt((_30_ + 36), (this._loadInt((_31_ + 16))));
                    _30_ = sqlite3Get4byte(((this._loadInt((_31_ + 8))) + 52));
                    this._storeInt8(((this._loadInt((_31_ + 40))) + 21), ((_30_ != 0) ? 1 : 0));
                    _30_ = sqlite3Get4byte(((this._loadInt((_31_ + 8))) + 64));
                    this._storeInt8(((this._loadInt((_31_ + 40))) + 22), ((_30_ != 0) ? 1 : 0));
                }
                while (false);
                this._storeInt16(((_30_ = this._loadInt((_31_ + 40))) + 26), (((((_32_ = this._loadInt((_30_ + 40))) << 6) + -768) / 255) + -23));
                this._storeInt16((_30_ + 28), ((((_32_ << 5) + -384) / 255) + -23));
                this._storeInt16(((_30_ = this._loadInt((_31_ + 40))) + 30), ((this._loadInt((_30_ + 40))) + -35));
                this._storeInt16(((_30_ = this._loadInt((_31_ + 40))) + 32), (((((this._loadInt((_30_ + 40))) << 5) + -384) / 255) + -23));
                this._storeInt(((this._loadInt((_31_ + 40))) + 12), (this._loadInt((_31_ + 32))));
                this._storeInt(((this._loadInt((_31_ + 40))) + 48), (this._loadInt((_31_ + 28))));
                this._storeInt((_31_ + 44), 0);
                break label$0;
            }
            while (false);
            releasePage((this._loadInt((_31_ + 32))));
            this._storeInt(((this._loadInt((_31_ + 40))) + 12), 0);
            this._storeInt((_31_ + 44), (this._loadInt((_31_ + 36))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 44));
        this._storeInt((0 + 4), (_31_ + 48));
        return _30_;
    }

    @Override()
    public final int sqlite3TempInMemory(int _30_)
    {
        return (((this._loadInt8u(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 29))) == 2) ? 1 : 0);
    }

    @Override()
    public final int sqlite3PagerBegin(int _30_, int _31_, int _32_)
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
                if ((this._loadInt(((this._loadInt((_33_ + 24))) + 40))) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 28), (this._loadInt(((this._loadInt((_33_ + 24))) + 40))));
                break label$0;
            }
            while (false);
            this._storeInt8(((_32_ = this._loadInt((_33_ + 24))) + 21), (this._loadInt((_33_ + 16))));
            label$2:
            do {
                if ((this._loadInt8u((_32_ + 15))) != 1) {
                    break label$2;
                }
                label$3:
                do {
                    label$4:
                    do {
                        label$5:
                        do {
                            label$6:
                            do {
                                if ((pagerUseWal((this._loadInt((_33_ + 24))))) == 0) {
                                    break label$6;
                                }
                                if ((this._loadInt8u(((this._loadInt((_33_ + 24))) + 4))) == 0) {
                                    break label$4;
                                }
                                if ((sqlite3WalExclusiveMode((this._loadInt(((this._loadInt((_33_ + 24))) + 172))), -1)) == 0) {
                                    break label$4;
                                }
                                if ((this._storeInt((_33_ + 12), (pagerLockDb((this._loadInt((_33_ + 24))), 4)))) == 0) {
                                    break label$5;
                                }
                                this._storeInt((_33_ + 28), (this._loadInt((_33_ + 12))));
                                break label$0;
                            }
                            while (false);
                            if ((this._storeInt((_33_ + 12), (pagerLockDb((this._loadInt((_33_ + 24))), 2)))) != 0) {
                                break label$3;
                            }
                            if ((this._loadInt((_33_ + 20))) == 0) {
                                break label$3;
                            }
                            this._storeInt((_33_ + 12), (pager_wait_on_lock((this._loadInt((_33_ + 24))), 4)));
                            break label$3;
                        }
                        while (false);
                        sqlite3WalExclusiveMode((this._loadInt(((this._loadInt((_33_ + 24))) + 172))), 1);
                    }
                    while (false);
                    this._storeInt((_33_ + 12), (sqlite3WalBeginWriteTransaction((this._loadInt(((this._loadInt((_33_ + 24))) + 172))))));
                }
                while (false);
                if ((this._loadInt((_33_ + 12))) != 0) {
                    break label$2;
                }
                this._storeInt8(((_32_ = this._loadInt((_33_ + 24))) + 15), 2);
                this._storeInt((_32_ + 32), (this._storeInt((_32_ + 36), (this._loadInt((_32_ + 24))))));
                this._storeInt(((_32_ = this._loadInt((_33_ + 24))) + 28), (this._loadInt((_32_ + 24))));
                this._storeLong(((this._loadInt((_33_ + 24))) + 72), 0L);
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
    public final int newDatabase(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        int _33_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_)) + 48))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 16), (this._loadInt(((this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 24))) + 12))))) + 64))));
            label$2:
            do {
                if ((this._storeInt((_32_ + 12), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_32_ + 20))) + 68))))))) == 0) {
                    break label$2;
                }
                this._storeInt((_32_ + 28), (this._loadInt((_32_ + 12))));
                break label$0;
            }
            while (false);
            memcpy((this._loadInt((_32_ + 16))), 29536, 16);
            this._storeInt8(((_30_ = this._loadInt((_32_ + 16))) + 16), ((this._loadInt(((_33_ = this._loadInt((_32_ + 24))) + 36))) >>> 8));
            this._storeInt8((_30_ + 17), (this._loadInt16u((_33_ + 38))));
            _30_ = this._storeInt8(((this._loadInt((_32_ + 16))) + 18), 1);
            this._storeInt8(((this._loadInt((_32_ + 16))) + 19), _30_);
            this._storeInt8(((this._loadInt((_32_ + 16))) + 20), ((this._loadInt(((_33_ = this._loadInt((_32_ + 24))) + 36))) - (this._loadInt((_33_ + 40)))));
            _33_ = this._storeInt8(((this._loadInt((_32_ + 16))) + 21), 64);
            _31_ = this._storeInt8(((this._loadInt((_32_ + 16))) + 22), 32);
            this._storeInt8(((this._loadInt((_32_ + 16))) + 23), _31_);
            memset(((this._loadInt((_32_ + 16))) + 24), 0, 76);
            zeroPage((this._loadInt((_32_ + 20))), 13);
            this._storeInt8(((_31_ = this._loadInt((_32_ + 24))) + 17), _30_);
            sqlite3Put4byte(((this._loadInt((_32_ + 16))) + 52), (this._loadInt8u((_31_ + 21))));
            sqlite3Put4byte((_33_ + (this._loadInt((_32_ + 16)))), (this._loadInt8u(((this._loadInt((_32_ + 24))) + 22))));
            this._storeInt(((this._loadInt((_32_ + 24))) + 48), _30_);
            this._storeInt8(((this._loadInt((_32_ + 16))) + 31), _30_);
            this._storeInt((_32_ + 28), 0);
        }
        while (false);
        _30_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _30_;
    }

    @Override()
    public final int btreeInvokeBusyHandler(int _30_)
    {
        int _31_ = 0;
        _30_ = sqlite3InvokeBusyHandler(((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._storeInt((_31_ + 12), _30_)))) + 4))) + 428));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3PagerOpenSavepoint(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 16), 0);
        _31_ = this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 24))) + 96))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_32_ + 20))) <= _31_) {
                            break label$3;
                        }
                        if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 6))) == 0) {
                            break label$3;
                        }
                        if ((this._storeInt((_32_ + 4), (sqlite3Realloc((this._loadInt(((this._loadInt((_32_ + 24))) + 92))), ((this._loadInt((_32_ + 20))) * 48))))) == 0) {
                            break label$2;
                        }
                        memset(((this._loadInt((_32_ + 4))) + ((_31_ = this._loadInt((_32_ + 12))) * 48)), 0, (((this._loadInt((_32_ + 20))) - _31_) * 48));
                        this._storeInt(((this._loadInt((_32_ + 24))) + 92), (this._loadInt((_32_ + 4))));
                        this._storeInt((_32_ + 8), (this._loadInt((_32_ + 12))));
                        label$5:
                        do {
                            label$4:
                            while (true) {
                                if ((this._loadInt((_32_ + 8))) >= (this._loadInt((_32_ + 20)))) {
                                    break label$5;
                                }
                                this._storeInt((((this._loadInt((_32_ + 4))) + ((this._loadInt((_32_ + 8))) * 48)) + 20), (this._loadInt(((_31_ = this._loadInt((_32_ + 24))) + 24))));
                                label$6:
                                do {
                                    label$7:
                                    do {
                                        if ((this._loadInt((this._loadInt((_31_ + 64))))) == 0) {
                                            break label$7;
                                        }
                                        if ((this._loadLong(((this._loadInt((_32_ + 24))) + 72))) < 1L) {
                                            break label$7;
                                        }
                                        this._storeLong(((this._loadInt((_32_ + 4))) + ((this._loadInt((_32_ + 8))) * 48)), (this._loadLong(((this._loadInt((_32_ + 24))) + 72))));
                                        break label$6;
                                    }
                                    while (false);
                                    this._storeLong(((this._loadInt((_32_ + 4))) + ((this._loadInt((_32_ + 8))) * 48)), (this._loadLong32u(((this._loadInt((_32_ + 24))) + 124))));
                                }
                                while (false);
                                this._storeInt((((this._loadInt((_32_ + 4))) + ((this._loadInt((_32_ + 8))) * 48)) + 24), (this._loadInt(((_31_ = this._loadInt((_32_ + 24))) + 52))));
                                _31_ = sqlite3BitvecCreate((this._loadInt((_31_ + 24))));
                                if ((this._storeInt((((this._loadInt((_32_ + 4))) + ((this._loadInt((_32_ + 8))) * 48)) + 16), _31_)) == 0) {
                                    break label$1;
                                }
                                label$8:
                                do {
                                    if ((pagerUseWal((this._loadInt((_32_ + 24))))) == 0) {
                                        break label$8;
                                    }
                                    sqlite3WalSavepoint((this._loadInt(((this._loadInt((_32_ + 24))) + 172))), (((this._loadInt((_32_ + 4))) + ((this._loadInt((_32_ + 8))) * 48)) + 28));
                                }
                                while (false);
                                this._storeInt((_32_ + 8), (this._storeInt(((this._loadInt((_32_ + 24))) + 96), ((this._loadInt((_32_ + 8))) + 1))));
                                continue label$4;
                            }
                        }
                        while (false);
                    }
                    while (false);
                    this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 28), 7);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 28), 7);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }
}
