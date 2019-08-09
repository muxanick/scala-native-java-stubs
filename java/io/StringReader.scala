package java.io

import java.lang.Object

// A character stream whose source is a string.
class StringReader extends Reader {

    @stub
    // Closes the stream and releases any system resources associated with
    // it.
    def close(): Unit = ???

    @stub
    // Marks the present position in the stream.
    def mark(readAheadLimit: Int): Unit = ???

    @stub
    // Tells whether this stream supports the mark() operation, which it does.
    def markSupported(): Boolean = ???

    @stub
    // Reads a single character.
    def read(): Int = ???

    @stub
    // Reads characters into a portion of an array.
    def read(cbuf: Array[Char], off: Int, len: Int): Int = ???

    @stub
    // Tells whether this stream is ready to be read.
    def ready(): Boolean = ???

    @stub
    // Resets the stream to the most recent mark, or to the beginning of the
    // string if it has never been marked.
    def reset(): Unit = ???
}
