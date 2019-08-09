package java.sql

import java.io.{InputStream, Reader}
import java.lang.{Class, Object, String}
import java.math.BigDecimal
import java.net.URL
import java.util.{Calendar, Map}
import scala.scalanative.annotation.stub

/** The interface used to execute SQL stored procedures.  The JDBC API
 *  provides a stored procedure SQL escape syntax that allows stored procedures
 *  to be called in a standard way for all RDBMSs. This escape syntax has one
 *  form that includes a result parameter and one that does not. If used, the result
 *  parameter must be registered as an OUT parameter. The other parameters
 *  can be used for input, output or both. Parameters are referred to
 *  sequentially, by number, with the first parameter being 1.
 *  
 *    {?= call <procedure-name>[(<arg1>,<arg2>, ...)]}
 *    {call <procedure-name>[(<arg1>,<arg2>, ...)]}
 *  
 *  
 *  IN parameter values are set using the set methods inherited from
 *  PreparedStatement.  The type of all OUT parameters must be
 *  registered prior to executing the stored procedure; their values
 *  are retrieved after execution via the get methods provided here.
 *  
 *  A CallableStatement can return one ResultSet object or
 *  multiple ResultSet objects.  Multiple
 *  ResultSet objects are handled using operations
 *  inherited from Statement.
 *  
 *  For maximum portability, a call's ResultSet objects and
 *  update counts should be processed prior to getting the values of output
 *  parameters.
 */
trait CallableStatement extends PreparedStatement {

    /** Retrieves the value of the designated JDBC ARRAY parameter as an
     *  Array object in the Java programming language.
     */
    @stub
    def getArray(parameterIndex: Int): Array = ???

    /** Retrieves the value of a JDBC ARRAY parameter as an
     *  Array object in the Java programming language.
     */
    @stub
    def getArray(parameterName: String): Array = ???

    /** Retrieves the value of the designated JDBC NUMERIC parameter as a
     *  java.math.BigDecimal object with as many digits to the
     *  right of the decimal point as the value contains.
     */
    @stub
    def getBigDecimal(parameterIndex: Int): BigDecimal = ???

    /** Deprecated. 
     * use getBigDecimal(int parameterIndex)
     *              or getBigDecimal(String parameterName)
     * 
     */
    @stub
    def getBigDecimal(parameterIndex: Int, scale: Int): BigDecimal = ???

    /** Retrieves the value of a JDBC NUMERIC parameter as a
     *  java.math.BigDecimal object with as many digits to the
     *  right of the decimal point as the value contains.
     */
    @stub
    def getBigDecimal(parameterName: String): BigDecimal = ???

    /** Retrieves the value of the designated JDBC BLOB parameter as a
     *  Blob object in the Java programming language.
     */
    @stub
    def getBlob(parameterIndex: Int): Blob = ???

    /** Retrieves the value of a JDBC BLOB parameter as a
     *  Blob object in the Java programming language.
     */
    @stub
    def getBlob(parameterName: String): Blob = ???

    /** Retrieves the value of the designated JDBC BIT
     *  or BOOLEAN parameter as a
     *  boolean in the Java programming language.
     */
    @stub
    def getBoolean(parameterIndex: Int): Boolean = ???

    /** Retrieves the value of a JDBC BIT or BOOLEAN
     *  parameter as a
     *  boolean in the Java programming language.
     */
    @stub
    def getBoolean(parameterName: String): Boolean = ???

    /** Retrieves the value of the designated JDBC TINYINT parameter
     *  as a byte in the Java programming language.
     */
    @stub
    def getByte(parameterIndex: Int): Byte = ???

    /** Retrieves the value of a JDBC TINYINT parameter as a byte
     *  in the Java programming language.
     */
    @stub
    def getByte(parameterName: String): Byte = ???

    /** Retrieves the value of the designated JDBC BINARY or
     *  VARBINARY parameter as an array of byte
     *  values in the Java programming language.
     */
    @stub
    def getBytes(parameterIndex: Int): Array[Byte] = ???

