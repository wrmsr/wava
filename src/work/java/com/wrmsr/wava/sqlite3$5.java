package com.wrmsr.wava;

abstract class sqlite3$5
        extends sqlite3$4
{
    protected sqlite3$5(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final int __FLOAT_BITS$2e$156(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$157(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final void logbl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this._storeLong(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 72), _32_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((__fpclassifyl((this._storeLong((_33_ + 64), _31_)), _32_)) <= 1) {
                        break label$2;
                    }
                    if ((this.__netf2.invoke((this._loadLong((_33_ + 64))), (this._loadLong((_33_ + 72))), 0L, 0L)) != 0) {
                        break label$1;
                    }
                    this.__multf3.invoke((_33_ + 16), (_31_ = this._loadLong((_33_ + 64))), (_32_ = this._loadLong((_33_ + 72))), _31_, _32_);
                    this.__divtf3.invoke(_33_, 0L, -4611967493404098560L, (this._loadLong((_33_ + 16))), (this._loadLong(((_33_ + 16) + 8))));
                    this._storeLong((_33_ + 88), (this._loadLong((_33_ + 8))));
                    this._storeLong((_33_ + 80), (this._loadLong(_33_)));
                    break label$0;
                }
                while (false);
                this.__multf3.invoke((_33_ + 48), (_31_ = this._loadLong((_33_ + 64))), (_32_ = this._loadLong((_33_ + 72))), _31_, _32_);
                this._storeLong((_33_ + 88), (this._loadLong((_33_ + 56))));
                this._storeLong((_33_ + 80), (this._loadLong((_33_ + 48))));
                break label$0;
            }
            while (false);
            this.__floatsitf.invoke((_33_ + 32), (ilogbl((this._loadLong((_33_ + 64))), (this._loadLong((_33_ + 72))))));
            this._storeLong((_33_ + 88), (this._loadLong((_33_ + 40))));
            this._storeLong((_33_ + 80), (this._loadLong((_33_ + 32))));
        }
        while (false);
        this._storeLong(_30_, (this._loadLong((_33_ + 80))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 88))));
        this._storeInt((0 + 4), (_33_ + 96));
        return;
    }

    @Override()
    public final int __FLOAT_BITS$2e$158(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$159(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final float logf(float _30_)
    {
        int _31_ = 0;
        float _32_ = 0.0f;
        int _33_ = 0;
        this._storeFloat(((_33_ = (this._loadInt((0 + 4))) - 64) + 48), (this._storeFloat((_33_ + 56), _30_)));
        this._storeInt((_33_ + 8), (this._loadInt((_33_ + 48))));
        this._storeInt((_33_ + 4), 0);
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
                            if (((this._loadInt((_33_ + 8))) & 4294967295L) < (8388608 & 4294967295L)) {
                                break label$4;
                            }
                            if (((this._loadInt((_33_ + 8))) >>> 31) == 0) {
                                break label$3;
                            }
                        }
                        while (false);
                        label$5:
                        do {
                            if (((this._loadInt((_33_ + 8))) << 1) == 0) {
                                break label$5;
                            }
                            if (((this._loadInt((_33_ + 8))) >>> 31) == 0) {
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
                    if (((this._loadInt((_33_ + 8))) & 4294967295L) < (2139095040 & 4294967295L)) {
                        break label$1;
                    }
                    this._storeFloat((_33_ + 60), (this._loadFloat((_33_ + 56))));
                    return (this._loadFloat((_33_ + 60)));
                }
                while (false);
                this._storeInt((_33_ + 4), ((this._loadInt((_33_ + 4))) + -25));
                this._storeFloat((_33_ + 48), (this._storeFloat((_33_ + 56), ((this._loadFloat((_33_ + 56))) * 3.3554432E7f))));
                this._storeInt((_33_ + 8), (this._loadInt((_33_ + 48))));
                break label$0;
            }
            while (false);
            if ((this._loadInt((_33_ + 8))) != 1065353216) {
                break label$0;
            }
            this._storeInt((_33_ + 60), 0);
            return (this._loadFloat((_33_ + 60)));
        }
        while (false);
        _31_ = this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) + 4913933));
        this._storeInt((_33_ + 4), (((this._loadInt((_33_ + 4))) + (_31_ >>> 23)) + -127));
        this._storeInt((_33_ + 48), (this._storeInt((_33_ + 8), (((this._loadInt((_33_ + 8))) & 8388607) + 1060439283))));
        this._storeFloat((_33_ + 20), ((_30_ = this._storeFloat((_33_ + 24), ((_30_ = this._storeFloat((_33_ + 32), ((_30_ = this._storeFloat((_33_ + 36), ((_30_ = this._storeFloat((_33_ + 40), ((this._storeFloat((_33_ + 56), (this._loadFloat((_33_ + 48))))) + -1.0f))) / (_30_ + 2.0f)))) * _30_))) * _30_))) * ((_30_ * 0.24279079f) + 0.40000972f)));
        this._storeFloat((_33_ + 28), ((this._storeFloat((_33_ + 16), ((this._loadFloat((_33_ + 32))) * (((this._loadFloat((_33_ + 24))) * 0.28498787f) + 0.6666666f)))) + (this._loadFloat((_33_ + 20)))));
        this._storeFloat((_33_ + 44), (((_30_ = this._loadFloat((_33_ + 40))) * 0.5f) * _30_));
        _30_ = this._storeFloat((_33_ + 12), ((float) (this._loadInt((_33_ + 4)))));
        this._storeFloat((_33_ + 60), ((((((this._loadFloat((_33_ + 36))) * ((_32_ = this._loadFloat((_33_ + 44))) + (this._loadFloat((_33_ + 28))))) + (_30_ * 9.058001E-6f)) - _32_) + (this._loadFloat((_33_ + 40)))) + (_30_ * 0.6931381f)));
        return (this._loadFloat((_33_ + 60)));
    }

    @Override()
    public final void logl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (log((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int nrand48(int _30_)
    {
        int _31_ = 0;
        long _32_ = 0L;
        _32_ = __rand48_step((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 4226);
        this._storeInt((0 + 4), (_31_ + 16));
        return ((int) (_32_ >>> 17L));
    }

    @Override()
    public final int lrand48()
    {
        return (nrand48(4220));
    }

    @Override()
    public final int lrint(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_31_ + 4), (this.fetestexcept.invoke(32)));
        this._storeDouble((_31_ + 8), (Math.round((this._loadDouble((_31_ + 8))))));
        label$0:
        do {
            if ((this._loadInt((_31_ + 4))) != 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadDouble((_31_ + 8))) > 2.147483647E9) {
                    break label$1;
                }
                if (((((_30_ = this._loadDouble((_31_ + 8))) >= -2.147483648E9) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                    break label$0;
                }
            }
            while (false);
            this.feclearexcept.invoke(32);
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return (_truncateDoubleToSignedInteger(_30_));
    }

    @Override()
    public final int lrintf(float _30_)
    {
        return (_truncateFloatToSignedInteger((Math.round((this._storeFloat((((this._loadInt((0 + 4))) - 16) + 12), _30_))))));
    }

    @Override()
    public final int lrintl(long _30_, long _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        _33_ = lrint((this.__trunctfdf2.invoke((this._storeLong((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))), _30_)), (this._storeLong((_32_ + 8), _31_)))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _33_;
    }

    @Override()
    public final int lround(double _30_)
    {
        int _31_ = 0;
        _30_ = round((this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return (_truncateDoubleToSignedInteger(_30_));
    }

    @Override()
    public final int lroundf(float _30_)
    {
        int _31_ = 0;
        _30_ = roundf((this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return (_truncateFloatToSignedInteger(_30_));
    }

    @Override()
    public final int lroundl(long _30_, long _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        roundl((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), _30_, _31_);
        this._storeLong((_32_ + 24), _31_);
        this._storeLong((_32_ + 16), _30_);
        _33_ = this.__fixtfsi.invoke((this._loadLong(_32_)), (this._loadLong((_32_ + 8))));
        this._storeInt((0 + 4), (_32_ + 32));
        return _33_;
    }

    @Override()
    public final long lseek(int _30_, long _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeLong((_33_ + 16), _31_);
        this._storeInt((_33_ + 12), _32_);
        _31_ = -1L;
        label$0:
        do {
            if ((__syscall_ret((this.__syscall5.invoke(140, (this._loadInt((_33_ + 28))), ((int) ((_34_ = this._loadLong((_33_ + 16))) >>> 32L)), ((int) _34_), _33_, _32_)))) != 0) {
                break label$0;
            }
            _31_ = this._loadLong(_33_);
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return _31_;
    }

    @Override()
    public final int malloc(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        long _33_ = 0L;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
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
                            if ((adjust_size((_32_ + 40))) <= -1) {
                                break label$4;
                            }
                            if (((this._loadInt((_32_ + 40))) & 4294967295L) < (114689 & 4294967295L)) {
                                break label$3;
                            }
                            if ((this._storeInt((_32_ + 20), (this.__mmap.invoke(0, (this._storeInt((_32_ + 24), (((this._loadInt((_32_ + 40))) + 4103) & -4096))), 3, 34, -1, 0L)))) == -1) {
                                break label$2;
                            }
                            _31_ = this._storeInt((_32_ + 36), ((_30_ = this._loadInt((_32_ + 20))) + 8));
                            this._storeInt((_30_ + 12), ((this._loadInt((_32_ + 24))) + -8));
                            this._storeInt(_31_, 8);
                            this._storeInt((_32_ + 44), (_30_ + 16));
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_32_ + 44), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_32_ + 32), (bin_index_up((this._loadInt((_32_ + 40))))));
                    label$5:
                    do {
                        label$6:
                        do {
                            label$8:
                            do {
                                label$7:
                                while (true) {
                                    _33_ = this._loadLong32u((_32_ + 32));
                                    if ((this._storeLong((_32_ + 8), ((this._loadLong((0 + 13028))) & (0L - (1L << _33_))))) == 0L) {
                                        break label$6;
                                    }
                                    lock_bin((this._storeInt((_32_ + 28), (first_set((this._loadLong((_32_ + 8))))))));
                                    if ((this._storeInt((_32_ + 36), (this._loadInt((((this._loadInt((_32_ + 28))) << 4) + 13044))))) != (((this._loadInt((_32_ + 28))) << 4) + 13036)) {
                                        break label$8;
                                    }
                                    unlock_bin((this._loadInt((_32_ + 28))));
                                    continue label$7;
                                }
                            }
                            while (false);
                            label$9:
                            do {
                                if ((pretrim((this._loadInt((_32_ + 36))), (this._loadInt((_32_ + 40))), (this._loadInt((_32_ + 32))), (this._loadInt((_32_ + 28))))) != 0) {
                                    break label$9;
                                }
                                unbin((this._loadInt((_32_ + 36))), (this._loadInt((_32_ + 28))));
                            }
                            while (false);
                            unlock_bin((this._loadInt((_32_ + 28))));
                            break label$5;
                        }
                        while (false);
                        if ((this._storeInt((_32_ + 36), (expand_heap((this._loadInt((_32_ + 40))))))) == 0) {
                            break label$1;
                        }
                        if ((alloc_rev((this._loadInt((_32_ + 36))))) == 0) {
                            break label$5;
                        }
                        this._storeInt((_32_ + 4), (this._loadInt((_32_ + 36))));
                        _31_ = this._storeInt(((_31_ = this._storeInt((_32_ + 36), ((_30_ = this._loadInt((_32_ + 36))) - ((this._loadInt(_30_)) & -2)))) + 4), ((this._loadInt(((_30_ = this._loadInt((_32_ + 4))) + 4))) + ((this._loadInt((_31_ + 4))) & -2)));
                        this._storeInt((_30_ + ((this._loadInt((_30_ + 4))) & -2)), _31_);
                    }
                    while (false);
                    trim((this._loadInt((_32_ + 36))), (this._loadInt((_32_ + 40))));
                    this._storeInt((_32_ + 44), ((this._loadInt((_32_ + 36))) + 8));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 44), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 44), 0);
        }
        while (false);
        _30_ = this._loadInt((_32_ + 44));
        this._storeInt((0 + 4), (_32_ + 48));
        return _30_;
    }

    @Override()
    public final int adjust_size(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((((this._loadInt((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)))) + -1) & 4294967295L) < (2147479536 & 4294967295L)) {
                        break label$2;
                    }
                    if ((this._loadInt((this._loadInt((_31_ + 8))))) == 0) {
                        break label$1;
                    }
                    this._storeInt((__errno_location()), 12);
                    this._storeInt((_31_ + 12), -1);
                    break label$0;
                }
                while (false);
                this._storeInt((_30_ = this._loadInt((_31_ + 8))), (((this._loadInt(_30_)) + 23) & -16));
                this._storeInt((_31_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt((this._loadInt((_31_ + 8))), 16);
            this._storeInt((_31_ + 12), 0);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int bin_index_up(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if (((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (((this._storeInt((_31_ + 8), _30_)) >>> 4) + -1))) & 4294967295L) > (32 & 4294967295L)) {
                break label$0;
            }
            this._storeInt((_31_ + 12), (this._loadInt((_31_ + 8))));
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        this._storeFloat(_31_, ((float) (this._loadInt((_31_ + 8)))));
        this._storeInt((_31_ + 12), ((((this._loadInt(_31_)) + 2097151) >>> 21) + -496));
        return (this._loadInt((_31_ + 12)));
    }

    @Override()
    public final int expand_heap(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), ((this._storeInt((_31_ + 8), _30_)) + 16));
        lock$2e$166(14112);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_31_ + 4), (__expand_heap((_31_ + 8))))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt((_31_ + 4))) == (this._loadInt((0 + 14120)))) {
                        break label$2;
                    }
                    this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) + -16));
                    this._storeInt((_32_ = (_30_ = this._loadInt((_31_ + 4))) + 8), 1);
                    this._storeInt((_31_ + 4), (_30_ + 16));
                    this._storeInt(_31_, _32_);
                }
                while (false);
                this._storeInt((this._storeInt(_31_, ((this._storeInt((0 + 14120), ((this._loadInt((_31_ + 4))) + (this._loadInt((_31_ + 8)))))) + -8))), ((this._loadInt((_31_ + 8))) | 1));
                _30_ = this._storeInt(((this._loadInt(_31_)) + 4), 1);
                this._storeInt(_31_, ((_32_ = this._loadInt((_31_ + 4))) + -8));
                this._storeInt((_32_ + -4), (_30_ | (this._loadInt((_31_ + 8)))));
                unlock(14112);
                this._storeInt((_31_ + 12), (this._loadInt(_31_)));
                break label$0;
            }
            while (false);
            unlock(14112);
            this._storeInt((_31_ + 12), 0);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int alloc_rev(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        label$0:
        do {
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if (((this._storeInt(_31_, (this._loadInt((this._loadInt((_31_ + 8))))))) & 1) != 0) {
                            break label$1;
                        }
                        lock_bin((this._storeInt((_31_ + 4), (bin_index((this._loadInt(_31_)))))));
                        if ((this._loadInt((this._loadInt((_31_ + 8))))) == (this._loadInt(_31_))) {
                            break label$3;
                        }
                        unlock_bin((this._loadInt((_31_ + 4))));
                        continue label$2;
                    }
                }
                while (false);
                unbin(((_30_ = this._loadInt((_31_ + 8))) - ((this._loadInt(_30_)) & -2)), (this._loadInt((_31_ + 4))));
                unlock_bin((this._loadInt((_31_ + 4))));
                this._storeInt((_31_ + 12), 1);
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
    public final int first_set(long _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _32_ = a_ctz_64((this._storeLong(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return _32_;
    }

    @Override()
    public final void lock_bin(int _30_)
    {
        int _31_ = 0;
        lock$2e$166((((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) << 4) + 13036));
        label$0:
        do {
            if ((this._loadInt((((this._loadInt((_31_ + 12))) << 4) + 13044))) != 0) {
                break label$0;
            }
            this._storeInt(((_30_ = (this._loadInt((_31_ + 12))) << 4) + 13044), (this._storeInt((_30_ + 13048), (_30_ + 13036))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int pretrim(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_34_ + 20), _31_);
        this._storeInt((_34_ + 16), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_34_ + 12), _33_)) > 39) {
                    break label$1;
                }
                this._storeInt((_34_ + 28), 0);
                break label$0;
            }
            while (false);
            label$2:
            do {
                label$3:
                do {
                    label$4:
                    do {
                        if ((this._loadInt((_34_ + 12))) >= ((this._loadInt((_34_ + 16))) + 3)) {
                            break label$4;
                        }
                        if ((this._loadInt((_34_ + 12))) == 63) {
                            break label$3;
                        }
                        this._storeInt((_34_ + 28), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_34_ + 8), ((this._loadInt(((this._loadInt((_34_ + 24))) + 4))) & -2));
                    break label$2;
                }
                while (false);
                if ((((this._storeInt((_34_ + 8), ((this._loadInt(((this._loadInt((_34_ + 24))) + 4))) & -2))) - (this._loadInt((_34_ + 20)))) & 4294967295L) > (114688 & 4294967295L)) {
                    break label$2;
                }
                this._storeInt((_34_ + 28), 0);
                break label$0;
            }
            while (false);
            label$5:
            do {
                if ((bin_index(((this._loadInt((_34_ + 8))) - (this._loadInt((_34_ + 20)))))) == (this._loadInt((_34_ + 12)))) {
                    break label$5;
                }
                this._storeInt((_34_ + 28), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 4), ((_33_ = this._loadInt((_34_ + 24))) + ((this._loadInt((_33_ + 4))) & -2)));
            this._storeInt(((_33_ = this._storeInt(_34_, ((this._loadInt((_34_ + 24))) + (this._loadInt((_34_ + 20)))))) + 12), (this._loadInt(((_32_ = this._loadInt((_34_ + 24))) + 12))));
            this._storeInt((_33_ + 8), (this._loadInt((_32_ + 8))));
            this._storeInt(((this._loadInt(((_33_ = this._loadInt(_34_)) + 12))) + 8), _33_);
            this._storeInt(((this._loadInt(((_33_ = this._loadInt(_34_)) + 8))) + 12), _33_);
            this._storeInt((this._loadInt(_34_)), ((this._loadInt((_34_ + 20))) | 1));
            this._storeInt(((this._loadInt(_34_)) + 4), ((this._loadInt((_34_ + 8))) - (this._loadInt((_34_ + 20)))));
            this._storeInt((this._loadInt((_34_ + 4))), ((this._loadInt((_34_ + 8))) - (this._loadInt((_34_ + 20)))));
            this._storeInt(((this._loadInt((_34_ + 24))) + 4), ((this._loadInt((_34_ + 20))) | 1));
            this._storeInt((_34_ + 28), 1);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 28));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final void unbin(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if ((this._loadInt(((_31_ = this._loadInt((_32_ + 12))) + 12))) != (this._loadInt((_31_ + 8)))) {
                break label$0;
            }
            a_and_64(13028, (Long.rotateLeft(-2L, ((int) (this._loadLong32u((_32_ + 8)))))));
        }
        while (false);
        this._storeInt(((this._loadInt(((_31_ = this._loadInt((_32_ + 12))) + 12))) + 8), (this._loadInt((_31_ + 8))));
        this._storeInt(((this._loadInt((_31_ + 8))) + 12), (this._loadInt((_31_ + 12))));
        this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 4), ((this._loadInt((_31_ + 4))) | 1));
        this._storeInt((_31_ = (_31_ = this._loadInt((_32_ + 12))) + ((this._loadInt((_31_ + 4))) & -2)), ((this._loadInt(_31_)) | 1));
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void unlock_bin(int _30_)
    {
        int _31_ = 0;
        unlock((((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) << 4) + 13036));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void trim(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        _31_ = this._storeInt((_32_ + 20), ((this._loadInt(((this._loadInt((_32_ + 28))) + 4))) & -2));
        label$0:
        do {
            if (((this._loadInt((_32_ + 24))) & 4294967295L) >= ((_31_ + -16) & 4294967295L)) {
                break label$0;
            }
            this._storeInt((_32_ + 16), ((_31_ = this._loadInt((_32_ + 28))) + ((this._loadInt((_31_ + 4))) & -2)));
            this._storeInt((_31_ = this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 28))) + (this._loadInt((_32_ + 24)))))), ((_30_ = this._loadInt((_32_ + 24))) | 1));
            _31_ = this._storeInt((_31_ + 4), (((this._loadInt((_32_ + 20))) - _30_) | 1));
            this._storeInt((this._loadInt((_32_ + 16))), _31_);
            this._storeInt(((this._loadInt((_32_ + 28))) + 4), ((this._loadInt((_32_ + 24))) | 1));
            free(((this._loadInt((_32_ + 12))) + 8));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void free(int _30_)
    {
        int _31_ = 0;
        long _32_ = 0L;
        int _33_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), ((this._storeInt((_31_ + 60), _30_)) + -8));
        this._storeInt((_31_ + 36), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_31_ + 60))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    label$3:
                    do {
                        if (((this._loadInt8u(((this._loadInt((_31_ + 56))) + 4))) & 1) == 0) {
                            break label$3;
                        }
                        this._storeInt((_31_ + 48), (this._storeInt((_31_ + 44), ((this._loadInt(((this._loadInt((_31_ + 56))) + 4))) & -2))));
                        if ((this._loadInt((this._storeInt((_31_ + 52), ((_30_ = this._loadInt((_31_ + 56))) + ((this._loadInt((_30_ + 4))) & -2)))))) != (this._loadInt(((this._loadInt((_31_ + 56))) + 4)))) {
                            break label$0;
                        }
                        label$4:
                        while (true) {
                            label$6:
                            do {
                                if ((((this._loadInt((this._loadInt((_31_ + 56))))) & (this._loadInt(((this._loadInt((_31_ + 52))) + 4)))) & 1) == 0) {
                                    break label$6;
                                }
                                _30_ = this._storeInt(((this._loadInt((_31_ + 56))) + 4), ((this._loadInt((_31_ + 48))) | 1));
                                this._storeInt((this._loadInt((_31_ + 52))), _30_);
                                lock_bin((this._storeInt((_31_ + 32), (bin_index((this._loadInt((_31_ + 48))))))));
                                lock$2e$166(14060);
                                if ((((this._loadInt((this._loadInt((_31_ + 56))))) & (this._loadInt(((this._loadInt((_31_ + 52))) + 4)))) & 1) != 0) {
                                    break label$2;
                                }
                                unlock(14060);
                                unlock_bin((this._loadInt((_31_ + 32))));
                            }
                            while (false);
                            label$7:
                            do {
                                if ((alloc_rev((this._loadInt((_31_ + 56))))) == 0) {
                                    break label$7;
                                }
                                this._storeInt((_31_ + 48), ((this._storeInt((_31_ + 40), ((this._loadInt(((this._storeInt((_31_ + 56), ((_30_ = this._loadInt((_31_ + 56))) - ((this._loadInt(_30_)) & -2)))) + 4))) & -2))) + (this._loadInt((_31_ + 48)))));
                                if ((((this._loadInt((_31_ + 44))) + (this._loadInt((_31_ + 40)))) & 4294967295L) < (163841 & 4294967295L)) {
                                    break label$7;
                                }
                                if (((((this._loadInt((_31_ + 44))) + (_30_ = this._loadInt((_31_ + 40)))) ^ _30_) & 4294967295L) <= (_30_ & 4294967295L)) {
                                    break label$7;
                                }
                                this._storeInt((_31_ + 36), 1);
                            }
                            while (false);
                            if ((alloc_fwd((this._loadInt((_31_ + 52))))) == 0) {
                                continue label$4;
                            }
                            this._storeInt((_31_ + 48), ((this._storeInt((_31_ + 40), ((this._loadInt(((this._loadInt((_31_ + 52))) + 4))) & -2))) + (this._loadInt((_31_ + 48)))));
                            label$8:
                            do {
                                if ((((this._loadInt((_31_ + 44))) + (this._loadInt((_31_ + 40)))) & 4294967295L) < (163841 & 4294967295L)) {
                                    break label$8;
                                }
                                if (((((this._loadInt((_31_ + 44))) + (_30_ = this._loadInt((_31_ + 40)))) ^ _30_) & 4294967295L) <= (_30_ & 4294967295L)) {
                                    break label$8;
                                }
                                this._storeInt((_31_ + 36), 1);
                            }
                            while (false);
                            this._storeInt((_31_ + 52), ((_30_ = this._loadInt((_31_ + 52))) + ((this._loadInt((_30_ + 4))) & -2)));
                            continue label$4;
                        }
                    }
                    while (false);
                    _30_ = this._storeInt((_31_ + 28), (this._loadInt((this._loadInt((_31_ + 56))))));
                    this._storeInt((_31_ + 24), ((this._loadInt((_31_ + 56))) - _30_));
                    this._storeInt((_31_ + 20), (((this._loadInt(((this._loadInt((_31_ + 56))) + 4))) & -2) + (this._loadInt((_31_ + 28)))));
                    if (((this._loadInt8u((_31_ + 28))) & 1) != 0) {
                        break label$0;
                    }
                    this.__munmap.invoke((this._loadInt((_31_ + 24))), (this._loadInt((_31_ + 20))));
                    break label$1;
                }
                while (false);
                _32_ = this._loadLong32u((_31_ + 32));
                label$9:
                do {
                    if (((this._loadLong((0 + 13028))) & (1L << _32_)) != 0L) {
                        break label$9;
                    }
                    a_or_64(13028, (1L << (this._loadLong32u((_31_ + 32)))));
                }
                while (false);
                _30_ = this._storeInt(((this._loadInt((_31_ + 56))) + 4), (this._loadInt((_31_ + 48))));
                this._storeInt((this._loadInt((_31_ + 52))), _30_);
                unlock(14060);
                this._storeInt(((_30_ = this._loadInt((_31_ + 56))) + 8), ((_33_ = (this._loadInt((_31_ + 32))) << 4) + 13036));
                this._storeInt((_30_ + 12), (this._loadInt((_33_ + 13048))));
                this._storeInt(((this._loadInt(((_30_ = this._loadInt((_31_ + 56))) + 8))) + 12), _30_);
                this._storeInt(((this._loadInt(((_30_ = this._loadInt((_31_ + 56))) + 12))) + 8), _30_);
                label$10:
                do {
                    if ((this._loadInt((_31_ + 36))) == 0) {
                        break label$10;
                    }
                    this._storeInt((_31_ + 16), (((this._loadInt((_31_ + 56))) + 4111) & -4096));
                    _30_ = this._storeInt((_31_ + 12), (((this._loadInt((_31_ + 52))) + -16) & -4096));
                    this.__madvise.invoke((_33_ = this._loadInt((_31_ + 16))), (_30_ - _33_), 4);
                }
                while (false);
                unlock_bin((this._loadInt((_31_ + 32))));
            }
            while (false);
            this._storeInt((0 + 4), (_31_ + 64));
            return;
        }
        while (false);
        this.abort.invoke();
        throw (new UnreachableException());
    }

    @Override()
    public final int bin_index(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if (((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (((this._storeInt((_31_ + 8), _30_)) >>> 4) + -1))) & 4294967295L) > (32 & 4294967295L)) {
                break label$0;
            }
            this._storeInt((_31_ + 12), (this._loadInt((_31_ + 8))));
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        label$1:
        do {
            if (((this._loadInt((_31_ + 8))) & 4294967295L) < (7169 & 4294967295L)) {
                break label$1;
            }
            this._storeInt((_31_ + 12), 63);
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        this._storeFloat(_31_, ((float) (this._loadInt((_31_ + 8)))));
        this._storeInt((_31_ + 12), (((this._loadInt(_31_)) >>> 21) + -496));
        return (this._loadInt((_31_ + 12)));
    }

    @Override()
    public final void lock$2e$166(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        label$0:
        do {
            if ((this._loadInt((0 + 12952))) == 0) {
                break label$0;
            }
            label$2:
            do {
                label$1:
                while (true) {
                    if ((a_swap((this._loadInt((_31_ + 12))), 1)) == 0) {
                        break label$2;
                    }
                    this.__wait.invoke((_30_ = this._loadInt((_31_ + 12))), (_30_ + 4), 1, 1);
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void unlock(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)))) == 0) {
                break label$0;
            }
            a_store((this._loadInt((_31_ + 12))), 0);
            if ((this._loadInt(((this._loadInt((_31_ + 12))) + 4))) == 0) {
                break label$0;
            }
            __wake((this._loadInt((_31_ + 12))), 1, 1);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int alloc_fwd(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        label$0:
        do {
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if (((this._storeInt(_31_, (this._loadInt(((this._loadInt((_31_ + 8))) + 4))))) & 1) != 0) {
                            break label$1;
                        }
                        lock_bin((this._storeInt((_31_ + 4), (bin_index((this._loadInt(_31_)))))));
                        if ((this._loadInt(((this._loadInt((_31_ + 8))) + 4))) == (this._loadInt(_31_))) {
                            break label$3;
                        }
                        unlock_bin((this._loadInt((_31_ + 4))));
                        continue label$2;
                    }
                }
                while (false);
                unbin((this._loadInt((_31_ + 8))), (this._loadInt((_31_ + 4))));
                unlock_bin((this._loadInt((_31_ + 4))));
                this._storeInt((_31_ + 12), 1);
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
    public final void a_or_64(int _30_, long _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeLong((_32_ + 8), (this._storeLong((_32_ + 16), _31_)));
        label$0:
        do {
            if ((this._loadInt((_32_ + 8))) == 0) {
                break label$0;
            }
            a_or((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 8))));
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_32_ + 12))) == 0) {
                break label$1;
            }
            a_or(((this._loadInt((_32_ + 28))) + 4), (this._loadInt((_32_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void a_or(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        a_fetch_or((this._loadInt((_32_ + 12))), _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int a_fetch_or(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0$end:
        do {
            label$0:
            while (true) {
                this._storeInt((_32_ + 4), (this._loadInt((this._loadInt((_32_ + 12))))));
                if ((_a_cas((this._loadInt((_32_ + 12))), (_31_ = this._loadInt((_32_ + 4))), (_31_ | (this._loadInt((_32_ + 8)))))) != (this._loadInt((_32_ + 4)))) {
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
    public final int _a_cas(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        label$0:
        do {
            if ((this._storeInt(_33_, (this._loadInt((this._loadInt((_33_ + 12))))))) != (this._loadInt((_33_ + 8)))) {
                break label$0;
            }
            this._storeInt((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 4))));
        }
        while (false);
        return (this._loadInt(_33_));
    }

    @Override()
    public final void a_store(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        __syscall_ret((this.__syscall0.invoke(375)));
        this._storeInt((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))));
        __syscall_ret((this.__syscall0.invoke(375)));
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void __wake(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        label$0:
        do {
            if ((this._storeInt((_33_ + 4), _32_)) == 0) {
                break label$0;
            }
            this._storeInt((_33_ + 4), 128);
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_33_ + 8))) > -1) {
                break label$1;
            }
            this._storeInt((_33_ + 8), 2147483647);
        }
        while (false);
        label$2:
        do {
            if ((this.__syscall3.invoke(240, (this._loadInt((_33_ + 12))), ((this._loadInt((_33_ + 4))) | 1), (this._loadInt((_33_ + 8))))) != -38) {
                break label$2;
            }
            this.__syscall3.invoke(240, (this._loadInt((_33_ + 12))), 1, (this._loadInt((_33_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int a_swap(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0$end:
        do {
            label$0:
            while (true) {
                this._storeInt((_32_ + 4), (this._loadInt((this._loadInt((_32_ + 12))))));
                if ((_a_cas((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 4))), (this._loadInt((_32_ + 8))))) != (this._loadInt((_32_ + 4)))) {
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
    public final void a_and_64(int _30_, long _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeLong((_32_ + 8), (this._storeLong((_32_ + 16), _31_)));
        label$0:
        do {
            if ((this._loadInt((_32_ + 8))) == -1) {
                break label$0;
            }
            a_and((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 8))));
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_32_ + 12))) == -1) {
                break label$1;
            }
            a_and(((this._loadInt((_32_ + 28))) + 4), (this._loadInt((_32_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void a_and(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        a_fetch_and((this._loadInt((_32_ + 12))), _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int a_fetch_and(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0$end:
        do {
            label$0:
            while (true) {
                this._storeInt((_32_ + 4), (this._loadInt((this._loadInt((_32_ + 12))))));
                if ((_a_cas((this._loadInt((_32_ + 12))), (_31_ = this._loadInt((_32_ + 4))), (_31_ & (this._loadInt((_32_ + 8)))))) != (this._loadInt((_32_ + 4)))) {
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
    public final int a_ctz_64(long _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeLong(((_32_ = (this._loadInt((0 + 4))) - 32) + 16), _30_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 12), (this._loadInt((_32_ + 16))))) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 28), (this._loadInt8s((((((_31_ = this._loadInt((_32_ + 12))) & (0 - _31_)) * 124511785) >>> 27) + 14080))));
            return (this._loadInt((_32_ + 28)));
        }
        while (false);
        this._storeInt((_32_ + 28), ((this._loadInt8s((((((_31_ = this._storeInt((_32_ + 12), (this._loadInt((_32_ + 20))))) & (0 - _31_)) * 124511785) >>> 27) + 14080))) + 32));
        return (this._loadInt((_32_ + 28)));
    }

    @Override()
    public final int __malloc0(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (malloc((this._storeInt((_31_ + 12), _30_)))))) == 0) {
                break label$0;
            }
            if (((this._loadInt8u(((this._loadInt((_31_ + 8))) + -4))) & 1) == 0) {
                break label$0;
            }
            this._storeInt((_31_ + 12), (((this._loadInt((_31_ + 12))) + 3) >>> 2));
            this._storeInt((_31_ + 4), (this._loadInt((_31_ + 8))));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_31_ + 12))) == 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._loadInt((this._loadInt((_31_ + 4))))) == 0) {
                            break label$3;
                        }
                        this._storeInt((this._loadInt((_31_ + 4))), 0);
                    }
                    while (false);
                    this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 12))) + -1));
                    this._storeInt((_31_ + 4), ((this._loadInt((_31_ + 4))) + 4));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int realloc(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_32_ + 36), _31_);
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
                                            if ((this._loadInt((_32_ + 40))) == 0) {
                                                break label$8;
                                            }
                                            if ((adjust_size((_32_ + 36))) <= -1) {
                                                break label$7;
                                            }
                                            this._storeInt((_32_ + 32), ((_31_ = this._loadInt((_32_ + 40))) + -8));
                                            this._storeInt((_32_ + 20), (this._storeInt((_32_ + 24), ((this._loadInt((_31_ + -4))) & -2))));
                                            if (((this._loadInt8u(((this._loadInt((_32_ + 32))) + 4))) & 1) == 0) {
                                                break label$6;
                                            }
                                            if ((this._loadInt((this._storeInt((_32_ + 28), ((_31_ = this._loadInt((_32_ + 32))) + ((this._loadInt((_31_ + 4))) & -2)))))) != (this._loadInt(((this._loadInt((_32_ + 32))) + 4)))) {
                                                break label$0;
                                            }
                                            label$9:
                                            do {
                                                if (((this._loadInt((_32_ + 36))) & 4294967295L) <= ((this._loadInt((_32_ + 20))) & 4294967295L)) {
                                                    break label$9;
                                                }
                                                if ((alloc_fwd((this._loadInt((_32_ + 28))))) == 0) {
                                                    break label$9;
                                                }
                                                this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + ((this._loadInt(((this._loadInt((_32_ + 28))) + 4))) & -2)));
                                                this._storeInt((_32_ + 28), ((_31_ = this._loadInt((_32_ + 28))) + ((this._loadInt((_31_ + 4))) & -2)));
                                            }
                                            while (false);
                                            _30_ = this._storeInt(((this._loadInt((_32_ + 32))) + 4), ((_31_ = this._loadInt((_32_ + 20))) | 1));
                                            this._storeInt((this._loadInt((_32_ + 28))), _30_);
                                            if (((this._loadInt((_32_ + 36))) & 4294967295L) > (_31_ & 4294967295L)) {
                                                break label$5;
                                            }
                                            trim((this._loadInt((_32_ + 32))), (this._loadInt((_32_ + 36))));
                                            this._storeInt((_32_ + 44), ((this._loadInt((_32_ + 32))) + 8));
                                            break label$1;
                                        }
                                        while (false);
                                        this._storeInt((_32_ + 44), (malloc((this._loadInt((_32_ + 36))))));
                                        break label$1;
                                    }
                                    while (false);
                                    this._storeInt((_32_ + 44), 0);
                                    break label$1;
                                }
                                while (false);
                                _31_ = this._storeInt((_32_ + 12), (this._loadInt((this._loadInt((_32_ + 32))))));
                                this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 32))) - _31_));
                                this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 24))) + (this._loadInt((_32_ + 12)))));
                                this._storeInt(_32_, ((this._loadInt((_32_ + 36))) + (this._loadInt((_32_ + 12)))));
                                if (((this._loadInt8u((_32_ + 12))) & 1) != 0) {
                                    break label$0;
                                }
                                label$10:
                                do {
                                    if (((this._loadInt(_32_)) & 4294967295L) > (4095 & 4294967295L)) {
                                        break label$10;
                                    }
                                    if ((this._storeInt((_32_ + 16), (malloc((this._loadInt((_32_ + 36))))))) == 0) {
                                        break label$10;
                                    }
                                    memcpy((this._loadInt((_32_ + 16))), (this._loadInt((_32_ + 40))), ((this._loadInt((_32_ + 36))) + -8));
                                    free((this._loadInt((_32_ + 40))));
                                    this._storeInt((_32_ + 44), (this._loadInt((_32_ + 16))));
                                    break label$1;
                                }
                                while (false);
                                if ((this._storeInt(_32_, (((this._loadInt(_32_)) + 4095) & -4096))) != (this._loadInt((_32_ + 4)))) {
                                    break label$4;
                                }
                                this._storeInt((_32_ + 44), (this._loadInt((_32_ + 40))));
                                break label$1;
                            }
                            while (false);
                            if ((this._storeInt((_32_ + 16), (malloc(((this._loadInt((_32_ + 36))) + -8))))) == 0) {
                                break label$3;
                            }
                            memcpy((this._loadInt((_32_ + 16))), (this._loadInt((_32_ + 40))), ((this._loadInt((_32_ + 24))) + -8));
                            free(((this._loadInt((_32_ + 32))) + 8));
                            this._storeInt((_32_ + 44), (this._loadInt((_32_ + 16))));
                            break label$1;
                        }
                        while (false);
                        _31_ = 0;
                        if ((this._storeInt((_32_ + 8), (this.__mremap.invoke((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))), (this._loadInt(_32_)), 1, 0)))) == -1) {
                            break label$2;
                        }
                        this._storeInt(((_31_ = this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 8))) + (this._loadInt((_32_ + 12)))))) + 4), ((this._loadInt(_32_)) - (this._loadInt((_32_ + 12)))));
                        this._storeInt((_32_ + 44), (_31_ + 8));
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_32_ + 44), 0);
                    break label$1;
                }
                while (false);
                label$11:
                do {
                    if (((this._loadInt(_32_)) & 4294967295L) >= ((this._loadInt((_32_ + 4))) & 4294967295L)) {
                        break label$11;
                    }
                    _31_ = this._loadInt((_32_ + 40));
                }
                while (false);
                this._storeInt((_32_ + 44), _31_);
            }
            while (false);
            _31_ = this._loadInt((_32_ + 44));
            this._storeInt((0 + 4), (_32_ + 48));
            return _31_;
        }
        while (false);
        this.abort.invoke();
        throw (new UnreachableException());
    }

    @Override()
    public final int malloc_usable_size(int _30_)
    {
        return (((this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + -4))) & -2) + -8);
    }

    @Override()
    public final int __memalign(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        label$0:
        do {
            label$1:
            do {
                if (((_31_ = this._loadInt((_32_ + 24))) & (0 - _31_)) == _31_) {
                    break label$1;
                }
                this._storeInt((__errno_location()), 22);
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_32_ + 20))) & 4294967295L) <= (((this._loadInt((_32_ + 24))) ^ -1) & 4294967295L)) {
                    break label$2;
                }
                this._storeInt((__errno_location()), 12);
                this._storeInt((_32_ + 28), 0);
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
                            label$7:
                            do {
                                if (((this._loadInt((_32_ + 24))) & 4294967295L) > (16 & 4294967295L)) {
                                    break label$7;
                                }
                                if ((this._storeInt((_32_ + 16), (malloc((this._loadInt((_32_ + 20))))))) == 0) {
                                    break label$6;
                                }
                                this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
                                break label$0;
                            }
                            while (false);
                            if ((this._storeInt((_32_ + 16), (malloc((((this._loadInt((_32_ + 20))) + (this._loadInt((_32_ + 24)))) + -1))))) == 0) {
                                break label$5;
                            }
                            if ((this._storeInt((_32_ + 12), ((((this._loadInt((_32_ + 16))) + (_31_ = this._loadInt((_32_ + 24)))) + -1) & (0 - _31_)))) == (this._loadInt((_32_ + 16)))) {
                                break label$4;
                            }
                            this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 16))) + -4))));
                            if (((this._loadInt8u((_32_ + 4))) & 7) == 0) {
                                break label$3;
                            }
                            _31_ = this._storeInt(_32_, (this._loadInt(((this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 16))) + ((this._loadInt((_32_ + 4))) & -8)))) + -8))));
                            this._storeInt(((_30_ = this._loadInt((_32_ + 16))) + -4), (((this._loadInt((_32_ + 4))) & 7) | (_30_ = (_33_ = this._loadInt((_32_ + 12))) - _30_)));
                            this._storeInt((_33_ + -8), ((_31_ & 7) | _30_));
                            this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + -4), (((this._loadInt((_32_ + 4))) & 7) | ((this._loadInt((_32_ + 8))) - _31_)));
                            this._storeInt(((_31_ = this._loadInt((_32_ + 8))) + -8), (((this._loadInt(_32_)) & 7) | (_31_ - (this._loadInt((_32_ + 12))))));
                            free((this._loadInt((_32_ + 16))));
                            this._storeInt((_32_ + 28), (this._loadInt((_32_ + 12))));
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
                this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
                break label$0;
            }
            while (false);
            this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + -8), ((this._loadInt(((_30_ = this._loadInt((_32_ + 16))) + -8))) + (_33_ = _31_ - _30_)));
            this._storeInt((_31_ + -4), ((this._loadInt((_30_ + -4))) - _33_));
            this._storeInt((_32_ + 28), (this._loadInt((_32_ + 12))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int memccpy(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = (this._loadInt((0 + 4))) - 48) + 40), _30_);
        this._storeInt((_34_ + 36), _31_);
        this._storeInt((_34_ + 32), _32_);
        this._storeInt((_34_ + 28), _33_);
        this._storeInt((_34_ + 24), (this._loadInt((_34_ + 40))));
        this._storeInt((_34_ + 20), (this._loadInt((_34_ + 36))));
        this._storeInt((_34_ + 32), (this._loadInt8u((_34_ + 32))));
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt((_34_ + 20))) & 3) != ((this._loadInt((_34_ + 24))) & 3)) {
                    break label$1;
                }
                label$3:
                do {
                    label$2:
                    while (true) {
                        _33_ = 0;
                        label$4:
                        do {
                            if (((this._loadInt8u((_34_ + 20))) & 3) == 0) {
                                break label$4;
                            }
                            if ((this._loadInt((_34_ + 28))) == 0) {
                                break label$4;
                            }
                            _33_ = ((this._storeInt8((this._loadInt((_34_ + 24))), (this._loadInt8u((this._loadInt((_34_ + 20))))))) != (this._loadInt((_34_ + 32)))) ? 1 : 0;
                        }
                        while (false);
                        if (_33_ == 0) {
                            break label$3;
                        }
                        this._storeInt((_34_ + 28), ((this._loadInt((_34_ + 28))) + -1));
                        this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) + 1));
                        this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + 1));
                        continue label$2;
                    }
                }
                while (false);
                if (((this._loadInt8u((_34_ + 20))) & 3) != 0) {
                    break label$0;
                }
                this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 32))) * 16843009));
                this._storeInt((_34_ + 16), (this._loadInt((_34_ + 24))));
                this._storeInt((_34_ + 8), (this._loadInt((_34_ + 20))));
                label$6:
                do {
                    label$5:
                    while (true) {
                        _33_ = 0;
                        label$7:
                        do {
                            if (((this._loadInt((_34_ + 28))) & 4294967295L) < (4 & 4294967295L)) {
                                break label$7;
                            }
                            _33_ = (((((_33_ = (this._loadInt((this._loadInt((_34_ + 8))))) ^ (this._loadInt((_34_ + 12)))) + -16843009) & (_33_ ^ -1)) & -2139062144) == 0) ? 1 : 0;
                        }
                        while (false);
                        if (_33_ == 0) {
                            break label$6;
                        }
                        this._storeInt((this._loadInt((_34_ + 16))), (this._loadInt((this._loadInt((_34_ + 8))))));
                        this._storeInt((_34_ + 28), ((this._loadInt((_34_ + 28))) + -4));
                        this._storeInt((_34_ + 8), ((this._loadInt((_34_ + 8))) + 4));
                        this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) + 4));
                        continue label$5;
                    }
                }
                while (false);
                this._storeInt((_34_ + 24), (this._loadInt((_34_ + 16))));
                this._storeInt((_34_ + 20), (this._loadInt((_34_ + 8))));
            }
            while (false);
            label$9:
            do {
                label$8:
                while (true) {
                    _33_ = 0;
                    label$10:
                    do {
                        if ((this._loadInt((_34_ + 28))) == 0) {
                            break label$10;
                        }
                        _33_ = ((this._storeInt8((this._loadInt((_34_ + 24))), (this._loadInt8u((this._loadInt((_34_ + 20))))))) != (this._loadInt((_34_ + 32)))) ? 1 : 0;
                    }
                    while (false);
                    if (_33_ == 0) {
                        break label$9;
                    }
                    this._storeInt((_34_ + 28), ((this._loadInt((_34_ + 28))) + -1));
                    this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) + 1));
                    this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + 1));
                    continue label$8;
                }
            }
            while (false);
        }
        while (false);
        label$11:
        do {
            if ((this._loadInt8u((this._loadInt((_34_ + 20))))) != (this._loadInt((_34_ + 32)))) {
                break label$11;
            }
            this._storeInt((_34_ + 44), ((this._loadInt((_34_ + 24))) + 1));
            return (this._loadInt((_34_ + 44)));
        }
        while (false);
        this._storeInt((_34_ + 44), 0);
        return (this._loadInt((_34_ + 44)));
    }

    @Override()
    public final int memchr(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 32) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 16), (this._loadInt((_33_ + 28))));
        this._storeInt((_33_ + 24), (this._loadInt8u((_33_ + 24))));
        label$1:
        do {
            label$0:
            while (true) {
                _32_ = 0;
                label$2:
                do {
                    if (((this._loadInt8u((_33_ + 16))) & 3) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt((_33_ + 20))) == 0) {
                        break label$2;
                    }
                    _32_ = ((this._loadInt8u((this._loadInt((_33_ + 16))))) != (this._loadInt((_33_ + 24)))) ? 1 : 0;
                }
                while (false);
                if (_32_ == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + 1));
                this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -1));
                continue label$0;
            }
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt((_33_ + 20))) == 0) {
                break label$3;
            }
            if ((this._loadInt8u((this._loadInt((_33_ + 16))))) == (this._loadInt((_33_ + 24)))) {
                break label$3;
            }
            this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 24))) * 16843009));
            this._storeInt((_33_ + 12), (this._loadInt((_33_ + 16))));
            label$5:
            do {
                label$4:
                while (true) {
                    _32_ = 0;
                    label$6:
                    do {
                        if (((this._loadInt((_33_ + 20))) & 4294967295L) < (4 & 4294967295L)) {
                            break label$6;
                        }
                        _32_ = (((((_32_ = (this._loadInt((this._loadInt((_33_ + 12))))) ^ (this._loadInt((_33_ + 8)))) + -16843009) & (_32_ ^ -1)) & -2139062144) == 0) ? 1 : 0;
                    }
                    while (false);
                    if (_32_ == 0) {
                        break label$5;
                    }
                    this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 4));
                    this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -4));
                    continue label$4;
                }
            }
            while (false);
            this._storeInt((_33_ + 16), (this._loadInt((_33_ + 12))));
            label$8:
            do {
                label$7:
                while (true) {
                    _32_ = 0;
                    label$9:
                    do {
                        if ((this._loadInt((_33_ + 20))) == 0) {
                            break label$9;
                        }
                        _32_ = ((this._loadInt8u((this._loadInt((_33_ + 16))))) != (this._loadInt((_33_ + 24)))) ? 1 : 0;
                    }
                    while (false);
                    if (_32_ == 0) {
                        break label$8;
                    }
                    this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + 1));
                    this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -1));
                    continue label$7;
                }
            }
            while (false);
        }
        while (false);
        _32_ = 0;
        label$10:
        do {
            if ((this._loadInt((_33_ + 20))) == 0) {
                break label$10;
            }
            _32_ = this._loadInt((_33_ + 16));
        }
        while (false);
        return _32_;
    }

    @Override()
    public final int memcmp(int _30_, int _31_, int _32_)
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
                _32_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_33_ + 20))) == 0) {
                        break label$2;
                    }
                    _32_ = ((this._loadInt8u((this._loadInt((_33_ + 16))))) == (this._loadInt8u((this._loadInt((_33_ + 12)))))) ? 1 : 0;
                }
                while (false);
                if (_32_ == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -1));
                this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + 1));
                this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 1));
                continue label$0;
            }
        }
        while (false);
        _32_ = 0;
        label$3:
        do {
            if ((this._loadInt((_33_ + 20))) == 0) {
                break label$3;
            }
            _32_ = (this._loadInt8u((this._loadInt((_33_ + 16))))) - (this._loadInt8u((this._loadInt((_33_ + 12)))));
        }
        while (false);
        return _32_;
    }

    @Override()
    public final int memcpy(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        this._storeInt((_33_ + 12), (this._loadInt((_33_ + 24))));
        this._storeInt((_33_ + 8), (this._loadInt((_33_ + 20))));
        label$1:
        do {
            label$0:
            while (true) {
                _32_ = 0;
                label$2:
                do {
                    if (((this._loadInt8u((_33_ + 8))) & 3) == 0) {
                        break label$2;
                    }
                    _32_ = ((this._loadInt((_33_ + 16))) != 0) ? 1 : 0;
                }
                while (false);
                if (_32_ == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
                _32_ = this._loadInt8u(_32_);
                this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
                this._storeInt8(_31_, _32_);
                this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + -1));
                continue label$0;
            }
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
                        if (((this._loadInt8u((_33_ + 12))) & 3) == 0) {
                            break label$6;
                        }
                        if (((this._loadInt((_33_ + 16))) & 4294967295L) < (32 & 4294967295L)) {
                            break label$3;
                        }
                        if ((_32_ = (this._loadInt((_33_ + 12))) & 3) == 3) {
                            break label$5;
                        }
                        if (_32_ == 2) {
                            break label$4;
                        }
                        if (_32_ != 1) {
                            break label$3;
                        }
                        this._storeInt((_33_ + 4), (this._loadInt((this._loadInt((_33_ + 8))))));
                        this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
                        _32_ = this._loadInt8u(_32_);
                        this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
                        this._storeInt8(_31_, _32_);
                        this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
                        _32_ = this._loadInt8u(_32_);
                        this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
                        this._storeInt8(_31_, _32_);
                        this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
                        _32_ = this._loadInt8u(_32_);
                        this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
                        this._storeInt8(_31_, _32_);
                        this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + -3));
                        label$7:
                        while (true) {
                            if (((this._loadInt((_33_ + 16))) & 4294967295L) < (17 & 4294967295L)) {
                                break label$3;
                            }
                            _32_ = this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 8))) + 1))));
                            this._storeInt((this._loadInt((_33_ + 12))), ((this._loadInt8u((_33_ + 7))) | (_32_ << 8)));
                            _32_ = this._storeInt((_33_ + 4), (this._loadInt(((this._loadInt((_33_ + 8))) + 5))));
                            this._storeInt(((this._loadInt((_33_ + 12))) + 4), ((this._loadInt8u((_33_ + 3))) | (_32_ << 8)));
                            _32_ = this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 8))) + 9))));
                            this._storeInt(((this._loadInt((_33_ + 12))) + 8), ((this._loadInt8u((_33_ + 7))) | (_32_ << 8)));
                            _32_ = this._storeInt((_33_ + 4), (this._loadInt(((this._loadInt((_33_ + 8))) + 13))));
                            this._storeInt(((this._loadInt((_33_ + 12))) + 12), ((this._loadInt8u((_33_ + 3))) | (_32_ << 8)));
                            this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) + 16));
                            this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 16));
                            this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + -16));
                            continue label$7;
                        }
                    }
                    while (false);
                    label$10:
                    do {
                        label$9:
                        while (true) {
                            if (((this._loadInt((_33_ + 16))) & 4294967295L) < (16 & 4294967295L)) {
                                break label$10;
                            }
                            this._storeInt((this._loadInt((_33_ + 12))), (this._loadInt((this._loadInt((_33_ + 8))))));
                            this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 4), (this._loadInt(((_31_ = this._loadInt((_33_ + 8))) + 4))));
                            this._storeInt((_32_ + 8), (this._loadInt((_31_ + 8))));
                            this._storeInt(((this._loadInt((_33_ + 12))) + 12), (this._loadInt(((this._loadInt((_33_ + 8))) + 12))));
                            this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) + 16));
                            this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 16));
                            this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + -16));
                            continue label$9;
                        }
                    }
                    while (false);
                    label$11:
                    do {
                        if (((this._loadInt8u((_33_ + 16))) & 8) == 0) {
                            break label$11;
                        }
                        this._storeInt((this._loadInt((_33_ + 12))), (this._loadInt((this._loadInt((_33_ + 8))))));
                        this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 4), (this._loadInt(((this._loadInt((_33_ + 8))) + 4))));
                        this._storeInt((_33_ + 12), (_32_ + 8));
                        this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) + 8));
                    }
                    while (false);
                    label$12:
                    do {
                        if (((this._loadInt8u((_33_ + 16))) & 4) == 0) {
                            break label$12;
                        }
                        this._storeInt((this._loadInt((_33_ + 12))), (this._loadInt((this._loadInt((_33_ + 8))))));
                        this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 4));
                        this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) + 4));
                    }
                    while (false);
                    label$13:
                    do {
                        if (((this._loadInt8u((_33_ + 16))) & 2) == 0) {
                            break label$13;
                        }
                        this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
                        _32_ = this._loadInt8u(_32_);
                        this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
                        this._storeInt8(_31_, _32_);
                        this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
                        _32_ = this._loadInt8u(_32_);
                        this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
                        this._storeInt8(_31_, _32_);
                    }
                    while (false);
                    label$14:
                    do {
                        if (((this._loadInt8u((_33_ + 16))) & 1) == 0) {
                            break label$14;
                        }
                        this._storeInt8((this._loadInt((_33_ + 12))), (this._loadInt8u((this._loadInt((_33_ + 8))))));
                    }
                    while (false);
                    this._storeInt((_33_ + 28), (this._loadInt((_33_ + 24))));
                    return (this._loadInt((_33_ + 28)));
                }
                while (false);
                this._storeInt((_33_ + 4), (this._loadInt((this._loadInt((_33_ + 8))))));
                this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
                _32_ = this._loadInt8u(_32_);
                this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
                this._storeInt8(_31_, _32_);
                this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + -1));
                label$15:
                while (true) {
                    if (((this._loadInt((_33_ + 16))) & 4294967295L) < (19 & 4294967295L)) {
                        break label$3;
                    }
                    _32_ = this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 8))) + 3))));
                    this._storeInt((this._loadInt((_33_ + 12))), (((this._loadInt((_33_ + 4))) >>> 8) | (_32_ << 24)));
                    _32_ = this._storeInt((_33_ + 4), (this._loadInt(((this._loadInt((_33_ + 8))) + 7))));
                    this._storeInt(((this._loadInt((_33_ + 12))) + 4), (((this._loadInt(_33_)) >>> 8) | (_32_ << 24)));
                    _32_ = this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 8))) + 11))));
                    this._storeInt(((this._loadInt((_33_ + 12))) + 8), (((this._loadInt((_33_ + 4))) >>> 8) | (_32_ << 24)));
                    _32_ = this._storeInt((_33_ + 4), (this._loadInt(((this._loadInt((_33_ + 8))) + 15))));
                    this._storeInt(((this._loadInt((_33_ + 12))) + 12), (((this._loadInt(_33_)) >>> 8) | (_32_ << 24)));
                    this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) + 16));
                    this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 16));
                    this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + -16));
                    continue label$15;
                }
            }
            while (false);
            this._storeInt((_33_ + 4), (this._loadInt((this._loadInt((_33_ + 8))))));
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + -2));
            label$18:
            do {
                label$17:
                while (true) {
                    if (((this._loadInt((_33_ + 16))) & 4294967295L) < (18 & 4294967295L)) {
                        break label$18;
                    }
                    _32_ = this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 8))) + 2))));
                    this._storeInt((this._loadInt((_33_ + 12))), ((this._loadInt16u((_33_ + 6))) | (_32_ << 16)));
                    _32_ = this._storeInt((_33_ + 4), (this._loadInt(((this._loadInt((_33_ + 8))) + 6))));
                    this._storeInt(((this._loadInt((_33_ + 12))) + 4), ((this._loadInt16u((_33_ + 2))) | (_32_ << 16)));
                    _32_ = this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 8))) + 10))));
                    this._storeInt(((this._loadInt((_33_ + 12))) + 8), ((this._loadInt16u((_33_ + 6))) | (_32_ << 16)));
                    _32_ = this._storeInt((_33_ + 4), (this._loadInt(((this._loadInt((_33_ + 8))) + 14))));
                    this._storeInt(((this._loadInt((_33_ + 12))) + 12), ((this._loadInt16u((_33_ + 2))) | (_32_ << 16)));
                    this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) + 16));
                    this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 16));
                    this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + -16));
                    continue label$17;
                }
            }
            while (false);
        }
        while (false);
        label$19:
        do {
            if (((this._loadInt8u((_33_ + 16))) & 16) == 0) {
                break label$19;
            }
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
        }
        while (false);
        label$20:
        do {
            if (((this._loadInt8u((_33_ + 16))) & 8) == 0) {
                break label$20;
            }
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
        }
        while (false);
        label$21:
        do {
            if (((this._loadInt8u((_33_ + 16))) & 4) == 0) {
                break label$21;
            }
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
        }
        while (false);
        label$22:
        do {
            if (((this._loadInt8u((_33_ + 16))) & 2) == 0) {
                break label$22;
            }
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
            _32_ = this._loadInt8u(_32_);
            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
            this._storeInt8(_31_, _32_);
        }
        while (false);
        label$23:
        do {
            if (((this._loadInt8u((_33_ + 16))) & 1) == 0) {
                break label$23;
            }
            this._storeInt8((this._loadInt((_33_ + 12))), (this._loadInt8u((this._loadInt((_33_ + 8))))));
        }
        while (false);
        this._storeInt((_33_ + 28), (this._loadInt((_33_ + 24))));
        return (this._loadInt((_33_ + 28)));
    }

    @Override()
    public final int memmem(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_34_ + 20), _31_);
        this._storeInt((_34_ + 16), _32_);
        this._storeInt((_34_ + 12), _33_);
        this._storeInt((_34_ + 8), (this._loadInt((_34_ + 24))));
        this._storeInt((_34_ + 4), (this._loadInt((_34_ + 16))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_34_ + 12))) == 0) {
                        break label$2;
                    }
                    if (((this._loadInt((_34_ + 20))) & 4294967295L) >= ((this._loadInt((_34_ + 12))) & 4294967295L)) {
                        break label$1;
                    }
                    this._storeInt((_34_ + 28), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_34_ + 28), (this._loadInt((_34_ + 8))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if ((this._storeInt((_34_ + 8), (memchr((this._loadInt((_34_ + 24))), (this._loadInt8u((this._loadInt((_34_ + 4))))), (this._loadInt((_34_ + 20))))))) == 0) {
                        break label$4;
                    }
                    if ((this._loadInt((_34_ + 12))) != 1) {
                        break label$3;
                    }
                }
                while (false);
                this._storeInt((_34_ + 28), (this._loadInt((_34_ + 8))));
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) - ((this._loadInt((_34_ + 8))) - (this._loadInt((_34_ + 24))))));
            label$5:
            do {
                if ((this._loadInt((_34_ + 12))) != 2) {
                    break label$5;
                }
                this._storeInt((_34_ + 28), (twobyte_memmem((this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 4))))));
                break label$0;
            }
            while (false);
            label$6:
            do {
                if ((this._loadInt((_34_ + 12))) != 3) {
                    break label$6;
                }
                this._storeInt((_34_ + 28), (threebyte_memmem((this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 4))))));
                break label$0;
            }
            while (false);
            label$7:
            do {
                if ((this._loadInt((_34_ + 12))) != 4) {
                    break label$7;
                }
                this._storeInt((_34_ + 28), (fourbyte_memmem((this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 4))))));
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 28), (twoway_memmem((_33_ = this._loadInt((_34_ + 8))), (_33_ + (this._loadInt((_34_ + 20)))), (this._loadInt((_34_ + 4))), (this._loadInt((_34_ + 12))))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 28));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final int twobyte_memmem(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt16((_33_ + 14), (((this._loadInt8u((_32_ = this._storeInt((_33_ + 16), _32_)))) << 8) | (this._loadInt8u((_32_ + 1)))));
        this._storeInt16((_33_ + 12), (((this._loadInt8u((_32_ = this._loadInt((_33_ + 24))))) << 8) | (this._loadInt8u((_32_ + 1)))));
        this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + 1));
        this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -1));
        label$0:
        do {
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_33_ + 20))) == 0) {
                        break label$0;
                    }
                    if ((this._loadInt16u((_33_ + 12))) == (this._loadInt16u((_33_ + 14)))) {
                        break label$2;
                    }
                    this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -1));
                    _32_ = this._loadInt16u((_33_ + 12));
                    this._storeInt((_33_ + 24), ((_31_ = this._loadInt((_33_ + 24))) + 1));
                    this._storeInt16((_33_ + 12), ((_32_ << 8) | (this._loadInt8u((_31_ + 1)))));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 24))) + -1));
            return (this._loadInt((_33_ + 28)));
        }
        while (false);
        this._storeInt((_33_ + 28), 0);
        return (this._loadInt((_33_ + 28)));
    }

    @Override()
    public final int threebyte_memmem(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 12), ((((this._loadInt8u((_32_ = this._storeInt((_33_ + 16), _32_)))) << 24) | ((this._loadInt8u((_32_ + 1))) << 16)) | ((this._loadInt8u((_32_ + 2))) << 8)));
        this._storeInt((_33_ + 8), ((((this._loadInt8u((_32_ = this._loadInt((_33_ + 24))))) << 24) | ((this._loadInt8u((_32_ + 1))) << 16)) | ((this._loadInt8u((_32_ + 2))) << 8)));
        this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + 2));
        this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -2));
        label$0:
        do {
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_33_ + 20))) == 0) {
                        break label$0;
                    }
                    if ((this._loadInt((_33_ + 8))) == (this._loadInt((_33_ + 12)))) {
                        break label$2;
                    }
                    this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -1));
                    _32_ = this._loadInt((_33_ + 8));
                    this._storeInt((_33_ + 24), ((_31_ = this._loadInt((_33_ + 24))) + 1));
                    this._storeInt((_33_ + 8), ((_32_ | (this._loadInt8u((_31_ + 1)))) << 8));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 24))) + -2));
            return (this._loadInt((_33_ + 28)));
        }
        while (false);
        this._storeInt((_33_ + 28), 0);
        return (this._loadInt((_33_ + 28)));
    }

    @Override()
    public final int fourbyte_memmem(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 12), (((((this._loadInt8u((_32_ = this._storeInt((_33_ + 16), _32_)))) << 24) | ((this._loadInt8u((_32_ + 1))) << 16)) | ((this._loadInt8u((_32_ + 2))) << 8)) | (this._loadInt8u((_32_ + 3)))));
        this._storeInt((_33_ + 8), (((((this._loadInt8u((_32_ = this._loadInt((_33_ + 24))))) << 24) | ((this._loadInt8u((_32_ + 1))) << 16)) | ((this._loadInt8u((_32_ + 2))) << 8)) | (this._loadInt8u((_32_ + 3)))));
        this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + 3));
        this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -3));
        label$0:
        do {
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_33_ + 20))) == 0) {
                        break label$0;
                    }
                    if ((this._loadInt((_33_ + 8))) == (this._loadInt((_33_ + 12)))) {
                        break label$2;
                    }
                    this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -1));
                    _32_ = this._loadInt((_33_ + 8));
                    this._storeInt((_33_ + 24), ((_31_ = this._loadInt((_33_ + 24))) + 1));
                    this._storeInt((_33_ + 8), ((_32_ << 8) | (this._loadInt8u((_31_ + 1)))));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 24))) + -3));
            return (this._loadInt((_33_ + 28)));
        }
        while (false);
        this._storeInt((_33_ + 28), 0);
        return (this._loadInt((_33_ + 28)));
    }

    @Override()
    public final int twoway_memmem(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeLong(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 1120))) + 1040), (this._storeLong((_34_ + 1048), 0L)));
        this._storeInt((_34_ + 1112), _30_);
        this._storeInt((_34_ + 1108), _31_);
        this._storeInt((_34_ + 1104), _32_);
        this._storeInt((_34_ + 1100), _33_);
        this._storeInt((_34_ + 1096), (this._storeInt((_34_ + 1028), (this._storeInt((_34_ + 1032), (this._storeInt((_34_ + 1036), (this._storeInt((_34_ + 1024), 0)))))))));
        label$1:
        do {
            label$0:
            while (true) {
                if (((this._loadInt((_34_ + 1096))) & 4294967295L) >= ((this._loadInt((_34_ + 1100))) & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((_31_ = (_34_ + 1024) + (((_33_ = this._loadInt8u(((this._loadInt((_34_ + 1104))) + (_32_ = this._loadInt((_34_ + 1096)))))) >>> 3) & 28)), ((this._loadInt(_31_)) | (1 << (_33_ & 31))));
                this._storeInt((_34_ + (_33_ << 2)), (_32_ + 1));
                this._storeInt((_34_ + 1096), ((this._loadInt((_34_ + 1096))) + 1));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((_34_ + 1092), -1);
        this._storeInt((_34_ + 1088), 0);
        _31_ = this._storeInt((_34_ + 1084), (this._storeInt((_34_ + 1080), 1)));
        label$3:
        do {
            label$2:
            while (true) {
                if ((((this._loadInt((_34_ + 1088))) + (this._loadInt((_34_ + 1084)))) & 4294967295L) >= ((this._loadInt((_34_ + 1100))) & 4294967295L)) {
                    break label$3;
                }
                label$4:
                do {
                    label$5:
                    do {
                        if ((this._loadInt8u(((_33_ = this._loadInt((_34_ + 1104))) + ((this._loadInt((_34_ + 1092))) + (_32_ = this._loadInt((_34_ + 1084))))))) != (this._loadInt8u((_33_ + ((this._loadInt((_34_ + 1088))) + _32_))))) {
                            break label$5;
                        }
                        if ((this._loadInt((_34_ + 1084))) != (this._loadInt((_34_ + 1080)))) {
                            break label$4;
                        }
                        this._storeInt((_34_ + 1088), ((this._loadInt((_34_ + 1088))) + (this._loadInt((_34_ + 1080)))));
                        this._storeInt((_34_ + 1084), _31_);
                        continue label$2;
                    }
                    while (false);
                    label$6:
                    do {
                        if ((this._loadInt8u(((_33_ = this._loadInt((_34_ + 1104))) + ((this._loadInt((_34_ + 1092))) + (_32_ = this._loadInt((_34_ + 1084))))))) > (this._loadInt8u((_33_ + ((this._loadInt((_34_ + 1088))) + _32_))))) {
                            break label$6;
                        }
                        this._storeInt((_34_ + 1088), ((_33_ = this._loadInt((_34_ + 1088))) + _31_));
                        this._storeInt((_34_ + 1092), _33_);
                        this._storeInt((_34_ + 1084), (this._storeInt((_34_ + 1080), _31_)));
                        continue label$2;
                    }
                    while (false);
                    this._storeInt((_34_ + 1088), ((this._loadInt((_34_ + 1088))) + (this._loadInt((_34_ + 1084)))));
                    this._storeInt((_34_ + 1084), _31_);
                    this._storeInt((_34_ + 1080), ((this._loadInt((_34_ + 1088))) - (this._loadInt((_34_ + 1092)))));
                    continue label$2;
                }
                while (false);
                this._storeInt((_34_ + 1084), ((this._loadInt((_34_ + 1084))) + _31_));
                continue label$2;
            }
        }
        while (false);
        this._storeInt((_34_ + 1076), (this._loadInt((_34_ + 1092))));
        this._storeInt((_34_ + 1072), (this._loadInt((_34_ + 1080))));
        this._storeInt((_34_ + 1092), -1);
        this._storeInt((_34_ + 1088), 0);
        _31_ = this._storeInt((_34_ + 1084), (this._storeInt((_34_ + 1080), 1)));
        label$8:
        do {
            label$7:
            while (true) {
                if ((((this._loadInt((_34_ + 1088))) + (this._loadInt((_34_ + 1084)))) & 4294967295L) >= ((this._loadInt((_34_ + 1100))) & 4294967295L)) {
                    break label$8;
                }
                label$9:
                do {
                    label$10:
                    do {
                        if ((this._loadInt8u(((_33_ = this._loadInt((_34_ + 1104))) + ((this._loadInt((_34_ + 1092))) + (_32_ = this._loadInt((_34_ + 1084))))))) != (this._loadInt8u((_33_ + ((this._loadInt((_34_ + 1088))) + _32_))))) {
                            break label$10;
                        }
                        if ((this._loadInt((_34_ + 1084))) != (this._loadInt((_34_ + 1080)))) {
                            break label$9;
                        }
                        this._storeInt((_34_ + 1088), ((this._loadInt((_34_ + 1088))) + (this._loadInt((_34_ + 1080)))));
                        this._storeInt((_34_ + 1084), _31_);
                        continue label$7;
                    }
                    while (false);
                    label$11:
                    do {
                        if ((this._loadInt8u(((_33_ = this._loadInt((_34_ + 1104))) + ((this._loadInt((_34_ + 1092))) + (_32_ = this._loadInt((_34_ + 1084))))))) < (this._loadInt8u((_33_ + ((this._loadInt((_34_ + 1088))) + _32_))))) {
                            break label$11;
                        }
                        this._storeInt((_34_ + 1088), ((_33_ = this._loadInt((_34_ + 1088))) + _31_));
                        this._storeInt((_34_ + 1092), _33_);
                        this._storeInt((_34_ + 1084), (this._storeInt((_34_ + 1080), _31_)));
                        continue label$7;
                    }
                    while (false);
                    this._storeInt((_34_ + 1088), ((this._loadInt((_34_ + 1088))) + (this._loadInt((_34_ + 1084)))));
                    this._storeInt((_34_ + 1084), _31_);
                    this._storeInt((_34_ + 1080), ((this._loadInt((_34_ + 1088))) - (this._loadInt((_34_ + 1092)))));
                    continue label$7;
                }
                while (false);
                this._storeInt((_34_ + 1084), ((this._loadInt((_34_ + 1084))) + _31_));
                continue label$7;
            }
        }
        while (false);
        label$12:
        do {
            label$13:
            do {
                if ((((this._loadInt((_34_ + 1092))) + 1) & 4294967295L) <= (((this._loadInt((_34_ + 1076))) + 1) & 4294967295L)) {
                    break label$13;
                }
                this._storeInt((_34_ + 1076), (this._loadInt((_34_ + 1092))));
                break label$12;
            }
            while (false);
            this._storeInt((_34_ + 1080), (this._loadInt((_34_ + 1072))));
        }
        while (false);
        label$14:
        do {
            label$15:
            do {
                label$16:
                do {
                    label$17:
                    do {
                        if ((memcmp((_33_ = this._loadInt((_34_ + 1104))), (_33_ + (this._loadInt((_34_ + 1080)))), ((this._loadInt((_34_ + 1076))) + 1))) == 0) {
                            break label$17;
                        }
                        this._storeInt((_34_ + 1064), 0);
                        if (((_33_ = this._loadInt((_34_ + 1076))) & 4294967295L) <= ((((this._loadInt((_34_ + 1100))) - _33_) + -1) & 4294967295L)) {
                            break label$16;
                        }
                        _33_ = this._loadInt((_34_ + 1076));
                        break label$15;
                    }
                    while (false);
                    this._storeInt((_34_ + 1064), ((this._loadInt((_34_ + 1100))) - (this._loadInt((_34_ + 1080)))));
                    break label$14;
                }
                while (false);
                _33_ = ((this._loadInt((_34_ + 1100))) - (this._loadInt((_34_ + 1076)))) + -1;
            }
            while (false);
            this._storeInt((_34_ + 1080), (_33_ + 1));
        }
        while (false);
        _32_ = this._storeInt((_34_ + 1068), 0);
        label$18:
        do {
            label$19:
            do {
                label$21:
                do {
                    label$20:
                    while (true) {
                        if ((((this._loadInt((_34_ + 1108))) - (this._loadInt((_34_ + 1112)))) & 4294967295L) < ((this._loadInt((_34_ + 1100))) & 4294967295L)) {
                            break label$21;
                        }
                        label$22:
                        do {
                            label$23:
                            do {
                                if (((this._loadInt(((_34_ + 1024) + (((_33_ = this._loadInt8u((((this._loadInt((_34_ + 1112))) + (this._loadInt((_34_ + 1100)))) + -1))) >>> 3) & 28)))) & (1 << (_33_ & 31))) == 0) {
                                    break label$23;
                                }
                                if ((this._storeInt((_34_ + 1084), ((_33_ = this._loadInt((_34_ + 1100))) - (this._loadInt((_34_ + ((this._loadInt8u(((_33_ + (this._loadInt((_34_ + 1112)))) + -1))) << 2))))))) == 0) {
                                    break label$22;
                                }
                                label$24:
                                do {
                                    if ((this._loadInt((_34_ + 1064))) == 0) {
                                        break label$24;
                                    }
                                    if ((this._loadInt((_34_ + 1068))) == 0) {
                                        break label$24;
                                    }
                                    if (((this._loadInt((_34_ + 1084))) & 4294967295L) >= ((this._loadInt((_34_ + 1080))) & 4294967295L)) {
                                        break label$24;
                                    }
                                    this._storeInt((_34_ + 1084), ((this._loadInt((_34_ + 1100))) - (this._loadInt((_34_ + 1080)))));
                                }
                                while (false);
                                this._storeInt((_34_ + 1112), ((this._loadInt((_34_ + 1112))) + (this._loadInt((_34_ + 1084)))));
                                this._storeInt((_34_ + 1068), _32_);
                                continue label$20;
                            }
                            while (false);
                            this._storeInt((_34_ + 1112), ((this._loadInt((_34_ + 1112))) + (this._loadInt((_34_ + 1100)))));
                            this._storeInt((_34_ + 1068), _32_);
                            continue label$20;
                        }
                        while (false);
                        label$25:
                        do {
                            label$26:
                            do {
                                if ((((this._loadInt((_34_ + 1076))) + 1) & 4294967295L) <= ((this._loadInt((_34_ + 1068))) & 4294967295L)) {
                                    break label$26;
                                }
                                _33_ = (this._loadInt((_34_ + 1076))) + 1;
                                break label$25;
                            }
                            while (false);
                            _33_ = this._loadInt((_34_ + 1068));
                        }
                        while (false);
                        this._storeInt((_34_ + 1084), _33_);
                        label$28:
                        do {
                            label$27:
                            while (true) {
                                _33_ = 0;
                                label$29:
                                do {
                                    if (((this._loadInt((_34_ + 1084))) & 4294967295L) >= ((this._loadInt((_34_ + 1100))) & 4294967295L)) {
                                        break label$29;
                                    }
                                    _33_ = ((this._loadInt8u(((this._loadInt((_34_ + 1104))) + (_33_ = this._loadInt((_34_ + 1084)))))) == (this._loadInt8u(((this._loadInt((_34_ + 1112))) + _33_)))) ? 1 : 0;
                                }
                                while (false);
                                if (_33_ == 0) {
                                    break label$28;
                                }
                                this._storeInt((_34_ + 1084), ((this._loadInt((_34_ + 1084))) + 1));
                                continue label$27;
                            }
                        }
                        while (false);
                        label$30:
                        do {
                            if (((this._loadInt((_34_ + 1084))) & 4294967295L) >= ((this._loadInt((_34_ + 1100))) & 4294967295L)) {
                                break label$30;
                            }
                            this._storeInt((_34_ + 1112), ((this._loadInt((_34_ + 1112))) + ((this._loadInt((_34_ + 1084))) - (this._loadInt((_34_ + 1076))))));
                            this._storeInt((_34_ + 1068), _32_);
                            continue label$20;
                        }
                        while (false);
                        this._storeInt((_34_ + 1084), ((this._loadInt((_34_ + 1076))) + 1));
                        label$32:
                        do {
                            label$31:
                            while (true) {
                                _33_ = 0;
                                label$33:
                                do {
                                    if (((this._loadInt((_34_ + 1084))) & 4294967295L) <= ((this._loadInt((_34_ + 1068))) & 4294967295L)) {
                                        break label$33;
                                    }
                                    _33_ = ((this._loadInt8u(((this._loadInt((_34_ + 1104))) + (_33_ = (this._loadInt((_34_ + 1084))) + -1)))) == (this._loadInt8u(((this._loadInt((_34_ + 1112))) + _33_)))) ? 1 : 0;
                                }
                                while (false);
                                if (_33_ == 0) {
                                    break label$32;
                                }
                                this._storeInt((_34_ + 1084), ((this._loadInt((_34_ + 1084))) + -1));
                                continue label$31;
                            }
                        }
                        while (false);
                        if (((this._loadInt((_34_ + 1084))) & 4294967295L) <= ((this._loadInt((_34_ + 1068))) & 4294967295L)) {
                            break label$19;
                        }
                        this._storeInt((_34_ + 1112), ((this._loadInt((_34_ + 1112))) + (this._loadInt((_34_ + 1080)))));
                        this._storeInt((_34_ + 1068), (this._loadInt((_34_ + 1064))));
                        continue label$20;
                    }
                }
                while (false);
                this._storeInt((_34_ + 1116), 0);
                break label$18;
            }
            while (false);
            this._storeInt((_34_ + 1116), (this._loadInt((_34_ + 1112))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 1116));
        this._storeInt((0 + 4), (_34_ + 1120));
        return _33_;
    }

    @Override()
    public final int memmove(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        this._storeInt((_33_ + 12), (this._loadInt((_33_ + 24))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._storeInt((_33_ + 8), (this._loadInt((_33_ + 20))))) == (this._loadInt((_33_ + 12)))) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((((this._loadInt((_33_ + 8))) + (this._loadInt((_33_ + 16)))) & 4294967295L) <= ((this._loadInt((_33_ + 12))) & 4294967295L)) {
                            break label$3;
                        }
                        if ((((this._loadInt((_33_ + 12))) + (this._loadInt((_33_ + 16)))) & 4294967295L) > ((this._loadInt((_33_ + 8))) & 4294967295L)) {
                            break label$1;
                        }
                    }
                    while (false);
                    this._storeInt((_33_ + 28), (memcpy((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 16))))));
                    break label$0;
                }
                while (false);
                this._storeInt((_33_ + 28), (this._loadInt((_33_ + 12))));
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
                                    if (((this._loadInt((_33_ + 12))) & 4294967295L) >= ((this._loadInt((_33_ + 8))) & 4294967295L)) {
                                        break label$9;
                                    }
                                    if (((this._loadInt((_33_ + 8))) & 3) != ((this._loadInt((_33_ + 12))) & 3)) {
                                        break label$7;
                                    }
                                    label$11:
                                    do {
                                        label$10:
                                        while (true) {
                                            if (((this._loadInt8u((_33_ + 12))) & 3) == 0) {
                                                break label$8;
                                            }
                                            this._storeInt((_33_ + 16), ((_32_ = this._loadInt((_33_ + 16))) + -1));
                                            if (_32_ == 0) {
                                                break label$11;
                                            }
                                            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
                                            _32_ = this._loadInt8u(_32_);
                                            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
                                            this._storeInt8(_31_, _32_);
                                            continue label$10;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_33_ + 28), (this._loadInt((_33_ + 24))));
                                    break label$0;
                                }
                                while (false);
                                if (((this._loadInt((_33_ + 8))) & 3) != ((this._loadInt((_33_ + 12))) & 3)) {
                                    break label$5;
                                }
                                label$13:
                                do {
                                    label$12:
                                    while (true) {
                                        if ((((this._loadInt((_33_ + 12))) + (this._loadInt((_33_ + 16)))) & 3) == 0) {
                                            break label$6;
                                        }
                                        this._storeInt((_33_ + 16), ((_32_ = this._loadInt((_33_ + 16))) + -1));
                                        if (_32_ == 0) {
                                            break label$13;
                                        }
                                        this._storeInt8(((this._loadInt((_33_ + 12))) + (_32_ = this._loadInt((_33_ + 16)))), (this._loadInt8u(((this._loadInt((_33_ + 8))) + _32_))));
                                        continue label$12;
                                    }
                                }
                                while (false);
                                this._storeInt((_33_ + 28), (this._loadInt((_33_ + 24))));
                                break label$0;
                            }
                            while (false);
                            label$15:
                            do {
                                label$14:
                                while (true) {
                                    if (((this._loadInt((_33_ + 16))) & 4294967295L) < (4 & 4294967295L)) {
                                        break label$15;
                                    }
                                    this._storeInt((this._loadInt((_33_ + 12))), (this._loadInt((this._loadInt((_33_ + 8))))));
                                    this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + -4));
                                    this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 4));
                                    this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) + 4));
                                    continue label$14;
                                }
                            }
                            while (false);
                        }
                        while (false);
                        label$16:
                        while (true) {
                            if ((this._loadInt((_33_ + 16))) == 0) {
                                break label$4;
                            }
                            this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
                            _32_ = this._loadInt8u(_32_);
                            this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
                            this._storeInt8(_31_, _32_);
                            this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + -1));
                            continue label$16;
                        }
                    }
                    while (false);
                    label$19:
                    do {
                        label$18:
                        while (true) {
                            if (((this._loadInt((_33_ + 16))) & 4294967295L) < (4 & 4294967295L)) {
                                break label$19;
                            }
                            this._storeInt(((_32_ = this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + -4))) + (this._loadInt((_33_ + 12)))), (this._loadInt((_32_ + (this._loadInt((_33_ + 8)))))));
                            continue label$18;
                        }
                    }
                    while (false);
                }
                while (false);
                label$21:
                do {
                    label$20:
                    while (true) {
                        if ((this._loadInt((_33_ + 16))) == 0) {
                            break label$21;
                        }
                        this._storeInt8(((_32_ = this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + -1))) + (this._loadInt((_33_ + 12)))), (this._loadInt8u((_32_ + (this._loadInt((_33_ + 8)))))));
                        continue label$20;
                    }
                }
                while (false);
            }
            while (false);
            this._storeInt((_33_ + 28), (this._loadInt((_33_ + 24))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int mempcpy(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = memcpy((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_);
        _31_ = this._loadInt((_33_ + 4));
        this._storeInt((0 + 4), (_33_ + 16));
        return (_32_ + _31_);
    }

    @Override()
    public final int __memrchr(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        this._storeInt((_33_ + 12), (this._loadInt((_33_ + 24))));
        this._storeInt((_33_ + 20), (this._loadInt8u((_33_ + 20))));
        label$0:
        do {
            label$1$end:
            do {
                label$1:
                while (true) {
                    this._storeInt((_33_ + 16), ((_32_ = this._loadInt((_33_ + 16))) + -1));
                    if (_32_ == 0) {
                        break label$0;
                    }
                    if ((this._loadInt8u(((this._loadInt((_33_ + 12))) + (this._loadInt((_33_ + 16)))))) != (this._loadInt((_33_ + 20)))) {
                        continue label$1;
                    }
                    break label$1$end;
                }
            }
            while (false);
            this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 12))) + (this._loadInt((_33_ + 16)))));
            return (this._loadInt((_33_ + 28)));
        }
        while (false);
        this._storeInt((_33_ + 28), 0);
        return (this._loadInt((_33_ + 28)));
    }

    @Override()
    public final int memset(int _30_, int _31_, int _32_)
    {
        long _33_ = 0L;
        int _34_ = 0;
        this._storeInt(((_34_ = (this._loadInt((0 + 4))) - 48) + 40), _30_);
        this._storeInt((_34_ + 36), _31_);
        this._storeInt((_34_ + 32), _32_);
        this._storeInt((_34_ + 28), (this._loadInt((_34_ + 40))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_34_ + 32))) == 0) {
                    break label$1;
                }
                _32_ = this._storeInt8((((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 32)))) + -1), (this._loadInt8u((_34_ + 36))));
                this._storeInt8((this._loadInt((_34_ + 28))), _32_);
                if (((this._loadInt((_34_ + 32))) & 4294967295L) > (2 & 4294967295L)) {
                    break label$0;
                }
                this._storeInt((_34_ + 44), (this._loadInt((_34_ + 40))));
                return (this._loadInt((_34_ + 44)));
            }
            while (false);
            this._storeInt((_34_ + 44), (this._loadInt((_34_ + 40))));
            return (this._loadInt((_34_ + 44)));
        }
        while (false);
        _32_ = this._storeInt8((((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 32)))) + -2), (this._loadInt8u((_34_ + 36))));
        this._storeInt8(((this._loadInt((_34_ + 28))) + 1), _32_);
        _32_ = this._storeInt8((((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 32)))) + -3), (this._loadInt8u((_34_ + 36))));
        this._storeInt8(((this._loadInt((_34_ + 28))) + 2), _32_);
        label$2:
        do {
            if (((this._loadInt((_34_ + 32))) & 4294967295L) > (6 & 4294967295L)) {
                break label$2;
            }
            this._storeInt((_34_ + 44), (this._loadInt((_34_ + 40))));
            return (this._loadInt((_34_ + 44)));
        }
        while (false);
        _32_ = this._storeInt8((((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 32)))) + -4), (this._loadInt8u((_34_ + 36))));
        this._storeInt8(((this._loadInt((_34_ + 28))) + 3), _32_);
        label$3:
        do {
            if (((this._loadInt((_34_ + 32))) & 4294967295L) > (8 & 4294967295L)) {
                break label$3;
            }
            this._storeInt((_34_ + 44), (this._loadInt((_34_ + 40))));
            return (this._loadInt((_34_ + 44)));
        }
        while (false);
        this._storeInt((_34_ + 28), ((this._storeInt((_34_ + 24), ((0 - (this._loadInt((_34_ + 28)))) & 3))) + (this._loadInt((_34_ + 28)))));
        this._storeInt((_34_ + 32), ((this._storeInt((_34_ + 32), ((this._loadInt((_34_ + 32))) - (this._loadInt((_34_ + 24)))))) & -4));
        _32_ = this._storeInt((_34_ + 20), ((this._loadInt8u((_34_ + 36))) * 16843009));
        this._storeInt((this._loadInt((_34_ + 28))), _32_);
        this._storeInt((((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 32)))) + -4), _32_);
        label$4:
        do {
            if (((this._loadInt((_34_ + 32))) & 4294967295L) > (8 & 4294967295L)) {
                break label$4;
            }
            this._storeInt((_34_ + 44), (this._loadInt((_34_ + 40))));
            return (this._loadInt((_34_ + 44)));
        }
        while (false);
        _31_ = this._storeInt(((_32_ = this._loadInt((_34_ + 28))) + 4), (this._storeInt((_32_ + 8), (this._loadInt((_34_ + 20))))));
        this._storeInt(((_32_ + (this._loadInt((_34_ + 32)))) + -12), _31_);
        this._storeInt((((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 32)))) + -8), (this._loadInt((_34_ + 20))));
        label$5:
        do {
            if (((this._loadInt((_34_ + 32))) & 4294967295L) > (24 & 4294967295L)) {
                break label$5;
            }
            this._storeInt((_34_ + 44), (this._loadInt((_34_ + 40))));
            return (this._loadInt((_34_ + 44)));
        }
        while (false);
        this._storeInt(((_32_ = this._loadInt((_34_ + 28))) + 12), (this._storeInt((_32_ + 16), (this._loadInt((_34_ + 20))))));
        this._storeInt(((this._loadInt((_34_ + 28))) + 20), (this._loadInt((_34_ + 20))));
        this._storeInt(((this._loadInt((_34_ + 28))) + 24), (this._loadInt((_34_ + 20))));
        this._storeInt((((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 32)))) + -28), (this._loadInt((_34_ + 20))));
        this._storeInt((((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 32)))) + -24), (this._loadInt((_34_ + 20))));
        this._storeInt((((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 32)))) + -20), (this._loadInt((_34_ + 20))));
        this._storeInt((((this._loadInt((_34_ + 28))) + (this._loadInt((_34_ + 32)))) + -16), (this._loadInt((_34_ + 20))));
        this._storeInt((_34_ + 28), ((this._storeInt((_34_ + 24), (((this._loadInt((_34_ + 28))) & 4) | 24))) + (this._loadInt((_34_ + 28)))));
        this._storeInt((_34_ + 32), ((this._loadInt((_34_ + 32))) - (this._loadInt((_34_ + 24)))));
        this._storeLong((_34_ + 8), ((_33_ = this._loadLong32u((_34_ + 20))) | (_33_ << 32L)));
        label$7:
        do {
            label$6:
            while (true) {
                if (((this._loadInt((_34_ + 32))) & 4294967295L) < (32 & 4294967295L)) {
                    break label$7;
                }
                this._storeLong((_32_ = this._loadInt((_34_ + 28))), (this._storeLong((_32_ + 8), (this._loadLong((_34_ + 8))))));
                this._storeLong(((this._loadInt((_34_ + 28))) + 16), (this._loadLong((_34_ + 8))));
                this._storeLong(((this._loadInt((_34_ + 28))) + 24), (this._loadLong((_34_ + 8))));
                this._storeInt((_34_ + 32), ((this._loadInt((_34_ + 32))) + -32));
                this._storeInt((_34_ + 28), ((this._loadInt((_34_ + 28))) + 32));
                continue label$6;
            }
        }
        while (false);
        this._storeInt((_34_ + 44), (this._loadInt((_34_ + 40))));
        return (this._loadInt((_34_ + 44)));
    }

    @Override()
    public final double modf(double _30_, int _31_)
    {
        int _32_ = 0;
        this._storeDouble(((_32_ = (this._loadInt((0 + 4))) - 48) + 32), _30_);
        this._storeInt((_32_ + 28), _31_);
        this._storeDouble((_32_ + 16), (this._loadDouble((_32_ + 32))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeInt((_32_ + 4), (((int) (((this._loadLong((_32_ + 16))) >>> 52L) & 2047L)) + -1023))) < 52) {
                            break label$3;
                        }
                        this._storeDouble((this._loadInt((_32_ + 28))), (this._loadDouble((_32_ + 32))));
                        if ((this._loadInt((_32_ + 4))) != 1024) {
                            break label$2;
                        }
                        if (((this._loadLong((_32_ + 16))) << 12L) == 0) {
                            break label$2;
                        }
                        this._storeDouble((_32_ + 40), (this._loadDouble((_32_ + 32))));
                        return (this._loadDouble((_32_ + 40)));
                    }
                    while (false);
                    if ((this._loadInt((_32_ + 4))) <= -1) {
                        break label$1;
                    }
                    if (((this._storeLong((_32_ + 8), (4503599627370495L >>> (this._loadLong32u((_32_ + 4)))))) & (this._loadLong((_32_ + 16)))) == 0L) {
                        break label$0;
                    }
                    this._storeLong((_32_ + 16), ((this._loadLong((_32_ + 16))) & ((this._loadLong((_32_ + 8))) ^ -1L)));
                    _30_ = this._storeDouble((this._loadInt((_32_ + 28))), (this._loadDouble((_32_ + 16))));
                    this._storeDouble((_32_ + 40), ((this._loadDouble((_32_ + 32))) - _30_));
                    return (this._loadDouble((_32_ + 40)));
                }
                while (false);
                this._storeLong((_32_ + 16), ((this._loadLong((_32_ + 16))) & -9223372036854775808L));
                this._storeDouble((_32_ + 40), (this._loadDouble((_32_ + 16))));
                return (this._loadDouble((_32_ + 40)));
            }
            while (false);
            this._storeLong((_32_ + 16), ((this._loadLong((_32_ + 16))) & -9223372036854775808L));
            this._storeDouble((this._loadInt((_32_ + 28))), (this._loadDouble((_32_ + 16))));
            this._storeDouble((_32_ + 40), (this._loadDouble((_32_ + 32))));
            return (this._loadDouble((_32_ + 40)));
        }
        while (false);
        this._storeDouble((this._loadInt((_32_ + 28))), (this._loadDouble((_32_ + 32))));
        this._storeLong((_32_ + 16), ((this._loadLong((_32_ + 16))) & -9223372036854775808L));
        this._storeDouble((_32_ + 40), (this._loadDouble((_32_ + 16))));
        return (this._loadDouble((_32_ + 40)));
    }

    @Override()
    public final float modff(float _30_, int _31_)
    {
        int _32_ = 0;
        this._storeFloat(((_32_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeFloat((_32_ + 16), (this._loadFloat((_32_ + 24))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeInt((_32_ + 8), ((((this._loadInt((_32_ + 16))) >>> 23) & 255) + -127))) < 23) {
                            break label$3;
                        }
                        this._storeFloat((this._loadInt((_32_ + 20))), (this._loadFloat((_32_ + 24))));
                        if ((this._loadInt((_32_ + 8))) != 128) {
                            break label$2;
                        }
                        if (((this._loadInt((_32_ + 16))) << 9) == 0) {
                            break label$2;
                        }
                        this._storeFloat((_32_ + 28), (this._loadFloat((_32_ + 24))));
                        return (this._loadFloat((_32_ + 28)));
                    }
                    while (false);
                    if ((this._loadInt((_32_ + 8))) <= -1) {
                        break label$1;
                    }
                    if (((this._storeInt((_32_ + 12), (8388607 >>> (this._loadInt((_32_ + 8)))))) & (this._loadInt((_32_ + 16)))) == 0) {
                        break label$0;
                    }
                    this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) & ((this._loadInt((_32_ + 12))) ^ -1)));
                    _30_ = this._storeFloat((this._loadInt((_32_ + 20))), (this._loadFloat((_32_ + 16))));
                    this._storeFloat((_32_ + 28), ((this._loadFloat((_32_ + 24))) - _30_));
                    return (this._loadFloat((_32_ + 28)));
                }
                while (false);
                this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) & -2147483648));
                this._storeFloat((_32_ + 28), (this._loadFloat((_32_ + 16))));
                return (this._loadFloat((_32_ + 28)));
            }
            while (false);
            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) & -2147483648));
            this._storeFloat((this._loadInt((_32_ + 20))), (this._loadFloat((_32_ + 16))));
            this._storeFloat((_32_ + 28), (this._loadFloat((_32_ + 24))));
            return (this._loadFloat((_32_ + 28)));
        }
        while (false);
        this._storeFloat((this._loadInt((_32_ + 20))), (this._loadFloat((_32_ + 24))));
        this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) & -2147483648));
        this._storeFloat((_32_ + 28), (this._loadFloat((_32_ + 16))));
        return (this._loadFloat((_32_ + 28)));
    }

    @Override()
    public final void modfl(int _30_, long _31_, long _32_, int _33_)
    {
        int _34_ = 0;
        this._storeLong(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 64), _31_);
        this._storeInt((_34_ + 60), _33_);
        this._storeLong((_34_ + 72), _32_);
        this.__extenddftf2.invoke((_34_ + 16), (modf((this.__trunctfdf2.invoke((this._loadLong((_34_ + 64))), _32_)), (_34_ + 48))));
        _32_ = this._storeLong((_34_ + 32), (this._loadLong((_34_ + 16))));
        this.__extenddftf2.invoke(_34_, (this._loadDouble((_34_ + 48))));
        this._storeLong(((_33_ = this._loadInt((_34_ + 60))) + 8), (this._loadLong((_34_ + 8))));
        this._storeLong(_33_, (this._loadLong(_34_)));
        this._storeLong((_30_ + 8), (this._storeLong((_34_ + 40), (this._loadLong(((_34_ + 16) + 8))))));
        this._storeLong(_30_, _32_);
        this._storeInt((0 + 4), (_34_ + 80));
        return;
    }

    @Override()
    public final int jrand48(int _30_)
    {
        int _31_ = 0;
        long _32_ = 0L;
        _32_ = __rand48_step((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 4226);
        this._storeInt((0 + 4), (_31_ + 16));
        return ((int) (_32_ >>> 16L));
    }

    @Override()
    public final int mrand48()
    {
        return (jrand48(4220));
    }

    @Override()
    public final double nan(int _30_)
    {
        this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_);
        return Double.NaN;
    }

    @Override()
    public final float nanf(int _30_)
    {
        this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_);
        return Float.NaN;
    }

    @Override()
    public final void nanl(int _30_, int _31_)
    {
        this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _31_);
        this._storeLong((_30_ + 8), 9223231299366420480L);
        this._storeLong(_30_, 0L);
        return;
    }

    @Override()
    public final double nearbyint(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_31_ + 4), (this.fetestexcept.invoke(32)));
        this._storeDouble((_31_ + 8), (Math.round((this._loadDouble((_31_ + 8))))));
        label$0:
        do {
            if ((this._loadInt((_31_ + 4))) != 0) {
                break label$0;
            }
            this.feclearexcept.invoke(32);
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final float nearbyintf(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_31_ + 8), (this.fetestexcept.invoke(32)));
        this._storeFloat((_31_ + 12), (Math.round((this._loadFloat((_31_ + 12))))));
        label$0:
        do {
            if ((this._loadInt((_31_ + 8))) != 0) {
                break label$0;
            }
            this.feclearexcept.invoke(32);
        }
        while (false);
        _30_ = this._loadFloat((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void nearbyintl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (Math.round((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final double nextafter(double _30_, double _31_)
    {
        int _32_ = 0;
        this._storeDouble(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 64), _30_);
        this._storeDouble((_32_ + 56), _31_);
        this._storeDouble((_32_ + 48), (this._loadDouble((_32_ + 64))));
        this._storeDouble((_32_ + 40), (this._loadDouble((_32_ + 56))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((((__DOUBLE_BITS$2e$190((this._loadDouble((_32_ + 64))))) & 9223372036854775807L) & 4294967295L) > (9218868437227405312L & 4294967295L)) {
                        break label$2;
                    }
                    if ((((__DOUBLE_BITS$2e$190((this._loadDouble((_32_ + 56))))) & 9223372036854775807L) & 4294967295L) < (9218868437227405313L & 4294967295L)) {
                        break label$1;
                    }
                }
                while (false);
                this._storeDouble((_32_ + 72), ((this._loadDouble((_32_ + 64))) + (this._loadDouble((_32_ + 56)))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadLong((_32_ + 48))) != (this._loadLong((_32_ + 40)))) {
                    break label$3;
                }
                this._storeDouble((_32_ + 72), (this._loadDouble((_32_ + 56))));
                break label$0;
            }
            while (false);
            this._storeLong((_32_ + 32), ((this._loadLong((_32_ + 48))) & 9223372036854775807L));
            this._storeLong((_32_ + 24), ((this._loadLong((_32_ + 40))) & 9223372036854775807L));
            label$4:
            do {
                label$5:
                do {
                    label$6:
                    do {
                        label$7:
                        do {
                            if ((this._loadLong((_32_ + 32))) == 0L) {
                                break label$7;
                            }
                            label$8:
                            do {
                                if (((this._loadLong((_32_ + 32))) & 4294967295L) > ((this._loadLong((_32_ + 24))) & 4294967295L)) {
                                    break label$8;
                                }
                                if ((((this._loadLong((_32_ + 48))) ^ (this._loadLong((_32_ + 40)))) & -9223372036854775808L) == 0) {
                                    break label$6;
                                }
                            }
                            while (false);
                            this._storeLong((_32_ + 48), ((this._loadLong((_32_ + 48))) + -1L));
                            break label$5;
                        }
                        while (false);
                        if ((this._loadLong((_32_ + 24))) == 0L) {
                            break label$4;
                        }
                        this._storeLong((_32_ + 48), (((this._loadLong((_32_ + 40))) & -9223372036854775808L) | 1L));
                        break label$5;
                    }
                    while (false);
                    this._storeLong((_32_ + 48), ((this._loadLong((_32_ + 48))) + 1L));
                }
                while (false);
                label$9:
                do {
                    if ((this._storeInt((_32_ + 20), ((int) (((this._loadLong((_32_ + 48))) >>> 52L) & 2047L)))) != 2047) {
                        break label$9;
                    }
                    this._storeDouble((_32_ + 8), ((_31_ = this._loadDouble((_32_ + 64))) + _31_));
                }
                while (false);
                label$10:
                do {
                    if ((this._loadInt((_32_ + 20))) != 0) {
                        break label$10;
                    }
                    this._storeDouble(_32_, (((_31_ = this._loadDouble((_32_ + 64))) * _31_) + ((_31_ = this._loadDouble((_32_ + 48))) * _31_)));
                }
                while (false);
                this._storeDouble((_32_ + 72), (this._loadDouble((_32_ + 48))));
                break label$0;
            }
            while (false);
            this._storeDouble((_32_ + 72), (this._loadDouble((_32_ + 56))));
        }
        while (false);
        _31_ = this._loadDouble((_32_ + 72));
        this._storeInt((0 + 4), (_32_ + 80));
        return _31_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$189(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$190(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final float nextafterf(float _30_, float _31_)
    {
        int _32_ = 0;
        this._storeFloat(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeFloat((_32_ + 36), _31_);
        this._storeFloat((_32_ + 32), (this._loadFloat((_32_ + 40))));
        this._storeFloat((_32_ + 24), (this._loadFloat((_32_ + 36))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((((__FLOAT_BITS$2e$191((this._loadFloat((_32_ + 40))))) & 2147483647) & 4294967295L) > (2139095040 & 4294967295L)) {
                        break label$2;
                    }
                    if ((((__FLOAT_BITS$2e$191((this._loadFloat((_32_ + 36))))) & 2147483647) & 4294967295L) < (2139095041 & 4294967295L)) {
                        break label$1;
                    }
                }
                while (false);
                this._storeFloat((_32_ + 44), ((this._loadFloat((_32_ + 40))) + (this._loadFloat((_32_ + 36)))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((_32_ + 32))) != (this._loadInt((_32_ + 24)))) {
                    break label$3;
                }
                this._storeFloat((_32_ + 44), (this._loadFloat((_32_ + 36))));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 32))) & 2147483647));
            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 24))) & 2147483647));
            label$4:
            do {
                label$5:
                do {
                    label$6:
                    do {
                        label$7:
                        do {
                            if ((this._loadInt((_32_ + 20))) == 0) {
                                break label$7;
                            }
                            label$8:
                            do {
                                if (((this._loadInt((_32_ + 20))) & 4294967295L) > ((this._loadInt((_32_ + 16))) & 4294967295L)) {
                                    break label$8;
                                }
                                if ((((this._loadInt((_32_ + 32))) ^ (this._loadInt((_32_ + 24)))) & -2147483648) == 0) {
                                    break label$6;
                                }
                            }
                            while (false);
                            this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) + -1));
                            break label$5;
                        }
                        while (false);
                        if ((this._loadInt((_32_ + 16))) == 0) {
                            break label$4;
                        }
                        this._storeInt((_32_ + 32), (((this._loadInt((_32_ + 24))) & -2147483648) | 1));
                        break label$5;
                    }
                    while (false);
                    this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) + 1));
                }
                while (false);
                label$9:
                do {
                    if ((this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 32))) & 2139095040))) != 2139095040) {
                        break label$9;
                    }
                    this._storeFloat((_32_ + 8), ((_31_ = this._loadFloat((_32_ + 40))) + _31_));
                }
                while (false);
                label$10:
                do {
                    if ((this._loadInt((_32_ + 12))) != 0) {
                        break label$10;
                    }
                    this._storeFloat((_32_ + 4), (((_31_ = this._loadFloat((_32_ + 40))) * _31_) + ((_31_ = this._loadFloat((_32_ + 32))) * _31_)));
                }
                while (false);
                this._storeFloat((_32_ + 44), (this._loadFloat((_32_ + 32))));
                break label$0;
            }
            while (false);
            this._storeFloat((_32_ + 44), (this._loadFloat((_32_ + 36))));
        }
        while (false);
        _31_ = this._loadFloat((_32_ + 44));
        this._storeInt((0 + 4), (_32_ + 48));
        return _31_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$191(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$192(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final void nextafterl(int _30_, long _31_, long _32_, long _33_, long _34_)
    {
        int _35_ = 0;
        double _36_ = 0.0;
        this._storeLong(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), _31_);
        this._storeLong((_35_ + 40), _32_);
        this._storeLong((_35_ + 24), _34_);
        _36_ = this.__trunctfdf2.invoke((this._storeLong((_35_ + 16), _33_)), _34_);
        this.__extenddftf2.invoke(_35_, (nextafter((this.__trunctfdf2.invoke((this._loadLong((_35_ + 32))), (this._loadLong((_35_ + 40))))), _36_)));
        this._storeLong((_30_ + 8), (this._loadLong((_35_ + 8))));
        this._storeLong(_30_, (this._loadLong(_35_)));
        this._storeInt((0 + 4), (_35_ + 48));
        return;
    }

    @Override()
    public final double nexttoward(double _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this._storeDouble(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeLong((_33_ + 8), _32_);
        _30_ = this.__trunctfdf2.invoke((this._storeLong(_33_, _31_)), _32_);
        _30_ = nextafter((this._loadDouble((_33_ + 24))), _30_);
        this._storeInt((0 + 4), (_33_ + 32));
        return _30_;
    }

    @Override()
    public final float nexttowardf(float _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this._storeFloat(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 128))) + 120), _30_);
        this._storeLong((_33_ + 96), _31_);
        this._storeFloat((_33_ + 88), (this._loadFloat((_33_ + 120))));
        this._storeLong((_33_ + 104), _32_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((((__FLOAT_BITS$2e$193((this._loadFloat((_33_ + 120))))) & 2147483647) & 4294967295L) > (2139095040 & 4294967295L)) {
                        break label$2;
                    }
                    if ((__fpclassifyl((this._loadLong((_33_ + 96))), (this._loadLong((_33_ + 104))))) == 0) {
                        break label$2;
                    }
                    this.__extendsftf2.invoke((_33_ + 56), (this._loadFloat((_33_ + 120))));
                    if ((this.__netf2.invoke((this._loadLong((_33_ + 56))), (this._loadLong((_33_ + 64))), (this._loadLong((_33_ + 96))), (this._loadLong((_33_ + 104))))) != 0) {
                        break label$1;
                    }
                    this._storeFloat((_33_ + 124), (this.__trunctfsf2.invoke((this._loadLong((_33_ + 96))), (this._loadLong((_33_ + 104))))));
                    break label$0;
                }
                while (false);
                this.__extendsftf2.invoke((_33_ + 8), (this._loadFloat((_33_ + 120))));
                this.__addtf3.invoke((_33_ + 24), (this._loadLong((_33_ + 8))), (this._loadLong(((_33_ + 8) + 8))), (this._loadLong((_33_ + 96))), (this._loadLong((_33_ + 104))));
                this._storeFloat((_33_ + 124), (this.__trunctfsf2.invoke((this._loadLong((_33_ + 24))), (this._loadLong(((_33_ + 24) + 8))))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if ((this._loadFloat((_33_ + 120))) != 0.0f) {
                        break label$4;
                    }
                    this._storeInt((_33_ + 88), 1);
                    if ((__signbitl((this._loadLong((_33_ + 96))), (this._loadLong((_33_ + 104))))) == 0) {
                        break label$3;
                    }
                    this._storeInt((_33_ + 88), ((this._loadInt((_33_ + 88))) | -2147483648));
                    break label$3;
                }
                while (false);
                this.__extendsftf2.invoke((_33_ + 40), (this._loadFloat((_33_ + 120))));
                label$5:
                do {
                    label$6:
                    do {
                        label$7:
                        do {
                            if ((this.__lttf2.invoke((this._loadLong((_33_ + 40))), (this._loadLong((_33_ + 48))), (this._loadLong((_33_ + 96))), (this._loadLong((_33_ + 104))))) > -1) {
                                break label$7;
                            }
                            if (((__FLOAT_BITS$2e$193((this._loadFloat((_33_ + 120))))) >>> 31) == 0) {
                                break label$6;
                            }
                            this._storeInt((_33_ + 88), ((this._loadInt((_33_ + 88))) + -1));
                            break label$3;
                        }
                        while (false);
                        if (((__FLOAT_BITS$2e$193((this._loadFloat((_33_ + 120))))) >>> 31) == 0) {
                            break label$5;
                        }
                        this._storeInt((_33_ + 88), ((this._loadInt((_33_ + 88))) + 1));
                        break label$3;
                    }
                    while (false);
                    this._storeInt((_33_ + 88), ((this._loadInt((_33_ + 88))) + 1));
                    break label$3;
                }
                while (false);
                this._storeInt((_33_ + 88), ((this._loadInt((_33_ + 88))) + -1));
            }
            while (false);
            label$8:
            do {
                if ((this._storeInt((_33_ + 84), ((this._loadInt((_33_ + 88))) & 2139095040))) != 2139095040) {
                    break label$8;
                }
                this._storeFloat((_33_ + 80), ((_30_ = this._loadFloat((_33_ + 120))) + _30_));
            }
            while (false);
            label$9:
            do {
                if ((this._loadInt((_33_ + 84))) != 0) {
                    break label$9;
                }
                this._storeFloat((_33_ + 76), (((_30_ = this._loadFloat((_33_ + 120))) * _30_) + ((_30_ = this._loadFloat((_33_ + 88))) * _30_)));
            }
            while (false);
            this._storeFloat((_33_ + 124), (this._loadFloat((_33_ + 88))));
        }
        while (false);
        _30_ = this._loadFloat((_33_ + 124));
        this._storeInt((0 + 4), (_33_ + 128));
        return _30_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$193(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$194(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final void nexttowardl(int _30_, long _31_, long _32_, long _33_, long _34_)
    {
        int _35_ = 0;
        this._storeLong(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), _31_);
        this._storeLong((_35_ + 40), _32_);
        this._storeLong((_35_ + 16), _33_);
        this._storeLong((_35_ + 24), _34_);
        nextafterl(_35_, (this._loadLong((_35_ + 32))), (this._loadLong((_35_ + 40))), _33_, _34_);
        _34_ = this._loadLong(_35_);
        this._storeLong((_30_ + 8), (this._loadLong((_35_ + 8))));
        this._storeLong(_30_, _34_);
        this._storeInt((0 + 4), (_35_ + 48));
        return;
    }

    @Override()
    public final int nice(int _30_)
    {
        int _31_ = 0;
        _30_ = __syscall_ret((this.__syscall1.invoke(34, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int __ofl_lock()
    {
        this.__lock.invoke(14128);
        return 14136;
    }

    @Override()
    public final void __ofl_unlock()
    {
        this.__unlock.invoke(14128);
        return;
    }

    @Override()
    public final int __ofl_add(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        _30_ = this._storeInt((_31_ + 8), (__ofl_lock()));
        this._storeInt(((this._loadInt((_31_ + 12))) + 56), (this._loadInt(_30_)));
        label$0:
        do {
            if ((this._loadInt(_30_)) == 0) {
                break label$0;
            }
            this._storeInt(((this._loadInt((this._loadInt((_31_ + 8))))) + 52), (this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt((this._loadInt((_31_ + 8))), (this._loadInt((_31_ + 12))));
        __ofl_unlock();
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int open_memstream(int _30_, int _31_)
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
                    if ((this._storeInt((_32_ + 16), (malloc(1192)))) == 0) {
                        break label$2;
                    }
                    if ((this._storeInt((_32_ + 8), (malloc(1)))) == 0) {
                        break label$1;
                    }
                    memset((this._loadInt((_32_ + 16))), 0, 168);
                    _31_ = this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 16))) + 144));
                    this._storeInt(((this._loadInt((_32_ + 16))) + 84), _31_);
                    this._storeInt((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 24))));
                    this._storeInt(((this._loadInt((_32_ + 12))) + 4), (this._loadInt((_32_ + 20))));
                    _31_ = this._storeInt((this._loadInt((_32_ + 20))), 0);
                    this._storeInt(((this._loadInt((_32_ + 12))) + 20), _31_);
                    this._storeInt(((this._loadInt((_32_ + 12))) + 16), _31_);
                    this._storeInt(((this._loadInt((_32_ + 12))) + 8), _31_);
                    _30_ = this._storeInt((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 8))));
                    this._storeInt(((this._loadInt((_32_ + 12))) + 12), _30_);
                    this._storeInt8((this._loadInt((_32_ + 8))), _31_);
                    this._storeInt((this._loadInt((_32_ + 16))), 4);
                    _30_ = this._storeInt(((this._loadInt((_32_ + 16))) + 60), -1);
                    this._storeInt(((this._loadInt((_32_ + 16))) + 44), ((this._loadInt((_32_ + 12))) + 24));
                    this._storeInt(((this._loadInt((_32_ + 16))) + 48), 1024);
                    this._storeInt8(((this._loadInt((_32_ + 16))) + 75), 255);
                    this._storeInt(((this._loadInt((_32_ + 16))) + 36), 6);
                    this._storeInt(((this._loadInt((_32_ + 16))) + 40), 7);
                    this._storeInt(((this._loadInt((_32_ + 16))) + 12), 8);
                    label$3:
                    do {
                        if ((this._loadInt((_31_ + 12944))) != 0) {
                            break label$3;
                        }
                        this._storeInt(((this._loadInt((_32_ + 16))) + 76), _30_);
                    }
                    while (false);
                    this._storeInt((_32_ + 28), (__ofl_add((this._loadInt((_32_ + 16))))));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            free((this._loadInt((_32_ + 16))));
            this._storeInt((_32_ + 28), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int ms_write(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        this._storeInt((_33_ + 12), (this._loadInt(((this._loadInt((_33_ + 24))) + 84))));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_33_ + 8), ((this._loadInt(((_32_ = this._loadInt((_33_ + 24))) + 20))) - (this._loadInt((_32_ + 28)))))) == 0) {
                    break label$1;
                }
                if (((ms_write((_32_ = this._loadInt((_33_ + 24))), (this._storeInt((_32_ + 20), (this._loadInt((_32_ + 28))))), (this._loadInt((_33_ + 8))))) & 4294967295L) >= ((this._loadInt((_33_ + 8))) & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((_33_ + 28), 0);
                break label$0;
            }
            while (false);
            label$2:
            do {
                label$3:
                do {
                    if ((((this._loadInt((_33_ + 16))) + (this._loadInt(((_32_ = this._loadInt((_33_ + 12))) + 8)))) & 4294967295L) < ((this._loadInt((_32_ + 20))) & 4294967295L)) {
                        break label$3;
                    }
                    _32_ = this._storeInt((_33_ + 8), ((((this._loadInt(((_32_ = this._loadInt((_33_ + 12))) + 20))) << 1) | (((this._loadInt((_32_ + 8))) + (this._loadInt((_33_ + 16)))) + 1)) | 1));
                    if ((this._storeInt((_33_ + 4), (realloc((this._loadInt(((this._loadInt((_33_ + 12))) + 12))), _32_)))) == 0) {
                        break label$2;
                    }
                    _31_ = this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 12), (this._loadInt((_33_ + 4))));
                    this._storeInt((this._loadInt(_32_)), _31_);
                    memset(((this._loadInt(((_32_ = this._loadInt((_33_ + 12))) + 12))) + (_32_ = this._loadInt((_32_ + 20)))), 0, ((this._loadInt((_33_ + 8))) - _32_));
                    this._storeInt(((this._loadInt((_33_ + 12))) + 20), (this._loadInt((_33_ + 8))));
                }
                while (false);
                memcpy(((this._loadInt(((_32_ = this._loadInt((_33_ + 12))) + 12))) + (this._loadInt((_32_ + 8)))), (this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))));
                this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 8), ((this._loadInt((_32_ + 8))) + (this._loadInt((_33_ + 16)))));
                label$4:
                do {
                    if (((this._loadInt((_32_ + 8))) & 4294967295L) < ((this._loadInt((_32_ + 16))) & 4294967295L)) {
                        break label$4;
                    }
                    this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 16), (this._loadInt((_32_ + 8))));
                }
                while (false);
                this._storeInt((this._loadInt(((_32_ = this._loadInt((_33_ + 12))) + 4))), (this._loadInt((_32_ + 8))));
                this._storeInt((_33_ + 28), (this._loadInt((_33_ + 16))));
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
    public final long ms_seek(int _30_, long _31_, int _32_)
    {
        int _33_ = 0;
        int _34_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 36), _30_);
        this._storeLong((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 12), (this._loadInt(((this._loadInt((_33_ + 36))) + 84))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadInt((_33_ + 20))) & 4294967295L) >= (3 & 4294967295L)) {
                        break label$2;
                    }
                    _32_ = this._loadInt((_33_ + 20));
                    _30_ = this._storeInt(_33_, 0);
                    this._storeInt((_33_ + 4), (this._loadInt(((_34_ = this._loadInt((_33_ + 12))) + 8))));
                    this._storeInt((_33_ + 8), (this._loadInt((_34_ + 16))));
                    _32_ = this._storeInt((_33_ + 16), (this._loadInt((_33_ + (_32_ << 2)))));
                    if ((this._loadLong((_33_ + 24))) < ((long) (_30_ - _32_))) {
                        break label$2;
                    }
                    if ((this._loadLong((_33_ + 24))) <= ((long) (2147483647 - (this._loadInt((_33_ + 16)))))) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((__errno_location()), 22);
                this._storeLong((_33_ + 40), -1L);
                break label$0;
            }
            while (false);
            this._storeLong((_33_ + 40), ((this._storeLong32(((this._loadInt((_33_ + 12))) + 8), ((this._loadLong32s((_33_ + 16))) + (this._loadLong((_33_ + 24)))))) & 4294967295L));
        }
        while (false);
        _31_ = this._loadLong((_33_ + 40));
        this._storeInt((0 + 4), (_33_ + 48));
        return _31_;
    }

    @Override()
    public final int ms_close(int _30_)
    {
        this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_);
        return 0;
    }

    @Override()
    public final int pause()
    {
        return (__syscall_ret((this.__syscall_cp.invoke(29, 0, 0, 0, 0, 0, 0))));
    }

    @Override()
    public final void perror(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        _30_ = 0;
        this._storeInt((_31_ + 8), (this._loadInt((0 + 14768))));
        this._storeInt((_31_ + 4), (strerror((this._loadInt((__errno_location()))))));
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_31_ + 8))) + 76))) < 0) {
                break label$0;
            }
            _30_ = this.__lockfile.invoke((this._loadInt((_31_ + 8))));
        }
        while (false);
        this._storeInt(_31_, _30_);
        label$1:
        do {
            if ((this._loadInt((_31_ + 12))) == 0) {
                break label$1;
            }
            if ((this._loadInt8s((this._loadInt((_31_ + 12))))) == 0) {
                break label$1;
            }
            fwrite((_30_ = this._loadInt((_31_ + 12))), (strlen(_30_)), 1, (this._loadInt((_31_ + 8))));
            fputc(58, (this._loadInt((_31_ + 8))));
            fputc(32, (this._loadInt((_31_ + 8))));
        }
        while (false);
        fwrite((_30_ = this._loadInt((_31_ + 4))), (strlen(_30_)), 1, (this._loadInt((_31_ + 8))));
        fputc(10, (this._loadInt((_31_ + 8))));
        label$2:
        do {
            if ((this._loadInt(_31_)) == 0) {
                break label$2;
            }
            this.__unlockfile.invoke((this._loadInt((_31_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int pipe(int _30_)
    {
        int _31_ = 0;
        _30_ = __syscall_ret((this.__syscall1.invoke(42, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int pipe2(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._storeInt((_32_ + 4), _31_)) == 0) {
                        break label$2;
                    }
                    if ((this._storeInt(_32_, (this.__syscall2.invoke(331, (this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))))))) == -38) {
                        break label$1;
                    }
                    this._storeInt((_32_ + 12), (__syscall_ret((this._loadInt(_32_)))));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 12), (pipe((this._loadInt((_32_ + 8))))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._storeInt(_32_, (pipe((this._loadInt((_32_ + 8))))))) == 0) {
                    break label$3;
                }
                this._storeInt((_32_ + 12), (this._loadInt(_32_)));
                break label$0;
            }
            while (false);
            label$4:
            do {
                if (((this._loadInt8u((_32_ + 6))) & 8) == 0) {
                    break label$4;
                }
                this.__syscall3.invoke(55, (this._loadInt((this._loadInt((_32_ + 8))))), 2, 1);
                this.__syscall3.invoke(55, (this._loadInt(((this._loadInt((_32_ + 8))) + 4))), 2, 1);
            }
            while (false);
            label$5:
            do {
                if (((this._loadInt8u((_32_ + 5))) & 8) == 0) {
                    break label$5;
                }
                this.__syscall3.invoke(55, (this._loadInt((this._loadInt((_32_ + 8))))), 4, 2048);
                this.__syscall3.invoke(55, (this._loadInt(((this._loadInt((_32_ + 8))) + 4))), 4, 2048);
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
    public final int popen(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 160))) + 152), _30_);
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
                                        if ((this._loadInt8s((this._storeInt((_32_ + 148), _31_)))) != 114) {
                                            break label$7;
                                        }
                                        this._storeInt((_32_ + 136), 0);
                                        break label$6;
                                    }
                                    while (false);
                                    if ((this._loadInt8s((this._loadInt((_32_ + 148))))) != 119) {
                                        break label$5;
                                    }
                                    this._storeInt((_32_ + 136), 1);
                                }
                                while (false);
                                label$8:
                                do {
                                    if ((pipe2((_32_ + 140), 524288)) == 0) {
                                        break label$8;
                                    }
                                    this._storeInt((_32_ + 156), 0);
                                    break label$0;
                                }
                                while (false);
                                if ((this._storeInt((_32_ + 124), (this.fdopen.invoke((this._loadInt(((_32_ + 140) + ((this._loadInt((_32_ + 136))) << 2)))), (this._loadInt((_32_ + 148))))))) == 0) {
                                    break label$4;
                                }
                                _31_ = 0;
                                label$9:
                                do {
                                    if ((this._loadInt(((this._loadInt((_32_ + 124))) + 76))) < 0) {
                                        break label$9;
                                    }
                                    _31_ = this.__lockfile.invoke((this._loadInt((_32_ + 124))));
                                }
                                while (false);
                                this._storeInt((_32_ + 44), _31_);
                                label$10:
                                do {
                                    if ((this._loadInt(((_32_ + 140) + ((_31_ = 1 - (this._loadInt((_32_ + 136)))) << 2)))) != _31_) {
                                        break label$10;
                                    }
                                    _31_ = this._loadInt((_32_ + 136));
                                    this._storeInt((_32_ + 16), 0);
                                    if ((this._storeInt((_32_ + 40), (this.fcntl.invoke((1 - _31_), 1030, (_32_ + 16))))) <= -1) {
                                        break label$3;
                                    }
                                    this.__syscall1.invoke(6, (this._loadInt(((_32_ + 140) + ((1 - (this._loadInt((_32_ + 136)))) << 2)))));
                                    this._storeInt(((_32_ + 140) + ((1 - (this._loadInt((_32_ + 136)))) << 2)), (this._loadInt((_32_ + 40))));
                                }
                                while (false);
                                this._storeInt((_32_ + 132), 12);
                                if ((this.posix_spawn_file_actions_init.invoke((_32_ + 48))) != 0) {
                                    break label$2;
                                }
                                label$11:
                                do {
                                    if ((this.posix_spawn_file_actions_adddup2.invoke((_32_ + 48), (this._loadInt(((_32_ + 140) + ((_31_ = 1 - (this._loadInt((_32_ + 136)))) << 2)))), _31_)) != 0) {
                                        break label$11;
                                    }
                                    _31_ = this._storeInt((_32_ + 36), 0);
                                    this._storeInt((_32_ + 24), 14144);
                                    this._storeInt((_32_ + 32), (this._loadInt((_32_ + 152))));
                                    this._storeInt((_32_ + 28), 14160);
                                    if ((this._storeInt((_32_ + 132), (this.posix_spawn.invoke((_32_ + 128), 14176, (_32_ + 48), _31_, (_32_ + 24), (this._loadInt((_31_ + 3912))))))) == 0) {
                                        break label$1;
                                    }
                                }
                                while (false);
                                this.posix_spawn_file_actions_destroy.invoke((_32_ + 48));
                                break label$2;
                            }
                            while (false);
                            this._storeInt((__errno_location()), 22);
                            this._storeInt((_32_ + 156), 0);
                            break label$0;
                        }
                        while (false);
                        this.__syscall1.invoke(6, (this._loadInt((_32_ + 140))));
                        this.__syscall1.invoke(6, (this._loadInt((_32_ + 144))));
                        this._storeInt((_32_ + 156), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_32_ + 132), (this._loadInt((__errno_location()))));
                }
                while (false);
                fclose((this._loadInt((_32_ + 124))));
                this.__syscall1.invoke(6, (this._loadInt(((_32_ + 140) + ((1 - (this._loadInt((_32_ + 136)))) << 2)))));
                _31_ = this._loadInt((_32_ + 132));
                this._storeInt((__errno_location()), _31_);
                this._storeInt((_32_ + 156), 0);
                break label$0;
            }
            while (false);
            this.posix_spawn_file_actions_destroy.invoke((_32_ + 48));
            this._storeInt(((this._loadInt((_32_ + 124))) + 64), (this._loadInt((_32_ + 128))));
            label$12:
            do {
                if ((strchr((this._loadInt((_32_ + 148))), 101)) != 0) {
                    break label$12;
                }
                _31_ = this._loadInt(((_32_ + 140) + ((this._loadInt((_32_ + 136))) << 2)));
                this._storeInt(_32_, 0);
                this.fcntl.invoke(_31_, 2, _32_);
            }
            while (false);
            this.__syscall1.invoke(6, (this._loadInt(((_32_ + 140) + ((1 - (this._loadInt((_32_ + 136)))) << 2)))));
            label$13:
            do {
                if ((this._loadInt((_32_ + 44))) == 0) {
                    break label$13;
                }
                this.__unlockfile.invoke((this._loadInt((_32_ + 124))));
            }
            while (false);
            this._storeInt((_32_ + 156), (this._loadInt((_32_ + 124))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 156));
        this._storeInt((0 + 4), (_32_ + 160));
        return _31_;
    }

    @Override()
    public final int posix_close(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = close((this._loadInt((_32_ + 12))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int posix_memalign(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt((_33_ + 20))) & 4294967295L) > (3 & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((_33_ + 28), 22);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._storeInt((_33_ + 12), (__memalign((this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))))))) == 0) {
                    break label$2;
                }
                this._storeInt((this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 12))));
                this._storeInt((_33_ + 28), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 28), (this._loadInt((__errno_location()))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final double pow(double _30_, double _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeDouble(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 368))) + 352), _30_);
        this._storeDouble((_33_ + 344), _31_);
        this._storeDouble((_33_ + 168), (this._loadDouble((_33_ + 352))));
        this._storeLong32((_33_ + 200), (this._loadLong32u((_33_ + 172))));
        this._storeLong32((_33_ + 184), (this._loadLong((_33_ + 168))));
        this._storeDouble((_33_ + 160), (this._loadDouble((_33_ + 344))));
        this._storeLong32((_33_ + 196), (this._loadLong32u((_33_ + 164))));
        this._storeLong32((_33_ + 180), (this._loadLong((_33_ + 160))));
        this._storeInt((_33_ + 192), ((this._loadInt((_33_ + 200))) & 2147483647));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if (((this._storeInt((_33_ + 188), ((this._loadInt((_33_ + 196))) & 2147483647))) | (this._loadInt((_33_ + 180)))) == 0) {
                            break label$3;
                        }
                        label$4:
                        do {
                            if ((this._loadInt((_33_ + 200))) != 1072693248) {
                                break label$4;
                            }
                            if ((this._loadInt((_33_ + 184))) == 0) {
                                break label$2;
                            }
                        }
                        while (false);
                        label$5:
                        do {
                            if ((this._loadInt((_33_ + 192))) > 2146435072) {
                                break label$5;
                            }
                            label$6:
                            do {
                                if ((this._loadInt((_33_ + 192))) != 2146435072) {
                                    break label$6;
                                }
                                if ((this._loadInt((_33_ + 184))) != 0) {
                                    break label$5;
                                }
                            }
                            while (false);
                            if ((this._loadInt((_33_ + 188))) > 2146435072) {
                                break label$5;
                            }
                            if ((this._loadInt((_33_ + 188))) != 2146435072) {
                                break label$1;
                            }
                            if ((this._loadInt((_33_ + 180))) == 0) {
                                break label$1;
                            }
                        }
                        while (false);
                        this._storeDouble((_33_ + 360), ((this._loadDouble((_33_ + 352))) + (this._loadDouble((_33_ + 344)))));
                        break label$0;
                    }
                    while (false);
                    this._storeLong((_33_ + 360), 4607182418800017408L);
                    break label$0;
                }
                while (false);
                this._storeLong((_33_ + 360), 4607182418800017408L);
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 208), 0);
            label$7:
            do {
                if ((this._loadInt((_33_ + 200))) > -1) {
                    break label$7;
                }
                label$8:
                do {
                    if ((this._loadInt((_33_ + 188))) < 1128267776) {
                        break label$8;
                    }
                    this._storeInt((_33_ + 208), 2);
                    break label$7;
                }
                while (false);
                if ((this._loadInt((_33_ + 188))) < 1072693248) {
                    break label$7;
                }
                label$9:
                do {
                    if ((this._storeInt((_33_ + 212), (((this._loadInt((_33_ + 188))) >> 20) + -1023))) < 21) {
                        break label$9;
                    }
                    if (((this._storeInt((_33_ + 216), ((this._loadInt((_33_ + 180))) >>> (52 - (this._loadInt((_33_ + 212))))))) << (52 - (this._loadInt((_33_ + 212))))) != (this._loadInt((_33_ + 180)))) {
                        break label$7;
                    }
                    this._storeInt((_33_ + 208), (2 - ((this._loadInt((_33_ + 216))) & 1)));
                    break label$7;
                }
                while (false);
                if ((this._loadInt((_33_ + 180))) != 0) {
                    break label$7;
                }
                if (((this._storeInt((_33_ + 216), ((this._loadInt((_33_ + 188))) >> (20 - (this._loadInt((_33_ + 212))))))) << (20 - (this._loadInt((_33_ + 212))))) != (this._loadInt((_33_ + 188)))) {
                    break label$7;
                }
                this._storeInt((_33_ + 208), (2 - ((this._loadInt((_33_ + 216))) & 1)));
            }
            while (false);
            label$10:
            do {
                if ((this._loadInt((_33_ + 180))) != 0) {
                    break label$10;
                }
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
                                    if ((this._loadInt((_33_ + 188))) != 2146435072) {
                                        break label$15;
                                    }
                                    if ((((this._loadInt((_33_ + 192))) + -1072693248) | (this._loadInt((_33_ + 184)))) == 0) {
                                        break label$14;
                                    }
                                    if ((this._loadInt((_33_ + 192))) < 1072693248) {
                                        break label$13;
                                    }
                                    _31_ = 0.0;
                                    label$16:
                                    do {
                                        if ((this._loadInt((_33_ + 196))) < 0) {
                                            break label$16;
                                        }
                                        _31_ = this._loadDouble((_33_ + 344));
                                    }
                                    while (false);
                                    this._storeDouble((_33_ + 360), _31_);
                                    break label$0;
                                }
                                while (false);
                                label$17:
                                do {
                                    if ((this._loadInt((_33_ + 188))) != 1072693248) {
                                        break label$17;
                                    }
                                    if ((this._loadInt((_33_ + 196))) < 0) {
                                        break label$12;
                                    }
                                    this._storeDouble((_33_ + 360), (this._loadDouble((_33_ + 352))));
                                    break label$0;
                                }
                                while (false);
                                if ((this._loadInt((_33_ + 196))) != 1073741824) {
                                    break label$11;
                                }
                                this._storeDouble((_33_ + 360), ((_31_ = this._loadDouble((_33_ + 352))) * _31_));
                                break label$0;
                            }
                            while (false);
                            this._storeLong((_33_ + 360), 4607182418800017408L);
                            break label$0;
                        }
                        while (false);
                        _31_ = 0.0;
                        label$18:
                        do {
                            if ((this._loadInt((_33_ + 196))) > -1) {
                                break label$18;
                            }
                            _31_ = -(this._loadDouble((_33_ + 344)));
                        }
                        while (false);
                        this._storeDouble((_33_ + 360), _31_);
                        break label$0;
                    }
                    while (false);
                    this._storeDouble((_33_ + 360), (this._storeDouble((_33_ + 344), (1.0 / (this._loadDouble((_33_ + 352)))))));
                    break label$0;
                }
                while (false);
                if ((this._loadInt((_33_ + 196))) != 1071644672) {
                    break label$10;
                }
                if ((this._loadInt((_33_ + 200))) < 0) {
                    break label$10;
                }
                this._storeDouble((_33_ + 360), (Math.sqrt((this._loadDouble((_33_ + 352))))));
                break label$0;
            }
            while (false);
            this._storeDouble((_33_ + 328), (Math.abs((this._loadDouble((_33_ + 352))))));
            label$19:
            do {
                if ((this._loadInt((_33_ + 184))) != 0) {
                    break label$19;
                }
                label$20:
                do {
                    if ((this._loadInt((_33_ + 192))) == 2146435072) {
                        break label$20;
                    }
                    if ((this._loadInt((_33_ + 192))) == 0) {
                        break label$20;
                    }
                    if ((this._loadInt((_33_ + 192))) != 1072693248) {
                        break label$19;
                    }
                }
                while (false);
                this._storeDouble((_33_ + 336), (this._loadDouble((_33_ + 328))));
                label$21:
                do {
                    if ((this._loadInt((_33_ + 196))) > -1) {
                        break label$21;
                    }
                    this._storeDouble((_33_ + 336), (1.0 / (this._loadDouble((_33_ + 336)))));
                }
                while (false);
                label$22:
                do {
                    if ((this._loadInt((_33_ + 200))) > -1) {
                        break label$22;
                    }
                    label$23:
                    do {
                        if ((((this._loadInt((_33_ + 192))) + -1072693248) | (this._loadInt((_33_ + 208)))) == 0) {
                            break label$23;
                        }
                        if ((this._loadInt((_33_ + 208))) != 1) {
                            break label$22;
                        }
                        this._storeDouble((_33_ + 336), (-(this._loadDouble((_33_ + 336)))));
                        break label$22;
                    }
                    while (false);
                    this._storeDouble((_33_ + 336), ((_31_ = (_31_ = this._loadDouble((_33_ + 336))) - _31_) / _31_));
                }
                while (false);
                this._storeDouble((_33_ + 360), (this._loadDouble((_33_ + 336))));
                break label$0;
            }
            while (false);
            this._storeLong((_33_ + 256), 4607182418800017408L);
            label$24:
            do {
                if ((this._loadInt((_33_ + 200))) > -1) {
                    break label$24;
                }
                label$25:
                do {
                    if ((this._loadInt((_33_ + 208))) == 0) {
                        break label$25;
                    }
                    if ((this._loadInt((_33_ + 208))) != 1) {
                        break label$24;
                    }
                    this._storeLong((_33_ + 256), -4616189618054758400L);
                    break label$24;
                }
                while (false);
                this._storeDouble((_33_ + 360), ((_31_ = (_31_ = this._loadDouble((_33_ + 352))) - _31_) / _31_));
                break label$0;
            }
            while (false);
            label$26:
            do {
                label$27:
                do {
                    label$28:
                    do {
                        label$29:
                        do {
                            label$30:
                            do {
                                label$31:
                                do {
                                    label$32:
                                    do {
                                        label$33:
                                        do {
                                            label$34:
                                            do {
                                                if ((this._loadInt((_33_ + 188))) < 1105199105) {
                                                    break label$34;
                                                }
                                                if ((this._loadInt((_33_ + 188))) < 1139802113) {
                                                    break label$32;
                                                }
                                                if ((this._loadInt((_33_ + 192))) > 1072693247) {
                                                    break label$33;
                                                }
                                                _31_ = Double.POSITIVE_INFINITY;
                                                label$35:
                                                do {
                                                    if ((this._loadInt((_33_ + 196))) < 0) {
                                                        break label$35;
                                                    }
                                                    _31_ = 0.0;
                                                }
                                                while (false);
                                                this._storeDouble((_33_ + 360), _31_);
                                                break label$0;
                                            }
                                            while (false);
                                            this._storeInt((_33_ + 204), 0);
                                            label$36:
                                            do {
                                                if ((this._loadInt((_33_ + 192))) > 1048575) {
                                                    break label$36;
                                                }
                                                this._storeDouble((_33_ + 328), ((this._loadDouble((_33_ + 328))) * 9.007199254740992E15));
                                                this._storeInt((_33_ + 204), ((this._loadInt((_33_ + 204))) + -53));
                                                this._storeDouble((_33_ + 96), (this._loadDouble((_33_ + 328))));
                                                this._storeLong32((_33_ + 192), (this._loadLong32u((_33_ + 100))));
                                            }
                                            while (false);
                                            this._storeInt((_33_ + 204), (((this._loadInt((_33_ + 204))) + ((this._loadInt((_33_ + 192))) >> 20)) + -1023));
                                            this._storeInt((_33_ + 192), ((this._storeInt((_33_ + 216), ((this._loadInt((_33_ + 192))) & 1048575))) | 1072693248));
                                            label$37:
                                            do {
                                                if ((this._loadInt((_33_ + 216))) > 235662) {
                                                    break label$37;
                                                }
                                                this._storeInt((_33_ + 212), 0);
                                                break label$30;
                                            }
                                            while (false);
                                            if ((this._loadInt((_33_ + 216))) > 767609) {
                                                break label$31;
                                            }
                                            this._storeInt((_33_ + 212), 1);
                                            break label$30;
                                        }
                                        while (false);
                                        if ((this._loadInt((_33_ + 192))) < 1072693248) {
                                            break label$32;
                                        }
                                        _31_ = Double.POSITIVE_INFINITY;
                                        label$38:
                                        do {
                                            if ((this._loadInt((_33_ + 196))) > 0) {
                                                break label$38;
                                            }
                                            _31_ = 0.0;
                                        }
                                        while (false);
                                        this._storeDouble((_33_ + 360), _31_);
                                        break label$0;
                                    }
                                    while (false);
                                    label$39:
                                    do {
                                        if ((this._loadInt((_33_ + 192))) > 1072693246) {
                                            break label$39;
                                        }
                                        if ((this._loadInt((_33_ + 196))) <= -1) {
                                            break label$28;
                                        }
                                        this._storeDouble((_33_ + 360), (((this._loadDouble((_33_ + 256))) * 1.0E-300) * 1.0E-300));
                                        break label$0;
                                    }
                                    while (false);
                                    if ((this._loadInt((_33_ + 192))) < 1072693249) {
                                        break label$29;
                                    }
                                    if ((this._loadInt((_33_ + 196))) < 1) {
                                        break label$27;
                                    }
                                    this._storeDouble((_33_ + 360), (((this._loadDouble((_33_ + 256))) * 1.0E300) * 1.0E300));
                                    break label$0;
                                }
                                while (false);
                                this._storeInt((_33_ + 212), 0);
                                this._storeInt((_33_ + 204), ((this._loadInt((_33_ + 204))) + 1));
                                this._storeInt((_33_ + 192), ((this._loadInt((_33_ + 192))) + -1048576));
                            }
                            while (false);
                            this._storeDouble((_33_ + 88), (this._loadDouble((_33_ + 328))));
                            this._storeLong((_33_ + 88), ((this._storeLong((_33_ + 88), (this._loadLong32u((_33_ + 88))))) | ((this._loadLong32u((_33_ + 192))) << 32L)));
                            this._storeDouble((_33_ + 240), ((this._storeDouble((_33_ + 328), (this._loadDouble((_33_ + 88))))) - (this._loadDouble((((this._loadInt((_33_ + 212))) << 3) + 14192)))));
                            this._storeDouble((_33_ + 80), (this._storeDouble((_33_ + 128), (this._storeDouble((_33_ + 144), ((this._storeDouble((_33_ + 232), (1.0 / ((this._loadDouble((_33_ + 328))) + (this._loadDouble((((this._loadInt((_33_ + 212))) << 3) + 14192))))))) * (this._loadDouble((_33_ + 240)))))))));
                            this._storeLong((_33_ + 80), ((this._loadLong((_33_ + 80))) & -4294967296L));
                            this._storeDouble((_33_ + 128), (this._loadDouble((_33_ + 80))));
                            this._storeLong((_33_ + 72), (this._storeLong((_33_ + 112), 0L)));
                            this._storeLong((_33_ + 72), ((this._storeLong((_33_ + 72), (this._loadLong32u((_33_ + 72))))) | (((((((this._loadInt((_33_ + 192))) >> 1) | 536870912) + ((this._loadInt((_33_ + 212))) << 18)) + 524288) & 4294967295L) << 32L)));
                            _31_ = this._storeDouble((_33_ + 112), (this._loadDouble((_33_ + 72))));
                            _31_ = this._storeDouble((_33_ + 104), ((this._loadDouble((_33_ + 328))) - (_31_ - (this._loadDouble((((this._loadInt((_33_ + 212))) << 3) + 14192))))));
                            this._storeDouble((_33_ + 120), ((this._loadDouble((_33_ + 232))) * (((this._loadDouble((_33_ + 240))) - ((_30_ = this._loadDouble((_33_ + 128))) * (this._loadDouble((_33_ + 112))))) - (_30_ * _31_))));
                            this._storeDouble((_33_ + 264), ((this._storeDouble((_33_ + 264), (((_31_ = this._storeDouble((_33_ + 136), ((_31_ = this._loadDouble((_33_ + 144))) * _31_))) * _31_) * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * 0.20697501780033842) + 0.23066074577556175)) + 0.272728123808534)) + 0.33333332981837743)) + 0.4285714285785502)) + 0.5999999999999946)))) + ((this._loadDouble((_33_ + 120))) * ((this._loadDouble((_33_ + 128))) + (this._loadDouble((_33_ + 144)))))));
                            this._storeDouble((_33_ + 64), (this._storeDouble((_33_ + 112), (((this._storeDouble((_33_ + 136), ((_31_ = this._loadDouble((_33_ + 128))) * _31_))) + 3.0) + (this._loadDouble((_33_ + 264)))))));
                            this._storeLong((_33_ + 64), ((this._loadLong((_33_ + 64))) & -4294967296L));
                            _31_ = this._storeDouble((_33_ + 112), (this._loadDouble((_33_ + 64))));
                            this._storeDouble((_33_ + 104), ((this._loadDouble((_33_ + 264))) - ((_31_ - 3.0) - (this._loadDouble((_33_ + 136))))));
                            this._storeDouble((_33_ + 240), ((this._loadDouble((_33_ + 128))) * (this._loadDouble((_33_ + 112)))));
                            this._storeDouble((_33_ + 56), (this._storeDouble((_33_ + 304), ((this._storeDouble((_33_ + 232), (((this._loadDouble((_33_ + 120))) * (this._loadDouble((_33_ + 112)))) + ((this._loadDouble((_33_ + 104))) * (this._loadDouble((_33_ + 144))))))) + (this._loadDouble((_33_ + 240)))))));
                            this._storeLong((_33_ + 56), ((this._loadLong((_33_ + 56))) & -4294967296L));
                            _31_ = this._storeDouble((_33_ + 304), (this._loadDouble((_33_ + 56))));
                            this._storeDouble((_33_ + 296), ((this._loadDouble((_33_ + 232))) - (_31_ - (this._loadDouble((_33_ + 240))))));
                            this._storeDouble((_33_ + 320), ((this._loadDouble((_33_ + 304))) * 0.9617967009544373));
                            this._storeDouble((_33_ + 312), ((((this._loadDouble((_33_ + 304))) * -7.028461650952758E-9) + ((this._loadDouble((_33_ + 296))) * 0.9617966939259756)) + (this._loadDouble((((this._loadInt((_33_ + 212))) << 3) + 14208)))));
                            this._storeDouble((_33_ + 48), (this._storeDouble((_33_ + 280), ((this._storeDouble((_33_ + 248), ((double) (this._loadInt((_33_ + 204)))))) + (((this._loadDouble((_33_ + 320))) + (this._loadDouble((_33_ + 312)))) + (this._loadDouble((((this._loadInt((_33_ + 212))) << 3) + 14224))))))));
                            this._storeLong((_33_ + 48), ((this._loadLong((_33_ + 48))) & -4294967296L));
                            _31_ = this._storeDouble((_33_ + 280), (this._loadDouble((_33_ + 48))));
                            this._storeDouble((_33_ + 272), ((this._loadDouble((_33_ + 312))) - (((_31_ - (this._loadDouble((_33_ + 248)))) - (this._loadDouble((((this._loadInt((_33_ + 212))) << 3) + 14224)))) - (this._loadDouble((_33_ + 320))))));
                            break label$26;
                        }
                        while (false);
                        this._storeDouble((_33_ + 224), (((_31_ = this._storeDouble((_33_ + 248), ((this._loadDouble((_33_ + 328))) + -1.0))) * _31_) * (0.5 - (_31_ * ((_31_ * -0.25) + 0.3333333333333333)))));
                        this._storeDouble((_33_ + 240), ((this._loadDouble((_33_ + 248))) * 1.4426950216293335));
                        this._storeDouble((_33_ + 152), (this._storeDouble((_33_ + 280), ((this._storeDouble((_33_ + 232), (((this._loadDouble((_33_ + 248))) * 1.9259629911266175E-8) + ((this._loadDouble((_33_ + 224))) * -1.4426950408889634)))) + (this._loadDouble((_33_ + 240)))))));
                        this._storeLong((_33_ + 152), ((this._loadLong((_33_ + 152))) & -4294967296L));
                        _31_ = this._storeDouble((_33_ + 280), (this._loadDouble((_33_ + 152))));
                        this._storeDouble((_33_ + 272), ((this._loadDouble((_33_ + 232))) - (_31_ - (this._loadDouble((_33_ + 240))))));
                        break label$26;
                    }
                    while (false);
                    this._storeDouble((_33_ + 360), (((this._loadDouble((_33_ + 256))) * 1.0E300) * 1.0E300));
                    break label$0;
                }
                while (false);
                this._storeDouble((_33_ + 360), (((this._loadDouble((_33_ + 256))) * 1.0E-300) * 1.0E-300));
                break label$0;
            }
            while (false);
            this._storeDouble((_33_ + 40), (this._storeDouble((_33_ + 288), (this._loadDouble((_33_ + 344))))));
            this._storeLong((_33_ + 40), ((this._loadLong((_33_ + 40))) & -4294967296L));
            _31_ = this._storeDouble((_33_ + 288), (this._loadDouble((_33_ + 40))));
            this._storeDouble((_33_ + 296), ((((_30_ = this._loadDouble((_33_ + 344))) - _31_) * (this._loadDouble((_33_ + 280)))) + (_30_ * (this._loadDouble((_33_ + 272))))));
            this._storeDouble((_33_ + 32), (this._storeDouble((_33_ + 336), ((this._storeDouble((_33_ + 304), ((this._loadDouble((_33_ + 288))) * (this._loadDouble((_33_ + 280)))))) + (this._loadDouble((_33_ + 296)))))));
            this._storeLong32((_33_ + 216), (this._loadLong32u((_33_ + 36))));
            this._storeLong32((_33_ + 220), (this._loadLong((_33_ + 32))));
            label$40:
            do {
                label$41:
                do {
                    label$42:
                    do {
                        label$43:
                        do {
                            if ((this._loadInt((_33_ + 216))) < 1083179008) {
                                break label$43;
                            }
                            if ((((this._loadInt((_33_ + 216))) + -1083179008) | (this._loadInt((_33_ + 220)))) == 0) {
                                break label$42;
                            }
                            this._storeDouble((_33_ + 360), (((this._loadDouble((_33_ + 256))) * 1.0E300) * 1.0E300));
                            break label$0;
                        }
                        while (false);
                        if (((this._loadInt((_33_ + 216))) & 2147483647) < 1083231232) {
                            break label$40;
                        }
                        if ((((this._loadInt((_33_ + 216))) + 1064252416) | (this._loadInt((_33_ + 220)))) == 0) {
                            break label$41;
                        }
                        this._storeDouble((_33_ + 360), (((this._loadDouble((_33_ + 256))) * 1.0E-300) * 1.0E-300));
                        break label$0;
                    }
                    while (false);
                    if (((((_31_ = (this._loadDouble((_33_ + 296))) + 8.008566259537294E-17) <= (_30_ = (this._loadDouble((_33_ + 336))) - (this._loadDouble((_33_ + 304))))) ? 1 : 0) | (((_31_ != _31_) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0))) != 0) {
                        break label$40;
                    }
                    this._storeDouble((_33_ + 360), (((this._loadDouble((_33_ + 256))) * 1.0E300) * 1.0E300));
                    break label$0;
                }
                while (false);
                if (((((_31_ = this._loadDouble((_33_ + 296))) > (_30_ = (this._loadDouble((_33_ + 336))) - (this._loadDouble((_33_ + 304))))) ? 1 : 0) | (((_31_ != _31_) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0))) != 0) {
                    break label$40;
                }
                this._storeDouble((_33_ + 360), (((this._loadDouble((_33_ + 256))) * 1.0E-300) * 1.0E-300));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 212), (((this._storeInt((_33_ + 220), ((this._loadInt((_33_ + 216))) & 2147483647))) >>> 20) + -1023));
            _32_ = this._storeInt((_33_ + 204), 0);
            label$44:
            do {
                if ((this._loadInt((_33_ + 220))) < 1071644673) {
                    break label$44;
                }
                this._storeInt((_33_ + 212), ((((this._storeInt((_33_ + 204), ((this._loadInt((_33_ + 216))) + (1048576 >>> ((this._loadInt((_33_ + 212))) + 1))))) & 2146435072) >>> 20) + -1023));
                this._storeLong((_33_ + 24), (this._storeLong((_33_ + 248), 0L)));
                this._storeLong((_33_ + 24), ((this._storeLong((_33_ + 24), (this._loadLong32u((_33_ + 24))))) | ((((this._loadInt((_33_ + 204))) & ((1048575 >>> (this._loadInt((_33_ + 212)))) ^ -1)) & 4294967295L) << 32L)));
                this._storeDouble((_33_ + 248), (this._loadDouble((_33_ + 24))));
                this._storeInt((_33_ + 204), ((((this._loadInt((_33_ + 204))) & 1048575) | 1048576) >>> (20 - (this._loadInt((_33_ + 212))))));
                label$45:
                do {
                    if ((this._loadInt((_33_ + 216))) > -1) {
                        break label$45;
                    }
                    this._storeInt((_33_ + 204), (0 - (this._loadInt((_33_ + 204)))));
                }
                while (false);
                this._storeDouble((_33_ + 304), ((this._loadDouble((_33_ + 304))) - (this._loadDouble((_33_ + 248)))));
            }
            while (false);
            this._storeDouble((_33_ + 16), (this._storeDouble((_33_ + 248), ((this._loadDouble((_33_ + 296))) + (this._loadDouble((_33_ + 304)))))));
            this._storeLong((_33_ + 16), ((this._loadLong((_33_ + 16))) & -4294967296L));
            this._storeDouble((_33_ + 240), ((this._storeDouble((_33_ + 248), (this._loadDouble((_33_ + 16))))) * 0.6931471824645996));
            _31_ = this._storeDouble((_33_ + 336), ((this._storeDouble((_33_ + 232), ((((this._loadDouble((_33_ + 296))) - ((_31_ = this._loadDouble((_33_ + 248))) - (this._loadDouble((_33_ + 304))))) * 0.6931471805599453) + (_31_ * -1.904654299957768E-9)))) + (this._loadDouble((_33_ + 240)))));
            this._storeDouble((_33_ + 224), ((this._loadDouble((_33_ + 232))) - (_31_ - (this._loadDouble((_33_ + 240))))));
            _31_ = this._storeDouble((_33_ + 248), ((_31_ = this._loadDouble((_33_ + 336))) * _31_));
            this._storeDouble((_33_ + 8), (this._storeDouble((_33_ + 336), (1.0 - ((this._storeDouble((_33_ + 264), ((((_31_ = this._storeDouble((_33_ + 280), ((this._loadDouble((_33_ + 336))) - (_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * 4.1381367970572385E-8) + -1.6533902205465252E-6)) + 6.613756321437934E-5)) + -0.0027777777777015593)) + 0.16666666666666602))))) * (_30_ = this._loadDouble((_33_ + 336)))) / (_31_ + -2.0)) - ((_31_ = this._loadDouble((_33_ + 224))) + (_30_ * _31_))))) - (this._loadDouble((_33_ + 336))))))));
            label$46:
            do {
                label$47:
                do {
                    if (((this._storeInt((_33_ + 216), ((this._storeInt((_33_ + 216), (this._loadInt((_33_ + 12))))) + ((this._loadInt((_33_ + 204))) << 20)))) >> 20) > _32_) {
                        break label$47;
                    }
                    this._storeDouble((_33_ + 336), (scalbn((this._loadDouble((_33_ + 336))), (this._loadInt((_33_ + 204))))));
                    break label$46;
                }
                while (false);
                this._storeDouble(_33_, (this._loadDouble((_33_ + 336))));
                this._storeLong(_33_, ((this._storeLong(_33_, (this._loadLong32u(_33_)))) | ((this._loadLong32u((_33_ + 216))) << 32L)));
                this._storeDouble((_33_ + 336), (this._loadDouble(_33_)));
            }
            while (false);
            this._storeDouble((_33_ + 360), ((this._loadDouble((_33_ + 256))) * (this._loadDouble((_33_ + 336)))));
        }
        while (false);
        _31_ = this._loadDouble((_33_ + 360));
        this._storeInt((0 + 4), (_33_ + 368));
        return _31_;
    }

    @Override()
    public final float powf(float _30_, float _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        int _34_ = 0;
        this._storeFloat(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 320))) + 312), _30_);
        this._storeFloat((_33_ + 308), _31_);
        this._storeFloat((_33_ + 200), (this._loadFloat((_33_ + 312))));
        this._storeInt((_33_ + 220), (this._loadInt((_33_ + 200))));
        this._storeFloat((_33_ + 192), (this._loadFloat((_33_ + 308))));
        this._storeInt((_33_ + 216), (this._loadInt((_33_ + 192))));
        this._storeInt((_33_ + 212), ((this._loadInt((_33_ + 220))) & 2147483647));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._storeInt((_33_ + 208), ((this._loadInt((_33_ + 216))) & 2147483647))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt((_33_ + 220))) != 1065353216) {
                        break label$1;
                    }
                    this._storeInt((_33_ + 316), 1065353216);
                    break label$0;
                }
                while (false);
                this._storeInt((_33_ + 316), 1065353216);
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if ((this._loadInt((_33_ + 212))) > 2139095040) {
                        break label$4;
                    }
                    if ((this._loadInt((_33_ + 208))) < 2139095041) {
                        break label$3;
                    }
                }
                while (false);
                this._storeFloat((_33_ + 316), ((this._loadFloat((_33_ + 312))) + (this._loadFloat((_33_ + 308)))));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 228), 0);
            label$5:
            do {
                if ((this._loadInt((_33_ + 220))) > -1) {
                    break label$5;
                }
                label$6:
                do {
                    if ((this._loadInt((_33_ + 208))) < 1266679808) {
                        break label$6;
                    }
                    this._storeInt((_33_ + 228), 2);
                    break label$5;
                }
                while (false);
                if ((this._loadInt((_33_ + 208))) < 1065353216) {
                    break label$5;
                }
                this._storeInt((_33_ + 232), ((_34_ = (this._loadInt((_33_ + 208))) >> 23) + -127));
                if (((this._storeInt((_33_ + 236), ((this._loadInt((_33_ + 208))) >> (150 - _34_)))) << (23 - (this._loadInt((_33_ + 232))))) != (this._loadInt((_33_ + 208)))) {
                    break label$5;
                }
                this._storeInt((_33_ + 228), (2 - ((this._loadInt((_33_ + 236))) & 1)));
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
                                    if ((this._loadInt((_33_ + 208))) != 2139095040) {
                                        break label$12;
                                    }
                                    if ((this._loadInt((_33_ + 212))) != 1065353216) {
                                        break label$11;
                                    }
                                    this._storeInt((_33_ + 316), 1065353216);
                                    break label$0;
                                }
                                while (false);
                                if ((this._loadInt((_33_ + 208))) != 1065353216) {
                                    break label$10;
                                }
                                if ((this._loadInt((_33_ + 216))) < 0) {
                                    break label$9;
                                }
                                this._storeFloat((_33_ + 316), (this._loadFloat((_33_ + 312))));
                                break label$0;
                            }
                            while (false);
                            if ((this._loadInt((_33_ + 212))) < 1065353217) {
                                break label$8;
                            }
                            _31_ = 0.0f;
                            label$13:
                            do {
                                if ((this._loadInt((_33_ + 216))) < 0) {
                                    break label$13;
                                }
                                _31_ = this._loadFloat((_33_ + 308));
                            }
                            while (false);
                            this._storeFloat((_33_ + 316), _31_);
                            break label$0;
                        }
                        while (false);
                        if ((this._loadInt((_33_ + 216))) != 1073741824) {
                            break label$7;
                        }
                        this._storeFloat((_33_ + 316), ((_31_ = this._loadFloat((_33_ + 312))) * _31_));
                        break label$0;
                    }
                    while (false);
                    this._storeFloat((_33_ + 316), (1.0f / (this._loadFloat((_33_ + 312)))));
                    break label$0;
                }
                while (false);
                _31_ = 0.0f;
                label$14:
                do {
                    if ((this._loadInt((_33_ + 216))) > -1) {
                        break label$14;
                    }
                    _31_ = -(this._loadFloat((_33_ + 308)));
                }
                while (false);
                this._storeFloat((_33_ + 316), _31_);
                break label$0;
            }
            while (false);
            label$15:
            do {
                if ((this._loadInt((_33_ + 216))) != 1056964608) {
                    break label$15;
                }
                if ((this._loadInt((_33_ + 220))) < 0) {
                    break label$15;
                }
                this._storeFloat((_33_ + 316), ((float) (Math.sqrt((this._loadFloat((_33_ + 312)))))));
                break label$0;
            }
            while (false);
            this._storeFloat((_33_ + 300), (Math.abs((this._loadFloat((_33_ + 312))))));
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
                                    if ((this._loadInt((_33_ + 212))) == 2139095040) {
                                        break label$21;
                                    }
                                    if ((this._loadInt((_33_ + 212))) == 0) {
                                        break label$21;
                                    }
                                    if ((this._loadInt((_33_ + 212))) != 1065353216) {
                                        break label$20;
                                    }
                                }
                                while (false);
                                this._storeFloat((_33_ + 304), (this._loadFloat((_33_ + 300))));
                                label$22:
                                do {
                                    if ((this._loadInt((_33_ + 216))) > -1) {
                                        break label$22;
                                    }
                                    this._storeFloat((_33_ + 304), (1.0f / (this._loadFloat((_33_ + 304)))));
                                }
                                while (false);
                                if ((this._loadInt((_33_ + 220))) > -1) {
                                    break label$16;
                                }
                                if ((((this._loadInt((_33_ + 212))) + -1065353216) | (this._loadInt((_33_ + 228)))) == 0) {
                                    break label$19;
                                }
                                if ((this._loadInt((_33_ + 228))) != 1) {
                                    break label$16;
                                }
                                this._storeFloat((_33_ + 304), (-(this._loadFloat((_33_ + 304)))));
                                break label$16;
                            }
                            while (false);
                            this._storeInt((_33_ + 260), 1065353216);
                            if ((this._loadInt((_33_ + 220))) <= -1) {
                                break label$18;
                            }
                            break label$17;
                        }
                        while (false);
                        this._storeFloat((_33_ + 304), ((_31_ = (_31_ = this._loadFloat((_33_ + 304))) - _31_) / _31_));
                        break label$16;
                    }
                    while (false);
                    label$23:
                    do {
                        if ((this._loadInt((_33_ + 228))) == 0) {
                            break label$23;
                        }
                        if ((this._loadInt((_33_ + 228))) != 1) {
                            break label$17;
                        }
                        this._storeInt((_33_ + 260), -1082130432);
                        break label$17;
                    }
                    while (false);
                    this._storeFloat((_33_ + 316), ((_31_ = (_31_ = this._loadFloat((_33_ + 312))) - _31_) / _31_));
                    break label$0;
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
                                        label$30:
                                        do {
                                            label$31:
                                            do {
                                                label$32:
                                                do {
                                                    label$33:
                                                    do {
                                                        label$34:
                                                        do {
                                                            if ((this._loadInt((_33_ + 208))) < 1291845633) {
                                                                break label$34;
                                                            }
                                                            if ((this._loadInt((_33_ + 212))) > 1065353207) {
                                                                break label$33;
                                                            }
                                                            if ((this._loadInt((_33_ + 216))) <= -1) {
                                                                break label$27;
                                                            }
                                                            this._storeFloat((_33_ + 316), (((this._loadFloat((_33_ + 260))) * 1.0E-30f) * 1.0E-30f));
                                                            break label$0;
                                                        }
                                                        while (false);
                                                        this._storeInt((_33_ + 224), 0);
                                                        label$35:
                                                        do {
                                                            if ((this._loadInt((_33_ + 212))) > 8388607) {
                                                                break label$35;
                                                            }
                                                            this._storeFloat((_33_ + 300), ((this._loadFloat((_33_ + 300))) * 1.6777216E7f));
                                                            this._storeInt((_33_ + 224), ((this._loadInt((_33_ + 224))) + -24));
                                                            this._storeFloat((_33_ + 152), (this._loadFloat((_33_ + 300))));
                                                            this._storeInt((_33_ + 212), (this._loadInt((_33_ + 152))));
                                                        }
                                                        while (false);
                                                        this._storeInt((_33_ + 224), (((this._loadInt((_33_ + 224))) + ((this._loadInt((_33_ + 212))) >> 23)) + -127));
                                                        this._storeInt((_33_ + 212), ((this._storeInt((_33_ + 236), ((this._loadInt((_33_ + 212))) & 8388607))) | 1065353216));
                                                        if ((this._loadInt((_33_ + 236))) > 1885297) {
                                                            break label$32;
                                                        }
                                                        this._storeInt((_33_ + 232), 0);
                                                        break label$29;
                                                    }
                                                    while (false);
                                                    if ((this._loadInt((_33_ + 212))) < 1065353224) {
                                                        break label$31;
                                                    }
                                                    if ((this._loadInt((_33_ + 216))) < 1) {
                                                        break label$24;
                                                    }
                                                    this._storeFloat((_33_ + 316), (((this._loadFloat((_33_ + 260))) * 1.0E30f) * 1.0E30f));
                                                    break label$0;
                                                }
                                                while (false);
                                                if ((this._loadInt((_33_ + 236))) > 6140886) {
                                                    break label$30;
                                                }
                                                this._storeInt((_33_ + 232), 1);
                                                break label$29;
                                            }
                                            while (false);
                                            this._storeFloat((_33_ + 244), (((_31_ = this._storeFloat((_33_ + 256), ((this._loadFloat((_33_ + 300))) + -1.0f))) * _31_) * (0.5f - (_31_ * ((_31_ * -0.25f) + 0.33333334f)))));
                                            this._storeFloat((_33_ + 252), ((this._loadFloat((_33_ + 256))) * 1.442688f));
                                            this._storeFloat((_33_ + 184), (this._storeFloat((_33_ + 276), ((this._storeFloat((_33_ + 248), (((this._loadFloat((_33_ + 256))) * 7.0526075E-6f) + ((this._loadFloat((_33_ + 244))) * -1.442695f)))) + (this._loadFloat((_33_ + 252)))))));
                                            this._storeInt((_33_ + 176), ((this._storeInt((_33_ + 204), (this._loadInt((_33_ + 184))))) & -4096));
                                            _31_ = this._storeFloat((_33_ + 276), (this._loadFloat((_33_ + 176))));
                                            this._storeFloat((_33_ + 272), ((this._loadFloat((_33_ + 248))) - (_31_ - (this._loadFloat((_33_ + 252))))));
                                            break label$28;
                                        }
                                        while (false);
                                        this._storeInt((_33_ + 232), 0);
                                        this._storeInt((_33_ + 224), ((this._loadInt((_33_ + 224))) + 1));
                                        this._storeInt((_33_ + 212), ((this._loadInt((_33_ + 212))) + -8388608));
                                    }
                                    while (false);
                                    this._storeInt((_33_ + 144), (this._loadInt((_33_ + 212))));
                                    this._storeFloat((_33_ + 252), ((this._storeFloat((_33_ + 300), (this._loadFloat((_33_ + 144))))) - (this._loadFloat((((this._loadInt((_33_ + 232))) << 2) + 14240)))));
                                    this._storeFloat((_33_ + 136), (this._storeFloat((_33_ + 168), (this._storeFloat((_33_ + 264), ((this._storeFloat((_33_ + 248), (1.0f / ((this._loadFloat((_33_ + 300))) + (this._loadFloat((((this._loadInt((_33_ + 232))) << 2) + 14240))))))) * (this._loadFloat((_33_ + 252)))))))));
                                    this._storeInt((_33_ + 128), ((this._storeInt((_33_ + 204), (this._loadInt((_33_ + 136))))) & -4096));
                                    this._storeFloat((_33_ + 168), (this._loadFloat((_33_ + 128))));
                                    this._storeInt((_33_ + 120), (((this._storeInt((_33_ + 204), ((((this._loadInt((_33_ + 212))) >> 1) | 536870912) & -4096))) + ((this._loadInt((_33_ + 232))) << 21)) + 4194304));
                                    _31_ = this._storeFloat((_33_ + 160), (this._loadFloat((_33_ + 120))));
                                    _31_ = this._storeFloat((_33_ + 156), ((this._loadFloat((_33_ + 300))) - (_31_ - (this._loadFloat((((this._loadInt((_33_ + 232))) << 2) + 14240))))));
                                    this._storeFloat((_33_ + 164), ((this._loadFloat((_33_ + 248))) * (((this._loadFloat((_33_ + 252))) - ((_30_ = this._loadFloat((_33_ + 168))) * (this._loadFloat((_33_ + 160))))) - (_30_ * _31_))));
                                    this._storeFloat((_33_ + 268), ((this._storeFloat((_33_ + 268), (((_31_ = this._storeFloat((_33_ + 172), ((_31_ = this._loadFloat((_33_ + 264))) * _31_))) * _31_) * ((_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * 0.20697501f) + 0.23066075f)) + 0.27272812f)) + 0.33333334f)) + 0.42857143f)) + 0.6f)))) + ((this._loadFloat((_33_ + 164))) * ((this._loadFloat((_33_ + 168))) + (this._loadFloat((_33_ + 264)))))));
                                    this._storeFloat((_33_ + 112), (this._storeFloat((_33_ + 160), (((this._storeFloat((_33_ + 172), ((_31_ = this._loadFloat((_33_ + 168))) * _31_))) + 3.0f) + (this._loadFloat((_33_ + 268)))))));
                                    this._storeInt((_33_ + 104), ((this._storeInt((_33_ + 204), (this._loadInt((_33_ + 112))))) & -4096));
                                    _31_ = this._storeFloat((_33_ + 160), (this._loadFloat((_33_ + 104))));
                                    this._storeFloat((_33_ + 156), ((this._loadFloat((_33_ + 268))) - ((_31_ - 3.0f) - (this._loadFloat((_33_ + 172))))));
                                    this._storeFloat((_33_ + 252), ((this._loadFloat((_33_ + 168))) * (this._loadFloat((_33_ + 160)))));
                                    this._storeFloat((_33_ + 96), (this._storeFloat((_33_ + 288), ((this._storeFloat((_33_ + 248), (((this._loadFloat((_33_ + 164))) * (this._loadFloat((_33_ + 160)))) + ((this._loadFloat((_33_ + 156))) * (this._loadFloat((_33_ + 264))))))) + (this._loadFloat((_33_ + 252)))))));
                                    this._storeInt((_33_ + 88), ((this._storeInt((_33_ + 204), (this._loadInt((_33_ + 96))))) & -4096));
                                    _31_ = this._storeFloat((_33_ + 288), (this._loadFloat((_33_ + 88))));
                                    this._storeFloat((_33_ + 284), ((this._loadFloat((_33_ + 248))) - (_31_ - (this._loadFloat((_33_ + 252))))));
                                    this._storeFloat((_33_ + 296), ((this._loadFloat((_33_ + 288))) * 0.96191406f));
                                    this._storeFloat((_33_ + 292), ((((this._loadFloat((_33_ + 288))) * -1.17368574E-4f) + ((this._loadFloat((_33_ + 284))) * 0.9617967f)) + (this._loadFloat((((this._loadInt((_33_ + 232))) << 2) + 14248)))));
                                    this._storeFloat((_33_ + 80), (this._storeFloat((_33_ + 276), ((this._storeFloat((_33_ + 256), ((float) (this._loadInt((_33_ + 224)))))) + (((this._loadFloat((_33_ + 296))) + (this._loadFloat((_33_ + 292)))) + (this._loadFloat((((this._loadInt((_33_ + 232))) << 2) + 14256))))))));
                                    this._storeInt((_33_ + 72), ((this._storeInt((_33_ + 204), (this._loadInt((_33_ + 80))))) & -4096));
                                    _31_ = this._storeFloat((_33_ + 276), (this._loadFloat((_33_ + 72))));
                                    this._storeFloat((_33_ + 272), ((this._loadFloat((_33_ + 292))) - (((_31_ - (this._loadFloat((_33_ + 256)))) - (this._loadFloat((((this._loadInt((_33_ + 232))) << 2) + 14256)))) - (this._loadFloat((_33_ + 296))))));
                                }
                                while (false);
                                this._storeFloat((_33_ + 64), (this._loadFloat((_33_ + 308))));
                                this._storeInt((_33_ + 56), ((this._storeInt((_33_ + 204), (this._loadInt((_33_ + 64))))) & -4096));
                                _31_ = this._storeFloat((_33_ + 280), (this._loadFloat((_33_ + 56))));
                                this._storeFloat((_33_ + 284), ((((_30_ = this._loadFloat((_33_ + 308))) - _31_) * (this._loadFloat((_33_ + 276)))) + (_30_ * (this._loadFloat((_33_ + 272))))));
                                this._storeFloat((_33_ + 48), (this._storeFloat((_33_ + 304), ((this._storeFloat((_33_ + 288), ((this._loadFloat((_33_ + 280))) * (this._loadFloat((_33_ + 276)))))) + (this._loadFloat((_33_ + 284)))))));
                                label$36:
                                do {
                                    if ((this._storeInt((_33_ + 236), (this._loadInt((_33_ + 48))))) < 1124073473) {
                                        break label$36;
                                    }
                                    this._storeFloat((_33_ + 316), (((this._loadFloat((_33_ + 260))) * 1.0E30f) * 1.0E30f));
                                    break label$0;
                                }
                                while (false);
                                label$37:
                                do {
                                    if ((this._loadInt((_33_ + 236))) != 1124073472) {
                                        break label$37;
                                    }
                                    if (((((_31_ = (this._loadFloat((_33_ + 284))) + 4.2995666E-8f) <= (_30_ = (this._loadFloat((_33_ + 304))) - (this._loadFloat((_33_ + 288))))) ? 1 : 0) | (((_31_ != _31_) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0))) != 0) {
                                        break label$25;
                                    }
                                    this._storeFloat((_33_ + 316), (((this._loadFloat((_33_ + 260))) * 1.0E30f) * 1.0E30f));
                                    break label$0;
                                }
                                while (false);
                                if (((this._loadInt((_33_ + 236))) & 2147483647) < 1125515265) {
                                    break label$26;
                                }
                                this._storeFloat((_33_ + 316), (((this._loadFloat((_33_ + 260))) * 1.0E-30f) * 1.0E-30f));
                                break label$0;
                            }
                            while (false);
                            this._storeFloat((_33_ + 316), (((this._loadFloat((_33_ + 260))) * 1.0E30f) * 1.0E30f));
                            break label$0;
                        }
                        while (false);
                        if ((this._loadInt((_33_ + 236))) != -1021968384) {
                            break label$25;
                        }
                        if (((((_31_ = this._loadFloat((_33_ + 284))) > (_30_ = (this._loadFloat((_33_ + 304))) - (this._loadFloat((_33_ + 288))))) ? 1 : 0) | (((_31_ != _31_) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0))) != 0) {
                            break label$25;
                        }
                        this._storeFloat((_33_ + 316), (((this._loadFloat((_33_ + 260))) * 1.0E-30f) * 1.0E-30f));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_33_ + 232), (((this._storeInt((_33_ + 240), ((this._loadInt((_33_ + 236))) & 2147483647))) >>> 23) + -127));
                    _34_ = this._storeInt((_33_ + 224), 0);
                    label$38:
                    do {
                        if ((this._loadInt((_33_ + 240))) < 1056964609) {
                            break label$38;
                        }
                        _32_ = this._storeInt((_33_ + 232), ((((this._storeInt((_33_ + 224), ((this._loadInt((_33_ + 236))) + (8388608 >>> ((this._loadInt((_33_ + 232))) + 1))))) & 2139095040) >>> 23) + -127));
                        this._storeInt((_33_ + 40), ((this._loadInt((_33_ + 224))) & ((8388607 >>> _32_) ^ -1)));
                        this._storeFloat((_33_ + 256), (this._loadFloat((_33_ + 40))));
                        this._storeInt((_33_ + 224), ((((this._loadInt((_33_ + 224))) & 8388607) | 8388608) >>> (23 - (this._loadInt((_33_ + 232))))));
                        label$39:
                        do {
                            if ((this._loadInt((_33_ + 236))) > -1) {
                                break label$39;
                            }
                            this._storeInt((_33_ + 224), (0 - (this._loadInt((_33_ + 224)))));
                        }
                        while (false);
                        this._storeFloat((_33_ + 288), ((this._loadFloat((_33_ + 288))) - (this._loadFloat((_33_ + 256)))));
                    }
                    while (false);
                    this._storeFloat((_33_ + 32), (this._storeFloat((_33_ + 256), ((this._loadFloat((_33_ + 284))) + (this._loadFloat((_33_ + 288)))))));
                    this._storeInt((_33_ + 24), ((this._storeInt((_33_ + 204), (this._loadInt((_33_ + 32))))) & -32768));
                    this._storeFloat((_33_ + 252), ((this._storeFloat((_33_ + 256), (this._loadFloat((_33_ + 24))))) * 0.69314575f));
                    _31_ = this._storeFloat((_33_ + 304), ((this._storeFloat((_33_ + 248), ((((this._loadFloat((_33_ + 284))) - ((_31_ = this._loadFloat((_33_ + 256))) - (this._loadFloat((_33_ + 288))))) * 0.6931472f) + (_31_ * 1.4286065E-6f)))) + (this._loadFloat((_33_ + 252)))));
                    this._storeFloat((_33_ + 244), ((this._loadFloat((_33_ + 248))) - (_31_ - (this._loadFloat((_33_ + 252))))));
                    _31_ = this._storeFloat((_33_ + 256), ((_31_ = this._loadFloat((_33_ + 304))) * _31_));
                    this._storeFloat((_33_ + 16), (this._storeFloat((_33_ + 304), (1.0f - ((this._storeFloat((_33_ + 268), ((((_31_ = this._storeFloat((_33_ + 276), ((this._loadFloat((_33_ + 304))) - (_31_ * ((_31_ * ((_31_ * ((_31_ * ((_31_ * 4.138137E-8f) + -1.6533902E-6f)) + 6.613756E-5f)) + -0.0027777778f)) + 0.16666667f))))) * (_30_ = this._loadFloat((_33_ + 304)))) / (_31_ + -2.0f)) - ((_31_ = this._loadFloat((_33_ + 244))) + (_30_ * _31_))))) - (this._loadFloat((_33_ + 304))))))));
                    label$40:
                    do {
                        label$41:
                        do {
                            if (((this._storeInt((_33_ + 236), ((this._storeInt((_33_ + 236), (this._loadInt((_33_ + 16))))) + ((this._loadInt((_33_ + 224))) << 23)))) >> 23) > _34_) {
                                break label$41;
                            }
                            this._storeFloat((_33_ + 304), (scalbnf((this._loadFloat((_33_ + 304))), (this._loadInt((_33_ + 224))))));
                            break label$40;
                        }
                        while (false);
                        this._storeInt((_33_ + 8), (this._loadInt((_33_ + 236))));
                        this._storeFloat((_33_ + 304), (this._loadFloat((_33_ + 8))));
                    }
                    while (false);
                    this._storeFloat((_33_ + 316), ((this._loadFloat((_33_ + 260))) * (this._loadFloat((_33_ + 304)))));
                    break label$0;
                }
                while (false);
                this._storeFloat((_33_ + 316), (((this._loadFloat((_33_ + 260))) * 1.0E-30f) * 1.0E-30f));
                break label$0;
            }
            while (false);
            this._storeFloat((_33_ + 316), (this._loadFloat((_33_ + 304))));
        }
        while (false);
        _31_ = this._loadFloat((_33_ + 316));
        this._storeInt((0 + 4), (_33_ + 320));
        return _31_;
    }
}
