package javax.imageio.stream

import java.io.DataOutput
import java.lang.String

/** A seekable output stream interface for use by
 *  ImageWriters.  Various output destinations, such as
 *  OutputStreams and Files, as well as
 *  future fast I/O destinations may be "wrapped" by a suitable
 *  implementation of this interface for use by the Image I/O API.
 * 
 *   Unlike a standard OutputStream, ImageOutputStream
 *  extends its counterpart, ImageInputStream.  Thus it is
 *  possible to read from the stream as it is being written.  The same
 *  seek and flush positions apply to both reading and writing, although
 *  the semantics for dealing with a non-zero bit offset before a byte-aligned
 *  write are necessarily different from the semantics for dealing with
 *  a non-zero bit offset before a byte-aligned read.  When reading bytes,
 *  any bit offset is set to 0 before the read; when writing bytes, a
 *  non-zero bit offset causes the remaining bits in the byte to be written
 *  as 0s.  The byte-aligned write then starts at the next byte position.
 */
trait ImageOutputStream extends ImageInputStream with DataOutput {

    /** Flushes all data prior to the given position to the underlying
     *  destination, such as an OutputStream or
     *  File.
     */
    @stub
    def flushBefore(pos: Long): Unit = ???

    /** Writes a sequence of bytes to the stream at the current
     *  position.
     */
    @stub
    def write(b: Array[Byte]): Unit = ???

    /** Writes a sequence of bytes to the stream at the current
     *  position.
     */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Writes a single byte to the stream at the current position. */
    @stub
    def write(b: Int): Unit = ???

    /** Writes a single bit, given by the least significant bit of the
     *  argument, to the stream at the current bit offset within the
     *  current byte position.
     */
    @stub
    def writeBit(bit: Int): Unit = ???

    /** Writes a sequence of bits, given by the numBits
     *  least significant bits of the bits argument in
     *  left-to-right order, to the stream at the current bit offset
     *  within the current byte position.
     */
    @stub
    def writeBits(bits: Long, numBits: Int): Unit = ???

    /** Writes a boolean value to the stream. */
    @stub
    def writeBoolean(v: Boolean): Unit = ???

    /** Writes the 8 low-order bits of v to the
     *  stream.
     */
    @stub
    def writeByte(v: Int): Unit = ???

    /** Writes a string to the output stream. */
    @stub
    def writeBytes(s: String): Unit = ???

    /** This method is a synonym for writeShort. */
    @stub
    def writeChar(v: Int): Unit = ???

    /** Writes a sequence of chars to the stream at the current
     *  position.
     */
    @stub
    def writeChars(c: Array[Char], off: Int, len: Int): Unit = ???

    /** Writes a string to the output stream. */
    @stub
    def writeChars(s: String): Unit = ???

    /** Writes a double value, which is comprised of four
     *  bytes, to the output stream.
     */
    @stub
    def writeDouble(v: Double): Unit = ???

    /** Writes a sequence of doubles to the stream at the current
     *  position.
     */
    @stub
    def writeDoubles(d: Array[Double], off: Int, len: Int): Unit = ???

    /** Writes a float value, which is comprised of four
     *  bytes, to the output stream.
     */
    @stub
    def writeFloat(v: Float): Unit = ???

    /** Writes a sequence of floats to the stream at the current
     *  position.
     */
    @stub
    def writeFloats(f: Array[Float], off: Int, len: Int): Unit = ???

    /** Writes the 32 bits of v to the stream. */
    @stub
    def writeInt(v: Int): Unit = ???

    /** Writes a sequence of ints to the stream at the current
     *  position.
     */
    @stub
    def writeInts(i: Array[Int], off: Int, len: Int): Unit = ???

    /** Writes the 64 bits of v to the stream. */
    @stub
    def writeLong(v: Long): Unit = ???

    /** Writes a sequence of longs to the stream at the current
     *  position.
     */
    @stub
    def writeLongs(l: Array[Long], off: Int, len: Int): Unit = ???

    /** Writes the 16 low-order bits of v to the
     *  stream.
     */
    @stub
    def writeShort(v: Int): Unit = ???

    /** Writes a sequence of shorts to the stream at the current
     *  position.
     */
    @stub
    def writeShorts(s: Array[Short], off: Int, len: Int): Unit = ???
}
