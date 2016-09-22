package com.wrmsr.wava;

abstract class sqlite3$15
        extends sqlite3$14
{
    protected sqlite3$15(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final void sqlite3WalSavepoint(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_31_ = this._storeInt((_32_ + 8), _31_)), (this._loadInt(((_30_ = this._loadInt((_32_ + 12))) + 60))));
        this._storeInt((_31_ + 4), (this._loadInt((_30_ + 68))));
        this._storeInt(((this._loadInt((_32_ + 8))) + 8), (this._loadInt(((this._loadInt((_32_ + 12))) + 72))));
        this._storeInt(((this._loadInt((_32_ + 8))) + 12), (this._loadInt(((this._loadInt((_32_ + 12))) + 96))));
        return;
    }

    @Override()
    public final int sqlite3InvokeBusyHandler(int _30_)
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
                        if ((this._loadInt((this._loadInt((_31_ + 8))))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt(((this._loadInt((_31_ + 8))) + 8))) <= -1) {
                            break label$3;
                        }
                        if ((this._storeInt((_31_ + 4), (this._iiiTable[this._tableIndices[this._loadInt((_30_ = this._loadInt((_31_ + 8))))]].invoke((this._loadInt((_30_ + 4))), (this._loadInt((_30_ + 8))))))) == 0) {
                            break label$2;
                        }
                        this._storeInt(((_30_ = this._loadInt((_31_ + 8))) + 8), ((this._loadInt((_30_ + 8))) + 1));
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_31_ + 12), 0);
                    break label$0;
                }
                while (false);
                this._storeInt(((this._loadInt((_31_ + 8))) + 8), -1);
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
    public final void zeroPage(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 28))) + 64))));
        this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt((_32_ + 28))) + 60))));
        this._storeInt8((_32_ + 15), (this._loadInt8u(((this._loadInt((_32_ + 28))) + 5))));
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_32_ + 16))) + 18))) == 0) {
                break label$0;
            }
            memset(((this._loadInt((_32_ + 20))) + (_31_ = this._loadInt8u((_32_ + 15)))), 0, ((this._loadInt(((this._loadInt((_32_ + 16))) + 40))) - _31_));
        }
        while (false);
        this._storeInt16((_32_ + 12), (((_31_ = this._loadInt8u((_32_ + 15))) + (((((this._storeInt8((_31_ + (this._loadInt((_32_ + 20)))), (this._loadInt((_32_ + 24))))) & 8) == 0) ? 1 : 0) << 2)) + 8));
        memset((((this._loadInt((_32_ + 20))) + (this._loadInt8u((_32_ + 15)))) + 1), 0, 4);
        _30_ = this._storeInt8(((_31_ = (this._loadInt((_32_ + 20))) + (this._loadInt8u((_32_ + 15)))) + 7), 0);
        this._storeInt8((_31_ + 5), ((this._loadInt(((this._loadInt((_32_ + 16))) + 40))) >>> 8));
        this._storeInt8((((this._loadInt((_32_ + 20))) + (this._loadInt8u((_32_ + 15)))) + 6), (this._loadInt(((this._loadInt((_32_ + 16))) + 40))));
        this._storeInt16(((this._loadInt((_32_ + 28))) + 14), ((this._loadInt(((this._loadInt((_32_ + 16))) + 40))) - (this._loadInt16u((_32_ + 12)))));
        decodeFlags((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 24))));
        this._storeInt16(((_31_ = this._loadInt((_32_ + 28))) + 12), (this._loadInt16u((_32_ + 12))));
        this._storeInt8((_31_ + 5), (this._loadInt8u((_32_ + 15))));
        _31_ = this._storeInt8(((this._loadInt((_32_ + 28))) + 1), _30_);
        this._storeInt16(((this._loadInt((_32_ + 28))) + 18), ((this._loadInt(((this._loadInt((_32_ + 16))) + 36))) + -1));
        this._storeInt16(((this._loadInt((_32_ + 28))) + 16), _31_);
        this._storeInt8((this._loadInt((_32_ + 28))), 1);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final int sqlite3WalBeginWriteTransaction(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)) + 41))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 12), 8);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._storeInt((_31_ + 4), (walLockExclusive((this._loadInt((_31_ + 8))), 0, 1)))) == 0) {
                    break label$2;
                }
                this._storeInt((_31_ + 12), (this._loadInt((_31_ + 4))));
                break label$0;
            }
            while (false);
            this._storeInt8(((_30_ = this._loadInt((_31_ + 8))) + 39), 1);
            label$3:
            do {
                if ((memcmp((_30_ + 44), (walIndexHdr(_30_)), 48)) == 0) {
                    break label$3;
                }
                walUnlockExclusive((this._loadInt((_31_ + 8))), 0, 1);
                this._storeInt8(((this._loadInt((_31_ + 8))) + 39), 0);
                this._storeInt((_31_ + 4), 5);
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
    public final int sqlite3PagerSharedLock(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_31_ + 52), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 56))) + 14))) == 0) {
                    break label$1;
                }
                if ((this._loadInt(((this._loadInt((_31_ + 56))) + 40))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 60), (this._loadInt(((this._loadInt((_31_ + 56))) + 40))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                label$3:
                do {
                    if ((pagerUseWal((this._loadInt((_31_ + 56))))) != 0) {
                        break label$3;
                    }
                    if ((this._loadInt8u(((this._loadInt((_31_ + 56))) + 15))) != 0) {
                        break label$3;
                    }
                    _30_ = this._storeInt((_31_ + 48), 1);
                    label$4:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_31_ + 56))) + 7))) != 0) {
                            break label$4;
                        }
                        if ((this._storeInt((_31_ + 52), (pager_wait_on_lock((this._loadInt((_31_ + 56))), _30_)))) != 0) {
                            break label$2;
                        }
                    }
                    while (false);
                    label$5:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_31_ + 56))) + 16))) > _30_) {
                            break label$5;
                        }
                        this._storeInt((_31_ + 52), (hasHotJournal((this._loadInt((_31_ + 56))), (_31_ + 48))));
                    }
                    while (false);
                    if ((this._loadInt((_31_ + 52))) != 0) {
                        break label$2;
                    }
                    label$6:
                    do {
                        if ((this._loadInt((_31_ + 48))) == 0) {
                            break label$6;
                        }
                        if ((this._storeInt((_31_ + 52), (pagerLockDb((this._loadInt((_31_ + 56))), 4)))) != 0) {
                            break label$2;
                        }
                        label$7:
                        do {
                            if ((this._loadInt((this._loadInt(((this._loadInt((_31_ + 56))) + 64))))) != 0) {
                                break label$7;
                            }
                            if ((this._storeInt((_31_ + 52), (sqlite3OsAccess((this._storeInt((_31_ + 44), (this._loadInt((this._loadInt((_31_ + 56))))))), (this._loadInt(((this._loadInt((_31_ + 56))) + 148))), 0, (_31_ + 40))))) != 0) {
                                break label$7;
                            }
                            if ((this._loadInt((_31_ + 40))) == 0) {
                                break label$7;
                            }
                            this._storeInt((_31_ + 36), 0);
                            _30_ = this._storeInt((_31_ + 32), 2050);
                            if ((this._storeInt((_31_ + 52), (sqlite3OsOpen((this._loadInt((_31_ + 44))), (this._loadInt(((_32_ = this._loadInt((_31_ + 56))) + 148))), (this._loadInt((_32_ + 64))), _30_, (_31_ + 36))))) != 0) {
                                break label$7;
                            }
                            if (((this._loadInt8u((_31_ + 36))) & 1) == 0) {
                                break label$7;
                            }
                            this._storeInt((_31_ + 52), (sqlite3CantopenError(41575)));
                            sqlite3OsClose((this._loadInt(((this._loadInt((_31_ + 56))) + 64))));
                        }
                        while (false);
                        label$8:
                        do {
                            label$9:
                            do {
                                if ((this._loadInt((this._loadInt(((this._loadInt((_31_ + 56))) + 64))))) == 0) {
                                    break label$9;
                                }
                                if ((this._storeInt((_31_ + 52), (pagerSyncHotJournal((this._loadInt((_31_ + 56))))))) != 0) {
                                    break label$8;
                                }
                                this._storeInt((_31_ + 52), (pager_playback((this._loadInt((_31_ + 56))), 1)));
                                this._storeInt8(((this._loadInt((_31_ + 56))) + 15), 0);
                                break label$8;
                            }
                            while (false);
                            if ((this._loadInt8u(((this._loadInt((_31_ + 56))) + 4))) != 0) {
                                break label$8;
                            }
                            pagerUnlockDb((this._loadInt((_31_ + 56))), 1);
                        }
                        while (false);
                        if ((this._loadInt((_31_ + 52))) == 0) {
                            break label$6;
                        }
                        pager_error((this._loadInt((_31_ + 56))), (this._loadInt((_31_ + 52))));
                        break label$2;
                    }
                    while (false);
                    label$10:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_31_ + 56))) + 12))) != 0) {
                            break label$10;
                        }
                        label$11:
                        do {
                            if ((this._loadInt(((this._loadInt((_31_ + 56))) + 88))) != 0) {
                                break label$11;
                            }
                            if ((sqlite3PcachePagecount((this._loadInt(((this._loadInt((_31_ + 56))) + 168))))) < 1) {
                                break label$10;
                            }
                        }
                        while (false);
                        this._storeInt((_31_ + 28), 0);
                        if ((this._storeInt((_31_ + 52), (pagerPagecount((this._loadInt((_31_ + 56))), (_31_ + 28))))) != 0) {
                            break label$2;
                        }
                        label$12:
                        do {
                            label$13:
                            do {
                                if ((this._loadInt((_31_ + 28))) == 0) {
                                    break label$13;
                                }
                                if ((this._storeInt((_31_ + 52), (sqlite3OsRead((this._loadInt(((this._loadInt((_31_ + 56))) + 60))), _31_, 16, 24L)))) != 0) {
                                    break label$2;
                                }
                                break label$12;
                            }
                            while (false);
                            memset(_31_, 0, 16);
                        }
                        while (false);
                        if ((memcmp(((this._loadInt((_31_ + 56))) + 100), _31_, 16)) == 0) {
                            break label$10;
                        }
                        pager_reset((this._loadInt((_31_ + 56))));
                    }
                    while (false);
                    this._storeInt((_31_ + 52), (pagerOpenWalIfPresent((this._loadInt((_31_ + 56))))));
                }
                while (false);
                label$14:
                do {
                    if ((pagerUseWal((this._loadInt((_31_ + 56))))) == 0) {
                        break label$14;
                    }
                    this._storeInt((_31_ + 52), (pagerBeginReadTransaction((this._loadInt((_31_ + 56))))));
                }
                while (false);
                if ((this._loadInt8u(((this._loadInt((_31_ + 56))) + 15))) != 0) {
                    break label$2;
                }
                if ((this._loadInt((_31_ + 52))) != 0) {
                    break label$2;
                }
                this._storeInt((_31_ + 52), (pagerPagecount((_30_ = this._loadInt((_31_ + 56))), (_30_ + 24))));
            }
            while (false);
            label$15:
            do {
                label$16:
                do {
                    if ((this._loadInt((_31_ + 52))) == 0) {
                        break label$16;
                    }
                    pager_unlock((this._loadInt((_31_ + 56))));
                    break label$15;
                }
                while (false);
                this._storeInt8(((this._loadInt((_31_ + 56))) + 15), 1);
            }
            while (false);
            this._storeInt((_31_ + 60), (this._loadInt((_31_ + 52))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 60));
        this._storeInt((0 + 4), (_31_ + 64));
        return _30_;
    }

    @Override()
    public final void sqlite3PagerPagecount(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((this._storeInt((_32_ + 8), _31_)), (this._loadInt(((this._loadInt((_32_ + 12))) + 24))));
        return;
    }

    @Override()
    public final int sqlite3PagerOpenWal(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        this._storeInt(_32_, 0);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_32_ + 8))) + 12))) != 0) {
                            break label$3;
                        }
                        if ((this._loadInt(((this._loadInt((_32_ + 8))) + 172))) == 0) {
                            break label$2;
                        }
                    }
                    while (false);
                    this._storeInt((this._loadInt((_32_ + 4))), 1);
                    break label$1;
                }
                while (false);
                label$4:
                do {
                    if ((sqlite3PagerWalSupported((this._loadInt((_32_ + 8))))) == 0) {
                        break label$4;
                    }
                    sqlite3OsClose((this._loadInt(((this._loadInt((_32_ + 8))) + 64))));
                    if ((this._storeInt(_32_, (pagerOpenWal((this._loadInt((_32_ + 8))))))) != 0) {
                        break label$1;
                    }
                    this._storeInt8(((_31_ = this._loadInt((_32_ + 8))) + 15), 0);
                    this._storeInt8((_31_ + 5), 5);
                    break label$1;
                }
                while (false);
                this._storeInt((_32_ + 12), 14);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), (this._loadInt(_32_)));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void freeTempSpace(int _30_)
    {
        int _31_ = 0;
        sqlite3PageFree((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 88))));
        this._storeInt(((this._loadInt((_31_ + 12))) + 88), 0);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3PagerWalSupported(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._loadInt((this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 60))))));
        _30_ = 1;
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_31_ + 12))) + 4))) != 0) {
                break label$0;
            }
            _30_ = 0;
            if ((this._loadInt((this._loadInt((_31_ + 8))))) < 2) {
                break label$0;
            }
            _30_ = ((this._loadInt(((this._loadInt((_31_ + 8))) + 52))) != 0) ? 1 : 0;
        }
        while (false);
        return _30_;
    }

    @Override()
    public final int pagerOpenWal(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_31_ + 8), 0);
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_31_ + 12))) + 4))) == 0) {
                break label$0;
            }
            this._storeInt((_31_ + 8), (pagerExclusiveLock((this._loadInt((_31_ + 12))))));
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_31_ + 8))) != 0) {
                break label$1;
            }
            this._storeInt((_31_ + 8), (sqlite3WalOpen((this._loadInt((_30_ = this._loadInt((_31_ + 12))))), (this._loadInt((_30_ + 60))), (this._loadInt((_30_ + 176))), (this._loadInt8u((_30_ + 4))), (this._loadLong((_30_ + 136))), (_30_ + 172))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int pagerExclusiveLock(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (pagerLockDb((this._storeInt((_31_ + 12), _30_)), 4)))) == 0) {
                break label$0;
            }
            pagerUnlockDb((this._loadInt((_31_ + 12))), 1);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3WalOpen(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            long _34_,
            int _35_)
    {
        int _36_ = 0;
        int _37_ = 0;
        _37_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48));
        _36_ = this._storeInt(_35_, 0);
        this._storeInt((_37_ + 40), _30_);
        this._storeInt((_37_ + 36), _31_);
        this._storeInt((_37_ + 32), _32_);
        this._storeInt((_37_ + 28), _33_);
        this._storeLong((_37_ + 16), _34_);
        this._storeInt((_37_ + 12), _35_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeInt((_37_ + 4), (sqlite3MallocZero(((this._loadInt(((this._loadInt((_37_ + 40))) + 4))) + 104))))) == 0) {
                            break label$3;
                        }
                        this._storeInt((_35_ = this._loadInt((_37_ + 4))), (this._loadInt((_37_ + 40))));
                        this._storeInt((_35_ + 8), (_35_ + 104));
                        this._storeInt((_35_ + 4), (this._loadInt((_37_ + 36))));
                        this._storeInt16(((this._loadInt((_37_ + 4))) + 36), 65535);
                        this._storeLong(((this._loadInt((_37_ + 4))) + 16), (this._loadLong((_37_ + 16))));
                        this._storeInt(((this._loadInt((_37_ + 4))) + 92), (this._loadInt((_37_ + 32))));
                        this._storeInt8(((this._loadInt((_37_ + 4))) + 38), ((((this._loadInt((_37_ + 28))) != _36_) ? 1 : 0) << 1));
                        _35_ = this._storeInt(_37_, 524294);
                        label$4:
                        do {
                            if ((this._storeInt((_37_ + 8), (sqlite3OsOpen((this._loadInt((_37_ + 40))), (this._loadInt((_37_ + 32))), (this._loadInt(((this._loadInt((_37_ + 4))) + 8))), _35_, _37_)))) != 0) {
                                break label$4;
                            }
                            if (((this._loadInt8u(_37_)) & 1) == 0) {
                                break label$4;
                            }
                            this._storeInt8(((this._loadInt((_37_ + 4))) + 41), 1);
                        }
                        while (false);
                        if ((this._loadInt((_37_ + 8))) == 0) {
                            break label$2;
                        }
                        walIndexClose((this._loadInt((_37_ + 4))), 0);
                        sqlite3OsClose((this._loadInt(((this._loadInt((_37_ + 4))) + 8))));
                        sqlite3_free((this._loadInt((_37_ + 4))));
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_37_ + 44), 7);
                    break label$0;
                }
                while (false);
                this._storeInt((this._loadInt((_37_ + 12))), (this._loadInt((_37_ + 4))));
            }
            while (false);
            this._storeInt((_37_ + 44), (this._loadInt((_37_ + 8))));
        }
        while (false);
        _35_ = this._loadInt((_37_ + 44));
        this._storeInt((0 + 4), (_37_ + 48));
        return _35_;
    }

    @Override()
    public final void walIndexClose(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 38))) != 2) {
                    break label$1;
                }
                _30_ = this._storeInt((_32_ + 4), 0);
                label$2:
                while (true) {
                    if ((this._loadInt((_32_ + 4))) >= (this._loadInt(((this._loadInt((_32_ + 12))) + 24)))) {
                        break label$0;
                    }
                    sqlite3_free((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 12))) + 28))) + ((this._loadInt((_32_ + 4))) << 2)))));
                    this._storeInt(((this._loadInt(((this._loadInt((_32_ + 12))) + 28))) + ((_31_ = this._loadInt((_32_ + 4))) << 2)), _30_);
                    this._storeInt((_32_ + 4), (_31_ + 1));
                    continue label$2;
                }
            }
            while (false);
            sqlite3OsShmUnmap((this._loadInt(((this._loadInt((_32_ + 12))) + 4))), (this._loadInt((_32_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int sqlite3OsShmUnmap(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this._iiiTable[this._tableIndices[this._loadInt(((this._loadInt((_30_ = this._loadInt((_32_ + 12))))) + 64))]].invoke(_30_, _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int hasHotJournal(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_32_ + 40), _31_);
        this._storeInt((_32_ + 36), (this._loadInt((this._loadInt((_32_ + 44))))));
        _31_ = this._storeInt((_32_ + 32), 0);
        this._storeInt((_32_ + 28), 1);
        this._storeInt((_32_ + 24), ((_31_ != (_30_ = this._loadInt((this._loadInt(((this._loadInt((_32_ + 44))) + 64)))))) ? 1 : 0));
        this._storeInt((this._loadInt((_32_ + 40))), _31_);
        label$0:
        do {
            if (_30_ != 0) {
                break label$0;
            }
            this._storeInt((_32_ + 32), (sqlite3OsAccess((this._loadInt((_32_ + 36))), (this._loadInt(((this._loadInt((_32_ + 44))) + 148))), _31_, (_32_ + 28))));
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_32_ + 32))) != 0) {
                break label$1;
            }
            if ((this._loadInt((_32_ + 28))) == 0) {
                break label$1;
            }
            this._storeInt((_32_ + 20), 0);
            if ((this._storeInt((_32_ + 32), (sqlite3OsCheckReservedLock((this._loadInt(((this._loadInt((_32_ + 44))) + 60))), (_32_ + 20))))) != 0) {
                break label$1;
            }
            if ((this._loadInt((_32_ + 20))) != 0) {
                break label$1;
            }
            if ((this._storeInt((_32_ + 32), (pagerPagecount((this._loadInt((_32_ + 44))), (_32_ + 16))))) != 0) {
                break label$1;
            }
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt((_32_ + 16))) == 0) {
                        break label$3;
                    }
                    label$4:
                    do {
                        if ((this._loadInt((_32_ + 24))) != 0) {
                            break label$4;
                        }
                        _31_ = this._storeInt((_32_ + 12), 2049);
                        this._storeInt((_32_ + 32), (sqlite3OsOpen((this._loadInt((_32_ + 36))), (this._loadInt(((_30_ = this._loadInt((_32_ + 44))) + 148))), (this._loadInt((_30_ + 64))), _31_, (_32_ + 12))));
                    }
                    while (false);
                    if ((this._loadInt((_32_ + 32))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt((_32_ + 32))) != 14) {
                        break label$1;
                    }
                    this._storeInt((this._loadInt((_32_ + 40))), 1);
                    this._storeInt((_32_ + 32), 0);
                    break label$1;
                }
                while (false);
                sqlite3BeginBenignMalloc();
                label$5:
                do {
                    if ((pagerLockDb((this._loadInt((_32_ + 44))), 2)) != 0) {
                        break label$5;
                    }
                    sqlite3OsDelete((this._loadInt((_32_ + 36))), (this._loadInt(((this._loadInt((_32_ + 44))) + 148))), 0);
                    if ((this._loadInt8u(((this._loadInt((_32_ + 44))) + 4))) != 0) {
                        break label$5;
                    }
                    pagerUnlockDb((this._loadInt((_32_ + 44))), 1);
                }
                while (false);
                sqlite3EndBenignMalloc();
                break label$1;
            }
            while (false);
            _31_ = this._storeInt8((_32_ + 11), 0);
            label$6:
            do {
                if ((this._storeInt((_32_ + 32), (sqlite3OsRead((this._loadInt(((this._loadInt((_32_ + 44))) + 64))), (_32_ + 11), 1, 0L)))) != 522) {
                    break label$6;
                }
                this._storeInt((_32_ + 32), _31_);
            }
            while (false);
            label$7:
            do {
                if ((this._loadInt((_32_ + 24))) != 0) {
                    break label$7;
                }
                sqlite3OsClose((this._loadInt(((this._loadInt((_32_ + 44))) + 64))));
            }
            while (false);
            this._storeInt((this._loadInt((_32_ + 40))), (((this._loadInt8u((_32_ + 11))) != 0) ? 1 : 0));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 32));
        this._storeInt((0 + 4), (_32_ + 48));
        return _31_;
    }

    @Override()
    public final int pagerSyncHotJournal(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_31_ + 8), 0);
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_31_ + 12))) + 8))) != 0) {
                break label$0;
            }
            this._storeInt((_31_ + 8), (sqlite3OsSync((this._loadInt(((this._loadInt((_31_ + 12))) + 64))), 2)));
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_31_ + 8))) != 0) {
                break label$1;
            }
            this._storeInt((_31_ + 8), (sqlite3OsFileSize((this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 64))), (_30_ + 80))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int pagerPagecount(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 16), (sqlite3WalDbsize((this._loadInt(((this._loadInt((_32_ + 24))) + 172))))))) != 0) {
                    break label$1;
                }
                this._storeLong((_32_ + 8), 0L);
                label$2:
                do {
                    if ((this._loadInt((this._loadInt(((this._loadInt((_32_ + 24))) + 60))))) == 0) {
                        break label$2;
                    }
                    if ((this._storeInt((_32_ + 4), (sqlite3OsFileSize((this._loadInt(((this._loadInt((_32_ + 24))) + 60))), (_32_ + 8))))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 28), (this._loadInt((_32_ + 4))));
                    break label$0;
                }
                while (false);
                if ((this._storeInt((_32_ + 16), ((int) ((this._loadLong((_32_ + 8))) / (this._loadLong32s(((this._loadInt((_32_ + 24))) + 128))))))) != 0) {
                    break label$1;
                }
                if ((this._loadLong((_32_ + 8))) < 1L) {
                    break label$1;
                }
                this._storeInt((_32_ + 16), 1);
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_32_ + 16))) & 4294967295L) <= ((this._loadInt(((this._loadInt((_32_ + 24))) + 132))) & 4294967295L)) {
                    break label$3;
                }
                this._storeInt(((this._loadInt((_32_ + 24))) + 132), (this._loadInt((_32_ + 16))));
            }
            while (false);
            this._storeInt((this._loadInt((_32_ + 20))), (this._loadInt((_32_ + 16))));
            this._storeInt((_32_ + 28), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int pagerOpenWalIfPresent(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_31_ + 20), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 24))) + 12))) != 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._storeInt((_31_ + 20), (pagerPagecount((this._loadInt((_31_ + 24))), (_31_ + 12))))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_31_ + 28), (this._loadInt((_31_ + 20))));
                    break label$0;
                }
                while (false);
                label$3:
                do {
                    label$4:
                    do {
                        if ((this._loadInt((_31_ + 12))) == 0) {
                            break label$4;
                        }
                        this._storeInt((_31_ + 20), (sqlite3OsAccess((this._loadInt((_30_ = this._loadInt((_31_ + 24))))), (this._loadInt((_30_ + 176))), 0, (_31_ + 16))));
                        break label$3;
                    }
                    while (false);
                    this._storeInt((_31_ + 20), (sqlite3OsDelete((this._loadInt((_30_ = this._loadInt((_31_ + 24))))), (this._loadInt((_30_ + 176))), 0)));
                    this._storeInt((_31_ + 16), 0);
                }
                while (false);
                if ((this._loadInt((_31_ + 20))) != 0) {
                    break label$1;
                }
                label$5:
                do {
                    if ((this._loadInt((_31_ + 16))) == 0) {
                        break label$5;
                    }
                    this._storeInt((_31_ + 20), (sqlite3PagerOpenWal((this._loadInt((_31_ + 24))), 0)));
                    break label$1;
                }
                while (false);
                if ((this._loadInt8u(((this._loadInt((_31_ + 24))) + 5))) != 5) {
                    break label$1;
                }
                this._storeInt8(((this._loadInt((_31_ + 24))) + 5), 0);
            }
            while (false);
            this._storeInt((_31_ + 28), (this._loadInt((_31_ + 20))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 28));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final int pagerBeginReadTransaction(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_31_ + 4), 0);
        sqlite3WalEndReadTransaction((this._loadInt(((this._loadInt((_31_ + 12))) + 172))));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_31_ + 8), (sqlite3WalBeginReadTransaction((this._loadInt(((this._loadInt((_31_ + 12))) + 172))), (_31_ + 4))))) != 0) {
                    break label$1;
                }
                if ((this._loadInt((_31_ + 4))) == 0) {
                    break label$0;
                }
            }
            while (false);
            pager_reset((this._loadInt((_31_ + 12))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3WalBeginReadTransaction(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this._storeInt(_32_, 0);
        label$0$end:
        do {
            label$0:
            while (true) {
                this._storeInt((_32_ + 4), (walTryBeginRead((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))), _31_, (this._storeInt(_32_, ((this._loadInt(_32_)) + 1))))));
                if ((this._loadInt((_32_ + 4))) == -1) {
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
    public final int sqlite3WalDbsize(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), _30_)) == 0) {
                break label$0;
            }
            if ((this._loadInt16s(((this._loadInt((_31_ + 8))) + 36))) < 0) {
                break label$0;
            }
            this._storeInt((_31_ + 12), (this._loadInt(((this._loadInt((_31_ + 8))) + 64))));
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        this._storeInt((_31_ + 12), 0);
        return (this._loadInt((_31_ + 12)));
    }

    @Override()
    public final int sqlite3OsCheckReservedLock(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this._iiiTable[this._tableIndices[this._loadInt(((this._loadInt((_30_ = this._loadInt((_32_ + 12))))) + 36))]].invoke(_30_, _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int findBtree(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_33_ + 36), _31_);
        this._storeInt((_33_ + 32), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_33_ + 28), (sqlite3FindDbName((this._loadInt((_33_ + 36))), _32_)))) != 1) {
                    break label$1;
                }
                _32_ = this._storeInt((_33_ + 20), 0);
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeInt((_33_ + 24), (sqlite3DbMallocZero((this._loadInt((_33_ + 40))), 560)))) == 0) {
                            break label$3;
                        }
                        this._storeInt((_32_ = this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 36))));
                        label$4:
                        do {
                            if ((sqlite3OpenTempDatabase(_32_)) == 0) {
                                break label$4;
                            }
                            _31_ = this._loadInt(((_32_ = this._loadInt((_33_ + 24))) + 4));
                            _30_ = this._loadInt((_33_ + 40));
                            this._storeInt((_33_ + 16), (this._loadInt((_32_ + 8))));
                            sqlite3Error(_30_, _31_, 22192, (_33_ + 16));
                            this._storeInt((_33_ + 20), 1);
                        }
                        while (false);
                        sqlite3DbFree((this._loadInt((_33_ + 40))), (this._loadInt(((this._loadInt((_33_ + 24))) + 8))));
                        sqlite3DbFree((this._loadInt((_33_ + 40))), (this._loadInt((_33_ + 24))));
                        break label$2;
                    }
                    while (false);
                    sqlite3Error((this._loadInt((_33_ + 40))), 7, 29616, _32_);
                    this._storeInt((_33_ + 20), 7);
                }
                while (false);
                if ((this._loadInt((_33_ + 20))) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 44), 0);
                break label$0;
            }
            while (false);
            label$5:
            do {
                if ((this._loadInt((_33_ + 28))) <= -1) {
                    break label$5;
                }
                this._storeInt((_33_ + 44), (this._loadInt((((this._loadInt(((this._loadInt((_33_ + 36))) + 8))) + ((this._loadInt((_33_ + 28))) << 4)) + 4))));
                break label$0;
            }
            while (false);
            _32_ = this._loadInt((_33_ + 40));
            this._storeInt(_33_, (this._loadInt((_33_ + 32))));
            sqlite3Error(_32_, 1, 29632, _33_);
            this._storeInt((_33_ + 44), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 44));
        this._storeInt((0 + 4), (_33_ + 48));
        return _32_;
    }

    @Override()
    public final int setDestPgsz(int _30_)
    {
        int _31_ = 0;
        _30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (sqlite3BtreeSetPageSize((this._loadInt(((_30_ = this._storeInt((_31_ + 12), _30_)) + 4))), (sqlite3BtreeGetPageSize((this._loadInt((_30_ + 24))))), -1, 0)));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3BtreeSetPageSize(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_34_ + 20), _31_);
        this._storeInt((_34_ + 16), _32_);
        this._storeInt((_34_ + 12), _33_);
        this._storeInt((_34_ + 8), 0);
        this._storeInt((_34_ + 4), (this._loadInt(((this._loadInt((_34_ + 24))) + 4))));
        sqlite3BtreeEnter((this._loadInt((_34_ + 24))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_34_ + 4))) + 17))) == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 28), 8);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt((_34_ + 16))) > -1) {
                    break label$2;
                }
                this._storeInt((_34_ + 16), ((this._loadInt(((_33_ = this._loadInt((_34_ + 4))) + 36))) - (this._loadInt((_33_ + 40)))));
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((_34_ + 20))) < 512) {
                    break label$3;
                }
                if ((this._loadInt((_34_ + 20))) > 65536) {
                    break label$3;
                }
                if ((((_33_ = this._loadInt((_34_ + 20))) + -1) & _33_) != 0) {
                    break label$3;
                }
                this._storeInt(((_33_ = this._loadInt((_34_ + 4))) + 36), (this._loadInt((_34_ + 20))));
                freeTempSpace(_33_);
            }
            while (false);
            this._storeInt((_34_ + 8), (sqlite3PagerSetPagesize((this._loadInt((_33_ = this._loadInt((_34_ + 4))))), (_33_ + 36), (this._loadInt((_34_ + 16))))));
            this._storeInt(((_33_ = this._loadInt((_34_ + 4))) + 40), ((this._loadInt((_33_ + 36))) - (this._loadInt16u((_34_ + 16)))));
            label$4:
            do {
                if ((this._loadInt((_34_ + 12))) == 0) {
                    break label$4;
                }
                this._storeInt8(((this._loadInt((_34_ + 4))) + 17), 1);
            }
            while (false);
            this._storeInt((_34_ + 28), (this._loadInt((_34_ + 8))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 28));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final int sqlite3OpenTempDatabase(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 20), (this._loadInt((this._storeInt((_31_ + 24), _30_)))))) + 8))) + 20))) != 0) {
                    break label$1;
                }
                if ((this._loadInt8u(((this._loadInt((_31_ + 24))) + 484))) != 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._storeInt((_31_ + 16), (sqlite3BtreeOpen((this._loadInt((_30_ = this._loadInt((_31_ + 20))))), 0, _30_, (_31_ + 12), 0, 542)))) == 0) {
                        break label$2;
                    }
                    sqlite3ErrorMsg((this._loadInt((_31_ + 24))), 29664, 0);
                    this._storeInt(((this._loadInt((_31_ + 24))) + 4), (this._loadInt((_31_ + 16))));
                    this._storeInt((_31_ + 28), 1);
                    break label$0;
                }
                while (false);
                if ((sqlite3BtreeSetPageSize((this._storeInt(((this._loadInt(((_30_ = this._loadInt((_31_ + 20))) + 8))) + 20), (this._loadInt((_31_ + 12))))), (this._loadInt((_30_ + 36))), -1, 0)) != 7) {
                    break label$1;
                }
                this._storeInt((_31_ + 28), (this._storeInt8(((this._loadInt((_31_ + 20))) + 30), 1)));
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
    public final int sqlite3BtreeOpen(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_)
    {
        int _36_ = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 208))) + 200), _30_);
        this._storeInt((_36_ + 196), _31_);
        this._storeInt((_36_ + 192), _32_);
        this._storeInt((_36_ + 188), _33_);
        this._storeInt((_36_ + 184), _34_);
        this._storeInt((_36_ + 180), _35_);
        this._storeInt((_36_ + 164), (this._storeInt((_36_ + 168), (this._storeInt((_36_ + 176), 0)))));
        _35_ = 1;
        label$0:
        do {
            if ((this._loadInt((_36_ + 196))) == 0) {
                break label$0;
            }
            _35_ = ((this._loadInt8s((this._loadInt((_36_ + 196))))) == 0) ? 1 : 0;
        }
        while (false);
        this._storeInt((_36_ + 44), _35_);
        label$1:
        do {
            label$2:
            do {
                if ((this._loadInt((_36_ + 196))) == 0) {
                    break label$2;
                }
                _35_ = 1;
                if ((strcmp((this._loadInt((_36_ + 196))), 29744)) == 0) {
                    break label$1;
                }
            }
            while (false);
            _35_ = 0;
            if ((this._loadInt((_36_ + 44))) == 0) {
                break label$1;
            }
            _35_ = ((sqlite3TempInMemory((this._loadInt((_36_ + 192))))) != 0) ? 1 : 0;
        }
        while (false);
        this._storeInt((_36_ + 40), _35_);
        label$3:
        do {
            if (((this._loadInt8u(((this._loadInt((_36_ + 192))) + 14))) & 2) == 0) {
                break label$3;
            }
            this._storeInt((_36_ + 184), ((this._loadInt((_36_ + 184))) | 2));
        }
        while (false);
        label$4:
        do {
            if ((this._loadInt((_36_ + 40))) == 0) {
                break label$4;
            }
            this._storeInt((_36_ + 184), ((this._loadInt((_36_ + 184))) | 4));
        }
        while (false);
        label$5:
        do {
            if (((this._loadInt8u((_36_ + 181))) & 1) == 0) {
                break label$5;
            }
            label$6:
            do {
                if ((this._loadInt((_36_ + 40))) != 0) {
                    break label$6;
                }
                if ((this._loadInt((_36_ + 44))) == 0) {
                    break label$5;
                }
            }
            while (false);
            this._storeInt((_36_ + 180), (((this._loadInt((_36_ + 180))) | 512) & -257));
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
                            label$12:
                            do {
                                label$13:
                                do {
                                    if ((this._storeInt((_36_ + 172), (sqlite3MallocZero(44)))) == 0) {
                                        break label$13;
                                    }
                                    this._storeInt((_35_ = this._loadInt((_36_ + 172))), (this._loadInt((_36_ + 192))));
                                    this._storeInt8((_35_ + 8), 0);
                                    this._storeInt(((_35_ = this._loadInt((_36_ + 172))) + 28), _35_);
                                    this._storeInt(((this._loadInt((_36_ + 172))) + 32), 1);
                                    if ((this._loadInt((_36_ + 40))) != 0) {
                                        break label$8;
                                    }
                                    if ((this._loadInt((_36_ + 44))) != 0) {
                                        break label$8;
                                    }
                                    if (((this._loadInt8u((_36_ + 182))) & 2) == 0) {
                                        break label$8;
                                    }
                                    _35_ = this._storeInt((_36_ + 32), (sqlite3Malloc((this._storeInt((_36_ + 36), ((this._loadInt(((this._loadInt((_36_ + 200))) + 8))) + 1))))));
                                    this._storeInt8(((this._loadInt((_36_ + 172))) + 9), 1);
                                    if (_35_ == 0) {
                                        break label$11;
                                    }
                                    sqlite3OsFullPathname((this._loadInt((_36_ + 200))), (this._loadInt((_36_ + 196))), (this._loadInt((_36_ + 36))), (this._loadInt((_36_ + 32))));
                                    this._storeInt((_36_ + 28), (this._storeInt((_36_ + 168), 8)));
                                    this._storeInt((_36_ + 176), (this._loadInt((0 + 29753))));
                                    label$15:
                                    do {
                                        label$14:
                                        while (true) {
                                            if ((this._loadInt((_36_ + 176))) == 0) {
                                                break label$9;
                                            }
                                            label$16:
                                            do {
                                                if ((strcmp((this._loadInt((_36_ + 32))), (sqlite3PagerFilename((this._loadInt((this._loadInt((_36_ + 176))))))))) != 0) {
                                                    break label$16;
                                                }
                                                if ((sqlite3PagerVfs((this._loadInt((this._loadInt((_36_ + 176))))))) == (this._loadInt((_36_ + 200)))) {
                                                    break label$15;
                                                }
                                            }
                                            while (false);
                                            this._storeInt((_36_ + 176), (this._loadInt(((this._loadInt((_36_ + 176))) + 72))));
                                            continue label$14;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_36_ + 24), ((this._loadInt(((this._loadInt((_36_ + 192))) + 4))) + -1));
                                    break label$12;
                                }
                                while (false);
                                this._storeInt((_36_ + 204), 7);
                                break label$7;
                            }
                            while (false);
                            label$18:
                            do {
                                label$17:
                                while (true) {
                                    if ((this._loadInt((_36_ + 24))) < 0) {
                                        break label$10;
                                    }
                                    label$19:
                                    do {
                                        if ((this._storeInt((_36_ + 20), (this._loadInt((((this._loadInt(((this._loadInt((_36_ + 192))) + 8))) + ((this._loadInt((_36_ + 24))) << 4)) + 4))))) == 0) {
                                            break label$19;
                                        }
                                        if ((this._loadInt(((this._loadInt((_36_ + 20))) + 4))) == (this._loadInt((_36_ + 176)))) {
                                            break label$18;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_36_ + 24), ((this._loadInt((_36_ + 24))) + -1));
                                    continue label$17;
                                }
                            }
                            while (false);
                            sqlite3_free((this._loadInt((_36_ + 32))));
                            sqlite3_free((this._loadInt((_36_ + 172))));
                            this._storeInt((_36_ + 204), 19);
                            break label$7;
                        }
                        while (false);
                        sqlite3_free((this._loadInt((_36_ + 172))));
                        this._storeInt((_36_ + 204), 7);
                        break label$7;
                    }
                    while (false);
                    this._storeInt(((_35_ = this._storeInt(((this._loadInt((_36_ + 172))) + 4), (this._loadInt((_36_ + 176))))) + 68), ((this._loadInt((_35_ + 68))) + 1));
                }
                while (false);
                sqlite3_free((this._loadInt((_36_ + 32))));
            }
            while (false);
            label$20:
            do {
                label$21:
                do {
                    if ((this._loadInt((_36_ + 176))) != 0) {
                        break label$21;
                    }
                    label$22:
                    do {
                        label$23:
                        do {
                            label$24:
                            do {
                                if ((this._storeInt((_36_ + 176), (sqlite3MallocZero(92)))) == 0) {
                                    break label$24;
                                }
                                label$25:
                                do {
                                    if ((this._storeInt((_36_ + 164), (sqlite3PagerOpen((this._loadInt((_36_ + 200))), (this._loadInt((_36_ + 176))), (this._loadInt((_36_ + 196))), 76, (this._loadInt((_36_ + 184))), (this._loadInt((_36_ + 180))), 26)))) != 0) {
                                        break label$25;
                                    }
                                    this._storeInt((_36_ + 164), (sqlite3PagerReadFileheader((this._loadInt((this._loadInt((_36_ + 176))))), 100, (_36_ + 48))));
                                }
                                while (false);
                                if ((this._loadInt((_36_ + 164))) != 0) {
                                    break label$20;
                                }
                                this._storeInt(((_35_ = this._loadInt((_36_ + 176))) + 4), (this._loadInt((_36_ + 192))));
                                this._storeInt8((_35_ + 20), (this._loadInt((_36_ + 184))));
                                sqlite3PagerSetBusyhandler((this._loadInt((_35_ = this._loadInt((_36_ + 176))))), 27, _35_);
                                _33_ = this._storeInt(((_35_ = this._storeInt(((this._loadInt((_36_ + 172))) + 4), (this._loadInt((_36_ + 176))))) + 12), (this._storeInt((_35_ + 8), 0)));
                                _35_ = sqlite3PagerIsreadonly((this._loadInt((this._loadInt((_36_ + 176))))));
                                this._storeInt8(((_34_ = this._loadInt((_36_ + 176))) + 16), _35_);
                                this._storeInt((_34_ + 36), (((this._loadInt8u((_36_ + 64))) << 8) | ((this._loadInt8u((_36_ + 65))) << 16)));
                                label$26:
                                do {
                                    if (((this._loadInt(((this._loadInt((_36_ + 176))) + 36))) & 4294967295L) < (512 & 4294967295L)) {
                                        break label$26;
                                    }
                                    if (((this._loadInt(((this._loadInt((_36_ + 176))) + 36))) & 4294967295L) > (65536 & 4294967295L)) {
                                        break label$26;
                                    }
                                    if ((((_35_ = this._loadInt(((this._loadInt((_36_ + 176))) + 36))) + -1) & _35_) == 0) {
                                        break label$23;
                                    }
                                }
                                while (false);
                                this._storeInt(((this._loadInt((_36_ + 176))) + 36), _33_);
                                label$27:
                                do {
                                    if ((this._loadInt((_36_ + 196))) == 0) {
                                        break label$27;
                                    }
                                    if ((this._loadInt((_36_ + 40))) != 0) {
                                        break label$27;
                                    }
                                    this._storeInt8(((_35_ = this._loadInt((_36_ + 176))) + 21), (this._storeInt8((_35_ + 22), 0)));
                                }
                                while (false);
                                this._storeInt8((_36_ + 163), 0);
                                break label$22;
                            }
                            while (false);
                            this._storeInt((_36_ + 164), 7);
                            break label$20;
                        }
                        while (false);
                        this._storeInt8((_36_ + 163), (this._loadInt8u((_36_ + 68))));
                        this._storeInt8(((this._loadInt((_36_ + 176))) + 17), 1);
                        _35_ = sqlite3Get4byte((_36_ + 100));
                        this._storeInt8(((this._loadInt((_36_ + 176))) + 21), ((_35_ != 0) ? 1 : 0));
                        _35_ = sqlite3Get4byte((_36_ + 112));
                        this._storeInt8(((this._loadInt((_36_ + 176))) + 22), ((_35_ != 0) ? 1 : 0));
                    }
                    while (false);
                    if ((this._storeInt((_36_ + 164), (sqlite3PagerSetPagesize((this._loadInt((_35_ = this._loadInt((_36_ + 176))))), (_35_ + 36), (this._loadInt8u((_36_ + 163))))))) != 0) {
                        break label$20;
                    }
                    this._storeInt(((_35_ = this._loadInt((_36_ + 176))) + 40), ((this._loadInt((_35_ + 36))) - (this._loadInt8u((_36_ + 163)))));
                    if ((this._loadInt8u(((this._loadInt((_36_ + 172))) + 9))) == 0) {
                        break label$21;
                    }
                    this._storeInt(((this._loadInt((_36_ + 176))) + 68), 1);
                    this._storeInt((_36_ + 16), 8);
                    this._storeInt(((this._loadInt((_36_ + 176))) + 72), (this._loadInt((0 + 29753))));
                    this._storeInt((0 + 29753), (this._loadInt((_36_ + 176))));
                }
                while (false);
                label$28:
                do {
                    if ((this._loadInt8u(((this._loadInt((_36_ + 172))) + 9))) == 0) {
                        break label$28;
                    }
                    this._storeInt((_36_ + 12), 0);
                    label$30:
                    do {
                        label$29:
                        while (true) {
                            if ((this._loadInt((_36_ + 12))) >= (this._loadInt(((this._loadInt((_36_ + 192))) + 4)))) {
                                break label$28;
                            }
                            label$31:
                            do {
                                if ((this._storeInt((_36_ + 8), (this._loadInt((((this._loadInt(((this._loadInt((_36_ + 192))) + 8))) + ((this._loadInt((_36_ + 12))) << 4)) + 4))))) == 0) {
                                    break label$31;
                                }
                                if ((this._loadInt8u(((this._loadInt((_36_ + 8))) + 9))) != 0) {
                                    break label$30;
                                }
                            }
                            while (false);
                            this._storeInt((_36_ + 12), ((this._loadInt((_36_ + 12))) + 1));
                            continue label$29;
                        }
                    }
                    while (false);
                    label$33:
                    do {
                        label$32:
                        while (true) {
                            if ((this._loadInt(((this._loadInt((_36_ + 8))) + 24))) == 0) {
                                break label$33;
                            }
                            this._storeInt((_36_ + 8), (this._loadInt(((this._loadInt((_36_ + 8))) + 24))));
                            continue label$32;
                        }
                    }
                    while (false);
                    label$34:
                    do {
                        if (((this._loadInt(((this._loadInt((_36_ + 172))) + 4))) & 4294967295L) >= ((this._loadInt(((this._loadInt((_36_ + 8))) + 4))) & 4294967295L)) {
                            break label$34;
                        }
                        this._storeInt(((_35_ = this._loadInt((_36_ + 172))) + 24), 0);
                        this._storeInt((_35_ + 20), (this._loadInt((_36_ + 8))));
                        this._storeInt(((this._loadInt((_36_ + 8))) + 24), (this._loadInt((_36_ + 172))));
                        break label$28;
                    }
                    while (false);
                    label$36:
                    do {
                        label$35:
                        while (true) {
                            _35_ = 0;
                            label$37:
                            do {
                                if ((this._loadInt(((this._loadInt((_36_ + 8))) + 20))) == 0) {
                                    break label$37;
                                }
                                _35_ = (((this._loadInt(((this._loadInt(((this._loadInt((_36_ + 8))) + 20))) + 4))) & 4294967295L) < ((this._loadInt(((this._loadInt((_36_ + 172))) + 4))) & 4294967295L)) ? 1 : 0;
                            }
                            while (false);
                            if (_35_ == 0) {
                                break label$36;
                            }
                            this._storeInt((_36_ + 8), (this._loadInt(((this._loadInt((_36_ + 8))) + 20))));
                            continue label$35;
                        }
                    }
                    while (false);
                    _34_ = this._loadInt(((_35_ = this._loadInt((_36_ + 8))) + 20));
                    this._storeInt(((_33_ = this._loadInt((_36_ + 172))) + 24), _35_);
                    this._storeInt((_33_ + 20), _34_);
                    label$38:
                    do {
                        if ((this._loadInt(((this._loadInt((_36_ + 172))) + 20))) == 0) {
                            break label$38;
                        }
                        this._storeInt(((this._loadInt(((_35_ = this._loadInt((_36_ + 172))) + 20))) + 24), _35_);
                    }
                    while (false);
                    this._storeInt(((this._loadInt((_36_ + 8))) + 20), (this._loadInt((_36_ + 172))));
                }
                while (false);
                this._storeInt((this._loadInt((_36_ + 188))), (this._loadInt((_36_ + 172))));
            }
            while (false);
            label$39:
            do {
                label$40:
                do {
                    if ((this._loadInt((_36_ + 164))) == 0) {
                        break label$40;
                    }
                    label$41:
                    do {
                        if ((this._loadInt((_36_ + 176))) == 0) {
                            break label$41;
                        }
                        if ((this._loadInt((this._loadInt((_36_ + 176))))) == 0) {
                            break label$41;
                        }
                        sqlite3PagerClose((this._loadInt((this._loadInt((_36_ + 176))))));
                    }
                    while (false);
                    sqlite3_free((this._loadInt((_36_ + 176))));
                    sqlite3_free((this._loadInt((_36_ + 172))));
                    this._storeInt((this._loadInt((_36_ + 188))), 0);
                    break label$39;
                }
                while (false);
                if ((sqlite3BtreeSchema((this._loadInt((_36_ + 172))), 0, 0)) != 0) {
                    break label$39;
                }
                sqlite3PagerSetCachesize((this._loadInt((this._loadInt(((this._loadInt((_36_ + 172))) + 4))))), 2000);
            }
            while (false);
            this._storeInt((_36_ + 204), (this._loadInt((_36_ + 164))));
        }
        while (false);
        _35_ = this._loadInt((_36_ + 204));
        this._storeInt((0 + 4), (_36_ + 208));
        return _35_;
    }

    @Override()
    public final void sqlite3ErrorMsg(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 12), (this._loadInt((this._loadInt((_33_ + 28))))));
        _31_ = this._storeInt((_33_ + 16), _32_);
        this._storeInt((_33_ + 20), (sqlite3VMPrintf((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 24))), _31_)));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 12))) + 33))) == 0) {
                    break label$1;
                }
                sqlite3DbFree((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 20))));
                break label$0;
            }
            while (false);
            this._storeInt(((_31_ = this._loadInt((_33_ + 28))) + 64), ((this._loadInt((_31_ + 64))) + 1));
            sqlite3DbFree((this._loadInt((_33_ + 12))), (this._loadInt((_31_ + 8))));
            this._storeInt(((_31_ = this._loadInt((_33_ + 28))) + 4), 1);
            this._storeInt((_31_ + 8), (this._loadInt((_33_ + 20))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int sqlite3OsFullPathname(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        _34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16));
        this._storeInt8(_33_, 0);
        this._storeInt((_34_ + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        _33_ = this._iiiiiTable[this._tableIndices[this._loadInt(((_32_ = this._loadInt((_34_ + 12))) + 36))]].invoke(_32_, (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))), _33_);
        this._storeInt((0 + 4), (_34_ + 16));
        return _33_;
    }

    @Override()
    public final int sqlite3PagerFilename(int _30_)
    {
        return (this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 144)));
    }

    @Override()
    public final int sqlite3PagerVfs(int _30_)
    {
        return (this._loadInt((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_))));
    }

    @Override()
    public final void pageReinit(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt8u((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (sqlite3PagerGetExtra((this._storeInt((_31_ + 12), _30_)))))))) == 0) {
                break label$0;
            }
            this._storeInt8((this._loadInt((_31_ + 8))), 0);
            if ((sqlite3PagerPageRefcount((this._loadInt((_31_ + 12))))) < 2) {
                break label$0;
            }
            btreeInitPage((this._loadInt((_31_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3PagerOpen(
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
        int _temp$3 = 0;
        int _temp$4 = 0;
        int _temp$5 = 0;
        int _temp$6 = 0;
        int _temp$7 = 0;
        int _temp$8 = 0;
        this._storeInt(((_37_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 112))) + 104), _30_);
        this._storeInt((_37_ + 100), _31_);
        this._storeInt((_37_ + 96), _32_);
        this._storeInt((_37_ + 92), _33_);
        this._storeInt((_37_ + 88), _34_);
        this._storeInt((_37_ + 84), _35_);
        this._storeInt((_37_ + 80), _36_);
        _36_ = this._storeInt((_37_ + 44), (this._storeInt((_37_ + 48), (this._storeInt((_37_ + 56), (this._storeInt((_37_ + 60), (this._storeInt((_37_ + 64), (this._storeInt((_37_ + 68), (this._storeInt((_37_ + 72), 0)))))))))))));
        this._storeInt((_37_ + 40), ((((this._loadInt((_37_ + 88))) & 1) == 0) ? 1 : 0));
        this._storeInt((_37_ + 36), (((this._loadInt((_37_ + 88))) & 2) >>> 1));
        this._storeInt((_37_ + 32), (sqlite3PcacheSize()));
        this._storeInt((_37_ + 28), 1024);
        this._storeInt((_37_ + 20), (this._storeInt((_37_ + 24), _36_)));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_37_ + 104))) + 4))) <= (sqlite3MemJournalSize())) {
                    break label$1;
                }
                this._storeInt((_37_ + 52), (((this._loadInt(((this._loadInt((_37_ + 104))) + 4))) + 7) & -8));
                break label$0;
            }
            while (false);
            this._storeInt((_37_ + 52), (((sqlite3MemJournalSize()) + 7) & -8));
        }
        while (false);
        _36_ = this._storeInt((this._loadInt((_37_ + 100))), 0);
        label$2:
        do {
            if (((this._loadInt8u((_37_ + 88))) & 4) == 0) {
                break label$2;
            }
            this._storeInt((_37_ + 60), 1);
            this._storeInt((_37_ + 96), _36_);
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
                            if ((this._loadInt((_37_ + 96))) == 0) {
                                break label$7;
                            }
                            if ((this._loadInt8s((this._loadInt((_37_ + 96))))) == 0) {
                                break label$7;
                            }
                            if ((this._storeInt((_37_ + 48), (sqlite3Malloc(((this._storeInt((_37_ + 44), ((this._loadInt(((this._loadInt((_37_ + 104))) + 8))) + 1))) << 1))))) == 0) {
                                break label$6;
                            }
                            this._storeInt8((_36_ = this._loadInt((_37_ + 48))), 0);
                            this._storeInt((_37_ + 68), (sqlite3OsFullPathname((this._loadInt((_37_ + 104))), (this._loadInt((_37_ + 96))), (this._loadInt((_37_ + 44))), _36_)));
                            this._storeInt((_37_ + 44), (sqlite3Strlen30((this._loadInt((_37_ + 48))))));
                            this._storeInt((_37_ + 16), (this._storeInt((_37_ + 24), (((sqlite3Strlen30((this._loadInt((_37_ + 96))))) + (this._loadInt((_37_ + 96)))) + 1))));
                            label$9:
                            do {
                                label$8:
                                while (true) {
                                    if ((this._loadInt8u((this._loadInt((_37_ + 16))))) == 0) {
                                        break label$9;
                                    }
                                    this._storeInt((_37_ + 16), (((sqlite3Strlen30((this._storeInt((_37_ + 16), (((sqlite3Strlen30((this._loadInt((_37_ + 16))))) + (this._loadInt((_37_ + 16)))) + 1))))) + (this._loadInt((_37_ + 16)))) + 1));
                                    continue label$8;
                                }
                            }
                            while (false);
                            this._storeInt((_37_ + 20), (((this._loadInt((_37_ + 16))) + 1) - (this._loadInt((_37_ + 24)))));
                            label$10:
                            do {
                                if ((this._loadInt((_37_ + 68))) != 0) {
                                    break label$10;
                                }
                                if (((this._loadInt((_37_ + 44))) + 8) <= (this._loadInt(((this._loadInt((_37_ + 104))) + 8)))) {
                                    break label$10;
                                }
                                this._storeInt((_37_ + 68), (sqlite3CantopenError(41147)));
                            }
                            while (false);
                            if ((this._loadInt((_37_ + 68))) == 0) {
                                break label$7;
                            }
                            sqlite3_free((this._loadInt((_37_ + 48))));
                            this._storeInt((_37_ + 108), (this._loadInt((_37_ + 68))));
                            break label$3;
                        }
                        while (false);
                        label$11:
                        do {
                            if ((this._storeInt((_37_ + 76), (sqlite3MallocZero(((((((((((this._loadInt((_37_ + 32))) + 7) & -8) + (((this._loadInt(((this._loadInt((_37_ + 104))) + 4))) + 7) & -8)) + ((this._loadInt((_37_ + 52))) << 1)) + (_36_ = this._loadInt((_37_ + 44)))) + (this._loadInt((_37_ + 20)))) + _36_) + _36_) + 199))))) == 0) {
                                break label$11;
                            }
                            this._storeInt((_37_ + 72), (this._loadInt((_37_ + 76))));
                            _36_ = this._storeInt((_37_ + 76), ((this._loadInt((_37_ + 76))) + 184));
                            _36_ = this._storeInt((_37_ + 76), ((this._storeInt(((this._loadInt((_37_ + 72))) + 168), _36_)) + (((this._loadInt((_37_ + 32))) + 7) & -8)));
                            this._storeInt(((this._loadInt((_37_ + 72))) + 60), _36_);
                            _36_ = this._storeInt((_37_ + 76), ((this._loadInt((_37_ + 76))) + (((this._loadInt(((this._loadInt((_37_ + 104))) + 4))) + 7) & -8)));
                            this._storeInt(((this._loadInt((_37_ + 72))) + 68), _36_);
                            _36_ = this._storeInt((_37_ + 76), ((this._loadInt((_37_ + 76))) + (this._loadInt((_37_ + 52)))));
                            this._storeInt(((this._loadInt((_37_ + 72))) + 64), _36_);
                            _36_ = this._storeInt((_37_ + 76), ((this._loadInt((_37_ + 76))) + (this._loadInt((_37_ + 52)))));
                            this._storeInt(((this._loadInt((_37_ + 72))) + 144), _36_);
                            label$12:
                            do {
                                if ((this._loadInt((_37_ + 48))) == 0) {
                                    break label$12;
                                }
                                _36_ = this._storeInt((_37_ + 76), (((this._loadInt((_37_ + 76))) + ((this._loadInt((_37_ + 44))) + (this._loadInt((_37_ + 20))))) + 1));
                                this._storeInt(((_35_ = this._loadInt((_37_ + 72))) + 148), _36_);
                                memcpy((this._loadInt((_35_ + 144))), (this._loadInt((_37_ + 48))), (this._loadInt((_37_ + 44))));
                                memcpy((((this._loadInt(((this._loadInt((_37_ + 72))) + 144))) + (this._loadInt((_37_ + 44)))) + 1), (this._loadInt((_37_ + 24))), (this._loadInt((_37_ + 20))));
                                memcpy((this._loadInt(((this._loadInt((_37_ + 72))) + 148))), (this._loadInt((_37_ + 48))), (this._loadInt((_37_ + 44))));
                                memcpy(((this._loadInt(((this._loadInt((_37_ + 72))) + 148))) + (this._loadInt((_37_ + 44)))), 29760, 8);
                                memcpy((this._storeInt(((_36_ = this._loadInt((_37_ + 72))) + 176), (((this._loadInt((_36_ + 148))) + (_36_ = this._loadInt((_37_ + 44)))) + 9))), (this._loadInt((_37_ + 48))), _36_);
                                memcpy(((this._loadInt(((this._loadInt((_37_ + 72))) + 176))) + (this._loadInt((_37_ + 44)))), 29776, 4);
                                sqlite3_free((this._loadInt((_37_ + 48))));
                            }
                            while (false);
                            this._storeInt((this._loadInt((_37_ + 72))), (this._loadInt((_37_ + 104))));
                            this._storeInt(((this._loadInt((_37_ + 72))) + 120), (this._loadInt((_37_ + 84))));
                            label$13:
                            do {
                                if ((this._loadInt((_37_ + 96))) == 0) {
                                    break label$13;
                                }
                                if ((this._loadInt8s((this._loadInt((_37_ + 96))))) == 0) {
                                    break label$13;
                                }
                                this._storeInt((_37_ + 12), 0);
                                this._storeInt((_37_ + 68), (sqlite3OsOpen((this._loadInt((_37_ + 104))), (this._loadInt(((_36_ = this._loadInt((_37_ + 72))) + 144))), (this._loadInt((_36_ + 60))), (this._loadInt((_37_ + 84))), (_37_ + 12))));
                                this._storeInt((_37_ + 56), ((this._loadInt((_37_ + 12))) & 1));
                                if ((this._loadInt((_37_ + 68))) != 0) {
                                    break label$4;
                                }
                                if ((this._loadInt((_37_ + 56))) != 0) {
                                    break label$4;
                                }
                                setSectorSize((this._loadInt((_37_ + 72))));
                                if (((this._loadInt((_37_ + 28))) & 4294967295L) >= ((this._loadInt(((this._loadInt((_37_ + 72))) + 124))) & 4294967295L)) {
                                    break label$4;
                                }
                                if (((this._loadInt(((this._loadInt((_37_ + 72))) + 124))) & 4294967295L) < (8193 & 4294967295L)) {
                                    break label$5;
                                }
                                this._storeInt((_37_ + 28), 8192);
                                break label$4;
                            }
                            while (false);
                            _36_ = this._storeInt((_37_ + 64), 1);
                            this._storeInt16(((this._loadInt((_37_ + 72))) + 15), 1025);
                            this._storeInt((_37_ + 56), (_36_ & (this._loadInt((_37_ + 84)))));
                            break label$4;
                        }
                        while (false);
                        sqlite3_free((this._loadInt((_37_ + 48))));
                        this._storeInt((_37_ + 108), 7);
                        break label$3;
                    }
                    while (false);
                    this._storeInt((_37_ + 108), 7);
                    break label$3;
                }
                while (false);
                this._storeInt((_37_ + 28), (this._loadInt(((this._loadInt((_37_ + 72))) + 124))));
            }
            while (false);
            label$14:
            do {
                if ((this._loadInt((_37_ + 68))) != 0) {
                    break label$14;
                }
                this._storeInt((_37_ + 68), (sqlite3PagerSetPagesize((this._loadInt((_37_ + 72))), (_37_ + 28), -1)));
            }
            while (false);
            label$15:
            do {
                if ((this._loadInt((_37_ + 68))) == 0) {
                    break label$15;
                }
                sqlite3OsClose((this._loadInt(((this._loadInt((_37_ + 72))) + 60))));
                sqlite3_free((this._loadInt((_37_ + 72))));
                this._storeInt((_37_ + 108), (this._loadInt((_37_ + 68))));
                break label$3;
            }
            while (false);
            _36_ = this._storeInt((_37_ + 92), (((this._loadInt((_37_ + 92))) + 7) & -8));
            _temp$0 = 0;
            _temp$1 = 28;
            _temp$2 = (_35_ != 0) ? _temp$0 : _temp$1;
            sqlite3PcacheOpen((this._loadInt((_37_ + 28))), _36_, (((_35_ = this._loadInt((_37_ + 60))) == 0) ? 1 : 0), _temp$2, (_35_ = this._loadInt((_37_ + 72))), (this._loadInt((_35_ + 168))));
            this._storeInt8(((this._loadInt((_37_ + 72))) + 6), (this._loadInt((_37_ + 40))));
            _35_ = 0;
            label$16:
            do {
                if ((this._loadInt((_37_ + 36))) == 0) {
                    break label$16;
                }
                _35_ = ((this._loadInt((_37_ + 56))) != 0) ? 1 : 0;
            }
            while (false);
            this._storeInt(((_36_ = this._loadInt((_37_ + 72))) + 132), 1073741823);
            _temp$3 = 1;
            _temp$4 = 0;
            _temp$5 = (_35_ != 0) ? _temp$3 : _temp$4;
            this._storeInt8((_36_ + 7), _temp$5);
            this._storeInt8((_36_ + 12), (this._loadInt((_37_ + 64))));
            this._storeInt8(((this._loadInt((_37_ + 72))) + 4), (this._loadInt((_37_ + 64))));
            this._storeInt8(((_36_ = this._loadInt((_37_ + 72))) + 17), (this._loadInt8u((_36_ + 12))));
            this._storeInt8(((this._loadInt((_37_ + 72))) + 14), (this._loadInt((_37_ + 60))));
            this._storeInt8(((this._loadInt((_37_ + 72))) + 13), (this._loadInt((_37_ + 56))));
            this._storeInt8(((_36_ = this._loadInt((_37_ + 72))) + 8), (this._loadInt8u((_36_ + 12))));
            this._storeInt8(((_36_ = this._loadInt((_37_ + 72))) + 9), (((this._loadInt8u((_36_ + 8))) == 0) ? 1 : 0));
            _temp$6 = 0;
            _temp$7 = 2;
            _temp$8 = ((this._loadInt8u((_36_ + 8))) != 0) ? _temp$6 : _temp$7;
            this._storeInt8(((_36_ = this._loadInt((_37_ + 72))) + 11), _temp$8);
            this._storeInt8(((_36_ = this._loadInt((_37_ + 72))) + 10), (this._loadInt8u((_36_ + 11))));
            this._storeInt16(((this._loadInt((_37_ + 72))) + 116), (this._loadInt((_37_ + 92))));
            this._storeLong(((this._loadInt((_37_ + 72))) + 136), -1L);
            setSectorSize((this._loadInt((_37_ + 72))));
            label$17:
            do {
                label$18:
                do {
                    if ((this._loadInt((_37_ + 40))) == 0) {
                        break label$18;
                    }
                    if ((this._loadInt((_37_ + 60))) == 0) {
                        break label$17;
                    }
                    this._storeInt8(((this._loadInt((_37_ + 72))) + 5), 4);
                    break label$17;
                }
                while (false);
                this._storeInt8(((this._loadInt((_37_ + 72))) + 5), 2);
            }
            while (false);
            this._storeInt(((_36_ = this._loadInt((_37_ + 72))) + 160), (this._loadInt((_37_ + 80))));
            this._storeInt((this._loadInt((_37_ + 100))), _36_);
            this._storeInt((_37_ + 108), 0);
        }
        while (false);
        _36_ = this._loadInt((_37_ + 108));
        this._storeInt((0 + 4), (_37_ + 112));
        return _36_;
    }

    @Override()
    public final int sqlite3PagerReadFileheader(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = this._storeInt(_33_, 0);
        memset((this._loadInt((_33_ + 4))), _32_, (this._loadInt((_33_ + 8))));
        label$0:
        do {
            if ((this._loadInt((this._loadInt(((this._loadInt((_33_ + 12))) + 60))))) == 0) {
                break label$0;
            }
            if ((this._storeInt(_33_, (sqlite3OsRead((this._loadInt(((this._loadInt((_33_ + 12))) + 60))), (this._loadInt((_33_ + 4))), (this._loadInt((_33_ + 8))), 0L)))) != 522) {
                break label$0;
            }
            this._storeInt(_33_, 0);
        }
        while (false);
        _32_ = this._loadInt(_33_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final void sqlite3PagerSetBusyhandler(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(((_31_ = this._loadInt((_33_ + 12))) + 152), (this._loadInt((_33_ + 8))));
        this._storeInt((_31_ + 156), _32_);
        return;
    }

    @Override()
    public final int sqlite3PagerIsreadonly(int _30_)
    {
        return (this._loadInt8u(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 13)));
    }

    @Override()
    public final int sqlite3PagerClose(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._loadInt(((this._storeInt((_32_ + 12), _30_)) + 164))));
        sqlite3BeginBenignMalloc();
        _31_ = this._storeInt8(((_30_ = this._loadInt((_32_ + 12))) + 4), 0);
        sqlite3WalClose((this._loadInt((_30_ + 172))), (this._loadInt8u((_30_ + 10))), (this._loadInt((_30_ + 128))), (this._loadInt((_32_ + 8))));
        this._storeInt(((_30_ = this._loadInt((_32_ + 12))) + 172), _31_);
        pager_reset(_30_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 14))) == 0) {
                    break label$1;
                }
                pager_unlock((this._loadInt((_32_ + 12))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt((this._loadInt(((this._loadInt((_32_ + 12))) + 64))))) == 0) {
                    break label$2;
                }
                pager_error((_30_ = this._loadInt((_32_ + 12))), (pagerSyncHotJournal(_30_)));
            }
            while (false);
            pagerUnlockAndRollback((this._loadInt((_32_ + 12))));
        }
        while (false);
        sqlite3EndBenignMalloc();
        sqlite3OsClose((this._loadInt(((this._loadInt((_32_ + 12))) + 64))));
        sqlite3OsClose((this._loadInt(((this._loadInt((_32_ + 12))) + 60))));
        sqlite3PageFree((this._loadInt((_32_ + 8))));
        sqlite3PcacheClose((this._loadInt(((this._loadInt((_32_ + 12))) + 168))));
        sqlite3_free((this._loadInt((_32_ + 12))));
        this._storeInt((0 + 4), (_32_ + 16));
        return 0;
    }

    @Override()
    public final int sqlite3BtreeSchema(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 12))) + 4))));
        sqlite3BtreeEnter((this._loadInt((_33_ + 12))));
        label$0:
        do {
            if ((this._loadInt(((this._loadInt(_33_)) + 52))) != 0) {
                break label$0;
            }
            if ((this._loadInt((_33_ + 8))) == 0) {
                break label$0;
            }
            _32_ = sqlite3DbMallocZero(0, (this._loadInt((_33_ + 8))));
            this._storeInt(((_31_ = this._loadInt(_33_)) + 52), _32_);
            this._storeInt((_31_ + 56), (this._loadInt((_33_ + 4))));
        }
        while (false);
        _32_ = this._loadInt(((this._loadInt(_33_)) + 52));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final void sqlite3PagerSetCachesize(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        sqlite3PcacheSetCachesize((this._loadInt(((this._loadInt((_32_ + 12))) + 168))), _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3PcacheSetCachesize(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt(((_30_ = this._loadInt((_32_ + 12))) + 16), _31_);
        label$0:
        do {
            if ((this._loadInt((_30_ + 40))) == 0) {
                break label$0;
            }
            this._viiTable[this._tableIndices[this._loadInt((0 + 20352))]].invoke((this._loadInt(((this._loadInt((_32_ + 12))) + 40))), (this._loadInt((_32_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int sqlite3WalClose(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        _33_ = this._storeInt((_34_ + 12), 0);
        label$0:
        do {
            if ((this._loadInt((_34_ + 28))) == 0) {
                break label$0;
            }
            this._storeInt((_34_ + 8), _33_);
            label$1:
            do {
                if ((this._storeInt((_34_ + 12), (sqlite3OsLock((this._loadInt(((this._loadInt((_34_ + 28))) + 4))), 4)))) != 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt8u(((this._loadInt((_34_ + 28))) + 38))) != 0) {
                        break label$2;
                    }
                    this._storeInt8(((this._loadInt((_34_ + 28))) + 38), 1);
                }
                while (false);
                if ((this._storeInt((_34_ + 12), (sqlite3WalCheckpoint((this._loadInt((_34_ + 28))), 0, 0, 0, (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 16))), 0, 0)))) != 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 8), 1);
            }
            while (false);
            walIndexClose((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 8))));
            sqlite3OsClose((this._loadInt(((this._loadInt((_34_ + 28))) + 8))));
            label$3:
            do {
                if ((this._loadInt((_34_ + 8))) == 0) {
                    break label$3;
                }
                sqlite3OsDelete((this._loadInt((_33_ = this._loadInt((_34_ + 28))))), (this._loadInt((_33_ + 92))), 0);
            }
            while (false);
            sqlite3_free((this._loadInt(((this._loadInt((_34_ + 28))) + 28))));
            sqlite3_free((this._loadInt((_34_ + 28))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 12));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final void sqlite3PcacheClose(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 40))) == 0) {
                break label$0;
            }
            this._viTable[this._tableIndices[this._loadInt((0 + 20376))]].invoke((this._loadInt(((this._loadInt((_31_ + 12))) + 40))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3PcacheSize()
    {
        return 48;
    }

    @Override()
    public final int pagerStress(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 16), (this._loadInt((_32_ + 24))));
        _31_ = this._storeInt((_32_ + 12), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_32_ + 16))) + 40))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 28), _31_);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 16))) + 19))) == 0) {
                    break label$2;
                }
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 16))) + 20))) == 0) {
                    break label$3;
                }
                if (((this._loadInt16u(((this._loadInt((_32_ + 20))) + 20))) & 4) == 0) {
                    break label$3;
                }
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            this._storeInt(((this._loadInt((_32_ + 20))) + 8), 0);
            label$4:
            do {
                label$5:
                do {
                    if ((pagerUseWal((this._loadInt((_32_ + 16))))) == 0) {
                        break label$5;
                    }
                    label$6:
                    do {
                        if ((subjRequiresPage((this._loadInt((_32_ + 20))))) == 0) {
                            break label$6;
                        }
                        this._storeInt((_32_ + 12), (subjournalPage((this._loadInt((_32_ + 20))))));
                    }
                    while (false);
                    if ((this._loadInt((_32_ + 12))) != 0) {
                        break label$4;
                    }
                    this._storeInt((_32_ + 12), (pagerWalFrames((this._loadInt((_32_ + 16))), (this._loadInt((_32_ + 20))), 0, 0, 0)));
                    break label$4;
                }
                while (false);
                label$7:
                do {
                    label$8:
                    do {
                        if (((this._loadInt16u(((this._loadInt((_32_ + 20))) + 20))) & 4) != 0) {
                            break label$8;
                        }
                        if ((this._loadInt8u(((this._loadInt((_32_ + 16))) + 15))) != 3) {
                            break label$7;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 12), (syncJournal((this._loadInt((_32_ + 16))), 1)));
                }
                while (false);
                label$9:
                do {
                    if ((this._loadInt((_32_ + 12))) != 0) {
                        break label$9;
                    }
                    if (((this._loadInt(((this._loadInt((_32_ + 20))) + 12))) & 4294967295L) <= ((this._loadInt(((this._loadInt((_32_ + 16))) + 24))) & 4294967295L)) {
                        break label$9;
                    }
                    if ((subjRequiresPage((this._loadInt((_32_ + 20))))) == 0) {
                        break label$9;
                    }
                    this._storeInt((_32_ + 12), (subjournalPage((this._loadInt((_32_ + 20))))));
                }
                while (false);
                if ((this._loadInt((_32_ + 12))) != 0) {
                    break label$4;
                }
                this._storeInt((_32_ + 12), (pager_write_pagelist((this._loadInt((_32_ + 16))), (this._loadInt((_32_ + 20))))));
            }
            while (false);
            label$10:
            do {
                if ((this._loadInt((_32_ + 12))) != 0) {
                    break label$10;
                }
                sqlite3PcacheMakeClean((this._loadInt((_32_ + 20))));
            }
            while (false);
            this._storeInt((_32_ + 28), (pager_error((this._loadInt((_32_ + 16))), (this._loadInt((_32_ + 12))))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final void sqlite3PcacheOpen(
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
        memset((this._storeInt((_36_ + 8), _35_)), 0, 48);
        this._storeInt(((_35_ = this._loadInt((_36_ + 8))) + 24), (this._loadInt((_36_ + 24))));
        this._storeInt((_35_ + 20), (this._loadInt((_36_ + 28))));
        this._storeInt(((this._loadInt((_36_ + 8))) + 28), (this._loadInt((_36_ + 20))));
        this._storeInt(((this._loadInt((_36_ + 8))) + 32), (this._loadInt((_36_ + 16))));
        this._storeInt(((this._loadInt((_36_ + 8))) + 36), (this._loadInt((_36_ + 12))));
        this._storeInt(((this._loadInt((_36_ + 8))) + 16), 100);
        this._storeInt((0 + 4), (_36_ + 32));
        return;
    }

    @Override()
    public final int sqlite3BtreeRollback(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 20), (this._loadInt(((this._storeInt((_31_ + 28), _30_)) + 4))));
        sqlite3BtreeEnter((this._loadInt((_31_ + 28))));
        label$0:
        do {
            if ((this._storeInt((_31_ + 24), (saveAllCursors((this._loadInt((_31_ + 20))), 0, 0)))) == 0) {
                break label$0;
            }
            sqlite3BtreeTripAllCursors((this._loadInt((_31_ + 28))), (this._loadInt((_31_ + 24))));
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt8u(((this._loadInt((_31_ + 28))) + 8))) != 2) {
                break label$1;
            }
            label$2:
            do {
                if ((this._storeInt((_31_ + 12), (sqlite3PagerRollback((this._loadInt((this._loadInt((_31_ + 20))))))))) == 0) {
                    break label$2;
                }
                this._storeInt((_31_ + 24), (this._loadInt((_31_ + 12))));
            }
            while (false);
            label$3:
            do {
                if ((btreeGetPage((this._loadInt((_31_ + 20))), 1, (_31_ + 16), 0)) != 0) {
                    break label$3;
                }
                label$4:
                do {
                    if ((this._storeInt((_31_ + 8), (sqlite3Get4byte(((this._loadInt(((this._loadInt((_31_ + 16))) + 64))) + 28))))) != 0) {
                        break label$4;
                    }
                    sqlite3PagerPagecount((this._loadInt((this._loadInt((_31_ + 20))))), (_31_ + 8));
                }
                while (false);
                this._storeInt(((this._loadInt((_31_ + 20))) + 48), (this._loadInt((_31_ + 8))));
                releasePage((this._loadInt((_31_ + 16))));
            }
            while (false);
            this._storeInt8(((this._loadInt((_31_ + 20))) + 23), 1);
        }
        while (false);
        btreeEndTransaction((this._loadInt((_31_ + 28))));
        _30_ = this._loadInt((_31_ + 24));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final int saveAllCursors(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        this._storeInt((_33_ + 12), (this._loadInt(((this._loadInt((_33_ + 24))) + 8))));
        label$0:
        do {
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt((_33_ + 12))) == 0) {
                            break label$1;
                        }
                        label$4:
                        do {
                            if ((this._loadInt((_33_ + 12))) == (this._loadInt((_33_ + 16)))) {
                                break label$4;
                            }
                            label$5:
                            do {
                                if ((this._loadInt((_33_ + 20))) == 0) {
                                    break label$5;
                                }
                                if ((this._loadInt(((this._loadInt((_33_ + 12))) + 20))) != (this._loadInt((_33_ + 20)))) {
                                    break label$4;
                                }
                            }
                            while (false);
                            if ((this._loadInt8u(((this._loadInt((_33_ + 12))) + 83))) != 1) {
                                break label$4;
                            }
                            if ((this._storeInt((_33_ + 8), (saveCursorPosition((this._loadInt((_33_ + 12))))))) != 0) {
                                break label$3;
                            }
                        }
                        while (false);
                        this._storeInt((_33_ + 12), (this._loadInt(((this._loadInt((_33_ + 12))) + 8))));
                        continue label$2;
                    }
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
    public final void sqlite3BtreeTripAllCursors(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        sqlite3BtreeEnter((this._loadInt((_32_ + 12))));
        this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 12))) + 4))) + 8))));
        label$0:
        while (true) {
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt((_32_ + 4))) == 0) {
                        break label$3;
                    }
                    sqlite3BtreeClearCursor((this._loadInt((_32_ + 4))));
                    this._storeInt8(((_31_ = this._loadInt((_32_ + 4))) + 83), 3);
                    this._storeInt((_31_ + 76), (this._loadInt((_32_ + 8))));
                    _30_ = this._storeInt(_32_, 0);
                    label$4:
                    while (true) {
                        if ((this._loadInt(_32_)) > (this._loadInt16s(((this._loadInt((_32_ + 4))) + 90)))) {
                            break label$2;
                        }
                        releasePage((this._loadInt((((this._loadInt((_32_ + 4))) + ((this._loadInt(_32_)) << 2)) + 132))));
                        this._storeInt((((this._loadInt((_32_ + 4))) + ((_31_ = this._loadInt(_32_)) << 2)) + 132), _30_);
                        this._storeInt(_32_, (_31_ + 1));
                        continue label$4;
                    }
                }
                while (false);
                this._storeInt((0 + 4), (_32_ + 16));
                return;
            }
            while (false);
            this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 4))) + 8))));
            continue label$0;
        }
    }

    @Override()
    public final void sqlite3BtreeClearCursor(int _30_)
    {
        int _31_ = 0;
        sqlite3_free((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 72))));
        this._storeInt(((_30_ = this._loadInt((_31_ + 12))) + 72), (this._storeInt8((_30_ + 83), 0)));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int saveCursorPosition(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (sqlite3BtreeKeySize((_30_ = this._storeInt((_32_ + 12), _30_)), (_30_ + 64))));
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt(((this._loadInt((_32_ + 12))) + 132))) + 2))) != 0) {
                break label$0;
            }
            label$1:
            do {
                label$2:
                do {
                    if ((this._storeInt((_32_ + 4), (sqlite3Malloc((this._loadInt(((this._loadInt((_32_ + 12))) + 64))))))) == 0) {
                        break label$2;
                    }
                    if ((this._storeInt((_32_ + 8), (sqlite3BtreeKey((_30_ = this._loadInt((_32_ + 12))), 0, (this._loadInt((_30_ + 64))), (this._loadInt((_32_ + 4))))))) == 0) {
                        break label$1;
                    }
                    sqlite3_free((this._loadInt((_32_ + 4))));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 8), 7);
                break label$0;
            }
            while (false);
            this._storeInt(((this._loadInt((_32_ + 12))) + 72), (this._loadInt((_32_ + 4))));
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt((_32_ + 8))) != 0) {
                break label$3;
            }
            _31_ = this._storeInt(_32_, 0);
            label$5:
            do {
                label$4:
                while (true) {
                    if ((this._loadInt(_32_)) > (this._loadInt16s(((this._loadInt((_32_ + 12))) + 90)))) {
                        break label$5;
                    }
                    releasePage((this._loadInt((((this._loadInt((_32_ + 12))) + ((this._loadInt(_32_)) << 2)) + 132))));
                    this._storeInt((((this._loadInt((_32_ + 12))) + ((_30_ = this._loadInt(_32_)) << 2)) + 132), _31_);
                    this._storeInt(_32_, (_30_ + 1));
                    continue label$4;
                }
            }
            while (false);
            this._storeInt8(((_30_ = this._loadInt((_32_ + 12))) + 83), 2);
            this._storeInt16((_30_ + 90), 65535);
        }
        while (false);
        invalidateOverflowCache((this._loadInt((_32_ + 12))));
        _30_ = this._loadInt((_32_ + 8));
        this._storeInt((0 + 4), (_32_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3BtreeKeySize(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 83))) == 1) {
                    break label$1;
                }
                this._storeLong((this._loadInt((_32_ + 8))), 0L);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt16u(((this._loadInt((_32_ + 12))) + 58))) != 0) {
                    break label$2;
                }
                _31_ = this._storeInt((_32_ + 4), (this._loadInt16s(((this._loadInt((_32_ + 12))) + 90))));
                btreeParseCell((this._loadInt((((_30_ = this._loadInt((_32_ + 12))) + (_31_ << 2)) + 132))), (this._loadInt16u(((_30_ + (_31_ << 1)) + 92))), (_30_ + 32));
                this._storeInt8(((this._loadInt((_32_ + 12))) + 82), 1);
            }
            while (false);
            this._storeLong((this._loadInt((_32_ + 8))), (this._loadLong(((this._loadInt((_32_ + 12))) + 32))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return 0;
    }

    @Override()
    public final int sqlite3BtreeKey(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        _33_ = accessPayload((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))), _33_, 0);
        this._storeInt((0 + 4), (_34_ + 16));
        return _33_;
    }

    @Override()
    public final int accessPayload(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 72), _30_);
        this._storeInt((_35_ + 68), _31_);
        this._storeInt((_35_ + 64), _32_);
        this._storeInt((_35_ + 60), _33_);
        this._storeInt((_35_ + 56), _34_);
        _34_ = 0;
        this._storeInt((_35_ + 40), (this._storeInt((_35_ + 48), 0)));
        this._storeInt((_35_ + 36), (this._loadInt((((_33_ = this._loadInt((_35_ + 72))) + ((this._loadInt16s((_33_ + 90))) << 2)) + 132))));
        this._storeInt((_35_ + 32), (this._loadInt(((this._loadInt((_35_ + 72))) + 4))));
        label$0:
        do {
            if ((this._loadInt16u(((this._loadInt((_35_ + 72))) + 58))) != 0) {
                break label$0;
            }
            _33_ = this._storeInt((_35_ + 28), (this._loadInt16s(((this._loadInt((_35_ + 72))) + 90))));
            btreeParseCell((this._loadInt((((_32_ = this._loadInt((_35_ + 72))) + (_33_ << 2)) + 132))), (this._loadInt16u(((_32_ + (_33_ << 1)) + 92))), (_32_ + 32));
            this._storeInt8(((this._loadInt((_35_ + 72))) + 82), 1);
        }
        while (false);
        this._storeInt((_35_ + 52), ((this._loadInt(((_33_ = this._loadInt((_35_ + 72))) + 40))) + (this._loadInt16u((_33_ + 52)))));
        label$1:
        do {
            if ((this._loadInt8u(((this._loadInt((_35_ + 36))) + 2))) != 0) {
                break label$1;
            }
            _34_ = this._loadInt(((this._loadInt((_35_ + 72))) + 32));
        }
        while (false);
        this._storeInt((_35_ + 44), _34_);
        label$2:
        do {
            label$3:
            do {
                label$4:
                do {
                    if ((((this._loadInt((_35_ + 68))) + (this._loadInt((_35_ + 64)))) & 4294967295L) > ((_34_ + (this._loadInt(((this._loadInt((_35_ + 72))) + 44)))) & 4294967295L)) {
                        break label$4;
                    }
                    if ((((this._loadInt((_35_ + 52))) + (this._loadInt16u(((this._loadInt((_35_ + 72))) + 54)))) & 4294967295L) <= (((this._loadInt(((this._loadInt((_35_ + 36))) + 64))) + (this._loadInt(((this._loadInt((_35_ + 32))) + 40)))) & 4294967295L)) {
                        break label$3;
                    }
                }
                while (false);
                this._storeInt((_35_ + 76), (sqlite3CorruptError(51367)));
                break label$2;
            }
            while (false);
            label$5:
            do {
                label$6:
                do {
                    if (((this._loadInt((_35_ + 68))) & 4294967295L) >= ((this._loadInt16u(((this._loadInt((_35_ + 72))) + 54))) & 4294967295L)) {
                        break label$6;
                    }
                    label$7:
                    do {
                        if ((((this._storeInt((_35_ + 24), (this._loadInt((_35_ + 64))))) + (this._loadInt((_35_ + 68)))) & 4294967295L) <= ((this._loadInt16u(((this._loadInt((_35_ + 72))) + 54))) & 4294967295L)) {
                            break label$7;
                        }
                        this._storeInt((_35_ + 24), ((this._loadInt16u(((this._loadInt((_35_ + 72))) + 54))) - (this._loadInt((_35_ + 68)))));
                    }
                    while (false);
                    this._storeInt((_35_ + 48), (copyPayload(((this._loadInt((_35_ + 52))) + (this._loadInt((_35_ + 68)))), (this._loadInt((_35_ + 60))), (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 56))), (this._loadInt(((this._loadInt((_35_ + 36))) + 68))))));
                    this._storeInt((_35_ + 68), 0);
                    this._storeInt((_35_ + 60), ((this._loadInt((_35_ + 60))) + (this._loadInt((_35_ + 24)))));
                    this._storeInt((_35_ + 64), ((this._loadInt((_35_ + 64))) - (this._loadInt((_35_ + 24)))));
                    break label$5;
                }
                while (false);
                this._storeInt((_35_ + 68), ((this._loadInt((_35_ + 68))) - (this._loadInt16u(((this._loadInt((_35_ + 72))) + 54)))));
            }
            while (false);
            label$8:
            do {
                if ((this._loadInt((_35_ + 48))) != 0) {
                    break label$8;
                }
                if ((this._loadInt((_35_ + 64))) == 0) {
                    break label$8;
                }
                this._storeInt((_35_ + 20), ((this._loadInt(((this._loadInt((_35_ + 32))) + 40))) + -4));
                this._storeInt((_35_ + 16), (sqlite3Get4byte(((this._loadInt((_35_ + 52))) + (this._loadInt16u(((this._loadInt((_35_ + 72))) + 54)))))));
                label$9:
                do {
                    if ((this._loadInt8u(((this._loadInt((_35_ + 72))) + 88))) == 0) {
                        break label$9;
                    }
                    if ((this._loadInt(((this._loadInt((_35_ + 72))) + 84))) != 0) {
                        break label$9;
                    }
                    _34_ = sqlite3MallocZero(((this._storeInt((_35_ + 12), (((((this._loadInt(((_34_ = this._loadInt((_35_ + 72))) + 48))) - (this._loadInt16u((_34_ + 54)))) + (_34_ = this._loadInt((_35_ + 20)))) + -1) / _34_))) << 2));
                    this._storeInt(((this._loadInt((_35_ + 72))) + 84), _34_);
                    if ((this._loadInt((_35_ + 12))) == 0) {
                        break label$9;
                    }
                    if ((this._loadInt(((this._loadInt((_35_ + 72))) + 84))) != 0) {
                        break label$9;
                    }
                    this._storeInt((_35_ + 48), 7);
                }
                while (false);
                label$10:
                do {
                    if ((this._loadInt(((this._loadInt((_35_ + 72))) + 84))) == 0) {
                        break label$10;
                    }
                    if ((this._loadInt(((this._loadInt(((this._loadInt((_35_ + 72))) + 84))) + (((this._loadInt((_35_ + 68))) / (this._loadInt((_35_ + 20)))) << 2)))) == 0) {
                        break label$10;
                    }
                    _34_ = this._storeInt((_35_ + 40), ((this._loadInt((_35_ + 68))) / (this._loadInt((_35_ + 20)))));
                    this._storeInt((_35_ + 16), (this._loadInt(((this._loadInt(((this._loadInt((_35_ + 72))) + 84))) + (_34_ << 2)))));
                    this._storeInt((_35_ + 68), ((this._loadInt((_35_ + 68))) % (this._loadInt((_35_ + 20)))));
                }
                while (false);
                label$12:
                do {
                    label$11:
                    while (true) {
                        _34_ = 0;
                        label$13:
                        do {
                            if ((this._loadInt((_35_ + 48))) != 0) {
                                break label$13;
                            }
                            _34_ = 0;
                            if ((this._loadInt((_35_ + 64))) == 0) {
                                break label$13;
                            }
                            _34_ = ((this._loadInt((_35_ + 16))) != 0) ? 1 : 0;
                        }
                        while (false);
                        if (_34_ == 0) {
                            break label$12;
                        }
                        label$14:
                        do {
                            if ((this._loadInt(((this._loadInt((_35_ + 72))) + 84))) == 0) {
                                break label$14;
                            }
                            this._storeInt(((this._loadInt(((this._loadInt((_35_ + 72))) + 84))) + ((this._loadInt((_35_ + 40))) << 2)), (this._loadInt((_35_ + 16))));
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
                                        if (((this._loadInt((_35_ + 68))) & 4294967295L) < ((this._loadInt((_35_ + 20))) & 4294967295L)) {
                                            break label$18;
                                        }
                                        if ((this._loadInt(((this._loadInt((_35_ + 72))) + 84))) == 0) {
                                            break label$17;
                                        }
                                        if ((this._loadInt((((this._loadInt(((this._loadInt((_35_ + 72))) + 84))) + ((this._loadInt((_35_ + 40))) << 2)) + 4))) == 0) {
                                            break label$17;
                                        }
                                        this._storeInt((_35_ + 16), (this._loadInt((((this._loadInt(((this._loadInt((_35_ + 72))) + 84))) + ((this._loadInt((_35_ + 40))) << 2)) + 4))));
                                        break label$16;
                                    }
                                    while (false);
                                    this._storeInt((_35_ + 4), (this._loadInt((_35_ + 64))));
                                    if ((this._storeInt((_35_ + 48), (sqlite3PagerAcquire((this._loadInt((this._loadInt((_35_ + 32))))), (this._loadInt((_35_ + 16))), (_35_ + 8), 0)))) != 0) {
                                        break label$15;
                                    }
                                    this._storeInt((_35_ + 16), (sqlite3Get4byte((this._storeInt((_35_ + 52), (sqlite3PagerGetData((this._loadInt((_35_ + 8))))))))));
                                    label$19:
                                    do {
                                        if ((((this._loadInt((_35_ + 4))) + (this._loadInt((_35_ + 68)))) & 4294967295L) <= ((this._loadInt((_35_ + 20))) & 4294967295L)) {
                                            break label$19;
                                        }
                                        this._storeInt((_35_ + 4), ((this._loadInt((_35_ + 20))) - (this._loadInt((_35_ + 68)))));
                                    }
                                    while (false);
                                    this._storeInt((_35_ + 48), (copyPayload((((this._loadInt((_35_ + 52))) + (this._loadInt((_35_ + 68)))) + 4), (this._loadInt((_35_ + 60))), (this._loadInt((_35_ + 4))), (this._loadInt((_35_ + 56))), (this._loadInt((_35_ + 8))))));
                                    sqlite3PagerUnref((this._loadInt((_35_ + 8))));
                                    this._storeInt((_35_ + 68), 0);
                                    this._storeInt((_35_ + 64), ((this._loadInt((_35_ + 64))) - (this._loadInt((_35_ + 4)))));
                                    this._storeInt((_35_ + 60), ((this._loadInt((_35_ + 60))) + (this._loadInt((_35_ + 4)))));
                                    break label$15;
                                }
                                while (false);
                                this._storeInt((_35_ + 48), (getOverflowPage((this._loadInt((_35_ + 32))), (this._loadInt((_35_ + 16))), 0, (_35_ + 16))));
                            }
                            while (false);
                            this._storeInt((_35_ + 68), ((this._loadInt((_35_ + 68))) - (this._loadInt((_35_ + 20)))));
                        }
                        while (false);
                        this._storeInt((_35_ + 40), ((this._loadInt((_35_ + 40))) + 1));
                        continue label$11;
                    }
                }
                while (false);
            }
            while (false);
            label$20:
            do {
                if ((this._loadInt((_35_ + 48))) != 0) {
                    break label$20;
                }
                if ((this._loadInt((_35_ + 64))) == 0) {
                    break label$20;
                }
                this._storeInt((_35_ + 76), (sqlite3CorruptError(51467)));
                break label$2;
            }
            while (false);
            this._storeInt((_35_ + 76), (this._loadInt((_35_ + 48))));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 76));
        this._storeInt((0 + 4), (_35_ + 80));
        return _34_;
    }

    @Override()
    public final void btreeParseCell(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        _31_ = this._storeInt((_33_ + 4), _32_);
        btreeParseCellPtr((_32_ = this._loadInt((_33_ + 12))), ((_30_ = this._loadInt((_32_ + 64))) + ((this._loadInt16u((_32_ + 18))) & (((this._loadInt8u((_32_ = _30_ + ((this._loadInt16u((_32_ + 12))) + ((this._loadInt((_33_ + 8))) << 1))))) << 8) | (this._loadInt8u((_32_ + 1)))))), _31_);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int copyPayload(int _30_, int _31_, int _32_, int _33_, int _34_)
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
                    label$3:
                    do {
                        if ((this._loadInt((_35_ + 12))) == 0) {
                            break label$3;
                        }
                        if ((this._storeInt((_35_ + 4), (sqlite3PagerWrite((this._loadInt((_35_ + 8))))))) == 0) {
                            break label$2;
                        }
                        this._storeInt((_35_ + 28), (this._loadInt((_35_ + 4))));
                        break label$0;
                    }
                    while (false);
                    memcpy((this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 16))));
                    break label$1;
                }
                while (false);
                memcpy((this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 16))));
            }
            while (false);
            this._storeInt((_35_ + 28), 0);
        }
        while (false);
        _34_ = this._loadInt((_35_ + 28));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int getOverflowPage(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_34_ + 40), _31_);
        this._storeInt((_34_ + 36), _32_);
        this._storeInt((_34_ + 32), _33_);
        _32_ = this._storeInt((_34_ + 20), (this._storeInt((_34_ + 24), (this._storeInt((_34_ + 28), 0)))));
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_34_ + 44))) + 21))) == 0) {
                break label$0;
            }
            this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 40))) + 1));
            label$2:
            do {
                label$1:
                while (true) {
                    _33_ = 1;
                    label$3:
                    do {
                        if ((ptrmapPageno((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 12))))) == (this._loadInt((_34_ + 12)))) {
                            break label$3;
                        }
                        _33_ = ((this._loadInt((_34_ + 12))) == (((this._loadInt((_32_ + 22332))) / (this._loadInt(((this._loadInt((_34_ + 44))) + 36)))) + 1)) ? 1 : 0;
                    }
                    while (false);
                    if (_33_ == 0) {
                        break label$2;
                    }
                    this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 12))) + 1));
                    continue label$1;
                }
            }
            while (false);
            if (((this._loadInt((_34_ + 12))) & 4294967295L) > ((btreePagecount((this._loadInt((_34_ + 44))))) & 4294967295L)) {
                break label$0;
            }
            if ((this._storeInt((_34_ + 20), (ptrmapGet((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 12))), (_34_ + 11), (_34_ + 16))))) != 0) {
                break label$0;
            }
            if ((this._loadInt8u((_34_ + 11))) != 4) {
                break label$0;
            }
            if ((this._loadInt((_34_ + 16))) != (this._loadInt((_34_ + 40)))) {
                break label$0;
            }
            this._storeInt((_34_ + 28), (this._loadInt((_34_ + 12))));
            this._storeInt((_34_ + 20), 101);
        }
        while (false);
        label$4:
        do {
            if ((this._loadInt((_34_ + 20))) != 0) {
                break label$4;
            }
            if ((this._storeInt((_34_ + 20), (btreeGetPage((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 40))), (_34_ + 24), 0)))) != 0) {
                break label$4;
            }
            this._storeInt((_34_ + 28), (sqlite3Get4byte((this._loadInt(((this._loadInt((_34_ + 24))) + 64))))));
        }
        while (false);
        this._storeInt((this._loadInt((_34_ + 32))), (this._loadInt((_34_ + 28))));
        label$5:
        do {
            label$6:
            do {
                if ((this._loadInt((_34_ + 36))) == 0) {
                    break label$6;
                }
                this._storeInt((this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 24))));
                break label$5;
            }
            while (false);
            releasePage((this._loadInt((_34_ + 24))));
        }
        while (false);
        _33_ = 0;
        label$7:
        do {
            if ((this._loadInt((_34_ + 20))) == 101) {
                break label$7;
            }
            _33_ = this._loadInt((_34_ + 20));
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final void sqlite3PrngSaveState()
    {
        memcpy(29836, 22447, 259);
        return;
    }

    @Override()
    public final void sqlite3PrngRestoreState()
    {
        memcpy(22447, 29836, 259);
        return;
    }

    @Override()
    public final void sqlite3PrngResetState()
    {
        this._storeInt8((0 + 22447), 0);
        return;
    }

    @Override()
    public final int sqlite3BitvecBuiltinTest(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_33_ + 40), _31_);
        this._storeInt((_33_ + 32), (this._storeInt((_33_ + 36), 0)));
        this._storeInt((_33_ + 28), -1);
        this._storeInt((_33_ + 36), (sqlite3BitvecCreate((this._loadInt((_33_ + 44))))));
        this._storeInt((_33_ + 32), (sqlite3_malloc(((((this._loadInt((_33_ + 44))) + 7) / 8) + 1))));
        this._storeInt((_33_ + 8), (sqlite3_malloc(512)));
        label$0:
        do {
            if ((this._loadInt((_33_ + 36))) == 0) {
                break label$0;
            }
            if ((this._loadInt((_33_ + 32))) == 0) {
                break label$0;
            }
            if ((this._loadInt((_33_ + 8))) == 0) {
                break label$0;
            }
            memset((this._loadInt((_33_ + 32))), 0, ((((this._loadInt((_33_ + 44))) + 7) / 8) + 1));
            sqlite3BitvecSet(0, 1);
            sqlite3BitvecClear(0, 1, (this._loadInt((_33_ + 8))));
            _32_ = this._storeInt((_33_ + 16), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._storeInt((_33_ + 12), (this._loadInt(((this._loadInt((_33_ + 40))) + ((this._loadInt((_33_ + 16))) << 2)))))) == 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        label$4:
                        do {
                            if (((_31_ = this._loadInt((_33_ + 12))) & 4294967295L) > (5 & 4294967295L)) {
                                break label$4;
                            }
                            if (((1 << _31_) & 38) == 0) {
                                break label$4;
                            }
                            this._storeInt((_33_ + 20), 4);
                            this._storeInt((_33_ + 24), ((this._loadInt((((this._loadInt((_33_ + 40))) + ((this._loadInt((_33_ + 16))) << 2)) + 8))) + -1));
                            this._storeInt((_30_ = (_31_ = (this._loadInt((_33_ + 40))) + ((this._loadInt((_33_ + 16))) << 2)) + 8), ((this._loadInt(_30_)) + (this._loadInt((_31_ + 12)))));
                            break label$3;
                        }
                        while (false);
                        this._storeInt((_33_ + 20), 2);
                        sqlite3_randomness(4, (_33_ + 24));
                    }
                    while (false);
                    label$5:
                    do {
                        if ((this._storeInt((_31_ = ((this._loadInt((_33_ + 40))) + ((this._loadInt((_33_ + 16))) << 2)) + 4), ((this._loadInt(_31_)) + -1))) < 1) {
                            break label$5;
                        }
                        this._storeInt((_33_ + 20), _32_);
                    }
                    while (false);
                    this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + (this._loadInt((_33_ + 20)))));
                    this._storeInt((_33_ + 24), (((this._loadInt((_33_ + 24))) & 2147483647) % (this._loadInt((_33_ + 44)))));
                    label$6:
                    do {
                        if (((this._loadInt8u((_33_ + 12))) & 1) != 0) {
                            break label$6;
                        }
                        this._storeInt8((_30_ = (this._loadInt((_33_ + 32))) + ((_31_ = (this._loadInt((_33_ + 24))) + 1) >> 3)), ((this._loadInt8u(_30_)) & (Integer.rotateLeft(-2, ((int) (_31_ & 7))))));
                        sqlite3BitvecClear((this._loadInt((_33_ + 36))), ((this._loadInt((_33_ + 24))) + 1), (this._loadInt((_33_ + 8))));
                        continue label$1;
                    }
                    while (false);
                    this._storeInt8((_30_ = (this._loadInt((_33_ + 32))) + ((_31_ = (this._loadInt((_33_ + 24))) + 1) >> 3)), ((this._loadInt8u(_30_)) | (1 << (_31_ & 7))));
                    if ((this._loadInt((_33_ + 12))) == 5) {
                        continue label$1;
                    }
                    if ((sqlite3BitvecSet((this._loadInt((_33_ + 36))), ((this._loadInt((_33_ + 24))) + 1))) == 0) {
                        continue label$1;
                    }
                    break label$0;
                }
            }
            while (false);
            this._storeInt((_33_ + 28), ((((sqlite3BitvecTest(0, 0)) + (sqlite3BitvecTest((this._loadInt((_33_ + 36))), ((this._loadInt((_33_ + 44))) + 1)))) + (sqlite3BitvecTest((this._loadInt((_33_ + 36))), 0))) + ((sqlite3BitvecSize((this._loadInt((_33_ + 36))))) - (this._loadInt((_33_ + 44))))));
            _30_ = this._storeInt((_33_ + 24), 1);
            label$8:
            do {
                label$7:
                while (true) {
                    if ((this._loadInt((_33_ + 24))) > (this._loadInt((_33_ + 44)))) {
                        break label$0;
                    }
                    if (((((this._loadInt8u(((this._loadInt((_33_ + 32))) + ((_31_ = this._loadInt((_33_ + 24))) >> 3)))) & (_30_ << (_31_ & 7))) != 0) ? 1 : 0) != (sqlite3BitvecTest((this._loadInt((_33_ + 36))), _31_))) {
                        break label$8;
                    }
                    this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + _30_));
                    continue label$7;
                }
            }
            while (false);
            this._storeInt((_33_ + 28), (this._loadInt((_33_ + 24))));
        }
        while (false);
        sqlite3_free((this._loadInt((_33_ + 8))));
        sqlite3_free((this._loadInt((_33_ + 32))));
        sqlite3BitvecDestroy((this._loadInt((_33_ + 36))));
        _31_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 48));
        return _31_;
    }

    @Override()
    public final void sqlite3BenignMallocHooks(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        _33_ = this._loadInt((0 + 4));
        _32_ = this._storeInt((0 + 22986), _31_);
        this._storeInt(((_31_ = _33_ - 16) + 12), _30_);
        this._storeInt((_31_ + 8), _32_);
        this._storeInt((0 + 22982), (this._loadInt((_31_ + 12))));
        return;
    }

    @Override()
    public final int sqlite3KeywordCode(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = keywordCode((this._loadInt((_32_ + 12))), _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3ErrStr(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), _30_);
        label$0:
        do {
            if ((this._storeInt((_31_ + 8), (this._loadInt8u((_31_ + 8))))) < 0) {
                break label$0;
            }
            if ((this._loadInt((_31_ + 8))) > 26) {
                break label$0;
            }
            if ((this._loadInt((((this._loadInt((_31_ + 8))) << 2) + 30096))) == 0) {
                break label$0;
            }
            this._storeInt((_31_ + 12), (this._loadInt((((this._loadInt((_31_ + 8))) << 2) + 30096))));
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        this._storeInt((_31_ + 12), 30208);
        return (this._loadInt((_31_ + 12)));
    }

    @Override()
    public final void sqlite3VdbeMemSetZeroBlob(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        sqlite3VdbeMemRelease((this._loadInt((_32_ + 12))));
        this._storeInt8(((_31_ = this._loadInt((_32_ + 12))) + 30), 4);
        this._storeInt16((_31_ + 28), 16400);
        _31_ = this._storeInt((_31_ + 24), 0);
        label$0:
        do {
            if ((this._loadInt((_32_ + 8))) > -1) {
                break label$0;
            }
            this._storeInt((_32_ + 8), _31_);
        }
        while (false);
        this._storeInt8(((_31_ = this._loadInt((_32_ + 12))) + 31), 1);
        this._storeInt((_31_ + 16), (this._loadInt((_32_ + 8))));
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int openDatabase(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        int _35_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_34_ + 36), _31_);
        this._storeInt((_34_ + 32), _32_);
        this._storeInt((_34_ + 28), _33_);
        _33_ = this._storeInt((_34_ + 8), (this._storeInt((_34_ + 12), 0)));
        this._storeInt((this._loadInt((_34_ + 36))), _33_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_34_ + 20), (sqlite3_initialize()))) == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 44), (this._loadInt((_34_ + 20))));
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
                            if (((1 << ((this._loadInt((_34_ + 32))) & 7)) & 70) == 0) {
                                break label$5;
                            }
                            if ((this._loadInt((0 + 20244))) == 0) {
                                break label$4;
                            }
                            if (((this._loadInt8u((_34_ + 33))) & 128) == 0) {
                                break label$3;
                            }
                            this._storeInt((_34_ + 16), 0);
                            break label$2;
                        }
                        while (false);
                        this._storeInt((_34_ + 44), (sqlite3MisuseError(109980)));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_34_ + 16), 0);
                    break label$2;
                }
                while (false);
                label$6:
                do {
                    if (((this._loadInt8u((_34_ + 34))) & 1) == 0) {
                        break label$6;
                    }
                    this._storeInt((_34_ + 16), 1);
                    break label$2;
                }
                while (false);
                this._storeInt((_34_ + 16), (this._loadInt((0 + 20248))));
            }
            while (false);
            label$7:
            do {
                label$8:
                do {
                    if (((this._loadInt8u((_34_ + 34))) & 4) == 0) {
                        break label$8;
                    }
                    this._storeInt((_34_ + 32), ((this._loadInt((_34_ + 32))) & -131073));
                    break label$7;
                }
                while (false);
                if ((this._loadInt((0 + 20424))) == 0) {
                    break label$7;
                }
                this._storeInt((_34_ + 32), ((this._loadInt((_34_ + 32))) | 131072));
            }
            while (false);
            this._storeInt((_34_ + 32), ((this._loadInt((_34_ + 32))) & -655129));
            label$9:
            do {
                if ((this._storeInt((_34_ + 24), (sqlite3MallocZero(512)))) == 0) {
                    break label$9;
                }
                label$10:
                do {
                    label$11:
                    do {
                        label$12:
                        do {
                            if ((this._loadInt((_34_ + 16))) == 0) {
                                break label$12;
                            }
                            this._storeInt(((this._loadInt((_34_ + 24))) + 68), 8);
                            if (1 == 0) {
                                break label$11;
                            }
                        }
                        while (false);
                        _30_ = this._storeInt(((_33_ = this._loadInt((_34_ + 24))) + 24), 255);
                        _31_ = this._storeInt((_33_ + 4), 2);
                        this._storeInt((_33_ + 56), -264537850);
                        this._storeInt(((_33_ = this._loadInt((_34_ + 24))) + 8), (_33_ + 444));
                        memcpy(((this._loadInt((_34_ + 24))) + 72), 29792, 44);
                        _32_ = this._storeInt8(((_33_ = this._loadInt((_34_ + 24))) + 28), 1);
                        this._storeInt8((_33_ + 32), _30_);
                        _33_ = this._storeInt((_33_ + 36), 0);
                        this._storeInt(((_30_ = this._loadInt((_34_ + 24))) + 12), ((this._loadInt((_30_ + 12))) | 1209010176));
                        sqlite3HashInit(((this._loadInt((_34_ + 24))) + 412));
                        sqlite3HashInit(((this._loadInt((_34_ + 24))) + 288));
                        createCollation((this._loadInt((_34_ + 24))), 31040, _32_, _32_, _33_, 29, _33_);
                        createCollation((this._loadInt((_34_ + 24))), 31040, 3, _32_, _33_, 29, _33_);
                        createCollation((this._loadInt((_34_ + 24))), 31040, _31_, _32_, _33_, 29, _33_);
                        createCollation((this._loadInt((_34_ + 24))), 31056, _32_, _33_, _32_, 29, _33_);
                        if ((this._loadInt8u(((this._loadInt((_34_ + 24))) + 30))) != 0) {
                            break label$9;
                        }
                        _30_ = sqlite3FindCollSeq((this._loadInt((_34_ + 24))), _32_, 31040, _33_);
                        this._storeInt(((_35_ = this._loadInt((_34_ + 24))) + 44), _30_);
                        createCollation(_35_, 31072, _32_, _31_, _33_, 30, _33_);
                        this._storeInt(((_33_ = this._loadInt((_34_ + 24))) + 16), (this._loadInt((_34_ + 32))));
                        if ((this._storeInt((_34_ + 20), (sqlite3ParseUri((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 40))), (_34_ + 32), _33_, (_34_ + 12), (_34_ + 8))))) == 0) {
                            break label$10;
                        }
                        label$13:
                        do {
                            if ((this._loadInt((_34_ + 20))) != 7) {
                                break label$13;
                            }
                            this._storeInt8(((this._loadInt((_34_ + 24))) + 30), 1);
                        }
                        while (false);
                        _temp$0 = 22192;
                        _temp$1 = 0;
                        _temp$2 = ((this._storeInt(_34_, (this._loadInt((_34_ + 8))))) != 0) ? _temp$0 : _temp$1;
                        sqlite3Error((this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))), _temp$2, _34_);
                        sqlite3_free((this._loadInt((_34_ + 8))));
                        break label$9;
                    }
                    while (false);
                    sqlite3_free((this._loadInt((_34_ + 24))));
                    this._storeInt((_34_ + 24), 0);
                    break label$9;
                }
                while (false);
                label$14:
                do {
                    if ((this._storeInt((_34_ + 20), (sqlite3BtreeOpen((this._loadInt((_33_ = this._loadInt((_34_ + 24))))), (this._loadInt((_34_ + 12))), _33_, ((this._loadInt((_33_ + 8))) + 4), 0, ((this._loadInt((_34_ + 32))) | 256))))) == 0) {
                        break label$14;
                    }
                    label$15:
                    do {
                        if ((this._loadInt((_34_ + 20))) != 3082) {
                            break label$15;
                        }
                        this._storeInt((_34_ + 20), 7);
                    }
                    while (false);
                    sqlite3Error((this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))), 0, 0);
                    break label$9;
                }
                while (false);
                _33_ = sqlite3SchemaGet((_33_ = this._loadInt((_34_ + 24))), (this._loadInt(((this._loadInt((_33_ + 8))) + 4))));
                this._storeInt(((this._loadInt(((_32_ = this._loadInt((_34_ + 24))) + 8))) + 12), _33_);
                _33_ = sqlite3SchemaGet(_32_, 0);
                this._storeInt(((this._loadInt(((_32_ = this._loadInt((_34_ + 24))) + 8))) + 28), _33_);
                this._storeInt((this._loadInt((_32_ + 8))), 31088);
                this._storeInt8(((this._loadInt(((_33_ = this._loadInt((_34_ + 24))) + 8))) + 9), 3);
                this._storeInt(((this._loadInt((_33_ + 8))) + 16), 31104);
                this._storeInt8(((this._loadInt(((this._loadInt((_34_ + 24))) + 8))) + 25), 1);
                this._storeInt(((this._loadInt((_34_ + 24))) + 56), -1607883113);
                if ((this._loadInt8u(((this._loadInt((_34_ + 24))) + 30))) != 0) {
                    break label$9;
                }
                sqlite3Error((this._loadInt((_34_ + 24))), 0, 0, 0);
                sqlite3RegisterBuiltinFunctions((this._loadInt((_34_ + 24))));
                sqlite3AutoLoadExtensions((this._loadInt((_34_ + 24))));
                if ((this._storeInt((_34_ + 20), (sqlite3_errcode((this._loadInt((_34_ + 24))))))) != 0) {
                    break label$9;
                }
                sqlite3Error((this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))), 0, 0);
                setupLookaside((this._loadInt((_34_ + 24))), 0, (this._loadInt((0 + 20260))), (this._loadInt((0 + 20264))));
                sqlite3_wal_autocheckpoint((this._loadInt((_34_ + 24))), 1000);
            }
            while (false);
            sqlite3_free((this._loadInt((_34_ + 12))));
            label$16:
            do {
                label$17:
                do {
                    if ((this._storeInt((_34_ + 20), (sqlite3_errcode((this._loadInt((_34_ + 24))))))) != 7) {
                        break label$17;
                    }
                    sqlite3_close((this._loadInt((_34_ + 24))));
                    this._storeInt((_34_ + 24), 0);
                    break label$16;
                }
                while (false);
                if ((this._loadInt((_34_ + 20))) == 0) {
                    break label$16;
                }
                this._storeInt(((this._loadInt((_34_ + 24))) + 56), 1266094736);
            }
            while (false);
            this._storeInt((this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 24))));
            this._storeInt((_34_ + 44), (sqlite3ApiExit(0, (this._loadInt((_34_ + 20))))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int binCollFunc(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_35_ + 24))) >= (this._loadInt((_35_ + 16)))) {
                    break label$1;
                }
                _34_ = this._loadInt((_35_ + 24));
                break label$0;
            }
            while (false);
            _34_ = this._loadInt((_35_ + 16));
        }
        while (false);
        this._storeInt((_35_ + 4), _34_);
        label$2:
        do {
            if ((this._storeInt((_35_ + 8), (memcmp((this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 12))), _34_)))) != 0) {
                break label$2;
            }
            label$3:
            do {
                if ((this._loadInt((_35_ + 28))) == 0) {
                    break label$3;
                }
                if ((allSpaces(((this._loadInt((_35_ + 20))) + (_34_ = this._loadInt((_35_ + 4)))), ((this._loadInt((_35_ + 24))) - _34_))) == 0) {
                    break label$3;
                }
                if ((allSpaces(((this._loadInt((_35_ + 12))) + (_34_ = this._loadInt((_35_ + 4)))), ((this._loadInt((_35_ + 16))) - _34_))) != 0) {
                    break label$2;
                }
            }
            while (false);
            this._storeInt((_35_ + 8), ((this._loadInt((_35_ + 24))) - (this._loadInt((_35_ + 16)))));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 8));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int createCollation(
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
        this._storeInt(((_37_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_37_ + 52), _31_);
        this._storeInt8((_37_ + 51), _32_);
        this._storeInt8((_37_ + 50), _33_);
        this._storeInt((_37_ + 44), _34_);
        this._storeInt((_37_ + 40), _35_);
        this._storeInt((_37_ + 36), _36_);
        this._storeInt((_37_ + 24), (sqlite3Strlen30((this._loadInt((_37_ + 52))))));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_37_ + 28), (this._loadInt8u((_37_ + 51))))) == 4) {
                    break label$1;
                }
                if ((this._loadInt((_37_ + 28))) != 8) {
                    break label$0;
                }
            }
            while (false);
            _temp$0 = 2;
            _temp$1 = 3;
            _temp$2 = ((this._loadInt8s((0 + 29180))) != 0) ? _temp$0 : _temp$1;
            this._storeInt((_37_ + 28), _temp$2);
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                label$4:
                do {
                    if ((this._loadInt((_37_ + 28))) < 1) {
                        break label$4;
                    }
                    if ((this._loadInt((_37_ + 28))) < 4) {
                        break label$3;
                    }
                }
                while (false);
                this._storeInt((_37_ + 60), (sqlite3MisuseError(109561)));
                break label$2;
            }
            while (false);
            label$5:
            do {
                if ((this._storeInt((_37_ + 32), (sqlite3FindCollSeq((this._loadInt((_37_ + 56))), (this._loadInt8u((_37_ + 28))), (this._loadInt((_37_ + 52))), 0)))) == 0) {
                    break label$5;
                }
                if ((this._loadInt(((this._loadInt((_37_ + 32))) + 12))) == 0) {
                    break label$5;
                }
                label$6:
                do {
                    if ((this._loadInt(((this._loadInt((_37_ + 56))) + 140))) == 0) {
                        break label$6;
                    }
                    sqlite3Error((this._loadInt((_37_ + 56))), 5, 31520, 0);
                    this._storeInt((_37_ + 60), 5);
                    break label$2;
                }
                while (false);
                sqlite3ExpirePreparedStatements((this._loadInt((_37_ + 56))));
                if (((this._loadInt8u(((this._loadInt((_37_ + 32))) + 4))) & 247) != (this._loadInt((_37_ + 28)))) {
                    break label$5;
                }
                this._storeInt((_37_ + 20), (sqlite3HashFind(((this._loadInt((_37_ + 56))) + 412), (this._loadInt((_37_ + 52))), (this._loadInt((_37_ + 24))))));
                _35_ = this._storeInt((_37_ + 16), 0);
                label$8:
                do {
                    label$7:
                    while (true) {
                        if ((this._loadInt((_37_ + 16))) > 2) {
                            break label$8;
                        }
                        label$9:
                        do {
                            if ((this._loadInt8u(((this._storeInt((_37_ + 12), ((this._loadInt((_37_ + 20))) + ((this._loadInt((_37_ + 16))) * 20)))) + 4))) != (this._loadInt8u(((this._loadInt((_37_ + 32))) + 4)))) {
                                break label$9;
                            }
                            label$10:
                            do {
                                if ((this._loadInt(((this._loadInt((_37_ + 12))) + 16))) == 0) {
                                    break label$10;
                                }
                                this._viTable[this._tableIndices[this._loadInt(((_36_ = this._loadInt((_37_ + 12))) + 16))]].invoke((this._loadInt((_36_ + 8))));
                            }
                            while (false);
                            this._storeInt(((this._loadInt((_37_ + 12))) + 12), _35_);
                        }
                        while (false);
                        this._storeInt((_37_ + 16), ((this._loadInt((_37_ + 16))) + 1));
                        continue label$7;
                    }
                }
                while (false);
            }
            while (false);
            label$11:
            do {
                if ((this._storeInt((_37_ + 32), (sqlite3FindCollSeq((this._loadInt((_37_ + 56))), (this._loadInt8u((_37_ + 28))), (this._loadInt((_37_ + 52))), 1)))) == 0) {
                    break label$11;
                }
                this._storeInt(((_36_ = this._loadInt((_37_ + 32))) + 8), (this._loadInt((_37_ + 44))));
                this._storeInt((_36_ + 12), (this._loadInt((_37_ + 40))));
                this._storeInt(((this._loadInt((_37_ + 32))) + 16), (this._loadInt((_37_ + 36))));
                this._storeInt8(((this._loadInt((_37_ + 32))) + 4), ((this._loadInt((_37_ + 28))) | ((this._loadInt8u((_37_ + 51))) & 8)));
                this._storeInt8(((this._loadInt((_37_ + 32))) + 5), (this._loadInt8u((_37_ + 50))));
                sqlite3Error((this._loadInt((_37_ + 56))), 0, 0, 0);
                this._storeInt((_37_ + 60), 0);
                break label$2;
            }
            while (false);
            this._storeInt((_37_ + 60), 7);
        }
        while (false);
        _36_ = this._loadInt((_37_ + 60));
        this._storeInt((0 + 4), (_37_ + 64));
        return _36_;
    }

    @Override()
    public final int sqlite3FindCollSeq(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt8((_34_ + 27), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_34_ + 20))) == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 12), (findCollSeqEntry((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 16))))));
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 12), (this._loadInt(((this._loadInt((_34_ + 28))) + 44))));
        }
        while (false);
        label$2:
        do {
            if ((this._loadInt((_34_ + 12))) == 0) {
                break label$2;
            }
            this._storeInt((_34_ + 12), (((this._loadInt((_34_ + 12))) + ((this._loadInt8u((_34_ + 27))) * 20)) + -20));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 12));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final int nocaseCollatingFunc(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        _33_ = this._loadInt((_35_ + 20));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_35_ + 24))) >= (this._loadInt((_35_ + 16)))) {
                    break label$1;
                }
                _32_ = this._loadInt((_35_ + 24));
                break label$0;
            }
            while (false);
            _32_ = this._loadInt((_35_ + 16));
        }
        while (false);
        label$2:
        do {
            if ((this._storeInt((_35_ + 8), (sqlite3_strnicmp(_33_, _34_, _32_)))) != 0) {
                break label$2;
            }
            this._storeInt((_35_ + 8), ((this._loadInt((_35_ + 24))) - (this._loadInt((_35_ + 16)))));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 8));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3ParseUri(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_)
    {
        int _36_ = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 176))) + 168), _30_);
        this._storeInt((_36_ + 164), _31_);
        this._storeInt((_36_ + 160), _32_);
        this._storeInt((_36_ + 156), _33_);
        this._storeInt((_36_ + 152), _34_);
        this._storeInt((_36_ + 148), _35_);
        _35_ = this._storeInt((_36_ + 144), 0);
        this._storeInt((_36_ + 140), (this._loadInt((this._loadInt((_36_ + 160))))));
        this._storeInt((_36_ + 136), (this._loadInt((_36_ + 168))));
        this._storeInt((_36_ + 124), (sqlite3Strlen30((this._loadInt((_36_ + 164))))));
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
                                if (((this._loadInt8u((_36_ + 140))) & 64) != 0) {
                                    break label$5;
                                }
                                if ((this._loadInt((_35_ + 20252))) == 0) {
                                    break label$4;
                                }
                            }
                            while (false);
                            if ((this._loadInt((_36_ + 124))) < 5) {
                                break label$4;
                            }
                            if ((memcmp((this._loadInt((_36_ + 164))), 31184, 5)) == 0) {
                                break label$3;
                            }
                        }
                        while (false);
                        label$6:
                        do {
                            if ((this._storeInt((_36_ + 132), (sqlite3_malloc(((this._loadInt((_36_ + 124))) + 2))))) == 0) {
                                break label$6;
                            }
                            memcpy((this._loadInt((_36_ + 132))), (this._loadInt((_36_ + 164))), (this._loadInt((_36_ + 124))));
                            this._storeInt8(((_35_ = (this._loadInt((_36_ + 132))) + (this._loadInt((_36_ + 124)))) + 1), (this._storeInt8(_35_, 0)));
                            break label$2;
                        }
                        while (false);
                        this._storeInt((_36_ + 172), 7);
                        break label$0;
                    }
                    while (false);
                    _35_ = this._storeInt((_36_ + 108), 0);
                    this._storeInt((_36_ + 104), ((this._loadInt((_36_ + 124))) + 2));
                    this._storeInt((_36_ + 140), ((this._loadInt((_36_ + 140))) | 64));
                    this._storeInt((_36_ + 112), _35_);
                    label$8:
                    do {
                        label$7:
                        while (true) {
                            if ((this._loadInt((_36_ + 112))) >= (this._loadInt((_36_ + 124)))) {
                                break label$8;
                            }
                            this._storeInt((_36_ + 104), ((this._loadInt((_36_ + 104))) + (((this._loadInt8s(((this._loadInt((_36_ + 164))) + (this._loadInt((_36_ + 112)))))) == 38) ? 1 : 0)));
                            this._storeInt((_36_ + 112), ((this._loadInt((_36_ + 112))) + 1));
                            continue label$7;
                        }
                    }
                    while (false);
                    label$9:
                    do {
                        label$10:
                        do {
                            label$11:
                            do {
                                if ((this._storeInt((_36_ + 132), (sqlite3_malloc((this._loadInt((_36_ + 104))))))) == 0) {
                                    break label$11;
                                }
                                label$12:
                                do {
                                    label$13:
                                    do {
                                        if ((this._loadInt8s(((this._loadInt((_36_ + 164))) + 5))) != 47) {
                                            break label$13;
                                        }
                                        if ((this._loadInt8s(((this._loadInt((_36_ + 164))) + 6))) != 47) {
                                            break label$13;
                                        }
                                        this._storeInt((_36_ + 112), 7);
                                        label$15:
                                        do {
                                            label$14:
                                            while (true) {
                                                _35_ = 0;
                                                label$16:
                                                do {
                                                    if ((this._loadInt8s(((this._loadInt((_36_ + 164))) + (this._loadInt((_36_ + 112)))))) == 0) {
                                                        break label$16;
                                                    }
                                                    _35_ = ((this._loadInt8s(((this._loadInt((_36_ + 164))) + (this._loadInt((_36_ + 112)))))) != 47) ? 1 : 0;
                                                }
                                                while (false);
                                                if (_35_ == 0) {
                                                    break label$15;
                                                }
                                                this._storeInt((_36_ + 112), ((this._loadInt((_36_ + 112))) + 1));
                                                continue label$14;
                                            }
                                        }
                                        while (false);
                                        if ((this._loadInt((_36_ + 112))) == 7) {
                                            break label$12;
                                        }
                                        label$17:
                                        do {
                                            if ((this._loadInt((_36_ + 112))) != 16) {
                                                break label$17;
                                            }
                                            if ((memcmp(31200, ((this._loadInt((_36_ + 164))) + 7), 9)) == 0) {
                                                break label$12;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_36_ + 4), ((this._loadInt((_36_ + 164))) + 7));
                                        this._storeInt(_36_, ((this._loadInt((_36_ + 112))) + -7));
                                        _35_ = sqlite3_mprintf(31216, _36_);
                                        this._storeInt((this._loadInt((_36_ + 148))), _35_);
                                        this._storeInt((_36_ + 144), 1);
                                        break label$1;
                                    }
                                    while (false);
                                    this._storeInt((_36_ + 112), 5);
                                }
                                while (false);
                                _33_ = this._storeInt((_36_ + 116), 0);
                                label$19:
                                do {
                                    label$18:
                                    while (true) {
                                        _35_ = 0;
                                        label$20:
                                        do {
                                            if ((this._storeInt8((_36_ + 131), (this._loadInt8u(((this._loadInt((_36_ + 164))) + (this._loadInt((_36_ + 112)))))))) == 0) {
                                                break label$20;
                                            }
                                            _35_ = ((this._loadInt8s((_36_ + 131))) != 35) ? 1 : 0;
                                        }
                                        while (false);
                                        if (_35_ == 0) {
                                            break label$19;
                                        }
                                        this._storeInt((_36_ + 112), ((this._loadInt((_36_ + 112))) + 1));
                                        label$21:
                                        do {
                                            label$22:
                                            do {
                                                if ((this._loadInt8s((_36_ + 131))) != 37) {
                                                    break label$22;
                                                }
                                                if (((this._loadInt8u(((this._loadInt8u(((this._loadInt((_36_ + 164))) + (this._loadInt((_36_ + 112)))))) + 21776))) & 8) == 0) {
                                                    break label$22;
                                                }
                                                if (((this._loadInt8u(((this._loadInt8u((((this._loadInt((_36_ + 164))) + (this._loadInt((_36_ + 112)))) + 1))) + 21776))) & 8) == 0) {
                                                    break label$22;
                                                }
                                                this._storeInt((_36_ + 112), ((_35_ = this._loadInt((_36_ + 112))) + 1));
                                                this._storeInt((_36_ + 100), ((sqlite3HexToInt((this._loadInt8s((_35_ + (this._loadInt((_36_ + 164)))))))) << 4));
                                                this._storeInt((_36_ + 112), ((_35_ = this._loadInt((_36_ + 112))) + 1));
                                                label$23:
                                                do {
                                                    if ((this._storeInt((_36_ + 100), ((sqlite3HexToInt((this._loadInt8s((_35_ + (this._loadInt((_36_ + 164)))))))) + (this._loadInt((_36_ + 100)))))) == 0) {
                                                        break label$23;
                                                    }
                                                    this._storeInt8((_36_ + 131), (this._loadInt((_36_ + 100))));
                                                    break label$21;
                                                }
                                                while (false);
                                                label$24:
                                                while (true) {
                                                    _35_ = 0;
                                                    label$26:
                                                    do {
                                                        if ((this._storeInt8((_36_ + 131), (this._loadInt8u(((this._loadInt((_36_ + 164))) + (this._loadInt((_36_ + 112)))))))) == 0) {
                                                            break label$26;
                                                        }
                                                        if ((this._loadInt8s((_36_ + 131))) == 35) {
                                                            break label$26;
                                                        }
                                                        label$27:
                                                        do {
                                                            if ((this._loadInt((_36_ + 116))) != 0) {
                                                                break label$27;
                                                            }
                                                            if ((this._loadInt8s((_36_ + 131))) == 63) {
                                                                break label$26;
                                                            }
                                                        }
                                                        while (false);
                                                        label$28:
                                                        do {
                                                            if ((this._loadInt((_36_ + 116))) != 1) {
                                                                break label$28;
                                                            }
                                                            if ((this._loadInt8s((_36_ + 131))) == 61) {
                                                                break label$26;
                                                            }
                                                            if ((this._loadInt8s((_36_ + 131))) == 38) {
                                                                break label$26;
                                                            }
                                                        }
                                                        while (false);
                                                        _35_ = 1;
                                                        if ((this._loadInt((_36_ + 116))) != 2) {
                                                            break label$26;
                                                        }
                                                        _35_ = ((this._loadInt8s((_36_ + 131))) != 38) ? 1 : 0;
                                                    }
                                                    while (false);
                                                    if (_35_ == 0) {
                                                        continue label$18;
                                                    }
                                                    this._storeInt((_36_ + 112), ((this._loadInt((_36_ + 112))) + 1));
                                                    continue label$24;
                                                }
                                            }
                                            while (false);
                                            label$29:
                                            do {
                                                label$30:
                                                do {
                                                    if ((this._loadInt((_36_ + 116))) != 1) {
                                                        break label$30;
                                                    }
                                                    label$31:
                                                    do {
                                                        if ((this._loadInt8s((_36_ + 131))) == 38) {
                                                            break label$31;
                                                        }
                                                        if ((this._loadInt8s((_36_ + 131))) != 61) {
                                                            break label$30;
                                                        }
                                                    }
                                                    while (false);
                                                    label$32:
                                                    do {
                                                        if ((this._loadInt8s((((this._loadInt((_36_ + 132))) + (this._loadInt((_36_ + 108)))) + -1))) == 0) {
                                                            break label$32;
                                                        }
                                                        if ((this._loadInt8s((_36_ + 131))) != 38) {
                                                            break label$29;
                                                        }
                                                        this._storeInt((_36_ + 108), ((_35_ = this._loadInt((_36_ + 108))) + 1));
                                                        this._storeInt8((_36_ + 131), (this._storeInt8((_35_ + (this._loadInt((_36_ + 132)))), _33_)));
                                                        break label$21;
                                                    }
                                                    while (false);
                                                    label$33:
                                                    while (true) {
                                                        _35_ = 0;
                                                        label$35:
                                                        do {
                                                            if ((this._loadInt8s(((this._loadInt((_36_ + 164))) + (this._loadInt((_36_ + 112)))))) == 0) {
                                                                break label$35;
                                                            }
                                                            if ((this._loadInt8s(((this._loadInt((_36_ + 164))) + (this._loadInt((_36_ + 112)))))) == 35) {
                                                                break label$35;
                                                            }
                                                            _35_ = ((this._loadInt8s((((this._loadInt((_36_ + 164))) + (this._loadInt((_36_ + 112)))) + -1))) != 38) ? 1 : 0;
                                                        }
                                                        while (false);
                                                        if (_35_ == 0) {
                                                            continue label$18;
                                                        }
                                                        this._storeInt((_36_ + 112), ((this._loadInt((_36_ + 112))) + 1));
                                                        continue label$33;
                                                    }
                                                }
                                                while (false);
                                                label$36:
                                                do {
                                                    label$37:
                                                    do {
                                                        if ((this._loadInt((_36_ + 116))) != 0) {
                                                            break label$37;
                                                        }
                                                        if ((this._loadInt8s((_36_ + 131))) == 63) {
                                                            break label$36;
                                                        }
                                                    }
                                                    while (false);
                                                    if ((this._loadInt((_36_ + 116))) != 2) {
                                                        break label$21;
                                                    }
                                                    if ((this._loadInt8s((_36_ + 131))) != 38) {
                                                        break label$21;
                                                    }
                                                }
                                                while (false);
                                                this._storeInt8((_36_ + 131), _33_);
                                                this._storeInt((_36_ + 116), 1);
                                                break label$21;
                                            }
                                            while (false);
                                            this._storeInt((_36_ + 116), 2);
                                            this._storeInt8((_36_ + 131), _33_);
                                        }
                                        while (false);
                                        _35_ = this._loadInt8u((_36_ + 131));
                                        this._storeInt((_36_ + 108), ((_34_ = this._loadInt((_36_ + 108))) + 1));
                                        this._storeInt8((_34_ + (this._loadInt((_36_ + 132)))), _35_);
                                        continue label$18;
                                    }
                                }
                                while (false);
                                label$38:
                                do {
                                    if ((this._loadInt((_36_ + 116))) != 1) {
                                        break label$38;
                                    }
                                    this._storeInt((_36_ + 108), ((_35_ = this._loadInt((_36_ + 108))) + 1));
                                    this._storeInt8((_35_ + (this._loadInt((_36_ + 132)))), 0);
                                }
                                while (false);
                                _34_ = this._storeInt((_36_ + 108), ((_35_ = this._loadInt((_36_ + 108))) + 1));
                                _33_ = this._storeInt8((_35_ + (this._loadInt((_36_ + 132)))), 0);
                                this._storeInt((_36_ + 108), (_35_ + 2));
                                _34_ = this._storeInt8((_34_ + (_35_ = this._loadInt((_36_ + 132)))), _33_);
                                this._storeInt((_36_ + 120), (((sqlite3Strlen30(_35_)) + (this._loadInt((_36_ + 132)))) + 1));
                                label$39:
                                while (true) {
                                    if ((this._loadInt8u((this._loadInt((_36_ + 120))))) == 0) {
                                        break label$2;
                                    }
                                    this._storeInt((_36_ + 88), (sqlite3Strlen30((this._storeInt((_36_ + 92), (((this._storeInt((_36_ + 96), (sqlite3Strlen30((this._loadInt((_36_ + 120))))))) + (this._loadInt((_36_ + 120)))) + 1))))));
                                    label$41:
                                    do {
                                        label$42:
                                        do {
                                            label$43:
                                            do {
                                                if ((this._loadInt((_36_ + 96))) != 3) {
                                                    break label$43;
                                                }
                                                if ((memcmp(31248, (this._loadInt((_36_ + 120))), 3)) == 0) {
                                                    break label$42;
                                                }
                                            }
                                            while (false);
                                            _35_ = this._storeInt((_36_ + 72), (this._storeInt((_36_ + 76), (this._storeInt((_36_ + 80), (this._storeInt((_36_ + 84), _34_)))))));
                                            label$44:
                                            do {
                                                if ((this._loadInt((_36_ + 96))) != 5) {
                                                    break label$44;
                                                }
                                                if ((memcmp(31264, (this._loadInt((_36_ + 120))), 5)) != 0) {
                                                    break label$44;
                                                }
                                                this._storeInt((_36_ + 76), 393216);
                                                this._storeInt((_36_ + 84), 31280);
                                                this._storeInt((_36_ + 72), (this._loadInt((_36_ + 76))));
                                                this._storeInt((_36_ + 80), 31264);
                                            }
                                            while (false);
                                            label$45:
                                            do {
                                                if ((this._loadInt((_36_ + 96))) != 4) {
                                                    break label$45;
                                                }
                                                if ((this._loadInt((this._loadInt((_36_ + 120))))) != 1701080941) {
                                                    break label$45;
                                                }
                                                this._storeInt((_36_ + 76), 7);
                                                this._storeInt((_36_ + 84), 31328);
                                                this._storeInt((_36_ + 72), ((this._loadInt((_36_ + 76))) & (this._loadInt((_36_ + 140)))));
                                                this._storeInt((_36_ + 80), 21456);
                                            }
                                            while (false);
                                            if ((this._loadInt((_36_ + 84))) == 0) {
                                                break label$41;
                                            }
                                            this._storeInt((_36_ + 68), (this._storeInt((_36_ + 64), _35_)));
                                            label$46:
                                            do {
                                                label$48:
                                                do {
                                                    label$47:
                                                    while (true) {
                                                        if ((this._loadInt(((this._loadInt((_36_ + 84))) + ((this._loadInt((_36_ + 68))) << 3)))) == 0) {
                                                            break label$46;
                                                        }
                                                        _35_ = this._storeInt((_36_ + 60), (this._loadInt(((this._loadInt((_36_ + 84))) + ((this._loadInt((_36_ + 68))) << 3)))));
                                                        label$49:
                                                        do {
                                                            if ((this._loadInt((_36_ + 88))) != (sqlite3Strlen30(_35_))) {
                                                                break label$49;
                                                            }
                                                            if ((memcmp((this._loadInt((_36_ + 92))), (this._loadInt((_36_ + 60))), (this._loadInt((_36_ + 88))))) == 0) {
                                                                break label$48;
                                                            }
                                                        }
                                                        while (false);
                                                        this._storeInt((_36_ + 68), ((this._loadInt((_36_ + 68))) + 1));
                                                        continue label$47;
                                                    }
                                                }
                                                while (false);
                                                this._storeInt((_36_ + 64), (this._loadInt((((this._loadInt((_36_ + 84))) + ((this._loadInt((_36_ + 68))) << 3)) + 4))));
                                            }
                                            while (false);
                                            if ((this._loadInt((_36_ + 64))) == 0) {
                                                break label$10;
                                            }
                                            if ((this._loadInt((_36_ + 64))) > (this._loadInt((_36_ + 72)))) {
                                                break label$9;
                                            }
                                            this._storeInt((_36_ + 140), (((this._loadInt((_36_ + 140))) & ((this._loadInt((_36_ + 76))) ^ -1)) | (this._loadInt((_36_ + 64)))));
                                            break label$41;
                                        }
                                        while (false);
                                        this._storeInt((_36_ + 136), (this._loadInt((_36_ + 92))));
                                    }
                                    while (false);
                                    this._storeInt((_36_ + 120), (((this._loadInt((_36_ + 92))) + (this._loadInt((_36_ + 88)))) + 1));
                                    continue label$39;
                                }
                            }
                            while (false);
                            this._storeInt((_36_ + 172), 7);
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_36_ + 20), (this._loadInt((_36_ + 92))));
                        this._storeInt((_36_ + 16), (this._loadInt((_36_ + 80))));
                        _35_ = sqlite3_mprintf(31360, (_36_ + 16));
                        this._storeInt((this._loadInt((_36_ + 148))), _35_);
                        this._storeInt((_36_ + 144), 1);
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_36_ + 36), (this._loadInt((_36_ + 92))));
                    this._storeInt((_36_ + 32), (this._loadInt((_36_ + 80))));
                    _35_ = sqlite3_mprintf(31392, (_36_ + 32));
                    this._storeInt((this._loadInt((_36_ + 148))), _35_);
                    this._storeInt((_36_ + 144), 3);
                    break label$1;
                }
                while (false);
                _35_ = sqlite3_vfs_find((this._loadInt((_36_ + 136))));
                if ((this._storeInt((this._loadInt((_36_ + 156))), _35_)) != 0) {
                    break label$1;
                }
                this._storeInt((_36_ + 48), (this._loadInt((_36_ + 136))));
                _35_ = sqlite3_mprintf(31424, (_36_ + 48));
                this._storeInt((this._loadInt((_36_ + 148))), _35_);
                this._storeInt((_36_ + 144), 1);
            }
            while (false);
            label$50:
            do {
                if ((this._loadInt((_36_ + 144))) == 0) {
                    break label$50;
                }
                sqlite3_free((this._loadInt((_36_ + 132))));
                this._storeInt((_36_ + 132), 0);
            }
            while (false);
            this._storeInt((this._loadInt((_36_ + 160))), (this._loadInt((_36_ + 140))));
            this._storeInt((this._loadInt((_36_ + 152))), (this._loadInt((_36_ + 132))));
            this._storeInt((_36_ + 172), (this._loadInt((_36_ + 144))));
        }
        while (false);
        _35_ = this._loadInt((_36_ + 172));
        this._storeInt((0 + 4), (_36_ + 176));
        return _35_;
    }

    @Override()
    public final int sqlite3SchemaGet(int _30_, int _31_)
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
                this._storeInt((_32_ + 4), (sqlite3BtreeSchema((this._loadInt((_32_ + 8))), 84, 31)));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 4), (sqlite3DbMallocZero(0, 84)));
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                if ((this._loadInt((_32_ + 4))) == 0) {
                    break label$3;
                }
                if ((this._loadInt8u(((this._loadInt((_32_ + 4))) + 76))) != 0) {
                    break label$2;
                }
                sqlite3HashInit(((this._loadInt((_32_ + 4))) + 8));
                sqlite3HashInit(((this._loadInt((_32_ + 4))) + 24));
                sqlite3HashInit(((this._loadInt((_32_ + 4))) + 40));
                sqlite3HashInit(((this._loadInt((_32_ + 4))) + 56));
                this._storeInt8(((this._loadInt((_32_ + 4))) + 77), 1);
                break label$2;
            }
            while (false);
            this._storeInt8(((this._loadInt((_32_ + 12))) + 30), 1);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void sqlite3RegisterBuiltinFunctions(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (sqlite3_overload_function((this._storeInt((_31_ + 12), _30_)), 31168, 2)))) != 7) {
                break label$0;
            }
            this._storeInt8(((this._loadInt((_31_ + 12))) + 30), 1);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3AutoLoadExtensions(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        int _33_ = 0;
        int _34_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        _31_ = this._storeInt((_33_ + 20), 1);
        label$0:
        do {
            if ((this._loadInt((0 + 31109))) == 0) {
                break label$0;
            }
            _30_ = this._storeInt((_33_ + 24), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_33_ + 20))) == 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        label$4:
                        do {
                            if ((this._loadInt((_33_ + 24))) < (this._loadInt((_30_ + 31109)))) {
                                break label$4;
                            }
                            this._storeInt((_33_ + 20), (this._storeInt((_33_ + 16), _30_)));
                            break label$3;
                        }
                        while (false);
                        this._storeInt((_33_ + 16), (this._loadInt(((this._loadInt((_30_ + 31113))) + ((this._loadInt((_33_ + 24))) << 2)))));
                    }
                    while (false);
                    _32_ = this._storeInt((_33_ + 12), _30_);
                    label$5:
                    do {
                        if ((this._loadInt((_33_ + 16))) == 0) {
                            break label$5;
                        }
                        if ((this._iiiiTable[this._tableIndices[this._loadInt((_33_ + 16))]].invoke((this._loadInt((_33_ + 28))), (_33_ + 12), 28364)) == 0) {
                            break label$5;
                        }
                        _34_ = this._loadInt((_33_ + 28));
                        this._storeInt(_33_, (this._loadInt((_33_ + 12))));
                        sqlite3Error(_34_, _31_, 31120, _33_);
                        this._storeInt((_33_ + 20), _32_);
                    }
                    while (false);
                    sqlite3_free((this._loadInt((_33_ + 12))));
                    this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + _31_));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int sqlite3HexToInt(int _30_)
    {
        int _31_ = 0;
        return ((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 12), ((_30_ = this._storeInt((_31_ + 12), _30_)) + (((_30_ >>> 6) & 1) * 9)))) & 15);
    }

    @Override()
    public final int findCollSeqEntry(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        _32_ = this._storeInt((_34_ + 12), (sqlite3Strlen30((this._loadInt((_34_ + 24))))));
        label$0:
        do {
            if ((this._storeInt((_34_ + 16), (sqlite3HashFind(((this._loadInt((_34_ + 28))) + 412), (this._loadInt((_34_ + 24))), _32_)))) != 0) {
                break label$0;
            }
            if ((this._loadInt((_34_ + 20))) == 0) {
                break label$0;
            }
            if ((this._storeInt((_34_ + 16), (sqlite3DbMallocZero((this._loadInt((_34_ + 28))), ((this._loadInt((_34_ + 12))) + 61))))) == 0) {
                break label$0;
            }
            _31_ = this._storeInt((_34_ + 8), 0);
            _33_ = this._storeInt8(((_32_ = this._loadInt((_34_ + 16))) + 4), 1);
            this._storeInt(_32_, (this._storeInt((_32_ + 20), (_32_ + 60))));
            this._storeInt8((_32_ + 24), 2);
            this._storeInt(((_32_ = this._loadInt((_34_ + 16))) + 40), (_32_ + 60));
            this._storeInt8(((this._loadInt((_34_ + 16))) + 44), 3);
            memcpy((this._loadInt((this._loadInt((_34_ + 16))))), (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 12))));
            this._storeInt8(((this._loadInt((_32_ = this._loadInt((_34_ + 16))))) + (_30_ = this._loadInt((_34_ + 12)))), _31_);
            if ((this._storeInt((_34_ + 8), (sqlite3HashInsert(((this._loadInt((_34_ + 28))) + 412), (this._loadInt(_32_)), _30_, _32_)))) == 0) {
                break label$0;
            }
            this._storeInt8(((_32_ = this._loadInt((_34_ + 28))) + 30), _33_);
            sqlite3DbFree(_32_, (this._loadInt((_34_ + 8))));
            this._storeInt((_34_ + 16), _31_);
        }
        while (false);
        _32_ = this._loadInt((_34_ + 16));
        this._storeInt((0 + 4), (_34_ + 32));
        return _32_;
    }

    @Override()
    public final int sqlite3HashFind(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_33_ + 28))) + 12))) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 12), ((strHash((this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))))) % (this._loadInt((this._loadInt((_33_ + 28)))))));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 12), 0);
        }
        while (false);
        _32_ = 0;
        label$2:
        do {
            if ((this._storeInt((_33_ + 16), (findElementGivenHash((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 12))))))) == 0) {
                break label$2;
            }
            _32_ = this._loadInt(((this._loadInt((_33_ + 16))) + 8));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int allSpaces(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$1:
        do {
            label$0:
            while (true) {
                _31_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_32_ + 8))) < 1) {
                        break label$2;
                    }
                    _31_ = ((this._loadInt8s((((this._loadInt((_32_ + 12))) + (this._loadInt((_32_ + 8)))) + -1))) == 32) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) + -1));
                continue label$0;
            }
        }
        while (false);
        return (((this._loadInt((_32_ + 8))) == 0) ? 1 : 0);
    }

    @Override()
    public final int sqlite3BtreePutData(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_34_ + 20), _31_);
        this._storeInt((_34_ + 16), _32_);
        this._storeInt((_34_ + 12), _33_);
        _33_ = 0;
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_34_ + 24))) + 83))) < 2) {
                break label$0;
            }
            _33_ = btreeRestoreCursorPosition((this._loadInt((_34_ + 24))));
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                if ((this._storeInt((_34_ + 8), _33_)) == 0) {
                    break label$2;
                }
                this._storeInt((_34_ + 28), (this._loadInt((_34_ + 8))));
                break label$1;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt8u(((this._loadInt((_34_ + 24))) + 83))) == 1) {
                    break label$3;
                }
                this._storeInt((_34_ + 28), 4);
                break label$1;
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt8u(((this._loadInt((_34_ + 24))) + 80))) == 0) {
                    break label$4;
                }
                this._storeInt((_34_ + 28), (accessPayload((this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 16))), (this._loadInt((_34_ + 12))), 1)));
                break label$1;
            }
            while (false);
            this._storeInt((_34_ + 28), 8);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 28));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final int blobReadWrite(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_35_ + 36), _31_);
        this._storeInt((_35_ + 32), _32_);
        this._storeInt((_35_ + 28), _33_);
        this._storeInt((_35_ + 24), _34_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeInt((_35_ + 16), (this._loadInt((_35_ + 40))))) == 0) {
                            break label$3;
                        }
                        this._storeInt((_35_ + 8), (this._loadInt(((this._loadInt((_35_ + 16))) + 24))));
                        this._storeInt((_35_ + 12), (this._loadInt(((this._loadInt((_35_ + 16))) + 20))));
                        label$4:
                        do {
                            if ((this._loadInt((_35_ + 32))) < 0) {
                                break label$4;
                            }
                            if ((this._loadInt((_35_ + 28))) < 0) {
                                break label$4;
                            }
                            if (((this._loadInt((_35_ + 28))) + (this._loadInt((_35_ + 32)))) <= (this._loadInt(((this._loadInt((_35_ + 16))) + 4)))) {
                                break label$2;
                            }
                        }
                        while (false);
                        _34_ = this._storeInt((_35_ + 20), 1);
                        sqlite3Error((this._loadInt((_35_ + 8))), _34_, 0, 0);
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_35_ + 44), (sqlite3MisuseError(69275)));
                    break label$0;
                }
                while (false);
                label$5:
                do {
                    label$6:
                    do {
                        if ((this._loadInt((_35_ + 12))) == 0) {
                            break label$6;
                        }
                        if ((this._storeInt((_35_ + 20), (this._iiiiiTable[this._tableIndices[this._loadInt((_35_ + 24))]].invoke((this._loadInt(((_34_ = this._loadInt((_35_ + 16))) + 16))), ((this._loadInt((_35_ + 28))) + (this._loadInt((_34_ + 8)))), (this._loadInt((_35_ + 32))), (this._loadInt((_35_ + 36))))))) != 4) {
                            break label$5;
                        }
                        sqlite3VdbeFinalize((this._loadInt((_35_ + 12))));
                        this._storeInt(((this._loadInt((_35_ + 16))) + 20), 0);
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_35_ + 20), 4);
                    break label$1;
                }
                while (false);
                _34_ = this._storeInt(((this._loadInt((_35_ + 8))) + 20), (this._loadInt((_35_ + 20))));
                this._storeInt(((this._loadInt((_35_ + 12))) + 92), _34_);
            }
            while (false);
            this._storeInt((_35_ + 44), (this._storeInt((_35_ + 20), (sqlite3ApiExit((this._loadInt((_35_ + 8))), (this._loadInt((_35_ + 20))))))));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 44));
        this._storeInt((0 + 4), (_35_ + 48));
        return _34_;
    }

    @Override()
    public final int sqlite3VdbeFinalize(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_31_ + 8), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 12))) + 52))) == -1108210269) {
                    break label$1;
                }
                if ((this._loadInt(((this._loadInt((_31_ + 12))) + 52))) != 1369188723) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt((_31_ + 8), (sqlite3VdbeReset((this._loadInt((_31_ + 12))))));
        }
        while (false);
        sqlite3VdbeDelete((this._loadInt((_31_ + 12))));
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3VdbeReset(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._loadInt((this._storeInt((_31_ + 12), _30_)))));
        sqlite3VdbeHalt((this._loadInt((_31_ + 12))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt(((this._loadInt((_31_ + 12))) + 88))) < 0) {
                            break label$3;
                        }
                        if ((this._loadInt(((this._loadInt((_31_ + 12))) + 56))) == 0) {
                            break label$2;
                        }
                        sqlite3BeginBenignMalloc();
                        sqlite3ValueSetStr((this._loadInt(((this._loadInt((_31_ + 8))) + 212))), -1, (this._loadInt(((this._loadInt((_31_ + 12))) + 56))), 1, -1);
                        sqlite3EndBenignMalloc();
                        this._storeInt(((_30_ = this._loadInt((_31_ + 8))) + 20), (this._loadInt(((_32_ = this._loadInt((_31_ + 12))) + 92))));
                        sqlite3DbFree(_30_, (this._loadInt((_32_ + 56))));
                        this._storeInt(((this._loadInt((_31_ + 12))) + 56), 0);
                        break label$1;
                    }
                    while (false);
                    if ((this._loadInt(((this._loadInt((_31_ + 12))) + 92))) == 0) {
                        break label$0;
                    }
                    if ((this._loadInt8u(((this._loadInt((_31_ + 12))) + 99))) == 0) {
                        break label$0;
                    }
                    sqlite3Error((this._loadInt((_31_ + 8))), (this._loadInt(((this._loadInt((_31_ + 12))) + 92))), 0, 0);
                    sqlite3ValueSetStr((this._loadInt(((this._loadInt((_31_ + 8))) + 212))), -1, (this._loadInt(((this._loadInt((_31_ + 12))) + 56))), 1, -1);
                    sqlite3DbFree((this._loadInt((_31_ + 8))), (this._loadInt(((this._loadInt((_31_ + 12))) + 56))));
                    this._storeInt(((this._loadInt((_31_ + 12))) + 56), 0);
                    break label$0;
                }
                while (false);
                label$4:
                do {
                    if ((this._loadInt(((this._loadInt((_31_ + 12))) + 92))) == 0) {
                        break label$4;
                    }
                    sqlite3Error((this._loadInt((_31_ + 8))), (this._loadInt(((this._loadInt((_31_ + 12))) + 92))), 0, 0);
                    break label$1;
                }
                while (false);
                sqlite3Error((this._loadInt((_31_ + 8))), 0, 0, 0);
            }
            while (false);
            if ((this._loadInt8u(((this._loadInt((_31_ + 12))) + 100))) == 0) {
                break label$0;
            }
            this._storeInt8(((this._loadInt((_31_ + 12))) + 99), 1);
        }
        while (false);
        Cleanup((this._loadInt((_31_ + 12))));
        this._storeInt(((_30_ = this._loadInt((_31_ + 12))) + 52), 649915045);
        _30_ = this._loadInt((_30_ + 92));
        _32_ = this._loadInt(((this._loadInt((_31_ + 8))) + 24));
        this._storeInt((0 + 4), (_31_ + 16));
        return (_30_ & _32_);
    }

    @Override()
    public final void sqlite3VdbeDelete(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) == 0) {
                break label$0;
            }
            this._storeInt((_31_ + 8), (this._loadInt((this._loadInt((_31_ + 12))))));
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt(((this._loadInt((_31_ + 12))) + 60))) == 0) {
                        break label$2;
                    }
                    this._storeInt(((this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 60))) + 64), (this._loadInt((_30_ + 64))));
                    break label$1;
                }
                while (false);
                this._storeInt(((this._loadInt((_31_ + 8))) + 136), (this._loadInt(((this._loadInt((_31_ + 12))) + 64))));
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 12))) + 64))) == 0) {
                    break label$3;
                }
                this._storeInt(((this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 64))) + 60), (this._loadInt((_30_ + 60))));
            }
            while (false);
            this._storeInt((_30_ = this._loadInt((_31_ + 12))), 0);
            this._storeInt((_30_ + 52), -1241070648);
            sqlite3VdbeDeleteObject((this._loadInt((_31_ + 8))), _30_);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3VdbeHalt(int _30_)
    {
        int _31_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 16), (this._loadInt((this._storeInt((_31_ + 24), _30_)))));
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((this._loadInt((_31_ + 24))))) + 30))) == 0) {
                break label$0;
            }
            this._storeInt(((this._loadInt((_31_ + 24))) + 92), 7);
        }
        while (false);
        closeAllCursors((this._loadInt((_31_ + 24))));
        label$1:
        do {
            label$2:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 24))) + 52))) == -1108210269) {
                    break label$2;
                }
                this._storeInt((_31_ + 28), 0);
                break label$1;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 24))) + 88))) < 0) {
                    break label$3;
                }
                this._storeInt((_31_ + 8), 0);
                _30_ = 1;
                label$4:
                do {
                    if ((this._storeInt((_31_ + 12), (this._loadInt8u(((this._loadInt((_31_ + 24))) + 92))))) == 7) {
                        break label$4;
                    }
                    if ((this._loadInt((_31_ + 12))) == 10) {
                        break label$4;
                    }
                    if ((this._loadInt((_31_ + 12))) == 9) {
                        break label$4;
                    }
                    _30_ = ((this._loadInt((_31_ + 12))) == 13) ? 1 : 0;
                }
                while (false);
                label$5:
                do {
                    if ((this._storeInt((_31_ + 4), _30_)) == 0) {
                        break label$5;
                    }
                    label$6:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_31_ + 24))) + 104))) == 0) {
                            break label$6;
                        }
                        if ((this._loadInt((_31_ + 12))) == 9) {
                            break label$5;
                        }
                    }
                    while (false);
                    label$7:
                    do {
                        label$8:
                        do {
                            if ((this._loadInt((_31_ + 12))) == 7) {
                                break label$8;
                            }
                            if ((this._loadInt((_31_ + 12))) != 13) {
                                break label$7;
                            }
                        }
                        while (false);
                        if ((this._loadInt8u(((this._loadInt((_31_ + 24))) + 103))) == 0) {
                            break label$7;
                        }
                        this._storeInt((_31_ + 8), 2);
                        break label$5;
                    }
                    while (false);
                    invalidateCursorsOnModifiedBtrees((this._loadInt((_31_ + 16))));
                    sqlite3RollbackAll((this._loadInt((_31_ + 16))));
                    sqlite3CloseSavepoints((this._loadInt((_31_ + 16))));
                    this._storeInt8(((this._loadInt((_31_ + 16))) + 28), 1);
                }
                while (false);
                label$9:
                do {
                    if ((this._loadInt(((this._loadInt((_31_ + 24))) + 92))) != 0) {
                        break label$9;
                    }
                    sqlite3VdbeCheckFk((this._loadInt((_31_ + 24))), 0);
                }
                while (false);
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
                                                        if ((this._loadInt(((this._loadInt((_31_ + 16))) + 312))) < 1) {
                                                            break label$19;
                                                        }
                                                        if ((this._loadInt(((this._loadInt((_31_ + 16))) + 308))) == 0) {
                                                            break label$18;
                                                        }
                                                    }
                                                    while (false);
                                                    if ((this._loadInt8u(((this._loadInt((_31_ + 16))) + 28))) == 0) {
                                                        break label$18;
                                                    }
                                                    if ((this._loadInt(((this._loadInt((_31_ + 16))) + 144))) != (((this._loadInt8u(((this._loadInt((_31_ + 24))) + 104))) == 0) ? 1 : 0)) {
                                                        break label$18;
                                                    }
                                                    if ((this._loadInt(((this._loadInt((_31_ + 24))) + 92))) == 0) {
                                                        break label$17;
                                                    }
                                                    label$20:
                                                    do {
                                                        if ((this._loadInt8u(((this._loadInt((_31_ + 24))) + 96))) != 3) {
                                                            break label$20;
                                                        }
                                                        if ((this._loadInt((_31_ + 4))) == 0) {
                                                            break label$17;
                                                        }
                                                    }
                                                    while (false);
                                                    sqlite3RollbackAll((this._loadInt((_31_ + 16))));
                                                    break label$11;
                                                }
                                                while (false);
                                                if ((this._loadInt((_31_ + 8))) != 0) {
                                                    break label$10;
                                                }
                                                label$21:
                                                do {
                                                    if ((this._loadInt(((this._loadInt((_31_ + 24))) + 92))) == 0) {
                                                        break label$21;
                                                    }
                                                    if ((this._loadInt8u(((this._loadInt((_31_ + 24))) + 96))) != 3) {
                                                        break label$16;
                                                    }
                                                }
                                                while (false);
                                                this._storeInt((_31_ + 8), 1);
                                                break label$10;
                                            }
                                            while (false);
                                            if ((this._storeInt((_31_ + 20), (sqlite3VdbeCheckFk((this._loadInt((_31_ + 24))), 1)))) == 0) {
                                                break label$15;
                                            }
                                            if ((this._loadInt8u(((this._loadInt((_31_ + 24))) + 104))) == 0) {
                                                break label$13;
                                            }
                                            this._storeInt((_31_ + 28), 1);
                                            break label$1;
                                        }
                                        while (false);
                                        if ((this._loadInt8u(((this._loadInt((_31_ + 24))) + 96))) != 2) {
                                            break label$14;
                                        }
                                        this._storeInt((_31_ + 8), 2);
                                        break label$10;
                                    }
                                    while (false);
                                    this._storeInt((_31_ + 20), (vdbeCommit((this._loadInt((_31_ + 16))), (this._loadInt((_31_ + 24))))));
                                    break label$12;
                                }
                                while (false);
                                invalidateCursorsOnModifiedBtrees((this._loadInt((_31_ + 16))));
                                sqlite3RollbackAll((this._loadInt((_31_ + 16))));
                                sqlite3CloseSavepoints((this._loadInt((_31_ + 16))));
                                this._storeInt8(((this._loadInt((_31_ + 16))) + 28), 1);
                                break label$10;
                            }
                            while (false);
                            this._storeInt((_31_ + 20), 19);
                        }
                        while (false);
                        label$22:
                        do {
                            if ((this._loadInt((_31_ + 20))) != 5) {
                                break label$22;
                            }
                            if ((this._loadInt8u(((this._loadInt((_31_ + 24))) + 104))) == 0) {
                                break label$22;
                            }
                            this._storeInt((_31_ + 28), 5);
                            break label$1;
                        }
                        while (false);
                        label$23:
                        do {
                            if ((this._loadInt((_31_ + 20))) == 0) {
                                break label$23;
                            }
                            this._storeInt(((this._loadInt((_31_ + 24))) + 92), (this._loadInt((_31_ + 20))));
                            sqlite3RollbackAll((this._loadInt((_31_ + 16))));
                            break label$11;
                        }
                        while (false);
                        this._storeLong(((_30_ = this._loadInt((_31_ + 16))) + 496), 0L);
                        sqlite3CommitInternalChanges(_30_);
                    }
                    while (false);
                    this._storeInt(((this._loadInt((_31_ + 16))) + 484), 0);
                }
                while (false);
                label$24:
                do {
                    if ((this._loadInt((_31_ + 8))) == 0) {
                        break label$24;
                    }
                    if ((this._storeInt((_31_ + 20), (sqlite3VdbeCloseStatement((this._loadInt((_31_ + 24))), (this._loadInt((_31_ + 8))))))) == 0) {
                        break label$24;
                    }
                    label$25:
                    do {
                        label$26:
                        do {
                            if ((this._loadInt(((this._loadInt((_31_ + 24))) + 92))) == 0) {
                                break label$26;
                            }
                            if ((this._loadInt(((this._loadInt((_31_ + 24))) + 92))) != 19) {
                                break label$25;
                            }
                        }
                        while (false);
                        this._storeInt(((_30_ = this._loadInt((_31_ + 24))) + 92), (this._loadInt((_31_ + 20))));
                        sqlite3DbFree((this._loadInt((_31_ + 16))), (this._loadInt((_30_ + 56))));
                        this._storeInt(((this._loadInt((_31_ + 24))) + 56), 0);
                    }
                    while (false);
                    invalidateCursorsOnModifiedBtrees((this._loadInt((_31_ + 16))));
                    sqlite3RollbackAll((this._loadInt((_31_ + 16))));
                    sqlite3CloseSavepoints((this._loadInt((_31_ + 16))));
                    this._storeInt8(((this._loadInt((_31_ + 16))) + 28), 1);
                }
                while (false);
                label$27:
                do {
                    if ((this._loadInt8u(((this._loadInt((_31_ + 24))) + 98))) == 0) {
                        break label$27;
                    }
                    label$28:
                    do {
                        label$29:
                        do {
                            if ((this._loadInt((_31_ + 8))) == 2) {
                                break label$29;
                            }
                            sqlite3VdbeSetChanges((this._loadInt((_31_ + 16))), (this._loadInt(((this._loadInt((_31_ + 24))) + 108))));
                            break label$28;
                        }
                        while (false);
                        sqlite3VdbeSetChanges((this._loadInt((_31_ + 16))), 0);
                    }
                    while (false);
                    this._storeInt(((this._loadInt((_31_ + 24))) + 108), 0);
                }
                while (false);
                if ((this._loadInt(((this._loadInt((_31_ + 24))) + 92))) == 0) {
                    break label$3;
                }
                if (((this._loadInt8u(((this._loadInt((_31_ + 16))) + 13))) & 2) == 0) {
                    break label$3;
                }
                sqlite3ResetInternalSchema((this._loadInt((_31_ + 16))), -1);
                this._storeInt(((_30_ = this._loadInt((_31_ + 16))) + 12), ((this._loadInt((_30_ + 12))) | 512));
            }
            while (false);
            label$30:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 24))) + 88))) < 0) {
                    break label$30;
                }
                this._storeInt(((_30_ = this._loadInt((_31_ + 16))) + 140), ((this._loadInt((_30_ + 140))) + -1));
                if ((this._loadInt8u(((this._loadInt((_31_ + 24))) + 104))) != 0) {
                    break label$30;
                }
                this._storeInt(((_30_ = this._loadInt((_31_ + 16))) + 144), ((this._loadInt((_30_ + 144))) + -1));
            }
            while (false);
            this._storeInt(((_30_ = this._loadInt((_31_ + 24))) + 52), 1369188723);
            label$31:
            do {
                if ((this._loadInt8u(((this._loadInt(_30_)) + 30))) == 0) {
                    break label$31;
                }
                this._storeInt(((this._loadInt((_31_ + 24))) + 92), 7);
            }
            while (false);
            _temp$0 = 5;
            _temp$1 = 0;
            _temp$2 = ((this._loadInt(((this._loadInt((_31_ + 24))) + 92))) == 5) ? _temp$0 : _temp$1;
            this._storeInt((_31_ + 28), _temp$2);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 28));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final void Cleanup(int _30_)
    {
        int _31_ = 0;
        sqlite3DbFree((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._loadInt((this._storeInt((_31_ + 12), _30_)))))), (this._loadInt(((this._loadInt((_31_ + 12))) + 56))));
        this._storeInt(((_30_ = this._loadInt((_31_ + 12))) + 56), (this._storeInt((_30_ + 20), 0)));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void closeAllCursors(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_)) + 168))) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 24), (this._loadInt(((this._loadInt((_32_ + 28))) + 168))));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt(((this._loadInt((_32_ + 24))) + 60))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 24), (this._loadInt(((this._loadInt((_32_ + 24))) + 60))));
                    continue label$1;
                }
            }
            while (false);
            sqlite3VdbeFrameRestore((this._loadInt((_32_ + 24))));
        }
        while (false);
        _31_ = this._storeInt(((_30_ = this._loadInt((_32_ + 28))) + 168), (this._storeInt((_30_ + 176), 0)));
        label$3:
        do {
            if ((this._loadInt((_30_ + 68))) == 0) {
                break label$3;
            }
            _30_ = this._storeInt((_32_ + 20), _31_);
            label$5:
            do {
                label$4:
                while (true) {
                    if ((this._loadInt((_32_ + 20))) >= (this._loadInt16u(((this._loadInt((_32_ + 28))) + 50)))) {
                        break label$5;
                    }
                    label$6:
                    do {
                        if ((this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 28))) + 68))) + ((this._loadInt((_32_ + 20))) << 2)))))) == 0) {
                            break label$6;
                        }
                        sqlite3VdbeFreeCursor((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 16))));
                        this._storeInt(((this._loadInt(((this._loadInt((_32_ + 28))) + 68))) + ((this._loadInt((_32_ + 20))) << 2)), _30_);
                    }
                    while (false);
                    this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1));
                    continue label$4;
                }
            }
            while (false);
        }
        while (false);
        label$7:
        do {
            if ((this._loadInt(((this._loadInt((_32_ + 28))) + 8))) == 0) {
                break label$7;
            }
            releaseMemArray(((this._loadInt(((_30_ = this._loadInt((_32_ + 28))) + 8))) + 40), (this._loadInt((_30_ + 24))));
        }
        while (false);
        label$9:
        do {
            label$8:
            while (true) {
                if ((this._loadInt(((this._loadInt((_32_ + 28))) + 172))) == 0) {
                    break label$9;
                }
                _30_ = this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 28))) + 172))));
                this._storeInt(((this._loadInt((_32_ + 28))) + 172), (this._loadInt((_30_ + 60))));
                sqlite3VdbeFrameDelete(_30_);
                continue label$8;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void invalidateCursorsOnModifiedBtrees(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
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
                    if ((sqlite3BtreeIsInTrans((this._loadInt((_31_ + 4))))) == 0) {
                        break label$2;
                    }
                    sqlite3BtreeTripAllCursors((this._loadInt((_31_ + 4))), 4);
                }
                while (false);
                this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) + 1));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3RollbackAll(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        _30_ = this._storeInt((_31_ + 4), 0);
        sqlite3BeginBenignMalloc();
        this._storeInt((_31_ + 8), _30_);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 8))) >= (this._loadInt(((this._loadInt((_31_ + 12))) + 4)))) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt((((this._loadInt(((this._loadInt((_31_ + 12))) + 8))) + ((this._loadInt((_31_ + 8))) << 4)) + 4))) == 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((sqlite3BtreeIsInTrans((this._loadInt((((this._loadInt(((this._loadInt((_31_ + 12))) + 8))) + ((this._loadInt((_31_ + 8))) << 4)) + 4))))) == 0) {
                            break label$3;
                        }
                        this._storeInt((_31_ + 4), 1);
                    }
                    while (false);
                    sqlite3BtreeRollback((this._loadInt((((this._loadInt(((this._loadInt((_31_ + 12))) + 8))) + ((this._loadInt((_31_ + 8))) << 4)) + 4))));
                    this._storeInt8((((this._loadInt(((this._loadInt((_31_ + 12))) + 8))) + ((this._loadInt((_31_ + 8))) << 4)) + 8), _30_);
                }
                while (false);
                this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) + 1));
                continue label$0;
            }
        }
        while (false);
        sqlite3VtabRollback((this._loadInt((_31_ + 12))));
        sqlite3EndBenignMalloc();
        label$4:
        do {
            if (((this._loadInt8u(((this._loadInt((_31_ + 12))) + 13))) & 2) == 0) {
                break label$4;
            }
            sqlite3ExpirePreparedStatements((this._loadInt((_31_ + 12))));
            sqlite3ResetInternalSchema((this._loadInt((_31_ + 12))), -1);
        }
        while (false);
        this._storeLong(((_30_ = this._loadInt((_31_ + 12))) + 496), 0L);
        label$5:
        do {
            if ((this._loadInt((_30_ + 180))) == 0) {
                break label$5;
            }
            label$6:
            do {
                if ((this._loadInt((_31_ + 4))) != 0) {
                    break label$6;
                }
                if ((this._loadInt8u(((this._loadInt((_31_ + 12))) + 28))) != 0) {
                    break label$5;
                }
            }
            while (false);
            this._viTable[this._tableIndices[this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 180))]].invoke((this._loadInt((_30_ + 176))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3CloseSavepoints(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt(((this._loadInt((_31_ + 12))) + 476))) == 0) {
                    break label$1;
                }
                _30_ = this._storeInt((_31_ + 8), (this._loadInt(((this._loadInt((_31_ + 12))) + 476))));
                this._storeInt(((_32_ = this._loadInt((_31_ + 12))) + 476), (this._loadInt((_30_ + 16))));
                sqlite3DbFree(_32_, _30_);
                continue label$0;
            }
        }
        while (false);
        this._storeLong(((_30_ = this._loadInt((_31_ + 12))) + 480), 0L);
        this._storeInt8((_30_ + 488), 0);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3VdbeCheckFk(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        this._storeInt(_32_, (this._loadInt((this._loadInt((_32_ + 8))))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_32_ + 4))) == 0) {
                            break label$3;
                        }
                        if ((this._loadLong(((this._loadInt(_32_)) + 496))) > 0L) {
                            break label$2;
                        }
                    }
                    while (false);
                    if ((this._loadInt((_32_ + 4))) != 0) {
                        break label$1;
                    }
                    if ((this._loadLong(((this._loadInt((_32_ + 8))) + 144))) < 1L) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt8(((_31_ = this._loadInt((_32_ + 8))) + 96), 2);
                this._storeInt((_31_ + 92), 19);
                sqlite3SetString((_31_ + 56), (this._loadInt(_32_)), 31616, 0);
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
    public final int vdbeCommit(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 112))) + 104), _30_);
        this._storeInt((_33_ + 100), _31_);
        _31_ = this._storeInt((_33_ + 84), (this._storeInt((_33_ + 88), (this._storeInt((_33_ + 92), 0)))));
        this._storeInt((_33_ + 88), (sqlite3VtabSync((this._loadInt((_33_ + 104))), ((this._loadInt((_33_ + 100))) + 56))));
        this._storeInt((_33_ + 96), _31_);
        label$1:
        do {
            label$0:
            while (true) {
                _31_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_33_ + 88))) != 0) {
                        break label$2;
                    }
                    _31_ = ((this._loadInt((_33_ + 96))) < (this._loadInt(((this._loadInt((_33_ + 104))) + 4)))) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$1;
                }
                label$3:
                do {
                    if ((sqlite3BtreeIsInTrans((this._storeInt((_33_ + 80), (this._loadInt((((this._loadInt(((this._loadInt((_33_ + 104))) + 8))) + ((this._loadInt((_33_ + 96))) << 4)) + 4))))))) == 0) {
                        break label$3;
                    }
                    label$4:
                    do {
                        if ((_31_ = this._storeInt((_33_ + 84), 1)) == (this._loadInt((_33_ + 96)))) {
                            break label$4;
                        }
                        this._storeInt((_33_ + 92), ((this._loadInt((_33_ + 92))) + _31_));
                    }
                    while (false);
                    this._storeInt((_33_ + 88), (sqlite3PagerExclusiveLock((sqlite3BtreePager((this._loadInt((_33_ + 80))))))));
                }
                while (false);
                this._storeInt((_33_ + 96), ((this._loadInt((_33_ + 96))) + 1));
                continue label$0;
            }
        }
        while (false);
        label$5:
        do {
            label$6:
            do {
                if ((this._loadInt((_33_ + 88))) == 0) {
                    break label$6;
                }
                this._storeInt((_33_ + 108), (this._loadInt((_33_ + 88))));
                break label$5;
            }
            while (false);
            label$7:
            do {
                if ((this._loadInt((_33_ + 84))) == 0) {
                    break label$7;
                }
                if ((this._loadInt(((this._loadInt((_33_ + 104))) + 172))) == 0) {
                    break label$7;
                }
                if ((this._storeInt((_33_ + 88), (this._iiTable[this._tableIndices[this._loadInt(((_31_ = this._loadInt((_33_ + 104))) + 172))]].invoke((this._loadInt((_31_ + 168))))))) == 0) {
                    break label$7;
                }
                this._storeInt((_33_ + 108), 19);
                break label$5;
            }
            while (false);
            label$8:
            do {
                label$9:
                do {
                    label$10:
                    do {
                        if ((sqlite3Strlen30((sqlite3BtreeGetFilename((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 104))) + 8))) + 4))))))) == 0) {
                            break label$10;
                        }
                        if ((this._loadInt((_33_ + 92))) > 1) {
                            break label$9;
                        }
                    }
                    while (false);
                    _30_ = this._storeInt((_33_ + 96), 0);
                    label$12:
                    do {
                        label$11:
                        while (true) {
                            _31_ = 0;
                            label$13:
                            do {
                                if ((this._loadInt((_33_ + 88))) != 0) {
                                    break label$13;
                                }
                                _31_ = ((this._loadInt((_33_ + 96))) < (this._loadInt(((this._loadInt((_33_ + 104))) + 4)))) ? 1 : 0;
                            }
                            while (false);
                            if (_31_ == 0) {
                                break label$12;
                            }
                            label$14:
                            do {
                                if ((this._storeInt((_33_ + 76), (this._loadInt((((this._loadInt(((this._loadInt((_33_ + 104))) + 8))) + ((this._loadInt((_33_ + 96))) << 4)) + 4))))) == 0) {
                                    break label$14;
                                }
                                this._storeInt((_33_ + 88), (sqlite3BtreeCommitPhaseOne((this._loadInt((_33_ + 76))), _30_)));
                            }
                            while (false);
                            this._storeInt((_33_ + 96), ((this._loadInt((_33_ + 96))) + 1));
                            continue label$11;
                        }
                    }
                    while (false);
                    _30_ = this._storeInt((_33_ + 96), 0);
                    label$16:
                    do {
                        label$15:
                        while (true) {
                            _31_ = 0;
                            label$17:
                            do {
                                if ((this._loadInt((_33_ + 88))) != 0) {
                                    break label$17;
                                }
                                _31_ = ((this._loadInt((_33_ + 96))) < (this._loadInt(((this._loadInt((_33_ + 104))) + 4)))) ? 1 : 0;
                            }
                            while (false);
                            if (_31_ == 0) {
                                break label$16;
                            }
                            label$18:
                            do {
                                if ((this._storeInt((_33_ + 72), (this._loadInt((((this._loadInt(((this._loadInt((_33_ + 104))) + 8))) + ((this._loadInt((_33_ + 96))) << 4)) + 4))))) == 0) {
                                    break label$18;
                                }
                                this._storeInt((_33_ + 88), (sqlite3BtreeCommitPhaseTwo((this._loadInt((_33_ + 72))), _30_)));
                            }
                            while (false);
                            this._storeInt((_33_ + 96), ((this._loadInt((_33_ + 96))) + 1));
                            continue label$15;
                        }
                    }
                    while (false);
                    if ((this._loadInt((_33_ + 88))) != 0) {
                        break label$8;
                    }
                    sqlite3VtabCommit((this._loadInt((_33_ + 104))));
                    break label$8;
                }
                while (false);
                this._storeInt((_33_ + 68), (this._loadInt((this._loadInt((_33_ + 104))))));
                _31_ = this._storeInt((_33_ + 60), (this._storeInt((_33_ + 64), 0)));
                this._storeInt((_33_ + 56), (sqlite3BtreeGetFilename((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 104))) + 8))) + 4))))));
                _32_ = this._storeInt((_33_ + 52), _31_);
                this._storeLong((_33_ + 40), 0L);
                label$19:
                do {
                    label$20:
                    do {
                        label$21$end:
                        do {
                            label$21:
                            while (true) {
                                sqlite3DbFree((this._loadInt((_33_ + 104))), (this._loadInt((_33_ + 60))));
                                sqlite3_randomness(4, (_33_ + 32));
                                _31_ = this._loadInt((_33_ + 104));
                                _30_ = this._loadInt((_33_ + 32));
                                this._storeInt(_33_, (this._loadInt((_33_ + 56))));
                                this._storeInt((_33_ + 4), (_30_ & 2147483647));
                                if ((this._storeInt((_33_ + 60), (sqlite3MPrintf(_31_, 31600, _33_)))) == 0) {
                                    break label$20;
                                }
                                _31_ = 0;
                                label$23:
                                do {
                                    if ((this._storeInt((_33_ + 88), (sqlite3OsAccess((this._loadInt((_33_ + 68))), (this._loadInt((_33_ + 60))), 0, (_33_ + 36))))) != 0) {
                                        break label$23;
                                    }
                                    _31_ = ((this._loadInt((_33_ + 36))) != _32_) ? 1 : 0;
                                }
                                while (false);
                                if (_31_ != 0) {
                                    continue label$21;
                                }
                                break label$21$end;
                            }
                        }
                        while (false);
                        label$24:
                        do {
                            if ((this._loadInt((_33_ + 88))) != 0) {
                                break label$24;
                            }
                            this._storeInt((_33_ + 88), (sqlite3OsOpenMalloc((this._loadInt((_33_ + 68))), (this._loadInt((_33_ + 60))), (_33_ + 52), 16406, 0)));
                        }
                        while (false);
                        if ((this._loadInt((_33_ + 88))) == 0) {
                            break label$19;
                        }
                        sqlite3DbFree((this._loadInt((_33_ + 104))), (this._loadInt((_33_ + 60))));
                        this._storeInt((_33_ + 108), (this._loadInt((_33_ + 88))));
                        break label$5;
                    }
                    while (false);
                    this._storeInt((_33_ + 108), 7);
                    break label$5;
                }
                while (false);
                this._storeInt((_33_ + 96), 0);
                label$25:
                do {
                    label$27:
                    do {
                        label$26:
                        while (true) {
                            if ((this._loadInt((_33_ + 96))) >= (this._loadInt(((this._loadInt((_33_ + 104))) + 4)))) {
                                break label$25;
                            }
                            label$28:
                            do {
                                if ((sqlite3BtreeIsInTrans((this._storeInt((_33_ + 28), (this._loadInt((((this._loadInt(((this._loadInt((_33_ + 104))) + 8))) + ((this._loadInt((_33_ + 96))) << 4)) + 4))))))) == 0) {
                                    break label$28;
                                }
                                if ((this._storeInt((_33_ + 24), (sqlite3BtreeGetJournalname((this._loadInt((_33_ + 28))))))) == 0) {
                                    break label$28;
                                }
                                label$29:
                                do {
                                    if ((this._loadInt((_33_ + 64))) != 0) {
                                        break label$29;
                                    }
                                    if ((sqlite3BtreeSyncDisabled((this._loadInt((_33_ + 28))))) != 0) {
                                        break label$29;
                                    }
                                    this._storeInt((_33_ + 64), 1);
                                }
                                while (false);
                                this._storeInt((_33_ + 88), (sqlite3OsWrite((this._loadInt((_33_ + 52))), (_31_ = this._loadInt((_33_ + 24))), ((sqlite3Strlen30(_31_)) + 1), (this._loadLong((_33_ + 40))))));
                                _31_ = sqlite3Strlen30((this._loadInt((_33_ + 24))));
                                this._storeLong((_33_ + 40), ((this._loadLong((_33_ + 40))) + ((long) (_31_ + 1))));
                                if ((this._loadInt((_33_ + 88))) != 0) {
                                    break label$27;
                                }
                            }
                            while (false);
                            this._storeInt((_33_ + 96), ((this._loadInt((_33_ + 96))) + 1));
                            continue label$26;
                        }
                    }
                    while (false);
                    sqlite3OsCloseFree((this._loadInt((_33_ + 52))));
                    sqlite3OsDelete((this._loadInt((_33_ + 68))), (this._loadInt((_33_ + 60))), 0);
                    sqlite3DbFree((this._loadInt((_33_ + 104))), (this._loadInt((_33_ + 60))));
                    this._storeInt((_33_ + 108), (this._loadInt((_33_ + 88))));
                    break label$5;
                }
                while (false);
                label$30:
                do {
                    if ((this._loadInt((_33_ + 64))) == 0) {
                        break label$30;
                    }
                    if (((sqlite3OsDeviceCharacteristics((this._loadInt((_33_ + 52))))) & 1024) != 0) {
                        break label$30;
                    }
                    if ((this._storeInt((_33_ + 88), (sqlite3OsSync((this._loadInt((_33_ + 52))), 2)))) == 0) {
                        break label$30;
                    }
                    sqlite3OsCloseFree((this._loadInt((_33_ + 52))));
                    sqlite3OsDelete((this._loadInt((_33_ + 68))), (this._loadInt((_33_ + 60))), 0);
                    sqlite3DbFree((this._loadInt((_33_ + 104))), (this._loadInt((_33_ + 60))));
                    this._storeInt((_33_ + 108), (this._loadInt((_33_ + 88))));
                    break label$5;
                }
                while (false);
                this._storeInt((_33_ + 96), 0);
                label$32:
                do {
                    label$31:
                    while (true) {
                        _31_ = 0;
                        label$33:
                        do {
                            if ((this._loadInt((_33_ + 88))) != 0) {
                                break label$33;
                            }
                            _31_ = ((this._loadInt((_33_ + 96))) < (this._loadInt(((this._loadInt((_33_ + 104))) + 4)))) ? 1 : 0;
                        }
                        while (false);
                        if (_31_ == 0) {
                            break label$32;
                        }
                        label$34:
                        do {
                            if ((this._storeInt((_33_ + 20), (this._loadInt((((this._loadInt(((this._loadInt((_33_ + 104))) + 8))) + ((this._loadInt((_33_ + 96))) << 4)) + 4))))) == 0) {
                                break label$34;
                            }
                            this._storeInt((_33_ + 88), (sqlite3BtreeCommitPhaseOne((this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 60))))));
                        }
                        while (false);
                        this._storeInt((_33_ + 96), ((this._loadInt((_33_ + 96))) + 1));
                        continue label$31;
                    }
                }
                while (false);
                sqlite3OsCloseFree((this._loadInt((_33_ + 52))));
                label$35:
                do {
                    if ((this._loadInt((_33_ + 88))) == 0) {
                        break label$35;
                    }
                    sqlite3DbFree((this._loadInt((_33_ + 104))), (this._loadInt((_33_ + 60))));
                    this._storeInt((_33_ + 108), (this._loadInt((_33_ + 88))));
                    break label$5;
                }
                while (false);
                this._storeInt((_33_ + 88), (sqlite3OsDelete((this._loadInt((_33_ + 68))), (this._loadInt((_33_ + 60))), 1)));
                sqlite3DbFree((this._loadInt((_33_ + 104))), (this._loadInt((_33_ + 60))));
                _31_ = this._storeInt((_33_ + 60), 0);
                label$36:
                do {
                    if ((this._loadInt((_33_ + 88))) == 0) {
                        break label$36;
                    }
                    this._storeInt((_33_ + 108), (this._loadInt((_33_ + 88))));
                    break label$5;
                }
                while (false);
                sqlite3BeginBenignMalloc();
                this._storeInt((_33_ + 96), _31_);
                label$38:
                do {
                    label$37:
                    while (true) {
                        if ((this._loadInt((_33_ + 96))) >= (this._loadInt(((this._loadInt((_33_ + 104))) + 4)))) {
                            break label$38;
                        }
                        label$39:
                        do {
                            if ((this._storeInt((_33_ + 16), (this._loadInt((((this._loadInt(((this._loadInt((_33_ + 104))) + 8))) + ((this._loadInt((_33_ + 96))) << 4)) + 4))))) == 0) {
                                break label$39;
                            }
                            sqlite3BtreeCommitPhaseTwo((this._loadInt((_33_ + 16))), 1);
                        }
                        while (false);
                        this._storeInt((_33_ + 96), ((this._loadInt((_33_ + 96))) + 1));
                        continue label$37;
                    }
                }
                while (false);
                sqlite3EndBenignMalloc();
                sqlite3VtabCommit((this._loadInt((_33_ + 104))));
            }
            while (false);
            this._storeInt((_33_ + 108), (this._loadInt((_33_ + 88))));
        }
        while (false);
        _31_ = this._loadInt((_33_ + 108));
        this._storeInt((0 + 4), (_33_ + 112));
        return _31_;
    }

    @Override()
    public final void sqlite3CommitInternalChanges(int _30_)
    {
        int _31_ = 0;
        _31_ = this._loadInt((0 + 4));
        this._storeInt((_30_ + 12), ((this._loadInt((_30_ + 12))) & -513));
        this._storeInt(((_31_ - 16) + 12), _30_);
        return;
    }

    @Override()
    public final int sqlite3VdbeCloseStatement(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 20), (this._loadInt((this._loadInt((_32_ + 28))))));
        this._storeInt((_32_ + 16), 0);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_32_ + 20))) + 484))) == 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_32_ + 28))) + 120))) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 8), ((this._loadInt(((this._loadInt((_32_ + 28))) + 120))) + -1));
            _31_ = this._storeInt((_32_ + 12), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 12))) >= (this._loadInt(((this._loadInt((_32_ + 20))) + 4)))) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 4), _31_);
                    label$3:
                    do {
                        if ((this._storeInt(_32_, (this._loadInt((((this._loadInt(((this._loadInt((_32_ + 20))) + 8))) + ((this._loadInt((_32_ + 12))) << 4)) + 4))))) == 0) {
                            break label$3;
                        }
                        label$4:
                        do {
                            if ((this._loadInt((_32_ + 24))) != 2) {
                                break label$4;
                            }
                            this._storeInt((_32_ + 4), (sqlite3BtreeSavepoint((this._loadInt(_32_)), 2, (this._loadInt((_32_ + 8))))));
                        }
                        while (false);
                        label$5:
                        do {
                            if ((this._loadInt((_32_ + 4))) != 0) {
                                break label$5;
                            }
                            this._storeInt((_32_ + 4), (sqlite3BtreeSavepoint((this._loadInt(_32_)), 1, (this._loadInt((_32_ + 8))))));
                        }
                        while (false);
                        if ((this._loadInt((_32_ + 16))) != 0) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 16), (this._loadInt((_32_ + 4))));
                    }
                    while (false);
                    this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 1));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt(((_31_ = this._loadInt((_32_ + 20))) + 484), ((this._loadInt((_31_ + 484))) + -1));
            this._storeInt(((this._loadInt((_32_ + 28))) + 120), 0);
            label$6:
            do {
                if ((this._loadInt((_32_ + 16))) != 0) {
                    break label$6;
                }
                label$7:
                do {
                    if ((this._loadInt((_32_ + 24))) != 2) {
                        break label$7;
                    }
                    this._storeInt((_32_ + 16), (sqlite3VtabSavepoint((this._loadInt((_32_ + 20))), 2, (this._loadInt((_32_ + 8))))));
                }
                while (false);
                if ((this._loadInt((_32_ + 16))) != 0) {
                    break label$6;
                }
                this._storeInt((_32_ + 16), (sqlite3VtabSavepoint((this._loadInt((_32_ + 20))), 1, (this._loadInt((_32_ + 8))))));
            }
            while (false);
            if ((this._loadInt((_32_ + 24))) != 2) {
                break label$0;
            }
            this._storeLong(((this._loadInt((_32_ + 20))) + 496), (this._loadLong(((this._loadInt((_32_ + 28))) + 152))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 16));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final void sqlite3VdbeSetChanges(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt(((_32_ = this._loadInt((_32_ + 12))) + 64), ((this._storeInt((_32_ + 60), _31_)) + (this._loadInt((_32_ + 64)))));
        return;
    }

    @Override()
    public final int sqlite3BtreeSavepoint(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 16), 0);
        label$0:
        do {
            if ((this._loadInt((_33_ + 28))) == 0) {
                break label$0;
            }
            if ((this._loadInt8u(((this._loadInt((_33_ + 28))) + 8))) != 2) {
                break label$0;
            }
            this._storeInt((_33_ + 12), (this._loadInt(((this._loadInt((_33_ + 28))) + 4))));
            sqlite3BtreeEnter((this._loadInt((_33_ + 28))));
            if ((this._storeInt((_33_ + 16), (sqlite3PagerSavepoint((this._loadInt((this._loadInt((_33_ + 12))))), (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))))))) != 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt((_33_ + 20))) > -1) {
                    break label$1;
                }
                if ((this._loadInt8u(((this._loadInt((_33_ + 12))) + 19))) == 0) {
                    break label$1;
                }
                this._storeInt(((this._loadInt((_33_ + 12))) + 48), 0);
            }
            while (false);
            this._storeInt((_33_ + 16), (newDatabase((this._loadInt((_33_ + 12))))));
            _32_ = sqlite3Get4byte(((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 12))) + 12))) + 64))) + 28));
            this._storeInt(((this._loadInt((_33_ + 12))) + 48), _32_);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 16));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int sqlite3VtabSavepoint(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        _32_ = this._storeInt((_33_ + 16), 0);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_33_ + 28))) + 308))) == 0) {
                break label$0;
            }
            this._storeInt((_33_ + 12), _32_);
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
                        _32_ = ((this._loadInt((_33_ + 12))) < (this._loadInt(((this._loadInt((_33_ + 28))) + 312)))) ? 1 : 0;
                    }
                    while (false);
                    if (_32_ == 0) {
                        break label$2;
                    }
                    label$4:
                    do {
                        if ((this._loadInt((this._storeInt((_33_ + 4), (this._loadInt((this._loadInt(((this._storeInt((_33_ + 8), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 28))) + 308))) + ((this._loadInt((_33_ + 12))) << 2)))))) + 4))))))))) < 2) {
                            break label$4;
                        }
                        label$5:
                        do {
                            label$6:
                            do {
                                label$7:
                                do {
                                    if ((_32_ = this._loadInt((_33_ + 24))) == 2) {
                                        break label$7;
                                    }
                                    if (_32_ != 0) {
                                        break label$6;
                                    }
                                    this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 4))) + 80))));
                                    this._storeInt(((this._loadInt((_33_ + 8))) + 20), ((this._loadInt((_33_ + 20))) + 1));
                                    break label$5;
                                }
                                while (false);
                                this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 4))) + 88))));
                                break label$5;
                            }
                            while (false);
                            this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 4))) + 84))));
                        }
                        while (false);
                        if ((this._loadInt(_33_)) == 0) {
                            break label$4;
                        }
                        if ((this._loadInt(((this._loadInt((_33_ + 8))) + 20))) <= (this._loadInt((_33_ + 20)))) {
                            break label$4;
                        }
                        this._storeInt((_33_ + 16), (this._iiiTable[this._tableIndices[this._loadInt(_33_)]].invoke((this._loadInt(((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 28))) + 308))) + ((this._loadInt((_33_ + 12))) << 2)))) + 8))), (this._loadInt((_33_ + 20))))));
                    }
                    while (false);
                    this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 1));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 16));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int sqlite3VtabSync(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        _31_ = this._storeInt((_32_ + 16), 0);
        this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 28))) + 308))));
        this._storeInt((_32_ + 20), (this._storeInt(((this._loadInt((_32_ + 28))) + 308), _31_)));
        label$1:
        do {
            label$0:
            while (true) {
                _31_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_32_ + 16))) != 0) {
                        break label$2;
                    }
                    _31_ = ((this._loadInt((_32_ + 20))) < (this._loadInt(((this._loadInt((_32_ + 28))) + 312)))) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$1;
                }
                label$3:
                do {
                    if ((this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 12))) + ((this._loadInt((_32_ + 20))) << 2)))) + 8))))) == 0) {
                        break label$3;
                    }
                    if ((this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((this._loadInt((_32_ + 4))))) + 60))))) == 0) {
                        break label$3;
                    }
                    this._storeInt((_32_ + 16), (this._iiTable[this._tableIndices[this._loadInt((_32_ + 8))]].invoke((this._loadInt((_32_ + 4))))));
                    sqlite3DbFree((this._loadInt((_32_ + 28))), (this._loadInt((this._loadInt((_32_ + 24))))));
                    _31_ = sqlite3DbStrDup((this._loadInt((_32_ + 28))), (this._loadInt(((this._loadInt((_32_ + 4))) + 8))));
                    this._storeInt((this._loadInt((_32_ + 24))), _31_);
                    sqlite3_free((this._loadInt(((this._loadInt((_32_ + 4))) + 8))));
                }
                while (false);
                this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1));
                continue label$0;
            }
        }
        while (false);
        this._storeInt(((this._loadInt((_32_ + 28))) + 308), (this._loadInt((_32_ + 12))));
        _31_ = this._loadInt((_32_ + 16));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int sqlite3BtreeIsInTrans(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) == 0) {
                break label$0;
            }
            _31_ = ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 8))) == 2) ? 1 : 0;
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int sqlite3BtreeGetFilename(int _30_)
    {
        int _31_ = 0;
        _30_ = sqlite3PagerFilename((this._loadInt((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 4))))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3VtabCommit(int _30_)
    {
        int _31_ = 0;
        callFinaliser((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 64);
        this._storeInt((0 + 4), (_31_ + 16));
        return 0;
    }

    @Override()
    public final int sqlite3OsOpenMalloc(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        this._storeInt((_35_ + 8), 7);
        label$0:
        do {
            if ((this._storeInt((_35_ + 4), (sqlite3Malloc((this._loadInt(((this._loadInt((_35_ + 28))) + 4))))))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._storeInt((_35_ + 8), (sqlite3OsOpen((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 4))), (this._loadInt((_35_ + 16))), (this._loadInt((_35_ + 12))))))) == 0) {
                    break label$1;
                }
                sqlite3_free((this._loadInt((_35_ + 4))));
                break label$0;
            }
            while (false);
            this._storeInt((this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 4))));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 8));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }
}
