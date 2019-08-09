package java.io

import java.lang.Object

// A piped input stream should be connected
// to a piped output stream; the piped  input
// stream then provides whatever data bytes
// are written to the piped output  stream.
// Typically, data is read from a PipedInputStream
// object by one thread  and data is written
// to the corresponding PipedOutputStream
// by some  other thread. Attempting to use
// both objects from a single thread is not
// recommended, as it may deadlock the thread.
// The piped input stream contains a buffer,
// decoupling read operations from write operations,
// within limits.
// A pipe is said to be  broken  if a
// thread that was providing data bytes to the connected
// piped output stream is no longer alive.
class PipedInputStream extends InputStream {

    @stub
    // Creates a PipedInputStream so
    // that it is not yet connected.
    def this() = ???

    @stub
    // Creates a PipedInputStream so that it is not yet
    // connected and
    // uses the specified pipe size for the pipe's buffer.
    def this(pipeSize: Int) = ???

    @stub
    // Creates a PipedInputStream so
    // that it is connected to the piped output
    // stream src.
    def this(src: PipedOutputStream) = ???

    @stub
    // The circular buffer into which incoming data is placed.
    protected def buffer: Array[Byte] = ???

    @stub
    // The index of the position in the circular buffer at which the
    // next byte of data will be stored when received from the connected
    // piped output stream.
    protected def in: Int = ???

    @stub
    // The index of the position in the circular buffer at which the next
    // byte of data will be read by this piped input stream.
    protected def out: Int = ???

    @stub
    // Returns the number of bytes that can be read from this input
    // stream without blocking.
    def available(): Int = ???

    @stub
    // Closes this piped input stream and releases any system resources
    // associated with the stream.
    def close(): Unit = ???

    @stub
    // Causes this piped input stream to be connected
    // to the piped  output stream src.
    def connect(src: PipedOutputStream): Unit = ???

    @stub
    // Reads the next byte of data from this piped input stream.
    def read(): Int = ???

    @stub
    // Reads up to len bytes of data from this piped input
    // stream into an array of bytes.
    def read(b: Array[Byte], off: Int, len: Int): Int = ???
}
