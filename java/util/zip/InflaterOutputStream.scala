package java.util.zip

import java.io.{FilterOutputStream, OutputStream}
import java.lang.Object

// Implements an output stream filter for uncompressing data stored in the
// "deflate" compression format.
class InflaterOutputStream extends FilterOutputStream {

    @stub
    // Creates a new output stream with a default decompressor and buffer
    // size.
    def this(out: OutputStream) = ???

    @stub
    // Creates a new output stream with the specified decompressor and a
    // default buffer size.
    def this(out: OutputStream, infl: Inflater) = ???

    @stub
    // Output buffer for writing uncompressed data.
    protected def buf: Array[Byte] = ???

    @stub
    // Writes any remaining uncompressed data to the output stream and closes
    // the underlying output stream.
    def close(): Unit = ???

    @stub
    // Finishes writing uncompressed data to the output stream without closing
    // the underlying stream.
    def finish(): Unit = ???

    @stub
    // Flushes this output stream, forcing any pending buffered output bytes to be
    // written.
    def flush(): Unit = ???

    @stub
    // Writes an array of bytes to the uncompressed output stream.
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???
}
