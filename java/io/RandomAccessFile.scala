package java.io

import java.lang.{Object, String}
import java.nio.channels.FileChannel

// Instances of this class support both reading and writing to a
// random access file. A random access file behaves like a large
// array of bytes stored in the file system. There is a kind of cursor,
// or index into the implied array, called the file pointer;
// input operations read bytes starting at the file pointer and advance
// the file pointer past the bytes read. If the random access file is
// created in read/write mode, then output operations are also available;
// output operations write bytes starting at the file pointer and advance
// the file pointer past the bytes written. Output operations that write
// past the current end of the implied array cause the array to be
// extended. The file pointer can be read by the
// getFilePointer method and set by the seek
// method.
// 
// It is generally true of all the reading routines in this class that
// if end-of-file is reached before the desired number of bytes has been
// read, an EOFException (which is a kind of
// IOException) is thrown. If any byte cannot be read for
// any reason other than end-of-file, an IOException other
// than EOFException is thrown. In particular, an
// IOException may be thrown if the stream has been closed.
class RandomAccessFile extends Object with DataOutput, with DataInput, with Closeable {

    @stub
    // Creates a random access file stream to read from, and optionally to
    // write to, the file specified by the File argument.
    def this(file: File, mode: String) = ???

    @stub
    // Closes this random access file stream and releases any system
    // resources associated with the stream.
    def close(): Unit = ???

    @stub
    // Returns the unique FileChannel
    // object associated with this file.
    def getChannel(): FileChannel = ???

    @stub
    // Returns the opaque file descriptor object associated with this
    // stream.
    def getFD(): FileDescriptor = ???

    @stub
    // Returns the current offset in this file.
    def getFilePointer(): Long = ???

    @stub
    // Returns the length of this file.
    def length(): Long = ???

    @stub
    // Reads a byte of data from this file.
    def read(): Int = ???

    @stub
    // Reads up to b.length bytes of data from this file
    // into an array of bytes.
    def read(b: Array[Byte]): Int = ???

    @stub
    // Reads up to len bytes of data from this file into an
    // array of bytes.
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    @stub
    // Reads a boolean from this file.
    def readBoolean(): Boolean = ???

    @stub
    // Reads a signed eight-bit value from this file.
    def readByte(): Byte = ???

    @stub
    // Reads a character from this file.
    def readChar(): Char = ???

    @stub
    // Reads a double from this file.
    def readDouble(): double = ???

    @stub
    // Reads a float from this file.
    def readFloat(): float = ???

    @stub
    // Reads b.length bytes from this file into the byte
    // array, starting at the current file pointer.
    def readFully(b: Array[Byte]): Unit = ???

    @stub
    // Reads exactly len bytes from this file into the byte
    // array, starting at the current file pointer.
    def readFully(b: Array[Byte], off: Int, len: Int): Unit = ???

    @stub
    // Reads a signed 32-bit integer from this file.
    def readInt(): Int = ???

    @stub
    // Reads the next line of text from this file.
    def readLine(): String = ???

    @stub
    // Reads a signed 64-bit integer from this file.
    def readLong(): Long = ???

    @stub
    // Reads a signed 16-bit number from this file.
    def readShort(): Short = ???

    @stub
    // Reads an unsigned eight-bit number from this file.
    def readUnsignedByte(): Int = ???

    @stub
    // Reads an unsigned 16-bit number from this file.
    def readUnsignedShort(): Int = ???

    @stub
    // Reads in a string from this file.
    def readUTF(): String = ???

    @stub
    // Sets the file-pointer offset, measured from the beginning of this
    // file, at which the next read or write occurs.
    def seek(pos: Long): Unit = ???

    @stub
    // Sets the length of this file.
    def setLength(newLength: Long): Unit = ???

    @stub
    // Attempts to skip over n bytes of input discarding the
    // skipped bytes.
    def skipBytes(n: Int): Int = ???

    @stub
    // Writes b.length bytes from the specified byte array
    // to this file, starting at the current file pointer.
    def write(b: Array[Byte]): Unit = ???

    @stub
    // Writes len bytes from the specified byte array
    // starting at offset off to this file.
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???

    @stub
    // Writes the specified byte to this file.
    def write(b: Int): Unit = ???

    @stub
    // Writes a boolean to the file as a one-byte value.
    def writeBoolean(v: Boolean): Unit = ???

    @stub
    // Writes a byte to the file as a one-byte value.
    def writeByte(v: Int): Unit = ???

    @stub
    // Writes the string to the file as a sequence of bytes.
    def writeBytes(s: String): Unit = ???

    @stub
    // Writes a char to the file as a two-byte value, high
    // byte first.
    def writeChar(v: Int): Unit = ???

    @stub
    // Writes a string to the file as a sequence of characters.
    def writeChars(s: String): Unit = ???

    @stub
    // Converts the double argument to a long using the
    // doubleToLongBits method in class Double,
    // and then writes that long value to the file as an
    // eight-byte quantity, high byte first.
    def writeDouble(v: double): Unit = ???

    @stub
    // Converts the float argument to an int using the
    // floatToIntBits method in class Float,
    // and then writes that int value to the file as a
    // four-byte quantity, high byte first.
    def writeFloat(v: float): Unit = ???

    @stub
    // Writes an int to the file as four bytes, high byte first.
    def writeInt(v: Int): Unit = ???

    @stub
    // Writes a long to the file as eight bytes, high byte first.
    def writeLong(v: Long): Unit = ???

    @stub
    // Writes a short to the file as two bytes, high byte first.
    def writeShort(v: Int): Unit = ???
}
