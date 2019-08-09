package javax.sql.rowset.serial

import java.io.{InputStream, OutputStream, Reader, Serializable, Writer}
import java.lang.{Cloneable, Object, String}
import java.sql.Clob

// A serialized mapping in the Java programming language of an SQL
// CLOB value.
// 
// The SerialClob class provides a constructor for creating
// an instance from a Clob object.  Note that the Clob
// object should have brought the SQL CLOB value's data over
// to the client before a SerialClob object
// is constructed from it.  The data of an SQL CLOB value can
// be materialized on the client as a stream of Unicode characters.
// 
// SerialClob methods make it possible to get a substring
// from a SerialClob object or to locate the start of
// a pattern of characters.
//
//  Thread safety 
//
//  A SerialClob is not safe for use by multiple concurrent threads.  If a
// SerialClob is to be used by more than one thread then access to the SerialClob
// should be controlled by appropriate synchronization.
class SerialClob extends Object with Clob, with Serializable, with Cloneable {

    @stub
    // Constructs a SerialClob object that is a serialized version of
    // the given char array.
    def this(ch: Array[Char]) = ???

    @stub
    // Returns a clone of this SerialClob.
    def clone(): Object = ???

    @stub
    // Compares this SerialClob to the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // This method frees the SeriableClob object and releases the
    // resources that it holds.
    def free(): Unit = ???

    @stub
    // Retrieves the CLOB value designated by this SerialClob
    // object as an ascii stream.
    def getAsciiStream(): InputStream = ???

    @stub
    // Returns this SerialClob object's data as a stream
    // of Unicode characters.
    def getCharacterStream(): Reader = ???

    @stub
    // Returns a Reader object that contains a partial
    // SerialClob value, starting
    // with the character specified by pos, which is length characters in length.
    def getCharacterStream(pos: Long, length: Long): Reader = ???

    @stub
    // Returns a copy of the substring contained in this
    // SerialClob object, starting at the given position
    // and continuing for the specified number or characters.
    def getSubString(pos: Long, length: Int): String = ???

    @stub
    // Returns a hash code for this SerialClob.
    def hashCode(): Int = ???

    @stub
    // Retrieves the number of characters in this SerialClob
    // object's array of characters.
    def length(): Long = ???

    @stub
    // Returns the position in this SerialClob object
    // where the given Clob signature begins, starting
    // the search at the specified position.
    def position(searchStr: Clob, start: Long): Long = ???

    @stub
    // Returns the position in this SerialClob object
    // where the given String object begins, starting
    // the search at the specified position.
    def position(searchStr: String, start: Long): Long = ???

    @stub
    // Retrieves a stream to be used to write Ascii characters to the
    // CLOB value that this SerialClob object represents,
    // starting at position pos.
    def setAsciiStream(pos: Long): OutputStream = ???

    @stub
    // Retrieves a stream to be used to write a stream of Unicode characters
    // to the CLOB value that this SerialClob object
    // represents, at position pos.
    def setCharacterStream(pos: Long): Writer = ???

    @stub
    // Writes the given Java String to the CLOB
    // value that this SerialClob object represents, at the position
    // pos.
    def setString(pos: Long, str: String): Int = ???

    @stub
    // Writes len characters of str, starting
    // at character offset, to the CLOB value
    // that this Clob represents.
    def setString(pos: Long, str: String, offset: Int, length: Int): Int = ???
}
