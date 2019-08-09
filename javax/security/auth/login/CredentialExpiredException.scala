package javax.security.auth.login

import java.lang.{Exception, Object, Throwable}
import java.security.GeneralSecurityException

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
}
