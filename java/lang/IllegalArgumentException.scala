package java.lang

// Thrown to indicate that a method has been passed an illegal or
// inappropriate argument.
class IllegalArgumentException extends RuntimeException {

    @stub
    // Constructs an IllegalArgumentException with no
    // detail message.
    def this() = ???

    @stub
    // Constructs an IllegalArgumentException with the
    // specified detail message.
    def this(s: String) = ???

    @stub
    // Constructs a new exception with the specified detail message and
    // cause.
    def this(message: String, cause: Throwable) = ???
}
