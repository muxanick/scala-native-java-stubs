package java.security.spec

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import scala.scalanative.annotation.stub

/** This is the exception for invalid key specifications. */
class InvalidKeySpecException extends GeneralSecurityException {

    /** Constructs an InvalidKeySpecException with no detail message. */
    @stub
    def this() = ???

    /** Constructs an InvalidKeySpecException with the specified detail
     *  message.
     */
    @stub
    def this(msg: String) = ???

    /** Creates a InvalidKeySpecException with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Creates a InvalidKeySpecException with the specified cause
     *  and a detail message of (cause==null ? null : cause.toString())
     *  (which typically contains the class and detail message of
     *  cause).
     */
    @stub
    def this(cause: Throwable) = ???
}
