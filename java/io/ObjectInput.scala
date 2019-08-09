package java.io

import java.lang.{AutoCloseable, Object}

// ObjectInput extends the DataInput interface to include the reading of
// objects. DataInput includes methods for the input of primitive types,
// ObjectInput extends that interface to include objects, arrays, and Strings.
trait ObjectInput extends DataInput , AutoCloseable {

    @stub
    // Returns the number of bytes that can be read
    // without blocking.
    def available(): Int = ???

    @stub
    // Closes the input stream.
    def close(): Unit = ???

    @stub
    // Reads a byte of data.
    def read(): Int = ???

    @stub
    // Reads into an array of bytes.
    def read(b: Array[Byte]): Int = ???

    @stub
    // Reads into an array of bytes.
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    @stub
    // Read and return an object.
    def readObject(): Object = ???
}
