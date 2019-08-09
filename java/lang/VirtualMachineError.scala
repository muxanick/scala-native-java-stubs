package java.lang

/** Thrown to indicate that the Java Virtual Machine is broken or has
 *  run out of resources necessary for it to continue operating.
 */
abstract class VirtualMachineError extends Error {

    /** Constructs a VirtualMachineError with no detail message. */
    @stub
    def this() = ???

    /** Constructs a VirtualMachineError with the specified
     *  detail message.
     */
    @stub
    def this(message: String) = ???

    /** Constructs a VirtualMachineError with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???
}
