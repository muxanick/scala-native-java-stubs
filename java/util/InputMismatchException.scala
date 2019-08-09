package java.util

import java.lang.{Exception, Object, RuntimeException, Throwable}

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
}
