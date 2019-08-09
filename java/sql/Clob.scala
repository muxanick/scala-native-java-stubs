package java.sql

import java.io.{InputStream, OutputStream, Reader, Writer}
import java.lang.String

// The mapping in the Java™ programming language
// for the SQL CLOB type.
// An SQL CLOB is a built-in type
// that stores a Character Large Object as a column value in a row of
// a database table.
// By default drivers implement a Clob object using an SQL
// locator(CLOB), which means that a Clob object
// contains a logical pointer to the SQL CLOB data rather than
// the data itself. A Clob object is valid for the duration
// of the transaction in which it was created.
// The Clob interface provides methods for getting the
// length of an SQL CLOB (Character Large Object) value,
// for materializing a CLOB value on the client, and for
// searching for a substring or CLOB object within a
// CLOB value.
// Methods in the interfaces ResultSet,
// CallableStatement, and PreparedStatement, such as
// getClob and setClob allow a programmer to
// access an SQL CLOB value.  In addition, this interface
// has methods for updating a CLOB value.
// 
// All methods on the Clob interface must be fully implemented if the
// JDBC driver supports the data type.
trait Clob {

    @stub
    // This method frees the Clob object and releases the resources the resources
    // that it holds.
    def free(): Unit = ???

    @stub
    // Retrieves the CLOB value designated by this Clob
    // object as an ascii stream.
    def getAsciiStream(): InputStream = ???

    @stub
    // Retrieves the CLOB value designated by this Clob
    // object as a java.io.Reader object (or as a stream of
    // characters).
    def getCharacterStream(): Reader = ???

    @stub
    // Returns a Reader object that contains a partial Clob value, starting
    // with the character specified by pos, which is length characters in length.
    def getCharacterStream(pos: Long, length: Long): Reader = ???

    @stub
    // Retrieves a copy of the specified substring
    // in the CLOB value
    // designated by this Clob object.
    def getSubString(pos: Long, length: Int): String = ???

    @stub
    // Retrieves the number of characters
    // in the CLOB value
    // designated by this Clob object.
    def length(): Long = ???

    @stub
    // Retrieves the character position at which the specified
    // Clob object searchstr appears in this
    // Clob object.
    def position(searchstr: Clob, start: Long): Long = ???

    @stub
    // Retrieves the character position at which the specified substring
    // searchstr appears in the SQL CLOB value
    // represented by this Clob object.
    def position(searchstr: String, start: Long): Long = ???

    @stub
    // Retrieves a stream to be used to write Ascii characters to the
    // CLOB value that this Clob object represents,
    // starting at position pos.
    def setAsciiStream(pos: Long): OutputStream = ???

    @stub
    // Retrieves a stream to be used to write a stream of Unicode characters
    // to the CLOB value that this Clob object
    // represents, at position pos.
    def setCharacterStream(pos: Long): Writer = ???

    @stub
    // Writes the given Java String to the CLOB
    // value that this Clob object designates at the position
    // pos.
    def setString(pos: Long, str: String): Int = ???

    @stub
    // Writes len characters of str, starting
    // at character offset, to the CLOB value
    // that this Clob represents.
    def setString(pos: Long, str: String, offset: Int, len: Int): Int = ???
}