    /** Retrieves the value of a JDBC BINARY or VARBINARY
     *  parameter as an array of byte values in the Java
     *  programming language.
     */
    @stub
    def getBytes(parameterName: String): Array[Byte] = ???

    /** Retrieves the value of the designated parameter as a
     *  java.io.Reader object in the Java programming language.
     */
    @stub
    def getCharacterStream(parameterIndex: Int): Reader = ???

    /** Retrieves the value of the designated parameter as a
     *  java.io.Reader object in the Java programming language.
     */
    @stub
    def getCharacterStream(parameterName: String): Reader = ???

    /** Retrieves the value of the designated JDBC CLOB parameter as a
     *  java.sql.Clob object in the Java programming language.
     */
    @stub
    def getClob(parameterIndex: Int): Clob = ???

    /** Retrieves the value of a JDBC CLOB parameter as a
     *  java.sql.Clob object in the Java programming language.
     */
    @stub
    def getClob(parameterName: String): Clob = ???

    /** Retrieves the value of the designated JDBC DATE parameter as a
     *  java.sql.Date object.
     */
    @stub
    def getDate(parameterIndex: Int): Date = ???

    /** Retrieves the value of the designated JDBC DATE parameter as a
     *  java.sql.Date object, using
     *  the given Calendar object
     *  to construct the date.
     */
    @stub
    def getDate(parameterIndex: Int, cal: Calendar): Date = ???

    /** Retrieves the value of a JDBC DATE parameter as a
     *  java.sql.Date object.
     */
    @stub
    def getDate(parameterName: String): Date = ???

    /** Retrieves the value of a JDBC DATE parameter as a
     *  java.sql.Date object, using
     *  the given Calendar object
     *  to construct the date.
     */
    @stub
    def getDate(parameterName: String, cal: Calendar): Date = ???

    /** Retrieves the value of the designated JDBC DOUBLE parameter as a double
     *  in the Java programming language.
     */
    @stub
    def getDouble(parameterIndex: Int): Double = ???

    /** Retrieves the value of a JDBC DOUBLE parameter as a double
     *  in the Java programming language.
     */
    @stub
    def getDouble(parameterName: String): Double = ???

    /** Retrieves the value of the designated JDBC FLOAT parameter
     *  as a float in the Java programming language.
     */
    @stub
    def getFloat(parameterIndex: Int): Float = ???

    /** Retrieves the value of a JDBC FLOAT parameter as a float
     *  in the Java programming language.
     */
    @stub
    def getFloat(parameterName: String): Float = ???

    /** Retrieves the value of the designated JDBC INTEGER parameter
     *  as an int in the Java programming language.
     */
    @stub
    def getInt(parameterIndex: Int): Int = ???

    /** Retrieves the value of a JDBC INTEGER parameter as an int
     *  in the Java programming language.
     */
    @stub
    def getInt(parameterName: String): Int = ???

    /** Retrieves the value of the designated JDBC BIGINT parameter
     *  as a long in the Java programming language.
     */
    @stub
    def getLong(parameterIndex: Int): Long = ???

    /** Retrieves the value of a JDBC BIGINT parameter as a long
     *  in the Java programming language.
     */
    @stub
    def getLong(parameterName: String): Long = ???

    /** Retrieves the value of the designated parameter as a
     *  java.io.Reader object in the Java programming language.
     */
    @stub
    def getNCharacterStream(parameterIndex: Int): Reader = ???

    /** Retrieves the value of the designated parameter as a
     *  java.io.Reader object in the Java programming language.
     */
    @stub
    def getNCharacterStream(parameterName: String): Reader = ???

    /** Retrieves the value of the designated JDBC NCLOB parameter as a
     *  java.sql.NClob object in the Java programming language.
     */
    @stub
    def getNClob(parameterIndex: Int): NClob = ???

    /** Retrieves the value of a JDBC NCLOB parameter as a
     *  java.sql.NClob object in the Java programming language.
     */
    @stub
    def getNClob(parameterName: String): NClob = ???

