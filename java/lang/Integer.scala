package java.lang

/** The Integer class wraps a value of the primitive type
 *  int in an object. An object of type Integer
 *  contains a single field whose type is int.
 * 
 *  In addition, this class provides several methods for converting
 *  an int to a String and a String to an
 *  int, as well as other constants and methods useful when
 *  dealing with an int.
 * 
 *  Implementation note: The implementations of the "bit twiddling"
 *  methods (such as highestOneBit and
 *  numberOfTrailingZeros) are
 *  based on material from Henry S. Warren, Jr.'s Hacker's
 *  Delight, (Addison Wesley, 2002).
 */
final class Integer extends Number with Comparable[Integer] {

    /** Constructs a newly allocated Integer object that
     *  represents the specified int value.
     */
    @stub
    def this(value: Int) = ???

    /** Returns the value of this Integer as a byte
     *  after a narrowing primitive conversion.
     */
    @stub
    def byteValue(): Byte = ???

    /** Compares two Integer objects numerically. */
    @stub
    def compareTo(anotherInteger: Integer): Int = ???

    /** Returns the value of this Integer as a double
     *  after a widening primitive conversion.
     */
    @stub
    def doubleValue(): Double = ???

    /** Compares this object to the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the value of this Integer as a float
     *  after a widening primitive conversion.
     */
    @stub
    def floatValue(): Float = ???

    /** Returns a hash code for this Integer. */
    @stub
    def hashCode(): Int = ???

    /** Returns the value of this Integer as an
     *  int.
     */
    @stub
    def intValue(): Int = ???

    /** Returns the value of this Integer as a long
     *  after a widening primitive conversion.
     */
    @stub
    def longValue(): Long = ???

    /** Returns the value of this Integer as a short
     *  after a narrowing primitive conversion.
     */
    @stub
    def shortValue(): Short = ???

    /** Returns a String object representing this
     *  Integer's value.
     */
    @stub
    def toString(): String = ???
}

object Integer {
    /** The number of bytes used to represent a int value in two's
     *  complement binary form.
     */
    @stub
    val BYTES: Int = ???

    /** A constant holding the maximum value an int can
     *  have, 231-1.
     */
    @stub
    val MAX_VALUE: Int = ???

    /** A constant holding the minimum value an int can
     *  have, -231.
     */
    @stub
    val MIN_VALUE: Int = ???

    /** The number of bits used to represent an int value in two's
     *  complement binary form.
     */
    @stub
    val SIZE: Int = ???

    /** Returns the number of one-bits in the two's complement binary
     *  representation of the specified int value.
     */
    @stub
    def bitCount(i: Int): Int = ???

    /** Compares two int values numerically. */
    @stub
    def compare(x: Int, y: Int): Int = ???

    /** Compares two int values numerically treating the values
     *  as unsigned.
     */
    @stub
    def compareUnsigned(x: Int, y: Int): Int = ???

    /** Decodes a String into an Integer. */
    @stub
    def decode(nm: String): Integer = ???

    /** Returns the unsigned quotient of dividing the first argument by
     *  the second where each argument and the result is interpreted as
     *  an unsigned value.
     */
    @stub
    def divideUnsigned(dividend: Int, divisor: Int): Int = ???

    /** Determines the integer value of the system property with the
     *  specified name.
     */
    @stub
    def getInteger(nm: String): Integer = ???

    /** Determines the integer value of the system property with the
     *  specified name.
     */
    @stub
    def getInteger(nm: String, val: Int): Integer = ???

    /** Returns the integer value of the system property with the
     *  specified name.
     */
    @stub
    def getInteger(nm: String, val: Integer): Integer = ???

    /** Returns a hash code for a int value; compatible with
     *  Integer.hashCode().
     */
    @stub
    def hashCode(value: Int): Int = ???

    /** Returns an int value with at most a single one-bit, in the
     *  position of the highest-order ("leftmost") one-bit in the specified
     *  int value.
     */
    @stub
    def highestOneBit(i: Int): Int = ???

    /** Returns an int value with at most a single one-bit, in the
     *  position of the lowest-order ("rightmost") one-bit in the specified
     *  int value.
     */
    @stub
    def lowestOneBit(i: Int): Int = ???

