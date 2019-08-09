package javax.security.auth.login

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import scala.scalanative.annotation.stub

/** Signals that an account was not found.
 * 
 *   This exception may be thrown by a LoginModule if it is unable
 *  to locate an account necessary to perform authentication.
 */
class AccountNotFoundException extends AccountException {

    /** Constructs a AccountNotFoundException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a AccountNotFoundException with the specified
     *  detail message.
     */
    @stub
    def this(msg: String) = ???
}
