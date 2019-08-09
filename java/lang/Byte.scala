package java.lang

/** The Byte class wraps a value of primitive type byte
 *  in an object.  An object of type Byte contains a single
 *  field whose type is byte.
 * 
 *  In addition, this class provides several methods for converting
 *  a byte to a String and a String to a byte, as well as other constants and methods useful when dealing
 *  with a byte.
 */
final class Byte extends Number with Comparable[Byte] {

    /** Constructs a newly allocated Byte object that
     *  represents the specified byte value.
     */
    @stub
    def this(value: Byte) = ???

    /** Returns the value of this Byte as a
     *  byte.
     */
    @stub
    def byteValue(): Byte = ???

    /** Compares two Byte objects numerically. */
    @stub
    def compareTo(anotherByte: Byte): Int = ???

    /** Returns the value of this Byte as a double
     *  after a widening primitive conversion.
     */
    @stub
    def doubleValue(): Double = ???

    /** Compares this object to the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the value of this Byte as a float after
     *  a widening primitive conversion.
     */
    @stub
    def floatValue(): Float = ???

    /** Returns a hash code for this Byte; equal to the result
     *  of invoking intValue().
     */
    @stub
    def hashCode(): Int = ???

    /** Returns the value of this Byte as an int after
     *  a widening primitive conversion.
     */
    @stub
    def intValue(): Int = ???

    /** Returns the value of this Byte as a long after
     *  a widening primitive conversion.
     */
    @stub
    def longValue(): Long = ???

    /** Returns the value of this Byte as a short after
     *  a widening primitive conversion.
     */
    @stub
    def shortValue(): Short = ???

    /** Returns a String object representing this
     *  Byte's value.
     */
    @stub
    def toString(): String = ???
}

object Byte {
    /** The number of bytes used to represent a byte value in two's
     *  complement binary form.
     */
    @stub
    val BYTES: Int = ???

    /** A constant holding the maximum value a byte can
     *  have, 27-1.
     */
    @stub
    val MAX_VALUE: Byte = ???

    /** A constant holding the minimum value a byte can
     *  have, -27.
     */
    @stub
    val MIN_VALUE: Byte = ???

    /** The number of bits used to represent a byte value in two's
     *  complement binary form.
     */
    @stub
    val SIZE: Int = ???

    /** Compares two byte values numerically. */
    @stub
    def compare(x: Byte, y: Byte): Int = ???

    /** Decodes a String into a Byte. */
    @stub
    def decode(nm: String): Byte = ???

    /** Returns a hash code for a byte value; compatible with
     *  Byte.hashCode().
     */
    @stub
    def hashCode(value: Byte): Int = ???

    /** Parses the string argument as a signed decimal byte. */
    @stub
    def parseByte(s: String): Byte = ???

    /** Parses the string argument as a signed byte in the
     *  radix specified by the second argument.
     */
    @stub
    def parseByte(s: String, radix: Int): Byte = ???

    /** Returns a new String object representing the
     *  specified byte.
     */
    @stub
    def toString(b: Byte): String = ???

    /** Converts the argument to an int by an unsigned
     *  conversion.
     */
    @stub
    def toUnsignedInt(x: Byte): Int = ???

    /** Converts the argument to a long by an unsigned
     *  conversion.
     */
    @stub
    def toUnsignedLong(x: Byte): Long = ???

    /** Returns a Byte instance representing the specified
     *  byte value.
     */
    @stub
    def valueOf(b: Byte): Byte = ???

    /** Returns a Byte object holding the value
     *  given by the specified String.
     */
    @stub
    def valueOf(s: String): Byte = ???
}
