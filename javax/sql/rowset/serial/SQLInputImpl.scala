package javax.sql.rowset.serial

import java.io.{InputStream, Reader}
import java.lang.{Object, String}
import java.math.BigDecimal
import java.net.URL
import java.sql.{Array, Blob, Clob, Date, NClob, Ref, RowId, SQLInput, SQLXML, Time, Timestamp}

// An input stream used for custom mapping user-defined types (UDTs).
// An SQLInputImpl object is an input stream that contains a
// stream of values that are the attributes of a UDT.
// 
// This class is used by the driver behind the scenes when the method
// getObject is called on an SQL structured or distinct type
// that has a custom mapping; a programmer never invokes
// SQLInputImpl methods directly. They are provided here as a
// convenience for those who write RowSet implementations.
// 
// The SQLInputImpl class provides a set of
// reader methods analogous to the ResultSet getter
// methods.  These methods make it possible to read the values in an
// SQLInputImpl object.
// 
// The method wasNull is used to determine whether the
// the last value read was SQL NULL.
// When the method getObject is called with an
// object of a class implementing the interface SQLData,
// the JDBC driver calls the method SQLData.getSQLType
// to determine the SQL type of the UDT being custom mapped. The driver
// creates an instance of SQLInputImpl, populating it with the
// attributes of the UDT.  The driver then passes the input
// stream to the method SQLData.readSQL, which in turn
// calls the SQLInputImpl reader methods
// to read the attributes from the input stream.
class SQLInputImpl extends Object with SQLInput {

    @stub
    // Reads an SQL ARRAY value from the stream and
    // returns it as an Array object in the Java programming
    // language.
    def readArray(): Array = ???

    @stub
    // Returns the next attribute in this SQLInputImpl object
    // as a stream of ASCII characters.
    def readAsciiStream(): InputStream = ???

    @stub
    // Retrieves the next attribute in this SQLInputImpl object
    // as a java.math.BigDecimal.
    def readBigDecimal(): BigDecimal = ???

    @stub
    // Returns the next attribute in this SQLInputImpl object
    // as a stream of uninterpreted bytes.
    def readBinaryStream(): InputStream = ???

    @stub
    // Retrieves the BLOB value at the head of this
    // SQLInputImpl object as a Blob object
    // in the Java programming language.
    def readBlob(): Blob = ???

    @stub
    // Retrieves the next attribute in this SQLInputImpl object as
    // a boolean in the Java programming language.
    def readBoolean(): Boolean = ???

    @stub
    // Retrieves the next attribute in this SQLInputImpl object as
    // a byte in the Java programming language.
    def readByte(): Byte = ???

    @stub
    // Retrieves the next attribute in this SQLInputImpl object
    // as an array of bytes.
    def readBytes(): Array[Byte] = ???

    @stub
    // Retrieves the next attribute in this SQLInputImpl object
    // as a stream of Unicode characters.
    def readCharacterStream(): Reader = ???

    @stub
    // Retrieves the CLOB value at the head of this
    // SQLInputImpl object as a Clob object
    // in the Java programming language.
    def readClob(): Clob = ???

    @stub
    // Retrieves the next attribute in this SQLInputImpl as
    // a java.sql.Date object.
    def readDate(): Date = ???

    @stub
    // Retrieves the next attribute in this SQLInputImpl object
    // as a double in the Java programming language.
    def readDouble(): double = ???

    @stub
    // Retrieves the next attribute in this SQLInputImpl object
    // as a float in the Java programming language.
    def readFloat(): float = ???

    @stub
    // Retrieves the next attribute in this SQLInputImpl object
    // as an int in the Java programming language.
    def readInt(): Int = ???

    @stub
    // Retrieves the next attribute in this SQLInputImpl object
    // as a long in the Java programming language.
    def readLong(): Long = ???

    @stub
    // Reads an SQL NCLOB value from the stream and returns it as a
    // Clob object in the Java programming language.
    def readNClob(): NClob = ???

    @stub
    // Reads the next attribute in the stream and returns it as a String
    // in the Java programming language.
    def readNString(): String = ???

    @stub
    // Retrieves the value at the head of this SQLInputImpl
    // object as an Object in the Java programming language.
    def readObject(): Object = ???

    @stub
    // Retrieves the value at the head of this SQLInputImpl object
    // as a Ref object in the Java programming language.
    def readRef(): Ref = ???

    @stub
    // Reads an SQL ROWID value from the stream and returns it as a
    // RowId object in the Java programming language.
    def readRowId(): RowId = ???

    @stub
    // Retrieves the next attribute in this SQLInputImpl object
    // as a short in the Java programming language.
    def readShort(): Short = ???

    @stub
    // Reads an SQL XML value from the stream and returns it as a
    // SQLXML object in the Java programming language.
    def readSQLXML(): SQLXML = ???

    @stub
    // Retrieves the next attribute in this SQLInputImpl object as
    // a String in the Java programming language.
    def readString(): String = ???

    @stub
    // Retrieves the next attribute in this SQLInputImpl object as
    // a java.sql.Time object.
    def readTime(): Time = ???

    @stub
    // Retrieves the next attribute in this SQLInputImpl object as
    // a java.sql.Timestamp object.
    def readTimestamp(): Timestamp = ???

    @stub
    // Reads an SQL DATALINK value from the stream and
    // returns it as an URL object in the Java programming
    // language.
    def readURL(): URL = ???
}
