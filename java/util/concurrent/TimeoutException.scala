package java.util.concurrent

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Exception thrown when a blocking operation times out.  Blocking
 *  operations for which a timeout is specified need a means to
 *  indicate that the timeout has occurred. For many such operations it
 *  is possible to return a value that indicates timeout; when that is
 *  not possible or desirable then TimeoutException should be
 *  declared and thrown.
 */
class TimeoutException extends Exception {

    /** Constructs a TimeoutException with no specified detail
     *  message.
     */
    @stub
    def this() = ???

    /** Constructs a TimeoutException with the specified detail
     *  message.
     */
    @stub
    def this(message: String) = ???
}
