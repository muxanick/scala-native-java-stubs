package java.io

import java.lang.String

// The DataOutput interface provides
// for converting data from any of the Java
// primitive types to a series of bytes and
// writing these bytes to a binary stream.
// There is  also a facility for converting
// a String into
// modified UTF-8
// format and writing the resulting series
// of bytes.
// 
// For all the methods in this interface that
// write bytes, it is generally true that if
// a byte cannot be written for any reason,
// an IOException is thrown.
trait DataOutput {

    @stub
    // Writes to the output stream all the bytes in array b.
    def write(b: Array[Byte]): Unit = ???

    @stub
    // Writes len bytes from array
    // b, in order,  to
    // the output stream.
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???

    @stub
    // Writes to the output stream the eight
    // low-order bits of the argument b.
    def write(b: Int): Unit = ???

    @stub
    // Writes a boolean value to this output stream.
    def writeBoolean(v: Boolean): Unit = ???

    @stub
    // Writes to the output stream the eight low-
    // order bits of the argument v.
    def writeByte(v: Int): Unit = ???

    @stub
    // Writes a string to the output stream.
    def writeBytes(s: String): Unit = ???

    @stub
    // Writes a char value, which
    // is comprised of two bytes, to the
    // output stream.
    def writeChar(v: Int): Unit = ???

    @stub
    // Writes every character in the string s,
    // to the output stream, in order,
    // two bytes per character.
    def writeChars(s: String): Unit = ???

    @stub
    // Writes a double value,
    // which is comprised of eight bytes, to the output stream.
    def writeDouble(v: double): Unit = ???

    @stub
    // Writes a float value,
    // which is comprised of four bytes, to the output stream.
    def writeFloat(v: float): Unit = ???

    @stub
    // Writes an int value, which is
    // comprised of four bytes, to the output stream.
    def writeInt(v: Int): Unit = ???

    @stub
    // Writes a long value, which is
    // comprised of eight bytes, to the output stream.
    def writeLong(v: Long): Unit = ???

    @stub
    // Writes two bytes to the output
    // stream to represent the value of the argument.
    def writeShort(v: Int): Unit = ???
}
