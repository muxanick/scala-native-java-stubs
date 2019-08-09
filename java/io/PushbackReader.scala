package java.io

import java.lang.Object
import scala.scalanative.annotation.stub

/** A character-stream reader that allows characters to be pushed back into the
 *  stream.
 */
class PushbackReader extends FilterReader {

    /** Creates a new pushback reader with a one-character pushback buffer. */
    @stub
    def this(in: Reader) = ???

    /** Creates a new pushback reader with a pushback buffer of the given size. */
    @stub
    def this(in: Reader, size: Int) = ???

    /** Closes the stream and releases any system resources associated with
     *  it.
     */
    @stub
    def close(): Unit = ???

    /** Marks the present position in the stream. */
    @stub
    def mark(readAheadLimit: Int): Unit = ???

    /** Tells whether this stream supports the mark() operation, which it does
     *  not.
     */
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

    /** Resets the stream. */
    @stub
    def reset(): Unit = ???

    /** Skips characters. */
    @stub
    def skip(n: Long): Long = ???

    /** Pushes back an array of characters by copying it to the front of the
     *  pushback buffer.
     */
    @stub
    def unread(cbuf: Array[Char]): Unit = ???

    /** Pushes back a portion of an array of characters by copying it to the
     *  front of the pushback buffer.
     */
    @stub
    def unread(cbuf: Array[Char], off: Int, len: Int): Unit = ???

    /** Pushes back a single character by copying it to the front of the
     *  pushback buffer.
     */
    @stub
    def unread(c: Int): Unit = ???
}
