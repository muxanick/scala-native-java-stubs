package java.io

import java.lang.Object

// A BufferedInputStream adds
// functionality to another input stream-namely,
// the ability to buffer the input and to
// support the mark and reset
// methods. When  the BufferedInputStream
// is created, an internal buffer array is
// created. As bytes  from the stream are read
// or skipped, the internal buffer is refilled
// as necessary  from the contained input stream,
// many bytes at a time. The mark
// operation  remembers a point in the input
// stream and the reset operation
// causes all the  bytes read since the most
// recent mark operation to be
// reread before new bytes are  taken from
// the contained input stream.
class BufferedInputStream extends FilterInputStream {

    @stub
    // Creates a BufferedInputStream
    // and saves its  argument, the input stream
    // in, for later use.
    def this(in: InputStream) = ???

    @stub
    // The internal buffer array where the data is stored.
    protected def buf: Array[Byte] = ???

    @stub
    // The index one greater than the index of the last valid byte in
    // the buffer.
    protected def count: Int = ???

    @stub
    // The maximum read ahead allowed after a call to the
    // mark method before subsequent calls to the
    // reset method fail.
    protected def marklimit: Int = ???

    @stub
    // The value of the pos field at the time the last
    // mark method was called.
    protected def markpos: Int = ???

    @stub
    // Returns an estimate of the number of bytes that can be read (or
    // skipped over) from this input stream without blocking by the next
    // invocation of a method for this input stream.
    def available(): Int = ???

    @stub
    // Closes this input stream and releases any system resources
    // associated with the stream.
    def close(): Unit = ???

    @stub
    // See the general contract of the mark
    // method of InputStream.
    def mark(readlimit: Int): Unit = ???

    @stub
    // Tests if this input stream supports the mark
    // and reset methods.
    def markSupported(): Boolean = ???

    @stub
    // See
    // the general contract of the read
    // method of InputStream.
    def read(): Int = ???

    @stub
    // Reads bytes from this byte-input stream into the specified byte array,
    // starting at the given offset.
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    @stub
    // See the general contract of the reset
    // method of InputStream.
    def reset(): Unit = ???
}
