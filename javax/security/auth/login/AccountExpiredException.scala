package javax.security.auth.login

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import scala.scalanative.annotation.stub

/** Signals that a user account has expired.
 * 
 *   This exception is thrown by LoginModules when they determine
 *  that an account has expired.  For example, a LoginModule,
 *  after successfully authenticating a user, may determine that the
 *  user's account has expired.  In this case the LoginModule
 *  throws this exception to notify the application.  The application can
 *  then take the appropriate steps to notify the user.
 */
class AccountExpiredException extends AccountException {

    /** Constructs a AccountExpiredException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a AccountExpiredException with the specified detail
     *  message.
     */
    @stub
    def this(msg: String) = ???
}
