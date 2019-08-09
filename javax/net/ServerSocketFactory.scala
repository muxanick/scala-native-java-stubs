package javax.net

import java.lang.Object
import java.net.{InetAddress, ServerSocket}

/** This class creates server sockets.  It may be subclassed by other
 *  factories, which create particular types of server sockets.  This
 *  provides a general framework for the addition of public socket-level
 *  functionality.  It is the server side analogue of a socket factory,
 *  and similarly provides a way to capture a variety of policies related
 *  to the sockets being constructed.
 * 
 *   Like socket factories, server Socket factory instances have
 *  methods used to create sockets. There is also an environment
 *  specific default server socket factory; frameworks will often use
 *  their own customized factory.
 */
abstract class ServerSocketFactory extends Object {

    /** Returns an unbound server socket. */
    def createServerSocket(): ServerSocket

    /** Returns a server socket bound to the specified port. */
    def createServerSocket(port: Int): ServerSocket

    /** Returns a server socket bound to the specified port, and uses the
     *  specified connection backlog.
     */
    def createServerSocket(port: Int, backlog: Int): ServerSocket

    /** Returns a server socket bound to the specified port,
     *  with a specified listen backlog and local IP.
     */
    def createServerSocket(port: Int, backlog: Int, ifAddress: InetAddress): ServerSocket
}
