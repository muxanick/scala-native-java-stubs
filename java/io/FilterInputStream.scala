package java.io

import java.lang.Object

/** A FilterInputStream contains
 *  some other input stream, which it uses as
 *  its  basic source of data, possibly transforming
 *  the data along the way or providing  additional
 *  functionality. The class FilterInputStream
 *  itself simply overrides all  methods of
 *  InputStream with versions that
 *  pass all requests to the contained  input
 *  stream. Subclasses of FilterInputStream
 *  may further override some of  these methods
 *  and may also provide additional methods
 *  and fields.
 */
class FilterInputStream extends InputStream {

    /** Returns an estimate of the number of bytes that can be read (or
     *  skipped over) from this input stream without blocking by the next
     *  caller of a method for this input stream.
     */
    @stub
    def available(): Int = ???

    /** Closes this input stream and releases any system resources
     *  associated with the stream.
     */
    @stub
    def close(): Unit = ???

    /** Marks the current position in this input stream. */
    @stub
    def mark(readlimit: Int): Unit = ???

    /** Tests if this input stream supports the mark
     *  and reset methods.
     */
    @stub
    def markSupported(): Boolean = ???

    /** Reads the next byte of data from this input stream. */
    @stub
    def read(): Int = ???

    /** Reads up to byte.length bytes of data from this
     *  input stream into an array of bytes.
     */
    @stub
    def read(b: Array[Byte]): Int = ???

    /** Reads up to len bytes of data from this input stream
     *  into an array of bytes.
     */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    /** Repositions this stream to the position at the time the
     *  mark method was last called on this input stream.
     */
    @stub
    def reset(): Unit = ???
}
