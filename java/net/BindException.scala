package java.net

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Signals that an error occurred while attempting to bind a
 *  socket to a local address and port.  Typically, the port is
 *  in use, or the requested local address could not be assigned.
 */
class BindException extends SocketException {

    /** Construct a new BindException with no detailed message. */
    @stub
    def this() = ???

    /** Constructs a new BindException with the specified detail
     *  message as to why the bind error occurred.
     */
    @stub
    def this(msg: String) = ???
}
