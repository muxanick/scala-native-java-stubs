package javax.sql.rowset

import java.io.{InputStream, Reader, Serializable}
import java.lang.{Class, Cloneable, Object, String}
import java.math.BigDecimal
import java.net.URL
import java.sql.{Array, Blob, Clob, Date, NClob, Ref, RowId, SQLXML, Time, Timestamp}
import java.util.{Calendar, Map}
import javax.sql.RowSetListener
import scala.scalanative.annotation.stub

/** An abstract class providing a RowSet object with its basic functionality.
 *  The basic functions include having properties and sending event notifications,
 *  which all JavaBeans™ components must implement.
 * 
 *  1.0 Overview
 *  The BaseRowSet class provides the core functionality
 *  for all RowSet implementations,
 *  and all standard implementations may use this class in combination with
 *  one or more RowSet interfaces in order to provide a standard
 *  vendor-specific implementation.  To clarify, all implementations must implement
 *  at least one of the RowSet interfaces (JdbcRowSet,
 *  CachedRowSet, JoinRowSet, FilteredRowSet,
 *  or WebRowSet). This means that any implementation that extends
 *  the BaseRowSet class must also implement one of the RowSet
 *  interfaces.
 *  
 *  The BaseRowSet class provides the following:
 * 
 *  
 *  Properties
 *      
 *      Fields for storing current properties
 *      Methods for getting and setting properties
 *      
 * 
 *  Event notification
 * 
 *  A complete set of setter methods for setting the parameters in a
 *       RowSet object's command
 * 
 *   Streams
 *   
 *   Fields for storing stream instances
 *   Constants for indicating the type of a stream
 *   
 *   
 *  
 * 
 *  2.0 Setting Properties
 *  All rowsets maintain a set of properties, which will usually be set using
 *  a tool.  The number and kinds of properties a rowset has will vary,
 *  depending on what the RowSet implementation does and how it gets
 *  its data.  For example,
 *  rowsets that get their data from a ResultSet object need to
 *  set the properties that are required for making a database connection.
 *  If a RowSet object uses the DriverManager facility to make a
 *  connection, it needs to set a property for the JDBC URL that identifies the
 *  appropriate driver, and it needs to set the properties that give the
 *  user name and password.
 *  If, on the other hand, the rowset uses a DataSource object
 *  to make the connection, which is the preferred method, it does not need to
 *  set the property for the JDBC URL.  Instead, it needs to set the property
 *  for the logical name of the data source along with the properties for
 *  the user name and password.
 *  
 *  NOTE:  In order to use a DataSource object for making a
 *  connection, the DataSource object must have been registered
 *  with a naming service that uses the Java Naming and Directory
 *  Interface™ (JNDI) API.  This registration
 *  is usually done by a person acting in the capacity of a system administrator.
 * 
 *  3.0 Setting the Command and Its Parameters
 *  When a rowset gets its data from a relational database, it executes a command (a query)
 *  that produces a ResultSet object.  This query is the command that is set
 *  for the RowSet object's command property.  The rowset populates itself with data by reading the
 *  data from the ResultSet object into itself. If the query
 *  contains placeholders for values to be set, the BaseRowSet setter methods
 *  are used to set these values. All setter methods allow these values to be set
 *  to null if required.
 *  
 *  The following code fragment illustrates how the
 *  CachedRowSet™
 *  object crs might have its command property set.  Note that if a
 *  tool is used to set properties, this is the code that the tool would use.
 *  
 *     crs.setCommand("SELECT FIRST_NAME, LAST_NAME, ADDRESS FROM CUSTOMERS" +
 *                    "WHERE CREDIT_LIMIT > ? AND REGION = ?");
 *  
 *  
 *  In this example, the values for CREDIT_LIMIT and
 *  REGION are placeholder parameters, which are indicated with a
 *  question mark (?).  The first question mark is placeholder parameter number
 *  1, the second question mark is placeholder parameter number
 *  2, and so on.  Any placeholder parameters must be set with
 *  values before the query can be executed. To set these
 *  placeholder parameters, the BaseRowSet class provides a set of setter
 *  methods, similar to those provided by the PreparedStatement
 *  interface, for setting values of each data type.  A RowSet object stores the
 *  parameter values internally, and its execute method uses them internally
 *  to set values for the placeholder parameters
 *  before it sends the command to the DBMS to be executed.
 *  
 *  The following code fragment demonstrates
 *  setting the two parameters in the query from the previous example.
 *  
 *     crs.setInt(1, 5000);
 *     crs.setString(2, "West");
 *  
 *  If the execute method is called at this point, the query
 *  sent to the DBMS will be:
 *  
 *     "SELECT FIRST_NAME, LAST_NAME, ADDRESS FROM CUSTOMERS" +
 *                    "WHERE CREDIT_LIMIT > 5000 AND REGION = 'West'"
 *  
 *  NOTE: Setting Array, Clob, Blob and
 *  Ref objects as a command parameter, stores these values as
 *  SerialArray, SerialClob, SerialBlob
 *  and SerialRef objects respectively.
 * 
 *  4.0 Handling of Parameters Behind the Scenes
 * 
 *  NOTE: The BaseRowSet class provides two kinds of setter methods,
 *  those that set properties and those that set placeholder parameters. The setter
 *  methods discussed in this section are those that set placeholder parameters.
 *  
 *  The placeholder parameters set with the BaseRowSet setter methods
 *  are stored as objects in an internal Hashtable object.
 *  Primitives are stored as their Object type. For example, byte
 *  is stored as Byte object, and int is stored as
 *  an Integer object.
 *  When the method execute is called, the values in the
 *  Hashtable object are substituted for the appropriate placeholder
 *  parameters in the command.
 *  
 *  A call to the method getParams returns the values stored in the
 *  Hashtable object as an array of Object instances.
 *  An element in this array may be a simple Object instance or an
 *  array (which is a type of Object). The particular setter method used
 *  determines whether an element in this array is an Object or an array.
 *  
 *  The majority of methods for setting placeholder parameters take two parameters,
 *   with the first parameter
 *  indicating which placeholder parameter is to be set, and the second parameter
 *  giving the value to be set.  Methods such as setInt,
 *  setString, setBoolean, and setLong fall into
 *  this category.  After these methods have been called, a call to the method
 *  getParams will return an array with the values that have been set. Each
 *  element in the array is an Object instance representing the
 *  values that have been set. The order of these values in the array is determined by the
 *  int (the first parameter) passed to the setter method. The values in the
 *  array are the values (the second parameter) passed to the setter method.
 *  In other words, the first element in the array is the value
 *  to be set for the first placeholder parameter in the RowSet object's
 *  command. The second element is the value to
 *  be set for the second placeholder parameter, and so on.
 *  
 *  Several setter methods send the driver and DBMS information beyond the value to be set.
 *  When the method getParams is called after one of these setter methods has
 *  been used, the elements in the array will themselves be arrays to accommodate the
 *  additional information. In this category, the method setNull is a special case
 *  because one version takes only
 *  two parameters (setNull(int parameterIndex, int SqlType)). Nevertheless,
 *  it requires
 *  an array to contain the information that will be passed to the driver and DBMS.  The first
 *  element in this array is the value to be set, which is null, and the
 *  second element is the int supplied for sqlType, which
 *  indicates the type of SQL value that is being set to null. This information
 *  is needed by some DBMSs and is therefore required in order to ensure that applications
 *  are portable.
 *  The other version is intended to be used when the value to be set to null
 *  is a user-defined type. It takes three parameters
 *  (setNull(int parameterIndex, int sqlType, String typeName)) and also
 *  requires an array to contain the information to be passed to the driver and DBMS.
 *  The first two elements in this array are the same as for the first version of
 *  setNull.  The third element, typeName, gives the SQL name of
 *  the user-defined type. As is true with the other setter methods, the number of the
 *  placeholder parameter to be set is indicated by an element's position in the array
 *  returned by getParams.  So, for example, if the parameter
 *  supplied to setNull is 2, the second element in the array
 *  returned by getParams will be an array of two or three elements.
 *  
 *  Some methods, such as setObject and setDate have versions
 *  that take more than two parameters, with the extra parameters giving information
 *  to the driver or the DBMS. For example, the methods setDate,
 *  setTime, and setTimestamp can take a Calendar
 *  object as their third parameter.  If the DBMS does not store time zone information,
 *  the driver uses the Calendar object to construct the Date,
 *  Time, or Timestamp object being set. As is true with other
 *  methods that provide additional information, the element in the array returned
 *  by getParams is an array instead of a simple Object instance.
 *  
 *  The methods setAsciiStream, setBinaryStream,
 *  setCharacterStream, and setUnicodeStream (which is
 *  deprecated, so applications should use getCharacterStream instead)
 *  take three parameters, so for them, the element in the array returned by
 *  getParams is also an array.  What is different about these setter
 *  methods is that in addition to the information provided by parameters, the array contains
 *  one of the BaseRowSet constants indicating the type of stream being set.
 *  
 *  NOTE: The method getParams is called internally by
 *  RowSet implementations extending this class; it is not normally called by an
 *  application programmer directly.
 * 
 *  5.0 Event Notification
 *  The BaseRowSet class provides the event notification
 *  mechanism for rowsets.  It contains the field
 *  listeners, methods for adding and removing listeners, and
 *  methods for notifying listeners of changes.
 *  
 *  A listener is an object that has implemented the RowSetListener interface.
 *  If it has been added to a RowSet object's list of listeners, it will be notified
 *   when an event occurs on that RowSet object.  Each listener's
 *  implementation of the RowSetListener methods defines what that object
 *  will do when it is notified that an event has occurred.
 *  
 *  There are three possible events for a RowSet object:
 *  
 *  the cursor moves
 *  an individual row is changed (updated, deleted, or inserted)
 *  the contents of the entire RowSet object  are changed
 *  
 *  
 *  The BaseRowSet method used for the notification indicates the
 *  type of event that has occurred.  For example, the method
 *  notifyRowChanged indicates that a row has been updated,
 *  deleted, or inserted.  Each of the notification methods creates a
 *  RowSetEvent object, which is supplied to the listener in order to
 *  identify the RowSet object on which the event occurred.
 *  What the listener does with this information, which may be nothing, depends on how it was
 *  implemented.
 * 
 *  6.0 Default Behavior
 *  A default BaseRowSet object is initialized with many starting values.
 * 
 *  The following is true of a default RowSet instance that extends
 *  the BaseRowSet class:
 *  
 *    Has a scrollable cursor and does not show changes
 *        made by others.
 *    Is updatable.
 *    Does not show rows that have been deleted.
 *    Has no time limit for how long a driver may take to
 *        execute the RowSet object's command.
 *    Has no limit for the number of rows it may contain.
 *    Has no limit for the number of bytes a column may contain. NOTE: This
 *    limit applies only to columns that hold values of the
 *    following types:  BINARY, VARBINARY,
 *    LONGVARBINARY, CHAR, VARCHAR,
 *    and LONGVARCHAR.
 *    Will not see uncommitted data (make "dirty" reads).
 *    Has escape processing turned on.
 *    Has its connection's type map set to null.
 *    Has an empty Vector object for storing the values set
 *        for the placeholder parameters in the RowSet object's command.
 *  
 *  
 *  If other values are desired, an application must set the property values
 *  explicitly. For example, the following line of code sets the maximum number
 *  of rows for the CachedRowSet object crs to 500.
 *  
 *     crs.setMaxRows(500);
 *  
 *  Methods implemented in extensions of this BaseRowSet class must throw an
 *  SQLException object for any violation of the defined assertions.  Also, if the
 *  extending class overrides and reimplements any BaseRowSet method and encounters
 *  connectivity or underlying data source issues, that method may in addition throw an
 *  SQLException object for that reason.
 */
