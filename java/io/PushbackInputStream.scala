package java.io

import java.lang.Object

/** A PushbackInputStream adds
 *  functionality to another input stream, namely
 *  the  ability to "push back" or "unread"
 *  one byte. This is useful in situations where
 *  it is  convenient for a fragment of code
 *  to read an indefinite number of data bytes
 *  that  are delimited by a particular byte
 *  value; after reading the terminating byte,
 *  the  code fragment can "unread" it, so that
 *  the next read operation on the input stream
 *  will reread the byte that was pushed back.
 *  For example, bytes representing the  characters
 *  constituting an identifier might be terminated
 *  by a byte representing an  operator character;
 *  a method whose job is to read just an identifier
 *  can read until it  sees the operator and
 *  then push the operator back to be re-read.
 */
class PushbackInputStream extends FilterInputStream {

    /** Creates a PushbackInputStream
     *  and saves its  argument, the input stream
     *  in, for later use.
     */
    @stub
    def this(in: InputStream) = ???

    /** The pushback buffer. */
    @stub
    protected val buf: Array[Byte] = ???

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

    /** Marks the current position in this input stream. */
    @stub
    def mark(readlimit: Int): Unit = ???

    /** Tests if this input stream supports the mark and
     *  reset methods, which it does not.
     */
    @stub
    def markSupported(): Boolean = ???

    /** Reads the next byte of data from this input stream. */
    @stub
    def read(): Int = ???

    /** Reads up to len bytes of data from this input stream into
     *  an array of bytes.
     */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    /** Repositions this stream to the position at the time the
     *  mark method was last called on this input stream.
     */
    @stub
    def reset(): Unit = ???

    /** Skips over and discards n bytes of data from this
     *  input stream.
     */
    @stub
    def skip(n: Long): Long = ???

    /** Pushes back an array of bytes by copying it to the front of the
     *  pushback buffer.
     */
    @stub
    def unread(b: Array[Byte]): Unit = ???

    /** Pushes back a portion of an array of bytes by copying it to the front
     *  of the pushback buffer.
     */
    @stub
    def unread(b: Array[Byte], off: Int, len: Int): Unit = ???
}
