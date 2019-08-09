package java.util

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown by various accessor methods to indicate that the element being requested
 *  does not exist.
 */
class NoSuchElementException extends RuntimeException {

    /** Constructs a NoSuchElementException with null
     *  as its error message string.
     */
    @stub
    def this() = ???

    /** Constructs a NoSuchElementException, saving a reference
     *  to the error message string s for later retrieval by the
     *  getMessage method.
     */
    @stub
    def this(s: String) = ???
}
