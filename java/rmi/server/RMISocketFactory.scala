package java.rmi.server

import java.lang.{Object, String}
import java.net.{ServerSocket, Socket}

/** An RMISocketFactory instance is used by the RMI runtime
 *  in order to obtain client and server sockets for RMI calls.  An
 *  application may use the setSocketFactory method to
 *  request that the RMI runtime use its socket factory instance
 *  instead of the default implementation.
 * 
 *  The default socket factory implementation performs a
 *  three-tiered approach to creating client sockets. First, a direct
 *  socket connection to the remote VM is attempted.  If that fails
 *  (due to a firewall), the runtime uses HTTP with the explicit port
 *  number of the server.  If the firewall does not allow this type of
 *  communication, then HTTP to a cgi-bin script on the server is used
 *  to POST the RMI call. The HTTP tunneling mechanisms are disabled by
 *  default. This behavior is controlled by the java.rmi.server.disableHttp
 *  property, whose default value is true. Setting this property's
 *  value to false will enable the HTTP tunneling mechanisms.
 * 
 *  Deprecated: HTTP Tunneling. The HTTP tunneling mechanisms
 *  described above, specifically HTTP with an explicit port and HTTP to a
 *  cgi-bin script, are deprecated. These HTTP tunneling mechanisms are
 *  subject to removal in a future release of the platform.
 * 
 *  The default socket factory implementation creates server sockets that
 *  are bound to the wildcard address, which accepts requests from all network
 *  interfaces.
 */
abstract class RMISocketFactory extends Object with RMIClientSocketFactory with RMIServerSocketFactory {

    /** Create a server socket on the specified port (port 0 indicates
     *  an anonymous port).
     */
    def createServerSocket(port: Int): ServerSocket

    /** Creates a client socket connected to the specified host and port. */
    def createSocket(host: String, port: Int): Socket
}

object RMISocketFactory {
    /** Returns a reference to the default socket factory used
     *  by this RMI implementation.
     */
    @stub
    def getDefaultSocketFactory(): RMISocketFactory = ???

    /** Returns the handler for socket creation failure set by the
     *  setFailureHandler method.
     */
    @stub
    def getFailureHandler(): RMIFailureHandler = ???

    /** Returns the socket factory set by the setSocketFactory
     *  method.
     */
    @stub
    def getSocketFactory(): RMISocketFactory = ???

    /** Sets the failure handler to be called by the RMI runtime if server
     *  socket creation fails.
     */
    @stub
    def setFailureHandler(fh: RMIFailureHandler): Unit = ???
}
