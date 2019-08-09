package java.nio.charset

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when no support is available
 *  for a requested charset.
 */
class UnsupportedCharsetException extends IllegalArgumentException {

    /** Constructs an instance of this class. */
    @stub
    def this(charsetName: String) = ???

    /** Retrieves the name of the unsupported charset. */
    @stub
    def getCharsetName(): String = ???
}
