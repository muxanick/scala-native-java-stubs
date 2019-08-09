package java.lang

/** Thrown to indicate that an invokedynamic instruction has
 *  failed to find its bootstrap method,
 *  or the bootstrap method has failed to provide a
 *  call site with a target
 *  of the correct method type.
 */
class BootstrapMethodError extends LinkageError {

    /** Constructs a BootstrapMethodError with no detail message. */
    @stub
    def this() = ???

    /** Constructs a BootstrapMethodError with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???

    /** Constructs a BootstrapMethodError with the specified
     *  detail message and cause.
     */
    @stub
    def this(s: String, cause: Throwable) = ???
}
