package java.util.zip

import java.lang.Object
import java.nio.ByteBuffer

// A class that can be used to compute the CRC-32 of a data stream.
//
//  Passing a null argument to a method in this class will cause
// a NullPointerException to be thrown.
class CRC32 extends Object with Checksum {

    @stub
    // Returns CRC-32 value.
    def getValue(): Long = ???

    @stub
    // Resets CRC-32 to initial value.
    def reset(): Unit = ???

    @stub
    // Updates the CRC-32 checksum with the specified array of bytes.
    def update(b: Array[Byte]): Unit = ???

    @stub
    // Updates the CRC-32 checksum with the specified array of bytes.
    def update(b: Array[Byte], off: Int, len: Int): Unit = ???

    @stub
    // Updates the checksum with the bytes from the specified buffer.
    def update(buffer: ByteBuffer): Unit = ???
}
