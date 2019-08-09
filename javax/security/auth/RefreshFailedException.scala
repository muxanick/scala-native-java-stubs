package javax.security.auth

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Signals that a refresh operation failed.
 * 
 *   This exception is thrown by credentials implementing
 *  the Refreshable interface when the refresh
 *  method fails.
 */
class RefreshFailedException extends Exception {

    /** Constructs a RefreshFailedException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a RefreshFailedException with the specified detail
     *  message.
     */
    @stub
    def this(msg: String) = ???
}