    /** Retrieves the value of the designated NCHAR,
     *  NVARCHAR
     *  or LONGNVARCHAR parameter as
     *  a String in the Java programming language.
     */
    @stub
    def getNString(parameterIndex: Int): String = ???

    /** Retrieves the value of the designated NCHAR,
     *  NVARCHAR
     *  or LONGNVARCHAR parameter as
     *  a String in the Java programming language.
     */
    @stub
    def getNString(parameterName: String): String = ???

    /** Retrieves the value of the designated parameter as an Object
     *  in the Java programming language.
     */
    @stub
    def getObject(parameterIndex: Int): Object = ???

    /** Returns an object representing the value of OUT parameter
     *  parameterIndex and will convert from the
     *  SQL type of the parameter to the requested Java data type, if the
     *  conversion is supported.
     */
    @stub
    def getObject[T](parameterIndex: Int, type: Class[T]): T = ???

    /** Returns an object representing the value of OUT parameter
     *  parameterIndex and uses map for the custom
     *  mapping of the parameter value.
     */
    @stub
    def getObject(parameterIndex: Int, map: Map[String, Class[_]]): Object = ???

    /** Retrieves the value of a parameter as an Object in the Java
     *  programming language.
     */
    @stub
    def getObject(parameterName: String): Object = ???

    /** Returns an object representing the value of OUT parameter
     *  parameterName and will convert from the
     *  SQL type of the parameter to the requested Java data type, if the
     *  conversion is supported.
     */
    @stub
    def getObject[T](parameterName: String, type: Class[T]): T = ???

    /** Returns an object representing the value of OUT parameter
     *  parameterName and uses map for the custom
     *  mapping of the parameter value.
     */
    @stub
    def getObject(parameterName: String, map: Map[String, Class[_]]): Object = ???

    /** Retrieves the value of the designated JDBC REF(<structured-type>)
     *  parameter as a Ref object in the Java programming language.
     */
    @stub
    def getRef(parameterIndex: Int): Ref = ???

    /** Retrieves the value of a JDBC REF(<structured-type>)
     *  parameter as a Ref object in the Java programming language.
     */
    @stub
    def getRef(parameterName: String): Ref = ???

    /** Retrieves the value of the designated JDBC ROWID parameter as a
     *  java.sql.RowId object.
     */
    @stub
    def getRowId(parameterIndex: Int): RowId = ???

    /** Retrieves the value of the designated JDBC ROWID parameter as a
     *  java.sql.RowId object.
     */
    @stub
    def getRowId(parameterName: String): RowId = ???

    /** Retrieves the value of the designated JDBC SMALLINT parameter
     *  as a short in the Java programming language.
     */
    @stub
    def getShort(parameterIndex: Int): Short = ???

    /** Retrieves the value of a JDBC SMALLINT parameter as a short
     *  in the Java programming language.
     */
    @stub
    def getShort(parameterName: String): Short = ???

    /** Retrieves the value of the designated SQL XML parameter as a
     *  java.sql.SQLXML object in the Java programming language.
     */
    @stub
    def getSQLXML(parameterIndex: Int): SQLXML = ???

    /** Retrieves the value of the designated SQL XML parameter as a
     *  java.sql.SQLXML object in the Java programming language.
     */
    @stub
    def getSQLXML(parameterName: String): SQLXML = ???

    /** Retrieves the value of the designated JDBC CHAR,
     *  VARCHAR, or LONGVARCHAR parameter as a
     *  String in the Java programming language.
     */
    @stub
    def getString(parameterIndex: Int): String = ???

    /** Retrieves the value of a JDBC CHAR, VARCHAR,
     *  or LONGVARCHAR parameter as a String in
     *  the Java programming language.
     */
    @stub
    def getString(parameterName: String): String = ???

    /** Retrieves the value of the designated JDBC TIME parameter as a
     *  java.sql.Time object.
     */
    @stub
    def getTime(parameterIndex: Int): Time = ???

