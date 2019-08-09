package java.rmi

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

/** An AccessException is thrown by certain methods of the
 *  java.rmi.Naming class (specifically bind,
 *  rebind, and unbind) and methods of the
 *  java.rmi.activation.ActivationSystem interface to
 *  indicate that the caller does not have permission to perform the action
 *  requested by the method call.  If the method was invoked from a non-local
 *  host, then an AccessException is thrown.
 */
class AccessException extends RemoteException {

    /** Constructs an AccessException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???
}
