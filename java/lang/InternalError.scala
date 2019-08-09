package java.lang

// Thrown to indicate some unexpected internal error has occurred in
// the Java Virtual Machine.
class InternalError extends VirtualMachineError {

    @stub
    // Constructs an InternalError with no detail message.
    def this() = ???

    @stub
    // Constructs an InternalError with the specified
    // detail message.
    def this(message: String) = ???

    @stub
    // Constructs an InternalError with the specified detail
    // message and cause.
    def this(message: String, cause: Throwable) = ???
}
