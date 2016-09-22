package sqlite3;

abstract class sqlite3$13
        extends sqlite3$12
{
    protected sqlite3$13(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final int sqlite3HashInsert(int _30_, int _31_, int _32_, int _33_)
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
                if ((this._loadInt((this._loadInt((_34_ + 40))))) == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 24), ((strHash((this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 32))))) % (this._loadInt((this._loadInt((_34_ + 40)))))));
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 24), 0);
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
                                        if ((this._storeInt((_34_ + 20), (findElementGivenHash((this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 32))), (this._loadInt((_34_ + 24))))))) == 0) {
                                            break label$9;
                                        }
                                        this._storeInt((_34_ + 12), (this._loadInt(((this._loadInt((_34_ + 20))) + 8))));
                                        if ((this._loadInt((_34_ + 28))) == 0) {
                                            break label$8;
                                        }
                                        this._storeInt(((_33_ = this._loadInt((_34_ + 20))) + 12), (this._loadInt((_34_ + 36))));
                                        this._storeInt((_33_ + 8), (this._loadInt((_34_ + 28))));
                                        break label$7;
                                    }
                                    while (false);
                                    if ((this._loadInt((_34_ + 28))) == 0) {
                                        break label$6;
                                    }
                                    if ((this._storeInt((_34_ + 16), (sqlite3Malloc(20)))) == 0) {
                                        break label$5;
                                    }
                                    this._storeInt(((_33_ = this._loadInt((_34_ + 16))) + 16), (this._loadInt((_34_ + 32))));
                                    this._storeInt((_33_ + 12), (this._loadInt((_34_ + 36))));
                                    this._storeInt(((this._loadInt((_34_ + 16))) + 8), (this._loadInt((_34_ + 28))));
                                    this._storeInt(((_33_ = this._loadInt((_34_ + 40))) + 4), ((this._loadInt((_33_ + 4))) + 1));
                                    label$10:
                                    do {
                                        if (((this._loadInt(((this._loadInt((_34_ + 40))) + 4))) & 4294967295L) < (10 & 4294967295L)) {
                                            break label$10;
                                        }
                                        if (((this._loadInt(((_33_ = this._loadInt((_34_ + 40))) + 4))) & 4294967295L) <= (((this._loadInt(_33_)) << 1) & 4294967295L)) {
                                            break label$10;
                                        }
                                        if ((rehash((_33_ = this._loadInt((_34_ + 40))), ((this._loadInt((_33_ + 4))) << 1))) == 0) {
                                            break label$10;
                                        }
                                        this._storeInt((_34_ + 24), ((strHash((this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 32))))) % (this._loadInt((this._loadInt((_34_ + 40)))))));
                                    }
                                    while (false);
                                    if ((this._loadInt(((this._loadInt((_34_ + 40))) + 12))) == 0) {
                                        break label$4;
                                    }
                                    insertElement((_33_ = this._loadInt((_34_ + 40))), ((this._loadInt((_33_ + 12))) + ((this._loadInt((_34_ + 24))) << 3)), (this._loadInt((_34_ + 16))));
                                    break label$3;
                                }
                                while (false);
                                removeElementGivenHash((this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 24))));
                            }
                            while (false);
                            this._storeInt((_34_ + 44), (this._loadInt((_34_ + 12))));
                            break label$2;
                        }
                        while (false);
                        this._storeInt((_34_ + 44), 0);
                        break label$2;
                    }
                    while (false);
                    this._storeInt((_34_ + 44), (this._loadInt((_34_ + 28))));
                    break label$2;
                }
                while (false);
                insertElement((this._loadInt((_34_ + 40))), 0, (this._loadInt((_34_ + 16))));
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
    public final void freeIndex(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        sqlite3DeleteIndexSamples((this._loadInt((_32_ + 12))), _31_);
        sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 28))));
        sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))));
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3FkDelete(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 20), (this._loadInt(((this._storeInt((_32_ + 24), _31_)) + 36))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 20))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_32_ + 28))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt(((this._loadInt((_32_ + 28))) + 504))) != 0) {
                            break label$2;
                        }
                    }
                    while (false);
                    label$4:
                    do {
                        label$5:
                        do {
                            if ((this._loadInt(((this._loadInt((_32_ + 20))) + 16))) == 0) {
                                break label$5;
                            }
                            this._storeInt(((this._loadInt(((_31_ = this._loadInt((_32_ + 20))) + 16))) + 12), (this._loadInt((_31_ + 12))));
                            break label$4;
                        }
                        while (false);
                        label$6:
                        do {
                            label$7:
                            do {
                                if ((this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 20))) + 12))))) == 0) {
                                    break label$7;
                                }
                                _31_ = this._loadInt(((this._loadInt(((this._loadInt((_32_ + 20))) + 12))) + 8));
                                break label$6;
                            }
                            while (false);
                            _31_ = this._loadInt(((this._loadInt((_32_ + 20))) + 8));
                        }
                        while (false);
                        this._storeInt((_32_ + 8), _31_);
                        sqlite3HashInsert(((this._loadInt(((this._loadInt((_32_ + 24))) + 68))) + 56), _31_, (sqlite3Strlen30(_31_)), (this._loadInt((_32_ + 12))));
                    }
                    while (false);
                    if ((this._loadInt(((this._loadInt((_32_ + 20))) + 12))) == 0) {
                        break label$2;
                    }
                    this._storeInt(((this._loadInt(((_31_ = this._loadInt((_32_ + 20))) + 12))) + 16), (this._loadInt((_31_ + 16))));
                }
                while (false);
                fkTriggerDelete((this._loadInt((_32_ + 28))), (this._loadInt(((this._loadInt((_32_ + 20))) + 28))));
                fkTriggerDelete((this._loadInt((_32_ + 28))), (this._loadInt(((this._loadInt((_32_ + 20))) + 32))));
                this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt((_32_ + 20))) + 4))));
                sqlite3DbFree((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 20))));
                this._storeInt((_32_ + 20), (this._loadInt((_32_ + 16))));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void sqliteDeleteColumnNames(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt(_32_, (this._loadInt(((this._storeInt((_32_ + 8), _31_)) + 12))))) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 4), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 4))) >= (this._loadInt(((this._loadInt((_32_ + 8))) + 8)))) {
                        break label$2;
                    }
                    sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt((this._loadInt(_32_)))));
                    sqlite3ExprDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt(_32_)) + 4))));
                    sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt(_32_)) + 8))));
                    sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt(_32_)) + 12))));
                    sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt(_32_)) + 16))));
                    this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                    this._storeInt(_32_, ((this._loadInt(_32_)) + 24));
                    continue label$1;
                }
            }
            while (false);
            sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3SelectDelete(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                break label$0;
            }
            clearSelect((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))));
            sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3ExprDelete(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                break label$0;
            }
            label$1:
            do {
                if (((this._loadInt16u(((this._loadInt((_32_ + 8))) + 2))) & 8192) != 0) {
                    break label$1;
                }
                sqlite3ExprDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 8))));
                sqlite3ExprDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 12))));
                label$2:
                do {
                    if (((this._loadInt16u(((this._loadInt((_32_ + 8))) + 2))) & 4096) != 0) {
                        break label$2;
                    }
                    if (((this._loadInt8u(((this._loadInt((_32_ + 8))) + 34))) & 1) == 0) {
                        break label$2;
                    }
                    sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 4))));
                }
                while (false);
                label$3:
                do {
                    if (((this._loadInt16u(((this._loadInt((_32_ + 8))) + 2))) & 2048) == 0) {
                        break label$3;
                    }
                    sqlite3SelectDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 16))));
                    break label$1;
                }
                while (false);
                sqlite3ExprListDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 16))));
            }
            while (false);
            if (((this._loadInt16u(((this._loadInt((_32_ + 8))) + 2))) & 16384) != 0) {
                break label$0;
            }
            sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3VtabClear(int _30_, int _31_)
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
                if ((this._loadInt(((this._loadInt((_32_ + 12))) + 504))) != 0) {
                    break label$0;
                }
            }
            while (false);
            vtabDisconnectAll(0, (this._loadInt((_32_ + 8))));
        }
        while (false);
        label$2:
        do {
            if ((this._loadInt(((this._loadInt((_32_ + 8))) + 60))) == 0) {
                break label$2;
            }
            this._storeInt((_32_ + 4), 0);
            label$4:
            do {
                label$3:
                while (true) {
                    if ((this._loadInt((_32_ + 4))) >= (this._loadInt(((this._loadInt((_32_ + 8))) + 56)))) {
                        break label$4;
                    }
                    sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 8))) + 60))) + ((this._loadInt((_32_ + 4))) << 2)))));
                    this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                    continue label$3;
                }
            }
            while (false);
            sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 60))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int vtabDisconnectAll(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 32) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        _31_ = this._storeInt((_33_ + 20), 0);
        this._storeInt((_33_ + 16), (this._loadInt(((this._loadInt((_33_ + 24))) + 52))));
        _32_ = this._storeInt(((this._loadInt((_33_ + 24))) + 52), _31_);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_33_ + 16))) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 12), (this._loadInt((this._loadInt((_33_ + 16))))));
                this._storeInt((_33_ + 8), (this._loadInt(((this._loadInt((_33_ + 16))) + 24))));
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_33_ + 12))) == (this._loadInt((_33_ + 28)))) {
                            break label$3;
                        }
                        this._storeInt(((_31_ = this._loadInt((_33_ + 16))) + 24), (this._loadInt(((_30_ = this._loadInt((_33_ + 12))) + 316))));
                        this._storeInt((_30_ + 316), _31_);
                        break label$2;
                    }
                    while (false);
                    _31_ = this._storeInt((_33_ + 20), (this._loadInt((_33_ + 16))));
                    this._storeInt(((this._storeInt(((this._loadInt((_33_ + 24))) + 52), _31_)) + 24), _32_);
                }
                while (false);
                this._storeInt((_33_ + 16), (this._loadInt((_33_ + 8))));
                continue label$0;
            }
        }
        while (false);
        return (this._loadInt((_33_ + 20)));
    }

    @Override()
    public final void sqlite3ExprListDelete(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                break label$0;
            }
            this._storeInt(_32_, (this._loadInt(((this._loadInt((_32_ + 8))) + 12))));
            this._storeInt((_32_ + 4), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 4))) >= (this._loadInt((this._loadInt((_32_ + 8)))))) {
                        break label$2;
                    }
                    sqlite3ExprDelete((this._loadInt((_32_ + 12))), (this._loadInt((this._loadInt(_32_)))));
                    sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt(_32_)) + 4))));
                    sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt(_32_)) + 8))));
                    this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                    this._storeInt(_32_, ((this._loadInt(_32_)) + 20));
                    continue label$1;
                }
            }
            while (false);
            sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 12))));
            sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void clearSelect(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        sqlite3ExprListDelete((this._loadInt((_32_ + 12))), (this._loadInt(_31_)));
        sqlite3SrcListDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 8))));
        sqlite3ExprDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 12))));
        sqlite3ExprListDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 16))));
        sqlite3ExprDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 20))));
        sqlite3ExprListDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 24))));
        sqlite3SelectDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 28))));
        sqlite3ExprDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 40))));
        sqlite3ExprDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 44))));
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3SrcListDelete(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                break label$0;
            }
            this._storeInt(_32_, ((this._loadInt((_32_ + 8))) + 8));
            this._storeInt((_32_ + 4), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 4))) >= (this._loadInt16s((this._loadInt((_32_ + 8)))))) {
                        break label$2;
                    }
                    sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt((this._loadInt(_32_)))));
                    sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt(_32_)) + 4))));
                    sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt(_32_)) + 8))));
                    sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt(_32_)) + 48))));
                    sqlite3DeleteTable((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt(_32_)) + 12))));
                    sqlite3SelectDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt(_32_)) + 16))));
                    sqlite3ExprDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt(_32_)) + 28))));
                    sqlite3IdListDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt(_32_)) + 32))));
                    this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                    this._storeInt(_32_, ((this._loadInt(_32_)) + 56));
                    continue label$1;
                }
            }
            while (false);
            sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3IdListDelete(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 4), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 4))) >= (this._loadInt(((this._loadInt((_32_ + 8))) + 4)))) {
                        break label$2;
                    }
                    sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((this._loadInt((_32_ + 8))))) + ((this._loadInt((_32_ + 4))) << 3)))));
                    this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                    continue label$1;
                }
            }
            while (false);
            sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt((this._loadInt((_32_ + 8))))));
            sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void fkTriggerDelete(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 8), _31_)) == 0) {
                break label$0;
            }
            _31_ = this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 8))) + 28))));
            sqlite3ExprDelete((this._loadInt((_32_ + 12))), (this._loadInt((_31_ + 20))));
            sqlite3ExprListDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 4))) + 24))));
            sqlite3SelectDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 4))) + 8))));
            sqlite3ExprDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 8))) + 12))));
            sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3DeleteIndexSamples(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        return;
    }

    @Override()
    public final int strHash(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), 0);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 8))) < 1) {
                    break label$1;
                }
                _31_ = this._loadInt((_32_ + 4));
                this._storeInt((_32_ + 12), ((_30_ = this._loadInt((_32_ + 12))) + 1));
                this._storeInt((_32_ + 4), ((_31_ ^ (_31_ << 3)) ^ (this._loadInt8u(((this._loadInt8u(_30_)) + 19872)))));
                this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) + -1));
                continue label$0;
            }
        }
        while (false);
        return (this._loadInt((_32_ + 4)));
    }

    @Override()
    public final int findElementGivenHash(int _30_, int _31_, int _32_, int _33_)
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
                if ((this._loadInt(((this._loadInt((_34_ + 24))) + 12))) == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 8), (this._loadInt(((this._storeInt(_34_, ((this._loadInt(((this._loadInt((_34_ + 24))) + 12))) + ((this._loadInt((_34_ + 12))) << 3)))) + 4))));
                this._storeInt((_34_ + 4), (this._loadInt((this._loadInt(_34_)))));
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((_34_ + 24))) + 8))));
            this._storeInt((_34_ + 4), (this._loadInt(((this._loadInt((_34_ + 24))) + 4))));
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                label$5:
                do {
                    label$4:
                    while (true) {
                        this._storeInt((_34_ + 4), ((_32_ = this._loadInt((_34_ + 4))) + -1));
                        _33_ = 0;
                        label$6:
                        do {
                            if (_32_ == 0) {
                                break label$6;
                            }
                            _33_ = ((this._loadInt((_34_ + 8))) != 0) ? 1 : 0;
                        }
                        while (false);
                        if (_33_ == 0) {
                            break label$3;
                        }
                        label$7:
                        do {
                            if ((this._loadInt(((this._loadInt((_34_ + 8))) + 16))) != (this._loadInt((_34_ + 16)))) {
                                break label$7;
                            }
                            if ((sqlite3_strnicmp((this._loadInt(((this._loadInt((_34_ + 8))) + 12))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 16))))) == 0) {
                                break label$5;
                            }
                        }
                        while (false);
                        this._storeInt((_34_ + 8), (this._loadInt((this._loadInt((_34_ + 8))))));
                        continue label$4;
                    }
                }
                while (false);
                this._storeInt((_34_ + 28), (this._loadInt((_34_ + 8))));
                break label$2;
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
    public final void removeElementGivenHash(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_33_ + 8))) + 4))) == 0) {
                    break label$1;
                }
                this._storeInt((this._loadInt(((_32_ = this._loadInt((_33_ + 8))) + 4))), (this._loadInt(_32_)));
                break label$0;
            }
            while (false);
            this._storeInt(((this._loadInt((_33_ + 12))) + 8), (this._loadInt((this._loadInt((_33_ + 8))))));
        }
        while (false);
        label$2:
        do {
            if ((this._loadInt((this._loadInt((_33_ + 8))))) == 0) {
                break label$2;
            }
            this._storeInt(((this._loadInt((_32_ = this._loadInt((_33_ + 8))))) + 4), (this._loadInt((_32_ + 4))));
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt(((this._loadInt((_33_ + 12))) + 12))) == 0) {
                break label$3;
            }
            label$4:
            do {
                if ((this._loadInt(((this._storeInt(_33_, ((this._loadInt(((this._loadInt((_33_ + 12))) + 12))) + ((this._loadInt((_33_ + 4))) << 3)))) + 4))) != (this._loadInt((_33_ + 8)))) {
                    break label$4;
                }
                this._storeInt(((this._loadInt(_33_)) + 4), (this._loadInt((this._loadInt((_33_ + 8))))));
            }
            while (false);
            this._storeInt((_32_ = this._loadInt(_33_)), ((this._loadInt(_32_)) + -1));
        }
        while (false);
        sqlite3_free((this._loadInt((_33_ + 8))));
        this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 4), ((this._loadInt((_32_ + 4))) + -1));
        label$5:
        do {
            if ((this._loadInt((_32_ + 4))) != 0) {
                break label$5;
            }
            sqlite3HashClear((this._loadInt((_33_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int rehash(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        label$0:
        do {
            if ((((this._storeInt((_32_ + 20), _31_)) << 3) & 4294967295L) < (1025 & 4294967295L)) {
                break label$0;
            }
            this._storeInt((_32_ + 20), 128);
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                if ((this._loadInt((_32_ + 20))) != (this._loadInt((this._loadInt((_32_ + 24)))))) {
                    break label$2;
                }
                this._storeInt((_32_ + 28), 0);
                break label$1;
            }
            while (false);
            sqlite3BeginBenignMalloc();
            this._storeInt((_32_ + 16), (sqlite3Malloc(((this._loadInt((_32_ + 20))) << 3))));
            sqlite3EndBenignMalloc();
            label$3:
            do {
                if ((this._loadInt((_32_ + 16))) == 0) {
                    break label$3;
                }
                sqlite3_free((this._loadInt(((this._loadInt((_32_ + 24))) + 12))));
                _31_ = this._storeInt((_32_ + 20), ((sqlite3MallocSize((this._storeInt(((this._loadInt((_32_ + 24))) + 12), (this._loadInt((_32_ + 16))))))) >>> 3));
                this._storeInt((this._loadInt((_32_ + 24))), _31_);
                memset((this._loadInt((_32_ + 16))), 0, (_31_ << 3));
                this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 24))) + 8))));
                this._storeInt(((this._loadInt((_32_ + 24))) + 8), 0);
                label$5:
                do {
                    label$4:
                    while (true) {
                        if ((this._loadInt((_32_ + 12))) == 0) {
                            break label$5;
                        }
                        this._storeInt((_32_ + 4), ((strHash((this._loadInt(((_31_ = this._loadInt((_32_ + 12))) + 12))), (this._loadInt((_31_ + 16))))) % (this._loadInt((_32_ + 20)))));
                        this._storeInt((_32_ + 8), (this._loadInt((this._loadInt((_32_ + 12))))));
                        insertElement((this._loadInt((_32_ + 24))), ((this._loadInt((_32_ + 16))) + ((this._loadInt((_32_ + 4))) << 3)), (this._loadInt((_32_ + 12))));
                        this._storeInt((_32_ + 12), (this._loadInt((_32_ + 8))));
                        continue label$4;
                    }
                }
                while (false);
                this._storeInt((_32_ + 28), 1);
                break label$1;
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
    public final void insertElement(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_33_ + 8))) == 0) {
                    break label$1;
                }
                _32_ = 0;
                label$2:
                do {
                    if ((this._loadInt((this._loadInt((_33_ + 8))))) == 0) {
                        break label$2;
                    }
                    _32_ = this._loadInt(((this._loadInt((_33_ + 8))) + 4));
                }
                while (false);
                this._storeInt(_33_, _32_);
                this._storeInt((_32_ = this._loadInt((_33_ + 8))), ((this._loadInt(_32_)) + 1));
                this._storeInt((_32_ + 4), (this._loadInt((_33_ + 4))));
                break label$0;
            }
            while (false);
            this._storeInt(_33_, 0);
        }
        while (false);
        label$3:
        do {
            label$4:
            do {
                label$5:
                do {
                    if ((this._loadInt(_33_)) == 0) {
                        break label$5;
                    }
                    this._storeInt(((_32_ = this._loadInt((_33_ + 4))) + 4), (this._loadInt(((this._storeInt(_32_, (this._loadInt(_33_)))) + 4))));
                    if ((this._loadInt(((this._loadInt(_33_)) + 4))) == 0) {
                        break label$4;
                    }
                    this._storeInt((this._loadInt(((this._loadInt(_33_)) + 4))), (this._loadInt((_33_ + 4))));
                    break label$3;
                }
                while (false);
                this._storeInt((this._loadInt((_33_ + 4))), (this._loadInt(((_32_ = this._loadInt((_33_ + 12))) + 8))));
                label$6:
                do {
                    if ((this._loadInt((_32_ + 8))) == 0) {
                        break label$6;
                    }
                    this._storeInt(((this._loadInt(((this._loadInt((_33_ + 12))) + 8))) + 4), (this._loadInt((_33_ + 4))));
                }
                while (false);
                this._storeInt(((_32_ = this._loadInt((_33_ + 4))) + 4), 0);
                this._storeInt(((this._loadInt((_33_ + 12))) + 8), _32_);
                return;
            }
            while (false);
            this._storeInt(((this._loadInt((_33_ + 12))) + 8), (this._loadInt((_33_ + 4))));
        }
        while (false);
        this._storeInt(((this._loadInt(_33_)) + 4), (this._loadInt((_33_ + 4))));
        return;
    }

    @Override()
    public final void sqlite3HashClear(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._loadInt(((this._storeInt((_32_ + 12), _30_)) + 8))));
        _31_ = this._storeInt(((_30_ = this._loadInt((_32_ + 12))) + 8), 0);
        sqlite3_free((this._loadInt((_30_ + 12))));
        this._storeInt(((_30_ = this._loadInt((_32_ + 12))) + 12), (this._storeInt(_30_, _31_)));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 8))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 4), (this._loadInt((this._loadInt((_32_ + 8))))));
                sqlite3_free((this._loadInt((_32_ + 8))));
                this._storeInt((_32_ + 8), (this._loadInt((_32_ + 4))));
                continue label$0;
            }
        }
        while (false);
        this._storeInt(((this._loadInt((_32_ + 12))) + 4), 0);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3DeleteTriggerStep(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 8))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 4), (this._loadInt((_32_ + 8))));
                this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((_32_ + 8))) + 32))));
                sqlite3ExprDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 4))) + 20))));
                sqlite3ExprListDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 4))) + 24))));
                sqlite3SelectDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 4))) + 8))));
                sqlite3IdListDelete((this._loadInt((_32_ + 12))), (this._loadInt(((this._loadInt((_32_ + 4))) + 28))));
                sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 4))));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int sqlite3PcachePagecount(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        _30_ = this._storeInt((_31_ + 8), 0);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_31_ + 12))) + 40))) == 0) {
                break label$0;
            }
            this._storeInt((_31_ + 8), (this._iiTable[this._tableIndices[this._loadInt((_30_ + 20356))]].invoke((this._loadInt(((this._loadInt((_31_ + 12))) + 40))))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int setupLookaside(int _30_, int _31_, int _32_, int _33_)
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
                if ((this._loadInt(((this._loadInt((_34_ + 24))) + 236))) == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 28), 5);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_34_ + 24))) + 235))) == 0) {
                    break label$2;
                }
                sqlite3_free((this._loadInt(((this._loadInt((_34_ + 24))) + 260))));
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((_34_ + 16))) > 4) {
                    break label$3;
                }
                this._storeInt((_34_ + 16), 0);
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt((_34_ + 12))) > -1) {
                    break label$4;
                }
                this._storeInt((_34_ + 12), 0);
            }
            while (false);
            label$5:
            do {
                label$6:
                do {
                    label$7:
                    do {
                        if ((this._loadInt((_34_ + 16))) == 0) {
                            break label$7;
                        }
                        if ((this._loadInt((_34_ + 12))) == 0) {
                            break label$7;
                        }
                        if ((this._loadInt((_34_ + 20))) == 0) {
                            break label$6;
                        }
                        this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) & -8));
                        this._storeInt((_34_ + 8), (this._loadInt((_34_ + 20))));
                        break label$5;
                    }
                    while (false);
                    this._storeInt((_34_ + 8), (this._storeInt((_34_ + 16), 0)));
                    break label$5;
                }
                while (false);
                this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) & -8));
                sqlite3BeginBenignMalloc();
                this._storeInt((_34_ + 8), (sqlite3Malloc(((this._loadInt((_34_ + 16))) * (this._loadInt((_34_ + 12)))))));
                sqlite3EndBenignMalloc();
            }
            while (false);
            _31_ = this._storeInt(((_33_ = this._loadInt((_34_ + 24))) + 256), 0);
            this._storeInt((_33_ + 260), (this._loadInt((_34_ + 8))));
            this._storeInt16(((this._loadInt((_34_ + 24))) + 232), (this._loadInt((_34_ + 16))));
            label$8:
            do {
                label$9:
                do {
                    if ((this._loadInt((_34_ + 8))) == 0) {
                        break label$9;
                    }
                    this._storeInt(_34_, (this._loadInt((_34_ + 8))));
                    this._storeInt((_34_ + 4), ((this._loadInt((_34_ + 12))) + -1));
                    label$11:
                    do {
                        label$10:
                        while (true) {
                            if ((this._loadInt((_34_ + 4))) < _31_) {
                                break label$11;
                            }
                            this._storeInt((_33_ = this._loadInt(_34_)), (this._loadInt((_32_ = (this._loadInt((_34_ + 24))) + 256))));
                            this._storeInt(_32_, _33_);
                            this._storeInt(_34_, ((this._loadInt(_34_)) + (this._loadInt((_34_ + 16)))));
                            this._storeInt((_34_ + 4), ((this._loadInt((_34_ + 4))) + -1));
                            continue label$10;
                        }
                    }
                    while (false);
                    this._storeInt8(((_33_ = this._loadInt((_34_ + 24))) + 234), 1);
                    this._storeInt((_33_ + 264), (this._loadInt(_34_)));
                    this._storeInt8(((this._loadInt((_34_ + 24))) + 235), (((this._loadInt((_34_ + 20))) == 0) ? 1 : 0));
                    break label$8;
                }
                while (false);
                this._storeInt8(((_33_ = this._loadInt((_34_ + 24))) + 235), (this._storeInt((_33_ + 264), (this._storeInt8((_33_ + 234), _31_)))));
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
    public final void sqlite3ExpirePreparedStatements(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 136))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 8))) == 0) {
                    break label$1;
                }
                this._storeInt8(((this._loadInt((_31_ + 8))) + 99), 1);
                this._storeInt((_31_ + 8), (this._loadInt(((this._loadInt((_31_ + 8))) + 64))));
                continue label$0;
            }
        }
        while (false);
        return;
    }

    @Override()
    public final int sqlite3CreateFunc(
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
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_39_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_39_ + 52), _31_);
        this._storeInt((_39_ + 48), _32_);
        this._storeInt((_39_ + 44), _33_);
        this._storeInt((_39_ + 40), _34_);
        this._storeInt((_39_ + 36), _35_);
        this._storeInt((_39_ + 32), _36_);
        this._storeInt((_39_ + 28), _37_);
        this._storeInt((_39_ + 24), _38_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_39_ + 52))) == 0) {
                            break label$3;
                        }
                        label$4:
                        do {
                            if ((this._loadInt((_39_ + 36))) == 0) {
                                break label$4;
                            }
                            if ((this._loadInt((_39_ + 28))) != 0) {
                                break label$3;
                            }
                            if ((this._loadInt((_39_ + 32))) != 0) {
                                break label$3;
                            }
                        }
                        while (false);
                        label$5:
                        do {
                            if ((this._loadInt((_39_ + 36))) != 0) {
                                break label$5;
                            }
                            if ((this._loadInt((_39_ + 28))) == 0) {
                                break label$5;
                            }
                            if ((this._loadInt((_39_ + 32))) == 0) {
                                break label$3;
                            }
                        }
                        while (false);
                        label$6:
                        do {
                            if ((this._loadInt((_39_ + 36))) != 0) {
                                break label$6;
                            }
                            if ((this._loadInt((_39_ + 28))) != 0) {
                                break label$6;
                            }
                            if ((this._loadInt((_39_ + 32))) != 0) {
                                break label$3;
                            }
                        }
                        while (false);
                        if ((this._loadInt((_39_ + 48))) < -1) {
                            break label$3;
                        }
                        if ((this._loadInt((_39_ + 48))) > 127) {
                            break label$3;
                        }
                        if ((this._storeInt((_39_ + 16), (sqlite3Strlen30((this._loadInt((_39_ + 52))))))) >= 256) {
                            break label$3;
                        }
                        if ((this._loadInt((_39_ + 44))) != 4) {
                            break label$2;
                        }
                        _temp$0 = 2;
                        _temp$1 = 3;
                        _temp$2 = ((this._loadInt8s((0 + 29180))) != 0) ? _temp$0 : _temp$1;
                        this._storeInt((_39_ + 44), _temp$2);
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_39_ + 60), (sqlite3MisuseError(108959)));
                    break label$0;
                }
                while (false);
                if ((this._loadInt((_39_ + 44))) != 5) {
                    break label$1;
                }
                label$7:
                do {
                    if ((this._storeInt((_39_ + 12), (sqlite3CreateFunc((this._loadInt((_39_ + 56))), (this._loadInt((_39_ + 52))), (this._loadInt((_39_ + 48))), 1, (this._loadInt((_39_ + 40))), (this._loadInt((_39_ + 36))), (this._loadInt((_39_ + 32))), (this._loadInt((_39_ + 28))), (this._loadInt((_39_ + 24))))))) != 0) {
                        break label$7;
                    }
                    this._storeInt((_39_ + 12), (sqlite3CreateFunc((this._loadInt((_39_ + 56))), (this._loadInt((_39_ + 52))), (this._loadInt((_39_ + 48))), 2, (this._loadInt((_39_ + 40))), (this._loadInt((_39_ + 36))), (this._loadInt((_39_ + 32))), (this._loadInt((_39_ + 28))), (this._loadInt((_39_ + 24))))));
                }
                while (false);
                label$8:
                do {
                    if ((this._loadInt((_39_ + 12))) == 0) {
                        break label$8;
                    }
                    this._storeInt((_39_ + 60), (this._loadInt((_39_ + 12))));
                    break label$0;
                }
                while (false);
                this._storeInt((_39_ + 44), 3);
            }
            while (false);
            label$9:
            do {
                if ((this._storeInt((_39_ + 20), (sqlite3FindFunction((this._loadInt((_39_ + 56))), (this._loadInt((_39_ + 52))), (this._loadInt((_39_ + 16))), (this._loadInt((_39_ + 48))), (this._loadInt8u((_39_ + 44))), 0)))) == 0) {
                    break label$9;
                }
                if ((this._loadInt8u(((this._loadInt((_39_ + 20))) + 2))) != (this._loadInt((_39_ + 44)))) {
                    break label$9;
                }
                if ((this._loadInt16s((this._loadInt((_39_ + 20))))) != (this._loadInt((_39_ + 48)))) {
                    break label$9;
                }
                label$10:
                do {
                    if ((this._loadInt(((this._loadInt((_39_ + 56))) + 140))) == 0) {
                        break label$10;
                    }
                    sqlite3Error((this._loadInt((_39_ + 56))), 5, 29312, 0);
                    this._storeInt((_39_ + 60), 5);
                    break label$0;
                }
                while (false);
                sqlite3ExpirePreparedStatements((this._loadInt((_39_ + 56))));
            }
            while (false);
            label$11:
            do {
                if ((this._storeInt((_39_ + 20), (sqlite3FindFunction((this._loadInt((_39_ + 56))), (this._loadInt((_39_ + 52))), (this._loadInt((_39_ + 16))), (this._loadInt((_39_ + 48))), (this._loadInt8u((_39_ + 44))), 1)))) == 0) {
                    break label$11;
                }
                functionDestroy((this._loadInt((_39_ + 56))), (this._loadInt((_39_ + 20))));
                label$12:
                do {
                    if ((this._loadInt((_39_ + 24))) == 0) {
                        break label$12;
                    }
                    this._storeInt((_38_ = this._loadInt((_39_ + 24))), ((this._loadInt(_38_)) + 1));
                }
                while (false);
                _37_ = this._storeInt8(((_38_ = this._loadInt((_39_ + 20))) + 3), 0);
                this._storeInt((_38_ + 32), (this._loadInt((_39_ + 24))));
                this._storeInt((_38_ + 12), (this._loadInt((_39_ + 36))));
                this._storeInt(((this._loadInt((_39_ + 20))) + 16), (this._loadInt((_39_ + 32))));
                this._storeInt(((this._loadInt((_39_ + 20))) + 20), (this._loadInt((_39_ + 28))));
                this._storeInt(((this._loadInt((_39_ + 20))) + 4), (this._loadInt((_39_ + 40))));
                this._storeInt16((this._loadInt((_39_ + 20))), (this._loadInt((_39_ + 48))));
                this._storeInt((_39_ + 60), _37_);
                break label$0;
            }
            while (false);
            this._storeInt((_39_ + 60), 7);
        }
        while (false);
        _38_ = this._loadInt((_39_ + 60));
        this._storeInt((0 + 4), (_39_ + 64));
        return _38_;
    }

    @Override()
    public final int sqlite3FindFunction(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_)
    {
        int _36_ = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_36_ + 52), _31_);
        this._storeInt((_36_ + 48), _32_);
        this._storeInt((_36_ + 44), _33_);
        this._storeInt8((_36_ + 43), _34_);
        this._storeInt((_36_ + 36), _35_);
        this._storeInt((_36_ + 24), (this._storeInt((_36_ + 28), 0)));
        _35_ = this._storeInt((_36_ + 20), (((this._loadInt8u(((this._loadInt8u((this._loadInt((_36_ + 52))))) + 19872))) + (this._loadInt((_36_ + 48)))) % 23));
        this._storeInt((_36_ + 32), (functionSearch(((this._loadInt((_36_ + 56))) + 320), _35_, (this._loadInt((_36_ + 52))), (this._loadInt((_36_ + 48))))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_36_ + 32))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._storeInt((_36_ + 16), (matchQuality((this._loadInt((_36_ + 32))), (this._loadInt((_36_ + 44))), (this._loadInt8u((_36_ + 43))))))) <= (this._loadInt((_36_ + 24)))) {
                        break label$2;
                    }
                    this._storeInt((_36_ + 28), (this._loadInt((_36_ + 32))));
                    this._storeInt((_36_ + 24), (this._loadInt((_36_ + 16))));
                }
                while (false);
                this._storeInt((_36_ + 32), (this._loadInt(((this._loadInt((_36_ + 32))) + 8))));
                continue label$0;
            }
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt((_36_ + 36))) != 0) {
                break label$3;
            }
            label$4:
            do {
                if ((this._loadInt((_36_ + 28))) == 0) {
                    break label$4;
                }
                if (((this._loadInt8u(((this._loadInt((_36_ + 56))) + 15))) & 16) == 0) {
                    break label$3;
                }
            }
            while (false);
            this._storeInt((_36_ + 12), 20508);
            this._storeInt((_36_ + 24), 0);
            this._storeInt((_36_ + 32), (functionSearch((this._loadInt((_36_ + 12))), (this._loadInt((_36_ + 20))), (this._loadInt((_36_ + 52))), (this._loadInt((_36_ + 48))))));
            label$6:
            do {
                label$5:
                while (true) {
                    if ((this._loadInt((_36_ + 32))) == 0) {
                        break label$6;
                    }
                    label$7:
                    do {
                        if ((this._storeInt((_36_ + 8), (matchQuality((this._loadInt((_36_ + 32))), (this._loadInt((_36_ + 44))), (this._loadInt8u((_36_ + 43))))))) <= (this._loadInt((_36_ + 24)))) {
                            break label$7;
                        }
                        this._storeInt((_36_ + 28), (this._loadInt((_36_ + 32))));
                        this._storeInt((_36_ + 24), (this._loadInt((_36_ + 8))));
                    }
                    while (false);
                    this._storeInt((_36_ + 32), (this._loadInt(((this._loadInt((_36_ + 32))) + 8))));
                    continue label$5;
                }
            }
            while (false);
        }
        while (false);
        label$8:
        do {
            if ((this._loadInt((_36_ + 36))) == 0) {
                break label$8;
            }
            label$9:
            do {
                if ((this._loadInt((_36_ + 24))) < 6) {
                    break label$9;
                }
                if ((this._loadInt16s((this._loadInt((_36_ + 28))))) == (this._loadInt((_36_ + 44)))) {
                    break label$8;
                }
            }
            while (false);
            if ((this._storeInt((_36_ + 28), (sqlite3DbMallocZero((this._loadInt((_36_ + 56))), ((this._loadInt((_36_ + 48))) + 37))))) == 0) {
                break label$8;
            }
            this._storeInt16((_35_ = this._loadInt((_36_ + 28))), (this._loadInt((_36_ + 44))));
            this._storeInt((_35_ + 24), (_35_ + 36));
            this._storeInt8(((this._loadInt((_36_ + 28))) + 2), (this._loadInt8u((_36_ + 43))));
            memcpy((this._loadInt(((this._loadInt((_36_ + 28))) + 24))), (this._loadInt((_36_ + 52))), (this._loadInt((_36_ + 48))));
            this._storeInt8(((this._loadInt(((_35_ = this._loadInt((_36_ + 28))) + 24))) + (this._loadInt((_36_ + 48)))), 0);
            sqlite3FuncDefInsert(((this._loadInt((_36_ + 56))) + 320), _35_);
        }
        while (false);
        label$10:
        do {
            label$11:
            do {
                if ((this._loadInt((_36_ + 28))) == 0) {
                    break label$11;
                }
                label$12:
                do {
                    if ((this._loadInt(((this._loadInt((_36_ + 28))) + 16))) != 0) {
                        break label$12;
                    }
                    if ((this._loadInt(((this._loadInt((_36_ + 28))) + 12))) != 0) {
                        break label$12;
                    }
                    if ((this._loadInt((_36_ + 36))) == 0) {
                        break label$11;
                    }
                }
                while (false);
                this._storeInt((_36_ + 60), (this._loadInt((_36_ + 28))));
                break label$10;
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
    public final void functionDestroy(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 4), (this._loadInt(((this._storeInt((_32_ + 8), _31_)) + 32))))) == 0) {
                break label$0;
            }
            if ((this._storeInt((_31_ = this._loadInt((_32_ + 4))), ((this._loadInt(_31_)) + -1))) != 0) {
                break label$0;
            }
            this._viTable[this._tableIndices[this._loadInt(((_31_ = this._loadInt((_32_ + 4))) + 4))]].invoke((this._loadInt((_31_ + 8))));
            sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 4))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int matchQuality(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt8((_33_ + 7), _32_);
        this._storeInt(_33_, 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt16s((this._loadInt((_33_ + 12))))) == -1) {
                    break label$1;
                }
                if ((this._loadInt16s((this._loadInt((_33_ + 12))))) == (this._loadInt((_33_ + 8)))) {
                    break label$1;
                }
                if ((this._loadInt((_33_ + 8))) != -1) {
                    break label$0;
                }
                if ((this._loadInt(((this._loadInt((_33_ + 12))) + 12))) != 0) {
                    break label$1;
                }
                if ((this._loadInt(((this._loadInt((_33_ + 12))) + 16))) == 0) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt(_33_, 1);
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt16s((this._loadInt((_33_ + 12))))) == (this._loadInt((_33_ + 8)))) {
                        break label$3;
                    }
                    if ((this._loadInt((_33_ + 8))) != -1) {
                        break label$2;
                    }
                }
                while (false);
                this._storeInt(_33_, 4);
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt8u((_33_ + 7))) != (this._loadInt8u(((this._loadInt((_33_ + 12))) + 2)))) {
                    break label$4;
                }
                this._storeInt(_33_, ((this._loadInt(_33_)) + 2));
                return (this._loadInt(_33_));
            }
            while (false);
            label$5:
            do {
                label$6:
                do {
                    if ((this._loadInt8u((_33_ + 7))) != 2) {
                        break label$6;
                    }
                    if ((this._loadInt8u(((this._loadInt((_33_ + 12))) + 2))) == 3) {
                        break label$5;
                    }
                }
                while (false);
                if ((this._loadInt8u((_33_ + 7))) != 3) {
                    break label$0;
                }
                if ((this._loadInt8u(((this._loadInt((_33_ + 12))) + 2))) != 2) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt(_33_, ((this._loadInt(_33_)) + 1));
        }
        while (false);
        return (this._loadInt(_33_));
    }

    @Override()
    public final int isFatalError(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) == 0) {
                break label$0;
            }
            if ((this._loadInt((_32_ + 12))) == 5) {
                break label$0;
            }
            _31_ = ((this._loadInt((_32_ + 12))) != 6) ? 1 : 0;
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int sqlite3BtreeBeginTrans(int _30_, int _31_)
    {
        int _32_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        _31_ = this._storeInt((_32_ + 20), 0);
        this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt((_32_ + 28))) + 4))));
        this._storeInt((_32_ + 12), _31_);
        sqlite3BtreeEnter((this._loadInt((_32_ + 28))));
        label$0:
        do {
            if ((this._loadInt8u(((this._loadInt((_32_ + 28))) + 8))) == 2) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 28))) + 8))) != 1) {
                    break label$1;
                }
                if ((this._loadInt((_32_ + 24))) == 0) {
                    break label$0;
                }
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 16))) + 16))) == 0) {
                    break label$2;
                }
                if ((this._loadInt((_32_ + 24))) == 0) {
                    break label$2;
                }
                this._storeInt((_32_ + 12), 8);
                break label$0;
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
                            if ((this._loadInt((_32_ + 24))) == 0) {
                                break label$6;
                            }
                            if ((this._loadInt8u(((this._loadInt((_32_ + 16))) + 23))) == 2) {
                                break label$5;
                            }
                        }
                        while (false);
                        if ((this._loadInt8u(((this._loadInt((_32_ + 16))) + 85))) == 0) {
                            break label$4;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 20), (this._loadInt((this._loadInt(((this._loadInt((_32_ + 16))) + 80))))));
                    break label$3;
                }
                while (false);
                if ((this._loadInt((_32_ + 24))) < 2) {
                    break label$3;
                }
                this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((_32_ + 16))) + 76))));
                label$8:
                do {
                    label$7:
                    while (true) {
                        if ((this._loadInt((_32_ + 8))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt((this._loadInt((_32_ + 8))))) != (this._loadInt((_32_ + 28)))) {
                            break label$8;
                        }
                        this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((_32_ + 8))) + 12))));
                        continue label$7;
                    }
                }
                while (false);
                this._storeInt((_32_ + 20), (this._loadInt((this._loadInt((this._loadInt((_32_ + 8))))))));
            }
            while (false);
            label$9:
            do {
                if ((this._loadInt((_32_ + 20))) == 0) {
                    break label$9;
                }
                this._storeInt((_32_ + 12), 262);
                break label$0;
            }
            while (false);
            if ((this._storeInt((_32_ + 12), (querySharedCacheTableLock((this._loadInt((_32_ + 28))), 1, 1)))) != 0) {
                break label$0;
            }
            this._storeInt8(((_31_ = this._loadInt((_32_ + 16))) + 19), (((this._loadInt((_31_ + 48))) == 0) ? 1 : 0));
            label$10$end:
            do {
                label$10:
                while (true) {
                    _31_ = 0;
                    label$12:
                    do {
                        if ((this._loadInt(((this._loadInt((_32_ + 16))) + 12))) != 0) {
                            break label$12;
                        }
                        _31_ = ((this._storeInt((_32_ + 12), (lockBtree((this._loadInt((_32_ + 16))))))) == 0) ? 1 : 0;
                    }
                    while (false);
                    if (_31_ != 0) {
                        continue label$10;
                    }
                    label$13:
                    do {
                        if ((this._loadInt((_32_ + 12))) != 0) {
                            break label$13;
                        }
                        if ((this._loadInt((_32_ + 24))) == 0) {
                            break label$13;
                        }
                        label$14:
                        do {
                            if ((this._loadInt8u(((this._loadInt((_32_ + 16))) + 16))) == 0) {
                                break label$14;
                            }
                            this._storeInt((_32_ + 12), 8);
                            break label$13;
                        }
                        while (false);
                        if ((this._storeInt((_32_ + 12), (sqlite3PagerBegin((this._loadInt((this._loadInt((_32_ + 16))))), (((this._loadInt((_32_ + 24))) > 1) ? 1 : 0), (sqlite3TempInMemory((this._loadInt((this._loadInt((_32_ + 28))))))))))) != 0) {
                            break label$13;
                        }
                        this._storeInt((_32_ + 12), (newDatabase((this._loadInt((_32_ + 16))))));
                    }
                    while (false);
                    label$15:
                    do {
                        if ((this._loadInt((_32_ + 12))) == 0) {
                            break label$15;
                        }
                        unlockBtreeIfUnused((this._loadInt((_32_ + 16))));
                    }
                    while (false);
                    _31_ = 0;
                    label$16:
                    do {
                        if ((this._loadInt8u((_32_ + 12))) != 5) {
                            break label$16;
                        }
                        if ((this._loadInt8u(((this._loadInt((_32_ + 16))) + 23))) != 0) {
                            break label$16;
                        }
                        _31_ = ((btreeInvokeBusyHandler((this._loadInt((_32_ + 16))))) != 0) ? 1 : 0;
                    }
                    while (false);
                    if (_31_ != 0) {
                        continue label$10;
                    }
                    break label$10$end;
                }
            }
            while (false);
            if ((this._loadInt((_32_ + 12))) != 0) {
                break label$0;
            }
            label$17:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 28))) + 8))) != 0) {
                    break label$17;
                }
                this._storeInt(((_31_ = this._loadInt((_32_ + 16))) + 44), ((this._loadInt((_31_ + 44))) + 1));
                if ((this._loadInt8u(((this._loadInt((_32_ + 28))) + 9))) == 0) {
                    break label$17;
                }
                this._storeInt8(((_31_ = this._loadInt((_32_ + 28))) + 36), 1);
                this._storeInt((_31_ + 40), (this._loadInt(((this._loadInt((_32_ + 16))) + 76))));
                this._storeInt(((this._loadInt((_32_ + 16))) + 76), ((this._loadInt((_32_ + 28))) + 28));
            }
            while (false);
            _temp$0 = 2;
            _temp$1 = 1;
            _temp$2 = ((this._loadInt((_32_ + 24))) != 0) ? _temp$0 : _temp$1;
            this._storeInt8(((_31_ = this._loadInt((_32_ + 28))) + 8), _temp$2);
            label$18:
            do {
                if ((this._loadInt8u((_31_ + 8))) <= (this._loadInt8u(((this._loadInt((_32_ + 16))) + 23)))) {
                    break label$18;
                }
                this._storeInt8(((this._loadInt((_32_ + 16))) + 23), (this._loadInt8u(((this._loadInt((_32_ + 28))) + 8))));
            }
            while (false);
            if ((this._loadInt((_32_ + 24))) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 16))) + 12))));
            this._storeInt(((_31_ = this._loadInt((_32_ + 16))) + 80), (this._loadInt((_32_ + 28))));
            this._storeInt8((_31_ + 84), (((this._loadInt((_32_ + 24))) > 1) ? 1 : 0));
            if ((this._loadInt(((this._loadInt((_32_ + 16))) + 48))) == (sqlite3Get4byte(((this._loadInt(((this._loadInt((_32_ + 4))) + 64))) + 28)))) {
                break label$0;
            }
            if ((this._storeInt((_32_ + 12), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_32_ + 4))) + 68))))))) != 0) {
                break label$0;
            }
            sqlite3Put4byte(((this._loadInt(((this._loadInt((_32_ + 4))) + 64))) + 28), (this._loadInt(((this._loadInt((_32_ + 16))) + 48))));
        }
        while (false);
        label$19:
        do {
            if ((this._loadInt((_32_ + 12))) != 0) {
                break label$19;
            }
            if ((this._loadInt((_32_ + 24))) == 0) {
                break label$19;
            }
            this._storeInt((_32_ + 12), (sqlite3PagerOpenSavepoint((this._loadInt((this._loadInt((_32_ + 16))))), (this._loadInt(((this._loadInt((this._loadInt((_32_ + 28))))) + 480))))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final void sqlite3BtreeGetMeta(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 12))) + 4))));
        sqlite3BtreeEnter((this._loadInt((_33_ + 12))));
        _32_ = sqlite3Get4byte((((this._loadInt(((this._loadInt(((this._loadInt(_33_)) + 12))) + 64))) + ((this._loadInt((_33_ + 8))) << 2)) + 36));
        this._storeInt((this._loadInt((_33_ + 4))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int sqlite3BtreeIsInReadTrans(int _30_)
    {
        return (((this._loadInt8u(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 8))) != 0) ? 1 : 0);
    }

    @Override()
    public final int sqlite3BtreeGetPageSize(int _30_)
    {
        return (this._loadInt(((this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 4))) + 36)));
    }

    @Override()
    public final int sqlite3PagerGetJournalMode(int _30_)
    {
        return (this._loadInt8u(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 5)));
    }

    @Override()
    public final int sqlite3BtreeLastPage(int _30_)
    {
        int _31_ = 0;
        _30_ = btreePagecount((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 4))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3PagerAcquire(int _30_, int _31_, int _32_, int _33_)
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
                        if ((this._loadInt((_34_ + 20))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt(((this._loadInt((_34_ + 24))) + 40))) == 0) {
                            break label$2;
                        }
                        this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((_34_ + 24))) + 40))));
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_34_ + 28), (sqlite3CorruptError(41773)));
                    break label$0;
                }
                while (false);
                this._storeInt((_34_ + 8), (sqlite3PcacheFetch((this._loadInt(((this._loadInt((_34_ + 24))) + 168))), (this._loadInt((_34_ + 20))), 1, (this._loadInt((_34_ + 16))))));
            }
            while (false);
            label$4:
            do {
                label$5:
                do {
                    if ((this._loadInt((_34_ + 8))) == 0) {
                        break label$5;
                    }
                    this._storeInt((_34_ + 4), 0);
                    break label$4;
                }
                while (false);
                label$6:
                do {
                    label$7:
                    do {
                        label$8:
                        do {
                            if ((this._loadInt(((this._loadInt((this._loadInt((_34_ + 16))))) + 16))) == 0) {
                                break label$8;
                            }
                            if ((this._loadInt((_34_ + 12))) == 0) {
                                break label$7;
                            }
                        }
                        while (false);
                        this._storeInt(((this._storeInt((_34_ + 4), (this._loadInt((this._loadInt((_34_ + 16))))))) + 16), (this._loadInt((_34_ + 24))));
                        label$9:
                        do {
                            if ((this._loadInt((_34_ + 20))) < 0) {
                                break label$9;
                            }
                            if ((this._loadInt((_34_ + 20))) != (((this._loadInt((0 + 22332))) / (this._loadInt(((this._loadInt((_34_ + 24))) + 128)))) + 1)) {
                                break label$6;
                            }
                        }
                        while (false);
                        this._storeInt((_34_ + 8), (sqlite3CorruptError(41812)));
                        break label$4;
                    }
                    while (false);
                    this._storeInt((_34_ + 28), 0);
                    break label$0;
                }
                while (false);
                label$10:
                do {
                    label$11:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_34_ + 24))) + 14))) != 0) {
                            break label$11;
                        }
                        if (((this._loadInt(((this._loadInt((_34_ + 24))) + 24))) & 4294967295L) < ((this._loadInt((_34_ + 20))) & 4294967295L)) {
                            break label$11;
                        }
                        if ((this._loadInt((_34_ + 12))) != 0) {
                            break label$11;
                        }
                        if ((this._loadInt((this._loadInt(((this._loadInt((_34_ + 24))) + 60))))) == 0) {
                            break label$11;
                        }
                        if ((this._storeInt((_34_ + 8), (readDbPage((this._loadInt((_34_ + 4))))))) != 0) {
                            break label$4;
                        }
                        break label$10;
                    }
                    while (false);
                    label$12:
                    do {
                        if (((this._loadInt((_34_ + 20))) & 4294967295L) <= ((this._loadInt(((this._loadInt((_34_ + 24))) + 132))) & 4294967295L)) {
                            break label$12;
                        }
                        this._storeInt((_34_ + 8), 13);
                        break label$4;
                    }
                    while (false);
                    label$13:
                    do {
                        if ((this._loadInt((_34_ + 12))) == 0) {
                            break label$13;
                        }
                        sqlite3BeginBenignMalloc();
                        label$14:
                        do {
                            if (((this._loadInt((_34_ + 20))) & 4294967295L) > ((this._loadInt(((this._loadInt((_34_ + 24))) + 28))) & 4294967295L)) {
                                break label$14;
                            }
                            sqlite3BitvecSet((this._loadInt(((this._loadInt((_34_ + 24))) + 56))), (this._loadInt((_34_ + 20))));
                        }
                        while (false);
                        addToSavepointBitvecs((this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))));
                        sqlite3EndBenignMalloc();
                    }
                    while (false);
                    memset((this._loadInt((this._loadInt((_34_ + 4))))), 0, (this._loadInt(((this._loadInt((_34_ + 24))) + 128))));
                }
                while (false);
                this._storeInt((_34_ + 28), 0);
                break label$0;
            }
            while (false);
            label$15:
            do {
                if ((this._loadInt((_34_ + 4))) == 0) {
                    break label$15;
                }
                sqlite3PcacheDrop((this._loadInt((_34_ + 4))));
            }
            while (false);
            pagerUnlockIfUnused((this._loadInt((_34_ + 24))));
            this._storeInt((this._loadInt((_34_ + 16))), 0);
            this._storeInt((_34_ + 28), (this._loadInt((_34_ + 8))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 28));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final int sqlite3PagerGetData(int _30_)
    {
        return (this._loadInt((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_))));
    }

    @Override()
    public final int backupOnePage(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 76), _30_);
        this._storeInt((_33_ + 72), _31_);
        this._storeInt((_33_ + 68), _32_);
        this._storeInt((_33_ + 64), (sqlite3BtreePager((this._loadInt(((this._loadInt((_33_ + 76))) + 4))))));
        this._storeInt((_33_ + 60), (sqlite3BtreeGetPageSize((this._loadInt(((this._loadInt((_33_ + 76))) + 24))))));
        _32_ = this._storeInt((_33_ + 56), (sqlite3BtreeGetPageSize((this._loadInt(((this._loadInt((_33_ + 76))) + 4))))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_33_ + 60))) >= _32_) {
                    break label$1;
                }
                _32_ = this._loadInt((_33_ + 60));
                break label$0;
            }
            while (false);
            _32_ = this._loadInt((_33_ + 56));
        }
        while (false);
        this._storeInt((_33_ + 52), _32_);
        this._storeLong((_33_ + 40), ((this._loadLong32u((_33_ + 72))) * (this._loadLong32s((_33_ + 60)))));
        _30_ = this._storeInt((_33_ + 36), 0);
        label$2:
        do {
            if ((this._loadInt((_33_ + 60))) == (this._loadInt((_33_ + 56)))) {
                break label$2;
            }
            if ((sqlite3PagerIsMemdb((this._loadInt((_33_ + 64))))) == 0) {
                break label$2;
            }
            this._storeInt((_33_ + 36), 8);
        }
        while (false);
        this._storeLong((_33_ + 24), ((this._loadLong((_33_ + 40))) - (this._loadLong32s((_33_ + 60)))));
        label$4:
        do {
            label$3:
            while (true) {
                _32_ = 0;
                label$5:
                do {
                    if ((this._loadInt((_33_ + 36))) != 0) {
                        break label$5;
                    }
                    _32_ = ((this._loadLong((_33_ + 24))) < (this._loadLong((_33_ + 40)))) ? 1 : 0;
                }
                while (false);
                if (_32_ == 0) {
                    break label$4;
                }
                _32_ = this._storeInt((_33_ + 20), _30_);
                this._storeInt((_33_ + 16), ((_31_ = (int) ((this._loadLong((_33_ + 24))) / (this._loadLong32s((_33_ + 56))))) + 1));
                label$6:
                do {
                    if (_31_ == ((this._loadInt((_32_ + 22332))) / (this._loadInt(((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 76))) + 4))) + 4))) + 36))))) {
                        break label$6;
                    }
                    label$7:
                    do {
                        if ((this._storeInt((_33_ + 36), (sqlite3PagerAcquire((this._loadInt((_33_ + 64))), (this._loadInt((_33_ + 16))), (_33_ + 20), _32_)))) != 0) {
                            break label$7;
                        }
                        if ((this._storeInt((_33_ + 36), (sqlite3PagerWrite((this._loadInt((_33_ + 20))))))) != 0) {
                            break label$7;
                        }
                        this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 68))) + ((int) ((this._loadLong((_33_ + 24))) % (this._loadLong32s((_33_ + 60)))))));
                        memcpy((this._storeInt((_33_ + 4), ((this._storeInt((_33_ + 8), (sqlite3PagerGetData((this._loadInt((_33_ + 20))))))) + ((int) ((this._loadLong((_33_ + 24))) % (this._loadLong32s((_33_ + 56)))))))), (this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 52))));
                        this._storeInt8((sqlite3PagerGetExtra((this._loadInt((_33_ + 20))))), _32_);
                    }
                    while (false);
                    sqlite3PagerUnref((this._loadInt((_33_ + 20))));
                }
                while (false);
                this._storeLong((_33_ + 24), ((this._loadLong((_33_ + 24))) + (this._loadLong32s((_33_ + 56)))));
                continue label$3;
            }
        }
        while (false);
        _32_ = this._loadInt((_33_ + 36));
        this._storeInt((0 + 4), (_33_ + 80));
        return _32_;
    }

    @Override()
    public final void sqlite3PagerUnref(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) == 0) {
                break label$0;
            }
            this._storeInt((_31_ + 8), (this._loadInt(((this._loadInt((_31_ + 12))) + 16))));
            sqlite3PcacheRelease((this._loadInt((_31_ + 12))));
            pagerUnlockIfUnused((this._loadInt((_31_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void attachBackupObject(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (sqlite3PagerBackupPtr((sqlite3BtreePager((this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 24))))))));
        this._storeInt(((_32_ = this._loadInt((_31_ + 12))) + 44), (this._loadInt(_30_)));
        this._storeInt(_30_, _32_);
        this._storeInt(((this._loadInt((_31_ + 12))) + 40), 1);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3BtreeUpdateMeta(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 16), (this._loadInt(((this._loadInt((_33_ + 28))) + 4))));
        sqlite3BtreeEnter((this._loadInt((_33_ + 28))));
        this._storeInt((_33_ + 12), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 16))) + 12))) + 64))));
        label$0:
        do {
            if ((this._storeInt((_33_ + 8), (sqlite3PagerWrite((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 16))) + 12))) + 68))))))) != 0) {
                break label$0;
            }
            sqlite3Put4byte((((this._loadInt((_33_ + 12))) + ((this._loadInt((_33_ + 24))) << 2)) + 36), (this._loadInt((_33_ + 20))));
            if ((this._loadInt((_33_ + 24))) != 7) {
                break label$0;
            }
            this._storeInt8(((this._loadInt((_33_ + 16))) + 22), (this._loadInt((_33_ + 20))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 8));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final void sqlite3ResetInternalSchema(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 24), _31_)) < 0) {
                    break label$1;
                }
                sqlite3SchemaClear((this._loadInt(((this._storeInt((_32_ + 12), ((this._loadInt(((this._loadInt((_32_ + 28))) + 8))) + ((this._loadInt((_32_ + 24))) << 4)))) + 12))));
                if ((this._loadInt((_32_ + 24))) == 1) {
                    break label$0;
                }
                this._storeInt((_32_ + 12), ((_31_ = this._loadInt(((this._loadInt((_32_ + 28))) + 8))) + 16));
                sqlite3SchemaClear((this._loadInt((_31_ + 28))));
                break label$0;
            }
            while (false);
            sqlite3BtreeEnterAll((this._loadInt((_32_ + 28))));
            this._storeInt((_32_ + 20), 0);
            label$3:
            do {
                label$2:
                while (true) {
                    if ((this._loadInt((_32_ + 20))) >= (this._loadInt(((this._loadInt((_32_ + 28))) + 4)))) {
                        break label$3;
                    }
                    label$4:
                    do {
                        if ((this._loadInt(((this._storeInt((_32_ + 8), ((this._loadInt(((this._loadInt((_32_ + 28))) + 8))) + ((this._loadInt((_32_ + 20))) << 4)))) + 12))) == 0) {
                            break label$4;
                        }
                        sqlite3SchemaClear((this._loadInt(((this._loadInt((_32_ + 8))) + 12))));
                    }
                    while (false);
                    this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1));
                    continue label$2;
                }
            }
            while (false);
            this._storeInt(((_31_ = this._loadInt((_32_ + 28))) + 12), ((this._loadInt((_31_ + 12))) & -513));
            sqlite3VtabUnlockList(_31_);
            this._storeInt((_32_ + 20), (this._storeInt((_32_ + 16), 2)));
            label$6:
            do {
                label$5:
                while (true) {
                    if ((this._loadInt((_32_ + 20))) >= (this._loadInt(((this._loadInt((_32_ + 28))) + 4)))) {
                        break label$6;
                    }
                    label$7:
                    do {
                        label$8:
                        do {
                            if ((this._loadInt(((this._storeInt((_32_ + 4), ((this._loadInt(((this._loadInt((_32_ + 28))) + 8))) + ((this._loadInt((_32_ + 20))) << 4)))) + 4))) == 0) {
                                break label$8;
                            }
                            label$9:
                            do {
                                if ((this._loadInt((_32_ + 16))) >= (this._loadInt((_32_ + 20)))) {
                                    break label$9;
                                }
                                this._storeInt((_31_ = (_30_ = this._loadInt(((this._loadInt((_32_ + 28))) + 8))) + ((this._loadInt((_32_ + 16))) << 4)), (this._loadInt((_30_ = _30_ + ((this._loadInt((_32_ + 20))) << 4)))));
                                this._storeInt((_31_ + 12), (this._loadInt((_30_ + 12))));
                                this._storeInt((_31_ + 8), (this._loadInt((_30_ + 8))));
                                this._storeInt((_31_ + 4), (this._loadInt((_30_ + 4))));
                            }
                            while (false);
                            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                            break label$7;
                        }
                        while (false);
                        sqlite3DbFree((this._loadInt((_32_ + 28))), (this._loadInt((this._loadInt((_32_ + 4))))));
                        this._storeInt((this._loadInt((_32_ + 4))), 0);
                    }
                    while (false);
                    this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1));
                    continue label$5;
                }
            }
            while (false);
            memset(((this._loadInt(((_31_ = this._loadInt((_32_ + 28))) + 8))) + ((_30_ = this._loadInt((_32_ + 16))) << 4)), 0, (((this._loadInt((_31_ + 4))) - _30_) << 4));
            if ((this._storeInt(((this._loadInt((_32_ + 28))) + 4), (this._loadInt((_32_ + 16))))) > 2) {
                break label$0;
            }
            if ((this._loadInt(((_31_ = this._loadInt((_32_ + 28))) + 8))) == (_31_ + 444)) {
                break label$0;
            }
            memcpy(((_31_ = this._loadInt((_32_ + 28))) + 444), (this._loadInt((_31_ + 8))), 32);
            sqlite3DbFree((_31_ = this._loadInt((_32_ + 28))), (this._loadInt((_31_ + 8))));
            this._storeInt(((_31_ = this._loadInt((_32_ + 28))) + 8), (_31_ + 444));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void sqlite3PagerTruncateImage(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt(((this._loadInt((_32_ + 12))) + 24), _31_);
        return;
    }

    @Override()
    public final int sqlite3PagerFile(int _30_)
    {
        return (this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 60)));
    }

    @Override()
    public final int sqlite3PagerCommitPhaseOne(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _34_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_33_ + 36), _31_);
        this._storeInt((_33_ + 32), _32_);
        this._storeInt((_33_ + 28), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_33_ + 40))) + 40))) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 44), (this._loadInt(((this._loadInt((_33_ + 40))) + 40))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 40))) + 15))) > 2) {
                    break label$2;
                }
                this._storeInt((_33_ + 44), 0);
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if ((this._loadInt8u(((this._loadInt((_33_ + 40))) + 14))) == 0) {
                        break label$4;
                    }
                    sqlite3BackupRestart((this._loadInt(((this._loadInt((_33_ + 40))) + 88))));
                    break label$3;
                }
                while (false);
                label$5:
                do {
                    if ((pagerUseWal((this._loadInt((_33_ + 40))))) == 0) {
                        break label$5;
                    }
                    this._storeInt((_33_ + 24), (sqlite3PcacheDirtyList((this._loadInt(((this._loadInt((_33_ + 40))) + 168))))));
                    _32_ = this._storeInt((_33_ + 20), 0);
                    label$6:
                    do {
                        if ((this._loadInt((_33_ + 24))) != 0) {
                            break label$6;
                        }
                        this._storeInt((_33_ + 28), (sqlite3PagerAcquire((this._loadInt((_33_ + 40))), 1, (_33_ + 20), _32_)));
                        this._storeInt(((_31_ = this._loadInt((_33_ + 20))) + 8), _32_);
                        this._storeInt((_33_ + 24), _31_);
                    }
                    while (false);
                    label$7:
                    do {
                        if ((this._loadInt((_33_ + 24))) == 0) {
                            break label$7;
                        }
                        _30_ = this._loadInt(((_32_ = this._loadInt((_33_ + 40))) + 24));
                        _31_ = 0;
                        _34_ = this._loadInt((_33_ + 24));
                        label$8:
                        do {
                            if ((this._loadInt8u((_32_ + 9))) == 0) {
                                break label$8;
                            }
                            _31_ = this._loadInt8u(((this._loadInt((_33_ + 40))) + 11));
                        }
                        while (false);
                        this._storeInt((_33_ + 28), (pagerWalFrames(_32_, _34_, _30_, 1, _31_)));
                    }
                    while (false);
                    sqlite3PagerUnref((this._loadInt((_33_ + 20))));
                    if ((this._loadInt((_33_ + 28))) != 0) {
                        break label$3;
                    }
                    sqlite3PcacheCleanAll((this._loadInt(((this._loadInt((_33_ + 40))) + 168))));
                    break label$3;
                }
                while (false);
                if ((this._storeInt((_33_ + 28), (pager_incr_changecounter((this._loadInt((_33_ + 40))), 0)))) != 0) {
                    break label$3;
                }
                label$9:
                do {
                    if (((this._loadInt(((_32_ = this._loadInt((_33_ + 40))) + 24))) & 4294967295L) >= ((this._loadInt((_32_ + 28))) & 4294967295L)) {
                        break label$9;
                    }
                    if ((this._loadInt8u(((this._loadInt((_33_ + 40))) + 5))) == 2) {
                        break label$9;
                    }
                    this._storeInt((_33_ + 12), (((this._loadInt((0 + 22332))) / (this._loadInt(((this._loadInt((_33_ + 40))) + 128)))) + 1));
                    _32_ = this._storeInt((_33_ + 8), (this._loadInt(((this._loadInt((_33_ + 40))) + 24))));
                    this._storeInt(((_31_ = this._loadInt((_33_ + 40))) + 24), (this._loadInt((_31_ + 28))));
                    this._storeInt((_33_ + 16), (_32_ + 1));
                    label$11:
                    do {
                        label$10:
                        while (true) {
                            if (((this._loadInt((_33_ + 16))) & 4294967295L) > ((this._loadInt(((this._loadInt((_33_ + 40))) + 28))) & 4294967295L)) {
                                break label$11;
                            }
                            label$12:
                            do {
                                if ((sqlite3BitvecTest((this._loadInt(((this._loadInt((_33_ + 40))) + 56))), (this._loadInt((_33_ + 16))))) != 0) {
                                    break label$12;
                                }
                                if ((this._loadInt((_33_ + 16))) == (this._loadInt((_33_ + 12)))) {
                                    break label$12;
                                }
                                if ((this._storeInt((_33_ + 28), (sqlite3PagerAcquire((this._loadInt((_33_ + 40))), (this._loadInt((_33_ + 16))), (_33_ + 4), 0)))) != 0) {
                                    break label$3;
                                }
                                this._storeInt((_33_ + 28), (sqlite3PagerWrite((this._loadInt((_33_ + 4))))));
                                sqlite3PagerUnref((this._loadInt((_33_ + 4))));
                                if ((this._loadInt((_33_ + 28))) != 0) {
                                    break label$3;
                                }
                            }
                            while (false);
                            this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + 1));
                            continue label$10;
                        }
                    }
                    while (false);
                    this._storeInt(((this._loadInt((_33_ + 40))) + 24), (this._loadInt((_33_ + 8))));
                }
                while (false);
                if ((this._storeInt((_33_ + 28), (writeMasterJournal((this._loadInt((_33_ + 40))), (this._loadInt((_33_ + 36))))))) != 0) {
                    break label$3;
                }
                if ((this._storeInt((_33_ + 28), (syncJournal((this._loadInt((_33_ + 40))), 0)))) != 0) {
                    break label$3;
                }
                if ((this._storeInt((_33_ + 28), (pager_write_pagelist((_32_ = this._loadInt((_33_ + 40))), (sqlite3PcacheDirtyList((this._loadInt((_32_ + 168))))))))) != 0) {
                    break label$3;
                }
                sqlite3PcacheCleanAll((this._loadInt(((this._loadInt((_33_ + 40))) + 168))));
                label$13:
                do {
                    if ((this._loadInt(((_32_ = this._loadInt((_33_ + 40))) + 24))) == (this._loadInt((_32_ + 32)))) {
                        break label$13;
                    }
                    _32_ = this._storeInt(_33_, ((_31_ = this._loadInt(((_32_ = this._loadInt((_33_ + 40))) + 24))) - ((_31_ == (((this._loadInt((0 + 22332))) / (this._loadInt((_32_ + 128)))) + 1)) ? 1 : 0)));
                    if ((this._storeInt((_33_ + 28), (pager_truncate((this._loadInt((_33_ + 40))), _32_)))) != 0) {
                        break label$3;
                    }
                }
                while (false);
                if ((this._loadInt((_33_ + 32))) != 0) {
                    break label$3;
                }
                this._storeInt((_33_ + 28), (sqlite3PagerSync((this._loadInt((_33_ + 40))))));
            }
            while (false);
            label$14:
            do {
                if ((this._loadInt((_33_ + 28))) != 0) {
                    break label$14;
                }
                if ((pagerUseWal((this._loadInt((_33_ + 40))))) != 0) {
                    break label$14;
                }
                this._storeInt8(((this._loadInt((_33_ + 40))) + 15), 5);
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
    public final int backupTruncateFile(int _30_, long _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeLong((_32_ + 16), _31_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 4), (sqlite3OsFileSize((this._loadInt((_32_ + 28))), (_32_ + 8))))) != 0) {
                break label$0;
            }
            if ((this._loadLong((_32_ + 8))) <= (this._loadLong((_32_ + 16)))) {
                break label$0;
            }
            this._storeInt((_32_ + 4), (sqlite3OsTruncate((this._loadInt((_32_ + 28))), (this._loadLong((_32_ + 16))))));
        }
        while (false);
        _30_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 32));
        return _30_;
    }

    @Override()
    public final int sqlite3PagerSync(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_31_ + 8), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 12))) + 8))) == 0) {
                    break label$1;
                }
                if ((this._loadInt((this._loadInt(((this._loadInt((_31_ + 12))) + 60))))) == 0) {
                    break label$0;
                }
                sqlite3OsFileControl((this._loadInt(((this._loadInt((_31_ + 12))) + 60))), 8, (_31_ + 8));
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 8), (sqlite3OsSync((this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 60))), (this._loadInt8u((_30_ + 11))))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3BtreeCommitPhaseTwo(int _30_, int _31_)
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
                    if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 8))) == 0) {
                        break label$2;
                    }
                    sqlite3BtreeEnter((this._loadInt((_32_ + 24))));
                    label$3:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 8))) != 2) {
                            break label$3;
                        }
                        label$4:
                        do {
                            if ((this._storeInt((_32_ + 16), (sqlite3PagerCommitPhaseTwo((this._loadInt((this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 24))) + 4))))))))))) == 0) {
                                break label$4;
                            }
                            if ((this._loadInt((_32_ + 20))) == 0) {
                                break label$1;
                            }
                        }
                        while (false);
                        this._storeInt8(((this._loadInt((_32_ + 12))) + 23), 1);
                    }
                    while (false);
                    btreeEndTransaction((this._loadInt((_32_ + 24))));
                    this._storeInt((_32_ + 28), 0);
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
    public final int sqlite3BtreeCommitPhaseOne(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 16), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 8))) != 2) {
                    break label$1;
                }
                this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 24))) + 4))));
                sqlite3BtreeEnter((this._loadInt((_32_ + 24))));
                label$2:
                do {
                    if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 21))) == 0) {
                        break label$2;
                    }
                    if ((this._storeInt((_32_ + 16), (autoVacuumCommit((this._loadInt((_32_ + 12))))))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 16), (sqlite3PagerCommitPhaseOne((this._loadInt((this._loadInt((_32_ + 12))))), (this._loadInt((_32_ + 20))), 0)));
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
    public final int autoVacuumCommit(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_31_ + 36), 0);
        this._storeInt((_31_ + 32), (this._loadInt((this._loadInt((_31_ + 40))))));
        invalidateAllOverflowCache((this._loadInt((_31_ + 40))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 40))) + 22))) != 0) {
                    break label$1;
                }
                _30_ = this._storeInt((_31_ + 8), (btreePagecount((this._loadInt((_31_ + 40))))));
                label$2:
                do {
                    label$3:
                    do {
                        if ((ptrmapPageno((this._loadInt((_31_ + 40))), _30_)) == (this._loadInt((_31_ + 8)))) {
                            break label$3;
                        }
                        if ((this._loadInt((_31_ + 8))) != (((this._loadInt((0 + 22332))) / (this._loadInt(((this._loadInt((_31_ + 40))) + 36)))) + 1)) {
                            break label$2;
                        }
                    }
                    while (false);
                    this._storeInt((_31_ + 44), (sqlite3CorruptError(50548)));
                    break label$0;
                }
                while (false);
                this._storeInt((_31_ + 24), (sqlite3Get4byte(((this._loadInt(((this._loadInt(((this._loadInt((_31_ + 40))) + 12))) + 64))) + 36))));
                this._storeInt((_31_ + 12), ((this._loadInt(((this._loadInt((_31_ + 40))) + 40))) / 5));
                _30_ = this._storeInt((_31_ + 20), (((((this._loadInt((_31_ + 24))) - (_30_ = this._loadInt((_31_ + 8)))) + (ptrmapPageno((this._loadInt((_31_ + 40))), _30_))) + (_30_ = this._loadInt((_31_ + 12)))) / _30_));
                this._storeInt((_31_ + 28), (((this._loadInt((_31_ + 8))) - (this._loadInt((_31_ + 24)))) - _30_));
                label$4:
                do {
                    if (((this._loadInt((_31_ + 8))) & 4294967295L) <= ((((this._loadInt((0 + 22332))) / (this._loadInt(((this._loadInt((_31_ + 40))) + 36)))) + 1) & 4294967295L)) {
                        break label$4;
                    }
                    if (((this._loadInt((_31_ + 28))) & 4294967295L) >= ((((this._loadInt((0 + 22332))) / (this._loadInt(((this._loadInt((_31_ + 40))) + 36)))) + 1) & 4294967295L)) {
                        break label$4;
                    }
                    this._storeInt((_31_ + 28), ((this._loadInt((_31_ + 28))) + -1));
                }
                while (false);
                label$6:
                do {
                    label$5:
                    while (true) {
                        _30_ = 1;
                        label$7:
                        do {
                            if ((ptrmapPageno((this._loadInt((_31_ + 40))), (this._loadInt((_31_ + 28))))) == (this._loadInt((_31_ + 28)))) {
                                break label$7;
                            }
                            _30_ = ((this._loadInt((_31_ + 28))) == (((this._loadInt((0 + 22332))) / (this._loadInt(((this._loadInt((_31_ + 40))) + 36)))) + 1)) ? 1 : 0;
                        }
                        while (false);
                        if (_30_ == 0) {
                            break label$6;
                        }
                        this._storeInt((_31_ + 28), ((this._loadInt((_31_ + 28))) + -1));
                        continue label$5;
                    }
                }
                while (false);
                label$8:
                do {
                    if (((this._loadInt((_31_ + 28))) & 4294967295L) <= ((this._loadInt((_31_ + 8))) & 4294967295L)) {
                        break label$8;
                    }
                    this._storeInt((_31_ + 44), (sqlite3CorruptError(50561)));
                    break label$0;
                }
                while (false);
                this._storeInt((_31_ + 16), (this._loadInt((_31_ + 8))));
                label$10:
                do {
                    label$9:
                    while (true) {
                        _30_ = 0;
                        label$11:
                        do {
                            if (((this._loadInt((_31_ + 16))) & 4294967295L) <= ((this._loadInt((_31_ + 28))) & 4294967295L)) {
                                break label$11;
                            }
                            _30_ = ((this._loadInt((_31_ + 36))) == 0) ? 1 : 0;
                        }
                        while (false);
                        if (_30_ == 0) {
                            break label$10;
                        }
                        this._storeInt((_31_ + 36), (incrVacuumStep((this._loadInt((_31_ + 40))), (this._loadInt((_31_ + 28))), (this._loadInt((_31_ + 16))))));
                        this._storeInt((_31_ + 16), ((this._loadInt((_31_ + 16))) + -1));
                        continue label$9;
                    }
                }
                while (false);
                label$12:
                do {
                    label$13:
                    do {
                        if ((this._loadInt((_31_ + 36))) == 101) {
                            break label$13;
                        }
                        if ((this._loadInt((_31_ + 36))) != 0) {
                            break label$12;
                        }
                    }
                    while (false);
                    if ((this._loadInt((_31_ + 24))) == 0) {
                        break label$12;
                    }
                    this._storeInt((_31_ + 36), (sqlite3PagerWrite((this._loadInt(((this._loadInt(((this._loadInt((_31_ + 40))) + 12))) + 68))))));
                    sqlite3Put4byte(((this._loadInt(((this._loadInt(((this._loadInt((_31_ + 40))) + 12))) + 64))) + 32), 0);
                    sqlite3Put4byte(((this._loadInt(((this._loadInt(((this._loadInt((_31_ + 40))) + 12))) + 64))) + 36), 0);
                    sqlite3Put4byte(((this._loadInt(((this._loadInt(((this._loadInt((_31_ + 40))) + 12))) + 64))) + 28), (this._loadInt((_31_ + 28))));
                    sqlite3PagerTruncateImage((this._loadInt((this._loadInt((_31_ + 40))))), (this._loadInt((_31_ + 28))));
                    this._storeInt(((this._loadInt((_31_ + 40))) + 48), (this._loadInt((_31_ + 28))));
                }
                while (false);
                if ((this._loadInt((_31_ + 36))) == 0) {
                    break label$1;
                }
                sqlite3PagerRollback((this._loadInt((_31_ + 32))));
            }
            while (false);
            this._storeInt((_31_ + 44), (this._loadInt((_31_ + 36))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 44));
        this._storeInt((0 + 4), (_31_ + 48));
        return _30_;
    }

    @Override()
    public final void invalidateAllOverflowCache(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 8))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 8))) == 0) {
                    break label$1;
                }
                invalidateOverflowCache((this._loadInt((_31_ + 8))));
                this._storeInt((_31_ + 8), (this._loadInt(((this._loadInt((_31_ + 8))) + 8))));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int btreePagecount(int _30_)
    {
        return (this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 48)));
    }

    @Override()
    public final int ptrmapPageno(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        label$0:
        do {
            if (((this._storeInt((_32_ + 20), _31_)) & 4294967295L) > (1 & 4294967295L)) {
                break label$0;
            }
            this._storeInt((_32_ + 28), 0);
            return (this._loadInt((_32_ + 28)));
        }
        while (false);
        _31_ = this._storeInt((_32_ + 16), (((this._loadInt(((this._loadInt((_32_ + 24))) + 40))) / 5) + 1));
        label$1:
        do {
            if ((this._storeInt((_32_ + 8), (((this._storeInt((_32_ + 12), (((this._loadInt((_32_ + 20))) + -2) / _31_))) * (this._loadInt((_32_ + 16)))) + 2))) != (((this._loadInt((0 + 22332))) / (this._loadInt(((this._loadInt((_32_ + 24))) + 36)))) + 1)) {
                break label$1;
            }
            this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) + 1));
        }
        while (false);
        this._storeInt((_32_ + 28), (this._loadInt((_32_ + 8))));
        return (this._loadInt((_32_ + 28)));
    }

    @Override()
    public final int incrVacuumStep(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_33_ + 52), _31_);
        this._storeInt((_33_ + 48), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((ptrmapPageno((this._loadInt((_33_ + 56))), _32_)) == (this._loadInt((_33_ + 48)))) {
                    break label$1;
                }
                if ((this._loadInt((_33_ + 48))) == (((this._loadInt((0 + 22332))) / (this._loadInt(((this._loadInt((_33_ + 56))) + 36)))) + 1)) {
                    break label$1;
                }
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeInt((_33_ + 44), (sqlite3Get4byte(((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 56))) + 12))) + 64))) + 36))))) == 0) {
                            break label$3;
                        }
                        if ((this._storeInt((_33_ + 40), (ptrmapGet((this._loadInt((_33_ + 56))), (this._loadInt((_33_ + 48))), (_33_ + 39), (_33_ + 32))))) == 0) {
                            break label$2;
                        }
                        this._storeInt((_33_ + 60), (this._loadInt((_33_ + 40))));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_33_ + 60), 101);
                    break label$0;
                }
                while (false);
                label$4:
                do {
                    if ((this._loadInt8u((_33_ + 39))) != 1) {
                        break label$4;
                    }
                    this._storeInt((_33_ + 60), (sqlite3CorruptError(50409)));
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
                                if ((this._loadInt8u((_33_ + 39))) != 2) {
                                    break label$8;
                                }
                                if ((this._loadInt((_33_ + 52))) == 0) {
                                    break label$7;
                                }
                                break label$1;
                            }
                            while (false);
                            label$9:
                            do {
                                if ((this._storeInt((_33_ + 40), (btreeGetPage((this._loadInt((_33_ + 56))), (this._loadInt((_33_ + 48))), (_33_ + 16), 0)))) == 0) {
                                    break label$9;
                                }
                                this._storeInt((_33_ + 60), (this._loadInt((_33_ + 40))));
                                break label$0;
                            }
                            while (false);
                            label$10$end:
                            do {
                                label$10:
                                while (true) {
                                    if ((this._storeInt((_33_ + 40), (allocateBtreePage((this._loadInt((_33_ + 56))), (_33_ + 12), (_33_ + 20), 0, 0)))) != 0) {
                                        break label$6;
                                    }
                                    releasePage((this._loadInt((_33_ + 12))));
                                    _32_ = 0;
                                    label$12:
                                    do {
                                        if ((this._loadInt((_33_ + 52))) == 0) {
                                            break label$12;
                                        }
                                        _32_ = (((this._loadInt((_33_ + 20))) & 4294967295L) > ((this._loadInt((_33_ + 52))) & 4294967295L)) ? 1 : 0;
                                    }
                                    while (false);
                                    if (_32_ != 0) {
                                        continue label$10;
                                    }
                                    break label$10$end;
                                }
                            }
                            while (false);
                            label$13:
                            do {
                                if ((this._storeInt((_33_ + 40), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_33_ + 16))) + 68))))))) != 0) {
                                    break label$13;
                                }
                                this._storeInt((_33_ + 40), (relocatePage((this._loadInt((_33_ + 56))), (this._loadInt((_33_ + 16))), (this._loadInt8u((_33_ + 39))), (this._loadInt((_33_ + 32))), (this._loadInt((_33_ + 20))), (((this._loadInt((_33_ + 52))) != 0) ? 1 : 0))));
                            }
                            while (false);
                            releasePage((this._loadInt((_33_ + 16))));
                            if ((this._loadInt((_33_ + 40))) == 0) {
                                break label$1;
                            }
                            this._storeInt((_33_ + 60), (this._loadInt((_33_ + 40))));
                            break label$0;
                        }
                        while (false);
                        if ((this._storeInt((_33_ + 40), (allocateBtreePage((this._loadInt((_33_ + 56))), (_33_ + 24), (_33_ + 28), (this._loadInt((_33_ + 48))), 1)))) == 0) {
                            break label$5;
                        }
                        this._storeInt((_33_ + 60), (this._loadInt((_33_ + 40))));
                        break label$0;
                    }
                    while (false);
                    releasePage((this._loadInt((_33_ + 16))));
                    this._storeInt((_33_ + 60), (this._loadInt((_33_ + 40))));
                    break label$0;
                }
                while (false);
                releasePage((this._loadInt((_33_ + 24))));
            }
            while (false);
            label$14:
            do {
                label$15:
                do {
                    if ((this._loadInt((_33_ + 52))) != 0) {
                        break label$15;
                    }
                    this._storeInt((_33_ + 48), ((this._loadInt((_33_ + 48))) + -1));
                    label$16:
                    do {
                        label$18:
                        do {
                            label$17:
                            while (true) {
                                _32_ = 1;
                                label$19:
                                do {
                                    if ((this._loadInt((_33_ + 48))) == (((this._loadInt((0 + 22332))) / (this._loadInt(((this._loadInt((_33_ + 56))) + 36)))) + 1)) {
                                        break label$19;
                                    }
                                    _32_ = ((ptrmapPageno((this._loadInt((_33_ + 56))), (this._loadInt((_33_ + 48))))) == (this._loadInt((_33_ + 48)))) ? 1 : 0;
                                }
                                while (false);
                                if (_32_ == 0) {
                                    break label$16;
                                }
                                label$20:
                                do {
                                    if ((ptrmapPageno((this._loadInt((_33_ + 56))), (this._loadInt((_33_ + 48))))) != (this._loadInt((_33_ + 48)))) {
                                        break label$20;
                                    }
                                    if ((this._storeInt((_33_ + 40), (btreeGetPage((this._loadInt((_33_ + 56))), (this._loadInt((_33_ + 48))), (_33_ + 8), 0)))) != 0) {
                                        break label$14;
                                    }
                                    this._storeInt((_33_ + 40), (sqlite3PagerWrite((this._loadInt(((this._loadInt((_33_ + 8))) + 68))))));
                                    releasePage((this._loadInt((_33_ + 8))));
                                    if ((this._loadInt((_33_ + 40))) != 0) {
                                        break label$18;
                                    }
                                }
                                while (false);
                                this._storeInt((_33_ + 48), ((this._loadInt((_33_ + 48))) + -1));
                                continue label$17;
                            }
                        }
                        while (false);
                        this._storeInt((_33_ + 60), (this._loadInt((_33_ + 40))));
                        break label$0;
                    }
                    while (false);
                    sqlite3PagerTruncateImage((this._loadInt((this._loadInt((_33_ + 56))))), (this._loadInt((_33_ + 48))));
                    this._storeInt(((this._loadInt((_33_ + 56))) + 48), (this._loadInt((_33_ + 48))));
                }
                while (false);
                this._storeInt((_33_ + 60), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 60), (this._loadInt((_33_ + 40))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 60));
        this._storeInt((0 + 4), (_33_ + 64));
        return _32_;
    }

    @Override()
    public final int sqlite3PagerWrite(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        _31_ = this._storeInt((_32_ + 56), 0);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if (((this._storeInt((_32_ + 44), ((this._loadInt(((_30_ = this._storeInt((_32_ + 48), (this._loadInt(((this._storeInt((_32_ + 52), (this._loadInt((_32_ + 60))))) + 16))))) + 124))) / (this._loadInt((_30_ + 128)))))) & 4294967295L) < (2 & 4294967295L)) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 24), (this._storeInt((_32_ + 32), _31_)));
                        this._storeInt8(((_30_ = this._loadInt((_32_ + 48))) + 20), ((this._loadInt8u((_30_ + 20))) + 1));
                        this._storeInt((_32_ + 36), ((((this._loadInt(((this._loadInt((_32_ + 52))) + 12))) + -1) & (((this._loadInt((_32_ + 44))) + -1) ^ -1)) + 1));
                        _30_ = this._storeInt((_32_ + 40), (this._loadInt(((this._loadInt((_32_ + 48))) + 24))));
                        if (((this._loadInt(((this._loadInt((_32_ + 52))) + 12))) & 4294967295L) <= (_30_ & 4294967295L)) {
                            break label$2;
                        }
                        this._storeInt((_32_ + 32), (((this._loadInt(((this._loadInt((_32_ + 52))) + 12))) - (this._loadInt((_32_ + 36)))) + 1));
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_32_ + 56), (pager_write((this._loadInt((_32_ + 60))))));
                    break label$0;
                }
                while (false);
                label$4:
                do {
                    if (((((this._loadInt((_32_ + 36))) + (this._loadInt((_32_ + 44)))) + -1) & 4294967295L) <= ((this._loadInt((_32_ + 40))) & 4294967295L)) {
                        break label$4;
                    }
                    this._storeInt((_32_ + 32), (((this._loadInt((_32_ + 40))) + 1) - (this._loadInt((_32_ + 36)))));
                    break label$1;
                }
                while (false);
                this._storeInt((_32_ + 32), (this._loadInt((_32_ + 44))));
            }
            while (false);
            _31_ = this._storeInt((_32_ + 28), 0);
            label$6:
            do {
                label$5:
                while (true) {
                    _30_ = 0;
                    label$7:
                    do {
                        if ((this._loadInt((_32_ + 28))) >= (this._loadInt((_32_ + 32)))) {
                            break label$7;
                        }
                        _30_ = ((this._loadInt((_32_ + 56))) == 0) ? 1 : 0;
                    }
                    while (false);
                    if (_30_ == 0) {
                        break label$6;
                    }
                    label$8:
                    do {
                        label$9:
                        do {
                            if ((this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 36))) + (this._loadInt((_32_ + 28)))))) == (this._loadInt(((this._loadInt((_32_ + 52))) + 12)))) {
                                break label$9;
                            }
                            if ((sqlite3BitvecTest((this._loadInt(((this._loadInt((_32_ + 48))) + 56))), (this._loadInt((_32_ + 20))))) == 0) {
                                break label$9;
                            }
                            if ((this._storeInt((_32_ + 16), (pager_lookup((this._loadInt((_32_ + 48))), (this._loadInt((_32_ + 20))))))) == 0) {
                                break label$8;
                            }
                            label$10:
                            do {
                                if (((this._loadInt16u(((this._loadInt((_32_ + 16))) + 20))) & 4) == 0) {
                                    break label$10;
                                }
                                this._storeInt((_32_ + 24), 1);
                            }
                            while (false);
                            sqlite3PagerUnref((this._loadInt((_32_ + 16))));
                            break label$8;
                        }
                        while (false);
                        if ((this._loadInt((_32_ + 20))) == (((this._loadInt((_31_ + 22332))) / (this._loadInt(((this._loadInt((_32_ + 48))) + 128)))) + 1)) {
                            break label$8;
                        }
                        if ((this._storeInt((_32_ + 56), (sqlite3PagerAcquire((this._loadInt((_32_ + 48))), (this._loadInt((_32_ + 20))), (_32_ + 16), _31_)))) != 0) {
                            break label$8;
                        }
                        this._storeInt((_32_ + 56), (pager_write((this._loadInt((_32_ + 16))))));
                        label$11:
                        do {
                            if (((this._loadInt16u(((this._loadInt((_32_ + 16))) + 20))) & 4) == 0) {
                                break label$11;
                            }
                            this._storeInt((_32_ + 24), 1);
                        }
                        while (false);
                        sqlite3PagerUnref((this._loadInt((_32_ + 16))));
                    }
                    while (false);
                    this._storeInt((_32_ + 28), ((this._loadInt((_32_ + 28))) + 1));
                    continue label$5;
                }
            }
            while (false);
            label$12:
            do {
                if ((this._loadInt((_32_ + 56))) != 0) {
                    break label$12;
                }
                if ((this._loadInt((_32_ + 24))) == 0) {
                    break label$12;
                }
                this._storeInt((_32_ + 28), 0);
                label$14:
                do {
                    label$13:
                    while (true) {
                        if ((this._loadInt((_32_ + 28))) >= (this._loadInt((_32_ + 32)))) {
                            break label$14;
                        }
                        label$15:
                        do {
                            if ((this._storeInt((_32_ + 12), (pager_lookup((this._loadInt((_32_ + 48))), ((this._loadInt((_32_ + 36))) + (this._loadInt((_32_ + 28)))))))) == 0) {
                                break label$15;
                            }
                            this._storeInt16(((_30_ = this._loadInt((_32_ + 12))) + 20), ((this._loadInt16u((_30_ + 20))) | 4));
                            sqlite3PagerUnref(_30_);
                        }
                        while (false);
                        this._storeInt((_32_ + 28), ((this._loadInt((_32_ + 28))) + 1));
                        continue label$13;
                    }
                }
                while (false);
            }
            while (false);
            this._storeInt8(((_30_ = this._loadInt((_32_ + 48))) + 20), ((this._loadInt8u((_30_ + 20))) + -1));
        }
        while (false);
        _30_ = this._loadInt((_32_ + 56));
        this._storeInt((0 + 4), (_32_ + 64));
        return _30_;
    }

    @Override()
    public final void sqlite3Put4byte(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt8((_31_ = this._loadInt((_32_ + 12))), (this._loadInt8u((_32_ + 11))));
        this._storeInt8((_31_ + 1), (this._loadInt16u((_32_ + 10))));
        this._storeInt8(((this._loadInt((_32_ + 12))) + 2), ((this._loadInt((_32_ + 8))) >>> 8));
        this._storeInt8(((this._loadInt((_32_ + 12))) + 3), (this._loadInt((_32_ + 8))));
        return;
    }

    @Override()
    public final int sqlite3PagerRollback(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_31_ + 20), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 24))) + 15))) != 6) {
                    break label$1;
                }
                this._storeInt((_31_ + 28), (this._loadInt(((this._loadInt((_31_ + 24))) + 40))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 24))) + 15))) > 1) {
                    break label$2;
                }
                this._storeInt((_31_ + 28), 0);
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if ((pagerUseWal((this._loadInt((_31_ + 24))))) == 0) {
                        break label$4;
                    }
                    this._storeInt((_31_ + 20), (sqlite3PagerSavepoint((this._loadInt((_31_ + 24))), 2, -1)));
                    this._storeInt((_31_ + 16), (pager_end_transaction((_30_ = this._loadInt((_31_ + 24))), (this._loadInt8u((_30_ + 18))))));
                    if ((this._loadInt((_31_ + 20))) != 0) {
                        break label$3;
                    }
                    this._storeInt((_31_ + 20), (this._loadInt((_31_ + 16))));
                    break label$3;
                }
                while (false);
                label$5:
                do {
                    label$6:
                    do {
                        if ((this._loadInt((this._loadInt(((this._loadInt((_31_ + 24))) + 64))))) == 0) {
                            break label$6;
                        }
                        if ((this._loadInt8u(((this._loadInt((_31_ + 24))) + 15))) != 2) {
                            break label$5;
                        }
                    }
                    while (false);
                    this._storeInt((_31_ + 12), (this._loadInt8u(((this._loadInt((_31_ + 24))) + 15))));
                    this._storeInt((_31_ + 20), (pager_end_transaction((this._loadInt((_31_ + 24))), 0)));
                    if ((this._loadInt8u(((this._loadInt((_31_ + 24))) + 14))) != 0) {
                        break label$3;
                    }
                    if ((this._loadInt((_31_ + 12))) < 3) {
                        break label$3;
                    }
                    this._storeInt8(((_30_ = this._loadInt((_31_ + 24))) + 15), 6);
                    this._storeInt((_30_ + 40), 4);
                    this._storeInt((_31_ + 28), (this._loadInt((_31_ + 20))));
                    break label$0;
                }
                while (false);
                this._storeInt((_31_ + 20), (pager_playback((this._loadInt((_31_ + 24))), 0)));
            }
            while (false);
            this._storeInt((_31_ + 28), (pager_error((this._loadInt((_31_ + 24))), (this._loadInt((_31_ + 20))))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 28));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final int pagerUseWal(int _30_)
    {
        return (((this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 172))) != 0) ? 1 : 0);
    }

    @Override()
    public final int sqlite3PagerSavepoint(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        label$0:
        do {
            if ((this._storeInt((_33_ + 16), (this._loadInt(((this._loadInt((_33_ + 28))) + 40))))) != 0) {
                break label$0;
            }
            if ((this._loadInt((_33_ + 20))) >= (this._loadInt(((this._loadInt((_33_ + 28))) + 96)))) {
                break label$0;
            }
            this._storeInt((_33_ + 12), (this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 20))) + (((this._loadInt((_33_ + 24))) != 1) ? 1 : 0)))));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_33_ + 12))) >= (this._loadInt(((this._loadInt((_33_ + 28))) + 96)))) {
                        break label$2;
                    }
                    sqlite3BitvecDestroy((this._loadInt((((this._loadInt(((this._loadInt((_33_ + 28))) + 92))) + ((this._loadInt((_33_ + 12))) * 48)) + 16))));
                    this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 1));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt(((this._loadInt((_33_ + 28))) + 96), (this._loadInt((_33_ + 8))));
            label$3:
            do {
                if ((this._loadInt((_33_ + 24))) != 1) {
                    break label$3;
                }
                if ((this._loadInt((_33_ + 8))) != 0) {
                    break label$0;
                }
                if ((this._loadInt((this._loadInt(((this._loadInt((_33_ + 28))) + 68))))) == 0) {
                    break label$0;
                }
                label$4:
                do {
                    if ((sqlite3IsMemJournal((this._loadInt(((this._loadInt((_33_ + 28))) + 68))))) == 0) {
                        break label$4;
                    }
                    this._storeInt((_33_ + 16), (sqlite3OsTruncate((this._loadInt(((this._loadInt((_33_ + 28))) + 68))), 0L)));
                }
                while (false);
                this._storeInt(((this._loadInt((_33_ + 28))) + 52), 0);
                break label$0;
            }
            while (false);
            label$5:
            do {
                if ((pagerUseWal((this._loadInt((_33_ + 28))))) != 0) {
                    break label$5;
                }
                if ((this._loadInt((this._loadInt(((this._loadInt((_33_ + 28))) + 64))))) == 0) {
                    break label$0;
                }
            }
            while (false);
            _32_ = 0;
            label$6:
            do {
                if ((this._loadInt((_33_ + 8))) == 0) {
                    break label$6;
                }
                _32_ = ((this._loadInt(((this._loadInt((_33_ + 28))) + 92))) + ((this._loadInt((_33_ + 8))) * 48)) + -48;
            }
            while (false);
            this._storeInt((_33_ + 4), _32_);
            this._storeInt((_33_ + 16), (pagerPlaybackSavepoint((this._loadInt((_33_ + 28))), _32_)));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 16));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int pager_end_transaction(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 12), (this._storeInt((_32_ + 16), 0)));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 15))) > 1) {
                    break label$1;
                }
                if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 16))) > 1) {
                    break label$1;
                }
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            releaseAllSavepoints((this._loadInt((_32_ + 24))));
            label$2:
            do {
                if ((this._loadInt((this._loadInt(((this._loadInt((_32_ + 24))) + 64))))) == 0) {
                    break label$2;
                }
                label$3:
                do {
                    if ((sqlite3IsMemJournal((this._loadInt(((this._loadInt((_32_ + 24))) + 64))))) == 0) {
                        break label$3;
                    }
                    sqlite3OsClose((this._loadInt(((this._loadInt((_32_ + 24))) + 64))));
                    break label$2;
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
                                if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 5))) != 3) {
                                    break label$7;
                                }
                                if ((this._loadLong(((this._loadInt((_32_ + 24))) + 72))) == 0L) {
                                    break label$6;
                                }
                                this._storeInt((_32_ + 16), (sqlite3OsTruncate((this._loadInt(((this._loadInt((_32_ + 24))) + 64))), 0L)));
                                break label$5;
                            }
                            while (false);
                            label$8:
                            do {
                                if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 5))) == 1) {
                                    break label$8;
                                }
                                if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 4))) == 0) {
                                    break label$4;
                                }
                                if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 5))) == 5) {
                                    break label$4;
                                }
                            }
                            while (false);
                            this._storeInt((_32_ + 16), (zeroJournalHdr((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 20))))));
                            this._storeLong(((this._loadInt((_32_ + 24))) + 72), 0L);
                            break label$2;
                        }
                        while (false);
                        this._storeInt((_32_ + 16), 0);
                    }
                    while (false);
                    this._storeLong(((this._loadInt((_32_ + 24))) + 72), 0L);
                    break label$2;
                }
                while (false);
                sqlite3OsClose((this._loadInt(((this._loadInt((_32_ + 24))) + 64))));
                if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 12))) != 0) {
                    break label$2;
                }
                this._storeInt((_32_ + 16), (sqlite3OsDelete((this._loadInt((_31_ = this._loadInt((_32_ + 24))))), (this._loadInt((_31_ + 148))), 0)));
            }
            while (false);
            sqlite3BitvecDestroy((this._loadInt(((this._loadInt((_32_ + 24))) + 56))));
            this._storeInt(((_31_ = this._loadInt((_32_ + 24))) + 56), (this._storeInt((_31_ + 44), 0)));
            sqlite3PcacheCleanAll((this._loadInt((_31_ + 168))));
            sqlite3PcacheTruncate((this._loadInt(((_31_ = this._loadInt((_32_ + 24))) + 168))), (this._loadInt((_31_ + 24))));
            label$9:
            do {
                if ((pagerUseWal((this._loadInt((_32_ + 24))))) == 0) {
                    break label$9;
                }
                this._storeInt((_32_ + 12), (sqlite3WalEndWriteTransaction((this._loadInt(((this._loadInt((_32_ + 24))) + 172))))));
            }
            while (false);
            label$10:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 4))) != 0) {
                    break label$10;
                }
                label$11:
                do {
                    if ((pagerUseWal((this._loadInt((_32_ + 24))))) == 0) {
                        break label$11;
                    }
                    if ((sqlite3WalExclusiveMode((this._loadInt(((this._loadInt((_32_ + 24))) + 172))), 0)) == 0) {
                        break label$10;
                    }
                }
                while (false);
                this._storeInt((_32_ + 12), (pagerUnlockDb((this._loadInt((_32_ + 24))), 1)));
                this._storeInt8(((this._loadInt((_32_ + 24))) + 17), 0);
            }
            while (false);
            this._storeInt8(((_31_ = this._loadInt((_32_ + 24))) + 18), 0);
            this._storeInt8((_31_ + 15), 1);
            label$12:
            do {
                label$13:
                do {
                    if ((this._loadInt((_32_ + 16))) == 0) {
                        break label$13;
                    }
                    _31_ = this._loadInt((_32_ + 16));
                    break label$12;
                }
                while (false);
                _31_ = this._loadInt((_32_ + 12));
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
    public final int pager_playback(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_32_ + 56), _31_);
        this._storeInt((_32_ + 52), (this._loadInt((this._loadInt((_32_ + 60))))));
        _31_ = this._storeInt((_32_ + 28), 0);
        _30_ = this._storeInt((_32_ + 20), 1);
        this._storeInt((_32_ + 16), _31_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 24), (sqlite3OsFileSize((this._loadInt(((this._loadInt((_32_ + 60))) + 64))), (_32_ + 40))))) != 0) {
                break label$0;
            }
            _31_ = this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt((_32_ + 60))) + 164))));
            label$1:
            do {
                if ((this._storeInt((_32_ + 24), (readMasterJournal((this._loadInt(((_33_ = this._loadInt((_32_ + 60))) + 64))), _31_, ((this._loadInt(((this._loadInt(_33_)) + 8))) + _30_))))) != 0) {
                    break label$1;
                }
                if ((this._loadInt8s((this._loadInt((_32_ + 16))))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 24), (sqlite3OsAccess((this._loadInt((_32_ + 52))), (this._loadInt((_32_ + 16))), 0, (_32_ + 20))));
            }
            while (false);
            this._storeInt((_32_ + 16), 0);
            if ((this._loadInt((_32_ + 24))) != 0) {
                break label$0;
            }
            if ((this._loadInt((_32_ + 20))) == 0) {
                break label$0;
            }
            this._storeLong(((this._loadInt((_32_ + 60))) + 72), 0L);
            this._storeInt((_32_ + 12), (this._loadInt((_32_ + 56))));
            label$2:
            do {
                label$4:
                do {
                    label$3:
                    while (true) {
                        if ((this._storeInt((_32_ + 24), (readJournalHdr((this._loadInt((_32_ + 60))), (this._loadInt((_32_ + 56))), (this._loadLong((_32_ + 40))), (_32_ + 36), (_32_ + 28))))) != 0) {
                            break label$2;
                        }
                        label$5:
                        do {
                            if ((this._loadInt((_32_ + 36))) != -1) {
                                break label$5;
                            }
                            this._storeLong32((_32_ + 36), (((this._loadLong((_32_ + 40))) - (this._loadLong32u(((_31_ = this._loadInt((_32_ + 60))) + 124)))) / ((long) ((this._loadInt((_31_ + 128))) + 8))));
                        }
                        while (false);
                        label$6:
                        do {
                            if ((this._loadInt((_32_ + 36))) != 0) {
                                break label$6;
                            }
                            if ((this._loadInt((_32_ + 56))) != 0) {
                                break label$6;
                            }
                            if (((this._loadLong(((_31_ = this._loadInt((_32_ + 60))) + 80))) + (this._loadLong32u((_31_ + 124)))) != (this._loadLong((_31_ + 72)))) {
                                break label$6;
                            }
                            this._storeLong32((_32_ + 36), (((this._loadLong((_32_ + 40))) - (this._loadLong(((_31_ = this._loadInt((_32_ + 60))) + 72)))) / ((long) ((this._loadInt((_31_ + 128))) + 8))));
                        }
                        while (false);
                        label$7:
                        do {
                            if ((this._loadLong(((_31_ = this._loadInt((_32_ + 60))) + 72))) != (this._loadLong32u((_31_ + 124)))) {
                                break label$7;
                            }
                            if ((this._storeInt((_32_ + 24), (pager_truncate((this._loadInt((_32_ + 60))), (this._loadInt((_32_ + 28))))))) != 0) {
                                break label$0;
                            }
                            this._storeInt(((this._loadInt((_32_ + 60))) + 24), (this._loadInt((_32_ + 28))));
                        }
                        while (false);
                        _31_ = this._storeInt((_32_ + 32), 0);
                        label$9:
                        do {
                            label$8:
                            while (true) {
                                if (((this._loadInt((_32_ + 32))) & 4294967295L) >= ((this._loadInt((_32_ + 36))) & 4294967295L)) {
                                    continue label$3;
                                }
                                label$10:
                                do {
                                    if ((this._loadInt((_32_ + 12))) == 0) {
                                        break label$10;
                                    }
                                    pager_reset((this._loadInt((_32_ + 60))));
                                    this._storeInt((_32_ + 12), _31_);
                                }
                                while (false);
                                if ((this._storeInt((_32_ + 24), (pager_playback_one_page((_30_ = this._loadInt((_32_ + 60))), (_30_ + 72), _31_, 1, _31_)))) != 0) {
                                    break label$9;
                                }
                                this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) + 1));
                                continue label$8;
                            }
                        }
                        while (false);
                        if ((this._loadInt((_32_ + 24))) != 101) {
                            break label$4;
                        }
                        this._storeInt((_32_ + 24), _31_);
                        this._storeLong(((this._loadInt((_32_ + 60))) + 72), (this._loadLong((_32_ + 40))));
                        continue label$3;
                    }
                }
                while (false);
                if ((this._loadInt((_32_ + 24))) != 522) {
                    break label$0;
                }
                this._storeInt((_32_ + 24), 0);
                break label$0;
            }
            while (false);
            if ((this._loadInt((_32_ + 24))) != 101) {
                break label$0;
            }
            this._storeInt((_32_ + 24), 0);
        }
        while (false);
        this._storeInt8(((_31_ = this._loadInt((_32_ + 60))) + 17), (this._loadInt8u((_31_ + 12))));
        label$11:
        do {
            if ((this._loadInt((_32_ + 24))) != 0) {
                break label$11;
            }
            _31_ = this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt((_32_ + 60))) + 164))));
            this._storeInt((_32_ + 24), (readMasterJournal((this._loadInt(((_30_ = this._loadInt((_32_ + 60))) + 64))), _31_, ((this._loadInt(((this._loadInt(_30_)) + 8))) + 1))));
        }
        while (false);
        label$12:
        do {
            if ((this._loadInt((_32_ + 24))) != 0) {
                break label$12;
            }
            label$13:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 60))) + 15))) > 3) {
                    break label$13;
                }
                if ((this._loadInt8u(((this._loadInt((_32_ + 60))) + 15))) != 0) {
                    break label$12;
                }
            }
            while (false);
            this._storeInt((_32_ + 24), (sqlite3PagerSync((this._loadInt((_32_ + 60))))));
        }
        while (false);
        label$14:
        do {
            if ((this._loadInt((_32_ + 24))) != 0) {
                break label$14;
            }
            this._storeInt((_32_ + 24), (pager_end_transaction((this._loadInt((_32_ + 60))), (((this._loadInt8s((this._loadInt((_32_ + 16))))) != 0) ? 1 : 0))));
        }
        while (false);
        label$15:
        do {
            if ((this._loadInt((_32_ + 24))) != 0) {
                break label$15;
            }
            if ((this._loadInt8s((this._loadInt((_32_ + 16))))) == 0) {
                break label$15;
            }
            if ((this._loadInt((_32_ + 20))) == 0) {
                break label$15;
            }
            this._storeInt((_32_ + 24), (pager_delmaster((this._loadInt((_32_ + 60))), (this._loadInt((_32_ + 16))))));
        }
        while (false);
        setSectorSize((this._loadInt((_32_ + 60))));
        _31_ = this._loadInt((_32_ + 24));
        this._storeInt((0 + 4), (_32_ + 64));
        return _31_;
    }

    @Override()
    public final int pager_error(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 4), (this._loadInt8u((_32_ + 8))))) == 13) {
                    break label$1;
                }
                if ((this._loadInt((_32_ + 4))) != 10) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt8(((_31_ = this._loadInt((_32_ + 12))) + 15), 6);
            this._storeInt((_31_ + 40), (this._loadInt((_32_ + 8))));
        }
        while (false);
        return (this._loadInt((_32_ + 8)));
    }

    @Override()
    public final int readMasterJournal(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_33_ + 36), _31_);
        this._storeInt((_33_ + 32), _32_);
        this._storeInt8((this._loadInt((_33_ + 36))), 0);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._storeInt((_33_ + 28), (sqlite3OsFileSize((this._loadInt((_33_ + 40))), (_33_ + 16))))) != 0) {
                        break label$2;
                    }
                    if ((this._loadLong((_33_ + 16))) < 16L) {
                        break label$2;
                    }
                    if ((this._storeInt((_33_ + 28), (read32bits((this._loadInt((_33_ + 40))), ((this._loadLong((_33_ + 16))) + -16L), (_33_ + 24))))) != 0) {
                        break label$2;
                    }
                    if (((this._loadInt((_33_ + 24))) & 4294967295L) >= ((this._loadInt((_33_ + 32))) & 4294967295L)) {
                        break label$2;
                    }
                    if ((this._storeInt((_33_ + 28), (read32bits((this._loadInt((_33_ + 40))), ((this._loadLong((_33_ + 16))) + -12L), (_33_ + 12))))) != 0) {
                        break label$2;
                    }
                    if ((this._storeInt((_33_ + 28), (sqlite3OsRead((this._loadInt((_33_ + 40))), _33_, 8, ((this._loadLong((_33_ + 16))) + -8L))))) != 0) {
                        break label$2;
                    }
                    if ((this._loadLong(_33_)) != -2926318169871755815L) {
                        break label$2;
                    }
                    if ((this._storeInt((_33_ + 28), (sqlite3OsRead((this._loadInt((_33_ + 40))), (this._loadInt((_33_ + 36))), (_32_ = this._loadInt((_33_ + 24))), (((this._loadLong((_33_ + 16))) + -16L) - (_32_ & 4294967295L)))))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((_33_ + 44), (this._loadInt((_33_ + 28))));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 8), 0);
            label$4:
            do {
                label$3:
                while (true) {
                    if (((this._loadInt((_33_ + 8))) & 4294967295L) >= ((this._loadInt((_33_ + 24))) & 4294967295L)) {
                        break label$4;
                    }
                    this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) - (this._loadInt8s(((this._loadInt((_33_ + 36))) + (this._loadInt((_33_ + 8))))))));
                    this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) + 1));
                    continue label$3;
                }
            }
            while (false);
            label$5:
            do {
                if ((this._loadInt((_33_ + 12))) == 0) {
                    break label$5;
                }
                this._storeInt((_33_ + 24), 0);
            }
            while (false);
            this._storeInt((_33_ + 44), (this._storeInt8(((this._loadInt((_33_ + 36))) + (this._loadInt((_33_ + 24)))), 0)));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 44));
        this._storeInt((0 + 4), (_33_ + 48));
        return _32_;
    }

    @Override()
    public final int sqlite3OsAccess(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        _33_ = this._iiiiiTable[this._tableIndices[this._loadInt(((_32_ = this._loadInt((_34_ + 12))) + 32))]].invoke(_32_, (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))), _33_);
        this._storeInt((0 + 4), (_34_ + 16));
        return _33_;
    }

    @Override()
    public final int readJournalHdr(int _30_, int _31_, long _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_35_ + 52), _31_);
        this._storeLong((_35_ + 40), _32_);
        this._storeInt((_35_ + 36), _33_);
        this._storeInt((_35_ + 32), _34_);
        _32_ = journalHdrOffset((this._loadInt((_35_ + 56))));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeLong(((_34_ = this._loadInt((_35_ + 56))) + 72), _32_)) + (this._loadLong32u((_34_ + 124)))) <= (this._loadLong((_35_ + 40)))) {
                    break label$1;
                }
                this._storeInt((_35_ + 60), 101);
                break label$0;
            }
            while (false);
            this._storeLong((_35_ + 8), (this._loadLong(((this._loadInt((_35_ + 56))) + 72))));
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt((_35_ + 52))) != 0) {
                        break label$3;
                    }
                    if ((this._loadLong((_35_ + 8))) == (this._loadLong(((this._loadInt((_35_ + 56))) + 80)))) {
                        break label$2;
                    }
                }
                while (false);
                label$4:
                do {
                    if ((this._storeInt((_35_ + 28), (sqlite3OsRead((this._loadInt(((this._loadInt((_35_ + 56))) + 64))), (_35_ + 20), 8, (this._loadLong((_35_ + 8))))))) == 0) {
                        break label$4;
                    }
                    this._storeInt((_35_ + 60), (this._loadInt((_35_ + 28))));
                    break label$0;
                }
                while (false);
                if ((this._loadLong((_35_ + 20))) == -2926318169871755815L) {
                    break label$2;
                }
                this._storeInt((_35_ + 60), 101);
                break label$0;
            }
            while (false);
            label$5:
            do {
                label$6:
                do {
                    if ((this._storeInt((_35_ + 28), (read32bits((this._loadInt(((this._loadInt((_35_ + 56))) + 64))), ((this._loadLong((_35_ + 8))) + 8L), (this._loadInt((_35_ + 36))))))) != 0) {
                        break label$6;
                    }
                    if ((this._storeInt((_35_ + 28), (read32bits((this._loadInt(((_34_ = this._loadInt((_35_ + 56))) + 64))), ((this._loadLong((_35_ + 8))) + 12L), (_34_ + 48))))) != 0) {
                        break label$6;
                    }
                    if ((this._storeInt((_35_ + 28), (read32bits((this._loadInt(((this._loadInt((_35_ + 56))) + 64))), ((this._loadLong((_35_ + 8))) + 16L), (this._loadInt((_35_ + 32))))))) == 0) {
                        break label$5;
                    }
                }
                while (false);
                this._storeInt((_35_ + 60), (this._loadInt((_35_ + 28))));
                break label$0;
            }
            while (false);
            label$7:
            do {
                if ((this._loadLong(((this._loadInt((_35_ + 56))) + 72))) != 0L) {
                    break label$7;
                }
                label$8:
                do {
                    label$9:
                    do {
                        if ((this._storeInt((_35_ + 28), (read32bits((this._loadInt(((this._loadInt((_35_ + 56))) + 64))), ((this._loadLong((_35_ + 8))) + 20L), _35_)))) != 0) {
                            break label$9;
                        }
                        if ((this._storeInt((_35_ + 28), (read32bits((this._loadInt(((this._loadInt((_35_ + 56))) + 64))), ((this._loadLong((_35_ + 8))) + 24L), (_35_ + 4))))) == 0) {
                            break label$8;
                        }
                    }
                    while (false);
                    this._storeInt((_35_ + 60), (this._loadInt((_35_ + 28))));
                    break label$0;
                }
                while (false);
                label$10:
                do {
                    if ((this._loadInt((_35_ + 4))) != 0) {
                        break label$10;
                    }
                    this._storeInt((_35_ + 4), (this._loadInt(((this._loadInt((_35_ + 56))) + 128))));
                }
                while (false);
                label$11:
                do {
                    label$12:
                    do {
                        if (((this._loadInt((_35_ + 4))) & 4294967295L) < (512 & 4294967295L)) {
                            break label$12;
                        }
                        if (((this._loadInt(_35_)) & 4294967295L) < (32 & 4294967295L)) {
                            break label$12;
                        }
                        if (((this._loadInt((_35_ + 4))) & 4294967295L) > (65536 & 4294967295L)) {
                            break label$12;
                        }
                        if (((this._loadInt(_35_)) & 4294967295L) > (65536 & 4294967295L)) {
                            break label$12;
                        }
                        if ((((_34_ = this._loadInt((_35_ + 4))) + -1) & _34_) != 0) {
                            break label$12;
                        }
                        if ((((_34_ = this._loadInt(_35_)) + -1) & _34_) == 0) {
                            break label$11;
                        }
                    }
                    while (false);
                    this._storeInt((_35_ + 60), 101);
                    break label$0;
                }
                while (false);
                this._storeInt((_35_ + 28), (sqlite3PagerSetPagesize((this._loadInt((_35_ + 56))), (_35_ + 4), -1)));
                this._storeInt(((this._loadInt((_35_ + 56))) + 124), (this._loadInt(_35_)));
            }
            while (false);
            this._storeLong(((_34_ = this._loadInt((_35_ + 56))) + 72), ((this._loadLong((_34_ + 72))) + (this._loadLong32u((_34_ + 124)))));
            this._storeInt((_35_ + 60), (this._loadInt((_35_ + 28))));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 60));
        this._storeInt((0 + 4), (_35_ + 64));
        return _34_;
    }

    @Override()
    public final int pager_truncate(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_32_ + 40), _31_);
        this._storeInt((_32_ + 36), 0);
        label$0:
        do {
            if ((this._loadInt((this._loadInt(((this._loadInt((_32_ + 44))) + 60))))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 44))) + 15))) > 3) {
                    break label$1;
                }
                if ((this._loadInt8u(((this._loadInt((_32_ + 44))) + 15))) != 0) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 44))) + 128))));
            this._storeInt((_32_ + 36), (sqlite3OsFileSize((this._loadInt(((this._loadInt((_32_ + 44))) + 60))), (_32_ + 24))));
            this._storeLong((_32_ + 16), ((this._loadLong32s((_32_ + 12))) * (this._loadLong32u((_32_ + 40)))));
            if ((this._loadInt((_32_ + 36))) != 0) {
                break label$0;
            }
            if ((this._loadLong((_32_ + 24))) == (this._loadLong((_32_ + 16)))) {
                break label$0;
            }
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadLong((_32_ + 24))) <= (this._loadLong((_32_ + 16)))) {
                        break label$3;
                    }
                    this._storeInt((_32_ + 36), (sqlite3OsTruncate((this._loadInt(((this._loadInt((_32_ + 44))) + 60))), (this._loadLong((_32_ + 16))))));
                    break label$2;
                }
                while (false);
                memset((this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((_32_ + 44))) + 164))))), 0, (this._loadInt((_32_ + 12))));
                this._storeInt((_32_ + 36), (sqlite3OsWrite((this._loadInt(((this._loadInt((_32_ + 44))) + 60))), (this._loadInt((_32_ + 8))), (_31_ = this._loadInt((_32_ + 12))), ((this._loadLong((_32_ + 16))) - ((long) _31_)))));
            }
            while (false);
            if ((this._loadInt((_32_ + 36))) != 0) {
                break label$0;
            }
            this._storeInt(((this._loadInt((_32_ + 44))) + 32), (this._loadInt((_32_ + 40))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 36));
        this._storeInt((0 + 4), (_32_ + 48));
        return _31_;
    }

    @Override()
    public final void pager_reset(int _30_)
    {
        int _31_ = 0;
        sqlite3BackupRestart((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 88))));
        sqlite3PcacheClear((this._loadInt(((this._loadInt((_31_ + 12))) + 168))));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int pager_playback_one_page(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        long _35_ = 0L;
        int _36_ = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 72), _30_);
        this._storeInt((_36_ + 68), _31_);
        this._storeInt((_36_ + 64), _32_);
        this._storeInt((_36_ + 60), _33_);
        this._storeInt((_36_ + 56), _34_);
        this._storeInt((_36_ + 36), (this._loadInt(((this._loadInt((_36_ + 72))) + 164))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_36_ + 60))) == 0) {
                    break label$1;
                }
                _34_ = this._loadInt(((this._loadInt((_36_ + 72))) + 64));
                break label$0;
            }
            while (false);
            _34_ = this._loadInt(((this._loadInt((_36_ + 72))) + 68));
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                if ((this._storeInt((_36_ + 52), (read32bits((this._storeInt((_36_ + 32), _34_)), (this._loadLong((this._loadInt((_36_ + 68))))), (_36_ + 44))))) == 0) {
                    break label$3;
                }
                this._storeInt((_36_ + 76), (this._loadInt((_36_ + 52))));
                break label$2;
            }
            while (false);
            label$4:
            do {
                if ((this._storeInt((_36_ + 52), (sqlite3OsRead((this._loadInt((_36_ + 32))), (this._loadInt((_36_ + 36))), (this._loadInt(((this._loadInt((_36_ + 72))) + 128))), ((this._loadLong((this._loadInt((_36_ + 68))))) + 4L))))) == 0) {
                    break label$4;
                }
                this._storeInt((_36_ + 76), (this._loadInt((_36_ + 52))));
                break label$2;
            }
            while (false);
            this._storeLong((_34_ = this._loadInt((_36_ + 68))), ((this._loadLong(_34_)) + ((long) (((this._loadInt(((this._loadInt((_36_ + 72))) + 128))) + ((this._loadInt((_36_ + 60))) << 2)) + 4))));
            label$5:
            do {
                label$6:
                do {
                    if ((this._loadInt((_36_ + 44))) == 0) {
                        break label$6;
                    }
                    if ((this._loadInt((_36_ + 44))) != (((this._loadInt((0 + 22332))) / (this._loadInt(((this._loadInt((_36_ + 72))) + 128)))) + 1)) {
                        break label$5;
                    }
                }
                while (false);
                this._storeInt((_36_ + 76), 101);
                break label$2;
            }
            while (false);
            label$7:
            do {
                label$8:
                do {
                    if (((this._loadInt((_36_ + 44))) & 4294967295L) > ((this._loadInt(((this._loadInt((_36_ + 72))) + 24))) & 4294967295L)) {
                        break label$8;
                    }
                    if ((sqlite3BitvecTest((this._loadInt((_36_ + 64))), (this._loadInt((_36_ + 44))))) == 0) {
                        break label$7;
                    }
                }
                while (false);
                this._storeInt((_36_ + 76), 0);
                break label$2;
            }
            while (false);
            label$9:
            do {
                if ((this._loadInt((_36_ + 60))) == 0) {
                    break label$9;
                }
                label$10:
                do {
                    if ((this._storeInt((_36_ + 52), (read32bits((this._loadInt((_36_ + 32))), ((this._loadLong((this._loadInt((_36_ + 68))))) + -4L), (_36_ + 40))))) == 0) {
                        break label$10;
                    }
                    this._storeInt((_36_ + 76), (this._loadInt((_36_ + 52))));
                    break label$2;
                }
                while (false);
                if ((this._loadInt((_36_ + 56))) != 0) {
                    break label$9;
                }
                if ((pager_cksum((this._loadInt((_36_ + 72))), (this._loadInt((_36_ + 36))))) == (this._loadInt((_36_ + 40)))) {
                    break label$9;
                }
                this._storeInt((_36_ + 76), 101);
                break label$2;
            }
            while (false);
            label$11:
            do {
                if ((this._loadInt((_36_ + 64))) == 0) {
                    break label$11;
                }
                if ((this._storeInt((_36_ + 52), (sqlite3BitvecSet((this._loadInt((_36_ + 64))), (this._loadInt((_36_ + 44))))))) == 0) {
                    break label$11;
                }
                this._storeInt((_36_ + 76), (this._loadInt((_36_ + 52))));
                break label$2;
            }
            while (false);
            label$12:
            do {
                if ((this._loadInt((_36_ + 44))) != 1) {
                    break label$12;
                }
                if ((this._loadInt16s(((this._loadInt((_36_ + 72))) + 118))) == (this._loadInt8u(((this._loadInt((_36_ + 36))) + 20)))) {
                    break label$12;
                }
                this._storeInt16(((this._loadInt((_36_ + 72))) + 118), (this._loadInt8u(((this._loadInt((_36_ + 36))) + 20))));
            }
            while (false);
            label$13:
            do {
                label$14:
                do {
                    if ((pagerUseWal((this._loadInt((_36_ + 72))))) == 0) {
                        break label$14;
                    }
                    this._storeInt((_36_ + 48), 0);
                    break label$13;
                }
                while (false);
                this._storeInt((_36_ + 48), (pager_lookup((this._loadInt((_36_ + 72))), (this._loadInt((_36_ + 44))))));
            }
            while (false);
            label$15:
            do {
                label$16:
                do {
                    if ((this._loadInt((_36_ + 60))) == 0) {
                        break label$16;
                    }
                    _34_ = 1;
                    label$17:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_36_ + 72))) + 8))) != 0) {
                            break label$17;
                        }
                        _34_ = ((this._loadLong((this._loadInt((_36_ + 68))))) <= (this._loadLong(((this._loadInt((_36_ + 72))) + 80)))) ? 1 : 0;
                    }
                    while (false);
                    this._storeInt((_36_ + 28), _34_);
                    break label$15;
                }
                while (false);
                _34_ = 1;
                label$18:
                do {
                    if ((this._loadInt((_36_ + 48))) == 0) {
                        break label$18;
                    }
                    _34_ = (((this._loadInt16u(((this._loadInt((_36_ + 48))) + 20))) & 4) == 0) ? 1 : 0;
                }
                while (false);
                this._storeInt((_36_ + 28), _34_);
            }
            while (false);
            label$19:
            do {
                label$20:
                do {
                    if ((this._loadInt((this._loadInt(((this._loadInt((_36_ + 72))) + 60))))) == 0) {
                        break label$20;
                    }
                    label$21:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_36_ + 72))) + 15))) > 3) {
                            break label$21;
                        }
                        if ((this._loadInt8u(((this._loadInt((_36_ + 72))) + 15))) != 0) {
                            break label$20;
                        }
                    }
                    while (false);
                    if ((this._loadInt((_36_ + 28))) == 0) {
                        break label$20;
                    }
                    _35_ = this._storeLong((_36_ + 16), ((((this._loadInt((_36_ + 44))) + -1) & 4294967295L) * (this._loadLong32s(((this._loadInt((_36_ + 72))) + 128)))));
                    this._storeInt((_36_ + 52), (sqlite3OsWrite((this._loadInt(((_34_ = this._loadInt((_36_ + 72))) + 60))), (this._loadInt((_36_ + 36))), (this._loadInt((_34_ + 128))), _35_)));
                    label$22:
                    do {
                        if (((this._loadInt((_36_ + 44))) & 4294967295L) <= ((this._loadInt(((this._loadInt((_36_ + 72))) + 32))) & 4294967295L)) {
                            break label$22;
                        }
                        this._storeInt(((this._loadInt((_36_ + 72))) + 32), (this._loadInt((_36_ + 44))));
                    }
                    while (false);
                    if ((this._loadInt(((this._loadInt((_36_ + 72))) + 88))) == 0) {
                        break label$19;
                    }
                    sqlite3BackupUpdate((this._loadInt(((this._loadInt((_36_ + 72))) + 88))), (this._loadInt((_36_ + 44))), (this._loadInt((_36_ + 36))));
                    break label$19;
                }
                while (false);
                if ((this._loadInt((_36_ + 60))) != 0) {
                    break label$19;
                }
                if ((this._loadInt((_36_ + 48))) != 0) {
                    break label$19;
                }
                this._storeInt8(((_34_ = this._loadInt((_36_ + 72))) + 19), ((this._loadInt8u((_34_ + 19))) + 1));
                _34_ = this._storeInt((_36_ + 52), (sqlite3PagerAcquire(_34_, (this._loadInt((_36_ + 44))), (_36_ + 48), 1)));
                this._storeInt8(((_33_ = this._loadInt((_36_ + 72))) + 19), ((this._loadInt8u((_33_ + 19))) + -1));
                label$23:
                do {
                    if (_34_ == 0) {
                        break label$23;
                    }
                    this._storeInt((_36_ + 76), (this._loadInt((_36_ + 52))));
                    break label$2;
                }
                while (false);
                this._storeInt16(((_34_ = this._loadInt((_36_ + 48))) + 20), ((this._loadInt16u((_34_ + 20))) & 65527));
                sqlite3PcacheMakeDirty(_34_);
            }
            while (false);
            label$24:
            do {
                if ((this._loadInt((_36_ + 48))) == 0) {
                    break label$24;
                }
                memcpy((this._storeInt((_36_ + 12), (this._loadInt((this._loadInt((_36_ + 48))))))), (this._loadInt((_36_ + 36))), (this._loadInt(((this._loadInt((_36_ + 72))) + 128))));
                this._viTable[this._tableIndices[this._loadInt(((this._loadInt((_36_ + 72))) + 160))]].invoke((this._loadInt((_36_ + 48))));
                label$25:
                do {
                    if ((this._loadInt((_36_ + 60))) == 0) {
                        break label$25;
                    }
                    label$26:
                    do {
                        if ((this._loadInt((_36_ + 56))) == 0) {
                            break label$26;
                        }
                        if ((this._loadLong((this._loadInt((_36_ + 68))))) > (this._loadLong(((this._loadInt((_36_ + 72))) + 80)))) {
                            break label$25;
                        }
                    }
                    while (false);
                    sqlite3PcacheMakeClean((this._loadInt((_36_ + 48))));
                }
                while (false);
                label$27:
                do {
                    if ((this._loadInt((_36_ + 44))) != 1) {
                        break label$27;
                    }
                    memcpy(((this._loadInt((_36_ + 72))) + 100), ((this._loadInt((_36_ + 12))) + 24), 16);
                }
                while (false);
                sqlite3PcacheRelease((this._loadInt((_36_ + 48))));
            }
            while (false);
            this._storeInt((_36_ + 76), (this._loadInt((_36_ + 52))));
        }
        while (false);
        _34_ = this._loadInt((_36_ + 76));
        this._storeInt((0 + 4), (_36_ + 80));
        return _34_;
    }

    @Override()
    public final int pager_delmaster(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 76), _30_);
        this._storeInt((_32_ + 72), _31_);
        this._storeInt((_32_ + 68), (this._loadInt((this._loadInt((_32_ + 76))))));
        _31_ = this._storeInt((_32_ + 52), 0);
        this._storeInt((_32_ + 56), ((this._storeInt((_32_ + 60), (sqlite3MallocZero(((this._loadInt(((this._loadInt((_32_ + 68))) + 4))) << 1))))) + (this._loadInt(((this._loadInt((_32_ + 68))) + 4)))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_32_ + 60))) == 0) {
                    break label$1;
                }
                _30_ = this._storeInt((_32_ + 24), 16385);
                this._storeInt((_32_ + 64), (sqlite3OsOpen((this._loadInt((_32_ + 68))), (this._loadInt((_32_ + 72))), (this._loadInt((_32_ + 60))), _30_, _31_)));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 64), 7);
        }
        while (false);
        label$2:
        do {
            if ((this._loadInt((_32_ + 64))) != 0) {
                break label$2;
            }
            if ((this._storeInt((_32_ + 64), (sqlite3OsFileSize((this._loadInt((_32_ + 60))), (_32_ + 40))))) != 0) {
                break label$2;
            }
            label$3:
            do {
                label$4:
                do {
                    if ((this._storeInt((_32_ + 52), (sqlite3Malloc((((this._storeInt((_32_ + 28), ((this._loadInt(((this._loadInt((_32_ + 68))) + 8))) + 1))) + (this._loadInt((_32_ + 40)))) + 1))))) == 0) {
                        break label$4;
                    }
                    this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 52))) + ((int) ((this._loadLong((_32_ + 40))) + 1L))));
                    if ((this._storeInt((_32_ + 64), (sqlite3OsRead((this._loadInt((_32_ + 60))), (this._loadInt((_32_ + 52))), (this._loadInt((_32_ + 40))), 0L)))) != 0) {
                        break label$2;
                    }
                    _31_ = this._storeInt8(((_30_ = this._loadInt((_32_ + 52))) + (this._loadInt((_32_ + 40)))), 0);
                    this._storeInt((_32_ + 36), _30_);
                    label$5:
                    while (true) {
                        if (((long) ((this._loadInt((_32_ + 36))) - (this._loadInt((_32_ + 52))))) >= (this._loadLong((_32_ + 40)))) {
                            break label$3;
                        }
                        if ((this._storeInt((_32_ + 64), (sqlite3OsAccess((this._loadInt((_32_ + 68))), (this._loadInt((_32_ + 36))), _31_, (_32_ + 20))))) != 0) {
                            break label$2;
                        }
                        label$7:
                        do {
                            if ((this._loadInt((_32_ + 20))) == 0) {
                                break label$7;
                            }
                            _30_ = this._storeInt((_32_ + 12), 2049);
                            if ((this._storeInt((_32_ + 64), (sqlite3OsOpen((this._loadInt((_32_ + 68))), (this._loadInt((_32_ + 36))), (this._loadInt((_32_ + 56))), _30_, _31_)))) != 0) {
                                break label$2;
                            }
                            this._storeInt((_32_ + 64), (readMasterJournal((this._loadInt((_32_ + 56))), (this._loadInt((_32_ + 32))), (this._loadInt((_32_ + 28))))));
                            sqlite3OsClose((this._loadInt((_32_ + 56))));
                            if ((this._loadInt((_32_ + 64))) != 0) {
                                break label$2;
                            }
                            _30_ = 0;
                            label$8:
                            do {
                                if ((this._loadInt8s((this._loadInt((_32_ + 32))))) == 0) {
                                    break label$8;
                                }
                                _30_ = ((strcmp((this._loadInt((_32_ + 32))), (this._loadInt((_32_ + 72))))) == 0) ? 1 : 0;
                            }
                            while (false);
                            if ((this._storeInt((_32_ + 16), _30_)) != 0) {
                                break label$2;
                            }
                        }
                        while (false);
                        this._storeInt((_32_ + 36), (((sqlite3Strlen30((this._loadInt((_32_ + 36))))) + (this._loadInt((_32_ + 36)))) + 1));
                        continue label$5;
                    }
                }
                while (false);
                this._storeInt((_32_ + 64), 7);
                break label$2;
            }
            while (false);
            sqlite3OsClose((this._loadInt((_32_ + 60))));
            this._storeInt((_32_ + 64), (sqlite3OsDelete((this._loadInt((_32_ + 68))), (this._loadInt((_32_ + 72))), 0)));
        }
        while (false);
        sqlite3_free((this._loadInt((_32_ + 52))));
        label$9:
        do {
            if ((this._loadInt((_32_ + 60))) == 0) {
                break label$9;
            }
            sqlite3OsClose((this._loadInt((_32_ + 60))));
            sqlite3_free((this._loadInt((_32_ + 60))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 64));
        this._storeInt((0 + 4), (_32_ + 80));
        return _31_;
    }

    @Override()
    public final void setSectorSize(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 12))) != 0) {
                break label$0;
            }
            _30_ = sqlite3OsSectorSize((this._loadInt(((this._loadInt((_31_ + 12))) + 60))));
            this._storeInt(((this._loadInt((_31_ + 12))) + 124), _30_);
        }
        while (false);
        label$1:
        do {
            if (((this._loadInt(((this._loadInt((_31_ + 12))) + 124))) & 4294967295L) > (31 & 4294967295L)) {
                break label$1;
            }
            this._storeInt(((this._loadInt((_31_ + 12))) + 124), 512);
        }
        while (false);
        label$2:
        do {
            if (((this._loadInt(((this._loadInt((_31_ + 12))) + 124))) & 4294967295L) < (65537 & 4294967295L)) {
                break label$2;
            }
            this._storeInt(((this._loadInt((_31_ + 12))) + 124), 65536);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3OsSectorSize(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _32_ = 512;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._loadInt(((this._loadInt((this._storeInt((_31_ + 12), _30_)))) + 44))))) == 0) {
                break label$0;
            }
            _32_ = this._iiTable[this._tableIndices[this._loadInt((_31_ + 8))]].invoke((this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return _32_;
    }

    @Override()
    public final int sqlite3OsOpen(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        _34_ = this._storeInt((_35_ + 8), (this._iiiiiiTable[this._tableIndices[this._loadInt(((_33_ = this._loadInt((_35_ + 28))) + 24))]].invoke(_33_, (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), ((this._loadInt((_35_ + 16))) & 556863), _34_)));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3OsClose(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        _30_ = this._storeInt((_31_ + 8), 0);
        label$0:
        do {
            if ((this._loadInt((this._loadInt((_31_ + 12))))) == 0) {
                break label$0;
            }
            this._storeInt((_31_ + 8), (this._iiTable[this._tableIndices[this._loadInt(((this._loadInt((_32_ = this._loadInt((_31_ + 12))))) + 4))]].invoke(_32_)));
            this._storeInt((this._loadInt((_31_ + 12))), _30_);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3OsDelete(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = this._iiiiTable[this._tableIndices[this._loadInt(((_31_ = this._loadInt((_33_ + 12))) + 28))]].invoke(_31_, (this._loadInt((_33_ + 8))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int read32bits(int _30_, long _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeLong((_33_ + 16), _31_);
        this._storeInt((_33_ + 12), _32_);
        label$0:
        do {
            if ((this._storeInt((_33_ + 4), (sqlite3OsRead((this._loadInt((_33_ + 28))), (_33_ + 8), 4, (this._loadLong((_33_ + 16))))))) != 0) {
                break label$0;
            }
            _32_ = sqlite3Get4byte((_33_ + 8));
            this._storeInt((this._loadInt((_33_ + 12))), _32_);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 4));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int sqlite3BitvecTest(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
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
                    if (((this._loadInt((_32_ + 20))) & 4294967295L) > ((this._loadInt((this._loadInt((_32_ + 24))))) & 4294967295L)) {
                        break label$2;
                    }
                    if ((this._loadInt((_32_ + 20))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + -1));
                    label$3$end:
                    do {
                        label$3:
                        while (true) {
                            if ((this._loadInt(((this._loadInt((_32_ + 24))) + 8))) == 0) {
                                break label$0;
                            }
                            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 20))) / (this._loadInt(((this._loadInt((_32_ + 24))) + 8)))));
                            this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) % (this._loadInt(((this._loadInt((_32_ + 24))) + 8)))));
                            if ((this._storeInt((_32_ + 24), (this._loadInt((((this._loadInt((_32_ + 24))) + ((this._loadInt((_32_ + 16))) << 2)) + 12))))) != 0) {
                                continue label$3;
                            }
                            break label$3$end;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 28), 0);
                    return (this._loadInt((_32_ + 28)));
                }
                while (false);
                this._storeInt((_32_ + 28), 0);
                return (this._loadInt((_32_ + 28)));
            }
            while (false);
            this._storeInt((_32_ + 28), 0);
            return (this._loadInt((_32_ + 28)));
        }
        while (false);
        label$5:
        do {
            if (((this._loadInt((this._loadInt((_32_ + 24))))) & 4294967295L) > (4000 & 4294967295L)) {
                break label$5;
            }
            this._storeInt((_32_ + 28), ((((this._loadInt8u((((this._loadInt((_32_ + 24))) + ((_31_ = this._loadInt((_32_ + 20))) >>> 3)) + 12))) & (1 << (_31_ & 7))) != 0) ? 1 : 0));
            return (this._loadInt((_32_ + 28)));
        }
        while (false);
        this._storeInt((_32_ + 20), ((_31_ = this._loadInt((_32_ + 20))) + 1));
        this._storeInt((_32_ + 12), (_31_ % 125));
        label$6:
        do {
            label$8:
            do {
                label$7:
                while (true) {
                    if ((this._loadInt((((this._loadInt((_32_ + 24))) + ((this._loadInt((_32_ + 12))) << 2)) + 12))) == 0) {
                        break label$6;
                    }
                    if ((this._loadInt((((this._loadInt((_32_ + 24))) + ((this._loadInt((_32_ + 12))) << 2)) + 12))) == (this._loadInt((_32_ + 20)))) {
                        break label$8;
                    }
                    this._storeInt((_32_ + 12), (((this._loadInt((_32_ + 12))) + 1) % 125));
                    continue label$7;
                }
            }
            while (false);
            this._storeInt((_32_ + 28), 1);
            return (this._loadInt((_32_ + 28)));
        }
        while (false);
        this._storeInt((_32_ + 28), 0);
        return (this._loadInt((_32_ + 28)));
    }

    @Override()
    public final int pager_cksum(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 12))) + 48))));
        this._storeInt(_32_, ((this._loadInt(((this._loadInt((_32_ + 12))) + 128))) + -200));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt(_32_)) < 1) {
                    break label$1;
                }
                this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + (this._loadInt8u(((this._loadInt((_32_ + 8))) + (this._loadInt(_32_)))))));
                this._storeInt(_32_, ((this._loadInt(_32_)) + -200));
                continue label$0;
            }
        }
        while (false);
        return (this._loadInt((_32_ + 4)));
    }

    @Override()
    public final int sqlite3BitvecSet(int _30_, int _31_)
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
                    this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + -1));
                    label$3:
                    do {
                        label$5:
                        do {
                            label$4:
                            while (true) {
                                _31_ = 0;
                                label$6:
                                do {
                                    if (((this._loadInt((this._loadInt((_32_ + 24))))) & 4294967295L) < (4001 & 4294967295L)) {
                                        break label$6;
                                    }
                                    _31_ = ((this._loadInt(((this._loadInt((_32_ + 24))) + 8))) != 0) ? 1 : 0;
                                }
                                while (false);
                                if (_31_ == 0) {
                                    break label$3;
                                }
                                this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 20))) / (this._loadInt(((this._loadInt((_32_ + 24))) + 8)))));
                                this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) % (this._loadInt(((this._loadInt((_32_ + 24))) + 8)))));
                                label$7:
                                do {
                                    if ((this._loadInt((((this._loadInt((_32_ + 24))) + ((this._loadInt((_32_ + 12))) << 2)) + 12))) != 0) {
                                        break label$7;
                                    }
                                    _31_ = sqlite3BitvecCreate((this._loadInt(((this._loadInt((_32_ + 24))) + 8))));
                                    if ((this._storeInt((((this._loadInt((_32_ + 24))) + ((this._loadInt((_32_ + 12))) << 2)) + 12), _31_)) == 0) {
                                        break label$5;
                                    }
                                }
                                while (false);
                                this._storeInt((_32_ + 24), (this._loadInt((((this._loadInt((_32_ + 24))) + ((this._loadInt((_32_ + 12))) << 2)) + 12))));
                                continue label$4;
                            }
                        }
                        while (false);
                        this._storeInt((_32_ + 28), 7);
                        break label$0;
                    }
                    while (false);
                    if (((this._loadInt((this._loadInt((_32_ + 24))))) & 4294967295L) > (4000 & 4294967295L)) {
                        break label$1;
                    }
                    this._storeInt8((_30_ = ((this._loadInt((_32_ + 24))) + ((_31_ = this._loadInt((_32_ + 20))) >>> 3)) + 12), ((this._loadInt8u(_30_)) | (1 << (_31_ & 7))));
                    this._storeInt((_32_ + 28), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 20), ((_31_ = this._loadInt((_32_ + 20))) + 1));
            _31_ = this._storeInt((_32_ + 16), (_31_ % 125));
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
                                    if ((this._loadInt((((this._loadInt((_32_ + 24))) + (_31_ << 2)) + 12))) == 0) {
                                        break label$13;
                                    }
                                    label$14:
                                    while (true) {
                                        if ((this._loadInt((((this._loadInt((_32_ + 24))) + ((this._loadInt((_32_ + 16))) << 2)) + 12))) == (this._loadInt((_32_ + 20)))) {
                                            break label$10;
                                        }
                                        label$16:
                                        do {
                                            if (((this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1))) & 4294967295L) < (125 & 4294967295L)) {
                                                break label$16;
                                            }
                                            this._storeInt((_32_ + 16), 0);
                                        }
                                        while (false);
                                        if ((this._loadInt((((this._loadInt((_32_ + 24))) + ((this._loadInt((_32_ + 16))) << 2)) + 12))) != 0) {
                                            continue label$14;
                                        }
                                        break label$12;
                                    }
                                }
                                while (false);
                                if (((this._loadInt(((this._loadInt((_32_ + 24))) + 4))) & 4294967295L) < (124 & 4294967295L)) {
                                    break label$11;
                                }
                            }
                            while (false);
                            if (((this._loadInt(((this._loadInt((_32_ + 24))) + 4))) & 4294967295L) < (62 & 4294967295L)) {
                                break label$11;
                            }
                            if ((this._storeInt(_32_, (sqlite3DbMallocRaw(0, 500)))) == 0) {
                                break label$8;
                            }
                            memcpy((this._loadInt(_32_)), ((this._loadInt((_32_ + 24))) + 12), 500);
                            memset(((this._loadInt((_32_ + 24))) + 12), 0, 500);
                            this._storeInt(((_31_ = this._loadInt((_32_ + 24))) + 8), (((this._loadInt(_31_)) + 124) / 125));
                            this._storeInt((_32_ + 4), (sqlite3BitvecSet(_31_, (this._loadInt((_32_ + 20))))));
                            this._storeInt((_32_ + 8), 0);
                            label$17:
                            while (true) {
                                if (((this._loadInt((_32_ + 8))) & 4294967295L) > (124 & 4294967295L)) {
                                    break label$9;
                                }
                                label$19:
                                do {
                                    if ((this._loadInt(((this._loadInt(_32_)) + ((this._loadInt((_32_ + 8))) << 2)))) == 0) {
                                        break label$19;
                                    }
                                    this._storeInt((_32_ + 4), ((sqlite3BitvecSet((this._loadInt((_32_ + 24))), (this._loadInt(((this._loadInt(_32_)) + ((this._loadInt((_32_ + 8))) << 2)))))) | (this._loadInt((_32_ + 4)))));
                                }
                                while (false);
                                this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) + 1));
                                continue label$17;
                            }
                        }
                        while (false);
                        this._storeInt(((_31_ = this._loadInt((_32_ + 24))) + 4), ((this._loadInt((_31_ + 4))) + 1));
                        this._storeInt(((_31_ + ((this._loadInt((_32_ + 16))) << 2)) + 12), (this._loadInt((_32_ + 20))));
                        this._storeInt((_32_ + 28), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_32_ + 28), 0);
                    break label$0;
                }
                while (false);
                sqlite3DbFree(0, (this._loadInt(_32_)));
                this._storeInt((_32_ + 28), (this._loadInt((_32_ + 4))));
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

    @Override()
    public final int pager_lookup(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        sqlite3PcacheFetch((this._loadInt(((this._loadInt((_32_ + 12))) + 168))), _31_, 0, (_32_ + 4));
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void sqlite3BackupUpdate(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 16), (this._loadInt((_33_ + 28))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_33_ + 16))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((isFatalError((this._loadInt(((this._loadInt((_33_ + 16))) + 28))))) != 0) {
                        break label$2;
                    }
                    if (((this._loadInt((_33_ + 24))) & 4294967295L) >= ((this._loadInt(((this._loadInt((_33_ + 16))) + 16))) & 4294967295L)) {
                        break label$2;
                    }
                    if ((this._storeInt((_33_ + 12), (backupOnePage((this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))))))) == 0) {
                        break label$2;
                    }
                    this._storeInt(((this._loadInt((_33_ + 16))) + 28), (this._loadInt((_33_ + 12))));
                }
                while (false);
                this._storeInt((_33_ + 16), (this._loadInt(((this._loadInt((_33_ + 16))) + 44))));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void sqlite3PcacheMakeDirty(int _30_)
    {
        int _31_ = 0;
        _31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16));
        this._storeInt16((_30_ + 20), ((this._loadInt16u((_30_ + 20))) & 65503));
        label$0:
        do {
            if (((this._loadInt16u(((this._storeInt((_31_ + 12), _30_)) + 20))) & 2) != 0) {
                break label$0;
            }
            this._storeInt16(((_30_ = this._loadInt((_31_ + 12))) + 20), ((this._loadInt16u((_30_ + 20))) | 2));
            pcacheAddToDirtyList(_30_);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3PcacheMakeClean(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if (((this._loadInt16u(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 20))) & 2) == 0) {
                break label$0;
            }
            pcacheRemoveFromDirtyList((this._loadInt((_31_ + 12))));
            this._storeInt16(((_30_ = this._loadInt((_31_ + 12))) + 20), ((this._loadInt16u((_30_ + 20))) & 65529));
            if ((this._loadInt16s((_30_ + 22))) != 0) {
                break label$0;
            }
            pcacheUnpin((this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3PcacheRelease(int _30_)
    {
        int _31_ = 0;
        _31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16));
        this._storeInt16((_30_ + 22), ((this._loadInt16u((_30_ + 22))) + -1));
        label$0:
        do {
            if ((this._loadInt16s(((this._storeInt((_31_ + 12), _30_)) + 22))) != 0) {
                break label$0;
            }
            this._storeInt(((_30_ = this._loadInt(((this._loadInt((_31_ + 12))) + 24))) + 12), ((this._loadInt((_30_ + 12))) + -1));
            this._storeInt((_31_ + 8), _30_);
            label$1:
            do {
                if (((this._loadInt16u(((this._loadInt((_31_ + 12))) + 20))) & 2) != 0) {
                    break label$1;
                }
                pcacheUnpin((this._loadInt((_31_ + 12))));
                break label$0;
            }
            while (false);
            pcacheRemoveFromDirtyList((this._loadInt((_31_ + 12))));
            pcacheAddToDirtyList((this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void pcacheUnpin(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 24))))) + 28))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 12))) + 12))) != 1) {
                    break label$1;
                }
                this._storeInt(((this._loadInt((_31_ + 8))) + 44), 0);
            }
            while (false);
            this._viiiTable[this._tableIndices[this._loadInt((0 + 20364))]].invoke((this._loadInt(((this._loadInt((_31_ + 8))) + 40))), (this._loadInt((_31_ + 12))), 0);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void pcacheRemoveFromDirtyList(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 24))))) + 8))) != (this._loadInt((_31_ + 12)))) {
                break label$0;
            }
            this._storeInt((_31_ + 4), (this._loadInt(((this._loadInt((_31_ + 12))) + 32))));
            label$2:
            do {
                label$1:
                while (true) {
                    _30_ = 0;
                    label$3:
                    do {
                        if ((this._loadInt((_31_ + 4))) == 0) {
                            break label$3;
                        }
                        _30_ = ((this._loadInt16u(((this._loadInt((_31_ + 4))) + 20))) & 4) >>> 2;
                    }
                    while (false);
                    if (_30_ == 0) {
                        break label$2;
                    }
                    this._storeInt((_31_ + 4), (this._loadInt(((this._loadInt((_31_ + 4))) + 32))));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt(((this._loadInt((_31_ + 8))) + 8), (this._loadInt((_31_ + 4))));
        }
        while (false);
        label$4:
        do {
            label$5:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 12))) + 28))) == 0) {
                    break label$5;
                }
                this._storeInt(((this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 28))) + 32), (this._loadInt((_30_ + 32))));
                break label$4;
            }
            while (false);
            this._storeInt(((this._loadInt((_31_ + 8))) + 4), (this._loadInt(((this._loadInt((_31_ + 12))) + 32))));
        }
        while (false);
        label$6:
        do {
            label$7:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 12))) + 32))) == 0) {
                    break label$7;
                }
                this._storeInt(((this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 32))) + 28), (this._loadInt((_30_ + 28))));
                break label$6;
            }
            while (false);
            this._storeInt((this._loadInt((_31_ + 8))), (this._loadInt(((this._loadInt((_31_ + 12))) + 28))));
        }
        while (false);
        this._storeInt(((_31_ = this._loadInt((_31_ + 12))) + 28), (this._storeInt((_31_ + 32), 0)));
        return;
    }

    @Override()
    public final void pcacheAddToDirtyList(int _30_)
    {
        int _31_ = 0;
        _30_ = this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._loadInt(((this._storeInt((_31_ + 12), _30_)) + 24))));
        label$0:
        do {
            if ((this._storeInt(((this._loadInt((_31_ + 12))) + 28), (this._loadInt(_30_)))) == 0) {
                break label$0;
            }
            this._storeInt(((this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 28))) + 32), _30_);
        }
        while (false);
        this._storeInt((_30_ = this._loadInt((_31_ + 8))), (this._loadInt((_31_ + 12))));
        label$1:
        do {
            if ((this._loadInt((_30_ + 4))) != 0) {
                break label$1;
            }
            this._storeInt(((this._loadInt((_31_ + 8))) + 4), (this._loadInt((_31_ + 12))));
        }
        while (false);
        label$2:
        do {
            if ((this._loadInt(((this._loadInt((_31_ + 8))) + 8))) != 0) {
                break label$2;
            }
            if (((this._loadInt16u(((this._loadInt((_31_ + 12))) + 20))) & 4) != 0) {
                break label$2;
            }
            this._storeInt(((this._loadInt((_31_ + 8))) + 8), (this._loadInt((_31_ + 12))));
        }
        while (false);
        return;
    }

    @Override()
    public final int sqlite3PcacheFetch(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_34_ + 36), _31_);
        this._storeInt((_34_ + 32), _32_);
        this._storeInt((_34_ + 28), _33_);
        this._storeInt((_34_ + 24), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_34_ + 40))) + 40))) != 0) {
                    break label$1;
                }
                if ((this._loadInt((_34_ + 32))) == 0) {
                    break label$1;
                }
                _33_ = this._storeInt((_34_ + 12), (((this._loadInt(((_33_ = this._loadInt((_34_ + 40))) + 20))) + (this._loadInt((_33_ + 24)))) + 36));
                label$2:
                do {
                    if ((this._storeInt((_34_ + 16), (this._iiiTable[this._tableIndices[this._loadInt((0 + 20348))]].invoke(_33_, (this._loadInt(((this._loadInt((_34_ + 40))) + 28))))))) == 0) {
                        break label$2;
                    }
                    this._viiTable[this._tableIndices[this._loadInt((0 + 20352))]].invoke((this._loadInt((_34_ + 16))), (this._loadInt(((this._loadInt((_34_ + 40))) + 16))));
                    this._storeInt(((this._loadInt((_34_ + 40))) + 40), (this._loadInt((_34_ + 16))));
                    break label$1;
                }
                while (false);
                this._storeInt((_34_ + 44), 7);
                break label$0;
            }
            while (false);
            _32_ = this._loadInt((_34_ + 32));
            _33_ = 1;
            label$3:
            do {
                if ((this._loadInt(((this._loadInt((_34_ + 40))) + 28))) == 0) {
                    break label$3;
                }
                _33_ = ((this._loadInt((this._loadInt((_34_ + 40))))) == 0) ? 1 : 0;
            }
            while (false);
            this._storeInt((_34_ + 20), (_32_ * (_33_ + 1)));
            label$4:
            do {
                if ((this._loadInt(((this._loadInt((_34_ + 40))) + 40))) == 0) {
                    break label$4;
                }
                this._storeInt((_34_ + 24), (this._iiiiTable[this._tableIndices[this._loadInt((0 + 20360))]].invoke((this._loadInt(((this._loadInt((_34_ + 40))) + 40))), (this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 20))))));
            }
            while (false);
            label$5:
            do {
                if ((this._loadInt((_34_ + 24))) != 0) {
                    break label$5;
                }
                if ((this._loadInt((_34_ + 20))) != 1) {
                    break label$5;
                }
                this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((_34_ + 40))) + 8))));
                label$7:
                do {
                    label$6:
                    while (true) {
                        _33_ = 0;
                        label$8:
                        do {
                            if ((this._loadInt((_34_ + 8))) == 0) {
                                break label$8;
                            }
                            _33_ = 1;
                            if ((this._loadInt16s(((this._loadInt((_34_ + 8))) + 22))) != 0) {
                                break label$8;
                            }
                            _33_ = ((this._loadInt16u(((this._loadInt((_34_ + 8))) + 20))) & 4) >>> 2;
                        }
                        while (false);
                        if (_33_ == 0) {
                            break label$7;
                        }
                        this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((_34_ + 8))) + 32))));
                        continue label$6;
                    }
                }
                while (false);
                label$9:
                do {
                    if ((this._storeInt(((this._loadInt((_34_ + 40))) + 8), (this._loadInt((_34_ + 8))))) != 0) {
                        break label$9;
                    }
                    this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((_34_ + 40))) + 4))));
                    label$11:
                    do {
                        label$10:
                        while (true) {
                            _33_ = 0;
                            label$12:
                            do {
                                if ((this._loadInt((_34_ + 8))) == 0) {
                                    break label$12;
                                }
                                _33_ = ((this._loadInt16s(((this._loadInt((_34_ + 8))) + 22))) != 0) ? 1 : 0;
                            }
                            while (false);
                            if (_33_ == 0) {
                                break label$11;
                            }
                            this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((_34_ + 8))) + 32))));
                            continue label$10;
                        }
                    }
                    while (false);
                }
                while (false);
                label$13:
                do {
                    if ((this._loadInt((_34_ + 8))) == 0) {
                        break label$13;
                    }
                    if ((this._storeInt((_34_ + 4), (this._iiiTable[this._tableIndices[this._loadInt(((_33_ = this._loadInt((_34_ + 40))) + 32))]].invoke((this._loadInt((_33_ + 36))), (this._loadInt((_34_ + 8))))))) == 0) {
                        break label$13;
                    }
                    if ((this._loadInt((_34_ + 4))) == 5) {
                        break label$13;
                    }
                    this._storeInt((_34_ + 44), (this._loadInt((_34_ + 4))));
                    break label$0;
                }
                while (false);
                this._storeInt((_34_ + 24), (this._iiiiTable[this._tableIndices[this._loadInt((0 + 20360))]].invoke((this._loadInt(((this._loadInt((_34_ + 40))) + 40))), (this._loadInt((_34_ + 36))), 2)));
            }
            while (false);
            label$14:
            do {
                if ((this._loadInt((_34_ + 24))) == 0) {
                    break label$14;
                }
                label$15:
                do {
                    if ((this._loadInt((this._loadInt((_34_ + 24))))) != 0) {
                        break label$15;
                    }
                    memset((this._loadInt((_34_ + 24))), 0, 36);
                    this._storeInt(((_33_ = this._loadInt((_34_ + 24))) + 4), ((this._storeInt(_33_, (_33_ + 36))) + (this._loadInt(((_33_ = this._loadInt((_34_ + 40))) + 20)))));
                    memset((this._loadInt(((this._loadInt((_34_ + 24))) + 4))), 0, (this._loadInt((_33_ + 24))));
                    this._storeInt(((_33_ = this._loadInt((_34_ + 24))) + 12), (this._loadInt((_34_ + 36))));
                    this._storeInt((_33_ + 24), (this._loadInt((_34_ + 40))));
                }
                while (false);
                label$16:
                do {
                    if ((this._loadInt16s(((this._loadInt((_34_ + 24))) + 22))) != 0) {
                        break label$16;
                    }
                    this._storeInt(((_33_ = this._loadInt((_34_ + 40))) + 12), ((this._loadInt((_33_ + 12))) + 1));
                }
                while (false);
                this._storeInt16(((_33_ = this._loadInt((_34_ + 24))) + 22), ((this._loadInt16u((_33_ + 22))) + 1));
                if ((this._loadInt((_34_ + 36))) != 1) {
                    break label$14;
                }
                this._storeInt(((this._loadInt((_34_ + 40))) + 44), (this._loadInt((_34_ + 24))));
            }
            while (false);
            _33_ = 0;
            label$17:
            do {
                if ((this._storeInt((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 24))))) != 0) {
                    break label$17;
                }
                _33_ = ((this._loadInt((_34_ + 20))) != 0) ? 1 : 0;
            }
            while (false);
            _temp$0 = 7;
            _temp$1 = 0;
            _temp$2 = (_33_ != 0) ? _temp$0 : _temp$1;
            this._storeInt((_34_ + 44), _temp$2);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int sqlite3BitvecCreate(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_31_ + 8), (sqlite3MallocZero(512)))) == 0) {
                break label$0;
            }
            this._storeInt((this._loadInt((_31_ + 8))), (this._loadInt((_31_ + 12))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void sqlite3BackupRestart(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeInt((_31_ + 12), _30_)));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 8))) == 0) {
                    break label$1;
                }
                this._storeInt(((this._loadInt((_31_ + 8))) + 16), 1);
                this._storeInt((_31_ + 8), (this._loadInt(((this._loadInt((_31_ + 8))) + 44))));
                continue label$0;
            }
        }
        while (false);
        return;
    }

    @Override()
    public final void sqlite3PcacheClear(int _30_)
    {
        int _31_ = 0;
        sqlite3PcacheTruncate((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 0);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3PcacheTruncate(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_32_ + 12))) + 40))) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 4), (this._loadInt((this._loadInt((_32_ + 12))))));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 4))) == 0) {
                        break label$2;
                    }
                    this._storeInt(_32_, (this._loadInt(((this._loadInt((_32_ + 4))) + 28))));
                    label$3:
                    do {
                        if (((this._loadInt(((this._loadInt((_32_ + 4))) + 12))) & 4294967295L) <= ((this._loadInt((_32_ + 8))) & 4294967295L)) {
                            break label$3;
                        }
                        sqlite3PcacheMakeClean((this._loadInt((_32_ + 4))));
                    }
                    while (false);
                    this._storeInt((_32_ + 4), (this._loadInt(_32_)));
                    continue label$1;
                }
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt((_32_ + 8))) != 0) {
                    break label$4;
                }
                if ((this._loadInt(((this._loadInt((_32_ + 12))) + 44))) == 0) {
                    break label$4;
                }
                memset((this._loadInt((this._loadInt(((_31_ = this._loadInt((_32_ + 12))) + 44))))), 0, (this._loadInt((_31_ + 20))));
                this._storeInt((_32_ + 8), 1);
            }
            while (false);
            this._viiTable[this._tableIndices[this._loadInt((0 + 20372))]].invoke((this._loadInt(((this._loadInt((_32_ + 12))) + 40))), ((this._loadInt((_32_ + 8))) + 1));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final long journalHdrOffset(int _30_)
    {
        long _31_ = 0L;
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 32) + 28), _30_);
        this._storeLong((_32_ + 16), 0L);
        label$0:
        do {
            if ((this._storeLong((_32_ + 8), (this._loadLong(((this._loadInt((_32_ + 28))) + 72))))) == 0) {
                break label$0;
            }
            this._storeLong((_32_ + 16), (((((this._loadLong((_32_ + 8))) + -1L) / (_31_ = this._loadLong32u(((this._loadInt((_32_ + 28))) + 124)))) + 1L) * _31_));
        }
        while (false);
        return (this._loadLong((_32_ + 16)));
    }

    @Override()
    public final int sqlite3PagerSetPagesize(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 16), 0);
        this._storeInt((_33_ + 12), (this._loadInt((this._loadInt((_33_ + 24))))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 28))) + 14))) == 0) {
                    break label$1;
                }
                if ((this._loadInt(((this._loadInt((_33_ + 28))) + 24))) != 0) {
                    break label$0;
                }
            }
            while (false);
            if ((sqlite3PcacheRefCount((this._loadInt(((this._loadInt((_33_ + 28))) + 168))))) != 0) {
                break label$0;
            }
            if ((this._loadInt((_33_ + 12))) == 0) {
                break label$0;
            }
            if ((this._loadInt((_33_ + 12))) == (this._loadInt(((this._loadInt((_33_ + 28))) + 128)))) {
                break label$0;
            }
            this._storeInt((_33_ + 8), 0);
            this._storeLong(_33_, 0L);
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 28))) + 15))) < 1) {
                    break label$2;
                }
                if ((this._loadInt((this._loadInt(((this._loadInt((_33_ + 28))) + 60))))) == 0) {
                    break label$2;
                }
                this._storeInt((_33_ + 16), (sqlite3OsFileSize((this._loadInt(((this._loadInt((_33_ + 28))) + 60))), _33_)));
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((_33_ + 16))) != 0) {
                    break label$3;
                }
                if ((this._storeInt((_33_ + 8), (sqlite3PageMalloc((this._loadInt((_33_ + 12))))))) != 0) {
                    break label$3;
                }
                this._storeInt((_33_ + 16), 7);
            }
            while (false);
            if ((this._loadInt((_33_ + 16))) != 0) {
                break label$0;
            }
            pager_reset((this._loadInt((_33_ + 28))));
            _31_ = this._storeInt(((_32_ = this._loadInt((_33_ + 28))) + 128), (this._loadInt((_33_ + 12))));
            this._storeLong32((_32_ + 24), ((this._loadLong(_33_)) / (_31_ & 4294967295L)));
            sqlite3PageFree((this._loadInt(((this._loadInt((_33_ + 28))) + 164))));
            this._storeInt(((_32_ = this._loadInt((_33_ + 28))) + 164), (this._loadInt((_33_ + 8))));
            sqlite3PcacheSetPageSize((this._loadInt((_32_ + 168))), (this._loadInt((_33_ + 12))));
        }
        while (false);
        this._storeInt((this._loadInt((_33_ + 24))), (this._loadInt(((this._loadInt((_33_ + 28))) + 128))));
        label$4:
        do {
            if ((this._loadInt((_33_ + 16))) != 0) {
                break label$4;
            }
            label$5:
            do {
                if ((this._loadInt((_33_ + 20))) > -1) {
                    break label$5;
                }
                this._storeInt((_33_ + 20), (this._loadInt16s(((this._loadInt((_33_ + 28))) + 118))));
            }
            while (false);
            this._storeInt16(((this._loadInt((_33_ + 28))) + 118), (this._loadInt((_33_ + 20))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 16));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int sqlite3PcacheRefCount(int _30_)
    {
        return (this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 12)));
    }

    @Override()
    public final int sqlite3PageMalloc(int _30_)
    {
        int _31_ = 0;
        _30_ = pcache1Alloc((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void sqlite3PageFree(int _30_)
    {
        int _31_ = 0;
        pcache1Free((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3PcacheSetPageSize(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_32_ + 12))) + 40))) == 0) {
                break label$0;
            }
            this._viTable[this._tableIndices[this._loadInt((0 + 20376))]].invoke((this._loadInt(((this._loadInt((_32_ + 12))) + 40))));
            this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 40), (this._storeInt((_31_ + 44), 0)));
        }
        while (false);
        this._storeInt(((this._loadInt((_32_ + 12))) + 20), (this._loadInt((_32_ + 8))));
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void releaseAllSavepoints(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_31_ + 8), 0);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 8))) >= (this._loadInt(((this._loadInt((_31_ + 12))) + 96)))) {
                    break label$1;
                }
                sqlite3BitvecDestroy((this._loadInt((((this._loadInt(((this._loadInt((_31_ + 12))) + 92))) + ((this._loadInt((_31_ + 8))) * 48)) + 16))));
                this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) + 1));
                continue label$0;
            }
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 12))) + 4))) == 0) {
                    break label$3;
                }
                if ((sqlite3IsMemJournal((this._loadInt(((this._loadInt((_31_ + 12))) + 68))))) == 0) {
                    break label$2;
                }
            }
            while (false);
            sqlite3OsClose((this._loadInt(((this._loadInt((_31_ + 12))) + 68))));
        }
        while (false);
        sqlite3_free((this._loadInt(((this._loadInt((_31_ + 12))) + 92))));
        this._storeLong(((_30_ = this._loadInt((_31_ + 12))) + 92), 0L);
        this._storeInt((_30_ + 52), 0);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3IsMemJournal(int _30_)
    {
        return (((this._loadInt((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)))) == 29420) ? 1 : 0);
    }

    @Override()
    public final int zeroJournalHdr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 20), 0);
        label$0:
        do {
            if ((this._loadLong(((this._loadInt((_32_ + 28))) + 72))) == 0) {
                break label$0;
            }
            this._storeLong((_32_ + 8), (this._loadLong(((this._loadInt((_32_ + 28))) + 136))));
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_32_ + 24))) != 0) {
                        break label$2;
                    }
                    if ((this._loadLong((_32_ + 8))) == 0L) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 20), (sqlite3OsWrite((this._loadInt(((this._loadInt((_32_ + 28))) + 64))), 29392, 28, 0L)));
                    break label$1;
                }
                while (false);
                this._storeInt((_32_ + 20), (sqlite3OsTruncate((this._loadInt(((this._loadInt((_32_ + 28))) + 64))), 0L)));
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((_32_ + 20))) != 0) {
                    break label$3;
                }
                if ((this._loadInt8u(((this._loadInt((_32_ + 28))) + 8))) != 0) {
                    break label$3;
                }
                this._storeInt((_32_ + 20), (sqlite3OsSync((this._loadInt(((_31_ = this._loadInt((_32_ + 28))) + 64))), ((this._loadInt8u((_31_ + 11))) | 16))));
            }
            while (false);
            if ((this._loadInt((_32_ + 20))) != 0) {
                break label$0;
            }
            if ((this._loadLong((_32_ + 8))) < 1L) {
                break label$0;
            }
            if ((this._storeInt((_32_ + 20), (sqlite3OsFileSize((this._loadInt(((this._loadInt((_32_ + 28))) + 64))), _32_)))) != 0) {
                break label$0;
            }
            if ((this._loadLong(_32_)) <= (this._loadLong((_32_ + 8)))) {
                break label$0;
            }
            this._storeInt((_32_ + 20), (sqlite3OsTruncate((this._loadInt(((this._loadInt((_32_ + 28))) + 64))), (this._loadLong((_32_ + 8))))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 20));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }
}
