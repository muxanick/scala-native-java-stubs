package javax.security.sasl

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

/** This exception is thrown by a SASL mechanism implementation
 *  to indicate that the SASL
 *  exchange has failed due to reasons related to authentication, such as
 *  an invalid identity, passphrase, or key.
 *  
 *  Note that the lack of an AuthenticationException does not mean that
 *  the failure was not due to an authentication error.  A SASL mechanism
 *  implementation might throw the more general SaslException instead of
 *  AuthenticationException if it is unable to determine the nature
 *  of the failure, or if does not want to disclose the nature of
 *  the failure, for example, due to security reasons.
 */
class AuthenticationException extends SaslException {

    /** Constructs a new instance of AuthenticationException. */
    @stub
    def this() = ???

    /** Constructs a new instance of AuthenticationException
     *  with a detailed message.
     */
    @stub
    def this(detail: String) = ???
}
