package javax.sql.rowset.serial

import java.io.{InputStream, Reader}
import java.lang.{Class, Object, String}
import java.math.BigDecimal
import java.net.URL
import java.sql.{Array, Blob, Clob, Date, NClob, Ref, RowId, SQLInput, SQLXML, Time, Timestamp}
import java.util.Map
import scala.scalanative.annotation.stub

/** An input stream used for custom mapping user-defined types (UDTs).
 *  An SQLInputImpl object is an input stream that contains a
 *  stream of values that are the attributes of a UDT.
 *  
 *  This class is used by the driver behind the scenes when the method
 *  getObject is called on an SQL structured or distinct type
 *  that has a custom mapping; a programmer never invokes
 *  SQLInputImpl methods directly. They are provided here as a
 *  convenience for those who write RowSet implementations.
 *  
 *  The SQLInputImpl class provides a set of
 *  reader methods analogous to the ResultSet getter
 *  methods.  These methods make it possible to read the values in an
 *  SQLInputImpl object.
 *  
 *  The method wasNull is used to determine whether the
 *  the last value read was SQL NULL.
 *  When the method getObject is called with an
 *  object of a class implementing the interface SQLData,
 *  the JDBC driver calls the method SQLData.getSQLType
 *  to determine the SQL type of the UDT being custom mapped. The driver
 *  creates an instance of SQLInputImpl, populating it with the
 *  attributes of the UDT.  The driver then passes the input
 *  stream to the method SQLData.readSQL, which in turn
 *  calls the SQLInputImpl reader methods
 *  to read the attributes from the input stream.
 */
class SQLInputImpl extends Object with SQLInput {

    /** Creates an SQLInputImpl object initialized with the
     *  given array of attributes and the given type map.
     */
    @stub
    def this(attributes: Array[Object], map: Map[String, Class[_]]) = ???

    /** Reads an SQL ARRAY value from the stream and
     *  returns it as an Array object in the Java programming
     *  language.
     */
    @stub
    def readArray(): Array = ???

    /** Returns the next attribute in this SQLInputImpl object
     *  as a stream of ASCII characters.
     */
    @stub
    def readAsciiStream(): InputStream = ???

    /** Retrieves the next attribute in this SQLInputImpl object
     *  as a java.math.BigDecimal.
     */
    @stub
    def readBigDecimal(): BigDecimal = ???

    /** Returns the next attribute in this SQLInputImpl object
     *  as a stream of uninterpreted bytes.
     */
    @stub
    def readBinaryStream(): InputStream = ???

    /** Retrieves the BLOB value at the head of this
     *  SQLInputImpl object as a Blob object
     *  in the Java programming language.
     */
    @stub
    def readBlob(): Blob = ???

    /** Retrieves the next attribute in this SQLInputImpl object as
     *  a boolean in the Java programming language.
     */
    @stub
    def readBoolean(): Boolean = ???

    /** Retrieves the next attribute in this SQLInputImpl object as
     *  a byte in the Java programming language.
     */
    @stub
    def readByte(): Byte = ???

    /** Retrieves the next attribute in this SQLInputImpl object
     *  as an array of bytes.
     */
    @stub
    def readBytes(): Array[Byte] = ???

    /** Retrieves the next attribute in this SQLInputImpl object
     *  as a stream of Unicode characters.
     */
    @stub
    def readCharacterStream(): Reader = ???

    /** Retrieves the CLOB value at the head of this
     *  SQLInputImpl object as a Clob object
     *  in the Java programming language.
     */
    @stub
    def readClob(): Clob = ???

    /** Retrieves the next attribute in this SQLInputImpl as
     *  a java.sql.Date object.
     */
    @stub
    def readDate(): Date = ???

    /** Retrieves the next attribute in this SQLInputImpl object
     *  as a double in the Java programming language.
     */
    @stub
    def readDouble(): Double = ???

    /** Retrieves the next attribute in this SQLInputImpl object
     *  as a float in the Java programming language.
     */
    @stub
    def readFloat(): Float = ???

    /** Retrieves the next attribute in this SQLInputImpl object
     *  as an int in the Java programming language.
     */
    @stub
    def readInt(): Int = ???

    /** Retrieves the next attribute in this SQLInputImpl object
     *  as a long in the Java programming language.
     */
    @stub
    def readLong(): Long = ???

    /** Reads an SQL NCLOB value from the stream and returns it as a
     *  Clob object in the Java programming language.
     */
    @stub
    def readNClob(): NClob = ???

    /** Reads the next attribute in the stream and returns it as a String
     *  in the Java programming language.
     */
    @stub
    def readNString(): String = ???

    /** Retrieves the value at the head of this SQLInputImpl
     *  object as an Object in the Java programming language.
     */
    @stub
    def readObject(): Object = ???

    /** Retrieves the value at the head of this SQLInputImpl object
     *  as a Ref object in the Java programming language.
     */
    @stub
    def readRef(): Ref = ???

    /** Reads an SQL ROWID value from the stream and returns it as a
     *  RowId object in the Java programming language.
     */
    @stub
    def readRowId(): RowId = ???

    /** Retrieves the next attribute in this SQLInputImpl object
     *  as a short in the Java programming language.
     */
    @stub
    def readShort(): Short = ???

    /** Reads an SQL XML value from the stream and returns it as a
     *  SQLXML object in the Java programming language.
     */
    @stub
    def readSQLXML(): SQLXML = ???

    /** Retrieves the next attribute in this SQLInputImpl object as
     *  a String in the Java programming language.
     */
    @stub
    def readString(): String = ???

    /** Retrieves the next attribute in this SQLInputImpl object as
     *  a java.sql.Time object.
     */
    @stub
    def readTime(): Time = ???

    /** Retrieves the next attribute in this SQLInputImpl object as
     *  a java.sql.Timestamp object.
     */
    @stub
    def readTimestamp(): Timestamp = ???

    /** Reads an SQL DATALINK value from the stream and
     *  returns it as an URL object in the Java programming
     *  language.
     */
    @stub
    def readURL(): URL = ???

    /** Ascertains whether the last value read from this
     *  SQLInputImpl object was null.
     */
    @stub
    def wasNull(): Boolean = ???
}
