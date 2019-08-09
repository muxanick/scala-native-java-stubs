package java.io

import java.lang.Object
import scala.scalanative.annotation.stub

/** A piped input stream should be connected
 *  to a piped output stream; the piped  input
 *  stream then provides whatever data bytes
 *  are written to the piped output  stream.
 *  Typically, data is read from a PipedInputStream
 *  object by one thread  and data is written
 *  to the corresponding PipedOutputStream
 *  by some  other thread. Attempting to use
 *  both objects from a single thread is not
 *  recommended, as it may deadlock the thread.
 *  The piped input stream contains a buffer,
 *  decoupling read operations from write operations,
 *  within limits.
 *  A pipe is said to be  broken  if a
 *  thread that was providing data bytes to the connected
 *  piped output stream is no longer alive.
 */
class PipedInputStream extends InputStream {

    /** Creates a PipedInputStream so
     *  that it is not yet connected.
     */
    @stub
    def this() = ???

    /** Creates a PipedInputStream so that it is not yet
     *  connected and
     *  uses the specified pipe size for the pipe's buffer.
     */
    @stub
    def this(pipeSize: Int) = ???

    /** Creates a PipedInputStream so
     *  that it is connected to the piped output
     *  stream src.
     */
    @stub
    def this(src: PipedOutputStream) = ???

    /** Creates a PipedInputStream so that it is
     *  connected to the piped output stream
     *  src and uses the specified pipe size for
     *  the pipe's buffer.
     */
    @stub
    def this(src: PipedOutputStream, pipeSize: Int) = ???

    /** The circular buffer into which incoming data is placed. */
    @stub
    protected val buffer: Array[Byte] = ???

    /** The index of the position in the circular buffer at which the
     *  next byte of data will be stored when received from the connected
     *  piped output stream.
     */
    @stub
    protected val in: Int = ???

    /** The index of the position in the circular buffer at which the next
     *  byte of data will be read by this piped input stream.
     */
    @stub
    protected val out: Int = ???

    /** Returns the number of bytes that can be read from this input
     *  stream without blocking.
     */
    @stub
    def available(): Int = ???

    /** Closes this piped input stream and releases any system resources
     *  associated with the stream.
     */
    @stub
    def close(): Unit = ???

    /** Causes this piped input stream to be connected
     *  to the piped  output stream src.
     */
    @stub
    def connect(src: PipedOutputStream): Unit = ???

    /** Reads the next byte of data from this piped input stream. */
    @stub
    def read(): Int = ???

    /** Reads up to len bytes of data from this piped input
     *  stream into an array of bytes.
     */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    /** Receives a byte of data. */
    @stub
    protected def receive(b: Int): Unit = ???
}

object PipedInputStream {
    /** The default size of the pipe's circular input buffer. */
    @stub
    protected val PIPE_SIZE: Int = ???
}
