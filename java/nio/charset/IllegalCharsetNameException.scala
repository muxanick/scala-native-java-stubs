package java.nio.charset

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when a string that is not a
 *  legal charset name is used as such.
 */
class IllegalCharsetNameException extends IllegalArgumentException {

    /** Constructs an instance of this class. */
    @stub
    def this(charsetName: String) = ???

    /** Retrieves the illegal charset name. */
    @stub
    def getCharsetName(): String = ???
}
