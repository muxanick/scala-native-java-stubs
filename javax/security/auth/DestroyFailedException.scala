package javax.security.auth

import java.lang.{Exception, Object, Throwable}

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
}
