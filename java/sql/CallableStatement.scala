package java.sql

import java.io.{InputStream, Reader}
import java.lang.{Class, Object, String}
import java.math.BigDecimal
import java.net.URL
import java.util.{Calendar, Map}

// The interface used to execute SQL stored procedures.  The JDBC API
// provides a stored procedure SQL escape syntax that allows stored procedures
// to be called in a standard way for all RDBMSs. This escape syntax has one
// form that includes a result parameter and one that does not. If used, the result
// parameter must be registered as an OUT parameter. The other parameters
// can be used for input, output or both. Parameters are referred to
// sequentially, by number, with the first parameter being 1.
// 
//   {?= call <procedure-name>[(<arg1>,<arg2>, ...)]}
//   {call <procedure-name>[(<arg1>,<arg2>, ...)]}
// 
// 
// IN parameter values are set using the set methods inherited from
// PreparedStatement.  The type of all OUT parameters must be
// registered prior to executing the stored procedure; their values
// are retrieved after execution via the get methods provided here.
// 
// A CallableStatement can return one ResultSet object or
// multiple ResultSet objects.  Multiple
// ResultSet objects are handled using operations
// inherited from Statement.
// 
// For maximum portability, a call's ResultSet objects and
// update counts should be processed prior to getting the values of output
// parameters.
trait CallableStatement extends PreparedStatement {

    @stub
    // Retrieves the value of the designated JDBC ARRAY parameter as an
    // Array object in the Java programming language.
    def getArray(parameterIndex: Int): Array = ???

    @stub
    // Retrieves the value of a JDBC ARRAY parameter as an
    // Array object in the Java programming language.
    def getArray(parameterName: String): Array = ???

    @stub
    // Retrieves the value of the designated JDBC NUMERIC parameter as a
    // java.math.BigDecimal object with as many digits to the
    // right of the decimal point as the value contains.
    def getBigDecimal(parameterIndex: Int): BigDecimal = ???

    @stub
    // Deprecated. 
    //use getBigDecimal(int parameterIndex)
    //             or getBigDecimal(String parameterName)
    //
    def getBigDecimal(parameterIndex: Int, scale: Int): BigDecimal = ???

    @stub
    // Retrieves the value of a JDBC NUMERIC parameter as a
    // java.math.BigDecimal object with as many digits to the
    // right of the decimal point as the value contains.
    def getBigDecimal(parameterName: String): BigDecimal = ???

    @stub
    // Retrieves the value of the designated JDBC BLOB parameter as a
    // Blob object in the Java programming language.
    def getBlob(parameterIndex: Int): Blob = ???

    @stub
    // Retrieves the value of a JDBC BLOB parameter as a
    // Blob object in the Java programming language.
    def getBlob(parameterName: String): Blob = ???

    @stub
    // Retrieves the value of the designated JDBC BIT
    // or BOOLEAN parameter as a
    // boolean in the Java programming language.
    def getBoolean(parameterIndex: Int): Boolean = ???

    @stub
    // Retrieves the value of a JDBC BIT or BOOLEAN
    // parameter as a
    // boolean in the Java programming language.
    def getBoolean(parameterName: String): Boolean = ???

    @stub
    // Retrieves the value of the designated JDBC TINYINT parameter
    // as a byte in the Java programming language.
    def getByte(parameterIndex: Int): Byte = ???

    @stub
    // Retrieves the value of a JDBC TINYINT parameter as a byte
    // in the Java programming language.
    def getByte(parameterName: String): Byte = ???

    @stub
    // Retrieves the value of the designated JDBC BINARY or
    // VARBINARY parameter as an array of byte
    // values in the Java programming language.
    def getBytes(parameterIndex: Int): Array[Byte] = ???

    @stub
    // Retrieves the value of a JDBC BINARY or VARBINARY
    // parameter as an array of byte values in the Java
    // programming language.
    def getBytes(parameterName: String): Array[Byte] = ???

    @stub
    // Retrieves the value of the designated parameter as a
    // java.io.Reader object in the Java programming language.
    def getCharacterStream(parameterIndex: Int): Reader = ???

    @stub
    // Retrieves the value of the designated parameter as a
    // java.io.Reader object in the Java programming language.
    def getCharacterStream(parameterName: String): Reader = ???

