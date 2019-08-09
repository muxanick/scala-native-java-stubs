package javax.sql.rowset.serial

import java.io.{InputStream, Reader}
import java.lang.{Object, String}
import java.math.BigDecimal
import java.net.URL
import java.sql.{Array, Blob, Clob, Date, NClob, Ref, RowId, SQLData, SQLOutput, SQLXML, Struct, Time, Timestamp}
import java.util.{Map, Vector}
import scala.scalanative.annotation.stub

/** The output stream for writing the attributes of a
 *  custom-mapped user-defined type (UDT) back to the database.
 *  The driver uses this interface internally, and its
 *  methods are never directly invoked by an application programmer.
 *  
 *  When an application calls the
 *  method PreparedStatement.setObject, the driver
 *  checks to see whether the value to be written is a UDT with
 *  a custom mapping.  If it is, there will be an entry in a
 *  type map containing the Class object for the
 *  class that implements SQLData for this UDT.
 *  If the value to be written is an instance of SQLData,
 *  the driver will create an instance of SQLOutputImpl
 *  and pass it to the method SQLData.writeSQL.
 *  The method writeSQL in turn calls the
 *  appropriate SQLOutputImpl.writeXXX methods
 *  to write data from the SQLData object to
 *  the SQLOutputImpl output stream as the
 *  representation of an SQL user-defined type.
 */
class SQLOutputImpl extends Object with SQLOutput {

    /** Creates a new SQLOutputImpl object
     *  initialized with the given vector of attributes and
     *  type map.
     */
    @stub
    def this(attributes: Vector[_], map: Map[String, _]) = ???

    /** Writes an Array object in the Java
     *  programming language to this SQLOutputImpl
     *  object.
     */
    @stub
    def writeArray(x: Array): Unit = ???

    /** Writes a stream of ASCII characters to this
     *  SQLOutputImpl object.
     */
    @stub
    def writeAsciiStream(x: InputStream): Unit = ???

    /** Writes a java.math.BigDecimal object in the Java programming
     *  language to this SQLOutputImpl object.
     */
    @stub
    def writeBigDecimal(x: BigDecimal): Unit = ???

    /** Writes a stream of uninterpreted bytes to this SQLOutputImpl
     *  object.
     */
    @stub
    def writeBinaryStream(x: InputStream): Unit = ???

    /** Writes a Blob object in the Java programming language
     *  to this SQLOutputImpl object.
     */
    @stub
    def writeBlob(x: Blob): Unit = ???

    /** Writes a boolean in the Java programming language
     *  to this SQLOutputImpl object.
     */
    @stub
    def writeBoolean(x: Boolean): Unit = ???

    /** Writes a byte in the Java programming language
     *  to this SQLOutputImpl object.
     */
    @stub
    def writeByte(x: Byte): Unit = ???

    /** Writes an array of bytes in the Java programming language
     *  to this SQLOutputImpl object.
     */
    @stub
    def writeBytes(x: Array[Byte]): Unit = ???

    /** Writes a stream of Unicode characters to this
     *  SQLOutputImpl object.
     */
    @stub
    def writeCharacterStream(x: Reader): Unit = ???

    /** Writes a Clob object in the Java programming language
     *  to this SQLOutputImpl object.
     */
    @stub
    def writeClob(x: Clob): Unit = ???

    /** Writes a java.sql.Date object in the Java programming
     *  language to this SQLOutputImpl object.
     */
    @stub
    def writeDate(x: Date): Unit = ???

    /** Writes a double in the Java programming language
     *  to this SQLOutputImpl object.
     */
    @stub
    def writeDouble(x: Double): Unit = ???

    /** Writes a float in the Java programming language
     *  to this SQLOutputImpl object.
     */
    @stub
    def writeFloat(x: Float): Unit = ???

    /** Writes an int in the Java programming language
     *  to this SQLOutputImpl object.
     */
    @stub
    def writeInt(x: Int): Unit = ???

    /** Writes a long in the Java programming language
     *  to this SQLOutputImpl object.
     */
    @stub
    def writeLong(x: Long): Unit = ???

    /** Writes an SQL NCLOB value to the stream. */
    @stub
    def writeNClob(x: NClob): Unit = ???

    /** Writes the next attribute to the stream as a String
     *  in the Java programming language.
     */
    @stub
    def writeNString(x: String): Unit = ???

    /** Writes to the stream the data contained in the given
     *  SQLData object.
     */
    @stub
    def writeObject(x: SQLData): Unit = ???

    /** Writes a Ref object in the Java programming language
     *  to this SQLOutputImpl object.
     */
    @stub
    def writeRef(x: Ref): Unit = ???

    /** Writes an SQL ROWID value to the stream. */
    @stub
    def writeRowId(x: RowId): Unit = ???

    /** Writes a short in the Java programming language
     *  to this SQLOutputImpl object.
     */
    @stub
    def writeShort(x: Short): Unit = ???

    /** Writes an SQL XML value to the stream. */
    @stub
    def writeSQLXML(x: SQLXML): Unit = ???

    /** Writes a String in the Java programming language
     *  to this SQLOutputImpl object.
     */
    @stub
    def writeString(x: String): Unit = ???

    /** Writes a Struct object in the Java
     *  programming language to this SQLOutputImpl
     *  object.
     */
    @stub
    def writeStruct(x: Struct): Unit = ???

    /** Writes a java.sql.Time object in the Java programming
     *  language to this SQLOutputImpl object.
     */
    @stub
    def writeTime(x: Time): Unit = ???

    /** Writes a java.sql.Timestamp object in the Java programming
     *  language to this SQLOutputImpl object.
     */
    @stub
    def writeTimestamp(x: Timestamp): Unit = ???

    /** Writes an java.sql.Type.DATALINK object in the Java
     *  programming language to this SQLOutputImpl object.
     */
    @stub
    def writeURL(url: URL): Unit = ???
}
