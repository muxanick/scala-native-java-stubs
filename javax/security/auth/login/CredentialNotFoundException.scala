package javax.security.auth.login

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import scala.scalanative.annotation.stub

/** Signals that a credential was not found.
 * 
 *   This exception may be thrown by a LoginModule if it is unable
 *  to locate a credential necessary to perform authentication.
 */
class CredentialNotFoundException extends CredentialException {

    /** Constructs a CredentialNotFoundException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a CredentialNotFoundException with the specified
     *  detail message.
     */
    @stub
    def this(msg: String) = ???
}
