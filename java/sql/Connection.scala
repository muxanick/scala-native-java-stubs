package java.sql

import java.lang.{AutoCloseable, Class, Object, String}
import java.util.{Map, Properties}
import java.util.concurrent.Executor

/** A connection (session) with a specific
 *  database. SQL statements are executed and results are returned
 *  within the context of a connection.
 *  
 *  A Connection object's database is able to provide information
 *  describing its tables, its supported SQL grammar, its stored
 *  procedures, the capabilities of this connection, and so on. This
 *  information is obtained with the getMetaData method.
 * 
 *  Note: When configuring a Connection, JDBC applications
 *   should use the appropriate Connection method such as
 *   setAutoCommit or setTransactionIsolation.
 *   Applications should not invoke SQL commands directly to change the connection's
 *    configuration when there is a JDBC method available.  By default a Connection object is in
 *  auto-commit mode, which means that it automatically commits changes
 *  after executing each statement. If auto-commit mode has been
 *  disabled, the method commit must be called explicitly in
 *  order to commit changes; otherwise, database changes will not be saved.
 *  
 *  A new Connection object created using the JDBC 2.1 core API
 *  has an initially empty type map associated with it. A user may enter a
 *  custom mapping for a UDT in this type map.
 *  When a UDT is retrieved from a data source with the
 *  method ResultSet.getObject, the getObject method
 *  will check the connection's type map to see if there is an entry for that
 *  UDT.  If so, the getObject method will map the UDT to the
 *  class indicated.  If there is no entry, the UDT will be mapped using the
 *  standard mapping.
 *  
 *  A user may create a new type map, which is a java.util.Map
 *  object, make an entry in it, and pass it to the java.sql
 *  methods that can perform custom mapping.  In this case, the method
 *  will use the given type map instead of the one associated with
 *  the connection.
 *  
 *  For example, the following code fragment specifies that the SQL
 *  type ATHLETES will be mapped to the class
 *  Athletes in the Java programming language.
 *  The code fragment retrieves the type map for the Connection
 *   object con, inserts the entry into it, and then sets
 *  the type map with the new entry as the connection's type map.
 *  
 *       java.util.Map map = con.getTypeMap();
 *       map.put("mySchemaName.ATHLETES", Class.forName("Athletes"));
 *       con.setTypeMap(map);
 *  
 */
trait Connection extends Wrapper with AutoCloseable {

    /** Terminates an open connection. */
    @stub
    def abort(executor: Executor): Unit = ???

    /** Clears all warnings reported for this Connection object. */
    @stub
    def clearWarnings(): Unit = ???

    /** Releases this Connection object's database and JDBC resources
     *  immediately instead of waiting for them to be automatically released.
     */
    @stub
    def close(): Unit = ???

    /** Makes all changes made since the previous
     *  commit/rollback permanent and releases any database locks
     *  currently held by this Connection object.
     */
    @stub
    def commit(): Unit = ???

    /** Factory method for creating Array objects. */
    @stub
    def createArrayOf(typeName: String, elements: Array[Object]): Array = ???

    /** Constructs an object that implements the Blob interface. */
    @stub
    def createBlob(): Blob = ???

    /** Constructs an object that implements the Clob interface. */
    @stub
    def createClob(): Clob = ???

    /** Constructs an object that implements the NClob interface. */
    @stub
    def createNClob(): NClob = ???

    /** Constructs an object that implements the SQLXML interface. */
    @stub
    def createSQLXML(): SQLXML = ???

    /** Creates a Statement object for sending
     *  SQL statements to the database.
     */
    @stub
    def createStatement(): Statement = ???

    /** Creates a Statement object that will generate
     *  ResultSet objects with the given type and concurrency.
     */
    @stub
    def createStatement(resultSetType: Int, resultSetConcurrency: Int): Statement = ???

    /** Creates a Statement object that will generate
     *  ResultSet objects with the given type, concurrency,
     *  and holdability.
     */
    @stub
    def createStatement(resultSetType: Int, resultSetConcurrency: Int, resultSetHoldability: Int): Statement = ???

    /** Factory method for creating Struct objects. */
    @stub
    def createStruct(typeName: String, attributes: Array[Object]): Struct = ???

    /** Retrieves the current auto-commit mode for this Connection
     *  object.
     */
    @stub
    def getAutoCommit(): Boolean = ???

    /** Retrieves this Connection object's current catalog name. */
    @stub
    def getCatalog(): String = ???

    /** Returns a list containing the name and current value of each client info
     *  property supported by the driver.
     */
    @stub
    def getClientInfo(): Properties = ???

    /** Returns the value of the client info property specified by name. */
    @stub
    def getClientInfo(name: String): String = ???

    /** Retrieves the current holdability of ResultSet objects
     *  created using this Connection object.
     */
    @stub
    def getHoldability(): Int = ???

    /** Retrieves a DatabaseMetaData object that contains
     *  metadata about the database to which this
     *  Connection object represents a connection.
     */
    @stub
    def getMetaData(): DatabaseMetaData = ???

    /** Retrieves the number of milliseconds the driver will
     *  wait for a database request to complete.
     */
    @stub
    def getNetworkTimeout(): Int = ???

    /** Retrieves this Connection object's current schema name. */
    @stub
    def getSchema(): String = ???

    /** Retrieves this Connection object's current
     *  transaction isolation level.
     */
    @stub
    def getTransactionIsolation(): Int = ???

    /** Retrieves the Map object associated with this
     *  Connection object.
     */
    @stub
    def getTypeMap(): Map[String, Class[_]] = ???

