package javax.sql

import java.io.{InputStream, Reader}
import java.lang.{Class, Object, String}
import java.math.BigDecimal
import java.net.URL
import java.sql.{Array, Blob, Clob, Date, NClob, Ref, ResultSet, RowId, SQLXML, Time, Timestamp}
import java.util.{Calendar, Map}
import scala.scalanative.annotation.stub

/** The interface that adds support to the JDBC API for the
 *  JavaBeans™ component model.
 *  A rowset, which can be used as a JavaBeans component in
 *  a visual Bean development environment, can be created and
 *  configured at design time and executed at run time.
 *  
 *  The RowSet
 *  interface provides a set of JavaBeans properties that allow a RowSet
 *  instance to be configured to connect to a JDBC data source and read
 *  some data from the data source.  A group of setter methods (setInt,
 *  setBytes, setString, and so on)
 *  provide a way to pass input parameters to a rowset's command property.
 *  This command is the SQL query the rowset uses when it gets its data from
 *  a relational database, which is generally the case.
 *  
 *  The RowSet
 *  interface supports JavaBeans events, allowing other components in an
 *  application to be notified when an event occurs on a rowset,
 *  such as a change in its value.
 * 
 *  The RowSet interface is unique in that it is intended to be
 *  implemented using the rest of the JDBC API.  In other words, a
 *  RowSet implementation is a layer of software that executes "on top"
 *  of a JDBC driver.  Implementations of the RowSet interface can
 *  be provided by anyone, including JDBC driver vendors who want to
 *  provide a RowSet implementation as part of their JDBC products.
 *  
 *  A RowSet object may make a connection with a data source and
 *  maintain that connection throughout its life cycle, in which case it is
 *  called a connected rowset.  A rowset may also make a connection with
 *  a data source, get data from it, and then close the connection. Such a rowset
 *  is called a disconnected rowset.  A disconnected rowset may make
 *  changes to its data while it is disconnected and then send the changes back
 *  to the original source of the data, but it must reestablish a connection to do so.
 *  
 *  A disconnected rowset may have a reader (a RowSetReader object)
 *  and a writer (a RowSetWriter object) associated with it.
 *  The reader may be implemented in many different ways to populate a rowset
 *  with data, including getting data from a non-relational data source. The
 *  writer can also be implemented in many different ways to propagate changes
 *  made to the rowset's data back to the underlying data source.
 *  
 *  Rowsets are easy to use.  The RowSet interface extends the standard
 *  java.sql.ResultSet interface.  The RowSetMetaData
 *  interface extends the java.sql.ResultSetMetaData interface.
 *  Thus, developers familiar
 *  with the JDBC API will have to learn a minimal number of new APIs to
 *  use rowsets.  In addition, third-party software tools that work with
 *  JDBC ResultSet objects will also easily be made to work with rowsets.
 */
trait RowSet extends ResultSet {

    /** Registers the given listener so that it will be notified of events
     *  that occur on this RowSet object.
     */
    @stub
    def addRowSetListener(listener: RowSetListener): Unit = ???

    /** Clears the parameters set for this RowSet object's command. */
    @stub
    def clearParameters(): Unit = ???

    /** Fills this RowSet object with data. */
    @stub
    def execute(): Unit = ???

    /** Retrieves this RowSet object's command property. */
    @stub
    def getCommand(): String = ???

    /** Retrieves the logical name that identifies the data source for this
     *  RowSet object.
     */
    @stub
    def getDataSourceName(): String = ???

    /** Retrieves whether escape processing is enabled for this
     *  RowSet object.
     */
    @stub
    def getEscapeProcessing(): Boolean = ???

    /** Retrieves the maximum number of bytes that may be returned
     *  for certain column values.
     */
    @stub
    def getMaxFieldSize(): Int = ???

    /** Retrieves the maximum number of rows that this RowSet
     *  object can contain.
     */
    @stub
    def getMaxRows(): Int = ???

    /** Retrieves the password used to create a database connection. */
    @stub
    def getPassword(): String = ???

    /** Retrieves the maximum number of seconds the driver will wait for
     *  a statement to execute.
     */
    @stub
    def getQueryTimeout(): Int = ???

    /** Retrieves the transaction isolation level set for this
     *  RowSet object.
     */
    @stub
    def getTransactionIsolation(): Int = ???

    /** Retrieves the Map object associated with this
     *  RowSet object, which specifies the custom mapping
     *  of SQL user-defined types, if any.
     */
    @stub
    def getTypeMap(): Map[String, Class[_]] = ???

