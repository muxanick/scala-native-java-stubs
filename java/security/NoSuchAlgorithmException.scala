package java.security

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown when a particular cryptographic algorithm is
 *  requested but is not available in the environment.
 */
class NoSuchAlgorithmException extends GeneralSecurityException {

    /** Constructs a NoSuchAlgorithmException with no detail
     *  message.
     */
    @stub
    def this() = ???

    /** Constructs a NoSuchAlgorithmException with the specified
     *  detail message.
     */
    @stub
    def this(msg: String) = ???

    /** Creates a NoSuchAlgorithmException with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Creates a NoSuchAlgorithmException with the specified cause
     *  and a detail message of (cause==null ? null : cause.toString())
     *  (which typically contains the class and detail message of
     *  cause).
     */
    @stub
    def this(cause: Throwable) = ???
}
