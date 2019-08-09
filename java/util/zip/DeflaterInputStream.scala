package java.util.zip

import java.io.{FilterInputStream, InputStream}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Implements an input stream filter for compressing data in the "deflate"
 *  compression format.
 */
class DeflaterInputStream extends FilterInputStream {

    /** Creates a new input stream with a default compressor and buffer
     *  size.
     */
    @stub
    def this(in: InputStream) = ???

    /** Creates a new input stream with the specified compressor and a
     *  default buffer size.
     */
    @stub
    def this(in: InputStream, defl: Deflater) = ???

    /** Creates a new input stream with the specified compressor and buffer
     *  size.
     */
    @stub
    def this(in: InputStream, defl: Deflater, bufLen: Int) = ???

    /** Input buffer for reading compressed data. */
    @stub
    protected val buf: Array[Byte] = ???

    /** Compressor for this stream. */
    @stub
    protected val def: Deflater = ???

    /** Returns 0 after EOF has been reached, otherwise always return 1. */
    @stub
    def available(): Int = ???

    /** Closes this input stream and its underlying input stream, discarding
     *  any pending uncompressed data.
     */
    @stub
    def close(): Unit = ???

    /** This operation is not supported. */
    @stub
    def mark(limit: Int): Unit = ???

    /** Always returns false because this input stream does not support
     *  the mark() and reset() methods.
     */
    @stub
    def markSupported(): Boolean = ???

    /** Reads a single byte of compressed data from the input stream. */
    @stub
    def read(): Int = ???

    /** Reads compressed data into a byte array. */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    /** This operation is not supported. */
    @stub
    def reset(): Unit = ???

    /** Skips over and discards data from the input stream. */
    @stub
    def skip(n: Long): Long = ???
}
