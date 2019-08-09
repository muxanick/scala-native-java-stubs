package java.io

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Abstract class for writing filtered character streams.
 *  The abstract class FilterWriter itself
 *  provides default methods that pass all requests to the
 *  contained stream. Subclasses of FilterWriter
 *  should override some of these methods and may also
 *  provide additional methods and fields.
 */
abstract class FilterWriter extends Writer {

    /** Create a new filtered writer. */
    @stub
    protected def this(out: Writer) = ???

    /** The underlying character-output stream. */
    protected val out: Writer

    /** Closes the stream, flushing it first. */
    def close(): Unit

    /** Flushes the stream. */
    def flush(): Unit

    /** Writes a portion of an array of characters. */
    def write(cbuf: Array[Char], off: Int, len: Int): Unit

    /** Writes a single character. */
    def write(c: Int): Unit

    /** Writes a portion of a string. */
    def write(str: String, off: Int, len: Int): Unit
}
