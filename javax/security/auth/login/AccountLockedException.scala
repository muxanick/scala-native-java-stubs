package javax.security.auth.login

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import scala.scalanative.annotation.stub

/** Signals that an account was locked.
 * 
 *   This exception may be thrown by a LoginModule if it
 *  determines that authentication is being attempted on a
 *  locked account.
 */
class AccountLockedException extends AccountException {

    /** Constructs a AccountLockedException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a AccountLockedException with the specified
     *  detail message.
     */
    @stub
    def this(msg: String) = ???
}
