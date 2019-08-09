package javax.sql

import java.io.PrintWriter
import java.util.logging.Logger

// Interface that defines the methods which are common between DataSource,
// XADataSource and ConnectionPoolDataSource.
trait CommonDataSource {

    @stub
    // Gets the maximum time in seconds that this data source can wait
    // while attempting to connect to a database.
    def getLoginTimeout(): Int = ???

    @stub
    // Retrieves the log writer for this DataSource
    // object.
    def getLogWriter(): PrintWriter = ???

    @stub
    // Return the parent Logger of all the Loggers used by this data source.
    def getParentLogger(): Logger = ???

    @stub
    // Sets the maximum time in seconds that this data source will wait
    // while attempting to connect to a database.
    def setLoginTimeout(seconds: Int): Unit = ???
}
