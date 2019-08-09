package java.io

import java.lang.{Object, String}

// A data input stream lets an application read primitive Java data
// types from an underlying input stream in a machine-independent
// way. An application uses a data output stream to write data that
// can later be read by a data input stream.
// 
// DataInputStream is not necessarily safe for multithreaded access.
// Thread safety is optional and is the responsibility of users of
// methods in this class.
class DataInputStream extends FilterInputStream with DataInput {

    @stub
    // Reads some number of bytes from the contained input stream and
    // stores them into the buffer array b.
    def read(b: Array[Byte]): Int = ???

    @stub
    // Reads up to len bytes of data from the contained
    // input stream into an array of bytes.
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    @stub
    // See the general contract of the readBoolean
    // method of DataInput.
    def readBoolean(): Boolean = ???

    @stub
    // See the general contract of the readByte
    // method of DataInput.
    def readByte(): Byte = ???

    @stub
    // See the general contract of the readChar
    // method of DataInput.
    def readChar(): Char = ???

    @stub
    // See the general contract of the readDouble
    // method of DataInput.
    def readDouble(): double = ???

    @stub
    // See the general contract of the readFloat
    // method of DataInput.
    def readFloat(): float = ???

    @stub
    // See the general contract of the readFully
    // method of DataInput.
    def readFully(b: Array[Byte]): Unit = ???

    @stub
    // See the general contract of the readFully
    // method of DataInput.
    def readFully(b: Array[Byte], off: Int, len: Int): Unit = ???

    @stub
    // See the general contract of the readInt
    // method of DataInput.
    def readInt(): Int = ???

    @stub
    // Deprecated. 
    //This method does not properly convert bytes to characters.
    // As of JDK 1.1, the preferred way to read lines of text is via the
    // BufferedReader.readLine() method.  Programs that use the
    // DataInputStream class to read lines can be converted to use
    // the BufferedReader class by replacing code of the form:
    // 
    //     DataInputStream d = new DataInputStream(in);
    // 
    // with:
    // 
    //     BufferedReader d
    //          = new BufferedReader(new InputStreamReader(in));
    // 
    //
    def readLine(): String = ???

    @stub
    // See the general contract of the readLong
    // method of DataInput.
    def readLong(): Long = ???

    @stub
    // See the general contract of the readShort
    // method of DataInput.
    def readShort(): Short = ???

    @stub
    // See the general contract of the readUnsignedByte
    // method of DataInput.
    def readUnsignedByte(): Int = ???

    @stub
    // See the general contract of the readUnsignedShort
    // method of DataInput.
    def readUnsignedShort(): Int = ???

    @stub
    // See the general contract of the readUTF
    // method of DataInput.
    def readUTF(): String = ???
}

object DataInputStream {
    @stub
    // Reads from the
    // stream in a representation
    // of a Unicode  character string encoded in
    // modified UTF-8 format;
    // this string of characters is then returned as a String.
    def readUTF(in: DataInput): String = ???
}
