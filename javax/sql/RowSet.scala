package javax.sql

import java.io.{InputStream, Reader}
import java.lang.{Class, Object, String}
import java.math.BigDecimal
import java.net.URL
import java.sql.{Array, Blob, Clob, Date, NClob, Ref, ResultSet, RowId, SQLXML, Time, Timestamp}
import java.util.{Calendar, Map}

// The interface that adds support to the JDBC API for the
// JavaBeans™ component model.
// A rowset, which can be used as a JavaBeans component in
// a visual Bean development environment, can be created and
// configured at design time and executed at run time.
// 
// The RowSet
// interface provides a set of JavaBeans properties that allow a RowSet
// instance to be configured to connect to a JDBC data source and read
// some data from the data source.  A group of setter methods (setInt,
// setBytes, setString, and so on)
// provide a way to pass input parameters to a rowset's command property.
// This command is the SQL query the rowset uses when it gets its data from
// a relational database, which is generally the case.
// 
// The RowSet
// interface supports JavaBeans events, allowing other components in an
// application to be notified when an event occurs on a rowset,
// such as a change in its value.
//
// The RowSet interface is unique in that it is intended to be
// implemented using the rest of the JDBC API.  In other words, a
// RowSet implementation is a layer of software that executes "on top"
// of a JDBC driver.  Implementations of the RowSet interface can
// be provided by anyone, including JDBC driver vendors who want to
// provide a RowSet implementation as part of their JDBC products.
// 
// A RowSet object may make a connection with a data source and
// maintain that connection throughout its life cycle, in which case it is
// called a connected rowset.  A rowset may also make a connection with
// a data source, get data from it, and then close the connection. Such a rowset
// is called a disconnected rowset.  A disconnected rowset may make
// changes to its data while it is disconnected and then send the changes back
// to the original source of the data, but it must reestablish a connection to do so.
// 
// A disconnected rowset may have a reader (a RowSetReader object)
// and a writer (a RowSetWriter object) associated with it.
// The reader may be implemented in many different ways to populate a rowset
// with data, including getting data from a non-relational data source. The
// writer can also be implemented in many different ways to propagate changes
// made to the rowset's data back to the underlying data source.
// 
// Rowsets are easy to use.  The RowSet interface extends the standard
// java.sql.ResultSet interface.  The RowSetMetaData
// interface extends the java.sql.ResultSetMetaData interface.
// Thus, developers familiar
// with the JDBC API will have to learn a minimal number of new APIs to
// use rowsets.  In addition, third-party software tools that work with
// JDBC ResultSet objects will also easily be made to work with rowsets.
trait RowSet extends ResultSet {

    @stub
    // Registers the given listener so that it will be notified of events
    // that occur on this RowSet object.
    def addRowSetListener(listener: RowSetListener): Unit = ???

    @stub
    // Clears the parameters set for this RowSet object's command.
    def clearParameters(): Unit = ???

    @stub
    // Fills this RowSet object with data.
    def execute(): Unit = ???

    @stub
    // Retrieves this RowSet object's command property.
    def getCommand(): String = ???

    @stub
    // Retrieves the logical name that identifies the data source for this
    // RowSet object.
    def getDataSourceName(): String = ???

    @stub
    // Retrieves whether escape processing is enabled for this
    // RowSet object.
    def getEscapeProcessing(): Boolean = ???

    @stub
    // Retrieves the maximum number of bytes that may be returned
    // for certain column values.
    def getMaxFieldSize(): Int = ???

    @stub
    // Retrieves the maximum number of rows that this RowSet
    // object can contain.
    def getMaxRows(): Int = ???

    @stub
    // Retrieves the password used to create a database connection.
    def getPassword(): String = ???

    @stub
    // Retrieves the maximum number of seconds the driver will wait for
    // a statement to execute.
    def getQueryTimeout(): Int = ???

    @stub
    // Retrieves the transaction isolation level set for this
    // RowSet object.
    def getTransactionIsolation(): Int = ???

