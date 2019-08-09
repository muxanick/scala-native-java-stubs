package java.lang

// The Float class wraps a value of primitive type
// float in an object. An object of type
// Float contains a single field whose type is
// float.
//
// In addition, this class provides several methods for converting a
// float to a String and a
// String to a float, as well as other
// constants and methods useful when dealing with a
// float.
final class Float extends Number with Comparable[Float] {

    @stub
    // Constructs a newly allocated Float object that
    // represents the argument converted to type float.
    def this(value: double) = ???

    @stub
    // Constructs a newly allocated Float object that
    // represents the primitive float argument.
    def this(value: float) = ???

    @stub
    // Returns the value of this Float as a byte after
    // a narrowing primitive conversion.
    def byteValue(): Byte = ???

    @stub
    // Compares two Float objects numerically.
    def compareTo(anotherFloat: Float): Int = ???

    @stub
    // Returns the value of this Float as a double
    // after a widening primitive conversion.
    def doubleValue(): double = ???

    @stub
    // Compares this object against the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the float value of this Float object.
    def floatValue(): float = ???

    @stub
    // Returns a hash code for this Float object.
    def hashCode(): Int = ???

    @stub
    // Returns the value of this Float as an int after
    // a narrowing primitive conversion.
    def intValue(): Int = ???

    @stub
    // Returns true if this Float value is
    // infinitely large in magnitude, false otherwise.
    def isInfinite(): Boolean = ???

    @stub
    // Returns true if this Float value is a
    // Not-a-Number (NaN), false otherwise.
    def isNaN(): Boolean = ???

    @stub
    // Returns value of this Float as a long after a
    // narrowing primitive conversion.
    def longValue(): Long = ???

    @stub
    // Returns the value of this Float as a short
    // after a narrowing primitive conversion.
    def shortValue(): Short = ???

    @stub
    // Returns a string representation of this Float object.
    def toString(): String = ???
}

object Float {
    @stub
    // The number of bytes used to represent a float value.
    def BYTES: Int = ???

    @stub
    // Maximum exponent a finite float variable may have.
    def MAX_EXPONENT: Int = ???

    @stub
    // A constant holding the largest positive finite value of type
    // float, (2-2-23)·2127.
    def MAX_VALUE: float = ???

    @stub
    // Minimum exponent a normalized float variable may have.
    def MIN_EXPONENT: Int = ???

    @stub
    // A constant holding the smallest positive normal value of type
    // float, 2-126.
    def MIN_NORMAL: float = ???

    @stub
    // A constant holding the smallest positive nonzero value of type
    // float, 2-149.
    def MIN_VALUE: float = ???

    @stub
    // A constant holding a Not-a-Number (NaN) value of type
    // float.
    def NaN: float = ???

    @stub
    // A constant holding the negative infinity of type
    // float.
    def NEGATIVE_INFINITY: float = ???

    @stub
    // A constant holding the positive infinity of type
    // float.
    def POSITIVE_INFINITY: float = ???

    @stub
    // The number of bits used to represent a float value.
    def SIZE: Int = ???

    @stub
    // Compares the two specified float values.
    def compare(f1: float, f2: float): Int = ???

    @stub
    // Returns a representation of the specified floating-point value
    // according to the IEEE 754 floating-point "single format" bit
    // layout.
    def floatToIntBits(value: float): Int = ???

    @stub
    // Returns a representation of the specified floating-point value
    // according to the IEEE 754 floating-point "single format" bit
    // layout, preserving Not-a-Number (NaN) values.
    def floatToRawIntBits(value: float): Int = ???

    @stub
    // Returns a hash code for a float value; compatible with
    // Float.hashCode().
    def hashCode(value: float): Int = ???

    @stub
    // Returns the float value corresponding to a given
    // bit representation.
    def intBitsToFloat(bits: Int): float = ???

    @stub
    // Returns true if the argument is a finite floating-point
    // value; returns false otherwise (for NaN and infinity
    // arguments).
    def isFinite(f: float): Boolean = ???

    @stub
    // Returns true if the specified number is infinitely
    // large in magnitude, false otherwise.
    def isInfinite(v: float): Boolean = ???

    @stub
    // Returns true if the specified number is a
    // Not-a-Number (NaN) value, false otherwise.
    def isNaN(v: float): Boolean = ???

    @stub
    // Returns the greater of two float values
    // as if by calling Math.max.
    def max(a: float, b: float): float = ???

    @stub
    // Returns the smaller of two float values
    // as if by calling Math.min.
    def min(a: float, b: float): float = ???

    @stub
    // Returns a new float initialized to the value
    // represented by the specified String, as performed
    // by the valueOf method of class Float.
    def parseFloat(s: String): float = ???

    @stub
    // Adds two float values together as per the + operator.
    def sum(a: float, b: float): float = ???

    @stub
    // Returns a hexadecimal string representation of the
    // float argument.
    def toHexString(f: float): String = ???

    @stub
    // Returns a string representation of the float
    // argument.
    def toString(f: float): String = ???

    @stub
    // Returns a Float instance representing the specified
    // float value.
    def valueOf(f: float): Float = ???
}
