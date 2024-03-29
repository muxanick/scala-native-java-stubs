package java.lang

import scala.scalanative.annotation.stub

/** Thrown when the Java Virtual Machine detects a circularity in the
 *  superclass hierarchy of a class being loaded.
 */
class ClassCircularityError extends LinkageError {

    /** Constructs a ClassCircularityError with no detail message. */
    @stub
    def this() = ???

    /** Constructs a ClassCircularityError with the specified detail
     *  message.
     */
    @stub
    def this(s: String) = ???
}
