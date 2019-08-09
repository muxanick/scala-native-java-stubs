package java.security

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This is the exception for invalid Keys (invalid encoding, wrong
 *  length, uninitialized, etc).
 */
class InvalidKeyException extends KeyException {

    /** Constructs an InvalidKeyException with no detail message. */
    @stub
    def this() = ???

    /** Constructs an InvalidKeyException with the specified detail
     *  message.
     */
    @stub
    def this(msg: String) = ???

    /** Creates a InvalidKeyException with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Creates a InvalidKeyException with the specified cause
     *  and a detail message of (cause==null ? null : cause.toString())
     *  (which typically contains the class and detail message of
     *  cause).
     */
    @stub
    def this(cause: Throwable) = ???
}
