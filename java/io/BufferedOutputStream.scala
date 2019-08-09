package java.io

import java.lang.Object

// The class implements a buffered output stream. By setting up such
// an output stream, an application can write bytes to the underlying
// output stream without necessarily causing a call to the underlying
// system for each byte written.
class BufferedOutputStream extends FilterOutputStream {

    @stub
    // Creates a new buffered output stream to write data to the
    // specified underlying output stream.
    def this(out: OutputStream) = ???

    @stub
    // The internal buffer where data is stored.
    protected def buf: Array[Byte] = ???

    @stub
    // Flushes this buffered output stream.
    def flush(): Unit = ???

    @stub
    // Writes len bytes from the specified byte array
    // starting at offset off to this buffered output stream.
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???
}
