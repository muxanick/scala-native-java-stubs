package java.io

import java.lang.Object
import java.util.Enumeration
import scala.scalanative.annotation.stub

/** A SequenceInputStream represents
 *  the logical concatenation of other input
 *  streams. It starts out with an ordered
 *  collection of input streams and reads from
 *  the first one until end of file is reached,
 *  whereupon it reads from the second one,
 *  and so on, until end of file is reached
 *  on the last of the contained input streams.
 */
class SequenceInputStream extends InputStream {

    /** Initializes a newly created SequenceInputStream
     *  by remembering the argument, which must
     *  be an Enumeration  that produces
     *  objects whose run-time type is InputStream.
     */
    @stub
    def this(e: Enumeration[_ <: InputStream]) = ???

    /** Initializes a newly
     *  created SequenceInputStream
     *  by remembering the two arguments, which
     *  will be read in order, first s1
     *  and then s2, to provide the
     *  bytes to be read from this SequenceInputStream.
     */
    @stub
    def this(s1: InputStream, s2: InputStream) = ???

    /** Returns an estimate of the number of bytes that can be read (or
     *  skipped over) from the current underlying input stream without
     *  blocking by the next invocation of a method for the current
     *  underlying input stream.
     */
    @stub
    def available(): Int = ???

    /** Closes this input stream and releases any system resources
     *  associated with the stream.
     */
    @stub
    def close(): Unit = ???

    /** Reads the next byte of data from this input stream. */
    @stub
    def read(): Int = ???

    /** Reads up to len bytes of data from this input stream
     *  into an array of bytes.
     */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???
}
