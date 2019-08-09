package java.util.zip

import java.io.{FilterInputStream, InputStream}
import java.lang.Object

// Implements an input stream filter for compressing data in the "deflate"
// compression format.
class DeflaterInputStream extends FilterInputStream {

    @stub
    // Creates a new input stream with a default compressor and buffer
    // size.
    def this(in: InputStream) = ???

    @stub
    // Creates a new input stream with the specified compressor and a
    // default buffer size.
    def this(in: InputStream, defl: Deflater) = ???

    @stub
    // Input buffer for reading compressed data.
    protected def buf: Array[Byte] = ???

    @stub
    // Returns 0 after EOF has been reached, otherwise always return 1.
    def available(): Int = ???

    @stub
    // Closes this input stream and its underlying input stream, discarding
    // any pending uncompressed data.
    def close(): Unit = ???

    @stub
    // This operation is not supported.
    def mark(limit: Int): Unit = ???

    @stub
    // Always returns false because this input stream does not support
    // the mark() and reset() methods.
    def markSupported(): Boolean = ???

    @stub
    // Reads a single byte of compressed data from the input stream.
    def read(): Int = ???

    @stub
    // Reads compressed data into a byte array.
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    @stub
    // This operation is not supported.
    def reset(): Unit = ???
}
