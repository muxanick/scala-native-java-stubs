package java.lang

// Thrown to indicate that an invokedynamic instruction has
// failed to find its bootstrap method,
// or the bootstrap method has failed to provide a
// call site with a target
// of the correct method type.
class BootstrapMethodError extends LinkageError {

    @stub
    // Constructs a BootstrapMethodError with no detail message.
    def this() = ???

    @stub
    // Constructs a BootstrapMethodError with the specified
    // detail message.
    def this(s: String) = ???

    @stub
    // Constructs a BootstrapMethodError with the specified
    // detail message and cause.
    def this(s: String, cause: Throwable) = ???
}
