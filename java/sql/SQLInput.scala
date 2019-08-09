package java.sql

import java.io.{InputStream, Reader}
import java.lang.{Class, Object, String}
import java.math.BigDecimal
import java.net.URL
import scala.scalanative.annotation.stub

/** An input stream that contains a stream of values representing an
 *  instance of an SQL structured type or an SQL distinct type.
 *  This interface, used only for custom mapping, is used by the driver
 *  behind the scenes, and a programmer never directly invokes
 *  SQLInput methods. The reader methods
 *  (readLong, readBytes, and so on)
 *  provide a way  for an implementation of the SQLData
 *   interface to read the values in an SQLInput object.
 *   And as described in SQLData, calls to reader methods must
 *  be made in the order that their corresponding attributes appear in the
 *  SQL definition of the type.
 *  The method wasNull is used to determine whether
 *  the last value read was SQL NULL.
 *  When the method getObject is called with an
 *  object of a class implementing the interface SQLData,
 *  the JDBC driver calls the method SQLData.getSQLType
 *  to determine the SQL type of the user-defined type (UDT)
 *  being custom mapped. The driver
 *  creates an instance of SQLInput, populating it with the
 *  attributes of the UDT.  The driver then passes the input
 *  stream to the method SQLData.readSQL, which in turn
 *  calls the SQLInput reader methods
 *  in its implementation for reading the
 *  attributes from the input stream.
 */
trait SQLInput {

    /** Reads an SQL ARRAY value from the stream and returns it as an
     *  Array object in the Java programming language.
     */
    @stub
    def readArray(): Array = ???

    /** Reads the next attribute in the stream and returns it as a stream of ASCII characters. */
    @stub
    def readAsciiStream(): InputStream = ???

    /** Reads the next attribute in the stream and returns it as a java.math.BigDecimal
     *  object in the Java programming language.
     */
    @stub
    def readBigDecimal(): BigDecimal = ???

    /** Reads the next attribute in the stream and returns it as a stream of uninterpreted
     *  bytes.
     */
    @stub
    def readBinaryStream(): InputStream = ???

    /** Reads an SQL BLOB value from the stream and returns it as a
     *  Blob object in the Java programming language.
     */
    @stub
    def readBlob(): Blob = ???

    /** Reads the next attribute in the stream and returns it as a boolean
     *  in the Java programming language.
     */
    @stub
    def readBoolean(): Boolean = ???

    /** Reads the next attribute in the stream and returns it as a byte
     *  in the Java programming language.
     */
    @stub
    def readByte(): Byte = ???

    /** Reads the next attribute in the stream and returns it as an array of bytes
     *  in the Java programming language.
     */
    @stub
    def readBytes(): Array[Byte] = ???

    /** Reads the next attribute in the stream and returns it as a stream of Unicode characters. */
    @stub
    def readCharacterStream(): Reader = ???

    /** Reads an SQL CLOB value from the stream and returns it as a
     *  Clob object in the Java programming language.
     */
    @stub
    def readClob(): Clob = ???

    /** Reads the next attribute in the stream and returns it as a java.sql.Date object. */
    @stub
    def readDate(): Date = ???

    /** Reads the next attribute in the stream and returns it as a double
     *  in the Java programming language.
     */
    @stub
    def readDouble(): Double = ???

    /** Reads the next attribute in the stream and returns it as a float
     *  in the Java programming language.
     */
    @stub
    def readFloat(): Float = ???

    /** Reads the next attribute in the stream and returns it as an int
     *  in the Java programming language.
     */
    @stub
    def readInt(): Int = ???

    /** Reads the next attribute in the stream and returns it as a long
     *  in the Java programming language.
     */
    @stub
    def readLong(): Long = ???

    /** Reads an SQL NCLOB value from the stream and returns it as a
     *  NClob object in the Java programming language.
     */
    @stub
    def readNClob(): NClob = ???

    /** Reads the next attribute in the stream and returns it as a String
     *  in the Java programming language.
     */
    @stub
    def readNString(): String = ???

    /** Reads the datum at the head of the stream and returns it as an
     *  Object in the Java programming language.
     */
    @stub
    def readObject(): Object = ???

    /** Reads the next attribute in the stream and returns it as an
     *  Object in the Java programming language.
     */
    @stub
    val T: default[T] = ???

    /** Reads an SQL REF value from the stream and returns it as a
     *  Ref object in the Java programming language.
     */
    @stub
    def readRef(): Ref = ???

    /** Reads an SQL ROWID value from the stream and returns it as a
     *  RowId object in the Java programming language.
     */
    @stub
    def readRowId(): RowId = ???

    /** Reads the next attribute in the stream and returns it as a short
     *  in the Java programming language.
     */
    @stub
    def readShort(): Short = ???

    /** Reads an SQL XML value from the stream and returns it as a
     *  SQLXML object in the Java programming language.
     */
    @stub
    def readSQLXML(): SQLXML = ???

    /** Reads the next attribute in the stream and returns it as a String
     *  in the Java programming language.
     */
    @stub
    def readString(): String = ???

    /** Reads the next attribute in the stream and returns it as a java.sql.Time object. */
    @stub
    def readTime(): Time = ???

    /** Reads the next attribute in the stream and returns it as a java.sql.Timestamp object. */
    @stub
    def readTimestamp(): Timestamp = ???

    /** Reads an SQL DATALINK value from the stream and returns it as a
     *  java.net.URL object in the Java programming language.
     */
    @stub
    def readURL(): URL = ???

    /** Retrieves whether the last value read was SQL NULL. */
    @stub
    def wasNull(): Boolean = ???
}
