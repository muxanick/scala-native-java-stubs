package java.io

import java.lang.{CharSequence, Object, String}

/** This class implements a character buffer that can be used as an Writer.
 *  The buffer automatically grows when data is written to the stream.  The data
 *  can be retrieved using toCharArray() and toString().
 *  
 *  Note: Invoking close() on this class has no effect, and methods
 *  of this class can be called after the stream has closed
 *  without generating an IOException.
 */
class CharArrayWriter extends Writer {

    /** Creates a new CharArrayWriter. */
    @stub
    def this() = ???

    /** The buffer where data is stored. */
    @stub
    protected val buf: Array[Char] = ???

    /** Appends the specified character to this writer. */
    @stub
    def append(c: Char): CharArrayWriter = ???

    /** Appends the specified character sequence to this writer. */
    @stub
    def append(csq: CharSequence): CharArrayWriter = ???

    /** Appends a subsequence of the specified character sequence to this writer. */
    @stub
    def append(csq: CharSequence, start: Int, end: Int): CharArrayWriter = ???

    /** Close the stream. */
    @stub
    def close(): Unit = ???

    /** Flush the stream. */
    @stub
    def flush(): Unit = ???

    /** Resets the buffer so that you can use it again without
     *  throwing away the already allocated buffer.
     */
    @stub
    def reset(): Unit = ???

    /** Returns the current size of the buffer. */
    @stub
    def size(): Int = ???

    /** Returns a copy of the input data. */
    @stub
    def toCharArray(): Array[Char] = ???

    /** Converts input data to a string. */
    @stub
    def toString(): String = ???

    /** Writes characters to the buffer. */
    @stub
    def write(c: Array[Char], off: Int, len: Int): Unit = ???

    /** Writes a character to the buffer. */
    @stub
    def write(c: Int): Unit = ???

    /** Write a portion of a string to the buffer. */
    @stub
    def write(str: String, off: Int, len: Int): Unit = ???
}
