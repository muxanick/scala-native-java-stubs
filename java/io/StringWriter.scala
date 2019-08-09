package java.io

import java.lang.{CharSequence, Object, String, StringBuffer}

// A character stream that collects its output in a string buffer, which can
// then be used to construct a string.
// 
// Closing a StringWriter has no effect. The methods in this class
// can be called after the stream has been closed without generating an
// IOException.
class StringWriter extends Writer {

    @stub
    // Create a new string writer using the default initial string-buffer
    // size.
    def this() = ???

    @stub
    // Appends the specified character to this writer.
    def append(c: Char): StringWriter = ???

    @stub
    // Appends the specified character sequence to this writer.
    def append(csq: CharSequence): StringWriter = ???

    @stub
    // Appends a subsequence of the specified character sequence to this writer.
    def append(csq: CharSequence, start: Int, end: Int): StringWriter = ???

    @stub
    // Closing a StringWriter has no effect.
    def close(): Unit = ???

    @stub
    // Flush the stream.
    def flush(): Unit = ???

    @stub
    // Return the string buffer itself.
    def getBuffer(): StringBuffer = ???

    @stub
    // Return the buffer's current value as a string.
    def toString(): String = ???

    @stub
    // Write a portion of an array of characters.
    def write(cbuf: Array[Char], off: Int, len: Int): Unit = ???

    @stub
    // Write a single character.
    def write(c: Int): Unit = ???

    @stub
    // Write a string.
    def write(str: String): Unit = ???
}
