package javax.security.auth.login

import java.lang.{Exception, Object, Throwable}
import java.security.GeneralSecurityException

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
}
