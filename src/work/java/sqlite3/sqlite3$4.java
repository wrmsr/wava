package sqlite3;

abstract class sqlite3$4
        extends sqlite3$3
{
    protected sqlite3$4(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final float hypotf(float _30_, float _31_)
    {
        int _32_ = 0;
        double _33_ = 0.0;
        int _34_ = 0;
        this._storeFloat(((_34_ = (this._loadInt((0 + 4))) - 48) + 40), _30_);
        this._storeFloat((_34_ + 36), _31_);
        this._storeFloat((_34_ + 32), (this._loadFloat((_34_ + 40))));
        this._storeFloat((_34_ + 24), (this._loadFloat((_34_ + 36))));
        this._storeInt((_34_ + 32), ((this._loadInt((_34_ + 32))) & 2147483647));
        _32_ = this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) & 2147483647));
        label$0:
        do {
            if (((this._loadInt((_34_ + 32))) & 4294967295L) >= (_32_ & 4294967295L)) {
                break label$0;
            }
            this._storeInt((_34_ + 16), (this._loadInt((_34_ + 32))));
            this._storeInt((_34_ + 32), (this._loadInt((_34_ + 24))));
            this._storeInt((_34_ + 24), (this._loadInt((_34_ + 16))));
        }
        while (false);
        this._storeFloat((_34_ + 40), (this._loadFloat((_34_ + 32))));
        this._storeFloat((_34_ + 36), (this._loadFloat((_34_ + 24))));
        label$1:
        do {
            if ((this._loadInt((_34_ + 24))) != 2139095040) {
                break label$1;
            }
            this._storeFloat((_34_ + 44), (this._loadFloat((_34_ + 36))));
            return (this._loadFloat((_34_ + 44)));
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                if (((this._loadInt((_34_ + 32))) & 4294967295L) > (2139095039 & 4294967295L)) {
                    break label$3;
                }
                if ((this._loadInt((_34_ + 24))) == 0) {
                    break label$3;
                }
                if ((((this._loadInt((_34_ + 32))) - (this._loadInt((_34_ + 24)))) & 4294967295L) < (209715200 & 4294967295L)) {
                    break label$2;
                }
            }
            while (false);
            this._storeFloat((_34_ + 44), ((this._loadFloat((_34_ + 40))) + (this._loadFloat((_34_ + 36)))));
            return (this._loadFloat((_34_ + 44)));
        }
        while (false);
        this._storeInt((_34_ + 12), 1065353216);
        label$4:
        do {
            label$5:
            do {
                if (((this._loadInt((_34_ + 32))) & 4294967295L) < (1568669696 & 4294967295L)) {
                    break label$5;
                }
                this._storeInt((_34_ + 12), 1820327936);
                this._storeFloat((_34_ + 40), ((this._loadFloat((_34_ + 40))) * 8.0779357E-28f));
                this._storeFloat((_34_ + 36), ((this._loadFloat((_34_ + 36))) * 8.0779357E-28f));
                break label$4;
            }
            while (false);
            if (((this._loadInt((_34_ + 24))) & 4294967295L) > (562036735 & 4294967295L)) {
                break label$4;
            }
            this._storeInt((_34_ + 12), 310378496);
            this._storeFloat((_34_ + 40), ((this._loadFloat((_34_ + 40))) * 1.23794004E27f));
            this._storeFloat((_34_ + 36), ((this._loadFloat((_34_ + 36))) * 1.23794004E27f));
        }
        while (false);
        this._storeFloat((_34_ + 44), ((this._loadFloat((_34_ + 12))) * ((float) (Math.sqrt(((float) (((_33_ = (double) (this._loadFloat((_34_ + 40)))) * _33_) + ((_33_ = (double) (this._loadFloat((_34_ + 36)))) * _33_))))))));
        return (this._loadFloat((_34_ + 44)));
    }

    @Override()
    public final void hypotl(int _30_, long _31_, long _32_, long _33_, long _34_)
    {
        int _35_ = 0;
        double _36_ = 0.0;
        this._storeLong(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), _31_);
        this._storeLong((_35_ + 40), _32_);
        this._storeLong((_35_ + 24), _34_);
        _36_ = this.__trunctfdf2.invoke((this._storeLong((_35_ + 16), _33_)), _34_);
        this.__extenddftf2.invoke(_35_, (hypot((this.__trunctfdf2.invoke((this._loadLong((_35_ + 32))), (this._loadLong((_35_ + 40))))), _36_)));
        this._storeLong((_30_ + 8), (this._loadLong((_35_ + 8))));
        this._storeLong(_30_, (this._loadLong(_35_)));
        this._storeInt((0 + 4), (_35_ + 48));
        return;
    }

    @Override()
    public final int ilogb(double _30_)
    {
        int _31_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeDouble(((_31_ = (this._loadInt((0 + 4))) - 48) + 24), (this._storeDouble((_31_ + 32), _30_)));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._storeInt((_31_ + 12), ((int) (((this._storeLong((_31_ + 16), (this._loadLong((_31_ + 24))))) >>> 52L) & 2047L)))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt((_31_ + 12))) != 2047) {
                        break label$1;
                    }
                    this._storeInt((_31_ + 4), 2143289344);
                    _temp$0 = -2147483648;
                    _temp$1 = 2147483647;
                    _temp$2 = (((this._loadLong((_31_ + 16))) << 12L) != 0L) ? _temp$0 : _temp$1;
                    this._storeInt((_31_ + 44), _temp$2);
                    return (this._loadInt((_31_ + 44)));
                }
                while (false);
                if ((this._storeLong((_31_ + 16), ((this._loadLong((_31_ + 16))) << 12L))) == 0L) {
                    break label$0;
                }
                this._storeInt((_31_ + 12), -1023);
                label$4:
                do {
                    label$3:
                    while (true) {
                        if (((this._loadLong((_31_ + 16))) >>> 63L) != 0L) {
                            break label$4;
                        }
                        this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 12))) + -1));
                        this._storeLong((_31_ + 16), ((this._loadLong((_31_ + 16))) << 1L));
                        continue label$3;
                    }
                }
                while (false);
                this._storeInt((_31_ + 44), (this._loadInt((_31_ + 12))));
                return (this._loadInt((_31_ + 44)));
            }
            while (false);
            this._storeInt((_31_ + 44), ((this._loadInt((_31_ + 12))) + -1023));
            return (this._loadInt((_31_ + 44)));
        }
        while (false);
        this._storeInt((_31_ + 8), 2143289344);
        this._storeInt((_31_ + 44), -2147483648);
        return (this._loadInt((_31_ + 44)));
    }

    @Override()
    public final int ilogbf(float _30_)
    {
        int _31_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 32) + 16), (this._storeFloat((_31_ + 24), _30_)));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._storeInt((_31_ + 8), (((this._storeInt((_31_ + 12), (this._loadInt((_31_ + 16))))) >>> 23) & 255))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt((_31_ + 8))) != 255) {
                        break label$1;
                    }
                    this._storeInt(_31_, 2143289344);
                    _temp$0 = -2147483648;
                    _temp$1 = 2147483647;
                    _temp$2 = (((this._loadInt((_31_ + 12))) << 9) != 0) ? _temp$0 : _temp$1;
                    this._storeInt((_31_ + 28), _temp$2);
                    return (this._loadInt((_31_ + 28)));
                }
                while (false);
                if ((this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 12))) << 9))) == 0) {
                    break label$0;
                }
                this._storeInt((_31_ + 8), -127);
                label$4:
                do {
                    label$3:
                    while (true) {
                        if (((this._loadInt((_31_ + 12))) >>> 31) != 0) {
                            break label$4;
                        }
                        this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) + -1));
                        this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 12))) << 1));
                        continue label$3;
                    }
                }
                while (false);
                this._storeInt((_31_ + 28), (this._loadInt((_31_ + 8))));
                return (this._loadInt((_31_ + 28)));
            }
            while (false);
            this._storeInt((_31_ + 28), ((this._loadInt((_31_ + 8))) + -127));
            return (this._loadInt((_31_ + 28)));
        }
        while (false);
        this._storeInt((_31_ + 4), 2143289344);
        this._storeInt((_31_ + 28), -2147483648);
        return (this._loadInt((_31_ + 28)));
    }

    @Override()
    public final int ilogbl(long _30_, long _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        _33_ = ilogb((this.__trunctfdf2.invoke((this._storeLong((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))), _30_)), (this._storeLong((_32_ + 8), _31_)))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _33_;
    }

    @Override()
    public final long imaxabs(long _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeLong(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), _30_)) < 1L) {
                break label$0;
            }
            return (this._loadLong((_31_ + 8)));
        }
        while (false);
        return (0L - (this._loadLong((_31_ + 8))));
    }

    @Override()
    public final void imaxdiv(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this._storeLong(((_33_ = (this._loadInt((0 + 4))) - 16) + 8), _31_);
        this._storeLong(_33_, _32_);
        this._storeLong(_30_, ((_31_ = this._loadLong((_33_ + 8))) / _32_));
        this._storeLong((_30_ + 8), (_31_ % _32_));
        return;
    }

    @Override()
    public final int index(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = strchr((this._loadInt((_32_ + 12))), _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final long __intscan(int _30_, int _31_, int _32_, long _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 52), _30_);
        this._storeInt((_34_ + 48), _31_);
        this._storeInt((_34_ + 44), _32_);
        this._storeLong((_34_ + 32), _33_);
        this._storeInt((_34_ + 28), 9937);
        this._storeInt((_34_ + 20), 0);
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt((_34_ + 48))) & 4294967295L) < (37 & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((__errno_location()), 22);
                this._storeLong((_34_ + 56), 0L);
                break label$0;
            }
            while (false);
            label$2$end:
            do {
                label$2:
                while (true) {
                    label$4:
                    do {
                        label$5:
                        do {
                            if (((this._loadInt(((_32_ = this._loadInt((_34_ + 52))) + 4))) & 4294967295L) >= ((this._loadInt((_32_ + 104))) & 4294967295L)) {
                                break label$5;
                            }
                            this._storeInt(((_32_ = this._loadInt((_34_ + 52))) + 4), ((_32_ = this._loadInt((_32_ + 4))) + 1));
                            _32_ = this._loadInt8u(_32_);
                            break label$4;
                        }
                        while (false);
                        _32_ = __shgetc((this._loadInt((_34_ + 52))));
                    }
                    while (false);
                    if ((__isspace$2e$98((this._storeInt((_34_ + 24), _32_)))) != 0) {
                        continue label$2;
                    }
                    break label$2$end;
                }
            }
            while (false);
            label$6:
            do {
                label$7:
                do {
                    if ((this._loadInt((_34_ + 24))) == 43) {
                        break label$7;
                    }
                    if ((this._loadInt((_34_ + 24))) != 45) {
                        break label$6;
                    }
                }
                while (false);
                this._storeInt((_34_ + 20), (0 - (((this._loadInt((_34_ + 24))) == 45) ? 1 : 0)));
                label$8:
                do {
                    label$9:
                    do {
                        if (((this._loadInt(((_32_ = this._loadInt((_34_ + 52))) + 4))) & 4294967295L) >= ((this._loadInt((_32_ + 104))) & 4294967295L)) {
                            break label$9;
                        }
                        this._storeInt(((_32_ = this._loadInt((_34_ + 52))) + 4), ((_32_ = this._loadInt((_32_ + 4))) + 1));
                        _32_ = this._loadInt8u(_32_);
                        break label$8;
                    }
                    while (false);
                    _32_ = __shgetc((this._loadInt((_34_ + 52))));
                }
                while (false);
                this._storeInt((_34_ + 24), _32_);
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
                                        if ((this._loadInt((_34_ + 48))) == 0) {
                                            break label$16;
                                        }
                                        if ((this._loadInt((_34_ + 48))) != 16) {
                                            break label$15;
                                        }
                                    }
                                    while (false);
                                    if ((this._loadInt((_34_ + 24))) != 48) {
                                        break label$15;
                                    }
                                    if (((this._loadInt(((_32_ = this._loadInt((_34_ + 52))) + 4))) & 4294967295L) >= ((this._loadInt((_32_ + 104))) & 4294967295L)) {
                                        break label$14;
                                    }
                                    this._storeInt(((_32_ = this._loadInt((_34_ + 52))) + 4), ((_32_ = this._loadInt((_32_ + 4))) + 1));
                                    _32_ = this._loadInt8u(_32_);
                                    break label$13;
                                }
                                while (false);
                                label$17:
                                do {
                                    if ((this._loadInt((_34_ + 48))) != 0) {
                                        break label$17;
                                    }
                                    this._storeInt((_34_ + 48), 10);
                                }
                                while (false);
                                if (((this._loadInt8u(((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 24)))))) & 4294967295L) < ((this._loadInt((_34_ + 48))) & 4294967295L)) {
                                    break label$12;
                                }
                                label$18:
                                do {
                                    if ((this._loadInt(((this._loadInt((_34_ + 52))) + 104))) == 0) {
                                        break label$18;
                                    }
                                    this._storeInt(((_32_ = this._loadInt((_34_ + 52))) + 4), ((this._loadInt((_32_ + 4))) + -1));
                                }
                                while (false);
                                __shlim((this._loadInt((_34_ + 52))), 0L);
                                this._storeInt((__errno_location()), 22);
                                this._storeLong((_34_ + 56), 0L);
                                break label$0;
                            }
                            while (false);
                            _32_ = __shgetc((this._loadInt((_34_ + 52))));
                        }
                        while (false);
                        label$19:
                        do {
                            label$20:
                            do {
                                label$21:
                                do {
                                    if (((this._storeInt((_34_ + 24), _32_)) | 32) != 120) {
                                        break label$21;
                                    }
                                    if (((this._loadInt(((_32_ = this._loadInt((_34_ + 52))) + 4))) & 4294967295L) >= ((this._loadInt((_32_ + 104))) & 4294967295L)) {
                                        break label$20;
                                    }
                                    this._storeInt(((_32_ = this._loadInt((_34_ + 52))) + 4), ((_32_ = this._loadInt((_32_ + 4))) + 1));
                                    _32_ = this._loadInt8u(_32_);
                                    break label$19;
                                }
                                while (false);
                                if ((this._loadInt((_34_ + 48))) != 0) {
                                    break label$12;
                                }
                                this._storeInt((_34_ + 48), 8);
                                break label$12;
                            }
                            while (false);
                            _32_ = __shgetc((this._loadInt((_34_ + 52))));
                        }
                        while (false);
                        label$22:
                        do {
                            if ((this._loadInt8u(((this._storeInt((_34_ + 24), _32_)) + (this._loadInt((_34_ + 28)))))) < 16) {
                                break label$22;
                            }
                            label$23:
                            do {
                                if ((this._loadInt(((this._loadInt((_34_ + 52))) + 104))) == 0) {
                                    break label$23;
                                }
                                this._storeInt(((_32_ = this._loadInt((_34_ + 52))) + 4), ((this._loadInt((_32_ + 4))) + -1));
                            }
                            while (false);
                            if ((this._loadInt((_34_ + 44))) == 0) {
                                break label$11;
                            }
                            if ((this._loadInt(((this._loadInt((_34_ + 52))) + 104))) == 0) {
                                break label$10;
                            }
                            this._storeInt(((_32_ = this._loadInt((_34_ + 52))) + 4), ((this._loadInt((_32_ + 4))) + -1));
                            break label$10;
                        }
                        while (false);
                        this._storeInt((_34_ + 48), 16);
                    }
                    while (false);
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
                                            if ((this._loadInt((_34_ + 48))) != 10) {
                                                break label$29;
                                            }
                                            this._storeInt((_34_ + 16), 0);
                                            label$30:
                                            while (true) {
                                                _32_ = 0;
                                                label$32:
                                                do {
                                                    if ((((this._loadInt((_34_ + 24))) + -48) & 4294967295L) > (9 & 4294967295L)) {
                                                        break label$32;
                                                    }
                                                    _32_ = (((this._loadInt((_34_ + 16))) & 4294967295L) < (429496729 & 4294967295L)) ? 1 : 0;
                                                }
                                                while (false);
                                                if (_32_ == 0) {
                                                    break label$28;
                                                }
                                                this._storeInt((_34_ + 16), ((((this._loadInt((_34_ + 16))) * 10) + (this._loadInt((_34_ + 24)))) + -48));
                                                label$33:
                                                do {
                                                    if (((this._loadInt(((_32_ = this._loadInt((_34_ + 52))) + 4))) & 4294967295L) >= ((this._loadInt((_32_ + 104))) & 4294967295L)) {
                                                        break label$33;
                                                    }
                                                    this._storeInt(((_32_ = this._loadInt((_34_ + 52))) + 4), ((_32_ = this._loadInt((_32_ + 4))) + 1));
                                                    this._storeInt((_34_ + 24), (this._loadInt8u(_32_)));
                                                    continue label$30;
                                                }
                                                while (false);
                                                this._storeInt((_34_ + 24), (__shgetc((this._loadInt((_34_ + 52))))));
                                                continue label$30;
                                            }
                                        }
                                        while (false);
                                        if (((_32_ = this._loadInt((_34_ + 48))) & (_32_ + -1)) == 0) {
                                            break label$26;
                                        }
                                        this._storeInt((_34_ + 16), 0);
                                        label$34:
                                        while (true) {
                                            _32_ = 0;
                                            label$36:
                                            do {
                                                if (((this._loadInt8u(((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 24)))))) & 4294967295L) >= ((this._loadInt((_34_ + 48))) & 4294967295L)) {
                                                    break label$36;
                                                }
                                                _32_ = (((this._loadInt((_34_ + 16))) & 4294967295L) < (119304647 & 4294967295L)) ? 1 : 0;
                                            }
                                            while (false);
                                            if (_32_ == 0) {
                                                break label$27;
                                            }
                                            this._storeInt((_34_ + 16), (((this._loadInt((_34_ + 16))) * (this._loadInt((_34_ + 48)))) + (this._loadInt8u(((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 24))))))));
                                            label$37:
                                            do {
                                                if (((this._loadInt(((_32_ = this._loadInt((_34_ + 52))) + 4))) & 4294967295L) >= ((this._loadInt((_32_ + 104))) & 4294967295L)) {
                                                    break label$37;
                                                }
                                                this._storeInt(((_32_ = this._loadInt((_34_ + 52))) + 4), ((_32_ = this._loadInt((_32_ + 4))) + 1));
                                                this._storeInt((_34_ + 24), (this._loadInt8u(_32_)));
                                                continue label$34;
                                            }
                                            while (false);
                                            this._storeInt((_34_ + 24), (__shgetc((this._loadInt((_34_ + 52))))));
                                            continue label$34;
                                        }
                                    }
                                    while (false);
                                    this._storeLong((_34_ + 8), (this._loadLong32u((_34_ + 16))));
                                    label$39:
                                    do {
                                        label$38:
                                        while (true) {
                                            _32_ = 0;
                                            label$40:
                                            do {
                                                if ((((this._loadInt((_34_ + 24))) + -48) & 4294967295L) > (9 & 4294967295L)) {
                                                    break label$40;
                                                }
                                                if (((this._loadLong((_34_ + 8))) & 4294967295L) > (1844674407370955161L & 4294967295L)) {
                                                    break label$40;
                                                }
                                                _32_ = ((((this._loadLong((_34_ + 8))) * 10L) & 4294967295L) <= ((((long) ((this._loadInt((_34_ + 24))) + -48)) ^ -1L) & 4294967295L)) ? 1 : 0;
                                            }
                                            while (false);
                                            if (_32_ == 0) {
                                                break label$39;
                                            }
                                            this._storeLong((_34_ + 8), (((this._loadLong((_34_ + 8))) * 10L) + ((long) ((this._loadInt((_34_ + 24))) + -48))));
                                            label$41:
                                            do {
                                                if (((this._loadInt(((_32_ = this._loadInt((_34_ + 52))) + 4))) & 4294967295L) >= ((this._loadInt((_32_ + 104))) & 4294967295L)) {
                                                    break label$41;
                                                }
                                                this._storeInt(((_32_ = this._loadInt((_34_ + 52))) + 4), ((_32_ = this._loadInt((_32_ + 4))) + 1));
                                                this._storeInt((_34_ + 24), (this._loadInt8u(_32_)));
                                                continue label$38;
                                            }
                                            while (false);
                                            this._storeInt((_34_ + 24), (__shgetc((this._loadInt((_34_ + 52))))));
                                            continue label$38;
                                        }
                                    }
                                    while (false);
                                    if ((((this._loadInt((_34_ + 24))) + -48) & 4294967295L) <= (9 & 4294967295L)) {
                                        break label$25;
                                    }
                                    break label$24;
                                }
                                while (false);
                                this._storeLong((_34_ + 8), (this._loadLong32u((_34_ + 16))));
                                label$42:
                                while (true) {
                                    _32_ = 0;
                                    label$44:
                                    do {
                                        if (((this._loadInt8u(((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 24)))))) & 4294967295L) >= ((this._loadInt((_34_ + 48))) & 4294967295L)) {
                                            break label$44;
                                        }
                                        if (((this._loadLong((_34_ + 8))) & 4294967295L) > ((-1L / (this._loadLong32u((_34_ + 48)))) & 4294967295L)) {
                                            break label$44;
                                        }
                                        _32_ = ((((this._loadLong32u((_34_ + 48))) * (this._loadLong((_34_ + 8)))) & 4294967295L) <= (((this._loadLong8u(((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 24)))))) ^ -1L) & 4294967295L)) ? 1 : 0;
                                    }
                                    while (false);
                                    if (_32_ == 0) {
                                        break label$25;
                                    }
                                    this._storeLong((_34_ + 8), (((this._loadLong((_34_ + 8))) * (this._loadLong32u((_34_ + 48)))) + (this._loadLong8u(((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 24))))))));
                                    label$45:
                                    do {
                                        if (((this._loadInt(((_32_ = this._loadInt((_34_ + 52))) + 4))) & 4294967295L) >= ((this._loadInt((_32_ + 104))) & 4294967295L)) {
                                            break label$45;
                                        }
                                        this._storeInt(((_32_ = this._loadInt((_34_ + 52))) + 4), ((_32_ = this._loadInt((_32_ + 4))) + 1));
                                        this._storeInt((_34_ + 24), (this._loadInt8u(_32_)));
                                        continue label$42;
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 24), (__shgetc((this._loadInt((_34_ + 52))))));
                                    continue label$42;
                                }
                            }
                            while (false);
                            this._storeInt((_34_ + 4), (this._loadInt8s((((((this._loadInt((_34_ + 48))) * 23) >>> 5) & 7) + 10208))));
                            this._storeInt((_34_ + 16), 0);
                            label$47:
                            do {
                                label$46:
                                while (true) {
                                    _32_ = 0;
                                    label$48:
                                    do {
                                        if (((this._loadInt8u(((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 24)))))) & 4294967295L) >= ((this._loadInt((_34_ + 48))) & 4294967295L)) {
                                            break label$48;
                                        }
                                        _32_ = (((this._loadInt((_34_ + 16))) & 4294967295L) < (134217728 & 4294967295L)) ? 1 : 0;
                                    }
                                    while (false);
                                    if (_32_ == 0) {
                                        break label$47;
                                    }
                                    this._storeInt((_34_ + 16), (((this._loadInt((_34_ + 16))) << (this._loadInt((_34_ + 4)))) | (this._loadInt8u(((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 24))))))));
                                    label$49:
                                    do {
                                        if (((this._loadInt(((_32_ = this._loadInt((_34_ + 52))) + 4))) & 4294967295L) >= ((this._loadInt((_32_ + 104))) & 4294967295L)) {
                                            break label$49;
                                        }
                                        this._storeInt(((_32_ = this._loadInt((_34_ + 52))) + 4), ((_32_ = this._loadInt((_32_ + 4))) + 1));
                                        this._storeInt((_34_ + 24), (this._loadInt8u(_32_)));
                                        continue label$46;
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 24), (__shgetc((this._loadInt((_34_ + 52))))));
                                    continue label$46;
                                }
                            }
                            while (false);
                            this._storeLong((_34_ + 8), (this._loadLong32u((_34_ + 16))));
                            label$51:
                            do {
                                label$50:
                                while (true) {
                                    _32_ = 0;
                                    label$52:
                                    do {
                                        if (((this._loadInt8u(((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 24)))))) & 4294967295L) >= ((this._loadInt((_34_ + 48))) & 4294967295L)) {
                                            break label$52;
                                        }
                                        _32_ = (((this._loadLong((_34_ + 8))) & 4294967295L) <= ((-1L >>> (this._loadLong32u((_34_ + 4)))) & 4294967295L)) ? 1 : 0;
                                    }
                                    while (false);
                                    if (_32_ == 0) {
                                        break label$51;
                                    }
                                    this._storeLong((_34_ + 8), (((this._loadLong((_34_ + 8))) << (this._loadLong32u((_34_ + 4)))) | (this._loadLong8u(((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 24))))))));
                                    label$53:
                                    do {
                                        if (((this._loadInt(((_32_ = this._loadInt((_34_ + 52))) + 4))) & 4294967295L) >= ((this._loadInt((_32_ + 104))) & 4294967295L)) {
                                            break label$53;
                                        }
                                        this._storeInt(((_32_ = this._loadInt((_34_ + 52))) + 4), ((_32_ = this._loadInt((_32_ + 4))) + 1));
                                        this._storeInt((_34_ + 24), (this._loadInt8u(_32_)));
                                        continue label$50;
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 24), (__shgetc((this._loadInt((_34_ + 52))))));
                                    continue label$50;
                                }
                            }
                            while (false);
                        }
                        while (false);
                        if (((this._loadInt8u(((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 24)))))) & 4294967295L) >= ((this._loadInt((_34_ + 48))) & 4294967295L)) {
                            break label$24;
                        }
                        label$55:
                        do {
                            label$54:
                            while (true) {
                                if (((this._loadInt8u(((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 24)))))) & 4294967295L) >= ((this._loadInt((_34_ + 48))) & 4294967295L)) {
                                    break label$55;
                                }
                                label$56:
                                do {
                                    if (((this._loadInt(((_32_ = this._loadInt((_34_ + 52))) + 4))) & 4294967295L) >= ((this._loadInt((_32_ + 104))) & 4294967295L)) {
                                        break label$56;
                                    }
                                    this._storeInt(((_32_ = this._loadInt((_34_ + 52))) + 4), ((_32_ = this._loadInt((_32_ + 4))) + 1));
                                    this._storeInt((_34_ + 24), (this._loadInt8u(_32_)));
                                    continue label$54;
                                }
                                while (false);
                                this._storeInt((_34_ + 24), (__shgetc((this._loadInt((_34_ + 52))))));
                                continue label$54;
                            }
                        }
                        while (false);
                        this._storeInt((__errno_location()), 34);
                        this._storeLong((_34_ + 8), (this._loadLong((_34_ + 32))));
                        if (((this._loadInt8u((_34_ + 32))) & 1) == 0) {
                            break label$24;
                        }
                        this._storeInt((_34_ + 20), 0);
                    }
                    while (false);
                    label$57:
                    do {
                        if ((this._loadInt(((this._loadInt((_34_ + 52))) + 104))) == 0) {
                            break label$57;
                        }
                        this._storeInt(((_32_ = this._loadInt((_34_ + 52))) + 4), ((this._loadInt((_32_ + 4))) + -1));
                    }
                    while (false);
                    label$58:
                    do {
                        label$59:
                        do {
                            if (((this._loadLong((_34_ + 8))) & 4294967295L) < ((this._loadLong((_34_ + 32))) & 4294967295L)) {
                                break label$59;
                            }
                            label$60:
                            do {
                                if (((this._loadInt8u((_34_ + 32))) & 1) != 0) {
                                    break label$60;
                                }
                                if ((this._loadInt((_34_ + 20))) == 0) {
                                    break label$58;
                                }
                            }
                            while (false);
                            if (((this._loadLong((_34_ + 8))) & 4294967295L) <= ((this._loadLong((_34_ + 32))) & 4294967295L)) {
                                break label$59;
                            }
                            this._storeInt((__errno_location()), 34);
                            this._storeLong((_34_ + 56), (this._loadLong((_34_ + 32))));
                            break label$0;
                        }
                        while (false);
                        this._storeLong((_34_ + 56), (((this._loadLong((_34_ + 8))) ^ (_33_ = this._loadLong32s((_34_ + 20)))) - _33_));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((__errno_location()), 34);
                    this._storeLong((_34_ + 56), ((this._loadLong((_34_ + 32))) + -1L));
                    break label$0;
                }
                while (false);
                __shlim((this._loadInt((_34_ + 52))), 0L);
            }
            while (false);
            this._storeLong((_34_ + 56), 0L);
        }
        while (false);
        _33_ = this._loadLong((_34_ + 56));
        this._storeInt((0 + 4), (_34_ + 64));
        return _33_;
    }

    @Override()
    public final int __isspace$2e$98(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 1;
        label$0:
        do {
            if ((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) == 32) {
                break label$0;
            }
            _31_ = ((((this._loadInt((_32_ + 12))) + -9) & 4294967295L) < (5 & 4294967295L)) ? 1 : 0;
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int isalnum(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 1;
        label$0:
        do {
            if (((((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) | 32) + -97) & 4294967295L) < (26 & 4294967295L)) {
                break label$0;
            }
            _31_ = ((((this._loadInt((_32_ + 12))) + -48) & 4294967295L) < (10 & 4294967295L)) ? 1 : 0;
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int __isalnum_l(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = isalnum((this._loadInt((_32_ + 12))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int isalpha(int _30_)
    {
        return ((((((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) | 32) + -97) & 4294967295L) < (26 & 4294967295L)) ? 1 : 0);
    }

    @Override()
    public final int __isalpha_l(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = isalpha((this._loadInt((_32_ + 12))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int isascii(int _30_)
    {
        return ((((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) & -128) == 0) ? 1 : 0);
    }

    @Override()
    public final int isatty(int _30_)
    {
        int _31_ = 0;
        _30_ = this.__syscall3.invoke(54, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 21523, _31_);
        this._storeInt((0 + 4), (_31_ + 16));
        return ((_30_ == 0) ? 1 : 0);
    }

    @Override()
    public final int isblank(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 1;
        label$0:
        do {
            if ((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) == 32) {
                break label$0;
            }
            _31_ = ((this._loadInt((_32_ + 12))) == 9) ? 1 : 0;
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int __isblank_l(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = isblank((this._loadInt((_32_ + 12))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int iscntrl(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 1;
        label$0:
        do {
            if (((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) & 4294967295L) < (32 & 4294967295L)) {
                break label$0;
            }
            _31_ = ((this._loadInt((_32_ + 12))) == 127) ? 1 : 0;
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int __iscntrl_l(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = iscntrl((this._loadInt((_32_ + 12))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int isdigit(int _30_)
    {
        return (((((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + -48) & 4294967295L) < (10 & 4294967295L)) ? 1 : 0);
    }

    @Override()
    public final int __isdigit_l(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = isdigit((this._loadInt((_32_ + 12))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int isgraph(int _30_)
    {
        return (((((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + -33) & 4294967295L) < (94 & 4294967295L)) ? 1 : 0);
    }

    @Override()
    public final int __isgraph_l(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = isgraph((this._loadInt((_32_ + 12))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int islower(int _30_)
    {
        return (((((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + -97) & 4294967295L) < (26 & 4294967295L)) ? 1 : 0);
    }

    @Override()
    public final int __islower_l(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = islower((this._loadInt((_32_ + 12))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int isprint(int _30_)
    {
        return (((((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + -32) & 4294967295L) < (95 & 4294967295L)) ? 1 : 0);
    }

    @Override()
    public final int __isprint_l(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = isprint((this._loadInt((_32_ + 12))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int ispunct(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _32_ = 0;
        label$0:
        do {
            if ((((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + -33) & 4294967295L) > (93 & 4294967295L)) {
                break label$0;
            }
            _32_ = ((isalnum((this._loadInt((_31_ + 12))))) == 0) ? 1 : 0;
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return _32_;
    }

    @Override()
    public final int __ispunct_l(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = ispunct((this._loadInt((_32_ + 12))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int isspace(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 1;
        label$0:
        do {
            if ((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) == 32) {
                break label$0;
            }
            _31_ = ((((this._loadInt((_32_ + 12))) + -9) & 4294967295L) < (5 & 4294967295L)) ? 1 : 0;
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int __isspace_l(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = isspace((this._loadInt((_32_ + 12))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int isupper(int _30_)
    {
        return (((((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + -65) & 4294967295L) < (26 & 4294967295L)) ? 1 : 0);
    }

    @Override()
    public final int __isupper_l(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = isupper((this._loadInt((_32_ + 12))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int isxdigit(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 1;
        label$0:
        do {
            if ((((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) + -48) & 4294967295L) < (10 & 4294967295L)) {
                break label$0;
            }
            _31_ = (((((this._loadInt((_32_ + 12))) | 32) + -97) & 4294967295L) < (6 & 4294967295L)) ? 1 : 0;
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int __isxdigit_l(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = isxdigit((this._loadInt((_32_ + 12))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final double j0(double _30_)
    {
        int _31_ = 0;
        double _32_ = 0.0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 48), _30_);
        this._storeDouble((_31_ + 8), (this._loadDouble((_31_ + 48))));
        this._storeLong32((_31_ + 20), (this._loadLong32u((_31_ + 12))));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_31_ + 20), ((this._loadInt((_31_ + 20))) & 2147483647))) & 4294967295L) < (2146435072 & 4294967295L)) {
                    break label$1;
                }
                this._storeDouble((_31_ + 56), (1.0 / ((_30_ = this._loadDouble((_31_ + 48))) * _30_)));
                break label$0;
            }
            while (false);
            this._storeDouble((_31_ + 48), (Math.abs((this._loadDouble((_31_ + 48))))));
            label$2:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) < (1073741824 & 4294967295L)) {
                    break label$2;
                }
                this._storeDouble((_31_ + 56), (common((this._loadInt((_31_ + 20))), (this._loadDouble((_31_ + 48))), 0)));
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) < (1059061760 & 4294967295L)) {
                    break label$3;
                }
                this._storeDouble((_31_ + 32), ((_30_ = this._storeDouble((_31_ + 40), ((_30_ = this._loadDouble((_31_ + 48))) * _30_))) * ((_30_ * ((_30_ * ((_30_ * -4.618326885321032E-9) + 1.8295404953270067E-6)) + -1.8997929423885472E-4)) + 0.015624999999999995)));
                _30_ = this._storeDouble((_31_ + 24), (((_30_ = this._loadDouble((_31_ + 40))) * ((_30_ * ((_30_ * ((_30_ * 1.1661400333379E-9) + 5.135465502073181E-7)) + 1.1692678466333745E-4)) + 0.015619102946489001)) + 1.0));
                this._storeDouble((_31_ + 56), ((((_32_ = (this._loadDouble((_31_ + 48))) / 2.0) + 1.0) * (1.0 - _32_)) + ((this._loadDouble((_31_ + 40))) * ((this._loadDouble((_31_ + 32))) / _30_))));
                break label$0;
            }
            while (false);
            label$4:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) < (939524096 & 4294967295L)) {
                    break label$4;
                }
                this._storeDouble((_31_ + 48), (((_30_ = this._loadDouble((_31_ + 48))) * 0.25) * _30_));
            }
            while (false);
            this._storeDouble((_31_ + 56), (1.0 - (this._loadDouble((_31_ + 48)))));
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 56));
        this._storeInt((0 + 4), (_31_ + 64));
        return _30_;
    }

    @Override()
    public final double common(int _30_, double _31_, int _32_)
    {
        int _33_ = 0;
        double _34_ = 0.0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeDouble((_33_ + 48), _31_);
        this._storeInt((_33_ + 44), _32_);
        this._storeDouble((_33_ + 32), (sin((this._loadDouble((_33_ + 48))))));
        this._storeDouble((_33_ + 24), (cos((this._loadDouble((_33_ + 48))))));
        label$0:
        do {
            if ((this._loadInt((_33_ + 44))) == 0) {
                break label$0;
            }
            this._storeDouble((_33_ + 24), (-(this._loadDouble((_33_ + 24)))));
        }
        while (false);
        this._storeDouble((_33_ + 8), ((this._loadDouble((_33_ + 32))) + (this._loadDouble((_33_ + 24)))));
        label$1:
        do {
            if (((this._loadInt((_33_ + 60))) & 4294967295L) > (2145386495 & 4294967295L)) {
                break label$1;
            }
            this._storeDouble((_33_ + 16), ((this._loadDouble((_33_ + 32))) - (this._loadDouble((_33_ + 24)))));
            this._storeDouble(_33_, (-(cos(((_31_ = this._loadDouble((_33_ + 48))) + _31_)))));
            label$2:
            do {
                label$3:
                do {
                    if (((((_31_ = (this._loadDouble((_33_ + 32))) * (this._loadDouble((_33_ + 24)))) >= 0.0) ? 1 : 0) | ((_31_ != _31_) ? 1 : 0)) != 0) {
                        break label$3;
                    }
                    this._storeDouble((_33_ + 8), ((this._loadDouble(_33_)) / (this._loadDouble((_33_ + 16)))));
                    break label$2;
                }
                while (false);
                this._storeDouble((_33_ + 16), ((this._loadDouble(_33_)) / (this._loadDouble((_33_ + 8)))));
            }
            while (false);
            if (((this._loadInt((_33_ + 60))) & 4294967295L) > (1207959551 & 4294967295L)) {
                break label$1;
            }
            label$4:
            do {
                if ((this._loadInt((_33_ + 44))) == 0) {
                    break label$4;
                }
                this._storeDouble((_33_ + 16), (-(this._loadDouble((_33_ + 16)))));
            }
            while (false);
            this._storeDouble((_33_ + 8), (((pzero((this._loadDouble((_33_ + 48))))) * (this._loadDouble((_33_ + 8)))) - ((qzero((this._loadDouble((_33_ + 48))))) * (this._loadDouble((_33_ + 16))))));
        }
        while (false);
        _31_ = this._loadDouble((_33_ + 8));
        _34_ = this._loadDouble((_33_ + 48));
        this._storeInt((0 + 4), (_33_ + 64));
        return ((_31_ * 0.5641895835477563) / (Math.sqrt(_34_)));
    }

    @Override()
    public final double pzero(double _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeDouble(((_32_ = (this._loadInt((0 + 4))) - 64) + 8), (this._storeDouble((_32_ + 56), _30_)));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_32_ + 20), ((this._storeInt((_32_ + 20), (this._loadInt((_32_ + 12))))) & 2147483647))) & 4294967295L) < (1075838976 & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((_32_ + 52), 10608);
                this._storeInt((_32_ + 48), 10656);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_32_ + 20))) & 4294967295L) < (1074933387 & 4294967295L)) {
                    break label$2;
                }
                this._storeInt((_32_ + 52), 10704);
                this._storeInt((_32_ + 48), 10752);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_32_ + 20))) & 4294967295L) < (1074191213 & 4294967295L)) {
                    break label$3;
                }
                this._storeInt((_32_ + 52), 10800);
                this._storeInt((_32_ + 48), 10848);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 52), 10896);
            this._storeInt((_32_ + 48), 10944);
        }
        while (false);
        _30_ = this._storeDouble((_32_ + 40), (1.0 / ((_30_ = this._loadDouble((_32_ + 56))) * _30_)));
        this._storeDouble((_32_ + 32), ((this._loadDouble((_31_ = this._loadInt((_32_ + 52))))) + (_30_ * ((this._loadDouble((_31_ + 8))) + (_30_ * ((this._loadDouble((_31_ + 16))) + (_30_ * ((this._loadDouble((_31_ + 24))) + (_30_ * ((this._loadDouble((_31_ + 32))) + (_30_ * (this._loadDouble((_31_ + 40))))))))))))));
        _30_ = this._storeDouble((_32_ + 24), (((_30_ = this._loadDouble((_32_ + 40))) * ((this._loadDouble((_31_ = this._loadInt((_32_ + 48))))) + (_30_ * ((this._loadDouble((_31_ + 8))) + (_30_ * ((this._loadDouble((_31_ + 16))) + (_30_ * ((this._loadDouble((_31_ + 24))) + (_30_ * (this._loadDouble((_31_ + 32)))))))))))) + 1.0));
        return (((this._loadDouble((_32_ + 32))) / _30_) + 1.0);
    }

    @Override()
    public final double qzero(double _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeDouble(((_32_ = (this._loadInt((0 + 4))) - 64) + 8), (this._storeDouble((_32_ + 56), _30_)));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_32_ + 20), ((this._storeInt((_32_ + 20), (this._loadInt((_32_ + 12))))) & 2147483647))) & 4294967295L) < (1075838976 & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((_32_ + 52), 10224);
                this._storeInt((_32_ + 48), 10272);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_32_ + 20))) & 4294967295L) < (1074933387 & 4294967295L)) {
                    break label$2;
                }
                this._storeInt((_32_ + 52), 10320);
                this._storeInt((_32_ + 48), 10368);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_32_ + 20))) & 4294967295L) < (1074191213 & 4294967295L)) {
                    break label$3;
                }
                this._storeInt((_32_ + 52), 10416);
                this._storeInt((_32_ + 48), 10464);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 52), 10512);
            this._storeInt((_32_ + 48), 10560);
        }
        while (false);
        _30_ = this._storeDouble((_32_ + 24), (1.0 / ((_30_ = this._loadDouble((_32_ + 56))) * _30_)));
        this._storeDouble((_32_ + 32), ((this._loadDouble((_31_ = this._loadInt((_32_ + 52))))) + (_30_ * ((this._loadDouble((_31_ + 8))) + (_30_ * ((this._loadDouble((_31_ + 16))) + (_30_ * ((this._loadDouble((_31_ + 24))) + (_30_ * ((this._loadDouble((_31_ + 32))) + (_30_ * (this._loadDouble((_31_ + 40))))))))))))));
        _30_ = this._storeDouble((_32_ + 40), (((_30_ = this._loadDouble((_32_ + 24))) * ((this._loadDouble((_31_ = this._loadInt((_32_ + 48))))) + (_30_ * ((this._loadDouble((_31_ + 8))) + (_30_ * ((this._loadDouble((_31_ + 16))) + (_30_ * ((this._loadDouble((_31_ + 24))) + (_30_ * ((this._loadDouble((_31_ + 32))) + (_30_ * (this._loadDouble((_31_ + 40)))))))))))))) + 1.0));
        return ((((this._loadDouble((_32_ + 32))) / _30_) + -0.125) / (this._loadDouble((_32_ + 56))));
    }

    @Override()
    public final double y0(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 48), _30_);
        this._storeDouble((_31_ + 8), (this._loadDouble((_31_ + 48))));
        this._storeLong32((_31_ + 20), (this._loadLong32u((_31_ + 12))));
        this._storeLong32((_31_ + 16), (this._loadLong((_31_ + 8))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((((this._loadInt((_31_ + 20))) << 1) | (this._loadInt((_31_ + 16)))) == 0) {
                        break label$2;
                    }
                    if (((this._loadInt((_31_ + 20))) >>> 31) == 0) {
                        break label$1;
                    }
                    this._storeLong((_31_ + 56), 9221120237041090560L);
                    break label$0;
                }
                while (false);
                this._storeLong((_31_ + 56), -4503599627370496L);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) < (2146435072 & 4294967295L)) {
                    break label$3;
                }
                this._storeDouble((_31_ + 56), (1.0 / (this._loadDouble((_31_ + 48)))));
                break label$0;
            }
            while (false);
            label$4:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) < (1073741824 & 4294967295L)) {
                    break label$4;
                }
                this._storeDouble((_31_ + 56), (common((this._loadInt((_31_ + 20))), (this._loadDouble((_31_ + 48))), 1)));
                break label$0;
            }
            while (false);
            label$5:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) < (1044381696 & 4294967295L)) {
                    break label$5;
                }
                this._storeDouble((_31_ + 32), (((_30_ = this._storeDouble((_31_ + 40), ((_30_ = this._loadDouble((_31_ + 48))) * _30_))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * -3.982051941321034E-11) + 1.9559013703502292E-8)) + -3.8140705372436416E-6)) + 3.4745343209368365E-4)) + -0.01381856719455969)) + 0.17666645250918112)) + -0.07380429510868723));
                _30_ = this._storeDouble((_31_ + 24), (((_30_ = this._loadDouble((_31_ + 40))) * ((_30_ * ((_30_ * ((_30_ * 4.4111031133267547E-10) + 2.591508518404578E-7)) + 7.600686273503533E-5)) + 0.01273048348341237)) + 1.0));
                this._storeDouble((_31_ + 56), (((this._loadDouble((_31_ + 32))) / _30_) + (((j0((this._loadDouble((_31_ + 48))))) * (log((this._loadDouble((_31_ + 48)))))) * 0.6366197723675814)));
                break label$0;
            }
            while (false);
            this._storeDouble((_31_ + 56), (((log((this._loadDouble((_31_ + 48))))) * 0.6366197723675814) + -0.07380429510868723));
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 56));
        this._storeInt((0 + 4), (_31_ + 64));
        return _30_;
    }

    @Override()
    public final float j0f(float _30_)
    {
        int _31_ = 0;
        float _32_ = 0.0f;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeFloat(_31_, (this._loadFloat((_31_ + 24))));
        this._storeInt((_31_ + 8), (this._loadInt(_31_)));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) & 2147483647))) & 4294967295L) < (2139095040 & 4294967295L)) {
                    break label$1;
                }
                this._storeFloat((_31_ + 28), (1.0f / ((_30_ = this._loadFloat((_31_ + 24))) * _30_)));
                break label$0;
            }
            while (false);
            this._storeFloat((_31_ + 24), (Math.abs((this._loadFloat((_31_ + 24))))));
            label$2:
            do {
                if (((this._loadInt((_31_ + 8))) & 4294967295L) < (1073741824 & 4294967295L)) {
                    break label$2;
                }
                this._storeFloat((_31_ + 28), (common$2e$102((this._loadInt((_31_ + 8))), (this._loadFloat((_31_ + 24))), 0)));
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_31_ + 8))) & 4294967295L) < (973078528 & 4294967295L)) {
                    break label$3;
                }
                this._storeFloat((_31_ + 16), ((_30_ = this._storeFloat((_31_ + 20), ((_30_ = this._loadFloat((_31_ + 24))) * _30_))) * ((_30_ * ((_30_ * ((_30_ * -4.618327E-9f) + 1.8295405E-6f)) + -1.899793E-4f)) + 0.015625f)));
                _30_ = this._storeFloat((_31_ + 12), (((_30_ = this._loadFloat((_31_ + 20))) * ((_30_ * ((_30_ * ((_30_ * 1.1661401E-9f) + 5.135465E-7f)) + 1.16926785E-4f)) + 0.015619103f)) + 1.0f));
                this._storeFloat((_31_ + 28), ((((_32_ = (this._loadFloat((_31_ + 24))) / 2.0f) + 1.0f) * (1.0f - _32_)) + ((this._loadFloat((_31_ + 20))) * ((this._loadFloat((_31_ + 16))) / _30_))));
                break label$0;
            }
            while (false);
            label$4:
            do {
                if (((this._loadInt((_31_ + 8))) & 4294967295L) < (562036736 & 4294967295L)) {
                    break label$4;
                }
                this._storeFloat((_31_ + 24), (((_30_ = this._loadFloat((_31_ + 24))) * 0.25f) * _30_));
            }
            while (false);
            this._storeFloat((_31_ + 28), (1.0f - (this._loadFloat((_31_ + 24)))));
        }
        while (false);
        _30_ = this._loadFloat((_31_ + 28));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final float common$2e$102(int _30_, float _31_, int _32_)
    {
        int _33_ = 0;
        float _34_ = 0.0f;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeFloat((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeFloat((_33_ + 12), (sinf((this._loadFloat((_33_ + 24))))));
        this._storeFloat((_33_ + 8), (cosf((this._loadFloat((_33_ + 24))))));
        label$0:
        do {
            if ((this._loadInt((_33_ + 20))) == 0) {
                break label$0;
            }
            this._storeFloat((_33_ + 8), (-(this._loadFloat((_33_ + 8)))));
        }
        while (false);
        this._storeFloat(_33_, ((this._loadFloat((_33_ + 12))) + (this._loadFloat((_33_ + 8)))));
        label$1:
        do {
            if (((this._loadInt((_33_ + 28))) & 4294967295L) > (2130706431 & 4294967295L)) {
                break label$1;
            }
            this._storeFloat((_33_ + 4), ((this._loadFloat((_33_ + 12))) - (this._loadFloat((_33_ + 8)))));
            this._storeFloat((_33_ + 16), (-(cosf(((_31_ = this._loadFloat((_33_ + 24))) + _31_)))));
            label$2:
            do {
                label$3:
                do {
                    if (((((_31_ = (this._loadFloat((_33_ + 12))) * (this._loadFloat((_33_ + 8)))) >= 0.0f) ? 1 : 0) | ((_31_ != _31_) ? 1 : 0)) != 0) {
                        break label$3;
                    }
                    this._storeFloat(_33_, ((this._loadFloat((_33_ + 16))) / (this._loadFloat((_33_ + 4)))));
                    break label$2;
                }
                while (false);
                this._storeFloat((_33_ + 4), ((this._loadFloat((_33_ + 16))) / (this._loadFloat(_33_))));
            }
            while (false);
            if (((this._loadInt((_33_ + 28))) & 4294967295L) > (1484783615 & 4294967295L)) {
                break label$1;
            }
            label$4:
            do {
                if ((this._loadInt((_33_ + 20))) == 0) {
                    break label$4;
                }
                this._storeFloat((_33_ + 4), (-(this._loadFloat((_33_ + 4)))));
            }
            while (false);
            this._storeFloat(_33_, (((pzerof((this._loadFloat((_33_ + 24))))) * (this._loadFloat(_33_))) - ((qzerof((this._loadFloat((_33_ + 24))))) * (this._loadFloat((_33_ + 4))))));
        }
        while (false);
        _31_ = this._loadFloat(_33_);
        _34_ = this._loadFloat((_33_ + 24));
        this._storeInt((0 + 4), (_33_ + 32));
        return ((_31_ * 0.5641896f) / ((float) (Math.sqrt(_34_))));
    }

    @Override()
    public final float pzerof(float _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeFloat((_32_ = (this._loadInt((0 + 4))) - 32), (this._storeFloat((_32_ + 28), _30_)));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_32_ + 4), ((this._storeInt((_32_ + 4), (this._loadInt(_32_)))) & 2147483647))) & 4294967295L) < (1090519040 & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((_32_ + 24), 11248);
                this._storeInt((_32_ + 20), 11280);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_32_ + 4))) & 4294967295L) < (1089936472 & 4294967295L)) {
                    break label$2;
                }
                this._storeInt((_32_ + 24), 11312);
                this._storeInt((_32_ + 20), 11344);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_32_ + 4))) & 4294967295L) < (1077336936 & 4294967295L)) {
                    break label$3;
                }
                this._storeInt((_32_ + 24), 11376);
                this._storeInt((_32_ + 20), 11408);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 24), 11440);
            this._storeInt((_32_ + 20), 11472);
        }
        while (false);
        _30_ = this._storeFloat((_32_ + 16), (1.0f / ((_30_ = this._loadFloat((_32_ + 28))) * _30_)));
        this._storeFloat((_32_ + 12), ((this._loadFloat((_31_ = this._loadInt((_32_ + 24))))) + (_30_ * ((this._loadFloat((_31_ + 4))) + (_30_ * ((this._loadFloat((_31_ + 8))) + (_30_ * ((this._loadFloat((_31_ + 12))) + (_30_ * ((this._loadFloat((_31_ + 16))) + (_30_ * (this._loadFloat((_31_ + 20))))))))))))));
        _30_ = this._storeFloat((_32_ + 8), (((_30_ = this._loadFloat((_32_ + 16))) * ((this._loadFloat((_31_ = this._loadInt((_32_ + 20))))) + (_30_ * ((this._loadFloat((_31_ + 4))) + (_30_ * ((this._loadFloat((_31_ + 8))) + (_30_ * ((this._loadFloat((_31_ + 12))) + (_30_ * (this._loadFloat((_31_ + 16)))))))))))) + 1.0f));
        return (((this._loadFloat((_32_ + 12))) / _30_) + 1.0f);
    }

    @Override()
    public final float qzerof(float _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeFloat((_32_ = (this._loadInt((0 + 4))) - 32), (this._storeFloat((_32_ + 28), _30_)));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_32_ + 4), ((this._storeInt((_32_ + 4), (this._loadInt(_32_)))) & 2147483647))) & 4294967295L) < (1090519040 & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((_32_ + 24), 10992);
                this._storeInt((_32_ + 20), 11024);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_32_ + 4))) & 4294967295L) < (1089936472 & 4294967295L)) {
                    break label$2;
                }
                this._storeInt((_32_ + 24), 11056);
                this._storeInt((_32_ + 20), 11088);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_32_ + 4))) & 4294967295L) < (1077336936 & 4294967295L)) {
                    break label$3;
                }
                this._storeInt((_32_ + 24), 11120);
                this._storeInt((_32_ + 20), 11152);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 24), 11184);
            this._storeInt((_32_ + 20), 11216);
        }
        while (false);
        _30_ = this._storeFloat((_32_ + 8), (1.0f / ((_30_ = this._loadFloat((_32_ + 28))) * _30_)));
        this._storeFloat((_32_ + 12), ((this._loadFloat((_31_ = this._loadInt((_32_ + 24))))) + (_30_ * ((this._loadFloat((_31_ + 4))) + (_30_ * ((this._loadFloat((_31_ + 8))) + (_30_ * ((this._loadFloat((_31_ + 12))) + (_30_ * ((this._loadFloat((_31_ + 16))) + (_30_ * (this._loadFloat((_31_ + 20))))))))))))));
        _30_ = this._storeFloat((_32_ + 16), (((_30_ = this._loadFloat((_32_ + 8))) * ((this._loadFloat((_31_ = this._loadInt((_32_ + 20))))) + (_30_ * ((this._loadFloat((_31_ + 4))) + (_30_ * ((this._loadFloat((_31_ + 8))) + (_30_ * ((this._loadFloat((_31_ + 12))) + (_30_ * ((this._loadFloat((_31_ + 16))) + (_30_ * (this._loadFloat((_31_ + 20)))))))))))))) + 1.0f));
        return ((((this._loadFloat((_32_ + 12))) / _30_) + -0.125f) / (this._loadFloat((_32_ + 28))));
    }

    @Override()
    public final float y0f(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeFloat(_31_, (this._loadFloat((_31_ + 24))));
        this._storeInt((_31_ + 8), (this._loadInt(_31_)));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadInt((_31_ + 8))) & 2147483647) == 0) {
                        break label$2;
                    }
                    if (((this._loadInt((_31_ + 8))) >>> 31) == 0) {
                        break label$1;
                    }
                    this._storeInt((_31_ + 28), 2143289344);
                    break label$0;
                }
                while (false);
                this._storeInt((_31_ + 28), -8388608);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_31_ + 8))) & 4294967295L) < (2139095040 & 4294967295L)) {
                    break label$3;
                }
                this._storeFloat((_31_ + 28), (1.0f / (this._loadFloat((_31_ + 24)))));
                break label$0;
            }
            while (false);
            label$4:
            do {
                if (((this._loadInt((_31_ + 8))) & 4294967295L) < (1073741824 & 4294967295L)) {
                    break label$4;
                }
                this._storeFloat((_31_ + 28), (common$2e$102((this._loadInt((_31_ + 8))), (this._loadFloat((_31_ + 24))), 1)));
                break label$0;
            }
            while (false);
            label$5:
            do {
                if (((this._loadInt((_31_ + 8))) & 4294967295L) < (956301312 & 4294967295L)) {
                    break label$5;
                }
                this._storeFloat((_31_ + 16), (((_30_ = this._storeFloat((_31_ + 20), ((_30_ = this._loadFloat((_31_ + 24))) * _30_))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * -3.982052E-11f) + 1.9559014E-8f)) + -3.8140706E-6f)) + 3.4745343E-4f)) + -0.013818568f)) + 0.17666645f)) + -0.0738043f));
                _30_ = this._storeFloat((_31_ + 12), (((_30_ = this._loadFloat((_31_ + 20))) * ((_30_ * ((_30_ * ((_30_ * 4.4111031E-10f) + 2.5915085E-7f)) + 7.6006865E-5f)) + 0.012730484f)) + 1.0f));
                this._storeFloat((_31_ + 28), (((this._loadFloat((_31_ + 16))) / _30_) + (((j0f((this._loadFloat((_31_ + 24))))) * (logf((this._loadFloat((_31_ + 24)))))) * 0.63661975f)));
                break label$0;
            }
            while (false);
            this._storeFloat((_31_ + 28), (((logf((this._loadFloat((_31_ + 24))))) * 0.63661975f) + -0.0738043f));
        }
        while (false);
        _30_ = this._loadFloat((_31_ + 28));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final double j1(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 48), _30_);
        this._storeDouble((_31_ + 8), (this._loadDouble((_31_ + 48))));
        this._storeLong32((_31_ + 20), (this._loadLong32u((_31_ + 12))));
        this._storeInt((_31_ + 16), ((this._loadInt((_31_ + 20))) >>> 31));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_31_ + 20), ((this._loadInt((_31_ + 20))) & 2147483647))) & 4294967295L) < (2146435072 & 4294967295L)) {
                    break label$1;
                }
                this._storeDouble((_31_ + 56), (1.0 / ((_30_ = this._loadDouble((_31_ + 48))) * _30_)));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) < (1073741824 & 4294967295L)) {
                    break label$2;
                }
                this._storeDouble((_31_ + 56), (common$2e$119((this._loadInt((_31_ + 20))), (Math.abs((this._loadDouble((_31_ + 48))))), 0, (this._loadInt((_31_ + 16))))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if (((this._loadInt((_31_ + 20))) & 4294967295L) < (939524096 & 4294967295L)) {
                        break label$4;
                    }
                    this._storeDouble((_31_ + 32), ((_30_ = this._storeDouble((_31_ + 40), ((_30_ = this._loadDouble((_31_ + 48))) * _30_))) * ((_30_ * ((_30_ * ((_30_ * 4.9672799960958445E-8) + -1.599556310840356E-5)) + 0.001407056669551897)) + -0.0625)));
                    _30_ = this._storeDouble((_31_ + 24), (((_30_ = this._loadDouble((_31_ + 40))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 1.2354227442613791E-11) + 5.0463625707621704E-9)) + 1.1771846404262368E-6)) + 1.8594678558863092E-4)) + 0.019153759953836346)) + 1.0));
                    this._storeDouble((_31_ + 40), ((this._loadDouble((_31_ + 32))) / _30_));
                    break label$3;
                }
                while (false);
                this._storeDouble((_31_ + 40), (this._loadDouble((_31_ + 48))));
            }
            while (false);
            this._storeDouble((_31_ + 56), (((this._loadDouble((_31_ + 40))) + 0.5) * (this._loadDouble((_31_ + 48)))));
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 56));
        this._storeInt((0 + 4), (_31_ + 64));
        return _30_;
    }

    @Override()
    public final double common$2e$119(int _30_, double _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        double _35_ = 0.0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeDouble((_34_ + 48), _31_);
        this._storeInt((_34_ + 44), _32_);
        this._storeInt((_34_ + 40), _33_);
        this._storeDouble((_34_ + 24), (sin((this._loadDouble((_34_ + 48))))));
        label$0:
        do {
            if ((this._loadInt((_34_ + 44))) == 0) {
                break label$0;
            }
            this._storeDouble((_34_ + 24), (-(this._loadDouble((_34_ + 24)))));
        }
        while (false);
        _31_ = this._storeDouble((_34_ + 16), (cos((this._loadDouble((_34_ + 48))))));
        this._storeDouble(_34_, ((this._loadDouble((_34_ + 24))) - _31_));
        label$1:
        do {
            if (((this._loadInt((_34_ + 60))) & 4294967295L) > (2145386495 & 4294967295L)) {
                break label$1;
            }
            this._storeDouble((_34_ + 8), ((-(this._loadDouble((_34_ + 24)))) - (this._loadDouble((_34_ + 16)))));
            this._storeDouble((_34_ + 32), (cos(((_31_ = this._loadDouble((_34_ + 48))) + _31_))));
            label$2:
            do {
                label$3:
                do {
                    if (((((_31_ = (this._loadDouble((_34_ + 24))) * (this._loadDouble((_34_ + 16)))) <= 0.0) ? 1 : 0) | ((_31_ != _31_) ? 1 : 0)) != 0) {
                        break label$3;
                    }
                    this._storeDouble(_34_, ((this._loadDouble((_34_ + 32))) / (this._loadDouble((_34_ + 8)))));
                    break label$2;
                }
                while (false);
                this._storeDouble((_34_ + 8), ((this._loadDouble((_34_ + 32))) / (this._loadDouble(_34_))));
            }
            while (false);
            if (((this._loadInt((_34_ + 60))) & 4294967295L) > (1207959551 & 4294967295L)) {
                break label$1;
            }
            label$4:
            do {
                if ((this._loadInt((_34_ + 44))) == 0) {
                    break label$4;
                }
                this._storeDouble((_34_ + 8), (-(this._loadDouble((_34_ + 8)))));
            }
            while (false);
            this._storeDouble(_34_, (((pone((this._loadDouble((_34_ + 48))))) * (this._loadDouble(_34_))) - ((qone((this._loadDouble((_34_ + 48))))) * (this._loadDouble((_34_ + 8))))));
        }
        while (false);
        label$5:
        do {
            if ((this._loadInt((_34_ + 40))) == 0) {
                break label$5;
            }
            this._storeDouble(_34_, (-(this._loadDouble(_34_))));
        }
        while (false);
        _31_ = this._loadDouble(_34_);
        _35_ = this._loadDouble((_34_ + 48));
        this._storeInt((0 + 4), (_34_ + 64));
        return ((_31_ * 0.5641895835477563) / (Math.sqrt(_35_)));
    }

    @Override()
    public final double pone(double _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeDouble(((_32_ = (this._loadInt((0 + 4))) - 64) + 8), (this._storeDouble((_32_ + 56), _30_)));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_32_ + 20), ((this._storeInt((_32_ + 20), (this._loadInt((_32_ + 12))))) & 2147483647))) & 4294967295L) < (1075838976 & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((_32_ + 52), 11888);
                this._storeInt((_32_ + 48), 11936);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_32_ + 20))) & 4294967295L) < (1074933387 & 4294967295L)) {
                    break label$2;
                }
                this._storeInt((_32_ + 52), 11984);
                this._storeInt((_32_ + 48), 12032);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_32_ + 20))) & 4294967295L) < (1074191213 & 4294967295L)) {
                    break label$3;
                }
                this._storeInt((_32_ + 52), 12080);
                this._storeInt((_32_ + 48), 12128);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 52), 12176);
            this._storeInt((_32_ + 48), 12224);
        }
        while (false);
        _30_ = this._storeDouble((_32_ + 40), (1.0 / ((_30_ = this._loadDouble((_32_ + 56))) * _30_)));
        this._storeDouble((_32_ + 32), ((this._loadDouble((_31_ = this._loadInt((_32_ + 52))))) + (_30_ * ((this._loadDouble((_31_ + 8))) + (_30_ * ((this._loadDouble((_31_ + 16))) + (_30_ * ((this._loadDouble((_31_ + 24))) + (_30_ * ((this._loadDouble((_31_ + 32))) + (_30_ * (this._loadDouble((_31_ + 40))))))))))))));
        _30_ = this._storeDouble((_32_ + 24), (((_30_ = this._loadDouble((_32_ + 40))) * ((this._loadDouble((_31_ = this._loadInt((_32_ + 48))))) + (_30_ * ((this._loadDouble((_31_ + 8))) + (_30_ * ((this._loadDouble((_31_ + 16))) + (_30_ * ((this._loadDouble((_31_ + 24))) + (_30_ * (this._loadDouble((_31_ + 32)))))))))))) + 1.0));
        return (((this._loadDouble((_32_ + 32))) / _30_) + 1.0);
    }

    @Override()
    public final double qone(double _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeDouble(((_32_ = (this._loadInt((0 + 4))) - 64) + 8), (this._storeDouble((_32_ + 56), _30_)));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_32_ + 20), ((this._storeInt((_32_ + 20), (this._loadInt((_32_ + 12))))) & 2147483647))) & 4294967295L) < (1075838976 & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((_32_ + 52), 11504);
                this._storeInt((_32_ + 48), 11552);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_32_ + 20))) & 4294967295L) < (1074933387 & 4294967295L)) {
                    break label$2;
                }
                this._storeInt((_32_ + 52), 11600);
                this._storeInt((_32_ + 48), 11648);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_32_ + 20))) & 4294967295L) < (1074191213 & 4294967295L)) {
                    break label$3;
                }
                this._storeInt((_32_ + 52), 11696);
                this._storeInt((_32_ + 48), 11744);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 52), 11792);
            this._storeInt((_32_ + 48), 11840);
        }
        while (false);
        _30_ = this._storeDouble((_32_ + 24), (1.0 / ((_30_ = this._loadDouble((_32_ + 56))) * _30_)));
        this._storeDouble((_32_ + 32), ((this._loadDouble((_31_ = this._loadInt((_32_ + 52))))) + (_30_ * ((this._loadDouble((_31_ + 8))) + (_30_ * ((this._loadDouble((_31_ + 16))) + (_30_ * ((this._loadDouble((_31_ + 24))) + (_30_ * ((this._loadDouble((_31_ + 32))) + (_30_ * (this._loadDouble((_31_ + 40))))))))))))));
        _30_ = this._storeDouble((_32_ + 40), (((_30_ = this._loadDouble((_32_ + 24))) * ((this._loadDouble((_31_ = this._loadInt((_32_ + 48))))) + (_30_ * ((this._loadDouble((_31_ + 8))) + (_30_ * ((this._loadDouble((_31_ + 16))) + (_30_ * ((this._loadDouble((_31_ + 24))) + (_30_ * ((this._loadDouble((_31_ + 32))) + (_30_ * (this._loadDouble((_31_ + 40)))))))))))))) + 1.0));
        return ((((this._loadDouble((_32_ + 32))) / _30_) + 0.375) / (this._loadDouble((_32_ + 56))));
    }

    @Override()
    public final double y1(double _30_)
    {
        int _31_ = 0;
        double _32_ = 0.0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 48), _30_);
        this._storeDouble((_31_ + 8), (this._loadDouble((_31_ + 48))));
        this._storeLong32((_31_ + 20), (this._loadLong32u((_31_ + 12))));
        this._storeLong32((_31_ + 16), (this._loadLong((_31_ + 8))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((((this._loadInt((_31_ + 20))) << 1) | (this._loadInt((_31_ + 16)))) == 0) {
                        break label$2;
                    }
                    if (((this._loadInt((_31_ + 20))) >>> 31) == 0) {
                        break label$1;
                    }
                    this._storeLong((_31_ + 56), 9221120237041090560L);
                    break label$0;
                }
                while (false);
                this._storeLong((_31_ + 56), -4503599627370496L);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) < (2146435072 & 4294967295L)) {
                    break label$3;
                }
                this._storeDouble((_31_ + 56), (1.0 / (this._loadDouble((_31_ + 48)))));
                break label$0;
            }
            while (false);
            label$4:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) < (1073741824 & 4294967295L)) {
                    break label$4;
                }
                this._storeDouble((_31_ + 56), (common$2e$119((this._loadInt((_31_ + 20))), (this._loadDouble((_31_ + 48))), 1, 0)));
                break label$0;
            }
            while (false);
            label$5:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) > (1016070143 & 4294967295L)) {
                    break label$5;
                }
                this._storeDouble((_31_ + 56), (-0.6366197723675814 / (this._loadDouble((_31_ + 48)))));
                break label$0;
            }
            while (false);
            this._storeDouble((_31_ + 32), ((this._loadDouble((0 + 12272))) + ((_30_ = this._storeDouble((_31_ + 40), ((_30_ = this._loadDouble((_31_ + 48))) * _30_))) * ((this._loadDouble((0 + 12280))) + (_30_ * ((this._loadDouble((0 + 12288))) + (_30_ * ((this._loadDouble((0 + 12296))) + (_30_ * (this._loadDouble((0 + 12304))))))))))));
            _30_ = this._storeDouble((_31_ + 24), (((_30_ = this._loadDouble((_31_ + 40))) * ((this._loadDouble((0 + 12320))) + (_30_ * ((this._loadDouble((0 + 12328))) + (_30_ * ((this._loadDouble((0 + 12336))) + (_30_ * ((this._loadDouble((0 + 12344))) + (_30_ * (this._loadDouble((0 + 12352)))))))))))) + 1.0));
            this._storeDouble((_31_ + 56), (((_32_ = this._loadDouble((_31_ + 48))) * ((this._loadDouble((_31_ + 32))) / _30_)) + ((((j1(_32_)) * (log((this._loadDouble((_31_ + 48)))))) - (1.0 / (this._loadDouble((_31_ + 48))))) * 0.6366197723675814)));
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 56));
        this._storeInt((0 + 4), (_31_ + 64));
        return _30_;
    }

    @Override()
    public final float j1f(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeFloat(_31_, (this._loadFloat((_31_ + 24))));
        this._storeInt((_31_ + 8), (this._loadInt(_31_)));
        this._storeInt((_31_ + 4), ((this._loadInt((_31_ + 8))) >>> 31));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) & 2147483647))) & 4294967295L) < (2139095040 & 4294967295L)) {
                    break label$1;
                }
                this._storeFloat((_31_ + 28), (1.0f / ((_30_ = this._loadFloat((_31_ + 24))) * _30_)));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_31_ + 8))) & 4294967295L) < (1073741824 & 4294967295L)) {
                    break label$2;
                }
                this._storeFloat((_31_ + 28), (common$2e$120((this._loadInt((_31_ + 8))), (Math.abs((this._loadFloat((_31_ + 24))))), 0, (this._loadInt((_31_ + 4))))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if (((this._loadInt((_31_ + 8))) & 4294967295L) < (838860800 & 4294967295L)) {
                        break label$4;
                    }
                    this._storeFloat((_31_ + 16), ((_30_ = this._storeFloat((_31_ + 20), ((_30_ = this._loadFloat((_31_ + 24))) * _30_))) * ((_30_ * ((_30_ * ((_30_ * 4.96728E-8f) + -1.5995563E-5f)) + 0.0014070567f)) + -0.0625f)));
                    _30_ = this._storeFloat((_31_ + 12), (((_30_ = this._loadFloat((_31_ + 20))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 1.2354227E-11f) + 5.0463624E-9f)) + 1.1771847E-6f)) + 1.8594679E-4f)) + 0.01915376f)) + 1.0f));
                    this._storeFloat((_31_ + 20), (((this._loadFloat((_31_ + 16))) / _30_) + 0.5f));
                    break label$3;
                }
                while (false);
                this._storeFloat((_31_ + 20), ((this._loadFloat((_31_ + 24))) + 0.5f));
            }
            while (false);
            this._storeFloat((_31_ + 28), ((this._loadFloat((_31_ + 20))) * (this._loadFloat((_31_ + 24)))));
        }
        while (false);
        _30_ = this._loadFloat((_31_ + 28));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final float common$2e$120(int _30_, float _31_, int _32_, int _33_)
    {
        double _34_ = 0.0;
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeFloat((_35_ + 56), _31_);
        this._storeInt((_35_ + 52), _32_);
        this._storeInt((_35_ + 48), _33_);
        this._storeDouble((_35_ + 32), ((double) (sinf((this._loadFloat((_35_ + 56)))))));
        label$0:
        do {
            if ((this._loadInt((_35_ + 52))) == 0) {
                break label$0;
            }
            this._storeDouble((_35_ + 32), (-(this._loadDouble((_35_ + 32)))));
        }
        while (false);
        _34_ = this._storeDouble((_35_ + 24), ((double) (cosf((this._loadFloat((_35_ + 56)))))));
        this._storeDouble((_35_ + 8), ((this._loadDouble((_35_ + 32))) - _34_));
        label$1:
        do {
            if (((this._loadInt((_35_ + 60))) & 4294967295L) > (2130706431 & 4294967295L)) {
                break label$1;
            }
            this._storeDouble((_35_ + 16), ((-(this._loadDouble((_35_ + 32)))) - (this._loadDouble((_35_ + 24)))));
            this._storeDouble((_35_ + 40), ((double) (cosf(((_31_ = this._loadFloat((_35_ + 56))) + _31_)))));
            label$2:
            do {
                label$3:
                do {
                    if (((((_34_ = (this._loadDouble((_35_ + 32))) * (this._loadDouble((_35_ + 24)))) <= 0.0) ? 1 : 0) | ((_34_ != _34_) ? 1 : 0)) != 0) {
                        break label$3;
                    }
                    this._storeDouble((_35_ + 8), ((this._loadDouble((_35_ + 40))) / (this._loadDouble((_35_ + 16)))));
                    break label$2;
                }
                while (false);
                this._storeDouble((_35_ + 16), ((this._loadDouble((_35_ + 40))) / (this._loadDouble((_35_ + 8)))));
            }
            while (false);
            if (((this._loadInt((_35_ + 60))) & 4294967295L) > (1484783615 & 4294967295L)) {
                break label$1;
            }
            label$4:
            do {
                if ((this._loadInt((_35_ + 52))) == 0) {
                    break label$4;
                }
                this._storeDouble((_35_ + 16), (-(this._loadDouble((_35_ + 16)))));
            }
            while (false);
            this._storeDouble((_35_ + 8), ((((double) (ponef((this._loadFloat((_35_ + 56)))))) * (this._loadDouble((_35_ + 8)))) - (((double) (qonef((this._loadFloat((_35_ + 56)))))) * (this._loadDouble((_35_ + 16))))));
        }
        while (false);
        label$5:
        do {
            if ((this._loadInt((_35_ + 48))) == 0) {
                break label$5;
            }
            this._storeDouble((_35_ + 8), (-(this._loadDouble((_35_ + 8)))));
        }
        while (false);
        _34_ = this._loadDouble((_35_ + 8));
        _31_ = this._loadFloat((_35_ + 56));
        this._storeInt((0 + 4), (_35_ + 64));
        return ((float) ((_34_ * 0.564189612865448) / ((double) ((float) (Math.sqrt(_31_))))));
    }

    @Override()
    public final float ponef(float _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeFloat((_32_ = (this._loadInt((0 + 4))) - 32), (this._storeFloat((_32_ + 28), _30_)));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_32_ + 4), ((this._storeInt((_32_ + 4), (this._loadInt(_32_)))) & 2147483647))) & 4294967295L) < (1090519040 & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((_32_ + 24), 12624);
                this._storeInt((_32_ + 20), 12656);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_32_ + 4))) & 4294967295L) < (1089936472 & 4294967295L)) {
                    break label$2;
                }
                this._storeInt((_32_ + 24), 12688);
                this._storeInt((_32_ + 20), 12720);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_32_ + 4))) & 4294967295L) < (1077336936 & 4294967295L)) {
                    break label$3;
                }
                this._storeInt((_32_ + 24), 12752);
                this._storeInt((_32_ + 20), 12784);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 24), 12816);
            this._storeInt((_32_ + 20), 12848);
        }
        while (false);
        _30_ = this._storeFloat((_32_ + 16), (1.0f / ((_30_ = this._loadFloat((_32_ + 28))) * _30_)));
        this._storeFloat((_32_ + 12), ((this._loadFloat((_31_ = this._loadInt((_32_ + 24))))) + (_30_ * ((this._loadFloat((_31_ + 4))) + (_30_ * ((this._loadFloat((_31_ + 8))) + (_30_ * ((this._loadFloat((_31_ + 12))) + (_30_ * ((this._loadFloat((_31_ + 16))) + (_30_ * (this._loadFloat((_31_ + 20))))))))))))));
        _30_ = this._storeFloat((_32_ + 8), (((_30_ = this._loadFloat((_32_ + 16))) * ((this._loadFloat((_31_ = this._loadInt((_32_ + 20))))) + (_30_ * ((this._loadFloat((_31_ + 4))) + (_30_ * ((this._loadFloat((_31_ + 8))) + (_30_ * ((this._loadFloat((_31_ + 12))) + (_30_ * (this._loadFloat((_31_ + 16)))))))))))) + 1.0f));
        return (((this._loadFloat((_32_ + 12))) / _30_) + 1.0f);
    }

    @Override()
    public final float qonef(float _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeFloat((_32_ = (this._loadInt((0 + 4))) - 32), (this._storeFloat((_32_ + 28), _30_)));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_32_ + 4), ((this._storeInt((_32_ + 4), (this._loadInt(_32_)))) & 2147483647))) & 4294967295L) < (1075838976 & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((_32_ + 24), 12368);
                this._storeInt((_32_ + 20), 12400);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_32_ + 4))) & 4294967295L) < (1089936472 & 4294967295L)) {
                    break label$2;
                }
                this._storeInt((_32_ + 24), 12432);
                this._storeInt((_32_ + 20), 12464);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_32_ + 4))) & 4294967295L) < (1077336936 & 4294967295L)) {
                    break label$3;
                }
                this._storeInt((_32_ + 24), 12496);
                this._storeInt((_32_ + 20), 12528);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 24), 12560);
            this._storeInt((_32_ + 20), 12592);
        }
        while (false);
        _30_ = this._storeFloat((_32_ + 8), (1.0f / ((_30_ = this._loadFloat((_32_ + 28))) * _30_)));
        this._storeFloat((_32_ + 12), ((this._loadFloat((_31_ = this._loadInt((_32_ + 24))))) + (_30_ * ((this._loadFloat((_31_ + 4))) + (_30_ * ((this._loadFloat((_31_ + 8))) + (_30_ * ((this._loadFloat((_31_ + 12))) + (_30_ * ((this._loadFloat((_31_ + 16))) + (_30_ * (this._loadFloat((_31_ + 20))))))))))))));
        _30_ = this._storeFloat((_32_ + 16), (((_30_ = this._loadFloat((_32_ + 8))) * ((this._loadFloat((_31_ = this._loadInt((_32_ + 20))))) + (_30_ * ((this._loadFloat((_31_ + 4))) + (_30_ * ((this._loadFloat((_31_ + 8))) + (_30_ * ((this._loadFloat((_31_ + 12))) + (_30_ * ((this._loadFloat((_31_ + 16))) + (_30_ * (this._loadFloat((_31_ + 20)))))))))))))) + 1.0f));
        return ((((this._loadFloat((_32_ + 12))) / _30_) + 0.375f) / (this._loadFloat((_32_ + 28))));
    }

    @Override()
    public final float y1f(float _30_)
    {
        int _31_ = 0;
        float _32_ = 0.0f;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeFloat(_31_, (this._loadFloat((_31_ + 24))));
        this._storeInt((_31_ + 8), (this._loadInt(_31_)));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadInt((_31_ + 8))) & 2147483647) == 0) {
                        break label$2;
                    }
                    if (((this._loadInt((_31_ + 8))) >>> 31) == 0) {
                        break label$1;
                    }
                    this._storeInt((_31_ + 28), 2143289344);
                    break label$0;
                }
                while (false);
                this._storeInt((_31_ + 28), -8388608);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_31_ + 8))) & 4294967295L) < (2139095040 & 4294967295L)) {
                    break label$3;
                }
                this._storeFloat((_31_ + 28), (1.0f / (this._loadFloat((_31_ + 24)))));
                break label$0;
            }
            while (false);
            label$4:
            do {
                if (((this._loadInt((_31_ + 8))) & 4294967295L) < (1073741824 & 4294967295L)) {
                    break label$4;
                }
                this._storeFloat((_31_ + 28), (common$2e$120((this._loadInt((_31_ + 8))), (this._loadFloat((_31_ + 24))), 1, 0)));
                break label$0;
            }
            while (false);
            label$5:
            do {
                if (((this._loadInt((_31_ + 8))) & 4294967295L) > (838860799 & 4294967295L)) {
                    break label$5;
                }
                this._storeFloat((_31_ + 28), (-0.63661975f / (this._loadFloat((_31_ + 24)))));
                break label$0;
            }
            while (false);
            this._storeFloat((_31_ + 16), ((this._loadFloat((0 + 12880))) + ((_30_ = this._storeFloat((_31_ + 20), ((_30_ = this._loadFloat((_31_ + 24))) * _30_))) * ((this._loadFloat((0 + 12884))) + (_30_ * ((this._loadFloat((0 + 12888))) + (_30_ * ((this._loadFloat((0 + 12892))) + (_30_ * (this._loadFloat((0 + 12896))))))))))));
            _30_ = this._storeFloat((_31_ + 12), (((_30_ = this._loadFloat((_31_ + 20))) * ((this._loadFloat((0 + 12912))) + (_30_ * ((this._loadFloat((0 + 12916))) + (_30_ * ((this._loadFloat((0 + 12920))) + (_30_ * ((this._loadFloat((0 + 12924))) + (_30_ * (this._loadFloat((0 + 12928)))))))))))) + 1.0f));
            this._storeFloat((_31_ + 28), (((_32_ = this._loadFloat((_31_ + 24))) * ((this._loadFloat((_31_ + 16))) / _30_)) + ((((j1f(_32_)) * (logf((this._loadFloat((_31_ + 24)))))) - (1.0f / (this._loadFloat((_31_ + 24))))) * 0.63661975f)));
        }
        while (false);
        _30_ = this._loadFloat((_31_ + 28));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final double jn(int _30_, double _31_)
    {
        long _32_ = 0L;
        int _33_ = 0;
        double _34_ = 0.0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 160))) + 148), _30_);
        this._storeDouble((_33_ + 80), (this._storeDouble((_33_ + 136), _31_)));
        this._storeLong32((_33_ + 132), (this._loadLong32u((_33_ + 84))));
        this._storeLong32((_33_ + 128), (this._loadLong((_33_ + 80))));
        this._storeInt((_33_ + 116), ((this._loadInt((_33_ + 132))) >>> 31));
        label$0:
        do {
            label$1:
            do {
                if ((((this._storeInt((_33_ + 132), ((this._loadInt((_33_ + 132))) & 2147483647))) | (((_30_ = this._loadInt((_33_ + 128))) | (0 - _30_)) >>> 31)) & 4294967295L) < (2146435073 & 4294967295L)) {
                    break label$1;
                }
                this._storeDouble((_33_ + 152), (this._loadDouble((_33_ + 136))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                label$3:
                do {
                    label$4:
                    do {
                        if ((this._loadInt((_33_ + 148))) == 0) {
                            break label$4;
                        }
                        if ((this._loadInt((_33_ + 148))) <= -1) {
                            break label$3;
                        }
                        this._storeInt((_33_ + 124), ((this._loadInt((_33_ + 148))) + -1));
                        break label$2;
                    }
                    while (false);
                    this._storeDouble((_33_ + 152), (j0((this._loadDouble((_33_ + 136))))));
                    break label$0;
                }
                while (false);
                this._storeInt((_33_ + 124), ((this._loadInt((_33_ + 148))) ^ -1));
                this._storeDouble((_33_ + 136), (-(this._loadDouble((_33_ + 136)))));
                this._storeInt((_33_ + 116), ((this._loadInt((_33_ + 116))) ^ 1));
            }
            while (false);
            label$5:
            do {
                label$6:
                do {
                    label$7:
                    do {
                        if ((this._loadInt((_33_ + 124))) == 0) {
                            break label$7;
                        }
                        this._storeInt((_33_ + 116), ((this._loadInt((_33_ + 116))) & (this._loadInt((_33_ + 148)))));
                        this._storeDouble((_33_ + 136), (Math.abs((this._loadDouble((_33_ + 136))))));
                        label$8:
                        do {
                            if (((this._loadInt((_33_ + 132))) | (this._loadInt((_33_ + 128)))) == 0) {
                                break label$8;
                            }
                            if ((this._loadInt((_33_ + 132))) != 2146435072) {
                                break label$6;
                            }
                        }
                        while (false);
                        this._storeLong((_33_ + 96), 0L);
                        break label$5;
                    }
                    while (false);
                    this._storeDouble((_33_ + 152), (j1((this._loadDouble((_33_ + 136))))));
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
                                            label$16:
                                            do {
                                                label$17:
                                                do {
                                                    label$18:
                                                    do {
                                                        if (((((_31_ = (double) (this._loadInt((_33_ + 124)))) >= (_34_ = this._loadDouble((_33_ + 136)))) ? 1 : 0) | (((_31_ != _31_) ? 1 : 0) | ((_34_ != _34_) ? 1 : 0))) != 0) {
                                                            break label$18;
                                                        }
                                                        if (((this._loadInt((_33_ + 132))) & 4294967295L) < (1389363200 & 4294967295L)) {
                                                            break label$17;
                                                        }
                                                        if ((_30_ = (this._loadInt((_33_ + 124))) & 3) == 2) {
                                                            break label$12;
                                                        }
                                                        if (_30_ == 1) {
                                                            break label$11;
                                                        }
                                                        if (_30_ != 0) {
                                                            break label$10;
                                                        }
                                                        _34_ = cos((_31_ = this._loadDouble((_33_ + 136))));
                                                        this._storeDouble((_33_ + 88), ((sin(_31_)) - _34_));
                                                        break label$9;
                                                    }
                                                    while (false);
                                                    if (((this._loadInt((_33_ + 132))) & 4294967295L) > (1041235967 & 4294967295L)) {
                                                        break label$16;
                                                    }
                                                    if ((this._loadInt((_33_ + 124))) < 33) {
                                                        break label$15;
                                                    }
                                                    this._storeLong((_33_ + 96), 0L);
                                                    break label$5;
                                                }
                                                while (false);
                                                this._storeDouble((_33_ + 104), (j0((this._loadDouble((_33_ + 136))))));
                                                this._storeDouble((_33_ + 96), (j1((this._loadDouble((_33_ + 136))))));
                                                this._storeInt((_33_ + 120), 0);
                                                label$19:
                                                while (true) {
                                                    if ((this._loadInt((_33_ + 120))) >= (this._loadInt((_33_ + 124)))) {
                                                        break label$5;
                                                    }
                                                    this._storeInt((_33_ + 120), ((this._loadInt((_33_ + 120))) + 1));
                                                    this._storeDouble((_33_ + 88), (this._loadDouble((_33_ + 96))));
                                                    this._storeDouble((_33_ + 96), (((this._loadDouble((_33_ + 96))) * (((_31_ = (double) (this._loadInt((_33_ + 120)))) + _31_) / (this._loadDouble((_33_ + 136))))) - (this._loadDouble((_33_ + 104)))));
                                                    this._storeDouble((_33_ + 104), (this._loadDouble((_33_ + 88))));
                                                    continue label$19;
                                                }
                                            }
                                            while (false);
                                            this._storeDouble((_33_ + 48), (((_31_ = this._storeDouble((_33_ + 16), (((double) (this._loadInt((_33_ + 124)))) + 1.0))) + _31_) / (this._loadDouble((_33_ + 136)))));
                                            this._storeDouble((_33_ + 32), ((this._storeDouble((_33_ + 40), (2.0 / (this._loadDouble((_33_ + 136)))))) + (this._loadDouble((_33_ + 48)))));
                                            this._storeDouble((_33_ + 64), (this._loadDouble((_33_ + 48))));
                                            this._storeDouble((_33_ + 56), (((this._loadDouble((_33_ + 48))) * (this._loadDouble((_33_ + 32)))) - 1.0));
                                            _30_ = this._storeInt((_33_ + 12), 1);
                                            label$22:
                                            do {
                                                label$21:
                                                while (true) {
                                                    if (((((_31_ = this._loadDouble((_33_ + 56))) >= 1.0E9) ? 1 : 0) | ((_31_ != _31_) ? 1 : 0)) != 0) {
                                                        break label$22;
                                                    }
                                                    this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + _30_));
                                                    this._storeDouble((_33_ + 24), (((this._storeDouble((_33_ + 32), ((this._loadDouble((_33_ + 32))) + (this._loadDouble((_33_ + 40)))))) * (this._loadDouble((_33_ + 56)))) - (this._loadDouble((_33_ + 64)))));
                                                    this._storeDouble((_33_ + 64), (this._loadDouble((_33_ + 56))));
                                                    this._storeDouble((_33_ + 56), (this._loadDouble((_33_ + 24))));
                                                    continue label$21;
                                                }
                                            }
                                            while (false);
                                            this._storeLong((_33_ + 72), 0L);
                                            this._storeInt((_33_ + 120), (this._loadInt((_33_ + 12))));
                                            label$24:
                                            do {
                                                label$23:
                                                while (true) {
                                                    if ((this._loadInt((_33_ + 120))) < 0) {
                                                        break label$24;
                                                    }
                                                    this._storeDouble((_33_ + 72), (1.0 / ((((_31_ = ((double) (this._loadInt((_33_ + 120)))) + (this._loadDouble((_33_ + 16)))) + _31_) / (this._loadDouble((_33_ + 136)))) - (this._loadDouble((_33_ + 72))))));
                                                    this._storeInt((_33_ + 120), ((this._loadInt((_33_ + 120))) + -1));
                                                    continue label$23;
                                                }
                                            }
                                            while (false);
                                            this._storeDouble((_33_ + 104), (this._loadDouble((_33_ + 72))));
                                            _32_ = this._storeLong((_33_ + 96), 4607182418800017408L);
                                            if (((((_31_ = this._storeDouble((_33_ + 24), ((this._loadDouble((_33_ + 16))) * (log((Math.abs((this._loadDouble((_33_ + 48)))))))))) >= 709.782712893384) ? 1 : 0) | ((_31_ != _31_) ? 1 : 0)) != 0) {
                                                break label$14;
                                            }
                                            this._storeInt((_33_ + 120), (this._loadInt((_33_ + 124))));
                                            label$25:
                                            while (true) {
                                                if ((this._loadInt((_33_ + 120))) < 1) {
                                                    break label$13;
                                                }
                                                this._storeDouble((_33_ + 88), (this._loadDouble((_33_ + 96))));
                                                this._storeDouble((_33_ + 96), ((((this._loadDouble((_33_ + 96))) * ((_31_ = (double) (this._loadInt((_33_ + 120)))) + _31_)) / (this._loadDouble((_33_ + 136)))) - (this._loadDouble((_33_ + 104)))));
                                                this._storeDouble((_33_ + 104), (this._loadDouble((_33_ + 88))));
                                                this._storeInt((_33_ + 120), ((this._loadInt((_33_ + 120))) + -1));
                                                continue label$25;
                                            }
                                        }
                                        while (false);
                                        this._storeDouble((_33_ + 96), (this._storeDouble((_33_ + 88), ((this._loadDouble((_33_ + 136))) * 0.5))));
                                        this._storeLong((_33_ + 104), 4607182418800017408L);
                                        this._storeInt((_33_ + 120), 2);
                                        label$28:
                                        do {
                                            label$27:
                                            while (true) {
                                                if ((this._loadInt((_33_ + 120))) > ((this._loadInt((_33_ + 124))) + 1)) {
                                                    break label$28;
                                                }
                                                this._storeDouble((_33_ + 104), ((this._loadDouble((_33_ + 104))) * ((double) (this._loadInt((_33_ + 120))))));
                                                this._storeDouble((_33_ + 96), ((this._loadDouble((_33_ + 96))) * (this._loadDouble((_33_ + 88)))));
                                                this._storeInt((_33_ + 120), ((this._loadInt((_33_ + 120))) + 1));
                                                continue label$27;
                                            }
                                        }
                                        while (false);
                                        this._storeDouble((_33_ + 96), ((this._loadDouble((_33_ + 96))) / (this._loadDouble((_33_ + 104)))));
                                        break label$5;
                                    }
                                    while (false);
                                    this._storeInt((_33_ + 120), (this._loadInt((_33_ + 124))));
                                    label$30:
                                    do {
                                        label$29:
                                        while (true) {
                                            if ((this._loadInt((_33_ + 120))) < 1) {
                                                break label$30;
                                            }
                                            this._storeDouble((_33_ + 88), (this._loadDouble((_33_ + 96))));
                                            this._storeDouble((_33_ + 96), ((((this._loadDouble((_33_ + 96))) * ((_31_ = (double) (this._loadInt((_33_ + 120)))) + _31_)) / (this._loadDouble((_33_ + 136)))) - (this._loadDouble((_33_ + 104)))));
                                            this._storeDouble((_33_ + 104), (this._loadDouble((_33_ + 88))));
                                            label$31:
                                            do {
                                                if (((((_31_ = this._loadDouble((_33_ + 96))) <= 3.273390607896142E150) ? 1 : 0) | ((_31_ != _31_) ? 1 : 0)) != 0) {
                                                    break label$31;
                                                }
                                                this._storeDouble((_33_ + 104), ((this._loadDouble((_33_ + 104))) / (this._loadDouble((_33_ + 96)))));
                                                this._storeDouble((_33_ + 72), ((this._loadDouble((_33_ + 72))) / (this._loadDouble((_33_ + 96)))));
                                                this._storeLong((_33_ + 96), _32_);
                                            }
                                            while (false);
                                            this._storeInt((_33_ + 120), ((this._loadInt((_33_ + 120))) + -1));
                                            continue label$29;
                                        }
                                    }
                                    while (false);
                                }
                                while (false);
                                this._storeDouble((_33_ + 32), (j0((this._loadDouble((_33_ + 136))))));
                                _34_ = this._storeDouble((_33_ + 48), (j1((this._loadDouble((_33_ + 136))))));
                                label$32:
                                do {
                                    if (((((_31_ = Math.abs((this._loadDouble((_33_ + 32))))) < (_34_ = Math.abs(_34_))) ? 1 : 0) | (((_31_ != _31_) ? 1 : 0) | ((_34_ != _34_) ? 1 : 0))) != 0) {
                                        break label$32;
                                    }
                                    this._storeDouble((_33_ + 96), (((this._loadDouble((_33_ + 72))) * (this._loadDouble((_33_ + 32)))) / (this._loadDouble((_33_ + 96)))));
                                    break label$5;
                                }
                                while (false);
                                this._storeDouble((_33_ + 96), (((this._loadDouble((_33_ + 72))) * (this._loadDouble((_33_ + 48)))) / (this._loadDouble((_33_ + 104)))));
                                break label$5;
                            }
                            while (false);
                            _34_ = sin((_31_ = this._loadDouble((_33_ + 136))));
                            this._storeDouble((_33_ + 88), ((cos(_31_)) - _34_));
                            break label$9;
                        }
                        while (false);
                        _34_ = sin((_31_ = this._loadDouble((_33_ + 136))));
                        this._storeDouble((_33_ + 88), ((-(cos(_31_))) - _34_));
                        break label$9;
                    }
                    while (false);
                    this._storeDouble((_33_ + 88), ((sin((_31_ = this._loadDouble((_33_ + 136))))) + (cos(_31_))));
                }
                while (false);
                this._storeDouble((_33_ + 96), (((this._loadDouble((_33_ + 88))) * 0.5641895835477563) / (Math.sqrt((this._loadDouble((_33_ + 136)))))));
            }
            while (false);
            label$33:
            do {
                label$34:
                do {
                    if ((this._loadInt((_33_ + 116))) == 0) {
                        break label$34;
                    }
                    _31_ = -(this._loadDouble((_33_ + 96)));
                    break label$33;
                }
                while (false);
                _31_ = this._loadDouble((_33_ + 96));
            }
            while (false);
            this._storeDouble((_33_ + 152), _31_);
        }
        while (false);
        _31_ = this._loadDouble((_33_ + 152));
        this._storeInt((0 + 4), (_33_ + 160));
        return _31_;
    }

    @Override()
    public final double yn(int _30_, double _31_)
    {
        int _32_ = 0;
        double _33_ = 0.0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 84), _30_);
        this._storeDouble((_32_ + 16), (this._storeDouble((_32_ + 72), _31_)));
        this._storeLong32((_32_ + 68), (this._loadLong32u((_32_ + 20))));
        this._storeLong32((_32_ + 64), (this._loadLong((_32_ + 16))));
        this._storeInt((_32_ + 52), ((this._loadInt((_32_ + 68))) >>> 31));
        label$0:
        do {
            label$1:
            do {
                if ((((this._storeInt((_32_ + 68), ((this._loadInt((_32_ + 68))) & 2147483647))) | (((_30_ = this._loadInt((_32_ + 64))) | (0 - _30_)) >>> 31)) & 4294967295L) < (2146435073 & 4294967295L)) {
                    break label$1;
                }
                this._storeDouble((_32_ + 88), (this._loadDouble((_32_ + 72))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt((_32_ + 52))) == 0) {
                    break label$2;
                }
                if (((this._loadInt((_32_ + 68))) | (this._loadInt((_32_ + 64)))) == 0) {
                    break label$2;
                }
                this._storeLong((_32_ + 88), 9221120237041090560L);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((_32_ + 68))) != 2146435072) {
                    break label$3;
                }
                this._storeLong((_32_ + 88), 0L);
                break label$0;
            }
            while (false);
            label$4:
            do {
                label$5:
                do {
                    label$6:
                    do {
                        if ((this._loadInt((_32_ + 84))) == 0) {
                            break label$6;
                        }
                        if ((this._loadInt((_32_ + 84))) <= -1) {
                            break label$5;
                        }
                        this._storeInt((_32_ + 56), ((this._loadInt((_32_ + 84))) + -1));
                        this._storeInt((_32_ + 52), 0);
                        break label$4;
                    }
                    while (false);
                    this._storeDouble((_32_ + 88), (y0((this._loadDouble((_32_ + 72))))));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 56), ((this._loadInt((_32_ + 84))) ^ -1));
                this._storeInt((_32_ + 52), ((this._loadInt((_32_ + 84))) & 1));
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
                                        label$14:
                                        do {
                                            if ((this._loadInt((_32_ + 56))) == 0) {
                                                break label$14;
                                            }
                                            if (((this._loadInt((_32_ + 68))) & 4294967295L) < (1389363200 & 4294967295L)) {
                                                break label$13;
                                            }
                                            if ((_30_ = (this._loadInt((_32_ + 56))) & 3) == 2) {
                                                break label$11;
                                            }
                                            if (_30_ == 1) {
                                                break label$10;
                                            }
                                            if (_30_ != 0) {
                                                break label$9;
                                            }
                                            _33_ = cos((_31_ = this._loadDouble((_32_ + 72))));
                                            this._storeDouble((_32_ + 24), ((-(sin(_31_))) - _33_));
                                            break label$8;
                                        }
                                        while (false);
                                        if ((this._loadInt((_32_ + 52))) == 0) {
                                            break label$12;
                                        }
                                        this._storeDouble((_32_ + 88), (-(y1((this._loadDouble((_32_ + 72)))))));
                                        break label$0;
                                    }
                                    while (false);
                                    this._storeDouble((_32_ + 40), (y0((this._loadDouble((_32_ + 72))))));
                                    this._storeDouble((_32_ + 8), (this._storeDouble((_32_ + 32), (y1((this._loadDouble((_32_ + 72))))))));
                                    this._storeLong32((_32_ + 60), (this._loadLong32u((_32_ + 12))));
                                    this._storeInt((_32_ + 48), 0);
                                    label$15:
                                    while (true) {
                                        _30_ = 0;
                                        label$17:
                                        do {
                                            if ((this._loadInt((_32_ + 48))) >= (this._loadInt((_32_ + 56)))) {
                                                break label$17;
                                            }
                                            _30_ = ((this._loadInt((_32_ + 60))) != -1048576) ? 1 : 0;
                                        }
                                        while (false);
                                        if (_30_ == 0) {
                                            break label$7;
                                        }
                                        this._storeInt((_32_ + 48), ((this._loadInt((_32_ + 48))) + 1));
                                        this._storeDouble((_32_ + 24), (this._loadDouble((_32_ + 32))));
                                        this._storeDouble(_32_, (this._storeDouble((_32_ + 32), (((((_31_ = (double) (this._loadInt((_32_ + 48)))) + _31_) / (this._loadDouble((_32_ + 72)))) * (this._loadDouble((_32_ + 32)))) - (this._loadDouble((_32_ + 40)))))));
                                        this._storeLong32((_32_ + 60), (this._loadLong32u((_32_ + 4))));
                                        this._storeDouble((_32_ + 40), (this._loadDouble((_32_ + 24))));
                                        continue label$15;
                                    }
                                }
                                while (false);
                                this._storeDouble((_32_ + 88), (y1((this._loadDouble((_32_ + 72))))));
                                break label$0;
                            }
                            while (false);
                            this._storeDouble((_32_ + 24), ((cos((_31_ = this._loadDouble((_32_ + 72))))) + (sin(_31_))));
                            break label$8;
                        }
                        while (false);
                        _33_ = sin((_31_ = this._loadDouble((_32_ + 72))));
                        this._storeDouble((_32_ + 24), ((cos(_31_)) - _33_));
                        break label$8;
                    }
                    while (false);
                    _33_ = cos((_31_ = this._loadDouble((_32_ + 72))));
                    this._storeDouble((_32_ + 24), ((sin(_31_)) - _33_));
                }
                while (false);
                this._storeDouble((_32_ + 32), (((this._loadDouble((_32_ + 24))) * 0.5641895835477563) / (Math.sqrt((this._loadDouble((_32_ + 72)))))));
            }
            while (false);
            label$18:
            do {
                label$19:
                do {
                    if ((this._loadInt((_32_ + 52))) == 0) {
                        break label$19;
                    }
                    _31_ = -(this._loadDouble((_32_ + 32)));
                    break label$18;
                }
                while (false);
                _31_ = this._loadDouble((_32_ + 32));
            }
            while (false);
            this._storeDouble((_32_ + 88), _31_);
        }
        while (false);
        _31_ = this._loadDouble((_32_ + 88));
        this._storeInt((0 + 4), (_32_ + 96));
        return _31_;
    }

    @Override()
    public final float jnf(int _30_, float _31_)
    {
        int _32_ = 0;
        float _33_ = 0.0f;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 88), _30_);
        this._storeFloat((_32_ + 48), (this._storeFloat((_32_ + 84), _31_)));
        this._storeInt((_32_ + 72), ((this._storeInt((_32_ + 80), (this._loadInt((_32_ + 48))))) >>> 31));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_32_ + 80), ((this._loadInt((_32_ + 80))) & 2147483647))) & 4294967295L) < (2139095041 & 4294967295L)) {
                    break label$1;
                }
                this._storeFloat((_32_ + 92), (this._loadFloat((_32_ + 84))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                label$3:
                do {
                    label$4:
                    do {
                        if ((this._loadInt((_32_ + 88))) == 0) {
                            break label$4;
                        }
                        if ((this._loadInt((_32_ + 88))) <= -1) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 76), ((this._loadInt((_32_ + 88))) + -1));
                        break label$2;
                    }
                    while (false);
                    this._storeFloat((_32_ + 92), (j0f((this._loadFloat((_32_ + 84))))));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 76), ((this._loadInt((_32_ + 88))) ^ -1));
                this._storeFloat((_32_ + 84), (-(this._loadFloat((_32_ + 84)))));
                this._storeInt((_32_ + 72), ((this._loadInt((_32_ + 72))) ^ 1));
            }
            while (false);
            label$5:
            do {
                label$6:
                do {
                    label$7:
                    do {
                        if ((this._loadInt((_32_ + 76))) == 0) {
                            break label$7;
                        }
                        this._storeInt((_32_ + 72), ((this._loadInt((_32_ + 72))) & (this._loadInt((_32_ + 88)))));
                        this._storeFloat((_32_ + 84), (Math.abs((this._loadFloat((_32_ + 84))))));
                        label$8:
                        do {
                            if ((this._loadInt((_32_ + 80))) == 0) {
                                break label$8;
                            }
                            if ((this._loadInt((_32_ + 80))) != 2139095040) {
                                break label$6;
                            }
                        }
                        while (false);
                        this._storeInt((_32_ + 60), 0);
                        break label$5;
                    }
                    while (false);
                    this._storeFloat((_32_ + 92), (j1f((this._loadFloat((_32_ + 84))))));
                    break label$0;
                }
                while (false);
                label$9:
                do {
                    if (((((_31_ = (float) (this._loadInt((_32_ + 76)))) >= (_33_ = this._loadFloat((_32_ + 84)))) ? 1 : 0) | (((_31_ != _31_) ? 1 : 0) | ((_33_ != _33_) ? 1 : 0))) != 0) {
                        break label$9;
                    }
                    this._storeFloat((_32_ + 64), (j0f((this._loadFloat((_32_ + 84))))));
                    this._storeFloat((_32_ + 60), (j1f((this._loadFloat((_32_ + 84))))));
                    this._storeInt((_32_ + 68), 0);
                    label$10:
                    while (true) {
                        if ((this._loadInt((_32_ + 68))) >= (this._loadInt((_32_ + 76)))) {
                            break label$5;
                        }
                        this._storeInt((_32_ + 68), ((this._loadInt((_32_ + 68))) + 1));
                        this._storeFloat((_32_ + 56), (this._loadFloat((_32_ + 60))));
                        this._storeFloat((_32_ + 60), (((this._loadFloat((_32_ + 60))) * (((_31_ = (float) (this._loadInt((_32_ + 68)))) + _31_) / (this._loadFloat((_32_ + 84))))) - (this._loadFloat((_32_ + 64)))));
                        this._storeFloat((_32_ + 64), (this._loadFloat((_32_ + 56))));
                        continue label$10;
                    }
                }
                while (false);
                label$12:
                do {
                    if (((this._loadInt((_32_ + 80))) & 4294967295L) > (897581055 & 4294967295L)) {
                        break label$12;
                    }
                    label$13:
                    do {
                        if ((this._loadInt((_32_ + 76))) < 9) {
                            break label$13;
                        }
                        this._storeInt((_32_ + 76), 8);
                    }
                    while (false);
                    this._storeFloat((_32_ + 60), (this._storeFloat((_32_ + 56), ((this._loadFloat((_32_ + 84))) * 0.5f))));
                    this._storeInt((_32_ + 64), 1065353216);
                    this._storeInt((_32_ + 68), 2);
                    label$15:
                    do {
                        label$14:
                        while (true) {
                            if ((this._loadInt((_32_ + 68))) > ((this._loadInt((_32_ + 76))) + 1)) {
                                break label$15;
                            }
                            this._storeFloat((_32_ + 64), ((this._loadFloat((_32_ + 64))) * ((float) (this._loadInt((_32_ + 68))))));
                            this._storeFloat((_32_ + 60), ((this._loadFloat((_32_ + 60))) * (this._loadFloat((_32_ + 56)))));
                            this._storeInt((_32_ + 68), ((this._loadInt((_32_ + 68))) + 1));
                            continue label$14;
                        }
                    }
                    while (false);
                    this._storeFloat((_32_ + 60), ((this._loadFloat((_32_ + 60))) / (this._loadFloat((_32_ + 64)))));
                    break label$5;
                }
                while (false);
                this._storeFloat((_32_ + 32), (((_31_ = this._storeFloat((_32_ + 16), (((float) (this._loadInt((_32_ + 76)))) + 1.0f))) + _31_) / (this._loadFloat((_32_ + 84)))));
                this._storeFloat((_32_ + 24), ((this._storeFloat((_32_ + 28), (2.0f / (this._loadFloat((_32_ + 84)))))) + (this._loadFloat((_32_ + 32)))));
                this._storeFloat((_32_ + 40), (this._loadFloat((_32_ + 32))));
                this._storeFloat((_32_ + 36), (((this._loadFloat((_32_ + 32))) * (this._loadFloat((_32_ + 24)))) - 1.0f));
                _30_ = this._storeInt((_32_ + 12), 1);
                label$17:
                do {
                    label$16:
                    while (true) {
                        if (((((_31_ = this._loadFloat((_32_ + 36))) >= 10000.0f) ? 1 : 0) | ((_31_ != _31_) ? 1 : 0)) != 0) {
                            break label$17;
                        }
                        this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + _30_));
                        this._storeFloat((_32_ + 20), (((this._storeFloat((_32_ + 24), ((this._loadFloat((_32_ + 24))) + (this._loadFloat((_32_ + 28)))))) * (this._loadFloat((_32_ + 36)))) - (this._loadFloat((_32_ + 40)))));
                        this._storeFloat((_32_ + 40), (this._loadFloat((_32_ + 36))));
                        this._storeFloat((_32_ + 36), (this._loadFloat((_32_ + 20))));
                        continue label$16;
                    }
                }
                while (false);
                _30_ = this._storeInt((_32_ + 44), 0);
                this._storeInt((_32_ + 68), (this._loadInt((_32_ + 12))));
                label$19:
                do {
                    label$18:
                    while (true) {
                        if ((this._loadInt((_32_ + 68))) < _30_) {
                            break label$19;
                        }
                        this._storeFloat((_32_ + 44), (1.0f / ((((_31_ = ((float) (this._loadInt((_32_ + 68)))) + (this._loadFloat((_32_ + 16)))) + _31_) / (this._loadFloat((_32_ + 84)))) - (this._loadFloat((_32_ + 44))))));
                        this._storeInt((_32_ + 68), ((this._loadInt((_32_ + 68))) + -1));
                        continue label$18;
                    }
                }
                while (false);
                this._storeFloat((_32_ + 64), (this._loadFloat((_32_ + 44))));
                _30_ = this._storeInt((_32_ + 60), 1065353216);
                label$20:
                do {
                    label$21:
                    do {
                        if (((((_31_ = this._storeFloat((_32_ + 20), ((this._loadFloat((_32_ + 16))) * (logf((Math.abs((this._loadFloat((_32_ + 32)))))))))) >= 88.72168f) ? 1 : 0) | ((_31_ != _31_) ? 1 : 0)) != 0) {
                            break label$21;
                        }
                        this._storeInt((_32_ + 68), (this._loadInt((_32_ + 76))));
                        label$22:
                        while (true) {
                            if ((this._loadInt((_32_ + 68))) < 1) {
                                break label$20;
                            }
                            this._storeFloat((_32_ + 56), (this._loadFloat((_32_ + 60))));
                            this._storeFloat((_32_ + 60), (((((_31_ = (float) (this._loadInt((_32_ + 68)))) + _31_) * (this._loadFloat((_32_ + 60)))) / (this._loadFloat((_32_ + 84)))) - (this._loadFloat((_32_ + 64)))));
                            this._storeFloat((_32_ + 64), (this._loadFloat((_32_ + 56))));
                            this._storeInt((_32_ + 68), ((this._loadInt((_32_ + 68))) + -1));
                            continue label$22;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 68), (this._loadInt((_32_ + 76))));
                    label$25:
                    do {
                        label$24:
                        while (true) {
                            if ((this._loadInt((_32_ + 68))) < 1) {
                                break label$25;
                            }
                            this._storeFloat((_32_ + 56), (this._loadFloat((_32_ + 60))));
                            this._storeFloat((_32_ + 60), (((((_31_ = (float) (this._loadInt((_32_ + 68)))) + _31_) * (this._loadFloat((_32_ + 60)))) / (this._loadFloat((_32_ + 84)))) - (this._loadFloat((_32_ + 64)))));
                            this._storeFloat((_32_ + 64), (this._loadFloat((_32_ + 56))));
                            label$26:
                            do {
                                if (((((_31_ = this._loadFloat((_32_ + 60))) <= 1.1529215E18f) ? 1 : 0) | ((_31_ != _31_) ? 1 : 0)) != 0) {
                                    break label$26;
                                }
                                this._storeFloat((_32_ + 64), ((this._loadFloat((_32_ + 64))) / (this._loadFloat((_32_ + 60)))));
                                this._storeFloat((_32_ + 44), ((this._loadFloat((_32_ + 44))) / (this._loadFloat((_32_ + 60)))));
                                this._storeInt((_32_ + 60), _30_);
                            }
                            while (false);
                            this._storeInt((_32_ + 68), ((this._loadInt((_32_ + 68))) + -1));
                            continue label$24;
                        }
                    }
                    while (false);
                }
                while (false);
                this._storeFloat((_32_ + 24), (j0f((this._loadFloat((_32_ + 84))))));
                _33_ = this._storeFloat((_32_ + 32), (j1f((this._loadFloat((_32_ + 84))))));
                label$27:
                do {
                    if (((((_31_ = Math.abs((this._loadFloat((_32_ + 24))))) < (_33_ = Math.abs(_33_))) ? 1 : 0) | (((_31_ != _31_) ? 1 : 0) | ((_33_ != _33_) ? 1 : 0))) != 0) {
                        break label$27;
                    }
                    this._storeFloat((_32_ + 60), (((this._loadFloat((_32_ + 44))) * (this._loadFloat((_32_ + 24)))) / (this._loadFloat((_32_ + 60)))));
                    break label$5;
                }
                while (false);
                this._storeFloat((_32_ + 60), (((this._loadFloat((_32_ + 44))) * (this._loadFloat((_32_ + 32)))) / (this._loadFloat((_32_ + 64)))));
            }
            while (false);
            label$28:
            do {
                label$29:
                do {
                    if ((this._loadInt((_32_ + 72))) == 0) {
                        break label$29;
                    }
                    _31_ = -(this._loadFloat((_32_ + 60)));
                    break label$28;
                }
                while (false);
                _31_ = this._loadFloat((_32_ + 60));
            }
            while (false);
            this._storeFloat((_32_ + 92), _31_);
        }
        while (false);
        _31_ = this._loadFloat((_32_ + 92));
        this._storeInt((0 + 4), (_32_ + 96));
        return _31_;
    }

    @Override()
    public final float ynf(int _30_, float _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeFloat((_32_ + 52), _31_);
        this._storeFloat((_32_ + 16), (this._loadFloat((_32_ + 52))));
        this._storeInt((_32_ + 48), (this._loadInt((_32_ + 16))));
        this._storeInt((_32_ + 36), ((this._loadInt((_32_ + 48))) >>> 31));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_32_ + 48), ((this._loadInt((_32_ + 48))) & 2147483647))) & 4294967295L) < (2139095041 & 4294967295L)) {
                    break label$1;
                }
                this._storeFloat((_32_ + 60), (this._loadFloat((_32_ + 52))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt((_32_ + 36))) == 0) {
                    break label$2;
                }
                if ((this._loadInt((_32_ + 48))) == 0) {
                    break label$2;
                }
                this._storeInt((_32_ + 60), 2143289344);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((_32_ + 48))) != 2139095040) {
                    break label$3;
                }
                this._storeInt((_32_ + 60), 0);
                break label$0;
            }
            while (false);
            label$4:
            do {
                label$5:
                do {
                    label$6:
                    do {
                        if ((this._loadInt((_32_ + 56))) == 0) {
                            break label$6;
                        }
                        if ((this._loadInt((_32_ + 56))) <= -1) {
                            break label$5;
                        }
                        this._storeInt((_32_ + 40), ((this._loadInt((_32_ + 56))) + -1));
                        this._storeInt((_32_ + 36), 0);
                        break label$4;
                    }
                    while (false);
                    this._storeFloat((_32_ + 60), (y0f((this._loadFloat((_32_ + 52))))));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 40), ((this._loadInt((_32_ + 56))) ^ -1));
                this._storeInt((_32_ + 36), ((this._loadInt((_32_ + 56))) & 1));
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
                            if ((this._loadInt((_32_ + 40))) == 0) {
                                break label$10;
                            }
                            this._storeFloat((_32_ + 28), (y0f((this._loadFloat((_32_ + 52))))));
                            this._storeFloat((_32_ + 24), (y1f((this._loadFloat((_32_ + 52))))));
                            this._storeFloat((_32_ + 8), (this._loadFloat((_32_ + 24))));
                            this._storeInt((_32_ + 44), (this._loadInt((_32_ + 8))));
                            this._storeInt((_32_ + 32), 0);
                            label$12:
                            do {
                                label$11:
                                while (true) {
                                    _30_ = 0;
                                    label$13:
                                    do {
                                        if ((this._loadInt((_32_ + 32))) >= (this._loadInt((_32_ + 40)))) {
                                            break label$13;
                                        }
                                        _30_ = ((this._loadInt((_32_ + 44))) != -8388608) ? 1 : 0;
                                    }
                                    while (false);
                                    if (_30_ == 0) {
                                        break label$12;
                                    }
                                    this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) + 1));
                                    this._storeFloat((_32_ + 20), (this._loadFloat((_32_ + 24))));
                                    this._storeFloat((_32_ + 24), (((((_31_ = (float) (this._loadInt((_32_ + 32)))) + _31_) / (this._loadFloat((_32_ + 52)))) * (this._loadFloat((_32_ + 24)))) - (this._loadFloat((_32_ + 28)))));
                                    this._storeFloat(_32_, (this._loadFloat((_32_ + 24))));
                                    this._storeInt((_32_ + 44), (this._loadInt(_32_)));
                                    this._storeFloat((_32_ + 28), (this._loadFloat((_32_ + 20))));
                                    continue label$11;
                                }
                            }
                            while (false);
                            if ((this._loadInt((_32_ + 36))) == 0) {
                                break label$9;
                            }
                            _31_ = -(this._loadFloat((_32_ + 24)));
                            break label$8;
                        }
                        while (false);
                        if ((this._loadInt((_32_ + 36))) == 0) {
                            break label$7;
                        }
                        this._storeFloat((_32_ + 60), (-(y1f((this._loadFloat((_32_ + 52)))))));
                        break label$0;
                    }
                    while (false);
                    _31_ = this._loadFloat((_32_ + 24));
                }
                while (false);
                this._storeFloat((_32_ + 60), _31_);
                break label$0;
            }
            while (false);
            this._storeFloat((_32_ + 60), (y1f((this._loadFloat((_32_ + 52))))));
        }
        while (false);
        _31_ = this._loadFloat((_32_ + 60));
        this._storeInt((0 + 4), (_32_ + 64));
        return _31_;
    }

    @Override()
    public final int labs(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) < 1) {
                break label$0;
            }
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        return (0 - (this._loadInt((_31_ + 12))));
    }

    @Override()
    public final int lchown(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = __syscall_ret((this.__syscall3.invoke(16, (this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_)));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final void lcong48(int _30_)
    {
        int _31_ = 0;
        memcpy(4220, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 14);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final double ldexp(double _30_, int _31_)
    {
        int _32_ = 0;
        this._storeDouble(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        _30_ = scalbn((this._loadDouble((_32_ + 8))), _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _30_;
    }

    @Override()
    public final float ldexpf(float _30_, int _31_)
    {
        int _32_ = 0;
        this._storeFloat(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _30_ = scalbnf((this._loadFloat((_32_ + 12))), _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _30_;
    }

    @Override()
    public final void ldexpl(int _30_, long _31_, long _32_, int _33_)
    {
        int _34_ = 0;
        this._storeLong(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), _31_);
        this._storeLong((_34_ + 40), _32_);
        this._storeInt((_34_ + 28), _33_);
        scalbnl(_34_, (this._loadLong((_34_ + 32))), _32_, _33_);
        _32_ = this._loadLong(_34_);
        this._storeLong((_30_ + 8), (this._loadLong((_34_ + 8))));
        this._storeLong(_30_, _32_);
        this._storeInt((0 + 4), (_34_ + 48));
        return;
    }

    @Override()
    public final void ldiv(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _31_);
        this._storeInt((_33_ + 8), _32_);
        this._storeInt(_30_, ((_33_ = this._loadInt((_33_ + 12))) / _32_));
        this._storeInt((_30_ + 4), (_33_ % _32_));
        return;
    }

    @Override()
    public final double lgamma(double _30_)
    {
        int _31_ = 0;
        _30_ = __lgamma_r((this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)), 14764);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final double __lgamma_r(double _30_, int _31_)
    {
        int _32_ = 0;
        this._storeDouble(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 144))) + 128), _30_);
        this._storeInt((_32_ + 124), _31_);
        this._storeDouble((_32_ + 112), (this._loadDouble((_32_ + 128))));
        this._storeInt((this._loadInt((_32_ + 124))), 1);
        this._storeLong32((_32_ + 16), ((this._loadLong((_32_ + 112))) >>> 63L));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_32_ + 20), ((int) ((this._loadLong32u((_32_ + 116))) & 2147483647L)))) & 4294967295L) < (2146435072 & 4294967295L)) {
                    break label$1;
                }
                this._storeDouble((_32_ + 136), ((_30_ = this._loadDouble((_32_ + 128))) * _30_));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_32_ + 20))) & 4294967295L) > (999292927 & 4294967295L)) {
                    break label$2;
                }
                label$3:
                do {
                    if ((this._loadInt((_32_ + 16))) == 0) {
                        break label$3;
                    }
                    this._storeDouble((_32_ + 128), (-(this._loadDouble((_32_ + 128)))));
                    this._storeInt((this._loadInt((_32_ + 124))), -1);
                }
                while (false);
                this._storeDouble((_32_ + 136), (-(log((this._loadDouble((_32_ + 128)))))));
                break label$0;
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt((_32_ + 16))) == 0) {
                    break label$4;
                }
                label$5:
                do {
                    if ((this._storeDouble((_32_ + 104), (sin_pi((this._storeDouble((_32_ + 128), (-(this._loadDouble((_32_ + 128)))))))))) != 0.0) {
                        break label$5;
                    }
                    this._storeDouble((_32_ + 136), (1.0 / ((_30_ = this._loadDouble((_32_ + 128))) - _30_)));
                    break label$0;
                }
                while (false);
                label$6:
                do {
                    label$7:
                    do {
                        if (((((_30_ = this._loadDouble((_32_ + 104))) <= 0.0) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                            break label$7;
                        }
                        this._storeInt((this._loadInt((_32_ + 124))), -1);
                        break label$6;
                    }
                    while (false);
                    this._storeDouble((_32_ + 104), (-(this._loadDouble((_32_ + 104)))));
                }
                while (false);
                this._storeDouble((_32_ + 80), (log((3.141592653589793 / ((this._loadDouble((_32_ + 104))) * (this._loadDouble((_32_ + 128))))))));
            }
            while (false);
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
                                                            if ((this._loadInt((_32_ + 20))) == 1072693248) {
                                                                break label$19;
                                                            }
                                                            if ((this._loadInt((_32_ + 20))) != 1073741824) {
                                                                break label$18;
                                                            }
                                                        }
                                                        while (false);
                                                        if ((this._loadInt((_32_ + 112))) == 0) {
                                                            break label$17;
                                                        }
                                                    }
                                                    while (false);
                                                    label$20:
                                                    do {
                                                        if (((this._loadInt((_32_ + 20))) & 4294967295L) > (1073741823 & 4294967295L)) {
                                                            break label$20;
                                                        }
                                                        if (((this._loadInt((_32_ + 20))) & 4294967295L) > (1072483532 & 4294967295L)) {
                                                            break label$16;
                                                        }
                                                        this._storeDouble((_32_ + 32), (-(log((this._loadDouble((_32_ + 128)))))));
                                                        if (((this._loadInt((_32_ + 20))) & 4294967295L) < (1072130372 & 4294967295L)) {
                                                            break label$14;
                                                        }
                                                        this._storeDouble((_32_ + 96), (1.0 - (this._loadDouble((_32_ + 128)))));
                                                        this._storeInt((_32_ + 12), 0);
                                                        break label$9;
                                                    }
                                                    while (false);
                                                    if (((this._loadInt((_32_ + 20))) & 4294967295L) > (1075838975 & 4294967295L)) {
                                                        break label$15;
                                                    }
                                                    _31_ = this._storeInt((_32_ + 12), (_truncateDoubleToSignedInteger((this._loadDouble((_32_ + 128))))));
                                                    this._storeDouble((_32_ + 72), ((_30_ = this._storeDouble((_32_ + 96), ((this._loadDouble((_32_ + 128))) - ((double) _31_)))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 3.194753265841009E-5) + 0.0018402845140733772)) + 0.02664227030336386)) + 0.14635047265246445)) + 0.325778796408931)) + 0.21498241596060885)) + -0.07721566490153287)));
                                                    _30_ = this._storeDouble((_32_ + 40), (((_30_ = this._loadDouble((_32_ + 96))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 7.326684307446256E-6) + 7.779424963818936E-4)) + 0.01864591917156529)) + 0.17193386563280308)) + 0.7219355475671381)) + 1.3920053346762105)) + 1.0));
                                                    this._storeDouble((_32_ + 32), (((this._loadDouble((_32_ + 96))) * 0.5) + ((this._loadDouble((_32_ + 72))) / _30_)));
                                                    this._storeLong((_32_ + 88), 4607182418800017408L);
                                                    if (((_31_ = (this._loadInt((_32_ + 12))) + -3) & 4294967295L) > (4 & 4294967295L)) {
                                                        break label$8;
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
                                                                        switch (_31_) {
                                                                            case 0: {
                                                                                break label$21;
                                                                            }
                                                                            case 1: {
                                                                                break label$22;
                                                                            }
                                                                            case 2: {
                                                                                break label$23;
                                                                            }
                                                                            case 3: {
                                                                                break label$24;
                                                                            }
                                                                            case 4: {
                                                                                break label$25;
                                                                            }
                                                                            default: {
                                                                                break label$21;
                                                                            }
                                                                        }
                                                                    }
                                                                    while (false);
                                                                    this._storeDouble((_32_ + 88), ((this._loadDouble((_32_ + 88))) * ((this._loadDouble((_32_ + 96))) + 6.0)));
                                                                }
                                                                while (false);
                                                                this._storeDouble((_32_ + 88), ((this._loadDouble((_32_ + 88))) * ((this._loadDouble((_32_ + 96))) + 5.0)));
                                                            }
                                                            while (false);
                                                            this._storeDouble((_32_ + 88), ((this._loadDouble((_32_ + 88))) * ((this._loadDouble((_32_ + 96))) + 4.0)));
                                                        }
                                                        while (false);
                                                        this._storeDouble((_32_ + 88), ((this._loadDouble((_32_ + 88))) * ((this._loadDouble((_32_ + 96))) + 3.0)));
                                                    }
                                                    while (false);
                                                    _30_ = this._storeDouble((_32_ + 88), ((this._loadDouble((_32_ + 88))) * ((this._loadDouble((_32_ + 96))) + 2.0)));
                                                    this._storeDouble((_32_ + 32), ((this._loadDouble((_32_ + 32))) + (log(_30_))));
                                                    break label$8;
                                                }
                                                while (false);
                                                this._storeLong((_32_ + 32), 0L);
                                                break label$8;
                                            }
                                            while (false);
                                            this._storeLong((_32_ + 32), 0L);
                                            if (((this._loadInt((_32_ + 20))) & 4294967295L) < (1073460419 & 4294967295L)) {
                                                break label$13;
                                            }
                                            this._storeDouble((_32_ + 96), (2.0 - (this._loadDouble((_32_ + 128)))));
                                            this._storeInt((_32_ + 12), 0);
                                            break label$9;
                                        }
                                        while (false);
                                        if (((this._loadInt((_32_ + 20))) & 4294967295L) > (1133510655 & 4294967295L)) {
                                            break label$12;
                                        }
                                        this._storeDouble((_32_ + 104), (log((this._loadDouble((_32_ + 128))))));
                                        _30_ = this._storeDouble((_32_ + 96), ((_30_ = this._storeDouble((_32_ + 88), (1.0 / (this._loadDouble((_32_ + 128)))))) * _30_));
                                        this._storeDouble((_32_ + 32), ((this._storeDouble((_32_ + 24), (((this._loadDouble((_32_ + 88))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * -0.0016309293409657527) + 8.363399189962821E-4)) + -5.9518755745034E-4)) + 7.936505586430196E-4)) + -0.0027777777772877554)) + 0.08333333333333297)) + 0.4189385332046727))) + (((this._loadDouble((_32_ + 128))) + -0.5) * ((this._loadDouble((_32_ + 104))) - 1.0))));
                                        break label$8;
                                    }
                                    while (false);
                                    if (((this._loadInt((_32_ + 20))) & 4294967295L) < (1070442081 & 4294967295L)) {
                                        break label$11;
                                    }
                                    this._storeDouble((_32_ + 96), ((this._loadDouble((_32_ + 128))) + -0.46163214496836225));
                                    this._storeInt((_32_ + 12), 1);
                                    break label$9;
                                }
                                while (false);
                                if (((this._loadInt((_32_ + 20))) & 4294967295L) < (1072936132 & 4294967295L)) {
                                    break label$10;
                                }
                                this._storeDouble((_32_ + 96), ((this._loadDouble((_32_ + 128))) + -1.4616321449683622));
                                this._storeInt((_32_ + 12), 1);
                                break label$9;
                            }
                            while (false);
                            this._storeDouble((_32_ + 32), ((_30_ = this._loadDouble((_32_ + 128))) * ((log(_30_)) + -1.0)));
                            break label$8;
                        }
                        while (false);
                        this._storeDouble((_32_ + 96), (this._loadDouble((_32_ + 128))));
                        this._storeInt((_32_ + 12), 2);
                        break label$9;
                    }
                    while (false);
                    this._storeDouble((_32_ + 96), ((this._loadDouble((_32_ + 128))) + -1.0));
                    this._storeInt((_32_ + 12), 2);
                }
                while (false);
                label$26:
                do {
                    label$27:
                    do {
                        if ((_31_ = this._loadInt((_32_ + 12))) == 2) {
                            break label$27;
                        }
                        if (_31_ == 1) {
                            break label$26;
                        }
                        if (_31_ != 0) {
                            break label$8;
                        }
                        this._storeDouble((_32_ + 64), (((_30_ = this._storeDouble((_32_ + 88), ((_30_ = this._loadDouble((_32_ + 96))) * _30_))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 2.5214456545125733E-5) + 2.2086279071390839E-4)) + 0.0011927076318336207)) + 0.007385550860814029)) + 0.06735230105312927)) + 0.07721566490153287));
                        _30_ = this._storeDouble((_32_ + 72), ((this._storeDouble((_32_ + 56), ((_30_ = this._loadDouble((_32_ + 88))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 4.4864094961891516E-5) + 1.0801156724758394E-4)) + 5.100697921535113E-4)) + 0.0028905138367341563)) + 0.020580808432516733)) + 0.3224670334241136)))) + ((this._loadDouble((_32_ + 96))) * (this._loadDouble((_32_ + 64))))));
                        this._storeDouble((_32_ + 32), ((this._loadDouble((_32_ + 32))) + (_30_ + ((this._loadDouble((_32_ + 96))) * -0.5))));
                        break label$8;
                    }
                    while (false);
                    this._storeDouble((_32_ + 64), ((_30_ = this._loadDouble((_32_ + 96))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 0.013381091853678766) + 0.22896372806469245)) + 0.9777175279633727)) + 1.4549225013723477)) + 0.6328270640250934)) + -0.07721566490153287)));
                    _30_ = this._storeDouble((_32_ + 56), (((_30_ = this._loadDouble((_32_ + 96))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 0.003217092422824239) + 0.10422264559336913)) + 0.7692851504566728)) + 2.128489763798934)) + 2.4559779371304113)) + 1.0));
                    this._storeDouble((_32_ + 32), ((this._loadDouble((_32_ + 32))) + (((this._loadDouble((_32_ + 96))) * -0.5) + ((this._loadDouble((_32_ + 64))) / _30_))));
                    break label$8;
                }
                while (false);
                this._storeDouble((_32_ + 64), (((_30_ = this._storeDouble((_32_ + 24), ((this._storeDouble((_32_ + 88), ((_30_ = this._loadDouble((_32_ + 96))) * _30_))) * (this._loadDouble((_32_ + 96)))))) * ((_30_ * ((_30_ * ((_30_ * 3.1563207090362595E-4) + -0.0014034646998923284)) + 0.006100538702462913)) + -0.032788541075985965)) + 0.48383612272381005));
                this._storeDouble((_32_ + 56), (((_30_ = this._loadDouble((_32_ + 24))) * ((_30_ * ((_30_ * ((_30_ * -3.1275416837512086E-4) + 8.81081882437654E-4)) + -0.0036845201678113826)) + 0.01797067508118204)) + -0.1475877229945939));
                _30_ = this._storeDouble((_32_ + 48), (((_30_ = this._loadDouble((_32_ + 24))) * ((_30_ * ((_30_ * ((_30_ * 3.355291926355191E-4) + -5.385953053567405E-4)) + 0.0022596478090061247)) + -0.010314224129834144)) + 0.06462494023913339));
                _30_ = this._storeDouble((_32_ + 72), (((this._loadDouble((_32_ + 88))) * (this._loadDouble((_32_ + 64)))) - (-3.638676997039505E-18 - ((this._loadDouble((_32_ + 24))) * ((this._loadDouble((_32_ + 56))) + (_30_ * (this._loadDouble((_32_ + 96)))))))));
                this._storeDouble((_32_ + 32), ((this._loadDouble((_32_ + 32))) + (_30_ + -0.12148629053584961)));
            }
            while (false);
            label$28:
            do {
                if ((this._loadInt((_32_ + 16))) == 0) {
                    break label$28;
                }
                this._storeDouble((_32_ + 32), ((this._loadDouble((_32_ + 80))) - (this._loadDouble((_32_ + 32)))));
            }
            while (false);
            this._storeDouble((_32_ + 136), (this._loadDouble((_32_ + 32))));
        }
        while (false);
        _30_ = this._loadDouble((_32_ + 136));
        this._storeInt((0 + 4), (_32_ + 144));
        return _30_;
    }

    @Override()
    public final double sin_pi(double _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _32_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 12), (((this._storeInt((_31_ + 12), (_truncateDoubleToSignedInteger(((this._storeDouble((_31_ + 16), ((_30_ = (_30_ = (this._storeDouble((_31_ + 16), _30_)) * 0.5) - (Math.floor(_30_))) + _30_))) * 4.0))))) + 1) / 2));
        this._storeDouble((_31_ + 16), ((this._storeDouble((_31_ + 16), ((this._loadDouble((_31_ + 16))) + ((double) (((float) _32_) * -0.5f))))) * 3.141592653589793));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((_32_ = this._loadInt((_31_ + 12))) == 1) {
                            break label$3;
                        }
                        if (_32_ == 2) {
                            break label$2;
                        }
                        if (_32_ != 3) {
                            break label$1;
                        }
                        this._storeDouble((_31_ + 24), (-(__cos((this._loadDouble((_31_ + 16))), 0.0))));
                        break label$0;
                    }
                    while (false);
                    this._storeDouble((_31_ + 24), (__cos((this._loadDouble((_31_ + 16))), 0.0)));
                    break label$0;
                }
                while (false);
                this._storeDouble((_31_ + 24), (__sin((-(this._loadDouble((_31_ + 16)))), 0.0, 0)));
                break label$0;
            }
            while (false);
            this._storeDouble((_31_ + 24), (__sin((this._loadDouble((_31_ + 16))), 0.0, 0)));
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 24));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final float lgammaf(float _30_)
    {
        int _31_ = 0;
        _30_ = __lgammaf_r((this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 14764);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final float __lgammaf_r(float _30_, int _31_)
    {
        int _32_ = 0;
        this._storeFloat(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 72), _30_);
        this._storeInt((_32_ + 68), _31_);
        this._storeFloat((_32_ + 64), (this._loadFloat((_32_ + 72))));
        this._storeInt((this._loadInt((_32_ + 68))), 1);
        this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 64))) >>> 31));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 64))) & 2147483647))) & 4294967295L) < (2139095040 & 4294967295L)) {
                    break label$1;
                }
                this._storeFloat((_32_ + 76), ((_30_ = this._loadFloat((_32_ + 72))) * _30_));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_32_ + 16))) & 4294967295L) > (889192447 & 4294967295L)) {
                    break label$2;
                }
                label$3:
                do {
                    if ((this._loadInt((_32_ + 8))) == 0) {
                        break label$3;
                    }
                    this._storeInt((this._loadInt((_32_ + 68))), -1);
                    this._storeFloat((_32_ + 72), (-(this._loadFloat((_32_ + 72)))));
                }
                while (false);
                this._storeFloat((_32_ + 76), (-(logf((this._loadFloat((_32_ + 72)))))));
                break label$0;
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt((_32_ + 8))) == 0) {
                    break label$4;
                }
                label$5:
                do {
                    if ((this._storeFloat((_32_ + 60), (sin_pi$2e$143((this._storeFloat((_32_ + 72), (-(this._loadFloat((_32_ + 72)))))))))) != 0.0f) {
                        break label$5;
                    }
                    this._storeFloat((_32_ + 76), (1.0f / ((_30_ = this._loadFloat((_32_ + 72))) - _30_)));
                    break label$0;
                }
                while (false);
                label$6:
                do {
                    label$7:
                    do {
                        if (((((_30_ = this._loadFloat((_32_ + 60))) <= 0.0f) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                            break label$7;
                        }
                        this._storeInt((this._loadInt((_32_ + 68))), -1);
                        break label$6;
                    }
                    while (false);
                    this._storeFloat((_32_ + 60), (-(this._loadFloat((_32_ + 60)))));
                }
                while (false);
                this._storeFloat((_32_ + 48), (logf((3.1415927f / ((this._loadFloat((_32_ + 60))) * (this._loadFloat((_32_ + 72))))))));
            }
            while (false);
            label$8:
            do {
                label$9:
                do {
                    label$10:
                    do {
                        if ((this._loadInt((_32_ + 16))) == 1065353216) {
                            break label$10;
                        }
                        if ((this._loadInt((_32_ + 16))) != 1073741824) {
                            break label$9;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 24), 0);
                    break label$8;
                }
                while (false);
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
                                                    if (((this._loadInt((_32_ + 16))) & 4294967295L) > (1073741823 & 4294967295L)) {
                                                        break label$19;
                                                    }
                                                    if (((this._loadInt((_32_ + 16))) & 4294967295L) > (1063675494 & 4294967295L)) {
                                                        break label$18;
                                                    }
                                                    this._storeFloat((_32_ + 24), (-(logf((this._loadFloat((_32_ + 72)))))));
                                                    if (((this._loadInt((_32_ + 16))) & 4294967295L) < (1060850208 & 4294967295L)) {
                                                        break label$16;
                                                    }
                                                    this._storeFloat((_32_ + 56), (1.0f - (this._loadFloat((_32_ + 72)))));
                                                    this._storeInt((_32_ + 12), 0);
                                                    break label$11;
                                                }
                                                while (false);
                                                if (((this._loadInt((_32_ + 16))) & 4294967295L) > (1090519039 & 4294967295L)) {
                                                    break label$17;
                                                }
                                                _31_ = this._storeInt((_32_ + 12), (_truncateFloatToSignedInteger((this._loadFloat((_32_ + 72))))));
                                                this._storeFloat((_32_ + 44), ((_30_ = this._storeFloat((_32_ + 56), ((this._loadFloat((_32_ + 72))) - ((float) _31_)))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 3.1947533E-5f) + 0.0018402846f)) + 0.02664227f)) + 0.14635047f)) + 0.32577878f)) + 0.21498242f)) + -0.077215664f)));
                                                _30_ = this._storeFloat((_32_ + 28), (((_30_ = this._loadFloat((_32_ + 56))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 7.326684E-6f) + 7.779425E-4f)) + 0.01864592f)) + 0.17193386f)) + 0.7219356f)) + 1.3920053f)) + 1.0f));
                                                this._storeFloat((_32_ + 24), (((this._loadFloat((_32_ + 56))) * 0.5f) + ((this._loadFloat((_32_ + 44))) / _30_)));
                                                this._storeInt((_32_ + 52), 1065353216);
                                                if (((_31_ = (this._loadInt((_32_ + 12))) + -3) & 4294967295L) > (4 & 4294967295L)) {
                                                    break label$8;
                                                }
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
                                                                    switch (_31_) {
                                                                        case 0: {
                                                                            break label$20;
                                                                        }
                                                                        case 1: {
                                                                            break label$21;
                                                                        }
                                                                        case 2: {
                                                                            break label$22;
                                                                        }
                                                                        case 3: {
                                                                            break label$23;
                                                                        }
                                                                        case 4: {
                                                                            break label$24;
                                                                        }
                                                                        default: {
                                                                            break label$20;
                                                                        }
                                                                    }
                                                                }
                                                                while (false);
                                                                this._storeFloat((_32_ + 52), ((this._loadFloat((_32_ + 52))) * ((this._loadFloat((_32_ + 56))) + 6.0f)));
                                                            }
                                                            while (false);
                                                            this._storeFloat((_32_ + 52), ((this._loadFloat((_32_ + 52))) * ((this._loadFloat((_32_ + 56))) + 5.0f)));
                                                        }
                                                        while (false);
                                                        this._storeFloat((_32_ + 52), ((this._loadFloat((_32_ + 52))) * ((this._loadFloat((_32_ + 56))) + 4.0f)));
                                                    }
                                                    while (false);
                                                    this._storeFloat((_32_ + 52), ((this._loadFloat((_32_ + 52))) * ((this._loadFloat((_32_ + 56))) + 3.0f)));
                                                }
                                                while (false);
                                                _30_ = this._storeFloat((_32_ + 52), ((this._loadFloat((_32_ + 52))) * ((this._loadFloat((_32_ + 56))) + 2.0f)));
                                                this._storeFloat((_32_ + 24), ((this._loadFloat((_32_ + 24))) + (logf(_30_))));
                                                break label$8;
                                            }
                                            while (false);
                                            _31_ = this._storeInt((_32_ + 24), 0);
                                            if (((this._loadInt((_32_ + 16))) & 4294967295L) < (1071490584 & 4294967295L)) {
                                                break label$15;
                                            }
                                            this._storeFloat((_32_ + 56), (2.0f - (this._loadFloat((_32_ + 72)))));
                                            this._storeInt((_32_ + 12), _31_);
                                            break label$11;
                                        }
                                        while (false);
                                        if (((this._loadInt((_32_ + 16))) & 4294967295L) > (1551892479 & 4294967295L)) {
                                            break label$14;
                                        }
                                        this._storeFloat((_32_ + 60), (logf((this._loadFloat((_32_ + 72))))));
                                        _30_ = this._storeFloat((_32_ + 56), ((_30_ = this._storeFloat((_32_ + 52), (1.0f / (this._loadFloat((_32_ + 72)))))) * _30_));
                                        this._storeFloat((_32_ + 24), ((this._storeFloat((_32_ + 20), (((this._loadFloat((_32_ + 52))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * -0.0016309293f) + 8.363399E-4f)) + -5.9518754E-4f)) + 7.936506E-4f)) + -0.0027777778f)) + 0.083333336f)) + 0.41893855f))) + (((this._loadFloat((_32_ + 72))) + -0.5f) * ((this._loadFloat((_32_ + 60))) - 1.0f))));
                                        break label$8;
                                    }
                                    while (false);
                                    if (((this._loadInt((_32_ + 16))) & 4294967295L) < (1047343880 & 4294967295L)) {
                                        break label$13;
                                    }
                                    this._storeFloat((_32_ + 56), ((this._loadFloat((_32_ + 72))) + -0.46163213f));
                                    this._storeInt((_32_ + 12), 1);
                                    break label$11;
                                }
                                while (false);
                                if (((this._loadInt((_32_ + 16))) & 4294967295L) < (1067296288 & 4294967295L)) {
                                    break label$12;
                                }
                                this._storeFloat((_32_ + 56), ((this._loadFloat((_32_ + 72))) + -1.4616321f));
                                this._storeInt((_32_ + 12), 1);
                                break label$11;
                            }
                            while (false);
                            this._storeFloat((_32_ + 24), ((_30_ = this._loadFloat((_32_ + 72))) * ((logf(_30_)) + -1.0f)));
                            break label$8;
                        }
                        while (false);
                        this._storeFloat((_32_ + 56), (this._loadFloat((_32_ + 72))));
                        this._storeInt((_32_ + 12), 2);
                        break label$11;
                    }
                    while (false);
                    this._storeFloat((_32_ + 56), ((this._loadFloat((_32_ + 72))) + -1.0f));
                    this._storeInt((_32_ + 12), 2);
                }
                while (false);
                label$25:
                do {
                    label$26:
                    do {
                        if ((_31_ = this._loadInt((_32_ + 12))) == 2) {
                            break label$26;
                        }
                        if (_31_ == 1) {
                            break label$25;
                        }
                        if (_31_ != 0) {
                            break label$8;
                        }
                        this._storeFloat((_32_ + 40), (((_30_ = this._storeFloat((_32_ + 52), ((_30_ = this._loadFloat((_32_ + 56))) * _30_))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 2.5214456E-5f) + 2.2086278E-4f)) + 0.0011927077f)) + 0.007385551f)) + 0.0673523f)) + 0.077215664f));
                        _30_ = this._storeFloat((_32_ + 44), ((this._storeFloat((_32_ + 36), ((_30_ = this._loadFloat((_32_ + 52))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 4.4864097E-5f) + 1.0801157E-4f)) + 5.100698E-4f)) + 0.0028905137f)) + 0.020580808f)) + 0.32246703f)))) + ((this._loadFloat((_32_ + 56))) * (this._loadFloat((_32_ + 40))))));
                        this._storeFloat((_32_ + 24), ((this._loadFloat((_32_ + 24))) + (_30_ + ((this._loadFloat((_32_ + 56))) * -0.5f))));
                        break label$8;
                    }
                    while (false);
                    this._storeFloat((_32_ + 40), ((_30_ = this._loadFloat((_32_ + 56))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 0.013381092f) + 0.22896373f)) + 0.9777175f)) + 1.4549226f)) + 0.63282704f)) + -0.077215664f)));
                    _30_ = this._storeFloat((_32_ + 36), (((_30_ = this._loadFloat((_32_ + 56))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 0.0032170925f) + 0.10422265f)) + 0.76928514f)) + 2.1284897f)) + 2.455978f)) + 1.0f));
                    this._storeFloat((_32_ + 24), ((this._loadFloat((_32_ + 24))) + (((this._loadFloat((_32_ + 56))) * -0.5f) + ((this._loadFloat((_32_ + 40))) / _30_))));
                    break label$8;
                }
                while (false);
                this._storeFloat((_32_ + 40), (((_30_ = this._storeFloat((_32_ + 20), ((this._storeFloat((_32_ + 52), ((_30_ = this._loadFloat((_32_ + 56))) * _30_))) * (this._loadFloat((_32_ + 56)))))) * ((_30_ * ((_30_ * ((_30_ * 3.1563206E-4f) + -0.0014034647f)) + 0.0061005387f)) + -0.03278854f)) + 0.4838361f));
                this._storeFloat((_32_ + 36), (((_30_ = this._loadFloat((_32_ + 20))) * ((_30_ * ((_30_ * ((_30_ * -3.1275416E-4f) + 8.8108185E-4f)) + -0.0036845203f)) + 0.017970676f)) + -0.14758772f));
                _30_ = this._storeFloat((_32_ + 32), (((_30_ = this._loadFloat((_32_ + 20))) * ((_30_ * ((_30_ * ((_30_ * 3.3552918E-4f) + -5.385953E-4f)) + 0.0022596477f)) + -0.010314224f)) + 0.06462494f));
                _30_ = this._storeFloat((_32_ + 44), (((this._loadFloat((_32_ + 52))) * (this._loadFloat((_32_ + 40)))) - (6.6971007E-9f - ((this._loadFloat((_32_ + 20))) * ((this._loadFloat((_32_ + 36))) + (_30_ * (this._loadFloat((_32_ + 56)))))))));
                this._storeFloat((_32_ + 24), ((this._loadFloat((_32_ + 24))) + (_30_ + -0.121486284f)));
            }
            while (false);
            label$27:
            do {
                if ((this._loadInt((_32_ + 8))) == 0) {
                    break label$27;
                }
                this._storeFloat((_32_ + 24), ((this._loadFloat((_32_ + 48))) - (this._loadFloat((_32_ + 24)))));
            }
            while (false);
            this._storeFloat((_32_ + 76), (this._loadFloat((_32_ + 24))));
        }
        while (false);
        _30_ = this._loadFloat((_32_ + 76));
        this._storeInt((0 + 4), (_32_ + 80));
        return _30_;
    }

    @Override()
    public final float sin_pi$2e$143(float _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _32_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 12), (((this._storeInt((_31_ + 12), (_truncateFloatToSignedInteger(((this._storeFloat((_31_ + 24), ((_30_ = (_30_ = (this._storeFloat((_31_ + 24), _30_)) * 0.5f) - ((float) (Math.floor(_30_)))) + _30_))) * 4.0f))))) + 1) / 2));
        this._storeDouble((_31_ + 16), ((this._storeDouble((_31_ + 16), ((double) ((this._loadFloat((_31_ + 24))) - (((float) _32_) * 0.5f))))) * 3.141592653589793));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((_32_ = this._loadInt((_31_ + 12))) == 1) {
                            break label$3;
                        }
                        if (_32_ == 2) {
                            break label$2;
                        }
                        if (_32_ != 3) {
                            break label$1;
                        }
                        this._storeFloat((_31_ + 28), (-(__cosdf((this._loadDouble((_31_ + 16)))))));
                        break label$0;
                    }
                    while (false);
                    this._storeFloat((_31_ + 28), (__cosdf((this._loadDouble((_31_ + 16))))));
                    break label$0;
                }
                while (false);
                this._storeFloat((_31_ + 28), (__sindf((-(this._loadDouble((_31_ + 16)))))));
                break label$0;
            }
            while (false);
            this._storeFloat((_31_ + 28), (__sindf((this._loadDouble((_31_ + 16))))));
        }
        while (false);
        _30_ = this._loadFloat((_31_ + 28));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final void __lgammal_r(int _30_, long _31_, long _32_, int _33_)
    {
        int _34_ = 0;
        this._storeLong(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), _31_);
        this._storeInt((_34_ + 28), _33_);
        this._storeLong((_34_ + 40), _32_);
        this.__extenddftf2.invoke((_34_ + 8), (__lgamma_r((this.__trunctfdf2.invoke((this._loadLong((_34_ + 32))), _32_)), _33_)));
        this._storeLong((_30_ + 8), (this._loadLong(((_34_ + 8) + 8))));
        this._storeLong(_30_, (this._loadLong((_34_ + 8))));
        this._storeInt((0 + 4), (_34_ + 48));
        return;
    }

    @Override()
    public final void lgammal(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this._storeLong(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _32_);
        __lgammal_r(_33_, (this._storeLong((_33_ + 16), _31_)), _32_, 14764);
        _31_ = this._loadLong(_33_);
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, _31_);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int link(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = __syscall_ret((this.__syscall2.invoke(9, (this._loadInt((_32_ + 12))), _31_)));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int linkat(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        _34_ = __syscall_ret((this.__syscall5.invoke(303, (this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 16))), _34_)));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int __simple_malloc(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        _30_ = this._storeInt((_31_ + 20), 1);
        label$0:
        do {
            if ((this._loadInt((_31_ + 24))) != 0) {
                break label$0;
            }
            this._storeInt((_31_ + 24), ((this._loadInt((_31_ + 24))) + _30_));
        }
        while (false);
        label$2:
        do {
            label$1:
            while (true) {
                _30_ = 0;
                label$3:
                do {
                    if (((this._loadInt((_31_ + 20))) & 4294967295L) >= ((this._loadInt((_31_ + 24))) & 4294967295L)) {
                        break label$3;
                    }
                    _30_ = (((this._loadInt((_31_ + 20))) & 4294967295L) < (16 & 4294967295L)) ? 1 : 0;
                }
                while (false);
                if (_30_ == 0) {
                    break label$2;
                }
                this._storeInt((_31_ + 20), ((_30_ = this._loadInt((_31_ + 20))) + _30_));
                continue label$1;
            }
        }
        while (false);
        this.__lock.invoke(13012);
        this._storeInt((_31_ + 16), ((0 - (this._loadInt((0 + 13020)))) & ((this._loadInt((_31_ + 20))) + -1)));
        label$4:
        do {
            if (((this._loadInt((_31_ + 24))) & 4294967295L) > (-2147483633 & 4294967295L)) {
                break label$4;
            }
            this._storeInt((_31_ + 24), ((this._loadInt((_31_ + 24))) + (this._loadInt((_31_ + 16)))));
        }
        while (false);
        label$5:
        do {
            label$6:
            do {
                label$7:
                do {
                    if (((this._loadInt((_31_ + 24))) & 4294967295L) <= (((this._loadInt((0 + 13024))) - (this._loadInt((0 + 13020)))) & 4294967295L)) {
                        break label$7;
                    }
                    this._storeInt((_31_ + 8), (this._loadInt((_31_ + 24))));
                    if ((this._storeInt((_31_ + 4), (__expand_heap((_31_ + 8))))) == 0) {
                        break label$6;
                    }
                    label$8:
                    do {
                        if ((this._loadInt((_31_ + 4))) == (this._loadInt((0 + 13024)))) {
                            break label$8;
                        }
                        this._storeInt((0 + 13020), (this._loadInt((_31_ + 4))));
                        this._storeInt((_31_ + 24), ((this._loadInt((_31_ + 24))) - (this._loadInt((_31_ + 16)))));
                        this._storeInt((_31_ + 16), 0);
                    }
                    while (false);
                    this._storeInt((0 + 13024), ((this._loadInt((_31_ + 4))) + (this._loadInt((_31_ + 8)))));
                }
                while (false);
                this._storeInt((_31_ + 12), ((_30_ = this._loadInt((0 + 13020))) + (this._loadInt((_31_ + 16)))));
                this._storeInt((0 + 13020), (_30_ + (this._loadInt((_31_ + 24)))));
                this.__unlock.invoke(13012);
                this._storeInt((_31_ + 28), (this._loadInt((_31_ + 12))));
                break label$5;
            }
            while (false);
            this.__unlock.invoke(13012);
            this._storeInt((_31_ + 28), 0);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 28));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final long llabs(long _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeLong(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), _30_)) < 1L) {
                break label$0;
            }
            return (this._loadLong((_31_ + 8)));
        }
        while (false);
        return (0L - (this._loadLong((_31_ + 8))));
    }

    @Override()
    public final void lldiv(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this._storeLong(((_33_ = (this._loadInt((0 + 4))) - 16) + 8), _31_);
        this._storeLong(_33_, _32_);
        this._storeLong(_30_, ((_31_ = this._loadLong((_33_ + 8))) / _32_));
        this._storeLong((_30_ + 8), (_31_ % _32_));
        return;
    }

    @Override()
    public final long llrint(double _30_)
    {
        return (_truncateDoubleToSignedLong((Math.round((this._storeDouble((((this._loadInt((0 + 4))) - 16) + 8), _30_))))));
    }

    @Override()
    public final long llrintf(float _30_)
    {
        return (_truncateFloatToSignedLong((Math.round((this._storeFloat((((this._loadInt((0 + 4))) - 16) + 12), _30_))))));
    }

    @Override()
    public final long llrintl(long _30_, long _31_)
    {
        int _32_ = 0;
        _31_ = llrint((this.__trunctfdf2.invoke((this._storeLong((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))), _30_)), (this._storeLong((_32_ + 8), _31_)))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final long llround(double _30_)
    {
        int _31_ = 0;
        _30_ = round((this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return (_truncateDoubleToSignedLong(_30_));
    }

    @Override()
    public final long llroundf(float _30_)
    {
        int _31_ = 0;
        _30_ = roundf((this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return (_truncateFloatToSignedLong(_30_));
    }

    @Override()
    public final long llroundl(long _30_, long _31_)
    {
        int _32_ = 0;
        roundl((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), _30_, _31_);
        this._storeLong((_32_ + 24), _31_);
        this._storeLong((_32_ + 16), _30_);
        _30_ = this.__fixtfdi.invoke((this._loadLong(_32_)), (this._loadLong((_32_ + 8))));
        this._storeInt((0 + 4), (_32_ + 32));
        return _30_;
    }

    @Override()
    public final double log(double _30_)
    {
        int _31_ = 0;
        double _32_ = 0.0;
        int _33_ = 0;
        this._storeDouble(((_33_ = (this._loadInt((0 + 4))) - 112) + 88), (this._storeDouble((_33_ + 96), _30_)));
        this._storeLong32((_33_ + 12), (this._loadLong32u((_33_ + 92))));
        this._storeInt((_33_ + 8), 0);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadInt((_33_ + 12))) & 4294967295L) < (1048576 & 4294967295L)) {
                        break label$2;
                    }
                    if (((this._loadInt((_33_ + 12))) >>> 31) == 0) {
                        break label$1;
                    }
                }
                while (false);
                label$3:
                do {
                    label$4:
                    do {
                        if (((this._loadLong((_33_ + 88))) << 1L) == 0L) {
                            break label$4;
                        }
                        if (((this._loadInt((_33_ + 12))) >>> 31) == 0) {
                            break label$3;
                        }
                        this._storeDouble((_33_ + 104), (((_30_ = this._loadDouble((_33_ + 96))) - _30_) / 0.0));
                        return (this._loadDouble((_33_ + 104)));
                    }
                    while (false);
                    this._storeDouble((_33_ + 104), (-1.0 / ((_30_ = this._loadDouble((_33_ + 96))) * _30_)));
                    return (this._loadDouble((_33_ + 104)));
                }
                while (false);
                this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) + -54));
                this._storeDouble((_33_ + 88), (this._storeDouble((_33_ + 96), ((this._loadDouble((_33_ + 96))) * 1.8014398509481984E16))));
                this._storeLong32((_33_ + 12), (this._loadLong32u((_33_ + 92))));
                break label$0;
            }
            while (false);
            label$5:
            do {
                if (((this._loadInt((_33_ + 12))) & 4294967295L) < (2146435072 & 4294967295L)) {
                    break label$5;
                }
                this._storeDouble((_33_ + 104), (this._loadDouble((_33_ + 96))));
                return (this._loadDouble((_33_ + 104)));
            }
            while (false);
            if ((this._loadInt((_33_ + 12))) != 1072693248) {
                break label$0;
            }
            if (((this._loadLong((_33_ + 88))) << 32L) != 0L) {
                break label$0;
            }
            this._storeLong((_33_ + 104), 0L);
            return (this._loadDouble((_33_ + 104)));
        }
        while (false);
        _31_ = this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 614242));
        this._storeInt((_33_ + 8), (((this._loadInt((_33_ + 8))) + (_31_ >>> 20)) + -1023));
        this._storeInt((_33_ + 12), (((this._loadInt((_33_ + 12))) & 1048575) + 1072079006));
        this._storeLong32((_33_ + 92), (this._loadLong32u((_33_ + 12))));
        this._storeDouble((_33_ + 80), (((_30_ = this._storeDouble((_33_ + 72), ((this._storeDouble((_33_ + 96), (this._loadDouble((_33_ + 88))))) + -1.0))) * 0.5) * _30_));
        this._storeDouble((_33_ + 32), ((_30_ = this._storeDouble((_33_ + 40), ((_30_ = this._storeDouble((_33_ + 56), ((_30_ = this._storeDouble((_33_ + 64), ((_30_ = this._loadDouble((_33_ + 72))) / (_30_ + 2.0)))) * _30_))) * _30_))) * ((_30_ * ((_30_ * 0.15313837699209373) + 0.22222198432149784)) + 0.3999999999940942)));
        this._storeDouble((_33_ + 48), ((this._storeDouble((_33_ + 24), ((this._loadDouble((_33_ + 56))) * (((_30_ = this._loadDouble((_33_ + 40))) * ((_30_ * ((_30_ * 0.14798198605116586) + 0.1818357216161805)) + 0.2857142874366239)) + 0.6666666666666735)))) + (this._loadDouble((_33_ + 32)))));
        _30_ = this._storeDouble((_33_ + 16), ((double) (this._loadInt((_33_ + 8)))));
        this._storeDouble((_33_ + 104), ((((((this._loadDouble((_33_ + 64))) * ((_32_ = this._loadDouble((_33_ + 80))) + (this._loadDouble((_33_ + 48))))) + (_30_ * 1.9082149292705877E-10)) - _32_) + (this._loadDouble((_33_ + 72)))) + (_30_ * 0.6931471803691238)));
        return (this._loadDouble((_33_ + 104)));
    }

    @Override()
    public final double log10(double _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeDouble(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 144))) + 120), (this._storeDouble((_32_ + 128), _30_)));
        this._storeLong32((_32_ + 4), (this._loadLong32u((_32_ + 124))));
        this._storeInt(_32_, 0);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if (((this._loadInt((_32_ + 4))) & 4294967295L) < (1048576 & 4294967295L)) {
                            break label$3;
                        }
                        if (((this._loadInt((_32_ + 4))) >>> 31) == 0) {
                            break label$2;
                        }
                    }
                    while (false);
                    label$4:
                    do {
                        label$5:
                        do {
                            if (((this._loadLong((_32_ + 120))) << 1L) == 0L) {
                                break label$5;
                            }
                            if (((this._loadInt((_32_ + 4))) >>> 31) == 0) {
                                break label$4;
                            }
                            this._storeDouble((_32_ + 136), (((_30_ = this._loadDouble((_32_ + 128))) - _30_) / 0.0));
                            break label$0;
                        }
                        while (false);
                        this._storeDouble((_32_ + 136), (-1.0 / ((_30_ = this._loadDouble((_32_ + 128))) * _30_)));
                        break label$0;
                    }
                    while (false);
                    this._storeInt(_32_, ((this._loadInt(_32_)) + -54));
                    this._storeDouble((_32_ + 120), (this._storeDouble((_32_ + 128), ((this._loadDouble((_32_ + 128))) * 1.8014398509481984E16))));
                    this._storeLong32((_32_ + 4), (this._loadLong32u((_32_ + 124))));
                    break label$1;
                }
                while (false);
                label$6:
                do {
                    if (((this._loadInt((_32_ + 4))) & 4294967295L) < (2146435072 & 4294967295L)) {
                        break label$6;
                    }
                    this._storeDouble((_32_ + 136), (this._loadDouble((_32_ + 128))));
                    break label$0;
                }
                while (false);
                if ((this._loadInt((_32_ + 4))) != 1072693248) {
                    break label$1;
                }
                if (((this._loadLong((_32_ + 120))) << 32L) != 0L) {
                    break label$1;
                }
                this._storeLong((_32_ + 136), 0L);
                break label$0;
            }
            while (false);
            _31_ = this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 614242));
            this._storeInt(_32_, (((this._loadInt(_32_)) + (_31_ >>> 20)) + -1023));
            this._storeInt((_32_ + 4), (((this._loadInt((_32_ + 4))) & 1048575) + 1072079006));
            this._storeLong32((_32_ + 124), (this._loadLong32u((_32_ + 4))));
            this._storeDouble((_32_ + 112), (((_30_ = this._storeDouble((_32_ + 104), ((this._storeDouble((_32_ + 128), (this._loadDouble((_32_ + 120))))) + -1.0))) * 0.5) * _30_));
            this._storeDouble((_32_ + 64), ((_30_ = this._storeDouble((_32_ + 72), ((_30_ = this._storeDouble((_32_ + 88), ((_30_ = this._storeDouble((_32_ + 96), ((_30_ = this._loadDouble((_32_ + 104))) / (_30_ + 2.0)))) * _30_))) * _30_))) * ((_30_ * ((_30_ * 0.15313837699209373) + 0.22222198432149784)) + 0.3999999999940942)));
            this._storeDouble((_32_ + 80), ((this._storeDouble((_32_ + 56), ((this._loadDouble((_32_ + 88))) * (((_30_ = this._loadDouble((_32_ + 72))) * ((_30_ * ((_30_ * 0.14798198605116586) + 0.1818357216161805)) + 0.2857142874366239)) + 0.6666666666666735)))) + (this._loadDouble((_32_ + 64)))));
            this._storeDouble((_32_ + 120), (this._storeDouble((_32_ + 32), ((this._loadDouble((_32_ + 104))) - (this._loadDouble((_32_ + 112)))))));
            this._storeLong((_32_ + 120), ((this._loadLong((_32_ + 120))) & -4294967296L));
            _30_ = this._storeDouble((_32_ + 32), (this._loadDouble((_32_ + 120))));
            this._storeDouble((_32_ + 24), ((((this._loadDouble((_32_ + 104))) - _30_) - (_30_ = this._loadDouble((_32_ + 112)))) + ((this._loadDouble((_32_ + 96))) * (_30_ + (this._loadDouble((_32_ + 80)))))));
            this._storeDouble((_32_ + 16), ((this._loadDouble((_32_ + 32))) * 0.4342944818781689));
            this._storeDouble((_32_ + 40), ((this._storeDouble((_32_ + 48), ((double) (this._loadInt(_32_))))) * 0.30102999566361177));
            this._storeDouble((_32_ + 8), ((((this._loadDouble((_32_ + 48))) * 3.694239077158931E-13) + (((_30_ = this._loadDouble((_32_ + 24))) + (this._loadDouble((_32_ + 32)))) * 2.5082946711645275E-11)) + (_30_ * 0.4342944818781689)));
            _30_ = this._storeDouble((_32_ + 72), ((this._loadDouble((_32_ + 40))) + (this._loadDouble((_32_ + 16)))));
            this._storeDouble((_32_ + 8), ((this._loadDouble((_32_ + 8))) + (((this._loadDouble((_32_ + 40))) - _30_) + (this._loadDouble((_32_ + 16))))));
            this._storeDouble((_32_ + 136), ((this._storeDouble((_32_ + 16), (this._loadDouble((_32_ + 72))))) + (this._loadDouble((_32_ + 8)))));
        }
        while (false);
        _30_ = this._loadDouble((_32_ + 136));
        this._storeInt((0 + 4), (_32_ + 144));
        return _30_;
    }

    @Override()
    public final float log10f(float _30_)
    {
        int _31_ = 0;
        float _32_ = 0.0f;
        float _33_ = 0.0f;
        int _34_ = 0;
        this._storeFloat(((_34_ = (this._loadInt((0 + 4))) - 80) + 64), (this._storeFloat((_34_ + 72), _30_)));
        this._storeInt((_34_ + 16), (this._loadInt((_34_ + 64))));
        this._storeInt((_34_ + 12), 0);
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
                            if (((this._loadInt((_34_ + 16))) & 4294967295L) < (8388608 & 4294967295L)) {
                                break label$4;
                            }
                            if (((this._loadInt((_34_ + 16))) >>> 31) == 0) {
                                break label$3;
                            }
                        }
                        while (false);
                        label$5:
                        do {
                            if (((this._loadInt((_34_ + 16))) << 1) == 0) {
                                break label$5;
                            }
                            if (((this._loadInt((_34_ + 16))) >>> 31) == 0) {
                                break label$2;
                            }
                            this._storeFloat((_34_ + 76), (((_30_ = this._loadFloat((_34_ + 72))) - _30_) / 0.0f));
                            return (this._loadFloat((_34_ + 76)));
                        }
                        while (false);
                        this._storeFloat((_34_ + 76), (-1.0f / ((_30_ = this._loadFloat((_34_ + 72))) * _30_)));
                        return (this._loadFloat((_34_ + 76)));
                    }
                    while (false);
                    if (((this._loadInt((_34_ + 16))) & 4294967295L) < (2139095040 & 4294967295L)) {
                        break label$1;
                    }
                    this._storeFloat((_34_ + 76), (this._loadFloat((_34_ + 72))));
                    return (this._loadFloat((_34_ + 76)));
                }
                while (false);
                this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 12))) + -25));
                this._storeFloat((_34_ + 64), (this._storeFloat((_34_ + 72), ((this._loadFloat((_34_ + 72))) * 3.3554432E7f))));
                this._storeInt((_34_ + 16), (this._loadInt((_34_ + 64))));
                break label$0;
            }
            while (false);
            if ((this._loadInt((_34_ + 16))) != 1065353216) {
                break label$0;
            }
            this._storeInt((_34_ + 76), 0);
            return (this._loadFloat((_34_ + 76)));
        }
        while (false);
        _31_ = this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) + 4913933));
        this._storeInt((_34_ + 12), (((this._loadInt((_34_ + 12))) + (_31_ >>> 23)) + -127));
        this._storeInt((_34_ + 64), (this._storeInt((_34_ + 16), (((this._loadInt((_34_ + 16))) & 8388607) + 1060439283))));
        this._storeFloat((_34_ + 36), ((_30_ = this._storeFloat((_34_ + 40), ((_30_ = this._storeFloat((_34_ + 48), ((_30_ = this._storeFloat((_34_ + 52), ((_30_ = this._storeFloat((_34_ + 56), ((this._storeFloat((_34_ + 72), (this._loadFloat((_34_ + 64))))) + -1.0f))) / (_30_ + 2.0f)))) * _30_))) * _30_))) * ((_30_ * 0.24279079f) + 0.40000972f)));
        this._storeFloat((_34_ + 44), ((this._storeFloat((_34_ + 32), ((this._loadFloat((_34_ + 48))) * (((this._loadFloat((_34_ + 40))) * 0.28498787f) + 0.6666666f)))) + (this._loadFloat((_34_ + 36)))));
        _30_ = this._storeFloat((_34_ + 60), (((_30_ = this._loadFloat((_34_ + 56))) * 0.5f) * _30_));
        this._storeFloat((_34_ + 64), (this._storeFloat((_34_ + 24), ((this._loadFloat((_34_ + 56))) - _30_))));
        this._storeInt((_34_ + 64), ((this._loadInt((_34_ + 64))) & -4096));
        _30_ = this._storeFloat((_34_ + 24), (this._loadFloat((_34_ + 64))));
        this._storeFloat((_34_ + 20), ((((this._loadFloat((_34_ + 56))) - _30_) - (_30_ = this._loadFloat((_34_ + 60)))) + ((this._loadFloat((_34_ + 52))) * (_30_ + (this._loadFloat((_34_ + 44)))))));
        this._storeFloat((_34_ + 76), ((((((_30_ = this._storeFloat((_34_ + 28), ((float) (this._loadInt((_34_ + 12)))))) * 7.903415E-7f) + (((_33_ = this._loadFloat((_34_ + 20))) + (_32_ = this._loadFloat((_34_ + 24)))) * -3.168997E-5f)) + (_33_ * 0.43432617f)) + (_32_ * 0.43432617f)) + (_30_ * 0.3010292f)));
        return (this._loadFloat((_34_ + 76)));
    }

    @Override()
    public final void log10l(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (log10((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final double log1p(double _30_)
    {
        double _31_ = 0.0;
        int _32_ = 0;
        this._storeDouble(((_32_ = (this._loadInt((0 + 4))) - 128) + 104), (this._storeDouble((_32_ + 112), _30_)));
        this._storeLong32((_32_ + 20), (this._loadLong32u((_32_ + 108))));
        this._storeInt((_32_ + 12), 1);
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
                                            if (((this._loadInt((_32_ + 20))) & 4294967295L) < (1071284858 & 4294967295L)) {
                                                break label$8;
                                            }
                                            if (((this._loadInt((_32_ + 20))) >>> 31) == 0) {
                                                break label$7;
                                            }
                                        }
                                        while (false);
                                        label$9:
                                        do {
                                            if (((this._loadInt((_32_ + 20))) & 4294967295L) < (-1074790400 & 4294967295L)) {
                                                break label$9;
                                            }
                                            if ((this._loadDouble((_32_ + 112))) != -1.0) {
                                                break label$5;
                                            }
                                            this._storeDouble((_32_ + 120), ((this._loadDouble((_32_ + 112))) / 0.0));
                                            return (this._loadDouble((_32_ + 120)));
                                        }
                                        while (false);
                                        label$10:
                                        do {
                                            if ((((this._loadInt((_32_ + 20))) << 1) & 4294967295L) > (2034237439 & 4294967295L)) {
                                                break label$10;
                                            }
                                            label$11:
                                            do {
                                                if (((this._loadInt16u((_32_ + 22))) & 32752) != 0) {
                                                    break label$11;
                                                }
                                                this._storeFloat((_32_ + 8), ((float) (this._loadDouble((_32_ + 112)))));
                                            }
                                            while (false);
                                            this._storeDouble((_32_ + 120), (this._loadDouble((_32_ + 112))));
                                            return (this._loadDouble((_32_ + 120)));
                                        }
                                        while (false);
                                        if (((this._loadInt((_32_ + 20))) & 4294967295L) > (-1076707644 & 4294967295L)) {
                                            break label$6;
                                        }
                                        this._storeInt((_32_ + 12), 0);
                                        this._storeLong((_32_ + 80), 0L);
                                        this._storeDouble((_32_ + 88), (this._loadDouble((_32_ + 112))));
                                        break label$6;
                                    }
                                    while (false);
                                    if (((this._loadInt((_32_ + 20))) & 4294967295L) < (2146435072 & 4294967295L)) {
                                        break label$6;
                                    }
                                    this._storeDouble((_32_ + 120), (this._loadDouble((_32_ + 112))));
                                    return (this._loadDouble((_32_ + 120)));
                                }
                                while (false);
                                if ((this._loadInt((_32_ + 12))) == 0) {
                                    break label$0;
                                }
                                this._storeDouble((_32_ + 104), ((this._loadDouble((_32_ + 112))) + 1.0));
                                if ((this._storeInt((_32_ + 12), (((this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 16), (this._loadInt((_32_ + 108))))) + 614242))) >>> 20) + -1023))) > 53) {
                                    break label$4;
                                }
                                if ((this._loadInt((_32_ + 12))) < 2) {
                                    break label$3;
                                }
                                _30_ = 1.0 - ((this._loadDouble((_32_ + 104))) - (this._loadDouble((_32_ + 112))));
                                break label$2;
                            }
                            while (false);
                            this._storeDouble((_32_ + 120), (((_30_ = this._loadDouble((_32_ + 112))) - _30_) / 0.0));
                            return (this._loadDouble((_32_ + 120)));
                        }
                        while (false);
                        this._storeLong((_32_ + 80), 0L);
                        break label$1;
                    }
                    while (false);
                    _30_ = (this._loadDouble((_32_ + 112))) - ((this._loadDouble((_32_ + 104))) + -1.0);
                }
                while (false);
                this._storeDouble((_32_ + 80), ((this._storeDouble((_32_ + 80), _30_)) / (this._loadDouble((_32_ + 104)))));
            }
            while (false);
            this._storeInt((_32_ + 16), (((this._loadInt((_32_ + 16))) & 1048575) + 1072079006));
            this._storeLong32((_32_ + 108), (this._loadLong32u((_32_ + 16))));
            this._storeDouble((_32_ + 88), ((this._loadDouble((_32_ + 104))) + -1.0));
        }
        while (false);
        this._storeDouble((_32_ + 96), (((_30_ = this._loadDouble((_32_ + 88))) * 0.5) * _30_));
        this._storeDouble((_32_ + 40), ((_30_ = this._storeDouble((_32_ + 48), ((_30_ = this._storeDouble((_32_ + 64), ((_30_ = this._storeDouble((_32_ + 72), ((_30_ = this._loadDouble((_32_ + 88))) / (_30_ + 2.0)))) * _30_))) * _30_))) * ((_30_ * ((_30_ * 0.15313837699209373) + 0.22222198432149784)) + 0.3999999999940942)));
        this._storeDouble((_32_ + 56), ((this._storeDouble((_32_ + 32), ((this._loadDouble((_32_ + 64))) * (((_30_ = this._loadDouble((_32_ + 48))) * ((_30_ * ((_30_ * 0.14798198605116586) + 0.1818357216161805)) + 0.2857142874366239)) + 0.6666666666666735)))) + (this._loadDouble((_32_ + 40)))));
        _30_ = this._storeDouble((_32_ + 24), ((double) (this._loadInt((_32_ + 12)))));
        this._storeDouble((_32_ + 120), ((((((this._loadDouble((_32_ + 72))) * ((_31_ = this._loadDouble((_32_ + 96))) + (this._loadDouble((_32_ + 56))))) + ((_30_ * 1.9082149292705877E-10) + (this._loadDouble((_32_ + 80))))) - _31_) + (this._loadDouble((_32_ + 88)))) + (_30_ * 0.6931471803691238)));
        return (this._loadDouble((_32_ + 120)));
    }

    @Override()
    public final float log1pf(float _30_)
    {
        float _31_ = 0.0f;
        int _32_ = 0;
        this._storeFloat(((_32_ = (this._loadInt((0 + 4))) - 80) + 64), (this._storeFloat((_32_ + 72), _30_)));
        this._storeInt((_32_ + 20), (this._loadInt((_32_ + 64))));
        this._storeInt((_32_ + 12), 1);
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
                                            if (((this._loadInt((_32_ + 20))) & 4294967295L) < (1054086096 & 4294967295L)) {
                                                break label$8;
                                            }
                                            if (((this._loadInt((_32_ + 20))) >>> 31) == 0) {
                                                break label$7;
                                            }
                                        }
                                        while (false);
                                        label$9:
                                        do {
                                            if (((this._loadInt((_32_ + 20))) & 4294967295L) < (-1082130432 & 4294967295L)) {
                                                break label$9;
                                            }
                                            if ((this._loadFloat((_32_ + 72))) != -1.0f) {
                                                break label$5;
                                            }
                                            this._storeFloat((_32_ + 76), ((this._loadFloat((_32_ + 72))) / 0.0f));
                                            return (this._loadFloat((_32_ + 76)));
                                        }
                                        while (false);
                                        label$10:
                                        do {
                                            if ((((this._loadInt((_32_ + 20))) << 1) & 4294967295L) > (1728053247 & 4294967295L)) {
                                                break label$10;
                                            }
                                            label$11:
                                            do {
                                                if (((this._loadInt16u((_32_ + 22))) & 32640) != 0) {
                                                    break label$11;
                                                }
                                                this._storeFloat((_32_ + 8), ((_30_ = this._loadFloat((_32_ + 72))) * _30_));
                                            }
                                            while (false);
                                            this._storeFloat((_32_ + 76), (this._loadFloat((_32_ + 72))));
                                            return (this._loadFloat((_32_ + 76)));
                                        }
                                        while (false);
                                        if (((this._loadInt((_32_ + 20))) & 4294967295L) > (-1097468391 & 4294967295L)) {
                                            break label$6;
                                        }
                                        this._storeInt((_32_ + 52), (this._storeInt((_32_ + 12), 0)));
                                        this._storeFloat((_32_ + 56), (this._loadFloat((_32_ + 72))));
                                        break label$6;
                                    }
                                    while (false);
                                    if (((this._loadInt((_32_ + 20))) & 4294967295L) < (2139095040 & 4294967295L)) {
                                        break label$6;
                                    }
                                    this._storeFloat((_32_ + 76), (this._loadFloat((_32_ + 72))));
                                    return (this._loadFloat((_32_ + 76)));
                                }
                                while (false);
                                if ((this._loadInt((_32_ + 12))) == 0) {
                                    break label$0;
                                }
                                this._storeFloat((_32_ + 64), ((this._loadFloat((_32_ + 72))) + 1.0f));
                                if ((this._storeInt((_32_ + 12), (((this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 16), (this._loadInt((_32_ + 64))))) + 4913933))) >>> 23) + -127))) > 24) {
                                    break label$4;
                                }
                                if ((this._loadInt((_32_ + 12))) < 2) {
                                    break label$3;
                                }
                                _30_ = 1.0f - ((this._loadFloat((_32_ + 64))) - (this._loadFloat((_32_ + 72))));
                                break label$2;
                            }
                            while (false);
                            this._storeFloat((_32_ + 76), (((_30_ = this._loadFloat((_32_ + 72))) - _30_) / 0.0f));
                            return (this._loadFloat((_32_ + 76)));
                        }
                        while (false);
                        this._storeInt((_32_ + 52), 0);
                        break label$1;
                    }
                    while (false);
                    _30_ = (this._loadFloat((_32_ + 72))) - ((this._loadFloat((_32_ + 64))) + -1.0f);
                }
                while (false);
                this._storeFloat((_32_ + 52), ((this._storeFloat((_32_ + 52), _30_)) / (this._loadFloat((_32_ + 64)))));
            }
            while (false);
            this._storeInt((_32_ + 64), (this._storeInt((_32_ + 16), (((this._loadInt((_32_ + 16))) & 8388607) + 1060439283))));
            this._storeFloat((_32_ + 56), ((this._loadFloat((_32_ + 64))) + -1.0f));
        }
        while (false);
        this._storeFloat((_32_ + 32), ((_30_ = this._storeFloat((_32_ + 36), ((_30_ = this._storeFloat((_32_ + 44), ((_30_ = this._storeFloat((_32_ + 48), ((_30_ = this._loadFloat((_32_ + 56))) / (_30_ + 2.0f)))) * _30_))) * _30_))) * ((_30_ * 0.24279079f) + 0.40000972f)));
        this._storeFloat((_32_ + 40), ((this._storeFloat((_32_ + 28), ((this._loadFloat((_32_ + 44))) * (((this._loadFloat((_32_ + 36))) * 0.28498787f) + 0.6666666f)))) + (this._loadFloat((_32_ + 32)))));
        this._storeFloat((_32_ + 60), (((_30_ = this._loadFloat((_32_ + 56))) * 0.5f) * _30_));
        _30_ = this._storeFloat((_32_ + 24), ((float) (this._loadInt((_32_ + 12)))));
        this._storeFloat((_32_ + 76), ((((((this._loadFloat((_32_ + 48))) * ((_31_ = this._loadFloat((_32_ + 60))) + (this._loadFloat((_32_ + 40))))) + ((_30_ * 9.058001E-6f) + (this._loadFloat((_32_ + 52))))) - _31_) + (this._loadFloat((_32_ + 56)))) + (_30_ * 0.6931381f)));
        return (this._loadFloat((_32_ + 76)));
    }

    @Override()
    public final void log1pl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (log1p((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final double log2(double _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeDouble(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 144))) + 120), (this._storeDouble((_32_ + 128), _30_)));
        this._storeLong32((_32_ + 12), (this._loadLong32u((_32_ + 124))));
        this._storeInt((_32_ + 8), 0);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if (((this._loadInt((_32_ + 12))) & 4294967295L) < (1048576 & 4294967295L)) {
                            break label$3;
                        }
                        if (((this._loadInt((_32_ + 12))) >>> 31) == 0) {
                            break label$2;
                        }
                    }
                    while (false);
                    label$4:
                    do {
                        label$5:
                        do {
                            if (((this._loadLong((_32_ + 120))) << 1L) == 0L) {
                                break label$5;
                            }
                            if (((this._loadInt((_32_ + 12))) >>> 31) == 0) {
                                break label$4;
                            }
                            this._storeDouble((_32_ + 136), (((_30_ = this._loadDouble((_32_ + 128))) - _30_) / 0.0));
                            break label$0;
                        }
                        while (false);
                        this._storeDouble((_32_ + 136), (-1.0 / ((_30_ = this._loadDouble((_32_ + 128))) * _30_)));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) + -54));
                    this._storeDouble((_32_ + 120), (this._storeDouble((_32_ + 128), ((this._loadDouble((_32_ + 128))) * 1.8014398509481984E16))));
                    this._storeLong32((_32_ + 12), (this._loadLong32u((_32_ + 124))));
                    break label$1;
                }
                while (false);
                label$6:
                do {
                    if (((this._loadInt((_32_ + 12))) & 4294967295L) < (2146435072 & 4294967295L)) {
                        break label$6;
                    }
                    this._storeDouble((_32_ + 136), (this._loadDouble((_32_ + 128))));
                    break label$0;
                }
                while (false);
                if ((this._loadInt((_32_ + 12))) != 1072693248) {
                    break label$1;
                }
                if (((this._loadLong((_32_ + 120))) << 32L) != 0L) {
                    break label$1;
                }
                this._storeLong((_32_ + 136), 0L);
                break label$0;
            }
            while (false);
            _31_ = this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 614242));
            this._storeInt((_32_ + 8), (((this._loadInt((_32_ + 8))) + (_31_ >>> 20)) + -1023));
            this._storeInt((_32_ + 12), (((this._loadInt((_32_ + 12))) & 1048575) + 1072079006));
            this._storeLong32((_32_ + 124), (this._loadLong32u((_32_ + 12))));
            this._storeDouble((_32_ + 112), (((_30_ = this._storeDouble((_32_ + 104), ((this._storeDouble((_32_ + 128), (this._loadDouble((_32_ + 120))))) + -1.0))) * 0.5) * _30_));
            this._storeDouble((_32_ + 64), ((_30_ = this._storeDouble((_32_ + 72), ((_30_ = this._storeDouble((_32_ + 88), ((_30_ = this._storeDouble((_32_ + 96), ((_30_ = this._loadDouble((_32_ + 104))) / (_30_ + 2.0)))) * _30_))) * _30_))) * ((_30_ * ((_30_ * 0.15313837699209373) + 0.22222198432149784)) + 0.3999999999940942)));
            this._storeDouble((_32_ + 80), ((this._storeDouble((_32_ + 56), ((this._loadDouble((_32_ + 88))) * (((_30_ = this._loadDouble((_32_ + 72))) * ((_30_ * ((_30_ * 0.14798198605116586) + 0.1818357216161805)) + 0.2857142874366239)) + 0.6666666666666735)))) + (this._loadDouble((_32_ + 64)))));
            this._storeDouble((_32_ + 120), (this._storeDouble((_32_ + 40), ((this._loadDouble((_32_ + 104))) - (this._loadDouble((_32_ + 112)))))));
            this._storeLong((_32_ + 120), ((this._loadLong((_32_ + 120))) & -4294967296L));
            _30_ = this._storeDouble((_32_ + 40), (this._loadDouble((_32_ + 120))));
            this._storeDouble((_32_ + 32), ((((this._loadDouble((_32_ + 104))) - _30_) - (_30_ = this._loadDouble((_32_ + 112)))) + ((this._loadDouble((_32_ + 96))) * (_30_ + (this._loadDouble((_32_ + 80)))))));
            this._storeDouble((_32_ + 24), ((this._loadDouble((_32_ + 40))) * 1.4426950407214463));
            this._storeDouble((_32_ + 16), ((((_30_ = this._loadDouble((_32_ + 32))) + (this._loadDouble((_32_ + 40)))) * 1.6751713164886512E-10) + (_30_ * 1.4426950407214463)));
            _30_ = this._storeDouble((_32_ + 72), ((this._storeDouble((_32_ + 48), ((double) (this._loadInt((_32_ + 8)))))) + (this._loadDouble((_32_ + 24)))));
            this._storeDouble((_32_ + 16), ((this._loadDouble((_32_ + 16))) + (((this._loadDouble((_32_ + 48))) - _30_) + (this._loadDouble((_32_ + 24))))));
            this._storeDouble((_32_ + 136), ((this._storeDouble((_32_ + 24), (this._loadDouble((_32_ + 72))))) + (this._loadDouble((_32_ + 16)))));
        }
        while (false);
        _30_ = this._loadDouble((_32_ + 136));
        this._storeInt((0 + 4), (_32_ + 144));
        return _30_;
    }

    @Override()
    public final float log2f(float _30_)
    {
        int _31_ = 0;
        float _32_ = 0.0f;
        int _33_ = 0;
        this._storeFloat(((_33_ = (this._loadInt((0 + 4))) - 64) + 48), (this._storeFloat((_33_ + 56), _30_)));
        this._storeInt((_33_ + 4), (this._loadInt((_33_ + 48))));
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
                            if (((this._loadInt((_33_ + 4))) & 4294967295L) < (8388608 & 4294967295L)) {
                                break label$4;
                            }
                            if (((this._loadInt((_33_ + 4))) >>> 31) == 0) {
                                break label$3;
                            }
                        }
                        while (false);
                        label$5:
                        do {
                            if (((this._loadInt((_33_ + 4))) << 1) == 0) {
                                break label$5;
                            }
                            if (((this._loadInt((_33_ + 4))) >>> 31) == 0) {
                                break label$2;
                            }
                            this._storeFloat((_33_ + 60), (((_30_ = this._loadFloat((_33_ + 56))) - _30_) / 0.0f));
                            return (this._loadFloat((_33_ + 60)));
                        }
                        while (false);
                        this._storeFloat((_33_ + 60), (-1.0f / ((_30_ = this._loadFloat((_33_ + 56))) * _30_)));
                        return (this._loadFloat((_33_ + 60)));
                    }
                    while (false);
                    if (((this._loadInt((_33_ + 4))) & 4294967295L) < (2139095040 & 4294967295L)) {
                        break label$1;
                    }
                    this._storeFloat((_33_ + 60), (this._loadFloat((_33_ + 56))));
                    return (this._loadFloat((_33_ + 60)));
                }
                while (false);
                this._storeInt(_33_, ((this._loadInt(_33_)) + -25));
                this._storeFloat((_33_ + 48), (this._storeFloat((_33_ + 56), ((this._loadFloat((_33_ + 56))) * 3.3554432E7f))));
                this._storeInt((_33_ + 4), (this._loadInt((_33_ + 48))));
                break label$0;
            }
            while (false);
            if ((this._loadInt((_33_ + 4))) != 1065353216) {
                break label$0;
            }
            this._storeInt((_33_ + 60), 0);
            return (this._loadFloat((_33_ + 60)));
        }
        while (false);
        _31_ = this._storeInt((_33_ + 4), ((this._loadInt((_33_ + 4))) + 4913933));
        this._storeInt(_33_, (((this._loadInt(_33_)) + (_31_ >>> 23)) + -127));
        this._storeInt((_33_ + 48), (this._storeInt((_33_ + 4), (((this._loadInt((_33_ + 4))) & 8388607) + 1060439283))));
        this._storeFloat((_33_ + 20), ((_30_ = this._storeFloat((_33_ + 24), ((_30_ = this._storeFloat((_33_ + 32), ((_30_ = this._storeFloat((_33_ + 36), ((_30_ = this._storeFloat((_33_ + 40), ((this._storeFloat((_33_ + 56), (this._loadFloat((_33_ + 48))))) + -1.0f))) / (_30_ + 2.0f)))) * _30_))) * _30_))) * ((_30_ * 0.24279079f) + 0.40000972f)));
        this._storeFloat((_33_ + 28), ((this._storeFloat((_33_ + 16), ((this._loadFloat((_33_ + 32))) * (((this._loadFloat((_33_ + 24))) * 0.28498787f) + 0.6666666f)))) + (this._loadFloat((_33_ + 20)))));
        _30_ = this._storeFloat((_33_ + 44), (((_30_ = this._loadFloat((_33_ + 40))) * 0.5f) * _30_));
        this._storeFloat((_33_ + 48), (this._storeFloat((_33_ + 12), ((this._loadFloat((_33_ + 40))) - _30_))));
        this._storeInt((_33_ + 48), ((this._loadInt((_33_ + 48))) & -4096));
        _30_ = this._storeFloat((_33_ + 12), (this._loadFloat((_33_ + 48))));
        this._storeFloat((_33_ + 60), ((((((_30_ = this._storeFloat((_33_ + 8), ((((this._loadFloat((_33_ + 40))) - _30_) - (_30_ = this._loadFloat((_33_ + 44)))) + ((this._loadFloat((_33_ + 36))) * (_30_ + (this._loadFloat((_33_ + 28)))))))) + (_32_ = this._loadFloat((_33_ + 12)))) * -1.7605285E-4f) + (_30_ * 1.4428711f)) + (_32_ * 1.4428711f)) + ((float) (this._loadInt(_33_)))));
        return (this._loadFloat((_33_ + 60)));
    }

    @Override()
    public final void log2l(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (log2((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final double logb(double _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((((__DOUBLE_BITS$2e$155((this._storeDouble((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))), _30_)))) & 9223372036854775807L) & 4294967295L) >= (9218868437227405312L & 4294967295L)) {
                        break label$2;
                    }
                    if ((this._loadDouble(_31_)) != 0.0) {
                        break label$1;
                    }
                    this._storeDouble((_31_ + 8), (-1.0 / ((_30_ = this._loadDouble(_31_)) * _30_)));
                    break label$0;
                }
                while (false);
                this._storeDouble((_31_ + 8), ((_30_ = this._loadDouble(_31_)) * _30_));
                break label$0;
            }
            while (false);
            this._storeDouble((_31_ + 8), ((double) (ilogb((this._loadDouble(_31_))))));
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$154(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$155(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final float logbf(float _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((((__FLOAT_BITS$2e$156((this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)))) & 2147483647) & 4294967295L) >= (2139095040 & 4294967295L)) {
                        break label$2;
                    }
                    if ((this._loadFloat((_31_ + 8))) != 0.0f) {
                        break label$1;
                    }
                    this._storeFloat((_31_ + 12), (-1.0f / ((_30_ = this._loadFloat((_31_ + 8))) * _30_)));
                    break label$0;
                }
                while (false);
                this._storeFloat((_31_ + 12), ((_30_ = this._loadFloat((_31_ + 8))) * _30_));
                break label$0;
            }
            while (false);
            this._storeFloat((_31_ + 12), ((float) (ilogbf((this._loadFloat((_31_ + 8)))))));
        }
        while (false);
        _30_ = this._loadFloat((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }
}
