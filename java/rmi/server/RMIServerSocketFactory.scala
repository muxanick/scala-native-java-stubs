package java.rmi.server

import java.net.ServerSocket
import scala.scalanative.annotation.stub

/** An RMIServerSocketFactory instance is used by the RMI runtime
 *  in order to obtain server sockets for RMI calls.  A remote object can be
 *  associated with an RMIServerSocketFactory when it is
 *  created/exported via the constructors or exportObject methods
 *  of java.rmi.server.UnicastRemoteObject and
 *  java.rmi.activation.Activatable .
 * 
 *  An RMIServerSocketFactory instance associated with a remote
 *  object is used to obtain the ServerSocket used to accept
 *  incoming calls from clients.
 * 
 *  An RMIServerSocketFactory instance can also be associated
 *  with a remote object registry so that clients can use custom socket
 *  communication with a remote object registry.
 * 
 *  An implementation of this interface
 *  should implement Object.equals(java.lang.Object) to return true when
 *  passed an instance that represents the same (functionally equivalent)
 *  server socket factory, and false otherwise (and it should also
 *  implement Object.hashCode() consistently with its
 *  Object.equals implementation).
 */
trait RMIServerSocketFactory {

    /** Create a server socket on the specified port (port 0 indicates
     *  an anonymous port).
     */
    @stub
    def createServerSocket(port: Int): ServerSocket = ???
}
