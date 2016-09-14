package com.wrmsr.wava;

abstract class sqlite3$7
        extends sqlite3$6
{
    protected sqlite3$7(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final int __stpcpy(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        label$0:
        do {
            if (((this._storeInt((_32_ + 20), _31_)) & 3) != ((this._loadInt((_32_ + 24))) & 3)) {
                break label$0;
            }
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if (((this._loadInt8u((_32_ + 20))) & 3) == 0) {
                            break label$1;
                        }
                        if ((this._storeInt8((this._loadInt((_32_ + 24))), (this._loadInt8u((this._loadInt((_32_ + 20))))))) == 0) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1));
                        this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt((_32_ + 28), (this._loadInt((_32_ + 24))));
                return (this._loadInt((_32_ + 28)));
            }
            while (false);
            this._storeInt((_32_ + 16), (this._loadInt((_32_ + 24))));
            this._storeInt((_32_ + 12), (this._loadInt((_32_ + 20))));
            label$5:
            do {
                label$4:
                while (true) {
                    if (((((_31_ = this._loadInt((this._loadInt((_32_ + 12))))) + -16843009) & (_31_ ^ -1)) & -2139062144) != 0) {
                        break label$5;
                    }
                    this._storeInt((_32_ + 12), ((_31_ = this._loadInt((_32_ + 12))) + 4));
                    this._storeInt((_30_ = this._loadInt((_32_ + 16))), (this._loadInt(_31_)));
                    this._storeInt((_32_ + 16), (_30_ + 4));
                    continue label$4;
                }
            }
            while (false);
            this._storeInt((_32_ + 24), (this._loadInt((_32_ + 16))));
            this._storeInt((_32_ + 20), (this._loadInt((_32_ + 12))));
        }
        while (false);
        label$7:
        do {
            label$6:
            while (true) {
                if ((this._storeInt8((this._loadInt((_32_ + 24))), (this._loadInt8u((this._loadInt((_32_ + 20))))))) == 0) {
                    break label$7;
                }
                this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1));
                this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                continue label$6;
            }
        }
        while (false);
        this._storeInt((_32_ + 28), (this._loadInt((_32_ + 24))));
        return (this._loadInt((_32_ + 28)));
    }

    @Override()
    public final int __stpncpy(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt((_33_ + 24))) & 3) != ((this._loadInt((_33_ + 28))) & 3)) {
                    break label$1;
                }
                label$3:
                do {
                    label$2:
                    while (true) {
                        _32_ = 0;
                        label$4:
                        do {
                            if (((this._loadInt8u((_33_ + 24))) & 3) == 0) {
                                break label$4;
                            }
                            _32_ = 0;
                            if ((this._loadInt((_33_ + 20))) == 0) {
                                break label$4;
                            }
                            _32_ = ((this._storeInt8((this._loadInt((_33_ + 28))), (this._loadInt8u((this._loadInt((_33_ + 24))))))) != 0) ? 1 : 0;
                        }
                        while (false);
                        if (_32_ == 0) {
                            break label$3;
                        }
                        this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -1));
                        this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + 1));
                        this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) + 1));
                        continue label$2;
                    }
                }
                while (false);
                if ((this._loadInt((_33_ + 20))) == 0) {
                    break label$0;
                }
                if ((this._loadInt8u((this._loadInt((_33_ + 24))))) == 0) {
                    break label$0;
                }
                this._storeInt((_33_ + 16), (this._loadInt((_33_ + 28))));
                this._storeInt((_33_ + 12), (this._loadInt((_33_ + 24))));
                label$6:
                do {
                    label$5:
                    while (true) {
                        _32_ = 0;
                        label$7:
                        do {
                            if (((this._loadInt((_33_ + 20))) & 4294967295L) < (4 & 4294967295L)) {
                                break label$7;
                            }
                            _32_ = (((((_32_ = this._loadInt((this._loadInt((_33_ + 12))))) + -16843009) & (_32_ ^ -1)) & -2139062144) == 0) ? 1 : 0;
                        }
                        while (false);
                        if (_32_ == 0) {
                            break label$6;
                        }
                        this._storeInt((this._loadInt((_33_ + 16))), (this._loadInt((this._loadInt((_33_ + 12))))));
                        this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -4));
                        this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 4));
                        this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + 4));
                        continue label$5;
                    }
                }
                while (false);
                this._storeInt((_33_ + 28), (this._loadInt((_33_ + 16))));
                this._storeInt((_33_ + 24), (this._loadInt((_33_ + 12))));
            }
            while (false);
            label$9:
            do {
                label$8:
                while (true) {
                    _32_ = 0;
                    label$10:
                    do {
                        if ((this._loadInt((_33_ + 20))) == 0) {
                            break label$10;
                        }
                        _32_ = ((this._storeInt8((this._loadInt((_33_ + 28))), (this._loadInt8u((this._loadInt((_33_ + 24))))))) != 0) ? 1 : 0;
                    }
                    while (false);
                    if (_32_ == 0) {
                        break label$9;
                    }
                    this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -1));
                    this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + 1));
                    this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) + 1));
                    continue label$8;
                }
            }
            while (false);
        }
        while (false);
        memset((this._loadInt((_33_ + 28))), 0, (this._loadInt((_33_ + 20))));
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int strcasecmp(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), (this._loadInt((_32_ + 12))));
        this._storeInt(_32_, (this._loadInt((_32_ + 8))));
        label$1:
        do {
            label$0:
            while (true) {
                _31_ = 0;
                label$2:
                do {
                    if ((this._loadInt8u((this._loadInt((_32_ + 4))))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt8u((this._loadInt(_32_)))) == 0) {
                        break label$2;
                    }
                    _31_ = 1;
                    if ((this._loadInt8u((this._loadInt((_32_ + 4))))) == (this._loadInt8u((this._loadInt(_32_))))) {
                        break label$2;
                    }
                    _31_ = ((tolower((this._loadInt8u((this._loadInt((_32_ + 4))))))) == (tolower((this._loadInt8u((this._loadInt(_32_))))))) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                this._storeInt(_32_, ((this._loadInt(_32_)) + 1));
                continue label$0;
            }
        }
        while (false);
        _31_ = tolower((this._loadInt8u((this._loadInt((_32_ + 4))))));
        _30_ = tolower((this._loadInt8u((this._loadInt(_32_)))));
        this._storeInt((0 + 4), (_32_ + 16));
        return (_31_ - _30_);
    }

    @Override()
    public final int __strcasecmp_l(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = strcasecmp((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int strcasestr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt(_32_, (strlen((this._storeInt((_32_ + 4), _31_)))));
        label$0:
        do {
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt8u((this._loadInt((_32_ + 8))))) == 0) {
                            break label$1;
                        }
                        if ((strncasecmp((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))), (this._loadInt(_32_)))) == 0) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) + 1));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt((_32_ + 12), (this._loadInt((_32_ + 8))));
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
    public final int strcat(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        strcpy(((_31_ = this._loadInt((_32_ + 12))) + (strlen(_31_))), (this._loadInt((_32_ + 8))));
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int strchr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        _30_ = this._storeInt((_32_ + 8), _31_);
        _31_ = 0;
        label$0:
        do {
            if ((this._loadInt8u((this._storeInt((_32_ + 4), (__strchrnul((this._loadInt((_32_ + 12))), _30_)))))) != (this._loadInt8u((_32_ + 8)))) {
                break label$0;
            }
            _31_ = this._loadInt((_32_ + 4));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int __strchrnul(int _30_, int _31_)
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
                    if ((this._storeInt((_32_ + 20), (this._loadInt8u((_32_ + 20))))) == 0) {
                        break label$2;
                    }
                    label$4:
                    do {
                        label$3:
                        while (true) {
                            if (((this._loadInt8u((_32_ + 24))) & 3) == 0) {
                                break label$1;
                            }
                            if ((this._loadInt8u((this._loadInt((_32_ + 24))))) == 0) {
                                break label$4;
                            }
                            if ((this._loadInt8u((this._loadInt((_32_ + 24))))) == (this._loadInt((_32_ + 20)))) {
                                break label$4;
                            }
                            this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                            continue label$3;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 28), (this._loadInt((_32_ + 24))));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 28), ((_31_ = this._loadInt((_32_ + 24))) + (strlen(_31_))));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 20))) * 16843009));
            this._storeInt((_32_ + 16), (this._loadInt((_32_ + 24))));
            label$6:
            do {
                label$5:
                while (true) {
                    _31_ = 0;
                    label$7:
                    do {
                        if (((((_30_ = this._loadInt((this._loadInt((_32_ + 16))))) + -16843009) & (_30_ ^ -1)) & -2139062144) != 0) {
                            break label$7;
                        }
                        _31_ = (((((_31_ = (this._loadInt((this._loadInt((_32_ + 16))))) ^ (this._loadInt((_32_ + 12)))) + -16843009) & (_31_ ^ -1)) & -2139062144) == 0) ? 1 : 0;
                    }
                    while (false);
                    if (_31_ == 0) {
                        break label$6;
                    }
                    this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 4));
                    continue label$5;
                }
            }
            while (false);
            this._storeInt((_32_ + 24), (this._loadInt((_32_ + 16))));
            label$9:
            do {
                label$8:
                while (true) {
                    _31_ = 0;
                    label$10:
                    do {
                        if ((this._loadInt8s((this._loadInt((_32_ + 24))))) == 0) {
                            break label$10;
                        }
                        _31_ = ((this._loadInt8u((this._loadInt((_32_ + 24))))) != (this._loadInt((_32_ + 20)))) ? 1 : 0;
                    }
                    while (false);
                    if (_31_ == 0) {
                        break label$9;
                    }
                    this._storeInt((_32_ + 24), ((this._loadInt((_32_ + 24))) + 1));
                    continue label$8;
                }
            }
            while (false);
            this._storeInt((_32_ + 28), (this._loadInt((_32_ + 24))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int strcmp(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$1:
        do {
            label$0:
            while (true) {
                _31_ = 0;
                label$2:
                do {
                    if ((this._loadInt8s((this._loadInt((_32_ + 12))))) != (this._loadInt8s((this._loadInt((_32_ + 8)))))) {
                        break label$2;
                    }
                    _31_ = ((this._loadInt8s((this._loadInt((_32_ + 12))))) != 0) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 1));
                this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) + 1));
                continue label$0;
            }
        }
        while (false);
        return ((this._loadInt8u((this._loadInt((_32_ + 12))))) - (this._loadInt8u((this._loadInt((_32_ + 8))))));
    }

    @Override()
    public final int strcpy(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        __stpcpy((this._loadInt((_32_ + 12))), _31_);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int strcspn(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_32_ + 36), _31_);
        this._storeInt((_32_ + 32), (this._loadInt((_32_ + 40))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u((this._loadInt((_32_ + 36))))) == 0) {
                    break label$1;
                }
                if ((this._loadInt8u(((this._loadInt((_32_ + 36))) + 1))) == 0) {
                    break label$1;
                }
                memset(_32_, 0, 32);
                label$3:
                do {
                    label$2:
                    while (true) {
                        _31_ = 0;
                        label$4:
                        do {
                            if ((this._loadInt8s((this._loadInt((_32_ + 36))))) == 0) {
                                break label$4;
                            }
                            _31_ = ((this._storeInt((_30_ = _32_ + (((_31_ = this._loadInt8u((this._loadInt((_32_ + 36))))) >>> 3) & 28)), ((this._loadInt(_30_)) | (1 << (_31_ & 31))))) != 0) ? 1 : 0;
                        }
                        while (false);
                        if (_31_ == 0) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 36), ((this._loadInt((_32_ + 36))) + 1));
                        continue label$2;
                    }
                }
                while (false);
                label$6:
                do {
                    label$5:
                    while (true) {
                        _31_ = 0;
                        label$7:
                        do {
                            if ((this._loadInt8s((this._loadInt((_32_ + 40))))) == 0) {
                                break label$7;
                            }
                            _31_ = (((this._loadInt((_32_ + (((_31_ = this._loadInt8u((this._loadInt((_32_ + 40))))) >>> 3) & 28)))) & (1 << (_31_ & 31))) == 0) ? 1 : 0;
                        }
                        while (false);
                        if (_31_ == 0) {
                            break label$6;
                        }
                        this._storeInt((_32_ + 40), ((this._loadInt((_32_ + 40))) + 1));
                        continue label$5;
                    }
                }
                while (false);
                this._storeInt((_32_ + 44), ((this._loadInt((_32_ + 40))) - (this._loadInt((_32_ + 32)))));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 44), ((__strchrnul((this._loadInt((_32_ + 40))), (this._loadInt8s((this._loadInt((_32_ + 36))))))) - (this._loadInt((_32_ + 32)))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 44));
        this._storeInt((0 + 4), (_32_ + 48));
        return _31_;
    }

    @Override()
    public final int __strdup(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))), (malloc(((this._storeInt((_31_ + 4), (strlen((this._storeInt((_31_ + 8), _30_)))))) + 1))))) == 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 12), (memcpy((this._loadInt(_31_)), (this._loadInt((_31_ + 8))), ((this._loadInt((_31_ + 4))) + 1))));
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
    public final int __strerror_l(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt(_32_, 0);
        label$1:
        do {
            label$0:
            while (true) {
                _31_ = 0;
                label$2:
                do {
                    if ((this._loadInt8u(((this._loadInt(_32_)) + 17312))) == 0) {
                        break label$2;
                    }
                    _31_ = ((this._loadInt8u(((this._loadInt(_32_)) + 17312))) != (this._loadInt((_32_ + 12)))) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$1;
                }
                this._storeInt(_32_, ((this._loadInt(_32_)) + 1));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((_32_ + 4), 17408);
        label$3:
        while (true) {
            label$5:
            do {
                label$6:
                do {
                    if ((this._loadInt(_32_)) == 0) {
                        break label$6;
                    }
                    label$7:
                    while (true) {
                        if ((this._loadInt8u((this._loadInt((_32_ + 4))))) == 0) {
                            break label$5;
                        }
                        this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                        continue label$7;
                    }
                }
                while (false);
                _31_ = this._loadInt(((this._loadInt((_32_ + 8))) + 20));
                _31_ = this.__lctrans.invoke((this._loadInt((_32_ + 4))), _31_);
                this._storeInt((0 + 4), (_32_ + 16));
                return _31_;
            }
            while (false);
            this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
            this._storeInt(_32_, ((this._loadInt(_32_)) + -1));
            continue label$3;
        }
    }

    @Override()
    public final int strerror(int _30_)
    {
        int _31_ = 0;
        _30_ = __strerror_l((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)), (this._loadInt(((__pthread_self$2e$284()) + 156))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int __pthread_self$2e$284()
    {
        return (this.pthread_self.invoke());
    }

    @Override()
    public final int strerror_r(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt((_33_ + 8), (strlen((this._storeInt((_33_ + 12), (strerror((this._loadInt((_33_ + 24))))))))))) & 4294967295L) < ((this._loadInt((_33_ + 16))) & 4294967295L)) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt((_33_ + 16))) == 0) {
                        break label$2;
                    }
                    memcpy((this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 12))), ((this._loadInt((_33_ + 16))) + -1));
                    this._storeInt8((((this._loadInt((_33_ + 20))) + (this._loadInt((_33_ + 16)))) + -1), 0);
                }
                while (false);
                this._storeInt((_33_ + 28), 34);
                break label$0;
            }
            while (false);
            memcpy((this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 12))), ((this._loadInt((_33_ + 8))) + 1));
            this._storeInt((_33_ + 28), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int strlcat(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_33_ + 12), (strnlen((this._loadInt((_33_ + 24))), _32_)))) != (this._loadInt((_33_ + 16)))) {
                    break label$1;
                }
                this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 12))) + (strlen((this._loadInt((_33_ + 20)))))));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 28), ((_32_ = this._loadInt((_33_ + 12))) + (strlcpy((_32_ + (this._loadInt((_33_ + 24)))), (this._loadInt((_33_ + 20))), ((this._loadInt((_33_ + 16))) - _32_)))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int strlcpy(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 16), (this._loadInt((_33_ + 28))));
        this._storeInt((_33_ + 20), ((_32_ = this._loadInt((_33_ + 20))) + -1));
        label$0:
        do {
            if (_32_ == 0) {
                break label$0;
            }
            label$1:
            do {
                if (((this._loadInt((_33_ + 24))) & 3) != ((this._loadInt((_33_ + 28))) & 3)) {
                    break label$1;
                }
                label$3:
                do {
                    label$2:
                    while (true) {
                        _32_ = 0;
                        label$4:
                        do {
                            if (((this._loadInt8u((_33_ + 24))) & 3) == 0) {
                                break label$4;
                            }
                            _32_ = 0;
                            if ((this._loadInt((_33_ + 20))) == 0) {
                                break label$4;
                            }
                            _32_ = ((this._storeInt8((this._loadInt((_33_ + 28))), (this._loadInt8u((this._loadInt((_33_ + 24))))))) != 0) ? 1 : 0;
                        }
                        while (false);
                        if (_32_ == 0) {
                            break label$3;
                        }
                        this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -1));
                        this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + 1));
                        this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) + 1));
                        continue label$2;
                    }
                }
                while (false);
                if ((this._loadInt((_33_ + 20))) == 0) {
                    break label$1;
                }
                if ((this._loadInt8s((this._loadInt((_33_ + 24))))) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 12), (this._loadInt((_33_ + 28))));
                this._storeInt((_33_ + 8), (this._loadInt((_33_ + 24))));
                label$6:
                do {
                    label$5:
                    while (true) {
                        _32_ = 0;
                        label$7:
                        do {
                            if (((this._loadInt((_33_ + 20))) & 4294967295L) < (4 & 4294967295L)) {
                                break label$7;
                            }
                            _32_ = (((((_32_ = this._loadInt((this._loadInt((_33_ + 8))))) + -16843009) & (_32_ ^ -1)) & -2139062144) == 0) ? 1 : 0;
                        }
                        while (false);
                        if (_32_ == 0) {
                            break label$6;
                        }
                        this._storeInt((this._loadInt((_33_ + 12))), (this._loadInt((this._loadInt((_33_ + 8))))));
                        this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -4));
                        this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) + 4));
                        this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 4));
                        continue label$5;
                    }
                }
                while (false);
                this._storeInt((_33_ + 28), (this._loadInt((_33_ + 12))));
                this._storeInt((_33_ + 24), (this._loadInt((_33_ + 8))));
            }
            while (false);
            label$9:
            do {
                label$8:
                while (true) {
                    _32_ = 0;
                    label$10:
                    do {
                        if ((this._loadInt((_33_ + 20))) == 0) {
                            break label$10;
                        }
                        _32_ = ((this._storeInt8((this._loadInt((_33_ + 28))), (this._loadInt8u((this._loadInt((_33_ + 24))))))) != 0) ? 1 : 0;
                    }
                    while (false);
                    if (_32_ == 0) {
                        break label$9;
                    }
                    this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -1));
                    this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + 1));
                    this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 28))) + 1));
                    continue label$8;
                }
            }
            while (false);
            this._storeInt8((this._loadInt((_33_ + 28))), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 16));
        _31_ = this._loadInt((_33_ + 28));
        _30_ = strlen((this._loadInt((_33_ + 24))));
        this._storeInt((0 + 4), (_33_ + 32));
        return (_30_ + (_31_ - _32_));
    }

    @Override()
    public final int strlen(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 4), (this._storeInt((_31_ + 8), _30_)));
        label$0:
        do {
            label$2:
            do {
                label$1:
                while (true) {
                    if (((this._loadInt8u((_31_ + 8))) & 3) == 0) {
                        break label$0;
                    }
                    if ((this._loadInt8u((this._loadInt((_31_ + 8))))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) + 1));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 8))) - (this._loadInt((_31_ + 4)))));
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        this._storeInt(_31_, (this._loadInt((_31_ + 8))));
        label$4:
        do {
            label$3:
            while (true) {
                if (((((_30_ = this._loadInt((this._loadInt(_31_)))) + -16843009) & (_30_ ^ -1)) & -2139062144) != 0) {
                    break label$4;
                }
                this._storeInt(_31_, ((this._loadInt(_31_)) + 4));
                continue label$3;
            }
        }
        while (false);
        this._storeInt((_31_ + 8), (this._loadInt(_31_)));
        label$6:
        do {
            label$5:
            while (true) {
                if ((this._loadInt8u((this._loadInt((_31_ + 8))))) == 0) {
                    break label$6;
                }
                this._storeInt((_31_ + 8), ((this._loadInt((_31_ + 8))) + 1));
                continue label$5;
            }
        }
        while (false);
        this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 8))) - (this._loadInt((_31_ + 4)))));
        return (this._loadInt((_31_ + 12)));
    }

    @Override()
    public final int strncasecmp(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        this._storeInt((_33_ + 12), (this._loadInt((_33_ + 24))));
        this._storeInt((_33_ + 8), (this._loadInt((_33_ + 20))));
        this._storeInt((_33_ + 16), ((_32_ = this._loadInt((_33_ + 16))) + -1));
        label$0:
        do {
            label$1:
            do {
                if (_32_ == 0) {
                    break label$1;
                }
                label$3:
                do {
                    label$2:
                    while (true) {
                        _32_ = 0;
                        label$4:
                        do {
                            if ((this._loadInt8u((this._loadInt((_33_ + 12))))) == 0) {
                                break label$4;
                            }
                            if ((this._loadInt8u((this._loadInt((_33_ + 8))))) == 0) {
                                break label$4;
                            }
                            if ((this._loadInt((_33_ + 16))) == 0) {
                                break label$4;
                            }
                            _32_ = 1;
                            if ((this._loadInt8u((this._loadInt((_33_ + 12))))) == (this._loadInt8u((this._loadInt((_33_ + 8)))))) {
                                break label$4;
                            }
                            _32_ = ((tolower((this._loadInt8u((this._loadInt((_33_ + 12))))))) == (tolower((this._loadInt8u((this._loadInt((_33_ + 8)))))))) ? 1 : 0;
                        }
                        while (false);
                        if (_32_ == 0) {
                            break label$3;
                        }
                        this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 1));
                        this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) + 1));
                        this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + -1));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt((_33_ + 28), ((tolower((this._loadInt8u((this._loadInt((_33_ + 12))))))) - (tolower((this._loadInt8u((this._loadInt((_33_ + 8)))))))));
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
    public final int __strncasecmp_l(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        _33_ = strncasecmp((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 8))), (this._loadInt((_34_ + 4))));
        this._storeInt((0 + 4), (_34_ + 16));
        return _33_;
    }

    @Override()
    public final int strncat(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        this._storeInt(_33_, (this._loadInt((_33_ + 12))));
        this._storeInt((_33_ + 12), ((strlen((this._loadInt((_33_ + 12))))) + (this._loadInt((_33_ + 12)))));
        label$1:
        do {
            label$0:
            while (true) {
                _32_ = 0;
                label$2:
                do {
                    if ((this._loadInt((_33_ + 4))) == 0) {
                        break label$2;
                    }
                    _32_ = ((this._loadInt8s((this._loadInt((_33_ + 8))))) != 0) ? 1 : 0;
                }
                while (false);
                if (_32_ == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 4), ((this._loadInt((_33_ + 4))) + -1));
                this._storeInt((_33_ + 8), ((_32_ = this._loadInt((_33_ + 8))) + 1));
                this._storeInt((_33_ + 12), ((_31_ = this._loadInt((_33_ + 12))) + 1));
                this._storeInt8(_31_, (this._loadInt8u(_32_)));
                continue label$0;
            }
        }
        while (false);
        this._storeInt8((_32_ = this._loadInt((_33_ + 12))), 0);
        this._storeInt((_33_ + 12), (_32_ + 1));
        _32_ = this._loadInt(_33_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int strncmp(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        this._storeInt((_33_ + 12), (this._loadInt((_33_ + 24))));
        this._storeInt((_33_ + 8), (this._loadInt((_33_ + 20))));
        this._storeInt((_33_ + 16), ((_32_ = this._loadInt((_33_ + 16))) + -1));
        label$0:
        do {
            if (_32_ == 0) {
                break label$0;
            }
            label$2:
            do {
                label$1:
                while (true) {
                    _32_ = 0;
                    label$3:
                    do {
                        if ((this._loadInt8u((this._loadInt((_33_ + 12))))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt8u((this._loadInt((_33_ + 8))))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt((_33_ + 16))) == 0) {
                            break label$3;
                        }
                        _32_ = ((this._loadInt8u((this._loadInt((_33_ + 12))))) == (this._loadInt8u((this._loadInt((_33_ + 8)))))) ? 1 : 0;
                    }
                    while (false);
                    if (_32_ == 0) {
                        break label$2;
                    }
                    this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 1));
                    this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) + 1));
                    this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + -1));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt((_33_ + 28), ((this._loadInt8u((this._loadInt((_33_ + 12))))) - (this._loadInt8u((this._loadInt((_33_ + 8)))))));
            return (this._loadInt((_33_ + 28)));
        }
        while (false);
        this._storeInt((_33_ + 28), 0);
        return (this._loadInt((_33_ + 28)));
    }

    @Override()
    public final int strncpy(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        __stpncpy((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_);
        _32_ = this._loadInt((_33_ + 12));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int strndup(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 12), (malloc(((this._storeInt((_32_ + 16), (strnlen((this._loadInt((_32_ + 24))), _31_)))) + 1))))) == 0) {
                    break label$1;
                }
                memcpy((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 16))));
                this._storeInt8(((_31_ = this._loadInt((_32_ + 12))) + (this._loadInt((_32_ + 16)))), 0);
                this._storeInt((_32_ + 28), _31_);
                break label$0;
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
    public final int strnlen(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 4), (memchr((this._loadInt((_32_ + 12))), 0, _31_)))) == 0) {
                    break label$1;
                }
                _31_ = (this._loadInt((_32_ + 4))) - (this._loadInt((_32_ + 12)));
                break label$0;
            }
            while (false);
            _31_ = this._loadInt((_32_ + 8));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int strpbrk(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        _30_ = this._storeInt((_32_ + 8), _31_);
        _31_ = 0;
        label$0:
        do {
            if ((this._loadInt8s((this._storeInt((_32_ + 12), ((strcspn((this._loadInt((_32_ + 12))), _30_)) + (this._loadInt((_32_ + 12)))))))) == 0) {
                break label$0;
            }
            _31_ = this._loadInt((_32_ + 12));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int strrchr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = __memrchr((_30_ = this._loadInt((_32_ + 12))), _31_, ((strlen(_30_)) + 1));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int strsep(int _30_, int _31_)
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
                    label$3:
                    do {
                        if ((this._storeInt((_32_ + 16), (this._loadInt((this._loadInt((_32_ + 24))))))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt8u((this._storeInt((_32_ + 12), ((_31_ = this._loadInt((_32_ + 16))) + (strcspn(_31_, (this._loadInt((_32_ + 20)))))))))) == 0) {
                            break label$2;
                        }
                        this._storeInt8((_31_ = this._loadInt((_32_ + 12))), 0);
                        this._storeInt((_32_ + 12), (_31_ + 1));
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_32_ + 28), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 12), 0);
            }
            while (false);
            this._storeInt((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 12))));
            this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int strspn(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeLong(((_32_ = (this._loadInt((0 + 4))) - 48) + 16), (this._storeLong((_32_ + 24), 0L)));
        this._storeInt((_32_ + 40), _30_);
        this._storeInt((_32_ + 36), _31_);
        this._storeInt((_32_ + 32), (this._loadInt((_32_ + 40))));
        _31_ = this._storeInt((_32_ + 4), (this._storeInt((_32_ + 8), (this._storeInt((_32_ + 12), (this._storeInt(_32_, 0)))))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u((this._loadInt((_32_ + 36))))) == 0) {
                    break label$1;
                }
                if ((this._loadInt8u(((this._loadInt((_32_ + 36))) + 1))) == 0) {
                    break label$0;
                }
                label$3:
                do {
                    label$2:
                    while (true) {
                        _31_ = 0;
                        label$4:
                        do {
                            if ((this._loadInt8s((this._loadInt((_32_ + 36))))) == 0) {
                                break label$4;
                            }
                            _31_ = ((this._storeInt((_30_ = _32_ + (((_31_ = this._loadInt8u((this._loadInt((_32_ + 36))))) >>> 3) & 28)), ((this._loadInt(_30_)) | (1 << (_31_ & 31))))) != 0) ? 1 : 0;
                        }
                        while (false);
                        if (_31_ == 0) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 36), ((this._loadInt((_32_ + 36))) + 1));
                        continue label$2;
                    }
                }
                while (false);
                label$6:
                do {
                    label$5:
                    while (true) {
                        _31_ = 0;
                        label$7:
                        do {
                            if ((this._loadInt8s((this._loadInt((_32_ + 40))))) == 0) {
                                break label$7;
                            }
                            _31_ = (((this._loadInt((_32_ + (((_31_ = this._loadInt8u((this._loadInt((_32_ + 40))))) >>> 3) & 28)))) & (1 << (_31_ & 31))) != 0) ? 1 : 0;
                        }
                        while (false);
                        if (_31_ == 0) {
                            break label$6;
                        }
                        this._storeInt((_32_ + 40), ((this._loadInt((_32_ + 40))) + 1));
                        continue label$5;
                    }
                }
                while (false);
                this._storeInt((_32_ + 44), ((this._loadInt((_32_ + 40))) - (this._loadInt((_32_ + 32)))));
                return (this._loadInt((_32_ + 44)));
            }
            while (false);
            this._storeInt((_32_ + 44), _31_);
            return (this._loadInt((_32_ + 44)));
        }
        while (false);
        label$9:
        do {
            label$8:
            while (true) {
                if ((this._loadInt8s((this._loadInt((_32_ + 40))))) != (this._loadInt8s((this._loadInt((_32_ + 36)))))) {
                    break label$9;
                }
                this._storeInt((_32_ + 40), ((this._loadInt((_32_ + 40))) + 1));
                continue label$8;
            }
        }
        while (false);
        this._storeInt((_32_ + 44), ((this._loadInt((_32_ + 40))) - (this._loadInt((_32_ + 32)))));
        return (this._loadInt((_32_ + 44)));
    }

    @Override()
    public final int strstr(int _30_, int _31_)
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
                        label$4:
                        do {
                            label$5:
                            do {
                                label$6:
                                do {
                                    label$7:
                                    do {
                                        if ((this._loadInt8u((this._storeInt((_32_ + 4), _31_)))) == 0) {
                                            break label$7;
                                        }
                                        label$8:
                                        do {
                                            if ((this._storeInt((_32_ + 8), (strchr((this._loadInt((_32_ + 8))), (this._loadInt8s((this._loadInt((_32_ + 4))))))))) == 0) {
                                                break label$8;
                                            }
                                            if ((this._loadInt8u(((this._loadInt((_32_ + 4))) + 1))) == 0) {
                                                break label$8;
                                            }
                                            if ((this._loadInt8u(((this._loadInt((_32_ + 8))) + 1))) == 0) {
                                                break label$6;
                                            }
                                            if ((this._loadInt8u(((this._loadInt((_32_ + 4))) + 2))) == 0) {
                                                break label$5;
                                            }
                                            if ((this._loadInt8u(((this._loadInt((_32_ + 8))) + 2))) == 0) {
                                                break label$4;
                                            }
                                            if ((this._loadInt8u(((this._loadInt((_32_ + 4))) + 3))) == 0) {
                                                break label$3;
                                            }
                                            if ((this._loadInt8u(((this._loadInt((_32_ + 8))) + 3))) == 0) {
                                                break label$2;
                                            }
                                            if ((this._loadInt8u(((this._loadInt((_32_ + 4))) + 4))) == 0) {
                                                break label$1;
                                            }
                                            this._storeInt((_32_ + 12), (twoway_strstr((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))))));
                                            break label$0;
                                        }
                                        while (false);
                                        this._storeInt((_32_ + 12), (this._loadInt((_32_ + 8))));
                                        break label$0;
                                    }
                                    while (false);
                                    this._storeInt((_32_ + 12), (this._loadInt((_32_ + 8))));
                                    break label$0;
                                }
                                while (false);
                                this._storeInt((_32_ + 12), 0);
                                break label$0;
                            }
                            while (false);
                            this._storeInt((_32_ + 12), (twobyte_strstr((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))))));
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_32_ + 12), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_32_ + 12), (threebyte_strstr((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))))));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), (fourbyte_strstr((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int twobyte_strstr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt16((_32_ + 6), (((this._loadInt8u((_31_ = this._storeInt((_32_ + 8), _31_)))) << 8) | (this._loadInt8u((_31_ + 1)))));
        this._storeInt16((_32_ + 4), (((this._loadInt8u((_31_ = this._loadInt((_32_ + 12))))) << 8) | (this._loadInt8u((_31_ + 1)))));
        this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 1));
        label$1:
        do {
            label$0:
            while (true) {
                _31_ = 0;
                label$2:
                do {
                    if ((this._loadInt8u((this._loadInt((_32_ + 12))))) == 0) {
                        break label$2;
                    }
                    _31_ = ((this._loadInt16u((_32_ + 4))) != (this._loadInt16u((_32_ + 6)))) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$1;
                }
                _31_ = this._loadInt16u((_32_ + 4));
                this._storeInt((_32_ + 12), ((_30_ = this._loadInt((_32_ + 12))) + 1));
                this._storeInt16((_32_ + 4), ((_31_ << 8) | (this._loadInt8u((_30_ + 1)))));
                continue label$0;
            }
        }
        while (false);
        _31_ = 0;
        label$3:
        do {
            if ((this._loadInt8u((this._loadInt((_32_ + 12))))) == 0) {
                break label$3;
            }
            _31_ = (this._loadInt((_32_ + 12))) + -1;
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int threebyte_strstr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 4), ((((this._loadInt8u((_31_ = this._storeInt((_32_ + 8), _31_)))) << 24) | ((this._loadInt8u((_31_ + 1))) << 16)) | ((this._loadInt8u((_31_ + 2))) << 8)));
        this._storeInt(_32_, ((((this._loadInt8u((_31_ = this._loadInt((_32_ + 12))))) << 24) | ((this._loadInt8u((_31_ + 1))) << 16)) | ((this._loadInt8u((_31_ + 2))) << 8)));
        this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 2));
        label$1:
        do {
            label$0:
            while (true) {
                _31_ = 0;
                label$2:
                do {
                    if ((this._loadInt8u((this._loadInt((_32_ + 12))))) == 0) {
                        break label$2;
                    }
                    _31_ = ((this._loadInt(_32_)) != (this._loadInt((_32_ + 4)))) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$1;
                }
                _31_ = this._loadInt(_32_);
                this._storeInt((_32_ + 12), ((_30_ = this._loadInt((_32_ + 12))) + 1));
                this._storeInt(_32_, ((_31_ | (this._loadInt8u((_30_ + 1)))) << 8));
                continue label$0;
            }
        }
        while (false);
        _31_ = 0;
        label$3:
        do {
            if ((this._loadInt8u((this._loadInt((_32_ + 12))))) == 0) {
                break label$3;
            }
            _31_ = (this._loadInt((_32_ + 12))) + -2;
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int fourbyte_strstr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 4), (((((this._loadInt8u((_31_ = this._storeInt((_32_ + 8), _31_)))) << 24) | ((this._loadInt8u((_31_ + 1))) << 16)) | ((this._loadInt8u((_31_ + 2))) << 8)) | (this._loadInt8u((_31_ + 3)))));
        this._storeInt(_32_, (((((this._loadInt8u((_31_ = this._loadInt((_32_ + 12))))) << 24) | ((this._loadInt8u((_31_ + 1))) << 16)) | ((this._loadInt8u((_31_ + 2))) << 8)) | (this._loadInt8u((_31_ + 3)))));
        this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 3));
        label$1:
        do {
            label$0:
            while (true) {
                _31_ = 0;
                label$2:
                do {
                    if ((this._loadInt8u((this._loadInt((_32_ + 12))))) == 0) {
                        break label$2;
                    }
                    _31_ = ((this._loadInt(_32_)) != (this._loadInt((_32_ + 4)))) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$1;
                }
                _31_ = this._loadInt(_32_);
                this._storeInt((_32_ + 12), ((_30_ = this._loadInt((_32_ + 12))) + 1));
                this._storeInt(_32_, ((_31_ << 8) | (this._loadInt8u((_30_ + 1)))));
                continue label$0;
            }
        }
        while (false);
        _31_ = 0;
        label$3:
        do {
            if ((this._loadInt8u((this._loadInt((_32_ + 12))))) == 0) {
                break label$3;
            }
            _31_ = (this._loadInt((_32_ + 12))) + -3;
        }
        while (false);
        return _31_;
    }

    @Override()
    public final int twoway_strstr(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        int _34_ = 0;
        this._storeLong(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 1136))) + 1056), (this._storeLong((_33_ + 1064), 0L)));
        this._storeInt((_33_ + 1128), _30_);
        this._storeInt((_33_ + 1124), _31_);
        _32_ = this._storeInt((_33_ + 1116), (this._storeInt((_33_ + 1044), (this._storeInt((_33_ + 1048), (this._storeInt((_33_ + 1052), (this._storeInt((_33_ + 1040), 0)))))))));
        label$1:
        do {
            label$0:
            while (true) {
                _31_ = 0;
                label$2:
                do {
                    if ((this._loadInt8u(((this._loadInt((_33_ + 1124))) + (this._loadInt((_33_ + 1116)))))) == 0) {
                        break label$2;
                    }
                    _31_ = ((this._loadInt8u(((this._loadInt((_33_ + 1128))) + (this._loadInt((_33_ + 1116)))))) != _32_) ? 1 : 0;
                }
                while (false);
                if (_31_ == 0) {
                    break label$1;
                }
                this._storeInt((_34_ = (_33_ + 1040) + (((_31_ = this._loadInt8u(((this._loadInt((_33_ + 1124))) + (_30_ = this._loadInt((_33_ + 1116)))))) >>> 3) & 28)), ((this._loadInt(_34_)) | (1 << (_31_ & 31))));
                this._storeInt(((_33_ + 16) + (_31_ << 2)), (_30_ + 1));
                this._storeInt((_33_ + 1116), ((this._loadInt((_33_ + 1116))) + 1));
                continue label$0;
            }
        }
        while (false);
        label$3:
        do {
            label$4:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 1124))) + (this._loadInt((_33_ + 1116)))))) == 0) {
                    break label$4;
                }
                this._storeInt((_33_ + 1132), 0);
                break label$3;
            }
            while (false);
            this._storeInt((_33_ + 1112), -1);
            this._storeInt((_33_ + 1108), 0);
            _34_ = this._storeInt((_33_ + 1104), (this._storeInt((_33_ + 1100), 1)));
            label$6:
            do {
                label$5:
                while (true) {
                    if ((((this._loadInt((_33_ + 1108))) + (this._loadInt((_33_ + 1104)))) & 4294967295L) >= ((this._loadInt((_33_ + 1116))) & 4294967295L)) {
                        break label$6;
                    }
                    label$7:
                    do {
                        label$8:
                        do {
                            if ((this._loadInt8u(((_31_ = this._loadInt((_33_ + 1124))) + ((this._loadInt((_33_ + 1112))) + (_30_ = this._loadInt((_33_ + 1104))))))) != (this._loadInt8u((_31_ + ((this._loadInt((_33_ + 1108))) + _30_))))) {
                                break label$8;
                            }
                            if ((this._loadInt((_33_ + 1104))) != (this._loadInt((_33_ + 1100)))) {
                                break label$7;
                            }
                            this._storeInt((_33_ + 1108), ((this._loadInt((_33_ + 1108))) + (this._loadInt((_33_ + 1100)))));
                            this._storeInt((_33_ + 1104), _34_);
                            continue label$5;
                        }
                        while (false);
                        label$9:
                        do {
                            if ((this._loadInt8u(((_31_ = this._loadInt((_33_ + 1124))) + ((this._loadInt((_33_ + 1112))) + (_30_ = this._loadInt((_33_ + 1104))))))) > (this._loadInt8u((_31_ + ((this._loadInt((_33_ + 1108))) + _30_))))) {
                                break label$9;
                            }
                            this._storeInt((_33_ + 1108), ((_31_ = this._loadInt((_33_ + 1108))) + _34_));
                            this._storeInt((_33_ + 1112), _31_);
                            this._storeInt((_33_ + 1104), (this._storeInt((_33_ + 1100), _34_)));
                            continue label$5;
                        }
                        while (false);
                        this._storeInt((_33_ + 1108), ((this._loadInt((_33_ + 1108))) + (this._loadInt((_33_ + 1104)))));
                        this._storeInt((_33_ + 1104), _34_);
                        this._storeInt((_33_ + 1100), ((this._loadInt((_33_ + 1108))) - (this._loadInt((_33_ + 1112)))));
                        continue label$5;
                    }
                    while (false);
                    this._storeInt((_33_ + 1104), ((this._loadInt((_33_ + 1104))) + _34_));
                    continue label$5;
                }
            }
            while (false);
            this._storeInt((_33_ + 1096), (this._loadInt((_33_ + 1112))));
            this._storeInt((_33_ + 1092), (this._loadInt((_33_ + 1100))));
            this._storeInt((_33_ + 1112), -1);
            this._storeInt((_33_ + 1108), 0);
            _34_ = this._storeInt((_33_ + 1104), (this._storeInt((_33_ + 1100), 1)));
            label$11:
            do {
                label$10:
                while (true) {
                    if ((((this._loadInt((_33_ + 1108))) + (this._loadInt((_33_ + 1104)))) & 4294967295L) >= ((this._loadInt((_33_ + 1116))) & 4294967295L)) {
                        break label$11;
                    }
                    label$12:
                    do {
                        label$13:
                        do {
                            if ((this._loadInt8u(((_31_ = this._loadInt((_33_ + 1124))) + ((this._loadInt((_33_ + 1112))) + (_30_ = this._loadInt((_33_ + 1104))))))) != (this._loadInt8u((_31_ + ((this._loadInt((_33_ + 1108))) + _30_))))) {
                                break label$13;
                            }
                            if ((this._loadInt((_33_ + 1104))) != (this._loadInt((_33_ + 1100)))) {
                                break label$12;
                            }
                            this._storeInt((_33_ + 1108), ((this._loadInt((_33_ + 1108))) + (this._loadInt((_33_ + 1100)))));
                            this._storeInt((_33_ + 1104), _34_);
                            continue label$10;
                        }
                        while (false);
                        label$14:
                        do {
                            if ((this._loadInt8u(((_31_ = this._loadInt((_33_ + 1124))) + ((this._loadInt((_33_ + 1112))) + (_30_ = this._loadInt((_33_ + 1104))))))) < (this._loadInt8u((_31_ + ((this._loadInt((_33_ + 1108))) + _30_))))) {
                                break label$14;
                            }
                            this._storeInt((_33_ + 1108), ((_31_ = this._loadInt((_33_ + 1108))) + _34_));
                            this._storeInt((_33_ + 1112), _31_);
                            this._storeInt((_33_ + 1104), (this._storeInt((_33_ + 1100), _34_)));
                            continue label$10;
                        }
                        while (false);
                        this._storeInt((_33_ + 1108), ((this._loadInt((_33_ + 1108))) + (this._loadInt((_33_ + 1104)))));
                        this._storeInt((_33_ + 1104), _34_);
                        this._storeInt((_33_ + 1100), ((this._loadInt((_33_ + 1108))) - (this._loadInt((_33_ + 1112)))));
                        continue label$10;
                    }
                    while (false);
                    this._storeInt((_33_ + 1104), ((this._loadInt((_33_ + 1104))) + _34_));
                    continue label$10;
                }
            }
            while (false);
            label$15:
            do {
                label$16:
                do {
                    if ((((this._loadInt((_33_ + 1112))) + 1) & 4294967295L) <= (((this._loadInt((_33_ + 1096))) + 1) & 4294967295L)) {
                        break label$16;
                    }
                    this._storeInt((_33_ + 1096), (this._loadInt((_33_ + 1112))));
                    break label$15;
                }
                while (false);
                this._storeInt((_33_ + 1100), (this._loadInt((_33_ + 1092))));
            }
            while (false);
            label$17:
            do {
                label$18:
                do {
                    label$19:
                    do {
                        label$20:
                        do {
                            if ((memcmp((_31_ = this._loadInt((_33_ + 1124))), (_31_ + (this._loadInt((_33_ + 1100)))), ((this._loadInt((_33_ + 1096))) + 1))) == 0) {
                                break label$20;
                            }
                            this._storeInt((_33_ + 1084), 0);
                            if (((_31_ = this._loadInt((_33_ + 1096))) & 4294967295L) <= ((((this._loadInt((_33_ + 1116))) - _31_) + -1) & 4294967295L)) {
                                break label$19;
                            }
                            _31_ = this._loadInt((_33_ + 1096));
                            break label$18;
                        }
                        while (false);
                        this._storeInt((_33_ + 1084), ((this._loadInt((_33_ + 1116))) - (this._loadInt((_33_ + 1100)))));
                        break label$17;
                    }
                    while (false);
                    _31_ = ((this._loadInt((_33_ + 1116))) - (this._loadInt((_33_ + 1096)))) + -1;
                }
                while (false);
                this._storeInt((_33_ + 1100), (_31_ + 1));
            }
            while (false);
            _30_ = this._storeInt((_33_ + 1088), 0);
            this._storeInt((_33_ + 1120), (this._loadInt((_33_ + 1128))));
            label$21:
            do {
                label$23:
                do {
                    label$22:
                    while (true) {
                        label$24:
                        do {
                            if ((((this._loadInt((_33_ + 1120))) - (this._loadInt((_33_ + 1128)))) & 4294967295L) >= ((this._loadInt((_33_ + 1116))) & 4294967295L)) {
                                break label$24;
                            }
                            _31_ = this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 1116))) | 63));
                            label$25:
                            do {
                                if ((this._storeInt((_33_ + 8), (memchr((this._loadInt((_33_ + 1120))), _30_, _31_)))) == 0) {
                                    break label$25;
                                }
                                if ((((this._storeInt((_33_ + 1120), (this._loadInt((_33_ + 8))))) - (this._loadInt((_33_ + 1128)))) & 4294967295L) >= ((this._loadInt((_33_ + 1116))) & 4294967295L)) {
                                    break label$24;
                                }
                                break label$23;
                            }
                            while (false);
                            this._storeInt((_33_ + 1120), ((this._loadInt((_33_ + 1120))) + (this._loadInt((_33_ + 12)))));
                        }
                        while (false);
                        label$26:
                        do {
                            label$27:
                            do {
                                if (((this._loadInt(((_33_ + 1040) + (((_31_ = this._loadInt8u((((this._loadInt((_33_ + 1128))) + (this._loadInt((_33_ + 1116)))) + -1))) >>> 3) & 28)))) & (1 << (_31_ & 31))) == 0) {
                                    break label$27;
                                }
                                if ((this._storeInt((_33_ + 1104), ((_31_ = this._loadInt((_33_ + 1116))) - (this._loadInt(((_33_ + 16) + ((this._loadInt8u(((_31_ + (this._loadInt((_33_ + 1128)))) + -1))) << 2))))))) == 0) {
                                    break label$26;
                                }
                                label$28:
                                do {
                                    if ((this._loadInt((_33_ + 1084))) == 0) {
                                        break label$28;
                                    }
                                    if ((this._loadInt((_33_ + 1088))) == 0) {
                                        break label$28;
                                    }
                                    if (((this._loadInt((_33_ + 1104))) & 4294967295L) >= ((this._loadInt((_33_ + 1100))) & 4294967295L)) {
                                        break label$28;
                                    }
                                    this._storeInt((_33_ + 1104), ((this._loadInt((_33_ + 1116))) - (this._loadInt((_33_ + 1100)))));
                                }
                                while (false);
                                this._storeInt((_33_ + 1128), ((this._loadInt((_33_ + 1128))) + (this._loadInt((_33_ + 1104)))));
                                this._storeInt((_33_ + 1088), _30_);
                                continue label$22;
                            }
                            while (false);
                            this._storeInt((_33_ + 1128), ((this._loadInt((_33_ + 1128))) + (this._loadInt((_33_ + 1116)))));
                            this._storeInt((_33_ + 1088), _30_);
                            continue label$22;
                        }
                        while (false);
                        label$29:
                        do {
                            label$30:
                            do {
                                if ((((this._loadInt((_33_ + 1096))) + 1) & 4294967295L) <= ((this._loadInt((_33_ + 1088))) & 4294967295L)) {
                                    break label$30;
                                }
                                _31_ = (this._loadInt((_33_ + 1096))) + 1;
                                break label$29;
                            }
                            while (false);
                            _31_ = this._loadInt((_33_ + 1088));
                        }
                        while (false);
                        this._storeInt((_33_ + 1104), _31_);
                        label$32:
                        do {
                            label$31:
                            while (true) {
                                _31_ = 0;
                                label$33:
                                do {
                                    if ((this._loadInt8u(((this._loadInt((_33_ + 1124))) + (this._loadInt((_33_ + 1104)))))) == 0) {
                                        break label$33;
                                    }
                                    _31_ = ((this._loadInt8u(((this._loadInt((_33_ + 1124))) + (_31_ = this._loadInt((_33_ + 1104)))))) == (this._loadInt8u(((this._loadInt((_33_ + 1128))) + _31_)))) ? 1 : 0;
                                }
                                while (false);
                                if (_31_ == 0) {
                                    break label$32;
                                }
                                this._storeInt((_33_ + 1104), ((this._loadInt((_33_ + 1104))) + 1));
                                continue label$31;
                            }
                        }
                        while (false);
                        label$34:
                        do {
                            if ((this._loadInt8u(((this._loadInt((_33_ + 1124))) + (this._loadInt((_33_ + 1104)))))) == 0) {
                                break label$34;
                            }
                            this._storeInt((_33_ + 1128), ((this._loadInt((_33_ + 1128))) + ((this._loadInt((_33_ + 1104))) - (this._loadInt((_33_ + 1096))))));
                            this._storeInt((_33_ + 1088), _30_);
                            continue label$22;
                        }
                        while (false);
                        this._storeInt((_33_ + 1104), ((this._loadInt((_33_ + 1096))) + 1));
                        label$36:
                        do {
                            label$35:
                            while (true) {
                                _31_ = 0;
                                label$37:
                                do {
                                    if (((this._loadInt((_33_ + 1104))) & 4294967295L) <= ((this._loadInt((_33_ + 1088))) & 4294967295L)) {
                                        break label$37;
                                    }
                                    _31_ = ((this._loadInt8u(((this._loadInt((_33_ + 1124))) + (_31_ = (this._loadInt((_33_ + 1104))) + -1)))) == (this._loadInt8u(((this._loadInt((_33_ + 1128))) + _31_)))) ? 1 : 0;
                                }
                                while (false);
                                if (_31_ == 0) {
                                    break label$36;
                                }
                                this._storeInt((_33_ + 1104), ((this._loadInt((_33_ + 1104))) + -1));
                                continue label$35;
                            }
                        }
                        while (false);
                        if (((this._loadInt((_33_ + 1104))) & 4294967295L) <= ((this._loadInt((_33_ + 1088))) & 4294967295L)) {
                            break label$21;
                        }
                        this._storeInt((_33_ + 1128), ((this._loadInt((_33_ + 1128))) + (this._loadInt((_33_ + 1100)))));
                        this._storeInt((_33_ + 1088), (this._loadInt((_33_ + 1084))));
                        continue label$22;
                    }
                }
                while (false);
                this._storeInt((_33_ + 1132), 0);
                break label$3;
            }
            while (false);
            this._storeInt((_33_ + 1132), (this._loadInt((_33_ + 1128))));
        }
        while (false);
        _31_ = this._loadInt((_33_ + 1132));
        this._storeInt((0 + 4), (_33_ + 1136));
        return _31_;
    }

    @Override()
    public final float strtof(int _30_, int _31_)
    {
        int _32_ = 0;
        float _33_ = 0.0f;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        strtox(_32_, (this._loadInt((_32_ + 28))), _31_, 0);
        _33_ = this.__trunctfsf2.invoke((this._loadLong(_32_)), (this._loadLong((_32_ + 8))));
        this._storeInt((0 + 4), (_32_ + 32));
        return _33_;
    }

    @Override()
    public final void strtox(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 208))) + 204), _31_);
        this._storeInt((_34_ + 200), _32_);
        this._storeInt((_34_ + 196), _33_);
        memset((_34_ + 48), 0, 144);
        this._storeInt((_34_ + 124), (this._storeInt((_34_ + 56), -1)));
        this._storeInt((_34_ + 92), (this._storeInt((_34_ + 52), (this._loadInt((_34_ + 204))))));
        __shlim((_34_ + 48), 0L);
        this.__floatscan.invoke(_34_, (_34_ + 48), (this._loadInt((_34_ + 196))), 1);
        this._storeLong((_34_ + 32), (this._loadLong(_34_)));
        this._storeLong((_34_ + 40), (this._loadLong((_34_ + 8))));
        this._storeLong((_34_ + 24), ((this._loadLong((_34_ + 168))) + ((long) ((this._loadInt((_34_ + 52))) - (this._loadInt((_34_ + 56)))))));
        label$0:
        do {
            if ((this._loadInt((_34_ + 200))) == 0) {
                break label$0;
            }
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadLong((_34_ + 24))) == 0) {
                        break label$2;
                    }
                    _33_ = (this._loadInt((_34_ + 204))) + (this._loadInt((_34_ + 24)));
                    break label$1;
                }
                while (false);
                _33_ = this._loadInt((_34_ + 204));
            }
            while (false);
            this._storeInt((this._loadInt((_34_ + 200))), _33_);
        }
        while (false);
        this._storeLong(_30_, (this._loadLong((_34_ + 32))));
        this._storeLong((_30_ + 8), (this._loadLong((_34_ + 40))));
        this._storeInt((0 + 4), (_34_ + 208));
        return;
    }

    @Override()
    public final double strtod(int _30_, int _31_)
    {
        int _32_ = 0;
        double _33_ = 0.0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        strtox(_32_, (this._loadInt((_32_ + 28))), _31_, 1);
        _33_ = this.__trunctfdf2.invoke((this._loadLong(_32_)), (this._loadLong((_32_ + 8))));
        this._storeInt((0 + 4), (_32_ + 32));
        return _33_;
    }

    @Override()
    public final void strtold(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _31_);
        this._storeInt((_33_ + 24), _32_);
        strtox(_33_, (this._loadInt((_33_ + 28))), _32_, 2);
        _34_ = this._loadLong(_33_);
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, _34_);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int strtok(int _30_, int _31_)
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
                    if ((this._loadInt((_32_ + 8))) != 0) {
                        break label$2;
                    }
                    if ((this._storeInt((_32_ + 8), (this._loadInt((0 + 19212))))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                label$3:
                do {
                    label$4:
                    do {
                        label$5:
                        do {
                            if ((this._loadInt8u((this._storeInt((_32_ + 8), ((strspn((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))))) + (this._loadInt((_32_ + 8)))))))) == 0) {
                                break label$5;
                            }
                            if ((this._loadInt8u((this._storeInt((0 + 19212), ((_31_ = this._loadInt((_32_ + 8))) + (strcspn(_31_, (this._loadInt((_32_ + 4)))))))))) == 0) {
                                break label$4;
                            }
                            this._storeInt((0 + 19212), ((_31_ = this._loadInt((0 + 19212))) + 1));
                            this._storeInt8(_31_, 0);
                            break label$3;
                        }
                        while (false);
                        this._storeInt(((_31_ = this._storeInt((_32_ + 12), 0)) + 19212), _31_);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((0 + 19212), 0);
                }
                while (false);
                this._storeInt((_32_ + 12), (this._loadInt((_32_ + 8))));
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
    public final int strtok_r(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_33_ + 4), _31_);
        this._storeInt(_33_, _32_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_33_ + 8))) != 0) {
                        break label$2;
                    }
                    if ((this._storeInt((_33_ + 8), (this._loadInt((this._loadInt(_33_)))))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                label$3:
                do {
                    label$4:
                    do {
                        label$5:
                        do {
                            if ((this._loadInt8u((this._storeInt((_33_ + 8), ((strspn((this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 4))))) + (this._loadInt((_33_ + 8)))))))) == 0) {
                                break label$5;
                            }
                            _31_ = strcspn((_32_ = this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 4))));
                            if ((this._loadInt8u((this._storeInt((this._loadInt(_33_)), (_32_ + _31_))))) == 0) {
                                break label$4;
                            }
                            this._storeInt((_32_ = this._loadInt(_33_)), ((_32_ = this._loadInt(_32_)) + 1));
                            this._storeInt8(_32_, 0);
                            break label$3;
                        }
                        while (false);
                        this._storeInt((_33_ + 12), (this._storeInt((this._loadInt(_33_)), 0)));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((this._loadInt(_33_)), 0);
                }
                while (false);
                this._storeInt((_33_ + 12), (this._loadInt((_33_ + 8))));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 12), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 12));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final long strtoull(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _34_ = strtox$2e$301((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_, -1L);
        this._storeInt((0 + 4), (_33_ + 16));
        return _34_;
    }

    @Override()
    public final long strtox$2e$301(int _30_, int _31_, int _32_, long _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 192))) + 188), _30_);
        this._storeInt((_34_ + 184), _31_);
        this._storeInt((_34_ + 180), _32_);
        this._storeLong((_34_ + 168), _33_);
        this._storeInt((_34_ + 24), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_34_ + 68), (this._storeInt((_34_ + 28), (this._loadInt((_34_ + 188))))))) > -1) {
                    break label$1;
                }
                this._storeInt((_34_ + 32), -1);
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 32), ((this._loadInt((_34_ + 188))) + 2147483647));
        }
        while (false);
        this._storeInt((_34_ + 100), -1);
        __shlim((_34_ + 24), 0L);
        this._storeLong((_34_ + 16), (__intscan((_34_ + 24), (this._loadInt((_34_ + 180))), 1, (this._loadLong((_34_ + 168))))));
        label$2:
        do {
            if ((this._loadInt((_34_ + 184))) == 0) {
                break label$2;
            }
            _32_ = this._storeInt((_34_ + 12), ((int) ((this._loadLong((_34_ + 144))) + (((this._loadInt((_34_ + 28))) - (this._loadInt((_34_ + 32)))) & 4294967295L))));
            this._storeInt((this._loadInt((_34_ + 184))), (_32_ + (this._loadInt((_34_ + 188)))));
        }
        while (false);
        _33_ = this._loadLong((_34_ + 16));
        this._storeInt((0 + 4), (_34_ + 192));
        return _33_;
    }

    @Override()
    public final long strtoll(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _34_ = strtox$2e$301((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_, -9223372036854775808L);
        this._storeInt((0 + 4), (_33_ + 16));
        return _34_;
    }

    @Override()
    public final int strtoul(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _34_ = strtox$2e$301((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_, 4294967295L);
        this._storeInt((0 + 4), (_33_ + 16));
        return ((int) _34_);
    }

    @Override()
    public final int strtol(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _34_ = strtox$2e$301((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_, 2147483648L);
        this._storeInt((0 + 4), (_33_ + 16));
        return ((int) _34_);
    }

    @Override()
    public final long strtoimax(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _34_ = strtoll((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _34_;
    }

    @Override()
    public final long strtoumax(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _34_ = strtoull((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _34_;
    }

    @Override()
    public final int strverscmp(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 48) + 40), _30_);
        this._storeInt((_33_ + 36), _31_);
        this._storeInt((_33_ + 32), (this._loadInt((_33_ + 40))));
        this._storeInt((_33_ + 28), (this._loadInt((_33_ + 36))));
        _30_ = this._storeInt((_33_ + 12), 1);
        _32_ = this._storeInt((_33_ + 20), (this._storeInt((_33_ + 24), 0)));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        label$5:
                        do {
                            label$4:
                            while (true) {
                                if ((this._loadInt8u(((this._loadInt((_33_ + 32))) + (_31_ = this._loadInt((_33_ + 24)))))) != (this._loadInt8u(((this._loadInt((_33_ + 28))) + _31_)))) {
                                    break label$5;
                                }
                                if ((this._storeInt((_33_ + 8), (this._loadInt8u(((this._loadInt((_33_ + 32))) + (this._loadInt((_33_ + 24)))))))) == 0) {
                                    break label$3;
                                }
                                label$6:
                                do {
                                    label$7:
                                    do {
                                        if ((((this._loadInt((_33_ + 8))) + -48) & 4294967295L) >= (10 & 4294967295L)) {
                                            break label$7;
                                        }
                                        if ((this._loadInt((_33_ + 8))) == 48) {
                                            break label$6;
                                        }
                                        this._storeInt((_33_ + 12), _32_);
                                        break label$6;
                                    }
                                    while (false);
                                    this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 24))) + _30_));
                                    this._storeInt((_33_ + 12), _30_);
                                }
                                while (false);
                                this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + _30_));
                                continue label$4;
                            }
                        }
                        while (false);
                        if ((this._loadInt8u(((this._loadInt((_33_ + 32))) + (this._loadInt((_33_ + 20)))))) == 48) {
                            break label$2;
                        }
                        if ((this._loadInt8u(((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 20)))))) == 48) {
                            break label$2;
                        }
                        this._storeInt((_33_ + 16), (this._loadInt((_33_ + 24))));
                        label$9:
                        do {
                            label$8:
                            while (true) {
                                if ((((this._loadInt8u(((this._loadInt((_33_ + 32))) + (this._loadInt((_33_ + 16)))))) + -48) & 4294967295L) > (9 & 4294967295L)) {
                                    break label$1;
                                }
                                if ((((this._loadInt8u(((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 16)))))) + -48) & 4294967295L) >= (10 & 4294967295L)) {
                                    break label$9;
                                }
                                this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + 1));
                                continue label$8;
                            }
                        }
                        while (false);
                        this._storeInt((_33_ + 44), 1);
                        return (this._loadInt((_33_ + 44)));
                    }
                    while (false);
                    this._storeInt((_33_ + 44), 0);
                    return (this._loadInt((_33_ + 44)));
                }
                while (false);
                if ((this._loadInt((_33_ + 12))) == 0) {
                    break label$0;
                }
                if (((this._loadInt((_33_ + 20))) & 4294967295L) >= ((this._loadInt((_33_ + 24))) & 4294967295L)) {
                    break label$0;
                }
                label$10:
                do {
                    if ((((this._loadInt8u(((this._loadInt((_33_ + 32))) + (this._loadInt((_33_ + 24)))))) + -48) & 4294967295L) < (10 & 4294967295L)) {
                        break label$10;
                    }
                    if ((((this._loadInt8u(((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 24)))))) + -48) & 4294967295L) > (9 & 4294967295L)) {
                        break label$0;
                    }
                }
                while (false);
                this._storeInt((_33_ + 44), ((((this._loadInt8u(((this._loadInt((_33_ + 32))) + (_31_ = this._loadInt((_33_ + 24)))))) + -48) & 255) - (((this._loadInt8u(((this._loadInt((_33_ + 28))) + _31_))) + -48) & 255)));
                return (this._loadInt((_33_ + 44)));
            }
            while (false);
            if ((((this._loadInt8u(((this._loadInt((_33_ + 28))) + (this._loadInt((_33_ + 16)))))) + -48) & 4294967295L) > (9 & 4294967295L)) {
                break label$0;
            }
            this._storeInt((_33_ + 44), -1);
            return (this._loadInt((_33_ + 44)));
        }
        while (false);
        this._storeInt((_33_ + 44), ((this._loadInt8u(((this._loadInt((_33_ + 32))) + (_31_ = this._loadInt((_33_ + 24)))))) - (this._loadInt8u(((this._loadInt((_33_ + 28))) + _31_)))));
        return (this._loadInt((_33_ + 44)));
    }

    @Override()
    public final void swab(int _30_, int _31_, int _32_)
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
                if ((this._loadInt((_33_ + 20))) < 2) {
                    break label$1;
                }
                this._storeInt8((_32_ = this._loadInt((_33_ + 12))), (this._loadInt8u(((_31_ = this._loadInt((_33_ + 16))) + 1))));
                this._storeInt8((_32_ + 1), (this._loadInt8u(_31_)));
                this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 2));
                this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + 2));
                this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + -2));
                continue label$0;
            }
        }
        while (false);
        return;
    }

    @Override()
    public final int symlink(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = __syscall_ret((this.__syscall2.invoke(83, (this._loadInt((_32_ + 12))), _31_)));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int symlinkat(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = __syscall_ret((this.__syscall3.invoke(304, (this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_)));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final void sync()
    {
        this.__syscall0.invoke(36);
        return;
    }

    @Override()
    public final int __syscall_ret(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if (((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)) & 4294967295L) < (-4095 & 4294967295L)) {
                    break label$1;
                }
                _30_ = this._loadInt((_31_ + 8));
                this._storeInt((__errno_location()), (0 - _30_));
                this._storeInt((_31_ + 12), -1);
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 12), (this._loadInt((_31_ + 8))));
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final double tan(double _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        this._storeDouble(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 16), (this._storeDouble((_32_ + 48), _30_)));
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
                                if (((this._storeInt((_32_ + 28), ((this._storeInt((_32_ + 28), (this._loadInt((_32_ + 20))))) & 2147483647))) & 4294967295L) > (1072243195 & 4294967295L)) {
                                    break label$5;
                                }
                                if (((this._loadInt((_32_ + 28))) & 4294967295L) > (1044381695 & 4294967295L)) {
                                    break label$4;
                                }
                                if (((this._loadInt((_32_ + 28))) & 4294967295L) > (1048575 & 4294967295L)) {
                                    break label$2;
                                }
                                _30_ = (this._loadDouble((_32_ + 48))) / 1.3292279957849159E36;
                                break label$1;
                            }
                            while (false);
                            if (((this._loadInt((_32_ + 28))) & 4294967295L) < (2146435072 & 4294967295L)) {
                                break label$3;
                            }
                            this._storeDouble((_32_ + 56), ((_30_ = this._loadDouble((_32_ + 48))) - _30_));
                            break label$0;
                        }
                        while (false);
                        this._storeDouble((_32_ + 56), (__tan((this._loadDouble((_32_ + 48))), 0.0, 0)));
                        break label$0;
                    }
                    while (false);
                    _31_ = this._storeInt((_32_ + 24), (__rem_pio2((this._loadDouble((_32_ + 48))), (_32_ + 32))));
                    this._storeDouble((_32_ + 56), (__tan((this._loadDouble((_32_ + 32))), (this._loadDouble((_32_ + 40))), (_31_ & 1))));
                    break label$0;
                }
                while (false);
                _30_ = (this._loadDouble((_32_ + 48))) + 1.3292279957849159E36;
            }
            while (false);
            this._storeDouble((_32_ + 8), _30_);
            this._storeDouble((_32_ + 56), (this._loadDouble((_32_ + 48))));
        }
        while (false);
        _30_ = this._loadDouble((_32_ + 56));
        this._storeInt((0 + 4), (_32_ + 64));
        return _30_;
    }

    @Override()
    public final float tanf(float _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        double _33_ = 0.0;
        this._storeFloat(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 16), (this._storeFloat((_32_ + 40), _30_)));
        this._storeInt((_32_ + 20), ((this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))))) >>> 31));
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
                                                                                if (((this._storeInt((_32_ + 28), ((this._loadInt((_32_ + 28))) & 2147483647))) & 4294967295L) > (1061752794 & 4294967295L)) {
                                                                                    break label$17;
                                                                                }
                                                                                if (((this._loadInt((_32_ + 28))) & 4294967295L) > (964689919 & 4294967295L)) {
                                                                                    break label$16;
                                                                                }
                                                                                if (((this._loadInt((_32_ + 28))) & 4294967295L) > (8388607 & 4294967295L)) {
                                                                                    break label$14;
                                                                                }
                                                                                _30_ = (this._loadFloat((_32_ + 40))) / 1.329228E36f;
                                                                                break label$13;
                                                                            }
                                                                            while (false);
                                                                            if (((this._loadInt((_32_ + 28))) & 4294967295L) > (1081824209 & 4294967295L)) {
                                                                                break label$15;
                                                                            }
                                                                            if (((this._loadInt((_32_ + 28))) & 4294967295L) > (1075235811 & 4294967295L)) {
                                                                                break label$12;
                                                                            }
                                                                            if ((this._loadInt((_32_ + 20))) == 0) {
                                                                                break label$8;
                                                                            }
                                                                            _33_ = ((double) (this._loadFloat((_32_ + 40)))) + 1.5707963267948966;
                                                                            break label$7;
                                                                        }
                                                                        while (false);
                                                                        this._storeFloat((_32_ + 44), (__tandf(((double) (this._loadFloat((_32_ + 40)))), 0)));
                                                                        break label$0;
                                                                    }
                                                                    while (false);
                                                                    if (((this._loadInt((_32_ + 28))) & 4294967295L) > (1088565717 & 4294967295L)) {
                                                                        break label$11;
                                                                    }
                                                                    if (((this._loadInt((_32_ + 28))) & 4294967295L) > (1085271519 & 4294967295L)) {
                                                                        break label$10;
                                                                    }
                                                                    if ((this._loadInt((_32_ + 20))) == 0) {
                                                                        break label$4;
                                                                    }
                                                                    _33_ = ((double) (this._loadFloat((_32_ + 40)))) + 4.71238898038469;
                                                                    break label$3;
                                                                }
                                                                while (false);
                                                                _30_ = (this._loadFloat((_32_ + 40))) + 1.329228E36f;
                                                            }
                                                            while (false);
                                                            this._storeFloat((_32_ + 12), _30_);
                                                            this._storeFloat((_32_ + 44), (this._loadFloat((_32_ + 40))));
                                                            break label$0;
                                                        }
                                                        while (false);
                                                        if ((this._loadInt((_32_ + 20))) == 0) {
                                                            break label$6;
                                                        }
                                                        _33_ = ((double) (this._loadFloat((_32_ + 40)))) + 3.141592653589793;
                                                        break label$5;
                                                    }
                                                    while (false);
                                                    if (((this._loadInt((_32_ + 28))) & 4294967295L) < (2139095040 & 4294967295L)) {
                                                        break label$9;
                                                    }
                                                    this._storeFloat((_32_ + 44), ((_30_ = this._loadFloat((_32_ + 40))) - _30_));
                                                    break label$0;
                                                }
                                                while (false);
                                                if ((this._loadInt((_32_ + 20))) == 0) {
                                                    break label$2;
                                                }
                                                _33_ = ((double) (this._loadFloat((_32_ + 40)))) + 6.283185307179586;
                                                break label$1;
                                            }
                                            while (false);
                                            _31_ = this._storeInt((_32_ + 24), (__rem_pio2f((this._loadFloat((_32_ + 40))), (_32_ + 32))));
                                            this._storeFloat((_32_ + 44), (__tandf((this._loadDouble((_32_ + 32))), (_31_ & 1))));
                                            break label$0;
                                        }
                                        while (false);
                                        _33_ = ((double) (this._loadFloat((_32_ + 40)))) + -1.5707963267948966;
                                    }
                                    while (false);
                                    this._storeFloat((_32_ + 44), (__tandf(_33_, 1)));
                                    break label$0;
                                }
                                while (false);
                                _33_ = ((double) (this._loadFloat((_32_ + 40)))) + -3.141592653589793;
                            }
                            while (false);
                            this._storeFloat((_32_ + 44), (__tandf(_33_, 0)));
                            break label$0;
                        }
                        while (false);
                        _33_ = ((double) (this._loadFloat((_32_ + 40)))) + -4.71238898038469;
                    }
                    while (false);
                    this._storeFloat((_32_ + 44), (__tandf(_33_, 1)));
                    break label$0;
                }
                while (false);
                _33_ = ((double) (this._loadFloat((_32_ + 40)))) + -6.283185307179586;
            }
            while (false);
            this._storeFloat((_32_ + 44), (__tandf(_33_, 0)));
        }
        while (false);
        _30_ = this._loadFloat((_32_ + 44));
        this._storeInt((0 + 4), (_32_ + 48));
        return _30_;
    }

    @Override()
    public final double tanh(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 32), (this._storeDouble((_31_ + 40), _30_)));
        this._storeLong32((_31_ + 24), ((this._loadLong((_31_ + 32))) >>> 63L));
        this._storeLong((_31_ + 32), ((this._loadLong((_31_ + 32))) & 9223372036854775807L));
        this._storeDouble((_31_ + 40), (this._loadDouble((_31_ + 32))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if (((this._storeInt((_31_ + 28), (this._loadInt((_31_ + 36))))) & 4294967295L) < (1071748075 & 4294967295L)) {
                            break label$3;
                        }
                        if (((this._loadInt((_31_ + 28))) & 4294967295L) < (1077149697 & 4294967295L)) {
                            break label$2;
                        }
                        this._storeDouble((_31_ + 16), ((-0.0 / (this._loadDouble((_31_ + 40)))) + 1.0));
                        break label$0;
                    }
                    while (false);
                    if (((this._loadInt((_31_ + 28))) & 4294967295L) < (1070618799 & 4294967295L)) {
                        break label$1;
                    }
                    this._storeDouble((_31_ + 16), ((_30_ = this._storeDouble((_31_ + 16), (expm1(((_30_ = this._loadDouble((_31_ + 40))) + _30_))))) / (_30_ + 2.0)));
                    break label$0;
                }
                while (false);
                this._storeDouble((_31_ + 16), (1.0 - (2.0 / ((this._storeDouble((_31_ + 16), (expm1(((_30_ = this._loadDouble((_31_ + 40))) + _30_))))) + 2.0))));
                break label$0;
            }
            while (false);
            label$4:
            do {
                if (((this._loadInt((_31_ + 28))) & 4294967295L) < (1048576 & 4294967295L)) {
                    break label$4;
                }
                this._storeDouble((_31_ + 16), ((-(_30_ = this._storeDouble((_31_ + 16), (expm1(((this._loadDouble((_31_ + 40))) * -2.0)))))) / (_30_ + 2.0)));
                break label$0;
            }
            while (false);
            this._storeFloat((_31_ + 12), ((float) (this._loadDouble((_31_ + 40)))));
            this._storeDouble((_31_ + 16), (this._loadDouble((_31_ + 40))));
        }
        while (false);
        label$5:
        do {
            label$6:
            do {
                if ((this._loadInt((_31_ + 24))) == 0) {
                    break label$6;
                }
                _30_ = -(this._loadDouble((_31_ + 16)));
                break label$5;
            }
            while (false);
            _30_ = this._loadDouble((_31_ + 16));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 48));
        return _30_;
    }

    @Override()
    public final float tanhf(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), (this._storeFloat((_31_ + 28), _30_)));
        this._storeInt((_31_ + 16), ((this._loadInt((_31_ + 24))) >>> 31));
        this._storeInt((_31_ + 24), ((this._loadInt((_31_ + 24))) & 2147483647));
        this._storeFloat((_31_ + 28), (this._loadFloat((_31_ + 24))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if (((this._storeInt((_31_ + 20), (this._loadInt((_31_ + 24))))) & 4294967295L) < (1057791829 & 4294967295L)) {
                            break label$3;
                        }
                        if (((this._loadInt((_31_ + 20))) & 4294967295L) < (1092616193 & 4294967295L)) {
                            break label$2;
                        }
                        this._storeFloat((_31_ + 12), ((0.0f / (this._loadFloat((_31_ + 28)))) + 1.0f));
                        break label$0;
                    }
                    while (false);
                    if (((this._loadInt((_31_ + 20))) & 4294967295L) < (1048757625 & 4294967295L)) {
                        break label$1;
                    }
                    this._storeFloat((_31_ + 12), ((_30_ = this._storeFloat((_31_ + 12), (expm1f(((_30_ = this._loadFloat((_31_ + 28))) + _30_))))) / (_30_ + 2.0f)));
                    break label$0;
                }
                while (false);
                this._storeFloat((_31_ + 12), (1.0f - (2.0f / ((this._storeFloat((_31_ + 12), (expm1f(((_30_ = this._loadFloat((_31_ + 28))) + _30_))))) + 2.0f))));
                break label$0;
            }
            while (false);
            label$4:
            do {
                if (((this._loadInt((_31_ + 20))) & 4294967295L) < (8388608 & 4294967295L)) {
                    break label$4;
                }
                this._storeFloat((_31_ + 12), ((-(_30_ = this._storeFloat((_31_ + 12), (expm1f(((this._loadFloat((_31_ + 28))) * -2.0f)))))) / (_30_ + 2.0f)));
                break label$0;
            }
            while (false);
            this._storeFloat((_31_ + 8), ((_30_ = this._loadFloat((_31_ + 28))) * _30_));
            this._storeFloat((_31_ + 12), (this._loadFloat((_31_ + 28))));
        }
        while (false);
        label$5:
        do {
            label$6:
            do {
                if ((this._loadInt((_31_ + 16))) == 0) {
                    break label$6;
                }
                _30_ = -(this._loadFloat((_31_ + 12)));
                break label$5;
            }
            while (false);
            _30_ = this._loadFloat((_31_ + 12));
        }
        while (false);
        this._storeInt((0 + 4), (_31_ + 32));
        return _30_;
    }

    @Override()
    public final void tanhl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (tanh((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void tanl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (tan((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int tempnam(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 4240))) + 4232), _30_);
        this._storeInt((_32_ + 4228), _31_);
        label$0:
        do {
            if ((this._loadInt((_32_ + 4232))) != 0) {
                break label$0;
            }
            this._storeInt((_32_ + 4232), 19216);
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_32_ + 4228))) != 0) {
                break label$1;
            }
            this._storeInt((_32_ + 4228), 19232);
        }
        while (false);
        this._storeInt((_32_ + 120), (strlen((this._loadInt((_32_ + 4232))))));
        label$2:
        do {
            label$3:
            do {
                if (((this._storeInt((_32_ + 124), (((this._storeInt((_32_ + 116), (strlen((this._loadInt((_32_ + 4228))))))) + (this._loadInt((_32_ + 120)))) + 8))) & 4294967295L) < (4096 & 4294967295L)) {
                    break label$3;
                }
                this._storeInt((__errno_location()), 36);
                this._storeInt((_32_ + 4236), 0);
                break label$2;
            }
            while (false);
            memcpy((_32_ + 128), (this._loadInt((_32_ + 4232))), (this._loadInt((_32_ + 120))));
            this._storeInt8((_31_ = (_32_ + 128) + (this._loadInt((_32_ + 120)))), 47);
            memcpy((_31_ + 1), (this._loadInt((_32_ + 4228))), (this._loadInt((_32_ + 116))));
            this._storeInt8((((_32_ + 128) + ((this._loadInt((_32_ + 120))) + (this._loadInt((_32_ + 116))))) + 1), 95);
            _30_ = this._storeInt((_32_ + 112), (this._storeInt8(((_32_ + 128) + (this._loadInt((_32_ + 124)))), 0)));
            label$4:
            do {
                label$6:
                do {
                    label$5:
                    while (true) {
                        if ((this._loadInt((_32_ + 112))) > 99) {
                            break label$4;
                        }
                        this.__randname.invoke((((_32_ + 128) + (this._loadInt((_32_ + 124)))) + -6));
                        this._storeLong((_31_ = memset(_32_, _30_, 104)), 0L);
                        if ((this._storeInt((_31_ + 108), (this.__syscall2.invoke(107, (_31_ + 128), _31_)))) == -2) {
                            break label$6;
                        }
                        this._storeInt((_31_ + 112), ((this._loadInt((_31_ + 112))) + 1));
                        continue label$5;
                    }
                }
                while (false);
                this._storeInt((_31_ + 4236), (__strdup((_31_ + 128))));
                break label$2;
            }
            while (false);
            this._storeInt((_32_ + 4236), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 4236));
        this._storeInt((0 + 4), (_32_ + 4240));
        return _31_;
    }

    @Override()
    public final double tgamma(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 56), (this._storeDouble((_31_ + 64), _30_)));
        this._storeLong32((_31_ + 12), ((this._loadLong32u((_31_ + 60))) & 2147483647L));
        this._storeLong32((_31_ + 8), ((this._loadLong((_31_ + 56))) >>> 63L));
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt((_31_ + 12))) & 4294967295L) < (2146435072 & 4294967295L)) {
                    break label$1;
                }
                this._storeDouble((_31_ + 72), ((this._loadDouble((_31_ + 64))) + Double.POSITIVE_INFINITY));
                break label$0;
            }
            while (false);
            label$2:
            do {
                if (((this._loadInt((_31_ + 12))) & 4294967295L) > (1016070143 & 4294967295L)) {
                    break label$2;
                }
                this._storeDouble((_31_ + 72), (1.0 / (this._loadDouble((_31_ + 64)))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((_30_ = this._loadDouble((_31_ + 64))) != (Math.floor(_30_))) {
                    break label$3;
                }
                label$4:
                do {
                    if ((this._loadInt((_31_ + 8))) == 0) {
                        break label$4;
                    }
                    this._storeLong((_31_ + 72), 9221120237041090560L);
                    break label$0;
                }
                while (false);
                if (((((_30_ = this._loadDouble((_31_ + 64))) > 23.0) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                    break label$3;
                }
                this._storeDouble((_31_ + 72), (this._loadDouble((((_truncateDoubleToSignedInteger((this._loadDouble((_31_ + 64))))) << 3) + 19240))));
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
                            label$9:
                            do {
                                if (((this._loadInt((_31_ + 12))) & 4294967295L) < (1080492032 & 4294967295L)) {
                                    break label$9;
                                }
                                if ((this._loadInt((_31_ + 8))) == 0) {
                                    break label$8;
                                }
                                this._storeFloat((_31_ + 4), ((float) (1.1754943508222875E-38 / (this._loadDouble((_31_ + 64))))));
                                if (((Math.floor((_30_ = this._loadDouble((_31_ + 64))))) * 0.5) != (Math.floor((_30_ * 0.5)))) {
                                    break label$5;
                                }
                                this._storeLong((_31_ + 72), 0L);
                                break label$0;
                            }
                            while (false);
                            if ((this._loadInt((_31_ + 8))) == 0) {
                                break label$7;
                            }
                            _30_ = -(this._loadDouble((_31_ + 64)));
                            break label$6;
                        }
                        while (false);
                        this._storeDouble((_31_ + 72), (this._storeDouble((_31_ + 64), ((this._loadDouble((_31_ + 64))) * 8.98846567431158E307))));
                        break label$0;
                    }
                    while (false);
                    _30_ = this._loadDouble((_31_ + 64));
                }
                while (false);
                this._storeDouble((_31_ + 40), ((this._storeDouble((_31_ + 48), _30_)) + 5.52468004077673));
                label$10:
                do {
                    label$11:
                    do {
                        if (((((_30_ = this._loadDouble((_31_ + 48))) <= 5.52468004077673) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                            break label$11;
                        }
                        this._storeDouble((_31_ + 32), ((this._storeDouble((_31_ + 32), ((this._loadDouble((_31_ + 40))) - (this._loadDouble((_31_ + 48)))))) + -5.52468004077673));
                        break label$10;
                    }
                    while (false);
                    this._storeDouble((_31_ + 32), ((this._storeDouble((_31_ + 32), ((this._loadDouble((_31_ + 40))) + -5.52468004077673))) - (this._loadDouble((_31_ + 48)))));
                }
                while (false);
                this._storeDouble((_31_ + 24), ((this._loadDouble((_31_ + 48))) + -0.5));
                this._storeDouble((_31_ + 16), ((S((this._loadDouble((_31_ + 48))))) * (exp((-(this._loadDouble((_31_ + 40))))))));
                label$12:
                do {
                    if (((((_30_ = this._loadDouble((_31_ + 64))) >= 0.0) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                        break label$12;
                    }
                    this._storeDouble((_31_ + 16), (-3.141592653589793 / (((sinpi((this._loadDouble((_31_ + 48))))) * (this._loadDouble((_31_ + 48)))) * (this._loadDouble((_31_ + 16))))));
                    this._storeDouble((_31_ + 32), (-(this._loadDouble((_31_ + 32)))));
                    this._storeDouble((_31_ + 24), (-(this._loadDouble((_31_ + 24)))));
                }
                while (false);
                this._storeDouble((_31_ + 16), ((_30_ = this._loadDouble((_31_ + 16))) + ((_30_ * ((this._loadDouble((_31_ + 32))) * 6.02468004077673)) / (this._loadDouble((_31_ + 40))))));
                this._storeDouble((_31_ + 40), ((_30_ = this._storeDouble((_31_ + 24), (pow((this._loadDouble((_31_ + 40))), ((this._loadDouble((_31_ + 24))) * 0.5))))) * (_30_ * (this._loadDouble((_31_ + 16))))));
                this._storeDouble((_31_ + 72), (this._loadDouble((_31_ + 40))));
                break label$0;
            }
            while (false);
            this._storeLong((_31_ + 72), -9223372036854775808L);
        }
        while (false);
        _30_ = this._loadDouble((_31_ + 72));
        this._storeInt((0 + 4), (_31_ + 80));
        return _30_;
    }

    @Override()
    public final double S(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeLong((_31_ + 8), (this._storeLong((_31_ + 16), 0L)));
        label$0:
        do {
            label$1:
            do {
                if (((((_30_ = this._loadDouble((_31_ + 24))) >= 8.0) ? 1 : 0) | ((_30_ != _30_) ? 1 : 0)) != 0) {
                    break label$1;
                }
                this._storeInt((_31_ + 4), 12);
                label$2:
                while (true) {
                    if ((this._loadInt((_31_ + 4))) < 0) {
                        break label$0;
                    }
                    this._storeDouble((_31_ + 16), (((this._loadDouble((_31_ + 16))) * (this._loadDouble((_31_ + 24)))) + (this._loadDouble((((this._loadInt((_31_ + 4))) << 3) + 19440)))));
                    this._storeDouble((_31_ + 8), (((this._loadDouble((_31_ + 8))) * (this._loadDouble((_31_ + 24)))) + (this._loadDouble((((this._loadInt((_31_ + 4))) << 3) + 19552)))));
                    this._storeInt((_31_ + 4), ((this._loadInt((_31_ + 4))) + -1));
                    continue label$2;
                }
            }
            while (false);
            this._storeInt((_31_ + 4), 0);
            label$5:
            do {
                label$4:
                while (true) {
                    if ((this._loadInt((_31_ + 4))) > 12) {
                        break label$5;
                    }
                    this._storeDouble((_31_ + 16), (((this._loadDouble((_31_ + 16))) / (this._loadDouble((_31_ + 24)))) + (this._loadDouble((((this._loadInt((_31_ + 4))) << 3) + 19440)))));
                    this._storeDouble((_31_ + 8), (((this._loadDouble((_31_ + 8))) / (this._loadDouble((_31_ + 24)))) + (this._loadDouble((((this._loadInt((_31_ + 4))) << 3) + 19552)))));
                    this._storeInt((_31_ + 4), ((this._loadInt((_31_ + 4))) + 1));
                    continue label$4;
                }
            }
            while (false);
        }
        while (false);
        return ((this._loadDouble((_31_ + 16))) / (this._loadDouble((_31_ + 8))));
    }

    @Override()
    public final double sinpi(double _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _32_ = this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 12), (((this._storeInt((_31_ + 12), (_truncateDoubleToSignedInteger(((this._storeDouble((_31_ + 16), ((_30_ = (_30_ = this._storeDouble((_31_ + 16), ((this._storeDouble((_31_ + 16), _30_)) * 0.5))) - (Math.floor(_30_))) + _30_))) * 4.0))))) + 1) / 2));
        this._storeDouble((_31_ + 16), ((this._storeDouble((_31_ + 16), ((this._loadDouble((_31_ + 16))) - (((double) _32_) * 0.5)))) * 3.141592653589793));
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
    public final float tgammaf(float _30_)
    {
        int _31_ = 0;
        double _32_ = 0.0;
        _32_ = tgamma(((double) (this._storeFloat(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_))));
        this._storeInt((0 + 4), (_31_ + 16));
        return ((float) _32_);
    }

    @Override()
    public final void tgammal(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), (tgamma((this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_)))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int __tlsdesc_static()
    {
        return 0;
    }

    @Override()
    public final int tmpnam(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt8(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 144))) + 130), (this._loadInt8u((0 + 19682))));
        this._storeInt16((_32_ + 128), (this._loadInt16u((0 + 19680))));
        this._storeInt((_32_ + 136), _30_);
        this._storeInt((_32_ + 124), (this._loadInt((0 + 19676))));
        this._storeInt((_32_ + 120), (this._loadInt((0 + 19672))));
        this._storeInt((_32_ + 116), (this._loadInt((0 + 19668))));
        this._storeInt((_32_ + 112), (this._loadInt((0 + 19664))));
        _31_ = this._storeInt((_32_ + 108), 0);
        _33_ = (_32_ + 112) | 12;
        label$0:
        do {
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt((_32_ + 108))) > 99) {
                            break label$1;
                        }
                        this.__randname.invoke(_33_);
                        this._storeLong((_30_ = memset(_32_, _31_, 104)), 0L);
                        if ((this._storeInt((_30_ + 104), (this.__syscall2.invoke(107, (_30_ + 112), _30_)))) == -2) {
                            break label$3;
                        }
                        this._storeInt((_30_ + 108), ((this._loadInt((_30_ + 108))) + 1));
                        continue label$2;
                    }
                }
                while (false);
                _31_ = 19683;
                label$4:
                do {
                    if ((this._loadInt((_30_ + 136))) == 0) {
                        break label$4;
                    }
                    _31_ = this._loadInt((_30_ + 136));
                }
                while (false);
                this._storeInt((_30_ + 140), (strcpy(_31_, (_30_ + 112))));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 140), 0);
        }
        while (false);
        _30_ = this._loadInt((_32_ + 140));
        this._storeInt((0 + 4), (_32_ + 144));
        return _30_;
    }

    @Override()
    public final int toascii(int _30_)
    {
        return ((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) & 127);
    }

    @Override()
    public final int tolower(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), _30_)) + -65) & 4294967295L) > (25 & 4294967295L)) {
                break label$0;
            }
            this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 8))) | 32));
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        this._storeInt((_31_ + 12), (this._loadInt((_31_ + 8))));
        return (this._loadInt((_31_ + 12)));
    }

    @Override()
    public final int __tolower_l(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = tolower((this._loadInt((_32_ + 12))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int toupper(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if ((((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), _30_)) + -97) & 4294967295L) > (25 & 4294967295L)) {
                break label$0;
            }
            this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 8))) & 95));
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        this._storeInt((_31_ + 12), (this._loadInt((_31_ + 8))));
        return (this._loadInt((_31_ + 12)));
    }

    @Override()
    public final int __toupper_l(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = toupper((this._loadInt((_32_ + 12))));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int __tre_mem_new_impl(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_32_ + 8))) == 0) {
                    break label$1;
                }
                memset((this._storeInt(_32_, (this._loadInt((_32_ + 4))))), 0, 24);
                break label$0;
            }
            while (false);
            this._storeInt(_32_, (calloc(1, 24)));
        }
        while (false);
        label$2:
        do {
            label$3:
            do {
                if ((this._loadInt(_32_)) == 0) {
                    break label$3;
                }
                this._storeInt((_32_ + 12), (this._loadInt(_32_)));
                break label$2;
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
    public final void __tre_mem_destroy(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 4), (this._loadInt((this._storeInt((_31_ + 12), _30_)))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 4))) == 0) {
                    break label$1;
                }
                free((this._loadInt((this._loadInt((_31_ + 4))))));
                this._storeInt((_31_ + 8), (this._loadInt(((this._loadInt((_31_ + 4))) + 4))));
                free((this._loadInt((_31_ + 4))));
                this._storeInt((_31_ + 4), (this._loadInt((_31_ + 8))));
                continue label$0;
            }
        }
        while (false);
        free((this._loadInt((_31_ + 12))));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final int __tre_mem_alloc_impl(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_35_ + 36), _31_);
        this._storeInt((_35_ + 32), _32_);
        this._storeInt((_35_ + 28), _33_);
        this._storeInt((_35_ + 24), _34_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 40))) + 16))) == 0) {
                    break label$1;
                }
                this._storeInt((_35_ + 44), 0);
                break label$0;
            }
            while (false);
            label$2:
            do {
                label$3:
                do {
                    label$4:
                    do {
                        if (((this._loadInt(((this._loadInt((_35_ + 40))) + 12))) & 4294967295L) >= ((this._loadInt((_35_ + 24))) & 4294967295L)) {
                            break label$4;
                        }
                        label$5:
                        do {
                            label$6:
                            do {
                                label$7:
                                do {
                                    label$8:
                                    do {
                                        if ((this._loadInt((_35_ + 36))) == 0) {
                                            break label$8;
                                        }
                                        if ((this._loadInt((_35_ + 32))) == 0) {
                                            break label$7;
                                        }
                                        this._storeInt(((_34_ = this._loadInt((_35_ + 40))) + 12), 1024);
                                        this._storeInt((_34_ + 8), (this._loadInt((_35_ + 32))));
                                        break label$4;
                                    }
                                    while (false);
                                    if ((((this._loadInt((_35_ + 24))) << 3) & 4294967295L) < (1025 & 4294967295L)) {
                                        break label$6;
                                    }
                                    this._storeInt((_35_ + 12), ((this._loadInt((_35_ + 24))) << 3));
                                    break label$5;
                                }
                                while (false);
                                this._storeInt(((this._loadInt((_35_ + 40))) + 16), 1);
                                this._storeInt((_35_ + 44), 0);
                                break label$0;
                            }
                            while (false);
                            this._storeInt((_35_ + 12), 1024);
                        }
                        while (false);
                        if ((this._storeInt((_35_ + 16), (malloc(8)))) == 0) {
                            break label$3;
                        }
                        _34_ = malloc((this._loadInt((_35_ + 12))));
                        if ((this._storeInt((this._loadInt((_35_ + 16))), _34_)) == 0) {
                            break label$2;
                        }
                        this._storeInt(((this._loadInt((_35_ + 16))) + 4), 0);
                        label$9:
                        do {
                            if ((this._loadInt(((this._loadInt((_35_ + 40))) + 4))) == 0) {
                                break label$9;
                            }
                            this._storeInt(((this._loadInt(((this._loadInt((_35_ + 40))) + 4))) + 4), (this._loadInt((_35_ + 16))));
                        }
                        while (false);
                        label$10:
                        do {
                            if ((this._loadInt((this._loadInt((_35_ + 40))))) != 0) {
                                break label$10;
                            }
                            this._storeInt((this._loadInt((_35_ + 40))), (this._loadInt((_35_ + 16))));
                        }
                        while (false);
                        this._storeInt(((_34_ = this._loadInt((_35_ + 40))) + 8), (this._loadInt((this._storeInt((_34_ + 4), (this._loadInt((_35_ + 16))))))));
                        this._storeInt(((this._loadInt((_35_ + 40))) + 12), (this._loadInt((_35_ + 12))));
                    }
                    while (false);
                    _34_ = 0;
                    label$11:
                    do {
                        if ((((this._loadInt(((this._loadInt((_35_ + 40))) + 8))) + (this._loadInt((_35_ + 24)))) & 3) == 0) {
                            break label$11;
                        }
                        _34_ = 4 - (((this._loadInt(((this._loadInt((_35_ + 40))) + 8))) + (this._loadInt((_35_ + 24)))) & 3);
                    }
                    while (false);
                    this._storeInt((_35_ + 24), ((this._loadInt((_35_ + 24))) + _34_));
                    this._storeInt((_35_ + 20), (this._loadInt(((this._loadInt((_35_ + 40))) + 8))));
                    this._storeInt(((_34_ = this._loadInt((_35_ + 40))) + 8), ((this._loadInt((_34_ + 8))) + (_33_ = this._loadInt((_35_ + 24)))));
                    this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 12))) - _33_));
                    label$12:
                    do {
                        if ((this._loadInt((_35_ + 28))) == 0) {
                            break label$12;
                        }
                        memset((this._loadInt((_35_ + 20))), 0, (this._loadInt((_35_ + 24))));
                    }
                    while (false);
                    this._storeInt((_35_ + 44), (this._loadInt((_35_ + 20))));
                    break label$0;
                }
                while (false);
                this._storeInt(((this._loadInt((_35_ + 40))) + 16), 1);
                this._storeInt((_35_ + 44), 0);
                break label$0;
            }
            while (false);
            free((this._loadInt((_35_ + 16))));
            this._storeInt(((this._loadInt((_35_ + 40))) + 16), 1);
            this._storeInt((_35_ + 44), 0);
        }
        while (false);
        _34_ = this._loadInt((_35_ + 44));
        this._storeInt((0 + 4), (_35_ + 48));
        return _34_;
    }

    @Override()
    public final double trunc(double _30_)
    {
        int _31_ = 0;
        this._storeDouble(((_31_ = (this._loadInt((0 + 4))) - 48) + 24), (this._storeDouble((_31_ + 32), _30_)));
        label$0:
        do {
            if ((this._storeInt((_31_ + 20), (((int) (((this._loadLong((_31_ + 24))) >>> 52L) & 2047L)) + -1011))) < 64) {
                break label$0;
            }
            this._storeDouble((_31_ + 40), (this._loadDouble((_31_ + 32))));
            return (this._loadDouble((_31_ + 40)));
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_31_ + 20))) > 11) {
                break label$1;
            }
            this._storeInt((_31_ + 20), 1);
        }
        while (false);
        label$2:
        do {
            if (((this._storeLong((_31_ + 8), (-1L >>> (this._loadLong32u((_31_ + 20)))))) & (this._loadLong((_31_ + 24)))) == 0L) {
                break label$2;
            }
            this._storeDouble(_31_, ((this._loadDouble((_31_ + 32))) + 1.3292279957849159E36));
            this._storeLong((_31_ + 24), ((this._loadLong((_31_ + 24))) & ((this._loadLong((_31_ + 8))) ^ -1L)));
            this._storeDouble((_31_ + 40), (this._loadDouble((_31_ + 24))));
            return (this._loadDouble((_31_ + 40)));
        }
        while (false);
        this._storeDouble((_31_ + 40), (this._loadDouble((_31_ + 32))));
        return (this._loadDouble((_31_ + 40)));
    }

    @Override()
    public final int truncate(int _30_, long _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeLong((_32_ + 16), _31_);
        _30_ = this._loadInt((_32_ + 28));
        this._storeLong((_32_ + 8), _31_);
        _33_ = this._loadInt((_32_ + 8));
        this._storeLong(_32_, (this._loadLong((_32_ + 16))));
        _30_ = __syscall_ret((this.__syscall4.invoke(92, _30_, 0, _33_, (this._loadInt((_32_ + 4))))));
        this._storeInt((0 + 4), (_32_ + 32));
        return _30_;
    }

    @Override()
    public final float truncf(float _30_)
    {
        int _31_ = 0;
        this._storeFloat(((_31_ = (this._loadInt((0 + 4))) - 32) + 16), (this._storeFloat((_31_ + 24), _30_)));
        label$0:
        do {
            if ((this._storeInt((_31_ + 12), ((((this._loadInt((_31_ + 16))) >>> 23) & 255) + -118))) < 32) {
                break label$0;
            }
            this._storeFloat((_31_ + 28), (this._loadFloat((_31_ + 24))));
            return (this._loadFloat((_31_ + 28)));
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt((_31_ + 12))) > 8) {
                break label$1;
            }
            this._storeInt((_31_ + 12), 1);
        }
        while (false);
        label$2:
        do {
            if (((this._storeInt((_31_ + 8), (-1 >>> (this._loadInt((_31_ + 12)))))) & (this._loadInt((_31_ + 16)))) == 0) {
                break label$2;
            }
            this._storeFloat((_31_ + 4), ((this._loadFloat((_31_ + 24))) + 1.329228E36f));
            this._storeInt((_31_ + 16), ((this._loadInt((_31_ + 16))) & ((this._loadInt((_31_ + 8))) ^ -1)));
            this._storeFloat((_31_ + 28), (this._loadFloat((_31_ + 16))));
            return (this._loadFloat((_31_ + 28)));
        }
        while (false);
        this._storeFloat((_31_ + 28), (this._loadFloat((_31_ + 24))));
        return (this._loadFloat((_31_ + 28)));
    }

    @Override()
    public final void truncl(int _30_, long _31_, long _32_)
    {
        int _33_ = 0;
        this.__extenddftf2.invoke((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))), ((long) (this.__trunctfdf2.invoke((this._storeLong((_33_ + 16), _31_)), (this._storeLong((_33_ + 24), _32_))))));
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, (this._loadLong(_33_)));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int ttyname(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 4), (ttyname_r((this._storeInt((_31_ + 8), _30_)), 19703, 32)))) == 0) {
                    break label$1;
                }
                _30_ = this._loadInt((_31_ + 4));
                this._storeInt((__errno_location()), _30_);
                this._storeInt((_31_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 12), 19703);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int ttyname_r(int _30_, int _31_, int _32_)
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
                        if ((isatty((this._loadInt((_33_ + 56))))) == 0) {
                            break label$3;
                        }
                        __procfdname((_33_ + 16), (this._loadInt((_33_ + 56))));
                        if ((this._storeInt((_33_ + 12), (readlink((_33_ + 16), (this._loadInt((_33_ + 52))), (this._loadInt((_33_ + 48))))))) <= -1) {
                            break label$2;
                        }
                        if ((this._loadInt((_33_ + 12))) != (this._loadInt((_33_ + 48)))) {
                            break label$1;
                        }
                        this._storeInt((_33_ + 60), 34);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_33_ + 60), 25);
                    break label$0;
                }
                while (false);
                this._storeInt((_33_ + 60), (this._loadInt((__errno_location()))));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 60), (this._storeInt8(((this._loadInt((_33_ + 52))) + (this._loadInt((_33_ + 12)))), 0)));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 60));
        this._storeInt((0 + 4), (_33_ + 64));
        return _32_;
    }

    @Override()
    public final int ualarm(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        _31_ = this._storeInt((_32_ + 16), (this._storeInt((_32_ + 8), 0)));
        this._storeInt((_32_ + 12), (this._loadInt((_32_ + 24))));
        this._storeInt((_30_ = _32_ + 20), (this._loadInt((_32_ + 28))));
        this.setitimer.invoke(_31_, (_32_ + 8), (_32_ + 8));
        _31_ = this._loadInt((_32_ + 16));
        _30_ = this._loadInt(_30_);
        this._storeInt((0 + 4), (_32_ + 32));
        return (_30_ + (_31_ * 1000000));
    }

    @Override()
    public final int ungetc(int _30_, int _31_)
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
                    if ((this._loadInt((_32_ + 8))) == -1) {
                        break label$2;
                    }
                    _31_ = 0;
                    label$3:
                    do {
                        if ((this._loadInt(((this._loadInt((_32_ + 4))) + 76))) < 0) {
                            break label$3;
                        }
                        _31_ = this.__lockfile.invoke((this._loadInt((_32_ + 4))));
                    }
                    while (false);
                    this._storeInt(_32_, _31_);
                    label$4:
                    do {
                        if ((this._loadInt(((this._loadInt((_32_ + 4))) + 4))) != 0) {
                            break label$4;
                        }
                        __toread((this._loadInt((_32_ + 4))));
                    }
                    while (false);
                    label$5:
                    do {
                        if ((this._loadInt(((this._loadInt((_32_ + 4))) + 4))) == 0) {
                            break label$5;
                        }
                        if (((this._loadInt(((_31_ = this._loadInt((_32_ + 4))) + 4))) & 4294967295L) > (((this._loadInt((_31_ + 44))) + -8) & 4294967295L)) {
                            break label$1;
                        }
                    }
                    while (false);
                    label$6:
                    do {
                        if ((this._loadInt(_32_)) == 0) {
                            break label$6;
                        }
                        this.__unlockfile.invoke((this._loadInt((_32_ + 4))));
                    }
                    while (false);
                    this._storeInt((_32_ + 12), -1);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 12), (this._loadInt((_32_ + 8))));
                break label$0;
            }
            while (false);
            this._storeInt8((this._storeInt(((_31_ = this._loadInt((_32_ + 4))) + 4), ((this._loadInt((_31_ + 4))) + -1))), (this._loadInt((_32_ + 8))));
            this._storeInt(_31_, ((this._loadInt(_31_)) & -17));
            label$7:
            do {
                if ((this._loadInt(_32_)) == 0) {
                    break label$7;
                }
                this.__unlockfile.invoke((this._loadInt((_32_ + 4))));
            }
            while (false);
            this._storeInt((_32_ + 12), (this._loadInt((_32_ + 8))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int unlink(int _30_)
    {
        int _31_ = 0;
        _30_ = __syscall_ret((this.__syscall1.invoke(10, (this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_)))));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int unlinkat(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = __syscall_ret((this.__syscall3.invoke(301, (this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_)));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int unsetenv(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        int _33_ = 0;
        int _34_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 12), (strlen((this._storeInt((_31_ + 24), _30_)))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt8u((this._loadInt((_31_ + 24))))) == 0) {
                        break label$2;
                    }
                    if ((strchr((this._loadInt((_31_ + 24))), 61)) == 0) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((__errno_location()), 22);
                this._storeInt((_31_ + 28), -1);
                break label$0;
            }
            while (false);
            label$4:
            do {
                label$3:
                while (true) {
                    _30_ = this._storeInt((_31_ + 20), 0);
                    label$6:
                    do {
                        label$5:
                        while (true) {
                            _34_ = 0;
                            label$7:
                            do {
                                if ((this._loadInt(((this._loadInt((0 + 3912))) + ((this._loadInt((_31_ + 20))) << 2)))) == 0) {
                                    break label$7;
                                }
                                _34_ = 1;
                                if ((memcmp((this._loadInt((_31_ + 24))), (this._loadInt(((this._loadInt((_30_ + 3912))) + ((this._loadInt((_31_ + 20))) << 2)))), (this._loadInt((_31_ + 12))))) != 0) {
                                    break label$7;
                                }
                                _34_ = ((this._loadInt8s(((this._loadInt(((this._loadInt((_30_ + 3912))) + ((this._loadInt((_31_ + 20))) << 2)))) + (this._loadInt((_31_ + 12)))))) != 61) ? 1 : 0;
                            }
                            while (false);
                            if (_34_ == 0) {
                                break label$6;
                            }
                            this._storeInt((_31_ + 20), ((this._loadInt((_31_ + 20))) + 1));
                            continue label$5;
                        }
                    }
                    while (false);
                    if ((this._loadInt(((this._loadInt((_30_ + 3912))) + ((this._loadInt((_31_ + 20))) << 2)))) == 0) {
                        break label$4;
                    }
                    label$8:
                    do {
                        if ((this._loadInt((_30_ + 14288))) == 0) {
                            break label$8;
                        }
                        _34_ = this._storeInt((_31_ + 16), _30_);
                        label$10:
                        do {
                            label$9:
                            while (true) {
                                _32_ = 0;
                                label$11:
                                do {
                                    if ((this._loadInt(((this._loadInt((0 + 14288))) + ((this._loadInt((_31_ + 16))) << 2)))) == 0) {
                                        break label$11;
                                    }
                                    _32_ = ((this._loadInt(((this._loadInt((_34_ + 14288))) + ((this._loadInt((_31_ + 16))) << 2)))) != (this._loadInt(((this._loadInt((_34_ + 3912))) + ((this._loadInt((_31_ + 20))) << 2))))) ? 1 : 0;
                                }
                                while (false);
                                if (_32_ == 0) {
                                    break label$10;
                                }
                                this._storeInt((_31_ + 16), ((this._loadInt((_31_ + 16))) + 1));
                                continue label$9;
                            }
                        }
                        while (false);
                        free((this._loadInt(((this._loadInt((_34_ + 14288))) + ((this._loadInt((_31_ + 16))) << 2)))));
                        label$13:
                        do {
                            label$12:
                            while (true) {
                                if ((this._loadInt(((this._loadInt((_34_ + 14288))) + ((this._loadInt((_31_ + 16))) << 2)))) == 0) {
                                    break label$13;
                                }
                                this._storeInt(((_32_ = this._loadInt((_34_ + 14288))) + ((_33_ = this._loadInt((_31_ + 16))) << 2)), (this._loadInt((_32_ + ((this._storeInt((_31_ + 16), (_33_ + 1))) << 2)))));
                                continue label$12;
                            }
                        }
                        while (false);
                    }
                    while (false);
                    label$14:
                    while (true) {
                        if ((this._loadInt(((this._loadInt((_30_ + 3912))) + ((this._loadInt((_31_ + 20))) << 2)))) == 0) {
                            continue label$3;
                        }
                        this._storeInt(((_34_ = this._loadInt((_30_ + 3912))) + ((_32_ = this._loadInt((_31_ + 20))) << 2)), (this._loadInt((_34_ + ((this._storeInt((_31_ + 20), (_32_ + 1))) << 2)))));
                        continue label$14;
                    }
                }
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
    public final int usleep(int _30_)
    {
        int _31_ = 0;
        this._storeInt((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))), ((this._storeInt((_31_ + 12), _30_)) / 1000000));
        this._storeInt((_31_ + 4), (((this._loadInt((_31_ + 12))) % 1000000) * 1000));
        _30_ = this.nanosleep.invoke(_31_, _31_);
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final int vasprintf(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        _32_ = this._storeInt((_33_ + 12), (this._storeInt((_33_ + 16), _32_)));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_33_ + 8), (this.vsnprintf.invoke(0, 0, (this._loadInt((_33_ + 20))), _32_)))) < 0) {
                    break label$1;
                }
                _32_ = malloc(((this._loadInt((_33_ + 8))) + 1));
                if ((this._storeInt((this._loadInt((_33_ + 24))), _32_)) == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 28), (this.vsnprintf.invoke((this._loadInt((this._loadInt((_33_ + 24))))), ((this._loadInt((_33_ + 8))) + 1), (this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))))));
                break label$0;
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
    public final int __libc_get_version()
    {
        return 19744;
    }

    @Override()
    public final int vprintf(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this.vfprintf.invoke((this._loadInt((0 + 16116))), (this._loadInt((_32_ + 12))), _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int vscanf(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this.vfscanf.invoke((this._loadInt((0 + 14932))), (this._loadInt((_32_ + 12))), _31_);
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int vsprintf(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = this.vsnprintf.invoke((this._loadInt((_33_ + 12))), 2147483647, (this._loadInt((_33_ + 8))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int vsscanf(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 160))) + 156), _30_);
        this._storeInt((_33_ + 152), _31_);
        this._storeInt((_33_ + 148), _32_);
        this._storeInt(((_33_ = memset(_33_, 0, 144)) + 32), 10);
        this._storeInt((_33_ + 76), -1);
        this._storeInt((_33_ + 84), (this._storeInt((_33_ + 44), (this._loadInt((_33_ + 156))))));
        _32_ = this.vfscanf.invoke(_33_, (this._loadInt((_33_ + 152))), (this._loadInt((_33_ + 148))));
        this._storeInt((0 + 4), (_33_ + 160));
        return _32_;
    }

    @Override()
    public final int do_read(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = __string_read((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final float wcstof(int _30_, int _31_)
    {
        int _32_ = 0;
        float _33_ = 0.0f;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        wcstox(_32_, (this._loadInt((_32_ + 28))), _31_, 0);
        _33_ = this.__trunctfsf2.invoke((this._loadLong(_32_)), (this._loadLong((_32_ + 8))));
        this._storeInt((0 + 4), (_32_ + 32));
        return _33_;
    }

    @Override()
    public final void wcstox(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 272))) + 268), _31_);
        this._storeInt((_34_ + 264), _32_);
        this._storeInt((_34_ + 260), _33_);
        this._storeInt((_34_ + 256), (this._loadInt((_34_ + 268))));
        memset((_34_ + 48), 0, 144);
        this._storeInt((_34_ + 56), 0);
        this._storeLong((_34_ + 48), 0L);
        this._storeInt((_34_ + 92), ((_34_ + 192) | 4));
        this._storeInt((_34_ + 96), 60);
        this._storeInt((_34_ + 124), -1);
        this._storeInt((_34_ + 80), 11);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this.iswspace.invoke((this._loadInt((this._loadInt((_34_ + 256))))))) == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 256), ((this._loadInt((_34_ + 256))) + 4));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((_34_ + 132), (this._loadInt((_34_ + 256))));
        __shlim((_34_ + 48), 0L);
        this.__floatscan.invoke(_34_, (_34_ + 48), (this._loadInt((_34_ + 260))), 1);
        this._storeLong((_34_ + 32), (this._loadLong(_34_)));
        this._storeLong((_34_ + 40), (this._loadLong((_34_ + 8))));
        label$2:
        do {
            if ((this._loadInt((_34_ + 264))) == 0) {
                break label$2;
            }
            label$3:
            do {
                label$4:
                do {
                    if ((this._storeInt((_34_ + 28), ((int) ((this._loadLong((_34_ + 168))) + (((this._loadInt((_34_ + 52))) - (this._loadInt((_34_ + 56)))) & 4294967295L))))) == 0) {
                        break label$4;
                    }
                    _33_ = (this._loadInt((_34_ + 256))) + ((this._loadInt((_34_ + 28))) << 2);
                    break label$3;
                }
                while (false);
                _33_ = this._loadInt((_34_ + 268));
            }
            while (false);
            this._storeInt((this._loadInt((_34_ + 264))), _33_);
        }
        while (false);
        this._storeLong(_30_, (this._loadLong((_34_ + 32))));
        this._storeLong((_30_ + 8), (this._loadLong((_34_ + 40))));
        this._storeInt((0 + 4), (_34_ + 272));
        return;
    }

    @Override()
    public final int do_read$2e$314(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = (this._loadInt((0 + 4))) - 32) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        this._storeInt((_33_ + 16), _32_);
        label$0:
        do {
            if ((this._loadInt((this._storeInt((_33_ + 8), (this._loadInt(((this._loadInt((_33_ + 24))) + 84))))))) != 0) {
                break label$0;
            }
            this._storeInt((_33_ + 8), 19748);
        }
        while (false);
        _30_ = this._storeInt((_33_ + 12), 0);
        label$2:
        do {
            label$1:
            while (true) {
                _32_ = 0;
                label$3:
                do {
                    if (((this._loadInt((_33_ + 12))) & 4294967295L) >= ((this._loadInt(((this._loadInt((_33_ + 24))) + 48))) & 4294967295L)) {
                        break label$3;
                    }
                    _32_ = ((this._loadInt(((this._loadInt((_33_ + 8))) + ((this._loadInt((_33_ + 12))) << 2)))) != _30_) ? 1 : 0;
                }
                while (false);
                if (_32_ == 0) {
                    break label$2;
                }
                _32_ = 64;
                label$4:
                do {
                    if (((this._loadInt(((this._loadInt((_33_ + 8))) + ((this._loadInt((_33_ + 12))) << 2)))) & 4294967295L) > (127 & 4294967295L)) {
                        break label$4;
                    }
                    _32_ = this._loadInt(((this._loadInt((_33_ + 8))) + ((this._loadInt((_33_ + 12))) << 2)));
                }
                while (false);
                this._storeInt8(((this._loadInt(((this._loadInt((_33_ + 24))) + 44))) + (_31_ = this._loadInt((_33_ + 12)))), _32_);
                this._storeInt((_33_ + 12), (_31_ + 1));
                continue label$1;
            }
        }
        while (false);
        this._storeInt(((_32_ = this._loadInt((_33_ + 24))) + 8), ((this._storeInt((_32_ + 4), (this._loadInt((_32_ + 44))))) + (this._loadInt((_33_ + 12)))));
        this._storeInt(((this._loadInt((_33_ + 24))) + 84), ((this._loadInt((_33_ + 8))) + ((this._loadInt((_33_ + 12))) << 2)));
        label$5:
        do {
            if ((this._loadInt((_33_ + 12))) == 0) {
                break label$5;
            }
            if ((this._loadInt((_33_ + 16))) == 0) {
                break label$5;
            }
            _32_ = this._loadInt((_33_ + 20));
            this._storeInt(((_31_ = this._loadInt((_33_ + 24))) + 4), ((this._storeInt((_33_ + 28), 1)) + (_31_ = this._loadInt((_31_ + 4)))));
            this._storeInt8(_32_, (this._loadInt8u(_31_)));
            return (this._loadInt((_33_ + 28)));
        }
        while (false);
        this._storeInt((_33_ + 28), 0);
        return (this._loadInt((_33_ + 28)));
    }

    @Override()
    public final double wcstod(int _30_, int _31_)
    {
        int _32_ = 0;
        double _33_ = 0.0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        wcstox(_32_, (this._loadInt((_32_ + 28))), _31_, 1);
        _33_ = this.__trunctfdf2.invoke((this._loadLong(_32_)), (this._loadLong((_32_ + 8))));
        this._storeInt((0 + 4), (_32_ + 32));
        return _33_;
    }

    @Override()
    public final void wcstold(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        long _34_ = 0L;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _31_);
        this._storeInt((_33_ + 24), _32_);
        wcstox(_33_, (this._loadInt((_33_ + 28))), _32_, 2);
        _34_ = this._loadLong(_33_);
        this._storeLong((_30_ + 8), (this._loadLong((_33_ + 8))));
        this._storeLong(_30_, _34_);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }
}
