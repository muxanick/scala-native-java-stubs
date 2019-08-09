package java.util.zip

import java.io.{FilterInputStream, InputStream}
import java.lang.Object

/** This class implements a stream filter for uncompressing data in the
 *  "deflate" compression format. It is also used as the basis for other
 *  decompression filters, such as GZIPInputStream.
 */
class InflaterInputStream extends FilterInputStream {

    /** Creates a new input stream with a default decompressor and buffer size. */
    @stub
    def this(in: InputStream) = ???

    /** Creates a new input stream with the specified decompressor and a
     *  default buffer size.
     */
    @stub
    def this(in: InputStream, inf: Inflater) = ???

    /** Input buffer for decompression. */
    @stub
    protected val buf: Array[Byte] = ???

    /** Decompressor for this stream. */
    @stub
    protected val inf: Inflater = ???

    /** Returns 0 after EOF has been reached, otherwise always return 1. */
    @stub
    def available(): Int = ???

    /** Closes this input stream and releases any system resources associated
     *  with the stream.
     */
    @stub
    def close(): Unit = ???

    /** Fills input buffer with more data to decompress. */
    @stub
    protected def fill(): Unit = ???

    /** Marks the current position in this input stream. */
    @stub
    def mark(readlimit: Int): Unit = ???

    /** Tests if this input stream supports the mark and
     *  reset methods.
     */
    @stub
    def markSupported(): Boolean = ???

    /** Reads a byte of uncompressed data. */
    @stub
    def read(): Int = ???

    /** Reads uncompressed data into an array of bytes. */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    /** Repositions this stream to the position at the time the
     *  mark method was last called on this input stream.
     */
    @stub
    def reset(): Unit = ???
}
