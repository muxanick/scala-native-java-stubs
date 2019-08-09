package java.sql

import scala.scalanative.annotation.stub

/** An interface that must be implemented when a Driver wants to be
 *  notified by DriverManager.
 * 
 *  A DriverAction implementation is not intended to be used
 *  directly by applications. A JDBC Driver  may choose
 *  to create its DriverAction implementation in a private class
 *  to avoid it being called directly.
 *  
 *  The JDBC driver's static initialization block must call
 *  DriverManager.registerDriver(java.sql.Driver, java.sql.DriverAction) in order
 *  to inform DriverManager which DriverAction implementation to
 *  call when the JDBC driver is de-registered.
 */
trait DriverAction {

    /** Method called by
     *  DriverManager.deregisterDriver(Driver)
     *   to notify the JDBC driver that it was de-registered.
     */
    @stub
    def deregister(): Unit = ???
}
