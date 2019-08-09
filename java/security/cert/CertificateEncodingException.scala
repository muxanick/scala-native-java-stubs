package java.security.cert

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException

// Certificate Encoding Exception. This is thrown whenever an error
// occurs while attempting to encode a certificate.
class CertificateEncodingException extends CertificateException {

    @stub
    // Constructs a CertificateEncodingException with no detail message.
    def this() = ???

    @stub
    // Constructs a CertificateEncodingException with the specified detail
    // message.
    def this(message: String) = ???

    @stub
    // Creates a CertificateEncodingException with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
