package java.lang

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
}
