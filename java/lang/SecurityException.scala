package java.lang

import scala.scalanative.annotation.stub

/** Thrown by the security manager to indicate a security violation. */
class SecurityException extends RuntimeException {

    /** Constructs a SecurityException with no detail  message. */
    @stub
    def this() = ???

    /** Constructs a SecurityException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???

    /** Creates a SecurityException with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Creates a SecurityException with the specified cause
     *  and a detail message of (cause==null ? null : cause.toString())
     *  (which typically contains the class and detail message of
     *  cause).
     */
    @stub
    def this(cause: Throwable) = ???
}
