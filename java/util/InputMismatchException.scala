package java.util

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown by a Scanner to indicate that the token
 *  retrieved does not match the pattern for the expected type, or
 *  that the token is out of range for the expected type.
 */
class InputMismatchException extends NoSuchElementException {

    /** Constructs an InputMismatchException with null
     *  as its error message string.
     */
    @stub
    def this() = ???

    /** Constructs an InputMismatchException, saving a reference
     *  to the error message string s for later retrieval by the
     *  getMessage method.
     */
    @stub
    def this(s: String) = ???
}
