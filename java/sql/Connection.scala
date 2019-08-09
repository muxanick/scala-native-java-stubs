package java.sql

import java.lang.{AutoCloseable, Class, Object, String}
import java.util.{Map, Properties}
import java.util.concurrent.Executor

// A connection (session) with a specific
// database. SQL statements are executed and results are returned
// within the context of a connection.
// 
// A Connection object's database is able to provide information
// describing its tables, its supported SQL grammar, its stored
// procedures, the capabilities of this connection, and so on. This
// information is obtained with the getMetaData method.
//
// Note: When configuring a Connection, JDBC applications
//  should use the appropriate Connection method such as
//  setAutoCommit or setTransactionIsolation.
//  Applications should not invoke SQL commands directly to change the connection's
//   configuration when there is a JDBC method available.  By default a Connection object is in
// auto-commit mode, which means that it automatically commits changes
// after executing each statement. If auto-commit mode has been
// disabled, the method commit must be called explicitly in
// order to commit changes; otherwise, database changes will not be saved.
// 
// A new Connection object created using the JDBC 2.1 core API
// has an initially empty type map associated with it. A user may enter a
// custom mapping for a UDT in this type map.
// When a UDT is retrieved from a data source with the
// method ResultSet.getObject, the getObject method
// will check the connection's type map to see if there is an entry for that
// UDT.  If so, the getObject method will map the UDT to the
// class indicated.  If there is no entry, the UDT will be mapped using the
// standard mapping.
// 
// A user may create a new type map, which is a java.util.Map
// object, make an entry in it, and pass it to the java.sql
// methods that can perform custom mapping.  In this case, the method
// will use the given type map instead of the one associated with
// the connection.
// 
// For example, the following code fragment specifies that the SQL
// type ATHLETES will be mapped to the class
// Athletes in the Java programming language.
// The code fragment retrieves the type map for the Connection
//  object con, inserts the entry into it, and then sets
// the type map with the new entry as the connection's type map.
// 
//      java.util.Map map = con.getTypeMap();
//      map.put("mySchemaName.ATHLETES", Class.forName("Athletes"));
//      con.setTypeMap(map);
// 
trait Connection extends Wrapper , AutoCloseable {

    @stub
    // Terminates an open connection.
    def abort(executor: Executor): Unit = ???

    @stub
    // Clears all warnings reported for this Connection object.
    def clearWarnings(): Unit = ???

    @stub
    // Releases this Connection object's database and JDBC resources
    // immediately instead of waiting for them to be automatically released.
    def close(): Unit = ???

    @stub
    // Makes all changes made since the previous
    // commit/rollback permanent and releases any database locks
    // currently held by this Connection object.
    def commit(): Unit = ???

    @stub
    // Factory method for creating Array objects.
    def createArrayOf(typeName: String, elements: Array[Object]): Array = ???

    @stub
    // Constructs an object that implements the Blob interface.
    def createBlob(): Blob = ???

    @stub
    // Constructs an object that implements the Clob interface.
    def createClob(): Clob = ???

    @stub
    // Constructs an object that implements the NClob interface.
    def createNClob(): NClob = ???

    @stub
    // Constructs an object that implements the SQLXML interface.
    def createSQLXML(): SQLXML = ???

    @stub
    // Creates a Statement object for sending
    // SQL statements to the database.
    def createStatement(): Statement = ???

    @stub
    // Creates a Statement object that will generate
    // ResultSet objects with the given type and concurrency.
    def createStatement(resultSetType: Int, resultSetConcurrency: Int): Statement = ???

    @stub
    // Creates a Statement object that will generate
    // ResultSet objects with the given type, concurrency,
    // and holdability.
    def createStatement(resultSetType: Int, resultSetConcurrency: Int, resultSetHoldability: Int): Statement = ???

    @stub
    // Factory method for creating Struct objects.
    def createStruct(typeName: String, attributes: Array[Object]): Struct = ???

    @stub
    // Retrieves the current auto-commit mode for this Connection
    // object.
    def getAutoCommit(): Boolean = ???

    @stub
    // Retrieves this Connection object's current catalog name.
    def getCatalog(): String = ???

    @stub
    // Returns a list containing the name and current value of each client info
    // property supported by the driver.
    def getClientInfo(): Properties = ???

    @stub
    // Returns the value of the client info property specified by name.
    def getClientInfo(name: String): String = ???

    @stub
    // Retrieves the current holdability of ResultSet objects
    // created using this Connection object.
    def getHoldability(): Int = ???

    @stub
    // Retrieves a DatabaseMetaData object that contains
    // metadata about the database to which this
    // Connection object represents a connection.
    def getMetaData(): DatabaseMetaData = ???

    @stub
    // Retrieves the number of milliseconds the driver will
    // wait for a database request to complete.
    def getNetworkTimeout(): Int = ???

    @stub
    // Retrieves this Connection object's current schema name.
    def getSchema(): String = ???

    @stub
    // Retrieves this Connection object's current
    // transaction isolation level.
    def getTransactionIsolation(): Int = ???

    @stub
    // Retrieves the Map object associated with this
    // Connection object.
    def getTypeMap(): Map[String, Class[_]] = ???

    @stub
    // Retrieves the first warning reported by calls on this
    // Connection object.
    def getWarnings(): SQLWarning = ???

