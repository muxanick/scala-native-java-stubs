package java.sql

import java.io.{InputStream, OutputStream, Reader, Writer}
import java.lang.String
import scala.scalanative.annotation.stub

/** The mapping in the Java™ programming language
 *  for the SQL CLOB type.
 *  An SQL CLOB is a built-in type
 *  that stores a Character Large Object as a column value in a row of
 *  a database table.
 *  By default drivers implement a Clob object using an SQL
 *  locator(CLOB), which means that a Clob object
 *  contains a logical pointer to the SQL CLOB data rather than
 *  the data itself. A Clob object is valid for the duration
 *  of the transaction in which it was created.
 *  The Clob interface provides methods for getting the
 *  length of an SQL CLOB (Character Large Object) value,
 *  for materializing a CLOB value on the client, and for
 *  searching for a substring or CLOB object within a
 *  CLOB value.
 *  Methods in the interfaces ResultSet,
 *  CallableStatement, and PreparedStatement, such as
 *  getClob and setClob allow a programmer to
 *  access an SQL CLOB value.  In addition, this interface
 *  has methods for updating a CLOB value.
 *  
 *  All methods on the Clob interface must be fully implemented if the
 *  JDBC driver supports the data type.
 */
trait Clob {

    /** This method frees the Clob object and releases the resources the resources
     *  that it holds.
     */
    @stub
    def free(): Unit = ???

    /** Retrieves the CLOB value designated by this Clob
     *  object as an ascii stream.
     */
    @stub
    def getAsciiStream(): InputStream = ???

    /** Retrieves the CLOB value designated by this Clob
     *  object as a java.io.Reader object (or as a stream of
     *  characters).
     */
    @stub
    def getCharacterStream(): Reader = ???

    /** Returns a Reader object that contains a partial Clob value, starting
     *  with the character specified by pos, which is length characters in length.
     */
    @stub
    def getCharacterStream(pos: Long, length: Long): Reader = ???

    /** Retrieves a copy of the specified substring
     *  in the CLOB value
     *  designated by this Clob object.
     */
    @stub
    def getSubString(pos: Long, length: Int): String = ???

    /** Retrieves the number of characters
     *  in the CLOB value
     *  designated by this Clob object.
     */
    @stub
    def length(): Long = ???

    /** Retrieves the character position at which the specified
     *  Clob object searchstr appears in this
     *  Clob object.
     */
    @stub
    def position(searchstr: Clob, start: Long): Long = ???

    /** Retrieves the character position at which the specified substring
     *  searchstr appears in the SQL CLOB value
     *  represented by this Clob object.
     */
    @stub
    def position(searchstr: String, start: Long): Long = ???

    /** Retrieves a stream to be used to write Ascii characters to the
     *  CLOB value that this Clob object represents,
     *  starting at position pos.
     */
    @stub
    def setAsciiStream(pos: Long): OutputStream = ???

    /** Retrieves a stream to be used to write a stream of Unicode characters
     *  to the CLOB value that this Clob object
     *  represents, at position pos.
     */
    @stub
    def setCharacterStream(pos: Long): Writer = ???

    /** Writes the given Java String to the CLOB
     *  value that this Clob object designates at the position
     *  pos.
     */
    @stub
    def setString(pos: Long, str: String): Int = ???

    /** Writes len characters of str, starting
     *  at character offset, to the CLOB value
     *  that this Clob represents.
     */
    @stub
    def setString(pos: Long, str: String, offset: Int, len: Int): Int = ???

    /** Truncates the CLOB value that this Clob
     *  designates to have a length of len
     *  characters.
     */
    @stub
    def truncate(len: Long): Unit = ???
}
