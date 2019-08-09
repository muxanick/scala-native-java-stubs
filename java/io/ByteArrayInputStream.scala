package java.io

import java.lang.Object
import scala.scalanative.annotation.stub

/** A ByteArrayInputStream contains
 *  an internal buffer that contains bytes that
 *  may be read from the stream. An internal
 *  counter keeps track of the next byte to
 *  be supplied by the read method.
 *  
 *  Closing a ByteArrayInputStream has no effect. The methods in
 *  this class can be called after the stream has been closed without
 *  generating an IOException.
 */
class ByteArrayInputStream extends InputStream {

    /** Creates a ByteArrayInputStream
     *  so that it  uses buf as its
     *  buffer array.
     */
    @stub
    def this(buf: Array[Byte]) = ???

    /** Creates ByteArrayInputStream
     *  that uses buf as its
     *  buffer array.
     */
    @stub
    def this(buf: Array[Byte], offset: Int, length: Int) = ???

    /** An array of bytes that was provided
     *  by the creator of the stream.
     */
    @stub
    protected val buf: Array[Byte] = ???

    /** The index one greater than the last valid character in the input
     *  stream buffer.
     */
    @stub
    protected val count: Int = ???

    /** The currently marked position in the stream. */
    @stub
    protected val mark: Int = ???

    /** The index of the next character to read from the input stream buffer. */
    @stub
    protected val pos: Int = ???

    /** Returns the number of remaining bytes that can be read (or skipped over)
     *  from this input stream.
     */
    @stub
    def available(): Int = ???

    /** Closing a ByteArrayInputStream has no effect. */
    @stub
    def close(): Unit = ???

    /** Set the current marked position in the stream. */
    @stub
    def mark(readAheadLimit: Int): Unit = ???

    /** Tests if this InputStream supports mark/reset. */
    @stub
    def markSupported(): Boolean = ???

    /** Reads the next byte of data from this input stream. */
    @stub
    def read(): Int = ???

    /** Reads up to len bytes of data into an array of bytes
     *  from this input stream.
     */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    /** Resets the buffer to the marked position. */
    @stub
    def reset(): Unit = ???

    /** Skips n bytes of input from this input stream. */
    @stub
    def skip(n: Long): Long = ???
}
