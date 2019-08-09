package javax.security.auth.login

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import scala.scalanative.annotation.stub

/** Signals that user authentication failed.
 * 
 *   This exception is thrown by LoginModules if authentication failed.
 *  For example, a LoginModule throws this exception if
 *  the user entered an incorrect password.
 */
class FailedLoginException extends LoginException {

    /** Constructs a FailedLoginException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a FailedLoginException with the specified detail
     *  message.
     */
    @stub
    def this(msg: String) = ???
}
