package javax.imageio.stream

import java.io.{Closeable, DataInput}
import java.lang.String
import java.nio.ByteOrder
import scala.scalanative.annotation.stub

/** A seekable input stream interface for use by
 *  ImageReaders.  Various input sources, such as
 *  InputStreams and Files,
 *  as well as future fast I/O sources may be "wrapped" by a suitable
 *  implementation of this interface for use by the Image I/O API.
 */
trait ImageInputStream extends DataInput with Closeable {

    /** Closes the stream. */
    @stub
    def close(): Unit = ???

    /** Discards the initial position of the stream prior to the current
     *  stream position.
     */
    @stub
    def flush(): Unit = ???

    /** Discards the initial portion of the stream prior to the
     *  indicated position.
     */
    @stub
    def flushBefore(pos: Long): Unit = ???

    /** Returns the current bit offset, as an integer between 0 and 7,
     *  inclusive.
     */
    @stub
    def getBitOffset(): Int = ???

    /** Returns the byte order with which data values will be read from
     *  this stream as an instance of the
     *  java.nio.ByteOrder enumeration.
     */
    @stub
    def getByteOrder(): ByteOrder = ???

    /** Returns the earliest position in the stream to which seeking
     *  may be performed.
     */
    @stub
    def getFlushedPosition(): Long = ???

    /** Returns the current byte position of the stream. */
    @stub
    def getStreamPosition(): Long = ???

    /** Returns true if this ImageInputStream
     *  caches data itself in order to allow seeking backwards.
     */
    @stub
    def isCached(): Boolean = ???

    /** Returns true if this ImageInputStream
     *  caches data itself in order to allow seeking backwards, and
     *  the cache is kept in a temporary file.
     */
    @stub
    def isCachedFile(): Boolean = ???

    /** Returns true if this ImageInputStream
     *  caches data itself in order to allow seeking backwards, and
     *  the cache is kept in main memory.
     */
    @stub
    def isCachedMemory(): Boolean = ???

    /** Returns the total length of the stream, if known. */
    @stub
    def length(): Long = ???

    /** Marks a position in the stream to be returned to by a
     *  subsequent call to reset.
     */
    @stub
    def mark(): Unit = ???

    /** Reads a single byte from the stream and returns it as an
     *  integer between 0 and 255.
     */
    @stub
    def read(): Int = ???

    /** Reads up to b.length bytes from the stream, and
     *  stores them into b starting at index 0.
     */
    @stub
    def read(b: Array[Byte]): Int = ???

    /** Reads up to len bytes from the stream, and stores
     *  them into b starting at index off.
     */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    /** Reads a single bit from the stream and returns it as an
     *  int with the value 0 or
     *  1.
     */
    @stub
    def readBit(): Int = ???

    /** Reads a bitstring from the stream and returns it as a
     *  long, with the first bit read becoming the most
     *  significant bit of the output.
     */
    @stub
    def readBits(numBits: Int): Long = ???

    /** Reads a byte from the stream and returns a boolean
     *  value of true if it is nonzero, false
     *  if it is zero.
     */
    @stub
    def readBoolean(): Boolean = ???

    /** Reads a byte from the stream and returns it as a
     *  byte value.
     */
    @stub
    def readByte(): Byte = ???

    /** Reads up to len bytes from the stream, and
     *  modifies the supplied IIOByteBuffer to indicate
     *  the byte array, offset, and length where the data may be found.
     */
    @stub
    def readBytes(buf: IIOByteBuffer, len: Int): Unit = ???

    /** Equivalent to readUnsignedShort, except that the
     *  result is returned using the char datatype.
     */
    @stub
    def readChar(): Char = ???

    /** Reads 8 bytes from the stream, and (conceptually) concatenates
     *  them according to the current byte order and returns the result
     *  as a double.
     */
    @stub
    def readDouble(): Double = ???

    /** Reads 4 bytes from the stream, and (conceptually) concatenates
     *  them according to the current byte order and returns the result
     *  as a float.
     */
    @stub
    def readFloat(): Float = ???

    /** Reads b.length bytes from the stream, and stores them
     *  into b starting at index 0.
     */
    @stub
    def readFully(b: Array[Byte]): Unit = ???

