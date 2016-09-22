package sqlite3;

abstract class sqlite3$1
        extends sqlite3$0
{
    protected sqlite3$1(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final int __brk(int _30_)
    {
        int _31_ = 0;
        _30_ = this.__syscall1.invoke(45, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final double __cos(double _30_, double _31_)
    {
        int _32_ = 0;
        this._storeDouble(((_32_ = (this._loadInt((0 + 4))) - 48) + 40), _30_);
        this._storeDouble((_32_ + 32), _31_);
        _30_ = this._storeDouble(_32_, ((_31_ = this._storeDouble((_32_ + 16), ((_31_ = this._loadDouble((_32_ + 40))) * _31_))) * _31_));
        this._storeDouble((_32_ + 8), (((_31_ = this._loadDouble((_32_ + 16))) * ((_31_ * ((_31_ * 2.480158728947673E-5) + -0.001388888888887411)) + 0.0416666666666666)) + ((_30_ * _30_) * ((_31_ * ((_31_ * -1.1359647557788195E-11) + 2.087572321298175E-9)) + -2.7557314351390663E-7))));
        return ((_31_ = this._storeDouble(_32_, (1.0 - (this._storeDouble((_32_ + 24), ((this._loadDouble((_32_ + 16))) * 0.5)))))) + (((1.0 - _31_) - (this._loadDouble((_32_ + 24)))) + (((this._loadDouble((_32_ + 16))) * (this._loadDouble((_32_ + 8)))) - ((this._loadDouble((_32_ + 40))) * (this._loadDouble((_32_ + 32)))))));
    }

    @Override()
    public final float __cosdf(double _30_)
    {
        double _31_ = 0.0;
        double _32_ = 0.0;
        int _33_ = 0;
        this._storeDouble(((_33_ = (this._loadInt((0 + 4))) - 32) + 8), ((_30_ = this._storeDouble(_33_, ((_30_ = this._storeDouble((_33_ + 24), _30_)) * _30_))) * _30_));
        _30_ = this._storeDouble((_33_ + 16), (((this._loadDouble(_33_)) * 2.439044879627741E-5) + -0.001388676377460993));
        return ((float) (((((_31_ = this._loadDouble(_33_)) * -0.499999997251031) + 1.0) + ((_32_ = this._loadDouble((_33_ + 8))) * 0.04166662332373906)) + (_30_ * (_32_ * _31_))));
    }

    @Override()
    public final int __ctype_b_loc()
    {
        return 12;
    }

    @Override()
    public final int __ctype_tolower_loc()
    {
        return 784;
    }

    @Override()
    public final int __ctype_toupper_loc()
    {
        return 2336;
    }

    @Override()
    public final int stub_dlsym(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(_33_, (this._loadInt((_33_ + 8))));
        this.__dl_seterr.invoke(3888, _33_);
        this._storeInt((0 + 4), (_33_ + 16));
        return 0;
    }

    @Override()
    public final int __errno_location()
    {
        return ((__pthread_self()) + 40);
    }

    @Override()
    public final int __pthread_self()
    {
        return (this.pthread_self.invoke());
    }

    @Override()
    public final double __expo2(double _30_)
    {
        int _31_ = 0;
        double _32_ = 0.0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeLong((_31_ + 8), 9205357638345293824L);
        this._storeDouble((_31_ + 16), (this._loadDouble((_31_ + 8))));
        _32_ = exp(((this._loadDouble((_31_ + 24))) + -1416.0996898839683));
        _30_ = this._loadDouble((_31_ + 16));
        this._storeInt((0 + 4), (_31_ + 32));
        return (_30_ * (_32_ * _30_));
    }

    @Override()
    public final float __expo2f(float _30_)
    {
        int _31_ = 0;
        float _32_ = 0.0f;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt(_31_, 2046820352);
        this._storeFloat((_31_ + 8), (this._loadFloat(_31_)));
        _32_ = expf(((this._loadFloat((_31_ + 12))) + -162.88959f));
        _30_ = this._loadFloat((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return (_30_ * (_32_ * _30_));
    }

    @Override()
    public final int __fclose_ca(int _30_)
    {
        int _31_ = 0;
        _30_ = this._iiTable[this._tableIndices[this._loadInt(((_30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 12))]].invoke(_30_);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int __fmodeflags(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((strchr((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 43)) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 8), 2);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt8s((this._loadInt((_31_ + 12))))) != 114) {
                    break label$2;
                }
                this._storeInt((_31_ + 8), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 8), 1);
        }
        while (false);
        label$3:
        do {
            if ((strchr((this._loadInt((_31_ + 12))), 120)) == 0) {
                break label$3;
            }
            this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) | 128));
        }
        while (false);
        label$4:
        do {
            if ((strchr((this._loadInt((_31_ + 12))), 101)) == 0) {
                break label$4;
            }
            this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) | 524288));
        }
        while (false);
        label$5:
        do {
            if ((this._loadInt8s((this._loadInt((_31_ + 12))))) == 114) {
                break label$5;
            }
            this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) | 64));
        }
        while (false);
        label$6:
        do {
            if ((this._loadInt8s((this._loadInt((_31_ + 12))))) != 119) {
                break label$6;
            }
            this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) | 512));
        }
        while (false);
        label$7:
        do {
            if ((this._loadInt8s((this._loadInt((_31_ + 12))))) != 97) {
                break label$7;
            }
            this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) | 1024));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int __fpclassify(double _30_)
    {
        int _31_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeDouble(((_31_ = (this._loadInt((0 + 4))) - 32) + 8), (this._storeDouble((_31_ + 16), _30_)));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_31_ + 4), ((int) (((this._loadLong((_31_ + 8))) >>> 52L) & 2047L)))) == 0) {
                    break label$1;
                }
                if ((this._loadInt((_31_ + 4))) != 2047) {
                    break label$0;
                }
                this._storeInt((_31_ + 28), ((((this._loadLong((_31_ + 8))) << 12L) == 0) ? 1 : 0));
                return (this._loadInt((_31_ + 28)));
            }
            while (false);
            _temp$0 = 3;
            _temp$1 = 2;
            _temp$2 = (((this._loadLong((_31_ + 8))) << 1L) != 0L) ? _temp$0 : _temp$1;
            this._storeInt((_31_ + 28), _temp$2);
            return (this._loadInt((_31_ + 28)));
        }
        while (false);
        this._storeInt((_31_ + 28), 4);
        return (this._loadInt((_31_ + 28)));
    }

    @Override()
    public final int __fpclassifyf(float _30_)
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
                if ((this._storeInt((_31_ + 12), (((this._loadInt((_31_ + 16))) >>> 23) & 255))) == 0) {
                    break label$1;
                }
                if ((this._loadInt((_31_ + 12))) != 255) {
                    break label$0;
                }
                this._storeInt((_31_ + 28), ((((this._loadInt((_31_ + 16))) << 9) == 0) ? 1 : 0));
                return (this._loadInt((_31_ + 28)));
            }
            while (false);
            _temp$0 = 3;
            _temp$1 = 2;
            _temp$2 = (((this._loadInt((_31_ + 16))) << 1) != 0) ? _temp$0 : _temp$1;
            this._storeInt((_31_ + 28), _temp$2);
            return (this._loadInt((_31_ + 28)));
        }
        while (false);
        this._storeInt((_31_ + 28), 4);
        return (this._loadInt((_31_ + 28)));
    }

    @Override()
    public final int __fpclassifyl(long _30_, long _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        _33_ = __fpclassify((this.__trunctfdf2.invoke((this._storeLong((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))), _30_)), (this._storeLong((_32_ + 8), _31_)))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _33_;
    }

    @Override()
    public final int __init_tp(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt((_30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 4), (this._storeInt((_31_ + 8), _30_)))), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(_31_, (this.__set_thread_area.invoke((this._loadInt((_31_ + 8))))))) <= -1) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt(_31_)) != 0) {
                        break label$2;
                    }
                    this._storeInt((0 + 12940), 1);
                }
                while (false);
                _32_ = this.__syscall1.invoke(258, ((this._loadInt((_31_ + 4))) + 28));
                this._storeInt(((_30_ = this._loadInt((_31_ + 4))) + 156), 12980);
                this._storeInt((_30_ + 28), _32_);
                this._storeInt((_30_ + 136), (_30_ + 136));
                this._storeInt((_31_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 12), -1);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int __copy_tls(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 12), (this._storeInt((_32_ + 28), _30_)));
        this._storeInt((_32_ + 28), (((this._loadInt((_32_ + 28))) + (this._loadInt((0 + 12964)))) + -212));
        this._storeInt((_32_ + 28), ((_30_ = this._loadInt((_32_ + 28))) - (_30_ & ((this._loadInt((0 + 12968))) + -1))));
        this._storeInt((_32_ + 24), (this._loadInt((_32_ + 28))));
        _31_ = this._storeInt((_32_ + 16), 1);
        this._storeInt((_32_ + 20), (this._loadInt((0 + 12960))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 20))) == 0) {
                    break label$1;
                }
                this._storeInt(((this._loadInt((_32_ + 12))) + ((this._loadInt((_32_ + 16))) << 2)), ((this._loadInt((_32_ + 28))) - (this._loadInt(((this._loadInt((_32_ + 20))) + 20)))));
                memcpy((this._loadInt(((this._loadInt((_32_ + 12))) + ((this._loadInt((_32_ + 16))) << 2)))), (this._loadInt(((_30_ = this._loadInt((_32_ + 20))) + 4))), (this._loadInt((_30_ + 8))));
                this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + _31_));
                this._storeInt((_32_ + 20), (this._loadInt((this._loadInt((_32_ + 20))))));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((_30_ = this._loadInt((_32_ + 12))), (this._loadInt((0 + 12972))));
        this._storeInt(((this._loadInt((_32_ + 24))) + 208), _30_);
        this._storeInt(((this._loadInt((_32_ + 24))) + 4), _30_);
        _30_ = this._loadInt((_32_ + 24));
        this._storeInt((0 + 4), (_32_ + 32));
        return _30_;
    }

    @Override()
    public final void static_init_tls(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_31_ + 8), (this._storeInt((_31_ + 12), 0)));
        this._storeInt((_31_ + 24), (this._loadInt(((this._loadInt((_31_ + 28))) + 12))));
        this._storeInt((_31_ + 20), (this._loadInt(((this._loadInt((_31_ + 28))) + 20))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 20))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt((this._storeInt((_31_ + 16), (this._loadInt((_31_ + 24))))))) != 6) {
                        break label$2;
                    }
                    this._storeInt((_31_ + 8), ((this._loadInt(((this._loadInt((_31_ + 28))) + 12))) - (this._loadInt(((this._loadInt((_31_ + 16))) + 8)))));
                }
                while (false);
                label$3:
                do {
                    if ((this._loadInt((this._loadInt((_31_ + 16))))) != 7) {
                        break label$3;
                    }
                    this._storeInt((_31_ + 12), (this._loadInt((_31_ + 16))));
                }
                while (false);
                this._storeInt((_31_ + 20), ((this._loadInt((_31_ + 20))) + -1));
                this._storeInt((_31_ + 24), ((this._loadInt((_31_ + 24))) + (this._loadInt(((this._loadInt((_31_ + 28))) + 16)))));
                continue label$0;
            }
        }
        while (false);
        label$4:
        do {
            if ((this._loadInt((_31_ + 12))) == 0) {
                break label$4;
            }
            this._storeInt((0 + 3920), ((this._loadInt((_31_ + 8))) + (this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 8)))));
            this._storeInt((0 + 3924), (this._loadInt((_30_ + 16))));
            this._storeInt((0 + 3928), (this._loadInt(((this._loadInt((_31_ + 12))) + 20))));
            this._storeInt((0 + 3932), (this._loadInt(((this._loadInt((_31_ + 12))) + 28))));
            this._storeInt((0 + 12972), 1);
            this._storeInt((0 + 12960), 3916);
        }
        while (false);
        this._storeInt((0 + 3928), ((_30_ = this._loadInt((0 + 3928))) + (((0 - _30_) - (this._loadInt((0 + 3920)))) & ((_30_ = this._loadInt((0 + 3932))) + -1))));
        label$5:
        do {
            if ((_30_ & 4294967295L) > (3 & 4294967295L)) {
                break label$5;
            }
            this._storeInt((0 + 3932), 4);
        }
        while (false);
        label$6:
        do {
            label$7:
            do {
                if (((this._storeInt((0 + 12964), ((((this._storeInt((0 + 3936), (this._loadInt((0 + 3928))))) + (this._storeInt((0 + 12968), (this._loadInt((0 + 3932)))))) + 223) & -4))) & 4294967295L) < (281 & 4294967295L)) {
                    break label$7;
                }
                this._storeInt((_31_ + 4), (this.__syscall6.invoke(192, 0, (this._loadInt((0 + 12964))), 3, 34, -1, 0)));
                break label$6;
            }
            while (false);
            this._storeInt((_31_ + 4), 3940);
        }
        while (false);
        label$8:
        do {
            if ((__init_tp((__copy_tls((this._loadInt((_31_ + 4))))))) <= -1) {
                break label$8;
            }
            this._storeInt((0 + 4), (_31_ + 32));
            return;
        }
        while (false);
        this.abort.invoke();
        throw (new UnreachableException());
    }

    @Override()
    public final int __overflow(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt8((_32_ + 3), (this._storeInt((_32_ + 4), _31_)));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_32_ + 8))) + 16))) != 0) {
                    break label$1;
                }
                if ((__towrite((this._loadInt((_32_ + 8))))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 12), -1);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt(((_31_ = this._loadInt((_32_ + 8))) + 20))) & 4294967295L) >= ((this._loadInt((_31_ + 16))) & 4294967295L)) {
                    break label$2;
                }
                if ((this._loadInt8u((_32_ + 3))) == (this._loadInt8s(((this._loadInt((_32_ + 8))) + 75)))) {
                    break label$2;
                }
                this._storeInt(((_31_ = this._loadInt((_32_ + 8))) + 20), ((_31_ = this._loadInt((_31_ + 20))) + 1));
                this._storeInt((_32_ + 12), (this._storeInt8(_31_, (this._loadInt8u((_32_ + 3))))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._iiiiTable[this._tableIndices[this._loadInt(((_31_ = this._loadInt((_32_ + 8))) + 36))]].invoke(_31_, (_32_ + 3), 1)) == 1) {
                    break label$3;
                }
                this._storeInt((_32_ + 12), -1);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), (this._loadInt8u((_32_ + 3))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final long __rand48_step(int _30_, int _31_)
    {
        long _32_ = 0L;
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 32) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeLong((_33_ + 8), ((((this._loadInt16u((_31_ = this._loadInt((_33_ + 28))))) | ((this._loadInt16u((_31_ + 2))) << 16)) & 4294967295L) | ((this._loadLong16u((_31_ + 4))) << 32L)));
        _32_ = this._storeLong((_33_ + 8), (((this._storeLong((_33_ + 16), ((((this._loadInt16u((_31_ = this._loadInt((_33_ + 24))))) | ((this._loadInt16u((_31_ + 2))) << 16)) & 4294967295L) | ((this._loadLong16u((_31_ + 4))) << 32L)))) * (this._loadLong((_33_ + 8)))) + (this._loadLong16u(((this._loadInt((_33_ + 24))) + 6)))));
        this._storeLong16(((_31_ = this._loadInt((_33_ + 28))) + 2), ((this._storeLong16(_31_, _32_)) >>> 16L));
        this._storeLong16((_31_ + 4), (this._loadLong32u((_33_ + 12))));
        return ((this._loadLong((_33_ + 8))) & 281474976710655L);
    }

    @Override()
    public final int __rem_pio2(double _30_, int _31_)
    {
        int _32_ = 0;
        this._storeDouble(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 144))) + 128), _30_);
        this._storeInt((_32_ + 124), _31_);
        this._storeDouble((_32_ + 112), (this._loadDouble((_32_ + 128))));
        this._storeLong32((_32_ + 24), ((this._loadLong((_32_ + 112))) >>> 63L));
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
                                                        if (((this._storeInt((_32_ + 28), ((int) ((this._loadLong32u((_32_ + 116))) & 2147483647L)))) & 4294967295L) > (1074752122 & 4294967295L)) {
                                                            break label$11;
                                                        }
                                                        if (((this._loadInt((_32_ + 28))) & 1048575) == 598523) {
                                                            break label$8;
                                                        }
                                                        if (((this._loadInt((_32_ + 28))) & 4294967295L) > (1073928572 & 4294967295L)) {
                                                            break label$10;
                                                        }
                                                        if ((this._loadInt((_32_ + 24))) == 0) {
                                                            break label$5;
                                                        }
                                                        _30_ = this._storeDouble((_32_ + 104), ((this._loadDouble((_32_ + 128))) + 1.5707963267341256));
                                                        _30_ = this._storeDouble((_31_ = this._loadInt((_32_ + 124))), (_30_ + 6.077100506506192E-11));
                                                        this._storeDouble((_31_ + 8), (((this._loadDouble((_32_ + 104))) - _30_) + 6.077100506506192E-11));
                                                        this._storeInt((_32_ + 140), -1);
                                                        break label$0;
                                                    }
                                                    while (false);
                                                    label$12:
                                                    do {
                                                        if (((this._loadInt((_32_ + 28))) & 4294967295L) > (1075594811 & 4294967295L)) {
                                                            break label$12;
                                                        }
                                                        if (((this._loadInt((_32_ + 28))) & 4294967295L) > (1075183036 & 4294967295L)) {
                                                            break label$9;
                                                        }
                                                        if ((this._loadInt((_32_ + 28))) == 1074977148) {
                                                            break label$8;
                                                        }
                                                        if ((this._loadInt((_32_ + 24))) == 0) {
                                                            break label$3;
                                                        }
                                                        _30_ = this._storeDouble((_32_ + 104), ((this._loadDouble((_32_ + 128))) + 4.712388980202377));
                                                        _30_ = this._storeDouble((_31_ = this._loadInt((_32_ + 124))), (_30_ + 1.8231301519518578E-10));
                                                        this._storeDouble((_31_ + 8), (((this._loadDouble((_32_ + 104))) - _30_) + 1.8231301519518578E-10));
                                                        this._storeInt((_32_ + 140), -3);
                                                        break label$0;
                                                    }
                                                    while (false);
                                                    if (((this._loadInt((_32_ + 28))) & 4294967295L) <= (1094263290 & 4294967295L)) {
                                                        break label$8;
                                                    }
                                                    if (((this._loadInt((_32_ + 28))) & 4294967295L) < (2146435072 & 4294967295L)) {
                                                        break label$7;
                                                    }
                                                    this._storeDouble((_31_ = this._loadInt((_32_ + 124))), (this._storeDouble((_31_ + 8), ((_30_ = this._loadDouble((_32_ + 128))) - _30_))));
                                                    this._storeInt((_32_ + 140), 0);
                                                    break label$0;
                                                }
                                                while (false);
                                                if ((this._loadInt((_32_ + 24))) == 0) {
                                                    break label$4;
                                                }
                                                _30_ = this._storeDouble((_32_ + 104), ((this._loadDouble((_32_ + 128))) + 3.1415926534682512));
                                                _30_ = this._storeDouble((_31_ = this._loadInt((_32_ + 124))), (_30_ + 1.2154201013012384E-10));
                                                this._storeDouble((_31_ + 8), (((this._loadDouble((_32_ + 104))) - _30_) + 1.2154201013012384E-10));
                                                this._storeInt((_32_ + 140), -2);
                                                break label$0;
                                            }
                                            while (false);
                                            if ((this._loadInt((_32_ + 28))) != 1075388923) {
                                                break label$6;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_32_ + 20), (_truncateDoubleToSignedInteger((this._storeDouble((_32_ + 72), ((((this._loadDouble((_32_ + 128))) * 0.6366197723675814) + 6.755399441055744E15) - 6.755399441055744E15))))));
                                        this._storeDouble((_32_ + 80), ((this._loadDouble((_32_ + 128))) + ((this._loadDouble((_32_ + 72))) * -1.5707963267341256)));
                                        _30_ = this._storeDouble((_32_ + 96), ((this._loadDouble((_32_ + 72))) * 6.077100506506192E-11));
                                        this._storeDouble((_32_ + 112), (this._storeDouble((this._loadInt((_32_ + 124))), ((this._loadDouble((_32_ + 80))) - _30_))));
                                        this._storeLong32((_32_ + 12), (((this._loadLong((_32_ + 112))) >>> 52L) & 2047L));
                                        label$13:
                                        do {
                                            if (((this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 28))) >>> 20))) - (this._loadInt((_32_ + 12)))) < 17) {
                                                break label$13;
                                            }
                                            this._storeDouble((_32_ + 88), (this._loadDouble((_32_ + 80))));
                                            _30_ = this._storeDouble((_32_ + 96), ((this._loadDouble((_32_ + 72))) * 6.077100506303966E-11));
                                            _30_ = this._storeDouble((_32_ + 80), ((this._loadDouble((_32_ + 88))) - _30_));
                                            _30_ = this._storeDouble((_32_ + 96), (((this._loadDouble((_32_ + 72))) * 2.0222662487959506E-21) - (((this._loadDouble((_32_ + 88))) - _30_) - (this._loadDouble((_32_ + 96))))));
                                            this._storeDouble((_32_ + 112), (this._storeDouble((this._loadInt((_32_ + 124))), ((this._loadDouble((_32_ + 80))) - _30_))));
                                            _31_ = this._storeInt((_32_ + 12), ((int) (((this._loadLong((_32_ + 112))) >>> 52L) & 2047L)));
                                            if (((this._loadInt((_32_ + 16))) - _31_) < 50) {
                                                break label$13;
                                            }
                                            this._storeDouble((_32_ + 88), (this._loadDouble((_32_ + 80))));
                                            _30_ = this._storeDouble((_32_ + 96), ((this._loadDouble((_32_ + 72))) * 2.0222662487111665E-21));
                                            _30_ = this._storeDouble((_32_ + 80), ((this._loadDouble((_32_ + 88))) - _30_));
                                            _30_ = this._storeDouble((_32_ + 96), (((this._loadDouble((_32_ + 72))) * 8.4784276603689E-32) - (((this._loadDouble((_32_ + 88))) - _30_) - (this._loadDouble((_32_ + 96))))));
                                            this._storeDouble((this._loadInt((_32_ + 124))), ((this._loadDouble((_32_ + 80))) - _30_));
                                        }
                                        while (false);
                                        this._storeDouble(((_31_ = this._loadInt((_32_ + 124))) + 8), (((this._loadDouble((_32_ + 80))) - (this._loadDouble(_31_))) - (this._loadDouble((_32_ + 96)))));
                                        this._storeInt((_32_ + 140), (this._loadInt((_32_ + 20))));
                                        break label$0;
                                    }
                                    while (false);
                                    this._storeDouble((_32_ + 112), (this._loadDouble((_32_ + 128))));
                                    this._storeLong((_32_ + 112), ((this._storeLong((_32_ + 112), ((this._loadLong((_32_ + 112))) & 4503599627370495L))) | 4710765210229538816L));
                                    this._storeDouble((_32_ + 104), (this._loadDouble((_32_ + 112))));
                                    this._storeInt((_32_ + 8), 0);
                                    label$15:
                                    do {
                                        label$14:
                                        while (true) {
                                            if ((this._loadInt((_32_ + 8))) > 1) {
                                                break label$15;
                                            }
                                            this._storeDouble((_32_ + 104), (((_30_ = this._loadDouble((_32_ + 104))) - (this._storeDouble(((_32_ + 48) + ((this._loadInt((_32_ + 8))) << 3)), ((double) (_truncateDoubleToSignedInteger(_30_)))))) * 1.6777216E7));
                                            this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) + 1));
                                            continue label$14;
                                        }
                                    }
                                    while (false);
                                    this._storeDouble(((_32_ + 48) + ((this._loadInt((_32_ + 8))) << 3)), (this._loadDouble((_32_ + 104))));
                                    label$17:
                                    do {
                                        label$16:
                                        while (true) {
                                            if ((this._loadDouble(((_32_ + 48) + ((this._loadInt((_32_ + 8))) << 3)))) != 0.0) {
                                                break label$17;
                                            }
                                            this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) + -1));
                                            continue label$16;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_32_ + 20), (this.__rem_pio2_large.invoke((_32_ + 48), (_32_ + 32), (((this._loadInt((_32_ + 28))) >>> 20) + -1046), ((this._loadInt((_32_ + 8))) + 1), 1)));
                                    if ((this._loadInt((_32_ + 24))) == 0) {
                                        break label$2;
                                    }
                                    this._storeDouble((_31_ = this._loadInt((_32_ + 124))), (-(this._loadDouble((_32_ + 32)))));
                                    this._storeDouble((_31_ + 8), (-(this._loadDouble((_32_ + 40)))));
                                    this._storeInt((_32_ + 140), (0 - (this._loadInt((_32_ + 20)))));
                                    break label$0;
                                }
                                while (false);
                                if ((this._loadInt((_32_ + 24))) == 0) {
                                    break label$1;
                                }
                                _30_ = this._storeDouble((_32_ + 104), ((this._loadDouble((_32_ + 128))) + 6.2831853069365025));
                                _30_ = this._storeDouble((_31_ = this._loadInt((_32_ + 124))), (_30_ + 2.430840202602477E-10));
                                this._storeDouble((_31_ + 8), (((this._loadDouble((_32_ + 104))) - _30_) + 2.430840202602477E-10));
                                this._storeInt((_32_ + 140), -4);
                                break label$0;
                            }
                            while (false);
                            _30_ = this._storeDouble((_32_ + 104), ((this._loadDouble((_32_ + 128))) + -1.5707963267341256));
                            _30_ = this._storeDouble((_31_ = this._loadInt((_32_ + 124))), (_30_ - 6.077100506506192E-11));
                            this._storeDouble((_31_ + 8), (((this._loadDouble((_32_ + 104))) - _30_) - 6.077100506506192E-11));
                            this._storeInt((_32_ + 140), 1);
                            break label$0;
                        }
                        while (false);
                        _30_ = this._storeDouble((_32_ + 104), ((this._loadDouble((_32_ + 128))) + -3.1415926534682512));
                        _30_ = this._storeDouble((_31_ = this._loadInt((_32_ + 124))), (_30_ - 1.2154201013012384E-10));
                        this._storeDouble((_31_ + 8), (((this._loadDouble((_32_ + 104))) - _30_) - 1.2154201013012384E-10));
                        this._storeInt((_32_ + 140), 2);
                        break label$0;
                    }
                    while (false);
                    _30_ = this._storeDouble((_32_ + 104), ((this._loadDouble((_32_ + 128))) + -4.712388980202377));
                    _30_ = this._storeDouble((_31_ = this._loadInt((_32_ + 124))), (_30_ - 1.8231301519518578E-10));
                    this._storeDouble((_31_ + 8), (((this._loadDouble((_32_ + 104))) - _30_) - 1.8231301519518578E-10));
                    this._storeInt((_32_ + 140), 3);
                    break label$0;
                }
                while (false);
                this._storeDouble((_31_ = this._loadInt((_32_ + 124))), (this._loadDouble((_32_ + 32))));
                this._storeDouble((_31_ + 8), (this._loadDouble((_32_ + 40))));
                this._storeInt((_32_ + 140), (this._loadInt((_32_ + 20))));
                break label$0;
            }
            while (false);
            _30_ = this._storeDouble((_32_ + 104), ((this._loadDouble((_32_ + 128))) + -6.2831853069365025));
            _30_ = this._storeDouble((_31_ = this._loadInt((_32_ + 124))), (_30_ - 2.430840202602477E-10));
            this._storeDouble((_31_ + 8), (((this._loadDouble((_32_ + 104))) - _30_) - 2.430840202602477E-10));
            this._storeInt((_32_ + 140), 4);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 140));
        this._storeInt((0 + 4), (_32_ + 144));
        return _31_;
    }

    @Override()
    public final int __rem_pio2f(float _30_, int _31_)
    {
        int _32_ = 0;
        double _33_ = 0.0;
        this._storeFloat(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_32_ + 52), _31_);
        this._storeFloat((_32_ + 48), (this._loadFloat((_32_ + 56))));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 48))) & 2147483647))) & 4294967295L) > (1305022426 & 4294967295L)) {
                    break label$1;
                }
                _31_ = this._storeInt((_32_ + 16), (_truncateDoubleToSignedInteger((this._storeDouble((_32_ + 24), (((((double) (this._loadFloat((_32_ + 56)))) * 0.6366197723675814) + 6.755399441055744E15) - 6.755399441055744E15))))));
                this._storeDouble((this._loadInt((_32_ + 52))), ((((double) (this._loadFloat((_32_ + 56)))) + ((_33_ = this._loadDouble((_32_ + 24))) * -1.5707963109016418)) + (_33_ * -1.5893254773528196E-8)));
                this._storeInt((_32_ + 60), _31_);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_32_ + 20))) & 4294967295L) < (2139095040 & 4294967295L)) {
                    break label$2;
                }
                this._storeDouble((this._loadInt((_32_ + 52))), ((double) ((_30_ = this._loadFloat((_32_ + 56))) - _30_)));
                this._storeInt((_32_ + 60), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 48))) >>> 31));
            _31_ = this._storeInt((_32_ + 8), (((this._loadInt((_32_ + 20))) >>> 23) + -150));
            this._storeInt((_32_ + 48), ((this._loadInt((_32_ + 20))) - (_31_ << 23)));
            this._storeDouble((_32_ + 40), ((double) (this._loadFloat((_32_ + 48)))));
            this._storeInt((_32_ + 16), (this.__rem_pio2_large.invoke((_32_ + 40), (_32_ + 32), (this._loadInt((_32_ + 8))), 1, 0)));
            label$3:
            do {
                if ((this._loadInt((_32_ + 12))) == 0) {
                    break label$3;
                }
                this._storeDouble((this._loadInt((_32_ + 52))), (-(this._loadDouble((_32_ + 32)))));
                this._storeInt((_32_ + 60), (0 - (this._loadInt((_32_ + 16)))));
                break label$0;
            }
            while (false);
            this._storeDouble((this._loadInt((_32_ + 52))), (this._loadDouble((_32_ + 32))));
            this._storeInt((_32_ + 60), (this._loadInt((_32_ + 16))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 60));
        this._storeInt((0 + 4), (_32_ + 64));
        return _31_;
    }

    @Override()
    public final void __reset_tls()
    {
        int _30_ = 0;
        int _31_ = 0;
        int _32_ = 0;
        int _33_ = 0;
        label$0:
        do {
            if ((this._storeInt((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))), (this._loadInt((this._loadInt(((this._storeInt((_31_ + 12), (__pthread_self$2e$5()))) + 4))))))) == 0) {
                break label$0;
            }
            this._storeInt((_31_ + 8), (this._loadInt((0 + 12960))));
            _30_ = this._storeInt((_31_ + 4), 1);
            label$2:
            do {
                label$1:
                while (true) {
                    if (((this._loadInt((_31_ + 4))) & 4294967295L) > ((this._loadInt(_31_)) & 4294967295L)) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._loadInt(((this._loadInt(((this._loadInt((_31_ + 12))) + 4))) + ((this._loadInt((_31_ + 4))) << 2)))) == 0) {
                            break label$3;
                        }
                        memcpy((this._loadInt(((this._loadInt(((this._loadInt((_31_ + 12))) + 4))) + ((this._loadInt((_31_ + 4))) << 2)))), (this._loadInt(((_32_ = this._loadInt((_31_ + 8))) + 4))), (this._loadInt((_32_ + 8))));
                        memset(((this._loadInt(((this._loadInt(((this._loadInt((_31_ + 12))) + 4))) + ((this._loadInt((_31_ + 4))) << 2)))) + (_33_ = this._loadInt(((_32_ = this._loadInt((_31_ + 8))) + 8)))), 0, ((this._loadInt((_32_ + 12))) - _33_));
                    }
                    while (false);
                    this._storeInt((_31_ + 4), ((this._loadInt((_31_ + 4))) + _30_));
                    this._storeInt((_31_ + 8), (this._loadInt((this._loadInt((_31_ + 8))))));
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
    public final int __pthread_self$2e$5()
    {
        return (this.pthread_self.invoke());
    }

    @Override()
    public final int __signbit(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return ((int) ((this._loadLong(_31_)) >>> 63L));
    }

    @Override()
    public final int __signbitf(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return ((this._loadInt((_31_ + 8))) >>> 31);
    }

    @Override()
    public final int __signbitl(long _30_, long _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        _33_ = __signbit((this.__trunctfdf2.invoke((this._storeLong((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))), _30_)), (this._storeLong((_32_ + 8), _31_)))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _33_;
    }

    @Override()
    public final double __sin(double _30_, double _31_, int _32_)
    {
        int _33_ = 0;
        this._storeDouble(((_33_ = (this._loadInt((0 + 4))) - 64) + 48), _30_);
        this._storeDouble((_33_ + 40), _31_);
        this._storeInt((_33_ + 36), _32_);
        _30_ = this._storeDouble(_33_, ((_31_ = this._storeDouble((_33_ + 24), ((_31_ = this._loadDouble((_33_ + 48))) * _31_))) * _31_));
        this._storeDouble((_33_ + 16), ((((_31_ = this._loadDouble((_33_ + 24))) * ((_31_ * 2.7557313707070068E-6) + -1.984126982985795E-4)) + 0.00833333333332249) + ((_31_ * _30_) * ((_31_ * 1.58969099521155E-10) + -2.5050760253406863E-8))));
        this._storeDouble((_33_ + 8), ((this._loadDouble((_33_ + 24))) * (this._loadDouble((_33_ + 48)))));
        label$0:
        do {
            if ((this._loadInt((_33_ + 36))) == 0) {
                break label$0;
            }
            this._storeDouble((_33_ + 56), ((this._loadDouble((_33_ + 48))) - ((((this._loadDouble((_33_ + 24))) * (((_31_ = this._loadDouble((_33_ + 40))) * 0.5) - ((_30_ = this._loadDouble((_33_ + 8))) * (this._loadDouble((_33_ + 16)))))) - _31_) + (_30_ * 0.16666666666666632))));
            return (this._loadDouble((_33_ + 56)));
        }
        while (false);
        this._storeDouble((_33_ + 56), ((this._loadDouble((_33_ + 48))) + ((this._loadDouble((_33_ + 8))) * (((this._loadDouble((_33_ + 24))) * (this._loadDouble((_33_ + 16)))) + -0.16666666666666632))));
        return (this._loadDouble((_33_ + 56)));
    }

    @Override()
    public final float __sindf(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = (this._loadInt((0 + 4))) - 48) + 16), ((_30_ = this._storeDouble((_31_ + 8), ((_30_ = this._storeDouble((_31_ + 40), _30_)) * _30_))) * _30_));
        this._storeDouble((_31_ + 32), (((this._loadDouble((_31_ + 8))) * 2.718311493989822E-6) + -1.9839334836096632E-4));
        _30_ = this._storeDouble((_31_ + 24), ((this._loadDouble((_31_ + 8))) * (this._loadDouble((_31_ + 40)))));
        return ((float) (((this._loadDouble((_31_ + 40))) + (_30_ * (((this._loadDouble((_31_ + 8))) * 0.008333329385889463) + -0.16666666641626524))) + ((_30_ * (this._loadDouble((_31_ + 16)))) * (this._loadDouble((_31_ + 32))))));
    }

    @Override()
    public final void __init_ssp(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) == 0) {
                    break label$1;
                }
                memcpy(4236, (this._loadInt((_31_ + 12))), 4);
                break label$0;
            }
            while (false);
            this._storeInt((0 + 4236), (4236 * 1103515245));
        }
        while (false);
        _30_ = this._loadInt((0 + 4236));
        this._storeInt(((__pthread_self$2e$6()) + 20), _30_);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int __pthread_self$2e$6()
    {
        return (this.pthread_self.invoke());
    }

    @Override()
    public final void __stack_chk_fail()
    {
        this.abort.invoke();
        throw (new UnreachableException());
    }

    @Override()
    public final int __stdio_close(int _30_)
    {
        int _31_ = 0;
        _30_ = __syscall_ret((this.__syscall1.invoke(6, (dummy((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 60))))))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int dummy(int _30_)
    {
        return (this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_));
    }

    @Override()
    public final void __stdio_exit()
    {
        int _30_ = 0;
        this._storeInt(((_30_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), (this._loadInt((__ofl_lock()))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_30_ + 12))) == 0) {
                    break label$1;
                }
                close_file((this._loadInt((_30_ + 12))));
                this._storeInt((_30_ + 12), (this._loadInt(((this._loadInt((_30_ + 12))) + 56))));
                continue label$0;
            }
        }
        while (false);
        close_file((this._loadInt((0 + 16112))));
        close_file((this._loadInt((0 + 17296))));
        this._storeInt((0 + 4), (_30_ + 16));
        return;
    }

    @Override()
    public final void close_file(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 12))) + 76))) < 0) {
                    break label$1;
                }
                this.__lockfile.invoke((this._loadInt((_31_ + 12))));
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 20))) & 4294967295L) <= ((this._loadInt((_30_ + 28))) & 4294967295L)) {
                    break label$2;
                }
                this._iiiiTable[this._tableIndices[this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 36))]].invoke(_30_, 0, 0);
            }
            while (false);
            if (((this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 4))) & 4294967295L) >= ((this._loadInt((_30_ + 8))) & 4294967295L)) {
                break label$0;
            }
            this._liliTable[this._tableIndices[this._loadInt(((_30_ = this._loadInt((_31_ + 12))) + 40))]].invoke(_30_, ((long) ((this._loadInt((_30_ + 4))) - (this._loadInt((_30_ + 8))))), 1);
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int __stdio_read(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_33_ + 36), _31_);
        this._storeInt((_33_ + 32), _32_);
        this._storeInt((_33_ + 16), (this._loadInt((_33_ + 36))));
        this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 32))) - (((this._loadInt(((_32_ = this._loadInt((_33_ + 40))) + 48))) != 0) ? 1 : 0)));
        this._storeInt((_33_ + 24), (this._loadInt((_32_ + 44))));
        this._storeInt((_33_ + 28), (this._loadInt(((this._loadInt((_33_ + 40))) + 48))));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_33_ + 12), (__syscall_ret((this.__syscall3.invoke(145, (this._loadInt(((this._loadInt((_33_ + 40))) + 60))), (_33_ + 16), 2)))))) > 0) {
                    break label$1;
                }
                this._storeInt((_32_ = this._loadInt((_33_ + 40))), ((this._loadInt(_32_)) | (((_32_ = this._loadInt((_33_ + 12))) & 48) ^ 16)));
                this._storeInt((_33_ + 44), _32_);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_33_ + 12))) & 4294967295L) > ((this._loadInt((_33_ + 20))) & 4294967295L)) {
                    break label$2;
                }
                this._storeInt((_33_ + 44), (this._loadInt((_33_ + 12))));
                break label$0;
            }
            while (false);
            _31_ = this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) - (this._loadInt((_33_ + 20)))));
            this._storeInt(((_32_ = this._loadInt((_33_ + 40))) + 4), (this._loadInt((_32_ + 44))));
            this._storeInt((_32_ + 8), (_31_ + (this._loadInt((_32_ + 44)))));
            label$3:
            do {
                if ((this._loadInt(((this._loadInt((_33_ + 40))) + 48))) == 0) {
                    break label$3;
                }
                this._storeInt(((_32_ = this._loadInt((_33_ + 40))) + 4), ((_32_ = this._loadInt((_32_ + 4))) + 1));
                this._storeInt8((((this._loadInt((_33_ + 36))) + (this._loadInt((_33_ + 32)))) + -1), (this._loadInt8u(_32_)));
            }
            while (false);
            this._storeInt((_33_ + 44), (this._loadInt((_33_ + 32))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 44));
        this._storeInt((0 + 4), (_33_ + 48));
        return _32_;
    }

    @Override()
    public final long __stdio_seek(int _30_, long _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeLong((_33_ + 16), _31_);
        this._storeInt((_33_ + 12), _32_);
        label$0:
        do {
            if ((__syscall_ret((this.__syscall5.invoke(140, (this._loadInt(((this._loadInt((_33_ + 28))) + 60))), ((int) ((_31_ = this._loadLong((_33_ + 16))) >>> 32L)), ((int) _31_), _33_, _32_)))) > -1) {
                break label$0;
            }
            this._storeLong(_33_, -1L);
        }
        while (false);
        _31_ = this._loadLong(_33_);
        this._storeInt((0 + 4), (_33_ + 32));
        return _31_;
    }

    @Override()
    public final int __string_read(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 16), (this._loadInt(((this._loadInt((_33_ + 28))) + 84))));
        _32_ = this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 20))) + 256));
        label$0:
        do {
            if ((this._storeInt((_33_ + 8), (memchr((this._loadInt((_33_ + 16))), 0, _32_)))) == 0) {
                break label$0;
            }
            this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 8))) - (this._loadInt((_33_ + 16)))));
        }
        while (false);
        label$1:
        do {
            if (((this._loadInt((_33_ + 12))) & 4294967295L) >= ((this._loadInt((_33_ + 20))) & 4294967295L)) {
                break label$1;
            }
            this._storeInt((_33_ + 20), (this._loadInt((_33_ + 12))));
        }
        while (false);
        memcpy((this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 20))));
        this._storeInt(((_32_ = this._loadInt((_33_ + 28))) + 8), ((_31_ = this._loadInt((_33_ + 16))) + (this._loadInt((_33_ + 12)))));
        this._storeInt((_32_ + 4), (_31_ + (this._loadInt((_33_ + 20)))));
        this._storeInt(((this._loadInt((_33_ + 28))) + 84), ((this._loadInt((_33_ + 16))) + (this._loadInt((_33_ + 12)))));
        _32_ = this._loadInt((_33_ + 20));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final double __tan(double _30_, double _31_, int _32_)
    {
        int _33_ = 0;
        this._storeDouble(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 144))) + 128), _30_);
        this._storeDouble((_33_ + 120), _31_);
        this._storeInt((_33_ + 116), _32_);
        this._storeDouble((_33_ + 24), (this._loadDouble((_33_ + 128))));
        this._storeLong32((_33_ + 44), (this._loadLong32u((_33_ + 28))));
        this._storeInt((_33_ + 40), ((((_32_ = (this._loadInt((_33_ + 44))) & 2147483647) & 4294967295L) > (1072010279 & 4294967295L)) ? 1 : 0));
        label$0:
        do {
            if ((_32_ & 4294967295L) < (1072010280 & 4294967295L)) {
                break label$0;
            }
            label$1:
            do {
                if ((this._storeInt((_33_ + 36), ((this._loadInt((_33_ + 44))) >>> 31))) == 0) {
                    break label$1;
                }
                this._storeDouble((_33_ + 128), (-(this._loadDouble((_33_ + 128)))));
                this._storeDouble((_33_ + 120), (-(this._loadDouble((_33_ + 120)))));
            }
            while (false);
            this._storeDouble((_33_ + 128), ((0.7853981633974483 - (this._loadDouble((_33_ + 128)))) + (3.061616997868383E-17 - (this._loadDouble((_33_ + 120))))));
            this._storeLong((_33_ + 120), 0L);
        }
        while (false);
        this._storeDouble((_33_ + 96), ((this._loadDouble((0 + 4264))) + ((_31_ = this._storeDouble((_33_ + 80), ((_31_ = this._storeDouble((_33_ + 104), ((_31_ = this._loadDouble((_33_ + 128))) * _31_))) * _31_))) * ((this._loadDouble((0 + 4280))) + (_31_ * ((this._loadDouble((0 + 4296))) + (_31_ * ((this._loadDouble((0 + 4312))) + (_31_ * ((this._loadDouble((0 + 4328))) + (_31_ * (this._loadDouble((0 + 4344))))))))))))));
        this._storeDouble((_33_ + 88), ((this._loadDouble((_33_ + 104))) * ((this._loadDouble((0 + 4272))) + ((_31_ = this._loadDouble((_33_ + 80))) * ((this._loadDouble((0 + 4288))) + (_31_ * ((this._loadDouble((0 + 4304))) + (_31_ * ((this._loadDouble((0 + 4320))) + (_31_ * ((this._loadDouble((0 + 4336))) + (_31_ * (this._loadDouble((0 + 4352)))))))))))))));
        _31_ = this._storeDouble((_33_ + 72), ((this._loadDouble((_33_ + 104))) * (this._loadDouble((_33_ + 128)))));
        this._storeDouble((_33_ + 80), ((this._storeDouble((_33_ + 96), (((_30_ = this._loadDouble((_33_ + 120))) + ((this._loadDouble((_33_ + 104))) * (_30_ + (_31_ * ((this._loadDouble((_33_ + 96))) + (this._loadDouble((_33_ + 88)))))))) + (_31_ * (this._loadDouble((0 + 4256))))))) + (this._loadDouble((_33_ + 128)))));
        label$2:
        do {
            label$3:
            do {
                label$4:
                do {
                    label$5:
                    do {
                        if ((this._loadInt((_33_ + 40))) == 0) {
                            break label$5;
                        }
                        this._storeDouble((_33_ + 88), ((_30_ = this._storeDouble((_33_ + 72), ((double) (1 - ((this._loadInt((_33_ + 116))) << 1))))) + (((this._loadDouble((_33_ + 128))) + ((this._loadDouble((_33_ + 96))) - (((_31_ = this._loadDouble((_33_ + 80))) * _31_) / (_31_ + _30_)))) * -2.0)));
                        if ((this._loadInt((_33_ + 36))) == 0) {
                            break label$4;
                        }
                        this._storeDouble((_33_ + 136), (-(this._loadDouble((_33_ + 88)))));
                        break label$2;
                    }
                    while (false);
                    if ((this._loadInt((_33_ + 116))) == 0) {
                        break label$3;
                    }
                    this._storeDouble((_33_ + 56), (this._loadDouble((_33_ + 80))));
                    this._storeDouble((_33_ + 16), (this._loadDouble((_33_ + 56))));
                    this._storeLong((_33_ + 16), ((this._loadLong((_33_ + 16))) & -4294967296L));
                    this._storeDouble((_33_ + 56), (this._loadDouble((_33_ + 16))));
                    this._storeDouble((_33_ + 88), ((this._loadDouble((_33_ + 96))) - ((this._loadDouble((_33_ + 56))) - (this._loadDouble((_33_ + 128))))));
                    this._storeDouble((_33_ + 48), (this._storeDouble((_33_ + 64), (-1.0 / (this._loadDouble((_33_ + 80)))))));
                    this._storeDouble((_33_ + 8), (this._loadDouble((_33_ + 48))));
                    this._storeLong((_33_ + 8), ((this._loadLong((_33_ + 8))) & -4294967296L));
                    this._storeDouble((_33_ + 48), (this._loadDouble((_33_ + 8))));
                    this._storeDouble((_33_ + 136), ((_31_ = this._loadDouble((_33_ + 48))) + ((this._loadDouble((_33_ + 64))) * (((_31_ * (this._loadDouble((_33_ + 56)))) + 1.0) + (_31_ * (this._loadDouble((_33_ + 88))))))));
                    break label$2;
                }
                while (false);
                this._storeDouble((_33_ + 136), (this._loadDouble((_33_ + 88))));
                break label$2;
            }
            while (false);
            this._storeDouble((_33_ + 136), (this._loadDouble((_33_ + 80))));
        }
        while (false);
        _31_ = this._loadDouble((_33_ + 136));
        this._storeInt((0 + 4), (_33_ + 144));
        return _31_;
    }

    @Override()
    public final float __tandf(double _30_, int _31_)
    {
        double _32_ = 0.0;
        int _33_ = 0;
        this._storeDouble(((_33_ = (this._loadInt((0 + 4))) - 64) + 56), _30_);
        this._storeInt((_33_ + 52), _31_);
        this._storeDouble((_33_ + 32), ((this._loadDouble((0 + 4400))) + ((this._storeDouble((_33_ + 40), ((_30_ = this._loadDouble((_33_ + 56))) * _30_))) * (this._loadDouble((0 + 4408))))));
        this._storeDouble((_33_ + 8), ((this._loadDouble((0 + 4384))) + ((this._loadDouble((_33_ + 40))) * (this._loadDouble((0 + 4392))))));
        this._storeDouble((_33_ + 24), ((_30_ = this._loadDouble((_33_ + 40))) * _30_));
        this._storeDouble((_33_ + 16), ((this._loadDouble((_33_ + 40))) * (this._loadDouble((_33_ + 56)))));
        _30_ = this._storeDouble(_33_, ((this._loadDouble((0 + 4368))) + ((this._loadDouble((_33_ + 40))) * (this._loadDouble((0 + 4376))))));
        this._storeDouble((_33_ + 32), (((this._loadDouble((_33_ + 56))) + (_30_ * (_32_ = this._loadDouble((_33_ + 16))))) + ((_32_ * (_30_ = this._loadDouble((_33_ + 24)))) * ((this._loadDouble((_33_ + 8))) + (_30_ * (this._loadDouble((_33_ + 32))))))));
        label$0:
        do {
            if ((this._loadInt((_33_ + 52))) == 0) {
                break label$0;
            }
            return ((float) (-1.0 / (this._loadDouble((_33_ + 32)))));
        }
        while (false);
        return ((float) (this._loadDouble((_33_ + 32))));
    }

    @Override()
    public final int __toread(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        _31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16));
        this._storeInt8((_30_ + 74), ((_32_ = this._loadInt8s((_30_ + 74))) | (_32_ + -1)));
        label$0:
        do {
            if (((this._loadInt(((_30_ = this._storeInt((_31_ + 8), _30_)) + 20))) & 4294967295L) <= ((this._loadInt((_30_ + 44))) & 4294967295L)) {
                break label$0;
            }
            this._iiiiTable[this._tableIndices[this._loadInt(((_30_ = this._loadInt((_31_ + 8))) + 36))]].invoke(_30_, 0, 0);
        }
        while (false);
        _32_ = this._storeInt(((_30_ = this._loadInt((_31_ + 8))) + 20), (this._storeInt((_30_ + 16), (this._storeInt((_30_ + 28), 0)))));
        label$1:
        do {
            label$2:
            do {
                if (((this._loadInt8u(_30_)) & 4) == 0) {
                    break label$2;
                }
                this._storeInt((_30_ = this._loadInt((_31_ + 8))), ((this._loadInt(_30_)) | 32));
                this._storeInt((_31_ + 12), -1);
                break label$1;
            }
            while (false);
            this._storeInt(((_30_ = this._loadInt((_31_ + 8))) + 4), (this._storeInt((_30_ + 8), ((this._loadInt((_30_ + 44))) + (this._loadInt((_30_ + 48)))))));
            _temp$0 = -1;
            _temp$1 = _32_;
            _temp$2 = ((((this._loadInt((this._loadInt((_31_ + 8))))) & 16) >>> 4) != 0) ? _temp$0 : _temp$1;
            this._storeInt((_31_ + 12), _temp$2);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void __toread_needs_stdio_exit()
    {
        __stdio_exit();
        return;
    }

    @Override()
    public final int __towrite(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _32_ = this._loadInt((0 + 4));
        this._storeInt8((_30_ + 74), ((_31_ = this._loadInt8s((_30_ + 74))) | (_31_ + -1)));
        label$0:
        do {
            if (((this._loadInt8u((this._storeInt(((_32_ = _32_ - 16) + 8), _30_)))) & 8) == 0) {
                break label$0;
            }
            this._storeInt((_30_ = this._loadInt((_32_ + 8))), ((this._loadInt(_30_)) | 32));
            this._storeInt((_32_ + 12), -1);
            return (this._loadInt((_32_ + 12)));
        }
        while (false);
        this._storeLong(((_30_ = this._loadInt((_32_ + 8))) + 4), 0L);
        _30_ = this._storeInt((_30_ + 28), (this._loadInt((_30_ + 44))));
        this._storeInt(((this._loadInt((_32_ + 8))) + 20), _30_);
        this._storeInt(((_30_ = this._loadInt((_32_ + 8))) + 16), ((this._loadInt((_30_ + 44))) + (this._loadInt((_30_ + 48)))));
        this._storeInt((_32_ + 12), 0);
        return (this._loadInt((_32_ + 12)));
    }

    @Override()
    public final void __towrite_needs_stdio_exit()
    {
        __stdio_exit();
        return;
    }

    @Override()
    public final int __uflow(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((__toread((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)))) != 0) {
                    break label$1;
                }
                if ((this._iiiiTable[this._tableIndices[this._loadInt(((_30_ = this._loadInt((_31_ + 8))) + 32))]].invoke(_30_, (_31_ + 7), 1)) != 1) {
                    break label$1;
                }
                this._storeInt((_31_ + 12), (this._loadInt8u((_31_ + 7))));
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 12), -1);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void _exit(int _30_)
    {
        this._Exit.invoke((this._storeInt(((this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        throw (new UnreachableException());
    }

    @Override()
    public final int abs(int _30_)
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
    public final int access(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = __syscall_ret((this.__syscall2.invoke(33, (this._loadInt((_32_ + 12))), _31_)));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int acct(int _30_)
    {
        int _31_ = 0;
        _30_ = __syscall_ret((this.__syscall1.invoke(51, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final double acos(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 24), (this._storeDouble((_31_ + 80), _30_)));
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
                                if (((this._storeInt((_31_ + 32), ((this._storeInt((_31_ + 36), (this._loadInt((_31_ + 28))))) & 2147483647))) & 4294967295L) < (1072693248 & 4294967295L)) {
                                    break label$5;
                                }
                                this._storeDouble((_31_ + 8), (this._loadDouble((_31_ + 80))));
                                if (((this._storeInt((_31_ + 20), (this._loadInt((_31_ + 8))))) | ((this._loadInt((_31_ + 32))) + -1072693248)) == 0) {
                                    break label$4;
                                }
                                this._storeDouble((_31_ + 88), (0.0 / ((_30_ = this._loadDouble((_31_ + 80))) - _30_)));
                                break label$0;
                            }
                            while (false);
                            label$6:
                            do {
                                if (((this._loadInt((_31_ + 32))) & 4294967295L) > (1071644671 & 4294967295L)) {
                                    break label$6;
                                }
                                if (((this._loadInt((_31_ + 32))) & 4294967295L) > (1012924416 & 4294967295L)) {
                                    break label$3;
                                }
                                this._storeLong((_31_ + 88), 4609753056924675352L);
                                break label$0;
                            }
                            while (false);
                            if (((this._loadInt((_31_ + 36))) >>> 31) == 0) {
                                break label$2;
                            }
                            this._storeDouble((_31_ + 56), (Math.sqrt((this._storeDouble((_31_ + 72), (((this._loadDouble((_31_ + 80))) + 1.0) * 0.5))))));
                            this._storeDouble((_31_ + 88), ((_30_ = 1.5707963267948966 - ((this._storeDouble((_31_ + 64), (((R((this._loadDouble((_31_ + 72))))) * (this._loadDouble((_31_ + 56)))) + -6.123233995736766E-17))) + (this._loadDouble((_31_ + 56))))) + _30_));
                            break label$0;
                        }
                        while (false);
                        if (((this._loadInt((_31_ + 36))) >>> 31) == 0) {
                            break label$1;
                        }
                        this._storeLong((_31_ + 88), 4614256656552045848L);
                        break label$0;
                    }
                    while (false);
                    this._storeDouble((_31_ + 88), (1.5707963267948966 - ((_30_ = this._loadDouble((_31_ + 80))) - (6.123233995736766E-17 - (_30_ * (R((_30_ * _30_))))))));
                    break label$0;
                }
                while (false);
                this._storeDouble(_31_, (this._storeDouble((_31_ + 40), (this._storeDouble((_31_ + 56), (Math.sqrt((this._storeDouble((_31_ + 72), ((1.0 - (this._loadDouble((_31_ + 80)))) * 0.5))))))))));
                this._storeLong(_31_, ((this._loadLong(_31_)) & -4294967296L));
                _30_ = this._storeDouble((_31_ + 40), (this._loadDouble(_31_)));
                this._storeDouble((_31_ + 48), (((this._loadDouble((_31_ + 72))) - (_30_ * _30_)) / (_30_ + (this._loadDouble((_31_ + 56))))));
                this._storeDouble((_31_ + 88), ((_30_ = (this._storeDouble((_31_ + 64), (((R((this._loadDouble((_31_ + 72))))) * (this._loadDouble((_31_ + 56)))) + (this._loadDouble((_31_ + 48)))))) + (this._loadDouble((_31_ + 40)))) + _30_));
                break label$0;
            }
            while (false);
            this._storeLong((_31_ + 88), 0L);
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 88));
        this._storeInt((0 + 4), (_31_ + 96));
        return _30_;
    }

    @Override()
    public final double R(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = (this._loadInt((0 + 4))) - 32) + 16), ((_30_ = this._storeDouble((_31_ + 24), _30_)) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 3.479331075960212E-5) + 7.915349942898145E-4)) + -0.04005553450067941)) + 0.20121253213486293)) + -0.3255658186224009)) + 0.16666666666666666)));
        _30_ = this._storeDouble((_31_ + 8), (((_30_ = this._loadDouble((_31_ + 24))) * ((_30_ * ((_30_ * ((_30_ * 0.07703815055590194) + -0.6882839716054533)) + 2.0209457602335057)) + -2.403394911734414)) + 1.0));
        return ((this._loadDouble((_31_ + 16))) / _30_);
    }

    @Override()
    public final float acosf(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 24), (this._storeFloat((_31_ + 56), _30_)));
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
                                    if (((this._storeInt((_31_ + 28), ((this._storeInt((_31_ + 32), (this._loadInt((_31_ + 24))))) & 2147483647))) & 4294967295L) < (1065353216 & 4294967295L)) {
                                        break label$6;
                                    }
                                    if ((this._loadInt((_31_ + 28))) != 1065353216) {
                                        break label$5;
                                    }
                                    if (((this._loadInt((_31_ + 32))) >>> 31) == 0) {
                                        break label$2;
                                    }
                                    this._storeInt((_31_ + 60), 1078530010);
                                    break label$0;
                                }
                                while (false);
                                if (((this._loadInt((_31_ + 28))) & 4294967295L) > (1056964607 & 4294967295L)) {
                                    break label$4;
                                }
                                if (((this._loadInt((_31_ + 28))) & 4294967295L) > (847249408 & 4294967295L)) {
                                    break label$3;
                                }
                                this._storeInt((_31_ + 60), 1070141402);
                                break label$0;
                            }
                            while (false);
                            this._storeFloat((_31_ + 60), (0.0f / ((_30_ = this._loadFloat((_31_ + 56))) - _30_)));
                            break label$0;
                        }
                        while (false);
                        if (((this._loadInt((_31_ + 32))) >>> 31) == 0) {
                            break label$1;
                        }
                        this._storeFloat((_31_ + 44), ((float) (Math.sqrt((this._storeFloat((_31_ + 52), (((this._loadFloat((_31_ + 56))) + 1.0f) * 0.5f)))))));
                        this._storeFloat((_31_ + 60), ((_30_ = 1.5707963f - ((this._storeFloat((_31_ + 48), (((R$2e$10((this._loadFloat((_31_ + 52))))) * (this._loadFloat((_31_ + 44)))) + -7.5497894E-8f))) + (this._loadFloat((_31_ + 44))))) + _30_));
                        break label$0;
                    }
                    while (false);
                    this._storeFloat((_31_ + 60), (1.5707963f - ((_30_ = this._loadFloat((_31_ + 56))) - (7.5497894E-8f - (_30_ * (R$2e$10((_30_ * _30_))))))));
                    break label$0;
                }
                while (false);
                this._storeInt((_31_ + 60), 0);
                break label$0;
            }
            while (false);
            this._storeFloat((_31_ + 16), (this._storeFloat((_31_ + 44), ((float) (Math.sqrt((this._storeFloat((_31_ + 52), ((1.0f - (this._loadFloat((_31_ + 56)))) * 0.5f)))))))));
            this._storeInt((_31_ + 8), ((this._storeInt((_31_ + 32), (this._loadInt((_31_ + 16))))) & -4096));
            _30_ = this._storeFloat((_31_ + 36), (this._loadFloat((_31_ + 8))));
            this._storeFloat((_31_ + 40), (((this._loadFloat((_31_ + 52))) - (_30_ * _30_)) / (_30_ + (this._loadFloat((_31_ + 44))))));
            this._storeFloat((_31_ + 60), ((_30_ = (this._storeFloat((_31_ + 48), (((R$2e$10((this._loadFloat((_31_ + 52))))) * (this._loadFloat((_31_ + 44)))) + (this._loadFloat((_31_ + 40)))))) + (this._loadFloat((_31_ + 36)))) + _30_));
        }
        while (false);
        _30_ = this._loadFloat((_31_ + 60));
        this._storeInt((0 + 4), (_31_ + 64));
        return _30_;
    }

    @Override()
    public final float R$2e$10(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), ((_30_ = this._storeFloat((_31_ + 12), _30_)) * ((_30_ * ((_30_ * -0.008656363f) + -0.042743422f)) + 0.16666587f)));
        _30_ = this._storeFloat((_31_ + 4), (((this._loadFloat((_31_ + 12))) * -0.70662963f) + 1.0f));
        return ((this._loadFloat((_31_ + 8))) / _30_);
    }

    @Override()
    public final double acosh(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 8), (this._storeDouble((_31_ + 16), _30_)));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_31_ + 4), ((int) (((this._loadLong((_31_ + 8))) >>> 52L) & 2047L)))) & 4294967295L) > (1023 & 4294967295L)) {
                    break label$1;
                }
                this._storeDouble((_31_ + 24), (log1p(((_30_ = (this._loadDouble((_31_ + 16))) + -1.0) + (Math.sqrt(((_30_ * _30_) + (_30_ + _30_))))))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_31_ + 4))) & 4294967295L) > (1048 & 4294967295L)) {
                    break label$2;
                }
                this._storeDouble((_31_ + 24), (log((((_30_ = this._loadDouble((_31_ + 16))) + _30_) - (1.0 / (_30_ + (Math.sqrt(((_30_ * _30_) - 1.0)))))))));
                break label$0;
            }
            while (false);
            this._storeDouble((_31_ + 24), ((log((this._loadDouble((_31_ + 16))))) + 0.6931471805599453));
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 24));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final float acoshf(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 16), (this._storeFloat((_31_ + 24), _30_)));
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 16))) & 2147483647))) & 4294967295L) > (1073741823 & 4294967295L)) {
                    break label$1;
                }
                this._storeFloat((_31_ + 28), (log1pf(((_30_ = (this._loadFloat((_31_ + 24))) + -1.0f) + ((float) (Math.sqrt(((_30_ * _30_) + (_30_ + _30_)))))))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_31_ + 12))) & 4294967295L) > (1166016511 & 4294967295L)) {
                    break label$2;
                }
                this._storeFloat((_31_ + 28), (logf((((_30_ = this._loadFloat((_31_ + 24))) + _30_) - (1.0f / (_30_ + ((float) (Math.sqrt(((_30_ * _30_) - 1.0f))))))))));
                break label$0;
            }
            while (false);
            this._storeFloat((_31_ + 28), ((logf((this._loadFloat((_31_ + 24))))) + 0.6931472f));
        }
        while (false);
        _30_ = this._loadFloat((_31_ + 28));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final void acoshl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (acosh((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void acosl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (acos((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int alarm(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        int _33_ = 0;
        _31_ = this._storeInt((_33_ = (_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 20), 0);
        this._storeInt((_32_ + 28), _30_);
        _30_ = this._storeInt((_32_ + 12), (this._storeInt((_32_ + 8), _31_)));
        this._storeInt((_32_ + 16), (this._loadInt((_32_ + 28))));
        this.__syscall3.invoke(104, _30_, (_32_ + 8), (_32_ + 8));
        _33_ = this._loadInt(_33_);
        _31_ = this._loadInt((_32_ + 16));
        this._storeInt((0 + 4), (_32_ + 32));
        return (_31_ + ((_33_ != _30_) ? 1 : 0));
    }

    @Override()
    public final int aligned_alloc(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = __memalign((this._loadInt((_32_ + 12))), _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final double asin(double _30_)
    {
        int _31_ = 0;
        double _32_ = 0.0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 40), (this._storeDouble((_31_ + 80), _30_)));
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
                                if (((this._storeInt((_31_ + 48), ((this._storeInt((_31_ + 52), (this._loadInt((_31_ + 44))))) & 2147483647))) & 4294967295L) < (1072693248 & 4294967295L)) {
                                    break label$5;
                                }
                                this._storeDouble((_31_ + 24), (this._loadDouble((_31_ + 80))));
                                if (((this._storeInt((_31_ + 36), (this._loadInt((_31_ + 24))))) | ((this._loadInt((_31_ + 48))) + -1072693248)) == 0) {
                                    break label$4;
                                }
                                this._storeDouble((_31_ + 88), (0.0 / ((_30_ = this._loadDouble((_31_ + 80))) - _30_)));
                                break label$0;
                            }
                            while (false);
                            label$6:
                            do {
                                if (((this._loadInt((_31_ + 48))) & 4294967295L) > (1071644671 & 4294967295L)) {
                                    break label$6;
                                }
                                if (((this._loadInt((_31_ + 48))) & 4294967295L) > (1045430271 & 4294967295L)) {
                                    break label$3;
                                }
                                if (((this._loadInt((_31_ + 48))) & 4294967295L) < (1048576 & 4294967295L)) {
                                    break label$3;
                                }
                                this._storeDouble((_31_ + 88), (this._loadDouble((_31_ + 80))));
                                break label$0;
                            }
                            while (false);
                            this._storeDouble((_31_ + 56), (Math.sqrt((this._storeDouble((_31_ + 72), ((1.0 - (Math.abs((this._loadDouble((_31_ + 80)))))) * 0.5))))));
                            this._storeDouble((_31_ + 64), (R$2e$11((this._loadDouble((_31_ + 72))))));
                            if (((this._loadInt((_31_ + 48))) & 4294967295L) < (1072640819 & 4294967295L)) {
                                break label$2;
                            }
                            this._storeDouble((_31_ + 80), (1.5707963267948966 - (((_30_ = (_30_ = this._loadDouble((_31_ + 56))) + (_30_ * (this._loadDouble((_31_ + 64))))) + _30_) + -6.123233995736766E-17)));
                            break label$1;
                        }
                        while (false);
                        this._storeDouble((_31_ + 88), (((this._loadDouble((_31_ + 80))) * 1.5707963267948966) + 7.52316384526264E-37));
                        break label$0;
                    }
                    while (false);
                    this._storeDouble((_31_ + 88), ((_30_ = this._loadDouble((_31_ + 80))) + (_30_ * (R$2e$11((_30_ * _30_))))));
                    break label$0;
                }
                while (false);
                this._storeDouble(_31_, (this._storeDouble((_31_ + 16), (this._loadDouble((_31_ + 56))))));
                this._storeLong(_31_, ((this._loadLong(_31_)) & -4294967296L));
                _30_ = this._storeDouble((_31_ + 16), (this._loadDouble(_31_)));
                _30_ = this._storeDouble((_31_ + 8), (((this._loadDouble((_31_ + 72))) - (_30_ * _30_)) / (_30_ + (this._loadDouble((_31_ + 56))))));
                this._storeDouble((_31_ + 80), (0.7853981633974483 - (((((_32_ = this._loadDouble((_31_ + 56))) + _32_) * (this._loadDouble((_31_ + 64)))) - (6.123233995736766E-17 - (_30_ + _30_))) - (0.7853981633974483 - ((_30_ = this._loadDouble((_31_ + 16))) + _30_)))));
            }
            while (false);
            label$7:
            do {
                if (((this._loadInt((_31_ + 52))) >>> 31) == 0) {
                    break label$7;
                }
                this._storeDouble((_31_ + 88), (-(this._loadDouble((_31_ + 80)))));
                break label$0;
            }
            while (false);
            this._storeDouble((_31_ + 88), (this._loadDouble((_31_ + 80))));
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 88));
        this._storeInt((0 + 4), (_31_ + 96));
        return _30_;
    }

    @Override()
    public final double R$2e$11(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = (this._loadInt((0 + 4))) - 32) + 16), ((_30_ = this._storeDouble((_31_ + 24), _30_)) * ((_30_ * ((_30_ * ((_30_ * ((_30_ * ((_30_ * 3.479331075960212E-5) + 7.915349942898145E-4)) + -0.04005553450067941)) + 0.20121253213486293)) + -0.3255658186224009)) + 0.16666666666666666)));
        _30_ = this._storeDouble((_31_ + 8), (((_30_ = this._loadDouble((_31_ + 24))) * ((_30_ * ((_30_ * ((_30_ * 0.07703815055590194) + -0.6882839716054533)) + 2.0209457602335057)) + -2.403394911734414)) + 1.0));
        return ((this._loadDouble((_31_ + 16))) / _30_);
    }

    @Override()
    public final float asinf(float _30_)
    {
        double _31_ = 0.0;
        int _32_ = 0;
        this._storeFloat(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeFloat(_32_, (this._loadFloat((_32_ + 24))));
        this._storeInt((_32_ + 8), (this._loadInt(_32_)));
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
                                if (((this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 8))) & 2147483647))) & 4294967295L) < (1065353216 & 4294967295L)) {
                                    break label$5;
                                }
                                if ((this._loadInt((_32_ + 4))) != 1065353216) {
                                    break label$4;
                                }
                                this._storeFloat((_32_ + 28), ((float) ((((double) (this._loadFloat((_32_ + 24)))) * 1.5707963267948966) + 7.52316384526264E-37)));
                                break label$0;
                            }
                            while (false);
                            if (((this._loadInt((_32_ + 4))) & 4294967295L) > (1056964607 & 4294967295L)) {
                                break label$3;
                            }
                            if (((this._loadInt((_32_ + 4))) & 4294967295L) > (964689919 & 4294967295L)) {
                                break label$2;
                            }
                            if (((this._loadInt((_32_ + 4))) & 4294967295L) < (8388608 & 4294967295L)) {
                                break label$2;
                            }
                            this._storeFloat((_32_ + 28), (this._loadFloat((_32_ + 24))));
                            break label$0;
                        }
                        while (false);
                        this._storeFloat((_32_ + 28), (0.0f / ((_30_ = this._loadFloat((_32_ + 24))) - _30_)));
                        break label$0;
                    }
                    while (false);
                    this._storeFloat((_32_ + 24), ((float) ((((_31_ = this._storeDouble((_32_ + 16), (Math.sqrt(((double) (this._storeFloat((_32_ + 12), ((1.0f - (Math.abs((this._loadFloat((_32_ + 24)))))) * 0.5f)))))))) + (_31_ * ((double) (R$2e$12((this._loadFloat((_32_ + 12)))))))) * -2.0) + 1.5707963267948966)));
                    if (((this._loadInt((_32_ + 8))) >>> 31) == 0) {
                        break label$1;
                    }
                    this._storeFloat((_32_ + 28), (-(this._loadFloat((_32_ + 24)))));
                    break label$0;
                }
                while (false);
                this._storeFloat((_32_ + 28), ((_30_ = this._loadFloat((_32_ + 24))) + (_30_ * (R$2e$12((_30_ * _30_))))));
                break label$0;
            }
            while (false);
            this._storeFloat((_32_ + 28), (this._loadFloat((_32_ + 24))));
        }
        while (false);
        _30_ = this._loadFloat((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _30_;
    }

    @Override()
    public final float R$2e$12(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), ((_30_ = this._storeFloat((_31_ + 12), _30_)) * ((_30_ * ((_30_ * -0.008656363f) + -0.042743422f)) + 0.16666587f)));
        _30_ = this._storeFloat((_31_ + 4), (((this._loadFloat((_31_ + 12))) * -0.70662963f) + 1.0f));
        return ((this._loadFloat((_31_ + 8))) / _30_);
    }

    @Override()
    public final double asinh(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 16), (this._storeDouble((_31_ + 24), _30_)));
        this._storeLong32((_31_ + 12), (((this._loadLong((_31_ + 16))) >>> 52L) & 2047L));
        this._storeLong32((_31_ + 8), ((this._loadLong((_31_ + 16))) >>> 63L));
        this._storeLong((_31_ + 16), ((this._loadLong((_31_ + 16))) & 9223372036854775807L));
        this._storeDouble((_31_ + 24), (this._loadDouble((_31_ + 16))));
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt((_31_ + 12))) & 4294967295L) < (1049 & 4294967295L)) {
                    break label$1;
                }
                this._storeDouble((_31_ + 24), ((log((this._loadDouble((_31_ + 24))))) + 0.6931471805599453));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_31_ + 12))) & 4294967295L) < (1024 & 4294967295L)) {
                    break label$2;
                }
                this._storeDouble((_31_ + 24), (log((((_30_ = this._loadDouble((_31_ + 24))) + _30_) + (1.0 / ((Math.sqrt(((_30_ * _30_) + 1.0))) + _30_))))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_31_ + 12))) & 4294967295L) < (997 & 4294967295L)) {
                    break label$3;
                }
                this._storeDouble((_31_ + 24), (log1p(((_30_ = this._loadDouble((_31_ + 24))) + ((_30_ = _30_ * _30_) / ((Math.sqrt((_30_ + 1.0))) + 1.0))))));
                break label$0;
            }
            while (false);
            this._storeDouble(_31_, ((this._loadDouble((_31_ + 24))) + 1.3292279957849159E36));
        }
        while (false);
        label$4:
        do {
            label$5:
            do {
                if ((this._loadInt((_31_ + 8))) == 0) {
                    break label$5;
                }
                _30_ = -(this._loadDouble((_31_ + 24)));
                break label$4;
            }
            while (false);
            _30_ = this._loadDouble((_31_ + 24));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final float asinhf(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), (this._storeFloat((_31_ + 28), _30_)));
        this._storeInt((_31_ + 20), ((this._loadInt((_31_ + 24))) & 2147483647));
        this._storeInt((_31_ + 16), ((this._loadInt((_31_ + 24))) >>> 31));
        this._storeInt((_31_ + 24), (this._loadInt((_31_ + 20))));
        this._storeFloat((_31_ + 28), (this._loadFloat((_31_ + 24))));
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) < (1166016512 & 4294967295L)) {
                    break label$1;
                }
                this._storeFloat((_31_ + 28), ((logf((this._loadFloat((_31_ + 28))))) + 0.6931472f));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) < (1073741824 & 4294967295L)) {
                    break label$2;
                }
                this._storeFloat((_31_ + 28), (logf((((_30_ = this._loadFloat((_31_ + 28))) + _30_) + (1.0f / (((float) (Math.sqrt(((_30_ * _30_) + 1.0f)))) + _30_))))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) < (964689920 & 4294967295L)) {
                    break label$3;
                }
                this._storeFloat((_31_ + 28), (log1pf(((_30_ = this._loadFloat((_31_ + 28))) + ((_30_ = _30_ * _30_) / (((float) (Math.sqrt((_30_ + 1.0f)))) + 1.0f))))));
                break label$0;
            }
            while (false);
            this._storeFloat((_31_ + 12), ((this._loadFloat((_31_ + 28))) + 1.329228E36f));
        }
        while (false);
        label$4:
        do {
            label$5:
            do {
                if ((this._loadInt((_31_ + 16))) == 0) {
                    break label$5;
                }
                _30_ = -(this._loadFloat((_31_ + 28)));
                break label$4;
            }
            while (false);
            _30_ = this._loadFloat((_31_ + 28));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final void asinhl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (asinh((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void asinl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (asin((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void __assert_fail(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        _32_ = this._loadInt((_34_ + 28));
        _31_ = this._loadInt((_34_ + 24));
        this._storeInt((_34_ + 12), (this._loadInt((_34_ + 20))));
        this._storeInt((_34_ + 8), _33_);
        this._storeInt((_34_ + 4), _31_);
        this._storeInt(_34_, _32_);
        this.fprintf.invoke((this._loadInt((0 + 14768))), 4416, _34_);
        fflush(0);
        this.abort.invoke();
        throw (new UnreachableException());
    }

    @Override()
    public final void __funcs_on_quick_exit()
    {
        int _30_ = 0;
        _30_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16));
        this.__lock.invoke(4451);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((0 + 4459))) < 1) {
                    break label$1;
                }
                this._storeInt((_30_ + 12), (this._loadInt((((this._storeInt((0 + 4459), ((this._loadInt((0 + 4459))) + -1))) << 2) + 4463))));
                this.__unlock.invoke(4451);
                this._vTable[this._tableIndices[this._loadInt((_30_ + 12))]].invoke();
                this.__lock.invoke(4451);
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_30_ + 16));
        return;
    }

    @Override()
    public final int at_quick_exit(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((0 + 4459))) != 32) {
                    break label$1;
                }
                this._storeInt((_31_ + 12), -1);
                break label$0;
            }
            while (false);
            this.__lock.invoke(4451);
            this._storeInt((0 + 4459), ((_30_ = this._loadInt((0 + 4459))) + 1));
            this._storeInt(((_30_ << 2) + 4463), (this._loadInt((_31_ + 8))));
            this.__unlock.invoke(4451);
            this._storeInt((_31_ + 12), 0);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final double atan(double _30_)
    {
        int _31_ = 0;
        long _32_ = 0L;
        int _33_ = 0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 8), (this._storeDouble((_31_ + 64), _30_)));
        this._storeLong32((_31_ + 28), ((_32_ = this._loadLong((_31_ + 8))) >>> 32L));
        this._storeLong32((_31_ + 24), (_32_ >>> 63L));
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
                                                if (((this._storeInt((_31_ + 28), ((this._loadInt((_31_ + 28))) & 2147483647))) & 4294967295L) < (1141899264 & 4294967295L)) {
                                                    break label$9;
                                                }
                                                if ((((__DOUBLE_BITS((this._loadDouble((_31_ + 64))))) & 9223372036854775807L) & 4294967295L) < (9218868437227405313L & 4294967295L)) {
                                                    break label$8;
                                                }
                                                this._storeDouble((_31_ + 72), (this._loadDouble((_31_ + 64))));
                                                break label$0;
                                            }
                                            while (false);
                                            if (((this._loadInt((_31_ + 28))) & 4294967295L) > (1071382527 & 4294967295L)) {
                                                break label$7;
                                            }
                                            if (((this._loadInt((_31_ + 28))) & 4294967295L) > (1044381695 & 4294967295L)) {
                                                break label$6;
                                            }
                                            label$10:
                                            do {
                                                if (((this._loadInt((_31_ + 28))) & 4294967295L) > (1048575 & 4294967295L)) {
                                                    break label$10;
                                                }
                                                this._storeFloat((_31_ + 4), ((float) (this._loadDouble((_31_ + 64)))));
                                            }
                                            while (false);
                                            this._storeDouble((_31_ + 72), (this._loadDouble((_31_ + 64))));
                                            break label$0;
                                        }
                                        while (false);
                                        this._storeDouble((_31_ + 32), ((this._loadDouble((0 + 4616))) + 7.52316384526264E-37));
                                        if ((this._loadInt((_31_ + 24))) == 0) {
                                            break label$4;
                                        }
                                        this._storeDouble((_31_ + 72), (-(this._loadDouble((_31_ + 32)))));
                                        break label$0;
                                    }
                                    while (false);
                                    this._storeDouble((_31_ + 64), (Math.abs((this._loadDouble((_31_ + 64))))));
                                    if (((this._loadInt((_31_ + 28))) & 4294967295L) > (1072889855 & 4294967295L)) {
                                        break label$5;
                                    }
                                    if (((this._loadInt((_31_ + 28))) & 4294967295L) > (1072037887 & 4294967295L)) {
                                        break label$3;
                                    }
                                    this._storeInt((_31_ + 20), 0);
                                    this._storeDouble((_31_ + 64), ((((_30_ = this._loadDouble((_31_ + 64))) + _30_) + -1.0) / (_30_ + 2.0)));
                                    break label$1;
                                }
                                while (false);
                                this._storeInt((_31_ + 20), -1);
                                break label$1;
                            }
                            while (false);
                            if (((this._loadInt((_31_ + 28))) & 4294967295L) > (1073971199 & 4294967295L)) {
                                break label$2;
                            }
                            this._storeInt((_31_ + 20), 2);
                            this._storeDouble((_31_ + 64), (((_30_ = this._loadDouble((_31_ + 64))) - 1.5) / ((_30_ * 1.5) + 1.0)));
                            break label$1;
                        }
                        while (false);
                        this._storeDouble((_31_ + 72), (this._loadDouble((_31_ + 32))));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_31_ + 20), 1);
                    this._storeDouble((_31_ + 64), (((_30_ = this._loadDouble((_31_ + 64))) - 1.0) / (_30_ + 1.0)));
                    break label$1;
                }
                while (false);
                this._storeInt((_31_ + 20), 3);
                this._storeDouble((_31_ + 64), (-1.0 / (this._loadDouble((_31_ + 64)))));
            }
            while (false);
            _30_ = this._storeDouble((_31_ + 56), ((_30_ = this._storeDouble((_31_ + 32), ((_30_ = this._loadDouble((_31_ + 64))) * _30_))) * _30_));
            this._storeDouble((_31_ + 48), ((this._loadDouble((_31_ + 32))) * ((this._loadDouble((0 + 4624))) + (_30_ * ((this._loadDouble((0 + 4640))) + (_30_ * ((this._loadDouble((0 + 4656))) + (_30_ * ((this._loadDouble((0 + 4672))) + (_30_ * ((this._loadDouble((0 + 4688))) + (_30_ * (this._loadDouble((0 + 4704)))))))))))))));
            this._storeDouble((_31_ + 40), ((_30_ = this._loadDouble((_31_ + 56))) * ((this._loadDouble((0 + 4632))) + (_30_ * ((this._loadDouble((0 + 4648))) + (_30_ * ((this._loadDouble((0 + 4664))) + (_30_ * ((this._loadDouble((0 + 4680))) + (_30_ * (this._loadDouble((0 + 4696)))))))))))));
            label$11:
            do {
                label$12:
                do {
                    label$13:
                    do {
                        if ((this._loadInt((_31_ + 20))) <= -1) {
                            break label$13;
                        }
                        this._storeDouble((_31_ + 32), ((this._loadDouble(((_33_ = (this._loadInt((_31_ + 20))) << 3) + 4592))) - ((((_30_ = this._loadDouble((_31_ + 64))) * ((this._loadDouble((_31_ + 48))) + (this._loadDouble((_31_ + 40))))) - (this._loadDouble((_33_ + 4720)))) - _30_)));
                        if ((this._loadInt((_31_ + 24))) == 0) {
                            break label$12;
                        }
                        _30_ = -(this._loadDouble((_31_ + 32)));
                        break label$11;
                    }
                    while (false);
                    this._storeDouble((_31_ + 72), ((_30_ = this._loadDouble((_31_ + 64))) - (_30_ * ((this._loadDouble((_31_ + 48))) + (this._loadDouble((_31_ + 40)))))));
                    break label$0;
                }
                while (false);
                _30_ = this._loadDouble((_31_ + 32));
            }
            while (false);
            this._storeDouble((_31_ + 72), _30_);
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 72));
        this._storeInt((0 + 4), (_31_ + 80));
        return _30_;
    }

    @Override()
    public final int __FLOAT_BITS(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final double atan2(double _30_, double _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        double _temp$0 = 0.0;
        double _temp$1 = 0.0;
        double _temp$2 = 0.0;
        double _temp$3 = 0.0;
        double _temp$4 = 0.0;
        double _temp$5 = 0.0;
        this._storeDouble(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 64), _30_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((((__DOUBLE_BITS$2e$15((this._storeDouble((_32_ + 56), _31_)))) & 9223372036854775807L) & 4294967295L) > (9218868437227405312L & 4294967295L)) {
                        break label$2;
                    }
                    if ((((__DOUBLE_BITS$2e$15((this._loadDouble((_32_ + 64))))) & 9223372036854775807L) & 4294967295L) < (9218868437227405313L & 4294967295L)) {
                        break label$1;
                    }
                }
                while (false);
                this._storeDouble((_32_ + 72), ((this._loadDouble((_32_ + 56))) + (this._loadDouble((_32_ + 64)))));
                break label$0;
            }
            while (false);
            this._storeDouble((_32_ + 16), (this._loadDouble((_32_ + 56))));
            this._storeLong32((_32_ + 32), (this._loadLong32u((_32_ + 20))));
            this._storeLong32((_32_ + 40), (this._loadLong((_32_ + 16))));
            this._storeDouble((_32_ + 8), (this._loadDouble((_32_ + 64))));
            this._storeLong32((_32_ + 28), (this._loadLong32u((_32_ + 12))));
            this._storeLong32((_32_ + 36), (this._loadLong((_32_ + 8))));
            label$3:
            do {
                label$4:
                do {
                    label$5:
                    do {
                        if ((((this._loadInt((_32_ + 32))) + -1072693248) | (this._loadInt((_32_ + 40)))) == 0) {
                            break label$5;
                        }
                        this._storeInt((_32_ + 44), (((this._loadInt((_32_ + 28))) >>> 31) | (((this._loadInt((_32_ + 32))) >>> 30) & 2)));
                        this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) & 2147483647));
                        if (((this._storeInt((_32_ + 28), ((this._loadInt((_32_ + 28))) & 2147483647))) | (this._loadInt((_32_ + 36)))) == 0) {
                            break label$4;
                        }
                        break label$3;
                    }
                    while (false);
                    this._storeDouble((_32_ + 72), (atan((this._loadDouble((_32_ + 64))))));
                    break label$0;
                }
                while (false);
                label$6:
                do {
                    label$7:
                    do {
                        if (((_33_ = this._loadInt((_32_ + 44))) & 4294967295L) < (2 & 4294967295L)) {
                            break label$7;
                        }
                        if (_33_ == 2) {
                            break label$6;
                        }
                        if (_33_ != 3) {
                            break label$3;
                        }
                        this._storeLong((_32_ + 72), -4609115380302729960L);
                        break label$0;
                    }
                    while (false);
                    this._storeDouble((_32_ + 72), (this._loadDouble((_32_ + 64))));
                    break label$0;
                }
                while (false);
                this._storeLong((_32_ + 72), 4614256656552045848L);
                break label$0;
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
                                                            if (((this._loadInt((_32_ + 32))) | (this._loadInt((_32_ + 40)))) == 0) {
                                                                break label$19;
                                                            }
                                                            if ((this._loadInt((_32_ + 32))) != 2146435072) {
                                                                break label$17;
                                                            }
                                                            if ((this._loadInt((_32_ + 28))) != 2146435072) {
                                                                break label$18;
                                                            }
                                                            if (((_33_ = this._loadInt((_32_ + 44))) & 4294967295L) > (3 & 4294967295L)) {
                                                                break label$17;
                                                            }
                                                            label$20:
                                                            do {
                                                                switch (_33_) {
                                                                    case 0: {
                                                                        break label$20;
                                                                    }
                                                                    case 1: {
                                                                        break label$16;
                                                                    }
                                                                    case 2: {
                                                                        break label$15;
                                                                    }
                                                                    case 3: {
                                                                        break label$14;
                                                                    }
                                                                    default: {
                                                                        break label$20;
                                                                    }
                                                                }
                                                            }
                                                            while (false);
                                                            this._storeLong((_32_ + 72), 4605249457297304856L);
                                                            break label$0;
                                                        }
                                                        while (false);
                                                        _temp$0 = -1.5707963267948966;
                                                        _temp$1 = 1.5707963267948966;
                                                        _temp$2 = (((this._loadInt((_32_ + 44))) & 1) != 0) ? _temp$0 : _temp$1;
                                                        this._storeDouble((_32_ + 72), _temp$2);
                                                        break label$0;
                                                    }
                                                    while (false);
                                                    if (((_33_ = this._loadInt((_32_ + 44))) & 4294967295L) > (3 & 4294967295L)) {
                                                        break label$17;
                                                    }
                                                    label$21:
                                                    do {
                                                        switch (_33_) {
                                                            case 0: {
                                                                break label$21;
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
                                                            default: {
                                                                break label$21;
                                                            }
                                                        }
                                                    }
                                                    while (false);
                                                    this._storeLong((_32_ + 72), 0L);
                                                    break label$0;
                                                }
                                                while (false);
                                                label$22:
                                                do {
                                                    label$23:
                                                    do {
                                                        if ((((this._loadInt((_32_ + 32))) + 67108864) & 4294967295L) < ((this._loadInt((_32_ + 28))) & 4294967295L)) {
                                                            break label$23;
                                                        }
                                                        if ((this._loadInt((_32_ + 28))) != 2146435072) {
                                                            break label$22;
                                                        }
                                                    }
                                                    while (false);
                                                    _temp$3 = -1.5707963267948966;
                                                    _temp$4 = 1.5707963267948966;
                                                    _temp$5 = (((this._loadInt((_32_ + 44))) & 1) != 0) ? _temp$3 : _temp$4;
                                                    this._storeDouble((_32_ + 72), _temp$5);
                                                    break label$0;
                                                }
                                                while (false);
                                                label$24:
                                                do {
                                                    label$25:
                                                    do {
                                                        if (((this._loadInt8u((_32_ + 44))) & 2) == 0) {
                                                            break label$25;
                                                        }
                                                        if ((((this._loadInt((_32_ + 28))) + 67108864) & 4294967295L) >= ((this._loadInt((_32_ + 32))) & 4294967295L)) {
                                                            break label$25;
                                                        }
                                                        this._storeLong((_32_ + 48), 0L);
                                                        break label$24;
                                                    }
                                                    while (false);
                                                    this._storeDouble((_32_ + 48), (atan((Math.abs(((this._loadDouble((_32_ + 64))) / (this._loadDouble((_32_ + 56)))))))));
                                                }
                                                while (false);
                                                if ((_33_ = this._loadInt((_32_ + 44))) == 2) {
                                                    break label$10;
                                                }
                                                if (_33_ == 1) {
                                                    break label$9;
                                                }
                                                if (_33_ != 0) {
                                                    break label$8;
                                                }
                                                this._storeDouble((_32_ + 72), (this._loadDouble((_32_ + 48))));
                                                break label$0;
                                            }
                                            while (false);
                                            this._storeLong((_32_ + 72), -4618122579557470952L);
                                            break label$0;
                                        }
                                        while (false);
                                        this._storeLong((_32_ + 72), 4612488097114038738L);
                                        break label$0;
                                    }
                                    while (false);
                                    this._storeLong((_32_ + 72), -4610883939740737070L);
                                    break label$0;
                                }
                                while (false);
                                this._storeLong((_32_ + 72), -9223372036854775808L);
                                break label$0;
                            }
                            while (false);
                            this._storeLong((_32_ + 72), 4614256656552045848L);
                            break label$0;
                        }
                        while (false);
                        this._storeLong((_32_ + 72), -4609115380302729960L);
                        break label$0;
                    }
                    while (false);
                    this._storeDouble((_32_ + 72), (3.141592653589793 - ((this._loadDouble((_32_ + 48))) + -1.2246467991473532E-16)));
                    break label$0;
                }
                while (false);
                this._storeDouble((_32_ + 72), (-(this._loadDouble((_32_ + 48)))));
                break label$0;
            }
            while (false);
            this._storeDouble((_32_ + 72), (((this._loadDouble((_32_ + 48))) + -1.2246467991473532E-16) + -3.141592653589793));
        }
        while (false);
        _31_ = this._loadDouble((_32_ + 72));
        this._storeInt((0 + 4), (_32_ + 80));
        return _31_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$14(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$15(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final float atan2f(float _30_, float _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        float _temp$0 = 0.0f;
        float _temp$1 = 0.0f;
        float _temp$2 = 0.0f;
        float _temp$3 = 0.0f;
        float _temp$4 = 0.0f;
        float _temp$5 = 0.0f;
        this._storeFloat(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((((__FLOAT_BITS$2e$16((this._storeFloat((_32_ + 36), _31_)))) & 2147483647) & 4294967295L) > (2139095040 & 4294967295L)) {
                        break label$2;
                    }
                    if ((((__FLOAT_BITS$2e$16((this._loadFloat((_32_ + 40))))) & 2147483647) & 4294967295L) < (2139095041 & 4294967295L)) {
                        break label$1;
                    }
                }
                while (false);
                this._storeFloat((_32_ + 44), ((this._loadFloat((_32_ + 36))) + (this._loadFloat((_32_ + 40)))));
                break label$0;
            }
            while (false);
            this._storeFloat((_32_ + 16), (this._loadFloat((_32_ + 36))));
            this._storeInt((_32_ + 24), (this._loadInt((_32_ + 16))));
            this._storeFloat((_32_ + 8), (this._loadFloat((_32_ + 40))));
            this._storeInt((_32_ + 20), (this._loadInt((_32_ + 8))));
            label$3:
            do {
                if ((this._loadInt((_32_ + 24))) != 1065353216) {
                    break label$3;
                }
                this._storeFloat((_32_ + 44), (atanf((this._loadFloat((_32_ + 40))))));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 28), (((this._loadInt((_32_ + 20))) >>> 31) | (((this._loadInt((_32_ + 24))) >>> 30) & 2)));
            this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) & 2147483647));
            label$4:
            do {
                if ((this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) & 2147483647))) != 0) {
                    break label$4;
                }
                label$5:
                do {
                    label$6:
                    do {
                        if (((_33_ = this._loadInt((_32_ + 28))) & 4294967295L) < (2 & 4294967295L)) {
                            break label$6;
                        }
                        if (_33_ == 2) {
                            break label$5;
                        }
                        if (_33_ != 3) {
                            break label$4;
                        }
                        this._storeInt((_32_ + 44), -1068953637);
                        break label$0;
                    }
                    while (false);
                    this._storeFloat((_32_ + 44), (this._loadFloat((_32_ + 40))));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 44), 1078530011);
                break label$0;
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
                                            label$15:
                                            do {
                                                label$16:
                                                do {
                                                    label$17:
                                                    do {
                                                        label$18:
                                                        do {
                                                            if ((this._loadInt((_32_ + 24))) == 0) {
                                                                break label$18;
                                                            }
                                                            if ((this._loadInt((_32_ + 24))) != 2139095040) {
                                                                break label$16;
                                                            }
                                                            if ((this._loadInt((_32_ + 20))) != 2139095040) {
                                                                break label$17;
                                                            }
                                                            if (((_33_ = this._loadInt((_32_ + 28))) & 4294967295L) > (3 & 4294967295L)) {
                                                                break label$16;
                                                            }
                                                            label$19:
                                                            do {
                                                                switch (_33_) {
                                                                    case 0: {
                                                                        break label$19;
                                                                    }
                                                                    case 1: {
                                                                        break label$15;
                                                                    }
                                                                    case 2: {
                                                                        break label$14;
                                                                    }
                                                                    case 3: {
                                                                        break label$13;
                                                                    }
                                                                    default: {
                                                                        break label$19;
                                                                    }
                                                                }
                                                            }
                                                            while (false);
                                                            this._storeInt((_32_ + 44), 1061752795);
                                                            break label$0;
                                                        }
                                                        while (false);
                                                        _temp$0 = -1.5707964f;
                                                        _temp$1 = 1.5707964f;
                                                        _temp$2 = (((this._loadInt((_32_ + 28))) & 1) != 0) ? _temp$0 : _temp$1;
                                                        this._storeFloat((_32_ + 44), _temp$2);
                                                        break label$0;
                                                    }
                                                    while (false);
                                                    if (((_33_ = this._loadInt((_32_ + 28))) & 4294967295L) > (3 & 4294967295L)) {
                                                        break label$16;
                                                    }
                                                    label$20:
                                                    do {
                                                        switch (_33_) {
                                                            case 0: {
                                                                break label$20;
                                                            }
                                                            case 1: {
                                                                break label$12;
                                                            }
                                                            case 2: {
                                                                break label$11;
                                                            }
                                                            case 3: {
                                                                break label$10;
                                                            }
                                                            default: {
                                                                break label$20;
                                                            }
                                                        }
                                                    }
                                                    while (false);
                                                    this._storeInt((_32_ + 44), 0);
                                                    break label$0;
                                                }
                                                while (false);
                                                label$21:
                                                do {
                                                    label$22:
                                                    do {
                                                        if ((((this._loadInt((_32_ + 24))) + 218103808) & 4294967295L) < ((this._loadInt((_32_ + 20))) & 4294967295L)) {
                                                            break label$22;
                                                        }
                                                        if ((this._loadInt((_32_ + 20))) != 2139095040) {
                                                            break label$21;
                                                        }
                                                    }
                                                    while (false);
                                                    _temp$3 = -1.5707964f;
                                                    _temp$4 = 1.5707964f;
                                                    _temp$5 = (((this._loadInt((_32_ + 28))) & 1) != 0) ? _temp$3 : _temp$4;
                                                    this._storeFloat((_32_ + 44), _temp$5);
                                                    break label$0;
                                                }
                                                while (false);
                                                label$23:
                                                do {
                                                    label$24:
                                                    do {
                                                        if (((this._loadInt8u((_32_ + 28))) & 2) == 0) {
                                                            break label$24;
                                                        }
                                                        if ((((this._loadInt((_32_ + 20))) + 218103808) & 4294967295L) >= ((this._loadInt((_32_ + 24))) & 4294967295L)) {
                                                            break label$24;
                                                        }
                                                        this._storeInt((_32_ + 32), 0);
                                                        break label$23;
                                                    }
                                                    while (false);
                                                    this._storeFloat((_32_ + 32), (atanf((Math.abs(((this._loadFloat((_32_ + 40))) / (this._loadFloat((_32_ + 36)))))))));
                                                }
                                                while (false);
                                                if ((_33_ = this._loadInt((_32_ + 28))) == 2) {
                                                    break label$9;
                                                }
                                                if (_33_ == 1) {
                                                    break label$8;
                                                }
                                                if (_33_ != 0) {
                                                    break label$7;
                                                }
                                                this._storeFloat((_32_ + 44), (this._loadFloat((_32_ + 32))));
                                                break label$0;
                                            }
                                            while (false);
                                            this._storeInt((_32_ + 44), -1085730853);
                                            break label$0;
                                        }
                                        while (false);
                                        this._storeInt((_32_ + 44), 1075235812);
                                        break label$0;
                                    }
                                    while (false);
                                    this._storeInt((_32_ + 44), -1072247836);
                                    break label$0;
                                }
                                while (false);
                                this._storeInt((_32_ + 44), -2147483648);
                                break label$0;
                            }
                            while (false);
                            this._storeInt((_32_ + 44), 1078530011);
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_32_ + 44), -1068953637);
                        break label$0;
                    }
                    while (false);
                    this._storeFloat((_32_ + 44), (3.1415927f - ((this._loadFloat((_32_ + 32))) + 8.742278E-8f)));
                    break label$0;
                }
                while (false);
                this._storeFloat((_32_ + 44), (-(this._loadFloat((_32_ + 32)))));
                break label$0;
            }
            while (false);
            this._storeFloat((_32_ + 44), (((this._loadFloat((_32_ + 32))) + 8.742278E-8f) + -3.1415927f));
        }
        while (false);
        _31_ = this._loadFloat((_32_ + 44));
        this._storeInt((0 + 4), (_32_ + 48));
        return _31_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$16(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$17(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final void atan2l(int _30_, long _31_, long _32_, long _33_, long _34_)
    {
        int _35_ = 0;
        double _36_ = 0.0;
        this._storeLong(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), _31_);
        this._storeLong((_35_ + 40), _32_);
        this._storeLong((_35_ + 24), _34_);
        _36_ = this.__trunctfdf2.invoke((this._storeLong((_35_ + 16), _33_)), _34_);
        this.__extenddftf2.invoke(_35_, (atan2((this.__trunctfdf2.invoke((this._loadLong((_35_ + 32))), (this._loadLong((_35_ + 40))))), _36_)));
        this._storeLong((_30_ + 8), (this._loadLong((_35_ + 8))));
        this._storeLong(_30_, (this._loadLong(_35_)));
        this._storeInt((0 + 4), (_35_ + 48));
        return;
    }

    @Override()
    public final float atanf(float _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 8), (this._storeFloat((_31_ + 40), _30_)));
        this._storeInt((_31_ + 16), ((this._storeInt((_31_ + 20), (this._loadInt((_31_ + 8))))) >>> 31));
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
                                                if (((this._storeInt((_31_ + 20), ((this._loadInt((_31_ + 20))) & 2147483647))) & 4294967295L) < (1283457024 & 4294967295L)) {
                                                    break label$9;
                                                }
                                                if ((((__FLOAT_BITS$2e$20((this._loadFloat((_31_ + 40))))) & 2147483647) & 4294967295L) < (2139095041 & 4294967295L)) {
                                                    break label$8;
                                                }
                                                this._storeFloat((_31_ + 44), (this._loadFloat((_31_ + 40))));
                                                break label$0;
                                            }
                                            while (false);
                                            if (((this._loadInt((_31_ + 20))) & 4294967295L) > (1054867455 & 4294967295L)) {
                                                break label$7;
                                            }
                                            if (((this._loadInt((_31_ + 20))) & 4294967295L) > (964689919 & 4294967295L)) {
                                                break label$6;
                                            }
                                            label$10:
                                            do {
                                                if (((this._loadInt((_31_ + 20))) & 4294967295L) > (8388607 & 4294967295L)) {
                                                    break label$10;
                                                }
                                                this._storeFloat((_31_ + 4), ((_30_ = this._loadFloat((_31_ + 40))) * _30_));
                                            }
                                            while (false);
                                            this._storeFloat((_31_ + 44), (this._loadFloat((_31_ + 40))));
                                            break label$0;
                                        }
                                        while (false);
                                        this._storeFloat((_31_ + 24), ((this._loadFloat((0 + 4764))) + 7.523164E-37f));
                                        if ((this._loadInt((_31_ + 16))) == 0) {
                                            break label$4;
                                        }
                                        this._storeFloat((_31_ + 44), (-(this._loadFloat((_31_ + 24)))));
                                        break label$0;
                                    }
                                    while (false);
                                    this._storeFloat((_31_ + 40), (Math.abs((this._loadFloat((_31_ + 40))))));
                                    if (((this._loadInt((_31_ + 20))) & 4294967295L) > (1066926079 & 4294967295L)) {
                                        break label$5;
                                    }
                                    if (((this._loadInt((_31_ + 20))) & 4294967295L) > (1060110335 & 4294967295L)) {
                                        break label$3;
                                    }
                                    this._storeInt((_31_ + 12), 0);
                                    this._storeFloat((_31_ + 40), ((((_30_ = this._loadFloat((_31_ + 40))) + _30_) + -1.0f) / (_30_ + 2.0f)));
                                    break label$1;
                                }
                                while (false);
                                this._storeInt((_31_ + 12), -1);
                                break label$1;
                            }
                            while (false);
                            if (((this._loadInt((_31_ + 20))) & 4294967295L) > (1075576831 & 4294967295L)) {
                                break label$2;
                            }
                            this._storeInt((_31_ + 12), 2);
                            this._storeFloat((_31_ + 40), (((_30_ = this._loadFloat((_31_ + 40))) - 1.5f) / ((_30_ * 1.5f) + 1.0f)));
                            break label$1;
                        }
                        while (false);
                        this._storeFloat((_31_ + 44), (this._loadFloat((_31_ + 24))));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_31_ + 12), 1);
                    this._storeFloat((_31_ + 40), (((_30_ = this._loadFloat((_31_ + 40))) - 1.0f) / (_30_ + 1.0f)));
                    break label$1;
                }
                while (false);
                this._storeInt((_31_ + 12), 3);
                this._storeFloat((_31_ + 40), (-1.0f / (this._loadFloat((_31_ + 40)))));
            }
            while (false);
            _30_ = this._storeFloat((_31_ + 36), ((_30_ = this._storeFloat((_31_ + 24), ((_30_ = this._loadFloat((_31_ + 40))) * _30_))) * _30_));
            this._storeFloat((_31_ + 32), ((this._loadFloat((_31_ + 24))) * ((this._loadFloat((0 + 4768))) + (_30_ * ((this._loadFloat((0 + 4776))) + (_30_ * (this._loadFloat((0 + 4784)))))))));
            this._storeFloat((_31_ + 28), ((_30_ = this._loadFloat((_31_ + 36))) * ((this._loadFloat((0 + 4772))) + (_30_ * (this._loadFloat((0 + 4780)))))));
            label$11:
            do {
                label$12:
                do {
                    label$13:
                    do {
                        if ((this._loadInt((_31_ + 12))) <= -1) {
                            break label$13;
                        }
                        this._storeFloat((_31_ + 24), ((this._loadFloat(((_32_ = (this._loadInt((_31_ + 12))) << 2) + 4752))) - ((((_30_ = this._loadFloat((_31_ + 40))) * ((this._loadFloat((_31_ + 32))) + (this._loadFloat((_31_ + 28))))) - (this._loadFloat((_32_ + 4800)))) - _30_)));
                        if ((this._loadInt((_31_ + 16))) == 0) {
                            break label$12;
                        }
                        _30_ = -(this._loadFloat((_31_ + 24)));
                        break label$11;
                    }
                    while (false);
                    this._storeFloat((_31_ + 44), ((_30_ = this._loadFloat((_31_ + 40))) - (_30_ * ((this._loadFloat((_31_ + 32))) + (this._loadFloat((_31_ + 28)))))));
                    break label$0;
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
    public final int __FLOAT_BITS$2e$20(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$21(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final double atanh(double _30_)
    {
        int _31_ = 0;
        double _32_ = 0.0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), (this._storeDouble((_31_ + 40), _30_)));
        this._storeLong32((_31_ + 28), (((this._loadLong((_31_ + 32))) >>> 52L) & 2047L));
        this._storeLong32((_31_ + 24), ((this._loadLong((_31_ + 32))) >>> 63L));
        this._storeLong((_31_ + 32), ((this._loadLong((_31_ + 32))) & 9223372036854775807L));
        this._storeDouble((_31_ + 16), (this._loadDouble((_31_ + 32))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadInt((_31_ + 28))) & 4294967295L) > (1021 & 4294967295L)) {
                        break label$2;
                    }
                    if (((this._loadInt((_31_ + 28))) & 4294967295L) > (990 & 4294967295L)) {
                        break label$1;
                    }
                    if ((this._loadInt((_31_ + 28))) != 0) {
                        break label$0;
                    }
                    this._storeFloat((_31_ + 12), ((float) (this._loadDouble((_31_ + 16)))));
                    break label$0;
                }
                while (false);
                this._storeDouble((_31_ + 16), ((log1p(((_30_ = (_30_ = this._loadDouble((_31_ + 16))) / (1.0 - _30_)) + _30_))) * 0.5));
                break label$0;
            }
            while (false);
            this._storeDouble((_31_ + 16), ((log1p(((_32_ = (_30_ = this._loadDouble((_31_ + 16))) + _30_) + ((_32_ * _30_) / (1.0 - _30_))))) * 0.5));
        }
        while (false);
        label$3:
        do {
            label$4:
            do {
                if ((this._loadInt((_31_ + 24))) == 0) {
                    break label$4;
                }
                _30_ = -(this._loadDouble((_31_ + 16)));
                break label$3;
            }
            while (false);
            _30_ = this._loadDouble((_31_ + 16));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 48));
        return _30_;
    }

    @Override()
    public final float atanhf(float _30_)
    {
        int _31_ = 0;
        float _32_ = 0.0f;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), (this._storeFloat((_31_ + 28), _30_)));
        this._storeInt((_31_ + 20), ((this._loadInt((_31_ + 24))) >>> 31));
        this._storeInt((_31_ + 24), ((this._loadInt((_31_ + 24))) & 2147483647));
        this._storeFloat((_31_ + 16), (this._loadFloat((_31_ + 24))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadInt((_31_ + 24))) & 4294967295L) > (1056964607 & 4294967295L)) {
                        break label$2;
                    }
                    if (((this._loadInt((_31_ + 24))) & 4294967295L) > (796917759 & 4294967295L)) {
                        break label$1;
                    }
                    if (((this._loadInt((_31_ + 24))) & 4294967295L) > (8388607 & 4294967295L)) {
                        break label$0;
                    }
                    this._storeFloat((_31_ + 12), ((_30_ = this._loadFloat((_31_ + 16))) * _30_));
                    break label$0;
                }
                while (false);
                this._storeFloat((_31_ + 16), ((log1pf(((_30_ = (_30_ = this._loadFloat((_31_ + 16))) / (1.0f - _30_)) + _30_))) * 0.5f));
                break label$0;
            }
            while (false);
            this._storeFloat((_31_ + 16), ((log1pf(((_32_ = (_30_ = this._loadFloat((_31_ + 16))) + _30_) + ((_32_ * _30_) / (1.0f - _30_))))) * 0.5f));
        }
        while (false);
        label$3:
        do {
            label$4:
            do {
                if ((this._loadInt((_31_ + 20))) == 0) {
                    break label$4;
                }
                _30_ = -(this._loadFloat((_31_ + 16)));
                break label$3;
            }
            while (false);
            _30_ = this._loadFloat((_31_ + 16));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final void atanhl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (atanh((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void atanl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (atan((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void __funcs_on_exit()
    {
        int _30_ = 0;
        int _31_ = 0;
        _30_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16));
        this.__lock.invoke(4816);
        label$0:
        while (true) {
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt((0 + 4824))) == 0) {
                        break label$3;
                    }
                    label$4:
                    while (true) {
                        this._storeInt((0 + 4828), ((_31_ = this._loadInt((0 + 4828))) + -1));
                        if (_31_ < 1) {
                            break label$2;
                        }
                        this._storeInt((_30_ + 12), (this._loadInt(((_31_ = (this._loadInt((0 + 4824))) + ((this._loadInt((0 + 4828))) << 2)) + 4))));
                        this._storeInt((_30_ + 8), (this._loadInt((_31_ + 132))));
                        this.__unlock.invoke(4816);
                        this._viTable[this._tableIndices[this._loadInt((_30_ + 12))]].invoke((this._loadInt((_30_ + 8))));
                        this.__lock.invoke(4816);
                        continue label$4;
                    }
                }
                while (false);
                this._storeInt((0 + 4), (_30_ + 16));
                return;
            }
            while (false);
            _31_ = this._loadInt((this._loadInt((0 + 4824))));
            this._storeInt((0 + 4828), 32);
            this._storeInt((0 + 4824), _31_);
            continue label$0;
        }
    }

    @Override()
    public final void __cxa_finalize(int _30_)
    {
        this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_);
        return;
    }

    @Override()
    public final int __cxa_atexit(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        this.__lock.invoke(4816);
        label$0:
        do {
            if ((this._loadInt((0 + 4824))) != 0) {
                break label$0;
            }
            this._storeInt((0 + 4824), 4832);
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt((0 + 4828))) != 32) {
                        break label$3;
                    }
                    if ((this._storeInt((_33_ + 12), (calloc(260, 1)))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_32_ = this._loadInt((_33_ + 12))), (this._loadInt((0 + 4824))));
                    this._storeInt((0 + 4824), _32_);
                    this._storeInt((0 + 4828), 0);
                }
                while (false);
                this._storeInt(((_32_ = (this._loadInt((0 + 4824))) + ((this._loadInt((0 + 4828))) << 2)) + 132), (this._loadInt((_33_ + 20))));
                this._storeInt((_32_ + 4), (this._loadInt((_33_ + 24))));
                this._storeInt((0 + 4828), ((this._loadInt((0 + 4828))) + 1));
                this.__unlock.invoke(4816);
                this._storeInt((_33_ + 28), 0);
                break label$1;
            }
            while (false);
            this.__unlock.invoke(4816);
            this._storeInt((_33_ + 28), -1);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int atexit(int _30_)
    {
        int _31_ = 0;
        _30_ = __cxa_atexit(1, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 0);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void call(int _30_)
    {
        int _31_ = 0;
        this._vTable[this._tableIndices[this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)]].invoke();
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final double atof(int _30_)
    {
        int _31_ = 0;
        double _32_ = 0.0;
        _32_ = strtod((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 0);
        this._storeInt((0 + 4), (_31_ + 16));
        return _32_;
    }

    @Override()
    public final int atoi(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_31_ + 4), (this._storeInt((_31_ + 8), 0)));
        label$1:
        do {
            label$0:
            while (true) {
                if ((__isspace((this._loadInt8s((this._loadInt((_31_ + 12))))))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 12))) + 1));
                continue label$0;
            }
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                if ((_30_ = this._loadInt8s((this._loadInt((_31_ + 12))))) == 43) {
                    break label$3;
                }
                if (_30_ != 45) {
                    break label$2;
                }
                this._storeInt((_31_ + 4), 1);
            }
            while (false);
            this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 12))) + 1));
        }
        while (false);
        label$5:
        do {
            label$4:
            while (true) {
                if ((((this._loadInt8s((this._loadInt((_31_ + 12))))) + -48) & 4294967295L) > (9 & 4294967295L)) {
                    break label$5;
                }
                _30_ = this._loadInt((_31_ + 8));
                this._storeInt((_31_ + 12), ((_32_ = this._loadInt((_31_ + 12))) + 1));
                this._storeInt((_31_ + 8), ((_30_ * 10) - ((this._loadInt8s(_32_)) + -48)));
                continue label$4;
            }
        }
        while (false);
        label$6:
        do {
            label$7:
            do {
                if ((this._loadInt((_31_ + 4))) == 0) {
                    break label$7;
                }
                _30_ = this._loadInt((_31_ + 8));
                break label$6;
            }
            while (false);
            _30_ = 0 - (this._loadInt((_31_ + 8)));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int __isspace(int _30_)
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
    public final int atol(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_31_ + 4), (this._storeInt((_31_ + 8), 0)));
        label$1:
        do {
            label$0:
            while (true) {
                if ((__isspace$2e$26((this._loadInt8s((this._loadInt((_31_ + 12))))))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 12))) + 1));
                continue label$0;
            }
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                if ((_30_ = this._loadInt8s((this._loadInt((_31_ + 12))))) == 43) {
                    break label$3;
                }
                if (_30_ != 45) {
                    break label$2;
                }
                this._storeInt((_31_ + 4), 1);
            }
            while (false);
            this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 12))) + 1));
        }
        while (false);
        label$5:
        do {
            label$4:
            while (true) {
                if ((((this._loadInt8s((this._loadInt((_31_ + 12))))) + -48) & 4294967295L) > (9 & 4294967295L)) {
                    break label$5;
                }
                _30_ = this._loadInt((_31_ + 8));
                this._storeInt((_31_ + 12), ((_32_ = this._loadInt((_31_ + 12))) + 1));
                this._storeInt((_31_ + 8), ((_30_ * 10) - ((this._loadInt8s(_32_)) + -48)));
                continue label$4;
            }
        }
        while (false);
        label$6:
        do {
            label$7:
            do {
                if ((this._loadInt((_31_ + 4))) == 0) {
                    break label$7;
                }
                _30_ = this._loadInt((_31_ + 8));
                break label$6;
            }
            while (false);
            _30_ = 0 - (this._loadInt((_31_ + 8)));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int __isspace$2e$26(int _30_)
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
    public final long atoll(int _30_)
    {
        int _31_ = 0;
        long _32_ = 0L;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeLong((_31_ + 16), 0L);
        this._storeInt((_31_ + 12), 0);
        label$1:
        do {
            label$0:
            while (true) {
                if ((__isspace$2e$27((this._loadInt8s((this._loadInt((_31_ + 28))))))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 28), ((this._loadInt((_31_ + 28))) + 1));
                continue label$0;
            }
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                if ((_30_ = this._loadInt8s((this._loadInt((_31_ + 28))))) == 43) {
                    break label$3;
                }
                if (_30_ != 45) {
                    break label$2;
                }
                this._storeInt((_31_ + 12), 1);
            }
            while (false);
            this._storeInt((_31_ + 28), ((this._loadInt((_31_ + 28))) + 1));
        }
        while (false);
        label$5:
        do {
            label$4:
            while (true) {
                if ((((this._loadInt8s((this._loadInt((_31_ + 28))))) + -48) & 4294967295L) > (9 & 4294967295L)) {
                    break label$5;
                }
                _32_ = this._loadLong((_31_ + 16));
                this._storeInt((_31_ + 28), ((_30_ = this._loadInt((_31_ + 28))) + 1));
                this._storeLong((_31_ + 16), ((_32_ * 10L) - ((long) ((this._loadInt8s(_30_)) + -48))));
                continue label$4;
            }
        }
        while (false);
        label$6:
        do {
            label$7:
            do {
                if ((this._loadInt((_31_ + 12))) == 0) {
                    break label$7;
                }
                _32_ = this._loadLong((_31_ + 16));
                break label$6;
            }
            while (false);
            _32_ = 0L - (this._loadLong((_31_ + 16)));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 32));
        return _32_;
    }
}
