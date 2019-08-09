package java.lang

// The Integer class wraps a value of the primitive type
// int in an object. An object of type Integer
// contains a single field whose type is int.
//
// In addition, this class provides several methods for converting
// an int to a String and a String to an
// int, as well as other constants and methods useful when
// dealing with an int.
//
// Implementation note: The implementations of the "bit twiddling"
// methods (such as highestOneBit and
// numberOfTrailingZeros) are
// based on material from Henry S. Warren, Jr.'s Hacker's
// Delight, (Addison Wesley, 2002).
final class Integer extends Number with Comparable[Integer] {

    @stub
    // Constructs a newly allocated Integer object that
    // represents the specified int value.
    def this(value: Int) = ???

    @stub
    // Returns the value of this Integer as a byte
    // after a narrowing primitive conversion.
    def byteValue(): Byte = ???

    @stub
    // Compares two Integer objects numerically.
    def compareTo(anotherInteger: Integer): Int = ???

    @stub
    // Returns the value of this Integer as a double
    // after a widening primitive conversion.
    def doubleValue(): double = ???

    @stub
    // Compares this object to the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the value of this Integer as a float
    // after a widening primitive conversion.
    def floatValue(): float = ???

    @stub
    // Returns a hash code for this Integer.
    def hashCode(): Int = ???

    @stub
    // Returns the value of this Integer as an
    // int.
    def intValue(): Int = ???

    @stub
    // Returns the value of this Integer as a long
    // after a widening primitive conversion.
    def longValue(): Long = ???

    @stub
    // Returns the value of this Integer as a short
    // after a narrowing primitive conversion.
    def shortValue(): Short = ???

    @stub
    // Returns a String object representing this
    // Integer's value.
    def toString(): String = ???
}

object Integer {
    @stub
    // The number of bytes used to represent a int value in two's
    // complement binary form.
    def BYTES: Int = ???

    @stub
    // A constant holding the maximum value an int can
    // have, 231-1.
    def MAX_VALUE: Int = ???

    @stub
    // A constant holding the minimum value an int can
    // have, -231.
    def MIN_VALUE: Int = ???

    @stub
    // The number of bits used to represent an int value in two's
    // complement binary form.
    def SIZE: Int = ???

    @stub
    // Returns the number of one-bits in the two's complement binary
    // representation of the specified int value.
    def bitCount(i: Int): Int = ???

    @stub
    // Compares two int values numerically.
    def compare(x: Int, y: Int): Int = ???

    @stub
    // Compares two int values numerically treating the values
    // as unsigned.
    def compareUnsigned(x: Int, y: Int): Int = ???

    @stub
    // Decodes a String into an Integer.
    def decode(nm: String): Integer = ???

    @stub
    // Returns the unsigned quotient of dividing the first argument by
    // the second where each argument and the result is interpreted as
    // an unsigned value.
    def divideUnsigned(dividend: Int, divisor: Int): Int = ???

    @stub
    // Determines the integer value of the system property with the
    // specified name.
    def getInteger(nm: String): Integer = ???

    @stub
    // Determines the integer value of the system property with the
    // specified name.
    def getInteger(nm: String, val: Int): Integer = ???

    @stub
    // Returns the integer value of the system property with the
    // specified name.
    def getInteger(nm: String, val: Integer): Integer = ???

    @stub
    // Returns a hash code for a int value; compatible with
    // Integer.hashCode().
    def hashCode(value: Int): Int = ???

    @stub
    // Returns an int value with at most a single one-bit, in the
    // position of the highest-order ("leftmost") one-bit in the specified
    // int value.
    def highestOneBit(i: Int): Int = ???

    @stub
    // Returns an int value with at most a single one-bit, in the
    // position of the lowest-order ("rightmost") one-bit in the specified
    // int value.
    def lowestOneBit(i: Int): Int = ???

    @stub
    // Returns the greater of two int values
    // as if by calling Math.max.
    def max(a: Int, b: Int): Int = ???

    @stub
    // Returns the smaller of two int values
    // as if by calling Math.min.
    def min(a: Int, b: Int): Int = ???

    @stub
    // Returns the number of zero bits preceding the highest-order
    // ("leftmost") one-bit in the two's complement binary representation
    // of the specified int value.
    def numberOfLeadingZeros(i: Int): Int = ???

    @stub
    // Returns the number of zero bits following the lowest-order ("rightmost")
    // one-bit in the two's complement binary representation of the specified
    // int value.
    def numberOfTrailingZeros(i: Int): Int = ???

    @stub
    // Parses the string argument as a signed decimal integer.
    def parseInt(s: String): Int = ???

    @stub
    // Parses the string argument as a signed integer in the radix
    // specified by the second argument.
    def parseInt(s: String, radix: Int): Int = ???

    @stub
    // Parses the string argument as an unsigned decimal integer.
    def parseUnsignedInt(s: String): Int = ???

    @stub
    // Parses the string argument as an unsigned integer in the radix
    // specified by the second argument.
    def parseUnsignedInt(s: String, radix: Int): Int = ???

    @stub
    // Returns the unsigned remainder from dividing the first argument
    // by the second where each argument and the result is interpreted
    // as an unsigned value.
    def remainderUnsigned(dividend: Int, divisor: Int): Int = ???

    @stub
    // Returns the value obtained by reversing the order of the bits in the
    // two's complement binary representation of the specified int
    // value.
    def reverse(i: Int): Int = ???

    @stub
    // Returns the value obtained by reversing the order of the bytes in the
    // two's complement representation of the specified int value.
    def reverseBytes(i: Int): Int = ???

    @stub
    // Returns the value obtained by rotating the two's complement binary
    // representation of the specified int value left by the
    // specified number of bits.
    def rotateLeft(i: Int, distance: Int): Int = ???

    @stub
    // Returns the value obtained by rotating the two's complement binary
    // representation of the specified int value right by the
    // specified number of bits.
    def rotateRight(i: Int, distance: Int): Int = ???

    @stub
    // Returns the signum function of the specified int value.
    def signum(i: Int): Int = ???

    @stub
    // Adds two integers together as per the + operator.
    def sum(a: Int, b: Int): Int = ???

    @stub
    // Returns a string representation of the integer argument as an
    // unsigned integer in base 2.
    def toBinaryString(i: Int): String = ???

    @stub
    // Returns a string representation of the integer argument as an
    // unsigned integer in base 16.
    def toHexString(i: Int): String = ???

    @stub
    // Returns a string representation of the integer argument as an
    // unsigned integer in base 8.
    def toOctalString(i: Int): String = ???

    @stub
    // Returns a String object representing the
    // specified integer.
    def toString(i: Int): String = ???

    @stub
    // Returns a string representation of the first argument in the
    // radix specified by the second argument.
    def toString(i: Int, radix: Int): String = ???

    @stub
    // Converts the argument to a long by an unsigned
    // conversion.
    def toUnsignedLong(x: Int): Long = ???

    @stub
    // Returns a string representation of the argument as an unsigned
    // decimal value.
    def toUnsignedString(i: Int): String = ???

    @stub
    // Returns a string representation of the first argument as an
    // unsigned integer value in the radix specified by the second
    // argument.
    def toUnsignedString(i: Int, radix: Int): String = ???

    @stub
    // Returns an Integer instance representing the specified
    // int value.
    def valueOf(i: Int): Integer = ???

    @stub
    // Returns an Integer object holding the
    // value of the specified String.
    def valueOf(s: String): Integer = ???
}
