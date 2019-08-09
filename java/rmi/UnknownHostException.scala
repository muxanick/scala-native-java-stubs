package java.rmi

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

// An UnknownHostException is thrown if a
// java.net.UnknownHostException occurs while creating
// a connection to the remote host for a remote method call.
class UnknownHostException extends RemoteException {

    @stub
    // Constructs an UnknownHostException with the specified
    // detail message.
    def this(s: String) = ???
}
