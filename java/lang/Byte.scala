package java.lang

// The Byte class wraps a value of primitive type byte
// in an object.  An object of type Byte contains a single
// field whose type is byte.
//
// In addition, this class provides several methods for converting
// a byte to a String and a String to a byte, as well as other constants and methods useful when dealing
// with a byte.
final class Byte extends Number with Comparable[Byte] {

    @stub
    // Constructs a newly allocated Byte object that
    // represents the specified byte value.
    def this(value: Byte) = ???

    @stub
    // Returns the value of this Byte as a
    // byte.
    def byteValue(): Byte = ???

    @stub
    // Compares two Byte objects numerically.
    def compareTo(anotherByte: Byte): Int = ???

    @stub
    // Returns the value of this Byte as a double
    // after a widening primitive conversion.
    def doubleValue(): double = ???

    @stub
    // Compares this object to the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the value of this Byte as a float after
    // a widening primitive conversion.
    def floatValue(): float = ???

    @stub
    // Returns a hash code for this Byte; equal to the result
    // of invoking intValue().
    def hashCode(): Int = ???

    @stub
    // Returns the value of this Byte as an int after
    // a widening primitive conversion.
    def intValue(): Int = ???

    @stub
    // Returns the value of this Byte as a long after
    // a widening primitive conversion.
    def longValue(): Long = ???

    @stub
    // Returns the value of this Byte as a short after
    // a widening primitive conversion.
    def shortValue(): Short = ???

    @stub
    // Returns a String object representing this
    // Byte's value.
    def toString(): String = ???
}

object Byte {
    @stub
    // The number of bytes used to represent a byte value in two's
    // complement binary form.
    def BYTES: Int = ???

    @stub
    // A constant holding the maximum value a byte can
    // have, 27-1.
    def MAX_VALUE: Byte = ???

    @stub
    // A constant holding the minimum value a byte can
    // have, -27.
    def MIN_VALUE: Byte = ???

    @stub
    // The number of bits used to represent a byte value in two's
    // complement binary form.
    def SIZE: Int = ???

    @stub
    // Compares two byte values numerically.
    def compare(x: Byte, y: Byte): Int = ???

    @stub
    // Decodes a String into a Byte.
    def decode(nm: String): Byte = ???

    @stub
    // Returns a hash code for a byte value; compatible with
    // Byte.hashCode().
    def hashCode(value: Byte): Int = ???

    @stub
    // Parses the string argument as a signed decimal byte.
    def parseByte(s: String): Byte = ???

    @stub
    // Parses the string argument as a signed byte in the
    // radix specified by the second argument.
    def parseByte(s: String, radix: Int): Byte = ???

    @stub
    // Returns a new String object representing the
    // specified byte.
    def toString(b: Byte): String = ???

    @stub
    // Converts the argument to an int by an unsigned
    // conversion.
    def toUnsignedInt(x: Byte): Int = ???

    @stub
    // Converts the argument to a long by an unsigned
    // conversion.
    def toUnsignedLong(x: Byte): Long = ???

    @stub
    // Returns a Byte instance representing the specified
    // byte value.
    def valueOf(b: Byte): Byte = ???

    @stub
    // Returns a Byte object holding the value
    // given by the specified String.
    def valueOf(s: String): Byte = ???
}