abstract class BaseRowSet extends Object with Serializable with Cloneable {

    /** Constructs a new BaseRowSet object initialized with
     *  a default Vector object for its listeners
     *  field.
     */
    @stub
    def this() = ???

    /** The InputStream object that will be
     *  returned by the method getAsciiStream,
     *  which is specified in the ResultSet interface.
     */
    protected val asciiStream: InputStream

    /** The InputStream object that will be
     *  returned by the method getBinaryStream, which is
     *  specified in the ResultSet interface.
     */
    protected val binaryStream: InputStream

    /** The Reader object that will be
     *  returned by the method getCharacterStream,
     *  which is specified in the ResultSet interface.
     */
    protected val charStream: Reader

    /** The InputStream object that will be
     *  returned by the method getUnicodeStream,
     *  which is specified in the ResultSet interface.
     */
    protected val unicodeStream: InputStream

    /** The listener will be notified whenever an event occurs on this RowSet
     *  object.
     */
    def addRowSetListener(listener: RowSetListener): Unit

    /** Clears all of the current parameter values in this RowSet
     *  object's internal representation of the parameters to be set in
     *  this RowSet object's command when it is executed.
     */
    def clearParameters(): Unit

    /** Retrieves the SQL query that is the command for this
     *  RowSet object.
     */
    def getCommand(): String

