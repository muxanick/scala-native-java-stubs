package javax.security.cert

import java.lang.{Exception, Object, Throwable}

/** Certificate Parsing Exception. This is thrown whenever
 *  invalid DER encoded certificate is parsed or unsupported DER features
 *  are found in the Certificate.
 * 
 *  Note: The classes in the package javax.security.cert
 *  exist for compatibility with earlier versions of the
 *  Java Secure Sockets Extension (JSSE). New applications should instead
 *  use the standard Java SE certificate classes located in
 *  java.security.cert.
 */
class CertificateParsingException extends CertificateException {

    /** Constructs a CertificateParsingException with no detail message. */
    @stub
    def this() = ???
}
