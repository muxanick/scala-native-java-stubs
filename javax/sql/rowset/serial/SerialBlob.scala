package javax.sql.rowset.serial

import java.io.{InputStream, OutputStream, Serializable}
import java.lang.{Cloneable, Object}
import java.sql.Blob

// A serialized mapping in the Java programming language of an SQL
// BLOB value.
// 
// The SerialBlob class provides a constructor for creating
// an instance from a Blob object.  Note that the
// Blob
// object should have brought the SQL BLOB value's data over
// to the client before a SerialBlob object
// is constructed from it.  The data of an SQL BLOB value can
// be materialized on the client as an array of bytes (using the method
// Blob.getBytes) or as a stream of uninterpreted bytes
// (using the method Blob.getBinaryStream).
// 
// SerialBlob methods make it possible to make a copy of a
// SerialBlob object as an array of bytes or as a stream.
// They also make it possible to locate a given pattern of bytes or a
// Blob object within a SerialBlob object
// and to update or truncate a Blob object.
//
//  Thread safety 
//
//  A SerialBlob is not safe for use by multiple concurrent threads.  If a
// SerialBlob is to be used by more than one thread then access to the SerialBlob
// should be controlled by appropriate synchronization.
class SerialBlob extends Object with Blob, with Serializable, with Cloneable {

    @stub
    // Constructs a SerialBlob object that is a serialized
    // version of the given Blob object.
    def this(blob: Blob) = ???

    @stub
    // Returns a clone of this SerialBlob.
    def clone(): Object = ???

    @stub
    // Compares this SerialBlob to the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // This method frees the SeriableBlob object and releases the
    // resources that it holds.
    def free(): Unit = ???

    @stub
    // Returns this SerialBlob object as an input stream.
    def getBinaryStream(): InputStream = ???

    @stub
    // Returns an
    // InputStream object that contains a partial
    // Blob value, starting with the byte specified by pos, which is
    // length bytes in length.
    def getBinaryStream(pos: Long, length: Long): InputStream = ???

    @stub
    // Copies the specified number of bytes, starting at the given
    // position, from this SerialBlob object to
    // another array of bytes.
    def getBytes(pos: Long, length: Int): Array[Byte] = ???

    @stub
    // Returns a hash code for this SerialBlob.
    def hashCode(): Int = ???

    @stub
    // Retrieves the number of bytes in this SerialBlob
    // object's array of bytes.
    def length(): Long = ???

    @stub
    // Returns the position in this SerialBlob object where
    // the given Blob object begins, starting the search at the
    // specified position.
    def position(pattern: Blob, start: Long): Long = ???

    @stub
    // Returns the position in this SerialBlob object where
    // the given pattern of bytes begins, starting the search at the
    // specified position.
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
    def setBytes(pos: Long, bytes: Array[Byte], offset: Int, length: Int): Int = ???
}