    @stub
    // Retrieves the Map object associated with this
    // RowSet object, which specifies the custom mapping
    // of SQL user-defined types, if any.
    def getTypeMap(): Map[String, Class[_]] = ???

    @stub
    // Retrieves the url property this RowSet object will use to
    // create a connection if it uses the DriverManager
    // instead of a DataSource object to establish the connection.
    def getUrl(): String = ???

    @stub
    // Retrieves the username used to create a database connection for this
    // RowSet object.
    def getUsername(): String = ???

    @stub
    // Retrieves whether this RowSet object is read-only.
    def isReadOnly(): Boolean = ???

    @stub
    // Removes the specified listener from the list of components that will be
    // notified when an event occurs on this RowSet object.
    def removeRowSetListener(listener: RowSetListener): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // with the given  Array value.
    def setArray(i: Int, x: Array): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to the given input stream.
    def setAsciiStream(parameterIndex: Int, x: InputStream): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to the given java.io.InputStream value.
    def setAsciiStream(parameterIndex: Int, x: InputStream, length: Int): Unit = ???

    @stub
    // Sets the designated parameter to the given input stream.
    def setAsciiStream(parameterName: String, x: InputStream): Unit = ???

    @stub
    // Sets the designated parameter to the given input stream, which will have
    // the specified number of bytes.
    def setAsciiStream(parameterName: String, x: InputStream, length: Int): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to the given java.math.BigDeciaml value.
    def setBigDecimal(parameterIndex: Int, x: BigDecimal): Unit = ???

    @stub
    // Sets the designated parameter to the given
    // java.math.BigDecimal value.
    def setBigDecimal(parameterName: String, x: BigDecimal): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to the given input stream.
    def setBinaryStream(parameterIndex: Int, x: InputStream): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to the given java.io.InputStream value.
    def setBinaryStream(parameterIndex: Int, x: InputStream, length: Int): Unit = ???

    @stub
    // Sets the designated parameter to the given input stream.
    def setBinaryStream(parameterName: String, x: InputStream): Unit = ???

    @stub
    // Sets the designated parameter to the given input stream, which will have
    // the specified number of bytes.
    def setBinaryStream(parameterName: String, x: InputStream, length: Int): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // with the given  Blob value.
    def setBlob(i: Int, x: Blob): Unit = ???

    @stub
    // Sets the designated parameter to a InputStream object.
    def setBlob(parameterIndex: Int, inputStream: InputStream): Unit = ???

    @stub
    // Sets the designated parameter to a InputStream object.
    def setBlob(parameterIndex: Int, inputStream: InputStream, length: Long): Unit = ???

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
    // Sets the designated parameter in this RowSet object's command
    // to the given Java boolean value.
    def setBoolean(parameterIndex: Int, x: Boolean): Unit = ???

    @stub
    // Sets the designated parameter to the given Java boolean value.
    def setBoolean(parameterName: String, x: Boolean): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to the given Java byte value.
    def setByte(parameterIndex: Int, x: Byte): Unit = ???

    @stub
    // Sets the designated parameter to the given Java byte value.
    def setByte(parameterName: String, x: Byte): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to the given Java array of byte values.
    def setBytes(parameterIndex: Int, x: Array[Byte]): Unit = ???

    @stub
    // Sets the designated parameter to the given Java array of bytes.
    def setBytes(parameterName: String, x: Array[Byte]): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to the given Reader
    // object.
    def setCharacterStream(parameterIndex: Int, reader: Reader): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to the given java.io.Reader value.
    def setCharacterStream(parameterIndex: Int, reader: Reader, length: Int): Unit = ???

    @stub
    // Sets the designated parameter to the given Reader
    // object.
    def setCharacterStream(parameterName: String, reader: Reader): Unit = ???

