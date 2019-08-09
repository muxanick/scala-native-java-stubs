package java.nio.file

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when path string cannot be converted into a
 *  Path because the path string contains invalid characters, or
 *  the path string is invalid for other file system specific reasons.
 */
class InvalidPathException extends IllegalArgumentException {

    /** Constructs an instance from the given input string and reason. */
    @stub
    def this(input: String, reason: String) = ???

    /** Constructs an instance from the given input string, reason, and error
     *  index.
     */
    @stub
    def this(input: String, reason: String, index: Int) = ???

    /** Returns an index into the input string of the position at which the
     *  error occurred, or -1 if this position is not known.
     */
    @stub
    def getIndex(): Int = ???

    /** Returns the input string. */
    @stub
    def getInput(): String = ???

    /** Returns a string describing the error. */
    @stub
    def getMessage(): String = ???

    /** Returns a string explaining why the input string was rejected. */
    @stub
    def getReason(): String = ???
}
