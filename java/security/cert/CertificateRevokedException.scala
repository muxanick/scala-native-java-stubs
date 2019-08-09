package java.security.cert

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import java.util.{Date, Map}
import javax.security.auth.x500.X500Principal
import scala.scalanative.annotation.stub

/** An exception that indicates an X.509 certificate is revoked. A
 *  CertificateRevokedException contains additional information
 *  about the revoked certificate, such as the date on which the
 *  certificate was revoked and the reason it was revoked.
 */
class CertificateRevokedException extends CertificateException {

    /** Constructs a CertificateRevokedException with
     *  the specified revocation date, reason code, authority name, and map
     *  of extensions.
     */
    @stub
    def this(revocationDate: Date, reason: CRLReason, authority: X500Principal, extensions: Map[String, Extension]) = ???

    /** Returns the name of the authority that signed the certificate's
     *  revocation status information.
     */
    @stub
    def getAuthorityName(): X500Principal = ???

    /** Returns a map of X.509 extensions containing additional information
     *  about the revoked certificate, such as the Invalidity Date
     *  Extension.
     */
    @stub
    def getExtensions(): Map[String, Extension] = ???

    /** Returns the invalidity date, as specified in the Invalidity Date
     *  extension of this CertificateRevokedException.
     */
    @stub
    def getInvalidityDate(): Date = ???

    /** Returns the detail message string of this throwable. */
    @stub
    def getMessage(): String = ???

    /** Returns the date on which the certificate was revoked. */
    @stub
    def getRevocationDate(): Date = ???

    /** Returns the reason the certificate was revoked. */
    @stub
    def getRevocationReason(): CRLReason = ???
}
