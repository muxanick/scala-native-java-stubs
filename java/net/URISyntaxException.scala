package java.net

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Checked exception thrown to indicate that a string could not be parsed as a
 *  URI reference.
 */
class URISyntaxException extends Exception {

    /** Constructs an instance from the given input string and reason. */
    @stub
    def this(input: String, reason: String) = ???

    /** Constructs an instance from the given input string, reason, and error
     *  index.
     */
    @stub
    def this(input: String, reason: String, index: Int) = ???

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

    /** Returns a string explaining why the input string could not be parsed. */
    @stub
    def getReason(): String = ???
}
