package javax.imageio.stream

import java.lang.{Object, String}
import java.nio.ByteOrder
import scala.scalanative.annotation.stub

/** An abstract class implementing the ImageInputStream interface.
 *  This class is designed to reduce the number of methods that must
 *  be implemented by subclasses.
 * 
 *   In particular, this class handles most or all of the details of
 *  byte order interpretation, buffering, mark/reset, discarding,
 *  closing, and disposing.
 */
abstract class ImageInputStreamImpl extends Object with ImageInputStream {

    /** Constructs an ImageInputStreamImpl. */
    @stub
    def this() = ???

    /** The current bit offset within the stream. */
    protected val bitOffset: Int

    /** The byte order of the stream as an instance of the enumeration
     *  class java.nio.ByteOrder, where
     *  ByteOrder.BIG_ENDIAN indicates network byte order
     *  and ByteOrder.LITTLE_ENDIAN indicates the reverse
     *  order.
     */
    protected val byteOrder: ByteOrder

    /** The position prior to which data may be discarded. */
    protected val flushedPos: Long

    /** The current read position within the stream. */
    protected val streamPos: Long

    /** Throws an IOException if the stream has been closed. */
    protected def checkClosed(): Unit

    /** Closes the stream. */
    def close(): Unit

    /** Finalizes this object prior to garbage collection. */
    protected def finalize(): Unit

    /** Discards the initial position of the stream prior to the current
     *  stream position.
     */
    def flush(): Unit

    /** Discards the initial portion of the stream prior to the
     *  indicated position.
     */
    def flushBefore(pos: Long): Unit

    /** Returns the current bit offset, as an integer between 0 and 7,
     *  inclusive.
     */
    def getBitOffset(): Int

    /** Returns the byte order with which data values will be read from
     *  this stream as an instance of the
     *  java.nio.ByteOrder enumeration.
     */
    def getByteOrder(): ByteOrder

    /** Returns the earliest position in the stream to which seeking
     *  may be performed.
     */
    def getFlushedPosition(): Long

    /** Returns the current byte position of the stream. */
    def getStreamPosition(): Long

    /** Default implementation returns false. */
    def isCached(): Boolean

    /** Default implementation returns false. */
    def isCachedFile(): Boolean

    /** Default implementation returns false. */
    def isCachedMemory(): Boolean

    /** Returns -1L to indicate that the stream has unknown
     *  length.
     */
    def length(): Long

    /** Pushes the current stream position onto a stack of marked
     *  positions.
     */
    def mark(): Unit

    /** Reads a single byte from the stream and returns it as an
     *  int between 0 and 255.
     */
    def read(): Int

    /** A convenience method that calls read(b, 0, b.length). */
    def read(b: Array[Byte]): Int

    /** Reads up to len bytes from the stream, and stores
     *  them into b starting at index off.
     */
    def read(b: Array[Byte], off: Int, len: Int): Int

    /** Reads a single bit from the stream and returns it as an
     *  int with the value 0 or
     *  1.
     */
    def readBit(): Int

    /** Reads a bitstring from the stream and returns it as a
     *  long, with the first bit read becoming the most
     *  significant bit of the output.
     */
    def readBits(numBits: Int): Long

    /** Reads a byte from the stream and returns a boolean
     *  value of true if it is nonzero, false
     *  if it is zero.
     */
    def readBoolean(): Boolean

    /** Reads a byte from the stream and returns it as a
     *  byte value.
     */
    def readByte(): Byte

    /** Reads up to len bytes from the stream, and
     *  modifies the supplied IIOByteBuffer to indicate
     *  the byte array, offset, and length where the data may be found.
     */
    def readBytes(buf: IIOByteBuffer, len: Int): Unit

    /** Equivalent to readUnsignedShort, except that the
     *  result is returned using the char datatype.
     */
    def readChar(): Char

    /** Reads 8 bytes from the stream, and (conceptually) concatenates
     *  them according to the current byte order and returns the result
     *  as a double.
     */
    def readDouble(): Double

