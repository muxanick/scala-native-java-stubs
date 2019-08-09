package java.io

import java.lang.AutoCloseable

// ObjectOutput extends the DataOutput interface to include writing of objects.
// DataOutput includes methods for output of primitive types, ObjectOutput
// extends that interface to include objects, arrays, and Strings.
trait ObjectOutput extends DataOutput , AutoCloseable {

    @stub
    // Closes the stream.
    def close(): Unit = ???

    @stub
    // Flushes the stream.
    def flush(): Unit = ???

    @stub
    // Writes an array of bytes.
    def write(b: Array[Byte]): Unit = ???

    @stub
    // Writes a sub array of bytes.
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???

    @stub
    // Writes a byte.
    def write(b: Int): Unit = ???
}
