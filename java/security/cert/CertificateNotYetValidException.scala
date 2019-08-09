package java.security.cert

import java.lang.{Exception, Object, Throwable}
import java.security.GeneralSecurityException

/** Certificate is not yet valid exception. This is thrown whenever
 *  the current Date or the specified Date
 *  is before the notBefore date/time in the Certificate
 *  validity period.
 */
class CertificateNotYetValidException extends CertificateException {

    /** Constructs a CertificateNotYetValidException with no detail message. */
    @stub
    def this() = ???
}
