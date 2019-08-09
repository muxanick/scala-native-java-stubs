package java.rmi.activation

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import java.rmi.RemoteException

// This exception is thrown by the RMI runtime when activation
// fails during a remote call to an activatable object.
class ActivateFailedException extends RemoteException {

    @stub
    // Constructs an ActivateFailedException with the specified
    // detail message.
    def this(s: String) = ???
}
