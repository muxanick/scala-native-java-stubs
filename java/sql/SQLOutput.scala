package java.sql

import java.io.{InputStream, Reader}
import java.lang.{Object, String}
import java.math.BigDecimal

// The output stream for writing the attributes of a user-defined
// type back to the database.  This interface, used
// only for custom mapping, is used by the driver, and its
// methods are never directly invoked by a programmer.
// When an object of a class implementing the interface
// SQLData is passed as an argument to an SQL statement, the
// JDBC driver calls the method SQLData.getSQLType to
// determine the  kind of SQL
// datum being passed to the database.
// The driver then creates an instance of SQLOutput and
// passes it to the method SQLData.writeSQL.
// The method writeSQL in turn calls the
// appropriate SQLOutput writer methods
// writeBoolean, writeCharacterStream, and so on)
// to write data from the SQLData object to
// the SQLOutput output stream as the
// representation of an SQL user-defined type.
trait SQLOutput {

    @stub
    // Writes an SQL ARRAY value to the stream.
    def writeArray(x: Array): Unit = ???

    @stub
    // Writes the next attribute to the stream as a stream of ASCII characters.
    def writeAsciiStream(x: InputStream): Unit = ???

    @stub
    // Writes the next attribute to the stream as a java.math.BigDecimal object.
    def writeBigDecimal(x: BigDecimal): Unit = ???

    @stub
    // Writes the next attribute to the stream as a stream of uninterpreted
    // bytes.
    def writeBinaryStream(x: InputStream): Unit = ???

    @stub
    // Writes an SQL BLOB value to the stream.
    def writeBlob(x: Blob): Unit = ???

    @stub
    // Writes the next attribute to the stream as a Java boolean.
    def writeBoolean(x: Boolean): Unit = ???

    @stub
    // Writes the next attribute to the stream as a Java byte.
    def writeByte(x: Byte): Unit = ???

    @stub
    // Writes the next attribute to the stream as an array of bytes.
    def writeBytes(x: Array[Byte]): Unit = ???

    @stub
    // Writes the next attribute to the stream as a stream of Unicode characters.
    def writeCharacterStream(x: Reader): Unit = ???

    @stub
    // Writes an SQL CLOB value to the stream.
    def writeClob(x: Clob): Unit = ???

    @stub
    // Writes the next attribute to the stream as a java.sql.Date object.
    def writeDate(x: Date): Unit = ???

    @stub
    // Writes the next attribute to the stream as a Java double.
    def writeDouble(x: double): Unit = ???

    @stub
    // Writes the next attribute to the stream as a Java float.
    def writeFloat(x: float): Unit = ???

    @stub
    // Writes the next attribute to the stream as a Java int.
    def writeInt(x: Int): Unit = ???

    @stub
    // Writes the next attribute to the stream as a Java long.
    def writeLong(x: Long): Unit = ???

    @stub
    // Writes an SQL NCLOB value to the stream.
    def writeNClob(x: NClob): Unit = ???

    @stub
    // Writes the next attribute to the stream as a String
    // in the Java programming language.
    def writeNString(x: String): Unit = ???

    @stub
    // Writes to the stream the data contained in the given object.
    def Unit: default = ???

    @stub
    // Writes to the stream the data contained in the given
    // SQLData object.
    def writeObject(x: SQLData): Unit = ???

    @stub
    // Writes an SQL REF value to the stream.
    def writeRef(x: Ref): Unit = ???

    @stub
    // Writes an SQL ROWID value to the stream.
    def writeRowId(x: RowId): Unit = ???

    @stub
    // Writes the next attribute to the stream as a Java short.
    def writeShort(x: Short): Unit = ???

    @stub
    // Writes an SQL XML value to the stream.
    def writeSQLXML(x: SQLXML): Unit = ???

    @stub
    // Writes the next attribute to the stream as a String
    // in the Java programming language.
    def writeString(x: String): Unit = ???

    @stub
    // Writes an SQL structured type value to the stream.
    def writeStruct(x: Struct): Unit = ???

    @stub
    // Writes the next attribute to the stream as a java.sql.Time object.
    def writeTime(x: Time): Unit = ???

    @stub
    // Writes the next attribute to the stream as a java.sql.Timestamp object.
    def writeTimestamp(x: Timestamp): Unit = ???
}
