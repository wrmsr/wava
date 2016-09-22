package sqlite3;

abstract class sqlite3$11
        extends sqlite3$10
{
    protected sqlite3$11(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final int sqlite3_aggregate_count(int _30_)
    {
        return (this._loadInt(((this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 48))) + 24)));
    }

    @Override()
    public final int sqlite3_bind_blob(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        _34_ = bindText((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 16))), _34_, 0);
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3_bind_double(int _30_, int _31_, double _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeDouble((_33_ + 16), _32_);
        label$0:
        do {
            if ((this._storeInt((_33_ + 12), (vdbeUnbind((this._storeInt((_33_ + 8), (this._loadInt((_33_ + 28))))), (this._loadInt((_33_ + 24))))))) != 0) {
                break label$0;
            }
            sqlite3VdbeMemSetDouble((((this._loadInt(((this._loadInt((_33_ + 8))) + 72))) + ((this._loadInt((_33_ + 24))) * 40)) + -40), (this._loadDouble((_33_ + 16))));
        }
        while (false);
        _31_ = this._loadInt((_33_ + 12));
        this._storeInt((0 + 4), (_33_ + 32));
        return _31_;
    }

    @Override()
    public final int sqlite3_bind_int(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = sqlite3_bind_int64((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), (this._loadLong32s((_33_ + 4))));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int sqlite3_bind_int64(int _30_, int _31_, long _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeLong((_33_ + 16), _32_);
        label$0:
        do {
            if ((this._storeInt((_33_ + 12), (vdbeUnbind((this._storeInt((_33_ + 8), (this._loadInt((_33_ + 28))))), (this._loadInt((_33_ + 24))))))) != 0) {
                break label$0;
            }
            sqlite3VdbeMemSetInt64((((this._loadInt(((this._loadInt((_33_ + 8))) + 72))) + ((this._loadInt((_33_ + 24))) * 40)) + -40), (this._loadLong((_33_ + 16))));
        }
        while (false);
        _31_ = this._loadInt((_33_ + 12));
        this._storeInt((0 + 4), (_33_ + 32));
        return _31_;
    }

    @Override()
    public final int sqlite3_bind_null(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this._storeInt((_32_ + 4), (vdbeUnbind((this._storeInt(_32_, (this._loadInt((_32_ + 12))))), (this._loadInt((_32_ + 8))))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3_bind_parameter_count(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeInt((_32_ + 12), _30_)))) == 0) {
                break label$0;
            }
            _31_ = this._loadInt16s(((this._loadInt((_32_ + 8))) + 80));
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int sqlite3_bind_parameter_index(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = sqlite3VdbeParameterIndex((this._loadInt((_32_ + 12))), _31_, (sqlite3Strlen30(_31_)));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3_bind_parameter_name(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(_32_, (this._loadInt((_32_ + 8))))) == 0) {
                    break label$1;
                }
                if ((this._loadInt((_32_ + 4))) < 1) {
                    break label$1;
                }
                if ((this._loadInt((_32_ + 4))) <= (this._loadInt16s(((this._loadInt(_32_)) + 82)))) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt((_32_ + 12), 0);
            return (this._loadInt((_32_ + 12)));
        }
        while (false);
        this._storeInt((_32_ + 12), (this._loadInt((((this._loadInt(((this._loadInt(_32_)) + 76))) + ((this._loadInt((_32_ + 4))) << 2)) + -4))));
        return (this._loadInt((_32_ + 12)));
    }

    @Override()
    public final int sqlite3_bind_text(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        _34_ = bindText((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 16))), _34_, 1);
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3_bind_text16(int _30_, int _31_, int _32_, int _33_, int _34_)
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
        _temp$0 = 2;
        _temp$1 = 3;
        _temp$2 = ((this._loadInt8s((0 + 29180))) != 0) ? _temp$0 : _temp$1;
        _temp$2 = bindText((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 16))), _34_, _temp$2);
        _34_ = _temp$2;
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3_bind_value(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if (((_32_ = (this._loadInt8u(((this._storeInt((_33_ + 4), _32_)) + 30))) + -1) & 4294967295L) > (3 & 4294967295L)) {
                            break label$3;
                        }
                        label$4:
                        do {
                            label$5:
                            do {
                                label$6:
                                do {
                                    switch (_32_) {
                                        case 0: {
                                            break label$6;
                                        }
                                        case 1: {
                                            break label$2;
                                        }
                                        case 2: {
                                            break label$5;
                                        }
                                        case 3: {
                                            break label$4;
                                        }
                                        default: {
                                            break label$6;
                                        }
                                    }
                                }
                                while (false);
                                this._storeInt(_33_, (sqlite3_bind_int64((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), (this._loadLong(((this._loadInt((_33_ + 4))) + 16))))));
                                break label$0;
                            }
                            while (false);
                            this._storeInt(_33_, (bindText((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), (this._loadInt(((_32_ = this._loadInt((_33_ + 4))) + 4))), (this._loadInt((_32_ + 24))), -1, (this._loadInt8u((_32_ + 31))))));
                            break label$0;
                        }
                        while (false);
                        if (((this._loadInt16u(((this._loadInt((_33_ + 4))) + 28))) & 16384) == 0) {
                            break label$1;
                        }
                        this._storeInt(_33_, (sqlite3_bind_zeroblob((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), (this._loadInt(((this._loadInt((_33_ + 4))) + 16))))));
                        break label$0;
                    }
                    while (false);
                    this._storeInt(_33_, (sqlite3_bind_null((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))))));
                    break label$0;
                }
                while (false);
                this._storeInt(_33_, (sqlite3_bind_double((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), (this._loadDouble(((this._loadInt((_33_ + 4))) + 8))))));
                break label$0;
            }
            while (false);
            this._storeInt(_33_, (sqlite3_bind_blob((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), (this._loadInt(((_32_ = this._loadInt((_33_ + 4))) + 4))), (this._loadInt((_32_ + 24))), -1)));
        }
        while (false);
        _32_ = this._loadInt(_33_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int sqlite3_busy_handler(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(((_31_ = this._loadInt((_33_ + 12))) + 428), (this._loadInt((_33_ + 8))));
        this._storeInt((_31_ + 432), _32_);
        return (this._storeInt(((this._loadInt((_33_ + 12))) + 436), 0));
    }

    @Override()
    public final int sqlite3_busy_timeout(int _30_, int _31_)
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
                this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 440), (this._loadInt((_32_ + 8))));
                sqlite3_busy_handler(_31_, 16, _31_);
                break label$0;
            }
            while (false);
            sqlite3_busy_handler((this._loadInt((_32_ + 12))), 0, 0);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return 0;
    }

    @Override()
    public final int sqlite3_changes(int _30_)
    {
        return (this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 60)));
    }

    @Override()
    public final int sqlite3_close(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_)) == 0) {
                            break label$3;
                        }
                        if ((sqlite3SafetyCheckSickOrOk((this._loadInt((_32_ + 40))))) == 0) {
                            break label$2;
                        }
                        sqlite3ResetInternalSchema((this._loadInt((_32_ + 40))), -1);
                        sqlite3VtabRollback((this._loadInt((_32_ + 40))));
                        if ((this._loadInt(((this._loadInt((_32_ + 40))) + 136))) == 0) {
                            break label$1;
                        }
                        sqlite3Error((this._loadInt((_32_ + 40))), 5, 60512, 0);
                        this._storeInt((_32_ + 44), 5);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_32_ + 44), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 44), (sqlite3MisuseError(108609)));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 32), 0);
            label$4:
            do {
                label$6:
                do {
                    label$5:
                    while (true) {
                        if ((this._loadInt((_32_ + 32))) >= (this._loadInt(((this._loadInt((_32_ + 40))) + 4)))) {
                            break label$4;
                        }
                        label$7:
                        do {
                            if ((this._storeInt((_32_ + 28), (this._loadInt((((this._loadInt(((this._loadInt((_32_ + 40))) + 8))) + ((this._loadInt((_32_ + 32))) << 4)) + 4))))) == 0) {
                                break label$7;
                            }
                            if ((sqlite3BtreeIsInBackup((this._loadInt((_32_ + 28))))) != 0) {
                                break label$6;
                            }
                        }
                        while (false);
                        this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) + 1));
                        continue label$5;
                    }
                }
                while (false);
                sqlite3Error((this._loadInt((_32_ + 40))), 5, 60560, 0);
                this._storeInt((_32_ + 44), 5);
                break label$0;
            }
            while (false);
            sqlite3CloseSavepoints((this._loadInt((_32_ + 40))));
            _31_ = this._storeInt((_32_ + 32), 0);
            label$9:
            do {
                label$8:
                while (true) {
                    if ((this._loadInt((_32_ + 32))) >= (this._loadInt(((this._loadInt((_32_ + 40))) + 4)))) {
                        break label$9;
                    }
                    label$10:
                    do {
                        if ((this._loadInt(((this._storeInt((_32_ + 24), ((this._loadInt(((this._loadInt((_32_ + 40))) + 8))) + ((this._loadInt((_32_ + 32))) << 4)))) + 4))) == 0) {
                            break label$10;
                        }
                        sqlite3BtreeClose((this._loadInt(((this._loadInt((_32_ + 24))) + 4))));
                        _30_ = this._storeInt(((this._loadInt((_32_ + 24))) + 4), _31_);
                        if ((this._loadInt((_32_ + 32))) == 1) {
                            break label$10;
                        }
                        this._storeInt(((this._loadInt((_32_ + 24))) + 12), _30_);
                    }
                    while (false);
                    this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) + 1));
                    continue label$8;
                }
            }
            while (false);
            sqlite3ResetInternalSchema((this._loadInt((_32_ + 40))), -1);
            this._storeInt((_32_ + 32), 0);
            label$12:
            do {
                label$11:
                while (true) {
                    label$13:
                    do {
                        label$14:
                        do {
                            if ((this._loadInt((_32_ + 32))) > 22) {
                                break label$14;
                            }
                            this._storeInt((_32_ + 12), (this._loadInt((((this._loadInt((_32_ + 40))) + ((this._loadInt((_32_ + 32))) << 2)) + 320))));
                            label$15:
                            while (true) {
                                if ((this._loadInt((_32_ + 12))) == 0) {
                                    break label$13;
                                }
                                this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt((_32_ + 12))) + 28))));
                                label$18:
                                do {
                                    label$17:
                                    while (true) {
                                        if ((this._loadInt((_32_ + 12))) == 0) {
                                            break label$18;
                                        }
                                        functionDestroy((this._loadInt((_32_ + 40))), (this._loadInt((_32_ + 12))));
                                        this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 12))) + 8))));
                                        sqlite3DbFree((this._loadInt((_32_ + 40))), (this._loadInt((_32_ + 12))));
                                        this._storeInt((_32_ + 12), (this._loadInt((_32_ + 20))));
                                        continue label$17;
                                    }
                                }
                                while (false);
                                this._storeInt((_32_ + 12), (this._loadInt((_32_ + 16))));
                                continue label$15;
                            }
                        }
                        while (false);
                        this._storeInt((_32_ + 36), (this._loadInt(((this._loadInt((_32_ + 40))) + 420))));
                        label$19:
                        while (true) {
                            label$21:
                            do {
                                label$22:
                                do {
                                    if ((this._loadInt((_32_ + 36))) == 0) {
                                        break label$22;
                                    }
                                    this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((_32_ + 36))) + 8))));
                                    this._storeInt((_32_ + 32), 0);
                                    label$23:
                                    while (true) {
                                        if ((this._loadInt((_32_ + 32))) > 2) {
                                            break label$21;
                                        }
                                        label$25:
                                        do {
                                            if ((this._loadInt((((this._loadInt((_32_ + 8))) + ((this._loadInt((_32_ + 32))) * 20)) + 16))) == 0) {
                                                break label$25;
                                            }
                                            this._viTable[this._tableIndices[this._loadInt(((_30_ = (this._loadInt((_32_ + 8))) + ((this._loadInt((_32_ + 32))) * 20)) + 16))]].invoke((this._loadInt((_30_ + 8))));
                                        }
                                        while (false);
                                        this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) + 1));
                                        continue label$23;
                                    }
                                }
                                while (false);
                                sqlite3HashClear(((this._loadInt((_32_ + 40))) + 412));
                                this._storeInt((_32_ + 36), (this._loadInt(((this._loadInt((_32_ + 40))) + 296))));
                                label$27:
                                do {
                                    label$26:
                                    while (true) {
                                        if ((this._loadInt((_32_ + 36))) == 0) {
                                            break label$27;
                                        }
                                        label$28:
                                        do {
                                            if ((this._loadInt(((this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 36))) + 8))))) + 12))) == 0) {
                                                break label$28;
                                            }
                                            this._viTable[this._tableIndices[this._loadInt(((_30_ = this._loadInt((_32_ + 4))) + 12))]].invoke((this._loadInt((_30_ + 8))));
                                        }
                                        while (false);
                                        sqlite3DbFree((this._loadInt((_32_ + 40))), (this._loadInt((_32_ + 4))));
                                        this._storeInt((_32_ + 36), (this._loadInt((this._loadInt((_32_ + 36))))));
                                        continue label$26;
                                    }
                                }
                                while (false);
                                sqlite3HashClear(((this._loadInt((_32_ + 40))) + 288));
                                sqlite3Error((this._loadInt((_32_ + 40))), 0, 0, 0);
                                label$29:
                                do {
                                    if ((this._loadInt(((this._loadInt((_32_ + 40))) + 212))) == 0) {
                                        break label$29;
                                    }
                                    sqlite3ValueFree((this._loadInt(((this._loadInt((_32_ + 40))) + 212))));
                                }
                                while (false);
                                sqlite3CloseExtensions((this._loadInt((_32_ + 40))));
                                this._storeInt(((_30_ = this._loadInt((_32_ + 40))) + 56), -1254786768);
                                sqlite3DbFree(_30_, (this._loadInt(((this._loadInt((_30_ + 8))) + 28))));
                                this._storeInt(((_30_ = this._loadInt((_32_ + 40))) + 56), -1623446221);
                                label$30:
                                do {
                                    if ((this._loadInt8u((_30_ + 235))) == 0) {
                                        break label$30;
                                    }
                                    sqlite3_free((this._loadInt(((this._loadInt((_32_ + 40))) + 260))));
                                }
                                while (false);
                                sqlite3_free((this._loadInt((_32_ + 40))));
                                this._storeInt((_32_ + 44), 0);
                                break label$12;
                            }
                            while (false);
                            sqlite3DbFree((this._loadInt((_32_ + 40))), (this._loadInt((_32_ + 8))));
                            this._storeInt((_32_ + 36), (this._loadInt((this._loadInt((_32_ + 36))))));
                            continue label$19;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) + 1));
                    continue label$11;
                }
            }
            while (false);
        }
        while (false);
        _30_ = this._loadInt((_32_ + 44));
        this._storeInt((0 + 4), (_32_ + 48));
        return _30_;
    }

    @Override()
    public final int sqlite3_collation_needed(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        _31_ = this._storeInt((_33_ + 4), _32_);
        _30_ = this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 204), 0);
        this._storeInt((_32_ + 200), _31_);
        this._storeInt((_32_ + 208), (this._loadInt((_33_ + 8))));
        return _30_;
    }

    @Override()
    public final int sqlite3_collation_needed16(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        _31_ = this._storeInt((_33_ + 4), _32_);
        this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 204), _31_);
        _31_ = this._storeInt((_32_ + 200), 0);
        this._storeInt((_32_ + 208), (this._loadInt((_33_ + 8))));
        return _31_;
    }

    @Override()
    public final int sqlite3_column_blob(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), (sqlite3_value_blob((columnMem((this._loadInt((_32_ + 12))), _31_)))));
        columnMallocFailure((this._loadInt((_32_ + 12))));
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3_column_bytes(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), (sqlite3_value_bytes((columnMem((this._loadInt((_32_ + 12))), _31_)))));
        columnMallocFailure((this._loadInt((_32_ + 12))));
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3_column_bytes16(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), (sqlite3_value_bytes16((columnMem((this._loadInt((_32_ + 12))), _31_)))));
        columnMallocFailure((this._loadInt((_32_ + 12))));
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3_column_count(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeInt((_32_ + 12), _30_)))) == 0) {
                break label$0;
            }
            _31_ = this._loadInt16u(((this._loadInt((_32_ + 8))) + 48));
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int sqlite3_column_decltype(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = columnName((this._loadInt((_32_ + 12))), _31_, 17, 1);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3_column_decltype16(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = columnName((this._loadInt((_32_ + 12))), _31_, 18, 1);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final double sqlite3_column_double(int _30_, int _31_)
    {
        int _32_ = 0;
        double _33_ = 0.0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeDouble(_32_, (sqlite3_value_double((columnMem((this._loadInt((_32_ + 12))), _31_)))));
        columnMallocFailure((this._loadInt((_32_ + 12))));
        _33_ = this._loadDouble(_32_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _33_;
    }

    @Override()
    public final int sqlite3_column_int(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), (sqlite3_value_int((columnMem((this._loadInt((_32_ + 12))), _31_)))));
        columnMallocFailure((this._loadInt((_32_ + 12))));
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final long sqlite3_column_int64(int _30_, int _31_)
    {
        int _32_ = 0;
        long _33_ = 0L;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeLong(_32_, (sqlite3_value_int64((columnMem((this._loadInt((_32_ + 12))), _31_)))));
        columnMallocFailure((this._loadInt((_32_ + 12))));
        _33_ = this._loadLong(_32_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _33_;
    }

    @Override()
    public final int sqlite3_column_name(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = columnName((this._loadInt((_32_ + 12))), _31_, 17, 0);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3_column_name16(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = columnName((this._loadInt((_32_ + 12))), _31_, 18, 0);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3_column_text(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), (sqlite3_value_text((columnMem((this._loadInt((_32_ + 12))), _31_)))));
        columnMallocFailure((this._loadInt((_32_ + 12))));
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3_column_text16(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), (sqlite3_value_text16((columnMem((this._loadInt((_32_ + 12))), _31_)))));
        columnMallocFailure((this._loadInt((_32_ + 12))));
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3_column_type(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), (sqlite3_value_type((columnMem((this._loadInt((_32_ + 12))), _31_)))));
        columnMallocFailure((this._loadInt((_32_ + 12))));
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3_column_value(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if (((this._loadInt16u(((this._storeInt((_32_ + 4), (columnMem((this._loadInt((_32_ + 12))), _31_)))) + 28))) & 2048) == 0) {
                break label$0;
            }
            this._storeInt16(((_31_ = this._loadInt((_32_ + 4))) + 28), ((this._loadInt16u((_31_ + 28))) & 63487));
            this._storeInt16((_31_ + 28), ((this._loadInt16u((_31_ + 28))) | 4096));
        }
        while (false);
        columnMallocFailure((this._loadInt((_32_ + 12))));
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3_commit_hook(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 12))) + 168))));
        this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 172), (this._loadInt((_33_ + 8))));
        this._storeInt((_32_ + 168), (this._loadInt((_33_ + 4))));
        return (this._loadInt(_33_));
    }

    @Override()
    public final int sqlite3_complete(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        _31_ = this._storeInt8((_32_ + 23), 0);
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
                                    if ((this._loadInt8u((this._loadInt((_32_ + 24))))) == 0) {
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
                                                                                            if (((_30_ = (this._loadInt8s((this._loadInt((_32_ + 24))))) + -9) & 4294967295L) > (87 & 4294967295L)) {
                                                                                                break label$20;
                                                                                            }
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
                                                                                                                    switch (_30_) {
                                                                                                                        case 0:
                                                                                                                        case 1:
                                                                                                                        case 3:
                                                                                                                        case 4:
                                                                                                                        case 23: {
                                                                                                                            break label$26;
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
                                                                                                                        case 24:
                                                                                                                        case 26:
                                                                                                                        case 27:
                                                                                                                        case 28:
                                                                                                                        case 29:
                                                                                                                        case 31:
                                                                                                                        case 32:
                                                                                                                        case 33:
                                                                                                                        case 34:
                                                                                                                        case 35:
                                                                                                                        case 37:
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
                                                                                                                        case 49:
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
                                                                                                                        case 79:
                                                                                                                        case 80:
                                                                                                                        case 81:
                                                                                                                        case 83:
                                                                                                                        case 84:
                                                                                                                        case 85:
                                                                                                                        case 86: {
                                                                                                                            break label$20;
                                                                                                                        }
                                                                                                                        case 25:
                                                                                                                        case 30:
                                                                                                                        case 87: {
                                                                                                                            break label$25;
                                                                                                                        }
                                                                                                                        case 36: {
                                                                                                                            break label$24;
                                                                                                                        }
                                                                                                                        case 38: {
                                                                                                                            break label$23;
                                                                                                                        }
                                                                                                                        case 50: {
                                                                                                                            break label$22;
                                                                                                                        }
                                                                                                                        case 82: {
                                                                                                                            break label$21;
                                                                                                                        }
                                                                                                                        default: {
                                                                                                                            break label$26;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                while (false);
                                                                                                                this._storeInt8((_32_ + 22), 1);
                                                                                                                break label$7;
                                                                                                            }
                                                                                                            while (false);
                                                                                                            this._storeInt((_32_ + 16), (this._loadInt8s((this._loadInt((_32_ + 24))))));
                                                                                                            this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                                                                                                            label$28:
                                                                                                            do {
                                                                                                                label$27:
                                                                                                                while (true) {
                                                                                                                    _30_ = 0;
                                                                                                                    label$29:
                                                                                                                    do {
                                                                                                                        if ((this._loadInt8s((this._loadInt((_32_ + 24))))) == 0) {
                                                                                                                            break label$29;
                                                                                                                        }
                                                                                                                        _30_ = ((this._loadInt8s((this._loadInt((_32_ + 24))))) != (this._loadInt((_32_ + 16)))) ? 1 : 0;
                                                                                                                    }
                                                                                                                    while (false);
                                                                                                                    if (_30_ == 0) {
                                                                                                                        break label$28;
                                                                                                                    }
                                                                                                                    this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                                                                                                                    continue label$27;
                                                                                                                }
                                                                                                            }
                                                                                                            while (false);
                                                                                                            if ((this._loadInt8s((this._loadInt((_32_ + 24))))) == 0) {
                                                                                                                break label$4;
                                                                                                            }
                                                                                                            this._storeInt8((_32_ + 22), 2);
                                                                                                            break label$7;
                                                                                                        }
                                                                                                        while (false);
                                                                                                        label$30:
                                                                                                        do {
                                                                                                            if ((this._loadInt8s(((this._loadInt((_32_ + 24))) + 1))) == 45) {
                                                                                                                break label$30;
                                                                                                            }
                                                                                                            this._storeInt8((_32_ + 22), 2);
                                                                                                            break label$7;
                                                                                                        }
                                                                                                        while (false);
                                                                                                        label$32:
                                                                                                        do {
                                                                                                            label$31:
                                                                                                            while (true) {
                                                                                                                _30_ = 0;
                                                                                                                label$33:
                                                                                                                do {
                                                                                                                    if ((this._loadInt8s((this._loadInt((_32_ + 24))))) == 0) {
                                                                                                                        break label$33;
                                                                                                                    }
                                                                                                                    _30_ = ((this._loadInt8s((this._loadInt((_32_ + 24))))) != 10) ? 1 : 0;
                                                                                                                }
                                                                                                                while (false);
                                                                                                                if (_30_ == 0) {
                                                                                                                    break label$32;
                                                                                                                }
                                                                                                                this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                                                                                                                continue label$31;
                                                                                                            }
                                                                                                        }
                                                                                                        while (false);
                                                                                                        if ((this._loadInt8s((this._loadInt((_32_ + 24))))) == 0) {
                                                                                                            break label$2;
                                                                                                        }
                                                                                                        this._storeInt8((_32_ + 22), 1);
                                                                                                        break label$7;
                                                                                                    }
                                                                                                    while (false);
                                                                                                    if ((this._loadInt8s(((this._loadInt((_32_ + 24))) + 1))) == 42) {
                                                                                                        break label$19;
                                                                                                    }
                                                                                                    this._storeInt8((_32_ + 22), 2);
                                                                                                    break label$7;
                                                                                                }
                                                                                                while (false);
                                                                                                this._storeInt8((_32_ + 22), _31_);
                                                                                                break label$7;
                                                                                            }
                                                                                            while (false);
                                                                                            this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                                                                                            label$35:
                                                                                            do {
                                                                                                label$34:
                                                                                                while (true) {
                                                                                                    _30_ = 0;
                                                                                                    label$36:
                                                                                                    do {
                                                                                                        if ((this._loadInt8s((this._loadInt((_32_ + 24))))) == 0) {
                                                                                                            break label$36;
                                                                                                        }
                                                                                                        _30_ = ((this._loadInt8s((this._loadInt((_32_ + 24))))) != 93) ? 1 : 0;
                                                                                                    }
                                                                                                    while (false);
                                                                                                    if (_30_ == 0) {
                                                                                                        break label$35;
                                                                                                    }
                                                                                                    this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                                                                                                    continue label$34;
                                                                                                }
                                                                                            }
                                                                                            while (false);
                                                                                            if ((this._loadInt8s((this._loadInt((_32_ + 24))))) == 0) {
                                                                                                break label$3;
                                                                                            }
                                                                                            this._storeInt8((_32_ + 22), 2);
                                                                                            break label$7;
                                                                                        }
                                                                                        while (false);
                                                                                        if (((this._loadInt8u(((this._loadInt8u((this._loadInt((_32_ + 24))))) + 21776))) & 70) == 0) {
                                                                                            break label$18;
                                                                                        }
                                                                                        _30_ = this._storeInt((_32_ + 12), 1);
                                                                                        label$38:
                                                                                        do {
                                                                                            label$37:
                                                                                            while (true) {
                                                                                                if (((this._loadInt8u(((this._loadInt8u(((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 12)))))) + 21776))) & 70) == 0) {
                                                                                                    break label$38;
                                                                                                }
                                                                                                this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + _30_));
                                                                                                continue label$37;
                                                                                            }
                                                                                        }
                                                                                        while (false);
                                                                                        if (((_30_ = (this._loadInt8s((this._loadInt((_32_ + 24))))) + -67) & 4294967295L) > (49 & 4294967295L)) {
                                                                                            break label$15;
                                                                                        }
                                                                                        label$39:
                                                                                        do {
                                                                                            switch (_30_) {
                                                                                                case 0:
                                                                                                case 32: {
                                                                                                    break label$39;
                                                                                                }
                                                                                                case 1:
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
                                                                                                case 33:
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
                                                                                                case 48: {
                                                                                                    break label$15;
                                                                                                }
                                                                                                case 2:
                                                                                                case 34: {
                                                                                                    break label$17;
                                                                                                }
                                                                                                case 17:
                                                                                                case 49: {
                                                                                                    break label$16;
                                                                                                }
                                                                                                default: {
                                                                                                    break label$39;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        while (false);
                                                                                        label$40:
                                                                                        do {
                                                                                            if ((this._loadInt((_32_ + 12))) != 6) {
                                                                                                break label$40;
                                                                                            }
                                                                                            if ((sqlite3_strnicmp((this._loadInt((_32_ + 24))), 60336, 6)) == 0) {
                                                                                                break label$14;
                                                                                            }
                                                                                        }
                                                                                        while (false);
                                                                                        this._storeInt8((_32_ + 22), 2);
                                                                                        break label$8;
                                                                                    }
                                                                                    while (false);
                                                                                    this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 2));
                                                                                    label$42:
                                                                                    do {
                                                                                        label$41:
                                                                                        while (true) {
                                                                                            _30_ = 0;
                                                                                            label$43:
                                                                                            do {
                                                                                                if ((this._loadInt8s((this._loadInt((_32_ + 24))))) == 0) {
                                                                                                    break label$43;
                                                                                                }
                                                                                                _30_ = 1;
                                                                                                if ((this._loadInt8s((this._loadInt((_32_ + 24))))) != 42) {
                                                                                                    break label$43;
                                                                                                }
                                                                                                _30_ = ((this._loadInt8s(((this._loadInt((_32_ + 24))) + 1))) != 47) ? 1 : 0;
                                                                                            }
                                                                                            while (false);
                                                                                            if (_30_ == 0) {
                                                                                                break label$42;
                                                                                            }
                                                                                            this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                                                                                            continue label$41;
                                                                                        }
                                                                                    }
                                                                                    while (false);
                                                                                    if ((this._loadInt8s((this._loadInt((_32_ + 24))))) == 0) {
                                                                                        break label$1;
                                                                                    }
                                                                                    this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                                                                                    this._storeInt8((_32_ + 22), 1);
                                                                                    break label$7;
                                                                                }
                                                                                while (false);
                                                                                this._storeInt8((_32_ + 22), 2);
                                                                                break label$7;
                                                                            }
                                                                            while (false);
                                                                            label$44:
                                                                            do {
                                                                                if ((this._loadInt((_32_ + 12))) != 3) {
                                                                                    break label$44;
                                                                                }
                                                                                if ((sqlite3_strnicmp((this._loadInt((_32_ + 24))), 60368, 3)) == 0) {
                                                                                    break label$13;
                                                                                }
                                                                            }
                                                                            while (false);
                                                                            label$45:
                                                                            do {
                                                                                if ((this._loadInt((_32_ + 12))) != 7) {
                                                                                    break label$45;
                                                                                }
                                                                                if ((sqlite3_strnicmp((this._loadInt((_32_ + 24))), 60384, 7)) == 0) {
                                                                                    break label$11;
                                                                                }
                                                                            }
                                                                            while (false);
                                                                            this._storeInt8((_32_ + 22), 2);
                                                                            break label$8;
                                                                        }
                                                                        while (false);
                                                                        label$46:
                                                                        do {
                                                                            if ((this._loadInt((_32_ + 12))) != 7) {
                                                                                break label$46;
                                                                            }
                                                                            if ((sqlite3_strnicmp((this._loadInt((_32_ + 24))), 42464, 7)) == 0) {
                                                                                break label$12;
                                                                            }
                                                                        }
                                                                        while (false);
                                                                        label$47:
                                                                        do {
                                                                            if ((this._loadInt((_32_ + 12))) != 4) {
                                                                                break label$47;
                                                                            }
                                                                            if ((sqlite3_strnicmp((this._loadInt((_32_ + 24))), 31104, 4)) == 0) {
                                                                                break label$10;
                                                                            }
                                                                        }
                                                                        while (false);
                                                                        label$48:
                                                                        do {
                                                                            if ((this._loadInt((_32_ + 12))) != 9) {
                                                                                break label$48;
                                                                            }
                                                                            if ((sqlite3_strnicmp((this._loadInt((_32_ + 24))), 60352, 9)) == 0) {
                                                                                break label$9;
                                                                            }
                                                                        }
                                                                        while (false);
                                                                        this._storeInt8((_32_ + 22), 2);
                                                                        break label$8;
                                                                    }
                                                                    while (false);
                                                                    this._storeInt8((_32_ + 22), 2);
                                                                    break label$8;
                                                                }
                                                                while (false);
                                                                this._storeInt8((_32_ + 22), 4);
                                                                break label$8;
                                                            }
                                                            while (false);
                                                            this._storeInt8((_32_ + 22), 7);
                                                            break label$8;
                                                        }
                                                        while (false);
                                                        this._storeInt8((_32_ + 22), 6);
                                                        break label$8;
                                                    }
                                                    while (false);
                                                    this._storeInt8((_32_ + 22), 3);
                                                    break label$8;
                                                }
                                                while (false);
                                                this._storeInt8((_32_ + 22), 5);
                                                break label$8;
                                            }
                                            while (false);
                                            this._storeInt8((_32_ + 22), 5);
                                        }
                                        while (false);
                                        this._storeInt((_32_ + 24), (((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 12)))) + -1));
                                    }
                                    while (false);
                                    this._storeInt8((_32_ + 23), (this._loadInt8u(((((this._loadInt8u((_32_ + 23))) << 3) + (this._loadInt8u((_32_ + 22)))) + 60400))));
                                    this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                                    continue label$5;
                                }
                            }
                            while (false);
                            this._storeInt((_32_ + 28), (((this._loadInt8u((_32_ + 23))) == 1) ? 1 : 0));
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_32_ + 28), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_32_ + 28), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 28), (((this._loadInt8u((_32_ + 23))) == 1) ? 1 : 0));
                break label$0;
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
    public final int sqlite3_complete16(int _30_)
    {
        int _31_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_31_ + 12), 7);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_31_ + 12), (sqlite3_initialize()))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 28), (this._loadInt((_31_ + 12))));
                break label$0;
            }
            while (false);
            _temp$0 = 2;
            _temp$1 = 3;
            _temp$2 = ((this._loadInt8s((0 + 29180))) != 0) ? _temp$0 : _temp$1;
            sqlite3ValueSetStr((this._storeInt((_31_ + 20), (sqlite3ValueNew(0)))), -1, (this._loadInt((_31_ + 24))), _temp$2, 0);
            label$2:
            do {
                label$3:
                do {
                    if ((this._storeInt((_31_ + 16), (sqlite3ValueText((this._loadInt((_31_ + 20))), 1)))) == 0) {
                        break label$3;
                    }
                    this._storeInt((_31_ + 12), (sqlite3_complete((this._loadInt((_31_ + 16))))));
                    break label$2;
                }
                while (false);
                this._storeInt((_31_ + 12), 7);
            }
            while (false);
            sqlite3ValueFree((this._loadInt((_31_ + 20))));
            this._storeInt((_31_ + 28), (sqlite3ApiExit(0, (this._loadInt((_31_ + 12))))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 28));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final int sqlite3_create_collation(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        _34_ = this._storeInt((_35_ + 8), (createCollation((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 24))), (this._loadInt8u((_35_ + 20))), 0, (this._loadInt((_35_ + 16))), _34_, 0)));
        _34_ = this._storeInt((_35_ + 8), (sqlite3ApiExit((this._loadInt((_35_ + 28))), _34_)));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3_create_collation16(int _30_, int _31_, int _32_, int _33_, int _34_)
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
        _34_ = this._storeInt((_35_ + 8), 0);
        label$0:
        do {
            _temp$0 = 2;
            _temp$1 = 3;
            _temp$2 = ((this._loadInt8s((_34_ + 29180))) != 0) ? _temp$0 : _temp$1;
            _temp$2 = sqlite3Utf16to8((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 24))), -1, _temp$2);
            _temp$2 = this._storeInt((_35_ + 4), _temp$2);
            _temp$2 = (_temp$2 == 0) ? 1 : 0;
            if (_temp$2 != 0) {
                break label$0;
            }
            this._storeInt((_35_ + 8), (createCollation((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 4))), (this._loadInt8u((_35_ + 20))), _34_, (this._loadInt((_35_ + 16))), (this._loadInt((_35_ + 12))), _34_)));
            sqlite3DbFree((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 4))));
        }
        while (false);
        _34_ = this._storeInt((_35_ + 8), (sqlite3ApiExit((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 8))))));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3_create_function(
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
        this._storeInt(((_38_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_38_ + 24), _31_);
        this._storeInt((_38_ + 20), _32_);
        this._storeInt((_38_ + 16), _33_);
        this._storeInt((_38_ + 12), _34_);
        this._storeInt((_38_ + 8), _35_);
        this._storeInt((_38_ + 4), _36_);
        this._storeInt(_38_, _37_);
        _37_ = sqlite3_create_function_v2((this._loadInt((_38_ + 28))), (this._loadInt((_38_ + 24))), (this._loadInt((_38_ + 20))), (this._loadInt((_38_ + 16))), (this._loadInt((_38_ + 12))), (this._loadInt((_38_ + 8))), (this._loadInt((_38_ + 4))), _37_, 0);
        this._storeInt((0 + 4), (_38_ + 32));
        return _37_;
    }

    @Override()
    public final int sqlite3_create_function16(
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
        this._storeInt(((_38_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_38_ + 40), _31_);
        this._storeInt((_38_ + 36), _32_);
        this._storeInt((_38_ + 32), _33_);
        this._storeInt((_38_ + 28), _34_);
        this._storeInt((_38_ + 24), _35_);
        this._storeInt((_38_ + 20), _36_);
        this._storeInt((_38_ + 16), _37_);
        _temp$0 = 2;
        _temp$1 = 3;
        _temp$2 = ((this._loadInt8s((0 + 29180))) != 0) ? _temp$0 : _temp$1;
        _temp$2 = sqlite3Utf16to8((this._loadInt((_38_ + 44))), (this._loadInt((_38_ + 40))), -1, _temp$2);
        _temp$2 = this._storeInt((_38_ + 8), _temp$2);
        _37_ = _temp$2;
        this._storeInt((_38_ + 12), (sqlite3CreateFunc((this._loadInt((_38_ + 44))), _37_, (this._loadInt((_38_ + 36))), (this._loadInt((_38_ + 32))), (this._loadInt((_38_ + 28))), (this._loadInt((_38_ + 24))), (this._loadInt((_38_ + 20))), (this._loadInt((_38_ + 16))), 0)));
        sqlite3DbFree((this._loadInt((_38_ + 44))), (this._loadInt((_38_ + 8))));
        _37_ = this._storeInt((_38_ + 12), (sqlite3ApiExit((this._loadInt((_38_ + 44))), (this._loadInt((_38_ + 12))))));
        this._storeInt((0 + 4), (_38_ + 48));
        return _37_;
    }

    @Override()
    public final int sqlite3_create_module(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        _33_ = createModule((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))), _33_, 0);
        this._storeInt((0 + 4), (_34_ + 16));
        return _33_;
    }

    @Override()
    public final int sqlite3_data_count(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 4), (this._storeInt((_31_ + 8), _30_)))) == 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_31_ + 4))) + 20))) == 0) {
                break label$0;
            }
            this._storeInt((_31_ + 12), (this._loadInt16u(((this._loadInt((_31_ + 4))) + 48))));
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        this._storeInt((_31_ + 12), 0);
        return (this._loadInt((_31_ + 12)));
    }

    @Override()
    public final int sqlite3_db_handle(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) == 0) {
                break label$0;
            }
            _31_ = this._loadInt((this._loadInt((_32_ + 12))));
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int sqlite3_declare_vtab(int _30_, int _31_)
    {
        int _32_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        _31_ = this._storeInt((_32_ + 4), (this._storeInt((_32_ + 12), 0)));
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
                                if ((this._loadInt(((this._loadInt((_32_ + 24))) + 304))) == 0) {
                                    break label$5;
                                }
                                if ((this._storeInt((_32_ + 8), (this._loadInt((this._loadInt(((this._loadInt((_32_ + 24))) + 304))))))) == 0) {
                                    break label$5;
                                }
                                if ((this._storeInt((_32_ + 16), (sqlite3DbMallocZero((this._loadInt((_32_ + 24))), 560)))) == 0) {
                                    break label$2;
                                }
                                this._storeInt((_31_ = this._loadInt((_32_ + 16))), (this._loadInt((_32_ + 24))));
                                _31_ = this._storeInt8((_31_ + 528), 1);
                                this._storeLong(((this._loadInt((_32_ + 16))) + 448), 4607182418800017408L);
                                if ((sqlite3RunParser((this._loadInt((_32_ + 16))), (this._loadInt((_32_ + 20))), (_32_ + 4))) != 0) {
                                    break label$4;
                                }
                                if ((this._loadInt(((this._loadInt((_32_ + 16))) + 508))) == 0) {
                                    break label$4;
                                }
                                if ((this._loadInt8u(((this._loadInt((_32_ + 24))) + 30))) != 0) {
                                    break label$4;
                                }
                                if ((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 16))) + 508))) + 28))) != 0) {
                                    break label$4;
                                }
                                if (((this._loadInt8u(((this._loadInt(((this._loadInt((_32_ + 16))) + 508))) + 34))) & 16) != 0) {
                                    break label$4;
                                }
                                label$6:
                                do {
                                    if ((this._loadInt(((this._loadInt((_32_ + 8))) + 12))) != 0) {
                                        break label$6;
                                    }
                                    this._storeInt(((_31_ = this._loadInt((_32_ + 8))) + 12), (this._loadInt(((this._loadInt(((_30_ = this._loadInt((_32_ + 16))) + 508))) + 12))));
                                    this._storeInt((_31_ + 8), (this._loadInt(((this._loadInt((_30_ + 508))) + 8))));
                                    _31_ = this._storeInt(((this._loadInt(((this._loadInt((_32_ + 16))) + 508))) + 8), 0);
                                    this._storeInt(((this._loadInt(((this._loadInt((_32_ + 16))) + 508))) + 12), _31_);
                                }
                                while (false);
                                this._storeInt((this._loadInt(((this._loadInt((_32_ + 24))) + 304))), 0);
                                break label$3;
                            }
                            while (false);
                            sqlite3Error((this._loadInt((_32_ + 24))), 21, _31_, _31_);
                            this._storeInt((_32_ + 28), (sqlite3MisuseError(97932)));
                            break label$0;
                        }
                        while (false);
                        _temp$0 = 22192;
                        _temp$1 = 0;
                        _temp$2 = ((this._storeInt(_32_, (this._loadInt((_32_ + 4))))) != 0) ? _temp$0 : _temp$1;
                        sqlite3Error((this._loadInt((_32_ + 24))), _31_, _temp$2, _32_);
                        sqlite3DbFree((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 4))));
                        this._storeInt((_32_ + 12), _31_);
                    }
                    while (false);
                    this._storeInt8(((_31_ = this._loadInt((_32_ + 16))) + 528), 0);
                    label$7:
                    do {
                        if ((this._loadInt((_31_ + 12))) == 0) {
                            break label$7;
                        }
                        sqlite3VdbeFinalize((this._loadInt(((this._loadInt((_32_ + 16))) + 12))));
                    }
                    while (false);
                    sqlite3DeleteTable((this._loadInt((_32_ + 24))), (this._loadInt(((this._loadInt((_32_ + 16))) + 508))));
                    sqlite3DbFree((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 16))));
                    break label$1;
                }
                while (false);
                this._storeInt((_32_ + 12), 7);
            }
            while (false);
            this._storeInt((_32_ + 28), (this._storeInt((_32_ + 12), (sqlite3ApiExit((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 12))))))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int sqlite3_enable_shared_cache(int _30_)
    {
        this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), (this._storeInt((0 + 20424), _30_)));
        return 0;
    }

    @Override()
    public final int sqlite3_errcode(int _30_)
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
                this._storeInt((_31_ + 12), (sqlite3MisuseError(109514)));
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 12), ((this._loadInt(((_30_ = this._loadInt((_31_ + 8))) + 20))) & (this._loadInt((_30_ + 24)))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3_errmsg(int _30_)
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
                        label$4:
                        do {
                            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)) == 0) {
                                break label$4;
                            }
                            if ((sqlite3SafetyCheckSickOrOk((this._loadInt((_31_ + 8))))) == 0) {
                                break label$3;
                            }
                            if ((this._loadInt8u(((this._loadInt((_31_ + 8))) + 30))) == 0) {
                                break label$2;
                            }
                            this._storeInt((_31_ + 4), (sqlite3ErrStr(7)));
                            break label$1;
                        }
                        while (false);
                        this._storeInt((_31_ + 12), (sqlite3ErrStr(7)));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_31_ + 12), (sqlite3ErrStr((sqlite3MisuseError(109445)))));
                    break label$0;
                }
                while (false);
                if ((this._storeInt((_31_ + 4), (sqlite3_value_text((this._loadInt(((this._loadInt((_31_ + 8))) + 212))))))) != 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 4), (sqlite3ErrStr((this._loadInt(((this._loadInt((_31_ + 8))) + 20))))));
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
    public final int sqlite3_errmsg16(int _30_)
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
                        label$4:
                        do {
                            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)) == 0) {
                                break label$4;
                            }
                            if ((sqlite3SafetyCheckSickOrOk((this._loadInt((_31_ + 8))))) == 0) {
                                break label$3;
                            }
                            if ((this._loadInt8u(((this._loadInt((_31_ + 8))) + 30))) == 0) {
                                break label$2;
                            }
                            this._storeInt((_31_ + 4), 60224);
                            break label$1;
                        }
                        while (false);
                        this._storeInt((_31_ + 12), 60224);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_31_ + 12), 60256);
                    break label$0;
                }
                while (false);
                label$5:
                do {
                    if ((this._storeInt((_31_ + 4), (sqlite3_value_text16((this._loadInt(((this._loadInt((_31_ + 8))) + 212))))))) != 0) {
                        break label$5;
                    }
                    sqlite3ValueSetStr((this._loadInt(((_30_ = this._loadInt((_31_ + 8))) + 212))), -1, (sqlite3ErrStr((this._loadInt((_30_ + 20))))), 1, 0);
                    this._storeInt((_31_ + 4), (sqlite3_value_text16((this._loadInt(((this._loadInt((_31_ + 8))) + 212))))));
                }
                while (false);
                this._storeInt8(((this._loadInt((_31_ + 8))) + 30), 0);
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
    public final int sqlite3_exec(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_35_ + 52), _31_);
        this._storeInt((_35_ + 48), _32_);
        this._storeInt((_35_ + 44), _33_);
        this._storeInt((_35_ + 40), _34_);
        this._storeInt((_35_ + 20), (this._storeInt((_35_ + 24), (this._storeInt((_35_ + 28), (this._storeInt((_35_ + 36), 0)))))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((sqlite3SafetyCheckOk((this._loadInt((_35_ + 56))))) == 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._loadInt((_35_ + 52))) != 0) {
                            break label$3;
                        }
                        this._storeInt((_35_ + 52), 21392);
                    }
                    while (false);
                    sqlite3Error((this._loadInt((_35_ + 56))), 0, 0, 0);
                    label$4:
                    do {
                        label$6:
                        do {
                            label$5:
                            while (true) {
                                label$7:
                                do {
                                    label$8:
                                    do {
                                        if ((this._loadInt((_35_ + 36))) == 0) {
                                            break label$8;
                                        }
                                        _34_ = 0;
                                        if ((this._loadInt((_35_ + 36))) != 17) {
                                            break label$7;
                                        }
                                        if ((this._storeInt((_35_ + 20), ((this._loadInt((_35_ + 20))) + 1))) > 1) {
                                            break label$7;
                                        }
                                    }
                                    while (false);
                                    _34_ = ((this._loadInt8s((this._loadInt((_35_ + 52))))) != 0) ? 1 : 0;
                                }
                                while (false);
                                if (_34_ == 0) {
                                    break label$1;
                                }
                                _34_ = this._storeInt((_35_ + 28), (this._storeInt((_35_ + 8), 0)));
                                if ((this._storeInt((_35_ + 36), (sqlite3_prepare((this._loadInt((_35_ + 56))), (this._loadInt((_35_ + 52))), -1, (_35_ + 28), (_35_ + 32))))) != 0) {
                                    continue label$5;
                                }
                                label$9:
                                do {
                                    if ((this._loadInt((_35_ + 28))) != 0) {
                                        break label$9;
                                    }
                                    this._storeInt((_35_ + 52), (this._loadInt((_35_ + 32))));
                                    continue label$5;
                                }
                                while (false);
                                _32_ = this._storeInt((_35_ + 16), _34_);
                                this._storeInt((_35_ + 12), (sqlite3_column_count((this._loadInt((_35_ + 28))))));
                                label$10$end:
                                do {
                                    label$10:
                                    while (true) {
                                        this._storeInt((_35_ + 36), (sqlite3_step((this._loadInt((_35_ + 28))))));
                                        label$12:
                                        do {
                                            if ((this._loadInt((_35_ + 48))) == 0) {
                                                break label$12;
                                            }
                                            label$13:
                                            do {
                                                if ((this._loadInt((_35_ + 36))) == 100) {
                                                    break label$13;
                                                }
                                                if ((this._loadInt((_35_ + 36))) != 101) {
                                                    break label$12;
                                                }
                                                if ((this._loadInt((_35_ + 16))) != 0) {
                                                    break label$12;
                                                }
                                                if (((this._loadInt8u(((this._loadInt((_35_ + 56))) + 13))) & 32) == 0) {
                                                    break label$12;
                                                }
                                            }
                                            while (false);
                                            label$14:
                                            do {
                                                if ((this._loadInt((_35_ + 16))) != 0) {
                                                    break label$14;
                                                }
                                                if ((this._storeInt((_35_ + 24), (sqlite3DbMallocZero((this._loadInt((_35_ + 56))), (((this._loadInt((_35_ + 12))) << 3) | 1))))) == 0) {
                                                    break label$1;
                                                }
                                                this._storeInt((_35_ + 4), _32_);
                                                label$16:
                                                do {
                                                    label$15:
                                                    while (true) {
                                                        if ((this._loadInt((_35_ + 4))) >= (this._loadInt((_35_ + 12)))) {
                                                            break label$16;
                                                        }
                                                        _34_ = sqlite3_column_name((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 4))));
                                                        this._storeInt(((this._loadInt((_35_ + 24))) + ((_33_ = this._loadInt((_35_ + 4))) << 2)), _34_);
                                                        this._storeInt((_35_ + 4), (_33_ + 1));
                                                        continue label$15;
                                                    }
                                                }
                                                while (false);
                                                this._storeInt((_35_ + 16), 1);
                                            }
                                            while (false);
                                            label$17:
                                            do {
                                                if ((this._loadInt((_35_ + 36))) != 100) {
                                                    break label$17;
                                                }
                                                this._storeInt((_35_ + 8), ((this._loadInt((_35_ + 24))) + ((this._loadInt((_35_ + 12))) << 2)));
                                                this._storeInt((_35_ + 4), _32_);
                                                label$19:
                                                do {
                                                    label$18:
                                                    while (true) {
                                                        if ((this._loadInt((_35_ + 4))) >= (this._loadInt((_35_ + 12)))) {
                                                            break label$19;
                                                        }
                                                        _34_ = sqlite3_column_text((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 4))));
                                                        label$20:
                                                        do {
                                                            if ((this._storeInt(((this._loadInt((_35_ + 8))) + ((this._loadInt((_35_ + 4))) << 2)), _34_)) != 0) {
                                                                break label$20;
                                                            }
                                                            if ((sqlite3_column_type((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 4))))) != 5) {
                                                                break label$6;
                                                            }
                                                        }
                                                        while (false);
                                                        this._storeInt((_35_ + 4), ((this._loadInt((_35_ + 4))) + 1));
                                                        continue label$18;
                                                    }
                                                }
                                                while (false);
                                            }
                                            while (false);
                                            if ((this._iiiiiTable[this._tableIndices[this._loadInt((_35_ + 48))]].invoke((this._loadInt((_35_ + 44))), (this._loadInt((_35_ + 12))), (this._loadInt((_35_ + 8))), (this._loadInt((_35_ + 24))))) != 0) {
                                                break label$4;
                                            }
                                        }
                                        while (false);
                                        if ((this._loadInt((_35_ + 36))) == 100) {
                                            continue label$10;
                                        }
                                        break label$10$end;
                                    }
                                }
                                while (false);
                                this._storeInt((_35_ + 36), (sqlite3VdbeFinalize((this._loadInt((_35_ + 28))))));
                                _34_ = this._storeInt((_35_ + 28), _32_);
                                label$21:
                                do {
                                    if ((this._loadInt((_35_ + 36))) == 17) {
                                        break label$21;
                                    }
                                    this._storeInt((_35_ + 20), _34_);
                                    this._storeInt((_35_ + 52), (this._loadInt((_35_ + 32))));
                                    label$23:
                                    do {
                                        label$22:
                                        while (true) {
                                            if (((this._loadInt8u(((this._loadInt8u((this._loadInt((_35_ + 52))))) + 21776))) & 1) == 0) {
                                                break label$23;
                                            }
                                            this._storeInt((_35_ + 52), ((this._loadInt((_35_ + 52))) + 1));
                                            continue label$22;
                                        }
                                    }
                                    while (false);
                                }
                                while (false);
                                sqlite3DbFree((this._loadInt((_35_ + 56))), (this._loadInt((_35_ + 24))));
                                this._storeInt((_35_ + 24), _34_);
                                continue label$5;
                            }
                        }
                        while (false);
                        this._storeInt8(((this._loadInt((_35_ + 56))) + 30), 1);
                        break label$1;
                    }
                    while (false);
                    _33_ = this._storeInt((_35_ + 36), 4);
                    sqlite3VdbeFinalize((this._loadInt((_35_ + 28))));
                    _34_ = this._storeInt((_35_ + 28), 0);
                    sqlite3Error((this._loadInt((_35_ + 56))), _33_, _34_, _34_);
                    break label$1;
                }
                while (false);
                this._storeInt((_35_ + 60), (sqlite3MisuseError(86901)));
                break label$0;
            }
            while (false);
            label$24:
            do {
                if ((this._loadInt((_35_ + 28))) == 0) {
                    break label$24;
                }
                sqlite3VdbeFinalize((this._loadInt((_35_ + 28))));
            }
            while (false);
            sqlite3DbFree((this._loadInt((_35_ + 56))), (this._loadInt((_35_ + 24))));
            label$25:
            do {
                label$26:
                do {
                    label$27:
                    do {
                        if ((this._storeInt((_35_ + 36), (sqlite3ApiExit((this._loadInt((_35_ + 56))), (this._loadInt((_35_ + 36))))))) == 0) {
                            break label$27;
                        }
                        if ((this._loadInt((_35_ + 36))) != (sqlite3_errcode((this._loadInt((_35_ + 56)))))) {
                            break label$27;
                        }
                        if ((this._loadInt((_35_ + 40))) == 0) {
                            break label$27;
                        }
                        _34_ = sqlite3Malloc((this._storeInt(_35_, ((sqlite3Strlen30((sqlite3_errmsg((this._loadInt((_35_ + 56))))))) + 1))));
                        if ((this._storeInt((this._loadInt((_35_ + 40))), _34_)) == 0) {
                            break label$26;
                        }
                        memcpy((this._loadInt((this._loadInt((_35_ + 40))))), (sqlite3_errmsg((this._loadInt((_35_ + 56))))), (this._loadInt(_35_)));
                        break label$25;
                    }
                    while (false);
                    if ((this._loadInt((_35_ + 40))) == 0) {
                        break label$25;
                    }
                    this._storeInt((this._loadInt((_35_ + 40))), 0);
                    break label$25;
                }
                while (false);
                _34_ = this._storeInt((_35_ + 36), 7);
                sqlite3Error((this._loadInt((_35_ + 56))), _34_, 0, 0);
            }
            while (false);
            this._storeInt((_35_ + 60), (this._loadInt((_35_ + 36))));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 60));
        this._storeInt((0 + 4), (_35_ + 64));
        return _34_;
    }

    @Override()
    public final int sqlite3_expired(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 1;
        label$0:
        do {
            if ((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeInt((_32_ + 12), _30_)))) == 0) {
                break label$0;
            }
            _31_ = ((this._loadInt8u(((this._loadInt((_32_ + 8))) + 99))) != 0) ? 1 : 0;
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int sqlite3_finalize(int _30_)
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
                        if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_)) == 0) {
                            break label$3;
                        }
                        this._storeInt((_31_ + 12), (this._loadInt((this._storeInt((_31_ + 16), (this._loadInt((_31_ + 24))))))));
                        if ((vdbeSafety((this._loadInt((_31_ + 16))))) == 0) {
                            break label$2;
                        }
                        this._storeInt((_31_ + 28), (sqlite3MisuseError(60867)));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_31_ + 20), 0);
                    break label$1;
                }
                while (false);
                _30_ = this._storeInt((_31_ + 20), (sqlite3VdbeFinalize((this._loadInt((_31_ + 16))))));
                this._storeInt((_31_ + 20), (sqlite3ApiExit((this._loadInt((_31_ + 12))), _30_)));
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
    public final void sqlite3_free_table(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) == 0) {
                break label$0;
            }
            this._storeInt((_31_ + 4), (this._loadInt((this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 12))) + -4))))));
            _30_ = this._storeInt((_31_ + 8), 1);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_31_ + 8))) >= (this._loadInt((_31_ + 4)))) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._loadInt(((this._loadInt((_31_ + 12))) + ((this._loadInt((_31_ + 8))) << 2)))) == 0) {
                            break label$3;
                        }
                        sqlite3_free((this._loadInt(((this._loadInt((_31_ + 12))) + ((this._loadInt((_31_ + 8))) << 2)))));
                    }
                    while (false);
                    this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) + _30_));
                    continue label$1;
                }
            }
            while (false);
            sqlite3_free((this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int sqlite3_get_autocommit(int _30_)
    {
        return (this._loadInt8u(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 28)));
    }

    @Override()
    public final int sqlite3_get_auxdata(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            if ((this._storeInt(_32_, (this._loadInt(((this._loadInt((_32_ + 8))) + 4))))) == 0) {
                break label$0;
            }
            if ((this._loadInt((_32_ + 4))) >= (this._loadInt(((this._loadInt(_32_)) + 4)))) {
                break label$0;
            }
            if ((this._loadInt((_32_ + 4))) <= -1) {
                break label$0;
            }
            this._storeInt((_32_ + 12), (this._loadInt((((this._loadInt(_32_)) + ((this._loadInt((_32_ + 4))) << 3)) + 8))));
            return (this._loadInt((_32_ + 12)));
        }
        while (false);
        this._storeInt((_32_ + 12), 0);
        return (this._loadInt((_32_ + 12)));
    }

    @Override()
    public final int sqlite3_get_table(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_)
    {
        int _36_ = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 72), _30_);
        this._storeInt((_36_ + 68), _31_);
        this._storeInt((_36_ + 64), _32_);
        this._storeInt((_36_ + 60), _33_);
        this._storeInt((_36_ + 56), _34_);
        this._storeInt((_36_ + 52), _35_);
        _35_ = this._storeInt((this._loadInt((_36_ + 64))), 0);
        label$0:
        do {
            if ((this._loadInt((_36_ + 56))) == 0) {
                break label$0;
            }
            this._storeInt((this._loadInt((_36_ + 56))), _35_);
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_36_ + 60))) == 0) {
                break label$1;
            }
            this._storeInt((this._loadInt((_36_ + 60))), 0);
        }
        while (false);
        label$2:
        do {
            if ((this._loadInt((_36_ + 52))) == 0) {
                break label$2;
            }
            this._storeInt((this._loadInt((_36_ + 52))), 0);
        }
        while (false);
        this._storeLong((_36_ + 28), 0L);
        this._storeLong((_36_ + 20), 85899345920L);
        this._storeLong((_36_ + 36), 1L);
        label$3:
        do {
            label$4:
            do {
                label$5:
                do {
                    if ((this._storeInt((_36_ + 16), (sqlite3_malloc(80)))) == 0) {
                        break label$5;
                    }
                    this._storeInt((this._loadInt((_36_ + 16))), 0);
                    this._storeInt((_36_ + 48), (sqlite3_exec((this._loadInt((_36_ + 72))), (this._loadInt((_36_ + 68))), 19, (_36_ + 16), (this._loadInt((_36_ + 52))))));
                    this._storeInt((this._loadInt((_36_ + 16))), (this._loadInt((_36_ + 36))));
                    if ((this._loadInt8u((_36_ + 48))) != 4) {
                        break label$4;
                    }
                    sqlite3_free_table(((this._loadInt((_36_ + 16))) + 4));
                    label$6:
                    do {
                        if ((this._loadInt((_36_ + 20))) == 0) {
                            break label$6;
                        }
                        label$7:
                        do {
                            if ((this._loadInt((_36_ + 52))) == 0) {
                                break label$7;
                            }
                            sqlite3_free((this._loadInt((this._loadInt((_36_ + 52))))));
                            this._storeInt(_36_, (this._loadInt((_36_ + 20))));
                            _35_ = sqlite3_mprintf(22192, _36_);
                            this._storeInt((this._loadInt((_36_ + 52))), _35_);
                        }
                        while (false);
                        sqlite3_free((this._loadInt((_36_ + 20))));
                    }
                    while (false);
                    this._storeInt(((this._loadInt((_36_ + 72))) + 20), (this._loadInt((_36_ + 40))));
                    this._storeInt((_36_ + 76), (this._loadInt((_36_ + 40))));
                    break label$3;
                }
                while (false);
                this._storeInt((_36_ + 76), (this._storeInt(((this._loadInt((_36_ + 72))) + 20), 7)));
                break label$3;
            }
            while (false);
            sqlite3_free((this._loadInt((_36_ + 20))));
            label$8:
            do {
                if ((this._loadInt((_36_ + 48))) == 0) {
                    break label$8;
                }
                sqlite3_free_table(((this._loadInt((_36_ + 16))) + 4));
                this._storeInt((_36_ + 76), (this._loadInt((_36_ + 48))));
                break label$3;
            }
            while (false);
            label$9:
            do {
                label$10:
                do {
                    if ((this._loadInt((_36_ + 24))) <= (this._loadInt((_36_ + 36)))) {
                        break label$10;
                    }
                    if ((this._storeInt((_36_ + 12), (sqlite3_realloc((this._loadInt((_36_ + 16))), ((this._loadInt((_36_ + 36))) << 2))))) == 0) {
                        break label$9;
                    }
                    this._storeInt((_36_ + 16), (this._loadInt((_36_ + 12))));
                }
                while (false);
                this._storeInt((this._loadInt((_36_ + 64))), ((this._loadInt((_36_ + 16))) + 4));
                label$11:
                do {
                    if ((this._loadInt((_36_ + 56))) == 0) {
                        break label$11;
                    }
                    this._storeInt((this._loadInt((_36_ + 56))), (this._loadInt((_36_ + 32))));
                }
                while (false);
                label$12:
                do {
                    if ((this._loadInt((_36_ + 60))) == 0) {
                        break label$12;
                    }
                    this._storeInt((this._loadInt((_36_ + 60))), (this._loadInt((_36_ + 28))));
                }
                while (false);
                this._storeInt((_36_ + 76), (this._loadInt((_36_ + 48))));
                break label$3;
            }
            while (false);
            sqlite3_free_table(((this._loadInt((_36_ + 16))) + 4));
            this._storeInt((_36_ + 76), (this._storeInt(((this._loadInt((_36_ + 72))) + 20), 7)));
        }
        while (false);
        _35_ = this._loadInt((_36_ + 76));
        this._storeInt((0 + 4), (_36_ + 80));
        return _35_;
    }

    @Override()
    public final void sqlite3_interrupt(int _30_)
    {
        int _31_ = 0;
        _31_ = this._loadInt((0 + 4));
        this._storeInt((_30_ + 224), 1);
        this._storeInt(((_31_ - 16) + 12), _30_);
        return;
    }

    @Override()
    public final long sqlite3_last_insert_rowid(int _30_)
    {
        return (this._loadLong(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 48)));
    }

    @Override()
    public final int sqlite3_libversion()
    {
        return 19776;
    }

    @Override()
    public final int sqlite3_libversion_number()
    {
        return 3007007;
    }

    @Override()
    public final int sqlite3_open(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = openDatabase((this._loadInt((_32_ + 12))), _31_, 6, 0);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3_open16(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        int _temp$3 = 0;
        int _temp$4 = 0;
        int _temp$5 = 0;
        _33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32));
        _32_ = this._storeInt(_31_, 0);
        this._storeInt((_33_ + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_33_ + 8), (sqlite3_initialize()))) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 28), (this._loadInt((_33_ + 8))));
                break label$0;
            }
            while (false);
            _temp$0 = 2;
            _temp$1 = 3;
            _temp$2 = ((this._loadInt8s((_32_ + 29180))) != 0) ? _temp$0 : _temp$1;
            sqlite3ValueSetStr((this._storeInt((_33_ + 12), (sqlite3ValueNew(_32_)))), -1, (this._loadInt((_33_ + 24))), _temp$2, _32_);
            label$2:
            do {
                label$3:
                do {
                    if ((this._storeInt((_33_ + 16), (sqlite3ValueText((this._loadInt((_33_ + 12))), 1)))) == 0) {
                        break label$3;
                    }
                    if ((this._storeInt((_33_ + 8), (openDatabase((this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 20))), 6, 0)))) != 0) {
                        break label$2;
                    }
                    if (((this._loadInt16u(((this._loadInt(((this._loadInt(((this._loadInt((this._loadInt((_33_ + 20))))) + 8))) + 12))) + 78))) & 1) != 0) {
                        break label$2;
                    }
                    _temp$3 = 2;
                    _temp$4 = 3;
                    _temp$5 = ((this._loadInt8s((0 + 29180))) != 0) ? _temp$3 : _temp$4;
                    this._storeInt8(((this._loadInt(((this._loadInt(((this._loadInt((this._loadInt((_33_ + 20))))) + 8))) + 12))) + 77), _temp$5);
                    break label$2;
                }
                while (false);
                this._storeInt((_33_ + 8), 7);
            }
            while (false);
            sqlite3ValueFree((this._loadInt((_33_ + 12))));
            this._storeInt((_33_ + 28), (sqlite3ApiExit(0, (this._loadInt((_33_ + 8))))));
        }
        while (false);
        _31_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _31_;
    }

    @Override()
    public final int sqlite3_prepare(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        _34_ = this._storeInt((_35_ + 8), (sqlite3LockAndPrepare((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), 0, 0, (this._loadInt((_35_ + 16))), _34_)));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3_prepare16(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        _34_ = this._storeInt((_35_ + 8), (sqlite3Prepare16((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), 0, (this._loadInt((_35_ + 16))), _34_)));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3_profile(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 12))) + 164))));
        this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 160), (this._loadInt((_33_ + 8))));
        this._storeInt((_32_ + 164), (this._loadInt((_33_ + 4))));
        return (this._loadInt(_33_));
    }

    @Override()
    public final void sqlite3_progress_handler(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        label$0:
        do {
            if ((this._loadInt((_34_ + 8))) < 1) {
                break label$0;
            }
            this._storeInt(((_33_ = this._loadInt((_34_ + 12))) + 284), (this._loadInt((_34_ + 8))));
            this._storeInt((_33_ + 276), (this._loadInt((_34_ + 4))));
            this._storeInt(((this._loadInt((_34_ + 12))) + 280), (this._loadInt(_34_)));
            return;
        }
        while (false);
        this._storeInt(((_34_ = this._loadInt((_34_ + 12))) + 280), (this._storeInt((_34_ + 284), (this._storeInt((_34_ + 276), 0)))));
        return;
    }

    @Override()
    public final int sqlite3_reset(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 8), (sqlite3VdbeReset((this._storeInt((_31_ + 4), (this._loadInt((_31_ + 12))))))));
                sqlite3VdbeRewind((this._loadInt((_31_ + 4))));
                this._storeInt((_31_ + 8), (sqlite3ApiExit((this._loadInt((this._loadInt((_31_ + 4))))), (this._loadInt((_31_ + 8))))));
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 8), 0);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void sqlite3_result_blob(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        setResultStrOrError((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))), 0, _33_);
        this._storeInt((0 + 4), (_34_ + 16));
        return;
    }

    @Override()
    public final void sqlite3_result_error16(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(((_31_ = this._loadInt((_33_ + 12))) + 52), 1);
        _temp$0 = 2;
        _temp$1 = 3;
        _temp$2 = ((this._loadInt8s((0 + 29180))) != 0) ? _temp$0 : _temp$1;
        sqlite3VdbeMemSetStr((_31_ + 8), (this._loadInt((_33_ + 8))), _32_, _temp$2, -1);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void sqlite3_result_null(int _30_)
    {
        int _31_ = 0;
        sqlite3VdbeMemSetNull(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3_result_text16(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        _temp$0 = 2;
        _temp$1 = 3;
        _temp$2 = ((this._loadInt8s((0 + 29180))) != 0) ? _temp$0 : _temp$1;
        setResultStrOrError((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))), _temp$2, _33_);
        this._storeInt((0 + 4), (_34_ + 16));
        return;
    }

    @Override()
    public final void sqlite3_result_text16be(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        setResultStrOrError((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))), 3, _33_);
        this._storeInt((0 + 4), (_34_ + 16));
        return;
    }

    @Override()
    public final void sqlite3_result_text16le(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        setResultStrOrError((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))), 2, _33_);
        this._storeInt((0 + 4), (_34_ + 16));
        return;
    }

    @Override()
    public final void sqlite3_result_value(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        sqlite3VdbeMemCopy(((this._loadInt((_32_ + 12))) + 8), _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int sqlite3_rollback_hook(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 12))) + 176))));
        this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 180), (this._loadInt((_33_ + 8))));
        this._storeInt((_32_ + 176), (this._loadInt((_33_ + 4))));
        return (this._loadInt(_33_));
    }

    @Override()
    public final int sqlite3_set_authorizer(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        _31_ = this._storeInt((_33_ + 4), _32_);
        this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 268), (this._loadInt((_33_ + 8))));
        this._storeInt((_32_ + 272), _31_);
        sqlite3ExpirePreparedStatements(_32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return 0;
    }

    @Override()
    public final void sqlite3_set_auxdata(int _30_, int _31_, int _32_, int _33_)
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
                if ((this._loadInt((_34_ + 24))) < 0) {
                    break label$1;
                }
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((_34_ + 28))) + 4))))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt(((this._loadInt((_34_ + 8))) + 4))) > (this._loadInt((_34_ + 24)))) {
                            break label$2;
                        }
                    }
                    while (false);
                    _33_ = 0;
                    label$4:
                    do {
                        if ((this._loadInt((_34_ + 8))) == 0) {
                            break label$4;
                        }
                        _33_ = this._loadInt(((this._loadInt((_34_ + 8))) + 4));
                    }
                    while (false);
                    this._storeInt((_34_ + 4), _33_);
                    _33_ = this._storeInt(_34_, (((this._loadInt((_34_ + 24))) << 3) + 16));
                    if ((this._storeInt((_34_ + 8), (sqlite3DbRealloc((this._loadInt(((this._loadInt((_34_ + 28))) + 8))), (this._loadInt((_34_ + 8))), _33_)))) == 0) {
                        break label$1;
                    }
                    memset((((this._storeInt(((this._loadInt((_34_ + 28))) + 4), (this._loadInt((_34_ + 8))))) + ((_33_ = this._loadInt((_34_ + 4))) << 3)) + 8), 0, ((((this._loadInt((_34_ + 24))) + 1) - _33_) << 3));
                    this._storeInt(((_33_ = this._loadInt((_34_ + 8))) + 4), ((this._loadInt((_34_ + 24))) + 1));
                    this._storeInt(_33_, (this._loadInt((this._loadInt((_34_ + 28))))));
                }
                while (false);
                label$5:
                do {
                    if ((this._loadInt((this._storeInt((_34_ + 12), (((this._loadInt((_34_ + 8))) + ((this._loadInt((_34_ + 24))) << 3)) + 8))))) == 0) {
                        break label$5;
                    }
                    if ((this._loadInt(((this._loadInt((_34_ + 12))) + 4))) == 0) {
                        break label$5;
                    }
                    this._viTable[this._tableIndices[this._loadInt(((_33_ = this._loadInt((_34_ + 12))) + 4))]].invoke((this._loadInt(_33_)));
                }
                while (false);
                this._storeInt(((_33_ = this._loadInt((_34_ + 12))) + 4), (this._loadInt((_34_ + 16))));
                this._storeInt(_33_, (this._loadInt((_34_ + 20))));
                break label$0;
            }
            while (false);
            if ((this._loadInt((_34_ + 16))) == 0) {
                break label$0;
            }
            this._viTable[this._tableIndices[this._loadInt((_34_ + 16))]].invoke((this._loadInt((_34_ + 20))));
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final int sqlite3_step(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        _30_ = this._storeInt((_32_ + 16), (this._storeInt((_32_ + 20), 0)));
        this._storeInt((_32_ + 12), (this._loadInt((_32_ + 24))));
        _31_ = this._storeInt((_32_ + 8), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((vdbeSafetyNotNull((this._loadInt((_32_ + 12))))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 28), (sqlite3MisuseError(61273)));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 4), (this._loadInt((this._loadInt((_32_ + 12))))));
            label$3:
            do {
                label$2:
                while (true) {
                    _30_ = 0;
                    label$4:
                    do {
                        if ((this._storeInt((_32_ + 20), (sqlite3Step((this._loadInt((_32_ + 12))))))) != 17) {
                            break label$4;
                        }
                        this._storeInt((_32_ + 8), ((_33_ = this._loadInt((_32_ + 8))) + 1));
                        if (_33_ > 4) {
                            break label$4;
                        }
                        _30_ = ((this._storeInt((_32_ + 16), (this._storeInt((_32_ + 20), (sqlite3Reprepare((this._loadInt((_32_ + 12))))))))) == 0) ? 1 : 0;
                    }
                    while (false);
                    if (_30_ == 0) {
                        break label$3;
                    }
                    sqlite3_reset((this._loadInt((_32_ + 24))));
                    this._storeInt8(((this._loadInt((_32_ + 12))) + 99), _31_);
                    continue label$2;
                }
            }
            while (false);
            label$5:
            do {
                if ((this._loadInt((_32_ + 16))) == 0) {
                    break label$5;
                }
                if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 105))) == 0) {
                    break label$5;
                }
                if ((this._loadInt(((this._loadInt((_32_ + 4))) + 212))) == 0) {
                    break label$5;
                }
                this._storeInt(_32_, (sqlite3_value_text((this._loadInt(((this._loadInt((_32_ + 4))) + 212))))));
                sqlite3DbFree((this._loadInt((_32_ + 4))), (this._loadInt(((this._loadInt((_32_ + 12))) + 56))));
                label$6:
                do {
                    if ((this._loadInt8u(((this._loadInt((_32_ + 4))) + 30))) == 0) {
                        break label$6;
                    }
                    this._storeInt(((this._loadInt((_32_ + 12))) + 56), 0);
                    _30_ = this._storeInt((_32_ + 20), 7);
                    this._storeInt(((this._loadInt((_32_ + 12))) + 92), _30_);
                    break label$5;
                }
                while (false);
                _30_ = sqlite3DbStrDup((this._loadInt((_32_ + 4))), (this._loadInt(_32_)));
                this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 56), _30_);
                this._storeInt((_31_ + 92), (this._loadInt((_32_ + 16))));
            }
            while (false);
            this._storeInt((_32_ + 28), (this._storeInt((_32_ + 20), (sqlite3ApiExit((this._loadInt((_32_ + 4))), (this._loadInt((_32_ + 20))))))));
        }
        while (false);
        _30_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _30_;
    }

    @Override()
    public final void sqlite3_thread_cleanup()
    {
        return;
    }

    @Override()
    public final int sqlite3_total_changes(int _30_)
    {
        return (this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 64)));
    }

    @Override()
    public final int sqlite3_trace(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 12))) + 156))));
        this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 152), (this._loadInt((_33_ + 8))));
        this._storeInt((_32_ + 156), (this._loadInt((_33_ + 4))));
        return (this._loadInt(_33_));
    }

    @Override()
    public final int sqlite3_transfer_bindings(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 16), (this._loadInt((_32_ + 24))));
        _31_ = this._storeInt((_32_ + 12), (this._loadInt((_32_ + 20))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt16s(((this._loadInt((_32_ + 16))) + 80))) == (this._loadInt16s((_31_ + 80)))) {
                    break label$1;
                }
                this._storeInt((_32_ + 28), 1);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 105))) == 0) {
                    break label$2;
                }
                if ((this._loadInt(((this._loadInt((_32_ + 12))) + 180))) == 0) {
                    break label$2;
                }
                this._storeInt8(((this._loadInt((_32_ + 12))) + 99), 1);
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 16))) + 105))) == 0) {
                    break label$3;
                }
                if ((this._loadInt(((this._loadInt((_32_ + 16))) + 180))) == 0) {
                    break label$3;
                }
                this._storeInt8(((this._loadInt((_32_ + 16))) + 99), 1);
            }
            while (false);
            this._storeInt((_32_ + 28), (sqlite3TransferBindings((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 20))))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int sqlite3_update_hook(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 12))) + 184))));
        this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 188), (this._loadInt((_33_ + 8))));
        this._storeInt((_32_ + 184), (this._loadInt((_33_ + 4))));
        return (this._loadInt(_33_));
    }

    @Override()
    public final int sqlite3_value_blob(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt16u(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 4), (this._storeInt((_31_ + 8), _30_)))) + 28))) & 18) == 0) {
                    break label$1;
                }
                sqlite3VdbeMemExpandBlob((this._loadInt((_31_ + 4))));
                this._storeInt16(((_30_ = this._loadInt((_31_ + 4))) + 28), ((this._loadInt16u((_30_ + 28))) & 65533));
                this._storeInt16((_30_ + 28), ((this._loadInt16u((_30_ + 28))) | 16));
                _30_ = 0;
                label$2:
                do {
                    if ((this._loadInt(((this._loadInt((_31_ + 4))) + 24))) == 0) {
                        break label$2;
                    }
                    _30_ = this._loadInt(((this._loadInt((_31_ + 4))) + 4));
                }
                while (false);
                this._storeInt((_31_ + 12), _30_);
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 12), (sqlite3_value_text((this._loadInt((_31_ + 8))))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3_value_bytes16(int _30_)
    {
        int _31_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        _temp$0 = 2;
        _temp$1 = 3;
        _temp$2 = ((this._loadInt8s((0 + 29180))) != 0) ? _temp$0 : _temp$1;
        _temp$2 = sqlite3ValueBytes((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), _temp$2);
        _30_ = _temp$2;
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3_value_int(int _30_)
    {
        int _31_ = 0;
        long _32_ = 0L;
        _32_ = sqlite3VdbeIntValue((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return ((int) _32_);
    }

    @Override()
    public final int sqlite3_value_text16(int _30_)
    {
        int _31_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        _temp$0 = 2;
        _temp$1 = 3;
        _temp$2 = ((this._loadInt8s((0 + 29180))) != 0) ? _temp$0 : _temp$1;
        _temp$2 = sqlite3ValueText((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), _temp$2);
        _30_ = _temp$2;
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3_value_text16be(int _30_)
    {
        int _31_ = 0;
        _30_ = sqlite3ValueText((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 3);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3_value_text16le(int _30_)
    {
        int _31_ = 0;
        _30_ = sqlite3ValueText((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 2);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3_vmprintf(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 400))) + 392), _30_);
        this._storeInt((_32_ + 388), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((sqlite3_initialize()) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 396), 0);
                break label$0;
            }
            while (false);
            sqlite3StrAccumInit(_32_, (_32_ + 32), 350, 1000000000);
            this._storeInt8((_32_ + 25), 2);
            sqlite3VXPrintf(_32_, 0, (this._loadInt((_32_ + 392))), (this._loadInt((_32_ + 388))));
            this._storeInt((_32_ + 396), (this._storeInt((_32_ + 384), (sqlite3StrAccumFinish(_32_)))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 396));
        this._storeInt((0 + 4), (_32_ + 400));
        return _31_;
    }

    @Override()
    public final int sqlite3_overload_function(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        _32_ = this._storeInt((_33_ + 16), (sqlite3Strlen30((this._loadInt((_33_ + 24))))));
        label$0:
        do {
            if ((sqlite3FindFunction((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 24))), _32_, (this._loadInt((_33_ + 20))), 1, 0)) != 0) {
                break label$0;
            }
            sqlite3CreateFunc((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))), 1, 0, 20, 0, 0, 0);
        }
        while (false);
        _32_ = this._storeInt((_33_ + 12), (sqlite3ApiExit((this._loadInt((_33_ + 28))), 0)));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int sqlite3_prepare_v2(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        _34_ = this._storeInt((_35_ + 8), (sqlite3LockAndPrepare((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), 1, 0, (this._loadInt((_35_ + 16))), _34_)));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3_prepare16_v2(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        _34_ = this._storeInt((_35_ + 8), (sqlite3Prepare16((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), 1, (this._loadInt((_35_ + 16))), _34_)));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3_clear_bindings(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        _30_ = this._storeInt((_31_ + 4), 0);
        this._storeInt(_31_, (this._loadInt((_31_ + 12))));
        this._storeInt((_31_ + 8), _30_);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 8))) >= (this._loadInt16s(((this._loadInt(_31_)) + 80)))) {
                    break label$1;
                }
                sqlite3VdbeMemRelease(((this._loadInt(((this._loadInt(_31_)) + 72))) + ((this._loadInt((_31_ + 8))) * 40)));
                this._storeInt((_31_ + 8), ((this._storeInt16((((this._loadInt(((this._loadInt(_31_)) + 72))) + ((this._loadInt((_31_ + 8))) * 40)) + 28), 1)) + (this._loadInt((_31_ + 8)))));
                continue label$0;
            }
        }
        while (false);
        label$2:
        do {
            if ((this._loadInt8u(((this._loadInt(_31_)) + 105))) == 0) {
                break label$2;
            }
            if ((this._loadInt(((this._loadInt(_31_)) + 180))) == 0) {
                break label$2;
            }
            this._storeInt8(((this._loadInt(_31_)) + 99), 1);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 4));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3_create_module_v2(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        _34_ = createModule((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 16))), _34_);
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3_bind_zeroblob(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        label$0:
        do {
            if ((this._storeInt((_33_ + 16), (vdbeUnbind((this._storeInt((_33_ + 12), (this._loadInt((_33_ + 28))))), (this._loadInt((_33_ + 24))))))) != 0) {
                break label$0;
            }
            sqlite3VdbeMemSetZeroBlob((((this._loadInt(((this._loadInt((_33_ + 12))) + 72))) + ((this._loadInt((_33_ + 24))) * 40)) + -40), (this._loadInt((_33_ + 20))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 16));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int sqlite3_blob_bytes(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeInt((_32_ + 12), _30_)))) == 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_32_ + 8))) + 20))) == 0) {
                break label$0;
            }
            _31_ = this._loadInt(((this._loadInt((_32_ + 8))) + 4));
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int sqlite3_blob_close(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._storeInt((_31_ + 12), _30_)))) == 0) {
                    break label$1;
                }
                this._storeInt(_31_, (this._loadInt(((this._loadInt((_31_ + 8))) + 24))));
                this._storeInt((_31_ + 4), (sqlite3_finalize((this._loadInt(((this._loadInt((_31_ + 8))) + 20))))));
                sqlite3DbFree((this._loadInt(_31_)), (this._loadInt((_31_ + 8))));
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 4), 0);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 4));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3_blob_open(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            long _34_,
            int _35_,
            int _36_)
    {
        int _37_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_37_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 160))) + 156), _30_);
        this._storeInt((_37_ + 152), _31_);
        this._storeInt((_37_ + 148), _32_);
        this._storeInt((_37_ + 144), _33_);
        this._storeLong((_37_ + 136), _34_);
        this._storeInt((_37_ + 132), _35_);
        this._storeInt((_37_ + 128), _36_);
        this._storeInt((_37_ + 132), (((_36_ = this._storeInt((_37_ + 100), (this._storeInt((_37_ + 104), (this._storeInt((_37_ + 112), (this._storeInt((_37_ + 116), (this._storeInt((_37_ + 124), 0)))))))))) != (this._loadInt((_37_ + 132)))) ? 1 : 0));
        this._storeInt((this._loadInt((_37_ + 128))), _36_);
        label$0:
        do {
            if ((this._storeInt((_37_ + 100), (sqlite3DbMallocZero((this._loadInt((_37_ + 156))), 28)))) == 0) {
                break label$0;
            }
            if ((this._storeInt((_37_ + 104), (sqlite3DbMallocRaw((this._loadInt((_37_ + 156))), 560)))) == 0) {
                break label$0;
            }
            label$2:
            do {
                label$1$end:
                do {
                    label$1:
                    while (true) {
                        memset((this._loadInt((_37_ + 104))), 0, 560);
                        this._storeInt((this._loadInt((_37_ + 104))), (this._loadInt((_37_ + 156))));
                        sqlite3DbFree((this._loadInt((_37_ + 156))), (this._loadInt((_37_ + 112))));
                        _36_ = this._storeInt((_37_ + 112), 0);
                        sqlite3BtreeEnterAll((this._loadInt((_37_ + 156))));
                        label$3:
                        do {
                            if ((this._storeInt((_37_ + 108), (sqlite3LocateTable((this._loadInt((_37_ + 104))), _36_, (this._loadInt((_37_ + 148))), (this._loadInt((_37_ + 152))))))) == 0) {
                                break label$3;
                            }
                            if (((this._loadInt8u(((this._loadInt((_37_ + 108))) + 34))) & 16) == 0) {
                                break label$3;
                            }
                            this._storeInt((_37_ + 108), _36_);
                            _35_ = this._loadInt((_37_ + 104));
                            this._storeInt((_37_ + 64), (this._loadInt((_37_ + 148))));
                            sqlite3ErrorMsg(_35_, 31664, (_37_ + 64));
                        }
                        while (false);
                        label$4:
                        do {
                            if ((this._loadInt((_37_ + 108))) == 0) {
                                break label$4;
                            }
                            if ((this._loadInt(((this._loadInt((_37_ + 108))) + 28))) == 0) {
                                break label$4;
                            }
                            this._storeInt((_37_ + 108), _36_);
                            _35_ = this._loadInt((_37_ + 104));
                            this._storeInt((_37_ + 48), (this._loadInt((_37_ + 148))));
                            sqlite3ErrorMsg(_35_, 31696, (_37_ + 48));
                        }
                        while (false);
                        label$5:
                        do {
                            label$6:
                            do {
                                label$7:
                                do {
                                    if ((this._loadInt((_37_ + 108))) == 0) {
                                        break label$7;
                                    }
                                    _35_ = this._storeInt((_37_ + 120), _36_);
                                    label$9:
                                    do {
                                        label$8:
                                        while (true) {
                                            if ((this._loadInt((_37_ + 120))) >= (this._loadInt(((this._loadInt((_37_ + 108))) + 8)))) {
                                                break label$9;
                                            }
                                            if ((sqlite3StrICmp((this._loadInt(((this._loadInt(((this._loadInt((_37_ + 108))) + 12))) + ((this._loadInt((_37_ + 120))) * 24)))), (this._loadInt((_37_ + 144))))) == 0) {
                                                break label$9;
                                            }
                                            this._storeInt((_37_ + 120), ((this._loadInt((_37_ + 120))) + 1));
                                            continue label$8;
                                        }
                                    }
                                    while (false);
                                    label$10:
                                    do {
                                        if ((this._loadInt((_37_ + 120))) == (this._loadInt(((this._loadInt((_37_ + 108))) + 8)))) {
                                            break label$10;
                                        }
                                        if ((this._loadInt((_37_ + 132))) == 0) {
                                            break label$5;
                                        }
                                        _36_ = this._storeInt((_37_ + 96), _35_);
                                        if (((this._loadInt8u(((this._loadInt((_37_ + 156))) + 15))) & 4) == 0) {
                                            break label$6;
                                        }
                                        this._storeInt((_37_ + 88), (this._loadInt(((this._loadInt((_37_ + 108))) + 36))));
                                        label$11:
                                        while (true) {
                                            if ((this._loadInt((_37_ + 88))) == 0) {
                                                break label$6;
                                            }
                                            this._storeInt((_37_ + 84), _36_);
                                            label$14:
                                            do {
                                                label$13:
                                                while (true) {
                                                    if ((this._loadInt((_37_ + 84))) >= (this._loadInt(((this._loadInt((_37_ + 88))) + 20)))) {
                                                        break label$14;
                                                    }
                                                    label$15:
                                                    do {
                                                        if ((this._loadInt((((this._loadInt((_37_ + 88))) + ((this._loadInt((_37_ + 84))) << 3)) + 36))) != (this._loadInt((_37_ + 120)))) {
                                                            break label$15;
                                                        }
                                                        this._storeInt((_37_ + 96), 31760);
                                                    }
                                                    while (false);
                                                    this._storeInt((_37_ + 84), ((this._loadInt((_37_ + 84))) + 1));
                                                    continue label$13;
                                                }
                                            }
                                            while (false);
                                            this._storeInt((_37_ + 88), (this._loadInt(((this._loadInt((_37_ + 88))) + 4))));
                                            continue label$11;
                                        }
                                    }
                                    while (false);
                                    sqlite3DbFree((this._loadInt((_37_ + 156))), (this._loadInt((_37_ + 112))));
                                    _36_ = this._loadInt((_37_ + 156));
                                    this._storeInt((_37_ + 16), (this._loadInt((_37_ + 144))));
                                    this._storeInt((_37_ + 112), (sqlite3MPrintf(_36_, 31728, (_37_ + 16))));
                                    this._storeInt((_37_ + 116), 1);
                                    break label$2;
                                }
                                while (false);
                                label$16:
                                do {
                                    if ((this._loadInt(((this._loadInt((_37_ + 104))) + 8))) == 0) {
                                        break label$16;
                                    }
                                    sqlite3DbFree((this._loadInt((_37_ + 156))), (this._loadInt((_37_ + 112))));
                                    this._storeInt((_37_ + 112), (this._loadInt(((this._loadInt((_37_ + 104))) + 8))));
                                    this._storeInt(((this._loadInt((_37_ + 104))) + 8), 0);
                                }
                                while (false);
                                this._storeInt((_37_ + 116), 1);
                                break label$2;
                            }
                            while (false);
                            this._storeInt((_37_ + 92), (this._loadInt(((this._loadInt((_37_ + 108))) + 16))));
                            label$18:
                            do {
                                label$17:
                                while (true) {
                                    label$19:
                                    do {
                                        label$20:
                                        do {
                                            if ((this._loadInt((_37_ + 92))) == 0) {
                                                break label$20;
                                            }
                                            this._storeInt((_37_ + 80), _36_);
                                            label$21:
                                            while (true) {
                                                if ((this._loadInt((_37_ + 80))) >= (this._loadInt(((this._loadInt((_37_ + 92))) + 4)))) {
                                                    break label$19;
                                                }
                                                label$23:
                                                do {
                                                    if ((this._loadInt(((this._loadInt(((this._loadInt((_37_ + 92))) + 8))) + ((this._loadInt((_37_ + 80))) << 2)))) != (this._loadInt((_37_ + 120)))) {
                                                        break label$23;
                                                    }
                                                    this._storeInt((_37_ + 96), 31776);
                                                }
                                                while (false);
                                                this._storeInt((_37_ + 80), ((this._loadInt((_37_ + 80))) + 1));
                                                continue label$21;
                                            }
                                        }
                                        while (false);
                                        if ((this._loadInt((_37_ + 96))) == 0) {
                                            break label$18;
                                        }
                                        sqlite3DbFree((this._loadInt((_37_ + 156))), (this._loadInt((_37_ + 112))));
                                        _36_ = this._loadInt((_37_ + 156));
                                        this._storeInt((_37_ + 32), (this._loadInt((_37_ + 96))));
                                        this._storeInt((_37_ + 112), (sqlite3MPrintf(_36_, 31792, (_37_ + 32))));
                                        this._storeInt((_37_ + 116), 1);
                                        break label$2;
                                    }
                                    while (false);
                                    this._storeInt((_37_ + 92), (this._loadInt(((this._loadInt((_37_ + 92))) + 32))));
                                    continue label$17;
                                }
                            }
                            while (false);
                        }
                        while (false);
                        _36_ = sqlite3VdbeCreate((this._loadInt((_37_ + 156))));
                        label$24:
                        do {
                            if ((this._storeInt(((this._loadInt((_37_ + 100))) + 20), _36_)) == 0) {
                                break label$24;
                            }
                            this._storeInt((_37_ + 76), (this._loadInt(((this._loadInt((_37_ + 100))) + 20))));
                            this._storeInt((_37_ + 72), (sqlite3SchemaToIndex((this._loadInt((_37_ + 156))), (this._loadInt(((this._loadInt((_37_ + 108))) + 68))))));
                            sqlite3VdbeAddOpList((this._loadInt((_37_ + 76))), 12, 31840);
                            sqlite3VdbeChangeP1((this._loadInt((_37_ + 76))), _35_, (this._loadInt((_37_ + 72))));
                            sqlite3VdbeChangeP2((this._loadInt((_37_ + 76))), _35_, (this._loadInt((_37_ + 132))));
                            sqlite3VdbeChangeP1((this._loadInt((_37_ + 76))), 1, (this._loadInt((_37_ + 72))));
                            sqlite3VdbeChangeP2((this._loadInt((_37_ + 76))), 1, (this._loadInt((this._loadInt(((this._loadInt((_37_ + 108))) + 68))))));
                            sqlite3VdbeChangeP3((this._loadInt((_37_ + 76))), 1, (this._loadInt(((this._loadInt(((this._loadInt((_37_ + 108))) + 68))) + 4))));
                            sqlite3VdbeUsesBtree((this._loadInt((_37_ + 76))), (this._loadInt((_37_ + 72))));
                            sqlite3VdbeChangeP1((this._loadInt((_37_ + 76))), 2, (this._loadInt((_37_ + 72))));
                            sqlite3VdbeChangeP2((this._loadInt((_37_ + 76))), 2, (this._loadInt(((this._loadInt((_37_ + 108))) + 20))));
                            sqlite3VdbeChangeP3((this._loadInt((_37_ + 76))), 2, (this._loadInt((_37_ + 132))));
                            sqlite3VdbeChangeP4((this._loadInt((_37_ + 76))), 2, (this._loadInt((this._loadInt((_37_ + 108))))), _35_);
                            sqlite3VdbeChangeToNoop((this._loadInt((_37_ + 76))), (4 - (this._loadInt((_37_ + 132)))), 1);
                            sqlite3VdbeChangeP2((this._loadInt((_37_ + 76))), ((this._loadInt((_37_ + 132))) + 3), (this._loadInt(((this._loadInt((_37_ + 108))) + 20))));
                            sqlite3VdbeChangeP3((this._loadInt((_37_ + 76))), ((this._loadInt((_37_ + 132))) + 3), (this._loadInt((_37_ + 72))));
                            sqlite3VdbeChangeP4((this._loadInt((_37_ + 76))), ((this._loadInt((_37_ + 132))) + 3), ((this._loadInt(((this._loadInt((_37_ + 108))) + 8))) + 1), -14);
                            sqlite3VdbeChangeP2((this._loadInt((_37_ + 76))), 7, (this._loadInt(((this._loadInt((_37_ + 108))) + 8))));
                            if ((this._loadInt8u(((this._loadInt((_37_ + 156))) + 30))) != 0) {
                                break label$24;
                            }
                            this._storeInt(((_36_ = this._loadInt((_37_ + 104))) + 68), (this._storeInt((_36_ + 72), (this._storeInt((_36_ + 456), 1)))));
                            sqlite3VdbeMakeReady((this._loadInt((_37_ + 76))), _36_);
                        }
                        while (false);
                        this._storeInt(((_36_ = this._loadInt((_37_ + 100))) + 12), (this._loadInt((_37_ + 120))));
                        this._storeInt(_36_, (this._loadInt((_37_ + 132))));
                        this._storeInt(((this._loadInt((_37_ + 100))) + 24), (this._loadInt((_37_ + 156))));
                        if ((this._loadInt8u(((this._loadInt((_37_ + 156))) + 30))) != 0) {
                            break label$2;
                        }
                        sqlite3_bind_int64((this._loadInt(((this._loadInt((_37_ + 100))) + 20))), 1, (this._loadLong((_37_ + 136))));
                        this._storeInt((_37_ + 116), (blobSeekToRow((this._loadInt((_37_ + 100))), (this._loadLong((_37_ + 136))), (_37_ + 112))));
                        _36_ = 0;
                        label$25:
                        do {
                            if ((this._storeInt((_37_ + 124), ((this._loadInt((_37_ + 124))) + 1))) > 4) {
                                break label$25;
                            }
                            _36_ = ((this._loadInt((_37_ + 116))) == 17) ? 1 : 0;
                        }
                        while (false);
                        if (_36_ != 0) {
                            continue label$1;
                        }
                        break label$1$end;
                    }
                }
                while (false);
            }
            while (false);
        }
        while (false);
        label$26:
        do {
            label$27:
            do {
                label$28:
                do {
                    if ((this._loadInt((_37_ + 116))) != 0) {
                        break label$28;
                    }
                    if ((this._loadInt8u(((this._loadInt((_37_ + 156))) + 30))) == 0) {
                        break label$27;
                    }
                }
                while (false);
                label$29:
                do {
                    if ((this._loadInt((_37_ + 100))) == 0) {
                        break label$29;
                    }
                    if ((this._loadInt(((this._loadInt((_37_ + 100))) + 20))) == 0) {
                        break label$29;
                    }
                    sqlite3VdbeFinalize((this._loadInt(((this._loadInt((_37_ + 100))) + 20))));
                }
                while (false);
                sqlite3DbFree((this._loadInt((_37_ + 156))), (this._loadInt((_37_ + 100))));
                break label$26;
            }
            while (false);
            this._storeInt((this._loadInt((_37_ + 128))), (this._loadInt((_37_ + 100))));
        }
        while (false);
        _temp$0 = 22192;
        _temp$1 = 0;
        _temp$2 = ((this._storeInt(_37_, (this._loadInt((_37_ + 112))))) != 0) ? _temp$0 : _temp$1;
        sqlite3Error((this._loadInt((_37_ + 156))), (this._loadInt((_37_ + 116))), _temp$2, _37_);
        sqlite3DbFree((this._loadInt((_37_ + 156))), (this._loadInt((_37_ + 112))));
        sqlite3DbFree((this._loadInt((_37_ + 156))), (this._loadInt((_37_ + 104))));
        _36_ = this._storeInt((_37_ + 116), (sqlite3ApiExit((this._loadInt((_37_ + 156))), (this._loadInt((_37_ + 116))))));
        this._storeInt((0 + 4), (_37_ + 160));
        return _36_;
    }

    @Override()
    public final int sqlite3_blob_read(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        _33_ = blobReadWrite((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))), _33_, 21);
        this._storeInt((0 + 4), (_34_ + 16));
        return _33_;
    }

    @Override()
    public final int sqlite3_blob_write(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        _33_ = blobReadWrite((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))), _33_, 22);
        this._storeInt((0 + 4), (_34_ + 16));
        return _33_;
    }
}
