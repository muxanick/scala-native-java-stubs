package java.io

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class implements an output stream in which the data is
 *  written into a byte array. The buffer automatically grows as data
 *  is written to it.
 *  The data can be retrieved using toByteArray() and
 *  toString().
 *  
 *  Closing a ByteArrayOutputStream has no effect. The methods in
 *  this class can be called after the stream has been closed without
 *  generating an IOException.
 */
class ByteArrayOutputStream extends OutputStream {

    /** Creates a new byte array output stream. */
    @stub
    def this() = ???

    /** Creates a new byte array output stream, with a buffer capacity of
     *  the specified size, in bytes.
     */
    @stub
    def this(size: Int) = ???

    /** The buffer where data is stored. */
    @stub
    protected val buf: Array[Byte] = ???

    /** The number of valid bytes in the buffer. */
    @stub
    protected val count: Int = ???

    /** Closing a ByteArrayOutputStream has no effect. */
    @stub
    def close(): Unit = ???

    /** Resets the count field of this byte array output
     *  stream to zero, so that all currently accumulated output in the
     *  output stream is discarded.
     */
    @stub
    def reset(): Unit = ???

    /** Returns the current size of the buffer. */
    @stub
    def size(): Int = ???

    /** Creates a newly allocated byte array. */
    @stub
    def toByteArray(): Array[Byte] = ???

    /** Converts the buffer's contents into a string decoding bytes using the
     *  platform's default character set.
     */
    @stub
    def toString(): String = ???

    /** Deprecated. 
     * This method does not properly convert bytes into characters.
     *  As of JDK 1.1, the preferred way to do this is via the
     *  toString(String enc) method, which takes an encoding-name
     *  argument, or the toString() method, which uses the
     *  platform's default character encoding.
     * 
     */
    @stub
    def toString(hibyte: Int): String = ???

    /** Converts the buffer's contents into a string by decoding the bytes using
     *  the named charset.
     */
    @stub
    def toString(charsetName: String): String = ???

    /** Writes len bytes from the specified byte array
     *  starting at offset off to this byte array output stream.
     */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Writes the specified byte to this byte array output stream. */
    @stub
    def write(b: Int): Unit = ???

    /** Writes the complete contents of this byte array output stream to
     *  the specified output stream argument, as if by calling the output
     *  stream's write method using out.write(buf, 0, count).
     */
    @stub
    def writeTo(out: OutputStream): Unit = ???
}
