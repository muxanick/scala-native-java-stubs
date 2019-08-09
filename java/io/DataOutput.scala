package java.io

import java.lang.String
import scala.scalanative.annotation.stub

/** The DataOutput interface provides
 *  for converting data from any of the Java
 *  primitive types to a series of bytes and
 *  writing these bytes to a binary stream.
 *  There is  also a facility for converting
 *  a String into
 *  modified UTF-8
 *  format and writing the resulting series
 *  of bytes.
 *  
 *  For all the methods in this interface that
 *  write bytes, it is generally true that if
 *  a byte cannot be written for any reason,
 *  an IOException is thrown.
 */
trait DataOutput {

    /** Writes to the output stream all the bytes in array b. */
    @stub
    def write(b: Array[Byte]): Unit = ???

    /** Writes len bytes from array
     *  b, in order,  to
     *  the output stream.
     */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Writes to the output stream the eight
     *  low-order bits of the argument b.
     */
    @stub
    def write(b: Int): Unit = ???

    /** Writes a boolean value to this output stream. */
    @stub
    def writeBoolean(v: Boolean): Unit = ???

    /** Writes to the output stream the eight low-
     *  order bits of the argument v.
     */
    @stub
    def writeByte(v: Int): Unit = ???

    /** Writes a string to the output stream. */
    @stub
    def writeBytes(s: String): Unit = ???

    /** Writes a char value, which
     *  is comprised of two bytes, to the
     *  output stream.
     */
    @stub
    def writeChar(v: Int): Unit = ???

    /** Writes every character in the string s,
     *  to the output stream, in order,
     *  two bytes per character.
     */
    @stub
    def writeChars(s: String): Unit = ???

    /** Writes a double value,
     *  which is comprised of eight bytes, to the output stream.
     */
    @stub
    def writeDouble(v: Double): Unit = ???

    /** Writes a float value,
     *  which is comprised of four bytes, to the output stream.
     */
    @stub
    def writeFloat(v: Float): Unit = ???

    /** Writes an int value, which is
     *  comprised of four bytes, to the output stream.
     */
    @stub
    def writeInt(v: Int): Unit = ???

    /** Writes a long value, which is
     *  comprised of eight bytes, to the output stream.
     */
    @stub
    def writeLong(v: Long): Unit = ???

    /** Writes two bytes to the output
     *  stream to represent the value of the argument.
     */
    @stub
    def writeShort(v: Int): Unit = ???

    /** Writes two bytes of length information
     *  to the output stream, followed
     *  by the
     *  modified UTF-8
     *  representation
     *  of  every character in the string s.
     */
    @stub
    def writeUTF(s: String): Unit = ???
}
