package java.io

import java.lang.Object

// This abstract class is the superclass of all classes representing
// an input stream of bytes.
//
//  Applications that need to define a subclass of InputStream
// must always provide a method that returns the next byte of input.
abstract class InputStream extends Object with Closeable {

    // Returns an estimate of the number of bytes that can be read (or
    // skipped over) from this input stream without blocking by the next
    // invocation of a method for this input stream.
    def available(): Int

    // Closes this input stream and releases any system resources associated
    // with the stream.
    def close(): Unit

    // Marks the current position in this input stream.
    def mark(readlimit: Int): Unit

    // Tests if this input stream supports the mark and
    // reset methods.
    def markSupported(): Boolean

    // Reads the next byte of data from the input stream.
    def read(): Int

    // Reads some number of bytes from the input stream and stores them into
    // the buffer array b.
    def read(b: Array[Byte]): Int

    // Reads up to len bytes of data from the input stream into
    // an array of bytes.
    def read(b: Array[Byte], off: Int, len: Int): Int

    // Repositions this stream to the position at the time the
    // mark method was last called on this input stream.
    def reset(): Unit
}
