package java.time

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Exception used to indicate a problem while calculating a date-time.
 *  
 *  This exception is used to indicate problems with creating, querying
 *  and manipulating date-time objects.
 */
class DateTimeException extends RuntimeException {

    /** Constructs a new date-time exception with the specified message. */
    @stub
    def this(message: String) = ???

    /** Constructs a new date-time exception with the specified message and cause. */
    @stub
    def this(message: String, cause: Throwable) = ???
}
