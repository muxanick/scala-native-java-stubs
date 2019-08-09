package java.io

import java.lang.Object

// This class implements a character buffer that can be used as a
// character-input stream.
class CharArrayReader extends Reader {

    @stub
    // Creates a CharArrayReader from the specified array of chars.
    def this(buf: Array[Char]) = ???

    @stub
    // The character buffer.
    protected def buf: Array[Char] = ???

    @stub
    // The index of the end of this buffer.
    protected def count: Int = ???

    @stub
    // The position of mark in buffer.
    protected def markedPos: Int = ???

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
    def read(b: Array[Char], off: Int, len: Int): Int = ???

    @stub
    // Tells whether this stream is ready to be read.
    def ready(): Boolean = ???

    @stub
    // Resets the stream to the most recent mark, or to the beginning if it has
    // never been marked.
    def reset(): Unit = ???
}