    /** Returns the concurrency for this RowSet object. */
    def getConcurrency(): Int

    /** Returns the logical name that when supplied to a naming service
     *  that uses the Java Naming and Directory Interface (JNDI) API, will
     *  retrieve a javax.sql.DataSource object.
     */
    def getDataSourceName(): String

    /** Ascertains whether escape processing is enabled for this
     *  RowSet object.
     */
    def getEscapeProcessing(): Boolean

    /** Retrieves this RowSet object's current setting for the
     *  fetch direction.
     */
    def getFetchDirection(): Int

    /** Returns the fetch size for this RowSet object. */
    def getFetchSize(): Int

    /** Retrieves the maximum number of bytes that can be used for a column
     *  value in this RowSet object.
     */
    def getMaxFieldSize(): Int

    /** Retrieves the maximum number of rows that this RowSet object may contain. */
    def getMaxRows(): Int

    /** Retrieves an array containing the parameter values (both Objects and
     *  primitives) that have been set for this
     *  RowSet object's command and throws an SQLException object
     *  if all parameters have not been set.
     */
    def getParams(): Array[Object]

    /** Returns the password used to create a database connection for this
     *  RowSet object.
     */
    def getPassword(): String

    /** Retrieves the maximum number of seconds the driver will wait for a
     *  query to execute.
     */
    def getQueryTimeout(): Int

