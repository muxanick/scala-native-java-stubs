package java.net

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Signals that an error occurred while attempting to connect a
 *  socket to a remote address and port.  Typically, the remote
 *  host cannot be reached because of an intervening firewall, or
 *  if an intermediate router is down.
 */
class NoRouteToHostException extends SocketException {

    /** Construct a new NoRouteToHostException with no detailed message. */
    @stub
    def this() = ???

    /** Constructs a new NoRouteToHostException with the specified detail
     *  message as to why the remote host cannot be reached.
     */
    @stub
    def this(msg: String) = ???
}
