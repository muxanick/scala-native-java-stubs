package javax.naming

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown when attempting to perform an operation
 *  for which the client has no permission. The access control/permission
 *  model is dictated by the directory/naming server.
 * 
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class NoPermissionException extends NamingSecurityException {

    /** Constructs a new instance of NoPermissionException. */
    @stub
    def this() = ???

    /** Constructs a new instance of NoPermissionException using an
     *  explanation.
     */
    @stub
    def this(explanation: String) = ???
}
