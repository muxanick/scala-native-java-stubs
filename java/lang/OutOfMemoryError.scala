package java.lang

import scala.scalanative.annotation.stub

/** Thrown when the Java Virtual Machine cannot allocate an object
 *  because it is out of memory, and no more memory could be made
 *  available by the garbage collector.
 * 
 *  OutOfMemoryError objects may be constructed by the virtual
 *  machine as if suppression were disabled and/or the stack trace was not
 *  writable.
 */
class OutOfMemoryError extends VirtualMachineError {

    /** Constructs an OutOfMemoryError with no detail message. */
    @stub
    def this() = ???

    /** Constructs an OutOfMemoryError with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???
}
