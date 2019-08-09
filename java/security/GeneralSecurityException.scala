package java.security

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** The GeneralSecurityException class is a generic
 *  security exception class that provides type safety for all the
 *  security-related exception classes that extend from it.
 */
class GeneralSecurityException extends Exception {

    /** Constructs a GeneralSecurityException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a GeneralSecurityException with the specified detail
     *  message.
     */
    @stub
    def this(msg: String) = ???

    /** Creates a GeneralSecurityException with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Creates a GeneralSecurityException with the specified cause
     *  and a detail message of (cause==null ? null : cause.toString())
     *  (which typically contains the class and detail message of
     *  cause).
     */
    @stub
    def this(cause: Throwable) = ???
}
