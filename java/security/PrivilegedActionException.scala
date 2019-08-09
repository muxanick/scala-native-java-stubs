package java.security

import java.lang.{Exception, Object, Throwable}

/** This exception is thrown by
 *  doPrivileged(PrivilegedExceptionAction) and
 *  doPrivileged(PrivilegedExceptionAction,
 *  AccessControlContext context) to indicate
 *  that the action being performed threw a checked exception.  The exception
 *  thrown by the action can be obtained by calling the
 *  getException method.  In effect, an
 *  PrivilegedActionException is a "wrapper"
 *  for an exception thrown by a privileged action.
 * 
 *  As of release 1.4, this exception has been retrofitted to conform to
 *  the general purpose exception-chaining mechanism.  The "exception thrown
 *  by the privileged computation" that is provided at construction time and
 *  accessed via the getException() method is now known as the
 *  cause, and may be accessed via the Throwable.getCause()
 *  method, as well as the aforementioned "legacy method."
 */
class PrivilegedActionException extends Exception {

    /** Returns the cause of this exception (the exception thrown by
     *  the privileged computation that resulted in this
     *  PrivilegedActionException).
     */
    @stub
    def getCause(): Throwable = ???

    /** Returns the exception thrown by the privileged computation that
     *  resulted in this PrivilegedActionException.
     */
    @stub
    def getException(): Exception = ???
}
