package java.io

import java.lang.{CharSequence, Object, String}

// This class implements a character buffer that can be used as an Writer.
// The buffer automatically grows when data is written to the stream.  The data
// can be retrieved using toCharArray() and toString().
// 
// Note: Invoking close() on this class has no effect, and methods
// of this class can be called after the stream has closed
// without generating an IOException.
class CharArrayWriter extends Writer {

    @stub
    // Creates a new CharArrayWriter.
    def this() = ???

    @stub
    // The buffer where data is stored.
    protected def buf: Array[Char] = ???

    @stub
    // Appends the specified character to this writer.
    def append(c: Char): CharArrayWriter = ???

    @stub
    // Appends the specified character sequence to this writer.
    def append(csq: CharSequence): CharArrayWriter = ???

    @stub
    // Appends a subsequence of the specified character sequence to this writer.
    def append(csq: CharSequence, start: Int, end: Int): CharArrayWriter = ???

    @stub
    // Close the stream.
    def close(): Unit = ???

    @stub
    // Flush the stream.
    def flush(): Unit = ???

    @stub
    // Resets the buffer so that you can use it again without
    // throwing away the already allocated buffer.
    def reset(): Unit = ???

    @stub
    // Returns the current size of the buffer.
    def size(): Int = ???

    @stub
    // Returns a copy of the input data.
    def toCharArray(): Array[Char] = ???

    @stub
    // Converts input data to a string.
    def toString(): String = ???

    @stub
    // Writes characters to the buffer.
    def write(c: Array[Char], off: Int, len: Int): Unit = ???

    @stub
    // Writes a character to the buffer.
    def write(c: Int): Unit = ???

    @stub
    // Write a portion of a string to the buffer.
    def write(str: String, off: Int, len: Int): Unit = ???
}
