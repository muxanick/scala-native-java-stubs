package java.sql

import java.lang.String
import java.util.Properties
import java.util.logging.Logger

/** The interface that every driver class must implement.
 *  The Java SQL framework allows for multiple database drivers.
 * 
 *  Each driver should supply a class that implements
 *  the Driver interface.
 * 
 *  The DriverManager will try to load as many drivers as it can
 *  find and then for any given connection request, it will ask each
 *  driver in turn to try to connect to the target URL.
 * 
 *  It is strongly recommended that each Driver class should be
 *  small and standalone so that the Driver class can be loaded and
 *  queried without bringing in vast quantities of supporting code.
 * 
 *  When a Driver class is loaded, it should create an instance of
 *  itself and register it with the DriverManager. This means that a
 *  user can load and register a driver by calling:
 *  
 *  Class.forName("foo.bah.Driver")
 *  
 *  A JDBC driver may create a DriverAction implementation in order
 *  to receive notifications when DriverManager.deregisterDriver(java.sql.Driver) has
 *  been called.
 */
trait Driver {

    /** Retrieves whether the driver thinks that it can open a connection
     *  to the given URL.
     */
    @stub
    def acceptsURL(url: String): Boolean = ???

    /** Attempts to make a database connection to the given URL. */
    @stub
    def connect(url: String, info: Properties): Connection = ???

    /** Retrieves the driver's major version number. */
    @stub
    def getMajorVersion(): Int = ???

    /** Gets the driver's minor version number. */
    @stub
    def getMinorVersion(): Int = ???

    /** Return the parent Logger of all the Loggers used by this driver. */
    @stub
    def getParentLogger(): Logger = ???

    /** Gets information about the possible properties for this driver. */
    @stub
    def getPropertyInfo(url: String, info: Properties): Array[DriverPropertyInfo] = ???
}
