package java.util.regex

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown to indicate a syntax error in a
 *  regular-expression pattern.
 */
class PatternSyntaxException extends IllegalArgumentException {

    /** Constructs a new instance of this class. */
    @stub
    def this(desc: String, regex: String, index: Int) = ???

    /** Retrieves the description of the error. */
    @stub
    def getDescription(): String = ???

    /** Retrieves the error index. */
    @stub
    def getIndex(): Int = ???

    /** Returns a multi-line string containing the description of the syntax
     *  error and its index, the erroneous regular-expression pattern, and a
     *  visual indication of the error index within the pattern.
     */
    @stub
    def getMessage(): String = ???

    /** Retrieves the erroneous regular-expression pattern. */
    @stub
    def getPattern(): String = ???
}
