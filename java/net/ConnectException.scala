package java.net

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

// Signals that an error occurred while attempting to connect a
// socket to a remote address and port.  Typically, the connection
// was refused remotely (e.g., no process is listening on the
// remote address/port).
class ConnectException extends SocketException {

    @stub
    // Construct a new ConnectException with no detailed message.
    def this() = ???
}
