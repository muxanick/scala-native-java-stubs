package java.util.zip

import java.io.{FilterOutputStream, OutputStream}
import java.lang.Object

/** This class implements a stream filter for writing compressed data in
 *  the GZIP file format.
 */
class GZIPOutputStream extends DeflaterOutputStream {

    /** Creates a new output stream with a default buffer size. */
    @stub
    def this(out: OutputStream) = ???

    /** Creates a new output stream with a default buffer size and
     *  the specified flush mode.
     */
    @stub
    def this(out: OutputStream, syncFlush: Boolean) = ???

    /** Creates a new output stream with the specified buffer size. */
    @stub
    def this(out: OutputStream, size: Int) = ???

    /** Finishes writing compressed data to the output stream without closing
     *  the underlying stream.
     */
    @stub
    def finish(): Unit = ???
}
