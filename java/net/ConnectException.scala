package java.net

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Signals that an error occurred while attempting to connect a
 *  socket to a remote address and port.  Typically, the connection
 *  was refused remotely (e.g., no process is listening on the
 *  remote address/port).
 */
class ConnectException extends SocketException {

    /** Construct a new ConnectException with no detailed message. */
    @stub
    def this() = ???

    /** Constructs a new ConnectException with the specified detail
     *  message as to why the connect error occurred.
     */
    @stub
    def this(msg: String) = ???
}