    /** Retrieves the first warning reported by calls on this
     *  Connection object.
     */
    @stub
    def getWarnings(): SQLWarning = ???

    /** Retrieves whether this Connection object has been
     *  closed.
     */
    @stub
    def isClosed(): Boolean = ???

    /** Retrieves whether this Connection
     *  object is in read-only mode.
     */
    @stub
    def isReadOnly(): Boolean = ???

    /** Returns true if the connection has not been closed and is still valid. */
    @stub
    def isValid(timeout: Int): Boolean = ???

    /** Converts the given SQL statement into the system's native SQL grammar. */
    @stub
    def nativeSQL(sql: String): String = ???

    /** Creates a CallableStatement object for calling
     *  database stored procedures.
     */
    @stub
    def prepareCall(sql: String): CallableStatement = ???

    /** Creates a CallableStatement object that will generate
     *  ResultSet objects with the given type and concurrency.
     */
    @stub
    def prepareCall(sql: String, resultSetType: Int, resultSetConcurrency: Int): CallableStatement = ???

    /** Creates a CallableStatement object that will generate
     *  ResultSet objects with the given type and concurrency.
     */
    @stub
    def prepareCall(sql: String, resultSetType: Int, resultSetConcurrency: Int, resultSetHoldability: Int): CallableStatement = ???

    /** Creates a PreparedStatement object for sending
     *  parameterized SQL statements to the database.
     */
    @stub
    def prepareStatement(sql: String): PreparedStatement = ???

    /** Creates a default PreparedStatement object that has
     *  the capability to retrieve auto-generated keys.
     */
    @stub
    def prepareStatement(sql: String, autoGeneratedKeys: Int): PreparedStatement = ???

    /** Creates a default PreparedStatement object capable
     *  of returning the auto-generated keys designated by the given array.
     */
    @stub
    def prepareStatement(sql: String, columnIndexes: Array[Int]): PreparedStatement = ???

    /** Creates a PreparedStatement object that will generate
     *  ResultSet objects with the given type and concurrency.
     */
    @stub
    def prepareStatement(sql: String, resultSetType: Int, resultSetConcurrency: Int): PreparedStatement = ???

    /** Creates a PreparedStatement object that will generate
     *  ResultSet objects with the given type, concurrency,
     *  and holdability.
     */
    @stub
    def prepareStatement(sql: String, resultSetType: Int, resultSetConcurrency: Int, resultSetHoldability: Int): PreparedStatement = ???

    /** Creates a default PreparedStatement object capable
     *  of returning the auto-generated keys designated by the given array.
     */
    @stub
    def prepareStatement(sql: String, columnNames: Array[String]): PreparedStatement = ???

    /** Removes the specified Savepoint  and subsequent Savepoint objects from the current
     *  transaction.
     */
    @stub
    def releaseSavepoint(savepoint: Savepoint): Unit = ???

    /** Undoes all changes made in the current transaction
     *  and releases any database locks currently held
     *  by this Connection object.
     */
    @stub
    def rollback(): Unit = ???

    /** Undoes all changes made after the given Savepoint object
     *  was set.
     */
    @stub
    def rollback(savepoint: Savepoint): Unit = ???

    /** Sets this connection's auto-commit mode to the given state. */
    @stub
    def setAutoCommit(autoCommit: Boolean): Unit = ???

    /** Sets the given catalog name in order to select
     *  a subspace of this Connection object's database
     *  in which to work.
     */
    @stub
    def setCatalog(catalog: String): Unit = ???

    /** Sets the value of the connection's client info properties. */
    @stub
    def setClientInfo(properties: Properties): Unit = ???

    /** Sets the value of the client info property specified by name to the
     *  value specified by value.
     */
    @stub
    def setClientInfo(name: String, value: String): Unit = ???

    /** Changes the default holdability of ResultSet objects
     *  created using this Connection object to the given
     *  holdability.
     */
    @stub
    def setHoldability(holdability: Int): Unit = ???

    /** Sets the maximum period a Connection or
     *  objects created from the Connection
     *  will wait for the database to reply to any one request.
     */
    @stub
    def setNetworkTimeout(executor: Executor, milliseconds: Int): Unit = ???

    /** Puts this connection in read-only mode as a hint to the driver to enable
     *  database optimizations.
     */
    @stub
    def setReadOnly(readOnly: Boolean): Unit = ???

    /** Creates an unnamed savepoint in the current transaction and
     *  returns the new Savepoint object that represents it.
     */
    @stub
    def setSavepoint(): Savepoint = ???

    /** Creates a savepoint with the given name in the current transaction
     *  and returns the new Savepoint object that represents it.
     */
    @stub
    def setSavepoint(name: String): Savepoint = ???

    /** Sets the given schema name to access. */
    @stub
    def setSchema(schema: String): Unit = ???

    /** Attempts to change the transaction isolation level for this
     *  Connection object to the one given.
     */
    @stub
    def setTransactionIsolation(level: Int): Unit = ???
}

object Connection {
    /** A constant indicating that transactions are not supported. */
    @stub
    val TRANSACTION_NONE: Int = ???

    /** A constant indicating that
     *  dirty reads are prevented; non-repeatable reads and phantom
     *  reads can occur.
     */
    @stub
    val TRANSACTION_READ_COMMITTED: Int = ???

    /** A constant indicating that
     *  dirty reads, non-repeatable reads and phantom reads can occur.
     */
    @stub
    val TRANSACTION_READ_UNCOMMITTED: Int = ???

    /** A constant indicating that
     *  dirty reads and non-repeatable reads are prevented; phantom
     *  reads can occur.
     */
    @stub
    val TRANSACTION_REPEATABLE_READ: Int = ???
}
