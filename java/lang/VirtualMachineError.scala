package java.lang

import scala.scalanative.annotation.stub

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

    /** Constructs an a VirtualMachineError with the specified
     *  cause and a detail message of (cause==null ? null :
     *  cause.toString()) (which typically contains the class and
     *  detail message of cause).
     */
    @stub
    def this(cause: Throwable) = ???
}
