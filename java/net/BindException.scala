package java.net

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

// Signals that an error occurred while attempting to bind a
// socket to a local address and port.  Typically, the port is
// in use, or the requested local address could not be assigned.
class BindException extends SocketException {

    @stub
    // Construct a new BindException with no detailed message.
    def this() = ???
}
