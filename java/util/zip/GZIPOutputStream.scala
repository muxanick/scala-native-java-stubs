package java.util.zip

import java.io.{FilterOutputStream, OutputStream}
import java.lang.Object

// This class implements a stream filter for writing compressed data in
// the GZIP file format.
class GZIPOutputStream extends DeflaterOutputStream {

    @stub
    // Creates a new output stream with a default buffer size.
    def this(out: OutputStream) = ???

    @stub
    // Creates a new output stream with a default buffer size and
    // the specified flush mode.
    def this(out: OutputStream, syncFlush: Boolean) = ???

    @stub
    // Creates a new output stream with the specified buffer size.
    def this(out: OutputStream, size: Int) = ???

    @stub
    // Finishes writing compressed data to the output stream without closing
    // the underlying stream.
    def finish(): Unit = ???
}
