package java.lang

// The Double class wraps a value of the primitive type
// double in an object. An object of type
// Double contains a single field whose type is
// double.
//
// In addition, this class provides several methods for converting a
// double to a String and a
// String to a double, as well as other
// constants and methods useful when dealing with a
// double.
final class Double extends Number with Comparable[Double] {

    @stub
    // Constructs a newly allocated Double object that
    // represents the primitive double argument.
    def this(value: double) = ???

    @stub
    // Returns the value of this Double as a byte
    // after a narrowing primitive conversion.
    def byteValue(): Byte = ???

    @stub
    // Compares two Double objects numerically.
    def compareTo(anotherDouble: Double): Int = ???

    @stub
    // Returns the double value of this Double object.
    def doubleValue(): double = ???

    @stub
    // Compares this object against the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the value of this Double as a float
    // after a narrowing primitive conversion.
    def floatValue(): float = ???

    @stub
    // Returns a hash code for this Double object.
    def hashCode(): Int = ???

    @stub
    // Returns the value of this Double as an int
    // after a narrowing primitive conversion.
    def intValue(): Int = ???

    @stub
    // Returns true if this Double value is
    // infinitely large in magnitude, false otherwise.
    def isInfinite(): Boolean = ???

    @stub
    // Returns true if this Double value is
    // a Not-a-Number (NaN), false otherwise.
    def isNaN(): Boolean = ???

    @stub
    // Returns the value of this Double as a long
    // after a narrowing primitive conversion.
    def longValue(): Long = ???

    @stub
    // Returns the value of this Double as a short
    // after a narrowing primitive conversion.
    def shortValue(): Short = ???

    @stub
    // Returns a string representation of this Double object.
    def toString(): String = ???
}

object Double {
    @stub
    // The number of bytes used to represent a double value.
    def BYTES: Int = ???

    @stub
    // Maximum exponent a finite double variable may have.
    def MAX_EXPONENT: Int = ???

    @stub
    // A constant holding the largest positive finite value of type
    // double,
    // (2-2-52)·21023.
    def MAX_VALUE: double = ???

    @stub
    // Minimum exponent a normalized double variable may
    // have.
    def MIN_EXPONENT: Int = ???

    @stub
    // A constant holding the smallest positive normal value of type
    // double, 2-1022.
    def MIN_NORMAL: double = ???

    @stub
    // A constant holding the smallest positive nonzero value of type
    // double, 2-1074.
    def MIN_VALUE: double = ???

    @stub
    // A constant holding a Not-a-Number (NaN) value of type
    // double.
    def NaN: double = ???

    @stub
    // A constant holding the negative infinity of type
    // double.
    def NEGATIVE_INFINITY: double = ???

    @stub
    // A constant holding the positive infinity of type
    // double.
    def POSITIVE_INFINITY: double = ???

    @stub
    // The number of bits used to represent a double value.
    def SIZE: Int = ???

    @stub
    // Compares the two specified double values.
    def compare(d1: double, d2: double): Int = ???

    @stub
    // Returns a representation of the specified floating-point value
    // according to the IEEE 754 floating-point "double
    // format" bit layout.
    def doubleToLongBits(value: double): Long = ???

    @stub
    // Returns a representation of the specified floating-point value
    // according to the IEEE 754 floating-point "double
    // format" bit layout, preserving Not-a-Number (NaN) values.
    def doubleToRawLongBits(value: double): Long = ???

    @stub
    // Returns a hash code for a double value; compatible with
    // Double.hashCode().
    def hashCode(value: double): Int = ???

    @stub
    // Returns true if the argument is a finite floating-point
    // value; returns false otherwise (for NaN and infinity
    // arguments).
    def isFinite(d: double): Boolean = ???

    @stub
    // Returns true if the specified number is infinitely
    // large in magnitude, false otherwise.
    def isInfinite(v: double): Boolean = ???

    @stub
    // Returns true if the specified number is a
    // Not-a-Number (NaN) value, false otherwise.
    def isNaN(v: double): Boolean = ???

    @stub
    // Returns the double value corresponding to a given
    // bit representation.
    def longBitsToDouble(bits: Long): double = ???

    @stub
    // Returns the greater of two double values
    // as if by calling Math.max.
    def max(a: double, b: double): double = ???

    @stub
    // Returns the smaller of two double values
    // as if by calling Math.min.
    def min(a: double, b: double): double = ???

    @stub
    // Returns a new double initialized to the value
    // represented by the specified String, as performed
    // by the valueOf method of class
    // Double.
    def parseDouble(s: String): double = ???

    @stub
    // Adds two double values together as per the + operator.
    def sum(a: double, b: double): double = ???

    @stub
    // Returns a hexadecimal string representation of the
    // double argument.
    def toHexString(d: double): String = ???

    @stub
    // Returns a string representation of the double
    // argument.
    def toString(d: double): String = ???

    @stub
    // Returns a Double instance representing the specified
    // double value.
    def valueOf(d: double): Double = ???
}