    /** Retrieves the url property this RowSet object will use to
     *  create a connection if it uses the DriverManager
     *  instead of a DataSource object to establish the connection.
     */
    @stub
    def getUrl(): String = ???

    /** Retrieves the username used to create a database connection for this
     *  RowSet object.
     */
    @stub
    def getUsername(): String = ???

    /** Retrieves whether this RowSet object is read-only. */
    @stub
    def isReadOnly(): Boolean = ???

    /** Removes the specified listener from the list of components that will be
     *  notified when an event occurs on this RowSet object.
     */
    @stub
    def removeRowSetListener(listener: RowSetListener): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  with the given  Array value.
     */
    @stub
    def setArray(i: Int, x: Array): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given input stream.
     */
    @stub
    def setAsciiStream(parameterIndex: Int, x: InputStream): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given java.io.InputStream value.
     */
    @stub
    def setAsciiStream(parameterIndex: Int, x: InputStream, length: Int): Unit = ???

    /** Sets the designated parameter to the given input stream. */
    @stub
    def setAsciiStream(parameterName: String, x: InputStream): Unit = ???

    /** Sets the designated parameter to the given input stream, which will have
     *  the specified number of bytes.
     */
    @stub
    def setAsciiStream(parameterName: String, x: InputStream, length: Int): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given java.math.BigDeciaml value.
     */
    @stub
    def setBigDecimal(parameterIndex: Int, x: BigDecimal): Unit = ???

    /** Sets the designated parameter to the given
     *  java.math.BigDecimal value.
     */
    @stub
    def setBigDecimal(parameterName: String, x: BigDecimal): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given input stream.
     */
    @stub
    def setBinaryStream(parameterIndex: Int, x: InputStream): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given java.io.InputStream value.
     */
    @stub
    def setBinaryStream(parameterIndex: Int, x: InputStream, length: Int): Unit = ???

    /** Sets the designated parameter to the given input stream. */
    @stub
    def setBinaryStream(parameterName: String, x: InputStream): Unit = ???

    /** Sets the designated parameter to the given input stream, which will have
     *  the specified number of bytes.
     */
    @stub
    def setBinaryStream(parameterName: String, x: InputStream, length: Int): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  with the given  Blob value.
     */
    @stub
    def setBlob(i: Int, x: Blob): Unit = ???

    /** Sets the designated parameter to a InputStream object. */
    @stub
    def setBlob(parameterIndex: Int, inputStream: InputStream): Unit = ???

    /** Sets the designated parameter to a InputStream object. */
    @stub
    def setBlob(parameterIndex: Int, inputStream: InputStream, length: Long): Unit = ???

    /** Sets the designated parameter to the given java.sql.Blob object. */
    @stub
    def setBlob(parameterName: String, x: Blob): Unit = ???

    /** Sets the designated parameter to a InputStream object. */
    @stub
    def setBlob(parameterName: String, inputStream: InputStream): Unit = ???

    /** Sets the designated parameter to a InputStream object. */
    @stub
    def setBlob(parameterName: String, inputStream: InputStream, length: Long): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given Java boolean value.
     */
    @stub
    def setBoolean(parameterIndex: Int, x: Boolean): Unit = ???

    /** Sets the designated parameter to the given Java boolean value. */
    @stub
    def setBoolean(parameterName: String, x: Boolean): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given Java byte value.
     */
    @stub
    def setByte(parameterIndex: Int, x: Byte): Unit = ???

    /** Sets the designated parameter to the given Java byte value. */
    @stub
    def setByte(parameterName: String, x: Byte): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given Java array of byte values.
     */
    @stub
    def setBytes(parameterIndex: Int, x: Array[Byte]): Unit = ???

    /** Sets the designated parameter to the given Java array of bytes. */
    @stub
    def setBytes(parameterName: String, x: Array[Byte]): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given Reader
     *  object.
     */
    @stub
    def setCharacterStream(parameterIndex: Int, reader: Reader): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given java.io.Reader value.
     */
    @stub
    def setCharacterStream(parameterIndex: Int, reader: Reader, length: Int): Unit = ???

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

    /** Sets the designated parameter in this RowSet object's command
     *  with the given  Clob value.
     */
    @stub
    def setClob(i: Int, x: Clob): Unit = ???

    /** Sets the designated parameter to a Reader object. */
    @stub
    def setClob(parameterIndex: Int, reader: Reader): Unit = ???

    /** Sets the designated parameter to a Reader object. */
    @stub
    def setClob(parameterIndex: Int, reader: Reader, length: Long): Unit = ???

