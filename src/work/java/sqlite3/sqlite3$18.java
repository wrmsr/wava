package sqlite3;

abstract class sqlite3$18
        extends sqlite3$17
{
    protected sqlite3$18(Imports imports)
    {
        super(imports);
    }

    @Override()
    public final int sqlite3ExprCollSeq(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 20), 0);
        this._storeInt((_32_ + 16), (this._loadInt((_32_ + 24))));
        label$0:
        do {
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 16))) == 0) {
                        break label$0;
                    }
                    if ((this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 16))) + 20))))) != 0) {
                        break label$0;
                    }
                    this._storeInt((_32_ + 12), (this._loadInt8u((this._loadInt((_32_ + 16))))));
                    label$3:
                    do {
                        if ((this._loadInt(((this._loadInt((_32_ + 16))) + 40))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt((_32_ + 12))) == 154) {
                            break label$2;
                        }
                        if ((this._loadInt((_32_ + 12))) == 152) {
                            break label$2;
                        }
                        if ((this._loadInt((_32_ + 12))) == 132) {
                            break label$2;
                        }
                        if ((this._loadInt((_32_ + 12))) == 60) {
                            break label$2;
                        }
                    }
                    while (false);
                    label$4:
                    do {
                        if ((this._loadInt((_32_ + 12))) == 37) {
                            break label$4;
                        }
                        if ((this._loadInt((_32_ + 12))) != 157) {
                            break label$0;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt((_32_ + 16))) + 8))));
                    continue label$1;
                }
            }
            while (false);
            if ((this._storeInt((_32_ + 4), (this._loadInt16s(((this._loadInt((_32_ + 16))) + 28))))) < 0) {
                break label$0;
            }
            this._storeInt(_32_, (this._loadInt((this._loadInt((_32_ + 28))))));
            _31_ = this._storeInt((_32_ + 8), (this._loadInt((((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 16))) + 40))) + 12))) + ((this._loadInt((_32_ + 4))) * 24)) + 16))));
            _31_ = this._storeInt((_32_ + 20), (sqlite3FindCollSeq((_30_ = this._loadInt(_32_)), (this._loadInt8u(((this._loadInt(((this._loadInt((_30_ + 8))) + 12))) + 77))), _31_, 0)));
            this._storeInt(((this._loadInt((_32_ + 24))) + 20), _31_);
        }
        while (false);
        label$5:
        do {
            if ((sqlite3CheckCollSeq((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 20))))) == 0) {
                break label$5;
            }
            this._storeInt((_32_ + 20), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 20));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int sqlite3CheckCollSeq(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._storeInt((_32_ + 20), _31_)) == 0) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 16), (this._loadInt((this._loadInt((_32_ + 20))))));
                    if ((this._storeInt((_32_ + 8), (sqlite3GetCollSeq((_31_ = this._storeInt((_32_ + 12), (this._loadInt((this._loadInt((_32_ + 24))))))), (this._loadInt8u(((this._loadInt(((this._loadInt((_31_ + 8))) + 12))) + 77))), (this._loadInt((_32_ + 20))), (this._loadInt((_32_ + 16))))))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            _31_ = this._loadInt((_32_ + 24));
            this._storeInt(_32_, (this._loadInt((_32_ + 16))));
            sqlite3ErrorMsg(_31_, 39824, _32_);
            this._storeInt(((_31_ = this._loadInt((_32_ + 24))) + 64), ((this._storeInt((_32_ + 28), 1)) + (this._loadInt((_31_ + 64)))));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int sqlite3GetCollSeq(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt8((_34_ + 27), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        label$0:
        do {
            if ((this._storeInt((_34_ + 12), (this._loadInt((_34_ + 20))))) != 0) {
                break label$0;
            }
            this._storeInt((_34_ + 12), (sqlite3FindCollSeq((this._loadInt((_34_ + 28))), (this._loadInt8u((_34_ + 27))), (this._loadInt((_34_ + 16))), 0)));
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                if ((this._loadInt((_34_ + 12))) == 0) {
                    break label$2;
                }
                if ((this._loadInt(((this._loadInt((_34_ + 12))) + 12))) != 0) {
                    break label$1;
                }
            }
            while (false);
            callCollNeeded((this._loadInt((_34_ + 28))), (this._loadInt8u((_34_ + 27))), (this._loadInt((_34_ + 16))));
            this._storeInt((_34_ + 12), (sqlite3FindCollSeq((this._loadInt((_34_ + 28))), (this._loadInt8u((_34_ + 27))), (this._loadInt((_34_ + 16))), 0)));
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt((_34_ + 12))) == 0) {
                break label$3;
            }
            if ((this._loadInt(((this._loadInt((_34_ + 12))) + 12))) != 0) {
                break label$3;
            }
            if ((synthCollSeq((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 12))))) == 0) {
                break label$3;
            }
            this._storeInt((_34_ + 12), 0);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 12));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final void callCollNeeded(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_33_ + 28))) + 200))) == 0) {
                    break label$1;
                }
                if ((this._storeInt((_33_ + 16), (sqlite3DbStrDup((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 20))))))) == 0) {
                    break label$0;
                }
                this._viiiiTable[this._tableIndices[this._loadInt(((_32_ = this._loadInt((_33_ + 28))) + 200))]].invoke((this._loadInt((_32_ + 208))), _32_, (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 16))));
                sqlite3DbFree((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 16))));
            }
            while (false);
            if ((this._loadInt(((this._loadInt((_33_ + 28))) + 204))) == 0) {
                break label$0;
            }
            sqlite3ValueSetStr((this._storeInt((_33_ + 8), (sqlite3ValueNew((this._loadInt((_33_ + 28))))))), -1, (this._loadInt((_33_ + 20))), 1, 0);
            label$2:
            do {
                _temp$0 = 2;
                _temp$1 = 3;
                _temp$2 = ((this._loadInt8s((0 + 29180))) != 0) ? _temp$0 : _temp$1;
                _temp$2 = sqlite3ValueText((this._loadInt((_33_ + 8))), _temp$2);
                _temp$2 = this._storeInt((_33_ + 12), _temp$2);
                _temp$2 = (_temp$2 == 0) ? 1 : 0;
                if (_temp$2 != 0) {
                    break label$2;
                }
                this._viiiiTable[this._tableIndices[this._loadInt(((_32_ = this._loadInt((_33_ + 28))) + 204))]].invoke((this._loadInt((_32_ + 208))), _32_, (this._loadInt8u(((this._loadInt(((this._loadInt((_32_ + 8))) + 12))) + 77))), (this._loadInt((_33_ + 12))));
            }
            while (false);
            sqlite3ValueFree((this._loadInt((_33_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int synthCollSeq(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 12), (this._loadInt((this._storeInt((_32_ + 20), _31_)))));
        _31_ = this._storeInt((_32_ + 8), 0);
        label$0:
        do {
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt((_32_ + 8))) > 2) {
                            break label$1;
                        }
                        if ((this._loadInt(((this._storeInt((_32_ + 16), (sqlite3FindCollSeq((this._loadInt((_32_ + 24))), (this._loadInt8u(((this._loadInt((_32_ + 8))) + 39856))), (this._loadInt((_32_ + 12))), _31_)))) + 12))) != 0) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) + 1));
                        continue label$2;
                    }
                }
                while (false);
                memcpy((this._loadInt((_32_ + 20))), (this._loadInt((_32_ + 16))), 20);
                this._storeInt((_32_ + 28), (this._storeInt(((this._loadInt((_32_ + 20))) + 16), 0)));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 28), 1);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int sqlite3AffinityType(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_31_ + 8), 0);
        _30_ = this._storeInt8((_31_ + 7), 99);
        label$0:
        do {
            if ((this._loadInt((_31_ + 12))) == 0) {
                break label$0;
            }
            label$1$end:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt8u((this._loadInt((_31_ + 12))))) == 0) {
                        break label$0;
                    }
                    this._storeInt((_31_ + 8), (((this._loadInt((_31_ + 8))) << 8) | (this._loadInt8u(((this._loadInt8u((this._loadInt((_31_ + 12))))) + 19872)))));
                    this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 12))) + 1));
                    label$3:
                    do {
                        if ((this._loadInt((_31_ + 8))) != 1667785074) {
                            break label$3;
                        }
                        this._storeInt8((_31_ + 7), 97);
                        continue label$1;
                    }
                    while (false);
                    label$4:
                    do {
                        if ((this._loadInt((_31_ + 8))) != 1668050786) {
                            break label$4;
                        }
                        this._storeInt8((_31_ + 7), 97);
                        continue label$1;
                    }
                    while (false);
                    label$5:
                    do {
                        if ((this._loadInt((_31_ + 8))) != 1952807028) {
                            break label$5;
                        }
                        this._storeInt8((_31_ + 7), 97);
                        continue label$1;
                    }
                    while (false);
                    label$6:
                    do {
                        if ((this._loadInt((_31_ + 8))) != 1651273570) {
                            break label$6;
                        }
                        label$7:
                        do {
                            if ((this._loadInt8s((_31_ + 7))) == _30_) {
                                break label$7;
                            }
                            if ((this._loadInt8s((_31_ + 7))) != 101) {
                                break label$6;
                            }
                        }
                        while (false);
                        this._storeInt8((_31_ + 7), 98);
                        continue label$1;
                    }
                    while (false);
                    label$8:
                    do {
                        if ((this._loadInt((_31_ + 8))) != 1919246700) {
                            break label$8;
                        }
                        if ((this._loadInt8s((_31_ + 7))) != _30_) {
                            break label$8;
                        }
                        this._storeInt8((_31_ + 7), 101);
                        continue label$1;
                    }
                    while (false);
                    label$9:
                    do {
                        if ((this._loadInt((_31_ + 8))) != 1718382433) {
                            break label$9;
                        }
                        if ((this._loadInt8s((_31_ + 7))) != _30_) {
                            break label$9;
                        }
                        this._storeInt8((_31_ + 7), 101);
                        continue label$1;
                    }
                    while (false);
                    label$10:
                    do {
                        if ((this._loadInt((_31_ + 8))) != 1685026146) {
                            break label$10;
                        }
                        if ((this._loadInt8s((_31_ + 7))) != _30_) {
                            break label$10;
                        }
                        this._storeInt8((_31_ + 7), 101);
                        continue label$1;
                    }
                    while (false);
                    if (((this._loadInt((_31_ + 8))) & 16777215) != 6909556) {
                        continue label$1;
                    }
                    break label$1$end;
                }
            }
            while (false);
            this._storeInt8((_31_ + 7), 100);
        }
        while (false);
        return (this._loadInt8s((_31_ + 7)));
    }

    @Override()
    public final void sqlite3SelectExpand(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 8), 35);
        this._storeInt((_32_ + 12), 36);
        this._storeInt((_32_ + 16), (this._loadInt((_32_ + 28))));
        sqlite3WalkSelect((_32_ + 8), (this._loadInt((_32_ + 24))));
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final void sqlite3ResolveSelectNames(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt(_33_, 37);
        this._storeInt((_33_ + 4), 38);
        this._storeInt((_33_ + 8), (this._loadInt((_33_ + 28))));
        this._storeInt((_33_ + 12), (this._loadInt((_33_ + 20))));
        sqlite3WalkSelect(_33_, (this._loadInt((_33_ + 24))));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void sqlite3SelectAddTypeInfo(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 8), 35);
        this._storeInt((_32_ + 12), 39);
        this._storeInt((_32_ + 16), (this._loadInt((_32_ + 28))));
        sqlite3WalkSelect((_32_ + 8), (this._loadInt((_32_ + 24))));
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final int selectAddSubqueryTypeInfo(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        label$0:
        do {
            if (((this._loadInt16u(((this._storeInt((_32_ + 24), _31_)) + 6))) & 32) != 0) {
                break label$0;
            }
            this._storeInt16(((_31_ = this._loadInt((_32_ + 24))) + 6), ((this._loadInt16u((_31_ + 6))) | 32));
            this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 28))) + 8))));
            this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 24))) + 8))));
            this._storeInt((_32_ + 16), 0);
            this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 12))) + 8));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 16))) >= (this._loadInt16s((this._loadInt((_32_ + 12)))))) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if ((this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 8))) + 12))))) == 0) {
                            break label$3;
                        }
                        if (((this._loadInt8u(((this._loadInt((_32_ + 4))) + 34))) & 2) == 0) {
                            break label$3;
                        }
                        this._storeInt(_32_, (this._loadInt(((this._loadInt((_32_ + 8))) + 16))));
                        label$5:
                        do {
                            label$4:
                            while (true) {
                                if ((this._loadInt(((this._loadInt(_32_)) + 28))) == 0) {
                                    break label$5;
                                }
                                this._storeInt(_32_, (this._loadInt(((this._loadInt(_32_)) + 28))));
                                continue label$4;
                            }
                        }
                        while (false);
                        selectAddColumnTypeAndCollation((this._loadInt((_32_ + 20))), (this._loadInt(((_31_ = this._loadInt((_32_ + 4))) + 8))), (this._loadInt((_31_ + 12))), (this._loadInt(_32_)));
                    }
                    while (false);
                    this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                    this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) + 56));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 32));
        return 0;
    }

    @Override()
    public final int exprWalkNoop(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        return 0;
    }

    @Override()
    public final int sqlite3WalkSelect(int _30_, int _31_)
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
                        if ((this._storeInt((_32_ + 4), _31_)) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt(((this._loadInt((_32_ + 8))) + 4))) == 0) {
                            break label$3;
                        }
                        this._storeInt(_32_, 0);
                        label$5:
                        do {
                            label$4:
                            while (true) {
                                if ((this._loadInt((_32_ + 4))) == 0) {
                                    break label$2;
                                }
                                if ((this._storeInt(_32_, (this._iiiTable[this._tableIndices[this._loadInt(((_31_ = this._loadInt((_32_ + 8))) + 4))]].invoke(_31_, (this._loadInt((_32_ + 4))))))) != 0) {
                                    break label$2;
                                }
                                if ((sqlite3WalkSelectExpr((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))))) != 0) {
                                    break label$1;
                                }
                                if ((sqlite3WalkSelectFrom((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))))) != 0) {
                                    break label$5;
                                }
                                this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 4))) + 28))));
                                continue label$4;
                            }
                        }
                        while (false);
                        this._storeInt((_32_ + 12), 2);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_32_ + 12), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 12), ((this._loadInt(_32_)) & 2));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), 2);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3WalkSelectExpr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((sqlite3WalkExprList((this._loadInt((_32_ + 8))), (this._loadInt(_31_)))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 12), 2);
                break label$0;
            }
            while (false);
            label$2:
            do {
                if ((sqlite3WalkExpr((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 12))))) == 0) {
                    break label$2;
                }
                this._storeInt((_32_ + 12), 2);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((sqlite3WalkExprList((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 16))))) == 0) {
                    break label$3;
                }
                this._storeInt((_32_ + 12), 2);
                break label$0;
            }
            while (false);
            label$4:
            do {
                if ((sqlite3WalkExpr((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 20))))) == 0) {
                    break label$4;
                }
                this._storeInt((_32_ + 12), 2);
                break label$0;
            }
            while (false);
            label$5:
            do {
                if ((sqlite3WalkExprList((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 24))))) == 0) {
                    break label$5;
                }
                this._storeInt((_32_ + 12), 2);
                break label$0;
            }
            while (false);
            label$6:
            do {
                if ((sqlite3WalkExpr((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 40))))) == 0) {
                    break label$6;
                }
                this._storeInt((_32_ + 12), 2);
                break label$0;
            }
            while (false);
            label$7:
            do {
                if ((sqlite3WalkExpr((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 44))))) == 0) {
                    break label$7;
                }
                this._storeInt((_32_ + 12), 2);
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
    public final int sqlite3WalkSelectFrom(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 16), (this._loadInt(((this._storeInt((_32_ + 20), _31_)) + 8))))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 12), (this._loadInt16s((this._loadInt((_32_ + 16))))));
                this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 16))) + 8));
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt((_32_ + 12))) < 1) {
                            break label$1;
                        }
                        if ((sqlite3WalkSelect((this._loadInt((_32_ + 24))), (this._loadInt(((this._loadInt((_32_ + 8))) + 16))))) != 0) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + -1));
                        this._storeInt((_32_ + 8), ((this._loadInt((_32_ + 8))) + 56));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt((_32_ + 28), 2);
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
    public final int sqlite3WalkExprList(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_32_ + 20), _31_)) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 16), (this._loadInt((this._loadInt((_32_ + 20))))));
                this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 20))) + 12))));
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt((_32_ + 16))) < 1) {
                            break label$1;
                        }
                        if ((sqlite3WalkExpr((this._loadInt((_32_ + 24))), (this._loadInt((this._loadInt((_32_ + 12))))))) != 0) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + -1));
                        this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 20));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt((_32_ + 28), 2);
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
    public final int sqlite3WalkExpr(int _30_, int _31_)
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
                        if ((this._storeInt((_32_ + 4), _31_)) == 0) {
                            break label$3;
                        }
                        if ((this._storeInt(_32_, (this._iiiTable[this._tableIndices[this._loadInt((_31_ = this._loadInt((_32_ + 8))))]].invoke(_31_, (this._loadInt((_32_ + 4))))))) != 0) {
                            break label$1;
                        }
                        if (((this._loadInt16u(((this._loadInt((_32_ + 4))) + 2))) & 8192) == 0) {
                            break label$2;
                        }
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_32_ + 12), 0);
                    break label$0;
                }
                while (false);
                label$4:
                do {
                    if ((sqlite3WalkExpr((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 8))))) == 0) {
                        break label$4;
                    }
                    this._storeInt((_32_ + 12), 2);
                    break label$0;
                }
                while (false);
                label$5:
                do {
                    if ((sqlite3WalkExpr((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 12))))) == 0) {
                        break label$5;
                    }
                    this._storeInt((_32_ + 12), 2);
                    break label$0;
                }
                while (false);
                label$6:
                do {
                    if (((this._loadInt16u(((this._loadInt((_32_ + 4))) + 2))) & 2048) == 0) {
                        break label$6;
                    }
                    if ((sqlite3WalkSelect((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 16))))) == 0) {
                        break label$1;
                    }
                    this._storeInt((_32_ + 12), 2);
                    break label$0;
                }
                while (false);
                if ((sqlite3WalkExprList((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 16))))) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 12), 2);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), ((this._loadInt(_32_)) & 2));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int resolveExprStep(int _30_, int _31_)
    {
        int _32_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 144))) + 136), _30_);
        this._storeInt((_32_ + 132), _31_);
        this._storeInt((_32_ + 128), (this._loadInt(((this._loadInt((_32_ + 136))) + 12))));
        this._storeInt((_32_ + 124), (this._loadInt((this._loadInt((_32_ + 128))))));
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt16u(((this._loadInt((_32_ + 132))) + 2))) & 4) == 0) {
                    break label$1;
                }
                this._storeInt((_32_ + 140), 1);
                break label$0;
            }
            while (false);
            this._storeInt16(((_31_ = this._loadInt((_32_ + 132))) + 2), ((this._loadInt16u((_31_ + 2))) | 4));
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
                                                        if ((_31_ = this._loadInt8u(_31_)) <= 115) {
                                                            break label$12;
                                                        }
                                                        if (((_31_ = _31_ + -116) & 4294967295L) > (39 & 4294967295L)) {
                                                            break label$8;
                                                        }
                                                        label$13:
                                                        do {
                                                            switch (_31_) {
                                                                case 0: {
                                                                    break label$11;
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
                                                                case 32:
                                                                case 33:
                                                                case 34:
                                                                case 36:
                                                                case 37:
                                                                case 38: {
                                                                    break label$8;
                                                                }
                                                                case 2: {
                                                                    break label$10;
                                                                }
                                                                case 17: {
                                                                    break label$9;
                                                                }
                                                                case 35:
                                                                case 39: {
                                                                    break label$13;
                                                                }
                                                                default: {
                                                                    break label$11;
                                                                }
                                                            }
                                                        }
                                                        while (false);
                                                        _31_ = 0;
                                                        label$14:
                                                        do {
                                                            if ((this._storeInt((_32_ + 104), (this._loadInt(((this._loadInt((_32_ + 132))) + 16))))) == 0) {
                                                                break label$14;
                                                            }
                                                            _31_ = this._loadInt((this._loadInt((_32_ + 104))));
                                                        }
                                                        while (false);
                                                        this._storeInt((_32_ + 100), _31_);
                                                        _31_ = this._storeInt((_32_ + 88), (this._storeInt((_32_ + 92), (this._storeInt((_32_ + 96), 0)))));
                                                        this._storeInt8((_32_ + 71), (this._loadInt8u(((this._loadInt(((this._loadInt(((this._loadInt((this._loadInt((_32_ + 124))))) + 8))) + 12))) + 77))));
                                                        _30_ = this._storeInt((_32_ + 80), (sqlite3Strlen30((this._storeInt((_32_ + 76), (this._loadInt(((this._loadInt((_32_ + 132))) + 4))))))));
                                                        if ((this._storeInt((_32_ + 72), (sqlite3FindFunction((this._loadInt((this._loadInt((_32_ + 124))))), (this._loadInt((_32_ + 76))), _30_, (this._loadInt((_32_ + 100))), (this._loadInt8u((_32_ + 71))), _31_)))) == 0) {
                                                            break label$6;
                                                        }
                                                        this._storeInt((_32_ + 88), (((this._loadInt(((this._loadInt((_32_ + 72))) + 12))) == 0) ? 1 : 0));
                                                        break label$2;
                                                    }
                                                    while (false);
                                                    if (_31_ == 20) {
                                                        break label$11;
                                                    }
                                                    if (_31_ == 26) {
                                                        break label$7;
                                                    }
                                                    if (_31_ != 72) {
                                                        break label$8;
                                                    }
                                                }
                                                while (false);
                                                if (((this._loadInt16u(((this._loadInt((_32_ + 132))) + 2))) & 2048) == 0) {
                                                    break label$8;
                                                }
                                                this._storeInt((_32_ + 64), (this._loadInt(((this._loadInt((_32_ + 128))) + 12))));
                                                label$15:
                                                do {
                                                    if ((this._loadInt8u(((this._loadInt((_32_ + 128))) + 22))) == 0) {
                                                        break label$15;
                                                    }
                                                    sqlite3ErrorMsg((this._loadInt((_32_ + 124))), 40496, 0);
                                                }
                                                while (false);
                                                sqlite3WalkSelect((this._loadInt((_32_ + 136))), (this._loadInt(((this._loadInt((_32_ + 132))) + 16))));
                                                if ((this._loadInt((_32_ + 64))) == (this._loadInt(((this._loadInt((_32_ + 128))) + 12)))) {
                                                    break label$8;
                                                }
                                                this._storeInt16(((_31_ = this._loadInt((_32_ + 132))) + 2), ((this._loadInt16u((_31_ + 2))) | 32));
                                                break label$8;
                                            }
                                            while (false);
                                            if ((this._loadInt8u((this._storeInt((_32_ + 108), (this._loadInt(((this._loadInt((_32_ + 132))) + 12))))))) != 26) {
                                                break label$5;
                                            }
                                            this._storeInt((_32_ + 112), 0);
                                            this._storeInt((_32_ + 116), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 132))) + 8))) + 4))));
                                            this._storeInt((_32_ + 120), (this._loadInt(((this._loadInt((_32_ + 108))) + 4))));
                                            break label$4;
                                        }
                                        while (false);
                                        if ((this._loadInt8u(((this._loadInt((_32_ + 128))) + 22))) == 0) {
                                            break label$8;
                                        }
                                        sqlite3ErrorMsg((this._loadInt((_32_ + 124))), 40544, 0);
                                    }
                                    while (false);
                                    _31_ = 1;
                                    label$16:
                                    do {
                                        if ((this._loadInt(((this._loadInt((_32_ + 124))) + 64))) != 0) {
                                            break label$16;
                                        }
                                        _31_ = ((this._loadInt8u(((this._loadInt((this._loadInt((_32_ + 124))))) + 30))) != 0) ? 1 : 0;
                                    }
                                    while (false);
                                    _temp$0 = 2;
                                    _temp$1 = 0;
                                    _temp$2 = (_31_ != 0) ? _temp$0 : _temp$1;
                                    this._storeInt((_32_ + 140), _temp$2);
                                    break label$0;
                                }
                                while (false);
                                this._storeInt((_32_ + 140), (lookupName((this._loadInt((_32_ + 124))), 0, 0, (this._loadInt(((_31_ = this._loadInt((_32_ + 132))) + 4))), (this._loadInt((_32_ + 128))), _31_)));
                                break label$0;
                            }
                            while (false);
                            if ((this._storeInt((_32_ + 72), (sqlite3FindFunction((this._loadInt((this._loadInt((_32_ + 124))))), (this._loadInt((_32_ + 76))), (this._loadInt((_32_ + 80))), -1, (this._loadInt8u((_32_ + 71))), 0)))) == 0) {
                                break label$3;
                            }
                            this._storeInt((_32_ + 92), 1);
                            break label$2;
                        }
                        while (false);
                        this._storeInt((_32_ + 112), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 132))) + 8))) + 4))));
                        this._storeInt((_32_ + 116), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 108))) + 8))) + 4))));
                        this._storeInt((_32_ + 120), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 108))) + 12))) + 4))));
                    }
                    while (false);
                    this._storeInt((_32_ + 140), (lookupName((this._loadInt((_32_ + 124))), (this._loadInt((_32_ + 112))), (this._loadInt((_32_ + 116))), (this._loadInt((_32_ + 120))), (this._loadInt((_32_ + 128))), (this._loadInt((_32_ + 132))))));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 96), 1);
            }
            while (false);
            label$17:
            do {
                if ((this._loadInt((_32_ + 72))) == 0) {
                    break label$17;
                }
                if ((this._storeInt((_32_ + 84), (sqlite3AuthCheck((this._loadInt((_32_ + 124))), 31, 0, (this._loadInt(((this._loadInt((_32_ + 72))) + 24))), 0)))) == 0) {
                    break label$17;
                }
                label$18:
                do {
                    if ((this._loadInt((_32_ + 84))) != 1) {
                        break label$18;
                    }
                    _31_ = this._loadInt((_32_ + 124));
                    this._storeInt(_32_, (this._loadInt(((this._loadInt((_32_ + 72))) + 24))));
                    sqlite3ErrorMsg(_31_, 40320, _32_);
                    this._storeInt(((_31_ = this._loadInt((_32_ + 128))) + 16), ((this._loadInt((_31_ + 16))) + 1));
                }
                while (false);
                this._storeInt8((this._loadInt((_32_ + 132))), 98);
                this._storeInt((_32_ + 140), 1);
                break label$0;
            }
            while (false);
            label$19:
            do {
                label$20:
                do {
                    label$21:
                    do {
                        if ((this._loadInt((_32_ + 88))) == 0) {
                            break label$21;
                        }
                        if ((this._loadInt8u(((this._loadInt((_32_ + 128))) + 20))) == 0) {
                            break label$20;
                        }
                    }
                    while (false);
                    label$22:
                    do {
                        if ((this._loadInt((_32_ + 96))) == 0) {
                            break label$22;
                        }
                        this._storeInt((_32_ + 20), (this._loadInt((_32_ + 76))));
                        _31_ = this._loadInt((_32_ + 124));
                        this._storeInt((_32_ + 16), (this._loadInt((_32_ + 80))));
                        sqlite3ErrorMsg(_31_, 40416, (_32_ + 16));
                        this._storeInt(((_31_ = this._loadInt((_32_ + 128))) + 16), ((this._loadInt((_31_ + 16))) + 1));
                        break label$19;
                    }
                    while (false);
                    if ((this._loadInt((_32_ + 92))) == 0) {
                        break label$19;
                    }
                    this._storeInt((_32_ + 36), (this._loadInt((_32_ + 76))));
                    _31_ = this._loadInt((_32_ + 124));
                    this._storeInt((_32_ + 32), (this._loadInt((_32_ + 80))));
                    sqlite3ErrorMsg(_31_, 40448, (_32_ + 32));
                    this._storeInt(((_31_ = this._loadInt((_32_ + 128))) + 16), ((this._loadInt((_31_ + 16))) + 1));
                    break label$19;
                }
                while (false);
                this._storeInt((_32_ + 52), (this._loadInt((_32_ + 76))));
                _31_ = this._loadInt((_32_ + 124));
                this._storeInt((_32_ + 48), (this._loadInt((_32_ + 80))));
                sqlite3ErrorMsg(_31_, 40368, (_32_ + 48));
                this._storeInt(((_31_ = this._loadInt((_32_ + 128))) + 16), ((this._loadInt((_31_ + 16))) + 1));
                this._storeInt((_32_ + 88), 0);
            }
            while (false);
            label$23:
            do {
                if ((this._loadInt((_32_ + 88))) == 0) {
                    break label$23;
                }
                this._storeInt8((this._loadInt((_32_ + 132))), 153);
                this._storeInt8(((this._loadInt((_32_ + 128))) + 21), 1);
            }
            while (false);
            label$24:
            do {
                if ((this._loadInt((_32_ + 88))) == 0) {
                    break label$24;
                }
                this._storeInt8(((this._loadInt((_32_ + 128))) + 20), 0);
            }
            while (false);
            sqlite3WalkExprList((this._loadInt((_32_ + 136))), (this._loadInt((_32_ + 104))));
            label$25:
            do {
                if ((this._loadInt((_32_ + 88))) == 0) {
                    break label$25;
                }
                this._storeInt8(((this._loadInt((_32_ + 128))) + 20), 1);
            }
            while (false);
            this._storeInt((_32_ + 140), 1);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 140));
        this._storeInt((0 + 4), (_32_ + 144));
        return _31_;
    }

    @Override()
    public final int resolveSelectStep(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        int _34_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 112))) + 104), _30_);
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt16u(((this._storeInt((_34_ + 100), _31_)) + 6))) & 2) == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 108), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 96), (this._loadInt(((this._loadInt((_34_ + 104))) + 12))));
            this._storeInt((_34_ + 44), (this._loadInt(((this._loadInt((_34_ + 104))) + 8))));
            this._storeInt((_34_ + 24), (this._loadInt((this._loadInt((_34_ + 44))))));
            label$2:
            do {
                if (((this._loadInt16u(((this._loadInt((_34_ + 100))) + 6))) & 16) != 0) {
                    break label$2;
                }
                sqlite3SelectPrep((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 100))), (this._loadInt((_34_ + 96))));
                _31_ = 1;
                label$3:
                do {
                    if ((this._loadInt(((this._loadInt((_34_ + 44))) + 64))) != 0) {
                        break label$3;
                    }
                    _31_ = ((this._loadInt8u(((this._loadInt((_34_ + 24))) + 30))) != 0) ? 1 : 0;
                }
                while (false);
                _temp$0 = 2;
                _temp$1 = 1;
                _temp$2 = (_31_ != 0) ? _temp$0 : _temp$1;
                this._storeInt((_34_ + 108), _temp$2);
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 52), (((this._loadInt(((this._loadInt((_34_ + 100))) + 28))) != 0) ? 1 : 0));
            _32_ = this._storeInt((_34_ + 48), 0);
            this._storeInt((_34_ + 28), (this._loadInt((_34_ + 100))));
            label$5:
            do {
                label$4:
                while (true) {
                    label$6:
                    do {
                        label$7:
                        do {
                            if ((this._loadInt((_34_ + 100))) == 0) {
                                break label$7;
                            }
                            this._storeInt16(((_31_ = this._loadInt((_34_ + 100))) + 6), ((this._loadInt16u((_31_ + 6))) | 2));
                            memset((_34_ + 56), _32_, 36);
                            this._storeInt((_34_ + 56), (this._loadInt((_34_ + 44))));
                            label$8:
                            do {
                                if ((sqlite3ResolveExprNames((_34_ + 56), (this._loadInt(((this._loadInt((_34_ + 100))) + 40))))) != 0) {
                                    break label$8;
                                }
                                if ((sqlite3ResolveExprNames((_34_ + 56), (this._loadInt(((this._loadInt((_34_ + 100))) + 44))))) != 0) {
                                    break label$8;
                                }
                                _31_ = this._storeInt8((_34_ + 76), 1);
                                this._storeInt((_34_ + 60), (this._loadInt(((this._loadInt((_34_ + 100))) + 8))));
                                this._storeInt((_34_ + 88), (this._loadInt((_34_ + 96))));
                                this._storeInt((_34_ + 40), (this._loadInt((this._loadInt((_34_ + 100))))));
                                _30_ = this._storeInt((_34_ + 36), _32_);
                                label$9:
                                do {
                                    label$10:
                                    do {
                                        label$12:
                                        do {
                                            label$11:
                                            while (true) {
                                                if ((this._loadInt((_34_ + 36))) >= (this._loadInt((this._loadInt((_34_ + 40)))))) {
                                                    break label$12;
                                                }
                                                if ((sqlite3ResolveExprNames((_34_ + 56), (this._storeInt((_34_ + 20), (this._loadInt(((this._loadInt(((this._loadInt((_34_ + 40))) + 12))) + ((this._loadInt((_34_ + 36))) * 20)))))))) != 0) {
                                                    break label$10;
                                                }
                                                this._storeInt((_34_ + 36), ((this._loadInt((_34_ + 36))) + _31_));
                                                continue label$11;
                                            }
                                        }
                                        while (false);
                                        _33_ = this._storeInt((_34_ + 36), _30_);
                                        label$14:
                                        do {
                                            label$13:
                                            while (true) {
                                                if ((this._loadInt((_34_ + 36))) >= (this._loadInt16s((this._loadInt(((this._loadInt((_34_ + 100))) + 8)))))) {
                                                    break label$14;
                                                }
                                                this._storeInt((_34_ + 16), ((_30_ = (this._loadInt(((this._loadInt((_34_ + 100))) + 8))) + ((this._loadInt((_34_ + 36))) * 56)) + 8));
                                                label$15:
                                                do {
                                                    if ((this._loadInt((_30_ + 24))) == 0) {
                                                        break label$15;
                                                    }
                                                    this._storeInt((_34_ + 12), (this._loadInt(((this._loadInt((_34_ + 44))) + 516))));
                                                    label$16:
                                                    do {
                                                        if ((this._loadInt(((this._loadInt((_34_ + 16))) + 4))) == 0) {
                                                            break label$16;
                                                        }
                                                        this._storeInt(((this._loadInt((_34_ + 44))) + 516), (this._loadInt(((this._loadInt((_34_ + 16))) + 4))));
                                                    }
                                                    while (false);
                                                    sqlite3ResolveSelectNames((this._loadInt((_34_ + 44))), (this._loadInt(((this._loadInt((_34_ + 16))) + 16))), (this._loadInt((_34_ + 96))));
                                                    this._storeInt(((_30_ = this._loadInt((_34_ + 44))) + 516), (this._loadInt((_34_ + 12))));
                                                    if ((this._loadInt((_30_ + 64))) != 0) {
                                                        break label$9;
                                                    }
                                                    if ((this._loadInt8u(((this._loadInt((_34_ + 24))) + 30))) != 0) {
                                                        break label$9;
                                                    }
                                                }
                                                while (false);
                                                this._storeInt((_34_ + 36), ((this._loadInt((_34_ + 36))) + _31_));
                                                continue label$13;
                                            }
                                        }
                                        while (false);
                                        label$17:
                                        do {
                                            label$18:
                                            do {
                                                if ((this._storeInt((_34_ + 32), (this._loadInt(((this._loadInt((_34_ + 100))) + 16))))) != 0) {
                                                    break label$18;
                                                }
                                                if ((this._loadInt8u((_34_ + 77))) == 0) {
                                                    break label$17;
                                                }
                                            }
                                            while (false);
                                            this._storeInt16(((_30_ = this._loadInt((_34_ + 100))) + 6), ((this._loadInt16u((_30_ + 6))) | 4));
                                            break label$6;
                                        }
                                        while (false);
                                        this._storeInt8((_34_ + 76), _33_);
                                        break label$6;
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 108), 2);
                                    break label$5;
                                }
                                while (false);
                                this._storeInt((_34_ + 108), 2);
                                break label$5;
                            }
                            while (false);
                            this._storeInt((_34_ + 108), 2);
                            break label$5;
                        }
                        while (false);
                        label$19:
                        do {
                            if ((this._loadInt((_34_ + 52))) == 0) {
                                break label$19;
                            }
                            if ((resolveCompoundOrderBy((this._loadInt((_34_ + 44))), (this._loadInt((_34_ + 28))))) == 0) {
                                break label$19;
                            }
                            this._storeInt((_34_ + 108), 2);
                            break label$5;
                        }
                        while (false);
                        this._storeInt((_34_ + 108), 1);
                        break label$5;
                    }
                    while (false);
                    label$20:
                    do {
                        label$21:
                        do {
                            label$22:
                            do {
                                label$23:
                                do {
                                    if ((this._loadInt(((this._loadInt((_34_ + 100))) + 20))) == 0) {
                                        break label$23;
                                    }
                                    if ((this._loadInt((_34_ + 32))) == 0) {
                                        break label$22;
                                    }
                                }
                                while (false);
                                this._storeInt((_34_ + 64), (this._loadInt((_30_ = this._loadInt((_34_ + 100))))));
                                label$24:
                                do {
                                    label$25:
                                    do {
                                        label$26:
                                        do {
                                            if ((sqlite3ResolveExprNames((_34_ + 56), (this._loadInt((_30_ + 12))))) != 0) {
                                                break label$26;
                                            }
                                            if ((sqlite3ResolveExprNames((_34_ + 56), (this._loadInt(((this._loadInt((_34_ + 100))) + 20))))) != 0) {
                                                break label$26;
                                            }
                                            this._storeInt8((_34_ + 76), _31_);
                                            _30_ = this._storeInt((_34_ + 88), _33_);
                                            label$27:
                                            do {
                                                if ((this._loadInt((_34_ + 52))) != 0) {
                                                    break label$27;
                                                }
                                                if ((resolveOrderGroupBy((_34_ + 56), (_33_ = this._loadInt((_34_ + 100))), (this._loadInt((_33_ + 24))), 39968)) != 0) {
                                                    break label$21;
                                                }
                                            }
                                            while (false);
                                            if ((this._loadInt8u(((this._loadInt((_34_ + 24))) + 30))) != 0) {
                                                break label$24;
                                            }
                                            if ((this._loadInt((_34_ + 32))) == 0) {
                                                break label$20;
                                            }
                                            if ((resolveOrderGroupBy((_34_ + 56), (this._loadInt((_34_ + 100))), (this._loadInt((_34_ + 32))), 39984)) != 0) {
                                                break label$25;
                                            }
                                            if ((this._loadInt8u(((this._loadInt((_34_ + 24))) + 30))) != 0) {
                                                break label$25;
                                            }
                                            this._storeInt((_34_ + 36), _30_);
                                            this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((_34_ + 32))) + 12))));
                                            label$29:
                                            do {
                                                label$28:
                                                while (true) {
                                                    if ((this._loadInt((_34_ + 36))) >= (this._loadInt((this._loadInt((_34_ + 32)))))) {
                                                        break label$20;
                                                    }
                                                    if (((this._loadInt16u(((this._loadInt((this._loadInt((_34_ + 8))))) + 2))) & 2) != 0) {
                                                        break label$29;
                                                    }
                                                    this._storeInt((_34_ + 36), ((this._loadInt((_34_ + 36))) + _31_));
                                                    this._storeInt((_34_ + 8), ((this._loadInt((_34_ + 8))) + 20));
                                                    continue label$28;
                                                }
                                            }
                                            while (false);
                                            sqlite3ErrorMsg((this._loadInt((_34_ + 44))), 40000, 0);
                                            this._storeInt((_34_ + 108), 2);
                                            break label$5;
                                        }
                                        while (false);
                                        this._storeInt((_34_ + 108), 2);
                                        break label$5;
                                    }
                                    while (false);
                                    this._storeInt((_34_ + 108), 2);
                                    break label$5;
                                }
                                while (false);
                                this._storeInt((_34_ + 108), 2);
                                break label$5;
                            }
                            while (false);
                            sqlite3ErrorMsg((this._loadInt((_34_ + 44))), 39920, 0);
                            this._storeInt((_34_ + 108), 2);
                            break label$5;
                        }
                        while (false);
                        this._storeInt((_34_ + 108), 2);
                        break label$5;
                    }
                    while (false);
                    this._storeInt((_34_ + 100), (this._loadInt(((this._loadInt((_34_ + 100))) + 28))));
                    this._storeInt((_34_ + 48), ((this._loadInt((_34_ + 48))) + _31_));
                    continue label$4;
                }
            }
            while (false);
        }
        while (false);
        _31_ = this._loadInt((_34_ + 108));
        this._storeInt((0 + 4), (_34_ + 112));
        return _31_;
    }

    @Override()
    public final int sqlite3ResolveExprNames(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._storeInt((_32_ + 36), _31_)) == 0) {
                        break label$2;
                    }
                    if ((sqlite3ExprCheckHeight((this._storeInt((_32_ + 12), (this._loadInt((this._loadInt((_32_ + 40))))))), ((this._loadInt(((this._loadInt((_32_ + 36))) + 44))) + (this._loadInt(((this._loadInt((this._loadInt((_32_ + 40))))) + 540)))))) == 0) {
                        break label$1;
                    }
                    this._storeInt((_32_ + 44), 1);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 44), 0);
                break label$0;
            }
            while (false);
            this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 540), ((this._loadInt((_31_ + 540))) + (this._loadInt(((this._loadInt((_32_ + 36))) + 44)))));
            this._storeInt((_32_ + 32), (this._loadInt8u(((this._loadInt((_32_ + 40))) + 21))));
            _31_ = this._storeInt8(((this._loadInt((_32_ + 40))) + 21), 0);
            this._storeInt((_32_ + 16), 37);
            this._storeInt((_32_ + 20), 38);
            this._storeInt((_32_ + 24), (this._loadInt((_30_ = this._loadInt((_32_ + 40))))));
            this._storeInt((_32_ + 28), _30_);
            sqlite3WalkExpr((_32_ + 16), (this._loadInt((_32_ + 36))));
            this._storeInt(((_30_ = this._loadInt((this._loadInt((_32_ + 40))))) + 540), ((this._loadInt((_30_ + 540))) - (this._loadInt(((this._loadInt((_32_ + 36))) + 44)))));
            label$3:
            do {
                label$4:
                do {
                    if ((this._loadInt(((this._loadInt((_32_ + 40))) + 16))) > _31_) {
                        break label$4;
                    }
                    if ((this._loadInt(((this._loadInt((_32_ + 24))) + 64))) < 1) {
                        break label$3;
                    }
                }
                while (false);
                this._storeInt16(((_31_ = this._loadInt((_32_ + 36))) + 2), ((this._loadInt16u((_31_ + 2))) | 8));
            }
            while (false);
            label$5:
            do {
                label$6:
                do {
                    if ((this._loadInt8u(((this._loadInt((_32_ + 40))) + 21))) == 0) {
                        break label$6;
                    }
                    this._storeInt16(((_31_ = this._loadInt((_32_ + 36))) + 2), ((this._loadInt16u((_31_ + 2))) | 2));
                    break label$5;
                }
                while (false);
                if ((this._loadInt((_32_ + 32))) == 0) {
                    break label$5;
                }
                this._storeInt8(((this._loadInt((_32_ + 40))) + 21), 1);
            }
            while (false);
            this._storeInt((_32_ + 44), (((this._loadInt16u(((this._loadInt((_32_ + 36))) + 2))) & 8) >>> 3));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 44));
        this._storeInt((0 + 4), (_32_ + 48));
        return _31_;
    }

    @Override()
    public final int resolveOrderGroupBy(int _30_, int _31_, int _32_, int _33_)
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
                label$2:
                do {
                    if ((this._loadInt((_34_ + 32))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_34_ + 8), (this._loadInt((this._loadInt((this._loadInt((_34_ + 36))))))));
                    this._storeInt((_34_ + 12), (this._loadInt((this._loadInt((_34_ + 40))))));
                    _32_ = this._storeInt((_34_ + 24), 0);
                    this._storeInt((_34_ + 16), (this._loadInt(((this._loadInt((_34_ + 32))) + 12))));
                    label$3:
                    do {
                        label$5:
                        do {
                            label$4:
                            while (true) {
                                if ((this._loadInt((_34_ + 24))) >= (this._loadInt((this._loadInt((_34_ + 32)))))) {
                                    break label$3;
                                }
                                _33_ = this._storeInt((_34_ + 4), (this._loadInt((this._loadInt((_34_ + 16))))));
                                label$6:
                                do {
                                    label$7:
                                    do {
                                        if ((this._storeInt((_34_ + 20), (resolveAsName((this._loadInt((_34_ + 12))), (this._loadInt((this._loadInt((_34_ + 36))))), _33_)))) < 1) {
                                            break label$7;
                                        }
                                        this._storeInt16(((this._loadInt((_34_ + 16))) + 14), (this._loadInt((_34_ + 20))));
                                        break label$6;
                                    }
                                    while (false);
                                    label$8:
                                    do {
                                        if ((sqlite3ExprIsInteger((this._loadInt((_34_ + 4))), (_34_ + 20))) == 0) {
                                            break label$8;
                                        }
                                        if ((this._loadInt((_34_ + 20))) <= _32_) {
                                            break label$1;
                                        }
                                        this._storeInt16(((this._loadInt((_34_ + 16))) + 14), (this._loadInt((_34_ + 20))));
                                        break label$6;
                                    }
                                    while (false);
                                    this._storeInt16(((this._loadInt((_34_ + 16))) + 14), _32_);
                                    if ((sqlite3ResolveExprNames((this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 4))))) != 0) {
                                        break label$5;
                                    }
                                }
                                while (false);
                                this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + 1));
                                this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) + 20));
                                continue label$4;
                            }
                        }
                        while (false);
                        this._storeInt((_34_ + 44), 1);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_34_ + 44), (sqlite3ResolveOrderGroupBy((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 32))), (this._loadInt((_34_ + 28))))));
                    break label$0;
                }
                while (false);
                this._storeInt((_34_ + 44), 0);
                break label$0;
            }
            while (false);
            resolveOutOfRangeError((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 28))), ((this._loadInt((_34_ + 24))) + 1), (this._loadInt((_34_ + 8))));
            this._storeInt((_34_ + 44), 1);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final int resolveCompoundOrderBy(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 56), _30_);
        this._storeInt((_32_ + 52), _31_);
        this._storeInt((_32_ + 32), 1);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._storeInt((_32_ + 44), (this._loadInt(((this._loadInt((_32_ + 52))) + 24))))) == 0) {
                        break label$2;
                    }
                    _31_ = this._storeInt((_32_ + 36), (this._loadInt((this._loadInt((_32_ + 56))))));
                    if ((this._loadInt((this._loadInt((_32_ + 44))))) <= (this._loadInt((_31_ + 80)))) {
                        break label$1;
                    }
                    sqlite3ErrorMsg((this._loadInt((_32_ + 56))), 40064, 0);
                    this._storeInt((_32_ + 60), 1);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 60), 0);
                break label$0;
            }
            while (false);
            _30_ = this._storeInt((_32_ + 48), 0);
            label$4:
            do {
                label$3:
                while (true) {
                    if ((this._loadInt((_32_ + 48))) >= (this._loadInt((this._loadInt((_32_ + 44)))))) {
                        break label$4;
                    }
                    this._storeInt8((((this._loadInt(((this._loadInt((_32_ + 44))) + 12))) + ((_31_ = this._loadInt((_32_ + 48))) * 20)) + 13), _30_);
                    this._storeInt((_32_ + 48), (_31_ + 1));
                    continue label$3;
                }
            }
            while (false);
            this._storeInt(((this._loadInt((_32_ + 52))) + 32), 0);
            label$6:
            do {
                label$5:
                while (true) {
                    if ((this._loadInt(((this._loadInt((_32_ + 52))) + 28))) == 0) {
                        break label$6;
                    }
                    this._storeInt((_32_ + 52), (this._loadInt(((this._storeInt(((this._loadInt(((_31_ = this._loadInt((_32_ + 52))) + 28))) + 32), _31_)) + 28))));
                    continue label$5;
                }
            }
            while (false);
            label$8:
            do {
                label$7:
                while (true) {
                    _31_ = 0;
                    label$9:
                    do {
                        if ((this._loadInt((_32_ + 52))) == 0) {
                            break label$9;
                        }
                        _31_ = ((this._loadInt((_32_ + 32))) != 0) ? 1 : 0;
                    }
                    while (false);
                    label$10:
                    do {
                        label$11:
                        do {
                            if (_31_ == 0) {
                                break label$11;
                            }
                            _31_ = this._storeInt((_32_ + 32), 0);
                            this._storeInt((_32_ + 40), (this._loadInt((this._loadInt((_32_ + 52))))));
                            _30_ = this._storeInt((_32_ + 48), _31_);
                            this._storeInt((_32_ + 28), (this._loadInt(((this._loadInt((_32_ + 44))) + 12))));
                            label$12:
                            do {
                                label$14:
                                do {
                                    label$13:
                                    while (true) {
                                        if ((this._loadInt((_32_ + 48))) >= (this._loadInt((this._loadInt((_32_ + 44)))))) {
                                            break label$10;
                                        }
                                        this._storeInt((_32_ + 24), -1);
                                        label$15:
                                        do {
                                            if ((this._loadInt8u(((this._loadInt((_32_ + 28))) + 13))) != 0) {
                                                break label$15;
                                            }
                                            label$16:
                                            do {
                                                label$17:
                                                do {
                                                    if ((sqlite3ExprIsInteger((this._storeInt((_32_ + 20), (this._loadInt((this._loadInt((_32_ + 28))))))), (_32_ + 24))) == 0) {
                                                        break label$17;
                                                    }
                                                    if ((this._loadInt((_32_ + 24))) < 1) {
                                                        break label$14;
                                                    }
                                                    if ((this._loadInt((_32_ + 24))) <= (this._loadInt((this._loadInt((_32_ + 40)))))) {
                                                        break label$16;
                                                    }
                                                    break label$14;
                                                }
                                                while (false);
                                                if ((this._storeInt((_32_ + 24), (resolveAsName((this._loadInt((_32_ + 56))), (this._loadInt((_32_ + 40))), (this._loadInt((_32_ + 20))))))) != 0) {
                                                    break label$16;
                                                }
                                                this._storeInt((_32_ + 16), (sqlite3ExprDup((this._loadInt((_32_ + 36))), (this._loadInt((_32_ + 20))), _30_)));
                                                label$18:
                                                do {
                                                    if ((this._loadInt8u(((this._loadInt((_32_ + 36))) + 30))) != 0) {
                                                        break label$18;
                                                    }
                                                    this._storeInt((_32_ + 24), (resolveOrderByTermToExprList((this._loadInt((_32_ + 56))), (this._loadInt((_32_ + 52))), (this._loadInt((_32_ + 16))))));
                                                }
                                                while (false);
                                                sqlite3ExprDelete((this._loadInt((_32_ + 36))), (this._loadInt((_32_ + 16))));
                                            }
                                            while (false);
                                            label$19:
                                            do {
                                                if ((this._loadInt((_32_ + 24))) < 1) {
                                                    break label$19;
                                                }
                                                this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 20))) + 20))));
                                                this._storeInt((_32_ + 8), ((this._loadInt16u(((this._loadInt((_32_ + 20))) + 2))) & 256));
                                                sqlite3ExprDelete((this._loadInt((_32_ + 36))), (this._loadInt((_32_ + 20))));
                                                _31_ = this._storeInt((_32_ + 20), (sqlite3Expr((this._loadInt((_32_ + 36))), 129, _30_)));
                                                if ((this._storeInt((this._loadInt((_32_ + 28))), _31_)) == 0) {
                                                    break label$12;
                                                }
                                                this._storeInt(((_31_ = this._loadInt((_32_ + 20))) + 20), (this._loadInt((_32_ + 12))));
                                                this._storeInt16((_31_ + 2), (((this._loadInt16u((_31_ + 2))) | (this._loadInt((_32_ + 8)))) | 1024));
                                                this._storeInt(((this._loadInt((_32_ + 20))) + 4), (this._loadInt((_32_ + 24))));
                                                this._storeInt16(((this._loadInt((_32_ + 28))) + 14), (this._loadInt((_32_ + 24))));
                                                this._storeInt8(((this._loadInt((_32_ + 28))) + 13), 1);
                                                break label$15;
                                            }
                                            while (false);
                                            this._storeInt((_32_ + 32), 1);
                                        }
                                        while (false);
                                        this._storeInt((_32_ + 48), ((this._loadInt((_32_ + 48))) + 1));
                                        this._storeInt((_32_ + 28), ((this._loadInt((_32_ + 28))) + 20));
                                        continue label$13;
                                    }
                                }
                                while (false);
                                resolveOutOfRangeError((this._loadInt((_32_ + 56))), 39968, ((this._loadInt((_32_ + 48))) + 1), (this._loadInt((this._loadInt((_32_ + 40))))));
                                this._storeInt((_32_ + 60), 1);
                                break label$8;
                            }
                            while (false);
                            this._storeInt((_32_ + 60), 1);
                            break label$8;
                        }
                        while (false);
                        this._storeInt((_32_ + 48), 0);
                        label$20:
                        do {
                            label$22:
                            do {
                                label$21:
                                while (true) {
                                    if ((this._loadInt((_32_ + 48))) >= (this._loadInt((this._loadInt((_32_ + 44)))))) {
                                        break label$20;
                                    }
                                    if ((this._loadInt8u((((this._loadInt(((this._loadInt((_32_ + 44))) + 12))) + ((this._loadInt((_32_ + 48))) * 20)) + 13))) == 0) {
                                        break label$22;
                                    }
                                    this._storeInt((_32_ + 48), ((this._loadInt((_32_ + 48))) + 1));
                                    continue label$21;
                                }
                            }
                            while (false);
                            _31_ = this._loadInt((_32_ + 56));
                            this._storeInt(_32_, ((this._loadInt((_32_ + 48))) + 1));
                            sqlite3ErrorMsg(_31_, 40112, _32_);
                            this._storeInt((_32_ + 60), 1);
                            break label$8;
                        }
                        while (false);
                        this._storeInt((_32_ + 60), 0);
                        break label$8;
                    }
                    while (false);
                    this._storeInt((_32_ + 52), (this._loadInt(((this._loadInt((_32_ + 52))) + 32))));
                    continue label$7;
                }
            }
            while (false);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 60));
        this._storeInt((0 + 4), (_32_ + 64));
        return _31_;
    }

    @Override()
    public final int sqlite3ExprIsInteger(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 16), 0);
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt16u(((this._loadInt((_32_ + 24))) + 2))) & 1024) == 0) {
                    break label$1;
                }
                this._storeInt((this._loadInt((_32_ + 20))), (this._loadInt(((this._loadInt((_32_ + 24))) + 4))));
                this._storeInt((_32_ + 28), 1);
                break label$0;
            }
            while (false);
            label$2:
            do {
                label$3:
                do {
                    if ((_31_ = this._loadInt8u((this._loadInt((_32_ + 24))))) == 156) {
                        break label$3;
                    }
                    if (_31_ != 157) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 16), (sqlite3ExprIsInteger((this._loadInt(((this._loadInt((_32_ + 24))) + 8))), (this._loadInt((_32_ + 20))))));
                    break label$2;
                }
                while (false);
                if ((sqlite3ExprIsInteger((this._loadInt(((this._loadInt((_32_ + 24))) + 8))), (_32_ + 12))) == 0) {
                    break label$2;
                }
                this._storeInt((this._loadInt((_32_ + 20))), (0 - (this._loadInt((_32_ + 12)))));
                this._storeInt((_32_ + 16), 1);
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
    public final void resolveOutOfRangeError(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        _32_ = this._loadInt((_34_ + 28));
        _31_ = this._loadInt((_34_ + 20));
        _30_ = this._loadInt((_34_ + 24));
        this._storeInt((_34_ + 8), _33_);
        this._storeInt((_34_ + 4), _30_);
        this._storeInt(_34_, _31_);
        sqlite3ErrorMsg(_32_, 40176, _34_);
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final int resolveAsName(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_33_ + 20), _31_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u((this._storeInt((_33_ + 16), _32_)))) != 26) {
                    break label$1;
                }
                this._storeInt((_33_ + 8), (this._loadInt(((this._loadInt((_33_ + 16))) + 4))));
                this._storeInt((_33_ + 12), 0);
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt((_33_ + 12))) >= (this._loadInt((this._loadInt((_33_ + 20)))))) {
                            break label$1;
                        }
                        label$4:
                        do {
                            if ((this._storeInt((_33_ + 4), (this._loadInt((((this._loadInt(((this._loadInt((_33_ + 20))) + 12))) + ((this._loadInt((_33_ + 12))) * 20)) + 4))))) == 0) {
                                break label$4;
                            }
                            if ((sqlite3StrICmp((this._loadInt((_33_ + 4))), (this._loadInt((_33_ + 8))))) == 0) {
                                break label$3;
                            }
                        }
                        while (false);
                        this._storeInt((_33_ + 12), ((this._loadInt((_33_ + 12))) + 1));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt((_33_ + 28), ((this._loadInt((_33_ + 12))) + 1));
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
    public final int sqlite3ExprDup(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = exprDup((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_, 0);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int resolveOrderByTermToExprList(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 72), _30_);
        this._storeInt((_33_ + 68), _31_);
        this._storeInt((_33_ + 64), _32_);
        this._storeInt((_33_ + 56), (this._loadInt((this._loadInt((_33_ + 68))))));
        memset((_33_ + 16), 0, 36);
        this._storeInt((_33_ + 16), (this._loadInt((_33_ + 72))));
        this._storeInt((_33_ + 20), (this._loadInt(((this._loadInt((_33_ + 68))) + 8))));
        this._storeInt((_33_ + 24), (this._loadInt((_33_ + 56))));
        _32_ = this._storeInt8((_33_ + 36), 1);
        _31_ = this._storeInt((_33_ + 32), 0);
        this._storeInt((_33_ + 12), (this._loadInt((this._loadInt((_33_ + 72))))));
        this._storeInt8((_33_ + 7), (this._loadInt8u(((this._loadInt((_33_ + 12))) + 33))));
        this._storeInt8(((this._loadInt((_33_ + 12))) + 33), _32_);
        _30_ = this._storeInt((_33_ + 8), (sqlite3ResolveExprNames((_33_ + 16), (this._loadInt((_33_ + 64))))));
        this._storeInt8(((this._loadInt((_33_ + 12))) + 33), (this._loadInt8u((_33_ + 7))));
        label$0:
        do {
            label$1:
            do {
                if (_30_ == 0) {
                    break label$1;
                }
                this._storeInt((_33_ + 76), _31_);
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 60), _31_);
            label$2:
            do {
                label$4:
                do {
                    label$3:
                    while (true) {
                        if ((this._loadInt((_33_ + 60))) >= (this._loadInt((this._loadInt((_33_ + 56)))))) {
                            break label$2;
                        }
                        if ((sqlite3ExprCompare((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 56))) + 12))) + ((this._loadInt((_33_ + 60))) * 20)))), (this._loadInt((_33_ + 64))))) <= _32_) {
                            break label$4;
                        }
                        this._storeInt((_33_ + 60), ((this._loadInt((_33_ + 60))) + _32_));
                        continue label$3;
                    }
                }
                while (false);
                this._storeInt((_33_ + 76), ((this._loadInt((_33_ + 60))) + 1));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 76), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 76));
        this._storeInt((0 + 4), (_33_ + 80));
        return _32_;
    }

    @Override()
    public final int sqlite3ExprCompare(int _30_, int _31_)
    {
        int _32_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_32_ + 8))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt((_32_ + 4))) == 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        if (((this._loadInt16u(((this._loadInt((_32_ + 8))) + 2))) & 2048) != 0) {
                            break label$3;
                        }
                        if (((this._loadInt16u(((this._loadInt((_32_ + 4))) + 2))) & 2048) == 0) {
                            break label$1;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 12), 2);
                    break label$0;
                }
                while (false);
                _temp$0 = 0;
                _temp$1 = 2;
                _temp$2 = ((this._loadInt((_32_ + 4))) == (this._loadInt((_32_ + 8)))) ? _temp$0 : _temp$1;
                this._storeInt((_32_ + 12), _temp$2);
                break label$0;
            }
            while (false);
            label$4:
            do {
                if (((this._loadInt16u(((this._loadInt((_32_ + 8))) + 2))) & 16) == ((this._loadInt16u(((this._loadInt((_32_ + 4))) + 2))) & 16)) {
                    break label$4;
                }
                this._storeInt((_32_ + 12), 2);
                break label$0;
            }
            while (false);
            label$5:
            do {
                if ((this._loadInt8u((this._loadInt((_32_ + 8))))) == (this._loadInt8u((this._loadInt((_32_ + 4)))))) {
                    break label$5;
                }
                this._storeInt((_32_ + 12), 2);
                break label$0;
            }
            while (false);
            label$6:
            do {
                if ((sqlite3ExprCompare((this._loadInt(((this._loadInt((_32_ + 8))) + 8))), (this._loadInt(((this._loadInt((_32_ + 4))) + 8))))) == 0) {
                    break label$6;
                }
                this._storeInt((_32_ + 12), 2);
                break label$0;
            }
            while (false);
            label$7:
            do {
                if ((sqlite3ExprCompare((this._loadInt(((this._loadInt((_32_ + 8))) + 12))), (this._loadInt(((this._loadInt((_32_ + 4))) + 12))))) == 0) {
                    break label$7;
                }
                this._storeInt((_32_ + 12), 2);
                break label$0;
            }
            while (false);
            label$8:
            do {
                if ((sqlite3ExprListCompare((this._loadInt(((this._loadInt((_32_ + 8))) + 16))), (this._loadInt(((this._loadInt((_32_ + 4))) + 16))))) == 0) {
                    break label$8;
                }
                this._storeInt((_32_ + 12), 2);
                break label$0;
            }
            while (false);
            label$9:
            do {
                label$10:
                do {
                    if ((this._loadInt(((this._loadInt((_32_ + 8))) + 24))) != (this._loadInt(((this._loadInt((_32_ + 4))) + 24)))) {
                        break label$10;
                    }
                    if ((this._loadInt16s(((this._loadInt((_32_ + 8))) + 28))) == (this._loadInt16s(((this._loadInt((_32_ + 4))) + 28)))) {
                        break label$9;
                    }
                }
                while (false);
                this._storeInt((_32_ + 12), 2);
                break label$0;
            }
            while (false);
            label$11:
            do {
                label$12:
                do {
                    label$13:
                    do {
                        if (((this._loadInt16u(((this._loadInt((_32_ + 8))) + 2))) & 1024) == 0) {
                            break label$13;
                        }
                        label$14:
                        do {
                            if (((this._loadInt16u(((this._loadInt((_32_ + 4))) + 2))) & 1024) == 0) {
                                break label$14;
                            }
                            if ((this._loadInt(((this._loadInt((_32_ + 8))) + 4))) == (this._loadInt(((this._loadInt((_32_ + 4))) + 4)))) {
                                break label$12;
                            }
                        }
                        while (false);
                        this._storeInt((_32_ + 12), 2);
                        break label$0;
                    }
                    while (false);
                    if ((this._loadInt8u((this._loadInt((_32_ + 8))))) == 152) {
                        break label$12;
                    }
                    if ((this._loadInt(((this._loadInt((_32_ + 8))) + 4))) == 0) {
                        break label$12;
                    }
                    if (((this._loadInt16u(((this._loadInt((_32_ + 4))) + 2))) & 1024) != 0) {
                        break label$11;
                    }
                    if ((this._loadInt(((this._loadInt((_32_ + 4))) + 4))) == 0) {
                        break label$11;
                    }
                    if ((sqlite3StrICmp((this._loadInt(((this._loadInt((_32_ + 8))) + 4))), (this._loadInt(((this._loadInt((_32_ + 4))) + 4))))) == 0) {
                        break label$12;
                    }
                    this._storeInt((_32_ + 12), 2);
                    break label$0;
                }
                while (false);
                label$15:
                do {
                    if (((this._loadInt16u(((this._loadInt((_32_ + 8))) + 2))) & 256) == ((this._loadInt16u(((this._loadInt((_32_ + 4))) + 2))) & 256)) {
                        break label$15;
                    }
                    this._storeInt((_32_ + 12), 1);
                    break label$0;
                }
                while (false);
                label$16:
                do {
                    if (((this._loadInt16u(((this._loadInt((_32_ + 8))) + 2))) & 256) == 0) {
                        break label$16;
                    }
                    if ((this._loadInt(((this._loadInt((_32_ + 8))) + 20))) == (this._loadInt(((this._loadInt((_32_ + 4))) + 20)))) {
                        break label$16;
                    }
                    this._storeInt((_32_ + 12), 2);
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 12), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), 2);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int sqlite3ExprListCompare(int _30_, int _31_)
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
                        label$4:
                        do {
                            if ((this._loadInt((_32_ + 24))) != 0) {
                                break label$4;
                            }
                            if ((this._loadInt((_32_ + 20))) == 0) {
                                break label$3;
                            }
                        }
                        while (false);
                        label$5:
                        do {
                            label$6:
                            do {
                                if ((this._loadInt((_32_ + 24))) == 0) {
                                    break label$6;
                                }
                                if ((this._loadInt((_32_ + 20))) == 0) {
                                    break label$6;
                                }
                                if ((this._loadInt((this._loadInt((_32_ + 24))))) == (this._loadInt((this._loadInt((_32_ + 20)))))) {
                                    break label$5;
                                }
                                this._storeInt((_32_ + 28), 1);
                                break label$0;
                            }
                            while (false);
                            this._storeInt((_32_ + 28), 1);
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_32_ + 16), 0);
                        label$8:
                        do {
                            label$7:
                            while (true) {
                                if ((this._loadInt((_32_ + 16))) >= (this._loadInt((this._loadInt((_32_ + 24)))))) {
                                    break label$2;
                                }
                                this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 24))) + 12))) + ((this._loadInt((_32_ + 16))) * 20)))));
                                this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 20))) + 12))) + ((this._loadInt((_32_ + 16))) * 20)))));
                                if ((this._loadInt8u((((this._loadInt(((this._loadInt((_32_ + 24))) + 12))) + (_31_ = (this._loadInt((_32_ + 16))) * 20)) + 12))) != (this._loadInt8u((((this._loadInt(((this._loadInt((_32_ + 20))) + 12))) + _31_) + 12)))) {
                                    break label$1;
                                }
                                if ((sqlite3ExprCompare((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))))) != 0) {
                                    break label$8;
                                }
                                this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                                continue label$7;
                            }
                        }
                        while (false);
                        this._storeInt((_32_ + 28), 1);
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
            this._storeInt((_32_ + 28), 1);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int exprDup(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_34_ + 56), _31_);
        this._storeInt((_34_ + 52), _32_);
        this._storeInt((_34_ + 48), _33_);
        _33_ = this._storeInt((_34_ + 44), 0);
        label$0:
        do {
            if ((this._loadInt((_34_ + 56))) == 0) {
                break label$0;
            }
            this._storeInt((_34_ + 40), ((this._loadInt((_34_ + 52))) & 1));
            this._storeInt((_34_ + 32), _33_);
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_34_ + 48))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_34_ + 36), (this._loadInt((this._loadInt((_34_ + 48))))));
                    this._storeInt((_34_ + 32), 16384);
                    break label$1;
                }
                while (false);
                this._storeInt((_34_ + 36), (sqlite3DbMallocRaw((this._loadInt((_34_ + 60))), (dupedExprSize((this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 52))))))));
            }
            while (false);
            if ((this._storeInt((_34_ + 44), (this._loadInt((_34_ + 36))))) == 0) {
                break label$0;
            }
            this._storeInt((_34_ + 24), ((this._storeInt((_34_ + 28), (dupedExprStructSize((this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 52))))))) & 4095));
            label$3:
            do {
                label$4:
                do {
                    if (((this._loadInt16u(((this._loadInt((_34_ + 56))) + 2))) & 1024) != 0) {
                        break label$4;
                    }
                    if ((this._loadInt(((this._loadInt((_34_ + 56))) + 4))) == 0) {
                        break label$4;
                    }
                    this._storeInt((_34_ + 20), ((sqlite3Strlen30((this._loadInt(((this._loadInt((_34_ + 56))) + 4))))) + 1));
                    break label$3;
                }
                while (false);
                this._storeInt((_34_ + 20), 0);
            }
            while (false);
            label$5:
            do {
                label$6:
                do {
                    if ((this._loadInt((_34_ + 40))) == 0) {
                        break label$6;
                    }
                    memcpy((this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 24))));
                    break label$5;
                }
                while (false);
                _33_ = this._storeInt((_34_ + 16), (exprStructSize((this._loadInt((_34_ + 56))))));
                memcpy((this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 56))), _33_);
                memset(((this._loadInt((_34_ + 36))) + (_33_ = this._loadInt((_34_ + 16)))), 0, (48 - _33_));
            }
            while (false);
            this._storeInt16(((_33_ = this._loadInt((_34_ + 44))) + 2), ((this._loadInt16u((_33_ + 2))) & 36863));
            this._storeInt16((_33_ + 2), ((this._loadInt16u((_33_ + 2))) | ((this._loadInt((_34_ + 28))) & 12288)));
            this._storeInt16(((_33_ = this._loadInt((_34_ + 44))) + 2), ((this._loadInt16u((_33_ + 2))) | (this._loadInt((_34_ + 32)))));
            label$7:
            do {
                if ((this._loadInt((_34_ + 20))) == 0) {
                    break label$7;
                }
                memcpy((this._storeInt((_34_ + 12), (this._storeInt(((this._loadInt((_34_ + 44))) + 4), ((this._loadInt((_34_ + 36))) + (this._loadInt((_34_ + 24)))))))), (this._loadInt(((this._loadInt((_34_ + 56))) + 4))), (this._loadInt((_34_ + 20))));
            }
            while (false);
            label$8:
            do {
                if ((((this._loadInt16u(((this._loadInt((_34_ + 56))) + 2))) | (this._loadInt16u(((this._loadInt((_34_ + 44))) + 2)))) & 8192) != 0) {
                    break label$8;
                }
                label$9:
                do {
                    if (((this._loadInt16u(((this._loadInt((_34_ + 56))) + 2))) & 2048) == 0) {
                        break label$9;
                    }
                    _33_ = sqlite3SelectDup((this._loadInt((_34_ + 60))), (this._loadInt(((this._loadInt((_34_ + 56))) + 16))), (this._loadInt((_34_ + 40))));
                    this._storeInt(((this._loadInt((_34_ + 44))) + 16), _33_);
                    break label$8;
                }
                while (false);
                _33_ = sqlite3ExprListDup((this._loadInt((_34_ + 60))), (this._loadInt(((this._loadInt((_34_ + 56))) + 16))), (this._loadInt((_34_ + 40))));
                this._storeInt(((this._loadInt((_34_ + 44))) + 16), _33_);
            }
            while (false);
            label$10:
            do {
                if (((this._loadInt16u(((this._loadInt((_34_ + 44))) + 2))) & 12288) == 0) {
                    break label$10;
                }
                this._storeInt((_34_ + 36), ((dupedExprNodeSize((this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 52))))) + (this._loadInt((_34_ + 36)))));
                label$11:
                do {
                    if (((this._loadInt16u(((this._loadInt((_34_ + 44))) + 2))) & 4096) == 0) {
                        break label$11;
                    }
                    _33_ = exprDup((this._loadInt((_34_ + 60))), (this._loadInt(((this._loadInt((_34_ + 56))) + 8))), 1, (_34_ + 36));
                    this._storeInt(((this._loadInt((_34_ + 44))) + 8), _33_);
                    _33_ = exprDup((this._loadInt((_34_ + 60))), (this._loadInt(((this._loadInt((_34_ + 56))) + 12))), 1, (_34_ + 36));
                    this._storeInt(((this._loadInt((_34_ + 44))) + 12), _33_);
                }
                while (false);
                if ((this._loadInt((_34_ + 48))) == 0) {
                    break label$0;
                }
                this._storeInt((this._loadInt((_34_ + 48))), (this._loadInt((_34_ + 36))));
                break label$0;
            }
            while (false);
            _33_ = this._storeInt8(((this._loadInt((_34_ + 44))) + 34), 0);
            if (((this._loadInt16u(((this._loadInt((_34_ + 56))) + 2))) & 8192) != 0) {
                break label$0;
            }
            _32_ = sqlite3ExprDup((this._loadInt((_34_ + 60))), (this._loadInt(((this._loadInt((_34_ + 56))) + 8))), _33_);
            this._storeInt(((this._loadInt((_34_ + 44))) + 8), _32_);
            _33_ = sqlite3ExprDup((this._loadInt((_34_ + 60))), (this._loadInt(((this._loadInt((_34_ + 56))) + 12))), _33_);
            this._storeInt(((this._loadInt((_34_ + 44))) + 12), _33_);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 64));
        return _33_;
    }

    @Override()
    public final int dupedExprSize(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), 0);
        label$0:
        do {
            if ((this._loadInt((_32_ + 12))) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 4), (dupedExprNodeSize((this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 8))))));
            if (((this._loadInt8u((_32_ + 8))) & 1) == 0) {
                break label$0;
            }
            _31_ = dupedExprSize((this._loadInt(((this._loadInt((_32_ + 12))) + 8))), (this._loadInt((_32_ + 8))));
            _30_ = dupedExprSize((this._loadInt(((this._loadInt((_32_ + 12))) + 12))), (this._loadInt((_32_ + 8))));
            this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + (_31_ + _30_)));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int dupedExprStructSize(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if (((this._loadInt8u((_32_ + 8))) & 1) != 0) {
                break label$0;
            }
            this._storeInt((_32_ + 4), 48);
            return (this._loadInt((_32_ + 4)));
        }
        while (false);
        label$1:
        do {
            label$2:
            do {
                if ((this._loadInt(((this._loadInt((_32_ + 12))) + 8))) != 0) {
                    break label$2;
                }
                if ((this._loadInt(((this._loadInt((_32_ + 12))) + 12))) != 0) {
                    break label$2;
                }
                if ((this._loadInt(((this._loadInt((_32_ + 12))) + 20))) != 0) {
                    break label$2;
                }
                if ((this._loadInt(((this._loadInt((_32_ + 12))) + 16))) == 0) {
                    break label$1;
                }
            }
            while (false);
            this._storeInt((_32_ + 4), 4120);
            return (this._loadInt((_32_ + 4)));
        }
        while (false);
        this._storeInt((_32_ + 4), 8200);
        return (this._loadInt((_32_ + 4)));
    }

    @Override()
    public final int exprStructSize(int _30_)
    {
        int _31_ = 0;
        label$0:
        do {
            if (((this._loadInt16u(((this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 8), _30_)) + 2))) & 8192) == 0) {
                break label$0;
            }
            this._storeInt((_31_ + 12), 8);
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        label$1:
        do {
            if (((this._loadInt16u(((this._loadInt((_31_ + 8))) + 2))) & 4096) == 0) {
                break label$1;
            }
            this._storeInt((_31_ + 12), 24);
            return (this._loadInt((_31_ + 12)));
        }
        while (false);
        this._storeInt((_31_ + 12), 48);
        return (this._loadInt((_31_ + 12)));
    }

    @Override()
    public final int sqlite3ExprListDup(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_33_ + 36), _31_);
        this._storeInt((_33_ + 32), _32_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_33_ + 36))) == 0) {
                            break label$3;
                        }
                        if ((this._storeInt((_33_ + 28), (sqlite3DbMallocRaw((this._loadInt((_33_ + 40))), 16)))) == 0) {
                            break label$2;
                        }
                        _31_ = this._storeInt(((_32_ = this._loadInt((_33_ + 28))) + 8), 0);
                        _32_ = this._storeInt((_32_ + 4), (this._loadInt((this._loadInt((_33_ + 36))))));
                        this._storeInt((this._loadInt((_33_ + 28))), _32_);
                        _32_ = this._storeInt((_33_ + 24), (sqlite3DbMallocRaw((this._loadInt((_33_ + 40))), ((this._loadInt((this._loadInt((_33_ + 36))))) * 20))));
                        if ((this._storeInt(((this._loadInt((_33_ + 28))) + 12), _32_)) == 0) {
                            break label$1;
                        }
                        this._storeInt((_33_ + 20), (this._loadInt(((this._loadInt((_33_ + 36))) + 12))));
                        _30_ = this._storeInt((_33_ + 16), _31_);
                        label$5:
                        do {
                            label$4:
                            while (true) {
                                if ((this._loadInt((_33_ + 16))) >= (this._loadInt((this._loadInt((_33_ + 36)))))) {
                                    break label$5;
                                }
                                _32_ = this._storeInt((_33_ + 12), (this._loadInt((this._loadInt((_33_ + 20))))));
                                _32_ = sqlite3ExprDup((this._loadInt((_33_ + 40))), _32_, (this._loadInt((_33_ + 32))));
                                this._storeInt((this._loadInt((_33_ + 24))), _32_);
                                _32_ = sqlite3DbStrDup((this._loadInt((_33_ + 40))), (this._loadInt(((this._loadInt((_33_ + 20))) + 4))));
                                this._storeInt(((this._loadInt((_33_ + 24))) + 4), _32_);
                                _32_ = sqlite3DbStrDup((this._loadInt((_33_ + 40))), (this._loadInt(((this._loadInt((_33_ + 20))) + 8))));
                                this._storeInt(((_31_ = this._loadInt((_33_ + 24))) + 8), _32_);
                                this._storeInt8((_31_ + 12), (this._loadInt8u(((this._loadInt((_33_ + 20))) + 12))));
                                this._storeInt8(((this._loadInt((_33_ + 24))) + 13), _30_);
                                this._storeInt16(((this._loadInt((_33_ + 24))) + 14), (this._loadInt16u(((this._loadInt((_33_ + 20))) + 14))));
                                this._storeInt16(((this._loadInt((_33_ + 24))) + 16), (this._loadInt16u(((this._loadInt((_33_ + 20))) + 16))));
                                this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + 1));
                                this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + 20));
                                this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 20))) + 20));
                                continue label$4;
                            }
                        }
                        while (false);
                        this._storeInt((_33_ + 44), (this._loadInt((_33_ + 28))));
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_33_ + 44), 0);
                    break label$0;
                }
                while (false);
                this._storeInt((_33_ + 44), 0);
                break label$0;
            }
            while (false);
            sqlite3DbFree((this._loadInt((_33_ + 40))), (this._loadInt((_33_ + 28))));
            this._storeInt((_33_ + 44), _31_);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 44));
        this._storeInt((0 + 4), (_33_ + 48));
        return _32_;
    }

    @Override()
    public final int dupedExprNodeSize(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), ((dupedExprStructSize((this._loadInt((_32_ + 12))), _31_)) & 4095));
        label$0:
        do {
            if (((this._loadInt16u(((this._loadInt((_32_ + 12))) + 2))) & 1024) != 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_32_ + 12))) + 4))) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 4), (((sqlite3Strlen30((this._loadInt(((this._loadInt((_32_ + 12))) + 4))))) + (this._loadInt((_32_ + 4)))) + 1));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return ((_31_ + 7) & -8);
    }

    @Override()
    public final int sqlite3ResolveOrderGroupBy(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_34_ + 36), _31_);
        this._storeInt((_34_ + 32), _32_);
        this._storeInt((_34_ + 28), _33_);
        this._storeInt((_34_ + 20), (this._loadInt((this._loadInt((_34_ + 40))))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_34_ + 32))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt8u(((this._loadInt((this._loadInt((_34_ + 40))))) + 30))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt((_34_ + 44), 0);
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((this._loadInt((_34_ + 32))))) <= (this._loadInt(((this._loadInt((_34_ + 20))) + 80)))) {
                    break label$3;
                }
                _33_ = this._loadInt((_34_ + 40));
                this._storeInt(_34_, (this._loadInt((_34_ + 28))));
                sqlite3ErrorMsg(_33_, 40240, _34_);
                this._storeInt((_34_ + 44), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 16), (this._loadInt((this._loadInt((_34_ + 36))))));
            this._storeInt((_34_ + 24), 0);
            this._storeInt((_34_ + 12), (this._loadInt(((this._loadInt((_34_ + 32))) + 12))));
            label$4:
            do {
                label$6:
                do {
                    label$5:
                    while (true) {
                        if ((this._loadInt((_34_ + 24))) >= (this._loadInt((this._loadInt((_34_ + 32)))))) {
                            break label$6;
                        }
                        label$7:
                        do {
                            if ((this._loadInt16u(((this._loadInt((_34_ + 12))) + 14))) == 0) {
                                break label$7;
                            }
                            if ((this._loadInt16u(((this._loadInt((_34_ + 12))) + 14))) > (this._loadInt((this._loadInt((_34_ + 16)))))) {
                                break label$4;
                            }
                            resolveAlias((this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 16))), ((this._loadInt16u(((_33_ = this._loadInt((_34_ + 12))) + 14))) + -1), (this._loadInt(_33_)), (this._loadInt((_34_ + 28))));
                        }
                        while (false);
                        this._storeInt((_34_ + 24), ((this._loadInt((_34_ + 24))) + 1));
                        this._storeInt((_34_ + 12), ((this._loadInt((_34_ + 12))) + 20));
                        continue label$5;
                    }
                }
                while (false);
                this._storeInt((_34_ + 44), 0);
                break label$0;
            }
            while (false);
            resolveOutOfRangeError((this._loadInt((_34_ + 40))), (this._loadInt((_34_ + 28))), ((this._loadInt((_34_ + 24))) + 1), (this._loadInt((this._loadInt((_34_ + 16))))));
            this._storeInt((_34_ + 44), 1);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 44));
        this._storeInt((0 + 4), (_34_ + 48));
        return _33_;
    }

    @Override()
    public final void resolveAlias(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_35_ + 40), _31_);
        this._storeInt((_35_ + 36), _32_);
        this._storeInt((_35_ + 32), _33_);
        this._storeInt((_35_ + 28), _34_);
        this._storeInt((_35_ + 24), (this._loadInt(((this._loadInt(((this._loadInt((_35_ + 40))) + 12))) + ((this._loadInt((_35_ + 36))) * 20)))));
        this._storeInt((_35_ + 16), (this._loadInt((this._loadInt((_35_ + 44))))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt8u((this._loadInt((_35_ + 24))))) == 152) {
                        break label$2;
                    }
                    if ((this._loadInt8s((this._loadInt((_35_ + 28))))) == 71) {
                        break label$2;
                    }
                    _34_ = this._storeInt((_35_ + 20), (sqlite3ExprDup((this._loadInt((_35_ + 16))), (this._loadInt((_35_ + 24))), 0)));
                    if ((this._storeInt((_35_ + 20), (sqlite3PExpr((this._loadInt((_35_ + 44))), 24, _34_, 0, 0)))) == 0) {
                        break label$0;
                    }
                    label$3:
                    do {
                        if ((this._loadInt16u((((this._loadInt(((this._loadInt((_35_ + 40))) + 12))) + ((this._loadInt((_35_ + 36))) * 20)) + 16))) != 0) {
                            break label$3;
                        }
                        _34_ = this._storeInt(((_34_ = this._loadInt((_35_ + 44))) + 472), ((this._loadInt((_34_ + 472))) + 1));
                        this._storeInt16((((this._loadInt(((this._loadInt((_35_ + 40))) + 12))) + ((this._loadInt((_35_ + 36))) * 20)) + 16), _34_);
                    }
                    while (false);
                    this._storeInt(((this._loadInt((_35_ + 20))) + 24), (this._loadInt16u((((this._loadInt(((this._loadInt((_35_ + 40))) + 12))) + ((this._loadInt((_35_ + 36))) * 20)) + 16))));
                    break label$1;
                }
                while (false);
                label$4:
                do {
                    if (((this._loadInt16u(((this._loadInt((_35_ + 24))) + 2))) & 1024) != 0) {
                        break label$4;
                    }
                    if ((this._loadInt(((this._loadInt((_35_ + 24))) + 4))) == 0) {
                        break label$4;
                    }
                    this._storeInt((_35_ + 12), (this._loadInt(((this._loadInt((_35_ + 24))) + 4))));
                    _33_ = this._storeInt(((_34_ = this._loadInt((_35_ + 24))) + 4), 0);
                    _34_ = this._storeInt((_35_ + 20), (sqlite3ExprDup((this._loadInt((_35_ + 16))), _34_, _33_)));
                    this._storeInt(((this._loadInt((_35_ + 24))) + 4), (this._loadInt((_35_ + 12))));
                    if (_34_ == 0) {
                        break label$0;
                    }
                    this._storeInt8(((_34_ = this._loadInt((_35_ + 20))) + 34), ((this._loadInt8u((_34_ + 34))) | 1));
                    _34_ = sqlite3DbStrDup((this._loadInt((_35_ + 16))), (this._loadInt((_35_ + 12))));
                    this._storeInt(((this._loadInt((_35_ + 20))) + 4), _34_);
                    break label$1;
                }
                while (false);
                if ((this._storeInt((_35_ + 20), (sqlite3ExprDup((this._loadInt((_35_ + 16))), (this._loadInt((_35_ + 24))), 0)))) == 0) {
                    break label$0;
                }
            }
            while (false);
            label$5:
            do {
                if (((this._loadInt16u(((this._loadInt((_35_ + 32))) + 2))) & 256) == 0) {
                    break label$5;
                }
                this._storeInt(((_34_ = this._loadInt((_35_ + 20))) + 20), (this._loadInt(((this._loadInt((_35_ + 32))) + 20))));
                this._storeInt16((_34_ + 2), ((this._loadInt16u((_34_ + 2))) | 256));
            }
            while (false);
            this._storeInt16(((_34_ = this._loadInt((_35_ + 32))) + 2), ((this._loadInt16u((_34_ + 2))) | 16384));
            sqlite3ExprDelete((this._loadInt((_35_ + 16))), _34_);
            memcpy((this._loadInt((_35_ + 32))), (this._loadInt((_35_ + 20))), 48);
            sqlite3DbFree((this._loadInt((_35_ + 16))), (this._loadInt((_35_ + 20))));
        }
        while (false);
        this._storeInt((0 + 4), (_35_ + 48));
        return;
    }

    @Override()
    public final int sqlite3ExprCheckHeight(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 20), 0);
        _31_ = this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt((this._loadInt((_32_ + 28))))) + 84))));
        label$0:
        do {
            if ((this._loadInt((_32_ + 24))) <= _31_) {
                break label$0;
            }
            _31_ = this._loadInt((_32_ + 28));
            this._storeInt(_32_, (this._loadInt((_32_ + 16))));
            sqlite3ErrorMsg(_31_, 40272, _32_);
            this._storeInt((_32_ + 20), 1);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 20));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int lookupName(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_)
    {
        int _36_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        int _temp$3 = 0;
        int _temp$4 = 0;
        int _temp$5 = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 192))) + 184), _30_);
        this._storeInt((_36_ + 180), _31_);
        this._storeInt((_36_ + 176), _32_);
        this._storeInt((_36_ + 172), _33_);
        this._storeInt((_36_ + 168), _34_);
        this._storeInt((_36_ + 164), _35_);
        _35_ = this._storeInt((_36_ + 148), (this._storeInt((_36_ + 152), 0)));
        this._storeInt((_36_ + 144), (this._loadInt((this._loadInt((_36_ + 184))))));
        this._storeInt((_36_ + 136), _35_);
        this._storeInt((_36_ + 132), (this._loadInt((_36_ + 168))));
        _35_ = this._storeInt((_36_ + 124), (this._storeInt((_36_ + 128), _35_)));
        _32_ = this._storeInt(((_34_ = this._loadInt((_36_ + 164))) + 24), -1);
        _31_ = this._storeInt((_34_ + 40), _35_);
        label$0:
        while (true) {
            _35_ = 0;
            label$2:
            do {
                if ((this._loadInt((_36_ + 168))) == 0) {
                    break label$2;
                }
                _35_ = ((this._loadInt((_36_ + 152))) == 0) ? 1 : 0;
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
                                if (_35_ == 0) {
                                    break label$7;
                                }
                                if ((this._storeInt((_36_ + 116), (this._loadInt(((this._loadInt((_36_ + 168))) + 4))))) == 0) {
                                    break label$6;
                                }
                                _33_ = this._storeInt((_36_ + 160), _31_);
                                this._storeInt((_36_ + 140), ((this._loadInt((_36_ + 116))) + 8));
                                label$8:
                                while (true) {
                                    if ((this._loadInt((_36_ + 160))) >= (this._loadInt16s((this._loadInt((_36_ + 116)))))) {
                                        break label$6;
                                    }
                                    _35_ = this._storeInt((_36_ + 112), (this._loadInt(((this._loadInt((_36_ + 140))) + 12))));
                                    this._storeInt((_36_ + 108), (sqlite3SchemaToIndex((this._loadInt((_36_ + 144))), (this._loadInt((_35_ + 68))))));
                                    label$10:
                                    do {
                                        label$11:
                                        do {
                                            if ((this._loadInt((_36_ + 176))) == 0) {
                                                break label$11;
                                            }
                                            label$12:
                                            do {
                                                if ((this._loadInt(((this._loadInt((_36_ + 140))) + 8))) == 0) {
                                                    break label$12;
                                                }
                                                if ((sqlite3StrICmp((this._storeInt((_36_ + 100), (this._loadInt(((this._loadInt((_36_ + 140))) + 8))))), (this._loadInt((_36_ + 176))))) != 0) {
                                                    break label$10;
                                                }
                                                break label$11;
                                            }
                                            while (false);
                                            if ((this._storeInt((_36_ + 96), (this._loadInt((this._loadInt((_36_ + 112))))))) == 0) {
                                                break label$10;
                                            }
                                            if ((sqlite3StrICmp((this._loadInt((_36_ + 96))), (this._loadInt((_36_ + 176))))) != 0) {
                                                break label$10;
                                            }
                                            if ((this._loadInt((_36_ + 180))) == 0) {
                                                break label$11;
                                            }
                                            if ((sqlite3StrICmp((this._loadInt(((this._loadInt(((this._loadInt((_36_ + 144))) + 8))) + ((this._loadInt((_36_ + 108))) << 4)))), (this._loadInt((_36_ + 180))))) != 0) {
                                                break label$10;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_36_ + 148), ((_35_ = this._loadInt((_36_ + 148))) + 1));
                                        label$13:
                                        do {
                                            if (_35_ != 0) {
                                                break label$13;
                                            }
                                            this._storeInt(((_35_ = this._loadInt((_36_ + 164))) + 24), (this._loadInt(((this._loadInt((_36_ + 140))) + 24))));
                                            this._storeInt((_35_ + 40), (this._loadInt((_36_ + 112))));
                                            this._storeInt((_36_ + 128), (this._loadInt(((this._loadInt((_36_ + 112))) + 68))));
                                            this._storeInt((_36_ + 136), (this._loadInt((_36_ + 140))));
                                        }
                                        while (false);
                                        _34_ = this._storeInt((_36_ + 156), _33_);
                                        this._storeInt((_36_ + 104), (this._loadInt(((this._loadInt((_36_ + 112))) + 12))));
                                        label$15:
                                        do {
                                            label$14:
                                            while (true) {
                                                if ((this._loadInt((_36_ + 156))) >= (this._loadInt(((this._loadInt((_36_ + 112))) + 8)))) {
                                                    break label$10;
                                                }
                                                if ((sqlite3StrICmp((this._loadInt((this._loadInt((_36_ + 104))))), (this._loadInt((_36_ + 172))))) == 0) {
                                                    break label$15;
                                                }
                                                this._storeInt((_36_ + 156), ((this._loadInt((_36_ + 156))) + 1));
                                                this._storeInt((_36_ + 104), ((this._loadInt((_36_ + 104))) + 24));
                                                continue label$14;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_36_ + 152), ((this._loadInt((_36_ + 152))) + 1));
                                        this._storeInt(((_35_ = this._loadInt((_36_ + 164))) + 24), (this._loadInt(((this._loadInt((_36_ + 140))) + 24))));
                                        this._storeInt((_35_ + 40), (this._loadInt((_36_ + 112))));
                                        this._storeInt((_36_ + 136), (this._loadInt((_36_ + 140))));
                                        this._storeInt((_36_ + 128), (this._loadInt(((this._loadInt((_36_ + 112))) + 68))));
                                        _35_ = -1;
                                        label$16:
                                        do {
                                            if ((this._loadInt((_36_ + 156))) == (this._loadInt(((this._loadInt((_36_ + 112))) + 4)))) {
                                                break label$16;
                                            }
                                            _35_ = this._loadInt16s((_36_ + 156));
                                        }
                                        while (false);
                                        this._storeInt16(((this._loadInt((_36_ + 164))) + 28), _35_);
                                        if ((this._loadInt((_36_ + 160))) >= ((this._loadInt16s((this._loadInt((_36_ + 116))))) + _32_)) {
                                            break label$10;
                                        }
                                        label$17:
                                        do {
                                            if (((this._loadInt8u(((this._loadInt((_36_ + 140))) + 77))) & 4) == 0) {
                                                break label$17;
                                            }
                                            this._storeInt((_36_ + 140), ((this._loadInt((_36_ + 140))) + 56));
                                            this._storeInt((_36_ + 160), ((this._loadInt((_36_ + 160))) + 1));
                                            break label$10;
                                        }
                                        while (false);
                                        if ((this._storeInt((_36_ + 92), (this._loadInt(((this._loadInt((_36_ + 140))) + 88))))) == 0) {
                                            break label$10;
                                        }
                                        this._storeInt((_36_ + 88), _34_);
                                        label$19:
                                        do {
                                            label$18:
                                            while (true) {
                                                if ((this._loadInt((_36_ + 88))) >= (this._loadInt(((this._loadInt((_36_ + 92))) + 4)))) {
                                                    break label$10;
                                                }
                                                if ((sqlite3StrICmp((this._loadInt(((this._loadInt((this._loadInt((_36_ + 92))))) + ((this._loadInt((_36_ + 88))) << 3)))), (this._loadInt((_36_ + 172))))) == 0) {
                                                    break label$19;
                                                }
                                                this._storeInt((_36_ + 88), ((this._loadInt((_36_ + 88))) + 1));
                                                continue label$18;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_36_ + 140), ((this._loadInt((_36_ + 140))) + 56));
                                        this._storeInt((_36_ + 160), ((this._loadInt((_36_ + 160))) + 1));
                                    }
                                    while (false);
                                    this._storeInt((_36_ + 160), ((this._loadInt((_36_ + 160))) + 1));
                                    this._storeInt((_36_ + 140), ((this._loadInt((_36_ + 140))) + 56));
                                    continue label$8;
                                }
                            }
                            while (false);
                            label$20:
                            do {
                                if ((this._loadInt((_36_ + 152))) != 0) {
                                    break label$20;
                                }
                                if ((this._loadInt((_36_ + 176))) != 0) {
                                    break label$20;
                                }
                                if (((this._loadInt16u(((this._loadInt((_36_ + 164))) + 2))) & 64) == 0) {
                                    break label$20;
                                }
                                this._storeInt8((this._loadInt((_36_ + 164))), 94);
                                this._storeInt(((this._loadInt((_36_ + 164))) + 40), 0);
                                this._storeInt((_36_ + 188), 1);
                                break label$4;
                            }
                            while (false);
                            label$21:
                            do {
                                if ((this._loadInt((_36_ + 152))) == 1) {
                                    break label$21;
                                }
                                _temp$0 = 40672;
                                _temp$1 = 40656;
                                _temp$2 = ((this._loadInt((_36_ + 152))) != 0) ? _temp$0 : _temp$1;
                                this._storeInt((_36_ + 60), _temp$2);
                                label$22:
                                do {
                                    label$23:
                                    do {
                                        if ((this._loadInt((_36_ + 180))) == 0) {
                                            break label$23;
                                        }
                                        this._storeInt((_36_ + 28), (this._loadInt((_36_ + 172))));
                                        this._storeInt((_36_ + 24), (this._loadInt((_36_ + 176))));
                                        this._storeInt((_36_ + 20), (this._loadInt((_36_ + 180))));
                                        _35_ = this._loadInt((_36_ + 184));
                                        this._storeInt((_36_ + 16), (this._loadInt((_36_ + 60))));
                                        sqlite3ErrorMsg(_35_, 40704, (_36_ + 16));
                                        break label$22;
                                    }
                                    while (false);
                                    label$24:
                                    do {
                                        if ((this._loadInt((_36_ + 176))) == 0) {
                                            break label$24;
                                        }
                                        this._storeInt((_36_ + 40), (this._loadInt((_36_ + 172))));
                                        this._storeInt((_36_ + 36), (this._loadInt((_36_ + 176))));
                                        _35_ = this._loadInt((_36_ + 184));
                                        this._storeInt((_36_ + 32), (this._loadInt((_36_ + 60))));
                                        sqlite3ErrorMsg(_35_, 32192, (_36_ + 32));
                                        break label$22;
                                    }
                                    while (false);
                                    this._storeInt((_36_ + 52), (this._loadInt((_36_ + 172))));
                                    _35_ = this._loadInt((_36_ + 184));
                                    this._storeInt((_36_ + 48), (this._loadInt((_36_ + 60))));
                                    sqlite3ErrorMsg(_35_, 32208, (_36_ + 48));
                                }
                                while (false);
                                _35_ = this._storeInt8(((this._loadInt((_36_ + 184))) + 18), 1);
                                this._storeInt(((_34_ = this._loadInt((_36_ + 132))) + 16), (_35_ + (this._loadInt((_34_ + 16)))));
                            }
                            while (false);
                            label$25:
                            do {
                                if ((this._loadInt16s(((this._loadInt((_36_ + 164))) + 28))) < 0) {
                                    break label$25;
                                }
                                if ((this._loadInt((_36_ + 136))) == 0) {
                                    break label$25;
                                }
                                label$26:
                                do {
                                    if ((this._storeInt((_36_ + 56), (this._loadInt16s(((this._loadInt((_36_ + 164))) + 28))))) < 64) {
                                        break label$26;
                                    }
                                    this._storeInt((_36_ + 56), 63);
                                }
                                while (false);
                                this._storeLong(((_35_ = this._loadInt((_36_ + 136))) + 40), ((this._loadLong((_35_ + 40))) | (1L << (this._loadLong32u((_36_ + 56))))));
                            }
                            while (false);
                            sqlite3ExprDelete((this._loadInt((_36_ + 144))), (this._loadInt(((this._loadInt((_36_ + 164))) + 8))));
                            _34_ = this._storeInt(((_35_ = this._loadInt((_36_ + 164))) + 8), 0);
                            sqlite3ExprDelete((this._loadInt((_36_ + 144))), (this._loadInt((_35_ + 12))));
                            this._storeInt(((_35_ = this._loadInt((_36_ + 164))) + 12), _34_);
                            _temp$3 = 60;
                            _temp$4 = 152;
                            _temp$5 = ((this._loadInt((_36_ + 124))) != 0) ? _temp$3 : _temp$4;
                            this._storeInt8(_35_, _temp$5);
                            break label$5;
                        }
                        while (false);
                        label$27:
                        do {
                            if ((this._loadInt((_36_ + 180))) != 0) {
                                break label$27;
                            }
                            if ((this._loadInt((_36_ + 176))) == 0) {
                                break label$27;
                            }
                            if ((this._loadInt((_36_ + 152))) != 0) {
                                break label$27;
                            }
                            if ((this._loadInt(((this._loadInt((_36_ + 184))) + 428))) == 0) {
                                break label$27;
                            }
                            this._storeInt((_36_ + 84), (this._loadInt8u(((this._loadInt((_36_ + 184))) + 440))));
                            _35_ = this._storeInt((_36_ + 80), _31_);
                            label$28:
                            do {
                                label$29:
                                do {
                                    label$30:
                                    do {
                                        if ((this._loadInt((_36_ + 84))) == 106) {
                                            break label$30;
                                        }
                                        if ((sqlite3StrICmp(40592, (this._loadInt((_36_ + 176))))) == 0) {
                                            break label$29;
                                        }
                                    }
                                    while (false);
                                    if ((this._loadInt((_36_ + 84))) == 105) {
                                        break label$28;
                                    }
                                    if ((sqlite3StrICmp(40608, (this._loadInt((_36_ + 176))))) != 0) {
                                        break label$28;
                                    }
                                    this._storeInt(((this._loadInt((_36_ + 164))) + 24), _35_);
                                    this._storeInt((_36_ + 80), (this._loadInt(((this._loadInt((_36_ + 184))) + 428))));
                                    break label$28;
                                }
                                while (false);
                                this._storeInt(((this._loadInt((_36_ + 164))) + 24), 1);
                                this._storeInt((_36_ + 80), (this._loadInt(((this._loadInt((_36_ + 184))) + 428))));
                            }
                            while (false);
                            if ((this._loadInt((_36_ + 80))) == 0) {
                                break label$27;
                            }
                            this._storeInt((_36_ + 128), (this._loadInt(((this._loadInt((_36_ + 80))) + 68))));
                            this._storeInt((_36_ + 148), ((this._loadInt((_36_ + 148))) + 1));
                            this._storeInt((_36_ + 76), _35_);
                            label$31:
                            do {
                                label$33:
                                do {
                                    label$32:
                                    while (true) {
                                        if ((this._loadInt((_36_ + 76))) >= (this._loadInt(((this._loadInt((_36_ + 80))) + 8)))) {
                                            break label$31;
                                        }
                                        if ((sqlite3StrICmp((this._loadInt((this._storeInt((_36_ + 72), ((this._loadInt(((this._loadInt((_36_ + 80))) + 12))) + ((this._loadInt((_36_ + 76))) * 24)))))), (this._loadInt((_36_ + 172))))) == 0) {
                                            break label$33;
                                        }
                                        this._storeInt((_36_ + 76), ((this._loadInt((_36_ + 76))) + 1));
                                        continue label$32;
                                    }
                                }
                                while (false);
                                if ((this._loadInt((_36_ + 76))) != (this._loadInt(((this._loadInt((_36_ + 80))) + 4)))) {
                                    break label$31;
                                }
                                this._storeInt((_36_ + 76), _32_);
                            }
                            while (false);
                            label$34:
                            do {
                                if ((this._loadInt((_36_ + 76))) < (this._loadInt(((this._loadInt((_36_ + 80))) + 8)))) {
                                    break label$34;
                                }
                                if ((sqlite3IsRowid((this._loadInt((_36_ + 172))))) == 0) {
                                    break label$34;
                                }
                                this._storeInt((_36_ + 76), _32_);
                            }
                            while (false);
                            if ((this._loadInt((_36_ + 76))) >= (this._loadInt(((this._loadInt((_36_ + 80))) + 8)))) {
                                break label$27;
                            }
                            this._storeInt((_36_ + 152), ((this._loadInt((_36_ + 152))) + 1));
                            label$35:
                            do {
                                label$36:
                                do {
                                    label$37:
                                    do {
                                        if ((this._loadInt((_36_ + 76))) <= _32_) {
                                            break label$37;
                                        }
                                        if ((this._loadInt(((this._loadInt((_36_ + 164))) + 24))) == 0) {
                                            break label$36;
                                        }
                                        _35_ = -1;
                                        label$38:
                                        do {
                                            if ((this._loadInt((_36_ + 76))) > 31) {
                                                break label$38;
                                            }
                                            _35_ = 1 << (this._loadInt((_36_ + 76)));
                                        }
                                        while (false);
                                        this._storeInt(((_34_ = this._loadInt((_36_ + 184))) + 436), ((this._loadInt((_34_ + 436))) | _35_));
                                        break label$35;
                                    }
                                    while (false);
                                    this._storeInt8(((this._loadInt((_36_ + 164))) + 1), 100);
                                    break label$35;
                                }
                                while (false);
                                _35_ = -1;
                                label$39:
                                do {
                                    if ((this._loadInt((_36_ + 76))) > 31) {
                                        break label$39;
                                    }
                                    _35_ = 1 << (this._loadInt((_36_ + 76)));
                                }
                                while (false);
                                this._storeInt(((_34_ = this._loadInt((_36_ + 184))) + 432), ((this._loadInt((_34_ + 432))) | _35_));
                            }
                            while (false);
                            this._storeInt16(((_35_ = this._loadInt((_36_ + 164))) + 28), (this._loadInt((_36_ + 76))));
                            this._storeInt((_35_ + 40), (this._loadInt((_36_ + 80))));
                            this._storeInt((_36_ + 124), 1);
                        }
                        while (false);
                        label$40:
                        do {
                            if ((this._loadInt((_36_ + 152))) != 0) {
                                break label$40;
                            }
                            if ((this._loadInt((_36_ + 148))) != 1) {
                                break label$40;
                            }
                            if ((sqlite3IsRowid((this._loadInt((_36_ + 172))))) == 0) {
                                break label$40;
                            }
                            this._storeInt((_36_ + 152), 1);
                            this._storeInt16(((_35_ = this._loadInt((_36_ + 164))) + 28), 65535);
                            this._storeInt8((_35_ + 1), 100);
                        }
                        while (false);
                        if ((this._loadInt((_36_ + 152))) != 0) {
                            break label$3;
                        }
                        if ((this._storeInt((_36_ + 120), (this._loadInt(((this._loadInt((_36_ + 168))) + 8))))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt((_36_ + 176))) != 0) {
                            break label$3;
                        }
                        this._storeInt((_36_ + 156), _31_);
                        label$42:
                        do {
                            label$41:
                            while (true) {
                                if ((this._loadInt((_36_ + 156))) >= (this._loadInt((this._loadInt((_36_ + 120)))))) {
                                    break label$3;
                                }
                                label$43:
                                do {
                                    if ((this._storeInt((_36_ + 68), (this._loadInt((((this._loadInt(((this._loadInt((_36_ + 120))) + 12))) + ((this._loadInt((_36_ + 156))) * 20)) + 4))))) == 0) {
                                        break label$43;
                                    }
                                    if ((sqlite3StrICmp((this._loadInt((_36_ + 68))), (this._loadInt((_36_ + 172))))) == 0) {
                                        break label$42;
                                    }
                                }
                                while (false);
                                this._storeInt((_36_ + 156), ((this._loadInt((_36_ + 156))) + 1));
                                continue label$41;
                            }
                        }
                        while (false);
                        this._storeInt((_36_ + 64), (this._loadInt(((this._loadInt(((this._loadInt((_36_ + 120))) + 12))) + ((this._loadInt((_36_ + 156))) * 20)))));
                        label$44:
                        do {
                            if ((this._loadInt8u(((this._loadInt((_36_ + 168))) + 20))) != 0) {
                                break label$44;
                            }
                            if (((this._loadInt16u(((this._loadInt((_36_ + 64))) + 2))) & 2) == 0) {
                                break label$44;
                            }
                            _35_ = this._loadInt((_36_ + 184));
                            this._storeInt(_36_, (this._loadInt((_36_ + 68))));
                            sqlite3ErrorMsg(_35_, 40624, _36_);
                            this._storeInt((_36_ + 188), 2);
                            break label$4;
                        }
                        while (false);
                        resolveAlias((this._loadInt((_36_ + 184))), (this._loadInt((_36_ + 120))), (this._loadInt((_36_ + 156))), (this._loadInt((_36_ + 164))), 21392);
                        this._storeInt((_36_ + 152), 1);
                        this._storeInt((_36_ + 136), 0);
                    }
                    while (false);
                    label$45:
                    do {
                        if ((this._loadInt((_36_ + 152))) != 1) {
                            break label$45;
                        }
                        sqlite3AuthRead((this._loadInt((_36_ + 184))), (this._loadInt((_36_ + 164))), (this._loadInt((_36_ + 128))), (this._loadInt(((this._loadInt((_36_ + 168))) + 4))));
                        label$47:
                        do {
                            label$46:
                            while (true) {
                                this._storeInt(((_35_ = this._loadInt((_36_ + 132))) + 12), ((this._loadInt((_35_ + 12))) + 1));
                                if (_35_ == (this._loadInt((_36_ + 168)))) {
                                    break label$47;
                                }
                                this._storeInt((_36_ + 132), (this._loadInt(((this._loadInt((_36_ + 132))) + 32))));
                                continue label$46;
                            }
                        }
                        while (false);
                        this._storeInt((_36_ + 188), 1);
                        break label$4;
                    }
                    while (false);
                    this._storeInt((_36_ + 188), 2);
                }
                while (false);
                _35_ = this._loadInt((_36_ + 188));
                this._storeInt((0 + 4), (_36_ + 192));
                return _35_;
            }
            while (false);
            if ((this._loadInt((_36_ + 152))) != 0) {
                continue label$0;
            }
            this._storeInt((_36_ + 168), (this._loadInt(((this._loadInt((_36_ + 168))) + 32))));
            continue label$0;
        }
    }

    @Override()
    public final int sqlite3IsRowid(int _30_)
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
                        if ((sqlite3StrICmp((this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_)), 40816)) == 0) {
                            break label$3;
                        }
                        if ((sqlite3StrICmp((this._loadInt((_31_ + 8))), 40720)) == 0) {
                            break label$2;
                        }
                        if ((sqlite3StrICmp((this._loadInt((_31_ + 8))), 40832)) == 0) {
                            break label$1;
                        }
                        this._storeInt((_31_ + 12), 0);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_31_ + 12), 1);
                    break label$0;
                }
                while (false);
                this._storeInt((_31_ + 12), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_31_ + 12), 1);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 12));
        this._storeInt((0 + 4), (_31_ + 16));
        return _30_;
    }

    @Override()
    public final void sqlite3AuthRead(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_34_ + 40), _31_);
        this._storeInt((_34_ + 36), _32_);
        this._storeInt((_34_ + 32), _33_);
        this._storeInt((_34_ + 28), (this._loadInt((this._loadInt((_34_ + 44))))));
        _33_ = this._storeInt((_34_ + 24), 0);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_34_ + 28))) + 268))) == 0) {
                break label$0;
            }
            if ((this._storeInt((_34_ + 12), (sqlite3SchemaToIndex((this._loadInt((this._loadInt((_34_ + 44))))), (this._loadInt((_34_ + 36))))))) < _33_) {
                break label$0;
            }
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt8u((this._loadInt((_34_ + 40))))) != 60) {
                        break label$2;
                    }
                    this._storeInt((_34_ + 24), (this._loadInt(((this._loadInt((_34_ + 44))) + 428))));
                    break label$1;
                }
                while (false);
                this._storeInt((_34_ + 16), 0);
                label$4:
                do {
                    label$3:
                    while (true) {
                        if ((this._loadInt((_34_ + 16))) >= (this._loadInt16s((this._loadInt((_34_ + 32)))))) {
                            break label$1;
                        }
                        if ((this._loadInt(((this._loadInt((_34_ + 40))) + 24))) == (this._loadInt((((this._loadInt((_34_ + 32))) + ((this._loadInt((_34_ + 16))) * 56)) + 32)))) {
                            break label$4;
                        }
                        this._storeInt((_34_ + 16), ((this._loadInt((_34_ + 16))) + 1));
                        continue label$3;
                    }
                }
                while (false);
                this._storeInt((_34_ + 24), (this._loadInt((((this._loadInt((_34_ + 32))) + ((this._loadInt((_34_ + 16))) * 56)) + 20))));
            }
            while (false);
            this._storeInt((_34_ + 8), (this._loadInt16s(((this._loadInt((_34_ + 40))) + 28))));
            if ((this._loadInt((_34_ + 24))) == 0) {
                break label$0;
            }
            label$5:
            do {
                label$6:
                do {
                    if ((this._loadInt((_34_ + 8))) < 0) {
                        break label$6;
                    }
                    this._storeInt((_34_ + 20), (this._loadInt(((this._loadInt(((this._loadInt((_34_ + 24))) + 12))) + ((this._loadInt((_34_ + 8))) * 24)))));
                    break label$5;
                }
                while (false);
                label$7:
                do {
                    if ((this._loadInt(((this._loadInt((_34_ + 24))) + 4))) < 0) {
                        break label$7;
                    }
                    this._storeInt((_34_ + 20), (this._loadInt(((this._loadInt(((_33_ = this._loadInt((_34_ + 24))) + 12))) + ((this._loadInt((_33_ + 4))) * 24)))));
                    break label$5;
                }
                while (false);
                this._storeInt((_34_ + 20), 40720);
            }
            while (false);
            if ((sqlite3AuthReadCol((this._loadInt((_34_ + 44))), (this._loadInt((this._loadInt((_34_ + 24))))), (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 12))))) != 2) {
                break label$0;
            }
            this._storeInt8((this._loadInt((_34_ + 40))), 98);
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 48));
        return;
    }

    @Override()
    public final int sqlite3AuthReadCol(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 64))) + 60), _30_);
        this._storeInt((_34_ + 56), _31_);
        this._storeInt((_34_ + 52), _32_);
        this._storeInt((_34_ + 48), _33_);
        _33_ = this._storeInt((_34_ + 40), (this._loadInt(((this._loadInt(((this._storeInt((_34_ + 44), (this._loadInt((this._loadInt((_34_ + 60))))))) + 8))) + ((this._loadInt((_34_ + 48))) << 4)))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeInt((_34_ + 36), (this._iiiiiiiTable[this._tableIndices[this._loadInt(((_32_ = this._loadInt((_34_ + 44))) + 268))]].invoke((this._loadInt((_32_ + 272))), 20, (this._loadInt((_34_ + 56))), (this._loadInt((_34_ + 52))), _33_, (this._loadInt(((this._loadInt((_34_ + 60))) + 516))))))) != 1) {
                            break label$3;
                        }
                        label$4:
                        do {
                            if ((this._loadInt(((this._loadInt((_34_ + 44))) + 4))) > 2) {
                                break label$4;
                            }
                            if ((this._loadInt((_34_ + 48))) == 0) {
                                break label$2;
                            }
                        }
                        while (false);
                        this._storeInt((_34_ + 8), (this._loadInt((_34_ + 52))));
                        this._storeInt((_34_ + 4), (this._loadInt((_34_ + 56))));
                        _33_ = this._loadInt((_34_ + 60));
                        this._storeInt(_34_, (this._loadInt((_34_ + 40))));
                        sqlite3ErrorMsg(_33_, 40736, _34_);
                        break label$1;
                    }
                    while (false);
                    if ((this._loadInt((_34_ + 36))) == 2) {
                        break label$0;
                    }
                    if ((this._loadInt((_34_ + 36))) == 0) {
                        break label$0;
                    }
                    sqliteAuthBadReturnCode((this._loadInt((_34_ + 60))));
                    break label$0;
                }
                while (false);
                this._storeInt((_34_ + 20), (this._loadInt((_34_ + 52))));
                _33_ = this._loadInt((_34_ + 60));
                this._storeInt((_34_ + 16), (this._loadInt((_34_ + 56))));
                sqlite3ErrorMsg(_33_, 40784, (_34_ + 16));
            }
            while (false);
            this._storeInt(((this._loadInt((_34_ + 60))) + 4), 23);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 36));
        this._storeInt((0 + 4), (_34_ + 64));
        return _33_;
    }

    @Override()
    public final int selectExpander(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        int _34_ = 0;
        int _35_ = 0;
        int _36_ = 0;
        this._storeInt(((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 176))) + 168), _30_);
        this._storeInt((_36_ + 164), _31_);
        this._storeInt((_36_ + 160), (this._loadInt(((this._loadInt((_36_ + 168))) + 8))));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt8u(((this._storeInt((_36_ + 132), (this._loadInt((this._loadInt((_36_ + 160))))))) + 30))) == 0) {
                    break label$1;
                }
                this._storeInt((_36_ + 172), 2);
                break label$0;
            }
            while (false);
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt(((this._loadInt((_36_ + 164))) + 8))) == 0) {
                        break label$3;
                    }
                    if (((this._loadInt16u(((this._loadInt((_36_ + 164))) + 6))) & 16) == 0) {
                        break label$2;
                    }
                }
                while (false);
                this._storeInt((_36_ + 172), 1);
                break label$0;
            }
            while (false);
            this._storeInt16(((_31_ = this._loadInt((_36_ + 164))) + 6), ((this._loadInt16u((_31_ + 6))) | 16));
            this._storeInt((_36_ + 144), (this._loadInt((_31_ + 8))));
            this._storeInt((_36_ + 140), (this._loadInt((this._loadInt((_36_ + 164))))));
            sqlite3SrcListAssignCursors((this._loadInt((_36_ + 160))), (this._loadInt((_36_ + 144))));
            _30_ = this._storeInt((_36_ + 156), 0);
            this._storeInt((_36_ + 136), ((this._loadInt((_36_ + 144))) + 8));
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
                                            if ((this._loadInt((_36_ + 156))) >= (this._loadInt16s((this._loadInt((_36_ + 144)))))) {
                                                break label$9;
                                            }
                                            if ((this._loadInt(((this._loadInt((_36_ + 136))) + 12))) != 0) {
                                                break label$8;
                                            }
                                            label$12:
                                            do {
                                                label$13:
                                                do {
                                                    if ((this._loadInt(((this._loadInt((_36_ + 136))) + 4))) == 0) {
                                                        break label$13;
                                                    }
                                                    _31_ = this._storeInt((_36_ + 128), (sqlite3LocateTable((this._loadInt((_36_ + 160))), _30_, (this._loadInt(((_31_ = this._loadInt((_36_ + 136))) + 4))), (this._loadInt(_31_)))));
                                                    if ((this._storeInt(((this._loadInt((_36_ + 136))) + 12), _31_)) == 0) {
                                                        break label$7;
                                                    }
                                                    this._storeInt16(((_31_ = this._loadInt((_36_ + 128))) + 32), ((this._loadInt16u((_31_ + 32))) + 1));
                                                    label$14:
                                                    do {
                                                        if ((this._loadInt((_31_ + 28))) != 0) {
                                                            break label$14;
                                                        }
                                                        if (((this._loadInt8u(((this._loadInt((_36_ + 128))) + 34))) & 16) == 0) {
                                                            break label$12;
                                                        }
                                                    }
                                                    while (false);
                                                    if ((sqlite3ViewGetColumnNames((this._loadInt((_36_ + 160))), (this._loadInt((_36_ + 128))))) != 0) {
                                                        break label$6;
                                                    }
                                                    _31_ = sqlite3SelectDup((this._loadInt((_36_ + 132))), (this._loadInt(((this._loadInt((_36_ + 128))) + 28))), _30_);
                                                    this._storeInt(((this._loadInt((_36_ + 136))) + 16), _31_);
                                                    sqlite3WalkSelect((this._loadInt((_36_ + 168))), _31_);
                                                    break label$12;
                                                }
                                                while (false);
                                                _31_ = this._storeInt((_36_ + 124), (this._loadInt(((this._loadInt((_36_ + 136))) + 16))));
                                                sqlite3WalkSelect((this._loadInt((_36_ + 168))), _31_);
                                                _31_ = this._storeInt((_36_ + 128), (sqlite3DbMallocZero((this._loadInt((_36_ + 132))), 76)));
                                                if ((this._storeInt(((this._loadInt((_36_ + 136))) + 12), _31_)) == 0) {
                                                    break label$5;
                                                }
                                                this._storeInt16(((_31_ = this._loadInt((_36_ + 128))) + 32), 1);
                                                _35_ = this._loadInt((_36_ + 132));
                                                this._storeInt(_36_, _31_);
                                                _31_ = sqlite3MPrintf(_35_, 40848, _36_);
                                                this._storeInt((this._loadInt((_36_ + 128))), _31_);
                                                label$16:
                                                do {
                                                    label$15:
                                                    while (true) {
                                                        if ((this._loadInt(((this._loadInt((_36_ + 124))) + 28))) == 0) {
                                                            break label$16;
                                                        }
                                                        this._storeInt((_36_ + 124), (this._loadInt(((this._loadInt((_36_ + 124))) + 28))));
                                                        continue label$15;
                                                    }
                                                }
                                                while (false);
                                                selectColumnsFromExprList((this._loadInt((_36_ + 160))), (this._loadInt((this._loadInt((_36_ + 124))))), ((_31_ = this._loadInt((_36_ + 128))) + 8), (_31_ + 12));
                                                this._storeInt(((_31_ = this._loadInt((_36_ + 128))) + 4), -1);
                                                this._storeInt((_31_ + 24), 1000000);
                                                this._storeInt8((_31_ + 34), ((this._loadInt8u((_31_ + 34))) | 2));
                                            }
                                            while (false);
                                            if ((sqlite3IndexedByLookup((this._loadInt((_36_ + 160))), (this._loadInt((_36_ + 136))))) != 0) {
                                                break label$11;
                                            }
                                            this._storeInt((_36_ + 156), ((this._loadInt((_36_ + 156))) + 1));
                                            this._storeInt((_36_ + 136), ((this._loadInt((_36_ + 136))) + 56));
                                            continue label$10;
                                        }
                                    }
                                    while (false);
                                    this._storeInt((_36_ + 172), 2);
                                    break label$0;
                                }
                                while (false);
                                label$17:
                                do {
                                    if ((this._loadInt8u(((this._loadInt((_36_ + 132))) + 30))) != 0) {
                                        break label$17;
                                    }
                                    if ((sqliteProcessJoin((this._loadInt((_36_ + 160))), (this._loadInt((_36_ + 164))))) == 0) {
                                        break label$4;
                                    }
                                }
                                while (false);
                                this._storeInt((_36_ + 172), 2);
                                break label$0;
                            }
                            while (false);
                            this._storeInt((_36_ + 172), 1);
                            break label$0;
                        }
                        while (false);
                        this._storeInt((_36_ + 172), 2);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_36_ + 172), 2);
                    break label$0;
                }
                while (false);
                this._storeInt((_36_ + 172), 2);
                break label$0;
            }
            while (false);
            this._storeInt((_36_ + 148), 0);
            label$19:
            do {
                label$18:
                while (true) {
                    if ((this._loadInt((_36_ + 148))) >= (this._loadInt((this._loadInt((_36_ + 140)))))) {
                        break label$19;
                    }
                    if ((this._loadInt8u((this._storeInt((_36_ + 120), (this._loadInt(((this._loadInt(((this._loadInt((_36_ + 140))) + 12))) + ((this._loadInt((_36_ + 148))) * 20)))))))) == 113) {
                        break label$19;
                    }
                    label$20:
                    do {
                        if ((this._loadInt8u((this._loadInt((_36_ + 120))))) != 118) {
                            break label$20;
                        }
                        if ((this._loadInt8u((this._loadInt(((this._loadInt((_36_ + 120))) + 12))))) == 113) {
                            break label$19;
                        }
                    }
                    while (false);
                    this._storeInt((_36_ + 148), ((this._loadInt((_36_ + 148))) + 1));
                    continue label$18;
                }
            }
            while (false);
            label$21:
            do {
                if ((this._loadInt((_36_ + 148))) >= (this._loadInt((this._loadInt((_36_ + 140)))))) {
                    break label$21;
                }
                this._storeInt((_36_ + 116), (this._loadInt(((this._loadInt((_36_ + 140))) + 12))));
                _30_ = this._storeInt((_36_ + 112), 0);
                this._storeInt((_36_ + 108), (this._loadInt(((this._loadInt((this._loadInt((_36_ + 160))))) + 12))));
                _31_ = 0;
                label$22:
                do {
                    if (((this._loadInt8u((_36_ + 109))) & 4) == 0) {
                        break label$22;
                    }
                    _31_ = (((this._loadInt8u((_36_ + 109))) & 8) == 0) ? 1 : 0;
                }
                while (false);
                this._storeInt((_36_ + 104), _31_);
                _32_ = this._storeInt((_36_ + 148), _30_);
                label$24:
                do {
                    label$23:
                    while (true) {
                        label$25:
                        do {
                            label$26:
                            do {
                                if ((this._loadInt((_36_ + 148))) >= (this._loadInt((this._loadInt((_36_ + 140)))))) {
                                    break label$26;
                                }
                                label$27:
                                do {
                                    if ((this._loadInt8u((this._storeInt((_36_ + 100), (this._loadInt(((this._loadInt((_36_ + 116))) + ((this._loadInt((_36_ + 148))) * 20)))))))) == 113) {
                                        break label$27;
                                    }
                                    label$28:
                                    do {
                                        if ((this._loadInt8u((this._loadInt((_36_ + 100))))) != 118) {
                                            break label$28;
                                        }
                                        if ((this._loadInt8u((this._loadInt(((this._loadInt((_36_ + 100))) + 12))))) == 113) {
                                            break label$27;
                                        }
                                    }
                                    while (false);
                                    label$29:
                                    do {
                                        if ((this._storeInt((_36_ + 112), (sqlite3ExprListAppend((this._loadInt((_36_ + 160))), (this._loadInt((_36_ + 112))), (this._loadInt(((this._loadInt((_36_ + 116))) + ((this._loadInt((_36_ + 148))) * 20)))))))) == 0) {
                                            break label$29;
                                        }
                                        this._storeInt((((this._loadInt(((_31_ = this._loadInt((_36_ + 112))) + 12))) + ((this._loadInt(_31_)) * 20)) + -16), (this._loadInt((((this._loadInt((_36_ + 116))) + ((this._loadInt((_36_ + 148))) * 20)) + 4))));
                                        this._storeInt((((this._loadInt(((_31_ = this._loadInt((_36_ + 112))) + 12))) + ((this._loadInt(_31_)) * 20)) + -12), (this._loadInt((((this._loadInt((_36_ + 116))) + ((this._loadInt((_36_ + 148))) * 20)) + 8))));
                                        _31_ = this._storeInt((((this._loadInt((_36_ + 116))) + ((this._loadInt((_36_ + 148))) * 20)) + 4), _32_);
                                        this._storeInt((((this._loadInt((_36_ + 116))) + ((this._loadInt((_36_ + 148))) * 20)) + 8), _31_);
                                    }
                                    while (false);
                                    this._storeInt(((this._loadInt((_36_ + 116))) + ((this._loadInt((_36_ + 148))) * 20)), _32_);
                                    break label$25;
                                }
                                while (false);
                                _31_ = this._storeInt((_36_ + 96), _32_);
                                label$30:
                                do {
                                    label$31:
                                    do {
                                        if ((this._loadInt8u((this._loadInt((_36_ + 100))))) != 118) {
                                            break label$31;
                                        }
                                        this._storeInt((_36_ + 92), (this._loadInt(((this._loadInt(((this._loadInt((_36_ + 100))) + 8))) + 4))));
                                        break label$30;
                                    }
                                    while (false);
                                    this._storeInt((_36_ + 92), _31_);
                                }
                                while (false);
                                _33_ = this._storeInt((_36_ + 156), _31_);
                                this._storeInt((_36_ + 136), ((this._loadInt((_36_ + 144))) + 8));
                                label$32:
                                while (true) {
                                    label$34:
                                    do {
                                        label$35:
                                        do {
                                            if ((this._loadInt((_36_ + 156))) >= (this._loadInt16s((this._loadInt((_36_ + 144)))))) {
                                                break label$35;
                                            }
                                            this._storeInt((_36_ + 88), (this._loadInt(((this._loadInt((_36_ + 136))) + 12))));
                                            label$36:
                                            do {
                                                if ((this._storeInt((_36_ + 84), (this._loadInt(((this._loadInt((_36_ + 136))) + 8))))) != 0) {
                                                    break label$36;
                                                }
                                                this._storeInt((_36_ + 84), (this._loadInt((this._loadInt((_36_ + 88))))));
                                            }
                                            while (false);
                                            if ((this._loadInt8u(((this._loadInt((_36_ + 132))) + 30))) != 0) {
                                                break label$35;
                                            }
                                            label$37:
                                            do {
                                                if ((this._loadInt((_36_ + 92))) == 0) {
                                                    break label$37;
                                                }
                                                if ((sqlite3StrICmp((this._loadInt((_36_ + 92))), (this._loadInt((_36_ + 84))))) != 0) {
                                                    break label$34;
                                                }
                                            }
                                            while (false);
                                            _31_ = this._storeInt((_36_ + 96), 1);
                                            _34_ = this._storeInt((_36_ + 152), _33_);
                                            label$38:
                                            while (true) {
                                                if ((this._loadInt((_36_ + 152))) >= (this._loadInt(((this._loadInt((_36_ + 88))) + 8)))) {
                                                    break label$34;
                                                }
                                                this._storeInt((_36_ + 72), (this._loadInt(((this._loadInt(((this._loadInt((_36_ + 88))) + 12))) + ((this._loadInt((_36_ + 152))) * 24)))));
                                                label$40:
                                                do {
                                                    if ((this._loadInt8u((((this._loadInt(((this._loadInt((_36_ + 88))) + 12))) + ((this._loadInt((_36_ + 152))) * 24)) + 23))) != 0) {
                                                        break label$40;
                                                    }
                                                    label$41:
                                                    do {
                                                        if ((this._loadInt((_36_ + 156))) < _31_) {
                                                            break label$41;
                                                        }
                                                        if ((this._loadInt((_36_ + 92))) != 0) {
                                                            break label$41;
                                                        }
                                                        label$42:
                                                        do {
                                                            if (((this._loadInt8u(((this._loadInt((_36_ + 136))) + 21))) & 4) == 0) {
                                                                break label$42;
                                                            }
                                                            if ((tableAndColumnIndex((this._loadInt((_36_ + 144))), (this._loadInt((_36_ + 156))), (this._loadInt((_36_ + 72))), _34_, _34_)) != 0) {
                                                                break label$40;
                                                            }
                                                        }
                                                        while (false);
                                                        if ((sqlite3IdListIndex((this._loadInt(((this._loadInt((_36_ + 136))) + 32))), (this._loadInt((_36_ + 72))))) > -1) {
                                                            break label$40;
                                                        }
                                                    }
                                                    while (false);
                                                    this._storeInt((_36_ + 76), (sqlite3Expr((this._loadInt((_36_ + 132))), 26, (this._loadInt((_36_ + 72))))));
                                                    this._storeInt((_36_ + 68), (this._loadInt((_36_ + 72))));
                                                    _30_ = this._storeInt((_36_ + 64), _34_);
                                                    label$43:
                                                    do {
                                                        label$44:
                                                        do {
                                                            label$45:
                                                            do {
                                                                if ((this._loadInt((_36_ + 104))) != 0) {
                                                                    break label$45;
                                                                }
                                                                if ((this._loadInt16s((this._loadInt((_36_ + 144))))) < 2) {
                                                                    break label$44;
                                                                }
                                                            }
                                                            while (false);
                                                            _35_ = this._storeInt((_36_ + 52), (sqlite3Expr((this._loadInt((_36_ + 132))), 26, (this._loadInt((_36_ + 84))))));
                                                            this._storeInt((_36_ + 80), (sqlite3PExpr((this._loadInt((_36_ + 160))), 118, _35_, (this._loadInt((_36_ + 76))), _30_)));
                                                            if ((this._loadInt((_36_ + 104))) == 0) {
                                                                break label$43;
                                                            }
                                                            this._storeInt((_36_ + 36), (this._loadInt((_36_ + 72))));
                                                            _35_ = this._loadInt((_36_ + 132));
                                                            this._storeInt((_36_ + 32), (this._loadInt((_36_ + 84))));
                                                            this._storeInt((_36_ + 64), (this._storeInt((_36_ + 68), (sqlite3MPrintf(_35_, 40880, (_36_ + 32))))));
                                                            break label$43;
                                                        }
                                                        while (false);
                                                        this._storeInt((_36_ + 80), (this._loadInt((_36_ + 76))));
                                                    }
                                                    while (false);
                                                    this._storeInt((_36_ + 112), (sqlite3ExprListAppend((this._loadInt((_36_ + 160))), (this._loadInt((_36_ + 112))), (this._loadInt((_36_ + 80))))));
                                                    this._storeInt((_36_ + 56), (this._loadInt((_36_ + 68))));
                                                    this._storeInt((_36_ + 60), (sqlite3Strlen30((this._loadInt((_36_ + 68))))));
                                                    sqlite3ExprListSetName((this._loadInt((_36_ + 160))), (this._loadInt((_36_ + 112))), (_36_ + 56), _30_);
                                                    sqlite3DbFree((this._loadInt((_36_ + 132))), (this._loadInt((_36_ + 64))));
                                                }
                                                while (false);
                                                this._storeInt((_36_ + 152), ((this._loadInt((_36_ + 152))) + _31_));
                                                continue label$38;
                                            }
                                        }
                                        while (false);
                                        if ((this._loadInt((_36_ + 96))) != 0) {
                                            break label$25;
                                        }
                                        label$46:
                                        do {
                                            if ((this._loadInt((_36_ + 92))) == 0) {
                                                break label$46;
                                            }
                                            _31_ = this._loadInt((_36_ + 160));
                                            this._storeInt((_36_ + 16), (this._loadInt((_36_ + 92))));
                                            sqlite3ErrorMsg(_31_, 40896, (_36_ + 16));
                                            break label$25;
                                        }
                                        while (false);
                                        sqlite3ErrorMsg((this._loadInt((_36_ + 160))), 40928, _33_);
                                        break label$25;
                                    }
                                    while (false);
                                    this._storeInt((_36_ + 156), ((this._loadInt((_36_ + 156))) + 1));
                                    this._storeInt((_36_ + 136), ((this._loadInt((_36_ + 136))) + 56));
                                    continue label$32;
                                }
                            }
                            while (false);
                            sqlite3ExprListDelete((this._loadInt((_36_ + 132))), (this._loadInt((_36_ + 140))));
                            this._storeInt((this._loadInt((_36_ + 164))), (this._loadInt((_36_ + 112))));
                            break label$24;
                        }
                        while (false);
                        this._storeInt((_36_ + 148), ((this._loadInt((_36_ + 148))) + 1));
                        continue label$23;
                    }
                }
                while (false);
            }
            while (false);
            label$47:
            do {
                if ((this._loadInt((this._loadInt((_36_ + 164))))) == 0) {
                    break label$47;
                }
                if ((this._loadInt((this._loadInt((this._loadInt((_36_ + 164))))))) <= (this._loadInt(((this._loadInt((_36_ + 132))) + 80)))) {
                    break label$47;
                }
                sqlite3ErrorMsg((this._loadInt((_36_ + 160))), 40960, 0);
            }
            while (false);
            this._storeInt((_36_ + 172), 0);
        }
        while (false);
        _31_ = this._loadInt((_36_ + 172));
        this._storeInt((0 + 4), (_36_ + 176));
        return _31_;
    }

    @Override()
    public final int sqlite3IndexedByLookup(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt(((this._storeInt((_32_ + 20), _31_)) + 12))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt(((this._loadInt((_32_ + 20))) + 48))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 16), (this._loadInt(((this._loadInt((_32_ + 20))) + 12))));
                    this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 20))) + 48))));
                    this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((_32_ + 16))) + 16))));
                    label$4:
                    do {
                        label$3:
                        while (true) {
                            _31_ = 0;
                            label$5:
                            do {
                                if ((this._loadInt((_32_ + 8))) == 0) {
                                    break label$5;
                                }
                                _31_ = ((sqlite3StrICmp((this._loadInt((this._loadInt((_32_ + 8))))), (this._loadInt((_32_ + 12))))) != 0) ? 1 : 0;
                            }
                            while (false);
                            if (_31_ == 0) {
                                break label$4;
                            }
                            this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((_32_ + 8))) + 32))));
                            continue label$3;
                        }
                    }
                    while (false);
                    if ((this._loadInt((_32_ + 8))) == 0) {
                        break label$1;
                    }
                    this._storeInt(((this._loadInt((_32_ + 20))) + 52), (this._loadInt((_32_ + 8))));
                }
                while (false);
                this._storeInt((_32_ + 28), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 4), 0);
            _31_ = this._loadInt((_32_ + 24));
            this._storeInt(_32_, (this._loadInt((_32_ + 12))));
            sqlite3ErrorMsg(_31_, 41184, _32_);
            this._storeInt((_32_ + 28), (this._storeInt8(((this._loadInt((_32_ + 24))) + 18), 1)));
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int sqliteProcessJoin(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 88), _30_);
        this._storeInt((_33_ + 68), ((_31_ = this._storeInt((_33_ + 80), (this._loadInt(((this._storeInt((_33_ + 84), _31_)) + 8))))) + 8));
        this._storeInt((_33_ + 64), (_31_ + 64));
        _32_ = this._storeInt((_33_ + 76), 0);
        label$0:
        while (true) {
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
                                if ((this._loadInt((_33_ + 76))) >= ((this._loadInt16s((this._loadInt((_33_ + 80))))) + -1)) {
                                    break label$6;
                                }
                                this._storeInt((_33_ + 60), (this._loadInt(((this._loadInt((_33_ + 68))) + 12))));
                                this._storeInt((_33_ + 56), (this._loadInt(((this._loadInt((_33_ + 64))) + 12))));
                                if ((this._loadInt((_33_ + 60))) == 0) {
                                    break label$2;
                                }
                                if ((this._loadInt((_33_ + 56))) == 0) {
                                    break label$2;
                                }
                                this._storeInt((_33_ + 52), (((this._loadInt8u(((this._loadInt((_33_ + 64))) + 21))) & 32) >>> 5));
                                label$7:
                                do {
                                    if (((this._loadInt8u(((this._loadInt((_33_ + 64))) + 21))) & 4) == 0) {
                                        break label$7;
                                    }
                                    if ((this._loadInt(((this._loadInt((_33_ + 64))) + 28))) != 0) {
                                        break label$5;
                                    }
                                    if ((this._loadInt(((this._loadInt((_33_ + 64))) + 32))) != 0) {
                                        break label$5;
                                    }
                                    this._storeInt((_33_ + 72), _32_);
                                    label$9:
                                    do {
                                        label$8:
                                        while (true) {
                                            if ((this._loadInt((_33_ + 72))) >= (this._loadInt(((this._loadInt((_33_ + 56))) + 8)))) {
                                                break label$9;
                                            }
                                            _31_ = this._storeInt((_33_ + 48), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 56))) + 12))) + ((this._loadInt((_33_ + 72))) * 24)))));
                                            label$10:
                                            do {
                                                if ((tableAndColumnIndex((this._loadInt((_33_ + 80))), ((this._loadInt((_33_ + 76))) + 1), _31_, (_33_ + 44), (_33_ + 40))) == 0) {
                                                    break label$10;
                                                }
                                                addWhereTerm((this._loadInt((_33_ + 88))), (this._loadInt((_33_ + 80))), (this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 40))), ((this._loadInt((_33_ + 76))) + 1), (this._loadInt((_33_ + 72))), (this._loadInt((_33_ + 52))), ((this._loadInt((_33_ + 84))) + 12));
                                            }
                                            while (false);
                                            this._storeInt((_33_ + 72), ((this._loadInt((_33_ + 72))) + 1));
                                            continue label$8;
                                        }
                                    }
                                    while (false);
                                }
                                while (false);
                                label$11:
                                do {
                                    if ((this._loadInt(((this._loadInt((_33_ + 64))) + 28))) == 0) {
                                        break label$11;
                                    }
                                    if ((this._loadInt(((this._loadInt((_33_ + 64))) + 32))) != 0) {
                                        break label$4;
                                    }
                                }
                                while (false);
                                label$12:
                                do {
                                    if ((this._loadInt(((this._loadInt((_33_ + 64))) + 28))) == 0) {
                                        break label$12;
                                    }
                                    label$13:
                                    do {
                                        if ((this._loadInt((_33_ + 52))) == 0) {
                                            break label$13;
                                        }
                                        setJoinExpr((this._loadInt(((_31_ = this._loadInt((_33_ + 64))) + 28))), (this._loadInt((_31_ + 24))));
                                    }
                                    while (false);
                                    _31_ = sqlite3ExprAnd((this._loadInt((this._loadInt((_33_ + 88))))), (this._loadInt(((this._loadInt((_33_ + 84))) + 12))), (this._loadInt(((this._loadInt((_33_ + 64))) + 28))));
                                    this._storeInt(((this._loadInt((_33_ + 84))) + 12), _31_);
                                    this._storeInt(((this._loadInt((_33_ + 64))) + 28), _32_);
                                }
                                while (false);
                                if ((this._loadInt(((this._loadInt((_33_ + 64))) + 32))) == 0) {
                                    break label$2;
                                }
                                this._storeInt((_33_ + 36), (this._loadInt(((this._loadInt((_33_ + 64))) + 32))));
                                _30_ = this._storeInt((_33_ + 72), _32_);
                                label$15:
                                do {
                                    label$14:
                                    while (true) {
                                        if ((this._loadInt((_33_ + 72))) >= (this._loadInt(((this._loadInt((_33_ + 36))) + 4)))) {
                                            break label$2;
                                        }
                                        _31_ = this._storeInt((_33_ + 32), (this._loadInt(((this._loadInt((this._loadInt((_33_ + 36))))) + ((this._loadInt((_33_ + 72))) << 3)))));
                                        if ((this._storeInt((_33_ + 20), (columnIndex((this._loadInt((_33_ + 56))), _31_)))) < _30_) {
                                            break label$15;
                                        }
                                        if ((tableAndColumnIndex((this._loadInt((_33_ + 80))), ((this._loadInt((_33_ + 76))) + 1), (this._loadInt((_33_ + 32))), (_33_ + 28), (_33_ + 24))) == 0) {
                                            break label$15;
                                        }
                                        addWhereTerm((this._loadInt((_33_ + 88))), (this._loadInt((_33_ + 80))), (this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 24))), ((this._loadInt((_33_ + 76))) + 1), (this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 52))), ((this._loadInt((_33_ + 84))) + 12));
                                        this._storeInt((_33_ + 72), ((this._loadInt((_33_ + 72))) + 1));
                                        continue label$14;
                                    }
                                }
                                while (false);
                                _31_ = this._loadInt((_33_ + 88));
                                this._storeInt((_33_ + 16), (this._loadInt((_33_ + 32))));
                                sqlite3ErrorMsg(_31_, 41120, (_33_ + 16));
                                this._storeInt((_33_ + 92), 1);
                                break label$3;
                            }
                            while (false);
                            this._storeInt((_33_ + 92), 0);
                            break label$3;
                        }
                        while (false);
                        _31_ = this._loadInt((_33_ + 88));
                        this._storeInt(_33_, 0);
                        sqlite3ErrorMsg(_31_, 40992, _33_);
                        this._storeInt((_33_ + 92), 1);
                        break label$3;
                    }
                    while (false);
                    sqlite3ErrorMsg((this._loadInt((_33_ + 88))), 41056, 0);
                    this._storeInt((_33_ + 92), 1);
                }
                while (false);
                _31_ = this._loadInt((_33_ + 92));
                this._storeInt((0 + 4), (_33_ + 96));
                return _31_;
            }
            while (false);
            this._storeInt((_33_ + 76), ((this._loadInt((_33_ + 76))) + 1));
            this._storeInt((_33_ + 64), ((this._loadInt((_33_ + 64))) + 56));
            this._storeInt((_33_ + 68), ((this._loadInt((_33_ + 68))) + 56));
            continue label$0;
        }
    }

    @Override()
    public final int tableAndColumnIndex(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_35_ + 20), _31_);
        this._storeInt((_35_ + 16), _32_);
        this._storeInt((_35_ + 12), _33_);
        this._storeInt((_35_ + 8), _34_);
        _34_ = this._storeInt((_35_ + 4), 0);
        label$0:
        do {
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt((_35_ + 4))) >= (this._loadInt((_35_ + 20)))) {
                            break label$1;
                        }
                        if ((this._storeInt(_35_, (columnIndex((this._loadInt((((this._loadInt((_35_ + 24))) + ((this._loadInt((_35_ + 4))) * 56)) + 20))), (this._loadInt((_35_ + 16))))))) >= _34_) {
                            break label$3;
                        }
                        this._storeInt((_35_ + 4), ((this._loadInt((_35_ + 4))) + 1));
                        continue label$2;
                    }
                }
                while (false);
                label$4:
                do {
                    if ((this._loadInt((_35_ + 12))) == 0) {
                        break label$4;
                    }
                    this._storeInt((this._loadInt((_35_ + 12))), (this._loadInt((_35_ + 4))));
                    this._storeInt((this._loadInt((_35_ + 8))), (this._loadInt(_35_)));
                }
                while (false);
                this._storeInt((_35_ + 28), 1);
                break label$0;
            }
            while (false);
            this._storeInt((_35_ + 28), 0);
        }
        while (false);
        _34_ = this._loadInt((_35_ + 28));
        this._storeInt((0 + 4), (_35_ + 32));
        return _34_;
    }

    @Override()
    public final int sqlite3IdListIndex(int _30_, int _31_)
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
                    if ((this._loadInt((_32_ + 8))) == 0) {
                        break label$2;
                    }
                    this._storeInt(_32_, 0);
                    label$4:
                    do {
                        label$3:
                        while (true) {
                            if ((this._loadInt(_32_)) >= (this._loadInt(((this._loadInt((_32_ + 8))) + 4)))) {
                                break label$1;
                            }
                            if ((sqlite3StrICmp((this._loadInt(((this._loadInt((this._loadInt((_32_ + 8))))) + ((this._loadInt(_32_)) << 3)))), (this._loadInt((_32_ + 4))))) == 0) {
                                break label$4;
                            }
                            this._storeInt(_32_, ((this._loadInt(_32_)) + 1));
                            continue label$3;
                        }
                    }
                    while (false);
                    this._storeInt((_32_ + 12), (this._loadInt(_32_)));
                    break label$0;
                }
                while (false);
                this._storeInt((_32_ + 12), -1);
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), -1);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final int columnIndex(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 8), _30_);
        this._storeInt((_32_ + 4), _31_);
        this._storeInt(_32_, 0);
        label$0:
        do {
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt(_32_)) >= (this._loadInt(((this._loadInt((_32_ + 8))) + 8)))) {
                            break label$1;
                        }
                        if ((sqlite3StrICmp((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 8))) + 12))) + ((this._loadInt(_32_)) * 24)))), (this._loadInt((_32_ + 4))))) == 0) {
                            break label$3;
                        }
                        this._storeInt(_32_, ((this._loadInt(_32_)) + 1));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt((_32_ + 12), (this._loadInt(_32_)));
                break label$0;
            }
            while (false);
            this._storeInt((_32_ + 12), -1);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void addWhereTerm(
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
        this._storeInt(((_38_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_38_ + 40), _31_);
        this._storeInt((_38_ + 36), _32_);
        this._storeInt((_38_ + 32), _33_);
        this._storeInt((_38_ + 28), _34_);
        this._storeInt((_38_ + 24), _35_);
        this._storeInt((_38_ + 20), _36_);
        this._storeInt((_38_ + 16), _37_);
        this._storeInt((_38_ + 8), (sqlite3CreateColumnExpr((this._storeInt((_38_ + 12), (this._loadInt((this._loadInt((_38_ + 44))))))), (this._loadInt((_38_ + 40))), (this._loadInt((_38_ + 36))), (this._loadInt((_38_ + 32))))));
        _37_ = this._storeInt((_38_ + 4), (sqlite3CreateColumnExpr((this._loadInt((_38_ + 12))), (this._loadInt((_38_ + 40))), (this._loadInt((_38_ + 28))), (this._loadInt((_38_ + 24))))));
        label$0:
        do {
            if ((this._storeInt(_38_, (sqlite3PExpr((this._loadInt((_38_ + 44))), 76, (this._loadInt((_38_ + 8))), _37_, 0)))) == 0) {
                break label$0;
            }
            if ((this._loadInt((_38_ + 20))) == 0) {
                break label$0;
            }
            this._storeInt16(((_37_ = this._loadInt(_38_)) + 2), ((this._loadInt16u((_37_ + 2))) | 1));
            this._storeInt16((_37_ + 32), (this._loadInt(((this._loadInt((_38_ + 4))) + 24))));
        }
        while (false);
        _37_ = sqlite3ExprAnd((this._loadInt((_38_ + 12))), (this._loadInt((this._loadInt((_38_ + 16))))), (this._loadInt(_38_)));
        this._storeInt((this._loadInt((_38_ + 16))), _37_);
        this._storeInt((0 + 4), (_38_ + 48));
        return;
    }

    @Override()
    public final void setJoinExpr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 12))) == 0) {
                    break label$1;
                }
                this._storeInt16(((_31_ = this._loadInt((_32_ + 12))) + 32), (this._loadInt((_32_ + 8))));
                this._storeInt16((_31_ + 2), ((this._loadInt16u((_31_ + 2))) | 1));
                setJoinExpr((this._loadInt(((this._loadInt((_32_ + 12))) + 8))), (this._loadInt((_32_ + 8))));
                this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 12))) + 12))));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int sqlite3ExprAnd(int _30_, int _31_, int _32_)
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
                    if ((this._loadInt((_33_ + 20))) == 0) {
                        break label$2;
                    }
                    if ((this._loadInt((_33_ + 16))) == 0) {
                        break label$1;
                    }
                    _32_ = this._storeInt((_33_ + 12), (sqlite3ExprAlloc((this._loadInt((_33_ + 24))), 69, 0, 0)));
                    sqlite3ExprAttachSubtrees((this._loadInt((_33_ + 24))), _32_, (this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))));
                    this._storeInt((_33_ + 28), (this._loadInt((_33_ + 12))));
                    break label$0;
                }
                while (false);
                this._storeInt((_33_ + 28), (this._loadInt((_33_ + 16))));
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 28), (this._loadInt((_33_ + 20))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 28));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int sqlite3ExprAlloc(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        this._storeInt((_34_ + 4), (this._storeInt((_34_ + 8), 0)));
        label$0:
        do {
            if ((this._loadInt((_34_ + 20))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt((_34_ + 24))) != 129) {
                    break label$1;
                }
                if ((this._loadInt((this._loadInt((_34_ + 20))))) == 0) {
                    break label$1;
                }
                if ((sqlite3GetInt32((this._loadInt((this._loadInt((_34_ + 20))))), (_34_ + 4))) != 0) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt((_34_ + 8), ((this._loadInt(((this._loadInt((_34_ + 20))) + 4))) + 1));
        }
        while (false);
        label$2:
        do {
            if ((this._storeInt((_34_ + 12), (sqlite3DbMallocZero((this._loadInt((_34_ + 28))), ((this._loadInt((_34_ + 8))) + 48))))) == 0) {
                break label$2;
            }
            this._storeInt16(((_33_ = this._loadInt((_34_ + 12))) + 30), 65535);
            this._storeInt8(_33_, (this._loadInt((_34_ + 24))));
            label$3:
            do {
                if ((this._loadInt((_34_ + 20))) == 0) {
                    break label$3;
                }
                label$4:
                do {
                    if ((this._loadInt((_34_ + 8))) == 0) {
                        break label$4;
                    }
                    memcpy((this._storeInt(((_33_ = this._loadInt((_34_ + 12))) + 4), (_33_ + 48))), (this._loadInt((_33_ = this._loadInt((_34_ + 20))))), (this._loadInt((_33_ + 4))));
                    this._storeInt8(((this._loadInt(((this._loadInt((_34_ + 12))) + 4))) + (this._loadInt(((this._loadInt((_34_ + 20))) + 4)))), 0);
                    if ((this._loadInt((_34_ + 16))) == 0) {
                        break label$3;
                    }
                    if ((this._loadInt((_34_ + 8))) < 3) {
                        break label$3;
                    }
                    label$5:
                    do {
                        if ((this._storeInt(_34_, (this._loadInt8s((this._loadInt((this._loadInt((_34_ + 20))))))))) == 39) {
                            break label$5;
                        }
                        if ((this._loadInt(_34_)) == 34) {
                            break label$5;
                        }
                        if ((this._loadInt(_34_)) == 91) {
                            break label$5;
                        }
                        if ((this._loadInt(_34_)) != 96) {
                            break label$3;
                        }
                    }
                    while (false);
                    sqlite3Dequote((this._loadInt(((this._loadInt((_34_ + 12))) + 4))));
                    if ((this._loadInt(_34_)) != 34) {
                        break label$3;
                    }
                    this._storeInt16(((_33_ = this._loadInt((_34_ + 12))) + 2), ((this._loadInt16u((_33_ + 2))) | 64));
                    break label$3;
                }
                while (false);
                this._storeInt16(((_33_ = this._loadInt((_34_ + 12))) + 2), ((this._loadInt16u((_33_ + 2))) | 1024));
                this._storeInt((_33_ + 4), (this._loadInt((_34_ + 4))));
            }
            while (false);
            this._storeInt(((this._loadInt((_34_ + 12))) + 44), 1);
        }
        while (false);
        _33_ = this._loadInt((_34_ + 12));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final void sqlite3ExprAttachSubtrees(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_34_ + 8), _31_);
        this._storeInt((_34_ + 4), _32_);
        this._storeInt(_34_, _33_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_34_ + 8))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt(_34_)) == 0) {
                        break label$2;
                    }
                    if (((this._loadInt16u(((this._storeInt(((this._loadInt((_34_ + 8))) + 12), (this._loadInt(_34_)))) + 2))) & 256) == 0) {
                        break label$2;
                    }
                    this._storeInt16(((_33_ = this._loadInt((_34_ + 8))) + 2), ((this._loadInt16u((_33_ + 2))) | 256));
                    this._storeInt((_33_ + 20), (this._loadInt(((this._loadInt(_34_)) + 20))));
                }
                while (false);
                label$3:
                do {
                    if ((this._loadInt((_34_ + 4))) == 0) {
                        break label$3;
                    }
                    if (((this._loadInt16u(((this._storeInt(((this._loadInt((_34_ + 8))) + 8), (this._loadInt((_34_ + 4))))) + 2))) & 256) == 0) {
                        break label$3;
                    }
                    this._storeInt16(((_33_ = this._loadInt((_34_ + 8))) + 2), ((this._loadInt16u((_33_ + 2))) | 256));
                    this._storeInt((_33_ + 20), (this._loadInt(((this._loadInt((_34_ + 4))) + 20))));
                }
                while (false);
                exprSetHeight((this._loadInt((_34_ + 8))));
                break label$0;
            }
            while (false);
            sqlite3ExprDelete((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 4))));
            sqlite3ExprDelete((this._loadInt((_34_ + 12))), (this._loadInt(_34_)));
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 16));
        return;
    }

    @Override()
    public final void exprSetHeight(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_31_ + 8), 0);
        heightOfExpr((this._loadInt(((this._loadInt((_31_ + 12))) + 8))), (_31_ + 8));
        heightOfExpr((this._loadInt(((this._loadInt((_31_ + 12))) + 12))), (_31_ + 8));
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt16u(((this._loadInt((_31_ + 12))) + 2))) & 2048) == 0) {
                    break label$1;
                }
                heightOfSelect((this._loadInt(((this._loadInt((_31_ + 12))) + 16))), (_31_ + 8));
                break label$0;
            }
            while (false);
            heightOfExprList((this._loadInt(((this._loadInt((_31_ + 12))) + 16))), (_31_ + 8));
        }
        while (false);
        this._storeInt(((this._loadInt((_31_ + 12))) + 44), ((this._loadInt((_31_ + 8))) + 1));
        this._storeInt((0 + 4), (_31_ + 16));
        return;
    }

    @Override()
    public final void heightOfExpr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if ((this._loadInt((_32_ + 12))) == 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_32_ + 12))) + 44))) <= (this._loadInt((this._loadInt((_32_ + 8)))))) {
                break label$0;
            }
            this._storeInt((this._loadInt((_32_ + 8))), (this._loadInt(((this._loadInt((_32_ + 12))) + 44))));
        }
        while (false);
        return;
    }

    @Override()
    public final void heightOfSelect(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if ((this._loadInt((_32_ + 12))) == 0) {
                break label$0;
            }
            heightOfExpr((this._loadInt(((this._loadInt((_32_ + 12))) + 12))), (this._loadInt((_32_ + 8))));
            heightOfExpr((this._loadInt(((this._loadInt((_32_ + 12))) + 20))), (this._loadInt((_32_ + 8))));
            heightOfExpr((this._loadInt(((this._loadInt((_32_ + 12))) + 40))), (this._loadInt((_32_ + 8))));
            heightOfExpr((this._loadInt(((this._loadInt((_32_ + 12))) + 44))), (this._loadInt((_32_ + 8))));
            heightOfExprList((this._loadInt((this._loadInt((_32_ + 12))))), (this._loadInt((_32_ + 8))));
            heightOfExprList((this._loadInt(((this._loadInt((_32_ + 12))) + 16))), (this._loadInt((_32_ + 8))));
            heightOfExprList((this._loadInt(((this._loadInt((_32_ + 12))) + 24))), (this._loadInt((_32_ + 8))));
            heightOfSelect((this._loadInt(((this._loadInt((_32_ + 12))) + 28))), (this._loadInt((_32_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final void heightOfExprList(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if ((this._loadInt((_32_ + 12))) == 0) {
                break label$0;
            }
            this._storeInt((_32_ + 4), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 4))) >= (this._loadInt((this._loadInt((_32_ + 12)))))) {
                        break label$2;
                    }
                    heightOfExpr((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 12))) + 12))) + ((this._loadInt((_32_ + 4))) * 20)))), (this._loadInt((_32_ + 8))));
                    this._storeInt((_32_ + 4), ((this._loadInt((_32_ + 4))) + 1));
                    continue label$1;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int sqlite3CreateColumnExpr(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        label$0:
        do {
            if ((this._storeInt((_34_ + 12), (sqlite3ExprAlloc((this._loadInt((_34_ + 28))), 152, 0, 0)))) == 0) {
                break label$0;
            }
            this._storeInt((_34_ + 8), ((_33_ = (this._loadInt((_34_ + 24))) + ((this._loadInt((_34_ + 20))) * 56)) + 8));
            this._storeInt(((_32_ = this._loadInt((_34_ + 12))) + 40), (this._loadInt((_33_ + 20))));
            this._storeInt((_32_ + 24), (this._loadInt((_33_ + 32))));
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt(((this._loadInt(((this._loadInt((_34_ + 12))) + 40))) + 4))) != (this._loadInt((_34_ + 16)))) {
                        break label$2;
                    }
                    this._storeInt16(((this._loadInt((_34_ + 12))) + 28), 65535);
                    break label$1;
                }
                while (false);
                _33_ = 63;
                label$3:
                do {
                    if ((this._storeInt16(((this._loadInt((_34_ + 12))) + 28), (this._loadInt((_34_ + 16))))) > 63) {
                        break label$3;
                    }
                    _33_ = this._loadInt((_34_ + 16));
                }
                while (false);
                this._storeLong(((_32_ = this._loadInt((_34_ + 8))) + 40), ((this._loadLong((_32_ + 40))) | (1L << (_33_ & 4294967295L))));
            }
            while (false);
            this._storeInt16(((_33_ = this._loadInt((_34_ + 12))) + 2), ((this._loadInt16u((_33_ + 2))) | 4));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 12));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final int sqlite3SrcListDup(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_33_ + 36), _31_);
        this._storeInt((_33_ + 32), _32_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_33_ + 36))) == 0) {
                        break label$2;
                    }
                    _32_ = 0;
                    label$3:
                    do {
                        if ((this._loadInt16s((this._loadInt((_33_ + 36))))) < 1) {
                            break label$3;
                        }
                        _32_ = ((this._loadInt16s((this._loadInt((_33_ + 36))))) * 56) + -56;
                    }
                    while (false);
                    _32_ = this._storeInt((_33_ + 20), (_32_ + 64));
                    if ((this._storeInt((_33_ + 28), (sqlite3DbMallocRaw((this._loadInt((_33_ + 40))), _32_)))) == 0) {
                        break label$1;
                    }
                    this._storeInt16((_32_ = this._loadInt((_33_ + 28))), (this._storeInt16((_32_ + 2), (this._loadInt16u((this._loadInt((_33_ + 36))))))));
                    this._storeInt((_33_ + 24), 0);
                    label$5:
                    do {
                        label$4:
                        while (true) {
                            if ((this._loadInt((_33_ + 24))) >= (this._loadInt16s((this._loadInt((_33_ + 36)))))) {
                                break label$5;
                            }
                            this._storeInt((_33_ + 16), (((this._loadInt((_33_ + 28))) + ((this._loadInt((_33_ + 24))) * 56)) + 8));
                            _32_ = this._storeInt((_33_ + 12), (((this._loadInt((_33_ + 36))) + ((this._loadInt((_33_ + 24))) * 56)) + 8));
                            _32_ = sqlite3DbStrDup((this._loadInt((_33_ + 40))), (this._loadInt(_32_)));
                            this._storeInt((this._loadInt((_33_ + 16))), _32_);
                            _32_ = sqlite3DbStrDup((this._loadInt((_33_ + 40))), (this._loadInt(((this._loadInt((_33_ + 12))) + 4))));
                            this._storeInt(((this._loadInt((_33_ + 16))) + 4), _32_);
                            _32_ = sqlite3DbStrDup((this._loadInt((_33_ + 40))), (this._loadInt(((this._loadInt((_33_ + 12))) + 8))));
                            this._storeInt(((_31_ = this._loadInt((_33_ + 16))) + 8), _32_);
                            this._storeInt8((_31_ + 21), (this._loadInt8u(((this._loadInt((_33_ + 12))) + 21))));
                            this._storeInt(((this._loadInt((_33_ + 16))) + 24), (this._loadInt(((this._loadInt((_33_ + 12))) + 24))));
                            this._storeInt8(((this._loadInt((_33_ + 16))) + 20), (this._loadInt8u(((this._loadInt((_33_ + 12))) + 20))));
                            _32_ = sqlite3DbStrDup((this._loadInt((_33_ + 40))), (this._loadInt(((this._loadInt((_33_ + 12))) + 48))));
                            this._storeInt(((_31_ = this._loadInt((_33_ + 16))) + 48), _32_);
                            this._storeInt8((_31_ + 22), (this._loadInt8u(((this._loadInt((_33_ + 12))) + 22))));
                            this._storeInt(((this._loadInt((_33_ + 16))) + 52), (this._loadInt(((this._loadInt((_33_ + 12))) + 52))));
                            label$6:
                            do {
                                if ((this._storeInt((_33_ + 8), (this._storeInt(((this._loadInt((_33_ + 16))) + 12), (this._loadInt(((this._loadInt((_33_ + 12))) + 12))))))) == 0) {
                                    break label$6;
                                }
                                this._storeInt16(((_32_ = this._loadInt((_33_ + 8))) + 32), ((this._loadInt16u((_32_ + 32))) + 1));
                            }
                            while (false);
                            _32_ = sqlite3SelectDup((this._loadInt((_33_ + 40))), (this._loadInt(((this._loadInt((_33_ + 12))) + 16))), (this._loadInt((_33_ + 32))));
                            this._storeInt(((this._loadInt((_33_ + 16))) + 16), _32_);
                            _32_ = sqlite3ExprDup((this._loadInt((_33_ + 40))), (this._loadInt(((this._loadInt((_33_ + 12))) + 28))), (this._loadInt((_33_ + 32))));
                            this._storeInt(((this._loadInt((_33_ + 16))) + 28), _32_);
                            _32_ = sqlite3IdListDup((this._loadInt((_33_ + 40))), (this._loadInt(((this._loadInt((_33_ + 12))) + 32))));
                            this._storeInt(((_31_ = this._loadInt((_33_ + 16))) + 32), _32_);
                            this._storeLong((_31_ + 40), (this._loadLong(((this._loadInt((_33_ + 12))) + 40))));
                            this._storeInt((_33_ + 24), ((this._loadInt((_33_ + 24))) + 1));
                            continue label$4;
                        }
                    }
                    while (false);
                    this._storeInt((_33_ + 44), (this._loadInt((_33_ + 28))));
                    break label$0;
                }
                while (false);
                this._storeInt((_33_ + 44), 0);
                break label$0;
            }
            while (false);
            this._storeInt((_33_ + 44), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 44));
        this._storeInt((0 + 4), (_33_ + 48));
        return _32_;
    }

    @Override()
    public final int sqlite3IdListDup(int _30_, int _31_)
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
                        if ((this._storeInt((_32_ + 20), _31_)) == 0) {
                            break label$3;
                        }
                        if ((this._storeInt((_32_ + 16), (sqlite3DbMallocRaw((this._loadInt((_32_ + 24))), 12)))) == 0) {
                            break label$2;
                        }
                        this._storeInt(((_31_ = this._loadInt((_32_ + 16))) + 8), (this._storeInt((_31_ + 4), (this._loadInt(((this._loadInt((_32_ + 20))) + 4))))));
                        _31_ = sqlite3DbMallocRaw((this._loadInt((_32_ + 24))), ((this._loadInt(((this._loadInt((_32_ + 20))) + 4))) << 3));
                        if ((this._storeInt((this._loadInt((_32_ + 16))), _31_)) == 0) {
                            break label$1;
                        }
                        this._storeInt((_32_ + 12), 0);
                        label$5:
                        do {
                            label$4:
                            while (true) {
                                if ((this._loadInt((_32_ + 12))) >= (this._loadInt(((this._loadInt((_32_ + 20))) + 4)))) {
                                    break label$5;
                                }
                                this._storeInt((_32_ + 8), ((this._loadInt((this._loadInt((_32_ + 16))))) + ((this._loadInt((_32_ + 12))) << 3)));
                                _31_ = this._storeInt((_32_ + 4), ((this._loadInt((this._loadInt((_32_ + 20))))) + ((this._loadInt((_32_ + 12))) << 3)));
                                _31_ = sqlite3DbStrDup((this._loadInt((_32_ + 24))), (this._loadInt(_31_)));
                                this._storeInt((_30_ = this._loadInt((_32_ + 8))), _31_);
                                this._storeInt((_30_ + 4), (this._loadInt(((this._loadInt((_32_ + 4))) + 4))));
                                this._storeInt((_32_ + 12), ((this._loadInt((_32_ + 12))) + 1));
                                continue label$4;
                            }
                        }
                        while (false);
                        this._storeInt((_32_ + 28), (this._loadInt((_32_ + 16))));
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
            sqlite3DbFree((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 16))));
            this._storeInt((_32_ + 28), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int vtabCallConstructor(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 144))) + 136), _30_);
        this._storeInt((_35_ + 132), _31_);
        this._storeInt((_35_ + 128), _32_);
        this._storeInt((_35_ + 124), _33_);
        this._storeInt((_35_ + 120), _34_);
        this._storeInt((_35_ + 100), (this._loadInt(((this._loadInt((_35_ + 132))) + 60))));
        this._storeInt((_35_ + 96), (this._loadInt(((this._loadInt((_35_ + 132))) + 56))));
        this._storeInt((_35_ + 92), 0);
        _34_ = this._loadInt((_35_ + 136));
        this._storeInt((_35_ + 48), (this._loadInt((this._loadInt((_35_ + 132))))));
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
                                        if ((this._storeInt((_35_ + 88), (sqlite3MPrintf(_34_, 22192, (_35_ + 48))))) == 0) {
                                            break label$7;
                                        }
                                        if ((this._storeInt((_35_ + 108), (sqlite3DbMallocZero((this._loadInt((_35_ + 136))), 28)))) == 0) {
                                            break label$6;
                                        }
                                        this._storeInt(((_34_ = this._loadInt((_35_ + 108))) + 4), (this._loadInt((_35_ + 128))));
                                        this._storeInt(_34_, (this._loadInt((_35_ + 136))));
                                        this._storeInt((_35_ + 112), (this._loadInt((_35_ + 132))));
                                        _34_ = this._storeInt((_35_ + 116), (this._loadInt((_35_ + 108))));
                                        this._storeInt(((this._loadInt((_35_ + 136))) + 304), (_35_ + 112));
                                        _34_ = this._storeInt((_35_ + 104), (this._iiiiiiiTable[this._tableIndices[this._loadInt((_35_ + 124))]].invoke((this._loadInt((_35_ + 136))), (this._loadInt(((this._loadInt((_35_ + 128))) + 8))), (this._loadInt((_35_ + 96))), (this._loadInt((_35_ + 100))), (_34_ + 8), (_35_ + 92))));
                                        this._storeInt(((this._loadInt((_35_ + 136))) + 304), 0);
                                        label$8:
                                        do {
                                            if (_34_ != 7) {
                                                break label$8;
                                            }
                                            this._storeInt8(((this._loadInt((_35_ + 136))) + 30), 1);
                                        }
                                        while (false);
                                        if ((this._loadInt((_35_ + 104))) == 0) {
                                            break label$5;
                                        }
                                        if ((this._loadInt((_35_ + 92))) == 0) {
                                            break label$4;
                                        }
                                        _34_ = this._loadInt((_35_ + 136));
                                        this._storeInt((_35_ + 16), (this._loadInt((_35_ + 92))));
                                        _34_ = sqlite3MPrintf(_34_, 22192, (_35_ + 16));
                                        this._storeInt((this._loadInt((_35_ + 120))), _34_);
                                        sqlite3_free((this._loadInt((_35_ + 92))));
                                        break label$3;
                                    }
                                    while (false);
                                    this._storeInt((_35_ + 140), 7);
                                    break label$0;
                                }
                                while (false);
                                sqlite3DbFree((this._loadInt((_35_ + 136))), (this._loadInt((_35_ + 88))));
                                this._storeInt((_35_ + 140), 7);
                                break label$0;
                            }
                            while (false);
                            if ((this._loadInt(((this._loadInt((_35_ + 108))) + 8))) == 0) {
                                break label$1;
                            }
                            this._storeInt((this._loadInt(((this._loadInt((_35_ + 108))) + 8))), (this._loadInt((this._loadInt((_35_ + 128))))));
                            _32_ = this._storeInt(((this._loadInt((_35_ + 108))) + 12), 1);
                            if ((this._loadInt((_35_ + 112))) == 0) {
                                break label$2;
                            }
                            _34_ = this._storeInt((_35_ + 84), 41280);
                            _33_ = this._loadInt((_35_ + 136));
                            this._storeInt((_35_ + 32), (this._loadInt((this._loadInt((_35_ + 132))))));
                            _34_ = sqlite3MPrintf(_33_, _34_, (_35_ + 32));
                            this._storeInt((this._loadInt((_35_ + 120))), _34_);
                            sqlite3VtabUnlock((this._loadInt((_35_ + 108))));
                            this._storeInt((_35_ + 104), _32_);
                            break label$1;
                        }
                        while (false);
                        _34_ = this._loadInt((_35_ + 136));
                        this._storeInt(_35_, (this._loadInt((_35_ + 88))));
                        _34_ = sqlite3MPrintf(_34_, 41248, _35_);
                        this._storeInt((this._loadInt((_35_ + 120))), _34_);
                    }
                    while (false);
                    sqlite3DbFree((this._loadInt((_35_ + 136))), (this._loadInt((_35_ + 108))));
                    break label$1;
                }
                while (false);
                this._storeInt(((_34_ = this._loadInt((_35_ + 108))) + 24), (this._loadInt(((_33_ = this._loadInt((_35_ + 132))) + 52))));
                this._storeInt((_33_ + 52), _34_);
                _30_ = this._storeInt((_35_ + 80), 0);
                label$10:
                do {
                    label$9:
                    while (true) {
                        if ((this._loadInt((_35_ + 80))) >= (this._loadInt(((this._loadInt((_35_ + 132))) + 8)))) {
                            break label$10;
                        }
                        this._storeInt((_35_ + 76), (this._loadInt((((this._loadInt(((this._loadInt((_35_ + 132))) + 12))) + ((this._loadInt((_35_ + 80))) * 24)) + 12))));
                        _31_ = this._storeInt((_35_ + 68), _30_);
                        label$11:
                        do {
                            if ((this._loadInt((_35_ + 76))) == 0) {
                                break label$11;
                            }
                            this._storeInt((_35_ + 72), (sqlite3Strlen30((this._loadInt((_35_ + 76))))));
                            label$12:
                            do {
                                label$13:
                                do {
                                    if ((sqlite3_strnicmp(41328, (this._loadInt((_35_ + 76))), 6)) != 0) {
                                        break label$13;
                                    }
                                    if ((this._loadInt8s(((this._loadInt((_35_ + 76))) + 6))) == 0) {
                                        break label$12;
                                    }
                                    if ((this._loadInt8s(((this._loadInt((_35_ + 76))) + 6))) == 32) {
                                        break label$12;
                                    }
                                }
                                while (false);
                                this._storeInt((_35_ + 68), _31_);
                                label$15:
                                do {
                                    label$14:
                                    while (true) {
                                        if ((this._loadInt((_35_ + 68))) >= (this._loadInt((_35_ + 72)))) {
                                            break label$12;
                                        }
                                        label$16:
                                        do {
                                            if ((sqlite3_strnicmp(41344, ((this._loadInt((_35_ + 76))) + (this._loadInt((_35_ + 68)))), 7)) != 0) {
                                                break label$16;
                                            }
                                            if ((this._loadInt8s((((this._loadInt((_35_ + 76))) + (this._loadInt((_35_ + 68)))) + 7))) == 0) {
                                                break label$15;
                                            }
                                            if ((this._loadInt8s((((this._loadInt((_35_ + 76))) + (this._loadInt((_35_ + 68)))) + 7))) == 32) {
                                                break label$15;
                                            }
                                        }
                                        while (false);
                                        this._storeInt((_35_ + 68), ((this._loadInt((_35_ + 68))) + _32_));
                                        continue label$14;
                                    }
                                }
                                while (false);
                                this._storeInt((_35_ + 68), ((this._loadInt((_35_ + 68))) + _32_));
                            }
                            while (false);
                            if ((this._loadInt((_35_ + 68))) >= (this._loadInt((_35_ + 72)))) {
                                break label$11;
                            }
                            this._storeInt((_35_ + 60), ((((this._loadInt8s((((this._loadInt((_35_ + 76))) + (this._loadInt((_35_ + 68)))) + 6))) != _31_) ? 1 : 0) | 6));
                            this._storeInt((_35_ + 64), (this._loadInt((_35_ + 68))));
                            label$18:
                            do {
                                label$17:
                                while (true) {
                                    if (((this._loadInt((_35_ + 64))) + (this._loadInt((_35_ + 60)))) > (this._loadInt((_35_ + 72)))) {
                                        break label$18;
                                    }
                                    this._storeInt8(((_33_ = this._loadInt((_35_ + 76))) + (_34_ = this._loadInt((_35_ + 64)))), (this._loadInt8u((_33_ + (_34_ + (this._loadInt((_35_ + 60))))))));
                                    this._storeInt((_35_ + 64), (_34_ + _32_));
                                    continue label$17;
                                }
                            }
                            while (false);
                            label$19:
                            do {
                                if ((this._loadInt8s(((this._loadInt((_35_ + 76))) + (this._loadInt((_35_ + 68)))))) != 0) {
                                    break label$19;
                                }
                                if ((this._loadInt((_35_ + 68))) < _32_) {
                                    break label$19;
                                }
                                this._storeInt8((((this._loadInt((_35_ + 76))) + (this._loadInt((_35_ + 68)))) + -1), _31_);
                            }
                            while (false);
                            this._storeInt8((((this._loadInt(((this._loadInt((_35_ + 132))) + 12))) + ((this._loadInt((_35_ + 80))) * 24)) + 23), _32_);
                        }
                        while (false);
                        this._storeInt((_35_ + 80), ((this._loadInt((_35_ + 80))) + _32_));
                        continue label$9;
                    }
                }
                while (false);
            }
            while (false);
            sqlite3DbFree((this._loadInt((_35_ + 136))), (this._loadInt((_35_ + 88))));
            this._storeInt((_35_ + 140), (this._loadInt((_35_ + 104))));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 140));
        this._storeInt((0 + 4), (_35_ + 144));
        return _34_;
    }

    @Override()
    public final void analyzeDatabase(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 16), (this._loadInt((((this._loadInt(((this._storeInt((_32_ + 20), (this._loadInt((this._loadInt((_32_ + 28))))))) + 8))) + ((this._loadInt((_32_ + 24))) << 4)) + 12))));
        sqlite3BeginWriteOperation((this._loadInt((_32_ + 28))), 0, (this._loadInt((_32_ + 24))));
        _30_ = this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt((_32_ + 28))) + 68))));
        this._storeInt(((_31_ = this._loadInt((_32_ + 28))) + 68), ((this._loadInt((_31_ + 68))) + 2));
        openStatTable(_31_, (this._loadInt((_32_ + 24))), _30_, 0, 0);
        this._storeInt((_32_ + 4), ((this._loadInt(((this._loadInt((_32_ + 28))) + 72))) + 1));
        this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 16))) + 16))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_32_ + 12))) == 0) {
                    break label$1;
                }
                _31_ = this._storeInt(_32_, (this._loadInt(((this._loadInt((_32_ + 12))) + 8))));
                analyzeOneTable((this._loadInt((_32_ + 28))), _31_, 0, (this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))));
                this._storeInt((_32_ + 12), (this._loadInt((this._loadInt((_32_ + 12))))));
                continue label$0;
            }
        }
        while (false);
        loadAnalysis((this._loadInt((_32_ + 28))), (this._loadInt((_32_ + 24))));
        this._storeInt((0 + 4), (_32_ + 32));
        return;
    }

    @Override()
    public final int sqlite3FindDb(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        _31_ = this._storeInt(_32_, (sqlite3NameFromToken((this._loadInt((_32_ + 12))), _31_)));
        this._storeInt((_32_ + 4), (sqlite3FindDbName((this._loadInt((_32_ + 12))), _31_)));
        sqlite3DbFree((this._loadInt((_32_ + 12))), (this._loadInt(_32_)));
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 16));
        return _31_;
    }

    @Override()
    public final void analyzeTable(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        _32_ = this._storeInt((_33_ + 16), (sqlite3SchemaToIndex((this._loadInt((this._loadInt((_33_ + 28))))), (this._loadInt(((this._loadInt((_33_ + 24))) + 68))))));
        sqlite3BeginWriteOperation((this._loadInt((_33_ + 28))), 0, _32_);
        this._storeInt((_33_ + 12), (this._loadInt(((this._loadInt((_33_ + 28))) + 68))));
        this._storeInt(((_32_ = this._loadInt((_33_ + 28))) + 68), ((this._loadInt((_32_ + 68))) + 2));
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_33_ + 20))) == 0) {
                    break label$1;
                }
                openStatTable((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 12))), (this._loadInt((this._loadInt((_33_ + 20))))), 41472);
                break label$0;
            }
            while (false);
            openStatTable((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 12))), (this._loadInt((this._loadInt((_33_ + 24))))), 41488);
        }
        while (false);
        analyzeOneTable((_32_ = this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 12))), ((this._loadInt((_32_ + 72))) + 1));
        loadAnalysis((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 16))));
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final int sqlite3TwoPartName(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_34_ + 20), _31_);
        this._storeInt((_34_ + 16), _32_);
        this._storeInt((_34_ + 12), _33_);
        this._storeInt((_34_ + 4), (this._loadInt((this._loadInt((_34_ + 24))))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_34_ + 16))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt(((this._loadInt((_34_ + 16))) + 4))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt8u(((this._loadInt((_34_ + 4))) + 124))) == 0) {
                            break label$2;
                        }
                        sqlite3ErrorMsg((this._loadInt((_34_ + 24))), 41408, 0);
                        this._storeInt(((_33_ = this._loadInt((_34_ + 24))) + 64), ((this._loadInt((_33_ + 64))) + 1));
                        this._storeInt((_34_ + 28), -1);
                        break label$0;
                    }
                    while (false);
                    this._storeInt((_34_ + 8), (this._loadInt(((this._loadInt((_34_ + 4))) + 116))));
                    this._storeInt((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 20))));
                    break label$1;
                }
                while (false);
                this._storeInt((this._loadInt((_34_ + 12))), (this._loadInt((_34_ + 16))));
                if ((this._storeInt((_34_ + 8), (sqlite3FindDb((this._loadInt((_34_ + 4))), (this._loadInt((_34_ + 20))))))) > -1) {
                    break label$1;
                }
                _33_ = this._loadInt((_34_ + 24));
                this._storeInt(_34_, (this._loadInt((_34_ + 20))));
                sqlite3ErrorMsg(_33_, 41440, _34_);
                this._storeInt(((_33_ = this._loadInt((_34_ + 24))) + 64), ((this._loadInt((_33_ + 64))) + 1));
                this._storeInt((_34_ + 28), -1);
                break label$0;
            }
            while (false);
            this._storeInt((_34_ + 28), (this._loadInt((_34_ + 8))));
        }
        while (false);
        _33_ = this._loadInt((_34_ + 28));
        this._storeInt((0 + 4), (_34_ + 32));
        return _33_;
    }

    @Override()
    public final void openStatTable(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        int _36_ = 0;
        _35_ = this._storeInt((((_36_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 68) + 4), 0);
        this._storeInt((_36_ + 92), _30_);
        this._storeInt((_36_ + 88), _31_);
        this._storeInt((_36_ + 84), _32_);
        this._storeInt((_36_ + 80), _33_);
        this._storeInt((_36_ + 76), _34_);
        _34_ = this._storeInt16((_36_ + 66), (this._storeInt((_36_ + 68), _35_)));
        this._storeInt((_36_ + 56), (this._loadInt((this._loadInt((_36_ + 92))))));
        label$0:
        do {
            if ((this._storeInt((_36_ + 48), (sqlite3GetVdbe((this._loadInt((_36_ + 92))))))) == 0) {
                break label$0;
            }
            this._storeInt((_36_ + 52), ((this._loadInt(((this._loadInt((_36_ + 56))) + 8))) + ((this._loadInt((_36_ + 88))) << 4)));
            _33_ = this._storeInt((_36_ + 60), _34_);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_36_ + 60))) > _33_) {
                        break label$2;
                    }
                    _34_ = this._storeInt((_36_ + 44), (this._loadInt((((this._loadInt((_36_ + 60))) << 3) + 41524))));
                    label$3:
                    do {
                        label$4:
                        do {
                            label$5:
                            do {
                                if ((this._storeInt((_36_ + 40), (sqlite3FindTable((this._loadInt((_36_ + 56))), _34_, (this._loadInt((this._loadInt((_36_ + 52))))))))) == 0) {
                                    break label$5;
                                }
                                _34_ = this._storeInt(((_36_ + 68) + ((this._loadInt((_36_ + 60))) << 2)), (this._loadInt(((this._loadInt((_36_ + 40))) + 20))));
                                sqlite3TableLock((this._loadInt((_36_ + 92))), (this._loadInt((_36_ + 88))), _34_, 1, (this._loadInt((_36_ + 44))));
                                if ((this._loadInt((_36_ + 80))) == 0) {
                                    break label$4;
                                }
                                _34_ = this._loadInt((this._loadInt((_36_ + 52))));
                                this._storeInt((_36_ + 28), (this._loadInt((_36_ + 80))));
                                this._storeInt((_36_ + 24), (this._loadInt((_36_ + 76))));
                                this._storeInt((_36_ + 20), (this._loadInt((_36_ + 44))));
                                _32_ = this._loadInt((_36_ + 92));
                                this._storeInt((_36_ + 16), _34_);
                                sqlite3NestedParse(_32_, 41568, (_36_ + 16));
                                break label$3;
                            }
                            while (false);
                            _34_ = this._loadInt((this._loadInt((_36_ + 52))));
                            this._storeInt((_36_ + 4), (this._loadInt((_36_ + 44))));
                            _32_ = this._loadInt((_36_ + 92));
                            _31_ = this._loadInt((_36_ + 60));
                            this._storeInt(_36_, _34_);
                            this._storeInt((_36_ + 8), (this._loadInt(((_31_ << 3) + 41528))));
                            sqlite3NestedParse(_32_, 41536, _36_);
                            this._storeInt8(((_36_ + 66) + (_34_ = this._loadInt((_36_ + 60)))), 1);
                            this._storeInt(((_36_ + 68) + (_34_ << 2)), (this._loadInt(((this._loadInt((_36_ + 92))) + 412))));
                            break label$3;
                        }
                        while (false);
                        sqlite3VdbeAddOp2((this._loadInt((_36_ + 48))), 96, (this._loadInt(((_36_ + 68) + ((this._loadInt((_36_ + 60))) << 2)))), (this._loadInt((_36_ + 88))));
                    }
                    while (false);
                    this._storeInt((_36_ + 60), ((this._loadInt((_36_ + 60))) + 1));
                    continue label$1;
                }
            }
            while (false);
            _33_ = this._storeInt((_36_ + 60), 0);
            label$7:
            do {
                label$6:
                while (true) {
                    if ((this._loadInt((_36_ + 60))) > _33_) {
                        break label$7;
                    }
                    sqlite3VdbeAddOp3((this._loadInt((_36_ + 48))), 39, ((this._loadInt((_36_ + 84))) + (_34_ = this._loadInt((_36_ + 60)))), (this._loadInt(((_36_ + 68) + (_34_ << 2)))), (this._loadInt((_36_ + 88))));
                    sqlite3VdbeChangeP4((this._loadInt((_36_ + 48))), -1, 3, -14);
                    sqlite3VdbeChangeP5((this._loadInt((_36_ + 48))), (this._loadInt8u(((_36_ + 66) + (this._loadInt((_36_ + 60)))))));
                    this._storeInt((_36_ + 60), ((this._loadInt((_36_ + 60))) + 1));
                    continue label$6;
                }
            }
            while (false);
        }
        while (false);
        this._storeInt((0 + 4), (_36_ + 96));
        return;
    }

    @Override()
    public final void analyzeOneTable(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 112))) + 108), _30_);
        this._storeInt((_35_ + 104), _31_);
        this._storeInt((_35_ + 100), _32_);
        this._storeInt((_35_ + 96), _33_);
        this._storeInt((_35_ + 92), _34_);
        this._storeInt((_35_ + 88), (this._loadInt((this._loadInt((_35_ + 108))))));
        this._storeInt((_35_ + 60), -1);
        this._storeInt((_35_ + 92), ((_34_ = this._loadInt((_35_ + 92))) + 1));
        this._storeInt((_35_ + 52), _34_);
        this._storeInt((_35_ + 92), ((_34_ = this._loadInt((_35_ + 92))) + 1));
        this._storeInt((_35_ + 48), _34_);
        this._storeInt((_35_ + 92), ((_34_ = this._loadInt((_35_ + 92))) + 1));
        this._storeInt((_35_ + 44), _34_);
        this._storeInt((_35_ + 92), ((_34_ = this._loadInt((_35_ + 92))) + 1));
        this._storeInt((_35_ + 40), _34_);
        this._storeInt((_35_ + 92), ((_34_ = this._loadInt((_35_ + 92))) + 1));
        this._storeInt((_35_ + 36), _34_);
        this._storeInt((_35_ + 92), ((_34_ = this._loadInt((_35_ + 92))) + 1));
        this._storeInt((_35_ + 32), _34_);
        this._storeInt((_35_ + 92), ((_34_ = this._loadInt((_35_ + 92))) + 1));
        this._storeInt((_35_ + 28), _34_);
        label$0:
        do {
            if ((this._storeInt((_35_ + 76), (sqlite3GetVdbe((this._loadInt((_35_ + 108))))))) == 0) {
                break label$0;
            }
            if ((this._loadInt((_35_ + 104))) == 0) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_35_ + 104))) + 20))) == 0) {
                break label$0;
            }
            if ((memcmp((this._loadInt((this._loadInt((_35_ + 104))))), 38560, 7)) == 0) {
                break label$0;
            }
            _34_ = this._storeInt((_35_ + 56), (sqlite3SchemaToIndex((this._loadInt((_35_ + 88))), (this._loadInt(((this._loadInt((_35_ + 104))) + 68))))));
            if ((sqlite3AuthCheck((this._loadInt((_35_ + 108))), 28, (this._loadInt((this._loadInt((_35_ + 104))))), 0, (this._loadInt(((this._loadInt(((this._loadInt((_35_ + 88))) + 8))) + (_34_ << 4)))))) != 0) {
                break label$0;
            }
            sqlite3TableLock((this._loadInt((_35_ + 108))), (this._loadInt((_35_ + 56))), (this._loadInt(((_34_ = this._loadInt((_35_ + 104))) + 20))), 0, (this._loadInt(_34_)));
            this._storeInt(((_34_ = this._loadInt((_35_ + 108))) + 68), ((_34_ = this._loadInt((_34_ + 68))) + 1));
            this._storeInt((_35_ + 80), _34_);
            sqlite3VdbeAddOp4((this._loadInt((_35_ + 76))), 94, 0, (this._loadInt((_35_ + 52))), 0, (this._loadInt((this._loadInt((_35_ + 104))))), 0);
            this._storeInt((_35_ + 84), (this._loadInt(((this._loadInt((_35_ + 104))) + 16))));
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_35_ + 84))) == 0) {
                        break label$2;
                    }
                    label$3:
                    do {
                        label$4:
                        do {
                            if ((this._loadInt((_35_ + 100))) == 0) {
                                break label$4;
                            }
                            if ((this._loadInt((_35_ + 100))) != (this._loadInt((_35_ + 84)))) {
                                break label$3;
                            }
                        }
                        while (false);
                        this._storeInt((_35_ + 24), (this._loadInt(((this._loadInt((_35_ + 84))) + 4))));
                        this._storeInt((_35_ + 20), (sqlite3IndexKeyinfo((this._loadInt((_35_ + 108))), (this._loadInt((_35_ + 84))))));
                        label$5:
                        do {
                            if ((((this._loadInt((_35_ + 92))) + ((this._loadInt((_35_ + 24))) << 1)) + 1) <= (this._loadInt(((this._loadInt((_35_ + 108))) + 72)))) {
                                break label$5;
                            }
                            this._storeInt(((this._loadInt((_35_ + 108))) + 72), (((this._loadInt((_35_ + 92))) + ((this._loadInt((_35_ + 24))) << 1)) + 1));
                        }
                        while (false);
                        sqlite3VdbeAddOp4((this._loadInt((_35_ + 76))), 38, (this._loadInt((_35_ + 80))), (this._loadInt(((this._loadInt((_35_ + 84))) + 20))), (this._loadInt((_35_ + 56))), (this._loadInt((_35_ + 20))), -16);
                        sqlite3VdbeAddOp4((this._loadInt((_35_ + 76))), 94, 0, (this._loadInt((_35_ + 48))), 0, (this._loadInt((this._loadInt((_35_ + 84))))), 0);
                        _34_ = this._storeInt((_35_ + 72), 0);
                        label$7:
                        do {
                            label$6:
                            while (true) {
                                if ((this._loadInt((_35_ + 72))) > (this._loadInt((_35_ + 24)))) {
                                    break label$7;
                                }
                                sqlite3VdbeAddOp2((this._loadInt((_35_ + 76))), 7, _34_, ((this._loadInt((_35_ + 92))) + (this._loadInt((_35_ + 72)))));
                                this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + 1));
                                continue label$6;
                            }
                        }
                        while (false);
                        this._storeInt((_35_ + 72), _34_);
                        label$9:
                        do {
                            label$8:
                            while (true) {
                                if ((this._loadInt((_35_ + 72))) >= (this._loadInt((_35_ + 24)))) {
                                    break label$9;
                                }
                                sqlite3VdbeAddOp2((this._loadInt((_35_ + 76))), 10, _34_, ((((this._loadInt((_35_ + 92))) + (this._loadInt((_35_ + 24)))) + (this._loadInt((_35_ + 72)))) + 1));
                                this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + 1));
                                continue label$8;
                            }
                        }
                        while (false);
                        _33_ = this._storeInt((_35_ + 64), (sqlite3VdbeMakeLabel((this._loadInt((_35_ + 76))))));
                        sqlite3VdbeAddOp2((this._loadInt((_35_ + 76))), 65, (this._loadInt((_35_ + 80))), _33_);
                        this._storeInt((_35_ + 68), (sqlite3VdbeCurrentAddr((this._loadInt((_35_ + 76))))));
                        sqlite3VdbeAddOp2((this._loadInt((_35_ + 76))), 20, (this._loadInt((_35_ + 92))), 1);
                        _33_ = this._storeInt((_35_ + 72), _34_);
                        label$11:
                        do {
                            label$10:
                            while (true) {
                                if ((this._loadInt((_35_ + 72))) >= (this._loadInt((_35_ + 24)))) {
                                    break label$11;
                                }
                                sqlite3VdbeAddOp3((this._loadInt((_35_ + 76))), 28, (this._loadInt((_35_ + 80))), (this._loadInt((_35_ + 72))), (this._loadInt((_35_ + 40))));
                                label$12:
                                do {
                                    if ((this._loadInt((_35_ + 72))) != 0) {
                                        break label$12;
                                    }
                                    sqlite3VdbeAddOp1((this._loadInt((_35_ + 76))), 27, ((this._loadInt((_35_ + 92))) + 1));
                                }
                                while (false);
                                _34_ = this._storeInt((_35_ + 16), (sqlite3LocateCollSeq((this._loadInt((_35_ + 108))), (this._loadInt(((this._loadInt(((this._loadInt((_35_ + 84))) + 44))) + ((this._loadInt((_35_ + 72))) << 2)))))));
                                sqlite3VdbeAddOp4((this._loadInt((_35_ + 76))), 75, (this._loadInt((_35_ + 40))), _33_, ((((this._loadInt((_35_ + 92))) + (this._loadInt((_35_ + 24)))) + (this._loadInt((_35_ + 72)))) + 1), _34_, -4);
                                sqlite3VdbeChangeP5((this._loadInt((_35_ + 76))), 128);
                                this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + 1));
                                continue label$10;
                            }
                        }
                        while (false);
                        if ((this._loadInt8u(((this._loadInt((_35_ + 88))) + 30))) != 0) {
                            break label$0;
                        }
                        sqlite3VdbeAddOp2((this._loadInt((_35_ + 76))), 1, _33_, (this._loadInt((_35_ + 64))));
                        this._storeInt((_35_ + 72), _33_);
                        label$14:
                        do {
                            label$13:
                            while (true) {
                                if ((this._loadInt((_35_ + 72))) >= (this._loadInt((_35_ + 24)))) {
                                    break label$14;
                                }
                                this._storeInt((_35_ + 12), ((sqlite3VdbeCurrentAddr((this._loadInt((_35_ + 76))))) - ((this._loadInt((_35_ + 24))) << 1)));
                                label$15:
                                do {
                                    if ((this._loadInt((_35_ + 72))) != 0) {
                                        break label$15;
                                    }
                                    sqlite3VdbeJumpHere((this._loadInt((_35_ + 76))), ((this._loadInt((_35_ + 12))) + -1));
                                }
                                while (false);
                                sqlite3VdbeJumpHere((this._loadInt((_35_ + 76))), (this._loadInt((_35_ + 12))));
                                sqlite3VdbeAddOp2((this._loadInt((_35_ + 76))), 20, (((this._loadInt((_35_ + 92))) + (this._loadInt((_35_ + 72)))) + 1), 1);
                                sqlite3VdbeAddOp3((this._loadInt((_35_ + 76))), 28, (this._loadInt((_35_ + 80))), (_34_ = this._loadInt((_35_ + 72))), ((_34_ + ((this._loadInt((_35_ + 92))) + (this._loadInt((_35_ + 24))))) + 1));
                                this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + 1));
                                continue label$13;
                            }
                        }
                        while (false);
                        sqlite3VdbeResolveLabel((this._loadInt((_35_ + 76))), (this._loadInt((_35_ + 64))));
                        sqlite3VdbeAddOp2((this._loadInt((_35_ + 76))), 67, (this._loadInt((_35_ + 80))), (this._loadInt((_35_ + 68))));
                        sqlite3VdbeAddOp1((this._loadInt((_35_ + 76))), 43, (this._loadInt((_35_ + 80))));
                        sqlite3VdbeAddOp2((this._loadInt((_35_ + 76))), 15, (this._loadInt((_35_ + 92))), (this._loadInt((_35_ + 44))));
                        label$16:
                        do {
                            if ((this._loadInt((_35_ + 60))) > -1) {
                                break label$16;
                            }
                            this._storeInt((_35_ + 60), (sqlite3VdbeAddOp1((this._loadInt((_35_ + 76))), 27, (this._loadInt((_35_ + 92))))));
                        }
                        while (false);
                        _34_ = this._storeInt((_35_ + 72), _33_);
                        label$18:
                        do {
                            label$17:
                            while (true) {
                                if ((this._loadInt((_35_ + 72))) >= (this._loadInt((_35_ + 24)))) {
                                    break label$18;
                                }
                                sqlite3VdbeAddOp4((this._loadInt((_35_ + 76))), 94, _34_, (this._loadInt((_35_ + 32))), _34_, 41504, _34_);
                                sqlite3VdbeAddOp3((this._loadInt((_35_ + 76))), 91, (this._loadInt((_35_ + 32))), (_33_ = this._loadInt((_35_ + 44))), _33_);
                                sqlite3VdbeAddOp3((this._loadInt((_35_ + 76))), 86, (_33_ = this._loadInt((_35_ + 92))), ((_33_ + (this._loadInt((_35_ + 72)))) + 1), (this._loadInt((_35_ + 32))));
                                sqlite3VdbeAddOp2((this._loadInt((_35_ + 76))), 20, (this._loadInt((_35_ + 32))), -1);
                                sqlite3VdbeAddOp3((this._loadInt((_35_ + 76))), 89, (((this._loadInt((_35_ + 92))) + (this._loadInt((_35_ + 72)))) + 1), (_33_ = this._loadInt((_35_ + 32))), _33_);
                                sqlite3VdbeAddOp1((this._loadInt((_35_ + 76))), 144, (this._loadInt((_35_ + 32))));
                                sqlite3VdbeAddOp3((this._loadInt((_35_ + 76))), 91, (this._loadInt((_35_ + 32))), (_33_ = this._loadInt((_35_ + 44))), _33_);
                                this._storeInt((_35_ + 72), ((this._loadInt((_35_ + 72))) + 1));
                                continue label$17;
                            }
                        }
                        while (false);
                        sqlite3VdbeAddOp4((this._loadInt((_35_ + 76))), 30, (this._loadInt((_35_ + 52))), 3, (this._loadInt((_35_ + 36))), 41520, _34_);
                        sqlite3VdbeAddOp2((this._loadInt((_35_ + 76))), 54, (this._loadInt((_35_ + 96))), (this._loadInt((_35_ + 28))));
                        sqlite3VdbeAddOp3((this._loadInt((_35_ + 76))), 55, (this._loadInt((_35_ + 96))), (this._loadInt((_35_ + 36))), (this._loadInt((_35_ + 28))));
                        sqlite3VdbeChangeP5((this._loadInt((_35_ + 76))), 8);
                    }
                    while (false);
                    this._storeInt((_35_ + 84), (this._loadInt(((this._loadInt((_35_ + 84))) + 32))));
                    continue label$1;
                }
            }
            while (false);
            label$19:
            do {
                label$20:
                do {
                    if ((this._loadInt(((this._loadInt((_35_ + 104))) + 16))) == 0) {
                        break label$20;
                    }
                    sqlite3VdbeJumpHere((this._loadInt((_35_ + 76))), (this._loadInt((_35_ + 60))));
                    this._storeInt((_35_ + 60), (sqlite3VdbeAddOp0((this._loadInt((_35_ + 76))), 1)));
                    break label$19;
                }
                while (false);
                sqlite3VdbeAddOp3((this._loadInt((_35_ + 76))), 38, (this._loadInt((_35_ + 80))), (this._loadInt(((this._loadInt((_35_ + 104))) + 20))), (this._loadInt((_35_ + 56))));
                sqlite3VdbeAddOp2((this._loadInt((_35_ + 76))), 31, (this._loadInt((_35_ + 80))), (this._loadInt((_35_ + 44))));
                sqlite3VdbeAddOp1((this._loadInt((_35_ + 76))), 43, (this._loadInt((_35_ + 80))));
                this._storeInt((_35_ + 60), (sqlite3VdbeAddOp1((this._loadInt((_35_ + 76))), 27, (this._loadInt((_35_ + 44))))));
            }
            while (false);
            sqlite3VdbeAddOp2((this._loadInt((_35_ + 76))), 10, 0, (this._loadInt((_35_ + 48))));
            sqlite3VdbeAddOp4((this._loadInt((_35_ + 76))), 30, (this._loadInt((_35_ + 52))), 3, (this._loadInt((_35_ + 36))), 41520, 0);
            sqlite3VdbeAddOp2((this._loadInt((_35_ + 76))), 54, (this._loadInt((_35_ + 96))), (this._loadInt((_35_ + 28))));
            sqlite3VdbeAddOp3((this._loadInt((_35_ + 76))), 55, (this._loadInt((_35_ + 96))), (this._loadInt((_35_ + 36))), (this._loadInt((_35_ + 28))));
            sqlite3VdbeChangeP5((this._loadInt((_35_ + 76))), 8);
            label$21:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 108))) + 72))) >= (this._loadInt((_35_ + 36)))) {
                    break label$21;
                }
                this._storeInt(((this._loadInt((_35_ + 108))) + 72), (this._loadInt((_35_ + 36))));
            }
            while (false);
            sqlite3VdbeJumpHere((this._loadInt((_35_ + 76))), (this._loadInt((_35_ + 60))));
        }
        while (false);
        this._storeInt((0 + 4), (_35_ + 112));
        return;
    }

    @Override()
    public final void loadAnalysis(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        label$0:
        do {
            if ((this._storeInt((_32_ + 4), (sqlite3GetVdbe((this._loadInt((_32_ + 12))))))) == 0) {
                break label$0;
            }
            sqlite3VdbeAddOp1((this._loadInt((_32_ + 4))), 100, (this._loadInt((_32_ + 8))));
        }
        while (false);
        this._storeInt((0 + 4), (_32_ + 16));
        return;
    }

    @Override()
    public final int sqlite3VdbeAddOp1(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        _32_ = sqlite3VdbeAddOp3((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_, 0, 0);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final void sqlite3TableLock(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_35_ + 40), _31_);
        this._storeInt((_35_ + 36), _32_);
        this._storeInt8((_35_ + 35), _33_);
        this._storeInt((_35_ + 28), _34_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt(((this._loadInt((_35_ + 44))) + 424))) == 0) {
                    break label$1;
                }
                _34_ = this._loadInt(((this._loadInt((_35_ + 44))) + 424));
                break label$0;
            }
            while (false);
            _34_ = this._loadInt((_35_ + 44));
        }
        while (false);
        this._storeInt((_35_ + 24), _34_);
        this._storeInt((_35_ + 20), 0);
        label$2:
        do {
            label$3:
            do {
                label$5:
                do {
                    label$4:
                    while (true) {
                        if ((this._loadInt((_35_ + 20))) >= (this._loadInt(((this._loadInt((_35_ + 24))) + 400)))) {
                            break label$3;
                        }
                        label$6:
                        do {
                            if ((this._loadInt((this._storeInt((_35_ + 12), ((this._loadInt(((this._loadInt((_35_ + 24))) + 404))) + ((this._loadInt((_35_ + 20))) << 4)))))) != (this._loadInt((_35_ + 40)))) {
                                break label$6;
                            }
                            if ((this._loadInt(((this._loadInt((_35_ + 12))) + 4))) == (this._loadInt((_35_ + 36)))) {
                                break label$5;
                            }
                        }
                        while (false);
                        this._storeInt((_35_ + 20), ((this._loadInt((_35_ + 20))) + 1));
                        continue label$4;
                    }
                }
                while (false);
                _34_ = 1;
                label$7:
                do {
                    if ((this._loadInt8u(((this._loadInt((_35_ + 12))) + 8))) != 0) {
                        break label$7;
                    }
                    _34_ = ((this._loadInt8u((_35_ + 35))) != 0) ? 1 : 0;
                }
                while (false);
                this._storeInt8(((this._loadInt((_35_ + 12))) + 8), _34_);
                break label$2;
            }
            while (false);
            _34_ = this._storeInt((_35_ + 16), (((this._loadInt(((this._loadInt((_35_ + 24))) + 400))) << 4) + 16));
            _34_ = sqlite3DbReallocOrFree((this._loadInt((_33_ = this._loadInt((_35_ + 24))))), (this._loadInt((_33_ + 404))), _34_);
            label$8:
            do {
                if ((this._storeInt(((this._loadInt((_35_ + 24))) + 404), _34_)) == 0) {
                    break label$8;
                }
                this._storeInt(((_34_ = this._loadInt((_35_ + 24))) + 400), ((_33_ = this._loadInt((_34_ + 400))) + 1));
                this._storeInt((this._storeInt((_35_ + 12), ((this._loadInt((_34_ + 404))) + (_33_ << 4)))), (this._loadInt((_35_ + 40))));
                this._storeInt(((this._loadInt((_35_ + 12))) + 4), (this._loadInt((_35_ + 36))));
                this._storeInt8(((this._loadInt((_35_ + 12))) + 8), (this._loadInt8u((_35_ + 35))));
                this._storeInt(((this._loadInt((_35_ + 12))) + 12), (this._loadInt((_35_ + 28))));
                break label$2;
            }
            while (false);
            this._storeInt(((_34_ = this._loadInt((_35_ + 24))) + 400), 0);
            this._storeInt8(((this._loadInt(_34_)) + 30), 1);
        }
        while (false);
        this._storeInt((0 + 4), (_35_ + 48));
        return;
    }

    @Override()
    public final int sqlite3IndexKeyinfo(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 12), ((((_31_ = this._storeInt((_32_ + 16), (this._loadInt(((this._storeInt((_32_ + 24), _31_)) + 4))))) << 2) + _31_) + 12));
        label$0:
        do {
            if ((this._storeInt((_32_ + 4), (sqlite3DbMallocZero((this._storeInt((_32_ + 8), (this._loadInt((this._loadInt((_32_ + 28))))))), (this._loadInt((_32_ + 12))))))) == 0) {
                break label$0;
            }
            this._storeInt((_31_ = this._loadInt((_32_ + 4))), (this._loadInt((this._loadInt((_32_ + 28))))));
            this._storeInt((_31_ + 8), ((_31_ + ((this._loadInt((_32_ + 16))) << 2)) + 12));
            this._storeInt((_32_ + 20), 0);
            label$2:
            do {
                label$1:
                while (true) {
                    if ((this._loadInt((_32_ + 20))) >= (this._loadInt((_32_ + 16)))) {
                        break label$2;
                    }
                    _31_ = this._storeInt(_32_, (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 24))) + 44))) + ((this._loadInt((_32_ + 20))) << 2)))));
                    _30_ = sqlite3LocateCollSeq((this._loadInt((_32_ + 28))), _31_);
                    this._storeInt((((_33_ = this._loadInt((_32_ + 4))) + ((_31_ = this._loadInt((_32_ + 20))) << 2)) + 12), _30_);
                    this._storeInt8((_31_ + (this._loadInt((_33_ + 8)))), (this._loadInt8u((_31_ + (this._loadInt(((this._loadInt((_32_ + 24))) + 40)))))));
                    this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 1));
                    continue label$1;
                }
            }
            while (false);
            this._storeInt16(((this._loadInt((_32_ + 4))) + 6), (this._loadInt((_32_ + 16))));
        }
        while (false);
        label$3:
        do {
            if ((this._loadInt(((this._loadInt((_32_ + 28))) + 64))) == 0) {
                break label$3;
            }
            sqlite3DbFree((this._loadInt((_32_ + 8))), (this._loadInt((_32_ + 4))));
            this._storeInt((_32_ + 4), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 4));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final int sqlite3VdbeMakeLabel(int _30_)
    {
        int _31_ = 0;
        int _32_ = 0;
        _31_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16));
        this._storeInt((_30_ + 36), ((_32_ = this._loadInt((_30_ + 36))) + 1));
        this._storeInt((_31_ + 12), _30_);
        label$0:
        do {
            if ((this._storeInt((_31_ + 8), _32_)) < (this._loadInt(((this._loadInt((_31_ + 12))) + 40)))) {
                break label$0;
            }
            _30_ = this._storeInt((_31_ + 4), (((this._loadInt(((this._loadInt((_31_ + 12))) + 40))) << 1) + 5));
            _30_ = sqlite3DbReallocOrFree((this._loadInt((_32_ = this._loadInt((_31_ + 12))))), (this._loadInt((_32_ + 44))), (_30_ << 2));
            this._storeInt(((_32_ = this._loadInt((_31_ + 12))) + 44), _30_);
            _30_ = sqlite3DbMallocSize((this._loadInt(_32_)), _30_);
            this._storeInt(((this._loadInt((_31_ + 12))) + 40), (_30_ >>> 2));
        }
        while (false);
        label$1:
        do {
            if ((this._loadInt(((this._loadInt((_31_ + 12))) + 44))) == 0) {
                break label$1;
            }
            this._storeInt(((this._loadInt(((this._loadInt((_31_ + 12))) + 44))) + ((this._loadInt((_31_ + 8))) << 2)), -1);
        }
        while (false);
        _30_ = this._loadInt((_31_ + 8));
        this._storeInt((0 + 4), (_31_ + 16));
        return (_30_ ^ -1);
    }

    @Override()
    public final int sqlite3VdbeCurrentAddr(int _30_)
    {
        return (this._loadInt(((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_)) + 28)));
    }

    @Override()
    public final int sqlite3LocateCollSeq(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 20), (this._loadInt((this._loadInt((_32_ + 28))))));
        this._storeInt8((_32_ + 19), (this._loadInt8u(((this._loadInt(((this._loadInt(((this._loadInt((_32_ + 20))) + 8))) + 12))) + 77))));
        this._storeInt8((_32_ + 18), (this._loadInt8u(((this._loadInt((_32_ + 20))) + 124))));
        this._storeInt((_32_ + 12), (sqlite3FindCollSeq((this._loadInt((_32_ + 20))), (this._loadInt8u((_32_ + 19))), (this._loadInt((_32_ + 24))), (this._loadInt8u((_32_ + 18))))));
        label$0:
        do {
            if ((this._loadInt8u((_32_ + 18))) != 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt((_32_ + 12))) == 0) {
                    break label$1;
                }
                if ((this._loadInt(((this._loadInt((_32_ + 12))) + 12))) != 0) {
                    break label$0;
                }
            }
            while (false);
            if ((this._storeInt((_32_ + 12), (sqlite3GetCollSeq((this._loadInt((_32_ + 20))), (this._loadInt8u((_32_ + 19))), (this._loadInt((_32_ + 12))), (this._loadInt((_32_ + 24))))))) != 0) {
                break label$0;
            }
            _31_ = this._loadInt((_32_ + 28));
            this._storeInt(_32_, (this._loadInt((_32_ + 24))));
            sqlite3ErrorMsg(_31_, 39824, _32_);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 12));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final void sqlite3VdbeChangeP5(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt8((_32_ + 11), _31_);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_32_ + 12))) + 4))) == 0) {
                break label$0;
            }
            this._storeInt8((((this._loadInt(((_31_ = this._loadInt((_32_ + 12))) + 4))) + ((this._loadInt((_31_ + 28))) * 20)) + -17), (this._loadInt8u((_32_ + 11))));
        }
        while (false);
        return;
    }

    @Override()
    public final void sqlite3VdbeResolveLabel(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 4), ((this._storeInt((_32_ + 8), _31_)) ^ -1));
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_32_ + 12))) + 44))) == 0) {
                break label$0;
            }
            this._storeInt(((this._loadInt(((_31_ = this._loadInt((_32_ + 12))) + 44))) + ((this._loadInt((_32_ + 4))) << 2)), (this._loadInt((_31_ + 28))));
        }
        while (false);
        return;
    }

    @Override()
    public final void reindexDatabases(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_32_ + 24), _31_);
        this._storeInt((_32_ + 12), (this._loadInt((this._loadInt((_32_ + 28))))));
        this._storeInt((_32_ + 16), 0);
        this._storeInt((_32_ + 20), (this._loadInt(((this._loadInt((_32_ + 12))) + 8))));
        label$0:
        while (true) {
            label$2:
            do {
                label$3:
                do {
                    if ((this._loadInt((_32_ + 16))) >= (this._loadInt(((this._loadInt((_32_ + 12))) + 4)))) {
                        break label$3;
                    }
                    this._storeInt((_32_ + 8), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 20))) + 12))) + 16))));
                    label$4:
                    while (true) {
                        if ((this._loadInt((_32_ + 8))) == 0) {
                            break label$2;
                        }
                        _31_ = this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 8))) + 8))));
                        reindexTable((this._loadInt((_32_ + 28))), _31_, (this._loadInt((_32_ + 24))));
                        this._storeInt((_32_ + 8), (this._loadInt((this._loadInt((_32_ + 8))))));
                        continue label$4;
                    }
                }
                while (false);
                this._storeInt((0 + 4), (_32_ + 32));
                return;
            }
            while (false);
            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
            this._storeInt((_32_ + 20), ((this._loadInt((_32_ + 20))) + 16));
            continue label$0;
        }
    }

    @Override()
    public final void reindexTable(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        this._storeInt((_33_ + 16), (this._loadInt(((this._loadInt((_33_ + 24))) + 16))));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_33_ + 16))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_33_ + 20))) == 0) {
                            break label$3;
                        }
                        if ((collationMatch((this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))))) == 0) {
                            break label$2;
                        }
                    }
                    while (false);
                    _32_ = this._storeInt((_33_ + 12), (sqlite3SchemaToIndex((this._loadInt((this._loadInt((_33_ + 28))))), (this._loadInt(((this._loadInt((_33_ + 24))) + 68))))));
                    sqlite3BeginWriteOperation((this._loadInt((_33_ + 28))), 0, _32_);
                    sqlite3RefillIndex((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 16))), -1);
                }
                while (false);
                this._storeInt((_33_ + 16), (this._loadInt(((this._loadInt((_33_ + 16))) + 32))));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void sqlite3RefillIndex(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 80))) + 76), _30_);
        this._storeInt((_33_ + 72), _31_);
        this._storeInt((_33_ + 68), _32_);
        this._storeInt((_33_ + 64), (this._loadInt(((this._loadInt((_33_ + 72))) + 16))));
        this._storeInt(((_32_ = this._loadInt((_33_ + 76))) + 68), ((_32_ = this._loadInt((_32_ + 68))) + 1));
        this._storeInt((_33_ + 60), _32_);
        this._storeInt(((_32_ = this._loadInt((_33_ + 76))) + 68), ((_32_ = this._loadInt((_32_ + 68))) + 1));
        this._storeInt((_33_ + 56), _32_);
        _32_ = this._storeInt((_33_ + 24), (sqlite3SchemaToIndex((this._storeInt((_33_ + 28), (this._loadInt((this._loadInt((_33_ + 76))))))), (this._loadInt(((this._loadInt((_33_ + 72))) + 36))))));
        label$0:
        do {
            if ((sqlite3AuthCheck((this._loadInt((_33_ + 76))), 27, (this._loadInt((this._loadInt((_33_ + 72))))), 0, (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 28))) + 8))) + (_32_ << 4)))))) != 0) {
                break label$0;
            }
            sqlite3TableLock((this._loadInt((_33_ + 76))), (this._loadInt((_33_ + 24))), (this._loadInt(((_32_ = this._loadInt((_33_ + 64))) + 20))), 1, (this._loadInt(_32_)));
            if ((this._storeInt((_33_ + 44), (sqlite3GetVdbe((this._loadInt((_33_ + 76))))))) == 0) {
                break label$0;
            }
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt((_33_ + 68))) < 0) {
                        break label$2;
                    }
                    this._storeInt((_33_ + 48), (this._loadInt((_33_ + 68))));
                    break label$1;
                }
                while (false);
                _32_ = this._storeInt((_33_ + 48), (this._loadInt(((this._loadInt((_33_ + 72))) + 20))));
                sqlite3VdbeAddOp2((this._loadInt((_33_ + 44))), 96, _32_, (this._loadInt((_33_ + 24))));
            }
            while (false);
            _32_ = this._storeInt((_33_ + 40), (sqlite3IndexKeyinfo((this._loadInt((_33_ + 76))), (this._loadInt((_33_ + 72))))));
            sqlite3VdbeAddOp4((this._loadInt((_33_ + 44))), 39, (this._loadInt((_33_ + 56))), (this._loadInt((_33_ + 48))), (this._loadInt((_33_ + 24))), _32_, -16);
            label$3:
            do {
                if ((this._loadInt((_33_ + 68))) < 0) {
                    break label$3;
                }
                sqlite3VdbeChangeP5((this._loadInt((_33_ + 44))), 1);
            }
            while (false);
            sqlite3OpenTable((this._loadInt((_33_ + 76))), (this._loadInt((_33_ + 60))), (this._loadInt((_33_ + 24))), (this._loadInt((_33_ + 64))), 38);
            this._storeInt((_33_ + 52), (sqlite3VdbeAddOp2((this._loadInt((_33_ + 44))), 65, (this._loadInt((_33_ + 60))), 0)));
            _32_ = this._storeInt((_33_ + 32), (sqlite3GetTempReg((this._loadInt((_33_ + 76))))));
            this._storeInt((_33_ + 36), (sqlite3GenerateIndexKey((this._loadInt((_33_ + 76))), (this._loadInt((_33_ + 72))), (this._loadInt((_33_ + 60))), _32_, 1)));
            label$4:
            do {
                if ((this._loadInt8u(((this._loadInt((_33_ + 72))) + 24))) == 0) {
                    break label$4;
                }
                this._storeInt((_33_ + 20), ((this._loadInt((_33_ + 36))) + (this._loadInt(((this._loadInt((_33_ + 72))) + 4)))));
                this._storeInt((_33_ + 16), ((sqlite3VdbeCurrentAddr((this._loadInt((_33_ + 44))))) + 2));
                _32_ = this._storeInt((_33_ + 12), (this._loadInt((_33_ + 36))));
                sqlite3VdbeAddOp4((this._loadInt((_33_ + 44))), 51, (this._loadInt((_33_ + 56))), (this._loadInt((_33_ + 16))), (this._loadInt((_33_ + 20))), _32_, -14);
                sqlite3HaltConstraint((this._loadInt((_33_ + 76))), 2, 41664, -2);
            }
            while (false);
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 44))), 70, (this._loadInt((_33_ + 56))), (this._loadInt((_33_ + 32))));
            sqlite3VdbeChangeP5((this._loadInt((_33_ + 44))), 16);
            sqlite3ReleaseTempReg((this._loadInt((_33_ + 76))), (this._loadInt((_33_ + 32))));
            sqlite3VdbeAddOp2((this._loadInt((_33_ + 44))), 67, (this._loadInt((_33_ + 60))), ((this._loadInt((_33_ + 52))) + 1));
            sqlite3VdbeJumpHere((this._loadInt((_33_ + 44))), (this._loadInt((_33_ + 52))));
            sqlite3VdbeAddOp1((this._loadInt((_33_ + 44))), 43, (this._loadInt((_33_ + 60))));
            sqlite3VdbeAddOp1((this._loadInt((_33_ + 44))), 43, (this._loadInt((_33_ + 56))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 80));
        return;
    }

    @Override()
    public final void sqlite3OpenTable(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_35_ + 24), _31_);
        this._storeInt((_35_ + 20), _32_);
        this._storeInt((_35_ + 16), _33_);
        this._storeInt((_35_ + 12), _34_);
        label$0:
        do {
            if (((this._loadInt8u(((this._loadInt((_35_ + 16))) + 34))) & 16) != 0) {
                break label$0;
            }
            this._storeInt((_35_ + 8), (sqlite3GetVdbe((this._loadInt((_35_ + 28))))));
            sqlite3TableLock((this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 20))), (this._loadInt(((_34_ = this._loadInt((_35_ + 16))) + 20))), (((this._loadInt((_35_ + 12))) == 39) ? 1 : 0), (this._loadInt(_34_)));
            sqlite3VdbeAddOp3((this._loadInt((_35_ + 8))), (this._loadInt((_35_ + 12))), (this._loadInt((_35_ + 24))), (this._loadInt(((this._loadInt((_35_ + 16))) + 20))), (this._loadInt((_35_ + 20))));
            sqlite3VdbeChangeP4((this._loadInt((_35_ + 8))), -1, (this._loadInt(((this._loadInt((_35_ + 16))) + 8))), -14);
        }
        while (false);
        this._storeInt((0 + 4), (_35_ + 32));
        return;
    }

    @Override()
    public final int sqlite3GenerateIndexKey(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_35_ + 40), _31_);
        this._storeInt((_35_ + 36), _32_);
        this._storeInt((_35_ + 32), _33_);
        this._storeInt((_35_ + 28), _34_);
        this._storeInt((_35_ + 24), (this._loadInt(((this._loadInt((_35_ + 44))) + 12))));
        this._storeInt((_35_ + 16), (this._loadInt(((this._loadInt((_35_ + 40))) + 16))));
        _34_ = this._storeInt((_35_ + 8), (this._loadInt(((this._loadInt((_35_ + 40))) + 4))));
        _34_ = this._storeInt((_35_ + 12), (sqlite3GetTempRange((this._loadInt((_35_ + 44))), (_34_ + 1))));
        sqlite3VdbeAddOp2((this._loadInt((_35_ + 24))), 61, (this._loadInt((_35_ + 36))), (_34_ + (this._loadInt((_35_ + 8)))));
        this._storeInt((_35_ + 20), 0);
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_35_ + 20))) >= (this._loadInt((_35_ + 8)))) {
                    break label$1;
                }
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._storeInt((_35_ + 4), (this._loadInt(((this._loadInt(((this._loadInt((_35_ + 40))) + 8))) + ((this._loadInt((_35_ + 20))) << 2)))))) != (this._loadInt(((this._loadInt((_35_ + 16))) + 4)))) {
                            break label$3;
                        }
                        sqlite3VdbeAddOp2((this._loadInt((_35_ + 24))), 15, ((_34_ = this._loadInt((_35_ + 12))) + (this._loadInt((_35_ + 8)))), (_34_ + (this._loadInt((_35_ + 20)))));
                        break label$2;
                    }
                    while (false);
                    sqlite3VdbeAddOp3((this._loadInt((_35_ + 24))), 28, (this._loadInt((_35_ + 36))), (this._loadInt((_35_ + 4))), ((this._loadInt((_35_ + 12))) + (this._loadInt((_35_ + 20)))));
                    sqlite3ColumnDefault((this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 16))), (this._loadInt((_35_ + 4))), -1);
                }
                while (false);
                this._storeInt((_35_ + 20), ((this._loadInt((_35_ + 20))) + 1));
                continue label$0;
            }
        }
        while (false);
        label$4:
        do {
            if ((this._loadInt((_35_ + 28))) == 0) {
                break label$4;
            }
            label$5:
            do {
                label$6:
                do {
                    label$7:
                    do {
                        if ((this._loadInt(((this._loadInt((_35_ + 16))) + 28))) != 0) {
                            break label$7;
                        }
                        if (((this._loadInt8u(((this._loadInt((this._loadInt((_35_ + 44))))) + 12))) & 128) == 0) {
                            break label$6;
                        }
                    }
                    while (false);
                    this._storeInt(_35_, 0);
                    break label$5;
                }
                while (false);
                this._storeInt(_35_, (sqlite3IndexAffinityStr((this._loadInt((_35_ + 24))), (this._loadInt((_35_ + 40))))));
            }
            while (false);
            sqlite3VdbeAddOp3((this._loadInt((_35_ + 24))), 30, (this._loadInt((_35_ + 12))), ((this._loadInt((_35_ + 8))) + 1), (this._loadInt((_35_ + 32))));
            sqlite3VdbeChangeP4((this._loadInt((_35_ + 24))), -1, (this._loadInt(_35_)), 0);
        }
        while (false);
        sqlite3ReleaseTempRange((this._loadInt((_35_ + 44))), (this._loadInt((_35_ + 12))), ((this._loadInt((_35_ + 8))) + 1));
        _34_ = this._loadInt((_35_ + 12));
        this._storeInt((0 + 4), (_35_ + 48));
        return _34_;
    }

    @Override()
    public final void sqlite3HaltConstraint(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        this._storeInt((_34_ + 12), (sqlite3GetVdbe((this._loadInt((_34_ + 28))))));
        label$0:
        do {
            if ((this._loadInt((_34_ + 24))) != 2) {
                break label$0;
            }
            sqlite3MayAbort((this._loadInt((_34_ + 28))));
        }
        while (false);
        sqlite3VdbeAddOp4((this._loadInt((_34_ + 12))), 6, 19, (this._loadInt((_34_ + 24))), 0, (this._loadInt((_34_ + 20))), (this._loadInt((_34_ + 16))));
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final int sqlite3GetTempRange(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_32_ + 8), _31_);
        this._storeInt((_32_ + 4), (this._loadInt(((this._loadInt((_32_ + 12))) + 60))));
        _31_ = this._storeInt(_32_, (this._loadInt(((this._loadInt((_32_ + 12))) + 56))));
        label$0:
        do {
            if ((this._loadInt((_32_ + 8))) > _31_) {
                break label$0;
            }
            this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 60), ((this._loadInt((_31_ + 60))) + (_30_ = this._loadInt((_32_ + 8)))));
            this._storeInt((_31_ + 56), ((this._loadInt((_31_ + 56))) - _30_));
            return (this._loadInt((_32_ + 4)));
        }
        while (false);
        this._storeInt((_32_ + 4), ((this._loadInt(((this._loadInt((_32_ + 12))) + 72))) + 1));
        this._storeInt(((_31_ = this._loadInt((_32_ + 12))) + 72), ((this._loadInt((_31_ + 72))) + (this._loadInt((_32_ + 8)))));
        return (this._loadInt((_32_ + 4)));
    }

    @Override()
    public final void sqlite3ColumnDefault(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        label$0:
        do {
            if ((this._loadInt(((this._loadInt((_34_ + 24))) + 28))) != 0) {
                break label$0;
            }
            this._storeInt8((_34_ + 11), (this._loadInt8u(((this._loadInt(((this._loadInt(((sqlite3VdbeDb((this._loadInt((_34_ + 28))))) + 8))) + 12))) + 77))));
            this._storeInt((_34_ + 4), ((this._loadInt(((this._loadInt((_34_ + 24))) + 12))) + ((this._loadInt((_34_ + 20))) * 24)));
            sqlite3ValueFromExpr((sqlite3VdbeDb((this._loadInt((_34_ + 28))))), (this._loadInt(((_33_ = this._loadInt((_34_ + 4))) + 4))), (this._loadInt8u((_34_ + 11))), (this._loadInt8u((_33_ + 22))), (_34_ + 12));
            label$1:
            do {
                if ((this._loadInt((_34_ + 12))) == 0) {
                    break label$1;
                }
                sqlite3VdbeChangeP4((this._loadInt((_34_ + 28))), -1, (this._loadInt((_34_ + 12))), -8);
            }
            while (false);
            if ((this._loadInt((_34_ + 16))) < 0) {
                break label$0;
            }
            if ((this._loadInt8s((((this._loadInt(((this._loadInt((_34_ + 24))) + 12))) + ((this._loadInt((_34_ + 20))) * 24)) + 22))) != 101) {
                break label$0;
            }
            sqlite3VdbeAddOp1((this._loadInt((_34_ + 28))), 22, (this._loadInt((_34_ + 16))));
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final int sqlite3IndexAffinityStr(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._loadInt(((this._storeInt((_32_ + 20), _31_)) + 28))) != 0) {
                        break label$2;
                    }
                    this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt((_32_ + 20))) + 16))));
                    this._storeInt((_32_ + 8), (sqlite3VdbeDb((this._loadInt((_32_ + 24))))));
                    _31_ = sqlite3DbMallocRaw(0, ((this._loadInt(((this._loadInt((_32_ + 20))) + 4))) + 2));
                    if ((this._storeInt(((this._loadInt((_32_ + 20))) + 28), _31_)) == 0) {
                        break label$1;
                    }
                    this._storeInt((_32_ + 16), 0);
                    label$4:
                    do {
                        label$3:
                        while (true) {
                            if ((this._loadInt((_32_ + 16))) >= (this._loadInt(((this._loadInt((_32_ + 20))) + 4)))) {
                                break label$4;
                            }
                            this._storeInt8(((this._loadInt(((_31_ = this._loadInt((_32_ + 20))) + 28))) + (_30_ = this._loadInt((_32_ + 16)))), (this._loadInt8u((((this._loadInt(((this._loadInt((_32_ + 12))) + 12))) + ((this._loadInt(((this._loadInt((_31_ + 8))) + (_30_ << 2)))) * 24)) + 22))));
                            this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                            continue label$3;
                        }
                    }
                    while (false);
                    _30_ = this._storeInt((_32_ + 16), ((_31_ = this._loadInt((_32_ + 16))) + 1));
                    this._storeInt8((_31_ + (this._loadInt(((_33_ = this._loadInt((_32_ + 20))) + 28)))), 98);
                    this._storeInt8((_30_ + (this._loadInt((_33_ + 28)))), 0);
                }
                while (false);
                this._storeInt((_32_ + 28), (this._loadInt(((this._loadInt((_32_ + 20))) + 28))));
                break label$0;
            }
            while (false);
            this._storeInt8(((this._loadInt((_32_ + 8))) + 30), 1);
            this._storeInt((_32_ + 28), 0);
        }
        while (false);
        _31_ = this._loadInt((_32_ + 28));
        this._storeInt((0 + 4), (_32_ + 32));
        return _31_;
    }

    @Override()
    public final void sqlite3ReleaseTempRange(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        sqlite3ExprCacheRemove((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_);
        label$0:
        do {
            if ((this._loadInt((_33_ + 4))) <= (this._loadInt(((this._loadInt((_33_ + 12))) + 56)))) {
                break label$0;
            }
            this._storeInt(((_32_ = this._loadInt((_33_ + 12))) + 60), (this._loadInt((_33_ + 8))));
            this._storeInt((_32_ + 56), (this._loadInt((_33_ + 4))));
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final void sqlite3ExprCacheRemove(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 12), (((this._storeInt((_33_ + 20), _32_)) + (this._loadInt((_33_ + 24)))) + -1));
        _32_ = this._storeInt((_33_ + 16), 0);
        this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 28))) + 96));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_33_ + 16))) > 9) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._storeInt((_33_ + 4), (this._loadInt(((this._loadInt((_33_ + 8))) + 16))))) < (this._loadInt((_33_ + 24)))) {
                        break label$2;
                    }
                    if ((this._loadInt((_33_ + 4))) > (this._loadInt((_33_ + 12)))) {
                        break label$2;
                    }
                    cacheEntryClear((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 8))));
                    this._storeInt(((this._loadInt((_33_ + 8))) + 16), _32_);
                }
                while (false);
                this._storeInt((_33_ + 16), ((this._loadInt((_33_ + 16))) + 1));
                this._storeInt((_33_ + 8), ((this._loadInt((_33_ + 8))) + 24));
                continue label$0;
            }
        }
        while (false);
        this._storeInt((0 + 4), (_33_ + 32));
        return;
    }

    @Override()
    public final void cacheEntryClear(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        label$0:
        do {
            if ((this._loadInt8u(((this._storeInt((_32_ + 8), _31_)) + 8))) == 0) {
                break label$0;
            }
            label$1:
            do {
                if ((this._loadInt8u(((this._loadInt((_32_ + 12))) + 21))) > 7) {
                    break label$1;
                }
                _31_ = this._loadInt(((this._loadInt((_32_ + 8))) + 16));
                this._storeInt8(((_30_ = this._loadInt((_32_ + 12))) + 21), ((_30_ = this._loadInt8u((_30_ + 21))) + 1));
                this._storeInt((((this._loadInt((_32_ + 12))) + (_30_ << 2)) + 24), _31_);
            }
            while (false);
            this._storeInt8(((this._loadInt((_32_ + 8))) + 8), 0);
        }
        while (false);
        return;
    }

    @Override()
    public final int sqlite3VdbeDb(int _30_)
    {
        return (this._loadInt((this._storeInt((((this._loadInt((0 + 4))) - 16) + 12), _30_))));
    }

    @Override()
    public final int collationMatch(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 16), 0);
        label$0:
        do {
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt((_32_ + 16))) >= (this._loadInt(((this._loadInt((_32_ + 20))) + 4)))) {
                            break label$1;
                        }
                        if ((sqlite3StrICmp((this._storeInt((_32_ + 12), (this._loadInt(((this._loadInt(((this._loadInt((_32_ + 20))) + 44))) + ((this._loadInt((_32_ + 16))) << 2)))))), (this._loadInt((_32_ + 24))))) == 0) {
                            break label$3;
                        }
                        this._storeInt((_32_ + 16), ((this._loadInt((_32_ + 16))) + 1));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt((_32_ + 28), 1);
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
    public final void codeAttach(
            int _30_,
            int _31_,
            int _32_,
            int _33_,
            int _34_,
            int _35_,
            int _36_)
    {
        int _37_ = 0;
        this._storeInt(((_37_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 96))) + 92), _30_);
        this._storeInt((_37_ + 88), _31_);
        this._storeInt((_37_ + 84), _32_);
        this._storeInt((_37_ + 80), _33_);
        this._storeInt((_37_ + 76), _34_);
        this._storeInt((_37_ + 72), _35_);
        this._storeInt((_37_ + 68), _36_);
        this._storeInt((_37_ + 16), (this._loadInt((this._loadInt((_37_ + 92))))));
        memset((_37_ + 24), 0, 36);
        this._storeInt((_37_ + 24), (this._loadInt((_37_ + 92))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    if ((this._storeInt((_37_ + 64), (resolveAttachExpr((_37_ + 24), (this._loadInt((_37_ + 76))))))) != 0) {
                        break label$2;
                    }
                    if ((this._storeInt((_37_ + 64), (resolveAttachExpr((_37_ + 24), (this._loadInt((_37_ + 72))))))) != 0) {
                        break label$2;
                    }
                    if ((this._storeInt((_37_ + 64), (resolveAttachExpr((_37_ + 24), (this._loadInt((_37_ + 68))))))) == 0) {
                        break label$1;
                    }
                }
                while (false);
                this._storeInt(((_36_ = this._loadInt((_37_ + 92))) + 64), ((this._loadInt((_36_ + 64))) + 1));
                break label$0;
            }
            while (false);
            label$3:
            do {
                if ((this._loadInt((_37_ + 80))) == 0) {
                    break label$3;
                }
                label$4:
                do {
                    label$5:
                    do {
                        if ((this._loadInt8u((this._loadInt((_37_ + 80))))) != 94) {
                            break label$5;
                        }
                        this._storeInt((_37_ + 8), (this._loadInt(((this._loadInt((_37_ + 80))) + 4))));
                        break label$4;
                    }
                    while (false);
                    this._storeInt((_37_ + 8), 0);
                }
                while (false);
                if ((this._storeInt((_37_ + 64), (sqlite3AuthCheck((this._loadInt((_37_ + 92))), (this._loadInt((_37_ + 88))), (this._loadInt((_37_ + 8))), 0, 0)))) != 0) {
                    break label$0;
                }
            }
            while (false);
            this._storeInt((_37_ + 20), (sqlite3GetVdbe((this._loadInt((_37_ + 92))))));
            _36_ = this._storeInt((_37_ + 12), (sqlite3GetTempRange((this._loadInt((_37_ + 92))), 4)));
            sqlite3ExprCode((this._loadInt((_37_ + 92))), (this._loadInt((_37_ + 76))), _36_);
            sqlite3ExprCode((this._loadInt((_37_ + 92))), (this._loadInt((_37_ + 72))), ((this._loadInt((_37_ + 12))) + 1));
            sqlite3ExprCode((this._loadInt((_37_ + 92))), (this._loadInt((_37_ + 68))), ((this._loadInt((_37_ + 12))) + 2));
            if ((this._loadInt((_37_ + 20))) == 0) {
                break label$0;
            }
            sqlite3VdbeAddOp3((this._loadInt((_37_ + 20))), 18, 0, ((_36_ = (this._loadInt((_37_ + 12))) + 3) - (this._loadInt16s((this._loadInt((_37_ + 84)))))), _36_);
            sqlite3VdbeChangeP5((this._loadInt((_37_ + 20))), (this._loadInt8u((this._loadInt((_37_ + 84))))));
            sqlite3VdbeChangeP4((this._loadInt((_37_ + 20))), -1, (this._loadInt((_37_ + 84))), -5);
            sqlite3VdbeAddOp1((this._loadInt((_37_ + 20))), 122, (((this._loadInt((_37_ + 88))) == 24) ? 1 : 0));
        }
        while (false);
        sqlite3ExprDelete((this._loadInt((_37_ + 16))), (this._loadInt((_37_ + 76))));
        sqlite3ExprDelete((this._loadInt((_37_ + 16))), (this._loadInt((_37_ + 72))));
        sqlite3ExprDelete((this._loadInt((_37_ + 16))), (this._loadInt((_37_ + 68))));
        this._storeInt((0 + 4), (_37_ + 96));
        return;
    }

    @Override()
    public final int resolveAttachExpr(int _30_, int _31_)
    {
        int _32_ = 0;
        this._storeInt(((_32_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 24), _30_);
        this._storeInt((_32_ + 20), _31_);
        this._storeInt((_32_ + 16), 0);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_32_ + 20))) == 0) {
                    break label$1;
                }
                label$2:
                do {
                    if ((this._loadInt8u((this._loadInt((_32_ + 20))))) == 26) {
                        break label$2;
                    }
                    if ((this._storeInt((_32_ + 16), (sqlite3ResolveExprNames((this._loadInt((_32_ + 24))), (this._loadInt((_32_ + 20))))))) != 0) {
                        break label$1;
                    }
                    if ((sqlite3ExprIsConstant((this._loadInt((_32_ + 20))))) != 0) {
                        break label$1;
                    }
                    _31_ = this._loadInt((this._loadInt((_32_ + 24))));
                    this._storeInt(_32_, (this._loadInt(((this._loadInt((_32_ + 20))) + 4))));
                    sqlite3ErrorMsg(_31_, 41952, _32_);
                    this._storeInt((_32_ + 28), 1);
                    break label$0;
                }
                while (false);
                this._storeInt8((this._loadInt((_32_ + 20))), 94);
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
    public final int sqlite3ExprCode(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        label$0:
        do {
            label$1:
            do {
                if ((this._loadInt((_33_ + 8))) == 0) {
                    break label$1;
                }
                if ((this._loadInt8u((this._loadInt((_33_ + 8))))) != 132) {
                    break label$1;
                }
                sqlite3VdbeAddOp2((this._loadInt(((this._loadInt((_33_ + 12))) + 12))), 14, (this._loadInt(((this._loadInt((_33_ + 8))) + 24))), (this._loadInt((_33_ + 4))));
                break label$0;
            }
            while (false);
            if ((this._storeInt(_33_, (sqlite3ExprCodeTarget((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), (this._loadInt((_33_ + 4))))))) == (this._loadInt((_33_ + 4)))) {
                break label$0;
            }
            if ((this._loadInt(((this._loadInt((_33_ + 12))) + 12))) == 0) {
                break label$0;
            }
            sqlite3VdbeAddOp2((this._loadInt(((this._loadInt((_33_ + 12))) + 12))), 15, (this._loadInt(_33_)), (this._loadInt((_33_ + 4))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 4));
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }

    @Override()
    public final int sqlite3ExprCodeTarget(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        int _temp$0 = 0;
        int _temp$1 = 0;
        int _temp$2 = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 320))) + 312), _30_);
        this._storeInt((_33_ + 308), _31_);
        this._storeInt((_33_ + 304), _32_);
        this._storeInt((_33_ + 300), (this._loadInt(((this._loadInt((_33_ + 312))) + 12))));
        this._storeInt((_33_ + 292), (this._loadInt((_33_ + 304))));
        _32_ = this._storeInt((_33_ + 284), (this._storeInt((_33_ + 288), 0)));
        this._storeInt((_33_ + 264), (this._loadInt((this._loadInt((_33_ + 312))))));
        label$0:
        do {
            label$1:
            do {
                label$2:
                do {
                    label$3:
                    do {
                        if ((this._loadInt((_33_ + 300))) == 0) {
                            break label$3;
                        }
                        if ((this._loadInt((_33_ + 308))) == 0) {
                            break label$2;
                        }
                        this._storeInt((_33_ + 296), (this._loadInt8u((this._loadInt((_33_ + 308))))));
                        break label$1;
                    }
                    while (false);
                    this._storeInt((_33_ + 316), _32_);
                    break label$0;
                }
                while (false);
                this._storeInt((_33_ + 296), 98);
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
                                                                                                                                        label$35:
                                                                                                                                        do {
                                                                                                                                            label$36:
                                                                                                                                            do {
                                                                                                                                                label$37:
                                                                                                                                                do {
                                                                                                                                                    label$38:
                                                                                                                                                    do {
                                                                                                                                                        label$39:
                                                                                                                                                        do {
                                                                                                                                                            label$40:
                                                                                                                                                            do {
                                                                                                                                                                if (((_32_ = (this._loadInt((_33_ + 296))) + -19) & 4294967295L) > (138 & 4294967295L)) {
                                                                                                                                                                    break label$40;
                                                                                                                                                                }
                                                                                                                                                                label$41:
                                                                                                                                                                do {
                                                                                                                                                                    label$42:
                                                                                                                                                                    do {
                                                                                                                                                                        label$43:
                                                                                                                                                                        do {
                                                                                                                                                                            label$44:
                                                                                                                                                                            do {
                                                                                                                                                                                label$45:
                                                                                                                                                                                do {
                                                                                                                                                                                    label$46:
                                                                                                                                                                                    do {
                                                                                                                                                                                        label$47:
                                                                                                                                                                                        do {
                                                                                                                                                                                            switch (_32_) {
                                                                                                                                                                                                case 0:
                                                                                                                                                                                                case 74: {
                                                                                                                                                                                                    break label$45;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 1:
                                                                                                                                                                                                case 97: {
                                                                                                                                                                                                    break label$44;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 2:
                                                                                                                                                                                                case 3:
                                                                                                                                                                                                case 4:
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
                                                                                                                                                                                                case 38:
                                                                                                                                                                                                case 39:
                                                                                                                                                                                                case 40:
                                                                                                                                                                                                case 42:
                                                                                                                                                                                                case 43:
                                                                                                                                                                                                case 44:
                                                                                                                                                                                                case 45:
                                                                                                                                                                                                case 46:
                                                                                                                                                                                                case 47:
                                                                                                                                                                                                case 48:
                                                                                                                                                                                                case 62:
                                                                                                                                                                                                case 73:
                                                                                                                                                                                                case 76:
                                                                                                                                                                                                case 77:
                                                                                                                                                                                                case 78:
                                                                                                                                                                                                case 80:
                                                                                                                                                                                                case 81:
                                                                                                                                                                                                case 82:
                                                                                                                                                                                                case 83:
                                                                                                                                                                                                case 84:
                                                                                                                                                                                                case 85:
                                                                                                                                                                                                case 86:
                                                                                                                                                                                                case 87:
                                                                                                                                                                                                case 88:
                                                                                                                                                                                                case 89:
                                                                                                                                                                                                case 90:
                                                                                                                                                                                                case 91:
                                                                                                                                                                                                case 92:
                                                                                                                                                                                                case 93:
                                                                                                                                                                                                case 94:
                                                                                                                                                                                                case 95:
                                                                                                                                                                                                case 96:
                                                                                                                                                                                                case 98:
                                                                                                                                                                                                case 99:
                                                                                                                                                                                                case 100:
                                                                                                                                                                                                case 101:
                                                                                                                                                                                                case 102:
                                                                                                                                                                                                case 103:
                                                                                                                                                                                                case 104:
                                                                                                                                                                                                case 105:
                                                                                                                                                                                                case 106:
                                                                                                                                                                                                case 107:
                                                                                                                                                                                                case 108:
                                                                                                                                                                                                case 109:
                                                                                                                                                                                                case 115:
                                                                                                                                                                                                case 116:
                                                                                                                                                                                                case 117:
                                                                                                                                                                                                case 118:
                                                                                                                                                                                                case 119:
                                                                                                                                                                                                case 120:
                                                                                                                                                                                                case 121:
                                                                                                                                                                                                case 122:
                                                                                                                                                                                                case 123:
                                                                                                                                                                                                case 124:
                                                                                                                                                                                                case 125:
                                                                                                                                                                                                case 126:
                                                                                                                                                                                                case 128:
                                                                                                                                                                                                case 129:
                                                                                                                                                                                                case 130:
                                                                                                                                                                                                case 131: {
                                                                                                                                                                                                    break label$40;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 5: {
                                                                                                                                                                                                    break label$39;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 18: {
                                                                                                                                                                                                    break label$38;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 37: {
                                                                                                                                                                                                    break label$37;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 41: {
                                                                                                                                                                                                    break label$36;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 49:
                                                                                                                                                                                                case 50:
                                                                                                                                                                                                case 63:
                                                                                                                                                                                                case 64:
                                                                                                                                                                                                case 65:
                                                                                                                                                                                                case 66:
                                                                                                                                                                                                case 67:
                                                                                                                                                                                                case 68:
                                                                                                                                                                                                case 69:
                                                                                                                                                                                                case 70:
                                                                                                                                                                                                case 71:
                                                                                                                                                                                                case 72: {
                                                                                                                                                                                                    break label$47;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 51:
                                                                                                                                                                                                case 127: {
                                                                                                                                                                                                    break label$43;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 52: {
                                                                                                                                                                                                    break label$35;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 53: {
                                                                                                                                                                                                    break label$34;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 54:
                                                                                                                                                                                                case 55: {
                                                                                                                                                                                                    break label$42;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 56:
                                                                                                                                                                                                case 57:
                                                                                                                                                                                                case 58:
                                                                                                                                                                                                case 59:
                                                                                                                                                                                                case 60:
                                                                                                                                                                                                case 61: {
                                                                                                                                                                                                    break label$46;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 75: {
                                                                                                                                                                                                    break label$33;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 79: {
                                                                                                                                                                                                    break label$32;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 110: {
                                                                                                                                                                                                    break label$31;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 111: {
                                                                                                                                                                                                    break label$30;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 112: {
                                                                                                                                                                                                    break label$29;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 113: {
                                                                                                                                                                                                    break label$28;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 114: {
                                                                                                                                                                                                    break label$27;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 132:
                                                                                                                                                                                                case 136: {
                                                                                                                                                                                                    break label$41;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 133: {
                                                                                                                                                                                                    break label$24;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 134: {
                                                                                                                                                                                                    break label$26;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 135: {
                                                                                                                                                                                                    break label$25;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 137: {
                                                                                                                                                                                                    break label$23;
                                                                                                                                                                                                }
                                                                                                                                                                                                case 138: {
                                                                                                                                                                                                    break label$22;
                                                                                                                                                                                                }
                                                                                                                                                                                                default: {
                                                                                                                                                                                                    break label$45;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        while (false);
                                                                                                                                                                                        this._storeInt((_33_ + 280), (sqlite3ExprCodeTemp((this._loadInt((_33_ + 312))), (this._loadInt(((this._loadInt((_33_ + 308))) + 8))), (_33_ + 288))));
                                                                                                                                                                                        _32_ = this._storeInt((_33_ + 276), (sqlite3ExprCodeTemp((this._loadInt((_33_ + 312))), (this._loadInt(((this._loadInt((_33_ + 308))) + 12))), (_33_ + 284))));
                                                                                                                                                                                        sqlite3VdbeAddOp3((this._loadInt((_33_ + 300))), (this._loadInt((_33_ + 296))), _32_, (this._loadInt((_33_ + 280))), (this._loadInt((_33_ + 304))));
                                                                                                                                                                                        break label$4;
                                                                                                                                                                                    }
                                                                                                                                                                                    while (false);
                                                                                                                                                                                    this._storeInt((_33_ + 280), (sqlite3ExprCodeTemp((this._loadInt((_33_ + 312))), (this._loadInt(((this._loadInt((_33_ + 308))) + 8))), (_33_ + 288))));
                                                                                                                                                                                    _32_ = this._storeInt((_33_ + 276), (sqlite3ExprCodeTemp((this._loadInt((_33_ + 312))), (this._loadInt(((this._loadInt((_33_ + 308))) + 12))), (_33_ + 284))));
                                                                                                                                                                                    codeCompare((this._loadInt((_33_ + 312))), (this._loadInt(((_31_ = this._loadInt((_33_ + 308))) + 8))), (this._loadInt((_31_ + 12))), (this._loadInt((_33_ + 296))), (this._loadInt((_33_ + 280))), _32_, (this._loadInt((_33_ + 292))), 16);
                                                                                                                                                                                    break label$4;
                                                                                                                                                                                }
                                                                                                                                                                                while (false);
                                                                                                                                                                                this._storeInt((_33_ + 280), (sqlite3ExprCodeTemp((this._loadInt((_33_ + 312))), (this._loadInt(((this._loadInt((_33_ + 308))) + 8))), (_33_ + 288))));
                                                                                                                                                                                _32_ = this._storeInt((_33_ + 292), (this._loadInt((_33_ + 304))));
                                                                                                                                                                                sqlite3VdbeAddOp2((this._loadInt((_33_ + 300))), (this._loadInt((_33_ + 296))), (this._loadInt((_33_ + 280))), _32_);
                                                                                                                                                                                break label$4;
                                                                                                                                                                            }
                                                                                                                                                                            while (false);
                                                                                                                                                                            this._storeInt((_33_ + 292), (sqlite3CodeSubselect((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 308))), 0, 0)));
                                                                                                                                                                            break label$4;
                                                                                                                                                                        }
                                                                                                                                                                        while (false);
                                                                                                                                                                        this._storeInt((_33_ + 280), (sqlite3ExprCodeTemp((this._loadInt((_33_ + 312))), (this._loadInt(((this._loadInt((_33_ + 308))) + 8))), (_33_ + 288))));
                                                                                                                                                                        this._storeInt((_33_ + 276), (sqlite3ExprCodeTemp((this._loadInt((_33_ + 312))), (this._loadInt(((this._loadInt((_33_ + 308))) + 12))), (_33_ + 284))));
                                                                                                                                                                        _temp$0 = 76;
                                                                                                                                                                        _temp$1 = 75;
                                                                                                                                                                        _temp$2 = ((this._loadInt((_33_ + 296))) == 70) ? _temp$0 : _temp$1;
                                                                                                                                                                        _temp$2 = this._storeInt((_33_ + 296), _temp$2);
                                                                                                                                                                        _32_ = _temp$2;
                                                                                                                                                                        codeCompare((this._loadInt((_33_ + 312))), (this._loadInt(((_31_ = this._loadInt((_33_ + 308))) + 8))), (this._loadInt((_31_ + 12))), _32_, (this._loadInt((_33_ + 280))), (this._loadInt((_33_ + 276))), (this._loadInt((_33_ + 292))), 144);
                                                                                                                                                                        break label$4;
                                                                                                                                                                    }
                                                                                                                                                                    while (false);
                                                                                                                                                                    sqlite3VdbeAddOp2((this._loadInt((_33_ + 300))), 7, 1, (this._loadInt((_33_ + 304))));
                                                                                                                                                                    _32_ = this._storeInt((_33_ + 280), (sqlite3ExprCodeTemp((this._loadInt((_33_ + 312))), (this._loadInt(((this._loadInt((_33_ + 308))) + 8))), (_33_ + 288))));
                                                                                                                                                                    this._storeInt((_33_ + 228), (sqlite3VdbeAddOp1((this._loadInt((_33_ + 300))), (this._loadInt((_33_ + 296))), _32_)));
                                                                                                                                                                    sqlite3VdbeAddOp2((this._loadInt((_33_ + 300))), 20, (this._loadInt((_33_ + 304))), -1);
                                                                                                                                                                    sqlite3VdbeJumpHere((this._loadInt((_33_ + 300))), (this._loadInt((_33_ + 228))));
                                                                                                                                                                    break label$4;
                                                                                                                                                                }
                                                                                                                                                                while (false);
                                                                                                                                                                _32_ = this._storeInt((_33_ + 200), 0);
                                                                                                                                                                this._storeInt8((_33_ + 195), (this._loadInt8u(((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 264))) + 8))) + 12))) + 77))));
                                                                                                                                                                this._storeInt((_33_ + 188), _32_);
                                                                                                                                                                if (((this._loadInt16u(((this._loadInt((_33_ + 308))) + 2))) & 8192) == 0) {
                                                                                                                                                                    break label$21;
                                                                                                                                                                }
                                                                                                                                                                this._storeInt((_33_ + 220), _32_);
                                                                                                                                                                break label$20;
                                                                                                                                                            }
                                                                                                                                                            while (false);
                                                                                                                                                            _32_ = this._storeInt((_33_ + 24), 0);
                                                                                                                                                            this._storeInt((_33_ + 136), (this._loadInt(((this._loadInt((_33_ + 308))) + 16))));
                                                                                                                                                            this._storeInt((_33_ + 132), (this._loadInt(((this._loadInt((_33_ + 136))) + 12))));
                                                                                                                                                            this._storeInt((_33_ + 144), (this._loadInt((this._loadInt((_33_ + 136))))));
                                                                                                                                                            this._storeInt((_33_ + 152), (sqlite3VdbeMakeLabel((this._loadInt((_33_ + 300))))));
                                                                                                                                                            label$48:
                                                                                                                                                            do {
                                                                                                                                                                if ((this._storeInt((_33_ + 28), (this._loadInt(((this._loadInt((_33_ + 308))) + 8))))) == 0) {
                                                                                                                                                                    break label$48;
                                                                                                                                                                }
                                                                                                                                                                memcpy((_33_ + 32), (this._loadInt((_33_ + 28))), 48);
                                                                                                                                                                _31_ = sqlite3ExprCodeTemp((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 28))), (_33_ + 288));
                                                                                                                                                                this._storeInt8((_33_ + 32), 132);
                                                                                                                                                                this._storeInt8((_33_ + 80), 76);
                                                                                                                                                                this._storeInt((_33_ + 56), _31_);
                                                                                                                                                                this._storeInt((_33_ + 24), (_33_ + 80));
                                                                                                                                                                this._storeInt((_33_ + 288), _32_);
                                                                                                                                                                this._storeInt((_33_ + 88), (_33_ + 32));
                                                                                                                                                            }
                                                                                                                                                            while (false);
                                                                                                                                                            _31_ = this._storeInt((_33_ + 140), _32_);
                                                                                                                                                            label$49:
                                                                                                                                                            while (true) {
                                                                                                                                                                if ((this._loadInt((_33_ + 140))) >= (this._loadInt((_33_ + 144)))) {
                                                                                                                                                                    break label$19;
                                                                                                                                                                }
                                                                                                                                                                sqlite3ExprCachePush((this._loadInt((_33_ + 312))));
                                                                                                                                                                label$51:
                                                                                                                                                                do {
                                                                                                                                                                    label$52:
                                                                                                                                                                    do {
                                                                                                                                                                        if ((this._loadInt((_33_ + 28))) == 0) {
                                                                                                                                                                            break label$52;
                                                                                                                                                                        }
                                                                                                                                                                        this._storeInt((_33_ + 92), (this._loadInt(((this._loadInt((_33_ + 132))) + ((this._loadInt((_33_ + 140))) * 20)))));
                                                                                                                                                                        break label$51;
                                                                                                                                                                    }
                                                                                                                                                                    while (false);
                                                                                                                                                                    this._storeInt((_33_ + 24), (this._loadInt(((this._loadInt((_33_ + 132))) + ((this._loadInt((_33_ + 140))) * 20)))));
                                                                                                                                                                }
                                                                                                                                                                while (false);
                                                                                                                                                                _32_ = this._storeInt((_33_ + 148), (sqlite3VdbeMakeLabel((this._loadInt((_33_ + 300))))));
                                                                                                                                                                sqlite3ExprIfFalse((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 24))), _32_, 8);
                                                                                                                                                                sqlite3ExprCode((this._loadInt((_33_ + 312))), (this._loadInt((((this._loadInt((_33_ + 132))) + ((this._loadInt((_33_ + 140))) * 20)) + 20))), (this._loadInt((_33_ + 304))));
                                                                                                                                                                sqlite3VdbeAddOp2((this._loadInt((_33_ + 300))), 1, _31_, (this._loadInt((_33_ + 152))));
                                                                                                                                                                sqlite3ExprCachePop((this._loadInt((_33_ + 312))), 1);
                                                                                                                                                                sqlite3VdbeResolveLabel((this._loadInt((_33_ + 300))), (this._loadInt((_33_ + 148))));
                                                                                                                                                                this._storeInt((_33_ + 140), ((this._loadInt((_33_ + 140))) + 2));
                                                                                                                                                                continue label$49;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        while (false);
                                                                                                                                                        this._storeInt((_33_ + 292), (sqlite3ExprCodeTarget((this._loadInt((_33_ + 312))), (this._loadInt(((this._loadInt((_33_ + 308))) + 8))), (this._loadInt((_33_ + 304))))));
                                                                                                                                                        break label$4;
                                                                                                                                                    }
                                                                                                                                                    while (false);
                                                                                                                                                    this._storeInt((_33_ + 292), (sqlite3ExprCodeTarget((this._loadInt((_33_ + 312))), (this._loadInt(((this._loadInt((_33_ + 308))) + 8))), (this._loadInt((_33_ + 304))))));
                                                                                                                                                    this._storeInt((_33_ + 236), ((this._storeInt((_33_ + 240), (sqlite3AffinityType((this._loadInt(((this._loadInt((_33_ + 308))) + 4))))))) + 44));
                                                                                                                                                    label$53:
                                                                                                                                                    do {
                                                                                                                                                        if ((this._loadInt((_33_ + 292))) == (this._loadInt((_33_ + 304)))) {
                                                                                                                                                            break label$53;
                                                                                                                                                        }
                                                                                                                                                        sqlite3VdbeAddOp2((this._loadInt((_33_ + 300))), 15, (this._loadInt((_33_ + 292))), (this._loadInt((_33_ + 304))));
                                                                                                                                                        this._storeInt((_33_ + 292), (this._loadInt((_33_ + 304))));
                                                                                                                                                    }
                                                                                                                                                    while (false);
                                                                                                                                                    sqlite3VdbeAddOp1((this._loadInt((_33_ + 300))), (this._loadInt((_33_ + 236))), (this._loadInt((_33_ + 292))));
                                                                                                                                                    sqlite3ExprCacheAffinityChange((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 292))), 1);
                                                                                                                                                    break label$4;
                                                                                                                                                }
                                                                                                                                                while (false);
                                                                                                                                                if ((this._loadInt(((this._loadInt((_33_ + 312))) + 428))) == 0) {
                                                                                                                                                    break label$14;
                                                                                                                                                }
                                                                                                                                                label$54:
                                                                                                                                                do {
                                                                                                                                                    if ((this._loadInt8s(((this._loadInt((_33_ + 308))) + 1))) != 2) {
                                                                                                                                                        break label$54;
                                                                                                                                                    }
                                                                                                                                                    sqlite3MayAbort((this._loadInt((_33_ + 312))));
                                                                                                                                                }
                                                                                                                                                while (false);
                                                                                                                                                if ((this._loadInt8s(((this._loadInt((_33_ + 308))) + 1))) != 4) {
                                                                                                                                                    break label$9;
                                                                                                                                                }
                                                                                                                                                sqlite3VdbeAddOp4((this._loadInt((_33_ + 300))), 6, 0, 4, 0, (this._loadInt(((this._loadInt((_33_ + 308))) + 4))), 0);
                                                                                                                                                break label$4;
                                                                                                                                            }
                                                                                                                                            while (false);
                                                                                                                                            _32_ = this._storeInt((_33_ + 160), (this._loadInt(((this._loadInt((_33_ + 308))) + 40))));
                                                                                                                                            _32_ = this._storeInt((_33_ + 156), ((((this._loadInt(((_31_ = this._loadInt((_33_ + 308))) + 24))) * ((this._loadInt((_32_ + 8))) + 1)) + (this._loadInt16s((_31_ + 28)))) + 1));
                                                                                                                                            sqlite3VdbeAddOp2((this._loadInt((_33_ + 300))), 109, _32_, (this._loadInt((_33_ + 304))));
                                                                                                                                            if ((this._loadInt16s(((this._loadInt((_33_ + 308))) + 28))) < 0) {
                                                                                                                                                break label$4;
                                                                                                                                            }
                                                                                                                                            if ((this._loadInt8s((((this._loadInt(((this._loadInt((_33_ + 160))) + 12))) + ((this._loadInt16s(((this._loadInt((_33_ + 308))) + 28))) * 24)) + 22))) != 101) {
                                                                                                                                                break label$4;
                                                                                                                                            }
                                                                                                                                            sqlite3VdbeAddOp1((this._loadInt((_33_ + 300))), 22, (this._loadInt((_33_ + 304))));
                                                                                                                                            break label$4;
                                                                                                                                        }
                                                                                                                                        while (false);
                                                                                                                                        this._storeInt((_33_ + 172), (this._loadInt(((this._loadInt((_33_ + 308))) + 8))));
                                                                                                                                        this._storeInt((_33_ + 168), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 308))) + 16))) + 12))));
                                                                                                                                        this._storeInt((_33_ + 164), (this._loadInt((this._loadInt((_33_ + 168))))));
                                                                                                                                        this._storeInt((_33_ + 280), (sqlite3ExprCodeTemp((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 172))), (_33_ + 288))));
                                                                                                                                        this._storeInt((_33_ + 276), (sqlite3ExprCodeTemp((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 164))), (_33_ + 284))));
                                                                                                                                        this._storeInt((_33_ + 272), (sqlite3GetTempReg((this._loadInt((_33_ + 312))))));
                                                                                                                                        this._storeInt((_33_ + 268), (sqlite3GetTempReg((this._loadInt((_33_ + 312))))));
                                                                                                                                        codeCompare((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 172))), (this._loadInt((_33_ + 164))), 80, (this._loadInt((_33_ + 280))), (this._loadInt((_33_ + 276))), (this._loadInt((_33_ + 272))), 16);
                                                                                                                                        this._storeInt((_33_ + 168), ((_32_ = this._loadInt((_33_ + 168))) + 20));
                                                                                                                                        this._storeInt((_33_ + 164), (this._loadInt((_32_ + 20))));
                                                                                                                                        sqlite3ReleaseTempReg((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 284))));
                                                                                                                                        _32_ = this._storeInt((_33_ + 276), (sqlite3ExprCodeTemp((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 164))), (_33_ + 284))));
                                                                                                                                        codeCompare((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 172))), (this._loadInt((_33_ + 164))), 78, (this._loadInt((_33_ + 280))), _32_, (this._loadInt((_33_ + 268))), 16);
                                                                                                                                        sqlite3VdbeAddOp3((this._loadInt((_33_ + 300))), 69, (this._loadInt((_33_ + 272))), (this._loadInt((_33_ + 268))), (this._loadInt((_33_ + 304))));
                                                                                                                                        sqlite3ReleaseTempReg((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 272))));
                                                                                                                                        sqlite3ReleaseTempReg((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 268))));
                                                                                                                                        break label$4;
                                                                                                                                    }
                                                                                                                                    while (false);
                                                                                                                                    this._storeInt((_33_ + 180), (sqlite3VdbeMakeLabel((this._loadInt((_33_ + 300))))));
                                                                                                                                    this._storeInt((_33_ + 176), (sqlite3VdbeMakeLabel((this._loadInt((_33_ + 300))))));
                                                                                                                                    sqlite3VdbeAddOp2((this._loadInt((_33_ + 300))), 10, 0, (this._loadInt((_33_ + 304))));
                                                                                                                                    sqlite3ExprCodeIN((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 308))), (this._loadInt((_33_ + 180))), (this._loadInt((_33_ + 176))));
                                                                                                                                    sqlite3VdbeAddOp2((this._loadInt((_33_ + 300))), 7, 1, (this._loadInt((_33_ + 304))));
                                                                                                                                    sqlite3VdbeResolveLabel((this._loadInt((_33_ + 300))), (this._loadInt((_33_ + 180))));
                                                                                                                                    sqlite3VdbeAddOp2((this._loadInt((_33_ + 300))), 20, (this._loadInt((_33_ + 304))), 0);
                                                                                                                                    sqlite3VdbeResolveLabel((this._loadInt((_33_ + 300))), (this._loadInt((_33_ + 176))));
                                                                                                                                    break label$4;
                                                                                                                                }
                                                                                                                                while (false);
                                                                                                                                sqlite3VdbeAddOp4((this._loadInt((_33_ + 300))), 94, 0, (this._loadInt((_33_ + 304))), 0, (this._loadInt(((this._loadInt((_33_ + 308))) + 4))), 0);
                                                                                                                                break label$4;
                                                                                                                            }
                                                                                                                            while (false);
                                                                                                                            sqlite3VdbeAddOp2((this._loadInt((_33_ + 300))), 10, 0, (this._loadInt((_33_ + 304))));
                                                                                                                            break label$4;
                                                                                                                        }
                                                                                                                        while (false);
                                                                                                                        codeInteger((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 308))), 0, (this._loadInt((_33_ + 304))));
                                                                                                                        break label$4;
                                                                                                                    }
                                                                                                                    while (false);
                                                                                                                    codeReal((this._loadInt((_33_ + 300))), (this._loadInt(((this._loadInt((_33_ + 308))) + 4))), 0, (this._loadInt((_33_ + 304))));
                                                                                                                    break label$4;
                                                                                                                }
                                                                                                                while (false);
                                                                                                                this._storeInt((_33_ + 252), ((sqlite3Strlen30((this._storeInt((_33_ + 248), ((this._loadInt(((this._loadInt((_33_ + 308))) + 4))) + 2))))) + -1));
                                                                                                                _32_ = this._storeInt((_33_ + 244), (sqlite3HexToBlob((sqlite3VdbeDb((this._loadInt((_33_ + 300))))), (this._loadInt((_33_ + 248))), (this._loadInt((_33_ + 252))))));
                                                                                                                sqlite3VdbeAddOp4((this._loadInt((_33_ + 300))), 11, ((this._loadInt((_33_ + 252))) / 2), (this._loadInt((_33_ + 304))), 0, _32_, -1);
                                                                                                                break label$4;
                                                                                                            }
                                                                                                            while (false);
                                                                                                            this._storeInt((_33_ + 292), (this._loadInt(((this._loadInt((_33_ + 308))) + 24))));
                                                                                                            break label$4;
                                                                                                        }
                                                                                                        while (false);
                                                                                                        sqlite3VdbeAddOp2((this._loadInt((_33_ + 300))), 12, (this._loadInt16s(((this._loadInt((_33_ + 308))) + 28))), (this._loadInt((_33_ + 304))));
                                                                                                        if ((this._loadInt8s(((this._loadInt(((this._loadInt((_33_ + 308))) + 4))) + 1))) == 0) {
                                                                                                            break label$4;
                                                                                                        }
                                                                                                        sqlite3VdbeChangeP4((this._loadInt((_33_ + 300))), -1, (this._loadInt((((this._loadInt(((this._loadInt((_33_ + 312))) + 464))) + ((this._loadInt16s(((this._loadInt((_33_ + 308))) + 28))) << 2)) + -4))), -2);
                                                                                                        break label$4;
                                                                                                    }
                                                                                                    while (false);
                                                                                                    if ((this._storeInt((_33_ + 224), (this._loadInt(((this._loadInt((_33_ + 308))) + 36))))) == 0) {
                                                                                                        break label$13;
                                                                                                    }
                                                                                                    this._storeInt((_33_ + 292), (this._loadInt((((this._loadInt(((this._loadInt((_33_ + 224))) + 32))) + ((this._loadInt16s(((this._loadInt((_33_ + 308))) + 30))) << 4)) + 8))));
                                                                                                    break label$4;
                                                                                                }
                                                                                                while (false);
                                                                                                this._storeInt((_33_ + 256), ((this._loadInt(((this._storeInt((_33_ + 260), (this._loadInt(((this._loadInt((_33_ + 308))) + 36))))) + 16))) + ((this._loadInt16s(((this._loadInt((_33_ + 308))) + 30))) * 24)));
                                                                                                if ((this._loadInt8u((this._loadInt((_33_ + 260))))) == 0) {
                                                                                                    break label$12;
                                                                                                }
                                                                                                if ((this._loadInt8u(((this._loadInt((_33_ + 260))) + 1))) == 0) {
                                                                                                    break label$24;
                                                                                                }
                                                                                                sqlite3VdbeAddOp3((this._loadInt((_33_ + 300))), 28, (this._loadInt(((this._loadInt((_33_ + 260))) + 4))), (this._loadInt(((this._loadInt((_33_ + 256))) + 12))), (this._loadInt((_33_ + 304))));
                                                                                                break label$4;
                                                                                            }
                                                                                            while (false);
                                                                                            if ((this._loadInt(((this._loadInt((_33_ + 308))) + 24))) <= -1) {
                                                                                                break label$15;
                                                                                            }
                                                                                            this._storeInt((_33_ + 292), (sqlite3ExprCodeGetColumn((this._loadInt((_33_ + 312))), (this._loadInt(((_32_ = this._loadInt((_33_ + 308))) + 40))), (this._loadInt16s((_32_ + 28))), (this._loadInt((_32_ + 24))), (this._loadInt((_33_ + 304))))));
                                                                                            break label$4;
                                                                                        }
                                                                                        while (false);
                                                                                        if ((this._loadInt8u((this._storeInt((_33_ + 232), (this._loadInt(((this._loadInt((_33_ + 308))) + 8))))))) != 129) {
                                                                                            break label$16;
                                                                                        }
                                                                                        codeInteger((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 232))), 1, (this._loadInt((_33_ + 304))));
                                                                                        break label$7;
                                                                                    }
                                                                                    while (false);
                                                                                    this._storeInt((_33_ + 292), (sqlite3ExprCodeTarget((this._loadInt((_33_ + 312))), (this._loadInt(((this._loadInt((_33_ + 308))) + 8))), (this._loadInt((_33_ + 304))))));
                                                                                    break label$4;
                                                                                }
                                                                                while (false);
                                                                                this._storeInt((_33_ + 220), (this._loadInt(((this._loadInt((_33_ + 308))) + 16))));
                                                                            }
                                                                            while (false);
                                                                            _32_ = 0;
                                                                            label$55:
                                                                            do {
                                                                                if ((this._loadInt((_33_ + 220))) == 0) {
                                                                                    break label$55;
                                                                                }
                                                                                _32_ = this._loadInt((this._loadInt((_33_ + 220))));
                                                                            }
                                                                            while (false);
                                                                            this._storeInt((_33_ + 216), _32_);
                                                                            _32_ = this._storeInt((_33_ + 208), (sqlite3Strlen30((this._storeInt((_33_ + 204), (this._loadInt(((this._loadInt((_33_ + 308))) + 4))))))));
                                                                            if ((this._storeInt((_33_ + 212), (sqlite3FindFunction((this._loadInt((_33_ + 264))), (this._loadInt((_33_ + 204))), _32_, (this._loadInt((_33_ + 216))), (this._loadInt8u((_33_ + 195))), 0)))) == 0) {
                                                                                break label$18;
                                                                            }
                                                                            if (((this._loadInt8u(((this._loadInt((_33_ + 212))) + 3))) & 64) == 0) {
                                                                                break label$17;
                                                                            }
                                                                            this._storeInt((_33_ + 184), (sqlite3VdbeMakeLabel((this._loadInt((_33_ + 300))))));
                                                                            sqlite3ExprCode((this._loadInt((_33_ + 312))), (this._loadInt((this._loadInt(((this._loadInt((_33_ + 220))) + 12))))), (this._loadInt((_33_ + 304))));
                                                                            _32_ = this._storeInt((_33_ + 196), 1);
                                                                            label$57:
                                                                            do {
                                                                                label$56:
                                                                                while (true) {
                                                                                    if ((this._loadInt((_33_ + 196))) >= (this._loadInt((_33_ + 216)))) {
                                                                                        break label$57;
                                                                                    }
                                                                                    sqlite3VdbeAddOp2((this._loadInt((_33_ + 300))), 74, (this._loadInt((_33_ + 304))), (this._loadInt((_33_ + 184))));
                                                                                    sqlite3ExprCacheRemove((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 304))), _32_);
                                                                                    sqlite3ExprCachePush((this._loadInt((_33_ + 312))));
                                                                                    sqlite3ExprCode((this._loadInt((_33_ + 312))), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 220))) + 12))) + ((this._loadInt((_33_ + 196))) * 20)))), (this._loadInt((_33_ + 304))));
                                                                                    sqlite3ExprCachePop((this._loadInt((_33_ + 312))), _32_);
                                                                                    this._storeInt((_33_ + 196), ((this._loadInt((_33_ + 196))) + _32_));
                                                                                    continue label$56;
                                                                                }
                                                                            }
                                                                            while (false);
                                                                            sqlite3VdbeResolveLabel((this._loadInt((_33_ + 300))), (this._loadInt((_33_ + 184))));
                                                                            break label$4;
                                                                        }
                                                                        while (false);
                                                                        if ((this._loadInt(((this._loadInt((_33_ + 308))) + 12))) == 0) {
                                                                            break label$11;
                                                                        }
                                                                        sqlite3ExprCachePush((this._loadInt((_33_ + 312))));
                                                                        sqlite3ExprCode((this._loadInt((_33_ + 312))), (this._loadInt(((this._loadInt((_33_ + 308))) + 12))), (this._loadInt((_33_ + 304))));
                                                                        sqlite3ExprCachePop((this._loadInt((_33_ + 312))), 1);
                                                                        break label$10;
                                                                    }
                                                                    while (false);
                                                                    this._storeInt((_33_ + 20), (this._loadInt((_33_ + 204))));
                                                                    _32_ = this._loadInt((_33_ + 312));
                                                                    this._storeInt((_33_ + 16), (this._loadInt((_33_ + 208))));
                                                                    sqlite3ErrorMsg(_32_, 41776, (_33_ + 16));
                                                                    break label$4;
                                                                }
                                                                while (false);
                                                                if ((this._loadInt((_33_ + 220))) == 0) {
                                                                    break label$6;
                                                                }
                                                                this._storeInt((_33_ + 280), (sqlite3GetTempRange((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 216))))));
                                                                sqlite3ExprCachePush((this._loadInt((_33_ + 312))));
                                                                sqlite3ExprCodeExprList((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 220))), (this._loadInt((_33_ + 280))), 1);
                                                                sqlite3ExprCachePop((this._loadInt((_33_ + 312))), 1);
                                                                break label$5;
                                                            }
                                                            while (false);
                                                            if ((this._loadInt8u((this._loadInt((_33_ + 232))))) != 130) {
                                                                break label$8;
                                                            }
                                                            codeReal((this._loadInt((_33_ + 300))), (this._loadInt(((this._loadInt((_33_ + 232))) + 4))), 1, (this._loadInt((_33_ + 304))));
                                                            break label$7;
                                                        }
                                                        while (false);
                                                        this._storeInt((_33_ + 292), ((this._loadInt16s(((this._loadInt((_33_ + 308))) + 28))) + (this._loadInt(((this._loadInt((_33_ + 312))) + 80)))));
                                                        break label$4;
                                                    }
                                                    while (false);
                                                    sqlite3ErrorMsg((this._loadInt((_33_ + 312))), 41808, 0);
                                                    this._storeInt((_33_ + 316), 0);
                                                    break label$0;
                                                }
                                                while (false);
                                                _32_ = this._loadInt((_33_ + 312));
                                                this._storeInt(_33_, (this._loadInt(((this._loadInt((_33_ + 308))) + 4))));
                                                sqlite3ErrorMsg(_32_, 41744, _33_);
                                                break label$4;
                                            }
                                            while (false);
                                            this._storeInt((_33_ + 292), (this._loadInt(((this._loadInt((_33_ + 256))) + 16))));
                                            break label$4;
                                        }
                                        while (false);
                                        sqlite3VdbeAddOp2((this._loadInt((_33_ + 300))), 10, 0, (this._loadInt((_33_ + 304))));
                                    }
                                    while (false);
                                    sqlite3VdbeResolveLabel((this._loadInt((_33_ + 300))), (this._loadInt((_33_ + 152))));
                                    break label$4;
                                }
                                while (false);
                                sqlite3HaltConstraint((this._loadInt((_33_ + 312))), (this._loadInt8s(((_32_ = this._loadInt((_33_ + 308))) + 1))), (this._loadInt((_32_ + 4))), 0);
                                break label$4;
                            }
                            while (false);
                            this._storeInt((_33_ + 288), (this._storeInt((_33_ + 280), (sqlite3GetTempReg((this._loadInt((_33_ + 312))))))));
                            sqlite3VdbeAddOp2((this._loadInt((_33_ + 300))), 7, 0, (this._loadInt((_33_ + 280))));
                            _32_ = this._storeInt((_33_ + 276), (sqlite3ExprCodeTemp((this._loadInt((_33_ + 312))), (this._loadInt(((this._loadInt((_33_ + 308))) + 8))), (_33_ + 284))));
                            sqlite3VdbeAddOp3((this._loadInt((_33_ + 300))), 87, _32_, (this._loadInt((_33_ + 280))), (this._loadInt((_33_ + 304))));
                        }
                        while (false);
                        this._storeInt((_33_ + 292), (this._loadInt((_33_ + 304))));
                        break label$4;
                    }
                    while (false);
                    this._storeInt((_33_ + 280), 0);
                }
                while (false);
                label$58:
                do {
                    label$59:
                    do {
                        if ((this._loadInt((_33_ + 216))) < 2) {
                            break label$59;
                        }
                        if (((this._loadInt16u(((this._loadInt((_33_ + 308))) + 2))) & 128) == 0) {
                            break label$59;
                        }
                        this._storeInt((_33_ + 212), (sqlite3VtabOverloadFunction((this._loadInt((_33_ + 264))), (this._loadInt((_33_ + 212))), (this._loadInt((_33_ + 216))), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 220))) + 12))) + 20))))));
                        break label$58;
                    }
                    while (false);
                    if ((this._loadInt((_33_ + 216))) < 1) {
                        break label$58;
                    }
                    this._storeInt((_33_ + 212), (sqlite3VtabOverloadFunction((this._loadInt((_33_ + 264))), (this._loadInt((_33_ + 212))), (this._loadInt((_33_ + 216))), (this._loadInt((this._loadInt(((this._loadInt((_33_ + 220))) + 12))))))));
                }
                while (false);
                this._storeInt((_33_ + 196), 0);
                label$61:
                do {
                    label$60:
                    while (true) {
                        if ((this._loadInt((_33_ + 196))) >= (this._loadInt((_33_ + 216)))) {
                            break label$61;
                        }
                        label$62:
                        do {
                            if ((this._loadInt((_33_ + 196))) > 31) {
                                break label$62;
                            }
                            if ((sqlite3ExprIsConstant((this._loadInt(((this._loadInt(((this._loadInt((_33_ + 220))) + 12))) + ((this._loadInt((_33_ + 196))) * 20)))))) == 0) {
                                break label$62;
                            }
                            this._storeInt((_33_ + 200), ((this._loadInt((_33_ + 200))) | (1 << (this._loadInt((_33_ + 196))))));
                        }
                        while (false);
                        label$63:
                        do {
                            if (((this._loadInt8u(((this._loadInt((_33_ + 212))) + 3))) & 8) == 0) {
                                break label$63;
                            }
                            if ((this._loadInt((_33_ + 188))) != 0) {
                                break label$63;
                            }
                            this._storeInt((_33_ + 188), (sqlite3ExprCollSeq((this._loadInt((_33_ + 312))), (this._loadInt(((this._loadInt(((this._loadInt((_33_ + 220))) + 12))) + ((this._loadInt((_33_ + 196))) * 20)))))));
                        }
                        while (false);
                        this._storeInt((_33_ + 196), ((this._loadInt((_33_ + 196))) + 1));
                        continue label$60;
                    }
                }
                while (false);
                label$64:
                do {
                    if (((this._loadInt8u(((this._loadInt((_33_ + 212))) + 3))) & 8) == 0) {
                        break label$64;
                    }
                    label$65:
                    do {
                        if ((this._loadInt((_33_ + 188))) != 0) {
                            break label$65;
                        }
                        this._storeInt((_33_ + 188), (this._loadInt(((this._loadInt((_33_ + 264))) + 44))));
                    }
                    while (false);
                    sqlite3VdbeAddOp4((this._loadInt((_33_ + 300))), 17, 0, 0, 0, (this._loadInt((_33_ + 188))), -4);
                }
                while (false);
                sqlite3VdbeAddOp4((this._loadInt((_33_ + 300))), 18, (this._loadInt((_33_ + 200))), (this._loadInt((_33_ + 280))), (this._loadInt((_33_ + 304))), (this._loadInt((_33_ + 212))), -5);
                sqlite3VdbeChangeP5((this._loadInt((_33_ + 300))), (this._loadInt8u((_33_ + 216))));
                if ((this._loadInt((_33_ + 216))) == 0) {
                    break label$4;
                }
                sqlite3ReleaseTempRange((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 280))), (this._loadInt((_33_ + 216))));
            }
            while (false);
            sqlite3ReleaseTempReg((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 288))));
            sqlite3ReleaseTempReg((this._loadInt((_33_ + 312))), (this._loadInt((_33_ + 284))));
            this._storeInt((_33_ + 316), (this._loadInt((_33_ + 292))));
        }
        while (false);
        _32_ = this._loadInt((_33_ + 316));
        this._storeInt((0 + 4), (_33_ + 320));
        return _32_;
    }

    @Override()
    public final int sqlite3ExprCodeGetColumn(int _30_, int _31_, int _32_, int _33_, int _34_)
    {
        int _35_ = 0;
        this._storeInt(((_35_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 40), _30_);
        this._storeInt((_35_ + 36), _31_);
        this._storeInt((_35_ + 32), _32_);
        this._storeInt((_35_ + 28), _33_);
        this._storeInt((_35_ + 24), _34_);
        this._storeInt((_35_ + 20), (this._loadInt(((this._loadInt((_35_ + 40))) + 12))));
        this._storeInt((_35_ + 16), 0);
        this._storeInt((_35_ + 12), ((this._loadInt((_35_ + 40))) + 96));
        label$0:
        do {
            label$1:
            do {
                label$3:
                do {
                    label$2:
                    while (true) {
                        if ((this._loadInt((_35_ + 16))) > 9) {
                            break label$1;
                        }
                        label$4:
                        do {
                            if ((this._loadInt(((this._loadInt((_35_ + 12))) + 16))) < 1) {
                                break label$4;
                            }
                            if ((this._loadInt((this._loadInt((_35_ + 12))))) != (this._loadInt((_35_ + 28)))) {
                                break label$4;
                            }
                            if ((this._loadInt(((this._loadInt((_35_ + 12))) + 4))) == (this._loadInt((_35_ + 32)))) {
                                break label$3;
                            }
                        }
                        while (false);
                        this._storeInt((_35_ + 16), ((this._loadInt((_35_ + 16))) + 1));
                        this._storeInt((_35_ + 12), ((this._loadInt((_35_ + 12))) + 24));
                        continue label$2;
                    }
                }
                while (false);
                this._storeInt(((_34_ = this._loadInt((_35_ + 40))) + 88), ((_33_ = this._loadInt((_34_ + 88))) + 1));
                this._storeInt(((_32_ = this._loadInt((_35_ + 12))) + 20), _33_);
                sqlite3ExprCachePinRegister(_34_, (this._loadInt((_32_ + 16))));
                this._storeInt((_35_ + 44), (this._loadInt(((this._loadInt((_35_ + 12))) + 16))));
                break label$0;
            }
            while (false);
            sqlite3ExprCodeGetColumnOfTable((this._loadInt((_35_ + 20))), (this._loadInt((_35_ + 36))), (this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 32))), (this._loadInt((_35_ + 24))));
            sqlite3ExprCacheStore((this._loadInt((_35_ + 40))), (this._loadInt((_35_ + 28))), (this._loadInt((_35_ + 32))), (this._loadInt((_35_ + 24))));
            this._storeInt((_35_ + 44), (this._loadInt((_35_ + 24))));
        }
        while (false);
        _34_ = this._loadInt((_35_ + 44));
        this._storeInt((0 + 4), (_35_ + 48));
        return _34_;
    }

    @Override()
    public final void codeInteger(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        long _35_ = 0L;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_34_ + 40), _31_);
        this._storeInt((_34_ + 36), _32_);
        this._storeInt((_34_ + 32), _33_);
        this._storeInt((_34_ + 28), (this._loadInt(((this._loadInt((_34_ + 44))) + 12))));
        label$0:
        do {
            label$1:
            do {
                if (((this._loadInt16u(((this._loadInt((_34_ + 40))) + 2))) & 1024) == 0) {
                    break label$1;
                }
                this._storeInt((_34_ + 24), (this._loadInt(((this._loadInt((_34_ + 40))) + 4))));
                label$2:
                do {
                    if ((this._loadInt((_34_ + 36))) == 0) {
                        break label$2;
                    }
                    this._storeInt((_34_ + 24), (0 - (this._loadInt((_34_ + 24)))));
                }
                while (false);
                sqlite3VdbeAddOp2((this._loadInt((_34_ + 28))), 7, (this._loadInt((_34_ + 24))), (this._loadInt((_34_ + 32))));
                break label$0;
            }
            while (false);
            label$3:
            do {
                label$4:
                do {
                    if ((this._storeInt((_34_ + 20), (sqlite3Atoi64((_33_ = this._storeInt((_34_ + 4), (this._loadInt(((this._loadInt((_34_ + 40))) + 4))))), (_34_ + 8), (sqlite3Strlen30(_33_)), 1)))) == 0) {
                        break label$4;
                    }
                    if ((this._loadInt((_34_ + 20))) != 2) {
                        break label$3;
                    }
                    if ((this._loadInt((_34_ + 36))) == 0) {
                        break label$3;
                    }
                }
                while (false);
                label$5:
                do {
                    if ((this._loadInt((_34_ + 36))) == 0) {
                        break label$5;
                    }
                    _35_ = -9223372036854775808L;
                    label$6:
                    do {
                        if ((this._loadInt((_34_ + 20))) == 2) {
                            break label$6;
                        }
                        _35_ = 0L - (this._loadLong((_34_ + 8)));
                    }
                    while (false);
                    this._storeLong((_34_ + 8), _35_);
                }
                while (false);
                _33_ = this._storeInt(_34_, (dup8bytes((this._loadInt((_34_ + 28))), (_34_ + 8))));
                sqlite3VdbeAddOp4((this._loadInt((_34_ + 28))), 8, 0, (this._loadInt((_34_ + 32))), 0, _33_, -13);
                break label$0;
            }
            while (false);
            codeReal((this._loadInt((_34_ + 28))), (this._loadInt((_34_ + 4))), (this._loadInt((_34_ + 36))), (this._loadInt((_34_ + 32))));
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 48));
        return;
    }

    @Override()
    public final void codeReal(int _30_, int _31_, int _32_, int _33_)
    {
        int _34_ = 0;
        this._storeInt(((_34_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_34_ + 24), _31_);
        this._storeInt((_34_ + 20), _32_);
        this._storeInt((_34_ + 16), _33_);
        label$0:
        do {
            if ((this._loadInt((_34_ + 24))) == 0) {
                break label$0;
            }
            sqlite3AtoF((_33_ = this._loadInt((_34_ + 24))), (_34_ + 8), (sqlite3Strlen30(_33_)), 1);
            label$1:
            do {
                if ((this._loadInt((_34_ + 20))) == 0) {
                    break label$1;
                }
                this._storeDouble((_34_ + 8), (-(this._loadDouble((_34_ + 8)))));
            }
            while (false);
            _33_ = this._storeInt((_34_ + 4), (dup8bytes((this._loadInt((_34_ + 28))), (_34_ + 8))));
            sqlite3VdbeAddOp4((this._loadInt((_34_ + 28))), 130, 0, (this._loadInt((_34_ + 16))), 0, _33_, -12);
        }
        while (false);
        this._storeInt((0 + 4), (_34_ + 32));
        return;
    }

    @Override()
    public final void sqlite3ExprCacheAffinityChange(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), _30_);
        this._storeInt((_33_ + 8), _31_);
        this._storeInt((_33_ + 4), _32_);
        sqlite3ExprCacheRemove((this._loadInt((_33_ + 12))), (this._loadInt((_33_ + 8))), _32_);
        this._storeInt((0 + 4), (_33_ + 16));
        return;
    }

    @Override()
    public final int sqlite3ExprCodeTemp(int _30_, int _31_, int _32_)
    {
        int _33_ = 0;
        this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 32))) + 28), _30_);
        this._storeInt((_33_ + 24), _31_);
        this._storeInt((_33_ + 20), _32_);
        _32_ = this._storeInt((_33_ + 16), (sqlite3GetTempReg((this._loadInt((_33_ + 28))))));
        label$0:
        do {
            label$1:
            do {
                if ((this._storeInt((_33_ + 12), (sqlite3ExprCodeTarget((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 24))), _32_)))) != (this._loadInt((_33_ + 16)))) {
                    break label$1;
                }
                this._storeInt((this._loadInt((_33_ + 20))), (this._loadInt((_33_ + 16))));
                break label$0;
            }
            while (false);
            sqlite3ReleaseTempReg((this._loadInt((_33_ + 28))), (this._loadInt((_33_ + 16))));
            this._storeInt((this._loadInt((_33_ + 20))), 0);
        }
        while (false);
        _32_ = this._loadInt((_33_ + 12));
        this._storeInt((0 + 4), (_33_ + 32));
        return _32_;
    }

    @Override()
    public final int codeCompare(
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
        this._storeInt(((_38_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 48))) + 44), _30_);
        this._storeInt((_38_ + 40), _31_);
        this._storeInt((_38_ + 36), _32_);
        this._storeInt((_38_ + 32), _33_);
        this._storeInt((_38_ + 28), _34_);
        this._storeInt((_38_ + 24), _35_);
        this._storeInt((_38_ + 20), _36_);
        this._storeInt((_38_ + 16), _37_);
        this._storeInt((_38_ + 4), (sqlite3BinaryCompareCollSeq((this._loadInt((_38_ + 44))), (this._loadInt((_38_ + 40))), (this._loadInt((_38_ + 36))))));
        this._storeInt((_38_ + 12), (binaryCompareP5((this._loadInt((_38_ + 40))), (this._loadInt((_38_ + 36))), (this._loadInt((_38_ + 16))))));
        this._storeInt((_38_ + 8), (sqlite3VdbeAddOp4((this._loadInt(((this._loadInt((_38_ + 44))) + 12))), (this._loadInt((_38_ + 32))), (this._loadInt((_38_ + 24))), (this._loadInt((_38_ + 20))), (this._loadInt((_38_ + 28))), (this._loadInt((_38_ + 4))), -4)));
        sqlite3VdbeChangeP5((this._loadInt(((this._loadInt((_38_ + 44))) + 12))), (this._loadInt8u((_38_ + 12))));
        _37_ = this._loadInt((_38_ + 8));
        this._storeInt((0 + 4), (_38_ + 48));
        return _37_;
    }

    @Override()
    public final void sqlite3ExprCachePush(int _30_)
    {
        int _31_ = 0;
        _31_ = this._loadInt((0 + 4));
        this._storeInt((_30_ + 84), ((this._loadInt((_30_ + 84))) + 1));
        this._storeInt(((_31_ - 16) + 12), _30_);
        return;
    }
}
