package java.lang

// Thrown by the security manager to indicate a security violation.
class SecurityException extends RuntimeException {

    @stub
    // Constructs a SecurityException with no detail  message.
    def this() = ???

    @stub
    // Constructs a SecurityException with the specified
    // detail message.
    def this(s: String) = ???

    @stub
    // Creates a SecurityException with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
