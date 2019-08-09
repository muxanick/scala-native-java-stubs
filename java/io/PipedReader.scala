package java.io

import java.lang.Object

// Piped character-input streams.
class PipedReader extends Reader {

    @stub
    // Creates a PipedReader so
    // that it is not yet connected.
    def this() = ???

    @stub
    // Creates a PipedReader so that it is not yet
    // connected and uses
    // the specified pipe size for the pipe's buffer.
    def this(pipeSize: Int) = ???

    @stub
    // Creates a PipedReader so
    // that it is connected to the piped writer
    // src.
    def this(src: PipedWriter) = ???

    @stub
    // Closes this piped stream and releases any system resources
    // associated with the stream.
    def close(): Unit = ???

    @stub
    // Causes this piped reader to be connected
    // to the piped  writer src.
    def connect(src: PipedWriter): Unit = ???

    @stub
    // Reads the next character of data from this piped stream.
    def read(): Int = ???

    @stub
    // Reads up to len characters of data from this piped
    // stream into an array of characters.
    def read(cbuf: Array[Char], off: Int, len: Int): Int = ???
}
