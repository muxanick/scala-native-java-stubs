package java.io

import java.lang.Object

// A FilterInputStream contains
// some other input stream, which it uses as
// its  basic source of data, possibly transforming
// the data along the way or providing  additional
// functionality. The class FilterInputStream
// itself simply overrides all  methods of
// InputStream with versions that
// pass all requests to the contained  input
// stream. Subclasses of FilterInputStream
// may further override some of  these methods
// and may also provide additional methods
// and fields.
class FilterInputStream extends InputStream {

    @stub
    // Returns an estimate of the number of bytes that can be read (or
    // skipped over) from this input stream without blocking by the next
    // caller of a method for this input stream.
    def available(): Int = ???

    @stub
    // Closes this input stream and releases any system resources
    // associated with the stream.
    def close(): Unit = ???

    @stub
    // Marks the current position in this input stream.
    def mark(readlimit: Int): Unit = ???

    @stub
    // Tests if this input stream supports the mark
    // and reset methods.
    def markSupported(): Boolean = ???

    @stub
    // Reads the next byte of data from this input stream.
    def read(): Int = ???

    @stub
    // Reads up to byte.length bytes of data from this
    // input stream into an array of bytes.
    def read(b: Array[Byte]): Int = ???

    @stub
    // Reads up to len bytes of data from this input stream
    // into an array of bytes.
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    @stub
    // Repositions this stream to the position at the time the
    // mark method was last called on this input stream.
    def reset(): Unit = ???
}
