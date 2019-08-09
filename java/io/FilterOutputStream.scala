package java.io

import java.lang.Object

// This class is the superclass of all classes that filter output
// streams. These streams sit on top of an already existing output
// stream (the underlying output stream) which it uses as its
// basic sink of data, but possibly transforming the data along the
// way or providing additional functionality.
// 
// The class FilterOutputStream itself simply overrides
// all methods of OutputStream with versions that pass
// all requests to the underlying output stream. Subclasses of
// FilterOutputStream may further override some of these
// methods as well as provide additional methods and fields.
class FilterOutputStream extends OutputStream {

    @stub
    // Closes this output stream and releases any system resources
    // associated with the stream.
    def close(): Unit = ???

    @stub
    // Flushes this output stream and forces any buffered output bytes
    // to be written out to the stream.
    def flush(): Unit = ???

    @stub
    // Writes b.length bytes to this output stream.
    def write(b: Array[Byte]): Unit = ???

    @stub
    // Writes len bytes from the specified
    // byte array starting at offset off to
    // this output stream.
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???
}
