package java.security.cert

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import java.util.{Date, Map}
import javax.security.auth.x500.X500Principal

// An exception that indicates an X.509 certificate is revoked. A
// CertificateRevokedException contains additional information
// about the revoked certificate, such as the date on which the
// certificate was revoked and the reason it was revoked.
class CertificateRevokedException extends CertificateException {

    @stub
    // Returns the name of the authority that signed the certificate's
    // revocation status information.
    def getAuthorityName(): X500Principal = ???

    @stub
    // Returns a map of X.509 extensions containing additional information
    // about the revoked certificate, such as the Invalidity Date
    // Extension.
    def getExtensions(): Map[String, Extension] = ???

    @stub
    // Returns the invalidity date, as specified in the Invalidity Date
    // extension of this CertificateRevokedException.
    def getInvalidityDate(): Date = ???

    @stub
    // Returns the detail message string of this throwable.
    def getMessage(): String = ???

    @stub
    // Returns the date on which the certificate was revoked.
    def getRevocationDate(): Date = ???
}
