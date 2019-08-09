package java.util.zip

import java.io.{FilterOutputStream, OutputStream}
import java.lang.Object
import scala.scalanative.annotation.stub

/** This class implements an output stream filter for compressing data in
 *  the "deflate" compression format. It is also used as the basis for other
 *  types of compression filters, such as GZIPOutputStream.
 */
class DeflaterOutputStream extends FilterOutputStream {

    /** Creates a new output stream with a default compressor and buffer size. */
    @stub
    def this(out: OutputStream) = ???

    /** Creates a new output stream with a default compressor, a default
     *  buffer size and the specified flush mode.
     */
    @stub
    def this(out: OutputStream, syncFlush: Boolean) = ???

    /** Creates a new output stream with the specified compressor and
     *  a default buffer size.
     */
    @stub
    def this(out: OutputStream, def: Deflater) = ???

    /** Creates a new output stream with the specified compressor, flush
     *  mode and a default buffer size.
     */
    @stub
    def this(out: OutputStream, def: Deflater, syncFlush: Boolean) = ???

    /** Creates a new output stream with the specified compressor and
     *  buffer size.
     */
    @stub
    def this(out: OutputStream, def: Deflater, size: Int) = ???

    /** Creates a new output stream with the specified compressor,
     *  buffer size and flush mode.
     */
    @stub
    def this(out: OutputStream, def: Deflater, size: Int, syncFlush: Boolean) = ???

    /** Output buffer for writing compressed data. */
    @stub
    protected val buf: Array[Byte] = ???

    /** Compressor for this stream. */
    @stub
    protected val def: Deflater = ???

    /** Writes remaining compressed data to the output stream and closes the
     *  underlying stream.
     */
    @stub
    def close(): Unit = ???

    /** Writes next block of compressed data to the output stream. */
    @stub
    protected def deflate(): Unit = ???

    /** Finishes writing compressed data to the output stream without closing
     *  the underlying stream.
     */
    @stub
    def finish(): Unit = ???

    /** Flushes the compressed output stream. */
    @stub
    def flush(): Unit = ???

    /** Writes an array of bytes to the compressed output stream. */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Writes a byte to the compressed output stream. */
    @stub
    def write(b: Int): Unit = ???
}
