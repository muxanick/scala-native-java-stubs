package java.io

import java.lang.{AutoCloseable, Object}

/** ObjectInput extends the DataInput interface to include the reading of
 *  objects. DataInput includes methods for the input of primitive types,
 *  ObjectInput extends that interface to include objects, arrays, and Strings.
 */
trait ObjectInput extends DataInput with AutoCloseable {

    /** Returns the number of bytes that can be read
     *  without blocking.
     */
    @stub
    def available(): Int = ???

    /** Closes the input stream. */
    @stub
    def close(): Unit = ???

    /** Reads a byte of data. */
    @stub
    def read(): Int = ???

    /** Reads into an array of bytes. */
    @stub
    def read(b: Array[Byte]): Int = ???

    /** Reads into an array of bytes. */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    /** Read and return an object. */
    @stub
    def readObject(): Object = ???
}
