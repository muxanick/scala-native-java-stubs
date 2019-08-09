package javax.print

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Class PrintException encapsulates a printing-related error condition that
 *  occurred while using a Print Service instance. This base class
 *  furnishes only a string description of the error. Subclasses furnish more
 *  detailed information if applicable.
 */
class PrintException extends Exception {

    /** Construct a print exception with no detail message. */
    @stub
    def this() = ???

    /** Construct a print exception chaining the supplied exception. */
    @stub
    def this(e: Exception) = ???

    /** Construct a print exception with the given detail message. */
    @stub
    def this(s: String) = ???

    /** Construct a print exception with the given detail message
     *  and chained exception.
     */
    @stub
    def this(s: String, e: Exception) = ???
}
