package javax.security.cert

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Certificate Expired Exception. This is thrown whenever the current
 *  Date or the specified Date is after the
 *  notAfter date/time specified in the validity period
 *  of the certificate.
 * 
 *  Note: The classes in the package javax.security.cert
 *  exist for compatibility with earlier versions of the
 *  Java Secure Sockets Extension (JSSE). New applications should instead
 *  use the standard Java SE certificate classes located in
 *  java.security.cert.
 */
class CertificateExpiredException extends CertificateException {

    /** Constructs a CertificateExpiredException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a CertificateExpiredException with the specified detail
     *  message.
     */
    @stub
    def this(message: String) = ???
}
