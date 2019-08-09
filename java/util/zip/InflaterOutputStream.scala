package java.util.zip

import java.io.{FilterOutputStream, OutputStream}
import java.lang.Object

/** Implements an output stream filter for uncompressing data stored in the
 *  "deflate" compression format.
 */
class InflaterOutputStream extends FilterOutputStream {

    /** Creates a new output stream with a default decompressor and buffer
     *  size.
     */
    @stub
    def this(out: OutputStream) = ???

    /** Creates a new output stream with the specified decompressor and a
     *  default buffer size.
     */
    @stub
    def this(out: OutputStream, infl: Inflater) = ???

    /** Output buffer for writing uncompressed data. */
    @stub
    protected val buf: Array[Byte] = ???

    /** Writes any remaining uncompressed data to the output stream and closes
     *  the underlying output stream.
     */
    @stub
    def close(): Unit = ???

    /** Finishes writing uncompressed data to the output stream without closing
     *  the underlying stream.
     */
    @stub
    def finish(): Unit = ???

    /** Flushes this output stream, forcing any pending buffered output bytes to be
     *  written.
     */
    @stub
    def flush(): Unit = ???

    /** Writes an array of bytes to the uncompressed output stream. */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???
}
