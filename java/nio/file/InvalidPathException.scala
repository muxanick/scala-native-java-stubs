package java.nio.file

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}

/** Unchecked exception thrown when path string cannot be converted into a
 *  Path because the path string contains invalid characters, or
 *  the path string is invalid for other file system specific reasons.
 */
class InvalidPathException extends IllegalArgumentException {

    /** Constructs an instance from the given input string and reason. */
    @stub
    def this(input: String, reason: String) = ???

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
}