    @stub
    // Retrieves the value of the designated JDBC CLOB parameter as a
    // java.sql.Clob object in the Java programming language.
    def getClob(parameterIndex: Int): Clob = ???

    @stub
    // Retrieves the value of a JDBC CLOB parameter as a
    // java.sql.Clob object in the Java programming language.
    def getClob(parameterName: String): Clob = ???

    @stub
    // Retrieves the value of the designated JDBC DATE parameter as a
    // java.sql.Date object.
    def getDate(parameterIndex: Int): Date = ???

    @stub
    // Retrieves the value of the designated JDBC DATE parameter as a
    // java.sql.Date object, using
    // the given Calendar object
    // to construct the date.
    def getDate(parameterIndex: Int, cal: Calendar): Date = ???

    @stub
    // Retrieves the value of a JDBC DATE parameter as a
    // java.sql.Date object.
    def getDate(parameterName: String): Date = ???

    @stub
    // Retrieves the value of a JDBC DATE parameter as a
    // java.sql.Date object, using
    // the given Calendar object
    // to construct the date.
    def getDate(parameterName: String, cal: Calendar): Date = ???

    @stub
    // Retrieves the value of the designated JDBC DOUBLE parameter as a double
    // in the Java programming language.
    def getDouble(parameterIndex: Int): double = ???

    @stub
    // Retrieves the value of a JDBC DOUBLE parameter as a double
    // in the Java programming language.
    def getDouble(parameterName: String): double = ???

    @stub
    // Retrieves the value of the designated JDBC FLOAT parameter
    // as a float in the Java programming language.
    def getFloat(parameterIndex: Int): float = ???

    @stub
    // Retrieves the value of a JDBC FLOAT parameter as a float
    // in the Java programming language.
    def getFloat(parameterName: String): float = ???

    @stub
    // Retrieves the value of the designated JDBC INTEGER parameter
    // as an int in the Java programming language.
    def getInt(parameterIndex: Int): Int = ???

    @stub
    // Retrieves the value of a JDBC INTEGER parameter as an int
    // in the Java programming language.
    def getInt(parameterName: String): Int = ???

    @stub
    // Retrieves the value of the designated JDBC BIGINT parameter
    // as a long in the Java programming language.
    def getLong(parameterIndex: Int): Long = ???

    @stub
    // Retrieves the value of a JDBC BIGINT parameter as a long
    // in the Java programming language.
    def getLong(parameterName: String): Long = ???

    @stub
    // Retrieves the value of the designated parameter as a
    // java.io.Reader object in the Java programming language.
    def getNCharacterStream(parameterIndex: Int): Reader = ???

    @stub
    // Retrieves the value of the designated parameter as a
    // java.io.Reader object in the Java programming language.
    def getNCharacterStream(parameterName: String): Reader = ???

    @stub
    // Retrieves the value of the designated JDBC NCLOB parameter as a
    // java.sql.NClob object in the Java programming language.
    def getNClob(parameterIndex: Int): NClob = ???

    @stub
    // Retrieves the value of a JDBC NCLOB parameter as a
    // java.sql.NClob object in the Java programming language.
    def getNClob(parameterName: String): NClob = ???

    @stub
    // Retrieves the value of the designated NCHAR,
    // NVARCHAR
    // or LONGNVARCHAR parameter as
    // a String in the Java programming language.
    def getNString(parameterIndex: Int): String = ???

    @stub
    // Retrieves the value of the designated NCHAR,
    // NVARCHAR
    // or LONGNVARCHAR parameter as
    // a String in the Java programming language.
    def getNString(parameterName: String): String = ???

    @stub
    // Retrieves the value of the designated parameter as an Object
    // in the Java programming language.
    def getObject(parameterIndex: Int): Object = ???

    @stub
    // Returns an object representing the value of OUT parameter
    // parameterIndex and will convert from the
    // SQL type of the parameter to the requested Java data type, if the
    // conversion is supported.
    def T: [T] = ???

    @stub
    // Returns an object representing the value of OUT parameter
    // parameterIndex and uses map for the custom
    // mapping of the parameter value.
    def getObject(parameterIndex: Int, map: Map[String, Class[_]]): Object = ???

    @stub
    // Retrieves the value of a parameter as an Object in the Java
    // programming language.
    def getObject(parameterName: String): Object = ???

