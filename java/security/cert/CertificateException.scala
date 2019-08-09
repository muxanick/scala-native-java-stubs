package java.security.cert

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException

// This exception indicates one of a variety of certificate problems.
class CertificateException extends GeneralSecurityException {

    @stub
    // Constructs a certificate exception with no detail message.
    def this() = ???

    @stub
    // Constructs a certificate exception with the given detail
    // message.
    def this(msg: String) = ???

    @stub
    // Creates a CertificateException with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