    /** Retrieves a boolean indicating whether rows marked
     *  for deletion appear in the set of current rows.
     */
    def getShowDeleted(): Boolean

    /** Returns the transaction isolation property for this
     *  RowSet object's connection.
     */
    def getTransactionIsolation(): Int

    /** Returns the type of this RowSet object. */
    def getType(): Int

    /** Retrieves the type map associated with the Connection
     *  object for this RowSet object.
     */
    def getTypeMap(): Map[String, Class[_]]

    /** Retrieves the JDBC URL that this RowSet object's
     *  javax.sql.Reader object uses to make a connection
     *  with a relational database using a JDBC technology-enabled driver.
     */
    def getUrl(): String

    /** Returns the user name used to create a database connection. */
    def getUsername(): String

    /** Performs the necessary internal configurations and initializations
     *  to allow any JDBC RowSet implementation to start using
     *  the standard facilities provided by a BaseRowSet
     *  instance.
     */
    protected def initParams(): Unit

    /** Returns a boolean indicating whether this
     *  RowSet object is read-only.
     */
    def isReadOnly(): Boolean

    /** Notifies all of the listeners registered with this
     *  RowSet object that its cursor has moved.
     */
    protected def notifyCursorMoved(): Unit

    /** Notifies all of the listeners registered with this RowSet object that
     *  one of its rows has changed.
     */
    protected def notifyRowChanged(): Unit