    @stub
    // Sets the designated parameter to the given Reader
    // object, which is the given number of characters long.
    def setCharacterStream(parameterName: String, reader: Reader, length: Int): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // with the given  Clob value.
    def setClob(i: Int, x: Clob): Unit = ???

    @stub
    // Sets the designated parameter to a Reader object.
    def setClob(parameterIndex: Int, reader: Reader): Unit = ???

    @stub
    // Sets the designated parameter to a Reader object.
    def setClob(parameterIndex: Int, reader: Reader, length: Long): Unit = ???

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
    // Sets this RowSet object's command property to the given
    // SQL query.
    def setCommand(cmd: String): Unit = ???

    @stub
    // Sets the concurrency of this RowSet object to the given
    // concurrency level.
    def setConcurrency(concurrency: Int): Unit = ???

    @stub
    // Sets the data source name property for this RowSet object to the
    // given String.
    def setDataSourceName(name: String): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to the given java.sql.Date value.
    def setDate(parameterIndex: Int, x: Date): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // with the given  java.sql.Date value.
    def setDate(parameterIndex: Int, x: Date, cal: Calendar): Unit = ???

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
    // Sets the designated parameter in this RowSet object's command
    // to the given Java double value.
    def setDouble(parameterIndex: Int, x: double): Unit = ???

    @stub
    // Sets the designated parameter to the given Java double value.
    def setDouble(parameterName: String, x: double): Unit = ???

    @stub
    // Sets escape processing for this RowSet object on or
    // off.
    def setEscapeProcessing(enable: Boolean): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to the given Java float value.
    def setFloat(parameterIndex: Int, x: float): Unit = ???

    @stub
    // Sets the designated parameter to the given Java float value.
    def setFloat(parameterName: String, x: float): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to the given Java int value.
    def setInt(parameterIndex: Int, x: Int): Unit = ???

    @stub
    // Sets the designated parameter to the given Java int value.
    def setInt(parameterName: String, x: Int): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to the given Java long value.
    def setLong(parameterIndex: Int, x: Long): Unit = ???

    @stub
    // Sets the designated parameter to the given Java long value.
    def setLong(parameterName: String, x: Long): Unit = ???

    @stub
    // Sets the maximum number of bytes that can be returned for a column
    // value to the given number of bytes.
    def setMaxFieldSize(max: Int): Unit = ???

    @stub
    // Sets the maximum number of rows that this RowSet
    // object can contain to the specified number.
    def setMaxRows(max: Int): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to a Reader object.
    def setNCharacterStream(parameterIndex: Int, value: Reader): Unit = ???

    @stub
    // Sets the designated parameter to a Reader object.
    def setNCharacterStream(parameterIndex: Int, value: Reader, length: Long): Unit = ???

    @stub
    // Sets the designated parameter to a Reader object.
    def setNCharacterStream(parameterName: String, value: Reader): Unit = ???

    @stub
    // Sets the designated parameter to a Reader object.
    def setNCharacterStream(parameterName: String, value: Reader, length: Long): Unit = ???

    @stub
    // Sets the designated parameter to a java.sql.NClob object.
    def setNClob(parameterIndex: Int, value: NClob): Unit = ???

    @stub
    // Sets the designated parameter to a Reader object.
    def setNClob(parameterIndex: Int, reader: Reader): Unit = ???

    @stub
    // Sets the designated parameter to a Reader object.
    def setNClob(parameterIndex: Int, reader: Reader, length: Long): Unit = ???

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
    def setNString(parameterIndex: Int, value: String): Unit = ???

    @stub
    // Sets the designated parameter to the given String object.
    def setNString(parameterName: String, value: String): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's SQL
    // command to SQL NULL.
    def setNull(parameterIndex: Int, sqlType: Int): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's SQL
    // command to SQL NULL.
    def setNull(paramIndex: Int, sqlType: Int, typeName: String): Unit = ???

    @stub
    // Sets the designated parameter to SQL NULL.
    def setNull(parameterName: String, sqlType: Int): Unit = ???

