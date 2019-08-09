package java.io

import java.lang.Object

// A PushbackInputStream adds
// functionality to another input stream, namely
// the  ability to "push back" or "unread"
// one byte. This is useful in situations where
// it is  convenient for a fragment of code
// to read an indefinite number of data bytes
// that  are delimited by a particular byte
// value; after reading the terminating byte,
// the  code fragment can "unread" it, so that
// the next read operation on the input stream
// will reread the byte that was pushed back.
// For example, bytes representing the  characters
// constituting an identifier might be terminated
// by a byte representing an  operator character;
// a method whose job is to read just an identifier
// can read until it  sees the operator and
// then push the operator back to be re-read.
class PushbackInputStream extends FilterInputStream {

    @stub
    // Creates a PushbackInputStream
    // and saves its  argument, the input stream
    // in, for later use.
    def this(in: InputStream) = ???

    @stub
    // The pushback buffer.
    protected def buf: Array[Byte] = ???

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
    // Marks the current position in this input stream.
    def mark(readlimit: Int): Unit = ???

    @stub
    // Tests if this input stream supports the mark and
    // reset methods, which it does not.
    def markSupported(): Boolean = ???

    @stub
    // Reads the next byte of data from this input stream.
    def read(): Int = ???

    @stub
    // Reads up to len bytes of data from this input stream into
    // an array of bytes.
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    @stub
    // Repositions this stream to the position at the time the
    // mark method was last called on this input stream.
    def reset(): Unit = ???

    @stub
    // Skips over and discards n bytes of data from this
    // input stream.
    def skip(n: Long): Long = ???

    @stub
    // Pushes back an array of bytes by copying it to the front of the
    // pushback buffer.
    def unread(b: Array[Byte]): Unit = ???

    @stub
    // Pushes back a portion of an array of bytes by copying it to the front
    // of the pushback buffer.
    def unread(b: Array[Byte], off: Int, len: Int): Unit = ???
}