    /** Reads 4 bytes from the stream, and (conceptually) concatenates
     *  them according to the current byte order and returns the result
     *  as a float.
     */
    def readFloat(): Float

    /** Reads b.length bytes from the stream, and stores them
     *  into b starting at index 0.
     */
    def readFully(b: Array[Byte]): Unit

    /** Reads len bytes from the stream, and stores them
     *  into b starting at index off.
     */
    def readFully(b: Array[Byte], off: Int, len: Int): Unit

    /** Reads len chars (unsigned 16-bit integers) from the
     *  stream according to the current byte order, and
     *  stores them into c starting at index
     *  off.
     */
    def readFully(c: Array[Char], off: Int, len: Int): Unit

    /** Reads len doubles (64-bit IEEE double-precision
     *  floats) from the stream according to the current byte order,
     *  and stores them into d starting at
     *  index off.
     */
    def readFully(d: Array[Double], off: Int, len: Int): Unit

    /** Reads len floats (32-bit IEEE single-precision
     *  floats) from the stream according to the current byte order,
     *  and stores them into f starting at
     *  index off.
     */
    def readFully(f: Array[Float], off: Int, len: Int): Unit

    /** Reads len ints (signed 32-bit integers) from the
     *  stream according to the current byte order, and
     *  stores them into i starting at index
     *  off.
     */
    def readFully(i: Array[Int], off: Int, len: Int): Unit

    /** Reads len longs (signed 64-bit integers) from the
     *  stream according to the current byte order, and
     *  stores them into l starting at index
     *  off.
     */
    def readFully(l: Array[Long], off: Int, len: Int): Unit

    /** Reads len shorts (signed 16-bit integers) from the
     *  stream according to the current byte order, and
     *  stores them into s starting at index
     *  off.
     */
    def readFully(s: Array[Short], off: Int, len: Int): Unit

    /** Reads 4 bytes from the stream, and (conceptually) concatenates
     *  them according to the current byte order and returns the result
     *  as an int.
     */
    def readInt(): Int

    /** Reads the next line of text from the input stream. */
    def readLine(): String

    /** Reads 8 bytes from the stream, and (conceptually) concatenates
     *  them according to the current byte order and returns the result
     *  as a long.
     */
    def readLong(): Long

    /** Reads two bytes from the stream, and (conceptually)
     *  concatenates them according to the current byte order, and
     *  returns the result as a short value.
     */
    def readShort(): Short

    /** Reads a byte from the stream, and (conceptually) converts it to
     *  an int, masks it with 0xff in order to strip off
     *  any sign-extension bits, and returns it as a byte
     *  value.
     */
    def readUnsignedByte(): Int

    /** Reads 4 bytes from the stream, and (conceptually) concatenates
     *  them according to the current byte order, converts the result
     *  to a long, masks it with 0xffffffffL in order to
     *  strip off any sign-extension bits, and returns the result as an
     *  unsigned long value.
     */
    def readUnsignedInt(): Long

    /** Reads two bytes from the stream, and (conceptually)
     *  concatenates them according to the current byte order, converts
     *  the resulting value to an int, masks it with
     *  0xffff in order to strip off any sign-extension
     *  buts, and returns the result as an unsigned int
     *  value.
     */
    def readUnsignedShort(): Int

    /** Reads in a string that has been encoded using a
     *  modified
     *  UTF-8
     *  format.
     */
    def readUTF(): String

    /** Resets the current stream byte and bit positions from the stack
     *  of marked positions.
     */
    def reset(): Unit

    /** Sets the current stream position to the desired location. */
    def seek(pos: Long): Unit

    /** Sets the bit offset to an integer between 0 and 7, inclusive. */
    def setBitOffset(bitOffset: Int): Unit

    /** Sets the desired byte order for future reads of data values
     *  from this stream.
     */
    def setByteOrder(byteOrder: ByteOrder): Unit

    /** Advances the current stream position by calling
     *  seek(getStreamPosition() + n).
     */
    def skipBytes(n: Int): Int

    /** Advances the current stream position by calling
     *  seek(getStreamPosition() + n).
     */
    def skipBytes(n: Long): Long
}
