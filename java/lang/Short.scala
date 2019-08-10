package java.lang

import scala.scalanative.annotation.stub

/** The Short class wraps a value of primitive type short in an object.  An object of type Short contains a
 *  single field whose type is short.
 * 
 *  In addition, this class provides several methods for converting
 *  a short to a String and a String to a
 *  short, as well as other constants and methods useful when
 *  dealing with a short.
 */
final class Short extends Number with Comparable[Short] {

    /** Constructs a newly allocated Short object that
     *  represents the specified short value.
     */
    @stub
    def this(value: Short) = ???

    /** Constructs a newly allocated Short object that
     *  represents the short value indicated by the
     *  String parameter.
     */
    @stub
    def this(s: String) = ???

    /** Returns the value of this Short as a byte after
     *  a narrowing primitive conversion.
     */
    @stub
    def byteValue(): Byte = ???

    /** Compares two Short objects numerically. */
    @stub
    def compareTo(anotherShort: Short): Int = ???

    /** Returns the value of this Short as a double
     *  after a widening primitive conversion.
     */
    @stub
    def doubleValue(): Double = ???

    /** Compares this object to the specified object. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the value of this Short as a float
     *  after a widening primitive conversion.
     */
    @stub
    def floatValue(): Float = ???

    /** Returns a hash code for this Short; equal to the result
     *  of invoking intValue().
     */
    @stub
    def hashCode(): Int = ???

    /** Returns the value of this Short as an int after
     *  a widening primitive conversion.
     */
    @stub
    def intValue(): Int = ???

    /** Returns the value of this Short as a long after
     *  a widening primitive conversion.
     */
    @stub
    def longValue(): Long = ???

    /** Returns the value of this Short as a
     *  short.
     */
    @stub
    def shortValue(): Short = ???

    /** Returns a String object representing this
     *  Short's value.
     */
    @stub
    def toString(): String = ???
}

object Short {
    /** The number of bytes used to represent a short value in two's
     *  complement binary form.
     */
    @stub
    val BYTES: Int = ???

    /** A constant holding the maximum value a short can
     *  have, 215-1.
     */
    @stub
    val MAX_VALUE: Short = ???

    /** A constant holding the minimum value a short can
     *  have, -215.
     */
    @stub
    val MIN_VALUE: Short = ???

    /** The number of bits used to represent a short value in two's
     *  complement binary form.
     */
    @stub
    val SIZE: Int = ???

    /** The Class instance representing the primitive type
     *  short.
     */
    @stub
    val TYPE: Class[Short] = ???

    /** Compares two short values numerically. */
    @stub
    def compare(x: Short, y: Short): Int = ???

    /** Decodes a String into a Short. */
    @stub
    def decode(nm: String): Short = ???

    /** Returns a hash code for a short value; compatible with
     *  Short.hashCode().
     */
    @stub
    def hashCode(value: Short): Int = ???

    /** Parses the string argument as a signed decimal short. */
    @stub
    def parseShort(s: String): Short = ???

    /** Parses the string argument as a signed short in the
     *  radix specified by the second argument.
     */
    @stub
    def parseShort(s: String, radix: Int): Short = ???

    /** Returns the value obtained by reversing the order of the bytes in the
     *  two's complement representation of the specified short value.
     */
    @stub
    def reverseBytes(i: Short): Short = ???

    /** Returns a new String object representing the
     *  specified short.
     */
    @stub
    def toString(s: Short): String = ???

    /** Converts the argument to an int by an unsigned
     *  conversion.
     */
    @stub
    def toUnsignedInt(x: Short): Int = ???

    /** Converts the argument to a long by an unsigned
     *  conversion.
     */
    @stub
    def toUnsignedLong(x: Short): Long = ???

    /** Returns a Short instance representing the specified
     *  short value.
     */
    @stub
    def valueOf(s: Short): Short = ???

    /** Returns a Short object holding the
     *  value given by the specified String.
     */
    @stub
    def valueOf(s: String): Short = ???

    /** Returns a Short object holding the value
     *  extracted from the specified String when parsed
     *  with the radix given by the second argument.
     */
    @stub
    def valueOf(s: String, radix: Int): Short = ???
}
