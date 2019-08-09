package java.io

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A character stream whose source is a string. */
class StringReader extends Reader {

    /** Creates a new string reader. */
    @stub
    def this(s: String) = ???

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
    def read(cbuf: Array[Char], off: Int, len: Int): Int = ???

    /** Tells whether this stream is ready to be read. */
    @stub
    def ready(): Boolean = ???

    /** Resets the stream to the most recent mark, or to the beginning of the
     *  string if it has never been marked.
     */
    @stub
    def reset(): Unit = ???

    /** Skips the specified number of characters in the stream. */
    @stub
    def skip(ns: Long): Long = ???
}
