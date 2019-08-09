package java.security.cert

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException

// CRL (Certificate Revocation List) Exception.
class CRLException extends GeneralSecurityException {

    @stub
    // Constructs a CRLException with no detail message.
    def this() = ???

    @stub
    // Constructs a CRLException with the specified detail
    // message.
    def this(message: String) = ???

    @stub
    // Creates a CRLException with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