    /** Retrieves the value of the designated JDBC TIME parameter as a
     *  java.sql.Time object, using
     *  the given Calendar object
     *  to construct the time.
     */
    @stub
    def getTime(parameterIndex: Int, cal: Calendar): Time = ???

    /** Retrieves the value of a JDBC TIME parameter as a
     *  java.sql.Time object.
     */
    @stub
    def getTime(parameterName: String): Time = ???

    /** Retrieves the value of a JDBC TIME parameter as a
     *  java.sql.Time object, using
     *  the given Calendar object
     *  to construct the time.
     */
    @stub
    def getTime(parameterName: String, cal: Calendar): Time = ???

    /** Retrieves the value of the designated JDBC TIMESTAMP parameter as a
     *  java.sql.Timestamp object.
     */
    @stub
    def getTimestamp(parameterIndex: Int): Timestamp = ???

    /** Retrieves the value of the designated JDBC TIMESTAMP parameter as a
     *  java.sql.Timestamp object, using
     *  the given Calendar object to construct
     *  the Timestamp object.
     */
    @stub
    def getTimestamp(parameterIndex: Int, cal: Calendar): Timestamp = ???

    /** Retrieves the value of a JDBC TIMESTAMP parameter as a
     *  java.sql.Timestamp object.
     */
    @stub
    def getTimestamp(parameterName: String): Timestamp = ???

    /** Retrieves the value of a JDBC TIMESTAMP parameter as a
     *  java.sql.Timestamp object, using
     *  the given Calendar object to construct
     *  the Timestamp object.
     */
    @stub
    def getTimestamp(parameterName: String, cal: Calendar): Timestamp = ???

    /** Retrieves the value of the designated JDBC DATALINK parameter as a
     *  java.net.URL object.
     */
    @stub
    def getURL(parameterIndex: Int): URL = ???

    /** Retrieves the value of a JDBC DATALINK parameter as a
     *  java.net.URL object.
     */
    @stub
    def getURL(parameterName: String): URL = ???

    /** Registers the OUT parameter in ordinal position
     *  parameterIndex to the JDBC type
     *  sqlType.
     */
    @stub
    def registerOutParameter(parameterIndex: Int, sqlType: Int): Unit = ???

    /** Registers the parameter in ordinal position
     *  parameterIndex to be of JDBC type
     *  sqlType.
     */
    @stub
    def registerOutParameter(parameterIndex: Int, sqlType: Int, scale: Int): Unit = ???

    /** Registers the designated output parameter. */
    @stub
    def registerOutParameter(parameterIndex: Int, sqlType: Int, typeName: String): Unit = ???

    /** Registers the OUT parameter in ordinal position
     *  parameterIndex to the JDBC type
     *  sqlType.
     */
    @stub
    def registerOutParameter(parameterIndex: Int, sqlType: SQLType): Unit = ???

    /** Registers the parameter in ordinal position
     *  parameterIndex to be of JDBC type
     *  sqlType.
     */
    @stub
    def registerOutParameter(parameterIndex: Int, sqlType: SQLType, scale: Int): Unit = ???

    /** Registers the designated output parameter. */
    @stub
    def registerOutParameter(parameterIndex: Int, sqlType: SQLType, typeName: String): Unit = ???

    /** Registers the OUT parameter named
     *  parameterName to the JDBC type
     *  sqlType.
     */
    @stub
    def registerOutParameter(parameterName: String, sqlType: Int): Unit = ???

    /** Registers the parameter named
     *  parameterName to be of JDBC type
     *  sqlType.
     */
    @stub
    def registerOutParameter(parameterName: String, sqlType: Int, scale: Int): Unit = ???

    /** Registers the designated output parameter. */
    @stub
    def registerOutParameter(parameterName: String, sqlType: Int, typeName: String): Unit = ???

    /** Registers the OUT parameter named
     *  parameterName to the JDBC type
     *  sqlType.
     */
    @stub
    def registerOutParameter(parameterName: String, sqlType: SQLType): Unit = ???

