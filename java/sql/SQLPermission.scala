package java.sql

import java.lang.{Object, String}
import java.security.{BasicPermission, Permission}
import scala.scalanative.annotation.stub

/** The permission for which the SecurityManager will check
 *  when code that is running an application with a
 *  SecurityManager enabled, calls the
 *  DriverManager.deregisterDriver method,
 *  DriverManager.setLogWriter method,
 *  DriverManager.setLogStream (deprecated) method,
 *  SyncFactory.setJNDIContext method,
 *  SyncFactory.setLogger method,
 *  Connection.setNetworktimeout method,
 *  or the Connection.abort method.
 *  If there is no SQLPermission object, these methods
 *  throw a java.lang.SecurityException as a runtime exception.
 *  
 *  A SQLPermission object contains
 *  a name (also referred to as a "target name") but no actions
 *  list; there is either a named permission or there is not.
 *  The target name is the name of the permission (see below). The
 *  naming convention follows the  hierarchical property naming convention.
 *  In addition, an asterisk
 *  may appear at the end of the name, following a ".", or by itself, to
 *  signify a wildcard match. For example: loadLibrary.*
 *  and * signify a wildcard match,
 *  while *loadLibrary and a*b do not.
 *  
 *  The following table lists all the possible SQLPermission target names.
 *  The table gives a description of what the permission allows
 *  and a discussion of the risks of granting code the permission.
 * 
 * 
 *  
 *  
 *  Permission Target Name
 *  What the Permission Allows
 *  Risks of Allowing this Permission
 *  
 * 
 *  
 *    setLog
 *    Setting of the logging stream
 *    This is a dangerous permission to grant.
 *  The contents of the log may contain usernames and passwords,
 *  SQL statements, and SQL data.
 *  
 *  
 *  callAbort
 *    Allows the invocation of the Connection method
 *    abort
 *    Permits an application to terminate a physical connection to a
 *   database.
 *  
 *  
 *  setSyncFactory
 *    Allows the invocation of the SyncFactory methods
 *    setJNDIContext and setLogger
 *    Permits an application to specify the JNDI context from which the
 *    SyncProvider implementations can be retrieved from and the logging
 *    object to be used by the SyncProvider implementation.
 *  
 * 
 *  
 *  setNetworkTimeout
 *    Allows the invocation of the Connection method
 *    setNetworkTimeout
 *    Permits an application to specify the maximum period a
 *  Connection or
 *  objects created from the Connection
 *  will wait for the database to reply to any one request.
 *  
 *  deregisterDriver
 *    Allows the invocation of the DriverManager
 *  method deregisterDriver
 *    Permits an application to remove a JDBC driver from the list of
 *  registered Drivers and release its resources.
 *  
 *  
 * 
 */
final class SQLPermission extends BasicPermission {

    /** Creates a new SQLPermission object with the specified name. */
    @stub
    def this(name: String) = ???

    /** Creates a new SQLPermission object with the specified name. */
    @stub
    def this(name: String, actions: String) = ???
}
