package com.wrmsr.wava;

public final class fib
{
    public static final class Imports
    {
        public III printf;

        public Imports()
        {
        }

        public Imports(III printf)
        {
            this.printf = printf;
        }
    }

    private final III printf;

    @java.lang.FunctionalInterface()
    public interface II
    {
        int invoke(int arg0);
    }

    @java.lang.FunctionalInterface()
    public interface III
    {
        int invoke(int arg0, int arg1);
    }

    private final II[] _iiTable = new II[0];

    private final III[] _iiiTable = new III[0];

    private final int[] _tableIndices = {};

    private final java.nio.ByteBuffer _memory;

    private final java.lang.String[] _memorySegments = {
            "" +
                    "AAAAEAAAAAQlZAoA"
    };

    private final long[] _spill = new long[64];

    @java.lang.SuppressWarnings("NumericOverflow")
    private static int _truncateFloatToSignedInteger(float val)
    {
        if (java.lang.Float.isNaN(val)) {
            throw (new java.lang.IllegalStateException());
        }
        {
            long bits = java.lang.Float.floatToRawIntBits(val);
            if (!((bits < 1325400064L) || ((bits >= 2147483648L) && (bits < 3472883713L)))) {
                throw (new java.lang.IllegalStateException());
            }
        }
        return ((int) val);
    }

    @java.lang.SuppressWarnings("NumericOverflow")
    private static long _truncateFloatToSignedLong(float val)
    {
        if (java.lang.Float.isNaN(val)) {
            throw (new java.lang.IllegalStateException());
        }
        {
            long bits = java.lang.Float.floatToRawIntBits(val);
            if (!((bits < 1593835520L) || ((bits >= 2147483648L) && (bits < 3741319169L)))) {
                throw (new java.lang.IllegalStateException());
            }
        }
        return ((long) val);
    }

    @java.lang.SuppressWarnings("NumericOverflow")
    private static int _truncateFloatToUnsignedInteger(float val)
    {
        if (java.lang.Float.isNaN(val)) {
            throw (new java.lang.IllegalStateException());
        }
        {
            long bits = java.lang.Float.floatToRawIntBits(val);
            if (!((bits < 1333788672L) || ((bits >= 2147483648L) && (bits < 3212836864L)))) {
                throw (new java.lang.IllegalStateException());
            }
        }
        return ((int) ((long) val));
    }

    @java.lang.SuppressWarnings("NumericOverflow")
    private static long _truncateFloatToUnsignedLong(float val)
    {
        if (java.lang.Float.isNaN(val)) {
            throw (new java.lang.IllegalStateException());
        }
        {
            long bits = java.lang.Float.floatToRawIntBits(val);
            if (!((bits < 1602224128L) || ((bits >= 2147483648L) && (bits < 3212836864L)))) {
                throw (new java.lang.IllegalStateException());
            }
        }
        if (val >= (-((float) java.lang.Long.MIN_VALUE))) {
            return (((long) (val + ((float) java.lang.Long.MIN_VALUE))) ^ java.lang.Long.MIN_VALUE);
        }
        else {
            return ((long) val);
        }
    }

    @java.lang.SuppressWarnings("NumericOverflow")
    private static int _truncateDoubleToSignedInteger(double val)
    {
        if (java.lang.Double.isNaN(val)) {
            throw (new java.lang.IllegalStateException());
        }
        {
            long bits = java.lang.Double.doubleToRawLongBits(val);
            if (!(((bits + java.lang.Long.MIN_VALUE) < (4746794007244308481L + java.lang.Long.MIN_VALUE)) || (((bits + java.lang.Long.MIN_VALUE) >= (-9223372036854775808L + java.lang.Long.MIN_VALUE)) && ((bits + java.lang.Long.MIN_VALUE) < (-4476578029606273023L + java.lang.Long.MIN_VALUE))))) {
                throw (new java.lang.IllegalStateException());
            }
        }
        return ((int) val);
    }

    @java.lang.SuppressWarnings("NumericOverflow")
    private static long _truncateDoubleToSignedLong(double val)
    {
        if (java.lang.Double.isNaN(val)) {
            throw (new java.lang.IllegalStateException());
        }
        {
            long bits = java.lang.Double.doubleToRawLongBits(val);
            if (!(((bits + java.lang.Long.MIN_VALUE) < (4751297606873776129L + java.lang.Long.MIN_VALUE)) || (((bits + java.lang.Long.MIN_VALUE) >= (-9223372036854775808L + java.lang.Long.MIN_VALUE)) && ((bits + java.lang.Long.MIN_VALUE) < (-4616189618054758400L + java.lang.Long.MIN_VALUE))))) {
                throw (new java.lang.IllegalStateException());
            }
        }
        return ((long) val);
    }

