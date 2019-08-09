package java.lang

// The Short class wraps a value of primitive type short in an object.  An object of type Short contains a
// single field whose type is short.
//
// In addition, this class provides several methods for converting
// a short to a String and a String to a
// short, as well as other constants and methods useful when
// dealing with a short.
final class Short extends Number with Comparable[Short] {

    @stub
    // Constructs a newly allocated Short object that
    // represents the specified short value.
    def this(value: Short) = ???

    @stub
    // Returns the value of this Short as a byte after
    // a narrowing primitive conversion.
    def byteValue(): Byte = ???

    @stub
    // Compares two Short objects numerically.
    def compareTo(anotherShort: Short): Int = ???

    @stub
    // Returns the value of this Short as a double
    // after a widening primitive conversion.
    def doubleValue(): double = ???

    @stub
    // Compares this object to the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the value of this Short as a float
    // after a widening primitive conversion.
    def floatValue(): float = ???

    @stub
    // Returns a hash code for this Short; equal to the result
    // of invoking intValue().
    def hashCode(): Int = ???

    @stub
    // Returns the value of this Short as an int after
    // a widening primitive conversion.
    def intValue(): Int = ???

    @stub
    // Returns the value of this Short as a long after
    // a widening primitive conversion.
    def longValue(): Long = ???

    @stub
    // Returns the value of this Short as a
    // short.
    def shortValue(): Short = ???

    @stub
    // Returns a String object representing this
    // Short's value.
    def toString(): String = ???
}

object Short {
    @stub
    // The number of bytes used to represent a short value in two's
    // complement binary form.
    def BYTES: Int = ???

    @stub
    // A constant holding the maximum value a short can
    // have, 215-1.
    def MAX_VALUE: Short = ???

    @stub
    // A constant holding the minimum value a short can
    // have, -215.
    def MIN_VALUE: Short = ???

    @stub
    // The number of bits used to represent a short value in two's
    // complement binary form.
    def SIZE: Int = ???

    @stub
    // Compares two short values numerically.
    def compare(x: Short, y: Short): Int = ???

    @stub
    // Decodes a String into a Short.
    def decode(nm: String): Short = ???

    @stub
    // Returns a hash code for a short value; compatible with
    // Short.hashCode().
    def hashCode(value: Short): Int = ???

    @stub
    // Parses the string argument as a signed decimal short.
    def parseShort(s: String): Short = ???

    @stub
    // Parses the string argument as a signed short in the
    // radix specified by the second argument.
    def parseShort(s: String, radix: Int): Short = ???

    @stub
    // Returns the value obtained by reversing the order of the bytes in the
    // two's complement representation of the specified short value.
    def reverseBytes(i: Short): Short = ???

    @stub
    // Returns a new String object representing the
    // specified short.
    def toString(s: Short): String = ???

    @stub
    // Converts the argument to an int by an unsigned
    // conversion.
    def toUnsignedInt(x: Short): Int = ???

    @stub
    // Converts the argument to a long by an unsigned
    // conversion.
    def toUnsignedLong(x: Short): Long = ???

    @stub
    // Returns a Short instance representing the specified
    // short value.
    def valueOf(s: Short): Short = ???

    @stub
    // Returns a Short object holding the
    // value given by the specified String.
    def valueOf(s: String): Short = ???
}
