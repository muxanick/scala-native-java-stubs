package java.io

import java.lang.Object

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

    /** The internal buffer where data is stored. */
    @stub
    protected val buf: Array[Byte] = ???

    /** Flushes this buffered output stream. */
    @stub
    def flush(): Unit = ???

    /** Writes len bytes from the specified byte array
     *  starting at offset off to this buffered output stream.
     */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???
}
