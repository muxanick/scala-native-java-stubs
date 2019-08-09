package java.io

import java.lang.{Deprecated, Object, String}
import scala.scalanative.annotation.stub

/** This class allows an application to create an input stream in
 *  which the bytes read are supplied by the contents of a string.
 *  Applications can also read bytes from a byte array by using a
 *  ByteArrayInputStream.
 *  
 *  Only the low eight bits of each character in the string are used by
 *  this class.
 */
@Deprecated class StringBufferInputStream extends InputStream {

    /** Deprecated.  */
    @stub
    def this(s: String) = ???

    /** Deprecated.  */
    @stub
    protected val buffer: String = ???

    /** Deprecated.  */
    @stub
    protected val count: Int = ???

    /** Deprecated.  */
    @stub
    protected val pos: Int = ???

    /** Deprecated.  */
    @stub
    def available(): Int = ???

    /** Deprecated.  */
    @stub
    def read(): Int = ???

    /** Deprecated.  */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    /** Deprecated.  */
    @stub
    def reset(): Unit = ???

    /** Deprecated.  */
    @stub
    def skip(n: Long): Long = ???
}