    /** Returns the greater of two int values
     *  as if by calling Math.max.
     */
    @stub
    def max(a: Int, b: Int): Int = ???

    /** Returns the smaller of two int values
     *  as if by calling Math.min.
     */
    @stub
    def min(a: Int, b: Int): Int = ???

    /** Returns the number of zero bits preceding the highest-order
     *  ("leftmost") one-bit in the two's complement binary representation
     *  of the specified int value.
     */
    @stub
    def numberOfLeadingZeros(i: Int): Int = ???

    /** Returns the number of zero bits following the lowest-order ("rightmost")
     *  one-bit in the two's complement binary representation of the specified
     *  int value.
     */
    @stub
    def numberOfTrailingZeros(i: Int): Int = ???

    /** Parses the string argument as a signed decimal integer. */
    @stub
    def parseInt(s: String): Int = ???

    /** Parses the string argument as a signed integer in the radix
     *  specified by the second argument.
     */
    @stub
    def parseInt(s: String, radix: Int): Int = ???

    /** Parses the string argument as an unsigned decimal integer. */
    @stub
    def parseUnsignedInt(s: String): Int = ???

    /** Parses the string argument as an unsigned integer in the radix
     *  specified by the second argument.
     */
    @stub
    def parseUnsignedInt(s: String, radix: Int): Int = ???

    /** Returns the unsigned remainder from dividing the first argument
     *  by the second where each argument and the result is interpreted
     *  as an unsigned value.
     */
    @stub
    def remainderUnsigned(dividend: Int, divisor: Int): Int = ???

    /** Returns the value obtained by reversing the order of the bits in the
     *  two's complement binary representation of the specified int
     *  value.
     */
    @stub
    def reverse(i: Int): Int = ???

    /** Returns the value obtained by reversing the order of the bytes in the
     *  two's complement representation of the specified int value.
     */
    @stub
    def reverseBytes(i: Int): Int = ???

    /** Returns the value obtained by rotating the two's complement binary
     *  representation of the specified int value left by the
     *  specified number of bits.
     */
    @stub
    def rotateLeft(i: Int, distance: Int): Int = ???

    /** Returns the value obtained by rotating the two's complement binary
     *  representation of the specified int value right by the
     *  specified number of bits.
     */
    @stub
    def rotateRight(i: Int, distance: Int): Int = ???

    /** Returns the signum function of the specified int value. */
    @stub
    def signum(i: Int): Int = ???

    /** Adds two integers together as per the + operator. */
    @stub
    def sum(a: Int, b: Int): Int = ???

    /** Returns a string representation of the integer argument as an
     *  unsigned integer in base 2.
     */
    @stub
    def toBinaryString(i: Int): String = ???

    /** Returns a string representation of the integer argument as an
     *  unsigned integer in base 16.
     */
    @stub
    def toHexString(i: Int): String = ???

    /** Returns a string representation of the integer argument as an
     *  unsigned integer in base 8.
     */
    @stub
    def toOctalString(i: Int): String = ???

    /** Returns a String object representing the
     *  specified integer.
     */
    @stub
    def toString(i: Int): String = ???

    /** Returns a string representation of the first argument in the
     *  radix specified by the second argument.
     */
    @stub
    def toString(i: Int, radix: Int): String = ???

    /** Converts the argument to a long by an unsigned
     *  conversion.
     */
    @stub
    def toUnsignedLong(x: Int): Long = ???

    /** Returns a string representation of the argument as an unsigned
     *  decimal value.
     */
    @stub
    def toUnsignedString(i: Int): String = ???

    /** Returns a string representation of the first argument as an
     *  unsigned integer value in the radix specified by the second
     *  argument.
     */
    @stub
    def toUnsignedString(i: Int, radix: Int): String = ???

    /** Returns an Integer instance representing the specified
     *  int value.
     */
    @stub
    def valueOf(i: Int): Integer = ???

    /** Returns an Integer object holding the
     *  value of the specified String.
     */
    @stub
    def valueOf(s: String): Integer = ???
}
