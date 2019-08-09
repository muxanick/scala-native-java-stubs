package java.lang

/** The Float class wraps a value of primitive type
 *  float in an object. An object of type
 *  Float contains a single field whose type is
 *  float.
 * 
 *  In addition, this class provides several methods for converting a
 *  float to a String and a
 *  String to a float, as well as other
 *  constants and methods useful when dealing with a
 *  float.
 */
final class Float extends Number with Comparable[Float] {

    /** Constructs a newly allocated Float object that
     *  represents the argument converted to type float.
     */
    @stub
    def this(value: Double) = ???

    /** Constructs a newly allocated Float object that
     *  represents the primitive float argument.
     */
    @stub
    def this(value: Float) = ???

    /** Returns the value of this Float as a byte after
     *  a narrowing primitive conversion.
     */
    @stub
    def byteValue(): Byte = ???

    /** Compares two Float objects numerically. */
    @stub
    def compareTo(anotherFloat: Float): Int = ???

    /** Returns the value of this Float as a double
     *  after a widening primitive conversion.
     */
    @stub
    def doubleValue(): Double = ???

    /** Compares this object against the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the float value of this Float object. */
    @stub
    def floatValue(): Float = ???

    /** Returns a hash code for this Float object. */
    @stub
    def hashCode(): Int = ???

    /** Returns the value of this Float as an int after
     *  a narrowing primitive conversion.
     */
    @stub
    def intValue(): Int = ???

    /** Returns true if this Float value is
     *  infinitely large in magnitude, false otherwise.
     */
    @stub
    def isInfinite(): Boolean = ???

    /** Returns true if this Float value is a
     *  Not-a-Number (NaN), false otherwise.
     */
    @stub
    def isNaN(): Boolean = ???

    /** Returns value of this Float as a long after a
     *  narrowing primitive conversion.
     */
    @stub
    def longValue(): Long = ???

    /** Returns the value of this Float as a short
     *  after a narrowing primitive conversion.
     */
    @stub
    def shortValue(): Short = ???

    /** Returns a string representation of this Float object. */
    @stub
    def toString(): String = ???
}

object Float {
    /** The number of bytes used to represent a float value. */
    @stub
    val BYTES: Int = ???

    /** Maximum exponent a finite float variable may have. */
    @stub
    val MAX_EXPONENT: Int = ???

    /** A constant holding the largest positive finite value of type
     *  float, (2-2-23)·2127.
     */
    @stub
    val MAX_VALUE: Float = ???

    /** Minimum exponent a normalized float variable may have. */
    @stub
    val MIN_EXPONENT: Int = ???

    /** A constant holding the smallest positive normal value of type
     *  float, 2-126.
     */
    @stub
    val MIN_NORMAL: Float = ???

    /** A constant holding the smallest positive nonzero value of type
     *  float, 2-149.
     */
    @stub
    val MIN_VALUE: Float = ???

    /** A constant holding a Not-a-Number (NaN) value of type
     *  float.
     */
    @stub
    val NaN: Float = ???

    /** A constant holding the negative infinity of type
     *  float.
     */
    @stub
    val NEGATIVE_INFINITY: Float = ???

    /** A constant holding the positive infinity of type
     *  float.
     */
    @stub
    val POSITIVE_INFINITY: Float = ???

    /** The number of bits used to represent a float value. */
    @stub
    val SIZE: Int = ???

    /** Compares the two specified float values. */
    @stub
    def compare(f1: Float, f2: Float): Int = ???

    /** Returns a representation of the specified floating-point value
     *  according to the IEEE 754 floating-point "single format" bit
     *  layout.
     */
    @stub
    def floatToIntBits(value: Float): Int = ???

    /** Returns a representation of the specified floating-point value
     *  according to the IEEE 754 floating-point "single format" bit
     *  layout, preserving Not-a-Number (NaN) values.
     */
    @stub
    def floatToRawIntBits(value: Float): Int = ???

    /** Returns a hash code for a float value; compatible with
     *  Float.hashCode().
     */
    @stub
    def hashCode(value: Float): Int = ???

    /** Returns the float value corresponding to a given
     *  bit representation.
     */
    @stub
    def intBitsToFloat(bits: Int): Float = ???

    /** Returns true if the argument is a finite floating-point
     *  value; returns false otherwise (for NaN and infinity
     *  arguments).
     */
    @stub
    def isFinite(f: Float): Boolean = ???

    /** Returns true if the specified number is infinitely
     *  large in magnitude, false otherwise.
     */
    @stub
    def isInfinite(v: Float): Boolean = ???

    /** Returns true if the specified number is a
     *  Not-a-Number (NaN) value, false otherwise.
     */
    @stub
    def isNaN(v: Float): Boolean = ???

    /** Returns the greater of two float values
     *  as if by calling Math.max.
     */
    @stub
    def max(a: Float, b: Float): Float = ???

    /** Returns the smaller of two float values
     *  as if by calling Math.min.
     */
    @stub
    def min(a: Float, b: Float): Float = ???

    /** Returns a new float initialized to the value
     *  represented by the specified String, as performed
     *  by the valueOf method of class Float.
     */
    @stub
    def parseFloat(s: String): Float = ???

    /** Adds two float values together as per the + operator. */
    @stub
    def sum(a: Float, b: Float): Float = ???

    /** Returns a hexadecimal string representation of the
     *  float argument.
     */
    @stub
    def toHexString(f: Float): String = ???

    /** Returns a string representation of the float
     *  argument.
     */
    @stub
    def toString(f: Float): String = ???

    /** Returns a Float instance representing the specified
     *  float value.
     */
    @stub
    def valueOf(f: Float): Float = ???
}
