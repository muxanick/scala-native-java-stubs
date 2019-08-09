package javax.security.cert

import java.lang.{Exception, Object, Throwable}

/** This exception indicates one of a variety of certificate problems.
 * 
 *  Note: The classes in the package javax.security.cert
 *  exist for compatibility with earlier versions of the
 *  Java Secure Sockets Extension (JSSE). New applications should instead
 *  use the standard Java SE certificate classes located in
 *  java.security.cert.
 */
class CertificateException extends Exception {

    /** Constructs a certificate exception with no detail message. */
    @stub
    def this() = ???
}
