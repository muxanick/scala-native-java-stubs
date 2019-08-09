package javax.sql

import java.io.PrintWriter
import java.util.logging.Logger
import scala.scalanative.annotation.stub

/** Interface that defines the methods which are common between DataSource,
 *  XADataSource and ConnectionPoolDataSource.
 */
trait CommonDataSource {

    /** Gets the maximum time in seconds that this data source can wait
     *  while attempting to connect to a database.
     */
    @stub
    def getLoginTimeout(): Int = ???

    /** Retrieves the log writer for this DataSource
     *  object.
     */
    @stub
    def getLogWriter(): PrintWriter = ???

    /** Return the parent Logger of all the Loggers used by this data source. */
    @stub
    def getParentLogger(): Logger = ???

    /** Sets the maximum time in seconds that this data source will wait
     *  while attempting to connect to a database.
     */
    @stub
    def setLoginTimeout(seconds: Int): Unit = ???

    /** Sets the log writer for this DataSource
     *  object to the given java.io.PrintWriter object.
     */
    @stub
    def setLogWriter(out: PrintWriter): Unit = ???
}