    /** Notifies all of the listeners registered with this RowSet
     *  object that its entire contents have changed.
     */
    protected def notifyRowSetChanged(): Unit

    /** Removes the designated object from this RowSet object's list of listeners. */
    def removeRowSetListener(listener: RowSetListener): Unit

    /** Sets the designated parameter to an Array object in the
     *  Java programming language.
     */
    def setArray(parameterIndex: Int, array: Array): Unit

    /** Sets the designated parameter in this RowSet object's command
     *  to the given input stream.
     */
    def setAsciiStream(parameterIndex: Int, x: InputStream): Unit

    /** Sets the designated parameter to the given
     *  java.io.InputStream object,
     *  which will have the specified number of bytes.
     */
    def setAsciiStream(parameterIndex: Int, x: InputStream, length: Int): Unit

    /** Sets the designated parameter to the given input stream. */
    def setAsciiStream(parameterName: String, x: InputStream): Unit

    /** Sets the designated parameter to the given input stream, which will have
     *  the specified number of bytes.
     */
    def setAsciiStream(parameterName: String, x: InputStream, length: Int): Unit

    /** Sets the designated parameter to the given
     *  java.lang.BigDecimal value.
     */
    def setBigDecimal(parameterIndex: Int, x: BigDecimal): Unit

    /** Sets the designated parameter to the given
     *  java.math.BigDecimal value.
     */
    def setBigDecimal(parameterName: String, x: BigDecimal): Unit

    /** Sets the designated parameter in this RowSet object's command
     *  to the given input stream.
     */
    def setBinaryStream(parameterIndex: Int, x: InputStream): Unit

    /** Sets the designated parameter to the given java.io.InputStream
     *  object, which will have the specified number of bytes.
     */
    def setBinaryStream(parameterIndex: Int, x: InputStream, length: Int): Unit

    /** Sets the designated parameter to the given input stream. */
    def setBinaryStream(parameterName: String, x: InputStream): Unit

    /** Sets the designated parameter to the given input stream, which will have
     *  the specified number of bytes.
     */
    def setBinaryStream(parameterName: String, x: InputStream, length: Int): Unit

    /** Sets the designated parameter to the given Blob object in
     *  the Java programming language.
     */
    def setBlob(parameterIndex: Int, x: Blob): Unit

    /** Sets the designated parameter to a InputStream object. */
    def setBlob(parameterIndex: Int, inputStream: InputStream): Unit

    /** Sets the designated parameter to a InputStream object. */
    def setBlob(parameterIndex: Int, inputStream: InputStream, length: Long): Unit

    /** Sets the designated parameter to the given java.sql.Blob object. */
    def setBlob(parameterName: String, x: Blob): Unit

    /** Sets the designated parameter to a InputStream object. */
    def setBlob(parameterName: String, inputStream: InputStream): Unit

    /** Sets the designated parameter to a InputStream object. */
    def setBlob(parameterName: String, inputStream: InputStream, length: Long): Unit

    /** Sets the designated parameter to the given boolean in the
     *  Java programming language.
     */
    def setBoolean(parameterIndex: Int, x: Boolean): Unit

    /** Sets the designated parameter to the given Java boolean value. */
    def setBoolean(parameterName: String, x: Boolean): Unit

    /** Sets the designated parameter to the given byte in the Java
     *  programming language.
     */
    def setByte(parameterIndex: Int, x: Byte): Unit

    /** Sets the designated parameter to the given Java byte value. */
    def setByte(parameterName: String, x: Byte): Unit

    /** Sets the designated parameter to the given array of bytes. */
    def setBytes(parameterIndex: Int, x: Array[Byte]): Unit

    /** Sets the designated parameter to the given Java array of bytes. */
    def setBytes(parameterName: String, x: Array[Byte]): Unit

    /** Sets the designated parameter in this RowSet object's command
     *  to the given Reader
     *  object.
     */
    def setCharacterStream(parameterIndex: Int, reader: Reader): Unit

