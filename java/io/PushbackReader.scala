package java.io

import java.lang.Object

// A character-stream reader that allows characters to be pushed back into the
// stream.
class PushbackReader extends FilterReader {

    @stub
    // Creates a new pushback reader with a one-character pushback buffer.
    def this(in: Reader) = ???

    @stub
    // Closes the stream and releases any system resources associated with
    // it.
    def close(): Unit = ???

    @stub
    // Marks the present position in the stream.
    def mark(readAheadLimit: Int): Unit = ???

    @stub
    // Tells whether this stream supports the mark() operation, which it does
    // not.
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
    // Resets the stream.
    def reset(): Unit = ???

    @stub
    // Skips characters.
    def skip(n: Long): Long = ???

    @stub
    // Pushes back an array of characters by copying it to the front of the
    // pushback buffer.
    def unread(cbuf: Array[Char]): Unit = ???

    @stub
    // Pushes back a portion of an array of characters by copying it to the
    // front of the pushback buffer.
    def unread(cbuf: Array[Char], off: Int, len: Int): Unit = ???
}
