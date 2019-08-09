package java.lang

import scala.scalanative.annotation.stub

/** Thrown when a stack overflow occurs because an application
 *  recurses too deeply.
 */
class StackOverflowError extends VirtualMachineError {

    /** Constructs a StackOverflowError with no detail message. */
    @stub
    def this() = ???

    /** Constructs a StackOverflowError with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???
}
