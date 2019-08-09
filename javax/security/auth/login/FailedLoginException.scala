package javax.security.auth.login

import java.lang.{Exception, Object, Throwable}
import java.security.GeneralSecurityException

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
}
