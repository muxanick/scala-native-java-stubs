package java.lang

import scala.scalanative.annotation.stub

/** Thrown when an incompatible class change has occurred to some class
 *  definition. The definition of some class, on which the currently
 *  executing method depends, has since changed.
 */
class IncompatibleClassChangeError extends LinkageError {

    /** Constructs an IncompatibleClassChangeError with no
     *  detail message.
     */
    @stub
    def this() = ???

    /** Constructs an IncompatibleClassChangeError with the
     *  specified detail message.
     */
    @stub
    def this(s: String) = ???
}
