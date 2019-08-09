package java.time.temporal

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import java.time.DateTimeException
import scala.scalanative.annotation.stub

/** UnsupportedTemporalTypeException indicates that a ChronoField or ChronoUnit is
 *  not supported for a Temporal class.
 */
class UnsupportedTemporalTypeException extends DateTimeException {

    /** Constructs a new UnsupportedTemporalTypeException with the specified message. */
    @stub
    def this(message: String) = ???

    /** Constructs a new UnsupportedTemporalTypeException with the specified message and cause. */
    @stub
    def this(message: String, cause: Throwable) = ???
}
