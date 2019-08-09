package java.security.cert

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException

/** This exception indicates one of a variety of certificate problems. */
class CertificateException extends GeneralSecurityException {

    /** Constructs a certificate exception with no detail message. */
    @stub
    def this() = ???

    /** Constructs a certificate exception with the given detail
     *  message.
     */
    @stub
    def this(msg: String) = ???

    /** Creates a CertificateException with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???
}
