package java.io

import java.lang.{Object, String}

/** A data output stream lets an application write primitive Java data
 *  types to an output stream in a portable way. An application can
 *  then use a data input stream to read the data back in.
 */
class DataOutputStream extends FilterOutputStream with DataOutput {

    /** Flushes this data output stream. */
    @stub
    def flush(): Unit = ???

    /** Returns the current value of the counter written,
     *  the number of bytes written to this data output stream so far.
     */
    @stub
    def size(): Int = ???

    /** Writes len bytes from the specified byte array
     *  starting at offset off to the underlying output stream.
     */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Writes the specified byte (the low eight bits of the argument
     *  b) to the underlying output stream.
     */
    @stub
    def write(b: Int): Unit = ???

    /** Writes a boolean to the underlying output stream as
     *  a 1-byte value.
     */
    @stub
    def writeBoolean(v: Boolean): Unit = ???

    /** Writes out a byte to the underlying output stream as
     *  a 1-byte value.
     */
    @stub
    def writeByte(v: Int): Unit = ???

    /** Writes out the string to the underlying output stream as a
     *  sequence of bytes.
     */
    @stub
    def writeBytes(s: String): Unit = ???

    /** Writes a char to the underlying output stream as a
     *  2-byte value, high byte first.
     */
    @stub
    def writeChar(v: Int): Unit = ???

    /** Writes a string to the underlying output stream as a sequence of
     *  characters.
     */
    @stub
    def writeChars(s: String): Unit = ???

    /** Converts the double argument to a long using the
     *  doubleToLongBits method in class Double,
     *  and then writes that long value to the underlying
     *  output stream as an 8-byte quantity, high byte first.
     */
    @stub
    def writeDouble(v: Double): Unit = ???

    /** Converts the float argument to an int using the
     *  floatToIntBits method in class Float,
     *  and then writes that int value to the underlying
     *  output stream as a 4-byte quantity, high byte first.
     */
    @stub
    def writeFloat(v: Float): Unit = ???

    /** Writes an int to the underlying output stream as four
     *  bytes, high byte first.
     */
    @stub
    def writeInt(v: Int): Unit = ???

    /** Writes a long to the underlying output stream as eight
     *  bytes, high byte first.
     */
    @stub
    def writeLong(v: Long): Unit = ???

    /** Writes a short to the underlying output stream as two
     *  bytes, high byte first.
     */
    @stub
    def writeShort(v: Int): Unit = ???
}
