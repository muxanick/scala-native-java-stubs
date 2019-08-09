package java.security.cert

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException

/** Certificate Parsing Exception. This is thrown whenever an
 *  invalid DER-encoded certificate is parsed or unsupported DER features
 *  are found in the Certificate.
 */
class CertificateParsingException extends CertificateException {

    /** Constructs a CertificateParsingException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a CertificateParsingException with the specified detail
     *  message.
     */
    @stub
    def this(message: String) = ???

    /** Creates a CertificateParsingException with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???
}
