package java.io

import java.lang.Object

/** This class implements a character buffer that can be used as a
 *  character-input stream.
 */
class CharArrayReader extends Reader {

    /** Creates a CharArrayReader from the specified array of chars. */
    @stub
    def this(buf: Array[Char]) = ???

    /** The character buffer. */
    @stub
    protected val buf: Array[Char] = ???

    /** The index of the end of this buffer. */
    @stub
    protected val count: Int = ???

    /** The position of mark in buffer. */
    @stub
    protected val markedPos: Int = ???

    /** Closes the stream and releases any system resources associated with
     *  it.
     */
    @stub
    def close(): Unit = ???

    /** Marks the present position in the stream. */
    @stub
    def mark(readAheadLimit: Int): Unit = ???

    /** Tells whether this stream supports the mark() operation, which it does. */
    @stub
    def markSupported(): Boolean = ???

    /** Reads a single character. */
    @stub
    def read(): Int = ???

    /** Reads characters into a portion of an array. */
    @stub
    def read(b: Array[Char], off: Int, len: Int): Int = ???

    /** Tells whether this stream is ready to be read. */
    @stub
    def ready(): Boolean = ???

    /** Resets the stream to the most recent mark, or to the beginning if it has
     *  never been marked.
     */
    @stub
    def reset(): Unit = ???
}
