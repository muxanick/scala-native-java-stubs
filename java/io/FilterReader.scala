package java.io

import java.lang.Object

// Abstract class for reading filtered character streams.
// The abstract class FilterReader itself
// provides default methods that pass all requests to
// the contained stream. Subclasses of FilterReader
// should override some of these methods and may also provide
// additional methods and fields.
abstract class FilterReader extends Reader {

    // Closes the stream and releases any system resources associated with
    // it.
    def close(): Unit

    // Marks the present position in the stream.
    def mark(readAheadLimit: Int): Unit

    // Tells whether this stream supports the mark() operation.
    def markSupported(): Boolean

    // Reads a single character.
    def read(): Int

    // Reads characters into a portion of an array.
    def read(cbuf: Array[Char], off: Int, len: Int): Int

    // Tells whether this stream is ready to be read.
    def ready(): Boolean

    // Resets the stream.
    def reset(): Unit
}
