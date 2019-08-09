package java.security.cert

import java.lang.{Exception, Object, Throwable}
import java.security.GeneralSecurityException

/** Certificate Expired Exception. This is thrown whenever the current
 *  Date or the specified Date is after the
 *  notAfter date/time specified in the validity period
 *  of the certificate.
 */
class CertificateExpiredException extends CertificateException {

    /** Constructs a CertificateExpiredException with no detail message. */
    @stub
    def this() = ???
}
