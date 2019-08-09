package java.util

import java.lang.{Exception, Object, RuntimeException, Throwable}
import scala.scalanative.annotation.stub

/** Thrown by methods in the Stack class to indicate
 *  that the stack is empty.
 */
class EmptyStackException extends RuntimeException {

    /** Constructs a new EmptyStackException with null
     *  as its error message string.
     */
    @stub
    def this() = ???
}