    /** Sets the designated parameter to the given java.sql.Clob object. */
    @stub
    def setClob(parameterName: String, x: Clob): Unit = ???

    /** Sets the designated parameter to a Reader object. */
    @stub
    def setClob(parameterName: String, reader: Reader): Unit = ???

    /** Sets the designated parameter to a Reader object. */
    @stub
    def setClob(parameterName: String, reader: Reader, length: Long): Unit = ???

    /** Sets this RowSet object's command property to the given
     *  SQL query.
     */
    @stub
    def setCommand(cmd: String): Unit = ???

    /** Sets the concurrency of this RowSet object to the given
     *  concurrency level.
     */
    @stub
    def setConcurrency(concurrency: Int): Unit = ???

    /** Sets the data source name property for this RowSet object to the
     *  given String.
     */
    @stub
    def setDataSourceName(name: String): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given java.sql.Date value.
     */
    @stub
    def setDate(parameterIndex: Int, x: Date): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  with the given  java.sql.Date value.
     */
    @stub
    def setDate(parameterIndex: Int, x: Date, cal: Calendar): Unit = ???

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

    /** Sets the designated parameter in this RowSet object's command
     *  to the given Java double value.
     */
    @stub
    def setDouble(parameterIndex: Int, x: Double): Unit = ???

    /** Sets the designated parameter to the given Java double value. */
    @stub
    def setDouble(parameterName: String, x: Double): Unit = ???

    /** Sets escape processing for this RowSet object on or
     *  off.
     */
    @stub
    def setEscapeProcessing(enable: Boolean): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given Java float value.
     */
    @stub
    def setFloat(parameterIndex: Int, x: Float): Unit = ???

    /** Sets the designated parameter to the given Java float value. */
    @stub
    def setFloat(parameterName: String, x: Float): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given Java int value.
     */
    @stub
    def setInt(parameterIndex: Int, x: Int): Unit = ???

    /** Sets the designated parameter to the given Java int value. */
    @stub
    def setInt(parameterName: String, x: Int): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given Java long value.
     */
    @stub
    def setLong(parameterIndex: Int, x: Long): Unit = ???

    /** Sets the designated parameter to the given Java long value. */
    @stub
    def setLong(parameterName: String, x: Long): Unit = ???

    /** Sets the maximum number of bytes that can be returned for a column
     *  value to the given number of bytes.
     */
    @stub
    def setMaxFieldSize(max: Int): Unit = ???

    /** Sets the maximum number of rows that this RowSet
     *  object can contain to the specified number.
     */
    @stub
    def setMaxRows(max: Int): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to a Reader object.
     */
    @stub
    def setNCharacterStream(parameterIndex: Int, value: Reader): Unit = ???

    /** Sets the designated parameter to a Reader object. */
    @stub
    def setNCharacterStream(parameterIndex: Int, value: Reader, length: Long): Unit = ???

    /** Sets the designated parameter to a Reader object. */
    @stub
    def setNCharacterStream(parameterName: String, value: Reader): Unit = ???

    /** Sets the designated parameter to a Reader object. */
    @stub
    def setNCharacterStream(parameterName: String, value: Reader, length: Long): Unit = ???

    /** Sets the designated parameter to a java.sql.NClob object. */
    @stub
    def setNClob(parameterIndex: Int, value: NClob): Unit = ???

    /** Sets the designated parameter to a Reader object. */
    @stub
    def setNClob(parameterIndex: Int, reader: Reader): Unit = ???

    /** Sets the designated parameter to a Reader object. */
    @stub
    def setNClob(parameterIndex: Int, reader: Reader, length: Long): Unit = ???

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
    def setNString(parameterIndex: Int, value: String): Unit = ???

    /** Sets the designated parameter to the given String object. */
    @stub
    def setNString(parameterName: String, value: String): Unit = ???

    /** Sets the designated parameter in this RowSet object's SQL
     *  command to SQL NULL.
     */
    @stub
    def setNull(parameterIndex: Int, sqlType: Int): Unit = ???

    /** Sets the designated parameter in this RowSet object's SQL
     *  command to SQL NULL.
     */
    @stub
    def setNull(paramIndex: Int, sqlType: Int, typeName: String): Unit = ???

    /** Sets the designated parameter to SQL NULL. */
    @stub
    def setNull(parameterName: String, sqlType: Int): Unit = ???

    /** Sets the designated parameter to SQL NULL. */
    @stub
    def setNull(parameterName: String, sqlType: Int, typeName: String): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  with a Java Object.
     */
    @stub
    def setObject(parameterIndex: Int, x: Object): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  with a Java Object.
     */
    @stub
    def setObject(parameterIndex: Int, x: Object, targetSqlType: Int): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  with the given Java Object.
     */
    @stub
    def setObject(parameterIndex: Int, x: Object, targetSqlType: Int, scaleOrLength: Int): Unit = ???

