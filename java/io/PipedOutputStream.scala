package java.io

import java.lang.Object

/** A piped output stream can be connected to a piped input stream
 *  to create a communications pipe. The piped output stream is the
 *  sending end of the pipe. Typically, data is written to a
 *  PipedOutputStream object by one thread and data is
 *  read from the connected PipedInputStream by some
 *  other thread. Attempting to use both objects from a single thread
 *  is not recommended as it may deadlock the thread.
 *  The pipe is said to be  broken  if a
 *  thread that was reading data bytes from the connected piped input
 *  stream is no longer alive.
 */
class PipedOutputStream extends OutputStream {

    /** Creates a piped output stream that is not yet connected to a
     *  piped input stream.
     */
    @stub
    def this() = ???

    /** Closes this piped output stream and releases any system resources
     *  associated with this stream.
     */
    @stub
    def close(): Unit = ???

    /** Connects this piped output stream to a receiver. */
    @stub
    def connect(snk: PipedInputStream): Unit = ???

    /** Flushes this output stream and forces any buffered output bytes
     *  to be written out.
     */
    @stub
    def flush(): Unit = ???

    /** Writes len bytes from the specified byte array
     *  starting at offset off to this piped output stream.
     */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???
}