    @stub
    // Returns an object representing the value of OUT parameter
    // parameterName and will convert from the
    // SQL type of the parameter to the requested Java data type, if the
    // conversion is supported.
    def T: [T] = ???

    @stub
    // Returns an object representing the value of OUT parameter
    // parameterName and uses map for the custom
    // mapping of the parameter value.
    def getObject(parameterName: String, map: Map[String, Class[_]]): Object = ???

    @stub
    // Retrieves the value of the designated JDBC REF(<structured-type>)
    // parameter as a Ref object in the Java programming language.
    def getRef(parameterIndex: Int): Ref = ???

    @stub
    // Retrieves the value of a JDBC REF(<structured-type>)
    // parameter as a Ref object in the Java programming language.
    def getRef(parameterName: String): Ref = ???

    @stub
    // Retrieves the value of the designated JDBC ROWID parameter as a
    // java.sql.RowId object.
    def getRowId(parameterIndex: Int): RowId = ???

    @stub
    // Retrieves the value of the designated JDBC ROWID parameter as a
    // java.sql.RowId object.
    def getRowId(parameterName: String): RowId = ???

    @stub
    // Retrieves the value of the designated JDBC SMALLINT parameter
    // as a short in the Java programming language.
    def getShort(parameterIndex: Int): Short = ???

    @stub
    // Retrieves the value of a JDBC SMALLINT parameter as a short
    // in the Java programming language.
    def getShort(parameterName: String): Short = ???

    @stub
    // Retrieves the value of the designated SQL XML parameter as a
    // java.sql.SQLXML object in the Java programming language.
    def getSQLXML(parameterIndex: Int): SQLXML = ???

    @stub
    // Retrieves the value of the designated SQL XML parameter as a
    // java.sql.SQLXML object in the Java programming language.
    def getSQLXML(parameterName: String): SQLXML = ???

    @stub
    // Retrieves the value of the designated JDBC CHAR,
    // VARCHAR, or LONGVARCHAR parameter as a
    // String in the Java programming language.
    def getString(parameterIndex: Int): String = ???

    @stub
    // Retrieves the value of a JDBC CHAR, VARCHAR,
    // or LONGVARCHAR parameter as a String in
    // the Java programming language.
    def getString(parameterName: String): String = ???

    @stub
    // Retrieves the value of the designated JDBC TIME parameter as a
    // java.sql.Time object.
    def getTime(parameterIndex: Int): Time = ???

    @stub
    // Retrieves the value of the designated JDBC TIME parameter as a
    // java.sql.Time object, using
    // the given Calendar object
    // to construct the time.
    def getTime(parameterIndex: Int, cal: Calendar): Time = ???

    @stub
    // Retrieves the value of a JDBC TIME parameter as a
    // java.sql.Time object.
    def getTime(parameterName: String): Time = ???

    @stub
    // Retrieves the value of a JDBC TIME parameter as a
    // java.sql.Time object, using
    // the given Calendar object
    // to construct the time.
    def getTime(parameterName: String, cal: Calendar): Time = ???

    @stub
    // Retrieves the value of the designated JDBC TIMESTAMP parameter as a
    // java.sql.Timestamp object.
    def getTimestamp(parameterIndex: Int): Timestamp = ???

    @stub
    // Retrieves the value of the designated JDBC TIMESTAMP parameter as a
    // java.sql.Timestamp object, using
    // the given Calendar object to construct
    // the Timestamp object.
    def getTimestamp(parameterIndex: Int, cal: Calendar): Timestamp = ???

    @stub
    // Retrieves the value of a JDBC TIMESTAMP parameter as a
    // java.sql.Timestamp object.
    def getTimestamp(parameterName: String): Timestamp = ???

    @stub
    // Retrieves the value of a JDBC TIMESTAMP parameter as a
    // java.sql.Timestamp object, using
    // the given Calendar object to construct
    // the Timestamp object.
    def getTimestamp(parameterName: String, cal: Calendar): Timestamp = ???

    @stub
    // Retrieves the value of the designated JDBC DATALINK parameter as a
    // java.net.URL object.
    def getURL(parameterIndex: Int): URL = ???

    @stub
    // Retrieves the value of a JDBC DATALINK parameter as a
    // java.net.URL object.
    def getURL(parameterName: String): URL = ???

    @stub
    // Registers the OUT parameter in ordinal position
    // parameterIndex to the JDBC type
    // sqlType.
    def registerOutParameter(parameterIndex: Int, sqlType: Int): Unit = ???

