package java.io

import java.lang.{AutoCloseable, Object}
import scala.scalanative.annotation.stub

/** ObjectOutput extends the DataOutput interface to include writing of objects.
 *  DataOutput includes methods for output of primitive types, ObjectOutput
 *  extends that interface to include objects, arrays, and Strings.
 */
trait ObjectOutput extends DataOutput with AutoCloseable {

    /** Closes the stream. */
    @stub
    def close(): Unit = ???

    /** Flushes the stream. */
    @stub
    def flush(): Unit = ???

    /** Writes an array of bytes. */
    @stub
    def write(b: Array[Byte]): Unit = ???

    /** Writes a sub array of bytes. */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Writes a byte. */
    @stub
    def write(b: Int): Unit = ???

    /** Write an object to the underlying storage or stream. */
    @stub
    def writeObject(obj: Any): Unit = ???
}
