package sqlite3;

abstract class sqlite3$6
        extends sqlite3$5
{
    protected sqlite3$6(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final void powl(int _30_, long _31_, long _32_, long _33_, long _34_)
    {
        int _35_ = 0;
        double _36_ = 0.0;
        this._storeLong(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), _31_);
        this._storeLong((_35_ + 40), _32_);
        this._storeLong((_35_ + 24), _34_);
        _36_ = this.__trunctfdf2.invoke((this._storeLong((_35_ + 16), _33_)), _34_);
        this.__extenddftf2.invoke(_35_, (pow((this.__trunctfdf2.invoke((this._loadLong((_35_ + 32))), (this._loadLong((_35_ + 40))))), _36_)));
        this._storeLong((_30_ + 8), (this._loadLong((_35_ + 8))));
        this._storeLong(_30_, (this._loadLong(_35_)));
        this._storeInt((0 + 4), (_35_ + 48));
        return;
    }

    @Override()
    public final int preadv(int _30_, int _31_, int _32_, long _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeLong((_34_ + 8), _33_);
        _32_ = __syscall_ret((this.__syscall_cp.invoke(333, (this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))), ((int) _33_), ((int) (_33_ >>> 32L)), 0)));
        this._storeInt((0 + 4), (_34_ + 32));
        return _32_;
    }

    @Override()
    public final void __procfdname(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), 0);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._storeInt8(((this._loadInt((_32_ + 12))) + (_31_ = this._loadInt((_32_ + 4)))), (this._loadInt8u((_31_ + 14272))))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                continue label$0;
            }
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                if ((this._loadInt((_32_ + 8))) == 0) {
                    break label$3;
                }
                this._storeInt(_32_, (this._loadInt((_32_ + 8))));
                label$5:
                do {
                    label$4:
                    while (true) {
                        if ((this._loadInt(_32_)) == 0) {
                            break label$5;
                        }
                        this._storeInt(_32_, ((this._loadInt(_32_)) / 10));
                        this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                        continue label$4;
                    }
                }
                while (false);
                this._storeInt8(((this._loadInt((_32_ + 12))) + (this._loadInt((_32_ + 4)))), 0);
                label$6:
                while (true) {
                    if ((this._loadInt((_32_ + 8))) == 0) {
                        break label$2;
                    }
                    _31_ = this._loadInt((_32_ + 8));
                    this._storeInt8(((this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + -1))) + (this._loadInt((_32_ + 12)))), ((_31_ % 10) | 48));
                    this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) / 10));
                    continue label$6;
                }
            }
            while (false);
            this._storeInt8((_32_ = (this._loadInt((_32_ + 12))) + (this._loadInt((_32_ + 4)))), 48);
            this._storeInt8((_32_ + 1), 0);
        }
        while (false);
        return;
    }

    @Override()
    public final int putc(int _30_, int _31_)
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
    public final int putc_unlocked(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_32_ + 12))) == (this._loadInt8s((_31_ + 75)))) {
                    break label$1;
                }
                if (((this._loadInt(((_31_ = this._loadInt((_32_ + 8))) + 20))) & 4294967295L) >= ((this._loadInt((_31_ + 16))) & 4294967295L)) {
                    break label$1;
                }
                this._storeInt(((_31_ = this._loadInt((_32_ + 8))) + 20), ((_30_ = this._loadInt((_31_ + 20))) + 1));
                this._storeInt8(_30_, (_31_ = this._loadInt8u((_32_ + 12))));
                break label$0;
            }
            while (false);
            _31_ = __overflow((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int putchar(int _30_)
    {
        int _31_ = 0;
        _30_ = fputc((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), (this._loadInt((0 + 16116))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int putchar_unlocked(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)) == (this._loadInt8s(((_30_ = this._loadInt((0 + 16116))) + 75)))) {
                    break label$1;
                }
                if (((this._loadInt((_30_ + 20))) & 4294967295L) >= ((this._loadInt((_30_ + 16))) & 4294967295L)) {
                    break label$1;
                }
                this._storeInt(((_30_ = this._loadInt((0 + 16116))) + 20), ((_32_ = this._loadInt((_30_ + 20))) + 1));
                this._storeInt8(_32_, (_30_ = this._loadInt8u((_31_ + 12))));
                break label$0;
            }
            while (false);
            _30_ = __overflow(_30_, (this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int __putenv(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        _31_ = this._storeInt((_32_ + 12), (this._storeInt((_32_ + 16), 0)));
        this._storeInt((_32_ + 8), (strchr((this._loadInt((_32_ + 24))), 61)));
        this._storeInt(_32_, (this._storeInt((_32_ + 4), _31_)));
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
                                if ((this._loadInt((_32_ + 8))) == 0) {
                                    break label$5;
                                }
                                if ((this._loadInt((_32_ + 8))) == (this._loadInt((_32_ + 24)))) {
                                    break label$4;
                                }
                                label$7:
                                do {
                                    label$6:
                                    while (true) {
                                        _31_ = 0;
                                        label$8:
                                        do {
                                            if ((this._loadInt(((this._loadInt((0 + 3912))) + ((this._loadInt((_32_ + 16))) << 2)))) == 0) {
                                                break label$8;
                                            }
                                            _31_ = ((memcmp((_31_ = this._loadInt((_32_ + 24))), (this._loadInt(((this._loadInt((0 + 3912))) + ((this._loadInt((_32_ + 16))) << 2)))), (((this._loadInt((_32_ + 8))) - _31_) + 1))) != 0) ? 1 : 0;
                                        }
                                        while (false);
                                        if (_31_ == 0) {
                                            break label$7;
                                        }
                                        this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                                        continue label$6;
                                    }
                                }
                                while (false);
                                if ((this._loadInt((_32_ + 20))) == 0) {
                                    break label$1;
                                }
                                if ((this._loadInt((0 + 14288))) == 0) {
                                    break label$3;
                                }
                                label$10:
                                do {
                                    label$9:
                                    while (true) {
                                        _31_ = 0;
                                        label$11:
                                        do {
                                            if ((this._loadInt(((this._loadInt((0 + 14288))) + ((this._loadInt((_32_ + 12))) << 2)))) == 0) {
                                                break label$11;
                                            }
                                            _31_ = ((this._loadInt(((this._loadInt((0 + 14288))) + ((this._loadInt((_32_ + 12))) << 2)))) != (this._loadInt(((this._loadInt((0 + 3912))) + ((this._loadInt((_32_ + 16))) << 2))))) ? 1 : 0;
                                        }
                                        while (false);
                                        if (_31_ == 0) {
                                            break label$10;
                                        }
                                        this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 1));
                                        continue label$9;
                                    }
                                }
                                while (false);
                                if ((this._loadInt(((this._loadInt((0 + 14288))) + ((this._loadInt((_32_ + 12))) << 2)))) == 0) {
                                    break label$2;
                                }
                                free((this._loadInt(((this._loadInt((0 + 14288))) + ((this._loadInt((_32_ + 12))) << 2)))));
                                break label$1;
                            }
                            while (false);
                            this._storeInt((_32_ + 28), (unsetenv((this._loadInt((_32_ + 24))))));
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_32_ + 28), -1);
                        break label$0;
                    }
                    while (false);
                    if ((this._storeInt((0 + 14288), (calloc(2, 4)))) == 0) {
                        break label$1;
                    }
                    this._storeInt((this._loadInt((0 + 14288))), (this._loadInt((_32_ + 24))));
                    break label$1;
                }
                while (false);
                if ((this._storeInt(_32_, (realloc((this._loadInt((0 + 14288))), (((this._loadInt((_32_ + 12))) << 2) + 8))))) == 0) {
                    break label$1;
                }
                this._storeInt(((this._storeInt((0 + 14288), (this._loadInt(_32_)))) + ((this._loadInt((_32_ + 12))) << 2)), (this._loadInt((_32_ + 24))));
                this._storeInt((((this._loadInt((0 + 14288))) + ((this._loadInt((_32_ + 12))) << 2)) + 4), 0);
            }
            while (false);
            label$12:
            do {
                label$13:
                do {
                    if ((this._loadInt(((this._loadInt((0 + 3912))) + ((this._loadInt((_32_ + 16))) << 2)))) != 0) {
                        break label$13;
                    }
                    if ((this._storeInt((_32_ + 4), (malloc((((this._loadInt((_32_ + 16))) << 2) + 8))))) == 0) {
                        break label$12;
                    }
                    memcpy((this._loadInt((_32_ + 4))), (this._loadInt((0 + 3912))), ((this._loadInt((_32_ + 16))) << 2));
                    this._storeInt((_31_ = (this._loadInt((_32_ + 4))) + ((this._loadInt((_32_ + 16))) << 2)), (this._loadInt((_32_ + 24))));
                    this._storeInt(((_31_ = this._storeInt((_31_ + 4), 0)) + 3912), (this._loadInt((_32_ + 4))));
                    free((this._loadInt((_31_ + 14292))));
                    this._storeInt((_31_ + 14292), (this._loadInt((_31_ + 3912))));
                }
                while (false);
                _31_ = this._loadInt((_32_ + 16));
                _30_ = this._loadInt((_32_ + 24));
                this._storeInt(((this._loadInt(((this._storeInt((_32_ + 28), 0)) + 3912))) + (_31_ << 2)), _30_);
                break label$0;
            }
            while (false);
            label$14:
            do {
                if ((this._loadInt((_32_ + 20))) == 0) {
                    break label$14;
                }
                if ((this._loadInt((0 + 14288))) == 0) {
                    break label$14;
                }
                this._storeInt(((this._loadInt((0 + 14288))) + ((this._loadInt((_32_ + 12))) << 2)), 0);
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
    public final int putenv(int _30_)
    {
        int _31_ = 0;
        _30_ = __putenv((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 0);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int pwritev(int _30_, int _31_, int _32_, long _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeLong((_34_ + 8), _33_);
        _32_ = __syscall_ret((this.__syscall_cp.invoke(334, (this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 20))), ((int) _33_), ((int) (_33_ >>> 32L)), 0)));
        this._storeInt((0 + 4), (_34_ + 32));
        return _32_;
    }

    @Override()
    public final void quick_exit(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        __funcs_on_quick_exit();
        this._Exit.invoke((this._loadInt((_31_ + 12))));
        throw (new UnreachableException());
    }

    @Override()
    public final void srand(int _30_)
    {
        this._storeLong((0 + 14296), (((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + -1) & 4294967295L));
        return;
    }

    @Override()
    public final int rand()
    {
        return ((int) ((this._storeLong((0 + 14296), (((this._loadLong((0 + 14296))) * 6364136223846793005L) + 1L))) >>> 33L));
    }

    @Override()
    public final int rand_r(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16));
        _31_ = this._storeInt(_30_, (((this._loadInt(_30_)) * 1103515245) + 12345));
        this._storeInt((_32_ + 12), _30_);
        _30_ = temper(_31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return (_30_ >>> 1);
    }

    @Override()
    public final int temper(int _30_)
    {
        int _31_ = 0;
        return (this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 12), ((_31_ = this._storeInt((_31_ + 12), ((_30_ = this._storeInt((_31_ + 12), ((_30_ = this._storeInt((_31_ + 12), ((_30_ = this._storeInt((_31_ + 12), _30_)) ^ (_30_ >>> 11)))) ^ ((_30_ << 7) & -1658038656)))) ^ ((_30_ << 15) & -272236544)))) ^ (_31_ >>> 18))));
    }

    @Override()
    public final void srandom(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this.__lock.invoke(14304);
        __srandom((this._loadInt((_31_ + 12))));
        this.__unlock.invoke(14304);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void __srandom(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeLong(_31_, (this._loadLong32u((_31_ + 12))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((0 + 14312))) == 0) {
                    break label$1;
                }
                _30_ = 1;
                label$2:
                do {
                    if ((this._loadInt((0 + 14312))) == 31) {
                        break label$2;
                    }
                    _30_ = ((this._loadInt((0 + 14312))) == 7) ? 1 : 0;
                }
                while (false);
                _temp$0 = 3;
                _temp$1 = 1;
                _temp$2 = (_30_ != 0) ? _temp$0 : _temp$1;
                this._storeInt((0 + 14320), _temp$2);
                _30_ = this._storeInt((_31_ + 8), (this._storeInt((0 + 14324), 0)));
                label$4:
                do {
                    label$3:
                    while (true) {
                        if ((this._loadInt((_31_ + 8))) >= (this._loadInt((_30_ + 14312)))) {
                            break label$4;
                        }
                        this._storeLong(_31_, (lcg64((this._loadLong(_31_)))));
                        this._storeLong32(((this._loadInt((_30_ + 14316))) + ((_32_ = this._loadInt((_31_ + 8))) << 2)), (this._loadLong32u((_31_ + 4))));
                        this._storeInt((_31_ + 8), (_32_ + 1));
                        continue label$3;
                    }
                }
                while (false);
                this._storeInt((_30_ = this._loadInt((0 + 14316))), ((this._loadInt(_30_)) | 1));
                break label$0;
            }
            while (false);
            this._storeLong32((this._loadInt((0 + 14316))), (this._loadLong(_31_)));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final long lcg64(long _30_)
    {
        return (((this._storeLong((((this._loadInt((0 + 4))) - 16) + 8), _30_)) * 6364136223846793005L) + 1L);
    }

    @Override()
    public final int initstate(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_33_ + 16), _32_)) & 4294967295L) > (7 & 4294967295L)) {
                    break label$1;
                }
                this._storeInt((_33_ + 28), 0);
                break label$0;
            }
            while (false);
            this.__lock.invoke(14304);
            this._storeInt((_33_ + 12), (savestate()));
            label$2:
            do {
                label$3:
                do {
                    if (((this._loadInt((_33_ + 16))) & 4294967295L) > (31 & 4294967295L)) {
                        break label$3;
                    }
                    this._storeInt((0 + 14312), 0);
                    break label$2;
                }
                while (false);
                label$4:
                do {
                    if (((this._loadInt((_33_ + 16))) & 4294967295L) > (63 & 4294967295L)) {
                        break label$4;
                    }
                    this._storeInt((0 + 14312), 7);
                    break label$2;
                }
                while (false);
                label$5:
                do {
                    if (((this._loadInt((_33_ + 16))) & 4294967295L) > (127 & 4294967295L)) {
                        break label$5;
                    }
                    this._storeInt((0 + 14312), 15);
                    break label$2;
                }
                while (false);
                label$6:
                do {
                    if (((this._loadInt((_33_ + 16))) & 4294967295L) > (255 & 4294967295L)) {
                        break label$6;
                    }
                    this._storeInt((0 + 14312), 31);
                    break label$2;
                }
                while (false);
                this._storeInt((0 + 14312), 63);
            }
            while (false);
            this._storeInt((0 + 14316), ((this._loadInt((_33_ + 20))) + 4));
            __srandom((this._loadInt((_33_ + 24))));
            savestate();
            this.__unlock.invoke(14304);
            this._storeInt((_33_ + 28), (this._loadInt((_33_ + 12))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int savestate()
    {
        this._storeInt(((this._loadInt((0 + 14316))) + -4), ((((this._loadInt((0 + 14312))) << 16) | ((this._loadInt((0 + 14320))) << 8)) | (this._loadInt((0 + 14324)))));
        return ((this._loadInt((0 + 14316))) + -4);
    }

    @Override()
    public final int setstate(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this.__lock.invoke(14304);
        this._storeInt((_31_ + 8), (savestate()));
        loadstate((this._loadInt((_31_ + 12))));
        this.__unlock.invoke(14304);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void loadstate(int _30_)
    {
        this._storeInt((0 + 14316), ((_30_ = this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 4));
        this._storeInt((0 + 14312), (this._loadInt16u((_30_ + 2))));
        this._storeInt((0 + 14320), (((this._loadInt(_30_)) >>> 8) & 255));
        this._storeInt((0 + 14324), (this._loadInt8u(((this._loadInt((0 + 14316))) + -4))));
        return;
    }

    @Override()
    public final int random()
    {
        int _30_ = 0;
        int _31_ = 0;
        int _32_ = 0;
        _30_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16));
        this.__lock.invoke(14304);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((0 + 14312))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ = (_32_ = this._loadInt((0 + 14316))) + ((this._loadInt((0 + 14320))) << 2)), ((this._loadInt(_31_)) + (this._loadInt((_32_ + ((this._loadInt((0 + 14324))) << 2))))));
                this._storeInt((_30_ + 12), ((this._loadInt(((this._loadInt((0 + 14316))) + ((_32_ = this._loadInt((0 + 14320))) << 2)))) >>> 1));
                label$2:
                do {
                    if ((this._storeInt((0 + 14320), (_32_ + 1))) != (this._loadInt((0 + 14312)))) {
                        break label$2;
                    }
                    this._storeInt((0 + 14320), 0);
                }
                while (false);
                if ((this._storeInt((0 + 14324), ((this._loadInt((0 + 14324))) + 1))) != (this._loadInt((0 + 14312)))) {
                    break label$0;
                }
                this._storeInt((0 + 14324), 0);
                break label$0;
            }
            while (false);
            _32_ = lcg31((this._loadInt((this._loadInt((0 + 14316))))));
            this._storeInt((_30_ + 12), (this._storeInt((this._loadInt((0 + 14316))), _32_)));
        }
        while (false);
        this.__unlock.invoke(14304);
        _32_ = this._loadInt((_30_ + 12));
        this._storeInt((0 + 4), (_30_ + 16));
        return _32_;
    }

    @Override()
    public final int lcg31(int _30_)
    {
        return ((((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) * 1103515245) + 12345) & 2147483647);
    }

    @Override()
    public final int read(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = __syscall_ret((this.__syscall_cp.invoke(3, (this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_, 0, 0, 0)));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int readlink(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = __syscall_ret((this.__syscall3.invoke(85, (this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_)));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int readlinkat(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        _33_ = __syscall_ret((this.__syscall4.invoke(305, (this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))), _33_)));
        this._storeInt((0 + 4), (_34_ + 16));
        return _33_;
    }

    @Override()
    public final int readv(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = __syscall_ret((this.__syscall_cp.invoke(145, (this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_, 0, 0, 0)));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int regerror(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        this._storeInt((_34_ + 12), 14464);
        label$1:
        do {
            label$0:
            while (true) {
                _33_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_34_ + 28))) == 0) {
                        break label$2;
                    }
                    _33_ = ((this._loadInt8s((this._loadInt((_34_ + 12))))) != 0) ? 1 : 0;
                }
                while (false);
                if (_33_ == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 28), ((this._loadInt((_34_ + 28))) + -1));
                this._storeInt((_34_ + 12), (((strlen((this._loadInt((_34_ + 12))))) + (this._loadInt((_34_ + 12)))) + 1));
                continue label$0;
            }
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt8u((this._loadInt((_34_ + 12))))) != 0) {
                break label$3;
            }
            this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 12))) + 1));
        }
        while (false);
        _33_ = this._storeInt((_34_ + 12), (this.__lctrans_cur.invoke((this._loadInt((_34_ + 12))))));
        _32_ = this._loadInt((_34_ + 16));
        _31_ = this._loadInt((_34_ + 20));
        this._storeInt(_34_, _33_);
        _33_ = this.snprintf.invoke(_31_, _32_, 14752, _34_);
        this._storeInt((0 + 4), (_34_ + 32));
        return (_33_ + 1);
    }

    @Override()
    public final double remainder(double _30_, double _31_)
    {
        int _32_ = 0;
        this._storeDouble(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeDouble((_32_ + 16), _31_);
        _31_ = remquo((this._loadDouble((_32_ + 24))), _31_, (_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final float remainderf(float _30_, float _31_)
    {
        int _32_ = 0;
        this._storeFloat(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeFloat((_32_ + 8), _31_);
        _31_ = remquof((this._loadFloat((_32_ + 12))), _31_, (_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void remainderl(int _30_, long _31_, long _32_, long _33_, long _34_)
    {
        int _35_ = 0;
        double _36_ = 0.0;
        this._storeLong(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), _31_);
        this._storeLong((_35_ + 40), _32_);
        this._storeLong((_35_ + 24), _34_);
        _36_ = this.__trunctfdf2.invoke((this._storeLong((_35_ + 16), _33_)), _34_);
        this.__extenddftf2.invoke(_35_, (remainder((this.__trunctfdf2.invoke((this._loadLong((_35_ + 32))), (this._loadLong((_35_ + 40))))), _36_)));
        this._storeLong((_30_ + 8), (this._loadLong((_35_ + 8))));
        this._storeLong(_30_, (this._loadLong(_35_)));
        this._storeInt((0 + 4), (_35_ + 48));
        return;
    }

    @Override()
    public final int remove(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this.__syscall1.invoke(10, (this._storeInt((_31_ + 12), _30_)))))) != -21) {
                break label$0;
            }
            this._storeInt((_31_ + 8), (this.__syscall1.invoke(40, (this._loadInt((_31_ + 12))))));
        }
        while (false);
        _30_ = __syscall_ret((this._loadInt((_31_ + 8))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final double remquo(double _30_, double _31_, int _32_)
    {
        int _33_ = 0;
        this._storeDouble(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 80), _30_);
        this._storeDouble((_33_ + 72), _31_);
        this._storeInt((_33_ + 68), _32_);
        this._storeDouble((_33_ + 56), (this._loadDouble((_33_ + 80))));
        this._storeDouble((_33_ + 48), (this._loadDouble((_33_ + 72))));
        this._storeLong32((_33_ + 44), (((this._loadLong((_33_ + 56))) >>> 52L) & 2047L));
        this._storeLong32((_33_ + 40), (((this._loadLong((_33_ + 48))) >>> 52L) & 2047L));
        this._storeLong32((_33_ + 36), ((this._loadLong((_33_ + 56))) >>> 63L));
        this._storeLong32((_33_ + 32), ((this._loadLong((_33_ + 48))) >>> 63L));
        this._storeLong((_33_ + 8), (this._loadLong((_33_ + 56))));
        this._storeInt((this._loadInt((_33_ + 68))), 0);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadLong((_33_ + 48))) << 1L) == 0) {
                        break label$2;
                    }
                    if ((((__DOUBLE_BITS$2e$215((this._loadDouble((_33_ + 72))))) & 9223372036854775807L) & 4294967295L) > (9218868437227405312L & 4294967295L)) {
                        break label$2;
                    }
                    if ((this._loadInt((_33_ + 44))) != 2047) {
                        break label$1;
                    }
                }
                while (false);
                this._storeDouble((_33_ + 88), ((_31_ = (this._loadDouble((_33_ + 80))) * (this._loadDouble((_33_ + 72)))) / _31_));
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    label$5:
                    do {
                        if (((this._loadLong((_33_ + 56))) << 1L) == 0L) {
                            break label$5;
                        }
                        if ((this._loadInt((_33_ + 44))) == 0) {
                            break label$4;
                        }
                        this._storeLong((_33_ + 8), ((this._storeLong((_33_ + 8), ((this._loadLong((_33_ + 8))) & 4503599627370495L))) | 4503599627370496L));
                        break label$3;
                    }
                    while (false);
                    this._storeDouble((_33_ + 88), (this._loadDouble((_33_ + 80))));
                    break label$0;
                }
                while (false);
                this._storeLong((_33_ + 16), ((this._loadLong((_33_ + 8))) << 12L));
                label$7:
                do {
                    label$6:
                    while (true) {
                        if (((this._loadLong((_33_ + 16))) >>> 63L) != 0L) {
                            break label$7;
                        }
                        this._storeInt((_33_ + 44), ((this._loadInt((_33_ + 44))) + -1));
                        this._storeLong((_33_ + 16), ((this._loadLong((_33_ + 16))) << 1L));
                        continue label$6;
                    }
                }
                while (false);
                this._storeLong((_33_ + 8), ((this._loadLong((_33_ + 8))) << ((1 - (this._loadInt((_33_ + 44)))) & 4294967295L)));
            }
            while (false);
            label$8:
            do {
                label$9:
                do {
                    if ((this._loadInt((_33_ + 40))) == 0) {
                        break label$9;
                    }
                    this._storeLong((_33_ + 48), ((this._storeLong((_33_ + 48), ((this._loadLong((_33_ + 48))) & 4503599627370495L))) | 4503599627370496L));
                    break label$8;
                }
                while (false);
                this._storeLong((_33_ + 16), ((this._loadLong((_33_ + 48))) << 12L));
                label$11:
                do {
                    label$10:
                    while (true) {
                        if (((this._loadLong((_33_ + 16))) >>> 63L) != 0L) {
                            break label$11;
                        }
                        this._storeInt((_33_ + 40), ((this._loadInt((_33_ + 40))) + -1));
                        this._storeLong((_33_ + 16), ((this._loadLong((_33_ + 16))) << 1L));
                        continue label$10;
                    }
                }
                while (false);
                this._storeLong((_33_ + 48), ((this._loadLong((_33_ + 48))) << ((1 - (this._loadInt((_33_ + 40)))) & 4294967295L)));
            }
            while (false);
            this._storeInt((_33_ + 28), 0);
            label$12:
            do {
                label$13:
                do {
                    if ((this._loadInt((_33_ + 44))) >= (this._loadInt((_33_ + 40)))) {
                        break label$13;
                    }
                    if (((this._loadInt((_33_ + 44))) + 1) == (this._loadInt((_33_ + 40)))) {
                        break label$12;
                    }
                    this._storeDouble((_33_ + 88), (this._loadDouble((_33_ + 80))));
                    break label$0;
                }
                while (false);
                label$15:
                do {
                    label$14:
                    while (true) {
                        if ((this._loadInt((_33_ + 44))) <= (this._loadInt((_33_ + 40)))) {
                            break label$15;
                        }
                        label$16:
                        do {
                            if (((this._storeLong((_33_ + 16), ((this._loadLong((_33_ + 8))) - (this._loadLong((_33_ + 48)))))) >>> 63L) != 0L) {
                                break label$16;
                            }
                            this._storeLong((_33_ + 8), (this._loadLong((_33_ + 16))));
                            this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) + 1));
                        }
                        while (false);
                        this._storeLong((_33_ + 8), ((this._loadLong((_33_ + 8))) << 1L));
                        this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) << 1));
                        this._storeInt((_33_ + 44), ((this._loadInt((_33_ + 44))) + -1));
                        continue label$14;
                    }
                }
                while (false);
                label$17:
                do {
                    if (((this._storeLong((_33_ + 16), ((this._loadLong((_33_ + 8))) - (this._loadLong((_33_ + 48)))))) >>> 63L) != 0L) {
                        break label$17;
                    }
                    this._storeLong((_33_ + 8), (this._loadLong((_33_ + 16))));
                    this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) + 1));
                }
                while (false);
                label$18:
                do {
                    if ((this._loadLong((_33_ + 8))) == 0L) {
                        break label$18;
                    }
                    label$19:
                    while (true) {
                        if (((this._loadLong((_33_ + 8))) >>> 52L) != 0L) {
                            break label$12;
                        }
                        this._storeLong((_33_ + 8), ((this._loadLong((_33_ + 8))) << 1L));
                        this._storeInt((_33_ + 44), ((this._loadInt((_33_ + 44))) + -1));
                        continue label$19;
                    }
                }
                while (false);
                this._storeInt((_33_ + 44), -60);
            }
            while (false);
            label$21:
            do {
                label$22:
                do {
                    if ((this._loadInt((_33_ + 44))) < 1) {
                        break label$22;
                    }
                    this._storeLong((_33_ + 8), ((this._storeLong((_33_ + 8), ((this._loadLong((_33_ + 8))) + -4503599627370496L))) | ((this._loadLong32u((_33_ + 44))) << 52L)));
                    break label$21;
                }
                while (false);
                this._storeLong((_33_ + 8), ((this._loadLong((_33_ + 8))) >>> ((1 - (this._loadInt((_33_ + 44)))) & 4294967295L)));
            }
            while (false);
            this._storeLong((_33_ + 56), (this._loadLong((_33_ + 8))));
            this._storeDouble((_33_ + 80), (this._loadDouble((_33_ + 56))));
            label$23:
            do {
                if ((this._loadInt((_33_ + 32))) == 0) {
                    break label$23;
                }
                this._storeDouble((_33_ + 72), (-(this._loadDouble((_33_ + 72)))));
            }
            while (false);
            label$24:
            do {
                label$25:
                do {
                    if ((this._loadInt((_33_ + 44))) == (this._loadInt((_33_ + 40)))) {
                        break label$25;
                    }
                    if (((this._loadInt((_33_ + 44))) + 1) != (this._loadInt((_33_ + 40)))) {
                        break label$24;
                    }
                    if (((_31_ = this._loadDouble((_33_ + 80))) + _31_) > (this._loadDouble((_33_ + 72)))) {
                        break label$25;
                    }
                    if (((_31_ = this._loadDouble((_33_ + 80))) + _31_) != (this._loadDouble((_33_ + 72)))) {
                        break label$24;
                    }
                    if (((this._loadInt8u((_33_ + 28))) & 1) == 0) {
                        break label$24;
                    }
                }
                while (false);
                this._storeDouble((_33_ + 80), ((this._loadDouble((_33_ + 80))) - (this._loadDouble((_33_ + 72)))));
                this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) + 1));
            }
            while (false);
            this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) & 2147483647));
            label$26:
            do {
                label$27:
                do {
                    if (((this._loadInt((_33_ + 36))) ^ (this._loadInt((_33_ + 32)))) == 0) {
                        break label$27;
                    }
                    _32_ = 0 - (this._loadInt((_33_ + 28)));
                    break label$26;
                }
                while (false);
                _32_ = this._loadInt((_33_ + 28));
            }
            while (false);
            this._storeInt((this._loadInt((_33_ + 68))), _32_);
            label$28:
            do {
                label$29:
                do {
                    if ((this._loadInt((_33_ + 36))) == 0) {
                        break label$29;
                    }
                    _31_ = -(this._loadDouble((_33_ + 80)));
                    break label$28;
                }
                while (false);
                _31_ = this._loadDouble((_33_ + 80));
            }
            while (false);
            this._storeDouble((_33_ + 88), _31_);
        }
        while (false);
        _31_ = this._loadDouble((_33_ + 88));
        this._storeInt((0 + 4), (_33_ + 96));
        return _31_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$214(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$215(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final float remquof(float _30_, float _31_, int _32_)
    {
        int _33_ = 0;
        this._storeFloat(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeFloat((_33_ + 52), _31_);
        this._storeInt((_33_ + 48), _32_);
        this._storeFloat((_33_ + 40), (this._loadFloat((_33_ + 56))));
        this._storeFloat((_33_ + 32), (this._loadFloat((_33_ + 52))));
        this._storeInt((_33_ + 28), (((this._loadInt((_33_ + 40))) >>> 23) & 255));
        this._storeInt((_33_ + 24), (((this._loadInt((_33_ + 32))) >>> 23) & 255));
        this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 40))) >>> 31));
        this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 32))) >>> 31));
        this._storeInt((_33_ + 4), (this._loadInt((_33_ + 40))));
        this._storeInt((this._loadInt((_33_ + 48))), 0);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if (((this._loadInt((_33_ + 32))) << 1) == 0) {
                        break label$2;
                    }
                    if ((((__FLOAT_BITS$2e$218((this._loadFloat((_33_ + 52))))) & 2147483647) & 4294967295L) > (2139095040 & 4294967295L)) {
                        break label$2;
                    }
                    if ((this._loadInt((_33_ + 28))) != 255) {
                        break label$1;
                    }
                }
                while (false);
                this._storeFloat((_33_ + 60), ((_31_ = (this._loadFloat((_33_ + 56))) * (this._loadFloat((_33_ + 52)))) / _31_));
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    label$5:
                    do {
                        if (((this._loadInt((_33_ + 40))) << 1) == 0) {
                            break label$5;
                        }
                        if ((this._loadInt((_33_ + 28))) == 0) {
                            break label$4;
                        }
                        this._storeInt((_33_ + 4), ((this._storeInt((_33_ + 4), ((this._loadInt((_33_ + 4))) & 8388607))) | 8388608));
                        break label$3;
                    }
                    while (false);
                    this._storeFloat((_33_ + 60), (this._loadFloat((_33_ + 56))));
                    break label$0;
                }
                while (false);
                this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 4))) << 9));
                label$7:
                do {
                    label$6:
                    while (true) {
                        if (((this._loadInt((_33_ + 8))) >>> 31) != 0) {
                            break label$7;
                        }
                        this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) + -1));
                        this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) << 1));
                        continue label$6;
                    }
                }
                while (false);
                this._storeInt((_33_ + 4), ((this._loadInt((_33_ + 4))) << (1 - (this._loadInt((_33_ + 28))))));
            }
            while (false);
            label$8:
            do {
                label$9:
                do {
                    if ((this._loadInt((_33_ + 24))) == 0) {
                        break label$9;
                    }
                    this._storeInt((_33_ + 32), ((this._storeInt((_33_ + 32), ((this._loadInt((_33_ + 32))) & 8388607))) | 8388608));
                    break label$8;
                }
                while (false);
                this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 32))) << 9));
                label$11:
                do {
                    label$10:
                    while (true) {
                        if (((this._loadInt((_33_ + 8))) >>> 31) != 0) {
                            break label$11;
                        }
                        this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + -1));
                        this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) << 1));
                        continue label$10;
                    }
                }
                while (false);
                this._storeInt((_33_ + 32), ((this._loadInt((_33_ + 32))) << (1 - (this._loadInt((_33_ + 24))))));
            }
            while (false);
            this._storeInt((_33_ + 12), 0);
            label$12:
            do {
                label$13:
                do {
                    if ((this._loadInt((_33_ + 28))) >= (this._loadInt((_33_ + 24)))) {
                        break label$13;
                    }
                    if (((this._loadInt((_33_ + 28))) + 1) == (this._loadInt((_33_ + 24)))) {
                        break label$12;
                    }
                    this._storeFloat((_33_ + 60), (this._loadFloat((_33_ + 56))));
                    break label$0;
                }
                while (false);
                label$15:
                do {
                    label$14:
                    while (true) {
                        if ((this._loadInt((_33_ + 28))) <= (this._loadInt((_33_ + 24)))) {
                            break label$15;
                        }
                        label$16:
                        do {
                            if (((this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 4))) - (this._loadInt((_33_ + 32)))))) >>> 31) != 0) {
                                break label$16;
                            }
                            this._storeInt((_33_ + 4), (this._loadInt((_33_ + 8))));
                            this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 1));
                        }
                        while (false);
                        this._storeInt((_33_ + 4), ((this._loadInt((_33_ + 4))) << 1));
                        this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) << 1));
                        this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) + -1));
                        continue label$14;
                    }
                }
                while (false);
                label$17:
                do {
                    if (((this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 4))) - (this._loadInt((_33_ + 32)))))) >>> 31) != 0) {
                        break label$17;
                    }
                    this._storeInt((_33_ + 4), (this._loadInt((_33_ + 8))));
                    this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 1));
                }
                while (false);
                label$18:
                do {
                    if ((this._loadInt((_33_ + 4))) == 0) {
                        break label$18;
                    }
                    label$19:
                    while (true) {
                        if (((this._loadInt((_33_ + 4))) >>> 23) != 0) {
                            break label$12;
                        }
                        this._storeInt((_33_ + 4), ((this._loadInt((_33_ + 4))) << 1));
                        this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) + -1));
                        continue label$19;
                    }
                }
                while (false);
                this._storeInt((_33_ + 28), -30);
            }
            while (false);
            label$21:
            do {
                label$22:
                do {
                    if ((this._loadInt((_33_ + 28))) < 1) {
                        break label$22;
                    }
                    this._storeInt((_33_ + 4), ((this._storeInt((_33_ + 4), ((this._loadInt((_33_ + 4))) + -8388608))) | ((this._loadInt((_33_ + 28))) << 23)));
                    break label$21;
                }
                while (false);
                this._storeInt((_33_ + 4), ((this._loadInt((_33_ + 4))) >>> (1 - (this._loadInt((_33_ + 28))))));
            }
            while (false);
            this._storeInt((_33_ + 40), (this._loadInt((_33_ + 4))));
            this._storeFloat((_33_ + 56), (this._loadFloat((_33_ + 40))));
            label$23:
            do {
                if ((this._loadInt((_33_ + 16))) == 0) {
                    break label$23;
                }
                this._storeFloat((_33_ + 52), (-(this._loadFloat((_33_ + 52)))));
            }
            while (false);
            label$24:
            do {
                label$25:
                do {
                    if ((this._loadInt((_33_ + 28))) == (this._loadInt((_33_ + 24)))) {
                        break label$25;
                    }
                    if (((this._loadInt((_33_ + 28))) + 1) != (this._loadInt((_33_ + 24)))) {
                        break label$24;
                    }
                    if (((_31_ = this._loadFloat((_33_ + 56))) + _31_) > (this._loadFloat((_33_ + 52)))) {
                        break label$25;
                    }
                    if (((_31_ = this._loadFloat((_33_ + 56))) + _31_) != (this._loadFloat((_33_ + 52)))) {
                        break label$24;
                    }
                    if (((this._loadInt8u((_33_ + 12))) & 1) == 0) {
                        break label$24;
                    }
                }
                while (false);
                this._storeFloat((_33_ + 56), ((this._loadFloat((_33_ + 56))) - (this._loadFloat((_33_ + 52)))));
                this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 1));
            }
            while (false);
            this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) & 2147483647));
            label$26:
            do {
                label$27:
                do {
                    if (((this._loadInt((_33_ + 20))) ^ (this._loadInt((_33_ + 16)))) == 0) {
                        break label$27;
                    }
                    _32_ = 0 - (this._loadInt((_33_ + 12)));
                    break label$26;
                }
                while (false);
                _32_ = this._loadInt((_33_ + 12));
            }
            while (false);
            this._storeInt((this._loadInt((_33_ + 48))), _32_);
            label$28:
            do {
                label$29:
                do {
                    if ((this._loadInt((_33_ + 20))) == 0) {
                        break label$29;
                    }
                    _31_ = -(this._loadFloat((_33_ + 56)));
                    break label$28;
                }
                while (false);
                _31_ = this._loadFloat((_33_ + 56));
            }
            while (false);
            this._storeFloat((_33_ + 60), _31_);
        }
        while (false);
        _31_ = this._loadFloat((_33_ + 60));
        this._storeInt((0 + 4), (_33_ + 64));
        return _31_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$218(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$219(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final void remquol(
            int _30_,
            long _31_,
            long _32_,
            long _33_,
            long _34_,
            int _35_)
    {
        int _36_ = 0;
        double _37_ = 0.0;
        this._storeLong(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 48), _31_);
        this._storeLong((_36_ + 32), _33_);
        this._storeLong((_36_ + 56), _32_);
        this._storeInt((_36_ + 28), _35_);
        this._storeLong((_36_ + 40), _34_);
        _37_ = this.__trunctfdf2.invoke((this._loadLong((_36_ + 32))), _34_);
        this.__extenddftf2.invoke((_36_ + 8), (remquo((this.__trunctfdf2.invoke((this._loadLong((_36_ + 48))), (this._loadLong((_36_ + 56))))), _37_, _35_)));
        this._storeLong((_30_ + 8), (this._loadLong(((_36_ + 8) + 8))));
        this._storeLong(_30_, (this._loadLong((_36_ + 8))));
        this._storeInt((0 + 4), (_36_ + 64));
        return;
    }

    @Override()
    public final int rename(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = __syscall_ret((this.__syscall2.invoke(38, (this._loadInt((_32_ + 12))), _31_)));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int renameat(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        _33_ = __syscall_ret((this.__syscall4.invoke(302, (this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))), _33_)));
        this._storeInt((0 + 4), (_34_ + 16));
        return _33_;
    }

    @Override()
    public final void rewind(int _30_)
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
        __fseeko_unlocked((this._loadInt((_31_ + 12))), 0L, 0);
        this._storeInt((_32_ = this._loadInt((_31_ + 12))), ((this._loadInt(_32_)) & -33));
        label$1:
        do {
            if ((this._loadInt((_31_ + 8))) == 0) {
                break label$1;
            }
            this.__unlockfile.invoke((this._loadInt((_31_ + 12))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int rindex(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = strrchr((this._loadInt((_32_ + 12))), _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final double rint(double _30_)
    {
        int _31_ = 0;
        double _temp$0 = 0.0;
        double _temp$1 = 0.0;
        double _temp$2 = 0.0;
        this._storeDouble(((_31_ = (this._loadInt((0 + 4))) - 48) + 24), (this._storeDouble((_31_ + 32), _30_)));
        this._storeLong32((_31_ + 20), (((this._loadLong((_31_ + 24))) >>> 52L) & 2047L));
        this._storeLong32((_31_ + 16), ((this._loadLong((_31_ + 24))) >>> 63L));
        label$0:
        do {
            if ((this._loadInt((_31_ + 20))) < 1075) {
                break label$0;
            }
            this._storeDouble((_31_ + 40), (this._loadDouble((_31_ + 32))));
            return (this._loadDouble((_31_ + 40)));
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                if ((this._loadInt((_31_ + 16))) == 0) {
                    break label$2;
                }
                this._storeDouble((_31_ + 8), (((this._loadDouble((_31_ + 32))) - 4.503599627370496E15) + 4.503599627370496E15));
                break label$1;
            }
            while (false);
            this._storeDouble((_31_ + 8), (((this._loadDouble((_31_ + 32))) + 4.503599627370496E15) - 4.503599627370496E15));
        }
        while (false);
        label$3:
        do {
            if ((this._loadDouble((_31_ + 8))) != 0.0) {
                break label$3;
            }
            _temp$0 = -0.0;
            _temp$1 = 0.0;
            _temp$2 = ((this._loadInt((_31_ + 16))) != 0) ? _temp$0 : _temp$1;
            this._storeDouble((_31_ + 40), _temp$2);
            return (this._loadDouble((_31_ + 40)));
        }
        while (false);
        this._storeDouble((_31_ + 40), (this._loadDouble((_31_ + 8))));
        return (this._loadDouble((_31_ + 40)));
    }

    @Override()
    public final float rintf(float _30_)
    {
        int _31_ = 0;
        float _temp$0 = 0.0f;
        float _temp$1 = 0.0f;
        float _temp$2 = 0.0f;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 32) + 16), (this._storeFloat((_31_ + 24), _30_)));
        this._storeInt((_31_ + 12), (((this._loadInt((_31_ + 16))) >>> 23) & 255));
        this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 16))) >>> 31));
        label$0:
        do {
            if ((this._loadInt((_31_ + 12))) < 150) {
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
                if ((this._loadInt((_31_ + 8))) == 0) {
                    break label$2;
                }
                this._storeFloat((_31_ + 4), (((this._loadFloat((_31_ + 24))) - 8388608.0f) + 8388608.0f));
                break label$1;
            }
            while (false);
            this._storeFloat((_31_ + 4), (((this._loadFloat((_31_ + 24))) + 8388608.0f) - 8388608.0f));
        }
        while (false);
        label$3:
        do {
            if ((this._loadFloat((_31_ + 4))) != 0.0f) {
                break label$3;
            }
            _temp$0 = -0.0f;
            _temp$1 = 0.0f;
            _temp$2 = ((this._loadInt((_31_ + 8))) != 0) ? _temp$0 : _temp$1;
            this._storeFloat((_31_ + 28), _temp$2);
            return (this._loadFloat((_31_ + 28)));
        }
        while (false);
        this._storeFloat((_31_ + 28), (this._loadFloat((_31_ + 4))));
        return (this._loadFloat((_31_ + 28)));
    }

    @Override()
    public final void rintl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (Math.round((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int rmdir(int _30_)
    {
        int _31_ = 0;
        _30_ = __syscall_ret((this.__syscall1.invoke(40, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final double round(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = (this._loadInt((0 + 4))) - 48) + 24), (this._storeDouble((_31_ + 32), _30_)));
        label$0:
        do {
            if ((this._storeInt((_31_ + 20), ((int) (((this._loadLong((_31_ + 24))) >>> 52L) & 2047L)))) < 1075) {
                break label$0;
            }
            this._storeDouble((_31_ + 40), (this._loadDouble((_31_ + 32))));
            return (this._loadDouble((_31_ + 40)));
        }
        while (false);
        label$1:
        do {
            if (((this._loadLong((_31_ + 24))) >>> 63L) == 0) {
                break label$1;
            }
            this._storeDouble((_31_ + 32), (-(this._loadDouble((_31_ + 32)))));
        }
        while (false);
        label$2:
        do {
            if ((this._loadInt((_31_ + 20))) > 1021) {
                break label$2;
            }
            this._storeDouble(_31_, ((this._loadDouble((_31_ + 32))) + 4.503599627370496E15));
            this._storeDouble((_31_ + 40), ((this._loadDouble((_31_ + 24))) * 0.0));
            return (this._loadDouble((_31_ + 40)));
        }
        while (false);
        label$3:
        do {
            label$4:
            do {
                if (((((_30_ = this._storeDouble((_31_ + 8), ((((_30_ = this._loadDouble((_31_ + 32))) + 4.503599627370496E15) - 4.503599627370496E15) - _30_))) <= 0.5) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                    break label$4;
                }
                this._storeDouble((_31_ + 8), (((this._loadDouble((_31_ + 8))) + (this._loadDouble((_31_ + 32)))) + -1.0));
                break label$3;
            }
            while (false);
            label$5:
            do {
                if (((((_30_ = this._loadDouble((_31_ + 8))) > -0.5) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                    break label$5;
                }
                this._storeDouble((_31_ + 8), (((this._loadDouble((_31_ + 8))) + (this._loadDouble((_31_ + 32)))) + 1.0));
                break label$3;
            }
            while (false);
            this._storeDouble((_31_ + 8), ((this._loadDouble((_31_ + 8))) + (this._loadDouble((_31_ + 32)))));
        }
        while (false);
        label$6:
        do {
            if (((this._loadLong((_31_ + 24))) >>> 63L) == 0) {
                break label$6;
            }
            this._storeDouble((_31_ + 8), (-(this._loadDouble((_31_ + 8)))));
        }
        while (false);
        this._storeDouble((_31_ + 40), (this._loadDouble((_31_ + 8))));
        return (this._loadDouble((_31_ + 40)));
    }

    @Override()
    public final float roundf(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 32) + 16), (this._storeFloat((_31_ + 24), _30_)));
        label$0:
        do {
            if ((this._storeInt((_31_ + 12), (((this._loadInt((_31_ + 16))) >>> 23) & 255))) < 150) {
                break label$0;
            }
            this._storeFloat((_31_ + 28), (this._loadFloat((_31_ + 24))));
            return (this._loadFloat((_31_ + 28)));
        }
        while (false);
        label$1:
        do {
            if (((this._loadInt((_31_ + 16))) >>> 31) == 0) {
                break label$1;
            }
            this._storeFloat((_31_ + 24), (-(this._loadFloat((_31_ + 24)))));
        }
        while (false);
        label$2:
        do {
            if ((this._loadInt((_31_ + 12))) > 125) {
                break label$2;
            }
            this._storeFloat((_31_ + 4), ((this._loadFloat((_31_ + 24))) + 8388608.0f));
            this._storeFloat((_31_ + 28), ((this._loadFloat((_31_ + 16))) * 0.0f));
            return (this._loadFloat((_31_ + 28)));
        }
        while (false);
        label$3:
        do {
            label$4:
            do {
                if (((((_30_ = this._storeFloat((_31_ + 8), ((((_30_ = this._loadFloat((_31_ + 24))) + 8388608.0f) - 8388608.0f) - _30_))) <= 0.5f) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                    break label$4;
                }
                this._storeFloat((_31_ + 8), (((this._loadFloat((_31_ + 8))) + (this._loadFloat((_31_ + 24)))) + -1.0f));
                break label$3;
            }
            while (false);
            label$5:
            do {
                if (((((_30_ = this._loadFloat((_31_ + 8))) > -0.5f) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                    break label$5;
                }
                this._storeFloat((_31_ + 8), (((this._loadFloat((_31_ + 8))) + (this._loadFloat((_31_ + 24)))) + 1.0f));
                break label$3;
            }
            while (false);
            this._storeFloat((_31_ + 8), ((this._loadFloat((_31_ + 8))) + (this._loadFloat((_31_ + 24)))));
        }
        while (false);
        label$6:
        do {
            if (((this._loadInt((_31_ + 16))) >>> 31) == 0) {
                break label$6;
            }
            this._storeFloat((_31_ + 8), (-(this._loadFloat((_31_ + 8)))));
        }
        while (false);
        this._storeFloat((_31_ + 28), (this._loadFloat((_31_ + 8))));
        return (this._loadFloat((_31_ + 28)));
    }

    @Override()
    public final void roundl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (round((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final double scalb(double _30_, double _31_)
    {
        int _32_ = 0;
        this._storeDouble(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 16), _30_);
        this._storeDouble((_32_ + 8), _31_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((((__DOUBLE_BITS$2e$231((this._loadDouble((_32_ + 16))))) & 9223372036854775807L) & 4294967295L) > (9218868437227405312L & 4294967295L)) {
                        break label$2;
                    }
                    if ((((__DOUBLE_BITS$2e$231((this._loadDouble((_32_ + 8))))) & 9223372036854775807L) & 4294967295L) < (9218868437227405313L & 4294967295L)) {
                        break label$1;
                    }
                }
                while (false);
                this._storeDouble((_32_ + 24), ((this._loadDouble((_32_ + 16))) * (this._loadDouble((_32_ + 8)))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if ((((__DOUBLE_BITS$2e$231((this._loadDouble((_32_ + 8))))) & 9223372036854775807L) & 4294967295L) >= (9218868437227405312L & 4294967295L)) {
                        break label$4;
                    }
                    if ((Math.round((_31_ = this._loadDouble((_32_ + 8))))) == _31_) {
                        break label$3;
                    }
                    this._storeDouble((_32_ + 24), ((_31_ = (_31_ = this._loadDouble((_32_ + 8))) - _31_) / _31_));
                    break label$0;
                }
                while (false);
                label$5:
                do {
                    if (((((_31_ = this._loadDouble((_32_ + 8))) <= 0.0) ? 1 : 0) | ((_31_ != _31_) ? 1 : 0)) != 0) {
                        break label$5;
                    }
                    this._storeDouble((_32_ + 24), ((this._loadDouble((_32_ + 16))) * (this._loadDouble((_32_ + 8)))));
                    break label$0;
                }
                while (false);
                this._storeDouble((_32_ + 24), ((this._loadDouble((_32_ + 16))) / (-(this._loadDouble((_32_ + 8))))));
                break label$0;
            }
            while (false);
            label$6:
            do {
                if (((((_31_ = this._loadDouble((_32_ + 8))) <= 65000.0) ? 1 : 0) | ((_31_ != _31_) ? 1 : 0)) != 0) {
                    break label$6;
                }
                this._storeDouble((_32_ + 24), (scalbn((this._loadDouble((_32_ + 16))), 65000)));
                break label$0;
            }
            while (false);
            label$7:
            do {
                if (((((_31_ = -(this._loadDouble((_32_ + 8)))) <= 65000.0) ? 1 : 0) | ((_31_ != _31_) ? 1 : 0)) != 0) {
                    break label$7;
                }
                this._storeDouble((_32_ + 24), (scalbn((this._loadDouble((_32_ + 16))), -65000)));
                break label$0;
            }
            while (false);
            this._storeDouble((_32_ + 24), (scalbn((this._loadDouble((_32_ + 16))), (_truncateDoubleToSignedInteger((this._loadDouble((_32_ + 8))))))));
        }
        while (false);
        _31_ = this._loadDouble((_32_ + 24));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$230(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$231(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final float scalbf(float _30_, float _31_)
    {
        int _32_ = 0;
        this._storeFloat(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeFloat((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((((__FLOAT_BITS$2e$232((this._loadFloat((_32_ + 8))))) & 2147483647) & 4294967295L) > (2139095040 & 4294967295L)) {
                        break label$2;
                    }
                    if ((((__FLOAT_BITS$2e$232((this._loadFloat((_32_ + 4))))) & 2147483647) & 4294967295L) < (2139095041 & 4294967295L)) {
                        break label$1;
                    }
                }
                while (false);
                this._storeFloat((_32_ + 12), ((this._loadFloat((_32_ + 8))) * (this._loadFloat((_32_ + 4)))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if ((((__FLOAT_BITS$2e$232((this._loadFloat((_32_ + 4))))) & 2147483647) & 4294967295L) >= (2139095040 & 4294967295L)) {
                        break label$4;
                    }
                    if ((Math.round((_31_ = this._loadFloat((_32_ + 4))))) == _31_) {
                        break label$3;
                    }
                    this._storeFloat((_32_ + 12), ((_31_ = (_31_ = this._loadFloat((_32_ + 4))) - _31_) / _31_));
                    break label$0;
                }
                while (false);
                label$5:
                do {
                    if (((((_31_ = this._loadFloat((_32_ + 4))) <= 0.0f) ? 1 : 0) | ((_31_ != _31_) ? 1 : 0)) != 0) {
                        break label$5;
                    }
                    this._storeFloat((_32_ + 12), ((this._loadFloat((_32_ + 8))) * (this._loadFloat((_32_ + 4)))));
                    break label$0;
                }
                while (false);
                this._storeFloat((_32_ + 12), ((this._loadFloat((_32_ + 8))) / (-(this._loadFloat((_32_ + 4))))));
                break label$0;
            }
            while (false);
            label$6:
            do {
                if (((((_31_ = this._loadFloat((_32_ + 4))) <= 65000.0f) ? 1 : 0) | ((_31_ != _31_) ? 1 : 0)) != 0) {
                    break label$6;
                }
                this._storeFloat((_32_ + 12), (scalbnf((this._loadFloat((_32_ + 8))), 65000)));
                break label$0;
            }
            while (false);
            label$7:
            do {
                if (((((_31_ = -(this._loadFloat((_32_ + 4)))) <= 65000.0f) ? 1 : 0) | ((_31_ != _31_) ? 1 : 0)) != 0) {
                    break label$7;
                }
                this._storeFloat((_32_ + 12), (scalbnf((this._loadFloat((_32_ + 8))), -65000)));
                break label$0;
            }
            while (false);
            this._storeFloat((_32_ + 12), (scalbnf((this._loadFloat((_32_ + 8))), (_truncateFloatToSignedInteger((this._loadFloat((_32_ + 4))))))));
        }
        while (false);
        _31_ = this._loadFloat((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int __FLOAT_BITS$2e$232(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), (this._storeFloat((_31_ + 12), _30_)));
        return (this._loadInt((_31_ + 8)));
    }

    @Override()
    public final long __DOUBLE_BITS$2e$233(double _30_)
    {
        int _31_ = 0;
        this._storeDouble((_31_ = (this._loadInt((0 + 4))) - 16), (this._storeDouble((_31_ + 8), _30_)));
        return (this._loadLong(_31_));
    }

    @Override()
    public final double scalbln(double _30_, int _31_)
    {
        int _32_ = 0;
        this._storeDouble(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                if (1 != 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 4), 2147483647);
                break label$0;
            }
            while (false);
            if (1 != 0) {
                break label$0;
            }
            this._storeInt((_32_ + 4), -2147483648);
        }
        while (false);
        _30_ = scalbn((this._loadDouble((_32_ + 8))), (this._loadInt((_32_ + 4))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _30_;
    }

    @Override()
    public final float scalblnf(float _30_, int _31_)
    {
        int _32_ = 0;
        this._storeFloat(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            label$1:
            do {
                if (1 != 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 8), 2147483647);
                break label$0;
            }
            while (false);
            if (1 != 0) {
                break label$0;
            }
            this._storeInt((_32_ + 8), -2147483648);
        }
        while (false);
        _30_ = scalbnf((this._loadFloat((_32_ + 12))), (this._loadInt((_32_ + 8))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _30_;
    }

    @Override()
    public final void scalblnl(int _30_, long _31_, long _32_, int _33_)
    {
        int _34_ = 0;
        this._storeLong(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), _31_);
        this._storeInt((_34_ + 28), _33_);
        this._storeLong((_34_ + 40), _32_);
        this.__extenddftf2.invoke((_34_ + 8), (scalbln((this.__trunctfdf2.invoke((this._loadLong((_34_ + 32))), _32_)), _33_)));
        this._storeLong((_30_ + 8), (this._loadLong(((_34_ + 8) + 8))));
        this._storeLong(_30_, (this._loadLong((_34_ + 8))));
        this._storeInt((0 + 4), (_34_ + 48));
        return;
    }

    @Override()
    public final double scalbn(double _30_, int _31_)
    {
        int _32_ = 0;
        this._storeDouble(((_32_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeDouble(_32_, (this._loadDouble((_32_ + 24))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_32_ + 20))) < 1024) {
                    break label$1;
                }
                this._storeDouble(_32_, ((this._loadDouble(_32_)) * 8.98846567431158E307));
                if ((this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + -1023))) < 1024) {
                    break label$0;
                }
                this._storeDouble(_32_, ((this._loadDouble(_32_)) * 8.98846567431158E307));
                if ((this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + -1023))) < 1024) {
                    break label$0;
                }
                this._storeInt((_32_ + 20), 1023);
                break label$0;
            }
            while (false);
            if ((this._loadInt((_32_ + 20))) > -1023) {
                break label$0;
            }
            this._storeDouble(_32_, ((this._loadDouble(_32_)) * 2.2250738585072014E-308));
            if ((this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1022))) > -1023) {
                break label$0;
            }
            this._storeDouble(_32_, ((this._loadDouble(_32_)) * 2.2250738585072014E-308));
            if ((this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1022))) > -1023) {
                break label$0;
            }
            this._storeInt((_32_ + 20), -1022);
        }
        while (false);
        this._storeLong((_32_ + 8), ((((this._loadInt((_32_ + 20))) + 1023) & 4294967295L) << 52L));
        return (this._storeDouble((_32_ + 24), ((this._loadDouble(_32_)) * (this._loadDouble((_32_ + 8))))));
    }

    @Override()
    public final float scalbnf(float _30_, int _31_)
    {
        int _32_ = 0;
        this._storeFloat(((_32_ = (this._loadInt((0 + 4))) - 32) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeFloat((_32_ + 12), (this._loadFloat((_32_ + 28))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_32_ + 24))) < 128) {
                    break label$1;
                }
                this._storeFloat((_32_ + 12), ((this._loadFloat((_32_ + 12))) * 1.7014118E38f));
                if ((this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + -127))) < 128) {
                    break label$0;
                }
                this._storeFloat((_32_ + 12), ((this._loadFloat((_32_ + 12))) * 1.7014118E38f));
                if ((this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + -127))) < 128) {
                    break label$0;
                }
                this._storeInt((_32_ + 24), 127);
                break label$0;
            }
            while (false);
            if ((this._loadInt((_32_ + 24))) > -127) {
                break label$0;
            }
            this._storeFloat((_32_ + 12), ((this._loadFloat((_32_ + 12))) * 1.17549435E-38f));
            if ((this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 126))) > -127) {
                break label$0;
            }
            this._storeFloat((_32_ + 12), ((this._loadFloat((_32_ + 12))) * 1.17549435E-38f));
            if ((this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 126))) > -127) {
                break label$0;
            }
            this._storeInt((_32_ + 24), -126);
        }
        while (false);
        this._storeInt((_32_ + 16), (((this._loadInt((_32_ + 24))) << 23) + 1065353216));
        return (this._storeFloat((_32_ + 28), ((this._loadFloat((_32_ + 12))) * (this._loadFloat((_32_ + 16))))));
    }

    @Override()
    public final void scalbnl(int _30_, long _31_, long _32_, int _33_)
    {
        int _34_ = 0;
        this._storeLong(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), _31_);
        this._storeInt((_34_ + 28), _33_);
        this._storeLong((_34_ + 40), _32_);
        this.__extenddftf2.invoke((_34_ + 8), (scalbn((this.__trunctfdf2.invoke((this._loadLong((_34_ + 32))), _32_)), _33_)));
        this._storeLong((_30_ + 8), (this._loadLong(((_34_ + 8) + 8))));
        this._storeLong(_30_, (this._loadLong((_34_ + 8))));
        this._storeInt((0 + 4), (_34_ + 48));
        return;
    }

    @Override()
    public final int seed48(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        memcpy(14755, 4220, 6);
        memcpy(4220, (this._loadInt((_31_ + 12))), 6);
        this._storeInt((0 + 4), (_31_ + 16));
        return 14755;
    }

    @Override()
    public final void setbuf(int _30_, int _31_)
    {
        int _32_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _temp$0 = 0;
        _temp$1 = 2;
        _temp$2 = (_31_ != 0) ? _temp$0 : _temp$1;
        setvbuf((this._loadInt((_32_ + 12))), _31_, _temp$2, 1024);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void setbuffer(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _temp$0 = 0;
        _temp$1 = 2;
        _temp$2 = (_31_ != 0) ? _temp$0 : _temp$1;
        setvbuf((this._loadInt((_33_ + 12))), (_31_ = this._loadInt((_33_ + 8))), _temp$2, _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int setegid(int _30_)
    {
        int _31_ = 0;
        _30_ = __setxid(170, -1, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), -1);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int setenv(int _30_, int _31_, int _32_)
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
                    if ((this._loadInt((_33_ + 24))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt8u((this._loadInt((_33_ + 24))))) == 0) {
                        break label$2;
                    }
                    if ((strchr((this._loadInt((_33_ + 24))), 61)) == 0) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((__errno_location()), 22);
                this._storeInt((_33_ + 28), -1);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((_33_ + 16))) != 0) {
                    break label$3;
                }
                if ((getenv((this._loadInt((_33_ + 24))))) == 0) {
                    break label$3;
                }
                this._storeInt((_33_ + 28), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 8), (strlen((this._loadInt((_33_ + 24))))));
            label$4:
            do {
                label$5:
                do {
                    if ((this._storeInt((_33_ + 12), (malloc((((this._storeInt((_33_ + 4), (strlen((this._loadInt((_33_ + 20))))))) + (this._loadInt((_33_ + 8)))) + 2))))) == 0) {
                        break label$5;
                    }
                    memcpy((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 8))));
                    this._storeInt8((_32_ = (this._loadInt((_33_ + 12))) + (this._loadInt((_33_ + 8)))), 61);
                    memcpy((_32_ + 1), (this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 4))));
                    _31_ = this._storeInt8((((_32_ = this._loadInt((_33_ + 12))) + ((this._loadInt((_33_ + 8))) + (this._loadInt((_33_ + 4))))) + 1), 0);
                    if ((__putenv(_32_, 1)) == 0) {
                        break label$4;
                    }
                }
                while (false);
                free((this._loadInt((_33_ + 12))));
                this._storeInt((_33_ + 28), -1);
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 28), _31_);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int seteuid(int _30_)
    {
        int _31_ = 0;
        _30_ = __setxid(164, -1, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), -1);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int setgid(int _30_)
    {
        int _31_ = 0;
        _30_ = __setxid(46, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 0, 0);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void setlinebuf(int _30_)
    {
        int _31_ = 0;
        setvbuf((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 0, 1, 0);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int setpgid(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = __syscall_ret((this.__syscall2.invoke(57, (this._loadInt((_32_ + 12))), _31_)));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int setpgrp()
    {
        return (setpgid(0, 0));
    }

    @Override()
    public final int setregid(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = __setxid(71, (this._loadInt((_32_ + 12))), _31_, 0);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int setresgid(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = __setxid(170, (this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int setresuid(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = __setxid(164, (this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int setreuid(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = __setxid(70, (this._loadInt((_32_ + 12))), _31_, 0);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int setsid()
    {
        return (__syscall_ret((this.__syscall0.invoke(66))));
    }

    @Override()
    public final int setuid(int _30_)
    {
        int _31_ = 0;
        _30_ = __setxid(23, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), 0, 0);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int setvbuf(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        this._storeInt8(((this._loadInt((_34_ + 12))) + 75), 255);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_34_ + 4))) != 2) {
                    break label$1;
                }
                this._storeInt(((this._loadInt((_34_ + 12))) + 48), 0);
                break label$0;
            }
            while (false);
            if ((this._loadInt((_34_ + 4))) != 1) {
                break label$0;
            }
            this._storeInt8(((this._loadInt((_34_ + 12))) + 75), 10);
        }
        while (false);
        this._storeInt((_34_ = this._loadInt((_34_ + 12))), ((this._loadInt(_34_)) | 64));
        return 0;
    }

    @Override()
    public final int __setxid(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_34_ + 36), _31_);
        this._storeInt((_34_ + 32), _32_);
        this._storeInt((_34_ + 28), _33_);
        this._storeInt((_34_ + 8), (this._loadInt((_34_ + 36))));
        this._storeInt((_34_ + 12), (this._loadInt((_34_ + 32))));
        this._storeInt((_34_ + 16), (this._loadInt((_34_ + 28))));
        this._storeInt((_34_ + 20), (this._loadInt((_34_ + 40))));
        this._storeInt((_34_ + 24), -1);
        this.__synccall.invoke(9, (_34_ + 8));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_34_ + 24))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt((_34_ + 24))) < 1) {
                        break label$2;
                    }
                    _33_ = this._loadInt((_34_ + 24));
                    this._storeInt((__errno_location()), _33_);
                }
                while (false);
                this._storeInt((_34_ + 44), -1);
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
    public final void do_setxid(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((this._loadInt(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), (this._storeInt((_31_ + 12), _30_)))) + 16))) > 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._storeInt((_31_ + 4), (0 - (this.__syscall3.invoke((this._loadInt(((_30_ = this._loadInt((_31_ + 8))) + 12))), (this._loadInt(_30_)), (this._loadInt((_30_ + 4))), (this._loadInt((_30_ + 8)))))))) == 0) {
                    break label$1;
                }
                if ((this._loadInt(((this._loadInt((_31_ + 8))) + 16))) != 0) {
                    break label$1;
                }
                this.__block_all_sigs.invoke(0);
                this.__syscall2.invoke(37, (this.__syscall0.invoke(20)), 9);
            }
            while (false);
            this._storeInt(((this._loadInt((_31_ + 8))) + 16), (this._loadInt((_31_ + 4))));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void __shlim(int _30_, long _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeLong(_32_, _31_);
        this._storeLong(((_30_ = this._loadInt((_32_ + 12))) + 112), _31_);
        this._storeLong((_30_ + 120), ((long) ((this._loadInt((_30_ + 8))) - (this._loadInt((_30_ + 4))))));
        label$0:
        do {
            if (_31_ == 0) {
                break label$0;
            }
            if ((this._loadLong(((this._loadInt((_32_ + 12))) + 120))) <= (this._loadLong(_32_))) {
                break label$0;
            }
            this._storeInt(((_30_ = this._loadInt((_32_ + 12))) + 104), ((this._loadInt((_30_ + 4))) + (this._loadInt(_32_))));
            return;
        }
        while (false);
        this._storeInt(((_32_ = this._loadInt((_32_ + 12))) + 104), (this._loadInt((_32_ + 8))));
        return;
    }

    @Override()
    public final int __shgetc(int _30_)
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
                            if ((this._loadLong(((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)) + 112))) == 0) {
                                break label$4;
                            }
                            if ((this._loadLong(((_30_ = this._loadInt((_31_ + 8))) + 120))) >= (this._loadLong((_30_ + 112)))) {
                                break label$3;
                            }
                        }
                        while (false);
                        if ((this._storeInt((_31_ + 4), (__uflow((this._loadInt((_31_ + 8))))))) <= -1) {
                            break label$3;
                        }
                        if ((this._loadLong(((this._loadInt((_31_ + 8))) + 112))) == 0) {
                            break label$2;
                        }
                        if (((long) ((this._loadInt(((_30_ = this._loadInt((_31_ + 8))) + 8))) - (this._loadInt((_30_ + 4))))) <= (((this._loadLong((_30_ + 112))) - (this._loadLong((_30_ + 120)))) + -1L)) {
                            break label$2;
                        }
                        this._storeInt(((_30_ = this._loadInt((_31_ + 8))) + 104), ((this._loadInt((_30_ + 4))) + ((int) (((this._loadLong((_30_ + 112))) - (this._loadLong((_30_ + 120)))) + -1L))));
                        break label$1;
                    }
                    while (false);
                    this._storeInt(((this._loadInt((_31_ + 8))) + 104), 0);
                    this._storeInt((_31_ + 12), -1);
                    break label$0;
                }
                while (false);
                this._storeInt(((_30_ = this._loadInt((_31_ + 8))) + 104), (this._loadInt((_30_ + 8))));
            }
            while (false);
            label$5:
            do {
                if ((this._loadInt(((this._loadInt((_31_ + 8))) + 8))) == 0) {
                    break label$5;
                }
                this._storeLong(((_30_ = this._loadInt((_31_ + 8))) + 120), ((this._loadLong((_30_ + 120))) + ((long) (((this._loadInt((_30_ + 8))) - (this._loadInt((_30_ + 4)))) + 1))));
            }
            while (false);
            label$6:
            do {
                if ((this._loadInt8u(((this._loadInt(((this._loadInt((_31_ + 8))) + 4))) + -1))) == (this._loadInt((_31_ + 4)))) {
                    break label$6;
                }
                this._storeInt8(((this._loadInt(((this._loadInt((_31_ + 8))) + 4))) + -1), (this._loadInt((_31_ + 4))));
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
    public final double significand(double _30_)
    {
        int _31_ = 0;
        _30_ = scalbn((_30_ = this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)), (0 - (ilogb(_30_))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final float significandf(float _30_)
    {
        int _31_ = 0;
        _30_ = scalbnf((_30_ = this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), (0 - (ilogbf(_30_))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final double sin(double _30_)
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
                                            if (((this._storeInt((_31_ + 28), ((this._storeInt((_31_ + 28), (this._loadInt((_31_ + 20))))) & 2147483647))) & 4294967295L) > (1072243195 & 4294967295L)) {
                                                break label$8;
                                            }
                                            if (((this._loadInt((_31_ + 28))) & 4294967295L) > (1045430271 & 4294967295L)) {
                                                break label$7;
                                            }
                                            if (((this._loadInt((_31_ + 28))) & 4294967295L) > (1048575 & 4294967295L)) {
                                                break label$5;
                                            }
                                            _30_ = (this._loadDouble((_31_ + 48))) / 1.3292279957849159E36;
                                            break label$4;
                                        }
                                        while (false);
                                        if (((this._loadInt((_31_ + 28))) & 4294967295L) < (2146435072 & 4294967295L)) {
                                            break label$6;
                                        }
                                        this._storeDouble((_31_ + 56), ((_30_ = this._loadDouble((_31_ + 48))) - _30_));
                                        break label$0;
                                    }
                                    while (false);
                                    this._storeDouble((_31_ + 56), (__sin((this._loadDouble((_31_ + 48))), 0.0, 0)));
                                    break label$0;
                                }
                                while (false);
                                if ((_32_ = (this._storeInt((_31_ + 24), (__rem_pio2((this._loadDouble((_31_ + 48))), (_31_ + 32))))) & 3) == 2) {
                                    break label$3;
                                }
                                if (_32_ == 1) {
                                    break label$2;
                                }
                                if (_32_ != 0) {
                                    break label$1;
                                }
                                this._storeDouble((_31_ + 56), (__sin((this._loadDouble((_31_ + 32))), (this._loadDouble((_31_ + 40))), 1)));
                                break label$0;
                            }
                            while (false);
                            _30_ = (this._loadDouble((_31_ + 48))) + 1.3292279957849159E36;
                        }
                        while (false);
                        this._storeDouble((_31_ + 8), _30_);
                        this._storeDouble((_31_ + 56), (this._loadDouble((_31_ + 48))));
                        break label$0;
                    }
                    while (false);
                    this._storeDouble((_31_ + 56), (-(__sin((this._loadDouble((_31_ + 32))), (this._loadDouble((_31_ + 40))), 1))));
                    break label$0;
                }
                while (false);
                this._storeDouble((_31_ + 56), (__cos((this._loadDouble((_31_ + 32))), (this._loadDouble((_31_ + 40))))));
                break label$0;
            }
            while (false);
            this._storeDouble((_31_ + 56), (-(__cos((this._loadDouble((_31_ + 32))), (this._loadDouble((_31_ + 40)))))));
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 56));
        this._storeInt((0 + 4), (_31_ + 64));
        return _30_;
    }

    @Override()
    public final void sincos(double _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeDouble(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 72), _30_);
        this._storeInt((_33_ + 68), _31_);
        this._storeInt((_33_ + 64), _32_);
        this._storeDouble((_33_ + 16), (this._loadDouble((_33_ + 72))));
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
                                            if (((this._storeInt((_33_ + 28), ((this._storeInt((_33_ + 28), (this._loadInt((_33_ + 20))))) & 2147483647))) & 4294967295L) > (1072243195 & 4294967295L)) {
                                                break label$8;
                                            }
                                            if (((this._loadInt((_33_ + 28))) & 4294967295L) > (1044816029 & 4294967295L)) {
                                                break label$7;
                                            }
                                            if (((this._loadInt((_33_ + 28))) & 4294967295L) > (1048575 & 4294967295L)) {
                                                break label$5;
                                            }
                                            _30_ = (this._loadDouble((_33_ + 72))) / 1.3292279957849159E36;
                                            break label$4;
                                        }
                                        while (false);
                                        if (((this._loadInt((_33_ + 28))) & 4294967295L) < (2146435072 & 4294967295L)) {
                                            break label$6;
                                        }
                                        _30_ = this._storeDouble((this._loadInt((_33_ + 64))), ((_30_ = this._loadDouble((_33_ + 72))) - _30_));
                                        this._storeDouble((this._loadInt((_33_ + 68))), _30_);
                                        break label$0;
                                    }
                                    while (false);
                                    _30_ = __sin((this._loadDouble((_33_ + 72))), 0.0, 0);
                                    this._storeDouble((this._loadInt((_33_ + 68))), _30_);
                                    _30_ = __cos((this._loadDouble((_33_ + 72))), 0.0);
                                    this._storeDouble((this._loadInt((_33_ + 64))), _30_);
                                    break label$0;
                                }
                                while (false);
                                this._storeInt((_33_ + 24), (__rem_pio2((this._loadDouble((_33_ + 72))), (_33_ + 48))));
                                this._storeDouble((_33_ + 40), (__sin((this._loadDouble((_33_ + 48))), (this._loadDouble((_33_ + 56))), 1)));
                                this._storeDouble((_33_ + 32), (__cos((this._loadDouble((_33_ + 48))), (this._loadDouble((_33_ + 56))))));
                                if ((_32_ = (this._loadInt((_33_ + 24))) & 3) == 2) {
                                    break label$3;
                                }
                                if (_32_ == 1) {
                                    break label$2;
                                }
                                if (_32_ != 0) {
                                    break label$1;
                                }
                                this._storeDouble((this._loadInt((_33_ + 68))), (this._loadDouble((_33_ + 40))));
                                this._storeDouble((this._loadInt((_33_ + 64))), (this._loadDouble((_33_ + 32))));
                                break label$0;
                            }
                            while (false);
                            _30_ = (this._loadDouble((_33_ + 72))) + 1.3292279957849159E36;
                        }
                        while (false);
                        this._storeDouble((_33_ + 8), _30_);
                        this._storeDouble((this._loadInt((_33_ + 68))), (this._loadDouble((_33_ + 72))));
                        this._storeLong((this._loadInt((_33_ + 64))), 4607182418800017408L);
                        break label$0;
                    }
                    while (false);
                    this._storeDouble((this._loadInt((_33_ + 68))), (-(this._loadDouble((_33_ + 40)))));
                    this._storeDouble((this._loadInt((_33_ + 64))), (-(this._loadDouble((_33_ + 32)))));
                    break label$0;
                }
                while (false);
                this._storeDouble((this._loadInt((_33_ + 68))), (this._loadDouble((_33_ + 32))));
                this._storeDouble((this._loadInt((_33_ + 64))), (-(this._loadDouble((_33_ + 40)))));
                break label$0;
            }
            while (false);
            this._storeDouble((this._loadInt((_33_ + 68))), (-(this._loadDouble((_33_ + 32)))));
            this._storeDouble((this._loadInt((_33_ + 64))), (this._loadDouble((_33_ + 40))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 80));
        return;
    }

    @Override()
    public final void sincosf(float _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        double _34_ = 0.0;
        this._storeFloat(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_33_ + 56), _31_);
        this._storeInt((_33_ + 52), _32_);
        this._storeFloat((_33_ + 16), (this._loadFloat((_33_ + 60))));
        this._storeInt((_33_ + 20), ((this._storeInt((_33_ + 28), (this._loadInt((_33_ + 16))))) >>> 31));
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
                                                                            label$17:
                                                                            do {
                                                                                label$18:
                                                                                do {
                                                                                    if (((this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) & 2147483647))) & 4294967295L) > (1061752794 & 4294967295L)) {
                                                                                        break label$18;
                                                                                    }
                                                                                    if (((this._loadInt((_33_ + 28))) & 4294967295L) > (964689919 & 4294967295L)) {
                                                                                        break label$17;
                                                                                    }
                                                                                    if (((this._loadInt((_33_ + 28))) & 4294967295L) > (1048575 & 4294967295L)) {
                                                                                        break label$15;
                                                                                    }
                                                                                    _30_ = (this._loadFloat((_33_ + 60))) / 1.329228E36f;
                                                                                    break label$14;
                                                                                }
                                                                                while (false);
                                                                                if (((this._loadInt((_33_ + 28))) & 4294967295L) > (1081824209 & 4294967295L)) {
                                                                                    break label$16;
                                                                                }
                                                                                if (((this._loadInt((_33_ + 28))) & 4294967295L) > (1075235811 & 4294967295L)) {
                                                                                    break label$13;
                                                                                }
                                                                                if ((this._loadInt((_33_ + 20))) == 0) {
                                                                                    break label$9;
                                                                                }
                                                                                _30_ = __cosdf((((double) (this._loadFloat((_33_ + 60)))) + 1.5707963267948966));
                                                                                this._storeFloat((this._loadInt((_33_ + 56))), (-_30_));
                                                                                _30_ = __sindf((((double) (this._loadFloat((_33_ + 60)))) + 1.5707963267948966));
                                                                                this._storeFloat((this._loadInt((_33_ + 52))), _30_);
                                                                                break label$0;
                                                                            }
                                                                            while (false);
                                                                            _30_ = __sindf(((double) (this._loadFloat((_33_ + 60)))));
                                                                            this._storeFloat((this._loadInt((_33_ + 56))), _30_);
                                                                            _30_ = __cosdf(((double) (this._loadFloat((_33_ + 60)))));
                                                                            this._storeFloat((this._loadInt((_33_ + 52))), _30_);
                                                                            break label$0;
                                                                        }
                                                                        while (false);
                                                                        if (((this._loadInt((_33_ + 28))) & 4294967295L) > (1088565717 & 4294967295L)) {
                                                                            break label$12;
                                                                        }
                                                                        if (((this._loadInt((_33_ + 28))) & 4294967295L) > (1085271519 & 4294967295L)) {
                                                                            break label$11;
                                                                        }
                                                                        if ((this._loadInt((_33_ + 20))) == 0) {
                                                                            break label$6;
                                                                        }
                                                                        _30_ = __cosdf((((double) (this._loadFloat((_33_ + 60)))) + 4.71238898038469));
                                                                        this._storeFloat((this._loadInt((_33_ + 56))), _30_);
                                                                        _30_ = __sindf((((double) (this._loadFloat((_33_ + 60)))) + 4.71238898038469));
                                                                        this._storeFloat((this._loadInt((_33_ + 52))), (-_30_));
                                                                        break label$0;
                                                                    }
                                                                    while (false);
                                                                    _30_ = (this._loadFloat((_33_ + 60))) + 1.329228E36f;
                                                                }
                                                                while (false);
                                                                this._storeFloat((_33_ + 12), _30_);
                                                                this._storeFloat((this._loadInt((_33_ + 56))), (this._loadFloat((_33_ + 60))));
                                                                this._storeInt((this._loadInt((_33_ + 52))), 1065353216);
                                                                break label$0;
                                                            }
                                                            while (false);
                                                            if ((this._loadInt((_33_ + 20))) == 0) {
                                                                break label$8;
                                                            }
                                                            _34_ = ((double) (this._loadFloat((_33_ + 60)))) + 3.141592653589793;
                                                            break label$7;
                                                        }
                                                        while (false);
                                                        if (((this._loadInt((_33_ + 28))) & 4294967295L) < (2139095040 & 4294967295L)) {
                                                            break label$10;
                                                        }
                                                        _30_ = this._storeFloat((this._loadInt((_33_ + 52))), ((_30_ = this._loadFloat((_33_ + 60))) - _30_));
                                                        this._storeFloat((this._loadInt((_33_ + 56))), _30_);
                                                        break label$0;
                                                    }
                                                    while (false);
                                                    if ((this._loadInt((_33_ + 20))) == 0) {
                                                        break label$5;
                                                    }
                                                    _34_ = ((double) (this._loadFloat((_33_ + 60)))) + 6.283185307179586;
                                                    break label$4;
                                                }
                                                while (false);
                                                this._storeInt((_33_ + 24), (__rem_pio2f((this._loadFloat((_33_ + 60))), (_33_ + 40))));
                                                this._storeFloat((_33_ + 36), (__sindf((this._loadDouble((_33_ + 40))))));
                                                this._storeFloat((_33_ + 32), (__cosdf((this._loadDouble((_33_ + 40))))));
                                                if ((_32_ = (this._loadInt((_33_ + 24))) & 3) == 2) {
                                                    break label$3;
                                                }
                                                if (_32_ == 1) {
                                                    break label$2;
                                                }
                                                if (_32_ != 0) {
                                                    break label$1;
                                                }
                                                this._storeFloat((this._loadInt((_33_ + 56))), (this._loadFloat((_33_ + 36))));
                                                this._storeFloat((this._loadInt((_33_ + 52))), (this._loadFloat((_33_ + 32))));
                                                break label$0;
                                            }
                                            while (false);
                                            _30_ = __cosdf((1.5707963267948966 - ((double) (this._loadFloat((_33_ + 60))))));
                                            this._storeFloat((this._loadInt((_33_ + 56))), _30_);
                                            _30_ = __sindf((1.5707963267948966 - ((double) (this._loadFloat((_33_ + 60))))));
                                            this._storeFloat((this._loadInt((_33_ + 52))), _30_);
                                            break label$0;
                                        }
                                        while (false);
                                        _34_ = ((double) (this._loadFloat((_33_ + 60)))) + -3.141592653589793;
                                    }
                                    while (false);
                                    _30_ = __sindf(_34_);
                                    this._storeFloat((this._loadInt((_33_ + 56))), (-_30_));
                                    label$19:
                                    do {
                                        label$20:
                                        do {
                                            if ((this._loadInt((_33_ + 20))) == 0) {
                                                break label$20;
                                            }
                                            _34_ = ((double) (this._loadFloat((_33_ + 60)))) + 3.141592653589793;
                                            break label$19;
                                        }
                                        while (false);
                                        _34_ = ((double) (this._loadFloat((_33_ + 60)))) + -3.141592653589793;
                                    }
                                    while (false);
                                    _30_ = __cosdf(_34_);
                                    this._storeFloat((this._loadInt((_33_ + 52))), (-_30_));
                                    break label$0;
                                }
                                while (false);
                                _30_ = __cosdf((((double) (this._loadFloat((_33_ + 60)))) - 4.71238898038469));
                                this._storeFloat((this._loadInt((_33_ + 56))), (-_30_));
                                _30_ = __sindf((((double) (this._loadFloat((_33_ + 60)))) - 4.71238898038469));
                                this._storeFloat((this._loadInt((_33_ + 52))), _30_);
                                break label$0;
                            }
                            while (false);
                            _34_ = ((double) (this._loadFloat((_33_ + 60)))) + -6.283185307179586;
                        }
                        while (false);
                        _30_ = __sindf(_34_);
                        this._storeFloat((this._loadInt((_33_ + 56))), _30_);
                        label$21:
                        do {
                            label$22:
                            do {
                                if ((this._loadInt((_33_ + 20))) == 0) {
                                    break label$22;
                                }
                                _34_ = ((double) (this._loadFloat((_33_ + 60)))) + 6.283185307179586;
                                break label$21;
                            }
                            while (false);
                            _34_ = ((double) (this._loadFloat((_33_ + 60)))) + -6.283185307179586;
                        }
                        while (false);
                        _30_ = __cosdf(_34_);
                        this._storeFloat((this._loadInt((_33_ + 52))), _30_);
                        break label$0;
                    }
                    while (false);
                    this._storeFloat((this._loadInt((_33_ + 56))), (-(this._loadFloat((_33_ + 36)))));
                    this._storeFloat((this._loadInt((_33_ + 52))), (-(this._loadFloat((_33_ + 32)))));
                    break label$0;
                }
                while (false);
                this._storeFloat((this._loadInt((_33_ + 56))), (this._loadFloat((_33_ + 32))));
                this._storeFloat((this._loadInt((_33_ + 52))), (-(this._loadFloat((_33_ + 36)))));
                break label$0;
            }
            while (false);
            this._storeFloat((this._loadInt((_33_ + 56))), (-(this._loadFloat((_33_ + 32)))));
            this._storeFloat((this._loadInt((_33_ + 52))), (this._loadFloat((_33_ + 36))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 64));
        return;
    }

    @Override()
    public final void sincosl(long _30_, long _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeLong(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 64), _30_);
        this._storeInt((_34_ + 60), _32_);
        this._storeInt((_34_ + 56), _33_);
        this._storeLong((_34_ + 72), _31_);
        sincos((this.__trunctfdf2.invoke((this._loadLong((_34_ + 64))), _31_)), (_34_ + 48), (_34_ + 40));
        this.__extenddftf2.invoke((_34_ + 8), (this._loadDouble((_34_ + 48))));
        this._storeLong(((_33_ = this._loadInt((_34_ + 60))) + 8), (this._loadLong(((_34_ + 8) + 8))));
        this._storeLong(_33_, (this._loadLong((_34_ + 8))));
        this.__extenddftf2.invoke((_34_ + 24), (this._loadDouble((_34_ + 40))));
        this._storeLong(((_33_ = this._loadInt((_34_ + 56))) + 8), (this._loadLong(((_34_ + 24) + 8))));
        this._storeLong(_33_, (this._loadLong((_34_ + 24))));
        this._storeInt((0 + 4), (_34_ + 80));
        return;
    }

    @Override()
    public final float sinf(float _30_)
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
                                                                            label$17:
                                                                            do {
                                                                                label$18:
                                                                                do {
                                                                                    if (((this._storeInt((_31_ + 28), ((this._loadInt((_31_ + 28))) & 2147483647))) & 4294967295L) > (1061752794 & 4294967295L)) {
                                                                                        break label$18;
                                                                                    }
                                                                                    if (((this._loadInt((_31_ + 28))) & 4294967295L) > (964689919 & 4294967295L)) {
                                                                                        break label$17;
                                                                                    }
                                                                                    if (((this._loadInt((_31_ + 28))) & 4294967295L) > (8388607 & 4294967295L)) {
                                                                                        break label$15;
                                                                                    }
                                                                                    _30_ = (this._loadFloat((_31_ + 40))) / 1.329228E36f;
                                                                                    break label$14;
                                                                                }
                                                                                while (false);
                                                                                if (((this._loadInt((_31_ + 28))) & 4294967295L) > (1081824209 & 4294967295L)) {
                                                                                    break label$16;
                                                                                }
                                                                                if (((this._loadInt((_31_ + 28))) & 4294967295L) > (1075235811 & 4294967295L)) {
                                                                                    break label$13;
                                                                                }
                                                                                if ((this._loadInt((_31_ + 20))) == 0) {
                                                                                    break label$9;
                                                                                }
                                                                                this._storeFloat((_31_ + 44), (-(__cosdf((((double) (this._loadFloat((_31_ + 40)))) + 1.5707963267948966)))));
                                                                                break label$0;
                                                                            }
                                                                            while (false);
                                                                            this._storeFloat((_31_ + 44), (__sindf(((double) (this._loadFloat((_31_ + 40)))))));
                                                                            break label$0;
                                                                        }
                                                                        while (false);
                                                                        if (((this._loadInt((_31_ + 28))) & 4294967295L) > (1088565717 & 4294967295L)) {
                                                                            break label$12;
                                                                        }
                                                                        if (((this._loadInt((_31_ + 28))) & 4294967295L) > (1085271519 & 4294967295L)) {
                                                                            break label$11;
                                                                        }
                                                                        if ((this._loadInt((_31_ + 20))) == 0) {
                                                                            break label$6;
                                                                        }
                                                                        this._storeFloat((_31_ + 44), (__cosdf((((double) (this._loadFloat((_31_ + 40)))) + 4.71238898038469))));
                                                                        break label$0;
                                                                    }
                                                                    while (false);
                                                                    _30_ = (this._loadFloat((_31_ + 40))) + 1.329228E36f;
                                                                }
                                                                while (false);
                                                                this._storeFloat((_31_ + 12), _30_);
                                                                this._storeFloat((_31_ + 44), (this._loadFloat((_31_ + 40))));
                                                                break label$0;
                                                            }
                                                            while (false);
                                                            if ((this._loadInt((_31_ + 20))) == 0) {
                                                                break label$8;
                                                            }
                                                            _33_ = -(((double) (this._loadFloat((_31_ + 40)))) + 3.141592653589793);
                                                            break label$7;
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
                                                        break label$5;
                                                    }
                                                    _33_ = ((double) (this._loadFloat((_31_ + 40)))) + 6.283185307179586;
                                                    break label$4;
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
                                                this._storeFloat((_31_ + 44), (__sindf((this._loadDouble((_31_ + 32))))));
                                                break label$0;
                                            }
                                            while (false);
                                            this._storeFloat((_31_ + 44), (__cosdf((((double) (this._loadFloat((_31_ + 40)))) + -1.5707963267948966))));
                                            break label$0;
                                        }
                                        while (false);
                                        _33_ = -(((double) (this._loadFloat((_31_ + 40)))) + -3.141592653589793);
                                    }
                                    while (false);
                                    this._storeFloat((_31_ + 44), (__sindf(_33_)));
                                    break label$0;
                                }
                                while (false);
                                this._storeFloat((_31_ + 44), (-(__cosdf((((double) (this._loadFloat((_31_ + 40)))) + -4.71238898038469)))));
                                break label$0;
                            }
                            while (false);
                            _33_ = ((double) (this._loadFloat((_31_ + 40)))) + -6.283185307179586;
                        }
                        while (false);
                        this._storeFloat((_31_ + 44), (__sindf(_33_)));
                        break label$0;
                    }
                    while (false);
                    this._storeFloat((_31_ + 44), (__sindf((-(this._loadDouble((_31_ + 32)))))));
                    break label$0;
                }
                while (false);
                this._storeFloat((_31_ + 44), (__cosdf((this._loadDouble((_31_ + 32))))));
                break label$0;
            }
            while (false);
            this._storeFloat((_31_ + 44), (-(__cosdf((this._loadDouble((_31_ + 32)))))));
        }
        while (false);
        _30_ = this._loadFloat((_31_ + 44));
        this._storeInt((0 + 4), (_31_ + 48));
        return _30_;
    }

    @Override()
    public final double sinh(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 40), (this._storeDouble((_31_ + 48), _30_)));
        this._storeLong((_31_ + 16), 4602678819172646912L);
        label$0:
        do {
            if (((this._loadLong((_31_ + 40))) >>> 63L) == 0) {
                break label$0;
            }
            this._storeDouble((_31_ + 16), (-(this._loadDouble((_31_ + 16)))));
        }
        while (false);
        this._storeLong((_31_ + 40), ((this._loadLong((_31_ + 40))) & 9223372036854775807L));
        this._storeDouble((_31_ + 8), (this._loadDouble((_31_ + 40))));
        label$1:
        do {
            label$2:
            do {
                label$3:
                do {
                    label$4:
                    do {
                        if (((this._storeInt((_31_ + 36), (this._loadInt((_31_ + 44))))) & 4294967295L) > (1082535489 & 4294967295L)) {
                            break label$4;
                        }
                        this._storeDouble((_31_ + 24), (expm1((this._loadDouble((_31_ + 8))))));
                        if (((this._loadInt((_31_ + 36))) & 4294967295L) > (1072693247 & 4294967295L)) {
                            break label$3;
                        }
                        if (((this._loadInt((_31_ + 36))) & 4294967295L) > (1045430271 & 4294967295L)) {
                            break label$2;
                        }
                        this._storeDouble((_31_ + 56), (this._loadDouble((_31_ + 48))));
                        break label$1;
                    }
                    while (false);
                    this._storeDouble((_31_ + 56), (this._storeDouble((_31_ + 24), (((_30_ = this._loadDouble((_31_ + 16))) + _30_) * (__expo2((this._loadDouble((_31_ + 8)))))))));
                    break label$1;
                }
                while (false);
                this._storeDouble((_31_ + 56), ((this._loadDouble((_31_ + 16))) * ((_30_ = this._loadDouble((_31_ + 24))) + (_30_ / (_30_ + 1.0)))));
                break label$1;
            }
            while (false);
            this._storeDouble((_31_ + 56), ((this._loadDouble((_31_ + 16))) * (((_30_ = this._loadDouble((_31_ + 24))) + _30_) - ((_30_ * _30_) / (_30_ + 1.0)))));
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 56));
        this._storeInt((0 + 4), (_31_ + 64));
        return _30_;
    }

    @Override()
    public final float sinhf(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 16), (this._storeFloat((_31_ + 24), _30_)));
        this._storeInt((_31_ + 4), 1056964608);
        label$0:
        do {
            if (((this._loadInt((_31_ + 16))) >>> 31) == 0) {
                break label$0;
            }
            this._storeFloat((_31_ + 4), (-(this._loadFloat((_31_ + 4)))));
        }
        while (false);
        this._storeInt((_31_ + 16), ((this._loadInt((_31_ + 16))) & 2147483647));
        this._storeFloat(_31_, (this._loadFloat((_31_ + 16))));
        label$1:
        do {
            label$2:
            do {
                label$3:
                do {
                    label$4:
                    do {
                        if (((this._storeInt((_31_ + 12), (this._loadInt((_31_ + 16))))) & 4294967295L) > (1118925334 & 4294967295L)) {
                            break label$4;
                        }
                        this._storeFloat((_31_ + 8), (expm1f((this._loadFloat(_31_)))));
                        if (((this._loadInt((_31_ + 12))) & 4294967295L) > (1065353215 & 4294967295L)) {
                            break label$3;
                        }
                        if (((this._loadInt((_31_ + 12))) & 4294967295L) > (964689919 & 4294967295L)) {
                            break label$2;
                        }
                        this._storeFloat((_31_ + 28), (this._loadFloat((_31_ + 24))));
                        break label$1;
                    }
                    while (false);
                    this._storeFloat((_31_ + 28), (this._storeFloat((_31_ + 8), (((_30_ = this._loadFloat((_31_ + 4))) + _30_) * (__expo2f((this._loadFloat(_31_))))))));
                    break label$1;
                }
                while (false);
                this._storeFloat((_31_ + 28), ((this._loadFloat((_31_ + 4))) * ((_30_ = this._loadFloat((_31_ + 8))) + (_30_ / (_30_ + 1.0f)))));
                break label$1;
            }
            while (false);
            this._storeFloat((_31_ + 28), ((this._loadFloat((_31_ + 4))) * (((_30_ = this._loadFloat((_31_ + 8))) + _30_) - ((_30_ * _30_) / (_30_ + 1.0f)))));
        }
        while (false);
        _30_ = this._loadFloat((_31_ + 28));
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final void sinhl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (sinh((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void sinl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (sin((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int sleep(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        _31_ = this._storeInt((_32_ + 4), 0);
        this._storeInt(_32_, _30_);
        label$0:
        do {
            label$1:
            do {
                if ((this.nanosleep.invoke(_32_, _32_)) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 12), (this._loadInt(_32_)));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), _31_);
        }
        while (false);
        _30_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _30_;
    }

    @Override()
    public final double sqrt(double _30_)
    {
        long _31_ = 0L;
        int _32_ = 0;
        int _33_ = 0;
        this._storeDouble(((_33_ = (this._loadInt((0 + 4))) - 96) + 80), _30_);
        this._storeInt((_33_ + 68), -2147483648);
        this._storeDouble((_33_ + 16), (this._loadDouble((_33_ + 80))));
        this._storeLong32((_33_ + 64), (this._loadLong32u((_33_ + 20))));
        this._storeLong32((_33_ + 28), (this._loadLong((_33_ + 16))));
        label$0:
        do {
            if (((this._loadInt((_33_ + 64))) & 2146435072) != 2146435072) {
                break label$0;
            }
            this._storeDouble((_33_ + 88), (((_30_ = this._loadDouble((_33_ + 80))) * _30_) + _30_));
            return (this._loadDouble((_33_ + 88)));
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
                        label$5:
                        do {
                            label$6:
                            do {
                                if ((this._loadInt((_33_ + 64))) > 0) {
                                    break label$6;
                                }
                                if ((((this._loadInt((_33_ + 64))) & ((this._loadInt((_33_ + 68))) ^ -1)) | (this._loadInt((_33_ + 28)))) == 0) {
                                    break label$5;
                                }
                                if ((this._loadInt((_33_ + 64))) <= -1) {
                                    break label$4;
                                }
                            }
                            while (false);
                            label$7:
                            do {
                                if ((this._storeInt((_33_ + 52), ((this._loadInt((_33_ + 64))) >> 20))) != 0) {
                                    break label$7;
                                }
                                label$9:
                                do {
                                    label$8:
                                    while (true) {
                                        if ((this._loadInt((_33_ + 64))) != 0) {
                                            break label$9;
                                        }
                                        this._storeInt((_33_ + 52), ((this._loadInt((_33_ + 52))) + -21));
                                        this._storeInt((_33_ + 64), ((this._loadInt((_33_ + 64))) | ((this._loadInt((_33_ + 28))) >>> 11)));
                                        this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) << 21));
                                        continue label$8;
                                    }
                                }
                                while (false);
                                this._storeInt((_33_ + 44), 0);
                                label$11:
                                do {
                                    label$10:
                                    while (true) {
                                        if (((this._loadInt8u((_33_ + 66))) & 16) != 0) {
                                            break label$11;
                                        }
                                        this._storeInt((_33_ + 64), ((this._loadInt((_33_ + 64))) << 1));
                                        this._storeInt((_33_ + 44), ((this._loadInt((_33_ + 44))) + 1));
                                        continue label$10;
                                    }
                                }
                                while (false);
                                this._storeInt((_33_ + 52), ((this._loadInt((_33_ + 52))) - ((this._loadInt((_33_ + 44))) + -1)));
                                this._storeInt((_33_ + 64), ((this._loadInt((_33_ + 64))) | ((this._loadInt((_33_ + 28))) >>> (32 - (this._loadInt((_33_ + 44)))))));
                                this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) << (this._loadInt((_33_ + 44)))));
                            }
                            while (false);
                            this._storeInt((_33_ + 52), ((this._loadInt((_33_ + 52))) + -1023));
                            this._storeInt((_33_ + 64), (((this._loadInt((_33_ + 64))) & 1048575) | 1048576));
                            label$12:
                            do {
                                if (((this._loadInt8u((_33_ + 52))) & 1) == 0) {
                                    break label$12;
                                }
                                this._storeInt((_33_ + 64), ((_32_ = this._loadInt((_33_ + 64))) + (_32_ + (((this._loadInt((_33_ + 28))) & (this._loadInt((_33_ + 68)))) >>> 31))));
                                this._storeInt((_33_ + 28), ((_32_ = this._loadInt((_33_ + 28))) + _32_));
                            }
                            while (false);
                            this._storeInt((_33_ + 52), ((this._loadInt((_33_ + 52))) >> 1));
                            this._storeInt((_33_ + 64), ((_32_ = this._loadInt((_33_ + 64))) + (_32_ + (((this._loadInt((_33_ + 28))) & (this._loadInt((_33_ + 68)))) >>> 31))));
                            this._storeInt((_33_ + 28), ((_32_ = this._loadInt((_33_ + 28))) + _32_));
                            this._storeInt((_33_ + 56), (this._storeInt((_33_ + 24), (this._storeInt((_33_ + 60), (this._storeInt((_33_ + 32), 0)))))));
                            this._storeInt((_33_ + 40), 2097152);
                            label$14:
                            do {
                                label$13:
                                while (true) {
                                    if ((this._loadInt((_33_ + 40))) == 0) {
                                        break label$14;
                                    }
                                    label$15:
                                    do {
                                        if ((this._storeInt((_33_ + 48), ((this._loadInt((_33_ + 60))) + (this._loadInt((_33_ + 40)))))) > (this._loadInt((_33_ + 64)))) {
                                            break label$15;
                                        }
                                        this._storeInt((_33_ + 60), ((this._loadInt((_33_ + 48))) + (this._loadInt((_33_ + 40)))));
                                        this._storeInt((_33_ + 64), ((this._loadInt((_33_ + 64))) - (this._loadInt((_33_ + 48)))));
                                        this._storeInt((_33_ + 56), ((this._loadInt((_33_ + 56))) + (this._loadInt((_33_ + 40)))));
                                    }
                                    while (false);
                                    this._storeInt((_33_ + 64), ((_32_ = this._loadInt((_33_ + 64))) + (_32_ + (((this._loadInt((_33_ + 28))) & (this._loadInt((_33_ + 68)))) >>> 31))));
                                    this._storeInt((_33_ + 28), ((_32_ = this._loadInt((_33_ + 28))) + _32_));
                                    this._storeInt((_33_ + 40), ((this._loadInt((_33_ + 40))) >>> 1));
                                    continue label$13;
                                }
                            }
                            while (false);
                            this._storeInt((_33_ + 40), (this._loadInt((_33_ + 68))));
                            label$17:
                            do {
                                label$16:
                                while (true) {
                                    if ((this._loadInt((_33_ + 40))) == 0) {
                                        break label$17;
                                    }
                                    this._storeInt((_33_ + 36), ((this._loadInt((_33_ + 32))) + (this._loadInt((_33_ + 40)))));
                                    label$18:
                                    do {
                                        label$19:
                                        do {
                                            if ((this._storeInt((_33_ + 48), (this._loadInt((_33_ + 60))))) < (this._loadInt((_33_ + 64)))) {
                                                break label$19;
                                            }
                                            if ((this._loadInt((_33_ + 48))) != (this._loadInt((_33_ + 64)))) {
                                                break label$18;
                                            }
                                            if (((this._loadInt((_33_ + 36))) & 4294967295L) > ((this._loadInt((_33_ + 28))) & 4294967295L)) {
                                                break label$18;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_33_ + 32), ((this._loadInt((_33_ + 36))) + (this._loadInt((_33_ + 40)))));
                                        label$20:
                                        do {
                                            if (((this._loadInt((_33_ + 36))) & (_32_ = this._loadInt((_33_ + 68)))) != _32_) {
                                                break label$20;
                                            }
                                            if (((this._loadInt((_33_ + 32))) & (this._loadInt((_33_ + 68)))) != 0) {
                                                break label$20;
                                            }
                                            this._storeInt((_33_ + 60), ((this._loadInt((_33_ + 60))) + 1));
                                        }
                                        while (false);
                                        this._storeInt((_33_ + 64), ((this._loadInt((_33_ + 64))) - (this._loadInt((_33_ + 48)))));
                                        label$21:
                                        do {
                                            if (((this._loadInt((_33_ + 28))) & 4294967295L) >= ((this._loadInt((_33_ + 36))) & 4294967295L)) {
                                                break label$21;
                                            }
                                            this._storeInt((_33_ + 64), ((this._loadInt((_33_ + 64))) + -1));
                                        }
                                        while (false);
                                        this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) - (this._loadInt((_33_ + 36)))));
                                        this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + (this._loadInt((_33_ + 40)))));
                                    }
                                    while (false);
                                    this._storeInt((_33_ + 64), ((_32_ = this._loadInt((_33_ + 64))) + (_32_ + (((this._loadInt((_33_ + 28))) & (this._loadInt((_33_ + 68)))) >>> 31))));
                                    this._storeInt((_33_ + 28), ((_32_ = this._loadInt((_33_ + 28))) + _32_));
                                    this._storeInt((_33_ + 40), ((this._loadInt((_33_ + 40))) >>> 1));
                                    continue label$16;
                                }
                            }
                            while (false);
                            if (((this._loadInt((_33_ + 64))) | (this._loadInt((_33_ + 28)))) == 0) {
                                break label$1;
                            }
                            _31_ = this._storeLong((_33_ + 72), 4607182418800017408L);
                            if (0 != 0) {
                                break label$1;
                            }
                            this._storeLong((_33_ + 72), _31_);
                            if ((this._loadInt((_33_ + 24))) == -1) {
                                break label$3;
                            }
                            if (((((_30_ = this._loadDouble((_33_ + 72))) <= 1.0) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                                break label$2;
                            }
                            label$22:
                            do {
                                if ((this._loadInt((_33_ + 24))) != -2) {
                                    break label$22;
                                }
                                this._storeInt((_33_ + 56), ((this._loadInt((_33_ + 56))) + 1));
                            }
                            while (false);
                            this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + 2));
                            break label$1;
                        }
                        while (false);
                        this._storeDouble((_33_ + 88), (this._loadDouble((_33_ + 80))));
                        return (this._loadDouble((_33_ + 88)));
                    }
                    while (false);
                    this._storeDouble((_33_ + 88), ((_30_ = (_30_ = this._loadDouble((_33_ + 80))) - _30_) / _30_));
                    return (this._loadDouble((_33_ + 88)));
                }
                while (false);
                this._storeInt((_33_ + 24), 0);
                this._storeInt((_33_ + 56), ((this._loadInt((_33_ + 56))) + 1));
                break label$1;
            }
            while (false);
            this._storeInt((_33_ + 24), ((_32_ = this._loadInt((_33_ + 24))) + (_32_ & 1)));
        }
        while (false);
        this._storeInt((_33_ + 64), (((this._loadInt((_33_ + 56))) >> 1) + 1071644672));
        this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 24))) >>> 1));
        label$23:
        do {
            if (((this._loadInt8u((_33_ + 56))) & 1) == 0) {
                break label$23;
            }
            this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) | (this._loadInt((_33_ + 68)))));
        }
        while (false);
        this._storeInt((_33_ + 64), ((this._loadInt((_33_ + 64))) + ((this._loadInt((_33_ + 52))) << 20)));
        this._storeLong((_33_ + 8), (((this._loadLong32u((_33_ + 64))) << 32L) | (this._loadLong32u((_33_ + 28)))));
        this._storeDouble((_33_ + 88), (this._storeDouble((_33_ + 72), (this._loadDouble((_33_ + 8))))));
        return (this._loadDouble((_33_ + 88)));
    }

    @Override()
    public final float sqrtf(float _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeFloat(((_32_ = (this._loadInt((0 + 4))) - 64) + 56), _30_);
        this._storeInt((_32_ + 48), -2147483648);
        this._storeFloat((_32_ + 16), (this._loadFloat((_32_ + 56))));
        label$0:
        do {
            if (((this._storeInt((_32_ + 44), (this._loadInt((_32_ + 16))))) & 2139095040) != 2139095040) {
                break label$0;
            }
            this._storeFloat((_32_ + 60), (((_30_ = this._loadFloat((_32_ + 56))) * _30_) + _30_));
            return (this._loadFloat((_32_ + 60)));
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
                        label$5:
                        do {
                            if ((this._loadInt((_32_ + 44))) > 0) {
                                break label$5;
                            }
                            if (((this._loadInt((_32_ + 44))) & ((this._loadInt((_32_ + 48))) ^ -1)) == 0) {
                                break label$4;
                            }
                            if ((this._loadInt((_32_ + 44))) <= -1) {
                                break label$3;
                            }
                        }
                        while (false);
                        label$6:
                        do {
                            if ((this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 44))) >> 23))) != 0) {
                                break label$6;
                            }
                            this._storeInt((_32_ + 24), 0);
                            label$8:
                            do {
                                label$7:
                                while (true) {
                                    if (((this._loadInt8u((_32_ + 46))) >>> 7) != 0) {
                                        break label$8;
                                    }
                                    this._storeInt((_32_ + 44), ((this._loadInt((_32_ + 44))) << 1));
                                    this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                                    continue label$7;
                                }
                            }
                            while (false);
                            this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) - ((this._loadInt((_32_ + 24))) + -1)));
                        }
                        while (false);
                        this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) + -127));
                        this._storeInt((_32_ + 44), (((this._loadInt((_32_ + 44))) & 8388607) | 8388608));
                        label$9:
                        do {
                            if (((this._loadInt8u((_32_ + 32))) & 1) == 0) {
                                break label$9;
                            }
                            this._storeInt((_32_ + 44), ((_31_ = this._loadInt((_32_ + 44))) + _31_));
                        }
                        while (false);
                        this._storeInt((_32_ + 32), ((this._loadInt((_32_ + 32))) >> 1));
                        this._storeInt((_32_ + 44), ((_31_ = this._loadInt((_32_ + 44))) + _31_));
                        this._storeInt((_32_ + 36), (this._storeInt((_32_ + 40), 0)));
                        this._storeInt((_32_ + 20), 16777216);
                        label$11:
                        do {
                            label$10:
                            while (true) {
                                if ((this._loadInt((_32_ + 20))) == 0) {
                                    break label$11;
                                }
                                label$12:
                                do {
                                    if ((this._storeInt((_32_ + 28), ((this._loadInt((_32_ + 40))) + (this._loadInt((_32_ + 20)))))) > (this._loadInt((_32_ + 44)))) {
                                        break label$12;
                                    }
                                    this._storeInt((_32_ + 40), ((this._loadInt((_32_ + 28))) + (this._loadInt((_32_ + 20)))));
                                    this._storeInt((_32_ + 44), ((this._loadInt((_32_ + 44))) - (this._loadInt((_32_ + 28)))));
                                    this._storeInt((_32_ + 36), ((this._loadInt((_32_ + 36))) + (this._loadInt((_32_ + 20)))));
                                }
                                while (false);
                                this._storeInt((_32_ + 44), ((_31_ = this._loadInt((_32_ + 44))) + _31_));
                                this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) >>> 1));
                                continue label$10;
                            }
                        }
                        while (false);
                        if ((this._loadInt((_32_ + 44))) == 0) {
                            break label$1;
                        }
                        _31_ = this._storeInt((_32_ + 52), 1065353216);
                        if (0 != 0) {
                            break label$1;
                        }
                        this._storeInt((_32_ + 52), _31_);
                        if (1 != 0) {
                            break label$2;
                        }
                        this._storeInt((_32_ + 36), ((this._loadInt((_32_ + 36))) + 2));
                        break label$1;
                    }
                    while (false);
                    this._storeFloat((_32_ + 60), (this._loadFloat((_32_ + 56))));
                    return (this._loadFloat((_32_ + 60)));
                }
                while (false);
                this._storeFloat((_32_ + 60), ((_30_ = (_30_ = this._loadFloat((_32_ + 56))) - _30_) / _30_));
                return (this._loadFloat((_32_ + 60)));
            }
            while (false);
            this._storeInt((_32_ + 36), ((_31_ = this._loadInt((_32_ + 36))) + (_31_ & 1)));
        }
        while (false);
        this._storeInt((_32_ + 8), (this._storeInt((_32_ + 44), ((this._storeInt((_32_ + 44), (((this._loadInt((_32_ + 36))) >> 1) + 1056964608))) + ((this._loadInt((_32_ + 32))) << 23)))));
        this._storeFloat((_32_ + 60), (this._storeFloat((_32_ + 52), (this._loadFloat((_32_ + 8))))));
        return (this._loadFloat((_32_ + 60)));
    }

    @Override()
    public final void sqrtl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (Math.sqrt((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void srand48(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt16((_31_ + 10), (this._loadInt16u((_31_ + 14))));
        this._storeInt16((_31_ + 6), 13070);
        this._storeInt16((_31_ + 8), (this._loadInt((_31_ + 12))));
        seed48((_31_ + 6));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }
}
