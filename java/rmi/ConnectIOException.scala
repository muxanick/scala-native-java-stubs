package java.rmi

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

// A ConnectIOException is thrown if an
// IOException occurs while making a connection
// to the remote host for a remote method call.
class ConnectIOException extends RemoteException {

    @stub
    // Constructs a ConnectIOException with the specified
    // detail message.
    def this(s: String) = ???
}
