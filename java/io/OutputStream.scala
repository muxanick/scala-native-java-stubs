package java.io

import java.lang.Object

/** This abstract class is the superclass of all classes representing
 *  an output stream of bytes. An output stream accepts output bytes
 *  and sends them to some sink.
 *  
 *  Applications that need to define a subclass of
 *  OutputStream must always provide at least a method
 *  that writes one byte of output.
 */
abstract class OutputStream extends Object with Closeable with Flushable {

    /** Closes this output stream and releases any system resources
     *  associated with this stream.
     */
    def close(): Unit

    /** Flushes this output stream and forces any buffered output bytes
     *  to be written out.
     */
    def flush(): Unit

    /** Writes b.length bytes from the specified byte array
     *  to this output stream.
     */
    def write(b: Array[Byte]): Unit

    /** Writes len bytes from the specified byte array
     *  starting at offset off to this output stream.
     */
    def write(b: Array[Byte], off: Int, len: Int): Unit
}
