package java.net

import java.io.Closeable
import java.lang.{Object, String}
import java.nio.channels.ServerSocketChannel
import scala.scalanative.annotation.stub

/** This class implements server sockets. A server socket waits for
 *  requests to come in over the network. It performs some operation
 *  based on that request, and then possibly returns a result to the requester.
 *  
 *  The actual work of the server socket is performed by an instance
 *  of the SocketImpl class. An application can
 *  change the socket factory that creates the socket
 *  implementation to configure itself to create sockets
 *  appropriate to the local firewall.
 */
class ServerSocket extends Object with Closeable {

    /** Creates an unbound server socket. */
    @stub
    def this() = ???

    /** Creates a server socket, bound to the specified port. */
    @stub
    def this(port: Int) = ???

    /** Creates a server socket and binds it to the specified local port
     *  number, with the specified backlog.
     */
    @stub
    def this(port: Int, backlog: Int) = ???

    /** Create a server with the specified port, listen backlog, and
     *  local IP address to bind to.
     */
    @stub
    def this(port: Int, backlog: Int, bindAddr: InetAddress) = ???

    /** Listens for a connection to be made to this socket and accepts
     *  it.
     */
    @stub
    def accept(): Socket = ???

    /** Binds the ServerSocket to a specific address
     *  (IP address and port number).
     */
    @stub
    def bind(endpoint: SocketAddress): Unit = ???

    /** Binds the ServerSocket to a specific address
     *  (IP address and port number).
     */
    @stub
    def bind(endpoint: SocketAddress, backlog: Int): Unit = ???

    /** Closes this socket. */
    @stub
    def close(): Unit = ???

    /** Returns the unique ServerSocketChannel object
     *  associated with this socket, if any.
     */
    @stub
    def getChannel(): ServerSocketChannel = ???

    /** Returns the local address of this server socket. */
    @stub
    def getInetAddress(): InetAddress = ???

    /** Returns the port number on which this socket is listening. */
    @stub
    def getLocalPort(): Int = ???

    /** Returns the address of the endpoint this socket is bound to. */
    @stub
    def getLocalSocketAddress(): SocketAddress = ???

    /** Gets the value of the SO_RCVBUF option
     *  for this ServerSocket, that is the proposed buffer size that
     *  will be used for Sockets accepted from this ServerSocket.
     */
    @stub
    def getReceiveBufferSize(): Int = ???

    /** Tests if SO_REUSEADDR is enabled. */
    @stub
    def getReuseAddress(): Boolean = ???

    /** Retrieve setting for SO_TIMEOUT. */
    @stub
    def getSoTimeout(): Int = ???

    /** Subclasses of ServerSocket use this method to override accept()
     *  to return their own subclass of socket.
     */
    @stub
    protected def implAccept(s: Socket): Unit = ???

    /** Returns the binding state of the ServerSocket. */
    @stub
    def isBound(): Boolean = ???

    /** Returns the closed state of the ServerSocket. */
    @stub
    def isClosed(): Boolean = ???

    /** Sets performance preferences for this ServerSocket. */
    @stub
    def setPerformancePreferences(connectionTime: Int, latency: Int, bandwidth: Int): Unit = ???

    /** Sets a default proposed value for the
     *  SO_RCVBUF option for sockets
     *  accepted from this ServerSocket.
     */
    @stub
    def setReceiveBufferSize(size: Int): Unit = ???

    /** Enable/disable the SO_REUSEADDR
     *  socket option.
     */
    @stub
    def setReuseAddress(on: Boolean): Unit = ???

    /** Enable/disable SO_TIMEOUT with the
     *  specified timeout, in milliseconds.
     */
    @stub
    def setSoTimeout(timeout: Int): Unit = ???

    /** Returns the implementation address and implementation port of
     *  this socket as a String.
     */
    @stub
    def toString(): String = ???
}

object ServerSocket {
    /** Sets the server socket implementation factory for the
     *  application.
     */
    @stub
    def setSocketFactory(fac: SocketImplFactory): Unit = ???
}
