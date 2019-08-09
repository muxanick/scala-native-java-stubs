package java.net

import java.io.Closeable
import java.lang.Object
import java.nio.channels.ServerSocketChannel

// This class implements server sockets. A server socket waits for
// requests to come in over the network. It performs some operation
// based on that request, and then possibly returns a result to the requester.
// 
// The actual work of the server socket is performed by an instance
// of the SocketImpl class. An application can
// change the socket factory that creates the socket
// implementation to configure itself to create sockets
// appropriate to the local firewall.
class ServerSocket extends Object with Closeable {

    @stub
    // Creates an unbound server socket.
    def this() = ???

    @stub
    // Creates a server socket, bound to the specified port.
    def this(port: Int) = ???

    @stub
    // Creates a server socket and binds it to the specified local port
    // number, with the specified backlog.
    def this(port: Int, backlog: Int) = ???

    @stub
    // Listens for a connection to be made to this socket and accepts
    // it.
    def accept(): Socket = ???

    @stub
    // Binds the ServerSocket to a specific address
    // (IP address and port number).
    def bind(endpoint: SocketAddress): Unit = ???

    @stub
    // Binds the ServerSocket to a specific address
    // (IP address and port number).
    def bind(endpoint: SocketAddress, backlog: Int): Unit = ???

    @stub
    // Closes this socket.
    def close(): Unit = ???

    @stub
    // Returns the unique ServerSocketChannel object
    // associated with this socket, if any.
    def getChannel(): ServerSocketChannel = ???

    @stub
    // Returns the local address of this server socket.
    def getInetAddress(): InetAddress = ???

    @stub
    // Returns the port number on which this socket is listening.
    def getLocalPort(): Int = ???

    @stub
    // Returns the address of the endpoint this socket is bound to.
    def getLocalSocketAddress(): SocketAddress = ???

    @stub
    // Gets the value of the SO_RCVBUF option
    // for this ServerSocket, that is the proposed buffer size that
    // will be used for Sockets accepted from this ServerSocket.
    def getReceiveBufferSize(): Int = ???

    @stub
    // Tests if SO_REUSEADDR is enabled.
    def getReuseAddress(): Boolean = ???

    @stub
    // Retrieve setting for SO_TIMEOUT.
    def getSoTimeout(): Int = ???

    @stub
    // Subclasses of ServerSocket use this method to override accept()
    // to return their own subclass of socket.
    protected def implAccept(s: Socket): Unit = ???

    @stub
    // Returns the binding state of the ServerSocket.
    def isBound(): Boolean = ???

    @stub
    // Returns the closed state of the ServerSocket.
    def isClosed(): Boolean = ???

    @stub
    // Sets performance preferences for this ServerSocket.
    def setPerformancePreferences(connectionTime: Int, latency: Int, bandwidth: Int): Unit = ???

    @stub
    // Sets a default proposed value for the
    // SO_RCVBUF option for sockets
    // accepted from this ServerSocket.
    def setReceiveBufferSize(size: Int): Unit = ???

    @stub
    // Enable/disable the SO_REUSEADDR
    // socket option.
    def setReuseAddress(on: Boolean): Unit = ???

    @stub
    // Enable/disable SO_TIMEOUT with the
    // specified timeout, in milliseconds.
    def setSoTimeout(timeout: Int): Unit = ???
}

object ServerSocket {
    @stub
    // Sets the server socket implementation factory for the
    // application.
    def setSocketFactory(fac: SocketImplFactory): Unit = ???
}
