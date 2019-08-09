package java.lang

// Thrown to indicate that the Java Virtual Machine is broken or has
// run out of resources necessary for it to continue operating.
abstract class VirtualMachineError extends Error {

    @stub
    // Constructs a VirtualMachineError with no detail message.
    def this() = ???

    @stub
    // Constructs a VirtualMachineError with the specified
    // detail message.
    def this(message: String) = ???

    @stub
    // Constructs a VirtualMachineError with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
