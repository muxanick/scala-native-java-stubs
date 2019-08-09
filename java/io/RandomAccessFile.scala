package java.io

import java.lang.{Object, String}
import java.nio.channels.FileChannel
import scala.scalanative.annotation.stub

/** Instances of this class support both reading and writing to a
 *  random access file. A random access file behaves like a large
 *  array of bytes stored in the file system. There is a kind of cursor,
 *  or index into the implied array, called the file pointer;
 *  input operations read bytes starting at the file pointer and advance
 *  the file pointer past the bytes read. If the random access file is
 *  created in read/write mode, then output operations are also available;
 *  output operations write bytes starting at the file pointer and advance
 *  the file pointer past the bytes written. Output operations that write
 *  past the current end of the implied array cause the array to be
 *  extended. The file pointer can be read by the
 *  getFilePointer method and set by the seek
 *  method.
 *  
 *  It is generally true of all the reading routines in this class that
 *  if end-of-file is reached before the desired number of bytes has been
 *  read, an EOFException (which is a kind of
 *  IOException) is thrown. If any byte cannot be read for
 *  any reason other than end-of-file, an IOException other
 *  than EOFException is thrown. In particular, an
 *  IOException may be thrown if the stream has been closed.
 */
class RandomAccessFile extends Object with DataOutput with DataInput with Closeable {

    /** Creates a random access file stream to read from, and optionally to
     *  write to, the file specified by the File argument.
     */
    @stub
    def this(file: File, mode: String) = ???

    /** Creates a random access file stream to read from, and optionally
     *  to write to, a file with the specified name.
     */
    @stub
    def this(name: String, mode: String) = ???

    /** Closes this random access file stream and releases any system
     *  resources associated with the stream.
     */
    @stub
    def close(): Unit = ???

    /** Returns the unique FileChannel
     *  object associated with this file.
     */
    @stub
    def getChannel(): FileChannel = ???

    /** Returns the opaque file descriptor object associated with this
     *  stream.
     */
    @stub
    def getFD(): FileDescriptor = ???

    /** Returns the current offset in this file. */
    @stub
    def getFilePointer(): Long = ???

    /** Returns the length of this file. */
    @stub
    def length(): Long = ???

    /** Reads a byte of data from this file. */
    @stub
    def read(): Int = ???

    /** Reads up to b.length bytes of data from this file
     *  into an array of bytes.
     */
    @stub
    def read(b: Array[Byte]): Int = ???

    /** Reads up to len bytes of data from this file into an
     *  array of bytes.
     */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    /** Reads a boolean from this file. */
    @stub
    def readBoolean(): Boolean = ???

    /** Reads a signed eight-bit value from this file. */
    @stub
    def readByte(): Byte = ???

    /** Reads a character from this file. */
    @stub
    def readChar(): Char = ???

    /** Reads a double from this file. */
    @stub
    def readDouble(): Double = ???

    /** Reads a float from this file. */
    @stub
    def readFloat(): Float = ???

    /** Reads b.length bytes from this file into the byte
     *  array, starting at the current file pointer.
     */
    @stub
    def readFully(b: Array[Byte]): Unit = ???

    /** Reads exactly len bytes from this file into the byte
     *  array, starting at the current file pointer.
     */
    @stub
    def readFully(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Reads a signed 32-bit integer from this file. */
    @stub
    def readInt(): Int = ???

    /** Reads the next line of text from this file. */
    @stub
    def readLine(): String = ???

    /** Reads a signed 64-bit integer from this file. */
    @stub
    def readLong(): Long = ???

    /** Reads a signed 16-bit number from this file. */
    @stub
    def readShort(): Short = ???

    /** Reads an unsigned eight-bit number from this file. */
    @stub
    def readUnsignedByte(): Int = ???

    /** Reads an unsigned 16-bit number from this file. */
    @stub
    def readUnsignedShort(): Int = ???

    /** Reads in a string from this file. */
    @stub
    def readUTF(): String = ???

    /** Sets the file-pointer offset, measured from the beginning of this
     *  file, at which the next read or write occurs.
     */
    @stub
    def seek(pos: Long): Unit = ???

    /** Sets the length of this file. */
    @stub
    def setLength(newLength: Long): Unit = ???

    /** Attempts to skip over n bytes of input discarding the
     *  skipped bytes.
     */
    @stub
    def skipBytes(n: Int): Int = ???

    /** Writes b.length bytes from the specified byte array
     *  to this file, starting at the current file pointer.
     */
    @stub
    def write(b: Array[Byte]): Unit = ???

    /** Writes len bytes from the specified byte array
     *  starting at offset off to this file.
     */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Writes the specified byte to this file. */
    @stub
    def write(b: Int): Unit = ???

    /** Writes a boolean to the file as a one-byte value. */
    @stub
    def writeBoolean(v: Boolean): Unit = ???

    /** Writes a byte to the file as a one-byte value. */
    @stub
    def writeByte(v: Int): Unit = ???

    /** Writes the string to the file as a sequence of bytes. */
    @stub
    def writeBytes(s: String): Unit = ???

    /** Writes a char to the file as a two-byte value, high
     *  byte first.
     */
    @stub
    def writeChar(v: Int): Unit = ???

    /** Writes a string to the file as a sequence of characters. */
    @stub
    def writeChars(s: String): Unit = ???

    /** Converts the double argument to a long using the
     *  doubleToLongBits method in class Double,
     *  and then writes that long value to the file as an
     *  eight-byte quantity, high byte first.
     */
    @stub
    def writeDouble(v: Double): Unit = ???

    /** Converts the float argument to an int using the
     *  floatToIntBits method in class Float,
     *  and then writes that int value to the file as a
     *  four-byte quantity, high byte first.
     */
    @stub
    def writeFloat(v: Float): Unit = ???

    /** Writes an int to the file as four bytes, high byte first. */
    @stub
    def writeInt(v: Int): Unit = ???

    /** Writes a long to the file as eight bytes, high byte first. */
    @stub
    def writeLong(v: Long): Unit = ???

    /** Writes a short to the file as two bytes, high byte first. */
    @stub
    def writeShort(v: Int): Unit = ???

    /** Writes a string to the file using
     *  modified UTF-8
     *  encoding in a machine-independent manner.
     */
    @stub
    def writeUTF(str: String): Unit = ???
}