    /** Sets the designated parameter to the given java.io.Reader
     *  object, which will have the specified number of characters.
     */
    def setCharacterStream(parameterIndex: Int, reader: Reader, length: Int): Unit

    /** Sets the designated parameter to the given Reader
     *  object.
     */
    def setCharacterStream(parameterName: String, reader: Reader): Unit

    /** Sets the designated parameter to the given Reader
     *  object, which is the given number of characters long.
     */
    def setCharacterStream(parameterName: String, reader: Reader, length: Int): Unit

    /** Sets the designated parameter to the given Clob object in
     *  the Java programming language.
     */
    def setClob(parameterIndex: Int, x: Clob): Unit

    /** Sets the designated parameter to a Reader object. */
    def setClob(parameterIndex: Int, reader: Reader): Unit

    /** Sets the designated parameter to a Reader object. */
    def setClob(parameterIndex: Int, reader: Reader, length: Long): Unit

    /** Sets the designated parameter to the given java.sql.Clob object. */
    def setClob(parameterName: String, x: Clob): Unit

    /** Sets the designated parameter to a Reader object. */
    def setClob(parameterName: String, reader: Reader): Unit

    /** Sets the designated parameter to a Reader object. */
    def setClob(parameterName: String, reader: Reader, length: Long): Unit

    /** Sets this RowSet object's command property to
     *  the given String object and clears the parameters, if any,
     *  that were set for the previous command.
     */
    def setCommand(cmd: String): Unit

    /** Sets the concurrency for this RowSet object to
     *  the specified concurrency.
     */
    def setConcurrency(concurrency: Int): Unit

    /** Sets the DataSource name property for this RowSet
     *  object to the given logical name and sets this RowSet object's
     *  Url property to null.
     */
    def setDataSourceName(name: String): Unit

    /** Sets the designated parameter to the given java.sql.Date
     *  value.
     */
    def setDate(parameterIndex: Int, x: Date): Unit

    /** Sets the designated parameter to the given java.sql.Date
     *  object.
     */
    def setDate(parameterIndex: Int, x: Date, cal: Calendar): Unit

    /** Sets the designated parameter to the given java.sql.Date value
     *  using the default time zone of the virtual machine that is running
     *  the application.
     */
    def setDate(parameterName: String, x: Date): Unit

    /** Sets the designated parameter to the given java.sql.Date value,
     *  using the given Calendar object.
     */
    def setDate(parameterName: String, x: Date, cal: Calendar): Unit

    /** Sets the designated parameter to the given double in the
     *  Java programming language.
     */
    def setDouble(parameterIndex: Int, x: Double): Unit

    /** Sets the designated parameter to the given Java double value. */
    def setDouble(parameterName: String, x: Double): Unit

    /** Sets to the given boolean whether or not the driver will
     *  scan for escape syntax and do escape substitution before sending SQL
     *  statements to the database.
     */
    def setEscapeProcessing(enable: Boolean): Unit

    /** Gives the driver a performance hint as to the direction in
     *  which the rows in this RowSet object will be
     *  processed.
     */
    def setFetchDirection(direction: Int): Unit

    /** Sets the fetch size for this RowSet object to the given number of
     *  rows.
     */
    def setFetchSize(rows: Int): Unit

    /** Sets the designated parameter to the given float in the
     *  Java programming language.
     */
    def setFloat(parameterIndex: Int, x: Float): Unit

    /** Sets the designated parameter to the given Java float value. */
    def setFloat(parameterName: String, x: Float): Unit

    /** Sets the designated parameter to an int in the Java
     *  programming language.
     */
    def setInt(parameterIndex: Int, x: Int): Unit

    /** Sets the designated parameter to the given Java int value. */
    def setInt(parameterName: String, x: Int): Unit

    /** Sets the designated parameter to the given long in the Java
     *  programming language.
     */
    def setLong(parameterIndex: Int, x: Long): Unit

    /** Sets the designated parameter to the given Java long value. */
    def setLong(parameterName: String, x: Long): Unit

