package java.lang

import scala.scalanative.annotation.stub

/** Thrown when an unknown but serious exception has occurred in the
 *  Java Virtual Machine.
 */
class UnknownError extends VirtualMachineError {

    /** Constructs an UnknownError with no detail message. */
    @stub
    def this() = ???

    /** Constructs an UnknownError with the specified detail
     *  message.
     */
    @stub
    def this(s: String) = ???
}
