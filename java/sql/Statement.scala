package java.sql

import java.lang.{AutoCloseable, String}

/** The object used for executing a static SQL statement
 *  and returning the results it produces.
 *  
 *  By default, only one ResultSet object per Statement
 *  object can be open at the same time. Therefore, if the reading of one
 *  ResultSet object is interleaved
 *  with the reading of another, each must have been generated by
 *  different Statement objects. All execution methods in the
 *  Statement interface implicitly close a current
 *  ResultSet object of the statement if an open one exists.
 */
trait Statement extends Wrapper with AutoCloseable {

    /** Adds the given SQL command to the current list of commands for this
     *  Statement object.
     */
    @stub
    def addBatch(sql: String): Unit = ???

    /** Cancels this Statement object if both the DBMS and
     *  driver support aborting an SQL statement.
     */
    @stub
    def cancel(): Unit = ???

    /** Empties this Statement object's current list of
     *  SQL commands.
     */
    @stub
    def clearBatch(): Unit = ???

    /** Clears all the warnings reported on this Statement
     *  object.
     */
    @stub
    def clearWarnings(): Unit = ???

    /** Releases this Statement object's database
     *  and JDBC resources immediately instead of waiting for
     *  this to happen when it is automatically closed.
     */
    @stub
    def close(): Unit = ???

    /** Specifies that this Statement will be closed when all its
     *  dependent result sets are closed.
     */
    @stub
    def closeOnCompletion(): Unit = ???

    /** Executes the given SQL statement, which may return multiple results. */
    @stub
    def execute(sql: String): Boolean = ???

    /** Executes the given SQL statement, which may return multiple results,
     *  and signals the driver that any
     *  auto-generated keys should be made available
     *  for retrieval.
     */
    @stub
    def execute(sql: String, autoGeneratedKeys: Int): Boolean = ???

    /** Executes the given SQL statement, which may return multiple results,
     *  and signals the driver that the
     *  auto-generated keys indicated in the given array should be made available
     *  for retrieval.
     */
    @stub
    def execute(sql: String, columnIndexes: Array[Int]): Boolean = ???

    /** Executes the given SQL statement, which may return multiple results,
     *  and signals the driver that the
     *  auto-generated keys indicated in the given array should be made available
     *  for retrieval.
     */
    @stub
    def execute(sql: String, columnNames: Array[String]): Boolean = ???

    /** Submits a batch of commands to the database for execution and
     *  if all commands execute successfully, returns an array of update counts.
     */
    @stub
    def executeBatch(): Array[Int] = ???

    /** Submits a batch of commands to the database for execution and
     *  if all commands execute successfully, returns an array of update counts.
     */
    @stub
    val Array[Long]: default = ???

    /** Executes the given SQL statement, which may be an INSERT,
     *  UPDATE, or DELETE statement or an
     *  SQL statement that returns nothing, such as an SQL DDL statement.
     */
    @stub
    val Long: default = ???

    /** Executes the given SQL statement and signals the driver with the
     *  given flag about whether the
     *  auto-generated keys produced by this Statement object
     *  should be made available for retrieval.
     */
    @stub
    val Long: default = ???

    /** Executes the given SQL statement and signals the driver that the
     *  auto-generated keys indicated in the given array should be made available
     *  for retrieval.
     */
    @stub
    val Long: default = ???

    /** Executes the given SQL statement and signals the driver that the
     *  auto-generated keys indicated in the given array should be made available
     *  for retrieval.
     */
    @stub
    val Long: default = ???

    /** Executes the given SQL statement, which returns a single
     *  ResultSet object.
     */
    @stub
    def executeQuery(sql: String): ResultSet = ???

    /** Executes the given SQL statement, which may be an INSERT,
     *  UPDATE, or DELETE statement or an
     *  SQL statement that returns nothing, such as an SQL DDL statement.
     */
    @stub
    def executeUpdate(sql: String): Int = ???

    /** Executes the given SQL statement and signals the driver with the
     *  given flag about whether the
     *  auto-generated keys produced by this Statement object
     *  should be made available for retrieval.
     */
    @stub
    def executeUpdate(sql: String, autoGeneratedKeys: Int): Int = ???

    /** Executes the given SQL statement and signals the driver that the
     *  auto-generated keys indicated in the given array should be made available
     *  for retrieval.
     */
    @stub
    def executeUpdate(sql: String, columnIndexes: Array[Int]): Int = ???

    /** Executes the given SQL statement and signals the driver that the
     *  auto-generated keys indicated in the given array should be made available
     *  for retrieval.
     */
    @stub
    def executeUpdate(sql: String, columnNames: Array[String]): Int = ???

    /** Retrieves the Connection object
     *  that produced this Statement object.
     */
    @stub
    def getConnection(): Connection = ???

    /** Retrieves the direction for fetching rows from
     *  database tables that is the default for result sets
     *  generated from this Statement object.
     */
    @stub
    def getFetchDirection(): Int = ???

    /** Retrieves the number of result set rows that is the default
     *  fetch size for ResultSet objects
     *  generated from this Statement object.
     */
    @stub
    def getFetchSize(): Int = ???

    /** Retrieves any auto-generated keys created as a result of executing this
     *  Statement object.
     */
    @stub
    def getGeneratedKeys(): ResultSet = ???

