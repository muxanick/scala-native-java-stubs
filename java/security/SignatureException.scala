package java.security

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This is the generic Signature exception. */
class SignatureException extends GeneralSecurityException {

    /** Constructs a SignatureException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a SignatureException with the specified detail
     *  message.
     */
    @stub
    def this(msg: String) = ???

    /** Creates a SignatureException with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Creates a SignatureException with the specified cause
     *  and a detail message of (cause==null ? null : cause.toString())
     *  (which typically contains the class and detail message of
     *  cause).
     */
    @stub
    def this(cause: Throwable) = ???
}
