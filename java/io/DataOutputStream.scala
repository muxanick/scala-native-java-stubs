package java.io

import java.lang.{Object, String}

// A data output stream lets an application write primitive Java data
// types to an output stream in a portable way. An application can
// then use a data input stream to read the data back in.
class DataOutputStream extends FilterOutputStream with DataOutput {

    @stub
    // Flushes this data output stream.
    def flush(): Unit = ???

    @stub
    // Returns the current value of the counter written,
    // the number of bytes written to this data output stream so far.
    def size(): Int = ???

    @stub
    // Writes len bytes from the specified byte array
    // starting at offset off to the underlying output stream.
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???

    @stub
    // Writes the specified byte (the low eight bits of the argument
    // b) to the underlying output stream.
    def write(b: Int): Unit = ???

    @stub
    // Writes a boolean to the underlying output stream as
    // a 1-byte value.
    def writeBoolean(v: Boolean): Unit = ???

    @stub
    // Writes out a byte to the underlying output stream as
    // a 1-byte value.
    def writeByte(v: Int): Unit = ???

    @stub
    // Writes out the string to the underlying output stream as a
    // sequence of bytes.
    def writeBytes(s: String): Unit = ???

    @stub
    // Writes a char to the underlying output stream as a
    // 2-byte value, high byte first.
    def writeChar(v: Int): Unit = ???

    @stub
    // Writes a string to the underlying output stream as a sequence of
    // characters.
    def writeChars(s: String): Unit = ???

    @stub
    // Converts the double argument to a long using the
    // doubleToLongBits method in class Double,
    // and then writes that long value to the underlying
    // output stream as an 8-byte quantity, high byte first.
    def writeDouble(v: double): Unit = ???

    @stub
    // Converts the float argument to an int using the
    // floatToIntBits method in class Float,
    // and then writes that int value to the underlying
    // output stream as a 4-byte quantity, high byte first.
    def writeFloat(v: float): Unit = ???

    @stub
    // Writes an int to the underlying output stream as four
    // bytes, high byte first.
    def writeInt(v: Int): Unit = ???

    @stub
    // Writes a long to the underlying output stream as eight
    // bytes, high byte first.
    def writeLong(v: Long): Unit = ???

    @stub
    // Writes a short to the underlying output stream as two
    // bytes, high byte first.
    def writeShort(v: Int): Unit = ???
}
