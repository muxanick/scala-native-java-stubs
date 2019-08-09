package java.lang

// The Long class wraps a value of the primitive type long in an object. An object of type Long contains a
// single field whose type is long.
//
//  In addition, this class provides several methods for converting
// a long to a String and a String to a long, as well as other constants and methods useful when dealing
// with a long.
//
// Implementation note: The implementations of the "bit twiddling"
// methods (such as highestOneBit and
// numberOfTrailingZeros) are
// based on material from Henry S. Warren, Jr.'s Hacker's
// Delight, (Addison Wesley, 2002).
final class Long extends Number with Comparable[Long] {

    @stub
    // Constructs a newly allocated Long object that
    // represents the specified long argument.
    def this(value: Long) = ???

    @stub
    // Returns the value of this Long as a byte after
    // a narrowing primitive conversion.
    def byteValue(): Byte = ???

    @stub
    // Compares two Long objects numerically.
    def compareTo(anotherLong: Long): Int = ???

    @stub
    // Returns the value of this Long as a double
    // after a widening primitive conversion.
    def doubleValue(): double = ???

    @stub
    // Compares this object to the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the value of this Long as a float after
    // a widening primitive conversion.
    def floatValue(): float = ???

    @stub
    // Returns a hash code for this Long.
    def hashCode(): Int = ???

    @stub
    // Returns the value of this Long as an int after
    // a narrowing primitive conversion.
    def intValue(): Int = ???

    @stub
    // Returns the value of this Long as a
    // long value.
    def longValue(): Long = ???

    @stub
    // Returns the value of this Long as a short after
    // a narrowing primitive conversion.
    def shortValue(): Short = ???

    @stub
    // Returns a String object representing this
    // Long's value.
    def toString(): String = ???
}

object Long {
    @stub
    // The number of bytes used to represent a long value in two's
    // complement binary form.
    def BYTES: Int = ???

    @stub
    // A constant holding the maximum value a long can
    // have, 263-1.
    def MAX_VALUE: Long = ???

    @stub
    // A constant holding the minimum value a long can
    // have, -263.
    def MIN_VALUE: Long = ???

    @stub
    // The number of bits used to represent a long value in two's
    // complement binary form.
    def SIZE: Int = ???

    @stub
    // Returns the number of one-bits in the two's complement binary
    // representation of the specified long value.
    def bitCount(i: Long): Int = ???

    @stub
    // Compares two long values numerically.
    def compare(x: Long, y: Long): Int = ???

    @stub
    // Compares two long values numerically treating the values
    // as unsigned.
    def compareUnsigned(x: Long, y: Long): Int = ???

    @stub
    // Decodes a String into a Long.
    def decode(nm: String): Long = ???

    @stub
    // Returns the unsigned quotient of dividing the first argument by
    // the second where each argument and the result is interpreted as
    // an unsigned value.
    def divideUnsigned(dividend: Long, divisor: Long): Long = ???

    @stub
    // Determines the long value of the system property
    // with the specified name.
    def getLong(nm: String): Long = ???

    @stub
    // Determines the long value of the system property
    // with the specified name.
    def getLong(nm: String, val: Long): Long = ???

    @stub
    // Returns the long value of the system property with
    // the specified name.
    def getLong(nm: String, val: Long): Long = ???

    @stub
    // Returns a hash code for a long value; compatible with
    // Long.hashCode().
    def hashCode(value: Long): Int = ???

    @stub
    // Returns a long value with at most a single one-bit, in the
    // position of the highest-order ("leftmost") one-bit in the specified
    // long value.
    def highestOneBit(i: Long): Long = ???

    @stub
    // Returns a long value with at most a single one-bit, in the
    // position of the lowest-order ("rightmost") one-bit in the specified
    // long value.
    def lowestOneBit(i: Long): Long = ???

    @stub
    // Returns the greater of two long values
    // as if by calling Math.max.
    def max(a: Long, b: Long): Long = ???

    @stub
    // Returns the smaller of two long values
    // as if by calling Math.min.
    def min(a: Long, b: Long): Long = ???

    @stub
    // Returns the number of zero bits preceding the highest-order
    // ("leftmost") one-bit in the two's complement binary representation
    // of the specified long value.
    def numberOfLeadingZeros(i: Long): Int = ???

    @stub
    // Returns the number of zero bits following the lowest-order ("rightmost")
    // one-bit in the two's complement binary representation of the specified
    // long value.
    def numberOfTrailingZeros(i: Long): Int = ???

    @stub
    // Parses the string argument as a signed decimal long.
    def parseLong(s: String): Long = ???

    @stub
    // Parses the string argument as a signed long in the
    // radix specified by the second argument.
    def parseLong(s: String, radix: Int): Long = ???

    @stub
    // Parses the string argument as an unsigned decimal long.
    def parseUnsignedLong(s: String): Long = ???

    @stub
    // Parses the string argument as an unsigned long in the
    // radix specified by the second argument.
    def parseUnsignedLong(s: String, radix: Int): Long = ???

    @stub
    // Returns the unsigned remainder from dividing the first argument
    // by the second where each argument and the result is interpreted
    // as an unsigned value.
    def remainderUnsigned(dividend: Long, divisor: Long): Long = ???

    @stub
    // Returns the value obtained by reversing the order of the bits in the
    // two's complement binary representation of the specified long
    // value.
    def reverse(i: Long): Long = ???

    @stub
    // Returns the value obtained by reversing the order of the bytes in the
    // two's complement representation of the specified long value.
    def reverseBytes(i: Long): Long = ???

    @stub
    // Returns the value obtained by rotating the two's complement binary
    // representation of the specified long value left by the
    // specified number of bits.
    def rotateLeft(i: Long, distance: Int): Long = ???

    @stub
    // Returns the value obtained by rotating the two's complement binary
    // representation of the specified long value right by the
    // specified number of bits.
    def rotateRight(i: Long, distance: Int): Long = ???

    @stub
    // Returns the signum function of the specified long value.
    def signum(i: Long): Int = ???

    @stub
    // Adds two long values together as per the + operator.
    def sum(a: Long, b: Long): Long = ???

    @stub
    // Returns a string representation of the long
    // argument as an unsigned integer in base 2.
    def toBinaryString(i: Long): String = ???

    @stub
    // Returns a string representation of the long
    // argument as an unsigned integer in base 16.
    def toHexString(i: Long): String = ???

    @stub
    // Returns a string representation of the long
    // argument as an unsigned integer in base 8.
    def toOctalString(i: Long): String = ???

    @stub
    // Returns a String object representing the specified
    // long.
    def toString(i: Long): String = ???

    @stub
    // Returns a string representation of the first argument in the
    // radix specified by the second argument.
    def toString(i: Long, radix: Int): String = ???

    @stub
    // Returns a string representation of the argument as an unsigned
    // decimal value.
    def toUnsignedString(i: Long): String = ???

    @stub
    // Returns a string representation of the first argument as an
    // unsigned integer value in the radix specified by the second
    // argument.
    def toUnsignedString(i: Long, radix: Int): String = ???

    @stub
    // Returns a Long instance representing the specified
    // long value.
    def valueOf(l: Long): Long = ???

    @stub
    // Returns a Long object holding the value
    // of the specified String.
    def valueOf(s: String): Long = ???
}
