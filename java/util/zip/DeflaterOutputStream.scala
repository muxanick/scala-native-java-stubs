package java.util.zip

import java.io.{FilterOutputStream, OutputStream}
import java.lang.Object

// This class implements an output stream filter for compressing data in
// the "deflate" compression format. It is also used as the basis for other
// types of compression filters, such as GZIPOutputStream.
class DeflaterOutputStream extends FilterOutputStream {

    @stub
    // Creates a new output stream with a default compressor and buffer size.
    def this(out: OutputStream) = ???

    @stub
    // Creates a new output stream with a default compressor, a default
    // buffer size and the specified flush mode.
    def this(out: OutputStream, syncFlush: Boolean) = ???

    @stub
    // Creates a new output stream with the specified compressor and
    // a default buffer size.
    def this(out: OutputStream, def: Deflater) = ???

    @stub
    // Creates a new output stream with the specified compressor, flush
    // mode and a default buffer size.
    def this(out: OutputStream, def: Deflater, syncFlush: Boolean) = ???

    @stub
    // Creates a new output stream with the specified compressor and
    // buffer size.
    def this(out: OutputStream, def: Deflater, size: Int) = ???

    @stub
    // Output buffer for writing compressed data.
    protected def buf: Array[Byte] = ???

    @stub
    // Writes remaining compressed data to the output stream and closes the
    // underlying stream.
    def close(): Unit = ???

    @stub
    // Writes next block of compressed data to the output stream.
    protected def deflate(): Unit = ???

    @stub
    // Finishes writing compressed data to the output stream without closing
    // the underlying stream.
    def finish(): Unit = ???

    @stub
    // Flushes the compressed output stream.
    def flush(): Unit = ???

    @stub
    // Writes an array of bytes to the compressed output stream.
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???
}