    /** Registers the parameter named
     *  parameterName to be of JDBC type
     *  sqlType.
     */
    @stub
    def registerOutParameter(parameterName: String, sqlType: SQLType, scale: Int): Unit = ???

    /** Registers the designated output parameter. */
    @stub
    def registerOutParameter(parameterName: String, sqlType: SQLType, typeName: String): Unit = ???

    /** Sets the designated parameter to the given input stream. */
    @stub
    def setAsciiStream(parameterName: String, x: InputStream): Unit = ???

    /** Sets the designated parameter to the given input stream, which will have
     *  the specified number of bytes.
     */
    @stub
    def setAsciiStream(parameterName: String, x: InputStream, length: Int): Unit = ???

    /** Sets the designated parameter to the given input stream, which will have
     *  the specified number of bytes.
     */
    @stub
    def setAsciiStream(parameterName: String, x: InputStream, length: Long): Unit = ???

    /** Sets the designated parameter to the given
     *  java.math.BigDecimal value.
     */
    @stub
    def setBigDecimal(parameterName: String, x: BigDecimal): Unit = ???

    /** Sets the designated parameter to the given input stream. */
    @stub
    def setBinaryStream(parameterName: String, x: InputStream): Unit = ???

    /** Sets the designated parameter to the given input stream, which will have
     *  the specified number of bytes.
     */
    @stub
    def setBinaryStream(parameterName: String, x: InputStream, length: Int): Unit = ???

    /** Sets the designated parameter to the given input stream, which will have
     *  the specified number of bytes.
     */
    @stub
    def setBinaryStream(parameterName: String, x: InputStream, length: Long): Unit = ???

    /** Sets the designated parameter to the given java.sql.Blob object. */
    @stub
    def setBlob(parameterName: String, x: Blob): Unit = ???

    /** Sets the designated parameter to a InputStream object. */
    @stub
    def setBlob(parameterName: String, inputStream: InputStream): Unit = ???

    /** Sets the designated parameter to a InputStream object. */
    @stub
    def setBlob(parameterName: String, inputStream: InputStream, length: Long): Unit = ???

    /** Sets the designated parameter to the given Java boolean value. */
    @stub
    def setBoolean(parameterName: String, x: Boolean): Unit = ???

    /** Sets the designated parameter to the given Java byte value. */
    @stub
    def setByte(parameterName: String, x: Byte): Unit = ???

    /** Sets the designated parameter to the given Java array of bytes. */
    @stub
    def setBytes(parameterName: String, x: Array[Byte]): Unit = ???

    /** Sets the designated parameter to the given Reader
     *  object.
     */
    @stub
    def setCharacterStream(parameterName: String, reader: Reader): Unit = ???

    /** Sets the designated parameter to the given Reader
     *  object, which is the given number of characters long.
     */
    @stub
    def setCharacterStream(parameterName: String, reader: Reader, length: Int): Unit = ???

    /** Sets the designated parameter to the given Reader
     *  object, which is the given number of characters long.
     */
    @stub
    def setCharacterStream(parameterName: String, reader: Reader, length: Long): Unit = ???

    /** Sets the designated parameter to the given java.sql.Clob object. */
    @stub
    def setClob(parameterName: String, x: Clob): Unit = ???

    /** Sets the designated parameter to a Reader object. */
    @stub
    def setClob(parameterName: String, reader: Reader): Unit = ???

    /** Sets the designated parameter to a Reader object. */
    @stub
    def setClob(parameterName: String, reader: Reader, length: Long): Unit = ???

    /** Sets the designated parameter to the given java.sql.Date value
     *  using the default time zone of the virtual machine that is running
     *  the application.
     */
    @stub
    def setDate(parameterName: String, x: Date): Unit = ???

    /** Sets the designated parameter to the given java.sql.Date value,
     *  using the given Calendar object.
     */
    @stub
    def setDate(parameterName: String, x: Date, cal: Calendar): Unit = ???

    /** Sets the designated parameter to the given Java double value. */
    @stub
    def setDouble(parameterName: String, x: Double): Unit = ???