    /** Sets the maximum number of bytes that can be used for a column
     *  value in this RowSet object to the given number.
     */
    def setMaxFieldSize(max: Int): Unit

    /** Sets the maximum number of rows that this RowSet object may contain to
     *  the given number.
     */
    def setMaxRows(max: Int): Unit

    /** Sets the designated parameter in this RowSet object's command
     *  to a Reader object.
     */
    def setNCharacterStream(parameterIndex: Int, value: Reader): Unit

    /** Sets the designated parameter to a Reader object. */
    def setNCharacterStream(parameterIndex: Int, value: Reader, length: Long): Unit

    /** Sets the designated parameter to a Reader object. */
    def setNCharacterStream(parameterName: String, value: Reader): Unit

    /** Sets the designated parameter to a Reader object. */
    def setNCharacterStream(parameterName: String, value: Reader, length: Long): Unit

    /** Sets the designated parameter to a java.sql.NClob object. */
    def setNClob(parameterIndex: Int, value: NClob): Unit

    /** Sets the designated parameter to a Reader object. */
    def setNClob(parameterIndex: Int, reader: Reader): Unit

    /** Sets the designated parameter to a Reader object. */
    def setNClob(parameterIndex: Int, reader: Reader, length: Long): Unit

    /** Sets the designated parameter to a java.sql.NClob object. */
    def setNClob(parameterName: String, value: NClob): Unit

    /** Sets the designated parameter to a Reader object. */
    def setNClob(parameterName: String, reader: Reader): Unit

    /** Sets the designated parameter to a Reader object. */
    def setNClob(parameterName: String, reader: Reader, length: Long): Unit

    /** Sets the designated parameter to the given String object. */
    def setNString(parameterIndex: Int, value: String): Unit

    /** Sets the designated parameter to the given String object. */
    def setNString(parameterName: String, value: String): Unit

    /** Sets the designated parameter to SQL NULL. */
    def setNull(parameterIndex: Int, sqlType: Int): Unit

    /** Sets the designated parameter to SQL NULL. */
    def setNull(parameterIndex: Int, sqlType: Int, typeName: String): Unit

    /** Sets the designated parameter to SQL NULL. */
    def setNull(parameterName: String, sqlType: Int): Unit

    /** Sets the designated parameter to SQL NULL. */
    def setNull(parameterName: String, sqlType: Int, typeName: String): Unit

    /** Sets the designated parameter to an Object in the Java
     *  programming language.
     */
    def setObject(parameterIndex: Int, x: Any): Unit

    /** Sets the value of the designated parameter with the given
     *  Object value.
     */
    def setObject(parameterIndex: Int, x: Any, targetSqlType: Int): Unit

    /** Sets the designated parameter to an Object in the Java
     *  programming language.
     */
    def setObject(parameterIndex: Int, x: Any, targetSqlType: Int, scale: Int): Unit

    /** Sets the value of the designated parameter with the given object. */
    def setObject(parameterName: String, x: Any): Unit

    /** Sets the value of the designated parameter with the given object. */
    def setObject(parameterName: String, x: Any, targetSqlType: Int): Unit

    /** Sets the value of the designated parameter with the given object. */
    def setObject(parameterName: String, x: Any, targetSqlType: Int, scale: Int): Unit

    /** Sets the password used to create a database connection for this
     *  RowSet object to the given String
     *  object.
     */
    def setPassword(pass: String): Unit

    /** Sets to the given number the maximum number of seconds the driver will
     *  wait for a query to execute.
     */
    def setQueryTimeout(seconds: Int): Unit

    /** Sets this RowSet object's readOnly  property to the given boolean. */
    def setReadOnly(value: Boolean): Unit

    /** Sets the designated parameter to the given Ref object in
     *  the Java programming language.
     */
    def setRef(parameterIndex: Int, ref: Ref): Unit

    /** Sets the designated parameter to the given java.sql.RowId object. */
    def setRowId(parameterIndex: Int, x: RowId): Unit

