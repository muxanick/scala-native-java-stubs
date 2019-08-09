package javax.security.auth

import java.lang.{Exception, Object, Throwable}

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
}
