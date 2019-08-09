package java.util.zip

import java.io.{FilterInputStream, InputStream}
import java.lang.Object

// This class implements a stream filter for uncompressing data in the
// "deflate" compression format. It is also used as the basis for other
// decompression filters, such as GZIPInputStream.
class InflaterInputStream extends FilterInputStream {

    @stub
    // Creates a new input stream with a default decompressor and buffer size.
    def this(in: InputStream) = ???

    @stub
    // Creates a new input stream with the specified decompressor and a
    // default buffer size.
    def this(in: InputStream, inf: Inflater) = ???

    @stub
    // Input buffer for decompression.
    protected def buf: Array[Byte] = ???

    @stub
    // Decompressor for this stream.
    protected def inf: Inflater = ???

    @stub
    // Returns 0 after EOF has been reached, otherwise always return 1.
    def available(): Int = ???

    @stub
    // Closes this input stream and releases any system resources associated
    // with the stream.
    def close(): Unit = ???

    @stub
    // Fills input buffer with more data to decompress.
    protected def fill(): Unit = ???

    @stub
    // Marks the current position in this input stream.
    def mark(readlimit: Int): Unit = ???

    @stub
    // Tests if this input stream supports the mark and
    // reset methods.
    def markSupported(): Boolean = ???

    @stub
    // Reads a byte of uncompressed data.
    def read(): Int = ???

    @stub
    // Reads uncompressed data into an array of bytes.
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    @stub
    // Repositions this stream to the position at the time the
    // mark method was last called on this input stream.
    def reset(): Unit = ???
}
