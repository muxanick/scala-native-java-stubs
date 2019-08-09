package java.sql

import java.io.{InputStream, OutputStream}
import scala.scalanative.annotation.stub

/** The representation (mapping) in
 *  the Java™ programming
 *  language of an SQL
 *  BLOB value.  An SQL BLOB is a built-in type
 *  that stores a Binary Large Object as a column value in a row of
 *  a database table. By default drivers implement Blob using
 *  an SQL locator(BLOB), which means that a
 *  Blob object contains a logical pointer to the
 *  SQL BLOB data rather than the data itself.
 *  A Blob object is valid for the duration of the
 *  transaction in which is was created.
 * 
 *  Methods in the interfaces ResultSet,
 *  CallableStatement, and PreparedStatement, such as
 *  getBlob and setBlob allow a programmer to
 *  access an SQL BLOB value.
 *  The Blob interface provides methods for getting the
 *  length of an SQL BLOB (Binary Large Object) value,
 *  for materializing a BLOB value on the client, and for
 *  determining the position of a pattern of bytes within a
 *  BLOB value. In addition, this interface has methods for updating
 *  a BLOB value.
 *  
 *  All methods on the Blob interface must be fully implemented if the
 *  JDBC driver supports the data type.
 */
trait Blob {

    /** This method frees the Blob object and releases the resources that
     *  it holds.
     */
    @stub
    def free(): Unit = ???

    /** Retrieves the BLOB value designated by this
     *  Blob instance as a stream.
     */
    @stub
    def getBinaryStream(): InputStream = ???

    /** Returns an InputStream object that contains a partial Blob value,
     *  starting  with the byte specified by pos, which is length bytes in length.
     */
    @stub
    def getBinaryStream(pos: Long, length: Long): InputStream = ???

    /** Retrieves all or part of the BLOB
     *  value that this Blob object represents, as an array of
     *  bytes.
     */
    @stub
    def getBytes(pos: Long, length: Int): Array[Byte] = ???

    /** Returns the number of bytes in the BLOB value
     *  designated by this Blob object.
     */
    @stub
    def length(): Long = ???

    /** Retrieves the byte position in the BLOB value
     *  designated by this Blob object at which
     *  pattern begins.
     */
    @stub
    def position(pattern: Blob, start: Long): Long = ???

    /** Retrieves the byte position at which the specified byte array
     *  pattern begins within the BLOB
     *  value that this Blob object represents.
     */
    @stub
    def position(pattern: Array[Byte], start: Long): Long = ???

    /** Retrieves a stream that can be used to write to the BLOB
     *  value that this Blob object represents.
     */
    @stub
    def setBinaryStream(pos: Long): OutputStream = ???

    /** Writes the given array of bytes to the BLOB value that
     *  this Blob object represents, starting at position
     *  pos, and returns the number of bytes written.
     */
    @stub
    def setBytes(pos: Long, bytes: Array[Byte]): Int = ???

    /** Writes all or part of the given byte array to the
     *  BLOB value that this Blob object represents
     *  and returns the number of bytes written.
     */
    @stub
    def setBytes(pos: Long, bytes: Array[Byte], offset: Int, len: Int): Int = ???

    /** Truncates the BLOB value that this Blob
     *  object represents to be len bytes in length.
     */
    @stub
    def truncate(len: Long): Unit = ???
}
