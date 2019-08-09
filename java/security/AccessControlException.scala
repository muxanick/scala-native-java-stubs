package java.security

import java.lang.{Exception, Object, RuntimeException, SecurityException, String, Throwable}
import scala.scalanative.annotation.stub

/**  This exception is thrown by the AccessController to indicate
 *  that a requested access (to a critical system resource such as the
 *  file system or the network) is denied.
 * 
 *   The reason to deny access can vary.  For example, the requested
 *  permission might be of an incorrect type,  contain an invalid
 *  value, or request access that is not allowed according to the
 *  security policy.  Such information should be given whenever
 *  possible at the time the exception is thrown.
 */
class AccessControlException extends SecurityException {

    /** Constructs an AccessControlException with the
     *  specified, detailed message.
     */
    @stub
    def this(s: String) = ???

    /** Constructs an AccessControlException with the
     *  specified, detailed message, and the requested permission that caused
     *  the exception.
     */
    @stub
    def this(s: String, p: Permission) = ???

    /** Gets the Permission object associated with this exception, or
     *  null if there was no corresponding Permission object.
     */
    @stub
    def getPermission(): Permission = ???
}