    /** Sets the designated parameter to the given java.sql.RowId object. */
    def setRowId(parameterName: String, x: RowId): Unit

    /** Sets the designated parameter to the given short in the
     *  Java programming language.
     */
    def setShort(parameterIndex: Int, x: Short): Unit

    /** Sets the designated parameter to the given Java short value. */
    def setShort(parameterName: String, x: Short): Unit

    /** Sets the property showDeleted to the given
     *  boolean value, which determines whether
     *  rows marked for deletion appear in the set of current rows.
     */
    def setShowDeleted(value: Boolean): Unit

    /** Sets the designated parameter to the given java.sql.SQLXML object. */
    def setSQLXML(parameterIndex: Int, xmlObject: SQLXML): Unit

    /** Sets the designated parameter to the given java.sql.SQLXML object. */
    def setSQLXML(parameterName: String, xmlObject: SQLXML): Unit

    /** Sets the designated parameter to the given String
     *  value.
     */
    def setString(parameterIndex: Int, x: String): Unit

    /** Sets the designated parameter to the given Java String value. */
    def setString(parameterName: String, x: String): Unit

    /** Sets the designated parameter to the given java.sql.Time
     *  value.
     */
    def setTime(parameterIndex: Int, x: Time): Unit

    /** Sets the designated parameter to the given java.sql.Time
     *  object.
     */
    def setTime(parameterIndex: Int, x: Time, cal: Calendar): Unit

    /** Sets the designated parameter to the given java.sql.Time value. */
    def setTime(parameterName: String, x: Time): Unit

    /** Sets the designated parameter to the given java.sql.Time value,
     *  using the given Calendar object.
     */
    def setTime(parameterName: String, x: Time, cal: Calendar): Unit

    /** Sets the designated parameter to the given
     *  java.sql.Timestamp value.
     */
    def setTimestamp(parameterIndex: Int, x: Timestamp): Unit

    /** Sets the designated parameter to the given
     *  java.sql.Timestamp object.
     */
    def setTimestamp(parameterIndex: Int, x: Timestamp, cal: Calendar): Unit

    /** Sets the designated parameter to the given java.sql.Timestamp value. */
    def setTimestamp(parameterName: String, x: Timestamp): Unit

    /** Sets the designated parameter to the given java.sql.Timestamp value,
     *  using the given Calendar object.
     */
    def setTimestamp(parameterName: String, x: Timestamp, cal: Calendar): Unit

    /** Sets the transaction isolation property for this JDBC RowSet object to the given
     *  constant.
     */
    def setTransactionIsolation(level: Int): Unit

    /** Sets the type for this RowSet object to the specified type. */
    def setType(type: Int): Unit

    /** Installs the given java.util.Map object as the type map
     *  associated with the Connection object for this
     *  RowSet object.
     */
    def setTypeMap(map: Map[String, Class[_]]): Unit

    /** Deprecated. 
     * getCharacterStream should be used in its place
     * 
     */
    def setUnicodeStream(parameterIndex: Int, x: InputStream, length: Int): Unit

    /** Sets the designated parameter to the given java.net.URL value. */
    def setURL(parameterIndex: Int, x: URL): Unit

    /** Sets the Url property for this RowSet object
     *  to the given String object and sets the dataSource name
     *  property to null.
     */
    def setUrl(url: String): Unit

    /** Sets the username property for this RowSet object
     *  to the given user name.
     */
    def setUsername(name: String): Unit
}

object BaseRowSet {
    /** A constant indicating to a RowSetReaderImpl object
     *  that a given parameter is an ASCII stream.
     */
    @stub
    val ASCII_STREAM_PARAM: Int = ???

    /** A constant indicating to a RowSetReaderImpl object
     *  that a given parameter is a binary stream.
     */
    @stub
    val BINARY_STREAM_PARAM: Int = ???

    /** A constant indicating to a RowSetReaderImpl object
     *  that a given parameter is a Unicode stream.
     */
    @stub
    val UNICODE_STREAM_PARAM: Int = ???
}
