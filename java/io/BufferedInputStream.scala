package java.io

import java.lang.Object

/** A BufferedInputStream adds
 *  functionality to another input stream-namely,
 *  the ability to buffer the input and to
 *  support the mark and reset
 *  methods. When  the BufferedInputStream
 *  is created, an internal buffer array is
 *  created. As bytes  from the stream are read
 *  or skipped, the internal buffer is refilled
 *  as necessary  from the contained input stream,
 *  many bytes at a time. The mark
 *  operation  remembers a point in the input
 *  stream and the reset operation
 *  causes all the  bytes read since the most
 *  recent mark operation to be
 *  reread before new bytes are  taken from
 *  the contained input stream.
 */
class BufferedInputStream extends FilterInputStream {

    /** Creates a BufferedInputStream
     *  and saves its  argument, the input stream
     *  in, for later use.
     */
    @stub
    def this(in: InputStream) = ???

    /** The internal buffer array where the data is stored. */
    @stub
    protected val buf: Array[Byte] = ???

    /** The index one greater than the index of the last valid byte in
     *  the buffer.
     */
    @stub
    protected val count: Int = ???

    /** The maximum read ahead allowed after a call to the
     *  mark method before subsequent calls to the
     *  reset method fail.
     */
    @stub
    protected val marklimit: Int = ???

    /** The value of the pos field at the time the last
     *  mark method was called.
     */
    @stub
    protected val markpos: Int = ???

    /** Returns an estimate of the number of bytes that can be read (or
     *  skipped over) from this input stream without blocking by the next
     *  invocation of a method for this input stream.
     */
    @stub
    def available(): Int = ???

    /** Closes this input stream and releases any system resources
     *  associated with the stream.
     */
    @stub
    def close(): Unit = ???

    /** See the general contract of the mark
     *  method of InputStream.
     */
    @stub
    def mark(readlimit: Int): Unit = ???

    /** Tests if this input stream supports the mark
     *  and reset methods.
     */
    @stub
    def markSupported(): Boolean = ???

    /** See
     *  the general contract of the read
     *  method of InputStream.
     */
    @stub
    def read(): Int = ???

    /** Reads bytes from this byte-input stream into the specified byte array,
     *  starting at the given offset.
     */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    /** See the general contract of the reset
     *  method of InputStream.
     */
    @stub
    def reset(): Unit = ???
}
