package java.security.cert

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import scala.scalanative.annotation.stub

/** Certificate is not yet valid exception. This is thrown whenever
 *  the current Date or the specified Date
 *  is before the notBefore date/time in the Certificate
 *  validity period.
 */
class CertificateNotYetValidException extends CertificateException {

    /** Constructs a CertificateNotYetValidException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a CertificateNotYetValidException with the specified detail
     *  message.
     */
    @stub
    def this(message: String) = ???
}
