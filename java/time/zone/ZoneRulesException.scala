package java.time.zone

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import java.time.DateTimeException
import scala.scalanative.annotation.stub

/** Thrown to indicate a problem with time-zone configuration.
 *  
 *  This exception is used to indicate a problems with the configured
 *  time-zone rules.
 */
class ZoneRulesException extends DateTimeException {

    /** Constructs a new date-time exception with the specified message. */
    @stub
    def this(message: String) = ???

    /** Constructs a new date-time exception with the specified message and cause. */
    @stub
    def this(message: String, cause: Throwable) = ???
}
