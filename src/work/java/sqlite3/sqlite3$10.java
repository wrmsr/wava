package sqlite3;

abstract class sqlite3$10
        extends sqlite3$9
{
    protected sqlite3$10(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final void datetimeFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 208))) + 204), _30_);
        this._storeInt((_33_ + 200), _31_);
        this._storeInt((_33_ + 196), _32_);
        label$0:
        do {
            if ((isDate((this._loadInt((_33_ + 204))), (this._loadInt((_33_ + 200))), _32_, (_33_ + 144))) != 0) {
                break label$0;
            }
            computeYMD_HMS((_33_ + 144));
            _32_ = this._loadInt((_33_ + 160));
            this._storeInt((_33_ + 16), (this._loadInt((_33_ + 168))));
            _31_ = this._loadInt((_33_ + 164));
            this._storeInt((_33_ + 20), (_truncateDoubleToSignedInteger((this._loadDouble((_33_ + 176))))));
            this._storeLong(_33_, (this._loadLong((_33_ + 152))));
            this._storeInt((_33_ + 12), _31_);
            this._storeInt((_33_ + 8), _32_);
            sqlite3_snprintf(100, (_33_ + 32), 27296, _33_);
            sqlite3_result_text((this._loadInt((_33_ + 204))), (_33_ + 32), -1, -1);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 208));
        return;
    }

    @Override()
    public final void strftimeFunc(int _30_, int _31_, int _32_)
    {
        long _33_ = 0L;
        double _34_ = 0.0;
        int _35_ = 0;
        int _36_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 432))) + 428), _30_);
        this._storeInt((_35_ + 424), _31_);
        label$0:
        do {
            if ((this._storeInt((_35_ + 340), (sqlite3_value_text((this._loadInt((this._storeInt((_35_ + 420), _32_)))))))) == 0) {
                break label$0;
            }
            if ((isDate((this._loadInt((_35_ + 428))), ((this._loadInt((_35_ + 424))) + -1), ((this._loadInt((_35_ + 420))) + 4), (_35_ + 368))) != 0) {
                break label$0;
            }
            this._storeInt((_35_ + 344), (sqlite3_context_db_handle((this._loadInt((_35_ + 428))))));
            this._storeInt((_35_ + 356), 0);
            _33_ = this._storeLong((_35_ + 360), 1L);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt8u(((this._loadInt((_35_ + 340))) + (this._loadInt((_35_ + 356)))))) == 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._loadInt8s(((this._loadInt((_35_ + 340))) + (this._loadInt((_35_ + 356)))))) != 37) {
                            break label$3;
                        }
                        if (((_32_ = (this._loadInt8s((((this._loadInt((_35_ + 340))) + (this._loadInt((_35_ + 356)))) + 1))) + -37) & 4294967295L) > (82 & 4294967295L)) {
                            break label$0;
                        }
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
                                                switch (_32_) {
                                                    case 0:
                                                    case 82: {
                                                        break label$4;
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
                                                    case 36:
                                                    case 38:
                                                    case 39:
                                                    case 41:
                                                    case 42:
                                                    case 43:
                                                    case 44:
                                                    case 45:
                                                    case 47:
                                                    case 48:
                                                    case 49:
                                                    case 51:
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
                                                    case 64:
                                                    case 66:
                                                    case 67:
                                                    case 68:
                                                    case 70:
                                                    case 71:
                                                    case 73:
                                                    case 74:
                                                    case 75:
                                                    case 76:
                                                    case 77:
                                                    case 79:
                                                    case 80:
                                                    case 81: {
                                                        break label$0;
                                                    }
                                                    case 35:
                                                    case 40:
                                                    case 46:
                                                    case 50:
                                                    case 63:
                                                    case 72: {
                                                        break label$9;
                                                    }
                                                    case 37:
                                                    case 78: {
                                                        break label$8;
                                                    }
                                                    case 52: {
                                                        break label$7;
                                                    }
                                                    case 65: {
                                                        break label$6;
                                                    }
                                                    case 69: {
                                                        break label$5;
                                                    }
                                                    default: {
                                                        break label$4;
                                                    }
                                                }
                                            }
                                            while (false);
                                            this._storeLong((_35_ + 360), ((this._loadLong((_35_ + 360))) + _33_));
                                            break label$4;
                                        }
                                        while (false);
                                        this._storeLong((_35_ + 360), ((this._loadLong((_35_ + 360))) + 50L));
                                        break label$4;
                                    }
                                    while (false);
                                    this._storeLong((_35_ + 360), ((this._loadLong((_35_ + 360))) + 8L));
                                    break label$4;
                                }
                                while (false);
                                this._storeLong((_35_ + 360), ((this._loadLong((_35_ + 360))) + 8L));
                                break label$4;
                            }
                            while (false);
                            this._storeLong((_35_ + 360), ((this._loadLong((_35_ + 360))) + 3L));
                        }
                        while (false);
                        this._storeInt((_35_ + 356), ((this._loadInt((_35_ + 356))) + 1));
                    }
                    while (false);
                    this._storeInt((_35_ + 356), ((this._loadInt((_35_ + 356))) + 1));
                    this._storeLong((_35_ + 360), ((this._loadLong((_35_ + 360))) + _33_));
                    continue label$1;
                }
            }
            while (false);
            label$10:
            do {
                label$11:
                do {
                    label$12:
                    do {
                        if (((this._loadLong((_35_ + 360))) & 4294967295L) > (99L & 4294967295L)) {
                            break label$12;
                        }
                        this._storeInt((_35_ + 348), (_35_ + 240));
                        break label$11;
                    }
                    while (false);
                    label$13:
                    do {
                        if (((this._loadLong((_35_ + 360))) & 4294967295L) <= ((this._loadLong32s(((this._loadInt((_35_ + 344))) + 72))) & 4294967295L)) {
                            break label$13;
                        }
                        sqlite3_result_error_toobig((this._loadInt((_35_ + 428))));
                        break label$0;
                    }
                    while (false);
                    if ((this._storeInt((_35_ + 348), (sqlite3DbMallocRaw((this._loadInt((_35_ + 344))), (this._loadInt((_35_ + 360))))))) == 0) {
                        break label$10;
                    }
                }
                while (false);
                computeJD((_35_ + 368));
                computeYMD_HMS((_35_ + 368));
                _30_ = this._storeInt((_35_ + 356), (this._storeInt((_35_ + 352), 0)));
                label$15:
                do {
                    label$14:
                    while (true) {
                        if ((this._loadInt8u(((this._loadInt((_35_ + 340))) + (this._loadInt((_35_ + 356)))))) == 0) {
                            break label$15;
                        }
                        label$16:
                        do {
                            label$17:
                            do {
                                if ((this._loadInt8s(((this._loadInt((_35_ + 340))) + (this._loadInt((_35_ + 356)))))) == 37) {
                                    break label$17;
                                }
                                _32_ = this._loadInt8u(((this._loadInt((_35_ + 340))) + (this._loadInt((_35_ + 356)))));
                                this._storeInt((_35_ + 352), ((_31_ = this._loadInt((_35_ + 352))) + 1));
                                this._storeInt8((_31_ + (this._loadInt((_35_ + 348)))), _32_);
                                break label$16;
                            }
                            while (false);
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
                                                                        if (((_32_ = (this._loadInt8s(((this._storeInt((_35_ + 356), ((this._loadInt((_35_ + 356))) + 1))) + (this._loadInt((_35_ + 340)))))) + -72) & 4294967295L) > (47 & 4294967295L)) {
                                                                            break label$28;
                                                                        }
                                                                        label$29:
                                                                        do {
                                                                            label$30:
                                                                            do {
                                                                                switch (_32_) {
                                                                                    case 0: {
                                                                                        break label$29;
                                                                                    }
                                                                                    case 1:
                                                                                    case 3:
                                                                                    case 4:
                                                                                    case 6:
                                                                                    case 7:
                                                                                    case 8:
                                                                                    case 9:
                                                                                    case 10:
                                                                                    case 12:
                                                                                    case 13:
                                                                                    case 14:
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
                                                                                    case 29:
                                                                                    case 31:
                                                                                    case 32:
                                                                                    case 33:
                                                                                    case 35:
                                                                                    case 36:
                                                                                    case 38:
                                                                                    case 39:
                                                                                    case 40:
                                                                                    case 41:
                                                                                    case 42:
                                                                                    case 44:
                                                                                    case 45:
                                                                                    case 46: {
                                                                                        break label$28;
                                                                                    }
                                                                                    case 2: {
                                                                                        break label$27;
                                                                                    }
                                                                                    case 5: {
                                                                                        break label$26;
                                                                                    }
                                                                                    case 11: {
                                                                                        break label$25;
                                                                                    }
                                                                                    case 15:
                                                                                    case 34: {
                                                                                        break label$30;
                                                                                    }
                                                                                    case 17: {
                                                                                        break label$24;
                                                                                    }
                                                                                    case 28: {
                                                                                        break label$23;
                                                                                    }
                                                                                    case 30: {
                                                                                        break label$22;
                                                                                    }
                                                                                    case 37: {
                                                                                        break label$21;
                                                                                    }
                                                                                    case 43: {
                                                                                        break label$20;
                                                                                    }
                                                                                    case 47: {
                                                                                        break label$19;
                                                                                    }
                                                                                    default: {
                                                                                        break label$29;
                                                                                    }
                                                                                }
                                                                            }
                                                                            while (false);
                                                                            memcpy((_35_ + 176), (_35_ + 368), 48);
                                                                            this._storeInt8((_35_ + 218), _30_);
                                                                            this._storeLong((_35_ + 188), 4294967297L);
                                                                            computeJD((_35_ + 176));
                                                                            this._storeLong32((_35_ + 228), ((((this._loadLong((_35_ + 368))) - (this._loadLong((_35_ + 176)))) + 43200000L) / 86400000L));
                                                                            if ((this._loadInt8s(((this._loadInt((_35_ + 340))) + (this._loadInt((_35_ + 356)))))) != 87) {
                                                                                break label$18;
                                                                            }
                                                                            _32_ = this._storeInt((_35_ + 172), ((int) ((((this._loadLong((_35_ + 368))) + 43200000L) / 86400000L) % 7L)));
                                                                            _31_ = this._loadInt((_35_ + 348));
                                                                            _36_ = this._loadInt((_35_ + 352));
                                                                            this._storeInt((_35_ + 48), ((((this._loadInt((_35_ + 228))) + 7) - _32_) / 7));
                                                                            sqlite3_snprintf(3, (_31_ + _36_), 26992, (_35_ + 48));
                                                                            this._storeInt((_35_ + 352), ((this._loadInt((_35_ + 352))) + 2));
                                                                            break label$16;
                                                                        }
                                                                        while (false);
                                                                        _32_ = this._loadInt((_35_ + 348));
                                                                        _31_ = this._loadInt((_35_ + 352));
                                                                        this._storeInt((_35_ + 32), (this._loadInt((_35_ + 388))));
                                                                        sqlite3_snprintf(3, (_32_ + _31_), 26992, (_35_ + 32));
                                                                        this._storeInt((_35_ + 352), ((this._loadInt((_35_ + 352))) + 2));
                                                                        break label$16;
                                                                    }
                                                                    while (false);
                                                                    this._storeInt((_35_ + 352), ((_32_ = this._loadInt((_35_ + 352))) + 1));
                                                                    this._storeInt8((_32_ + (this._loadInt((_35_ + 348)))), 37);
                                                                    break label$16;
                                                                }
                                                                while (false);
                                                                _32_ = this._loadInt((_35_ + 348));
                                                                _31_ = this._loadInt((_35_ + 352));
                                                                this._storeDouble((_35_ + 80), (((double) (this._loadLong((_35_ + 368)))) / 8.64E7));
                                                                sqlite3_snprintf(20, (_32_ + _31_), 27040, (_35_ + 80));
                                                                this._storeInt((_35_ + 352), ((sqlite3Strlen30(((this._loadInt((_35_ + 348))) + (this._loadInt((_35_ + 352)))))) + (this._loadInt((_35_ + 352)))));
                                                                break label$16;
                                                            }
                                                            while (false);
                                                            _32_ = this._loadInt((_35_ + 348));
                                                            _31_ = this._loadInt((_35_ + 352));
                                                            this._storeInt((_35_ + 112), (this._loadInt((_35_ + 392))));
                                                            sqlite3_snprintf(3, (_32_ + _31_), 26992, (_35_ + 112));
                                                            this._storeInt((_35_ + 352), ((this._loadInt((_35_ + 352))) + 2));
                                                            break label$16;
                                                        }
                                                        while (false);
                                                        _32_ = this._loadInt((_35_ + 348));
                                                        _31_ = this._loadInt((_35_ + 352));
                                                        this._storeInt((_35_ + 144), (_truncateDoubleToSignedInteger((this._loadDouble((_35_ + 400))))));
                                                        sqlite3_snprintf(3, (_32_ + _31_), 26992, (_35_ + 144));
                                                        this._storeInt((_35_ + 352), ((this._loadInt((_35_ + 352))) + 2));
                                                        break label$16;
                                                    }
                                                    while (false);
                                                    _32_ = this._loadInt((_35_ + 348));
                                                    _31_ = this._loadInt((_35_ + 352));
                                                    this._storeInt((_35_ + 160), (this._loadInt((_35_ + 376))));
                                                    sqlite3_snprintf(5, (_32_ + _31_), 27056, (_35_ + 160));
                                                    this._storeInt((_35_ + 352), ((sqlite3Strlen30(((this._loadInt((_35_ + 348))) + (this._loadInt((_35_ + 352)))))) + (this._loadInt((_35_ + 352)))));
                                                    break label$16;
                                                }
                                                while (false);
                                                _32_ = this._loadInt((_35_ + 348));
                                                _31_ = this._loadInt((_35_ + 352));
                                                this._storeInt(_35_, (this._loadInt((_35_ + 384))));
                                                sqlite3_snprintf(3, (_32_ + _31_), 26992, _35_);
                                                this._storeInt((_35_ + 352), ((this._loadInt((_35_ + 352))) + 2));
                                                break label$16;
                                            }
                                            while (false);
                                            label$31:
                                            do {
                                                if (((((_34_ = this._storeDouble((_35_ + 232), (this._loadDouble((_35_ + 400))))) <= 59.999) ? 1 : 0) | ((_34_ != _34_) ? 1 : 0)) != 0) {
                                                    break label$31;
                                                }
                                                this._storeLong((_35_ + 232), 4633640925873330717L);
                                            }
                                            while (false);
                                            _32_ = this._loadInt((_35_ + 348));
                                            _31_ = this._loadInt((_35_ + 352));
                                            this._storeDouble((_35_ + 16), (this._loadDouble((_35_ + 232))));
                                            sqlite3_snprintf(7, (_32_ + _31_), 27008, (_35_ + 16));
                                            this._storeInt((_35_ + 352), ((sqlite3Strlen30(((this._loadInt((_35_ + 348))) + (this._loadInt((_35_ + 352)))))) + (this._loadInt((_35_ + 352)))));
                                            break label$16;
                                        }
                                        while (false);
                                        _32_ = this._loadInt((_35_ + 348));
                                        _31_ = this._loadInt((_35_ + 352));
                                        this._storeInt((_35_ + 96), (this._loadInt((_35_ + 380))));
                                        sqlite3_snprintf(3, (_32_ + _31_), 26992, (_35_ + 96));
                                        this._storeInt((_35_ + 352), ((this._loadInt((_35_ + 352))) + 2));
                                        break label$16;
                                    }
                                    while (false);
                                    _32_ = this._loadInt((_35_ + 348));
                                    _31_ = this._loadInt((_35_ + 352));
                                    this._storeLong((_35_ + 128), (((this._loadLong((_35_ + 368))) / 1000L) + -210866760000L));
                                    sqlite3_snprintf(30, (_32_ + _31_), 26448, (_35_ + 128));
                                    this._storeInt((_35_ + 352), ((sqlite3Strlen30(((this._loadInt((_35_ + 348))) + (this._loadInt((_35_ + 352)))))) + (this._loadInt((_35_ + 352)))));
                                    break label$16;
                                }
                                while (false);
                                _33_ = this._loadLong((_35_ + 368));
                                this._storeInt((_35_ + 352), ((_32_ = this._loadInt((_35_ + 352))) + 1));
                                this._storeInt8((_32_ + (this._loadInt((_35_ + 348)))), (((int) (((_33_ + 129600000L) / 86400000L) % 7L)) + 48));
                                break label$16;
                            }
                            while (false);
                            _32_ = this._loadInt((_35_ + 348));
                            _31_ = this._loadInt((_35_ + 352));
                            this._storeInt((_35_ + 64), ((this._loadInt((_35_ + 228))) + 1));
                            sqlite3_snprintf(4, (_32_ + _31_), 27024, (_35_ + 64));
                            this._storeInt((_35_ + 352), ((this._loadInt((_35_ + 352))) + 3));
                        }
                        while (false);
                        this._storeInt((_35_ + 356), ((this._loadInt((_35_ + 356))) + 1));
                        continue label$14;
                    }
                }
                while (false);
                this._storeInt8(((this._loadInt((_35_ + 348))) + (this._loadInt((_35_ + 352)))), 0);
                _temp$0 = -1;
                _temp$1 = 14;
                _temp$2 = (_32_ == (_35_ + 240)) ? _temp$0 : _temp$1;
                sqlite3_result_text((this._loadInt((_35_ + 428))), (_32_ = this._loadInt((_35_ + 348))), -1, _temp$2);
                break label$0;
            }
            while (false);
            sqlite3_result_error_nomem((this._loadInt((_35_ + 428))));
        }
        while (false);
        this._storeInt((0 + 4), (_35_ + 432));
        return;
    }

    @Override()
    public final void ctimeFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        timeFunc((this._loadInt((_33_ + 12))), 0, 0);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void ctimestampFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        datetimeFunc((this._loadInt((_33_ + 12))), 0, 0);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void cdateFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        dateFunc((this._loadInt((_33_ + 12))), 0, 0);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int isDate(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        double _35_ = 0.0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_34_ + 20), _31_);
        this._storeInt((_34_ + 16), _32_);
        memset((this._storeInt((_34_ + 12), _33_)), 0, 48);
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
                        label$4:
                        do {
                            if ((this._storeInt(_34_, (sqlite3_value_type((this._loadInt((this._loadInt((_34_ + 16))))))))) == 2) {
                                break label$4;
                            }
                            if ((this._loadInt(_34_)) != 1) {
                                break label$2;
                            }
                        }
                        while (false);
                        _35_ = sqlite3_value_double((this._loadInt((this._loadInt((_34_ + 16))))));
                        this._storeInt8(((_33_ = this._loadInt((_34_ + 12))) + 42), 1);
                        this._storeLong(_33_, (_truncateDoubleToSignedLong(((_35_ * 8.64E7) + 0.5))));
                        break label$1;
                    }
                    while (false);
                    setDateTimeToCurrent((this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 12))));
                    break label$1;
                }
                while (false);
                label$5:
                do {
                    if ((this._storeInt((_34_ + 4), (sqlite3_value_text((this._loadInt((this._loadInt((_34_ + 16))))))))) == 0) {
                        break label$5;
                    }
                    if ((parseDateOrTime((this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 4))), (this._loadInt((_34_ + 12))))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((_34_ + 28), 1);
                break label$0;
            }
            while (false);
            _33_ = this._storeInt((_34_ + 8), 1);
            label$6:
            do {
                label$8:
                do {
                    label$7:
                    while (true) {
                        if ((this._loadInt((_34_ + 8))) >= (this._loadInt((_34_ + 20)))) {
                            break label$6;
                        }
                        if ((this._storeInt((_34_ + 4), (sqlite3_value_text((this._loadInt(((this._loadInt((_34_ + 16))) + ((this._loadInt((_34_ + 8))) << 2)))))))) == 0) {
                            break label$8;
                        }
                        if ((parseModifier((this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 4))), (this._loadInt((_34_ + 12))))) != 0) {
                            break label$8;
                        }
                        this._storeInt((_34_ + 8), ((this._loadInt((_34_ + 8))) + _33_));
                        continue label$7;
                    }
                }
                while (false);
                this._storeInt((_34_ + 28), 1);
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
    public final void sqlite3_result_error_nomem(int _30_)
    {
        int _31_ = 0;
        sqlite3VdbeMemSetNull(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 8));
        this._storeInt(((_30_ = this._loadInt((_31_ + 12))) + 52), 7);
        this._storeInt8(((this._loadInt((_30_ + 8))) + 30), 1);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void computeJD(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 32) + 28), _30_)) + 42))) != 0) {
                break label$0;
            }
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt8u(((this._loadInt((_32_ + 28))) + 40))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 24), (this._loadInt(((this._loadInt((_32_ + 28))) + 8))));
                    this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 28))) + 12))));
                    this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt((_32_ + 28))) + 16))));
                    break label$1;
                }
                while (false);
                this._storeInt((_32_ + 24), 2000);
                this._storeInt((_32_ + 16), (this._storeInt((_32_ + 20), 1)));
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((_32_ + 20))) > 2) {
                    break label$3;
                }
                this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + -1));
                this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 12));
            }
            while (false);
            this._storeInt((_32_ + 8), ((2 - (_30_ = this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 24))) / 100)))) + (_30_ / 4)));
            this._storeInt((_32_ + 4), ((((this._loadInt((_32_ + 24))) * 36525) + 172251900) / 100));
            _30_ = this._storeInt(_32_, ((((this._loadInt((_32_ + 20))) * 306001) + 306001) / 10000));
            this._storeLong((_31_ = this._loadInt((_32_ + 28))), (_truncateDoubleToSignedLong(((((double) (((_30_ + (this._loadInt((_32_ + 4)))) + (this._loadInt((_32_ + 16)))) + (this._loadInt((_32_ + 8))))) + -1524.5) * 8.64E7))));
            this._storeInt8((_31_ + 42), 1);
            if ((this._loadInt8u(((this._loadInt((_32_ + 28))) + 41))) == 0) {
                break label$0;
            }
            this._storeLong((_30_ = this._loadInt((_32_ + 28))), ((this._loadLong(_30_)) + (((long) (((this._loadInt((_30_ + 20))) * 3600000) + ((this._loadInt((_30_ + 24))) * 60000))) + (_truncateDoubleToSignedLong(((this._loadDouble((_30_ + 32))) * 1000.0))))));
            if ((this._loadInt8u(((this._loadInt((_32_ + 28))) + 43))) == 0) {
                break label$0;
            }
            _31_ = this._storeInt8(((_30_ = this._loadInt((_32_ + 28))) + 40), 0);
            this._storeLong(_30_, ((this._loadLong(_30_)) - ((long) ((this._loadInt((_30_ + 28))) * 60000))));
            _30_ = this._storeInt8(((this._loadInt((_32_ + 28))) + 41), _31_);
            this._storeInt8(((this._loadInt((_32_ + 28))) + 43), _30_);
        }
        while (false);
        return;
    }

    @Override()
    public final void computeYMD_HMS(int _30_)
    {
        int _31_ = 0;
        computeYMD((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        computeHMS((this._loadInt((_31_ + 12))));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void computeYMD(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 32) + 28), _30_)) + 40))) != 0) {
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
                            if ((this._loadInt8u(((this._loadInt((_31_ + 28))) + 42))) == 0) {
                                break label$4;
                            }
                            this._storeLong32((_31_ + 24), (((this._loadLong((this._loadInt((_31_ + 28))))) + 43200000L) / 86400000L));
                            this._storeInt((_31_ + 20), ((((_30_ = this._storeInt((_31_ + 20), (_truncateDoubleToSignedInteger(((((double) (this._loadInt((_31_ + 24)))) + -1867216.25) / 36524.25))))) + (this._loadInt((_31_ + 24)))) + 1) - (_30_ / 4)));
                            _30_ = this._storeInt((_31_ + 8), (((this._storeInt((_31_ + 12), (_truncateDoubleToSignedInteger(((((double) (this._storeInt((_31_ + 16), ((this._loadInt((_31_ + 20))) + 1524)))) + -122.1) / 365.25))))) * 36525) / 100));
                            _30_ = this._storeInt(_31_, (_truncateDoubleToSignedInteger((((double) (this._storeInt((_31_ + 4), (_truncateDoubleToSignedInteger((((double) ((this._loadInt((_31_ + 16))) - _30_)) / 30.6001)))))) * 30.6001))));
                            this._storeInt(((this._loadInt((_31_ + 28))) + 16), (((this._loadInt((_31_ + 16))) - (this._loadInt((_31_ + 8)))) - _30_));
                            if ((this._loadInt((_31_ + 4))) > 13) {
                                break label$3;
                            }
                            _30_ = (this._loadInt((_31_ + 4))) + -1;
                            break label$2;
                        }
                        while (false);
                        this._storeLong(((_30_ = this._loadInt((_31_ + 28))) + 8), 4294969296L);
                        this._storeInt((_30_ + 16), 1);
                        break label$1;
                    }
                    while (false);
                    _30_ = (this._loadInt((_31_ + 4))) + -13;
                }
                while (false);
                label$5:
                do {
                    label$6:
                    do {
                        if ((this._storeInt(((this._loadInt((_31_ + 28))) + 12), _30_)) < 3) {
                            break label$6;
                        }
                        _30_ = (this._loadInt((_31_ + 12))) + -4716;
                        break label$5;
                    }
                    while (false);
                    _30_ = (this._loadInt((_31_ + 12))) + -4715;
                }
                while (false);
                this._storeInt(((this._loadInt((_31_ + 28))) + 8), _30_);
            }
            while (false);
            this._storeInt8(((this._loadInt((_31_ + 28))) + 40), 1);
        }
        while (false);
        return;
    }

    @Override()
    public final void computeHMS(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        int _33_ = 0;
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 41))) != 0) {
                break label$0;
            }
            computeJD((this._loadInt((_33_ + 12))));
            _30_ = this._storeInt((_33_ + 8), ((int) (((this._loadLong((this._loadInt((_33_ + 12))))) + 43200000L) % 86400000L)));
            this._storeDouble(((_31_ = this._loadInt((_33_ + 12))) + 32), (((double) _30_) / 1000.0));
            _30_ = this._storeInt((_33_ + 8), (_truncateDoubleToSignedInteger((this._loadDouble((_31_ + 32))))));
            this._storeDouble(((_31_ = this._loadInt((_33_ + 12))) + 32), ((this._loadDouble((_31_ + 32))) - ((double) _30_)));
            this._storeInt(((this._loadInt((_33_ + 12))) + 20), ((this._loadInt((_33_ + 8))) / 3600));
            _31_ = this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) - ((this._loadInt(((this._loadInt((_33_ + 12))) + 20))) * 3600)));
            _32_ = this._storeInt(((_30_ = this._loadInt((_33_ + 12))) + 24), (_31_ / 60));
            this._storeDouble((_30_ + 32), ((this._loadDouble((_30_ + 32))) + ((double) (_31_ - (_32_ * 60)))));
            this._storeInt8((_30_ + 41), 1);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void setDateTimeToCurrent(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        sqlite3OsCurrentTimeInt64((this._loadInt((this._storeInt((_32_ + 4), (sqlite3_context_db_handle((this._loadInt((_32_ + 12))))))))), (this._loadInt((_32_ + 8))));
        this._storeInt8(((this._loadInt((_32_ + 8))) + 42), 1);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int sqlite3_value_type(int _30_)
    {
        return (this._loadInt8u(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 30)));
    }

    @Override()
    public final double sqlite3_value_double(int _30_)
    {
        int _31_ = 0;
        double _32_ = 0.0;
        _32_ = sqlite3VdbeRealValue((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return _32_;
    }

    @Override()
    public final int parseDateOrTime(int _30_, int _31_, int _32_)
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
                    label$3:
                    do {
                        label$4:
                        do {
                            if ((parseYyyyMmDd((this._loadInt((_33_ + 20))), _32_)) == 0) {
                                break label$4;
                            }
                            if ((parseHhMmSs((this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))))) == 0) {
                                break label$3;
                            }
                            if ((sqlite3StrICmp((this._loadInt((_33_ + 20))), 27280)) == 0) {
                                break label$2;
                            }
                            if ((sqlite3AtoF((_32_ = this._loadInt((_33_ + 20))), (_33_ + 8), (sqlite3Strlen30(_32_)), 1)) == 0) {
                                break label$1;
                            }
                            this._storeLong((_32_ = this._loadInt((_33_ + 16))), (_truncateDoubleToSignedLong((((this._loadDouble((_33_ + 8))) * 8.64E7) + 0.5))));
                            this._storeInt8((_32_ + 42), 1);
                            this._storeInt((_33_ + 28), 0);
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_33_ + 28), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_33_ + 28), 0);
                    break label$0;
                }
                while (false);
                setDateTimeToCurrent((this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 16))));
                this._storeInt((_33_ + 28), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 28), 1);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int parseModifier(int _30_, int _31_, int _32_)
    {
        long _33_ = 0L;
        int _34_ = 0;
        double _35_ = 0.0;
        long _36_ = 0L;
        double _temp$0 = 0.0;
        double _temp$1 = 0.0;
        double _temp$2 = 0.0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 192))) + 188), _30_);
        this._storeInt((_34_ + 184), _31_);
        this._storeInt((_34_ + 180), _32_);
        _31_ = this._storeInt((_34_ + 176), 1);
        this._storeInt((_34_ + 156), (_34_ + 112));
        _30_ = this._storeInt((_34_ + 172), 0);
        label$1:
        do {
            label$0:
            while (true) {
                _32_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_34_ + 172))) > 28) {
                        break label$2;
                    }
                    _32_ = ((this._loadInt8s(((this._loadInt((_34_ + 184))) + (this._loadInt((_34_ + 172)))))) != _30_) ? 1 : 0;
                }
                while (false);
                if (_32_ == 0) {
                    break label$1;
                }
                this._storeInt8(((this._loadInt((_34_ + 156))) + (_32_ = this._loadInt((_34_ + 172)))), (this._loadInt8u(((this._loadInt8u(((this._loadInt((_34_ + 184))) + _32_))) + 19872))));
                this._storeInt((_34_ + 172), ((this._loadInt((_34_ + 172))) + _31_));
                continue label$0;
            }
        }
        while (false);
        this._storeInt8(((this._loadInt((_34_ + 156))) + (this._loadInt((_34_ + 172)))), 0);
        label$3:
        do {
            if (((_32_ = (this._loadInt8s((this._loadInt((_34_ + 156))))) + -43) & 4294967295L) > (76 & 4294967295L)) {
                break label$3;
            }
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
                                                                                    switch (_32_) {
                                                                                        case 0:
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
                                                                                        case 14: {
                                                                                            break label$21;
                                                                                        }
                                                                                        case 1:
                                                                                        case 3:
                                                                                        case 4:
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
                                                                                        case 49:
                                                                                        case 50:
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
                                                                                        case 66:
                                                                                        case 67:
                                                                                        case 68:
                                                                                        case 69:
                                                                                        case 70:
                                                                                        case 71:
                                                                                        case 73:
                                                                                        case 75: {
                                                                                            break label$3;
                                                                                        }
                                                                                        case 65: {
                                                                                            break label$20;
                                                                                        }
                                                                                        case 72: {
                                                                                            break label$19;
                                                                                        }
                                                                                        case 74: {
                                                                                            break label$18;
                                                                                        }
                                                                                        case 76: {
                                                                                            break label$17;
                                                                                        }
                                                                                        default: {
                                                                                            break label$21;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                while (false);
                                                                                _31_ = this._storeInt((_34_ + 172), 1);
                                                                                label$23:
                                                                                do {
                                                                                    label$22:
                                                                                    while (true) {
                                                                                        _32_ = 0;
                                                                                        label$24:
                                                                                        do {
                                                                                            if ((this._loadInt8s(((this._loadInt((_34_ + 156))) + (this._loadInt((_34_ + 172)))))) == 0) {
                                                                                                break label$24;
                                                                                            }
                                                                                            if ((this._loadInt8s(((this._loadInt((_34_ + 156))) + (this._loadInt((_34_ + 172)))))) == 58) {
                                                                                                break label$24;
                                                                                            }
                                                                                            _32_ = (((this._loadInt8u(((this._loadInt8u(((this._loadInt((_34_ + 156))) + (this._loadInt((_34_ + 172)))))) + 21776))) & _31_) == 0) ? 1 : 0;
                                                                                        }
                                                                                        while (false);
                                                                                        if (_32_ == 0) {
                                                                                            break label$23;
                                                                                        }
                                                                                        this._storeInt((_34_ + 172), ((this._loadInt((_34_ + 172))) + _31_));
                                                                                        continue label$22;
                                                                                    }
                                                                                }
                                                                                while (false);
                                                                                label$25:
                                                                                do {
                                                                                    label$26:
                                                                                    do {
                                                                                        if ((sqlite3AtoF((this._loadInt((_34_ + 156))), (_34_ + 160), (this._loadInt((_34_ + 172))), 1)) == 0) {
                                                                                            break label$26;
                                                                                        }
                                                                                        if ((this._loadInt8s(((this._loadInt((_34_ + 156))) + (this._loadInt((_34_ + 172)))))) != 58) {
                                                                                            break label$25;
                                                                                        }
                                                                                        label$27:
                                                                                        do {
                                                                                            if (((this._loadInt8u(((this._loadInt8u((this._storeInt((_34_ + 84), (this._loadInt((_34_ + 156))))))) + 21776))) & 4) != 0) {
                                                                                                break label$27;
                                                                                            }
                                                                                            this._storeInt((_34_ + 84), ((this._loadInt((_34_ + 84))) + 1));
                                                                                        }
                                                                                        while (false);
                                                                                        memset((_34_ + 32), 0, 48);
                                                                                        if ((parseHhMmSs((this._loadInt((_34_ + 84))), (_34_ + 32))) != 0) {
                                                                                            break label$3;
                                                                                        }
                                                                                        computeJD((_34_ + 32));
                                                                                        _33_ = this._storeLong((_34_ + 24), ((this._storeLong((_34_ + 32), ((this._loadLong((_34_ + 32))) + -43200000L))) / 86400000L));
                                                                                        this._storeLong((_34_ + 32), ((this._loadLong((_34_ + 32))) - (_33_ * 86400000L)));
                                                                                        label$28:
                                                                                        do {
                                                                                            if ((this._loadInt8s((this._loadInt((_34_ + 156))))) != 45) {
                                                                                                break label$28;
                                                                                            }
                                                                                            this._storeLong((_34_ + 32), (0L - (this._loadLong((_34_ + 32)))));
                                                                                        }
                                                                                        while (false);
                                                                                        computeJD((this._loadInt((_34_ + 180))));
                                                                                        clearYMD_HMS_TZ((this._loadInt((_34_ + 180))));
                                                                                        this._storeLong((_32_ = this._loadInt((_34_ + 180))), ((this._loadLong(_32_)) + (this._loadLong((_34_ + 32)))));
                                                                                        this._storeInt((_34_ + 176), 0);
                                                                                        break label$3;
                                                                                    }
                                                                                    while (false);
                                                                                    this._storeInt((_34_ + 176), 1);
                                                                                    break label$3;
                                                                                }
                                                                                while (false);
                                                                                this._storeInt((_34_ + 156), ((this._loadInt((_34_ + 156))) + (this._loadInt((_34_ + 172)))));
                                                                                label$30:
                                                                                do {
                                                                                    label$29:
                                                                                    while (true) {
                                                                                        if (((this._loadInt8u(((this._loadInt8u((this._loadInt((_34_ + 156))))) + 21776))) & 1) == 0) {
                                                                                            break label$30;
                                                                                        }
                                                                                        this._storeInt((_34_ + 156), ((this._loadInt((_34_ + 156))) + 1));
                                                                                        continue label$29;
                                                                                    }
                                                                                }
                                                                                while (false);
                                                                                if ((this._storeInt((_34_ + 172), (sqlite3Strlen30((this._loadInt((_34_ + 156))))))) > 10) {
                                                                                    break label$3;
                                                                                }
                                                                                if ((this._loadInt((_34_ + 172))) < 3) {
                                                                                    break label$3;
                                                                                }
                                                                                label$31:
                                                                                do {
                                                                                    if ((this._loadInt8s((((this._loadInt((_34_ + 156))) + (this._loadInt((_34_ + 172)))) + -1))) != 115) {
                                                                                        break label$31;
                                                                                    }
                                                                                    this._storeInt8((((this._loadInt((_34_ + 156))) + (this._loadInt((_34_ + 172)))) + -1), 0);
                                                                                    this._storeInt((_34_ + 172), ((this._loadInt((_34_ + 172))) + -1));
                                                                                }
                                                                                while (false);
                                                                                computeJD((this._loadInt((_34_ + 180))));
                                                                                this._storeInt((_34_ + 176), 0);
                                                                                _temp$0 = -0.5;
                                                                                _temp$1 = 0.5;
                                                                                _temp$2 = ((this._loadDouble((_34_ + 160))) < 0.0) ? _temp$0 : _temp$1;
                                                                                this._storeDouble((_34_ + 88), _temp$2);
                                                                                label$32:
                                                                                do {
                                                                                    if ((this._loadInt((_34_ + 172))) != 3) {
                                                                                        break label$32;
                                                                                    }
                                                                                    if ((strcmp((this._loadInt((_34_ + 156))), 27184)) == 0) {
                                                                                        break label$15;
                                                                                    }
                                                                                }
                                                                                while (false);
                                                                                label$33:
                                                                                do {
                                                                                    if ((this._loadInt((_34_ + 172))) != 4) {
                                                                                        break label$33;
                                                                                    }
                                                                                    if ((strcmp((this._loadInt((_34_ + 156))), 27200)) == 0) {
                                                                                        break label$14;
                                                                                    }
                                                                                }
                                                                                while (false);
                                                                                label$34:
                                                                                do {
                                                                                    if ((this._loadInt((_34_ + 172))) != 6) {
                                                                                        break label$34;
                                                                                    }
                                                                                    if ((strcmp((this._loadInt((_34_ + 156))), 27216)) == 0) {
                                                                                        break label$12;
                                                                                    }
                                                                                }
                                                                                while (false);
                                                                                label$35:
                                                                                do {
                                                                                    if ((this._loadInt((_34_ + 172))) != 6) {
                                                                                        break label$35;
                                                                                    }
                                                                                    if ((strcmp((this._loadInt((_34_ + 156))), 27232)) == 0) {
                                                                                        break label$11;
                                                                                    }
                                                                                }
                                                                                while (false);
                                                                                label$36:
                                                                                do {
                                                                                    if ((this._loadInt((_34_ + 172))) != 5) {
                                                                                        break label$36;
                                                                                    }
                                                                                    if ((strcmp((this._loadInt((_34_ + 156))), 27152)) == 0) {
                                                                                        break label$9;
                                                                                    }
                                                                                }
                                                                                while (false);
                                                                                label$37:
                                                                                do {
                                                                                    if ((this._loadInt((_34_ + 172))) != 4) {
                                                                                        break label$37;
                                                                                    }
                                                                                    if ((strcmp((this._loadInt((_34_ + 156))), 27168)) == 0) {
                                                                                        break label$8;
                                                                                    }
                                                                                }
                                                                                while (false);
                                                                                this._storeInt((_34_ + 176), 1);
                                                                                break label$5;
                                                                            }
                                                                            while (false);
                                                                            if ((strcmp((this._loadInt((_34_ + 156))), 27072)) != 0) {
                                                                                break label$3;
                                                                            }
                                                                            computeJD((this._loadInt((_34_ + 180))));
                                                                            _33_ = localtimeOffset((this._loadInt((_34_ + 180))), (this._loadInt((_34_ + 188))), (_34_ + 176));
                                                                            this._storeLong((_32_ = this._loadInt((_34_ + 180))), (_33_ + (this._loadLong(_32_))));
                                                                            clearYMD_HMS_TZ(_32_);
                                                                            break label$3;
                                                                        }
                                                                        while (false);
                                                                        if ((strncmp((this._loadInt((_34_ + 156))), 27136, 9)) != 0) {
                                                                            break label$3;
                                                                        }
                                                                        this._storeInt((_34_ + 156), ((this._loadInt((_34_ + 156))) + 9));
                                                                        computeYMD((this._loadInt((_34_ + 180))));
                                                                        _33_ = this._storeLong(((_32_ = this._loadInt((_34_ + 180))) + 32), 0L);
                                                                        _31_ = this._storeInt8((_32_ + 41), 1);
                                                                        this._storeLong((_32_ + 20), _33_);
                                                                        _32_ = this._storeInt8((_32_ + 43), 0);
                                                                        this._storeInt8(((this._loadInt((_34_ + 180))) + 42), _32_);
                                                                        if ((strcmp((this._loadInt((_34_ + 156))), 27152)) == 0) {
                                                                            break label$13;
                                                                        }
                                                                        if ((strcmp((this._loadInt((_34_ + 156))), 27168)) == 0) {
                                                                            break label$10;
                                                                        }
                                                                        if ((strcmp((this._loadInt((_34_ + 156))), 27184)) != 0) {
                                                                            break label$3;
                                                                        }
                                                                        this._storeInt((_34_ + 176), 0);
                                                                        break label$3;
                                                                    }
                                                                    while (false);
                                                                    if ((strcmp((this._loadInt((_34_ + 156))), 27088)) == 0) {
                                                                        break label$16;
                                                                    }
                                                                    break label$4;
                                                                }
                                                                while (false);
                                                                if ((strncmp((this._loadInt((_34_ + 156))), 27120, 8)) != 0) {
                                                                    break label$3;
                                                                }
                                                                if ((sqlite3AtoF((_32_ = (this._loadInt((_34_ + 156))) + 8), (_34_ + 160), (sqlite3Strlen30(_32_)), 1)) == 0) {
                                                                    break label$3;
                                                                }
                                                                if (((double) (this._storeInt((_34_ + 172), (_truncateDoubleToSignedInteger((this._loadDouble((_34_ + 160)))))))) != (this._loadDouble((_34_ + 160)))) {
                                                                    break label$3;
                                                                }
                                                                if ((this._loadInt((_34_ + 172))) < 0) {
                                                                    break label$3;
                                                                }
                                                                if (((((_35_ = this._loadDouble((_34_ + 160))) >= 7.0) ? 1 : 0) | ((_35_ != _35_) ? 1 : 0)) != 0) {
                                                                    break label$3;
                                                                }
                                                                computeYMD_HMS((this._loadInt((_34_ + 180))));
                                                                _31_ = this._storeInt16(((_32_ = this._loadInt((_34_ + 180))) + 42), 0);
                                                                computeJD(_32_);
                                                                label$38:
                                                                do {
                                                                    if ((this._storeLong((_34_ + 96), ((((this._loadLong((this._loadInt((_34_ + 180))))) + 129600000L) / 86400000L) % 7L))) <= (this._loadLong32s((_34_ + 172)))) {
                                                                        break label$38;
                                                                    }
                                                                    this._storeLong((_34_ + 96), ((this._loadLong((_34_ + 96))) + -7L));
                                                                }
                                                                while (false);
                                                                this._storeLong((_32_ = this._loadInt((_34_ + 180))), ((this._loadLong(_32_)) + (((this._loadLong32s((_34_ + 172))) - (this._loadLong((_34_ + 96)))) * 86400000L)));
                                                                clearYMD_HMS_TZ(_32_);
                                                                this._storeInt((_34_ + 176), _31_);
                                                                break label$3;
                                                            }
                                                            while (false);
                                                            if ((this._loadInt8s(((this._loadInt((_34_ + 180))) + 42))) == 0) {
                                                                break label$4;
                                                            }
                                                            this._storeLong((_32_ = this._loadInt((_34_ + 180))), ((((this._loadLong(_32_)) + 43200L) / 86400L) + 210866760000000L));
                                                            clearYMD_HMS_TZ(_32_);
                                                            this._storeInt((_34_ + 176), 0);
                                                            break label$3;
                                                        }
                                                        while (false);
                                                        this._storeLong((_32_ = this._loadInt((_34_ + 180))), ((this._loadLong(_32_)) + (_truncateDoubleToSignedLong((((this._loadDouble((_34_ + 160))) * 8.64E7) + (this._loadDouble((_34_ + 88))))))));
                                                        break label$5;
                                                    }
                                                    while (false);
                                                    this._storeLong((_32_ = this._loadInt((_34_ + 180))), ((this._loadLong(_32_)) + (_truncateDoubleToSignedLong((((this._loadDouble((_34_ + 160))) * 3600000.0) + (this._loadDouble((_34_ + 88))))))));
                                                    break label$5;
                                                }
                                                while (false);
                                                this._storeInt(((this._loadInt((_34_ + 180))) + 16), _31_);
                                                this._storeInt((_34_ + 176), _32_);
                                                break label$3;
                                            }
                                            while (false);
                                            this._storeLong((_32_ = this._loadInt((_34_ + 180))), ((this._loadLong(_32_)) + (_truncateDoubleToSignedLong((((this._loadDouble((_34_ + 160))) * 60000.0) + (this._loadDouble((_34_ + 88))))))));
                                            break label$5;
                                        }
                                        while (false);
                                        this._storeLong((_32_ = this._loadInt((_34_ + 180))), ((this._loadLong(_32_)) + (_truncateDoubleToSignedLong((((this._loadDouble((_34_ + 160))) * 1000.0) + (this._loadDouble((_34_ + 88))))))));
                                        break label$5;
                                    }
                                    while (false);
                                    computeYMD((this._loadInt((_34_ + 180))));
                                    this._storeLong(((this._loadInt((_34_ + 180))) + 12), 4294967297L);
                                    this._storeInt((_34_ + 176), 0);
                                    break label$3;
                                }
                                while (false);
                                computeYMD_HMS((this._loadInt((_34_ + 180))));
                                this._storeInt(((_32_ = this._loadInt((_34_ + 180))) + 12), ((this._loadInt((_32_ + 12))) + (_truncateDoubleToSignedInteger((this._loadDouble((_34_ + 160)))))));
                                if ((this._loadInt((_32_ + 12))) < 1) {
                                    break label$7;
                                }
                                _32_ = ((this._loadInt(((this._loadInt((_34_ + 180))) + 12))) + -1) / 12;
                                break label$6;
                            }
                            while (false);
                            this._storeInt((_34_ + 12), (_truncateDoubleToSignedInteger((this._loadDouble((_34_ + 160))))));
                            computeYMD_HMS((this._loadInt((_34_ + 180))));
                            this._storeInt8(((_32_ = this._loadInt((_34_ + 180))) + 42), 0);
                            this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) + (this._loadInt((_34_ + 12)))));
                            computeJD(_32_);
                            if (((double) (this._loadInt((_34_ + 12)))) == (this._loadDouble((_34_ + 160)))) {
                                break label$5;
                            }
                            this._storeLong((_32_ = this._loadInt((_34_ + 180))), ((this._loadLong(_32_)) + (_truncateDoubleToSignedLong((((((this._loadDouble((_34_ + 160))) - ((double) (this._loadInt((_34_ + 12))))) * 365.0) * 8.64E7) + (this._loadDouble((_34_ + 88))))))));
                            break label$5;
                        }
                        while (false);
                        _32_ = ((this._loadInt(((this._loadInt((_34_ + 180))) + 12))) + -12) / 12;
                    }
                    while (false);
                    _31_ = this._storeInt((_34_ + 20), _32_);
                    this._storeInt(((_32_ = this._loadInt((_34_ + 180))) + 8), (_31_ + (this._loadInt((_32_ + 8)))));
                    this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) - (_31_ * 12)));
                    this._storeInt8(((this._loadInt((_34_ + 180))) + 42), 0);
                    computeJD((this._loadInt((_34_ + 180))));
                    if (((double) (this._storeInt((_34_ + 16), (_truncateDoubleToSignedInteger((this._loadDouble((_34_ + 160)))))))) == (this._loadDouble((_34_ + 160)))) {
                        break label$5;
                    }
                    this._storeLong((_32_ = this._loadInt((_34_ + 180))), ((this._loadLong(_32_)) + (_truncateDoubleToSignedLong((((((this._loadDouble((_34_ + 160))) - ((double) (this._loadInt((_34_ + 16))))) * 30.0) * 8.64E7) + (this._loadDouble((_34_ + 88))))))));
                }
                while (false);
                clearYMD_HMS_TZ((this._loadInt((_34_ + 180))));
                break label$3;
            }
            while (false);
            if ((strcmp((this._loadInt((_34_ + 156))), 27104)) != 0) {
                break label$3;
            }
            computeJD((this._loadInt((_34_ + 180))));
            this._storeLong((_34_ + 104), (localtimeOffset((this._loadInt((_34_ + 180))), (this._loadInt((_34_ + 188))), (_34_ + 176))));
            if ((this._loadInt((_34_ + 176))) != 0) {
                break label$3;
            }
            this._storeLong((_32_ = this._loadInt((_34_ + 180))), ((this._loadLong(_32_)) - (this._loadLong((_34_ + 104)))));
            clearYMD_HMS_TZ(_32_);
            _33_ = this._loadLong((_34_ + 104));
            _36_ = localtimeOffset((this._loadInt((_34_ + 180))), (this._loadInt((_34_ + 188))), (_34_ + 176));
            this._storeLong((_32_ = this._loadInt((_34_ + 180))), ((this._loadLong(_32_)) + (_33_ - _36_)));
        }
        while (false);
        _32_ = this._loadInt((_34_ + 176));
        this._storeInt((0 + 4), (_34_ + 192));
        return _32_;
    }

    @Override()
    public final long localtimeOffset(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 176))) + 164), _30_);
        this._storeInt((_33_ + 160), _31_);
        this._storeInt((_33_ + 156), _32_);
        memset((_33_ + 8), 0, 44);
        memcpy((_33_ + 104), (this._loadInt((_33_ + 164))), 48);
        computeYMD_HMS((_33_ + 104));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_33_ + 112))) < 1971) {
                        break label$2;
                    }
                    if ((this._loadInt((_33_ + 112))) < 2038) {
                        break label$1;
                    }
                }
                while (false);
                this._storeLong((_33_ + 112), 4294969296L);
                this._storeLong((_33_ + 120), 1L);
                this._storeInt((_33_ + 128), 0);
                this._storeLong((_33_ + 136), 0L);
                break label$0;
            }
            while (false);
            this._storeDouble((_33_ + 136), ((double) (this._storeInt((_33_ + 4), (_truncateDoubleToSignedInteger(((this._loadDouble((_33_ + 136))) + 0.5)))))));
        }
        while (false);
        _32_ = this._storeInt((_33_ + 132), (this._storeInt8((_33_ + 146), 0)));
        computeJD((_33_ + 104));
        this._storeLong32((_33_ + 52), (((this._loadLong((_33_ + 104))) / 1000L) + -210866760000L));
        label$3:
        do {
            label$4:
            do {
                if ((osLocaltime((_33_ + 52), (_33_ + 8))) == 0) {
                    break label$4;
                }
                sqlite3_result_error((this._loadInt((_33_ + 160))), 27248, -1);
                this._storeInt((this._loadInt((_33_ + 156))), 1);
                this._storeLong((_33_ + 168), 0L);
                break label$3;
            }
            while (false);
            this._storeInt((_33_ + 68), ((this._loadInt((_33_ + 24))) + 1));
            this._storeInt((_33_ + 64), ((this._loadInt((_33_ + 28))) + 1900));
            this._storeInt((_33_ + 72), (this._loadInt((_33_ + 20))));
            this._storeInt((_33_ + 76), (this._loadInt((_33_ + 16))));
            this._storeInt((_33_ + 80), (this._loadInt((_33_ + 12))));
            this._storeDouble((_33_ + 88), ((double) (this._loadInt((_33_ + 8)))));
            this._storeInt8((_33_ + 97), (this._storeInt8((_33_ + 96), 1)));
            _32_ = this._storeInt8((_33_ + 99), (this._storeInt8((_33_ + 98), _32_)));
            computeJD((_33_ + 56));
            this._storeInt((this._loadInt((_33_ + 156))), _32_);
            this._storeLong((_33_ + 168), ((this._loadLong((_33_ + 56))) - (this._loadLong((_33_ + 104)))));
        }
        while (false);
        _34_ = this._loadLong((_33_ + 168));
        this._storeInt((0 + 4), (_33_ + 176));
        return _34_;
    }

    @Override()
    public final void clearYMD_HMS_TZ(int _30_)
    {
        int _31_ = 0;
        _31_ = this._loadInt((0 + 4));
        this._storeInt8((_30_ + 43), (this._storeInt16((_30_ + 40), 0)));
        this._storeInt(((_31_ - 16) + 12), _30_);
        return;
    }

    @Override()
    public final int sqlite3AtoF(int _30_, int _31_, int _32_, int _33_)
    {
        long _34_ = 0L;
        int _35_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        double _temp$3 = 0.0;
        double _temp$4 = 0.0;
        double _temp$5 = 0.0;
        this._storeInt(((_35_ = (this._loadInt((0 + 4))) - 80) + 72), _30_);
        this._storeInt((_35_ + 68), _31_);
        this._storeInt((_35_ + 64), _32_);
        _temp$0 = 1;
        _temp$1 = 2;
        _temp$2 = ((this._storeInt8((_35_ + 63), _33_)) == 1) ? _temp$0 : _temp$1;
        this._storeInt((_35_ + 56), _temp$2);
        this._storeInt((_35_ + 52), ((this._loadInt((_35_ + 72))) + (this._loadInt((_35_ + 64)))));
        _33_ = this._storeInt((_35_ + 48), 1);
        _34_ = this._storeLong((_35_ + 40), 0L);
        _32_ = this._storeInt((_35_ + 36), 0);
        this._storeInt((_35_ + 32), _33_);
        _31_ = this._storeInt((_35_ + 28), _32_);
        _32_ = this._storeInt((_35_ + 24), _33_);
        this._storeInt((_35_ + 12), _31_);
        this._storeLong((this._loadInt((_35_ + 68))), _34_);
        label$0:
        do {
            if ((this._loadInt8u((_35_ + 63))) != 3) {
                break label$0;
            }
            this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + _32_));
        }
        while (false);
        label$2:
        do {
            label$1:
            while (true) {
                _33_ = 0;
                label$3:
                do {
                    if (((this._loadInt((_35_ + 72))) & 4294967295L) >= ((this._loadInt((_35_ + 52))) & 4294967295L)) {
                        break label$3;
                    }
                    _33_ = (this._loadInt8u(((this._loadInt8u((this._loadInt((_35_ + 72))))) + 21776))) & _32_;
                }
                while (false);
                if (_33_ == 0) {
                    break label$2;
                }
                this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + (this._loadInt((_35_ + 56)))));
                continue label$1;
            }
        }
        while (false);
        label$4:
        do {
            if (((this._loadInt((_35_ + 72))) & 4294967295L) < ((this._loadInt((_35_ + 52))) & 4294967295L)) {
                break label$4;
            }
            this._storeInt((_35_ + 76), 0);
            return (this._loadInt((_35_ + 76)));
        }
        while (false);
        label$5:
        do {
            label$6:
            do {
                if ((this._loadInt8s((this._loadInt((_35_ + 72))))) != 45) {
                    break label$6;
                }
                this._storeInt((_35_ + 48), -1);
                this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + (this._loadInt((_35_ + 56)))));
                break label$5;
            }
            while (false);
            if ((this._loadInt8s((this._loadInt((_35_ + 72))))) != 43) {
                break label$5;
            }
            this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + (this._loadInt((_35_ + 56)))));
        }
        while (false);
        label$8:
        do {
            label$7:
            while (true) {
                _33_ = 0;
                label$9:
                do {
                    if (((this._loadInt((_35_ + 72))) & 4294967295L) >= ((this._loadInt((_35_ + 52))) & 4294967295L)) {
                        break label$9;
                    }
                    _33_ = ((this._loadInt8s((this._loadInt((_35_ + 72))))) == 48) ? 1 : 0;
                }
                while (false);
                if (_33_ == 0) {
                    break label$8;
                }
                this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + (this._loadInt((_35_ + 56)))));
                this._storeInt((_35_ + 12), ((this._loadInt((_35_ + 12))) + 1));
                continue label$7;
            }
        }
        while (false);
        label$11:
        do {
            label$10:
            while (true) {
                _33_ = 0;
                label$12:
                do {
                    if (((this._loadInt((_35_ + 72))) & 4294967295L) >= ((this._loadInt((_35_ + 52))) & 4294967295L)) {
                        break label$12;
                    }
                    if (((this._loadInt8u(((this._loadInt8u((this._loadInt((_35_ + 72))))) + 21776))) & 4) == 0) {
                        break label$12;
                    }
                    _33_ = ((this._loadLong((_35_ + 40))) < 922337203685477579L) ? 1 : 0;
                }
                while (false);
                if (_33_ == 0) {
                    break label$11;
                }
                this._storeLong((_35_ + 40), (((this._loadLong((_35_ + 40))) * 10L) + ((long) ((this._loadInt8s((this._loadInt((_35_ + 72))))) + -48))));
                this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + (this._loadInt((_35_ + 56)))));
                this._storeInt((_35_ + 12), ((this._loadInt((_35_ + 12))) + 1));
                continue label$10;
            }
        }
        while (false);
        label$14:
        do {
            label$13:
            while (true) {
                _33_ = 0;
                label$15:
                do {
                    if (((this._loadInt((_35_ + 72))) & 4294967295L) >= ((this._loadInt((_35_ + 52))) & 4294967295L)) {
                        break label$15;
                    }
                    _33_ = ((this._loadInt8u(((this._loadInt8u((this._loadInt((_35_ + 72))))) + 21776))) & 4) >>> 2;
                }
                while (false);
                if (_33_ == 0) {
                    break label$14;
                }
                this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + (this._loadInt((_35_ + 56)))));
                this._storeInt((_35_ + 12), ((this._loadInt((_35_ + 12))) + 1));
                this._storeInt((_35_ + 36), ((this._loadInt((_35_ + 36))) + 1));
                continue label$13;
            }
        }
        while (false);
        label$16:
        do {
            if (((this._loadInt((_35_ + 72))) & 4294967295L) >= ((this._loadInt((_35_ + 52))) & 4294967295L)) {
                break label$16;
            }
            label$17:
            do {
                if ((this._loadInt8s((this._loadInt((_35_ + 72))))) != 46) {
                    break label$17;
                }
                this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + (this._loadInt((_35_ + 56)))));
                label$19:
                do {
                    label$18:
                    while (true) {
                        _33_ = 0;
                        label$20:
                        do {
                            if (((this._loadInt((_35_ + 72))) & 4294967295L) >= ((this._loadInt((_35_ + 52))) & 4294967295L)) {
                                break label$20;
                            }
                            if (((this._loadInt8u(((this._loadInt8u((this._loadInt((_35_ + 72))))) + 21776))) & 4) == 0) {
                                break label$20;
                            }
                            _33_ = ((this._loadLong((_35_ + 40))) < 922337203685477579L) ? 1 : 0;
                        }
                        while (false);
                        if (_33_ == 0) {
                            break label$19;
                        }
                        this._storeLong((_35_ + 40), (((this._loadLong((_35_ + 40))) * 10L) + ((long) ((this._loadInt8s((this._loadInt((_35_ + 72))))) + -48))));
                        this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + (this._loadInt((_35_ + 56)))));
                        this._storeInt((_35_ + 12), ((this._loadInt((_35_ + 12))) + 1));
                        this._storeInt((_35_ + 36), ((this._loadInt((_35_ + 36))) + -1));
                        continue label$18;
                    }
                }
                while (false);
                label$22:
                do {
                    label$21:
                    while (true) {
                        _33_ = 0;
                        label$23:
                        do {
                            if (((this._loadInt((_35_ + 72))) & 4294967295L) >= ((this._loadInt((_35_ + 52))) & 4294967295L)) {
                                break label$23;
                            }
                            _33_ = ((this._loadInt8u(((this._loadInt8u((this._loadInt((_35_ + 72))))) + 21776))) & 4) >>> 2;
                        }
                        while (false);
                        if (_33_ == 0) {
                            break label$22;
                        }
                        this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + (this._loadInt((_35_ + 56)))));
                        this._storeInt((_35_ + 12), ((this._loadInt((_35_ + 12))) + 1));
                        continue label$21;
                    }
                }
                while (false);
            }
            while (false);
            if (((this._loadInt((_35_ + 72))) & 4294967295L) >= ((this._loadInt((_35_ + 52))) & 4294967295L)) {
                break label$16;
            }
            label$24:
            do {
                label$25:
                do {
                    if ((this._loadInt8s((this._loadInt((_35_ + 72))))) == 101) {
                        break label$25;
                    }
                    if ((this._loadInt8s((this._loadInt((_35_ + 72))))) != 69) {
                        break label$24;
                    }
                }
                while (false);
                this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + (this._loadInt((_35_ + 56)))));
                this._storeInt((_35_ + 24), 0);
                if (((this._loadInt((_35_ + 72))) & 4294967295L) >= ((this._loadInt((_35_ + 52))) & 4294967295L)) {
                    break label$16;
                }
                label$26:
                do {
                    label$27:
                    do {
                        if ((this._loadInt8s((this._loadInt((_35_ + 72))))) != 45) {
                            break label$27;
                        }
                        this._storeInt((_35_ + 32), -1);
                        this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + (this._loadInt((_35_ + 56)))));
                        break label$26;
                    }
                    while (false);
                    if ((this._loadInt8s((this._loadInt((_35_ + 72))))) != 43) {
                        break label$26;
                    }
                    this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + (this._loadInt((_35_ + 56)))));
                }
                while (false);
                label$29:
                do {
                    label$28:
                    while (true) {
                        _33_ = 0;
                        label$30:
                        do {
                            if (((this._loadInt((_35_ + 72))) & 4294967295L) >= ((this._loadInt((_35_ + 52))) & 4294967295L)) {
                                break label$30;
                            }
                            _33_ = ((this._loadInt8u(((this._loadInt8u((this._loadInt((_35_ + 72))))) + 21776))) & 4) >>> 2;
                        }
                        while (false);
                        if (_33_ == 0) {
                            break label$29;
                        }
                        this._storeInt((_35_ + 28), ((((this._loadInt((_35_ + 28))) * 10) + (this._loadInt8s((this._loadInt((_35_ + 72)))))) + -48));
                        this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + (this._loadInt((_35_ + 56)))));
                        this._storeInt((_35_ + 24), 1);
                        continue label$28;
                    }
                }
                while (false);
            }
            while (false);
            if ((this._loadInt((_35_ + 12))) == 0) {
                break label$16;
            }
            if ((this._loadInt((_35_ + 24))) == 0) {
                break label$16;
            }
            label$32:
            do {
                label$31:
                while (true) {
                    _33_ = 0;
                    label$33:
                    do {
                        if (((this._loadInt((_35_ + 72))) & 4294967295L) >= ((this._loadInt((_35_ + 52))) & 4294967295L)) {
                            break label$33;
                        }
                        _33_ = (this._loadInt8u(((this._loadInt8u((this._loadInt((_35_ + 72))))) + 21776))) & 1;
                    }
                    while (false);
                    if (_33_ == 0) {
                        break label$32;
                    }
                    this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + (this._loadInt((_35_ + 56)))));
                    continue label$31;
                }
            }
            while (false);
        }
        while (false);
        label$34:
        do {
            label$35:
            do {
                if ((this._storeInt((_35_ + 28), (((this._loadInt((_35_ + 28))) * (this._loadInt((_35_ + 32)))) + (this._loadInt((_35_ + 36)))))) <= -1) {
                    break label$35;
                }
                this._storeInt((_35_ + 32), 1);
                break label$34;
            }
            while (false);
            this._storeInt((_35_ + 32), -1);
            this._storeInt((_35_ + 28), (0 - (this._loadInt((_35_ + 28)))));
        }
        while (false);
        label$36:
        do {
            label$37:
            do {
                label$38:
                do {
                    label$39:
                    do {
                        if ((this._loadLong((_35_ + 40))) == 0L) {
                            break label$39;
                        }
                        if ((this._loadInt((_35_ + 32))) < 1) {
                            break label$38;
                        }
                        label$40:
                        while (true) {
                            _33_ = 0;
                            label$42:
                            do {
                                if ((this._loadLong((_35_ + 40))) > 922337203685477579L) {
                                    break label$42;
                                }
                                _33_ = ((this._loadInt((_35_ + 28))) > 0) ? 1 : 0;
                            }
                            while (false);
                            if (_33_ == 0) {
                                break label$37;
                            }
                            this._storeInt((_35_ + 28), ((this._loadInt((_35_ + 28))) + -1));
                            this._storeLong((_35_ + 40), ((this._loadLong((_35_ + 40))) * 10L));
                            continue label$40;
                        }
                    }
                    while (false);
                    _33_ = 0;
                    label$43:
                    do {
                        if ((this._loadInt((_35_ + 48))) > -1) {
                            break label$43;
                        }
                        _33_ = ((this._loadInt((_35_ + 12))) != 0) ? 1 : 0;
                    }
                    while (false);
                    _temp$3 = -0.0;
                    _temp$4 = 0.0;
                    _temp$5 = (_33_ != 0) ? _temp$3 : _temp$4;
                    this._storeDouble((_35_ + 16), _temp$5);
                    break label$36;
                }
                while (false);
                label$45:
                do {
                    label$44:
                    while (true) {
                        _33_ = 0;
                        label$46:
                        do {
                            if (((this._loadLong((_35_ + 40))) % 10L) != 0L) {
                                break label$46;
                            }
                            _33_ = ((this._loadInt((_35_ + 28))) > 0) ? 1 : 0;
                        }
                        while (false);
                        if (_33_ == 0) {
                            break label$45;
                        }
                        this._storeInt((_35_ + 28), ((this._loadInt((_35_ + 28))) + -1));
                        this._storeLong((_35_ + 40), ((this._loadLong((_35_ + 40))) / 10L));
                        continue label$44;
                    }
                }
                while (false);
            }
            while (false);
            label$47:
            do {
                label$48:
                do {
                    if ((this._loadInt((_35_ + 48))) <= -1) {
                        break label$48;
                    }
                    _34_ = this._loadLong((_35_ + 40));
                    break label$47;
                }
                while (false);
                _34_ = 0L - (this._loadLong((_35_ + 40)));
            }
            while (false);
            this._storeLong((_35_ + 40), _34_);
            label$49:
            do {
                label$50:
                do {
                    label$51:
                    do {
                        if ((this._loadInt((_35_ + 28))) == 0) {
                            break label$51;
                        }
                        this._storeLong(_35_, 4607182418800017408L);
                        label$52:
                        do {
                            if ((this._loadInt((_35_ + 28))) < 308) {
                                break label$52;
                            }
                            if ((this._loadInt((_35_ + 28))) > 341) {
                                break label$52;
                            }
                            label$54:
                            do {
                                label$53:
                                while (true) {
                                    if (((this._loadInt((_35_ + 28))) % 308) == 0) {
                                        break label$54;
                                    }
                                    this._storeDouble(_35_, ((this._loadDouble(_35_)) * 10.0));
                                    this._storeInt((_35_ + 28), ((this._loadInt((_35_ + 28))) + -1));
                                    continue label$53;
                                }
                            }
                            while (false);
                            if ((this._loadInt((_35_ + 32))) <= -1) {
                                break label$49;
                            }
                            this._storeDouble((_35_ + 16), ((this._storeDouble((_35_ + 16), (((double) (this._loadLong((_35_ + 40)))) * (this._loadDouble(_35_))))) * 1.0E308));
                            break label$36;
                        }
                        while (false);
                        label$56:
                        do {
                            label$55:
                            while (true) {
                                if (((this._loadInt((_35_ + 28))) % 22) == 0) {
                                    break label$56;
                                }
                                this._storeDouble(_35_, ((this._loadDouble(_35_)) * 10.0));
                                this._storeInt((_35_ + 28), ((this._loadInt((_35_ + 28))) + -1));
                                continue label$55;
                            }
                        }
                        while (false);
                        label$58:
                        do {
                            label$57:
                            while (true) {
                                if ((this._loadInt((_35_ + 28))) < 1) {
                                    break label$58;
                                }
                                this._storeDouble(_35_, ((this._loadDouble(_35_)) * 1.0E22));
                                this._storeInt((_35_ + 28), ((this._loadInt((_35_ + 28))) + -22));
                                continue label$57;
                            }
                        }
                        while (false);
                        if ((this._loadInt((_35_ + 32))) <= -1) {
                            break label$50;
                        }
                        this._storeDouble((_35_ + 16), (((double) (this._loadLong((_35_ + 40)))) * (this._loadDouble(_35_))));
                        break label$36;
                    }
                    while (false);
                    this._storeDouble((_35_ + 16), ((double) (this._loadLong((_35_ + 40)))));
                    break label$36;
                }
                while (false);
                this._storeDouble((_35_ + 16), (((double) (this._loadLong((_35_ + 40)))) / (this._loadDouble(_35_))));
                break label$36;
            }
            while (false);
            this._storeDouble((_35_ + 16), ((this._storeDouble((_35_ + 16), (((double) (this._loadLong((_35_ + 40)))) / (this._loadDouble(_35_))))) / 1.0E308));
        }
        while (false);
        this._storeDouble((this._loadInt((_35_ + 68))), (this._loadDouble((_35_ + 16))));
        _33_ = 0;
        label$59:
        do {
            if (((this._loadInt((_35_ + 72))) & 4294967295L) < ((this._loadInt((_35_ + 52))) & 4294967295L)) {
                break label$59;
            }
            if ((this._loadInt((_35_ + 12))) < 1) {
                break label$59;
            }
            _33_ = ((this._loadInt((_35_ + 24))) != 0) ? 1 : 0;
        }
        while (false);
        this._storeInt((_35_ + 76), _33_);
        return (this._loadInt((_35_ + 76)));
    }

    @Override()
    public final int parseHhMmSs(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeLong(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 112))) + 60), 59L);
        this._storeLong((_32_ + 52), 2L);
        this._storeInt((_32_ + 104), _30_);
        this._storeInt((_32_ + 100), _31_);
        this._storeLong((_32_ + 80), 0L);
        _30_ = this._storeInt((_32_ + 44), 58);
        this._storeInt((_32_ + 40), 24);
        this._storeInt((_32_ + 68), (_32_ + 92));
        this._storeInt((_32_ + 48), (_32_ + 96));
        this._storeInt((_32_ + 36), 0);
        _31_ = this._loadInt((_32_ + 104));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 32), 2)) == (getDigits(_31_, (_32_ + 32)))) {
                    break label$1;
                }
                this._storeInt((_32_ + 108), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 104), ((_31_ = this._loadInt((_32_ + 104))) + 5));
            label$2:
            do {
                label$3:
                do {
                    label$4:
                    do {
                        if ((this._loadInt8s((_31_ + 5))) != _30_) {
                            break label$4;
                        }
                        _31_ = this._storeInt((_32_ + 12), 0);
                        this._storeInt((_32_ + 8), 59);
                        this._storeInt((_32_ + 4), _31_);
                        this._storeInt((_32_ + 16), (_32_ + 88));
                        _31_ = this._storeInt((_32_ + 104), ((this._loadInt((_32_ + 104))) + 1));
                        _30_ = this._storeInt(_32_, 2);
                        if ((getDigits(_31_, _32_)) == 1) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 108), 1);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_32_ + 88), 0);
                    break label$2;
                }
                while (false);
                this._storeInt((_32_ + 104), ((_31_ = this._loadInt((_32_ + 104))) + _30_));
                if ((this._loadInt8s((_31_ + 2))) != 46) {
                    break label$2;
                }
                if (((this._loadInt8u(((this._loadInt8u(((this._loadInt((_32_ + 104))) + 1))) + 21776))) & 4) == 0) {
                    break label$2;
                }
                this._storeLong((_32_ + 72), 4607182418800017408L);
                this._storeInt((_32_ + 104), ((this._loadInt((_32_ + 104))) + 1));
                label$6:
                do {
                    label$5:
                    while (true) {
                        if (((this._loadInt8u(((this._loadInt8u((this._loadInt((_32_ + 104))))) + 21776))) & 4) == 0) {
                            break label$6;
                        }
                        this._storeDouble((_32_ + 80), ((((this._loadDouble((_32_ + 80))) * 10.0) + ((double) (this._loadInt8s((this._loadInt((_32_ + 104))))))) + -48.0));
                        this._storeDouble((_32_ + 72), ((this._loadDouble((_32_ + 72))) * 10.0));
                        this._storeInt((_32_ + 104), ((this._loadInt((_32_ + 104))) + 1));
                        continue label$5;
                    }
                }
                while (false);
                this._storeDouble((_32_ + 80), ((this._loadDouble((_32_ + 80))) / (this._loadDouble((_32_ + 72)))));
            }
            while (false);
            _30_ = this._storeInt16(((_31_ = this._loadInt((_32_ + 100))) + 41), 1);
            this._storeInt((_31_ + 20), (this._loadInt((_32_ + 96))));
            this._storeInt(((this._loadInt((_32_ + 100))) + 24), (this._loadInt((_32_ + 92))));
            this._storeDouble(((this._loadInt((_32_ + 100))) + 32), (((double) (this._loadInt((_32_ + 88)))) + (this._loadDouble((_32_ + 80)))));
            label$7:
            do {
                if ((parseTimezone((this._loadInt((_32_ + 104))), (this._loadInt((_32_ + 100))))) == 0) {
                    break label$7;
                }
                this._storeInt((_32_ + 108), _30_);
                break label$0;
            }
            while (false);
            this._storeInt8(((_31_ = this._loadInt((_32_ + 100))) + 43), (((this._storeInt((_32_ + 108), 0)) != (this._loadInt((_31_ + 28)))) ? 1 : 0));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 108));
        this._storeInt((0 + 4), (_32_ + 112));
        return _31_;
    }

    @Override()
    public final int getDigits(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 48) + 44), _30_);
        _32_ = this._storeInt((_33_ + 12), 0);
        this._storeInt((_33_ + 40), _31_);
        label$1:
        do {
            label$0$end:
            do {
                label$0:
                while (true) {
                    this._storeInt((_33_ + 40), ((_30_ = this._loadInt((_33_ + 40))) + 4));
                    this._storeInt((_33_ + 32), (this._loadInt(_30_)));
                    this._storeInt((_33_ + 40), ((_30_ = this._loadInt((_33_ + 40))) + 4));
                    this._storeInt((_33_ + 28), (this._loadInt(_30_)));
                    this._storeInt((_33_ + 40), ((_30_ = this._loadInt((_33_ + 40))) + 4));
                    this._storeInt((_33_ + 24), (this._loadInt(_30_)));
                    this._storeInt((_33_ + 40), ((_30_ = this._loadInt((_33_ + 40))) + 4));
                    this._storeInt((_33_ + 20), (this._loadInt(_30_)));
                    this._storeInt((_33_ + 40), ((_30_ = this._loadInt((_33_ + 40))) + 4));
                    this._storeInt((_33_ + 16), (this._loadInt(_30_)));
                    this._storeInt((_33_ + 36), _32_);
                    label$3:
                    do {
                        label$2:
                        while (true) {
                            this._storeInt((_33_ + 32), ((_30_ = this._loadInt((_33_ + 32))) + -1));
                            if (_30_ == 0) {
                                break label$3;
                            }
                            if (((this._loadInt8u(((this._loadInt8u((this._loadInt((_33_ + 44))))) + 21776))) & 4) == 0) {
                                break label$1;
                            }
                            this._storeInt((_33_ + 36), ((((this._loadInt((_33_ + 36))) * 10) + (this._loadInt8s((this._loadInt((_33_ + 44)))))) + -48));
                            this._storeInt((_33_ + 44), ((this._loadInt((_33_ + 44))) + 1));
                            continue label$2;
                        }
                    }
                    while (false);
                    if ((this._loadInt((_33_ + 36))) < (this._loadInt((_33_ + 28)))) {
                        break label$1;
                    }
                    if ((this._loadInt((_33_ + 36))) > (this._loadInt((_33_ + 24)))) {
                        break label$1;
                    }
                    label$4:
                    do {
                        if ((this._loadInt((_33_ + 20))) == 0) {
                            break label$4;
                        }
                        if ((this._loadInt((_33_ + 20))) != (this._loadInt8s((this._loadInt((_33_ + 44)))))) {
                            break label$1;
                        }
                    }
                    while (false);
                    this._storeInt((this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 36))));
                    this._storeInt((_33_ + 44), ((this._loadInt((_33_ + 44))) + 1));
                    this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 1));
                    if ((this._loadInt((_33_ + 20))) != 0) {
                        continue label$0;
                    }
                    break label$0$end;
                }
            }
            while (false);
        }
        while (false);
        return (this._loadInt((_33_ + 12)));
    }

    @Override()
    public final int parseTimezone(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 72), _30_);
        this._storeInt((_32_ + 68), _31_);
        this._storeInt((_32_ + 64), 0);
        label$1:
        do {
            label$0:
            while (true) {
                if (((this._loadInt8u(((this._loadInt8u((this._loadInt((_32_ + 72))))) + 21776))) & 1) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 72), ((this._loadInt((_32_ + 72))) + 1));
                continue label$0;
            }
        }
        while (false);
        this._storeInt(((this._loadInt((_32_ + 68))) + 28), 0);
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
                                if ((this._storeInt((_32_ + 52), (this._loadInt8s((this._loadInt((_32_ + 72))))))) != 45) {
                                    break label$7;
                                }
                                this._storeInt((_32_ + 64), -1);
                                break label$6;
                            }
                            while (false);
                            if ((this._loadInt((_32_ + 52))) != 43) {
                                break label$5;
                            }
                            this._storeInt((_32_ + 64), 1);
                        }
                        while (false);
                        this._storeLong((_32_ + 28), 59L);
                        this._storeLong((_32_ + 20), 2L);
                        this._storeInt((_32_ + 12), 58);
                        this._storeInt((_32_ + 8), 14);
                        this._storeInt((_32_ + 4), 0);
                        this._storeInt((_32_ + 36), (_32_ + 56));
                        this._storeInt((_32_ + 16), (_32_ + 60));
                        _31_ = this._storeInt((_32_ + 72), ((this._loadInt((_32_ + 72))) + 1));
                        label$8:
                        do {
                            if ((this._storeInt(_32_, 2)) == (getDigits(_31_, _32_))) {
                                break label$8;
                            }
                            this._storeInt((_32_ + 76), 1);
                            break label$2;
                        }
                        while (false);
                        this._storeInt((_32_ + 72), ((this._loadInt((_32_ + 72))) + 5));
                        this._storeInt(((this._loadInt((_32_ + 68))) + 28), ((this._loadInt((_32_ + 64))) * ((this._loadInt((_32_ + 56))) + ((this._loadInt((_32_ + 60))) * 60))));
                        break label$4;
                    }
                    while (false);
                    label$9:
                    do {
                        if ((this._loadInt((_32_ + 52))) == 90) {
                            break label$9;
                        }
                        if ((this._loadInt((_32_ + 52))) != 122) {
                            break label$3;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 72), ((this._loadInt((_32_ + 72))) + 1));
                }
                while (false);
                label$11:
                do {
                    label$10:
                    while (true) {
                        if (((this._loadInt8u(((this._loadInt8u((this._loadInt((_32_ + 72))))) + 21776))) & 1) == 0) {
                            break label$11;
                        }
                        this._storeInt((_32_ + 72), ((this._loadInt((_32_ + 72))) + 1));
                        continue label$10;
                    }
                }
                while (false);
                this._storeInt((_32_ + 76), (((this._loadInt8s((this._loadInt((_32_ + 72))))) != 0) ? 1 : 0));
                break label$2;
            }
            while (false);
            this._storeInt((_32_ + 76), (((this._loadInt((_32_ + 52))) != 0) ? 1 : 0));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 76));
        this._storeInt((0 + 4), (_32_ + 80));
        return _31_;
    }

    @Override()
    public final int osLocaltime(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 12), 8);
        this._storeInt((_32_ + 16), (this.localtime.invoke((this._loadInt((_32_ + 28))))));
        label$0:
        do {
            if ((this._loadInt((0 + 20464))) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 16), 0);
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_32_ + 16))) == 0) {
                break label$1;
            }
            memcpy((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 16))), 44);
        }
        while (false);
        _31_ = this._storeInt((_32_ + 20), (((this._loadInt((_32_ + 16))) == 0) ? 1 : 0));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final void sqlite3_result_error(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _30_ = this._storeInt(((_31_ = this._loadInt((_33_ + 12))) + 52), 1);
        sqlite3VdbeMemSetStr((_31_ + 8), (this._loadInt((_33_ + 8))), _32_, _30_, -1);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int parseYyyyMmDd(int _30_, int _31_)
    {
        long _32_ = 0L;
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 88), _30_);
        this._storeInt((_33_ + 84), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8s((this._loadInt((_33_ + 88))))) != 45) {
                    break label$1;
                }
                this._storeInt((_33_ + 88), ((this._loadInt((_33_ + 88))) + 1));
                this._storeInt((_33_ + 68), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 68), 0);
        }
        while (false);
        this._storeLong((_33_ + 48), 31L);
        _32_ = this._storeLong((_33_ + 40), 4294967298L);
        this._storeLong((_33_ + 28), 193273528332L);
        this._storeLong((_33_ + 20), _32_);
        this._storeInt((_33_ + 12), 45);
        this._storeInt((_33_ + 8), 9999);
        this._storeInt((_33_ + 4), 0);
        _31_ = this._loadInt((_33_ + 88));
        this._storeInt(_33_, 4);
        this._storeInt((_33_ + 56), (_33_ + 72));
        this._storeInt((_33_ + 36), (_33_ + 76));
        this._storeInt((_33_ + 16), (_33_ + 80));
        label$2:
        do {
            label$3:
            do {
                if ((getDigits(_31_, _33_)) == 3) {
                    break label$3;
                }
                this._storeInt((_33_ + 92), 1);
                break label$2;
            }
            while (false);
            this._storeInt((_33_ + 88), ((this._loadInt((_33_ + 88))) + 10));
            label$5:
            do {
                label$4:
                while (true) {
                    _31_ = 1;
                    label$6:
                    do {
                        if (((this._loadInt8u(((this._loadInt8u((this._loadInt((_33_ + 88))))) + 21776))) & 1) != 0) {
                            break label$6;
                        }
                        _31_ = ((this._loadInt8u((this._loadInt((_33_ + 88))))) == 84) ? 1 : 0;
                    }
                    while (false);
                    if (_31_ == 0) {
                        break label$5;
                    }
                    this._storeInt((_33_ + 88), ((this._loadInt((_33_ + 88))) + 1));
                    continue label$4;
                }
            }
            while (false);
            label$7:
            do {
                if ((parseHhMmSs((this._loadInt((_33_ + 88))), (this._loadInt((_33_ + 84))))) == 0) {
                    break label$7;
                }
                label$8:
                do {
                    if ((this._loadInt8s((this._loadInt((_33_ + 88))))) == 0) {
                        break label$8;
                    }
                    this._storeInt((_33_ + 92), 1);
                    break label$2;
                }
                while (false);
                this._storeInt8(((this._loadInt((_33_ + 84))) + 41), 0);
            }
            while (false);
            this._storeInt8(((_31_ = this._loadInt((_33_ + 84))) + 40), 1);
            _31_ = this._storeInt8((_31_ + 42), 0);
            label$9:
            do {
                label$10:
                do {
                    if ((this._loadInt((_33_ + 68))) == 0) {
                        break label$10;
                    }
                    _31_ = _31_ - (this._loadInt((_33_ + 80)));
                    break label$9;
                }
                while (false);
                _31_ = this._loadInt((_33_ + 80));
            }
            while (false);
            this._storeInt(((_30_ = this._loadInt((_33_ + 84))) + 8), _31_);
            this._storeInt((_30_ + 12), (this._loadInt((_33_ + 76))));
            this._storeInt(((this._loadInt((_33_ + 84))) + 16), (this._loadInt((_33_ + 72))));
            label$11:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 84))) + 43))) == 0) {
                    break label$11;
                }
                computeJD((this._loadInt((_33_ + 84))));
            }
            while (false);
            this._storeInt((_33_ + 92), 0);
        }
        while (false);
        _31_ = this._loadInt((_33_ + 92));
        this._storeInt((0 + 4), (_33_ + 96));
        return _31_;
    }

    @Override()
    public final double sqlite3VdbeRealValue(int _30_)
    {
        int _31_ = 0;
        double _32_ = 0.0;
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt16u(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 20), _30_)) + 28))) & 8) == 0) {
                    break label$1;
                }
                this._storeDouble((_31_ + 24), (this._loadDouble(((this._loadInt((_31_ + 20))) + 8))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt16u(((this._loadInt((_31_ + 20))) + 28))) & 4) == 0) {
                    break label$2;
                }
                this._storeDouble((_31_ + 24), ((double) (this._loadLong(((this._loadInt((_31_ + 20))) + 16)))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt16u(((this._loadInt((_31_ + 20))) + 28))) & 18) == 0) {
                    break label$3;
                }
                this._storeLong((_31_ + 8), 0L);
                sqlite3AtoF((this._loadInt(((_30_ = this._loadInt((_31_ + 20))) + 4))), (_31_ + 8), (this._loadInt((_30_ + 24))), (this._loadInt8u((_30_ + 31))));
                this._storeDouble((_31_ + 24), (this._loadDouble((_31_ + 8))));
                break label$0;
            }
            while (false);
            this._storeLong((_31_ + 24), 0L);
        }
        while (false);
        _32_ = this._loadDouble((_31_ + 24));
        this._storeInt((0 + 4), (_31_ + 32));
        return _32_;
    }

    @Override()
    public final int sqlite3OsCurrentTimeInt64(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((this._loadInt((_32_ + 28))))) < 2) {
                    break label$1;
                }
                if ((this._loadInt(((this._loadInt((_32_ + 28))) + 72))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 20), (this._iiiTable[this._tableIndices[this._loadInt(((_31_ = this._loadInt((_32_ + 28))) + 72))]].invoke(_31_, (this._loadInt((_32_ + 24))))));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 20), (this._iiiTable[this._tableIndices[this._loadInt(((_31_ = this._loadInt((_32_ + 28))) + 64))]].invoke(_31_, (_32_ + 8))));
            this._storeLong((this._loadInt((_32_ + 24))), (_truncateDoubleToSignedLong(((this._loadDouble((_32_ + 8))) * 8.64E7))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 20));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final void sqlite3_result_double(int _30_, double _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeDouble(_32_, _31_);
        sqlite3VdbeMemSetDouble(((this._loadInt((_32_ + 12))) + 8), _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3VdbeMemSetDouble(int _30_, double _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((sqlite3IsNaN((this._storeDouble(_32_, _31_)))) == 0) {
                    break label$1;
                }
                sqlite3VdbeMemSetNull((this._loadInt((_32_ + 12))));
                break label$0;
            }
            while (false);
            sqlite3VdbeMemRelease((this._loadInt((_32_ + 12))));
            this._storeInt8(((_30_ = this._loadInt((_32_ + 12))) + 30), 2);
            this._storeInt16((_30_ + 28), 8);
            this._storeDouble((_30_ + 8), (this._loadDouble(_32_)));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int sqlite3IsNaN(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = (this._loadInt((0 + 4))) - 32) + 8), (this._storeDouble((_31_ + 24), _30_)));
        this._storeDouble(_31_, (this._loadDouble((_31_ + 8))));
        return (this._storeInt((_31_ + 20), (((this._loadDouble((_31_ + 8))) != (this._loadDouble(_31_))) ? 1 : 0)));
    }

    @Override()
    public final int functionSearch(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_34_ + 20), _31_);
        this._storeInt((_34_ + 16), _32_);
        this._storeInt((_34_ + 12), _33_);
        this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((_34_ + 24))) + ((this._loadInt((_34_ + 20))) << 2)))));
        label$0:
        do {
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt((_34_ + 8))) == 0) {
                            break label$1;
                        }
                        label$4:
                        do {
                            if ((sqlite3_strnicmp((this._loadInt(((this._loadInt((_34_ + 8))) + 24))), (this._loadInt((_34_ + 16))), (this._loadInt((_34_ + 12))))) != 0) {
                                break label$4;
                            }
                            if ((this._loadInt8s(((this._loadInt(((this._loadInt((_34_ + 8))) + 24))) + (this._loadInt((_34_ + 12)))))) == 0) {
                                break label$3;
                            }
                        }
                        while (false);
                        this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((_34_ + 8))) + 28))));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt((_34_ + 28), (this._loadInt((_34_ + 8))));
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
    public final void trimFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_33_ + 56), _31_);
        this._storeInt((_33_ + 52), _32_);
        this._storeInt((_33_ + 24), (this._storeInt((_33_ + 28), 0)));
        label$0:
        do {
            if ((sqlite3_value_type((this._loadInt((this._loadInt((_33_ + 52))))))) == 5) {
                break label$0;
            }
            if ((this._storeInt((_33_ + 48), (sqlite3_value_text((this._loadInt((this._loadInt((_33_ + 52))))))))) == 0) {
                break label$0;
            }
            this._storeInt((_33_ + 40), (sqlite3_value_bytes((this._loadInt((this._loadInt((_33_ + 52))))))));
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_33_ + 56))) != 1) {
                        break label$2;
                    }
                    this._storeInt((_33_ + 20), 1);
                    this._storeInt((_33_ + 28), 60688);
                    this._storeInt((_33_ + 24), 60692);
                    this._storeInt((_33_ + 44), 0);
                    break label$1;
                }
                while (false);
                if ((this._storeInt((_33_ + 44), (sqlite3_value_text((this._loadInt(((this._loadInt((_33_ + 52))) + 4))))))) == 0) {
                    break label$0;
                }
                this._storeInt((_33_ + 16), (this._loadInt((_33_ + 44))));
                this._storeInt((_33_ + 20), 0);
                label$4:
                do {
                    label$3:
                    while (true) {
                        label$5:
                        do {
                            label$6:
                            do {
                                if ((this._loadInt8u((this._loadInt((_33_ + 16))))) == 0) {
                                    break label$6;
                                }
                                this._storeInt((_33_ + 16), ((_32_ = this._loadInt((_33_ + 16))) + 1));
                                if ((this._loadInt8u(_32_)) < 192) {
                                    break label$5;
                                }
                                label$7:
                                while (true) {
                                    if (((this._loadInt8u((this._loadInt((_33_ + 16))))) & 192) != 128) {
                                        break label$5;
                                    }
                                    this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + 1));
                                    continue label$7;
                                }
                            }
                            while (false);
                            if ((this._loadInt((_33_ + 20))) < 1) {
                                break label$4;
                            }
                            if ((this._storeInt((_33_ + 24), (contextMalloc((this._loadInt((_33_ + 60))), ((this._loadLong32s((_33_ + 20))) * 5L))))) == 0) {
                                break label$0;
                            }
                            this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 24))) + ((this._loadInt((_33_ + 20))) << 2)));
                            this._storeInt((_33_ + 16), (this._loadInt((_33_ + 44))));
                            this._storeInt((_33_ + 20), 0);
                            label$9:
                            while (true) {
                                if ((this._loadInt8u((this._loadInt((_33_ + 16))))) == 0) {
                                    break label$4;
                                }
                                this._storeInt((_33_ + 16), ((_32_ = this._storeInt(((this._loadInt((_33_ + 24))) + ((this._loadInt((_33_ + 20))) << 2)), (this._loadInt((_33_ + 16))))) + 1));
                                label$11:
                                do {
                                    if ((this._loadInt8u(_32_)) < 192) {
                                        break label$11;
                                    }
                                    label$13:
                                    do {
                                        label$12:
                                        while (true) {
                                            if (((this._loadInt8u((this._loadInt((_33_ + 16))))) & 192) != 128) {
                                                break label$13;
                                            }
                                            this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + 1));
                                            continue label$12;
                                        }
                                    }
                                    while (false);
                                }
                                while (false);
                                this._storeInt8(((this._loadInt((_33_ + 28))) + (_32_ = this._loadInt((_33_ + 20)))), ((this._loadInt((_33_ + 16))) - (this._loadInt(((this._loadInt((_33_ + 24))) + (_32_ << 2))))));
                                this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + 1));
                                continue label$9;
                            }
                        }
                        while (false);
                        this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + 1));
                        continue label$3;
                    }
                }
                while (false);
            }
            while (false);
            label$14:
            do {
                if ((this._loadInt((_33_ + 20))) < 1) {
                    break label$14;
                }
                this._storeInt((_33_ + 36), (sqlite3_user_data((this._loadInt((_33_ + 60))))));
                label$15:
                do {
                    if (((this._loadInt8u((_33_ + 36))) & 1) == 0) {
                        break label$15;
                    }
                    label$17:
                    do {
                        label$16:
                        while (true) {
                            if ((this._loadInt((_33_ + 40))) < 1) {
                                break label$17;
                            }
                            this._storeInt((_33_ + 32), (this._storeInt((_33_ + 12), 0)));
                            label$19:
                            do {
                                label$18:
                                while (true) {
                                    if ((this._loadInt((_33_ + 32))) >= (this._loadInt((_33_ + 20)))) {
                                        break label$19;
                                    }
                                    label$20:
                                    do {
                                        if ((this._storeInt((_33_ + 12), (this._loadInt8u(((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 32)))))))) > (this._loadInt((_33_ + 40)))) {
                                            break label$20;
                                        }
                                        if ((memcmp((this._loadInt((_33_ + 48))), (this._loadInt(((this._loadInt((_33_ + 24))) + ((this._loadInt((_33_ + 32))) << 2)))), (this._loadInt((_33_ + 12))))) == 0) {
                                            break label$19;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_33_ + 32), ((this._loadInt((_33_ + 32))) + 1));
                                    continue label$18;
                                }
                            }
                            while (false);
                            if ((this._loadInt((_33_ + 32))) >= (this._loadInt((_33_ + 20)))) {
                                break label$17;
                            }
                            this._storeInt((_33_ + 48), ((this._loadInt((_33_ + 48))) + (this._loadInt((_33_ + 12)))));
                            this._storeInt((_33_ + 40), ((this._loadInt((_33_ + 40))) - (this._loadInt((_33_ + 12)))));
                            continue label$16;
                        }
                    }
                    while (false);
                }
                while (false);
                label$21:
                do {
                    if (((this._loadInt8u((_33_ + 36))) & 2) == 0) {
                        break label$21;
                    }
                    label$23:
                    do {
                        label$22:
                        while (true) {
                            if ((this._loadInt((_33_ + 40))) < 1) {
                                break label$23;
                            }
                            this._storeInt((_33_ + 32), (this._storeInt((_33_ + 8), 0)));
                            label$25:
                            do {
                                label$24:
                                while (true) {
                                    if ((this._loadInt((_33_ + 32))) >= (this._loadInt((_33_ + 20)))) {
                                        break label$25;
                                    }
                                    label$26:
                                    do {
                                        if ((this._storeInt((_33_ + 8), (this._loadInt8u(((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 32)))))))) > (this._loadInt((_33_ + 40)))) {
                                            break label$26;
                                        }
                                        if ((memcmp(((this._loadInt((_33_ + 48))) + ((this._loadInt((_33_ + 40))) - (_32_ = this._loadInt((_33_ + 8))))), (this._loadInt(((this._loadInt((_33_ + 24))) + ((this._loadInt((_33_ + 32))) << 2)))), _32_)) == 0) {
                                            break label$25;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_33_ + 32), ((this._loadInt((_33_ + 32))) + 1));
                                    continue label$24;
                                }
                            }
                            while (false);
                            if ((this._loadInt((_33_ + 32))) >= (this._loadInt((_33_ + 20)))) {
                                break label$23;
                            }
                            this._storeInt((_33_ + 40), ((this._loadInt((_33_ + 40))) - (this._loadInt((_33_ + 8)))));
                            continue label$22;
                        }
                    }
                    while (false);
                }
                while (false);
                if ((this._loadInt((_33_ + 44))) == 0) {
                    break label$14;
                }
                sqlite3_free((this._loadInt((_33_ + 24))));
            }
            while (false);
            sqlite3_result_text((this._loadInt((_33_ + 60))), (this._loadInt((_33_ + 48))), (this._loadInt((_33_ + 40))), -1);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 64));
        return;
    }

    @Override()
    public final void minmaxFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        _temp$0 = -1;
        _temp$1 = 0;
        _temp$2 = ((sqlite3_user_data((this._loadInt((_33_ + 28))))) != 0) ? _temp$0 : _temp$1;
        this._storeInt((_33_ + 12), _temp$2);
        this._storeInt((_33_ + 4), (sqlite3GetFuncCollSeq((this._loadInt((_33_ + 28))))));
        _31_ = this._storeInt((_33_ + 8), 0);
        label$0:
        do {
            if ((sqlite3_value_type((this._loadInt((this._loadInt((_33_ + 20))))))) == 5) {
                break label$0;
            }
            _30_ = this._storeInt((_33_ + 16), 1);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_33_ + 16))) >= (this._loadInt((_33_ + 24)))) {
                        break label$2;
                    }
                    if ((sqlite3_value_type((this._loadInt(((this._loadInt((_33_ + 20))) + ((this._loadInt((_33_ + 16))) << 2)))))) == 5) {
                        break label$0;
                    }
                    label$3:
                    do {
                        if (((sqlite3MemCompare((this._loadInt(((_32_ = this._loadInt((_33_ + 20))) + ((this._loadInt((_33_ + 8))) << 2)))), (this._loadInt((_32_ + ((this._loadInt((_33_ + 16))) << 2)))), (this._loadInt((_33_ + 4))))) ^ (this._loadInt((_33_ + 12)))) < _31_) {
                            break label$3;
                        }
                        this._storeInt((_33_ + 8), (this._loadInt((_33_ + 16))));
                    }
                    while (false);
                    this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + _30_));
                    continue label$1;
                }
            }
            while (false);
            sqlite3_result_value((this._loadInt((_33_ + 28))), (this._loadInt(((this._loadInt((_33_ + 20))) + ((this._loadInt((_33_ + 8))) << 2)))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void minmaxStep(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 16), (this._loadInt((this._storeInt((_33_ + 20), _32_)))));
        label$0:
        do {
            if ((sqlite3_value_type((this._loadInt((this._loadInt((_33_ + 20))))))) == 5) {
                break label$0;
            }
            if ((this._storeInt((_33_ + 12), (sqlite3_aggregate_context((this._loadInt((_33_ + 28))), 40)))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt16u(((this._loadInt((_33_ + 12))) + 28))) == 0) {
                    break label$1;
                }
                this._storeInt(_33_, (sqlite3GetFuncCollSeq((this._loadInt((_33_ + 28))))));
                this._storeInt((_33_ + 8), (((sqlite3_user_data((this._loadInt((_33_ + 28))))) != 0) ? 1 : 0));
                this._storeInt((_33_ + 4), (sqlite3MemCompare((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 16))), (this._loadInt(_33_)))));
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_33_ + 8))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt((_33_ + 4))) < 0) {
                            break label$2;
                        }
                    }
                    while (false);
                    if ((this._loadInt((_33_ + 8))) != 0) {
                        break label$0;
                    }
                    if ((this._loadInt((_33_ + 4))) < 1) {
                        break label$0;
                    }
                }
                while (false);
                sqlite3VdbeMemCopy((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 16))));
                break label$0;
            }
            while (false);
            sqlite3VdbeMemCopy((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 16))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void minMaxFinalize(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (sqlite3_aggregate_context((this._storeInt((_31_ + 12), _30_)), 0)))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt16u(((this._loadInt((_31_ + 8))) + 28))) == 0) {
                    break label$1;
                }
                sqlite3_result_value((this._loadInt((_31_ + 12))), (this._loadInt((_31_ + 8))));
            }
            while (false);
            sqlite3VdbeMemRelease((this._loadInt((_31_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void typeofFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(_33_, 0);
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
                            if (((_32_ = (sqlite3_value_type((this._loadInt((this._loadInt((_33_ + 4))))))) + -1) & 4294967295L) > (3 & 4294967295L)) {
                                break label$4;
                            }
                            label$5:
                            do {
                                switch (_32_) {
                                    case 0: {
                                        break label$5;
                                    }
                                    case 1: {
                                        break label$3;
                                    }
                                    case 2: {
                                        break label$2;
                                    }
                                    case 3: {
                                        break label$1;
                                    }
                                    default: {
                                        break label$5;
                                    }
                                }
                            }
                            while (false);
                            this._storeInt(_33_, 31904);
                            break label$0;
                        }
                        while (false);
                        this._storeInt(_33_, 31920);
                        break label$0;
                    }
                    while (false);
                    this._storeInt(_33_, 31888);
                    break label$0;
                }
                while (false);
                this._storeInt(_33_, 60656);
                break label$0;
            }
            while (false);
            this._storeInt(_33_, 60672);
        }
        while (false);
        sqlite3_result_text((this._loadInt((_33_ + 12))), (this._loadInt(_33_)), -1, 0);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void lengthFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((((_32_ = sqlite3_value_type((this._loadInt((this._storeInt((_33_ + 20), _32_)))))) + -1) & 4294967295L) < (2 & 4294967295L)) {
                            break label$3;
                        }
                        if (_32_ == 3) {
                            break label$2;
                        }
                        if (_32_ != 4) {
                            break label$1;
                        }
                    }
                    while (false);
                    sqlite3_result_int((this._loadInt((_33_ + 28))), (sqlite3_value_bytes((this._loadInt((this._loadInt((_33_ + 20))))))));
                    break label$0;
                }
                while (false);
                if ((this._storeInt((_33_ + 12), (sqlite3_value_text((this._loadInt((this._loadInt((_33_ + 20))))))))) == 0) {
                    break label$0;
                }
                this._storeInt((_33_ + 16), 0);
                label$5:
                do {
                    label$4:
                    while (true) {
                        if ((this._loadInt8u((this._loadInt((_33_ + 12))))) == 0) {
                            break label$5;
                        }
                        this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + 1));
                        this._storeInt((_33_ + 12), ((_32_ = this._loadInt((_33_ + 12))) + 1));
                        if ((this._loadInt8u(_32_)) < 192) {
                            continue label$4;
                        }
                        label$6:
                        while (true) {
                            if (((this._loadInt8u((this._loadInt((_33_ + 12))))) & 192) != 128) {
                                continue label$4;
                            }
                            this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 1));
                            continue label$6;
                        }
                    }
                }
                while (false);
                sqlite3_result_int((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 16))));
                break label$0;
            }
            while (false);
            sqlite3_result_null((this._loadInt((_33_ + 28))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void substrFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_33_ + 56), _31_);
        this._storeInt((_33_ + 52), _32_);
        this._storeInt((_33_ + 12), 0);
        label$0:
        do {
            if ((sqlite3_value_type((this._loadInt(((this._loadInt((_33_ + 52))) + 4))))) == 5) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt((_33_ + 56))) != 3) {
                    break label$1;
                }
                if ((sqlite3_value_type((this._loadInt(((this._loadInt((_33_ + 52))) + 8))))) == 5) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt((_33_ + 36), (sqlite3_value_type((this._loadInt((this._loadInt((_33_ + 52))))))));
            this._storeLong((_33_ + 24), ((long) (sqlite3_value_int((this._loadInt(((this._loadInt((_33_ + 52))) + 4)))))));
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt((_33_ + 36))) != 4) {
                        break label$3;
                    }
                    this._storeInt((_33_ + 40), (sqlite3_value_bytes((this._loadInt((this._loadInt((_33_ + 52))))))));
                    if ((this._storeInt((_33_ + 48), (sqlite3_value_blob((this._loadInt((this._loadInt((_33_ + 52))))))))) != 0) {
                        break label$2;
                    }
                    break label$0;
                }
                while (false);
                if ((this._storeInt((_33_ + 48), (sqlite3_value_text((this._loadInt((this._loadInt((_33_ + 52))))))))) == 0) {
                    break label$0;
                }
                this._storeInt((_33_ + 40), 0);
                if ((this._loadLong((_33_ + 24))) > -1L) {
                    break label$2;
                }
                this._storeInt((_33_ + 44), (this._loadInt((_33_ + 48))));
                label$5:
                do {
                    label$4:
                    while (true) {
                        if ((this._loadInt8u((this._loadInt((_33_ + 44))))) == 0) {
                            break label$5;
                        }
                        this._storeInt((_33_ + 44), ((_32_ = this._loadInt((_33_ + 44))) + 1));
                        label$6:
                        do {
                            if ((this._loadInt8u(_32_)) < 192) {
                                break label$6;
                            }
                            label$8:
                            do {
                                label$7:
                                while (true) {
                                    if (((this._loadInt8u((this._loadInt((_33_ + 44))))) & 192) != 128) {
                                        break label$8;
                                    }
                                    this._storeInt((_33_ + 44), ((this._loadInt((_33_ + 44))) + 1));
                                    continue label$7;
                                }
                            }
                            while (false);
                        }
                        while (false);
                        this._storeInt((_33_ + 40), ((this._loadInt((_33_ + 40))) + 1));
                        continue label$4;
                    }
                }
                while (false);
            }
            while (false);
            label$9:
            do {
                label$10:
                do {
                    if ((this._loadInt((_33_ + 56))) != 3) {
                        break label$10;
                    }
                    if ((this._storeLong((_33_ + 16), ((long) (sqlite3_value_int((this._loadInt(((this._loadInt((_33_ + 52))) + 8)))))))) > -1L) {
                        break label$9;
                    }
                    this._storeLong((_33_ + 16), (0L - (this._loadLong((_33_ + 16)))));
                    this._storeInt((_33_ + 12), 1);
                    break label$9;
                }
                while (false);
                this._storeLong((_33_ + 16), (this._loadLong32s(((sqlite3_context_db_handle((this._loadInt((_33_ + 60))))) + 72))));
            }
            while (false);
            label$11:
            do {
                label$12:
                do {
                    label$13:
                    do {
                        if ((this._loadLong((_33_ + 24))) <= -1L) {
                            break label$13;
                        }
                        if ((this._loadLong((_33_ + 24))) < 1L) {
                            break label$12;
                        }
                        this._storeLong((_33_ + 24), ((this._loadLong((_33_ + 24))) + -1L));
                        break label$11;
                    }
                    while (false);
                    if ((this._storeLong((_33_ + 24), ((this._loadLong((_33_ + 24))) + (this._loadLong32s((_33_ + 40)))))) > -1L) {
                        break label$11;
                    }
                    label$14:
                    do {
                        if ((this._storeLong((_33_ + 16), ((this._loadLong((_33_ + 16))) + (this._loadLong((_33_ + 24)))))) > -1L) {
                            break label$14;
                        }
                        this._storeLong((_33_ + 16), 0L);
                    }
                    while (false);
                    this._storeLong((_33_ + 24), 0L);
                    break label$11;
                }
                while (false);
                if ((this._loadLong((_33_ + 16))) < 1L) {
                    break label$11;
                }
                this._storeLong((_33_ + 16), ((this._loadLong((_33_ + 16))) + -1L));
            }
            while (false);
            label$15:
            do {
                if ((this._loadInt((_33_ + 12))) == 0) {
                    break label$15;
                }
                if ((this._storeLong((_33_ + 24), ((this._loadLong((_33_ + 24))) - (this._loadLong((_33_ + 16)))))) > -1L) {
                    break label$15;
                }
                this._storeLong((_33_ + 16), ((this._loadLong((_33_ + 16))) + (this._loadLong((_33_ + 24)))));
                this._storeLong((_33_ + 24), 0L);
            }
            while (false);
            label$16:
            do {
                if ((this._loadInt((_33_ + 36))) == 4) {
                    break label$16;
                }
                label$17:
                while (true) {
                    _32_ = 0;
                    label$19:
                    do {
                        if ((this._loadInt8u((this._loadInt((_33_ + 48))))) == 0) {
                            break label$19;
                        }
                        _32_ = ((this._loadLong((_33_ + 24))) != 0L) ? 1 : 0;
                    }
                    while (false);
                    label$20:
                    do {
                        label$21:
                        do {
                            if (_32_ == 0) {
                                break label$21;
                            }
                            this._storeInt((_33_ + 48), ((_32_ = this._loadInt((_33_ + 48))) + 1));
                            if ((this._loadInt8u(_32_)) < 192) {
                                break label$20;
                            }
                            label$22:
                            while (true) {
                                if (((this._loadInt8u((this._loadInt((_33_ + 48))))) & 192) != 128) {
                                    break label$20;
                                }
                                this._storeInt((_33_ + 48), ((this._loadInt((_33_ + 48))) + 1));
                                continue label$22;
                            }
                        }
                        while (false);
                        this._storeInt((_33_ + 44), (this._loadInt((_33_ + 48))));
                        label$24:
                        while (true) {
                            _32_ = 0;
                            label$26:
                            do {
                                if ((this._loadInt8u((this._loadInt((_33_ + 44))))) == 0) {
                                    break label$26;
                                }
                                _32_ = ((this._loadLong((_33_ + 16))) != 0L) ? 1 : 0;
                            }
                            while (false);
                            label$27:
                            do {
                                label$28:
                                do {
                                    if (_32_ == 0) {
                                        break label$28;
                                    }
                                    this._storeInt((_33_ + 44), ((_32_ = this._loadInt((_33_ + 44))) + 1));
                                    if ((this._loadInt8u(_32_)) < 192) {
                                        break label$27;
                                    }
                                    label$29:
                                    while (true) {
                                        if (((this._loadInt8u((this._loadInt((_33_ + 44))))) & 192) != 128) {
                                            break label$27;
                                        }
                                        this._storeInt((_33_ + 44), ((this._loadInt((_33_ + 44))) + 1));
                                        continue label$29;
                                    }
                                }
                                while (false);
                                sqlite3_result_text((this._loadInt((_33_ + 60))), (_32_ = this._loadInt((_33_ + 48))), ((this._loadInt((_33_ + 44))) - _32_), -1);
                                break label$0;
                            }
                            while (false);
                            this._storeLong((_33_ + 16), ((this._loadLong((_33_ + 16))) + -1L));
                            continue label$24;
                        }
                    }
                    while (false);
                    this._storeLong((_33_ + 24), ((this._loadLong((_33_ + 24))) + -1L));
                    continue label$17;
                }
            }
            while (false);
            label$31:
            do {
                if (((this._loadLong((_33_ + 24))) + (this._loadLong((_33_ + 16)))) <= (this._loadLong32s((_33_ + 40)))) {
                    break label$31;
                }
                if ((this._storeLong((_33_ + 16), ((this._loadLong32s((_33_ + 40))) - (this._loadLong((_33_ + 24)))))) > -1L) {
                    break label$31;
                }
                this._storeLong((_33_ + 16), 0L);
            }
            while (false);
            sqlite3_result_blob((this._loadInt((_33_ + 60))), ((this._loadInt((_33_ + 48))) + (this._loadInt((_33_ + 24)))), (this._loadInt((_33_ + 16))), -1);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 64));
        return;
    }

    @Override()
    public final void absFunc(int _30_, int _31_, int _32_)
    {
        double _33_ = 0.0;
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((_32_ = sqlite3_value_type((this._loadInt((this._storeInt((_34_ + 20), _32_)))))) == 5) {
                            break label$3;
                        }
                        if (_32_ != 1) {
                            break label$2;
                        }
                        label$4:
                        do {
                            if ((this._storeLong((_34_ + 8), (sqlite3_value_int64((this._loadInt((this._loadInt((_34_ + 20))))))))) > -1L) {
                                break label$4;
                            }
                            if (((this._loadLong((_34_ + 8))) << 1L) == 0L) {
                                break label$1;
                            }
                            this._storeLong((_34_ + 8), (0L - (this._loadLong((_34_ + 8)))));
                        }
                        while (false);
                        sqlite3_result_int64((this._loadInt((_34_ + 28))), (this._loadLong((_34_ + 8))));
                        break label$0;
                    }
                    while (false);
                    sqlite3_result_null((this._loadInt((_34_ + 28))));
                    break label$0;
                }
                while (false);
                label$5:
                do {
                    if (((((_33_ = this._storeDouble(_34_, (sqlite3_value_double((this._loadInt((this._loadInt((_34_ + 20))))))))) >= 0.0) ? 1 : 0) | ((_33_ != _33_) ? 1 : 0)) != 0) {
                        break label$5;
                    }
                    this._storeDouble(_34_, (-(this._loadDouble(_34_))));
                }
                while (false);
                sqlite3_result_double((this._loadInt((_34_ + 28))), (this._loadDouble(_34_)));
                break label$0;
            }
            while (false);
            sqlite3_result_error((this._loadInt((_34_ + 28))), 28160, -1);
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final void roundFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        double _34_ = 0.0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_33_ + 40), _31_);
        this._storeInt((_33_ + 36), _32_);
        this._storeInt((_33_ + 32), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_33_ + 40))) != 2) {
                    break label$1;
                }
                if ((sqlite3_value_type((this._loadInt(((this._loadInt((_33_ + 36))) + 4))))) == 5) {
                    break label$0;
                }
                label$2:
                do {
                    if ((this._storeInt((_33_ + 32), (sqlite3_value_int((this._loadInt(((this._loadInt((_33_ + 36))) + 4))))))) < 31) {
                        break label$2;
                    }
                    this._storeInt((_33_ + 32), 30);
                }
                while (false);
                if ((this._loadInt((_33_ + 32))) > -1) {
                    break label$1;
                }
                this._storeInt((_33_ + 32), 0);
            }
            while (false);
            if ((sqlite3_value_type((this._loadInt((this._loadInt((_33_ + 36))))))) == 5) {
                break label$0;
            }
            this._storeDouble((_33_ + 24), (sqlite3_value_double((this._loadInt((this._loadInt((_33_ + 36))))))));
            label$3:
            do {
                label$4:
                do {
                    label$5:
                    do {
                        if ((this._loadInt((_33_ + 32))) != 0) {
                            break label$5;
                        }
                        if (((((_34_ = this._loadDouble((_33_ + 24))) < 0.0) ? 1 : 0) | ((_34_ != _34_) ? 1 : 0)) != 0) {
                            break label$5;
                        }
                        if (((((_34_ = this._loadDouble((_33_ + 24))) >= 9.223372036854776E18) ? 1 : 0) | ((_34_ != _34_) ? 1 : 0)) != 0) {
                            break label$5;
                        }
                        this._storeDouble((_33_ + 24), ((double) (_truncateDoubleToSignedLong(((this._loadDouble((_33_ + 24))) + 0.5)))));
                        break label$4;
                    }
                    while (false);
                    label$6:
                    do {
                        if ((this._loadInt((_33_ + 32))) != 0) {
                            break label$6;
                        }
                        if (((((_34_ = this._loadDouble((_33_ + 24))) >= 0.0) ? 1 : 0) | ((_34_ != _34_) ? 1 : 0)) != 0) {
                            break label$6;
                        }
                        if (((((_34_ = -(this._loadDouble((_33_ + 24)))) >= 9.223372036854776E18) ? 1 : 0) | ((_34_ != _34_) ? 1 : 0)) != 0) {
                            break label$6;
                        }
                        this._storeDouble((_33_ + 24), (-((double) (_truncateDoubleToSignedLong((0.5 - (this._loadDouble((_33_ + 24)))))))));
                        break label$4;
                    }
                    while (false);
                    this._storeDouble((_33_ + 8), (this._loadDouble((_33_ + 24))));
                    this._storeInt(_33_, (this._loadInt((_33_ + 32))));
                    if ((this._storeInt((_33_ + 20), (sqlite3_mprintf(60640, _33_)))) == 0) {
                        break label$3;
                    }
                    sqlite3AtoF((_32_ = this._loadInt((_33_ + 20))), (_33_ + 24), (sqlite3Strlen30(_32_)), 1);
                    sqlite3_free((this._loadInt((_33_ + 20))));
                }
                while (false);
                sqlite3_result_double((this._loadInt((_33_ + 44))), (this._loadDouble((_33_ + 24))));
                break label$0;
            }
            while (false);
            sqlite3_result_error_nomem((this._loadInt((_33_ + 44))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 48));
        return;
    }

    @Override()
    public final void upperFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 12), (sqlite3_value_text((this._loadInt((this._storeInt((_33_ + 20), _32_)))))));
        this._storeInt((_33_ + 4), (sqlite3_value_bytes((this._loadInt((this._loadInt((_33_ + 20))))))));
        label$0:
        do {
            if ((this._loadInt((_33_ + 12))) == 0) {
                break label$0;
            }
            if ((this._storeInt((_33_ + 16), (contextMalloc((this._loadInt((_33_ + 28))), ((this._loadLong32s((_33_ + 4))) + 1L))))) == 0) {
                break label$0;
            }
            memcpy((this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 12))), ((this._loadInt((_33_ + 4))) + 1));
            this._storeInt((_33_ + 8), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt8u(((this._loadInt((_33_ + 16))) + (this._loadInt((_33_ + 8)))))) == 0) {
                        break label$2;
                    }
                    this._storeInt8((_31_ = (this._loadInt((_33_ + 16))) + (_32_ = this._loadInt((_33_ + 8)))), ((_31_ = this._loadInt8u(_31_)) & (((this._loadInt8u((_31_ + 21776))) ^ -1) | 223)));
                    this._storeInt((_33_ + 8), (_32_ + 1));
                    continue label$1;
                }
            }
            while (false);
            sqlite3_result_text((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 16))), -1, 15);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void lowerFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 12), (sqlite3_value_text((this._loadInt((this._storeInt((_33_ + 20), _32_)))))));
        this._storeInt((_33_ + 4), (sqlite3_value_bytes((this._loadInt((this._loadInt((_33_ + 20))))))));
        label$0:
        do {
            if ((this._loadInt((_33_ + 12))) == 0) {
                break label$0;
            }
            if ((this._storeInt((_33_ + 16), (contextMalloc((this._loadInt((_33_ + 28))), ((this._loadLong32s((_33_ + 4))) + 1L))))) == 0) {
                break label$0;
            }
            memcpy((this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 12))), ((this._loadInt((_33_ + 4))) + 1));
            this._storeInt((_33_ + 8), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt8u(((this._loadInt((_33_ + 16))) + (this._loadInt((_33_ + 8)))))) == 0) {
                        break label$2;
                    }
                    this._storeInt8((_31_ = (this._loadInt((_33_ + 16))) + (_32_ = this._loadInt((_33_ + 8)))), (this._loadInt8u(((this._loadInt8u(_31_)) + 19872))));
                    this._storeInt((_33_ + 8), (_32_ + 1));
                    continue label$1;
                }
            }
            while (false);
            sqlite3_result_text((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 16))), -1, 15);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void versionFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        sqlite3_result_text((this._loadInt((_33_ + 12))), (sqlite3_libversion()), -1, 0);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void hexFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_33_ + 40), _31_);
        this._storeInt((_33_ + 24), (sqlite3_value_blob((this._loadInt((this._storeInt((_33_ + 36), _32_)))))));
        this._storeInt((_33_ + 28), (sqlite3_value_bytes((this._loadInt((this._loadInt((_33_ + 36))))))));
        this._storeInt((_33_ + 16), (this._storeInt((_33_ + 20), (contextMalloc((this._loadInt((_33_ + 44))), (((this._loadLong32s((_33_ + 28))) << 1L) | 1L))))));
        label$0:
        do {
            if ((this._loadInt((_33_ + 20))) == 0) {
                break label$0;
            }
            this._storeInt((_33_ + 32), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_33_ + 32))) >= (this._loadInt((_33_ + 28)))) {
                        break label$2;
                    }
                    this._storeInt8((_33_ + 15), (this._loadInt8u((this._loadInt((_33_ + 24))))));
                    _31_ = this._loadInt8u((_33_ + 15));
                    this._storeInt((_33_ + 16), ((_32_ = this._loadInt((_33_ + 16))) + 1));
                    this._storeInt8(_32_, (this._loadInt8u(((_31_ >>> 4) + 60624))));
                    this._storeInt8((_32_ + 1), (this._loadInt8u((((this._loadInt8u((_33_ + 15))) & 15) + 60624))));
                    this._storeInt((_33_ + 16), (_32_ + 2));
                    this._storeInt((_33_ + 32), ((this._loadInt((_33_ + 32))) + 1));
                    this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + 1));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt8((this._loadInt((_33_ + 16))), 0);
            sqlite3_result_text((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 20))), ((this._loadInt((_33_ + 28))) << 1), 15);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 48));
        return;
    }

    @Override()
    public final void randomFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        sqlite3_randomness(8, (_33_ + 8));
        label$0:
        do {
            if ((this._loadLong((_33_ + 8))) > -1L) {
                break label$0;
            }
            this._storeLong((_33_ + 8), (0L - ((this._loadLong((_33_ + 8))) ^ -9223372036854775808L)));
        }
        while (false);
        sqlite3_result_int64((this._loadInt((_33_ + 28))), (this._loadLong((_33_ + 8))));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void randomBlob(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        label$0:
        do {
            if ((this._storeInt((_33_ + 16), (sqlite3_value_int((this._loadInt((this._storeInt((_33_ + 20), _32_)))))))) > 0) {
                break label$0;
            }
            this._storeInt((_33_ + 16), 1);
        }
        while (false);
        label$1:
        do {
            if ((this._storeInt((_33_ + 12), (contextMalloc((this._loadInt((_33_ + 28))), (this._loadLong32s((_33_ + 16))))))) == 0) {
                break label$1;
            }
            sqlite3_randomness((this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 12))));
            sqlite3_result_blob((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 16))), 15);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void nullifFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = this._storeInt(_33_, (sqlite3GetFuncCollSeq((this._loadInt((_33_ + 12))))));
        label$0:
        do {
            if ((sqlite3MemCompare((this._loadInt((_31_ = this._loadInt((_33_ + 4))))), (this._loadInt((_31_ + 4))), _32_)) == 0) {
                break label$0;
            }
            sqlite3_result_value((this._loadInt((_33_ + 12))), (this._loadInt((this._loadInt((_33_ + 4))))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void sourceidFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        sqlite3_result_text((this._loadInt((_33_ + 12))), (sqlite3_sourceid()), -1, 0);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void errlogFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        _32_ = sqlite3_value_int((this._loadInt((this._storeInt((_33_ + 4), _32_)))));
        this._storeInt(_33_, (sqlite3_value_text((this._loadInt(((this._loadInt((_33_ + 4))) + 4))))));
        sqlite3_log(_32_, 22192, _33_);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void compileoptionusedFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        label$0:
        do {
            if ((this._storeInt(_33_, (sqlite3_value_text((this._loadInt((this._storeInt((_33_ + 4), _32_)))))))) == 0) {
                break label$0;
            }
            sqlite3_result_int((this._loadInt((_33_ + 12))), (sqlite3_compileoption_used((this._loadInt(_33_)))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void compileoptiongetFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        _32_ = this._storeInt(_33_, (sqlite3_value_int((this._loadInt((this._storeInt((_33_ + 4), _32_)))))));
        sqlite3_result_text((this._loadInt((_33_ + 12))), (sqlite3_compileoption_get(_32_)), -1, 0);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void quoteFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _34_ = 0;
        int _35_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_34_ + 56), _31_);
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
                            if ((((_32_ = sqlite3_value_type((this._loadInt((this._storeInt((_34_ + 52), _32_)))))) + -1) & 4294967295L) < (2 & 4294967295L)) {
                                break label$4;
                            }
                            if (_32_ == 3) {
                                break label$3;
                            }
                            if (_32_ != 4) {
                                break label$2;
                            }
                            _32_ = this._storeInt((_34_ + 48), 0);
                            this._storeInt((_34_ + 44), (sqlite3_value_blob((this._loadInt((this._loadInt((_34_ + 52))))))));
                            this._storeInt((_34_ + 40), (sqlite3_value_bytes((this._loadInt((this._loadInt((_34_ + 52))))))));
                            if ((this._storeInt((_34_ + 48), (contextMalloc((this._loadInt((_34_ + 60))), (((this._loadLong32s((_34_ + 40))) << 1L) + 4L))))) == 0) {
                                break label$0;
                            }
                            this._storeInt((_34_ + 36), _32_);
                            label$6:
                            do {
                                label$5:
                                while (true) {
                                    if ((this._loadInt((_34_ + 36))) >= (this._loadInt((_34_ + 40)))) {
                                        break label$6;
                                    }
                                    this._storeInt8(((_31_ = (this._loadInt((_34_ + 48))) + ((_32_ = this._loadInt((_34_ + 36))) << 1)) + 2), (this._loadInt8u(((((this._loadInt8u((_32_ = (this._loadInt((_34_ + 44))) + _32_))) >>> 4) & 15) + 60624))));
                                    this._storeInt8((_31_ + 3), (this._loadInt8u((((this._loadInt8u(_32_)) & 15) + 60624))));
                                    this._storeInt((_34_ + 36), ((this._loadInt((_34_ + 36))) + 1));
                                    continue label$5;
                                }
                            }
                            while (false);
                            this._storeInt8(((_32_ = (this._loadInt((_34_ + 48))) + ((this._loadInt((_34_ + 40))) << 1)) + 3), 0);
                            _32_ = this._storeInt8((_32_ + 2), 39);
                            this._storeInt8((this._loadInt((_34_ + 48))), 88);
                            this._storeInt8(((this._loadInt((_34_ + 48))) + 1), _32_);
                            sqlite3_result_text((this._loadInt((_34_ + 60))), (this._loadInt((_34_ + 48))), -1, -1);
                            sqlite3_free((this._loadInt((_34_ + 48))));
                            break label$0;
                        }
                        while (false);
                        sqlite3_result_value((this._loadInt((_34_ + 60))), (this._loadInt((this._loadInt((_34_ + 52))))));
                        break label$0;
                    }
                    while (false);
                    if ((this._storeInt((_34_ + 12), (sqlite3_value_text((this._loadInt((this._loadInt((_34_ + 52))))))))) == 0) {
                        break label$0;
                    }
                    this._storeInt((_34_ + 32), 0);
                    this._storeLong((_34_ + 16), 0L);
                    label$7:
                    while (true) {
                        if ((this._loadInt8u(((this._loadInt((_34_ + 12))) + (this._loadInt((_34_ + 32)))))) == 0) {
                            break label$1;
                        }
                        label$9:
                        do {
                            if ((this._loadInt8u(((this._loadInt((_34_ + 12))) + (this._loadInt((_34_ + 32)))))) != 39) {
                                break label$9;
                            }
                            this._storeLong((_34_ + 16), ((this._loadLong((_34_ + 16))) + 1L));
                        }
                        while (false);
                        this._storeInt((_34_ + 32), ((this._loadInt((_34_ + 32))) + 1));
                        continue label$7;
                    }
                }
                while (false);
                sqlite3_result_text((this._loadInt((_34_ + 60))), 53536, 4, 0);
                break label$0;
            }
            while (false);
            if ((this._storeInt((_34_ + 8), (contextMalloc((this._loadInt((_34_ + 60))), (((this._loadLong32s((_34_ + 32))) + (this._loadLong((_34_ + 16)))) + 3L))))) == 0) {
                break label$0;
            }
            _33_ = this._storeInt8((this._loadInt((_34_ + 8))), 39);
            this._storeInt((_34_ + 32), 0);
            _32_ = this._storeInt((_34_ + 28), 1);
            label$11:
            do {
                label$10:
                while (true) {
                    if ((this._loadInt8u(((this._loadInt((_34_ + 12))) + (this._loadInt((_34_ + 32)))))) == 0) {
                        break label$11;
                    }
                    _31_ = this._loadInt((_34_ + 12));
                    _30_ = this._loadInt((_34_ + 32));
                    this._storeInt((_34_ + 28), ((_35_ = this._loadInt((_34_ + 28))) + _32_));
                    this._storeInt8((_35_ + (this._loadInt((_34_ + 8)))), (this._loadInt8u((_31_ + _30_))));
                    label$12:
                    do {
                        if ((this._loadInt8u(((this._loadInt((_34_ + 12))) + (this._loadInt((_34_ + 32)))))) != _33_) {
                            break label$12;
                        }
                        this._storeInt((_34_ + 28), ((_31_ = this._loadInt((_34_ + 28))) + _32_));
                        this._storeInt8((_31_ + (this._loadInt((_34_ + 8)))), _33_);
                    }
                    while (false);
                    this._storeInt((_34_ + 32), ((this._loadInt((_34_ + 32))) + _32_));
                    continue label$10;
                }
            }
            while (false);
            _32_ = this._storeInt((_34_ + 28), ((_30_ = this._loadInt((_34_ + 28))) + 1));
            this._storeInt8((_30_ + (_31_ = this._loadInt((_34_ + 8)))), 39);
            this._storeInt8((_31_ + _32_), 0);
            sqlite3_result_text((this._loadInt((_34_ + 60))), _31_, _32_, 15);
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 64));
        return;
    }

    @Override()
    public final void last_insert_rowid(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = this._storeInt(_33_, (sqlite3_context_db_handle((this._loadInt((_33_ + 12))))));
        sqlite3_result_int64((this._loadInt((_33_ + 12))), (sqlite3_last_insert_rowid(_32_)));
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void changes(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = this._storeInt(_33_, (sqlite3_context_db_handle((this._loadInt((_33_ + 12))))));
        sqlite3_result_int((this._loadInt((_33_ + 12))), (sqlite3_changes(_32_)));
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void total_changes(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = this._storeInt(_33_, (sqlite3_context_db_handle((this._loadInt((_33_ + 12))))));
        sqlite3_result_int((this._loadInt((_33_ + 12))), (sqlite3_total_changes(_32_)));
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void replaceFunc(int _30_, int _31_, int _32_)
    {
        long _33_ = 0L;
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 76), _30_);
        this._storeInt((_34_ + 72), _31_);
        label$0:
        do {
            if ((this._storeInt((_34_ + 64), (sqlite3_value_text((this._loadInt((this._storeInt((_34_ + 68), _32_)))))))) == 0) {
                break label$0;
            }
            this._storeInt((_34_ + 48), (sqlite3_value_bytes((this._loadInt((this._loadInt((_34_ + 68))))))));
            if ((this._storeInt((_34_ + 60), (sqlite3_value_text((this._loadInt(((this._loadInt((_34_ + 68))) + 4))))))) == 0) {
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
                            if ((this._loadInt8u((this._loadInt((_34_ + 60))))) == 0) {
                                break label$4;
                            }
                            this._storeInt((_34_ + 44), (sqlite3_value_bytes((this._loadInt(((this._loadInt((_34_ + 68))) + 4))))));
                            if ((this._storeInt((_34_ + 56), (sqlite3_value_text((this._loadInt(((this._loadInt((_34_ + 68))) + 8))))))) == 0) {
                                break label$0;
                            }
                            this._storeInt((_34_ + 40), (sqlite3_value_bytes((this._loadInt(((this._loadInt((_34_ + 68))) + 8))))));
                            _33_ = this._storeLong((_34_ + 32), ((long) ((this._loadInt((_34_ + 48))) + 1)));
                            if ((this._storeInt((_34_ + 52), (contextMalloc((this._loadInt((_34_ + 76))), _33_)))) == 0) {
                                break label$0;
                            }
                            this._storeInt((_34_ + 28), ((this._loadInt((_34_ + 48))) - (this._loadInt((_34_ + 44)))));
                            this._storeInt((_34_ + 24), (this._storeInt((_34_ + 20), 0)));
                            label$5:
                            while (true) {
                                if ((this._loadInt((_34_ + 24))) > (this._loadInt((_34_ + 28)))) {
                                    break label$3;
                                }
                                label$7:
                                do {
                                    label$8:
                                    do {
                                        label$9:
                                        do {
                                            if ((this._loadInt8u(((this._loadInt((_34_ + 64))) + (this._loadInt((_34_ + 24)))))) != (this._loadInt8u((this._loadInt((_34_ + 60)))))) {
                                                break label$9;
                                            }
                                            if ((memcmp(((this._loadInt((_34_ + 64))) + (this._loadInt((_34_ + 24)))), (this._loadInt((_34_ + 60))), (this._loadInt((_34_ + 44))))) == 0) {
                                                break label$8;
                                            }
                                        }
                                        while (false);
                                        _32_ = this._loadInt((_34_ + 64));
                                        _31_ = this._loadInt((_34_ + 24));
                                        this._storeInt((_34_ + 20), ((_30_ = this._loadInt((_34_ + 20))) + 1));
                                        this._storeInt8((_30_ + (this._loadInt((_34_ + 52)))), (this._loadInt8u((_32_ + _31_))));
                                        break label$7;
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 12), (sqlite3_context_db_handle((this._loadInt((_34_ + 76))))));
                                    if (((this._storeLong((_34_ + 32), ((this._loadLong((_34_ + 32))) + ((long) ((this._loadInt((_34_ + 40))) - (this._loadInt((_34_ + 44)))))))) + -1L) > (this._loadLong32s(((this._loadInt((_34_ + 12))) + 72)))) {
                                        break label$2;
                                    }
                                    this._storeInt((_34_ + 16), (this._loadInt((_34_ + 52))));
                                    if ((this._storeInt((_34_ + 52), (sqlite3_realloc((this._loadInt((_34_ + 52))), (this._loadInt((_34_ + 32))))))) == 0) {
                                        break label$1;
                                    }
                                    memcpy(((this._loadInt((_34_ + 52))) + (this._loadInt((_34_ + 20)))), (this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 40))));
                                    this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) + (this._loadInt((_34_ + 40)))));
                                    this._storeInt((_34_ + 24), (((this._loadInt((_34_ + 24))) + (this._loadInt((_34_ + 44)))) + -1));
                                }
                                while (false);
                                this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + 1));
                                continue label$5;
                            }
                        }
                        while (false);
                        sqlite3_result_value((this._loadInt((_34_ + 76))), (this._loadInt((this._loadInt((_34_ + 68))))));
                        break label$0;
                    }
                    while (false);
                    memcpy(((this._loadInt((_34_ + 52))) + (this._loadInt((_34_ + 20)))), ((this._loadInt((_34_ + 64))) + (_32_ = this._loadInt((_34_ + 24)))), ((this._loadInt((_34_ + 48))) - _32_));
                    this._storeInt8(((_32_ = this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) + ((this._loadInt((_34_ + 48))) - (this._loadInt((_34_ + 24))))))) + (_31_ = this._loadInt((_34_ + 52)))), 0);
                    sqlite3_result_text((this._loadInt((_34_ + 76))), _31_, _32_, 15);
                    break label$0;
                }
                while (false);
                sqlite3_result_error_toobig((this._loadInt((_34_ + 76))));
                sqlite3_free((this._loadInt((_34_ + 52))));
                break label$0;
            }
            while (false);
            sqlite3_result_error_nomem((this._loadInt((_34_ + 76))));
            sqlite3_free((this._loadInt((_34_ + 16))));
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 80));
        return;
    }

    @Override()
    public final void zeroblobFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 4), (sqlite3_context_db_handle((this._loadInt((_33_ + 28))))));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeLong((_33_ + 8), (sqlite3_value_int64((this._loadInt((this._loadInt((_33_ + 20))))))))) <= (this._loadLong32s(((this._loadInt((_33_ + 4))) + 72)))) {
                    break label$1;
                }
                sqlite3_result_error_toobig((this._loadInt((_33_ + 28))));
                break label$0;
            }
            while (false);
            sqlite3_result_zeroblob((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void loadExt(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 16), (sqlite3_value_text((this._loadInt((this._storeInt((_33_ + 20), _32_)))))));
        this._storeInt((_33_ + 8), (sqlite3_context_db_handle((this._loadInt((_33_ + 28))))));
        _32_ = this._storeInt((_33_ + 4), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_33_ + 24))) != 2) {
                    break label$1;
                }
                this._storeInt((_33_ + 12), (sqlite3_value_text((this._loadInt(((this._loadInt((_33_ + 20))) + 4))))));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 12), _32_);
        }
        while (false);
        label$2:
        do {
            if ((this._loadInt((_33_ + 16))) == 0) {
                break label$2;
            }
            if ((sqlite3_load_extension((this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 12))), (_33_ + 4))) == 0) {
                break label$2;
            }
            sqlite3_result_error((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 4))), -1);
            sqlite3_free((this._loadInt((_33_ + 4))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void sumStep(int _30_, int _31_, int _32_)
    {
        long _33_ = 0L;
        int _34_ = 0;
        double _35_ = 0.0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), (sqlite3_aggregate_context((this._loadInt((_34_ + 28))), 32)));
        this._storeInt((_34_ + 12), (sqlite3_value_numeric_type((this._loadInt((this._loadInt((_34_ + 20))))))));
        label$0:
        do {
            if ((this._loadInt((_34_ + 16))) == 0) {
                break label$0;
            }
            if ((this._loadInt((_34_ + 12))) == 5) {
                break label$0;
            }
            this._storeLong(((_32_ = this._loadInt((_34_ + 16))) + 16), ((this._loadLong((_32_ + 16))) + 1L));
            label$1:
            do {
                if ((this._loadInt((_34_ + 12))) != 1) {
                    break label$1;
                }
                _33_ = this._storeLong(_34_, (sqlite3_value_int64((this._loadInt((this._loadInt((_34_ + 20))))))));
                this._storeDouble((_32_ = this._loadInt((_34_ + 16))), ((this._loadDouble(_32_)) + ((double) _33_)));
                if ((((this._loadInt8u((_32_ + 25))) | (this._loadInt8u((_32_ + 24)))) & 255) != 0) {
                    break label$0;
                }
                if ((sqlite3AddInt64(((this._loadInt((_34_ + 16))) + 8), (this._loadLong(_34_)))) == 0) {
                    break label$0;
                }
                this._storeInt8(((this._loadInt((_34_ + 16))) + 24), 1);
                break label$0;
            }
            while (false);
            _35_ = sqlite3_value_double((this._loadInt((this._loadInt((_34_ + 20))))));
            this._storeInt8(((_32_ = this._loadInt((_34_ + 16))) + 25), 1);
            this._storeDouble(_32_, (_35_ + (this._loadDouble(_32_))));
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final void sumFinalize(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (sqlite3_aggregate_context((this._storeInt((_31_ + 12), _30_)), 0)))) == 0) {
                break label$0;
            }
            if ((this._loadLong(((this._loadInt((_31_ + 8))) + 16))) < 1L) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 8))) + 24))) == 0) {
                    break label$1;
                }
                sqlite3_result_error((this._loadInt((_31_ + 12))), 28160, -1);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 8))) + 25))) == 0) {
                    break label$2;
                }
                sqlite3_result_double((this._loadInt((_31_ + 12))), (this._loadDouble((this._loadInt((_31_ + 8))))));
                break label$0;
            }
            while (false);
            sqlite3_result_int64((this._loadInt((_31_ + 12))), (this._loadLong(((this._loadInt((_31_ + 8))) + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void totalFinalize(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        double _33_ = 0.0;
        _30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (sqlite3_aggregate_context((this._storeInt((_31_ + 12), _30_)), 0)));
        _33_ = 0.0;
        _32_ = this._loadInt((_31_ + 12));
        label$0:
        do {
            if (_30_ == 0) {
                break label$0;
            }
            _33_ = this._loadDouble((this._loadInt((_31_ + 8))));
        }
        while (false);
        sqlite3_result_double(_32_, _33_);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void avgFinalize(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (sqlite3_aggregate_context((this._storeInt((_31_ + 12), _30_)), 0)))) == 0) {
                break label$0;
            }
            if ((this._loadLong(((this._loadInt((_31_ + 8))) + 16))) < 1L) {
                break label$0;
            }
            sqlite3_result_double((this._loadInt((_31_ + 12))), ((this._loadDouble((_30_ = this._loadInt((_31_ + 8))))) / ((double) (this._loadLong((_30_ + 16))))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void countStep(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(_33_, (sqlite3_aggregate_context((this._loadInt((_33_ + 12))), 8)));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_33_ + 8))) == 0) {
                    break label$1;
                }
                if ((sqlite3_value_type((this._loadInt((this._loadInt((_33_ + 4))))))) == 5) {
                    break label$0;
                }
            }
            while (false);
            if ((this._loadInt(_33_)) == 0) {
                break label$0;
            }
            this._storeLong((_32_ = this._loadInt(_33_)), ((this._loadLong(_32_)) + 1L));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void countFinalize(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        long _33_ = 0L;
        _30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (sqlite3_aggregate_context((this._storeInt((_31_ + 12), _30_)), 0)));
        _33_ = 0L;
        _32_ = this._loadInt((_31_ + 12));
        label$0:
        do {
            if (_30_ == 0) {
                break label$0;
            }
            _33_ = this._loadLong((this._loadInt((_31_ + 8))));
        }
        while (false);
        sqlite3_result_int64(_32_, _33_);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void groupConcatStep(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_33_ + 40), _31_);
        label$0:
        do {
            if ((sqlite3_value_type((this._loadInt((this._storeInt((_33_ + 36), _32_)))))) == 5) {
                break label$0;
            }
            if ((this._storeInt((_33_ + 28), (sqlite3_aggregate_context((this._loadInt((_33_ + 44))), 28)))) == 0) {
                break label$0;
            }
            this._storeInt((_33_ + 12), (sqlite3_context_db_handle((this._loadInt((_33_ + 44))))));
            this._storeInt((_33_ + 8), (((this._loadInt8u(((this._loadInt((_33_ + 28))) + 25))) == 0) ? 1 : 0));
            _32_ = this._storeInt8(((this._loadInt((_33_ + 28))) + 25), 2);
            this._storeInt(((this._loadInt((_33_ + 28))) + 20), (this._loadInt(((this._loadInt((_33_ + 12))) + 72))));
            label$1:
            do {
                if ((this._loadInt((_33_ + 8))) != 0) {
                    break label$1;
                }
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_33_ + 40))) != _32_) {
                            break label$3;
                        }
                        this._storeInt((_33_ + 24), (sqlite3_value_text((this._loadInt(((this._loadInt((_33_ + 36))) + 4))))));
                        this._storeInt((_33_ + 16), (sqlite3_value_bytes((this._loadInt(((this._loadInt((_33_ + 36))) + 4))))));
                        break label$2;
                    }
                    while (false);
                    this._storeInt((_33_ + 24), 28144);
                    this._storeInt((_33_ + 16), 1);
                }
                while (false);
                sqlite3StrAccumAppend((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 16))));
            }
            while (false);
            this._storeInt((_33_ + 32), (sqlite3_value_text((this._loadInt((this._loadInt((_33_ + 36))))))));
            _32_ = this._storeInt((_33_ + 20), (sqlite3_value_bytes((this._loadInt((this._loadInt((_33_ + 36))))))));
            sqlite3StrAccumAppend((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 32))), _32_);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 48));
        return;
    }

    @Override()
    public final void groupConcatFinalize(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (sqlite3_aggregate_context((this._storeInt((_31_ + 12), _30_)), 0)))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 8))) + 26))) == 0) {
                    break label$1;
                }
                sqlite3_result_error_toobig((this._loadInt((_31_ + 12))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 8))) + 24))) == 0) {
                    break label$2;
                }
                sqlite3_result_error_nomem((this._loadInt((_31_ + 12))));
                break label$0;
            }
            while (false);
            sqlite3_result_text((this._loadInt((_31_ + 12))), (sqlite3StrAccumFinish((this._loadInt((_31_ + 8))))), -1, 15);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void likeFunc(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_33_ + 40), _31_);
        this._storeInt((_33_ + 36), _32_);
        this._storeInt((_33_ + 24), 0);
        this._storeInt((_33_ + 16), (sqlite3_context_db_handle((this._loadInt((_33_ + 44))))));
        this._storeInt((_33_ + 28), (sqlite3_value_text((this._loadInt((this._loadInt((_33_ + 36))))))));
        this._storeInt((_33_ + 32), (sqlite3_value_text((this._loadInt(((this._loadInt((_33_ + 36))) + 4))))));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_33_ + 20), (sqlite3_value_bytes((this._loadInt((this._loadInt((_33_ + 36))))))))) <= (this._loadInt(((this._loadInt((_33_ + 16))) + 104)))) {
                    break label$1;
                }
                sqlite3_result_error((this._loadInt((_33_ + 44))), 28048, -1);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt((_33_ + 40))) != 3) {
                    break label$2;
                }
                if ((this._storeInt((_33_ + 12), (sqlite3_value_text((this._loadInt(((this._loadInt((_33_ + 36))) + 8))))))) == 0) {
                    break label$0;
                }
                label$3:
                do {
                    if ((sqlite3Utf8CharLen((this._loadInt((_33_ + 12))), -1)) == 1) {
                        break label$3;
                    }
                    sqlite3_result_error((this._loadInt((_33_ + 44))), 28096, -1);
                    break label$0;
                }
                while (false);
                this._storeInt((_33_ + 24), (sqlite3Utf8Read((this._loadInt((_33_ + 12))), (_33_ + 12))));
            }
            while (false);
            if ((this._loadInt((_33_ + 32))) == 0) {
                break label$0;
            }
            if ((this._loadInt((_33_ + 28))) == 0) {
                break label$0;
            }
            _32_ = this._storeInt((_33_ + 8), (sqlite3_user_data((this._loadInt((_33_ + 44))))));
            sqlite3_result_int((this._loadInt((_33_ + 44))), (patternCompare((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 32))), _32_, (this._loadInt((_33_ + 24))))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 48));
        return;
    }

    @Override()
    public final int sqlite3_value_bytes(int _30_)
    {
        int _31_ = 0;
        _30_ = sqlite3ValueBytes((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 1);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3Utf8CharLen(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 32) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        _31_ = this._storeInt((_32_ + 20), 0);
        this._storeInt((_32_ + 16), (this._loadInt((_32_ + 28))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_32_ + 24))) < _31_) {
                    break label$1;
                }
                this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 16))) + (this._loadInt((_32_ + 24)))));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), -1);
        }
        while (false);
        label$2:
        while (true) {
            _31_ = 0;
            label$4:
            do {
                if ((this._loadInt8u((this._loadInt((_32_ + 16))))) == 0) {
                    break label$4;
                }
                _31_ = (((this._loadInt((_32_ + 16))) & 4294967295L) < ((this._loadInt((_32_ + 12))) & 4294967295L)) ? 1 : 0;
            }
            while (false);
            label$5:
            do {
                label$6:
                do {
                    if (_31_ == 0) {
                        break label$6;
                    }
                    this._storeInt((_32_ + 16), ((_31_ = this._loadInt((_32_ + 16))) + 1));
                    if ((this._loadInt8u(_31_)) < 192) {
                        break label$5;
                    }
                    label$7:
                    while (true) {
                        if (((this._loadInt8u((this._loadInt((_32_ + 16))))) & 192) != 128) {
                            break label$5;
                        }
                        this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                        continue label$7;
                    }
                }
                while (false);
                return (this._loadInt((_32_ + 20)));
            }
            while (false);
            this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1));
            continue label$2;
        }
    }

    @Override()
    public final int sqlite3Utf8Read(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 12), ((_31_ = this._loadInt((_32_ + 12))) + 1));
        label$0:
        do {
            if (((this._storeInt((_32_ + 4), (this._loadInt8u(_31_)))) & 4294967295L) < (192 & 4294967295L)) {
                break label$0;
            }
            this._storeInt((_32_ + 4), (this._loadInt8u(((this._loadInt((_32_ + 4))) + 26288))));
            label$2:
            do {
                label$1:
                while (true) {
                    if (((this._loadInt8u((this._loadInt((_32_ + 12))))) & 192) != 128) {
                        break label$2;
                    }
                    _31_ = this._loadInt((_32_ + 4));
                    this._storeInt((_32_ + 12), ((_30_ = this._loadInt((_32_ + 12))) + 1));
                    this._storeInt((_32_ + 4), ((_31_ << 6) | ((this._loadInt8u(_30_)) & 63)));
                    continue label$1;
                }
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_32_ + 4))) & 4294967295L) < (128 & 4294967295L)) {
                    break label$3;
                }
                if (((this._loadInt((_32_ + 4))) & -2048) == 55296) {
                    break label$3;
                }
                if (((this._loadInt((_32_ + 4))) & -2) != 65534) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt((_32_ + 4), 65533);
        }
        while (false);
        this._storeInt((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 12))));
        return (this._loadInt((_32_ + 4)));
    }

    @Override()
    public final int sqlite3_user_data(int _30_)
    {
        return (this._loadInt(((this._loadInt((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)))) + 4)));
    }

    @Override()
    public final int patternCompare(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_34_ + 36), _31_);
        this._storeInt((_34_ + 32), _32_);
        this._storeInt((_34_ + 28), _33_);
        this._storeInt8((_34_ + 11), (this._loadInt8u(((this._loadInt((_34_ + 32))) + 1))));
        this._storeInt8((_34_ + 10), (this._loadInt8u((this._loadInt((_34_ + 32))))));
        this._storeInt8((_34_ + 9), (this._loadInt8u(((this._loadInt((_34_ + 32))) + 2))));
        this._storeInt8((_34_ + 8), (this._loadInt8u(((this._loadInt((_34_ + 32))) + 3))));
        _31_ = this._storeInt((_34_ + 4), 0);
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
                                                label$11:
                                                do {
                                                    label$10:
                                                    while (true) {
                                                        if ((this._storeInt((_34_ + 24), (sqlite3Utf8Read((this._loadInt((_34_ + 40))), (_34_ + 40))))) == 0) {
                                                            break label$9;
                                                        }
                                                        label$12:
                                                        do {
                                                            if ((this._loadInt((_34_ + 4))) != 0) {
                                                                break label$12;
                                                            }
                                                            if ((this._loadInt((_34_ + 24))) == (this._loadInt8u((_34_ + 10)))) {
                                                                break label$11;
                                                            }
                                                        }
                                                        while (false);
                                                        label$13:
                                                        do {
                                                            if ((this._loadInt((_34_ + 4))) != 0) {
                                                                break label$13;
                                                            }
                                                            if ((this._loadInt((_34_ + 24))) != (this._loadInt8u((_34_ + 11)))) {
                                                                break label$13;
                                                            }
                                                            if ((sqlite3Utf8Read((this._loadInt((_34_ + 36))), (_34_ + 36))) != 0) {
                                                                continue label$10;
                                                            }
                                                            break label$4;
                                                        }
                                                        while (false);
                                                        label$14:
                                                        do {
                                                            label$15:
                                                            do {
                                                                label$16:
                                                                do {
                                                                    if ((this._loadInt((_34_ + 24))) != (this._loadInt8u((_34_ + 9)))) {
                                                                        break label$16;
                                                                    }
                                                                    _32_ = this._storeInt((_34_ + 16), (this._storeInt((_34_ + 12), (this._storeInt(_34_, _31_)))));
                                                                    if ((this._storeInt((_34_ + 24), (sqlite3Utf8Read((this._loadInt((_34_ + 36))), (_34_ + 36))))) == 0) {
                                                                        break label$7;
                                                                    }
                                                                    label$17:
                                                                    do {
                                                                        if ((this._storeInt((_34_ + 20), (sqlite3Utf8Read((this._loadInt((_34_ + 40))), (_34_ + 40))))) != 94) {
                                                                            break label$17;
                                                                        }
                                                                        this._storeInt((_34_ + 16), 1);
                                                                        this._storeInt((_34_ + 20), (sqlite3Utf8Read((this._loadInt((_34_ + 40))), (_34_ + 40))));
                                                                    }
                                                                    while (false);
                                                                    label$18:
                                                                    do {
                                                                        if ((this._loadInt((_34_ + 20))) != 93) {
                                                                            break label$18;
                                                                        }
                                                                        label$19:
                                                                        do {
                                                                            if ((this._loadInt((_34_ + 24))) != 93) {
                                                                                break label$19;
                                                                            }
                                                                            this._storeInt((_34_ + 12), 1);
                                                                        }
                                                                        while (false);
                                                                        this._storeInt((_34_ + 20), (sqlite3Utf8Read((this._loadInt((_34_ + 40))), (_34_ + 40))));
                                                                    }
                                                                    while (false);
                                                                    label$20:
                                                                    while (true) {
                                                                        _33_ = 0;
                                                                        label$22:
                                                                        do {
                                                                            if ((this._loadInt((_34_ + 20))) == 0) {
                                                                                break label$22;
                                                                            }
                                                                            _33_ = ((this._loadInt((_34_ + 20))) != 93) ? 1 : 0;
                                                                        }
                                                                        while (false);
                                                                        if (_33_ == 0) {
                                                                            break label$15;
                                                                        }
                                                                        label$23:
                                                                        do {
                                                                            label$24:
                                                                            do {
                                                                                if ((this._loadInt((_34_ + 20))) != 45) {
                                                                                    break label$24;
                                                                                }
                                                                                if ((this._loadInt8u((this._loadInt((_34_ + 40))))) == 93) {
                                                                                    break label$24;
                                                                                }
                                                                                if ((this._loadInt8u((this._loadInt((_34_ + 40))))) == 0) {
                                                                                    break label$24;
                                                                                }
                                                                                if ((this._loadInt(_34_)) == 0) {
                                                                                    break label$24;
                                                                                }
                                                                                this._storeInt((_34_ + 20), (sqlite3Utf8Read((this._loadInt((_34_ + 40))), (_34_ + 40))));
                                                                                label$25:
                                                                                do {
                                                                                    if (((this._loadInt((_34_ + 24))) & 4294967295L) < ((this._loadInt(_34_)) & 4294967295L)) {
                                                                                        break label$25;
                                                                                    }
                                                                                    if (((this._loadInt((_34_ + 24))) & 4294967295L) > ((this._loadInt((_34_ + 20))) & 4294967295L)) {
                                                                                        break label$25;
                                                                                    }
                                                                                    this._storeInt((_34_ + 12), 1);
                                                                                }
                                                                                while (false);
                                                                                this._storeInt(_34_, _32_);
                                                                                break label$23;
                                                                            }
                                                                            while (false);
                                                                            label$26:
                                                                            do {
                                                                                if ((this._loadInt((_34_ + 24))) != (this._loadInt((_34_ + 20)))) {
                                                                                    break label$26;
                                                                                }
                                                                                this._storeInt((_34_ + 12), 1);
                                                                            }
                                                                            while (false);
                                                                            this._storeInt(_34_, (this._loadInt((_34_ + 20))));
                                                                        }
                                                                        while (false);
                                                                        this._storeInt((_34_ + 20), (sqlite3Utf8Read((this._loadInt((_34_ + 40))), (_34_ + 40))));
                                                                        continue label$20;
                                                                    }
                                                                }
                                                                while (false);
                                                                label$27:
                                                                do {
                                                                    if ((this._loadInt((_34_ + 28))) != (this._loadInt((_34_ + 24)))) {
                                                                        break label$27;
                                                                    }
                                                                    if ((this._loadInt((_34_ + 4))) == 0) {
                                                                        break label$14;
                                                                    }
                                                                }
                                                                while (false);
                                                                this._storeInt((_34_ + 20), (sqlite3Utf8Read((this._loadInt((_34_ + 36))), (_34_ + 36))));
                                                                label$28:
                                                                do {
                                                                    if ((this._loadInt8u((_34_ + 8))) == 0) {
                                                                        break label$28;
                                                                    }
                                                                    label$29:
                                                                    do {
                                                                        if (((this._loadInt((_34_ + 24))) & -128) != 0) {
                                                                            break label$29;
                                                                        }
                                                                        this._storeInt((_34_ + 24), (this._loadInt8u(((this._loadInt((_34_ + 24))) + 19872))));
                                                                    }
                                                                    while (false);
                                                                    if (((this._loadInt((_34_ + 20))) & -128) != 0) {
                                                                        break label$28;
                                                                    }
                                                                    this._storeInt((_34_ + 20), (this._loadInt8u(((this._loadInt((_34_ + 20))) + 19872))));
                                                                }
                                                                while (false);
                                                                if ((this._loadInt((_34_ + 24))) != (this._loadInt((_34_ + 20)))) {
                                                                    break label$6;
                                                                }
                                                                this._storeInt((_34_ + 4), _31_);
                                                                continue label$10;
                                                            }
                                                            while (false);
                                                            if ((this._loadInt((_34_ + 20))) == 0) {
                                                                break label$8;
                                                            }
                                                            if (((this._loadInt((_34_ + 12))) ^ (this._loadInt((_34_ + 16)))) != 0) {
                                                                continue label$10;
                                                            }
                                                            break label$8;
                                                        }
                                                        while (false);
                                                        this._storeInt((_34_ + 4), 1);
                                                        continue label$10;
                                                    }
                                                }
                                                while (false);
                                                label$30$end:
                                                do {
                                                    label$30:
                                                    while (true) {
                                                        _33_ = 1;
                                                        label$32:
                                                        do {
                                                            if ((this._storeInt((_34_ + 24), (sqlite3Utf8Read((this._loadInt((_34_ + 40))), (_34_ + 40))))) == (this._loadInt8u((_34_ + 10)))) {
                                                                break label$32;
                                                            }
                                                            _33_ = ((this._loadInt((_34_ + 24))) == (this._loadInt8u((_34_ + 11)))) ? 1 : 0;
                                                        }
                                                        while (false);
                                                        if (_33_ == 0) {
                                                            break label$5;
                                                        }
                                                        if ((this._loadInt((_34_ + 24))) != (this._loadInt8u((_34_ + 11)))) {
                                                            continue label$30;
                                                        }
                                                        if ((sqlite3Utf8Read((this._loadInt((_34_ + 36))), (_34_ + 36))) != 0) {
                                                            continue label$30;
                                                        }
                                                        break label$30$end;
                                                    }
                                                }
                                                while (false);
                                                this._storeInt((_34_ + 44), 0);
                                                break label$0;
                                            }
                                            while (false);
                                            this._storeInt((_34_ + 44), (((this._loadInt8u((this._loadInt((_34_ + 36))))) == 0) ? 1 : 0));
                                            break label$0;
                                        }
                                        while (false);
                                        this._storeInt((_34_ + 44), 0);
                                        break label$0;
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 44), 0);
                                    break label$0;
                                }
                                while (false);
                                this._storeInt((_34_ + 44), 0);
                                break label$0;
                            }
                            while (false);
                            if ((this._loadInt((_34_ + 24))) == 0) {
                                break label$3;
                            }
                            if ((this._loadInt((_34_ + 24))) != (this._loadInt((_34_ + 28)))) {
                                break label$2;
                            }
                            if ((this._storeInt((_34_ + 24), (sqlite3Utf8Read((this._loadInt((_34_ + 40))), (_34_ + 40))))) != 0) {
                                break label$1;
                            }
                            this._storeInt((_34_ + 44), 0);
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_34_ + 44), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_34_ + 44), 1);
                    break label$0;
                }
                while (false);
                if ((this._loadInt((_34_ + 24))) != (this._loadInt8u((_34_ + 9)))) {
                    break label$1;
                }
                label$34:
                do {
                    label$33:
                    while (true) {
                        _33_ = 0;
                        label$35:
                        do {
                            if ((this._loadInt8u((this._loadInt((_34_ + 36))))) == 0) {
                                break label$35;
                            }
                            _33_ = ((patternCompare(((this._loadInt((_34_ + 40))) + -1), (this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 32))), (this._loadInt((_34_ + 28))))) == 0) ? 1 : 0;
                        }
                        while (false);
                        if (_33_ == 0) {
                            break label$34;
                        }
                        this._storeInt((_34_ + 36), ((_33_ = this._loadInt((_34_ + 36))) + 1));
                        if ((this._loadInt8u(_33_)) < 192) {
                            continue label$33;
                        }
                        label$36:
                        while (true) {
                            if (((this._loadInt8u((this._loadInt((_34_ + 36))))) & 192) != 128) {
                                continue label$33;
                            }
                            this._storeInt((_34_ + 36), ((this._loadInt((_34_ + 36))) + 1));
                            continue label$36;
                        }
                    }
                }
                while (false);
                this._storeInt((_34_ + 44), (((this._loadInt8u((this._loadInt((_34_ + 36))))) != 0) ? 1 : 0));
                break label$0;
            }
            while (false);
            label$38:
            do {
                label$39:
                do {
                    label$40$end:
                    do {
                        label$40:
                        while (true) {
                            if ((this._storeInt((_34_ + 20), (sqlite3Utf8Read((this._loadInt((_34_ + 36))), (_34_ + 36))))) == 0) {
                                break label$39;
                            }
                            label$42:
                            do {
                                label$43:
                                do {
                                    label$44:
                                    do {
                                        if ((this._loadInt8u((_34_ + 8))) == 0) {
                                            break label$44;
                                        }
                                        label$45:
                                        do {
                                            if (((this._loadInt((_34_ + 20))) & -128) != 0) {
                                                break label$45;
                                            }
                                            this._storeInt((_34_ + 20), (this._loadInt8u(((this._loadInt((_34_ + 20))) + 19872))));
                                        }
                                        while (false);
                                        if (((this._loadInt((_34_ + 24))) & -128) != 0) {
                                            break label$43;
                                        }
                                        this._storeInt((_34_ + 24), (this._loadInt8u(((this._loadInt((_34_ + 24))) + 19872))));
                                        break label$43;
                                    }
                                    while (false);
                                    label$46:
                                    while (true) {
                                        _33_ = 0;
                                        label$48:
                                        do {
                                            if ((this._loadInt((_34_ + 20))) == 0) {
                                                break label$48;
                                            }
                                            _33_ = ((this._loadInt((_34_ + 20))) != (this._loadInt((_34_ + 24)))) ? 1 : 0;
                                        }
                                        while (false);
                                        if (_33_ == 0) {
                                            break label$42;
                                        }
                                        this._storeInt((_34_ + 20), (sqlite3Utf8Read((this._loadInt((_34_ + 36))), (_34_ + 36))));
                                        continue label$46;
                                    }
                                }
                                while (false);
                                label$50:
                                do {
                                    label$49:
                                    while (true) {
                                        _33_ = 0;
                                        label$51:
                                        do {
                                            if ((this._loadInt((_34_ + 20))) == 0) {
                                                break label$51;
                                            }
                                            _33_ = ((this._loadInt((_34_ + 20))) != (this._loadInt((_34_ + 24)))) ? 1 : 0;
                                        }
                                        while (false);
                                        if (_33_ == 0) {
                                            break label$50;
                                        }
                                        if (((this._storeInt((_34_ + 20), (sqlite3Utf8Read((this._loadInt((_34_ + 36))), (_34_ + 36))))) & -128) != 0) {
                                            continue label$49;
                                        }
                                        this._storeInt((_34_ + 20), (this._loadInt8u(((this._loadInt((_34_ + 20))) + 19872))));
                                        continue label$49;
                                    }
                                }
                                while (false);
                            }
                            while (false);
                            if ((this._loadInt((_34_ + 20))) == 0) {
                                break label$38;
                            }
                            if ((patternCompare((this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 32))), (this._loadInt((_34_ + 28))))) == 0) {
                                continue label$40;
                            }
                            break label$40$end;
                        }
                    }
                    while (false);
                    this._storeInt((_34_ + 44), 1);
                    break label$0;
                }
                while (false);
                this._storeInt((_34_ + 44), 0);
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
    public final void sqlite3_result_int(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        sqlite3VdbeMemSetInt64(((this._loadInt((_32_ + 12))) + 8), (this._loadLong32s((_32_ + 8))));
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void sqlite3VdbeMemSetInt64(int _30_, long _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeLong(_32_, _31_);
        sqlite3VdbeMemRelease((this._loadInt((_32_ + 12))));
        this._storeInt8(((_30_ = this._loadInt((_32_ + 12))) + 30), 1);
        this._storeInt16((_30_ + 28), 4);
        this._storeLong((_30_ + 16), (this._loadLong(_32_)));
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int sqlite3ValueBytes(int _30_, int _31_)
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
                    if (((this._loadInt16u(((this._storeInt(_32_, (this._loadInt((_32_ + 8))))) + 28))) & 16) != 0) {
                        break label$2;
                    }
                    if ((sqlite3ValueText((this._loadInt((_32_ + 8))), (this._loadInt8u((_32_ + 7))))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                label$3:
                do {
                    if (((this._loadInt16u(((this._loadInt(_32_)) + 28))) & 16384) == 0) {
                        break label$3;
                    }
                    this._storeInt((_32_ + 12), ((this._loadInt(((_31_ = this._loadInt(_32_)) + 24))) + (this._loadInt((_31_ + 16)))));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt(_32_)) + 24))));
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
    public final int sqlite3_aggregate_context(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if (((this._loadInt16u(((this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 12))) + 48))))) + 28))) & 8192) != 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt((_32_ + 8))) > 0) {
                    break label$1;
                }
                sqlite3VdbeMemReleaseExternal((this._loadInt((_32_ + 4))));
                this._storeInt(((_31_ = this._loadInt((_32_ + 4))) + 4), 0);
                this._storeInt16((_31_ + 28), 1);
                break label$0;
            }
            while (false);
            sqlite3VdbeMemGrow((this._loadInt((_32_ + 4))), (this._loadInt((_32_ + 8))), 0);
            this._storeInt16(((_31_ = this._loadInt((_32_ + 4))) + 28), 8192);
            this._storeInt((_31_ + 16), (this._loadInt((this._loadInt((_32_ + 12))))));
            if ((this._loadInt(((this._loadInt((_32_ + 4))) + 4))) == 0) {
                break label$0;
            }
            memset((this._loadInt(((this._loadInt((_32_ + 4))) + 4))), 0, (this._loadInt((_32_ + 8))));
        }
        while (false);
        _31_ = this._loadInt(((this._loadInt((_32_ + 4))) + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void sqlite3StrAccumAppend(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        label$0:
        do {
            if ((((this._loadInt8u(((_32_ = this._loadInt((_33_ + 28))) + 26))) | (this._loadInt8u((_32_ + 24)))) & 255) != 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt((_33_ + 20))) > -1) {
                    break label$1;
                }
                this._storeInt((_33_ + 20), (sqlite3Strlen30((this._loadInt((_33_ + 24))))));
            }
            while (false);
            if ((this._loadInt((_33_ + 20))) == 0) {
                break label$0;
            }
            if ((this._loadInt((_33_ + 24))) == 0) {
                break label$0;
            }
            label$2:
            do {
                label$3:
                do {
                    if (((this._loadInt(((_32_ = this._loadInt((_33_ + 28))) + 12))) + (this._loadInt((_33_ + 20)))) < (this._loadInt((_32_ + 16)))) {
                        break label$3;
                    }
                    label$4:
                    do {
                        label$5:
                        do {
                            if ((this._loadInt8u(((this._loadInt((_33_ + 28))) + 25))) == 0) {
                                break label$5;
                            }
                            _32_ = 0;
                            label$6:
                            do {
                                if ((this._loadInt(((_31_ = this._loadInt((_33_ + 28))) + 8))) == (this._loadInt((_31_ + 4)))) {
                                    break label$6;
                                }
                                _32_ = this._loadInt(((this._loadInt((_33_ + 28))) + 8));
                            }
                            while (false);
                            this._storeInt((_33_ + 12), _32_);
                            if ((this._storeLong(_33_, ((this._storeLong(_33_, (this._loadLong32s(((this._loadInt((_33_ + 28))) + 12))))) + ((long) ((this._loadInt((_33_ + 20))) + 1))))) <= (this._loadLong32s(((this._loadInt((_33_ + 28))) + 20)))) {
                                break label$4;
                            }
                            sqlite3StrAccumReset((this._loadInt((_33_ + 28))));
                            this._storeInt8(((this._loadInt((_33_ + 28))) + 26), 1);
                            break label$0;
                        }
                        while (false);
                        _31_ = this._storeInt8(((_32_ = this._loadInt((_33_ + 28))) + 26), 1);
                        if ((this._storeInt((_33_ + 20), (((this._loadInt((_32_ + 16))) - (this._loadInt((_32_ + 12)))) + -1))) < _31_) {
                            break label$0;
                        }
                        break label$3;
                    }
                    while (false);
                    this._storeLong32(((_32_ = this._loadInt((_33_ + 28))) + 16), (this._loadLong(_33_)));
                    label$7:
                    do {
                        label$8:
                        do {
                            if ((this._loadInt8u((_32_ + 25))) != 1) {
                                break label$8;
                            }
                            this._storeInt((_33_ + 16), (sqlite3DbRealloc((this._loadInt((_32_ = this._loadInt((_33_ + 28))))), (this._loadInt((_33_ + 12))), (this._loadInt((_32_ + 16))))));
                            break label$7;
                        }
                        while (false);
                        this._storeInt((_33_ + 16), (sqlite3_realloc((this._loadInt((_33_ + 12))), (this._loadInt(((this._loadInt((_33_ + 28))) + 16))))));
                    }
                    while (false);
                    if ((this._loadInt((_33_ + 16))) == 0) {
                        break label$2;
                    }
                    label$9:
                    do {
                        if ((this._loadInt((_33_ + 12))) != 0) {
                            break label$9;
                        }
                        memcpy((this._loadInt((_33_ + 16))), (this._loadInt(((_32_ = this._loadInt((_33_ + 28))) + 8))), (this._loadInt((_32_ + 12))));
                    }
                    while (false);
                    this._storeInt(((this._loadInt((_33_ + 28))) + 8), (this._loadInt((_33_ + 16))));
                }
                while (false);
                memcpy(((this._loadInt(((_32_ = this._loadInt((_33_ + 28))) + 8))) + (this._loadInt((_32_ + 12)))), (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))));
                this._storeInt(((_32_ = this._loadInt((_33_ + 28))) + 12), ((this._loadInt((_32_ + 12))) + (this._loadInt((_33_ + 20)))));
                break label$0;
            }
            while (false);
            this._storeInt8(((_32_ = this._loadInt((_33_ + 28))) + 24), 1);
            sqlite3StrAccumReset(_32_);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void sqlite3StrAccumReset(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt(((_30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 8))) == (this._loadInt((_30_ + 4)))) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_31_ + 12))) + 25))) != 1) {
                    break label$1;
                }
                sqlite3DbFree((this._loadInt((_30_ = this._loadInt((_31_ + 12))))), (this._loadInt((_30_ + 8))));
                break label$0;
            }
            while (false);
            sqlite3_free((this._loadInt(((this._loadInt((_31_ + 12))) + 8))));
        }
        while (false);
        this._storeInt(((this._loadInt((_31_ + 12))) + 8), 0);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void sqlite3_result_int64(int _30_, long _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeLong(_32_, _31_);
        sqlite3VdbeMemSetInt64(((this._loadInt((_32_ + 12))) + 8), _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int sqlite3_value_numeric_type(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._storeInt((_31_ + 12), _30_)))) + 30))) != 3) {
                break label$0;
            }
            applyNumericAffinity((this._loadInt((_31_ + 8))));
            sqlite3VdbeMemStoreType((this._loadInt((_31_ + 8))));
        }
        while (false);
        _30_ = this._loadInt8u(((this._loadInt((_31_ + 8))) + 30));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final long sqlite3_value_int64(int _30_)
    {
        int _31_ = 0;
        long _32_ = 0L;
        _32_ = sqlite3VdbeIntValue((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return _32_;
    }

    @Override()
    public final int sqlite3AddInt64(int _30_, long _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeLong((_32_ + 16), _31_);
        this._storeLong((_32_ + 8), (this._loadLong((this._loadInt((_32_ + 24))))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadLong((_32_ + 16))) < 0L) {
                        break label$2;
                    }
                    if ((this._loadLong((_32_ + 8))) < 1L) {
                        break label$1;
                    }
                    if ((9223372036854775807L - (this._loadLong((_32_ + 8)))) >= (this._loadLong((_32_ + 16)))) {
                        break label$1;
                    }
                    this._storeInt((_32_ + 28), 1);
                    return (this._loadInt((_32_ + 28)));
                }
                while (false);
                label$3:
                do {
                    if ((this._loadLong((_32_ + 8))) > -1L) {
                        break label$3;
                    }
                    if ((-9223372036854775807L - (this._loadLong((_32_ + 8)))) <= ((this._loadLong((_32_ + 16))) + 1L)) {
                        break label$3;
                    }
                    this._storeInt((_32_ + 28), 1);
                    return (this._loadInt((_32_ + 28)));
                }
                while (false);
                this._storeLong((_30_ = this._loadInt((_32_ + 24))), ((this._loadLong(_30_)) + (this._loadLong((_32_ + 16)))));
                break label$0;
            }
            while (false);
            this._storeLong((_30_ = this._loadInt((_32_ + 24))), ((this._loadLong(_30_)) + (this._loadLong((_32_ + 16)))));
        }
        while (false);
        this._storeInt((_32_ + 28), 0);
        return (this._loadInt((_32_ + 28)));
    }

    @Override()
    public final long sqlite3VdbeIntValue(int _30_)
    {
        int _31_ = 0;
        long _32_ = 0L;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 16), (this._loadInt16u(((this._storeInt((_31_ + 20), _30_)) + 28))));
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt8u((_31_ + 16))) & 4) == 0) {
                    break label$1;
                }
                this._storeLong((_31_ + 24), (this._loadLong(((this._loadInt((_31_ + 20))) + 16))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt8u((_31_ + 16))) & 8) == 0) {
                    break label$2;
                }
                this._storeLong((_31_ + 24), (doubleToInt64((this._loadDouble(((this._loadInt((_31_ + 20))) + 8))))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt8u((_31_ + 16))) & 18) == 0) {
                    break label$3;
                }
                this._storeLong((_31_ + 8), 0L);
                sqlite3Atoi64((this._loadInt(((_30_ = this._loadInt((_31_ + 20))) + 4))), (_31_ + 8), (this._loadInt((_30_ + 24))), (this._loadInt8u((_30_ + 31))));
                this._storeLong((_31_ + 24), (this._loadLong((_31_ + 8))));
                break label$0;
            }
            while (false);
            this._storeLong((_31_ + 24), 0L);
        }
        while (false);
        _32_ = this._loadLong((_31_ + 24));
        this._storeInt((0 + 4), (_31_ + 32));
        return _32_;
    }

    @Override()
    public final long doubleToInt64(double _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if (((((_30_ = this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), _30_)) >= -9.223372036854776E18) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                break label$0;
            }
            this._storeLong((_31_ + 8), -9223372036854775808L);
            return (this._loadLong((_31_ + 8)));
        }
        while (false);
        label$1:
        do {
            if (((((_30_ = this._loadDouble(_31_)) <= 9.223372036854776E18) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                break label$1;
            }
            this._storeLong((_31_ + 8), -9223372036854775808L);
            return (this._loadLong((_31_ + 8)));
        }
        while (false);
        this._storeLong((_31_ + 8), (_truncateDoubleToSignedLong((this._loadDouble(_31_)))));
        return (this._loadLong((_31_ + 8)));
    }

    @Override()
    public final int sqlite3Atoi64(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        int _temp$3 = 0;
        int _temp$4 = 0;
        int _temp$5 = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_34_ + 52), _31_);
        this._storeInt((_34_ + 48), _32_);
        _temp$0 = 1;
        _temp$1 = 2;
        _temp$2 = ((this._storeInt8((_34_ + 47), _33_)) == 1) ? _temp$0 : _temp$1;
        this._storeInt((_34_ + 40), _temp$2);
        this._storeLong((_34_ + 32), 0L);
        this._storeInt((_34_ + 20), (this._storeInt((_34_ + 28), 0)));
        this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 56))) + (this._loadInt((_34_ + 48)))));
        label$0:
        do {
            if ((this._loadInt8u((_34_ + 47))) != 3) {
                break label$0;
            }
            this._storeInt((_34_ + 56), ((this._loadInt((_34_ + 56))) + 1));
        }
        while (false);
        label$2:
        do {
            label$1:
            while (true) {
                _33_ = 0;
                label$3:
                do {
                    if (((this._loadInt((_34_ + 56))) & 4294967295L) >= ((this._loadInt((_34_ + 12))) & 4294967295L)) {
                        break label$3;
                    }
                    _33_ = (this._loadInt8u(((this._loadInt8u((this._loadInt((_34_ + 56))))) + 21776))) & 1;
                }
                while (false);
                if (_33_ == 0) {
                    break label$2;
                }
                this._storeInt((_34_ + 56), ((this._loadInt((_34_ + 56))) + (this._loadInt((_34_ + 40)))));
                continue label$1;
            }
        }
        while (false);
        label$4:
        do {
            if (((this._loadInt((_34_ + 56))) & 4294967295L) >= ((this._loadInt((_34_ + 12))) & 4294967295L)) {
                break label$4;
            }
            label$5:
            do {
                if ((this._loadInt8s((this._loadInt((_34_ + 56))))) != 45) {
                    break label$5;
                }
                this._storeInt((_34_ + 28), 1);
                this._storeInt((_34_ + 56), ((this._loadInt((_34_ + 56))) + (this._loadInt((_34_ + 40)))));
                break label$4;
            }
            while (false);
            if ((this._loadInt8s((this._loadInt((_34_ + 56))))) != 43) {
                break label$4;
            }
            this._storeInt((_34_ + 56), ((this._loadInt((_34_ + 56))) + (this._loadInt((_34_ + 40)))));
        }
        while (false);
        this._storeInt((_34_ + 16), (this._loadInt((_34_ + 56))));
        label$7:
        do {
            label$6:
            while (true) {
                _33_ = 0;
                label$8:
                do {
                    if (((this._loadInt((_34_ + 56))) & 4294967295L) >= ((this._loadInt((_34_ + 12))) & 4294967295L)) {
                        break label$8;
                    }
                    _33_ = ((this._loadInt8s((this._loadInt((_34_ + 56))))) == 48) ? 1 : 0;
                }
                while (false);
                if (_33_ == 0) {
                    break label$7;
                }
                this._storeInt((_34_ + 56), ((this._loadInt((_34_ + 56))) + (this._loadInt((_34_ + 40)))));
                continue label$6;
            }
        }
        while (false);
        this._storeInt((_34_ + 24), 0);
        label$10:
        do {
            label$9:
            while (true) {
                _33_ = 0;
                label$11:
                do {
                    if ((((this._loadInt((_34_ + 56))) + (this._loadInt((_34_ + 24)))) & 4294967295L) >= ((this._loadInt((_34_ + 12))) & 4294967295L)) {
                        break label$11;
                    }
                    _33_ = 0;
                    if ((this._storeInt((_34_ + 20), (this._loadInt8s(((this._loadInt((_34_ + 56))) + (this._loadInt((_34_ + 24)))))))) < 48) {
                        break label$11;
                    }
                    _33_ = ((this._loadInt((_34_ + 20))) < 58) ? 1 : 0;
                }
                while (false);
                if (_33_ == 0) {
                    break label$10;
                }
                this._storeLong((_34_ + 32), ((((this._loadLong((_34_ + 32))) * 10L) + (this._loadLong32s((_34_ + 20)))) + -48L));
                this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + (this._loadInt((_34_ + 40)))));
                continue label$9;
            }
        }
        while (false);
        label$12:
        do {
            label$13:
            do {
                if ((this._loadLong((_34_ + 32))) > -1L) {
                    break label$13;
                }
                this._storeLong((this._loadInt((_34_ + 52))), -9223372036854775808L);
                break label$12;
            }
            while (false);
            label$14:
            do {
                if ((this._loadInt((_34_ + 28))) == 0) {
                    break label$14;
                }
                this._storeLong((this._loadInt((_34_ + 52))), (0L - (this._loadLong((_34_ + 32)))));
                break label$12;
            }
            while (false);
            this._storeLong((this._loadInt((_34_ + 52))), (this._loadLong((_34_ + 32))));
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
                        if ((this._loadInt((_34_ + 20))) == 0) {
                            break label$18;
                        }
                        if ((((this._loadInt((_34_ + 56))) + (this._loadInt((_34_ + 24)))) & 4294967295L) < ((this._loadInt((_34_ + 12))) & 4294967295L)) {
                            break label$17;
                        }
                    }
                    while (false);
                    label$19:
                    do {
                        if ((this._loadInt((_34_ + 24))) != 0) {
                            break label$19;
                        }
                        if ((this._loadInt((_34_ + 16))) == (this._loadInt((_34_ + 56)))) {
                            break label$17;
                        }
                    }
                    while (false);
                    if ((this._loadInt((_34_ + 24))) <= ((this._loadInt((_34_ + 40))) * 19)) {
                        break label$16;
                    }
                }
                while (false);
                this._storeInt((_34_ + 60), 1);
                break label$15;
            }
            while (false);
            label$20:
            do {
                if ((this._loadInt((_34_ + 24))) >= ((this._loadInt((_34_ + 40))) * 19)) {
                    break label$20;
                }
                this._storeInt((_34_ + 60), 0);
                break label$15;
            }
            while (false);
            label$21:
            do {
                label$22:
                do {
                    if ((this._storeInt((_34_ + 20), (compare2pow63((this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 40))))))) <= -1) {
                        break label$22;
                    }
                    if ((this._loadInt((_34_ + 20))) < 1) {
                        break label$21;
                    }
                    this._storeInt((_34_ + 60), 1);
                    break label$15;
                }
                while (false);
                this._storeInt((_34_ + 60), 0);
                break label$15;
            }
            while (false);
            _temp$3 = 0;
            _temp$4 = 2;
            _temp$5 = ((this._loadInt((_34_ + 28))) != 0) ? _temp$3 : _temp$4;
            this._storeInt((_34_ + 60), _temp$5);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 60));
        this._storeInt((0 + 4), (_34_ + 64));
        return _33_;
    }

    @Override()
    public final int compare2pow63(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 32) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        _31_ = this._storeInt((_32_ + 20), 0);
        this._storeInt((_32_ + 12), 28192);
        this._storeInt((_32_ + 16), _31_);
        label$1:
        do {
            label$0:
            while (true) {
                _31_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_32_ + 20))) != 0) {
                        break label$2;
                    }
                    _31_ = ((this._loadInt((_32_ + 16))) < 18) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 20), (((this._loadInt8s(((this._loadInt((_32_ + 28))) + ((_31_ = this._loadInt((_32_ + 16))) * (this._loadInt((_32_ + 24))))))) - (this._loadInt8s(((this._loadInt((_32_ + 12))) + _31_)))) * 10));
                this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                continue label$0;
            }
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt((_32_ + 20))) != 0) {
                break label$3;
            }
            this._storeInt((_32_ + 20), ((this._loadInt8s(((this._loadInt((_32_ + 28))) + ((this._loadInt((_32_ + 24))) * 18)))) + -56));
        }
        while (false);
        return (this._loadInt((_32_ + 20)));
    }

    @Override()
    public final void applyNumericAffinity(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if (((this._loadInt16u(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_)) + 28))) & 12) != 0) {
                break label$0;
            }
            this._storeInt8((_31_ + 7), (this._loadInt8u(((this._loadInt((_31_ + 28))) + 31))));
            if (((this._loadInt16u(((this._loadInt((_31_ + 28))) + 28))) & 2) == 0) {
                break label$0;
            }
            if ((sqlite3AtoF((this._loadInt(((_30_ = this._loadInt((_31_ + 28))) + 4))), (_31_ + 16), (this._loadInt((_30_ + 24))), (this._loadInt8u((_31_ + 7))))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((sqlite3Atoi64((this._loadInt(((_30_ = this._loadInt((_31_ + 28))) + 4))), (_31_ + 8), (this._loadInt((_30_ + 24))), (this._loadInt8u((_31_ + 7))))) != 0) {
                    break label$1;
                }
                this._storeLong(((_30_ = this._loadInt((_31_ + 28))) + 16), (this._loadLong((_31_ + 8))));
                this._storeInt16((_30_ + 28), ((this._loadInt16u((_30_ + 28))) | 4));
                break label$0;
            }
            while (false);
            this._storeDouble(((_30_ = this._loadInt((_31_ + 28))) + 8), (this._loadDouble((_31_ + 16))));
            this._storeInt16((_30_ + 28), ((this._loadInt16u((_30_ + 28))) | 8));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 32));
        return;
    }

    @Override()
    public final void sqlite3VdbeMemStoreType(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._loadInt16u(((this._storeInt((_31_ + 12), _30_)) + 28))));
        label$0:
        do {
            if (((this._loadInt8u((_31_ + 8))) & 1) == 0) {
                break label$0;
            }
            this._storeInt8(((this._loadInt((_31_ + 12))) + 30), 5);
            return;
        }
        while (false);
        label$1:
        do {
            if (((this._loadInt8u((_31_ + 8))) & 4) == 0) {
                break label$1;
            }
            this._storeInt8(((this._loadInt((_31_ + 12))) + 30), 1);
            return;
        }
        while (false);
        label$2:
        do {
            if (((this._loadInt8u((_31_ + 8))) & 8) == 0) {
                break label$2;
            }
            this._storeInt8(((this._loadInt((_31_ + 12))) + 30), 2);
            return;
        }
        while (false);
        label$3:
        do {
            if (((this._loadInt8u((_31_ + 8))) & 2) == 0) {
                break label$3;
            }
            this._storeInt8(((this._loadInt((_31_ + 12))) + 30), 3);
            return;
        }
        while (false);
        this._storeInt8(((this._loadInt((_31_ + 12))) + 30), 4);
        return;
    }

    @Override()
    public final int sqlite3_load_extension(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        _33_ = this._storeInt((_34_ + 12), (sqlite3LoadExtension((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))), _33_)));
        _33_ = this._storeInt((_34_ + 12), (sqlite3ApiExit((this._loadInt((_34_ + 28))), _33_)));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final int sqlite3LoadExtension(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 72), _30_);
        this._storeInt((_34_ + 68), _31_);
        this._storeInt((_34_ + 64), _32_);
        this._storeInt((_34_ + 60), _33_);
        this._storeInt((_34_ + 56), (this._loadInt((this._loadInt((_34_ + 72))))));
        _33_ = this._storeInt((_34_ + 44), 0);
        this._storeInt((_34_ + 36), 300);
        label$0:
        do {
            if ((this._loadInt((_34_ + 60))) == 0) {
                break label$0;
            }
            this._storeInt((this._loadInt((_34_ + 60))), _33_);
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                if (((this._loadInt8u(((this._loadInt((_34_ + 72))) + 15))) & 32) != 0) {
                    break label$2;
                }
                label$3:
                do {
                    if ((this._loadInt((_34_ + 60))) == 0) {
                        break label$3;
                    }
                    _33_ = sqlite3_mprintf(28224, 0);
                    this._storeInt((this._loadInt((_34_ + 60))), _33_);
                }
                while (false);
                this._storeInt((_34_ + 76), 1);
                break label$1;
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt((_34_ + 64))) != 0) {
                    break label$4;
                }
                this._storeInt((_34_ + 64), 28240);
            }
            while (false);
            label$5:
            do {
                label$6:
                do {
                    label$7:
                    do {
                        if ((this._storeInt((_34_ + 52), (sqlite3OsDlOpen((this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 68))))))) == 0) {
                            break label$7;
                        }
                        if ((this._storeInt((_34_ + 48), (sqlite3OsDlSym((this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 52))), (this._loadInt((_34_ + 64))))))) == 0) {
                            break label$6;
                        }
                        if ((this._iiiiTable[this._tableIndices[this._loadInt((_34_ + 48))]].invoke((this._loadInt((_34_ + 72))), (_34_ + 44), 28364)) == 0) {
                            break label$5;
                        }
                        label$8:
                        do {
                            if ((this._loadInt((_34_ + 60))) == 0) {
                                break label$8;
                            }
                            this._storeInt((_34_ + 32), (this._loadInt((_34_ + 44))));
                            _33_ = sqlite3_mprintf(29072, (_34_ + 32));
                            this._storeInt((this._loadInt((_34_ + 60))), _33_);
                        }
                        while (false);
                        sqlite3_free((this._loadInt((_34_ + 44))));
                        sqlite3OsDlClose((this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 52))));
                        this._storeInt((_34_ + 76), 1);
                        break label$1;
                    }
                    while (false);
                    label$9:
                    do {
                        if ((this._loadInt((_34_ + 60))) == 0) {
                            break label$9;
                        }
                        _33_ = this._storeInt((_34_ + 44), (sqlite3_malloc(300)));
                        this._storeInt((this._loadInt((_34_ + 60))), _33_);
                        if ((this._loadInt((_34_ + 44))) == 0) {
                            break label$9;
                        }
                        _33_ = this._loadInt((_34_ + 44));
                        this._storeInt(_34_, (this._loadInt((_34_ + 68))));
                        sqlite3_snprintf(300, _33_, 28272, _34_);
                        sqlite3OsDlError((this._loadInt((_34_ + 56))), 299, (this._loadInt((_34_ + 44))));
                    }
                    while (false);
                    this._storeInt((_34_ + 76), 1);
                    break label$1;
                }
                while (false);
                label$10:
                do {
                    if ((this._loadInt((_34_ + 60))) == 0) {
                        break label$10;
                    }
                    _33_ = this._storeInt((_34_ + 44), (sqlite3_malloc(300)));
                    this._storeInt((this._loadInt((_34_ + 60))), _33_);
                    label$11:
                    do {
                        if ((this._loadInt((_34_ + 44))) == 0) {
                            break label$11;
                        }
                        this._storeInt((_34_ + 20), (this._loadInt((_34_ + 68))));
                        _33_ = this._loadInt((_34_ + 44));
                        this._storeInt((_34_ + 16), (this._loadInt((_34_ + 64))));
                        sqlite3_snprintf(300, _33_, 28320, (_34_ + 16));
                        sqlite3OsDlError((this._loadInt((_34_ + 56))), 299, (this._loadInt((_34_ + 44))));
                    }
                    while (false);
                    sqlite3OsDlClose((this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 52))));
                }
                while (false);
                this._storeInt((_34_ + 76), 1);
                break label$1;
            }
            while (false);
            label$12:
            do {
                if ((this._storeInt((_34_ + 40), (sqlite3DbMallocZero((_33_ = this._loadInt((_34_ + 72))), (((this._loadInt((_33_ + 128))) << 2) + 4))))) == 0) {
                    break label$12;
                }
                label$13:
                do {
                    if ((this._loadInt(((this._loadInt((_34_ + 72))) + 128))) < 1) {
                        break label$13;
                    }
                    memcpy((this._loadInt((_34_ + 40))), (this._loadInt(((_33_ = this._loadInt((_34_ + 72))) + 132))), ((this._loadInt((_33_ + 128))) << 2));
                }
                while (false);
                sqlite3DbFree((_33_ = this._loadInt((_34_ + 72))), (this._loadInt((_33_ + 132))));
                this._storeInt(((_33_ = this._loadInt((_34_ + 72))) + 132), (this._loadInt((_34_ + 40))));
                this._storeInt((_33_ + 128), ((_32_ = this._loadInt((_33_ + 128))) + 1));
                this._storeInt(((this._loadInt(((this._loadInt((_34_ + 72))) + 132))) + (_32_ << 2)), (this._loadInt((_34_ + 52))));
                this._storeInt((_34_ + 76), 0);
                break label$1;
            }
            while (false);
            this._storeInt((_34_ + 76), 7);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 76));
        this._storeInt((0 + 4), (_34_ + 80));
        return _33_;
    }

    @Override()
    public final int sqlite3ApiExit(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if ((this._loadInt((_32_ + 12))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 30))) != 0) {
                    break label$1;
                }
                if ((this._loadInt((_32_ + 8))) != 3082) {
                    break label$0;
                }
            }
            while (false);
            sqlite3Error((this._loadInt((_32_ + 12))), 7, 0, 0);
            this._storeInt8(((this._loadInt((_32_ + 12))) + 30), 0);
            this._storeInt((_32_ + 8), 7);
        }
        while (false);
        _31_ = 255;
        _30_ = this._loadInt((_32_ + 8));
        label$2:
        do {
            if ((this._loadInt((_32_ + 12))) == 0) {
                break label$2;
            }
            _31_ = this._loadInt(((this._loadInt((_32_ + 12))) + 24));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return (_30_ & _31_);
    }

    @Override()
    public final void sqlite3Error(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        label$0:
        do {
            if ((this._loadInt((_34_ + 28))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_34_ + 28))) + 212))) != 0) {
                    break label$1;
                }
                _32_ = sqlite3ValueNew((this._loadInt((_34_ + 28))));
                if ((this._storeInt(((this._loadInt((_34_ + 28))) + 212), _32_)) == 0) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt(((this._loadInt((_34_ + 28))) + 20), (this._loadInt((_34_ + 24))));
            label$2:
            do {
                if ((this._loadInt((_34_ + 20))) == 0) {
                    break label$2;
                }
                _32_ = this._storeInt((_34_ + 12), _33_);
                _32_ = this._storeInt((_34_ + 16), (sqlite3VMPrintf((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 20))), _32_)));
                sqlite3ValueSetStr((this._loadInt(((this._loadInt((_34_ + 28))) + 212))), -1, _32_, 1, 14);
                break label$0;
            }
            while (false);
            sqlite3ValueSetStr((this._loadInt(((this._loadInt((_34_ + 28))) + 212))), 0, 0, 1, 0);
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final int sqlite3ValueNew(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (sqlite3DbMallocZero((this._storeInt((_31_ + 12), _30_)), 40)))) == 0) {
                break label$0;
            }
            this._storeInt16(((_30_ = this._loadInt((_31_ + 8))) + 28), 1);
            this._storeInt8((_30_ + 30), 5);
            this._storeInt(_30_, (this._loadInt((_31_ + 12))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void sqlite3ValueSetStr(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt8((_35_ + 19), _33_);
        this._storeInt((_35_ + 12), _34_);
        label$0:
        do {
            if ((this._loadInt((_35_ + 28))) == 0) {
                break label$0;
            }
            sqlite3VdbeMemSetStr((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 24))), (this._loadInt8u((_35_ + 19))), (this._loadInt((_35_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_35_ + 32));
        return;
    }

    @Override()
    public final int sqlite3DbMallocZero(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 4), (sqlite3DbMallocRaw((this._loadInt((_32_ + 12))), _31_)))) == 0) {
                break label$0;
            }
            memset((this._loadInt((_32_ + 4))), 0, (this._loadInt((_32_ + 8))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3_mprintf(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
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
            _30_ = this._storeInt((_32_ + 4), _31_);
            this._storeInt((_32_ + 12), (this._storeInt(_32_, (sqlite3_vmprintf((this._loadInt((_32_ + 8))), _30_)))));
        }
        while (false);
        _30_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _30_;
    }

    @Override()
    public final int sqlite3OsDlOpen(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this._iiiTable[this._tableIndices[this._loadInt(((_30_ = this._loadInt((_32_ + 12))) + 40))]].invoke(_30_, _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void sqlite3OsDlError(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._viiiTable[this._tableIndices[this._loadInt(((_31_ = this._loadInt((_33_ + 12))) + 44))]].invoke(_31_, (this._loadInt((_33_ + 8))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int sqlite3OsDlSym(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = this._iiiiTable[this._tableIndices[this._loadInt(((_31_ = this._loadInt((_33_ + 12))) + 48))]].invoke(_31_, (this._loadInt((_33_ + 8))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final void sqlite3OsDlClose(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._viiTable[this._tableIndices[this._loadInt(((_30_ = this._loadInt((_32_ + 12))) + 52))]].invoke(_30_, _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }
}
