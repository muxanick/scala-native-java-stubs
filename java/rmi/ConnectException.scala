package java.rmi

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

// A ConnectException is thrown if a connection is refused
// to the remote host for a remote method call.
class ConnectException extends RemoteException {

    @stub
    // Constructs a ConnectException with the specified
    // detail message.
    def this(s: String) = ???
}
