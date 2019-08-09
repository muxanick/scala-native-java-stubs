package java.sql

import java.io.{InputStream, OutputStream}

// The representation (mapping) in
// the Java™ programming
// language of an SQL
// BLOB value.  An SQL BLOB is a built-in type
// that stores a Binary Large Object as a column value in a row of
// a database table. By default drivers implement Blob using
// an SQL locator(BLOB), which means that a
// Blob object contains a logical pointer to the
// SQL BLOB data rather than the data itself.
// A Blob object is valid for the duration of the
// transaction in which is was created.
//
// Methods in the interfaces ResultSet,
// CallableStatement, and PreparedStatement, such as
// getBlob and setBlob allow a programmer to
// access an SQL BLOB value.
// The Blob interface provides methods for getting the
// length of an SQL BLOB (Binary Large Object) value,
// for materializing a BLOB value on the client, and for
// determining the position of a pattern of bytes within a
// BLOB value. In addition, this interface has methods for updating
// a BLOB value.
// 
// All methods on the Blob interface must be fully implemented if the
// JDBC driver supports the data type.
trait Blob {

    @stub
    // This method frees the Blob object and releases the resources that
    // it holds.
    def free(): Unit = ???

    @stub
    // Retrieves the BLOB value designated by this
    // Blob instance as a stream.
    def getBinaryStream(): InputStream = ???

    @stub
    // Returns an InputStream object that contains a partial Blob value,
    // starting  with the byte specified by pos, which is length bytes in length.
    def getBinaryStream(pos: Long, length: Long): InputStream = ???

    @stub
    // Retrieves all or part of the BLOB
    // value that this Blob object represents, as an array of
    // bytes.
    def getBytes(pos: Long, length: Int): Array[Byte] = ???

    @stub
    // Returns the number of bytes in the BLOB value
    // designated by this Blob object.
    def length(): Long = ???

    @stub
    // Retrieves the byte position in the BLOB value
    // designated by this Blob object at which
    // pattern begins.
    def position(pattern: Blob, start: Long): Long = ???

    @stub
    // Retrieves the byte position at which the specified byte array
    // pattern begins within the BLOB
    // value that this Blob object represents.
    def position(pattern: Array[Byte], start: Long): Long = ???

    @stub
    // Retrieves a stream that can be used to write to the BLOB
    // value that this Blob object represents.
    def setBinaryStream(pos: Long): OutputStream = ???

    @stub
    // Writes the given array of bytes to the BLOB value that
    // this Blob object represents, starting at position
    // pos, and returns the number of bytes written.
    def setBytes(pos: Long, bytes: Array[Byte]): Int = ???

    @stub
    // Writes all or part of the given byte array to the
    // BLOB value that this Blob object represents
    // and returns the number of bytes written.
    def setBytes(pos: Long, bytes: Array[Byte], offset: Int, len: Int): Int = ???
}