    @stub
    // Registers the parameter in ordinal position
    // parameterIndex to be of JDBC type
    // sqlType.
    def registerOutParameter(parameterIndex: Int, sqlType: Int, scale: Int): Unit = ???

    @stub
    // Registers the designated output parameter.
    def registerOutParameter(parameterIndex: Int, sqlType: Int, typeName: String): Unit = ???

    @stub
    // Registers the OUT parameter in ordinal position
    // parameterIndex to the JDBC type
    // sqlType.
    def Unit: default = ???

    @stub
    // Registers the parameter in ordinal position
    // parameterIndex to be of JDBC type
    // sqlType.
    def Unit: default = ???

    @stub
    // Registers the designated output parameter.
    def Unit: default = ???

    @stub
    // Registers the OUT parameter named
    // parameterName to the JDBC type
    // sqlType.
    def registerOutParameter(parameterName: String, sqlType: Int): Unit = ???

    @stub
    // Registers the parameter named
    // parameterName to be of JDBC type
    // sqlType.
    def registerOutParameter(parameterName: String, sqlType: Int, scale: Int): Unit = ???

    @stub
    // Registers the designated output parameter.
    def registerOutParameter(parameterName: String, sqlType: Int, typeName: String): Unit = ???

    @stub
    // Registers the OUT parameter named
    // parameterName to the JDBC type
    // sqlType.
    def Unit: default = ???

    @stub
    // Registers the parameter named
    // parameterName to be of JDBC type
    // sqlType.
    def Unit: default = ???

    @stub
    // Registers the designated output parameter.
    def Unit: default = ???

    @stub
    // Sets the designated parameter to the given input stream.
    def setAsciiStream(parameterName: String, x: InputStream): Unit = ???

    @stub
    // Sets the designated parameter to the given input stream, which will have
    // the specified number of bytes.
    def setAsciiStream(parameterName: String, x: InputStream, length: Int): Unit = ???

    @stub
    // Sets the designated parameter to the given input stream, which will have
    // the specified number of bytes.
    def setAsciiStream(parameterName: String, x: InputStream, length: Long): Unit = ???

    @stub
    // Sets the designated parameter to the given
    // java.math.BigDecimal value.
    def setBigDecimal(parameterName: String, x: BigDecimal): Unit = ???

    @stub
    // Sets the designated parameter to the given input stream.
    def setBinaryStream(parameterName: String, x: InputStream): Unit = ???

    @stub
    // Sets the designated parameter to the given input stream, which will have
    // the specified number of bytes.
    def setBinaryStream(parameterName: String, x: InputStream, length: Int): Unit = ???

    @stub
    // Sets the designated parameter to the given input stream, which will have
    // the specified number of bytes.
    def setBinaryStream(parameterName: String, x: InputStream, length: Long): Unit = ???

    @stub
    // Sets the designated parameter to the given java.sql.Blob object.
    def setBlob(parameterName: String, x: Blob): Unit = ???

    @stub
    // Sets the designated parameter to a InputStream object.
    def setBlob(parameterName: String, inputStream: InputStream): Unit = ???

    @stub
    // Sets the designated parameter to a InputStream object.
    def setBlob(parameterName: String, inputStream: InputStream, length: Long): Unit = ???

    @stub
    // Sets the designated parameter to the given Java boolean value.
    def setBoolean(parameterName: String, x: Boolean): Unit = ???

    @stub
    // Sets the designated parameter to the given Java byte value.
    def setByte(parameterName: String, x: Byte): Unit = ???

    @stub
    // Sets the designated parameter to the given Java array of bytes.
    def setBytes(parameterName: String, x: Array[Byte]): Unit = ???

    @stub
    // Sets the designated parameter to the given Reader
    // object.
    def setCharacterStream(parameterName: String, reader: Reader): Unit = ???

    @stub
    // Sets the designated parameter to the given Reader
    // object, which is the given number of characters long.
    def setCharacterStream(parameterName: String, reader: Reader, length: Int): Unit = ???

    @stub
    // Sets the designated parameter to the given Reader
    // object, which is the given number of characters long.
    def setCharacterStream(parameterName: String, reader: Reader, length: Long): Unit = ???

    @stub
    // Sets the designated parameter to the given java.sql.Clob object.
    def setClob(parameterName: String, x: Clob): Unit = ???