    /** Sets the value of the designated parameter with the given object. */
    @stub
    def setObject(parameterName: String, x: Object): Unit = ???

    /** Sets the value of the designated parameter with the given object. */
    @stub
    def setObject(parameterName: String, x: Object, targetSqlType: Int): Unit = ???

    /** Sets the value of the designated parameter with the given object. */
    @stub
    def setObject(parameterName: String, x: Object, targetSqlType: Int, scale: Int): Unit = ???

    /** Sets the database password for this RowSet object to
     *  the given String.
     */
    @stub
    def setPassword(password: String): Unit = ???

    /** Sets the maximum time the driver will wait for
     *  a statement to execute to the given number of seconds.
     */
    @stub
    def setQueryTimeout(seconds: Int): Unit = ???

    /** Sets whether this RowSet object is read-only to the
     *  given boolean.
     */
    @stub
    def setReadOnly(value: Boolean): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  with the given  Ref value.
     */
    @stub
    def setRef(i: Int, x: Ref): Unit = ???

    /** Sets the designated parameter to the given java.sql.RowId object. */
    @stub
    def setRowId(parameterIndex: Int, x: RowId): Unit = ???

    /** Sets the designated parameter to the given java.sql.RowId object. */
    @stub
    def setRowId(parameterName: String, x: RowId): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given Java short value.
     */
    @stub
    def setShort(parameterIndex: Int, x: Short): Unit = ???

    /** Sets the designated parameter to the given Java short value. */
    @stub
    def setShort(parameterName: String, x: Short): Unit = ???

    /** Sets the designated parameter to the given java.sql.SQLXML object. */
    @stub
    def setSQLXML(parameterIndex: Int, xmlObject: SQLXML): Unit = ???

    /** Sets the designated parameter to the given java.sql.SQLXML object. */
    @stub
    def setSQLXML(parameterName: String, xmlObject: SQLXML): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given Java String value.
     */
    @stub
    def setString(parameterIndex: Int, x: String): Unit = ???

    /** Sets the designated parameter to the given Java String value. */
    @stub
    def setString(parameterName: String, x: String): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given java.sql.Time value.
     */
    @stub
    def setTime(parameterIndex: Int, x: Time): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  with the given  java.sql.Time value.
     */
    @stub
    def setTime(parameterIndex: Int, x: Time, cal: Calendar): Unit = ???

    /** Sets the designated parameter to the given java.sql.Time value. */
    @stub
    def setTime(parameterName: String, x: Time): Unit = ???

    /** Sets the designated parameter to the given java.sql.Time value,
     *  using the given Calendar object.
     */
    @stub
    def setTime(parameterName: String, x: Time, cal: Calendar): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  to the given java.sql.Timestamp value.
     */
    @stub
    def setTimestamp(parameterIndex: Int, x: Timestamp): Unit = ???

    /** Sets the designated parameter in this RowSet object's command
     *  with the given  java.sql.Timestamp value.
     */
    @stub
    def setTimestamp(parameterIndex: Int, x: Timestamp, cal: Calendar): Unit = ???

    /** Sets the designated parameter to the given java.sql.Timestamp value. */
    @stub
    def setTimestamp(parameterName: String, x: Timestamp): Unit = ???

    /** Sets the designated parameter to the given java.sql.Timestamp value,
     *  using the given Calendar object.
     */
    @stub
    def setTimestamp(parameterName: String, x: Timestamp, cal: Calendar): Unit = ???

    /** Sets the transaction isolation level for this RowSet object. */
    @stub
    def setTransactionIsolation(level: Int): Unit = ???

    /** Sets the type of this RowSet object to the given type. */
    @stub
    def setType(type: Int): Unit = ???

    /** Installs the given java.util.Map object as the default
     *  type map for this RowSet object.
     */
    @stub
    def setTypeMap(map: Map[String, Class[_]]): Unit = ???

    /** Sets the designated parameter to the given java.net.URL value. */
    @stub
    def setURL(parameterIndex: Int, x: URL): Unit = ???

    /** Sets the URL this RowSet object will use when it uses the
     *  DriverManager to create a connection.
     */
    @stub
    def setUrl(url: String): Unit = ???

    /** Sets the username property for this RowSet object to the
     *  given String.
     */
    @stub
    def setUsername(name: String): Unit = ???
}