    /** Sets the designated parameter to the given Java float value. */
    @stub
    def setFloat(parameterName: String, x: Float): Unit = ???

    /** Sets the designated parameter to the given Java int value. */
    @stub
    def setInt(parameterName: String, x: Int): Unit = ???

    /** Sets the designated parameter to the given Java long value. */
    @stub
    def setLong(parameterName: String, x: Long): Unit = ???

    /** Sets the designated parameter to a Reader object. */
    @stub
    def setNCharacterStream(parameterName: String, value: Reader): Unit = ???

    /** Sets the designated parameter to a Reader object. */
    @stub
    def setNCharacterStream(parameterName: String, value: Reader, length: Long): Unit = ???

    /** Sets the designated parameter to a java.sql.NClob object. */
    @stub
    def setNClob(parameterName: String, value: NClob): Unit = ???

    /** Sets the designated parameter to a Reader object. */
    @stub
    def setNClob(parameterName: String, reader: Reader): Unit = ???

    /** Sets the designated parameter to a Reader object. */
    @stub
    def setNClob(parameterName: String, reader: Reader, length: Long): Unit = ???

    /** Sets the designated parameter to the given String object. */
    @stub
    def setNString(parameterName: String, value: String): Unit = ???

    /** Sets the designated parameter to SQL NULL. */
    @stub
    def setNull(parameterName: String, sqlType: Int): Unit = ???

    /** Sets the designated parameter to SQL NULL. */
    @stub
    def setNull(parameterName: String, sqlType: Int, typeName: String): Unit = ???

    /** Sets the value of the designated parameter with the given object. */
    @stub
    def setObject(parameterName: String, x: Object): Unit = ???

    /** Sets the value of the designated parameter with the given object. */
    @stub
    def setObject(parameterName: String, x: Object, targetSqlType: Int): Unit = ???

    /** Sets the value of the designated parameter with the given object. */
    @stub
    def setObject(parameterName: String, x: Object, targetSqlType: Int, scale: Int): Unit = ???

    /** Sets the value of the designated parameter with the given object. */
    @stub
    def setObject(parameterName: String, x: Object, targetSqlType: SQLType): Unit = ???

    /** Sets the value of the designated parameter with the given object. */
    @stub
    def setObject(parameterName: String, x: Object, targetSqlType: SQLType, scaleOrLength: Int): Unit = ???

    /** Sets the designated parameter to the given java.sql.RowId object. */
    @stub
    def setRowId(parameterName: String, x: RowId): Unit = ???

    /** Sets the designated parameter to the given Java short value. */
    @stub
    def setShort(parameterName: String, x: Short): Unit = ???

    /** Sets the designated parameter to the given java.sql.SQLXML object. */
    @stub
    def setSQLXML(parameterName: String, xmlObject: SQLXML): Unit = ???

    /** Sets the designated parameter to the given Java String value. */
    @stub
    def setString(parameterName: String, x: String): Unit = ???

    /** Sets the designated parameter to the given java.sql.Time value. */
    @stub
    def setTime(parameterName: String, x: Time): Unit = ???

    /** Sets the designated parameter to the given java.sql.Time value,
     *  using the given Calendar object.
     */
    @stub
    def setTime(parameterName: String, x: Time, cal: Calendar): Unit = ???

    /** Sets the designated parameter to the given java.sql.Timestamp value. */
    @stub
    def setTimestamp(parameterName: String, x: Timestamp): Unit = ???

    /** Sets the designated parameter to the given java.sql.Timestamp value,
     *  using the given Calendar object.
     */
    @stub
    def setTimestamp(parameterName: String, x: Timestamp, cal: Calendar): Unit = ???

    /** Sets the designated parameter to the given java.net.URL object. */
    @stub
    def setURL(parameterName: String, val: URL): Unit = ???

    /** Retrieves whether the last OUT parameter read had the value of
     *  SQL NULL.
     */
    @stub
    def wasNull(): Boolean = ???
}
