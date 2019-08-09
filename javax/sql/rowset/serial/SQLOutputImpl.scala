package javax.sql.rowset.serial

import java.io.{InputStream, Reader}
import java.lang.{Object, String}
import java.math.BigDecimal
import java.sql.{Array, Blob, Clob, Date, NClob, Ref, RowId, SQLData, SQLOutput, SQLXML, Struct, Time, Timestamp}

// The output stream for writing the attributes of a
// custom-mapped user-defined type (UDT) back to the database.
// The driver uses this interface internally, and its
// methods are never directly invoked by an application programmer.
// 
// When an application calls the
// method PreparedStatement.setObject, the driver
// checks to see whether the value to be written is a UDT with
// a custom mapping.  If it is, there will be an entry in a
// type map containing the Class object for the
// class that implements SQLData for this UDT.
// If the value to be written is an instance of SQLData,
// the driver will create an instance of SQLOutputImpl
// and pass it to the method SQLData.writeSQL.
// The method writeSQL in turn calls the
// appropriate SQLOutputImpl.writeXXX methods
// to write data from the SQLData object to
// the SQLOutputImpl output stream as the
// representation of an SQL user-defined type.
class SQLOutputImpl extends Object with SQLOutput {

    @stub
    // Writes an Array object in the Java
    // programming language to this SQLOutputImpl
    // object.
    def writeArray(x: Array): Unit = ???

    @stub
    // Writes a stream of ASCII characters to this
    // SQLOutputImpl object.
    def writeAsciiStream(x: InputStream): Unit = ???

    @stub
    // Writes a java.math.BigDecimal object in the Java programming
    // language to this SQLOutputImpl object.
    def writeBigDecimal(x: BigDecimal): Unit = ???

    @stub
    // Writes a stream of uninterpreted bytes to this SQLOutputImpl
    // object.
    def writeBinaryStream(x: InputStream): Unit = ???

    @stub
    // Writes a Blob object in the Java programming language
    // to this SQLOutputImpl object.
    def writeBlob(x: Blob): Unit = ???

    @stub
    // Writes a boolean in the Java programming language
    // to this SQLOutputImpl object.
    def writeBoolean(x: Boolean): Unit = ???

    @stub
    // Writes a byte in the Java programming language
    // to this SQLOutputImpl object.
    def writeByte(x: Byte): Unit = ???

    @stub
    // Writes an array of bytes in the Java programming language
    // to this SQLOutputImpl object.
    def writeBytes(x: Array[Byte]): Unit = ???

    @stub
    // Writes a stream of Unicode characters to this
    // SQLOutputImpl object.
    def writeCharacterStream(x: Reader): Unit = ???

    @stub
    // Writes a Clob object in the Java programming language
    // to this SQLOutputImpl object.
    def writeClob(x: Clob): Unit = ???

    @stub
    // Writes a java.sql.Date object in the Java programming
    // language to this SQLOutputImpl object.
    def writeDate(x: Date): Unit = ???

    @stub
    // Writes a double in the Java programming language
    // to this SQLOutputImpl object.
    def writeDouble(x: double): Unit = ???

    @stub
    // Writes a float in the Java programming language
    // to this SQLOutputImpl object.
    def writeFloat(x: float): Unit = ???

    @stub
    // Writes an int in the Java programming language
    // to this SQLOutputImpl object.
    def writeInt(x: Int): Unit = ???

    @stub
    // Writes a long in the Java programming language
    // to this SQLOutputImpl object.
    def writeLong(x: Long): Unit = ???

    @stub
    // Writes an SQL NCLOB value to the stream.
    def writeNClob(x: NClob): Unit = ???

    @stub
    // Writes the next attribute to the stream as a String
    // in the Java programming language.
    def writeNString(x: String): Unit = ???

    @stub
    // Writes to the stream the data contained in the given
    // SQLData object.
    def writeObject(x: SQLData): Unit = ???

    @stub
    // Writes a Ref object in the Java programming language
    // to this SQLOutputImpl object.
    def writeRef(x: Ref): Unit = ???

    @stub
    // Writes an SQL ROWID value to the stream.
    def writeRowId(x: RowId): Unit = ???

    @stub
    // Writes a short in the Java programming language
    // to this SQLOutputImpl object.
    def writeShort(x: Short): Unit = ???

    @stub
    // Writes an SQL XML value to the stream.
    def writeSQLXML(x: SQLXML): Unit = ???

    @stub
    // Writes a String in the Java programming language
    // to this SQLOutputImpl object.
    def writeString(x: String): Unit = ???

    @stub
    // Writes a Struct object in the Java
    // programming language to this SQLOutputImpl
    // object.
    def writeStruct(x: Struct): Unit = ???

    @stub
    // Writes a java.sql.Time object in the Java programming
    // language to this SQLOutputImpl object.
    def writeTime(x: Time): Unit = ???

    @stub
    // Writes a java.sql.Timestamp object in the Java programming
    // language to this SQLOutputImpl object.
    def writeTimestamp(x: Timestamp): Unit = ???
}
