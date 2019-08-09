package java.util

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown by methods in Locale and Locale.Builder to
 *  indicate that an argument is not a well-formed BCP 47 tag.
 */
class IllformedLocaleException extends RuntimeException {

    /** Constructs a new IllformedLocaleException with no
     *  detail message and -1 as the error index.
     */
    @stub
    def this() = ???

    /** Constructs a new IllformedLocaleException with the
     *  given message and -1 as the error index.
     */
    @stub
    def this(message: String) = ???

    /** Constructs a new IllformedLocaleException with the
     *  given message and the error index.
     */
    @stub
    def this(message: String, errorIndex: Int) = ???

    /** Returns the index where the error was found. */
    @stub
    def getErrorIndex(): Int = ???
}
