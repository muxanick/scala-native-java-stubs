package java.lang

import scala.scalanative.annotation.stub

/** The Double class wraps a value of the primitive type
 *  double in an object. An object of type
 *  Double contains a single field whose type is
 *  double.
 * 
 *  In addition, this class provides several methods for converting a
 *  double to a String and a
 *  String to a double, as well as other
 *  constants and methods useful when dealing with a
 *  double.
 */
final class Double extends Number with Comparable[Double] {

    /** Constructs a newly allocated Double object that
     *  represents the primitive double argument.
     */
    @stub
    def this(value: Double) = ???

    /** Constructs a newly allocated Double object that
     *  represents the floating-point value of type double
     *  represented by the string.
     */
    @stub
    def this(s: String) = ???

    /** Returns the value of this Double as a byte
     *  after a narrowing primitive conversion.
     */
    @stub
    def byteValue(): Byte = ???

    /** Compares two Double objects numerically. */
    @stub
    def compareTo(anotherDouble: Double): Int = ???

    /** Returns the double value of this Double object. */
    @stub
    def doubleValue(): Double = ???

    /** Compares this object against the specified object. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the value of this Double as a float
     *  after a narrowing primitive conversion.
     */
    @stub
    def floatValue(): Float = ???

    /** Returns a hash code for this Double object. */
    @stub
    def hashCode(): Int = ???

    /** Returns the value of this Double as an int
     *  after a narrowing primitive conversion.
     */
    @stub
    def intValue(): Int = ???

    /** Returns true if this Double value is
     *  infinitely large in magnitude, false otherwise.
     */
    @stub
    def isInfinite(): Boolean = ???

    /** Returns true if this Double value is
     *  a Not-a-Number (NaN), false otherwise.
     */
    @stub
    def isNaN(): Boolean = ???

    /** Returns the value of this Double as a long
     *  after a narrowing primitive conversion.
     */
    @stub
    def longValue(): Long = ???

    /** Returns the value of this Double as a short
     *  after a narrowing primitive conversion.
     */
    @stub
    def shortValue(): Short = ???

    /** Returns a string representation of this Double object. */
    @stub
    def toString(): String = ???
}

object Double {
    /** The number of bytes used to represent a double value. */
    @stub
    val BYTES: Int = ???

    /** Maximum exponent a finite double variable may have. */
    @stub
    val MAX_EXPONENT: Int = ???

    /** A constant holding the largest positive finite value of type
     *  double,
     *  (2-2-52)·21023.
     */
    @stub
    val MAX_VALUE: Double = ???

    /** Minimum exponent a normalized double variable may
     *  have.
     */
    @stub
    val MIN_EXPONENT: Int = ???

    /** A constant holding the smallest positive normal value of type
     *  double, 2-1022.
     */
    @stub
    val MIN_NORMAL: Double = ???

    /** A constant holding the smallest positive nonzero value of type
     *  double, 2-1074.
     */
    @stub
    val MIN_VALUE: Double = ???

    /** A constant holding a Not-a-Number (NaN) value of type
     *  double.
     */
    @stub
    val NaN: Double = ???

    /** A constant holding the negative infinity of type
     *  double.
     */
    @stub
    val NEGATIVE_INFINITY: Double = ???

    /** A constant holding the positive infinity of type
     *  double.
     */
    @stub
    val POSITIVE_INFINITY: Double = ???

    /** The number of bits used to represent a double value. */
    @stub
    val SIZE: Int = ???

    /** The Class instance representing the primitive type
     *  double.
     */
    @stub
    val TYPE: Class[Double] = ???

    /** Compares the two specified double values. */
    @stub
    def compare(d1: Double, d2: Double): Int = ???

    /** Returns a representation of the specified floating-point value
     *  according to the IEEE 754 floating-point "double
     *  format" bit layout.
     */
    @stub
    def doubleToLongBits(value: Double): Long = ???

    /** Returns a representation of the specified floating-point value
     *  according to the IEEE 754 floating-point "double
     *  format" bit layout, preserving Not-a-Number (NaN) values.
     */
    @stub
    def doubleToRawLongBits(value: Double): Long = ???

    /** Returns a hash code for a double value; compatible with
     *  Double.hashCode().
     */
    @stub
    def hashCode(value: Double): Int = ???

    /** Returns true if the argument is a finite floating-point
     *  value; returns false otherwise (for NaN and infinity
     *  arguments).
     */
    @stub
    def isFinite(d: Double): Boolean = ???

    /** Returns true if the specified number is infinitely
     *  large in magnitude, false otherwise.
     */
    @stub
    def isInfinite(v: Double): Boolean = ???

    /** Returns true if the specified number is a
     *  Not-a-Number (NaN) value, false otherwise.
     */
    @stub
    def isNaN(v: Double): Boolean = ???

    /** Returns the double value corresponding to a given
     *  bit representation.
     */
    @stub
    def longBitsToDouble(bits: Long): Double = ???

    /** Returns the greater of two double values
     *  as if by calling Math.max.
     */
    @stub
    def max(a: Double, b: Double): Double = ???

    /** Returns the smaller of two double values
     *  as if by calling Math.min.
     */
    @stub
    def min(a: Double, b: Double): Double = ???

    /** Returns a new double initialized to the value
     *  represented by the specified String, as performed
     *  by the valueOf method of class
     *  Double.
     */
    @stub
    def parseDouble(s: String): Double = ???

    /** Adds two double values together as per the + operator. */
    @stub
    def sum(a: Double, b: Double): Double = ???

    /** Returns a hexadecimal string representation of the
     *  double argument.
     */
    @stub
    def toHexString(d: Double): String = ???

    /** Returns a string representation of the double
     *  argument.
     */
    @stub
    def toString(d: Double): String = ???

    /** Returns a Double instance representing the specified
     *  double value.
     */
    @stub
    def valueOf(d: Double): Double = ???

    /** Returns a Double object holding the
     *  double value represented by the argument string
     *  s.
     */
    @stub
    def valueOf(s: String): Double = ???
}
