package java.lang

import scala.scalanative.annotation.stub

/** Thrown to indicate some unexpected internal error has occurred in
 *  the Java Virtual Machine.
 */
class InternalError extends VirtualMachineError {

    /** Constructs an InternalError with no detail message. */
    @stub
    def this() = ???

    /** Constructs an InternalError with the specified
     *  detail message.
     */
    @stub
    def this(message: String) = ???

    /** Constructs an InternalError with the specified detail
     *  message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Constructs an InternalError with the specified cause
     *  and a detail message of (cause==null ? null :
     *  cause.toString()) (which typically contains the class and
     *  detail message of cause).
     */
    @stub
    def this(cause: Throwable) = ???
}
