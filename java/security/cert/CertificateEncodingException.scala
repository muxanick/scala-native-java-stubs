package java.security.cert

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import scala.scalanative.annotation.stub

/** Certificate Encoding Exception. This is thrown whenever an error
 *  occurs while attempting to encode a certificate.
 */
class CertificateEncodingException extends CertificateException {

    /** Constructs a CertificateEncodingException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a CertificateEncodingException with the specified detail
     *  message.
     */
    @stub
    def this(message: String) = ???

    /** Creates a CertificateEncodingException with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Creates a CertificateEncodingException
     *  with the specified cause and a detail message of
     *  (cause==null ? null : cause.toString())
     *  (which typically contains the class and detail message of
     *  cause).
     */
    @stub
    def this(cause: Throwable) = ???
}
