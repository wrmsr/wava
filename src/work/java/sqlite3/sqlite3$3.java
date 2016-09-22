package sqlite3;

abstract class sqlite3$3
        extends sqlite3$2
{
    protected sqlite3$3(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final int ferror(int _30_)
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
        this._storeInt((_31_ + 4), (((this._loadInt((this._loadInt((_31_ + 12))))) & 32) >>> 5));
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

    @Override()
    public final int fflush(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_)) == 0) {
                    break label$1;
                }
                _30_ = 0;
                label$2:
                do {
                    if ((this._loadInt(((this._loadInt((_31_ + 24))) + 76))) < 0) {
                        break label$2;
                    }
                    _30_ = this.__lockfile.invoke((this._loadInt((_31_ + 24))));
                }
                while (false);
                this._storeInt((_31_ + 16), _30_);
                this._storeInt((_31_ + 20), (__fflush_unlocked((this._loadInt((_31_ + 24))))));
                label$3:
                do {
                    if ((this._loadInt((_31_ + 16))) == 0) {
                        break label$3;
                    }
                    this.__unlockfile.invoke((this._loadInt((_31_ + 24))));
                }
                while (false);
                this._storeInt((_31_ + 28), (this._loadInt((_31_ + 20))));
                break label$0;
            }
            while (false);
            _30_ = 0;
            label$4:
            do {
                if ((this._loadInt((0 + 17296))) == 0) {
                    break label$4;
                }
                _30_ = fflush((this._loadInt((0 + 17296))));
            }
            while (false);
            this._storeInt((_31_ + 20), _30_);
            this._storeInt((_31_ + 24), (this._loadInt((__ofl_lock()))));
            label$6:
            do {
                label$5:
                while (true) {
                    if ((this._loadInt((_31_ + 24))) == 0) {
                        break label$6;
                    }
                    _30_ = 0;
                    label$7:
                    do {
                        if ((this._loadInt(((this._loadInt((_31_ + 24))) + 76))) < 0) {
                            break label$7;
                        }
                        _30_ = this.__lockfile.invoke((this._loadInt((_31_ + 24))));
                    }
                    while (false);
                    this._storeInt((_31_ + 12), _30_);
                    label$8:
                    do {
                        if (((this._loadInt(((_30_ = this._loadInt((_31_ + 24))) + 20))) & 4294967295L) <= ((this._loadInt((_30_ + 28))) & 4294967295L)) {
                            break label$8;
                        }
                        this._storeInt((_31_ + 20), ((__fflush_unlocked((this._loadInt((_31_ + 24))))) | (this._loadInt((_31_ + 20)))));
                    }
                    while (false);
                    label$9:
                    do {
                        if ((this._loadInt((_31_ + 12))) == 0) {
                            break label$9;
                        }
                        this.__unlockfile.invoke((this._loadInt((_31_ + 24))));
                    }
                    while (false);
                    this._storeInt((_31_ + 24), (this._loadInt(((this._loadInt((_31_ + 24))) + 56))));
                    continue label$5;
                }
            }
            while (false);
            __ofl_unlock();
            this._storeInt((_31_ + 28), (this._loadInt((_31_ + 20))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 28));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final int __fflush_unlocked(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadInt(((_30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)) + 20))) & 4294967295L) <= ((this._loadInt((_30_ + 28))) & 4294967295L)) {
                        break label$2;
                    }
                    this._iiiiTable[this._tableIndices[this._loadInt(((_30_ = this._loadInt((_31_ + 8))) + 36))]].invoke(_30_, 0, 0);
                    if ((this._loadInt(((this._loadInt((_31_ + 8))) + 20))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                label$3:
                do {
                    if (((this._loadInt(((_30_ = this._loadInt((_31_ + 8))) + 4))) & 4294967295L) >= ((this._loadInt((_30_ + 8))) & 4294967295L)) {
                        break label$3;
                    }
                    this._liliTable[this._tableIndices[this._loadInt(((_30_ = this._loadInt((_31_ + 8))) + 40))]].invoke(_30_, ((long) ((this._loadInt((_30_ + 4))) - (this._loadInt((_30_ + 8))))), 1);
                }
                while (false);
                this._storeLong(((_30_ = this._loadInt((_31_ + 8))) + 16), 0L);
                _30_ = this._storeInt((_30_ + 8), (this._storeInt((_30_ + 28), 0)));
                this._storeInt((_31_ + 12), (this._storeInt(((this._loadInt((_31_ + 8))) + 4), _30_)));
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
    public final int fgetc(int _30_)
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
                        if ((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)) + 76))) < 0) {
                            break label$3;
                        }
                        if ((this.__lockfile.invoke((this._loadInt((_31_ + 8))))) == 0) {
                            break label$3;
                        }
                        if (((this._loadInt(((_30_ = this._loadInt((_31_ + 8))) + 4))) & 4294967295L) >= ((this._loadInt((_30_ + 8))) & 4294967295L)) {
                            break label$2;
                        }
                        this._storeInt(((_30_ = this._loadInt((_31_ + 8))) + 4), ((_30_ = this._loadInt((_30_ + 4))) + 1));
                        _30_ = this._loadInt8u(_30_);
                        break label$1;
                    }
                    while (false);
                    label$4:
                    do {
                        if (((this._loadInt(((_30_ = this._loadInt((_31_ + 8))) + 4))) & 4294967295L) >= ((this._loadInt((_30_ + 8))) & 4294967295L)) {
                            break label$4;
                        }
                        this._storeInt(((_30_ = this._loadInt((_31_ + 8))) + 4), ((_30_ = this._loadInt((_30_ + 4))) + 1));
                        this._storeInt((_31_ + 12), (this._loadInt8u(_30_)));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_31_ + 12), (__uflow((this._loadInt((_31_ + 8))))));
                    break label$0;
                }
                while (false);
                _30_ = __uflow((this._loadInt((_31_ + 8))));
            }
            while (false);
            this._storeInt((_31_ + 4), _30_);
            this.__unlockfile.invoke((this._loadInt((_31_ + 8))));
            this._storeInt((_31_ + 12), (this._loadInt((_31_ + 4))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int fgetln(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        _31_ = 0;
        _30_ = this._storeInt((_32_ + 20), 0);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_32_ + 28))) + 76))) < _30_) {
                break label$0;
            }
            _31_ = this.__lockfile.invoke((this._loadInt((_32_ + 28))));
        }
        while (false);
        this._storeInt((_32_ + 8), _31_);
        label$1:
        do {
            label$2:
            do {
                if (((this._loadInt(((_31_ = this._loadInt((_32_ + 28))) + 4))) & 4294967295L) >= ((this._loadInt((_31_ + 8))) & 4294967295L)) {
                    break label$2;
                }
                this._storeInt(((_31_ = this._loadInt((_32_ + 28))) + 4), ((_31_ = this._loadInt((_31_ + 4))) + 1));
                _31_ = this._loadInt8u(_31_);
                break label$1;
            }
            while (false);
            _31_ = __uflow((this._loadInt((_32_ + 28))));
        }
        while (false);
        ungetc(_31_, (this._loadInt((_32_ + 28))));
        label$3:
        do {
            label$4:
            do {
                if ((this._storeInt((_32_ + 16), (memchr((_30_ = this._loadInt(((_31_ = this._loadInt((_32_ + 28))) + 4))), 10, ((this._loadInt((_31_ + 8))) - _30_))))) == 0) {
                    break label$4;
                }
                this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 28))) + 4))));
                _31_ = this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                this._storeInt((this._loadInt((_32_ + 24))), (_31_ - (this._loadInt((_32_ + 20)))));
                this._storeInt(((this._loadInt((_32_ + 28))) + 4), _31_);
                break label$3;
            }
            while (false);
            _31_ = this._loadInt((_32_ + 28));
            this._storeInt((_32_ + 4), 0);
            if ((this._storeInt((_32_ + 12), (getline((_31_ + 96), (_32_ + 4), (this._loadInt((_32_ + 28))))))) < 1) {
                break label$3;
            }
            this._storeInt((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 12))));
            this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 28))) + 96))));
        }
        while (false);
        label$5:
        do {
            if ((this._loadInt((_32_ + 8))) == 0) {
                break label$5;
            }
            this.__unlockfile.invoke((this._loadInt((_32_ + 28))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 20));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int fgetpos(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeLong((_32_ + 8), (__ftello((this._loadInt((_32_ + 24))))))) <= -1L) {
                    break label$1;
                }
                this._storeLong((this._loadInt((_32_ + 20))), (this._loadLong((_32_ + 8))));
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 28), -1);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int fgets(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_33_ + 36), _31_);
        this._storeInt((_33_ + 32), _32_);
        this._storeInt((_33_ + 28), (this._loadInt((_33_ + 40))));
        _32_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_33_ + 32))) + 76))) < 0) {
                break label$0;
            }
            _32_ = this.__lockfile.invoke((this._loadInt((_33_ + 32))));
        }
        while (false);
        this._storeInt((_33_ + 12), _32_);
        this._storeInt((_33_ + 36), ((_32_ = this._loadInt((_33_ + 36))) + -1));
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
                            if (_32_ > 1) {
                                break label$5;
                            }
                            this._storeInt8(((_32_ = this._loadInt((_33_ + 32))) + 74), ((_32_ = this._loadInt8s((_32_ + 74))) | (_32_ + -1)));
                            label$6:
                            do {
                                if ((this._loadInt((_33_ + 12))) == 0) {
                                    break label$6;
                                }
                                this.__unlockfile.invoke((this._loadInt((_33_ + 32))));
                            }
                            while (false);
                            if ((this._loadInt((_33_ + 36))) == 0) {
                                break label$4;
                            }
                            this._storeInt((_33_ + 44), 0);
                            break label$1;
                        }
                        while (false);
                        label$7:
                        while (true) {
                            if ((this._loadInt((_33_ + 36))) == 0) {
                                break label$2;
                            }
                            label$9:
                            do {
                                label$10:
                                do {
                                    if ((this._storeInt((_33_ + 24), (memchr((_31_ = this._loadInt(((_32_ = this._loadInt((_33_ + 32))) + 4))), 10, ((this._loadInt((_32_ + 8))) - _31_))))) == 0) {
                                        break label$10;
                                    }
                                    _32_ = ((this._loadInt((_33_ + 24))) - (this._loadInt(((this._loadInt((_33_ + 32))) + 4)))) + 1;
                                    break label$9;
                                }
                                while (false);
                                _32_ = (this._loadInt(((_32_ = this._loadInt((_33_ + 32))) + 8))) - (this._loadInt((_32_ + 4)));
                            }
                            while (false);
                            label$11:
                            do {
                                label$12:
                                do {
                                    if (((this._storeInt((_33_ + 20), _32_)) & 4294967295L) >= ((this._loadInt((_33_ + 36))) & 4294967295L)) {
                                        break label$12;
                                    }
                                    _32_ = this._loadInt((_33_ + 20));
                                    break label$11;
                                }
                                while (false);
                                _32_ = this._loadInt((_33_ + 36));
                            }
                            while (false);
                            this._storeInt((_33_ + 20), _32_);
                            memcpy((this._loadInt((_33_ + 28))), (this._loadInt(((this._loadInt((_33_ + 32))) + 4))), _32_);
                            this._storeInt(((_32_ = this._loadInt((_33_ + 32))) + 4), ((this._loadInt((_32_ + 4))) + (_32_ = this._loadInt((_33_ + 20)))));
                            this._storeInt((_33_ + 28), (_32_ + (this._loadInt((_33_ + 28)))));
                            this._storeInt((_33_ + 36), ((this._loadInt((_33_ + 36))) - (this._loadInt((_33_ + 20)))));
                            if ((this._loadInt((_33_ + 24))) != 0) {
                                break label$2;
                            }
                            if ((this._loadInt((_33_ + 36))) == 0) {
                                break label$2;
                            }
                            label$13:
                            do {
                                label$14:
                                do {
                                    if (((this._loadInt(((_32_ = this._loadInt((_33_ + 32))) + 4))) & 4294967295L) >= ((this._loadInt((_32_ + 8))) & 4294967295L)) {
                                        break label$14;
                                    }
                                    this._storeInt(((_32_ = this._loadInt((_33_ + 32))) + 4), ((_32_ = this._loadInt((_32_ + 4))) + 1));
                                    _32_ = this._loadInt8u(_32_);
                                    break label$13;
                                }
                                while (false);
                                _32_ = __uflow((this._loadInt((_33_ + 32))));
                            }
                            while (false);
                            if ((this._storeInt((_33_ + 16), _32_)) <= -1) {
                                break label$3;
                            }
                            this._storeInt((_33_ + 36), ((this._loadInt((_33_ + 36))) + -1));
                            _31_ = this._storeInt8((_32_ = this._loadInt((_33_ + 28))), (this._loadInt8u((_33_ + 16))));
                            this._storeInt((_33_ + 28), (_32_ + 1));
                            if (_31_ != 10) {
                                continue label$7;
                            }
                            break label$2;
                        }
                    }
                    while (false);
                    this._storeInt8((_32_ = this._loadInt((_33_ + 40))), 0);
                    this._storeInt((_33_ + 44), _32_);
                    break label$1;
                }
                while (false);
                label$15:
                do {
                    if ((this._loadInt((_33_ + 28))) == (this._loadInt((_33_ + 40)))) {
                        break label$15;
                    }
                    if (((this._loadInt8u((this._loadInt((_33_ + 32))))) & 16) != 0) {
                        break label$2;
                    }
                }
                while (false);
                this._storeInt((_33_ + 40), 0);
            }
            while (false);
            label$16:
            do {
                if ((this._loadInt((_33_ + 40))) == 0) {
                    break label$16;
                }
                this._storeInt8((this._loadInt((_33_ + 28))), 0);
            }
            while (false);
            label$17:
            do {
                if ((this._loadInt((_33_ + 12))) == 0) {
                    break label$17;
                }
                this.__unlockfile.invoke((this._loadInt((_33_ + 32))));
            }
            while (false);
            this._storeInt((_33_ + 44), (this._loadInt((_33_ + 40))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 44));
        this._storeInt((0 + 4), (_33_ + 48));
        return _32_;
    }

    @Override()
    public final int fileno(int _30_)
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
        label$1:
        do {
            if ((this._storeInt((_31_ + 8), _32_)) == 0) {
                break label$1;
            }
            this.__unlockfile.invoke((this._loadInt((_31_ + 12))));
        }
        while (false);
        _32_ = this._loadInt(((this._loadInt((_31_ + 12))) + 60));
        this._storeInt((0 + 4), (_31_ + 16));
        return _32_;
    }

    @Override()
    public final int finite(double _30_)
    {
        int _31_ = 0;
        long _32_ = 0L;
        _32_ = __DOUBLE_BITS$2e$66((this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return ((((_32_ & 9223372036854775807L) & 4294967295L) < (9218868437227405312L & 4294967295L)) ? 1 : 0);
    }

    @Override()
    public final long __DOUBLE_BITS$2e$66(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final int finitef(float _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _32_ = __FLOAT_BITS$2e$67((this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)));
        this._storeInt((0 + 4), (_31_ + 16));
        return ((((_32_ & 2147483647) & 4294967295L) < (2139095040 & 4294967295L)) ? 1 : 0);
    }

    @Override()
    public final int __FLOAT_BITS$2e$67(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final double floor(double _30_)
    {
        int _31_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        double _temp$3 = 0.0;
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
            _temp$0 = -1;
            _temp$1 = 0;
            _temp$2 = (((this._loadLong((_31_ + 24))) >>> 63L) != 0L) ? _temp$0 : _temp$1;
            _temp$3 = (double) _temp$2;
            this._storeDouble((_31_ + 40), _temp$3);
            return (this._loadDouble((_31_ + 40)));
        }
        while (false);
        label$5:
        do {
            if (((((_30_ = this._loadDouble((_31_ + 8))) <= 0.0) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                break label$5;
            }
            this._storeDouble((_31_ + 40), (((this._loadDouble((_31_ + 32))) + (this._loadDouble((_31_ + 8)))) + -1.0));
            return (this._loadDouble((_31_ + 40)));
        }
        while (false);
        this._storeDouble((_31_ + 40), ((this._loadDouble((_31_ + 32))) + (this._loadDouble((_31_ + 8)))));
        return (this._loadDouble((_31_ + 40)));
    }

    @Override()
    public final float floorf(float _30_)
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
                            if (((this._loadInt((_31_ + 16))) >>> 31) == 0) {
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
                    if (((this._loadInt((_31_ + 16))) << 1) == 0) {
                        break label$1;
                    }
                    this._storeInt((_31_ + 16), -1082130432);
                    break label$1;
                }
                while (false);
                this._storeFloat((_31_ + 28), (this._loadFloat((_31_ + 24))));
                return (this._loadFloat((_31_ + 28)));
            }
            while (false);
            this._storeInt((_31_ + 16), 0);
        }
        while (false);
        this._storeFloat((_31_ + 28), (this._loadFloat((_31_ + 16))));
        return (this._loadFloat((_31_ + 28)));
    }

    @Override()
    public final void floorl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (Math.floor((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final double fma(double _30_, double _31_, double _32_)
    {
        int _33_ = 0;
        int _34_ = 0;
        this._storeDouble(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 176))) + 160), _30_);
        this._storeDouble((_33_ + 152), _31_);
        this._storeDouble((_33_ + 144), _32_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((((__DOUBLE_BITS$2e$69((this._loadDouble((_33_ + 160))))) & 9223372036854775807L) & 4294967295L) > (9218868437227405311L & 4294967295L)) {
                            break label$3;
                        }
                        if ((((__DOUBLE_BITS$2e$69((this._loadDouble((_33_ + 152))))) & 9223372036854775807L) & 4294967295L) >= (9218868437227405312L & 4294967295L)) {
                            break label$3;
                        }
                        if ((((__DOUBLE_BITS$2e$69((this._loadDouble((_33_ + 144))))) & 9223372036854775807L) & 4294967295L) >= (9218868437227405312L & 4294967295L)) {
                            break label$2;
                        }
                        label$4:
                        do {
                            if ((this._loadDouble((_33_ + 160))) == 0.0) {
                                break label$4;
                            }
                            if ((this._loadDouble((_33_ + 152))) != 0.0) {
                                break label$1;
                            }
                        }
                        while (false);
                        this._storeDouble((_33_ + 168), (((this._loadDouble((_33_ + 160))) * (this._loadDouble((_33_ + 152)))) + (this._loadDouble((_33_ + 144)))));
                        break label$0;
                    }
                    while (false);
                    this._storeDouble((_33_ + 168), (((this._loadDouble((_33_ + 160))) * (this._loadDouble((_33_ + 152)))) + (this._loadDouble((_33_ + 144)))));
                    break label$0;
                }
                while (false);
                this._storeDouble((_33_ + 168), (this._loadDouble((_33_ + 144))));
                break label$0;
            }
            while (false);
            label$5:
            do {
                if ((this._loadDouble((_33_ + 144))) != 0.0) {
                    break label$5;
                }
                this._storeDouble((_33_ + 168), ((this._loadDouble((_33_ + 160))) * (this._loadDouble((_33_ + 152)))));
                break label$0;
            }
            while (false);
            this._storeDouble((_33_ + 136), (frexp((this._loadDouble((_33_ + 160))), (_33_ + 72))));
            this._storeDouble((_33_ + 128), (frexp((this._loadDouble((_33_ + 152))), (_33_ + 68))));
            this._storeDouble((_33_ + 120), (frexp((this._loadDouble((_33_ + 144))), (_33_ + 64))));
            this._storeInt((_33_ + 76), (this.fegetround.invoke()));
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
                                                        if ((this._storeInt((_33_ + 60), (((this._loadInt((_33_ + 72))) + (this._loadInt((_33_ + 68)))) - (this._loadInt((_33_ + 64)))))) > -54) {
                                                            break label$16;
                                                        }
                                                        this.feraiseexcept.invoke(32);
                                                        label$17:
                                                        do {
                                                            if (((((__DOUBLE_BITS$2e$69((this._loadDouble((_33_ + 144))))) + 4503599627370496L) & 9223372036854775807L) & 4294967295L) > (9007199254740991L & 4294967295L)) {
                                                                break label$17;
                                                            }
                                                            this.feraiseexcept.invoke(16);
                                                        }
                                                        while (false);
                                                        if ((_34_ = this._loadInt((_33_ + 76))) == 1024) {
                                                            break label$15;
                                                        }
                                                        if (_34_ == 2048) {
                                                            break label$14;
                                                        }
                                                        if (_34_ != 3072) {
                                                            break label$13;
                                                        }
                                                        if ((((((this._loadDouble((_33_ + 160))) > 0.0) ? 1 : 0) ^ (((this._loadDouble((_33_ + 152))) < 0.0) ? 1 : 0)) ^ (((this._loadDouble((_33_ + 144))) < 0.0) ? 1 : 0)) != 1) {
                                                            break label$9;
                                                        }
                                                        this._storeDouble((_33_ + 168), (this._loadDouble((_33_ + 144))));
                                                        break label$0;
                                                    }
                                                    while (false);
                                                    label$18:
                                                    do {
                                                        label$19:
                                                        do {
                                                            if ((this._loadInt((_33_ + 60))) > 106) {
                                                                break label$19;
                                                            }
                                                            this._storeDouble((_33_ + 120), (scalbn((this._loadDouble((_33_ + 120))), (0 - (this._loadInt((_33_ + 60)))))));
                                                            break label$18;
                                                        }
                                                        while (false);
                                                        this._storeDouble((_33_ + 120), (Double.longBitsToDouble((((Double.doubleToRawLongBits(2.2250738585072014E-308)) & 9223372036854775807L) | ((Double.doubleToRawLongBits((this._loadDouble((_33_ + 120))))) & -9223372036854775808L)))));
                                                    }
                                                    while (false);
                                                    this.fesetround.invoke(0);
                                                    dd_mul((_33_ + 40), (this._loadDouble((_33_ + 136))), (this._loadDouble((_33_ + 128))));
                                                    this._storeLong(((_33_ + 96) + 8), (this._loadLong(((_33_ + 40) + 8))));
                                                    this._storeLong((_33_ + 96), (this._loadLong((_33_ + 40))));
                                                    dd_add((_33_ + 24), (this._loadDouble((_33_ + 96))), (this._loadDouble((_33_ + 120))));
                                                    this._storeLong(((_33_ + 80) + 8), (this._loadLong(((_33_ + 24) + 8))));
                                                    this._storeLong((_33_ + 80), (this._loadLong((_33_ + 24))));
                                                    this._storeInt((_33_ + 60), ((this._loadInt((_33_ + 72))) + (this._loadInt((_33_ + 68)))));
                                                    label$20:
                                                    do {
                                                        if ((this._loadDouble((_33_ + 80))) != 0.0) {
                                                            break label$20;
                                                        }
                                                        this.fesetround.invoke((this._loadInt((_33_ + 76))));
                                                        this._storeDouble((_33_ + 16), (this._loadDouble((_33_ + 120))));
                                                        this._storeDouble((_33_ + 168), (((this._loadDouble((_33_ + 96))) + (this._loadDouble((_33_ + 16)))) + (scalbn((this._loadDouble((_33_ + 104))), (this._loadInt((_33_ + 60)))))));
                                                        break label$0;
                                                    }
                                                    while (false);
                                                    if ((this._loadInt((_33_ + 76))) == 0) {
                                                        break label$10;
                                                    }
                                                    this._storeInt((_33_ + 4), (this.fetestexcept.invoke(32)));
                                                    this.feclearexcept.invoke(32);
                                                    this.fesetround.invoke((this._loadInt((_33_ + 76))));
                                                    if ((ilogb((this._storeDouble((_33_ + 8), (scalbn(((this._storeDouble((_33_ + 112), ((this._loadDouble((_33_ + 88))) + (this._loadDouble((_33_ + 104)))))) + (this._loadDouble((_33_ + 80)))), (this._loadInt((_33_ + 60))))))))) > -1023) {
                                                        break label$12;
                                                    }
                                                    if ((this.fetestexcept.invoke(32)) == 0) {
                                                        break label$12;
                                                    }
                                                    this.feraiseexcept.invoke(16);
                                                    break label$11;
                                                }
                                                while (false);
                                                if ((((this._loadDouble((_33_ + 160))) > 0.0) ? 1 : 0) == (((this._loadDouble((_33_ + 152))) < 0.0) ? 1 : 0)) {
                                                    break label$8;
                                                }
                                                this._storeDouble((_33_ + 168), (this._loadDouble((_33_ + 144))));
                                                break label$0;
                                            }
                                            while (false);
                                            if ((((this._loadDouble((_33_ + 160))) > 0.0) ? 1 : 0) == (((this._loadDouble((_33_ + 152))) < 0.0) ? 1 : 0)) {
                                                break label$7;
                                            }
                                            this._storeDouble((_33_ + 168), (nextafter((this._loadDouble((_33_ + 144))), Double.POSITIVE_INFINITY)));
                                            break label$0;
                                        }
                                        while (false);
                                        this._storeDouble((_33_ + 168), (this._loadDouble((_33_ + 144))));
                                        break label$0;
                                    }
                                    while (false);
                                    if ((this._loadInt((_33_ + 4))) == 0) {
                                        break label$11;
                                    }
                                    this.feraiseexcept.invoke(32);
                                }
                                while (false);
                                this._storeDouble((_33_ + 168), (this._loadDouble((_33_ + 8))));
                                break label$0;
                            }
                            while (false);
                            this._storeDouble((_33_ + 112), (add_adjusted((this._loadDouble((_33_ + 88))), (this._loadDouble((_33_ + 104))))));
                            if (((this._loadInt((_33_ + 60))) + (ilogb((this._loadDouble((_33_ + 80)))))) < -1022) {
                                break label$6;
                            }
                            this._storeDouble((_33_ + 168), (scalbn(((this._loadDouble((_33_ + 80))) + (this._loadDouble((_33_ + 112)))), (this._loadInt((_33_ + 60))))));
                            break label$0;
                        }
                        while (false);
                        this._storeDouble((_33_ + 168), (nextafter((this._loadDouble((_33_ + 144))), 0.0)));
                        break label$0;
                    }
                    while (false);
                    this._storeDouble((_33_ + 168), (nextafter((this._loadDouble((_33_ + 144))), Double.NEGATIVE_INFINITY)));
                    break label$0;
                }
                while (false);
                this._storeDouble((_33_ + 168), (this._loadDouble((_33_ + 144))));
                break label$0;
            }
            while (false);
            this._storeDouble((_33_ + 168), (add_and_denormalize((this._loadDouble((_33_ + 80))), (this._loadDouble((_33_ + 112))), (this._loadInt((_33_ + 60))))));
        }
        while (false);
        _32_ = this._loadDouble((_33_ + 168));
        this._storeInt((0 + 4), (_33_ + 176));
        return _32_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$68(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$69(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final void dd_mul(int _30_, double _31_, double _32_)
    {
        int _33_ = 0;
        this._storeDouble(((_33_ = (this._loadInt((0 + 4))) - 80) + 72), _31_);
        this._storeDouble((_33_ + 64), _32_);
        _32_ = this._storeDouble((_33_ + 8), ((this._loadDouble((_33_ + 72))) * 1.34217729E8));
        _32_ = this._storeDouble((_33_ + 40), ((this._storeDouble((_33_ + 40), ((this._loadDouble((_33_ + 72))) - _32_))) + (this._loadDouble((_33_ + 8)))));
        this._storeDouble((_33_ + 24), ((this._loadDouble((_33_ + 72))) - _32_));
        _32_ = this._storeDouble((_33_ + 8), ((this._loadDouble((_33_ + 64))) * 1.34217729E8));
        _32_ = this._storeDouble((_33_ + 32), ((this._storeDouble((_33_ + 32), ((this._loadDouble((_33_ + 64))) - _32_))) + (this._loadDouble((_33_ + 8)))));
        this._storeDouble((_33_ + 16), ((this._loadDouble((_33_ + 64))) - _32_));
        this._storeDouble((_33_ + 8), ((this._loadDouble((_33_ + 40))) * (this._loadDouble((_33_ + 32)))));
        _32_ = this._storeDouble((_33_ + 48), ((this._storeDouble(_33_, (((this._loadDouble((_33_ + 40))) * (this._loadDouble((_33_ + 16)))) + ((this._loadDouble((_33_ + 24))) * (this._loadDouble((_33_ + 32))))))) + (this._loadDouble((_33_ + 8)))));
        this._storeDouble((_33_ + 56), ((((this._loadDouble((_33_ + 8))) - _32_) + (this._loadDouble(_33_))) + ((this._loadDouble((_33_ + 24))) * (this._loadDouble((_33_ + 16))))));
        this._storeLong(_30_, (this._loadLong((_33_ + 48))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 56))));
        return;
    }

    @Override()
    public final void dd_add(int _30_, double _31_, double _32_)
    {
        int _33_ = 0;
        this._storeDouble(((_33_ = (this._loadInt((0 + 4))) - 48) + 40), _31_);
        _32_ = this._storeDouble((_33_ + 8), ((this._storeDouble((_33_ + 16), ((this._storeDouble((_33_ + 32), _32_)) + (this._loadDouble((_33_ + 40)))))) - (this._loadDouble((_33_ + 40)))));
        this._storeDouble((_33_ + 24), (((this._loadDouble((_33_ + 40))) - ((this._loadDouble((_33_ + 16))) - _32_)) + ((this._loadDouble((_33_ + 32))) - _32_)));
        this._storeLong(_30_, (this._loadLong((_33_ + 16))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 24))));
        return;
    }

    @Override()
    public final double add_adjusted(double _30_, double _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        long _34_ = 0L;
        this._storeDouble(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeDouble((_32_ + 48), _31_);
        dd_add(_32_, (this._loadDouble((_32_ + 56))), _31_);
        this._storeLong((_33_ = (_32_ + 32) + 8), (this._loadLong((_32_ + 8))));
        this._storeLong((_32_ + 32), (this._loadLong(_32_)));
        label$0:
        do {
            if ((this._loadDouble(_33_)) == 0.0) {
                break label$0;
            }
            this._storeDouble((_32_ + 24), (this._loadDouble((_32_ + 32))));
            if (((this._loadInt8u((_32_ + 24))) & 1) != 0) {
                break label$0;
            }
            this._storeDouble((_32_ + 16), (this._loadDouble((_32_ + 40))));
            this._storeLong((_32_ + 24), ((_34_ = this._loadLong((_32_ + 24))) + (1L - ((_34_ ^ (this._loadLong((_32_ + 16)))) >>> 62L))));
            this._storeDouble((_32_ + 32), (this._loadDouble((_32_ + 24))));
        }
        while (false);
        _31_ = this._loadDouble((_32_ + 32));
        this._storeInt((0 + 4), (_32_ + 64));
        return _31_;
    }

    @Override()
    public final double add_and_denormalize(double _30_, double _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        this._storeDouble(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 72), _30_);
        this._storeDouble((_33_ + 64), _31_);
        this._storeInt((_33_ + 60), _32_);
        dd_add(_33_, (this._loadDouble((_33_ + 72))), (this._loadDouble((_33_ + 64))));
        this._storeLong((_32_ = (_33_ + 40) + 8), (this._loadLong((_33_ + 8))));
        this._storeLong((_33_ + 40), (this._loadLong(_33_)));
        label$0:
        do {
            if ((this._loadDouble(_32_)) == 0.0) {
                break label$0;
            }
            this._storeDouble((_33_ + 32), (this._loadDouble((_33_ + 40))));
            if (((((this._storeInt((_33_ + 20), (((0 - (((int) ((this._loadLong((_33_ + 32))) >>> 52L)) & 2047)) - (this._loadInt((_33_ + 60)))) + 1))) != 1) ? 1 : 0) ^ ((int) ((this._loadLong((_33_ + 32))) & 1L))) == 0) {
                break label$0;
            }
            this._storeDouble((_33_ + 24), (this._loadDouble((_33_ + 48))));
            this._storeLong((_33_ + 32), ((_34_ = this._loadLong((_33_ + 32))) + (1L - (((_34_ ^ (this._loadLong((_33_ + 24)))) >>> 62L) & 2L))));
            this._storeDouble((_33_ + 40), (this._loadDouble((_33_ + 32))));
        }
        while (false);
        _31_ = scalbn((this._loadDouble((_33_ + 40))), (this._loadInt((_33_ + 60))));
        this._storeInt((0 + 4), (_33_ + 80));
        return _31_;
    }

    @Override()
    public final float fmaf(float _30_, float _31_, float _32_)
    {
        int _33_ = 0;
        this._storeFloat(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeFloat((_33_ + 52), _31_);
        this._storeFloat((_33_ + 48), _32_);
        this._storeDouble((_33_ + 24), (this._storeDouble((_33_ + 32), ((this._storeDouble((_33_ + 40), (((double) (this._loadFloat((_33_ + 56)))) * ((double) (this._loadFloat((_33_ + 52))))))) + ((double) (this._loadFloat((_33_ + 48))))))));
        this._storeLong32((_33_ + 20), (((this._loadLong((_33_ + 24))) >>> 52L) & 2047L));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadLong((_33_ + 24))) & 536870911L) != 268435456L) {
                        break label$2;
                    }
                    if ((this._loadInt((_33_ + 20))) == 2047) {
                        break label$2;
                    }
                    if (((this._loadDouble((_33_ + 32))) - (this._loadDouble((_33_ + 40)))) == ((double) (this._loadFloat((_33_ + 48))))) {
                        break label$2;
                    }
                    if ((this.fegetround.invoke()) == 0) {
                        break label$1;
                    }
                }
                while (false);
                label$3:
                do {
                    if ((this._loadInt((_33_ + 20))) > 896) {
                        break label$3;
                    }
                    if ((this._loadInt((_33_ + 20))) < 874) {
                        break label$3;
                    }
                    if ((this.fetestexcept.invoke(32)) == 0) {
                        break label$3;
                    }
                    this.feclearexcept.invoke(32);
                    this._storeFloat((_33_ + 16), (this._loadFloat((_33_ + 48))));
                    this._storeDouble((_33_ + 32), ((this._loadDouble((_33_ + 40))) + ((double) (this._loadFloat((_33_ + 16))))));
                    label$4:
                    do {
                        if ((this.fetestexcept.invoke(32)) == 0) {
                            break label$4;
                        }
                        this.feraiseexcept.invoke(16);
                        break label$3;
                    }
                    while (false);
                    this.feraiseexcept.invoke(32);
                }
                while (false);
                this._storeFloat((_33_ + 60), (this._storeFloat((_33_ + 48), ((float) (this._loadDouble((_33_ + 32)))))));
                break label$0;
            }
            while (false);
            this.fesetround.invoke(3072);
            this._storeDouble((_33_ + 8), (this._loadDouble((_33_ + 40))));
            this._storeDouble(_33_, ((this._loadDouble((_33_ + 8))) + ((double) (this._loadFloat((_33_ + 48))))));
            this.fesetround.invoke(0);
            label$5:
            do {
                if ((this._loadDouble((_33_ + 32))) != (this._loadDouble(_33_))) {
                    break label$5;
                }
                this._storeDouble((_33_ + 24), (this._loadDouble(_33_)));
                this._storeLong((_33_ + 24), ((this._loadLong((_33_ + 24))) + 1L));
                this._storeDouble(_33_, (this._loadDouble((_33_ + 24))));
            }
            while (false);
            this._storeFloat((_33_ + 60), (this._storeFloat((_33_ + 48), ((float) (this._loadDouble(_33_))))));
        }
        while (false);
        _32_ = this._loadFloat((_33_ + 60));
        this._storeInt((0 + 4), (_33_ + 64));
        return _32_;
    }

    @Override()
    public final void fmal(
            int _30_,
            long _31_,
            long _32_,
            long _33_,
            long _34_,
            long _35_,
            long _36_)
    {
        int _37_ = 0;
        double _38_ = 0.0;
        double _39_ = 0.0;
        this._storeLong(((_37_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 48), _31_);
        this._storeLong((_37_ + 32), _33_);
        this._storeLong((_37_ + 56), _32_);
        this._storeLong((_37_ + 40), _34_);
        this._storeLong((_37_ + 24), _36_);
        _38_ = this.__trunctfdf2.invoke((this._storeLong((_37_ + 16), _35_)), _36_);
        _39_ = this.__trunctfdf2.invoke((this._loadLong((_37_ + 32))), (this._loadLong((_37_ + 40))));
        this.__extenddftf2.invoke(_37_, (fma((this.__trunctfdf2.invoke((this._loadLong((_37_ + 48))), (this._loadLong((_37_ + 56))))), _39_, _38_)));
        this._storeLong((_30_ + 8), (this._loadLong((_37_ + 8))));
        this._storeLong(_30_, (this._loadLong(_37_)));
        this._storeInt((0 + 4), (_37_ + 64));
        return;
    }

    @Override()
    public final double fmax(double _30_, double _31_)
    {
        int _32_ = 0;
        this._storeDouble(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 16), _30_);
        this._storeDouble((_32_ + 8), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((((__DOUBLE_BITS$2e$71((this._loadDouble((_32_ + 16))))) & 9223372036854775807L) & 4294967295L) < (9218868437227405313L & 4294967295L)) {
                    break label$1;
                }
                this._storeDouble((_32_ + 24), (this._loadDouble((_32_ + 8))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((((__DOUBLE_BITS$2e$71((this._loadDouble((_32_ + 8))))) & 9223372036854775807L) & 4294967295L) < (9218868437227405313L & 4294967295L)) {
                    break label$2;
                }
                this._storeDouble((_32_ + 24), (this._loadDouble((_32_ + 16))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if (((int) ((__DOUBLE_BITS$2e$71((this._loadDouble((_32_ + 16))))) >>> 63L)) == ((int) ((__DOUBLE_BITS$2e$71((this._loadDouble((_32_ + 8))))) >>> 63L))) {
                        break label$4;
                    }
                    if (((int) ((__DOUBLE_BITS$2e$71((this._loadDouble((_32_ + 16))))) >>> 63L)) == 0) {
                        break label$3;
                    }
                    this._storeDouble((_32_ + 24), (this._loadDouble((_32_ + 8))));
                    break label$0;
                }
                while (false);
                label$5:
                do {
                    label$6:
                    do {
                        if (((((_31_ = this._loadDouble((_32_ + 16))) >= (_30_ = this._loadDouble((_32_ + 8)))) ? 1 : 0) | (((_31_ != _31_) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0))) != 0) {
                            break label$6;
                        }
                        _31_ = this._loadDouble((_32_ + 8));
                        break label$5;
                    }
                    while (false);
                    _31_ = this._loadDouble((_32_ + 16));
                }
                while (false);
                this._storeDouble((_32_ + 24), _31_);
                break label$0;
            }
            while (false);
            this._storeDouble((_32_ + 24), (this._loadDouble((_32_ + 16))));
        }
        while (false);
        _31_ = this._loadDouble((_32_ + 24));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$70(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$71(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final float fmaxf(float _30_, float _31_)
    {
        int _32_ = 0;
        this._storeFloat(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeFloat((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((((__FLOAT_BITS$2e$72((this._loadFloat((_32_ + 8))))) & 2147483647) & 4294967295L) < (2139095041 & 4294967295L)) {
                    break label$1;
                }
                this._storeFloat((_32_ + 12), (this._loadFloat((_32_ + 4))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((((__FLOAT_BITS$2e$72((this._loadFloat((_32_ + 4))))) & 2147483647) & 4294967295L) < (2139095041 & 4294967295L)) {
                    break label$2;
                }
                this._storeFloat((_32_ + 12), (this._loadFloat((_32_ + 8))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if (((__FLOAT_BITS$2e$72((this._loadFloat((_32_ + 8))))) >>> 31) == ((__FLOAT_BITS$2e$72((this._loadFloat((_32_ + 4))))) >>> 31)) {
                        break label$4;
                    }
                    if (((__FLOAT_BITS$2e$72((this._loadFloat((_32_ + 8))))) >>> 31) == 0) {
                        break label$3;
                    }
                    this._storeFloat((_32_ + 12), (this._loadFloat((_32_ + 4))));
                    break label$0;
                }
                while (false);
                label$5:
                do {
                    label$6:
                    do {
                        if (((((_31_ = this._loadFloat((_32_ + 8))) >= (_30_ = this._loadFloat((_32_ + 4)))) ? 1 : 0) | (((_31_ != _31_) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0))) != 0) {
                            break label$6;
                        }
                        _31_ = this._loadFloat((_32_ + 4));
                        break label$5;
                    }
                    while (false);
                    _31_ = this._loadFloat((_32_ + 8));
                }
                while (false);
                this._storeFloat((_32_ + 12), _31_);
                break label$0;
            }
            while (false);
            this._storeFloat((_32_ + 12), (this._loadFloat((_32_ + 8))));
        }
        while (false);
        _31_ = this._loadFloat((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$72(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$73(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final void fmaxl(int _30_, long _31_, long _32_, long _33_, long _34_)
    {
        int _35_ = 0;
        double _36_ = 0.0;
        this._storeLong(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), _31_);
        this._storeLong((_35_ + 40), _32_);
        this._storeLong((_35_ + 24), _34_);
        _36_ = this.__trunctfdf2.invoke((this._storeLong((_35_ + 16), _33_)), _34_);
        this.__extenddftf2.invoke(_35_, (fmax((this.__trunctfdf2.invoke((this._loadLong((_35_ + 32))), (this._loadLong((_35_ + 40))))), _36_)));
        this._storeLong((_30_ + 8), (this._loadLong((_35_ + 8))));
        this._storeLong(_30_, (this._loadLong(_35_)));
        this._storeInt((0 + 4), (_35_ + 48));
        return;
    }

    @Override()
    public final int fmemopen(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 4), (((strchr((this._storeInt((_33_ + 16), _32_)), 43)) != 0) ? 1 : 0));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_33_ + 20))) == 0) {
                        break label$2;
                    }
                    if ((strchr(9872, (this._loadInt8s((this._loadInt((_33_ + 16))))))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt((_33_ + 24))) != 0) {
                        break label$1;
                    }
                    if (((this._loadInt((_33_ + 20))) & 4294967295L) < (-1176 & 4294967295L)) {
                        break label$1;
                    }
                    this._storeInt((__errno_location()), 12);
                    this._storeInt((_33_ + 28), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((__errno_location()), 22);
                this._storeInt((_33_ + 28), 0);
                break label$0;
            }
            while (false);
            _32_ = 0;
            label$3:
            do {
                if ((this._loadInt((_33_ + 24))) != 0) {
                    break label$3;
                }
                _32_ = this._loadInt((_33_ + 20));
            }
            while (false);
            label$4:
            do {
                label$5:
                do {
                    label$6:
                    do {
                        if ((this._storeInt((_33_ + 12), (calloc((_32_ + 1196), 1)))) == 0) {
                            break label$6;
                        }
                        _30_ = this._storeInt((_33_ + 8), ((_31_ = this._loadInt((_33_ + 12))) + 144));
                        this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 84), _30_);
                        this._storeInt((_32_ + 60), -1);
                        this._storeInt8((_32_ + 75), 255);
                        this._storeInt((_32_ + 44), (_31_ + 172));
                        _32_ = this._storeInt(((this._loadInt((_33_ + 12))) + 48), 1024);
                        label$7:
                        do {
                            if ((this._loadInt((_33_ + 24))) != 0) {
                                break label$7;
                            }
                            this._storeInt((_33_ + 24), ((this._loadInt(((this._loadInt((_33_ + 12))) + 44))) + _32_));
                        }
                        while (false);
                        this._storeInt(((_32_ = this._loadInt((_33_ + 8))) + 8), (this._loadInt((_33_ + 20))));
                        this._storeInt((_32_ + 12), (this._loadInt((_33_ + 24))));
                        this._storeInt((_32_ + 16), (this._loadInt8s((this._loadInt((_33_ + 16))))));
                        label$8:
                        do {
                            if ((this._loadInt((_33_ + 4))) != 0) {
                                break label$8;
                            }
                            _temp$0 = 8;
                            _temp$1 = 4;
                            _temp$2 = ((this._loadInt8s((this._loadInt((_33_ + 16))))) == 114) ? _temp$0 : _temp$1;
                            this._storeInt((this._loadInt((_33_ + 12))), _temp$2);
                        }
                        while (false);
                        if ((this._loadInt8s((this._loadInt((_33_ + 16))))) != 114) {
                            break label$5;
                        }
                        this._storeInt(((this._loadInt((_33_ + 8))) + 4), (this._loadInt((_33_ + 20))));
                        break label$4;
                    }
                    while (false);
                    this._storeInt((_33_ + 28), 0);
                    break label$0;
                }
                while (false);
                if ((this._loadInt8s((this._loadInt((_33_ + 16))))) != 97) {
                    break label$4;
                }
                _32_ = strnlen((this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))));
                this._storeInt((_31_ = this._loadInt((_33_ + 8))), (this._storeInt((_31_ + 4), _32_)));
            }
            while (false);
            this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 32), 2);
            this._storeInt((_32_ + 36), 3);
            this._storeInt((_32_ + 40), 4);
            this._storeInt(((this._loadInt((_33_ + 12))) + 12), 5);
            label$9:
            do {
                if ((this._loadInt((0 + 12944))) != 0) {
                    break label$9;
                }
                this._storeInt(((this._loadInt((_33_ + 12))) + 76), -1);
            }
            while (false);
            this._storeInt((_33_ + 28), (__ofl_add((this._loadInt((_33_ + 12))))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int mread(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 16), (this._loadInt(((this._loadInt((_33_ + 28))) + 84))));
        this._storeInt((_33_ + 12), ((this._loadInt(((_32_ = this._loadInt((_33_ + 16))) + 4))) - (this._loadInt(_32_))));
        label$0:
        do {
            if (((this._loadInt((_32_ = this._loadInt((_33_ + 16))))) & 4294967295L) <= ((this._loadInt((_32_ + 4))) & 4294967295L)) {
                break label$0;
            }
            this._storeInt((_33_ + 12), 0);
        }
        while (false);
        label$1:
        do {
            if (((this._loadInt((_33_ + 20))) & 4294967295L) <= ((this._loadInt((_33_ + 12))) & 4294967295L)) {
                break label$1;
            }
            this._storeInt((_33_ + 20), (this._loadInt((_33_ + 12))));
            this._storeInt((_32_ = this._loadInt((_33_ + 28))), ((this._loadInt(_32_)) | 16));
        }
        while (false);
        memcpy((this._loadInt((_33_ + 24))), ((this._loadInt(((_32_ = this._loadInt((_33_ + 16))) + 12))) + (this._loadInt(_32_))), (this._loadInt((_33_ + 20))));
        this._storeInt((_32_ = this._loadInt((_33_ + 16))), ((this._loadInt(_32_)) + (_32_ = this._loadInt((_33_ + 20)))));
        label$2:
        do {
            if (((this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) - _32_))) & 4294967295L) <= ((this._loadInt(((this._loadInt((_33_ + 28))) + 48))) & 4294967295L)) {
                break label$2;
            }
            this._storeInt((_33_ + 12), (this._loadInt(((this._loadInt((_33_ + 28))) + 48))));
        }
        while (false);
        this._storeInt(((_32_ = this._loadInt((_33_ + 28))) + 8), ((this._storeInt((_32_ + 4), (this._loadInt((_32_ + 44))))) + (this._loadInt((_33_ + 12)))));
        memcpy((this._loadInt(((this._loadInt((_33_ + 28))) + 4))), ((this._loadInt(((_32_ = this._loadInt((_33_ + 16))) + 12))) + (this._loadInt(_32_))), (this._loadInt((_33_ + 12))));
        this._storeInt((_32_ = this._loadInt((_33_ + 16))), ((this._loadInt(_32_)) + (this._loadInt((_33_ + 12)))));
        _32_ = this._loadInt((_33_ + 20));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int mwrite(int _30_, int _31_, int _32_)
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
                if ((this._storeInt((_33_ + 4), ((this._loadInt(((_32_ = this._loadInt((_33_ + 24))) + 20))) - (this._loadInt((_32_ + 28)))))) == 0) {
                    break label$1;
                }
                if (((mwrite((_32_ = this._loadInt((_33_ + 24))), (this._storeInt((_32_ + 20), (this._loadInt((_32_ + 28))))), (this._loadInt((_33_ + 4))))) & 4294967295L) >= ((this._loadInt((_33_ + 4))) & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((_33_ + 28), 0);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((this._loadInt(((this._loadInt((_33_ + 12))) + 16))) != 97) {
                    break label$2;
                }
                this._storeInt((_32_ = this._loadInt((_33_ + 12))), (this._loadInt((_32_ + 4))));
            }
            while (false);
            _32_ = this._storeInt((_33_ + 8), ((this._loadInt(((_32_ = this._loadInt((_33_ + 12))) + 8))) - (this._loadInt(_32_))));
            label$3:
            do {
                if (((this._loadInt((_33_ + 16))) & 4294967295L) <= (_32_ & 4294967295L)) {
                    break label$3;
                }
                this._storeInt((_33_ + 16), (this._loadInt((_33_ + 8))));
            }
            while (false);
            memcpy(((this._loadInt(((_32_ = this._loadInt((_33_ + 12))) + 12))) + (this._loadInt(_32_))), (this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))));
            this._storeInt((_32_ = this._loadInt((_33_ + 12))), ((this._loadInt(_32_)) + (this._loadInt((_33_ + 16)))));
            label$4:
            do {
                if (((this._loadInt(_32_)) & 4294967295L) <= ((this._loadInt((_32_ + 4))) & 4294967295L)) {
                    break label$4;
                }
                label$5:
                do {
                    if (((this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 4), (this._loadInt(_32_)))) & 4294967295L) >= ((this._loadInt((_32_ + 8))) & 4294967295L)) {
                        break label$5;
                    }
                    this._storeInt8(((this._loadInt(((_32_ = this._loadInt((_33_ + 12))) + 12))) + (this._loadInt((_32_ + 4)))), 0);
                    break label$4;
                }
                while (false);
                if (((this._loadInt8u((this._loadInt((_33_ + 24))))) & 4) == 0) {
                    break label$4;
                }
                if ((this._loadInt(((this._loadInt((_33_ + 12))) + 8))) == 0) {
                    break label$4;
                }
                this._storeInt8((((this._loadInt(((_32_ = this._loadInt((_33_ + 12))) + 12))) + (this._loadInt((_32_ + 8)))) + -1), 0);
            }
            while (false);
            this._storeInt((_33_ + 28), (this._loadInt((_33_ + 16))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final long mseek(int _30_, long _31_, int _32_)
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
                    this._storeInt((_33_ + 4), (this._loadInt((_34_ = this._loadInt((_33_ + 12))))));
                    this._storeInt((_33_ + 8), (this._loadInt((_34_ + 4))));
                    _32_ = this._storeInt((_33_ + 16), (this._loadInt((_33_ + (_32_ << 2)))));
                    if ((this._loadLong((_33_ + 24))) < ((long) (_30_ - _32_))) {
                        break label$2;
                    }
                    if ((this._loadLong((_33_ + 24))) <= ((long) ((this._loadInt(((this._loadInt((_33_ + 12))) + 8))) - (this._loadInt((_33_ + 16)))))) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((__errno_location()), 22);
                this._storeLong((_33_ + 40), -1L);
                break label$0;
            }
            while (false);
            this._storeLong((_33_ + 40), ((this._storeLong32((this._loadInt((_33_ + 12))), ((this._loadLong32s((_33_ + 16))) + (this._loadLong((_33_ + 24)))))) & 4294967295L));
        }
        while (false);
        _31_ = this._loadLong((_33_ + 40));
        this._storeInt((0 + 4), (_33_ + 48));
        return _31_;
    }

    @Override()
    public final int mclose(int _30_)
    {
        this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_);
        return 0;
    }

    @Override()
    public final double fmin(double _30_, double _31_)
    {
        int _32_ = 0;
        this._storeDouble(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 16), _30_);
        this._storeDouble((_32_ + 8), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((((__DOUBLE_BITS$2e$76((this._loadDouble((_32_ + 16))))) & 9223372036854775807L) & 4294967295L) < (9218868437227405313L & 4294967295L)) {
                    break label$1;
                }
                this._storeDouble((_32_ + 24), (this._loadDouble((_32_ + 8))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((((__DOUBLE_BITS$2e$76((this._loadDouble((_32_ + 8))))) & 9223372036854775807L) & 4294967295L) < (9218868437227405313L & 4294967295L)) {
                    break label$2;
                }
                this._storeDouble((_32_ + 24), (this._loadDouble((_32_ + 16))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if (((int) ((__DOUBLE_BITS$2e$76((this._loadDouble((_32_ + 16))))) >>> 63L)) == ((int) ((__DOUBLE_BITS$2e$76((this._loadDouble((_32_ + 8))))) >>> 63L))) {
                        break label$4;
                    }
                    if (((int) ((__DOUBLE_BITS$2e$76((this._loadDouble((_32_ + 16))))) >>> 63L)) == 0) {
                        break label$3;
                    }
                    this._storeDouble((_32_ + 24), (this._loadDouble((_32_ + 16))));
                    break label$0;
                }
                while (false);
                label$5:
                do {
                    label$6:
                    do {
                        if (((((_31_ = this._loadDouble((_32_ + 16))) >= (_30_ = this._loadDouble((_32_ + 8)))) ? 1 : 0) | (((_31_ != _31_) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0))) != 0) {
                            break label$6;
                        }
                        _31_ = this._loadDouble((_32_ + 16));
                        break label$5;
                    }
                    while (false);
                    _31_ = this._loadDouble((_32_ + 8));
                }
                while (false);
                this._storeDouble((_32_ + 24), _31_);
                break label$0;
            }
            while (false);
            this._storeDouble((_32_ + 24), (this._loadDouble((_32_ + 8))));
        }
        while (false);
        _31_ = this._loadDouble((_32_ + 24));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$75(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$76(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final float fminf(float _30_, float _31_)
    {
        int _32_ = 0;
        this._storeFloat(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeFloat((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((((__FLOAT_BITS$2e$77((this._loadFloat((_32_ + 8))))) & 2147483647) & 4294967295L) < (2139095041 & 4294967295L)) {
                    break label$1;
                }
                this._storeFloat((_32_ + 12), (this._loadFloat((_32_ + 4))));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((((__FLOAT_BITS$2e$77((this._loadFloat((_32_ + 4))))) & 2147483647) & 4294967295L) < (2139095041 & 4294967295L)) {
                    break label$2;
                }
                this._storeFloat((_32_ + 12), (this._loadFloat((_32_ + 8))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if (((__FLOAT_BITS$2e$77((this._loadFloat((_32_ + 8))))) >>> 31) == ((__FLOAT_BITS$2e$77((this._loadFloat((_32_ + 4))))) >>> 31)) {
                        break label$4;
                    }
                    if (((__FLOAT_BITS$2e$77((this._loadFloat((_32_ + 8))))) >>> 31) == 0) {
                        break label$3;
                    }
                    this._storeFloat((_32_ + 12), (this._loadFloat((_32_ + 8))));
                    break label$0;
                }
                while (false);
                label$5:
                do {
                    label$6:
                    do {
                        if (((((_31_ = this._loadFloat((_32_ + 8))) >= (_30_ = this._loadFloat((_32_ + 4)))) ? 1 : 0) | (((_31_ != _31_) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0))) != 0) {
                            break label$6;
                        }
                        _31_ = this._loadFloat((_32_ + 8));
                        break label$5;
                    }
                    while (false);
                    _31_ = this._loadFloat((_32_ + 4));
                }
                while (false);
                this._storeFloat((_32_ + 12), _31_);
                break label$0;
            }
            while (false);
            this._storeFloat((_32_ + 12), (this._loadFloat((_32_ + 4))));
        }
        while (false);
        _31_ = this._loadFloat((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$77(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$78(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final void fminl(int _30_, long _31_, long _32_, long _33_, long _34_)
    {
        int _35_ = 0;
        double _36_ = 0.0;
        this._storeLong(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), _31_);
        this._storeLong((_35_ + 40), _32_);
        this._storeLong((_35_ + 24), _34_);
        _36_ = this.__trunctfdf2.invoke((this._storeLong((_35_ + 16), _33_)), _34_);
        this.__extenddftf2.invoke(_35_, (fmin((this.__trunctfdf2.invoke((this._loadLong((_35_ + 32))), (this._loadLong((_35_ + 40))))), _36_)));
        this._storeLong((_30_ + 8), (this._loadLong((_35_ + 8))));
        this._storeLong(_30_, (this._loadLong(_35_)));
        this._storeInt((0 + 4), (_35_ + 48));
        return;
    }

    @Override()
    public final double fmod(double _30_, double _31_)
    {
        int _32_ = 0;
        this._storeDouble(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 64), _30_);
        this._storeDouble((_32_ + 56), _31_);
        this._storeDouble((_32_ + 48), (this._loadDouble((_32_ + 64))));
        this._storeDouble((_32_ + 40), (this._loadDouble((_32_ + 56))));
        this._storeLong32((_32_ + 36), (((this._loadLong((_32_ + 48))) >>> 52L) & 2047L));
        this._storeLong32((_32_ + 32), (((this._loadLong((_32_ + 40))) >>> 52L) & 2047L));
        this._storeLong32((_32_ + 28), ((this._loadLong((_32_ + 48))) >>> 63L));
        this._storeLong((_32_ + 8), (this._loadLong((_32_ + 48))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadLong((_32_ + 40))) << 1L) == 0) {
                        break label$2;
                    }
                    if ((((__DOUBLE_BITS$2e$80((this._loadDouble((_32_ + 56))))) & 9223372036854775807L) & 4294967295L) > (9218868437227405312L & 4294967295L)) {
                        break label$2;
                    }
                    if ((this._loadInt((_32_ + 36))) != 2047) {
                        break label$1;
                    }
                }
                while (false);
                this._storeDouble((_32_ + 72), ((_31_ = (this._loadDouble((_32_ + 64))) * (this._loadDouble((_32_ + 56)))) / _31_));
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
                            if ((((this._loadLong((_32_ + 8))) << 1L) & 4294967295L) > (((this._loadLong((_32_ + 40))) << 1L) & 4294967295L)) {
                                break label$6;
                            }
                            if (((this._loadLong((_32_ + 8))) << 1L) != ((this._loadLong((_32_ + 40))) << 1L)) {
                                break label$5;
                            }
                            this._storeDouble((_32_ + 72), ((this._loadDouble((_32_ + 64))) * 0.0));
                            break label$0;
                        }
                        while (false);
                        if ((this._loadInt((_32_ + 36))) == 0) {
                            break label$4;
                        }
                        this._storeLong((_32_ + 8), ((this._storeLong((_32_ + 8), ((this._loadLong((_32_ + 8))) & 4503599627370495L))) | 4503599627370496L));
                        break label$3;
                    }
                    while (false);
                    this._storeDouble((_32_ + 72), (this._loadDouble((_32_ + 64))));
                    break label$0;
                }
                while (false);
                this._storeLong((_32_ + 16), ((this._loadLong((_32_ + 8))) << 12L));
                label$8:
                do {
                    label$7:
                    while (true) {
                        if (((this._loadLong((_32_ + 16))) >>> 63L) != 0L) {
                            break label$8;
                        }
                        this._storeInt((_32_ + 36), ((this._loadInt((_32_ + 36))) + -1));
                        this._storeLong((_32_ + 16), ((this._loadLong((_32_ + 16))) << 1L));
                        continue label$7;
                    }
                }
                while (false);
                this._storeLong((_32_ + 8), ((this._loadLong((_32_ + 8))) << ((1 - (this._loadInt((_32_ + 36)))) & 4294967295L)));
            }
            while (false);
            label$9:
            do {
                label$10:
                do {
                    if ((this._loadInt((_32_ + 32))) == 0) {
                        break label$10;
                    }
                    this._storeLong((_32_ + 40), ((this._storeLong((_32_ + 40), ((this._loadLong((_32_ + 40))) & 4503599627370495L))) | 4503599627370496L));
                    break label$9;
                }
                while (false);
                this._storeLong((_32_ + 16), ((this._loadLong((_32_ + 40))) << 12L));
                label$12:
                do {
                    label$11:
                    while (true) {
                        if (((this._loadLong((_32_ + 16))) >>> 63L) != 0L) {
                            break label$12;
                        }
                        this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) + -1));
                        this._storeLong((_32_ + 16), ((this._loadLong((_32_ + 16))) << 1L));
                        continue label$11;
                    }
                }
                while (false);
                this._storeLong((_32_ + 40), ((this._loadLong((_32_ + 40))) << ((1 - (this._loadInt((_32_ + 32)))) & 4294967295L)));
            }
            while (false);
            label$13:
            do {
                label$14:
                do {
                    label$15:
                    do {
                        label$16:
                        do {
                            label$18:
                            do {
                                label$17:
                                while (true) {
                                    if ((this._loadInt((_32_ + 36))) <= (this._loadInt((_32_ + 32)))) {
                                        break label$18;
                                    }
                                    label$19:
                                    do {
                                        if (((this._storeLong((_32_ + 16), ((this._loadLong((_32_ + 8))) - (this._loadLong((_32_ + 40)))))) >>> 63L) != 0L) {
                                            break label$19;
                                        }
                                        if ((this._loadLong((_32_ + 16))) == 0L) {
                                            break label$16;
                                        }
                                        this._storeLong((_32_ + 8), (this._loadLong((_32_ + 16))));
                                    }
                                    while (false);
                                    this._storeLong((_32_ + 8), ((this._loadLong((_32_ + 8))) << 1L));
                                    this._storeInt((_32_ + 36), ((this._loadInt((_32_ + 36))) + -1));
                                    continue label$17;
                                }
                            }
                            while (false);
                            label$20:
                            do {
                                if (((this._storeLong((_32_ + 16), ((this._loadLong((_32_ + 8))) - (this._loadLong((_32_ + 40)))))) >>> 63L) != 0L) {
                                    break label$20;
                                }
                                if ((this._loadLong((_32_ + 16))) == 0L) {
                                    break label$13;
                                }
                                this._storeLong((_32_ + 8), (this._loadLong((_32_ + 16))));
                            }
                            while (false);
                            label$22:
                            do {
                                label$21:
                                while (true) {
                                    if (((this._loadLong((_32_ + 8))) >>> 52L) != 0L) {
                                        break label$22;
                                    }
                                    this._storeLong((_32_ + 8), ((this._loadLong((_32_ + 8))) << 1L));
                                    this._storeInt((_32_ + 36), ((this._loadInt((_32_ + 36))) + -1));
                                    continue label$21;
                                }
                            }
                            while (false);
                            if ((this._loadInt((_32_ + 36))) < 1) {
                                break label$15;
                            }
                            this._storeLong((_32_ + 8), ((this._storeLong((_32_ + 8), ((this._loadLong((_32_ + 8))) + -4503599627370496L))) | ((this._loadLong32u((_32_ + 36))) << 52L)));
                            break label$14;
                        }
                        while (false);
                        this._storeDouble((_32_ + 72), ((this._loadDouble((_32_ + 64))) * 0.0));
                        break label$0;
                    }
                    while (false);
                    this._storeLong((_32_ + 8), ((this._loadLong((_32_ + 8))) >>> ((1 - (this._loadInt((_32_ + 36)))) & 4294967295L)));
                }
                while (false);
                this._storeLong((_32_ + 48), (this._storeLong((_32_ + 8), ((this._loadLong((_32_ + 8))) | ((this._loadLong32u((_32_ + 28))) << 63L)))));
                this._storeDouble((_32_ + 72), (this._loadDouble((_32_ + 48))));
                break label$0;
            }
            while (false);
            this._storeDouble((_32_ + 72), ((this._loadDouble((_32_ + 64))) * 0.0));
        }
        while (false);
        _31_ = this._loadDouble((_32_ + 72));
        this._storeInt((0 + 4), (_32_ + 80));
        return _31_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$79(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$80(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final float fmodf(float _30_, float _31_)
    {
        int _32_ = 0;
        this._storeFloat(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeFloat((_32_ + 36), _31_);
        this._storeFloat((_32_ + 32), (this._loadFloat((_32_ + 40))));
        this._storeFloat((_32_ + 24), (this._loadFloat((_32_ + 36))));
        this._storeInt((_32_ + 20), (((this._loadInt((_32_ + 32))) >>> 23) & 255));
        this._storeInt((_32_ + 16), (((this._loadInt((_32_ + 24))) >>> 23) & 255));
        this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 32))) & -2147483648));
        this._storeInt((_32_ + 4), (this._loadInt((_32_ + 32))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadInt((_32_ + 24))) << 1) == 0) {
                        break label$2;
                    }
                    if ((((__FLOAT_BITS$2e$81((this._loadFloat((_32_ + 36))))) & 2147483647) & 4294967295L) > (2139095040 & 4294967295L)) {
                        break label$2;
                    }
                    if ((this._loadInt((_32_ + 20))) != 255) {
                        break label$1;
                    }
                }
                while (false);
                this._storeFloat((_32_ + 44), ((_31_ = (this._loadFloat((_32_ + 40))) * (this._loadFloat((_32_ + 36)))) / _31_));
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
                            if ((((this._loadInt((_32_ + 4))) << 1) & 4294967295L) > (((this._loadInt((_32_ + 24))) << 1) & 4294967295L)) {
                                break label$6;
                            }
                            if (((this._loadInt((_32_ + 4))) << 1) != ((this._loadInt((_32_ + 24))) << 1)) {
                                break label$5;
                            }
                            this._storeFloat((_32_ + 44), ((this._loadFloat((_32_ + 40))) * 0.0f));
                            break label$0;
                        }
                        while (false);
                        if ((this._loadInt((_32_ + 20))) == 0) {
                            break label$4;
                        }
                        this._storeInt((_32_ + 4), ((this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) & 8388607))) | 8388608));
                        break label$3;
                    }
                    while (false);
                    this._storeFloat((_32_ + 44), (this._loadFloat((_32_ + 40))));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 4))) << 9));
                label$8:
                do {
                    label$7:
                    while (true) {
                        if (((this._loadInt((_32_ + 8))) >>> 31) != 0) {
                            break label$8;
                        }
                        this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + -1));
                        this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) << 1));
                        continue label$7;
                    }
                }
                while (false);
                this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) << (1 - (this._loadInt((_32_ + 20))))));
            }
            while (false);
            label$9:
            do {
                label$10:
                do {
                    if ((this._loadInt((_32_ + 16))) == 0) {
                        break label$10;
                    }
                    this._storeInt((_32_ + 24), ((this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) & 8388607))) | 8388608));
                    break label$9;
                }
                while (false);
                this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 24))) << 9));
                label$12:
                do {
                    label$11:
                    while (true) {
                        if (((this._loadInt((_32_ + 8))) >>> 31) != 0) {
                            break label$12;
                        }
                        this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + -1));
                        this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) << 1));
                        continue label$11;
                    }
                }
                while (false);
                this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) << (1 - (this._loadInt((_32_ + 16))))));
            }
            while (false);
            label$13:
            do {
                label$14:
                do {
                    label$15:
                    do {
                        label$16:
                        do {
                            label$18:
                            do {
                                label$17:
                                while (true) {
                                    if ((this._loadInt((_32_ + 20))) <= (this._loadInt((_32_ + 16)))) {
                                        break label$18;
                                    }
                                    label$19:
                                    do {
                                        if (((this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 4))) - (this._loadInt((_32_ + 24)))))) >>> 31) != 0) {
                                            break label$19;
                                        }
                                        if ((this._loadInt((_32_ + 8))) == 0) {
                                            break label$16;
                                        }
                                        this._storeInt((_32_ + 4), (this._loadInt((_32_ + 8))));
                                    }
                                    while (false);
                                    this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) << 1));
                                    this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + -1));
                                    continue label$17;
                                }
                            }
                            while (false);
                            label$20:
                            do {
                                if (((this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 4))) - (this._loadInt((_32_ + 24)))))) >>> 31) != 0) {
                                    break label$20;
                                }
                                if ((this._loadInt((_32_ + 8))) == 0) {
                                    break label$13;
                                }
                                this._storeInt((_32_ + 4), (this._loadInt((_32_ + 8))));
                            }
                            while (false);
                            label$22:
                            do {
                                label$21:
                                while (true) {
                                    if (((this._loadInt((_32_ + 4))) >>> 23) != 0) {
                                        break label$22;
                                    }
                                    this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) << 1));
                                    this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + -1));
                                    continue label$21;
                                }
                            }
                            while (false);
                            if ((this._loadInt((_32_ + 20))) < 1) {
                                break label$15;
                            }
                            this._storeInt((_32_ + 4), ((this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + -8388608))) | ((this._loadInt((_32_ + 20))) << 23)));
                            break label$14;
                        }
                        while (false);
                        this._storeFloat((_32_ + 44), ((this._loadFloat((_32_ + 40))) * 0.0f));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) >>> (1 - (this._loadInt((_32_ + 20))))));
                }
                while (false);
                this._storeInt((_32_ + 32), (this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) | (this._loadInt((_32_ + 12)))))));
                this._storeFloat((_32_ + 44), (this._loadFloat((_32_ + 32))));
                break label$0;
            }
            while (false);
            this._storeFloat((_32_ + 44), ((this._loadFloat((_32_ + 40))) * 0.0f));
        }
        while (false);
        _31_ = this._loadFloat((_32_ + 44));
        this._storeInt((0 + 4), (_32_ + 48));
        return _31_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$81(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$82(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final void fmodl(int _30_, long _31_, long _32_, long _33_, long _34_)
    {
        int _35_ = 0;
        double _36_ = 0.0;
        this._storeLong(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), _31_);
        this._storeLong((_35_ + 40), _32_);
        this._storeLong((_35_ + 24), _34_);
        _36_ = this.__trunctfdf2.invoke((this._storeLong((_35_ + 16), _33_)), _34_);
        this.__extenddftf2.invoke(_35_, (fmod((this.__trunctfdf2.invoke((this._loadLong((_35_ + 32))), (this._loadLong((_35_ + 40))))), _36_)));
        this._storeLong((_30_ + 8), (this._loadLong((_35_ + 8))));
        this._storeLong(_30_, (this._loadLong(_35_)));
        this._storeInt((0 + 4), (_35_ + 48));
        return;
    }

    @Override()
    public final int fnmatch(int _30_, int _31_, int _32_)
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
                        if (((this._loadInt8u((_33_ + 16))) & 1) == 0) {
                            break label$3;
                        }
                        label$5:
                        do {
                            label$4:
                            while (true) {
                                this._storeInt((_33_ + 12), (this._loadInt((_33_ + 20))));
                                label$7:
                                do {
                                    label$6:
                                    while (true) {
                                        _32_ = 0;
                                        label$8:
                                        do {
                                            if ((this._loadInt8s((this._loadInt((_33_ + 12))))) == 0) {
                                                break label$8;
                                            }
                                            _32_ = ((this._loadInt8s((this._loadInt((_33_ + 12))))) != 47) ? 1 : 0;
                                        }
                                        while (false);
                                        if (_32_ == 0) {
                                            break label$7;
                                        }
                                        this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 1));
                                        continue label$6;
                                    }
                                }
                                while (false);
                                this._storeInt((_33_ + 8), (this._loadInt((_33_ + 24))));
                                label$10:
                                do {
                                    label$9:
                                    while (true) {
                                        _32_ = 0;
                                        label$11:
                                        do {
                                            if ((this._storeInt(_33_, (pat_next((this._loadInt((_33_ + 8))), -1, (_33_ + 4), (this._loadInt((_33_ + 16))))))) == 0) {
                                                break label$11;
                                            }
                                            _32_ = ((this._loadInt(_33_)) != 47) ? 1 : 0;
                                        }
                                        while (false);
                                        if (_32_ == 0) {
                                            break label$10;
                                        }
                                        this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) + (this._loadInt((_33_ + 4)))));
                                        continue label$9;
                                    }
                                }
                                while (false);
                                label$12:
                                do {
                                    if ((this._loadInt(_33_)) == (this._loadInt8s((this._loadInt((_33_ + 12)))))) {
                                        break label$12;
                                    }
                                    if ((this._loadInt8u((this._loadInt((_33_ + 12))))) == 0) {
                                        break label$2;
                                    }
                                    if (((this._loadInt8u((_33_ + 16))) & 8) == 0) {
                                        break label$2;
                                    }
                                }
                                while (false);
                                if ((fnmatch_internal((_32_ = this._loadInt((_33_ + 24))), ((this._loadInt((_33_ + 8))) - _32_), (_32_ = this._loadInt((_33_ + 20))), ((this._loadInt((_33_ + 12))) - _32_), (this._loadInt((_33_ + 16))))) != 0) {
                                    break label$1;
                                }
                                if ((this._loadInt(_33_)) == 0) {
                                    break label$5;
                                }
                                this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 12))) + 1));
                                this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 8))) + (this._loadInt((_33_ + 4)))));
                                continue label$4;
                            }
                        }
                        while (false);
                        this._storeInt((_33_ + 28), 0);
                        break label$0;
                    }
                    while (false);
                    label$13:
                    do {
                        if (((this._loadInt8u((_33_ + 16))) & 8) == 0) {
                            break label$13;
                        }
                        this._storeInt((_33_ + 12), (this._loadInt((_33_ + 20))));
                        label$15:
                        do {
                            label$14:
                            while (true) {
                                if ((this._loadInt8u((this._loadInt((_33_ + 12))))) == 0) {
                                    break label$13;
                                }
                                label$16:
                                do {
                                    if ((this._loadInt8s((this._loadInt((_33_ + 12))))) != 47) {
                                        break label$16;
                                    }
                                    if ((fnmatch_internal((this._loadInt((_33_ + 24))), -1, (_32_ = this._loadInt((_33_ + 20))), ((this._loadInt((_33_ + 12))) - _32_), (this._loadInt((_33_ + 16))))) == 0) {
                                        break label$15;
                                    }
                                }
                                while (false);
                                this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 1));
                                continue label$14;
                            }
                        }
                        while (false);
                        this._storeInt((_33_ + 28), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_33_ + 28), (fnmatch_internal((this._loadInt((_33_ + 24))), -1, (this._loadInt((_33_ + 20))), -1, (this._loadInt((_33_ + 16))))));
                    break label$0;
                }
                while (false);
                this._storeInt((_33_ + 28), 1);
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
    public final int pat_next(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_34_ + 36), _31_);
        this._storeInt((_34_ + 32), _32_);
        this._storeInt((_34_ + 28), _33_);
        _33_ = this._storeInt((_34_ + 24), 0);
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
                                    if ((this._loadInt((_34_ + 36))) == 0) {
                                        break label$6;
                                    }
                                    if ((this._loadInt8u((this._loadInt((_34_ + 40))))) == 0) {
                                        break label$6;
                                    }
                                    this._storeInt((this._loadInt((_34_ + 32))), 1);
                                    label$7:
                                    do {
                                        if ((this._loadInt8s((this._loadInt((_34_ + 40))))) != 92) {
                                            break label$7;
                                        }
                                        if ((this._loadInt8s(((this._loadInt((_34_ + 40))) + 1))) == 0) {
                                            break label$7;
                                        }
                                        if (((this._loadInt8u((_34_ + 28))) & 2) == 0) {
                                            break label$2;
                                        }
                                    }
                                    while (false);
                                    if ((this._loadInt8s((this._loadInt((_34_ + 40))))) != 91) {
                                        break label$5;
                                    }
                                    this._storeInt((_34_ + 20), 1);
                                    label$8:
                                    do {
                                        if (((this._loadInt((_34_ + 36))) & 4294967295L) < (2 & 4294967295L)) {
                                            break label$8;
                                        }
                                        label$9:
                                        do {
                                            if ((this._loadInt8s(((this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 20)))))) == 94) {
                                                break label$9;
                                            }
                                            if ((this._loadInt8s(((this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 20)))))) != 33) {
                                                break label$8;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) + 1));
                                    }
                                    while (false);
                                    label$10:
                                    do {
                                        if (((this._loadInt((_34_ + 20))) & 4294967295L) >= ((this._loadInt((_34_ + 36))) & 4294967295L)) {
                                            break label$10;
                                        }
                                        if ((this._loadInt8s(((this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 20)))))) != 93) {
                                            break label$10;
                                        }
                                        this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) + 1));
                                    }
                                    while (false);
                                    label$12:
                                    do {
                                        label$11:
                                        while (true) {
                                            _33_ = 0;
                                            label$13:
                                            do {
                                                if (((this._loadInt((_34_ + 20))) & 4294967295L) >= ((this._loadInt((_34_ + 36))) & 4294967295L)) {
                                                    break label$13;
                                                }
                                                if ((this._loadInt8s(((this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 20)))))) == 0) {
                                                    break label$13;
                                                }
                                                _33_ = ((this._loadInt8s(((this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 20)))))) != 93) ? 1 : 0;
                                            }
                                            while (false);
                                            if (_33_ == 0) {
                                                break label$12;
                                            }
                                            label$14:
                                            do {
                                                if ((((this._loadInt((_34_ + 20))) + 1) & 4294967295L) >= ((this._loadInt((_34_ + 36))) & 4294967295L)) {
                                                    break label$14;
                                                }
                                                if ((this._loadInt8s((((this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 20)))) + 1))) == 0) {
                                                    break label$14;
                                                }
                                                if ((this._loadInt8s(((this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 20)))))) != 91) {
                                                    break label$14;
                                                }
                                                label$15:
                                                do {
                                                    if ((this._loadInt8s((((this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 20)))) + 1))) == 58) {
                                                        break label$15;
                                                    }
                                                    if ((this._loadInt8s((((this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 20)))) + 1))) == 46) {
                                                        break label$15;
                                                    }
                                                    if ((this._loadInt8s((((this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 20)))) + 1))) != 61) {
                                                        break label$14;
                                                    }
                                                }
                                                while (false);
                                                this._storeInt((_34_ + 16), (this._loadInt8s((((this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 20)))) + 1))));
                                                label$16:
                                                do {
                                                    if (((this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) + 2))) & 4294967295L) >= ((this._loadInt((_34_ + 36))) & 4294967295L)) {
                                                        break label$16;
                                                    }
                                                    if ((this._loadInt8s(((this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 20)))))) == 0) {
                                                        break label$16;
                                                    }
                                                    this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) + 1));
                                                }
                                                while (false);
                                                label$18:
                                                do {
                                                    label$17:
                                                    while (true) {
                                                        _33_ = 0;
                                                        label$19:
                                                        do {
                                                            if (((this._loadInt((_34_ + 20))) & 4294967295L) >= ((this._loadInt((_34_ + 36))) & 4294967295L)) {
                                                                break label$19;
                                                            }
                                                            if ((this._loadInt8s(((this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 20)))))) == 0) {
                                                                break label$19;
                                                            }
                                                            _33_ = 1;
                                                            if ((this._loadInt8s((((this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 20)))) + -1))) != (this._loadInt((_34_ + 16)))) {
                                                                break label$19;
                                                            }
                                                            _33_ = ((this._loadInt8s(((this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 20)))))) != 93) ? 1 : 0;
                                                        }
                                                        while (false);
                                                        if (_33_ == 0) {
                                                            break label$18;
                                                        }
                                                        this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) + 1));
                                                        continue label$17;
                                                    }
                                                }
                                                while (false);
                                                if ((this._loadInt((_34_ + 20))) == (this._loadInt((_34_ + 36)))) {
                                                    break label$12;
                                                }
                                                if ((this._loadInt8u(((this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 20)))))) == 0) {
                                                    break label$12;
                                                }
                                            }
                                            while (false);
                                            this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 20))) + 1));
                                            continue label$11;
                                        }
                                    }
                                    while (false);
                                    if ((this._loadInt((_34_ + 20))) == (this._loadInt((_34_ + 36)))) {
                                        break label$4;
                                    }
                                    if ((this._loadInt8u(((this._loadInt((_34_ + 40))) + (this._loadInt((_34_ + 20)))))) == 0) {
                                        break label$4;
                                    }
                                    this._storeInt((this._loadInt((_34_ + 32))), ((this._loadInt((_34_ + 20))) + 1));
                                    this._storeInt((_34_ + 44), -3);
                                    break label$0;
                                }
                                while (false);
                                this._storeInt((_34_ + 44), (this._storeInt((this._loadInt((_34_ + 32))), _33_)));
                                break label$0;
                            }
                            while (false);
                            if ((this._loadInt8s((this._loadInt((_34_ + 40))))) != 42) {
                                break label$3;
                            }
                            this._storeInt((_34_ + 44), -5);
                            break label$0;
                        }
                        while (false);
                        this._storeInt((this._loadInt((_34_ + 32))), 1);
                        this._storeInt((_34_ + 44), 91);
                        break label$0;
                    }
                    while (false);
                    if ((this._loadInt8s((this._loadInt((_34_ + 40))))) != 63) {
                        break label$1;
                    }
                    this._storeInt((_34_ + 44), -4);
                    break label$0;
                }
                while (false);
                this._storeInt((this._loadInt((_34_ + 32))), 2);
                this._storeInt((_34_ + 40), ((this._loadInt((_34_ + 40))) + 1));
                this._storeInt((_34_ + 24), 1);
            }
            while (false);
            label$20:
            do {
                label$21:
                do {
                    if (((this._loadInt8s((this._loadInt((_34_ + 40))))) & 4294967295L) < (128 & 4294967295L)) {
                        break label$21;
                    }
                    if ((this._storeInt((_34_ + 8), (this.mbtowc.invoke((_34_ + 12), (this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 36))))))) <= -1) {
                        break label$20;
                    }
                    this._storeInt((this._loadInt((_34_ + 32))), ((this._loadInt((_34_ + 8))) + (this._loadInt((_34_ + 24)))));
                    this._storeInt((_34_ + 44), (this._loadInt((_34_ + 12))));
                    break label$0;
                }
                while (false);
                this._storeInt((_34_ + 44), (this._loadInt8s((this._loadInt((_34_ + 40))))));
                break label$0;
            }
            while (false);
            this._storeInt((this._loadInt((_34_ + 32))), 0);
            this._storeInt((_34_ + 44), -2);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int fnmatch_internal(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 72), _30_);
        this._storeInt((_35_ + 68), _31_);
        this._storeInt((_35_ + 64), _32_);
        this._storeInt((_35_ + 60), _33_);
        this._storeInt((_35_ + 56), _34_);
        _33_ = this._storeInt((_35_ + 20), 0);
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt8u((_35_ + 56))) & 4) == 0) {
                    break label$1;
                }
                if ((this._loadInt8s((this._loadInt((_35_ + 64))))) != 46) {
                    break label$1;
                }
                if ((this._loadInt8s((this._loadInt((_35_ + 72))))) == 46) {
                    break label$1;
                }
                this._storeInt((_35_ + 76), 1);
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
                                        label$10:
                                        do {
                                            label$9:
                                            while (true) {
                                                if ((_34_ = this._storeInt((_35_ + 16), (pat_next((this._loadInt((_35_ + 72))), (this._loadInt((_35_ + 68))), (_35_ + 28), (this._loadInt((_35_ + 56))))))) == -5) {
                                                    break label$7;
                                                }
                                                if (_34_ == -2) {
                                                    break label$6;
                                                }
                                                if ((this._storeInt((_35_ + 12), (str_next((this._loadInt((_35_ + 64))), (this._loadInt((_35_ + 60))), (_35_ + 24))))) <= _33_) {
                                                    break label$8;
                                                }
                                                this._storeInt((_35_ + 64), ((this._loadInt((_35_ + 64))) + (this._loadInt((_35_ + 24)))));
                                                this._storeInt((_35_ + 60), ((this._loadInt((_35_ + 60))) - (this._loadInt((_35_ + 24)))));
                                                label$11:
                                                do {
                                                    label$12:
                                                    do {
                                                        if (((this._loadInt8u((_35_ + 56))) & 16) == 0) {
                                                            break label$12;
                                                        }
                                                        _34_ = casefold((this._loadInt((_35_ + 12))));
                                                        break label$11;
                                                    }
                                                    while (false);
                                                    _34_ = this._loadInt((_35_ + 12));
                                                }
                                                while (false);
                                                this._storeInt((_35_ + 8), _34_);
                                                label$13:
                                                do {
                                                    label$14:
                                                    do {
                                                        if ((this._loadInt((_35_ + 16))) != -3) {
                                                            break label$14;
                                                        }
                                                        if ((match_bracket((this._loadInt((_35_ + 72))), (this._loadInt((_35_ + 12))), (this._loadInt((_35_ + 8))))) != 0) {
                                                            break label$13;
                                                        }
                                                        break label$5;
                                                    }
                                                    while (false);
                                                    if ((this._loadInt((_35_ + 16))) == -4) {
                                                        break label$13;
                                                    }
                                                    if ((this._loadInt((_35_ + 12))) == (this._loadInt((_35_ + 16)))) {
                                                        break label$13;
                                                    }
                                                    if ((this._loadInt((_35_ + 8))) != (this._loadInt((_35_ + 16)))) {
                                                        break label$10;
                                                    }
                                                }
                                                while (false);
                                                this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + (this._loadInt((_35_ + 28)))));
                                                this._storeInt((_35_ + 68), ((this._loadInt((_35_ + 68))) - (this._loadInt((_35_ + 28)))));
                                                continue label$9;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_35_ + 76), 1);
                                        break label$0;
                                    }
                                    while (false);
                                    this._storeInt((_35_ + 76), (((this._loadInt((_35_ + 16))) != 0) ? 1 : 0));
                                    break label$0;
                                }
                                while (false);
                                this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + 1));
                                _34_ = this._storeInt((_35_ + 68), ((this._loadInt((_35_ + 68))) + -1));
                                this._storeInt((_35_ + 44), ((this._storeInt((_35_ + 68), (strnlen((this._loadInt((_35_ + 72))), _34_)))) + (this._loadInt((_35_ + 72)))));
                                this._storeInt((_35_ + 52), (this._storeInt((_35_ + 48), (this._loadInt((_35_ + 72))))));
                                label$15:
                                while (true) {
                                    if (((this._loadInt((_35_ + 52))) & 4294967295L) >= ((this._loadInt((_35_ + 44))) & 4294967295L)) {
                                        break label$4;
                                    }
                                    label$17:
                                    do {
                                        label$18:
                                        do {
                                            if ((_34_ = pat_next((_34_ = this._loadInt((_35_ + 52))), ((this._loadInt((_35_ + 44))) - _34_), (_35_ + 28), (this._loadInt((_35_ + 56))))) == -5) {
                                                break label$18;
                                            }
                                            if (_34_ == -2) {
                                                break label$3;
                                            }
                                            this._storeInt((_35_ + 20), ((this._loadInt((_35_ + 20))) + 1));
                                            break label$17;
                                        }
                                        while (false);
                                        this._storeInt((_35_ + 20), 0);
                                        this._storeInt((_35_ + 48), ((this._loadInt((_35_ + 52))) + 1));
                                    }
                                    while (false);
                                    this._storeInt((_35_ + 52), ((this._loadInt((_35_ + 52))) + (this._loadInt((_35_ + 28)))));
                                    continue label$15;
                                }
                            }
                            while (false);
                            this._storeInt((_35_ + 76), 1);
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_35_ + 76), 1);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_35_ + 32), ((this._storeInt((_35_ + 60), (strnlen((this._loadInt((_35_ + 64))), (this._loadInt((_35_ + 60))))))) + (this._loadInt((_35_ + 64)))));
                    if (((this._loadInt((_35_ + 60))) & 4294967295L) >= ((this._loadInt((_35_ + 20))) & 4294967295L)) {
                        break label$2;
                    }
                    this._storeInt((_35_ + 76), 1);
                    break label$0;
                }
                while (false);
                this._storeInt((_35_ + 76), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_35_ + 40), (this._loadInt((_35_ + 32))));
            label$20:
            do {
                label$19:
                while (true) {
                    _34_ = 0;
                    label$21:
                    do {
                        if (((this._loadInt((_35_ + 40))) & 4294967295L) <= ((this._loadInt((_35_ + 64))) & 4294967295L)) {
                            break label$21;
                        }
                        _34_ = ((this._loadInt((_35_ + 20))) != 0) ? 1 : 0;
                    }
                    while (false);
                    label$22:
                    do {
                        label$23:
                        do {
                            if (_34_ == 0) {
                                break label$23;
                            }
                            label$24:
                            do {
                                label$25:
                                do {
                                    if (((this._loadInt8s(((this._loadInt((_35_ + 40))) + -1))) & 4294967295L) < (128 & 4294967295L)) {
                                        break label$25;
                                    }
                                    _temp$0 = 4;
                                    _temp$1 = 1;
                                    _temp$2 = ((this._loadInt((this._loadInt(((__pthread_self$2e$83()) + 156))))) != 0) ? _temp$0 : _temp$1;
                                    _temp$2 = (_temp$2 != 1) ? 1 : 0;
                                    if (_temp$2 != 0) {
                                        break label$24;
                                    }
                                }
                                while (false);
                                this._storeInt((_35_ + 40), ((this._loadInt((_35_ + 40))) + -1));
                                break label$22;
                            }
                            while (false);
                            label$26:
                            while (true) {
                                _34_ = 0;
                                label$28:
                                do {
                                    if ((((this._loadInt8u((this._storeInt((_35_ + 40), ((this._loadInt((_35_ + 40))) + -1))))) + -128) & 4294967295L) > (63 & 4294967295L)) {
                                        break label$28;
                                    }
                                    _34_ = (((this._loadInt((_35_ + 40))) & 4294967295L) > ((this._loadInt((_35_ + 64))) & 4294967295L)) ? 1 : 0;
                                }
                                while (false);
                                if (_34_ != 0) {
                                    continue label$26;
                                }
                                break label$22;
                            }
                        }
                        while (false);
                        label$29:
                        do {
                            if ((this._loadInt((_35_ + 20))) == 0) {
                                break label$29;
                            }
                            this._storeInt((_35_ + 76), 1);
                            break label$20;
                        }
                        while (false);
                        this._storeInt((_35_ + 36), (this._loadInt((_35_ + 40))));
                        this._storeInt((_35_ + 52), (this._loadInt((_35_ + 48))));
                        label$30:
                        do {
                            label$31:
                            do {
                                label$32:
                                do {
                                    label$33$end:
                                    do {
                                        label$33:
                                        while (true) {
                                            this._storeInt((_35_ + 16), (pat_next((_34_ = this._loadInt((_35_ + 52))), ((this._loadInt((_35_ + 44))) - _34_), (_35_ + 28), (this._loadInt((_35_ + 56))))));
                                            this._storeInt((_35_ + 52), ((this._loadInt((_35_ + 52))) + (this._loadInt((_35_ + 28)))));
                                            if ((this._storeInt((_35_ + 12), (str_next((_34_ = this._loadInt((_35_ + 40))), ((this._loadInt((_35_ + 32))) - _34_), (_35_ + 24))))) <= 0) {
                                                break label$32;
                                            }
                                            this._storeInt((_35_ + 40), ((this._loadInt((_35_ + 40))) + (this._loadInt((_35_ + 24)))));
                                            label$35:
                                            do {
                                                label$36:
                                                do {
                                                    if (((this._loadInt8u((_35_ + 56))) & 16) == 0) {
                                                        break label$36;
                                                    }
                                                    _34_ = casefold((this._loadInt((_35_ + 12))));
                                                    break label$35;
                                                }
                                                while (false);
                                                _34_ = this._loadInt((_35_ + 12));
                                            }
                                            while (false);
                                            this._storeInt((_35_ + 8), _34_);
                                            label$37:
                                            do {
                                                if ((this._loadInt((_35_ + 16))) != -3) {
                                                    break label$37;
                                                }
                                                if ((match_bracket(((this._loadInt((_35_ + 52))) - (this._loadInt((_35_ + 28)))), (this._loadInt((_35_ + 12))), (this._loadInt((_35_ + 8))))) != 0) {
                                                    continue label$33;
                                                }
                                                break label$31;
                                            }
                                            while (false);
                                            if ((this._loadInt((_35_ + 16))) == -4) {
                                                continue label$33;
                                            }
                                            if ((this._loadInt((_35_ + 12))) == (this._loadInt((_35_ + 16)))) {
                                                continue label$33;
                                            }
                                            if ((this._loadInt((_35_ + 8))) == (this._loadInt((_35_ + 16)))) {
                                                continue label$33;
                                            }
                                            break label$33$end;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_35_ + 76), 1);
                                    break label$20;
                                }
                                while (false);
                                if ((this._loadInt((_35_ + 16))) == 0) {
                                    break label$30;
                                }
                                this._storeInt((_35_ + 76), 1);
                                break label$20;
                            }
                            while (false);
                            this._storeInt((_35_ + 76), 1);
                            break label$20;
                        }
                        while (false);
                        this._storeInt((_35_ + 32), (this._loadInt((_35_ + 36))));
                        this._storeInt((_35_ + 44), (this._loadInt((_35_ + 48))));
                        label$38:
                        do {
                            label$40:
                            do {
                                label$39:
                                while (true) {
                                    if (((this._loadInt((_35_ + 72))) & 4294967295L) >= ((this._loadInt((_35_ + 44))) & 4294967295L)) {
                                        break label$38;
                                    }
                                    this._storeInt((_35_ + 52), (this._loadInt((_35_ + 72))));
                                    this._storeInt((_35_ + 40), (this._loadInt((_35_ + 64))));
                                    label$41:
                                    do {
                                        label$43:
                                        do {
                                            label$42:
                                            while (true) {
                                                this._storeInt((_35_ + 16), (pat_next((_34_ = this._loadInt((_35_ + 52))), ((this._loadInt((_35_ + 44))) - _34_), (_35_ + 28), (this._loadInt((_35_ + 56))))));
                                                this._storeInt((_35_ + 52), ((this._loadInt((_35_ + 52))) + (this._loadInt((_35_ + 28)))));
                                                if ((this._loadInt((_35_ + 16))) == -5) {
                                                    break label$43;
                                                }
                                                if ((this._storeInt((_35_ + 12), (str_next((_34_ = this._loadInt((_35_ + 40))), ((this._loadInt((_35_ + 32))) - _34_), (_35_ + 24))))) == 0) {
                                                    break label$40;
                                                }
                                                label$44:
                                                do {
                                                    label$45:
                                                    do {
                                                        if (((this._loadInt8u((_35_ + 56))) & 16) == 0) {
                                                            break label$45;
                                                        }
                                                        _34_ = casefold((this._loadInt((_35_ + 12))));
                                                        break label$44;
                                                    }
                                                    while (false);
                                                    _34_ = this._loadInt((_35_ + 12));
                                                }
                                                while (false);
                                                this._storeInt((_35_ + 8), _34_);
                                                label$46:
                                                do {
                                                    label$47:
                                                    do {
                                                        if ((this._loadInt((_35_ + 16))) != -3) {
                                                            break label$47;
                                                        }
                                                        if ((match_bracket(((this._loadInt((_35_ + 52))) - (this._loadInt((_35_ + 28)))), (this._loadInt((_35_ + 12))), (this._loadInt((_35_ + 8))))) != 0) {
                                                            break label$46;
                                                        }
                                                        break label$41;
                                                    }
                                                    while (false);
                                                    if ((this._loadInt((_35_ + 16))) == -4) {
                                                        break label$46;
                                                    }
                                                    if ((this._loadInt((_35_ + 12))) == (this._loadInt((_35_ + 16)))) {
                                                        break label$46;
                                                    }
                                                    if ((this._loadInt((_35_ + 8))) != (this._loadInt((_35_ + 16)))) {
                                                        break label$41;
                                                    }
                                                }
                                                while (false);
                                                this._storeInt((_35_ + 40), ((this._loadInt((_35_ + 40))) + (this._loadInt((_35_ + 24)))));
                                                continue label$42;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_35_ + 72), (this._loadInt((_35_ + 52))));
                                        this._storeInt((_35_ + 64), (this._loadInt((_35_ + 40))));
                                    }
                                    while (false);
                                    if ((this._loadInt((_35_ + 16))) == -5) {
                                        continue label$39;
                                    }
                                    label$48:
                                    do {
                                        if ((this._storeInt((_35_ + 12), (str_next((_34_ = this._loadInt((_35_ + 64))), ((this._loadInt((_35_ + 32))) - _34_), (_35_ + 24))))) < 1) {
                                            break label$48;
                                        }
                                        this._storeInt((_35_ + 64), ((this._loadInt((_35_ + 64))) + (this._loadInt((_35_ + 24)))));
                                        continue label$39;
                                    }
                                    while (false);
                                    this._storeInt((_35_ + 64), ((this._loadInt((_35_ + 64))) + 1));
                                    label$49:
                                    while (true) {
                                        if ((str_next((_34_ = this._loadInt((_35_ + 64))), ((this._loadInt((_35_ + 32))) - _34_), (_35_ + 24))) > -1) {
                                            continue label$39;
                                        }
                                        this._storeInt((_35_ + 64), ((this._loadInt((_35_ + 64))) + 1));
                                        continue label$49;
                                    }
                                }
                            }
                            while (false);
                            this._storeInt((_35_ + 76), 1);
                            break label$20;
                        }
                        while (false);
                        this._storeInt((_35_ + 76), 0);
                        break label$20;
                    }
                    while (false);
                    this._storeInt((_35_ + 20), ((this._loadInt((_35_ + 20))) + -1));
                    continue label$19;
                }
            }
            while (false);
        }
        while (false);
        _34_ = this._loadInt((_35_ + 76));
        this._storeInt((0 + 4), (_35_ + 80));
        return _34_;
    }

    @Override()
    public final int str_next(int _30_, int _31_, int _32_)
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
                        if ((this._loadInt((_33_ + 20))) == 0) {
                            break label$3;
                        }
                        if (((this._loadInt8s((this._loadInt((_33_ + 24))))) & 4294967295L) < (128 & 4294967295L)) {
                            break label$2;
                        }
                        if ((this._storeInt((_33_ + 8), (this.mbtowc.invoke((_33_ + 12), (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))))))) <= -1) {
                            break label$1;
                        }
                        this._storeInt((this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 8))));
                        this._storeInt((_33_ + 28), (this._loadInt((_33_ + 12))));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_33_ + 28), (this._storeInt((this._loadInt((_33_ + 16))), 0)));
                    break label$0;
                }
                while (false);
                this._storeInt((this._loadInt((_33_ + 16))), 1);
                this._storeInt((_33_ + 28), (this._loadInt8s((this._loadInt((_33_ + 24))))));
                break label$0;
            }
            while (false);
            this._storeInt((this._loadInt((_33_ + 16))), 1);
            this._storeInt((_33_ + 28), -1);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int casefold(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this.towupper.invoke((this._storeInt((_31_ + 12), _30_)))))) != (this._loadInt((_31_ + 12)))) {
                    break label$1;
                }
                _30_ = this.towlower.invoke((this._loadInt((_31_ + 12))));
                break label$0;
            }
            while (false);
            _30_ = this._loadInt((_31_ + 8));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int match_bracket(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 72), _30_);
        this._storeInt((_33_ + 68), _31_);
        this._storeInt((_33_ + 64), _32_);
        this._storeInt((_33_ + 56), 0);
        this._storeInt((_33_ + 72), ((_32_ = this._loadInt((_33_ + 72))) + 1));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8s((_32_ + 1))) == 94) {
                    break label$1;
                }
                if ((this._loadInt8s((this._loadInt((_33_ + 72))))) != 33) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt((_33_ + 72), ((this._storeInt((_33_ + 56), 1)) + (this._loadInt((_33_ + 72)))));
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
                            if ((this._loadInt8s((this._loadInt((_33_ + 72))))) != 93) {
                                break label$6;
                            }
                            if ((this._loadInt((_33_ + 68))) != 93) {
                                break label$5;
                            }
                            this._storeInt((_33_ + 76), (((this._loadInt((_33_ + 56))) == 0) ? 1 : 0));
                            break label$2;
                        }
                        while (false);
                        if ((this._loadInt8s((this._loadInt((_33_ + 72))))) != 45) {
                            break label$3;
                        }
                        if ((this._loadInt((_33_ + 68))) != 45) {
                            break label$4;
                        }
                        this._storeInt((_33_ + 76), (((this._loadInt((_33_ + 56))) == 0) ? 1 : 0));
                        break label$2;
                    }
                    while (false);
                    this._storeInt((_33_ + 72), ((this._loadInt((_33_ + 72))) + 1));
                    break label$3;
                }
                while (false);
                this._storeInt((_33_ + 72), ((this._loadInt((_33_ + 72))) + 1));
            }
            while (false);
            this._storeInt((_33_ + 60), (this._loadInt8s(((this._loadInt((_33_ + 72))) + -1))));
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
                                label$13:
                                do {
                                    label$12:
                                    while (true) {
                                        if ((this._loadInt8s((this._loadInt((_33_ + 72))))) == 93) {
                                            break label$11;
                                        }
                                        label$14:
                                        do {
                                            label$15:
                                            do {
                                                if ((this._loadInt8s((this._loadInt((_33_ + 72))))) != 45) {
                                                    break label$15;
                                                }
                                                if ((this._loadInt8s(((this._loadInt((_33_ + 72))) + 1))) == 93) {
                                                    break label$15;
                                                }
                                                if ((this._storeInt((_33_ + 48), (this.mbtowc.invoke((_33_ + 52), ((this._loadInt((_33_ + 72))) + 1), 4)))) <= -1) {
                                                    break label$10;
                                                }
                                                label$16:
                                                do {
                                                    if (((this._loadInt((_33_ + 60))) & 4294967295L) > ((this._loadInt((_33_ + 52))) & 4294967295L)) {
                                                        break label$16;
                                                    }
                                                    if ((((this._loadInt((_33_ + 68))) - (_32_ = this._loadInt((_33_ + 60)))) & 4294967295L) <= (((this._loadInt((_33_ + 52))) - _32_) & 4294967295L)) {
                                                        break label$9;
                                                    }
                                                    if ((((this._loadInt((_33_ + 64))) - (_32_ = this._loadInt((_33_ + 60)))) & 4294967295L) <= (((this._loadInt((_33_ + 52))) - _32_) & 4294967295L)) {
                                                        break label$9;
                                                    }
                                                }
                                                while (false);
                                                this._storeInt((_33_ + 72), (((this._loadInt((_33_ + 72))) + (this._loadInt((_33_ + 48)))) + -1));
                                                break label$14;
                                            }
                                            while (false);
                                            label$17:
                                            do {
                                                if ((this._loadInt8s((this._loadInt((_33_ + 72))))) != 91) {
                                                    break label$17;
                                                }
                                                label$18:
                                                do {
                                                    if ((this._loadInt8s(((this._loadInt((_33_ + 72))) + 1))) == 58) {
                                                        break label$18;
                                                    }
                                                    if ((this._loadInt8s(((this._loadInt((_33_ + 72))) + 1))) == 46) {
                                                        break label$18;
                                                    }
                                                    if ((this._loadInt8s(((this._loadInt((_33_ + 72))) + 1))) != 61) {
                                                        break label$17;
                                                    }
                                                }
                                                while (false);
                                                this._storeInt((_33_ + 44), ((this._loadInt((_33_ + 72))) + 2));
                                                this._storeInt((_33_ + 40), (this._loadInt8s(((this._loadInt((_33_ + 72))) + 1))));
                                                this._storeInt((_33_ + 72), ((this._loadInt((_33_ + 72))) + 3));
                                                label$20:
                                                do {
                                                    label$19:
                                                    while (true) {
                                                        _32_ = 1;
                                                        label$21:
                                                        do {
                                                            if ((this._loadInt8s(((this._loadInt((_33_ + 72))) + -1))) != (this._loadInt((_33_ + 40)))) {
                                                                break label$21;
                                                            }
                                                            _32_ = ((this._loadInt8s((this._loadInt((_33_ + 72))))) != 93) ? 1 : 0;
                                                        }
                                                        while (false);
                                                        if (_32_ == 0) {
                                                            break label$20;
                                                        }
                                                        this._storeInt((_33_ + 72), ((this._loadInt((_33_ + 72))) + 1));
                                                        continue label$19;
                                                    }
                                                }
                                                while (false);
                                                if ((this._loadInt((_33_ + 40))) != 58) {
                                                    break label$14;
                                                }
                                                if ((((this._loadInt((_33_ + 72))) + -1) - (this._loadInt((_33_ + 44)))) > 15) {
                                                    break label$14;
                                                }
                                                memcpy((_33_ + 16), (_32_ = this._loadInt((_33_ + 44))), (((this._loadInt((_33_ + 72))) + -1) - _32_));
                                                this._storeInt8(((_33_ + 16) + (((this._loadInt((_33_ + 72))) + -1) - (this._loadInt((_33_ + 44))))), 0);
                                                if ((this.iswctype.invoke((this._loadInt((_33_ + 68))), (this.wctype.invoke((_33_ + 16))))) != 0) {
                                                    break label$7;
                                                }
                                                if ((this.iswctype.invoke((this._loadInt((_33_ + 64))), (this.wctype.invoke((_33_ + 16))))) == 0) {
                                                    break label$14;
                                                }
                                                break label$7;
                                            }
                                            while (false);
                                            label$22:
                                            do {
                                                label$23:
                                                do {
                                                    if (((this._loadInt8s((this._loadInt((_33_ + 72))))) & 4294967295L) > (127 & 4294967295L)) {
                                                        break label$23;
                                                    }
                                                    this._storeInt((_33_ + 60), (this._loadInt8u((this._loadInt((_33_ + 72))))));
                                                    break label$22;
                                                }
                                                while (false);
                                                if ((this._storeInt((_33_ + 12), (this.mbtowc.invoke((_33_ + 60), (this._loadInt((_33_ + 72))), 4)))) <= -1) {
                                                    break label$8;
                                                }
                                                this._storeInt((_33_ + 72), (((this._loadInt((_33_ + 72))) + (this._loadInt((_33_ + 12)))) + -1));
                                            }
                                            while (false);
                                            if ((this._loadInt((_33_ + 60))) == (this._loadInt((_33_ + 68)))) {
                                                break label$13;
                                            }
                                            if ((this._loadInt((_33_ + 60))) == (this._loadInt((_33_ + 64)))) {
                                                break label$13;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_33_ + 72), ((this._loadInt((_33_ + 72))) + 1));
                                        continue label$12;
                                    }
                                }
                                while (false);
                                this._storeInt((_33_ + 76), (((this._loadInt((_33_ + 56))) == 0) ? 1 : 0));
                                break label$2;
                            }
                            while (false);
                            this._storeInt((_33_ + 76), (this._loadInt((_33_ + 56))));
                            break label$2;
                        }
                        while (false);
                        this._storeInt((_33_ + 76), 0);
                        break label$2;
                    }
                    while (false);
                    this._storeInt((_33_ + 76), (((this._loadInt((_33_ + 56))) == 0) ? 1 : 0));
                    break label$2;
                }
                while (false);
                this._storeInt((_33_ + 76), 0);
                break label$2;
            }
            while (false);
            this._storeInt((_33_ + 76), (((this._loadInt((_33_ + 56))) == 0) ? 1 : 0));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 76));
        this._storeInt((0 + 4), (_33_ + 80));
        return _32_;
    }

    @Override()
    public final int __pthread_self$2e$83()
    {
        return (this.pthread_self.invoke());
    }

    @Override()
    public final int fopen(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((strchr(9888, (this._loadInt8s((this._storeInt((_32_ + 20), _31_)))))) == 0) {
                            break label$3;
                        }
                        _31_ = this._storeInt((_32_ + 8), (__fmodeflags((this._loadInt((_32_ + 20))))));
                        if ((this._storeInt((_32_ + 12), (__syscall_ret((this.__syscall3.invoke(5, (this._loadInt((_32_ + 24))), (_31_ | 32768), 438)))))) <= -1) {
                            break label$2;
                        }
                        label$4:
                        do {
                            if (((this._loadInt8u((_32_ + 10))) & 8) == 0) {
                                break label$4;
                            }
                            this.__syscall3.invoke(221, (this._loadInt((_32_ + 12))), 2, 1);
                        }
                        while (false);
                        if ((this._storeInt((_32_ + 16), (this.__fdopen.invoke((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 20))))))) == 0) {
                            break label$1;
                        }
                        this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((__errno_location()), 22);
                    this._storeInt((_32_ + 28), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            this.__syscall1.invoke(6, (this._loadInt((_32_ + 12))));
            this._storeInt((_32_ + 28), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int fputc(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt(((this._storeInt((_32_ + 4), _31_)) + 76))) < 0) {
                            break label$3;
                        }
                        if ((this.__lockfile.invoke((this._loadInt((_32_ + 4))))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt((_32_ + 8))) == (this._loadInt8s(((this._loadInt((_32_ + 4))) + 75)))) {
                            break label$2;
                        }
                        if (((this._loadInt(((_31_ = this._loadInt((_32_ + 4))) + 20))) & 4294967295L) >= ((this._loadInt((_31_ + 16))) & 4294967295L)) {
                            break label$2;
                        }
                        this._storeInt(((_31_ = this._loadInt((_32_ + 4))) + 20), ((_30_ = this._loadInt((_31_ + 20))) + 1));
                        this._storeInt8(_30_, (_31_ = this._loadInt8u((_32_ + 8))));
                        break label$1;
                    }
                    while (false);
                    label$4:
                    do {
                        if ((this._loadInt((_32_ + 8))) == (this._loadInt8s(((this._loadInt((_32_ + 4))) + 75)))) {
                            break label$4;
                        }
                        if (((this._loadInt(((_31_ = this._loadInt((_32_ + 4))) + 20))) & 4294967295L) >= ((this._loadInt((_31_ + 16))) & 4294967295L)) {
                            break label$4;
                        }
                        this._storeInt(((_31_ = this._loadInt((_32_ + 4))) + 20), ((_31_ = this._loadInt((_31_ + 20))) + 1));
                        this._storeInt((_32_ + 12), (this._storeInt8(_31_, (this._loadInt8u((_32_ + 8))))));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_32_ + 12), (__overflow((this._loadInt((_32_ + 4))), (this._loadInt((_32_ + 8))))));
                    break label$0;
                }
                while (false);
                _31_ = __overflow((this._loadInt((_32_ + 4))), (this._loadInt((_32_ + 8))));
            }
            while (false);
            this._storeInt((_32_ + 8), _31_);
            this.__unlockfile.invoke((this._loadInt((_32_ + 4))));
            this._storeInt((_32_ + 12), (this._loadInt((_32_ + 8))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int fputs(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = fwrite((_31_ = this._loadInt((_32_ + 12))), (strlen(_31_)), 1, (this._loadInt((_32_ + 8))));
        this._storeInt((0 + 4), (_32_ + 16));
        return (_31_ + -1);
    }

    @Override()
    public final int fread(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_34_ + 36), _31_);
        this._storeInt((_34_ + 32), _32_);
        this._storeInt((_34_ + 28), _33_);
        this._storeInt((_34_ + 24), (this._loadInt((_34_ + 40))));
        this._storeInt((_34_ + 16), (this._storeInt((_34_ + 20), ((this._loadInt((_34_ + 36))) * (this._loadInt((_34_ + 32)))))));
        _33_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_34_ + 28))) + 76))) < 0) {
                break label$0;
            }
            _33_ = this.__lockfile.invoke((this._loadInt((_34_ + 28))));
        }
        while (false);
        this._storeInt((_34_ + 8), _33_);
        this._storeInt8(((_33_ = this._loadInt((_34_ + 28))) + 74), ((_32_ = this._loadInt8s((_33_ + 74))) | (_32_ + -1)));
        label$1:
        do {
            if (((this._loadInt((_33_ + 8))) - (this._loadInt((_33_ + 4)))) < 1) {
                break label$1;
            }
            label$2:
            do {
                label$3:
                do {
                    if ((((this._loadInt(((_33_ = this._loadInt((_34_ + 28))) + 8))) - (this._loadInt((_33_ + 4)))) & 4294967295L) >= ((this._loadInt((_34_ + 16))) & 4294967295L)) {
                        break label$3;
                    }
                    _33_ = (this._loadInt(((_33_ = this._loadInt((_34_ + 28))) + 8))) - (this._loadInt((_33_ + 4)));
                    break label$2;
                }
                while (false);
                _33_ = this._loadInt((_34_ + 16));
            }
            while (false);
            this._storeInt((_34_ + 12), _33_);
            memcpy((this._loadInt((_34_ + 24))), (this._loadInt(((this._loadInt((_34_ + 28))) + 4))), _33_);
            this._storeInt(((_33_ = this._loadInt((_34_ + 28))) + 4), ((this._loadInt((_33_ + 4))) + (_33_ = this._loadInt((_34_ + 12)))));
            this._storeInt((_34_ + 24), (_33_ + (this._loadInt((_34_ + 24)))));
            this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) - (this._loadInt((_34_ + 12)))));
        }
        while (false);
        label$4:
        do {
            label$5:
            do {
                label$7:
                do {
                    label$6:
                    while (true) {
                        if ((this._loadInt((_34_ + 16))) == 0) {
                            break label$5;
                        }
                        _33_ = 0;
                        label$8:
                        do {
                            if ((__toread((this._loadInt((_34_ + 28))))) != 0) {
                                break label$8;
                            }
                            _33_ = this._iiiiTable[this._tableIndices[this._loadInt(((_33_ = this._loadInt((_34_ + 28))) + 32))]].invoke(_33_, (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 16))));
                        }
                        while (false);
                        if ((((this._storeInt((_34_ + 12), _33_)) + 1) & 4294967295L) <= (1 & 4294967295L)) {
                            break label$7;
                        }
                        this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) - (this._loadInt((_34_ + 12)))));
                        this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + (this._loadInt((_34_ + 12)))));
                        continue label$6;
                    }
                }
                while (false);
                label$9:
                do {
                    if ((this._loadInt((_34_ + 8))) == 0) {
                        break label$9;
                    }
                    this.__unlockfile.invoke((this._loadInt((_34_ + 28))));
                }
                while (false);
                this._storeInt((_34_ + 44), (((this._loadInt((_34_ + 20))) - (this._loadInt((_34_ + 16)))) / (this._loadInt((_34_ + 36)))));
                break label$4;
            }
            while (false);
            label$10:
            do {
                if ((this._loadInt((_34_ + 8))) == 0) {
                    break label$10;
                }
                this.__unlockfile.invoke((this._loadInt((_34_ + 28))));
            }
            while (false);
            this._storeInt((_34_ + 44), (this._loadInt((_34_ + 32))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int freopen(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        this._storeInt((_33_ + 12), (__fmodeflags((this._loadInt((_33_ + 20))))));
        _32_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_33_ + 16))) + 76))) < 0) {
                break label$0;
            }
            _32_ = this.__lockfile.invoke((this._loadInt((_33_ + 16))));
        }
        while (false);
        this._storeInt((_33_ + 4), _32_);
        fflush((this._loadInt((_33_ + 16))));
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
                                    if ((this._loadInt((_33_ + 24))) == 0) {
                                        break label$7;
                                    }
                                    if ((this._storeInt((_33_ + 8), (fopen((this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))))))) == 0) {
                                        break label$2;
                                    }
                                    if ((this._loadInt(((this._loadInt((_33_ + 8))) + 60))) != (this._loadInt(((this._loadInt((_33_ + 16))) + 60)))) {
                                        break label$6;
                                    }
                                    this._storeInt(((this._loadInt((_33_ + 8))) + 60), -1);
                                    break label$5;
                                }
                                while (false);
                                label$8:
                                do {
                                    if (((this._loadInt8u((_33_ + 14))) & 8) == 0) {
                                        break label$8;
                                    }
                                    this.__syscall3.invoke(221, (this._loadInt(((this._loadInt((_33_ + 16))) + 60))), 2, 1);
                                }
                                while (false);
                                _32_ = this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) & -524481));
                                if ((__syscall_ret((this.__syscall3.invoke(221, (this._loadInt(((this._loadInt((_33_ + 16))) + 60))), 4, _32_)))) >= 0) {
                                    break label$4;
                                }
                                break label$2;
                            }
                            while (false);
                            if ((__dup3((this._loadInt(((this._loadInt((_33_ + 8))) + 60))), (this._loadInt(((this._loadInt((_33_ + 16))) + 60))), ((this._loadInt((_33_ + 12))) & 524288))) < 0) {
                                break label$3;
                            }
                        }
                        while (false);
                        this._storeInt((_32_ = this._loadInt((_33_ + 16))), (((this._loadInt(_32_)) & 1) | (this._loadInt((this._loadInt((_33_ + 8)))))));
                        this._storeInt(((this._loadInt((_33_ + 16))) + 32), (this._loadInt(((this._loadInt((_33_ + 8))) + 32))));
                        this._storeInt(((this._loadInt((_33_ + 16))) + 36), (this._loadInt(((this._loadInt((_33_ + 8))) + 36))));
                        this._storeInt(((this._loadInt((_33_ + 16))) + 40), (this._loadInt(((this._loadInt((_33_ + 8))) + 40))));
                        this._storeInt(((this._loadInt((_33_ + 16))) + 12), (this._loadInt(((this._loadInt((_33_ + 8))) + 12))));
                        fclose((this._loadInt((_33_ + 8))));
                    }
                    while (false);
                    label$9:
                    do {
                        if ((this._loadInt((_33_ + 4))) == 0) {
                            break label$9;
                        }
                        this.__unlockfile.invoke((this._loadInt((_33_ + 16))));
                    }
                    while (false);
                    this._storeInt((_33_ + 28), (this._loadInt((_33_ + 16))));
                    break label$1;
                }
                while (false);
                fclose((this._loadInt((_33_ + 8))));
            }
            while (false);
            fclose((this._loadInt((_33_ + 16))));
            this._storeInt((_33_ + 28), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final double frexp(double _30_, int _31_)
    {
        int _32_ = 0;
        this._storeDouble(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), _30_);
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
                        label$4:
                        do {
                            if ((this._storeInt((_32_ + 12), ((int) (((this._loadLong((_32_ + 16))) >>> 52L) & 2047L)))) == 0) {
                                break label$4;
                            }
                            if ((this._loadInt((_32_ + 12))) != 2047) {
                                break label$3;
                            }
                            this._storeDouble((_32_ + 40), (this._loadDouble((_32_ + 32))));
                            break label$0;
                        }
                        while (false);
                        if ((this._loadDouble((_32_ + 32))) == 0.0) {
                            break label$2;
                        }
                        this._storeDouble((_32_ + 32), (frexp(((this._loadDouble((_32_ + 32))) * 1.8446744073709552E19), (this._loadInt((_32_ + 28))))));
                        this._storeInt((_31_ = this._loadInt((_32_ + 28))), ((this._loadInt(_31_)) + -64));
                        break label$1;
                    }
                    while (false);
                    this._storeInt((this._loadInt((_32_ + 28))), ((this._loadInt((_32_ + 12))) + -1022));
                    this._storeLong((_32_ + 16), ((this._storeLong((_32_ + 16), ((this._loadLong((_32_ + 16))) & -9218868437227405313L))) | 4602678819172646912L));
                    this._storeDouble((_32_ + 40), (this._loadDouble((_32_ + 16))));
                    break label$0;
                }
                while (false);
                this._storeInt((this._loadInt((_32_ + 28))), 0);
            }
            while (false);
            this._storeDouble((_32_ + 40), (this._loadDouble((_32_ + 32))));
        }
        while (false);
        _30_ = this._loadDouble((_32_ + 40));
        this._storeInt((0 + 4), (_32_ + 48));
        return _30_;
    }

    @Override()
    public final float frexpf(float _30_, int _31_)
    {
        int _32_ = 0;
        this._storeFloat(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
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
                        label$4:
                        do {
                            if ((this._storeInt((_32_ + 12), (((this._loadInt((_32_ + 16))) >>> 23) & 255))) == 0) {
                                break label$4;
                            }
                            if ((this._loadInt((_32_ + 12))) != 255) {
                                break label$3;
                            }
                            this._storeFloat((_32_ + 28), (this._loadFloat((_32_ + 24))));
                            break label$0;
                        }
                        while (false);
                        if ((this._loadFloat((_32_ + 24))) == 0.0f) {
                            break label$2;
                        }
                        this._storeFloat((_32_ + 24), (frexpf(((float) (((double) (this._loadFloat((_32_ + 24)))) * 1.8446744073709552E19)), (this._loadInt((_32_ + 20))))));
                        this._storeInt((_31_ = this._loadInt((_32_ + 20))), ((this._loadInt(_31_)) + -64));
                        break label$1;
                    }
                    while (false);
                    this._storeInt((this._loadInt((_32_ + 20))), ((this._loadInt((_32_ + 12))) + -126));
                    this._storeInt((_32_ + 16), ((this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) & -2139095041))) | 1056964608));
                    this._storeFloat((_32_ + 28), (this._loadFloat((_32_ + 16))));
                    break label$0;
                }
                while (false);
                this._storeInt((this._loadInt((_32_ + 20))), 0);
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
    public final void frexpl(int _30_, long _31_, long _32_, int _33_)
    {
        int _34_ = 0;
        this._storeLong(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), _31_);
        this._storeInt((_34_ + 28), _33_);
        this._storeLong((_34_ + 40), _32_);
        this.__extenddftf2.invoke((_34_ + 8), (frexp((this.__trunctfdf2.invoke((this._loadLong((_34_ + 32))), _32_)), _33_)));
        this._storeLong((_30_ + 8), (this._loadLong(((_34_ + 8) + 8))));
        this._storeLong(_30_, (this._loadLong((_34_ + 8))));
        this._storeInt((0 + 4), (_34_ + 48));
        return;
    }

    @Override()
    public final int __fseeko_unlocked(int _30_, long _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeLong((_33_ + 16), _31_);
        label$0:
        do {
            if ((this._storeInt((_33_ + 12), _32_)) != 1) {
                break label$0;
            }
            this._storeLong((_33_ + 16), ((this._loadLong((_33_ + 16))) - ((long) ((this._loadInt(((_32_ = this._loadInt((_33_ + 24))) + 8))) - (this._loadInt((_32_ + 4)))))));
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                label$3:
                do {
                    if (((this._loadInt(((_32_ = this._loadInt((_33_ + 24))) + 20))) & 4294967295L) <= ((this._loadInt((_32_ + 28))) & 4294967295L)) {
                        break label$3;
                    }
                    this._iiiiTable[this._tableIndices[this._loadInt(((_32_ = this._loadInt((_33_ + 24))) + 36))]].invoke(_32_, 0, 0);
                    if ((this._loadInt(((this._loadInt((_33_ + 24))) + 20))) == 0) {
                        break label$2;
                    }
                }
                while (false);
                _30_ = this._storeInt(((_32_ = this._loadInt((_33_ + 24))) + 20), (this._storeInt((_32_ + 16), (this._storeInt((_32_ + 28), 0)))));
                label$4:
                do {
                    if ((this._liliTable[this._tableIndices[this._loadInt((_32_ + 40))]].invoke(_32_, (this._loadLong((_33_ + 16))), (this._loadInt((_33_ + 12))))) <= -1L) {
                        break label$4;
                    }
                    this._storeLong(((_32_ = this._loadInt((_33_ + 24))) + 4), 0L);
                    this._storeInt(_32_, ((this._loadInt(_32_)) & -17));
                    this._storeInt((_33_ + 28), _30_);
                    break label$1;
                }
                while (false);
                this._storeInt((_33_ + 28), -1);
                break label$1;
            }
            while (false);
            this._storeInt((_33_ + 28), -1);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int __fseeko(int _30_, long _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeLong((_33_ + 16), _31_);
        this._storeInt((_33_ + 12), _32_);
        _32_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_33_ + 28))) + 76))) < 0) {
                break label$0;
            }
            _32_ = this.__lockfile.invoke((this._loadInt((_33_ + 28))));
        }
        while (false);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt((_33_ + 8), (__fseeko_unlocked((this._loadInt((_33_ + 28))), (this._loadLong((_33_ + 16))), (this._loadInt((_33_ + 12))))));
        label$1:
        do {
            if ((this._loadInt((_33_ + 4))) == 0) {
                break label$1;
            }
            this.__unlockfile.invoke((this._loadInt((_33_ + 28))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 8));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int fseek(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = __fseeko((this._loadInt((_33_ + 12))), (this._loadLong32s((_33_ + 8))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int fsetpos(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = __fseeko((this._loadInt((_32_ + 12))), (this._loadLong(_31_)), 0);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int fsync(int _30_)
    {
        int _31_ = 0;
        _30_ = __syscall_ret((this.__syscall_cp.invoke(118, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 0, 0, 0, 0, 0)));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final long __ftello_unlocked(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        long _33_ = 0L;
        int _34_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        long _temp$3 = 0L;
        int _temp$4 = 0;
        _32_ = this._loadInt(((_30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 20), _30_)) + 40));
        _34_ = 0;
        label$0:
        do {
            if (((this._loadInt8u(_30_)) & 128) == 0) {
                break label$0;
            }
            _34_ = (((this._loadInt(((_34_ = this._loadInt((_31_ + 20))) + 20))) & 4294967295L) > ((this._loadInt((_34_ + 28))) & 4294967295L)) ? 1 : 0;
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                _temp$0 = 2;
                _temp$1 = 1;
                _temp$2 = (_34_ != 0) ? _temp$0 : _temp$1;
                _temp$3 = this._liliTable[this._tableIndices[_32_]].invoke(_30_, 0L, _temp$2);
                _temp$3 = this._storeLong((_31_ + 8), _temp$3);
                _temp$4 = (_temp$3 <= -1L) ? 1 : 0;
                if (_temp$4 != 0) {
                    break label$2;
                }
                this._storeLong((_31_ + 24), (((this._loadLong((_31_ + 8))) - ((long) ((this._loadInt(((_30_ = this._loadInt((_31_ + 20))) + 8))) - (this._loadInt((_30_ + 4)))))) + ((long) ((this._loadInt((_30_ + 20))) - (this._loadInt((_30_ + 28)))))));
                break label$1;
            }
            while (false);
            this._storeLong((_31_ + 24), (this._loadLong((_31_ + 8))));
        }
        while (false);
        _33_ = this._loadLong((_31_ + 24));
        this._storeInt((0 + 4), (_31_ + 32));
        return _33_;
    }

    @Override()
    public final long __ftello(int _30_)
    {
        int _31_ = 0;
        long _32_ = 0L;
        int _33_ = 0;
        _33_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_)) + 76))) < 0) {
                break label$0;
            }
            _33_ = this.__lockfile.invoke((this._loadInt((_31_ + 28))));
        }
        while (false);
        this._storeInt((_31_ + 12), _33_);
        this._storeLong((_31_ + 16), (__ftello_unlocked((this._loadInt((_31_ + 28))))));
        label$1:
        do {
            if ((this._loadInt((_31_ + 12))) == 0) {
                break label$1;
            }
            this.__unlockfile.invoke((this._loadInt((_31_ + 28))));
        }
        while (false);
        _32_ = this._loadLong((_31_ + 16));
        this._storeInt((0 + 4), (_31_ + 32));
        return _32_;
    }

    @Override()
    public final int ftell(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeLong((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))), (__ftello((this._storeInt((_31_ + 8), _30_)))))) < 2147483648L) {
                    break label$1;
                }
                this._storeInt((__errno_location()), 75);
                this._storeInt((_31_ + 12), -1);
                break label$0;
            }
            while (false);
            this._storeLong32((_31_ + 12), (this._loadLong(_31_)));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int ftruncate(int _30_, long _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeLong((_32_ + 16), _31_);
        _30_ = this._loadInt((_32_ + 28));
        this._storeLong((_32_ + 8), _31_);
        _33_ = this._loadInt((_32_ + 8));
        this._storeLong(_32_, (this._loadLong((_32_ + 16))));
        _30_ = __syscall_ret((this.__syscall4.invoke(93, _30_, 0, _33_, (this._loadInt((_32_ + 4))))));
        this._storeInt((0 + 4), (_32_ + 32));
        return _30_;
    }

    @Override()
    public final int __fwritex(int _30_, int _31_, int _32_)
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
                if ((this._loadInt(((this._loadInt((_33_ + 16))) + 16))) != 0) {
                    break label$1;
                }
                if ((__towrite((this._loadInt((_33_ + 16))))) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 28), 0);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_33_ + 20))) & 4294967295L) <= (((this._loadInt(((_32_ = this._loadInt((_33_ + 16))) + 16))) - (this._loadInt((_32_ + 20)))) & 4294967295L)) {
                    break label$2;
                }
                this._storeInt((_33_ + 28), (this._iiiiTable[this._tableIndices[this._loadInt(((_32_ = this._loadInt((_33_ + 16))) + 36))]].invoke(_32_, (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt8s(((this._loadInt((_33_ + 16))) + 75))) < 0) {
                    break label$3;
                }
                this._storeInt((_33_ + 12), (this._loadInt((_33_ + 20))));
                label$5:
                do {
                    label$4:
                    while (true) {
                        _32_ = 0;
                        label$6:
                        do {
                            if ((this._loadInt((_33_ + 12))) == 0) {
                                break label$6;
                            }
                            _32_ = ((this._loadInt8u((((this._loadInt((_33_ + 24))) + (this._loadInt((_33_ + 12)))) + -1))) != 10) ? 1 : 0;
                        }
                        while (false);
                        if (_32_ == 0) {
                            break label$5;
                        }
                        this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + -1));
                        continue label$4;
                    }
                }
                while (false);
                if ((this._loadInt((_33_ + 12))) == 0) {
                    break label$3;
                }
                label$7:
                do {
                    if (((this._iiiiTable[this._tableIndices[this._loadInt(((_32_ = this._loadInt((_33_ + 16))) + 36))]].invoke(_32_, (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 12))))) & 4294967295L) >= ((this._loadInt((_33_ + 12))) & 4294967295L)) {
                        break label$7;
                    }
                    this._storeInt((_33_ + 28), (this._loadInt((_33_ + 12))));
                    break label$0;
                }
                while (false);
                this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + (this._loadInt((_33_ + 12)))));
                this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) - (this._loadInt((_33_ + 12)))));
            }
            while (false);
            memcpy((this._loadInt(((this._loadInt((_33_ + 16))) + 20))), (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))));
            this._storeInt(((_32_ = this._loadInt((_33_ + 16))) + 20), ((this._loadInt((_32_ + 20))) + (_32_ = this._loadInt((_33_ + 20)))));
            this._storeInt((_33_ + 28), (_32_ + (this._loadInt((_33_ + 12)))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int fwrite(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        this._storeInt((_34_ + 8), ((this._loadInt((_34_ + 24))) * (this._loadInt((_34_ + 20)))));
        _33_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_34_ + 16))) + 76))) < 0) {
                break label$0;
            }
            _33_ = this.__lockfile.invoke((this._loadInt((_34_ + 16))));
        }
        while (false);
        this._storeInt((_34_ + 4), _33_);
        this._storeInt((_34_ + 12), (__fwritex((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 16))))));
        label$1:
        do {
            if ((this._loadInt((_34_ + 4))) == 0) {
                break label$1;
            }
            this.__unlockfile.invoke((this._loadInt((_34_ + 16))));
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                if ((this._loadInt((_34_ + 12))) != (this._loadInt((_34_ + 8)))) {
                    break label$3;
                }
                _33_ = this._loadInt((_34_ + 20));
                break label$2;
            }
            while (false);
            _33_ = (this._loadInt((_34_ + 12))) / (this._loadInt((_34_ + 24)));
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final int gcvt(double _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeDouble(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        _31_ = this._loadInt((_33_ + 20));
        this._storeDouble((_33_ + 8), (this._loadDouble((_33_ + 24))));
        this._storeInt(_33_, _31_);
        this.sprintf.invoke(_32_, 9904, _33_);
        _32_ = this._loadInt((_33_ + 16));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int getc(int _30_)
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
                        if ((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)) + 76))) < 0) {
                            break label$3;
                        }
                        if ((this.__lockfile.invoke((this._loadInt((_31_ + 8))))) == 0) {
                            break label$3;
                        }
                        if (((this._loadInt(((_30_ = this._loadInt((_31_ + 8))) + 4))) & 4294967295L) >= ((this._loadInt((_30_ + 8))) & 4294967295L)) {
                            break label$2;
                        }
                        this._storeInt(((_30_ = this._loadInt((_31_ + 8))) + 4), ((_30_ = this._loadInt((_30_ + 4))) + 1));
                        _30_ = this._loadInt8u(_30_);
                        break label$1;
                    }
                    while (false);
                    label$4:
                    do {
                        if (((this._loadInt(((_30_ = this._loadInt((_31_ + 8))) + 4))) & 4294967295L) >= ((this._loadInt((_30_ + 8))) & 4294967295L)) {
                            break label$4;
                        }
                        this._storeInt(((_30_ = this._loadInt((_31_ + 8))) + 4), ((_30_ = this._loadInt((_30_ + 4))) + 1));
                        this._storeInt((_31_ + 12), (this._loadInt8u(_30_)));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_31_ + 12), (__uflow((this._loadInt((_31_ + 8))))));
                    break label$0;
                }
                while (false);
                _30_ = __uflow((this._loadInt((_31_ + 8))));
            }
            while (false);
            this._storeInt((_31_ + 4), _30_);
            this.__unlockfile.invoke((this._loadInt((_31_ + 8))));
            this._storeInt((_31_ + 12), (this._loadInt((_31_ + 4))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int getc_unlocked(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt(((_30_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) + 4))) & 4294967295L) >= ((this._loadInt((_30_ + 8))) & 4294967295L)) {
                    break label$1;
                }
                this._storeInt(((_30_ = this._loadInt((_31_ + 12))) + 4), ((_30_ = this._loadInt((_30_ + 4))) + 1));
                _30_ = this._loadInt8u(_30_);
                break label$0;
            }
            while (false);
            _30_ = __uflow((this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int getchar()
    {
        return (fgetc((this._loadInt((0 + 14932)))));
    }

    @Override()
    public final int getchar_unlocked()
    {
        int _30_ = 0;
        int _31_ = 0;
        label$0:
        do {
            if (((this._loadInt(((_30_ = this._loadInt((0 + 14932))) + 4))) & 4294967295L) >= ((this._loadInt((_30_ + 8))) & 4294967295L)) {
                break label$0;
            }
            this._storeInt((_30_ + 4), ((_31_ = this._loadInt((_30_ + 4))) + 1));
            return (this._loadInt8u(_31_));
        }
        while (false);
        return (__uflow(_30_));
    }

    @Override()
    public final int getdelim(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_34_ + 36), _31_);
        this._storeInt((_34_ + 32), _32_);
        this._storeInt((_34_ + 28), _33_);
        _33_ = 0;
        _32_ = this._storeInt((_34_ + 12), 0);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_34_ + 28))) + 76))) < _32_) {
                break label$0;
            }
            _33_ = this.__lockfile.invoke((this._loadInt((_34_ + 28))));
        }
        while (false);
        this._storeInt((_34_ + 4), _33_);
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
                                if ((this._loadInt((_34_ + 36))) == 0) {
                                    break label$6;
                                }
                                if ((this._loadInt((_34_ + 40))) == 0) {
                                    break label$6;
                                }
                                label$7:
                                do {
                                    if ((this._loadInt((this._loadInt((_34_ + 40))))) != 0) {
                                        break label$7;
                                    }
                                    this._storeInt((this._loadInt((_34_ + 36))), 0);
                                }
                                while (false);
                                label$8:
                                while (true) {
                                    label$10:
                                    do {
                                        label$11:
                                        do {
                                            if ((this._storeInt((_34_ + 20), (memchr((_32_ = this._loadInt(((_33_ = this._loadInt((_34_ + 28))) + 4))), (this._loadInt((_34_ + 32))), ((this._loadInt((_33_ + 8))) - _32_))))) == 0) {
                                                break label$11;
                                            }
                                            _33_ = ((this._loadInt((_34_ + 20))) - (this._loadInt(((this._loadInt((_34_ + 28))) + 4)))) + 1;
                                            break label$10;
                                        }
                                        while (false);
                                        _33_ = (this._loadInt(((_33_ = this._loadInt((_34_ + 28))) + 8))) - (this._loadInt((_33_ + 4)));
                                    }
                                    while (false);
                                    label$12:
                                    do {
                                        if (((((this._storeInt((_34_ + 16), _33_)) + (this._loadInt((_34_ + 12)))) + 1) & 4294967295L) < ((this._loadInt((this._loadInt((_34_ + 36))))) & 4294967295L)) {
                                            break label$12;
                                        }
                                        if (((this._loadInt((_34_ + 16))) & 4294967295L) >= ((2147483647 - (this._loadInt((_34_ + 12)))) & 4294967295L)) {
                                            break label$3;
                                        }
                                        this._storeInt(_34_, (((this._loadInt((_34_ + 12))) + (this._loadInt((_34_ + 16)))) + 2));
                                        label$13:
                                        do {
                                            if ((this._loadInt((_34_ + 20))) != 0) {
                                                break label$13;
                                            }
                                            if (((this._loadInt(_34_)) & 4294967295L) > (1073741822 & 4294967295L)) {
                                                break label$13;
                                            }
                                            this._storeInt(_34_, ((_33_ = this._loadInt(_34_)) + (_33_ >>> 1)));
                                        }
                                        while (false);
                                        label$14:
                                        do {
                                            if ((this._storeInt((_34_ + 24), (realloc((this._loadInt((this._loadInt((_34_ + 40))))), (this._loadInt(_34_)))))) != 0) {
                                                break label$14;
                                            }
                                            _33_ = this._storeInt(_34_, (((this._loadInt((_34_ + 12))) + (this._loadInt((_34_ + 16)))) + 2));
                                            if ((this._storeInt((_34_ + 24), (realloc((this._loadInt((this._loadInt((_34_ + 40))))), _33_)))) == 0) {
                                                break label$3;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 24))));
                                        this._storeInt((this._loadInt((_34_ + 36))), (this._loadInt(_34_)));
                                    }
                                    while (false);
                                    memcpy(((this._loadInt((this._loadInt((_34_ + 40))))) + (this._loadInt((_34_ + 12)))), (this._loadInt(((this._loadInt((_34_ + 28))) + 4))), (this._loadInt((_34_ + 16))));
                                    this._storeInt(((_33_ = this._loadInt((_34_ + 28))) + 4), ((this._loadInt((_33_ + 4))) + (_33_ = this._loadInt((_34_ + 16)))));
                                    this._storeInt((_34_ + 12), (_33_ + (this._loadInt((_34_ + 12)))));
                                    if ((this._loadInt((_34_ + 20))) != 0) {
                                        break label$4;
                                    }
                                    label$15:
                                    do {
                                        label$16:
                                        do {
                                            if (((this._loadInt(((_33_ = this._loadInt((_34_ + 28))) + 4))) & 4294967295L) >= ((this._loadInt((_33_ + 8))) & 4294967295L)) {
                                                break label$16;
                                            }
                                            this._storeInt(((_33_ = this._loadInt((_34_ + 28))) + 4), ((_33_ = this._loadInt((_33_ + 4))) + 1));
                                            _33_ = this._loadInt8u(_33_);
                                            break label$15;
                                        }
                                        while (false);
                                        _33_ = __uflow((this._loadInt((_34_ + 28))));
                                    }
                                    while (false);
                                    if ((this._storeInt((_34_ + 8), _33_)) == -1) {
                                        break label$5;
                                    }
                                    _33_ = this._loadInt8s((_34_ + 8));
                                    this._storeInt((_34_ + 12), ((_32_ = this._loadInt((_34_ + 12))) + 1));
                                    if ((this._storeInt8((_32_ + (this._loadInt((this._loadInt((_34_ + 40)))))), _33_)) != (this._loadInt((_34_ + 32)))) {
                                        continue label$8;
                                    }
                                    break label$4;
                                }
                            }
                            while (false);
                            this._storeInt((_33_ = this._loadInt((_34_ + 28))), ((this._loadInt(_33_)) | 32));
                            label$17:
                            do {
                                if ((this._loadInt((_34_ + 4))) == 0) {
                                    break label$17;
                                }
                                this.__unlockfile.invoke((this._loadInt((_34_ + 28))));
                            }
                            while (false);
                            this._storeInt((__errno_location()), 22);
                            this._storeInt((_34_ + 44), -1);
                            break label$1;
                        }
                        while (false);
                        if ((this._loadInt((_34_ + 12))) == 0) {
                            break label$2;
                        }
                        if (((this._loadInt8u((this._loadInt((_34_ + 28))))) & 16) == 0) {
                            break label$2;
                        }
                    }
                    while (false);
                    this._storeInt8(((this._loadInt((this._loadInt((_34_ + 40))))) + (this._loadInt((_34_ + 12)))), 0);
                    label$18:
                    do {
                        if ((this._loadInt((_34_ + 4))) == 0) {
                            break label$18;
                        }
                        this.__unlockfile.invoke((this._loadInt((_34_ + 28))));
                    }
                    while (false);
                    this._storeInt((_34_ + 44), (this._loadInt((_34_ + 12))));
                    break label$1;
                }
                while (false);
                this._storeInt((_33_ = this._loadInt((_34_ + 28))), ((this._loadInt(_33_)) | 32));
                label$19:
                do {
                    if ((this._loadInt((_34_ + 4))) == 0) {
                        break label$19;
                    }
                    this.__unlockfile.invoke((this._loadInt((_34_ + 28))));
                }
                while (false);
                this._storeInt((__errno_location()), 12);
                this._storeInt((_34_ + 44), -1);
                break label$1;
            }
            while (false);
            label$20:
            do {
                if ((this._loadInt((_34_ + 4))) == 0) {
                    break label$20;
                }
                this.__unlockfile.invoke((this._loadInt((_34_ + 28))));
            }
            while (false);
            this._storeInt((_34_ + 44), -1);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int getegid()
    {
        return (this.__syscall0.invoke(50));
    }

    @Override()
    public final int getenv(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))), (strlen((this._storeInt((_32_ + 8), _30_)))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((0 + 3912))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt8u((this._loadInt((_32_ + 8))))) == 0) {
                        break label$2;
                    }
                    if ((strchr((this._loadInt((_32_ + 8))), 61)) == 0) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((_32_ + 12), 0);
                break label$0;
            }
            while (false);
            _31_ = this._storeInt((_32_ + 4), 0);
            label$4:
            do {
                label$3:
                while (true) {
                    _30_ = 0;
                    label$5:
                    do {
                        if ((this._loadInt(((this._loadInt((_31_ + 3912))) + ((this._loadInt((_32_ + 4))) << 2)))) == 0) {
                            break label$5;
                        }
                        _30_ = 1;
                        if ((strncmp((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_31_ + 3912))) + ((this._loadInt((_32_ + 4))) << 2)))), (this._loadInt(_32_)))) != 0) {
                            break label$5;
                        }
                        _30_ = ((this._loadInt8s(((this._loadInt(((this._loadInt((_31_ + 3912))) + ((this._loadInt((_32_ + 4))) << 2)))) + (this._loadInt(_32_))))) != 61) ? 1 : 0;
                    }
                    while (false);
                    if (_30_ == 0) {
                        break label$4;
                    }
                    this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                    continue label$3;
                }
            }
            while (false);
            label$6:
            do {
                if ((this._loadInt(((this._loadInt((0 + 3912))) + ((this._loadInt((_32_ + 4))) << 2)))) == 0) {
                    break label$6;
                }
                this._storeInt((_32_ + 12), (((this._loadInt(((this._loadInt((0 + 3912))) + ((this._loadInt((_32_ + 4))) << 2)))) + (this._loadInt(_32_))) + 1));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), 0);
        }
        while (false);
        _30_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _30_;
    }

    @Override()
    public final int geteuid()
    {
        return (this.__syscall0.invoke(49));
    }

    @Override()
    public final int getgid()
    {
        return (this.__syscall0.invoke(47));
    }

    @Override()
    public final int getgroups(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = __syscall_ret((this.__syscall2.invoke(80, (this._loadInt((_32_ + 12))), _31_)));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int gethostname(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 416))) + 408), _30_);
        this._storeInt((_32_ + 404), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this.uname.invoke((_32_ + 8))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 412), -1);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_32_ + 404))) & 4294967295L) < (66 & 4294967295L)) {
                    break label$2;
                }
                this._storeInt((_32_ + 404), 65);
            }
            while (false);
            _30_ = this._storeInt((_32_ + 400), 0);
            label$4:
            do {
                label$3:
                while (true) {
                    _31_ = 0;
                    label$5:
                    do {
                        if (((this._loadInt((_32_ + 400))) & 4294967295L) >= ((this._loadInt((_32_ + 404))) & 4294967295L)) {
                            break label$5;
                        }
                        _31_ = ((this._storeInt8(((this._loadInt((_32_ + 408))) + (_31_ = this._loadInt((_32_ + 400)))), (this._loadInt8u((((_32_ + 8) + _31_) + 65))))) != _30_) ? 1 : 0;
                    }
                    while (false);
                    if (_31_ == 0) {
                        break label$4;
                    }
                    this._storeInt((_32_ + 400), ((this._loadInt((_32_ + 400))) + 1));
                    continue label$3;
                }
            }
            while (false);
            label$6:
            do {
                if ((this._loadInt((_32_ + 400))) != (this._loadInt((_32_ + 404)))) {
                    break label$6;
                }
                this._storeInt8((((this._loadInt((_32_ + 408))) + (this._loadInt((_32_ + 400)))) + -1), 0);
            }
            while (false);
            this._storeInt((_32_ + 412), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 412));
        this._storeInt((0 + 4), (_32_ + 416));
        return _31_;
    }

    @Override()
    public final int getline(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = getdelim((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), 10, _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int getlogin()
    {
        return (getenv(9920));
    }

    @Override()
    public final int getlogin_r(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._storeInt(_32_, (getlogin()))) == 0) {
                        break label$2;
                    }
                    if (((strlen((this._loadInt(_32_)))) & 4294967295L) < ((this._loadInt((_32_ + 4))) & 4294967295L)) {
                        break label$1;
                    }
                    this._storeInt((_32_ + 12), 34);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 12), 6);
                break label$0;
            }
            while (false);
            strcpy((this._loadInt((_32_ + 8))), (this._loadInt(_32_)));
            this._storeInt((_32_ + 12), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int getpgid(int _30_)
    {
        int _31_ = 0;
        _30_ = __syscall_ret((this.__syscall1.invoke(132, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int getpgrp()
    {
        return (this.__syscall1.invoke(132, 0));
    }

    @Override()
    public final int getpid()
    {
        return (this.__syscall0.invoke(20));
    }

    @Override()
    public final int getppid()
    {
        return (this.__syscall0.invoke(64));
    }

    @Override()
    public final int gets(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (fgets((this._storeInt((_31_ + 12), _30_)), 2147483647, (this._loadInt((0 + 14932))))))) == 0) {
                break label$0;
            }
            if ((this._loadInt8s((((strlen((this._loadInt((_31_ + 12))))) + (this._loadInt((_31_ + 12)))) + -1))) != 10) {
                break label$0;
            }
            this._storeInt8((((strlen((this._loadInt((_31_ + 12))))) + (this._loadInt((_31_ + 12)))) + -1), 0);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int getsid(int _30_)
    {
        int _31_ = 0;
        _30_ = __syscall_ret((this.__syscall1.invoke(147, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int getuid()
    {
        return (this.__syscall0.invoke(24));
    }

    @Override()
    public final double hypot(double _30_, double _31_)
    {
        long _32_ = 0L;
        int _33_ = 0;
        this._storeDouble(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 80), _30_);
        this._storeDouble((_33_ + 72), _31_);
        this._storeDouble((_33_ + 64), (this._loadDouble((_33_ + 80))));
        this._storeDouble((_33_ + 56), (this._loadDouble((_33_ + 72))));
        this._storeLong((_33_ + 64), ((this._loadLong((_33_ + 64))) & 9223372036854775807L));
        _32_ = this._storeLong((_33_ + 56), ((this._loadLong((_33_ + 56))) & 9223372036854775807L));
        label$0:
        do {
            if (((this._loadLong((_33_ + 64))) & 4294967295L) >= (_32_ & 4294967295L)) {
                break label$0;
            }
            this._storeLong((_33_ + 48), (this._loadLong((_33_ + 64))));
            this._storeInt((_33_ + 68), (this._loadInt((_33_ + 60))));
            this._storeInt((_33_ + 64), (this._loadInt((_33_ + 56))));
            this._storeInt((_33_ + 56), (this._loadInt((_33_ + 48))));
            this._storeInt((_33_ + 60), (this._loadInt((_33_ + 52))));
        }
        while (false);
        this._storeLong32((_33_ + 44), ((this._loadLong((_33_ + 64))) >>> 52L));
        this._storeLong32((_33_ + 40), ((this._loadLong((_33_ + 56))) >>> 52L));
        this._storeDouble((_33_ + 80), (this._loadDouble((_33_ + 64))));
        this._storeDouble((_33_ + 72), (this._loadDouble((_33_ + 56))));
        label$1:
        do {
            label$2:
            do {
                if ((this._loadInt((_33_ + 40))) != 2047) {
                    break label$2;
                }
                this._storeDouble((_33_ + 88), (this._loadDouble((_33_ + 72))));
                break label$1;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if ((this._loadInt((_33_ + 44))) == 2047) {
                        break label$4;
                    }
                    if ((this._loadLong((_33_ + 56))) == 0L) {
                        break label$4;
                    }
                    if (((this._loadInt((_33_ + 44))) - (this._loadInt((_33_ + 40)))) < 65) {
                        break label$3;
                    }
                    this._storeDouble((_33_ + 88), ((this._loadDouble((_33_ + 80))) + (this._loadDouble((_33_ + 72)))));
                    break label$1;
                }
                while (false);
                this._storeDouble((_33_ + 88), (this._loadDouble((_33_ + 80))));
                break label$1;
            }
            while (false);
            this._storeLong(_33_, 4607182418800017408L);
            label$5:
            do {
                label$6:
                do {
                    if ((this._loadInt((_33_ + 44))) < 1534) {
                        break label$6;
                    }
                    this._storeLong(_33_, 7759702157959364608L);
                    this._storeDouble((_33_ + 80), ((this._loadDouble((_33_ + 80))) * 1.9010915662951598E-211));
                    this._storeDouble((_33_ + 72), ((this._loadDouble((_33_ + 72))) * 1.9010915662951598E-211));
                    break label$5;
                }
                while (false);
                if ((this._loadInt((_33_ + 40))) > 572) {
                    break label$5;
                }
                this._storeLong(_33_, 1454662679640670208L);
                this._storeDouble((_33_ + 80), ((this._loadDouble((_33_ + 80))) * 5.2601359015483735E210));
                this._storeDouble((_33_ + 72), ((this._loadDouble((_33_ + 72))) * 5.2601359015483735E210));
            }
            while (false);
            sq((_33_ + 32), (_33_ + 24), (this._loadDouble((_33_ + 80))));
            sq((_33_ + 16), (_33_ + 8), (this._loadDouble((_33_ + 72))));
            this._storeDouble((_33_ + 88), ((this._loadDouble(_33_)) * (Math.sqrt(((((this._loadDouble((_33_ + 8))) + (this._loadDouble((_33_ + 24)))) + (this._loadDouble((_33_ + 16)))) + (this._loadDouble((_33_ + 32))))))));
        }
        while (false);
        _31_ = this._loadDouble((_33_ + 88));
        this._storeInt((0 + 4), (_33_ + 96));
        return _31_;
    }

    @Override()
    public final void sq(int _30_, int _31_, double _32_)
    {
        double _33_ = 0.0;
        double _34_ = 0.0;
        int _35_ = 0;
        this._storeInt(((_35_ = (this._loadInt((0 + 4))) - 48) + 44), _30_);
        this._storeInt((_35_ + 40), _31_);
        _32_ = this._storeDouble((_35_ + 24), ((_32_ = this._storeDouble((_35_ + 8), ((this._storeDouble((_35_ + 32), _32_)) * 1.34217729E8))) + ((this._loadDouble((_35_ + 32))) - _32_)));
        _32_ = this._storeDouble((_35_ + 16), ((this._loadDouble((_35_ + 32))) - _32_));
        _33_ = this._storeDouble((this._loadInt((_35_ + 44))), ((_34_ = this._loadDouble((_35_ + 32))) * _34_));
        this._storeDouble((this._loadInt((_35_ + 40))), (((((_34_ = this._loadDouble((_35_ + 24))) * _34_) - _33_) + (_32_ * (_34_ + _34_))) + (_32_ * _32_)));
        return;
    }
}
