package java.lang

// Signals that a method has been invoked at an illegal or
// inappropriate time.  In other words, the Java environment or
// Java application is not in an appropriate state for the requested
// operation.
class IllegalStateException extends RuntimeException {

    @stub
    // Constructs an IllegalStateException with no detail message.
    def this() = ???

    @stub
    // Constructs an IllegalStateException with the specified detail
    // message.
    def this(s: String) = ???

    @stub
    // Constructs a new exception with the specified detail message and
    // cause.
    def this(message: String, cause: Throwable) = ???
}
