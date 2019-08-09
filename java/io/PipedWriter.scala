package java.io

import java.lang.Object

// Piped character-output streams.
class PipedWriter extends Writer {

    @stub
    // Creates a piped writer that is not yet connected to a
    // piped reader.
    def this() = ???

    @stub
    // Closes this piped output stream and releases any system resources
    // associated with this stream.
    def close(): Unit = ???

    @stub
    // Connects this piped writer to a receiver.
    def connect(snk: PipedReader): Unit = ???

    @stub
    // Flushes this output stream and forces any buffered output characters
    // to be written out.
    def flush(): Unit = ???

    @stub
    // Writes len characters from the specified character array
    // starting at offset off to this piped output stream.
    def write(cbuf: Array[Char], off: Int, len: Int): Unit = ???
}
