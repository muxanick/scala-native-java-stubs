package java.io

import java.lang.{CharSequence, Object, String, StringBuffer}
import scala.scalanative.annotation.stub

/** A character stream that collects its output in a string buffer, which can
 *  then be used to construct a string.
 *  
 *  Closing a StringWriter has no effect. The methods in this class
 *  can be called after the stream has been closed without generating an
 *  IOException.
 */
class StringWriter extends Writer {

    /** Create a new string writer using the default initial string-buffer
     *  size.
     */
    @stub
    def this() = ???

    /** Create a new string writer using the specified initial string-buffer
     *  size.
     */
    @stub
    def this(initialSize: Int) = ???

    /** Appends the specified character to this writer. */
    @stub
    def append(c: Char): StringWriter = ???

    /** Appends the specified character sequence to this writer. */
    @stub
    def append(csq: CharSequence): StringWriter = ???

    /** Appends a subsequence of the specified character sequence to this writer. */
    @stub
    def append(csq: CharSequence, start: Int, end: Int): StringWriter = ???

    /** Closing a StringWriter has no effect. */
    @stub
    def close(): Unit = ???

    /** Flush the stream. */
    @stub
    def flush(): Unit = ???

    /** Return the string buffer itself. */
    @stub
    def getBuffer(): StringBuffer = ???

    /** Return the buffer's current value as a string. */
    @stub
    def toString(): String = ???

    /** Write a portion of an array of characters. */
    @stub
    def write(cbuf: Array[Char], off: Int, len: Int): Unit = ???

    /** Write a single character. */
    @stub
    def write(c: Int): Unit = ???

    /** Write a string. */
    @stub
    def write(str: String): Unit = ???

    /** Write a portion of a string. */
    @stub
    def write(str: String, off: Int, len: Int): Unit = ???
}