    @stub
    // Sets the designated parameter to a Reader object.
    def setClob(parameterName: String, reader: Reader): Unit = ???

    @stub
    // Sets the designated parameter to a Reader object.
    def setClob(parameterName: String, reader: Reader, length: Long): Unit = ???

    @stub
    // Sets the designated parameter to the given java.sql.Date value
    // using the default time zone of the virtual machine that is running
    // the application.
    def setDate(parameterName: String, x: Date): Unit = ???

    @stub
    // Sets the designated parameter to the given java.sql.Date value,
    // using the given Calendar object.
    def setDate(parameterName: String, x: Date, cal: Calendar): Unit = ???

    @stub
    // Sets the designated parameter to the given Java double value.
    def setDouble(parameterName: String, x: double): Unit = ???

    @stub
    // Sets the designated parameter to the given Java float value.
    def setFloat(parameterName: String, x: float): Unit = ???

    @stub
    // Sets the designated parameter to the given Java int value.
    def setInt(parameterName: String, x: Int): Unit = ???

    @stub
    // Sets the designated parameter to the given Java long value.
    def setLong(parameterName: String, x: Long): Unit = ???

    @stub
    // Sets the designated parameter to a Reader object.
    def setNCharacterStream(parameterName: String, value: Reader): Unit = ???

    @stub
    // Sets the designated parameter to a Reader object.
    def setNCharacterStream(parameterName: String, value: Reader, length: Long): Unit = ???

    @stub
    // Sets the designated parameter to a java.sql.NClob object.
    def setNClob(parameterName: String, value: NClob): Unit = ???

    @stub
    // Sets the designated parameter to a Reader object.
    def setNClob(parameterName: String, reader: Reader): Unit = ???

    @stub
    // Sets the designated parameter to a Reader object.
    def setNClob(parameterName: String, reader: Reader, length: Long): Unit = ???

    @stub
    // Sets the designated parameter to the given String object.
    def setNString(parameterName: String, value: String): Unit = ???

    @stub
    // Sets the designated parameter to SQL NULL.
    def setNull(parameterName: String, sqlType: Int): Unit = ???

    @stub
    // Sets the designated parameter to SQL NULL.
    def setNull(parameterName: String, sqlType: Int, typeName: String): Unit = ???

    @stub
    // Sets the value of the designated parameter with the given object.
    def setObject(parameterName: String, x: Object): Unit = ???

    @stub
    // Sets the value of the designated parameter with the given object.
    def setObject(parameterName: String, x: Object, targetSqlType: Int): Unit = ???

    @stub
    // Sets the value of the designated parameter with the given object.
    def setObject(parameterName: String, x: Object, targetSqlType: Int, scale: Int): Unit = ???

    @stub
    // Sets the value of the designated parameter with the given object.
    def Unit: default = ???

    @stub
    // Sets the value of the designated parameter with the given object.
    def Unit: default = ???

    @stub
    // Sets the designated parameter to the given java.sql.RowId object.
    def setRowId(parameterName: String, x: RowId): Unit = ???

    @stub
    // Sets the designated parameter to the given Java short value.
    def setShort(parameterName: String, x: Short): Unit = ???

    @stub
    // Sets the designated parameter to the given java.sql.SQLXML object.
    def setSQLXML(parameterName: String, xmlObject: SQLXML): Unit = ???

    @stub
    // Sets the designated parameter to the given Java String value.
    def setString(parameterName: String, x: String): Unit = ???

    @stub
    // Sets the designated parameter to the given java.sql.Time value.
    def setTime(parameterName: String, x: Time): Unit = ???

    @stub
    // Sets the designated parameter to the given java.sql.Time value,
    // using the given Calendar object.
    def setTime(parameterName: String, x: Time, cal: Calendar): Unit = ???

    @stub
    // Sets the designated parameter to the given java.sql.Timestamp value.
    def setTimestamp(parameterName: String, x: Timestamp): Unit = ???

    @stub
    // Sets the designated parameter to the given java.sql.Timestamp value,
    // using the given Calendar object.
    def setTimestamp(parameterName: String, x: Timestamp, cal: Calendar): Unit = ???

    @stub
    // Sets the designated parameter to the given java.net.URL object.
    def setURL(parameterName: String, val: URL): Unit = ???
}
