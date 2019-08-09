package java.net

import java.io.{Closeable, InputStream, OutputStream}
import java.lang.{Object, String}
import java.nio.channels.SocketChannel

// This class implements client sockets (also called just
// "sockets"). A socket is an endpoint for communication
// between two machines.
// 
// The actual work of the socket is performed by an instance of the
// SocketImpl class. An application, by changing
// the socket factory that creates the socket implementation,
// can configure itself to create sockets appropriate to the local
// firewall.
class Socket extends Object with Closeable {

    @stub
    // Creates an unconnected socket, with the
    // system-default type of SocketImpl.
    def this() = ???

    @stub
    // Creates a stream socket and connects it to the specified port
    // number at the specified IP address.
    def this(address: InetAddress, port: Int) = ???

    @stub
    // Deprecated. 
    //Use DatagramSocket instead for UDP transport.
    //
    def this(host: InetAddress, port: Int, stream: Boolean) = ???

    @stub
    // Creates a socket and connects it to the specified remote address on
    // the specified remote port.
    def this(address: InetAddress, port: Int, localAddr: InetAddress, localPort: Int) = ???

    @stub
    // Creates an unconnected socket, specifying the type of proxy, if any,
    // that should be used regardless of any other settings.
    def this(proxy: Proxy) = ???

    @stub
    // Creates an unconnected Socket with a user-specified
    // SocketImpl.
    protected def this(impl: SocketImpl) = ???

    @stub
    // Creates a stream socket and connects it to the specified port
    // number on the named host.
    def this(host: String, port: Int) = ???

    @stub
    // Deprecated. 
    //Use DatagramSocket instead for UDP transport.
    //
    def this(host: String, port: Int, stream: Boolean) = ???

    @stub
    // Binds the socket to a local address.
    def bind(bindpoint: SocketAddress): Unit = ???

    @stub
    // Closes this socket.
    def close(): Unit = ???

    @stub
    // Connects this socket to the server.
    def connect(endpoint: SocketAddress): Unit = ???

    @stub
    // Connects this socket to the server with a specified timeout value.
    def connect(endpoint: SocketAddress, timeout: Int): Unit = ???

    @stub
    // Returns the unique SocketChannel
    // object associated with this socket, if any.
    def getChannel(): SocketChannel = ???

    @stub
    // Returns the address to which the socket is connected.
    def getInetAddress(): InetAddress = ???

    @stub
    // Returns an input stream for this socket.
    def getInputStream(): InputStream = ???

    @stub
    // Tests if SO_KEEPALIVE is enabled.
    def getKeepAlive(): Boolean = ???

    @stub
    // Gets the local address to which the socket is bound.
    def getLocalAddress(): InetAddress = ???

    @stub
    // Returns the local port number to which this socket is bound.
    def getLocalPort(): Int = ???

    @stub
    // Returns the address of the endpoint this socket is bound to.
    def getLocalSocketAddress(): SocketAddress = ???

    @stub
    // Tests if SO_OOBINLINE is enabled.
    def getOOBInline(): Boolean = ???

    @stub
    // Returns an output stream for this socket.
    def getOutputStream(): OutputStream = ???

    @stub
    // Returns the remote port number to which this socket is connected.
    def getPort(): Int = ???

    @stub
    // Gets the value of the SO_RCVBUF option
    // for this Socket, that is the buffer size used by the platform
    // for input on this Socket.
    def getReceiveBufferSize(): Int = ???

    @stub
    // Returns the address of the endpoint this socket is connected to, or
    // null if it is unconnected.
    def getRemoteSocketAddress(): SocketAddress = ???

    @stub
    // Tests if SO_REUSEADDR is enabled.
    def getReuseAddress(): Boolean = ???

    @stub
    // Get value of the SO_SNDBUF option
    // for this Socket, that is the buffer size used by the platform
    // for output on this Socket.
    def getSendBufferSize(): Int = ???

    @stub
    // Returns setting for SO_LINGER.
    def getSoLinger(): Int = ???

    @stub
    // Returns setting for SO_TIMEOUT.
    def getSoTimeout(): Int = ???

    @stub
    // Tests if TCP_NODELAY is enabled.
    def getTcpNoDelay(): Boolean = ???

    @stub
    // Gets traffic class or type-of-service in the IP header
    // for packets sent from this Socket
    def getTrafficClass(): Int = ???

    @stub
    // Returns the binding state of the socket.
    def isBound(): Boolean = ???

    @stub
    // Returns the closed state of the socket.
    def isClosed(): Boolean = ???

    @stub
    // Returns the connection state of the socket.
    def isConnected(): Boolean = ???

    @stub
    // Returns whether the read-half of the socket connection is closed.
    def isInputShutdown(): Boolean = ???

    @stub
    // Returns whether the write-half of the socket connection is closed.
    def isOutputShutdown(): Boolean = ???

    @stub
    // Send one byte of urgent data on the socket.
    def sendUrgentData(data: Int): Unit = ???

    @stub
    // Enable/disable SO_KEEPALIVE.
    def setKeepAlive(on: Boolean): Unit = ???

    @stub
    // Enable/disable SO_OOBINLINE
    // (receipt of TCP urgent data)
    //
    // By default, this option is disabled and TCP urgent data received on a
    // socket is silently discarded.
    def setOOBInline(on: Boolean): Unit = ???

    @stub
    // Sets performance preferences for this socket.
    def setPerformancePreferences(connectionTime: Int, latency: Int, bandwidth: Int): Unit = ???

    @stub
    // Sets the SO_RCVBUF option to the
    // specified value for this Socket.
    def setReceiveBufferSize(size: Int): Unit = ???

    @stub
    // Enable/disable the SO_REUSEADDR
    // socket option.
    def setReuseAddress(on: Boolean): Unit = ???

    @stub
    // Sets the SO_SNDBUF option to the
    // specified value for this Socket.
    def setSendBufferSize(size: Int): Unit = ???

    @stub
    // Enable/disable SO_LINGER with the
    // specified linger time in seconds.
    def setSoLinger(on: Boolean, linger: Int): Unit = ???

    @stub
    // Enable/disable SO_TIMEOUT
    //  with the specified timeout, in milliseconds.
    def setSoTimeout(timeout: Int): Unit = ???

    @stub
    // Enable/disable TCP_NODELAY
    // (disable/enable Nagle's algorithm).
    def setTcpNoDelay(on: Boolean): Unit = ???

    @stub
    // Sets traffic class or type-of-service octet in the IP
    // header for packets sent from this Socket.
    def setTrafficClass(tc: Int): Unit = ???

    @stub
    // Places the input stream for this socket at "end of stream".
    def shutdownInput(): Unit = ???

    @stub
    // Disables the output stream for this socket.
    def shutdownOutput(): Unit = ???
}

object Socket {
    @stub
    // Sets the client socket implementation factory for the
    // application.
    def setSocketImplFactory(fac: SocketImplFactory): Unit = ???
}
