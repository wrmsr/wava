package com.wrmsr.wava;

abstract class sqlite3$2
        extends sqlite3$1
{
    protected sqlite3$2(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final int __isspace$2e$27(int _30_)
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
    public final int bcmp(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = memcmp((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final void bcopy(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        memmove((this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 12))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int bsearch(int _30_, int _31_, int _32_, int _33_, int _34_)
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
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt((_35_ + 16))) == 0) {
                            break label$3;
                        }
                        _34_ = this._storeInt((_35_ + 4), ((this._loadInt((_35_ + 20))) + ((this._loadInt((_35_ + 12))) * ((this._loadInt((_35_ + 16))) >>> 1))));
                        if ((this._storeInt(_35_, (this._iiiTable[this._tableIndices[this._loadInt((_35_ + 8))]].invoke((this._loadInt((_35_ + 24))), _34_)))) == 0) {
                            break label$1;
                        }
                        if ((this._loadInt((_35_ + 16))) == 1) {
                            break label$3;
                        }
                        label$4:
                        do {
                            if ((this._loadInt(_35_)) <= -1) {
                                break label$4;
                            }
                            this._storeInt((_35_ + 20), (this._loadInt((_35_ + 4))));
                            this._storeInt((_35_ + 16), ((_34_ = this._loadInt((_35_ + 16))) - (_34_ >>> 1)));
                            continue label$2;
                        }
                        while (false);
                        this._storeInt((_35_ + 16), ((this._loadInt((_35_ + 16))) >>> 1));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt((_35_ + 28), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_35_ + 28), (this._loadInt((_35_ + 4))));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 28));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final void bzero(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        memset((this._loadInt((_32_ + 12))), 0, _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int calloc(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 4), _31_)) == 0) {
                    break label$1;
                }
                if (((this._loadInt((_32_ + 8))) & 4294967295L) <= ((-1 / (this._loadInt((_32_ + 4)))) & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((__errno_location()), 12);
                this._storeInt((_32_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), (__malloc0(((this._loadInt((_32_ + 4))) * (this._loadInt((_32_ + 8)))))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final double cbrt(double _30_)
    {
        double _31_ = 0.0;
        int _32_ = 0;
        this._storeDouble(((_32_ = (this._loadInt((0 + 4))) - 64) + 40), (this._storeDouble((_32_ + 48), _30_)));
        label$0:
        do {
            if (((this._storeInt((_32_ + 4), ((int) ((this._loadLong32u((_32_ + 44))) & 2147483647L)))) & 4294967295L) < (2146435072 & 4294967295L)) {
                break label$0;
            }
            this._storeDouble((_32_ + 56), ((_30_ = this._loadDouble((_32_ + 48))) + _30_));
            return (this._loadDouble((_32_ + 56)));
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                label$3:
                do {
                    if (((this._loadInt((_32_ + 4))) & 4294967295L) > (1048575 & 4294967295L)) {
                        break label$3;
                    }
                    this._storeDouble((_32_ + 40), ((this._loadDouble((_32_ + 48))) * 1.8014398509481984E16));
                    if ((this._storeInt((_32_ + 4), ((int) ((this._loadLong32u((_32_ + 44))) & 2147483647L)))) == 0) {
                        break label$1;
                    }
                    this._storeInt((_32_ + 4), (((this._loadInt((_32_ + 4))) / 3) + 696219795));
                    break label$2;
                }
                while (false);
                this._storeInt((_32_ + 4), (((this._loadInt((_32_ + 4))) / 3) + 715094163));
            }
            while (false);
            this._storeLong((_32_ + 40), ((this._storeLong((_32_ + 40), ((this._loadLong((_32_ + 40))) & -9223372036854775808L))) | ((this._loadLong32u((_32_ + 4))) << 32L)));
            _30_ = this._storeDouble((_32_ + 32), (((_30_ = this._storeDouble((_32_ + 16), (this._loadDouble((_32_ + 40))))) * _30_) * (_30_ / (this._loadDouble((_32_ + 48))))));
            this._storeDouble((_32_ + 16), ((this._loadDouble((_32_ + 16))) * (((_30_ * ((_30_ * 1.6214297201053545) + -1.8849797954337717)) + 1.87595182427177) + ((_30_ * (_30_ * _30_)) * ((_30_ * 0.14599619288661245) + -0.758397934778766)))));
            this._storeDouble((_32_ + 40), (this._loadDouble((_32_ + 16))));
            this._storeLong((_32_ + 40), (((this._loadLong((_32_ + 40))) + 2147483648L) & -1073741824L));
            _30_ = this._storeDouble((_32_ + 24), ((_30_ = this._storeDouble((_32_ + 16), (this._loadDouble((_32_ + 40))))) * _30_));
            this._storeDouble((_32_ + 32), ((this._loadDouble((_32_ + 48))) / _30_));
            _30_ = this._storeDouble((_32_ + 8), ((_30_ = this._loadDouble((_32_ + 16))) + _30_));
            _30_ = this._storeDouble((_32_ + 32), (((_31_ = this._loadDouble((_32_ + 32))) - (this._loadDouble((_32_ + 16)))) / (_30_ + _31_)));
            this._storeDouble((_32_ + 16), ((_31_ = this._loadDouble((_32_ + 16))) + (_31_ * _30_)));
            this._storeDouble((_32_ + 56), (this._loadDouble((_32_ + 16))));
            return (this._loadDouble((_32_ + 56)));
        }
        while (false);
        this._storeDouble((_32_ + 56), (this._loadDouble((_32_ + 48))));
        return (this._loadDouble((_32_ + 56)));
    }

    @Override()
    public final float cbrtf(float _30_)
    {
        double _31_ = 0.0;
        double _32_ = 0.0;
        int _33_ = 0;
        this._storeFloat(((_33_ = (this._loadInt((0 + 4))) - 48) + 16), (this._storeFloat((_33_ + 40), _30_)));
        label$0:
        do {
            if (((this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 16))) & 2147483647))) & 4294967295L) < (2139095040 & 4294967295L)) {
                break label$0;
            }
            this._storeFloat((_33_ + 44), ((_30_ = this._loadFloat((_33_ + 40))) + _30_));
            return (this._loadFloat((_33_ + 44)));
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                label$3:
                do {
                    if (((this._loadInt((_33_ + 12))) & 4294967295L) > (8388607 & 4294967295L)) {
                        break label$3;
                    }
                    if ((this._loadInt((_33_ + 12))) == 0) {
                        break label$1;
                    }
                    this._storeFloat((_33_ + 16), ((this._loadFloat((_33_ + 40))) * 1.6777216E7f));
                    this._storeInt((_33_ + 12), (((this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 16))) & 2147483647))) / 3) + 642849266));
                    break label$2;
                }
                while (false);
                this._storeInt((_33_ + 12), (((this._loadInt((_33_ + 12))) / 3) + 709958130));
            }
            while (false);
            this._storeInt((_33_ + 16), ((this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) & -2147483648))) | (this._loadInt((_33_ + 12)))));
            _31_ = this._storeDouble((_33_ + 32), (((_31_ = this._storeDouble((_33_ + 24), ((double) (this._loadFloat((_33_ + 16)))))) * _31_) * _31_));
            this._storeDouble((_33_ + 24), (((this._loadDouble((_33_ + 24))) * (_31_ + ((_32_ = (double) (this._loadFloat((_33_ + 40)))) + _32_))) / (_31_ + (_32_ + _31_))));
            _31_ = this._storeDouble((_33_ + 32), (((_31_ = this._loadDouble((_33_ + 24))) * _31_) * _31_));
            this._storeDouble((_33_ + 24), (((this._loadDouble((_33_ + 24))) * (_31_ + ((_32_ = (double) (this._loadFloat((_33_ + 40)))) + _32_))) / (_31_ + (_32_ + _31_))));
            this._storeFloat((_33_ + 44), ((float) (this._loadDouble((_33_ + 24)))));
            return (this._loadFloat((_33_ + 44)));
        }
        while (false);
        this._storeFloat((_33_ + 44), (this._loadFloat((_33_ + 40))));
        return (this._loadFloat((_33_ + 44)));
    }

    @Override()
    public final void cbrtl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (cbrt((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final double ceil(double _30_)
    {
        int _31_ = 0;
        double _temp$0 = 0.0;
        double _temp$1 = 0.0;
        double _temp$2 = 0.0;
        this._storeDouble(((_31_ = (this._loadInt((0 + 4))) - 48) + 24), (this._storeDouble((_31_ + 32), _30_)));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_31_ + 20), ((int) (((this._loadLong((_31_ + 24))) >>> 52L) & 2047L)))) > 1074) {
                    break label$1;
                }
                if ((this._loadDouble((_31_ + 32))) != 0.0) {
                    break label$0;
                }
            }
            while (false);
            this._storeDouble((_31_ + 40), (this._loadDouble((_31_ + 32))));
            return (this._loadDouble((_31_ + 40)));
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                if (((this._loadLong((_31_ + 24))) >>> 63L) == 0) {
                    break label$3;
                }
                this._storeDouble((_31_ + 8), ((((_30_ = this._loadDouble((_31_ + 32))) - 4.503599627370496E15) + 4.503599627370496E15) - _30_));
                break label$2;
            }
            while (false);
            this._storeDouble((_31_ + 8), ((((_30_ = this._loadDouble((_31_ + 32))) + 4.503599627370496E15) - 4.503599627370496E15) - _30_));
        }
        while (false);
        label$4:
        do {
            if ((this._loadInt((_31_ + 20))) > 1022) {
                break label$4;
            }
            this._storeDouble(_31_, (this._loadDouble((_31_ + 8))));
            _temp$0 = -0.0;
            _temp$1 = 1.0;
            _temp$2 = (((this._loadLong((_31_ + 24))) >>> 63L) != 0L) ? _temp$0 : _temp$1;
            this._storeDouble((_31_ + 40), _temp$2);
            return (this._loadDouble((_31_ + 40)));
        }
        while (false);
        label$5:
        do {
            if (((((_30_ = this._loadDouble((_31_ + 8))) >= 0.0) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                break label$5;
            }
            this._storeDouble((_31_ + 40), (((this._loadDouble((_31_ + 32))) + (this._loadDouble((_31_ + 8)))) + 1.0));
            return (this._loadDouble((_31_ + 40)));
        }
        while (false);
        this._storeDouble((_31_ + 40), ((this._loadDouble((_31_ + 32))) + (this._loadDouble((_31_ + 8)))));
        return (this._loadDouble((_31_ + 40)));
    }

    @Override()
    public final float ceilf(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 32) + 16), (this._storeFloat((_31_ + 24), _30_)));
        label$0:
        do {
            if ((this._storeInt((_31_ + 12), ((((this._loadInt((_31_ + 16))) >>> 23) & 255) + -127))) < 23) {
                break label$0;
            }
            this._storeFloat((_31_ + 28), (this._loadFloat((_31_ + 24))));
            return (this._loadFloat((_31_ + 28)));
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                label$3:
                do {
                    label$4:
                    do {
                        if ((this._loadInt((_31_ + 12))) < 0) {
                            break label$4;
                        }
                        if (((this._storeInt((_31_ + 8), (8388607 >>> (this._loadInt((_31_ + 12)))))) & (this._loadInt((_31_ + 16)))) == 0) {
                            break label$3;
                        }
                        this._storeFloat((_31_ + 4), ((this._loadFloat((_31_ + 24))) + 1.329228E36f));
                        label$5:
                        do {
                            if (((this._loadInt((_31_ + 16))) >>> 31) != 0) {
                                break label$5;
                            }
                            this._storeInt((_31_ + 16), ((this._loadInt((_31_ + 16))) + (this._loadInt((_31_ + 8)))));
                        }
                        while (false);
                        this._storeInt((_31_ + 16), ((this._loadInt((_31_ + 16))) & ((this._loadInt((_31_ + 8))) ^ -1)));
                        break label$1;
                    }
                    while (false);
                    this._storeFloat(_31_, ((this._loadFloat((_31_ + 24))) + 1.329228E36f));
                    if (((this._loadInt((_31_ + 16))) >>> 31) == 0) {
                        break label$2;
                    }
                    this._storeInt((_31_ + 16), -2147483648);
                    break label$1;
                }
                while (false);
                this._storeFloat((_31_ + 28), (this._loadFloat((_31_ + 24))));
                return (this._loadFloat((_31_ + 28)));
            }
            while (false);
            if (((this._loadInt((_31_ + 16))) << 1) == 0) {
                break label$1;
            }
            this._storeInt((_31_ + 16), 1065353216);
        }
        while (false);
        this._storeFloat((_31_ + 28), (this._loadFloat((_31_ + 16))));
        return (this._loadFloat((_31_ + 28)));
    }

    @Override()
    public final void ceill(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (Math.ceil((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int chdir(int _30_)
    {
        int _31_ = 0;
        _30_ = __syscall_ret((this.__syscall1.invoke(12, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int chown(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = __syscall_ret((this.__syscall3.invoke(182, (this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_)));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int clearenv()
    {
        return (this._storeInt((this._loadInt((0 + 3912))), 0));
    }

    @Override()
    public final void clearerr(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _32_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 76))) < 0) {
                break label$0;
            }
            _32_ = this.__lockfile.invoke((this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt((_31_ + 8), _32_);
        this._storeInt((_30_ = this._loadInt((_31_ + 12))), ((this._loadInt(_30_)) & -49));
        label$1:
        do {
            if (_32_ == 0) {
                break label$1;
            }
            this.__unlockfile.invoke((this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int close(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this.__syscall_cp.invoke(6, (this._storeInt((_31_ + 12), (dummy((this._storeInt((_31_ + 12), _30_)))))), 0, 0, 0, 0, 0)))) != -4) {
                break label$0;
            }
            this._storeInt((_31_ + 8), 0);
        }
        while (false);
        _30_ = __syscall_ret((this._loadInt((_31_ + 8))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final double copysign(double _30_, double _31_)
    {
        int _32_ = 0;
        this._storeDouble(((_32_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeDouble((_32_ + 16), _31_);
        this._storeDouble((_32_ + 8), (this._loadDouble((_32_ + 24))));
        this._storeDouble(_32_, (this._loadDouble((_32_ + 16))));
        this._storeLong((_32_ + 8), ((this._storeLong((_32_ + 8), ((this._loadLong((_32_ + 8))) & 9223372036854775807L))) | ((this._loadLong(_32_)) & -9223372036854775808L)));
        return (this._loadDouble((_32_ + 8)));
    }

    @Override()
    public final float copysignf(float _30_, float _31_)
    {
        int _32_ = 0;
        this._storeFloat(((_32_ = (this._loadInt((0 + 4))) - 32) + 28), _30_);
        this._storeFloat((_32_ + 24), _31_);
        this._storeFloat((_32_ + 16), (this._loadFloat((_32_ + 28))));
        this._storeFloat((_32_ + 8), (this._loadFloat((_32_ + 24))));
        this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) & 2147483647))) | ((this._loadInt((_32_ + 8))) & -2147483648)));
        return (this._loadFloat((_32_ + 16)));
    }

    @Override()
    public final void copysignl(int _30_, long _31_, long _32_, long _33_, long _34_)
    {
        int _35_ = 0;
        double _36_ = 0.0;
        this._storeLong(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), _31_);
        this._storeLong((_35_ + 40), _32_);
        this._storeLong((_35_ + 24), _34_);
        _36_ = this.__trunctfdf2.invoke((this._storeLong((_35_ + 16), _33_)), _34_);
        this.__extenddftf2.invoke(_35_, (Double.longBitsToDouble((((Double.doubleToRawLongBits((this.__trunctfdf2.invoke((this._loadLong((_35_ + 32))), (this._loadLong((_35_ + 40))))))) & 9223372036854775807L) | ((Double.doubleToRawLongBits(_36_)) & -9223372036854775808L)))));
        this._storeLong((_30_ + 8), (this._loadLong((_35_ + 8))));
        this._storeLong(_30_, (this._loadLong(_35_)));
        this._storeInt((0 + 4), (_35_ + 48));
        return;
    }

    @Override()
    public final double cos(double _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 16), (this._storeDouble((_31_ + 48), _30_)));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if (((this._storeInt((_31_ + 28), ((this._storeInt((_31_ + 28), (this._loadInt((_31_ + 20))))) & 2147483647))) & 4294967295L) > (1072243195 & 4294967295L)) {
                            break label$3;
                        }
                        if (((this._loadInt((_31_ + 28))) & 4294967295L) > (1044816029 & 4294967295L)) {
                            break label$2;
                        }
                        this._storeDouble((_31_ + 8), ((this._loadDouble((_31_ + 48))) + 1.3292279957849159E36));
                        this._storeLong((_31_ + 56), 4607182418800017408L);
                        break label$0;
                    }
                    while (false);
                    if (((this._loadInt((_31_ + 28))) & 4294967295L) < (2146435072 & 4294967295L)) {
                        break label$1;
                    }
                    this._storeDouble((_31_ + 56), ((_30_ = this._loadDouble((_31_ + 48))) - _30_));
                    break label$0;
                }
                while (false);
                this._storeDouble((_31_ + 56), (__cos((this._loadDouble((_31_ + 48))), 0.0)));
                break label$0;
            }
            while (false);
            label$4:
            do {
                label$5:
                do {
                    label$6:
                    do {
                        if ((_32_ = (this._storeInt((_31_ + 24), (__rem_pio2((this._loadDouble((_31_ + 48))), (_31_ + 32))))) & 3) == 2) {
                            break label$6;
                        }
                        if (_32_ == 1) {
                            break label$5;
                        }
                        if (_32_ != 0) {
                            break label$4;
                        }
                        this._storeDouble((_31_ + 56), (__cos((this._loadDouble((_31_ + 32))), (this._loadDouble((_31_ + 40))))));
                        break label$0;
                    }
                    while (false);
                    this._storeDouble((_31_ + 56), (-(__cos((this._loadDouble((_31_ + 32))), (this._loadDouble((_31_ + 40)))))));
                    break label$0;
                }
                while (false);
                this._storeDouble((_31_ + 56), (-(__sin((this._loadDouble((_31_ + 32))), (this._loadDouble((_31_ + 40))), 1))));
                break label$0;
            }
            while (false);
            this._storeDouble((_31_ + 56), (__sin((this._loadDouble((_31_ + 32))), (this._loadDouble((_31_ + 40))), 1)));
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 56));
        this._storeInt((0 + 4), (_31_ + 64));
        return _30_;
    }

    @Override()
    public final float cosf(float _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        double _33_ = 0.0;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 16), (this._storeFloat((_31_ + 40), _30_)));
        this._storeInt((_31_ + 20), ((this._storeInt((_31_ + 28), (this._loadInt((_31_ + 16))))) >>> 31));
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
                                                                            if (((this._storeInt((_31_ + 28), ((this._loadInt((_31_ + 28))) & 2147483647))) & 4294967295L) > (1061752794 & 4294967295L)) {
                                                                                break label$16;
                                                                            }
                                                                            if (((this._loadInt((_31_ + 28))) & 4294967295L) > (964689919 & 4294967295L)) {
                                                                                break label$15;
                                                                            }
                                                                            this._storeFloat((_31_ + 12), ((this._loadFloat((_31_ + 40))) + 1.329228E36f));
                                                                            this._storeInt((_31_ + 44), 1065353216);
                                                                            break label$0;
                                                                        }
                                                                        while (false);
                                                                        if (((this._loadInt((_31_ + 28))) & 4294967295L) > (1081824209 & 4294967295L)) {
                                                                            break label$14;
                                                                        }
                                                                        if (((this._loadInt((_31_ + 28))) & 4294967295L) < (1075235812 & 4294967295L)) {
                                                                            break label$13;
                                                                        }
                                                                        if ((this._loadInt((_31_ + 20))) == 0) {
                                                                            break label$9;
                                                                        }
                                                                        _33_ = ((double) (this._loadFloat((_31_ + 40)))) + 3.141592653589793;
                                                                        break label$8;
                                                                    }
                                                                    while (false);
                                                                    this._storeFloat((_31_ + 44), (__cosdf(((double) (this._loadFloat((_31_ + 40)))))));
                                                                    break label$0;
                                                                }
                                                                while (false);
                                                                if (((this._loadInt((_31_ + 28))) & 4294967295L) > (1088565717 & 4294967295L)) {
                                                                    break label$12;
                                                                }
                                                                if (((this._loadInt((_31_ + 28))) & 4294967295L) < (1085271520 & 4294967295L)) {
                                                                    break label$11;
                                                                }
                                                                if ((this._loadInt((_31_ + 20))) == 0) {
                                                                    break label$6;
                                                                }
                                                                _33_ = ((double) (this._loadFloat((_31_ + 40)))) + 6.283185307179586;
                                                                break label$5;
                                                            }
                                                            while (false);
                                                            if ((this._loadInt((_31_ + 20))) == 0) {
                                                                break label$7;
                                                            }
                                                            this._storeFloat((_31_ + 44), (__sindf((((double) (this._loadFloat((_31_ + 40)))) + 1.5707963267948966))));
                                                            break label$0;
                                                        }
                                                        while (false);
                                                        if (((this._loadInt((_31_ + 28))) & 4294967295L) < (2139095040 & 4294967295L)) {
                                                            break label$10;
                                                        }
                                                        this._storeFloat((_31_ + 44), ((_30_ = this._loadFloat((_31_ + 40))) - _30_));
                                                        break label$0;
                                                    }
                                                    while (false);
                                                    if ((this._loadInt((_31_ + 20))) == 0) {
                                                        break label$4;
                                                    }
                                                    this._storeFloat((_31_ + 44), (__sindf((-4.71238898038469 - ((double) (this._loadFloat((_31_ + 40))))))));
                                                    break label$0;
                                                }
                                                while (false);
                                                if ((_32_ = (this._storeInt((_31_ + 24), (__rem_pio2f((this._loadFloat((_31_ + 40))), (_31_ + 32))))) & 3) == 2) {
                                                    break label$3;
                                                }
                                                if (_32_ == 1) {
                                                    break label$2;
                                                }
                                                if (_32_ != 0) {
                                                    break label$1;
                                                }
                                                this._storeFloat((_31_ + 44), (__cosdf((this._loadDouble((_31_ + 32))))));
                                                break label$0;
                                            }
                                            while (false);
                                            _33_ = ((double) (this._loadFloat((_31_ + 40)))) + -3.141592653589793;
                                        }
                                        while (false);
                                        this._storeFloat((_31_ + 44), (-(__cosdf(_33_))));
                                        break label$0;
                                    }
                                    while (false);
                                    this._storeFloat((_31_ + 44), (__sindf((1.5707963267948966 - ((double) (this._loadFloat((_31_ + 40))))))));
                                    break label$0;
                                }
                                while (false);
                                _33_ = ((double) (this._loadFloat((_31_ + 40)))) + -6.283185307179586;
                            }
                            while (false);
                            this._storeFloat((_31_ + 44), (__cosdf(_33_)));
                            break label$0;
                        }
                        while (false);
                        this._storeFloat((_31_ + 44), (__sindf((((double) (this._loadFloat((_31_ + 40)))) + -4.71238898038469))));
                        break label$0;
                    }
                    while (false);
                    this._storeFloat((_31_ + 44), (-(__cosdf((this._loadDouble((_31_ + 32)))))));
                    break label$0;
                }
                while (false);
                this._storeFloat((_31_ + 44), (__sindf((-(this._loadDouble((_31_ + 32)))))));
                break label$0;
            }
            while (false);
            this._storeFloat((_31_ + 44), (__sindf((this._loadDouble((_31_ + 32))))));
        }
        while (false);
        _30_ = this._loadFloat((_31_ + 44));
        this._storeInt((0 + 4), (_31_ + 48));
        return _30_;
    }

    @Override()
    public final double cosh(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 24), (this._storeDouble((_31_ + 32), _30_)));
        this._storeLong((_31_ + 24), ((this._loadLong((_31_ + 24))) & 9223372036854775807L));
        this._storeDouble((_31_ + 32), (this._loadDouble((_31_ + 24))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if (((this._storeInt((_31_ + 20), (this._loadInt((_31_ + 28))))) & 4294967295L) > (1072049729 & 4294967295L)) {
                            break label$3;
                        }
                        if (((this._loadInt((_31_ + 20))) & 4294967295L) > (1045430271 & 4294967295L)) {
                            break label$2;
                        }
                        this._storeDouble(_31_, ((this._loadDouble((_31_ + 32))) + 1.3292279957849159E36));
                        this._storeLong((_31_ + 40), 4607182418800017408L);
                        break label$0;
                    }
                    while (false);
                    if (((this._loadInt((_31_ + 20))) & 4294967295L) > (1082535489 & 4294967295L)) {
                        break label$1;
                    }
                    this._storeDouble((_31_ + 40), (((_30_ = this._storeDouble((_31_ + 8), (exp((this._loadDouble((_31_ + 32))))))) + (1.0 / _30_)) * 0.5));
                    break label$0;
                }
                while (false);
                this._storeDouble((_31_ + 40), ((((_30_ = this._storeDouble((_31_ + 8), (expm1((this._loadDouble((_31_ + 32))))))) * _30_) / ((_30_ = _30_ + 1.0) + _30_)) + 1.0));
                break label$0;
            }
            while (false);
            this._storeDouble((_31_ + 40), (this._storeDouble((_31_ + 8), (__expo2((this._loadDouble((_31_ + 32))))))));
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 40));
        this._storeInt((0 + 4), (_31_ + 48));
        return _30_;
    }

    @Override()
    public final float coshf(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 16), (this._storeFloat((_31_ + 24), _30_)));
        this._storeInt((_31_ + 16), ((this._loadInt((_31_ + 16))) & 2147483647));
        this._storeFloat((_31_ + 24), (this._loadFloat((_31_ + 16))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if (((this._storeInt((_31_ + 12), (this._loadInt((_31_ + 16))))) & 4294967295L) > (1060205078 & 4294967295L)) {
                            break label$3;
                        }
                        if (((this._loadInt((_31_ + 12))) & 4294967295L) > (964689919 & 4294967295L)) {
                            break label$2;
                        }
                        this._storeFloat((_31_ + 4), ((this._loadFloat((_31_ + 24))) + 1.329228E36f));
                        this._storeInt((_31_ + 28), 1065353216);
                        break label$0;
                    }
                    while (false);
                    if (((this._loadInt((_31_ + 12))) & 4294967295L) > (1118925334 & 4294967295L)) {
                        break label$1;
                    }
                    this._storeFloat((_31_ + 28), (((_30_ = this._storeFloat((_31_ + 8), (expf((this._loadFloat((_31_ + 24))))))) + (1.0f / _30_)) * 0.5f));
                    break label$0;
                }
                while (false);
                this._storeFloat((_31_ + 28), ((((_30_ = this._storeFloat((_31_ + 8), (expm1f((this._loadFloat((_31_ + 24))))))) * _30_) / ((_30_ = _30_ + 1.0f) + _30_)) + 1.0f));
                break label$0;
            }
            while (false);
            this._storeFloat((_31_ + 28), (this._storeFloat((_31_ + 8), (__expo2f((this._loadFloat((_31_ + 24))))))));
        }
        while (false);
        _30_ = this._loadFloat((_31_ + 28));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final void coshl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (cosh((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void cosl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (cos((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int ctermid(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _32_ = 5104;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) == 0) {
                break label$0;
            }
            _32_ = strcpy((this._loadInt((_31_ + 12))), 5104);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return _32_;
    }

    @Override()
    public final void div(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _31_);
        this._storeInt((_33_ + 8), _32_);
        this._storeInt(_30_, ((_33_ = this._loadInt((_33_ + 12))) / _32_));
        this._storeInt((_30_ + 4), (_33_ % _32_));
        return;
    }

    @Override()
    public final int static_dl_iterate_phdr(int _30_, int _31_)
    {
        long _32_ = 0L;
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 240))) + 236), _30_);
        this._storeInt((_33_ + 232), _31_);
        _31_ = this._storeInt((_33_ + 164), (this._storeInt((_33_ + 216), (this._storeInt((_33_ + 220), 0)))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt(((this._loadInt((_31_ + 12956))) + ((this._loadInt((_33_ + 164))) << 2)))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if (((this._loadInt(((this._loadInt((_31_ + 12956))) + ((this._loadInt((_33_ + 164))) << 2)))) & 4294967295L) > (37 & 4294967295L)) {
                        break label$2;
                    }
                    this._storeInt((_33_ + ((this._loadInt((_30_ = (this._loadInt((_31_ + 12956))) + ((this._loadInt((_33_ + 164))) << 2)))) << 2)), (this._loadInt((_30_ + 4))));
                }
                while (false);
                this._storeInt((_33_ + 164), ((this._loadInt((_33_ + 164))) + 2));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((_33_ + 228), (this._loadInt((_33_ + 12))));
        this._storeInt((_33_ + 212), (this._loadInt((_33_ + 20))));
        label$4:
        do {
            label$3:
            while (true) {
                if ((this._loadInt((_33_ + 212))) == 0) {
                    break label$4;
                }
                label$5:
                do {
                    if ((this._loadInt((this._storeInt((_33_ + 224), (this._loadInt((_33_ + 228))))))) != 6) {
                        break label$5;
                    }
                    this._storeInt((_33_ + 216), ((this._loadInt((_33_ + 12))) - (this._loadInt(((this._loadInt((_33_ + 224))) + 8)))));
                }
                while (false);
                label$6:
                do {
                    if ((this._loadInt((this._loadInt((_33_ + 224))))) != 7) {
                        break label$6;
                    }
                    this._storeInt((_33_ + 220), (this._loadInt((_33_ + 224))));
                }
                while (false);
                this._storeInt((_33_ + 212), ((this._loadInt((_33_ + 212))) + -1));
                this._storeInt((_33_ + 228), ((this._loadInt((_33_ + 228))) + (this._loadInt((_33_ + 16)))));
                continue label$3;
            }
        }
        while (false);
        this._storeInt((_33_ + 172), 5120);
        this._storeInt((_33_ + 168), (this._loadInt((_33_ + 216))));
        this._storeInt((_33_ + 176), (this._loadInt((_33_ + 12))));
        this._storeInt16((_33_ + 180), (this._loadInt((_33_ + 20))));
        _32_ = this._storeLong((_33_ + 192), (this._storeLong((_33_ + 184), 0L)));
        label$7:
        do {
            label$8:
            do {
                if ((this._loadInt((_33_ + 220))) == 0) {
                    break label$8;
                }
                this._storeInt((_33_ + 200), 1);
                this._storeInt((_33_ + 204), ((this._loadInt((_33_ + 216))) + (this._loadInt(((this._loadInt((_33_ + 220))) + 8)))));
                break label$7;
            }
            while (false);
            this._storeLong((_33_ + 200), _32_);
        }
        while (false);
        _31_ = this._iiiiTable[this._tableIndices[this._loadInt((_33_ + 236))]].invoke((_33_ + 168), 40, (this._loadInt((_33_ + 232))));
        this._storeInt((0 + 4), (_33_ + 240));
        return _31_;
    }

    @Override()
    public final int stub_dladdr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        return 0;
    }

    @Override()
    public final int dlclose(int _30_)
    {
        int _31_ = 0;
        _30_ = this.__dl_invalid_handle.invoke((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int dlinfo(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this.__dl_invalid_handle.invoke((this._loadInt((_33_ + 24))))) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 28), -1);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt((_33_ + 20))) == 2) {
                    break label$2;
                }
                this._storeInt(_33_, (this._loadInt((_33_ + 20))));
                this.__dl_seterr.invoke(5136, _33_);
                this._storeInt((_33_ + 28), -1);
                break label$0;
            }
            while (false);
            this._storeInt((this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 24))));
            this._storeInt((_33_ + 28), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int stub_dlopen(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this.__dl_seterr.invoke(5168, 0);
        this._storeInt((0 + 4), (_32_ + 16));
        return 0;
    }

    @Override()
    public final int dlsym(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = stub_dlsym((this._loadInt((_32_ + 12))), _31_, 0);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final double erand48(int _30_)
    {
        int _31_ = 0;
        double _32_ = 0.0;
        this._storeLong((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))), (((__rand48_step((this._storeInt((_31_ + 12), _30_)), 4226)) << 4L) | 4607182418800017408L));
        _32_ = this._loadDouble(_31_);
        this._storeInt((0 + 4), (_31_ + 16));
        return (_32_ + -1.0);
    }

    @Override()
    public final double drand48()
    {
        return (erand48(4220));
    }

    @Override()
    public final int dup(int _30_)
    {
        int _31_ = 0;
        _30_ = __syscall_ret((this.__syscall1.invoke(41, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int dup2(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0$end:
        do {
            label$0:
            while (true) {
                if ((this._storeInt((_32_ + 4), (this.__syscall2.invoke(63, (this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))))))) == -16) {
                    continue label$0;
                }
                break label$0$end;
            }
        }
        while (false);
        _31_ = __syscall_ret((this._loadInt((_32_ + 4))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int __dup3(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_33_ + 24))) != (this._loadInt((_33_ + 20)))) {
                    break label$1;
                }
                this._storeInt((_33_ + 28), (__syscall_ret(-22)));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt8u((_33_ + 18))) & 8) == 0) {
                    break label$2;
                }
                label$3$end:
                do {
                    label$3:
                    while (true) {
                        if ((this._storeInt((_33_ + 12), (this.__syscall3.invoke(330, (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))))))) == -16) {
                            continue label$3;
                        }
                        break label$3$end;
                    }
                }
                while (false);
                if ((this._loadInt((_33_ + 12))) == -38) {
                    break label$2;
                }
                this._storeInt((_33_ + 28), (__syscall_ret((this._loadInt((_33_ + 12))))));
                break label$0;
            }
            while (false);
            label$5$end:
            do {
                label$5:
                while (true) {
                    if ((this._storeInt((_33_ + 12), (this.__syscall2.invoke(63, (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))))))) == -16) {
                        continue label$5;
                    }
                    break label$5$end;
                }
            }
            while (false);
            label$7:
            do {
                if (((this._loadInt8u((_33_ + 18))) & 8) == 0) {
                    break label$7;
                }
                this.__syscall3.invoke(55, (this._loadInt((_33_ + 20))), 2, 1);
            }
            while (false);
            this._storeInt((_33_ + 28), (__syscall_ret((this._loadInt((_33_ + 12))))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int ecvt(double _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeDouble(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 88), _30_);
        this._storeInt((_34_ + 84), _31_);
        this._storeInt((_34_ + 80), _32_);
        this._storeInt((_34_ + 76), _33_);
        label$0:
        do {
            if ((((this._loadInt((_34_ + 84))) + -1) & 4294967295L) < (16 & 4294967295L)) {
                break label$0;
            }
            this._storeInt((_34_ + 84), 15);
        }
        while (false);
        this._storeDouble((_34_ + 8), (this._loadDouble((_34_ + 88))));
        this._storeInt(_34_, ((this._loadInt((_34_ + 84))) + -1));
        this.sprintf.invoke((_34_ + 32), 5200, _34_);
        this._storeInt((_34_ + 28), (this._storeInt((this._loadInt((_34_ + 76))), (((this._loadInt8s((_34_ + 32))) == 45) ? 1 : 0))));
        this._storeInt((_34_ + 24), 0);
        label$2:
        do {
            label$1:
            while (true) {
                if ((this._loadInt8s(((_34_ + 32) + (this._loadInt((_34_ + 28)))))) == 101) {
                    break label$2;
                }
                this._storeInt8(((this._loadInt((_34_ + 24))) + 5205), (this._loadInt8u((_32_ = (_34_ + 32) + (_33_ = this._loadInt((_34_ + 28)))))));
                this._storeInt((_34_ + 28), (_33_ + 1));
                this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + (((this._loadInt8s(_32_)) != 46) ? 1 : 0)));
                continue label$1;
            }
        }
        while (false);
        this._storeInt8(((this._loadInt((_34_ + 24))) + 5205), 0);
        _33_ = atoi((((_34_ + 32) + (this._loadInt((_34_ + 28)))) + 1));
        this._storeInt((this._loadInt((_34_ + 80))), (_33_ + 1));
        this._storeInt((0 + 4), (_34_ + 96));
        return 5205;
    }

    @Override()
    public final double erf(double _30_)
    {
        int _31_ = 0;
        double _32_ = 0.0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 48), _30_);
        this._storeDouble(_31_, (this._loadDouble((_31_ + 48))));
        this._storeLong32((_31_ + 12), (this._loadLong32u((_31_ + 4))));
        this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 12))) >>> 31));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 12))) & 2147483647))) & 4294967295L) < (2146435072 & 4294967295L)) {
                    break label$1;
                }
                this._storeDouble((_31_ + 56), (((double) (1 - ((this._loadInt((_31_ + 8))) << 1))) + (1.0 / (this._loadDouble((_31_ + 48))))));
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
                            if (((this._loadInt((_31_ + 12))) & 4294967295L) > (1072365567 & 4294967295L)) {
                                break label$5;
                            }
                            if (((this._loadInt((_31_ + 12))) & 4294967295L) > (1043333119 & 4294967295L)) {
                                break label$4;
                            }
                            this._storeDouble((_31_ + 56), ((((_30_ = this._loadDouble((_31_ + 48))) * 8.0) + (_30_ * 1.0270333367641007)) * 0.125));
                            break label$0;
                        }
                        while (false);
                        if (((this._loadInt((_31_ + 12))) & 4294967295L) > (1075314687 & 4294967295L)) {
                            break label$3;
                        }
                        this._storeDouble((_31_ + 16), (1.0 - (erfc2((this._loadInt((_31_ + 12))), (this._loadDouble((_31_ + 48)))))));
                        break label$2;
                    }
                    while (false);
                    this._storeDouble((_31_ + 40), (((_30_ = this._storeDouble((_31_ + 24), ((_30_ = this._loadDouble((_31_ + 48))) * _30_))) * ((_30_ * ((_30_ * ((_30_ * -2.3763016656650163E-5) + -0.005770270296489442)) + -0.02848174957559851)) + -0.3250421072470015)) + 0.12837916709551256));
                    _30_ = this._storeDouble((_31_ + 32), (((_30_ = this._loadDouble((_31_ + 24))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * -3.960228278775368E-6) + 1.3249473800432164E-4)) + 0.005081306281875766)) + 0.0650222499887673)) + 0.39791722395915535)) + 1.0));
                    _30_ = this._storeDouble((_31_ + 16), ((this._loadDouble((_31_ + 40))) / _30_));
                    this._storeDouble((_31_ + 56), ((_32_ = this._loadDouble((_31_ + 48))) + (_32_ * _30_)));
                    break label$0;
                }
                while (false);
                this._storeLong((_31_ + 16), 4607182418800017408L);
            }
            while (false);
            label$6:
            do {
                label$7:
                do {
                    if ((this._loadInt((_31_ + 8))) == 0) {
                        break label$7;
                    }
                    _30_ = -(this._loadDouble((_31_ + 16)));
                    break label$6;
                }
                while (false);
                _30_ = this._loadDouble((_31_ + 16));
            }
            while (false);
            this._storeDouble((_31_ + 56), _30_);
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 56));
        this._storeInt((0 + 4), (_31_ + 64));
        return _30_;
    }

    @Override()
    public final double erfc2(int _30_, double _31_)
    {
        int _32_ = 0;
        double _33_ = 0.0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 52), _30_);
        this._storeDouble((_32_ + 40), _31_);
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt((_32_ + 52))) & 4294967295L) > (1072955391 & 4294967295L)) {
                    break label$1;
                }
                this._storeDouble((_32_ + 56), (erfc1((this._loadDouble((_32_ + 40))))));
                break label$0;
            }
            while (false);
            this._storeDouble((_32_ + 32), (1.0 / ((_31_ = this._storeDouble((_32_ + 40), (Math.abs((this._loadDouble((_32_ + 40))))))) * _31_)));
            label$2:
            do {
                label$3:
                do {
                    if (((this._loadInt((_32_ + 52))) & 4294967295L) > (1074191212 & 4294967295L)) {
                        break label$3;
                    }
                    this._storeDouble((_32_ + 24), (((_31_ = this._loadDouble((_32_ + 32))) * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * -9.814329344169145) + -81.2874355063066)) + -184.60509290671104)) + -162.39666946257347)) + -62.375332450326006)) + -10.558626225323291)) + -0.6938585727071818)) + -0.009864944034847148));
                    this._storeDouble((_32_ + 16), (((_31_ = this._loadDouble((_32_ + 32))) * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * -0.0604244152148581) + 6.570249770319282)) + 108.63500554177944)) + 429.00814002756783)) + 645.3872717332679)) + 434.56587747522923)) + 137.65775414351904)) + 19.651271667439257)) + 1.0));
                    break label$2;
                }
                while (false);
                this._storeDouble((_32_ + 24), (((_31_ = this._loadDouble((_32_ + 32))) * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * -483.5191916086514) + -1025.0951316110772)) + -637.5664433683896)) + -160.63638485582192)) + -17.757954917754752)) + -0.799283237680523)) + -0.0098649429247001));
                this._storeDouble((_32_ + 16), (((_31_ = this._loadDouble((_32_ + 32))) * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * -22.44095244658582) + 474.52854120695537)) + 2553.0504064331644)) + 3199.8582195085955)) + 1536.729586084437)) + 325.7925129965739)) + 30.33806074348246)) + 1.0));
            }
            while (false);
            this._storeDouble((_32_ + 8), (this._loadDouble((_32_ + 40))));
            this._storeDouble(_32_, (this._loadDouble((_32_ + 8))));
            this._storeLong(_32_, ((this._loadLong(_32_)) & -4294967296L));
            this._storeDouble((_32_ + 8), (this._loadDouble(_32_)));
            this._storeDouble((_32_ + 56), (((exp((-0.5625 - ((_31_ = this._loadDouble((_32_ + 8))) * _31_)))) * (exp(((((_31_ = this._loadDouble((_32_ + 8))) - (_33_ = this._loadDouble((_32_ + 40)))) * (_31_ + _33_)) + ((this._loadDouble((_32_ + 24))) / (this._loadDouble((_32_ + 16)))))))) / (this._loadDouble((_32_ + 40)))));
        }
        while (false);
        _31_ = this._loadDouble((_32_ + 56));
        this._storeInt((0 + 4), (_32_ + 64));
        return _31_;
    }

    @Override()
    public final double erfc1(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = (this._loadInt((0 + 4))) - 32) + 8), (((_30_ = this._storeDouble((_31_ + 16), ((Math.abs((this._storeDouble((_31_ + 24), _30_)))) - 1.0))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * -0.002166375594868791) + 0.035478304325618236)) + -0.11089469428239668)) + 0.31834661990116175)) + -0.3722078760357013)) + 0.41485611868374833)) + -0.0023621185607526594));
        _30_ = this._storeDouble(_31_, (((_30_ = this._loadDouble((_31_ + 16))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 0.011984499846799107) + 0.01363708391202905)) + 0.12617121980876164)) + 0.07182865441419627)) + 0.540397917702171)) + 0.10642088040084423)) + 1.0));
        return (0.15493708848953247 - ((this._loadDouble((_31_ + 8))) / _30_));
    }

    @Override()
    public final double erfc(double _30_)
    {
        int _31_ = 0;
        double _temp$0 = 0.0;
        double _temp$1 = 0.0;
        double _temp$2 = 0.0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 48), _30_);
        this._storeDouble(_31_, (this._loadDouble((_31_ + 48))));
        this._storeLong32((_31_ + 12), (this._loadLong32u((_31_ + 4))));
        this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 12))) >>> 31));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 12))) & 2147483647))) & 4294967295L) < (2146435072 & 4294967295L)) {
                    break label$1;
                }
                this._storeDouble((_31_ + 56), (((double) ((this._loadInt((_31_ + 8))) << 1)) + (1.0 / (this._loadDouble((_31_ + 48))))));
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
                                if (((this._loadInt((_31_ + 12))) & 4294967295L) > (1072365567 & 4294967295L)) {
                                    break label$6;
                                }
                                if (((this._loadInt((_31_ + 12))) & 4294967295L) > (1013972991 & 4294967295L)) {
                                    break label$5;
                                }
                                this._storeDouble((_31_ + 56), (1.0 - (this._loadDouble((_31_ + 48)))));
                                break label$0;
                            }
                            while (false);
                            if (((this._loadInt((_31_ + 12))) & 4294967295L) > (1077673983 & 4294967295L)) {
                                break label$4;
                            }
                            if ((this._loadInt((_31_ + 8))) == 0) {
                                break label$3;
                            }
                            this._storeDouble((_31_ + 56), (2.0 - (erfc2((this._loadInt((_31_ + 12))), (this._loadDouble((_31_ + 48)))))));
                            break label$0;
                        }
                        while (false);
                        this._storeDouble((_31_ + 40), (((_30_ = this._storeDouble((_31_ + 24), ((_30_ = this._loadDouble((_31_ + 48))) * _30_))) * ((_30_ * ((_30_ * ((_30_ * -2.3763016656650163E-5) + -0.005770270296489442)) + -0.02848174957559851)) + -0.3250421072470015)) + 0.12837916709551256));
                        _30_ = this._storeDouble((_31_ + 32), (((_30_ = this._loadDouble((_31_ + 24))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * -3.960228278775368E-6) + 1.3249473800432164E-4)) + 0.005081306281875766)) + 0.0650222499887673)) + 0.39791722395915535)) + 1.0));
                        this._storeDouble((_31_ + 16), ((this._loadDouble((_31_ + 40))) / _30_));
                        label$7:
                        do {
                            if ((this._loadInt((_31_ + 8))) != 0) {
                                break label$7;
                            }
                            if (((this._loadInt((_31_ + 12))) & 4294967295L) > (1070596095 & 4294967295L)) {
                                break label$2;
                            }
                        }
                        while (false);
                        this._storeDouble((_31_ + 56), (1.0 - ((_30_ = this._loadDouble((_31_ + 48))) + (_30_ * (this._loadDouble((_31_ + 16)))))));
                        break label$0;
                    }
                    while (false);
                    _temp$0 = 2.0;
                    _temp$1 = 0.0;
                    _temp$2 = ((this._loadInt((_31_ + 8))) != 0) ? _temp$0 : _temp$1;
                    this._storeDouble((_31_ + 56), _temp$2);
                    break label$0;
                }
                while (false);
                this._storeDouble((_31_ + 56), (erfc2((this._loadInt((_31_ + 12))), (this._loadDouble((_31_ + 48))))));
                break label$0;
            }
            while (false);
            this._storeDouble((_31_ + 56), (0.5 - (((_30_ = this._loadDouble((_31_ + 48))) - 0.5) + (_30_ * (this._loadDouble((_31_ + 16)))))));
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 56));
        this._storeInt((0 + 4), (_31_ + 64));
        return _30_;
    }

    @Override()
    public final float erff(float _30_)
    {
        int _31_ = 0;
        float _32_ = 0.0f;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeFloat((_31_ + 8), (this._loadFloat((_31_ + 40))));
        this._storeInt((_31_ + 20), (this._loadInt((_31_ + 8))));
        this._storeInt((_31_ + 16), ((this._loadInt((_31_ + 20))) >>> 31));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_31_ + 20), ((this._loadInt((_31_ + 20))) & 2147483647))) & 4294967295L) < (2139095040 & 4294967295L)) {
                    break label$1;
                }
                this._storeFloat((_31_ + 44), (((float) (1 - ((this._loadInt((_31_ + 16))) << 1))) + (1.0f / (this._loadFloat((_31_ + 40))))));
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
                            if (((this._loadInt((_31_ + 20))) & 4294967295L) > (1062731775 & 4294967295L)) {
                                break label$5;
                            }
                            if (((this._loadInt((_31_ + 20))) & 4294967295L) > (830472191 & 4294967295L)) {
                                break label$4;
                            }
                            this._storeFloat((_31_ + 44), ((((_30_ = this._loadFloat((_31_ + 40))) * 8.0f) + (_30_ * 1.0270333f)) * 0.125f));
                            break label$0;
                        }
                        while (false);
                        if (((this._loadInt((_31_ + 20))) & 4294967295L) > (1086324735 & 4294967295L)) {
                            break label$3;
                        }
                        this._storeFloat((_31_ + 24), (1.0f - (erfc2$2e$35((this._loadInt((_31_ + 20))), (this._loadFloat((_31_ + 40)))))));
                        break label$2;
                    }
                    while (false);
                    this._storeFloat((_31_ + 36), (((_30_ = this._storeFloat((_31_ + 28), ((_30_ = this._loadFloat((_31_ + 40))) * _30_))) * ((_30_ * ((_30_ * ((_30_ * -2.3763017E-5f) + -0.0057702702f)) + -0.02848175f)) + -0.3250421f)) + 0.12837917f));
                    _30_ = this._storeFloat((_31_ + 32), (((_30_ = this._loadFloat((_31_ + 28))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * -3.9602282E-6f) + 1.3249474E-4f)) + 0.005081306f)) + 0.06502225f)) + 0.3979172f)) + 1.0f));
                    _30_ = this._storeFloat((_31_ + 24), ((this._loadFloat((_31_ + 36))) / _30_));
                    this._storeFloat((_31_ + 44), ((_32_ = this._loadFloat((_31_ + 40))) + (_32_ * _30_)));
                    break label$0;
                }
                while (false);
                this._storeInt((_31_ + 24), 1065353216);
            }
            while (false);
            label$6:
            do {
                label$7:
                do {
                    if ((this._loadInt((_31_ + 16))) == 0) {
                        break label$7;
                    }
                    _30_ = -(this._loadFloat((_31_ + 24)));
                    break label$6;
                }
                while (false);
                _30_ = this._loadFloat((_31_ + 24));
            }
            while (false);
            this._storeFloat((_31_ + 44), _30_);
        }
        while (false);
        _30_ = this._loadFloat((_31_ + 44));
        this._storeInt((0 + 4), (_31_ + 48));
        return _30_;
    }

    @Override()
    public final float erfc2$2e$35(int _30_, float _31_)
    {
        int _32_ = 0;
        float _33_ = 0.0f;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeFloat((_32_ + 36), _31_);
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt((_32_ + 40))) & 4294967295L) > (1067450367 & 4294967295L)) {
                    break label$1;
                }
                this._storeFloat((_32_ + 44), (erfc1$2e$36((this._loadFloat((_32_ + 36))))));
                break label$0;
            }
            while (false);
            this._storeFloat((_32_ + 32), (1.0f / ((_31_ = this._storeFloat((_32_ + 36), (Math.abs((this._loadFloat((_32_ + 36))))))) * _31_)));
            label$2:
            do {
                label$3:
                do {
                    if (((this._loadInt((_32_ + 40))) & 4294967295L) > (1077336940 & 4294967295L)) {
                        break label$3;
                    }
                    this._storeFloat((_32_ + 28), (((_31_ = this._loadFloat((_32_ + 32))) * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * -9.814329f) + -81.28744f)) + -184.60509f)) + -162.39667f)) + -62.37533f)) + -10.558626f)) + -0.69385856f)) + -0.009864944f));
                    this._storeFloat((_32_ + 24), (((_31_ = this._loadFloat((_32_ + 32))) * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * -0.060424414f) + 6.5702496f)) + 108.635f)) + 429.00815f)) + 645.38727f)) + 434.5659f)) + 137.65776f)) + 19.651272f)) + 1.0f));
                    break label$2;
                }
                while (false);
                this._storeFloat((_32_ + 28), (((_31_ = this._loadFloat((_32_ + 32))) * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * -483.5192f) + -1025.0951f)) + -637.56647f)) + -160.63638f)) + -17.757956f)) + -0.79928327f)) + -0.009864943f));
                this._storeFloat((_32_ + 24), (((_31_ = this._loadFloat((_32_ + 32))) * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * -22.440952f) + 474.52853f)) + 2553.0503f)) + 3199.8582f)) + 1536.7296f)) + 325.7925f)) + 30.33806f)) + 1.0f));
            }
            while (false);
            this._storeFloat((_32_ + 16), (this._loadFloat((_32_ + 36))));
            this._storeInt((_32_ + 8), ((this._storeInt((_32_ + 40), (this._loadInt((_32_ + 16))))) & -8192));
            this._storeFloat((_32_ + 44), (((expf((-0.5625f - ((_31_ = this._storeFloat((_32_ + 20), (this._loadFloat((_32_ + 8))))) * _31_)))) * (expf(((((_31_ = this._loadFloat((_32_ + 20))) - (_33_ = this._loadFloat((_32_ + 36)))) * (_31_ + _33_)) + ((this._loadFloat((_32_ + 28))) / (this._loadFloat((_32_ + 24)))))))) / (this._loadFloat((_32_ + 36)))));
        }
        while (false);
        _31_ = this._loadFloat((_32_ + 44));
        this._storeInt((0 + 4), (_32_ + 48));
        return _31_;
    }

    @Override()
    public final float erfc1$2e$36(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 4), (((_30_ = this._storeFloat((_31_ + 8), ((Math.abs((this._storeFloat((_31_ + 12), _30_)))) - 1.0f))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * -0.0021663755f) + 0.035478305f)) + -0.110894695f)) + 0.31834662f)) + -0.37220788f)) + 0.4148561f)) + -0.0023621186f));
        _30_ = this._storeFloat(_31_, (((_30_ = this._loadFloat((_31_ + 8))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 0.0119845f) + 0.013637084f)) + 0.12617122f)) + 0.071828656f)) + 0.54039794f)) + 0.10642088f)) + 1.0f));
        return (0.15493709f - ((this._loadFloat((_31_ + 4))) / _30_));
    }

    @Override()
    public final float erfcf(float _30_)
    {
        int _31_ = 0;
        float _temp$0 = 0.0f;
        float _temp$1 = 0.0f;
        float _temp$2 = 0.0f;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeFloat((_31_ + 8), (this._loadFloat((_31_ + 40))));
        this._storeInt((_31_ + 20), (this._loadInt((_31_ + 8))));
        this._storeInt((_31_ + 16), ((this._loadInt((_31_ + 20))) >>> 31));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_31_ + 20), ((this._loadInt((_31_ + 20))) & 2147483647))) & 4294967295L) < (2139095040 & 4294967295L)) {
                    break label$1;
                }
                this._storeFloat((_31_ + 44), (((float) ((this._loadInt((_31_ + 16))) << 1)) + (1.0f / (this._loadFloat((_31_ + 40))))));
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
                                if (((this._loadInt((_31_ + 20))) & 4294967295L) > (1062731775 & 4294967295L)) {
                                    break label$6;
                                }
                                if (((this._loadInt((_31_ + 20))) & 4294967295L) > (595591167 & 4294967295L)) {
                                    break label$5;
                                }
                                this._storeFloat((_31_ + 44), (1.0f - (this._loadFloat((_31_ + 40)))));
                                break label$0;
                            }
                            while (false);
                            if (((this._loadInt((_31_ + 20))) & 4294967295L) > (1105199103 & 4294967295L)) {
                                break label$4;
                            }
                            if ((this._loadInt((_31_ + 16))) == 0) {
                                break label$3;
                            }
                            this._storeFloat((_31_ + 44), (2.0f - (erfc2$2e$35((this._loadInt((_31_ + 20))), (this._loadFloat((_31_ + 40)))))));
                            break label$0;
                        }
                        while (false);
                        this._storeFloat((_31_ + 36), (((_30_ = this._storeFloat((_31_ + 28), ((_30_ = this._loadFloat((_31_ + 40))) * _30_))) * ((_30_ * ((_30_ * ((_30_ * -2.3763017E-5f) + -0.0057702702f)) + -0.02848175f)) + -0.3250421f)) + 0.12837917f));
                        _30_ = this._storeFloat((_31_ + 32), (((_30_ = this._loadFloat((_31_ + 28))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * -3.9602282E-6f) + 1.3249474E-4f)) + 0.005081306f)) + 0.06502225f)) + 0.3979172f)) + 1.0f));
                        this._storeFloat((_31_ + 24), ((this._loadFloat((_31_ + 36))) / _30_));
                        label$7:
                        do {
                            if ((this._loadInt((_31_ + 16))) != 0) {
                                break label$7;
                            }
                            if (((this._loadInt((_31_ + 20))) & 4294967295L) > (1048575999 & 4294967295L)) {
                                break label$2;
                            }
                        }
                        while (false);
                        this._storeFloat((_31_ + 44), (1.0f - ((_30_ = this._loadFloat((_31_ + 40))) + (_30_ * (this._loadFloat((_31_ + 24)))))));
                        break label$0;
                    }
                    while (false);
                    _temp$0 = 2.0f;
                    _temp$1 = 0.0f;
                    _temp$2 = ((this._loadInt((_31_ + 16))) != 0) ? _temp$0 : _temp$1;
                    this._storeFloat((_31_ + 44), _temp$2);
                    break label$0;
                }
                while (false);
                this._storeFloat((_31_ + 44), (erfc2$2e$35((this._loadInt((_31_ + 20))), (this._loadFloat((_31_ + 40))))));
                break label$0;
            }
            while (false);
            this._storeFloat((_31_ + 44), (0.5f - (((_30_ = this._loadFloat((_31_ + 40))) - 0.5f) + (_30_ * (this._loadFloat((_31_ + 24)))))));
        }
        while (false);
        _30_ = this._loadFloat((_31_ + 44));
        this._storeInt((0 + 4), (_31_ + 48));
        return _30_;
    }

    @Override()
    public final void erfl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (erf((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void erfcl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (erfc((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final double exp(double _30_)
    {
        int _31_ = 0;
        long _32_ = 0L;
        int _33_ = 0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 16), (this._storeDouble((_31_ + 80), _30_)));
        this._storeLong32((_31_ + 28), ((_32_ = this._loadLong((_31_ + 16))) >>> 32L));
        this._storeLong32((_31_ + 32), (_32_ >>> 63L));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_31_ + 28), ((this._loadInt((_31_ + 28))) & 2147483647))) & 4294967295L) < (1082532651 & 4294967295L)) {
                    break label$1;
                }
                label$2:
                do {
                    if ((((__DOUBLE_BITS$2e$40((this._loadDouble((_31_ + 80))))) & 9223372036854775807L) & 4294967295L) < (9218868437227405313L & 4294967295L)) {
                        break label$2;
                    }
                    this._storeDouble((_31_ + 88), (this._loadDouble((_31_ + 80))));
                    break label$0;
                }
                while (false);
                label$3:
                do {
                    if (((((_30_ = this._loadDouble((_31_ + 80))) <= 709.782712893384) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                        break label$3;
                    }
                    this._storeDouble((_31_ + 88), (this._storeDouble((_31_ + 80), ((this._loadDouble((_31_ + 80))) * 8.98846567431158E307))));
                    break label$0;
                }
                while (false);
                if (((((_30_ = this._loadDouble((_31_ + 80))) >= -708.3964185322641) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                    break label$1;
                }
                this._storeFloat((_31_ + 12), ((float) (-1.401298464324817E-45 / (this._loadDouble((_31_ + 80))))));
                if (((((_30_ = this._loadDouble((_31_ + 80))) >= -745.1332191019411) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                    break label$1;
                }
                this._storeLong((_31_ + 88), 0L);
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
                                if (((this._loadInt((_31_ + 28))) & 4294967295L) < (1071001155 & 4294967295L)) {
                                    break label$8;
                                }
                                if (((this._loadInt((_31_ + 28))) & 4294967295L) < (1072734898 & 4294967295L)) {
                                    break label$7;
                                }
                                this._storeInt((_31_ + 36), (_truncateDoubleToSignedInteger((((this._loadDouble((_31_ + 80))) * 1.4426950408889634) + (this._loadDouble((((this._loadInt((_31_ + 32))) << 3) + 5232)))))));
                                break label$6;
                            }
                            while (false);
                            if (((this._loadInt((_31_ + 28))) & 4294967295L) < (1043333121 & 4294967295L)) {
                                break label$4;
                            }
                            this._storeInt((_31_ + 36), 0);
                            this._storeDouble((_31_ + 72), (this._loadDouble((_31_ + 80))));
                            this._storeLong((_31_ + 64), 0L);
                            break label$5;
                        }
                        while (false);
                        this._storeInt((_31_ + 36), ((1 - (_33_ = this._loadInt((_31_ + 32)))) - _33_));
                    }
                    while (false);
                    this._storeDouble((_31_ + 72), ((this._loadDouble((_31_ + 80))) + (((double) (this._loadInt((_31_ + 36)))) * -0.6931471803691238)));
                    _30_ = this._storeDouble((_31_ + 64), (((double) (this._loadInt((_31_ + 36)))) * 1.9082149292705877E-10));
                    this._storeDouble((_31_ + 80), ((this._loadDouble((_31_ + 72))) - _30_));
                }
                while (false);
                _30_ = this._storeDouble((_31_ + 48), ((_30_ = this._loadDouble((_31_ + 80))) * _30_));
                this._storeDouble((_31_ + 40), ((((((_30_ = this._storeDouble((_31_ + 56), ((this._loadDouble((_31_ + 80))) - (_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 4.1381367970572385E-8) + -1.6533902205465252E-6)) + 6.613756321437934E-5)) + -0.0027777777777015593)) + 0.16666666666666602))))) * (this._loadDouble((_31_ + 80)))) / (2.0 - _30_)) - (this._loadDouble((_31_ + 64)))) + (this._loadDouble((_31_ + 72)))) + 1.0));
                label$9:
                do {
                    if ((this._loadInt((_31_ + 36))) == 0) {
                        break label$9;
                    }
                    this._storeDouble((_31_ + 88), (scalbn((this._loadDouble((_31_ + 40))), (this._loadInt((_31_ + 36))))));
                    break label$0;
                }
                while (false);
                this._storeDouble((_31_ + 88), (this._loadDouble((_31_ + 40))));
                break label$0;
            }
            while (false);
            this._storeDouble(_31_, ((this._loadDouble((_31_ + 80))) + 8.98846567431158E307));
            this._storeDouble((_31_ + 88), ((this._loadDouble((_31_ + 80))) + 1.0));
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 88));
        this._storeInt((0 + 4), (_31_ + 96));
        return _30_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$39(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$40(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final double exp10(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 16), (modf((this._storeDouble((_31_ + 32), _30_)), (_31_ + 24))));
        this._storeDouble((_31_ + 8), (this._loadDouble((_31_ + 24))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((((this._loadLong((_31_ + 8))) >>> 52L) & 2047L) & 4294967295L) > (1026L & 4294967295L)) {
                        break label$2;
                    }
                    if ((this._loadDouble((_31_ + 16))) == 0.0) {
                        break label$1;
                    }
                    this._storeDouble((_31_ + 40), ((this._storeDouble((_31_ + 16), (exp2(((this._loadDouble((_31_ + 16))) * 3.321928094887362))))) * (this._loadDouble((((_truncateDoubleToSignedInteger((this._loadDouble((_31_ + 24))))) << 3) + 5368)))));
                    break label$0;
                }
                while (false);
                this._storeDouble((_31_ + 40), (pow(10.0, (this._loadDouble((_31_ + 32))))));
                break label$0;
            }
            while (false);
            this._storeDouble((_31_ + 40), (this._loadDouble((((_truncateDoubleToSignedInteger((this._loadDouble((_31_ + 24))))) << 3) + 5368))));
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 40));
        this._storeInt((0 + 4), (_31_ + 48));
        return _30_;
    }

    @Override()
    public final float exp10f(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 16), (modff((this._storeFloat((_31_ + 24), _30_)), (_31_ + 20))));
        this._storeFloat((_31_ + 8), (this._loadFloat((_31_ + 20))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((((this._loadInt((_31_ + 8))) >>> 23) & 255) & 4294967295L) > (129 & 4294967295L)) {
                        break label$2;
                    }
                    if ((this._loadFloat((_31_ + 16))) == 0.0f) {
                        break label$1;
                    }
                    this._storeFloat((_31_ + 28), ((this._storeFloat((_31_ + 16), (exp2f(((this._loadFloat((_31_ + 16))) * 3.321928f))))) * (this._loadFloat((((_truncateFloatToSignedInteger((this._loadFloat((_31_ + 20))))) << 2) + 5532)))));
                    break label$0;
                }
                while (false);
                this._storeFloat((_31_ + 28), ((float) (exp2((((double) (this._loadFloat((_31_ + 24)))) * 3.321928094887362)))));
                break label$0;
            }
            while (false);
            this._storeFloat((_31_ + 28), (this._loadFloat((((_truncateFloatToSignedInteger((this._loadFloat((_31_ + 20))))) << 2) + 5532))));
        }
        while (false);
        _30_ = this._loadFloat((_31_ + 28));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final void exp10l(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (exp10((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final double exp2(double _30_)
    {
        int _31_ = 0;
        double _32_ = 0.0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 24), (this._storeDouble((_31_ + 64), _30_)));
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
                            if (((this._storeInt((_31_ + 36), ((int) ((this._loadLong32u((_31_ + 28))) & 2147483647L)))) & 4294967295L) < (1083174912 & 4294967295L)) {
                                break label$4;
                            }
                            label$5:
                            do {
                                if (((this._loadInt((_31_ + 36))) & 4294967295L) < (1083179008 & 4294967295L)) {
                                    break label$5;
                                }
                                if (((this._loadLong((_31_ + 24))) >>> 63L) == 0L) {
                                    break label$1;
                                }
                            }
                            while (false);
                            if (((this._loadInt((_31_ + 36))) & 4294967295L) < (2146435072 & 4294967295L)) {
                                break label$3;
                            }
                            this._storeDouble((_31_ + 72), (-1.0 / (this._loadDouble((_31_ + 64)))));
                            break label$0;
                        }
                        while (false);
                        if (((this._loadInt((_31_ + 36))) & 4294967295L) > (1016070143 & 4294967295L)) {
                            break label$2;
                        }
                        this._storeDouble((_31_ + 72), ((this._loadDouble((_31_ + 64))) + 1.0));
                        break label$0;
                    }
                    while (false);
                    if (((this._loadLong((_31_ + 24))) >>> 63L) == 0) {
                        break label$2;
                    }
                    label$6:
                    do {
                        label$7:
                        do {
                            if ((this._loadDouble((_31_ + 64))) <= -1075.0) {
                                break label$7;
                            }
                            if ((((_30_ = this._loadDouble((_31_ + 64))) - 4.503599627370496E15) + 4.503599627370496E15) == _30_) {
                                break label$6;
                            }
                        }
                        while (false);
                        this._storeFloat((_31_ + 12), ((float) (-1.401298464324817E-45 / (this._loadDouble((_31_ + 64))))));
                    }
                    while (false);
                    if (((((_30_ = this._loadDouble((_31_ + 64))) > -1075.0) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                        break label$2;
                    }
                    this._storeLong((_31_ + 72), 0L);
                    break label$0;
                }
                while (false);
                this._storeDouble((_31_ + 24), ((this._loadDouble((_31_ + 64))) + 2.6388279066624E13));
                this._storeInt((_31_ + 16), ((this._storeInt((_31_ + 16), ((this._storeInt((_31_ + 32), ((this._storeInt((_31_ + 32), (this._loadInt((_31_ + 24))))) + 128))) & -256))) / 256));
                this._storeInt((_31_ + 32), (this._loadInt8u((_31_ + 32))));
                _30_ = this._storeDouble((_31_ + 24), ((this._loadDouble((_31_ + 24))) - 2.6388279066624E13));
                this._storeDouble((_31_ + 40), ((this._loadDouble((_31_ + 64))) - _30_));
                this._storeDouble((_31_ + 48), (this._loadDouble((((this._loadInt((_31_ + 32))) << 4) + 5568))));
                _30_ = this._storeDouble((_31_ + 40), ((this._loadDouble((_31_ + 40))) - (this._loadDouble((((this._loadInt((_31_ + 32))) << 4) + 5576)))));
                this._storeDouble((_31_ + 72), (scalbn((this._storeDouble((_31_ + 56), ((_32_ = this._loadDouble((_31_ + 48))) + ((_32_ * _30_) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 0.0013333559164630223) + 0.009618129842126066)) + 0.0555041086648214)) + 0.2402265069591)) + 0.6931471805599453))))), (this._loadInt((_31_ + 16))))));
                break label$0;
            }
            while (false);
            this._storeDouble((_31_ + 72), (this._storeDouble((_31_ + 64), ((this._loadDouble((_31_ + 64))) * 8.98846567431158E307))));
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 72));
        this._storeInt((0 + 4), (_31_ + 80));
        return _30_;
    }

    @Override()
    public final float exp2f(float _30_)
    {
        double _31_ = 0.0;
        double _32_ = 0.0;
        int _33_ = 0;
        this._storeFloat(((_33_ = (this._loadInt((0 + 4))) - 64) + 24), (this._storeFloat((_33_ + 56), _30_)));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 24))) & 2147483647))) & 4294967295L) < (1123811329 & 4294967295L)) {
                        break label$2;
                    }
                    if (((this._loadInt((_33_ + 24))) & 4294967295L) < (1124073472 & 4294967295L)) {
                        break label$1;
                    }
                    if ((this._loadInt((_33_ + 24))) < 0) {
                        break label$1;
                    }
                    this._storeFloat((_33_ + 60), (this._storeFloat((_33_ + 56), ((this._loadFloat((_33_ + 56))) * 1.7014118E38f))));
                    return (this._loadFloat((_33_ + 60)));
                }
                while (false);
                if (((this._loadInt((_33_ + 12))) & 4294967295L) > (855638016 & 4294967295L)) {
                    break label$0;
                }
                this._storeFloat((_33_ + 60), ((this._loadFloat((_33_ + 56))) + 1.0f));
                return (this._loadFloat((_33_ + 60)));
            }
            while (false);
            if ((this._loadInt((_33_ + 24))) > -1) {
                break label$0;
            }
            label$3:
            do {
                label$4:
                do {
                    if (((this._loadInt((_33_ + 24))) & 4294967295L) > (-1021968385 & 4294967295L)) {
                        break label$4;
                    }
                    if ((this._loadInt16u((_33_ + 24))) == 0) {
                        break label$3;
                    }
                }
                while (false);
                this._storeFloat(_33_, (-1.4E-45f / (this._loadFloat((_33_ + 56)))));
            }
            while (false);
            if (((this._loadInt((_33_ + 24))) & 4294967295L) < (-1021968384 & 4294967295L)) {
                break label$0;
            }
            this._storeInt((_33_ + 60), 0);
            return (this._loadFloat((_33_ + 60)));
        }
        while (false);
        this._storeFloat((_33_ + 24), ((this._loadFloat((_33_ + 56))) + 786432.0f));
        this._storeLong((_33_ + 16), ((((this._storeInt((_33_ + 4), ((this._storeInt((_33_ + 8), ((this._storeInt((_33_ + 8), (this._loadInt((_33_ + 24))))) + 8))) >>> 4))) + 1023) & 4294967295L) << 52L));
        this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) & 15));
        _30_ = this._storeFloat((_33_ + 24), ((this._loadFloat((_33_ + 24))) - 786432.0f));
        this._storeDouble((_33_ + 32), ((double) ((this._loadFloat((_33_ + 56))) - _30_)));
        _31_ = this._storeDouble((_33_ + 48), ((this._storeDouble((_33_ + 40), (this._loadDouble((((this._loadInt((_33_ + 8))) << 3) + 9664))))) * (this._loadDouble((_33_ + 32)))));
        this._storeFloat((_33_ + 60), ((float) ((this._storeDouble((_33_ + 40), (((this._loadDouble((_33_ + 40))) + (_31_ * (((_32_ = this._loadDouble((_33_ + 32))) * 0.24022650718688965) + 0.6931471824645996))) + ((_31_ * (_32_ * _32_)) * ((_32_ * 0.009618354961276054) + 0.055505409836769104))))) * (this._loadDouble((_33_ + 16))))));
        return (this._loadFloat((_33_ + 60)));
    }

    @Override()
    public final void exp2l(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (exp2((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int __expand_heap(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 20), (this._loadInt((this._storeInt((_31_ + 24), _30_)))))) & 4294967295L) < (2147479552 & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((__errno_location()), 12);
                this._storeInt((_31_ + 28), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 20), ((_30_ = this._loadInt((_31_ + 20))) + ((0 - _30_) & 4095)));
            label$2:
            do {
                if ((this._loadInt((0 + 9792))) != 0) {
                    break label$2;
                }
                this._storeInt((0 + 9792), ((_30_ = this._storeInt((0 + 9792), (this.__syscall1.invoke(45, 0)))) + ((0 - _30_) & 4095)));
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) >= (((this._loadInt((0 + 9792))) ^ -1) & 4294967295L)) {
                    break label$3;
                }
                if ((traverses_stack_p((_30_ = this._loadInt((0 + 9792))), (_30_ + (this._loadInt((_31_ + 20)))))) != 0) {
                    break label$3;
                }
                if ((this.__syscall1.invoke(45, ((this._loadInt((0 + 9792))) + (this._loadInt((_31_ + 20)))))) != ((this._loadInt((0 + 9792))) + (this._loadInt((_31_ + 20))))) {
                    break label$3;
                }
                this._storeInt((_31_ + 28), ((this._storeInt((0 + 9792), ((this._storeInt((this._loadInt((_31_ + 24))), (this._loadInt((_31_ + 20))))) + (this._loadInt((0 + 9792)))))) - (this._loadInt((_31_ + 20)))));
                break label$0;
            }
            while (false);
            _30_ = this._storeInt((_31_ + 16), (4096 << ((this._loadInt((0 + 9796))) >>> 1)));
            label$4:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) >= (_30_ & 4294967295L)) {
                    break label$4;
                }
                this._storeInt((_31_ + 20), (this._loadInt((_31_ + 16))));
            }
            while (false);
            label$5:
            do {
                if ((this._storeInt((_31_ + 12), (this.__mmap.invoke(0, (this._loadInt((_31_ + 20))), 3, 34, -1, 0L)))) == -1) {
                    break label$5;
                }
                this._storeInt((this._loadInt((_31_ + 24))), (this._loadInt((_31_ + 20))));
                this._storeInt((0 + 9796), ((this._loadInt((0 + 9796))) + 1));
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
    public final int traverses_stack_p(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 16), 8388608);
        _31_ = 0;
        label$0:
        do {
            if (((this._storeInt((_32_ + 8), (this._loadInt((0 + 12956))))) & 4294967295L) < (8388609 & 4294967295L)) {
                break label$0;
            }
            _31_ = (this._loadInt((_32_ + 8))) + -8388608;
        }
        while (false);
        this._storeInt((_32_ + 12), _31_);
        label$1:
        do {
            if (((this._loadInt((_32_ + 20))) & 4294967295L) <= (_31_ & 4294967295L)) {
                break label$1;
            }
            if (((this._loadInt((_32_ + 24))) & 4294967295L) >= ((this._loadInt((_32_ + 8))) & 4294967295L)) {
                break label$1;
            }
            this._storeInt((_32_ + 28), 1);
            return (this._loadInt((_32_ + 28)));
        }
        while (false);
        this._storeInt((_32_ + 8), (_32_ + 8));
        _31_ = 0;
        label$2:
        do {
            if (((_32_ + 8) & 4294967295L) < (8388609 & 4294967295L)) {
                break label$2;
            }
            _31_ = (this._loadInt((_32_ + 8))) + -8388608;
        }
        while (false);
        this._storeInt((_32_ + 12), _31_);
        label$3:
        do {
            if (((this._loadInt((_32_ + 20))) & 4294967295L) <= (_31_ & 4294967295L)) {
                break label$3;
            }
            if (((this._loadInt((_32_ + 24))) & 4294967295L) >= ((this._loadInt((_32_ + 8))) & 4294967295L)) {
                break label$3;
            }
            this._storeInt((_32_ + 28), 1);
            return (this._loadInt((_32_ + 28)));
        }
        while (false);
        this._storeInt((_32_ + 28), 0);
        return (this._loadInt((_32_ + 28)));
    }

    @Override()
    public final float expf(float _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeFloat(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 16), (this._storeFloat((_32_ + 56), _30_)));
        this._storeInt((_32_ + 28), ((this._storeInt((_32_ + 24), (this._loadInt((_32_ + 16))))) >>> 31));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) & 2147483647))) & 4294967295L) < (1118743632 & 4294967295L)) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if (((this._loadInt((_32_ + 24))) & 4294967295L) < (1118925336 & 4294967295L)) {
                            break label$3;
                        }
                        if ((this._loadInt((_32_ + 28))) == 0) {
                            break label$1;
                        }
                    }
                    while (false);
                    if ((this._loadInt((_32_ + 28))) == 0) {
                        break label$2;
                    }
                    this._storeFloat((_32_ + 12), (-1.4E-45f / (this._loadFloat((_32_ + 56)))));
                    if (((this._loadInt((_32_ + 24))) & 4294967295L) < (1120924085 & 4294967295L)) {
                        break label$2;
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
                            label$7:
                            do {
                                label$8:
                                do {
                                    if (((this._loadInt((_32_ + 24))) & 4294967295L) < (1051816473 & 4294967295L)) {
                                        break label$8;
                                    }
                                    if (((this._loadInt((_32_ + 24))) & 4294967295L) < (1065686419 & 4294967295L)) {
                                        break label$7;
                                    }
                                    this._storeInt((_32_ + 32), (_truncateFloatToSignedInteger((((this._loadFloat((_32_ + 56))) * 1.442695f) + (this._loadFloat((((this._loadInt((_32_ + 28))) << 2) + 9800)))))));
                                    break label$6;
                                }
                                while (false);
                                if (((this._loadInt((_32_ + 24))) & 4294967295L) < (956301313 & 4294967295L)) {
                                    break label$4;
                                }
                                _31_ = this._storeInt((_32_ + 32), 0);
                                this._storeFloat((_32_ + 52), (this._loadFloat((_32_ + 56))));
                                this._storeInt((_32_ + 48), _31_);
                                break label$5;
                            }
                            while (false);
                            this._storeInt((_32_ + 32), ((1 - (_31_ = this._loadInt((_32_ + 28)))) - _31_));
                        }
                        while (false);
                        this._storeFloat((_32_ + 52), ((this._loadFloat((_32_ + 56))) + (((float) (this._loadInt((_32_ + 32)))) * -0.69314575f)));
                        _30_ = this._storeFloat((_32_ + 48), (((float) (this._loadInt((_32_ + 32)))) * 1.4286068E-6f));
                        this._storeFloat((_32_ + 56), ((this._loadFloat((_32_ + 52))) - _30_));
                    }
                    while (false);
                    _30_ = this._storeFloat((_32_ + 40), ((_30_ = this._loadFloat((_32_ + 56))) * _30_));
                    this._storeFloat((_32_ + 36), ((((((_30_ = this._storeFloat((_32_ + 44), ((this._loadFloat((_32_ + 56))) - (_30_ * ((_30_ * -0.0027667333f) + 0.16666625f))))) * (this._loadFloat((_32_ + 56)))) / (2.0f - _30_)) - (this._loadFloat((_32_ + 48)))) + (this._loadFloat((_32_ + 52)))) + 1.0f));
                    label$9:
                    do {
                        if ((this._loadInt((_32_ + 32))) == 0) {
                            break label$9;
                        }
                        this._storeFloat((_32_ + 60), (scalbnf((this._loadFloat((_32_ + 36))), (this._loadInt((_32_ + 32))))));
                        break label$0;
                    }
                    while (false);
                    this._storeFloat((_32_ + 60), (this._loadFloat((_32_ + 36))));
                    break label$0;
                }
                while (false);
                this._storeFloat((_32_ + 8), ((this._loadFloat((_32_ + 56))) + 1.7014118E38f));
                this._storeFloat((_32_ + 60), ((this._loadFloat((_32_ + 56))) + 1.0f));
                break label$0;
            }
            while (false);
            this._storeFloat((_32_ + 60), (this._storeFloat((_32_ + 56), ((this._loadFloat((_32_ + 56))) * 1.7014118E38f))));
        }
        while (false);
        _30_ = this._loadFloat((_32_ + 60));
        this._storeInt((0 + 4), (_32_ + 64));
        return _30_;
    }

    @Override()
    public final void expl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (exp((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final double expm1(double _30_)
    {
        int _31_ = 0;
        double _temp$0 = 0.0;
        double _temp$1 = 0.0;
        double _temp$2 = 0.0;
        int _temp$3 = 0;
        double _temp$4 = 0.0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 128))) + 24), (this._storeDouble((_31_ + 112), _30_)));
        this._storeLong32((_31_ + 20), ((this._loadLong32u((_31_ + 28))) & 2147483647L));
        this._storeLong32((_31_ + 12), ((this._loadLong((_31_ + 24))) >>> 63L));
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) < (1078159482 & 4294967295L)) {
                    break label$1;
                }
                label$2:
                do {
                    if ((((__DOUBLE_BITS$2e$51((this._loadDouble((_31_ + 112))))) & 9223372036854775807L) & 4294967295L) < (9218868437227405313L & 4294967295L)) {
                        break label$2;
                    }
                    this._storeDouble((_31_ + 120), (this._loadDouble((_31_ + 112))));
                    break label$0;
                }
                while (false);
                label$3:
                do {
                    if ((this._loadInt((_31_ + 12))) == 0) {
                        break label$3;
                    }
                    this._storeLong((_31_ + 120), -4616189618054758400L);
                    break label$0;
                }
                while (false);
                if (((((_30_ = this._loadDouble((_31_ + 112))) <= 709.782712893384) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                    break label$1;
                }
                this._storeDouble((_31_ + 120), (this._storeDouble((_31_ + 112), ((this._loadDouble((_31_ + 112))) * 8.98846567431158E307))));
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
                                label$9:
                                do {
                                    if (((this._loadInt((_31_ + 20))) & 4294967295L) < (1071001155 & 4294967295L)) {
                                        break label$9;
                                    }
                                    if (((this._loadInt((_31_ + 20))) & 4294967295L) > (1072734897 & 4294967295L)) {
                                        break label$8;
                                    }
                                    if ((this._loadInt((_31_ + 12))) == 0) {
                                        break label$6;
                                    }
                                    this._storeDouble((_31_ + 96), ((this._loadDouble((_31_ + 112))) + 0.6931471803691238));
                                    this._storeLong((_31_ + 88), -4761929956433773450L);
                                    this._storeInt((_31_ + 16), -1);
                                    break label$5;
                                }
                                while (false);
                                if (((this._loadInt((_31_ + 20))) & 4294967295L) > (1016070143 & 4294967295L)) {
                                    break label$7;
                                }
                                label$10:
                                do {
                                    if (((this._loadInt((_31_ + 20))) & 4294967295L) > (1048575 & 4294967295L)) {
                                        break label$10;
                                    }
                                    this._storeFloat((_31_ + 8), ((float) (this._loadDouble((_31_ + 112)))));
                                }
                                while (false);
                                this._storeDouble((_31_ + 120), (this._loadDouble((_31_ + 112))));
                                break label$0;
                            }
                            while (false);
                            _temp$0 = -0.5;
                            _temp$1 = 0.5;
                            _temp$2 = ((this._loadInt((_31_ + 12))) != 0) ? _temp$0 : _temp$1;
                            _temp$2 = ((this._loadDouble((_31_ + 112))) * 1.4426950408889634) + _temp$2;
                            _temp$3 = _truncateDoubleToSignedInteger(_temp$2);
                            _temp$3 = this._storeInt((_31_ + 16), _temp$3);
                            _temp$4 = (double) _temp$3;
                            _temp$4 = this._storeDouble((_31_ + 72), _temp$4);
                            _30_ = _temp$4;
                            this._storeDouble((_31_ + 96), ((this._loadDouble((_31_ + 112))) + (_30_ * -0.6931471803691238)));
                            this._storeDouble((_31_ + 88), ((this._loadDouble((_31_ + 72))) * 1.9082149292705877E-10));
                            break label$5;
                        }
                        while (false);
                        this._storeInt((_31_ + 16), 0);
                        break label$4;
                    }
                    while (false);
                    this._storeDouble((_31_ + 96), ((this._loadDouble((_31_ + 112))) + -0.6931471803691238));
                    this._storeLong((_31_ + 88), 4461442080421002358L);
                    this._storeInt((_31_ + 16), 1);
                }
                while (false);
                _30_ = this._storeDouble((_31_ + 112), ((this._loadDouble((_31_ + 96))) - (this._loadDouble((_31_ + 88)))));
                this._storeDouble((_31_ + 80), (((this._loadDouble((_31_ + 96))) - _30_) - (this._loadDouble((_31_ + 88)))));
            }
            while (false);
            _30_ = this._storeDouble((_31_ + 72), (3.0 - ((this._storeDouble((_31_ + 40), (((_30_ = this._storeDouble((_31_ + 56), ((this._storeDouble((_31_ + 48), ((this._loadDouble((_31_ + 112))) * 0.5))) * (this._loadDouble((_31_ + 112)))))) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * -2.0109921818362437E-7) + 4.008217827329362E-6)) + -7.93650757867488E-5)) + 0.0015873015872548146)) + -0.03333333333333313)) + 1.0))) * (this._loadDouble((_31_ + 48))))));
            this._storeDouble((_31_ + 64), ((this._loadDouble((_31_ + 56))) * (((this._loadDouble((_31_ + 40))) - _30_) / (6.0 - (_30_ * (this._loadDouble((_31_ + 112))))))));
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
                                        if ((this._loadInt((_31_ + 16))) == 0) {
                                            break label$17;
                                        }
                                        this._storeDouble((_31_ + 64), ((this._storeDouble((_31_ + 64), (((this._loadDouble((_31_ + 112))) * ((this._loadDouble((_31_ + 64))) - (_30_ = this._loadDouble((_31_ + 80))))) - _30_))) - (this._loadDouble((_31_ + 56)))));
                                        if ((this._loadInt((_31_ + 16))) == -1) {
                                            break label$16;
                                        }
                                        if ((this._loadInt((_31_ + 16))) != 1) {
                                            break label$15;
                                        }
                                        if (((((_30_ = this._loadDouble((_31_ + 112))) >= -0.25) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                                            break label$14;
                                        }
                                        this._storeDouble((_31_ + 120), (((this._loadDouble((_31_ + 64))) - ((this._loadDouble((_31_ + 112))) + 0.5)) * -2.0));
                                        break label$0;
                                    }
                                    while (false);
                                    this._storeDouble((_31_ + 120), ((_30_ = this._loadDouble((_31_ + 112))) - ((_30_ * (this._loadDouble((_31_ + 64)))) - (this._loadDouble((_31_ + 56))))));
                                    break label$0;
                                }
                                while (false);
                                this._storeDouble((_31_ + 120), ((((this._loadDouble((_31_ + 112))) - (this._loadDouble((_31_ + 64)))) * 0.5) - 0.5));
                                break label$0;
                            }
                            while (false);
                            this._storeLong((_31_ + 24), ((((this._loadInt((_31_ + 16))) + 1023) & 4294967295L) << 52L));
                            this._storeDouble((_31_ + 32), (this._loadDouble((_31_ + 24))));
                            label$18:
                            do {
                                if ((this._loadInt((_31_ + 16))) < 0) {
                                    break label$18;
                                }
                                if ((this._loadInt((_31_ + 16))) < 57) {
                                    break label$11;
                                }
                            }
                            while (false);
                            this._storeDouble((_31_ + 104), (((this._loadDouble((_31_ + 112))) - (this._loadDouble((_31_ + 64)))) + 1.0));
                            if ((this._loadInt((_31_ + 16))) != 1024) {
                                break label$13;
                            }
                            this._storeDouble((_31_ + 104), (((_30_ = this._loadDouble((_31_ + 104))) + _30_) * 8.98846567431158E307));
                            break label$12;
                        }
                        while (false);
                        this._storeDouble((_31_ + 120), (((_30_ = (this._loadDouble((_31_ + 112))) - (this._loadDouble((_31_ + 64)))) + _30_) + 1.0));
                        break label$0;
                    }
                    while (false);
                    this._storeDouble((_31_ + 104), ((this._loadDouble((_31_ + 104))) * (this._loadDouble((_31_ + 32)))));
                }
                while (false);
                this._storeDouble((_31_ + 120), ((this._loadDouble((_31_ + 104))) + -1.0));
                break label$0;
            }
            while (false);
            this._storeLong((_31_ + 24), (((1023 - (this._loadInt((_31_ + 16)))) & 4294967295L) << 52L));
            label$19:
            do {
                label$20:
                do {
                    if ((this._loadInt((_31_ + 16))) > 19) {
                        break label$20;
                    }
                    this._storeDouble((_31_ + 104), ((((this._loadDouble((_31_ + 112))) - (this._loadDouble((_31_ + 64)))) + (1.0 - (this._loadDouble((_31_ + 24))))) * (this._loadDouble((_31_ + 32)))));
                    break label$19;
                }
                while (false);
                this._storeDouble((_31_ + 104), ((((this._loadDouble((_31_ + 112))) - ((this._loadDouble((_31_ + 64))) + (this._loadDouble((_31_ + 24))))) + 1.0) * (this._loadDouble((_31_ + 32)))));
            }
            while (false);
            this._storeDouble((_31_ + 120), (this._loadDouble((_31_ + 104))));
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 120));
        this._storeInt((0 + 4), (_31_ + 128));
        return _30_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$50(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$51(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final float expm1f(float _30_)
    {
        int _31_ = 0;
        float _temp$0 = 0.0f;
        float _temp$1 = 0.0f;
        float _temp$2 = 0.0f;
        int _temp$3 = 0;
        float _temp$4 = 0.0f;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 80) + 24), (this._storeFloat((_31_ + 72), _30_)));
        this._storeInt((_31_ + 20), ((this._loadInt((_31_ + 24))) & 2147483647));
        this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 24))) >>> 31));
        label$0:
        do {
            if (((this._loadInt((_31_ + 20))) & 4294967295L) < (1100331076 & 4294967295L)) {
                break label$0;
            }
            label$1:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) < (2139095041 & 4294967295L)) {
                    break label$1;
                }
                this._storeFloat((_31_ + 76), (this._loadFloat((_31_ + 72))));
                return (this._loadFloat((_31_ + 76)));
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt((_31_ + 12))) == 0) {
                    break label$2;
                }
                this._storeInt((_31_ + 76), -1082130432);
                return (this._loadFloat((_31_ + 76)));
            }
            while (false);
            if (((((_30_ = this._loadFloat((_31_ + 72))) <= 88.72168f) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                break label$0;
            }
            this._storeFloat((_31_ + 76), (this._storeFloat((_31_ + 72), ((this._loadFloat((_31_ + 72))) * 1.7014118E38f))));
            return (this._loadFloat((_31_ + 76)));
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
                            label$8:
                            do {
                                if (((this._loadInt((_31_ + 20))) & 4294967295L) < (1051816473 & 4294967295L)) {
                                    break label$8;
                                }
                                if (((this._loadInt((_31_ + 20))) & 4294967295L) > (1065686417 & 4294967295L)) {
                                    break label$7;
                                }
                                if ((this._loadInt((_31_ + 12))) == 0) {
                                    break label$5;
                                }
                                this._storeFloat((_31_ + 64), ((this._loadFloat((_31_ + 72))) + 0.6931381f));
                                this._storeInt((_31_ + 60), -1223165999);
                                this._storeInt((_31_ + 16), -1);
                                break label$4;
                            }
                            while (false);
                            if (((this._loadInt((_31_ + 20))) & 4294967295L) > (855638015 & 4294967295L)) {
                                break label$6;
                            }
                            label$9:
                            do {
                                if (((this._loadInt((_31_ + 20))) & 4294967295L) > (8388607 & 4294967295L)) {
                                    break label$9;
                                }
                                this._storeFloat((_31_ + 8), ((_30_ = this._loadFloat((_31_ + 72))) * _30_));
                            }
                            while (false);
                            this._storeFloat((_31_ + 76), (this._loadFloat((_31_ + 72))));
                            return (this._loadFloat((_31_ + 76)));
                        }
                        while (false);
                        _temp$0 = -0.5f;
                        _temp$1 = 0.5f;
                        _temp$2 = ((this._loadInt((_31_ + 12))) != 0) ? _temp$0 : _temp$1;
                        _temp$2 = ((this._loadFloat((_31_ + 72))) * 1.442695f) + _temp$2;
                        _temp$3 = _truncateFloatToSignedInteger(_temp$2);
                        _temp$3 = this._storeInt((_31_ + 16), _temp$3);
                        _temp$4 = (float) _temp$3;
                        _temp$4 = this._storeFloat((_31_ + 52), _temp$4);
                        _30_ = _temp$4;
                        this._storeFloat((_31_ + 64), ((this._loadFloat((_31_ + 72))) + (_30_ * -0.6931381f)));
                        this._storeFloat((_31_ + 60), ((this._loadFloat((_31_ + 52))) * 9.058001E-6f));
                        break label$4;
                    }
                    while (false);
                    this._storeInt((_31_ + 16), 0);
                    break label$3;
                }
                while (false);
                this._storeFloat((_31_ + 64), ((this._loadFloat((_31_ + 72))) + -0.6931381f));
                this._storeInt((_31_ + 60), 924317649);
                this._storeInt((_31_ + 16), 1);
            }
            while (false);
            _30_ = this._storeFloat((_31_ + 72), ((this._loadFloat((_31_ + 64))) - (this._loadFloat((_31_ + 60)))));
            this._storeFloat((_31_ + 56), (((this._loadFloat((_31_ + 64))) - _30_) - (this._loadFloat((_31_ + 60)))));
        }
        while (false);
        _30_ = this._storeFloat((_31_ + 52), (3.0f - ((this._storeFloat((_31_ + 36), (((_30_ = this._storeFloat((_31_ + 44), ((this._storeFloat((_31_ + 40), ((this._loadFloat((_31_ + 72))) * 0.5f))) * (this._loadFloat((_31_ + 72)))))) * ((_30_ * 0.001580717f) + -0.033333212f)) + 1.0f))) * (this._loadFloat((_31_ + 40))))));
        this._storeFloat((_31_ + 48), ((this._loadFloat((_31_ + 44))) * (((this._loadFloat((_31_ + 36))) - _30_) / (6.0f - (_30_ * (this._loadFloat((_31_ + 72))))))));
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
                                    if ((this._loadInt((_31_ + 16))) == 0) {
                                        break label$16;
                                    }
                                    this._storeFloat((_31_ + 48), ((this._storeFloat((_31_ + 48), (((this._loadFloat((_31_ + 72))) * ((this._loadFloat((_31_ + 48))) - (_30_ = this._loadFloat((_31_ + 56))))) - _30_))) - (this._loadFloat((_31_ + 44)))));
                                    if ((this._loadInt((_31_ + 16))) == -1) {
                                        break label$15;
                                    }
                                    if ((this._loadInt((_31_ + 16))) != 1) {
                                        break label$14;
                                    }
                                    if (((((_30_ = this._loadFloat((_31_ + 72))) >= -0.25f) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                                        break label$13;
                                    }
                                    this._storeFloat((_31_ + 76), (((this._loadFloat((_31_ + 48))) - ((this._loadFloat((_31_ + 72))) + 0.5f)) * -2.0f));
                                    return (this._loadFloat((_31_ + 76)));
                                }
                                while (false);
                                this._storeFloat((_31_ + 76), ((_30_ = this._loadFloat((_31_ + 72))) - ((_30_ * (this._loadFloat((_31_ + 48)))) - (this._loadFloat((_31_ + 44))))));
                                return (this._loadFloat((_31_ + 76)));
                            }
                            while (false);
                            this._storeFloat((_31_ + 76), ((((this._loadFloat((_31_ + 72))) - (this._loadFloat((_31_ + 48)))) * 0.5f) - 0.5f));
                            return (this._loadFloat((_31_ + 76)));
                        }
                        while (false);
                        this._storeInt((_31_ + 24), (((this._loadInt((_31_ + 16))) << 23) + 1065353216));
                        this._storeFloat((_31_ + 32), (this._loadFloat((_31_ + 24))));
                        label$17:
                        do {
                            if ((this._loadInt((_31_ + 16))) < 0) {
                                break label$17;
                            }
                            if ((this._loadInt((_31_ + 16))) < 57) {
                                break label$10;
                            }
                        }
                        while (false);
                        this._storeFloat((_31_ + 68), (((this._loadFloat((_31_ + 72))) - (this._loadFloat((_31_ + 48)))) + 1.0f));
                        if ((this._loadInt((_31_ + 16))) != 128) {
                            break label$12;
                        }
                        this._storeFloat((_31_ + 68), (((_30_ = this._loadFloat((_31_ + 68))) + _30_) * 1.7014118E38f));
                        break label$11;
                    }
                    while (false);
                    this._storeFloat((_31_ + 76), (((_30_ = (this._loadFloat((_31_ + 72))) - (this._loadFloat((_31_ + 48)))) + _30_) + 1.0f));
                    return (this._loadFloat((_31_ + 76)));
                }
                while (false);
                this._storeFloat((_31_ + 68), ((this._loadFloat((_31_ + 68))) * (this._loadFloat((_31_ + 32)))));
            }
            while (false);
            this._storeFloat((_31_ + 76), ((this._loadFloat((_31_ + 68))) + -1.0f));
            return (this._loadFloat((_31_ + 76)));
        }
        while (false);
        this._storeInt((_31_ + 24), ((127 - (this._loadInt((_31_ + 16)))) << 23));
        label$18:
        do {
            label$19:
            do {
                if ((this._loadInt((_31_ + 16))) > 22) {
                    break label$19;
                }
                this._storeFloat((_31_ + 68), ((((this._loadFloat((_31_ + 72))) - (this._loadFloat((_31_ + 48)))) + (1.0f - (this._loadFloat((_31_ + 24))))) * (this._loadFloat((_31_ + 32)))));
                break label$18;
            }
            while (false);
            this._storeFloat((_31_ + 68), ((((this._loadFloat((_31_ + 72))) - ((this._loadFloat((_31_ + 48))) + (this._loadFloat((_31_ + 24))))) + 1.0f) * (this._loadFloat((_31_ + 32)))));
        }
        while (false);
        this._storeFloat((_31_ + 76), (this._loadFloat((_31_ + 68))));
        return (this._loadFloat((_31_ + 76)));
    }

    @Override()
    public final void expm1l(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (expm1((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void _flushlbf()
    {
        fflush(0);
        return;
    }

    @Override()
    public final int __fsetlocking(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        return 0;
    }

    @Override()
    public final int __fwriting(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 1;
        label$0:
        do {
            if (((this._loadInt8u((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)))) & 4) != 0) {
                break label$0;
            }
            _31_ = ((this._loadInt(((this._loadInt((_32_ + 12))) + 16))) != 0) ? 1 : 0;
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int __freading(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 1;
        label$0:
        do {
            if (((this._loadInt8u((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)))) & 8) != 0) {
                break label$0;
            }
            _31_ = ((this._loadInt(((this._loadInt((_32_ + 12))) + 8))) != 0) ? 1 : 0;
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int __freadable(int _30_)
    {
        return ((((this._loadInt8u((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)))) & 4) == 0) ? 1 : 0);
    }

    @Override()
    public final int __fwritable(int _30_)
    {
        return ((((this._loadInt8u((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)))) & 8) == 0) ? 1 : 0);
    }

    @Override()
    public final int __flbf(int _30_)
    {
        return (((this._loadInt8s(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 75))) > -1) ? 1 : 0);
    }

    @Override()
    public final int __fbufsize(int _30_)
    {
        return (this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 48)));
    }

    @Override()
    public final int __fpending(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_)) + 16))) == 0) {
                break label$0;
            }
            _31_ = (this._loadInt(((_31_ = this._loadInt((_32_ + 12))) + 20))) - (this._loadInt((_31_ + 28)));
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int __fpurge(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _32_ = this._loadInt((0 + 4));
        this._storeLong((_30_ + 16), 0L);
        _31_ = this._storeInt((_30_ + 8), (this._storeInt((_30_ + 28), 0)));
        this._storeInt(((_32_ = _32_ - 16) + 12), _30_);
        return (this._storeInt(((this._loadInt((_32_ + 12))) + 4), _31_));
    }

    @Override()
    public final int __freadahead(int _30_)
    {
        return ((this._loadInt(((_30_ = this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 8))) - (this._loadInt((_30_ + 4))));
    }

    @Override()
    public final int __freadptr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            if ((this._storeInt(_32_, ((this._loadInt(((_31_ = this._loadInt((_32_ + 8))) + 8))) - (this._loadInt((_31_ + 4)))))) == 0) {
                break label$0;
            }
            this._storeInt((this._loadInt((_32_ + 4))), (this._loadInt(_32_)));
            this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 8))) + 4))));
            return (this._loadInt((_32_ + 12)));
        }
        while (false);
        this._storeInt((_32_ + 12), 0);
        return (this._loadInt((_32_ + 12)));
    }

    @Override()
    public final void __freadptrinc(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt(((_32_ = this._loadInt((_32_ + 12))) + 4), (_31_ + (this._loadInt((_32_ + 4)))));
        return;
    }

    @Override()
    public final void __fseterr(int _30_)
    {
        int _31_ = 0;
        _31_ = this._loadInt((0 + 4));
        this._storeInt(_30_, ((this._loadInt(_30_)) | 32));
        this._storeInt(((_31_ - 16) + 12), _30_);
        return;
    }

    @Override()
    public final double fabs(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        this._storeLong(_31_, ((this._loadLong(_31_)) & 9223372036854775807L));
        return (this._loadDouble(_31_));
    }

    @Override()
    public final float fabsf(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) & 2147483647));
        return (this._loadFloat((_31_ + 8)));
    }

    @Override()
    public final void fabsl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (Math.abs((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int fchdir(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 36), (this.__syscall1.invoke(133, (this._storeInt((_31_ + 40), _30_)))))) != -9) {
                    break label$1;
                }
                if ((this.__syscall2.invoke(55, (this._loadInt((_31_ + 40))), 1)) <= -1) {
                    break label$1;
                }
                __procfdname(_31_, (this._loadInt((_31_ + 40))));
                this._storeInt((_31_ + 44), (__syscall_ret((this.__syscall1.invoke(12, _31_)))));
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 44), (__syscall_ret((this._loadInt((_31_ + 36))))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 44));
        this._storeInt((0 + 4), (_31_ + 48));
        return _30_;
    }

    @Override()
    public final int fchown(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_33_ + 36), _31_);
        this._storeInt((_33_ + 32), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_33_ + 28), (this.__syscall3.invoke(95, (this._loadInt((_33_ + 40))), (this._loadInt((_33_ + 36))), _32_)))) != -9) {
                    break label$1;
                }
                if ((this.__syscall2.invoke(55, (this._loadInt((_33_ + 40))), 1)) <= -1) {
                    break label$1;
                }
                __procfdname(_33_, (this._loadInt((_33_ + 40))));
                this._storeInt((_33_ + 44), (__syscall_ret((this.__syscall3.invoke(182, _33_, (this._loadInt((_33_ + 36))), (this._loadInt((_33_ + 32))))))));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 44), (__syscall_ret((this._loadInt((_33_ + 28))))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 44));
        this._storeInt((0 + 4), (_33_ + 48));
        return _32_;
    }

    @Override()
    public final int fchownat(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        _34_ = __syscall_ret((this.__syscall5.invoke(298, (this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 16))), _34_)));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int fclose(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _32_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_)) + 76))) < 0) {
                break label$0;
            }
            _32_ = this.__lockfile.invoke((this._loadInt((_31_ + 28))));
        }
        while (false);
        this._storeInt((_31_ + 16), _32_);
        dummy$2e$58((this._loadInt((_31_ + 28))));
        label$1:
        do {
            if ((this._storeInt((_31_ + 20), ((this._loadInt((this._loadInt((_31_ + 28))))) & 1))) != 0) {
                break label$1;
            }
            this._storeInt((_31_ + 12), (__ofl_lock()));
            label$2:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 28))) + 52))) == 0) {
                    break label$2;
                }
                this._storeInt(((this._loadInt(((_32_ = this._loadInt((_31_ + 28))) + 52))) + 56), (this._loadInt((_32_ + 56))));
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 28))) + 56))) == 0) {
                    break label$3;
                }
                this._storeInt(((this._loadInt(((_32_ = this._loadInt((_31_ + 28))) + 56))) + 52), (this._loadInt((_32_ + 52))));
            }
            while (false);
            label$4:
            do {
                if ((this._loadInt((this._loadInt((_31_ + 12))))) != (this._loadInt((_31_ + 28)))) {
                    break label$4;
                }
                this._storeInt((this._loadInt((_31_ + 12))), (this._loadInt(((this._loadInt((_31_ + 28))) + 56))));
            }
            while (false);
            __ofl_unlock();
        }
        while (false);
        this._storeInt((_31_ + 24), (fflush((this._loadInt((_31_ + 28))))));
        this._storeInt((_31_ + 24), ((this._iiTable[this._tableIndices[this._loadInt(((_32_ = this._loadInt((_31_ + 28))) + 12))]].invoke(_32_)) | (this._loadInt((_31_ + 24)))));
        label$5:
        do {
            if ((this._loadInt(((this._loadInt((_31_ + 28))) + 96))) == 0) {
                break label$5;
            }
            free((this._loadInt(((this._loadInt((_31_ + 28))) + 96))));
        }
        while (false);
        label$6:
        do {
            label$7:
            do {
                if ((this._loadInt((_31_ + 20))) == 0) {
                    break label$7;
                }
                if ((this._loadInt((_31_ + 16))) == 0) {
                    break label$6;
                }
                this.__unlockfile.invoke((this._loadInt((_31_ + 28))));
                break label$6;
            }
            while (false);
            free((this._loadInt((_31_ + 28))));
        }
        while (false);
        _32_ = this._loadInt((_31_ + 24));
        this._storeInt((0 + 4), (_31_ + 32));
        return _32_;
    }

    @Override()
    public final void dummy$2e$58(int _30_)
    {
        this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_);
        return;
    }

    @Override()
    public final int fcvt(double _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeDouble(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 1568))) + 1552), _30_);
        this._storeInt((_34_ + 1548), _31_);
        this._storeInt((_34_ + 1544), _32_);
        this._storeInt((_34_ + 1540), _33_);
        label$0:
        do {
            if (((this._loadInt((_34_ + 1548))) & 4294967295L) < (1401 & 4294967295L)) {
                break label$0;
            }
            this._storeInt((_34_ + 1548), 1400);
        }
        while (false);
        this._storeDouble((_34_ + 8), (this._loadDouble((_34_ + 1552))));
        this._storeInt(_34_, (this._loadInt((_34_ + 1548))));
        this.sprintf.invoke((_34_ + 32), 9808, _34_);
        label$1:
        do {
            label$2:
            do {
                if ((this._loadInt8s(((_34_ + 32) | (this._storeInt((_34_ + 28), (((this._loadInt8s((_34_ + 32))) == 45) ? 1 : 0)))))) != 48) {
                    break label$2;
                }
                this._storeInt((_34_ + 24), (strspn((((_34_ + 32) + (this._loadInt((_34_ + 28)))) + 2), 9824)));
                break label$1;
            }
            while (false);
            this._storeInt((_34_ + 24), (0 - (strcspn(((_34_ + 32) + (this._loadInt((_34_ + 28)))), 9840))));
        }
        while (false);
        label$3:
        do {
            label$4:
            do {
                if ((this._loadInt((_34_ + 1548))) > (this._loadInt((_34_ + 24)))) {
                    break label$4;
                }
                this._storeInt((this._loadInt((_34_ + 1540))), (this._loadInt((_34_ + 28))));
                this._storeInt((this._loadInt((_34_ + 1544))), 1);
                label$5:
                do {
                    if (((this._loadInt((_34_ + 1548))) & 4294967295L) < (15 & 4294967295L)) {
                        break label$5;
                    }
                    this._storeInt((_34_ + 1548), 14);
                }
                while (false);
                this._storeInt((_34_ + 1564), (9870 - (this._loadInt((_34_ + 1548)))));
                break label$3;
            }
            while (false);
            this._storeInt((_34_ + 1564), (ecvt((this._loadDouble((_34_ + 1552))), ((this._loadInt((_34_ + 1548))) - (this._loadInt((_34_ + 24)))), (this._loadInt((_34_ + 1544))), (this._loadInt((_34_ + 1540))))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 1564));
        this._storeInt((0 + 4), (_34_ + 1568));
        return _33_;
    }

    @Override()
    public final int fdatasync(int _30_)
    {
        int _31_ = 0;
        _30_ = __syscall_ret((this.__syscall_cp.invoke(148, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 0, 0, 0, 0, 0)));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final double fdim(double _30_, double _31_)
    {
        int _32_ = 0;
        double _33_ = 0.0;
        this._storeDouble(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 16), _30_);
        this._storeDouble((_32_ + 8), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((((__DOUBLE_BITS$2e$61((this._loadDouble((_32_ + 16))))) & 9223372036854775807L) & 4294967295L) < (9218868437227405313L & 4294967295L)) {
                    break label$1;
                }
                this._storeDouble((_32_ + 24), (this._loadDouble((_32_ + 16))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((((__DOUBLE_BITS$2e$61((this._loadDouble((_32_ + 8))))) & 9223372036854775807L) & 4294967295L) < (9218868437227405313L & 4294967295L)) {
                    break label$2;
                }
                this._storeDouble((_32_ + 24), (this._loadDouble((_32_ + 8))));
                break label$0;
            }
            while (false);
            _33_ = 0.0;
            label$3:
            do {
                if (((((_31_ = this._loadDouble((_32_ + 16))) <= (_30_ = this._loadDouble((_32_ + 8)))) ? 1 : 0) | (((_31_ != _31_) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0))) != 0) {
                    break label$3;
                }
                _33_ = (this._loadDouble((_32_ + 16))) - (this._loadDouble((_32_ + 8)));
            }
            while (false);
            this._storeDouble((_32_ + 24), _33_);
        }
        while (false);
        _31_ = this._loadDouble((_32_ + 24));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$60(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$61(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final float fdimf(float _30_, float _31_)
    {
        int _32_ = 0;
        float _33_ = 0.0f;
        this._storeFloat(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeFloat((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((((__FLOAT_BITS$2e$62((this._loadFloat((_32_ + 8))))) & 2147483647) & 4294967295L) < (2139095041 & 4294967295L)) {
                    break label$1;
                }
                this._storeFloat((_32_ + 12), (this._loadFloat((_32_ + 8))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((((__FLOAT_BITS$2e$62((this._loadFloat((_32_ + 4))))) & 2147483647) & 4294967295L) < (2139095041 & 4294967295L)) {
                    break label$2;
                }
                this._storeFloat((_32_ + 12), (this._loadFloat((_32_ + 4))));
                break label$0;
            }
            while (false);
            _33_ = 0.0f;
            label$3:
            do {
                if (((((_31_ = this._loadFloat((_32_ + 8))) <= (_30_ = this._loadFloat((_32_ + 4)))) ? 1 : 0) | (((_31_ != _31_) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0))) != 0) {
                    break label$3;
                }
                _33_ = (this._loadFloat((_32_ + 8))) - (this._loadFloat((_32_ + 4)));
            }
            while (false);
            this._storeFloat((_32_ + 12), _33_);
        }
        while (false);
        _31_ = this._loadFloat((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$62(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$63(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final void fdiml(int _30_, long _31_, long _32_, long _33_, long _34_)
    {
        int _35_ = 0;
        double _36_ = 0.0;
        this._storeLong(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), _31_);
        this._storeLong((_35_ + 40), _32_);
        this._storeLong((_35_ + 24), _34_);
        _36_ = this.__trunctfdf2.invoke((this._storeLong((_35_ + 16), _33_)), _34_);
        this.__extenddftf2.invoke(_35_, (fdim((this.__trunctfdf2.invoke((this._loadLong((_35_ + 32))), (this._loadLong((_35_ + 40))))), _36_)));
        this._storeLong((_30_ + 8), (this._loadLong((_35_ + 8))));
        this._storeLong(_30_, (this._loadLong(_35_)));
        this._storeInt((0 + 4), (_35_ + 48));
        return;
    }

    @Override()
    public final int feof(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _32_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 76))) < 0) {
                break label$0;
            }
            _32_ = this.__lockfile.invoke((this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt((_31_ + 8), _32_);
        this._storeInt((_31_ + 4), (((this._loadInt((this._loadInt((_31_ + 12))))) & 16) >>> 4));
        label$1:
        do {
            if ((this._loadInt((_31_ + 8))) == 0) {
                break label$1;
            }
            this.__unlockfile.invoke((this._loadInt((_31_ + 12))));
        }
        while (false);
        _32_ = this._loadInt((_31_ + 4));
        this._storeInt((0 + 4), (_31_ + 16));
        return _32_;
    }
}
