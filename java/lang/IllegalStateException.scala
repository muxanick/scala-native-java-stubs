package java.lang

import scala.scalanative.annotation.stub

/** Signals that a method has been invoked at an illegal or
 *  inappropriate time.  In other words, the Java environment or
 *  Java application is not in an appropriate state for the requested
 *  operation.
 */
class IllegalStateException extends RuntimeException {

    /** Constructs an IllegalStateException with no detail message. */
    @stub
    def this() = ???

    /** Constructs an IllegalStateException with the specified detail
     *  message.
     */
    @stub
    def this(s: String) = ???

    /** Constructs a new exception with the specified detail message and
     *  cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Constructs a new exception with the specified cause and a detail
     *  message of (cause==null ? null : cause.toString()) (which
     *  typically contains the class and detail message of cause).
     */
    @stub
    def this(cause: Throwable) = ???
}
