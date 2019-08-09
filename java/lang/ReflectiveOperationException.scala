package java.lang

import scala.scalanative.annotation.stub

/** Common superclass of exceptions thrown by reflective operations in
 *  core reflection.
 */
class ReflectiveOperationException extends Exception {

    /** Constructs a new exception with null as its detail
     *  message.
     */
    @stub
    def this() = ???

    /** Constructs a new exception with the specified detail message. */
    @stub
    def this(message: String) = ???

    /** Constructs a new exception with the specified detail message
     *  and cause.
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