    /** Reads len bytes from the stream, and stores them
     *  into b starting at index off.
     */
    @stub
    def readFully(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Reads len chars (unsigned 16-bit integers) from the
     *  stream according to the current byte order, and
     *  stores them into c starting at index
     *  off.
     */
    @stub
    def readFully(c: Array[Char], off: Int, len: Int): Unit = ???

    /** Reads len doubles (64-bit IEEE double-precision
     *  floats) from the stream according to the current byte order,
     *  and stores them into d starting at
     *  index off.
     */
    @stub
    def readFully(d: Array[Double], off: Int, len: Int): Unit = ???

    /** Reads len floats (32-bit IEEE single-precision
     *  floats) from the stream according to the current byte order,
     *  and stores them into f starting at
     *  index off.
     */
    @stub
    def readFully(f: Array[Float], off: Int, len: Int): Unit = ???

    /** Reads len ints (signed 32-bit integers) from the
     *  stream according to the current byte order, and
     *  stores them into i starting at index
     *  off.
     */
    @stub
    def readFully(i: Array[Int], off: Int, len: Int): Unit = ???

    /** Reads len longs (signed 64-bit integers) from the
     *  stream according to the current byte order, and
     *  stores them into l starting at index
     *  off.
     */
    @stub
    def readFully(l: Array[Long], off: Int, len: Int): Unit = ???

    /** Reads len shorts (signed 16-bit integers) from the
     *  stream according to the current byte order, and
     *  stores them into s starting at index
     *  off.
     */
    @stub
    def readFully(s: Array[Short], off: Int, len: Int): Unit = ???

    /** Reads 4 bytes from the stream, and (conceptually) concatenates
     *  them according to the current byte order and returns the result
     *  as an int.
     */
    @stub
    def readInt(): Int = ???

    /** Reads the next line of text from the input stream. */
    @stub
    def readLine(): String = ???

    /** Reads 8 bytes from the stream, and (conceptually) concatenates
     *  them according to the current byte order and returns the result
     *  as a long.
     */
    @stub
    def readLong(): Long = ???

    /** Reads two bytes from the stream, and (conceptually)
     *  concatenates them according to the current byte order, and
     *  returns the result as a short value.
     */
    @stub
    def readShort(): Short = ???

    /** Reads a byte from the stream, and (conceptually) converts it to
     *  an int, masks it with 0xff in order to strip off
     *  any sign-extension bits, and returns it as a byte
     *  value.
     */
    @stub
    def readUnsignedByte(): Int = ???

    /** Reads 4 bytes from the stream, and (conceptually) concatenates
     *  them according to the current byte order, converts the result
     *  to a long, masks it with 0xffffffffL in order to
     *  strip off any sign-extension bits, and returns the result as an
     *  unsigned long value.
     */
    @stub
    def readUnsignedInt(): Long = ???

    /** Reads two bytes from the stream, and (conceptually)
     *  concatenates them according to the current byte order, converts
     *  the resulting value to an int, masks it with
     *  0xffff in order to strip off any sign-extension
     *  buts, and returns the result as an unsigned int
     *  value.
     */
    @stub
    def readUnsignedShort(): Int = ???

    /** Reads in a string that has been encoded using a
     *  modified
     *  UTF-8
     *  format.
     */
    @stub
    def readUTF(): String = ???

    /** Returns the stream pointer to its previous position, including
     *  the bit offset, at the time of the most recent unmatched call
     *  to mark.
     */
    @stub
    def reset(): Unit = ???

    /** Sets the current stream position to the desired location. */
    @stub
    def seek(pos: Long): Unit = ???

    /** Sets the bit offset to an integer between 0 and 7, inclusive. */
    @stub
    def setBitOffset(bitOffset: Int): Unit = ???

    /** Sets the desired byte order for future reads of data values
     *  from this stream.
     */
    @stub
    def setByteOrder(byteOrder: ByteOrder): Unit = ???

    /** Moves the stream position forward by a given number of bytes. */
    @stub
    def skipBytes(n: Int): Int = ???

    /** Moves the stream position forward by a given number of bytes. */
    @stub
    def skipBytes(n: Long): Long = ???
}
