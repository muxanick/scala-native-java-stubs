package java.sql

import java.io.{InputStream, Reader}
import java.lang.{Class, Object, String}
import java.math.BigDecimal
import java.net.URL

// An input stream that contains a stream of values representing an
// instance of an SQL structured type or an SQL distinct type.
// This interface, used only for custom mapping, is used by the driver
// behind the scenes, and a programmer never directly invokes
// SQLInput methods. The reader methods
// (readLong, readBytes, and so on)
// provide a way  for an implementation of the SQLData
//  interface to read the values in an SQLInput object.
//  And as described in SQLData, calls to reader methods must
// be made in the order that their corresponding attributes appear in the
// SQL definition of the type.
// The method wasNull is used to determine whether
// the last value read was SQL NULL.
// When the method getObject is called with an
// object of a class implementing the interface SQLData,
// the JDBC driver calls the method SQLData.getSQLType
// to determine the SQL type of the user-defined type (UDT)
// being custom mapped. The driver
// creates an instance of SQLInput, populating it with the
// attributes of the UDT.  The driver then passes the input
// stream to the method SQLData.readSQL, which in turn
// calls the SQLInput reader methods
// in its implementation for reading the
// attributes from the input stream.
trait SQLInput {

    @stub
    // Reads an SQL ARRAY value from the stream and returns it as an
    // Array object in the Java programming language.
    def readArray(): Array = ???

    @stub
    // Reads the next attribute in the stream and returns it as a stream of ASCII characters.
    def readAsciiStream(): InputStream = ???

    @stub
    // Reads the next attribute in the stream and returns it as a java.math.BigDecimal
    // object in the Java programming language.
    def readBigDecimal(): BigDecimal = ???

    @stub
    // Reads the next attribute in the stream and returns it as a stream of uninterpreted
    // bytes.
    def readBinaryStream(): InputStream = ???

    @stub
    // Reads an SQL BLOB value from the stream and returns it as a
    // Blob object in the Java programming language.
    def readBlob(): Blob = ???

    @stub
    // Reads the next attribute in the stream and returns it as a boolean
    // in the Java programming language.
    def readBoolean(): Boolean = ???

    @stub
    // Reads the next attribute in the stream and returns it as a byte
    // in the Java programming language.
    def readByte(): Byte = ???

    @stub
    // Reads the next attribute in the stream and returns it as an array of bytes
    // in the Java programming language.
    def readBytes(): Array[Byte] = ???

    @stub
    // Reads the next attribute in the stream and returns it as a stream of Unicode characters.
    def readCharacterStream(): Reader = ???

    @stub
    // Reads an SQL CLOB value from the stream and returns it as a
    // Clob object in the Java programming language.
    def readClob(): Clob = ???

    @stub
    // Reads the next attribute in the stream and returns it as a java.sql.Date object.
    def readDate(): Date = ???

    @stub
    // Reads the next attribute in the stream and returns it as a double
    // in the Java programming language.
    def readDouble(): double = ???

    @stub
    // Reads the next attribute in the stream and returns it as a float
    // in the Java programming language.
    def readFloat(): float = ???

    @stub
    // Reads the next attribute in the stream and returns it as an int
    // in the Java programming language.
    def readInt(): Int = ???

    @stub
    // Reads the next attribute in the stream and returns it as a long
    // in the Java programming language.
    def readLong(): Long = ???

    @stub
    // Reads an SQL NCLOB value from the stream and returns it as a
    // NClob object in the Java programming language.
    def readNClob(): NClob = ???

    @stub
    // Reads the next attribute in the stream and returns it as a String
    // in the Java programming language.
    def readNString(): String = ???

    @stub
    // Reads the datum at the head of the stream and returns it as an
    // Object in the Java programming language.
    def readObject(): Object = ???

    @stub
    // Reads the next attribute in the stream and returns it as an
    // Object in the Java programming language.
    def T: default[T] = ???

    @stub
    // Reads an SQL REF value from the stream and returns it as a
    // Ref object in the Java programming language.
    def readRef(): Ref = ???

    @stub
    // Reads an SQL ROWID value from the stream and returns it as a
    // RowId object in the Java programming language.
    def readRowId(): RowId = ???

    @stub
    // Reads the next attribute in the stream and returns it as a short
    // in the Java programming language.
    def readShort(): Short = ???

    @stub
    // Reads an SQL XML value from the stream and returns it as a
    // SQLXML object in the Java programming language.
    def readSQLXML(): SQLXML = ???

    @stub
    // Reads the next attribute in the stream and returns it as a String
    // in the Java programming language.
    def readString(): String = ???

    @stub
    // Reads the next attribute in the stream and returns it as a java.sql.Time object.
    def readTime(): Time = ???

    @stub
    // Reads the next attribute in the stream and returns it as a java.sql.Timestamp object.
    def readTimestamp(): Timestamp = ???

    @stub
    // Reads an SQL DATALINK value from the stream and returns it as a
    // java.net.URL object in the Java programming language.
    def readURL(): URL = ???
}
