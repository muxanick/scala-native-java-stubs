package java.lang

import scala.scalanative.annotation.stub

/** Thrown if the Java Virtual Machine cannot find an appropriate
 *  native-language definition of a method declared native.
 */
class UnsatisfiedLinkError extends LinkageError {

    /** Constructs an UnsatisfiedLinkError with no detail message. */
    @stub
    def this() = ???

    /** Constructs an UnsatisfiedLinkError with the
     *  specified detail message.
     */
    @stub
    def this(s: String) = ???
}
