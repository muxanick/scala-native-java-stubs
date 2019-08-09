package java.util.zip

import java.io.{FilterInputStream, InputStream}
import java.lang.Object

/** This class implements a stream filter for reading compressed data in
 *  the GZIP file format.
 */
class GZIPInputStream extends InflaterInputStream {

    /** Creates a new input stream with a default buffer size. */
    @stub
    def this(in: InputStream) = ???

    /** CRC-32 for uncompressed data. */
    @stub
    protected val crc: CRC32 = ???

    /** Indicates end of input stream. */
    @stub
    protected val eos: Boolean = ???

    /** Closes this input stream and releases any system resources associated
     *  with the stream.
     */
    @stub
    def close(): Unit = ???
}
