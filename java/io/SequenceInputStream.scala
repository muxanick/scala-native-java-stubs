package java.io

import java.lang.Object
import java.util.Enumeration

// A SequenceInputStream represents
// the logical concatenation of other input
// streams. It starts out with an ordered
// collection of input streams and reads from
// the first one until end of file is reached,
// whereupon it reads from the second one,
// and so on, until end of file is reached
// on the last of the contained input streams.
class SequenceInputStream extends InputStream {

    @stub
    // Initializes a newly created SequenceInputStream
    // by remembering the argument, which must
    // be an Enumeration  that produces
    // objects whose run-time type is InputStream.
    def this(e: Enumeration[_ <: InputStream]) = ???

    @stub
    // Returns an estimate of the number of bytes that can be read (or
    // skipped over) from the current underlying input stream without
    // blocking by the next invocation of a method for the current
    // underlying input stream.
    def available(): Int = ???

    @stub
    // Closes this input stream and releases any system resources
    // associated with the stream.
    def close(): Unit = ???

    @stub
    // Reads the next byte of data from this input stream.
    def read(): Int = ???
}
