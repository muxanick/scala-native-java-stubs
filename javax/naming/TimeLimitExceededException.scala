package javax.naming

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown when a method
 *  does not terminate within the specified time limit.
 *  This can happen, for example, if the user specifies that
 *  the method should take no longer than 10 seconds, and the
 *  method fails to complete with 10 seconds.
 * 
 *   Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class TimeLimitExceededException extends LimitExceededException {

    /** Constructs a new instance of TimeLimitExceededException. */
    @stub
    def this() = ???

    /** Constructs a new instance of TimeLimitExceededException
     *  using the argument supplied.
     */
    @stub
    def this(explanation: String) = ???
}
