package javax.security.auth

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Signals that a destroy operation failed.
 * 
 *   This exception is thrown by credentials implementing
 *  the Destroyable interface when the destroy
 *  method fails.
 */
class DestroyFailedException extends Exception {

    /** Constructs a DestroyFailedException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a DestroyFailedException with the specified detail
     *  message.
     */
    @stub
    def this(msg: String) = ???
}
