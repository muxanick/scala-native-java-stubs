package javax.security.auth.login

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import scala.scalanative.annotation.stub

/** Signals that a Credential has expired.
 * 
 *   This exception is thrown by LoginModules when they determine
 *  that a Credential has expired.
 *  For example, a LoginModule authenticating a user
 *  in its login method may determine that the user's
 *  password, although entered correctly, has expired.  In this case
 *  the LoginModule throws this exception to notify
 *  the application.  The application can then take the appropriate
 *  steps to assist the user in updating the password.
 */
class CredentialExpiredException extends CredentialException {

    /** Constructs a CredentialExpiredException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a CredentialExpiredException with the specified detail
     *  message.
     */
    @stub
    def this(msg: String) = ???
}
