package java.security.cert

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException

/** CRL (Certificate Revocation List) Exception. */
class CRLException extends GeneralSecurityException {

    /** Constructs a CRLException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a CRLException with the specified detail
     *  message.
     */
    @stub
    def this(message: String) = ???

    /** Creates a CRLException with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???
}