    @java.lang.SuppressWarnings("NumericOverflow")
    private static int _truncateDoubleToUnsignedInteger(double val)
    {
        if (java.lang.Double.isNaN(val)) {
            throw (new java.lang.IllegalStateException());
        }
        {
            long bits = java.lang.Double.doubleToRawLongBits(val);
            if (!(((bits + java.lang.Long.MIN_VALUE) < (4890909195324358656L + java.lang.Long.MIN_VALUE)) || (((bits + java.lang.Long.MIN_VALUE) >= (-9223372036854775808L + java.lang.Long.MIN_VALUE)) && ((bits + java.lang.Long.MIN_VALUE) < (-4332462841530417151L + java.lang.Long.MIN_VALUE))))) {
                throw (new java.lang.IllegalStateException());
            }
        }
        return ((int) ((long) val));
    }

    @java.lang.SuppressWarnings("NumericOverflow")
    private static long _truncateDoubleToUnsignedLong(double val)
    {
        if (java.lang.Double.isNaN(val)) {
            throw (new java.lang.IllegalStateException());
        }
        {
            long bits = java.lang.Double.doubleToRawLongBits(val);
            if (!(((bits + java.lang.Long.MIN_VALUE) < (4895412794951729152L + java.lang.Long.MIN_VALUE)) || (((bits + java.lang.Long.MIN_VALUE) >= (-9223372036854775808L + java.lang.Long.MIN_VALUE)) && ((bits + java.lang.Long.MIN_VALUE) < (-4616189618054758400L + java.lang.Long.MIN_VALUE))))) {
                throw (new java.lang.IllegalStateException());
            }
        }
        if (val >= (-((double) java.lang.Long.MIN_VALUE))) {
            return (((long) (val + ((double) java.lang.Long.MIN_VALUE))) ^ java.lang.Long.MIN_VALUE);
        }
        else {
            return ((long) val);
        }
    }

    public static final class UnreachableException
            extends java.lang.RuntimeException
    {
    }

    public fib(Imports imports)
    {
        this.printf = java.util.Objects.requireNonNull(imports.printf);

        this._memory = java.nio.ByteBuffer.allocateDirect(2097152);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(16);
        for (java.lang.String s : _memorySegments) {
            sb.append(s);
        }
        java.nio.ByteBuffer buf = java.nio.ByteBuffer.wrap((java.util.Base64.getDecoder().decode((sb.toString()))));
        sb = null;
        while (buf.hasRemaining()) {
            _memory.position((buf.getInt()));
            byte[] seg = new byte[buf.getInt()];
            buf.get(seg);
            _memory.put(seg);
        }
        _memory.clear();

        this._storeInt(4, 4096);
    }

    private final byte _loadByte(int ptr)
    {
        return (this._memory.get(ptr));
    }

    private final byte _storeByte(int ptr, byte value)
    {
        this._memory.put(ptr, value);
        return value;
    }

    private final short _loadShort(int ptr)
    {
        return (this._memory.getShort(ptr));
    }

    private final short _storeShort(int ptr, short value)
    {
        this._memory.putShort(ptr, value);
        return value;
    }

    private final int _loadInt(int ptr)
    {
        return (this._memory.getInt(ptr));
    }

    private final int _storeInt(int ptr, int value)
    {
        this._memory.putInt(ptr, value);
        return value;
    }

    private final long _loadLong(int ptr)
    {
        return (this._memory.getLong(ptr));
    }

    private final long _storeLong(int ptr, long value)
    {
        this._memory.putLong(ptr, value);
        return value;
    }

    private final float _loadFloat(int ptr)
    {
        return (this._memory.getFloat(ptr));
    }

    private final float _storeFloat(int ptr, float value)
    {
        this._memory.putFloat(ptr, value);
        return value;
    }

    private final double _loadDouble(int ptr)
    {
        return (this._memory.getDouble(ptr));
    }

    private final double _storeDouble(int ptr, double value)
    {
        this._memory.putDouble(ptr, value);
        return value;
    }

    public final int fib(int _30_)
    {
        int _31_ = 0;
        this._storeInt(((_31_ = (this._loadInt((0 + 4))) - 16) + 12), _30_);
        this._storeInt((_31_ + 4), (this._storeInt((_31_ + 8), 1)));
        label$1:
        do {
            label$0:
            while (true) {
                if ((this._loadInt((_31_ + 12))) < 2) {
                    break label$1;
                }
                this._storeInt(_31_, ((this._loadInt((_31_ + 8))) + (this._loadInt((_31_ + 4)))));
                this._storeInt((_31_ + 8), (this._loadInt((_31_ + 4))));
                this._storeInt((_31_ + 4), (this._loadInt(_31_)));
                this._storeInt((_31_ + 12), ((this._loadInt((_31_ + 12))) + -1));
                continue label$0;
            }
        }
        while (false);
        return (this._loadInt((_31_ + 4)));
    }

    public final int main(int _30_, int _31_)
    {
        int _32_ = 0;
        int _33_ = 0;
        _32_ = this._storeInt(((_33_ = this._storeInt((0 + 4), ((this._loadInt((0 + 4))) - 16))) + 12), 0);
        this._storeInt((_33_ + 8), _30_);
        this._storeInt((_33_ + 4), _31_);
        this._storeInt(_33_, (fib(10)));
        this.printf.invoke(16, _33_);
        this._storeInt((0 + 4), (_33_ + 16));
        return _32_;
    }
}

