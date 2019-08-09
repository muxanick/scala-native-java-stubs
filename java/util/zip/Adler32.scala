package java.util.zip

import java.lang.Object
import java.nio.ByteBuffer

/** A class that can be used to compute the Adler-32 checksum of a data
 *  stream. An Adler-32 checksum is almost as reliable as a CRC-32 but
 *  can be computed much faster.
 * 
 *   Passing a null argument to a method in this class will cause
 *  a NullPointerException to be thrown.
 */
class Adler32 extends Object with Checksum {

    /** Returns the checksum value. */
    @stub
    def getValue(): Long = ???

    /** Resets the checksum to initial value. */
    @stub
    def reset(): Unit = ???

    /** Updates the checksum with the specified array of bytes. */
    @stub
    def update(b: Array[Byte]): Unit = ???

    /** Updates the checksum with the specified array of bytes. */
    @stub
    def update(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Updates the checksum with the bytes from the specified buffer. */
    @stub
    def update(buffer: ByteBuffer): Unit = ???
}
