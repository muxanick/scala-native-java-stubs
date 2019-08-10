package javax.sql.rowset.serial

import java.io.{InputStream, OutputStream, Reader, Serializable, Writer}
import java.lang.{Cloneable, Object, String}
import java.sql.Clob
import scala.scalanative.annotation.stub

/** A serialized mapping in the Java programming language of an SQL
 *  CLOB value.
 *  
 *  The SerialClob class provides a constructor for creating
 *  an instance from a Clob object.  Note that the Clob
 *  object should have brought the SQL CLOB value's data over
 *  to the client before a SerialClob object
 *  is constructed from it.  The data of an SQL CLOB value can
 *  be materialized on the client as a stream of Unicode characters.
 *  
 *  SerialClob methods make it possible to get a substring
 *  from a SerialClob object or to locate the start of
 *  a pattern of characters.
 * 
 *   Thread safety 
 * 
 *   A SerialClob is not safe for use by multiple concurrent threads.  If a
 *  SerialClob is to be used by more than one thread then access to the SerialClob
 *  should be controlled by appropriate synchronization.
 */
class SerialClob extends Object with Clob with Serializable with Cloneable {

    /** Constructs a SerialClob object that is a serialized version of
     *  the given char array.
     */
    @stub
    def this(ch: Array[Char]) = ???

    /** Constructs a SerialClob object that is a serialized
     *  version of the given Clob object.
     */
    @stub
    def this(clob: Clob) = ???

    /** Returns a clone of this SerialClob. */
    @stub
    def clone(): Any = ???

    /** Compares this SerialClob to the specified object. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** This method frees the SeriableClob object and releases the
     *  resources that it holds.
     */
    @stub
    def free(): Unit = ???

    /** Retrieves the CLOB value designated by this SerialClob
     *  object as an ascii stream.
     */
    @stub
    def getAsciiStream(): InputStream = ???

    /** Returns this SerialClob object's data as a stream
     *  of Unicode characters.
     */
    @stub
    def getCharacterStream(): Reader = ???

    /** Returns a Reader object that contains a partial
     *  SerialClob value, starting
     *  with the character specified by pos, which is length characters in length.
     */
    @stub
    def getCharacterStream(pos: Long, length: Long): Reader = ???

    /** Returns a copy of the substring contained in this
     *  SerialClob object, starting at the given position
     *  and continuing for the specified number or characters.
     */
    @stub
    def getSubString(pos: Long, length: Int): String = ???

    /** Returns a hash code for this SerialClob. */
    @stub
    def hashCode(): Int = ???

    /** Retrieves the number of characters in this SerialClob
     *  object's array of characters.
     */
    @stub
    def length(): Long = ???

    /** Returns the position in this SerialClob object
     *  where the given Clob signature begins, starting
     *  the search at the specified position.
     */
    @stub
    def position(searchStr: Clob, start: Long): Long = ???

    /** Returns the position in this SerialClob object
     *  where the given String object begins, starting
     *  the search at the specified position.
     */
    @stub
    def position(searchStr: String, start: Long): Long = ???

    /** Retrieves a stream to be used to write Ascii characters to the
     *  CLOB value that this SerialClob object represents,
     *  starting at position pos.
     */
    @stub
    def setAsciiStream(pos: Long): OutputStream = ???

    /** Retrieves a stream to be used to write a stream of Unicode characters
     *  to the CLOB value that this SerialClob object
     *  represents, at position pos.
     */
    @stub
    def setCharacterStream(pos: Long): Writer = ???

    /** Writes the given Java String to the CLOB
     *  value that this SerialClob object represents, at the position
     *  pos.
     */
    @stub
    def setString(pos: Long, str: String): Int = ???

    /** Writes len characters of str, starting
     *  at character offset, to the CLOB value
     *  that this Clob represents.
     */
    @stub
    def setString(pos: Long, str: String, offset: Int, length: Int): Int = ???

    /** Truncates the CLOB value that this SerialClob
     *  object represents so that it has a length of len
     *  characters.
     */
    @stub
    def truncate(length: Long): Unit = ???
}