    @stub
    // Retrieves whether this Connection object has been
    // closed.
    def isClosed(): Boolean = ???

    @stub
    // Retrieves whether this Connection
    // object is in read-only mode.
    def isReadOnly(): Boolean = ???

    @stub
    // Returns true if the connection has not been closed and is still valid.
    def isValid(timeout: Int): Boolean = ???

    @stub
    // Converts the given SQL statement into the system's native SQL grammar.
    def nativeSQL(sql: String): String = ???

    @stub
    // Creates a CallableStatement object for calling
    // database stored procedures.
    def prepareCall(sql: String): CallableStatement = ???

    @stub
    // Creates a CallableStatement object that will generate
    // ResultSet objects with the given type and concurrency.
    def prepareCall(sql: String, resultSetType: Int, resultSetConcurrency: Int): CallableStatement = ???

    @stub
    // Creates a CallableStatement object that will generate
    // ResultSet objects with the given type and concurrency.
    def prepareCall(sql: String, resultSetType: Int, resultSetConcurrency: Int, resultSetHoldability: Int): CallableStatement = ???

    @stub
    // Creates a PreparedStatement object for sending
    // parameterized SQL statements to the database.
    def prepareStatement(sql: String): PreparedStatement = ???

    @stub
    // Creates a default PreparedStatement object that has
    // the capability to retrieve auto-generated keys.
    def prepareStatement(sql: String, autoGeneratedKeys: Int): PreparedStatement = ???

    @stub
    // Creates a default PreparedStatement object capable
    // of returning the auto-generated keys designated by the given array.
    def prepareStatement(sql: String, columnIndexes: Array[Int]): PreparedStatement = ???

    @stub
    // Creates a PreparedStatement object that will generate
    // ResultSet objects with the given type and concurrency.
    def prepareStatement(sql: String, resultSetType: Int, resultSetConcurrency: Int): PreparedStatement = ???

    @stub
    // Creates a PreparedStatement object that will generate
    // ResultSet objects with the given type, concurrency,
    // and holdability.
    def prepareStatement(sql: String, resultSetType: Int, resultSetConcurrency: Int, resultSetHoldability: Int): PreparedStatement = ???

    @stub
    // Creates a default PreparedStatement object capable
    // of returning the auto-generated keys designated by the given array.
    def prepareStatement(sql: String, columnNames: Array[String]): PreparedStatement = ???

    @stub
    // Removes the specified Savepoint  and subsequent Savepoint objects from the current
    // transaction.
    def releaseSavepoint(savepoint: Savepoint): Unit = ???

    @stub
    // Undoes all changes made in the current transaction
    // and releases any database locks currently held
    // by this Connection object.
    def rollback(): Unit = ???

    @stub
    // Undoes all changes made after the given Savepoint object
    // was set.
    def rollback(savepoint: Savepoint): Unit = ???

    @stub
    // Sets this connection's auto-commit mode to the given state.
    def setAutoCommit(autoCommit: Boolean): Unit = ???

    @stub
    // Sets the given catalog name in order to select
    // a subspace of this Connection object's database
    // in which to work.
    def setCatalog(catalog: String): Unit = ???

    @stub
    // Sets the value of the connection's client info properties.
    def setClientInfo(properties: Properties): Unit = ???

    @stub
    // Sets the value of the client info property specified by name to the
    // value specified by value.
    def setClientInfo(name: String, value: String): Unit = ???

    @stub
    // Changes the default holdability of ResultSet objects
    // created using this Connection object to the given
    // holdability.
    def setHoldability(holdability: Int): Unit = ???

    @stub
    // Sets the maximum period a Connection or
    // objects created from the Connection
    // will wait for the database to reply to any one request.
    def setNetworkTimeout(executor: Executor, milliseconds: Int): Unit = ???

    @stub
    // Puts this connection in read-only mode as a hint to the driver to enable
    // database optimizations.
    def setReadOnly(readOnly: Boolean): Unit = ???

    @stub
    // Creates an unnamed savepoint in the current transaction and
    // returns the new Savepoint object that represents it.
    def setSavepoint(): Savepoint = ???

    @stub
    // Creates a savepoint with the given name in the current transaction
    // and returns the new Savepoint object that represents it.
    def setSavepoint(name: String): Savepoint = ???

    @stub
    // Sets the given schema name to access.
    def setSchema(schema: String): Unit = ???

    @stub
    // Attempts to change the transaction isolation level for this
    // Connection object to the one given.
    def setTransactionIsolation(level: Int): Unit = ???
}

object Connection {
    @stub
    // A constant indicating that transactions are not supported.
    def TRANSACTION_NONE: Int = ???

    @stub
    // A constant indicating that
    // dirty reads are prevented; non-repeatable reads and phantom
    // reads can occur.
    def TRANSACTION_READ_COMMITTED: Int = ???

    @stub
    // A constant indicating that
    // dirty reads, non-repeatable reads and phantom reads can occur.
    def TRANSACTION_READ_UNCOMMITTED: Int = ???

    @stub
    // A constant indicating that
    // dirty reads and non-repeatable reads are prevented; phantom
    // reads can occur.
    def TRANSACTION_REPEATABLE_READ: Int = ???
}
