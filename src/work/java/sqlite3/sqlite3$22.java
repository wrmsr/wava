package sqlite3;

abstract class sqlite3$22
        extends sqlite3$21
{
    protected sqlite3$22(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final void checkAppendMsg(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_34_ + 12))) + 16))) == 0) {
                break label$0;
            }
            this._storeInt(((_32_ = this._loadInt((_34_ + 12))) + 16), ((this._loadInt((_32_ + 16))) + -1));
            this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1));
            this._storeInt(_34_, _33_);
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_34_ + 12))) + 40))) == 0) {
                    break label$1;
                }
                sqlite3StrAccumAppend(((this._loadInt((_34_ + 12))) + 28), 56064, 1);
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt((_34_ + 8))) == 0) {
                    break label$2;
                }
                sqlite3StrAccumAppend(((this._loadInt((_34_ + 12))) + 28), (this._loadInt((_34_ + 8))), -1);
            }
            while (false);
            sqlite3VXPrintf(((this._loadInt((_34_ + 12))) + 28), 1, (this._loadInt((_34_ + 4))), (this._loadInt(_34_)));
            if ((this._loadInt8u(((this._loadInt((_34_ + 12))) + 52))) == 0) {
                break label$0;
            }
            this._storeInt(((this._loadInt((_34_ + 12))) + 24), 1);
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 16));
        return;
    }

    @Override()
    public final int checkRef(int _30_, int _31_, int _32_)
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
                    if ((this._loadInt((_33_ + 36))) == 0) {
                        break label$2;
                    }
                    if (((this._loadInt((_33_ + 36))) & 4294967295L) <= ((this._loadInt(((this._loadInt((_33_ + 40))) + 8))) & 4294967295L)) {
                        break label$1;
                    }
                    _32_ = this._loadInt((_33_ + 32));
                    _31_ = this._loadInt((_33_ + 40));
                    this._storeInt(_33_, (this._loadInt((_33_ + 36))));
                    checkAppendMsg(_31_, _32_, 56752, _33_);
                    this._storeInt((_33_ + 44), 1);
                    break label$0;
                }
                while (false);
                this._storeInt((_33_ + 44), 1);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 40))) + 12))) + ((this._loadInt((_33_ + 36))) << 2)))) != 1) {
                    break label$3;
                }
                _32_ = this._loadInt((_33_ + 32));
                _31_ = this._loadInt((_33_ + 40));
                this._storeInt((_33_ + 16), (this._loadInt((_33_ + 36))));
                checkAppendMsg(_31_, _32_, 56784, (_33_ + 16));
                this._storeInt((_33_ + 44), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ = (this._loadInt(((this._loadInt((_33_ + 40))) + 12))) + ((this._loadInt((_33_ + 36))) << 2)), ((_32_ = this._loadInt(_32_)) + 1));
            this._storeInt((_33_ + 44), ((_32_ > 1) ? 1 : 0));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 44));
        this._storeInt((0 + 4), (_33_ + 48));
        return _32_;
    }

    @Override()
    public final int cellSizePtr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 20), ((this._storeInt((_32_ + 24), _31_)) + (this._loadInt8u(((this._loadInt((_32_ + 28))) + 6)))));
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
                                        if ((this._loadInt8u(((this._loadInt((_32_ + 28))) + 2))) == 0) {
                                            break label$7;
                                        }
                                        if ((this._loadInt8u(((this._loadInt((_32_ + 28))) + 4))) == 0) {
                                            break label$6;
                                        }
                                        if ((this._loadInt8u((this._loadInt((_32_ + 20))))) > 127) {
                                            break label$5;
                                        }
                                        this._storeInt((_32_ + 16), (this._loadInt8u((this._loadInt((_32_ + 20))))));
                                        _31_ = 1;
                                        break label$4;
                                    }
                                    while (false);
                                    if ((this._loadInt8u((this._loadInt((_32_ + 20))))) > 127) {
                                        break label$2;
                                    }
                                    this._storeInt((_32_ + 16), (this._loadInt8u((this._loadInt((_32_ + 20))))));
                                    _31_ = 1;
                                    break label$1;
                                }
                                while (false);
                                this._storeInt((_32_ + 16), 0);
                                break label$3;
                            }
                            while (false);
                            _31_ = sqlite3GetVarint32((this._loadInt((_32_ + 20))), (_32_ + 16));
                        }
                        while (false);
                        this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + _31_));
                    }
                    while (false);
                    this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 20))) + 9));
                    label$8:
                    while (true) {
                        this._storeInt((_32_ + 20), ((_30_ = this._loadInt((_32_ + 20))) + 1));
                        _31_ = 0;
                        label$10:
                        do {
                            if (((this._loadInt8u(_30_)) & 128) == 0) {
                                break label$10;
                            }
                            _31_ = (((this._loadInt((_32_ + 20))) & 4294967295L) < ((this._loadInt((_32_ + 12))) & 4294967295L)) ? 1 : 0;
                        }
                        while (false);
                        if (_31_ != 0) {
                            continue label$8;
                        }
                        break label$0;
                    }
                }
                while (false);
                _31_ = sqlite3GetVarint32((this._loadInt((_32_ + 20))), (_32_ + 16));
            }
            while (false);
            this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + _31_));
        }
        while (false);
        label$11:
        do {
            if (((this._loadInt((_32_ + 16))) & 4294967295L) <= ((this._loadInt16u(((this._loadInt((_32_ + 28))) + 8))) & 4294967295L)) {
                break label$11;
            }
            label$12:
            do {
                if (((this._storeInt((_32_ + 16), ((_31_ = this._storeInt((_32_ + 8), (this._loadInt16u(((this._loadInt((_32_ + 28))) + 10))))) + (((this._loadInt((_32_ + 16))) - _31_) % ((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 28))) + 60))) + 40))) + -4))))) & 4294967295L) <= ((this._loadInt16u(((this._loadInt((_32_ + 28))) + 8))) & 4294967295L)) {
                    break label$12;
                }
                this._storeInt((_32_ + 16), (this._loadInt((_32_ + 8))));
            }
            while (false);
            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 4));
        }
        while (false);
        label$13:
        do {
            if (((this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + ((this._loadInt((_32_ + 20))) - (this._loadInt((_32_ + 24))))))) & 4294967295L) > (3 & 4294967295L)) {
                break label$13;
            }
            this._storeInt((_32_ + 16), 4);
        }
        while (false);
        _31_ = this._loadInt16u((_32_ + 16));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final void invalidateIncrblobCursors(int _30_, long _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 32) + 28), _30_);
        this._storeLong((_33_ + 16), _31_);
        this._storeInt((_33_ + 12), _32_);
        this._storeInt((_33_ + 4), (this._loadInt(((this._loadInt((_33_ + 28))) + 4))));
        this._storeInt((_33_ + 8), (this._loadInt(((this._loadInt((_33_ + 4))) + 8))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_33_ + 8))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt8u(((this._loadInt((_33_ + 8))) + 88))) == 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._loadInt((_33_ + 12))) != 0) {
                            break label$3;
                        }
                        if ((this._loadLong(((this._loadInt((_33_ + 8))) + 32))) != (this._loadLong((_33_ + 16)))) {
                            break label$2;
                        }
                    }
                    while (false);
                    this._storeInt8(((this._loadInt((_33_ + 8))) + 83), 0);
                }
                while (false);
                this._storeInt((_33_ + 8), (this._loadInt(((this._loadInt((_33_ + 8))) + 8))));
                continue label$0;
            }
        }
        while (false);
        return;
    }

    @Override()
    public final int clearDatabasePage(int _30_, int _31_, int _32_, int _33_)
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
                if (((this._loadInt((_34_ + 36))) & 4294967295L) <= ((btreePagecount((this._loadInt((_34_ + 40))))) & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((_34_ + 44), (sqlite3CorruptError(54603)));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._storeInt((_34_ + 20), (getAndInitPage((this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 36))), (_34_ + 24))))) == 0) {
                    break label$2;
                }
                this._storeInt((_34_ + 44), (this._loadInt((_34_ + 20))));
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 12), 0);
            label$3:
            do {
                label$5:
                do {
                    label$4:
                    while (true) {
                        if ((this._loadInt((_34_ + 12))) >= (this._loadInt16u(((this._loadInt((_34_ + 24))) + 16)))) {
                            break label$5;
                        }
                        this._storeInt((_34_ + 16), ((_32_ = this._loadInt(((_33_ = this._loadInt((_34_ + 24))) + 64))) + ((this._loadInt16u((_33_ + 18))) & (((this._loadInt8u((_33_ = _32_ + ((this._loadInt16u((_33_ + 12))) + ((this._loadInt((_34_ + 12))) << 1))))) << 8) | (this._loadInt8u((_33_ + 1)))))));
                        label$6:
                        do {
                            if ((this._loadInt8u(((this._loadInt((_34_ + 24))) + 3))) != 0) {
                                break label$6;
                            }
                            if ((this._storeInt((_34_ + 20), (clearDatabasePage((this._loadInt((_34_ + 40))), (sqlite3Get4byte((this._loadInt((_34_ + 16))))), 1, (this._loadInt((_34_ + 28))))))) != 0) {
                                break label$3;
                            }
                        }
                        while (false);
                        if ((this._storeInt((_34_ + 20), (clearCell((this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 16))))))) != 0) {
                            break label$3;
                        }
                        this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 12))) + 1));
                        continue label$4;
                    }
                }
                while (false);
                label$7:
                do {
                    label$8:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_34_ + 24))) + 3))) == 0) {
                            break label$8;
                        }
                        if ((this._loadInt((_34_ + 28))) == 0) {
                            break label$7;
                        }
                        this._storeInt((_33_ = this._loadInt((_34_ + 28))), ((this._loadInt(_33_)) + (this._loadInt16u(((this._loadInt((_34_ + 24))) + 16)))));
                        break label$7;
                    }
                    while (false);
                    if ((this._storeInt((_34_ + 20), (clearDatabasePage((this._loadInt((_34_ + 40))), (sqlite3Get4byte(((this._loadInt(((this._loadInt((_34_ + 24))) + 64))) + 8))), 1, (this._loadInt((_34_ + 28))))))) != 0) {
                        break label$3;
                    }
                }
                while (false);
                label$9:
                do {
                    if ((this._loadInt((_34_ + 32))) == 0) {
                        break label$9;
                    }
                    freePage((this._loadInt((_34_ + 24))), (_34_ + 20));
                    break label$3;
                }
                while (false);
                if ((this._storeInt((_34_ + 20), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_34_ + 24))) + 68))))))) != 0) {
                    break label$3;
                }
                zeroPage((_33_ = this._loadInt((_34_ + 24))), ((this._loadInt8u((this._loadInt((_33_ + 64))))) | 8));
            }
            while (false);
            releasePage((this._loadInt((_34_ + 24))));
            this._storeInt((_34_ + 44), (this._loadInt((_34_ + 20))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int clearCell(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 72), _30_);
        this._storeInt((_32_ + 68), _31_);
        this._storeInt((_32_ + 64), (this._loadInt(((this._loadInt((_32_ + 72))) + 60))));
        btreeParseCellPtr((this._loadInt((_32_ + 72))), (this._loadInt((_32_ + 68))), (_32_ + 32));
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
                            if ((this._loadInt16u((_32_ + 56))) == 0) {
                                break label$4;
                            }
                            this._storeInt((_32_ + 28), (sqlite3Get4byte(((this._loadInt((_32_ + 68))) + (this._loadInt16u((_32_ + 56)))))));
                            this._storeInt((_32_ + 16), ((this._loadInt(((this._loadInt((_32_ + 64))) + 40))) + -4));
                            this._storeInt((_32_ + 20), (((((this._loadInt((_32_ + 48))) - (this._loadInt16u((_32_ + 54)))) + (_31_ = this._loadInt((_32_ + 16)))) + -1) / _31_));
                            label$6:
                            do {
                                label$5:
                                while (true) {
                                    this._storeInt((_32_ + 20), ((_31_ = this._loadInt((_32_ + 20))) + -1));
                                    if (_31_ == 0) {
                                        break label$2;
                                    }
                                    this._storeInt((_32_ + 8), (this._storeInt((_32_ + 12), 0)));
                                    if (((this._loadInt((_32_ + 28))) & 4294967295L) < (2 & 4294967295L)) {
                                        break label$3;
                                    }
                                    if (((this._loadInt((_32_ + 28))) & 4294967295L) > ((btreePagecount((this._loadInt((_32_ + 64))))) & 4294967295L)) {
                                        break label$3;
                                    }
                                    label$7:
                                    do {
                                        if ((this._loadInt((_32_ + 20))) == 0) {
                                            break label$7;
                                        }
                                        if ((this._storeInt((_32_ + 24), (getOverflowPage((this._loadInt((_32_ + 64))), (this._loadInt((_32_ + 28))), (_32_ + 8), (_32_ + 12))))) != 0) {
                                            break label$1;
                                        }
                                    }
                                    while (false);
                                    label$8:
                                    do {
                                        label$9:
                                        do {
                                            label$10:
                                            do {
                                                if ((this._loadInt((_32_ + 8))) != 0) {
                                                    break label$10;
                                                }
                                                if ((this._storeInt((_32_ + 8), (btreePageLookup((this._loadInt((_32_ + 64))), (this._loadInt((_32_ + 28))))))) == 0) {
                                                    break label$9;
                                                }
                                            }
                                            while (false);
                                            if ((sqlite3PagerPageRefcount((this._loadInt(((this._loadInt((_32_ + 8))) + 68))))) == 1) {
                                                break label$9;
                                            }
                                            this._storeInt((_32_ + 24), (sqlite3CorruptError(52721)));
                                            break label$8;
                                        }
                                        while (false);
                                        this._storeInt((_32_ + 24), (freePage2((this._loadInt((_32_ + 64))), (this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 28))))));
                                    }
                                    while (false);
                                    label$11:
                                    do {
                                        if ((this._loadInt((_32_ + 8))) == 0) {
                                            break label$11;
                                        }
                                        sqlite3PagerUnref((this._loadInt(((this._loadInt((_32_ + 8))) + 68))));
                                    }
                                    while (false);
                                    if ((this._loadInt((_32_ + 24))) != 0) {
                                        break label$6;
                                    }
                                    this._storeInt((_32_ + 28), (this._loadInt((_32_ + 12))));
                                    continue label$5;
                                }
                            }
                            while (false);
                            this._storeInt((_32_ + 76), (this._loadInt((_32_ + 24))));
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_32_ + 76), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_32_ + 76), (sqlite3CorruptError(52701)));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 76), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 76), (this._loadInt((_32_ + 24))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 76));
        this._storeInt((0 + 4), (_32_ + 80));
        return _31_;
    }

    @Override()
    public final void freePage(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._loadInt((this._storeInt((_32_ + 8), _31_)))) != 0) {
                break label$0;
            }
            _31_ = freePage2((this._loadInt(((_31_ = this._loadInt((_32_ + 12))) + 60))), _31_, (this._loadInt((_31_ + 72))));
            this._storeInt((this._loadInt((_32_ + 8))), _31_);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int freePage2(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_33_ + 40), _31_);
        this._storeInt((_33_ + 36), _32_);
        this._storeInt((_33_ + 28), (this._storeInt((_33_ + 32), 0)));
        this._storeInt((_33_ + 24), (this._loadInt(((this._loadInt((_33_ + 44))) + 12))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_33_ + 40))) == 0) {
                    break label$1;
                }
                sqlite3PagerRef((this._loadInt(((this._storeInt((_33_ + 20), (this._loadInt((_33_ + 40))))) + 68))));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 20), (btreePageLookup((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 36))))));
        }
        while (false);
        label$2:
        do {
            if ((this._storeInt((_33_ + 16), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_33_ + 24))) + 68))))))) != 0) {
                break label$2;
            }
            _32_ = this._storeInt((_33_ + 12), (sqlite3Get4byte(((this._loadInt(((this._loadInt((_33_ + 24))) + 64))) + 36))));
            sqlite3Put4byte(((this._loadInt(((this._loadInt((_33_ + 24))) + 64))) + 36), (_32_ + 1));
            label$3:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 44))) + 18))) == 0) {
                    break label$3;
                }
                label$4:
                do {
                    if ((this._loadInt((_33_ + 20))) != 0) {
                        break label$4;
                    }
                    if ((this._storeInt((_33_ + 16), (btreeGetPage((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 36))), (_33_ + 20), 0)))) != 0) {
                        break label$2;
                    }
                }
                while (false);
                if ((this._storeInt((_33_ + 16), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_33_ + 20))) + 68))))))) != 0) {
                    break label$2;
                }
                memset((this._loadInt(((_32_ = this._loadInt((_33_ + 20))) + 64))), 0, (this._loadInt(((this._loadInt((_32_ + 60))) + 36))));
            }
            while (false);
            label$5:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 44))) + 21))) == 0) {
                    break label$5;
                }
                ptrmapPut((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 36))), 2, 0, (_33_ + 16));
                if ((this._loadInt((_33_ + 16))) != 0) {
                    break label$2;
                }
            }
            while (false);
            label$6:
            do {
                if ((this._loadInt((_33_ + 12))) == 0) {
                    break label$6;
                }
                _32_ = this._storeInt((_33_ + 28), (sqlite3Get4byte(((this._loadInt(((this._loadInt((_33_ + 24))) + 64))) + 32))));
                if ((this._storeInt((_33_ + 16), (btreeGetPage((this._loadInt((_33_ + 44))), _32_, (_33_ + 32), 0)))) != 0) {
                    break label$2;
                }
                label$7:
                do {
                    if (((this._storeInt((_33_ + 8), (sqlite3Get4byte(((this._loadInt(((this._loadInt((_33_ + 32))) + 64))) + 4))))) & 4294967295L) <= ((((this._loadInt(((this._loadInt((_33_ + 44))) + 40))) >>> 2) + -2) & 4294967295L)) {
                        break label$7;
                    }
                    this._storeInt((_33_ + 16), (sqlite3CorruptError(52609)));
                    break label$2;
                }
                while (false);
                if (((this._loadInt((_33_ + 8))) & 4294967295L) >= ((((this._loadInt(((this._loadInt((_33_ + 44))) + 40))) >>> 2) + -8) & 4294967295L)) {
                    break label$6;
                }
                if ((this._storeInt((_33_ + 16), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_33_ + 32))) + 68))))))) != 0) {
                    break label$2;
                }
                sqlite3Put4byte(((this._loadInt(((this._loadInt((_33_ + 32))) + 64))) + 4), ((this._loadInt((_33_ + 8))) + 1));
                sqlite3Put4byte((((this._loadInt(((this._loadInt((_33_ + 32))) + 64))) + ((this._loadInt((_33_ + 8))) << 2)) + 8), (this._loadInt((_33_ + 36))));
                label$8:
                do {
                    if ((this._loadInt((_33_ + 20))) == 0) {
                        break label$8;
                    }
                    if ((this._loadInt8u(((this._loadInt((_33_ + 44))) + 18))) != 0) {
                        break label$8;
                    }
                    sqlite3PagerDontWrite((this._loadInt(((this._loadInt((_33_ + 20))) + 68))));
                }
                while (false);
                this._storeInt((_33_ + 16), (btreeSetHasContent((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 36))))));
                break label$2;
            }
            while (false);
            label$9:
            do {
                if ((this._loadInt((_33_ + 20))) != 0) {
                    break label$9;
                }
                if ((this._storeInt((_33_ + 16), (btreeGetPage((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 36))), (_33_ + 20), 0)))) != 0) {
                    break label$2;
                }
            }
            while (false);
            if ((this._storeInt((_33_ + 16), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_33_ + 20))) + 68))))))) != 0) {
                break label$2;
            }
            sqlite3Put4byte((this._loadInt(((this._loadInt((_33_ + 20))) + 64))), (this._loadInt((_33_ + 28))));
            sqlite3Put4byte(((this._loadInt(((this._loadInt((_33_ + 20))) + 64))) + 4), 0);
            sqlite3Put4byte(((this._loadInt(((this._loadInt((_33_ + 24))) + 64))) + 32), (this._loadInt((_33_ + 36))));
        }
        while (false);
        label$10:
        do {
            if ((this._loadInt((_33_ + 20))) == 0) {
                break label$10;
            }
            this._storeInt8((this._loadInt((_33_ + 20))), 0);
        }
        while (false);
        releasePage((this._loadInt((_33_ + 20))));
        releasePage((this._loadInt((_33_ + 32))));
        _32_ = this._loadInt((_33_ + 16));
        this._storeInt((0 + 4), (_33_ + 48));
        return _32_;
    }

    @Override()
    public final void sqlite3PagerRef(int _30_)
    {
        int _31_ = 0;
        sqlite3PcacheRef((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int btreePageLookup(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(_32_, (sqlite3PagerLookup((this._loadInt((this._loadInt((_32_ + 8))))), _31_)))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 12), (btreePageFromDbPage((this._loadInt(_32_)), (this._loadInt((_32_ + 4))), (this._loadInt((_32_ + 8))))));
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
    public final void sqlite3PagerDontWrite(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 16))));
        label$0:
        do {
            if (((this._loadInt16u(((this._loadInt((_31_ + 12))) + 20))) & 2) == 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_31_ + 8))) + 96))) != 0) {
                break label$0;
            }
            this._storeInt16(((_31_ = this._loadInt((_31_ + 12))) + 20), ((this._loadInt16u((_31_ + 20))) | 32));
        }
        while (false);
        return;
    }

    @Override()
    public final int btreeSetHasContent(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), 0);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_32_ + 12))) + 64))) != 0) {
                break label$0;
            }
            _31_ = sqlite3BitvecCreate((this._loadInt(((this._loadInt((_32_ + 12))) + 48))));
            if ((this._storeInt(((this._loadInt((_32_ + 12))) + 64), _31_)) != 0) {
                break label$0;
            }
            this._storeInt((_32_ + 4), 7);
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_32_ + 4))) != 0) {
                break label$1;
            }
            if (((this._loadInt((_32_ + 8))) & 4294967295L) > ((sqlite3BitvecSize((this._loadInt(((this._loadInt((_32_ + 12))) + 64))))) & 4294967295L)) {
                break label$1;
            }
            this._storeInt((_32_ + 4), (sqlite3BitvecSet((this._loadInt(((this._loadInt((_32_ + 12))) + 64))), (this._loadInt((_32_ + 8))))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void sqlite3PcacheRef(int _30_)
    {
        int _31_ = 0;
        _31_ = this._loadInt((0 + 4));
        this._storeInt16((_30_ + 22), ((this._loadInt16u((_30_ + 22))) + 1));
        this._storeInt(((_31_ - 16) + 12), _30_);
        return;
    }

    @Override()
    public final int btreeDropTable(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_33_ + 36), _31_);
        this._storeInt((_33_ + 32), _32_);
        _32_ = this._storeInt((_33_ + 24), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._storeInt((_33_ + 20), (this._loadInt(((this._loadInt((_33_ + 40))) + 4))))) + 8))) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 44), 262);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._storeInt((_33_ + 28), (btreeGetPage((this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 36))), (_33_ + 24), _32_)))) == 0) {
                    break label$2;
                }
                this._storeInt((_33_ + 44), (this._loadInt((_33_ + 28))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._storeInt((_33_ + 28), (sqlite3BtreeClearTable((this._loadInt((_33_ + 40))), (this._loadInt((_33_ + 36))), 0)))) == 0) {
                    break label$3;
                }
                releasePage((this._loadInt((_33_ + 24))));
                this._storeInt((_33_ + 44), (this._loadInt((_33_ + 28))));
                break label$0;
            }
            while (false);
            this._storeInt((this._loadInt((_33_ + 32))), 0);
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
                                if (((this._loadInt((_33_ + 36))) & 4294967295L) < (2 & 4294967295L)) {
                                    break label$8;
                                }
                                if ((this._loadInt8u(((this._loadInt((_33_ + 20))) + 21))) == 0) {
                                    break label$7;
                                }
                                sqlite3BtreeGetMeta((this._loadInt((_33_ + 40))), 4, (_33_ + 16));
                                if ((this._loadInt((_33_ + 36))) != (this._loadInt((_33_ + 16)))) {
                                    break label$6;
                                }
                                freePage((this._loadInt((_33_ + 24))), (_33_ + 28));
                                releasePage((this._loadInt((_33_ + 24))));
                                if ((this._loadInt((_33_ + 28))) == 0) {
                                    break label$5;
                                }
                                this._storeInt((_33_ + 44), (this._loadInt((_33_ + 28))));
                                break label$0;
                            }
                            while (false);
                            zeroPage((this._loadInt((_33_ + 24))), 9);
                            releasePage((this._loadInt((_33_ + 24))));
                            break label$4;
                        }
                        while (false);
                        freePage((this._loadInt((_33_ + 24))), (_33_ + 28));
                        releasePage((this._loadInt((_33_ + 24))));
                        break label$4;
                    }
                    while (false);
                    releasePage((this._loadInt((_33_ + 24))));
                    label$9:
                    do {
                        if ((this._storeInt((_33_ + 28), (btreeGetPage((this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))), (_33_ + 12), 0)))) == 0) {
                            break label$9;
                        }
                        this._storeInt((_33_ + 44), (this._loadInt((_33_ + 28))));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_33_ + 28), (relocatePage((this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 12))), 1, 0, (this._loadInt((_33_ + 36))), 0)));
                    releasePage((this._loadInt((_33_ + 12))));
                    label$10:
                    do {
                        if ((this._loadInt((_33_ + 28))) == 0) {
                            break label$10;
                        }
                        this._storeInt((_33_ + 44), (this._loadInt((_33_ + 28))));
                        break label$0;
                    }
                    while (false);
                    _32_ = this._storeInt((_33_ + 12), 0);
                    this._storeInt((_33_ + 28), (btreeGetPage((this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))), (_33_ + 12), _32_)));
                    freePage((this._loadInt((_33_ + 12))), (_33_ + 28));
                    releasePage((this._loadInt((_33_ + 12))));
                    label$11:
                    do {
                        if ((this._loadInt((_33_ + 28))) == 0) {
                            break label$11;
                        }
                        this._storeInt((_33_ + 44), (this._loadInt((_33_ + 28))));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((this._loadInt((_33_ + 32))), (this._loadInt((_33_ + 16))));
                }
                while (false);
                this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + -1));
                label$13:
                do {
                    label$12:
                    while (true) {
                        _32_ = 1;
                        label$14:
                        do {
                            if ((this._loadInt((_33_ + 16))) == (((this._loadInt((0 + 22332))) / (this._loadInt(((this._loadInt((_33_ + 20))) + 36)))) + 1)) {
                                break label$14;
                            }
                            _32_ = ((ptrmapPageno((this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))))) == (this._loadInt((_33_ + 16)))) ? 1 : 0;
                        }
                        while (false);
                        if (_32_ == 0) {
                            break label$13;
                        }
                        this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + -1));
                        continue label$12;
                    }
                }
                while (false);
                this._storeInt((_33_ + 28), (sqlite3BtreeUpdateMeta((this._loadInt((_33_ + 40))), 4, (this._loadInt((_33_ + 16))))));
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
    public final void dropCell(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_34_ + 40), _31_);
        this._storeInt((_34_ + 36), _32_);
        label$0:
        do {
            if ((this._loadInt((this._storeInt((_34_ + 32), _33_)))) != 0) {
                break label$0;
            }
            this._storeInt((_34_ + 20), ((this._storeInt((_34_ + 24), (this._loadInt(((this._loadInt((_34_ + 44))) + 64))))) + ((this._loadInt16u(((this._loadInt((_34_ + 44))) + 12))) + ((this._loadInt((_34_ + 40))) << 1))));
            this._storeInt((_34_ + 28), (((this._loadInt8u((_33_ = this._loadInt((_34_ + 20))))) << 8) | (this._loadInt8u((_33_ + 1)))));
            _33_ = this._storeInt((_34_ + 8), (this._loadInt8u(((this._loadInt((_34_ + 44))) + 5))));
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadInt((_34_ + 28))) & 4294967295L) < ((((this._loadInt8u(((_33_ = _33_ + (this._loadInt((_34_ + 24)))) + 5))) << 8) | (this._loadInt8u((_33_ + 6)))) & 4294967295L)) {
                        break label$2;
                    }
                    if ((((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 36)))) & 4294967295L) <= ((this._loadInt(((this._loadInt(((this._loadInt((_34_ + 44))) + 60))) + 40))) & 4294967295L)) {
                        break label$1;
                    }
                }
                while (false);
                _33_ = sqlite3CorruptError(52926);
                this._storeInt((this._loadInt((_34_ + 32))), _33_);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._storeInt((_34_ + 12), (freeSpace((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 36))))))) == 0) {
                    break label$3;
                }
                this._storeInt((this._loadInt((_34_ + 32))), (this._loadInt((_34_ + 12))));
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 16), (((this._loadInt((_34_ + 24))) + ((this._loadInt16u(((_33_ = this._loadInt((_34_ + 44))) + 12))) + ((this._loadInt16u((_33_ + 16))) << 1))) + -2));
            label$5:
            do {
                label$4:
                while (true) {
                    if (((this._loadInt((_34_ + 20))) & 4294967295L) >= ((this._loadInt((_34_ + 16))) & 4294967295L)) {
                        break label$5;
                    }
                    this._storeInt16((_33_ = this._loadInt((_34_ + 20))), (this._loadInt16u((_33_ + 2))));
                    this._storeInt((_34_ + 20), (_33_ + 2));
                    continue label$4;
                }
            }
            while (false);
            this._storeInt16(((_33_ = this._loadInt((_34_ + 44))) + 16), ((this._loadInt16u((_33_ + 16))) + -1));
            this._storeInt8((((this._loadInt((_34_ + 24))) + (this._loadInt((_34_ + 8)))) + 3), ((this._loadInt16u((_33_ + 16))) >>> 8));
            this._storeInt8((((this._loadInt((_34_ + 24))) + (this._loadInt((_34_ + 8)))) + 4), (this._loadInt8u(((this._loadInt((_34_ + 44))) + 16))));
            this._storeInt16(((_33_ = this._loadInt((_34_ + 44))) + 14), ((this._loadInt16u((_33_ + 14))) + 2));
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 48));
        return;
    }

    @Override()
    public final void allocateTempSpace(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 88))) != 0) {
                break label$0;
            }
            _30_ = sqlite3PageMalloc((this._loadInt(((this._loadInt((_31_ + 12))) + 36))));
            this._storeInt(((this._loadInt((_31_ + 12))) + 88), _30_);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void insertCell(
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
        this._storeInt((_37_ + 16), ((((this._storeInt((_37_ + 48), 0)) != (this._loadInt((_37_ + 56)))) ? 1 : 0) << 2));
        label$0:
        do {
            if ((this._loadInt((this._loadInt((_37_ + 52))))) != 0) {
                break label$0;
            }
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt8u(((this._loadInt((_37_ + 76))) + 1))) != 0) {
                        break label$2;
                    }
                    if (((this._loadInt((_37_ + 64))) + 2) <= (this._loadInt16u(((this._loadInt((_37_ + 76))) + 14)))) {
                        break label$1;
                    }
                }
                while (false);
                label$3:
                do {
                    if ((this._loadInt((_37_ + 60))) == 0) {
                        break label$3;
                    }
                    memcpy(((this._loadInt((_37_ + 60))) + (_36_ = this._loadInt((_37_ + 16)))), ((this._loadInt((_37_ + 68))) + _36_), ((this._loadInt((_37_ + 64))) - _36_));
                    this._storeInt((_37_ + 68), (this._loadInt((_37_ + 60))));
                }
                while (false);
                label$4:
                do {
                    if ((this._loadInt((_37_ + 56))) == 0) {
                        break label$4;
                    }
                    sqlite3Put4byte((this._loadInt((_37_ + 68))), (this._loadInt((_37_ + 56))));
                }
                while (false);
                this._storeInt8(((_36_ = this._loadInt((_37_ + 76))) + 1), ((_36_ = this._loadInt8u((_36_ + 1))) + 1));
                this._storeInt((_37_ + 44), _36_);
                this._storeInt((((this._loadInt((_37_ + 76))) + (_36_ << 3)) + 20), (this._loadInt((_37_ + 68))));
                this._storeInt16((((this._loadInt((_37_ + 76))) + ((this._loadInt((_37_ + 44))) << 3)) + 24), (this._loadInt((_37_ + 72))));
                break label$0;
            }
            while (false);
            label$5:
            do {
                if ((this._storeInt((_37_ + 12), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_37_ + 76))) + 68))))))) == 0) {
                    break label$5;
                }
                this._storeInt((this._loadInt((_37_ + 52))), (this._loadInt((_37_ + 12))));
                break label$0;
            }
            while (false);
            this._storeInt((_37_ + 28), (this._loadInt(((this._loadInt((_37_ + 76))) + 64))));
            this._storeInt((_37_ + 40), ((this._storeInt((_37_ + 32), (this._loadInt16u(((this._loadInt((_37_ + 76))) + 12))))) + ((this._loadInt16u(((this._loadInt((_37_ + 76))) + 16))) << 1)));
            this._storeInt((_37_ + 36), ((this._loadInt((_37_ + 32))) + ((this._loadInt((_37_ + 72))) << 1)));
            label$6:
            do {
                if ((this._storeInt((_37_ + 12), (allocateSpace((this._loadInt((_37_ + 76))), (this._loadInt((_37_ + 64))), (_37_ + 48))))) == 0) {
                    break label$6;
                }
                this._storeInt((this._loadInt((_37_ + 52))), (this._loadInt((_37_ + 12))));
                break label$0;
            }
            while (false);
            this._storeInt16(((_36_ = this._loadInt((_37_ + 76))) + 16), ((this._loadInt16u((_36_ + 16))) + 1));
            this._storeInt16((_36_ + 14), ((this._loadInt16u((_36_ + 14))) - ((this._loadInt((_37_ + 64))) + 2)));
            memcpy(((this._loadInt((_37_ + 28))) + ((this._loadInt((_37_ + 48))) + (_36_ = this._loadInt((_37_ + 16))))), ((this._loadInt((_37_ + 68))) + _36_), ((this._loadInt((_37_ + 64))) - _36_));
            label$7:
            do {
                if ((this._loadInt((_37_ + 56))) == 0) {
                    break label$7;
                }
                sqlite3Put4byte(((this._loadInt((_37_ + 28))) + (this._loadInt((_37_ + 48)))), (this._loadInt((_37_ + 56))));
            }
            while (false);
            this._storeInt((_37_ + 24), ((this._loadInt((_37_ + 28))) + (this._loadInt((_37_ + 40)))));
            this._storeInt((_37_ + 20), ((this._loadInt((_37_ + 28))) + (this._loadInt((_37_ + 36)))));
            label$9:
            do {
                label$8:
                while (true) {
                    if (((this._loadInt((_37_ + 24))) & 4294967295L) <= ((this._loadInt((_37_ + 20))) & 4294967295L)) {
                        break label$9;
                    }
                    this._storeInt16((_36_ = this._loadInt((_37_ + 24))), (this._loadInt16u((this._storeInt((_37_ + 24), (_36_ + -2))))));
                    continue label$8;
                }
            }
            while (false);
            this._storeInt8((_36_ = (this._loadInt((_37_ + 28))) + (this._loadInt((_37_ + 36)))), ((this._loadInt((_37_ + 48))) >>> 8));
            this._storeInt8((_36_ + 1), (this._loadInt((_37_ + 48))));
            this._storeInt8((((this._loadInt((_37_ + 28))) + (this._loadInt8u(((_36_ = this._loadInt((_37_ + 76))) + 5)))) + 3), ((this._loadInt16u((_36_ + 16))) >>> 8));
            this._storeInt8((((this._loadInt((_37_ + 28))) + (this._loadInt8u(((_36_ = this._loadInt((_37_ + 76))) + 5)))) + 4), (this._loadInt8u((_36_ + 16))));
            if ((this._loadInt8u(((this._loadInt(((this._loadInt((_37_ + 76))) + 60))) + 21))) == 0) {
                break label$0;
            }
            ptrmapPutOvflPtr((this._loadInt((_37_ + 76))), (this._loadInt((_37_ + 68))), (this._loadInt((_37_ + 52))));
        }
        while (false);
        this._storeInt((0 + 4), (_37_ + 80));
        return;
    }

    @Override()
    public final int balance(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        _30_ = this._storeInt((_32_ + 56), 0);
        this._storeInt((_32_ + 52), (((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 60))) + 4))) + 40))) << 1) / 3));
        _31_ = this._storeInt((_32_ + 32), _30_);
        label$1:
        do {
            label$0$end:
            do {
                label$0:
                while (true) {
                    _30_ = this._storeInt((_32_ + 28), (this._loadInt16s(((this._loadInt((_32_ + 60))) + 90))));
                    this._storeInt((_32_ + 24), (this._loadInt((((this._loadInt((_32_ + 60))) + (_30_ << 2)) + 132))));
                    label$2:
                    do {
                        label$3:
                        do {
                            label$4:
                            do {
                                label$5:
                                do {
                                    if ((this._loadInt((_32_ + 28))) == 0) {
                                        break label$5;
                                    }
                                    label$6:
                                    do {
                                        if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 1))) != 0) {
                                            break label$6;
                                        }
                                        if ((this._loadInt16u(((this._loadInt((_32_ + 24))) + 14))) <= (this._loadInt((_32_ + 52)))) {
                                            break label$1;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_32_ + 20), (this._loadInt((((this._loadInt((_32_ + 60))) + ((this._loadInt((_32_ + 28))) << 2)) + 128))));
                                    this._storeInt((_32_ + 16), (this._loadInt16u((((this._loadInt((_32_ + 60))) + ((this._loadInt((_32_ + 28))) << 1)) + 90))));
                                    if ((this._storeInt((_32_ + 56), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_32_ + 20))) + 68))))))) != 0) {
                                        break label$3;
                                    }
                                    if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 4))) == 0) {
                                        break label$4;
                                    }
                                    if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 1))) != 1) {
                                        break label$4;
                                    }
                                    if ((this._loadInt16u(((_30_ = this._loadInt((_32_ + 24))) + 24))) != (this._loadInt16u((_30_ + 16)))) {
                                        break label$4;
                                    }
                                    if ((this._loadInt(((this._loadInt((_32_ + 20))) + 72))) == 1) {
                                        break label$4;
                                    }
                                    if ((this._loadInt16u(((this._loadInt((_32_ + 20))) + 16))) != (this._loadInt((_32_ + 16)))) {
                                        break label$4;
                                    }
                                    this._storeInt((_32_ + 56), (balance_quick((this._loadInt((_32_ + 20))), (this._loadInt((_32_ + 24))), (_32_ + 39))));
                                    break label$3;
                                }
                                while (false);
                                if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 1))) == 0) {
                                    break label$1;
                                }
                                if ((this._storeInt((_32_ + 56), (balance_deeper((this._loadInt((_32_ + 24))), ((this._loadInt((_32_ + 60))) + 136))))) != 0) {
                                    break label$2;
                                }
                                this._storeInt(((_30_ = this._loadInt((_32_ + 60))) + 90), 1);
                                this._storeInt16((_30_ + 94), _31_);
                                break label$2;
                            }
                            while (false);
                            _30_ = this._storeInt((_32_ + 12), (sqlite3PageMalloc((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 60))) + 4))) + 36))))));
                            this._storeInt((_32_ + 56), (balance_nonroot((this._loadInt((_32_ + 20))), (this._loadInt((_32_ + 16))), _30_, (((this._loadInt((_32_ + 28))) == 1) ? 1 : 0))));
                            label$7:
                            do {
                                if ((this._loadInt((_32_ + 32))) == 0) {
                                    break label$7;
                                }
                                sqlite3PageFree((this._loadInt((_32_ + 32))));
                            }
                            while (false);
                            this._storeInt((_32_ + 32), (this._loadInt((_32_ + 12))));
                        }
                        while (false);
                        this._storeInt8(((_30_ = this._loadInt((_32_ + 24))) + 1), _31_);
                        releasePage(_30_);
                        this._storeInt16(((_30_ = this._loadInt((_32_ + 60))) + 90), ((this._loadInt16u((_30_ + 90))) + -1));
                    }
                    while (false);
                    if ((this._loadInt((_32_ + 56))) == 0) {
                        continue label$0;
                    }
                    break label$0$end;
                }
            }
            while (false);
        }
        while (false);
        label$8:
        do {
            if ((this._loadInt((_32_ + 32))) == 0) {
                break label$8;
            }
            sqlite3PageFree((this._loadInt((_32_ + 32))));
        }
        while (false);
        _30_ = this._loadInt((_32_ + 56));
        this._storeInt((0 + 4), (_32_ + 64));
        return _30_;
    }

    @Override()
    public final int balance_deeper(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        _31_ = this._storeInt((_32_ + 8), (this._storeInt((_32_ + 12), 0)));
        this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 24))) + 60))));
        label$0:
        do {
            if ((this._storeInt((_32_ + 16), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_32_ + 24))) + 68))))))) != 0) {
                break label$0;
            }
            this._storeInt((_32_ + 16), (allocateBtreePage((this._loadInt((_32_ + 4))), (_32_ + 12), (_32_ + 8), (this._loadInt(((this._loadInt((_32_ + 24))) + 72))), _31_)));
            copyNodeContent((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 12))), (_32_ + 16));
            if ((this._loadInt8u(((this._loadInt((_32_ + 4))) + 21))) == 0) {
                break label$0;
            }
            ptrmapPut((this._loadInt((_32_ + 4))), (this._loadInt((_32_ + 8))), 5, (this._loadInt(((this._loadInt((_32_ + 24))) + 72))), (_32_ + 16));
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                if ((this._loadInt((_32_ + 16))) == 0) {
                    break label$2;
                }
                this._storeInt((this._loadInt((_32_ + 20))), 0);
                releasePage((this._loadInt((_32_ + 12))));
                this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
                break label$1;
            }
            while (false);
            memcpy(((this._loadInt((_32_ + 12))) + 20), ((_31_ = this._loadInt((_32_ + 24))) + 20), ((this._loadInt8u((_31_ + 1))) << 3));
            this._storeInt8(((this._loadInt((_32_ + 12))) + 1), (this._loadInt8u(((_31_ = this._loadInt((_32_ + 24))) + 1))));
            zeroPage(_31_, ((this._loadInt8u((this._loadInt(((this._loadInt((_32_ + 12))) + 64))))) & 247));
            sqlite3Put4byte((((this._loadInt(((_31_ = this._loadInt((_32_ + 24))) + 64))) + (this._loadInt8u((_31_ + 5)))) + 8), (this._loadInt((_32_ + 8))));
            this._storeInt((this._loadInt((_32_ + 20))), (this._loadInt((_32_ + 12))));
            this._storeInt((_32_ + 28), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int balance_quick(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_33_ + 36), _31_);
        this._storeInt((_33_ + 32), _32_);
        this._storeInt((_33_ + 28), (this._loadInt(((this._loadInt((_33_ + 36))) + 60))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt16u(((this._loadInt((_33_ + 36))) + 16))) > 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 44), (sqlite3CorruptError(53142)));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._storeInt((_33_ + 20), (allocateBtreePage((this._loadInt((_33_ + 28))), (_33_ + 24), (_33_ + 16), 0, 0)))) != 0) {
                    break label$2;
                }
                this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 32))) + 4));
                _32_ = this._storeInt((_33_ + 8), (this._loadInt(((this._loadInt((_33_ + 36))) + 20))));
                this._storeInt16((_33_ + 6), (cellSizePtr((this._loadInt((_33_ + 36))), _32_)));
                zeroPage((this._loadInt((_33_ + 24))), 13);
                assemblePage((this._loadInt((_33_ + 24))), 1, (_33_ + 8), (_33_ + 6));
                label$3:
                do {
                    if ((this._loadInt8u(((this._loadInt((_33_ + 28))) + 21))) == 0) {
                        break label$3;
                    }
                    ptrmapPut((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 16))), 5, (this._loadInt(((this._loadInt((_33_ + 40))) + 72))), (_33_ + 20));
                    if ((this._loadInt16u((_33_ + 6))) <= (this._loadInt16u(((this._loadInt((_33_ + 24))) + 10)))) {
                        break label$3;
                    }
                    ptrmapPutOvflPtr((this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 8))), (_33_ + 20));
                }
                while (false);
                this._storeInt(_33_, ((this._storeInt((_33_ + 8), ((_31_ = this._loadInt(((_32_ = this._loadInt((_33_ + 36))) + 64))) + ((this._loadInt16u((_32_ + 18))) & (((this._loadInt8u(((_32_ = _31_ + ((this._loadInt16u((_32_ + 12))) + ((this._loadInt16u((_32_ + 16))) << 1))) + -2))) << 8) | (this._loadInt8u((_32_ + -1)))))))) + 9));
                label$4$end:
                do {
                    label$4:
                    while (true) {
                        this._storeInt((_33_ + 8), ((_31_ = this._loadInt((_33_ + 8))) + 1));
                        _32_ = 0;
                        label$6:
                        do {
                            if (((this._loadInt8u(_31_)) & 128) == 0) {
                                break label$6;
                            }
                            _32_ = (((this._loadInt((_33_ + 8))) & 4294967295L) < ((this._loadInt(_33_)) & 4294967295L)) ? 1 : 0;
                        }
                        while (false);
                        if (_32_ != 0) {
                            continue label$4;
                        }
                        break label$4$end;
                    }
                }
                while (false);
                this._storeInt(_33_, ((this._loadInt((_33_ + 8))) + 9));
                label$7$end:
                do {
                    label$7:
                    while (true) {
                        this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
                        _30_ = this._storeInt8((_31_ = this._loadInt((_33_ + 12))), (this._loadInt8u(_32_)));
                        this._storeInt((_33_ + 12), (_31_ + 1));
                        _32_ = 0;
                        label$9:
                        do {
                            if ((_30_ & 128) == 0) {
                                break label$9;
                            }
                            _32_ = (((this._loadInt((_33_ + 8))) & 4294967295L) < ((this._loadInt(_33_)) & 4294967295L)) ? 1 : 0;
                        }
                        while (false);
                        if (_32_ != 0) {
                            continue label$7;
                        }
                        break label$7$end;
                    }
                }
                while (false);
                insertCell((_32_ = this._loadInt((_33_ + 40))), (this._loadInt16u((_32_ + 16))), (_32_ = this._loadInt((_33_ + 32))), ((this._loadInt((_33_ + 12))) - _32_), 0, (this._loadInt(((this._loadInt((_33_ + 36))) + 72))), (_33_ + 20));
                sqlite3Put4byte((((this._loadInt(((_32_ = this._loadInt((_33_ + 40))) + 64))) + (this._loadInt8u((_32_ + 5)))) + 8), (this._loadInt((_33_ + 16))));
                releasePage((this._loadInt((_33_ + 24))));
            }
            while (false);
            this._storeInt((_33_ + 44), (this._loadInt((_33_ + 20))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 44));
        this._storeInt((0 + 4), (_33_ + 48));
        return _32_;
    }

    @Override()
    public final int balance_nonroot(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 368))) + 360), _30_);
        this._storeInt((_34_ + 356), _31_);
        this._storeInt((_34_ + 352), _32_);
        this._storeInt((_34_ + 348), _33_);
        this._storeInt((_34_ + 156), (this._storeInt((_34_ + 280), (this._storeInt((_34_ + 284), (this._storeInt((_34_ + 308), (this._storeInt((_34_ + 332), (this._storeInt((_34_ + 336), (this._storeInt((_34_ + 340), 0)))))))))))));
        this._storeInt((_34_ + 344), (this._loadInt(((this._loadInt((_34_ + 360))) + 60))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_34_ + 352))) == 0) {
                            break label$3;
                        }
                        if ((this._storeInt((_34_ + 324), ((this._loadInt8u(((_33_ = this._loadInt((_34_ + 360))) + 1))) + (this._loadInt16u((_33_ + 16)))))) > 1) {
                            break label$2;
                        }
                        this._storeInt((_34_ + 312), 0);
                        this._storeInt((_34_ + 328), ((this._loadInt((_34_ + 324))) + 1));
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_34_ + 364), 7);
                    break label$0;
                }
                while (false);
                this._storeInt((_34_ + 328), 3);
                label$4:
                do {
                    label$5:
                    do {
                        label$6:
                        do {
                            if ((this._loadInt((_34_ + 356))) == 0) {
                                break label$6;
                            }
                            if ((this._loadInt((_34_ + 356))) != (this._loadInt((_34_ + 324)))) {
                                break label$5;
                            }
                            this._storeInt((_34_ + 312), ((this._loadInt((_34_ + 324))) + -2));
                            break label$4;
                        }
                        while (false);
                        this._storeInt((_34_ + 312), 0);
                        break label$4;
                    }
                    while (false);
                    this._storeInt((_34_ + 312), ((this._loadInt((_34_ + 356))) + -1));
                }
                while (false);
                this._storeInt((_34_ + 324), 2);
            }
            while (false);
            label$7:
            do {
                label$8:
                do {
                    if ((((this._loadInt((_34_ + 324))) + (this._loadInt((_34_ + 312)))) - (this._loadInt8u(((_33_ = this._loadInt((_34_ + 360))) + 1)))) != (this._loadInt16u((_33_ + 16)))) {
                        break label$8;
                    }
                    this._storeInt((_34_ + 220), (((this._loadInt(((_33_ = this._loadInt((_34_ + 360))) + 64))) + (this._loadInt8u((_33_ + 5)))) + 8));
                    break label$7;
                }
                while (false);
                this._storeInt((_34_ + 220), ((_32_ = this._loadInt(((_33_ = this._loadInt((_34_ + 360))) + 64))) + ((this._loadInt16u((_33_ + 18))) & (((this._loadInt8u((_33_ = _32_ + ((this._loadInt16u((_33_ + 12))) + ((((this._loadInt((_34_ + 324))) + (this._loadInt((_34_ + 312)))) - (this._loadInt8u((_33_ + 1)))) << 1))))) << 8) | (this._loadInt8u((_33_ + 1)))))));
            }
            while (false);
            this._storeInt((_34_ + 144), (sqlite3Get4byte((this._loadInt((_34_ + 220))))));
            label$9:
            do {
                label$10:
                do {
                    label$11:
                    do {
                        label$13:
                        do {
                            label$12:
                            while (true) {
                                if ((this._storeInt((_34_ + 308), (getAndInitPage((this._loadInt((_34_ + 344))), (this._loadInt((_34_ + 144))), ((_34_ + 264) + ((this._loadInt((_34_ + 324))) << 2)))))) != 0) {
                                    break label$13;
                                }
                                this._storeInt((_34_ + 336), (((this._loadInt((_34_ + 336))) + ((this._loadInt16u(((_33_ = this._loadInt(((_34_ + 264) + ((this._loadInt((_34_ + 324))) << 2)))) + 16))) + (this._loadInt8u((_33_ + 1))))) + 1));
                                this._storeInt((_34_ + 324), ((_33_ = this._loadInt((_34_ + 324))) + -1));
                                if (_33_ == 0) {
                                    break label$11;
                                }
                                label$14:
                                do {
                                    if (((this._loadInt((_34_ + 324))) + (this._loadInt((_34_ + 312)))) != (this._loadInt16u(((this._loadInt((_34_ + 360))) + 24)))) {
                                        break label$14;
                                    }
                                    if ((this._loadInt8u(((this._loadInt((_34_ + 360))) + 1))) == 0) {
                                        break label$14;
                                    }
                                    this._storeInt((_34_ + 144), (sqlite3Get4byte((this._storeInt(((_34_ + 212) + ((this._loadInt((_34_ + 324))) << 2)), (this._loadInt(((this._loadInt((_34_ + 360))) + 20))))))));
                                    _33_ = cellSizePtr((this._loadInt((_34_ + 360))), (this._loadInt(((_34_ + 212) + ((this._loadInt((_34_ + 324))) << 2)))));
                                    _32_ = this._loadInt((_34_ + 324));
                                    this._storeInt8(((this._loadInt((_34_ + 360))) + 1), 0);
                                    this._storeInt(((_34_ + 160) + (_32_ << 2)), _33_);
                                    continue label$12;
                                }
                                while (false);
                                this._storeInt(((_34_ + 212) + ((_32_ = this._loadInt((_34_ + 324))) << 2)), ((_31_ = this._loadInt(((_33_ = this._loadInt((_34_ + 360))) + 64))) + ((this._loadInt16u((_33_ + 18))) & (((this._loadInt8u((_33_ = _31_ + ((this._loadInt16u((_33_ + 12))) + (((_32_ + (this._loadInt((_34_ + 312)))) - (this._loadInt8u((_33_ + 1)))) << 1))))) << 8) | (this._loadInt8u((_33_ + 1)))))));
                                this._storeInt((_34_ + 144), (sqlite3Get4byte((this._loadInt(((_34_ + 212) + ((this._loadInt((_34_ + 324))) << 2)))))));
                                _33_ = cellSizePtr((this._loadInt((_34_ + 360))), (this._loadInt(((_34_ + 212) + ((this._loadInt((_34_ + 324))) << 2)))));
                                this._storeInt(((_34_ + 160) + ((this._loadInt((_34_ + 324))) << 2)), _33_);
                                label$15:
                                do {
                                    if ((this._loadInt8u(((this._loadInt((_34_ + 344))) + 18))) == 0) {
                                        break label$15;
                                    }
                                    if (((this._storeInt((_34_ + 140), ((this._loadInt(((_34_ + 212) + ((this._loadInt((_34_ + 324))) << 2)))) - (this._loadInt(((this._loadInt((_34_ + 360))) + 64)))))) + (this._loadInt(((_34_ + 160) + ((this._loadInt((_34_ + 324))) << 2))))) > (this._loadInt(((this._loadInt((_34_ + 344))) + 40)))) {
                                        break label$10;
                                    }
                                    memcpy(((this._loadInt((_34_ + 352))) + (this._loadInt((_34_ + 140)))), (this._loadInt(((_34_ + 212) + (_33_ = (this._loadInt((_34_ + 324))) << 2)))), (this._loadInt(((_34_ + 160) + _33_))));
                                    this._storeInt((_33_ = (_34_ + 212) + ((this._loadInt((_34_ + 324))) << 2)), ((this._loadInt((_34_ + 352))) + ((this._loadInt(_33_)) - (this._loadInt(((this._loadInt((_34_ + 360))) + 64))))));
                                }
                                while (false);
                                dropCell((_33_ = this._loadInt((_34_ + 360))), (((_32_ = this._loadInt((_34_ + 324))) + (this._loadInt((_34_ + 312)))) - (this._loadInt8u((_33_ + 1)))), (this._loadInt(((_34_ + 160) + (_32_ << 2)))), (_34_ + 308));
                                continue label$12;
                            }
                        }
                        while (false);
                        memset((_34_ + 264), 0, (((this._loadInt((_34_ + 324))) << 2) + 4));
                        break label$9;
                    }
                    while (false);
                    this._storeInt((_34_ + 336), (((this._loadInt((_34_ + 336))) + 3) & -4));
                    _33_ = this._storeInt((_34_ + 316), ((this._loadInt(((this._loadInt((_34_ + 344))) + 36))) + 80));
                    label$16:
                    do {
                        if ((this._storeInt((_34_ + 156), (sqlite3ScratchMalloc((this._storeInt((_34_ + 276), (((((_32_ = this._loadInt((_34_ + 336))) << 2) + (_32_ << 1)) + (this._loadInt(((this._loadInt((_34_ + 344))) + 36)))) + (_33_ * (this._loadInt((_34_ + 328))))))))))) == 0) {
                            break label$16;
                        }
                        this._storeInt((_34_ + 148), ((this._storeInt((_34_ + 152), ((this._loadInt((_34_ + 156))) + ((this._loadInt((_34_ + 336))) << 2)))) + ((this._loadInt((_34_ + 336))) << 1)));
                        this._storeInt16((_34_ + 306), ((this._loadInt8u(((this._loadInt((_34_ + 264))) + 3))) << 2));
                        this._storeInt((_34_ + 300), (this._loadInt8u(((this._loadInt((_34_ + 264))) + 4))));
                        _31_ = this._storeInt((_34_ + 324), 0);
                        label$18:
                        do {
                            label$17:
                            while (true) {
                                if ((this._loadInt((_34_ + 324))) >= (this._loadInt((_34_ + 328)))) {
                                    break label$18;
                                }
                                memcpy((this._storeInt((_34_ + 132), (this._storeInt(((_34_ + 252) + ((_33_ = this._loadInt((_34_ + 324))) << 2)), ((this._loadInt((_34_ + 148))) + ((this._loadInt(((this._loadInt((_34_ + 344))) + 36))) + ((this._loadInt((_34_ + 316))) * _33_))))))), (this._loadInt(((_34_ + 264) + ((this._loadInt((_34_ + 324))) << 2)))), 76);
                                memcpy((this._storeInt(((_33_ = this._loadInt((_34_ + 132))) + 64), (_33_ + 76))), (this._loadInt(((this._loadInt(((_34_ + 264) + ((this._loadInt((_34_ + 324))) << 2)))) + 64))), (this._loadInt(((this._loadInt((_34_ + 344))) + 36))));
                                this._storeInt((_34_ + 136), ((this._loadInt16u(((_33_ = this._loadInt((_34_ + 132))) + 16))) + (this._loadInt8u((_33_ + 1)))));
                                label$19:
                                do {
                                    label$20:
                                    do {
                                        if ((this._loadInt8u(((this._loadInt((_34_ + 132))) + 1))) < 1) {
                                            break label$20;
                                        }
                                        this._storeInt((_34_ + 320), _31_);
                                        label$21:
                                        while (true) {
                                            if ((this._loadInt((_34_ + 320))) >= (this._loadInt((_34_ + 136)))) {
                                                break label$19;
                                            }
                                            _33_ = findOverflowCell((this._loadInt((_34_ + 132))), (this._loadInt((_34_ + 320))));
                                            this._storeInt(((_32_ = this._loadInt((_34_ + 156))) + ((this._loadInt((_34_ + 340))) << 2)), _33_);
                                            _33_ = cellSizePtr((this._loadInt((_34_ + 132))), (this._loadInt((_32_ + ((this._loadInt((_34_ + 340))) << 2)))));
                                            this._storeInt16(((this._loadInt((_34_ + 152))) + ((this._loadInt((_34_ + 340))) << 1)), _33_);
                                            this._storeInt((_34_ + 340), ((this._loadInt((_34_ + 340))) + 1));
                                            this._storeInt((_34_ + 320), ((this._loadInt((_34_ + 320))) + 1));
                                            continue label$21;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 128), (this._loadInt(((this._loadInt((_34_ + 132))) + 64))));
                                    this._storeInt16((_34_ + 126), (this._loadInt16u(((this._loadInt((_34_ + 132))) + 18))));
                                    this._storeInt16((_34_ + 124), (this._loadInt16u(((this._loadInt((_34_ + 132))) + 12))));
                                    this._storeInt((_34_ + 320), _31_);
                                    label$24:
                                    do {
                                        label$23:
                                        while (true) {
                                            if ((this._loadInt((_34_ + 320))) >= (this._loadInt((_34_ + 136)))) {
                                                break label$24;
                                            }
                                            this._storeInt(((this._loadInt((_34_ + 156))) + ((this._loadInt((_34_ + 340))) << 2)), ((_33_ = this._loadInt((_34_ + 128))) + ((this._loadInt16u((_34_ + 126))) & (((this._loadInt8u((_33_ = _33_ + ((this._loadInt16u((_34_ + 124))) + ((this._loadInt((_34_ + 320))) << 1))))) << 8) | (this._loadInt8u((_33_ + 1)))))));
                                            _33_ = cellSizePtr((this._loadInt((_34_ + 132))), (this._loadInt(((this._loadInt((_34_ + 156))) + ((this._loadInt((_34_ + 340))) << 2)))));
                                            this._storeInt16(((this._loadInt((_34_ + 152))) + ((this._loadInt((_34_ + 340))) << 1)), _33_);
                                            this._storeInt((_34_ + 340), ((this._loadInt((_34_ + 340))) + 1));
                                            this._storeInt((_34_ + 320), ((this._loadInt((_34_ + 320))) + 1));
                                            continue label$23;
                                        }
                                    }
                                    while (false);
                                }
                                while (false);
                                label$25:
                                do {
                                    if ((this._loadInt((_34_ + 324))) >= ((this._loadInt((_34_ + 328))) + -1)) {
                                        break label$25;
                                    }
                                    if ((this._loadInt((_34_ + 300))) != 0) {
                                        break label$25;
                                    }
                                    _33_ = this._storeInt16((_34_ + 122), (this._loadInt16u(((_34_ + 160) + ((this._loadInt((_34_ + 324))) << 2)))));
                                    this._storeInt16(((this._loadInt((_34_ + 152))) + ((this._loadInt((_34_ + 340))) << 1)), _33_);
                                    this._storeInt((_34_ + 116), ((this._loadInt((_34_ + 148))) + (this._loadInt((_34_ + 284)))));
                                    this._storeInt((_34_ + 284), ((this._loadInt((_34_ + 284))) + (this._loadInt16u((_34_ + 122)))));
                                    memcpy((this._loadInt((_34_ + 116))), (this._loadInt(((_34_ + 212) + ((this._loadInt((_34_ + 324))) << 2)))), (this._loadInt16u((_34_ + 122))));
                                    this._storeInt(((this._loadInt((_34_ + 156))) + ((this._loadInt((_34_ + 340))) << 2)), ((this._loadInt((_34_ + 116))) + (_33_ = this._loadInt16u((_34_ + 306)))));
                                    this._storeInt16((_32_ = (this._loadInt((_34_ + 152))) + ((this._loadInt((_34_ + 340))) << 1)), ((this._loadInt16u(_32_)) - _33_));
                                    label$26:
                                    do {
                                        label$27:
                                        do {
                                            if ((this._loadInt8u(((this._loadInt((_34_ + 132))) + 3))) == 0) {
                                                break label$27;
                                            }
                                            if ((this._loadInt16u(((this._loadInt((_34_ + 152))) + ((this._loadInt((_34_ + 340))) << 1)))) > 3) {
                                                break label$26;
                                            }
                                            this._storeInt16(((this._loadInt((_34_ + 152))) + ((this._loadInt((_34_ + 340))) << 1)), 4);
                                            break label$26;
                                        }
                                        while (false);
                                        memcpy((this._loadInt(((this._loadInt((_34_ + 156))) + ((this._loadInt((_34_ + 340))) << 2)))), ((this._loadInt(((this._loadInt((_34_ + 132))) + 64))) + 8), 4);
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 340), ((this._loadInt((_34_ + 340))) + 1));
                                }
                                while (false);
                                this._storeInt((_34_ + 324), ((this._loadInt((_34_ + 324))) + 1));
                                continue label$17;
                            }
                        }
                        while (false);
                        this._storeInt((_34_ + 296), (((this._loadInt(((this._loadInt((_34_ + 344))) + 40))) + (this._loadInt16u((_34_ + 306)))) + -12));
                        _33_ = this._storeInt((_34_ + 288), (this._storeInt((_34_ + 316), (this._storeInt((_34_ + 324), 0)))));
                        label$28:
                        do {
                            label$30:
                            do {
                                label$29:
                                while (true) {
                                    if ((this._loadInt((_34_ + 324))) >= (this._loadInt((_34_ + 340)))) {
                                        break label$28;
                                    }
                                    label$31:
                                    do {
                                        if ((this._storeInt((_34_ + 288), (((this._loadInt((_34_ + 288))) + (this._loadInt16u(((this._loadInt((_34_ + 152))) + ((this._loadInt((_34_ + 324))) << 1))))) + 2))) <= (this._loadInt((_34_ + 296)))) {
                                            break label$31;
                                        }
                                        this._storeInt(((_34_ + 160) + ((this._loadInt((_34_ + 316))) << 2)), ((this._loadInt((_34_ + 288))) - (this._loadInt16u(((this._loadInt((_34_ + 152))) + ((this._loadInt((_34_ + 324))) << 1))))));
                                        this._storeInt(((_34_ + 192) + ((this._loadInt((_34_ + 316))) << 2)), (this._loadInt((_34_ + 324))));
                                        label$32:
                                        do {
                                            if ((this._loadInt((_34_ + 300))) == 0) {
                                                break label$32;
                                            }
                                            this._storeInt((_34_ + 324), ((this._loadInt((_34_ + 324))) + -1));
                                        }
                                        while (false);
                                        this._storeInt((_34_ + 288), _33_);
                                        if ((this._storeInt((_34_ + 316), ((this._loadInt((_34_ + 316))) + 1))) >= 5) {
                                            break label$30;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 324), ((this._loadInt((_34_ + 324))) + 1));
                                    continue label$29;
                                }
                            }
                            while (false);
                            this._storeInt((_34_ + 308), (sqlite3CorruptError(53611)));
                            break label$9;
                        }
                        while (false);
                        this._storeInt(((_34_ + 160) + (_33_ = (this._loadInt((_34_ + 316))) << 2)), (this._loadInt((_34_ + 288))));
                        this._storeInt(((_34_ + 192) + _33_), (this._loadInt((_34_ + 340))));
                        this._storeInt((_34_ + 316), ((_33_ = this._loadInt((_34_ + 316))) + 1));
                        this._storeInt((_34_ + 324), _33_);
                        label$33:
                        while (true) {
                            label$35:
                            do {
                                label$36:
                                do {
                                    if ((this._loadInt((_34_ + 324))) < 1) {
                                        break label$36;
                                    }
                                    this._storeInt((_34_ + 112), (this._loadInt(((_34_ + 160) + ((this._loadInt((_34_ + 324))) << 2)))));
                                    this._storeInt((_34_ + 108), (this._loadInt((((_34_ + 160) + ((this._loadInt((_34_ + 324))) << 2)) + -4))));
                                    this._storeInt((_34_ + 104), ((_33_ = this._loadInt((((_34_ + 192) + ((this._loadInt((_34_ + 324))) << 2)) + -4))) + -1));
                                    this._storeInt((_34_ + 100), (_33_ - (this._loadInt((_34_ + 300)))));
                                    label$37:
                                    while (true) {
                                        _33_ = 1;
                                        label$39:
                                        do {
                                            if ((this._loadInt((_34_ + 112))) == 0) {
                                                break label$39;
                                            }
                                            _33_ = ((((this._loadInt((_34_ + 112))) + (this._loadInt16u(((_33_ = this._loadInt((_34_ + 152))) + ((this._loadInt((_34_ + 100))) << 1))))) + 2) <= ((this._loadInt((_34_ + 108))) - ((this._loadInt16u((_33_ + ((this._loadInt((_34_ + 104))) << 1)))) + 2))) ? 1 : 0;
                                        }
                                        while (false);
                                        if (_33_ == 0) {
                                            break label$35;
                                        }
                                        this._storeInt((_34_ + 112), (((this._loadInt((_34_ + 112))) + (this._loadInt16u(((this._loadInt((_34_ + 152))) + ((this._loadInt((_34_ + 100))) << 1))))) + 2));
                                        this._storeInt((_34_ + 108), ((this._loadInt((_34_ + 108))) - ((this._loadInt16u(((this._loadInt((_34_ + 152))) + ((this._loadInt((_34_ + 104))) << 1)))) + 2)));
                                        _32_ = this._storeInt((_33_ = ((_34_ + 192) + ((this._loadInt((_34_ + 324))) << 2)) + -4), ((_33_ = this._loadInt(_33_)) + -1));
                                        this._storeInt((_34_ + 104), (_33_ + -2));
                                        this._storeInt((_34_ + 100), (_32_ - (this._loadInt((_34_ + 300)))));
                                        continue label$37;
                                    }
                                }
                                while (false);
                                label$40:
                                do {
                                    if (((this._loadInt(((this._loadInt((_34_ + 264))) + 72))) & 4294967295L) > (1 & 4294967295L)) {
                                        break label$40;
                                    }
                                    this._storeInt((_34_ + 308), (sqlite3CorruptError(53665)));
                                    break label$9;
                                }
                                while (false);
                                this._storeInt((_34_ + 292), (this._loadInt8u((this._loadInt(((this._loadInt((_34_ + 264))) + 64))))));
                                _33_ = this._storeInt((_34_ + 324), 0);
                                label$42:
                                do {
                                    label$41:
                                    while (true) {
                                        if ((this._loadInt((_34_ + 324))) >= (this._loadInt((_34_ + 316)))) {
                                            break label$42;
                                        }
                                        label$43:
                                        do {
                                            label$44:
                                            do {
                                                if ((this._loadInt((_34_ + 324))) >= (this._loadInt((_34_ + 328)))) {
                                                    break label$44;
                                                }
                                                _32_ = this._storeInt((_34_ + 96), (this._storeInt(((_34_ + 224) + (_32_ = (this._loadInt((_34_ + 324))) << 2)), (this._loadInt(((_34_ + 264) + _32_))))));
                                                this._storeInt(((_34_ + 264) + ((this._loadInt((_34_ + 324))) << 2)), _33_);
                                                this._storeInt((_34_ + 308), (sqlite3PagerWrite((this._loadInt((_32_ + 68))))));
                                                this._storeInt((_34_ + 332), ((this._loadInt((_34_ + 332))) + 1));
                                                if ((this._loadInt((_34_ + 308))) == 0) {
                                                    break label$43;
                                                }
                                                break label$9;
                                            }
                                            while (false);
                                            if ((this._storeInt((_34_ + 308), (allocateBtreePage((this._loadInt((_34_ + 344))), (_34_ + 96), (_34_ + 144), (this._loadInt((_34_ + 144))), _33_)))) != 0) {
                                                break label$9;
                                            }
                                            this._storeInt(((_34_ + 224) + ((this._loadInt((_34_ + 324))) << 2)), (this._loadInt((_34_ + 96))));
                                            this._storeInt((_34_ + 332), ((this._loadInt((_34_ + 332))) + 1));
                                            if ((this._loadInt8u(((this._loadInt((_34_ + 344))) + 21))) == 0) {
                                                break label$43;
                                            }
                                            ptrmapPut((this._loadInt((_34_ + 344))), (this._loadInt(((this._loadInt((_34_ + 96))) + 72))), 5, (this._loadInt(((this._loadInt((_34_ + 360))) + 72))), (_34_ + 308));
                                            if ((this._loadInt((_34_ + 308))) != 0) {
                                                break label$9;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_34_ + 324), ((this._loadInt((_34_ + 324))) + 1));
                                        continue label$41;
                                    }
                                }
                                while (false);
                                label$46:
                                do {
                                    label$45:
                                    while (true) {
                                        if ((this._loadInt((_34_ + 324))) >= (this._loadInt((_34_ + 328)))) {
                                            break label$46;
                                        }
                                        freePage((this._loadInt(((_34_ + 264) + ((this._loadInt((_34_ + 324))) << 2)))), (_34_ + 308));
                                        if ((this._loadInt((_34_ + 308))) != 0) {
                                            break label$9;
                                        }
                                        releasePage((this._loadInt(((_34_ + 264) + ((this._loadInt((_34_ + 324))) << 2)))));
                                        this._storeInt(((_34_ + 264) + ((_33_ = this._loadInt((_34_ + 324))) << 2)), 0);
                                        this._storeInt((_34_ + 324), (_33_ + 1));
                                        continue label$45;
                                    }
                                }
                                while (false);
                                this._storeInt((_34_ + 324), 0);
                                label$48:
                                do {
                                    label$47:
                                    while (true) {
                                        if ((this._loadInt((_34_ + 324))) >= ((this._loadInt((_34_ + 316))) + -1)) {
                                            break label$48;
                                        }
                                        this._storeInt((_34_ + 92), (this._loadInt(((this._loadInt(((_34_ + 224) + ((this._loadInt((_34_ + 324))) << 2)))) + 72))));
                                        this._storeInt((_34_ + 88), (this._loadInt((_34_ + 324))));
                                        this._storeInt((_34_ + 320), ((this._loadInt((_34_ + 324))) + 1));
                                        label$50:
                                        do {
                                            label$49:
                                            while (true) {
                                                if ((this._loadInt((_34_ + 320))) >= (this._loadInt((_34_ + 316)))) {
                                                    break label$50;
                                                }
                                                label$51:
                                                do {
                                                    if (((this._loadInt(((this._loadInt(((_34_ + 224) + ((this._loadInt((_34_ + 320))) << 2)))) + 72))) & 4294967295L) >= ((this._loadInt((_34_ + 92))) & 4294967295L)) {
                                                        break label$51;
                                                    }
                                                    this._storeInt((_34_ + 88), (this._loadInt((_34_ + 320))));
                                                    this._storeInt((_34_ + 92), (this._loadInt(((this._loadInt(((_34_ + 224) + ((this._loadInt((_34_ + 320))) << 2)))) + 72))));
                                                }
                                                while (false);
                                                this._storeInt((_34_ + 320), ((this._loadInt((_34_ + 320))) + 1));
                                                continue label$49;
                                            }
                                        }
                                        while (false);
                                        label$52:
                                        do {
                                            if ((this._loadInt((_34_ + 88))) <= (this._loadInt((_34_ + 324)))) {
                                                break label$52;
                                            }
                                            this._storeInt((_34_ + 84), (this._loadInt(((_34_ + 224) + ((this._loadInt((_34_ + 324))) << 2)))));
                                            this._storeInt(((_34_ + 224) + ((this._loadInt((_34_ + 324))) << 2)), (this._loadInt(((_34_ + 224) + ((this._loadInt((_34_ + 88))) << 2)))));
                                            this._storeInt(((_34_ + 224) + ((this._loadInt((_34_ + 88))) << 2)), (this._loadInt((_34_ + 84))));
                                        }
                                        while (false);
                                        this._storeInt((_34_ + 324), ((this._loadInt((_34_ + 324))) + 1));
                                        continue label$47;
                                    }
                                }
                                while (false);
                                sqlite3Put4byte((this._loadInt((_34_ + 220))), (this._loadInt(((this._loadInt((((_34_ + 224) + ((this._loadInt((_34_ + 332))) << 2)) + -4))) + 72))));
                                _32_ = this._storeInt((_34_ + 324), (this._storeInt((_34_ + 320), 0)));
                                label$54:
                                do {
                                    label$53:
                                    while (true) {
                                        if ((this._loadInt((_34_ + 324))) >= (this._loadInt((_34_ + 332)))) {
                                            break label$54;
                                        }
                                        zeroPage((this._storeInt((_34_ + 80), (this._loadInt(((_34_ + 224) + ((this._loadInt((_34_ + 324))) << 2)))))), (this._loadInt((_34_ + 292))));
                                        assemblePage((this._loadInt((_34_ + 80))), ((this._loadInt(((_34_ + 192) + ((this._loadInt((_34_ + 324))) << 2)))) - (_33_ = this._loadInt((_34_ + 320)))), ((this._loadInt((_34_ + 156))) + (_33_ << 2)), ((this._loadInt((_34_ + 152))) + (_33_ << 1)));
                                        label$55:
                                        do {
                                            if ((this._storeInt((_34_ + 320), (this._loadInt(((_34_ + 192) + ((this._loadInt((_34_ + 324))) << 2)))))) >= (this._loadInt((_34_ + 340)))) {
                                                break label$55;
                                            }
                                            this._storeInt((_34_ + 76), (this._loadInt(((this._loadInt((_34_ + 156))) + ((this._loadInt((_34_ + 320))) << 2)))));
                                            this._storeInt((_34_ + 68), ((this._loadInt16u(((this._loadInt((_34_ + 152))) + ((this._loadInt((_34_ + 320))) << 1)))) + (this._loadInt16u((_34_ + 306)))));
                                            this._storeInt((_34_ + 72), ((this._loadInt((_34_ + 352))) + (this._loadInt((_34_ + 280)))));
                                            label$56:
                                            do {
                                                label$57:
                                                do {
                                                    label$58:
                                                    do {
                                                        if ((this._loadInt8u(((this._loadInt((_34_ + 80))) + 3))) == 0) {
                                                            break label$58;
                                                        }
                                                        if ((this._loadInt((_34_ + 300))) == 0) {
                                                            break label$57;
                                                        }
                                                        _33_ = this._storeInt((_34_ + 320), ((this._loadInt((_34_ + 320))) + -1));
                                                        btreeParseCellPtr((this._loadInt((_34_ + 80))), (this._loadInt(((this._loadInt((_34_ + 156))) + (_33_ << 2)))), (_34_ + 32));
                                                        this._storeInt((_34_ + 68), ((sqlite3PutVarint(((this._storeInt((_34_ + 76), (this._loadInt((_34_ + 72))))) + 4), (this._loadLong((_34_ + 32))))) + 4));
                                                        this._storeInt((_34_ + 72), _32_);
                                                        break label$56;
                                                    }
                                                    while (false);
                                                    memcpy(((this._loadInt(((this._loadInt((_34_ + 80))) + 64))) + 8), (this._loadInt((_34_ + 76))), 4);
                                                    break label$56;
                                                }
                                                while (false);
                                                this._storeInt((_34_ + 76), ((this._loadInt((_34_ + 76))) + -4));
                                                if ((this._loadInt16u(((this._loadInt((_34_ + 152))) + ((this._loadInt((_34_ + 320))) << 1)))) != 4) {
                                                    break label$56;
                                                }
                                                this._storeInt((_34_ + 68), (cellSizePtr((this._loadInt((_34_ + 360))), (this._loadInt((_34_ + 76))))));
                                            }
                                            while (false);
                                            this._storeInt((_34_ + 280), ((this._loadInt((_34_ + 280))) + (this._loadInt((_34_ + 68)))));
                                            insertCell((this._loadInt((_34_ + 360))), (this._loadInt((_34_ + 312))), (this._loadInt((_34_ + 76))), (this._loadInt((_34_ + 68))), (this._loadInt((_34_ + 72))), (this._loadInt(((this._loadInt((_34_ + 80))) + 72))), (_34_ + 308));
                                            if ((this._loadInt((_34_ + 308))) != 0) {
                                                break label$9;
                                            }
                                            this._storeInt((_34_ + 320), ((this._loadInt((_34_ + 320))) + 1));
                                            this._storeInt((_34_ + 312), ((this._loadInt((_34_ + 312))) + 1));
                                        }
                                        while (false);
                                        this._storeInt((_34_ + 324), ((this._loadInt((_34_ + 324))) + 1));
                                        continue label$53;
                                    }
                                }
                                while (false);
                                label$59:
                                do {
                                    if (((this._loadInt8u((_34_ + 292))) & 8) != 0) {
                                        break label$59;
                                    }
                                    _33_ = this._storeInt((_34_ + 28), ((this._loadInt(((this._loadInt((((_34_ + 252) + ((this._loadInt((_34_ + 328))) << 2)) + -4))) + 64))) + 8));
                                    memcpy(((this._loadInt(((this._loadInt((((_34_ + 224) + ((this._loadInt((_34_ + 332))) << 2)) + -4))) + 64))) + 8), _33_, 4);
                                }
                                while (false);
                                label$60:
                                do {
                                    if ((this._loadInt((_34_ + 348))) == 0) {
                                        break label$60;
                                    }
                                    if ((this._loadInt16u(((this._loadInt((_34_ + 360))) + 16))) != 0) {
                                        break label$60;
                                    }
                                    if ((this._loadInt8u(((this._loadInt((_34_ + 360))) + 5))) > (this._loadInt16u(((this._loadInt((_34_ + 224))) + 14)))) {
                                        break label$60;
                                    }
                                    copyNodeContent((this._loadInt((_34_ + 224))), (this._loadInt((_34_ + 360))), (_34_ + 308));
                                    freePage((this._loadInt((_34_ + 224))), (_34_ + 308));
                                    break label$9;
                                }
                                while (false);
                                if ((this._loadInt8u(((this._loadInt((_34_ + 344))) + 21))) == 0) {
                                    break label$9;
                                }
                                this._storeInt((_34_ + 24), (this._loadInt((_34_ + 224))));
                                this._storeInt((_34_ + 12), ((this._storeInt((_34_ + 16), (this._loadInt8u(((this._storeInt((_34_ + 20), (this._loadInt((_34_ + 252))))) + 1))))) + (this._loadInt16u(((this._loadInt((_34_ + 20))) + 16)))));
                                _33_ = -1;
                                label$61:
                                do {
                                    if ((this._loadInt((_34_ + 16))) == 0) {
                                        break label$61;
                                    }
                                    _33_ = this._loadInt16u(((this._loadInt((_34_ + 20))) + 24));
                                }
                                while (false);
                                this._storeInt((_34_ + 8), _33_);
                                _32_ = this._storeInt((_34_ + 324), (this._storeInt((_34_ + 316), (this._storeInt((_34_ + 320), 0)))));
                                label$63:
                                do {
                                    label$62:
                                    while (true) {
                                        if ((this._loadInt((_34_ + 324))) >= (this._loadInt((_34_ + 340)))) {
                                            break label$63;
                                        }
                                        this._storeInt((_34_ + 4), _32_);
                                        label$65:
                                        do {
                                            label$64:
                                            while (true) {
                                                if ((this._loadInt((_34_ + 324))) != (this._loadInt((_34_ + 12)))) {
                                                    break label$65;
                                                }
                                                _33_ = this._storeInt((_34_ + 20), (this._loadInt(((_34_ + 252) + ((this._storeInt((_34_ + 320), ((this._loadInt((_34_ + 320))) + 1))) << 2)))));
                                                this._storeInt((_34_ + 12), ((((this._loadInt((_34_ + 324))) + (((this._loadInt((_34_ + 300))) == 0) ? 1 : 0)) + (this._loadInt16u((_33_ + 16)))) + (this._loadInt8u((_33_ + 1)))));
                                                label$66:
                                                do {
                                                    if ((this._loadInt8u(((this._loadInt((_34_ + 20))) + 1))) == 0) {
                                                        break label$66;
                                                    }
                                                    this._storeInt((_34_ + 16), (this._loadInt8u(((this._loadInt((_34_ + 20))) + 1))));
                                                    this._storeInt((_34_ + 8), (((this._loadInt((_34_ + 324))) + (((this._loadInt((_34_ + 300))) == 0) ? 1 : 0)) + (this._loadInt16u(((this._loadInt((_34_ + 20))) + 24)))));
                                                }
                                                while (false);
                                                this._storeInt((_34_ + 4), (((this._loadInt((_34_ + 300))) == 0) ? 1 : 0));
                                                continue label$64;
                                            }
                                        }
                                        while (false);
                                        label$67:
                                        do {
                                            if ((this._loadInt((_34_ + 324))) != (this._loadInt((_34_ + 8)))) {
                                                break label$67;
                                            }
                                            _33_ = this._storeInt((_34_ + 4), 1);
                                            if ((this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) + -1))) < _33_) {
                                                break label$67;
                                            }
                                            this._storeInt((_34_ + 8), ((this._loadInt((_34_ + 8))) + _33_));
                                        }
                                        while (false);
                                        label$68:
                                        do {
                                            label$69:
                                            do {
                                                if ((this._loadInt((_34_ + 324))) != (this._loadInt(((_34_ + 192) + ((this._loadInt((_34_ + 316))) << 2))))) {
                                                    break label$69;
                                                }
                                                this._storeInt((_34_ + 24), (this._loadInt(((_34_ + 224) + ((this._storeInt((_34_ + 316), ((this._loadInt((_34_ + 316))) + 1))) << 2)))));
                                                if ((this._loadInt((_34_ + 300))) == 0) {
                                                    break label$68;
                                                }
                                            }
                                            while (false);
                                            label$70:
                                            do {
                                                if ((this._loadInt((_34_ + 4))) != 0) {
                                                    break label$70;
                                                }
                                                if ((this._loadInt(((this._loadInt((_34_ + 20))) + 72))) == (this._loadInt(((this._loadInt((_34_ + 24))) + 72)))) {
                                                    break label$68;
                                                }
                                            }
                                            while (false);
                                            label$71:
                                            do {
                                                if ((this._loadInt16u((_34_ + 306))) != 0) {
                                                    break label$71;
                                                }
                                                ptrmapPut((this._loadInt((_34_ + 344))), (sqlite3Get4byte((this._loadInt(((this._loadInt((_34_ + 156))) + ((this._loadInt((_34_ + 324))) << 2)))))), 5, (this._loadInt(((this._loadInt((_34_ + 24))) + 72))), (_34_ + 308));
                                            }
                                            while (false);
                                            if ((this._loadInt16u(((this._loadInt((_34_ + 152))) + ((this._loadInt((_34_ + 324))) << 1)))) <= (this._loadInt16u(((this._loadInt((_34_ + 24))) + 10)))) {
                                                break label$68;
                                            }
                                            ptrmapPutOvflPtr((this._loadInt((_34_ + 24))), (this._loadInt(((this._loadInt((_34_ + 156))) + ((this._loadInt((_34_ + 324))) << 2)))), (_34_ + 308));
                                        }
                                        while (false);
                                        this._storeInt((_34_ + 324), ((this._loadInt((_34_ + 324))) + 1));
                                        continue label$62;
                                    }
                                }
                                while (false);
                                if ((this._loadInt16u((_34_ + 306))) != 0) {
                                    break label$9;
                                }
                                this._storeInt((_34_ + 324), 0);
                                label$72:
                                while (true) {
                                    if ((this._loadInt((_34_ + 324))) >= (this._loadInt((_34_ + 332)))) {
                                        break label$9;
                                    }
                                    _33_ = this._storeInt(_34_, (sqlite3Get4byte(((this._loadInt(((this._loadInt(((_34_ + 224) + ((this._loadInt((_34_ + 324))) << 2)))) + 64))) + 8))));
                                    ptrmapPut((this._loadInt((_34_ + 344))), _33_, 5, (this._loadInt(((this._loadInt(((_34_ + 224) + ((this._loadInt((_34_ + 324))) << 2)))) + 72))), (_34_ + 308));
                                    this._storeInt((_34_ + 324), ((this._loadInt((_34_ + 324))) + 1));
                                    continue label$72;
                                }
                            }
                            while (false);
                            this._storeInt((_33_ = (_34_ + 160) + ((this._loadInt((_34_ + 324))) << 2)), (this._loadInt((_34_ + 112))));
                            this._storeInt((_33_ + -4), (this._loadInt((_34_ + 108))));
                            this._storeInt((_34_ + 324), ((this._loadInt((_34_ + 324))) + -1));
                            continue label$33;
                        }
                    }
                    while (false);
                    this._storeInt((_34_ + 308), 7);
                    break label$9;
                }
                while (false);
                this._storeInt((_34_ + 308), (sqlite3CorruptError(53472)));
                memset((_34_ + 264), 0, (((this._loadInt((_34_ + 324))) << 2) + 4));
            }
            while (false);
            sqlite3ScratchFree((this._loadInt((_34_ + 156))));
            this._storeInt((_34_ + 324), 0);
            label$75:
            do {
                label$74:
                while (true) {
                    if ((this._loadInt((_34_ + 324))) >= (this._loadInt((_34_ + 328)))) {
                        break label$75;
                    }
                    releasePage((this._loadInt(((_34_ + 264) + ((this._loadInt((_34_ + 324))) << 2)))));
                    this._storeInt((_34_ + 324), ((this._loadInt((_34_ + 324))) + 1));
                    continue label$74;
                }
            }
            while (false);
            this._storeInt((_34_ + 324), 0);
            label$77:
            do {
                label$76:
                while (true) {
                    if ((this._loadInt((_34_ + 324))) >= (this._loadInt((_34_ + 332)))) {
                        break label$77;
                    }
                    releasePage((this._loadInt(((_34_ + 224) + ((this._loadInt((_34_ + 324))) << 2)))));
                    this._storeInt((_34_ + 324), ((this._loadInt((_34_ + 324))) + 1));
                    continue label$76;
                }
            }
            while (false);
            this._storeInt((_34_ + 364), (this._loadInt((_34_ + 308))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 364));
        this._storeInt((0 + 4), (_34_ + 368));
        return _33_;
    }

    @Override()
    public final int findOverflowCell(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 16), ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 1))) + -1));
        label$0:
        do {
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 16))) < 0) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 8), ((_31_ = (this._loadInt((_32_ + 24))) + ((this._loadInt((_32_ + 16))) << 3)) + 20));
                    label$3:
                    do {
                        if ((this._storeInt((_32_ + 12), (this._loadInt16u((_31_ + 24))))) > (this._loadInt((_32_ + 20)))) {
                            break label$3;
                        }
                        if ((this._loadInt((_32_ + 12))) == (this._loadInt((_32_ + 20)))) {
                            break label$0;
                        }
                        this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + -1));
                    }
                    while (false);
                    this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + -1));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt((_32_ + 28), ((_30_ = this._loadInt(((_31_ = this._loadInt((_32_ + 24))) + 64))) + ((this._loadInt16u((_31_ + 18))) & (((this._loadInt8u((_31_ = _30_ + ((this._loadInt16u((_31_ + 12))) + ((this._loadInt((_32_ + 20))) << 1))))) << 8) | (this._loadInt8u((_31_ + 1)))))));
            return (this._loadInt((_32_ + 28)));
        }
        while (false);
        this._storeInt((_32_ + 28), (this._loadInt((this._loadInt((_32_ + 8))))));
        return (this._loadInt((_32_ + 28)));
    }

    @Override()
    public final void assemblePage(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_34_ + 40), _31_);
        this._storeInt((_34_ + 36), _32_);
        this._storeInt((_34_ + 32), _33_);
        this._storeInt((_34_ + 16), (this._loadInt(((this._loadInt((_34_ + 44))) + 64))));
        this._storeInt((_34_ + 12), (this._loadInt8u(((this._loadInt((_34_ + 44))) + 5))));
        this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt(((this._loadInt((_34_ + 44))) + 60))) + 40))));
        this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 16))) + ((this._loadInt16u(((this._loadInt((_34_ + 44))) + 12))) + ((this._loadInt((_34_ + 40))) << 1))));
        this._storeInt((_34_ + 20), (this._loadInt((_34_ + 8))));
        this._storeInt((_34_ + 28), ((this._loadInt((_34_ + 40))) + -1));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_34_ + 28))) < 0) {
                    break label$1;
                }
                this._storeInt16((_34_ + 6), (this._loadInt16u(((this._loadInt((_34_ + 32))) + ((this._loadInt((_34_ + 28))) << 1)))));
                this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + -2));
                _33_ = this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) - (this._loadInt16u((_34_ + 6)))));
                this._storeInt8((_32_ = this._loadInt((_34_ + 24))), (_33_ >>> 8));
                memcpy(((this._storeInt8((_32_ + 1), _33_)) + (this._loadInt((_34_ + 16)))), (this._loadInt(((this._loadInt((_34_ + 36))) + ((this._loadInt((_34_ + 28))) << 2)))), (this._loadInt16u((_34_ + 6))));
                this._storeInt((_34_ + 28), ((this._loadInt((_34_ + 28))) + -1));
                continue label$0;
            }
        }
        while (false);
        this._storeInt8(((_33_ = (this._loadInt((_34_ + 16))) + (this._loadInt((_34_ + 12)))) + 3), ((this._storeInt8((_33_ + 4), (this._loadInt((_34_ + 40))))) >>> 8));
        this._storeInt8((((this._loadInt((_34_ + 16))) + (this._loadInt((_34_ + 12)))) + 5), ((this._loadInt((_34_ + 20))) >>> 8));
        this._storeInt8((((this._loadInt((_34_ + 16))) + (this._loadInt((_34_ + 12)))) + 6), (this._loadInt((_34_ + 20))));
        this._storeInt16(((_33_ = this._loadInt((_34_ + 44))) + 14), ((this._loadInt16u((_33_ + 14))) - ((((this._loadInt((_34_ + 40))) << 1) + (this._loadInt((_34_ + 8)))) - (this._loadInt((_34_ + 20))))));
        this._storeInt16(((this._loadInt((_34_ + 44))) + 16), (this._loadInt((_34_ + 40))));
        this._storeInt((0 + 4), (_34_ + 48));
        return;
    }

    @Override()
    public final int sqlite3PutVarint(int _30_, long _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 48) + 40), _30_);
        this._storeLong((_33_ + 32), _31_);
        label$0:
        do {
            if ((this._loadInt8u((_33_ + 39))) == 0) {
                break label$0;
            }
            this._storeLong((_33_ + 32), ((this._storeLong8(((this._loadInt((_33_ + 40))) + 8), (this._loadLong((_33_ + 32))))) >>> 8L));
            this._storeInt((_33_ + 28), 7);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_33_ + 28))) < 0) {
                        break label$2;
                    }
                    this._storeLong8(((this._loadInt((_33_ + 40))) + (this._loadInt((_33_ + 28)))), ((_31_ = this._loadLong((_33_ + 32))) | 128L));
                    this._storeLong((_33_ + 32), (_31_ >>> 7L));
                    this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) + -1));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt((_33_ + 44), 9);
            return (this._loadInt((_33_ + 44)));
        }
        while (false);
        this._storeInt((_33_ + 20), 0);
        label$3$end:
        do {
            label$3:
            while (true) {
                this._storeLong8(((_33_ + 10) + (_30_ = this._loadInt((_33_ + 20)))), ((this._loadLong((_33_ + 32))) | 128L));
                this._storeInt((_33_ + 20), (_30_ + 1));
                if ((this._storeLong((_33_ + 32), ((this._loadLong((_33_ + 32))) >>> 7L))) != 0L) {
                    continue label$3;
                }
                break label$3$end;
            }
        }
        while (false);
        this._storeInt8((_33_ + 10), ((this._loadInt8u((_33_ + 10))) & 127));
        _32_ = this._storeInt((_33_ + 28), 0);
        this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 20))) + -1));
        label$6:
        do {
            label$5:
            while (true) {
                if ((this._loadInt((_33_ + 24))) < _32_) {
                    break label$6;
                }
                this._storeInt8(((this._loadInt((_33_ + 40))) + (this._loadInt((_33_ + 28)))), (this._loadInt8u(((_33_ + 10) + (_30_ = this._loadInt((_33_ + 24)))))));
                this._storeInt((_33_ + 24), (_30_ + -1));
                this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) + 1));
                continue label$5;
            }
        }
        while (false);
        this._storeInt((_33_ + 44), (this._loadInt((_33_ + 20))));
        return (this._loadInt((_33_ + 44)));
    }

    @Override()
    public final void copyNodeContent(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_33_ + 40), _31_);
        label$0:
        do {
            if ((this._loadInt((this._storeInt((_33_ + 36), _32_)))) != 0) {
                break label$0;
            }
            this._storeInt((_33_ + 32), (this._loadInt(((this._loadInt((_33_ + 44))) + 60))));
            this._storeInt((_33_ + 28), (this._loadInt(((this._loadInt((_33_ + 44))) + 64))));
            this._storeInt((_33_ + 24), (this._loadInt(((this._loadInt((_33_ + 40))) + 64))));
            this._storeInt((_33_ + 20), (this._loadInt8u(((this._loadInt((_33_ + 44))) + 5))));
            _temp$0 = 100;
            _temp$1 = 0;
            _temp$2 = ((this._loadInt(((this._loadInt((_33_ + 40))) + 72))) == 1) ? _temp$0 : _temp$1;
            this._storeInt((_33_ + 16), _temp$2);
            memcpy(((_32_ = this._storeInt((_33_ + 8), (((this._loadInt8u(((_32_ = (this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 20)))) + 5))) << 8) | (this._loadInt8u((_32_ + 6)))))) + (this._loadInt((_33_ + 24)))), (_32_ + (this._loadInt((_33_ + 28)))), ((this._loadInt(((this._loadInt((_33_ + 32))) + 40))) - _32_));
            memcpy(((this._loadInt((_33_ + 24))) + (this._loadInt((_33_ + 16)))), ((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 20)))), ((this._loadInt16u(((_32_ = this._loadInt((_33_ + 44))) + 12))) + ((this._loadInt16u((_32_ + 16))) << 1)));
            this._storeInt8((_32_ = this._loadInt((_33_ + 40))), 0);
            label$1:
            do {
                if ((this._storeInt((_33_ + 12), (btreeInitPage(_32_)))) == 0) {
                    break label$1;
                }
                this._storeInt((this._loadInt((_33_ + 36))), (this._loadInt((_33_ + 12))));
                break label$0;
            }
            while (false);
            if ((this._loadInt8u(((this._loadInt((_33_ + 32))) + 21))) == 0) {
                break label$0;
            }
            _32_ = setChildPtrmaps((this._loadInt((_33_ + 40))));
            this._storeInt((this._loadInt((_33_ + 36))), _32_);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 48));
        return;
    }

    @Override()
    public final int allocateSpace(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_33_ + 52), _31_);
        this._storeInt((_33_ + 48), _32_);
        this._storeInt((_33_ + 44), (this._loadInt8u(((this._loadInt((_33_ + 56))) + 5))));
        this._storeInt((_33_ + 40), (this._loadInt(((this._loadInt((_33_ + 56))) + 64))));
        this._storeInt((_33_ + 20), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 56))) + 60))) + 40))));
        this._storeInt((_33_ + 36), (this._loadInt8u((((this._loadInt((_33_ + 40))) + (this._loadInt((_33_ + 44)))) + 7))));
        this._storeInt((_33_ + 28), ((this._loadInt16u(((_32_ = this._loadInt((_33_ + 56))) + 12))) + ((this._loadInt16u((_32_ + 16))) << 1)));
        _32_ = this._storeInt((_33_ + 32), ((((((this._loadInt8u(((_32_ = (this._loadInt((_33_ + 40))) + (this._loadInt((_33_ + 44)))) + 5))) << 8) | (this._loadInt8u((_32_ + 6)))) + -1) & 65535) + 1));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_33_ + 28))) <= _32_) {
                    break label$1;
                }
                this._storeInt((_33_ + 60), (sqlite3CorruptError(48686)));
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
                                            if ((this._loadInt((_33_ + 36))) < 60) {
                                                break label$9;
                                            }
                                            if ((this._storeInt((_33_ + 24), (defragmentPage((this._loadInt((_33_ + 56))))))) == 0) {
                                                break label$8;
                                            }
                                            this._storeInt((_33_ + 60), (this._loadInt((_33_ + 24))));
                                            break label$0;
                                        }
                                        while (false);
                                        if (((this._loadInt((_33_ + 28))) + 2) > (this._loadInt((_33_ + 32)))) {
                                            break label$7;
                                        }
                                        this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 44))) + 1));
                                        label$11:
                                        do {
                                            label$10:
                                            while (true) {
                                                if ((this._storeInt((_33_ + 16), (((this._loadInt8u((_32_ = (this._loadInt((_33_ + 40))) + (this._loadInt((_33_ + 12)))))) << 8) | (this._loadInt8u((_32_ + 1)))))) < 1) {
                                                    break label$7;
                                                }
                                                if ((this._loadInt((_33_ + 16))) > ((this._loadInt((_33_ + 20))) + -4)) {
                                                    break label$6;
                                                }
                                                if ((this._loadInt((_33_ + 16))) < ((this._loadInt((_33_ + 12))) + 4)) {
                                                    break label$6;
                                                }
                                                if ((this._storeInt((_33_ + 8), (((this._loadInt8u(((_32_ = (this._loadInt((_33_ + 40))) + (this._loadInt((_33_ + 16)))) + 2))) << 8) | (this._loadInt8u((_32_ + 3)))))) >= (this._loadInt((_33_ + 52)))) {
                                                    break label$11;
                                                }
                                                this._storeInt((_33_ + 12), (this._loadInt((_33_ + 16))));
                                                continue label$10;
                                            }
                                        }
                                        while (false);
                                        if ((this._storeInt((_33_ + 4), ((this._loadInt((_33_ + 8))) - (this._loadInt((_33_ + 52)))))) > 3) {
                                            break label$3;
                                        }
                                        memcpy(((_32_ = this._loadInt((_33_ + 40))) + (this._loadInt((_33_ + 12)))), (_32_ + (this._loadInt((_33_ + 16)))), 2);
                                        this._storeInt8((((this._loadInt((_33_ + 40))) + (this._loadInt((_33_ + 44)))) + 7), ((this._loadInt((_33_ + 36))) + (this._loadInt((_33_ + 4)))));
                                        break label$2;
                                    }
                                    while (false);
                                    this._storeInt((_33_ + 32), ((((((this._loadInt8u(((_32_ = (this._loadInt((_33_ + 40))) + (this._loadInt((_33_ + 44)))) + 5))) << 8) | (this._loadInt8u((_32_ + 6)))) + -1) & 65535) + 1));
                                }
                                while (false);
                                if ((((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 52)))) + 2) <= (this._loadInt((_33_ + 32)))) {
                                    break label$4;
                                }
                                if ((this._storeInt((_33_ + 24), (defragmentPage((this._loadInt((_33_ + 56))))))) == 0) {
                                    break label$5;
                                }
                                this._storeInt((_33_ + 60), (this._loadInt((_33_ + 24))));
                                break label$0;
                            }
                            while (false);
                            this._storeInt((_33_ + 60), (sqlite3CorruptError(48705)));
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_33_ + 32), ((((((this._loadInt8u(((_32_ = (this._loadInt((_33_ + 40))) + (this._loadInt((_33_ + 44)))) + 5))) << 8) | (this._loadInt8u((_32_ + 6)))) + -1) & 65535) + 1));
                    }
                    while (false);
                    _32_ = this._storeInt((_33_ + 32), ((this._loadInt((_33_ + 32))) - (this._loadInt((_33_ + 52)))));
                    this._storeInt8(((_31_ = (this._loadInt((_33_ + 40))) + (this._loadInt((_33_ + 44)))) + 5), (_32_ >>> 8));
                    this._storeInt8((_31_ + 6), _32_);
                    this._storeInt((this._loadInt((_33_ + 48))), _32_);
                    this._storeInt((_33_ + 60), 0);
                    break label$0;
                }
                while (false);
                label$12:
                do {
                    if (((this._loadInt((_33_ + 8))) + (this._loadInt((_33_ + 16)))) <= (this._loadInt((_33_ + 20)))) {
                        break label$12;
                    }
                    this._storeInt((_33_ + 60), (sqlite3CorruptError(48718)));
                    break label$0;
                }
                while (false);
                this._storeInt8(((_32_ = (this._loadInt((_33_ + 40))) + (this._loadInt((_33_ + 16)))) + 2), ((this._storeInt8((_32_ + 3), (this._loadInt((_33_ + 4))))) >>> 8));
            }
            while (false);
            this._storeInt((this._loadInt((_33_ + 48))), ((this._loadInt((_33_ + 16))) + (this._loadInt((_33_ + 4)))));
            this._storeInt((_33_ + 60), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 60));
        this._storeInt((0 + 4), (_33_ + 64));
        return _32_;
    }

    @Override()
    public final int defragmentPage(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 16), (sqlite3PagerTempSpace((this._loadInt((this._loadInt(((this._storeInt((_31_ + 56), _30_)) + 60))))))));
        this._storeInt((_31_ + 20), (this._loadInt(((this._loadInt((_31_ + 56))) + 64))));
        this._storeInt((_31_ + 44), (this._loadInt8u(((this._loadInt((_31_ + 56))) + 5))));
        this._storeInt((_31_ + 32), (this._loadInt16u(((this._loadInt((_31_ + 56))) + 12))));
        this._storeInt((_31_ + 24), (this._loadInt16u(((this._loadInt((_31_ + 56))) + 16))));
        this._storeInt((_31_ + 36), (this._loadInt(((this._loadInt(((this._loadInt((_31_ + 56))) + 60))) + 40))));
        memcpy(((_30_ = this._storeInt((_31_ + 28), (((this._loadInt8u(((_30_ = (this._loadInt((_31_ + 20))) + (this._loadInt((_31_ + 44)))) + 5))) << 8) | (this._loadInt8u((_30_ + 6)))))) + (this._loadInt((_31_ + 16)))), (_30_ + (this._loadInt((_31_ + 20)))), ((this._loadInt((_31_ + 36))) - _30_));
        this._storeInt((_31_ + 28), (this._loadInt((_31_ + 36))));
        this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 32))) + ((this._loadInt((_31_ + 24))) << 1)));
        this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 36))) + -4));
        this._storeInt((_31_ + 52), 0);
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
                            if ((this._loadInt((_31_ + 52))) >= (this._loadInt((_31_ + 24)))) {
                                break label$1;
                            }
                            if ((this._storeInt((_31_ + 48), (((this._loadInt8u((_30_ = this._storeInt((_31_ + 4), ((this._loadInt((_31_ + 20))) + ((this._loadInt((_31_ + 32))) + ((this._loadInt((_31_ + 52))) << 1))))))) << 8) | (this._loadInt8u((_30_ + 1)))))) < (this._loadInt((_31_ + 12)))) {
                                break label$2;
                            }
                            if ((this._loadInt((_31_ + 48))) > (this._loadInt((_31_ + 8)))) {
                                break label$2;
                            }
                            _30_ = this._storeInt((_31_ + 40), (cellSizePtr((this._loadInt((_31_ + 56))), ((this._loadInt((_31_ + 16))) + (this._loadInt((_31_ + 48)))))));
                            if ((this._storeInt((_31_ + 28), ((this._loadInt((_31_ + 28))) - _30_))) < (this._loadInt((_31_ + 12)))) {
                                break label$4;
                            }
                            if (((this._loadInt((_31_ + 48))) + (this._loadInt((_31_ + 40)))) > (this._loadInt((_31_ + 36)))) {
                                break label$4;
                            }
                            memcpy(((this._loadInt((_31_ + 20))) + (this._loadInt((_31_ + 28)))), ((this._loadInt((_31_ + 16))) + (this._loadInt((_31_ + 48)))), (this._loadInt((_31_ + 40))));
                            this._storeInt8((_30_ = this._loadInt((_31_ + 4))), ((this._storeInt8((_30_ + 1), (this._loadInt((_31_ + 28))))) >>> 8));
                            this._storeInt((_31_ + 52), ((this._loadInt((_31_ + 52))) + 1));
                            continue label$3;
                        }
                    }
                    while (false);
                    this._storeInt((_31_ + 60), (sqlite3CorruptError(48629)));
                    break label$0;
                }
                while (false);
                this._storeInt((_31_ + 60), (sqlite3CorruptError(48617)));
                break label$0;
            }
            while (false);
            this._storeInt8(((_30_ = (this._loadInt((_31_ + 20))) + (this._loadInt((_31_ + 44)))) + 5), ((this._storeInt8((_30_ + 6), (this._loadInt((_31_ + 28))))) >>> 8));
            _30_ = this._storeInt8((((this._loadInt((_31_ + 20))) + (this._loadInt((_31_ + 44)))) + 1), 0);
            this._storeInt8((((this._loadInt((_31_ + 20))) + (this._loadInt((_31_ + 44)))) + 2), _30_);
            this._storeInt8((((this._loadInt((_31_ + 20))) + (this._loadInt((_31_ + 44)))) + 7), _30_);
            memset(((this._loadInt((_31_ + 20))) + (_32_ = this._loadInt((_31_ + 12)))), _30_, ((this._loadInt((_31_ + 28))) - _32_));
            label$5:
            do {
                if (((this._loadInt((_31_ + 28))) - (this._loadInt((_31_ + 12)))) == (this._loadInt16u(((this._loadInt((_31_ + 56))) + 14)))) {
                    break label$5;
                }
                this._storeInt((_31_ + 60), (sqlite3CorruptError(48646)));
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 60), _30_);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 60));
        this._storeInt((0 + 4), (_31_ + 64));
        return _30_;
    }

    @Override()
    public final int sqlite3PagerTempSpace(int _30_)
    {
        return (this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 164)));
    }

    @Override()
    public final int freeSpace(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_33_ + 52), _31_);
        this._storeInt((_33_ + 48), _32_);
        this._storeInt((_33_ + 28), (this._loadInt(((this._loadInt((_33_ + 56))) + 64))));
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt(((this._loadInt((_33_ + 56))) + 60))) + 18))) == 0) {
                break label$0;
            }
            memset(((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 52)))), 0, (this._loadInt((_33_ + 48))));
        }
        while (false);
        this._storeInt((_33_ + 44), ((this._storeInt((_33_ + 36), (this._loadInt8u(((this._loadInt((_33_ + 56))) + 5))))) + 1));
        this._storeInt((_33_ + 32), ((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 56))) + 60))) + 40))) + -4));
        label$1:
        do {
            label$2:
            do {
                label$4:
                do {
                    label$3:
                    while (true) {
                        _32_ = 0;
                        label$5:
                        do {
                            if ((this._storeInt((_33_ + 40), (((this._loadInt8u((_31_ = (this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 44)))))) << 8) | (this._loadInt8u((_31_ + 1)))))) >= (this._loadInt((_33_ + 52)))) {
                                break label$5;
                            }
                            _32_ = ((this._loadInt((_33_ + 40))) > 0) ? 1 : 0;
                        }
                        while (false);
                        if (_32_ == 0) {
                            break label$2;
                        }
                        if ((this._loadInt((_33_ + 40))) < ((this._loadInt((_33_ + 44))) + 4)) {
                            break label$4;
                        }
                        this._storeInt((_33_ + 44), (this._loadInt((_33_ + 40))));
                        continue label$3;
                    }
                }
                while (false);
                this._storeInt((_33_ + 60), (sqlite3CorruptError(48796)));
                break label$1;
            }
            while (false);
            label$6:
            do {
                if ((this._loadInt((_33_ + 40))) <= (this._loadInt((_33_ + 32)))) {
                    break label$6;
                }
                this._storeInt((_33_ + 60), (sqlite3CorruptError(48801)));
                break label$1;
            }
            while (false);
            this._storeInt8(((this._loadInt((_33_ + 28))) + (_32_ = this._loadInt((_33_ + 44)))), ((_31_ = this._loadInt((_33_ + 52))) >>> 8));
            this._storeInt8(((_32_ + (this._loadInt((_33_ + 28)))) + 1), _31_);
            this._storeInt8(((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 52)))), ((this._loadInt((_33_ + 40))) >>> 8));
            this._storeInt8((((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 52)))) + 1), (this._loadInt((_33_ + 40))));
            this._storeInt8((((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 52)))) + 2), ((this._loadInt((_33_ + 48))) >>> 8));
            this._storeInt8((((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 52)))) + 3), (this._loadInt((_33_ + 48))));
            this._storeInt16(((_32_ = this._loadInt((_33_ + 56))) + 14), ((this._loadInt16u((_32_ + 14))) + (this._loadInt((_33_ + 48)))));
            this._storeInt((_33_ + 44), ((this._loadInt((_33_ + 36))) + 1));
            label$7:
            do {
                label$9:
                do {
                    label$8:
                    while (true) {
                        if ((this._storeInt((_33_ + 40), (((this._loadInt8u((_32_ = (this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 44)))))) << 8) | (this._loadInt8u((_32_ + 1)))))) < 1) {
                            break label$9;
                        }
                        this._storeInt((_33_ + 24), (((this._loadInt8u((_32_ = (this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 40)))))) << 8) | (this._loadInt8u((_32_ + 1)))));
                        label$10:
                        do {
                            label$11:
                            do {
                                if ((((this._storeInt((_33_ + 20), (((this._loadInt8u(((_32_ = (this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 40)))) + 2))) << 8) | (this._loadInt8u((_32_ + 3)))))) + (this._loadInt((_33_ + 40)))) + 3) < (this._loadInt((_33_ + 24)))) {
                                    break label$11;
                                }
                                if ((this._loadInt((_33_ + 24))) >= 1) {
                                    break label$10;
                                }
                            }
                            while (false);
                            this._storeInt((_33_ + 44), (this._loadInt((_33_ + 40))));
                            continue label$8;
                        }
                        while (false);
                        if ((this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 24))) - ((this._loadInt((_33_ + 40))) + (this._loadInt((_33_ + 20))))))) < 0) {
                            break label$7;
                        }
                        if ((this._loadInt((_33_ + 12))) > (this._loadInt8u((((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 36)))) + 7)))) {
                            break label$7;
                        }
                        this._storeInt8((_32_ = ((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 36)))) + 7), ((this._loadInt8u(_32_)) - (this._loadInt((_33_ + 12)))));
                        this._storeInt((_33_ + 16), (((_31_ = this._loadInt8u((_32_ = (this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 24)))))) << 8) | (_32_ = this._loadInt8u((_32_ + 1)))));
                        this._storeInt8(((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 40)))), _31_);
                        this._storeInt8((((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 40)))) + 1), _32_);
                        _32_ = this._storeInt((_33_ + 16), (((_32_ = this._loadInt((_33_ + 24))) + (((this._loadInt8u(((_32_ = _32_ + (this._loadInt((_33_ + 28)))) + 2))) << 8) | (this._loadInt8u((_32_ + 3))))) - (this._loadInt((_33_ + 40)))));
                        this._storeInt8((((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 40)))) + 2), (_32_ >>> 8));
                        this._storeInt8((((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 40)))) + 3), _32_);
                        continue label$8;
                    }
                }
                while (false);
                label$12:
                do {
                    if ((this._loadInt8u(((_32_ = (this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 36)))) + 1))) != (this._loadInt8u((_32_ + 5)))) {
                        break label$12;
                    }
                    if ((this._loadInt8u(((_32_ = (this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 36)))) + 2))) != (this._loadInt8u((_32_ + 6)))) {
                        break label$12;
                    }
                    _32_ = this._storeInt((_33_ + 40), (((this._loadInt8u(((_32_ = (this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 36)))) + 1))) << 8) | (this._loadInt8u((_32_ + 2)))));
                    memcpy((((_31_ = this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 36)))) + 1), (_31_ + _32_), 2);
                    _32_ = this._storeInt((_33_ + 8), ((((this._loadInt8u(((_31_ = (_32_ = this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 36)))) + 5))) << 8) | (this._loadInt8u((_31_ + 6)))) + (((this._loadInt8u(((_32_ = _32_ + (this._loadInt((_33_ + 40)))) + 2))) << 8) | (this._loadInt8u((_32_ + 3))))));
                    this._storeInt8((((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 36)))) + 5), (_32_ >>> 8));
                    this._storeInt8((((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 36)))) + 6), (this._loadInt((_33_ + 8))));
                }
                while (false);
                this._storeInt((_33_ + 60), 0);
                break label$1;
            }
            while (false);
            this._storeInt((_33_ + 60), (sqlite3CorruptError(48820)));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 60));
        this._storeInt((0 + 4), (_33_ + 64));
        return _32_;
    }

    @Override()
    public final int fillInCell(
            int _30_,
            int _31_,
            int _32_,
            long _33_,
            int _34_,
            int _35_,
            int _36_,
            int _37_)
    {
        int _38_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_38_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 144))) + 136), _30_);
        this._storeInt((_38_ + 132), _31_);
        this._storeInt((_38_ + 128), _32_);
        this._storeLong((_38_ + 120), _33_);
        this._storeInt((_38_ + 116), _34_);
        this._storeInt((_38_ + 112), _35_);
        this._storeInt((_38_ + 108), _36_);
        this._storeInt((_38_ + 104), _37_);
        _37_ = this._storeInt((_38_ + 72), (this._storeInt((_38_ + 76), 0)));
        this._storeInt((_38_ + 60), (this._loadInt(((this._loadInt((_38_ + 136))) + 60))));
        this._storeInt((_38_ + 52), (this._storeInt((_38_ + 56), _37_)));
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_38_ + 136))) + 3))) != 0) {
                break label$0;
            }
            this._storeInt((_38_ + 52), ((this._loadInt((_38_ + 52))) + 4));
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_38_ + 136))) + 4))) == 0) {
                    break label$2;
                }
                this._storeInt((_38_ + 52), ((sqlite3PutVarint(((this._loadInt((_38_ + 132))) + (this._loadInt((_38_ + 52)))), ((long) ((this._loadInt((_38_ + 112))) + (this._loadInt((_38_ + 108))))))) + (this._loadInt((_38_ + 52)))));
                break label$1;
            }
            while (false);
            this._storeInt((_38_ + 112), (this._storeInt((_38_ + 108), 0)));
        }
        while (false);
        this._storeInt((_38_ + 52), ((sqlite3PutVarint(((this._loadInt((_38_ + 132))) + (this._loadInt((_38_ + 52)))), (this._loadLong((_38_ + 120))))) + (this._loadInt((_38_ + 52)))));
        btreeParseCellPtr((this._loadInt((_38_ + 136))), (this._loadInt((_38_ + 132))), (_38_ + 16));
        this._storeInt((_38_ + 100), ((this._loadInt((_38_ + 112))) + (this._loadInt((_38_ + 108)))));
        label$3:
        do {
            label$4:
            do {
                label$5:
                do {
                    if ((this._loadInt8u(((this._loadInt((_38_ + 136))) + 2))) == 0) {
                        break label$5;
                    }
                    this._storeInt((_38_ + 96), (this._loadInt((_38_ + 116))));
                    this._storeInt((_38_ + 92), (this._loadInt((_38_ + 112))));
                    this._storeInt((_38_ + 112), 0);
                    break label$4;
                }
                while (false);
                label$6:
                do {
                    if ((this._loadLong((_38_ + 120))) > 2147483647L) {
                        break label$6;
                    }
                    if ((this._loadInt((_38_ + 128))) == 0) {
                        break label$6;
                    }
                    this._storeInt((_38_ + 100), ((this._loadInt((_38_ + 100))) + (this._loadInt((_38_ + 120)))));
                    this._storeInt((_38_ + 96), (this._loadInt((_38_ + 128))));
                    this._storeLong32((_38_ + 92), (this._loadLong((_38_ + 120))));
                    break label$4;
                }
                while (false);
                this._storeInt((_38_ + 140), (sqlite3CorruptError(52799)));
                break label$3;
            }
            while (false);
            this._storeInt((this._loadInt((_38_ + 104))), (this._loadInt16u((_38_ + 42))));
            this._storeInt((_38_ + 80), (this._loadInt16u((_38_ + 38))));
            this._storeInt((_38_ + 64), ((this._loadInt((_38_ + 132))) + (this._loadInt((_38_ + 52)))));
            this._storeInt((_38_ + 68), ((this._loadInt((_38_ + 132))) + (this._loadInt16u((_38_ + 40)))));
            label$7:
            do {
                label$9:
                do {
                    label$8:
                    while (true) {
                        if ((this._loadInt((_38_ + 100))) < 1) {
                            break label$9;
                        }
                        label$10:
                        do {
                            if ((this._loadInt((_38_ + 80))) != 0) {
                                break label$10;
                            }
                            this._storeInt((_38_ + 12), (this._loadInt((_38_ + 56))));
                            label$11:
                            do {
                                if ((this._loadInt8u(((this._loadInt((_38_ + 60))) + 21))) == 0) {
                                    break label$11;
                                }
                                label$12$end:
                                do {
                                    label$12:
                                    while (true) {
                                        _37_ = 1;
                                        _36_ = this._storeInt((_38_ + 56), ((this._loadInt((_38_ + 56))) + 1));
                                        label$14:
                                        do {
                                            if ((ptrmapPageno((this._loadInt((_38_ + 60))), _36_)) == (this._loadInt((_38_ + 56)))) {
                                                break label$14;
                                            }
                                            _37_ = ((this._loadInt((_38_ + 56))) == (((this._loadInt((0 + 22332))) / (this._loadInt(((this._loadInt((_38_ + 60))) + 36)))) + 1)) ? 1 : 0;
                                        }
                                        while (false);
                                        if (_37_ != 0) {
                                            continue label$12;
                                        }
                                        break label$12$end;
                                    }
                                }
                                while (false);
                            }
                            while (false);
                            this._storeInt((_38_ + 84), (allocateBtreePage((this._loadInt((_38_ + 60))), (_38_ + 76), (_38_ + 56), (this._loadInt((_38_ + 56))), 0)));
                            label$15:
                            do {
                                if ((this._loadInt8u(((this._loadInt((_38_ + 60))) + 21))) == 0) {
                                    break label$15;
                                }
                                if ((this._loadInt((_38_ + 84))) != 0) {
                                    break label$15;
                                }
                                _temp$0 = 4;
                                _temp$1 = 3;
                                _temp$2 = ((this._loadInt((_38_ + 12))) != 0) ? _temp$0 : _temp$1;
                                this._storeInt8((_38_ + 11), _temp$2);
                                ptrmapPut((this._loadInt((_38_ + 60))), (this._loadInt((_38_ + 56))), (this._loadInt8u((_38_ + 11))), (this._loadInt((_38_ + 12))), (_38_ + 84));
                                if ((this._loadInt((_38_ + 84))) == 0) {
                                    break label$15;
                                }
                                releasePage((this._loadInt((_38_ + 76))));
                            }
                            while (false);
                            if ((this._loadInt((_38_ + 84))) != 0) {
                                break label$7;
                            }
                            sqlite3Put4byte((this._loadInt((_38_ + 68))), (this._loadInt((_38_ + 56))));
                            releasePage((this._loadInt((_38_ + 72))));
                            this._storeInt((_38_ + 72), (this._loadInt((_38_ + 76))));
                            sqlite3Put4byte((this._storeInt((_38_ + 68), (this._loadInt(((this._loadInt((_38_ + 76))) + 64))))), 0);
                            this._storeInt((_38_ + 64), ((this._loadInt(((this._loadInt((_38_ + 76))) + 64))) + 4));
                            this._storeInt((_38_ + 80), ((this._loadInt(((this._loadInt((_38_ + 60))) + 40))) + -4));
                        }
                        while (false);
                        label$16:
                        do {
                            if ((this._storeInt((_38_ + 88), (this._loadInt((_38_ + 100))))) <= (this._loadInt((_38_ + 80)))) {
                                break label$16;
                            }
                            this._storeInt((_38_ + 88), (this._loadInt((_38_ + 80))));
                        }
                        while (false);
                        label$17:
                        do {
                            label$18:
                            do {
                                if ((this._loadInt((_38_ + 92))) < 1) {
                                    break label$18;
                                }
                                label$19:
                                do {
                                    if ((this._loadInt((_38_ + 88))) <= (this._loadInt((_38_ + 92)))) {
                                        break label$19;
                                    }
                                    this._storeInt((_38_ + 88), (this._loadInt((_38_ + 92))));
                                }
                                while (false);
                                memcpy((this._loadInt((_38_ + 64))), (this._loadInt((_38_ + 96))), (this._loadInt((_38_ + 88))));
                                break label$17;
                            }
                            while (false);
                            memset((this._loadInt((_38_ + 64))), 0, (this._loadInt((_38_ + 88))));
                        }
                        while (false);
                        this._storeInt((_38_ + 100), ((this._loadInt((_38_ + 100))) - (this._loadInt((_38_ + 88)))));
                        this._storeInt((_38_ + 64), ((this._loadInt((_38_ + 64))) + (this._loadInt((_38_ + 88)))));
                        this._storeInt((_38_ + 96), ((this._loadInt((_38_ + 96))) + (this._loadInt((_38_ + 88)))));
                        this._storeInt((_38_ + 92), ((this._loadInt((_38_ + 92))) - (this._loadInt((_38_ + 88)))));
                        this._storeInt((_38_ + 80), ((this._loadInt((_38_ + 80))) - (this._loadInt((_38_ + 88)))));
                        if ((this._loadInt((_38_ + 92))) != 0) {
                            continue label$8;
                        }
                        this._storeInt((_38_ + 92), (this._loadInt((_38_ + 112))));
                        this._storeInt((_38_ + 96), (this._loadInt((_38_ + 116))));
                        continue label$8;
                    }
                }
                while (false);
                releasePage((this._loadInt((_38_ + 72))));
                this._storeInt((_38_ + 140), 0);
                break label$3;
            }
            while (false);
            releasePage((this._loadInt((_38_ + 72))));
            this._storeInt((_38_ + 140), (this._loadInt((_38_ + 84))));
        }
        while (false);
        _37_ = this._loadInt((_38_ + 140));
        this._storeInt((0 + 4), (_38_ + 144));
        return _37_;
    }

    @Override()
    public final int moveToRightmost(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt(_32_, (this._storeInt((_32_ + 4), 0)));
        label$1:
        do {
            label$0:
            while (true) {
                _30_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_32_ + 4))) != 0) {
                        break label$2;
                    }
                    _30_ = ((this._loadInt8u(((this._storeInt(_32_, (this._loadInt((((_30_ = this._loadInt((_32_ + 12))) + ((this._loadInt16s((_30_ + 90))) << 2)) + 132))))) + 3))) == 0) ? 1 : 0;
                }
                while (false);
                if (_30_ == 0) {
                    break label$1;
                }
                _31_ = this._storeInt((_32_ + 8), (sqlite3Get4byte((((this._loadInt(((_30_ = this._loadInt(_32_)) + 64))) + (this._loadInt8u((_30_ + 5)))) + 8))));
                this._storeInt16((((_30_ = this._loadInt((_32_ + 12))) + ((this._loadInt16s((_30_ + 90))) << 1)) + 92), (this._loadInt16u(((this._loadInt(_32_)) + 16))));
                this._storeInt((_32_ + 4), (moveToChild(_30_, _31_)));
                continue label$0;
            }
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt((_32_ + 4))) != 0) {
                break label$3;
            }
            this._storeInt16((((_30_ = this._loadInt((_32_ + 12))) + ((this._loadInt16s((_30_ + 90))) << 1)) + 92), ((this._loadInt16u(((this._loadInt(_32_)) + 16))) + -1));
            _30_ = this._storeInt16(((this._loadInt((_32_ + 12))) + 58), 0);
            this._storeInt8(((this._loadInt((_32_ + 12))) + 82), _30_);
        }
        while (false);
        _30_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _30_;
    }

    @Override()
    public final void moveToParent(int _30_)
    {
        int _31_ = 0;
        releasePage((this._loadInt((((_30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + ((this._loadInt16s((_30_ + 90))) << 2)) + 132))));
        this._storeInt16(((_30_ = this._loadInt((_31_ + 12))) + 58), (this._storeInt8((_30_ + 82), 0)));
        this._storeInt16((_30_ + 90), ((this._loadInt16u((_30_ + 90))) + -1));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int moveToLeftmost(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_31_ + 4), 0);
        label$1:
        do {
            label$0:
            while (true) {
                _30_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_31_ + 4))) != 0) {
                        break label$2;
                    }
                    _30_ = ((this._loadInt8u(((this._storeInt(_31_, (this._loadInt((((_30_ = this._loadInt((_31_ + 12))) + ((this._loadInt16s((_30_ + 90))) << 2)) + 132))))) + 3))) == 0) ? 1 : 0;
                }
                while (false);
                if (_30_ == 0) {
                    break label$1;
                }
                _30_ = this._storeInt((_31_ + 8), (sqlite3Get4byte(((_32_ = this._loadInt(((_30_ = this._loadInt(_31_)) + 64))) + ((this._loadInt16u((_30_ + 18))) & (((this._loadInt8u((_30_ = _32_ + ((this._loadInt16u((_30_ + 12))) + ((this._loadInt16u((((_30_ = this._loadInt((_31_ + 12))) + ((this._loadInt16s((_30_ + 90))) << 1)) + 92))) << 1))))) << 8) | (this._loadInt8u((_30_ + 1)))))))));
                this._storeInt((_31_ + 4), (moveToChild((this._loadInt((_31_ + 12))), _30_)));
                continue label$0;
            }
        }
        while (false);
        _30_ = this._loadInt((_31_ + 4));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int btreeCreateTable(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_33_ + 52), _31_);
        this._storeInt((_33_ + 48), _32_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt8u(((this._storeInt((_33_ + 44), (this._loadInt(((this._loadInt((_33_ + 56))) + 4))))) + 21))) == 0) {
                            break label$3;
                        }
                        invalidateAllOverflowCache((this._loadInt((_33_ + 44))));
                        sqlite3BtreeGetMeta((this._loadInt((_33_ + 56))), 4, (_33_ + 36));
                        this._storeInt((_33_ + 36), ((this._loadInt((_33_ + 36))) + 1));
                        label$5:
                        do {
                            label$4:
                            while (true) {
                                _32_ = 1;
                                label$6:
                                do {
                                    if ((_31_ = this._loadInt((_33_ + 36))) == (ptrmapPageno((this._loadInt((_33_ + 44))), _31_))) {
                                        break label$6;
                                    }
                                    _32_ = ((this._loadInt((_33_ + 36))) == (((this._loadInt((0 + 22332))) / (this._loadInt(((this._loadInt((_33_ + 44))) + 36)))) + 1)) ? 1 : 0;
                                }
                                while (false);
                                if (_32_ == 0) {
                                    break label$5;
                                }
                                this._storeInt((_33_ + 36), ((this._loadInt((_33_ + 36))) + 1));
                                continue label$4;
                            }
                        }
                        while (false);
                        if ((this._storeInt((_33_ + 32), (allocateBtreePage((this._loadInt((_33_ + 44))), (_33_ + 20), (_33_ + 24), (this._loadInt((_33_ + 36))), 1)))) == 0) {
                            break label$2;
                        }
                        this._storeInt((_33_ + 60), (this._loadInt((_33_ + 32))));
                        break label$0;
                    }
                    while (false);
                    if ((this._storeInt((_33_ + 32), (allocateBtreePage((this._loadInt((_33_ + 44))), (_33_ + 40), (_33_ + 36), 1, 0)))) == 0) {
                        break label$1;
                    }
                    this._storeInt((_33_ + 60), (this._loadInt((_33_ + 32))));
                    break label$0;
                }
                while (false);
                label$7:
                do {
                    label$8:
                    do {
                        label$9:
                        do {
                            if ((this._loadInt((_33_ + 24))) == (this._loadInt((_33_ + 36)))) {
                                break label$9;
                            }
                            _32_ = this._storeInt((_33_ + 12), (this._storeInt8((_33_ + 19), 0)));
                            releasePage((this._loadInt((_33_ + 20))));
                            if ((this._storeInt((_33_ + 32), (btreeGetPage((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 36))), (_33_ + 40), _32_)))) == 0) {
                                break label$8;
                            }
                            this._storeInt((_33_ + 60), (this._loadInt((_33_ + 32))));
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_33_ + 40), (this._loadInt((_33_ + 20))));
                        break label$7;
                    }
                    while (false);
                    this._storeInt((_33_ + 32), (ptrmapGet((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 36))), (_33_ + 19), (_33_ + 12))));
                    label$10:
                    do {
                        label$11:
                        do {
                            if ((this._loadInt8u((_33_ + 19))) == 1) {
                                break label$11;
                            }
                            if ((this._loadInt8u((_33_ + 19))) != 2) {
                                break label$10;
                            }
                        }
                        while (false);
                        this._storeInt((_33_ + 32), (sqlite3CorruptError(54515)));
                    }
                    while (false);
                    label$12:
                    do {
                        if ((this._loadInt((_33_ + 32))) == 0) {
                            break label$12;
                        }
                        releasePage((this._loadInt((_33_ + 40))));
                        this._storeInt((_33_ + 60), (this._loadInt((_33_ + 32))));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_33_ + 32), (relocatePage((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 40))), (this._loadInt8u((_33_ + 19))), (this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 24))), 0)));
                    releasePage((this._loadInt((_33_ + 40))));
                    label$13:
                    do {
                        if ((this._loadInt((_33_ + 32))) == 0) {
                            break label$13;
                        }
                        this._storeInt((_33_ + 60), (this._loadInt((_33_ + 32))));
                        break label$0;
                    }
                    while (false);
                    label$14:
                    do {
                        if ((this._storeInt((_33_ + 32), (btreeGetPage((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 36))), (_33_ + 40), 0)))) == 0) {
                            break label$14;
                        }
                        this._storeInt((_33_ + 60), (this._loadInt((_33_ + 32))));
                        break label$0;
                    }
                    while (false);
                    if ((this._storeInt((_33_ + 32), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_33_ + 40))) + 68))))))) == 0) {
                        break label$7;
                    }
                    releasePage((this._loadInt((_33_ + 40))));
                    this._storeInt((_33_ + 60), (this._loadInt((_33_ + 32))));
                    break label$0;
                }
                while (false);
                ptrmapPut((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 36))), 1, 0, (_33_ + 32));
                label$15:
                do {
                    if ((this._loadInt((_33_ + 32))) == 0) {
                        break label$15;
                    }
                    releasePage((this._loadInt((_33_ + 40))));
                    this._storeInt((_33_ + 60), (this._loadInt((_33_ + 32))));
                    break label$0;
                }
                while (false);
                if ((this._storeInt((_33_ + 32), (sqlite3BtreeUpdateMeta((this._loadInt((_33_ + 56))), 4, (this._loadInt((_33_ + 36))))))) == 0) {
                    break label$1;
                }
                releasePage((this._loadInt((_33_ + 40))));
                this._storeInt((_33_ + 60), (this._loadInt((_33_ + 32))));
                break label$0;
            }
            while (false);
            label$16:
            do {
                label$17:
                do {
                    if (((this._loadInt8u((_33_ + 48))) & 1) == 0) {
                        break label$17;
                    }
                    this._storeInt((_33_ + 28), 13);
                    break label$16;
                }
                while (false);
                this._storeInt((_33_ + 28), 10);
            }
            while (false);
            zeroPage((this._loadInt((_33_ + 40))), (this._loadInt((_33_ + 28))));
            sqlite3PagerUnref((this._loadInt(((this._loadInt((_33_ + 40))) + 68))));
            this._storeInt((this._loadInt((_33_ + 52))), (this._loadInt((_33_ + 36))));
            this._storeInt((_33_ + 60), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 60));
        this._storeInt((0 + 4), (_33_ + 64));
        return _32_;
    }

    @Override()
    public final int btreeCursor(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_35_ + 20), _31_);
        this._storeInt((_35_ + 16), _32_);
        this._storeInt((_35_ + 12), _33_);
        this._storeInt((_35_ + 8), _34_);
        this._storeInt((_35_ + 4), (this._loadInt(((this._loadInt((_35_ + 24))) + 4))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_35_ + 16))) == 0) {
                    break label$1;
                }
                if ((this._loadInt8u(((this._loadInt((_35_ + 4))) + 16))) == 0) {
                    break label$1;
                }
                this._storeInt((_35_ + 28), 8);
                break label$0;
            }
            while (false);
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt((_35_ + 20))) != 1) {
                        break label$3;
                    }
                    if ((btreePagecount((this._loadInt((_35_ + 4))))) == 0) {
                        break label$2;
                    }
                }
                while (false);
                this._storeInt16(((_34_ = this._loadInt((_35_ + 8))) + 90), 65535);
                this._storeInt((_34_ + 20), (this._loadInt((_35_ + 20))));
                this._storeInt((_34_ + 16), (this._loadInt((_35_ + 12))));
                this._storeInt((this._loadInt((_35_ + 8))), (this._loadInt((_35_ + 24))));
                this._storeInt(((this._loadInt((_35_ + 8))) + 4), (this._loadInt((_35_ + 4))));
                this._storeInt8(((this._loadInt((_35_ + 8))) + 80), (this._loadInt((_35_ + 16))));
                this._storeInt(((this._loadInt((_35_ + 8))) + 8), (this._loadInt(((this._loadInt((_35_ + 4))) + 8))));
                label$4:
                do {
                    if ((this._loadInt(((this._loadInt((_35_ + 8))) + 8))) == 0) {
                        break label$4;
                    }
                    this._storeInt(((this._loadInt(((_34_ = this._loadInt((_35_ + 8))) + 8))) + 12), _34_);
                }
                while (false);
                this._storeLong(((_34_ = this._storeInt(((this._loadInt((_35_ + 4))) + 8), (this._loadInt((_35_ + 8))))) + 24), 0L);
                this._storeInt((_35_ + 28), (this._storeInt8((_34_ + 83), 0)));
                break label$0;
            }
            while (false);
            this._storeInt((_35_ + 28), 16);
        }
        while (false);
        _34_ = this._loadInt((_35_ + 28));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3BtreeCursorSize()
    {
        return 216;
    }

    @Override()
    public final void sqlite3BtreeCursorZero(int _30_)
    {
        int _31_ = 0;
        memset((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 0, 90);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int fetchPayload(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 12), (this._loadInt((((_32_ = this._loadInt((_33_ + 28))) + ((this._loadInt16s((_32_ + 90))) << 2)) + 132))));
        label$0:
        do {
            if ((this._loadInt16u(((this._loadInt((_33_ + 28))) + 58))) != 0) {
                break label$0;
            }
            btreeParseCell((this._loadInt((((_32_ = this._loadInt((_33_ + 28))) + ((_31_ = this._loadInt16s((_32_ + 90))) << 2)) + 132))), (this._loadInt16u(((_32_ + (_31_ << 1)) + 92))), (_32_ + 32));
        }
        while (false);
        this._storeInt((_33_ + 16), ((this._storeInt((_33_ + 16), (this._loadInt(((this._loadInt((_33_ + 28))) + 40))))) + (this._loadInt16u(((this._loadInt((_33_ + 28))) + 52)))));
        label$1:
        do {
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 12))) + 2))) == 0) {
                    break label$2;
                }
                this._storeInt((_33_ + 8), 0);
                break label$1;
            }
            while (false);
            this._storeLong32((_33_ + 8), (this._loadLong(((this._loadInt((_33_ + 28))) + 32))));
        }
        while (false);
        label$3:
        do {
            label$4:
            do {
                if ((this._loadInt((_33_ + 20))) == 0) {
                    break label$4;
                }
                this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + (this._loadInt((_33_ + 8)))));
                this._storeInt((_33_ + 4), ((this._loadInt16u(((this._loadInt((_33_ + 28))) + 54))) - (this._loadInt((_33_ + 8)))));
                break label$3;
            }
            while (false);
            this._storeInt((_33_ + 4), (this._loadInt16u(((this._loadInt((_33_ + 28))) + 54))));
        }
        while (false);
        this._storeInt((this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 4))));
        _32_ = this._loadInt((_33_ + 16));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int sqlite3BtreeCursorHasMoved(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        _31_ = 0;
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_32_ + 8))) + 83))) < 2) {
                break label$0;
            }
            _31_ = btreeRestoreCursorPosition((this._loadInt((_32_ + 8))));
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                if ((this._storeInt(_32_, _31_)) == 0) {
                    break label$2;
                }
                this._storeInt((this._loadInt((_32_ + 4))), 1);
                this._storeInt((_32_ + 12), (this._loadInt(_32_)));
                break label$1;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    label$5:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_32_ + 8))) + 83))) != 1) {
                            break label$5;
                        }
                        if ((this._loadInt(((this._loadInt((_32_ + 8))) + 76))) == 0) {
                            break label$4;
                        }
                    }
                    while (false);
                    this._storeInt((this._loadInt((_32_ + 4))), 1);
                    break label$3;
                }
                while (false);
                this._storeInt((this._loadInt((_32_ + 4))), 0);
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
    public final int sqlite3OpcodeName(int _30_)
    {
        return (this._loadInt((((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) << 2) + 57232)));
    }

    @Override()
    public final int displayP4(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _34_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 192))) + 188), _30_);
        this._storeInt((_33_ + 184), _31_);
        this._storeInt((_33_ + 180), _32_);
        this._storeInt((_33_ + 176), (this._loadInt((_33_ + 184))));
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
                                                            if (((_32_ = (this._loadInt8s(((this._loadInt((_33_ + 188))) + 1))) + 18) & 4294967295L) > (14 & 4294967295L)) {
                                                                break label$12;
                                                            }
                                                            label$13:
                                                            do {
                                                                label$14:
                                                                do {
                                                                    switch (_32_) {
                                                                        case 0: {
                                                                            break label$13;
                                                                        }
                                                                        case 1:
                                                                        case 12: {
                                                                            break label$14;
                                                                        }
                                                                        case 2:
                                                                        case 7:
                                                                        case 9:
                                                                        case 11: {
                                                                            break label$12;
                                                                        }
                                                                        case 3: {
                                                                            break label$11;
                                                                        }
                                                                        case 4: {
                                                                            break label$10;
                                                                        }
                                                                        case 5: {
                                                                            break label$9;
                                                                        }
                                                                        case 6: {
                                                                            break label$8;
                                                                        }
                                                                        case 8: {
                                                                            break label$7;
                                                                        }
                                                                        case 10: {
                                                                            break label$6;
                                                                        }
                                                                        case 13: {
                                                                            break label$5;
                                                                        }
                                                                        case 14: {
                                                                            break label$4;
                                                                        }
                                                                        default: {
                                                                            break label$13;
                                                                        }
                                                                    }
                                                                }
                                                                while (false);
                                                                _32_ = this._storeInt((_33_ + 164), (this._loadInt(((this._loadInt((_33_ + 188))) + 16))));
                                                                _31_ = this._loadInt((_33_ + 184));
                                                                _30_ = this._loadInt((_33_ + 180));
                                                                this._storeInt(_33_, (this._loadInt16u((_32_ + 6))));
                                                                sqlite3_snprintf(_30_, _31_, 57072, _33_);
                                                                this._storeInt((_33_ + 172), (sqlite3Strlen30((this._loadInt((_33_ + 184))))));
                                                                this._storeInt((_33_ + 168), 0);
                                                                label$15:
                                                                while (true) {
                                                                    if ((this._loadInt((_33_ + 168))) >= (this._loadInt16u(((this._loadInt((_33_ + 164))) + 6)))) {
                                                                        break label$2;
                                                                    }
                                                                    label$17:
                                                                    do {
                                                                        label$18:
                                                                        do {
                                                                            if ((this._storeInt((_33_ + 160), (this._loadInt((((this._loadInt((_33_ + 164))) + ((this._loadInt((_33_ + 168))) << 2)) + 12))))) == 0) {
                                                                                break label$18;
                                                                            }
                                                                            if (((this._storeInt((_33_ + 156), (sqlite3Strlen30((this._loadInt((this._loadInt((_33_ + 160))))))))) + (this._loadInt((_33_ + 172)))) > ((this._loadInt((_33_ + 180))) + -6)) {
                                                                                break label$3;
                                                                            }
                                                                            this._storeInt((_33_ + 172), ((_32_ = this._loadInt((_33_ + 172))) + 1));
                                                                            this._storeInt8((_32_ + (this._loadInt((_33_ + 184)))), 44);
                                                                            label$19:
                                                                            do {
                                                                                if ((this._loadInt(((this._loadInt((_33_ + 164))) + 8))) == 0) {
                                                                                    break label$19;
                                                                                }
                                                                                if ((this._loadInt8u(((this._loadInt(((this._loadInt((_33_ + 164))) + 8))) + (this._loadInt((_33_ + 168)))))) == 0) {
                                                                                    break label$19;
                                                                                }
                                                                                this._storeInt((_33_ + 172), ((_32_ = this._loadInt((_33_ + 172))) + 1));
                                                                                this._storeInt8((_32_ + (this._loadInt((_33_ + 184)))), 45);
                                                                            }
                                                                            while (false);
                                                                            memcpy(((this._loadInt((_33_ + 184))) + (this._loadInt((_33_ + 172)))), (this._loadInt((this._loadInt((_33_ + 160))))), ((this._loadInt((_33_ + 156))) + 1));
                                                                            this._storeInt((_33_ + 172), ((this._loadInt((_33_ + 172))) + (this._loadInt((_33_ + 156)))));
                                                                            break label$17;
                                                                        }
                                                                        while (false);
                                                                        if (((this._loadInt((_33_ + 172))) + 4) >= ((this._loadInt((_33_ + 180))) + -6)) {
                                                                            break label$17;
                                                                        }
                                                                        memcpy(((this._loadInt((_33_ + 184))) + (this._loadInt((_33_ + 172)))), 57104, 4);
                                                                        this._storeInt((_33_ + 172), ((this._loadInt((_33_ + 172))) + 4));
                                                                    }
                                                                    while (false);
                                                                    this._storeInt((_33_ + 168), ((this._loadInt((_33_ + 168))) + 1));
                                                                    continue label$15;
                                                                }
                                                            }
                                                            while (false);
                                                            sqlite3_snprintf((this._loadInt((_33_ + 180))), (this._loadInt((_33_ + 184))), 57216, 0);
                                                            break label$0;
                                                        }
                                                        while (false);
                                                        if ((this._storeInt((_33_ + 176), (this._loadInt(((this._loadInt((_33_ + 188))) + 16))))) != 0) {
                                                            break label$0;
                                                        }
                                                        this._storeInt((_33_ + 176), (this._loadInt((_33_ + 184))));
                                                        this._storeInt8((this._loadInt((_33_ + 184))), 0);
                                                        break label$0;
                                                    }
                                                    while (false);
                                                    sqlite3_snprintf((this._loadInt((_33_ + 180))), (this._loadInt((_33_ + 184))), 57200, 0);
                                                    break label$0;
                                                }
                                                while (false);
                                                _32_ = this._loadInt((_33_ + 184));
                                                _31_ = this._loadInt((_33_ + 180));
                                                this._storeInt((_33_ + 64), (this._loadInt(((this._loadInt((_33_ + 188))) + 16))));
                                                sqlite3_snprintf(_31_, _32_, 57152, (_33_ + 64));
                                                break label$0;
                                            }
                                            while (false);
                                            _32_ = this._loadInt((_33_ + 184));
                                            _31_ = this._loadInt((_33_ + 180));
                                            this._storeLong((_33_ + 48), (this._loadLong((this._loadInt(((this._loadInt((_33_ + 188))) + 16))))));
                                            sqlite3_snprintf(_31_, _32_, 26448, (_33_ + 48));
                                            break label$0;
                                        }
                                        while (false);
                                        _32_ = this._loadInt((_33_ + 184));
                                        _31_ = this._loadInt((_33_ + 180));
                                        this._storeDouble((_33_ + 80), (this._loadDouble((this._loadInt(((this._loadInt((_33_ + 188))) + 16))))));
                                        sqlite3_snprintf(_31_, _32_, 27040, (_33_ + 80));
                                        break label$0;
                                    }
                                    while (false);
                                    _32_ = this._storeInt((_33_ + 140), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 188))) + 16))) + 8))));
                                    _31_ = this._loadInt((_33_ + 184));
                                    _30_ = this._loadInt((_33_ + 180));
                                    this._storeInt((_33_ + 132), (this._loadInt(_32_)));
                                    this._storeInt((_33_ + 128), _32_);
                                    sqlite3_snprintf(_30_, _31_, 57184, (_33_ + 128));
                                    break label$0;
                                }
                                while (false);
                                if (((this._loadInt16u(((this._storeInt((_33_ + 144), (this._loadInt(((this._loadInt((_33_ + 188))) + 16))))) + 28))) & 2) == 0) {
                                    break label$1;
                                }
                                this._storeInt((_33_ + 176), (this._loadInt(((this._loadInt((_33_ + 144))) + 4))));
                                break label$0;
                            }
                            while (false);
                            _31_ = this._loadInt(((_32_ = this._storeInt((_33_ + 148), (this._loadInt(((this._loadInt((_33_ + 188))) + 16))))) + 24));
                            _30_ = this._loadInt((_33_ + 184));
                            _34_ = this._loadInt((_33_ + 180));
                            this._storeInt((_33_ + 36), (this._loadInt16s(_32_)));
                            this._storeInt((_33_ + 32), _31_);
                            sqlite3_snprintf(_34_, _30_, 57136, (_33_ + 32));
                            break label$0;
                        }
                        while (false);
                        _32_ = this._storeInt((_33_ + 152), (this._loadInt(((this._loadInt((_33_ + 188))) + 16))));
                        _31_ = this._loadInt((_33_ + 184));
                        _30_ = this._loadInt((_33_ + 180));
                        this._storeInt((_33_ + 16), (this._loadInt(_32_)));
                        sqlite3_snprintf(_30_, _31_, 57120, (_33_ + 16));
                        break label$0;
                    }
                    while (false);
                    memcpy(((this._loadInt((_33_ + 184))) + (this._loadInt((_33_ + 172)))), 57088, 4);
                }
                while (false);
                _31_ = this._storeInt((_33_ + 172), ((_32_ = this._loadInt((_33_ + 172))) + 1));
                this._storeInt8((_32_ + (this._loadInt((_33_ + 184)))), 41);
                this._storeInt8((_31_ + (this._loadInt((_33_ + 184)))), 0);
                break label$0;
            }
            while (false);
            label$20:
            do {
                if (((this._loadInt16u(((this._loadInt((_33_ + 144))) + 28))) & 4) == 0) {
                    break label$20;
                }
                _32_ = this._loadInt((_33_ + 184));
                _31_ = this._loadInt((_33_ + 180));
                this._storeLong((_33_ + 96), (this._loadLong(((this._loadInt((_33_ + 144))) + 16))));
                sqlite3_snprintf(_31_, _32_, 26448, (_33_ + 96));
                break label$0;
            }
            while (false);
            label$21:
            do {
                if (((this._loadInt16u(((this._loadInt((_33_ + 144))) + 28))) & 8) == 0) {
                    break label$21;
                }
                _32_ = this._loadInt((_33_ + 184));
                _31_ = this._loadInt((_33_ + 180));
                this._storeDouble((_33_ + 112), (this._loadDouble(((this._loadInt((_33_ + 144))) + 8))));
                sqlite3_snprintf(_31_, _32_, 27040, (_33_ + 112));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 176), 57168);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 176));
        this._storeInt((0 + 4), (_33_ + 192));
        return _32_;
    }

    @Override()
    public final int sqlite3_get_table_cb(int _30_, int _31_, int _32_, int _33_)
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
                if ((this._loadInt(((this._storeInt((_34_ + 24), (this._loadInt((_34_ + 40))))) + 12))) != 0) {
                    break label$1;
                }
                if ((this._loadInt((_34_ + 32))) == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 36))) << 1));
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 20), (this._loadInt((_34_ + 36))));
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
                            if (((this._loadInt(((_33_ = this._loadInt((_34_ + 24))) + 20))) + (this._loadInt((_34_ + 20)))) <= (this._loadInt((_33_ + 8)))) {
                                break label$6;
                            }
                            _32_ = this._storeInt(((_33_ = this._loadInt((_34_ + 24))) + 8), (((this._loadInt((_33_ + 8))) << 1) + (this._loadInt((_34_ + 20)))));
                            if ((this._storeInt((_34_ + 8), (sqlite3_realloc((this._loadInt(_33_)), (_32_ << 2))))) == 0) {
                                break label$5;
                            }
                            this._storeInt((this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 8))));
                        }
                        while (false);
                        label$7:
                        do {
                            label$8:
                            do {
                                if ((this._loadInt(((this._loadInt((_34_ + 24))) + 12))) == 0) {
                                    break label$8;
                                }
                                if ((this._loadInt(((this._loadInt((_34_ + 24))) + 16))) == (this._loadInt((_34_ + 36)))) {
                                    break label$7;
                                }
                                sqlite3_free((this._loadInt(((this._loadInt((_34_ + 24))) + 4))));
                                _33_ = sqlite3_mprintf(60144, 0);
                                _31_ = this._storeInt(((_32_ = this._loadInt((_34_ + 24))) + 24), 1);
                                this._storeInt((_32_ + 4), _33_);
                                this._storeInt((_34_ + 44), _31_);
                                break label$2;
                            }
                            while (false);
                            this._storeInt(((this._loadInt((_34_ + 24))) + 16), (this._loadInt((_34_ + 36))));
                            this._storeInt((_34_ + 16), 0);
                            label$10:
                            do {
                                label$9:
                                while (true) {
                                    if ((this._loadInt((_34_ + 16))) >= (this._loadInt((_34_ + 36)))) {
                                        break label$10;
                                    }
                                    this._storeInt(_34_, (this._loadInt(((this._loadInt((_34_ + 28))) + ((this._loadInt((_34_ + 16))) << 2)))));
                                    if ((this._storeInt((_34_ + 12), (sqlite3_mprintf(22192, _34_)))) == 0) {
                                        break label$5;
                                    }
                                    this._storeInt(((_33_ = this._loadInt((_34_ + 24))) + 20), ((_32_ = this._loadInt((_33_ + 20))) + 1));
                                    this._storeInt(((this._loadInt(_33_)) + (_32_ << 2)), (this._loadInt((_34_ + 12))));
                                    this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) + 1));
                                    continue label$9;
                                }
                            }
                            while (false);
                        }
                        while (false);
                        if ((this._loadInt((_34_ + 32))) == 0) {
                            break label$3;
                        }
                        _31_ = this._storeInt((_34_ + 16), 0);
                        label$12:
                        do {
                            label$11:
                            while (true) {
                                if ((this._loadInt((_34_ + 16))) >= (this._loadInt((_34_ + 36)))) {
                                    break label$4;
                                }
                                label$13:
                                do {
                                    label$14:
                                    do {
                                        if ((this._loadInt(((this._loadInt((_34_ + 32))) + ((this._loadInt((_34_ + 16))) << 2)))) == 0) {
                                            break label$14;
                                        }
                                        if ((this._storeInt((_34_ + 12), (sqlite3_malloc((this._storeInt((_34_ + 4), ((sqlite3Strlen30((this._loadInt(((this._loadInt((_34_ + 32))) + ((this._loadInt((_34_ + 16))) << 2)))))) + 1))))))) == 0) {
                                            break label$12;
                                        }
                                        memcpy((this._loadInt((_34_ + 12))), (this._loadInt(((this._loadInt((_34_ + 32))) + ((this._loadInt((_34_ + 16))) << 2)))), (this._loadInt((_34_ + 4))));
                                        break label$13;
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 12), _31_);
                                }
                                while (false);
                                this._storeInt(((_33_ = this._loadInt((_34_ + 24))) + 20), ((_32_ = this._loadInt((_33_ + 20))) + 1));
                                this._storeInt(((this._loadInt(_33_)) + (_32_ << 2)), (this._loadInt((_34_ + 12))));
                                this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) + 1));
                                continue label$11;
                            }
                        }
                        while (false);
                    }
                    while (false);
                    this._storeInt(((this._loadInt((_34_ + 24))) + 24), 7);
                    this._storeInt((_34_ + 44), 1);
                    break label$2;
                }
                while (false);
                this._storeInt(((_33_ = this._loadInt((_34_ + 24))) + 12), ((this._loadInt((_33_ + 12))) + 1));
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
    public final int columnMem(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 4), (this._loadInt((_32_ + 12))))) == 0) {
                    break label$1;
                }
                if ((this._loadInt(((this._loadInt((_32_ + 4))) + 20))) == 0) {
                    break label$1;
                }
                if ((this._loadInt((_32_ + 8))) >= (this._loadInt16u(((this._loadInt((_32_ + 4))) + 48)))) {
                    break label$1;
                }
                if ((this._loadInt((_32_ + 8))) < 0) {
                    break label$1;
                }
                this._storeInt(_32_, ((this._loadInt(((this._loadInt((_32_ + 4))) + 20))) + ((this._loadInt((_32_ + 8))) * 40)));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt((_32_ + 4))) == 0) {
                    break label$2;
                }
                if ((this._loadInt((this._loadInt((_32_ + 4))))) == 0) {
                    break label$2;
                }
                sqlite3Error((this._loadInt((this._loadInt((_32_ + 4))))), 25, 0, 0);
            }
            while (false);
            this._storeInt(_32_, 60464);
        }
        while (false);
        _31_ = this._loadInt(_32_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void columnMallocFailure(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._storeInt((_31_ + 12), _30_)))) == 0) {
                break label$0;
            }
            _30_ = sqlite3ApiExit((this._loadInt((_30_ = this._loadInt((_31_ + 8))))), (this._loadInt((_30_ + 92))));
            this._storeInt(((this._loadInt((_31_ + 8))) + 92), _30_);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int columnName(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        _32_ = this._storeInt((_34_ + 12), 0);
        this._storeInt(_34_, (this._loadInt((this._storeInt((_34_ + 8), (this._loadInt((_34_ + 28))))))));
        _33_ = this._storeInt((_34_ + 4), (sqlite3_column_count((this._loadInt((_34_ + 28))))));
        label$0:
        do {
            if ((this._loadInt((_34_ + 24))) >= _33_) {
                break label$0;
            }
            if ((this._loadInt((_34_ + 24))) < _32_) {
                break label$0;
            }
            _33_ = this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + ((this._loadInt((_34_ + 16))) * (this._loadInt((_34_ + 4))))));
            this._storeInt((_34_ + 12), (this._iiTable[this._tableIndices[this._loadInt((_34_ + 20))]].invoke(((this._loadInt(((this._loadInt((_34_ + 8))) + 16))) + (_33_ * 40)))));
            if ((this._loadInt8u(((this._loadInt(_34_)) + 30))) == 0) {
                break label$0;
            }
            this._storeInt((_34_ + 12), (this._storeInt8(((this._loadInt(_34_)) + 30), 0)));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 12));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final void sqlite3CloseExtensions(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_31_ + 8), 0);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 8))) >= (this._loadInt(((this._loadInt((_31_ + 12))) + 128)))) {
                    break label$1;
                }
                sqlite3OsDlClose((this._loadInt((_30_ = this._loadInt((_31_ + 12))))), (this._loadInt(((this._loadInt((_30_ + 132))) + ((this._loadInt((_31_ + 8))) << 2)))));
                this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) + 1));
                continue label$0;
            }
        }
        while (false);
        sqlite3DbFree((_30_ = this._loadInt((_31_ + 12))), (this._loadInt((_30_ + 132))));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqliteDefaultBusyCallback(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 16), (this._loadInt((_32_ + 24))));
        _31_ = this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 24))) + 440))));
        label$0:
        do {
            label$1:
            do {
                if ((((this._loadInt((_32_ + 20))) * 1000) + 1000) <= _31_) {
                    break label$1;
                }
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            sqlite3OsSleep((this._loadInt((this._loadInt((_32_ + 16))))), 1000000);
            this._storeInt((_32_ + 28), 1);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int bindText(
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
        this._storeInt8((_36_ + 27), _35_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_36_ + 12), (vdbeUnbind((this._storeInt((_36_ + 20), (this._loadInt((_36_ + 44))))), (this._loadInt((_36_ + 40))))))) == 0) {
                    break label$1;
                }
                if ((this._loadInt((_36_ + 28))) == 0) {
                    break label$0;
                }
                if ((this._loadInt((_36_ + 28))) == -1) {
                    break label$0;
                }
                this._viTable[this._tableIndices[this._loadInt((_36_ + 28))]].invoke((this._loadInt((_36_ + 36))));
                break label$0;
            }
            while (false);
            if ((this._loadInt((_36_ + 36))) == 0) {
                break label$0;
            }
            label$2:
            do {
                if ((this._storeInt((_36_ + 12), (sqlite3VdbeMemSetStr((this._storeInt((_36_ + 16), (((this._loadInt(((this._loadInt((_36_ + 20))) + 72))) + ((this._loadInt((_36_ + 40))) * 40)) + -40))), (this._loadInt((_36_ + 36))), (this._loadInt((_36_ + 32))), (this._loadInt8u((_36_ + 27))), (this._loadInt((_36_ + 28))))))) != 0) {
                    break label$2;
                }
                if ((this._loadInt8u((_36_ + 27))) == 0) {
                    break label$2;
                }
                this._storeInt((_36_ + 12), (sqlite3VdbeChangeEncoding((this._loadInt((_36_ + 16))), (this._loadInt8u(((this._loadInt(((this._loadInt(((this._loadInt((this._loadInt((_36_ + 20))))) + 8))) + 12))) + 77))))));
            }
            while (false);
            sqlite3Error((this._loadInt((this._loadInt((_36_ + 20))))), (this._loadInt((_36_ + 12))), 0, 0);
            this._storeInt((_36_ + 12), (sqlite3ApiExit((this._loadInt((this._loadInt((_36_ + 20))))), (this._loadInt((_36_ + 12))))));
        }
        while (false);
        _35_ = this._loadInt((_36_ + 12));
        this._storeInt((0 + 4), (_36_ + 48));
        return _35_;
    }

    @Override()
    public final int contextMalloc(int _30_, long _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeLong((_32_ + 16), _31_);
        _30_ = this._storeInt((_32_ + 8), (sqlite3_context_db_handle((this._loadInt((_32_ + 28))))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadLong((_32_ + 16))) <= (this._loadLong32s((_30_ + 72)))) {
                    break label$1;
                }
                sqlite3_result_error_toobig((this._loadInt((_32_ + 28))));
                this._storeInt((_32_ + 12), 0);
                break label$0;
            }
            while (false);
            if ((this._storeInt((_32_ + 12), (sqlite3Malloc((this._loadInt((_32_ + 16))))))) != 0) {
                break label$0;
            }
            sqlite3_result_error_nomem((this._loadInt((_32_ + 28))));
        }
        while (false);
        _30_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 32));
        return _30_;
    }

    @Override()
    public final int sqlite3GetFuncCollSeq(int _30_)
    {
        return (this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 56)));
    }

    @Override()
    public final int et_getdigit(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        _33_ = this._loadInt((0 + 4));
        this._storeInt(_31_, ((_32_ = this._loadInt(_31_)) + 1));
        this._storeInt(((_33_ = _33_ - 32) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        label$0:
        do {
            if (_32_ < 16) {
                break label$0;
            }
            this._storeInt8((_33_ + 31), 48);
            return (this._loadInt8s((_33_ + 31)));
        }
        while (false);
        this._storeDouble((_33_ + 8), ((double) (this._storeInt((_33_ + 16), (_truncateDoubleToSignedInteger((this._loadDouble((this._loadInt((_33_ + 24)))))))))));
        _31_ = this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + 48));
        this._storeDouble((_30_ = this._loadInt((_33_ + 24))), (((this._loadDouble(_30_)) - (this._loadDouble((_33_ + 8)))) * 10.0));
        this._storeInt8((_33_ + 31), _31_);
        return (this._loadInt8s((_33_ + 31)));
    }

    @Override()
    public final void appendSpace(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 8))) < 29) {
                    break label$1;
                }
                sqlite3StrAccumAppend((this._loadInt((_32_ + 12))), 61024, 29);
                this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) + -29));
                continue label$0;
            }
        }
        while (false);
        label$2:
        do {
            if ((this._loadInt((_32_ + 8))) < 1) {
                break label$2;
            }
            sqlite3StrAccumAppend((this._loadInt((_32_ + 12))), 61024, (this._loadInt((_32_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int sqlite3_memory_alarm(int _30_, int _31_, long _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeLong(_33_, _32_);
        _31_ = sqlite3MemoryAlarm((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3_os_end()
    {
        return 0;
    }

    @Override()
    public final int sqlite3_stmt_readonly(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 1;
        label$0:
        do {
            if ((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) == 0) {
                break label$0;
            }
            _31_ = this._loadInt8u(((this._loadInt((_32_ + 12))) + 104));
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int sqlite3_blob_reopen(int _30_, long _31_)
    {
        int _32_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeLong((_32_ + 32), _31_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeInt((_32_ + 24), (this._loadInt((_32_ + 40))))) == 0) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 24))) + 24))));
                        if ((this._loadInt(((this._loadInt((_32_ + 24))) + 20))) == 0) {
                            break label$2;
                        }
                        if ((this._storeInt((_32_ + 28), (blobSeekToRow((this._loadInt((_32_ + 24))), (this._loadLong((_32_ + 32))), (_32_ + 16))))) == 0) {
                            break label$1;
                        }
                        _temp$0 = 22192;
                        _temp$1 = 0;
                        _temp$2 = ((this._storeInt(_32_, (this._loadInt((_32_ + 16))))) != 0) ? _temp$0 : _temp$1;
                        sqlite3Error((this._loadInt((_32_ + 20))), (this._loadInt((_32_ + 28))), _temp$2, _32_);
                        sqlite3DbFree((this._loadInt((_32_ + 20))), (this._loadInt((_32_ + 16))));
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_32_ + 44), (sqlite3MisuseError(69350)));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 28), 4);
            }
            while (false);
            this._storeInt((_32_ + 44), (this._storeInt((_32_ + 28), (sqlite3ApiExit((this._loadInt((_32_ + 20))), (this._loadInt((_32_ + 28))))))));
        }
        while (false);
        _30_ = this._loadInt((_32_ + 44));
        this._storeInt((0 + 4), (_32_ + 48));
        return _30_;
    }

    @Override()
    public final int sqlite3_enable_load_extension(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                break label$0;
            }
            this._storeInt(((_32_ = this._loadInt((_32_ + 12))) + 12), ((this._loadInt((_32_ + 12))) | 536870912));
            return 0;
        }
        while (false);
        this._storeInt(((_32_ = this._loadInt((_32_ + 12))) + 12), ((this._loadInt((_32_ + 12))) & -536870913));
        return 0;
    }

    @Override()
    public final int sqlite3_auto_extension(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        _30_ = this._storeInt((_31_ + 20), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_31_ + 20), (sqlite3_initialize()))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 28), (this._loadInt((_31_ + 20))));
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 16), _30_);
            label$3:
            do {
                label$2:
                while (true) {
                    if ((this._loadInt((_31_ + 16))) >= (this._loadInt((_30_ + 31109)))) {
                        break label$3;
                    }
                    if ((this._loadInt(((this._loadInt((_30_ + 31113))) + ((this._loadInt((_31_ + 16))) << 2)))) == (this._loadInt((_31_ + 24)))) {
                        break label$3;
                    }
                    this._storeInt((_31_ + 16), ((this._loadInt((_31_ + 16))) + 1));
                    continue label$2;
                }
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt((_31_ + 16))) != (this._loadInt((0 + 31109)))) {
                    break label$4;
                }
                _30_ = this._storeInt((_31_ + 12), (((this._loadInt((0 + 31109))) << 2) + 4));
                label$5:
                do {
                    if ((this._storeInt((_31_ + 8), (sqlite3_realloc((this._loadInt((0 + 31113))), _30_)))) == 0) {
                        break label$5;
                    }
                    this._storeInt(((this._storeInt((0 + 31113), (this._loadInt((_31_ + 8))))) + ((this._loadInt((0 + 31109))) << 2)), (this._loadInt((_31_ + 24))));
                    this._storeInt((0 + 31109), ((this._loadInt((0 + 31109))) + 1));
                    break label$4;
                }
                while (false);
                this._storeInt((_31_ + 20), 7);
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
    public final void sqlite3_reset_auto_extension()
    {
        label$0:
        do {
            if ((sqlite3_initialize()) != 0) {
                break label$0;
            }
            sqlite3_free((this._loadInt((0 + 31113))));
            this._storeLong((0 + 31109), 0L);
        }
        while (false);
        return;
    }

    @Override()
    public final int sqlite3_vtab_on_conflict(int _30_)
    {
        return (this._loadInt8u(((this._loadInt8u(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 34))) + 61119)));
    }

    @Override()
    public final int sqlite3_vtab_config(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 16), 0);
        this._storeInt((_33_ + 20), _32_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_33_ + 24))) != 1) {
                        break label$2;
                    }
                    if ((this._storeInt((_33_ + 12), (this._loadInt(((this._loadInt((_33_ + 28))) + 304))))) == 0) {
                        break label$1;
                    }
                    this._storeInt((_33_ + 20), ((_31_ = this._loadInt((_33_ + 20))) + 4));
                    this._storeInt8(((this._loadInt(((this._loadInt((_33_ + 12))) + 4))) + 16), (this._loadInt(_31_)));
                    break label$0;
                }
                while (false);
                this._storeInt((_33_ + 16), (sqlite3MisuseError(98316)));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 16), (sqlite3MisuseError(98308)));
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt((_33_ + 16))) == 0) {
                break label$3;
            }
            sqlite3Error((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 16))), 0, 0);
        }
        while (false);
        _31_ = this._loadInt((_33_ + 16));
        this._storeInt((0 + 4), (_33_ + 32));
        return _31_;
    }

    @Override()
    public final int sqlite3_shutdown()
    {
        label$0:
        do {
            if ((this._loadInt((0 + 20428))) == 0) {
                break label$0;
            }
            sqlite3_os_end();
            sqlite3_reset_auto_extension();
            this._storeInt((0 + 20428), 0);
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((0 + 20444))) == 0) {
                break label$1;
            }
            sqlite3PcacheShutdown();
            this._storeInt((0 + 20444), 0);
        }
        while (false);
        label$2:
        do {
            if ((this._loadInt((0 + 20440))) == 0) {
                break label$2;
            }
            sqlite3MallocEnd();
            this._storeInt((0 + 20440), 0);
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt((0 + 20436))) == 0) {
                break label$3;
            }
            this._storeInt((0 + 20436), 0);
        }
        while (false);
        return 0;
    }

    @Override()
    public final void sqlite3PcacheShutdown()
    {
        label$0:
        do {
            if ((this._loadInt((0 + 20344))) == 0) {
                break label$0;
            }
            this._viTable[this._tableIndices[this._loadInt((0 + 20344))]].invoke((this._loadInt((0 + 20336))));
        }
        while (false);
        return;
    }

    @Override()
    public final void sqlite3MallocEnd()
    {
        label$0:
        do {
            if ((this._loadInt((0 + 20292))) == 0) {
                break label$0;
            }
            this._viTable[this._tableIndices[this._loadInt((0 + 20292))]].invoke((this._loadInt((0 + 20296))));
        }
        while (false);
        memset(20468, 0, 40);
        return;
    }

    @Override()
    public final int sqlite3_global_recover()
    {
        return 0;
    }

    @Override()
    public final void __wasm_nullptr()
    {
        throw (new UnreachableException());
    }

    @Override()
    public final int __importThunk___stdio_write(int _30_, int _31_, int _32_)
    {
        return (this.__stdio_write.invoke(_30_, _31_, _32_));
    }

    @Override()
    public final int __importThunk___stdout_write(int _30_, int _31_, int _32_)
    {
        return (this.__stdout_write.invoke(_30_, _31_, _32_));
    }

    @Override()
    public final int __importThunk_getcwd(int _30_, int _31_)
    {
        return (this.getcwd.invoke(_30_, _31_));
    }

    @Override()
    public final int __importThunk_stat(int _30_, int _31_)
    {
        return (this.stat.invoke(_30_, _31_));
    }

    @Override()
    public final int __importThunk_fstat(int _30_, int _31_)
    {
        return (this.fstat.invoke(_30_, _31_));
    }

    @Override()
    public final int __importThunk_fcntl(int _30_, int _31_, int _32_)
    {
        return (this.fcntl.invoke(_30_, _31_, _32_));
    }
}
