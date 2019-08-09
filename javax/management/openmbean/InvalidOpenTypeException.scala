package javax.management.openmbean

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** This runtime exception is thrown to indicate that the open type of an open data value
 *  is not the one expected.
 */
class InvalidOpenTypeException extends IllegalArgumentException {

    /** An InvalidOpenTypeException with no detail message. */
    @stub
    def this() = ???

    /** An InvalidOpenTypeException with a detail message. */
    @stub
    def this(msg: String) = ???
}
