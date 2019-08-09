package java.io

import java.lang.Object

// A ByteArrayInputStream contains
// an internal buffer that contains bytes that
// may be read from the stream. An internal
// counter keeps track of the next byte to
// be supplied by the read method.
// 
// Closing a ByteArrayInputStream has no effect. The methods in
// this class can be called after the stream has been closed without
// generating an IOException.
class ByteArrayInputStream extends InputStream {

    @stub
    // Creates a ByteArrayInputStream
    // so that it  uses buf as its
    // buffer array.
    def this(buf: Array[Byte]) = ???

    @stub
    // An array of bytes that was provided
    // by the creator of the stream.
    protected def buf: Array[Byte] = ???

    @stub
    // The index one greater than the last valid character in the input
    // stream buffer.
    protected def count: Int = ???

    @stub
    // The currently marked position in the stream.
    protected def mark: Int = ???

    @stub
    // Returns the number of remaining bytes that can be read (or skipped over)
    // from this input stream.
    def available(): Int = ???

    @stub
    // Closing a ByteArrayInputStream has no effect.
    def close(): Unit = ???

    @stub
    // Set the current marked position in the stream.
    def mark(readAheadLimit: Int): Unit = ???

    @stub
    // Tests if this InputStream supports mark/reset.
    def markSupported(): Boolean = ???

    @stub
    // Reads the next byte of data from this input stream.
    def read(): Int = ???

    @stub
    // Reads up to len bytes of data into an array of bytes
    // from this input stream.
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    @stub
    // Resets the buffer to the marked position.
    def reset(): Unit = ???
}
