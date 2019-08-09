package java.io

import java.lang.{Appendable, CharSequence, Object, String}

/** Abstract class for writing to character streams.  The only methods that a
 *  subclass must implement are write(char[], int, int), flush(), and close().
 *  Most subclasses, however, will override some of the methods defined here in
 *  order to provide higher efficiency, additional functionality, or both.
 */
abstract class Writer extends Object with Appendable with Closeable with Flushable {

    /** Creates a new character-stream writer whose critical sections will
     *  synchronize on the writer itself.
     */
    @stub
    protected def this() = ???

    /** Appends the specified character to this writer. */
    def append(c: Char): Writer

    /** Appends the specified character sequence to this writer. */
    def append(csq: CharSequence): Writer

    /** Appends a subsequence of the specified character sequence to this writer. */
    def append(csq: CharSequence, start: Int, end: Int): Writer

    /** Closes the stream, flushing it first. */
    def close(): Unit

    /** Flushes the stream. */
    def flush(): Unit

    /** Writes an array of characters. */
    def write(cbuf: Array[Char]): Unit

    /** Writes a portion of an array of characters. */
    def write(cbuf: Array[Char], off: Int, len: Int): Unit

    /** Writes a single character. */
    def write(c: Int): Unit

    /** Writes a string. */
    def write(str: String): Unit
}
