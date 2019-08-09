package java.net

import java.lang.{Exception, Object, String, Throwable}

/** Checked exception thrown to indicate that a string could not be parsed as a
 *  URI reference.
 */
class URISyntaxException extends Exception {

    /** Constructs an instance from the given input string and reason. */
    @stub
    def this(input: String, reason: String) = ???

    /** Returns an index into the input string of the position at which the
     *  parse error occurred, or -1 if this position is not known.
     */
    @stub
    def getIndex(): Int = ???

    /** Returns the input string. */
    @stub
    def getInput(): String = ???

    /** Returns a string describing the parse error. */
    @stub
    def getMessage(): String = ???
}
