package java.util

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when the format width is a negative value other
 *  than -1 or is otherwise unsupported.
 */
class IllegalFormatWidthException extends IllegalFormatException {

    /** Constructs an instance of this class with the specified width. */
    @stub
    def this(w: Int) = ???

    /** Returns the detail message string of this throwable. */
    @stub
    def getMessage(): String = ???

    /** Returns the width */
    @stub
    def getWidth(): Int = ???
}
