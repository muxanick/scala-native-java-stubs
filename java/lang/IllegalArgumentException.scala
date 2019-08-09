package java.lang

import scala.scalanative.annotation.stub

/** Thrown to indicate that a method has been passed an illegal or
 *  inappropriate argument.
 */
class IllegalArgumentException extends RuntimeException {

    /** Constructs an IllegalArgumentException with no
     *  detail message.
     */
    @stub
    def this() = ???

    /** Constructs an IllegalArgumentException with the
     *  specified detail message.
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
