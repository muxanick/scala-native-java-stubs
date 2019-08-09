package java.rmi

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** A MarshalException is thrown if a
 *  java.io.IOException occurs while marshalling the remote call
 *  header, arguments or return value for a remote method call.  A
 *  MarshalException is also thrown if the receiver does not
 *  support the protocol version of the sender.
 * 
 *  If a MarshalException occurs during a remote method call,
 *  the call may or may not have reached the server.  If the call did reach the
 *  server, parameters may have been deserialized.  A call may not be
 *  retransmitted after a MarshalException and reliably preserve
 *  "at most once" call semantics.
 */
class MarshalException extends RemoteException {

    /** Constructs a MarshalException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???

    /** Constructs a MarshalException with the specified
     *  detail message and nested exception.
     */
    @stub
    def this(s: String, ex: Exception) = ???
}
