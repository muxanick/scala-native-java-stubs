package java.net

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

/** Signals that an error occurred while attempting to connect a
 *  socket to a remote address and port.  Typically, the remote
 *  host cannot be reached because of an intervening firewall, or
 *  if an intermediate router is down.
 */
class NoRouteToHostException extends SocketException {

    /** Construct a new NoRouteToHostException with no detailed message. */
    @stub
    def this() = ???
}
