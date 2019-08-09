package javax.security.cert

import java.lang.{Exception, Object, Throwable}

/** Certificate is not yet valid exception. This is thrown whenever
 *  the current Date or the specified Date
 *  is before the notBefore date/time in the Certificate
 *  validity period.
 * 
 *  Note: The classes in the package javax.security.cert
 *  exist for compatibility with earlier versions of the
 *  Java Secure Sockets Extension (JSSE). New applications should instead
 *  use the standard Java SE certificate classes located in
 *  java.security.cert.
 */
class CertificateNotYetValidException extends CertificateException {

    /** Constructs a CertificateNotYetValidException with no detail message. */
    @stub
    def this() = ???
}
