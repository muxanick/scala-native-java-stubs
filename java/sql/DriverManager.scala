package java.sql

import java.io.{PrintStream, PrintWriter}
import java.lang.{Object, String}
import java.util.{Enumeration, Properties}

/** The basic service for managing a set of JDBC drivers.
 *  NOTE: The DataSource interface, new in the
 *  JDBC 2.0 API, provides another way to connect to a data source.
 *  The use of a DataSource object is the preferred means of
 *  connecting to a data source.
 * 
 *  As part of its initialization, the DriverManager class will
 *  attempt to load the driver classes referenced in the "jdbc.drivers"
 *  system property. This allows a user to customize the JDBC Drivers
 *  used by their applications. For example in your
 *  ~/.hotjava/properties file you might specify:
 *  
 *  jdbc.drivers=foo.bah.Driver:wombat.sql.Driver:bad.taste.ourDriver
 *  
 *  The DriverManager methods getConnection and
 *  getDrivers have been enhanced to support the Java Standard Edition
 *  Service Provider mechanism. JDBC 4.0 Drivers must
 *  include the file META-INF/services/java.sql.Driver. This file contains the name of the JDBC drivers
 *  implementation of java.sql.Driver.  For example, to load the my.sql.Driver class,
 *  the META-INF/services/java.sql.Driver file would contain the entry:
 *  
 *  my.sql.Driver
 *  
 * 
 *  Applications no longer need to explicitly load JDBC drivers using Class.forName(). Existing programs
 *  which currently load JDBC drivers using Class.forName() will continue to work without
 *  modification.
 * 
 *  When the method getConnection is called,
 *  the DriverManager will attempt to
 *  locate a suitable driver from amongst those loaded at
 *  initialization and those loaded explicitly using the same classloader
 *  as the current applet or application.
 * 
 *  
 *  Starting with the Java 2 SDK, Standard Edition, version 1.3, a
 *  logging stream can be set only if the proper
 *  permission has been granted.  Normally this will be done with
 *  the tool PolicyTool, which can be used to grant permission
 *  java.sql.SQLPermission "setLog".
 */
class DriverManager extends Object {
}

object DriverManager {
    /** Removes the specified driver from the DriverManager's list of
     *  registered drivers.
     */
    @stub
    def deregisterDriver(driver: Driver): Unit = ???

    /** Attempts to establish a connection to the given database URL. */
    @stub
    def getConnection(url: String): Connection = ???

    /** Attempts to establish a connection to the given database URL. */
    @stub
    def getConnection(url: String, info: Properties): Connection = ???

    /** Attempts to establish a connection to the given database URL. */
    @stub
    def getConnection(url: String, user: String, password: String): Connection = ???

    /** Attempts to locate a driver that understands the given URL. */
    @stub
    def getDriver(url: String): Driver = ???

    /** Retrieves an Enumeration with all of the currently loaded JDBC drivers
     *  to which the current caller has access.
     */
    @stub
    def getDrivers(): Enumeration[Driver] = ???

    /** Gets the maximum time in seconds that a driver can wait
     *  when attempting to log in to a database.
     */
    @stub
    def getLoginTimeout(): Int = ???

    /** Deprecated. 
     * Use getLogWriter
     * 
     */
    @stub
    def getLogStream(): PrintStream = ???

    /** Retrieves the log writer. */
    @stub
    def getLogWriter(): PrintWriter = ???

    /** Prints a message to the current JDBC log stream. */
    @stub
    def println(message: String): Unit = ???

    /** Registers the given driver with the DriverManager. */
    @stub
    def registerDriver(driver: Driver): Unit = ???

    /** Registers the given driver with the DriverManager. */
    @stub
    def registerDriver(driver: Driver, da: DriverAction): Unit = ???

    /** Sets the maximum time in seconds that a driver will wait
     *  while attempting to connect to a database once the driver has
     *  been identified.
     */
    @stub
    def setLoginTimeout(seconds: Int): Unit = ???

    /** Deprecated. 
     * Use setLogWriter
     * 
     */
    @stub
    def setLogStream(out: PrintStream): Unit = ???
}