    /** Retrieves the maximum number of rows that a
     *  ResultSet object produced by this
     *  Statement object can contain.
     */
    @stub
    val Long: default = ???

    /** Retrieves the current result as an update count; if the result
     *  is a ResultSet object or there are no more results, -1
     *   is returned.
     */
    @stub
    val Long: default = ???

    /** Retrieves the maximum number of bytes that can be
     *  returned for character and binary column values in a ResultSet
     *  object produced by this Statement object.
     */
    @stub
    def getMaxFieldSize(): Int = ???

    /** Retrieves the maximum number of rows that a
     *  ResultSet object produced by this
     *  Statement object can contain.
     */
    @stub
    def getMaxRows(): Int = ???

    /** Moves to this Statement object's next result, returns
     *  true if it is a ResultSet object, and
     *  implicitly closes any current ResultSet
     *  object(s) obtained with the method getResultSet.
     */
    @stub
    def getMoreResults(): Boolean = ???

    /** Moves to this Statement object's next result, deals with
     *  any current ResultSet object(s) according  to the instructions
     *  specified by the given flag, and returns
     *  true if the next result is a ResultSet object.
     */
    @stub
    def getMoreResults(current: Int): Boolean = ???

    /** Retrieves the number of seconds the driver will
     *  wait for a Statement object to execute.
     */
    @stub
    def getQueryTimeout(): Int = ???

    /** Retrieves the current result as a ResultSet object. */
    @stub
    def getResultSet(): ResultSet = ???

    /** Retrieves the result set concurrency for ResultSet objects
     *  generated by this Statement object.
     */
    @stub
    def getResultSetConcurrency(): Int = ???

    /** Retrieves the result set holdability for ResultSet objects
     *  generated by this Statement object.
     */
    @stub
    def getResultSetHoldability(): Int = ???

    /** Retrieves the result set type for ResultSet objects
     *  generated by this Statement object.
     */
    @stub
    def getResultSetType(): Int = ???

    /** Retrieves the current result as an update count;
     *   if the result is a ResultSet object or there are no more results, -1
     *   is returned.
     */
    @stub
    def getUpdateCount(): Int = ???

    /** Retrieves the first warning reported by calls on this Statement object. */
    @stub
    def getWarnings(): SQLWarning = ???

    /** Retrieves whether this Statement object has been closed. */
    @stub
    def isClosed(): Boolean = ???

    /** Returns a value indicating whether this Statement will be
     *  closed when all its dependent result sets are closed.
     */
    @stub
    def isCloseOnCompletion(): Boolean = ???

    /** Returns a  value indicating whether the Statement
     *  is poolable or not.
     */
    @stub
    def isPoolable(): Boolean = ???

    /** Sets the SQL cursor name to the given String, which
     *  will be used by subsequent Statement object
     *  execute methods.
     */
    @stub
    def setCursorName(name: String): Unit = ???

    /** Sets escape processing on or off. */
    @stub
    def setEscapeProcessing(enable: Boolean): Unit = ???

    /** Gives the driver a hint as to the direction in which
     *  rows will be processed in ResultSet
     *  objects created using this Statement object.
     */
    @stub
    def setFetchDirection(direction: Int): Unit = ???

    /** Gives the JDBC driver a hint as to the number of rows that should
     *  be fetched from the database when more rows are needed for
     *  ResultSet objects generated by this Statement.
     */
    @stub
    def setFetchSize(rows: Int): Unit = ???

    /** Sets the limit for the maximum number of rows that any
     *  ResultSet object  generated by this Statement
     *  object can contain to the given number.
     */
    @stub
    val Unit: default = ???

    /** Sets the limit for the maximum number of bytes that can be returned for
     *  character and binary column values in a ResultSet
     *  object produced by this Statement object.
     */
    @stub
    def setMaxFieldSize(max: Int): Unit = ???

    /** Sets the limit for the maximum number of rows that any
     *  ResultSet object  generated by this Statement
     *  object can contain to the given number.
     */
    @stub
    def setMaxRows(max: Int): Unit = ???

    /** Requests that a Statement be pooled or not pooled. */
    @stub
    def setPoolable(poolable: Boolean): Unit = ???
}

object Statement {
    /** The constant indicating that all ResultSet objects that
     *  have previously been kept open should be closed when calling
     *  getMoreResults.
     */
    @stub
    val CLOSE_ALL_RESULTS: Int = ???

    /** The constant indicating that the current ResultSet object
     *  should be closed when calling getMoreResults.
     */
    @stub
    val CLOSE_CURRENT_RESULT: Int = ???

    /** The constant indicating that an error occurred while executing a
     *  batch statement.
     */
    @stub
    val EXECUTE_FAILED: Int = ???

    /** The constant indicating that the current ResultSet object
     *  should not be closed when calling getMoreResults.
     */
    @stub
    val KEEP_CURRENT_RESULT: Int = ???

    /** The constant indicating that generated keys should not be made
     *  available for retrieval.
     */
    @stub
    val NO_GENERATED_KEYS: Int = ???

    /** The constant indicating that generated keys should be made
     *  available for retrieval.
     */
    @stub
    val RETURN_GENERATED_KEYS: Int = ???
}
