package java.sql

import java.io.{InputStream, Reader}
import java.lang.{Object, String}
import java.math.BigDecimal

/** The output stream for writing the attributes of a user-defined
 *  type back to the database.  This interface, used
 *  only for custom mapping, is used by the driver, and its
 *  methods are never directly invoked by a programmer.
 *  When an object of a class implementing the interface
 *  SQLData is passed as an argument to an SQL statement, the
 *  JDBC driver calls the method SQLData.getSQLType to
 *  determine the  kind of SQL
 *  datum being passed to the database.
 *  The driver then creates an instance of SQLOutput and
 *  passes it to the method SQLData.writeSQL.
 *  The method writeSQL in turn calls the
 *  appropriate SQLOutput writer methods
 *  writeBoolean, writeCharacterStream, and so on)
 *  to write data from the SQLData object to
 *  the SQLOutput output stream as the
 *  representation of an SQL user-defined type.
 */
trait SQLOutput {

    /** Writes an SQL ARRAY value to the stream. */
    @stub
    def writeArray(x: Array): Unit = ???

    /** Writes the next attribute to the stream as a stream of ASCII characters. */
    @stub
    def writeAsciiStream(x: InputStream): Unit = ???

    /** Writes the next attribute to the stream as a java.math.BigDecimal object. */
    @stub
    def writeBigDecimal(x: BigDecimal): Unit = ???

    /** Writes the next attribute to the stream as a stream of uninterpreted
     *  bytes.
     */
    @stub
    def writeBinaryStream(x: InputStream): Unit = ???

    /** Writes an SQL BLOB value to the stream. */
    @stub
    def writeBlob(x: Blob): Unit = ???

    /** Writes the next attribute to the stream as a Java boolean. */
    @stub
    def writeBoolean(x: Boolean): Unit = ???

    /** Writes the next attribute to the stream as a Java byte. */
    @stub
    def writeByte(x: Byte): Unit = ???

    /** Writes the next attribute to the stream as an array of bytes. */
    @stub
    def writeBytes(x: Array[Byte]): Unit = ???

    /** Writes the next attribute to the stream as a stream of Unicode characters. */
    @stub
    def writeCharacterStream(x: Reader): Unit = ???

    /** Writes an SQL CLOB value to the stream. */
    @stub
    def writeClob(x: Clob): Unit = ???

    /** Writes the next attribute to the stream as a java.sql.Date object. */
    @stub
    def writeDate(x: Date): Unit = ???

    /** Writes the next attribute to the stream as a Java double. */
    @stub
    def writeDouble(x: Double): Unit = ???

    /** Writes the next attribute to the stream as a Java float. */
    @stub
    def writeFloat(x: Float): Unit = ???

    /** Writes the next attribute to the stream as a Java int. */
    @stub
    def writeInt(x: Int): Unit = ???

    /** Writes the next attribute to the stream as a Java long. */
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

    /** Writes to the stream the data contained in the given object. */
    @stub
    val Unit: default = ???

    /** Writes to the stream the data contained in the given
     *  SQLData object.
     */
    @stub
    def writeObject(x: SQLData): Unit = ???

    /** Writes an SQL REF value to the stream. */
    @stub
    def writeRef(x: Ref): Unit = ???

    /** Writes an SQL ROWID value to the stream. */
    @stub
    def writeRowId(x: RowId): Unit = ???

    /** Writes the next attribute to the stream as a Java short. */
    @stub
    def writeShort(x: Short): Unit = ???

    /** Writes an SQL XML value to the stream. */
    @stub
    def writeSQLXML(x: SQLXML): Unit = ???

    /** Writes the next attribute to the stream as a String
     *  in the Java programming language.
     */
    @stub
    def writeString(x: String): Unit = ???

    /** Writes an SQL structured type value to the stream. */
    @stub
    def writeStruct(x: Struct): Unit = ???

    /** Writes the next attribute to the stream as a java.sql.Time object. */
    @stub
    def writeTime(x: Time): Unit = ???

    /** Writes the next attribute to the stream as a java.sql.Timestamp object. */
    @stub
    def writeTimestamp(x: Timestamp): Unit = ???
}
