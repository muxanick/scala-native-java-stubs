package java.io

import java.lang.{Object, Readable}
import java.nio.CharBuffer
import scala.scalanative.annotation.stub

/** Abstract class for reading character streams.  The only methods that a
 *  subclass must implement are read(char[], int, int) and close().  Most
 *  subclasses, however, will override some of the methods defined here in order
 *  to provide higher efficiency, additional functionality, or both.
 */
abstract class Reader extends Object with Readable with Closeable {

    /** Creates a new character-stream reader whose critical sections will
     *  synchronize on the reader itself.
     */
    @stub
    protected def this() = ???

    /** Creates a new character-stream reader whose critical sections will
     *  synchronize on the given object.
     */
    @stub
    protected def this(lock: Any) = ???

    /** The object used to synchronize operations on this stream. */
    protected val lock: Any

    /** Closes the stream and releases any system resources associated with
     *  it.
     */
    def close(): Unit

    /** Marks the present position in the stream. */
    def mark(readAheadLimit: Int): Unit

    /** Tells whether this stream supports the mark() operation. */
    def markSupported(): Boolean

    /** Reads a single character. */
    def read(): Int

    /** Reads characters into an array. */
    def read(cbuf: Array[Char]): Int

    /** Reads characters into a portion of an array. */
    def read(cbuf: Array[Char], off: Int, len: Int): Int

    /** Attempts to read characters into the specified character buffer. */
    def read(target: CharBuffer): Int

    /** Tells whether this stream is ready to be read. */
    def ready(): Boolean

    /** Resets the stream. */
    def reset(): Unit

    /** Skips characters. */
    def skip(n: Long): Long
}
