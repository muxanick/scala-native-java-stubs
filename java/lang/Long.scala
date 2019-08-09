package java.lang

import scala.scalanative.annotation.stub

/** The Long class wraps a value of the primitive type long in an object. An object of type Long contains a
 *  single field whose type is long.
 * 
 *   In addition, this class provides several methods for converting
 *  a long to a String and a String to a long, as well as other constants and methods useful when dealing
 *  with a long.
 * 
 *  Implementation note: The implementations of the "bit twiddling"
 *  methods (such as highestOneBit and
 *  numberOfTrailingZeros) are
 *  based on material from Henry S. Warren, Jr.'s Hacker's
 *  Delight, (Addison Wesley, 2002).
 */
final class Long extends Number with Comparable[Long] {

    /** Constructs a newly allocated Long object that
     *  represents the specified long argument.
     */
    @stub
    def this(value: Long) = ???

    /** Constructs a newly allocated Long object that
     *  represents the long value indicated by the
     *  String parameter.
     */
    @stub
    def this(s: String) = ???

    /** Returns the value of this Long as a byte after
     *  a narrowing primitive conversion.
     */
    @stub
    def byteValue(): Byte = ???

    /** Compares two Long objects numerically. */
    @stub
    def compareTo(anotherLong: Long): Int = ???

    /** Returns the value of this Long as a double
     *  after a widening primitive conversion.
     */
    @stub
    def doubleValue(): Double = ???

    /** Compares this object to the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the value of this Long as a float after
     *  a widening primitive conversion.
     */
    @stub
    def floatValue(): Float = ???

    /** Returns a hash code for this Long. */
    @stub
    def hashCode(): Int = ???

    /** Returns the value of this Long as an int after
     *  a narrowing primitive conversion.
     */
    @stub
    def intValue(): Int = ???

    /** Returns the value of this Long as a
     *  long value.
     */
    @stub
    def longValue(): Long = ???

    /** Returns the value of this Long as a short after
     *  a narrowing primitive conversion.
     */
    @stub
    def shortValue(): Short = ???

    /** Returns a String object representing this
     *  Long's value.
     */
    @stub
    def toString(): String = ???
}

object Long {
    /** The number of bytes used to represent a long value in two's
     *  complement binary form.
     */
    @stub
    val BYTES: Int = ???

    /** A constant holding the maximum value a long can
     *  have, 263-1.
     */
    @stub
    val MAX_VALUE: Long = ???

    /** A constant holding the minimum value a long can
     *  have, -263.
     */
    @stub
    val MIN_VALUE: Long = ???

    /** The number of bits used to represent a long value in two's
     *  complement binary form.
     */
    @stub
    val SIZE: Int = ???

    /** The Class instance representing the primitive type
     *  long.
     */
    @stub
    val TYPE: Class[Long] = ???

    /** Returns the number of one-bits in the two's complement binary
     *  representation of the specified long value.
     */
    @stub
    def bitCount(i: Long): Int = ???

    /** Compares two long values numerically. */
    @stub
    def compare(x: Long, y: Long): Int = ???

    /** Compares two long values numerically treating the values
     *  as unsigned.
     */
    @stub
    def compareUnsigned(x: Long, y: Long): Int = ???

    /** Decodes a String into a Long. */
    @stub
    def decode(nm: String): Long = ???

    /** Returns the unsigned quotient of dividing the first argument by
     *  the second where each argument and the result is interpreted as
     *  an unsigned value.
     */
    @stub
    def divideUnsigned(dividend: Long, divisor: Long): Long = ???

    /** Determines the long value of the system property
     *  with the specified name.
     */
    @stub
    def getLong(nm: String): Long = ???

    /** Determines the long value of the system property
     *  with the specified name.
     */
    @stub
    def getLong(nm: String, val: Long): Long = ???

    /** Returns the long value of the system property with
     *  the specified name.
     */
    @stub
    def getLong(nm: String, val: Long): Long = ???

    /** Returns a hash code for a long value; compatible with
     *  Long.hashCode().
     */
    @stub
    def hashCode(value: Long): Int = ???

    /** Returns a long value with at most a single one-bit, in the
     *  position of the highest-order ("leftmost") one-bit in the specified
     *  long value.
     */
    @stub
    def highestOneBit(i: Long): Long = ???

