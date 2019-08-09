package java.io

import java.lang.Object
import scala.scalanative.annotation.stub

/** The class implements a buffered output stream. By setting up such
 *  an output stream, an application can write bytes to the underlying
 *  output stream without necessarily causing a call to the underlying
 *  system for each byte written.
 */
class BufferedOutputStream extends FilterOutputStream {

    /** Creates a new buffered output stream to write data to the
     *  specified underlying output stream.
     */
    @stub
    def this(out: OutputStream) = ???

    /** Creates a new buffered output stream to write data to the
     *  specified underlying output stream with the specified buffer
     *  size.
     */
    @stub
    def this(out: OutputStream, size: Int) = ???

    /** The internal buffer where data is stored. */
    @stub
    protected val buf: Array[Byte] = ???

    /** The number of valid bytes in the buffer. */
    @stub
    protected val count: Int = ???

    /** Flushes this buffered output stream. */
    @stub
    def flush(): Unit = ???

    /** Writes len bytes from the specified byte array
     *  starting at offset off to this buffered output stream.
     */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Writes the specified byte to this buffered output stream. */
    @stub
    def write(b: Int): Unit = ???
}
