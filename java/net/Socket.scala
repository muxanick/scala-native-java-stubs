package java.net

import java.io.{Closeable, InputStream, OutputStream}
import java.lang.{Object, String}
import java.nio.channels.SocketChannel

/** This class implements client sockets (also called just
 *  "sockets"). A socket is an endpoint for communication
 *  between two machines.
 *  
 *  The actual work of the socket is performed by an instance of the
 *  SocketImpl class. An application, by changing
 *  the socket factory that creates the socket implementation,
 *  can configure itself to create sockets appropriate to the local
 *  firewall.
 */
class Socket extends Object with Closeable {

    /** Creates an unconnected socket, with the
     *  system-default type of SocketImpl.
     */
    @stub
    def this() = ???

    /** Creates a stream socket and connects it to the specified port
     *  number at the specified IP address.
     */
    @stub
    def this(address: InetAddress, port: Int) = ???

    /** Deprecated. 
     * Use DatagramSocket instead for UDP transport.
     * 
     */
    @stub
    def this(host: InetAddress, port: Int, stream: Boolean) = ???

    /** Creates a socket and connects it to the specified remote address on
     *  the specified remote port.
     */
    @stub
    def this(address: InetAddress, port: Int, localAddr: InetAddress, localPort: Int) = ???

    /** Creates an unconnected socket, specifying the type of proxy, if any,
     *  that should be used regardless of any other settings.
     */
    @stub
    def this(proxy: Proxy) = ???

    /** Creates an unconnected Socket with a user-specified
     *  SocketImpl.
     */
    @stub
    protected def this(impl: SocketImpl) = ???

    /** Creates a stream socket and connects it to the specified port
     *  number on the named host.
     */
    @stub
    def this(host: String, port: Int) = ???

    /** Deprecated. 
     * Use DatagramSocket instead for UDP transport.
     * 
     */
    @stub
    def this(host: String, port: Int, stream: Boolean) = ???

    /** Binds the socket to a local address. */
    @stub
    def bind(bindpoint: SocketAddress): Unit = ???

    /** Closes this socket. */
    @stub
    def close(): Unit = ???

    /** Connects this socket to the server. */
    @stub
    def connect(endpoint: SocketAddress): Unit = ???

    /** Connects this socket to the server with a specified timeout value. */
    @stub
    def connect(endpoint: SocketAddress, timeout: Int): Unit = ???

    /** Returns the unique SocketChannel
     *  object associated with this socket, if any.
     */
    @stub
    def getChannel(): SocketChannel = ???

    /** Returns the address to which the socket is connected. */
    @stub
    def getInetAddress(): InetAddress = ???

    /** Returns an input stream for this socket. */
    @stub
    def getInputStream(): InputStream = ???

    /** Tests if SO_KEEPALIVE is enabled. */
    @stub
    def getKeepAlive(): Boolean = ???

    /** Gets the local address to which the socket is bound. */
    @stub
    def getLocalAddress(): InetAddress = ???

    /** Returns the local port number to which this socket is bound. */
    @stub
    def getLocalPort(): Int = ???

    /** Returns the address of the endpoint this socket is bound to. */
    @stub
    def getLocalSocketAddress(): SocketAddress = ???

    /** Tests if SO_OOBINLINE is enabled. */
    @stub
    def getOOBInline(): Boolean = ???

    /** Returns an output stream for this socket. */
    @stub
    def getOutputStream(): OutputStream = ???

    /** Returns the remote port number to which this socket is connected. */
    @stub
    def getPort(): Int = ???

    /** Gets the value of the SO_RCVBUF option
     *  for this Socket, that is the buffer size used by the platform
     *  for input on this Socket.
     */
    @stub
    def getReceiveBufferSize(): Int = ???

    /** Returns the address of the endpoint this socket is connected to, or
     *  null if it is unconnected.
     */
    @stub
    def getRemoteSocketAddress(): SocketAddress = ???

    /** Tests if SO_REUSEADDR is enabled. */
    @stub
    def getReuseAddress(): Boolean = ???

    /** Get value of the SO_SNDBUF option
     *  for this Socket, that is the buffer size used by the platform
     *  for output on this Socket.
     */
    @stub
    def getSendBufferSize(): Int = ???

    /** Returns setting for SO_LINGER. */
    @stub
    def getSoLinger(): Int = ???

    /** Returns setting for SO_TIMEOUT. */
    @stub
    def getSoTimeout(): Int = ???

    /** Tests if TCP_NODELAY is enabled. */
    @stub
    def getTcpNoDelay(): Boolean = ???

    /** Gets traffic class or type-of-service in the IP header
     *  for packets sent from this Socket
     */
    @stub
    def getTrafficClass(): Int = ???

    /** Returns the binding state of the socket. */
    @stub
    def isBound(): Boolean = ???

    /** Returns the closed state of the socket. */
    @stub
    def isClosed(): Boolean = ???

    /** Returns the connection state of the socket. */
    @stub
    def isConnected(): Boolean = ???

    /** Returns whether the read-half of the socket connection is closed. */
    @stub
    def isInputShutdown(): Boolean = ???

    /** Returns whether the write-half of the socket connection is closed. */
    @stub
    def isOutputShutdown(): Boolean = ???

    /** Send one byte of urgent data on the socket. */
    @stub
    def sendUrgentData(data: Int): Unit = ???

    /** Enable/disable SO_KEEPALIVE. */
    @stub
    def setKeepAlive(on: Boolean): Unit = ???

    /** Enable/disable SO_OOBINLINE
     *  (receipt of TCP urgent data)
     * 
     *  By default, this option is disabled and TCP urgent data received on a
     *  socket is silently discarded.
     */
    @stub
    def setOOBInline(on: Boolean): Unit = ???

    /** Sets performance preferences for this socket. */
    @stub
    def setPerformancePreferences(connectionTime: Int, latency: Int, bandwidth: Int): Unit = ???

    /** Sets the SO_RCVBUF option to the
     *  specified value for this Socket.
     */
    @stub
    def setReceiveBufferSize(size: Int): Unit = ???

    /** Enable/disable the SO_REUSEADDR
     *  socket option.
     */
    @stub
    def setReuseAddress(on: Boolean): Unit = ???

    /** Sets the SO_SNDBUF option to the
     *  specified value for this Socket.
     */
    @stub
    def setSendBufferSize(size: Int): Unit = ???

    /** Enable/disable SO_LINGER with the
     *  specified linger time in seconds.
     */
    @stub
    def setSoLinger(on: Boolean, linger: Int): Unit = ???

    /** Enable/disable SO_TIMEOUT
     *   with the specified timeout, in milliseconds.
     */
    @stub
    def setSoTimeout(timeout: Int): Unit = ???

    /** Enable/disable TCP_NODELAY
     *  (disable/enable Nagle's algorithm).
     */
    @stub
    def setTcpNoDelay(on: Boolean): Unit = ???

    /** Sets traffic class or type-of-service octet in the IP
     *  header for packets sent from this Socket.
     */
    @stub
    def setTrafficClass(tc: Int): Unit = ???

    /** Places the input stream for this socket at "end of stream". */
    @stub
    def shutdownInput(): Unit = ???

    /** Disables the output stream for this socket. */
    @stub
    def shutdownOutput(): Unit = ???
}

object Socket {
    /** Sets the client socket implementation factory for the
     *  application.
     */
    @stub
    def setSocketImplFactory(fac: SocketImplFactory): Unit = ???
}