    @stub
    // Sets the designated parameter to SQL NULL.
    def setNull(parameterName: String, sqlType: Int, typeName: String): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // with a Java Object.
    def setObject(parameterIndex: Int, x: Object): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // with a Java Object.
    def setObject(parameterIndex: Int, x: Object, targetSqlType: Int): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // with the given Java Object.
    def setObject(parameterIndex: Int, x: Object, targetSqlType: Int, scaleOrLength: Int): Unit = ???

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
    // Sets the database password for this RowSet object to
    // the given String.
    def setPassword(password: String): Unit = ???

    @stub
    // Sets the maximum time the driver will wait for
    // a statement to execute to the given number of seconds.
    def setQueryTimeout(seconds: Int): Unit = ???

    @stub
    // Sets whether this RowSet object is read-only to the
    // given boolean.
    def setReadOnly(value: Boolean): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // with the given  Ref value.
    def setRef(i: Int, x: Ref): Unit = ???

    @stub
    // Sets the designated parameter to the given java.sql.RowId object.
    def setRowId(parameterIndex: Int, x: RowId): Unit = ???

    @stub
    // Sets the designated parameter to the given java.sql.RowId object.
    def setRowId(parameterName: String, x: RowId): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to the given Java short value.
    def setShort(parameterIndex: Int, x: Short): Unit = ???

    @stub
    // Sets the designated parameter to the given Java short value.
    def setShort(parameterName: String, x: Short): Unit = ???

    @stub
    // Sets the designated parameter to the given java.sql.SQLXML object.
    def setSQLXML(parameterIndex: Int, xmlObject: SQLXML): Unit = ???

    @stub
    // Sets the designated parameter to the given java.sql.SQLXML object.
    def setSQLXML(parameterName: String, xmlObject: SQLXML): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to the given Java String value.
    def setString(parameterIndex: Int, x: String): Unit = ???

    @stub
    // Sets the designated parameter to the given Java String value.
    def setString(parameterName: String, x: String): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to the given java.sql.Time value.
    def setTime(parameterIndex: Int, x: Time): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // with the given  java.sql.Time value.
    def setTime(parameterIndex: Int, x: Time, cal: Calendar): Unit = ???

    @stub
    // Sets the designated parameter to the given java.sql.Time value.
    def setTime(parameterName: String, x: Time): Unit = ???

    @stub
    // Sets the designated parameter to the given java.sql.Time value,
    // using the given Calendar object.
    def setTime(parameterName: String, x: Time, cal: Calendar): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // to the given java.sql.Timestamp value.
    def setTimestamp(parameterIndex: Int, x: Timestamp): Unit = ???

    @stub
    // Sets the designated parameter in this RowSet object's command
    // with the given  java.sql.Timestamp value.
    def setTimestamp(parameterIndex: Int, x: Timestamp, cal: Calendar): Unit = ???

    @stub
    // Sets the designated parameter to the given java.sql.Timestamp value.
    def setTimestamp(parameterName: String, x: Timestamp): Unit = ???

    @stub
    // Sets the designated parameter to the given java.sql.Timestamp value,
    // using the given Calendar object.
    def setTimestamp(parameterName: String, x: Timestamp, cal: Calendar): Unit = ???

    @stub
    // Sets the transaction isolation level for this RowSet object.
    def setTransactionIsolation(level: Int): Unit = ???

    @stub
    // Sets the type of this RowSet object to the given type.
    def setType(type: Int): Unit = ???

    @stub
    // Installs the given java.util.Map object as the default
    // type map for this RowSet object.
    def setTypeMap(map: Map[String, Class[_]]): Unit = ???

    @stub
    // Sets the designated parameter to the given java.net.URL value.
    def setURL(parameterIndex: Int, x: URL): Unit = ???

    @stub
    // Sets the URL this RowSet object will use when it uses the
    // DriverManager to create a connection.
    def setUrl(url: String): Unit = ???
}
