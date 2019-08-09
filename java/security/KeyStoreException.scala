package java.security

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This is the generic KeyStore exception. */
class KeyStoreException extends GeneralSecurityException {

    /** Constructs a KeyStoreException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a KeyStoreException with the specified detail
     *  message.
     */
    @stub
    def this(msg: String) = ???

    /** Creates a KeyStoreException with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Creates a KeyStoreException with the specified cause
     *  and a detail message of (cause==null ? null : cause.toString())
     *  (which typically contains the class and detail message of
     *  cause).
     */
    @stub
    def this(cause: Throwable) = ???
}