    /** Returns a long value with at most a single one-bit, in the
     *  position of the lowest-order ("rightmost") one-bit in the specified
     *  long value.
     */
    @stub
    def lowestOneBit(i: Long): Long = ???

    /** Returns the greater of two long values
     *  as if by calling Math.max.
     */
    @stub
    def max(a: Long, b: Long): Long = ???

    /** Returns the smaller of two long values
     *  as if by calling Math.min.
     */
    @stub
    def min(a: Long, b: Long): Long = ???

    /** Returns the number of zero bits preceding the highest-order
     *  ("leftmost") one-bit in the two's complement binary representation
     *  of the specified long value.
     */
    @stub
    def numberOfLeadingZeros(i: Long): Int = ???

    /** Returns the number of zero bits following the lowest-order ("rightmost")
     *  one-bit in the two's complement binary representation of the specified
     *  long value.
     */
    @stub
    def numberOfTrailingZeros(i: Long): Int = ???

    /** Parses the string argument as a signed decimal long. */
    @stub
    def parseLong(s: String): Long = ???

    /** Parses the string argument as a signed long in the
     *  radix specified by the second argument.
     */
    @stub
    def parseLong(s: String, radix: Int): Long = ???

    /** Parses the string argument as an unsigned decimal long. */
    @stub
    def parseUnsignedLong(s: String): Long = ???

    /** Parses the string argument as an unsigned long in the
     *  radix specified by the second argument.
     */
    @stub
    def parseUnsignedLong(s: String, radix: Int): Long = ???

    /** Returns the unsigned remainder from dividing the first argument
     *  by the second where each argument and the result is interpreted
     *  as an unsigned value.
     */
    @stub
    def remainderUnsigned(dividend: Long, divisor: Long): Long = ???

    /** Returns the value obtained by reversing the order of the bits in the
     *  two's complement binary representation of the specified long
     *  value.
     */
    @stub
    def reverse(i: Long): Long = ???

    /** Returns the value obtained by reversing the order of the bytes in the
     *  two's complement representation of the specified long value.
     */
    @stub
    def reverseBytes(i: Long): Long = ???

    /** Returns the value obtained by rotating the two's complement binary
     *  representation of the specified long value left by the
     *  specified number of bits.
     */
    @stub
    def rotateLeft(i: Long, distance: Int): Long = ???

    /** Returns the value obtained by rotating the two's complement binary
     *  representation of the specified long value right by the
     *  specified number of bits.
     */
    @stub
    def rotateRight(i: Long, distance: Int): Long = ???

    /** Returns the signum function of the specified long value. */
    @stub
    def signum(i: Long): Int = ???

    /** Adds two long values together as per the + operator. */
    @stub
    def sum(a: Long, b: Long): Long = ???

    /** Returns a string representation of the long
     *  argument as an unsigned integer in base 2.
     */
    @stub
    def toBinaryString(i: Long): String = ???

    /** Returns a string representation of the long
     *  argument as an unsigned integer in base 16.
     */
    @stub
    def toHexString(i: Long): String = ???

    /** Returns a string representation of the long
     *  argument as an unsigned integer in base 8.
     */
    @stub
    def toOctalString(i: Long): String = ???

    /** Returns a String object representing the specified
     *  long.
     */
    @stub
    def toString(i: Long): String = ???

    /** Returns a string representation of the first argument in the
     *  radix specified by the second argument.
     */
    @stub
    def toString(i: Long, radix: Int): String = ???

    /** Returns a string representation of the argument as an unsigned
     *  decimal value.
     */
    @stub
    def toUnsignedString(i: Long): String = ???

    /** Returns a string representation of the first argument as an
     *  unsigned integer value in the radix specified by the second
     *  argument.
     */
    @stub
    def toUnsignedString(i: Long, radix: Int): String = ???

    /** Returns a Long instance representing the specified
     *  long value.
     */
    @stub
    def valueOf(l: Long): Long = ???

    /** Returns a Long object holding the value
     *  of the specified String.
     */
    @stub
    def valueOf(s: String): Long = ???

    /** Returns a Long object holding the value
     *  extracted from the specified String when parsed
     *  with the radix given by the second argument.
     */
    @stub
    def valueOf(s: String, radix: Int): Long = ???
}
