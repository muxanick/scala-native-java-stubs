package java.util.zip

import java.io.{FilterInputStream, InputStream}
import java.lang.Object
import scala.scalanative.annotation.stub

/** This class implements a stream filter for reading compressed data in
 *  the GZIP file format.
 */
class GZIPInputStream extends InflaterInputStream {

    /** Creates a new input stream with a default buffer size. */
    @stub
    def this(in: InputStream) = ???

    /** Creates a new input stream with the specified buffer size. */
    @stub
    def this(in: InputStream, size: Int) = ???

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

    /** Reads uncompressed data into an array of bytes. */
    @stub
    def read(buf: Array[Byte], off: Int, len: Int): Int = ???
}

object GZIPInputStream {
    /** GZIP header magic number. */
    @stub
    val GZIP_MAGIC: Int = ???
}
