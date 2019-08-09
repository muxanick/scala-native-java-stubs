package java.util.zip

import java.lang.Object
import java.nio.ByteBuffer
import scala.scalanative.annotation.stub

/** A class that can be used to compute the CRC-32 of a data stream.
 * 
 *   Passing a null argument to a method in this class will cause
 *  a NullPointerException to be thrown.
 */
class CRC32 extends Object with Checksum {

    /** Creates a new CRC32 object. */
    @stub
    def this() = ???

    /** Returns CRC-32 value. */
    @stub
    def getValue(): Long = ???

    /** Resets CRC-32 to initial value. */
    @stub
    def reset(): Unit = ???

    /** Updates the CRC-32 checksum with the specified array of bytes. */
    @stub
    def update(b: Array[Byte]): Unit = ???

    /** Updates the CRC-32 checksum with the specified array of bytes. */
    @stub
    def update(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Updates the checksum with the bytes from the specified buffer. */
    @stub
    def update(buffer: ByteBuffer): Unit = ???

    /** Updates the CRC-32 checksum with the specified byte (the low
     *  eight bits of the argument b).
     */
    @stub
    def update(b: Int): Unit = ???
}
