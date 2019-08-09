package javax.security.cert

import java.lang.{Exception, Object, Throwable}

// Certificate Encoding Exception. This is thrown whenever an error
// occurs whilst attempting to encode a certificate.
//
// Note: The classes in the package javax.security.cert
// exist for compatibility with earlier versions of the
// Java Secure Sockets Extension (JSSE). New applications should instead
// use the standard Java SE certificate classes located in
// java.security.cert.
class CertificateEncodingException extends CertificateException {

    @stub
    // Constructs a CertificateEncodingException with no detail message.
    def this() = ???
}