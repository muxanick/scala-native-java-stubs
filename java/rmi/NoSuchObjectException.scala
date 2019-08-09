package java.rmi

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** A NoSuchObjectException is thrown if an attempt is made to
 *  invoke a method on an object that no longer exists in the remote virtual
 *  machine.  If a NoSuchObjectException occurs attempting to
 *  invoke a method on a remote object, the call may be retransmitted and still
 *  preserve RMI's "at most once" call semantics.
 * 
 *  A NoSuchObjectException is also thrown by the method
 *  java.rmi.server.RemoteObject.toStub and by the
 *  unexportObject methods of
 *  java.rmi.server.UnicastRemoteObject and
 *  java.rmi.activation.Activatable and
 */
class NoSuchObjectException extends RemoteException {

    /** Constructs a NoSuchObjectException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???
}
